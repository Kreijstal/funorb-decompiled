/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hn implements db {
    private int field_a;
    private int field_p;
    private int field_m;
    private int field_j;
    static ResourceArchive field_h;
    static ig field_l;
    private int field_g;
    static hf field_q;
    static String field_f;
    private int field_e;
    static boolean field_n;
    private int field_k;
    private BitmapFont field_o;
    private int field_d;
    private int field_i;
    static int field_s;
    static Sprite field_c;
    private int field_r;
    private int field_t;
    static byte[][] field_b;

    final static int a(ih param0, int param1) {
        String stackIn_7_2 = null;
        try {
          if (param1 != 0) {
            field_b = (byte[][]) null;
          }
          String var2 = " ";
          int var3 = param0.b(var2);
          int stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2_ref = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var2_ref;
          StringBuilder stackIn_6_1 = new StringBuilder().append("hn.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void a(int param0, int param1, int param2, hm param3, boolean param4) {
        hm stackIn_3_0 = null;
        String stackIn_20_2 = null;
        try {
          if (!(param3 instanceof bo)) {
            stackIn_3_0 = null;
          } else {
            stackIn_3_0 = (hm) (param3);
          }
          bo var11 = (bo) (stackIn_3_0);
          if (var11 != null) {
            param4 = param4 & var11.field_y;
          }
          int var7 = 5592405;
          SoftwareRasterizer.a(param0 + param3.field_k, param1 + param3.field_j, param3.field_g, param3.field_x, this.field_t);
          if (param4) {
            var7 = 16777215;
          }
          int var8 = param3.field_k + param0 + this.field_e;
          if (param2 > -14) {
            return;
          }
          int var9 = this.field_r + (param3.field_j + param1);
          SoftwareRasterizer.e(var8, var9, this.field_a, this.field_k, 5592405);
          SoftwareRasterizer.a(var8, var9, this.field_a, this.field_k, var7);
          if (var11.field_z) {
            SoftwareRasterizer.d(var8, var9, var8 + this.field_a, this.field_k + var9, 1);
            SoftwareRasterizer.d(var8 + this.field_a, var9, var8, this.field_k + var9, 1);
          }
          if (this.field_o != null) {
            int var10 = this.field_e + (this.field_a + this.field_g);
            this.field_o.a(param3.field_l, var10 + param0 + param3.field_k, this.field_m + param3.field_j + param1, param3.field_g - (var10 + this.field_g), -(this.field_g << 1) + param3.field_x, this.field_i, this.field_d, this.field_p, this.field_j, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_19_0 = var6;
          StringBuilder stackIn_19_1 = new StringBuilder().append("hn.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_b = (byte[][]) null;
        field_f = null;
        if (param0 != -44) {
          return;
        }
        field_h = null;
        field_l = null;
        field_q = null;
        field_c = null;
    }

    hn(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.field_p = 1;
        this.field_j = 1;
        try {
          this.field_m = param2;
          this.field_k = param7;
          this.field_a = param8;
          this.field_r = param6;
          this.field_i = param3;
          this.field_o = param0;
          this.field_g = param1;
          this.field_d = param4;
          this.field_t = param9;
          this.field_e = param5;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "hn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        field_f = "Time: ";
        field_q = new hf();
    }
}
