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

    final static String a(String param0) {
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
        int stackIn_6_0 = 0;
        String stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_18_0 = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            var10 = dib.a(param0, 127);
            var2_array = var10;
            var3 = new StringBuilder();
            var4 = 0;
            L1: while (true) {
              if (var4 >= var10.length) {
                stackOut_18_0 = var3.toString();
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                L2: {
                  var5 = var10[var4];
                  var6 = var5.field_g;
                  if (-1 + var10.length == var4) {
                    stackOut_5_0 = param0.length();
                    stackIn_6_0 = stackOut_5_0;
                    break L2;
                  } else {
                    stackOut_4_0 = var2_array[1 + var4].field_g;
                    stackIn_6_0 = stackOut_4_0;
                    break L2;
                  }
                }
                L3: {
                  var7 = stackIn_6_0;
                  var8 = param0.substring(var6, var7);
                  if (var5.field_e != dla.field_d) {
                    if (var5.field_e == ek.field_o) {
                      StringBuilder discarded$6 = var3.append("<col=33bbff>").append(var8).append("</col>");
                      break L3;
                    } else {
                      if (hpa.field_p == var5.field_e) {
                        StringBuilder discarded$7 = var3.append("<col=ffff99>").append(var8).append("</col>");
                        break L3;
                      } else {
                        if (fwa.field_h == var5.field_e) {
                          StringBuilder discarded$8 = var3.append("<col=ffaaff>").append(var8).append("</col>");
                          break L3;
                        } else {
                          if (var5.field_e != io.field_p) {
                            StringBuilder discarded$9 = var3.append(var8);
                            break L3;
                          } else {
                            StringBuilder discarded$10 = var3.append("<col=33ffaa>").append(var8).append("</col>");
                            break L3;
                          }
                        }
                      }
                    }
                  } else {
                    StringBuilder discarded$11 = var3.append("<col=66ffff>").append(var8).append("</col>");
                    break L3;
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var2;
            stackOut_20_1 = new StringBuilder().append("bab.F(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L4;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + 107 + ')');
        }
        return stackIn_19_0;
    }

    public static void a(boolean param0) {
        if (!param0) {
            bab.a(false);
        }
        field_a = null;
        field_b = null;
    }

    final static void a(String param0, long param1) {
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
            throw rta.a((Throwable) (Object) runtimeException, "bab.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + 63 + ')');
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
        ml var3 = null;
        ml var4 = null;
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
            param1.a(1, 0, new ml(13));
            param1.a(1, 1, new ml(13));
            param1.a(1, 3, new ml(13));
            param1.a(1, 23, new ml(13));
            param1.a(1, 25, new ml(13));
            param1.a(1, 13, new ml(16));
            param1.a(1, 2, new ml(43));
            param1.a(1, 24, new ml(43));
            var3 = new ml(31);
            var3.a(1, 1, new ml(13));
            var3.a(1, 3, new ml(13));
            var3.a(1, 2, new ml(16));
            param1.a(1, 6, var3);
            var4 = new ml(31);
            var4.a(1, 0, new ml(13));
            var4.a(1, 2, new ml(13));
            var4.a(1, 3, new ml(16));
            param1.a(1, 20, var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("bab.C(").append(true).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
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
          throw rta.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
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
