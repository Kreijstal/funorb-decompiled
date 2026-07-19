/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bk extends ci {
    private int field_q;
    static String[] field_m;
    private int field_p;
    private int field_o;
    private int field_r;
    private int field_n;

    public static void d(byte param0) {
        if (param0 != 101) {
            field_m = (String[]) null;
            field_m = null;
            return;
        }
        field_m = null;
    }

    final void b(byte param0) {
        if (param0 != 116) {
            uia var3 = (uia) null;
            this.a((byte) 61, (uia) null, -62);
            tka.b((byte) 115);
            return;
        }
        tka.b((byte) 115);
    }

    public bk() {
        super(0, true);
        this.field_q = 4096;
        this.field_o = 16;
        this.field_p = 2000;
        this.field_r = 0;
        this.field_n = 0;
    }

    final void a(byte param0, uia param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      var4_int = param2;
                      if (var4_int != 0) {
                        break L5;
                      } else {
                        if (var5 == 0) {
                          this.field_n = param1.h(param0 ^ 148);
                          if (var5 == 0) {
                            break L1;
                          } else {
                            break L4;
                          }
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if ((var4_int ^ -1) != -2) {
                        break L6;
                      } else {
                        if (var5 == 0) {
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if (2 == var4_int) {
                      break L3;
                    } else {
                      if (3 == var4_int) {
                        break L2;
                      } else {
                        if (4 == var4_int) {
                          this.field_q = param1.d(121);
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                  this.field_p = param1.d(param0 ^ 21);
                  if (var5 == 0) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
                this.field_o = param1.h(255);
                if (var5 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
              this.field_r = param1.d(param0 + 17);
              if (var5 == 0) {
                break L1;
              } else {
                this.field_q = param1.d(121);
                break L1;
              }
            }
            if (param0 == 107) {
              break L0;
            } else {
              this.field_o = -113;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var4);
            stackOut_23_1 = new StringBuilder().append("bk.A(").append(param0).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param2 + ')');
        }
    }

    final static void c(int param0) {
        if (param0 != 9033) {
            field_m = (String[]) null;
        }
    }

    final int[] c(int param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        Random var6 = null;
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
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int[] var28 = null;
        int[][] var32 = null;
        int var33 = 0;
        int var34 = 0;
        int stackIn_7_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_47_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_46_0 = 0;
        var27 = TombRacer.field_G ? 1 : 0;
        var28 = this.field_i.a((byte) -104, param1);
        var3 = var28;
        if (this.field_i.field_d) {
          var4 = this.field_q >> -1886740095;
          var32 = this.field_i.a(0);
          var6 = new Random((long)this.field_n);
          var7 = 0;
          L0: while (true) {
            stackOut_6_0 = this.field_p ^ -1;
            stackIn_7_0 = stackOut_6_0;
            L1: while (true) {
              if (stackIn_7_0 < (var7 ^ -1)) {
                var34 = -1;
                var33 = this.field_q ^ -1;
                if (var27 != 0) {
                  if (var33 != var34) {
                    return (int[]) null;
                  } else {
                    return var28;
                  }
                } else {
                  L2: {
                    if (var33 >= var34) {
                      stackOut_20_0 = this.field_r;
                      stackIn_21_0 = stackOut_20_0;
                      break L2;
                    } else {
                      stackOut_19_0 = this.field_r + jqa.a(this.field_q, var6, -102) + -var4;
                      stackIn_21_0 = stackOut_19_0;
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      var8 = stackIn_21_0;
                      var8 = var8 >> 1578168452 & 255;
                      var9 = jqa.a(ns.field_g, var6, 44);
                      var10 = jqa.a(qda.field_i, var6, -127);
                      var11 = (this.field_o * lm.field_r[var8] >> -816044628) + var9;
                      var12 = var10 - -(ou.field_e[var8] * this.field_o >> 969785164);
                      var13 = var12 + -var10;
                      var14 = -var9 + var11;
                      if (var14 != 0) {
                        break L4;
                      } else {
                        if (var13 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (0 > var14) {
                        var14 = -var14;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      if (var13 < 0) {
                        var13 = -var13;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      if (var13 <= var14) {
                        stackOut_32_0 = 0;
                        stackIn_33_0 = stackOut_32_0;
                        break L7;
                      } else {
                        stackOut_31_0 = 1;
                        stackIn_33_0 = stackOut_31_0;
                        break L7;
                      }
                    }
                    L8: {
                      var15 = stackIn_33_0;
                      if (var15 == 0) {
                        break L8;
                      } else {
                        var16 = var9;
                        var9 = var10;
                        var17 = var11;
                        var11 = var12;
                        var10 = var16;
                        var12 = var17;
                        break L8;
                      }
                    }
                    L9: {
                      if (var11 < var9) {
                        var16 = var9;
                        var9 = var11;
                        var17 = var10;
                        var11 = var16;
                        var10 = var12;
                        var12 = var17;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      var16 = var10;
                      var17 = var11 + -var9;
                      var18 = -var10 + var12;
                      var19 = -var17 / 2;
                      var20 = 2048 / var17;
                      var21 = -(jqa.a(4096, var6, -85) >> -727497790) + 1024;
                      if (var12 > var10) {
                        stackOut_40_0 = 1;
                        stackIn_41_0 = stackOut_40_0;
                        break L10;
                      } else {
                        stackOut_39_0 = -1;
                        stackIn_41_0 = stackOut_39_0;
                        break L10;
                      }
                    }
                    L11: {
                      var22 = stackIn_41_0;
                      if (-1 < (var18 ^ -1)) {
                        var18 = -var18;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    var23 = var9;
                    L12: while (true) {
                      if (var23 >= var11) {
                        break L3;
                      } else {
                        var24 = var21 - -1024 + (var23 - var9) * var20;
                        var25 = var23 & una.field_b;
                        var26 = var16 & hba.field_b;
                        stackOut_46_0 = var15;
                        stackIn_7_0 = stackOut_46_0;
                        stackIn_47_0 = stackOut_46_0;
                        if (var27 != 0) {
                          continue L1;
                        } else {
                          L13: {
                            L14: {
                              if (stackIn_47_0 != 0) {
                                break L14;
                              } else {
                                var32[var25][var26] = var24;
                                if (var27 == 0) {
                                  break L13;
                                } else {
                                  break L14;
                                }
                              }
                            }
                            var32[var26][var25] = var24;
                            break L13;
                          }
                          L15: {
                            var19 = var19 + var18;
                            if (-1 <= (var19 ^ -1)) {
                              break L15;
                            } else {
                              var16 = var16 - -var22;
                              var19 = var19 - var17;
                              break L15;
                            }
                          }
                          var23++;
                          if (var27 == 0) {
                            continue L12;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  var7++;
                  if (var27 == 0) {
                    continue L0;
                  } else {
                    if (param0 != 1) {
                      return (int[]) null;
                    } else {
                      return var28;
                    }
                  }
                }
              } else {
                if (param0 != 1) {
                  return (int[]) null;
                } else {
                  return var28;
                }
              }
            }
          }
        } else {
          if (param0 != 1) {
            return (int[]) null;
          } else {
            return var28;
          }
        }
    }

    static {
        field_m = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    }
}
