/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ClientUiComponent extends ClientUiNode {
    private boolean field_Db;
    int width;
    int field_L;
    private int field_ib;
    static ClientUiComponent field_Q;
    boolean field_ub;
    RgbSprite[] field_A;
    NodeDeque children;
    RgbSprite[] field_mb;
    int field_R;
    int field_N;
    boolean field_M;
    int heldPressButton;
    RgbSprite[] field_G;
    boolean heldButtonMatches;
    int field_O;
    int field_W;
    private int field_E;
    private boolean inheritParentClip;
    String text;
    RgbSprite sprite;
    int field_tb;
    static String field_zb;
    String field_I;
    int screenX;
    int horizontalAlignment;
    boolean draggable;
    int field_Bb;
    int field_pb;
    RgbSprite[] field_H;
    int pendingHeightDelta;
    int field_F;
    private int pendingXDelta;
    int opacity;
    boolean inputEnabled;
    boolean selected;
    int field_bb;
    int field_B;
    int field_T;
    int pressedButton;
    int x;
    int height;
    RgbSprite field_P;
    int field_z;
    int pendingYDelta;
    static String field_lb;
    private int pendingWidthDelta;
    int screenY;
    boolean hovered;
    int field_wb;
    boolean field_Y;
    int verticalAlignment;
    private int field_Ab;
    RgbSprite[] field_U;
    static int[][] field_K;
    RgbSprite field_sb;
    private int field_kb;
    RgbSprite field_vb;
    int y;
    RgbSprite field_qb;
    BitmapFont font;

    final void b(boolean param0, int param1) {
        this.a((byte) -26, SoftwareRaster.height, param0, SoftwareRaster.width, 0, false, false, false, 0, true, false);
        if (param1 != 20) {
          ClientUiComponent var4 = (ClientUiComponent) null;
          this.a((ClientUiComponent) null, false, 64, (ClientUiComponent) null);
        }
    }

    final static void c(boolean param0, int param1) {
        int var3;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param1 > -101) {
          field_K = (int[][]) null;
        }
        if (param0 ||
          null == vu.field_M) {
          vk.field_f = false;
        }
        if (!param0) {
          if (null != vu.field_M) {
            if (gk.field_J <= 0) {
              if (PreparedAction.field_r <= 0) {
                if (mj.field_c > InstructionsPanel.field_D) {
                  if (InstructionsPanel.field_D == 0) {
                    RadialSummonMenu.a(false, false);
                  }
                  InstructionsPanel.field_D = InstructionsPanel.field_D + 1;
                }
              } else {
                PreparedAction.field_r = PreparedAction.field_r - 1;
              }
            } else {
              gk.field_J = gk.field_J - 1;
            }
          } else {
            if (null == no.field_K) {
              vk.field_f = false;
              if (PreparedAction.field_r > 0) {
                PreparedAction.field_r = PreparedAction.field_r - 1;
              } else {
                if (InstructionsPanel.field_D > 0) {
                  InstructionsPanel.field_D = InstructionsPanel.field_D - 1;
                } else {
                  if (mj.field_c > gk.field_J) {
                    if (gk.field_J == 0) {
                      DeployEvent.h(14570);
                    }
                    gk.field_J = gk.field_J + 1;
                  }
                }
              }
            } else {
              if (gk.field_J > 0) {
                gk.field_J = gk.field_J - 1;
              } else {
                if (InstructionsPanel.field_D <= 0) {
                  if (mj.field_c > PreparedAction.field_r) {
                    if (0 == PreparedAction.field_r) {
                      RadialSummonMenu.a(false, true);
                    }
                    PreparedAction.field_r = PreparedAction.field_r + 1;
                  }
                } else {
                  InstructionsPanel.field_D = InstructionsPanel.field_D - 1;
                }
              }
            }
          }
        } else {
          if (0 < gk.field_J) {
            gk.field_J = gk.field_J - 1;
          } else {
            if (PreparedAction.field_r <= 0) {
              if (0 < InstructionsPanel.field_D) {
                InstructionsPanel.field_D = InstructionsPanel.field_D - 1;
              }
            } else {
              PreparedAction.field_r = PreparedAction.field_r - 1;
            }
          }
        }
    }

    final void applyStyle(int obfuscationGuard, ClientUiComponent style) {
        boolean stackIn_72_1 = false;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_102_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (style != null) {
            if (style.field_qb != null) {
              this.field_qb = style.field_qb;
            }
            if (style.field_N != 0) {
              this.field_N = style.field_N;
            }
            if (style.field_ub) {
              this.field_ub = style.field_ub;
            }
            if (style.field_sb != null) {
              this.field_sb = style.field_sb;
            }
            if (style.field_O != 0) {
              this.field_O = style.field_O;
            }
            if (style.inheritParentClip) {
              this.inheritParentClip = style.inheritParentClip;
            }
            if (null != style.field_mb) {
              this.field_mb = style.field_mb;
            }
            if (style.selected) {
              this.selected = style.selected;
            }
            if (style.field_A != null) {
              this.field_A = style.field_A;
            }
            if (style.opacity != 256) {
              this.opacity = style.opacity;
            }
            if (style.field_M) {
              this.field_M = style.field_M;
            }
            if (0 != style.field_pb) {
              this.field_pb = style.field_pb;
            }
            if (null != style.field_G) {
              this.field_G = style.field_G;
            }
            if (style.field_I != null) {
              this.field_I = style.field_I;
            }
            if (style.field_P != null) {
              this.field_P = style.field_P;
            }
            if (null != style.font) {
              this.font = style.font;
            }
            if (null != style.sprite) {
              this.sprite = style.sprite;
            }
            if (style.field_T >= 0) {
              this.field_T = style.field_T;
            }
            if (style.field_wb >= 0) {
              this.field_wb = style.field_wb;
            }
            if (!style.inputEnabled) {
              this.inputEnabled = style.inputEnabled;
            }
            if (null != style.text) {
              this.text = style.text;
            }
            if (style.field_W >= 0) {
              this.field_W = style.field_W;
            }
            if (0 <= style.field_L) {
              this.field_L = style.field_L;
            }
            if (style.field_H != null) {
              this.field_H = style.field_H;
            }
            if (style.field_U != null) {
              this.field_U = style.field_U;
            }
            if (null != style.field_vb) {
              this.field_vb = style.field_vb;
            }
            if (-2147483648 != style.field_B) {
              this.field_B = style.field_B;
            }
            stackIn_72_1 = (this.field_M) && (style.field_Y);
            this.field_Y = stackIn_72_1;
            if (style.field_R != -2147483648) {
              this.field_R = style.field_R;
            }
            if (style.draggable) {
              this.draggable = style.draggable;
            }
            if (style.field_ib != -2147483648) {
              this.field_ib = style.field_ib;
            }
            this.field_Db = style.field_Db;
            if (style.field_z != 0) {
              this.field_z = style.field_z;
            }
            if (0 != style.verticalAlignment) {
              this.verticalAlignment = style.verticalAlignment;
            }
            if (style.field_E != -2147483648) {
              this.field_E = style.field_E;
            }
            if (style.field_Bb != -2147483648) {
              this.field_Bb = style.field_Bb;
            }
            if (style.horizontalAlignment != 0) {
              this.horizontalAlignment = style.horizontalAlignment;
            }
            if (style.field_tb != -2147483648) {
              this.field_tb = style.field_tb;
            }
            if (style.field_F != 0) {
              this.field_F = style.field_F;
            }
          }
          if (obfuscationGuard != 0) {
            this.field_M = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_101_0 = var3;
          stackIn_101_1 = new StringBuilder().append("je.TA(").append(obfuscationGuard).append(',');
          if (style == null) {
            stackIn_102_2 = "null";
          } else {
            stackIn_102_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_101_0), ((StringBuilder) (Object) stackIn_101_1).append(stackIn_102_2).append(')').toString());
        }
    }

    final void addChild(ClientUiComponent child, int obfuscationGuard) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (null == this.children) {
            this.children = new NodeDeque();
          }
          this.children.addLast((byte) -119, (IntrusiveNode) (child));
          if (obfuscationGuard < 36) {
            this.field_M = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("je.MA(");
          if (child == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        ClientUiComponent var10_ref_je = null;
        int var9 = 0;
        int var11 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var9Lifetime1;
        if (param3 != -1379) {
          return;
        }
        int var5 = -this.y;
        int var6 = -this.pendingYDelta + var5;
        int var7 = this.height;
        int var8 = this.pendingHeightDelta + var7;
        if (!param0) {
          var9 = 0;
          var10_ref_je = (ClientUiComponent) (this.children.first((byte) 124));
          while (var10_ref_je != null) {
            var10_ref_je.pendingYDelta = -var10_ref_je.y + var9;
            var9 = var9 + (param2 + (var10_ref_je.pendingHeightDelta + var10_ref_je.height));
            var10_ref_je = (ClientUiComponent) (this.children.next((byte) 123));
          }
          var8 = var9 - param2;
        }
        var9Lifetime1 = -param1 + var8;
        if (var9Lifetime1 < var6) {
          var6 = var9Lifetime1;
        }
        if (var6 < 0) {
          var6 = 0;
        }
        int var10 = var7 - param1;
        if (var10 < var5) {
          var5 = var10;
        }
        if (var5 < 0) {
          var5 = 0;
        }
        this.height = var7;
        this.pendingYDelta = -var6 + var5;
        this.pendingHeightDelta = -var7 + var8;
        this.y = -var5;
    }

    ClientUiComponent(long key, ClientUiComponent style) {
        this(key, style, 0, 0, 0, 0, (String) null);
    }

    private final void a(boolean param0, boolean param1, int param2, int param3, int param4, int param5) {
        boolean stackIn_30_1 = false;
        boolean stackIn_38_1 = false;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        ClientUiComponent var13;
        int var14;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        var14 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.pendingXDelta > 0) {
          var7 = -(-this.pendingXDelta >> 2);
        } else {
          var7 = this.pendingXDelta >> 2;
        }
        this.pendingXDelta = this.pendingXDelta - var7;
        this.x = this.x + var7;
        if (0 < this.pendingYDelta) {
          var7Lifetime1 = -(-this.pendingYDelta >> 2);
        } else {
          var7Lifetime1 = this.pendingYDelta >> 2;
        }
        this.y = this.y + var7Lifetime1;
        this.pendingYDelta = this.pendingYDelta - var7Lifetime1;
        if (this.pendingWidthDelta > 0) {
          var7Lifetime2 = -(-this.pendingWidthDelta >> 2);
        } else {
          var7Lifetime2 = this.pendingWidthDelta >> 2;
        }
        this.width = this.width + var7Lifetime2;
        this.pendingWidthDelta = this.pendingWidthDelta - var7Lifetime2;
        if (this.pendingHeightDelta > 0) {
          var7Lifetime3 = -(-this.pendingHeightDelta >> 2);
        } else {
          var7Lifetime3 = this.pendingHeightDelta >> 2;
        }
        this.screenX = param5 + this.x;
        param0 = param0 & this.inputEnabled;
        this.height = this.height + var7Lifetime3;
        this.pendingHeightDelta = this.pendingHeightDelta - var7Lifetime3;
        this.screenY = this.y + param2;
        var8 = SoftwareRaster.clipLeft;
        var9 = SoftwareRaster.clipTop;
        var10 = SoftwareRaster.clipRight;
        var11 = SoftwareRaster.clipBottom;
        SoftwareRaster.b(this.screenX, this.screenY, this.screenX + this.width, this.screenY + this.height);
        var12 = param1 ? 1 : 0;
        if (!SectorCacheStore.field_e &&
          param0 &&
          DeployEvent.pointerPressButton != 0 &&
          SoftwareRaster.clipLeft <= BattleTutorial.pointerPressX &&
          BattleTutorial.pointerPressX < SoftwareRaster.clipRight &&
          TeleportAction.pointerPressY >= SoftwareRaster.clipTop &&
          TeleportAction.pointerPressY < SoftwareRaster.clipBottom) {
          this.pressedButton = DeployEvent.pointerPressButton;
          this.heldPressButton = DeployEvent.pointerPressButton;
          this.field_bb = -this.screenX + BattleTutorial.pointerPressX;
          var12 = 1;
          this.field_Ab = -this.screenY + TeleportAction.pointerPressY;
        } else {
          this.pressedButton = 0;
          if (DeployEvent.pointerPressButton != 0) {
            this.heldPressButton = 0;
          }
        }
        stackIn_30_1 = (!QuickChatCategoryRepository.field_f) && (SoftwareRaster.clipLeft <= AiPlanningStrategy.pointerX) && (SoftwareRaster.clipRight > AiPlanningStrategy.pointerX) && (SoftwareRaster.clipTop <= ko.pointerY) && (SoftwareRaster.clipBottom > ko.pointerY);
        this.hovered = stackIn_30_1;
        if (ro.pointerButton == 0) {
          this.heldPressButton = 0;
        }
        stackIn_38_1 = (this.hovered) && (ro.pointerButton == this.heldPressButton) && (param0);
        this.heldButtonMatches = stackIn_38_1;
        if (null != this.children) {
          var13 = (ClientUiComponent) (this.children.last((byte) -82));
          while (var13 != null) {
            var13.a(param0, param1, this.screenY, this.height, this.width, this.screenX);
            var13 = (ClientUiComponent) (this.children.previous((byte) 88));
          }
        }
        if (var12 != 0) {
          SectorCacheStore.field_e = true;
        }
        if (this.hovered) {
          QuickChatCategoryRepository.field_f = true;
        }
        SoftwareRaster.f(var8, var9, var10, var11);
        if (this.heldPressButton != 0 &&
          this.draggable) {
          this.x = -this.field_bb + AiPlanningStrategy.pointerX - param5;
          this.y = -this.field_Ab + ko.pointerY - param2;
          if (0 > this.x) {
            this.x = 0;
          }
          if (this.y < 0) {
            this.y = 0;
          }
          if (this.x > param4 - this.width) {
            this.x = -this.width + param4;
          }
          this.pendingYDelta = 0;
          if (this.y > param3 - this.height) {
            this.y = param3 - this.height;
          }
          this.screenX = this.x + param5;
          this.pendingXDelta = 0;
          this.screenY = param2 + this.y;
        }
    }

    final void b(int param0, ClientUiComponent param1) {
        NodeIterator var3 = null;
        ClientUiComponent var4 = null;
        int var5 = 0;
        boolean stackIn_11_1 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param0 != 3) {
            this.a(true, 119, -41, -35);
          }
          if (null != this.children) {
            var3 = new NodeIterator(this.children);
            var4 = (ClientUiComponent) (var3.first(param0 + 47));
            while (var4 != null) {
              var4.b(param0 ^ 0, param1);
              var4 = (ClientUiComponent) (var3.next(param0 + 47));
            }
          }
          stackIn_11_1 = (param1 == this);
          this.field_Y = stackIn_11_1;
          if (this.field_Db) {
            this.selected = this.field_Y;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("je.DB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1) {
        int var6 = 0;
        int var11 = 0;
        int stackIn_4_0 = 0;
        ClientUiComponent stackIn_6_0;
        int stackIn_6_1;
        int stackIn_6_2;
        int stackIn_6_3;
        int stackIn_7_4 = 0;
        int stackIn_43_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ClientUiComponent var7 = null;
        int var7_int = 0;
        int var8 = 0;
        ClientUiComponent var8_ref_je = null;
        IconTextComponent var9 = null;
        int var9_int = 0;
        int var10 = 0;
        IconTextComponent var10_ref_nf = null;
        int var12 = 0;
        int var13 = 0;
        ClientUiComponent var14 = null;
        var13 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          tq.field_c = SoftwareRaster.width;
          CachedArchiveProvider.field_p = SoftwareRaster.height;
          if (param1) {
            stackIn_4_0 = PreparedAction.field_r;
          } else {
            stackIn_4_0 = InstructionsPanel.field_D;
          }
          AnimationSequence.a(stackIn_4_0, -106);
          ij.field_w.a(-40 + lk.field_a.height - 2, (byte) -125, 0, lk.field_a.width, 0);
          gg.field_E.setBounds(jn.field_d, -20500, eb.field_c.width, 0, 0);
          stackIn_6_0 = di.field_l;
          stackIn_6_1 = 18;
          stackIn_6_2 = -20500;
          stackIn_6_3 = eb.field_c.width;
          if (fh.field_c) {
            stackIn_7_4 = 2 + jn.field_c + 42;
          } else {
            stackIn_7_4 = 0;
          }
          ((ClientUiComponent) (Object) stackIn_6_0).setBounds(stackIn_6_1, stackIn_6_2, stackIn_6_3 - stackIn_7_4, 2 + jn.field_d, 0);
          SpellCastEvent.field_D.setBounds(18, -20500, 42 + jn.field_c, 2 + jn.field_d, -40 + (eb.field_c.width - jn.field_c - 2));
          bu.field_a.a(0, false, eb.field_c.width, 2, jn.field_c, 20 + (2 + jn.field_d), -20 + (-2 + (-jn.field_d + eb.field_c.height)));
          mp.field_Lb.setBounds(40, -20500, lk.field_a.width, lk.field_a.height - 40, 0);
          kd.field_F.setBounds(30, -20500, pd.field_c.width, 0, 0);
          if (param0 < 13) {
            return;
          }
          vc.field_l.setBounds(-2 + pd.field_c.height - 70, -20500, pd.field_c.width, 30, 0);
          var2_int = 3 + tq.field_b;
          if (2 > lm.field_e.length) {
            var2_int--;
          }
          if (param1) {
            var2_int--;
          }
          var3 = -2 + (-15 + (-5 + vc.field_l.height + (2 + (1 + var2_int) / 2))) / (var2_int + 1);
          if (var3 > 30) {
            var3 = 30;
          }
          var4 = -5 + (vc.field_l.height - (5 + (var3 + 2) * var2_int));
          if (var4 > 40) {
            var4 = 40;
          }
          BattleTutorial.field_d.setBounds(var4, -20500, vc.field_l.width - 5 - 5, 5, 5);
          var5 = 5 + var4 + 2;
          for (var6 = 0; 4 + tq.field_b > var6; var6++) {
            if ((var6 != 1 ||
              !(lm.field_e.length < 2)) && (3 != var6 ||
              !(1 >= BoundedFile.field_h))) {
              if (!param1 &&
                var6 == 3) {
                var7 = KingBlackDragonEvent.field_z[var6];
                KingBlackDragonEvent.field_z[var6].height = 0;
                var7.width = 0;
                for (var8 = 0; var8 < pu.field_k[var6].length; var8++) {
                  if (null != pu.field_k[var6][var8]) {
                    var9 = pu.field_k[var6][var8];
                    pu.field_k[var6][var8].height = 0;
                    var9.width = 0;
                  }
                }
              } else if (param1 &&
                var6 == 0) {
                var14 = KingBlackDragonEvent.field_z[var6];
                var7 = var14;
                KingBlackDragonEvent.field_z[var6].height = 0;
                var14.width = 0;
                for (var8 = 0; pu.field_k[var6].length > var8; var8++) {
                  if (null != pu.field_k[var6][var8]) {
                    var9 = pu.field_k[var6][var8];
                    pu.field_k[var6][var8].height = 0;
                    var9.width = 0;
                  }
                }
              } else {
                if (param1) {
                  if (var6 >= 4) {
                    if (EventPresenter.field_o != null) {
                      stackIn_43_0 = (EventPresenter.field_o[var6 - 4]) ? 1 : 0;
                    } else {
                      stackIn_43_0 = 0;
                    }
                  } else {
                    stackIn_43_0 = 0;
                  }
                } else {
                  stackIn_43_0 = 0;
                }
                var7_int = stackIn_43_0;
                if (var7_int != 0) {
                  var8_ref_je = KingBlackDragonEvent.field_z[var6];
                  KingBlackDragonEvent.field_z[var6].height = 0;
                  var8_ref_je.width = 0;
                  for (var9_int = 0; var9_int < pu.field_k[var6].length; var9_int++) {
                    if (pu.field_k[var6][var9_int] != null) {
                      var10_ref_nf = pu.field_k[var6][var9_int];
                      pu.field_k[var6][var9_int].height = 0;
                      var10_ref_nf.width = 0;
                    }
                  }
                } else {
                  KingBlackDragonEvent.field_z[var6].setBounds(var3, -20500, 103, var5, 5);
                  var8 = 110;
                  if (param1) {
                    pu.field_k[var6][0].setLayout(var3, 2, -30061, 38, var5, var8, io.field_n);
                    var8 += 40;
                  } else {
                    if (pu.field_k[var6][0] != null) {
                      var9 = pu.field_k[var6][0];
                      pu.field_k[var6][0].height = 0;
                      var9.width = 0;
                    }
                  }
                  var9_int = -5 + (pd.field_c.width + (-var8 + 2));
                  var10 = pu.field_k[var6].length - 1;
                  for (var11 = 0; var10 > var11; var11++) {
                    var12 = var11 * var9_int / var10;
                    pu.field_k[var6][var11 + 1].setLayout(var3, 2, -30061, var9_int * (1 + var11) / var10 - 2 - var12, var5, var8 + var12, io.field_n);
                  }
                  var5 = var5 + (var3 + 2);
                }
              }
            }
          }
          ta.field_R.setBounds(-134 + (SoftwareRaster.height - 10), -20500, 360, 10, SoftwareRaster.width - 360 >> 1);
          bk.field_f.setBounds(24, -20500, ta.field_R.width, 0, 0);
          df.field_K.setBounds(-24 + ta.field_R.height, -20500, ta.field_R.width, 24, 0);
          df.field_K.field_G = tq.a(11579568, false, df.field_K.height, 1, 3, 8421504);
          IconTextComponent.field_Kb.setBounds(df.field_K.height - 36, -20500, df.field_K.width - 10, 5, 5);
          dv.field_m.setBounds(24, -20500, 80, -24 + df.field_K.height - 5, (df.field_K.width - 80) / 2);
          mj.a((byte) 120);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "je.CB(" + param0 + ',' + param1 + ')');
        }
    }

    final void updateInput(boolean inputAllowed, boolean enableCapture) {
        SectorCacheStore.field_e = !enableCapture ? true : false;
        QuickChatCategoryRepository.field_f = !enableCapture ? true : false;
        this.a(inputAllowed, false, 0, SoftwareRaster.height, SoftwareRaster.width, 0);
    }

    ClientUiComponent(long key, ClientUiComponent style, String text) {
        this(key, style, 0, 0, 0, 0, text);
    }

    final void useParentClipForDescendants(int obfuscationGuard) {
        ClientUiComponent var4 = null;
        int var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (null != this.children) {
          var4 = (ClientUiComponent) (this.children.last((byte) -112));
          while (var4 != null) {
            var4.inheritParentClip = true;
            var4.useParentClipForDescendants(-10027);
            var4 = (ClientUiComponent) (this.children.previous((byte) -104));
          }
        }
        if (obfuscationGuard != -10027) {
          this.children = (NodeDeque) null;
        }
    }

    final void a(ClientUiComponent param0, boolean param1, int param2, ClientUiComponent param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (!param1) {
            ClientUiComponent.a(-53, false);
          }
          if (param3 == null) {
            param0.pendingYDelta = 0;
            param0.y = 0;
          } else {
            param0.pendingYDelta = param3.pendingHeightDelta + param3.pendingYDelta;
            param0.y = param3.y - (-param3.height - param2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("je.PA(");
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
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private final void a(byte param0, int param1, boolean param2, int param3, int param4, boolean param5, boolean param6, boolean param7, int param8, boolean param9, boolean param10) {
        boolean stackIn_5_0 = false;
        int var12;
        int var13;
        int var14;
        int var15;
        RgbSprite[] var16;
        RgbSprite var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23_int;
        String var23;
        ClientUiComponent var23_ref;
        int var24;
        int var25;
        String var26;
        String var23Lifetime1;
        String var23Lifetime2;
        var25 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        this.screenX = this.x + param8;
        this.screenY = this.y + param4;
        var12 = SoftwareRaster.clipLeft;
        var13 = SoftwareRaster.clipTop;
        var14 = SoftwareRaster.clipRight;
        var15 = SoftwareRaster.clipBottom;
        SoftwareRaster.b(this.screenX, this.screenY, this.width + this.screenX, this.height + this.screenY);
        param9 = param9 & this.inputEnabled;
        if (!this.inheritParentClip) {
          param7 = this.selected;
          param10 = this.heldButtonMatches;
          stackIn_5_0 = (0 != this.heldPressButton);
          param5 = stackIn_5_0;
        }
        if (param0 != -26) {
          return;
        }
        var16 = this.field_G;
        var17 = this.sprite;
        var18 = this.field_N;
        var19 = 0;
        if (!param9) {
          if (this.field_L >= 0) {
            var18 = this.field_L;
          }
          if (this.field_sb != null) {
            var17 = this.field_sb;
          }
          if (null != this.field_A) {
            var16 = this.field_A;
          }
        }
        var20 = 0;
        if (param10) {
          if (null != this.field_mb) {
            var16 = this.field_mb;
          }
          if (null != this.field_vb) {
            var17 = this.field_vb;
          }
          if (-2147483648 != this.field_ib) {
            var19 = this.field_ib;
          }
          if (-2147483648 != this.field_E) {
            var20 = this.field_E;
          }
          if (this.field_W >= 0) {
            var18 = this.field_W;
          }
        }
        if (param5) {
          if (null != this.field_qb) {
            var17 = this.field_qb;
          }
          if (this.field_R != -2147483648) {
            var20 = this.field_R;
          }
          if (null != this.field_U) {
            var16 = this.field_U;
          }
          if (this.field_Bb != -2147483648) {
            var19 = this.field_Bb;
          }
          if (this.field_T >= 0) {
            var18 = this.field_T;
          }
        }
        if (param7) {
          if (this.field_H != null) {
            var16 = this.field_H;
          }
          if (this.field_B != -2147483648) {
            var19 = this.field_B;
          }
          if (-2147483648 != this.field_tb) {
            var20 = this.field_tb;
          }
          if (null != this.field_P) {
            var17 = this.field_P;
          }
          if (this.field_wb >= 0) {
            var18 = this.field_wb;
          }
        }
        var21 = this.field_F + var19;
        var22 = var20 + this.field_z;
        if (this.field_ub) {
          i.a(var16, param1, param8, (byte) -47, param4, param3);
        } else {
          i.a(var16, this.height, this.screenX, (byte) -47, this.screenY, this.width);
        }
        if (var17 != null) {
          var23_int = var21 + this.screenX;
          if (1 == this.horizontalAlignment) {
            var23_int = var23_int + (this.width - var17.canvasWidth) / 2;
          }
          var24 = this.screenY + var22;
          if (this.verticalAlignment == 1) {
            var24 = var24 + (-var17.canvasHeight + this.height) / 2;
          }
          if (2 == this.horizontalAlignment) {
            var23_int = var23_int + (this.width - var17.canvasWidth);
          }
          if (2 == this.verticalAlignment) {
            var24 = var24 + (this.height - var17.canvasHeight);
          }
          if (256 <= this.field_kb) {
            var17.g(var23_int, var24);
          } else {
            var17.e(var23_int, var24, this.field_kb);
          }
        }
        boolean decompiledFrameRemainder0 = true;
        if (null != this.text &&
          this.font != null) {
          var26 = this.text;
          var23 = var26;
          var23Lifetime1 = var26;
          var23Lifetime2 = var26;
          if (param2 &&
            null != this.field_I) {
            var23Lifetime2 = var26 + this.field_I;
          }
          if (this.font.a(var23Lifetime2) <= this.width - 2 * this.field_O &&
            var23Lifetime2.indexOf("<br>") < 0) {
            if (this.verticalAlignment != 1) {
              if (this.verticalAlignment == 2) {
                var22 = var22 + (-this.font.field_H + (-this.font.field_L + this.height));
              }
            } else {
              var22 = var22 + (-this.font.field_L + this.height - this.font.field_H) / 2;
            }
            if (this.horizontalAlignment == 0) {
              this.font.b(var23Lifetime2, this.field_O + this.screenX + var21, this.font.field_H + (this.screenY + var22), var18, -1, this.opacity);
            } else {
              if (this.horizontalAlignment == 1) {
                this.font.a(var23Lifetime2, var21 + (this.screenX + this.field_O + (this.width - 2 * this.field_O) / 2), var22 + (this.screenY + this.font.field_H), var18, -1, this.opacity);
              } else {
                if (2 != this.horizontalAlignment) {
                  this.font.a(var23Lifetime2, this.screenX + this.field_O + var21, var22 + this.screenY, -(2 * this.field_O) + this.width, this.height, var18, -1, this.opacity, this.horizontalAlignment, this.verticalAlignment, this.field_pb);
                } else {
                  this.font.c(var23Lifetime2, this.screenX + this.field_O + var21 - (-this.width + this.field_O * 2), var22 + this.screenY + this.font.field_H, var18, -1, this.opacity);
                }
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            this.font.a(var23Lifetime2, this.field_O + this.screenX + var21, var22 + this.screenY, -(2 * this.field_O) + this.width, this.height, var18, -1, this.opacity, this.horizontalAlignment, this.verticalAlignment, this.field_pb);
          }
        }
        if (this.children != null) {
          var23_ref = (ClientUiComponent) (this.children.first((byte) 118));
          while (var23_ref != null) {
            var23_ref.a((byte) -26, this.height, param2, this.width, var20 + this.screenY, param5, this.field_Y, param7, this.screenX + var19, param9, param10);
            var23_ref = (ClientUiComponent) (this.children.next((byte) 123));
          }
        }
        SoftwareRaster.f(var12, var13, var14, var15);
        return;
    }

    final int getPreferredWidth(int obfuscationGuard) {
        int var2 = -17 % ((30 - obfuscationGuard) / 58);
        return this.measureContentWidth(true, 2147483647);
    }

    final void setBounds(int height, int obfuscationGuard, int width, int y, int x) {
        this.y = y;
        this.pendingHeightDelta = 0;
        this.width = width;
        this.pendingXDelta = 0;
        if (obfuscationGuard != -20500) {
          return;
        }
        this.pendingYDelta = 0;
        this.pendingWidthDelta = 0;
        this.x = x;
        this.height = height;
    }

    final int measureContentWidth(boolean obfuscationGuard, int maximumTextWidth) {
        ClientUiComponent var4 = null;
        int var5 = 0;
        int var4_int = 0;
        int var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var4_intLifetime1;
        if (!obfuscationGuard) {
          this.y = -10;
        }
        int var3 = 0;
        if (null != this.text &&
          null != this.font) {
          var4_int = this.font.a(this.text, maximumTextWidth);
          if (var3 < var4_int) {
            var3 = var4_int;
          }
        }
        if (this.sprite != null) {
          var4_intLifetime1 = this.sprite.canvasWidth;
          if (var3 < var4_intLifetime1) {
            var3 = var4_intLifetime1;
          }
        }
        if (this.children != null) {
          var4 = (ClientUiComponent) (this.children.first((byte) 93));
          while (var4 != null) {
            var5 = var4.x + var4.width;
            if (var5 > var3) {
              var3 = var5;
            }
            var4 = (ClientUiComponent) (this.children.next((byte) 123));
          }
        }
        return var3;
    }

    public static void h(int param0) {
        field_Q = null;
        int var1 = 52 / ((param0 + 55) / 44);
        field_K = (int[][]) null;
        field_zb = null;
        field_lb = null;
    }

    public ClientUiComponent() {
        this.field_L = -1;
        this.field_Db = false;
        this.opacity = 256;
        this.field_ib = -2147483648;
        this.field_W = -1;
        this.field_B = -2147483648;
        this.field_Bb = -2147483648;
        this.field_M = false;
        this.field_T = -1;
        this.field_E = -2147483648;
        this.field_R = -2147483648;
        this.inputEnabled = true;
        this.field_Y = false;
        this.field_kb = 256;
        this.field_wb = -1;
        this.field_tb = -2147483648;
    }

    ClientUiComponent(long key, ClientUiComponent style, int x, int y, int width, int height, String text) {
        this.field_L = -1;
        this.field_Db = false;
        this.opacity = 256;
        this.field_ib = -2147483648;
        this.field_W = -1;
        this.field_B = -2147483648;
        this.field_Bb = -2147483648;
        this.field_M = false;
        this.field_T = -1;
        this.field_E = -2147483648;
        this.field_R = -2147483648;
        this.inputEnabled = true;
        this.field_Y = false;
        this.field_kb = 256;
        this.field_wb = -1;
        this.field_tb = -2147483648;
        try {
          this.height = height;
          this.x = x;
          this.y = y;
          this.width = width;
          this.key = key;
          this.applyStyle(0, style);
          if (text != null) {
            this.text = text;
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "je.<init>(" + key + ',' + (style != null ? "{...}" : "null") + ',' + x + ',' + y + ',' + width + ',' + height + ',' + (text != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_lb = "Wizards and warriors, foul demons and brutal orks, vicious goblins and fearless dwarves: all are yours to summon and command.";
        field_zb = "Private";
        field_K = new int[][]{new int[]{35, 0}, new int[]{42, 42}, new int[]{35, 0}, new int[]{13, 40}, new int[]{33, 48}, new int[]{25, 0}, new int[]{28, 0}, new int[]{50, 41}, new int[]{43, 0}, new int[]{30, 0}, new int[]{50, 0}, new int[]{50, 41}, new int[]{33, 0}, new int[]{32, 0}, new int[]{36, 36}, new int[]{30, 0}, new int[]{24, 39}, new int[]{50, 41}, new int[]{38, 38}, new int[]{35, 0}, new int[]{20, 0}, new int[]{35, 0}, new int[]{50, 41}, new int[]{33, 0}, new int[]{45, 0}, new int[]{25, 38}, new int[]{49, 0}, new int[]{30, 0}, new int[]{24, 0}, new int[]{25, 0}, new int[]{37, 0}, new int[]{58, 0}, new int[]{50, 41}, new int[]{35, 0}, new int[]{35, 0}, new int[]{51, 0}, new int[]{50, 0}, new int[]{11, 11}, new int[]{20, 20}, new int[]{35, 0}, new int[]{38, 0}, new int[]{30, 0}, new int[]{75, 0}, new int[]{24, 0}, new int[]{24, 0}, new int[]{20, 0}, new int[]{58, 0}, new int[]{37, 0}, new int[]{25, 38}, new int[]{37, 0}, new int[]{50, 0}, new int[]{40, 35}, new int[]{31, 0}, new int[]{28, 0}, new int[]{53, 0}, new int[]{53, 0}, new int[]{53, 0}, new int[]{44, 0}, new int[]{53, 0}, new int[]{53, 0}, new int[]{41, 0}, new int[]{53, 0}, new int[]{30, 0}, new int[]{38, 0}, new int[]{47, 0}, new int[]{63, 0}, new int[]{32, 0}, new int[]{22, 0}, new int[]{43, 0}, new int[]{36, 0}, new int[]{25, 0}, new int[]{25, 0}, new int[]{25, 0}, new int[]{50, 41}, new int[]{33, 48}, new int[]{18, 18}, new int[]{1, 0}, new int[]{24, 0}, new int[]{24, 39}, new int[]{25, 38}, new int[]{25, 38}, new int[]{33, 48}, new int[]{50, 41}, new int[]{34, 4}, new int[]{25, 3}, new int[]{35, 21}, new int[]{19, 3}, new int[]{18, 2}, new int[]{25, 6}, new int[]{35, 21}};
    }
}
