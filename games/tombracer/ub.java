/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub {
    static nl field_d;
    private int field_f;
    private static String[] field_g;
    private Object[] field_e;
    static String field_i;
    static int field_h;
    private int field_a;
    static String field_b;
    static int field_c;

    final void a(int param0, int param1, Object param2) {
        Object[] var6 = null;
        Object[] var7 = null;
        Object[] var4 = null;
        try {
            ((ub) this).field_f = ((ub) this).field_f + 1;
            if (param1 != 0) {
                Object var5 = null;
                ((ub) this).a(-79, -69, (Object) null);
            }
            if (((ub) this).field_f < ((ub) this).field_e.length) {
                lua.a(((ub) this).field_e, param0, ((ub) this).field_e, 1 + param0, -param0 + ((ub) this).field_f + -1);
            } else {
                var6 = new Object[((ub) this).field_a + ((ub) this).field_e.length];
                var7 = var6;
                var4 = var7;
                lua.a(((ub) this).field_e, 0, var7, 0, param0);
                lua.a(((ub) this).field_e, param0, var4, 1 + param0, -param0 + ((ub) this).field_e.length);
                ((ub) this).field_e = var6;
            }
            ((ub) this).field_e[param0] = param2;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ub.I(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final static void b(int param0) {
        od var1 = null;
        int var2 = TombRacer.field_G ? 1 : 0;
        try {
            ol.field_b = null;
            ii.field_a = 0;
            tba.field_k = 0;
            fla.field_f.d(8);
            wv.field_l.d(8);
            var1 = hia.field_s.b(16);
            while (var1 != null) {
                var1.c(-7975);
                var1 = hia.field_s.a((byte) -112);
            }
            var1 = bla.field_G.b(-120);
            while (var1 != null) {
                var1.c(-7975);
                var1 = bla.field_G.a((byte) -112);
            }
            ae.field_g = 0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ub.G(" + 0 + 41);
        }
    }

    private final void a(int param0, Object[] param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            ((ub) this).field_e = new Object[param1.length];
            lua.a(param1, 0, ((ub) this).field_e, 0, param1.length);
            ((ub) this).field_f = param0;
            var3_int = 0;
            L1: while (true) {
              if (((ub) this).field_e.length <= var3_int) {
                break L0;
              } else {
                L2: {
                  if (((ub) this).field_e[var3_int] != null) {
                    ((ub) this).field_f = ((ub) this).field_f + 1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("ub.C(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_i = null;
        field_g = null;
        field_b = null;
    }

    public ub() {
        this(10, 10);
    }

    final Object a(boolean param0, int param1) {
        if (!param0) {
            ((ub) this).field_e = new Object[5];
        }
        return ((ub) this).field_e[param1];
    }

    private ub(Object[] param0, int param1) {
        this(param0);
        try {
            ((ub) this).field_a = param1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ub.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void a(Object[] param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                field_i = null;
                break L1;
              }
            }
            var3_int = 0;
            L2: while (true) {
              if (var3_int >= param0.length) {
                break L0;
              } else {
                if (((ub) this).field_e.length > var3_int) {
                  param0[var3_int] = ((ub) this).field_e[var3_int];
                  var3_int++;
                  continue L2;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("ub.E(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 41);
        }
    }

    final int a(int param0) {
        if (param0 != -1) {
            ((int[]) ((Object[]) ((ub) this).field_e[0])[7])[3] = 68;
        }
        return ((ub) this).field_f;
    }

    private ub(int param0, int param1) {
        this(new Object[param0], param1);
    }

    final static boolean a(int param0, int param1, byte param2) {
        int var3 = -40 % ((-25 - param2) / 37);
        return 0 != (param1 & 1024) ? true : false;
    }

    final void a(byte param0, Object param1) {
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
              ((ub) this).a(((ub) this).field_f, 0, param1);
              if (param0 == -37) {
                break L1;
              } else {
                ((ub) this).field_e = null;
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
            stackOut_3_1 = new StringBuilder().append("ub.F(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    ub(int param0) {
        this(new Object[param0]);
    }

    private ub(Object[] param0) {
        ((ub) this).field_a = 1;
        try {
            this.a(0, param0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ub.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new nl("usename");
        field_g = new String[4];
        field_g[2] = "Spitting Torch";
        field_g[0] = "Brazier";
        field_g[1] = "Wall Torch";
        field_g[3] = "Pillar";
        field_h = 0;
        field_c = field_h;
    }
}
