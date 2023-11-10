def call(){
  checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/bharah08/Train-Ticket-Reservation-System.git']])
}
