/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij extends IntrusiveNode {
    int field_E;
    int[] field_L;
    int field_B;
    int[] field_x;
    int[] field_p;
    int field_H;
    UiComponent field_q;
    int field_w;
    static int field_G;
    int field_m;
    static String createAlertInvaliddate;
    int[] field_D;
    UiComponent field_I;
    int[] field_F;
    int[] field_z;
    Sprite field_K;
    int field_r;
    static String playerYouFirstListAreGroupName;
    int field_C;
    int field_y;
    UiComponent field_l;
    static String loginNoDisplayname;
    static MusicTrack field_u;
    static so field_o;
    int field_v;
    static String ballsetPolarGroup0;
    int field_J;

    public static void a(int param0) {
        field_u = null;
        playerYouFirstListAreGroupName = null;
        if (param0 == -273542815) {
          ballsetPolarGroup0 = null;
          field_o = null;
          loginNoDisplayname = null;
          createAlertInvaliddate = null;
          return;
        }
        ij.a(118);
        ballsetPolarGroup0 = null;
        field_o = null;
        loginNoDisplayname = null;
        createAlertInvaliddate = null;
    }

    ij(int param0) {
        this.field_q = null;
        this.field_w = 256;
        this.field_p = null;
        this.field_D = null;
        this.field_I = null;
        this.field_y = 25;
        this.field_l = null;
        this.field_r = 10;
        this.field_F = null;
        this.field_H = 25;
        this.field_v = 12;
        this.field_z = new int[]{SoftwareRasterizer.width >> 1, SoftwareRasterizer.height >> 1};
        this.field_m = param0;
        this.field_L = new int[]{SoftwareRasterizer.width >> 1, SoftwareRasterizer.height >> 1};
        this.field_x = new int[]{SoftwareRasterizer.width >> 1, SoftwareRasterizer.height >> 1};
        this.field_B = 50;
    }

    final void a(String param0, byte param1, String param2) {
        int var12 = 0;
        int stackIn_7_0 = 0;
        BinaryBitmapFont stackIn_15_0;
        String stackIn_15_1;
        int stackIn_15_2;
        int stackIn_15_3;
        int stackIn_15_4;
        int stackIn_15_5;
        int stackIn_15_6;
        int stackIn_15_7;
        int stackIn_16_8;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        int var11 = 0;
        int var13 = 0;
        Sprite var14 = null;
        try {
          if (param1 < 79) {
            this.field_L = (int[]) null;
          }
          var14 = dq.createTextLabelSprite(4, 0, param0);
          var5 = var14.field_z;
          if (param2 == null) {
            this.field_B = (param0.length() >> 3) * 25;
            this.field_K = var14;
            return;
          }
          this.field_B = 25 * param2.length() / 16;
          var6 = sa.field_h.measureWrappedHeight(param2, 320, sa.field_h.baselineHeight + 3);
          var7 = 5 + FreePlayRules.field_e.maxAscent + (FreePlayRules.field_e.maxDescent + var6);
          stackIn_7_0 = (var5 >= 320) ? var5 : 320;
          var8 = stackIn_7_0;
          this.field_K = new Sprite(var8, var7);
          this.field_K.e();
          var14.draw(var8 - var14.field_z >> 1, 0);
          var9 = 0;
          var10 = new String[16];
          var11 = sa.field_h.wrapText(param2, new int[]{320}, var10);
          for (var12 = 0; var11 > var12; var12++) {
            var13 = sa.field_h.b(var10[var12]);
            if (var9 < var13) {
              var9 = var13;
            }
          }
          stackIn_15_0 = sa.field_h;
          stackIn_15_1 = (String) (param2);
          stackIn_15_2 = (-320 + var8) / 2;
          stackIn_15_3 = FreePlayRules.field_e.maxDescent + (FreePlayRules.field_e.maxAscent + 5);
          stackIn_15_4 = 320;
          stackIn_15_5 = var6;
          stackIn_15_6 = 16777215;
          stackIn_15_7 = 1;
          if (var9 < 320) {
            stackIn_16_8 = 1;
          } else {
            stackIn_16_8 = 3;
          }
          ((BinaryBitmapFont) (Object) stackIn_15_0).drawParagraph(stackIn_15_1, stackIn_15_2, stackIn_15_3, stackIn_15_4, stackIn_15_5, stackIn_15_6, stackIn_15_7, stackIn_16_8, 0, 3 + sa.field_h.baselineHeight);
          OpacityWidget.field_P.bindAsRenderTarget(15100);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_20_0 = var4;
          stackIn_20_1 = new StringBuilder().append("ij.B(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    static {
        field_G = 0;
        createAlertInvaliddate = "Invalid date";
        playerYouFirstListAreGroupName = "You<%0> are <%2>.";
        field_u = null;
        ballsetPolarGroup0 = "Spots";
        loginNoDisplayname = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
    }
}
