/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rn extends RuntimeException {
    Throwable field_a;
    static int[] field_f;
    static int[] field_b;
    String field_g;
    static hf field_c;
    static int[] field_d;
    static int field_e;

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_b = null;
        field_f = null;
        field_c = null;
        field_d = null;
    }

    final static boolean a(int param0) {
        if (param0 == -31879) {
          if (pg.field_c != null) {
            if (!al.field_d.a((byte) 63)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          rn.a(21, -45);
          if (pg.field_c != null) {
            if (!al.field_d.a((byte) 63)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    rn(Throwable param0, String param1) {
        ((rn) this).field_g = param1;
        ((rn) this).field_a = param0;
    }

    final static tk a(String param0, int param1) {
        int var2 = 0;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        tk var7 = null;
        int var8 = 0;
        var8 = EscapeVector.field_A;
        var2 = param0.length();
        if (-1 == (var2 ^ -1)) {
          return mf.field_d;
        } else {
          if (var2 >= -256) {
            var3 = bb.a(-128, param0, '.');
            if (-3 <= var3.length) {
              var4 = var3;
              var5 = param1;
              L0: while (true) {
                if (var4.length > var5) {
                  var6 = var4[var5];
                  var7 = vk.a(var6, param1 + -116);
                  if (var7 == null) {
                    var5++;
                    continue L0;
                  } else {
                    return var7;
                  }
                } else {
                  return co.a(var3[var3.length - 1], 0);
                }
              }
            } else {
              return mf.field_d;
            }
          } else {
            return d.field_c;
          }
        }
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
                        if (pg.field_c == null) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if (0 > param0) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        if (al.field_d != ck.field_t) {
                            statePc = 4;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        om.field_c.field_m = 0;
                        return;
                    }
                    case 5: {
                        if (om.field_c.field_m != 0) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        if ((10000L + le.field_c ^ -1L) > (td.b(128) ^ -1L)) {
                            statePc = 8;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        om.field_c.a(param0, true);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (0 >= om.field_c.field_m) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        try {
                            pg.field_c.a(om.field_c.field_m, 0, om.field_c.field_g, 5000);
                            le.field_c = td.b(128);
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
                        nm.a(16);
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
                        om.field_c.field_m = 0;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        if (param1 != 30785) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        return;
                    }
                    case 16: {
                        rn.a(true);
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[]{29, 0, 0, -3, -3};
        field_f = new int[]{19, 0, -10, -5, -5};
        field_b = new int[17];
        int[] var1 = new int[]{29, 0, 0, -3, -3};
        int[] var0 = var1;
        qg.a(var0, 0, field_b, 0, var1.length);
        field_f = new int[17];
        int[] var2 = new int[]{19, 0, -10, -5, -5};
        var0 = var2;
        qg.a(var0, 0, field_f, 0, var2.length);
        field_c = new hf();
        field_d = new int[8192];
    }
}
