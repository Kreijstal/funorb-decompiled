/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class oi extends aja {
    static int field_h;
    static int field_B;
    private int[] field_t;
    static int field_f;
    static int field_i;
    private static int field_c;
    static int field_s;
    static int field_l;
    static int field_p;
    static int field_a;
    static int field_v;
    int field_j;
    private static int field_d;
    static int field_E;
    static int field_b;
    static int field_u;
    int field_n;
    static int field_g;
    static int field_o;
    static int field_C;
    private static int field_r;
    int field_q;
    static int field_x;
    static int field_z;
    int field_D;
    int field_k;
    static int field_m;
    sob field_w;
    private static int field_A;
    static int field_y;
    int field_e;

    abstract void b(int param0, int param1);

    final void a(int param0, int param1, int param2, int param3) {
        ((oi) this).field_k = param0;
        ((oi) this).field_n = param1;
        ((oi) this).field_D = param2;
        ((oi) this).field_j = param3;
    }

    final int b() {
        return ((oi) this).field_n + ((oi) this).field_q + ((oi) this).field_j;
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4);

    final int d() {
        return ((oi) this).field_e;
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7);

    abstract void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6);

    final int c() {
        return ((oi) this).field_k + ((oi) this).field_e + ((oi) this).field_D;
    }

    private final boolean a(float param0, float param1, float param2, float param3, float param4, float param5) {
        int var7 = 0;
        int var8 = 0;
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        float var19 = 0.0f;
        float var20 = 0.0f;
        L0: {
          L1: {
            var7 = ((oi) this).field_k + ((oi) this).field_e + ((oi) this).field_D;
            var8 = ((oi) this).field_n + ((oi) this).field_q + ((oi) this).field_j;
            if (var7 != ((oi) this).field_e) {
              break L1;
            } else {
              if (var8 == ((oi) this).field_q) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var9 = (param2 - param0) / (float)var7;
          var10 = (param3 - param1) / (float)var7;
          var11 = (param4 - param0) / (float)var8;
          var12 = (param5 - param1) / (float)var8;
          var13 = var11 * (float)((oi) this).field_n;
          var14 = var12 * (float)((oi) this).field_n;
          var15 = var9 * (float)((oi) this).field_k;
          var16 = var10 * (float)((oi) this).field_k;
          var17 = -var9 * (float)((oi) this).field_D;
          var18 = -var10 * (float)((oi) this).field_D;
          var19 = -var11 * (float)((oi) this).field_j;
          var20 = -var12 * (float)((oi) this).field_j;
          param0 = param0 + (var15 + var13);
          param1 = param1 + (var16 + var14);
          param2 = param2 + (var17 + var13);
          param3 = param3 + (var18 + var14);
          param4 = param4 + (var15 + var19);
          param5 = param5 + (var16 + var20);
          break L0;
        }
        L2: {
          var9 = param4 + (param2 - param0);
          var10 = param3 + (param5 - param1);
          if (param0 >= param2) {
            var11 = param2;
            var12 = param0;
            break L2;
          } else {
            var11 = param0;
            var12 = param2;
            break L2;
          }
        }
        L3: {
          if (param4 >= var11) {
            break L3;
          } else {
            var11 = param4;
            break L3;
          }
        }
        L4: {
          if (var9 >= var11) {
            break L4;
          } else {
            var11 = var9;
            break L4;
          }
        }
        L5: {
          if (param4 <= var12) {
            break L5;
          } else {
            var12 = param4;
            break L5;
          }
        }
        L6: {
          if (var9 <= var12) {
            break L6;
          } else {
            var12 = var9;
            break L6;
          }
        }
        L7: {
          if (param1 >= param3) {
            var13 = param3;
            var14 = param1;
            break L7;
          } else {
            var13 = param1;
            var14 = param3;
            break L7;
          }
        }
        L8: {
          if (param5 >= var13) {
            break L8;
          } else {
            var13 = param5;
            break L8;
          }
        }
        L9: {
          if (var10 >= var13) {
            break L9;
          } else {
            var13 = var10;
            break L9;
          }
        }
        L10: {
          if (param5 <= var14) {
            break L10;
          } else {
            var14 = param5;
            break L10;
          }
        }
        L11: {
          if (var10 <= var14) {
            break L11;
          } else {
            var14 = var10;
            break L11;
          }
        }
        L12: {
          if (var11 >= (float)((oi) this).field_w.field_H) {
            break L12;
          } else {
            var11 = (float)((oi) this).field_w.field_H;
            break L12;
          }
        }
        L13: {
          if (var12 <= (float)((oi) this).field_w.field_A) {
            break L13;
          } else {
            var12 = (float)((oi) this).field_w.field_A;
            break L13;
          }
        }
        L14: {
          if (var13 >= (float)((oi) this).field_w.field_n) {
            break L14;
          } else {
            var13 = (float)((oi) this).field_w.field_n;
            break L14;
          }
        }
        L15: {
          if (var14 <= (float)((oi) this).field_w.field_p) {
            break L15;
          } else {
            var14 = (float)((oi) this).field_w.field_p;
            break L15;
          }
        }
        var12 = var11 - var12;
        if (var12 < 0.0f) {
          var14 = var13 - var14;
          if (var14 < 0.0f) {
            field_o = ((oi) this).field_w.field_i;
            field_f = (int)((float)((int)var13 * field_o) + var11);
            var15 = (param2 - param0) * (param5 - param1) - (param3 - param1) * (param4 - param0);
            var16 = (param4 - param0) * (param3 - param1) - (param5 - param1) * (param2 - param0);
            field_C = (int)((param5 - param1) * 4096.0f * (float)((oi) this).field_e / var15);
            field_v = (int)((param3 - param1) * 4096.0f * (float)((oi) this).field_q / var16);
            field_z = (int)((param4 - param0) * 4096.0f * (float)((oi) this).field_e / var16);
            field_u = (int)((param2 - param0) * 4096.0f * (float)((oi) this).field_q / var15);
            field_A = (int)(var11 * 16.0f + 8.0f - (param0 + param2 + param4 + var9) / 4.0f * 16.0f);
            field_d = (int)(var13 * 16.0f + 8.0f - (param1 + param3 + param5 + var10) / 4.0f * 16.0f);
            field_m = (((oi) this).field_e >> 1 << 12) + (field_d * field_z >> 4);
            field_p = (((oi) this).field_q >> 1 << 12) + (field_d * field_u >> 4);
            field_a = field_A * field_C >> 4;
            field_l = field_A * field_v >> 4;
            field_B = (int)var12;
            field_h = (int)var14;
            return true;
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (((oi) this).field_w.g()) {
            throw new IllegalStateException();
        }
        if (((oi) this).field_t == null) {
            ((oi) this).field_t = new int[4];
        }
        ((oi) this).field_w.K(((oi) this).field_t);
        ((oi) this).field_w.T(((oi) this).field_w.field_H, ((oi) this).field_w.field_n, param0 + param2, param1 + param3);
        int var8 = ((oi) this).c();
        int var9 = ((oi) this).b();
        int var10 = (param2 + var8 - 1) / var8;
        int var11 = (param3 + var9 - 1) / var9;
        for (var12 = 0; var12 < var11; var12++) {
            var13 = var12 * var9;
            for (var14 = 0; var14 < var10; var14++) {
                ((oi) this).a(param0 + var14 * var8, param1 + var13, param4, param5, param6);
            }
        }
        ((oi) this).field_w.KA(((oi) this).field_t[0], ((oi) this).field_t[1], ((oi) this).field_t[2], ((oi) this).field_t[3]);
    }

    final int a() {
        return ((oi) this).field_q;
    }

    final void a(float param0, float param1, float param2, float param3, float param4, float param5, int param6, int param7, int param8, int param9) {
        int var11 = 0;
        int var12 = 0;
        if (!((oi) this).field_w.g()) {
          if (this.a(param0, param1, param2, param3, param4, param5)) {
            L0: {
              field_y = param7;
              if (param6 == 1) {
                break L0;
              } else {
                field_i = param7 >>> 24;
                field_b = 256 - field_i;
                if (param6 != 0) {
                  if (param6 != 2) {
                    break L0;
                  } else {
                    field_c = param7 >>> 24;
                    field_r = 256 - field_c;
                    var11 = (param7 & 16711935) * field_r & -16711936;
                    var12 = (param7 & 65280) * field_r & 16711680;
                    field_g = (var11 | var12) >>> 8;
                    break L0;
                  }
                } else {
                  field_x = (param7 & 16711680) >> 16;
                  field_s = (param7 & 65280) >> 8;
                  field_E = param7 & 255;
                  break L0;
                }
              }
            }
            L1: {
              if (param6 != 1) {
                if (param6 != 0) {
                  if (param6 != 3) {
                    if (param6 != 2) {
                      break L1;
                    } else {
                      if (param8 != 0) {
                        if (param8 != 1) {
                          if (param8 != 2) {
                            break L1;
                          } else {
                            ((oi) this).b(2, 2);
                            break L1;
                          }
                        } else {
                          ((oi) this).b(2, 1);
                          break L1;
                        }
                      } else {
                        ((oi) this).b(2, 0);
                        break L1;
                      }
                    }
                  } else {
                    if (param8 != 0) {
                      if (param8 != 1) {
                        if (param8 != 2) {
                          break L1;
                        } else {
                          ((oi) this).b(3, 2);
                          break L1;
                        }
                      } else {
                        ((oi) this).b(3, 1);
                        break L1;
                      }
                    } else {
                      ((oi) this).b(3, 0);
                      break L1;
                    }
                  }
                } else {
                  if (param8 != 0) {
                    if (param8 != 1) {
                      if (param8 != 2) {
                        break L1;
                      } else {
                        ((oi) this).b(0, 2);
                        break L1;
                      }
                    } else {
                      ((oi) this).b(0, 1);
                      break L1;
                    }
                  } else {
                    ((oi) this).b(0, 0);
                    break L1;
                  }
                }
              } else {
                if (param8 != 0) {
                  if (param8 != 1) {
                    if (param8 != 2) {
                      break L1;
                    } else {
                      ((oi) this).b(1, 2);
                      break L1;
                    }
                  } else {
                    ((oi) this).b(1, 1);
                    break L1;
                  }
                } else {
                  ((oi) this).b(1, 0);
                  break L1;
                }
              }
            }
            return;
          } else {
            return;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    oi(sob param0, int param1, int param2) {
        ((oi) this).field_w = param0;
        ((oi) this).field_e = param1;
        ((oi) this).field_q = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 0;
        field_b = 0;
        field_x = 0;
        field_i = 0;
        field_c = 0;
        field_s = 0;
        field_r = 0;
        field_E = 0;
    }
}
