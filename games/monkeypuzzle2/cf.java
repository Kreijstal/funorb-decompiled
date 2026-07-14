/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf {
    static lk field_b;
    static int[] field_a;
    static boolean field_c;

    public static void b(byte param0) {
        if (param0 < 120) {
            field_b = null;
        }
        field_b = null;
        field_a = null;
    }

    final static void a(byte param0) {
        if (k.field_g != 10) {
            // ifne L33
        }
        rh.d((byte) -117);
        k.field_g = 11;
        lh.field_e = true;
        if (param0 < 1) {
            field_b = null;
        }
    }

    final static le[] c(byte param0) {
        le[] var1 = null;
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
        L0: {
          var8 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (param0 == 16) {
            break L0;
          } else {
            cf.a((byte) 37);
            break L0;
          }
        }
        var1 = new le[eg.field_c];
        var2 = 0;
        L1: while (true) {
          if (var2 >= eg.field_c) {
            gb.a(-54);
            return var1;
          } else {
            var3 = da.field_c[var2] * ra.field_ab[var2];
            var23 = cb.field_b[var2];
            if (!j.field_d[var2]) {
              var10 = new int[var3];
              var26 = var10;
              var6 = 0;
              L2: while (true) {
                if (var3 <= var6) {
                  var1[var2] = new le(nj.field_d, qk.field_a, qc.field_P[var2], mb.field_b[var2], da.field_c[var2], ra.field_ab[var2], var26);
                  var2++;
                  continue L1;
                } else {
                  var10[var6] = fk.field_d[ch.a(255, (int) var23[var6])];
                  var6++;
                  continue L2;
                }
              }
            } else {
              var24 = jj.field_E[var2];
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
              L3: while (true) {
                if (var7 >= var3) {
                  var1[var2] = (le) (Object) new ae(nj.field_d, qk.field_a, qc.field_P[var2], mb.field_b[var2], da.field_c[var2], ra.field_ab[var2], var25);
                  var2++;
                  continue L1;
                } else {
                  var6_ref_int__[var7] = bd.a(fk.field_d[ch.a(255, (int) var23[var7])], ch.a(var24[var7] << -1472808104, -16777216));
                  var7++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    final static cc a(int param0) {
        try {
            Throwable var1 = null;
            cc stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            cc stackOut_2_0 = null;
            try {
              L0: {
                if (param0 == 255) {
                  break L0;
                } else {
                  le[] discarded$2 = cf.c((byte) 16);
                  break L0;
                }
              }
              stackOut_2_0 = (cc) Class.forName("nb").newInstance();
              stackIn_3_0 = stackOut_2_0;
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return stackIn_3_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        field_b = new lk();
        field_a = new int[256];
        for (var0 = 0; var0 < 256; var0++) {
            var1 = var0 * 3 / 2 - -var0;
            if (!(255 >= var1)) {
                var1 = 255;
            }
            field_a[var0] = ch.a(16746712, var1 << 138009392);
            field_a[var0] = bd.a(field_a[var0], ch.a(var0 * var0 >> -1260120827, 1962934527) << -1808416344);
        }
    }
}
