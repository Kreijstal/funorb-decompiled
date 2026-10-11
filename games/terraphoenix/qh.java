/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh implements cj {
    static ci field_b;
    static int[] field_c;
    private int field_f;
    static int field_d;
    private int field_a;
    private pk field_e;

    final static gd a(boolean param0) {
        String var1 = pb.a((byte) -47);
        if (!param0) {
          qh.a(false);
          if (var1 != null) {
            if (!(var1.indexOf('@') < 0)) {
              var1 = "";
            }
            return new gd(pb.a((byte) -47), dd.f((byte) 105));
          }
          return new gd(pb.a((byte) -47), dd.f((byte) 105));
        }
        if (var1 == null) {
          return new gd(pb.a((byte) -47), dd.f((byte) 105));
        }
        if (var1.indexOf('@') >= 0) {
          var1 = "";
          return new gd(pb.a((byte) -47), dd.f((byte) 105));
        }
        return new gd(pb.a((byte) -47), dd.f((byte) 105));
    }

    public final void a(int param0, gl param1, int param2, int param3, boolean param4) {
        int stackIn_8_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Terraphoenix.field_V;
        try {
          if (param3 != -24381) {
            this.field_a = -110;
          }
          if (!param1.field_s &&
            !param1.d(-110)) {
            stackIn_8_0 = 2188450;
          } else {
            stackIn_8_0 = 3249872;
          }
          var6_int = stackIn_8_0;
          this.field_e.a("<u=" + Integer.toString(var6_int, 16) + ">" + param1.field_o + "</u>", param2 + param1.field_w, param1.field_u + param0, param1.field_p, param1.field_n, var6_int, -1, this.field_a, this.field_f, this.field_e.field_p + this.field_e.field_s);
          if (!param1.d(param3 ^ 24395)) {
            return;
          }
          var7 = this.field_e.b(param1.field_o);
          var8 = this.field_e.field_p + this.field_e.field_s;
          var9 = param2 + param1.field_w;
          if (2 == this.field_a) {
            var9 = var9 + (param1.field_p - var7);
          } else {
            if (this.field_a == 1) {
              var9 = var9 + (param1.field_p - var7 >> 1);
            }
          }
          var10 = param0 + param1.field_u;
          if (this.field_f == 2) {
            var10 = var10 + (param1.field_n - var8);
          } else {
            if (1 == this.field_f) {
              var10 = var10 + (param1.field_n - var8 >> 1);
            }
          }
          ed.a(4 + var7, var8, 2 + var10, 52, -2 + var9);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_24_0 = var6;
          stackIn_24_1 = new StringBuilder().append("qh.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public qh() {
        this.field_e = qk.field_e;
        this.field_a = 1;
        this.field_f = 1;
    }

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        if (param0 != -25) {
          qh.a(true);
        }
    }

    qh(pk param0, int param1, int param2) {
        try {
          this.field_a = param1;
          this.field_f = param2;
          this.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "qh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_c = new int[16384];
    }
}
