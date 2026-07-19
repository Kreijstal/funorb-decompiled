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
            Object[] var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
                  if (var1 == null) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        var2_ref = Runtime.getRuntime();
                        var4 = (Object[]) null;
                        var3 = (Long) (var1.invoke((Object) (var2_ref), (Object[]) null));
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
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        ed[] stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        String stackIn_5_2 = null;
        mf stackIn_5_3 = null;
        String stackIn_5_4 = null;
        ed[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        String stackIn_6_2 = null;
        mf stackIn_6_3 = null;
        String stackIn_6_4 = null;
        ed[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        String stackIn_7_2 = null;
        mf stackIn_7_3 = null;
        String stackIn_7_4 = null;
        int stackIn_7_5 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        ed[] stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        String stackOut_4_2 = null;
        mf stackOut_4_3 = null;
        String stackOut_4_4 = null;
        ed[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        String stackOut_6_2 = null;
        mf stackOut_6_3 = null;
        String stackOut_6_4 = null;
        int stackOut_6_5 = 0;
        ed[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        String stackOut_5_2 = null;
        mf stackOut_5_3 = null;
        String stackOut_5_4 = null;
        int stackOut_5_5 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var4 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              var3_int = 0;
              if (!param2) {
                break L1;
              } else {
                field_h = -2;
                break L1;
              }
            }
            L2: while (true) {
              if (4 <= var3_int) {
                break L0;
              } else {
                L3: {
                  stackOut_4_0 = sl.field_b[param1];
                  stackOut_4_1 = var3_int;
                  stackOut_4_2 = da.field_d[param1];
                  stackOut_4_3 = (mf) (param0);
                  stackOut_4_4 = "layer" + var3_int;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  stackIn_6_2 = stackOut_4_2;
                  stackIn_6_3 = stackOut_4_3;
                  stackIn_6_4 = stackOut_4_4;
                  stackIn_5_0 = stackOut_4_0;
                  stackIn_5_1 = stackOut_4_1;
                  stackIn_5_2 = stackOut_4_2;
                  stackIn_5_3 = stackOut_4_3;
                  stackIn_5_4 = stackOut_4_4;
                  if (param2) {
                    stackOut_6_0 = (ed[]) ((Object) stackIn_6_0);
                    stackOut_6_1 = stackIn_6_1;
                    stackOut_6_2 = (String) ((Object) stackIn_6_2);
                    stackOut_6_3 = (mf) ((Object) stackIn_6_3);
                    stackOut_6_4 = (String) ((Object) stackIn_6_4);
                    stackOut_6_5 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    stackIn_7_2 = stackOut_6_2;
                    stackIn_7_3 = stackOut_6_3;
                    stackIn_7_4 = stackOut_6_4;
                    stackIn_7_5 = stackOut_6_5;
                    break L3;
                  } else {
                    stackOut_5_0 = (ed[]) ((Object) stackIn_5_0);
                    stackOut_5_1 = stackIn_5_1;
                    stackOut_5_2 = (String) ((Object) stackIn_5_2);
                    stackOut_5_3 = (mf) ((Object) stackIn_5_3);
                    stackOut_5_4 = (String) ((Object) stackIn_5_4);
                    stackOut_5_5 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    stackIn_7_2 = stackOut_5_2;
                    stackIn_7_3 = stackOut_5_3;
                    stackIn_7_4 = stackOut_5_4;
                    stackIn_7_5 = stackOut_5_5;
                    break L3;
                  }
                }
                stackIn_7_0[stackIn_7_1] = fe.a(stackIn_7_2, stackIn_7_3, stackIn_7_4, stackIn_7_5 != 0);
                var3_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3);
            stackOut_9_1 = new StringBuilder().append("dm.A(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            RuntimeException var2_ref = null;
            Exception var2_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var2 = new java.net.URL(param1.getCodeBase(), "tosupport.ws");
                    param1.getAppletContext().showDocument(sh.a((byte) 52, param1, var2), "_top");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2_ref2 = (Exception) (Object) decompiledCaughtException;
                    var2_ref2.printStackTrace();
                    break L2;
                  }
                }
                if (param0 == 4) {
                  break L0;
                } else {
                  field_h = -125;
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) (var2_ref);
                stackOut_6_1 = new StringBuilder().append("dm.C(").append(param0).append(',');
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param1 == null) {
                  stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L3;
                } else {
                  stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L3;
                }
              }
              throw t.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    dm(long param0, int param1, byte[] param2) {
        try {
            this.field_i = param1;
            this.field_j = param2;
            this.field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "dm.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = 640;
    }
}
