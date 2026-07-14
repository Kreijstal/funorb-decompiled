/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class im extends IOException {
    static int field_a;

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = EscapeVector.field_A;
        if (param1 < param0) {
            var3 = param1;
            param1 = param0;
            param0 = var3;
        }
        while (param0 != 0) {
            var3 = param1 % param0;
            param1 = param0;
            param0 = var3;
        }
        var3 = 59 % ((-4 - param2) / 49);
        return param1;
    }

    final static void a(byte param0, int param1) {
        int var3 = 0;
        Object var4 = null;
        cc var4_ref = null;
        dc var5 = null;
        var4 = null;
        var3 = EscapeVector.field_A;
        if (param0 > 48) {
          var4_ref = (cc) (Object) vn.field_e.a(false);
          L0: while (true) {
            if (var4_ref == null) {
              var5 = (dc) (Object) en.field_i.a(false);
              L1: while (true) {
                if (var5 != null) {
                  oa.a(param1, var5, -755);
                  var5 = (dc) (Object) en.field_i.b((byte) 70);
                  continue L1;
                } else {
                  return;
                }
              }
            } else {
              hg.a(-121, param1, var4_ref);
              var4_ref = (cc) (Object) vn.field_e.b((byte) 70);
              continue L0;
            }
          }
        } else {
          field_a = 28;
          var4_ref = (cc) (Object) vn.field_e.a(false);
          L2: while (true) {
            if (var4_ref == null) {
              var5 = (dc) (Object) en.field_i.a(false);
              L3: while (true) {
                if (var5 != null) {
                  oa.a(param1, var5, -755);
                  var5 = (dc) (Object) en.field_i.b((byte) 70);
                  continue L3;
                } else {
                  return;
                }
              }
            } else {
              hg.a(-121, param1, var4_ref);
              var4_ref = (cc) (Object) vn.field_e.b((byte) 70);
              continue L2;
            }
          }
        }
    }

    im(String param0) {
        super(param0);
    }

    static {
    }
}
