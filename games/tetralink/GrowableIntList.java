/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GrowableIntList {
    private int[] field_d;
    static LabelPairWidget field_c;
    private boolean field_f;
    static String field_h;
    private int field_j;
    private int field_e;
    static String field_i;
    static int field_a;
    static String field_g;
    static String field_b;

    private final void growToIndex(boolean param0, int param1) {
        int[] var4 = null;
        int[] var3 = null;
        int[] var4Lifetime1;
        int[] var3Lifetime1;
        if (param0) {
          var4 = new int[this.nextCapacity(0, param1)];
          var3 = var4;
          ArraySupport.copy(this.field_d, 0, var4, 0, this.field_d.length);
          this.field_d = var4;
          return;
        }
        this.field_j = 31;
        var4Lifetime1 = new int[this.nextCapacity(0, param1)];
        var3Lifetime1 = var4Lifetime1;
        ArraySupport.copy(this.field_d, 0, var4Lifetime1, 0, this.field_d.length);
        this.field_d = var4Lifetime1;
    }

    public static void releaseStatics(byte param0) {
        field_i = null;
        field_c = null;
        if (param0 >= 32) {
          field_h = null;
          field_b = null;
          field_g = null;
          return;
        }
        GrowableIntList.releaseStatics((byte) -56);
        field_h = null;
        field_b = null;
        field_g = null;
    }

    final void removeAt(int param0, int param1) {
        if (param0 != 0) {
          this.growToIndex(false, 25);
          if (param1 < 0) {
            throw new ArrayIndexOutOfBoundsException(param1);
          }
          if (param1 > this.field_j) {
            throw new ArrayIndexOutOfBoundsException(param1);
          }
          if (this.field_j != param1) {
            ArraySupport.copy(this.field_d, param1 + 1, this.field_d, param1, this.field_j - param1);
            this.field_j = this.field_j - 1;
            return;
          }
          this.field_j = this.field_j - 1;
          return;
        }
        if (param1 < 0) {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
        if (param1 > this.field_j) {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
        if (this.field_j == param1) {
          this.field_j = this.field_j - 1;
          return;
        }
        ArraySupport.copy(this.field_d, param1 + 1, this.field_d, param1, this.field_j - param1);
        this.field_j = this.field_j - 1;
    }

    final int get(int param0, byte param1) {
        if (this.field_j < param0) {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
        if (param1 == 11) {
          return this.field_d[param0];
        }
        GrowableIntList.drawLobbyScreen(true, 17);
        return this.field_d[param0];
    }

    private GrowableIntList() throws Throwable {
        throw new Error();
    }

    final void add(byte param0, int param1) {
        if (param0 > 79) {
          this.set(false, param1, this.field_j + 1);
          return;
        }
        this.get(-79, (byte) 90);
        this.set(false, param1, this.field_j + 1);
    }

    final static void drawLobbyScreen(boolean param0, int param1) {
        UiComponent stackIn_7_0 = null;
        boolean stackIn_8_1 = false;
        UiComponent stackIn_11_0 = null;
        boolean stackIn_12_1 = false;
        UiComponent stackIn_20_0 = null;
        boolean stackIn_21_1 = false;
        UiComponent stackIn_24_0 = null;
        boolean stackIn_25_1 = false;
        UiComponent stackIn_33_0 = null;
        boolean stackIn_34_1 = false;
        UiComponent stackIn_37_0 = null;
        boolean stackIn_38_1 = false;
        UiComponent stackIn_47_0 = null;
        boolean stackIn_48_1 = false;
        UiComponent stackIn_51_0 = null;
        boolean stackIn_52_1 = false;
        UiComponent stackIn_61_0 = null;
        boolean stackIn_62_1 = false;
        UiComponent stackIn_65_0 = null;
        boolean stackIn_66_1 = false;
        FullscreenFocusCanvas.pushRasterAndIntersectClip(640 + SoftwareRasterizer.field_f >> 1, SoftwareRasterizer.field_e, 0, (byte) -79, -640 + SoftwareRasterizer.field_f >> 1);
        if (DialWidget.field_ab <= 0) {
          if (MusicPatch.field_t > param1) {
            if (EmailAvailabilityValidator.field_r != null) {
              EmailAvailabilityValidator.field_r.drawOpaque(LoginPanel.field_P.field_M, 0);
            }
            stackIn_47_0 = LoginPanel.field_P;
            stackIn_48_1 = (param0) && (!StripedProgressBar.field_S);
            ((UiComponent) (Object) stackIn_47_0).drawFullScreen(stackIn_48_1, 256);
            stackIn_51_0 = HotspotTextWidget.field_V;
            stackIn_52_1 = (param0) && (!StripedProgressBar.field_S);
            ((UiComponent) (Object) stackIn_51_0).drawFullScreen(stackIn_52_1, param1 + 256);
          } else {
            if (MiscTextGlobals.field_f > 0) {
              if (EmailAvailabilityValidator.field_r != null) {
                EmailAvailabilityValidator.field_r.drawOpaque(LoginPanel.field_P.field_M, 0);
              }
              stackIn_61_0 = LoginPanel.field_P;
              stackIn_62_1 = (param0) && (!StripedProgressBar.field_S);
              ((UiComponent) (Object) stackIn_61_0).drawFullScreen(stackIn_62_1, 256);
              stackIn_65_0 = HotspotTextWidget.field_V;
              stackIn_66_1 = (param0) && (!StripedProgressBar.field_S);
              ((UiComponent) (Object) stackIn_65_0).drawFullScreen(stackIn_66_1, param1 + 256);
            }
          }
        } else {
          if (null != EmailAvailabilityValidator.field_r) {
            EmailAvailabilityValidator.field_r.drawOpaque(DateInputWidget.field_P.field_M, 0);
          }
          stackIn_7_0 = DateInputWidget.field_P;
          stackIn_8_1 = (param0) && (!LoginCredentials.field_b);
          ((UiComponent) (Object) stackIn_7_0).drawFullScreen(stackIn_8_1, 256);
          stackIn_11_0 = GameKeyHandler.field_c;
          stackIn_12_1 = (param0) && (!LoginCredentials.field_b);
          ((UiComponent) (Object) stackIn_11_0).drawFullScreen(stackIn_12_1, 256);
          if (MusicPatch.field_t > param1) {
            if (EmailAvailabilityValidator.field_r != null) {
              EmailAvailabilityValidator.field_r.drawOpaque(LoginPanel.field_P.field_M, 0);
            }
            stackIn_33_0 = LoginPanel.field_P;
            stackIn_34_1 = (param0) && (!StripedProgressBar.field_S);
            ((UiComponent) (Object) stackIn_33_0).drawFullScreen(stackIn_34_1, 256);
            stackIn_37_0 = HotspotTextWidget.field_V;
            stackIn_38_1 = (param0) && (!StripedProgressBar.field_S);
            ((UiComponent) (Object) stackIn_37_0).drawFullScreen(stackIn_38_1, param1 + 256);
          } else {
            if (MiscTextGlobals.field_f > 0) {
              if (EmailAvailabilityValidator.field_r != null) {
                EmailAvailabilityValidator.field_r.drawOpaque(LoginPanel.field_P.field_M, 0);
              }
              stackIn_20_0 = LoginPanel.field_P;
              stackIn_21_1 = (param0) && (!StripedProgressBar.field_S);
              ((UiComponent) (Object) stackIn_20_0).drawFullScreen(stackIn_21_1, 256);
              stackIn_24_0 = HotspotTextWidget.field_V;
              stackIn_25_1 = (param0) && (!StripedProgressBar.field_S);
              ((UiComponent) (Object) stackIn_24_0).drawFullScreen(stackIn_25_1, param1 + 256);
            }
          }
        }
        LruTextureCache.popRaster(-581);
    }

    private final int nextCapacity(int param0, int param1) {
        int var3;
        int var4;
        var4 = TetraLink.field_J;
        var3 = this.field_d.length;
        while (var3 <= param1) {
          if (!this.field_f) {
            var3 = var3 + this.field_e;
            continue;
          }
          if (0 != var3) {
            var3 = var3 * this.field_e;
            continue;
          }
          var3 = 1;
        }
        if (param0 == 0) {
          return var3;
        }
        GrowableIntList.releaseStatics((byte) -117);
        return var3;
    }

    final int size(boolean param0) {
        if (param0) {
          GrowableIntList.releaseStatics((byte) -40);
          return 1 + this.field_j;
        }
        return 1 + this.field_j;
    }

    private final void set(boolean param0, int param1, int param2) {
        if (param2 > this.field_j) {
          this.field_j = param2;
          if (this.field_d.length > param2) {
            this.field_d[param2] = param1;
            if (!param0) {
              return;
            }
            this.get(26, (byte) 120);
            return;
          }
          this.growToIndex(true, param2);
          this.field_d[param2] = param1;
          if (param0) {
            this.get(26, (byte) 120);
            return;
          }
          return;
        }
        if (this.field_d.length <= param2) {
          this.growToIndex(true, param2);
          this.field_d[param2] = param1;
          if (!param0) {
            return;
          }
          this.get(26, (byte) 120);
          return;
        }
        this.field_d[param2] = param1;
        if (!param0) {
          return;
        }
        this.get(26, (byte) 120);
    }

    static {
        field_i = "<%0> might change the options - wait and see.";
        field_g = "Toggle fullscreen mode";
        field_b = "To <%0>: ";
    }
}
