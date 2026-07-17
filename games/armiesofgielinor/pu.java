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
        field_k = null;
        field_h = null;
        field_G = null;
        if (param0 > -63) {
            pu.a((byte) -1);
        }
        field_B = null;
    }

    private final void c(int param0) {
        ((pu) this).field_C = false;
        if (param0 != 8) {
            field_B = null;
        }
    }

    final static void d() {
        RuntimeException var1 = null;
        int var2 = 0;
        of var3 = null;
        RuntimeException decompiledCaughtException = null;
        var2 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              vu.field_M = null;
              no.field_K = null;
              ua.field_s = false;
              if (null == be.field_u) {
                oi.field_d = null;
                break L1;
              } else {
                be.field_u.b(76);
                be.field_u = null;
                oi.field_d = null;
                break L1;
              }
            }
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
                var3 = (of) (Object) oi.field_d.a((byte) 66);
                L5: while (true) {
                  if (var3 == null) {
                    oi.field_d = null;
                    break L4;
                  } else {
                    var3.c((byte) -76);
                    var3 = (of) (Object) oi.field_d.c(1);
                    continue L5;
                  }
                }
              } else {
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1, "pu.E(" + -112 + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        for (var5 = param1; var5 < ((pu) this).field_O; var5++) {
            ((pu) this).field_z[var5] = (short)(((pu) this).field_z[var5] + param3);
            ((pu) this).field_y[var5] = (short)(((pu) this).field_y[var5] + param2);
            ((pu) this).field_o[var5] = (short)(((pu) this).field_o[var5] + param0);
        }
        this.c(8);
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (((pu) this).field_C) {
          return;
        } else {
          L0: {
            ((pu) this).field_C = true;
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
            if (((pu) this).field_O <= var8) {
              ((pu) this).field_p = var2;
              ((pu) this).field_P = var6;
              ((pu) this).field_L = var5;
              ((pu) this).field_D = var4;
              ((pu) this).field_H = var3;
              ((pu) this).field_J = var7;
              return;
            } else {
              L2: {
                var9 = ((pu) this).field_z[var8];
                var10 = ((pu) this).field_y[var8];
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
                var11 = ((pu) this).field_o[var8];
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
        for (var6 = 0; var6 < ((pu) this).field_O; var6++) {
            ((pu) this).field_z[var6] = (short)(param3 * ((pu) this).field_z[var6] / param0);
            ((pu) this).field_y[var6] = (short)(((pu) this).field_y[var6] * param2 / param0);
            ((pu) this).field_o[var6] = (short)(param1 * ((pu) this).field_o[var6] / param0);
        }
        this.c(8);
    }

    final static void b() {
        bv var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var1 = vl.field_n;
            L1: while (true) {
              int discarded$9 = -17211;
              if (!g.a()) {
                break L0;
              } else {
                var1.h(32161, 8);
                int fieldTemp$10 = var1.field_q + 1;
                var1.field_q = var1.field_q + 1;
                var2 = fieldTemp$10;
                fg.a(0, var1);
                vl.field_n.e(-var2 + var1.field_q, 5930);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1_ref, "pu.C(" + 28704 + 41);
        }
    }

    pu() {
        ((pu) this).field_C = false;
        ((pu) this).field_E = (byte) 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = new int[]{8};
        field_h = "Achievements";
        field_G = "Names should contain a maximum of 12 characters";
    }
}
