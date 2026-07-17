/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk extends ve {
    private int field_m;
    private int field_j;
    private int field_h;
    static int field_o;
    static String field_n;
    private int field_g;
    static int field_r;
    static String field_q;
    private int field_f;
    private le field_k;
    static String field_i;
    private boolean field_p;
    private String field_l;

    final void a(int param0, int param1, String param2, le param3, int param4) {
        RuntimeException var6 = null;
        Object var7 = null;
        rj var8 = null;
        rj var9 = null;
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
        RuntimeException decompiledCaughtException = null;
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
        try {
          L0: {
            if (param2 == null) {
              ((kk) this).field_c = null;
              return;
            } else {
              L1: {
                if (((kk) this).field_k != param3) {
                  break L1;
                } else {
                  if (!((kk) this).field_p) {
                    break L1;
                  } else {
                    if (((kk) this).field_f != 0) {
                      break L1;
                    } else {
                      if (null == ((kk) this).field_l) {
                        break L1;
                      } else {
                        if (((kk) this).field_l.equals((Object) (Object) param2)) {
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
                ((kk) this).field_l = param2;
                if (param0 >= 94) {
                  break L2;
                } else {
                  var7 = null;
                  ((kk) this).a(-77, 114, (String) null, (le) null, -62);
                  break L2;
                }
              }
              ((kk) this).field_p = true;
              ((kk) this).field_k = param3;
              ((kk) this).field_f = 0;
              var8 = this.a(param3, param2, (byte) 121, param4);
              var9 = var8;
              var8.field_a[0] = param1;
              var9.field_a[param2.length()] = param3.b(param2) + param1;
              fa.a(var9, param3, 0, param2, (byte) 123);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var6;
            stackOut_15_1 = new StringBuilder().append("kk.K(").append(param0).append(44).append(param1).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          L4: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param4 + 41);
        }
    }

    final static java.applet.Applet c(int param0) {
        if (pg.field_b != null) {
            return pg.field_b;
        }
        if (param0 != -14047) {
            java.applet.Applet discarded$0 = kk.c(7);
            return (java.applet.Applet) (Object) c.field_j;
        }
        return (java.applet.Applet) (Object) c.field_j;
    }

    final void a(le param0, int param1, int param2, int param3, int param4, int param5, int param6, String param7) {
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        rj var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        rj stackIn_35_0 = null;
        rj stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        rj stackIn_36_0 = null;
        rj stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        rj stackIn_37_0 = null;
        rj stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        int stackIn_37_4 = 0;
        rj stackIn_39_0 = null;
        le stackIn_39_1 = null;
        rj stackIn_40_0 = null;
        le stackIn_40_1 = null;
        rj stackIn_41_0 = null;
        le stackIn_41_1 = null;
        int stackIn_41_2 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        rj stackOut_34_0 = null;
        rj stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        rj stackOut_36_0 = null;
        rj stackOut_36_1 = null;
        int stackOut_36_2 = 0;
        int stackOut_36_3 = 0;
        int stackOut_36_4 = 0;
        rj stackOut_35_0 = null;
        rj stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        int stackOut_35_4 = 0;
        rj stackOut_38_0 = null;
        le stackOut_38_1 = null;
        rj stackOut_40_0 = null;
        le stackOut_40_1 = null;
        int stackOut_40_2 = 0;
        rj stackOut_39_0 = null;
        le stackOut_39_1 = null;
        int stackOut_39_2 = 0;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        var15 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 != 0) {
                break L1;
              } else {
                param2 = param0.field_C;
                break L1;
              }
            }
            if (param7 == null) {
              ((kk) this).field_c = null;
              return;
            } else {
              L2: {
                if (((kk) this).field_k != param0) {
                  break L2;
                } else {
                  if (((kk) this).field_p) {
                    break L2;
                  } else {
                    if (param1 != ((kk) this).field_f) {
                      break L2;
                    } else {
                      if (((kk) this).field_h != param3) {
                        break L2;
                      } else {
                        if (~((kk) this).field_g != ~param2) {
                          break L2;
                        } else {
                          if (~param5 != ~((kk) this).field_m) {
                            break L2;
                          } else {
                            if (param4 != ((kk) this).field_j) {
                              break L2;
                            } else {
                              if (((kk) this).field_l == null) {
                                break L2;
                              } else {
                                if (!((kk) this).field_l.equals((Object) (Object) param7)) {
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
                ((kk) this).field_l = param7;
                ((kk) this).field_h = param3;
                ((kk) this).field_f = param1;
                ((kk) this).field_j = param4;
                ((kk) this).field_g = param2;
                ((kk) this).field_p = false;
                ((kk) this).field_k = param0;
                ((kk) this).field_m = param5;
                var16 = new String[param0.a(param7, param4) + 1];
                var17 = var16;
                if (param6 < -113) {
                  break L3;
                } else {
                  ((kk) this).field_k = null;
                  break L3;
                }
              }
              L4: {
                var10 = Math.max(1, param0.a(param7, new int[1], var17));
                if (((kk) this).field_h != 3) {
                  break L4;
                } else {
                  if (1 != var10) {
                    break L4;
                  } else {
                    ((kk) this).field_h = 1;
                    break L4;
                  }
                }
              }
              L5: {
                ((kk) this).field_c = new rj[var10];
                if (((kk) this).field_h == 0) {
                  var11 = param0.field_E;
                  break L5;
                } else {
                  if (((kk) this).field_h == 1) {
                    var11 = (((kk) this).field_m + -(var10 * ((kk) this).field_g) >> 1) + param0.field_E;
                    break L5;
                  } else {
                    if (2 != ((kk) this).field_h) {
                      L6: {
                        var12 = (((kk) this).field_m + -(((kk) this).field_g * var10)) / (var10 - -1);
                        if (0 <= var12) {
                          break L6;
                        } else {
                          var12 = 0;
                          break L6;
                        }
                      }
                      var11 = param0.field_E - -var12;
                      ((kk) this).field_g = ((kk) this).field_g + var12;
                      break L5;
                    } else {
                      var11 = -(((kk) this).field_g * var10) + ((kk) this).field_m + -param0.field_G;
                      break L5;
                    }
                  }
                }
              }
              var12 = 0;
              L7: while (true) {
                if (var10 <= var12) {
                  break L0;
                } else {
                  L8: {
                    var13 = var16[var12];
                    stackOut_34_0 = null;
                    stackOut_34_1 = null;
                    stackOut_34_2 = var11 - param0.field_E;
                    stackOut_34_3 = param0.field_G + var11;
                    stackIn_36_0 = stackOut_34_0;
                    stackIn_36_1 = stackOut_34_1;
                    stackIn_36_2 = stackOut_34_2;
                    stackIn_36_3 = stackOut_34_3;
                    stackIn_35_0 = stackOut_34_0;
                    stackIn_35_1 = stackOut_34_1;
                    stackIn_35_2 = stackOut_34_2;
                    stackIn_35_3 = stackOut_34_3;
                    if (var13 == null) {
                      stackOut_36_0 = null;
                      stackOut_36_1 = null;
                      stackOut_36_2 = stackIn_36_2;
                      stackOut_36_3 = stackIn_36_3;
                      stackOut_36_4 = 0;
                      stackIn_37_0 = stackOut_36_0;
                      stackIn_37_1 = stackOut_36_1;
                      stackIn_37_2 = stackOut_36_2;
                      stackIn_37_3 = stackOut_36_3;
                      stackIn_37_4 = stackOut_36_4;
                      break L8;
                    } else {
                      stackOut_35_0 = null;
                      stackOut_35_1 = null;
                      stackOut_35_2 = stackIn_35_2;
                      stackOut_35_3 = stackIn_35_3;
                      stackOut_35_4 = var13.length();
                      stackIn_37_0 = stackOut_35_0;
                      stackIn_37_1 = stackOut_35_1;
                      stackIn_37_2 = stackOut_35_2;
                      stackIn_37_3 = stackOut_35_3;
                      stackIn_37_4 = stackOut_35_4;
                      break L8;
                    }
                  }
                  L9: {
                    var14 = new rj(stackIn_37_2, stackIn_37_3, stackIn_37_4);
                    var14.field_a[0] = 0;
                    if (var13 == null) {
                      break L9;
                    } else {
                      L10: {
                        var14.field_a[var13.length()] = param0.b(var13);
                        stackOut_38_0 = (rj) var14;
                        stackOut_38_1 = (le) param0;
                        stackIn_40_0 = stackOut_38_0;
                        stackIn_40_1 = stackOut_38_1;
                        stackIn_39_0 = stackOut_38_0;
                        stackIn_39_1 = stackOut_38_1;
                        if (param1 != 3) {
                          stackOut_40_0 = (rj) (Object) stackIn_40_0;
                          stackOut_40_1 = (le) (Object) stackIn_40_1;
                          stackOut_40_2 = 0;
                          stackIn_41_0 = stackOut_40_0;
                          stackIn_41_1 = stackOut_40_1;
                          stackIn_41_2 = stackOut_40_2;
                          break L10;
                        } else {
                          stackOut_39_0 = (rj) (Object) stackIn_39_0;
                          stackOut_39_1 = (le) (Object) stackIn_39_1;
                          stackOut_39_2 = ((kk) this).a(param4, false, param0.b(var13), var13);
                          stackIn_41_0 = stackOut_39_0;
                          stackIn_41_1 = stackOut_39_1;
                          stackIn_41_2 = stackOut_39_2;
                          break L10;
                        }
                      }
                      fa.a(stackIn_41_0, stackIn_41_1, stackIn_41_2, var13, (byte) 124);
                      break L9;
                    }
                  }
                  var11 = var11 + param2;
                  ((kk) this).field_c[var12] = var14;
                  var12++;
                  continue L7;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var9 = decompiledCaughtException;
            stackOut_44_0 = (RuntimeException) var9;
            stackOut_44_1 = new StringBuilder().append("kk.M(");
            stackIn_46_0 = stackOut_44_0;
            stackIn_46_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param0 == null) {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L11;
            } else {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "{...}";
              stackIn_47_0 = stackOut_45_0;
              stackIn_47_1 = stackOut_45_1;
              stackIn_47_2 = stackOut_45_2;
              break L11;
            }
          }
          L12: {
            stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
            stackOut_47_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_47_2).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44);
            stackIn_49_0 = stackOut_47_0;
            stackIn_49_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param7 == null) {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L12;
            } else {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "{...}";
              stackIn_50_0 = stackOut_48_0;
              stackIn_50_1 = stackOut_48_1;
              stackIn_50_2 = stackOut_48_2;
              break L12;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_50_0, stackIn_50_2 + 41);
        }
    }

    private final rj a(le param0, String param1, byte param2, int param3) {
        rj var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        rj var7 = null;
        rj stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        rj stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var7 = new rj(-param0.field_E + param3, param0.field_G + param3, param1.length());
            var5 = var7;
            var6 = -83 % ((param2 - 29) / 32);
            ((kk) this).field_c = new rj[]{var7};
            stackOut_0_0 = (rj) var5;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var5_ref;
            stackOut_2_1 = new StringBuilder().append("kk.P(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_1_0;
    }

    public static void d(int param0) {
        if (param0 >= -70) {
          field_r = 82;
          field_n = null;
          field_i = null;
          field_q = null;
          return;
        } else {
          field_n = null;
          field_i = null;
          field_q = null;
          return;
        }
    }

    final void a(int param0, le param1, String param2, int param3, byte param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        Object var8 = null;
        rj var9 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            if (param2 != null) {
              L1: {
                if (((kk) this).field_k != param1) {
                  break L1;
                } else {
                  if (!((kk) this).field_p) {
                    break L1;
                  } else {
                    if (((kk) this).field_f != 1) {
                      break L1;
                    } else {
                      if (null == ((kk) this).field_l) {
                        break L1;
                      } else {
                        if (!((kk) this).field_l.equals((Object) (Object) param2)) {
                          break L1;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                }
              }
              L2: {
                ((kk) this).field_k = param1;
                ((kk) this).field_p = true;
                if (param4 == -11) {
                  break L2;
                } else {
                  var8 = null;
                  ((kk) this).a(59, (le) null, (String) null, 117, (byte) -57);
                  break L2;
                }
              }
              ((kk) this).field_f = 1;
              var9 = this.a(param1, param2, (byte) 93, param0);
              var7 = param1.b(param2);
              var9.field_a[0] = -(var7 >> 1) + param3;
              var9.field_a[param2.length()] = param3 - -(var7 >> 1);
              fa.a(var9, param1, 0, param2, (byte) 107);
              break L0;
            } else {
              ((kk) this).field_c = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var6;
            stackOut_14_1 = new StringBuilder().append("kk.J(").append(param0).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          L4: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final void a(le param0, String param1, byte param2, int param3, int param4) {
        RuntimeException var6 = null;
        Object var7 = null;
        rj var9 = null;
        rj var10 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                if (param0 != ((kk) this).field_k) {
                  break L1;
                } else {
                  if (!((kk) this).field_p) {
                    break L1;
                  } else {
                    if (((kk) this).field_f != 2) {
                      break L1;
                    } else {
                      if (((kk) this).field_l == null) {
                        break L1;
                      } else {
                        if (((kk) this).field_l.equals((Object) (Object) param1)) {
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
                ((kk) this).field_k = param0;
                ((kk) this).field_l = param1;
                if (param2 <= -69) {
                  break L2;
                } else {
                  var7 = null;
                  ((kk) this).a((le) null, (String) null, (byte) 76, -31, 44);
                  break L2;
                }
              }
              ((kk) this).field_p = true;
              ((kk) this).field_f = 2;
              var9 = this.a(param0, param1, (byte) -36, param4);
              var10 = var9;
              var10.field_a[0] = -param0.b(param1) + param3;
              var10.field_a[param1.length()] = param3;
              fa.a(var10, param0, 0, param1, (byte) 120);
              break L0;
            } else {
              ((kk) this).field_c = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var6;
            stackOut_14_1 = new StringBuilder().append("kk.O(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          L4: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    public kk() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "This tutorial consists of a series of demonstrations, each teaching one lesson. Move and rotate the falling blocks to make words.";
        field_r = -1;
        field_q = "The game is over when a falling block cannot fully enter the playing area.<br><br>For further details, see the instructions, which are available from the main menu and the pause menu.";
        field_i = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
    }
}
