/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class or {
    private double field_j;
    static int[] field_e;
    private double field_i;
    private double field_d;
    static jj field_f;
    static int field_c;
    static er field_b;
    static String field_h;
    static String field_k;
    static String[] field_n;
    static String field_l;
    static String field_a;
    private double field_m;
    static String field_g;

    final void a(byte param0, double param1, double param2, double param3, double param4) {
        RuntimeException runtimeException = null;
        double var10_double = 0.0;
        double var12 = 0.0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              param1 = param1 * 0.5;
              var10_double = Math.sin(param1);
              var12 = Math.cos(param1);
              ((or) this).field_j = param3 * var10_double;
              ((or) this).field_d = var10_double * param4;
              if (param0 == 40) {
                break L1;
              } else {
                field_l = null;
                break L1;
              }
            }
            ((or) this).field_i = var12;
            ((or) this).field_m = param2 * var10_double;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wn.a((Throwable) (Object) runtimeException, "or.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void b(byte param0) {
        try {
            nj.field_b = new np(hb.field_D, ji.field_s, eh.field_a, ee.field_b, (cr) (Object) fr.field_a, ja.field_e);
            if (param0 <= 76) {
                or.b(-8);
            }
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "or.J(" + param0 + ')');
        }
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              kh.a((byte) -32);
              tk.field_e = true;
              if (param0 == 4) {
                break L1;
              } else {
                field_l = null;
                break L1;
              }
            }
            un.field_Ib = true;
            ch.field_e.i(0);
            fi.a(param0 + 31816, false, wp.field_c);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var1, "or.F(" + param0 + ')');
        }
    }

    final static String a(int param0) {
        RuntimeException var1 = null;
        String var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_10_0 = null;
        String stackIn_24_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_9_0 = null;
        String stackOut_23_0 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 >= 112) {
                break L1;
              } else {
                field_n = null;
                break L1;
              }
            }
            L2: {
              L3: {
                var1_ref = "(" + gf.field_d + " " + jb.field_G + " " + cp.field_c + ") " + lc.field_f;
                if (ca.field_b > 0) {
                  var1_ref = var1_ref + ":";
                  var2 = 0;
                  L4: while (true) {
                    if (ca.field_b <= var2) {
                      break L3;
                    } else {
                      stackOut_9_0 = var1_ref + ' ';
                      stackIn_24_0 = stackOut_9_0;
                      stackIn_10_0 = stackOut_9_0;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        L5: {
                          L6: {
                            var1_ref = stackIn_10_0;
                            var3 = 255 & id.field_f.field_p[var2];
                            var4 = var3 >> 1364165156;
                            if (10 > var4) {
                              break L6;
                            } else {
                              var4 += 55;
                              if (var5 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          var4 += 48;
                          break L5;
                        }
                        L7: {
                          L8: {
                            var3 = var3 & 15;
                            var1_ref = var1_ref + (char)var4;
                            if (var3 < 10) {
                              break L8;
                            } else {
                              var3 += 55;
                              if (var5 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          var3 += 48;
                          break L7;
                        }
                        var1_ref = var1_ref + (char)var3;
                        var2++;
                        if (var5 == 0) {
                          continue L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                } else {
                  break L3;
                }
              }
              stackOut_23_0 = (String) var1_ref;
              stackIn_24_0 = stackOut_23_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var1, "or.I(" + param0 + ')');
        }
        return stackIn_24_0;
    }

    final void a(int[] param0, int param1) {
        double var3_double = 0.0;
        RuntimeException var3 = null;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        double var19 = 0.0;
        int var21 = 0;
        double var22 = 0.0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3_double = ((or) this).field_i * ((or) this).field_i;
            var5 = ((or) this).field_d * ((or) this).field_i;
            var7 = ((or) this).field_i * ((or) this).field_m;
            var9 = ((or) this).field_j * ((or) this).field_i;
            var11 = ((or) this).field_d * ((or) this).field_d;
            var13 = ((or) this).field_m * ((or) this).field_d;
            var15 = ((or) this).field_d * ((or) this).field_j;
            var17 = ((or) this).field_m * ((or) this).field_m;
            var21 = -96 / ((param1 - 58) / 46);
            var19 = ((or) this).field_m * ((or) this).field_j;
            var22 = ((or) this).field_j * ((or) this).field_j;
            param0[6] = (int)(65536.0 * (var13 + (var13 - var9 - var9)));
            param0[7] = (int)((-var11 + (var17 + var3_double) - var22) * 65536.0);
            param0[10] = (int)((var19 + (-var5 + (-var5 + var19))) * 65536.0);
            param0[8] = (int)(65536.0 * (var19 + var5 + var19 + var5));
            param0[5] = (int)((var15 - var7 - var7 + var15) * 65536.0);
            param0[4] = (int)(65536.0 * (var9 + (var13 + (var13 + var9))));
            param0[9] = (int)(65536.0 * (var15 + var7 + var15 + var7));
            param0[3] = (int)(65536.0 * (var3_double + var11 - var22 - var17));
            param0[11] = (int)((var22 + var3_double - var17 - var11) * 65536.0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("or.G(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final static void a(String param0, boolean param1, int param2, boolean param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 65536) {
                break L1;
              } else {
                or.a((String) null, false, -70, false);
                break L1;
              }
            }
            kh.a((byte) -32);
            ch.field_e.i(param2 + -65536);
            eb.field_d = new ob(ff.field_u, (String) null, tk.field_e, param3, param1);
            n.field_b = new ga(ch.field_e, (iq) (Object) eb.field_d);
            ch.field_e.b((iq) (Object) n.field_b, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("or.H(");
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
          throw wn.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void c(byte param0) {
        RuntimeException runtimeException = null;
        double var2_double = 0.0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                var4 = 111 / ((60 - param0) / 51);
                var2_double = ((or) this).field_d * ((or) this).field_d + ((or) this).field_i * ((or) this).field_i + ((or) this).field_m * ((or) this).field_m + ((or) this).field_j * ((or) this).field_j;
                if (0.999999999999 > var2_double) {
                  break L2;
                } else {
                  if (var2_double > 1.000000000001) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              var2_double = 1.0 / Math.sqrt(var2_double);
              ((or) this).field_j = ((or) this).field_j * var2_double;
              ((or) this).field_i = ((or) this).field_i * var2_double;
              ((or) this).field_d = ((or) this).field_d * var2_double;
              ((or) this).field_m = ((or) this).field_m * var2_double;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wn.a((Throwable) (Object) runtimeException, "or.C(" + param0 + ')');
        }
    }

    final void a(or param0, int param1) {
        RuntimeException var3 = null;
        double var3_double = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param1 == 55) {
              var3_double = -(param0.field_j * ((or) this).field_j) + (-(param0.field_d * ((or) this).field_d) + ((or) this).field_i * param0.field_i - param0.field_m * ((or) this).field_m);
              var5 = -(((or) this).field_m * param0.field_j) + (param0.field_i * ((or) this).field_d + param0.field_d * ((or) this).field_i + param0.field_m * ((or) this).field_j);
              var7 = param0.field_j * ((or) this).field_d + (-(param0.field_d * ((or) this).field_j) + param0.field_i * ((or) this).field_m + param0.field_m * ((or) this).field_i);
              ((or) this).field_j = param0.field_d * ((or) this).field_m + ((or) this).field_j * param0.field_i - ((or) this).field_d * param0.field_m + param0.field_j * ((or) this).field_i;
              ((or) this).field_m = var7;
              ((or) this).field_i = var3_double;
              ((or) this).field_d = var5;
              this.c((byte) 119);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("or.D(");
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L1;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_k = null;
              field_h = null;
              if (param0 > 28) {
                break L1;
              } else {
                field_g = null;
                break L1;
              }
            }
            field_n = null;
            field_l = null;
            field_g = null;
            field_a = null;
            field_b = null;
            field_e = null;
            field_f = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var1, "or.E(" + param0 + ')');
        }
    }

    final static tp a(int param0, String param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        tp var3 = null;
        String var4 = null;
        int var5 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        tp stackIn_21_0 = null;
        Object stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        tp stackOut_20_0 = null;
        Object stackOut_23_0 = null;
        Object stackOut_5_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (jn.field_g != null) {
              if (param0 > 54) {
                L1: {
                  var2 = rc.a((CharSequence) (Object) param1, 320);
                  if (var2 == null) {
                    var2 = param1;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var3 = (tp) (Object) jn.field_g.a(3661, (long)var2.hashCode());
                L2: while (true) {
                  L3: {
                    if (var3 == null) {
                      break L3;
                    } else {
                      L4: {
                        var4 = rc.a((CharSequence) (Object) var3.field_Mb, 320);
                        if (var4 == null) {
                          var4 = var3.field_Mb;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      if (var4.equals((Object) (Object) var2)) {
                        stackOut_20_0 = (tp) var3;
                        stackIn_21_0 = stackOut_20_0;
                        return stackIn_21_0;
                      } else {
                        var3 = (tp) (Object) jn.field_g.a(-122);
                        if (var5 == 0) {
                          continue L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_23_0 = null;
                  stackIn_24_0 = stackOut_23_0;
                  break L0;
                }
              } else {
                stackOut_5_0 = null;
                stackIn_6_0 = stackOut_5_0;
                return (tp) (Object) stackIn_6_0;
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (tp) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2_ref = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var2_ref;
            stackOut_25_1 = new StringBuilder().append("or.B(").append(param0).append(',');
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L5;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L5;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ')');
        }
        return (tp) (Object) stackIn_24_0;
    }

    public or() {
        try {
            ((or) this).field_i = 1.0;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "or.<init>()");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = -1;
        field_l = "You won!";
        field_k = "Game";
        field_h = "Playing";
        field_a = "Invalid name";
        field_n = new String[16];
        field_g = "Previous best: <%0>";
    }
}
