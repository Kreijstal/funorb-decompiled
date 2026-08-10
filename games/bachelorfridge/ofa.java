/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ofa extends sna {
    private sna field_vb;

    final boolean a(boolean param0, byte param1) {
        int var3;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        var3 = -74 / ((-55 - param1) / 48);
        this.a(19842, true);
        if (lf.field_c == 0) {
          if (this.field_vb.field_R != 0) {
            return true;
          } else {
            return false;
          }
        } else {
          if (this.field_R != 0) {
            L0: {
              if (this.field_vb.field_R == 0) {
                stackIn_8_0 = 0;
                break L0;
              } else {
                stackIn_8_0 = 1;
                break L0;
              }
            }
            return stackIn_8_0 != 0;
          } else {
            stackIn_4_0 = 1;
            return stackIn_4_0 != 0;
          }
        }
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
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        sna var8 = null;
        sna var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        sna var13 = null;
        sna var14 = null;
        int var15 = 0;
        sna var17 = null;
        try {
          L0: {
            var17 = new sna(0L, param1, ci.field_p.toUpperCase());
            var17.field_N = 1;
            this.field_vb = new sna(0L, param2);
            var8 = new sna(0L, param3);
            var9 = new sna(0L, param3, qd.field_k);
            var9.field_N = 1;
            var10 = 50;
            var11 = 0;
            var12 = 0;
            L1: while (true) {
              if (jd.field_d.length <= var12) {
                var10 += 15;
                var17.a(24, 31407, var11 - -110, 0, 0);
                this.a(var17.field_p + var10, 31407, var17.field_sb, 100, 100);
                this.field_vb.a(15, 31407, 15, -20 + var17.field_sb, 5);
                var8.a(-var17.field_p + this.field_p, 31407, this.field_sb, 0, var17.field_p);
                var9.a(15, 31407, this.field_sb, 0, 20);
                var8.field_eb = mu.a(11579568, 3, var8.field_p, 8421504, 2105376, (byte) 17);
                var17.a(-1, this.field_vb);
                var8.a(-1, var9);
                this.a(-1, var17);
                this.a(-1, var8);
                var10 = 240 - (this.field_p >> 241189153);
                this.field_kb = 320 - (this.field_sb >> 2045257633);
                break L0;
              } else {
                L2: {
                  var13 = new sna(0L, param3, ij.field_l[var12]);
                  var14 = new sna(0L, param3, jd.field_d[var12]);
                  var15 = param3.field_jb.a(jd.field_d[var12]);
                  if ((var15 ^ -1) >= (var11 ^ -1)) {
                    break L2;
                  } else {
                    var11 = var15;
                    break L2;
                  }
                }
                var13.a(15, 31407, 65, 20, var10);
                var14.a(15, 31407, 640, 90, var10);
                var8.a(-1, var13);
                var10 += 30;
                var8.a(-1, var14);
                var12++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var7);

            stackIn_10_1 = new StringBuilder().append("ofa.<init>(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param4 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param5 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_11_0), stackIn_26_2 + ')');
        }
    }

    static {
    }
}
