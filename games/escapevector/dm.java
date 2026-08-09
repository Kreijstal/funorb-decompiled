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
            Throwable decompiledCaughtException = null;
            java.lang.reflect.Method var1 = null;
            Exception var1_ref = null;
            Runtime var2 = null;
            Throwable var2_ref = null;
            Long var3 = null;
            Object[] var4 = null;
            try {
              L0: {
                L1: {
                  var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
                  if (var1 == null) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        var2 = Runtime.getRuntime();
                        var4 = (Object[]) null;
                        var3 = (Long) (var1.invoke((Object) (var2), (Object[]) null));
                        ok.field_c = (int)(var3.longValue() / 1048576L) + 1;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var2_ref = decompiledCaughtException;
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
        int var4 = 0;
        ed[] stackIn_6_0;
        int stackIn_6_1;
        String stackIn_6_2;
        mf stackIn_6_3;
        String stackIn_6_4;
        ed[] stackIn_7_0;
        int stackIn_7_1;
        String stackIn_7_2;
        mf stackIn_7_3;
        String stackIn_7_4;
        int stackIn_7_5;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
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
                  stackIn_6_0 = sl.field_b[param1];

                  stackIn_6_1 = var3_int;

                  stackIn_6_2 = da.field_d[param1];

                  stackIn_6_3 = (mf) (param0);

                  stackIn_6_4 = "layer" + var3_int;

                  if (param2) {
                    stackIn_7_0 = (ed[]) ((Object) stackIn_6_0);
                    stackIn_7_1 = stackIn_6_1;
                    stackIn_7_2 = (String) ((Object) stackIn_6_2);
                    stackIn_7_3 = (mf) ((Object) stackIn_6_3);
                    stackIn_7_4 = (String) ((Object) stackIn_6_4);
                    stackIn_7_5 = 0;
                    break L3;
                  } else {
                    stackIn_7_0 = (ed[]) ((Object) stackIn_6_0);
                    stackIn_7_1 = stackIn_6_1;
                    stackIn_7_2 = (String) ((Object) stackIn_6_2);
                    stackIn_7_3 = (mf) ((Object) stackIn_6_3);
                    stackIn_7_4 = (String) ((Object) stackIn_6_4);
                    stackIn_7_5 = 1;
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
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("dm.A(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
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
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            Exception var2_ref2 = null;
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
                stackIn_8_0 = (RuntimeException) (var2_ref);

                stackIn_8_1 = new StringBuilder().append("dm.C(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L3;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
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
