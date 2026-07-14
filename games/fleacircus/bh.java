/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh extends lh {
    static int field_l;
    int field_m;
    static String[] field_u;
    int field_r;
    int field_o;
    static String field_n;
    static long[] field_q;
    int field_v;
    int field_s;
    int field_i;
    int field_j;
    long field_k;
    static int field_t;
    int[] field_p;

    final static void a(boolean param0, java.applet.Applet param1) {
        if (param0) {
            field_q = null;
        }
        String var2 = param1.getParameter("username");
        if (var2 != null) {
            CharSequence var3 = (CharSequence) (Object) var2;
            // ifne L45
        }
        return;
    }

    final static boolean a(byte param0, boolean param1, CharSequence param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = fleas.field_A ? 1 : 0;
        if (param2 == null) {
          return false;
        } else {
          if (param0 > 77) {
            L0: {
              var3 = param2.length();
              if (1 > var3) {
                break L0;
              } else {
                if ((var3 ^ -1) < -13) {
                  break L0;
                } else {
                  L1: {
                    var4 = uk.a(12, param2);
                    if (var4 == null) {
                      break L1;
                    } else {
                      if (1 > var4.length()) {
                        break L1;
                      } else {
                        if (r.a(var4.charAt(0), -108)) {
                          return false;
                        } else {
                          if (!r.a(var4.charAt(var4.length() - 1), -77)) {
                            var5 = 0;
                            var6 = 0;
                            L2: while (true) {
                              if (var6 >= param2.length()) {
                                if ((var5 ^ -1) >= -1) {
                                  return true;
                                } else {
                                  return false;
                                }
                              } else {
                                L3: {
                                  var7 = param2.charAt(var6);
                                  if (!r.a((char) var7, -55)) {
                                    var5 = 0;
                                    break L3;
                                  } else {
                                    var5++;
                                    break L3;
                                  }
                                }
                                if (-3 >= (var5 ^ -1)) {
                                  if (!param1) {
                                    return false;
                                  } else {
                                    var6++;
                                    continue L2;
                                  }
                                } else {
                                  var6++;
                                  continue L2;
                                }
                              }
                            }
                          } else {
                            return false;
                          }
                        }
                      }
                    }
                  }
                  return false;
                }
              }
            }
            return false;
          } else {
            return true;
          }
        }
    }

    public static void a(int param0) {
        if (param0 > -125) {
            field_q = null;
        }
        field_u = null;
        field_n = null;
        field_q = null;
    }

    bh(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        ((bh) this).field_j = param2;
        ((bh) this).field_i = param1;
        pg.field_e = pg.field_e + 1;
        ((bh) this).field_s = 65535 & pg.field_e;
        ((bh) this).field_v = param4;
        ((bh) this).field_m = param5;
        ((bh) this).field_p = param6;
        ((bh) this).field_r = param3;
        ((bh) this).field_o = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new String[]{"Congratulations!", "You have completed", "Flea Circus!"};
        field_n = "No highscores";
        field_q = new long[32];
    }
}
