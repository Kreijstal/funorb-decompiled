/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TwistedLogicBackground extends BackgroundScene {
    private int field_m;
    private IntrusiveDeque field_n;
    static String field_o;
    static boolean[] field_p;

    final static int a(int param0, int param1, int param2, boolean param3) {
        if (param0 != 6388) {
          return -3;
        }
        return ArrayWidgetContainer.pollAccountUiResult(72);
    }

    public static void releaseStatics(byte param0) {
        field_o = null;
        field_p = null;
        int var1 = -88 % ((param0 - 59) / 34);
    }

    final void render(boolean param0) {
        jn var4 = null;
        int var3 = Pixelate.field_H ? 1 : 0;
        SoftwareRasterizer.fillRectangle(0, 0, 640, 480, 12632256);
        if (!param0) {
          var4 = (jn) (this.field_n.first(1504642273));
          while (var4 != null) {
            MusicPatch.drawRotatingCube(var4, 1183261192);
            var4 = (jn) (this.field_n.next(1504642273));
          }
          return;
        }
    }

    final void tick(int param0) {
        int fieldTemp$1 = 0;
        jn stackIn_7_0 = null;
        int stackIn_8_1 = 0;
        jn stackIn_10_0 = null;
        boolean stackIn_11_1 = false;
        jn var2;
        int var3;
        int var4;
        var4 = Pixelate.field_H ? 1 : 0;
        super.tick(-1);
        var2 = (jn) (this.field_n.first(1504642273));
        while (var2 != null) {
          var2.field_l = var2.field_l + var2.field_s;
          var2.field_r = var2.field_r + var2.field_y;
          fieldTemp$1 = var2.field_x + 1;
          var2.field_x = var2.field_x + 1;
          if (var2.field_w <= fieldTemp$1) {
            var2.field_x = 0;
            var3 = MatchController.randomBelow(5, (byte) -120);
            stackIn_7_0 = var2;
            if (var3 != var2.field_n) {
              stackIn_8_1 = var3;
            } else {
              stackIn_8_1 = 5;
            }
            stackIn_7_0.field_n = stackIn_8_1;
            stackIn_10_0 = var2;
            stackIn_11_1 = !(!(Math.random() < 0.5));
            stackIn_10_0.field_k = stackIn_11_1;
          }
          if (var2.field_r > 148480) {
            var2.unlink(2779);
          }
          var2 = (jn) (this.field_n.next(param0 + 1504642274));
        }
        int fieldTemp$0 = this.field_m - 1;
        this.field_m = this.field_m - 1;
        if (~fieldTemp$0 <= param0) {
          return;
        }
        this.field_n.addLast(22125, new jn(TabbedPanel.randomInRange((byte) 41, 189440, -25600), -25600));
        this.field_m = TabbedPanel.randomInRange((byte) 41, 75, 25);
    }

    TwistedLogicBackground(String param0, Sprite[] param1) {
        super(param0, param1);
        int var3_int = 0;
        try {
          this.field_n = new IntrusiveDeque();
          for (var3_int = 0; 5 > var3_int; var3_int++) {
            this.field_n.addLast(22125, new jn(TabbedPanel.randomInRange((byte) 41, 189440, -25600), TabbedPanel.randomInRange((byte) 41, 148480, -25600)));
          }
          this.field_m = TabbedPanel.randomInRange((byte) 41, 75, 25);
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "qi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_o = "This game option has not yet been unlocked for use.";
        field_p = new boolean[]{false, false, true, true, true, true, true, true, true, true, true, false, true, true, true, true, false, true, false, false, false, false};
    }
}
