/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd {
    static String field_a;

    public static void a(int param0) {
        int var1 = -56;
        field_a = null;
    }

    final static void b(int param0) {
        try {
            Exception var1 = null;
            Throwable decompiledCaughtException = null;
            if (null != hj.field_D) {
              try {
                L0: {
                  hj.field_D.a((byte) 89, 0L);
                  hj.field_D.a(MonkeyPuzzle2.field_D.field_g, MonkeyPuzzle2.field_D.field_h, (byte) 34, 24);
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (Exception) (Object) decompiledCaughtException;
                MonkeyPuzzle2.field_D.field_h = MonkeyPuzzle2.field_D.field_h + 24;
                if (param0 != -594181854) {
                  gd.b(-122);
                  return;
                } else {
                  return;
                }
              }
              L1: {
                MonkeyPuzzle2.field_D.field_h = MonkeyPuzzle2.field_D.field_h + 24;
                if (param0 == -594181854) {
                  break L1;
                } else {
                  gd.b(-122);
                  break L1;
                }
              }
              return;
            } else {
              L2: {
                MonkeyPuzzle2.field_D.field_h = MonkeyPuzzle2.field_D.field_h + 24;
                if (param0 == -594181854) {
                  break L2;
                } else {
                  gd.b(-122);
                  break L2;
                }
              }
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        bk var4_ref_bk = null;
        int var4 = 0;
        wf var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        hb var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var10 = MonkeyPuzzle2.field_D;
            var2 = var10.a((byte) 114);
            var3 = var10.a((byte) 114);
            if (0 != var2) {
              if (1 != var2) {
                kk.a("LR1: " + bh.a((byte) -128), (byte) 118, (Throwable) null);
                gk.a(-1);
                break L0;
              } else {
                var4 = var10.h(-129);
                var5 = (wf) (Object) k.field_l.a((byte) -117);
                L1: while (true) {
                  L2: {
                    if (var5 == null) {
                      break L2;
                    } else {
                      L3: {
                        if (var5.field_e != var3) {
                          break L3;
                        } else {
                          if (var5.field_f != var4) {
                            break L3;
                          } else {
                            break L2;
                          }
                        }
                      }
                      var5 = (wf) (Object) k.field_l.d((byte) 63);
                      continue L1;
                    }
                  }
                  if (var5 != null) {
                    var5.c(-19822);
                    return;
                  } else {
                    gk.a(-1);
                    return;
                  }
                }
              }
            } else {
              var4_ref_bk = (bk) (Object) wg.field_k.a((byte) -117);
              if (var4_ref_bk == null) {
                gk.a(-1);
                return;
              } else {
                L4: {
                  var5_int = -var10.field_h + rc.field_f;
                  var14 = var4_ref_bk.field_g;
                  var13 = var14;
                  var12 = var13;
                  var11 = var12;
                  var6 = var11;
                  if (var14.length << 2 < var5_int) {
                    var5_int = var14.length << 2;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var7 = 0;
                L5: while (true) {
                  if (var5_int <= var7) {
                    var4_ref_bk.c(-19822);
                    return;
                  } else {
                    var6[var7 >> 2] = var6[var7 >> 2] + (var10.a((byte) 114) << ch.a(var7 << 8, 768));
                    var7++;
                    continue L5;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var1, "gd.A(" + 8 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Unpacking graphics";
    }
}
