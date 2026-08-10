/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc {
    static rc field_a;
    static int field_b;

    public static void a(int param0) {
        field_a = null;
        int var1 = -65 % ((85 - param0) / 33);
    }

    final static void a(long param0, int param1) {
        try {
            Throwable decompiledCaughtException = null;
            InterruptedException var3 = null;
            try {
              L0: {
                L1: {
                  Thread.sleep(param0);
                  if (param1 == -23850) {
                    break L1;
                  } else {
                    bc.a('X', 6);
                    break L1;
                  }
                }
                break L0;
              }
            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var3 = (InterruptedException) (Object) decompiledCaughtException;
                break L2;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(char param0, int param1) {
        if (Character.isISOControl(param0)) {
            return false;
        }
        if (param1 != -161) {
            return true;
        }
        if (!(!qk.a(param0, (byte) -110))) {
            return true;
        }
        if (45 != param0 && param0 != 160 && param0 != 32 && param0 != 95) {
            return false;
        }
        return true;
    }

    final static ti[] a(byte param0) {
        ti[] var1;
        int var2;
        int var3;
        byte[] var5;
        int var6;
        int[] var6_ref_int__;
        int var7;
        int var8;
        byte[] var9;
        int[] var10;
        byte[] var12;
        int[] var13;
        byte[] var16;
        int[] var17;
        byte[] var21;
        int[] var22;
        var8 = Transmogrify.field_A ? 1 : 0;
        var1 = new ti[ih.field_b];
        if (param0 > 34) {
          var2 = 0;
          L0: while (true) {
            if (ih.field_b <= var2) {
              wd.d(127);
              return var1;
            } else {
              var3 = ql.field_b[var2] * wk.field_b[var2];
              var21 = re.field_K[var2];
              if (!cc.field_e[var2]) {
                var10 = new int[var3];
                var22 = var10;
                var6 = 0;
                L1: while (true) {
                  if (var6 >= var3) {
                    var1[var2] = new ti(pj.field_y, ll.field_U, gj.field_j[var2], re.field_a[var2], ql.field_b[var2], wk.field_b[var2], var22);
                    var2++;
                    continue L0;
                  } else {
                    var10[var6] = rg.field_D[vg.c(255, (int) var21[var6])];
                    var6++;
                    continue L1;
                  }
                }
              } else {
                var16 = ld.field_e[var2];
                var12 = var16;
                var9 = var12;
                var5 = var9;
                var17 = new int[var3];
                var13 = var17;
                var6_ref_int__ = var13;
                var7 = 0;
                L2: while (true) {
                  if (var7 >= var3) {
                    var1[var2] = (ti) ((Object) new jf(pj.field_y, ll.field_U, gj.field_j[var2], re.field_a[var2], ql.field_b[var2], wk.field_b[var2], var17));
                    var2++;
                    continue L0;
                  } else {
                    var6_ref_int__[var7] = cl.b(rg.field_D[vg.c((int) var21[var7], 255)], vg.c(var16[var7] << 1283255416, -16777216));
                    var7++;
                    continue L2;
                  }
                }
              }
            }
          }
        } else {
          return (ti[]) null;
        }
    }

    static {
        field_a = new rc();
        field_b = 897634304;
    }
}
