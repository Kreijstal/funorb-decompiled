/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w {
    static cj field_c;
    static le[] field_b;
    static String field_a;

    final static void a(int param0, int param1, int param2, int param3) {
        ki.field_s = param0;
        lc.field_e = param2;
        qj.field_D = param1;
        if (param3 != -21734) {
          de var5 = (de) null;
          w.a(-62, 77, (de) null);
        }
    }

    final static void a(int param0, int param1, de param2) {
        hb var3 = null;
        try {
          var3 = gf.field_c;
          var3.b(true, param1);
          if (param0 > -69) {
            field_b = (le[]) null;
          }
          var3.b(5, -49152);
          var3.b(0, -49152);
          var3.c(param2.field_k, 85);
          var3.b(param2.field_h, -49152);
          var3.b(param2.field_e, -49152);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "w.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 >= -8) {
          field_b = (le[]) null;
          field_c = null;
          return;
        }
        field_c = null;
    }

    final static void a(byte param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
        int var11 = 0;
        int incrementValue$0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var14 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (param6 <= param3) {
            return;
          }
          if (1 + param3 >= param2) {
            return;
          }
          if (param3 + 5 < param2 &&
            param1 != param5) {
            var7_int = (param1 >> 1) + ((param5 >> 1) + (1 & (param1 & param5)));
            var8 = param3;
            var9 = param1;
            var10 = param5;
            for (var11 = param3; param2 > var11; var11++) {
              var12 = hl.field_f[var11];
              if (param4) {
                stackIn_26_0 = gi.field_e[var12];
              } else {
                stackIn_26_0 = cj.field_c[var12];
              }
              var13 = stackIn_26_0;
              if (var13 > var7_int) {
                hl.field_f[var11] = hl.field_f[var8];
                incrementValue$0 = var8;
                var8++;
                hl.field_f[incrementValue$0] = var12;
                if (var9 > var13) {
                  var9 = var13;
                }
              } else {
                if (var10 < var13) {
                  var10 = var13;
                }
              }
            }
            if (param0 >= -65) {
              w.a(-28, 119);
            }
            w.a((byte) -80, param1, var8, param3, param4, var9, param6);
            w.a((byte) -74, var10, param2, var8, param4, param5, param6);
            return;
          }
          for (var7_intLifetime1 = param2 - 1; var7_intLifetime1 > param3; var7_intLifetime1--) {
            for (var8Lifetime1 = param3; var7_intLifetime1 > var8Lifetime1; var8Lifetime1++) {
              var9Lifetime1 = hl.field_f[var8Lifetime1];
              var10Lifetime1 = hl.field_f[var8Lifetime1 + 1];
              if (e.a(param4, var10Lifetime1, var9Lifetime1, (byte) 126)) {
                hl.field_f[var8Lifetime1] = var10Lifetime1;
                hl.field_f[var8Lifetime1 + 1] = var9Lifetime1;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var7), "w.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static int a(int param0, byte[] param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -18694) {
            w.a(-3, 81, 26, 15);
          }
          stackIn_3_0 = rc.a(0, param0, 40, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("w.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        ol.field_e = param1;
        if (null != vl.field_h) {
          vl.field_h.a(ol.field_e * 80 / 256);
        }
        if (param0 == -1) {
          return;
        }
        w.a((byte) -106, -49, -97, -73, false, 7, -74);
    }

    static {
        field_a = "Checking";
    }
}
