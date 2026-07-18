/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la {
    private si field_e;
    private int field_c;
    static int field_a;
    static boolean field_d;
    private uh field_b;
    static int[] field_h;
    private int field_f;
    static String field_g;

    private final void a(int param0, long param1) {
        vi var4 = null;
        Object var5 = null;
        vi var6 = null;
        if (param0 != 0) {
          var5 = null;
          la.a((ji) null, 118);
          vi dupTemp$4 = (vi) (Object) ((la) this).field_e.a(param1, (byte) -37);
          var6 = dupTemp$4;
          var4 = dupTemp$4;
          this.a(-124, var6);
          return;
        } else {
          vi dupTemp$5 = (vi) (Object) ((la) this).field_e.a(param1, (byte) -37);
          var6 = dupTemp$5;
          var4 = dupTemp$5;
          this.a(-124, var6);
          return;
        }
    }

    final Object a(long param0, byte param1) {
        Object var5 = null;
        ua var6 = null;
        vi var7 = null;
        var7 = (vi) (Object) ((la) this).field_e.a(param0, (byte) -37);
        if (var7 != null) {
          L0: {
            var5 = var7.c(-1);
            if (param1 < -9) {
              break L0;
            } else {
              Object discarded$1 = ((la) this).a(69L, (byte) -13);
              break L0;
            }
          }
          if (var5 == null) {
            var7.b((byte) 119);
            var7.e((byte) 92);
            ((la) this).field_c = ((la) this).field_c + var7.field_y;
            return null;
          } else {
            L1: {
              if (var7.g((byte) -83)) {
                var6 = new ua(var5, var7.field_y);
                ((la) this).field_e.a(var7.field_i, false, (bh) (Object) var6);
                ((la) this).field_b.a((byte) 4, (be) (Object) var6);
                ((vi) (Object) var6).field_r = 0L;
                var7.b((byte) 106);
                var7.e((byte) 125);
                break L1;
              } else {
                ((la) this).field_b.a((byte) 4, (be) (Object) var7);
                var7.field_r = 0L;
                break L1;
              }
            }
            return var5;
          }
        } else {
          return null;
        }
    }

    final void a(Object param0, long param1, int param2) {
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
              this.a(param1, (byte) 77, 1, param0);
              if (param2 >= 3) {
                break L1;
              } else {
                this.a(94, -31L);
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
            stackOut_3_1 = new StringBuilder().append("la.D(");
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
          throw dh.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(long param0, byte param1, int param2, Object param3) {
        vi var6 = null;
        ua var6_ref = null;
        int var7 = client.field_A ? 1 : 0;
        try {
            if (!(1 <= ((la) this).field_f)) {
                throw new IllegalStateException();
            }
            this.a(0, param0);
            ((la) this).field_c = ((la) this).field_c - 1;
            while (((la) this).field_c < 0) {
                var6 = (vi) (Object) ((la) this).field_b.a((byte) 67);
                this.a(-122, var6);
            }
            var6_ref = new ua(param3, 1);
            ((la) this).field_e.a(param0, false, (bh) (Object) var6_ref);
            ((la) this).field_b.a((byte) 4, (be) (Object) var6_ref);
            ((vi) (Object) var6_ref).field_r = 0L;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "la.E(" + param0 + ',' + 77 + ',' + 1 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    la(int param0) {
        this(param0, param0);
    }

    final static void a(ji param0, int param1) {
        RuntimeException var2 = null;
        w var3 = null;
        w var5 = null;
        w var6 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              a.field_p = id.a(param0, "display_name_changed", "basic", param1 ^ 24181);
              k.field_b = new s(0L, id.field_N, o.field_h, fl.field_e);
              ge.field_f = new s(0L, id.field_N, mf.field_V, wk.field_o);
              tb.field_c = new w(0L, (w) null);
              jc.field_c = new w(0L, ua.field_H);
              jc.field_c.field_X = 1;
              tc.field_Ub = new w(0L, fh.field_g, cb.field_h);
              cf.field_d = new w(0L, dd.field_k, qj.field_e);
              jc.field_d = new w(0L, df.field_ab);
              tb.field_c.a(jc.field_c, -16834);
              tb.field_c.a(tc.field_Ub, -16834);
              tb.field_c.a(cf.field_d, -16834);
              tb.field_c.a((w) (Object) k.field_b, param1 ^ -16309);
              tb.field_c.a(jc.field_d, -16834);
              k.field_b.field_Rb.field_Rb.a(param1 ^ -32262, ua.field_H);
              k.field_b.field_Rb.field_Rb.field_W = 1;
              if (param1 == 32373) {
                break L1;
              } else {
                int discarded$1 = 92;
                la.a();
                break L1;
              }
            }
            var5 = k.field_b.field_Rb.field_Rb;
            var6 = var5;
            var6.field_X = 1;
            ge.field_f.field_Rb.field_Rb.a(param1 + -32488, ua.field_H);
            ge.field_f.field_Rb.field_Rb.field_W = 1;
            var3 = ge.field_f.field_Rb.field_Rb;
            var3.field_X = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("la.G(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
    }

    public static void a() {
        field_g = null;
        field_h = null;
    }

    private final void a(int param0, vi param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            if (param0 <= -111) {
              if (param1 != null) {
                param1.b((byte) 105);
                param1.e((byte) 76);
                ((la) this).field_c = ((la) this).field_c + param1.field_y;
                break L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("la.F(").append(param0).append(',');
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
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    private la(int param0, int param1) {
        int var3 = 0;
        ((la) this).field_b = new uh();
        ((la) this).field_f = param0;
        ((la) this).field_c = param0;
        var3 = 1;
        L0: while (true) {
          if (param0 > var3 + var3) {
            if (param1 > var3) {
              var3 = var3 + var3;
              continue L0;
            } else {
              ((la) this).field_e = new si(var3);
              return;
            }
          } else {
            ((la) this).field_e = new si(var3);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
        field_g = "End Game";
        field_h = new int[128];
    }
}
