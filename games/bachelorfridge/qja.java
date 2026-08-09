/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qja extends bf {
    nq field_i;

    final static void a(int param0) {
        fr.field_n = false;
        wba.field_a = null;
        ta.field_b = null;
        if (param0 != 0) {
            return;
        }
        vka.field_p = null;
        mq.field_a = null;
    }

    final static void b(int param0, lu param1) {
        try {
            byte[] var2 = null;
            RuntimeException var2_ref = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            String stackIn_21_2 = null;
            Throwable decompiledCaughtException = null;
            var5 = BachelorFridge.field_y;
            try {
              L0: {
                L1: {
                  var6 = new byte[param0];
                  var2 = var6;
                  if (vg.field_n != null) {
                    try {
                      vg.field_n.a(0L, (byte) -114);
                      vg.field_n.a((byte) -102, var6);
                      var3_int = 0;
                      L2: while (true) {
                        L3: {
                          if (-25 >= (var3_int ^ -1)) {
                            break L3;
                          } else {
                            if (0 != var6[var3_int]) {
                              break L3;
                            } else {
                              var3_int++;
                              continue L2;
                            }
                          }
                        }
                        if (24 <= var3_int) {
                          throw new IOException();
                        } else {
                          param1.a(0, param0 + -103, 24, var2);
                          return;
                        }
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L4: {
                        var3 = (Exception) (Object) decompiledCaughtException;
                        var4 = 0;
                        L5: while (true) {
                          if (24 <= var4) {
                            break L4;
                          } else {
                            var2[var4] = (byte)-1;
                            var4++;
                            continue L5;
                          }
                        }
                      }
                    }
                    break L1;
                  } else {
                    break L1;
                  }
                }
                param1.a(0, param0 + -103, 24, var2);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_20_0 = (RuntimeException) (var2_ref);

                stackIn_20_1 = new StringBuilder().append("qja.D(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
                  stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                  stackIn_21_2 = "null";
                  break L6;
                } else {
                  stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
                  stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                  stackIn_21_2 = "{...}";
                  break L6;
                }
              }
              throw pe.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(op param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -26281) {
                break L1;
              } else {
                this.field_i = (nq) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("qja.C(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    qja(nq param0) {
        try {
            this.field_i = param0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "qja.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, lu param1) {
        try {
            er.a(this.field_i, 123, param1);
            int var3_int = -82 / ((param0 - -53) / 50);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "qja.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    qja(lu param0) {
        try {
            this.field_i = qi.a(param0, (byte) 19);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "qja.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
