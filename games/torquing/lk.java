/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk extends am {
    static byte[][] field_t;
    private int field_s;
    private int field_w;
    private int field_u;
    static dq field_v;

    public lk() {
        super(1, false);
        this.field_s = 4096;
        this.field_w = 4096;
        this.field_u = 4096;
    }

    final static String a(boolean param0, int param1, CharSequence param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_13_0 = null;
        String stackIn_18_0 = null;
        String stackIn_27_0 = null;
        String stackIn_34_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_33_0 = null;
        String stackOut_26_0 = null;
        String stackOut_17_0 = null;
        String stackOut_12_0 = null;
        String stackOut_7_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var8 = Torquing.field_u;
        try {
          L0: {
            if (param2 != null) {
              L1: {
                var3_int = param2.length();
                if ((var3_int ^ -1) > -2) {
                  break L1;
                } else {
                  if (var3_int <= 12) {
                    L2: {
                      var4 = hf.a(param2, 116);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if (-2 >= (var4.length() ^ -1)) {
                          L3: {
                            if (ra.a(var4.charAt(0), 252)) {
                              break L3;
                            } else {
                              if (!ra.a(var4.charAt(var4.length() - 1), 252)) {
                                var5 = 0;
                                var6 = 0;
                                L4: while (true) {
                                  if (var6 >= param2.length()) {
                                    L5: {
                                      if (param1 > 16) {
                                        break L5;
                                      } else {
                                        field_v = (dq) null;
                                        break L5;
                                      }
                                    }
                                    if ((var5 ^ -1) < -1) {
                                      stackOut_33_0 = cc.field_b;
                                      stackIn_34_0 = stackOut_33_0;
                                      decompiledRegionSelector0 = 5;
                                      break L0;
                                    } else {
                                      return null;
                                    }
                                  } else {
                                    L6: {
                                      var7 = param2.charAt(var6);
                                      if (ra.a((char) var7, 252)) {
                                        var5++;
                                        break L6;
                                      } else {
                                        var5 = 0;
                                        break L6;
                                      }
                                    }
                                    L7: {
                                      if (-3 < (var5 ^ -1)) {
                                        break L7;
                                      } else {
                                        if (param0) {
                                          break L7;
                                        } else {
                                          stackOut_26_0 = am.field_q;
                                          stackIn_27_0 = stackOut_26_0;
                                          decompiledRegionSelector0 = 4;
                                          break L0;
                                        }
                                      }
                                    }
                                    var6++;
                                    continue L4;
                                  }
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                          stackOut_17_0 = cc.field_b;
                          stackIn_18_0 = stackOut_17_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackOut_12_0 = ml.field_b;
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_7_0 = ml.field_b;
              stackIn_8_0 = stackOut_7_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_2_0 = ml.field_b;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) (var3);
            stackOut_36_1 = new StringBuilder().append("lk.D(").append(param0).append(',').append(param1).append(',');
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param2 == null) {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L8;
            } else {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L8;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_27_0;
                } else {
                  return stackIn_34_0;
                }
              }
            }
          }
        }
    }

    final int[][] a(int param0, int param1) {
        int[][] var3 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[][] var16 = null;
        int[][] var18 = null;
        int[][] var23 = null;
        int[][] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        L0: {
          var15 = Torquing.field_u;
          var23 = this.field_r.a(15142, param1);
          var18 = var23;
          var16 = var18;
          var3 = var16;
          if (param0 == -29116) {
            break L0;
          } else {
            lk.b(-110);
            break L0;
          }
        }
        L1: {
          if (!this.field_r.field_b) {
            break L1;
          } else {
            var31 = this.c(24066, param1, 0);
            var32 = var31[0];
            var34 = var31[1];
            var33 = var31[2];
            var8 = var23[0];
            var9 = var23[1];
            var10 = var23[2];
            var11 = 0;
            L2: while (true) {
              if (ci.field_c <= var11) {
                break L1;
              } else {
                L3: {
                  var12 = var32[var11];
                  var13 = var33[var11];
                  var14 = var34[var11];
                  if (var12 != var13) {
                    break L3;
                  } else {
                    if (var14 == var13) {
                      var8[var11] = var12 * this.field_s >> 231991564;
                      var9[var11] = var13 * this.field_u >> -779194964;
                      var10[var11] = this.field_w * var14 >> 1629208556;
                      var11++;
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var8[var11] = this.field_s;
                var9[var11] = this.field_u;
                var10[var11] = this.field_w;
                var11++;
                continue L2;
              }
            }
          }
        }
        return var3;
    }

    public static void b(int param0) {
        if (param0 != 0) {
            lk.b(60);
        }
        field_t = (byte[][]) null;
        field_v = null;
    }

    final void a(fj param0, int param1, int param2) {
        int discarded$1 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var5 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var4_int = param2;
              if (var4_int != 0) {
                if (1 != var4_int) {
                  if (-3 != (var4_int ^ -1)) {
                    break L1;
                  } else {
                    this.field_w = param0.i(param1 ^ 7059);
                    break L1;
                  }
                } else {
                  this.field_u = param0.i(7088);
                  break L1;
                }
              } else {
                this.field_s = param0.i(7088);
                break L1;
              }
            }
            L2: {
              if (param1 == 35) {
                break L2;
              } else {
                discarded$1 = lk.a('ﾻ', -28);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var4);
            stackOut_13_1 = new StringBuilder().append("lk.H(");
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
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static int a(char param0, int param1) {
        if (param1 != 97) {
            return -54;
        }
        if (param0 >= 48) {
            if (57 >= param0) {
                return param0 - 48;
            }
        }
        if (param0 >= 97) {
            if (param0 <= 122) {
                return 10 - (97 + -param0);
            }
        }
        if (65 <= param0) {
            if (param0 <= 90) {
                return param0 + -65 + 36;
            }
        }
        return param0 != 43 ? 63 : 62;
    }

    static {
        field_t = new byte[50][];
    }
}
