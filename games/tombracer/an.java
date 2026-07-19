/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class an {
    byte[] field_q;
    int[] field_J;
    int field_b;
    int field_a;
    short field_I;
    short[] field_e;
    short[] field_f;
    int[] field_j;
    short[] field_k;
    int[] field_E;
    int field_p;
    short[] field_r;
    short[] field_c;
    int[] field_o;
    int field_i;
    int[] field_G;
    short field_A;
    int[] field_L;
    int[] field_x;
    short[] field_H;
    short[] field_t;
    short[] field_y;
    int field_m;
    int[] field_F;
    static oc[] field_g;
    short[] field_d;
    short[] field_s;
    short[] field_w;
    short[] field_M;
    byte field_K;
    short[] field_h;
    short[] field_D;
    short[] field_l;
    private boolean field_n;
    short[] field_B;
    int field_z;
    short[] field_N;
    short[] field_C;
    short field_u;
    int[] field_v;

    final void a(int param0, int param1, int param2, boolean param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        var6 = 0;
        L0: while (true) {
          if (this.field_I > var6) {
            this.field_l[var6] = (short)(param1 * this.field_l[var6] / param4);
            this.field_h[var6] = (short)(this.field_h[var6] * param2 / param4);
            this.field_t[var6] = (short)(this.field_t[var6] * param0 / param4);
            var6++;
            if (var7 == 0) {
              continue L0;
            } else {
              return;
            }
          } else {
            this.a(param3);
            return;
          }
        }
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 != -32768) {
            field_g = (oc[]) null;
        }
    }

    private final void a(boolean param0) {
        if (!param0) {
            an.a(-106);
            this.field_n = false;
            return;
        }
        this.field_n = false;
    }

    final void a(byte param0) {
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
        var12 = TombRacer.field_G ? 1 : 0;
        if (param0 < -112) {
          if (this.field_n) {
            return;
          } else {
            this.field_n = true;
            var2 = 32767;
            var3 = 32767;
            var4 = 32767;
            var5 = -32768;
            var6 = -32768;
            var7 = -32768;
            var8 = 0;
            L0: while (true) {
              L1: {
                L2: {
                  if (var8 >= this.field_I) {
                    break L2;
                  } else {
                    var9 = this.field_l[var8];
                    var10 = this.field_h[var8];
                    if (var12 != 0) {
                      break L1;
                    } else {
                      L3: {
                        if (var10 < var3) {
                          var3 = var10;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        var11 = this.field_t[var8];
                        if (var6 >= var10) {
                          break L4;
                        } else {
                          var6 = var10;
                          break L4;
                        }
                      }
                      L5: {
                        if (var2 <= var9) {
                          break L5;
                        } else {
                          var2 = var9;
                          break L5;
                        }
                      }
                      L6: {
                        if (var9 > var5) {
                          var5 = var9;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        if (var11 > var7) {
                          var7 = var11;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      L8: {
                        if (var4 <= var11) {
                          break L8;
                        } else {
                          var4 = var11;
                          break L8;
                        }
                      }
                      var8++;
                      if (var12 == 0) {
                        continue L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                this.field_z = var2;
                this.field_p = var4;
                this.field_b = var3;
                this.field_m = var6;
                this.field_a = var7;
                this.field_i = var5;
                break L1;
              }
              return;
            }
          }
        } else {
          this.a(10, -119, 107, false, 71);
          if (this.field_n) {
            return;
          } else {
            this.field_n = true;
            var2 = 32767;
            var3 = 32767;
            var4 = 32767;
            var5 = -32768;
            var6 = -32768;
            var7 = -32768;
            var8 = 0;
            L9: while (true) {
              L10: {
                L11: {
                  if (var8 >= this.field_I) {
                    break L11;
                  } else {
                    var9 = this.field_l[var8];
                    var10 = this.field_h[var8];
                    if (var12 != 0) {
                      break L10;
                    } else {
                      L12: {
                        if (var10 < var3) {
                          var3 = var10;
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      L13: {
                        var11 = this.field_t[var8];
                        if (var6 >= var10) {
                          break L13;
                        } else {
                          var6 = var10;
                          break L13;
                        }
                      }
                      L14: {
                        if (var2 <= var9) {
                          break L14;
                        } else {
                          var2 = var9;
                          break L14;
                        }
                      }
                      L15: {
                        if (var9 > var5) {
                          var5 = var9;
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                      L16: {
                        if (var11 > var7) {
                          var7 = var11;
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                      L17: {
                        if (var4 <= var11) {
                          break L17;
                        } else {
                          var4 = var11;
                          break L17;
                        }
                      }
                      var8++;
                      if (var12 == 0) {
                        continue L9;
                      } else {
                        break L11;
                      }
                    }
                  }
                }
                this.field_z = var2;
                this.field_p = var4;
                this.field_b = var3;
                this.field_m = var6;
                this.field_a = var7;
                this.field_i = var5;
                break L10;
              }
              return;
            }
          }
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        if (param2 == -86) {
          var5 = 0;
          L0: while (true) {
            if (this.field_I > var5) {
              this.field_l[var5] = (short)(this.field_l[var5] + param1);
              this.field_h[var5] = (short)(this.field_h[var5] + param3);
              this.field_t[var5] = (short)(this.field_t[var5] + param0);
              var5++;
              if (var6 == 0) {
                continue L0;
              } else {
                return;
              }
            } else {
              this.a(true);
              return;
            }
          }
        } else {
          this.field_D = (short[]) null;
          var5 = 0;
          L1: while (true) {
            if (this.field_I > var5) {
              this.field_l[var5] = (short)(this.field_l[var5] + param1);
              this.field_h[var5] = (short)(this.field_h[var5] + param3);
              this.field_t[var5] = (short)(this.field_t[var5] + param0);
              var5++;
              if (var6 == 0) {
                continue L1;
              } else {
                return;
              }
            } else {
              this.a(true);
              return;
            }
          }
        }
    }

    an() {
        this.field_n = false;
        this.field_K = (byte) 0;
    }

    static {
    }
}
