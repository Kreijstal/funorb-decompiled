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
        int var5 = 0;
        String var6 = null;
        tk var7 = null;
        int var8 = EscapeVector.field_A;
        int var2 = param0.length();
        if (!(-1 != (var2 ^ -1))) {
            return mf.field_d;
        }
        if ((var2 ^ -1) < -256) {
            return d.field_c;
        }
        String[] var3 = bb.a(-128, param0, '.');
        if (-3 < (var3.length ^ -1)) {
            return mf.field_d;
        }
        String[] var4 = var3;
        for (var5 = param1; (var4.length ^ -1) < (var5 ^ -1); var5++) {
            var6 = var4[var5];
            var7 = vk.a(var6, param1 + -116);
            if (var7 != null) {
                return var7;
            }
        }
        return co.a(var3[var3.length - 1], 0);
    }

    final static void a(int param0, int param1) {
        try {
            IOException iOException = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (pg.field_c == null) {
                break L0;
              } else {
                L1: {
                  if (0 > param0) {
                    break L1;
                  } else {
                    if (al.field_d != ck.field_t) {
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if (om.field_c.field_m != 0) {
                    break L2;
                  } else {
                    if ((10000L + le.field_c ^ -1L) > (td.b(128) ^ -1L)) {
                      om.field_c.a(param0, true);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (0 >= om.field_c.field_m) {
                    break L3;
                  } else {
                    try {
                      L4: {
                        pg.field_c.a(om.field_c.field_m, 0, om.field_c.field_g, 5000);
                        le.field_c = td.b(128);
                        break L4;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        iOException = (IOException) (Object) decompiledCaughtException;
                        nm.a(16);
                        break L5;
                      }
                    }
                    om.field_c.field_m = 0;
                    break L3;
                  }
                }
                if (param1 != 30785) {
                  rn.a(true);
                  return;
                } else {
                  return;
                }
              }
            }
            om.field_c.field_m = 0;
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
