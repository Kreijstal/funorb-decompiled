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
        L0: {
          L1: {
            if (k.field_g == 10) {
              break L1;
            } else {
              if (ej.a(12931)) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          rh.d((byte) -117);
          k.field_g = 11;
          break L0;
        }
        L2: {
          lh.field_e = true;
          if (param0 >= 1) {
            break L2;
          } else {
            field_b = (lk) null;
            break L2;
          }
        }
    }

    final static le[] c(byte param0) {
        le[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var6 = 0;
        int[] var6_ref_int__ = null;
        int var7 = 0;
        int var8 = 0;
        int[] var10 = null;
        int[] var12 = null;
        int[] var14 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        boolean stackIn_5_0 = false;
        int stackIn_22_0 = 0;
        int stackOut_21_0 = 0;
        boolean stackOut_4_0 = false;
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
          L2: {
            if (var2 >= eg.field_c) {
              stackOut_21_0 = -54;
              stackIn_22_0 = stackOut_21_0;
              break L2;
            } else {
              var3 = da.field_c[var2] * ra.field_ab[var2];
              var17 = cb.field_b[var2];
              stackOut_4_0 = j.field_d[var2];
              stackIn_22_0 = stackOut_4_0 ? 1 : 0;
              stackIn_5_0 = stackOut_4_0;
              if (var8 != 0) {
                break L2;
              } else {
                L3: {
                  L4: {
                    L5: {
                      if (!stackIn_5_0) {
                        break L5;
                      } else {
                        var18 = jj.field_E[var2];
                        var14 = new int[var3];
                        var12 = var14;
                        var6_ref_int__ = var12;
                        var7 = 0;
                        L6: while (true) {
                          L7: {
                            if (var7 >= var3) {
                              var1[var2] = (le) ((Object) new ae(nj.field_d, qk.field_a, qc.field_P[var2], mb.field_b[var2], da.field_c[var2], ra.field_ab[var2], var14));
                              break L7;
                            } else {
                              var6_ref_int__[var7] = bd.a(fk.field_d[ch.a(255, (int) var17[var7])], ch.a(var18[var7] << -1472808104, -16777216));
                              var7++;
                              if (var8 != 0) {
                                break L7;
                              } else {
                                continue L6;
                              }
                            }
                          }
                          if (var8 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    var10 = new int[var3];
                    var6 = 0;
                    L8: while (true) {
                      if (var3 <= var6) {
                        var1[var2] = new le(nj.field_d, qk.field_a, qc.field_P[var2], mb.field_b[var2], da.field_c[var2], ra.field_ab[var2], var10);
                        break L4;
                      } else {
                        var10[var6] = fk.field_d[ch.a(255, (int) var17[var6])];
                        var6++;
                        if (var8 != 0) {
                          break L3;
                        } else {
                          continue L8;
                        }
                      }
                    }
                  }
                  var2++;
                  break L3;
                }
                continue L1;
              }
            }
          }
          gb.a(stackIn_22_0);
          return var1;
        }
    }

    final static cc a(int param0) {
        try {
            le[] discarded$2 = null;
            Throwable var1 = null;
            cc stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            cc stackOut_2_0 = null;
            try {
              L0: {
                L1: {
                  if (param0 == 255) {
                    break L1;
                  } else {
                    discarded$2 = cf.c((byte) 16);
                    break L1;
                  }
                }
                stackOut_2_0 = (cc) (Class.forName("nb").newInstance());
                stackIn_3_0 = stackOut_2_0;
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
