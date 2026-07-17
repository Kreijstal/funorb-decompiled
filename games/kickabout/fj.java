/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj {
    static int field_a;
    static volatile int field_c;
    static hu field_b;

    public static void b() {
        field_b = null;
    }

    final static void a(boolean param0, boolean param1) {
        dg.field_e = !param1 ? true : false;
    }

    final static String a(boolean param0) {
        return un.field_e.a(-108);
    }

    final static int a(int param0, int param1) {
        return param1 >>> 28 | param1 << 4;
    }

    final static void a() {
        wd.field_l.k(119);
        if (!(nm.field_d != null)) {
            nm.field_d = new oj(wd.field_l, st.field_m);
        }
        wd.field_l.a((fd) (Object) nm.field_d, false);
    }

    final static tf a(boolean param0, String param1) {
        tf var2 = null;
        RuntimeException var2_ref = null;
        sb var3 = null;
        int var4 = 0;
        int var5 = 0;
        tf stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        tf stackOut_18_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var5 = Kickabout.field_G;
        try {
          L0: {
            var2 = new tf();
            var3 = new sb(param1);
            L1: while (true) {
              if (var3.a((byte) 62)) {
                stackOut_18_0 = (tf) var2;
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                var4 = var3.b(-78);
                if (!Character.isWhitespace((char) var4)) {
                  L2: {
                    if (34 == var4) {
                      break L2;
                    } else {
                      if (var4 == 39) {
                        break L2;
                      } else {
                        if (40 == var4) {
                          var2.a((gn) (Object) new lk(si.field_g, -1 + var3.field_c), 3);
                          continue L1;
                        } else {
                          if (41 == var4) {
                            var2.a((gn) (Object) new lk(og.field_c, var3.field_c + -1), 3);
                            continue L1;
                          } else {
                            if (var4 == 44) {
                              var2.a((gn) (Object) new lk(bp.field_Gb, -1 + var3.field_c), 3);
                              continue L1;
                            } else {
                              int discarded$1 = 0;
                              var2.a((gn) (Object) tl.a(var3), 3);
                              continue L1;
                            }
                          }
                        }
                      }
                    }
                  }
                  var2.a((gn) (Object) cf.a(-9323, var3), 3);
                  continue L1;
                } else {
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var2_ref;
            stackOut_20_1 = new StringBuilder().append("fj.F(").append(0).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L3;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L3;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
        return stackIn_19_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
    }
}
