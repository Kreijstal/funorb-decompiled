/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql {
    static int field_a;
    static String field_e;
    static qb field_c;
    static int[] field_b;
    private String field_d;

    final static void a(jg param0, byte param1) {
        int var2_int = 0;
        jg var3 = null;
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        if (null == param0.field_e) {
          return;
        }
        if (param0.field_d != 0 ||
          param0.field_k != 0) {
          for (var2_int = 0; gb.field_f > var2_int; var2_int++) {
            var3 = g.field_d[var2_int];
            if (var3.field_m == 2 &&
              (var3.field_d == param0.field_d && param0.field_k == var3.field_k)) {
              return;
            }
          }
        }
        if (param1 < 74) {
          return;
        }
        try {
          if (param0.field_f != null) {
            fo.field_h = param0.field_h;
            ao.field_e = param0.field_f;
            gd.field_rb = param0.field_m;
            of.field_c = param0.field_n;
          }
          vd.a(param0, (byte) -74);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "ql.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, int param2) {
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        qb var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var9Lifetime2;
        var13 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (de.field_e != 0 &&
            de.field_j != 0) {
            if (640 >= param0) {
              stackIn_10_0 = (param1 > 480) ? 1 : 0;
            } else {
              stackIn_10_0 = 1;
            }
            var3_int = stackIn_10_0;
            var4 = 2949191;
            var5 = 4325449;
            var6 = sm.field_d;
            var7 = var6.field_A.length;
            if (var3_int == 0) {
              de.c(0, 0, 640, 480, var4, var5);
            } else {
              var8 = uc.field_a + 480;
              if (uc.field_a > 1) {
                var9 = gf.a((uc.field_a * 1024 + 491520) / 480, (byte) 16, var5, var4);
                de.c(0, 0, param0 / 2, uc.field_a / 2, var9, var4);
              }
              de.c(0, uc.field_a / 2, param0 / 2, 240, var4, var5);
              if (param1 - var8 > 1) {
                var9Lifetime2 = gf.a((491520 + (param1 - var8) * 1024) / 480, (byte) 14, var4, var5);
                de.c(0, var8 / 2, param0 / 2, (param1 - var8) / 2, var5, var9Lifetime2);
              }
            }
            var8Lifetime1 = param2;
            var9Lifetime1 = 0;
            if (param0 > 640) {
              var8Lifetime1 = (-639 + param0) / 2;
              var8Lifetime1 = var8Lifetime1 % var7;
              if (0 < var8Lifetime1) {
                var8Lifetime1 = var8Lifetime1 - var7;
              }
            }
            if (480 < param1) {
              var9Lifetime1 = (param1 - 480 + 1) / 2;
              var9Lifetime1 = var9Lifetime1 % var7;
              if (var9Lifetime1 > 0) {
                var9Lifetime1 = var9Lifetime1 - var7;
              }
            }
            if (var3_int == 0) {
              for (var10 = var9Lifetime1; param1 > var10; var10++) {
                var11 = (-var9Lifetime1 + var10) % var6.field_y * var6.field_q;
                var11 = dh.a(var11, true, var6.field_A.length);
                for (var12 = var8Lifetime1; param0 > var12; var12++) {
                  de.g(var12, var10, 6035051, -(var6.field_A[var11] & 255) + 255 >> 2);
                  var11++;
                  if (var11 >= var6.field_A.length) {
                    var11 = 0;
                  }
                }
              }
              return;
            }
            for (var10Lifetime1 = var9Lifetime1; var10Lifetime1 < param1; var10Lifetime1 += 2) {
              var11Lifetime1 = var6.field_q * ((-var9Lifetime1 + var10Lifetime1) % var6.field_y);
              var11Lifetime1 = dh.a(var11Lifetime1, true, var6.field_A.length);
              for (var12Lifetime1 = var8Lifetime1; param0 > var12Lifetime1; var12Lifetime1 += 2) {
                de.g(var12Lifetime1 / 2, var10Lifetime1 / 2, 6035051, -(var6.field_A[var11Lifetime1] & 255) + 255 >> 2);
                var11Lifetime1++;
                if (var11Lifetime1 >= var6.field_A.length) {
                  var11Lifetime1 = 0;
                }
                var11Lifetime1++;
                if (var6.field_A.length <= var11Lifetime1) {
                  var11Lifetime1 = 0;
                }
              }
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "ql.H(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 >= -61) {
          return;
        }
        field_b = null;
        field_c = null;
        field_e = null;
    }

    final static kc a(int param0) {
        if (param0 != 1) {
          return (kc) null;
        }
        return mc.a((byte) 21);
    }

    final static qb[] a(int param0, byte param1, int param2, int param3) {
        int var5 = 0;
        int var6 = ArcanistsMulti.field_G ? 1 : 0;
        qb[] var7 = new qb[9];
        qb[] var4 = var7;
        var7[0] = ce.b(param0, param3, 21385);
        if (param1 < 69) {
          return (qb[]) null;
        }
        for (var5 = 1; var5 < 9; var5++) {
          var7[var5] = var7[0];
        }
        var4[4] = ce.b(64, param2, 21385);
        return var4;
    }

    final void a(java.applet.Applet param0, byte param1) {
        try {
          if (param1 > -3) {
            field_a = 59;
          }
          sm.a(31536000L, "jagex-last-login-method", param0, -15367, this.field_d);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "ql.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(String param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= -10) {
            stackIn_4_0 = this.field_d.equals(param0);
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ql.I(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (de.field_j >= param2 + (param1 + param3)) {
          return param3 + param1;
        }
        if (param0 != 10) {
          field_e = (String) null;
        }
        if (param3 - param2 >= 0) {
          return param3 - param2;
        }
        return de.field_j - param2;
    }

    ql(String param0) {
        try {
          this.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "ql.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0) {
        ah.field_b = df.field_z.l(-1);
        CharSequence var2 = (CharSequence) ((Object) ah.field_b);
        nm.field_b = gk.a(var2, -13);
        if (!param0) {
          field_b = (int[]) null;
        }
    }

    static {
        field_b = new int[]{2, 20, 21, 6, 5, 10, 11, 13};
        field_e = "Searching for an opponent";
    }
}
