// vars/lib/dco_tag.groovy

def call() {
  script {
    sh """
      echo "DCO_TAG  ${env.DCO_TAG}"
    """
  }
}
