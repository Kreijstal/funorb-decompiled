/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jm extends rqa {
    static String field_o;

    public static void e(byte param0) {
        if (param0 != 71) {
            return;
        }
        field_o = null;
    }

    final static sr a(int param0, int param1) {
        sr var2;
        byte[] var3;
        var2 = (sr) (us.field_d.b(param1, (long)param0));
        if (var2 != null) {
          return var2;
        } else {
          var3 = rw.field_l.a(0, param0, (byte) 13);
          var2 = new sr();
          if (var3 != null) {
            var2.a(param0, new ds(var3), (byte) 11);
            us.field_d.a(var2, (long)param0, (byte) -117);
            return var2;
          } else {
            us.field_d.a(var2, (long)param0, (byte) -117);
            return var2;
          }
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
              if (param1 <= -119) {
                break L1;
              } else {
                field_o = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = new nc(frb.a(123, 74));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("jm.A(");

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

    jm(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static String a(byte param0, String param1, int param2) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_7_0 = null;
        String stackIn_10_0 = null;
        String stackIn_14_0 = null;
        String stackIn_18_0 = null;
        String stackIn_21_0 = null;
        String stackIn_25_0 = null;
        String stackIn_29_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 != 3) {
              L1: {
                if (param0 < -113) {
                  break L1;
                } else {
                  field_o = (String) null;
                  break L1;
                }
              }
              if ((param2 ^ -1) != -7) {
                if ((param2 ^ -1) != -8) {
                  if (8 == param2) {
                    stackIn_14_0 = fha.field_q;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (param2 == 9) {
                      stackIn_18_0 = sla.field_o;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if ((param2 ^ -1) != -11) {
                        if ((param2 ^ -1) == -12) {
                          stackIn_25_0 = qia.field_p;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          if (-15 == (param2 ^ -1)) {
                            stackIn_29_0 = isa.a(gwa.field_p, new String[]{param1}, 119);
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            return null;
                          }
                        }
                      } else {
                        stackIn_21_0 = mlb.field_p;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    }
                  }
                } else {
                  stackIn_10_0 = lra.field_o;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_7_0 = tda.field_O;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = kg.field_q;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_33_0 = (RuntimeException) (var3);

            stackIn_33_1 = new StringBuilder().append("jm.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L2;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_18_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_21_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_25_0;
                    } else {
                      return stackIn_29_0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    static {
        field_o = "Month";
    }
}
