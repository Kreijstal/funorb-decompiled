/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OptionsDialog extends ResizableModalPanel implements ButtonListener {
    static long[] field_tb;
    private boolean field_nb;
    private TextButton[] field_vb;
    private ScreenDisplayMode[] field_V;
    private TextButton field_kb;
    private DropdownList field_zb;
    static String field_sb;
    private TextButton field_ub;
    static String field_rb;
    private boolean field_wb;
    private TextButton field_lb;
    private boolean field_yb;
    private TextButton field_mb;
    static String field_pb;
    private TextButton field_xb;
    private TextButton field_jb;
    static IntrusiveNodeHashTable field_qb;
    private GridContainer field_ob;

    final void updatePointer(UiComponent param0, int param1, int param2, int param3) {
        int var6 = 0;
        TextButton[] var5 = null;
        TextButton var7 = null;
        int var8 = 0;
        TextButton[] var9 = null;
        boolean stackIn_14_0 = false;
        int stackIn_15_1 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          super.updatePointer(param0, param1, param2, param3);
          if (ArchiveProvider.field_d) {
            param0.blur((byte) 29);
            var9 = this.field_vb;
            var5 = var9;
            for (var6 = 0; var9.length > var6; var6++) {
              var7 = var9[var6];
              if (var7.field_w) {
                var7.focusNext(0, (UiComponent) (this));
              }
            }
          }
          if (!this.field_wb &&
            !lc.a((byte) 112)) {
            this.close(param2 - 171);
            this.field_H.pushPanel(new OptionsDialog(this.field_H), 15637);
          }
          if (null != this.field_zb) {
            stackIn_14_0 = this.field_zb.isOpen(2);
            if (this.field_nb) {
              stackIn_15_1 = 0;
            } else {
              stackIn_15_1 = 1;
            }
            if ((stackIn_14_0 ? 1 : 0) == stackIn_15_1) {
              this.selectButton(this.field_lb, 0);
              this.field_nb = this.field_zb.isOpen(2);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_20_0 = var5_ref;
          stackIn_20_1 = new StringBuilder().append("kn.E(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static BinaryBitmapFont loadBinaryFont(ResourceArchive param0, int param1, boolean param2, int param3, ResourceArchive param4) {
        RuntimeException var5 = null;
        Object stackIn_4_0 = null;
        BinaryBitmapFont stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2) {
            OptionsDialog.releaseStatics(-104);
          }
          if (fc.a(-123, param0, param1, param3)) {
            stackIn_6_0 = ge.createBinaryFont(param4.getFile(param3, 26219, param1), 3417);
            return stackIn_6_0;
          }
          stackIn_4_0 = null;
          return (BinaryBitmapFont) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("kn.J(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    OptionsDialog(ModalPanelStack param0) {
        super(param0, 430, 254);
        int incrementValue$0 = 0;
        int var7_int = 0;
        boolean stackIn_31_1 = false;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        boolean stackIn_40_1 = false;
        int stackIn_48_0 = 0;
        Object stackIn_51_0;
        GridContainer stackIn_51_1;
        GridContainer stackIn_51_2;
        int stackIn_51_3;
        GridContainer stackIn_52_1 = null;
        GridContainer stackIn_52_2 = null;
        int stackIn_52_4 = 0;
        int stackIn_57_1 = 0;
        String stackIn_74_0 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        ScreenDisplayMode[] var3_ref_uj__ = null;
        int var4 = 0;
        int var5 = 0;
        String[] var5_ref_String__ = null;
        int var6_int = 0;
        String var6 = null;
        TextButton var6_ref = null;
        UiComponent var7 = null;
        ScreenDisplayMode var8 = null;
        String var10 = null;
        Object stackIn_51_0Lifetime1;
        GridContainer stackIn_51_1Lifetime1;
        GridContainer stackIn_51_2Lifetime1;
        GridContainer stackIn_52_1Lifetime1;
        GridContainer stackIn_52_2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var2_intLifetime1;
        int var3Lifetime2;
        try {
          this.field_V = aa.queryDisplayModes(fi.field_d, (byte) 77);
          if (this.field_V.length > 0) {
            for (var2_int = 0; var2_int < this.field_V.length; var2_int++) {
              if (null != this.field_V[var2_int]) {
                for (var3 = 1 + var2_int; this.field_V.length > var3; var3++) {
                  if (this.field_V[var3] != null &&
                    this.field_V[var2_int].field_g == this.field_V[var3].field_g &&
                    this.field_V[var2_int].field_e == this.field_V[var3].field_e) {
                    this.field_V[var3] = null;
                  }
                }
                if (ResizableModalPanel.field_Y != null &&
                  null != this.field_V[var2_int] &&
                  !ResizableModalPanel.field_Y.isSizeAllowed(this.field_V[var2_int].field_g, this.field_V[var2_int].field_e, -17969)) {
                  this.field_V[var2_int] = null;
                }
              }
            }
            var2_int = 0;
            for (var3Lifetime2 = 0; this.field_V.length > var3Lifetime2; var3Lifetime2++) {
              if (this.field_V[var3Lifetime2] != null) {
                var2_int++;
              }
            }
            var3_ref_uj__ = this.field_V;
            this.field_V = new ScreenDisplayMode[var2_int];
            var4 = 0;
            for (var5 = 0; var5 < var3_ref_uj__.length; var5++) {
              if (var3_ref_uj__[var5] != null) {
                incrementValue$0 = var4;
                var4++;
                this.field_V[incrementValue$0] = var3_ref_uj__[var5];
              }
            }
            pm.sortDisplayModes(this.field_V, -1);
          }
          stackIn_31_1 = !(0 >= this.field_V.length);
          this.field_yb = stackIn_31_1;
          stackIn_34_0 = (!ne.b(-22768)) ? 0 : 1;
          var2_intLifetime1 = stackIn_34_0;
          stackIn_37_0 = (var2_intLifetime1 == 0) ? 2 : 3;
          var3Lifetime1 = stackIn_37_0;
          stackIn_40_1 = !(lc.a((byte) 112));
          this.field_wb = stackIn_40_1;
          if (var2_intLifetime1 == 0) {
            if (null != ResizableModalPanel.field_Y) {
              stackIn_48_0 = (ResizableModalPanel.field_Y.b(false)) ? 1 : 0;
            } else {
              stackIn_48_0 = 0;
            }
          } else {
            stackIn_48_0 = 0;
          }
          boolean decompiledFrameRemainder0 = true;
          var4Lifetime1 = stackIn_48_0;
          stackIn_51_0 = this;
          stackIn_51_1 = null;
          stackIn_51_2 = null;
          stackIn_51_3 = 10;
          if (var2_intLifetime1 == 0) {
            stackIn_51_0Lifetime1 = this;
            stackIn_51_1Lifetime1 = null;
            stackIn_51_2Lifetime1 = null;
            if (var4Lifetime1 == 0) {
              stackIn_52_1 = null;
              stackIn_52_2 = null;
              stackIn_52_4 = 75;
              decompiledFrameRemainder0 = false;
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_52_1Lifetime1 = null;
            stackIn_52_2Lifetime1 = null;
            stackIn_52_4 = 58;
          }
          this.field_ob = new GridContainer(stackIn_51_3, stackIn_52_4, 410, 105, (WidgetPainter) null, var3Lifetime1, 1);
          this.field_ob.field_R = 83;
          this.field_ob.setSpacing(0, 5, 5);
          this.addChild(-123, this.field_ob);
          this.field_jb = this.addIconButton(-1, ci.field_b, oa.field_d, (UiListener) (this));
          if (var2_intLifetime1 != 0) {
            this.field_mb = this.addIconButton(-1, fo.field_f, MusicPatch.field_k, (UiListener) (this));
          }
          this.field_lb = this.addIconButton(-1, oj.field_g, qj.field_j, (UiListener) (this));
          if (var2_intLifetime1 != 0) {
            stackIn_57_1 = 3;
          } else {
            stackIn_57_1 = 2;
          }
          this.field_vb = new TextButton[stackIn_57_1];
          this.field_vb[1] = this.field_lb;
          if (var2_intLifetime1 != 0) {
            this.field_vb[2] = this.field_mb;
          }
          this.field_vb[0] = this.field_jb;
          if (this.field_yb &&
            var2_intLifetime1 != 0) {
            var5_ref_String__ = new String[this.field_V.length];
            var6_int = -1 + var5_ref_String__.length;
            for (var7_int = 0; var7_int < this.field_V.length; var7_int++) {
              var8 = this.field_V[var7_int];
              if (null != ProxySocketConnector.field_m &&
                ResizableModalPanel.field_Y.field_m == var8.field_g &&
                ResizableModalPanel.field_Y.field_c == var8.field_e) {
                var6_int = var7_int;
              }
              var5_ref_String__[var7_int] = var8.field_g + "<times>" + var8.field_e;
            }
            this.field_zb = new DropdownList(var5_ref_String__, var6_int, 150);
            this.field_zb.setBounds(18, this.field_lb.field_k + (this.field_lb.field_j + (this.field_ob.field_j - 19)), 126, this.field_ob.field_n + this.field_lb.field_n, -54);
            this.field_B.addFirst((IntrusiveNode) (this.field_zb), (byte) -58);
          }
          this.field_kb = this.addButton((UiListener) (this), lm.field_a, 410);
          var5Lifetime1 = this.field_kb.field_v / 2 + this.field_kb.field_n;
          this.field_kb.field_v = 150;
          this.field_kb.field_n = var5Lifetime1 - (20 + this.field_kb.field_v);
          this.field_ub = this.addButton((UiListener) (this), hj.field_e, 410);
          this.field_ub.field_B = false;
          this.field_ub.field_v = this.field_kb.field_v;
          this.field_ub.field_n = var5Lifetime1 + 20;
          if (var2_intLifetime1 != 0 ||
            var4Lifetime1 != 0) {
            if (var2_intLifetime1 != 0) {
              stackIn_74_0 = on.field_b;
            } else {
              stackIn_74_0 = tm.field_c;
            }
            var10 = stackIn_74_0;
            var6 = var10;
            var7 = new UiComponent(var10, (UiListener) null);
            var7.field_j = 163;
            var7.field_k = 80;
            var7.field_v = this.field_v;
            var7.field_n = 0;
            var7.field_r = (WidgetPainter) ((Object) new TextWidgetPainter(ia.field_c, 20, 20, 0, 10, 16777215, -1, 0, 0, 16, 0, 0, true));
            this.addChild(-96, var7);
          }
          this.field_nb = false;
          var6_ref = this.getDefaultButton(2);
          if (var6_ref != null) {
            var6_ref.field_z = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_80_0 = var2;
          stackIn_80_1 = new StringBuilder().append("kn.<init>(");
          if (param0 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_80_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, byte param3) {
        LoginMethod.field_a = param2;
        pn.field_d = param0;
        wm.field_I = param1;
        if (param3 != -43) {
          field_tb = (long[]) null;
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != 3) {
          return;
        }
        field_tb = null;
        field_qb = null;
        field_sb = null;
        field_rb = null;
        field_pb = null;
    }

    final static void paintCanvasNow(java.awt.Canvas param0, byte param1, int param2, int param3) {
        java.awt.Graphics var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        try {
          try {
            var4 = param0.getGraphics();
            ce.field_m.a(param3, var4, 0, param2);
            var4.dispose();
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4_ref = (Exception) (Object) decompiledCaughtException;
            param0.repaint();
          }
          if (param1 >= -87) {
            field_pb = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_8_0 = var4_ref2;
          stackIn_8_1 = new StringBuilder().append("kn.H(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final TextButton addButton(UiListener param0, String param1, int param2) {
        TextButton discarded$1 = null;
        TextButton var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        TextButton stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 410) {
            discarded$1 = this.getDefaultButton(-10);
          }
          var4 = new TextButton(param1, param0);
          var4.field_r = (WidgetPainter) ((Object) new MenuButtonPainter());
          var5 = -46 + this.field_k;
          var4.setBounds(30, var5, -30 + this.field_v, 15, -92);
          this.addChild(param2 - 526, var4);
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("kn.T(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, boolean param2, boolean param3) {
        int var4_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        SceneWidget var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        jg var9 = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (jo.field_e < DiskCacheRequest.field_F) {
            jo.field_e = jo.field_e + 1;
          }
          if (TextLine.field_k != ce.field_m.field_m) {
            Scrollbar.field_N = Scrollbar.field_N + (ce.field_m.field_m - TextLine.field_k);
            TextLine.field_k = ce.field_m.field_m;
          }
          if (jo.field_e <= 0) {
            return;
          }
          ed.j(120);
          IntKeyLookup.field_g.updateInputFullScreen(param3, (byte) 60);
          if (param2) {
            field_tb = (long[]) null;
          }
          if (null != AccountRegistrationPanel.field_U) {
            if (!wh.field_g) {
              AccountRegistrationPanel.field_U = null;
            } else {
              AccountRegistrationPanel.field_U.processPointerInput(IntKeyLookup.field_g.field_V, IntKeyLookup.field_g.field_nb, param3, (byte) -104);
            }
          }
          for (var4_int = 0; var4_int < 5; var4_int++) {
            var5 = mn.field_s[var4_int];
            if (var5 != null) {
              if (var5.field_U != 0) {
                ko.a(var4_int, var5, (byte) -86);
              }
              var6 = ReflectionCheckRequest.a((byte) 119, var4_int);
              ia.field_b[var4_int].field_W = ArchiveProvider.field_a[var6];
              IntrusiveDequeCursor.field_f[var4_int].field_rb = cf.field_b[var6];
            }
          }
          if (g.field_g.field_U != 0) {
            db.field_a = new ChatInputWidget(g.field_g.field_V, g.field_g.field_nb, g.field_g.field_x, g.field_g.field_I, param0, mf.field_d, SectorCacheStore.field_l, wj.field_b, IntrusiveNode.field_c, ec.field_g, nj.field_d, (String) null, 0L);
          }
          var9 = f.a(16711422, param1, ImageProducerRasterBuffer.field_r, SceneTextInput.field_Gb);
          if (var9 != null) {
            EmptyPainter.a(0, var9);
          }
          var8 = GrowableIntList.b(0);
          if (var8 != null) {
            TextLayout.field_c = var8;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var4), "kn.R(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void applySelectedOption(int param0) {
        int var2;
        int var3;
        int var2Lifetime1;
        int var2Lifetime2;
        boolean decompiledFrameRemainder0 = true;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        if (this.field_jb == this.field_xb) {
          u.b(6);
          ArchiveProvider.a(-30267);
        } else {
          if (this.field_xb != this.field_mb) {
            if (this.field_xb != this.field_lb) {
              this.field_ub.field_B = false;
              var2 = -94 % ((-8 - param0) / 49);
              decompiledFrameRemainder0 = false;
            }
            else {
              if (this.field_zb != null) {
                var2Lifetime2 = this.field_zb.getSelectedIndex((byte) 37);
                if (var2Lifetime2 >= 0) {
                  ResizableModalPanel.field_Y.setWindowedSize(this.field_V[var2Lifetime2].field_e, this.field_V[var2Lifetime2].field_g, (byte) -64);
                }
              }
              GzipDecoder.a(true, 5);
              this.field_H.pushPanel(new bj(this.field_H), 15637);
            }
          } else {
            u.b(6);
            LinkButtonPainter.a((byte) -127);
          }
        }
        if (decompiledFrameRemainder0) {
          this.field_ub.field_B = false;
          var2Lifetime1 = -94 % ((-8 - param0) / 49);
        }

    }

    final static void g(boolean param0) {
        if (param0) {
          ResourceArchive var2 = (ResourceArchive) null;
          OptionsDialog.loadBinaryFont((ResourceArchive) null, -48, false, -99, (ResourceArchive) null);
        }
        BufferedSocket.field_o = 0;
    }

    public final void onButtonActivated(boolean param0, int param1, int param2, int param3, TextButton param4) {
        int stackIn_12_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param4 != this.field_kb) {
            if (param4 == this.field_ub) {
              this.applySelectedOption(46);
            } else {
              if (param4 == this.field_jb) {
                this.selectButton(param4, 0);
              } else {
                if (this.field_mb == param4) {
                  this.selectButton(param4, 0);
                } else {
                  if (null != this.field_zb) {
                    stackIn_12_0 = (this.field_zb.field_w) ? 1 : 0;
                  } else {
                    stackIn_12_0 = 0;
                  }
                  var6_int = stackIn_12_0;
                  if (var6_int == 0 &&
                    param4 == this.field_lb) {
                    if (!this.field_yb) {
                      this.field_H.pushPanel(new qn(this.field_H, oo.field_C), 15637);
                    } else {
                      if (ah.field_c > 0) {
                        this.selectButton(param4, 0);
                      } else {
                        this.field_H.pushPanel(new gf(this.field_H), 15637);
                      }
                    }
                  }
                }
              }
            }
          } else {
            this.close(-1);
          }
          if (!param0) {
            this.field_xb = (TextButton) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_28_0 = var6;
          stackIn_28_1 = new StringBuilder().append("kn.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    private final void clearButtonStates(int param0) {
        int var3 = 0;
        TextButton var4 = null;
        int var5 = ArcanistsMulti.field_G ? 1 : 0;
        TextButton[] var6 = this.field_vb;
        TextButton[] var2 = var6;
        if (param0 > -95) {
          return;
        }
        for (var3 = 0; var3 < var6.length; var3++) {
          var4 = var6[var3];
          var4.field_z = this.field_xb == var4 ? true : false;
        }
    }

    private final TextButton addIconButton(int param0, String param1, IndexedSprite[] param2, UiListener param3) {
        TextButton var5 = null;
        RuntimeException var5_ref = null;
        GridContainer var6 = null;
        TextButton var7 = null;
        TextButton stackIn_2_0 = null;
        TextButton stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new TextButton(param1, param3);
          var5.field_r = (WidgetPainter) ((Object) new IconButtonPainter(param2));
          if (param0 != -1) {
            stackIn_2_0 = (TextButton) null;
            return stackIn_2_0;
          }
          var6 = this.field_ob;
          var7 = var5;
          var6.setCell(var7, param0 ^ -123, var6.field_R);
          this.field_ob.refreshLayout((byte) 64);
          stackIn_4_0 = var5;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_7_0 = var5_ref;
          stackIn_7_1 = new StringBuilder().append("kn.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final TextButton getDefaultButton(int param0) {
        if (param0 != 2) {
          return (TextButton) null;
        }
        if (null != ProxySocketConnector.field_m) {
          return this.field_lb;
        }
        if (null != ResizableModalPanel.field_Y &&
          ResizableModalPanel.field_Y.field_l &&
          this.field_mb != null) {
          return this.field_mb;
        }
        return this.field_jb;
    }

    private final void close(int param0) {
        if (!this.field_G) {
          return;
        }
        this.field_G = false;
        if (param0 != -1) {
          this.field_zb = (DropdownList) null;
        }
    }

    final boolean handleKeyInput(UiComponent param0, byte param1, char param2, int param3) {
        boolean stackIn_74_0 = false;
        Object stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var5 = null;
          if (this.field_jb.isFocused(-2116)) {
            var5 = this.field_jb;
          } else {
            if (this.field_mb != null &&
              this.field_mb.isFocused(-2116)) {
              var5 = this.field_mb;
            } else {
              if (this.field_lb.isFocused(-2116)) {
                var5 = this.field_lb;
              } else {
                if (!this.field_kb.isFocused(-2116)) {
                  if (this.field_ub.isFocused(-2116)) {
                    var5 = this.field_ub;
                  } else {
                    if (this.field_jb.field_z) {
                      var5 = this.field_jb;
                    } else {
                      if (null != this.field_mb &&
                        this.field_mb.field_z) {
                        var5 = this.field_mb;
                      } else {
                        if (this.field_lb.field_z) {
                          var5 = this.field_lb;
                        }
                      }
                    }
                  }
                } else {
                  var5 = this.field_kb;
                }
              }
            }
          }
          if (param1 >= -120) {
            this.field_xb = (TextButton) null;
          }
          var6 = param3;
          switch (var6) {
            case 97:
              if (this.field_jb == var5) {
                if (null == this.field_mb) {
                  this.field_lb.focusNext(0, (UiComponent) (this));
                } else {
                  this.field_mb.focusNext(0, (UiComponent) (this));
                }
                return true;
              }
              if (this.field_mb == var5) {
                this.field_lb.focusNext(0, (UiComponent) (this));
                return true;
              }
              if (this.field_kb == var5 &&
                this.field_ub.field_B) {
                this.field_ub.focusNext(0, (UiComponent) (this));
                return true;
              }
              break;
            case 98:
              if (this.field_kb == var5) {
                this.field_jb.focusNext(0, (UiComponent) (this));
                return true;
              }
              if (this.field_ub == var5) {
                this.field_lb.focusNext(0, (UiComponent) (this));
                return true;
              }
              break;
            case 99:
              if (this.field_jb != var5 &&
                var5 != this.field_mb) {
                if (this.field_lb != var5) {
                  break;
                }
                if (!this.field_ub.field_B) {
                  this.field_kb.focusNext(0, (UiComponent) (this));
                } else {
                  this.field_ub.focusNext(0, (UiComponent) (this));
                }
                return true;
              }
              this.field_kb.focusNext(0, (UiComponent) (this));
              return true;
            case 96:
              if (var5 == this.field_lb) {
                if (this.field_mb != null) {
                  this.field_mb.focusNext(0, (UiComponent) (this));
                  return true;
                }
                this.field_jb.focusNext(0, (UiComponent) (this));
                return true;
              }
              if (var5 == this.field_mb) {
                this.field_jb.focusNext(0, (UiComponent) (this));
                return true;
              }
              if (this.field_ub == var5) {
                this.field_kb.focusNext(0, (UiComponent) (this));
                return true;
              }
              break;
            default:
              break;
          }
          stackIn_74_0 = super.handleKeyInput(param0, (byte) -122, param2, param3);
          return stackIn_74_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_77_0 = var5;
          stackIn_77_1 = new StringBuilder().append("kn.N(");
          if (param0 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          throw aa.wrapException((Throwable) (stackIn_77_0), ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void selectButton(TextButton param0, int param1) {
        TextButton var3 = null;
        int var4 = 0;
        ScreenDisplayMode var5 = null;
        TextButton stackIn_2_0 = null;
        boolean stackIn_3_1 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          this.field_xb = param0;
          param0.focusNext(param1, (UiComponent) (this));
          var3 = this.getDefaultButton(2);
          stackIn_2_0 = this.field_ub;
          stackIn_3_1 = (var3 != param0);
          stackIn_2_0.field_B = stackIn_3_1;
          if (param0 == this.field_lb) {
            if (param0 == var3) {
              if (this.field_zb != null) {
                var4 = this.field_zb.getSelectedIndex((byte) 37);
                var5 = this.field_V[var4];
                if (var5.field_g == ResizableModalPanel.field_Y.field_m &&
                  var5.field_e == ResizableModalPanel.field_Y.field_c) {
                  this.clearButtonStates(-121);
                  return;
                }
                this.field_ub.field_B = true;
                this.clearButtonStates(-121);
              } else {
                this.clearButtonStates(-121);
              }
            } else {
              this.clearButtonStates(-121);
            }
          } else {
            this.clearButtonStates(-121);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("kn.V(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_sb = "Seriously offensive language";
        field_rb = "Go Back";
        field_tb = new long[32];
        field_pb = "Steep slopes and rugged terrain. Stay here too long and the volcanoes will erupt!";
    }
}
