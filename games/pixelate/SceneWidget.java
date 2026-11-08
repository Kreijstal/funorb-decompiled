/*
 * Decompiled by CFR-JS 0.4.0.
 */
class SceneWidget extends SceneWidgetNode {
    int field_O;
    private int field_jb;
    private int field_Y;
    int field_hb;
    boolean field_rb;
    private boolean field_lb;
    Sprite field_ob;
    int field_Q;
    private int pendingWidthDelta;
    private int field_Ab;
    int pendingHeightDelta;
    int field_tb;
    int field_N;
    Sprite field_xb;
    int pendingYDelta;
    int field_ub;
    int field_V;
    private int field_w;
    String field_qb;
    int heldPressButton;
    static SceneWidget field_E;
    boolean field_U;
    int screenY;
    static SceneWidget field_T;
    Sprite[] field_eb;
    int field_K;
    Sprite field_B;
    boolean field_A;
    int horizontalAlignment;
    Sprite field_z;
    Sprite[] field_zb;
    boolean field_R;
    Sprite[] field_ab;
    String field_cb;
    boolean field_vb;
    int verticalAlignment;
    int field_y;
    int field_mb;
    BitmapFont font;
    IntrusiveDeque children;
    static int[] field_db;
    private int field_I;
    Sprite field_H;
    private boolean field_X;
    int field_Cb;
    int textOpacity;
    private boolean field_fb;
    boolean field_W;
    int field_C;
    int field_S;
    Sprite[] field_M;
    int selectedOffsetX;
    int field_pb;
    int field_D;
    private int field_x;
    Sprite[] field_bb;
    private int pendingXDelta;
    int field_P;
    int height;
    static int field_ib;

    final void addChild(SceneWidget param0, byte param1) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.children == null) {
            this.children = new IntrusiveDeque();
          }
          this.children.addLast(22125, param0);
          if (param1 != 26) {
            this.drawFullScreen(false, -2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ak.M(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final int measureContentWidth(byte param0, int param1) {
        int var3;
        int var4_int;
        SceneWidget var4;
        int var5;
        int var6;
        int var4_intLifetime1;
        var6 = Pixelate.field_H ? 1 : 0;
        if (param0 != 95) {
          return 37;
        }
        var3 = 0;
        if (null != this.field_cb &&
          null != this.font) {
          var4_int = this.font.getWrappedWidth(this.field_cb, param1);
          if (var4_int > var3) {
            var3 = var4_int;
          }
        }
        if (null != this.field_H) {
          var4_intLifetime1 = this.field_H.field_A;
          if (var4_intLifetime1 > var3) {
            var3 = var4_intLifetime1;
          }
        }
        if (null != this.children) {
          var4 = (SceneWidget) (this.children.first(1504642273));
          while (var4 != null) {
            var5 = var4.field_K + var4.field_D;
            if (var3 < var5) {
              var3 = var5;
            }
            var4 = (SceneWidget) (this.children.next(1504642273));
          }
        }
        return var3;
    }

    final void setBounds(int param0, int param1, int param2, int param3, int param4) {
        this.pendingXDelta = 0;
        this.field_D = param2;
        this.pendingWidthDelta = 0;
        this.field_K = param4;
        if (param3 == 256) {
          this.pendingYDelta = 0;
          this.height = param1;
          this.field_S = param0;
          this.pendingHeightDelta = 0;
          return;
        }
    }

    final void layoutVerticalContent(int param0, byte param1, boolean param2, int param3) {
        SceneWidget var10_ref_ak = null;
        int var9 = 0;
        int var11 = Pixelate.field_H ? 1 : 0;
        int var5 = -this.field_S;
        int var6 = var5 - this.pendingYDelta;
        int var7 = this.height;
        int var8 = var7 + this.pendingHeightDelta;
        int var9Lifetime1;
        if (!param2) {
          var9 = 0;
          var10_ref_ak = (SceneWidget) (this.children.first(1504642273));
          while (var10_ref_ak != null) {
            var10_ref_ak.pendingYDelta = -var10_ref_ak.field_S + var9;
            var9 = var9 + (var10_ref_ak.height - (-var10_ref_ak.pendingHeightDelta - param0));
            var10_ref_ak = (SceneWidget) (this.children.next(1504642273));
          }
          var8 = -param0 + var9;
        }
        var9Lifetime1 = -param3 + var8;
        if (var6 > var9Lifetime1) {
          var6 = var9Lifetime1;
        }
        if (param1 >= -127) {
          this.field_A = false;
        }
        if (var6 < 0) {
          var6 = 0;
        }
        int var10 = -param3 + var7;
        if (var10 < var5) {
          var5 = var10;
        }
        if (var5 < 0) {
          var5 = 0;
        }
        this.height = var7;
        this.pendingHeightDelta = var8 - var7;
        this.pendingYDelta = -var6 + var5;
        this.field_S = -var5;
    }

    final void updateInputFullScreen(int param0, boolean param1) {
        DiskCacheRequest.field_I = !param1 ? true : false;
        EmergentBehaviourBackground.field_q = !param1 ? true : false;
        if (param0 != -28476) {
          SceneWidget var4 = (SceneWidget) null;
          this.addChild((SceneWidget) null, (byte) 61);
        }
        this.updateInputTree(SoftwareRasterizer.field_j, 0, true, SoftwareRasterizer.field_d, 0, 59);
    }

    SceneWidget(long param0, SceneWidget param1, String param2) {
        this(param0, param1, 0, 0, 0, 0, param2);
    }

    final void drawFullScreen(boolean param0, int param1) {
        this.drawTree(false, 0, false, param0, SoftwareRasterizer.field_j, false, (byte) -50, param1, SoftwareRasterizer.field_d, false, true);
    }

    final void positionAfter(SceneWidget param0, int param1, int param2, SceneWidget param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param3 == null) {
            param0.field_S = 0;
            param0.pendingYDelta = 0;
          } else {
            param0.pendingYDelta = param3.pendingHeightDelta + param3.pendingYDelta;
            param0.field_S = param1 + (param3.height + param3.field_S);
          }
          if (param2 != -1) {
            this.field_Q = -9;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("ak.R(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private final void drawTree(boolean param0, int param1, boolean param2, boolean param3, int param4, boolean param5, byte param6, int param7, int param8, boolean param9, boolean param10) {
        boolean stackIn_5_0 = false;
        int var12;
        int var13;
        int var14;
        int var15;
        Sprite[] var16;
        Sprite var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23_int;
        String var23;
        SceneWidget var23_ref;
        int var24;
        int var25;
        String var26;
        String var23Lifetime1;
        String var23Lifetime2;
        var25 = Pixelate.field_H ? 1 : 0;
        this.screenY = this.field_S + param7;
        this.field_tb = param1 + this.field_D;
        var12 = SoftwareRasterizer.field_e;
        var13 = SoftwareRasterizer.field_f;
        var14 = SoftwareRasterizer.field_h;
        var15 = SoftwareRasterizer.field_a;
        SoftwareRasterizer.intersectClip(this.field_tb, this.screenY, this.field_K + this.field_tb, this.screenY + this.height);
        if (!this.field_fb) {
          param0 = this.field_U;
          stackIn_5_0 = (this.heldPressButton != 0);
          param5 = stackIn_5_0;
          param9 = this.field_W;
        }
        param10 = param10 & this.field_rb;
        var16 = this.field_zb;
        var17 = this.field_H;
        if (param6 != -50) {
          this.updateInputTree(87, -55, true, -68, -112, 15);
        }
        var18 = this.field_N;
        var19 = 0;
        var20 = 0;
        if (!param10) {
          if (0 <= this.field_O) {
            var18 = this.field_O;
          }
          if (null != this.field_xb) {
            var17 = this.field_xb;
          }
          if (null != this.field_M) {
            var16 = this.field_M;
          }
        }
        if (param9) {
          if (this.field_x != -2147483648) {
            var20 = this.field_x;
          }
          if (null != this.field_ab) {
            var16 = this.field_ab;
          }
          if (this.field_Y != -2147483648) {
            var19 = this.field_Y;
          }
          if (null != this.field_B) {
            var17 = this.field_B;
          }
          if (this.field_y >= 0) {
            var18 = this.field_y;
          }
        }
        if (param5) {
          if (null != this.field_ob) {
            var17 = this.field_ob;
          }
          if (this.field_pb >= 0) {
            var18 = this.field_pb;
          }
          if (this.field_bb != null) {
            var16 = this.field_bb;
          }
          if (this.field_V != -2147483648) {
            var20 = this.field_V;
          }
          if (this.field_Q != -2147483648) {
            var19 = this.field_Q;
          }
        }
        if (param0) {
          if (this.field_Cb >= 0) {
            var18 = this.field_Cb;
          }
          if (this.selectedOffsetX != -2147483648) {
            var20 = this.selectedOffsetX;
          }
          if (this.field_z != null) {
            var17 = this.field_z;
          }
          if (-2147483648 != this.field_hb) {
            var19 = this.field_hb;
          }
          if (null != this.field_eb) {
            var16 = this.field_eb;
          }
        }
        var21 = this.field_w + var19;
        var22 = var20 + this.field_I;
        if (!this.field_A) {
          NineSliceFrameHelpers.drawNineSliceFrame(this.field_K, this.field_tb, (byte) 75, this.height, this.screenY, var16);
        } else {
          NineSliceFrameHelpers.drawNineSliceFrame(param4, param1, (byte) 75, param8, param7, var16);
        }
        if (var17 != null) {
          var23_int = this.field_tb + var21;
          var24 = var22 + this.screenY;
          if (this.horizontalAlignment == 1) {
            var23_int = var23_int + (-var17.field_A + this.field_K) / 2;
          }
          if (2 == this.horizontalAlignment) {
            var23_int = var23_int + (-var17.field_A + this.field_K);
          }
          if (this.verticalAlignment == 1) {
            var24 = var24 + (-var17.field_B + this.height) / 2;
          }
          if (this.verticalAlignment == 2) {
            var24 = var24 + (this.height - var17.field_B);
          }
          if (this.field_jb >= 256) {
            var17.drawTransparent(var23_int, var24);
          } else {
            var17.drawAlpha(var23_int, var24, this.field_jb);
          }
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_cb != null &&
          this.font != null) {
          var26 = this.field_cb;
          var23 = var26;
          var23Lifetime1 = var26;
          var23Lifetime2 = var26;
          if (param3 &&
            null != this.field_qb) {
            var23Lifetime2 = var26 + this.field_qb;
          }
          if (this.font.textWidth(var23Lifetime2) <= this.field_K - 2 * this.field_C &&
            var23Lifetime2.indexOf("<br>") < 0) {
            if (this.verticalAlignment != 1) {
              if (this.verticalAlignment == 2) {
                var22 = var22 + (this.height - this.font.maxDescent - this.font.maxAscent);
              }
            } else {
              var22 = var22 + (-this.font.maxDescent + (-this.font.maxAscent + this.height)) / 2;
            }
            if (this.horizontalAlignment == 0) {
              this.font.drawLeftAlpha(var23Lifetime2, this.field_tb + (this.field_C + var21), this.font.maxAscent + this.screenY + var22, var18, -1, this.textOpacity);
            } else {
              if (this.horizontalAlignment == 1) {
                this.font.drawCenteredAlpha(var23Lifetime2, (-(2 * this.field_C) + this.field_K) / 2 + var21 + (this.field_tb + this.field_C), this.font.maxAscent + (this.screenY + var22), var18, -1, this.textOpacity);
              } else {
                if (2 != this.horizontalAlignment) {
                  this.font.drawParagraphAlpha(var23Lifetime2, this.field_C + this.field_tb + var21, this.screenY + var22, this.field_K - this.field_C * 2, this.height, var18, -1, this.textOpacity, this.horizontalAlignment, this.verticalAlignment, this.field_mb);
                } else {
                  this.font.drawRightAlpha(var23Lifetime2, this.field_K - (this.field_C * 2 - var21 - (this.field_tb + this.field_C)), this.screenY + (var22 + this.font.maxAscent), var18, -1, this.textOpacity);
                }
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            this.font.drawParagraphAlpha(var23Lifetime2, var21 + this.field_C + this.field_tb, var22 + this.screenY, -(this.field_C * 2) + this.field_K, this.height, var18, -1, this.textOpacity, this.horizontalAlignment, this.verticalAlignment, this.field_mb);
          }
        }
        if (this.children != null) {
          var23_ref = (SceneWidget) (this.children.first(param6 + 1504642323));
          while (var23_ref != null) {
            var23_ref.drawTree(param0, this.field_tb + var19, this.field_X, param3, this.field_K, param5, (byte) -50, var20 + this.screenY, this.height, param9, param10);
            var23_ref = (SceneWidget) (this.children.next(1504642273));
          }
        }
        SoftwareRasterizer.setClip(var12, var13, var14, var15);
    }

    private final void updateInputTree(int param0, int param1, boolean param2, int param3, int param4, int param5) {
        boolean stackIn_31_1 = false;
        boolean stackIn_39_1 = false;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        SceneWidget var14;
        int var15;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        var15 = Pixelate.field_H ? 1 : 0;
        if (this.pendingXDelta <= 0) {
          var7 = this.pendingXDelta >> 2;
        } else {
          var7 = -(-this.pendingXDelta >> 2);
        }
        this.pendingXDelta = this.pendingXDelta - var7;
        this.field_D = this.field_D + var7;
        if (this.pendingYDelta <= 0) {
          var7Lifetime1 = this.pendingYDelta >> 2;
        } else {
          var7Lifetime1 = -(-this.pendingYDelta >> 2);
        }
        this.field_S = this.field_S + var7Lifetime1;
        this.pendingYDelta = this.pendingYDelta - var7Lifetime1;
        if (0 < this.pendingWidthDelta) {
          var7Lifetime2 = -(-this.pendingWidthDelta >> 2);
        } else {
          var7Lifetime2 = this.pendingWidthDelta >> 2;
        }
        var8 = 81 % ((param5 + 17) / 33);
        this.pendingWidthDelta = this.pendingWidthDelta - var7Lifetime2;
        this.field_K = this.field_K + var7Lifetime2;
        if (0 >= this.pendingHeightDelta) {
          var7Lifetime3 = this.pendingHeightDelta >> 2;
        } else {
          var7Lifetime3 = -(-this.pendingHeightDelta >> 2);
        }
        param2 = param2 & this.field_rb;
        this.screenY = param4 + this.field_S;
        this.height = this.height + var7Lifetime3;
        this.pendingHeightDelta = this.pendingHeightDelta - var7Lifetime3;
        this.field_tb = this.field_D + param1;
        var9 = SoftwareRasterizer.field_e;
        var10 = SoftwareRasterizer.field_f;
        var11 = SoftwareRasterizer.field_h;
        var12 = SoftwareRasterizer.field_a;
        SoftwareRasterizer.intersectClip(this.field_tb, this.screenY, this.field_K + this.field_tb, this.screenY + this.height);
        var13 = 0;
        if (!DiskCacheRequest.field_I &&
          param2 &&
          IntrusiveDequeCursor.field_c != 0 &&
          BufferedRandomAccessFile.field_a >= SoftwareRasterizer.field_e &&
          BufferedRandomAccessFile.field_a < SoftwareRasterizer.field_h &&
          FriendCaptionGlobals.field_c >= SoftwareRasterizer.field_f &&
          FriendCaptionGlobals.field_c < SoftwareRasterizer.field_a) {
          var13 = 1;
          this.field_Ab = -this.screenY + FriendCaptionGlobals.field_c;
          this.field_P = IntrusiveDequeCursor.field_c;
          this.field_ub = -this.field_tb + BufferedRandomAccessFile.field_a;
          this.heldPressButton = IntrusiveDequeCursor.field_c;
        } else {
          if (0 != IntrusiveDequeCursor.field_c) {
            this.heldPressButton = 0;
          }
          this.field_P = 0;
        }
        stackIn_31_1 = (!EmergentBehaviourBackground.field_q) && (SoftwareRasterizer.field_e <= ProxyAuthenticationException.field_d) && (ProxyAuthenticationException.field_d < SoftwareRasterizer.field_h) && (StatusBar.field_k >= SoftwareRasterizer.field_f) && (SoftwareRasterizer.field_a > StatusBar.field_k);
        this.field_R = stackIn_31_1;
        if (0 == HighscorePacketHandlers.field_b) {
          this.heldPressButton = 0;
        }
        stackIn_39_1 = (this.field_R) && (HighscorePacketHandlers.field_b == this.heldPressButton) && (param2);
        this.field_W = stackIn_39_1;
        if (null != this.children) {
          var14 = (SceneWidget) (this.children.last(1504642273));
          while (var14 != null) {
            var14.updateInputTree(this.field_K, this.field_tb, param2, this.height, this.screenY, -123);
            var14 = (SceneWidget) (this.children.previous(0));
          }
        }
        if (this.field_R) {
          EmergentBehaviourBackground.field_q = true;
        }
        if (var13 != 0) {
          DiskCacheRequest.field_I = true;
        }
        SoftwareRasterizer.setClip(var9, var10, var11, var12);
        if (this.heldPressButton != 0 &&
          this.field_vb) {
          this.field_D = -this.field_ub + (ProxyAuthenticationException.field_d - param1);
          this.field_S = StatusBar.field_k - this.field_Ab - param4;
          if (this.field_D < 0) {
            this.field_D = 0;
          }
          if (0 > this.field_S) {
            this.field_S = 0;
          }
          if (this.field_D > param0 - this.field_K) {
            this.field_D = -this.field_K + param0;
          }
          this.pendingXDelta = 0;
          this.pendingYDelta = 0;
          this.field_tb = param1 + this.field_D;
          if (this.field_S > -this.height + param3) {
            this.field_S = param3 - this.height;
          }
          this.screenY = param4 + this.field_S;
        }
    }

    SceneWidget(long param0, SceneWidget param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    final static void closeTransientDialogs(int param0) {
        ArchiveProvider.closeContextMenu(-117);
        BufferedRandomAccessFile.closeAccountNamePrompt(false);
        AccountTermsPanel.field_M = null;
        ScoreMarkerDemo.closeQuickChatMenu(false);
        if (param0 != 0) {
          SceneWidget.releaseStatics((byte) -43);
        }
    }

    final static void openLobbyQuickChat(boolean param0) {
        ChatChannelGlobals.field_d = 0;
        if (!param0) {
          return;
        }
        GridSize.openRootQuickChatMenu(20558);
    }

    final void applyStyle(int param0, SceneWidget param1) {
        boolean stackIn_98_1 = false;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_105_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != null) {
            if (param1.field_fb) {
              this.field_fb = param1.field_fb;
            }
            if (param1.field_A) {
              this.field_A = param1.field_A;
            }
            if (param1.field_C != 0) {
              this.field_C = param1.field_C;
            }
            if (null != param1.field_z) {
              this.field_z = param1.field_z;
            }
            if (null != param1.field_M) {
              this.field_M = param1.field_M;
            }
            if (param1.field_Cb >= 0) {
              this.field_Cb = param1.field_Cb;
            }
            if (null != param1.field_H) {
              this.field_H = param1.field_H;
            }
            if (256 != param1.textOpacity) {
              this.textOpacity = param1.textOpacity;
            }
            if (param1.field_ob != null) {
              this.field_ob = param1.field_ob;
            }
            if (param1.field_pb >= 0) {
              this.field_pb = param1.field_pb;
            }
            if (null != param1.field_bb) {
              this.field_bb = param1.field_bb;
            }
            if (param1.field_eb != null) {
              this.field_eb = param1.field_eb;
            }
            if (param1.field_lb) {
              this.field_lb = param1.field_lb;
            }
            if (null != param1.field_ab) {
              this.field_ab = param1.field_ab;
            }
            if (param1.field_B != null) {
              this.field_B = param1.field_B;
            }
            if (param1.field_y >= 0) {
              this.field_y = param1.field_y;
            }
            if (!param1.field_rb) {
              this.field_rb = param1.field_rb;
            }
            if (null != param1.field_cb) {
              this.field_cb = param1.field_cb;
            }
            if (0 != param1.field_N) {
              this.field_N = param1.field_N;
            }
            if (param1.field_xb != null) {
              this.field_xb = param1.field_xb;
            }
            if (null != param1.font) {
              this.font = param1.font;
            }
            if (param1.field_O >= 0) {
              this.field_O = param1.field_O;
            }
            if (param1.field_mb != 0) {
              this.field_mb = param1.field_mb;
            }
            if (param1.field_U) {
              this.field_U = param1.field_U;
            }
            if (param1.field_qb != null) {
              this.field_qb = param1.field_qb;
            }
            if (null != param1.field_zb) {
              this.field_zb = param1.field_zb;
            }
            if (param1.selectedOffsetX != -2147483648) {
              this.selectedOffsetX = param1.selectedOffsetX;
            }
            if (param1.verticalAlignment != 0) {
              this.verticalAlignment = param1.verticalAlignment;
            }
            if (param1.field_vb) {
              this.field_vb = param1.field_vb;
            }
            if (param1.field_I != 0) {
              this.field_I = param1.field_I;
            }
            if (param1.field_hb != -2147483648) {
              this.field_hb = param1.field_hb;
            }
            if (param1.field_V != -2147483648) {
              this.field_V = param1.field_V;
            }
            if (0 != param1.horizontalAlignment) {
              this.horizontalAlignment = param1.horizontalAlignment;
            }
            if (-2147483648 != param1.field_Y) {
              this.field_Y = param1.field_Y;
            }
            if (-2147483648 != param1.field_x) {
              this.field_x = param1.field_x;
            }
            if (0 != param1.field_w) {
              this.field_w = param1.field_w;
            }
            if (-2147483648 != param1.field_Q) {
              this.field_Q = param1.field_Q;
            }
            stackIn_98_1 = (this.field_lb) && (param1.field_X);
            this.field_X = stackIn_98_1;
          }
          if (param0 != -27813) {
            SceneWidget.openLobbyQuickChat(true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_104_0 = var3;
          stackIn_104_1 = new StringBuilder().append("ak.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_105_2 = "null";
          } else {
            stackIn_105_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_104_0), ((StringBuilder) (Object) stackIn_104_1).append(stackIn_105_2).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        field_E = null;
        field_db = null;
        if (param0 != 59) {
          return;
        }
        field_T = null;
    }

    final void markTreeDirty(int param0) {
        SceneWidget var4 = null;
        int var3 = Pixelate.field_H ? 1 : 0;
        if (this.children != null) {
          var4 = (SceneWidget) (this.children.last(1504642273));
          while (var4 != null) {
            var4.field_fb = true;
            var4.markTreeDirty(-257);
            var4 = (SceneWidget) (this.children.previous(0));
          }
        }
        if (param0 != -257) {
          this.field_fb = true;
        }
    }

    final int getContentWidth(int param0) {
        if (param0 != 0) {
          return -99;
        }
        return this.measureContentWidth((byte) 95, 2147483647);
    }

    protected SceneWidget() {
        this.field_Y = -2147483648;
        this.field_rb = true;
        this.field_lb = false;
        this.field_jb = 256;
        this.field_O = -1;
        this.field_hb = -2147483648;
        this.field_y = -1;
        this.field_V = -2147483648;
        this.field_X = false;
        this.textOpacity = 256;
        this.field_Cb = -1;
        this.field_pb = -1;
        this.selectedOffsetX = -2147483648;
        this.field_Q = -2147483648;
        this.field_x = -2147483648;
    }

    SceneWidget(long param0, SceneWidget param1, int param2, int param3, int param4, int param5, String param6) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_Y = -2147483648;
        this.field_rb = true;
        this.field_lb = false;
        this.field_jb = 256;
        this.field_O = -1;
        this.field_hb = -2147483648;
        this.field_y = -1;
        this.field_V = -2147483648;
        this.field_X = false;
        this.textOpacity = 256;
        this.field_Cb = -1;
        this.field_pb = -1;
        this.selectedOffsetX = -2147483648;
        this.field_Q = -2147483648;
        this.field_x = -2147483648;
        try {
          this.field_e = param0;
          this.field_K = param4;
          this.height = param5;
          this.field_S = param3;
          this.field_D = param2;
          this.applyStyle(-27813, param1);
          if (param6 != null) {
            this.field_cb = param6;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("ak.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_db = new int[]{10, 10, 20, 20, 20, 20};
    }
}
