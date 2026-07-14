/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class mi extends at {
    private gj field_j;
    static String field_n;
    private int field_o;
    private int field_q;
    static int field_k;
    private aj[] field_m;
    static gu[] field_l;
    private int field_p;

    public static void d(byte param0) {
        field_n = null;
        field_l = null;
        int var1 = 17 / ((-49 - param0) / 54);
    }

    private final void b(boolean param0) {
        if (param0) {
            mi.d((byte) 97);
        }
    }

    final boolean c(byte param0) {
        uea var3 = null;
        int var4 = 0;
        aj var5 = null;
        aj var6 = null;
        ((mi) this).field_q = ((mi) this).field_q - 1;
        if (0 <= ((mi) this).field_q - 1) {
          return false;
        } else {
          if (((mi) this).field_p <= ((mi) this).field_o) {
            this.b(false);
            return true;
          } else {
            L0: {
              ((mi) this).field_o = ((mi) this).field_o + 1;
              var5 = ((mi) this).field_m[((mi) this).field_o];
              var6 = var5;
              var3 = new uea(((mi) this).field_j, var6.field_c, var6.field_a, 16777215);
              ((kj) (Object) var3).a(0);
              ((mi) this).field_j.field_h.field_a[var5.field_c][var5.field_a].field_i = true;
              ((mi) this).field_j.field_s.d(74);
              var4 = -120 / ((71 - param0) / 47);
              ((mi) this).field_q = 200 / (((mi) this).field_j.field_h.field_B + ((mi) this).field_j.field_h.field_z);
              if (1 > ((mi) this).field_q) {
                ((mi) this).field_q = 1;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (-2 == (((mi) this).field_o ^ -1)) {
                wf.a(19, (byte) 126);
                break L1;
              } else {
                if (0 != ((mi) this).field_o % (100 / ((mi) this).field_q)) {
                  break L1;
                } else {
                  wf.a(19, (byte) 126);
                  break L1;
                }
              }
            }
            return false;
          }
        }
    }

    mi(gj param0, bja param1) {
        int var4 = 0;
        int var5 = 0;
        aj var6 = null;
        op var8 = null;
        op var9 = null;
        ((mi) this).field_j = param0;
        var8 = ((mi) this).field_j.field_h;
        var9 = var8;
        ((mi) this).field_p = 0;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var9.field_z) {
            ((mi) this).field_m = new aj[((mi) this).field_p];
            ((mi) this).field_o = 0;
            var4 = 0;
            L1: while (true) {
              if (var9.field_z <= var4) {
                var4 = 0;
                L2: while (true) {
                  if (var4 >= ((mi) this).field_p) {
                    ((mi) this).field_o = 0;
                  } else {
                    var5 = kla.a(((mi) this).field_p, m.field_a, -2147483648);
                    if (var5 != var4) {
                      var6 = ((mi) this).field_m[var4];
                      ((mi) this).field_m[var4] = ((mi) this).field_m[var5];
                      ((mi) this).field_m[var5] = var6;
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
                    if (!var8.field_a[var4][var5].field_i) {
                      if (1 == var8.field_L.field_o[var4][var5].field_n) {
                        ((mi) this).field_o = ((mi) this).field_o + 1;
                        ((mi) this).field_m[((mi) this).field_o] = new aj(var4, var5);
                        var5++;
                        continue L3;
                      } else {
                        var5++;
                        continue L3;
                      }
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
                if (!var8.field_a[var4][var5].field_i) {
                  if ((var8.field_L.field_o[var4][var5].field_n ^ -1) == -2) {
                    ((mi) this).field_p = ((mi) this).field_p + 1;
                    var5++;
                    continue L4;
                  } else {
                    var5++;
                    continue L4;
                  }
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
        int var0 = 0;
        field_k = 480;
        field_n = "If you are not, please change your password to something more obscure!";
        field_l = new gu[255];
        for (var0 = 0; field_l.length > var0; var0++) {
            field_l[var0] = new gu();
        }
    }
}
