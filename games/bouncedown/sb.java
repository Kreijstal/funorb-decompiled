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
            wi var6 = null;
            byte[] var7 = null;
            byte[] var8 = null;
            byte[] var9 = null;
            byte[] var10 = null;
            byte[] var11 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException var2_ref = null;
            var5 = Bounce.field_N;
            try {
              L0: {
                L1: {
                  var10 = new byte[24];
                  var8 = var10;
                  var7 = var8;
                  var11 = var7;
                  var9 = var11;
                  var2 = var9;
                  if (null == gf.field_g) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        gf.field_g.a((byte) 57, 0L);
                        gf.field_g.a(0, var10);
                        var3_int = 0;
                        L3: while (true) {
                          L4: {
                            if (var3_int >= 24) {
                              break L4;
                            } else {
                              if (0 == var11[var3_int]) {
                                var3_int++;
                                continue L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          if (-25 < (var3_int ^ -1)) {
                            break L2;
                          } else {
                            throw new IOException();
                          }
                        }
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        var3 = (Exception) (Object) decompiledCaughtException;
                        var4 = 0;
                        L6: while (true) {
                          if ((var4 ^ -1) <= -25) {
                            break L5;
                          } else {
                            var2[var4] = (byte)-1;
                            var4++;
                            continue L6;
                          }
                        }
                      }
                    }
                    break L1;
                  }
                }
                L7: {
                  param0.a(0, true, 24, var11);
                  if (param1 == 25) {
                    break L7;
                  } else {
                    var6 = (wi) null;
                    sb.a((wi) null, (byte) -47);
                    break L7;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L8: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_19_0 = (RuntimeException) (var2_ref);

                stackIn_19_1 = new StringBuilder().append("sb.A(");

                if (param0 == null) {
                  stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "null";
                  break L8;
                } else {
                  stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "{...}";
                  break L8;
                }
              }
              throw ii.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    sb(int param0) {
        this.field_a = param0;
    }

    static {
    }
}
