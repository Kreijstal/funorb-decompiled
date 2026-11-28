/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AlphaWidgetContainer extends SingleChildWidgetContainer {
    int field_F;
    static int field_G;
    static String field_E;
    static int field_D;

    final static boolean a(String param0, String param1, byte param2) {
        String var3 = null;
        int var4 = 0;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param1 = am.a('_', param1, "", -23026);
          var3 = ki.a((byte) 53, param0);
          var4 = 70 % ((8 - param2) / 53);
          stackIn_5_0 = (-1 != param1.indexOf(param0)) || (param1.indexOf(var3) != -1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("ue.B(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    final void drawWidget(int param0, int param1, int param2, int param3) {
        if (param1 != 0) {
          return;
        }
        if (this.field_v == null) {
          return;
        }
        if (this.field_F == 0) {
          return;
        }
        if (this.field_F == 256) {
          this.field_v.drawWidget(30, param1, param2 + this.field_e, this.field_r + param3);
          return;
        }
        Sprite var6 = new Sprite(this.field_v.field_l, this.field_v.field_p);
        mc.a(-8497, var6);
        this.field_v.drawWidget(param0, param1, 0, 0);
        tj.b(param0 ^ 659);
        var6.drawWithOpacity(param3 + this.field_r, param2 + this.field_e, this.field_F);
    }

    AlphaWidgetContainer(UiWidget param0) {
        super(param0.field_r, param0.field_e, param0.field_l, param0.field_p, (WidgetRenderer) null, (WidgetEventListener) null);
        try {
          param0.setBounds(this.field_p, 13361, 0, this.field_l, 0);
          this.field_F = 256;
          this.field_v = param0;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "ue.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public AlphaWidgetContainer() {
        super(0, 0, 0, 0, (WidgetRenderer) null, (WidgetEventListener) null);
        this.field_F = 256;
    }

    final static void a(byte param0, boolean param1) {
        int var2 = 0;
        BinaryBitmapFont var3 = null;
        int var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        BinaryBitmapFont var3Lifetime1;
        BinaryBitmapFont var3Lifetime2;
        BinaryBitmapFont var3Lifetime3;
        BinaryBitmapFont var3Lifetime4;
        BinaryBitmapFont var3Lifetime5;
        BinaryBitmapFont var3Lifetime1Lifetime1;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        int var2Lifetime5;
        int var2Lifetime1Lifetime1;
        if (param0 != 122) {
          field_D = 13;
          if (af.field_c <= 0) {
            if (!ok.a(false)) {
              var2 = 1;
              var3 = BoundedRandomAccessFile.field_e;
              PcmOutputWorker.a(RichTextLayout.field_r, DelegatingCanvas.field_b, 480, ((BitmapFont) ((Object) var3)).field_j + ((BitmapFont) ((Object) var3)).field_D, (RichTextLayout.field_r.field_C + RichTextLayout.field_r.field_D) / 2, SpriteState.field_o, 8, 2, var2, param1, 240, ((BitmapFont) ((Object) var3)).field_j, RichTextLayout.field_r.field_j, 8, 320, var3);
              return;
            }
            var2 = 0;
            var3 = BoundedRandomAccessFile.field_e;
            PcmOutputWorker.a(RichTextLayout.field_r, DelegatingCanvas.field_b, 480, ((BitmapFont) ((Object) var3)).field_j + ((BitmapFont) ((Object) var3)).field_D, (RichTextLayout.field_r.field_C + RichTextLayout.field_r.field_D) / 2, SpriteState.field_o, 8, 2, var2, param1, 240, ((BitmapFont) ((Object) var3)).field_j, RichTextLayout.field_r.field_j, 8, 320, var3);
            return;
          }
          AwtRasterBuffer.field_f = qg.createFullscreenCanvas(640, 480, 0, rc.field_k, (byte) -73, 0);
          if (null == AwtRasterBuffer.field_f) {
            var2Lifetime4 = 3;
            var3Lifetime4 = BoundedRandomAccessFile.field_e;
            PcmOutputWorker.a(RichTextLayout.field_r, DelegatingCanvas.field_b, 480, ((BitmapFont) ((Object) var3Lifetime4)).field_j + ((BitmapFont) ((Object) var3Lifetime4)).field_D, (RichTextLayout.field_r.field_C + RichTextLayout.field_r.field_D) / 2, SpriteState.field_o, 8, 2, var2Lifetime4, param1, 240, ((BitmapFont) ((Object) var3Lifetime4)).field_j, RichTextLayout.field_r.field_j, 8, 320, var3Lifetime4);
            return;
          }
          af.a(20, AwtRasterBuffer.field_f);
          var2Lifetime5 = 2;
          var3Lifetime5 = BoundedRandomAccessFile.field_e;
          PcmOutputWorker.a(RichTextLayout.field_r, DelegatingCanvas.field_b, 480, ((BitmapFont) ((Object) var3Lifetime5)).field_j + ((BitmapFont) ((Object) var3Lifetime5)).field_D, (RichTextLayout.field_r.field_C + RichTextLayout.field_r.field_D) / 2, SpriteState.field_o, 8, 2, var2Lifetime5, param1, 240, ((BitmapFont) ((Object) var3Lifetime5)).field_j, RichTextLayout.field_r.field_j, 8, 320, var3Lifetime5);
          return;
        }
        if (af.field_c <= 0) {
          if (!ok.a(false)) {
            var2Lifetime1 = 1;
            var3Lifetime1 = BoundedRandomAccessFile.field_e;
            PcmOutputWorker.a(RichTextLayout.field_r, DelegatingCanvas.field_b, 480, ((BitmapFont) ((Object) var3Lifetime1)).field_j + ((BitmapFont) ((Object) var3Lifetime1)).field_D, (RichTextLayout.field_r.field_C + RichTextLayout.field_r.field_D) / 2, SpriteState.field_o, 8, 2, var2Lifetime1, param1, 240, ((BitmapFont) ((Object) var3Lifetime1)).field_j, RichTextLayout.field_r.field_j, 8, 320, var3Lifetime1);
            return;
          }
          var2Lifetime1Lifetime1 = 0;
          var3Lifetime1Lifetime1 = BoundedRandomAccessFile.field_e;
          PcmOutputWorker.a(RichTextLayout.field_r, DelegatingCanvas.field_b, 480, ((BitmapFont) ((Object) var3Lifetime1Lifetime1)).field_j + ((BitmapFont) ((Object) var3Lifetime1Lifetime1)).field_D, (RichTextLayout.field_r.field_C + RichTextLayout.field_r.field_D) / 2, SpriteState.field_o, 8, 2, var2Lifetime1Lifetime1, param1, 240, ((BitmapFont) ((Object) var3Lifetime1Lifetime1)).field_j, RichTextLayout.field_r.field_j, 8, 320, var3Lifetime1Lifetime1);
          return;
        }
        AwtRasterBuffer.field_f = qg.createFullscreenCanvas(640, 480, 0, rc.field_k, (byte) -73, 0);
        if (null == AwtRasterBuffer.field_f) {
          var2Lifetime2 = 3;
          var3Lifetime2 = BoundedRandomAccessFile.field_e;
          PcmOutputWorker.a(RichTextLayout.field_r, DelegatingCanvas.field_b, 480, ((BitmapFont) ((Object) var3Lifetime2)).field_j + ((BitmapFont) ((Object) var3Lifetime2)).field_D, (RichTextLayout.field_r.field_C + RichTextLayout.field_r.field_D) / 2, SpriteState.field_o, 8, 2, var2Lifetime2, param1, 240, ((BitmapFont) ((Object) var3Lifetime2)).field_j, RichTextLayout.field_r.field_j, 8, 320, var3Lifetime2);
          return;
        }
        af.a(20, AwtRasterBuffer.field_f);
        var2Lifetime3 = 2;
        var3Lifetime3 = BoundedRandomAccessFile.field_e;
        PcmOutputWorker.a(RichTextLayout.field_r, DelegatingCanvas.field_b, 480, ((BitmapFont) ((Object) var3Lifetime3)).field_j + ((BitmapFont) ((Object) var3Lifetime3)).field_D, (RichTextLayout.field_r.field_C + RichTextLayout.field_r.field_D) / 2, SpriteState.field_o, 8, 2, var2Lifetime3, param1, 240, ((BitmapFont) ((Object) var3Lifetime3)).field_j, RichTextLayout.field_r.field_j, 8, 320, var3Lifetime3);
    }

    public static void clearDeclaredStaticReferences(int param0) {
        if (param0 != 8443) {
          return;
        }
        field_E = null;
    }

    static {
        field_E = "Email is valid";
        field_D = 0;
    }
}
