<template>
  <v-card class="scroll" height="700">
    <v-layout row wrap>
      <v-flex xs3>
        <v-btn icon large>
          <v-icon large>
            access_time
          </v-icon>
        </v-btn>
      </v-flex>
      <v-flex xs6>
        <div class="text-xs-center">
          <v-card class="ma-5">
            <!-- <v-card-title class="justify-center subheading">
              Lesson 1 : Hello world
            </v-card-title> -->
            <div class="text-xs-center pa-4">

              <v-img src="https://cdn.vuetifyjs.com/images/cards/docks.jpg"></v-img>

            </div>
            <v-card-text>
              circle
            </v-card-text>
          </v-card>
          <div class="headline font-weight-thin" font-weight="10">
            Ấn [dấu cách] để lật card
          </div>
          <div>
            <v-btn round>
              TIẾP TỤC
            </v-btn>
          </div>
        </div>

      </v-flex>
      <v-flex xs3>
        <div class="text-xs-right">
          <v-btn icon large>
            <v-icon large>
              access_time
            </v-icon>
          </v-btn>
        </div>
      </v-flex>
    </v-layout>
  </v-card>
</template>

<script>
  import axios from 'axios'
  export default {
    data: function () {
      return {
        lessonID: null
      }
    },

    computed: {
      vocabulariesInLesson: {
        get() {
          return this.$store.state.englishpage.ListVocabularyInLesson;
        },
        set(value) {
          this.$store.commit('englishpage/setListVocabularyInLesson', value);
        }
      }
    },

    mounted() {
      this.lessonID = this.$route.query.id;
      console.log(this.lessonID)
      axios.get(`http://localhost:8080/vocabularies/` + this.lessonID)
        .then(response => {
          this.vocabulariesInLesson = response.data;
          console.log(this.vocabulariesInLesson);
        })
    }
  }

</script>

<style scoped>

</style>
