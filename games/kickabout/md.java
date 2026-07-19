/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class md implements hc {
    static String field_h;
    static String field_j;
    static String field_g;
    private char[] field_e;
    private int field_f;
    private gm[] field_i;
    private int field_c;
    private boolean field_a;
    private ut field_b;
    static String field_d;

    private final void a(int param0, int param1) {
        int var4 = 0;
        boolean[][][] var11 = null;
        vn var6 = null;
        int var7 = Kickabout.field_G;
        int var3 = -1 != (param1 ^ -1) ? 0 : 1;
        for (var4 = 0; 4 > var4; var4++) {
            var11 = ih.a(21656, rp.field_z[param1][var4]);
            var6 = hs.a(false, var4 % 3, var3, ev.field_B[-(2 * param1) + 12], var11[0], var4 % 3, var11[1], (byte) -89, -var4 + 3, false, ev.field_B[31]);
            this.field_i[var4] = new gm(var6, var3, true);
            this.field_i[var4].field_G = 1;
            this.field_i[var4].g((byte) 127);
            this.field_i[var4].field_mb.a(dq.a((byte) 85, this.field_i[var4].field_mb.a(true), new Random()), 123);
        }
        if (param0 >= -10) {
            this.field_i = (gm[]) null;
        }
    }

    final static boolean d(int param0) {
        boolean discarded$1 = false;
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        boolean stackOut_12_1 = false;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        L0: {
          var3 = Kickabout.field_G;
          var1 = 0;
          if (n.a(false)) {
            var1 = 1;
            gg.a(-32053);
            break L0;
          } else {
            if (!ng.a(param0 ^ 27302)) {
              if (vi.c(2915)) {
                on.g(0, 0, on.field_g, on.field_f);
                var1 = 1;
                ph.b(true);
                break L0;
              } else {
                break L0;
              }
            } else {
              var1 = 1;
              ci.a(false);
              break L0;
            }
          }
        }
        L1: {
          if (!up.a((byte) -3)) {
            break L1;
          } else {
            if (!ng.a(param0 ^ 27302)) {
              L2: {
                stackOut_10_0 = 100;
                stackIn_12_0 = stackOut_10_0;
                stackIn_11_0 = stackOut_10_0;
                if (e.field_m == null) {
                  stackOut_12_0 = stackIn_12_0;
                  stackOut_12_1 = vb.field_k;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1 ? 1 : 0;
                  break L2;
                } else {
                  stackOut_11_0 = stackIn_11_0;
                  stackOut_11_1 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  break L2;
                }
              }
              ha.c(stackIn_13_0, stackIn_13_1 != 0);
              var1 = 1;
              break L1;
            } else {
              break L1;
            }
          }
        }
        L3: {
          if (nv.i(0)) {
            var2 = (-1 + vo.field_bb << 1245486152) / 16;
            if (0 < var2) {
              var1 = 1;
              on.a(0, 0, on.field_g, on.field_f, 0, var2);
              break L3;
            } else {
              break L3;
            }
          } else {
            break L3;
          }
        }
        L4: {
          if (param0 == -27302) {
            break L4;
          } else {
            discarded$1 = md.d(14);
            break L4;
          }
        }
        return var1 != 0;
    }

    public final boolean a(int param0, int param1, char param2) {
        int var4 = 0;
        int var5 = Kickabout.field_G;
        for (var4 = 0; var4 < 3; var4++) {
            this.field_e[var4] = this.field_e[1 + var4];
        }
        this.field_e[3] = Character.toUpperCase(param2);
        var4 = -1;
        if (this.field_e[0] == 90) {
            if (this.field_e[1] == 69) {
                if (this.field_e[2] == 80) {
                    if (this.field_e[3] == 72) {
                        var4 = 0;
                    }
                }
            }
        }
        if (this.field_e[0] == 73) {
            if (this.field_e[1] == 65) {
                if (73 == this.field_e[2]) {
                    if (!(78 != this.field_e[3])) {
                        var4 = 1;
                    }
                }
            }
        }
        if (-1 != var4) {
            if (!this.field_a) {
                this.b(-98);
            }
            if (var4 != this.field_c) {
                this.a(-18, var4);
            }
            this.field_f = 1;
        }
        if (param0 != 11516) {
            return false;
        }
        return false;
    }

    public final void a(int param0) {
        float var2 = 0.0f;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        float var6 = 0.0f;
        float var7 = 0.0f;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_6_0 = 0;
        float stackIn_13_0 = 0.0f;
        float stackIn_16_0 = 0.0f;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        float stackOut_12_0 = 0.0f;
        float stackOut_11_0 = 0.0f;
        float stackOut_15_0 = 0.0f;
        float stackOut_14_0 = 0.0f;
        var10 = Kickabout.field_G;
        if (this.field_f == 0) {
          return;
        } else {
          L0: {
            var2 = 1.0f + (float)this.field_f * 9.0f / 200.0f;
            if (0 == this.field_c) {
              stackOut_5_0 = 7000;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_4_0 = 9000;
              stackIn_6_0 = stackOut_4_0;
              break L0;
            }
          }
          var3 = (int)((float)stackIn_6_0 / var2);
          var4 = 0;
          L1: while (true) {
            if (4 <= var4) {
              var4 = -36 / ((50 - param0) / 45);
              return;
            } else {
              L2: {
                var5 = var4;
                if (1 >= var5) {
                  break L2;
                } else {
                  var5 = -var4 + 3;
                  break L2;
                }
              }
              L3: {
                if (var5 != 0) {
                  stackOut_12_0 = 0.30000001192092896f;
                  stackIn_13_0 = stackOut_12_0;
                  break L3;
                } else {
                  stackOut_11_0 = 0.8999999761581421f;
                  stackIn_13_0 = stackOut_11_0;
                  break L3;
                }
              }
              L4: {
                var6 = stackIn_13_0 * (float)this.field_f;
                var7 = 1.2000000476837158f * (float)this.field_f;
                if (-2 <= (var4 ^ -1)) {
                  stackOut_15_0 = -var6;
                  stackIn_16_0 = stackOut_15_0;
                  break L4;
                } else {
                  stackOut_14_0 = var6;
                  stackIn_16_0 = stackOut_14_0;
                  break L4;
                }
              }
              var8 = (int)stackIn_16_0 + 320;
              var9 = (int)var7 + 140;
              iw.a(-102, this.field_b);
              on.b();
              this.field_i[var4].a(var3, 0, on.field_g >> 725710465, on.field_f, (byte) -105);
              ta.e(120);
              if (-137 > (this.field_f ^ -1)) {
                this.field_b.b(-(this.field_b.field_o >> -570644511) + var8, -(this.field_b.field_v >> 159796321) + var9, 200 - this.field_f << 561976578);
                var4++;
                continue L1;
              } else {
                this.field_b.c(-(this.field_b.field_o >> -268201759) + var8, var9 + -(this.field_b.field_v >> 1055105665));
                var4++;
                continue L1;
              }
            }
          }
        }
    }

    public static void c(int param0) {
        field_h = null;
        field_g = null;
        field_j = null;
        if (param0 != 32318) {
            return;
        }
        field_d = null;
    }

    public final boolean a(byte param0) {
        boolean discarded$0 = false;
        if (param0 <= 63) {
            discarded$0 = this.a(121, -18, '�');
            return false;
        }
        return false;
    }

    public final void a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = Kickabout.field_G;
        if (!(-1 != (this.field_f ^ -1))) {
            return;
        }
        int fieldTemp$0 = this.field_f + 1;
        this.field_f = this.field_f + 1;
        if ((fieldTemp$0 ^ -1) <= -201) {
            this.field_f = 0;
            return;
        }
        if (param0 != -25) {
            return;
        }
        for (var3 = 0; (var3 ^ -1) > -5; var3++) {
            this.field_i[var3].a(param0 ^ -27, (la[]) null, false, false);
            this.field_i[var3].g((byte) 126);
        }
    }

    private final void b(int param0) {
        this.field_i = new gm[4];
        this.field_b = new ut(100, 200);
        int var2 = 26 / ((43 - param0) / 54);
    }

    md() {
        this.field_f = 0;
        this.field_e = new char[4];
        this.field_c = -1;
        this.field_a = false;
    }

    static {
        field_h = "Connection timed out. Please try using a different server.";
        field_j = "Add name";
        field_g = "<%0> has just resigned and left, <%1> wins the tournament by default!";
        field_d = "Suggested names: ";
    }
}
