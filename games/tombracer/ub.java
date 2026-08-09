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
            this.field_f = this.field_f + 1;
            if (param1 != 0) {
                Object var5 = (Object) null;
                this.a(-79, -69, (Object) null);
            }
            if (this.field_f < this.field_e.length) {
                lua.a(this.field_e, param0, this.field_e, 1 + param0, -param0 + this.field_f + -1);
            } else {
                var6 = new Object[this.field_a + this.field_e.length];
                var7 = var6;
                var4 = var7;
                lua.a(this.field_e, 0, var7, 0, param0);
                lua.a(this.field_e, param0, var4, 1 + param0, -param0 + this.field_e.length);
                this.field_e = var6;
            }
            this.field_e[param0] = param2;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ub.I(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(int param0) {
        od var1 = null;
        int var2 = TombRacer.field_G ? 1 : 0;
        try {
            ol.field_b = null;
            ii.field_a = 0;
            tba.field_k = param0;
            fla.field_f.d(8);
            wv.field_l.d(8);
            var1 = hia.field_s.b(16);
            while (var1 != null) {
                var1.c(-7975);
                var1 = hia.field_s.a((byte) -112);
            }
            var1 = bla.field_G.b(param0 + -120);
            while (var1 != null) {
                var1.c(-7975);
                var1 = bla.field_G.a((byte) -112);
            }
            ae.field_g = 0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ub.G(" + param0 + ')');
        }
    }

    private final void a(int param0, Object[] param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            this.field_e = new Object[param1.length];
            lua.a(param1, 0, this.field_e, 0, param1.length);
            this.field_f = param0;
            var3_int = 0;
            L1: while (true) {
              if (this.field_e.length <= var3_int) {
                break L0;
              } else {
                L2: {
                  if (this.field_e[var3_int] != null) {
                    this.field_f = this.field_f + 1;
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
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("ub.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_i = null;
        field_g = null;
        if (!param0) {
            return;
        }
        field_b = null;
    }

    public ub() {
        this(10, 10);
    }

    final Object a(boolean param0, int param1) {
        if (!param0) {
            this.field_e = new Object[5];
        }
        return this.field_e[param1];
    }

    private ub(Object[] param0, int param1) {
        this(param0);
        try {
            this.field_a = param1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ub.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(Object[] param0, boolean param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                field_i = (String) null;
                break L1;
              }
            }
            var3_int = 0;
            L2: while (true) {
              if (var3_int >= param0.length) {
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                if (this.field_e.length > var3_int) {
                  param0[var3_int] = this.field_e[var3_int];
                  var3_int++;
                  continue L2;
                } else {
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("ub.E(");

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
          throw tba.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int a(int param0) {
        if (param0 != -1) {
            ((int[]) (((Object[]) (this.field_e[0]))[7]))[3] = 68;
        }
        return this.field_f;
    }

    private ub(int param0, int param1) {
        this(new Object[param0], param1);
    }

    final static boolean a(int param0, int param1, byte param2) {
        int var3 = -40 % ((-25 - param2) / 37);
        return 0 != (param1 & 1024) ? true : false;
    }

    final void a(byte param0, Object param1) {
        try {
            this.a(this.field_f, 0, param1);
            if (param0 != -37) {
                this.field_e = (Object[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ub.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    ub(int param0) {
        this(new Object[param0]);
    }

    private ub(Object[] param0) {
        this.field_a = 1;
        try {
            this.a(0, param0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ub.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
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
