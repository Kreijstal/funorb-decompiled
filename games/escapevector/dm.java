/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dm extends hg {
    byte[] field_j;
    int field_i;
    static int field_h;
    long field_g;

    final static void a(byte param0) {
        try {
            java.lang.reflect.Method var1 = null;
            Exception var1_ref = null;
            Throwable var2 = null;
            Runtime var2_ref = null;
            Long var3 = null;
            Object var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  var1 = Runtime.class.getMethod("maxMemory", new Class[0]);
                  if (var1 == null) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        var2_ref = Runtime.getRuntime();
                        var4 = null;
                        var3 = (Long) var1.invoke((Object) (Object) var2_ref, (Object[]) null);
                        ok.field_c = (int)(var3.longValue() / 1048576L) + 1;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var2 = decompiledCaughtException;
                        break L3;
                      }
                    }
                    break L1;
                  }
                }
                if (param0 < -24) {
                  break L0;
                } else {
                  dm.a((byte) 69);
                  return;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var1_ref = (Exception) (Object) decompiledCaughtException;
                break L4;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(mf param0, int param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        ed[] stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        String stackIn_4_2 = null;
        mf stackIn_4_3 = null;
        String stackIn_4_4 = null;
        int stackIn_4_5 = 0;
        ed[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        String stackIn_11_2 = null;
        mf stackIn_11_3 = null;
        String stackIn_11_4 = null;
        ed[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        String stackIn_12_2 = null;
        mf stackIn_12_3 = null;
        String stackIn_12_4 = null;
        ed[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        String stackIn_13_2 = null;
        mf stackIn_13_3 = null;
        String stackIn_13_4 = null;
        int stackIn_13_5 = 0;
        ed[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        String stackOut_10_2 = null;
        mf stackOut_10_3 = null;
        String stackOut_10_4 = null;
        ed[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        String stackOut_12_2 = null;
        mf stackOut_12_3 = null;
        String stackOut_12_4 = null;
        int stackOut_12_5 = 0;
        ed[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        String stackOut_11_2 = null;
        mf stackOut_11_3 = null;
        String stackOut_11_4 = null;
        int stackOut_11_5 = 0;
        ed[] stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        String stackOut_2_2 = null;
        mf stackOut_2_3 = null;
        String stackOut_2_4 = null;
        int stackOut_2_5 = 0;
        var4 = EscapeVector.field_A;
        var3 = 0;
        if (param2) {
          field_h = -2;
          L0: while (true) {
            if (4 > var3) {
              L1: {
                stackOut_10_0 = sl.field_b[param1];
                stackOut_10_1 = var3;
                stackOut_10_2 = da.field_d[param1];
                stackOut_10_3 = (mf) param0;
                stackOut_10_4 = "layer" + var3;
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                stackIn_12_2 = stackOut_10_2;
                stackIn_12_3 = stackOut_10_3;
                stackIn_12_4 = stackOut_10_4;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                stackIn_11_2 = stackOut_10_2;
                stackIn_11_3 = stackOut_10_3;
                stackIn_11_4 = stackOut_10_4;
                if (param2) {
                  stackOut_12_0 = (ed[]) (Object) stackIn_12_0;
                  stackOut_12_1 = stackIn_12_1;
                  stackOut_12_2 = (String) (Object) stackIn_12_2;
                  stackOut_12_3 = (mf) (Object) stackIn_12_3;
                  stackOut_12_4 = (String) (Object) stackIn_12_4;
                  stackOut_12_5 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  stackIn_13_2 = stackOut_12_2;
                  stackIn_13_3 = stackOut_12_3;
                  stackIn_13_4 = stackOut_12_4;
                  stackIn_13_5 = stackOut_12_5;
                  break L1;
                } else {
                  stackOut_11_0 = (ed[]) (Object) stackIn_11_0;
                  stackOut_11_1 = stackIn_11_1;
                  stackOut_11_2 = (String) (Object) stackIn_11_2;
                  stackOut_11_3 = (mf) (Object) stackIn_11_3;
                  stackOut_11_4 = (String) (Object) stackIn_11_4;
                  stackOut_11_5 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  stackIn_13_2 = stackOut_11_2;
                  stackIn_13_3 = stackOut_11_3;
                  stackIn_13_4 = stackOut_11_4;
                  stackIn_13_5 = stackOut_11_5;
                  break L1;
                }
              }
              stackIn_13_0[stackIn_13_1] = fe.a(stackIn_13_2, stackIn_13_3, stackIn_13_4, stackIn_13_5 != 0);
              var3++;
              continue L0;
            } else {
              return;
            }
          }
        } else {
          L2: while (true) {
            if (4 <= var3) {
              return;
            } else {
              stackOut_2_0 = sl.field_b[param1];
              stackOut_2_1 = var3;
              stackOut_2_2 = da.field_d[param1];
              stackOut_2_3 = (mf) param0;
              stackOut_2_4 = "layer" + var3;
              stackOut_2_5 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              stackIn_4_2 = stackOut_2_2;
              stackIn_4_3 = stackOut_2_3;
              stackIn_4_4 = stackOut_2_4;
              stackIn_4_5 = stackOut_2_5;
              stackIn_4_0[stackIn_4_1] = fe.a(stackIn_4_2, stackIn_4_3, stackIn_4_4, stackIn_4_5 != 0);
              var3++;
              continue L2;
            }
          }
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            Exception exception = null;
            java.net.URL var2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var2 = new java.net.URL(param1.getCodeBase(), "tosupport.ws");
                param1.getAppletContext().showDocument(sh.a((byte) 52, param1, var2), "_top");
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                exception = (Exception) (Object) decompiledCaughtException;
                exception.printStackTrace();
                break L1;
              }
            }
            if (param0 == 4) {
              return;
            } else {
              field_h = -125;
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    dm(long param0, int param1, byte[] param2) {
        ((dm) this).field_i = param1;
        ((dm) this).field_j = param2;
        ((dm) this).field_g = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 640;
    }
}
