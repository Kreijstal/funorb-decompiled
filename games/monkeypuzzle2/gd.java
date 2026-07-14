/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd {
    static String field_a;

    public static void a(int param0) {
        int var1 = 112 / ((param0 - 69) / 54);
        field_a = null;
    }

    final static void b(int param0) {
        try {
            Exception var1 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (null != hj.field_D) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        MonkeyPuzzle2.field_D.field_h = MonkeyPuzzle2.field_D.field_h + 24;
                        if (param0 == -594181854) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        gd.b(-122);
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        return;
                    }
                    case 4: {
                        try {
                            hj.field_D.a((byte) 89, 0L);
                            hj.field_D.a(MonkeyPuzzle2.field_D.field_g, MonkeyPuzzle2.field_D.field_h, (byte) 34, 24);
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        MonkeyPuzzle2.field_D.field_h = MonkeyPuzzle2.field_D.field_h + 24;
                        if (param0 == -594181854) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        gd.b(-122);
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        return;
                    }
                    case 8: {
                        var1 = (Exception) (Object) caughtException;
                        MonkeyPuzzle2.field_D.field_h = MonkeyPuzzle2.field_D.field_h + 24;
                        if (param0 != -594181854) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        return;
                    }
                    case 10: {
                        gd.b(-122);
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0) {
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
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 == 8) {
          var10 = MonkeyPuzzle2.field_D;
          var2 = var10.a((byte) 114);
          var3 = var10.a((byte) 114);
          if (0 != var2) {
            if (1 == var2) {
              var4 = var10.h(-129);
              var5 = (wf) (Object) k.field_l.a((byte) -117);
              L0: while (true) {
                if (var5 == null) {
                  if (var5 == null) {
                    gk.a(-1);
                    return;
                  } else {
                    var5.c(param0 + -19830);
                    return;
                  }
                } else {
                  L1: {
                    if (var5.field_e != var3) {
                      break L1;
                    } else {
                      if (var5.field_f != var4) {
                        break L1;
                      } else {
                        if (var5 == null) {
                          gk.a(-1);
                          return;
                        } else {
                          var5.c(param0 + -19830);
                          return;
                        }
                      }
                    }
                  }
                  var5 = (wf) (Object) k.field_l.d((byte) 63);
                  continue L0;
                }
              }
            } else {
              kk.a("LR1: " + bh.a((byte) -128), (byte) 118, (Throwable) null);
              gk.a(-1);
              return;
            }
          } else {
            var4_ref_bk = (bk) (Object) wg.field_k.a((byte) -117);
            if (var4_ref_bk == null) {
              gk.a(-1);
              return;
            } else {
              L2: {
                var5_int = -var10.field_h + rc.field_f;
                var14 = var4_ref_bk.field_g;
                var13 = var14;
                var12 = var13;
                var11 = var12;
                var6 = var11;
                if (var14.length << -150891774 < var5_int) {
                  var5_int = var14.length << -594181854;
                  break L2;
                } else {
                  break L2;
                }
              }
              var7 = 0;
              L3: while (true) {
                if (var5_int <= var7) {
                  var4_ref_bk.c(-19822);
                  return;
                } else {
                  var6[var7 >> -2053077342] = var6[var7 >> -2053077342] + (var10.a((byte) 114) << ch.a(var7 << 613902696, 768));
                  var7++;
                  continue L3;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Unpacking graphics";
    }
}
