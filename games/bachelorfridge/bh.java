/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bh extends k {
    private short[] field_k;
    static kv field_r;
    private int field_q;
    private int field_n;
    static String field_s;
    private int field_u;
    private int field_l;
    private byte[] field_t;
    static String field_p;
    private int field_o;
    private int field_m;

    public static void e(byte param0) {
        if (param0 > -78) {
            field_r = (kv) null;
        }
        field_r = null;
        field_p = null;
        field_s = null;
    }

    public bh() {
        super(0, true);
        this.field_q = 5;
        this.field_t = new byte[512];
        this.field_n = 1;
        this.field_o = 0;
        this.field_m = 2048;
        this.field_k = new short[512];
        this.field_u = 5;
        this.field_l = 2;
    }

    private final void b(boolean param0) {
        int var3 = 0;
        int var4 = BachelorFridge.field_y;
        if (param0) {
            return;
        }
        Random var5 = new Random((long)this.field_o);
        Random var2 = var5;
        this.field_k = new short[512];
        if (!(0 >= this.field_m)) {
            for (var3 = 0; (var3 ^ -1) > -513; var3++) {
                this.field_k[var3] = (short)kla.a(this.field_m, var5, -2147483648);
            }
        }
    }

    final int[] a(int param0, int param1) {
        int incrementValue$1 = 0;
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
        int var18 = 0;
        int var19 = 0;
        int stackIn_9_0 = 0;
        byte[] stackIn_9_1 = null;
        int stackIn_9_2 = 0;
        int stackIn_10_0 = 0;
        byte[] stackIn_10_1 = null;
        int stackIn_10_2 = 0;
        int stackIn_11_0 = 0;
        byte[] stackIn_11_1 = null;
        int stackIn_11_2 = 0;
        int stackIn_11_3 = 0;
        int stackIn_14_0 = 0;
        byte[] stackIn_14_1 = null;
        int stackIn_14_2 = 0;
        int stackIn_14_3 = 0;
        int stackIn_15_0 = 0;
        byte[] stackIn_15_1 = null;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        int stackIn_16_0 = 0;
        byte[] stackIn_16_1 = null;
        int stackIn_16_2 = 0;
        int stackIn_16_3 = 0;
        int stackIn_16_4 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_38_0 = 0;
        double stackIn_39_0 = 0.0;
        double stackIn_40_0 = 0.0;
        double stackIn_41_0 = 0.0;
        int stackIn_41_1 = 0;
        int stackIn_46_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackOut_8_0 = 0;
        byte[] stackOut_8_1 = null;
        int stackOut_8_2 = 0;
        int stackOut_10_0 = 0;
        byte[] stackOut_10_1 = null;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        int stackOut_9_0 = 0;
        byte[] stackOut_9_1 = null;
        int stackOut_9_2 = 0;
        int stackOut_9_3 = 0;
        int stackOut_13_0 = 0;
        byte[] stackOut_13_1 = null;
        int stackOut_13_2 = 0;
        int stackOut_13_3 = 0;
        int stackOut_15_0 = 0;
        byte[] stackOut_15_1 = null;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        int stackOut_15_4 = 0;
        int stackOut_14_0 = 0;
        byte[] stackOut_14_1 = null;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        int stackOut_14_4 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        double stackOut_38_0 = 0.0;
        double stackOut_40_0 = 0.0;
        int stackOut_40_1 = 0;
        double stackOut_39_0 = 0.0;
        int stackOut_39_1 = 0;
        L0: {
          var19 = BachelorFridge.field_y;
          var3 = this.field_j.a(param0, -1);
          if (param1 == 0) {
            break L0;
          } else {
            this.b(false);
            break L0;
          }
        }
        L1: {
          if (this.field_j.field_m) {
            var4 = tj.field_f[param0] * this.field_q + 2048;
            var5 = var4 >> -2093614292;
            var6 = var5 - -1;
            var14 = 0;
            L2: while (true) {
              if (hh.field_d <= var14) {
                break L1;
              } else {
                dca.field_v = 2147483647;
                um.field_a = 2147483647;
                sma.field_C = 2147483647;
                iia.field_p = 2147483647;
                var15 = 2048 + this.field_u * jq.field_k[var14];
                var16 = var15 >> 2020891628;
                var17 = 1 + var16;
                var8 = var5 - 1;
                L3: while (true) {
                  if (var6 < var8) {
                    var18 = this.field_l;
                    if (-1 != (var18 ^ -1)) {
                      if (var18 != 1) {
                        if (-4 == (var18 ^ -1)) {
                          var3[var14] = sma.field_C;
                          var14++;
                          continue L2;
                        } else {
                          if (var18 == 4) {
                            var3[var14] = um.field_a;
                            var14++;
                            continue L2;
                          } else {
                            if (2 == var18) {
                              var3[var14] = -iia.field_p + dca.field_v;
                              var14++;
                              continue L2;
                            } else {
                              var14++;
                              continue L2;
                            }
                          }
                        }
                      } else {
                        var3[var14] = dca.field_v;
                        var14++;
                        continue L2;
                      }
                    } else {
                      var3[var14] = iia.field_p;
                      var14++;
                      continue L2;
                    }
                  } else {
                    L4: {
                      stackOut_8_0 = 255;
                      stackOut_8_1 = this.field_t;
                      stackOut_8_2 = 255;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      stackIn_10_2 = stackOut_8_2;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      stackIn_9_2 = stackOut_8_2;
                      if (this.field_q > var8) {
                        stackOut_10_0 = stackIn_10_0;
                        stackOut_10_1 = (byte[]) ((Object) stackIn_10_1);
                        stackOut_10_2 = stackIn_10_2;
                        stackOut_10_3 = var8;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        stackIn_11_2 = stackOut_10_2;
                        stackIn_11_3 = stackOut_10_3;
                        break L4;
                      } else {
                        stackOut_9_0 = stackIn_9_0;
                        stackOut_9_1 = (byte[]) ((Object) stackIn_9_1);
                        stackOut_9_2 = stackIn_9_2;
                        stackOut_9_3 = var8 - this.field_q;
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_11_1 = stackOut_9_1;
                        stackIn_11_2 = stackOut_9_2;
                        stackIn_11_3 = stackOut_9_3;
                        break L4;
                      }
                    }
                    var12 = stackIn_11_0 & stackIn_11_1[stackIn_11_2 & stackIn_11_3];
                    var7 = var16 + -1;
                    L5: while (true) {
                      if (var17 < var7) {
                        var8++;
                        continue L3;
                      } else {
                        L6: {
                          stackOut_13_0 = 2;
                          stackOut_13_1 = this.field_t;
                          stackOut_13_2 = 255;
                          stackOut_13_3 = var12;
                          stackIn_15_0 = stackOut_13_0;
                          stackIn_15_1 = stackOut_13_1;
                          stackIn_15_2 = stackOut_13_2;
                          stackIn_15_3 = stackOut_13_3;
                          stackIn_14_0 = stackOut_13_0;
                          stackIn_14_1 = stackOut_13_1;
                          stackIn_14_2 = stackOut_13_2;
                          stackIn_14_3 = stackOut_13_3;
                          if (this.field_u <= var7) {
                            stackOut_15_0 = stackIn_15_0;
                            stackOut_15_1 = (byte[]) ((Object) stackIn_15_1);
                            stackOut_15_2 = stackIn_15_2;
                            stackOut_15_3 = stackIn_15_3;
                            stackOut_15_4 = var7 + -this.field_u;
                            stackIn_16_0 = stackOut_15_0;
                            stackIn_16_1 = stackOut_15_1;
                            stackIn_16_2 = stackOut_15_2;
                            stackIn_16_3 = stackOut_15_3;
                            stackIn_16_4 = stackOut_15_4;
                            break L6;
                          } else {
                            stackOut_14_0 = stackIn_14_0;
                            stackOut_14_1 = (byte[]) ((Object) stackIn_14_1);
                            stackOut_14_2 = stackIn_14_2;
                            stackOut_14_3 = stackIn_14_3;
                            stackOut_14_4 = var7;
                            stackIn_16_0 = stackOut_14_0;
                            stackIn_16_1 = stackOut_14_1;
                            stackIn_16_2 = stackOut_14_2;
                            stackIn_16_3 = stackOut_14_3;
                            stackIn_16_4 = stackOut_14_4;
                            break L6;
                          }
                        }
                        L7: {
                          var13 = stackIn_16_0 * (stackIn_16_1[stackIn_16_2 & stackIn_16_3 - -stackIn_16_4] & 255);
                          incrementValue$1 = var13;
                          var13++;
                          var9 = -this.field_k[incrementValue$1] + -(var7 << 1496873100) + var15;
                          var10 = var4 - (this.field_k[var13] + (var8 << 1481642252));
                          var18 = this.field_n;
                          if (-2 != (var18 ^ -1)) {
                            if (-4 == (var18 ^ -1)) {
                              L8: {
                                if (-1 >= (var9 ^ -1)) {
                                  stackOut_27_0 = var9;
                                  stackIn_28_0 = stackOut_27_0;
                                  break L8;
                                } else {
                                  stackOut_26_0 = -var9;
                                  stackIn_28_0 = stackOut_26_0;
                                  break L8;
                                }
                              }
                              L9: {
                                var9 = stackIn_28_0;
                                if (0 <= var10) {
                                  stackOut_30_0 = var10;
                                  stackIn_31_0 = stackOut_30_0;
                                  break L9;
                                } else {
                                  stackOut_29_0 = -var10;
                                  stackIn_31_0 = stackOut_29_0;
                                  break L9;
                                }
                              }
                              L10: {
                                var10 = stackIn_31_0;
                                if (var9 > var10) {
                                  stackOut_33_0 = var9;
                                  stackIn_34_0 = stackOut_33_0;
                                  break L10;
                                } else {
                                  stackOut_32_0 = var10;
                                  stackIn_34_0 = stackOut_32_0;
                                  break L10;
                                }
                              }
                              var11 = stackIn_34_0;
                              break L7;
                            } else {
                              if ((var18 ^ -1) != -5) {
                                if ((var18 ^ -1) == -6) {
                                  var10 = var10 * var10;
                                  var9 = var9 * var9;
                                  var11 = (int)(4096.0 * Math.sqrt(Math.sqrt((double)((float)(var9 + var10) / 16777216.0f))));
                                  break L7;
                                } else {
                                  if ((var18 ^ -1) != -3) {
                                    var11 = (int)(Math.sqrt((double)((float)(var10 * var10 + var9 * var9) / 16777216.0f)) * 4096.0);
                                    break L7;
                                  } else {
                                    L11: {
                                      if (0 <= var9) {
                                        stackOut_45_0 = var9;
                                        stackIn_46_0 = stackOut_45_0;
                                        break L11;
                                      } else {
                                        stackOut_44_0 = -var9;
                                        stackIn_46_0 = stackOut_44_0;
                                        break L11;
                                      }
                                    }
                                    L12: {
                                      stackOut_46_0 = stackIn_46_0;
                                      stackIn_48_0 = stackOut_46_0;
                                      stackIn_47_0 = stackOut_46_0;
                                      if (-1 < (var10 ^ -1)) {
                                        stackOut_48_0 = stackIn_48_0;
                                        stackOut_48_1 = -var10;
                                        stackIn_49_0 = stackOut_48_0;
                                        stackIn_49_1 = stackOut_48_1;
                                        break L12;
                                      } else {
                                        stackOut_47_0 = stackIn_47_0;
                                        stackOut_47_1 = var10;
                                        stackIn_49_0 = stackOut_47_0;
                                        stackIn_49_1 = stackOut_47_1;
                                        break L12;
                                      }
                                    }
                                    var11 = stackIn_49_0 - -stackIn_49_1;
                                    break L7;
                                  }
                                }
                              } else {
                                L13: {
                                  if (-1 >= (var9 ^ -1)) {
                                    stackOut_37_0 = var9;
                                    stackIn_38_0 = stackOut_37_0;
                                    break L13;
                                  } else {
                                    stackOut_36_0 = -var9;
                                    stackIn_38_0 = stackOut_36_0;
                                    break L13;
                                  }
                                }
                                L14: {
                                  var9 = (int)(Math.sqrt((double)((float)stackIn_38_0 / 4096.0f)) * 4096.0);
                                  stackOut_38_0 = 4096.0;
                                  stackIn_40_0 = stackOut_38_0;
                                  stackIn_39_0 = stackOut_38_0;
                                  if (0 > var10) {
                                    stackOut_40_0 = stackIn_40_0;
                                    stackOut_40_1 = -var10;
                                    stackIn_41_0 = stackOut_40_0;
                                    stackIn_41_1 = stackOut_40_1;
                                    break L14;
                                  } else {
                                    stackOut_39_0 = stackIn_39_0;
                                    stackOut_39_1 = var10;
                                    stackIn_41_0 = stackOut_39_0;
                                    stackIn_41_1 = stackOut_39_1;
                                    break L14;
                                  }
                                }
                                var10 = (int)(stackIn_41_0 * Math.sqrt((double)((float)stackIn_41_1 / 4096.0f)));
                                var11 = var10 + var9;
                                var11 = var11 * var11 >> 2048758732;
                                break L7;
                              }
                            }
                          } else {
                            var11 = var10 * var10 + var9 * var9 >> 98148140;
                            break L7;
                          }
                        }
                        if (var11 >= iia.field_p) {
                          if (dca.field_v > var11) {
                            um.field_a = sma.field_C;
                            sma.field_C = dca.field_v;
                            dca.field_v = var11;
                            var7++;
                            continue L5;
                          } else {
                            if (var11 < sma.field_C) {
                              um.field_a = sma.field_C;
                              sma.field_C = var11;
                              var7++;
                              continue L5;
                            } else {
                              if (var11 < um.field_a) {
                                um.field_a = var11;
                                var7++;
                                continue L5;
                              } else {
                                var7++;
                                continue L5;
                              }
                            }
                          }
                        } else {
                          um.field_a = sma.field_C;
                          sma.field_C = dca.field_v;
                          dca.field_v = iia.field_p;
                          iia.field_p = var11;
                          var7++;
                          continue L5;
                        }
                      }
                    }
                  }
                }
              }
            }
          } else {
            break L1;
          }
        }
        return var3;
    }

    final void a(byte param0, lu param1, int param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param0 == -71) {
                break L1;
              } else {
                this.field_k = (short[]) null;
                break L1;
              }
            }
            L2: {
              var4_int = param2;
              if (0 == var4_int) {
                dupTemp$1 = param1.b(param0 + 16712006);
                this.field_q = dupTemp$1;
                this.field_u = dupTemp$1;
                break L2;
              } else {
                if (1 == var4_int) {
                  this.field_o = param1.b(16711935);
                  break L2;
                } else {
                  if ((var4_int ^ -1) == -3) {
                    this.field_m = param1.e((byte) 112);
                    break L2;
                  } else {
                    if (var4_int == 3) {
                      this.field_l = param1.b(16711935);
                      break L2;
                    } else {
                      if (4 == var4_int) {
                        this.field_n = param1.b(16711935);
                        break L2;
                      } else {
                        if (var4_int != 5) {
                          if (-7 != (var4_int ^ -1)) {
                            break L2;
                          } else {
                            this.field_q = param1.b(16711935);
                            break L2;
                          }
                        } else {
                          this.field_u = param1.b(param0 + 16712006);
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var4);
            stackOut_20_1 = new StringBuilder().append("bh.E(").append(param0).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L3;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param2 + ')');
        }
    }

    final void d(byte param0) {
        this.field_t = rba.a(this.field_o, -96);
        this.b(false);
        if (param0 != -68) {
            lu var3 = (lu) null;
            this.a((byte) 95, (lu) null, -98);
        }
    }

    static {
        field_p = "START";
        field_s = "<%0> has not yet unlocked this option for use.";
    }
}
