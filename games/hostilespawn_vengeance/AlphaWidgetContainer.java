/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AlphaWidgetContainer extends SingleChildWidgetContainer {
    int field_D;
    static String field_K;
    static String field_E;
    static RgbSprite field_B;
    static boolean field_C;
    static p[] field_F;
    static String[] field_I;
    static int field_J;
    static BitmapFont field_G;
    static IntrusiveDeque field_H;

    final static void l(int param0) {
        MusicTrack var2 = null;
        MusicTrack var2Lifetime1;
        if (param0 != 0) {
          AlphaWidgetContainer.k(83);
          var2 = (MusicTrack) null;
          DisplayNameSelectionPanel.a((byte) -17, (MusicTrack) null);
          return;
        }
        var2Lifetime1 = (MusicTrack) null;
        DisplayNameSelectionPanel.a((byte) -17, (MusicTrack) null);
    }

    public AlphaWidgetContainer() {
        super(0, 0, 0, 0, (WidgetRenderer) null, (WidgetEventListener) null);
        this.field_D = 256;
    }

    final void drawWidget(int param0, int param1, byte param2, int param3) {
        RgbSprite var8 = null;
        RgbSprite var9 = null;
        if (0 != param3) {
          return;
        }
        if (null == this.field_A) {
          return;
        }
        if (param2 < 42) {
          int[] var6 = (int[]) null;
          AlphaWidgetContainer.a((int[]) null, -119, -105, 49, -23);
          if (this.field_D == 0) {
            return;
          }
          if (256 != this.field_D) {
            var8 = new RgbSprite(this.field_A.field_s, this.field_A.field_x);
            sb.a(var8, -125);
            this.field_A.drawWidget(0, 0, (byte) 60, param3);
            eh.b(false);
            var8.drawWithOpacity(this.field_v + param1, param0 + this.field_m, this.field_D);
            return;
          }
          this.field_A.drawWidget(param0 + this.field_m, param1 + this.field_v, (byte) 110, param3);
          return;
        }
        if (this.field_D == 0) {
          return;
        }
        if (256 != this.field_D) {
          var9 = new RgbSprite(this.field_A.field_s, this.field_A.field_x);
          sb.a(var9, -125);
          this.field_A.drawWidget(0, 0, (byte) 60, param3);
          eh.b(false);
          var9.drawWithOpacity(this.field_v + param1, param0 + this.field_m, this.field_D);
          return;
        }
        this.field_A.drawWidget(param0 + this.field_m, param1 + this.field_v, (byte) 110, param3);
    }

    public static void k(int param0) {
        field_E = null;
        field_K = null;
        field_H = null;
        field_F = null;
        if (param0 == 608) {
          field_B = null;
          field_I = null;
          field_G = null;
          return;
        }
        int[] var2 = (int[]) null;
        AlphaWidgetContainer.a((int[]) null, 33, 96, 74, -62);
        field_B = null;
        field_I = null;
        field_G = null;
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4) {
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          while (true) {
            param1--;
            if (param1 < 0) {
              if (param2 == -1) {
                return;
              }
              field_E = (String) null;
              return;
            }
            var9 = param0;
            var5 = var9;
            var6 = param4;
            var7 = param3;
            var9[var6] = var7 + PcmOutputWorker.bitwiseAnd(8355711, var9[var6] >> 1);
            param4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_8_0 = var5_ref;
          stackIn_8_1 = new StringBuilder().append("jn.B(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    AlphaWidgetContainer(UiWidget param0) {
        super(param0.field_v, param0.field_m, param0.field_s, param0.field_x, (WidgetRenderer) null, (WidgetEventListener) null);
        try {
          param0.setBounds(this.field_s, 0, 0, 0, this.field_x);
          this.field_D = 256;
          this.field_A = param0;
        } catch (RuntimeException runtimeException) {
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) runtimeException), "jn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean e(byte param0) {
        Object var1 = null;
        Object var1_ref = null;
        int var2 = 0;
        Throwable var3 = null;
        boolean stackIn_5_0 = false;
        Throwable decompiledCaughtException = null;
        var1_ref = ByteStorage.field_c;
        synchronized (var1_ref) {
          if (PcmResampler.field_j == BoundedRandomAccessFile.field_e) {
            return false;
          }
          pj.field_e = cm.field_a[BoundedRandomAccessFile.field_e];
          SpriteBase.field_e = ProgressDialog.field_db[BoundedRandomAccessFile.field_e];
          var2 = 26 % ((-11 - param0) / 61);
          BoundedRandomAccessFile.field_e = 127 & BoundedRandomAccessFile.field_e + 1;
          stackIn_5_0 = true;
        }
        return stackIn_5_0;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        if (param0 == 100) {
          if (param1 > 0) {
            SoftwareRasterizer.setClip(32, 32, 608, 440);
            vg.field_c.drawWithAlpha(param2, param3, param1);
            SoftwareRasterizer.resetClip();
          }
          return;
        }
        field_I = (String[]) null;
        if (param1 > 0) {
          SoftwareRasterizer.setClip(32, 32, 608, 440);
          vg.field_c.drawWithAlpha(param2, param3, param1);
          SoftwareRasterizer.resetClip();
        }
    }

    final static void a(int param0, int param1) {
        q.field_d = (param1 << 16) / 150;
        q.field_k = param1 * 100 / 150;
        if (param0 == 256) {
          q.field_h = 400 * param1 / 150;
          return;
        }
    }

    static {
        field_E = "Life signs detected! Proceed with caution.";
        field_I = new String[]{"Showing by rating", "Showing by win percentage"};
        field_K = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_H = new IntrusiveDeque();
    }
}
