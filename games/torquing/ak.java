/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak extends kj {
    private int field_l;
    private int field_i;
    static long field_k;
    private int field_g;
    private int field_j;
    static String field_h;

    final void a(int param0, int param1, int param2) {
        if (param2 < -101) {
            return;
        }
        t[] discarded$0 = ak.a(-126, 108, 95, (byte) 69);
    }

    final static t[] a(int param0, int param1, int param2, byte param3) {
        if (param3 != -124) {
            return null;
        }
        return wf.a(param2, param0, 1, param1, (byte) 106);
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 > 7) {
            return;
        }
        ((ak) this).field_i = 102;
    }

    ak(int param0, int param1, int param2, int param3, int param4, int param5) {
        super(-1, param4, param5);
        ((ak) this).field_l = param3;
        ((ak) this).field_j = param2;
        ((ak) this).field_i = param0;
        ((ak) this).field_g = param1;
    }

    final static boolean c(int param0) {
        int var2 = 0;
        int stackIn_8_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          var2 = Torquing.field_u;
          if (i.field_P.length == po.field_z) {
            po.field_z = -1;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != -85) {
          field_h = null;
          L1: while (true) {
            po.field_z = po.field_z + 1;
            if (po.field_z + 1 < i.field_P.length) {
              if (i.field_P[po.field_z]) {
                L2: {
                  L3: {
                    if (po.field_z == -14) {
                      break L3;
                    } else {
                      if (-85 == po.field_z) {
                        break L3;
                      } else {
                        if (83 == po.field_z) {
                          break L3;
                        } else {
                          if (po.field_z == -82) {
                            break L3;
                          } else {
                            if (-81 == po.field_z) {
                              break L3;
                            } else {
                              if (r.field_b[po.field_z] == un.field_i) {
                                continue L1;
                              } else {
                                r.field_b[po.field_z] = rn.field_e;
                                break L2;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  if (r.field_b[po.field_z] == nn.field_b) {
                    r.field_b[po.field_z] = rn.field_e;
                    break L2;
                  } else {
                    continue L1;
                  }
                }
                L4: {
                  if (po.field_z >= i.field_P.length) {
                    stackOut_48_0 = 0;
                    stackIn_49_0 = stackOut_48_0;
                    break L4;
                  } else {
                    stackOut_47_0 = 1;
                    stackIn_49_0 = stackOut_47_0;
                    break L4;
                  }
                }
                return stackIn_49_0 != 0;
              } else {
                r.field_b[po.field_z] = nn.field_b;
                continue L1;
              }
            } else {
              L5: {
                if (po.field_z >= i.field_P.length) {
                  stackOut_31_0 = 0;
                  stackIn_32_0 = stackOut_31_0;
                  break L5;
                } else {
                  stackOut_30_0 = 1;
                  stackIn_32_0 = stackOut_30_0;
                  break L5;
                }
              }
              return stackIn_32_0 != 0;
            }
          }
        } else {
          L6: while (true) {
            po.field_z = po.field_z + 1;
            if (po.field_z + 1 < i.field_P.length) {
              if (i.field_P[po.field_z]) {
                L7: {
                  if (po.field_z == -14) {
                    break L7;
                  } else {
                    if (-85 == po.field_z) {
                      break L7;
                    } else {
                      if (83 == po.field_z) {
                        break L7;
                      } else {
                        if (po.field_z == -82) {
                          break L7;
                        } else {
                          if (-81 == po.field_z) {
                            break L7;
                          } else {
                            if (r.field_b[po.field_z] == un.field_i) {
                              continue L6;
                            } else {
                              L8: {
                                r.field_b[po.field_z] = rn.field_e;
                                if (po.field_z >= i.field_P.length) {
                                  stackOut_19_0 = 0;
                                  stackIn_20_0 = stackOut_19_0;
                                  break L8;
                                } else {
                                  stackOut_18_0 = 1;
                                  stackIn_20_0 = stackOut_18_0;
                                  break L8;
                                }
                              }
                              return stackIn_20_0 != 0;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                if (r.field_b[po.field_z] == nn.field_b) {
                  L9: {
                    r.field_b[po.field_z] = rn.field_e;
                    if (po.field_z >= i.field_P.length) {
                      stackOut_25_0 = 0;
                      stackIn_26_0 = stackOut_25_0;
                      break L9;
                    } else {
                      stackOut_24_0 = 1;
                      stackIn_26_0 = stackOut_24_0;
                      break L9;
                    }
                  }
                  return stackIn_26_0 != 0;
                } else {
                  continue L6;
                }
              } else {
                r.field_b[po.field_z] = nn.field_b;
                continue L6;
              }
            } else {
              L10: {
                if (po.field_z >= i.field_P.length) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L10;
                } else {
                  stackOut_6_0 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  break L10;
                }
              }
              return stackIn_8_0 != 0;
            }
          }
        }
    }

    final void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var4 = ((ak) this).field_i * param1 >> 615189964;
        if (param2 != 106) {
          return;
        } else {
          var5 = param1 * ((ak) this).field_j >> -2081938708;
          var6 = ((ak) this).field_g * param0 >> 1213719372;
          var7 = ((ak) this).field_l * param0 >> 1566135308;
          um.a(var4, ((ak) this).field_c, var6, var5, var7, false);
          return;
        }
    }

    public static void b(int param0) {
        if (param0 != -1507) {
            t[] discarded$0 = ak.a(-101, -57, 63, (byte) -67);
            field_h = null;
            return;
        }
        field_h = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }
}
