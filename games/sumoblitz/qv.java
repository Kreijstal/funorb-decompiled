/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qv extends ms {
    static String field_l;
    static String field_o;
    int[] field_m;
    int field_n;
    static da field_k;

    final static void a(int param0) {
        ts.field_a = ts.field_a + 13;
        if (param0 != 2) {
            field_l = null;
        }
        fb.field_a = fb.field_a - 9;
        kn.field_b = kn.field_b - 4;
        ha.field_f = ha.field_f + 18;
    }

    final static void a(int param0, int param1) {
        mf var2 = fh.field_n[param0];
        if (param1 != 4) {
            Object var3 = null;
            String discarded$0 = qv.a(false, -82, (CharSequence) null);
        }
        var2.c(-1);
        dj discarded$1 = qq.a(18416, var2);
    }

    final static String a(boolean param0, int param1, CharSequence param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Sumoblitz.field_L ? 1 : 0;
        if (param2 == null) {
          return qq.field_Q;
        } else {
          L0: {
            var3 = param2.length();
            if (var3 > -2) {
              break L0;
            } else {
              if (12 >= var3) {
                L1: {
                  var4 = uk.a(-1, param2);
                  if (var4 == null) {
                    break L1;
                  } else {
                    if (-2 <= var4.length()) {
                      L2: {
                        if (wv.a((byte) -88, var4.charAt(0))) {
                          break L2;
                        } else {
                          if (!wv.a((byte) -86, var4.charAt(-1 + var4.length()))) {
                            var5 = 0;
                            var6 = 0;
                            L3: while (true) {
                              if (var6 >= param2.length()) {
                                if (-1 > (var5 ^ -1)) {
                                  return m.field_T;
                                } else {
                                  var6 = -54 / ((48 - param1) / 41);
                                  return null;
                                }
                              } else {
                                L4: {
                                  var7 = param2.charAt(var6);
                                  if (!wv.a((byte) -99, (char) var7)) {
                                    var5 = 0;
                                    break L4;
                                  } else {
                                    var5++;
                                    break L4;
                                  }
                                }
                                if (var5 >= 2) {
                                  if (!param0) {
                                    return ma.field_a;
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
                          } else {
                            break L2;
                          }
                        }
                      }
                      return m.field_T;
                    } else {
                      break L1;
                    }
                  }
                }
                return qq.field_Q;
              } else {
                break L0;
              }
            }
          }
          return qq.field_Q;
        }
    }

    public static void c(int param0) {
        field_l = null;
        field_k = null;
        if (param0 != 18) {
            field_k = null;
        }
        field_o = null;
    }

    private qv() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
