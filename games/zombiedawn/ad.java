/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad extends vg {
    private rb field_d;
    static String field_o;
    private int field_p;
    private boolean field_m;
    static vn[] field_f;
    private int field_k;
    private String field_l;
    static vo field_h;
    private int field_j;
    private int field_i;
    static vn[][] field_g;
    static int field_e;
    private int field_n;

    private final oe a(rb param0, boolean param1, String param2, int param3) {
        oe var5 = null;
        RuntimeException var5_ref = null;
        oe stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        oe stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                oe discarded$2 = this.a((rb) null, false, (String) null, -57);
                break L1;
              }
            }
            var5 = new oe(param3 - param0.field_I, param3 + param0.field_x, param2.length());
            ((ad) this).field_b = new oe[]{var5};
            stackOut_3_0 = (oe) var5;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5_ref;
            stackOut_5_1 = new StringBuilder().append("ad.P(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_4_0;
    }

    final void a(String param0, int param1, rb param2, byte param3, int param4) {
        RuntimeException var6 = null;
        oe var6_ref = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        try {
          L0: {
            if (null != param0) {
              L1: {
                if (param2 != ((ad) this).field_d) {
                  break L1;
                } else {
                  if (!((ad) this).field_m) {
                    break L1;
                  } else {
                    if (2 != ((ad) this).field_p) {
                      break L1;
                    } else {
                      if (null == ((ad) this).field_l) {
                        break L1;
                      } else {
                        if (((ad) this).field_l.equals((Object) (Object) param0)) {
                          return;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
              L2: {
                ((ad) this).field_d = param2;
                ((ad) this).field_p = 2;
                ((ad) this).field_m = true;
                ((ad) this).field_l = param0;
                var6_ref = this.a(param2, false, param0, param1);
                var6_ref.field_e[0] = param4 - param2.b(param0);
                var6_ref.field_e[param0.length()] = param4;
                ma.a(var6_ref, 0, param0, param2, false);
                if (param3 == 83) {
                  break L2;
                } else {
                  ((ad) this).a((String) null, (byte) 105, 37, (rb) null, 104, 15, -99, 98);
                  break L2;
                }
              }
              break L0;
            } else {
              ((ad) this).field_b = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var6;
            stackOut_23_1 = new StringBuilder().append("ad.N(");
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L3;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_27_0 = stackOut_24_0;
              stackIn_27_1 = stackOut_24_1;
              stackIn_27_2 = stackOut_24_2;
              break L3;
            }
          }
          L4: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param1).append(',');
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param2 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L4;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_31_0 = stackOut_28_0;
              stackIn_31_1 = stackOut_28_1;
              stackIn_31_2 = stackOut_28_2;
              break L4;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static short[] a(short[] param0, boolean param1, int param2, am param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        short[] stackIn_25_0 = null;
        short[] stackIn_29_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        short[] stackOut_24_0 = null;
        short[] stackOut_28_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var8 = ZombieDawn.field_J;
        try {
          L0: {
            var4_int = param3.k(90, param2);
            if (var4_int != 0) {
              L1: {
                L2: {
                  if (param0 == null) {
                    break L2;
                  } else {
                    if (param0.length != var4_int) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                param0 = new short[var4_int];
                break L1;
              }
              L3: {
                if (param1) {
                  break L3;
                } else {
                  ad.b(105);
                  break L3;
                }
              }
              L4: {
                L5: {
                  L6: {
                    var5 = param3.k(67, 4);
                    var6 = (short)param3.k(13, 16);
                    if (var5 <= 0) {
                      break L6;
                    } else {
                      var7 = 0;
                      L7: while (true) {
                        L8: {
                          if (var7 >= var4_int) {
                            break L8;
                          } else {
                            param0[var7] = (short)(param3.k(60, var5) + var6);
                            var7++;
                            if (var8 != 0) {
                              break L5;
                            } else {
                              if (var8 == 0) {
                                continue L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                        }
                        if (var8 == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  var7 = 0;
                  L9: while (true) {
                    if (var7 >= var4_int) {
                      break L5;
                    } else {
                      stackOut_24_0 = (short[]) param0;
                      stackIn_29_0 = stackOut_24_0;
                      stackIn_25_0 = stackOut_24_0;
                      if (var8 != 0) {
                        break L4;
                      } else {
                        stackIn_25_0[var7] = (short) var6;
                        var7++;
                        if (var8 == 0) {
                          continue L9;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                }
                stackOut_28_0 = (short[]) param0;
                stackIn_29_0 = stackOut_28_0;
                break L4;
              }
              break L0;
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (short[]) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var4;
            stackOut_30_1 = new StringBuilder().append("ad.H(");
            stackIn_33_0 = stackOut_30_0;
            stackIn_33_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param0 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L10;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_34_0 = stackOut_31_0;
              stackIn_34_1 = stackOut_31_1;
              stackIn_34_2 = stackOut_31_2;
              break L10;
            }
          }
          L11: {
            stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
            stackOut_34_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_37_0 = stackOut_34_0;
            stackIn_37_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param3 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L11;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_38_0 = stackOut_35_0;
              stackIn_38_1 = stackOut_35_1;
              stackIn_38_2 = stackOut_35_2;
              break L11;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + ')');
        }
        return stackIn_29_0;
    }

    public static void b(int param0) {
        field_g = null;
        field_h = null;
        if (param0 != -1819016370) {
            return;
        }
        try {
            field_o = null;
            field_f = null;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "ad.M(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2, String param3, rb param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        oe var7 = null;
        int var8 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        try {
          L0: {
            var6_int = -41 % ((-86 - param1) / 36);
            if (param3 == null) {
              ((ad) this).field_b = null;
              return;
            } else {
              L1: {
                if (((ad) this).field_d != param4) {
                  break L1;
                } else {
                  if (!((ad) this).field_m) {
                    break L1;
                  } else {
                    if (1 != ((ad) this).field_p) {
                      break L1;
                    } else {
                      if (null == ((ad) this).field_l) {
                        break L1;
                      } else {
                        if (((ad) this).field_l.equals((Object) (Object) param3)) {
                          return;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
              ((ad) this).field_m = true;
              ((ad) this).field_d = param4;
              ((ad) this).field_p = 1;
              var7 = this.a(param4, false, param3, param2);
              var8 = param4.b(param3);
              var7.field_e[0] = param0 + -(var8 >> 1);
              var7.field_e[param3.length()] = param0 + (var8 >> 1);
              ma.a(var7, 0, param3, param4, false);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var6;
            stackOut_23_1 = new StringBuilder().append("ad.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param3 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L2;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_27_0 = stackOut_24_0;
              stackIn_27_1 = stackOut_24_1;
              stackIn_27_2 = stackOut_24_2;
              break L2;
            }
          }
          L3: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param4 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L3;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_31_0 = stackOut_28_0;
              stackIn_31_1 = stackOut_28_1;
              stackIn_31_2 = stackOut_28_2;
              break L3;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ')');
        }
    }

    final void a(String param0, byte param1, int param2, rb param3, int param4, int param5, int param6, int param7) {
        RuntimeException var9 = null;
        String[] var9_array = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        oe var14 = null;
        int var15 = 0;
        oe stackIn_62_0 = null;
        oe stackIn_62_1 = null;
        int stackIn_62_2 = 0;
        int stackIn_62_3 = 0;
        oe stackIn_64_0 = null;
        oe stackIn_64_1 = null;
        int stackIn_64_2 = 0;
        int stackIn_64_3 = 0;
        oe stackIn_65_0 = null;
        oe stackIn_65_1 = null;
        int stackIn_65_2 = 0;
        int stackIn_65_3 = 0;
        oe stackIn_66_0 = null;
        oe stackIn_66_1 = null;
        int stackIn_66_2 = 0;
        int stackIn_66_3 = 0;
        int stackIn_66_4 = 0;
        oe stackIn_68_0 = null;
        oe stackIn_70_0 = null;
        oe stackIn_72_0 = null;
        oe stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_84_2 = null;
        RuntimeException decompiledCaughtException = null;
        oe stackOut_61_0 = null;
        oe stackOut_61_1 = null;
        int stackOut_61_2 = 0;
        int stackOut_61_3 = 0;
        oe stackOut_65_0 = null;
        oe stackOut_65_1 = null;
        int stackOut_65_2 = 0;
        int stackOut_65_3 = 0;
        int stackOut_65_4 = 0;
        oe stackOut_62_0 = null;
        oe stackOut_62_1 = null;
        int stackOut_62_2 = 0;
        int stackOut_62_3 = 0;
        oe stackOut_64_0 = null;
        oe stackOut_64_1 = null;
        int stackOut_64_2 = 0;
        int stackOut_64_3 = 0;
        int stackOut_64_4 = 0;
        oe stackOut_67_0 = null;
        oe stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        oe stackOut_68_0 = null;
        oe stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        var15 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              if (param4 == 0) {
                param4 = param3.field_C;
                break L1;
              } else {
                break L1;
              }
            }
            if (null == param0) {
              ((ad) this).field_b = null;
              return;
            } else {
              L2: {
                if (((ad) this).field_d != param3) {
                  break L2;
                } else {
                  if (((ad) this).field_m) {
                    break L2;
                  } else {
                    if (~((ad) this).field_p != ~param6) {
                      break L2;
                    } else {
                      if (param5 != ((ad) this).field_n) {
                        break L2;
                      } else {
                        if (param4 != ((ad) this).field_j) {
                          break L2;
                        } else {
                          if (param2 != ((ad) this).field_i) {
                            break L2;
                          } else {
                            if (((ad) this).field_k != param7) {
                              break L2;
                            } else {
                              if (((ad) this).field_l == null) {
                                break L2;
                              } else {
                                if (!((ad) this).field_l.equals((Object) (Object) param0)) {
                                  break L2;
                                } else {
                                  return;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              L3: {
                ((ad) this).field_m = false;
                ((ad) this).field_j = param4;
                ((ad) this).field_d = param3;
                ((ad) this).field_l = param0;
                if (param1 == -106) {
                  break L3;
                } else {
                  oe discarded$1 = this.a((rb) null, false, (String) null, 35);
                  break L3;
                }
              }
              L4: {
                ((ad) this).field_p = param6;
                ((ad) this).field_k = param7;
                ((ad) this).field_i = param2;
                ((ad) this).field_n = param5;
                var9_array = new String[1 + param3.b(param0, param7)];
                var10 = Math.max(1, param3.a(param0, new int[1], var9_array));
                if (((ad) this).field_n != 3) {
                  break L4;
                } else {
                  if (var10 != 1) {
                    break L4;
                  } else {
                    ((ad) this).field_n = 1;
                    break L4;
                  }
                }
              }
              L5: {
                L6: {
                  if (((ad) this).field_n == 0) {
                    break L6;
                  } else {
                    L7: {
                      if (((ad) this).field_n == 1) {
                        break L7;
                      } else {
                        L8: {
                          if (((ad) this).field_n == 2) {
                            break L8;
                          } else {
                            L9: {
                              var12 = (((ad) this).field_i + -(((ad) this).field_j * var10)) / (1 + var10);
                              if (var12 >= 0) {
                                break L9;
                              } else {
                                var12 = 0;
                                break L9;
                              }
                            }
                            var11 = param3.field_I - -var12;
                            ((ad) this).field_j = ((ad) this).field_j + var12;
                            if (var15 == 0) {
                              break L5;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var11 = -param3.field_x + (((ad) this).field_i + -(var10 * ((ad) this).field_j));
                        if (var15 == 0) {
                          break L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                    var11 = param3.field_I - -(-(var10 * ((ad) this).field_j) + ((ad) this).field_i >> 1);
                    if (var15 == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                var11 = param3.field_I;
                break L5;
              }
              ((ad) this).field_b = new oe[var10];
              var12 = 0;
              L10: while (true) {
                L11: {
                  L12: {
                    if (var10 <= var12) {
                      break L12;
                    } else {
                      var13 = var9_array[var12];
                      if (var15 != 0) {
                        break L11;
                      } else {
                        L13: {
                          stackOut_61_0 = null;
                          stackOut_61_1 = null;
                          stackOut_61_2 = -param3.field_I + var11;
                          stackOut_61_3 = param3.field_x + var11;
                          stackIn_65_0 = stackOut_61_0;
                          stackIn_65_1 = stackOut_61_1;
                          stackIn_65_2 = stackOut_61_2;
                          stackIn_65_3 = stackOut_61_3;
                          stackIn_62_0 = stackOut_61_0;
                          stackIn_62_1 = stackOut_61_1;
                          stackIn_62_2 = stackOut_61_2;
                          stackIn_62_3 = stackOut_61_3;
                          if (null == var13) {
                            stackOut_65_0 = null;
                            stackOut_65_1 = null;
                            stackOut_65_2 = stackIn_65_2;
                            stackOut_65_3 = stackIn_65_3;
                            stackOut_65_4 = 0;
                            stackIn_66_0 = stackOut_65_0;
                            stackIn_66_1 = stackOut_65_1;
                            stackIn_66_2 = stackOut_65_2;
                            stackIn_66_3 = stackOut_65_3;
                            stackIn_66_4 = stackOut_65_4;
                            break L13;
                          } else {
                            stackOut_62_0 = null;
                            stackOut_62_1 = null;
                            stackOut_62_2 = stackIn_62_2;
                            stackOut_62_3 = stackIn_62_3;
                            stackIn_64_0 = stackOut_62_0;
                            stackIn_64_1 = stackOut_62_1;
                            stackIn_64_2 = stackOut_62_2;
                            stackIn_64_3 = stackOut_62_3;
                            stackOut_64_0 = null;
                            stackOut_64_1 = null;
                            stackOut_64_2 = stackIn_64_2;
                            stackOut_64_3 = stackIn_64_3;
                            stackOut_64_4 = var13.length();
                            stackIn_66_0 = stackOut_64_0;
                            stackIn_66_1 = stackOut_64_1;
                            stackIn_66_2 = stackOut_64_2;
                            stackIn_66_3 = stackOut_64_3;
                            stackIn_66_4 = stackOut_64_4;
                            break L13;
                          }
                        }
                        L14: {
                          var14 = new oe(stackIn_66_2, stackIn_66_3, stackIn_66_4);
                          var14.field_e[0] = 0;
                          if (null == var13) {
                            break L14;
                          } else {
                            L15: {
                              var14.field_e[var13.length()] = param3.b(var13);
                              stackOut_67_0 = (oe) var14;
                              stackIn_72_0 = stackOut_67_0;
                              stackIn_68_0 = stackOut_67_0;
                              if (3 == param6) {
                                stackOut_72_0 = (oe) (Object) stackIn_72_0;
                                stackOut_72_1 = ((ad) this).a(param3.b(var13), var13, param7, 25);
                                stackIn_73_0 = stackOut_72_0;
                                stackIn_73_1 = stackOut_72_1;
                                break L15;
                              } else {
                                stackOut_68_0 = (oe) (Object) stackIn_68_0;
                                stackIn_70_0 = stackOut_68_0;
                                stackOut_70_0 = (oe) (Object) stackIn_70_0;
                                stackOut_70_1 = 0;
                                stackIn_73_0 = stackOut_70_0;
                                stackIn_73_1 = stackOut_70_1;
                                break L15;
                              }
                            }
                            ma.a(stackIn_73_0, stackIn_73_1, var13, param3, false);
                            break L14;
                          }
                        }
                        var11 = var11 + param4;
                        ((ad) this).field_b[var12] = var14;
                        var12++;
                        if (var15 == 0) {
                          continue L10;
                        } else {
                          break L12;
                        }
                      }
                    }
                  }
                  break L11;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var9 = decompiledCaughtException;
            stackOut_76_0 = (RuntimeException) var9;
            stackOut_76_1 = new StringBuilder().append("ad.O(");
            stackIn_79_0 = stackOut_76_0;
            stackIn_79_1 = stackOut_76_1;
            stackIn_77_0 = stackOut_76_0;
            stackIn_77_1 = stackOut_76_1;
            if (param0 == null) {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "null";
              stackIn_80_0 = stackOut_79_0;
              stackIn_80_1 = stackOut_79_1;
              stackIn_80_2 = stackOut_79_2;
              break L16;
            } else {
              stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
              stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
              stackOut_77_2 = "{...}";
              stackIn_80_0 = stackOut_77_0;
              stackIn_80_1 = stackOut_77_1;
              stackIn_80_2 = stackOut_77_2;
              break L16;
            }
          }
          L17: {
            stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
            stackOut_80_1 = ((StringBuilder) (Object) stackIn_80_1).append(stackIn_80_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_83_0 = stackOut_80_0;
            stackIn_83_1 = stackOut_80_1;
            stackIn_81_0 = stackOut_80_0;
            stackIn_81_1 = stackOut_80_1;
            if (param3 == null) {
              stackOut_83_0 = (RuntimeException) (Object) stackIn_83_0;
              stackOut_83_1 = (StringBuilder) (Object) stackIn_83_1;
              stackOut_83_2 = "null";
              stackIn_84_0 = stackOut_83_0;
              stackIn_84_1 = stackOut_83_1;
              stackIn_84_2 = stackOut_83_2;
              break L17;
            } else {
              stackOut_81_0 = (RuntimeException) (Object) stackIn_81_0;
              stackOut_81_1 = (StringBuilder) (Object) stackIn_81_1;
              stackOut_81_2 = "{...}";
              stackIn_84_0 = stackOut_81_0;
              stackIn_84_1 = stackOut_81_1;
              stackIn_84_2 = stackOut_81_2;
              break L17;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_84_0, stackIn_84_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static void a(boolean param0, int[] param1, gd param2, byte param3, boolean param4, boolean param5, int[] param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
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
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_61_0 = 0;
        int stackOut_61_1 = 0;
        int stackOut_66_0 = 0;
        int stackOut_66_1 = 0;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        var30 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              var7_int = 2147483647;
              var8 = -2147483648;
              if (param3 == 50) {
                break L1;
              } else {
                field_g = null;
                break L1;
              }
            }
            var21 = param6[3] >> 2;
            var22 = param6[4] >> 2;
            var23 = param6[5] >> 2;
            var24 = param6[6] >> 2;
            var25 = param6[7] >> 2;
            var26 = param6[8] >> 2;
            var27 = param6[9] >> 2;
            var28 = param6[10] >> 2;
            var12 = param1[4] * var22 + (param1[3] * var21 - -(var23 * param1[5])) >> 14;
            var29 = param6[11] >> 2;
            var13 = param1[4] * var25 + (var24 * param1[3] - -(param1[5] * var26)) >> 14;
            var16 = var25 * param1[7] + (var24 * param1[6] - -(param1[8] * var26)) >> 14;
            var18 = param1[11] * var23 + var22 * param1[10] + param1[9] * var21 >> 14;
            var17 = var28 * param1[7] + (var27 * param1[6] - -(param1[8] * var29)) >> 14;
            var20 = param1[11] * var29 + (param1[9] * var27 - -(param1[10] * var28)) >> 14;
            var14 = var29 * param1[5] + var27 * param1[3] - -(var28 * param1[4]) >> 14;
            var15 = var23 * param1[8] + var22 * param1[7] + param1[6] * var21 >> 14;
            var19 = var25 * param1[10] + param1[9] * var24 - -(var26 * param1[11]) >> 14;
            var21 = -param6[0] + param1[0];
            var22 = -param6[1] + param1[1];
            var23 = param1[2] + -param6[2];
            var9 = param6[5] * var23 + (var21 * param6[3] + var22 * param6[4]) >> 16 + -f.field_a;
            var10 = var22 * param6[7] + var21 * param6[6] - -(param6[8] * var23) >> -f.field_a + 16;
            var11 = var22 * param6[10] + param6[9] * var21 - -(param6[11] * var23) >> 16;
            var21 = en.field_a;
            var22 = en.field_i;
            var23 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  L5: {
                    if (param2.field_k <= var23) {
                      break L5;
                    } else {
                      var24 = param2.field_G[var23];
                      var25 = param2.field_B[var23];
                      var26 = param2.field_m[var23];
                      var27 = var9 - -(var25 * var15 + (var24 * var12 + var26 * var18) >> -f.field_a + 16);
                      var28 = var10 - -(var19 * var26 + var25 * var16 + var24 * var13 >> -f.field_a + 16);
                      var29 = var11 - -(var26 * var20 + (var24 * var14 + var25 * var17) >> 16);
                      stackOut_6_0 = var29;
                      stackOut_6_1 = 50;
                      stackIn_67_0 = stackOut_6_0;
                      stackIn_67_1 = stackOut_6_1;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      if (var30 != 0) {
                        break L4;
                      } else {
                        L6: {
                          L7: {
                            if (stackIn_7_0 >= stackIn_7_1) {
                              break L7;
                            } else {
                              pj.field_s[var23] = -2147483648;
                              if (var30 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          L8: {
                            to.field_a[var23] = var21 - -(var27 / var29);
                            wc.field_Nb[var23] = var28 / var29 + var22;
                            if (var29 < var7_int) {
                              var7_int = var29;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          L9: {
                            if (~var8 <= ~var29) {
                              break L9;
                            } else {
                              var8 = var29;
                              break L9;
                            }
                          }
                          pj.field_s[var23] = var29;
                          break L6;
                        }
                        L10: {
                          if (param4) {
                            ip.field_r[var23] = var27 >> f.field_a;
                            fm.field_G[var23] = var28 >> f.field_a;
                            g.field_P[var23] = var29;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        var23++;
                        if (var30 == 0) {
                          continue L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  L11: {
                    if (null == param2.field_e) {
                      break L11;
                    } else {
                      if (null == param2.field_j) {
                        break L11;
                      } else {
                        if (param2.field_A == null) {
                          break L11;
                        } else {
                          if (null == param2.field_N) {
                            break L11;
                          } else {
                            if (null == param2.field_i) {
                              break L11;
                            } else {
                              if (param2.field_I == null) {
                                break L11;
                              } else {
                                if (null == param2.field_D) {
                                  break L11;
                                } else {
                                  if (param2.field_t == null) {
                                    break L11;
                                  } else {
                                    if (null == param2.field_z) {
                                      break L11;
                                    } else {
                                      var23 = 0;
                                      L12: while (true) {
                                        if (~param2.field_c >= ~var23) {
                                          break L11;
                                        } else {
                                          var24 = param2.field_e[var23];
                                          var25 = param2.field_j[var23];
                                          var26 = param2.field_A[var23];
                                          qk.field_Cb[var23] = var9 - -(var26 * var18 + (var24 * var12 - -(var25 * var15)) >> 16);
                                          kj.field_b[var23] = var10 - -(var19 * var26 + (var13 * var24 - -(var25 * var16)) >> 16);
                                          po.field_zb[var23] = (var26 * var20 + (var24 * var14 - -(var17 * var25)) >> 16) + var11;
                                          var24 = param2.field_N[var23];
                                          var25 = param2.field_i[var23];
                                          var26 = param2.field_I[var23];
                                          rm.field_c[var23] = var9 - -(var18 * var26 + (var25 * var15 + var12 * var24) >> 16);
                                          lb.field_db[var23] = (var13 * var24 + (var16 * var25 - -(var26 * var19)) >> 16) + var10;
                                          ce.field_v[var23] = var11 - -(var24 * var14 + var17 * var25 - -(var26 * var20) >> 16);
                                          var24 = param2.field_D[var23];
                                          var25 = param2.field_t[var23];
                                          var26 = param2.field_z[var23];
                                          d.field_d[var23] = (var26 * var18 + var24 * var12 + var25 * var15 >> 16) + var9;
                                          f.field_g[var23] = (var19 * var26 + var25 * var16 + var13 * var24 >> 16) + var10;
                                          wo.field_zb[var23] = (var24 * var14 - (-(var17 * var25) - var26 * var20) >> 16) + var11;
                                          var23++;
                                          if (var30 != 0) {
                                            break L3;
                                          } else {
                                            if (var30 == 0) {
                                              continue L12;
                                            } else {
                                              break L11;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  L13: {
                    if (!param0) {
                      break L13;
                    } else {
                      var9 = param1[3];
                      var10 = param1[4];
                      var11 = param1[5];
                      var12 = param1[6];
                      var13 = param1[7];
                      var14 = param1[8];
                      var15 = param1[9];
                      var16 = param1[10];
                      var17 = param1[11];
                      var18 = 0;
                      L14: while (true) {
                        if (~param2.field_f >= ~var18) {
                          break L13;
                        } else {
                          stackOut_61_0 = og.field_y.length;
                          stackOut_61_1 = var18;
                          stackIn_67_0 = stackOut_61_0;
                          stackIn_67_1 = stackOut_61_1;
                          stackIn_62_0 = stackOut_61_0;
                          stackIn_62_1 = stackOut_61_1;
                          if (var30 != 0) {
                            break L4;
                          } else {
                            if (stackIn_62_0 <= stackIn_62_1) {
                              break L13;
                            } else {
                              var19 = param2.field_M[var18];
                              var20 = param2.field_q[var18];
                              var21 = param2.field_y[var18];
                              og.field_y[var18] = var15 * var21 + var19 * var9 - -(var20 * var12) >> 16;
                              jl.field_s[var18] = var21 * var16 + var13 * var20 + var19 * var10 >> 16;
                              qb.field_c[var18] = var11 * var19 - (-(var14 * var20) + -(var21 * var17)) >> 16;
                              var18++;
                              if (var30 == 0) {
                                continue L14;
                              } else {
                                break L13;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_66_0 = 0;
                  stackOut_66_1 = var7_int;
                  stackIn_67_0 = stackOut_66_0;
                  stackIn_67_1 = stackOut_66_1;
                  break L4;
                }
                po.a(stackIn_67_0, stackIn_67_1, param5, var8, param2);
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var7 = decompiledCaughtException;
            stackOut_69_0 = (RuntimeException) var7;
            stackOut_69_1 = new StringBuilder().append("ad.K(").append(param0).append(',');
            stackIn_72_0 = stackOut_69_0;
            stackIn_72_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param1 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L15;
            } else {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "{...}";
              stackIn_73_0 = stackOut_70_0;
              stackIn_73_1 = stackOut_70_1;
              stackIn_73_2 = stackOut_70_2;
              break L15;
            }
          }
          L16: {
            stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
            stackOut_73_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(',');
            stackIn_76_0 = stackOut_73_0;
            stackIn_76_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param2 == null) {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L16;
            } else {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "{...}";
              stackIn_77_0 = stackOut_74_0;
              stackIn_77_1 = stackOut_74_1;
              stackIn_77_2 = stackOut_74_2;
              break L16;
            }
          }
          L17: {
            stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
            stackOut_77_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_77_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_80_0 = stackOut_77_0;
            stackIn_80_1 = stackOut_77_1;
            stackIn_78_0 = stackOut_77_0;
            stackIn_78_1 = stackOut_77_1;
            if (param6 == null) {
              stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
              stackOut_80_1 = (StringBuilder) (Object) stackIn_80_1;
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L17;
            } else {
              stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
              stackOut_78_1 = (StringBuilder) (Object) stackIn_78_1;
              stackOut_78_2 = "{...}";
              stackIn_81_0 = stackOut_78_0;
              stackIn_81_1 = stackOut_78_1;
              stackIn_81_2 = stackOut_78_2;
              break L17;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_81_0, stackIn_81_2 + ')');
        }
    }

    final void a(int param0, rb param1, String param2, int param3, int param4) {
        RuntimeException var6 = null;
        oe var6_ref = null;
        int var7 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        try {
          L0: {
            if (null == param2) {
              ((ad) this).field_b = null;
              return;
            } else {
              L1: {
                if (param1 != ((ad) this).field_d) {
                  break L1;
                } else {
                  if (!((ad) this).field_m) {
                    break L1;
                  } else {
                    if (((ad) this).field_p != 0) {
                      break L1;
                    } else {
                      if (((ad) this).field_l == null) {
                        break L1;
                      } else {
                        if (((ad) this).field_l.equals((Object) (Object) param2)) {
                          return;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
              ((ad) this).field_l = param2;
              ((ad) this).field_d = param1;
              ((ad) this).field_m = true;
              ((ad) this).field_p = 0;
              var6_ref = this.a(param1, false, param2, param4);
              var6_ref.field_e[0] = param3;
              var6_ref.field_e[param2.length()] = param1.b(param2) + param3;
              var7 = 91 % ((19 - param0) / 59);
              ma.a(var6_ref, 0, param2, param1, false);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var6;
            stackOut_23_1 = new StringBuilder().append("ad.J(").append(param0).append(',');
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L2;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_27_0 = stackOut_24_0;
              stackIn_27_1 = stackOut_24_1;
              stackIn_27_2 = stackOut_24_2;
              break L2;
            }
          }
          L3: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param2 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L3;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_31_0 = stackOut_28_0;
              stackIn_31_1 = stackOut_28_1;
              stackIn_31_2 = stackOut_28_2;
              break L3;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void c(byte param0) {
        try {
            wo.field_xb.j(param0 ^ -636330917);
            wo.field_xb.a((ga) (Object) new lb(wo.field_xb), true);
            if (param0 != 122) {
                ad.b(-91);
            }
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "ad.I(" + param0 + ')');
        }
    }

    public ad() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Waiting for extra data";
        field_h = new vo();
        field_g = new vn[2][];
    }
}
