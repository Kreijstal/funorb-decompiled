/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ofa extends sna {
    private sna field_vb;

    final boolean a(boolean param0, byte param1) {
        int var3 = -74 / ((-55 - param1) / 48);
        this.a(19842, true);
        if (lf.field_c != 0) {
          if (this.field_R == 0) {
            return true;
          }
          return this.field_vb.field_R != 0 ? true : false;
        }
        if (this.field_vb.field_R == 0) {
          return false;
        }
        return true;
    }

    final static void a(int param0, je param1) {
        try {
          tw.a(param1, (byte) -36);
          if (param0 != 0) {
            je var3 = (je) null;
            ofa.a(7, (je) null);
          }
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "ofa.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    ofa(sna param0, sna param1, sna param2, sna param3, sna param4, sna param5) {
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
        sna var8 = null;
        sna var9 = null;
        int var10 = 0;
        int var11 = 0;
        sna var13 = null;
        sna var14 = null;
        int var15 = 0;
        sna var17 = null;
        int var10Lifetime1;
        try {
          var17 = new sna(0L, param1, ci.field_p.toUpperCase());
          var17.field_N = 1;
          this.field_vb = new sna(0L, param2);
          var8 = new sna(0L, param3);
          var9 = new sna(0L, param3, qd.field_k);
          var9.field_N = 1;
          var10 = 50;
          var11 = 0;
          for (var12 = 0; jd.field_d.length > var12; var12++) {
            var13 = new sna(0L, param3, ij.field_l[var12]);
            var14 = new sna(0L, param3, jd.field_d[var12]);
            var15 = param3.field_jb.a(jd.field_d[var12]);
            if (var15 > var11) {
              var11 = var15;
            }
            var13.a(15, 31407, 65, 20, var10);
            var14.a(15, 31407, 640, 90, var10);
            var8.a(-1, var13);
            var10 += 30;
            var8.a(-1, var14);
          }
          var10 += 15;
          var17.a(24, 31407, var11 + 110, 0, 0);
          this.a(var17.field_p + var10, 31407, var17.field_sb, 100, 100);
          this.field_vb.a(15, 31407, 15, -20 + var17.field_sb, 5);
          var8.a(-var17.field_p + this.field_p, 31407, this.field_sb, 0, var17.field_p);
          var9.a(15, 31407, this.field_sb, 0, 20);
          var8.field_eb = mu.a(11579568, 3, var8.field_p, 8421504, 2105376, (byte) 17);
          var17.a(-1, this.field_vb);
          var8.a(-1, var9);
          this.a(-1, var17);
          this.a(-1, var8);
          var10Lifetime1 = 240 - (this.field_p >> 1);
          this.field_kb = 320 - (this.field_sb >> 1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_10_0 = var7;
          stackIn_10_1 = new StringBuilder().append("ofa.<init>(");
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
          throw pe.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    static {
    }
}
