/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class lc extends pa {
    static int field_r;
    static String field_s;
    static String field_q;
    static int[] field_v;
    static dd field_t;
    static int field_u;

    final static void a(ni param0, byte param1) {
        try {
            byte[] var2 = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            byte[] var7 = null;
            byte[] var8 = null;
            byte[] var9 = null;
            byte[] var10 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              var5 = fleas.field_A ? 1 : 0;
              var9 = new byte[24];
              var7 = var9;
              var6 = var7;
              var10 = var6;
              var8 = var10;
              var2 = var8;
              if (null != ge.field_d) {
                try {
                  L1: {
                    ge.field_d.a(param1 ^ 14, 0L);
                    ge.field_d.a(631, var9);
                    var3_int = 0;
                    L2: while (true) {
                      L3: {
                        if (var3_int >= 24) {
                          break L3;
                        } else {
                          if (-1 == (var10[var3_int] ^ -1)) {
                            var3_int++;
                            continue L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      if ((var3_int ^ -1) <= -25) {
                        throw new IOException();
                      } else {
                        break L1;
                      }
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    var4 = 0;
                    L5: while (true) {
                      if ((var4 ^ -1) <= -25) {
                        break L4;
                      } else {
                        var2[var4] = (byte)-1;
                        var4++;
                        continue L5;
                      }
                    }
                  }
                }
                break L0;
              } else {
                break L0;
              }
            }
            L6: {
              param0.a(var10, 24, 0, 0);
              if (param1 == -113) {
                break L6;
              } else {
                lc.c((byte) -96);
                break L6;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    lc() {
    }

    final static String f(int param0) {
        if (!(wi.field_f != cb.field_v)) {
            return ef.field_j;
        }
        if (param0 != 0) {
            return null;
        }
        return jk.field_j;
    }

    public static void c(byte param0) {
        field_s = null;
        field_q = null;
        if (param0 != 99) {
            return;
        }
        field_t = null;
        field_v = null;
    }

    final static jh a(byte[] param0, boolean param1) {
        if (param0 == null) {
            return null;
        }
        jh var2 = new jh(param0, vg.field_I, b.field_b, ij.field_H, ob.field_a, of.field_d);
        c.o(-28210);
        if (param1) {
            String discarded$0 = lc.f(105);
        }
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Account created successfully!";
        field_s = "Suggested names: ";
        field_v = new int[5];
    }
}
