// vars/lib/dco_tag.groovy

def call() {
  script {
    echo "DCO_TAG env: ${env.DCO_TAG}"
    sh """
      echo "DCO_TAG \$(cat ./dco-tag)"
    """
  }
}
