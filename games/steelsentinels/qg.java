/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg implements qk {
    private int field_d;
    private BitmapFont field_b;
    static String field_i;
    private int field_k;
    static String field_g;
    private int field_c;
    static RgbSprite[] field_f;
    private int field_e;
    static String field_o;
    static String field_l;
    static boolean[][] field_j;
    private int field_m;
    static int field_a;
    static SentinelCommand field_n;
    private int field_h;
    static String field_p;

    final static void a(byte param0) {
        int var1 = 45 / ((param0 - 70) / 41);
        tc.a((byte) -113);
        hc.a(4, 0);
    }

    final static int a(byte param0, int param1) {
        int var2;
        int var3;
        var3 = SteelSentinels.obfuscationControl;
        var2 = param1;
        if (96 == var2) {
          return 2;
        }
        if (var2 == 97) {
          return 56;
        }
        if (var2 == 98) {
          return 58;
        }
        if (var2 == 99) {
          return 66;
        }
        if (100 == var2) {
          return 70;
        }
        if (102 == var2) {
          return 76;
        }
        if (103 == var2) {
          return 80;
        }
        if (var2 == 104) {
          return 85;
        }
        if (var2 == 105) {
          return 89;
        }
        if (var2 == 106) {
          return 93;
        }
        if (param0 != -60) {
          return 104;
        }
        return -1;
    }

    public static void b(byte param0) {
        field_f = null;
        field_n = null;
        field_o = null;
        field_g = null;
        if (param0 == 105) {
          field_i = null;
          field_j = (boolean[][]) null;
          field_l = null;
          field_p = null;
          return;
        }
        field_i = (String) null;
        field_i = null;
        field_j = (boolean[][]) null;
        field_l = null;
        field_p = null;
    }

    public final void a(int param0, lh param1, byte param2, boolean param3, int param4) {
        int var10 = 0;
        lh stackIn_4_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        um var12 = null;
        var11 = SteelSentinels.obfuscationControl;
        try {
          if (param1 instanceof um) {
            stackIn_4_0 = (lh) (param1);
          } else {
            stackIn_4_0 = null;
          }
          var12 = (um) (stackIn_4_0);
          SoftwareRaster.a(param0 + param1.field_o, param1.field_z + param4, param1.field_x, param1.field_E, this.field_m);
          if (var12 != null) {
          }
          var7 = -(2 * var12.field_Y) + param1.field_x;
          var8 = var12.field_Y + (param1.field_o + param0);
          var9 = var12.field_ab + (param1.field_z + param4);
          SoftwareRaster.d(var8, var9, var7 + var8, var9, this.field_k);
          for (var10 = -1 + var12.h(24129); var10 >= 0; var10--) {
            SoftwareRaster.e(var8 + var7 * var12.a(var10, -128) / var12.g((byte) 64), var9, this.field_c, this.field_h);
          }
          if (null != this.field_b) {
            this.field_b.a(var12.field_y, var8 + var7 / 2, var12.field_ab + this.field_b.field_W + var9, this.field_e, this.field_d);
          }
          if (param2 == -30) {
            return;
          }
          field_o = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("qg.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    qg(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
          this.field_e = param1;
          this.field_h = param6;
          this.field_k = param3;
          this.field_d = param2;
          this.field_m = param4;
          this.field_b = param0;
          this.field_c = param5;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "qg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_g = "Your rating is <%0>";
        field_l = "COMPONENTS:";
        field_j = new boolean[][]{null, new boolean[]{false, false, false}, new boolean[]{false, false, false, false, false, true}};
        field_i = "Add friend";
        field_o = "We have scanned the <%0> you managed to destroy and succeeded in reverse engineering it. You may now select this chassis in the 'Configuration' screen.";
        field_p = "Training";
    }
}
