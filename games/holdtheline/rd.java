/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rd {
    static int field_g;
    float field_k;
    int field_i;
    static float[] field_b;
    static da field_e;
    static java.applet.Applet field_d;
    static int field_f;
    static int field_l;
    static String field_a;
    int field_h;
    int field_c;
    static String field_j;

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        field_j = null;
        field_d = null;
        if (param0 != 0) {
          field_e = null;
          field_e = null;
          return;
        } else {
          field_e = null;
          return;
        }
    }

    final static void a(int param0, qm param1, int param2, el param3) {
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        int var7 = 0;
        float var14 = 0.0f;
        int var8 = 0;
        float var10_float = 0.0f;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (!(ch.field_i == null)) {
            var4 = param1.field_h + -ch.field_i.field_A.field_h;
            var5 = -ch.field_i.field_A.field_f + param1.field_f;
            var6 = var5 * var5 + var4 * var4;
        }
        int var9 = -68 % ((param2 - 47) / 59);
        if (var6 > 0) {
            var10_float = (float)Math.sqrt((double)var6);
            var11 = -ch.field_i.field_t;
            var12 = -ch.field_i.field_x;
            var13 = (var12 * (float)var5 + var11 * (float)var4) / var10_float;
            var13 = 160.0f / (var13 + 160.0f);
            if (!(var13 >= 0.75f)) {
                var13 = 0.75f;
            }
            if (!(1.25f >= var13)) {
                var13 = 1.25f;
            }
            var7 = (int)(var13 * 256.0f);
            var14 = (float)var4 / var10_float;
            var8 = (int)(8192.0f * (1.0f + var14));
        } else {
            var7 = 256;
            var8 = 8192;
        }
        db var10 = db.b(param3, var7, param0 * pc.field_h >> -699864667, var8);
        ui discarded$0 = lg.a(var10, (byte) -68);
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, String param5) {
        if (param2 != -83) {
          int discarded$1 = rd.a(54, -109);
          on.field_t.a(param0 - 381, param4);
          nj.field_i.a(param0, param4);
          nm.field_c.a(param5, param3, (nm.field_c.field_G + 30) / 2 + (param4 + -2), param1, -1);
          return;
        } else {
          on.field_t.a(param0 - 381, param4);
          nj.field_i.a(param0, param4);
          nm.field_c.a(param5, param3, (nm.field_c.field_G + 30) / 2 + (param4 + -2), param1, -1);
          return;
        }
    }

    final static void a(byte param0, ib param1, java.awt.Frame param2) {
        af var3 = null;
        int var4 = 0;
        Object var5 = null;
        var4 = HoldTheLine.field_D;
        if (param0 > 101) {
          L0: while (true) {
            var3 = param1.a(param2, (byte) -95);
            L1: while (true) {
              if (var3.field_d != 0) {
                if (1 != var3.field_d) {
                  qe.a(100L, (byte) 45);
                  continue L0;
                } else {
                  param2.setVisible(false);
                  param2.dispose();
                  return;
                }
              } else {
                qe.a(10L, (byte) 45);
                continue L1;
              }
            }
          }
        } else {
          var5 = null;
          rd.a(113, -110, (byte) 115, 12, -60, (String) null);
          L2: while (true) {
            var3 = param1.a(param2, (byte) -95);
            L3: while (true) {
              if (var3.field_d != 0) {
                if (1 != var3.field_d) {
                  qe.a(100L, (byte) 45);
                  continue L2;
                } else {
                  param2.setVisible(false);
                  param2.dispose();
                  return;
                }
              } else {
                qe.a(10L, (byte) 45);
                continue L3;
              }
            }
          }
        }
    }

    abstract void a(int[] param0, int param1, byte param2, int[] param3);

    final static int a(int param0, int param1) {
        param1 = (1431655765 & param1) - -(-715827883 & param1 >>> 479355201);
        param1 = (param1 & 858993459) - -(-1288490189 & param1 >>> -94366878);
        param1 = 252645135 & param1 - -(param1 >>> 648006948);
        if (param0 != -699864667) {
          boolean discarded$2 = rd.b(27);
          param1 = param1 + (param1 >>> -1772444088);
          param1 = param1 + (param1 >>> 384594992);
          return param1 & 255;
        } else {
          param1 = param1 + (param1 >>> -1772444088);
          param1 = param1 + (param1 >>> 384594992);
          return param1 & 255;
        }
    }

    final static boolean b(int param0) {
        if (param0 >= -46) {
            field_e = null;
            return ci.field_o;
        }
        return ci.field_o;
    }

    final static mm a(int param0, int param1, java.awt.Component param2, int param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            mm var5 = null;
            sf var5_ref = null;
            int var6 = 0;
            mm stackIn_1_0 = null;
            Throwable decompiledCaughtException = null;
            mm stackOut_0_0 = null;
            try {
              var4 = Class.forName("mb");
              var5 = (mm) var4.newInstance();
              var6 = -115 / ((param1 - 2) / 39);
              var5.a(param3, param0, param2, 0);
              stackOut_0_0 = (mm) var5;
              stackIn_1_0 = stackOut_0_0;
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return stackIn_1_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new float[]{50.0f, 300.0f, 500.0f};
        field_a = "Loading levels";
        field_f = 0;
        field_l = -1;
    }
}
