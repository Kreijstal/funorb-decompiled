/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab {
    static String field_c;
    static bg field_b;
    static String field_a;

    final static void a(int param0, int param1, wb param2) {
        int var5 = 0;
        int var6 = MinerDisturbance.field_ab;
        ld var7 = sn.field_c;
        ld var8 = var7;
        var8.d((byte) -82, param1);
        var8.field_o = var8.field_o + 1;
        int var4 = var8.field_o;
        var8.c(1, 25564);
        var8.b((byte) 121, param2.field_w);
        var8.b((byte) 124, param2.field_v);
        var8.b((byte) 124, param2.field_s);
        var8.a((byte) 120, param2.field_u);
        var8.a((byte) 80, param2.field_o);
        var8.a((byte) 108, param2.field_t);
        if (param0 != -20680) {
            return;
        }
        var8.a((byte) 93, param2.field_n);
        var8.c(param2.field_r.length, 25564);
        for (var5 = 0; var5 < param2.field_r.length; var5++) {
            var7.a((byte) 109, param2.field_r[var5]);
        }
        int discarded$0 = var8.e(-118, var4);
        var8.g(-1, -var4 + var8.field_o);
    }

    final static String a(int param0, int param1, boolean param2, long param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = MinerDisturbance.field_ab;
        if (param4) {
          L0: {
            var6 = 44;
            var7 = 46;
            if (param1 == 0) {
              var6 = 46;
              var7 = 44;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (param1 != 2) {
              break L1;
            } else {
              var7 = 160;
              break L1;
            }
          }
          L2: {
            var8 = 0;
            if (-1L < (param3 ^ -1L)) {
              param3 = -param3;
              var8 = 1;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            var9 = new StringBuilder(26);
            if ((param0 ^ -1) < -1) {
              var10 = 0;
              L4: while (true) {
                if (var10 >= param0) {
                  StringBuilder discarded$5 = var9.append(var6);
                  break L3;
                } else {
                  var11 = (int)param3;
                  param3 = param3 / 10L;
                  StringBuilder discarded$6 = var9.append((char)(var11 + 48 + -(10 * (int)param3)));
                  var10++;
                  continue L4;
                }
              }
            } else {
              break L3;
            }
          }
          var10 = 0;
          L5: while (true) {
            var11 = (int)param3;
            param3 = param3 / 10L;
            StringBuilder discarded$7 = var9.append((char)(48 + (var11 - 10 * (int)param3)));
            if (-1L == (param3 ^ -1L)) {
              L6: {
                if (var8 == 0) {
                  break L6;
                } else {
                  StringBuilder discarded$8 = var9.append(45);
                  break L6;
                }
              }
              return var9.reverse().toString();
            } else {
              if (param2) {
                var10++;
                if (0 == var10 % 3) {
                  StringBuilder discarded$9 = var9.append(var7);
                  continue L5;
                } else {
                  continue L5;
                }
              } else {
                continue L5;
              }
            }
          }
        } else {
          return null;
        }
    }

    final static void a(int param0) {
        int var4 = MinerDisturbance.field_ab;
        int[] var5 = mg.field_e;
        int[] var1 = var5;
        int var2 = 0;
        if (param0 != -20707) {
            field_b = null;
        }
        int var3 = var5.length;
        while (var2 < var3) {
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
        }
    }

    final static ci a(byte param0, int param1, java.awt.Component param2, int param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            ci var5 = null;
            vj var5_ref = null;
            Object var6 = null;
            ci stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            ci stackOut_2_0 = null;
            try {
              L0: {
                var4 = Class.forName("n");
                if (param0 < -76) {
                  break L0;
                } else {
                  var6 = null;
                  ab.a(-60, -22, (wb) null);
                  break L0;
                }
              }
              var5 = (ci) var4.newInstance();
              var5.a(param2, param3, 13961, param1);
              stackOut_2_0 = (ci) var5;
              stackIn_3_0 = stackOut_2_0;
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return stackIn_3_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    final static void a(byte param0, java.awt.Canvas param1) {
        kd.a((java.awt.Component) (Object) param1, true);
        if (param0 != -13) {
            return;
        }
        dl.a((java.awt.Component) (Object) param1, (byte) 73);
        if (!(null == pf.field_e)) {
            pf.field_e.a((java.awt.Component) (Object) param1, 0);
        }
    }

    final static int a(int param0, int param1) {
        param0--;
        param0 = param0 | param0 >>> 1267078881;
        param0 = param0 | param0 >>> -1203620670;
        param0 = param0 | param0 >>> -983899644;
        param0 = param0 | param0 >>> 1205186920;
        if (param1 != 15952) {
            return 103;
        }
        param0 = param0 | param0 >>> 681646512;
        return param0 - -1;
    }

    public static void b(int param0) {
        if (param0 != -14839) {
            ab.b(85);
        }
        field_a = null;
        field_b = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = null;
        field_b = new bg(4, 1, 1, 1);
        field_a = "to keep fullscreen or";
    }
}
