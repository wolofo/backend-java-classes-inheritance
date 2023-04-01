class VisaCard extends CreditCard {

        public VisaCard(int debt) {
            super(debt);
        }
    @Override
    public void pay(int amount) {
        super.pay((int)(amount * 0.9));

    }
    }

