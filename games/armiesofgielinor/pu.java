/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pu {
    int field_p;
    short[] field_u;
    short[] field_c;
    short[] field_i;
    int field_J;
    short[] field_s;
    short[] field_r;
    short[] field_Q;
    int[] field_g;
    int[] field_M;
    byte[] field_K;
    private boolean field_C;
    short[] field_w;
    short[] field_z;
    short[] field_l;
    int[] field_F;
    int field_P;
    int[] field_n;
    short[] field_e;
    int[] field_N;
    short[] field_x;
    int[] field_v;
    static int[] field_B;
    static nf[][] field_k;
    static String field_h;
    int field_L;
    static String field_G;
    short[] field_f;
    int field_H;
    short field_O;
    short[] field_b;
    short[] field_A;
    short[] field_j;
    int field_D;
    short field_t;
    short field_q;
    byte field_E;
    int[] field_m;
    int[] field_a;
    short[] field_d;
    short[] field_o;
    int[] field_I;
    short[] field_y;

    public static void a(byte param0) {
        field_k = (nf[][]) null;
        field_h = null;
        field_G = null;
        if (param0 > -63) {
            pu.a((byte) -1);
        }
        field_B = null;
    }

    private final void c(int param0) {
        this.field_C = false;
        if (param0 != 8) {
            field_B = (int[]) null;
        }
    }

    final static void d(int param0) {
        int var2 = 0;
        of var3 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              vu.field_M = null;
              no.field_K = null;
              ua.field_s = false;
              if (null == be.field_u) {
                break L1;
              } else {
                be.field_u.b(76);
                be.field_u = null;
                break L1;
              }
            }
            oi.field_d = null;
            if (param0 <= -86) {
              L2: {
                if (null == qc.field_g) {
                  break L2;
                } else {
                  qc.field_g.b(94);
                  qc.field_g = null;
                  break L2;
                }
              }
              L3: {
                qm.field_J = null;
                if (wl.field_F != null) {
                  wl.field_F.b(87);
                  wl.field_F = null;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                eu.field_e = null;
                if (null != oi.field_d) {
                  var3 = (of) ((Object) oi.field_d.a((byte) 66));
                  L5: while (true) {
                    if (var3 == null) {
                      oi.field_d = null;
                      break L4;
                    } else {
                      var3.c((byte) -76);
                      var3 = (of) ((Object) oi.field_d.c(1));
                      continue L5;
                    }
                  }
                } else {
                  break L4;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1), "pu.E(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        for (var5 = param1; var5 < this.field_O; var5++) {
            this.field_z[var5] = (short)(this.field_z[var5] + param3);
            this.field_y[var5] = (short)(this.field_y[var5] + param2);
            this.field_o[var5] = (short)(this.field_o[var5] + param0);
        }
        this.c(8);
    }

    final void a(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        var12 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (this.field_C) {
          return;
        } else {
          L0: {
            this.field_C = true;
            var2 = 32767;
            var3 = 32767;
            var4 = 32767;
            var5 = -32768;
            if (param0 == -3831) {
              break L0;
            } else {
              this.c(16);
              break L0;
            }
          }
          var6 = -32768;
          var7 = -32768;
          var8 = 0;
          L1: while (true) {
            if (this.field_O <= var8) {
              this.field_p = var2;
              this.field_P = var6;
              this.field_L = var5;
              this.field_D = var4;
              this.field_H = var3;
              this.field_J = var7;
              return;
            } else {
              L2: {
                var9 = this.field_z[var8];
                var10 = this.field_y[var8];
                if (var9 < var2) {
                  var2 = var9;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (var10 > var6) {
                  var6 = var10;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                var11 = this.field_o[var8];
                if (var3 <= var10) {
                  break L4;
                } else {
                  var3 = var10;
                  break L4;
                }
              }
              L5: {
                if (var5 >= var9) {
                  break L5;
                } else {
                  var5 = var9;
                  break L5;
                }
              }
              L6: {
                if (var11 <= var7) {
                  break L6;
                } else {
                  var7 = var11;
                  break L6;
                }
              }
              if (var4 > var11) {
                var4 = var11;
                var8++;
                continue L1;
              } else {
                var8++;
                continue L1;
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var7 = -96 / ((param4 - 36) / 55);
        for (var6 = 0; var6 < this.field_O; var6++) {
            this.field_z[var6] = (short)(param3 * this.field_z[var6] / param0);
            this.field_y[var6] = (short)(this.field_y[var6] * param2 / param0);
            this.field_o[var6] = (short)(param1 * this.field_o[var6] / param0);
        }
        this.c(8);
    }

    final static void b(int param0) {
        int fieldTemp$2 = 0;
        bv var1 = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 28704) {
                break L1;
              } else {
                field_h = (String) null;
                break L1;
              }
            }
            var1 = vl.field_n;
            L2: while (true) {
              if (!g.a(param0 ^ -13083)) {
                break L0;
              } else {
                var1.h(32161, 8);
                fieldTemp$2 = var1.field_q + 1;
                var1.field_q = var1.field_q + 1;
                var2 = fieldTemp$2;
                fg.a(param0 ^ 28704, var1);
                vl.field_n.e(-var2 + var1.field_q, param0 + -22774);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1_ref), "pu.C(" + param0 + ')');
        }
    }

    pu() {
        this.field_C = false;
        this.field_E = (byte) 0;
    }

    static {
        field_B = new int[]{8};
        field_h = "Achievements";
        field_G = "Names should contain a maximum of 12 characters";
    }
}
