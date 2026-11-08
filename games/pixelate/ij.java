/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij extends MenuScreen {
    static bd field_o;
    static String field_q;
    static String field_r;
    static String field_t;
    static String field_p;
    static int field_s;

    ij(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final static void a(int param0, String param1) {
        int stackIn_20_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = Pixelate.field_H ? 1 : 0;
        try {
          if (param0 != -5516) {
            field_r = (String) null;
          }
          if (DisplayNameForm.field_L == -1 &&
            -1 == Checkbox.field_Q) {
            DisplayNameForm.field_L = ProxyAuthenticationException.field_d;
            Checkbox.field_Q = StatusBar.field_k;
          }
          boolean decompiledFrameRemainder0 = true;
          CachedTextLayout.field_h = CachedTextLayout.field_h + 1;
          if (param1 != null) {
            decompiledFrameRemainder0 = !(param1.equals(qg.field_b));
          } else {
            decompiledFrameRemainder0 = (qg.field_b == null);
          }
          if (decompiledFrameRemainder0) {
            if (!LoadingStepTracker.field_h) {
              if (CachedTextLayout.field_h >= Js5ArchiveManager.field_c) {
                stackIn_20_0 = (CipherPacketBuffer.field_s + Js5ArchiveManager.field_c > CachedTextLayout.field_h) ? 1 : 0;
              } else {
                stackIn_20_0 = 0;
              }
            } else {
              stackIn_20_0 = 0;
            }
            var2_int = stackIn_20_0;
            if (param1 == null) {
              CachedTextLayout.field_h = 0;
            } else {
              if (LoadingStepTracker.field_h) {
                CachedTextLayout.field_h = Js5ArchiveManager.field_c;
              } else {
                if (var2_int == 0) {
                  CachedTextLayout.field_h = 0;
                } else {
                  CachedTextLayout.field_h = Js5ArchiveManager.field_c;
                }
              }
            }
            oo.field_f = Checkbox.field_Q;
            MarkerSlider.field_V = DisplayNameForm.field_L;
            if (param1 != null) {
              LoadingStepTracker.field_h = false;
            } else {
              if (var2_int != 0) {
                LoadingStepTracker.field_h = true;
              }
            }
          }
          qg.field_b = param1;
          if (!LoadingStepTracker.field_h &&
            CachedTextLayout.field_h < Js5ArchiveManager.field_c &&
            SocialListEntry.field_Jb) {
            MarkerSlider.field_V = DisplayNameForm.field_L;
            oo.field_f = Checkbox.field_Q;
            CachedTextLayout.field_h = 0;
          }
          Checkbox.field_Q = -1;
          DisplayNameForm.field_L = -1;
          if (LoadingStepTracker.field_h &&
            CachedTextLayout.field_h == ContextActionMenu.field_Fb) {
            LoadingStepTracker.field_h = false;
            CachedTextLayout.field_h = 0;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_44_0 = var2;
          stackIn_44_1 = new StringBuilder().append("ij.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(')').toString());
        }
    }

    final void drawScreenBackground(int param0) {
        if (param0 != 0) {
          return;
        }
        SoftwareRasterizer.clear();
    }

    final void onCancel(byte param0) {
        if (param0 >= -13) {
          this.onCancel((byte) -53);
        }
    }

    public static void releaseStatics(int param0) {
        field_o = null;
        field_r = null;
        field_q = null;
        field_p = null;
        field_t = null;
        int var1 = 8 / ((-77 - param0) / 47);
    }

    final void draw(int param0) {
        if (param0 != 11) {
          field_t = (String) null;
        }
    }

    static {
        field_q = "Name";
        field_o = new bd();
        field_t = "Yes";
        field_r = "Day";
        field_p = "Please try changing the following settings:  ";
        field_s = 0;
    }
}
