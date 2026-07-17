/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc {
    static rc field_a;
    static int field_b;

    public static void a(int param0) {
        field_a = null;
        int var1 = 0;
    }

    final static void a(long param0) {
        try {
            InterruptedException var3 = null;
            Throwable decompiledCaughtException = null;
            {
              L0: {
                Thread.sleep(param0);
                break L0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(char param0) {
        if (Character.isISOControl(param0)) {
            return false;
        }
        int discarded$6 = -110;
        if (!(!qk.a(param0))) {
            return true;
        }
        if (45 != param0) {
            if (param0 != 160) {
                if (param0 != 32) {
                    if (param0 != 95) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    final static ti[] a() {
        ti[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        byte[] var5 = null;
        int var6 = 0;
        int[] var6_ref_int__ = null;
        int var7 = 0;
        int var8 = 0;
        byte[] var9 = null;
        int[] var10 = null;
        byte[] var12 = null;
        int[] var13 = null;
        byte[] var16 = null;
        int[] var17 = null;
        byte[] var20 = null;
        int[] var21 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        var1 = new ti[ih.field_b];
        var2 = 0;
        L0: while (true) {
          if (ih.field_b <= var2) {
            wd.d(127);
            return var1;
          } else {
            var3 = ql.field_b[var2] * wk.field_b[var2];
            var23 = re.field_K[var2];
            if (!cc.field_e[var2]) {
              var10 = new int[var3];
              var26 = var10;
              var6 = 0;
              L1: while (true) {
                if (var6 >= var3) {
                  var1[var2] = new ti(pj.field_y, ll.field_U, gj.field_j[var2], re.field_a[var2], ql.field_b[var2], wk.field_b[var2], var26);
                  var2++;
                  continue L0;
                } else {
                  var10[var6] = rg.field_D[vg.c(255, (int) var23[var6])];
                  var6++;
                  continue L1;
                }
              }
            } else {
              var24 = ld.field_e[var2];
              var20 = var24;
              var16 = var20;
              var12 = var16;
              var9 = var12;
              var5 = var9;
              var25 = new int[var3];
              var21 = var25;
              var17 = var21;
              var13 = var17;
              var6_ref_int__ = var13;
              var7 = 0;
              L2: while (true) {
                if (var7 >= var3) {
                  var1[var2] = (ti) (Object) new jf(pj.field_y, ll.field_U, gj.field_j[var2], re.field_a[var2], ql.field_b[var2], wk.field_b[var2], var25);
                  var2++;
                  continue L0;
                } else {
                  var6_ref_int__[var7] = cl.b(rg.field_D[vg.c((int) var23[var7], 255)], vg.c(var24[var7] << 24, -16777216));
                  var7++;
                  continue L2;
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
        field_a = new rc();
        field_b = 897634304;
    }
}
