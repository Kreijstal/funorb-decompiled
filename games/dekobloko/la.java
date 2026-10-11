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
        vi dupTemp$0 = null;
        vi var6 = null;
        vi var4 = null;
        vi var6Lifetime1;
        vi var4Lifetime1;
        if (param0 == 0) {
          dupTemp$0 = (vi) (this.field_e.a(param1, (byte) -37));
          var6 = dupTemp$0;
          var4 = dupTemp$0;
          this.a(-124, var6);
          return;
        }
        ji var5 = (ji) null;
        la.a((ji) null, 118);
        vi dupTemp$1 = (vi) (this.field_e.a(param1, (byte) -37));
        var6Lifetime1 = dupTemp$1;
        var4Lifetime1 = dupTemp$1;
        this.a(-124, var6Lifetime1);
    }

    final Object a(long param0, byte param1) {
        ua var6 = null;
        vi var7 = (vi) (this.field_e.a(param0, (byte) -37));
        if (var7 == null) {
          return null;
        }
        Object var5 = var7.c(-1);
        if (param1 >= -9) {
          this.a(69L, (byte) -13);
        }
        if (var5 != null) {
          if (!var7.g((byte) -83)) {
            this.field_b.a((byte) 4, var7);
            var7.field_r = 0L;
          } else {
            var6 = new ua(var5, var7.field_y);
            this.field_e.a(var7.field_i, false, var6);
            this.field_b.a((byte) 4, var6);
            ((vi) ((Object) var6)).field_r = 0L;
            var7.b((byte) 106);
            var7.e((byte) 125);
          }
          return var5;
        }
        var7.b((byte) 119);
        var7.e((byte) 92);
        this.field_c = this.field_c + var7.field_y;
        return null;
    }

    final void a(Object param0, long param1, int param2) {
        try {
          this.a(param1, (byte) 77, 1, param0);
          if (param2 < 3) {
            this.a(94, -31L);
          }
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "la.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(long param0, byte param1, int param2, Object param3) {
        vi var6 = null;
        ua var6_ref = null;
        int var7 = client.field_A ? 1 : 0;
        try {
          if (param2 > this.field_f) {
            throw new IllegalStateException();
          }
          this.a(param1 - 77, param0);
          this.field_c = this.field_c - param2;
          while (this.field_c < 0) {
            var6 = (vi) (this.field_b.a((byte) 67));
            this.a(-122, var6);
          }
          var6_ref = new ua(param3, param2);
          this.field_e.a(param0, false, var6_ref);
          this.field_b.a((byte) 4, var6_ref);
          if (param1 != 77) {
            la.a((byte) -109);
          }
          ((vi) ((Object) var6_ref)).field_r = 0L;
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "la.E(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    la(int param0) {
        this(param0, param0);
    }

    final static void a(ji param0, int param1) {
        w var5 = null;
        w var6 = null;
        w var3 = null;
        try {
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
          tb.field_c.a(k.field_b, param1 ^ -16309);
          tb.field_c.a(jc.field_d, -16834);
          k.field_b.field_Rb.field_Rb.a(param1 ^ -32262, ua.field_H);
          k.field_b.field_Rb.field_Rb.field_W = 1;
          if (param1 != 32373) {
            la.a((byte) 92);
          }
          var5 = k.field_b.field_Rb.field_Rb;
          var6 = var5;
          var6.field_X = 1;
          ge.field_f.field_Rb.field_Rb.a(param1 - 32488, ua.field_H);
          ge.field_f.field_Rb.field_Rb.field_W = 1;
          var3 = ge.field_f.field_Rb.field_Rb;
          var3.field_X = 1;
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "la.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        field_g = null;
        field_h = null;
        if (param0 < 36) {
          ji var2 = (ji) null;
          la.a((ji) null, 120);
        }
    }

    private final void a(int param0, vi param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -111) {
            return;
          }
          if (param1 == null) {
            return;
          }
          param1.b((byte) 105);
          param1.e((byte) 76);
          this.field_c = this.field_c + param1.field_y;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("la.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private la(int param0, int param1) {
        int var3;
        this.field_b = new uh();
        this.field_f = param0;
        this.field_c = param0;
        var3 = 1;
        while (true) {
          if (param0 <= var3 + var3) {
            this.field_e = new si(var3);
            return;
          }
          if (param1 > var3) {
            var3 = var3 + var3;
            continue;
          }
          break;
        }
        this.field_e = new si(var3);
        return;
    }

    static {
        field_a = 0;
        field_g = "End Game";
        field_h = new int[128];
    }
}
