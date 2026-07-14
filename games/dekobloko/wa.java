/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa {
    static String field_b;
    static int field_c;
    static String field_e;
    static w field_a;
    static String field_f;
    static int[] field_d;

    final static ig a(int[] param0, w param1, byte param2, w param3, w param4) {
        int var5 = 0;
        String[] var6 = null;
        char[] var7 = null;
        ig[] var8 = null;
        int var9 = 0;
        int var10_int = 0;
        Exception var10 = null;
        me var11 = null;
        int var12 = 0;
        char[] var13 = null;
        char[] var14 = null;
        Throwable decompiledCaughtException = null;
        var12 = client.field_A ? 1 : 0;
        if (param2 == -127) {
          var5 = param0.length;
          var6 = new String[var5];
          var14 = new char[var5];
          var13 = var14;
          var7 = var13;
          var8 = new ig[var5];
          var9 = 49;
          try {
            var10_int = 0;
            L0: while (true) {
              if (var5 <= var10_int) {
                break L0;
              } else {
                var11 = wj.field_Qb.a(126, param0[var10_int]);
                var6[var10_int] = var11.f((byte) -92);
                var9 = (char)(var9 + 1);
                var7[var10_int] = (char)var9;
                var8[var10_int] = null;
                var10_int++;
                continue L0;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var10 = (Exception) (Object) decompiledCaughtException;
            return null;
          }
          return new ig(0L, param1, param3, param4, var8, param0, var6, var14);
        } else {
          return null;
        }
    }

    final static void a(int param0, int param1) {
        ff var2 = null;
        sb var2_ref = null;
        int var3 = 0;
        ff var4 = null;
        sb var5 = null;
        var3 = client.field_A ? 1 : 0;
        var4 = (ff) (Object) cd.field_c.c((byte) 119);
        var2 = (ff) (Object) cd.field_c.c((byte) 119);
        L0: while (true) {
          if (var4 == null) {
            if (param0 != 3) {
              return;
            } else {
              var5 = (sb) (Object) ef.field_S.c((byte) 80);
              var2_ref = (sb) (Object) ef.field_S.c((byte) 80);
              L1: while (true) {
                if (var5 == null) {
                  return;
                } else {
                  oi.a(param0 ^ -87, param1, var5);
                  var2_ref = (sb) (Object) ef.field_S.d(true);
                  continue L1;
                }
              }
            }
          } else {
            mc.a(true, var4, param1);
            var2 = (ff) (Object) cd.field_c.d(true);
            continue L0;
          }
        }
    }

    final static w a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, mm param12) {
        w var13 = null;
        Object var14 = null;
        var13 = new w(0L, (w) null);
        var13.field_lb = df.a(param9, 0, param6);
        var13.field_S = df.a(param3, 0, param1);
        var13.field_eb = df.a(param0, 0, param5);
        var13.field_Q = df.a(param4, param11 + 24447, param8);
        var13.field_Ab = df.a(param10, 0, param7);
        var13.field_G = param2;
        if (param11 != -24447) {
          var14 = null;
          ig discarded$2 = wa.a((int[]) null, (w) null, (byte) -92, (w) null, (w) null);
          var13.field_J = param12;
          return var13;
        } else {
          var13.field_J = param12;
          return var13;
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 18) {
          wa.a(-113, -90);
          field_a = null;
          field_d = null;
          field_f = null;
          field_e = null;
          return;
        } else {
          field_a = null;
          field_d = null;
          field_f = null;
          field_e = null;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var9 = client.field_A ? 1 : 0;
          if ((param6 ^ -1) > -81) {
            stackOut_2_0 = param6 / 20 * 18;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 54;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var7 = stackIn_3_0;
        var8 = 0;
        if ((param6 ^ -1) <= -61) {
          if ((param6 ^ -1) <= -81) {
            if (93 <= param6) {
              hk.a(param3 - 3, param2 + 36 - 3, 60, 60, 4, 65280, 100);
              cg.a(param5, 2, 6, param3, 1 + (72 + param2), 2, -2);
              cg.a(param5, 2, 12, param3, 1 + (param2 - -54), 2, param4);
              cg.a(param5, 2, 8, param3, 36 + (param2 + 1), 2, -1);
              cg.a(param5, 2, 1, param3 + 18, param2 + 72 - -1, 1, -2);
              fb.field_c[param5][2].c(param3 - -18, param2 + 36, 18, 18);
              fb.field_c[param5][2].c(param3 + 18, 54 + param2, 18, 18);
              fb.field_c[param5][2].c(param3 + 36, 72 + param2, 18, 18);
              fb.field_c[param5][2].c(36 + param3, var7 + (param2 + var8), 18, 18 - var8);
              return;
            } else {
              var8 = vl.a(23841, 80, ve.field_ic[1 + param6 - 80] * 18 + 40);
              cg.a(param5, 2, 6, param3, 1 + (72 + param2), 2, -2);
              cg.a(param5, 2, 12, param3, 1 + (param2 - -54), 2, param4);
              cg.a(param5, 2, 8, param3, 36 + (param2 + 1), 2, -1);
              cg.a(param5, 2, 1, param3 + 18, param2 + 72 - -1, 1, -2);
              fb.field_c[param5][2].c(param3 - -18, param2 + 36, 18, 18);
              fb.field_c[param5][2].c(param3 + 18, 54 + param2, 18, 18);
              fb.field_c[param5][2].c(param3 + 36, 72 + param2, 18, 18);
              fb.field_c[param5][2].c(36 + param3, var7 + (param2 + var8), 18, 18 - var8);
              return;
            }
          } else {
            var7 = var7 + vl.a(23841, 80, 18 * param1 - -40);
            cg.a(param5, 2, 6, param3, 1 + (72 + param2), 2, -2);
            cg.a(param5, 2, 12, param3, 1 + (param2 - -54), 2, param4);
            cg.a(param5, 2, 8, param3, 36 + (param2 + 1), 2, -1);
            cg.a(param5, 2, 1, param3 + 18, param2 + 72 - -1, 1, -2);
            fb.field_c[param5][2].c(param3 - -18, param2 + 36, 18, 18);
            fb.field_c[param5][2].c(param3 + 18, 54 + param2, 18, 18);
            fb.field_c[param5][2].c(param3 + 36, 72 + param2, 18, 18);
            fb.field_c[param5][2].c(36 + param3, var7 + (param2 + var8), 18, 18 - var8);
            return;
          }
        } else {
          var7 = var7 + vl.a(23841, 80, 40 + 18 * param0);
          cg.a(param5, 2, 6, param3, 1 + (72 + param2), 2, -2);
          cg.a(param5, 2, 12, param3, 1 + (param2 - -54), 2, param4);
          cg.a(param5, 2, 8, param3, 36 + (param2 + 1), 2, -1);
          cg.a(param5, 2, 1, param3 + 18, param2 + 72 - -1, 1, -2);
          fb.field_c[param5][2].c(param3 - -18, param2 + 36, 18, 18);
          fb.field_c[param5][2].c(param3 + 18, 54 + param2, 18, 18);
          fb.field_c[param5][2].c(param3 + 36, 72 + param2, 18, 18);
          fb.field_c[param5][2].c(36 + param3, var7 + (param2 + var8), 18, 18 - var8);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Invalid password.";
        field_f = "You can join this game";
        field_e = "Send private Quick Chat to <%0>";
    }
}
