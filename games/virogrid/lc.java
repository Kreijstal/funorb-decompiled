/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc {
    static String field_d;
    static mg[] field_c;
    static String[] field_e;
    static jc field_b;
    static String field_h;
    int field_g;
    static String field_f;
    int field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_e = null;
        field_b = null;
        field_c = null;
        field_d = null;
        field_h = null;
        if (param0 == -26834) {
          field_f = null;
          return;
        }
        lc.a(57);
        field_f = null;
    }

    final static ck a(int param0, String param1, int param2) {
        ck var3 = null;
        RuntimeException var3_ref = null;
        ck stackIn_2_0 = null;
        ck stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 29493) {
            stackIn_2_0 = (ck) null;
            return stackIn_2_0;
          }
          var3 = new ck(false);
          var3.field_e = param1;
          var3.field_g = param0;
          stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("lc.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    lc(int param0, int param1, int param2, int param3) {
        this.field_a = param0;
        this.field_g = param3;
    }

    static {
        field_d = "<%0> is already on your ignore list.";
        field_h = "Invite players";
        field_f = "Enter name of player to delete from list";
    }
}
