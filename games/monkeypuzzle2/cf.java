/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf {
    static lk field_b;
    static int[] field_a;
    static boolean field_c;

    public static void b(byte param0) {
        if (param0 < 120) {
            field_b = (lk) null;
        }
        field_b = null;
        field_a = null;
    }

    final static void a(byte param0) {
        if (k.field_g == 10 || !ej.a(12931)) {
            rh.d((byte) -117);
            k.field_g = 11;
        }
        lh.field_e = true;
        if (param0 < 1) {
            field_b = (lk) null;
        }
    }

    final static le[] c(byte param0) {
        le[] var1;
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
            var21 = cb.field_b[var2];
            if (!j.field_d[var2]) {
              var10 = new int[var3];
              var22 = var10;
              var6 = 0;
              L2: while (true) {
                if (var3 <= var6) {
                  var1[var2] = new le(nj.field_d, qk.field_a, qc.field_P[var2], mb.field_b[var2], da.field_c[var2], ra.field_ab[var2], var22);
                  var2++;
                  continue L1;
                } else {
                  var10[var6] = fk.field_d[ch.a(255, (int) var21[var6])];
                  var6++;
                  continue L2;
                }
              }
            } else {
              var16 = jj.field_E[var2];
              var12 = var16;
              var9 = var12;
              var5 = var9;
              var17 = new int[var3];
              var13 = var17;
              var6_ref_int__ = var13;
              var7 = 0;
              L3: while (true) {
                if (var7 >= var3) {
                  var1[var2] = (le) ((Object) new ae(nj.field_d, qk.field_a, qc.field_P[var2], mb.field_b[var2], da.field_c[var2], ra.field_ab[var2], var17));
                  var2++;
                  continue L1;
                } else {
                  var6_ref_int__[var7] = bd.a(fk.field_d[ch.a(255, (int) var21[var7])], ch.a(var16[var7] << -1472808104, -16777216));
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
            try {
              L0: {
                L1: {
                  if (param0 == 255) {
                    break L1;
                  } else {
                    cf.c((byte) 16);
                    break L1;
                  }
                }
                stackIn_3_0 = (cc) (Class.forName("nb").newInstance());
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = decompiledCaughtException;
              return null;
            }
            return stackIn_3_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
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
