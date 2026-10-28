/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ViewportController {
    private int field_c;
    private int field_i;
    private int field_j;
    private int field_n;
    private int field_e;
    static BoundedUrlRequest field_m;
    private int field_g;
    private int field_o;
    private int field_d;
    private int field_s;
    private int field_q;
    private boolean field_a;
    private int field_h;
    private int field_f;
    private int field_r;
    private int field_b;
    private ViewportResizeListener field_l;
    private int field_p;
    private float field_k;

    public static void releaseStatics(boolean guard) {
        if (guard) {
          return;
        }
        field_m = null;
    }

    final void restoreWindowedSize(int guard) {
        if (guard != 0) {
          return;
        }
        this.field_l.onResize(true, this.field_r, this.field_p);
    }

    final FullscreenFocusCanvas enterFullscreen(boolean windowed) {
        this.field_p = pd.field_b;
        if (!windowed) {
          this.updateViewport(12);
          this.field_r = BoundedUrlRequest.field_d;
          this.field_l.onResize(windowed, this.field_o, this.field_j);
          PacketBuffer.field_i = false;
          FullscreenFocusCanvas var2 = al.a(this.field_j, -16493, NetworkGameClient.field_r, this.field_o, 0, 0);
          if (var2 == null) {
            this.restoreWindowedSize(0);
            return var2;
          }
          return var2;
        }
        this.field_r = BoundedUrlRequest.field_d;
        this.field_l.onResize(windowed, this.field_o, this.field_j);
        PacketBuffer.field_i = false;
        FullscreenFocusCanvas var2Lifetime1 = al.a(this.field_j, -16493, NetworkGameClient.field_r, this.field_o, 0, 0);
        if (var2Lifetime1 != null) {
          return var2Lifetime1;
        }
        this.restoreWindowedSize(0);
        return var2Lifetime1;
    }

    final boolean c(int param0) {
        int var2 = 71 / ((-20 - param0) / 62);
        if (this.field_s > ok.field_c) {
          return false;
        }
        if (Js5NetworkRequest.field_x > 0) {
          return true;
        }
        return false;
    }

    private final void a(byte param0) {
        int var5 = EscapeVector.obfuscationControl;
        int var2 = this.field_h;
        int var3 = this.field_n;
        if (!this.c(-109)) {
          this.field_a = false;
          return;
        }
        boolean decompiledFrameRemainder2 = true;
        if (this.field_c < var3) {
          var3 = this.field_c;
        } else if (this.field_g <= var3) {
          boolean decompiledFrameRemainder1 = true;
          if (this.field_e < var2) {
            var2 = this.field_e;
          } else if (this.field_f > var2) {
            var2 = this.field_f;
            if (0.0f < this.field_k) {
              int var4 = (int)(0.5f + (float)var3 * this.field_k);
              if (var2 < var4) {
                var3 = (int)((float)var2 / this.field_k);
              } else if (var4 < var2) {
                var2 = var4;
              }
            }
            decompiledFrameRemainder1 = false;
          }
          if (decompiledFrameRemainder1 &&
            0.0f < this.field_k) {
            int var4Lifetime2 = (int)(0.5f + (float)var3 * this.field_k);
            if (var2 < var4Lifetime2) {
              var3 = (int)((float)var2 / this.field_k);
            } else if (var4Lifetime2 < var2) {
              var2 = var4Lifetime2;
            }
          }
          decompiledFrameRemainder2 = false;
        } else {
          var3 = this.field_g;
        }
        if (decompiledFrameRemainder2) {
          boolean decompiledFrameRemainder0 = true;
          if (this.field_e < var2) {
            var2 = this.field_e;
          } else if (this.field_f > var2) {
            var2 = this.field_f;
            if (0.0f < this.field_k) {
              int var4Lifetime1 = (int)(0.5f + (float)var3 * this.field_k);
              if (var2 < var4Lifetime1) {
                var3 = (int)((float)var2 / this.field_k);
              } else if (var4Lifetime1 < var2) {
                var2 = var4Lifetime1;
              }
            }
            decompiledFrameRemainder0 = false;
          }
          if (decompiledFrameRemainder0 &&
            0.0f < this.field_k) {
            int var4Lifetime1Lifetime1 = (int)(0.5f + (float)var3 * this.field_k);
            if (var2 < var4Lifetime1Lifetime1) {
              var3 = (int)((float)var2 / this.field_k);
            } else if (var4Lifetime1Lifetime1 < var2) {
              var2 = var4Lifetime1Lifetime1;
            }
          }
        }
        if (pd.field_b != var2) {
          this.field_l.onResize(true, var3, var2);
        } else if (var3 != BoundedUrlRequest.field_d) {
          this.field_l.onResize(true, var3, var2);
        }
        if (param0 != 13) {
          return;
        }
        if (this.field_h > 0) {
          pb.field_b = (this.field_h - pd.field_b) / 2;
        }
    }

    final void updateViewport(int guard) {
        if (null != IsaacRandom.field_d) {
          return;
        }
        if (Js5NetworkRequest.field_x <= 0) {
          this.field_a = false;
        }
        if (!this.field_a) {
          if (pd.field_b < this.field_h) {
            pb.field_b = (-pd.field_b + this.field_h) / 2;
          } else if (0 < this.field_h) {
            pb.field_b = 0;
          }
          if (this.field_q == pd.field_b &&
            this.field_i == BoundedUrlRequest.field_d) {
            return;
          }
          this.field_l.onResize(true, this.field_i, this.field_q);
          return;
        }
        if (guard != 9477) {
          return;
        }
        int fieldTemp$0 = this.field_d - 1;
        this.field_d = this.field_d - 1;
        if (fieldTemp$0 > 0) {
          return;
        }
        this.field_d = this.field_b;
        if (ok.field_c < this.field_s) {
          this.field_a = false;
        } else {
          this.a((byte) 13);
        }
        return;
    }

    final void setDesiredSize(int width, int height, int guard) {
        this.field_n = width;
        if (guard != 18705) {
          return;
        }
        this.field_h = height;
    }

    private ViewportController() throws Throwable {
        throw new Error();
    }

    static {
    }
}
