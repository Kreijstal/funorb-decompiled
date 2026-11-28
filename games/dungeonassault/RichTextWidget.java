/*
 * Decompiled by CFR-JS 0.4.0.
 */
class RichTextWidget extends InteractiveWidget {
    private TextHotspotBounds field_O;
    static int field_P;
    static boolean field_M;
    static String field_L;
    static String field_Q;
    private String[] field_R;
    static String[] field_J;
    static String field_K;
    static String[] field_N;
    private IntrusiveDeque field_S;

    final static int b(int param0, int param1, boolean param2) {
        int var3 = TextLineMetrics.field_f[param1][param0];
        if (param2) {
          return -123;
        }
        if (ke.a(71, var3)) {
          return 260;
        }
        return TextLineMetrics.field_b[param1];
    }

    final static String a(int param0, int param1) {
        if (param0 <= 116) {
          return (String) null;
        }
        if (param1 == FullscreenFocusCanvas.field_c) {
          return null;
        }
        return DiskCacheWorker.field_e[param1];
    }

    public static void clearDeclaredStaticReferences(byte param0) {
        field_J = null;
        int var1 = -97 / ((param0 + 1) / 33);
        field_L = null;
        field_N = null;
        field_K = null;
        field_Q = null;
    }

    final void setBounds(int param0, int param1, int param2, int param3, int param4) {
        super.setBounds(param0, param1, param2, param3, param4);
        this.rebuildHotspotBounds((byte) -109);
    }

    final void a(int param0, int param1, String param2) {
        String[] var7 = null;
        String[] var8 = null;
        int var5 = 0;
        int var6 = DungeonAssault.field_K;
        if (null == this.field_R ||
          this.field_R.length <= param1) {
          var7 = new String[param1 + 1];
          var8 = var7;
          String[] var4 = var8;
          if (this.field_R != null) {
            for (var5 = 0; var5 < this.field_R.length; var5++) {
              var7[var5] = this.field_R[var5];
            }
          }
          this.field_R = var8;
        }
        if (param0 != 8) {
          return;
        }
        try {
          this.field_R[param1] = param2;
        } catch (RuntimeException runtimeException) {
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) runtimeException), "bh.J(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    RichTextWidget(String param0, WidgetRenderer param1) {
        super(param0, (WidgetEventListener) null);
        this.field_O = null;
        try {
          this.field_o = param1;
        } catch (RuntimeException runtimeException) {
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) runtimeException), "bh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    boolean takeFocus(int param0, UiWidget param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 34) {
            return false;
          }
          field_K = (String) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("bh.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void activateFromInput(int param0, int param1, int param2, int param3) {
        super.activateFromInput(param0, param1, param2, param3);
        int var5 = -this.field_q + param3;
        int var6 = param0 - this.field_v;
        TextHotspotBounds var7 = this.findHotspotAt(var5, var6, true);
        if (var7 != null &&
          this.field_n != null) {
          ((TextHotspotListener) ((Object) this.field_n)).onTextHotspotActivated(var7.field_r, this, param2 + 125, param1);
        }
    }

    final static int a(boolean param0, String param1, int param2, int param3, boolean param4, String param5) {
        try {
          int stackIn_5_0 = 0;
          int stackIn_32_0 = 0;
          boolean stackIn_46_0 = false;
          boolean stackIn_49_0 = false;
          int stackIn_77_0 = 0;
          int stackIn_87_0 = 0;
          int stackIn_89_0 = 0;
          int stackIn_96_0 = 0;
          int stackIn_99_0 = 0;
          RuntimeException stackIn_102_0 = null;
          StringBuilder stackIn_102_1 = null;
          String stackIn_103_2 = null;
          StringBuilder stackIn_105_1 = null;
          String stackIn_106_2 = null;
          Throwable decompiledCaughtException = null;
          int var6_int = 0;
          String var6 = null;
          RuntimeException var6_ref = null;
          int var7 = 0;
          int var8 = 0;
          Throwable var8_ref_Throwable = null;
          int var9 = 0;
          String var10 = null;
          CharSequence var11 = null;
          int var6_intLifetime1;
          int var6_intLifetime2;
          int var8Lifetime1;
          var9 = DungeonAssault.field_K;
          try {
            if (null == sp.field_c &&
              !rj.a((byte) 98, param4)) {
              stackIn_5_0 = -1;
              return stackIn_5_0;
            }
            if (pd.field_A == no.field_c) {
              if (!param4) {
                MatchingFieldValidator.field_n = qf.a(96, false, param1, param5);
              } else {
                var10 = (String) null;
                MatchingFieldValidator.field_n = TextLayout.a(param1, false, MusicPatchPcmStream.field_s, false, (String) null);
              }
              ac.field_B.position = 0;
              ac.field_B.writeByte(6, 14);
              ac.field_B.writeByte(6, MatchingFieldValidator.field_n.b(-110).field_c);
              op.a(0, -1);
              pd.field_A = ik.field_b;
            }
            if (pd.field_A == ik.field_b &&
              DraggableWidgetContainer.a(-12929, 1)) {
              var6_int = ra.field_c.readUnsignedByte(true);
              if (var6_int != 0) {
                hc.field_c = var6_int;
                nj.field_b = -1;
                pd.field_A = DropTargetWidgetContainer.field_K;
              } else {
                pd.field_A = MouseInput.field_c;
              }
              ra.field_c.position = 0;
            }
            if (MouseInput.field_c == pd.field_A &&
              DraggableWidgetContainer.a(-12929, 8)) {
              o.field_j = ra.field_c.readLong((byte) 105);
              ra.field_c.position = 0;
              ClientException.a(MatchingFieldValidator.field_n, param0, (byte) -27, param3, param4);
              pd.field_A = rp.field_d;
            }
            boolean decompiledFrameRemainder0 = true;
            if (rp.field_d == pd.field_A &&
              DraggableWidgetContainer.a(-12929, 1)) {
              var6_intLifetime1 = ra.field_c.readUnsignedByte(true);
              ra.field_c.position = 0;
              hc.field_c = var6_intLifetime1;
              pd.field_E = null;
              if (0 != var6_intLifetime1 &&
                var6_intLifetime1 != 1) {
                if (var6_intLifetime1 != 8) {
                  pd.field_A = DropTargetWidgetContainer.field_K;
                  nj.field_b = -1;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  tl.a(127);
                  ResourceArchive.field_e = false;
                  stackIn_32_0 = var6_intLifetime1;
                  return stackIn_32_0;
                }
              }
              if (decompiledFrameRemainder0) {
                nj.field_b = -1;
                pd.field_A = k.field_e;
              }
            }
            if (param2 <= 99) {
              field_N = (String[]) null;
            }
            if (k.field_e == pd.field_A &&
              AccountNameAvailabilityValidator.d((byte) -86)) {
              MusicPatchPcmStream.field_s = ra.field_c.readLong((byte) 53);
              ResourceArchive.field_k = ra.field_c.readUnsignedByte(true);
              ra.field_c.readUnsignedByte(true);
              pb.field_G = ra.field_c.readUnsignedShort(0);
              var6 = ra.field_c.readNullableString(true);
              var7 = ra.field_c.readUnsignedByte(true);
              if ((1 & var7) != 0) {
                TextLayout.b(false);
              }
              if (!param4) {
                stackIn_46_0 = (0 != (8 & var7));
                field_M = stackIn_46_0;
                stackIn_49_0 = ((var7 & 4) != 0);
                e.field_l = stackIn_49_0;
                if (field_M) {
                }
              }
              if (fa.field_j) {
                ra.field_c.readUnsignedByte(true);
                ra.field_c.readUnsignedByte(true);
                ra.field_c.readInt(-59);
                ao.field_k = ra.field_c.readUnsignedShort(0);
                ti.field_q = new byte[ao.field_k];
                for (var8 = 0; var8 < ao.field_k; var8++) {
                  ti.field_q[var8] = ra.field_c.readByte((byte) 2);
                }
              }
              CrossfadingMidiPcmStream.field_u = ra.field_c.readString(-98);
              var11 = (CharSequence) ((Object) CrossfadingMidiPcmStream.field_u);
              nn.field_k = jm.a((byte) 59, var11);
              ContentTransitionDialog.field_sb = ra.field_c.readUnsignedByte(true);
              pd.field_A = qa.field_c;
              if (MatchingFieldValidator.field_n.b(65) != pe.field_j) {
                if (MatchingFieldValidator.field_n.b(-104) == MidiPcmStream.field_w) {
                  gg.field_c.a(64, DebouncedFieldValidator.c(true));
                }
              } else {
                ba.field_e.a(64, DebouncedFieldValidator.c(true));
              }
              ResourceArchive.field_e = false;
              if (var6 != null) {
                AccountCreationResultPanel.a(true, var6, DebouncedFieldValidator.c(true));
              }
              if (pb.field_G <= 0 &&
                !e.field_l) {
                try {
                  JavaScriptBridge.callWithoutArguments((byte) -21, DebouncedFieldValidator.c(true), "unzap");
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              } else {
                try {
                  JavaScriptBridge.callWithArguments("zap", DebouncedFieldValidator.c(true), 15647, new Object[]{uj.a(MusicPatchPcmStream.field_s, -1)});
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              }
              if (pb.field_G > 0) {
                ld.field_g = true;
              }
              ac.field_B.a(n.field_f, (byte) -86);
              for (var8Lifetime1 = 0; 4 > var8Lifetime1; var8Lifetime1++) {
                n.field_f[var8Lifetime1] = n.field_f[var8Lifetime1] + 50;
              }
              ra.field_c.a(n.field_f, (byte) -108);
              stackIn_77_0 = hc.field_c;
              return stackIn_77_0;
            }
            if (pd.field_A == DropTargetWidgetContainer.field_K &&
              AccountNameAvailabilityValidator.d((byte) -60)) {
              tl.a(-17);
              if (hc.field_c == 7 &&
                !ResourceArchive.field_e) {
                ResourceArchive.field_e = true;
                stackIn_89_0 = -1;
                return stackIn_89_0;
              }
              if (hc.field_c == 7) {
                hc.field_c = 3;
              }
              tp.field_v = ra.field_c.readString(-96);
              ResourceArchive.field_e = false;
              stackIn_87_0 = hc.field_c;
              return stackIn_87_0;
            }
            if (null == sp.field_c) {
              if (ResourceArchive.field_e) {
                if (ClientException.a(123) <= 30000L) {
                  tp.field_v = fc.field_l;
                } else {
                  tp.field_v = lh.field_r;
                }
                ResourceArchive.field_e = false;
                stackIn_96_0 = 3;
                return stackIn_96_0;
              }
              var6_intLifetime2 = an.field_E;
              an.field_E = TextLayout.field_b;
              TextLayout.field_b = var6_intLifetime2;
              ResourceArchive.field_e = true;
            }
            stackIn_99_0 = -1;
            return stackIn_99_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_102_0 = var6_ref;
            stackIn_102_1 = new StringBuilder().append("bh.R(").append(param0).append(',');
            if (param1 == null) {
              stackIn_103_2 = "null";
            } else {
              stackIn_103_2 = "{...}";
            }
            stackIn_105_1 = ((StringBuilder) (Object) stackIn_102_1).append(stackIn_103_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            if (param5 == null) {
              stackIn_106_2 = "null";
            } else {
              stackIn_106_2 = "{...}";
            }
            throw AccountServiceResult.wrapClientException((Throwable) ((Object) stackIn_102_0), ((StringBuilder) (Object) stackIn_105_1).append(stackIn_106_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        this.setBounds(0, param2, param3, param0, ((TextWidgetRenderer) ((Object) this.field_o)).getPreferredHeight((UiWidget) (this), 8));
        if (param1 >= -11) {
          field_M = false;
        }
    }

    void drawWidget(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.drawWidget(param0, param1, param2 ^ param2, param3);
        if (param0 != 0) {
          return;
        }
        TextWidgetRenderer var5 = (TextWidgetRenderer) ((Object) this.field_o);
        TextHotspotBounds var6 = this.field_O;
        if (var6 != null) {
          var7 = var5.getTextOriginX((UiWidget) (this), (byte) 75, param1);
          var8 = var5.getTextOriginY((byte) 84, param3, (UiWidget) (this));
          do {
            NetworkGameClient.a(-2 + (var6.field_k + var7), var6.field_p + 2, var6.field_i + 2, var6.field_l + (var8 - 2), 1);
            var6 = var6.field_o;
          } while (var6 != null);
        }
    }

    void updatePointer(int param0, int param1, UiWidget param2, boolean param3) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.updatePointer(param0, param1, param2, param3);
          this.field_O = null;
          if (this.field_u) {
            var5_int = -this.field_q + (hj.field_S - param0);
            var6 = -param1 + eh.field_h - this.field_v;
            this.field_O = this.findHotspotAt(var5_int, var6, true);
          }
          if (!param3) {
            RichTextWidget.a(110, 28);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("bh.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    final void rebuildHotspotBounds(byte param0) {
        int var12 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int var2;
        TextWidgetRenderer var3;
        int var4;
        TextLayout var5;
        int var6;
        String var7;
        int var8;
        int var9;
        int var10;
        Object var11;
        TextLineMetrics var13;
        int var14;
        int var15;
        TextHotspotBounds var16;
        int var17;
        int var8Lifetime1;
        var17 = DungeonAssault.field_K;
        this.field_S = new IntrusiveDeque();
        var2 = 0;
        var3 = (TextWidgetRenderer) ((Object) this.field_o);
        var4 = -22 / ((param0 + 42) / 62);
        var5 = var3.getTextLayout(-2, (UiWidget) (this));
        while (true) {
          var6 = this.field_w.indexOf("<hotspot=", var2);
          if (var6 == -1) {
            return;
          }
          var8 = this.field_w.indexOf(">", var6);
          var7 = this.field_w.substring(var6 + 9, var8);
          var8Lifetime1 = Integer.parseInt(var7);
          var2 = this.field_w.indexOf("</hotspot>", var6);
          var9 = var5.getLineIndexForTextOffset(0, var6);
          var10 = var5.getLineIndexForTextOffset(0, var2);
          var11 = null;
          for (var12 = var9; var10 >= var12; var12++) {
            var13 = var5.field_e[var12];
            if (~var12 == ~var9) {
              stackIn_8_0 = var5.getXForTextOffset((byte) 60, var6);
            } else {
              stackIn_8_0 = var13.field_k[0];
            }
            var14 = stackIn_8_0;
            if (var10 != var12) {
              if (var13 == null) {
                stackIn_13_0 = 0;
              } else {
                stackIn_13_0 = var13.field_k[-1 + var13.field_k.length];
              }
            } else {
              stackIn_13_0 = var5.getXForTextOffset((byte) 70, var2);
            }
            var15 = stackIn_13_0;
            var16 = new TextHotspotBounds(var8Lifetime1, var14, var13.field_m, -var14 + var15, Math.max(var3.getFontLineHeight(100), -var13.field_m + var13.field_c));
            if (var11 != null) {
              ((TextHotspotBounds) (var11)).field_o = var16;
            }
            this.field_S.addFirst(var16, false);
            var11 = var16;
          }
        }
    }

    private final TextHotspotBounds findHotspotAt(int param0, int param1, boolean param2) {
        TextHotspotBounds var4;
        TextHotspotBounds var5;
        int var6;
        var6 = DungeonAssault.field_K;
        var4 = (TextHotspotBounds) (this.field_S.beginBackward(-24172));
        if (!param2) {
          return (TextHotspotBounds) null;
        }
        while (var4 != null) {
          var5 = var4;
          while (var5 != null) {
            if (param0 >= var5.field_k &&
              param1 >= var5.field_l &&
              var5.field_i + var5.field_k > param0 &&
              var5.field_l + var5.field_p >= param1) {
              return var4;
            }
            var5 = var5.field_o;
          }
          var4 = (TextHotspotBounds) (this.field_S.nextBackward(4));
        }
        return null;
    }

    String getTooltipText(byte param0) {
        if (this.field_O == null) {
          return null;
        }
        if (this.field_R == null) {
          return null;
        }
        if (param0 <= 3) {
          return (String) null;
        }
        if (this.field_R.length <= this.field_O.field_r) {
          return null;
        }
        return this.field_R[this.field_O.field_r];
    }

    static {
        field_M = true;
        field_J = new String[]{"Welcome", "Welcome to <%highlight>Dungeon Assault</col>! In this game, you play a dragon, battling your kind to gain <%highlight>Renown</col> in the realm of Dungaria.<br><br><%command>You can hide this tutorial by clicking on the down arrow icon at the top-right of this scroll, and return to it by clicking the visible portion of this scroll at the right edge of the screen. You can also reposition it by holding the mouse button and dragging.</col><br><br><%command>Click the arrow at the bottom-right of this scroll to continue."};
        field_L = "There is a pit in this room, but it remains concealed until a raider steps on it.";
        field_K = "OVER <%0>";
        field_Q = "Please log in to access this feature.";
        field_N = new String[]{"Master of Chaos", "Sacrifice a raider to defeat any room. (Multiple use)"};
    }
}
