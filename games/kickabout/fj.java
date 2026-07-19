/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj {
    static int field_a;
    static volatile int field_c;
    static hu field_b;

    public static void b(boolean param0) {
        tf discarded$0 = null;
        field_b = null;
        if (!param0) {
            String var2 = (String) null;
            discarded$0 = fj.a(true, (String) null);
        }
    }

    final static void a(boolean param0, boolean param1) {
        dg.field_e = !param1 ? true : false;
        if (param0) {
            field_c = -78;
            return;
        }
    }

    final static String a(boolean param0) {
        if (param0) {
            return (String) null;
        }
        return un.field_e.a(-108);
    }

    final static int a(int param0, int param1) {
        if (param0 != -40) {
          fj.a(true, false);
          return param1 >>> -771544996 | param1 << 762932996;
        } else {
          return param1 >>> -771544996 | param1 << 762932996;
        }
    }

    final static void a(int param0) {
        tf discarded$2 = null;
        String var2 = null;
        L0: {
          wd.field_l.k(119);
          if (nm.field_d == null) {
            nm.field_d = new oj(wd.field_l, st.field_m);
            break L0;
          } else {
            break L0;
          }
        }
        wd.field_l.a(nm.field_d, false);
        if (param0 != -45) {
          var2 = (String) null;
          discarded$2 = fj.a(true, (String) null);
          return;
        } else {
          return;
        }
    }

    final static tf a(boolean param0, String param1) {
        tf var2 = null;
        RuntimeException var2_ref = null;
        sb var3 = null;
        int var4 = 0;
        int var5 = 0;
        tf stackIn_3_0 = null;
        tf stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        tf stackOut_19_0 = null;
        tf stackOut_2_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var5 = Kickabout.field_G;
        try {
          L0: {
            var2 = new tf();
            if (!param0) {
              var3 = new sb(param1);
              L1: while (true) {
                if (var3.a((byte) 62)) {
                  stackOut_19_0 = (tf) (var2);
                  stackIn_20_0 = stackOut_19_0;
                  decompiledRegionSelector0 = 1;
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
                            var2.a(new lk(si.field_g, -1 + var3.field_c), 3);
                            continue L1;
                          } else {
                            if (41 == var4) {
                              var2.a(new lk(og.field_c, var3.field_c + -1), 3);
                              continue L1;
                            } else {
                              if (var4 == 44) {
                                var2.a(new lk(bp.field_Gb, -1 + var3.field_c), 3);
                                continue L1;
                              } else {
                                var2.a(tl.a(var3, false), 3);
                                continue L1;
                              }
                            }
                          }
                        }
                      }
                    }
                    var2.a(cf.a(-9323, var3), 3);
                    continue L1;
                  } else {
                    continue L1;
                  }
                }
              }
            } else {
              stackOut_2_0 = (tf) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var2_ref);
            stackOut_21_1 = new StringBuilder().append("fj.F(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L3;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_20_0;
        }
    }

    static {
        field_c = 0;
    }
}
