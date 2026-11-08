/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DropdownList extends UiContainer implements ButtonListener {
    private int field_K;
    mb field_P;
    String field_D;
    static String field_F;
    private TextButton field_O;
    static int field_N;
    BitmapFont field_Q;
    private TextButton field_E;
    static String field_C;
    boolean field_G;
    private int field_R;
    static IndexedSprite[] field_I;
    static String field_M;
    ScrollContainer field_H;
    private boolean field_J;

    DropdownList(Object[] param0, int param1, int param2) {
        super(0, 0, 0, 0, (WidgetPainter) null);
        this.field_D = "";
        this.field_Q = ia.field_c;
        try {
          this.field_P = new mb(this, this.field_Q, param0, param1);
          this.field_G = false;
          this.field_P.field_o = (UiListener) (this);
          this.field_R = param2;
          this.field_O = new TextButton("", new BevelBoxPainter(this), (UiListener) (this));
          this.field_E = new TextButton();
          this.field_E.field_r = (WidgetPainter) ((Object) new va());
          this.field_E.field_o = (UiListener) (this);
          this.addChild(-83, this.field_O);
          this.addChild(-74, this.field_E);
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "ti.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean isFocused(int param0) {
        boolean stackIn_7_0 = false;
        if (param0 != -2116) {
          this.openList(69);
        }
        stackIn_7_0 = (this.field_J) || (super.isFocused(-2116));
        return stackIn_7_0;
    }

    private final void closeList(int param0) {
        if (this.isOpen(param0 + 2)) {
          this.layoutChildren(this.field_n, this.field_v, this.field_K, this.field_j, 65);
          if (param0 != 0) {
            UiComponent var3 = (UiComponent) null;
            this.updatePointer((UiComponent) null, -14, -32, 91);
          }
          this.field_G = false;
          this.field_H.unlink(true);
          return;
        }
    }

    final void setBounds(int param0, int param1, int param2, int param3, int param4) {
        if (param4 >= -49) {
          this.field_E = (TextButton) null;
        }
        this.field_K = param0;
        this.layoutChildren(param3, param2, param0, param1, 107);
    }

    final boolean handleKeyInput(UiComponent param0, byte param1, char param2, int param3) {
        boolean stackIn_58_0 = false;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_62_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6_int = 0;
        String var6 = null;
        int var7 = 0;
        int var6_intLifetime1;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (!this.isFocused(-2116)) {
            return false;
          }
          boolean decompiledFrameRemainder0 = true;
          if (null != this.field_P.field_W) {
            var5_int = this.field_P.field_W.length;
            if (param3 != 99 &&
              98 != param3) {
              if (param3 != 105 &&
                param3 != 104) {
                if (param3 == 84) {
                  if (!this.field_G) {
                    this.openList(-83);
                  } else {
                    this.closeList(0);
                  }
                  return true;
                }
                if (param3 == 85) {
                  var6_int = this.field_D.length();
                  if (var6_int <= 0) {
                    return true;
                  }
                  this.field_D = this.field_D.substring(0, var6_int - 1);
                  return true;
                }
                decompiledFrameRemainder0 = !(param2 < 32);
                if ((decompiledFrameRemainder0) &&
                  (decompiledFrameRemainder0 = !(param2 >= 128))) {
                  var6 = this.field_D + param2;
                  this.selectItemByPrefix(var6, -86);
                  return true;
                }
              }
              if (decompiledFrameRemainder0) {
                if (!this.isOpen(2)) {
                  this.openList(-62);
                }
                var6_intLifetime1 = this.field_H.field_P.field_k / this.field_P.field_T;
                if (param3 != 105) {
                  this.field_P.field_Y = this.field_P.field_Y - var6_intLifetime1;
                } else {
                  this.field_P.field_Y = this.field_P.field_Y + var6_intLifetime1;
                }
                if (this.field_P.field_Y < 0) {
                  this.field_P.field_Y = 0;
                }
                if (var5_int <= this.field_P.field_Y) {
                  this.field_P.field_Y = -1 + var5_int;
                }
                this.scrollToSelection(11149);
                return true;
              }
            }
            if (decompiledFrameRemainder0) {
              if (!this.isOpen(2)) {
                this.openList(-114);
              }
              if (param3 == 99) {
                this.field_P.field_Y = this.field_P.field_Y + 1;
              } else {
                this.field_P.field_Y = this.field_P.field_Y - 1;
              }
              if (0 > this.field_P.field_Y) {
                this.field_P.field_Y = 0;
              }
              if (var5_int <= this.field_P.field_Y) {
                this.field_P.field_Y = -1 + var5_int;
              }
              this.scrollToSelection(11149);
              return true;
            }
          }
          if (param1 > -120) {
            this.isFocused(59);
          }
          if (param3 != 80) {
            stackIn_58_0 = super.handleKeyInput(param0, (byte) -125, param2, param3);
            return stackIn_58_0;
          }
          this.closeList(0);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_61_0 = var5;
          stackIn_61_1 = new StringBuilder().append("ti.N(");
          if (param0 == null) {
            stackIn_62_2 = "null";
          } else {
            stackIn_62_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_61_0), ((StringBuilder) (Object) stackIn_61_1).append(stackIn_62_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final void onButtonActivated(boolean param0, int param1, int param2, int param3, TextButton param4) {
        UiComponent var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (!param0) {
            var7 = (UiComponent) null;
            this.focusNext(-2, (UiComponent) null);
          }
          if (!this.isOpen(2)) {
            this.openList(-107);
          } else {
            this.closeList(0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("ti.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static boolean spriteHitsTerrain(int param0, int param1, boolean param2, Sprite param3, IndexedSprite param4, Battle param5, int param6) {
        int var21 = 0;
        int var22 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_65_2 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int[] var19 = null;
        int var20 = 0;
        int var23 = 0;
        int[] var24 = null;
        int[] var26 = null;
        byte[] var29 = null;
        var23 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          param6 = param6 + param3.field_x;
          param0 = param0 + param3.field_o;
          param1 = param1 + param3.field_o;
          var7_int = param3.field_q;
          var8 = param3.field_y;
          if (param6 >= param5.field_y) {
            return false;
          }
          if (param6 <= -var7_int) {
            return false;
          }
          if (param2) {
            return false;
          }
          if (param0 < param5.field_H &&
            param0 > -var8) {
            stackIn_17_0 = (0 < param6) ? param6 : 0;
            var9 = stackIn_17_0;
            var10 = param6 + var7_int;
            if (param5.field_y < var10) {
              var10 = param5.field_y;
            }
            stackIn_22_0 = (param0 <= 0) ? 0 : param0;
            var11 = stackIn_22_0;
            var12 = param0 + var8;
            var10 = var10 - var9;
            if (var12 > param5.field_y) {
              var12 = param5.field_y;
            }
            var12 = var12 - var11;
            if ((1 & var10) > 0) {
              var10--;
            }
            if ((1 & var12) > 0) {
              var12--;
            }
            var13 = param5.field_hb * (var11 >> 1) + (var9 >> 1);
            var14 = param5.field_hb - (var10 >> 1);
            var15 = (var11 - param0) * param3.field_q - (-var9 + param6);
            var16 = var7_int - var10;
            var17 = var9 - (param6 - (-param1 + var11) * param3.field_q);
            var16 = var16 + var7_int;
            var29 = param4.field_m;
            var26 = param3.field_A;
            var24 = var26;
            var19 = var24;
            var20 = var26.length;
            for (var21 = var12; var21 > 0; var21 -= 2) {
              for (var22 = var10; var22 > 0; var22 -= 2) {
                if (var29[var13] != 0 && (1 + var7_int + (var17 + var7_int) >= var20 ||
                  0 == var19[var7_int + var17] &&
                  var19[1 + (var7_int + var17)] == 0 &&
                  var19[var17 + var7_int + var7_int] == 0 &&
                  var19[var17 - (-var7_int - var7_int) + 1] == 0)) {
                  if (var26[var15] != 0) {
                    return true;
                  }
                  if (var19[1 + var15] != 0) {
                    return true;
                  }
                  if (var19[var7_int + var15] != 0) {
                    return true;
                  }
                  if (var19[var7_int + var15 + 1] != 0) {
                    return true;
                  }
                }
                var13++;
                var15 += 2;
                var17 += 2;
              }
              var17 = var17 + var16;
              var13 = var13 + var14;
              var15 = var15 + var16;
              if (param4.field_m.length <= var13) {
                return false;
              }
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_64_0 = var7;
          stackIn_64_1 = new StringBuilder().append("ti.O(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_65_2 = "null";
          } else {
            stackIn_65_2 = "{...}";
          }
          stackIn_67_1 = ((StringBuilder) (Object) stackIn_64_1).append(stackIn_65_2).append(',');
          if (param4 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          stackIn_70_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',');
          if (param5 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_64_0), ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',').append(param6).append(')').toString());
        }
    }

    final void updatePointer(UiComponent param0, int param1, int param2, int param3) {
        try {
          super.updatePointer(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "ti.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void selectItemByPrefix(String param0, int param1) {
        if (this.field_P.field_W == null) {
          return;
        }
        if (param1 >= -39) {
          this.notifySelectionChanged(-126);
        }
        int var3_int = this.findItemStartingWith((byte) 78, param0.toLowerCase());
        if (var3_int == -1) {
          return;
        }
        try {
          this.field_P.field_Y = var3_int;
          this.scrollToSelection(11149);
          this.field_D = param0;
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "ti.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void initializeCaptionTable(byte param0) {
        if (ce.field_g != null) {
          return;
        }
        ce.field_g = new String[31];
        ce.field_g[14] = ArchiveIndex.field_j;
        ce.field_g[0] = nj.field_g;
        ce.field_g[23] = ArcanistsMulti.field_H;
        ce.field_g[19] = tm.field_f;
        ce.field_g[21] = th.field_i;
        ce.field_g[6] = mb.field_Z;
        ce.field_g[20] = BufferedRandomAccessFile.field_g;
        ce.field_g[18] = StatefulTextPainter.field_y;
        if (param0 != -90) {
          PcmSample var2 = (PcmSample) null;
          DropdownList.playSampleAtVolume((byte) 106, 40, (PcmSample) null);
        }
        ce.field_g[2] = r.field_e;
        ce.field_g[26] = mn.field_w;
        ce.field_g[17] = ui.field_q;
        ce.field_g[28] = KeyboardInputHandler.field_l;
        ce.field_g[9] = ed.field_xb;
        ce.field_g[7] = DraggableWidget.field_J;
        ce.field_g[4] = da.field_a;
        ce.field_g[5] = he.field_b;
        ce.field_g[11] = ResourceArchive.field_d;
        ce.field_g[1] = CameraFollowTarget.field_a;
        ce.field_g[30] = IntrusiveNodeHashTable.field_d;
        ce.field_g[29] = MenuButtonPanel.field_Q;
        ce.field_g[8] = null;
        ce.field_g[27] = ie.field_Lb;
        ce.field_g[22] = he.field_g;
        ce.field_g[15] = SectorCacheStore.field_i;
        ce.field_g[24] = lh.field_a;
        ce.field_g[13] = SecondaryNodeDeque.field_a;
        ce.field_g[25] = CipherPacketBuffer.field_q;
    }

    private final void scrollToSelection(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var7Lifetime1;
        int var8Lifetime1;
        if (this.isOpen(2) &&
          this.field_P.field_Y != -1 &&
          this.field_P.field_W != null &&
          null != this.field_H.field_O) {
          if (param0 != 11149) {
            this.field_P = (mb) null;
          }
          var2 = this.field_H.field_P.field_k;
          var3 = this.field_P.field_T;
          var4 = this.field_P.field_k - var2;
          if (0 >= var4) {
            return;
          }
          var5 = var3 * this.field_P.field_Y;
          var6 = this.field_H.field_P.field_B.field_j + var5;
          var7 = var2 >> 2;
          if (var7 > var6) {
            var8 = -(-var5 + var7 << 16) / var4;
            if (var8 < 0) {
              var8 = 0;
            }
            this.field_H.field_O.field_L = var8;
          }
          var7Lifetime1 = (var2 * 3 >> 2) - var3;
          if (var7Lifetime1 < var6) {
            var8Lifetime1 = -(var7Lifetime1 - var5 << 16) / var4;
            if (var8Lifetime1 > 65536) {
              var8Lifetime1 = 65536;
            }
            this.field_H.field_O.field_L = var8Lifetime1;
          }
          return;
        }
    }

    final boolean focusNext(int param0, UiComponent param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            this.field_Q = (BitmapFont) null;
          }
          param1.blur((byte) 29);
          this.field_D = "";
          this.field_J = true;
          if (null != this.field_o &&
            this.field_o instanceof ButtonFocusListener) {
            ((ButtonFocusListener) (this.field_o)).onFocusChanged(false, this.field_J, (UiComponent) (this));
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ti.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void notifySelectionChanged(int param0) {
        if (param0 != 0) {
          this.field_P = (mb) null;
        }
        if (this.field_o instanceof DropdownListener) {
          ((DropdownListener) ((Object) this.field_o)).onSelectionChanged(this, -6509);
        }
    }

    private final void layoutChildren(int param0, int param1, int param2, int param3, int param4) {
        super.setBounds(param2, param3, param1, param0, -76);
        this.field_O.setBounds(this.field_K, 0, param1 - 20, 0, -89);
        this.field_E.setBounds(this.field_K, 0, 20, param1 - 20, -73);
        if (this.field_G) {
          this.field_H.setBounds(-this.field_K + param2, this.field_K, param1, 0, -110);
        }
        if (param4 < 27) {
          this.getTooltip(false);
        }
    }

    final static fk playSampleAtVolume(byte param0, int param1, PcmSample param2) {
        RuntimeException var3 = null;
        fk stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -30) {
            field_I = (IndexedSprite[]) null;
          }
          stackIn_3_0 = ValidationHelpWidget.playEffectStream(PcmSampleStream.createAtRatePercent(param2, 100, param1), (byte) 68);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ti.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final String getTooltip(boolean param0) {
        int discarded$0 = 0;
        if (!this.field_w) {
          return null;
        }
        if (param0) {
          String var3 = (String) null;
          discarded$0 = this.findItemStartingWith((byte) -128, (String) null);
        }
        if (this.isOpen(2) &&
          this.field_H.field_w &&
          -1 != this.field_P.field_Q) {
          return this.field_P.field_W[this.field_P.field_Q].toString();
        }
        if (this.field_P.getSelectedItem(126) != null) {
          return this.field_P.getSelectedItem(127).toString();
        }
        return super.getTooltip(false);
    }

    private final void openList(int param0) {
        int var2 = this.field_P.contentHeight(27825);
        int var3 = var2;
        int var4 = 0;
        if (var3 > this.field_R) {
          var4 = 1;
          var3 = this.field_R;
        }
        this.layoutChildren(this.field_n, this.field_v, var3 + this.field_K, this.field_j, 55);
        this.field_P.setBounds(var2, 0, this.field_v, 0, -50);
        this.field_H = new ScrollContainer(0, 0, 0, 0, new EmptyPainter(), this.field_P, (WidgetPainter) null);
        if (var4 != 0) {
          this.field_H.setScrollbar(true, 1, FixedViewResizeListener.createScrollbar(-15438));
        }
        this.field_H.setBounds(this.field_k - this.field_K, this.field_K, this.field_v, 0, -114);
        this.field_G = true;
        this.addChild(-90, this.field_H);
        this.scrollToSelection(11149);
        if (param0 >= -38) {
          this.field_D = (String) null;
        }
    }

    private final int findItemStartingWith(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          param1 = param1.toLowerCase();
          var3_int = 0;
          while (true) {
            if (this.field_P.field_W.length <= var3_int) {
              if (param0 < 35) {
                this.isOpen(5);
              }
              stackIn_10_0 = -1;
              return stackIn_10_0;
            }
            var4 = this.field_P.field_W[var3_int].toString().toLowerCase();
            if (!var4.startsWith(param1)) {
              var3_int++;
              continue;
            }
            break;
          }
          stackIn_5_0 = var3_int;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("ti.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void blur(byte param0) {
        this.field_J = false;
        super.blur(param0);
    }

    final int getSelectedIndex(byte param0) {
        if (param0 != 37) {
          this.field_O = (TextButton) null;
        }
        return this.field_P.field_Y;
    }

    final boolean isOpen(int param0) {
        int discarded$0 = 0;
        if (param0 != 2) {
          String var3 = (String) null;
          discarded$0 = this.findItemStartingWith((byte) -123, (String) null);
        }
        return this.field_G;
    }

    final boolean handlePointerPress(int param0, int param1, UiComponent param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = -94 / ((-42 - param4) / 35);
          stackIn_1_0 = super.handlePointerPress(param0, param1, param2, param3, -105, param5, param6);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_4_0 = var8;
          stackIn_4_1 = new StringBuilder().append("ti.DA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != 0) {
          Battle var2 = (Battle) null;
          DropdownList.spriteHitsTerrain(64, -6, true, (Sprite) null, (IndexedSprite) null, (Battle) null, 111);
        }
        field_F = null;
        field_M = null;
        field_I = null;
        field_C = null;
    }

    static {
        field_F = "You have earned as many wands as you are currently able to, and can now trade in all of your spells to purchase a prestige hat, which will appear within the game.<br>Be warned that, with every prestige hat you acquire, it will become increasingly harder to earn wands.";
        field_C = "Private";
        field_M = "Return to Main Menu";
    }
}
