/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class af extends sa {
    static mn field_cb;
    static String field_ab;
    static int field_Z;
    static String field_bb;
    static String field_U;

    final void a(mn param0, double param1, int param2, vg param3, oi param4) {
        if (param2 >= -5) {
            return;
        }
        if (!(!((af) this).field_N)) {
            return;
        }
        ((af) this).a(ri.field_c, ((af) this).field_S, param4, (byte) 64, param1, param0, param3, 128);
    }

    af(hn param0, ee param1, da param2) {
        super(param0, param1, param2, 0.2, 0.03, 16.0);
        kj.a(rd.field_Hb, 96, (pm) (Object) param1);
    }

    public static void i(byte param0) {
        field_bb = null;
        field_cb = null;
        if (param0 > -59) {
            return;
        }
        field_ab = null;
        field_U = null;
    }

    final static java.awt.Frame a(int param0, int param1, int param2, int param3, df param4, int param5) {
        tl[] var6 = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        tl[] var10 = null;
        bc var11 = null;
        var9 = Confined.field_J ? 1 : 0;
        if (param4.c(-121)) {
          L0: {
            if (-1 == (param0 ^ -1)) {
              var10 = hh.a(param4, 94);
              var6 = var10;
              if (var6 != null) {
                var7_int = 0;
                var8 = 0;
                L1: while (true) {
                  if (var8 >= var10.length) {
                    if (var7_int != 0) {
                      break L0;
                    } else {
                      return null;
                    }
                  } else {
                    if (param3 == var10[var8].field_j) {
                      if (var10[var8].field_c == param1) {
                        L2: {
                          if (param2 == 0) {
                            break L2;
                          } else {
                            if (param2 == var10[var8].field_k) {
                              break L2;
                            } else {
                              var8++;
                              continue L1;
                            }
                          }
                        }
                        L3: {
                          if (var7_int == 0) {
                            break L3;
                          } else {
                            if (var10[var8].field_h > param0) {
                              break L3;
                            } else {
                              var8++;
                              continue L1;
                            }
                          }
                        }
                        param0 = var10[var8].field_h;
                        var7_int = 1;
                        var8++;
                        continue L1;
                      } else {
                        var8++;
                        continue L1;
                      }
                    } else {
                      var8++;
                      continue L1;
                    }
                  }
                }
              } else {
                return null;
              }
            } else {
              break L0;
            }
          }
          if (param5 == 23221) {
            var11 = param4.a((byte) -101, param3, param2, param0, param1);
            L4: while (true) {
              if (0 != var11.field_g) {
                var7 = (java.awt.Frame) var11.field_f;
                if (var7 != null) {
                  if ((var11.field_g ^ -1) == -3) {
                    si.a(var7, param4, true);
                    return null;
                  } else {
                    return var7;
                  }
                } else {
                  return null;
                }
              } else {
                jd.a(1, 10L);
                continue L4;
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final void g(int param0) {
        ka discarded$7 = ((af) this).a((byte) -123, da.field_g, 1.5);
        if (param0 != 26402) {
            ((af) this).g(55);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_bb = "<col=FFFFFF>Nuclear missiles:</col> awarded after every boss.";
        field_cb = new mn();
        field_U = "Loading sound effects";
    }
}
