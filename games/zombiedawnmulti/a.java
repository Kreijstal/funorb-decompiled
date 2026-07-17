/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class a {
    static ri[][] field_a;
    static th field_c;
    static int field_b;

    public static void a(boolean param0) {
        field_a = null;
        field_c = null;
    }

    final static void b(int param0) {
        int var1 = 0;
        int var2 = 0;
        Object var3 = null;
        var2 = ZombieDawnMulti.field_E ? 1 : 0;
        pm.field_P = null;
        nj.field_f = false;
        if (ch.field_e) {
          h.field_L.c(false);
          if (param0 != -1) {
            var3 = null;
            boolean discarded$4 = a.a((String) null, (String) null, (byte) 24);
            return;
          } else {
            return;
          }
        } else {
          var1 = qq.field_a;
          if (0 >= var1) {
            h.field_L.m(-7435);
            sp.c(param0 + 1);
            if (param0 != -1) {
              var3 = null;
              boolean discarded$5 = a.a((String) null, (String) null, (byte) 24);
              return;
            } else {
              return;
            }
          } else {
            if (1 == var1) {
              pm.field_P = rp.field_e;
              pm.field_P = wi.a(new CharSequence[3], 77);
              h.field_L.m(-7435);
              sp.c(param0 + 1);
              if (param0 == -1) {
                return;
              } else {
                var3 = null;
                boolean discarded$6 = a.a((String) null, (String) null, (byte) 24);
                return;
              }
            } else {
              pm.field_P = vl.a(al.field_cb, new String[1], 2);
              pm.field_P = wi.a(new CharSequence[3], 77);
              h.field_L.m(-7435);
              sp.c(param0 + 1);
              if (param0 == -1) {
                return;
              } else {
                var3 = null;
                boolean discarded$7 = a.a((String) null, (String) null, (byte) 24);
                return;
              }
            }
          }
        }
    }

    final static boolean a(int param0) {
        return rn.field_f == null ? ro.field_L : true;
    }

    final static ja[] a(int param0, byte param1, ul param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        ja[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        ja[] stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (ud.a(param3, param2, param0, (byte) -42)) {
              var4_int = -18 / ((param1 - -16) / 62);
              stackOut_3_0 = tg.a(0);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("a.B(").append(param0).append(44).append(param1).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param3 + 41);
        }
        return stackIn_4_0;
    }

    final static boolean a(String param0, String param1, byte param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              param1 = ee.a('_', "", param1, -121);
              if (param2 <= -71) {
                break L1;
              } else {
                field_c = null;
                break L1;
              }
            }
            L2: {
              L3: {
                var3 = qc.b((byte) -32, param0);
                if (param1.indexOf(param0) != -1) {
                  break L3;
                } else {
                  if (param1.indexOf(var3) == -1) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("a.D(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          L5: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param2 + 41);
        }
        return stackIn_7_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new th();
    }
}
