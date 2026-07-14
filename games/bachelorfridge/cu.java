/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class cu extends ana {
    static String field_y;
    private ku field_x;
    private int field_A;
    private int field_w;
    private aj[] field_v;
    static String field_z;

    final boolean c(byte param0) {
        ((cu) this).field_l = ((cu) this).field_l - 1;
        if (0 <= ((cu) this).field_l - 1) {
            return false;
        }
        if (((cu) this).field_w <= ((cu) this).field_A) {
            this.e(19);
            return true;
        }
        ((cu) this).field_A = ((cu) this).field_A + 1;
        aj var5 = ((cu) this).field_v[((cu) this).field_A];
        aj var6 = var5;
        pi var3 = new pi(((cu) this).field_q, var6.field_c, var6.field_a);
        ((kj) (Object) var3).a(0);
        ((cu) this).field_q.field_h.field_a[var5.field_c][var5.field_a].field_i = false;
        int var4 = 75 % ((71 - param0) / 47);
        ((cu) this).field_q.field_s.d(82);
        ((cu) this).field_l = 200 / (((cu) this).field_q.field_h.field_z + ((cu) this).field_q.field_h.field_B);
        if ((((cu) this).field_l ^ -1) > -2) {
            ((cu) this).field_l = 1;
        }
        if (((cu) this).field_A != -2) {
            if (-1 != ((cu) this).field_A % (60 / ((cu) this).field_l)) {
                return false;
            }
        }
        wf.a(19, (byte) -77);
        return false;
    }

    public static void d(int param0) {
        field_y = null;
        field_z = null;
        int var1 = 64 / ((-34 - param0) / 33);
    }

    private final void e(int param0) {
        if (param0 != 19) {
            cu.d(92);
        }
        ((cu) this).field_x.a(((cu) this).field_q.field_h, (byte) -2);
    }

    cu(gj param0, ku param1) {
        super(param0, (bca) (Object) param1);
        int var4 = 0;
        int var5 = 0;
        aj var6 = null;
        op var8 = null;
        op var9 = null;
        ((cu) this).field_x = param1;
        ((cu) this).field_w = 0;
        var8 = ((cu) this).field_q.field_h;
        var9 = var8;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var9.field_z) {
            ((cu) this).field_A = 0;
            ((cu) this).field_v = new aj[((cu) this).field_w];
            var4 = 0;
            L1: while (true) {
              if (var4 >= var9.field_z) {
                var4 = 0;
                L2: while (true) {
                  if (((cu) this).field_w <= var4) {
                    ((cu) this).field_A = 0;
                  } else {
                    var5 = kla.a(((cu) this).field_w, m.field_a, -2147483648);
                    if (var4 != var5) {
                      var6 = ((cu) this).field_v[var4];
                      ((cu) this).field_v[var4] = ((cu) this).field_v[var5];
                      ((cu) this).field_v[var5] = var6;
                      var4++;
                      continue L2;
                    } else {
                      var4++;
                      continue L2;
                    }
                  }
                }
              } else {
                var5 = 0;
                L3: while (true) {
                  if (var5 >= var9.field_B) {
                    var4++;
                    continue L1;
                  } else {
                    if (var8.field_a[var4][var5].field_i) {
                      ((cu) this).field_A = ((cu) this).field_A + 1;
                      ((cu) this).field_v[((cu) this).field_A] = new aj(var4, var5);
                      var5++;
                      continue L3;
                    } else {
                      var5++;
                      continue L3;
                    }
                  }
                }
              }
            }
          } else {
            var5 = 0;
            L4: while (true) {
              if (var5 >= var9.field_B) {
                var4++;
                continue L0;
              } else {
                if (var8.field_a[var4][var5].field_i) {
                  ((cu) this).field_w = ((cu) this).field_w + 1;
                  var5++;
                  continue L4;
                } else {
                  var5++;
                  continue L4;
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_y = "Asking for or providing contact information";
    }
}
