/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ViewportController {
    private int field_n;
    static String field_k;
    private int field_x;
    static dq field_h;
    private int field_g;
    static long field_a;
    private int field_l;
    private int field_v;
    private int field_o;
    private boolean field_c;
    private int field_f;
    private int field_i;
    private o field_s;
    private int field_p;
    private int field_j;
    private int field_m;
    static String field_u;
    private int field_b;
    private int field_q;
    static String field_d;
    private int field_t;
    private int field_r;
    private float field_w;
    static String field_e;

    final boolean canResize(byte param0) {
        int var2 = -88 / ((param0 + 5) / 36);
        if (ri.field_h < this.field_j) {
          return false;
        }
        if (0 < BufferedRandomAccessFile.field_j) {
          return true;
        }
        return false;
    }

    final void setRequestedSize(int param0, int param1, int param2) {
        this.field_n = param0;
        this.field_f = param2;
        if (param1 != 13756) {
          this.field_b = -1;
        }
    }

    private final void applyClampedSize(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime1Lifetime1;
        var6 = Pixelate.field_H ? 1 : 0;
        var2 = 110 / ((-76 - param0) / 34);
        var3 = this.field_n;
        var4 = this.field_f;
        if (!this.canResize((byte) 99)) {
          this.field_c = false;
          return;
        }
        boolean decompiledFrameRemainder2 = true;
        if (this.field_g < var3) {
          var3 = this.field_g;
        } else {
          if (var3 >= this.field_r) {
            boolean decompiledFrameRemainder1 = true;
            if (this.field_t < var4) {
              var4 = this.field_t;
            } else {
              if (var4 < this.field_v) {
                var4 = this.field_v;
                if (0.0f < this.field_w) {
                  var5 = (int)(this.field_w * (float)var4 + 0.5f);
                  if (var3 >= var5) {
                    if (var3 > var5) {
                      var3 = var5;
                    }
                  } else {
                    var4 = (int)((float)var3 / this.field_w);
                  }
                }
                decompiledFrameRemainder1 = false;
              }
            }
            if ((decompiledFrameRemainder1) &&
              (0.0f < this.field_w)) {
              var5Lifetime2 = (int)(this.field_w * (float)var4 + 0.5f);
              if (var3 < var5Lifetime2) {
                var4 = (int)((float)var3 / this.field_w);
              } else {
                if (var3 > var5Lifetime2) {
                  var3 = var5Lifetime2;
                }
              }
            }
            decompiledFrameRemainder2 = false;
          }
          else {
            var3 = this.field_r;
          }
        }
        if (decompiledFrameRemainder2) {
          boolean decompiledFrameRemainder0 = true;
          if (this.field_t < var4) {
            var4 = this.field_t;
          } else {
            if (var4 < this.field_v) {
              var4 = this.field_v;
              if (0.0f < this.field_w) {
                var5Lifetime1 = (int)(this.field_w * (float)var4 + 0.5f);
                if (var3 >= var5Lifetime1) {
                  if (var3 > var5Lifetime1) {
                    var3 = var5Lifetime1;
                  }
                } else {
                  var4 = (int)((float)var3 / this.field_w);
                }
              }
              decompiledFrameRemainder0 = false;
            }
          }
          if ((decompiledFrameRemainder0) &&
            (0.0f < this.field_w)) {
            var5Lifetime1Lifetime1 = (int)(this.field_w * (float)var4 + 0.5f);
            if (var3 < var5Lifetime1Lifetime1) {
              var4 = (int)((float)var3 / this.field_w);
            } else {
              if (var3 > var5Lifetime1Lifetime1) {
                var3 = var5Lifetime1Lifetime1;
              }
            }
          }
        }
        if (BufferedRandomAccessFile.field_i != var3) {
          this.field_s.resizeView(var3, 127, var4);
        } else {
          if (var4 != wp.field_c) {
            this.field_s.resizeView(var3, 127, var4);
          }
        }
        if (this.field_n > 0) {
          Vector3.field_a = (this.field_n - BufferedRandomAccessFile.field_i) / 2;
        }
    }

    final FullscreenFocusCanvas enterFullscreen(boolean param0) {
        this.field_b = BufferedRandomAccessFile.field_i;
        this.field_l = wp.field_c;
        this.field_s.resizeView(this.field_q, 126, this.field_x);
        FireworkSpark.field_i = param0 ? true : false;
        FullscreenFocusCanvas var2 = wo.openFullscreenWindow(mc.field_k, 150, this.field_x, 0, this.field_q, 0);
        if (var2 == null) {
          this.restoreSavedSize(89);
        }
        return var2;
    }

    final void restoreSavedSize(int param0) {
        this.field_s.resizeView(this.field_b, 127, this.field_l);
        int var2 = 99 % ((param0 + 17) / 62);
    }

    public static void releaseStatics(boolean param0) {
        field_d = null;
        field_k = null;
        field_e = null;
        if (param0) {
          field_u = null;
          field_h = null;
          return;
        }
        field_e = (String) null;
        field_u = null;
        field_h = null;
    }

    final void tick(int param0) {
        int fieldTemp$0 = 0;
        int var2;
        if (ib.field_f != null) {
          return;
        }
        if (BufferedRandomAccessFile.field_j <= 0) {
          this.field_c = false;
        }
        if (this.field_c) {
          fieldTemp$0 = this.field_m - 1;
          this.field_m = this.field_m - 1;
          if (fieldTemp$0 > 0) {
            return;
          }
          this.field_m = this.field_o;
          if (ri.field_h < this.field_j) {
            this.field_c = false;
            return;
          }
          this.applyClampedSize(-117);
          var2 = -110 / ((-61 - param0) / 38);
          return;
        }
        if (BufferedRandomAccessFile.field_i < this.field_n) {
          Vector3.field_a = (this.field_n - BufferedRandomAccessFile.field_i) / 2;
        } else {
          if (this.field_n > 0) {
            Vector3.field_a = 0;
          }
        }
        if (BufferedRandomAccessFile.field_i == this.field_i &&
          this.field_p == wp.field_c) {
          return;
        }
        this.field_s.resizeView(this.field_i, 127, this.field_p);
    }

    private ViewportController() throws Throwable {
        throw new Error();
    }

    static {
        field_k = "Your ignore list is full. Max of 100 hit.";
        field_u = "Owner";
        field_d = "Achieved";
        field_h = new dq();
        field_e = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
    }
}
