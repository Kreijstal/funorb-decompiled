/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wsb {
    private int field_d;
    private int field_j;
    private ujb[] field_i;
    private int field_h;
    float field_g;
    String field_a;
    static dja field_e;
    static String field_c;
    static int field_f;
    static int field_b;

    final boolean a(byte param0) {
        ujb var2;
        int var3;
        String var4;
        ujb var5;
        var3 = VoidHunters.field_G;
        while (this.field_h > this.field_j) {
          var5 = this.field_i[this.field_j];
          var2 = var5;
          if (!var5.field_f.b((byte) 123)) {
            this.a(var5, 0, (byte) 125);
            return false;
          }
          if (0 <= var5.field_b &&
            !var5.field_f.c(68, var5.field_b)) {
            this.a(var2, var5.field_f.a(var5.field_b, 1045), (byte) 118);
            return false;
          }
          if (var5.field_e != null &&
            !var5.field_f.a(32171, var5.field_e)) {
            this.a(var2, var5.field_f.a(var5.field_e, -2118), (byte) 25);
            return false;
          }
          if (var5.field_b < 0 &&
            var5.field_e == null &&
            var5.field_a != null &&
            !var5.field_f.a(105)) {
            this.a(var2, var5.field_f.b(-107), (byte) 120);
            return false;
          }
          this.field_j = this.field_j + 1;
        }
        if (param0 > 85) {
          return true;
        }
        var4 = (String) null;
        this.a((asb) null, (String) null, false, (String) null, (String) null);
        return true;
    }

    final static int a(int param0, int param1) {
        int var2 = param0 >>> 1;
        if (param1 == 1302374146) {
          var2 = var2 | var2 >>> 1;
          var2 = var2 | var2 >>> 2;
          var2 = var2 | var2 >>> 4;
          var2 = var2 | var2 >>> 8;
          var2 = var2 | var2 >>> 16;
          return param0 & ~var2;
        }
        return -70;
    }

    private final void a(String param0, byte param1, int param2, String param3, String param4, asb param5) {
        ujb[] var10 = null;
        ujb var9 = null;
        ujb var11 = null;
        int fieldTemp$0 = 0;
        try {
          if (this.field_i.length <= this.field_h) {
            var10 = new ujb[this.field_h * 2];
            ujb[] var7 = var10;
            cua.a(this.field_i, 0, var10, 0, this.field_h);
            this.field_i = var10;
          }
          if (param1 != -62) {
            asb var8 = (asb) null;
            this.a((String) null, 126, (String) null, (asb) null);
          }
          var9 = new ujb();
          var11 = var9;
          ujb var7_ref = var11;
          var11.field_b = param2;
          var11.field_f = param5;
          var11.field_a = param0;
          var11.field_e = param3;
          var11.field_i = param4;
          fieldTemp$0 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_i[fieldTemp$0] = var9;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "wsb.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(asb param0, String param1, boolean param2, String param3, String param4) {
        try {
          this.a(param1, (byte) -62, -1, param3, param4, param0);
          if (param2) {
            field_b = -110;
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "wsb.D(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(String param0, int param1, String param2, asb param3) {
        try {
          this.a(param0, (byte) -62, param1, (String) null, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "wsb.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(byte param0) {
        field_c = null;
        if (param0 > -102) {
          field_f = -17;
          field_e = null;
          return;
        }
        field_e = null;
    }

    wsb(int param0) {
        this.field_i = new ujb[16];
        this.field_d = param0;
    }

    private final void a(ujb param0, int param1, byte param2) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_float = (float)param1 / 100.0f + (float)(this.field_j + 1);
          var5 = 40 % ((-27 - param2) / 40);
          this.field_g = (float)this.field_d * var4_float / (float)(1 + this.field_h);
          if (param1 != 0) {
            this.field_a = param0.field_a + " - " + param1 + "%";
            return;
          }
          this.field_a = param0.field_i;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("wsb.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_e = (dja) ((Object) new kfa());
        field_b = 200;
        field_f = field_b / 2;
        field_c = "Hull triangle";
    }
}
