/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class op extends TextWidgetPainter {
    static int[] field_z;
    static BufferedSocket field_y;
    private int field_s;
    private Sprite[] field_r;
    private int field_w;
    static String field_t;
    private int field_x;
    static String field_u;
    static int field_v;

    final static void a(int param0) {
        PitchOptionTile.field_yb = 80;
        om.field_Bb = 120;
        hq.field_d = -om.field_Bb + 480 - 21;
        if (param0 != -363021503) {
          op.b(110);
        }
        int var1 = 24;
        int var2 = 96;
        int var3 = 43;
        int var4 = 48;
        int var5 = 48;
        int var6 = 21;
        Sprite var7 = new Sprite(PitchOptionTile.field_yb << 1, om.field_Bb << 1);
        PacketBuffer.a(97, var7);
        SoftwareRasterizer.b();
        SoftwareRasterizer.c(0, 0, PitchOptionTile.field_yb << 1, om.field_Bb << 1, 2, 16777215);
        SoftwareRasterizer.e(1, 1, -2 + (PitchOptionTile.field_yb << 1), (om.field_Bb << 1) - 2, 16777215);
        SoftwareRasterizer.drawHorizontalLine(0, om.field_Bb, PitchOptionTile.field_yb << 1, 16777215);
        SoftwareRasterizer.drawHorizontalLine(0, 1 + om.field_Bb, PitchOptionTile.field_yb << 1, 16777215);
        vl.a(2, var1, true, 16777215).c(-var1 + PitchOptionTile.field_yb, om.field_Bb - var1);
        SoftwareRasterizer.c(PitchOptionTile.field_yb - (var2 >> 1), 1, var2, var4, 2, 16777215);
        SoftwareRasterizer.c(PitchOptionTile.field_yb - (var5 >> 1), 0, var5, var6, 2, 16777215);
        SoftwareRasterizer.c(PitchOptionTile.field_yb - (var2 >> 1), -1 + (-var4 + om.field_Bb) + om.field_Bb, var2, var4, 2, 16777215);
        SoftwareRasterizer.c(PitchOptionTile.field_yb - (var5 >> 1), -var6 + (om.field_Bb + om.field_Bb), var5, var6, 2, 16777215);
        AuctionListing.a(PitchOptionTile.field_yb + PitchOptionTile.field_yb, -22914, 0, -var4 + (om.field_Bb + om.field_Bb), var4);
        Sprite var8 = vl.a(2, var3, true, 16777215);
        var8.c(-var3 + PitchOptionTile.field_yb, -var3 + var6);
        var8.c(PitchOptionTile.field_yb - var3, -var3 + (om.field_Bb + om.field_Bb) - var6);
        TeamManagementScreen.e(param0 ^ -363021514);
        TeamManagementScreen.e(127);
        pq.field_Q = new Sprite(2 + PitchOptionTile.field_yb, 2 + om.field_Bb);
        PacketBuffer.a(param0 + 363021421, pq.field_Q);
        SoftwareRasterizer.fillRect(0, 0, SoftwareRasterizer.field_g, SoftwareRasterizer.field_f, 65793);
        var7.drawHalfSize(1, 1);
        TeamManagementScreen.e(125);
    }

    public final void a(int param0, boolean param1, int param2, UiWidget param3, int param4) {
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        try {
          if (!param3.field_m) {
            stackIn_6_0 = (param3.b(99)) ? 1 : 0;
          } else {
            stackIn_6_0 = 1;
          }
          var6_int = stackIn_6_0;
          if (param3 instanceof TextButton) {
            param1 = param1 & ((TextButton) (param3)).field_y;
          }
          if (!param1) {
            stackIn_13_0 = this.field_w;
          } else {
            if (var6_int != 0) {
              stackIn_13_0 = this.field_x;
            } else {
              stackIn_13_0 = this.field_s;
            }
          }
          var7 = stackIn_13_0;
          stackIn_16_0 = (!param1) ? 7105644 : 16777215;
          var8 = stackIn_16_0;
          gw.a(param3.field_g + (param2 + (-this.field_r[0].field_v + param3.field_i >> 1)), -27981, param4 + param3.field_t, param3.field_n, var7, this.field_r);
          this.field_a.a(param3.field_q, param3.field_t + param4, -2 + (param3.field_g + param2), param3.field_n, param3.field_i, var8, -1, 1, 1, this.field_a.field_G);
          var9 = -73 / ((param0 - 59) / 53);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_20_0 = var6;
          stackIn_20_1 = new StringBuilder().append("op.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_t = null;
        field_u = null;
        field_y = null;
        if (param0 != -1842526431) {
          field_u = (String) null;
        }
        field_z = null;
    }

    public op() {
        this(2188450, 2591221, 9543);
    }

    final static void a(int param0, byte param1, String param2) {
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        String[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = FormationAgent.a(param2, 2, ',');
          var4 = 0;
          var5 = 0;
          if (param1 <= 125) {
            var6 = (String) null;
            op.a(72, (byte) -7, (String) null);
          }
          while (var5 < 4) {
            incrementValue$4 = var4;
            var4++;
            ws.field_b[param0][var5] = Integer.parseInt(var3[incrementValue$4]);
            incrementValue$5 = var4;
            var4++;
            ws.field_d[param0][var5] = Integer.parseInt(var3[incrementValue$5]);
            var5++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("op.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private op(int param0, int param1, int param2) {
        this.field_r = IntrusiveDequeCursor.field_a;
        this.field_a = fj.field_b;
        this.field_s = param0;
        this.field_w = param2;
        this.field_x = param1;
    }

    static {
        field_z = new int[4];
        field_t = "There are no valid types of game that match your preferences.";
        field_u = "in the Qualifying Round";
        field_v = 2147483647;
        field_z[2] = 36049;
        field_z[3] = -1;
        field_z[0] = 12049;
        field_z[1] = 24049;
    }
}
