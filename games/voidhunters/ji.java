/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji extends rqa {
    static qkb field_p;
    static int[] field_o;

    ji(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static boolean b(boolean param0) {
        boolean[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        boolean[] var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            var5 = qd.field_a;
            var1 = var5;
            var2 = 0;
            L1: while (true) {
              if (var5.length <= var2) {
                if (param0) {
                  stackIn_10_0 = 1;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  ji.b(false);
                  return true;
                }
              } else {
                var3 = var5[var2] ? 1 : 0;
                if (var3 != 0) {
                  var2++;
                  continue L1;
                } else {
                  stackIn_5_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1_ref), "ji.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    final static void e(int param0) {
        ana var1 = null;
        int var2 = 0;
        boolean stackIn_20_0 = false;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var2 = VoidHunters.field_G;
        try {
          L0: {
            if (param0 == 200) {
              L1: {
                flb.field_o.h();
                aaa.field_b.h();
                m.field_o = m.field_o - 1;
                if (m.field_o == 0) {
                  m.field_o = 200;
                  var1 = (ana) ((Object) cg.field_p.d(0));
                  L2: while (true) {
                    if (var1 == null) {
                      if (rd.field_o == null) {
                        break L1;
                      } else {
                        var1 = (ana) ((Object) rd.field_o.d(0));
                        L3: while (true) {
                          if (var1 == null) {
                            break L1;
                          } else {
                            L4: {
                              if (var1.field_g.b((byte) -63)) {
                                break L4;
                              } else {
                                var1.b(-3846);
                                break L4;
                              }
                            }
                            var1 = (ana) ((Object) rd.field_o.a((byte) 47));
                            continue L3;
                          }
                        }
                      }
                    } else {
                      L5: {
                        if (var1.field_g.b((byte) -63)) {
                          break L5;
                        } else {
                          var1.b(-3846);
                          break L5;
                        }
                      }
                      var1 = (ana) ((Object) cg.field_p.a((byte) 96));
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
              L6: {
                if (aab.field_o == null) {
                  break L6;
                } else {
                  stackIn_20_0 = aab.field_o.c(-100);
                  if (stackIn_20_0) {
                    break L6;
                  } else {
                    dha.field_u = null;
                    return;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1_ref), "ji.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -119) {
                break L1;
              } else {
                ji.b(true);
                break L1;
              }
            }
            qua.field_b = param0[0].d(0);
            stackIn_3_0 = new nc("void");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ji.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(int param0) {
        if (param0 != 200) {
            return;
        }
        field_o = null;
        field_p = null;
    }

    static {
        field_o = new int[8192];
    }
}
