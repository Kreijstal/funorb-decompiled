/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class mf {
    private nj[] field_f;
    static int field_c;
    static dd field_g;
    int[] field_d;
    static mf field_e;
    static dd field_b;
    static fi[] field_a;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        var7 = fleas.field_A ? 1 : 0;
        var6 = -1 + this.field_f.length;
        L0: while (true) {
          if (-1 < (var6 ^ -1)) {
            if (param3 == -4575) {
              return;
            } else {
              this.a(-12, -98, -85, -78, -93);
              return;
            }
          } else {
            if (var7 == 0) {
              L1: {
                L2: {
                  if (null == this.field_f[var6]) {
                    break L2;
                  } else {
                    if (!this.field_f[var6].b(param3 + 4522)) {
                      break L1;
                    } else {
                      this.field_f[var6] = new nj(param2, param0, param1, param4, this.field_d);
                      if (var7 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                this.field_f[var6] = new nj(param2, param0, param1, param4, this.field_d);
                break L1;
              }
              var6--;
              continue L0;
            } else {
              return;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 != -9) {
            return;
        }
        field_a = null;
        field_g = null;
        field_e = null;
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = fleas.field_A ? 1 : 0;
        var2 = this.field_f.length - param0;
        L0: while (true) {
          if ((var2 ^ -1) <= -1) {
            if (var3 == 0) {
              L1: {
                if (null != this.field_f[var2]) {
                  this.field_f[var2].c(-55);
                  break L1;
                } else {
                  break L1;
                }
              }
              var2--;
              continue L0;
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final static Boolean a(boolean param0) {
        Boolean var1 = null;
        if (!param0) {
            field_b = (dd) null;
            var1 = bb.field_A;
            bb.field_A = null;
            return var1;
        }
        var1 = bb.field_A;
        bb.field_A = null;
        return var1;
    }

    mf(int param0, int param1) {
        int var4 = fleas.field_A ? 1 : 0;
        na.field_c = new Random((long)param1);
        this.field_f = new nj[param0];
        this.field_d = new int[255];
        int var3 = 0;
        while (var3 < 255) {
            this.field_d[var3] = var3 * 65793;
            var3++;
            if (var4 != 0) {
                return;
            }
        }
    }

    static {
        field_a = new fi[2];
    }
}
