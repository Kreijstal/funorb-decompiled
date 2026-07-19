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

    final static int a(nl param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 == 170) {
              stackOut_3_0 = 170 + -(param0.field_o * 8);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = -67;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("nb.G(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_h = null;
        field_i = null;
        field_g = null;
        field_e = null;
        field_j = null;
    }

    final boolean b(int param0) {
        if (sr.field_h.a(false, this.field_a)) {
          if (param0 != 32) {
            return true;
          } else {
            this.field_l = tg.a(sr.field_h, this.field_a, "").c();
            this.field_d = true;
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
        return -1 > (da.field_h.a(false) ^ -1) ? true : false;
    }

    final static void a(byte param0) {
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
            var2 = 74 % ((-30 - param0) / 62);
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
          throw nb.a((Throwable) ((Object) var1), "nb.A(" + param0 + ')');
        }
    }

    final static int b(byte param0) {
        int var1 = 47 / ((49 - param0) / 51);
        return (int)(1000000000L / no.field_H);
    }

    final static bs a(Throwable param0, String param1) {
        bs var2 = null;
        if (param0 instanceof bs) {
            var2 = (bs) ((Object) param0);
            var2.field_d = var2.field_d + ' ' + param1;
        } else {
            var2 = new bs(param0, param1);
        }
        return var2;
    }

    nb(int param0, int param1, String param2) {
        this.field_l = null;
        this.field_d = false;
        try {
            this.field_a = param2;
            this.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "nb.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    nb(to param0) {
        this.field_l = null;
        this.field_d = false;
        try {
            this.field_d = true;
            this.field_l = param0;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "nb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = new int[16384];
        field_g = "Unfortunately you are not eligible to create an account.";
        field_h = "Management";
        field_f = true;
    }
}
