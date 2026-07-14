/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa {
    static int field_b;
    static int field_h;
    static boolean[] field_i;
    static ka[] field_e;
    static String field_c;
    private String field_j;
    static int field_a;
    static String field_d;
    private boolean field_k;
    static int field_f;
    static ql field_g;

    final static ge a(int[] param0, int param1, ge param2) {
        ge var3 = new ge(0, 0, 0);
        var3.field_f = param2.field_f;
        var3.field_e = param2.field_e;
        var3.field_d = param2.field_d;
        var3.field_b = param2.field_b;
        var3.field_g = param2.field_g;
        var3.field_k = param2.field_k;
        var3.field_l = param0;
        var3.field_a = param2.field_a;
        if (param1 != -1) {
            Object var4 = null;
            qa.a(2, -104, 38, (qe) null, 16, -8, 43, -66, -92, -17);
        }
        return var3;
    }

    final static String a(int param0, CharSequence[] param1) {
        if (param0 < 110) {
            Object var3 = null;
            qa.a(-22, (ej) null);
        }
        return qa.a(param1.length, 0, param1, 0);
    }

    final static void a(int param0, ej param1) {
        lg.a(true, (byte) -79, param1);
        if (param0 <= 44) {
            Object var3 = null;
            String discarded$0 = qa.a(-28, (CharSequence[]) null);
        }
    }

    final static void a(int param0, int param1, int param2, qe param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        if (!(param3.field_x <= param8)) {
            param3.field_x = param8;
        }
        if ((param3.field_x ^ -1) > param5) {
            hc.a(54, param1, param9, param6, param7, param2, param4, param0);
            param3.field_x = param8;
        }
    }

    qa(String param0) {
        this(param0, false);
    }

    private final static String a(int param0, int param1, CharSequence[] param2, int param3) {
        CharSequence var4_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        var9 = TorChallenge.field_F ? 1 : 0;
        if (param0 == 0) {
          return "";
        } else {
          if (-2 == (param0 ^ -1)) {
            var10 = param2[param1];
            var4_ref = var10;
            if (var4_ref == null) {
              return "null";
            } else {
              return ((Object) (Object) var10).toString();
            }
          } else {
            var4 = param1 + param0;
            var5 = param3;
            var6_int = param1;
            L0: while (true) {
              if (var6_int >= var4) {
                var6 = new StringBuilder(var5);
                var7 = param1;
                L1: while (true) {
                  if (var7 >= var4) {
                    return var6.toString();
                  } else {
                    var8 = param2[var7];
                    if (var8 != null) {
                      StringBuilder discarded$2 = var6.append(var8);
                      var7++;
                      continue L1;
                    } else {
                      StringBuilder discarded$3 = var6.append("null");
                      var7++;
                      continue L1;
                    }
                  }
                }
              } else {
                var7_ref_CharSequence = param2[var6_int];
                if (var7_ref_CharSequence == null) {
                  var5 += 4;
                  var6_int++;
                  continue L0;
                } else {
                  var5 = var5 + var7_ref_CharSequence.length();
                  var6_int++;
                  continue L0;
                }
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 != -1) {
            Object var2 = null;
            qa.a(36, -77, 17, (qe) null, -32, 109, -70, -100, 87, -49);
        }
        field_i = null;
        field_d = null;
        field_e = null;
        field_c = null;
    }

    final boolean b(byte param0) {
        if (param0 != -29) {
            field_a = -55;
        }
        return ((qa) this).field_k;
    }

    qa(String param0, boolean param1) {
        ((qa) this).field_j = param0;
        ((qa) this).field_k = param1 ? true : false;
        if (((qa) this).field_j == null) {
            ((qa) this).field_j = "";
        }
        if (-1 == (((qa) this).field_j.length() ^ -1)) {
            ((qa) this).field_k = false;
        }
    }

    final String a(byte param0) {
        if (param0 <= 37) {
            field_c = null;
        }
        return ((qa) this).field_j;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 0;
        field_d = "This game has been updated! Please reload this page.";
        field_c = "Updates will sent to the email address you've given";
        field_a = 0;
    }
}
