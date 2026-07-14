/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hj extends mf {
    static Random field_h;
    static int[] field_l;
    static int field_k;
    static int field_j;
    static String field_i;

    final String a(String param0, boolean param1) {
        if (((hj) this).a((byte) -92, param0) == fb.field_e) {
            return ih.field_c;
        }
        if (param1) {
            return null;
        }
        hj.e(-48);
        return null;
    }

    hj(ul param0) {
        super(param0);
    }

    final fi a(byte param0, String param1) {
        int var3 = 0;
        CharSequence var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        var4 = (CharSequence) (Object) param1;
        if (!vl.a(var4, -182)) {
          return fb.field_e;
        } else {
          if (param0 <= -44) {
            var6 = (CharSequence) (Object) param1;
            var3 = cc.a(true, var6);
            if (var3 > 0) {
              if (-131 > (var3 ^ -1)) {
                return fb.field_e;
              } else {
                return nn.field_q;
              }
            } else {
              return fb.field_e;
            }
          } else {
            field_h = null;
            var5 = (CharSequence) (Object) param1;
            var3 = cc.a(true, var5);
            if (var3 > 0) {
              if (-131 > (var3 ^ -1)) {
                return fb.field_e;
              } else {
                return nn.field_q;
              }
            } else {
              return fb.field_e;
            }
          }
        }
    }

    public static void e(int param0) {
        field_l = null;
        int var1 = 73 / ((param0 - -21) / 59);
        field_h = null;
        field_i = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new Random();
        field_l = new int[4];
        field_i = "You already have rapid fire";
    }
}
