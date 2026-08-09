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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_3_0 = new nc("void");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("gbb.A(");

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

    final static boolean a(int param0, int param1, int param2, byte param3) {
        int var4;
        int stackIn_11_0 = 0;
        int stackIn_46_0 = 0;
        if (param3 == 23) {
          if (wga.field_a == null) {
            if (!fva.field_p) {
              L0: {
                if (uga.field_d) {
                  break L0;
                } else {
                  if (9 == pma.field_o) {
                    break L0;
                  } else {
                    if ((pma.field_o ^ -1) == -11) {
                      break L0;
                    } else {
                      if ((pma.field_o ^ -1) == -12) {
                        break L0;
                      } else {
                        if (-81 != (pma.field_o ^ -1)) {
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
              return ic.a(param0, -9307, param1);
            } else {
              if (lmb.a(-115)) {
                L1: {
                  if (!tl.b(param2, param0, -85)) {
                    stackIn_46_0 = 0;
                    break L1;
                  } else {
                    stackIn_46_0 = 1;
                    break L1;
                  }
                }
                L2: {
                  L3: {
                    var4 = stackIn_46_0;
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
                  if ((pma.field_o ^ -1) == -14) {
                    dr.a(26718);
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
            if (-14 != (pma.field_o ^ -1)) {
              if (!fva.field_p) {
                if (!uga.field_d) {
                  if (9 != pma.field_o) {
                    L5: {
                      if ((pma.field_o ^ -1) == -11) {
                        break L5;
                      } else {
                        if ((pma.field_o ^ -1) == -12) {
                          break L5;
                        } else {
                          if (-81 != (pma.field_o ^ -1)) {
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
                    return ic.a(param0, -9307, param1);
                  } else {
                    return ic.a(param0, -9307, param1);
                  }
                } else {
                  return ic.a(param0, -9307, param1);
                }
              } else {
                if (lmb.a(-115)) {
                  L6: {
                    if (!tl.b(param2, param0, -85)) {
                      stackIn_11_0 = 0;
                      break L6;
                    } else {
                      stackIn_11_0 = 1;
                      break L6;
                    }
                  }
                  var4 = stackIn_11_0;
                  if (pma.field_o != 80) {
                    if (84 != pma.field_o) {
                      L7: {
                        if ((pma.field_o ^ -1) == -14) {
                          dr.a(26718);
                          var4 = 1;
                          fva.field_p = false;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      return var4 != 0;
                    } else {
                      L8: {
                        var4 = 1;
                        fva.field_p = false;
                        if ((pma.field_o ^ -1) == -14) {
                          dr.a(26718);
                          var4 = 1;
                          fva.field_p = false;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      return var4 != 0;
                    }
                  } else {
                    L9: {
                      var4 = 1;
                      fva.field_p = false;
                      if ((pma.field_o ^ -1) == -14) {
                        dr.a(26718);
                        var4 = 1;
                        fva.field_p = false;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    return var4 != 0;
                  }
                } else {
                  return false;
                }
              }
            } else {
              wga.field_a = null;
              return true;
            }
          }
        } else {
          return true;
        }
    }

    final static void a(fh param0, fh param1, byte param2) {
        try {
            if (!(null == param0.field_d)) {
                param0.d((byte) -35);
            }
            param0.field_e = param1.field_e;
            param0.field_d = param1;
            param0.field_d.field_e = param0;
            if (param2 != -68) {
                gbb.a(12, 69, 48, (byte) 94);
            }
            param0.field_e.field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "gbb.D(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void b(boolean param0) {
        field_p = null;
        if (!param0) {
            field_o = 71;
        }
    }

    static {
        field_o = 256;
        field_p = "Only show game chat from my friends";
    }
}
