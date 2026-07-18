/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ih {
    static String field_d;
    static String[] field_j;
    static int field_p;
    static jp field_k;
    lq field_g;
    lq field_n;
    lq field_a;
    lq field_c;
    int field_b;
    long field_o;
    wq field_m;
    byte field_h;
    volatile int field_i;
    volatile int field_f;
    wq field_l;
    da field_e;

    abstract void a(byte param0);

    final static ff a(String param0, boolean param1, String param2, byte param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        int var7 = 0;
        CharSequence var8 = null;
        ff stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        ff stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              var4_long = 0L;
              var7 = 0;
              var6 = null;
              if (-1 != param0.indexOf('@')) {
                var6 = (Object) (Object) param0;
                break L1;
              } else {
                var8 = (CharSequence) (Object) param0;
                var4_long = ah.a(false, var8);
                break L1;
              }
            }
            stackOut_3_0 = he.a(var4_long, 20, false, param2, (String) var6);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("ih.N(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(false).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + -109 + ')');
        }
        return stackIn_4_0;
    }

    abstract void b(byte param0);

    final boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 2) {
          L0: {
            ((ih) this).field_c = null;
            if (((ih) this).e((byte) -123) < 20) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((ih) this).e((byte) -123) < 20) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static void a(String param0, int param1) {
        try {
            g.field_m = param0;
            bd.a(param1, true);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "ih.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int c(byte param0) {
        int var2 = 88 % ((param0 - 30) / 42);
        return ((ih) this).field_a.c(-25906) + ((ih) this).field_c.c(-25906);
    }

    public static void c(int param0) {
        field_j = null;
        field_k = null;
        field_d = null;
    }

    final static void a(pb param0, jp param1, int param2, int param3, int param4, boolean param5) {
        RuntimeException runtimeException = null;
        Object var7 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
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
              fc.a(-77, param0.field_p);
              lb.g(0, 0, param0.field_i, param0.field_q, ro.field_x[param2], 16777215);
              param1.b((-param1.field_x + param0.field_i) / 2 + -(30 / param3), -param1.field_z + param4 + (param0.field_q - 200 / param3), 55, 110);
              sc.b(-117);
              if (param5) {
                break L1;
              } else {
                var7 = null;
                ih.a((pb) null, (jp) null, 100, 125, 72, false);
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
            stackOut_3_1 = new StringBuilder().append("ih.K(");
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
          L3: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
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
          throw qb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    abstract void a(Object param0, boolean param1, int param2);

    final da a(int param0, int param1, byte param2, int param3, boolean param4) {
        long var6 = 0L;
        da var8 = null;
        da stackIn_1_0 = null;
        da stackIn_2_0 = null;
        da stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        da stackOut_0_0 = null;
        da stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        da stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          var6 = ((long)param1 << 32) - -(long)param3;
          var8 = new da();
          stackOut_0_0 = (da) var8;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param4) {
            stackOut_2_0 = (da) (Object) stackIn_2_0;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (da) (Object) stackIn_1_0;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        stackIn_3_0.field_B = stackIn_3_1 != 0;
        var8.field_F = param2;
        if (param0 == -952050528) {
          var8.field_j = var6;
          if (!param4) {
            if (20 <= ((ih) this).c((byte) -42)) {
              throw new RuntimeException();
            } else {
              ((ih) this).field_a.a((tk) (Object) var8, false);
              return var8;
            }
          } else {
            if (((ih) this).e((byte) -42) < 20) {
              ((ih) this).field_g.a((tk) (Object) var8, false);
              return var8;
            } else {
              throw new RuntimeException();
            }
          }
        } else {
          ((ih) this).field_f = 5;
          var8.field_j = var6;
          if (!param4) {
            if (20 <= ((ih) this).c((byte) -42)) {
              throw new RuntimeException();
            } else {
              ((ih) this).field_a.a((tk) (Object) var8, false);
              return var8;
            }
          } else {
            if (((ih) this).e((byte) -42) < 20) {
              ((ih) this).field_g.a((tk) (Object) var8, false);
              return var8;
            } else {
              throw new RuntimeException();
            }
          }
        }
    }

    final boolean d(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 101) {
          L0: {
            ((ih) this).field_c = null;
            if (-21 < ((ih) this).c((byte) 105)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (-21 > ((ih) this).c((byte) 105)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static void a(boolean param0, String param1, String param2, int param3) {
        gf.field_d = param1;
        dl.field_e = param2;
        try {
            pq.a(0, ep.field_d, param0);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "ih.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + 2 + ')');
        }
    }

    final int e(byte param0) {
        if (param0 >= -33) {
            return 20;
        }
        return ((ih) this).field_g.c(-25906) - -((ih) this).field_n.c(-25906);
    }

    abstract boolean b(int param0);

    final static void a(byte param0, boolean param1) {
        lf.a(param1, -58, true);
    }

    ih() {
        ((ih) this).field_g = new lq();
        ((ih) this).field_n = new lq();
        ((ih) this).field_a = new lq();
        ((ih) this).field_c = new lq();
        ((ih) this).field_m = new wq(6);
        ((ih) this).field_i = 0;
        ((ih) this).field_h = (byte) 0;
        ((ih) this).field_f = 0;
        ((ih) this).field_l = new wq(10);
    }

    static {
    }
}
