/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DropdownPopupList extends haa {
    int field_G;
    int field_K;
    static ToolkitSprite field_E;
    int field_H;
    Object[] field_I;
    private DropdownList field_J;
    private BitmapFont field_F;

    final void renderLayer(int param0, int param1, int param2, int param3) {
        int var8 = 0;
        Object var9 = null;
        String var10 = null;
        int var11 = TombRacer.field_G ? 1 : 0;
        if (0 != param3) {
          return;
        }
        int var5 = param0 + this.field_i;
        int var6 = param1 + this.field_n;
        SoftwareRasterizer.fillRectangle(var5, var6, this.field_m, this.field_p, param2);
        int var7 = this.field_G;
        if (this.field_H != -1) {
          var7 = this.field_H;
        }
        if (this.field_I != null) {
          for (var8 = 0; var8 < this.field_I.length; var8++) {
            var9 = this.field_I[var8];
            var10 = var9.toString();
            if (var7 == var8) {
              SoftwareRasterizer.fillRectangleAlpha(2 + var5, 4 + var6, -4 + this.field_m, this.field_K, 2188450, 128);
            }
            var6 = var6 + this.field_K;
            this.field_F.drawText(var10, var5 + 2, var6, 10000536, -1);
          }
        }
    }

    final Object getSelectedItem(int param0) {
        Object stackIn_7_0 = null;
        if (param0 <= 113) {
          return (Object) null;
        }
        if (null != this.field_I &&
          this.field_G != -1) {
          stackIn_7_0 = this.field_I[this.field_G];
        } else {
          stackIn_7_0 = null;
        }
        return stackIn_7_0;
    }

    final boolean containsPointer(int param0, int param1, int param2, int param3, int param4) {
        int var6;
        var6 = 100 / ((-38 - param2) / 50);
        this.field_H = -1;
        if (!this.field_J.field_G) {
          return false;
        }
        if (!this.field_J.field_F.field_A.field_f) {
          return false;
        }
        if (this.field_I == null) {
          return super.containsPointer(param0, param1, -107, param3, param4);
        }
        param0 = param0 - (param1 + this.field_i);
        param3 = param3 - (this.field_n + param4);
        if (param0 >= 0 &&
          0 <= param3 &&
          param0 <= this.field_m) {
          if (param3 > this.field_p) {
            return false;
          }
          this.field_H = param3 / this.field_K;
          if (this.field_I.length <= this.field_H) {
            this.field_H = -1;
          }
          return true;
        }
        return false;
    }

    final static Sprite buildFirstDecodedSprite(byte param0) {
        int var4_int = 0;
        int var5 = TombRacer.field_G ? 1 : 0;
        int var1 = mq.field_b[0] * ImageProducerCanvasImageBuffer.field_m[0];
        byte[] var2 = ck.field_c[0];
        int[] var3 = new int[var1];
        for (var4_int = 0; var4_int < var1; var4_int++) {
          var3[var4_int] = QueuedHint.field_g[SnakePitBehaviour.bitwiseAnd(255, (int) var2[var4_int])];
        }
        if (param0 != 69) {
          return (Sprite) null;
        }
        Sprite var4 = new Sprite(ika.field_a, OpenGlRenderbuffer.field_s, LoadLevelCommand.field_p[0], TermsLinksPanel.field_C[0], mq.field_b[0], ImageProducerCanvasImageBuffer.field_m[0], var3);
        MazeGenerator.releaseStatics((byte) 113);
        return var4;
    }

    public static void releaseStatics(byte param0) {
        field_E = null;
        if (param0 > -117) {
          DropdownPopupList.buildFirstDecodedSprite((byte) 41);
        }
    }

    final int measureListHeight(int param0) {
        if (param0 != 23112) {
          this.field_I[10] = this.field_I[0];
        }
        return null != this.field_I ? this.field_K * (1 + this.field_I.length * 2) >> 1 : 200;
    }

    private final void setItems(Object[] param0, int param1, int param2) {
        this.field_H = -1;
        if (param1 != 0) {
          return;
        }
        try {
          this.field_I = param0;
          this.field_G = param2;
          if (param0 != null &&
            (this.field_G < -1 || this.field_G >= this.field_I.length)) {
            throw new IllegalStateException();
          }
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "je.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void activate(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        super.activate(param0, param1, param2, -109);
        if (param3 > -40) {
          this.field_I[3] = this.field_I[1];
        }
        param0 = param0 - this.field_n;
        param2 = param2 - this.field_i;
        if (this.field_I != null) {
          var5 = param0 / this.field_K;
          if (var5 >= 0 &&
            var5 < this.field_I.length) {
            this.field_G = var5;
            this.field_J.notifySelectionChanged(99);
          }
        }
    }

    DropdownPopupList(DropdownList param0, BitmapFont param1, Object[] param2, int param3) {
        super(param0);
        try {
          this.field_F = param1;
          this.field_J = param0;
          this.field_K = this.field_F.field_w + this.field_F.field_k;
          this.setItems(param2, 0, param3);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "je.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
    }
}
