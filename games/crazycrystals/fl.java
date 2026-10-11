/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl implements wo {
    private int field_c;
    private int field_n;
    private vc field_p;
    private int field_h;
    static int field_g;
    private int field_j;
    private int field_r;
    static int field_m;
    private int field_e;
    private int field_d;
    static dl[] field_i;
    static String field_f;
    private int field_o;
    static dl field_a;
    private int field_k;
    static String field_l;
    private int field_b;
    private int field_q;

    public final void a(int param0, boolean param1, int param2, qm param3, boolean param4) {
        qm stackIn_3_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        of var11 = null;
        try {
          if (!(param3 instanceof of)) {
            stackIn_3_0 = null;
          } else {
            stackIn_3_0 = (qm) (param3);
          }
          var11 = (of) (stackIn_3_0);
          if (var11 != null) {
            param4 = param4 & var11.field_x;
          }
          var7 = 5592405;
          if (param1) {
            field_g = 26;
          }
          kh.f(param2 + param3.field_r, param3.field_j + param0, param3.field_g, param3.field_f, this.field_b);
          if (param4) {
            var7 = 16777215;
          }
          var8 = this.field_r + param3.field_r + param2;
          var9 = this.field_j + param3.field_j + param0;
          kh.b(var8, var9, this.field_h, this.field_d, 5592405);
          kh.f(var8, var9, this.field_h, this.field_d, var7);
          if (var11.field_A) {
            kh.e(var8, var9, var8 + this.field_h, var9 + this.field_d, 1);
            kh.e(this.field_h + var8, var9, var8, var9 + this.field_d, 1);
          }
          if (null == this.field_p) {
            return;
          }
          var10 = this.field_h + this.field_r + this.field_n;
          this.field_p.a(param3.field_o, var10 + param2 + param3.field_r, this.field_o + (param0 + param3.field_j), param3.field_g - var10 - this.field_n, -(this.field_n << 1) + param3.field_f, this.field_e, this.field_c, this.field_k, this.field_q, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_19_0 = var6;
          stackIn_19_1 = new StringBuilder().append("fl.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1) {
        if (param1 == 1) {
          vk.a(param1 ^ -39, false, param0);
          return;
        }
        field_f = (String) null;
        vk.a(param1 ^ -39, false, param0);
    }

    final static String a(int param0, String param1, db param2, String param3) {
        RuntimeException var4 = null;
        String var5 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2.a((byte) 102)) {
            stackIn_3_0 = (String) (param1);
            return stackIn_3_0;
          }
          if (param0 < 36) {
            var5 = (String) null;
            fl.a(-14, (String) null, (db) null, (String) null);
          }
          stackIn_7_0 = param3 + " - " + param2.b(3492) + "%";
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("fl.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_l = null;
        field_f = null;
        field_i = null;
        field_a = null;
        if (param0 >= -94) {
          field_l = (String) null;
        }
    }

    fl(vc param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.field_k = 1;
        this.field_q = 1;
        try {
          this.field_b = param9;
          this.field_h = param8;
          this.field_c = param4;
          this.field_r = param5;
          this.field_n = param1;
          this.field_p = param0;
          this.field_d = param7;
          this.field_o = param2;
          this.field_e = param3;
          this.field_j = param6;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "fl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        field_m = -1;
        field_f = "This is a bouncy ball.<br><br>Bouncy balls bounce back<br>and forth. Do not stand<br>in the way!<br><br>You can run up against a<br>bouncy ball safely, as long<br>as it does not run into<br>you.";
        field_l = "Not yet achieved";
    }
}
