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
        double var10 = 0.0;
        double var12 = 0.0;
        param1 = param1 * 0.5;
        var10 = Math.sin(param1);
        var12 = Math.cos(param1);
        ((or) this).field_j = param3 * var10;
        ((or) this).field_d = var10 * param4;
        if (param0 != 40) {
          field_l = null;
          ((or) this).field_i = var12;
          ((or) this).field_m = param2 * var10;
          return;
        } else {
          ((or) this).field_i = var12;
          ((or) this).field_m = param2 * var10;
          return;
        }
    }

    final static void b(byte param0) {
        nj.field_b = new np(hb.field_D, ji.field_s, eh.field_a, ee.field_b, (cr) (Object) fr.field_a, ja.field_e);
        if (param0 <= 76) {
            or.b(-8);
        }
    }

    final static void b(int param0) {
        kh.a((byte) -32);
        tk.field_e = true;
        field_l = null;
        un.field_Ib = true;
        ch.field_e.i(0);
        fi.a(31808, false, wp.field_c);
    }

    final static String a(int param0) {
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_8_0 = null;
        String stackIn_18_0 = null;
        String stackIn_23_0 = null;
        String stackIn_33_0 = null;
        String stackOut_22_0 = null;
        String stackOut_32_0 = null;
        String stackOut_7_0 = null;
        String stackOut_17_0 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        if (param0 >= 112) {
          var1 = "(" + gf.field_d + " " + jb.field_G + " " + cp.field_c + ") " + lc.field_f;
          if (ca.field_b <= 0) {
            return var1;
          } else {
            var1 = var1 + ":";
            var2 = 0;
            L0: while (true) {
              L1: {
                L2: {
                  if (ca.field_b <= var2) {
                    break L2;
                  } else {
                    stackOut_22_0 = var1 + 32;
                    stackIn_33_0 = stackOut_22_0;
                    stackIn_23_0 = stackOut_22_0;
                    if (var5 != 0) {
                      break L1;
                    } else {
                      L3: {
                        L4: {
                          var1 = stackIn_23_0;
                          var3 = 255 & id.field_f.field_p[var2];
                          var4 = var3 >> 4;
                          if (10 > var4) {
                            break L4;
                          } else {
                            var4 += 55;
                            if (var5 == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var4 += 48;
                        break L3;
                      }
                      L5: {
                        L6: {
                          var3 = var3 & 15;
                          var1 = var1 + (char)var4;
                          if (var3 < 10) {
                            break L6;
                          } else {
                            var3 += 55;
                            if (var5 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var3 += 48;
                        break L5;
                      }
                      var1 = var1 + (char)var3;
                      var2++;
                      if (var5 == 0) {
                        continue L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                stackOut_32_0 = (String) var1;
                stackIn_33_0 = stackOut_32_0;
                break L1;
              }
              return stackIn_33_0;
            }
          }
        } else {
          L7: {
            L8: {
              field_n = null;
              var1 = "(" + gf.field_d + " " + jb.field_G + " " + cp.field_c + ") " + lc.field_f;
              if (ca.field_b > 0) {
                var1 = var1 + ":";
                var2 = 0;
                L9: while (true) {
                  if (ca.field_b > var2) {
                    stackOut_7_0 = var1 + 32;
                    stackIn_18_0 = stackOut_7_0;
                    stackIn_8_0 = stackOut_7_0;
                    if (var5 != 0) {
                      break L7;
                    } else {
                      L10: {
                        L11: {
                          var1 = stackIn_8_0;
                          var3 = 255 & id.field_f.field_p[var2];
                          var4 = var3 >> 4;
                          if (10 > var4) {
                            break L11;
                          } else {
                            var4 += 55;
                            if (var5 == 0) {
                              break L10;
                            } else {
                              break L11;
                            }
                          }
                        }
                        var4 += 48;
                        break L10;
                      }
                      L12: {
                        L13: {
                          var3 = var3 & 15;
                          var1 = var1 + (char)var4;
                          if (var3 < 10) {
                            break L13;
                          } else {
                            var3 += 55;
                            if (var5 == 0) {
                              break L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        var3 += 48;
                        break L12;
                      }
                      var1 = var1 + (char)var3;
                      var2++;
                      if (var5 == 0) {
                        continue L9;
                      } else {
                        break L8;
                      }
                    }
                  } else {
                    return var1;
                  }
                }
              } else {
                break L8;
              }
            }
            stackOut_17_0 = (String) var1;
            stackIn_18_0 = stackOut_17_0;
            break L7;
          }
          return stackIn_18_0;
        }
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
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
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
          throw wn.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 41);
        }
    }

    final static void a(String param0, boolean param1, int param2, boolean param3) {
        try {
            if (param2 != 65536) {
                Object var5 = null;
                or.a((String) null, false, -70, false);
            }
            kh.a((byte) -32);
            ch.field_e.i(param2 + -65536);
            eb.field_d = new ob(ff.field_u, (String) null, tk.field_e, false, param1);
            n.field_b = new ga(ch.field_e, (iq) (Object) eb.field_d);
            ch.field_e.b((iq) (Object) n.field_b, 0);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "or.H(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + 0 + 41);
        }
    }

    private final void c(byte param0) {
        double var2 = 0.0;
        int var4 = 0;
        var4 = -111;
        var2 = ((or) this).field_d * ((or) this).field_d + ((or) this).field_i * ((or) this).field_i + ((or) this).field_m * ((or) this).field_m + ((or) this).field_j * ((or) this).field_j;
        if (0.999999999999 <= var2) {
          if (var2 <= 1.000000000001) {
            return;
          } else {
            var2 = 1.0 / Math.sqrt(var2);
            ((or) this).field_j = ((or) this).field_j * var2;
            ((or) this).field_i = ((or) this).field_i * var2;
            ((or) this).field_d = ((or) this).field_d * var2;
            ((or) this).field_m = ((or) this).field_m * var2;
            return;
          }
        } else {
          var2 = 1.0 / Math.sqrt(var2);
          ((or) this).field_j = ((or) this).field_j * var2;
          ((or) this).field_i = ((or) this).field_i * var2;
          ((or) this).field_d = ((or) this).field_d * var2;
          ((or) this).field_m = ((or) this).field_m * var2;
          return;
        }
    }

    final void a(or param0, int param1) {
        RuntimeException var3 = null;
        double var3_double = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
    }

    public static void a(byte param0) {
        field_k = null;
        field_h = null;
        if (param0 <= 28) {
          field_g = null;
          field_n = null;
          field_l = null;
          field_g = null;
          field_a = null;
          field_b = null;
          field_e = null;
          field_f = null;
          return;
        } else {
          field_n = null;
          field_l = null;
          field_g = null;
          field_a = null;
          field_b = null;
          field_e = null;
          field_f = null;
          return;
        }
    }

    final static tp a(int param0, String param1) {
        Object var2 = null;
        tp var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        tp stackIn_19_0 = null;
        Object stackIn_22_0 = null;
        Object stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        Object stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        Object stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        tp stackOut_18_0 = null;
        Object stackOut_21_0 = null;
        Object stackOut_5_0 = null;
        Object stackOut_2_0 = null;
        Object stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        Object stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        Object stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (jn.field_g != null) {
              if (param0 > 54) {
                L1: {
                  var6 = (CharSequence) (Object) param1;
                  var2 = (Object) (Object) rc.a(var6, 320);
                  if (var2 == null) {
                    var2 = (Object) (Object) var6;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var3 = (tp) (Object) jn.field_g.a(3661, (long)((String) var2).hashCode());
                L2: while (true) {
                  if (var3 != null) {
                    L3: {
                      var7 = (CharSequence) (Object) var3.field_Mb;
                      var4 = rc.a(var7, 320);
                      if (var4 == null) {
                        var4 = var3.field_Mb;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    if (var4.equals(var2)) {
                      stackOut_18_0 = (tp) var3;
                      stackIn_19_0 = stackOut_18_0;
                      return stackIn_19_0;
                    } else {
                      var3 = (tp) (Object) jn.field_g.a(-122);
                      if (var5 == 0) {
                        continue L2;
                      } else {
                        stackOut_21_0 = null;
                        stackIn_22_0 = stackOut_21_0;
                        break L0;
                      }
                    }
                  } else {
                    return null;
                  }
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
          L4: {
            var2 = (Object) (Object) decompiledCaughtException;
            stackOut_23_0 = var2;
            stackOut_23_1 = new StringBuilder().append("or.B(").append(param0).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L4;
            } else {
              stackOut_24_0 = stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L4;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
        }
        return (tp) (Object) stackIn_22_0;
    }

    public or() {
        ((or) this).field_i = 1.0;
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
