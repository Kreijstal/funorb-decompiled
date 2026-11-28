/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ProgressDialog extends ResizableModalDialog {
    private StripedProgressWidget field_X;
    private String field_R;
    static int[] field_U;
    private boolean field_T;
    static int field_V;
    private boolean field_S;
    private String field_W;

    final static void a(int param0, int param1, int param2, PlatformTaskDispatcher param3, int param4, byte param5, int param6, int param7, String param8) {
        qd.field_b = param2;
        if (param5 != -92) {
          return;
        }
        try {
          ni.field_e = param1;
          fc.field_q = param6;
          DelegatingCanvas.field_c = param7;
          sa.field_g = param3;
          wg.field_e = param4;
          fl.field_d = param8;
          rc.field_i = param0;
          kb.field_b = (wb) ((Object) new qf());
          AccountCreationResultPanel.field_pb = new DiskCacheWorker(param3);
          nh.field_a = new pg(kb.field_b, AccountCreationResultPanel.field_pb);
        } catch (RuntimeException runtimeException) {
          throw ld.wrapClientException((Throwable) ((Object) runtimeException), "uk.M(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ')');
        }
    }

    ProgressDialog(ModalDialogHost param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
          this.field_R = param1;
          if (this.field_R != null) {
            var3_int = FullscreenFocusCanvas.field_c.textHeight(this.field_R, 260, FullscreenFocusCanvas.field_c.field_E);
            this.setCenteredSize(300, -114, 150 + var3_int);
          }
          this.field_X = new StripedProgressWidget(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_X.field_G = true;
          this.field_T = false;
          this.field_S = false;
          this.addChild((byte) 70, this.field_X);
        } catch (RuntimeException runtimeException) {
          throw ld.wrapClientException((Throwable) ((Object) runtimeException), "uk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void drawDialogBackground(int param0, byte param1, int param2) {
        int var4 = 3 % ((-3 - param1) / 43);
        super.drawDialogBackground(param0, (byte) 116, param2);
        FullscreenFocusCanvas.field_c.drawCentred(this.field_W, param2 + (this.field_j >> 1), param0 + 103, 16777215, -1);
        if (this.field_R != null) {
          SoftwareRasterizer.drawHorizontalLine(20 + param2, param0 + 120 - 7, 260, 8421504);
          FullscreenFocusCanvas.field_c.drawParagraph(this.field_R, 20 + param2, 120 + param0 + 8, 260, 100, 16777215, -1, 1, 0, FullscreenFocusCanvas.field_c.field_E);
          return;
        }
    }

    final void setProgress(boolean param0, String param1, int param2, float param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        boolean stackIn_2_0 = false;
        int stackIn_3_1 = 0;
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_2_0 = param0;
          if (this.field_S) {
            stackIn_3_1 = 0;
          } else {
            stackIn_3_1 = 1;
          }
          if ((stackIn_2_0 ? 1 : 0) == stackIn_3_1) {
            stackIn_7_1 = (param0);
            this.field_S = stackIn_7_1;
            if (this.field_S) {
              this.field_X.setColours(4210752, 8405024, 86);
              this.field_X.field_G = true;
            } else {
              this.field_X.setColours(4210752, 2113632, 122);
              if (this.field_T) {
                this.field_X.field_G = false;
              }
            }
          }
          var5_int = -115 / ((param2 - 92) / 33);
          this.field_X.field_K = (int)(65536.0f * (param3 / 100.0f));
          this.field_W = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_15_0 = runtimeException;
          stackIn_15_1 = new StringBuilder().append("uk.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ld.wrapClientException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static IndexedSprite a(int param0, ResourceArchive param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = 45 / ((62 - param0) / 60);
          if (DequeWidgetContainer.a(param2, param3, (byte) -45, param1)) {
            return ResizableModalDialog.e(false);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("uk.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ld.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static RgbSprite[] a(String param0, String param1, int param2, ResourceArchive param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RgbSprite[] stackIn_2_0 = null;
        RgbSprite[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -909811167) {
            stackIn_2_0 = (RgbSprite[]) null;
            return stackIn_2_0;
          }
          var4_int = param3.getGroupIdByName(param1, (byte) -89);
          var5 = param3.getFileIdByName(param0, -27964, var4_int);
          stackIn_4_0 = fi.a(param3, var5, (byte) 62, var4_int);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("uk.L(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ld.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void clearStaticReferences(int param0) {
        int var1 = 121 % ((param0 + 30) / 35);
        field_U = null;
    }

    final static void g(boolean param0) {
        int fieldTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        BitPacketBuffer var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        var3 = Lexicominos.field_L ? 1 : 0;
        try {
          var1 = SpriteGeometry.field_q;
          if (!param0) {
            ProgressDialog.g(false);
          }
          while (InteractiveWidget.d(true)) {
            var1.writeCipheredByte(8, 0);
            fieldTemp$0 = var1.position + 1;
            var1.position = var1.position + 1;
            var2 = fieldTemp$0;
            ej.a(-17, var1);
            SpriteGeometry.field_q.backpatchByteLength(-var2 + var1.position, (byte) -125);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ld.wrapClientException((Throwable) ((Object) var1_ref), "uk.A(" + param0 + ')');
        }
    }

    final void freezeNormalProgressAnimation(int param0) {
        this.field_T = true;
        this.field_X.field_G = false;
        if (param0 != 4210752) {
          ResourceArchive var3 = (ResourceArchive) null;
          ProgressDialog.a(-77, (ResourceArchive) null, 44, -33);
          return;
        }
    }

    static {
        field_U = new int[15];
    }
}
