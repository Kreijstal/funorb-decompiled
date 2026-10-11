/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ds {
    static boolean[][] field_h;
    static hh field_d;
    static int field_c;
    static hd[] field_a;
    static String field_e;
    static String field_b;
    static boolean field_g;
    static String field_f;

    final static gf[] a(ml param0, byte param1) {
        int var5 = 0;
        gf[] stackIn_6_0 = null;
        gf[] stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        gf[] var4 = null;
        gf var6 = null;
        int var6_int = 0;
        int var7 = 0;
        var7 = Kickabout.field_G;
        try {
          var2_int = param0.l(8, 59);
          if (0 < var2_int) {
            return null;
          }
          var3 = param0.l(12, 59);
          var4 = new gf[var3];
          if (param1 != -4) {
            stackIn_6_0 = (gf[]) null;
            return stackIn_6_0;
          }
          for (var5 = 0; var3 > var5; var5++) {
            if (mu.a(param0, (byte) -39)) {
              var6 = new gf();
              param0.l(24, param1 ^ -57);
              param0.l(24, 59);
              var6.field_g = param0.l(24, 59);
              param0.l(9, 59);
              param0.l(12, param1 ^ -57);
              param0.l(12, 59);
              param0.l(12, 59);
              var4[var5] = var6;
            } else {
              var6_int = param0.l(kb.a(-1 + var5, false), param1 ^ -57);
              var4[var5] = var4[var6_int];
            }
          }
          stackIn_15_0 = var4;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_18_0 = var2;
          stackIn_18_1 = new StringBuilder().append("ds.B(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, bb param1) {
        try {
          qa.field_E.a((byte) -128, (hd) (param1));
          if (param0 != -1) {
            field_c = -45;
          }
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "ds.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_h = (boolean[][]) null;
        field_f = null;
        field_a = null;
        field_d = null;
        field_e = null;
        field_b = null;
        if (param0 >= -3) {
          field_f = (String) null;
        }
    }

    final static int a(int param0, int param1) {
        if (param1 == param0) {
          return 2;
        }
        if (8 == param0) {
          return 2;
        }
        if (11 == param0) {
          return 1;
        }
        if (param0 == 18) {
          return 1;
        }
        if (param0 == 19) {
          return 1;
        }
        if (param0 == 32) {
          return 1;
        }
        if (37 == param0) {
          return 1;
        }
        if (24 == param0) {
          return 1;
        }
        if (param0 == 25) {
          return 1;
        }
        if (param0 == 23) {
          return 0;
        }
        if (param0 == 29) {
          return 1;
        }
        if (34 == param0) {
          return 1;
        }
        if (param0 == 30) {
          return 1;
        }
        if (21 == param0) {
          return 0;
        }
        if (20 == param0) {
          return 1;
        }
        return 0;
    }

    static {
        field_d = new hh();
        field_c = 225;
        field_e = "Send private message";
        field_g = false;
        field_f = "Click to Spectate";
    }
}
