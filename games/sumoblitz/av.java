/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class av extends jt {
    private Object field_D;
    static il field_B;
    static int[] field_C;

    final static void a(fs param0, boolean param1) {
        try {
            byte[] var2 = null;
            RuntimeException var2_ref = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            var5 = Sumoblitz.field_L ? 1 : 0;
            try {
              L0: {
                L1: {
                  L2: {
                    var6 = new byte[24];
                    var2 = var6;
                    if (null == pe.field_E) {
                      break L2;
                    } else {
                      try {
                        L3: {
                          pe.field_E.a(-7564, 0L);
                          pe.field_E.a(var6, (byte) 124);
                          var3_int = 0;
                          L4: while (true) {
                            L5: {
                              if (var3_int >= 24) {
                                break L5;
                              } else {
                                if (var2[var3_int] == 0) {
                                  var3_int++;
                                  continue L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            if (var3_int >= 24) {
                              throw new IOException();
                            } else {
                              param0.a(var2, (byte) -123, 24, 0);
                              decompiledRegionSelector0 = 0;
                              break L3;
                            }
                          }
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L6: {
                          var3 = (Exception) (Object) decompiledCaughtException;
                          var4 = 0;
                          L7: while (true) {
                            if (24 <= var4) {
                              decompiledRegionSelector0 = 1;
                              break L6;
                            } else {
                              var2[var4] = (byte) -1;
                              var4++;
                              continue L7;
                            }
                          }
                        }
                      }
                      if (decompiledRegionSelector0 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  param0.a(var2, (byte) -123, 24, 0);
                  break L1;
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L8: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_16_0 = (RuntimeException) var2_ref;
                stackOut_16_1 = new StringBuilder().append("av.H(");
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                if (param0 == null) {
                  stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                  stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                  stackOut_18_2 = "null";
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  break L8;
                } else {
                  stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                  stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                  stackOut_17_2 = "{...}";
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_19_2 = stackOut_17_2;
                  break L8;
                }
              }
              throw qo.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + true + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean e(int param0) {
        int var2 = -48 % ((14 - param0) / 51);
        return false;
    }

    final static void a(int param0, boolean param1, int param2) {
        eh.field_a = 0;
        rc.field_k = param2;
        if (!(0 > rc.field_k)) {
            iv.field_g[rc.field_k].b(-8628, param1);
        }
        if (0 == rc.field_k) {
            if (7 != nj.field_b) {
                ag.a(0, 0);
            }
        }
    }

    av(Object param0, int param1) {
        super(param1);
        try {
            ((av) this).field_D = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "av.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void f(int param0) {
        field_C = null;
        field_B = null;
        if (param0 != 24) {
            av.f(30);
        }
    }

    final Object c(byte param0) {
        int var2 = -15 % ((37 - param0) / 58);
        return ((av) this).field_D;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = new il();
    }
}
