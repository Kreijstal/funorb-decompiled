/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ProgressMessageDialog extends ContentTransitionDialog implements WidgetActivationListener {
    static IntrusiveDeque field_vb;
    static String field_Eb;
    static int[] field_sb;
    private boolean field_zb;
    static String[] field_ub;
    static RgbSprite field_rb;
    static RgbSprite field_xb;
    static int[] field_Ab;
    private BitmapFont field_Fb;
    private boolean field_Cb;
    private StripedProgressWidget field_wb;
    static RgbSprite field_Bb;
    private boolean field_yb;
    static int field_Db;
    private boolean field_tb;

    final static void l(int param0) {
        MusicPatchPcmStream.field_t = new String[TextHotspotBounds.field_j];
        MusicPatchPcmStream.field_t[5] = sa.field_f;
        MusicPatchPcmStream.field_t[11] = GuestPlayConfirmationForm.field_N;
        MusicPatchPcmStream.field_t[17] = fl.field_s;
        MusicPatchPcmStream.field_t[6] = SingleChildWidgetContainer.field_E;
        MusicPatchPcmStream.field_t[20] = ProxySocketConnector.field_j;
        MusicPatchPcmStream.field_t[9] = sj.field_f;
        MusicPatchPcmStream.field_t[4] = BirthDateValidator.field_h;
        MusicPatchPcmStream.field_t[19] = SingleChildWidgetContainer.field_K;
        MusicPatchPcmStream.field_t[15] = va.field_e;
        if (param0 == 6) {
          MusicPatchPcmStream.field_t[21] = le.field_b;
          MusicPatchPcmStream.field_t[7] = SecondaryNodeDequeIterator.field_e;
          MusicPatchPcmStream.field_t[18] = SingleChildWidgetContainer.field_J;
          MusicPatchPcmStream.field_t[16] = InteractiveWidget.field_G;
          MusicPatchPcmStream.field_t[13] = ProxyAuthenticationRequiredException.field_c;
          return;
        }
        field_Eb = (String) null;
        MusicPatchPcmStream.field_t[21] = le.field_b;
        MusicPatchPcmStream.field_t[7] = SecondaryNodeDequeIterator.field_e;
        MusicPatchPcmStream.field_t[18] = SingleChildWidgetContainer.field_J;
        MusicPatchPcmStream.field_t[16] = InteractiveWidget.field_G;
        MusicPatchPcmStream.field_t[13] = ProxyAuthenticationRequiredException.field_c;
    }

    ProgressMessageDialog(ModalDialogHost param0, BitmapFont param1, String param2, boolean param3, boolean param4) {
        super(param0, new DialogMessagePane((ProgressMessageDialog) null, param1, param2), 77, 10, 10);
        try {
          this.field_yb = false;
          this.field_zb = param3 ? true : false;
          this.field_Fb = param1;
          this.field_Cb = param4 ? true : false;
          this.field_tb = false;
          this.field_wb = new StripedProgressWidget(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_wb.field_W = true;
          this.addChild(this.field_wb, 95);
        } catch (RuntimeException runtimeException) {
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) runtimeException), "vn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void closeDialog(byte param0) {
        int var2 = 0;
        int var2Lifetime1;
        int var2Lifetime2;
        if (!this.field_P) {
          return;
        }
        this.field_P = false;
        if (this.field_zb) {
          ProgressMessageDialog.m(10);
          var2 = -90 % ((param0 + 67) / 41);
          return;
        }
        if (this.field_Cb) {
          ci.j(-73);
          var2Lifetime1 = -90 % ((param0 + 67) / 41);
          return;
        }
        var2Lifetime2 = -90 % ((param0 + 67) / 41);
    }

    final boolean handleKey(char param0, int param1, int param2, UiWidget param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -1) {
            this.field_zb = true;
          }
          if (13 != param1) {
            stackIn_7_0 = super.handleKey(param0, param1, -1, param3);
            return stackIn_7_0;
          }
          this.closeDialog((byte) -115);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("vn.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void showConnectionFailure(int param0) {
        this.field_wb.setColours(2121792, 15016, 4210752);
        DialogMessagePane var2 = new DialogMessagePane(this, this.field_Fb, gg.field_q);
        var2.addActionButton(15, 87, DiskArchiveRequest.field_y);
        if (param0 == 24528) {
          this.replaceContent(var2, 127);
          return;
        }
        field_sb = (int[]) null;
        this.replaceContent(var2, 127);
    }

    final void showResult(int param0, String param1, byte param2) {
        boolean stackIn_7_1 = false;
        DialogMessagePane stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        String stackIn_16_3;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        DialogMessagePane var6 = null;
        var5 = Chess.field_G;
        try {
          if (this.field_yb) {
            return;
          }
          stackIn_7_1 = (param0 == 256);
          this.field_tb = stackIn_7_1;
          this.field_yb = true;
          this.field_wb.setColours(8405024, 15016, 4210752);
          if (param2 <= 20) {
            return;
          }
          var6 = new DialogMessagePane(this, this.field_Fb, param1);
          if (param0 != 5) {
            if (256 != param0) {
              stackIn_15_0 = var6;
              stackIn_15_1 = -1;
              stackIn_15_2 = 113;
              if (this.field_zb) {
                stackIn_16_3 = DefaultTextWidgetRenderer.field_f;
              } else {
                stackIn_16_3 = GameAppletShell.field_k;
              }
              ((DialogMessagePane) (Object) stackIn_15_0).addActionButton(stackIn_15_1, stackIn_15_2, stackIn_16_3);
            } else {
              var6.addListenerButton((byte) -114, (WidgetEventListener) (this), DefaultTextWidgetRenderer.field_f);
            }
          } else {
            var6.addActionButton(11, 29, PcmOutputWorker.field_a);
            var6.addActionButton(17, 62, HuffmanCodec.field_b);
          }
          if (param0 != 3) {
            if (param0 != 4) {
              if (param0 != 6) {
                if (param0 == 9) {
                  var6.addListenerButton((byte) -114, (WidgetEventListener) (this), rn.field_c);
                }
              } else {
                var6.addActionButton(9, 31, gg.field_e);
              }
            } else {
              var6.addActionButton(8, 101, SectorCacheStore.field_f);
            }
          } else {
            var6.addActionButton(7, 81, ki.field_Q);
          }
          this.replaceContent(var6, 70);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_29_0 = var4;
          stackIn_29_1 = new StringBuilder().append("vn.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param2).append(')').toString());
        }
    }

    private final static void m(int param0) {
        String var3 = null;
        String var2 = null;
        String var5 = null;
        if (!SecondaryNodeHashTable.field_g) {
          throw new IllegalStateException();
        }
        if (param0 != 10) {
          ProgressMessageDialog.m(-26);
          if (null != ArchiveProvider.field_d) {
            ArchiveProvider.field_d.closeDialog((byte) -113);
            var3 = ec.e((byte) -64);
            ResourceArchive.field_b = new LoginPanel(var3, (String) null, true, false, false);
            jh.field_e.showDialog(nj.field_w, (byte) -46);
            nj.field_w.replaceContent(ResourceArchive.field_b, 88);
            nj.field_w.finishResize((byte) -126);
            return;
          }
          var2 = ec.e((byte) -64);
          ResourceArchive.field_b = new LoginPanel(var2, (String) null, true, false, false);
          jh.field_e.showDialog(nj.field_w, (byte) -46);
          nj.field_w.replaceContent(ResourceArchive.field_b, 88);
          nj.field_w.finishResize((byte) -126);
          return;
        }
        if (null == ArchiveProvider.field_d) {
          var5 = ec.e((byte) -64);
          ResourceArchive.field_b = new LoginPanel(var5, (String) null, true, false, false);
          jh.field_e.showDialog(nj.field_w, (byte) -46);
          nj.field_w.replaceContent(ResourceArchive.field_b, 88);
          nj.field_w.finishResize((byte) -126);
          return;
        }
        ArchiveProvider.field_d.closeDialog((byte) -113);
        String var4 = ec.e((byte) -64);
        ResourceArchive.field_b = new LoginPanel(var4, (String) null, true, false, false);
        jh.field_e.showDialog(nj.field_w, (byte) -46);
        nj.field_w.replaceContent(ResourceArchive.field_b, 88);
        nj.field_w.finishResize((byte) -126);
    }

    public void onWidgetActivated(InteractiveWidget param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_tb) {
            ChessBoardState.a(false, 3);
            this.closeDialog((byte) -121);
          } else {
            sg.a(ArrayWidgetContainer.i(param4 ^ -24270), (byte) 120, "tochangedisplayname.ws");
          }
          if (param4 == -24221) {
            return;
          }
          this.showConnectionFailure(-96);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("vn.DA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void releaseDeclaredStaticReferences(byte param0) {
        field_sb = null;
        field_Ab = null;
        field_xb = null;
        if (param0 == 5) {
          field_rb = null;
          field_ub = null;
          field_Bb = null;
          field_vb = null;
          field_Eb = null;
          return;
        }
        ProgressMessageDialog.releaseDeclaredStaticReferences((byte) 123);
        field_rb = null;
        field_ub = null;
        field_Bb = null;
        field_vb = null;
        field_Eb = null;
    }

    static {
        field_ub = new String[]{"Click on one of the highlighted pieces to select it", "Click on one of the highlighted squares to move your selected piece"};
        field_Eb = "This game option has not yet been unlocked for use.";
        field_sb = new int[]{682, 910};
        field_Db = -1;
        field_vb = new IntrusiveDeque();
    }
}
