/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ProgressDialog extends ResizingDialog {
    static iw field_X;
    private String field_W;
    private String field_U;
    private boolean field_P;
    private pq field_Q;
    static RasterBuffer field_R;
    static String waitingForGraphicsText;
    static String namesCannotStartOrText;
    private boolean field_S;
    static gj[] field_O;

    final static void a(String param0, String param1, int param2) {
        if (param2 != -1807) {
          return;
        }
        try {
          lr.a(false, param0, (byte) 127, param1);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "m.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void drawBackdrop(int guard, int originX, int originY) {
        if (guard > 110) {
          super.drawBackdrop(112, originX, originY);
          tq.field_a.a(this.field_W, originX + (this.width >> 1), originY + 103, 16777215, -1);
          if (null != this.field_U) {
            SoftwareRasterizer.drawHorizontalLine(20 + originX, originY + 120 - 7, 260, 8421504);
            tq.field_a.a(this.field_U, originX + 20, 128 + originY, 260, 100, 16777215, -1, 1, 0, tq.field_a.field_s);
          }
          return;
        }
        waitingForGraphicsText = (String) null;
        super.drawBackdrop(112, originX, originY);
        tq.field_a.a(this.field_W, originX + (this.width >> 1), originY + 103, 16777215, -1);
        if (null != this.field_U) {
          SoftwareRasterizer.drawHorizontalLine(20 + originX, originY + 120 - 7, 260, 8421504);
          tq.field_a.a(this.field_U, originX + 20, 128 + originY, 260, 100, 16777215, -1, 1, 0, tq.field_a.field_s);
        }
    }

    public static void releaseStatics(boolean param0) {
        namesCannotStartOrText = null;
        field_O = null;
        if (param0) {
          waitingForGraphicsText = null;
          field_R = null;
          field_X = null;
          return;
        }
        namesCannotStartOrText = (String) null;
        waitingForGraphicsText = null;
        field_R = null;
        field_X = null;
    }

    final void k(int param0) {
        this.field_S = true;
        int var2 = -98 % ((param0 - 11) / 47);
        this.field_Q.field_J = false;
    }

    ProgressDialog(DialogLayer param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
          this.field_U = param1;
          if (this.field_U != null) {
            var3_int = tq.field_a.a(this.field_U, 260, tq.field_a.field_s);
            this.resizeCentered(300, var3_int + 150, 58);
          }
          this.field_Q = new pq(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_S = false;
          this.field_Q.field_J = true;
          this.field_P = false;
          this.addChild(this.field_Q, 124);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "m.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, float param1, String param2, boolean param3) {
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_1 = 0;
        boolean stackIn_12_1 = false;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            namesCannotStartOrText = (String) null;
          }
          stackIn_5_0 = (param3) ? 0 : 1;
          if (this.field_P) {
            stackIn_8_1 = 0;
          } else {
            stackIn_8_1 = 1;
          }
          if (stackIn_5_0 != stackIn_8_1) {
            stackIn_12_1 = (param3);
            this.field_P = stackIn_12_1;
            if (this.field_P) {
              this.field_Q.b(8405024, 4210752, 108);
              this.field_Q.field_J = true;
            } else {
              this.field_Q.b(2113632, 4210752, 99);
              if (!this.field_S) {
                this.field_Q.field_I = (int)(65536.0f * (param1 / 100.0f));
                this.field_W = param2;
                return;
              }
              this.field_Q.field_J = false;
            }
          }
          this.field_Q.field_I = (int)(65536.0f * (param1 / 100.0f));
          this.field_W = param2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_21_0 = var5;
          stackIn_21_1 = new StringBuilder().append("m.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_X = new iw(3);
        namesCannotStartOrText = "Names cannot start or end with space or underscore";
        waitingForGraphicsText = "Waiting for graphics";
    }
}
