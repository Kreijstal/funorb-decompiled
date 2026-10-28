/*
 * Decompiled by CFR-JS 0.4.0.
 */
class cd extends DualLinkNode {
    static long field_t;
    static int[] field_q;
    static String field_r;
    static IntrusiveDeque field_s;
    static String field_u;
    static int field_v;

    cd() {
    }

    public static void releaseStatics(int guard) {
        field_r = null;
        field_s = null;
        field_q = null;
        if (guard != -1) {
          field_q = (int[]) null;
          field_u = null;
          return;
        }
        field_u = null;
    }

    final static EmailValidationError a(int param0, String param1) {
        String stackIn_18_2 = null;
        try {
          if (param1 != null &&
            param1.length() != 0) {
            int var2_int = param1.indexOf('@');
            if (param0 == var2_int) {
              EmailValidationError stackIn_8_0 = ResourceArchive.field_d;
              return stackIn_8_0;
            }
            String var3 = param1.substring(0, var2_int);
            String var4 = param1.substring(1 + var2_int);
            EmailValidationError var5 = sf.a(var3, (byte) 119);
            if (var5 != null) {
              EmailValidationError stackIn_12_0 = var5;
              return stackIn_12_0;
            }
            EmailValidationError stackIn_14_0 = ClientException.a(var4, ~param0);
            return stackIn_14_0;
          }
          EmailValidationError stackIn_4_0 = ig.field_g;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_17_0 = var2;
          StringBuilder stackIn_17_1 = new StringBuilder().append("cd.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    static {
        field_r = "Waiting for levels";
        field_u = "The account name you use to access RuneScape and other Jagex.com games";
        field_s = new IntrusiveDeque();
        field_v = -1;
    }
}
