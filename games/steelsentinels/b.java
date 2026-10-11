/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b implements qk {
    static String field_g;
    static RgbSprite[] field_q;
    private int field_d;
    static String field_p;
    private int field_s;
    static String field_i;
    static boolean field_f;
    private BitmapFont field_o;
    private int field_m;
    private int field_k;
    static RgbSprite[] field_n;
    private int field_h;
    static String field_j;
    static int field_c;
    static String field_l;
    static int field_b;
    static SceneWidget field_e;
    private int field_r;
    private int field_a;

    public final void a(int param0, lh param1, byte param2, boolean param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int var13 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        nl var14 = param1 instanceof nl ? (nl) (param1) : null;
        double var9Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        SoftwareRaster.a(param0 + param1.field_o, param4 + param1.field_z, param1.field_x, param1.field_E, this.field_m);
        if (var14 != null) {
        }
        if (param2 != -30) {
          return;
        }
        try {
          var7 = var14.field_cb + (param1.field_o + param0);
          var8 = var14.field_Y + (param4 + param1.field_z);
          SoftwareRaster.e(var7, var8, var14.field_ab, this.field_a);
          if (-1 != var14.field_W) {
            var9 = (double)var14.field_W * 3.141592653589793 * 2.0 / (double)var14.field_bb;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_ab);
            var12 = (int)(Math.cos(var9) * (double)var14.field_ab);
            SoftwareRaster.e(var11 + var7, var12 + var8, 1, this.field_k);
          }
          SoftwareRaster.e(var7, var8, 2, 1);
          var9Lifetime1 = (double)var14.field_eb * 3.141592653589793 * 2.0 / (double)var14.field_bb;
          var11Lifetime1 = (int)(-Math.sin(var9Lifetime1) * (double)var14.field_ab);
          var12Lifetime1 = (int)(Math.cos(var9Lifetime1) * (double)var14.field_ab);
          SoftwareRaster.d(var7, var8, var7 + var11Lifetime1, var12Lifetime1 + var8, 1);
          if (null != this.field_o) {
            var13 = this.field_s + var14.field_cb + var14.field_ab;
            this.field_o.a(param1.field_y, param0 + param1.field_o + var13, this.field_h + param4 + param1.field_z, -var13 - this.field_s + param1.field_x, param1.field_E - (this.field_s << 1), this.field_r, this.field_d, 1, 1, 0);
          }
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "b.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, int param1) {
        CipherPacketBuffer var2 = mm.field_g;
        var2.a(param1, (byte) -117);
        var2.position = var2.position + 1;
        int var3 = var2.position;
        var2.a((byte) 113, 2);
        var2.a(rb.field_i.length, (byte) -122, 0, rb.field_i);
        var2.a((byte) 125, fi.field_l);
        var2.a((byte) 110, GameplayController.field_L);
        var2.a(ti.field_s.length, (byte) -122, 0, ti.field_s);
        var2.b((byte) 123, var2.position - var3);
        if (param0 < -21) {
          return;
        }
        field_g = (String) null;
    }

    final static void a(int param0, byte param1) {
        CipherPacketBuffer var2 = mm.field_g;
        var2.a(param0, (byte) -117);
        var2.a((byte) 123, 2);
        var2.a((byte) 112, 4);
        var2.a((byte) 127, nd.a((byte) 56));
        int var3 = -47 % ((param1 + 35) / 61);
    }

    public static void a(int param0) {
        field_j = null;
        field_l = null;
        field_i = null;
        field_g = null;
        field_p = null;
        field_e = null;
        field_q = null;
        field_n = null;
        if (param0 != 0) {
          field_p = (String) null;
        }
    }

    final static e a(boolean param0, String param1) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        e stackIn_8_0 = null;
        Object stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            field_n = (RgbSprite[]) null;
          }
          if (jn.field_b == nj.field_ab) {
            stackIn_4_0 = null;
            return (e) (stackIn_4_0);
          }
          if (sn.field_p == jn.field_b &&
            param1.equals(kh.field_z)) {
            jn.field_b = mm.field_e;
            stackIn_8_0 = vl.field_x;
            return stackIn_8_0;
          }
          jn.field_b = nj.field_ab;
          vl.field_x = null;
          kh.field_z = param1;
          stackIn_10_0 = null;
          return (e) (stackIn_10_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("b.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    b(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
          this.field_m = param7;
          this.field_h = param2;
          this.field_s = param1;
          this.field_o = param0;
          this.field_r = param3;
          this.field_k = param6;
          this.field_d = param4;
          this.field_a = param5;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "b.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        field_q = new RgbSprite[3];
        field_j = "Off";
        field_p = "S";
        field_l = "Complete three training missions to unlock your first sentinel.";
        field_i = "Research into <col=00ffff>energy shields</col> is needed before the <%0> can be engineered.";
        field_c = 500;
        field_f = false;
        field_b = 67;
    }
}
