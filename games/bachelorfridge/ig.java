/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ig extends k {
    private int field_x;
    private int field_v;
    private int[][] field_r;
    private int field_o;
    private int field_l;
    private int field_k;
    private int[][] field_p;
    private int field_q;
    private int field_s;
    private int field_y;
    private int field_t;
    static pf field_m;
    private int field_w;
    private int[] field_u;
    private int field_n;

    private final void b(boolean param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Random var10 = null;
        Random var11 = null;
        int[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int[] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int[] stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        var9 = BachelorFridge.field_y;
        var10 = new Random((long)this.field_v);
        var11 = var10;
        this.field_l = 4096 / this.field_v;
        this.field_n = this.field_w / 2;
        this.field_q = 4096 / this.field_x;
        var3 = this.field_q / 2;
        this.field_r = new int[this.field_v][1 + this.field_x];
        this.field_u = new int[this.field_v + 1];
        this.field_p = new int[this.field_v][this.field_x];
        var4 = this.field_l / 2;
        if (param0) {
          this.field_u[0] = 0;
          var5 = 0;
          L0: while (true) {
            if (this.field_v <= var5) {
              this.field_u[this.field_v] = 4096;
              return;
            } else {
              L1: {
                if (-1 > (var5 ^ -1)) {
                  var6 = this.field_l;
                  var7 = (kla.a(4096, var11, -2147483648) + -2048) * this.field_o >> -34972692;
                  var6 = var6 + (var4 * var7 >> -196518356);
                  this.field_u[var5] = this.field_u[-1 + var5] - -var6;
                  break L1;
                } else {
                  break L1;
                }
              }
              this.field_r[var5][0] = 0;
              var6 = 0;
              L2: while (true) {
                if (this.field_x <= var6) {
                  this.field_r[var5][this.field_x] = 4096;
                  var5++;
                  continue L0;
                } else {
                  L3: {
                    if (-1 > (var6 ^ -1)) {
                      var7 = this.field_q;
                      var8 = (kla.a(4096, var11, -2147483648) - 2048) * this.field_k >> -200560020;
                      var7 = var7 + (var3 * var8 >> -657443380);
                      this.field_r[var5][var6] = var7 + this.field_r[var5][var6 + -1];
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    stackOut_12_0 = this.field_p[var5];
                    stackOut_12_1 = var6;
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_14_1 = stackOut_12_1;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    if (-1 > (this.field_s ^ -1)) {
                      stackOut_14_0 = (int[]) ((Object) stackIn_14_0);
                      stackOut_14_1 = stackIn_14_1;
                      stackOut_14_2 = -kla.a(this.field_s, var10, -2147483648) + 4096;
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      stackIn_15_2 = stackOut_14_2;
                      break L4;
                    } else {
                      stackOut_13_0 = (int[]) ((Object) stackIn_13_0);
                      stackOut_13_1 = stackIn_13_1;
                      stackOut_13_2 = 4096;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_15_1 = stackOut_13_1;
                      stackIn_15_2 = stackOut_13_2;
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

    public ig() {
        super(0, true);
        this.field_o = 204;
        this.field_s = 1024;
        this.field_v = 8;
        this.field_k = 409;
        this.field_y = 1024;
        this.field_t = 0;
        this.field_w = 81;
        this.field_x = 4;
    }

    public static void d(int param0) {
        if (param0 != 0) {
            field_m = (pf) null;
        }
        field_m = null;
    }

    final static vb a(int param0, lu param1) {
        RuntimeException var2 = null;
        vb stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        vb stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                field_m = (pf) null;
                break L1;
              }
            }
            stackOut_2_0 = new vb(param1.c((byte) -85), param1.c((byte) -85), param1.c((byte) -85), param1.c((byte) -85), param1.a(3), param1.a(param0 ^ 3), param1.b(16711935));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("ig.C(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(byte param0, lu param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            if (param0 == -71) {
              L1: {
                var4_int = param2;
                if (var4_int == 0) {
                  this.field_x = param1.b(16711935);
                  break L1;
                } else {
                  if (var4_int != 1) {
                    if (var4_int == 2) {
                      this.field_k = param1.e((byte) 103);
                      break L1;
                    } else {
                      if ((var4_int ^ -1) != -4) {
                        if (-5 != (var4_int ^ -1)) {
                          if (var4_int != 5) {
                            if (var4_int != 6) {
                              if (7 != var4_int) {
                                break L1;
                              } else {
                                this.field_s = param1.e((byte) 99);
                                break L1;
                              }
                            } else {
                              this.field_w = param1.e((byte) 52);
                              break L1;
                            }
                          } else {
                            this.field_t = param1.e((byte) 56);
                            break L1;
                          }
                        } else {
                          this.field_y = param1.e((byte) 59);
                          break L1;
                        }
                      } else {
                        this.field_o = param1.e((byte) 123);
                        break L1;
                      }
                    }
                  } else {
                    this.field_v = param1.b(16711935);
                    break L1;
                  }
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
          L2: {
            var4 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) (var4);
            stackOut_26_1 = new StringBuilder().append("ig.E(").append(param0).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L2;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static cj a(lu param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        cj stackIn_2_0 = null;
        ce stackIn_6_0 = null;
        hba stackIn_10_0 = null;
        vja stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ce stackOut_5_0 = null;
        hba stackOut_9_0 = null;
        vja stackOut_11_0 = null;
        cj stackOut_1_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (param1 > 51) {
              var2_int = param0.e((byte) 64);
              if (3 == ((t) ((Object) al.a(103, var2_int))).field_p) {
                stackOut_5_0 = kfa.a(param0, 4096, var2_int);
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (((t) ((Object) al.a(118, var2_int))).field_p == 2) {
                  stackOut_9_0 = nh.a(param0, var2_int, (byte) -116);
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackOut_11_0 = new vja(var2_int, param0);
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            } else {
              stackOut_1_0 = (cj) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var2);
            stackOut_13_1 = new StringBuilder().append("ig.H(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L1;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L1;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (cj) ((Object) stackIn_6_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (cj) ((Object) stackIn_10_0);
            } else {
              return (cj) ((Object) stackIn_12_0);
            }
          }
        }
    }

    final int[] a(int param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int[] var18 = null;
        int[] var19 = null;
        int stackIn_15_0 = 0;
        int stackIn_22_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        L0: {
          var17 = BachelorFridge.field_y;
          if (param1 == 0) {
            break L0;
          } else {
            this.field_y = 126;
            break L0;
          }
        }
        L1: {
          var19 = this.field_j.a(param0, -1);
          var18 = var19;
          var3 = var18;
          if (!this.field_j.field_m) {
            break L1;
          } else {
            var7 = 0;
            var9 = tj.field_f[param0] - -this.field_t;
            L2: while (true) {
              if (var9 >= 0) {
                L3: while (true) {
                  if (var9 <= 4096) {
                    L4: while (true) {
                      L5: {
                        if (var7 >= this.field_v) {
                          break L5;
                        } else {
                          if (this.field_u[var7] <= var9) {
                            var7++;
                            continue L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        var11 = -1 + var7;
                        if (0 != (1 & var7)) {
                          stackOut_14_0 = 0;
                          stackIn_15_0 = stackOut_14_0;
                          break L6;
                        } else {
                          stackOut_13_0 = 1;
                          stackIn_15_0 = stackOut_13_0;
                          break L6;
                        }
                      }
                      L7: {
                        var12 = stackIn_15_0;
                        var15 = this.field_u[var7];
                        var16 = this.field_u[var7 - 1];
                        if (var9 <= var16 - -this.field_n) {
                          break L7;
                        } else {
                          if (var9 >= -this.field_n + var15) {
                            break L7;
                          } else {
                            var4 = 0;
                            L8: while (true) {
                              if (hh.field_d <= var4) {
                                break L1;
                              } else {
                                L9: {
                                  if (var12 == 0) {
                                    stackOut_21_0 = -this.field_y;
                                    stackIn_22_0 = stackOut_21_0;
                                    break L9;
                                  } else {
                                    stackOut_20_0 = this.field_y;
                                    stackIn_22_0 = stackOut_20_0;
                                    break L9;
                                  }
                                }
                                var5 = stackIn_22_0;
                                var6 = 0;
                                var8 = jq.field_k[var4] - -(this.field_q * var5 >> 1696244748);
                                L10: while (true) {
                                  if (var8 >= 0) {
                                    L11: while (true) {
                                      if ((var8 ^ -1) >= -4097) {
                                        L12: while (true) {
                                          L13: {
                                            if (this.field_x <= var6) {
                                              break L13;
                                            } else {
                                              if (var8 < this.field_r[var11][var6]) {
                                                break L13;
                                              } else {
                                                var6++;
                                                continue L12;
                                              }
                                            }
                                          }
                                          L14: {
                                            var10 = -1 + var6;
                                            var13 = this.field_r[var11][var10];
                                            var14 = this.field_r[var11][var6];
                                            if (var8 <= this.field_n + var13) {
                                              break L14;
                                            } else {
                                              if (var14 - this.field_n <= var8) {
                                                break L14;
                                              } else {
                                                var3[var4] = this.field_p[var11][var10];
                                                var4++;
                                                continue L8;
                                              }
                                            }
                                          }
                                          var19 = var18;
                                          var19[var4] = 0;
                                          var4++;
                                          continue L8;
                                        }
                                      } else {
                                        var8 -= 4096;
                                        continue L11;
                                      }
                                    }
                                  } else {
                                    var8 += 4096;
                                    continue L10;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      var19 = var18;
                      bl.a(var19, 0, hh.field_d, 0);
                      break L1;
                    }
                  } else {
                    var9 -= 4096;
                    continue L3;
                  }
                }
              } else {
                var9 += 4096;
                continue L2;
              }
            }
          }
        }
        return var3;
    }

    final void d(byte param0) {
        if (param0 != -68) {
            return;
        }
        this.b(true);
    }

    final static String a(int param0, String param1, String param2, String param3) {
        String discarded$0 = null;
        int var5 = BachelorFridge.field_y;
        int var4 = param1.indexOf(param2);
        if (param0 != -19384) {
            String var6 = (String) null;
            discarded$0 = ig.a(7, (String) null, (String) null, (String) null);
        }
        while (-1 != var4) {
            param1 = param1.substring(0, var4) + param3 + param1.substring(var4 + param2.length());
            var4 = param1.indexOf(param2, var4 + param3.length());
        }
        return param1;
    }

    static {
    }
}
