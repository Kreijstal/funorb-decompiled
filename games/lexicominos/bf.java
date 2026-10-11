/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf {
    private int field_d;
    private int field_e;
    static int[] field_a;
    static int field_g;
    private ji field_b;
    private bg field_c;
    static String field_f;

    final static void b(byte param0) {
        int var2 = 0;
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        var1 = hh.field_M;
        synchronized (var1) {
          ul.field_o = bb.field_I;
          uc.field_eb = uc.field_eb + 1;
          bk.field_b = cj.field_i;
          sh.field_e = ij.field_h;
          ob.field_c = ql.field_K;
          ql.field_K = false;
          nk.field_z = lj.field_a;
          ef.field_a = qb.field_j;
          ck.field_a = gk.field_b;
          lj.field_a = 0;
          var2 = -8 / ((param0 - 30) / 41);
        }
    }

    final void a(Object param0, int param1, long param2) {
        try {
          this.a(param2, (byte) 62, 1, param0);
          if (param1 != -25253) {
            field_g = -94;
          }
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "bf.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static jb a(int[] param0, jb param1, int param2) {
        jb var3 = null;
        RuntimeException var3_ref = null;
        jb stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new jb(param2, 0, 0);
          var3.field_h = param1.field_h;
          var3.field_e = param1.field_e;
          var3.field_c = param1.field_c;
          var3.field_j = param0;
          var3.field_g = param1.field_g;
          var3.field_f = param1.field_f;
          var3.field_b = param1.field_b;
          var3.field_i = param1.field_i;
          stackIn_1_0 = var3;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_4_0 = var3_ref;
          stackIn_4_1 = new StringBuilder().append("bf.D(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    final Object a(long param0, int param1) {
        rh var9 = null;
        Object var10 = null;
        gj var6 = null;
        gj var6Lifetime1;
        if (param1 != 0) {
          rh var7 = (rh) null;
          this.a((rh) null, (byte) 68);
          var9 = (rh) (this.field_b.a((byte) 42, param0));
          if (var9 == null) {
            return null;
          }
          var10 = var9.c((byte) 30);
          if (var10 != null) {
            if (!var9.d((byte) -90)) {
              this.field_c.a(var9, (byte) 25);
              var9.field_j = 0L;
            } else {
              var6 = new gj(var10, var9.field_q);
              this.field_b.a(var6, 1, var9.field_d);
              this.field_c.a(var6, (byte) 25);
              ((rh) ((Object) var6)).field_j = 0L;
              var9.b((byte) -122);
              var9.b(12);
            }
            return var10;
          }
          var9.b((byte) -124);
          var9.b(param1 ^ 12);
          this.field_d = this.field_d + var9.field_q;
          return null;
        }
        rh var11 = (rh) (this.field_b.a((byte) 42, param0));
        if (var11 == null) {
          return null;
        }
        Object var12 = var11.c((byte) 30);
        if (var12 != null) {
          if (!var11.d((byte) -90)) {
            this.field_c.a(var11, (byte) 25);
            var11.field_j = 0L;
          } else {
            var6Lifetime1 = new gj(var12, var11.field_q);
            this.field_b.a(var6Lifetime1, 1, var11.field_d);
            this.field_c.a(var6Lifetime1, (byte) 25);
            ((rh) ((Object) var6Lifetime1)).field_j = 0L;
            var11.b((byte) -122);
            var11.b(12);
          }
          return var12;
        }
        var11.b((byte) -124);
        var11.b(param1 ^ 12);
        this.field_d = this.field_d + var11.field_q;
        return null;
    }

    private final void a(long param0, byte param1, int param2, Object param3) {
        rh var6 = null;
        gj var6_ref = null;
        int var7 = Lexicominos.field_L ? 1 : 0;
        try {
          if (this.field_e < param2) {
            throw new IllegalStateException();
          }
          this.b(param0, 111);
          this.field_d = this.field_d - param2;
          while (this.field_d < 0) {
            var6 = (rh) (this.field_c.b((byte) 112));
            this.a(var6, (byte) 9);
          }
          var6_ref = new gj(param3, param2);
          this.field_b.a(var6_ref, 1, param0);
          this.field_c.a(var6_ref, (byte) 25);
          if (param1 != 62) {
            bf.a((byte) 17);
          }
          ((rh) ((Object) var6_ref)).field_j = 0L;
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "bf.G(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void b(long param0, int param1) {
        rh var4 = (rh) (this.field_b.a((byte) 42, param0));
        if (param1 <= 46) {
          return;
        }
        this.a(var4, (byte) 9);
    }

    private bf() throws Throwable {
        throw new Error();
    }

    public static void a(byte param0) {
        field_a = null;
        field_f = null;
        if (param0 > -51) {
          jb var2 = (jb) null;
          bf.a((int[]) null, (jb) null, 69);
        }
    }

    private final void a(rh param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 9) {
            this.field_d = 77;
          }
          if (param0 == null) {
            return;
          }
          param0.b((byte) -122);
          param0.b(param1 + 3);
          this.field_d = this.field_d + param0.field_q;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("bf.H(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_g = -1;
        field_a = new int[16384];
        field_f = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
