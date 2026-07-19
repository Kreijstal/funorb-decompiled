/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bm extends mc {
    static int field_q;
    int field_t;
    static String field_s;
    int field_r;
    static int field_n;
    static int field_p;
    static String field_o;

    public static void b(byte param0) {
        if (param0 < 57) {
            return;
        }
        field_s = null;
        field_o = null;
    }

    final static kl a(int param0, int param1, int param2, int param3, int param4, ie param5) {
        java.awt.Component discarded$2 = null;
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        kl var7 = null;
        java.awt.Frame var8 = null;
        kl stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        kl stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var8 = sk.a(param2, param5, 10, param3, param4, param0);
            var6 = var8;
            if (var8 != null) {
              var7 = new kl();
              var7.field_d = var8;
              discarded$2 = var7.field_d.add((java.awt.Component) ((Object) var7));
              var7.setBounds(0, param1, param3, param0);
              var7.addFocusListener(var7);
              var7.requestFocus();
              stackOut_3_0 = (kl) (var7);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var6_ref);
            stackOut_5_1 = new StringBuilder().append("bm.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param5 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    private bm() throws Throwable {
        throw new Error();
    }

    final static void a(int param0) {
        try {
            IOException iOException = null;
            IOException var2_ref = null;
            int var1_int = 0;
            RuntimeException var1 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            var3 = TetraLink.field_J;
            try {
              L0: {
                L1: {
                  if (null == vh.field_e) {
                    break L1;
                  } else {
                    vh.field_e.a((byte) 80);
                    break L1;
                  }
                }
                L2: {
                  if (null != qc.field_X) {
                    qc.field_X.b(-23641);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (null == ch.field_r) {
                    break L3;
                  } else {
                    try {
                      L4: {
                        ch.field_r.a(param0 ^ 25675);
                        break L4;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        iOException = (IOException) (Object) decompiledCaughtException;
                        break L5;
                      }
                    }
                    break L3;
                  }
                }
                L6: {
                  if (param0 == -25676) {
                    break L6;
                  } else {
                    field_s = (String) null;
                    break L6;
                  }
                }
                L7: {
                  if (null != ok.field_b) {
                    var1_int = 0;
                    L8: while (true) {
                      if (var1_int >= ok.field_b.length) {
                        break L7;
                      } else {
                        L9: {
                          if (ok.field_b[var1_int] != null) {
                            try {
                              L10: {
                                ok.field_b[var1_int].a(-1);
                                break L10;
                              }
                            } catch (java.io.IOException decompiledCaughtParameter1) {
                              decompiledCaughtException = decompiledCaughtParameter1;
                              L11: {
                                var2_ref = (IOException) (Object) decompiledCaughtException;
                                break L11;
                              }
                            }
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        var1_int++;
                        continue L8;
                      }
                    }
                  } else {
                    break L7;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (RuntimeException) (Object) decompiledCaughtException;
              throw oi.a((Throwable) ((Object) var1), "bm.D(" + param0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void b(int param0, int param1) {
        if ((param1 ^ -1) != param0) {
            throw new IllegalArgumentException();
        }
    }

    static {
        field_o = "Name";
    }
}
