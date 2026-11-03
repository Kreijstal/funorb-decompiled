/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WidgetStyle {
    int field_e;
    int field_i;
    static String field_b;
    private int field_p;
    WidgetPainter field_a;
    static int field_r;
    static Sprite[][] field_m;
    WidgetPainter field_o;
    int field_d;
    int field_l;
    nq field_h;
    WidgetPainter field_s;
    int field_t;
    private boolean field_n;
    WidgetPainter field_q;
    static long field_j;
    static int field_g;
    WidgetPainter field_f;
    int field_c;
    int field_k;

    final void a(nq param0, boolean param1) {
        WidgetTheme var17 = null;
        gn var4 = null;
        Sprite[] var5 = null;
        ArgbSprite var16 = null;
        ArgbSprite var18 = null;
        int var7_int = 0;
        gn var6 = null;
        gn var7 = null;
        DialPainter discarded$0 = null;
        SliderPainter discarded$1 = null;
        gn var8 = null;
        Sprite[] var9 = null;
        Sprite[] var10 = null;
        Sprite dupTemp$2 = null;
        gn var11 = null;
        gn var12 = null;
        Sprite var13 = null;
        gn var14 = null;
        gn var19 = null;
        int var15 = ShatteredPlansClient.field_F ? 1 : 0;
        gn var14Lifetime1;
        gn var14Lifetime2;
        try {
          var17 = new WidgetTheme(param0, 2, 2, 2236962, 1, 1, 1, 2 + param0.field_J + param0.field_q);
          var17.field_p = 16777215;
          this.field_s = (WidgetPainter) ((Object) var17);
          var4 = new gn();
          var17.a(var4, (byte) 42);
          this.field_h = param0;
          this.field_t = 3;
          this.field_i = 15658734;
          this.field_l = -1;
          var4.field_i = 15658734;
          this.field_k = 5592405;
          this.field_p = 15658734;
          var4.field_e = 11711154;
          this.field_d = 3;
          this.field_c = 3;
          this.field_e = 3;
          var4.a(127, 0).a((byte) 124, 15658734).a(oa.a(8947848, !param1 ? true : false, 10066329, 7829367), -73);
          var4.a(-101, 1).a(oa.a(11184810, false, 10066329, 13421772), -101);
          var4.a(-116, 3).a(oa.a(8947848, !param1 ? true : false, 7829367, 10066329), -108).a(1, (byte) 95).a(1, false);
          var5 = new Sprite[9];
          var16 = new ArgbSprite(32, 32);
          var18 = var16;
          for (var7_int = 0; var18.field_B.length > var7_int; var7_int++) {
            var16.field_B[var7_int] = 1077952576;
          }
          var5[4] = (Sprite) ((Object) var18);
          var4.a(98, 4).a(true, -28639).a(var5, -108);
          var4.a(22, 5).a(ek.a(0, 0, 65793, 0, (byte) -92), -91).a(true, -28639).a((byte) 75, -1);
          this.field_q = (WidgetPainter) ((Object) var4);
          var6 = new gn(var4, true);
          var6.field_r = 0;
          var7 = new gn(var4, true);
          var7.field_r = 0;
          var7.a((byte) 8, TaskAi.a(8947848, (byte) -16));
          var7.a(82, 1).a(TaskAi.a(11184810, (byte) -16), -93).a((byte) 71, 2236962);
          this.field_a = (WidgetPainter) ((Object) new CheckboxPainter(param0, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
          discarded$0 = new DialPainter(param0, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
          discarded$1 = new SliderPainter(param0, 16777215, -1, 125269879, 4473924, 3, 268435455);
          var8 = new gn();
          var17.a(var8, (byte) 42);
          var8.a(-109, 0).a(oa.a(15658734, false, 7829367, 10066329), -106).a((byte) 64, 1118481).a(-1, 1);
          var8.a(35, 4).a(true, -28639).a(var5, -72);
          this.field_f = (WidgetPainter) ((Object) var8);
          var9 = new Sprite[9];
          var9[4] = new Sprite(2, 1);
          var10 = new Sprite[9];
          var10[4] = new Sprite(1, 2);
          dupTemp$2 = var9[4];
          dupTemp$2.field_B = new int[]{6710886, 7829367};
          var10[4].field_B = new int[]{6710886, 7829367};
          var11 = new gn();
          var12 = new gn();
          var11.a(var9, 0, 3);
          var12.a(var10, 0, 3);
          var13 = new Sprite(7, 4);
          var13.field_B = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
          var14 = new gn(var4, true);
          var14.a(-12, var13.copy());
          var13.rotate90();
          var14Lifetime1 = new gn(var4, param1);
          var14Lifetime1.a(-12, var13.copy());
          var13.rotate90();
          var14Lifetime2 = new gn(var4, true);
          var14Lifetime2.a(-12, var13.copy());
          var13.rotate90();
          var19 = new gn(var4, true);
          var19.a(-12, var13);
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "sp.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 3) {
          return;
        }
        field_m = (Sprite[][]) null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        gf.c(param3, param6, param0, param4, param2, param1);
        int var8 = 31 % ((46 - param5) / 58);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = -70 / ((param1 + 2) / 63);
        gf.g(param0, param4, param2, param5, param3);
    }

    final static boolean a(String param0, byte param1) {
        boolean stackIn_3_0 = false;
        boolean stackIn_8_0 = false;
        boolean stackIn_14_0 = false;
        boolean stackIn_19_0 = false;
        boolean stackIn_60_0 = false;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_64_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        Star[] var3 = null;
        FleetMove var3_ref = null;
        ProjectUse var3_ref2 = null;
        int var4 = 0;
        int var6 = 0;
        Star[] var7 = null;
        Star[] var8 = null;
        int var9 = 0;
        Star var10 = null;
        Star var11 = null;
        Star[] var3Lifetime1;
        int var4Lifetime1;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param0.equalsIgnoreCase("openProduction")) {
            stackIn_3_0 = oq.field_a.field_Y.isPanelVisible("production", -125);
            return stackIn_3_0;
          }
          if (param0.equalsIgnoreCase("placeAllFleets")) {
            stackIn_8_0 = (ho.field_d.field_m.field_x == 0);
            return stackIn_8_0;
          }
          if (param0.equalsIgnoreCase("homeworldEmpty")) {
            stackIn_14_0 = (0 == ho.field_d.field_m.field_q.field_J);
            return stackIn_14_0;
          }
          var2_int = 127 % ((param1 - 2) / 45);
          if (param0.equalsIgnoreCase("homeworldOne")) {
            stackIn_19_0 = (ho.field_d.field_m.field_q.field_J == 1);
            return stackIn_19_0;
          }
          if (param0.equalsIgnoreCase("captureAll")) {
            var7 = oq.field_a.field_P.field_g.field_e;
            var3 = var7;
            var4 = 0;
            while (true) {
              if (var7.length <= var4) {
                return true;
              }
              var10 = var7[var4];
              if (ho.field_d == var10.field_y) {
                var4++;
                continue;
              }
              break;
            }
            return false;
          }
          if (param0.equalsIgnoreCase("terraforming")) {
            var8 = oq.field_a.field_P.field_g.field_e;
            var3Lifetime1 = var8;
            var9 = 0;
            var4Lifetime1 = var9;
            while (true) {
              if (var8.length <= var9) {
                return false;
              }
              var11 = var8[var9];
              if (var11.field_L != 1) {
                var9++;
                continue;
              }
              break;
            }
            return true;
          }
          if (param0.equalsIgnoreCase("placeTannhauser")) {
            var3_ref2 = (ProjectUse) (oq.field_a.field_P.field_i.startForward(0));
            while (var3_ref2 != null) {
              if (var3_ref2.field_o == 3 &&
                oq.field_a.field_P.field_g.field_e[12] == var3_ref2.field_r) {
                return true;
              }
              var3_ref2 = (ProjectUse) (oq.field_a.field_P.field_i.nextForward((byte) -71));
            }
            return false;
          }
          if (!param0.equalsIgnoreCase("fleetmove")) {
            stackIn_60_0 = sr.a(0, param0);
            return stackIn_60_0;
          }
          var3_ref = (FleetMove) (oq.field_a.field_P.field_p.a(true));
          while (true) {
            if (var3_ref == null) {
              return false;
            }
            if (ho.field_d != var3_ref.field_G) {
              var3_ref = (FleetMove) (oq.field_a.field_P.field_p.a((byte) -68));
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_63_0 = var2;
          stackIn_63_1 = new StringBuilder().append("sp.F(");
          if (param0 == null) {
            stackIn_64_2 = "null";
          } else {
            stackIn_64_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_63_0), ((StringBuilder) (Object) stackIn_63_1).append(stackIn_64_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, String param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (this.field_n) {
            this.a(param3, param0, param1, 0);
          } else {
            this.a(-116, param0, param3, param1);
          }
          if (param2 < 100) {
            this.field_k = -111;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("sp.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final void a(String param0, int param1, int param2, int param3) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var11Lifetime1;
        int var13Lifetime1;
        int var13Lifetime2;
        var15 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var5_int = this.field_d + this.field_e;
          var6 = this.field_c + this.field_t;
          var7 = this.field_l;
          if (var7 == -1) {
            var7 = this.field_h.field_q + this.field_h.field_J;
          }
          var8 = gf.field_b >> 2;
          var9 = this.field_h.stringWidth(param0);
          var10 = this.field_h.field_J + this.field_h.field_q;
          var11 = 1;
          if (var8 < var9 ||
            param0.indexOf("<br>") != -1) {
            if (mp.field_c == null) {
              mp.field_c = new String[16];
            }
            if (var9 <= var8) {
              var12 = var8;
            } else {
              var13 = var9 / var8;
              var12 = var8 + 2 * ((var13 + var9 % var8 - 1) / var13);
            }
            var11Lifetime1 = this.field_h.wrapText(param0, new int[]{var12}, mp.field_c);
            var9 = 0;
            var10 = var10 + var7 * (-1 + var11Lifetime1);
            for (var13Lifetime2 = 0; var13Lifetime2 < var11Lifetime1; var13Lifetime2++) {
              var14 = this.field_h.stringWidth(mp.field_c[var13Lifetime2]);
              if (var9 < var14) {
                var9 = var14;
              }
            }
          }
          var12 = param2;
          if (gf.field_b < var9 + var12 + var5_int) {
            var12 = -var9 + (gf.field_b - var5_int);
          }
          var13Lifetime1 = param1 - this.field_h.field_K + 32;
          if (var6 + (var13Lifetime1 + var10) > gf.field_k) {
            var13Lifetime1 = param1 + (-var10 - var6);
          }
          gf.b(var12, var13Lifetime1, var5_int + var9, var10 + var6, this.field_i);
          gf.d(1 + var12, 1 + var13Lifetime1, var9 - (-var5_int + 2), var10 + var6 - 2, this.field_k);
          this.field_h.a(param0, this.field_d + var12, this.field_t + var13Lifetime1, var9, var10, this.field_p, -1, param3, 0, var7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_26_0 = var5;
          stackIn_26_1 = new StringBuilder().append("sp.E(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(int param0, int param1, String param2, int param3) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          var5_int = this.field_h.stringWidth(param2);
          var6 = this.field_h.field_K + this.field_h.field_q;
          var7 = param3;
          if (gf.field_b < 6 + var5_int + var7) {
            var7 = -var5_int + gf.field_b - 6;
          }
          var8 = 32 - this.field_h.field_K + param1;
          if (var8 + var6 + 6 > gf.field_k) {
            var8 = gf.field_k + (-var6 - 6);
          }
          gf.b(var7, var8, var5_int + 6, var6 + 6, this.field_p);
          gf.d(1 + var7, 1 + var8, var5_int + 4, var6 + 4, this.field_k);
          this.field_h.drawString(param2, var7 + 3, 3 + (var8 + this.field_h.field_K), this.field_p, -1);
          if (param0 > -98) {
            this.field_h = (nq) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("sp.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    public WidgetStyle() {
        this.field_n = true;
    }

    static {
        field_b = "<%PROJECT_BIOMASS> - (<%Resource1>) A <col=<%colbiomass>>terraformed</col> <%glossary>system</col> always produces <%highlight>six resource units</col>, which are not related to the production level of the system prior to <%project_biomass>. This project may be used on any system you control.";
    }
}
