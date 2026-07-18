/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb {
    private String field_a;
    int field_c;
    static int field_b;
    static int field_k;
    static String field_g;
    static wc field_i;
    to field_l;
    static int[] field_e;
    static ut[] field_j;
    boolean field_d;
    static String field_h;
    static boolean field_f;

    final static int a(nl param0) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            stackOut_2_0 = 170 + -(param0.field_o * 8);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("nb.G(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + 170 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(boolean param0) {
        field_h = null;
        field_i = null;
        field_g = null;
        field_e = null;
        field_j = null;
    }

    final boolean b(int param0) {
        if (sr.field_h.a(false, ((nb) this).field_a)) {
          if (param0 != 32) {
            return true;
          } else {
            ((nb) this).field_l = tg.a(sr.field_h, ((nb) this).field_a, "").c();
            ((nb) this).field_d = true;
            return true;
          }
        } else {
          return false;
        }
    }

    final static boolean a(int param0) {
        if (param0 != 64) {
            return false;
        }
        return da.field_h.a(false) > 0 ? true : false;
    }

    final static void a() {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Kickabout.field_G;
        try {
          L0: {
            ue.field_f = new vs[64];
            var1_int = 0;
            var2 = 0;
            L1: while (true) {
              if (ue.field_f.length <= var1_int) {
                break L0;
              } else {
                ue.field_f[var1_int] = new vs();
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "nb.A(" + -94 + ')');
        }
    }

    final static int b(byte param0) {
        int var1 = 47 / ((49 - param0) / 51);
        return (int)(1000000000L / no.field_H);
    }

    final static bs a(Throwable param0, String param1) {
        bs var2 = null;
        if (param0 instanceof bs) {
            var2 = (bs) (Object) param0;
            var2.field_d = var2.field_d + ' ' + param1;
        } else {
            var2 = new bs(param0, param1);
        }
        return var2;
    }

    nb(int param0, int param1, String param2) {
        ((nb) this).field_l = null;
        ((nb) this).field_d = false;
        try {
            ((nb) this).field_a = param2;
            ((nb) this).field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "nb.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    nb(to param0) {
        ((nb) this).field_l = null;
        ((nb) this).field_d = false;
        try {
            ((nb) this).field_d = true;
            ((nb) this).field_l = param0;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "nb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[16384];
        field_g = "Unfortunately you are not eligible to create an account.";
        field_h = "Management";
        field_f = true;
    }
}
