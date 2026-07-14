/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class df {
    static String field_g;
    static cn field_c;
    static cn field_e;
    static String field_a;
    static String field_b;
    static String field_d;
    static String field_f;

    final static void b(int param0) {
        int var1 = 0;
        ai var2 = null;
        int var3 = 0;
        Object var4 = null;
        L0: {
          var3 = DungeonAssault.field_K;
          if (param0 == 16) {
            break L0;
          } else {
            var4 = null;
            df.a((byte) 115, (ja) null);
            break L0;
          }
        }
        var1 = 0;
        L1: while (true) {
          if (-50 >= (var1 ^ -1)) {
            return;
          } else {
            L2: {
              var2 = qj.field_c[var1];
              if (var2 != null) {
                var2.field_f = qe.a(var2, false, false, 0);
                break L2;
              } else {
                break L2;
              }
            }
            var2 = gm.field_d.field_L[var1];
            if (var2 != null) {
              var2.field_f = qe.a(var2, false, false, 0);
              var1++;
              continue L1;
            } else {
              var1++;
              continue L1;
            }
          }
        }
    }

    final static int a(byte param0) {
        if (param0 != -38) {
            return -45;
        }
        return (int)(-16912800L + kd.c(-2456) / 60000L);
    }

    final static qh a(boolean param0, wj param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        qh var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = DungeonAssault.field_K;
        var2 = param1.j(114, 8);
        if (0 >= var2) {
          L0: {
            var3 = jl.a(param1, -123) ? 1 : 0;
            var4 = jl.a(param1, 90) ? 1 : 0;
            var5 = new qh();
            var5.field_B = (short)param1.j(-101, 16);
            var5.field_L = aj.a(param1, var5.field_L, (byte) 31, 16);
            var5.field_S = aj.a(param1, var5.field_S, (byte) 31, 16);
            var5.field_z = aj.a(param1, var5.field_z, (byte) 31, 16);
            var5.field_h = (short)param1.j(-43, 16);
            var5.field_A = aj.a(param1, var5.field_A, (byte) 31, 16);
            var5.field_x = aj.a(param1, var5.field_x, (byte) 31, 16);
            var5.field_N = aj.a(param1, var5.field_N, (byte) 31, 16);
            if (!param0) {
              break L0;
            } else {
              field_a = null;
              break L0;
            }
          }
          L1: {
            if (var3 == 0) {
              break L1;
            } else {
              var5.field_c = (short)param1.j(-79, 16);
              var5.field_d = aj.a(param1, var5.field_d, (byte) 31, 16);
              var5.field_P = aj.a(param1, var5.field_P, (byte) 31, 16);
              var5.field_v = aj.a(param1, var5.field_v, (byte) 31, 16);
              var5.field_e = aj.a(param1, var5.field_e, (byte) 31, 16);
              var5.field_s = aj.a(param1, var5.field_s, (byte) 31, 16);
              var5.field_F = aj.a(param1, var5.field_F, (byte) 31, 16);
              break L1;
            }
          }
          L2: {
            if (var4 != 0) {
              int discarded$1 = param1.j(-97, 16);
              var5.field_t = aj.a(param1, var5.field_t, (byte) 31, 16);
              var5.field_Q = aj.a(param1, var5.field_Q, (byte) 31, 16);
              var5.field_I = aj.a(param1, var5.field_I, (byte) 31, 16);
              var5.field_n = aj.a(param1, var5.field_n, (byte) 31, 16);
              var5.field_C = aj.a(param1, var5.field_C, (byte) 31, 16);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (jl.a(param1, -120)) {
              var5.field_o = aj.a(param1, var5.field_o, (byte) 31, 16);
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (jl.a(param1, 95)) {
              var5.field_y = rj.a(param1, false, 16, var5.field_y);
              var6 = 0;
              var7 = 0;
              L5: while (true) {
                if (var7 >= var5.field_y.length) {
                  if (var6 == 0) {
                    var5.field_y = null;
                    break L4;
                  } else {
                    var5.field_w = (byte)(1 + var6);
                    break L4;
                  }
                } else {
                  if (var6 < (255 & var5.field_y[var7])) {
                    var6 = var5.field_y[var7] & 255;
                    var7++;
                    continue L5;
                  } else {
                    var7++;
                    continue L5;
                  }
                }
              }
            } else {
              break L4;
            }
          }
          return var5;
        } else {
          throw new IllegalStateException("" + var2);
        }
    }

    final static void a(byte param0, ja param1) {
        qh.field_G = param1;
        if (param0 != 11) {
            Object var3 = null;
            qh discarded$0 = df.a(true, (wj) null);
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        field_g = null;
        field_f = null;
        field_e = null;
        if (param0 != 255) {
            Object var2 = null;
            qh discarded$0 = df.a(true, (wj) null);
        }
        field_c = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Necromancer";
        field_b = "<col=FF0000>Attack -1, Defence -1</col>";
        field_d = "Orb of Brilliance";
        field_a = "Change display name";
        field_f = "The larger and better trained saurus warriors are far superior in combat than their smaller brethren, using their innate agility to ensure success against all foes.";
    }
}
