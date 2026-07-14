/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ok implements jm {
    static ta field_b;
    private long field_c;
    static String[][] field_d;
    static String field_a;

    public final void c(int param0) {
        if (param0 != -11) {
            return;
        }
        ((ok) this).field_c = sf.a((byte) -87);
    }

    public final ag b(int param0) {
        if (param0 != 24595) {
            ((ok) this).field_c = 39L;
            if (((ok) this).a(false)) {
                return ke.field_W;
            }
            if (!(sf.a((byte) 105) >= 350L + ((ok) this).field_c)) {
                return nn.field_f;
            }
            return ((ok) this).b(false);
        }
        if (((ok) this).a(false)) {
            return ke.field_W;
        }
        if (!(sf.a((byte) 105) >= 350L + ((ok) this).field_c)) {
            return nn.field_f;
        }
        return ((ok) this).b(false);
    }

    public final String a(int param0) {
        if (!((ok) this).a(false)) {
          if ((sf.a((byte) 107) ^ -1L) <= (((ok) this).field_c + 350L ^ -1L)) {
            if (param0 != 7320) {
              return null;
            } else {
              return ((ok) this).e(96);
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    abstract ag b(boolean param0);

    final static boolean a(int param0, CharSequence param1, boolean param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = MinerDisturbance.field_ab;
        if (param1 == null) {
          return false;
        } else {
          var3 = param1.length();
          if ((var3 ^ -1) <= -2) {
            if (12 >= var3) {
              var4 = cl.a(-95, param1);
              if (var4 == null) {
                return false;
              } else {
                if (1 <= var4.length()) {
                  if (ra.a(121, var4.charAt(0))) {
                    return false;
                  } else {
                    if (!ra.a(119, var4.charAt(var4.length() - 1))) {
                      var5 = 0;
                      var6 = 0;
                      L0: while (true) {
                        if (param1.length() <= var6) {
                          var7 = -108 % ((-14 - param0) / 55);
                          if (var5 <= 0) {
                            return true;
                          } else {
                            return false;
                          }
                        } else {
                          L1: {
                            var7 = param1.charAt(var6);
                            if (!ra.a(117, (char) var7)) {
                              var5 = 0;
                              break L1;
                            } else {
                              var5++;
                              break L1;
                            }
                          }
                          if (2 > var5) {
                            var6++;
                            var6++;
                            continue L0;
                          } else {
                            if (!param2) {
                              return false;
                            } else {
                              var6++;
                              continue L0;
                            }
                          }
                        }
                      }
                    } else {
                      return false;
                    }
                  }
                } else {
                  return false;
                }
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    public static void d(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 1627) {
          field_d = null;
          field_d = null;
          return;
        } else {
          field_d = null;
          return;
        }
    }

    abstract String e(int param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new ta();
        field_d = new String[][]{null, new String[1]};
        field_a = "A Miner and a Survivor";
    }
}
