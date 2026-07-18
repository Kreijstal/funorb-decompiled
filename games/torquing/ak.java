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

    final static boolean c() {
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        var2 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (~i.field_P.length == ~po.field_z) {
                po.field_z = -1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                int fieldTemp$3 = po.field_z + 1;
                po.field_z = po.field_z + 1;
                if (~fieldTemp$3 <= ~i.field_P.length) {
                  break L3;
                } else {
                  if (i.field_P[po.field_z]) {
                    L4: {
                      if (po.field_z == 13) {
                        break L4;
                      } else {
                        if (po.field_z == 84) {
                          break L4;
                        } else {
                          if (83 == po.field_z) {
                            break L4;
                          } else {
                            if (po.field_z == 81) {
                              break L4;
                            } else {
                              if (po.field_z == 80) {
                                break L4;
                              } else {
                                if (r.field_b[po.field_z] == un.field_i) {
                                  continue L2;
                                } else {
                                  r.field_b[po.field_z] = rn.field_e;
                                  break L3;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    if (~r.field_b[po.field_z] == ~nn.field_b) {
                      r.field_b[po.field_z] = rn.field_e;
                      break L3;
                    } else {
                      continue L2;
                    }
                  } else {
                    r.field_b[po.field_z] = nn.field_b;
                    continue L2;
                  }
                }
              }
              L5: {
                if (~po.field_z <= ~i.field_P.length) {
                  stackOut_19_0 = 0;
                  stackIn_20_0 = stackOut_19_0;
                  break L5;
                } else {
                  stackOut_18_0 = 1;
                  stackIn_20_0 = stackOut_18_0;
                  break L5;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var1, "ak.B(" + -85 + ')');
        }
        return stackIn_20_0 != 0;
    }

    final void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var4 = ((ak) this).field_i * param1 >> 12;
        if (param2 != 106) {
          return;
        } else {
          var5 = param1 * ((ak) this).field_j >> 12;
          var6 = ((ak) this).field_g * param0 >> 12;
          var7 = ((ak) this).field_l * param0 >> 12;
          um.a(var4, ((ak) this).field_c, var6, var5, var7, false);
          return;
        }
    }

    public static void b() {
        field_h = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }
}
