/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bab implements dja {
    static String field_a;
    static String field_b;

    public final tv a(byte param0) {
        int var2 = -28 / ((param0 - -64) / 50);
        return (tv) (Object) new dv();
    }

    final static String a(String param0, int param1) {
        RuntimeException var2 = null;
        tsa[] var2_array = null;
        StringBuilder var3 = null;
        int var4 = 0;
        tsa var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        tsa[] var10 = null;
        int stackIn_8_0 = 0;
        String stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_20_0 = null;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param1 >= 74) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            var10 = dib.a(param0, 127);
            var2_array = var10;
            var3 = new StringBuilder();
            var4 = 0;
            L2: while (true) {
              if (var4 >= var10.length) {
                stackOut_20_0 = var3.toString();
                stackIn_21_0 = stackOut_20_0;
                break L0;
              } else {
                L3: {
                  var5 = var10[var4];
                  var6 = var5.field_g;
                  if (-1 + var10.length == var4) {
                    stackOut_7_0 = param0.length();
                    stackIn_8_0 = stackOut_7_0;
                    break L3;
                  } else {
                    stackOut_6_0 = var2_array[1 + var4].field_g;
                    stackIn_8_0 = stackOut_6_0;
                    break L3;
                  }
                }
                L4: {
                  var7 = stackIn_8_0;
                  var8 = param0.substring(var6, var7);
                  if (var5.field_e != dla.field_d) {
                    if (var5.field_e == ek.field_o) {
                      StringBuilder discarded$6 = var3.append("<col=33bbff>").append(var8).append("</col>");
                      break L4;
                    } else {
                      if (hpa.field_p == var5.field_e) {
                        StringBuilder discarded$7 = var3.append("<col=ffff99>").append(var8).append("</col>");
                        break L4;
                      } else {
                        if (fwa.field_h == var5.field_e) {
                          StringBuilder discarded$8 = var3.append("<col=ffaaff>").append(var8).append("</col>");
                          break L4;
                        } else {
                          if (var5.field_e != io.field_p) {
                            StringBuilder discarded$9 = var3.append(var8);
                            break L4;
                          } else {
                            StringBuilder discarded$10 = var3.append("<col=33ffaa>").append(var8).append("</col>");
                            break L4;
                          }
                        }
                      }
                    }
                  } else {
                    StringBuilder discarded$11 = var3.append("<col=66ffff>").append(var8).append("</col>");
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
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("bab.F(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L5;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param1 + 41);
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
            int var4_int = 104;
            ow.field_b = 2;
            var5 = (CharSequence) (Object) param0;
            nkb.field_o = jwa.a(false, var5);
            lsa.field_f = param1;
            oma.a(true);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "bab.E(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + 63 + 41);
        }
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            return null;
        }
        return (tv[]) (Object) new dv[param1];
    }

    final static void a(boolean param0, ml param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        ml var4 = null;
        ml var5 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
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
                var3 = null;
                String discarded$1 = bab.a((String) null, 85);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var2;
            stackOut_3_1 = new StringBuilder().append("bab.C(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Scale up map height";
        field_a = "Void Hunters";
    }
}
