/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb extends vd implements qk {
    private ph field_H;
    private ph field_G;
    static bd field_J;
    private ph field_K;
    static java.math.BigInteger field_L;
    static bd field_E;
    static int field_I;
    static gg field_F;

    final static int j() {
        if (pb.field_Kb < 2) {
          return 0;
        } else {
          if (nl.field_c == 0) {
            if (im.field_c.a(-15879)) {
              if (im.field_c.a(-8088, "commonui")) {
                if (mb.field_m.a(-15879)) {
                  if (!mb.field_m.a(-8088, "commonui")) {
                    return 60;
                  } else {
                    if (ll.field_b.a(-15879)) {
                      if (ll.field_b.e(0)) {
                        return 100;
                      } else {
                        return 80;
                      }
                    } else {
                      return 70;
                    }
                  }
                } else {
                  return 50;
                }
              } else {
                return 40;
              }
            } else {
              return 20;
            }
          } else {
            if (vc.field_d != null) {
              if (vc.field_d.a(-15879)) {
                if (!vc.field_d.a("", (byte) 115)) {
                  return 29;
                } else {
                  if (vc.field_d.a(-8088, "")) {
                    if (!im.field_c.a(-15879)) {
                      return 43;
                    } else {
                      if (!im.field_c.a(-8088, "commonui")) {
                        return 57;
                      } else {
                        if (mb.field_m.a(-15879)) {
                          if (mb.field_m.a(-8088, "commonui")) {
                            if (!ll.field_b.a(-15879)) {
                              return 82;
                            } else {
                              if (!ll.field_b.e(0)) {
                                return 86;
                              } else {
                                return 100;
                              }
                            }
                          } else {
                            return 80;
                          }
                        } else {
                          return 71;
                        }
                      }
                    }
                  } else {
                    return 29;
                  }
                }
              } else {
                return 14;
              }
            } else {
              if (!im.field_c.a(-15879)) {
                return 43;
              } else {
                if (!im.field_c.a(-8088, "commonui")) {
                  return 57;
                } else {
                  if (mb.field_m.a(-15879)) {
                    if (mb.field_m.a(-8088, "commonui")) {
                      if (!ll.field_b.a(-15879)) {
                        return 82;
                      } else {
                        if (ll.field_b.e(0)) {
                          return 100;
                        } else {
                          return 86;
                        }
                      }
                    } else {
                      return 80;
                    }
                  } else {
                    return 71;
                  }
                }
              }
            }
          }
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        var5 = param1 + ((nb) this).field_v;
        var6 = param0 + ((nb) this).field_m;
        int discarded$2 = jd.field_s.a(jn.field_K, var5 + 20, 20 + var6, ((nb) this).field_s + -40, -50 + ((nb) this).field_x, 16777215, -1, 1, 0, jd.field_s.field_y);
        super.a(param0, param1, (byte) 106, param3);
        if (param2 < 42) {
          var7 = null;
          ((nb) this).a(4, -115, 34, (ph) null, (byte) 88);
          return;
        } else {
          return;
        }
    }

    final boolean a(int param0, ag param1, int param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_8_0 = false;
        boolean stackOut_4_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3)) {
              if (param2 != 98) {
                if (99 == param2) {
                  stackOut_8_0 = ((nb) this).b((byte) 122, param1);
                  stackIn_9_0 = stackOut_8_0;
                  break L0;
                } else {
                  return false;
                }
              } else {
                stackOut_4_0 = ((nb) this).a(param1, (byte) -124);
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("nb.F(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L1;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_9_0;
    }

    public nb() {
        super(0, 0, 476, 225, (nn) null);
        ((nb) this).field_G = new ph(kc.field_f, (mh) null);
        ((nb) this).field_H = new ph(dk.field_l, (mh) null);
        ((nb) this).field_K = new ph(ej.field_n, (mh) null);
        ke var1 = new ke();
        ((nb) this).field_G.field_h = (nn) (Object) var1;
        ((nb) this).field_H.field_h = (nn) (Object) var1;
        ((nb) this).field_K.field_h = (nn) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 - var2 >> 1;
        ((nb) this).field_H.a(var4, -var2 + (-48 + ((nb) this).field_x), 0, -var3 + ((nb) this).field_s >> 1, 30);
        ((nb) this).field_K.a(var4, -var2 + (((nb) this).field_x - 48), 0, var4 + ((-var3 + ((nb) this).field_s >> 1) + var2), 30);
        ((nb) this).field_G.a(var3, -(2 * var2) + (((nb) this).field_x + -78), 0, -var3 + ((nb) this).field_s >> 1, 30);
        ((nb) this).field_H.field_p = (mh) this;
        ((nb) this).field_G.field_p = (mh) this;
        ((nb) this).field_G.field_i = e.field_x;
        ((nb) this).field_K.field_p = (mh) this;
        ((nb) this).field_K.field_i = hk.field_l;
        ((nb) this).a(51448, (ag) (Object) ((nb) this).field_H);
        ((nb) this).a(51448, (ag) (Object) ((nb) this).field_G);
        ((nb) this).a(51448, (ag) (Object) ((nb) this).field_K);
    }

    public final void a(int param0, int param1, int param2, ph param3, byte param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var7 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var6_int = 17 / ((param4 - -63) / 52);
            if (param3 != ((nb) this).field_H) {
              if (((nb) this).field_G != param3) {
                if (param3 != ((nb) this).field_K) {
                  break L0;
                } else {
                  ci.a(-1);
                  return;
                }
              } else {
                gb.d(62);
                return;
              }
            } else {
              int discarded$2 = 5109;
              fa.a();
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var6;
            stackOut_8_1 = new StringBuilder().append("nb.E(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param4 + 41);
        }
    }

    public static void k() {
        field_F = null;
        field_J = null;
        field_L = null;
        field_E = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
    }
}
