/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od {
    private m field_b;
    private int field_a;
    static String field_c;
    private int field_d;
    static ie field_f;
    private wh field_e;

    private final void a(Object param0, long param1, boolean param2, int param3) {
        eg var6 = null;
        t var6_ref = null;
        int var7 = Bounce.field_N;
        try {
          if (param3 > this.field_d) {
            throw new IllegalStateException();
          }
          this.a(-101, param1);
          this.field_a = this.field_a - param3;
          while (this.field_a < 0) {
            var6 = (eg) (this.field_e.a(14));
            this.a(0, var6);
          }
          var6_ref = new t(param0, param3);
          if (param2) {
            this.field_a = -61;
          }
          this.field_b.a(-110, param1, var6_ref);
          this.field_e.a(6753, var6_ref);
          ((eg) ((Object) var6_ref)).field_j = 0L;
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "od.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final Object a(long param0, int param1) {
        t var6 = null;
        eg var7 = (eg) (this.field_b.a((byte) -35, param0));
        t var6Lifetime1;
        if (var7 == null) {
          return null;
        }
        Object var5 = var7.e(-103);
        if (var5 == null) {
          var7.c(2);
          var7.a(-122);
          this.field_a = this.field_a + var7.field_m;
          return null;
        }
        if (param1 == 1872) {
          if (!var7.c((byte) -125)) {
            this.field_e.a(6753, var7);
            var7.field_j = 0L;
          } else {
            var6 = new t(var5, var7.field_m);
            this.field_b.a(param1 ^ -1828, var7.field_d, var6);
            this.field_e.a(6753, var6);
            ((eg) ((Object) var6)).field_j = 0L;
            var7.c(param1 - 1870);
            var7.a(89);
          }
          return var5;
        }
        this.field_a = -101;
        if (!var7.c((byte) -125)) {
          this.field_e.a(6753, var7);
          var7.field_j = 0L;
        } else {
          var6Lifetime1 = new t(var5, var7.field_m);
          this.field_b.a(param1 ^ -1828, var7.field_d, var6Lifetime1);
          this.field_e.a(6753, var6Lifetime1);
          ((eg) ((Object) var6Lifetime1)).field_j = 0L;
          var7.c(param1 - 1870);
          var7.a(89);
        }
        return var5;
    }

    private final void a(int param0, long param1) {
        eg var5 = null;
        Object var4 = null;
        eg var5Lifetime1;
        if (param0 <= -37) {
          var5 = (eg) (this.field_b.a((byte) 118, param1));
          this.a(0, var5);
          return;
        }
        od.a(-67);
        var5Lifetime1 = (eg) (this.field_b.a((byte) 118, param1));
        this.a(0, var5Lifetime1);
    }

    final static void a(byte param0) {
        String var2 = (String) null;
        pk.a((String) null, eb.field_z, -98);
        if (param0 != 24) {
          field_c = (String) null;
        }
    }

    final void a(Object param0, long param1, int param2) {
        try {
          this.a(param0, param1, false, param2);
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "od.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, eg param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            od.a(68);
          }
          if (param1 == null) {
            return;
          }
          param1.c(param0 + 2);
          param1.a(109);
          this.field_a = this.field_a + param1.field_m;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("od.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_c = null;
        if (param0 != 0) {
          field_f = (ie) null;
        }
    }

    private od() throws Throwable {
        throw new Error();
    }

    static {
        field_c = "Prev";
    }
}
