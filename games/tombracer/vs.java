/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vs extends ofa {
    private boolean field_Q;
    static float field_O;
    private boolean field_N;
    static iw field_T;
    private String field_M;
    private ProgressBarWidget field_L;
    static UiComponent field_R;
    private String field_S;
    static int[] field_P;

    final void f(int param0) {
        this.field_L.field_D = false;
        if (param0 != 12936) {
          vs.releaseStatics((byte) 50);
          this.field_Q = true;
          return;
        }
        this.field_Q = true;
    }

    public static void releaseStatics(byte param0) {
        field_R = null;
        field_T = null;
        if (param0 != -77) {
          vs.releaseStatics((byte) -111);
          field_P = null;
          return;
        }
        field_P = null;
    }

    final void setProgress(float param0, String param1, boolean param2, byte param3) {
        try {
          if ((param2 ? 1 : 0) != (!this.field_N ? 1 : 0)) {
          } else {
            this.field_N = param2 ? true : false;
            if (this.field_N) {
              this.field_L.setColors(true, 4210752, 8405024);
              this.field_L.field_D = true;
            } else {
              this.field_L.setColors(true, 4210752, 2113632);
              if (this.field_Q) {
                this.field_L.field_D = false;
              }
            }
          }
          this.field_L.field_B = (int)(param0 / 100.0f * 65536.0f);
          if (param3 != 110) {
            this.field_Q = true;
          }
          this.field_S = param1;
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "vs.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void drawDialogFrame(int param0, byte param1, int param2) {
        super.drawDialogFrame(param0, param1, param2);
        ft.field_c.drawCenteredText(this.field_S, param2 + (this.field_m >> 1), param0 + 103, 16777215, -1);
        if (null != this.field_M) {
          SoftwareRasterizer.drawHorizontalLine(20 + param2, param0 + 120 - 7, 260, 8421504);
          ft.field_c.drawParagraph(this.field_M, param2 + 20, 120 + param0 + 8, 260, 100, 16777215, -1, 1, 0, ft.field_c.field_w);
        }
    }

    vs(DialogStack param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
          this.field_M = param1;
          if (null != this.field_M) {
            var3_int = ft.field_c.measureWrappedHeight(this.field_M, 260, ft.field_c.field_w);
            this.setCentredSize(-11560, var3_int + 150, 300);
          }
          this.field_L = new ProgressBarWidget(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_Q = false;
          this.field_N = false;
          this.field_L.field_D = true;
          this.addChild(this.field_L, -1);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "vs.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_T = new iw();
        field_P = new int[12];
    }
}
