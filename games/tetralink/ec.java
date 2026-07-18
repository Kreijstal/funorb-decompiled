/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec {
    static String field_f;
    private int field_c;
    static String field_g;
    private ea field_m;
    private int field_j;
    static mh field_a;
    static oh[] field_n;
    private rk field_o;
    static ob field_l;
    static int field_i;
    static String field_h;
    static String field_d;
    static int[] field_e;
    static hl field_b;
    static boolean field_k;

    private final void a(mb param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
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
            var3_int = -100 % ((-59 - param1) / 60);
            if (param0 == null) {
              break L0;
            } else {
              param0.b(false);
              param0.e(0);
              ((ec) this).field_c = ((ec) this).field_c + param0.field_t;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var3;
            stackOut_3_1 = new StringBuilder().append("ec.E(");
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
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, long param1) {
        mb var4 = (mb) (Object) ((ec) this).field_m.a(param1, 111);
        this.a(var4, 44);
    }

    final static hl a(int param0, jb param1, int param2, int param3, byte param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        hl var13 = null;
        RuntimeException var13_ref = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          var13 = new hl(0L, (hl) null);
          var13.field_Eb = wm.a((byte) 28, param9, param11);
          var13.field_kb = wm.a((byte) 28, param0, param10);
          var13.field_pb = wm.a((byte) 28, param8, param7);
          var13.field_Gb = wm.a((byte) 28, param3, param2);
          var13.field_H = wm.a((byte) 28, param6, param5);
          var13.field_N = param12;
          var13.field_Ib = param1;
          return var13;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var13_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var13_ref;
            stackOut_2_1 = new StringBuilder().append("ec.F(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param2 + ',' + param3 + ',' + -120 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        if (param1 < 113) {
            field_l = null;
            oa.field_y.a(param0, 8);
            return;
        }
        oa.field_y.a(param0, 8);
    }

    final void a(Object param0, long param1, byte param2) {
        try {
            if (param2 != 50) {
                ec.a(true, 108);
            }
            int discarded$0 = 1;
            this.a(param2 ^ 50, param0, param1);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "ec.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final Object a(byte param0, long param1) {
        Object var5 = null;
        wc var6 = null;
        mb var7 = null;
        var7 = (mb) (Object) ((ec) this).field_m.a(param1, 116);
        if (var7 != null) {
          var5 = var7.g(22850);
          if (var5 != null) {
            if (param0 >= 116) {
              if (var7.f(105)) {
                var6 = new wc(var5, var7.field_t);
                ((ec) this).field_m.a(var7.field_c, (mc) (Object) var6, false);
                ((ec) this).field_o.a((byte) -85, (gb) (Object) var6);
                ((mb) (Object) var6).field_n = 0L;
                var7.b(false);
                var7.e(0);
                return var5;
              } else {
                ((ec) this).field_o.a((byte) -50, (gb) (Object) var7);
                var7.field_n = 0L;
                return var5;
              }
            } else {
              ec.a(false, -84);
              if (var7.f(105)) {
                var6 = new wc(var5, var7.field_t);
                ((ec) this).field_m.a(var7.field_c, (mc) (Object) var6, false);
                ((ec) this).field_o.a((byte) -85, (gb) (Object) var6);
                ((mb) (Object) var6).field_n = 0L;
                var7.b(false);
                var7.e(0);
                return var5;
              } else {
                ((ec) this).field_o.a((byte) -50, (gb) (Object) var7);
                var7.field_n = 0L;
                return var5;
              }
            }
          } else {
            var7.b(false);
            var7.e(0);
            ((ec) this).field_c = ((ec) this).field_c + var7.field_t;
            return null;
          }
        } else {
          return null;
        }
    }

    ec(int param0) {
        this(param0, param0);
    }

    public static void a() {
        field_f = null;
        field_n = null;
        field_d = null;
        field_g = null;
        field_a = null;
        field_b = null;
        field_h = null;
        int var1 = 0;
        field_l = null;
        field_e = null;
    }

    private final void a(int param0, Object param1, long param2) {
        mb var6 = null;
        wc var6_ref = null;
        int var7 = TetraLink.field_J;
        try {
            if (((ec) this).field_j < 1) {
                throw new IllegalStateException();
            }
            this.a(57, param2);
            ((ec) this).field_c = ((ec) this).field_c - 1;
            while (((ec) this).field_c < 0) {
                var6 = (mb) (Object) ((ec) this).field_o.b(-91);
                this.a(var6, param0 ^ -122);
            }
            var6_ref = new wc(param1, 1);
            ((ec) this).field_m.a(param2, (mc) (Object) var6_ref, false);
            ((ec) this).field_o.a((byte) -14, (gb) (Object) var6_ref);
            ((mb) (Object) var6_ref).field_n = (long)param0;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "ec.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + 1 + ')');
        }
    }

    private ec(int param0, int param1) {
        int var3 = 0;
        ((ec) this).field_o = new rk();
        ((ec) this).field_c = param0;
        ((ec) this).field_j = param0;
        var3 = 1;
        L0: while (true) {
          if (param0 > var3 + var3) {
            if (param1 > var3) {
              var3 = var3 + var3;
              continue L0;
            } else {
              ((ec) this).field_m = new ea(var3);
              return;
            }
          } else {
            ((ec) this).field_m = new ea(var3);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Graphics: ";
        field_g = "Ignore";
        field_a = new mh();
        field_i = 0;
        field_k = false;
        field_e = new int[12];
        field_d = "Logging in...";
    }
}
