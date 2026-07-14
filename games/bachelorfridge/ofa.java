/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ofa extends sna {
    private sna field_vb;

    final boolean a(boolean param0, byte param1) {
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_2_0 = 0;
        var3 = -74 / ((-55 - param1) / 48);
        ((ofa) this).a(19842, true);
        if (lf.field_c == 0) {
          if (((ofa) this).field_vb.field_R != 0) {
            return true;
          } else {
            return false;
          }
        } else {
          if (((ofa) this).field_R != 0) {
            L0: {
              if (((ofa) this).field_vb.field_R == 0) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                break L0;
              }
            }
            return stackIn_8_0 != 0;
          } else {
            stackOut_2_0 = 1;
            stackIn_4_0 = stackOut_2_0;
            return stackIn_4_0 != 0;
          }
        }
    }

    final static void a(int param0, je param1) {
        cq discarded$5 = tw.a(param1, (byte) -36);
        if (param0 != 0) {
            Object var3 = null;
            ofa.a(7, (je) null);
        }
    }

    ofa(sna param0, sna param1, sna param2, sna param3, sna param4, sna param5) {
        int var12 = 0;
        sna var13 = null;
        sna var14 = null;
        int var15 = 0;
        sna var17 = new sna(0L, param1, ci.field_p.toUpperCase());
        var17.field_N = 1;
        ((ofa) this).field_vb = new sna(0L, param2);
        sna var8 = new sna(0L, param3);
        sna var9 = new sna(0L, param3, qd.field_k);
        var9.field_N = 1;
        int var10 = 50;
        int var11 = 0;
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
        var17.a(24, 31407, var11 - -110, 0, 0);
        ((ofa) this).a(var17.field_p + var10, 31407, var17.field_sb, 100, 100);
        ((ofa) this).field_vb.a(15, 31407, 15, -20 + var17.field_sb, 5);
        var8.a(-var17.field_p + ((ofa) this).field_p, 31407, ((ofa) this).field_sb, 0, var17.field_p);
        var9.a(15, 31407, ((ofa) this).field_sb, 0, 20);
        var8.field_eb = mu.a(11579568, 3, var8.field_p, 8421504, 2105376, (byte) 17);
        var17.a(-1, ((ofa) this).field_vb);
        var8.a(-1, var9);
        ((ofa) this).a(-1, var17);
        ((ofa) this).a(-1, var8);
        var10 = 240 - (((ofa) this).field_p >> 241189153);
        ((ofa) this).field_kb = 320 - (((ofa) this).field_sb >> 2045257633);
    }

    static {
    }
}
