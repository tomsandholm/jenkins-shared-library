// vars/lib/dco_tag.groovy

def call() {
  script {
    sh """
      echo -n "DCO_TAG " 
      cat ./dco-tag
    """
  }
}
