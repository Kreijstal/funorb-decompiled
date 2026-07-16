/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ni {
    static fh field_c;
    static Calendar field_d;
    static boolean field_a;
    static vn[] field_b;

    final static String a(int param0, int param1, int param2, CharSequence[] param3) {
        CharSequence var4_ref_CharSequence = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        var9 = ZombieDawn.field_J;
        if (param0 != 0) {
          if ((param0 ^ -1) != -2) {
            var4 = param0 + param1;
            var5 = 0;
            var6_int = param1;
            L0: while (true) {
              if (var6_int >= var4) {
                var6 = new StringBuilder(var5);
                var7 = param1;
                L1: while (true) {
                  if (var4 <= var7) {
                    if (param2 > 25) {
                      return var6.toString();
                    } else {
                      return null;
                    }
                  } else {
                    var8 = param3[var7];
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
                var7_ref_CharSequence = param3[var6_int];
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
          } else {
            var10 = param3[param1];
            var4_ref_CharSequence = var10;
            if (var4_ref_CharSequence == null) {
              return "null";
            } else {
              return ((Object) (Object) var10).toString();
            }
          }
        } else {
          return "";
        }
    }

    public static void a(int param0) {
        if (param0 != -1) {
            field_b = null;
        }
        field_d = null;
        field_c = null;
        field_b = null;
    }

    final static void a(byte param0) {
        dj.field_l = new vo();
        if (param0 != -78) {
            Object var2 = null;
            String discarded$0 = ni.a(40, 57, -80, (CharSequence[]) null);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
