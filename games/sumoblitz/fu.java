/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fu extends wp {
    int field_J;
    private rs field_H;
    static String field_F;
    static String field_E;
    int field_I;
    private int field_G;

    final static void a(int param0) {
        try {
            IOException iOException = null;
            int var1 = 0;
            IOException var2 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var3 = Sumoblitz.field_L ? 1 : 0;
                        if (null == jk.field_b) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        jk.field_b.c(-106);
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        if (in.field_D != null) {
                            statePc = 4;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        in.field_D.b(109);
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        if (null != bc.field_a) {
                            statePc = 7;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        try {
                            bc.field_a.b(-1);
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (param0 == -1) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        field_F = null;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        if (m.field_O == null) {
                            statePc = 21;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        var1 = 0;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        if (m.field_O.length <= var1) {
                            statePc = 21;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        if (null != m.field_O[var1]) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        var1++;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 18: {
                        try {
                            m.field_O[var1].b(-1);
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        var1++;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 20: {
                        var2 = (IOException) (Object) caughtException;
                        var1++;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 21: {
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

    public static void d(boolean param0) {
        field_E = null;
        if (param0) {
            fu.a(78);
        }
        field_F = null;
    }

    final int a(int param0, int param1) {
        L0: {
          if (-1 < (param0 ^ -1)) {
            break L0;
          } else {
            if (param0 < ((fu) this).field_H.a((byte) 51)) {
              L1: {
                if (param1 == -24194) {
                  break L1;
                } else {
                  int discarded$2 = ((fu) this).g(-5);
                  break L1;
                }
              }
              return ((fu) this).field_H.d(param0, -29816);
            } else {
              break L0;
            }
          }
        }
        return -1;
    }

    final int h(int param0) {
        if (param0 != -1) {
            ((fu) this).field_I = 54;
        }
        return ((fu) this).field_G;
    }

    final int g(int param0) {
        if (param0 != 0) {
            ((fu) this).field_I = 112;
        }
        return ((fu) this).field_H.a((byte) 70);
    }

    final boolean a(pk param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        L0: {
          var14 = Sumoblitz.field_L ? 1 : 0;
          if (param1 <= -42) {
            break L0;
          } else {
            fu.f(-122);
            break L0;
          }
        }
        if (super.a(param0, -105, param2, param3, param4, param5, param6)) {
          L1: {
            var8 = param5 - (param4 + ((fu) this).field_I);
            var9 = -(((fu) this).field_I * 2) + ((fu) this).field_q;
            if (var9 < var8) {
              var8 = var9;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (-1 < (var8 ^ -1)) {
              var8 = 0;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            var8 = var8 * ((fu) this).field_G / var9;
            if (param3 != 1) {
              if ((param3 ^ -1) == -3) {
                var10 = 2147483647;
                var11 = -1;
                var12 = 0;
                L4: while (true) {
                  if (var12 >= ((fu) this).field_H.a((byte) 29)) {
                    if ((var11 ^ -1) > -1) {
                      break L3;
                    } else {
                      ((fu) this).field_H.a((byte) 61, var11);
                      break L3;
                    }
                  } else {
                    var13 = ((fu) this).field_H.d(var12, -29816) + -var8;
                    var13 = var13 * var13;
                    if (var10 > var13) {
                      var11 = var12;
                      var10 = var13;
                      var12++;
                      continue L4;
                    } else {
                      var12++;
                      continue L4;
                    }
                  }
                }
              } else {
                break L3;
              }
            } else {
              ((fu) this).field_H.c(-18, var8);
              break L3;
            }
          }
          return true;
        } else {
          return false;
        }
    }

    final static int e(byte param0) {
        int var1 = 126 % ((param0 - -26) / 38);
        return rf.field_d;
    }

    private fu() throws Throwable {
        throw new Error();
    }

    final static void f(int param0) {
        try {
            if (!(pe.field_E == null)) {
                try {
                    pe.field_E.a(-7564, 0L);
                    pe.field_E.a(ig.field_a.field_n, 24, (byte) -41, ig.field_a.field_p);
                } catch (Exception exception) {
                }
            }
            ig.field_a.field_p = ig.field_a.field_p + param0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = "Names can only contain letters, numbers, spaces and underscores";
    }
}
