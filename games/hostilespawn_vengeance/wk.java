/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wk {
    static boolean field_h;
    static String field_f;
    static int[] field_d;
    static bd[] field_b;
    static int field_c;
    static vl field_g;
    static bd field_a;
    static String field_e;

    final static ln a(boolean param0, boolean param1) {
        en var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        en var8 = null;
        hj var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int[] stackIn_23_0 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int[] stackOut_22_0 = null;
        Object stackOut_21_0 = null;
        L0: {
          var7 = HostileSpawn.field_I ? 1 : 0;
          var8 = sc.field_g;
          var2 = var8;
          var3 = var8.l(32270);
          if (0 == (var3 & 128)) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        pk.field_k = stackIn_3_0 != 0;
        lb.field_b = 127 & var3;
        ja.field_c = var8.l(32270);
        pm.field_c = var8.c(10818);
        if (param0) {
          L1: {
            if (lb.field_b != 2) {
              qa.field_e = 0;
              jg.field_c = 0;
              break L1;
            } else {
              jg.field_c = var8.e(8);
              qa.field_e = var8.h(64);
              break L1;
            }
          }
          L2: {
            if (var8.l(32270) != 1) {
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              break L2;
            } else {
              stackOut_9_0 = 1;
              stackIn_11_0 = stackOut_9_0;
              break L2;
            }
          }
          L3: {
            var4 = stackIn_11_0;
            qa.field_f = var8.o(32);
            if (var4 == 0) {
              qg.field_o = qa.field_f;
              break L3;
            } else {
              qg.field_o = var8.o(32);
              break L3;
            }
          }
          L4: {
            if (lb.field_b == 1) {
              int discarded$4 = var8.e(8);
              String discarded$5 = var8.o(32);
              break L4;
            } else {
              if (lb.field_b != 4) {
                break L4;
              } else {
                int discarded$6 = var8.e(8);
                String discarded$7 = var8.o(32);
                break L4;
              }
            }
          }
          var5 = var8.e(8);
          try {
            L5: {
              L6: {
                var9 = le.field_ub.a(var5, 1);
                md.field_f = var9.d((byte) -53);
                if (!qg.field_o.equals((Object) (Object) qg.field_r)) {
                  stackOut_22_0 = var9.field_w;
                  stackIn_23_0 = stackOut_22_0;
                  break L6;
                } else {
                  stackOut_21_0 = null;
                  stackIn_23_0 = (int[]) (Object) stackOut_21_0;
                  break L6;
                }
              }
              bn.field_b = stackIn_23_0;
              break L5;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            L7: {
              var6 = (Exception) (Object) decompiledCaughtException;
              ic.a((byte) -115, "CC1", (Throwable) (Object) var6);
              md.field_f = null;
              bn.field_b = null;
              break L7;
            }
          }
          return new ln(false);
        } else {
          return null;
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        field_g = null;
        field_e = null;
        field_f = null;
        field_a = null;
    }

    final static ri a(int param0, int param1) {
        ri var2 = null;
        var2 = new ri();
        ei.field_h.a((am) (Object) var2, 88);
        if (param1 != -2178) {
          field_e = null;
          wg.d(param1 ^ 11338, param0);
          return var2;
        } else {
          wg.d(param1 ^ 11338, param0);
          return var2;
        }
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        oj var2 = null;
        int var3 = 0;
        int var4 = 0;
        p var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var2 = mm.field_m[0];
            var3 = -10;
            L1: while (true) {
              if (var3 > 10) {
                break L0;
              } else {
                var5 = jn.field_F[ib.field_c];
                var5.field_i = 16;
                var5.field_c = var2.field_c + (double)var3;
                var5.field_j.a((byte) 46, var2.field_j);
                var5.field_l.a(var2.field_l, -28860);
                var5.field_e = 0;
                var5.field_l.field_f = var5.field_l.field_f - 0.5;
                var5.field_h = 0;
                var5.field_l.field_a = var5.field_l.field_a - 0.5;
                var5.field_l.a(6, (byte) 94, var5.field_c + 192.0);
                var5.field_l.a(20, (byte) 94, var5.field_c);
                ib.field_c = ib.field_c + 1;
                var3 += 10;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var1, "wk.B(" + 192 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        field_h = false;
        field_f = "Reach the lift and go down to the next level.";
        field_b = new bd[12];
        field_d = new int[255];
        for (var0 = 0; var0 < 255; var0++) {
            var1 = -384 + 3 * var0;
            if (255 < var1) {
                var1 = 255;
            }
            if (0 > var1) {
                var1 = 0;
            }
            field_d[var0] = var0 * 257 - -(var1 << 16);
        }
        field_e = "Names can only contain letters, numbers, spaces and underscores";
        field_g = new vl();
    }
}
