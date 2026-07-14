/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh implements ad {
    static String field_d;
    static int field_e;
    static int field_a;
    static int field_c;
    static String field_b;

    final static Object a(byte param0, boolean param1, byte[] param2) {
        t var3 = null;
        if (param0 != 112) {
            field_e = 94;
        }
        if (param2 == null) {
            return null;
        }
        if (!(136 >= param2.length)) {
            var3 = new t();
            ((ni) (Object) var3).a((byte) -119, param2);
            return (Object) (Object) var3;
        }
        if (!param1) {
            return (Object) (Object) param2;
        }
        return (Object) (Object) kh.a(param2, (byte) -16);
    }

    public final void a(int param0, int param1, fe param2, int param3, boolean param4) {
        int var6 = param1 - -param2.field_u;
        int var7 = param2.field_t + param3;
        if (param0 != 12088) {
            return;
        }
        ng.a(param2.field_q, param2.field_v, 127, var6, var7);
        ea var8 = ed.field_g[1];
        if (param2 instanceof hc) {
            if (!(!((hc) (Object) param2).field_H)) {
                var8.g((-var8.field_x + param2.field_v >> 827505249) + 1 + var6, var7 - (-1 - (-var8.field_A + param2.field_q >> 213302753)), 256);
            }
        }
        if (!(!param2.k(73))) {
            se.c(2 + var6, 2, 2 + var7, param2.field_v - 4, param2.field_q + -4);
        }
    }

    final static String a(boolean param0, CharSequence param1, boolean param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = MinerDisturbance.field_ab;
        if (param1 == null) {
          return rd.field_c;
        } else {
          var3 = param1.length();
          if (!param2) {
            L0: {
              if ((var3 ^ -1) > -2) {
                break L0;
              } else {
                if (var3 > 12) {
                  break L0;
                } else {
                  L1: {
                    var4 = cl.a(-95, param1);
                    if (var4 == null) {
                      break L1;
                    } else {
                      if (var4.length() < 1) {
                        break L1;
                      } else {
                        L2: {
                          if (ra.a(118, var4.charAt(0))) {
                            break L2;
                          } else {
                            if (ra.a(117, var4.charAt(-1 + var4.length()))) {
                              break L2;
                            } else {
                              var5 = 0;
                              var6 = 0;
                              L3: while (true) {
                                if (var6 >= param1.length()) {
                                  if (0 < var5) {
                                    return vh.field_d;
                                  } else {
                                    return null;
                                  }
                                } else {
                                  L4: {
                                    var7 = param1.charAt(var6);
                                    if (!ra.a(116, (char) var7)) {
                                      var5 = 0;
                                      break L4;
                                    } else {
                                      var5++;
                                      break L4;
                                    }
                                  }
                                  if (var5 >= 2) {
                                    if (!param0) {
                                      return ra.field_a;
                                    } else {
                                      var6++;
                                      continue L3;
                                    }
                                  } else {
                                    var6++;
                                    continue L3;
                                  }
                                }
                              }
                            }
                          }
                        }
                        return vh.field_d;
                      }
                    }
                  }
                  return rd.field_c;
                }
              }
            }
            return rd.field_c;
          } else {
            return null;
          }
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (param2 != 1) {
            return;
        }
        vd.field_y = param0;
        h.field_b = param1;
    }

    public static void a(byte param0) {
        field_d = null;
        int var1 = 127 % ((param0 - 44) / 48);
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "The 3x multiplier gives you triple points! Skilled miners use this to get the best rankings. If you buy 2x AND 3x, they combine to a massive 6x multiplier!";
        field_a = -1;
        field_e = 0;
        field_c = 2;
        field_b = "Ranking: Mhor's Mickaxe mof Massive Mining Multraness";
    }
}
