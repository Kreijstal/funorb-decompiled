/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sm extends fa {
    int[] field_o;
    static String field_n;
    static boolean field_l;
    int field_p;
    static ak field_m;
    static String field_k;

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
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
            if (param1 == -1) {
              var3 = (CharSequence) (Object) param0;
              stackOut_3_0 = eq.field_Hb.equals((Object) (Object) dh.a(var3, (byte) 72));
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("sm.B(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
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
          throw aa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(int param0, boolean param1) {
        int var3 = 0;
        String var4 = null;
        Object var5 = null;
        Object var6 = null;
        CharSequence var7 = null;
        L0: {
          if (he.field_f == null) {
            break L0;
          } else {
            var3 = he.field_f.b(-126, param1);
            if (var3 != 0) {
              if (2 != var3) {
                he.field_f = null;
                il.field_e = -1;
                return;
              } else {
                if (he.field_f.field_cb == null) {
                  he.field_f = null;
                  il.field_e = -1;
                  return;
                } else {
                  if (!he.field_f.field_cb.equals((Object) (Object) "")) {
                    L1: {
                      if (91 != he.field_f.field_cb.charAt(0)) {
                        var7 = (CharSequence) (Object) he.field_f.field_cb;
                        var4 = dh.a(var7, (byte) 26);
                        break L1;
                      } else {
                        var4 = he.field_f.field_cb;
                        break L1;
                      }
                    }
                    L2: {
                      var5 = null;
                      if (il.field_e != 0) {
                        break L2;
                      } else {
                        var5 = (Object) (Object) jf.a(var4, 13, (byte) 108);
                        break L2;
                      }
                    }
                    L3: {
                      if (il.field_e == 1) {
                        int discarded$44 = -106;
                        var5 = (Object) (Object) ff.a(13, var4);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      if (il.field_e == 2) {
                        var5 = (Object) (Object) mj.a(-34, var4, 13);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (il.field_e == 3) {
                        int discarded$45 = -20867;
                        var5 = (Object) (Object) aq.a(var4, 13, var4);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    if (var5 != null) {
                      var6 = null;
                      ti.a(0, (String) null, var4, (byte) -59, 2, (String) var5);
                      he.field_f = null;
                      il.field_e = -1;
                      break L0;
                    } else {
                      he.field_f = null;
                      il.field_e = -1;
                      return;
                    }
                  } else {
                    he.field_f = null;
                    il.field_e = -1;
                    return;
                  }
                }
              }
            } else {
              return;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_m = null;
        field_k = null;
        field_n = null;
        if (param0 >= -99) {
            sm.a((byte) -113);
        }
    }

    private sm() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = false;
        field_k = "(1 player wants to join)";
        field_n = "Please select an option in the '<%0>' row.";
    }
}
