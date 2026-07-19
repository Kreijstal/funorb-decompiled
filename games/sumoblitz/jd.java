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
        tk stackIn_34_0 = null;
        tk stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        tk stackIn_35_0 = null;
        tk stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        tk stackIn_36_0 = null;
        tk stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        int stackIn_36_4 = 0;
        int stackIn_39_0 = 0;
        tk stackIn_39_1 = null;
        int stackIn_40_0 = 0;
        tk stackIn_40_1 = null;
        int stackIn_41_0 = 0;
        tk stackIn_41_1 = null;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        tk stackOut_33_0 = null;
        tk stackOut_33_1 = null;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        tk stackOut_35_0 = null;
        tk stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        int stackOut_35_4 = 0;
        tk stackOut_34_0 = null;
        tk stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        int stackOut_34_4 = 0;
        int stackOut_38_0 = 0;
        tk stackOut_38_1 = null;
        int stackOut_40_0 = 0;
        tk stackOut_40_1 = null;
        int stackOut_40_2 = 0;
        int stackOut_39_0 = 0;
        tk stackOut_39_1 = null;
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
                if (param2 != this.field_l) {
                  break L2;
                } else {
                  if (this.field_i) {
                    break L2;
                  } else {
                    if (this.field_e != param1) {
                      break L2;
                    } else {
                      if (this.field_m != param5) {
                        break L2;
                      } else {
                        if (param6 != this.field_j) {
                          break L2;
                        } else {
                          if (param3 != this.field_g) {
                            break L2;
                          } else {
                            if (this.field_k != param7) {
                              break L2;
                            } else {
                              if (this.field_f == null) {
                                break L2;
                              } else {
                                if (!this.field_f.equals(param4)) {
                                  break L2;
                                } else {
                                  decompiledRegionSelector0 = 1;
                                  break L0;
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
                this.field_f = param4;
                this.field_j = param6;
                this.field_i = false;
                this.field_g = param3;
                this.field_e = param1;
                this.field_k = param7;
                this.field_l = param2;
                this.field_m = param5;
                var17 = new String[param2.b(param4, param7) - -1];
                var18 = var17;
                var10 = Math.max(1, param2.a(param4, new int[]{param7}, var18));
                if (-4 != (this.field_m ^ -1)) {
                  break L3;
                } else {
                  if (-2 == (var10 ^ -1)) {
                    this.field_m = 1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                L5: {
                  var12 = -23 / ((13 - param0) / 59);
                  if (this.field_m == 0) {
                    break L5;
                  } else {
                    L6: {
                      if (1 != this.field_m) {
                        break L6;
                      } else {
                        var11 = (this.field_g - var10 * this.field_j >> 1844343137) + param2.field_s;
                        if (var16 == 0) {
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if ((this.field_m ^ -1) != -3) {
                        break L7;
                      } else {
                        var11 = -(var10 * this.field_j) + this.field_g + -param2.field_I;
                        if (var16 == 0) {
                          break L4;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L8: {
                      var13 = (this.field_g + -(var10 * this.field_j)) / (var10 + 1);
                      if (0 <= var13) {
                        break L8;
                      } else {
                        var13 = 0;
                        break L8;
                      }
                    }
                    this.field_j = this.field_j + var13;
                    var11 = param2.field_s + var13;
                    if (var16 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                var11 = param2.field_s;
                break L4;
              }
              this.field_a = new tk[var10];
              var13 = 0;
              L9: while (true) {
                L10: {
                  if (var10 <= var13) {
                    break L10;
                  } else {
                    var14 = var17[var13];
                    if (var16 != 0) {
                      break L10;
                    } else {
                      L11: {
                        stackOut_33_0 = null;
                        stackOut_33_1 = null;
                        stackOut_33_2 = -param2.field_s + var11;
                        stackOut_33_3 = param2.field_I + var11;
                        stackIn_35_0 = stackOut_33_0;
                        stackIn_35_1 = stackOut_33_1;
                        stackIn_35_2 = stackOut_33_2;
                        stackIn_35_3 = stackOut_33_3;
                        stackIn_34_0 = stackOut_33_0;
                        stackIn_34_1 = stackOut_33_1;
                        stackIn_34_2 = stackOut_33_2;
                        stackIn_34_3 = stackOut_33_3;
                        if (var14 != null) {
                          stackOut_35_0 = null;
                          stackOut_35_1 = null;
                          stackOut_35_2 = stackIn_35_2;
                          stackOut_35_3 = stackIn_35_3;
                          stackOut_35_4 = var14.length();
                          stackIn_36_0 = stackOut_35_0;
                          stackIn_36_1 = stackOut_35_1;
                          stackIn_36_2 = stackOut_35_2;
                          stackIn_36_3 = stackOut_35_3;
                          stackIn_36_4 = stackOut_35_4;
                          break L11;
                        } else {
                          stackOut_34_0 = null;
                          stackOut_34_1 = null;
                          stackOut_34_2 = stackIn_34_2;
                          stackOut_34_3 = stackIn_34_3;
                          stackOut_34_4 = 0;
                          stackIn_36_0 = stackOut_34_0;
                          stackIn_36_1 = stackOut_34_1;
                          stackIn_36_2 = stackOut_34_2;
                          stackIn_36_3 = stackOut_34_3;
                          stackIn_36_4 = stackOut_34_4;
                          break L11;
                        }
                      }
                      L12: {
                        var15 = new tk(stackIn_36_2, stackIn_36_3, stackIn_36_4);
                        var15.field_b[0] = 0;
                        if (var14 != null) {
                          L13: {
                            var15.field_b[var14.length()] = param2.a(var14);
                            stackOut_38_0 = 90;
                            stackOut_38_1 = (tk) (var15);
                            stackIn_40_0 = stackOut_38_0;
                            stackIn_40_1 = stackOut_38_1;
                            stackIn_39_0 = stackOut_38_0;
                            stackIn_39_1 = stackOut_38_1;
                            if (3 != param1) {
                              stackOut_40_0 = stackIn_40_0;
                              stackOut_40_1 = (tk) ((Object) stackIn_40_1);
                              stackOut_40_2 = 0;
                              stackIn_41_0 = stackOut_40_0;
                              stackIn_41_1 = stackOut_40_1;
                              stackIn_41_2 = stackOut_40_2;
                              break L13;
                            } else {
                              stackOut_39_0 = stackIn_39_0;
                              stackOut_39_1 = (tk) ((Object) stackIn_39_1);
                              stackOut_39_2 = this.a(-292767736, param7, var14, param2.a(var14));
                              stackIn_41_0 = stackOut_39_0;
                              stackIn_41_1 = stackOut_39_1;
                              stackIn_41_2 = stackOut_39_2;
                              break L13;
                            }
                          }
                          kw.a((byte) stackIn_41_0, stackIn_41_1, stackIn_41_2, param2, var14);
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      var11 = var11 + param6;
                      this.field_a[var13] = var15;
                      var13++;
                      continue L9;
                    }
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              this.field_a = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var9 = decompiledCaughtException;
            stackOut_44_0 = (RuntimeException) (var9);
            stackOut_44_1 = new StringBuilder().append("jd.F(").append(param0).append(',').append(param1).append(',');
            stackIn_46_0 = stackOut_44_0;
            stackIn_46_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param2 == null) {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L14;
            } else {
              stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackOut_45_2 = "{...}";
              stackIn_47_0 = stackOut_45_0;
              stackIn_47_1 = stackOut_45_1;
              stackIn_47_2 = stackOut_45_2;
              break L14;
            }
          }
          L15: {
            stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
            stackOut_47_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_47_2).append(',').append(param3).append(',');
            stackIn_49_0 = stackOut_47_0;
            stackIn_49_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param4 == null) {
              stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L15;
            } else {
              stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackOut_48_2 = "{...}";
              stackIn_50_0 = stackOut_48_0;
              stackIn_50_1 = stackOut_48_1;
              stackIn_50_2 = stackOut_48_2;
              break L15;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_50_0), stackIn_50_2 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final void a(int param0, vn param1, int param2, String param3, int param4) {
        tk var8 = null;
        int var7 = 0;
        if (!(param3 != null)) {
            this.field_a = null;
            return;
        }
        if (this.field_l == param1) {
            if (this.field_i) {
                if ((this.field_e ^ -1) == -2) {
                    if (null != this.field_f) {
                        if (!(!this.field_f.equals(param3))) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            if (param2 < 73) {
                this.field_k = -104;
            }
            this.field_i = true;
            this.field_l = param1;
            this.field_e = 1;
            var8 = this.a(param0, -106, param1, param3);
            var7 = param1.a(param3);
            var8.field_b[0] = -(var7 >> 44097889) + param4;
            var8.field_b[param3.length()] = param4 - -(var7 >> 14111425);
            kw.a((byte) 90, var8, 0, param1, param3);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "jd.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static boolean a(String param0, byte param1, String param2) {
        String discarded$2 = null;
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
                discarded$2 = jd.e(58);
                break L1;
              }
            }
            L2: {
              L3: {
                if ((param2.indexOf(param0) ^ -1) != 0) {
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
            stackOut_8_0 = (RuntimeException) (var3_ref);
            stackOut_8_1 = new StringBuilder().append("jd.D(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          L5: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    public static void d(int param0) {
        int discarded$0 = 0;
        if (param0 != 0) {
            String var2 = (String) null;
            discarded$0 = jd.a((lj) null, -59, (lj) null, 54, false, 96, (String) null);
        }
        field_h = null;
    }

    final static String e(int param0) {
        int discarded$0 = 0;
        if (param0 <= 71) {
            String var2 = (String) null;
            discarded$0 = jd.a((lj) null, 38, (lj) null, -17, false, -119, (String) null);
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
                field_h = (ri[]) null;
            }
            uj.a((byte) -124, 256, param2, param0);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "jd.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
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
              this.field_a = new tk[]{var6};
              if (param1 == -106) {
                break L1;
              } else {
                this.field_l = (vn) null;
                break L1;
              }
            }
            stackOut_2_0 = (tk) (var5);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var5_ref);
            stackOut_4_1 = new StringBuilder().append("jd.E(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
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
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final static int a(lj param0, int param1, lj param2, int param3, boolean param4, int param5, String param6) {
        boolean discarded$1 = false;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        tv var14 = null;
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
        int stackIn_39_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_74_0 = 0;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_84_2 = null;
        int decompiledRegionSelector0 = 0;
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
        int stackOut_38_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_73_0 = 0;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        String stackOut_82_2 = null;
        var16 = null;
        var13 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param5 > 20) {
                break L1;
              } else {
                var14 = (tv) null;
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
                  decompiledRegionSelector0 = 0;
                  break L0;
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
                  L5: {
                    aw.field_j = null;
                    as.field_v.field_p = 0;
                    if (param6 != null) {
                      break L5;
                    } else {
                      L6: {
                        sd.field_e.field_p = 0;
                        sd.field_e.e(48, fd.field_d.nextInt());
                        sd.field_e.e(48, fd.field_d.nextInt());
                        stackOut_11_0 = sd.field_e;
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_12_0 = stackOut_11_0;
                        if (!param0.a(110)) {
                          stackOut_13_0 = (fs) ((Object) stackIn_13_0);
                          stackOut_13_1 = "";
                          stackIn_14_0 = stackOut_13_0;
                          stackIn_14_1 = stackOut_13_1;
                          break L6;
                        } else {
                          stackOut_12_0 = (fs) ((Object) stackIn_12_0);
                          stackOut_12_1 = (String) (var15);
                          stackIn_14_0 = stackOut_12_0;
                          stackIn_14_1 = stackOut_12_1;
                          break L6;
                        }
                      }
                      L7: {
                        ((fs) (Object) stackIn_14_0).b(stackIn_14_1, (byte) 120);
                        stackOut_14_0 = sd.field_e;
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_15_0 = stackOut_14_0;
                        if (!param2.a(91)) {
                          stackOut_16_0 = (fs) ((Object) stackIn_16_0);
                          stackOut_16_1 = "";
                          stackIn_17_0 = stackOut_16_0;
                          stackIn_17_1 = stackOut_16_1;
                          break L7;
                        } else {
                          stackOut_15_0 = (fs) ((Object) stackIn_15_0);
                          stackOut_15_1 = (String) (var8);
                          stackIn_17_0 = stackOut_15_0;
                          stackIn_17_1 = stackOut_15_1;
                          break L7;
                        }
                      }
                      ((fs) (Object) stackIn_17_0).b(stackIn_17_1, (byte) 101);
                      as.field_v.b((byte) 108, 16);
                      as.field_v.field_p = as.field_v.field_p + 1;
                      var9 = as.field_v.field_p;
                      ks.a(gh.field_a, oh.field_c, false, as.field_v, sd.field_e);
                      as.field_v.c(as.field_v.field_p + -var9, -13745);
                      if (var13 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L8: {
                    var9 = 0;
                    if (!param4) {
                      break L8;
                    } else {
                      var9 = var9 | 1;
                      break L8;
                    }
                  }
                  L9: {
                    sd.field_e.field_p = 0;
                    sd.field_e.e(48, fd.field_d.nextInt());
                    sd.field_e.e(48, fd.field_d.nextInt());
                    sd.field_e.b(var15, (byte) -108);
                    sd.field_e.b(var8, (byte) -121);
                    var17 = (CharSequence) ((Object) param6);
                    sd.field_e.b(kh.a(var17, 1457), (byte) -107);
                    sd.field_e.b(-69, param3);
                    sd.field_e.b((byte) 50, param1);
                    sd.field_e.b((byte) 50, var9);
                    as.field_v.b((byte) 114, 18);
                    as.field_v.field_p = as.field_v.field_p + 2;
                    var10 = as.field_v.field_p;
                    var11_ref_String = dv.a(-94, ra.c(2));
                    if (var11_ref_String == null) {
                      var11_ref_String = "";
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  as.field_v.a(var11_ref_String, (byte) -115);
                  ks.a(gh.field_a, oh.field_c, false, as.field_v, sd.field_e);
                  as.field_v.a(0, as.field_v.field_p - var10);
                  break L4;
                }
                gt.a(0, -1);
                kw.field_c = vf.field_c;
                break L3;
              }
            }
            L10: {
              if (kw.field_c == vf.field_c) {
                if (ju.b(-1, 1)) {
                  L11: {
                    var9 = ig.field_a.e(-31302);
                    ig.field_a.field_p = 0;
                    if (-101 < (var9 ^ -1)) {
                      break L11;
                    } else {
                      if ((var9 ^ -1) >= -106) {
                        kw.field_c = oi.field_a;
                        mn.field_g = new String[-100 + var9];
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                  L12: {
                    if (-249 == (var9 ^ -1)) {
                      break L12;
                    } else {
                      L13: {
                        if ((var9 ^ -1) != -100) {
                          break L13;
                        } else {
                          discarded$1 = ju.b(-1, br.b(-105));
                          aw.field_j = new Boolean(of.a(ig.field_a, 115));
                          ig.field_a.field_p = 0;
                          if (var13 == 0) {
                            break L10;
                          } else {
                            break L13;
                          }
                        }
                      }
                      gu.field_d = -1;
                      iw.field_a = var9;
                      kw.field_c = fm.field_b;
                      if (var13 == 0) {
                        break L10;
                      } else {
                        break L12;
                      }
                    }
                  }
                  bw.a(false, ra.c(2));
                  ns.field_c = qk.field_R;
                  kk.a((byte) -116);
                  sr.field_g = false;
                  stackOut_38_0 = var9;
                  stackIn_39_0 = stackOut_38_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L10;
                }
              } else {
                break L10;
              }
            }
            L14: {
              if (oi.field_a == kw.field_c) {
                var9 = 2;
                if (ju.b(-1, var9)) {
                  var10 = ig.field_a.a(255);
                  ig.field_a.field_p = 0;
                  if (!ju.b(-1, var10)) {
                    break L14;
                  } else {
                    var11 = mn.field_g.length;
                    var12 = 0;
                    L15: while (true) {
                      L16: {
                        if (var11 <= var12) {
                          kk.a((byte) -110);
                          sr.field_g = false;
                          break L16;
                        } else {
                          mn.field_g[var12] = ig.field_a.g(-105);
                          var12++;
                          if (var13 != 0) {
                            break L16;
                          } else {
                            continue L15;
                          }
                        }
                      }
                      stackOut_52_0 = var11 + 100;
                      stackIn_53_0 = stackOut_52_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                } else {
                  break L14;
                }
              } else {
                break L14;
              }
            }
            L17: {
              if (fm.field_b != kw.field_c) {
                break L17;
              } else {
                if (!lt.a((byte) 119)) {
                  break L17;
                } else {
                  L18: {
                    L19: {
                      if (iw.field_a != 255) {
                        break L19;
                      } else {
                        L20: {
                          var9_ref_String = ig.field_a.g((byte) 80);
                          if (var9_ref_String != null) {
                            jb.a((byte) 97, var9_ref_String, ra.c(2));
                            break L20;
                          } else {
                            break L20;
                          }
                        }
                        if (var13 == 0) {
                          break L18;
                        } else {
                          break L19;
                        }
                      }
                    }
                    ns.field_c = ig.field_a.d(-1);
                    break L18;
                  }
                  kk.a((byte) -127);
                  sr.field_g = false;
                  stackOut_62_0 = iw.field_a;
                  stackIn_63_0 = stackOut_62_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            }
            L21: {
              if (qk.field_O != null) {
                break L21;
              } else {
                L22: {
                  if (sr.field_g) {
                    break L22;
                  } else {
                    var9 = vp.field_a;
                    vp.field_a = nb.field_b;
                    sr.field_g = true;
                    nb.field_b = var9;
                    if (var13 == 0) {
                      break L21;
                    } else {
                      break L22;
                    }
                  }
                }
                L23: {
                  L24: {
                    if (30000L < uc.b(26560)) {
                      break L24;
                    } else {
                      ns.field_c = nd.field_G;
                      if (var13 == 0) {
                        break L23;
                      } else {
                        break L24;
                      }
                    }
                  }
                  ns.field_c = ar.field_F;
                  break L23;
                }
                sr.field_g = false;
                stackOut_71_0 = 249;
                stackIn_72_0 = stackOut_71_0;
                decompiledRegionSelector0 = 4;
                break L0;
              }
            }
            stackOut_73_0 = -1;
            stackIn_74_0 = stackOut_73_0;
            decompiledRegionSelector0 = 5;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L25: {
            var7 = decompiledCaughtException;
            stackOut_75_0 = (RuntimeException) (var7);
            stackOut_75_1 = new StringBuilder().append("jd.A(");
            stackIn_77_0 = stackOut_75_0;
            stackIn_77_1 = stackOut_75_1;
            stackIn_76_0 = stackOut_75_0;
            stackIn_76_1 = stackOut_75_1;
            if (param0 == null) {
              stackOut_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackOut_77_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackOut_77_2 = "null";
              stackIn_78_0 = stackOut_77_0;
              stackIn_78_1 = stackOut_77_1;
              stackIn_78_2 = stackOut_77_2;
              break L25;
            } else {
              stackOut_76_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackOut_76_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackOut_76_2 = "{...}";
              stackIn_78_0 = stackOut_76_0;
              stackIn_78_1 = stackOut_76_1;
              stackIn_78_2 = stackOut_76_2;
              break L25;
            }
          }
          L26: {
            stackOut_78_0 = (RuntimeException) ((Object) stackIn_78_0);
            stackOut_78_1 = ((StringBuilder) (Object) stackIn_78_1).append(stackIn_78_2).append(',').append(param1).append(',');
            stackIn_80_0 = stackOut_78_0;
            stackIn_80_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param2 == null) {
              stackOut_80_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackOut_80_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L26;
            } else {
              stackOut_79_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackOut_79_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackOut_79_2 = "{...}";
              stackIn_81_0 = stackOut_79_0;
              stackIn_81_1 = stackOut_79_1;
              stackIn_81_2 = stackOut_79_2;
              break L26;
            }
          }
          L27: {
            stackOut_81_0 = (RuntimeException) ((Object) stackIn_81_0);
            stackOut_81_1 = ((StringBuilder) (Object) stackIn_81_1).append(stackIn_81_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_83_0 = stackOut_81_0;
            stackIn_83_1 = stackOut_81_1;
            stackIn_82_0 = stackOut_81_0;
            stackIn_82_1 = stackOut_81_1;
            if (param6 == null) {
              stackOut_83_0 = (RuntimeException) ((Object) stackIn_83_0);
              stackOut_83_1 = (StringBuilder) ((Object) stackIn_83_1);
              stackOut_83_2 = "null";
              stackIn_84_0 = stackOut_83_0;
              stackIn_84_1 = stackOut_83_1;
              stackIn_84_2 = stackOut_83_2;
              break L27;
            } else {
              stackOut_82_0 = (RuntimeException) ((Object) stackIn_82_0);
              stackOut_82_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackOut_82_2 = "{...}";
              stackIn_84_0 = stackOut_82_0;
              stackIn_84_1 = stackOut_82_1;
              stackIn_84_2 = stackOut_82_2;
              break L27;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_84_0), stackIn_84_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_39_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_53_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_63_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_72_0;
                } else {
                  return stackIn_74_0;
                }
              }
            }
          }
        }
    }

    public jd() {
    }

    final void a(vn param0, int param1, int param2, String param3, byte param4) {
        if (param3 == null) {
            this.field_a = null;
            return;
        }
        if (this.field_l == param0) {
            if (this.field_i) {
                if (-3 == (this.field_e ^ -1)) {
                    if (this.field_f != null) {
                        if (this.field_f.equals(param3)) {
                            return;
                        }
                    }
                }
            }
        }
        this.field_e = 2;
        this.field_l = param0;
        this.field_i = true;
        this.field_f = param3;
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
            throw qo.a((Throwable) ((Object) runtimeException), "jd.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final void a(vn param0, int param1, String param2, int param3, byte param4) {
        tk var7 = null;
        tk var8 = null;
        if (param2 == null) {
            this.field_a = null;
            return;
        }
        if (param4 != -36) {
            this.field_f = (String) null;
        }
        if (param0 == this.field_l) {
            if (this.field_i) {
                if (-1 == (this.field_e ^ -1)) {
                    if (this.field_f != null) {
                        if (!(!this.field_f.equals(param2))) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            this.field_e = 0;
            this.field_l = param0;
            this.field_i = true;
            this.field_f = param2;
            var7 = this.a(param1, -106, param0, param2);
            var8 = var7;
            var7.field_b[0] = param3;
            var8.field_b[param2.length()] = param3 - -param0.a(param2);
            kw.a((byte) 90, var8, 0, param0, param2);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "jd.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
    }
}
