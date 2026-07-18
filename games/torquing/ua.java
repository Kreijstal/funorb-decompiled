/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ua {
    static dn field_b;
    static java.math.BigInteger field_a;

    public static void a(int param0) {
        field_a = null;
        if (param0 != -6) {
            int discarded$0 = 0;
            int discarded$1 = ua.a();
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static int a() {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        var7 = Torquing.field_u;
        try {
          L0: {
            var1_int = 0;
            var2 = 0;
            L1: while (true) {
              int discarded$4 = -13;
              if (!np.a()) {
                L2: {
                  kb.field_g.a(true, qd.a(16452, n.field_t, k.field_e), qd.a(16452, wh.field_s, re.field_c));
                  if (!kb.field_g.f((byte) -60)) {
                    break L2;
                  } else {
                    var1_int = 1;
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var3 = 0;
                    if (var1_int == 0) {
                      break L4;
                    } else {
                      if (0 > kb.field_g.field_g) {
                        break L4;
                      } else {
                        var3 = di.field_e[kb.field_g.field_g];
                        if (var3 == 2) {
                          int discarded$5 = -68;
                          qo.g();
                          break L3;
                        } else {
                          if (var3 == 5) {
                            int discarded$6 = -68;
                            qo.g();
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  if (var2 == 0) {
                    break L3;
                  } else {
                    if (go.field_x == 2) {
                      break L3;
                    } else {
                      int discarded$7 = -68;
                      qo.g();
                      break L3;
                    }
                  }
                }
                L5: {
                  if (0 != var3) {
                    break L5;
                  } else {
                    if (go.field_x != 2) {
                      break L5;
                    } else {
                      var4 = km.b(-1) + -dc.field_c;
                      var6 = (int)((10999L - var4) / 1000L);
                      if (var6 <= 0) {
                        ka.a(5, true, (byte) -115);
                        var3 = 2;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                stackOut_24_0 = var3;
                stackIn_25_0 = stackOut_24_0;
                break L0;
              } else {
                L6: {
                  kb.field_g.a(0);
                  if (!kb.field_g.f((byte) -60)) {
                    break L6;
                  } else {
                    var1_int = 1;
                    break L6;
                  }
                }
                if (e.field_f != 13) {
                  continue L1;
                } else {
                  var2 = 1;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var1, "ua.B(" + false + ')');
        }
        return stackIn_25_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
    }
}
