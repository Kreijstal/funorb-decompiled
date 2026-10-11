/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sl {
    private eb field_b;
    static String field_g;
    private int field_e;
    static km field_h;
    static String field_c;
    private gk field_d;
    private int field_f;
    static String field_a;

    private final void a(int param0, dm param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null) {
            param1.a(false);
            param1.c(82);
            this.field_e = this.field_e + param1.field_p;
          }
          if (param0 >= 25) {
            return;
          }
          field_g = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("sl.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private final void a(long param0, int param1) {
        int var5 = 83 / ((param1 - 25) / 59);
        dm var4 = (dm) (this.field_d.a(param0, -18348));
        this.a(106, var4);
    }

    sl(int param0) {
        this(param0, param0);
    }

    final static void a(int param0, int param1) {
        jm.a(param1, (byte) -102);
        if (param0 > -101) {
          field_g = (String) null;
        }
    }

    final Object b(long param0, int param1) {
        Object var8 = null;
        mj var6 = null;
        dm var7 = (dm) (this.field_d.a(param0, -18348));
        mj var6Lifetime1;
        if (var7 == null) {
          return null;
        }
        if (param1 != 0) {
          this.field_e = -36;
          var8 = var7.b((byte) -109);
          if (var8 != null) {
            if (!var7.d(107)) {
              this.field_b.a(true, var7);
              var7.field_j = 0L;
            } else {
              var6 = new mj(var8, var7.field_p);
              this.field_d.a(var6, param1 ^ -112, var7.field_d);
              this.field_b.a(true, var6);
              ((dm) ((Object) var6)).field_j = 0L;
              var7.a(false);
              var7.c(param1 + 69);
            }
            return var8;
          }
          var7.a(false);
          var7.c(75);
          this.field_e = this.field_e + var7.field_p;
          return null;
        }
        Object var9 = var7.b((byte) -109);
        if (var9 != null) {
          if (!var7.d(107)) {
            this.field_b.a(true, var7);
            var7.field_j = 0L;
          } else {
            var6Lifetime1 = new mj(var9, var7.field_p);
            this.field_d.a(var6Lifetime1, param1 ^ -112, var7.field_d);
            this.field_b.a(true, var6Lifetime1);
            ((dm) ((Object) var6Lifetime1)).field_j = 0L;
            var7.a(false);
            var7.c(param1 + 69);
          }
          return var9;
        }
        var7.a(false);
        var7.c(75);
        this.field_e = this.field_e + var7.field_p;
        return null;
    }

    private final void a(int param0, Object param1, long param2, int param3) {
        dm var9 = null;
        mj var6 = null;
        int var8 = Virogrid.field_F ? 1 : 0;
        try {
          if (this.field_f < param0) {
            throw new IllegalStateException();
          }
          this.a(param2, -48);
          this.field_e = this.field_e - param0;
          while (this.field_e < 0) {
            var9 = (dm) (this.field_b.a(-32314));
            this.a(103, var9);
          }
          var6 = new mj(param1, param0);
          this.field_d.a(var6, -121, param2);
          int var7 = 103 % ((-40 - param3) / 60);
          this.field_b.a(true, var6);
          ((dm) ((Object) var6)).field_j = 0L;
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "sl.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        if (param0 == 1) {
          field_h = null;
          field_g = null;
          return;
        }
        sl.a(-112);
        field_h = null;
        field_g = null;
    }

    private sl(int param0, int param1) {
        int var3;
        this.field_b = new eb();
        this.field_f = param0;
        this.field_e = param0;
        var3 = 1;
        while (true) {
          if (var3 + var3 >= param0) {
            this.field_d = new gk(var3);
            return;
          }
          if (param1 > var3) {
            var3 = var3 + var3;
            continue;
          }
          break;
        }
        this.field_d = new gk(var3);
        return;
    }

    final void a(Object param0, long param1, int param2) {
        try {
          if (param2 != -14696) {
            this.field_f = -85;
          }
          this.a(1, param0, param1, -106);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "sl.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_c = "Accept";
        field_g = "Concluded";
        field_a = "3D mode";
    }
}
