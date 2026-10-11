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
            Thread.sleep(param0);
            if (param1 != -23850) {
              bc.a('X', 6);
            }
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (InterruptedException) (Object) decompiledCaughtException;
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
        if (qk.a(param0, (byte) -110)) {
          return true;
        }
        if (45 != param0 &&
          param0 != 160 &&
          param0 != 32 &&
          param0 != 95) {
          return false;
        }
        return true;
    }

    final static ti[] a(byte param0) {
        int var2 = 0;
        int var6 = 0;
        int var7 = 0;
        ti[] var1;
        int var3;
        byte[] var5;
        int[] var6_ref_int__;
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
        if (param0 <= 34) {
          return (ti[]) null;
        }
        for (var2 = 0; ih.field_b > var2; var2++) {
          var3 = ql.field_b[var2] * wk.field_b[var2];
          var21 = re.field_K[var2];
          if (!cc.field_e[var2]) {
            var10 = new int[var3];
            var22 = var10;
            for (var6 = 0; var6 < var3; var6++) {
              var10[var6] = rg.field_D[vg.c(255, (int) var21[var6])];
            }
            var1[var2] = new ti(pj.field_y, ll.field_U, gj.field_j[var2], re.field_a[var2], ql.field_b[var2], wk.field_b[var2], var22);
          } else {
            var16 = ld.field_e[var2];
            var12 = var16;
            var9 = var12;
            var5 = var9;
            var17 = new int[var3];
            var13 = var17;
            var6_ref_int__ = var13;
            for (var7 = 0; var7 < var3; var7++) {
              var6_ref_int__[var7] = cl.b(rg.field_D[vg.c((int) var21[var7], 255)], vg.c(var16[var7] << 24, -16777216));
            }
            var1[var2] = (ti) ((Object) new jf(pj.field_y, ll.field_U, gj.field_j[var2], re.field_a[var2], ql.field_b[var2], wk.field_b[var2], var17));
          }
        }
        wd.d(127);
        return var1;
    }

    static {
        field_a = new rc();
        field_b = 897634304;
    }
}
