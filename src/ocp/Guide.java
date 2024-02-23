package ocp;

public class Guide {
    // Interface for bank service
    public interface BankService {
        long processTransaction(long amount, String accountNo);
    }

    // Implementation for deposit transaction
    public class DepositService implements BankService {
        @Override
        public long processTransaction(long amount, String accountNo) {
            // Deposit implementation
            return 0;
        }
    }

    // Implementation for withdrawal transaction
    public class WithdrawalService implements BankService {
        @Override
        public long processTransaction(long amount, String accountNo) {
            // Withdrawal implementation
            return 0;
        }
    }
}
