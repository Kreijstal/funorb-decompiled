/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe {
    int[] field_t;
    static String[] field_h;
    short[] field_H;
    int[] field_S;
    int field_n;
    static String field_U;
    static String field_R;
    short[] field_m;
    short field_u;
    byte field_K;
    short field_L;
    int field_p;
    short[] field_C;
    int field_J;
    int[] field_X;
    short[] field_F;
    short[] field_k;
    int[] field_a;
    short[] field_T;
    short[] field_E;
    short[] field_i;
    int field_s;
    short[] field_V;
    static String[] field_D;
    short[] field_g;
    byte[] field_P;
    int[] field_Q;
    short[] field_G;
    int[] field_r;
    short[] field_x;
    short[] field_y;
    short[] field_M;
    int[] field_Z;
    private boolean field_f;
    short[] field_j;
    short field_w;
    short[] field_z;
    static fm field_A;
    short[] field_e;
    int[] field_B;
    int field_W;
    int field_c;
    short[] field_Y;
    static gh field_v;
    static int[] field_O;
    int[] field_l;
    static int field_d;
    static int[] field_N;
    static int[] field_b;
    static int[] field_o;
    static int[] field_q;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = SteelSentinels.field_G;
        for (var6 = 0; var6 < ((pe) this).field_L; var6++) {
            ((pe) this).field_z[var6] = (short)(((pe) this).field_z[var6] * param1 / param2);
            ((pe) this).field_m[var6] = (short)(((pe) this).field_m[var6] * param3 / param2);
            ((pe) this).field_C[var6] = (short)(param0 * ((pe) this).field_C[var6] / param2);
        }
        if (param4 != 14866) {
            return;
        }
        this.a(param4 ^ 14956);
    }

    final void b(int param0) {
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
        var12 = SteelSentinels.field_G;
        if (((pe) this).field_f) {
          return;
        } else {
          ((pe) this).field_f = true;
          var2 = 32767;
          var3 = 32767;
          var4 = param0;
          var5 = -32768;
          var6 = -32768;
          var7 = -32768;
          var8 = 0;
          L0: while (true) {
            if (var8 >= ((pe) this).field_L) {
              ((pe) this).field_n = var7;
              ((pe) this).field_W = var6;
              ((pe) this).field_s = var4;
              ((pe) this).field_J = var2;
              ((pe) this).field_c = var5;
              ((pe) this).field_p = var3;
              return;
            } else {
              L1: {
                var9 = ((pe) this).field_z[var8];
                var10 = ((pe) this).field_m[var8];
                if (var9 < var2) {
                  var2 = var9;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var5 < var9) {
                  var5 = var9;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                var11 = ((pe) this).field_C[var8];
                if (var10 <= var6) {
                  break L3;
                } else {
                  var6 = var10;
                  break L3;
                }
              }
              L4: {
                if (var3 <= var10) {
                  break L4;
                } else {
                  var3 = var10;
                  break L4;
                }
              }
              L5: {
                if (var11 <= var7) {
                  break L5;
                } else {
                  var7 = var11;
                  break L5;
                }
              }
              if (var4 > var11) {
                var4 = var11;
                var8++;
                continue L0;
              } else {
                var8++;
                continue L0;
              }
            }
          }
        }
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = SteelSentinels.field_G;
          var2 = 0;
          var3 = vn.field_h;
          if (var3 < 5) {
            var2 = var3 * var3 * 8192 / 1100;
            break L0;
          } else {
            if (var3 < 105) {
              var2 = (16384 * var3 - 40960) / 220;
              break L0;
            } else {
              if (120 > var3) {
                var3 = -var3 + 120;
                var2 = 8192 + -(8192 * (var3 * var3) / 3300);
                break L0;
              } else {
                break L0;
              }
            }
          }
        }
        L1: {
          var4 = 1;
          var5 = 0;
          if (3 != param0) {
            break L1;
          } else {
            var4 = -1;
            break L1;
          }
        }
        L2: {
          if (1 != param0) {
            break L2;
          } else {
            var5 = 1;
            break L2;
          }
        }
        L3: {
          if (param0 == 4) {
            var5 = 1;
            var4 = 1;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (param0 != 5) {
            break L4;
          } else {
            var4 = -1;
            var5 = 1;
            break L4;
          }
        }
        L5: {
          if (param0 != 6) {
            break L5;
          } else {
            var5 = -1;
            var4 = 1;
            break L5;
          }
        }
        if (param1 < -24) {
          L6: {
            L7: {
              if (param0 == 7) {
                break L7;
              } else {
                if (8 == param0) {
                  break L7;
                } else {
                  break L6;
                }
              }
            }
            var5 = -1;
            var4 = -1;
            break L6;
          }
          L8: {
            if (11 == param0) {
              var4 = -1;
              break L8;
            } else {
              break L8;
            }
          }
          L9: {
            if (param0 != 12) {
              break L9;
            } else {
              var4 = -1;
              var5 = -1;
              break L9;
            }
          }
          L10: {
            if (13 == param0) {
              var5 = -1;
              var4 = 1;
              break L10;
            } else {
              break L10;
            }
          }
          L11: {
            if (param0 != 14) {
              break L11;
            } else {
              var4 = -1;
              var5 = 1;
              break L11;
            }
          }
          L12: {
            if (param0 != 15) {
              break L12;
            } else {
              var4 = 1;
              var5 = 1;
              break L12;
            }
          }
          bl.field_e = dn.a(var5 * var2, var4 * var2, (byte) 71);
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = SteelSentinels.field_G;
        for (var5 = param0; var5 < ((pe) this).field_L; var5++) {
            ((pe) this).field_z[var5] = (short)(((pe) this).field_z[var5] + param3);
            ((pe) this).field_m[var5] = (short)(((pe) this).field_m[var5] + param1);
            ((pe) this).field_C[var5] = (short)(((pe) this).field_C[var5] + param2);
        }
        this.a(-20);
    }

    public static void a(byte param0) {
        field_N = null;
        field_A = null;
        field_q = null;
        field_D = null;
        field_R = null;
        field_b = null;
        field_h = null;
        field_O = null;
        field_v = null;
        field_o = null;
        field_U = null;
    }

    private final void a(int param0) {
        int var2 = 77 % ((param0 - 64) / 62);
        ((pe) this).field_f = false;
    }

    pe() {
        ((pe) this).field_K = (byte) 0;
        ((pe) this).field_f = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        field_R = "Help";
        field_D = new String[]{"<%1> fell into <%0>'s flak", "<%1> was perforated by <%0>'s minigun", "<%1> was incinerated by <%0>", "<%1> felt <%0>'s electrostatic force", "<%1> was lasered by <%0>", "<%1> was melted by <%0>", "<%1> couldn't dodge <%0>'s missile", "<%1> was pierced by <%0>", "<%1> short-circuited because of <%0>", "<%1> was fragged by <%0>", "<%1> was electrocuted by <%0>", "<%1> fell into <%0>'s heavy flak", "<%1> was perforated by <%0>'s heavy gun", "<%1> decided to catch <%0>'s shell", "<%1> fell foul of <%0>'s artillery", "<%1> was sniped by <%0>", "<%1> got erased by <%0>", "<%1> was taught about the power of light by <%0>", "<%1> was vaporised by <%0>", "<%1> was engulfed by <%0>'s rocket spread", "<%1> got a present from <%0>", "<%1> caught <%0>'s lightning", "", "", "", "", "<%1> looked down the barrel of <%0>'s ultra gun", "<%1> rode <%0>'s shell", "<%1> had death rained down from <%0>", "<%1> was turned into slag by <%0>", "<%1> stared into <%0>'s sun for too long", "<%1> was atomised by <%0>", "<%1> fell to <%0>'s judgement", "<%1> was lost when <%0>'s rocket found its mark", "<%1> failed to avoid <%0>'s missile", "<%1> received serenity from <%0>"};
        field_U = "Game full";
        field_h = new String[]{"NAME", "RATING", "PLAYED", "WON", "DRAWN", "LOST"};
        field_A = new fm(15, 0, 1, 0);
        field_O = new int[]{0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 7, 4, 4, 4, 7, 0, 4, 5, 5, 6, 5, 3, 3, 6, 6, 4, 5, 3, 3, 7};
        field_d = -1;
        field_N = new int[128];
        field_o = new int[128];
        var2 = 0;
        L0: while (true) {
          if (var2 >= 128) {
            field_b = new int[128];
            var2 = 0;
            L1: while (true) {
              if (var2 >= 128) {
                field_q = new int[128];
                var2 = 0;
                L2: while (true) {
                  if (128 <= var2) {
                    return;
                  } else {
                    var3 = field_o[var2] & 255;
                    var4 = (16719614 & field_o[var2]) >> 16;
                    field_q[var2] = var4 + 65792 * var3;
                    var2++;
                    continue L2;
                  }
                }
              } else {
                var3 = 255 & field_o[var2];
                var4 = field_o[var2] >> 16 & 255;
                field_b[var2] = (var3 << 16) - -(257 * var4);
                var2++;
                continue L1;
              }
            }
          } else {
            var0 = 1114111;
            var1 = (var0 & 16711935) * ((255 + var2 * 255) / 128);
            field_o[var2] = ec.a(-16711936, var1) - -ec.a(16711680, var0 * (255 * (1 + var2) / 128) - var1) >>> 8;
            var0 = 16776976;
            var1 = (255 + var2 * 255) / 128 * (var0 & 16711935);
            field_N[var2] = ec.a(-var1 + (1 + var2) * 255 / 128 * var0, 16711680) + ec.a(var1, -16711936) >>> 8;
            var2++;
            continue L0;
          }
        }
    }
}
