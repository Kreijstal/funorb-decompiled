/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd extends ig {
    static String field_F;

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
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
        int[] var25 = null;
        int[] var26 = null;
        RuntimeException decompiledCaughtException = null;
        var24 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              var6_int = param5 * param5;
              if (param4 <= -17) {
                break L1;
              } else {
                field_F = (String) null;
                break L1;
              }
            }
            L2: {
              var7 = -param5 + param1;
              var8 = param5 + param1;
              var9 = -param5 + param3;
              var10 = param5 + param3;
              if (ti.field_e <= var9) {
                break L2;
              } else {
                var9 = ti.field_e;
                break L2;
              }
            }
            L3: {
              if (var8 > ti.field_l) {
                var8 = ti.field_l;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (var7 >= ti.field_f) {
                break L4;
              } else {
                var7 = ti.field_f;
                break L4;
              }
            }
            L5: {
              if (ti.field_c >= var10) {
                break L5;
              } else {
                var10 = ti.field_c;
                break L5;
              }
            }
            var26 = ti.field_a;
            var25 = var26;
            var11 = var25;
            var16 = var7;
            L6: while (true) {
              if (var8 <= var16) {
                break L0;
              } else {
                var17 = var9;
                L7: while (true) {
                  if (var17 >= var10) {
                    var16++;
                    continue L6;
                  } else {
                    var13 = var17 + -param3;
                    var14 = -param1 + var16;
                    var15 = var14 * var14 + var13 * var13;
                    if (var15 < var6_int) {
                      L8: {
                        if (-1 != (var15 ^ -1)) {
                          break L8;
                        } else {
                          var15 = 1;
                          break L8;
                        }
                      }
                      L9: {
                        var12 = ti.field_i * var16 + var17;
                        if (-1 < (param0 ^ -1)) {
                          var18 = -param0 + 256 - (-param0 + 256) * var15 / var6_int;
                          break L9;
                        } else {
                          var18 = 256 + (param0 * var15 / var6_int + -param0);
                          break L9;
                        }
                      }
                      L10: {
                        var19 = var26[var12];
                        var20 = var19 >> 936421040 & 255;
                        var21 = 255 & var19 >> -1408045752;
                        var22 = 255 & var19;
                        if (0 < var18) {
                          if (var18 < 256) {
                            L11: {
                              var23 = var18;
                              if (var23 > (param2 & 16711680) >> -1981368688) {
                                var23 = 255 & param2 >> 983477680;
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                            L12: {
                              if (var20 < var23) {
                                var20 = var20 + (((16711680 & param2) >> 65821168) - var23);
                                break L12;
                              } else {
                                var20 = (16711680 & param2) >> 604543088;
                                break L12;
                              }
                            }
                            L13: {
                              var23 = var18;
                              if (var23 <= (255 & param2 >> 213272872)) {
                                break L13;
                              } else {
                                var23 = 255 & param2 >> -548883000;
                                break L13;
                              }
                            }
                            L14: {
                              if (var21 >= var23) {
                                var21 = (65280 & param2) >> -1043324760;
                                break L14;
                              } else {
                                var21 = var21 + (-var23 + (param2 >> -945904056 & 255));
                                break L14;
                              }
                            }
                            L15: {
                              var23 = var18;
                              if (var23 > (param2 & 255)) {
                                var23 = param2 & 255;
                                break L15;
                              } else {
                                break L15;
                              }
                            }
                            if (var22 < var23) {
                              var22 = var22 + (-var23 + (param2 & 255));
                              break L10;
                            } else {
                              var22 = 255 & param2;
                              break L10;
                            }
                          } else {
                            var11[var12] = vf.b(vf.b(var21 << -223308248, var20 << 1690415472), var22);
                            var17++;
                            continue L7;
                          }
                        } else {
                          var21 = 255 & param2 >> 60185896;
                          var22 = 255 & param2;
                          var20 = (param2 & 16711680) >> 701134032;
                          break L10;
                        }
                      }
                      var11[var12] = vf.b(vf.b(var21 << -223308248, var20 << 1690415472), var22);
                      var17++;
                      continue L7;
                    } else {
                      var17++;
                      continue L7;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var6), "nd.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private nd(String param0, lf param1) {
        this(param0, n.field_i.field_b, param1);
        try {
            this.field_u = n.field_i.field_j;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "nd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void h(int param0) {
        field_F = null;
        int var1 = -67 / ((-44 - param0) / 44);
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              ti.g(param3, param1, 1 + param0, 10000536);
              ti.g(param3, param2 + param1, 1 + param0, 12105912);
              var5_int = 1;
              var6 = param2;
              if (param4 < -76) {
                break L1;
              } else {
                field_F = (String) null;
                break L1;
              }
            }
            L2: {
              if (ti.field_f <= param1 + var5_int) {
                break L2;
              } else {
                var5_int = ti.field_f + -param1;
                break L2;
              }
            }
            L3: {
              if (param1 + var6 > ti.field_l) {
                var6 = -param1 + ti.field_l;
                break L3;
              } else {
                break L3;
              }
            }
            var7 = var5_int;
            L4: while (true) {
              if (var6 <= var7) {
                break L0;
              } else {
                var8 = 48 * var7 / param2 + 152;
                var9 = var8 | (var8 << 830799432 | var8 << -1819394672);
                ti.field_a[ti.field_i * (param1 - -var7) - -param3] = var9;
                ti.field_a[param0 + (var7 + param1) * ti.field_i + param3] = var9;
                var7++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var5), "nd.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, java.awt.Canvas param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
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
              ah.a((java.awt.Component) ((Object) param1), false);
              sl.a((java.awt.Component) ((Object) param1), (byte) 103);
              if (param0 == -26621) {
                break L1;
              } else {
                var3 = (CharSequence) null;
                break L1;
              }
            }
            L2: {
              if (og.field_c != null) {
                og.field_c.a(24186, (java.awt.Component) ((Object) param1));
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var2);
            stackOut_6_1 = new StringBuilder().append("nd.E(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final static void g(int param0) {
        try {
            if (null != e.field_a) {
                try {
                    e.field_a.a(0L, 0);
                    e.field_a.a(24, ae.field_N.field_k, -1, ae.field_N.field_r);
                } catch (Exception exception) {
                }
            }
            if (param0 != -26923) {
                return;
            }
            ae.field_N.field_k = ae.field_N.field_k + 24;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        this.field_z = !this.field_z ? true : false;
        super.a(param0, param1, param2, 107);
        if (param3 < 39) {
            CharSequence var6 = (CharSequence) null;
        }
    }

    final static long a(CharSequence param0, byte param1) {
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        long stackIn_3_0 = 0L;
        long stackIn_23_0 = 0L;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        long stackOut_22_0 = 0L;
        long stackOut_2_0 = 0L;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var7 = stellarshard.field_B;
        try {
          L0: {
            var2_long = 0L;
            var4 = param0.length();
            var5 = 0;
            if (param1 == -35) {
              L1: while (true) {
                L2: {
                  if (var5 >= var4) {
                    break L2;
                  } else {
                    L3: {
                      L4: {
                        var2_long = var2_long * 37L;
                        var6 = param0.charAt(var5);
                        if (var6 < 65) {
                          break L4;
                        } else {
                          if (var6 <= 90) {
                            var2_long = var2_long + (long)(1 + (var6 - 65));
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (var6 < 97) {
                          break L5;
                        } else {
                          if (var6 > 122) {
                            break L5;
                          } else {
                            var2_long = var2_long + (long)(-96 + var6);
                            break L3;
                          }
                        }
                      }
                      if (var6 < 48) {
                        break L3;
                      } else {
                        if (var6 <= 57) {
                          var2_long = var2_long + (long)(27 - (-var6 + 48));
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (var2_long >= 177917621779460413L) {
                      break L2;
                    } else {
                      var5++;
                      continue L1;
                    }
                  }
                }
                L6: while (true) {
                  L7: {
                    if ((var2_long % 37L ^ -1L) != -1L) {
                      break L7;
                    } else {
                      if (var2_long == 0L) {
                        break L7;
                      } else {
                        var2_long = var2_long / 37L;
                        continue L6;
                      }
                    }
                  }
                  stackOut_22_0 = var2_long;
                  stackIn_23_0 = stackOut_22_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              stackOut_2_0 = 24L;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var2);
            stackOut_24_1 = new StringBuilder().append("nd.C(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_23_0;
        }
    }

    private nd(String param0, uk param1, lf param2) {
        super(param0, param1, param2);
        try {
            this.field_u = n.field_i.field_j;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "nd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    nd(String param0, lf param1, boolean param2) {
        this(param0, param1);
        try {
            this.field_z = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "nd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_F = "Anomaly detected";
    }
}
