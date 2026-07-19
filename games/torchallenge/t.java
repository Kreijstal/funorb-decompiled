/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class t {
    static si field_b;
    static String[] field_a;

    final static boolean a(int param0, int param1, int param2) {
        if (param2 <= 112) {
            field_a = (String[]) null;
        }
        if (0 != (1 << param0 & param1)) {
            return true;
        }
        return false;
    }

    abstract void a(uf param0, int param1);

    final static void b(boolean param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              if (8 <= var1_int) {
                L2: {
                  if (param0) {
                    break L2;
                  } else {
                    field_b = (si) null;
                    break L2;
                  }
                }
                break L0;
              } else {
                var2 = 0;
                L3: while (true) {
                  if ((var2 ^ -1) <= -4) {
                    var1_int++;
                    continue L1;
                  } else {
                    L4: {
                      if (-1 <= (ol.field_c[var1_int][var2][4] ^ -1)) {
                        break L4;
                      } else {
                        ol.field_c[var1_int][var2][4] = ol.field_c[var1_int][var2][4] - 1;
                        break L4;
                      }
                    }
                    var2++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "t.J(" + param0 + ')');
        }
    }

    final static void a(int param0) {
        we.field_c = new String[37][];
        we.field_c[5] = new String[]{dd.field_o};
        we.field_c[13] = new String[]{sd.field_f};
        we.field_c[14] = new String[]{ac.field_b};
        we.field_c[7] = new String[]{cl.field_w};
        we.field_c[15] = new String[]{ef.field_f};
        int var1 = 106 / ((31 - param0) / 53);
        we.field_c[16] = new String[]{aa.field_b};
        we.field_c[4] = new String[]{og.field_b};
        we.field_c[2] = new String[]{a.field_e};
        we.field_c[6] = new String[]{dd.field_o};
        we.field_c[0] = new String[]{si.field_M};
        we.field_c[12] = new String[]{kj.field_H};
        we.field_c[3] = new String[]{ui.field_g};
        we.field_c[1] = new String[]{eb.field_i};
        we.field_c[11] = new String[]{lj.field_d};
        we.field_c[17] = new String[]{ik.field_e};
        we.field_c[20] = new String[]{wf.field_f, rc.field_q};
        we.field_c[31] = new String[]{gh.field_i, o.field_n};
        we.field_c[18] = new String[]{hl.field_a};
        we.field_c[19] = new String[]{ui.field_d};
        we.field_c[36] = new String[]{be.field_a};
        we.field_c[29] = new String[]{me.field_a[1]};
        we.field_c[30] = new String[]{me.field_a[2]};
        we.field_c[28] = new String[]{me.field_a[0]};
        we.field_c[10] = new String[]{s.field_j[2]};
        we.field_c[9] = new String[]{s.field_j[1]};
        we.field_c[8] = new String[]{s.field_j[0]};
    }

    public static void b(int param0) {
        field_b = null;
        field_a = null;
        int var1 = -33 % ((-11 - param0) / 32);
    }

    abstract am a(boolean param0);

    final static String d(int param0) {
        int var1 = -94 / ((46 - param0) / 33);
        return kg.field_P;
    }

    final static void c(int param0) {
        if (0 - vk.field_h != jc.field_c) {
            if (jc.field_c == 250 + -vk.field_h) {
            }
        }
        if (param0 != 3870) {
            return;
        }
        jc.field_c = jc.field_c + 1;
    }

    static {
        field_a = new String[]{"By rating", "By win percentage"};
    }
}
