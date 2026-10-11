/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w extends ci {
    static String field_Fb;
    private ci field_Eb;
    static String field_Gb;
    static String field_Hb;

    final boolean a(int param0, boolean param1) {
        boolean stackIn_9_0 = false;
        if (param0 != -23647) {
          w.k(100);
        }
        boolean decompiledFrameRemainder0 = true;
        this.a(true, (byte) 88);
        if ((th.field_d == 0 ||
          this.field_L != 0) && this.field_Eb.field_L == 0) {
          stackIn_9_0 = false;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_9_0 = true;
        }
        return stackIn_9_0;
    }

    w(ci param0, ci param1, ci param2, ci param3, ci param4, ci param5) {
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
        ci var8 = null;
        ci var9 = null;
        int var10 = 0;
        int var11 = 0;
        ci var13 = null;
        ci var14 = null;
        int var15 = 0;
        ci var17 = null;
        int var10Lifetime1;
        try {
          var17 = new ci(0L, param1, ob.field_y.toUpperCase());
          var17.field_fb = 1;
          this.field_Eb = new ci(0L, param2);
          var8 = new ci(0L, param3);
          var9 = new ci(0L, param3, ea.field_P);
          var9.field_fb = 1;
          var10 = 50;
          var11 = 0;
          for (var12 = 0; var12 < be.field_b.length; var12++) {
            var13 = new ci(0L, param3, vh.field_b[var12]);
            var14 = new ci(0L, param3, be.field_b[var12]);
            var15 = param3.field_xb.b(be.field_b[var12]);
            if (var15 > var11) {
              var11 = var15;
            }
            var13.a(20, 65, -2147483648, 15, var10);
            var14.a(90, 640, -2147483648, 15, var10);
            var8.a((byte) 123, var13);
            var8.a((byte) 123, var14);
            var10 += 30;
          }
          var17.a(0, 90 + (20 + var11), -2147483648, 24, 0);
          var10 += 15;
          this.a(100, var17.field_M, -2147483648, var10 + var17.field_pb, 100);
          this.field_Eb.a(-20 + var17.field_M, 15, -2147483648, 15, 5);
          var8.a(0, this.field_M, -2147483648, this.field_pb - var17.field_pb, var17.field_pb);
          var9.a(0, this.field_M, -2147483648, 15, 20);
          var8.field_Ab = wh.a(-104, var8.field_pb, 3, 11579568, 8421504, 2105376);
          var17.a((byte) 124, this.field_Eb);
          var8.a((byte) 126, var9);
          this.a((byte) 123, var17);
          this.a((byte) 125, var8);
          this.field_mb = -(this.field_M >> 1) + 320;
          var10Lifetime1 = -(this.field_pb >> 1) + 240;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_10_0 = var7;
          stackIn_10_1 = new StringBuilder().append("w.<init>(");
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
          throw fk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    public static void k(int param0) {
        field_Gb = null;
        field_Fb = null;
        field_Hb = null;
        if (param0 != -13077) {
          field_Fb = (String) null;
        }
    }

    static {
        field_Gb = "No options available";
        field_Fb = "Reject <%0> from this game";
        field_Hb = "Asking to join <%0>'s game...";
    }
}
