/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rda {
    static sna field_a;
    static byte[] field_b;

    final static void a(byte param0, int param1, int param2, sga param3, int param4, ema param5, int param6) {
        ik var12 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        mna.a(-1, (int[]) null, param5.field_Eb, param5.field_Nb, param5.field_Hb, -1, param0 - 7, param3, param5);
        ms.field_u.a(param0 + 220, true);
        ms.field_u.a((int[]) null, (byte) -117, 0);
        ms.field_u.a(21654);
        if (param0 != -104) {
          return;
        }
        try {
          var12 = ms.field_u;
          var8 = param6;
          var9 = param4;
          var10 = param2;
          var11 = param1;
          var12.field_a.a(var10, false, var8, var11, var9);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "rda.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ')');
        }
    }

    final static void a(int param0, boolean param1, boolean param2) {
        if (param2) {
          dg.f(0, 0, dg.field_i, dg.field_c, 0, 192);
          pja.a((byte) 111, param2);
          if (param0 != 0) {
            rda.a(125, false, true);
            return;
          }
          return;
        }
        dg.d();
        pja.a((byte) 111, param2);
        if (param0 != 0) {
          rda.a(125, false, true);
          return;
        }
    }

    final static void a(int param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = BachelorFridge.field_y;
        var2 = 0;
        var3 = ur.field_d;
        if (5 > var3) {
          var2 = 8192 * var3 * var3 / 1100;
          var4 = 1;
          var5 = 0;
          if (param0 == 1) {
            var5 = 1;
          }
          if (param0 == 3) {
            var4 = -1;
          }
          if (4 == param0) {
            var4 = 1;
            var5 = 1;
          }
          if (5 == param0) {
            var4 = -1;
            var5 = 1;
          }
          if (param0 == 6) {
            var5 = -1;
            var4 = 1;
          }
          if (param0 == 7) {
            var4 = -1;
            var5 = -1;
          } else {
            if (param0 == 8) {
              var4 = -1;
              var5 = -1;
            }
          }
          if (param0 == 11) {
            var4 = -1;
          }
          if (param0 == 12) {
            var5 = -1;
            var4 = -1;
          }
          if (param0 == 13) {
            var5 = -1;
            var4 = 1;
          }
          if (param0 == 14) {
            var4 = -1;
            var5 = 1;
          }
          if (param1 != 11259) {
            return;
          }
          if (param0 == 15) {
            var5 = 1;
            var4 = 1;
          }
          dl.field_j = ek.a(var4 * var2, var5 * var2, false);
          return;
        }
        if (var3 < 105) {
          var2 = (var3 * 16384 - 40960) / 220;
        } else {
          if (var3 < 120) {
            var3 = -var3 + 120;
            var2 = -(8192 * var3 * var3 / 3300) + 8192;
          }
        }
        var4Lifetime1 = 1;
        var5Lifetime1 = 0;
        if (param0 == 1) {
          var5Lifetime1 = 1;
        }
        if (param0 == 3) {
          var4Lifetime1 = -1;
        }
        if (4 == param0) {
          var4Lifetime1 = 1;
          var5Lifetime1 = 1;
        }
        if (5 == param0) {
          var4Lifetime1 = -1;
          var5Lifetime1 = 1;
        }
        if (param0 == 6) {
          var5Lifetime1 = -1;
          var4Lifetime1 = 1;
        }
        if (param0 == 7) {
          var4Lifetime1 = -1;
          var5Lifetime1 = -1;
        } else {
          if (param0 == 8) {
            var4Lifetime1 = -1;
            var5Lifetime1 = -1;
          }
        }
        if (param0 == 11) {
          var4Lifetime1 = -1;
        }
        if (param0 == 12) {
          var5Lifetime1 = -1;
          var4Lifetime1 = -1;
        }
        if (param0 == 13) {
          var5Lifetime1 = -1;
          var4Lifetime1 = 1;
        }
        if (param0 == 14) {
          var4Lifetime1 = -1;
          var5Lifetime1 = 1;
        }
        if (param1 != 11259) {
          return;
        }
        if (param0 == 15) {
          var5Lifetime1 = 1;
          var4Lifetime1 = 1;
        }
        dl.field_j = ek.a(var4Lifetime1 * var2, var5Lifetime1 * var2, false);
    }

    public static void a(boolean param0) {
        if (!param0) {
          field_b = (byte[]) null;
          field_a = null;
          field_b = null;
          return;
        }
        field_a = null;
        field_b = null;
    }

    static {
        field_b = new byte[520];
    }
}
