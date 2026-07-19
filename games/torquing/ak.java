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
            return (t[]) null;
        }
        return wf.a(param2, param0, 1, param1, (byte) 106);
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 > 7) {
            return;
        }
        this.field_i = 102;
    }

    ak(int param0, int param1, int param2, int param3, int param4, int param5) {
        super(-1, param4, param5);
        this.field_l = param3;
        this.field_j = param2;
        this.field_i = param0;
        this.field_g = param1;
    }

    final static boolean c(int param0) {
        int fieldTemp$3 = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        var2 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (i.field_P.length == po.field_z) {
                po.field_z = -1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == -85) {
                break L2;
              } else {
                field_h = (String) null;
                break L2;
              }
            }
            L3: while (true) {
              L4: {
                fieldTemp$3 = po.field_z + 1;
                po.field_z = po.field_z + 1;
                if (fieldTemp$3 >= i.field_P.length) {
                  break L4;
                } else {
                  if (i.field_P[po.field_z]) {
                    L5: {
                      if ((po.field_z ^ -1) == -14) {
                        break L5;
                      } else {
                        if (-85 == (po.field_z ^ -1)) {
                          break L5;
                        } else {
                          if (83 == po.field_z) {
                            break L5;
                          } else {
                            if ((po.field_z ^ -1) == -82) {
                              break L5;
                            } else {
                              if (-81 == (po.field_z ^ -1)) {
                                break L5;
                              } else {
                                if (r.field_b[po.field_z] == un.field_i) {
                                  continue L3;
                                } else {
                                  r.field_b[po.field_z] = rn.field_e;
                                  break L4;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    if (r.field_b[po.field_z] == nn.field_b) {
                      r.field_b[po.field_z] = rn.field_e;
                      break L4;
                    } else {
                      continue L3;
                    }
                  } else {
                    r.field_b[po.field_z] = nn.field_b;
                    continue L3;
                  }
                }
              }
              L6: {
                if (po.field_z >= i.field_P.length) {
                  stackOut_21_0 = 0;
                  stackIn_22_0 = stackOut_21_0;
                  break L6;
                } else {
                  stackOut_20_0 = 1;
                  stackIn_22_0 = stackOut_20_0;
                  break L6;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var1), "ak.B(" + param0 + ')');
        }
        return stackIn_22_0 != 0;
    }

    final void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var4 = this.field_i * param1 >> 615189964;
        if (param2 != 106) {
          return;
        } else {
          var5 = param1 * this.field_j >> -2081938708;
          var6 = this.field_g * param0 >> 1213719372;
          var7 = this.field_l * param0 >> 1566135308;
          um.a(var4, this.field_c, var6, var5, var7, false);
          return;
        }
    }

    public static void b(int param0) {
        t[] discarded$0 = null;
        if (param0 != -1507) {
            discarded$0 = ak.a(-101, -57, 63, (byte) -67);
            field_h = null;
            return;
        }
        field_h = null;
    }

    static {
        field_h = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }
}
