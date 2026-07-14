/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class se {
    static String field_b;
    static String field_c;
    static int field_d;
    static String field_a;

    final static int a(int param0) {
        int var1 = 0;
        int var2 = Sumoblitz.field_L ? 1 : 0;
        boolean discarded$10 = rf.field_a.a(wr.field_F, ha.field_b, true, param0 + -19887);
        rf.field_a.h(-90);
        while (wd.c(param0 ^ -19954)) {
            boolean discarded$11 = rf.field_a.a(np.field_c, tg.field_a, true);
        }
        if (0 != (iu.field_e ^ -1)) {
            var1 = iu.field_e;
            rd.a(-1, param0 ^ -19873);
            return var1;
        }
        if (!(!lc.field_A)) {
            return 3;
        }
        if (param0 != 19886) {
            field_d = -49;
        }
        if (!(vm.field_c != ad.field_p)) {
            return 1;
        }
        if (!ut.field_o.a(true)) {
            return 1;
        }
        if (nw.field_e == ad.field_p) {
            return 2;
        }
        return -1;
    }

    abstract nb a(byte param0);

    final static String a(CharSequence[] param0, int param1, int param2, int param3) {
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
        var9 = Sumoblitz.field_L ? 1 : 0;
        if (param3 == 14156) {
          if (0 == param2) {
            return "";
          } else {
            if ((param2 ^ -1) == -2) {
              var10 = param0[param1];
              var4_ref = var10;
              if (var4_ref == null) {
                return "null";
              } else {
                return ((Object) (Object) var10).toString();
              }
            } else {
              var4 = param2 - -param1;
              var5 = 0;
              var6_int = param1;
              L0: while (true) {
                if (var4 <= var6_int) {
                  var6 = new StringBuilder(var5);
                  var7 = param1;
                  L1: while (true) {
                    if (var7 >= var4) {
                      return var6.toString();
                    } else {
                      var8 = param0[var7];
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
                  var7_ref_CharSequence = param0[var6_int];
                  if (var7_ref_CharSequence != null) {
                    var5 = var5 + var7_ref_CharSequence.length();
                    var6_int++;
                    continue L0;
                  } else {
                    var5 += 4;
                    var6_int++;
                    continue L0;
                  }
                }
              }
            }
          }
        } else {
          return null;
        }
    }

    abstract void a(fs param0, byte param1);

    final static boolean a(int param0, int param1, int param2) {
        int var3 = -24 % ((-63 - param0) / 40);
        if (!oj.a(param1, 13836, param2)) {
            return false;
        }
        if ((-1 != (param1 & 36864 ^ -1) ? true : false) | dk.a(param1, (byte) -107, param2) | tq.a(param2, true, param1)) {
            return true;
        }
        return (lg.a(param1, -22, param2) | ((8192 & param1) != 0 ? true : false) | mb.a(true, param2, param1)) & ((param2 & 55) == 0 ? true : false);
    }

    public static void b(int param0) {
        if (param0 != 8192) {
            field_d = 19;
        }
        field_b = null;
        field_a = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_c = "Please try again in a few minutes.";
        field_a = "Score";
    }
}
