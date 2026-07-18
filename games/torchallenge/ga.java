/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga extends bc {
    private gj field_t;
    static sl field_w;
    static String field_u;
    private gj[] field_v;
    static boolean field_y;
    static int[][][] field_x;
    static int[][] field_s;

    final void a(ka[] param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              var4_int = param1;
              if (((ga) this).field_v[var4_int] == null) {
                ((ga) this).field_v[var4_int] = new gj();
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ((ga) this).field_v[param1].field_k = param0;
              if (param2 > 43) {
                break L2;
              } else {
                field_s = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("ga.M(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(ga param0, boolean param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        gj var6 = null;
        gj var7 = null;
        int var8 = 0;
        gj stackIn_7_0 = null;
        gj stackIn_8_0 = null;
        gj stackIn_9_0 = null;
        gj stackIn_9_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        gj stackOut_6_0 = null;
        gj stackOut_8_0 = null;
        gj stackOut_8_1 = null;
        gj stackOut_7_0 = null;
        gj stackOut_7_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var8 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = 120 / ((-63 - param2) / 38);
              super.a(-122, (bc) (Object) param0);
              if (!param1) {
                he.a((Object[]) (Object) ((ga) this).field_v, 0, (Object[]) (Object) param0.field_v, 0, 6);
                break L1;
              } else {
                var5 = 0;
                L2: while (true) {
                  if (var5 >= 6) {
                    break L1;
                  } else {
                    L3: {
                      var6 = ((ga) this).field_v[var5];
                      var7 = var6;
                      var7 = var6;
                      if (var6 != null) {
                        L4: {
                          var7 = param0.field_v[var5];
                          stackOut_6_0 = (gj) var6;
                          stackIn_8_0 = stackOut_6_0;
                          stackIn_7_0 = stackOut_6_0;
                          if (var7 != null) {
                            stackOut_8_0 = (gj) (Object) stackIn_8_0;
                            stackOut_8_1 = (gj) var7;
                            stackIn_9_0 = stackOut_8_0;
                            stackIn_9_1 = stackOut_8_1;
                            break L4;
                          } else {
                            gj dupTemp$17 = new gj();
                            param0.field_v[var5] = dupTemp$17;
                            stackOut_7_0 = (gj) (Object) stackIn_7_0;
                            stackOut_7_1 = (gj) dupTemp$17;
                            stackIn_9_0 = stackOut_7_0;
                            stackIn_9_1 = stackOut_7_1;
                            break L4;
                          }
                        }
                        ((gj) (Object) stackIn_9_0).a(stackIn_9_1, (byte) 73);
                        break L3;
                      } else {
                        param0.field_v[var5] = null;
                        break L3;
                      }
                    }
                    var5++;
                    continue L2;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("ga.S(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void a(ee param0, int param1, int param2, byte param3, boolean param4) {
        RuntimeException var6 = null;
        gj var7 = null;
        gj var9 = null;
        Object var10 = null;
        ng var11 = null;
        gj var12 = null;
        gj var13 = null;
        gj var14 = null;
        gj var15 = null;
        ee stackIn_5_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        ee stackOut_4_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        try {
          L0: {
            L1: {
              if (param3 == 97) {
                break L1;
              } else {
                var10 = null;
                this.a((ga) null, true, 35);
                break L1;
              }
            }
            L2: {
              if (param0 instanceof ng) {
                stackOut_4_0 = (ee) param0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = null;
                stackIn_5_0 = (ee) (Object) stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var11 = (ng) (Object) stackIn_5_0;
              bc.a(param0.field_l + (param1 - -param0.field_i), param0.field_m + param2, param0.field_i + param1, param2 - -param0.field_m + param0.field_p, param3 + -96);
              if (var11 != null) {
                param4 = param4 & var11.field_F;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var7 = ((ga) this).field_v[0];
              ((ga) this).field_t.b(param3 + 14914);
              var7.a(param2, ((ga) this).field_t, (ga) this, -1, param1, param0);
              if (var11 == null) {
                break L4;
              } else {
                L5: {
                  if (var11.field_D) {
                    var12 = ((ga) this).field_v[1];
                    if (var12 == null) {
                      break L5;
                    } else {
                      var12.a(param2, ((ga) this).field_t, (ga) this, -1, param1, param0);
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                if (!var11.field_w) {
                  break L4;
                } else {
                  L6: {
                    var13 = ((ga) this).field_v[3];
                    if (var11.field_z == 0) {
                      break L6;
                    } else {
                      if (var13 == null) {
                        break L6;
                      } else {
                        var13.a(param2, ((ga) this).field_t, (ga) this, param3 ^ -98, param1, param0);
                        break L4;
                      }
                    }
                  }
                  var9 = ((ga) this).field_v[2];
                  if (var9 != null) {
                    var9.a(param2, ((ga) this).field_t, (ga) this, param3 ^ -98, param1, param0);
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
            }
            L7: {
              if (!param0.c(118)) {
                break L7;
              } else {
                var14 = ((ga) this).field_v[5];
                if (var14 == null) {
                  break L7;
                } else {
                  var14.a(param2, ((ga) this).field_t, (ga) this, -1, param1, param0);
                  break L7;
                }
              }
            }
            L8: {
              if (!param4) {
                var15 = ((ga) this).field_v[4];
                if (var15 != null) {
                  var15.a(param2, ((ga) this).field_t, (ga) this, param3 + -98, param1, param0);
                  break L8;
                } else {
                  break L8;
                }
              } else {
                break L8;
              }
            }
            ((ga) this).field_t.a(param1, param0, param2, (ga) this, (byte) 44);
            int discarded$1 = -9;
            ie.b();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var6;
            stackOut_30_1 = new StringBuilder().append("ga.A(");
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L9;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L9;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(byte param0, ka param1) {
        gj[] var7 = null;
        int var4 = 0;
        gj var5_ref_gj = null;
        int var6 = TorChallenge.field_F ? 1 : 0;
        try {
            var7 = ((ga) this).field_v;
            gj[] var3 = var7;
            for (var4 = 0; var7.length > var4; var4++) {
                var5_ref_gj = var7[var4];
                if (!(var5_ref_gj == null)) {
                    var5_ref_gj.field_e = param1;
                }
            }
            int var5 = -109 / ((param0 - -88) / 32);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "ga.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, eg param1, String[] param2, int param3, String param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int stackIn_4_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var13 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param1.a(param4);
              if (param3 < var5_int) {
                break L1;
              } else {
                if (param4.indexOf("<br>") != -1) {
                  break L1;
                } else {
                  param2[0] = (String) (Object) param2;
                  stackOut_3_0 = 1;
                  stackIn_4_0 = stackOut_3_0;
                  return stackIn_4_0;
                }
              }
            }
            var6 = (var5_int + param3 - 1) / param3;
            param3 = var5_int / var6;
            var6 = 0;
            var7 = 0;
            var8 = param4.length();
            var9 = 0;
            L2: while (true) {
              if (var9 >= var8) {
                L3: {
                  if (var7 >= var8) {
                    break L3;
                  } else {
                    int incrementValue$2 = var6;
                    var6++;
                    param2[incrementValue$2] = param4.substring(var7, var8).trim();
                    break L3;
                  }
                }
                stackOut_17_0 = var6;
                stackIn_18_0 = stackOut_17_0;
                break L0;
              } else {
                L4: {
                  L5: {
                    var10 = param4.charAt(var9);
                    if (var10 == 32) {
                      break L5;
                    } else {
                      if (var10 == 45) {
                        break L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var11 = param4.substring(var7, var9 - -1).trim();
                  var12 = param1.a(var11);
                  if (var12 < param3) {
                    break L4;
                  } else {
                    int incrementValue$3 = var6;
                    var6++;
                    param2[incrementValue$3] = var11;
                    var7 = 1 + var9;
                    break L4;
                  }
                }
                L6: {
                  if (var10 != 62) {
                    break L6;
                  } else {
                    break L6;
                  }
                }
                var9++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var5;
            stackOut_19_1 = new StringBuilder().append("ga.P(").append(0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          L8: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          L9: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param3).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param4 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L9;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L9;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ')');
        }
        return stackIn_18_0;
    }

    public ga() {
        ((ga) this).field_v = new gj[6];
        ((ga) this).field_t = new gj();
        gj dupTemp$0 = new gj();
        ((ga) this).field_v[0] = dupTemp$0;
        gj var1 = dupTemp$0;
        var1.b(15011);
    }

    ga(ga param0, boolean param1) {
        this();
        try {
            param0.a((ga) this, param1, 31);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "ga.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(byte param0, ka[] param1) {
        gj[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        gj var5 = null;
        int var6 = 0;
        gj[] var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var6 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var7 = ((ga) this).field_v;
              var3 = var7;
              if (param0 == 107) {
                break L1;
              } else {
                field_y = false;
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var7.length <= var4) {
                break L0;
              } else {
                L3: {
                  var5 = var7[var4];
                  if (var5 != null) {
                    var5.field_k = param1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("ga.N(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    public static void b() {
        field_s = null;
        field_w = null;
        field_x = null;
        field_u = null;
    }

    final static int a(byte param0, int param1) {
        if (param0 < 3) {
            field_x = null;
        }
        return oc.field_g[param1 & 2047];
    }

    final gj a(int param0, int param1) {
        if (param1 != -27140) {
            ((ga) this).field_v = null;
        }
        gj dupTemp$0 = new gj();
        ((ga) this).field_v[param0] = dupTemp$0;
        return dupTemp$0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "Unfortunately we are unable to create an account for you at this time.";
        field_w = new sl();
        field_x = new int[][][]{new int[7][], new int[7][], new int[7][]};
        field_s = new int[][]{new int[7], new int[7], new int[7]};
    }
}
