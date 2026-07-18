/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gbb extends rqa {
    static int field_o;
    static int field_q;
    static String field_p;

    gbb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

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
              si.a(159, 62, param0[0].a(106));
              if (param1 <= -119) {
                break L1;
              } else {
                field_q = 105;
                break L1;
              }
            }
            stackOut_2_0 = new nc((Object) (Object) "void");
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("gbb.A(");
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

    final static boolean a() {
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackIn_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (wga.field_a == null) {
          if (!fva.field_p) {
            L0: {
              if (uga.field_d) {
                break L0;
              } else {
                if (9 == pma.field_o) {
                  break L0;
                } else {
                  if (pma.field_o == 10) {
                    break L0;
                  } else {
                    if (pma.field_o == 11) {
                      break L0;
                    } else {
                      if (pma.field_o != 80) {
                        return false;
                      } else {
                        if (lmb.a(118)) {
                          fva.field_p = true;
                          return true;
                        } else {
                          return false;
                        }
                      }
                    }
                  }
                }
              }
            }
            return ic.a(13, -9307, 15);
          } else {
            if (lmb.a(-115)) {
              L1: {
                if (!tl.b(12, 13, -85)) {
                  stackOut_41_0 = 0;
                  stackIn_42_0 = stackOut_41_0;
                  break L1;
                } else {
                  stackOut_40_0 = 1;
                  stackIn_42_0 = stackOut_40_0;
                  break L1;
                }
              }
              L2: {
                L3: {
                  var4 = stackIn_42_0;
                  if (pma.field_o == 80) {
                    break L3;
                  } else {
                    if (84 == pma.field_o) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                var4 = 1;
                fva.field_p = false;
                break L2;
              }
              L4: {
                if (pma.field_o == 13) {
                  int discarded$4 = 26718;
                  dr.a();
                  var4 = 1;
                  fva.field_p = false;
                  break L4;
                } else {
                  break L4;
                }
              }
              return var4 != 0;
            } else {
              return false;
            }
          }
        } else {
          if (pma.field_o == 13) {
            wga.field_a = null;
            return true;
          } else {
            if (!fva.field_p) {
              if (!uga.field_d) {
                if (9 != pma.field_o) {
                  L5: {
                    if (pma.field_o == 10) {
                      break L5;
                    } else {
                      if (pma.field_o == 11) {
                        break L5;
                      } else {
                        if (pma.field_o != 80) {
                          return false;
                        } else {
                          if (lmb.a(118)) {
                            fva.field_p = true;
                            return true;
                          } else {
                            return false;
                          }
                        }
                      }
                    }
                  }
                  return ic.a(13, -9307, 15);
                } else {
                  return ic.a(13, -9307, 15);
                }
              } else {
                return ic.a(13, -9307, 15);
              }
            } else {
              if (lmb.a(-115)) {
                L6: {
                  if (!tl.b(12, 13, -85)) {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    break L6;
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    break L6;
                  }
                }
                var4 = stackIn_8_0;
                if (pma.field_o == 80) {
                  L7: {
                    var4 = 1;
                    fva.field_p = false;
                    if (pma.field_o == 13) {
                      int discarded$5 = 26718;
                      dr.a();
                      var4 = 1;
                      fva.field_p = false;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  return var4 != 0;
                } else {
                  if (84 == pma.field_o) {
                    L8: {
                      var4 = 1;
                      fva.field_p = false;
                      if (pma.field_o == 13) {
                        int discarded$6 = 26718;
                        dr.a();
                        var4 = 1;
                        fva.field_p = false;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    return var4 != 0;
                  } else {
                    L9: {
                      if (pma.field_o == 13) {
                        int discarded$7 = 26718;
                        dr.a();
                        var4 = 1;
                        fva.field_p = false;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    return var4 != 0;
                  }
                }
              } else {
                return false;
              }
            }
          }
        }
    }

    final static void a(fh param0, fh param1) {
        try {
            if (!(null == param0.field_d)) {
                param0.d((byte) -35);
            }
            param0.field_e = param1.field_e;
            param0.field_d = param1;
            param0.field_d.field_e = param0;
            param0.field_e.field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "gbb.D(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + -68 + ')');
        }
    }

    public static void b(boolean param0) {
        field_p = null;
        if (!param0) {
            field_o = 71;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 256;
        field_p = "Only show game chat from my friends";
    }
}
