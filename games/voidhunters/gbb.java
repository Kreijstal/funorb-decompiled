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
        si.a(159, 62, param0[0].a(106));
        if (param1 > -119) {
          field_q = 105;
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    final static boolean a(int param0, int param1, int param2, byte param3) {
        int var4 = 0;
        int stackIn_11_0 = 0;
        int stackIn_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
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
                      if (pma.field_o == -12) {
                        break L0;
                      } else {
                        if (-81 != pma.field_o) {
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
                    stackOut_45_0 = 0;
                    stackIn_46_0 = stackOut_45_0;
                    break L1;
                  } else {
                    stackOut_44_0 = 1;
                    stackIn_46_0 = stackOut_44_0;
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
                        if (pma.field_o == -12) {
                          break L5;
                        } else {
                          if (-81 != pma.field_o) {
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
                      stackOut_10_0 = 0;
                      stackIn_11_0 = stackOut_10_0;
                      break L6;
                    } else {
                      stackOut_9_0 = 1;
                      stackIn_11_0 = stackOut_9_0;
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
        L0: {
          if (null != param0.field_d) {
            param0.d((byte) -35);
            break L0;
          } else {
            break L0;
          }
        }
        param0.field_e = param1.field_e;
        param0.field_d = param1;
        param0.field_d.field_e = param0;
        if (param2 != -68) {
          boolean discarded$2 = gbb.a(12, 69, 48, (byte) 94);
          param0.field_e.field_d = param0;
          return;
        } else {
          param0.field_e.field_d = param0;
          return;
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
