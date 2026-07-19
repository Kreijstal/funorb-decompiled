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
        int stackIn_22_0 = 0;
        int stackIn_29_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_21_0 = 0;
        int stackOut_28_0 = 0;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (param0 == 8) {
              L1: {
                L2: {
                  var10 = MonkeyPuzzle2.field_D;
                  var2 = var10.a((byte) 114);
                  var3 = var10.a((byte) 114);
                  if (0 != var2) {
                    break L2;
                  } else {
                    var4_ref_bk = (bk) ((Object) wg.field_k.a((byte) -117));
                    if (var4_ref_bk == null) {
                      gk.a(-1);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L3: {
                        var5_int = -var10.field_h + rc.field_f;
                        var12 = var4_ref_bk.field_g;
                        var11 = var12;
                        var6 = var11;
                        if (var12.length << -150891774 < var5_int) {
                          var5_int = var12.length << -594181854;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var7 = 0;
                      L4: while (true) {
                        L5: {
                          if (var5_int <= var7) {
                            var4_ref_bk.c(-19822);
                            break L5;
                          } else {
                            var6[var7 >> -2053077342] = var6[var7 >> -2053077342] + (var10.a((byte) 114) << ch.a(var7 << 613902696, 768));
                            var7++;
                            if (var8 != 0) {
                              break L5;
                            } else {
                              continue L4;
                            }
                          }
                        }
                        if (var8 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                L6: {
                  if (1 != var2) {
                    break L6;
                  } else {
                    var4 = var10.h(-129);
                    var5 = (wf) ((Object) k.field_l.a((byte) -117));
                    L7: while (true) {
                      L8: {
                        L9: {
                          if (var5 == null) {
                            break L9;
                          } else {
                            stackOut_21_0 = var5.field_e;
                            stackIn_29_0 = stackOut_21_0;
                            stackIn_22_0 = stackOut_21_0;
                            if (var8 != 0) {
                              break L8;
                            } else {
                              L10: {
                                if (stackIn_22_0 != var3) {
                                  break L10;
                                } else {
                                  if (var5.field_f != var4) {
                                    break L10;
                                  } else {
                                    if (var8 == 0) {
                                      break L9;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                              }
                              var5 = (wf) ((Object) k.field_l.d((byte) 63));
                              if (var8 == 0) {
                                continue L7;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                        if (var5 != null) {
                          var5.c(param0 + -19830);
                          if (var8 == 0) {
                            break L1;
                          } else {
                            break L6;
                          }
                        } else {
                          stackOut_28_0 = -1;
                          stackIn_29_0 = stackOut_28_0;
                          break L8;
                        }
                      }
                      gk.a(stackIn_29_0);
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  }
                }
                kk.a("LR1: " + bh.a((byte) -128), (byte) 118, (Throwable) null);
                gk.a(-1);
                break L1;
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "gd.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    static {
        field_a = "Unpacking graphics";
    }
}
