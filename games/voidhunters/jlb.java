/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jlb extends le {
    private int field_j;
    private int field_m;
    private int[] field_v;
    private int field_p;
    private int[][] field_i;
    private int field_k;
    private int[][] field_w;
    private int field_u;
    private int field_l;
    private int field_n;
    private int field_q;
    private int field_r;
    private int field_o;
    static String field_t;
    private int field_s;

    final int[] a(int param0, boolean param1) {
        int stackIn_14_0 = 0;
        int stackIn_21_0 = 0;
        int[] var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int[] var18;
        int[] var19;
        var17 = VoidHunters.field_G;
        var19 = this.field_f.a((byte) 40, param0);
        var18 = var19;
        var3 = var18;
        if (param1) {
          L0: {
            if (!this.field_f.field_e) {
              break L0;
            } else {
              var7 = 0;
              var9 = this.field_p + sj.field_p[param0];
              L1: while (true) {
                if (0 <= var9) {
                  L2: while (true) {
                    if (4096 >= var9) {
                      L3: while (true) {
                        L4: {
                          if (var7 >= this.field_s) {
                            break L4;
                          } else {
                            if ((var9 ^ -1) > (this.field_v[var7] ^ -1)) {
                              break L4;
                            } else {
                              var7++;
                              continue L3;
                            }
                          }
                        }
                        L5: {
                          var11 = -1 + var7;
                          if ((var7 & 1) != 0) {
                            stackIn_14_0 = 0;
                            break L5;
                          } else {
                            stackIn_14_0 = 1;
                            break L5;
                          }
                        }
                        L6: {
                          var12 = stackIn_14_0;
                          var15 = this.field_v[var7];
                          var16 = this.field_v[-1 + var7];
                          if (this.field_o + var16 >= var9) {
                            break L6;
                          } else {
                            if (var15 + -this.field_o <= var9) {
                              break L6;
                            } else {
                              var4 = 0;
                              L7: while (true) {
                                if (var4 >= hob.field_d) {
                                  break L0;
                                } else {
                                  L8: {
                                    var6 = 0;
                                    if (var12 == 0) {
                                      stackIn_21_0 = -this.field_j;
                                      break L8;
                                    } else {
                                      stackIn_21_0 = this.field_j;
                                      break L8;
                                    }
                                  }
                                  var5 = stackIn_21_0;
                                  var8 = (var5 * this.field_m >> -671452020) + grb.field_l[var4];
                                  L9: while (true) {
                                    if ((var8 ^ -1) <= -1) {
                                      L10: while (true) {
                                        if ((var8 ^ -1) >= -4097) {
                                          L11: while (true) {
                                            L12: {
                                              if (var6 >= this.field_q) {
                                                break L12;
                                              } else {
                                                if ((this.field_w[var11][var6] ^ -1) >= (var8 ^ -1)) {
                                                  var6++;
                                                  continue L11;
                                                } else {
                                                  break L12;
                                                }
                                              }
                                            }
                                            L13: {
                                              var10 = -1 + var6;
                                              var14 = this.field_w[var11][var6];
                                              var13 = this.field_w[var11][var10];
                                              if (var8 <= this.field_o + var13) {
                                                break L13;
                                              } else {
                                                if (-this.field_o + var14 > var8) {
                                                  var3[var4] = this.field_i[var11][var10];
                                                  var4++;
                                                  continue L7;
                                                } else {
                                                  break L13;
                                                }
                                              }
                                            }
                                            var19 = var18;
                                            var19[var4] = 0;
                                            var4++;
                                            continue L7;
                                          }
                                        } else {
                                          var8 -= 4096;
                                          continue L10;
                                        }
                                      }
                                    } else {
                                      var8 += 4096;
                                      continue L9;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        var19 = var18;
                        cua.a(var19, 0, hob.field_d, 0);
                        break L0;
                      }
                    } else {
                      var9 -= 4096;
                      continue L2;
                    }
                  }
                } else {
                  var9 += 4096;
                  continue L1;
                }
              }
            }
          }
          return var3;
        } else {
          return (int[]) null;
        }
    }

    final static boolean b(int param0, int param1, int param2, int param3) {
        if (cka.field_o != null) {
            if (!(!cka.field_o.a(0))) {
                lnb.d(0);
                return true;
            }
        }
        if (crb.field_v != null && crb.field_v.h(-15244)) {
            crb.field_v = null;
            lnb.d(0);
            return true;
        }
        if (!(!nu.e((byte) 114))) {
            return true;
        }
        if (param1 != -2048) {
            jlb.a(false);
        }
        if (rtb.a(param0, -94, param3, param2)) {
            return true;
        }
        return false;
    }

    final void c(byte param0) {
        this.e((byte) -34);
        if (param0 >= -35) {
            this.field_p = -6;
        }
    }

    public jlb() {
        super(0, true);
        this.field_p = 0;
        this.field_u = 1024;
        this.field_j = 1024;
        this.field_l = 204;
        this.field_k = 81;
        this.field_q = 4;
        this.field_r = 409;
        this.field_s = 8;
    }

    private final void e(byte param0) {
        int[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        Random var10;
        var9 = VoidHunters.field_G;
        var10 = new Random((long)this.field_s);
        this.field_m = 4096 / this.field_q;
        this.field_o = this.field_k / 2;
        this.field_n = 4096 / this.field_s;
        var3 = this.field_m / 2;
        if (param0 == -34) {
          this.field_w = new int[this.field_s][1 + this.field_q];
          this.field_i = new int[this.field_s][this.field_q];
          var4 = this.field_n / 2;
          this.field_v = new int[this.field_s - -1];
          this.field_v[0] = 0;
          var5 = 0;
          L0: while (true) {
            if (var5 >= this.field_s) {
              this.field_v[this.field_s] = 4096;
              return;
            } else {
              L1: {
                if ((var5 ^ -1) < -1) {
                  var6 = this.field_n;
                  var7 = (-2048 + hob.a(var10, 4096, 123)) * this.field_l >> -447181460;
                  var6 = var6 + (var7 * var4 >> 2202668);
                  this.field_v[var5] = var6 + this.field_v[-1 + var5];
                  break L1;
                } else {
                  break L1;
                }
              }
              this.field_w[var5][0] = 0;
              var6 = 0;
              L2: while (true) {
                if (this.field_q <= var6) {
                  this.field_w[var5][this.field_q] = 4096;
                  var5++;
                  continue L0;
                } else {
                  L3: {
                    if (var6 > 0) {
                      var7 = this.field_m;
                      var8 = (hob.a(var10, 4096, param0 ^ -91) + -2048) * this.field_r >> -1492058836;
                      var7 = var7 + (var8 * var3 >> 1923576748);
                      this.field_w[var5][var6] = this.field_w[var5][var6 + -1] - -var7;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    stackIn_14_0 = this.field_i[var5];

                    stackIn_14_1 = var6;

                    if ((this.field_u ^ -1) >= -1) {
                      stackIn_15_0 = (int[]) ((Object) stackIn_14_0);
                      stackIn_15_1 = stackIn_14_1;
                      stackIn_15_2 = 4096;
                      break L4;
                    } else {
                      stackIn_15_0 = (int[]) ((Object) stackIn_14_0);
                      stackIn_15_1 = stackIn_14_1;
                      stackIn_15_2 = -hob.a(var10, this.field_u, 123) + 4096;
                      break L4;
                    }
                  }
                  stackIn_15_0[stackIn_15_1] = stackIn_15_2;
                  var6++;
                  continue L2;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, ds param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var4_int = param0;
              if (var4_int != 0) {
                if (var4_int == 1) {
                  this.field_s = param2.e((byte) -118);
                  break L1;
                } else {
                  if (2 == var4_int) {
                    this.field_r = param2.e(1869);
                    break L1;
                  } else {
                    if (var4_int != 3) {
                      if (var4_int == 4) {
                        this.field_j = param2.e(1869);
                        break L1;
                      } else {
                        if (var4_int != 5) {
                          if ((var4_int ^ -1) != -7) {
                            if (7 != var4_int) {
                              break L1;
                            } else {
                              this.field_u = param2.e(1869);
                              break L1;
                            }
                          } else {
                            this.field_k = param2.e(1869);
                            break L1;
                          }
                        } else {
                          this.field_p = param2.e(1869);
                          break L1;
                        }
                      }
                    } else {
                      this.field_l = param2.e(1869);
                      break L1;
                    }
                  }
                }
              } else {
                this.field_q = param2.e((byte) -101);
                break L1;
              }
            }
            L2: {
              if (param1 < -60) {
                break L2;
              } else {
                jlb.b(-48, 83, 33, 63);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var4);

            stackIn_27_1 = new StringBuilder().append("jlb.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L3;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
    }

    public static void a(boolean param0) {
        field_t = null;
        if (!param0) {
            field_t = (String) null;
        }
    }

    static {
        field_t = "Destroy the enemy VIP";
    }
}
