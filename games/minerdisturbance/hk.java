/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk {
    private int field_f;
    static ec field_i;
    private int field_b;
    private sd field_g;
    private qc field_h;
    static ea[] field_a;
    static String field_d;
    static int field_e;
    static String field_c;

    private final void a(int param0, bl param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 < -47) {
              L1: {
                if (param1 == null) {
                  break L1;
                } else {
                  param1.b(34);
                  param1.a((byte) -120);
                  ((hk) this).field_b = ((hk) this).field_b + param1.field_y;
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) runtimeException;
            stackOut_5_1 = new StringBuilder().append("hk.D(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
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
          throw lj.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
    }

    public static void d() {
        field_c = null;
        int var1 = -41;
        field_d = null;
        field_a = null;
        field_i = null;
    }

    final static int[] b() {
        return new int[8];
    }

    final static boolean a(int param0) {
        Object var1 = null;
        int var2 = 0;
        tm var3 = null;
        tm var4 = null;
        tm var5 = null;
        var1 = null;
        var2 = 0;
        if (ec.field_c.e((byte) 123)) {
          L0: {
            if (ok.field_b.e((byte) 123)) {
              break L0;
            } else {
              L1: {
                var4 = (tm) (Object) ok.field_b.b(120);
                if (var4.a(8)) {
                  pi discarded$6 = ok.field_b.e(63854);
                  var2 = 1;
                  vc.a(109, cm.field_o, var4.field_s);
                  break L1;
                } else {
                  break L1;
                }
              }
              var1 = (Object) (Object) (tm) (Object) ok.field_b.b(96);
              break L0;
            }
          }
          L2: {
            if (var1 == null) {
              break L2;
            } else {
              if (var2 != 0) {
                ((tm) var1).a(false);
                break L2;
              } else {
                int discarded$7 = 95;
                if (fm.a()) {
                  fn.a(27, 228, 3);
                  return ak.a(-92);
                } else {
                  return ak.a(-92);
                }
              }
            }
          }
          int discarded$8 = 95;
          if (fm.a()) {
            fn.a(27, 228, 3);
            return ak.a(-92);
          } else {
            return ak.a(-92);
          }
        } else {
          L3: {
            var3 = (tm) (Object) ec.field_c.b(81);
            if (var3.a(8)) {
              pi discarded$9 = ec.field_c.e(63854);
              vc.a(-8, cm.field_o, var3.field_s);
              var2 = 1;
              break L3;
            } else {
              break L3;
            }
          }
          var5 = (tm) (Object) ec.field_c.b(119);
          if (var5 != null) {
            L4: {
              if (var2 != 0) {
                var5.a(false);
                break L4;
              } else {
                break L4;
              }
            }
            int discarded$10 = 95;
            if (!fm.a()) {
              return ak.a(-92);
            } else {
              fn.a(27, 228, 3);
              return ak.a(-92);
            }
          } else {
            int discarded$11 = 95;
            if (fm.a()) {
              fn.a(27, 228, 3);
              return ak.a(-92);
            } else {
              return ak.a(-92);
            }
          }
        }
    }

    final static void a() {
        nb.field_i[oj.field_J].c(-1, mc.field_w);
    }

    final Object a(long param0, byte param1) {
        oh var6 = null;
        bl var7 = null;
        Object var8 = null;
        Object var9 = null;
        var7 = (bl) (Object) ((hk) this).field_g.a(-94, param0);
        if (var7 != null) {
          if (param1 >= 56) {
            var9 = var7.f(-47);
            if (var9 != null) {
              if (var7.h(0)) {
                var6 = new oh(var9, var7.field_y);
                ((hk) this).field_g.a(var7.field_d, true, (pi) (Object) var6);
                ((hk) this).field_h.a((byte) -37, (al) (Object) var6);
                ((bl) (Object) var6).field_p = 0L;
                var7.b(34);
                var7.a((byte) -121);
                return var9;
              } else {
                ((hk) this).field_h.a((byte) -37, (al) (Object) var7);
                var7.field_p = 0L;
                return var9;
              }
            } else {
              var7.b(34);
              var7.a((byte) -95);
              ((hk) this).field_b = ((hk) this).field_b + var7.field_y;
              return null;
            }
          } else {
            field_c = null;
            var8 = var7.f(-47);
            if (var8 != null) {
              if (var7.h(0)) {
                var6 = new oh(var8, var7.field_y);
                ((hk) this).field_g.a(var7.field_d, true, (pi) (Object) var6);
                ((hk) this).field_h.a((byte) -37, (al) (Object) var6);
                ((bl) (Object) var6).field_p = 0L;
                var7.b(34);
                var7.a((byte) -121);
                return var8;
              } else {
                ((hk) this).field_h.a((byte) -37, (al) (Object) var7);
                var7.field_p = 0L;
                return var8;
              }
            } else {
              var7.b(34);
              var7.a((byte) -95);
              ((hk) this).field_b = ((hk) this).field_b + var7.field_y;
              return null;
            }
          }
        } else {
          return null;
        }
    }

    private final void a(Object param0, int param1, int param2, long param3) {
        bl var6 = null;
        oh var6_ref = null;
        int var7 = MinerDisturbance.field_ab;
        try {
            if (((hk) this).field_f < 1) {
                throw new IllegalStateException();
            }
            this.a(-4924, param3);
            ((hk) this).field_b = ((hk) this).field_b - 1;
            while (((hk) this).field_b < 0) {
                var6 = (bl) (Object) ((hk) this).field_h.a(609);
                this.a(-127, var6);
            }
            var6_ref = new oh(param0, 1);
            ((hk) this).field_g.a(param3, true, (pi) (Object) var6_ref);
            ((hk) this).field_h.a((byte) -37, (al) (Object) var6_ref);
            ((bl) (Object) var6_ref).field_p = 0L;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "hk.G(" + (param0 != null ? "{...}" : "null") + ',' + 1 + ',' + 0 + ',' + param3 + ')');
        }
    }

    private final void a(int param0, long param1) {
        bl var4 = (bl) (Object) ((hk) this).field_g.a(-68, param1);
        this.a(-78, var4);
    }

    final static void c(int param0) {
        if (param0 > -94) {
          field_c = null;
          de.field_a.a((byte) -116, (fe) (Object) new qd());
          return;
        } else {
          de.field_a.a((byte) -116, (fe) (Object) new qd());
          return;
        }
    }

    private hk() throws Throwable {
        throw new Error();
    }

    final void a(int param0, long param1, Object param2) {
        if (param0 != 6565) {
            return;
        }
        try {
            this.a(param2, 1, 0, param1);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "hk.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new ec(3);
        field_c = "Go Back";
        field_e = 0;
        field_d = "Back";
    }
}
