/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class cla {
    static byte[] field_a;

    final static void a(byte param0, eaa param1, int param2, Random param3) {
        Object var4 = null;
        lh var4_ref = null;
        int var5 = 0;
        var4 = null;
        var5 = BachelorFridge.field_y;
        if (param0 == 11) {
          var4_ref = (lh) (Object) param1.b((byte) 90);
          L0: while (true) {
            if (var4_ref == null) {
              return;
            } else {
              L1: {
                if (var4_ref.b(true)) {
                  var4_ref.field_k = (int)((double)(kla.a(64, param3, -2147483648) + 176) * -Math.abs(100.0 * Math.sin((double)(108 - param2) / 300.0)));
                  var4_ref.field_p = -(int)((double)(128 + kla.a(10000, param3, -2147483648)) * Math.sin(var4_ref.field_r));
                  var4_ref.field_g = -(int)((double)(128 + kla.a(10000, param3, -2147483648)) * Math.cos(var4_ref.field_r));
                  break L1;
                } else {
                  break L1;
                }
              }
              var4_ref = (lh) (Object) param1.c(param0 ^ 11);
              continue L0;
            }
          }
        } else {
          field_a = null;
          var4_ref = (lh) (Object) param1.b((byte) 90);
          L2: while (true) {
            if (var4_ref == null) {
              return;
            } else {
              L3: {
                if (var4_ref.b(true)) {
                  var4_ref.field_k = (int)((double)(kla.a(64, param3, -2147483648) + 176) * -Math.abs(100.0 * Math.sin((double)(108 - param2) / 300.0)));
                  var4_ref.field_p = -(int)((double)(128 + kla.a(10000, param3, -2147483648)) * Math.sin(var4_ref.field_r));
                  var4_ref.field_g = -(int)((double)(128 + kla.a(10000, param3, -2147483648)) * Math.cos(var4_ref.field_r));
                  break L3;
                } else {
                  break L3;
                }
              }
              var4_ref = (lh) (Object) param1.c(param0 ^ 11);
              continue L2;
            }
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        int var1 = 34 / ((param0 - 24) / 48);
    }

    static {
    }
}
