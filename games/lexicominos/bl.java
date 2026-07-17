/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bl {
    static int field_b;
    static String field_a;

    final static boolean a(byte param0, hc param1, hc param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = -param1.field_hb + param2.field_hb;
              if (ji.field_b != param2.field_jb) {
                if (param2.field_jb == null) {
                  var3_int += 200;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                var3_int -= 200;
                break L1;
              }
            }
            L2: {
              if (ji.field_b != param1.field_jb) {
                if (param1.field_jb == null) {
                  var3_int -= 200;
                  break L2;
                } else {
                  break L2;
                }
              } else {
                var3_int += 200;
                break L2;
              }
            }
            L3: {
              if (0 >= var3_int) {
                stackOut_13_0 = 0;
                stackIn_14_0 = stackOut_13_0;
                break L3;
              } else {
                stackOut_12_0 = 1;
                stackIn_14_0 = stackOut_12_0;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("bl.A(").append(111).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          L5: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
        return stackIn_14_0 != 0;
    }

    public static void a() {
        field_a = null;
    }

    final static void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = Lexicominos.field_L ? 1 : 0;
        if (jd.field_c > 0) {
          if (da.field_a == null) {
            L0: {
              ff.field_b = sg.a(0, 640, 480, 0, 0, jh.field_a);
              if (null == ff.field_b) {
                var2 = 3;
                break L0;
              } else {
                var2 = 2;
                ha.a((java.awt.Canvas) (Object) ff.field_b, (byte) 65);
                break L0;
              }
            }
            L1: {
              if (null != da.field_a) {
                break L1;
              } else {
                if (!ne.field_c) {
                  break L1;
                } else {
                  id.a(var2, param0, (byte) 116);
                  return;
                }
              }
            }
            return;
          } else {
            L2: {
              ff.field_b = da.field_a.b((byte) -74);
              ka.a(2, -27844);
              if (null == ff.field_b) {
                var2 = 3;
                break L2;
              } else {
                var2 = 2;
                ha.a((java.awt.Canvas) (Object) ff.field_b, (byte) 65);
                break L2;
              }
            }
            L3: {
              if (null != da.field_a) {
                break L3;
              } else {
                if (!ne.field_c) {
                  break L3;
                } else {
                  id.a(var2, param0, (byte) 116);
                  return;
                }
              }
            }
            return;
          }
        } else {
          if (ki.a((byte) -116)) {
            L4: {
              var2 = 0;
              if (null != da.field_a) {
                break L4;
              } else {
                if (!ne.field_c) {
                  break L4;
                } else {
                  id.a(var2, param0, (byte) 116);
                  return;
                }
              }
            }
            return;
          } else {
            var2 = 1;
            if (null == da.field_a) {
              if (ne.field_c) {
                id.a(var2, param0, (byte) 116);
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final static ee a(int param0) {
        try {
            Throwable var1 = null;
            ee stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            ee stackOut_2_0 = null;
            try {
              L0: {
                L1: {
                  if (param0 >= 87) {
                    break L1;
                  } else {
                    ee discarded$2 = bl.a(65);
                    break L1;
                  }
                }
                stackOut_2_0 = (ee) Class.forName("ie").newInstance();
                stackIn_3_0 = stackOut_2_0;
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = decompiledCaughtException;
              return null;
            }
            return stackIn_3_0;
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
        field_a = "3 of 4";
    }
}
