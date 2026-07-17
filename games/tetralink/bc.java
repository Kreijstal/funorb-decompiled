/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc extends bh {
    static a field_z;
    private int field_y;
    private oj field_w;
    static String field_x;
    static String field_v;

    final void e(boolean param0) {
        ((bc) this).field_y = 8 * ((bc) this).field_t;
        if (!param0) {
            ((bc) this).e(false);
        }
    }

    final int e(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = TetraLink.field_J;
        var3 = ((bc) this).field_y >> 3;
        var4 = 8 - (((bc) this).field_y & 7);
        if (param1 == -112) {
          ((bc) this).field_y = ((bc) this).field_y + param0;
          var5 = 0;
          L0: while (true) {
            if (param0 <= var4) {
              L1: {
                if (var4 != param0) {
                  var5 = var5 + (((bc) this).field_u[var3] >> -param0 + var4 & rf.field_a[param0]);
                  break L1;
                } else {
                  var5 = var5 + (((bc) this).field_u[var3] & rf.field_a[var4]);
                  break L1;
                }
              }
              return var5;
            } else {
              int incrementValue$2 = var3;
              var3++;
              var5 = var5 + ((((bc) this).field_u[incrementValue$2] & rf.field_a[var4]) << param0 + -var4);
              param0 = param0 - var4;
              var4 = 8;
              continue L0;
            }
          }
        } else {
          ((bc) this).field_y = -52;
          ((bc) this).field_y = ((bc) this).field_y + param0;
          var5 = 0;
          L2: while (true) {
            if (param0 <= var4) {
              L3: {
                if (var4 != param0) {
                  var5 = var5 + (((bc) this).field_u[var3] >> -param0 + var4 & rf.field_a[param0]);
                  break L3;
                } else {
                  var5 = var5 + (((bc) this).field_u[var3] & rf.field_a[var4]);
                  break L3;
                }
              }
              return var5;
            } else {
              int incrementValue$3 = var3;
              var3++;
              var5 = var5 + ((((bc) this).field_u[incrementValue$3] & rf.field_a[var4]) << param0 + -var4);
              param0 = param0 - var4;
              var4 = 8;
              continue L2;
            }
          }
        }
    }

    final void a(int param0, byte[] param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var6 = TetraLink.field_J;
        try {
          L0: {
            if (param0 >= 28) {
              var5_int = 0;
              L1: while (true) {
                if (var5_int >= param3) {
                  break L0;
                } else {
                  int fieldTemp$5 = ((bc) this).field_t;
                  ((bc) this).field_t = ((bc) this).field_t + 1;
                  param1[param2 + var5_int] = (byte)(((bc) this).field_u[fieldTemp$5] + -((bc) this).field_w.c(0));
                  var5_int++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("bc.A(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final int d(boolean param0) {
        if (param0) {
            ((bc) this).f(-44, (byte) -67);
            int fieldTemp$0 = ((bc) this).field_t;
            ((bc) this).field_t = ((bc) this).field_t + 1;
            return ((bc) this).field_u[fieldTemp$0] - ((bc) this).field_w.c(0) & 255;
        }
        int fieldTemp$1 = ((bc) this).field_t;
        ((bc) this).field_t = ((bc) this).field_t + 1;
        return ((bc) this).field_u[fieldTemp$1] - ((bc) this).field_w.c(0) & 255;
    }

    final void i(byte param0) {
        ((bc) this).field_t = (((bc) this).field_y + 7) / 8;
        if (param0 <= 57) {
            Object var3 = null;
            boolean discarded$0 = bc.a(89, (bc) null);
        }
    }

    final static boolean a(int param0, bc param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
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
            L1: {
              if (param0 > 53) {
                break L1;
              } else {
                var3 = null;
                boolean discarded$2 = bc.a(116, (bc) null);
                break L1;
              }
            }
            L2: {
              if (1 != param1.e(1, (byte) -112)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("bc.D(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
        return stackIn_5_0 != 0;
    }

    bc(byte[] param0) {
        super(param0);
    }

    bc(int param0) {
        super(param0);
    }

    final void a(int[] param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((bc) this).field_w = new oj(param0);
              if (param1 == 33) {
                break L1;
              } else {
                ((bc) this).e(true);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("bc.H(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    final void f(int param0, byte param1) {
        if (param1 != -92) {
            field_v = null;
            int fieldTemp$0 = ((bc) this).field_t;
            ((bc) this).field_t = ((bc) this).field_t + 1;
            ((bc) this).field_u[fieldTemp$0] = (byte)(((bc) this).field_w.c(oj.a((int) param1, -92)) + param0);
            return;
        }
        int fieldTemp$1 = ((bc) this).field_t;
        ((bc) this).field_t = ((bc) this).field_t + 1;
        ((bc) this).field_u[fieldTemp$1] = (byte)(((bc) this).field_w.c(oj.a((int) param1, -92)) + param0);
    }

    public static void j(int param0) {
        if (param0 != 29313) {
            bc.j(84);
            field_z = null;
            field_v = null;
            field_x = null;
            return;
        }
        field_z = null;
        field_v = null;
        field_x = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = new a();
        field_x = "Quick Chat lobby";
        field_v = "<%0> wants to draw.";
    }
}
