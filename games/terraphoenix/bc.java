/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bc {
    static String field_c;
    static String field_b;
    static int field_a;
    private int[] field_d;

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_b = null;
        field_c = null;
    }

    final static void a(int param0, int param1) {
        try {
            IOException iOException = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (null == ig.field_e) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if (-1 < param0) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        if (od.field_g == mh.field_a) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        di.field_l.field_k = 0;
                        return;
                    }
                    case 5: {
                        if (-1 != di.field_l.field_k) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        if ((ll.a(1000) ^ -1L) < (10000L + bl.field_h ^ -1L)) {
                            statePc = 8;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        di.field_l.k(-17410, param0);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if ((di.field_l.field_k ^ -1) >= -1) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        try {
                            ig.field_e.a(di.field_l.field_k, 0, (byte) -97, di.field_l.field_i);
                            bl.field_h = ll.a(param1 ^ 1000);
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        iOException = (IOException) (Object) caughtException;
                        gb.g(-17464);
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
                        di.field_l.field_k = 0;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        if (param1 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        bc.a(true);
                        return;
                    }
                    case 16: {
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

    final static byte[] a(String param0, boolean param1) {
        if (param1) {
            return null;
        }
        return fh.field_d.a("", param0, -21653);
    }

    final int b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var3 = (((bc) this).field_d.length >> -911365151) - param0;
        var4 = param1 & var3;
        L0: while (true) {
          var5 = ((bc) this).field_d[var4 - -var4 - -1];
          if ((var5 ^ -1) == 0) {
            return -1;
          } else {
            if (((bc) this).field_d[var4 - -var4] != param1) {
              var4 = var3 & var4 + 1;
              continue L0;
            } else {
              return var5;
            }
          }
        }
    }

    bc(int[] param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var2 = 1;
        L0: while (true) {
          if (var2 > param0.length - -(param0.length >> 1390928641)) {
            ((bc) this).field_d = new int[var2 + var2];
            var3 = 0;
            L1: while (true) {
              if (var2 + var2 <= var3) {
                var3 = 0;
                L2: while (true) {
                  if (param0.length > var3) {
                    var4 = -1 + var2 & param0[var3];
                    L3: while (true) {
                      if (-1 == ((bc) this).field_d[var4 + var4 + 1]) {
                        ((bc) this).field_d[var4 + var4] = param0[var3];
                        ((bc) this).field_d[var4 + (var4 + 1)] = var3;
                        var3++;
                        continue L2;
                      } else {
                        var4 = var2 - 1 & var4 + 1;
                        continue L3;
                      }
                    }
                  } else {
                  }
                }
              } else {
                ((bc) this).field_d[var3] = -1;
                var3++;
                continue L1;
              }
            }
          } else {
            var2 = var2 << 1;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "NO";
        field_c = "Throw TQ: ";
        field_a = 100;
    }
}
