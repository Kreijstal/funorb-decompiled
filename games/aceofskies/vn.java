/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vn extends vo {
    static String field_g;
    static lt field_f;
    static String field_e;

    final pt a(String param0, int param1) {
        int var3 = 0;
        String var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        CharSequence var7 = null;
        var5 = (CharSequence) param0;
        if (!vl.a(param1 ^ 8202, var5)) {
          return bt.field_a;
        } else {
          if (param1 == 8192) {
            var7 = (CharSequence) param0;
            var3 = td.a(var7, (byte) 38);
            if (var3 > 0) {
              if (-131 < var3) {
                return bt.field_a;
              } else {
                return fd.field_a;
              }
            } else {
              return bt.field_a;
            }
          } else {
            var4 = (String) null;
            vn.a(63, (File) null, (String) null);
            var6 = (CharSequence) param0;
            var3 = td.a(var6, (byte) 38);
            if (var3 > 0) {
              if (-131 > var3) {
                return bt.field_a;
              } else {
                return fd.field_a;
              }
            } else {
              return bt.field_a;
            }
          }
        }
    }

    vn(bm param0) {
        super(param0);
    }

    public static void c(byte param0) {
        field_g = null;
        field_e = null;
        field_f = null;
        if (param0 != 101) {
            String var2 = (String) null;
            vn.a(55, (File) null, (String) null);
        }
    }

    final static void a(int param0, File param1, String param2) {
        if (param0 != 0) {
            return;
        }
        Object discarded$0 = vg.field_j.put((Object) (Object) param2, (Object) (Object) param1);
    }

    final String a(String param0, byte param1) {
        if (param1 != 72) {
            String var4 = (String) null;
            vn.a(53, (File) null, (String) null);
            if (!(((vn) this).a(param0, 8192) != bt.field_a)) {
                return dg.field_L;
            }
            return null;
        }
        if (!(((vn) this).a(param0, 8192) != bt.field_a)) {
            return dg.field_L;
        }
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Your email address is used to identify this account";
        field_g = "Change display name";
    }
}
