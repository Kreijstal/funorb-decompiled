/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ec extends ta implements ai {
    static int field_K;
    static String field_J;
    static int[] field_E;
    static String field_H;
    private kc field_I;
    private String field_A;
    private int field_D;
    private int[] field_C;
    private s[] field_B;
    static String field_F;
    private dh field_G;

    private final void a(int param0, int param1) {
        s[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        s[] var7 = null;
        var6 = OrbDefence.field_D ? 1 : 0;
        if (((ec) this).field_D >= param0) {
          return;
        } else {
          var7 = new s[param0];
          var3 = var7;
          var4 = new int[param0];
          if (param1 != 11339) {
            ((ec) this).a(44, 28, 45, 89);
            var5 = 0;
            L0: while (true) {
              if (((ec) this).field_D <= var5) {
                ((ec) this).field_B = var3;
                ((ec) this).field_C = var4;
                ((ec) this).field_D = param0;
                return;
              } else {
                var7[var5] = ((ec) this).field_B[var5];
                var4[var5] = ((ec) this).field_C[var5];
                var5++;
                continue L0;
              }
            }
          } else {
            var5 = 0;
            L1: while (true) {
              if (((ec) this).field_D <= var5) {
                ((ec) this).field_B = var3;
                ((ec) this).field_C = var4;
                ((ec) this).field_D = param0;
                return;
              } else {
                var7[var5] = ((ec) this).field_B[var5];
                var4[var5] = ((ec) this).field_C[var5];
                var5++;
                continue L1;
              }
            }
          }
        }
    }

    ec(dh param0, kc param1, String param2) {
        super(0, 0, 288, 0, (td) null);
        ((ec) this).field_D = 0;
        ((ec) this).field_G = param0;
        ((ec) this).field_A = param2;
        ((ec) this).field_I = param1;
        int var4 = null != ((ec) this).field_A ? ((ec) this).field_I.a(((ec) this).field_A, 260, ((ec) this).field_I.field_H) : 0;
        ((ec) this).a(0, 0, var4 + 22, (byte) -90, 288);
    }

    final s a(String param0, int param1, ag param2) {
        s var4 = new s(param0, param2);
        var4.field_j = (td) (Object) new vk();
        int var5 = -2 + ((ec) this).field_r;
        ((ec) this).a(0, 0, ((ec) this).field_r - param1, (byte) -90, ((ec) this).field_m);
        var4.a(7, var5, 30, (byte) -90, -14 + ((ec) this).field_m);
        ((ec) this).a((pj) (Object) var4, (byte) 74);
        return var4;
    }

    public final void a(byte param0, int param1, int param2, s param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = OrbDefence.field_D ? 1 : 0;
        var6 = 0;
        L0: while (true) {
          if (((ec) this).field_D > var6) {
            if (param3 != ((ec) this).field_B[var6]) {
              var6++;
              var6++;
              continue L0;
            } else {
              var7 = ((ec) this).field_C[var6];
              if (-1 != var7) {
                il.a(((ec) this).field_C[var6], 0);
                var6 = -66 / ((param0 - -3) / 62);
                return;
              } else {
                ((ec) this).field_G.q(4210752);
                var6 = -66 / ((param0 - -3) / 62);
                return;
              }
            }
          } else {
            var6 = -66 / ((param0 - -3) / 62);
            return;
          }
        }
    }

    final void a(String param0, int param1, int param2) {
        int var4 = 0;
        var4 = ((ec) this).field_D;
        this.a(1 + var4, 11339);
        ((ec) this).field_B[var4] = ((ec) this).a(param0, gi.a(param2, 15824), (ag) this);
        ((ec) this).field_C[var4] = param1;
        if (param2 != -15858) {
          boolean discarded$2 = ec.k(23);
          return;
        } else {
          return;
        }
    }

    final static void a(String param0, int param1, boolean param2, int param3, boolean param4, int param5, int param6, int param7, int param8, long param9, int param10, be param11, int param12, int param13) {
        try {
            IOException var15 = null;
            int stackIn_5_0 = 0;
            int stackIn_8_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_4_0 = 0;
            int stackOut_3_0 = 0;
            int stackOut_7_0 = 0;
            int stackOut_6_0 = 0;
            cd.field_t = new se(param1);
            uk.field_b = new se(param7);
            gi.field_a = param12;
            j.field_e = param3;
            eg.field_v = param6;
            jl.field_e = param0;
            dk.field_a = param10;
            el.field_G = param9;
            ti.field_eb = param5;
            sj.field_x = param8;
            if (param13 > 23) {
              L0: {
                ef.field_i = param11;
                if (!param4) {
                  stackOut_4_0 = 0;
                  stackIn_5_0 = stackOut_4_0;
                  break L0;
                } else {
                  stackOut_3_0 = 1;
                  stackIn_5_0 = stackOut_3_0;
                  break L0;
                }
              }
              L1: {
                mg.field_g = stackIn_5_0 != 0;
                if (!param2) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L1;
                } else {
                  stackOut_6_0 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  break L1;
                }
              }
              jc.field_b = stackIn_8_0 != 0;
              if (null != ef.field_i.field_v) {
                try {
                  s.field_y = new dj(ef.field_i.field_v, 64, 0);
                } catch (java.io.IOException decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void l(int param0) {
        int var5 = OrbDefence.field_D ? 1 : 0;
        int[] var6 = ji.field_a;
        int[] var1 = var6;
        int var2 = 0;
        int var3 = -114 / ((4 - param0) / 42);
        int var4 = var6.length;
        while (var2 < var4) {
            var2++;
            var6[var2] = 0;
            var2++;
            var6[var2] = 0;
            var2++;
            var6[var2] = 0;
            var2++;
            var6[var2] = 0;
            var2++;
            var6[var2] = 0;
            var2++;
            var6[var2] = 0;
            var2++;
            var6[var2] = 0;
            var2++;
            var6[var2] = 0;
        }
    }

    public static void a(byte param0) {
        field_E = null;
        field_F = null;
        field_H = null;
        field_J = null;
        if (param0 != 122) {
            ec.l(20);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        int discarded$0 = ((ec) this).field_I.a(((ec) this).field_A, param3 - -((ec) this).field_s + 14, param0 + ((ec) this).field_n + 10, -28 + ((ec) this).field_m, ((ec) this).field_r, 16777215, -1, 0, 0, ((ec) this).field_I.field_H);
    }

    final static boolean k(int param0) {
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 783) {
          return false;
        } else {
          L0: {
            pc.field_Y = true;
            lm.field_c = ji.b(114) + 15000L;
            if (hi.field_k != 11) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "Passwords can only contain letters and numbers";
        field_J = "Create your own free Jagex account";
        field_F = "Player";
    }
}
