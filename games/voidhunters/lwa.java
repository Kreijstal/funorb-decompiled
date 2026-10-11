/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lwa extends llb {
    private llb field_wb;
    static String field_vb;
    static asb field_xb;

    final boolean a(boolean param0, boolean param1) {
        boolean stackIn_9_0 = false;
        if (param1) {
          this.a(false, true);
        }
        boolean decompiledFrameRemainder0 = true;
        this.a(true, 1332);
        if ((0 == pba.field_o ||
          this.field_o != 0) && 0 == this.field_wb.field_o) {
          stackIn_9_0 = false;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_9_0 = true;
        }
        return stackIn_9_0;
    }

    final static int e(byte param0) {
        if (param0 != 73) {
          field_vb = (String) null;
        }
        return mw.field_e;
    }

    public static void h(int param0) {
        if (param0 != 0) {
          return;
        }
        field_vb = null;
        field_xb = null;
    }

    final static int a(int param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = VoidHunters.field_G;
        try {
          if (param1 != -1) {
            field_vb = (String) null;
          }
          for (var2_int = 0; ub.field_f.length > var2_int; var2_int++) {
            if (ub.field_f[var2_int] == param0) {
              stackIn_8_0 = var2_int;
              return stackIn_8_0;
            }
          }
          stackIn_11_0 = -1;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var2), "lwa.D(" + param0 + ',' + param1 + ')');
        }
    }

    lwa(llb param0, llb param1, llb param2, llb param3, llb param4, llb param5) {
        int var12 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        llb var8 = null;
        llb var9 = null;
        int var10 = 0;
        int var11 = 0;
        llb var13 = null;
        llb var14 = null;
        int var15 = 0;
        llb var17 = null;
        int var10Lifetime1;
        try {
          var17 = new llb(0L, param1, cu.field_p.toUpperCase());
          var17.field_F = 1;
          this.field_wb = new llb(0L, param2);
          var8 = new llb(0L, param3);
          var9 = new llb(0L, param3, kw.field_Jb);
          var9.field_F = 1;
          var10 = 50;
          var11 = 0;
          for (var12 = 0; var12 < skb.field_q.length; var12++) {
            var13 = new llb(0L, param3, pha.field_r[var12]);
            var14 = new llb(0L, param3, skb.field_q[var12]);
            var15 = param3.field_eb.b(skb.field_q[var12]);
            if (var15 > var11) {
              var11 = var15;
            }
            var13.a(20, 121, 65, var10, 15);
            var14.a(90, 124, 640, var10, 15);
            var8.b(-561, var13);
            var10 += 30;
            var8.b(-561, var14);
          }
          var10 += 15;
          var17.a(0, 116, 20 + (var11 + 90), 0, 24);
          this.a(100, 23, var17.field_hb, 100, var10 + var17.field_G);
          this.field_wb.a(-20 + var17.field_hb, 8, 15, 5, 15);
          var8.a(0, 119, this.field_hb, var17.field_G, -var17.field_G + this.field_G);
          var9.a(0, 121, this.field_hb, 20, 15);
          var8.field_gb = uwa.a(11579568, var8.field_G, 2105376, 8421504, 119, 3);
          var17.b(-561, this.field_wb);
          var8.b(-561, var9);
          this.b(-561, var17);
          this.b(-561, var8);
          var10Lifetime1 = -(this.field_G >> 1) + 240;
          this.field_L = 320 - (this.field_hb >> 1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_10_0 = var7;
          stackIn_10_1 = new StringBuilder().append("lwa.<init>(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param4 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param5 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    static {
        field_vb = "Loading extra data";
    }
}
