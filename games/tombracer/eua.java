/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eua extends jea {
    private eua field_Eb;
    private int field_vb;
    private int field_Fb;
    private char[] field_xb;
    private tv[] field_Gb;
    private int field_Db;
    private eua[] field_zb;
    private int field_Bb;
    private int field_wb;
    private int field_Cb;
    static String field_Ab;
    private int field_yb;
    private int field_tb;
    private int[] field_ub;

    final int g(int param0) {
        int stackIn_2_0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        if (param0 != 22514) {
          L0: {
            this.field_Cb = -14;
            stackOut_5_0 = this.field_Fb;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (null == this.field_Eb) {
              stackOut_7_0 = stackIn_7_0;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = stackIn_6_0;
              stackOut_6_1 = this.field_Eb.g(22514);
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          return stackIn_8_0 + stackIn_8_1;
        } else {
          L1: {
            stackOut_1_0 = this.field_Fb;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (null == this.field_Eb) {
              stackOut_3_0 = stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = stackIn_2_0;
              stackOut_2_1 = this.field_Eb.g(22514);
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          return stackIn_4_0 + stackIn_4_1;
        }
    }

    final void a(boolean param0) {
        boolean discarded$5 = false;
        tv[] var2 = null;
        int var3 = 0;
        tv var4 = null;
        int var5 = 0;
        tv[] var6 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        var6 = this.field_Gb;
        var2 = var6;
        if (param0) {
          var3 = 0;
          L0: while (true) {
            if (var3 < var6.length) {
              var4 = var6[var3];
              var4.field_cb = false;
              var4.field_y = 0;
              var3++;
              if (var5 == 0) {
                continue L0;
              } else {
                this.field_Eb.p(1);
                this.field_Eb = null;
                this.field_tb = -1;
                this.a(12, 6);
                return;
              }
            } else {
              L1: {
                if (null != this.field_Eb) {
                  this.field_Eb.a(param0);
                  this.field_Eb.p(1);
                  break L1;
                } else {
                  break L1;
                }
              }
              this.field_Eb = null;
              this.field_tb = -1;
              this.a(12, 6);
              return;
            }
          }
        } else {
          discarded$5 = this.a(33, (byte) -9, 44);
          var3 = 0;
          L2: while (true) {
            if (var3 < var6.length) {
              var4 = var6[var3];
              var4.field_cb = false;
              var4.field_y = 0;
              var3++;
              if (var5 != 0) {
                this.field_Eb.p(1);
                this.field_Eb = null;
                this.field_tb = -1;
                this.a(12, 6);
                return;
              } else {
                continue L2;
              }
            } else {
              L3: {
                if (null != this.field_Eb) {
                  this.field_Eb.a(param0);
                  this.field_Eb.p(1);
                  break L3;
                } else {
                  break L3;
                }
              }
              this.field_Eb = null;
              this.field_tb = -1;
              this.a(12, 6);
              return;
            }
          }
        }
    }

    public static void f(int param0) {
        field_Ab = null;
        if (param0 <= 52) {
            field_Ab = (String) null;
        }
    }

    final boolean h(int param0) {
        int var2 = 0;
        tv[] var3 = null;
        int var4 = 0;
        tv var5 = null;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        int stackIn_15_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        var2 = 0;
        var3 = this.field_Gb;
        var4 = param0;
        L0: while (true) {
          L1: {
            L2: {
              if (var3.length <= var4) {
                break L2;
              } else {
                var5 = var3[var4];
                stackOut_2_0 = var2;
                stackOut_2_1 = 0;
                stackOut_2_2 = var5.field_y;
                stackIn_10_0 = stackOut_2_0;
                stackIn_10_1 = stackOut_2_1;
                stackIn_10_2 = stackOut_2_2;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                stackIn_3_2 = stackOut_2_2;
                if (var6 != 0) {
                  break L1;
                } else {
                  L3: {
                    stackOut_3_0 = stackIn_3_0;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (stackIn_3_1 == stackIn_3_2) {
                      stackOut_5_0 = stackIn_5_0;
                      stackOut_5_1 = 0;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      break L3;
                    } else {
                      stackOut_4_0 = stackIn_4_0;
                      stackOut_4_1 = 1;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_6_1 = stackOut_4_1;
                      break L3;
                    }
                  }
                  var2 = stackIn_6_0 | stackIn_6_1;
                  var4++;
                  if (var6 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            if (var2 == 0) {
              stackOut_9_0 = 0;
              stackOut_9_1 = this.field_tb;
              stackOut_9_2 = -1;
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L1;
            } else {
              return var2 != 0;
            }
          }
          if (stackIn_10_0 == (stackIn_10_1 ^ stackIn_10_2)) {
            return var2 != 0;
          } else {
            L4: {
              if (null == this.field_zb[this.field_tb]) {
                break L4;
              } else {
                L5: {
                  if (!this.field_zb[this.field_tb].h(param0 ^ 0)) {
                    stackOut_14_0 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    break L5;
                  } else {
                    stackOut_13_0 = 1;
                    stackIn_15_0 = stackOut_13_0;
                    break L5;
                  }
                }
                var2 = stackIn_15_0;
                break L4;
              }
            }
            return var2 != 0;
          }
        }
    }

    private final void a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        this.field_Cb = param0;
        if (param1 > 3) {
          var5 = 0;
          L0: while (true) {
            if (this.field_Bb > var5) {
              var4 = this.field_Cb * this.field_Cb;
              var3 = this.field_wb * var5;
              this.field_Gb[var5].field_T = (var3 * (144 + -var4) - -((this.field_Db + -this.field_A) * var4)) / 144;
              var5++;
              if (var6 == 0) {
                continue L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    eua(long param0, jea param1, jea param2, jea param3, eua[] param4, int[] param5, String[] param6, char[] param7) {
        super(param0, param1);
        RuntimeException var10 = null;
        String var11 = null;
        String var12 = null;
        int var13 = 0;
        Object var14 = null;
        int var15 = 0;
        int var16 = 0;
        il var17 = null;
        il var18 = null;
        Object stackIn_4_0 = null;
        Object stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_12_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var16 = TombRacer.field_G ? 1 : 0;
        this.field_tb = -1;
        try {
          L0: {
            this.field_zb = param4;
            this.field_ub = param5;
            this.field_xb = param7;
            this.field_Bb = this.field_ub.length;
            var17 = param3.field_H;
            var18 = var17;
            this.field_wb = var18.field_k + (var18.field_w + 2);
            this.field_Gb = new tv[this.field_Bb];
            this.field_vb = 0;
            this.field_yb = this.field_Bb * this.field_wb;
            var11 = "<col=999999>";
            var12 = "</col>";
            var13 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var13 >= this.field_Bb) {
                    break L3;
                  } else {
                    stackOut_3_0 = this;
                    stackIn_13_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var16 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (((eua) (this)).field_xb[var13] <= 0) {
                          break L4;
                        } else {
                          param6[var13] = var11 + no.a((byte) 67, this.field_xb[var13]).toUpperCase() + ": " + var12 + param6[var13];
                          break L4;
                        }
                      }
                      L5: {
                        L6: {
                          var14 = null;
                          if (null != this.field_zb[var13]) {
                            break L6;
                          } else {
                            if (-1 != this.field_ub[var13]) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var14 = gfa.field_j;
                        break L5;
                      }
                      L7: {
                        this.field_Gb[var13] = new tv(0L, param2, (jea) null, param3, (iu) (var14), param6[var13]);
                        this.b(-123, this.field_Gb[var13]);
                        var15 = var17.b(param6[var13]);
                        if (this.field_vb >= var15) {
                          break L7;
                        } else {
                          this.field_vb = var15;
                          break L7;
                        }
                      }
                      var13++;
                      if (var16 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                this.field_vb = this.field_vb + (10 + gfa.field_j.field_n);
                stackOut_12_0 = this;
                stackIn_13_0 = stackOut_12_0;
                break L2;
              }
              this.a(12, 93);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var10 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var10);
            stackOut_15_1 = new StringBuilder().append("eua.<init>(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L8;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L8;
            }
          }
          L9: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L9;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L9;
            }
          }
          L10: {
            stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param3 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L10;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L10;
            }
          }
          L11: {
            stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param4 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L11;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L11;
            }
          }
          L12: {
            stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param5 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L12;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L12;
            }
          }
          L13: {
            stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param6 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L13;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L13;
            }
          }
          L14: {
            stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
            stackOut_33_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',');
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param7 == null) {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L14;
            } else {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L14;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        if (param3 == -62) {
          if (param2 != this.field_tb) {
            if (this.field_zb[param2] == null) {
              if (0 != (this.field_ub[param2] ^ -1)) {
                L0: {
                  var5 = this.field_ub[param2] | 32768;
                  var6 = bta.field_q;
                  if (var6 != 0) {
                    break L0;
                  } else {
                    if (uu.field_a == null) {
                      break L0;
                    } else {
                      var6 = 1;
                      break L0;
                    }
                  }
                }
                L1: {
                  if (gda.a(var6, -20011) == 2) {
                    loa.a(var6, param0, (byte) 108, 1);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var8 = (String) null;
                opa.a(bta.field_q, (String) null, param1, 32371, wp.field_a, var5);
                oi.a(ica.field_b, var5, 4, wp.field_a, bta.field_q);
                f.b(param3 + -48);
                jq.c((byte) -25);
                if (var7 == 0) {
                  return;
                } else {
                  this.a(true);
                  this.a(0, 60);
                  this.field_tb = param2;
                  this.field_Eb = this.field_zb[this.field_tb];
                  hj.a(this.field_Eb, (byte) 122);
                  this.field_Eb.a(12, 116);
                  return;
                }
              } else {
                kra.a(false);
                f.b(param3 + 7);
                if (var7 != 0) {
                  L2: {
                    var5 = this.field_ub[param2] | 32768;
                    var6 = bta.field_q;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      if (uu.field_a == null) {
                        break L2;
                      } else {
                        var6 = 1;
                        break L2;
                      }
                    }
                  }
                  L3: {
                    if (gda.a(var6, -20011) == 2) {
                      loa.a(var6, param0, (byte) 108, 1);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var8 = (String) null;
                  opa.a(bta.field_q, (String) null, param1, 32371, wp.field_a, var5);
                  oi.a(ica.field_b, var5, 4, wp.field_a, bta.field_q);
                  f.b(param3 + -48);
                  jq.c((byte) -25);
                  if (var7 == 0) {
                    return;
                  } else {
                    this.a(true);
                    this.a(0, 60);
                    this.field_tb = param2;
                    this.field_Eb = this.field_zb[this.field_tb];
                    hj.a(this.field_Eb, (byte) 122);
                    this.field_Eb.a(12, 116);
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              this.a(true);
              this.a(0, 60);
              this.field_tb = param2;
              this.field_Eb = this.field_zb[this.field_tb];
              hj.a(this.field_Eb, (byte) 122);
              this.field_Eb.a(12, 116);
              return;
            }
          } else {
            this.a(true);
            this.a(0, 70);
            if (var7 != 0) {
              if (this.field_zb[param2] == null) {
                if (0 != (this.field_ub[param2] ^ -1)) {
                  L4: {
                    var5 = this.field_ub[param2] | 32768;
                    var6 = bta.field_q;
                    if (var6 != 0) {
                      break L4;
                    } else {
                      if (uu.field_a == null) {
                        break L4;
                      } else {
                        var6 = 1;
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (gda.a(var6, -20011) == 2) {
                      loa.a(var6, param0, (byte) 108, 1);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  var8 = (String) null;
                  opa.a(bta.field_q, (String) null, param1, 32371, wp.field_a, var5);
                  oi.a(ica.field_b, var5, 4, wp.field_a, bta.field_q);
                  f.b(param3 + -48);
                  jq.c((byte) -25);
                  if (var7 != 0) {
                    this.a(true);
                    this.a(0, 60);
                    this.field_tb = param2;
                    this.field_Eb = this.field_zb[this.field_tb];
                    hj.a(this.field_Eb, (byte) 122);
                    this.field_Eb.a(12, 116);
                    return;
                  } else {
                    return;
                  }
                } else {
                  L6: {
                    kra.a(false);
                    f.b(param3 + 7);
                    var5 = this.field_ub[param2] | 32768;
                    var6 = bta.field_q;
                    if (var6 != 0) {
                      break L6;
                    } else {
                      if (uu.field_a == null) {
                        break L6;
                      } else {
                        var6 = 1;
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (gda.a(var6, -20011) == 2) {
                      loa.a(var6, param0, (byte) 108, 1);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    var8 = (String) null;
                    opa.a(bta.field_q, (String) null, param1, 32371, wp.field_a, var5);
                    oi.a(ica.field_b, var5, 4, wp.field_a, bta.field_q);
                    f.b(param3 + -48);
                    jq.c((byte) -25);
                    if (var7 == 0) {
                      break L8;
                    } else {
                      this.a(true);
                      this.a(0, 60);
                      this.field_tb = param2;
                      this.field_Eb = this.field_zb[this.field_tb];
                      hj.a(this.field_Eb, (byte) 122);
                      this.field_Eb.a(12, 116);
                      break L8;
                    }
                  }
                  return;
                }
              } else {
                this.a(true);
                this.a(0, 60);
                this.field_tb = param2;
                this.field_Eb = this.field_zb[this.field_tb];
                hj.a(this.field_Eb, (byte) 122);
                this.field_Eb.a(12, 116);
                return;
              }
            } else {
              return;
            }
          }
        } else {
          this.field_vb = 1;
          if (param2 == this.field_tb) {
            this.a(true);
            this.a(0, 70);
            if (var7 != 0) {
              if (this.field_zb[param2] == null) {
                if (0 != (this.field_ub[param2] ^ -1)) {
                  L9: {
                    var5 = this.field_ub[param2] | 32768;
                    var6 = bta.field_q;
                    if (var6 != 0) {
                      break L9;
                    } else {
                      if (uu.field_a == null) {
                        break L9;
                      } else {
                        var6 = 1;
                        break L9;
                      }
                    }
                  }
                  L10: {
                    if (gda.a(var6, -20011) == 2) {
                      loa.a(var6, param0, (byte) 108, 1);
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  var8 = (String) null;
                  opa.a(bta.field_q, (String) null, param1, 32371, wp.field_a, var5);
                  oi.a(ica.field_b, var5, 4, wp.field_a, bta.field_q);
                  f.b(param3 + -48);
                  jq.c((byte) -25);
                  if (var7 != 0) {
                    this.a(true);
                    this.a(0, 60);
                    this.field_tb = param2;
                    this.field_Eb = this.field_zb[this.field_tb];
                    hj.a(this.field_Eb, (byte) 122);
                    this.field_Eb.a(12, 116);
                    return;
                  } else {
                    return;
                  }
                } else {
                  kra.a(false);
                  f.b(param3 + 7);
                  if (var7 != 0) {
                    L11: {
                      var5 = this.field_ub[param2] | 32768;
                      var6 = bta.field_q;
                      if (var6 != 0) {
                        break L11;
                      } else {
                        if (uu.field_a == null) {
                          break L11;
                        } else {
                          var6 = 1;
                          break L11;
                        }
                      }
                    }
                    L12: {
                      if (gda.a(var6, -20011) == 2) {
                        loa.a(var6, param0, (byte) 108, 1);
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    L13: {
                      var8 = (String) null;
                      opa.a(bta.field_q, (String) null, param1, 32371, wp.field_a, var5);
                      oi.a(ica.field_b, var5, 4, wp.field_a, bta.field_q);
                      f.b(param3 + -48);
                      jq.c((byte) -25);
                      if (var7 == 0) {
                        break L13;
                      } else {
                        this.a(true);
                        this.a(0, 60);
                        this.field_tb = param2;
                        this.field_Eb = this.field_zb[this.field_tb];
                        hj.a(this.field_Eb, (byte) 122);
                        this.field_Eb.a(12, 116);
                        break L13;
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                this.a(true);
                this.a(0, 60);
                this.field_tb = param2;
                this.field_Eb = this.field_zb[this.field_tb];
                hj.a(this.field_Eb, (byte) 122);
                this.field_Eb.a(12, 116);
                return;
              }
            } else {
              return;
            }
          } else {
            L14: {
              L15: {
                if (this.field_zb[param2] != null) {
                  break L15;
                } else {
                  L16: {
                    if (0 != (this.field_ub[param2] ^ -1)) {
                      break L16;
                    } else {
                      kra.a(false);
                      f.b(param3 + 7);
                      if (var7 == 0) {
                        break L14;
                      } else {
                        break L16;
                      }
                    }
                  }
                  L17: {
                    var5 = this.field_ub[param2] | 32768;
                    var6 = bta.field_q;
                    if (var6 != 0) {
                      break L17;
                    } else {
                      if (uu.field_a == null) {
                        break L17;
                      } else {
                        var6 = 1;
                        break L17;
                      }
                    }
                  }
                  L18: {
                    if (gda.a(var6, -20011) == 2) {
                      loa.a(var6, param0, (byte) 108, 1);
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  var8 = (String) null;
                  opa.a(bta.field_q, (String) null, param1, 32371, wp.field_a, var5);
                  oi.a(ica.field_b, var5, 4, wp.field_a, bta.field_q);
                  f.b(param3 + -48);
                  jq.c((byte) -25);
                  if (var7 == 0) {
                    break L14;
                  } else {
                    break L15;
                  }
                }
              }
              this.a(true);
              this.a(0, 60);
              this.field_tb = param2;
              this.field_Eb = this.field_zb[this.field_tb];
              hj.a(this.field_Eb, (byte) 122);
              this.field_Eb.a(12, 116);
              break L14;
            }
            return;
          }
        }
    }

    final boolean a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_55_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_15_0 = 0;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          if ((fna.field_h ^ -1) != -86) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var4 = stackIn_3_0;
        if (this.field_Eb != null) {
          if (var4 != 0) {
            if ((this.field_Eb.field_tb ^ -1) != 0) {
              return this.field_Eb.a(param0, (byte) -105, param2);
            } else {
              this.a(true);
              this.a(0, 124);
              return true;
            }
          } else {
            return this.field_Eb.a(param0, (byte) -105, param2);
          }
        } else {
          if (null == this.field_Eb) {
            if (this == kga.field_n) {
              if (var4 == 0) {
                var5 = kda.field_td;
                if (param1 == -105) {
                  if (0 < var5) {
                    L1: {
                      if (var5 == tqa.field_o) {
                        var5 = 63;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    var6 = 0;
                    L2: while (true) {
                      if (var6 < this.field_xb.length) {
                        stackOut_53_0 = this.field_xb[var6] ^ -1;
                        stackIn_55_0 = stackOut_53_0;
                        stackIn_54_0 = stackOut_53_0;
                        if (var7 == 0) {
                          if (stackIn_55_0 == (var5 ^ -1)) {
                            this.a(param2, param0, var6, (byte) -62);
                            return true;
                          } else {
                            var6++;
                            if (var7 == 0) {
                              continue L2;
                            } else {
                              return false;
                            }
                          }
                        } else {
                          return stackIn_54_0 != 0;
                        }
                      } else {
                        return false;
                      }
                    }
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                f.b(param1 ^ 48);
                return true;
              }
            } else {
              var5 = kda.field_td;
              if (param1 == -105) {
                if (0 < var5) {
                  L3: {
                    if (var5 == tqa.field_o) {
                      var5 = 63;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var6 = 0;
                  L4: while (true) {
                    if (var6 < this.field_xb.length) {
                      stackOut_33_0 = this.field_xb[var6] ^ -1;
                      stackIn_35_0 = stackOut_33_0;
                      stackIn_34_0 = stackOut_33_0;
                      if (var7 == 0) {
                        if (stackIn_35_0 == (var5 ^ -1)) {
                          this.a(param2, param0, var6, (byte) -62);
                          return true;
                        } else {
                          var6++;
                          continue L4;
                        }
                      } else {
                        return stackIn_34_0 != 0;
                      }
                    } else {
                      return false;
                    }
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            }
          } else {
            var5 = kda.field_td;
            if (param1 == -105) {
              if (0 < var5) {
                L5: {
                  if (var5 == tqa.field_o) {
                    var5 = 63;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var6 = 0;
                L6: while (true) {
                  if (var6 < this.field_xb.length) {
                    stackOut_15_0 = this.field_xb[var6] ^ -1;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_16_0 = stackOut_15_0;
                    if (var7 == 0) {
                      if (stackIn_17_0 == (var5 ^ -1)) {
                        this.a(param2, param0, var6, (byte) -62);
                        return true;
                      } else {
                        var6++;
                        continue L6;
                      }
                    } else {
                      return stackIn_16_0 != 0;
                    }
                  } else {
                    return false;
                  }
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          }
        }
    }

    final void a(int param0, int param1, byte param2) {
        int var4_int = 0;
        eua var4 = null;
        tv var5 = null;
        int var6 = 0;
        eua var7 = null;
        int var8 = 0;
        int var9 = 0;
        tv stackIn_27_0 = null;
        tv stackIn_28_0 = null;
        tv stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        tv stackOut_26_0 = null;
        tv stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        tv stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        var4_int = 0;
        L0: while (true) {
          L1: {
            if (var4_int >= this.field_Gb.length) {
              break L1;
            } else {
              var5 = this.field_Gb[var4_int];
              var9 = var5.field_y ^ -1;
              var8 = -2;
              if (var6 != 0) {
                if (var8 <= var9) {
                  L2: {
                    if (this.field_tb == -1) {
                      break L2;
                    } else {
                      var7 = this.field_zb[this.field_tb];
                      var4 = var7;
                      if (var4 != null) {
                        var7.a(param0, param1, (byte) -79);
                        break L2;
                      } else {
                        L3: {
                          if ((this.field_Cb ^ -1) >= -1) {
                            break L3;
                          } else {
                            this.a(this.field_Cb - 1, 66);
                            break L3;
                          }
                        }
                        return;
                      }
                    }
                  }
                  if ((this.field_Cb ^ -1) < -1) {
                    this.a(this.field_Cb - 1, 66);
                    return;
                  } else {
                    return;
                  }
                } else {
                  L4: {
                    eua.f(-120);
                    if (this.field_tb == -1) {
                      break L4;
                    } else {
                      var7 = this.field_zb[this.field_tb];
                      var4 = var7;
                      if (var4 != null) {
                        var7.a(param0, param1, (byte) -79);
                        break L4;
                      } else {
                        L5: {
                          if ((this.field_Cb ^ -1) >= -1) {
                            break L5;
                          } else {
                            this.a(this.field_Cb - 1, 66);
                            break L5;
                          }
                        }
                        return;
                      }
                    }
                  }
                  if ((this.field_Cb ^ -1) < -1) {
                    this.a(this.field_Cb - 1, 66);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                L6: {
                  if (var8 != var9) {
                    break L6;
                  } else {
                    L7: {
                      this.a(param1, param0, var4_int, (byte) -62);
                      stackOut_26_0 = (tv) (var5);
                      stackIn_28_0 = stackOut_26_0;
                      stackIn_27_0 = stackOut_26_0;
                      if (var4_int != this.field_tb) {
                        stackOut_28_0 = (tv) ((Object) stackIn_28_0);
                        stackOut_28_1 = 0;
                        stackIn_29_0 = stackOut_28_0;
                        stackIn_29_1 = stackOut_28_1;
                        break L7;
                      } else {
                        stackOut_27_0 = (tv) ((Object) stackIn_27_0);
                        stackOut_27_1 = 1;
                        stackIn_29_0 = stackOut_27_0;
                        stackIn_29_1 = stackOut_27_1;
                        break L7;
                      }
                    }
                    stackIn_29_0.field_cb = stackIn_29_1 != 0;
                    break L6;
                  }
                }
                var4_int++;
                if (var6 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
          }
          if (param2 <= -52) {
            L8: {
              if (this.field_tb == -1) {
                break L8;
              } else {
                var7 = this.field_zb[this.field_tb];
                var4 = var7;
                if (var4 != null) {
                  var7.a(param0, param1, (byte) -79);
                  break L8;
                } else {
                  if ((this.field_Cb ^ -1) < -1) {
                    this.a(this.field_Cb - 1, 66);
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
            if ((this.field_Cb ^ -1) < -1) {
              this.a(this.field_Cb - 1, 66);
              return;
            } else {
              return;
            }
          } else {
            L9: {
              eua.f(-120);
              if (this.field_tb == -1) {
                break L9;
              } else {
                var7 = this.field_zb[this.field_tb];
                var4 = var7;
                if (var4 != null) {
                  var7.a(param0, param1, (byte) -79);
                  break L9;
                } else {
                  if ((this.field_Cb ^ -1) < -1) {
                    this.a(this.field_Cb - 1, 66);
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
            if ((this.field_Cb ^ -1) < -1) {
              this.a(this.field_Cb - 1, 66);
              return;
            } else {
              return;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = TombRacer.field_G ? 1 : 0;
          this.field_Fb = this.field_vb - -(2 * param5);
          this.a(this.field_Fb, this.field_yb, -23776, -this.field_yb + param4, param1);
          if (param3 != this.field_Db) {
            this.field_Db = param3;
            this.a(this.field_Cb, 77);
            break L0;
          } else {
            break L0;
          }
        }
        var7 = 0;
        L1: while (true) {
          if (this.field_Bb <= var7) {
            if (param2 == -3269) {
              L2: {
                if ((this.field_tb ^ -1) == 0) {
                  break L2;
                } else {
                  if (null != this.field_zb[this.field_tb]) {
                    var7 = this.field_zb[this.field_tb].field_Bb;
                    var8 = (this.field_tb - -var7) * this.field_wb + this.field_T;
                    L3: while (true) {
                      if (param4 >= var8) {
                        this.field_zb[this.field_tb].a(param0, this.field_Fb + param1, param2 + 0, this.field_Gb[this.field_tb].field_A, var8, param5);
                        return;
                      } else {
                        var8 = var8 - this.field_wb;
                        if (var9 != 0) {
                          break L2;
                        } else {
                          continue L3;
                        }
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
              return;
            } else {
              L4: {
                field_Ab = (String) null;
                if ((this.field_tb ^ -1) == 0) {
                  break L4;
                } else {
                  if (null != this.field_zb[this.field_tb]) {
                    var7 = this.field_zb[this.field_tb].field_Bb;
                    var8 = (this.field_tb - -var7) * this.field_wb + this.field_T;
                    L5: while (true) {
                      if (param4 >= var8) {
                        this.field_zb[this.field_tb].a(param0, this.field_Fb + param1, param2 + 0, this.field_Gb[this.field_tb].field_A, var8, param5);
                        return;
                      } else {
                        var8 = var8 - this.field_wb;
                        if (var9 != 0) {
                          break L4;
                        } else {
                          continue L5;
                        }
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
              return;
            }
          } else {
            this.field_Gb[var7].a(this.field_Fb, 0, param0, this.field_wb, 0, param5, this.field_Gb[var7].field_T);
            var7++;
            if (var9 == 0) {
              continue L1;
            } else {
              if ((this.field_tb ^ -1) != 0) {
                if (null != this.field_zb[this.field_tb]) {
                  var7 = this.field_zb[this.field_tb].field_Bb;
                  var8 = (this.field_tb - -var7) * this.field_wb + this.field_T;
                  L6: while (true) {
                    if (param4 < var8) {
                      var8 = var8 - this.field_wb;
                      if (var9 == 0) {
                        continue L6;
                      } else {
                        return;
                      }
                    } else {
                      this.field_zb[this.field_tb].a(param0, this.field_Fb + param1, param2 + 0, this.field_Gb[this.field_tb].field_A, var8, param5);
                      return;
                    }
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
    }

    static {
        field_Ab = "Lindemann totems";
    }
}
