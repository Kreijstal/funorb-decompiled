/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni extends mh {
    static String field_Pb;
    private mh field_Qb;
    static oh field_Rb;
    static String field_Tb;
    static jp field_Ub;
    static boolean field_Sb;
    static dh field_Wb;
    private mh field_Vb;

    final int a(byte param0, int param1) {
        if (param0 != 11) {
            field_Tb = (String) null;
        }
        return this.field_Vb.g(param0 + 90) + (param1 - -this.field_Qb.g(91));
    }

    final static int a(int param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              var3 = 0;
              if (param0 <= -103) {
                break L1;
              } else {
                field_Ub = (jp) null;
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var4 >= var2_int) {
                stackOut_6_0 = var3;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var3 = (var3 << -56117467) - var3 - -na.a(-8250, param1.charAt(var4));
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var2);
            stackOut_8_1 = new StringBuilder().append("ni.A(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    final static boolean b(boolean param0, char param1) {
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          if (param0) {
            break L0;
          } else {
            field_Pb = (String) null;
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (param1 < 65) {
                break L3;
              } else {
                if (90 >= param1) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (param1 < 97) {
                break L4;
              } else {
                if (122 < param1) {
                  break L4;
                } else {
                  break L2;
                }
              }
            }
            stackOut_9_0 = 0;
            stackIn_10_0 = stackOut_9_0;
            break L1;
          }
          stackOut_8_0 = 1;
          stackIn_10_0 = stackOut_8_0;
          break L1;
        }
        return stackIn_10_0 != 0;
    }

    ni(long param0, jp param1, jp param2, int param3, mh param4, String param5) {
        this(param0, (mh) null, param4, param5);
        try {
            this.field_Vb.field_K = param1;
            this.field_Vb.field_Q = param3;
            this.field_Vb.field_wb = param2;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "ni.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    private ni(long param0, mh param1, mh param2, String param3) {
        super(param0, (mh) null);
        try {
            this.field_Vb = new mh(0L, param1);
            this.field_Qb = new mh(0L, param2);
            this.field_Qb.field_Mb = param3;
            this.a(this.field_Vb, 0);
            this.a(this.field_Qb, 0);
            this.c(true);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "ni.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static ra h(int param0) {
        if (param0 < 91) {
            field_Pb = (String) null;
        }
        return ob.field_J;
    }

    public static void d(boolean param0) {
        field_Ub = null;
        field_Pb = null;
        field_Tb = null;
        field_Wb = null;
        field_Rb = null;
        if (!param0) {
            field_Rb = (oh) null;
        }
    }

    final void a(int param0, int param1, int param2, int param3, boolean param4, int param5) {
        this.a(param2, param3, param5, param0, (byte) 64);
        this.b(-32434, param1);
        if (!param4) {
            ni.d(false);
        }
    }

    ni(long param0, ni param1, String param2) {
        this(param0, param1.field_Vb, param1.field_Qb, param2);
    }

    private final void b(int param0, int param1) {
        this.field_Vb.a(this.field_cb, 0, 0, this.field_Vb.g(118), (byte) 64);
        int var3 = this.field_Vb.field_Ib - -param1;
        if (param0 != -32434) {
            field_Ub = (jp) null;
        }
        this.field_Qb.a(this.field_cb, 0, var3, this.field_Ib + -var3, (byte) 64);
    }

    static {
        field_Pb = "Don't mind";
        field_Tb = "This password contains your email address, and would be easy to guess";
    }
}
