/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg extends rqa {
    static phb[][] field_o;

    public static void e(int param0) {
        int var1 = 0;
        field_o = null;
    }

    final static int f(int param0) {
        if (param0 != 255) {
            int discarded$0 = mg.f(-9);
            return 255 * pob.field_b / 32;
        }
        return 255 * pob.field_b / 32;
    }

    mg(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        jk var1_ref = null;
        mm var1_ref2 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = VoidHunters.field_G;
        try {
          L0: {
            var1_ref = (jk) (Object) cta.field_q.d(0);
            L1: while (true) {
              if (var1_ref == null) {
                var1_ref2 = (mm) (Object) kja.field_E.d(0);
                L2: while (true) {
                  if (var1_ref2 == null) {
                    var1_ref = (jk) (Object) mea.field_e.d(param0);
                    L3: while (true) {
                      if (var1_ref == null) {
                        break L0;
                      } else {
                        if (var1_ref.field_yb > 0) {
                          var1_ref.field_yb = var1_ref.field_yb - 1;
                          if (0 == var1_ref.field_yb) {
                            var1_ref.field_Db = 0;
                            if (var1_ref.i(param0 + -128)) {
                              var1_ref.b(-3846);
                              var1_ref = (jk) (Object) mea.field_e.a((byte) 11);
                              continue L3;
                            } else {
                              var1_ref = (jk) (Object) mea.field_e.a((byte) 11);
                              continue L3;
                            }
                          } else {
                            var1_ref = (jk) (Object) mea.field_e.a((byte) 11);
                            continue L3;
                          }
                        } else {
                          var1_ref = (jk) (Object) mea.field_e.a((byte) 11);
                          continue L3;
                        }
                      }
                    }
                  } else {
                    if (var1_ref2.field_Db > 0) {
                      var1_ref2.field_Db = var1_ref2.field_Db - 1;
                      if (var1_ref2.field_Db != 0) {
                        var1_ref2 = (mm) (Object) kja.field_E.a((byte) 118);
                        continue L2;
                      } else {
                        var1_ref2.field_ec = 0;
                        if (var1_ref2.e((byte) 74)) {
                          var1_ref2.b(-3846);
                          var1_ref2 = (mm) (Object) kja.field_E.a((byte) 118);
                          continue L2;
                        } else {
                          var1_ref2 = (mm) (Object) kja.field_E.a((byte) 118);
                          continue L2;
                        }
                      }
                    } else {
                      var1_ref2 = (mm) (Object) kja.field_E.a((byte) 118);
                      continue L2;
                    }
                  }
                }
              } else {
                if (var1_ref.field_yb <= 0) {
                  var1_ref = (jk) (Object) cta.field_q.a((byte) 62);
                  continue L1;
                } else {
                  var1_ref.field_yb = var1_ref.field_yb - 1;
                  if (var1_ref.field_yb != 0) {
                    var1_ref = (jk) (Object) cta.field_q.a((byte) 62);
                    continue L1;
                  } else {
                    var1_ref.field_Db = 0;
                    if (!var1_ref.i(param0 ^ -124)) {
                      var1_ref = (jk) (Object) cta.field_q.a((byte) 62);
                      continue L1;
                    } else {
                      var1_ref.b(param0 ^ -3846);
                      var1_ref = (jk) (Object) cta.field_q.a((byte) 62);
                      continue L1;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var1, "mg.B(" + param0 + 41);
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_3_0 = null;
        Object stackOut_1_0 = null;
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
            si.a(216, 62, param0[0].a(71));
            if (param1 < -119) {
              stackOut_3_0 = new nc((Object) (Object) "void");
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (nc) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("mg.A(");
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
          throw rta.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
        return stackIn_4_0;
    }

    static {
    }
}
