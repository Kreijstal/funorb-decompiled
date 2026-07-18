/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ha extends tia {
    static int field_n;
    private eaa field_j;
    static vr field_i;
    static int field_l;
    static int[] field_m;
    static int field_k;

    final boolean a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        lh var8 = null;
        int var9 = 0;
        var9 = BachelorFridge.field_y;
        int fieldTemp$2 = ((ha) this).field_g - 2;
        ((ha) this).field_g = ((ha) this).field_g - 2;
        if (fieldTemp$2 <= 0) {
          return false;
        } else {
          L0: {
            if (30 >= ((ha) this).field_g) {
              break L0;
            } else {
              var2 = ((ha) this).field_g;
              var2 += 16;
              var3 = 0;
              L1: while (true) {
                if (var3 >= 16) {
                  break L0;
                } else {
                  var4 = 15 + kla.a(300, ((ha) this).field_f, -2147483648) + -150;
                  var5 = -(int)((double)((64 - -kla.a(50, ((ha) this).field_f, -2147483648) + -25) * (16384 / (var2 / 16))) * Math.sin((double)var4));
                  var6 = -(int)((double)(6144 / (var2 / 16) * (-25 - -kla.a(50, ((ha) this).field_f, -2147483648) + 64)) * Math.cos((double)var4));
                  var7 = (int)(Math.sin((double)var2 * 300.0) * 100.0);
                  var8 = new lh(var5, var7, var6);
                  int discarded$3 = kla.a(10, ((ha) this).field_f, -2147483648);
                  var8.field_p = -kla.a(5000, ((ha) this).field_f, -2147483648);
                  var8.field_k = -kla.a(5000, ((ha) this).field_f, -2147483648);
                  var8.field_g = -kla.a(5000, ((ha) this).field_f, -2147483648);
                  var8.field_m = -2;
                  var8.field_o = ((ha) this).field_g - 10;
                  var8.field_r = (double)var4;
                  var8.field_l = 0;
                  ((ha) this).field_j.a((bw) (Object) var8, true);
                  var3++;
                  continue L1;
                }
              }
            }
          }
          cla.a((byte) 11, ((ha) this).field_j, ((ha) this).field_g, ((ha) this).field_f);
          if (param0 <= 0) {
            return true;
          } else {
            return true;
          }
        }
    }

    final static void a(int param0, int param1, boolean param2) {
        ld.field_n = param1;
        hda.field_o = param0;
    }

    final void a(int param0, int param1, int param2) {
        iaa.a(param0, 20, 65280, (byte) -101, param2, ((ha) this).field_j);
        if (param1 != 25415) {
            ((ha) this).field_j = null;
        }
    }

    ha(gj param0, ad param1) {
        super(param0, param1);
        try {
            ((ha) this).field_g = 128;
            ((ha) this).field_j = new eaa();
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "ha.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c(boolean param0) {
        field_i = null;
        field_m = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = 100;
        field_m = new int[8192];
        field_l = 0;
        field_k = field_l;
    }
}
