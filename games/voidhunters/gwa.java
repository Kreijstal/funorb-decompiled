/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gwa extends rqa {
    static String field_p;
    static boolean field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -119) {
                break L1;
              } else {
                field_o = true;
                break L1;
              }
            }
            stackOut_2_0 = new nc((Object) (Object) frb.a(65, 126));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("gwa.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    gwa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, int param1, double param2, int param3, double param4) {
        int var8 = 0;
        var8 = VoidHunters.field_G;
        if (cd.field_c != 0) {
          if (param0 == 0) {
            L0: {
              mlb.field_q = null;
              cd.field_c = param0;
              aib.field_c = param4;
              if (rw.field_q != 0) {
                break L0;
              } else {
                if (param3 <= 0) {
                  break L0;
                } else {
                  bfa.field_o = new ij();
                  rw.field_q = param3;
                  npa.field_c = param2;
                  return;
                }
              }
            }
            if (param3 == 0) {
              bfa.field_o = null;
              rw.field_q = param3;
              npa.field_c = param2;
              return;
            } else {
              rw.field_q = param3;
              npa.field_c = param2;
              return;
            }
          } else {
            L1: {
              cd.field_c = param0;
              aib.field_c = param4;
              if (rw.field_q != 0) {
                break L1;
              } else {
                if (param3 <= 0) {
                  break L1;
                } else {
                  bfa.field_o = new ij();
                  rw.field_q = param3;
                  npa.field_c = param2;
                  return;
                }
              }
            }
            if (param3 == 0) {
              bfa.field_o = null;
              rw.field_q = param3;
              npa.field_c = param2;
              return;
            } else {
              rw.field_q = param3;
              npa.field_c = param2;
              return;
            }
          }
        } else {
          if (param0 > 0) {
            L2: {
              mlb.field_q = new ij();
              cd.field_c = param0;
              aib.field_c = param4;
              if (rw.field_q != 0) {
                break L2;
              } else {
                if (param3 <= 0) {
                  break L2;
                } else {
                  bfa.field_o = new ij();
                  rw.field_q = param3;
                  npa.field_c = param2;
                  return;
                }
              }
            }
            if (param3 == 0) {
              bfa.field_o = null;
              rw.field_q = param3;
              npa.field_c = param2;
              return;
            } else {
              rw.field_q = param3;
              npa.field_c = param2;
              return;
            }
          } else {
            if (param0 == 0) {
              mlb.field_q = null;
              cd.field_c = param0;
              aib.field_c = param4;
              if (rw.field_q == 0) {
                if (param3 > 0) {
                  bfa.field_o = new ij();
                  rw.field_q = param3;
                  npa.field_c = param2;
                  return;
                } else {
                  L3: {
                    if (param3 == 0) {
                      bfa.field_o = null;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  rw.field_q = param3;
                  npa.field_c = param2;
                  return;
                }
              } else {
                L4: {
                  if (param3 == 0) {
                    bfa.field_o = null;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                rw.field_q = param3;
                npa.field_c = param2;
                return;
              }
            } else {
              cd.field_c = param0;
              aib.field_c = param4;
              if (rw.field_q == 0) {
                if (param3 > 0) {
                  bfa.field_o = new ij();
                  rw.field_q = param3;
                  npa.field_c = param2;
                  return;
                } else {
                  L5: {
                    if (param3 == 0) {
                      bfa.field_o = null;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  rw.field_q = param3;
                  npa.field_c = param2;
                  return;
                }
              } else {
                L6: {
                  if (param3 == 0) {
                    bfa.field_o = null;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                rw.field_q = param3;
                npa.field_c = param2;
                return;
              }
            }
          }
        }
    }

    public static void b(boolean param0) {
        field_p = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "All players have left <%0>'s game.";
    }
}
