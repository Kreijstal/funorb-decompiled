/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tn {
    String field_k;
    int field_h;
    boolean field_n;
    static fe field_i;
    String field_d;
    static String field_r;
    static int field_c;
    int field_s;
    int field_q;
    static int field_j;
    long field_b;
    static long field_p;
    int field_m;
    String field_l;
    int[] field_f;
    String field_a;
    static String field_g;
    cr field_e;
    int field_o;

    final static er a(String param0, r param1, int param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        er stackIn_2_0 = null;
        er stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = param1.a((byte) 118, param3);
            var5 = param1.a(var4_int, param0, 98);
            if (param2 <= -70) {
              stackIn_4_0 = cr.a(var5, param1, (byte) -117, var4_int);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (er) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("tn.F(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (param2 != 55) {
            field_p = -63L;
        }
        vm.field_c = param1;
        s.field_u = param0;
    }

    final int a(byte param0) {
        int var2;
        L0: {
          var2 = 31 / ((-37 - param0) / 43);
          if (this.field_n) {
            break L0;
          } else {
            L1: {
              if (this.field_s != 2) {
                break L1;
              } else {
                if (-1 <= (this.field_h ^ -1)) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            if (this.field_b == ao.field_N) {
              return 1;
            } else {
              L2: {
                if (ba.field_d != 2) {
                  break L2;
                } else {
                  if (!c.a(this.field_a, (byte) -49)) {
                    break L2;
                  } else {
                    return 1;
                  }
                }
              }
              return 0;
            }
          }
        }
        return 2;
    }

    final static boolean a(int param0, boolean param1, CharSequence param2, int param3) {
        int stackIn_7_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_41_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 < 2) {
                break L1;
              } else {
                if (36 < param0) {
                  break L1;
                } else {
                  var4_int = 0;
                  var5 = 0;
                  var6 = 0;
                  var7 = param2.length();
                  var8 = 0;
                  if (param3 <= -126) {
                    L2: while (true) {
                      if (var8 >= var7) {
                        stackIn_41_0 = var5;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        L3: {
                          L4: {
                            var9 = param2.charAt(var8);
                            if (0 == var8) {
                              if (45 != var9) {
                                if (var9 != 43) {
                                  break L4;
                                } else {
                                  if (!param1) {
                                    break L4;
                                  } else {
                                    var8++;
                                    continue L2;
                                  }
                                }
                              } else {
                                var4_int = 1;
                                break L3;
                              }
                            } else {
                              break L4;
                            }
                          }
                          L5: {
                            L6: {
                              if (var9 < 48) {
                                break L6;
                              } else {
                                if (var9 > 57) {
                                  break L6;
                                } else {
                                  var9 -= 48;
                                  break L5;
                                }
                              }
                            }
                            L7: {
                              if (65 > var9) {
                                break L7;
                              } else {
                                if (90 >= var9) {
                                  var9 -= 55;
                                  break L5;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            if (var9 < 97) {
                              stackIn_27_0 = 0;
                              decompiledRegionSelector0 = 1;
                              break L0;
                            } else {
                              if (122 >= var9) {
                                var9 -= 87;
                                break L5;
                              } else {
                                return false;
                              }
                            }
                          }
                          if (param0 > var9) {
                            L8: {
                              if (var4_int == 0) {
                                break L8;
                              } else {
                                var9 = -var9;
                                break L8;
                              }
                            }
                            var10 = var9 + var6 * param0;
                            if (var10 / param0 == var6) {
                              var6 = var10;
                              var5 = 1;
                              break L3;
                            } else {
                              stackIn_37_0 = 0;
                              decompiledRegionSelector0 = 3;
                              break L0;
                            }
                          } else {
                            stackIn_32_0 = 0;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          }
                        }
                        var8++;
                        continue L2;
                      }
                    }
                  } else {
                    stackIn_7_0 = 0;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
            }
            throw new IllegalArgumentException("" + param0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackIn_44_0 = (RuntimeException) (var4);

            stackIn_44_1 = new StringBuilder().append("tn.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "null";
              break L9;
            } else {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "{...}";
              break L9;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_45_0), stackIn_45_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_27_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_32_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_37_0 != 0;
              } else {
                return stackIn_41_0 != 0;
              }
            }
          }
        }
    }

    final static void a(lq param0, String param1, cc param2, byte param3, int param4) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 >= 16) {
                break L1;
              } else {
                field_c = 15;
                break L1;
              }
            }
            var5_int = 0;
            var6 = -1;
            var7 = 1;
            L2: while (true) {
              if (var7 >= param1.length()) {
                break L0;
              } else {
                L3: {
                  var8 = param1.charAt(var7);
                  if (var8 == 60) {
                    var6 = (var5_int >> -398778200) + (param0.field_c[0] + param2.c(param1.substring(0, var7)));
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (-1 != var6) {
                    param0.field_c[var7] = var6;
                    break L4;
                  } else {
                    L5: {
                      if (32 == var8) {
                        var5_int = var5_int + param4;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    param0.field_c[var7] = (var5_int >> -1487091512) + (param0.field_c[0] - -param2.c(param1.substring(0, 1 + var7)) - param2.a((char) var8));
                    break L4;
                  }
                }
                if (var8 == 62) {
                  var6 = -1;
                  var7++;
                  continue L2;
                } else {
                  var7++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var5);

            stackIn_20_1 = new StringBuilder().append("tn.E(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');

            if (param2 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L8;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L8;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_21_0), stackIn_27_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(int param0) {
        field_i = null;
        if (param0 >= -76) {
            return;
        }
        field_r = null;
        field_g = null;
    }

    tn(boolean param0) {
        this.field_k = ad.field_a;
        this.field_l = sp.field_U;
        this.field_q = tj.field_b;
        if (param0) {
            this.field_f = sd.field_P;
        } else {
            this.field_f = null;
        }
        this.field_s = ln.field_c;
        this.field_h = rq.field_u;
        this.field_m = qf.field_a;
        this.field_b = ug.field_a;
        this.field_n = cb.field_Ib;
        this.field_a = fd.field_p;
        this.field_d = tj.field_a;
        this.field_o = ck.field_J;
    }

    tn(int param0, String param1, int param2, String param3, String param4) {
        try {
            this.field_a = param1;
            this.field_f = null;
            this.field_h = 0;
            this.field_s = param0;
            this.field_d = param4;
            this.field_m = 0;
            this.field_n = true;
            this.field_l = param1;
            this.field_b = 0L;
            this.field_o = 0;
            this.field_q = param2;
            this.field_k = param3;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "tn.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = 32;
        field_j = 0;
        field_r = "Connecting to<br>friend server...";
        field_g = "<%0>";
    }
}
