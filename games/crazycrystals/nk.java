/*
 * Decompiled by CFR-JS 0.4.0.
 */
class nk extends ik {
    static String field_m;
    static String[] field_h;
    static ko field_j;
    static String field_l;
    String field_i;
    static String field_k;
    static String field_n;

    void a(boolean param0, int param1, int param2) {
        if (param2 != 1) {
          ((nk) this).a(true, 102, -32);
          go.field_l.a(((nk) this).field_i, ((nk) this).field_a, 15 + ((nk) this).field_d, param1, -1);
          return;
        } else {
          go.field_l.a(((nk) this).field_i, ((nk) this).field_a, 15 + ((nk) this).field_d, param1, -1);
          return;
        }
    }

    public static void c(int param0) {
        field_k = null;
        field_l = null;
        field_j = null;
        if (param0 != -2) {
          field_j = null;
          field_h = null;
          field_m = null;
          field_n = null;
          return;
        } else {
          field_h = null;
          field_m = null;
          field_n = null;
          return;
        }
    }

    final static String a(boolean param0, byte param1, CharSequence param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = CrazyCrystals.field_B;
        var3 = sm.a((byte) 127, param0, param2);
        if (var3 != null) {
          return var3;
        } else {
          if (param1 == 66) {
            var4 = 0;
            L0: while (true) {
              if (param2.length() > var4) {
                if (oh.a(param2.charAt(var4), (byte) 108)) {
                  var4++;
                  continue L0;
                } else {
                  return vg.field_c;
                }
              } else {
                return null;
              }
            }
          } else {
            field_m = null;
            var4 = 0;
            L1: while (true) {
              if (param2.length() > var4) {
                if (oh.a(param2.charAt(var4), (byte) 108)) {
                  var4++;
                  continue L1;
                } else {
                  return vg.field_c;
                }
              } else {
                return null;
              }
            }
          }
        }
    }

    nk(int param0, int param1, String param2, int param3) {
        L0: {
          ((nk) this).field_i = param2;
          ((nk) this).field_a = param0;
          ((nk) this).field_d = param1;
          ((nk) this).field_b = go.field_l.a(param2);
          if (-2 == (param3 ^ -1)) {
            ((nk) this).field_a = ((nk) this).field_a - ((nk) this).field_b;
            break L0;
          } else {
            if ((param3 ^ -1) != -3) {
              break L0;
            } else {
              ((nk) this).field_a = ((nk) this).field_a - ((nk) this).field_b / 2;
              ((nk) this).field_c = 20;
              return;
            }
          }
        }
        ((nk) this).field_c = 20;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "This is a log.<br><br>You can break it by<br>dropping a rock on it.";
        field_n = "Achievements";
        field_l = "(Including <%0>)";
        field_k = "Change display name";
    }
}
