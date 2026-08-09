/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl {
    static String[] field_a;
    static String field_d;
    static int field_b;
    static int field_c;

    public static void a(int param0) {
        km var2;
        if (param0 != 0) {
          var2 = (km) null;
          dl.a((km) null, (byte) -42, (km) null);
          field_a = null;
          field_d = null;
          return;
        } else {
          field_a = null;
          field_d = null;
          return;
        }
    }

    final static void a(km param0, byte param1, km param2) {
        RuntimeException var3 = null;
        int[] var4 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0.field_W == null) {
                param0.field_W = new p();
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (null != param2.field_W) {
                break L2;
              } else {
                param2.field_W = new p();
                break L2;
              }
            }
            L3: {
              if (oa.field_h == null) {
                oa.field_h = new kf(64);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (null == ie.field_a) {
                ie.field_a = new kf(64);
                break L4;
              } else {
                break L4;
              }
            }
            co.field_f = param0.field_W;
            bd.field_c = param2.field_W;
            dc.f((byte) -14);
            if (param1 == -127) {
              break L0;
            } else {
              var4 = (int[]) null;
              dl.a((km) null, (km) null, -53, (km) null, (int[]) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("dl.B(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final boolean a(boolean param0) {
        int stackIn_7_0 = 0;
        if (!param0) {
          if (lg.field_d != this) {
            if (this != nf.field_h) {
              if (kh.field_c == this) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          field_a = (String[]) null;
          if (lg.field_d != this) {
            if (this == nf.field_h) {
              return true;
            } else {
              L0: {
                if (kh.field_c != this) {
                  stackIn_7_0 = 0;
                  break L0;
                } else {
                  stackIn_7_0 = 1;
                  break L0;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        }
    }

    final static oj a(km param0, km param1, int param2, km param3, int[] param4) {
        int var5_int = 0;
        String[] var6 = null;
        char[] var7 = null;
        oj[] var8 = null;
        int var9 = 0;
        int var10_int = 0;
        th var11 = null;
        int var12 = 0;
        char[] var13 = null;
        char[] var14 = null;
        Object stackIn_7_0 = null;
        oj stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var5 = null;
        Exception var10 = null;
        var12 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var5_int = param4.length;
            var6 = new String[var5_int];
            var14 = new char[var5_int];
            var13 = var14;
            var7 = var13;
            var8 = new oj[var5_int];
            var9 = (char)param2;
            try {
              L1: {
                var10_int = 0;
                L2: while (true) {
                  if (var5_int <= var10_int) {
                    break L1;
                  } else {
                    var11 = cj.field_s.a((byte) 125, param4[var10_int]);
                    var6[var10_int] = var11.d(120);
                    var9 = (char)(var9 + 1);
                    var7[var10_int] = (char)var9;
                    var8[var10_int] = null;
                    var10_int++;
                    continue L2;
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var10 = (Exception) (Object) decompiledCaughtException;
              stackIn_7_0 = null;
              return (oj) ((Object) stackIn_7_0);
            }
            stackIn_9_0 = new oj(0L, param1, param0, param3, var8, param4, var6, var14);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L3: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("dl.A(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param4 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_13_0), stackIn_22_2 + ')');
        }
        return stackIn_9_0;
    }

    static {
        field_d = "Quick Chat lobby";
        field_a = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
    }
}
