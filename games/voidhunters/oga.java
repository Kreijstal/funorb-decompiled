/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class oga extends rqa {
    static int field_o;

    oga(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -119) {
                break L1;
              } else {
                var4 = null;
                nc discarded$2 = ((oga) this).a((nc[]) null, 8);
                break L1;
              }
            }
            stackOut_2_0 = new nc((Object) (Object) frb.a(32, 118));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("oga.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        if (param0 <= 27) {
            boolean discarded$0 = oga.a(23, 89, -52, 81, -123, -26, false);
        }
        int discarded$5 = 105;
        if (!(!wq.e())) {
            gaa.a(param2, 11343, param4, param6);
            if (null != cka.field_o) {
                if (cka.field_o.a(param6, -11, param1, param4, param3)) {
                    int discarded$6 = 0;
                    lnb.d();
                    param6 = false;
                }
            }
            jra.a(param4, param6, 19717);
            oj.a((byte) -127, param6, param5);
            param6 = false;
        }
        return param6;
    }

    final static boolean a(char param0) {
        if (param0 >= 32) {
            if (!(param0 > 126)) {
                return true;
            }
        }
        if (160 <= param0) {
            if (!(param0 > 255)) {
                return true;
            }
        }
        if (param0 != 8364) {
            if (param0 != 338) {
                if (8212 != param0) {
                    if (param0 != 339) {
                        if (param0 != 376) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    final static void a() {
        try {
            int var1_int = 0;
            RuntimeException var1 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            var3 = VoidHunters.field_G;
            try {
              L0: {
                L1: {
                  if (ff.field_o == null) {
                    break L1;
                  } else {
                    ff.field_o.a(116);
                    break L1;
                  }
                }
                L2: {
                  if (nj.field_a == null) {
                    break L2;
                  } else {
                    nj.field_a.a(23474);
                    break L2;
                  }
                }
                L3: {
                  if (cba.field_e != null) {
                    {
                      L4: {
                        cba.field_e.a(true);
                        break L4;
                      }
                    }
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L6: {
                  if (null != btb.field_d) {
                    var1_int = 0;
                    L7: while (true) {
                      if (var1_int >= btb.field_d.length) {
                        break L6;
                      } else {
                        L8: {
                          if (null == btb.field_d[var1_int]) {
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var1_int++;
                        continue L7;
                      }
                    }
                  } else {
                    break L6;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = (RuntimeException) (Object) decompiledCaughtException;
              throw rta.a((Throwable) (Object) var1, "oga.D(" + 16928 + ')');
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
        field_o = 0;
    }
}
