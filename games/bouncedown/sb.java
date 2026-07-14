/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sb {
    int field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(wi param0, byte param1) {
        try {
            byte[] var2 = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            Object var6 = null;
            byte[] var7 = null;
            byte[] var8 = null;
            byte[] var9 = null;
            byte[] var10 = null;
            byte[] var11 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              var5 = Bounce.field_N;
              var10 = new byte[24];
              var8 = var10;
              var7 = var8;
              var11 = var7;
              var9 = var11;
              var2 = var9;
              if (null == gf.field_g) {
                break L0;
              } else {
                try {
                  gf.field_g.a((byte) 57, 0L);
                  gf.field_g.a(0, var10);
                  var3_int = 0;
                  L1: while (true) {
                    L2: {
                      if (var3_int >= 24) {
                        break L2;
                      } else {
                        if (0 == var11[var3_int]) {
                          var3_int++;
                          continue L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    if (-25 < (var3_int ^ -1)) {
                      break L1;
                    } else {
                      throw new IOException();
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var3 = (Exception) (Object) decompiledCaughtException;
                  var4 = 0;
                  L3: while (true) {
                    if ((var4 ^ -1) <= -25) {
                      break L3;
                    } else {
                      var2[var4] = (byte)-1;
                      var4++;
                      continue L3;
                    }
                  }
                }
                break L0;
              }
            }
            L4: {
              param0.a(0, true, 24, var11);
              if (param1 == 25) {
                break L4;
              } else {
                var6 = null;
                sb.a((wi) null, (byte) -47);
                break L4;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    sb(int param0) {
        ((sb) this).field_a = param0;
    }

    static {
    }
}
