<template>
  <v-card class="scroll" height="700">
    <!-- <v-layout row wrap> -->
    <v-card-title class="title">
      <div class="body-1 text-xs-left">
        <v-icon small>arrow_left</v-icon> Quay lại
      </div>
      <div>

      </div>
      <v-spacer></v-spacer>
      <div>
        CHỌN CHỦ ĐỀ
      </div>
      <v-spacer></v-spacer>
    </v-card-title>
    <v-card-text>

      <v-layout row wrap>
        <template v-for="lesson in Lessons">
          <v-flex xs6 sm4 md4>
            <v-hover>
              <v-card slot-scope="{ hover }" @click="showVocabularyInLesson(lesson.id)" max-height="250px"
                :class="`elevation-${hover ? 12 : 2} ma-2`">
                <div class="text-xs-center">
                  <v-progress-circular class="mt-2" :width="5" :rotate="-90" color="deep-orange lighten-2" :size="145"
                    :value="getValueHasLearnedInLesson()">
                    <v-avatar size="130px">
                      <v-img src="https://demo.cloudimg.io/width/600/n/https://scaleflex.ultrafast.io/https://jolipage.airstore.io/img.jpg
                    "></v-img>
                    </v-avatar>
                  </v-progress-circular>
                </div>
                <v-container fluid>
                  <v-checkbox disabled color="blue" :label="`Lesson ${lesson.id}: ${lesson.lessonName}`"></v-checkbox>
                </v-container>
              </v-card>
            </v-hover>
          </v-flex>
        </template>
      </v-layout>
    </v-card-text>
    <!-- </v-layout> -->
  </v-card>

</template>

<script>
  import axios from 'axios'
  export default {
    computed: {
      Lessons: {
        get() {
          return this.$store.state.englishpage.Lessons;
        },
        set(value) {
          this.$store.commit('englishpage/setLessons', value);
        }
      }
    },
    methods: {
      getValueHasLearnedInLesson() {
        return 80;
      },
      showVocabularyInLesson(lessonID) {
        console.log(lessonID);
        this.$router.push({
          path: 'vocabularies-in-lesson',
          query: {
            id: lessonID
          }
        })
      }
    },

    mounted() {
      axios.get(`http://localhost:8080/lessons`).then(response => {
        this.Lessons = response.data;
      })

    }
  }

</script>

<style scoped>
  .scroll {
    overflow-y: auto;
  }

</style>
