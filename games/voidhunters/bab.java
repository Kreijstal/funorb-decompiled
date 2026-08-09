/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bab implements dja {
    static String field_a;
    static String field_b;

    public final tv a(byte param0) {
        int var2 = -28 / ((param0 - -64) / 50);
        return (tv) ((Object) new dv());
    }

    final static String a(String param0, int param1) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        int stackIn_8_0 = 0;
        String stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        tsa[] var2 = null;
        RuntimeException var2_ref = null;
        StringBuilder var3 = null;
        int var4 = 0;
        tsa var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        tsa[] var10 = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param1 >= 74) {
                break L1;
              } else {
                field_b = (String) null;
                break L1;
              }
            }
            var10 = dib.a(param0, 127);
            var2 = var10;
            var3 = new StringBuilder();
            var4 = 0;
            L2: while (true) {
              if (var4 >= var10.length) {
                stackIn_21_0 = var3.toString();
                break L0;
              } else {
                L3: {
                  var5 = var10[var4];
                  var6 = var5.field_g;
                  if (-1 + var10.length == var4) {
                    stackIn_8_0 = param0.length();
                    break L3;
                  } else {
                    stackIn_8_0 = var2[1 + var4].field_g;
                    break L3;
                  }
                }
                L4: {
                  var7 = stackIn_8_0;
                  var8 = param0.substring(var6, var7);
                  if (var5.field_e != dla.field_d) {
                    if (var5.field_e == ek.field_o) {
                      discarded$0 = var3.append("<col=33bbff>").append(var8).append("</col>");
                      break L4;
                    } else {
                      if (hpa.field_p == var5.field_e) {
                        discarded$1 = var3.append("<col=ffff99>").append(var8).append("</col>");
                        break L4;
                      } else {
                        if (fwa.field_h == var5.field_e) {
                          discarded$2 = var3.append("<col=ffaaff>").append(var8).append("</col>");
                          break L4;
                        } else {
                          if (var5.field_e != io.field_p) {
                            discarded$3 = var3.append(var8);
                            break L4;
                          } else {
                            discarded$4 = var3.append("<col=33ffaa>").append(var8).append("</col>");
                            break L4;
                          }
                        }
                      }
                    }
                  } else {
                    discarded$5 = var3.append("<col=66ffff>").append(var8).append("</col>");
                    break L4;
                  }
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2_ref = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2_ref);

            stackIn_24_1 = new StringBuilder().append("bab.F(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L5;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        return stackIn_21_0;
    }

    public static void a(boolean param0) {
        if (!param0) {
            bab.a(false);
        }
        field_a = null;
        field_b = null;
    }

    final static void a(String param0, long param1, int param2) {
        CharSequence var5 = null;
        try {
            waa.field_x = param0;
            int var4_int = -104 / ((-6 - param2) / 42);
            ow.field_b = 2;
            var5 = (CharSequence) ((Object) param0);
            nkb.field_o = jwa.a(false, var5);
            lsa.field_f = param1;
            oma.a(true);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "bab.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            return (tv[]) null;
        }
        return (tv[]) ((Object) new dv[param1]);
    }

    final static void a(boolean param0, ml param1) {
        String var3 = null;
        ml var4 = null;
        ml var5 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              param1.a(1, 0, new ml(13));
              param1.a(1, 1, new ml(13));
              param1.a(1, 3, new ml(13));
              param1.a(1, 23, new ml(13));
              param1.a(1, 25, new ml(13));
              param1.a(1, 13, new ml(16));
              param1.a(1, 2, new ml(43));
              param1.a(1, 24, new ml(43));
              var4 = new ml(31);
              var4.a(1, 1, new ml(13));
              var4.a(1, 3, new ml(13));
              var4.a(1, 2, new ml(16));
              param1.a(1, 6, var4);
              var5 = new ml(31);
              var5.a(1, 0, new ml(13));
              var5.a(1, 2, new ml(13));
              var5.a(1, 3, new ml(16));
              param1.a(1, 20, var5);
              if (param0) {
                break L1;
              } else {
                var3 = (String) null;
                bab.a((String) null, 85);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var2);

            stackIn_5_1 = new StringBuilder().append("bab.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    static {
        field_b = "Scale up map height";
        field_a = "Void Hunters";
    }
}
