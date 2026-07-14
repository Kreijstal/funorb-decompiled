/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class id {
    short[] field_A;
    short[] field_v;
    short[] field_t;
    static String field_n;
    short[] field_i;
    int field_f;
    short[] field_o;
    static String field_w;
    short[] field_b;
    int[] field_H;
    short[] field_R;
    int[] field_F;
    int[] field_B;
    short[] field_p;
    int field_P;
    int[] field_C;
    int[] field_E;
    byte[] field_u;
    int[] field_c;
    short[] field_K;
    private boolean field_r;
    int field_a;
    int field_m;
    short field_q;
    short[] field_k;
    short[] field_I;
    short[] field_y;
    byte field_Q;
    short[] field_e;
    short field_O;
    short[] field_d;
    short[] field_N;
    int[] field_z;
    int field_j;
    short[] field_l;
    short[] field_D;
    static rb field_M;
    short[] field_g;
    int[] field_G;
    int[] field_h;
    static int field_x;
    short field_s;
    int field_L;

    final void a(int param0, int param1, boolean param2, int param3, int param4) {
        int var6 = 0;
        int var7 = TetraLink.field_J;
        for (var6 = 0; var6 < ((id) this).field_q; var6++) {
            ((id) this).field_D[var6] = (short)(param3 * ((id) this).field_D[var6] / param0);
            ((id) this).field_i[var6] = (short)(param4 * ((id) this).field_i[var6] / param0);
            ((id) this).field_R[var6] = (short)(param1 * ((id) this).field_R[var6] / param0);
        }
        this.a(param2);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = TetraLink.field_J;
        for (var5 = 0; var5 < ((id) this).field_q; var5++) {
            ((id) this).field_D[var5] = (short)(((id) this).field_D[var5] + param2);
            ((id) this).field_i[var5] = (short)(((id) this).field_i[var5] + param3);
            ((id) this).field_R[var5] = (short)(((id) this).field_R[var5] + param0);
        }
        this.a(true);
        if (param1 != 5336) {
            ((id) this).field_C = null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        var13 = TetraLink.field_J;
        var5 = param0 + param4;
        var6 = param3 + param1;
        if (param2 == 0) {
          L0: {
            if (param4 <= ra.field_j) {
              stackOut_4_0 = ra.field_j;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = param4;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var7 = stackIn_5_0;
            if (ra.field_i >= param1) {
              stackOut_7_0 = ra.field_i;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            } else {
              stackOut_6_0 = param1;
              stackIn_8_0 = stackOut_6_0;
              break L1;
            }
          }
          L2: {
            var8 = stackIn_8_0;
            if (ra.field_l <= var5) {
              stackOut_10_0 = ra.field_l;
              stackIn_11_0 = stackOut_10_0;
              break L2;
            } else {
              stackOut_9_0 = var5;
              stackIn_11_0 = stackOut_9_0;
              break L2;
            }
          }
          L3: {
            var9 = stackIn_11_0;
            if (var6 < ra.field_g) {
              stackOut_13_0 = var6;
              stackIn_14_0 = stackOut_13_0;
              break L3;
            } else {
              stackOut_12_0 = ra.field_g;
              stackIn_14_0 = stackOut_12_0;
              break L3;
            }
          }
          L4: {
            var10 = stackIn_14_0;
            if (ra.field_j > param4) {
              break L4;
            } else {
              if (ra.field_l <= param4) {
                break L4;
              } else {
                var11 = param4 + var8 * ra.field_f;
                var12 = -var8 + 1 + var10 >> -1227857887;
                L5: while (true) {
                  var12--;
                  if (var12 < 0) {
                    break L4;
                  } else {
                    ra.field_b[var11] = 16777215;
                    var11 = var11 + 2 * ra.field_f;
                    continue L5;
                  }
                }
              }
            }
          }
          L6: {
            if (param1 < ra.field_i) {
              break L6;
            } else {
              if (var6 < ra.field_g) {
                var11 = var7 + ra.field_f * param1;
                var12 = -var7 + var9 + 1 >> 292682017;
                L7: while (true) {
                  var12--;
                  if (0 > var12) {
                    break L6;
                  } else {
                    ra.field_b[var11] = 16777215;
                    var11 += 2;
                    continue L7;
                  }
                }
              } else {
                break L6;
              }
            }
          }
          L8: {
            if (ra.field_j > var5) {
              break L8;
            } else {
              if (ra.field_l > var5) {
                var11 = var5 + ((1 & var5 + -param4) + var8) * ra.field_f;
                var12 = var10 + 1 - var8 >> -202459839;
                L9: while (true) {
                  var12--;
                  if (0 > var12) {
                    break L8;
                  } else {
                    ra.field_b[var11] = 16777215;
                    var11 = var11 + ra.field_f * 2;
                    continue L9;
                  }
                }
              } else {
                break L8;
              }
            }
          }
          L10: {
            if (param1 < ra.field_i) {
              break L10;
            } else {
              if (var6 < ra.field_g) {
                var11 = var6 * ra.field_f + var7 - -(var6 + -param1 & 1);
                var12 = 1 - -var9 - var7 >> 965384033;
                L11: while (true) {
                  var12--;
                  if (var12 < 0) {
                    break L10;
                  } else {
                    ra.field_b[var11] = 16777215;
                    var11 += 2;
                    continue L11;
                  }
                }
              } else {
                break L10;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final static boolean a(boolean param0, char param1) {
        if (param0) {
            boolean discarded$0 = id.a(false, 'V');
        }
        if (param1 >= 32) {
            if (126 >= param1) {
                return true;
            }
        }
        if (param1 >= 160) {
            if (!(param1 > 255)) {
                return true;
            }
        }
        if (param1 != 8364) {
            if (param1 != 338) {
                if (8212 != param1) {
                    if (param1 != 339) {
                        if (param1 != 376) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void a(int param0) {
        field_w = null;
        field_M = null;
        if (param0 != 338) {
            field_n = null;
        }
        field_n = null;
    }

    private final void a(boolean param0) {
        ((id) this).field_r = false;
        if (!param0) {
            ((id) this).field_l = null;
        }
    }

    final void b(boolean param0) {
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
        var12 = TetraLink.field_J;
        if (((id) this).field_r) {
          return;
        } else {
          ((id) this).field_r = true;
          var2 = 32767;
          var3 = 32767;
          var4 = 32767;
          var5 = -32768;
          var6 = -32768;
          var7 = -32768;
          var8 = 0;
          L0: while (true) {
            if (var8 >= ((id) this).field_q) {
              L1: {
                ((id) this).field_m = var7;
                ((id) this).field_P = var4;
                ((id) this).field_L = var3;
                ((id) this).field_f = var6;
                ((id) this).field_j = var5;
                ((id) this).field_a = var2;
                if (!param0) {
                  break L1;
                } else {
                  id.a(18, 49, -2, 27, 30);
                  break L1;
                }
              }
              return;
            } else {
              L2: {
                var9 = ((id) this).field_D[var8];
                var10 = ((id) this).field_i[var8];
                if (var2 <= var9) {
                  break L2;
                } else {
                  var2 = var9;
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
                if (var9 <= var5) {
                  break L4;
                } else {
                  var5 = var9;
                  break L4;
                }
              }
              L5: {
                if (var10 < var3) {
                  var3 = var10;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                var11 = ((id) this).field_R[var8];
                if (var11 < var4) {
                  var4 = var11;
                  break L6;
                } else {
                  break L6;
                }
              }
              if (var11 > var7) {
                var7 = var11;
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

    id() {
        ((id) this).field_r = false;
        ((id) this).field_Q = (byte) 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Connection lost - attempting to reconnect";
        field_w = "Your opponent is <%0>.";
    }
}
