/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ag {
    static String[] field_b;
    static kh field_a;
    static int field_c;

    final static String b(int param0) {
        if (!nh.field_P) {
          if (ge.field_c >= ea.field_b) {
            if (ge.field_c >= sd.field_lb + ea.field_b) {
              if (param0 == -1) {
                return null;
              } else {
                return (String) null;
              }
            } else {
              return oc.field_b;
            }
          } else {
            if (param0 == -1) {
              return null;
            } else {
              return (String) null;
            }
          }
        } else {
          if (param0 == -1) {
            return null;
          } else {
            return (String) null;
          }
        }
    }

    final static java.net.URL a(java.applet.Applet param0, java.net.URL param1, boolean param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_10_0 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = null;
              var4 = null;
              if (null == jg.field_B) {
                break L1;
              } else {
                if (!jg.field_B.equals(param0.getParameter("settings"))) {
                  var3 = jg.field_B;
                  var4 = var3;
                  var4 = var3;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (!param2) {
                break L2;
              } else {
                field_c = 112;
                break L2;
              }
            }
            L3: {
              if (null == bl.field_b) {
                break L3;
              } else {
                if (bl.field_b.equals(param0.getParameter("session"))) {
                  break L3;
                } else {
                  var4 = bl.field_b;
                  break L3;
                }
              }
            }
            stackIn_10_0 = bi.a(param1, (byte) -107, -1, (String) (var3), (String) (var4));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = var3;

            stackIn_13_1 = new StringBuilder().append("ag.C(");

            if (param0 == null) {
              stackIn_14_0 = stackIn_13_0;
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = stackIn_13_0;
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param1 == null) {

              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {

              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ',' + param2 + ')');
        }
        return stackIn_10_0;
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != -1) {
            ag.b(8);
        }
    }

    static {
        field_b = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
    }
}
