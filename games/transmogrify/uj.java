/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj {
    static ci field_h;
    boolean field_a;
    static volatile int field_i;
    String[] field_j;
    String field_b;
    static ti field_e;
    static int[] field_d;
    boolean field_f;
    int field_g;
    static qj field_c;

    final static ti[] a(int param0) {
        ti[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        byte[] var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_11_0 = 0;
        var7 = Transmogrify.field_A ? 1 : 0;
        var1 = new ti[ih.field_b];
        var2 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (ih.field_b <= var2) {
                break L2;
              } else {
                var3 = ql.field_b[var2] * wk.field_b[var2];
                var9 = re.field_K[var2];
                var5 = new int[var3];
                stackOut_2_0 = 0;
                stackIn_12_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var7 != 0) {
                  break L1;
                } else {
                  var6 = stackIn_3_0;
                  L3: while (true) {
                    L4: {
                      if (var3 <= var6) {
                        var1[var2] = new ti(pj.field_y, ll.field_U, gj.field_j[var2], re.field_a[var2], ql.field_b[var2], wk.field_b[var2], var5);
                        var2++;
                        break L4;
                      } else {
                        var5[var6] = rg.field_D[vg.c((int) var9[var6], 255)];
                        var6++;
                        if (var7 != 0) {
                          break L4;
                        } else {
                          continue L3;
                        }
                      }
                    }
                    if (var7 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            wd.d(-9);
            stackOut_11_0 = param0;
            stackIn_12_0 = stackOut_11_0;
            break L1;
          }
          if (stackIn_12_0 != 31151) {
            field_e = (ti) null;
            return var1;
          } else {
            return var1;
          }
        }
    }

    public static void b(int param0) {
        field_h = null;
        if (param0 != -1) {
          field_e = (ti) null;
          field_c = null;
          field_e = null;
          field_d = null;
          return;
        } else {
          field_c = null;
          field_e = null;
          field_d = null;
          return;
        }
    }

    uj(boolean param0) {
        this.field_f = param0 ? true : false;
    }

    static {
        field_i = -1;
        field_c = new qj();
    }
}
