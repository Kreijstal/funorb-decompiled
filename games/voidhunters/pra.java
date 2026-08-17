/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pra extends rqa {
    static int field_o;
    static Object field_p;
    static String field_q;

    pra(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 <= -119) {
              stackIn_4_0 = new nc(frb.a(59, 121));
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
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("pra.A(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(boolean param0, boolean param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              L2: {
                if (param0) {
                  break L2;
                } else {
                  if (null != lqa.field_o) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              wo.field_o = false;
              break L1;
            }
            L3: {
              if (param0) {
                if (-1 > (lia.field_b ^ -1)) {
                  lia.field_b = lia.field_b - 1;
                  break L3;
                } else {
                  if (-1 <= (nf.field_a ^ -1)) {
                    if ((tba.field_p ^ -1) >= -1) {
                      break L3;
                    } else {
                      tba.field_p = tba.field_p - 1;
                      break L3;
                    }
                  } else {
                    nf.field_a = nf.field_a - 1;
                    break L3;
                  }
                }
              } else {
                if (lqa.field_o != null) {
                  if (0 >= lia.field_b) {
                    if ((nf.field_a ^ -1) >= -1) {
                      if (ldb.field_o > tba.field_p) {
                        L4: {
                          if (-1 != (tba.field_p ^ -1)) {
                            break L4;
                          } else {
                            ai.a(false, 0);
                            break L4;
                          }
                        }
                        tba.field_p = tba.field_p + 1;
                        break L3;
                      } else {
                        break L3;
                      }
                    } else {
                      nf.field_a = nf.field_a - 1;
                      break L3;
                    }
                  } else {
                    lia.field_b = lia.field_b - 1;
                    break L3;
                  }
                } else {
                  if (null != ohb.field_o) {
                    if (0 < lia.field_b) {
                      lia.field_b = lia.field_b - 1;
                      break L3;
                    } else {
                      if (0 < tba.field_p) {
                        tba.field_p = tba.field_p - 1;
                        break L3;
                      } else {
                        if (nf.field_a < ldb.field_o) {
                          L5: {
                            if (-1 == (nf.field_a ^ -1)) {
                              ai.a(true, 0);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          nf.field_a = nf.field_a + 1;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                  } else {
                    wo.field_o = false;
                    if (0 < nf.field_a) {
                      nf.field_a = nf.field_a - 1;
                      break L3;
                    } else {
                      if (-1 <= (tba.field_p ^ -1)) {
                        if (lia.field_b >= ldb.field_o) {
                          break L3;
                        } else {
                          L6: {
                            if (lia.field_b != 0) {
                              break L6;
                            } else {
                              fma.l(8611);
                              break L6;
                            }
                          }
                          lia.field_b = lia.field_b + 1;
                          break L3;
                        }
                      } else {
                        tba.field_p = tba.field_p - 1;
                        break L3;
                      }
                    }
                  }
                }
              }
            }
            if (param1) {
              break L0;
            } else {
              pra.a(true, false);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var2), "pra.C(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        try {
            if (param0 >= -71) {
                field_p = (Object) null;
            }
            field_q = null;
            field_p = null;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "pra.B(" + param0 + ')');
        }
    }

    static {
        field_q = "Ship blueprint recorded";
    }
}
