<template>
  <v-layout>
    <v-flex xs1 sm2 md2>

    </v-flex>
    <v-flex xs11 sm8 md8>
      <v-parallax src="https://cdn.vuetifyjs.com/images/backgrounds/vbanner.jpg">
        <v-layout row wrap>
          <v-flex xs4 class="text-xs-left">
            <v-btn fab dark large color="purple">
              <v-icon dark>
                music_note
              </v-icon>
            </v-btn>
          </v-flex>
          <v-flex xs4 class="mt-5">
            <v-card color="white">
              <v-card-title>
                <v-img src="https://cdn.vuetifyjs.com/images/cards/docks.jpg"></v-img>
              </v-card-title>
              <v-card-text class="black--text text-xs-center title">
                Beautiful frame
                <br>

              </v-card-text>
              <!-- <v-card-title class="black--text">abcde</v-card-title> -->
            </v-card>
            <div class="text-xs-center">
              <v-btn class="title" color="#efc004" round>TIẾP TỤC</v-btn>
            </div>
          </v-flex>


          <v-flex xs4 class="text-xs-right">
            <v-btn fab dark large color="purple">
              <v-icon dark>
                tune
              </v-icon>
            </v-btn>
          </v-flex>
        </v-layout>

      </v-parallax>
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
              <v-btn>HỌC 99 CHỦ ĐỀ KHÁC</v-btn>
            </v-card-actions>
          </v-card>
          <v-card>

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
              <v-btn>THÁCH ĐẤU</v-btn>
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
  export default {
    components: {
      Logo,
      VuetifyLogo
    },
    mounted() {
      console.log("asdasdasdasd");
      axios.get(`http://localhost:8080/employees`).then(response => {
        console.log(JSON.stringify(response.data));
      })
    }
  }

</script>
