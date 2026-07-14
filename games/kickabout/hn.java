/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hn extends gn {
    static java.math.BigInteger field_h;
    int field_i;
    int[] field_g;
    static String field_e;
    static ut field_f;

    public final String toString() {
        String var2 = null;
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        String var6 = null;
        StringBuilder var7 = null;
        var4 = Kickabout.field_G;
        var7 = new StringBuilder(" (Delta: ");
        if (0 != ((hn) this).field_i) {
          if (-2 != (((hn) this).field_i ^ -1)) {
            if (2 != ((hn) this).field_i) {
              if (((hn) this).field_i != 3) {
                if (4 != ((hn) this).field_i) {
                  if (5 != ((hn) this).field_i) {
                    if (((hn) this).field_i != 6) {
                      if (7 != ((hn) this).field_i) {
                        if ((((hn) this).field_i ^ -1) != -9) {
                          if (9 != ((hn) this).field_i) {
                            StringBuilder discarded$39 = var7.append(")");
                            return var7.toString();
                          } else {
                            var2 = "[";
                            var5 = var2;
                            var2 = var5;
                            var3 = 0;
                            L0: while (true) {
                              if (((hn) this).field_g.length <= var3) {
                                var6 = var2 + "]";
                                StringBuilder discarded$40 = var7.append("Changed Render Order to " + var6);
                                StringBuilder discarded$41 = var7.append(")");
                                return var7.toString();
                              } else {
                                var5 = var2 + Integer.toString(((hn) this).field_g[var3]);
                                var2 = var5;
                                var2 = var5;
                                if (var3 != ((hn) this).field_g.length - 1) {
                                  var2 = var5 + ",";
                                  var3++;
                                  continue L0;
                                } else {
                                  var3++;
                                  continue L0;
                                }
                              }
                            }
                          }
                        } else {
                          StringBuilder discarded$42 = var7.append("Selected Stadium Surface " + ((hn) this).field_g[0] + ", Tier " + ((hn) this).field_g[1]);
                          StringBuilder discarded$43 = var7.append(")");
                          return var7.toString();
                        }
                      } else {
                        StringBuilder discarded$44 = var7.append("Bought Stadium Surface " + ((hn) this).field_g[0] + ", Tier " + ((hn) this).field_g[1]);
                        StringBuilder discarded$45 = var7.append(")");
                        return var7.toString();
                      }
                    } else {
                      StringBuilder discarded$46 = var7.append("Selected Secondary Colour " + ((hn) this).field_g[0]);
                      StringBuilder discarded$47 = var7.append(")");
                      return var7.toString();
                    }
                  } else {
                    StringBuilder discarded$48 = var7.append("Selected Primary Colour " + ((hn) this).field_g[0]);
                    StringBuilder discarded$49 = var7.append(")");
                    return var7.toString();
                  }
                } else {
                  StringBuilder discarded$50 = var7.append("Selected Kit " + ((hn) this).field_g[0]);
                  StringBuilder discarded$51 = var7.append(")");
                  return var7.toString();
                }
              } else {
                L1: {
                  var2 = "POW";
                  if (1 != ((hn) this).field_g[1]) {
                    break L1;
                  } else {
                    var2 = "SPD";
                    break L1;
                  }
                }
                L2: {
                  if (2 == ((hn) this).field_g[1]) {
                    var2 = "TCK";
                    break L2;
                  } else {
                    break L2;
                  }
                }
                StringBuilder discarded$52 = var7.append("Levelled up player " + ((hn) this).field_g[0] + ", stat: " + var2);
                StringBuilder discarded$53 = var7.append(")");
                return var7.toString();
              }
            } else {
              StringBuilder discarded$54 = var7.append("Bought a trinket for player " + ((hn) this).field_g[0] + ", slot " + ((hn) this).field_g[1] + ", trinket id" + ((hn) this).field_g[2]);
              StringBuilder discarded$55 = var7.append(")");
              return var7.toString();
            }
          } else {
            StringBuilder discarded$56 = var7.append("Sold Player " + ((hn) this).field_g[0]);
            StringBuilder discarded$57 = var7.append(")");
            return var7.toString();
          }
        } else {
          StringBuilder discarded$58 = var7.append("Bought Player from shop " + (((hn) this).field_g[0] - 1) + ", index " + ((hn) this).field_g[1]);
          StringBuilder discarded$59 = var7.append(")");
          return var7.toString();
        }
    }

    final void a(int param0, iw param1) {
        int var3 = 0;
        int var4 = Kickabout.field_G;
        param1.a(123, param0);
        param1.a(113, ((hn) this).field_i);
        for (var3 = 0; ((hn) this).field_g.length > var3; var3++) {
            param1.a(param0 ^ 125, ((hn) this).field_g[var3]);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, String param6) {
        int var7 = un.field_d.a(param6) - -15;
        pt.a(10, -22914, 0, 480, 0);
        on.a(param3 - var7, param4 - 17, var7 + 20, 21, param0, 65793, 128);
        ta.e(123);
        pt.a(param3, -22914, 0, 480, 0);
        on.a(-var7 + param3, param4 - 17, 20 + var7, 21, 8, param1, param2);
        ta.e(param0 + 113);
        un.field_d.c(param6, param3, param4, param5, -1);
    }

    final boolean a(hn param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = Kickabout.field_G;
        if (param0.field_i == ((hn) this).field_i) {
          if (((hn) this).field_g.length != param0.field_g.length) {
            return false;
          } else {
            var3 = 0;
            L0: while (true) {
              if (((hn) this).field_g.length <= var3) {
                if (param1 < 109) {
                  ((hn) this).field_g = null;
                  return true;
                } else {
                  return true;
                }
              } else {
                if (((hn) this).field_g[var3] == param0.field_g[var3]) {
                  var3++;
                  continue L0;
                } else {
                  return false;
                }
              }
            }
          }
        } else {
          return false;
        }
    }

    final static String a(String param0, String param1, int param2, sj param3) {
        Object var5 = null;
        if (!param3.d(-55)) {
          return param1;
        } else {
          if (param2 > -9) {
            var5 = null;
            String discarded$2 = hn.a((String) null, (String) null, 74, (sj) null);
            return param0 + " - " + param3.e(-8185) + "%";
          } else {
            return param0 + " - " + param3.e(-8185) + "%";
          }
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_f = null;
        field_h = null;
        if (param0 < 113) {
            field_e = null;
        }
    }

    hn(int param0, int[] param1) {
        ((hn) this).field_g = param1;
        ((hn) this).field_i = param0;
        if (qk.field_E[((hn) this).field_i] != ((hn) this).field_g.length) {
            throw new IllegalStateException();
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        field_e = "Quit";
    }
}
