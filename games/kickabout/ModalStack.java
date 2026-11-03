/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ModalStack extends SingleChildContainer {
    static ef field_C;
    private IntrusiveDeque field_A;
    static String field_B;

    public ModalStack() {
        super(0, 0, il.field_b, im.field_Ab, (WidgetPainter) null, (UiListener) null);
        this.field_A = new IntrusiveDeque();
    }

    final UiWidget a(int param0) {
        IntrusiveDequeCursor var2 = null;
        RuntimeException var2_ref = null;
        ModalPanel var3 = null;
        int var4 = 0;
        UiWidget stackIn_10_0 = null;
        Object stackIn_13_0 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          var2 = new IntrusiveDequeCursor(this.field_A);
          if (param0 != 0) {
            this.field_A = (IntrusiveDeque) null;
          }
          var3 = (ModalPanel) (var2.a((byte) 98));
          while (var3 != null) {
            if (var3.field_C) {
              stackIn_10_0 = var3.findFocusedChild(false);
              return stackIn_10_0;
            }
            var3 = (ModalPanel) (var2.a(param0 ^ 0));
            if (var4 == 0) {
              continue;
            }
            break;
          }
          stackIn_13_0 = null;
          return (UiWidget) (stackIn_13_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var2_ref), "se.H(" + param0 + ')');
        }
    }

    final static Sprite[] a(ResourceArchive param0, int param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        Sprite[] stackIn_1_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param0.getGroupId(param2, -1);
          var5 = -67 % ((-81 - param1) / 38);
          var6 = param0.getFileId((byte) -102, param3, var4_int);
          stackIn_1_0 = fa.a(var4_int, (byte) -89, var6, param0);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_5_0 = var4;
          stackIn_5_1 = new StringBuilder().append("se.J(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static gg a(boolean param0, int param1, int param2) {
        ScrollPane stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        boolean stackIn_5_2 = false;
        gg stackIn_9_0 = null;
        UiLayoutNode stackIn_36_0 = null;
        String stackIn_37_1 = null;
        UiLayoutNode stackIn_40_0 = null;
        String stackIn_41_1 = null;
        int stackIn_45_0 = 0;
        Object stackIn_86_0 = null;
        Object stackIn_103_0 = null;
        RuntimeException decompiledCaughtException = null;
        gg stackOut_8_0;
        int var3_int = 0;
        RuntimeException var3 = null;
        IntrusiveDeque var4 = null;
        Object var5 = null;
        Object var6 = null;
        gg var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        ChatLine var17 = null;
        String var18 = null;
        int var19 = 0;
        ChatLine var17Lifetime1;
        String var18Lifetime1;
        var19 = Kickabout.field_G;
        try {
          stackIn_4_0 = ei.field_d.field_Cb;
          stackIn_4_1 = (sh.field_c * 3 + 6) * param2;
          stackIn_5_2 = (ei.field_d.field_Cb == ig.field_f);
          boolean decompiledFrameRemainder0 = true;
          var3_int = ((ScrollPane) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_5_2, param0, 2, false, param1 + sh.field_c) ? 1 : 0;
          var4 = ei.field_d.field_yb.field_jb;
          var5 = null;
          if (ts.field_d == 2) {
            TriangleMesh.field_R.field_lb = true;
            du.field_f.field_E = LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, uf.field_d, new String[]{BufferedSocket.field_h});
            ei.field_d.field_Cb.field_zb.field_E = null;
            var6 = null;
            var7 = (gg) (var4.g(24009));
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (var7 == null))) {
              var8 = 0;
              stackOut_8_0 = var7;
              stackIn_86_0 = stackOut_8_0;
              stackIn_9_0 = stackOut_8_0;
              if (var19 == 0) {
                if (stackIn_9_0.field_jb == null) {
                  var7.field_Bb = new UiLayoutNode(0L, mp.field_f);
                  var7.addChild((byte) -112, var7.field_Bb);
                  var7.field_Ab = new UiLayoutNode(0L, AuctionSettingsDialog.field_J);
                  var7.addChild((byte) -122, var7.field_Ab);
                  var7.field_Fb = new UiLayoutNode(0L, mp.field_f);
                  var7.addChild((byte) -117, var7.field_Fb);
                  var7.field_Ab.field_A = 2;
                  var7.invalidateChildren(false);
                  var8 = 1;
                }
                var7.field_q = ei.field_d.field_yb.field_q;
                var9 = 0;
                if (null != var7.field_zb) {
                  if (var7.field_zb != BufferedSocket.field_h) {
                    var10 = 13421568;
                    var11 = 16777062;
                  } else {
                    var11 = 6750054;
                    var10 = 52224;
                  }
                } else {
                  var10 = 13369344;
                  var11 = 16737894;
                }
                var12 = 0;
                if (var7.field_Eb != null &&
                  !var7.field_Eb.equals("")) {
                  var7.field_Fb.field_ub = var11;
                  var7.field_Fb.field_N = DirectByteStorage.field_n;
                  var12 = 1;
                  var7.field_Fb.a(true, 3 + DirectByteStorage.field_n.field_o, 0, var9, sh.field_c);
                }
                var7.field_Ab.field_H = var11;
                var7.field_Bb.field_H = var11;
                var7.field_Ab.field_ub = var11;
                var7.field_Bb.field_ub = var11;
                var7.field_Ab.field_y = var10;
                var7.field_Bb.field_y = var10;
                var7.field_Ab.field_ab = var11;
                var7.field_Bb.field_ab = var11;
                var13 = 0;
                var14 = var7.field_q - 82;
                if (var12 != 0) {
                  var13 = 3 + DirectByteStorage.field_n.field_o;
                  var14 = var14 - var13;
                }
                stackIn_36_0 = var7.field_Bb;
                if (var14 > 0) {
                  stackIn_37_1 = BitmapFont.a(var7.field_Bb.field_X, var7.field_Gb, var14);
                } else {
                  stackIn_37_1 = var7.field_Gb;
                }
                stackIn_36_0.field_E = stackIn_37_1;
                var7.field_Bb.a(true, var14, var13, var9, sh.field_c);
                stackIn_40_0 = var7.field_Ab;
                if (var7.field_zb == null) {
                  stackIn_41_1 = TextInputWidget.field_K;
                } else {
                  stackIn_41_1 = var7.field_zb;
                }
                stackIn_40_0.field_E = stackIn_41_1;
                var7.field_Ab.a(true, 80, var7.field_q - 80, var9, sh.field_c);
                stackIn_45_0 = (var7.field_Bb.field_E.equals(var7.field_Gb)) ? 0 : 1;
                var15 = stackIn_45_0;
                var9 = var9 + sh.field_c;
                if (var3_int == 0) {
                  var7.field_L = -var7.field_mb + var9;
                }
                if (var8 != 0) {
                  ei.field_d.field_yb.a(true, 2, var7, (UiLayoutNode) (var6));
                }
                var6 = var7;
                if (var7.field_Fb != null &&
                  var7.field_Fb.field_gb) {
                  UrlRequest.field_e = var7.field_Eb;
                } else if (var7.field_sb != 0) {
                  var16 = var7.field_Gb;
                  BytePlusOneCommand.a(var7, false, ei.field_d.field_Cb, -1, var16, (int[]) null, 0L, (String) null, -1);
                  var5 = var7;
                  if (null != var7.field_zb &&
                    !BufferedCacheFile.a(118, TextButton.field_v.field_k) &&
                    !PacketBuffer.field_l) {
                    if (!WriteIntegersCommand.field_C) {
                      var17 = TextButton.field_v;
                      var18 = LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, wp.field_a, new String[]{var16});
                      var17.field_j.addItem(param1 ^ 2, 8, var18);
                    }
                    var17Lifetime1 = TextButton.field_v;
                    var18Lifetime1 = LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, ee.field_c, new String[]{var16});
                    var17Lifetime1.field_j.addItem(0, 18, var18Lifetime1);
                  }
                } else {
                  if (var7.field_Bb.field_gb &&
                    var15 != 0) {
                    UrlRequest.field_e = var7.field_Gb;
                  }
                }
                var7 = (gg) (var4.c(33));
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              stackIn_86_0 = ei.field_d.field_Eb;
            }
            if (((UiLayoutNode) (stackIn_86_0)).field_sb != 0) {
              k.field_m = new HoverTooltip(ei.field_d.field_Eb.field_F, ei.field_d.field_Eb.field_T, ei.field_d.field_Eb.field_q, ei.field_d.field_Eb.field_mb, MainMenuScreen.field_G, StrongCacheEntry.field_u, ConsoleEvaluationException.field_e, ConsoleEvaluationException.field_e);
              fs.field_b = 0;
            }
            if (ei.field_d.field_zb.field_sb != 0) {
              k.field_m = new HoverTooltip(ei.field_d.field_zb.field_F, ei.field_d.field_zb.field_T, ei.field_d.field_zb.field_q, ei.field_d.field_zb.field_mb, TabStrip.field_yb, StrongCacheEntry.field_u, ConsoleEvaluationException.field_e, ConsoleEvaluationException.field_e);
              fs.field_b = 1;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            du.field_f.field_E = uf.field_a;
            TriangleMesh.field_R.field_lb = false;
            if (ts.field_d == 1) {
              ei.field_d.field_Cb.field_zb.field_E = TutorialChoiceDialog.field_I;
              if (var19 != 0) {
                ei.field_d.field_Cb.field_zb.field_E = CheckboxLabelWidget.field_yb;
              }
            } else {
              ei.field_d.field_Cb.field_zb.field_E = CheckboxLabelWidget.field_yb;
            }
            hl.a(true, ei.field_d.field_yb);
          }
          stackIn_103_0 = var5;
          return (gg) (stackIn_103_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var3), "se.O(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        IntrusiveDequeCursor var5 = null;
        UiWidget var6 = null;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var7 = Kickabout.field_G;
        try {
          if (param1 != 65) {
            return;
          }
          if (null != this.field_r) {
            this.field_r.a(113, true, param3, (UiWidget) (this), param2);
          }
          var5 = new IntrusiveDequeCursor(this.field_A);
          var6 = (UiWidget) (var5.b(0));
          while (null != var6) {
            var6.a(param0, 65, param2 + this.field_t, this.field_g + param3);
            var6 = (UiWidget) (var5.b((byte) 46));
            if (var7 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var5_ref), "se.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final ModalPanel h(byte param0) {
        IntrusiveDequeCursor var2 = null;
        RuntimeException var2_ref = null;
        ModalPanel var3 = null;
        int var4 = 0;
        ModalPanel stackIn_3_0 = null;
        ModalPanel stackIn_8_0 = null;
        Object stackIn_11_0 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          if (param0 != 18) {
            stackIn_3_0 = (ModalPanel) null;
            return stackIn_3_0;
          }
          var2 = new IntrusiveDequeCursor(this.field_A);
          var3 = (ModalPanel) (var2.a((byte) 70));
          while (null != var3) {
            if (var3.field_C) {
              stackIn_8_0 = var3;
              return stackIn_8_0;
            }
            var3 = (ModalPanel) (var2.a(0));
            if (var4 == 0) {
              continue;
            }
            break;
          }
          stackIn_11_0 = null;
          return (ModalPanel) (stackIn_11_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var2_ref), "se.Q(" + param0 + ')');
        }
    }

    final void l(int param0) {
        RuntimeException runtimeException = null;
        IntrusiveDequeCursor var2 = null;
        ModalPanel var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          var2 = new IntrusiveDequeCursor(this.field_A);
          if (param0 != 4508) {
            return;
          }
          var3 = (ModalPanel) (var2.a((byte) -107));
          while (null != var3) {
            if (var4 != 0) {
              return;
            }
            if (var3.a(param0 - 4521)) {
              var3.c((byte) -109);
            }
            var3 = (ModalPanel) (var2.a(0));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "se.L(" + param0 + ')');
        }
    }

    final void a(UiWidget param0, boolean param1) {
        ModalPanel var3 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (!(param0 instanceof ModalPanel)) {
            throw new IllegalArgumentException();
          }
          var3 = (ModalPanel) (param0);
          this.field_A.a(0, var3);
          if (param1) {
            this.field_A = (IntrusiveDeque) null;
          }
          var3.field_C = true;
          var3.a((UiWidget) (this), 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("se.K(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, java.awt.Component param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          param1.addMouseListener(ProxyAuthenticationRequiredException.field_e);
          if (param0 != 15282) {
            ModalStack.m(110);
          }
          param1.addMouseMotionListener(ProxyAuthenticationRequiredException.field_e);
          param1.addFocusListener(ProxyAuthenticationRequiredException.field_e);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("se.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void k(int param0) {
        RuntimeException runtimeException = null;
        IntrusiveDequeCursor var2 = null;
        ModalPanel var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          var2 = new IntrusiveDequeCursor(this.field_A);
          if (param0 <= 82) {
            this.h((byte) 110);
          }
          var3 = (ModalPanel) (var2.a((byte) 110));
          while (null != var3) {
            var3.field_C = false;
            var3 = (ModalPanel) (var2.a(0));
            if (var4 != 0) {
              return;
            }
          }
          this.field_z = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "se.N(" + param0 + ')');
        }
    }

    public static void m(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 != -1) {
            field_C = (ef) null;
          }
          field_C = null;
          field_B = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var1), "se.SA(" + param0 + ')');
        }
    }

    final static boolean a(byte param0, char param1) {
        RuntimeException var2 = null;
        boolean stackIn_16_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -108) {
            ModalStack.a(true, 64, 120);
          }
          stackIn_16_0 = ((!(65 > param1) &&
            !(param1 > 90)) ||
            (!(param1 < 97) &&
            !(param1 > 122)));
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var2), "se.M(" + param0 + ',' + param1 + ')');
        }
    }

    final void n(int param0) {
        IntrusiveDequeCursor var2 = null;
        ModalPanel var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var4 = Kickabout.field_G;
        try {
          if (param0 != 2) {
            ModalStack.a((byte) 111, '\007');
          }
          var2 = new IntrusiveDequeCursor(this.field_A);
          var3 = (ModalPanel) (var2.a((byte) 107));
          while (null != var3) {
            if (var4 != 0) {
              return;
            }
            if (var3.k(-1)) {
              var3.c((byte) -109);
            }
            var3 = (ModalPanel) (var2.a(0));
          }
          this.field_z = (UiWidget) ((Object) this.h((byte) 18));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var2_ref), "se.RA(" + param0 + ')');
        }
    }

    static {
        field_B = "That name is not available";
    }
}
