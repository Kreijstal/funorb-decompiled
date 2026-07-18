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

    final static void b() {
        nj.field_b = new np(hb.field_D, ji.field_s, eh.field_a, ee.field_b, (cr) (Object) fr.field_a, ja.field_e);
    }

    final static void b(int param0) {
        int discarded$0 = -32;
        kh.a();
        tk.field_e = true;
        un.field_Ib = true;
        ch.field_e.i(0);
        fi.a(31820, false, wp.field_c);
    }

    final static String a(int param0) {
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Vertigo2.field_L ? 1 : 0;
        if (param0 >= 112) {
          var1 = "(" + gf.field_d + " " + jb.field_G + " " + cp.field_c + ") " + lc.field_f;
          if (ca.field_b <= 0) {
            return var1;
          } else {
            var1 = var1 + ":";
            var2 = 0;
            L0: while (true) {
              if (ca.field_b <= var2) {
                return var1;
              } else {
                L1: {
                  var1 = var1 + ' ';
                  var3 = 255 & id.field_f.field_p[var2];
                  var4 = var3 >> 4;
                  if (10 > var4) {
                    var4 += 48;
                    break L1;
                  } else {
                    var4 += 55;
                    break L1;
                  }
                }
                L2: {
                  var3 = var3 & 15;
                  var1 = var1 + (char)var4;
                  if (var3 < 10) {
                    var3 += 48;
                    break L2;
                  } else {
                    var3 += 55;
                    break L2;
                  }
                }
                var1 = var1 + (char)var3;
                var2++;
                continue L0;
              }
            }
          }
        } else {
          field_n = null;
          var1 = "(" + gf.field_d + " " + jb.field_G + " " + cp.field_c + ") " + lc.field_f;
          if (ca.field_b > 0) {
            var1 = var1 + ":";
            var2 = 0;
            L3: while (true) {
              if (ca.field_b > var2) {
                L4: {
                  var1 = var1 + ' ';
                  var3 = 255 & id.field_f.field_p[var2];
                  var4 = var3 >> 4;
                  if (10 > var4) {
                    var4 += 48;
                    break L4;
                  } else {
                    var4 += 55;
                    break L4;
                  }
                }
                L5: {
                  var3 = var3 & 15;
                  var1 = var1 + (char)var4;
                  if (var3 < 10) {
                    var3 += 48;
                    break L5;
                  } else {
                    var3 += 55;
                    break L5;
                  }
                }
                var1 = var1 + (char)var3;
                var2++;
                continue L3;
              } else {
                return var1;
              }
            }
          } else {
            return var1;
          }
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
          throw wn.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param1 + ')');
        }
    }

    final static void a(String param0, boolean param1, int param2, boolean param3) {
        try {
            if (param2 != 65536) {
                Object var5 = null;
                or.a((String) null, false, -70, false);
            }
            int discarded$0 = -32;
            kh.a();
            ch.field_e.i(param2 + -65536);
            eb.field_d = new ob(ff.field_u, (String) null, tk.field_e, param3, param1);
            n.field_b = new ga(ch.field_e, (iq) (Object) eb.field_d);
            ch.field_e.b((iq) (Object) n.field_b, 0);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "or.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void c() {
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
              int discarded$1 = 119;
              this.c();
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
          throw wn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
    }

    public static void a() {
        field_k = null;
        field_h = null;
        field_n = null;
        field_l = null;
        field_g = null;
        field_a = null;
        field_b = null;
        field_e = null;
        field_f = null;
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
        Object stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        Object stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        Object stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        tp stackOut_18_0 = null;
        Object stackOut_5_0 = null;
        Object stackOut_2_0 = null;
        Object stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        Object stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        Object stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          if (jn.field_g != null) {
            if (param0 > 54) {
              L0: {
                var6 = (CharSequence) (Object) param1;
                var2 = (Object) (Object) rc.a(var6, 320);
                if (var2 == null) {
                  var2 = (Object) (Object) var6;
                  break L0;
                } else {
                  break L0;
                }
              }
              var3 = (tp) (Object) jn.field_g.a(3661, (long)((String) var2).hashCode());
              L1: while (true) {
                if (var3 != null) {
                  L2: {
                    var7 = (CharSequence) (Object) var3.field_Mb;
                    var4 = rc.a(var7, 320);
                    if (var4 == null) {
                      var4 = var3.field_Mb;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  if (var4.equals(var2)) {
                    stackOut_18_0 = (tp) var3;
                    stackIn_19_0 = stackOut_18_0;
                    return stackIn_19_0;
                  } else {
                    var3 = (tp) (Object) jn.field_g.a(-122);
                    continue L1;
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
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = (Object) (Object) decompiledCaughtException;
            stackOut_22_0 = var2;
            stackOut_22_1 = new StringBuilder().append("or.B(").append(param0).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L3;
            } else {
              stackOut_23_0 = stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L3;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ')');
        }
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
