/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CanvasResizePolicy {
    private boolean field_l;
    private int field_m;
    static int[] field_q;
    private int field_i;
    private int field_h;
    private int field_e;
    private int field_o;
    static Sprite field_r;
    static String field_t;
    private int field_p;
    private CanvasResizeListener resizeListener;
    private int field_k;
    private int field_c;
    private int field_u;
    private int field_v;
    private int field_s;
    private int field_b;
    private int field_d;
    private int field_a;
    private float field_n;
    static ResourceArchive field_g;
    private int field_f;

    final boolean canAutoResize(int param0) {
        if (param0 != 0) {
          this.field_h = 72;
          if (this.field_e > IntrusiveDequeCursor.field_d) {
            return false;
          }
          if (0 < WeightedLruCache.field_d) {
            return true;
          }
          return false;
        }
        if (this.field_e > IntrusiveDequeCursor.field_d) {
          return false;
        }
        if (0 < WeightedLruCache.field_d) {
          return true;
        }
        return false;
    }

    final static Sprite[] centerOnlyPanelSlices(byte param0, Sprite param1) {
        Sprite[] var2 = null;
        RuntimeException var2_ref = null;
        Sprite[] var3 = null;
        Sprite[] stackIn_2_0 = null;
        Sprite[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new Sprite[9];
          var2 = var3;
          var3[4] = param1;
          if (param0 < -82) {
            stackIn_4_0 = var2;
            return stackIn_4_0;
          }
          stackIn_2_0 = (Sprite[]) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_7_0 = var2_ref;
          stackIn_7_1 = new StringBuilder().append("kh.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void a(int param0, AnimationPlayer param1, int param2, boolean param3, int param4) {
        AnimationPlayer stackIn_2_0;
        ModelMesh stackIn_2_1;
        boolean stackIn_2_2;
        boolean stackIn_2_3;
        boolean stackIn_3_4 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        ModelMesh var7 = null;
        try {
          stackIn_2_0 = (AnimationPlayer) (param1);
          stackIn_2_1 = WriteIntegersCommand.field_B[param0];
          stackIn_2_2 = param3;
          stackIn_2_3 = true;
          stackIn_3_4 = !(param3);
          var7 = (ModelMesh) (((AnimationPlayer) (Object) stackIn_2_0).applyCurrentFrame(stackIn_2_1, stackIn_2_2, stackIn_2_3, stackIn_3_4));
          PacketBuffer.a(102, BuyPitchDialog.field_F);
          SoftwareRasterizer.clearFramebuffer();
          TriangleRasterizer.useRasterClip();
          if (FormationAgent.field_l == 3) {
            var6 = 256 + param2;
            if (var6 >= 2048) {
              var6 -= 2048;
            }
            var7.b(var6);
            var7.a(0, 0, 256, 0, 0, 0, 0, param4);
            var7.f();
            var7.a(0, 0, 768, 0, 0, 0, 0, param4);
            var7.f();
            var7.a(0, 0, 1280, 0, 0, 0, 0, param4);
            var7.f();
            var7.a(0, 0, 1792, 0, 0, 0, 0, param4);
          } else {
            if (2 == FormationAgent.field_l) {
              var6 = param2 + 1280;
              if (var6 >= 2048) {
                var6 -= 2048;
              }
              var7.b(var6);
              var7.a(0, 0, 1280, 0, 0, 0, 0, param4);
            }
          }
          TeamManagementScreen.e(124);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("kh.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final FullscreenFocusCanvas enterFullscreen(int param0) {
        this.field_v = f.field_d;
        this.field_f = ReceivedAuctionItem.field_B;
        this.resizeListener.resizeCanvas(111, this.field_u, this.field_b);
        SquadGridWidget.field_Ib = false;
        FullscreenFocusCanvas var2 = gf.a(oo.field_c, 0, this.field_b, 0, this.field_u, 0);
        if (param0 != 30182) {
          this.updateCanvasSize(119);
          if (var2 == null) {
            this.restoreSavedSize(0);
            return var2;
          }
          return var2;
        }
        if (var2 != null) {
          return var2;
        }
        this.restoreSavedSize(0);
        return var2;
    }

    public static void releaseStatics(int param0) {
        field_q = null;
        field_g = null;
        field_t = null;
        if (param0 == -1706) {
          field_r = null;
          return;
        }
        Sprite var2 = (Sprite) null;
        CanvasResizePolicy.centerOnlyPanelSlices((byte) -104, (Sprite) null);
        field_r = null;
    }

    final void updateCanvasSize(int param0) {
        int fieldTemp$0 = 0;
        if (SplashScreen.field_m != null) {
          return;
        }
        if (WeightedLruCache.field_d <= param0) {
          this.field_l = false;
        }
        if (this.field_l) {
          fieldTemp$0 = this.field_p - 1;
          this.field_p = this.field_p - 1;
          if (0 < fieldTemp$0) {
            return;
          }
          this.field_p = this.field_i;
          if (this.field_e > IntrusiveDequeCursor.field_d) {
            this.field_l = false;
          } else {
            this.applySizeConstraints((byte) -113);
          }
          return;
        }
        if (this.field_o > f.field_d) {
          BytePlusOneCommand.field_H = (this.field_o - f.field_d) / 2;
        } else {
          if (0 < this.field_o) {
            BytePlusOneCommand.field_H = 0;
          }
        }
        if (f.field_d == this.field_d &&
          this.field_a == ReceivedAuctionItem.field_B) {
          return;
        }
        this.resizeListener.resizeCanvas(127, this.field_d, this.field_a);
    }

    final void setAvailableSize(int param0, int param1, int param2) {
        this.field_k = param2;
        this.field_o = param1;
        if (param0 != 768) {
          this.setAvailableSize(-114, -58, -48);
        }
    }

    private final void applySizeConstraints(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = Kickabout.field_G;
        var2 = this.field_o;
        var3 = this.field_k;
        if (param0 > -112) {
          return;
        }
        if (!this.canAutoResize(0)) {
          this.field_l = false;
          return;
        }
        if (this.field_m < var2) {
          var2 = this.field_m;
          if (this.field_c >= var3) {
            if (this.field_s > var3) {
              var3 = this.field_s;
            }
          } else {
            var3 = this.field_c;
          }
          if (this.field_n > 0.0f) {
            var4 = (int)((float)var3 * this.field_n + 0.5f);
            if (var4 <= var2) {
              if (var2 > var4) {
                var2 = var4;
              }
            } else {
              var3 = (int)((float)var2 / this.field_n);
            }
          }
        } else {
          if (var2 < this.field_h) {
            var2 = this.field_h;
          }
          if (this.field_c < var3) {
            var3 = this.field_c;
            if (this.field_n > 0.0f) {
              var4 = (int)((float)var3 * this.field_n + 0.5f);
              if (var4 > var2) {
                var3 = (int)((float)var2 / this.field_n);
              } else {
                if (var2 > var4) {
                  var2 = var4;
                }
              }
            }
          } else {
            if (this.field_s > var3) {
              var3 = this.field_s;
            }
            if (this.field_n > 0.0f) {
              var4 = (int)((float)var3 * this.field_n + 0.5f);
              if (var4 > var2) {
                var3 = (int)((float)var2 / this.field_n);
                if (f.field_d != var2) {
                  this.resizeListener.resizeCanvas(101, var2, var3);
                } else {
                  if (ReceivedAuctionItem.field_B != var3) {
                    this.resizeListener.resizeCanvas(101, var2, var3);
                  }
                }
                if (this.field_o > 0) {
                  BytePlusOneCommand.field_H = (this.field_o - f.field_d) / 2;
                }
                return;
              }
              if (var2 > var4) {
                var2 = var4;
              }
            }
          }
        }
        if (f.field_d != var2) {
          this.resizeListener.resizeCanvas(101, var2, var3);
        } else {
          if (ReceivedAuctionItem.field_B != var3) {
            this.resizeListener.resizeCanvas(101, var2, var3);
          }
        }
        if (this.field_o > 0) {
          BytePlusOneCommand.field_H = (this.field_o - f.field_d) / 2;
        }
    }

    final void restoreSavedSize(int param0) {
        this.resizeListener.resizeCanvas(param0 ^ 118, this.field_v, this.field_f);
        if (param0 != 0) {
          this.field_c = -63;
        }
    }

    private CanvasResizePolicy() throws Throwable {
        throw new Error();
    }

    static {
        field_t = "Unable to delete friend - system busy";
        field_q = new int[]{0, 1200, 2300, 3300, 4000, 4300, 4400, 4300, 4100, 3940, 3900, 3980, 4096};
    }
}
