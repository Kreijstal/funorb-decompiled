/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qfa {
    static String field_a;

    final static void a(int param0) {
        BoxBlurOperator.field_o = false;
        if (param0 >= -75) {
          field_a = (String) null;
        }
    }

    public static void releaseStatics(boolean param0) {
        if (!param0) {
          field_a = (String) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static void a(byte param0) {
        TeleportState.field_b = new AccountRegistrationPanel();
        if (param0 == 6) {
          um.field_l.a(103, TeleportState.field_b);
          return;
        }
        qfa.a((byte) -122);
        um.field_l.a(103, TeleportState.field_b);
    }

    final static void a(int param0, int param1) {
        mp.a(param1 - 20813, param0);
        if (param1 != 20815) {
          qfa.a(61, 98);
        }
    }

    static {
        field_a = "Next: Learn more about the temples' items and traps!";
    }
}
