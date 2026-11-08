/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ok {
    static p[] field_b;
    static int field_a;
    static String field_e;
    static String field_c;
    static float field_d;

    public static void releaseStatics(int param0) {
        field_b = null;
        if (param0 != 4) {
          return;
        }
        field_e = null;
        field_c = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static Sprite[] createCentreOnlyFrame(Sprite param0, byte param1) {
        Sprite[] var2 = null;
        RuntimeException var2_ref = null;
        Sprite[] var3 = null;
        Sprite[] stackIn_2_0 = null;
        Sprite[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 21) {
            stackIn_2_0 = (Sprite[]) null;
            return stackIn_2_0;
          }
          var3 = new Sprite[9];
          var2 = var3;
          var3[4] = param0;
          stackIn_4_0 = var2;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_7_0 = var2_ref;
          stackIn_7_1 = new StringBuilder().append("ok.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw oi.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_a = 200;
        field_e = "Real-life threats";
        field_c = "Invite players";
    }
}
