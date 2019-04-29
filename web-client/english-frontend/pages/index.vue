<template>
  <v-layout>
    <v-flex xs1 sm2 md2>

    </v-flex>
    <v-flex xs11 sm8 md8>
      <lessons></lessons>
      <!-- <v-card>
        <v-layout row wrap>
          <v-btn fab dark large color="purple">
              <v-icon dark>
                music_note
              </v-icon>
            </v-btn>
            <v-spacer></v-spacer>
          <v-flex xs4 class="mt-5">
            <v-card color="white">
              <v-card-title>
                <v-img src="https://cdn.vuetifyjs.com/images/cards/docks.jpg"></v-img>
              </v-card-title>
              <v-card-text class="black--text text-xs-center title">
                Beautiful frame
                <br>

              </v-card-text>
            </v-card>
            <div class="text-xs-center">
              <v-btn class="title" color="#efc004" round>TIẾP TỤC</v-btn>
            </div>
          </v-flex>
          <v-spacer></v-spacer>
          <v-btn fab dark large color="purple">
              <v-icon dark>
                tune
              </v-icon>
            </v-btn>

        </v-layout>

      </v-card> -->
    </v-flex>


    <v-flex xs1 sm2 md2>
      <v-layout row wrap>
        <v-flex xs12>
          <v-card>
            <v-card-title class="justify-center subheading">
              Lesson 1 : Hello world
            </v-card-title>
            <div class="text-xs-center">
              <v-avatar size="120px">
                <v-img src="https://cdn.vuetifyjs.com/images/cards/docks.jpg"></v-img>
              </v-avatar>
            </div>
            <v-card-actions class="justify-center">
              <v-btn color="primary">HỌC 99 CHỦ ĐỀ KHÁC</v-btn>
            </v-card-actions>
          </v-card>
    
        </v-flex>
        <v-flex xs12>
          <v-card>
            <v-card-title class="justify-center subheading">
              Lesson 1 : Hello world
            </v-card-title>
            <div class="text-xs-center">
              <v-avatar size="120px">
                <v-img src="https://cdn.vuetifyjs.com/images/cards/docks.jpg"></v-img>
              </v-avatar>
            </div>
            <v-card-actions class="justify-center">
              <v-btn color="secondary">THÁCH ĐẤU</v-btn>
            </v-card-actions>
          </v-card>
          <v-card>

          </v-card>
        </v-flex>
      </v-layout>
    </v-flex>
  </v-layout>
</template>

<script>
  import Logo from '~/components/Logo.vue'
  import VuetifyLogo from '~/components/VuetifyLogo.vue'
  import axios from 'axios'
  import Vuex from 'vuex'
  import Lessons from '~/components/Lessons.vue' //list all lessons
  import {
    mapMutations
  } from 'vuex'
  export default {
    
    components: {
      Logo,
      VuetifyLogo,
      Lessons
    },
    data: function () {
      return {

      }
    },

    methods: {
     
    },
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
    mounted() {
      axios.get(`http://localhost:8080/lessons`).then(response => {
        this.Lessons = response.data;

        // console.log(this.Lessons);
      })
    }
  
  }

</script>
