/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg extends rqa {
    static phb[][] field_o;

    public static void e(int param0) {
        int var1 = -101 % ((-37 - param0) / 42);
        field_o = (phb[][]) null;
    }

    final static int f(int param0) {
        if (param0 != 255) {
            mg.f(-9);
            return 255 * pob.field_b / 32;
        }
        return 255 * pob.field_b / 32;
    }

    mg(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        jk var1 = null;
        mm var1_ref = null;
        RuntimeException var1_ref2 = null;
        int var2 = 0;
        var2 = VoidHunters.field_G;
        try {
          L0: {
            var1 = (jk) ((Object) cta.field_q.d(0));
            L1: while (true) {
              if (var1 == null) {
                var1_ref = (mm) ((Object) kja.field_E.d(0));
                L2: while (true) {
                  if (var1_ref == null) {
                    var1 = (jk) ((Object) mea.field_e.d(param0));
                    L3: while (true) {
                      if (var1 == null) {
                        break L0;
                      } else {
                        L4: {
                          if (-1 > (var1.field_yb ^ -1)) {
                            var1.field_yb = var1.field_yb - 1;
                            if (0 == var1.field_yb) {
                              var1.field_Db = 0;
                              if (var1.i(param0 + -128)) {
                                var1.b(-3846);
                                break L4;
                              } else {
                                break L4;
                              }
                            } else {
                              var1 = (jk) ((Object) mea.field_e.a((byte) 11));
                              continue L3;
                            }
                          } else {
                            break L4;
                          }
                        }
                        var1 = (jk) ((Object) mea.field_e.a((byte) 11));
                        continue L3;
                      }
                    }
                  } else {
                    L5: {
                      if ((var1_ref.field_Db ^ -1) < -1) {
                        var1_ref.field_Db = var1_ref.field_Db - 1;
                        if (-1 != (var1_ref.field_Db ^ -1)) {
                          break L5;
                        } else {
                          var1_ref.field_ec = 0;
                          if (var1_ref.e((byte) 74)) {
                            var1_ref.b(-3846);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      } else {
                        break L5;
                      }
                    }
                    var1_ref = (mm) ((Object) kja.field_E.a((byte) 118));
                    continue L2;
                  }
                }
              } else {
                L6: {
                  if ((var1.field_yb ^ -1) >= -1) {
                    break L6;
                  } else {
                    var1.field_yb = var1.field_yb - 1;
                    if (-1 != (var1.field_yb ^ -1)) {
                      break L6;
                    } else {
                      var1.field_Db = 0;
                      if (!var1.i(param0 ^ -124)) {
                        break L6;
                      } else {
                        var1.b(param0 ^ -3846);
                        break L6;
                      }
                    }
                  }
                }
                var1 = (jk) ((Object) cta.field_q.a((byte) 62));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref2 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1_ref2), "mg.B(" + param0 + ')');
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            si.a(216, 62, param0[0].a(71));
            if (param1 < -119) {
              stackIn_4_0 = new nc("void");
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (nc) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("mg.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    static {
    }
}
