/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj extends gn {
    static boolean field_M;

    private fj(String param0, bj param1) {
        this(param0, ra.field_o.field_n, param1);
        ((fj) this).field_h = ra.field_o.field_k;
    }

    private fj(String param0, nl param1, bj param2) {
        super(param0, param1, param2);
        ((fj) this).field_h = ra.field_o.field_k;
    }

    final static void a(byte param0) {
        try {
            if (null != bg.field_e) {
                try {
                    bg.field_e.a(0L, (byte) -70);
                    bg.field_e.a(-1, 24, s.field_e.field_j, s.field_e.field_m);
                } catch (Exception exception) {
                }
            }
            if (param0 != 85) {
                field_M = true;
            }
            s.field_e.field_j = s.field_e.field_j + 24;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, ja param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = 20 % ((-42 - param0) / 36);
        if (((param1.field_w | param1.field_x | param1.field_r | param1.field_y) & 3) != 0) {
          var3 = (3 & param1.field_r) + param1.field_x;
          var3 = -(var3 & 3) + (4 + var3);
          var4 = (param1.field_y & 3) + param1.field_w;
          var4 = var4 + -(3 & var4) + 4;
          var5 = new int[var3 * var4];
          var6 = 0;
          var7 = (param1.field_y & 3) * var3 + (param1.field_r & 3);
          var8 = 0;
          L0: while (true) {
            if (var8 >= param1.field_w) {
              param1.field_y = param1.field_y & -4;
              param1.field_B = var5;
              param1.field_x = var3;
              param1.field_r = param1.field_r & -4;
              param1.field_w = var4;
              return;
            } else {
              var9 = 0;
              L1: while (true) {
                if (var9 >= param1.field_x) {
                  var7 = var7 + (var3 + -param1.field_x);
                  var8++;
                  continue L0;
                } else {
                  var7++;
                  var6++;
                  var5[var7] = param1.field_B[var6];
                  var9++;
                  continue L1;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    fj(String param0, bj param1, boolean param2) {
        this(param0, param1);
        ((fj) this).field_G = param2 ? true : false;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        ((fj) this).field_G = !((fj) this).field_G ? true : false;
        super.a(param0, param1, param2, param3);
    }

    final static ja[] a(String param0, String param1, int param2, ul param3) {
        ja[] var5 = pb.a(param1, param3, -256, param0);
        ja[] var4 = var5;
        var5[param2].field_u = var5[3].field_w;
        var5[1].field_z = var5[1].field_x;
        var5[7].field_z = var5[7].field_x;
        var5[5].field_u = var5[5].field_w;
        return var4;
    }

    static {
    }
}
