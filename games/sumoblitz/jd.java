/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd extends ag {
    private int field_e;
    private boolean field_i;
    static ri[] field_h;
    private int field_j;
    private int field_k;
    private vn field_l;
    private int field_g;
    private int field_m;
    private String field_f;

    final void a(byte param0, int param1, vn param2, int param3, String param4, int param5, int param6, int param7) {
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        tk var15 = null;
        int var16 = 0;
        String[] var17 = null;
        String[] var18 = null;
        tk stackIn_33_0 = null;
        tk stackIn_33_1 = null;
        int stackIn_33_2 = 0;
        int stackIn_33_3 = 0;
        tk stackIn_34_0 = null;
        tk stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        tk stackIn_35_0 = null;
        tk stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        int stackIn_35_4 = 0;
        int stackIn_38_0 = 0;
        tk stackIn_38_1 = null;
        int stackIn_39_0 = 0;
        tk stackIn_39_1 = null;
        int stackIn_40_0 = 0;
        tk stackIn_40_1 = null;
        int stackIn_40_2 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        tk stackOut_32_0 = null;
        tk stackOut_32_1 = null;
        int stackOut_32_2 = 0;
        int stackOut_32_3 = 0;
        tk stackOut_34_0 = null;
        tk stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        int stackOut_34_4 = 0;
        tk stackOut_33_0 = null;
        tk stackOut_33_1 = null;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        int stackOut_33_4 = 0;
        int stackOut_37_0 = 0;
        tk stackOut_37_1 = null;
        int stackOut_39_0 = 0;
        tk stackOut_39_1 = null;
        int stackOut_39_2 = 0;
        int stackOut_38_0 = 0;
        tk stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        var16 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (0 != param6) {
                break L1;
              } else {
                param6 = param2.field_F;
                break L1;
              }
            }
            if (param4 != null) {
              L2: {
                if (param2 != ((jd) this).field_l) {
                  break L2;
                } else {
                  if (((jd) this).field_i) {
                    break L2;
                  } else {
                    if (~((jd) this).field_e != ~param1) {
                      break L2;
                    } else {
                      if (((jd) this).field_m != param5) {
                        break L2;
                      } else {
                        if (~param6 != ~((jd) this).field_j) {
                          break L2;
                        } else {
                          if (~param3 != ~((jd) this).field_g) {
                            break L2;
                          } else {
                            if (((jd) this).field_k != param7) {
                              break L2;
                            } else {
                              if (((jd) this).field_f == null) {
                                break L2;
                              } else {
                                if (!((jd) this).field_f.equals((Object) (Object) param4)) {
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
                ((jd) this).field_f = param4;
                ((jd) this).field_j = param6;
                ((jd) this).field_i = false;
                ((jd) this).field_g = param3;
                ((jd) this).field_e = param1;
                ((jd) this).field_k = param7;
                ((jd) this).field_l = param2;
                ((jd) this).field_m = param5;
                var17 = new String[param2.b(param4, param7) - -1];
                var18 = var17;
                var10 = Math.max(1, param2.a(param4, new int[1], var18));
                if (((jd) this).field_m != 3) {
                  break L3;
                } else {
                  if (var10 == 1) {
                    ((jd) this).field_m = 1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                var12 = -23 / ((13 - param0) / 59);
                if (((jd) this).field_m == 0) {
                  var11 = param2.field_s;
                  break L4;
                } else {
                  if (1 != ((jd) this).field_m) {
                    if (((jd) this).field_m != 2) {
                      L5: {
                        var13 = (((jd) this).field_g + -(var10 * ((jd) this).field_j)) / (var10 + 1);
                        if (0 <= var13) {
                          break L5;
                        } else {
                          var13 = 0;
                          break L5;
                        }
                      }
                      ((jd) this).field_j = ((jd) this).field_j + var13;
                      var11 = param2.field_s + var13;
                      break L4;
                    } else {
                      var11 = -(var10 * ((jd) this).field_j) + ((jd) this).field_g + -param2.field_I;
                      break L4;
                    }
                  } else {
                    var11 = (((jd) this).field_g - var10 * ((jd) this).field_j >> 1) + param2.field_s;
                    break L4;
                  }
                }
              }
              ((jd) this).field_a = new tk[var10];
              var13 = 0;
              L6: while (true) {
                if (~var10 >= ~var13) {
                  break L0;
                } else {
                  L7: {
                    var14 = var17[var13];
                    stackOut_32_0 = null;
                    stackOut_32_1 = null;
                    stackOut_32_2 = -param2.field_s + var11;
                    stackOut_32_3 = param2.field_I + var11;
                    stackIn_34_0 = stackOut_32_0;
                    stackIn_34_1 = stackOut_32_1;
                    stackIn_34_2 = stackOut_32_2;
                    stackIn_34_3 = stackOut_32_3;
                    stackIn_33_0 = stackOut_32_0;
                    stackIn_33_1 = stackOut_32_1;
                    stackIn_33_2 = stackOut_32_2;
                    stackIn_33_3 = stackOut_32_3;
                    if (var14 != null) {
                      stackOut_34_0 = null;
                      stackOut_34_1 = null;
                      stackOut_34_2 = stackIn_34_2;
                      stackOut_34_3 = stackIn_34_3;
                      stackOut_34_4 = var14.length();
                      stackIn_35_0 = stackOut_34_0;
                      stackIn_35_1 = stackOut_34_1;
                      stackIn_35_2 = stackOut_34_2;
                      stackIn_35_3 = stackOut_34_3;
                      stackIn_35_4 = stackOut_34_4;
                      break L7;
                    } else {
                      stackOut_33_0 = null;
                      stackOut_33_1 = null;
                      stackOut_33_2 = stackIn_33_2;
                      stackOut_33_3 = stackIn_33_3;
                      stackOut_33_4 = 0;
                      stackIn_35_0 = stackOut_33_0;
                      stackIn_35_1 = stackOut_33_1;
                      stackIn_35_2 = stackOut_33_2;
                      stackIn_35_3 = stackOut_33_3;
                      stackIn_35_4 = stackOut_33_4;
                      break L7;
                    }
                  }
                  L8: {
                    var15 = new tk(stackIn_35_2, stackIn_35_3, stackIn_35_4);
                    var15.field_b[0] = 0;
                    if (var14 != null) {
                      L9: {
                        var15.field_b[var14.length()] = param2.a(var14);
                        stackOut_37_0 = 90;
                        stackOut_37_1 = (tk) var15;
                        stackIn_39_0 = stackOut_37_0;
                        stackIn_39_1 = stackOut_37_1;
                        stackIn_38_0 = stackOut_37_0;
                        stackIn_38_1 = stackOut_37_1;
                        if (3 != param1) {
                          stackOut_39_0 = stackIn_39_0;
                          stackOut_39_1 = (tk) (Object) stackIn_39_1;
                          stackOut_39_2 = 0;
                          stackIn_40_0 = stackOut_39_0;
                          stackIn_40_1 = stackOut_39_1;
                          stackIn_40_2 = stackOut_39_2;
                          break L9;
                        } else {
                          stackOut_38_0 = stackIn_38_0;
                          stackOut_38_1 = (tk) (Object) stackIn_38_1;
                          stackOut_38_2 = ((jd) this).a(-292767736, param7, var14, param2.a(var14));
                          stackIn_40_0 = stackOut_38_0;
                          stackIn_40_1 = stackOut_38_1;
                          stackIn_40_2 = stackOut_38_2;
                          break L9;
                        }
                      }
                      kw.a((byte) stackIn_40_0, stackIn_40_1, stackIn_40_2, param2, var14);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  var11 = var11 + param6;
                  ((jd) this).field_a[var13] = var15;
                  var13++;
                  continue L6;
                }
              }
            } else {
              ((jd) this).field_a = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var9 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) var9;
            stackOut_43_1 = new StringBuilder().append("jd.F(").append(param0).append(',').append(param1).append(',');
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param2 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L10;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L10;
            }
          }
          L11: {
            stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
            stackOut_46_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_46_2).append(',').append(param3).append(',');
            stackIn_48_0 = stackOut_46_0;
            stackIn_48_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param4 == null) {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L11;
            } else {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "{...}";
              stackIn_49_0 = stackOut_47_0;
              stackIn_49_1 = stackOut_47_1;
              stackIn_49_2 = stackOut_47_2;
              break L11;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_49_0, stackIn_49_2 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final void a(int param0, vn param1, int param2, String param3, int param4) {
        tk var8 = null;
        int var7 = 0;
        if (!(param3 != null)) {
            ((jd) this).field_a = null;
            return;
        }
        if (((jd) this).field_l == param1) {
            if (((jd) this).field_i) {
                if (((jd) this).field_e == 1) {
                    if (null != ((jd) this).field_f) {
                        if (!(!((jd) this).field_f.equals((Object) (Object) param3))) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            if (param2 < 73) {
                ((jd) this).field_k = -104;
            }
            ((jd) this).field_i = true;
            ((jd) this).field_l = param1;
            ((jd) this).field_e = 1;
            var8 = this.a(param0, -106, param1, param3);
            var7 = param1.a(param3);
            var8.field_b[0] = -(var7 >> 1) + param4;
            var8.field_b[param3.length()] = param4 - -(var7 >> 1);
            kw.a((byte) 90, var8, 0, param1, param3);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "jd.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static boolean a(String param0, byte param1, String param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              param2 = gf.a('_', param2, false, "");
              var3 = ji.a(param0, (byte) 117);
              if (param1 > 29) {
                break L1;
              } else {
                String discarded$2 = jd.e(58);
                break L1;
              }
            }
            L2: {
              L3: {
                if (param2.indexOf(param0) != -1) {
                  break L3;
                } else {
                  if (-1 == param2.indexOf(var3)) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("jd.D(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          L5: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    public static void d() {
        field_h = null;
    }

    final static String e(int param0) {
        if (param0 <= 71) {
            Object var2 = null;
            int discarded$0 = jd.a((lj) null, 38, (lj) null, -17, false, -119, (String) null);
        }
        if (up.field_d) {
            return null;
        }
        if (fn.field_s > qf.field_a) {
            return null;
        }
        if (!(qf.field_a >= fn.field_s + sb.field_c)) {
            return hp.field_l;
        }
        return null;
    }

    final static void a(tv param0, byte param1, boolean param2) {
        try {
            if (param1 < 54) {
                field_h = null;
            }
            uj.a((byte) -124, 256, param2, param0);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "jd.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final tk a(int param0, int param1, vn param2, String param3) {
        tk var5 = null;
        RuntimeException var5_ref = null;
        tk var6 = null;
        tk stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        tk stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var6 = new tk(-param2.field_s + param0, param2.field_I + param0, param3.length());
              var5 = var6;
              ((jd) this).field_a = new tk[]{var6};
              if (param1 == -106) {
                break L1;
              } else {
                ((jd) this).field_l = null;
                break L1;
              }
            }
            stackOut_2_0 = (tk) var5;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5_ref;
            stackOut_4_1 = new StringBuilder().append("jd.E(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final static int a(lj param0, int param1, lj param2, int param3, boolean param4, int param5, String param6) {
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        String var15 = null;
        Object var16 = null;
        CharSequence var17 = null;
        int stackIn_8_0 = 0;
        fs stackIn_12_0 = null;
        fs stackIn_13_0 = null;
        fs stackIn_14_0 = null;
        String stackIn_14_1 = null;
        fs stackIn_15_0 = null;
        fs stackIn_16_0 = null;
        fs stackIn_17_0 = null;
        String stackIn_17_1 = null;
        int stackIn_37_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_67_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        fs stackOut_11_0 = null;
        fs stackOut_13_0 = null;
        String stackOut_13_1 = null;
        fs stackOut_12_0 = null;
        String stackOut_12_1 = null;
        fs stackOut_14_0 = null;
        fs stackOut_16_0 = null;
        String stackOut_16_1 = null;
        fs stackOut_15_0 = null;
        String stackOut_15_1 = null;
        int stackOut_36_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_66_0 = 0;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        var16 = null;
        var13 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param5 > 20) {
                break L1;
              } else {
                var14 = null;
                jd.a((tv) null, (byte) 63, false);
                break L1;
              }
            }
            L2: {
              var15 = param0.a(true);
              var8 = param2.a(true);
              if (null == qk.field_O) {
                if (!nd.a((byte) -83, false)) {
                  stackOut_7_0 = -1;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            }
            L3: {
              if (kw.field_c != gg.field_t) {
                break L3;
              } else {
                L4: {
                  aw.field_j = null;
                  as.field_v.field_p = 0;
                  if (param6 != null) {
                    L5: {
                      var9 = 0;
                      if (!param4) {
                        break L5;
                      } else {
                        var9 = var9 | 1;
                        break L5;
                      }
                    }
                    L6: {
                      sd.field_e.field_p = 0;
                      sd.field_e.e(48, fd.field_d.nextInt());
                      sd.field_e.e(48, fd.field_d.nextInt());
                      sd.field_e.b(var15, (byte) -108);
                      sd.field_e.b(var8, (byte) -121);
                      var17 = (CharSequence) (Object) param6;
                      int discarded$6 = 1457;
                      sd.field_e.b(kh.a(var17), (byte) -107);
                      sd.field_e.b(-69, param3);
                      sd.field_e.b((byte) 50, param1);
                      sd.field_e.b((byte) 50, var9);
                      as.field_v.b((byte) 114, 18);
                      as.field_v.field_p = as.field_v.field_p + 2;
                      var10 = as.field_v.field_p;
                      var11_ref_String = dv.a(-94, ra.c(2));
                      if (var11_ref_String == null) {
                        var11_ref_String = "";
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    as.field_v.a(var11_ref_String, (byte) -115);
                    ks.a(gh.field_a, oh.field_c, false, (fs) (Object) as.field_v, sd.field_e);
                    as.field_v.a(0, as.field_v.field_p - var10);
                    break L4;
                  } else {
                    L7: {
                      sd.field_e.field_p = 0;
                      sd.field_e.e(48, fd.field_d.nextInt());
                      sd.field_e.e(48, fd.field_d.nextInt());
                      stackOut_11_0 = sd.field_e;
                      stackIn_13_0 = stackOut_11_0;
                      stackIn_12_0 = stackOut_11_0;
                      if (!param0.a(110)) {
                        stackOut_13_0 = (fs) (Object) stackIn_13_0;
                        stackOut_13_1 = "";
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        break L7;
                      } else {
                        stackOut_12_0 = (fs) (Object) stackIn_12_0;
                        stackOut_12_1 = (String) var15;
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_14_1 = stackOut_12_1;
                        break L7;
                      }
                    }
                    L8: {
                      ((fs) (Object) stackIn_14_0).b(stackIn_14_1, (byte) 120);
                      stackOut_14_0 = sd.field_e;
                      stackIn_16_0 = stackOut_14_0;
                      stackIn_15_0 = stackOut_14_0;
                      if (!param2.a(91)) {
                        stackOut_16_0 = (fs) (Object) stackIn_16_0;
                        stackOut_16_1 = "";
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        break L8;
                      } else {
                        stackOut_15_0 = (fs) (Object) stackIn_15_0;
                        stackOut_15_1 = (String) var8;
                        stackIn_17_0 = stackOut_15_0;
                        stackIn_17_1 = stackOut_15_1;
                        break L8;
                      }
                    }
                    ((fs) (Object) stackIn_17_0).b(stackIn_17_1, (byte) 101);
                    as.field_v.b((byte) 108, 16);
                    as.field_v.field_p = as.field_v.field_p + 1;
                    var9 = as.field_v.field_p;
                    ks.a(gh.field_a, oh.field_c, false, (fs) (Object) as.field_v, sd.field_e);
                    as.field_v.c(as.field_v.field_p + -var9, -13745);
                    break L4;
                  }
                }
                gt.a(0, -1);
                kw.field_c = vf.field_c;
                break L3;
              }
            }
            L9: {
              if (kw.field_c == vf.field_c) {
                if (ju.b(-1, 1)) {
                  L10: {
                    var9 = ig.field_a.e(-31302);
                    ig.field_a.field_p = 0;
                    if (var9 < 100) {
                      break L10;
                    } else {
                      if (var9 <= 105) {
                        kw.field_c = oi.field_a;
                        mn.field_g = new String[-100 + var9];
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  if (var9 == 248) {
                    bw.a(false, ra.c(2));
                    ns.field_c = qk.field_R;
                    kk.a((byte) -116);
                    sr.field_g = false;
                    stackOut_36_0 = var9;
                    stackIn_37_0 = stackOut_36_0;
                    return stackIn_37_0;
                  } else {
                    if (var9 != 99) {
                      gu.field_d = -1;
                      iw.field_a = var9;
                      kw.field_c = fm.field_b;
                      break L9;
                    } else {
                      int discarded$7 = -105;
                      boolean discarded$8 = ju.b(-1, br.b());
                      int discarded$9 = 115;
                      aw.field_j = new Boolean(of.a((fs) (Object) ig.field_a));
                      ig.field_a.field_p = 0;
                      break L9;
                    }
                  }
                } else {
                  break L9;
                }
              } else {
                break L9;
              }
            }
            L11: {
              if (oi.field_a == kw.field_c) {
                var9 = 2;
                if (ju.b(-1, var9)) {
                  var10 = ig.field_a.a(255);
                  ig.field_a.field_p = 0;
                  if (!ju.b(-1, var10)) {
                    break L11;
                  } else {
                    var11 = mn.field_g.length;
                    var12 = 0;
                    L12: while (true) {
                      if (~var11 >= ~var12) {
                        kk.a((byte) -110);
                        sr.field_g = false;
                        stackOut_47_0 = var11 + 100;
                        stackIn_48_0 = stackOut_47_0;
                        return stackIn_48_0;
                      } else {
                        mn.field_g[var12] = ig.field_a.g(-105);
                        var12++;
                        continue L12;
                      }
                    }
                  }
                } else {
                  break L11;
                }
              } else {
                break L11;
              }
            }
            L13: {
              if (fm.field_b != kw.field_c) {
                break L13;
              } else {
                int discarded$10 = 119;
                if (!lt.a()) {
                  break L13;
                } else {
                  L14: {
                    if (iw.field_a != 255) {
                      ns.field_c = ig.field_a.d(-1);
                      break L14;
                    } else {
                      var9_ref_String = ig.field_a.g((byte) 80);
                      if (var9_ref_String != null) {
                        jb.a((byte) 97, var9_ref_String, ra.c(2));
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                  }
                  kk.a((byte) -127);
                  sr.field_g = false;
                  stackOut_56_0 = iw.field_a;
                  stackIn_57_0 = stackOut_56_0;
                  return stackIn_57_0;
                }
              }
            }
            L15: {
              if (qk.field_O != null) {
                break L15;
              } else {
                if (sr.field_g) {
                  L16: {
                    int discarded$11 = 26560;
                    if (30000L < uc.b()) {
                      ns.field_c = ar.field_F;
                      break L16;
                    } else {
                      ns.field_c = nd.field_G;
                      break L16;
                    }
                  }
                  sr.field_g = false;
                  stackOut_64_0 = 249;
                  stackIn_65_0 = stackOut_64_0;
                  return stackIn_65_0;
                } else {
                  var9 = vp.field_a;
                  vp.field_a = nb.field_b;
                  sr.field_g = true;
                  nb.field_b = var9;
                  break L15;
                }
              }
            }
            stackOut_66_0 = -1;
            stackIn_67_0 = stackOut_66_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var7 = decompiledCaughtException;
            stackOut_68_0 = (RuntimeException) var7;
            stackOut_68_1 = new StringBuilder().append("jd.A(");
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param0 == null) {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L17;
            } else {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "{...}";
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              stackIn_71_2 = stackOut_69_2;
              break L17;
            }
          }
          L18: {
            stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
            stackOut_71_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',').append(param1).append(',');
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param2 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L18;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L18;
            }
          }
          L19: {
            stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
            stackOut_74_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_74_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_76_0 = stackOut_74_0;
            stackIn_76_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param6 == null) {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L19;
            } else {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "{...}";
              stackIn_77_0 = stackOut_75_0;
              stackIn_77_1 = stackOut_75_1;
              stackIn_77_2 = stackOut_75_2;
              break L19;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_77_0, stackIn_77_2 + ')');
        }
        return stackIn_67_0;
    }

    public jd() {
    }

    final void a(vn param0, int param1, int param2, String param3, byte param4) {
        if (param3 == null) {
            ((jd) this).field_a = null;
            return;
        }
        if (((jd) this).field_l == param0) {
            if (((jd) this).field_i) {
                if (((jd) this).field_e == 2) {
                    if (((jd) this).field_f != null) {
                        if (((jd) this).field_f.equals((Object) (Object) param3)) {
                            return;
                        }
                    }
                }
            }
        }
        ((jd) this).field_e = 2;
        ((jd) this).field_l = param0;
        ((jd) this).field_i = true;
        ((jd) this).field_f = param3;
        tk var7 = this.a(param1, param4 ^ -39, param0, param3);
        tk var8 = var7;
        if (param4 != 79) {
            return;
        }
        try {
            var8.field_b[0] = param2 + -param0.a(param3);
            var7.field_b[param3.length()] = param2;
            kw.a((byte) 90, var8, 0, param0, param3);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "jd.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final void a(vn param0, int param1, String param2, int param3, byte param4) {
        tk var7 = null;
        tk var8 = null;
        if (param2 == null) {
            ((jd) this).field_a = null;
            return;
        }
        if (param4 != -36) {
            ((jd) this).field_f = null;
        }
        if (param0 == ((jd) this).field_l) {
            if (((jd) this).field_i) {
                if (((jd) this).field_e == 0) {
                    if (((jd) this).field_f != null) {
                        if (!(!((jd) this).field_f.equals((Object) (Object) param2))) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((jd) this).field_e = 0;
            ((jd) this).field_l = param0;
            ((jd) this).field_i = true;
            ((jd) this).field_f = param2;
            var7 = this.a(param1, -106, param0, param2);
            var8 = var7;
            var7.field_b[0] = param3;
            var8.field_b[param2.length()] = param3 - -param0.a(param2);
            kw.a((byte) 90, var8, 0, param0, param2);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "jd.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
    }
}
