/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w extends ci {
    static String field_Fb;
    private ci field_Eb;
    static String field_Gb;
    static String field_Hb;

    final boolean a(int param0, boolean param1) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0 == -23647) {
            break L0;
          } else {
            w.k(100);
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              ((w) this).a(true, (byte) 88);
              if (-1 == (th.field_d ^ -1)) {
                break L3;
              } else {
                if (((w) this).field_L == 0) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            if (((w) this).field_Eb.field_L == 0) {
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              break L1;
            } else {
              break L2;
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    w(ci param0, ci param1, ci param2, ci param3, ci param4, ci param5) {
        int var12 = 0;
        ci var13 = null;
        ci var14 = null;
        int var15 = 0;
        ci var17 = new ci(0L, param1, ob.field_y.toUpperCase());
        var17.field_fb = 1;
        ((w) this).field_Eb = new ci(0L, param2);
        ci var8 = new ci(0L, param3);
        ci var9 = new ci(0L, param3, ea.field_P);
        var9.field_fb = 1;
        int var10 = 50;
        int var11 = 0;
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
        ((w) this).a(100, var17.field_M, -2147483648, var10 - -var17.field_pb, 100);
        ((w) this).field_Eb.a(-20 + var17.field_M, 15, -2147483648, 15, 5);
        var8.a(0, ((w) this).field_M, -2147483648, ((w) this).field_pb + -var17.field_pb, var17.field_pb);
        var9.a(0, ((w) this).field_M, -2147483648, 15, 20);
        var8.field_Ab = wh.a(-104, var8.field_pb, 3, 11579568, 8421504, 2105376);
        var17.a((byte) 124, ((w) this).field_Eb);
        var8.a((byte) 126, var9);
        ((w) this).a((byte) 123, var17);
        ((w) this).a((byte) 125, var8);
        ((w) this).field_mb = -(((w) this).field_M >> -368036575) + 320;
        var10 = -(((w) this).field_pb >> 1466250273) + 240;
    }

    public static void k(int param0) {
        field_Gb = null;
        field_Fb = null;
        field_Hb = null;
        if (param0 != -13077) {
            field_Fb = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Gb = "No options available";
        field_Fb = "Reject <%0> from this game";
        field_Hb = "Asking to join <%0>'s game...";
    }
}
