/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mi extends vg {
    vna field_i;
    static String field_n;
    static int[] field_l;
    static int field_k;
    String field_m;
    static int field_g;
    int field_h;
    static boolean field_o;
    int field_p;
    static String field_j;
    static int field_f;

    final static void a() {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        apa var9 = null;
        int var10 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        apa stackIn_17_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        apa stackOut_16_0 = null;
        apa stackOut_15_0 = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var1_int = aqa.field_d + -wt.field_a;
            wt.field_a = -(var1_int >> 1) + gda.field_a;
            aqa.field_d = wt.field_a - -var1_int;
            wp.field_b = -(aa.field_c >> 1) + qi.field_N;
            var2 = wp.field_b;
            var3 = 0;
            L1: while (true) {
              if (cna.field_b.length <= var3) {
                break L0;
              } else {
                L2: {
                  var4 = f.field_c[var3];
                  if (var4 < 0) {
                    var5 = cka.field_H;
                    break L2;
                  } else {
                    if (lp.field_h.field_h == var4) {
                      var5 = fv.field_a;
                      break L2;
                    } else {
                      var5 = sua.field_I;
                      break L2;
                    }
                  }
                }
                L3: {
                  var6 = cna.field_b[var3];
                  stackOut_10_0 = -50;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_11_0 = stackOut_10_0;
                  if (var4 < 0) {
                    stackOut_12_0 = stackIn_12_0;
                    stackOut_12_1 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    break L3;
                  } else {
                    stackOut_11_0 = stackIn_11_0;
                    stackOut_11_1 = 1;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    break L3;
                  }
                }
                L4: {
                  var7 = apa.a((byte) stackIn_13_0, stackIn_13_1 != 0, var6);
                  var8 = -(var7 >> 1) + gda.field_a;
                  if (var4 < 0) {
                    break L4;
                  } else {
                    L5: {
                      if (lp.field_h.field_h == var4) {
                        stackOut_16_0 = pua.field_c;
                        stackIn_17_0 = stackOut_16_0;
                        break L5;
                      } else {
                        stackOut_15_0 = wua.field_o;
                        stackIn_17_0 = stackOut_15_0;
                        break L5;
                      }
                    }
                    L6: {
                      var9 = stackIn_17_0;
                      var2 = var2 + aqa.field_a;
                      if (var9 != null) {
                        var9.a((byte) 57, (vra.field_a << 1) + var7, var2, var8 + -vra.field_a, am.field_n + (vf.field_d << 1));
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var2 = var2 + vf.field_d;
                    break L4;
                  }
                }
                L7: {
                  if (0 > var4) {
                    kl.field_b.c(var6, var8, sb.field_d + var2, var5, -1);
                    var2 = var2 + uda.field_x;
                    var3++;
                    break L7;
                  } else {
                    bta.field_d.c(var6, var8, var2 + vo.field_f, var5, -1);
                    var2 = var2 + (aqa.field_a + vf.field_d - -am.field_n);
                    var3++;
                    break L7;
                  }
                }
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "mi.A(" + 125 + ')');
        }
    }

    public final String toString() {
        if (!(tr.field_f != ((mi) this).field_p)) {
            return "Method{" + ((mi) this).field_m + "}";
        }
        if (!(((mi) this).field_p != dc.field_o)) {
            return "Number{" + ((mi) this).field_m + "}";
        }
        if (!(dja.field_r != ((mi) this).field_p)) {
            return "Boolean{" + ((mi) this).field_m + "}";
        }
        if (!(nl.field_d != ((mi) this).field_p)) {
            return "Char{" + ((mi) this).field_m + "}";
        }
        if (ma.field_e == ((mi) this).field_p) {
            return "String{" + ((mi) this).field_m + "}";
        }
        if (lna.field_a == ((mi) this).field_p) {
            return "ArgStart";
        }
        if (!(rs.field_a != ((mi) this).field_p)) {
            return "ArgEnd";
        }
        if (!(((mi) this).field_p != qba.field_c)) {
            return "ArgComma";
        }
        return "Unknown";
    }

    mi(int param0, int param1) {
        this(param0, param1, (String) null);
    }

    public static void a(byte param0) {
        if (param0 != 101) {
          mi.a((byte) -114);
          field_l = null;
          field_n = null;
          field_j = null;
          return;
        } else {
          field_l = null;
          field_n = null;
          field_j = null;
          return;
        }
    }

    mi(int param0, int param1, String param2) {
        try {
            ((mi) this).field_p = param0;
            ((mi) this).field_m = param2;
            ((mi) this).field_h = param1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "mi.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final bfa a(int param0, ela[] param1) throws rv, jj {
        NumberFormatException var3 = null;
        RuntimeException var3_ref = null;
        int var3_int = 0;
        int var4 = 0;
        Object var5 = null;
        int var6 = 0;
        bfa[] var7 = null;
        bfa[] var8 = null;
        String var9 = null;
        bfa stackIn_9_0 = null;
        bfa stackIn_13_0 = null;
        bfa stackIn_17_0 = null;
        bfa stackIn_20_0 = null;
        bfa stackIn_22_0 = null;
        bfa stackIn_26_0 = null;
        bfa stackIn_33_0 = null;
        bfa stackIn_37_0 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        Throwable decompiledCaughtException = null;
        bfa stackOut_8_0 = null;
        bfa stackOut_25_0 = null;
        bfa stackOut_32_0 = null;
        bfa stackOut_36_0 = null;
        bfa stackOut_16_0 = null;
        bfa stackOut_21_0 = null;
        bfa stackOut_19_0 = null;
        bfa stackOut_12_0 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var5 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param0 == -1) {
              break L0;
            } else {
              ((mi) this).field_m = null;
              break L0;
            }
          }
          if (tr.field_f == ((mi) this).field_p) {
            var7 = new bfa[((mi) this).field_i.a((byte) -16)];
            var8 = var7;
            var4 = 0;
            var5 = (Object) (Object) (mi) (Object) ((mi) this).field_i.f(-80);
            L1: while (true) {
              if (var5 == null) {
                stackOut_8_0 = pc.a(param1, 19, ((mi) var5).field_m, var8);
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              } else {
                int incrementValue$1 = var4;
                var4++;
                var7[incrementValue$1] = ((mi) var5).a(-1, param1);
                var5 = (Object) (Object) (mi) (Object) ((mi) var5).field_i.e(114);
                continue L1;
              }
            }
          } else {
            if (dc.field_o != ((mi) var5).field_p) {
              if (dja.field_r == ((mi) var5).field_p) {
                stackOut_25_0 = new bfa(((mi) var5).field_m.equals((Object) (Object) "true"));
                stackIn_26_0 = stackOut_25_0;
                return stackIn_26_0;
              } else {
                if (((mi) var5).field_p == nl.field_d) {
                  var9 = ((mi) var5).field_m.substring(1, ((mi) var5).field_m.length() + -1);
                  if (var9.length() != 1) {
                    throw new rv("Invalid char value: " + var9);
                  } else {
                    stackOut_32_0 = new bfa(var9.charAt(0));
                    stackIn_33_0 = stackOut_32_0;
                    return stackIn_33_0;
                  }
                } else {
                  if (ma.field_e == ((mi) var5).field_p) {
                    stackOut_36_0 = new bfa((Object) (Object) ((mi) var5).field_m.substring(1, -1 + ((mi) var5).field_m.length()));
                    stackIn_37_0 = stackOut_36_0;
                    return stackIn_37_0;
                  } else {
                    throw new IllegalArgumentException();
                  }
                }
              }
            } else {
              var3_int = Character.toLowerCase(((mi) var5).field_m.charAt(((mi) var5).field_m.length() - 1));
              if (var3_int != 102) {
                if (var3_int == 108) {
                  stackOut_16_0 = new bfa(Long.parseLong(((mi) var5).field_m.substring(0, ((mi) var5).field_m.length() + -1)));
                  stackIn_17_0 = stackOut_16_0;
                  return stackIn_17_0;
                } else {
                  if (((mi) var5).field_m.indexOf('.') == -1) {
                    stackOut_21_0 = new bfa(Integer.parseInt(((mi) var5).field_m));
                    stackIn_22_0 = stackOut_21_0;
                    return stackIn_22_0;
                  } else {
                    stackOut_19_0 = new bfa(Double.valueOf(((mi) var5).field_m).doubleValue());
                    stackIn_20_0 = stackOut_19_0;
                    return stackIn_20_0;
                  }
                }
              } else {
                stackOut_12_0 = new bfa(Float.valueOf(((mi) var5).field_m).floatValue());
                stackIn_13_0 = stackOut_12_0;
                return stackIn_13_0;
              }
            }
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (NumberFormatException) (Object) decompiledCaughtException;
          throw new rv("NumberFormatException on: " + ((mi) var5).field_m);
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L2: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var3_ref;
            stackOut_41_1 = new StringBuilder().append("mi.C(").append(param0).append(',');
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param1 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L2;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new int[]{15, 35, 12, 7, 18, 33};
        field_n = "You cannot chat to <%0> because <%0> is offline in your friend list.";
        field_k = 33;
        field_j = "Players";
        field_o = false;
        field_f = -1;
    }
}
