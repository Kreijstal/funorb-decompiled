/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb {
    static int field_a;
    static String field_c;
    static bi[][] field_d;
    static int[] field_b;

    final static boolean a(char param0, int param1) {
        int var2 = 101 / ((param1 - 30) / 59);
        if (param0 >= 32) {
            if (param0 <= 126) {
                return true;
            }
            if (param0 < 160) {
                if (param0 == 8364) {
                    return true;
                }
                if (param0 == 338) {
                    return true;
                }
                if (param0 == 8212) {
                    return true;
                }
                if (param0 != 339) {
                    // if_icmpeq L81
                } else {
                    return true;
                }
                return false;
            }
            if (param0 <= 255) {
                return true;
            }
            if (param0 != 8364) {
                // if_icmpeq L135
                // if_icmpeq L135
                // if_icmpeq L135
                // if_icmpeq L135
            } else {
                return true;
            }
            return false;
        }
        if (param0 >= 160) {
            if (param0 <= 255) {
                return true;
            }
        }
        if (param0 != 8364) {
            // if_icmpeq L199
            // if_icmpeq L199
            // if_icmpeq L199
            // if_icmpeq L199
        } else {
            return true;
        }
        return false;
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 <= 99) {
          boolean discarded$2 = nb.a('￿', 111);
          field_b = null;
          field_c = null;
          return;
        } else {
          field_b = null;
          field_c = null;
          return;
        }
    }

    final static void a(int param0) {
        String var1 = null;
        if (!el.field_b) {
          throw new IllegalStateException();
        } else {
          if (null != ji.field_G) {
            ji.field_G.i((byte) -104);
            var1 = w.l(param0 ^ param0);
            no.field_e = new ri(var1, (String) null, true, false, false);
            le.field_e.a(true, (vg) (Object) ae.field_f);
            ae.field_f.b((vg) (Object) no.field_e, param0 + -18);
            ae.field_f.n(param0 + 7363);
            return;
          } else {
            var1 = w.l(param0 ^ param0);
            no.field_e = new ri(var1, (String) null, true, false, false);
            le.field_e.a(true, (vg) (Object) ae.field_f);
            ae.field_f.b((vg) (Object) no.field_e, param0 + -18);
            ae.field_f.n(param0 + 7363);
            return;
          }
        }
    }

    final static byte[] a(String param0, int param1) {
        if (param1 <= 94) {
            nb.a((byte) -57);
            return ek.field_D.a(true, param0, "");
        }
        return ek.field_D.a(true, param0, "");
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Please wait while we search.<br>Games usually start within a minute, provided the server is busy enough.<br><br>The longer you are forced to wait, the earlier in the list of players you are likely to appear.<br><br>If the game doesn't start, click 'Cancel' and then try choosing 'Don't mind' for more options or switching to a busier lobby.";
        field_b = new int[8192];
    }
}
