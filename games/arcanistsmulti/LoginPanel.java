/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginPanel extends UiContainer implements TextInputListener, ButtonListener {
    static int field_Q;
    private boolean field_R;
    static String field_D;
    private TextButton field_L;
    private EditableTextWidget field_O;
    static IndexedSprite[] field_M;
    private TextButton field_P;
    static IndexedSprite[] field_I;
    private String field_E;
    static String field_C;
    private TextButton field_J;
    private boolean field_N;
    private EditableTextWidget field_G;
    private boolean field_F;

    public final void onTextChanged(EditableTextWidget param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -20626) {
            LoginPanel.a(12);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("e.G(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void tickMessageTimer(byte param0) {
        RuntimeException runtimeException = null;
        rb var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -49) {
            return;
          }
          var1 = (rb) (pb.field_m.first(12623));
          if (null != var1) {
            var1.field_h = var1.field_h - 1;
            if (var1.field_h < 0) {
              var1.unlink(true);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) runtimeException), "e.C(" + param0 + ')');
        }
    }

    public final void onTextSubmitted(EditableTextWidget param0, int param1) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_O == param0) {
            this.field_G.focusNext(0, (UiComponent) (this));
          }
          if (this.field_G == param0) {
            this.submitLogin((byte) -83);
          }
          if (param1 < 73) {
            this.onTextChanged((EditableTextWidget) null, 105);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("e.H(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean handleKeyInput(UiComponent param0, byte param1, char param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_10_0 = false;
        boolean stackIn_15_0 = false;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKeyInput(param0, (byte) -123, param2, param3)) {
            return true;
          }
          if (param1 > -120) {
            this.field_P = (TextButton) null;
          }
          if (param3 == 98) {
            stackIn_10_0 = this.focusPreviousChild(param0, 9555);
            return stackIn_10_0;
          }
          if (param3 == 99) {
            stackIn_15_0 = this.focusNextChild(2, param0);
            return stackIn_15_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_21_0 = var5;
          stackIn_21_1 = new StringBuilder().append("e.N(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void setUsername(int param0, String param1) {
        RuntimeException runtimeException = null;
        EditableTextWidget var3 = null;
        String var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_O;
          var4 = param1;
          var3.setText(false, var4, false);
          if (param0 != 26152) {
            this.field_G = (EditableTextWidget) null;
          }
          this.field_G.clearText(3545);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("e.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static void b(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param0 != 1) {
            LoginPanel.tickMessageTimer((byte) 123);
          }
          qj.field_a = param4;
          IntrusiveNodeHashTable.field_h = param2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var5), "e.R(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(int param0) {
        field_C = null;
        field_I = null;
        if (param0 != -1) {
          return;
        }
        try {
          field_M = null;
          field_D = null;
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "e.I(" + param0 + ')');
        }
    }

    final static void decodeIndexedSpriteSheet(byte[] param0, boolean param1) {
        byte dupTemp$0 = 0;
        byte dupTemp$1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_48_2 = 0;
        int stackIn_67_1 = 0;
        int stackIn_81_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_86_1 = 0;
        int stackIn_95_1 = 0;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        String stackIn_104_2 = null;
        RuntimeException decompiledCaughtException = null;
        PacketBuffer var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_47_0Lifetime1;
        int stackIn_81_0Lifetime1;
        int stackIn_86_0Lifetime1;
        int stackIn_86_1Lifetime1;
        int var12Lifetime1;
        int var12Lifetime2;
        int var13Lifetime1;
        int var13Lifetime2;
        int var12Lifetime3;
        var15 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var2 = new PacketBuffer(param0);
          var2.position = param0.length - 2;
          ModalPanelStack.field_J = var2.readUnsignedShort(-98);
          jg.field_p = new int[ModalPanelStack.field_J];
          FadingModalPanel.field_O = new byte[ModalPanelStack.field_J][];
          SectorCacheStore.field_d = new int[ModalPanelStack.field_J];
          ho.field_i = new int[ModalPanelStack.field_J];
          AccountRegistrationPanel.field_I = new byte[ModalPanelStack.field_J][];
          hl.field_l = new int[ModalPanelStack.field_J];
          dn.field_Ib = new boolean[ModalPanelStack.field_J];
          var2.position = param0.length - (7 + ModalPanelStack.field_J * 8);
          pb.field_g = var2.readUnsignedShort(-98);
          gn.field_a = var2.readUnsignedShort(-98);
          var3 = 1 + (var2.readUnsignedByte((byte) -103) & 255);
          var4 = 0;
          do {
            if (!(var4 < ModalPanelStack.field_J)) {
              var4 = 0;
              break;
            }
            hl.field_l[var4] = var2.readUnsignedShort(-98);
            var4++;
          } while (var15 == 0);
          do {
            if (!(var4 < ModalPanelStack.field_J)) {
              var4 = 0;
              break;
            }
            SectorCacheStore.field_d[var4] = var2.readUnsignedShort(-98);
            var4++;
          } while (var15 == 0);
          do {
            if (!(ModalPanelStack.field_J > var4)) {
              var4 = 0;
              break;
            }
            jg.field_p[var4] = var2.readUnsignedShort(-98);
            var4++;
          } while (var15 == 0);
          do {
            if (!(ModalPanelStack.field_J > var4)) {
              var2.position = -(3 * (-1 + var3)) - 8 * ModalPanelStack.field_J + (-7 + param0.length);
              ph.field_c = new int[var3];
              break;
            }
            ho.field_i[var4] = var2.readUnsignedShort(-98);
            var4++;
          } while (var15 == 0);
          var4 = 1;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var4 >= var3))) {
            ph.field_c[var4] = var2.readUnsignedMedium(11609);
            stackIn_42_0 = -1;
            stackIn_42_1 = ~ph.field_c[var4];
            if (var15 == 0) {
              if (stackIn_42_0 == stackIn_42_1) {
                ph.field_c[var4] = 1;
              }
              var4++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            var2.position = 0;
            stackIn_42_0 = param1 ? 1 : 0;
            stackIn_42_1 = 1;
          }
          if (stackIn_42_0 != stackIn_42_1) {
            LoginPanel.submitAccountCreation((ConditionalTextValue) null, -42, (ConditionalTextValue) null);
          }
          var4 = 0;
          while (true) {
            stackIn_47_0 = ~ModalPanelStack.field_J;
            stackIn_48_0 = stackIn_47_0;
            stackIn_48_1 = var4;
            stackIn_48_2 = -1;
            if (stackIn_48_0 < (stackIn_48_1 ^ stackIn_48_2)) {
              var5 = jg.field_p[var4];
              var6 = ho.field_i[var4];
              var7 = var5 * var6;
              var8 = new byte[var7];
              AccountRegistrationPanel.field_I[var4] = var8;
              var9 = new byte[var7];
              FadingModalPanel.field_O[var4] = var9;
              var10 = 0;
              var11 = var2.readUnsignedByte((byte) -117);
              if (var15 != 0) {
                return;
              }
              {
                if ((var11 & 1) == 0) {
                  var12 = 0;
                  while (var12 < var7) {
                    var8[var12] = var2.readByte(6);
                    var12++;
                  }
                  if ((0 != (var11 & 2))) {
                    var12Lifetime3 = 0;
                    while (var12Lifetime3 < var7) {
                      dupTemp$0 = var2.readByte(6);
                      var9[var12Lifetime3] = dupTemp$0;
                      var13 = dupTemp$0;
                      stackIn_48_0 = var10;
                      stackIn_48_1 = 0;
                      stackIn_48_2 = ~var13;
                      if (stackIn_48_1 == stackIn_48_2) {
                        stackIn_67_1 = 0;
                      } else {
                        stackIn_67_1 = 1;
                      }
                      var10 = stackIn_48_0 | stackIn_67_1;
                      var12Lifetime3++;
                    }
                  }
                } else {
                  var12Lifetime1 = 0;
                  while (var5 > var12Lifetime1) {
                    stackIn_81_0 = 0;
                    var13Lifetime1 = stackIn_81_0;
                    while (var6 > var13Lifetime1) {
                      var8[var13Lifetime1 * var5 + var12Lifetime1] = var2.readByte(6);
                      var13Lifetime1++;
                    }
                    var12Lifetime1++;
                  }
                  stackIn_81_0Lifetime1 = 0;
                  if (stackIn_81_0Lifetime1 != (var11 & 2)) {
                    var12Lifetime2 = 0;
                    while (true) {
                      stackIn_86_0 = var5;
                      stackIn_86_1 = var12Lifetime2;
                      if (stackIn_86_0 <= stackIn_86_1) {
                        break;
                      }
                      stackIn_47_0Lifetime1 = 0;
                      var13Lifetime2 = stackIn_47_0Lifetime1;
                      while (var13Lifetime2 < var6) {
                        dupTemp$1 = var2.readByte(6);
                        var9[var5 * var13Lifetime2 + var12Lifetime2] = dupTemp$1;
                        var14 = dupTemp$1;
                        stackIn_86_0Lifetime1 = var10;
                        stackIn_86_1Lifetime1 = ~var14;
                        if (stackIn_86_1Lifetime1 == 0) {
                          stackIn_95_1 = 0;
                        } else {
                          stackIn_95_1 = 1;
                        }
                        var10 = stackIn_86_0Lifetime1 | stackIn_95_1;
                        var13Lifetime2++;
                      }
                      var12Lifetime2++;
                    }
                  }
                }
              }
              dn.field_Ib[var4] = var10 != 0;
              var4++;
              continue;
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_103_0 = var2_ref;
          stackIn_103_1 = new StringBuilder().append("e.Q(");
          if (param0 == null) {
            stackIn_104_2 = "null";
          } else {
            stackIn_104_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_103_0), ((StringBuilder) (Object) stackIn_103_1).append(stackIn_104_2).append(',').append(param1).append(')').toString());
        }
    }

    final void clearFields(boolean param0) {
        try {
          this.field_O.clearText(3545);
          this.field_G.clearText(3545);
          if (!param0) {
            this.field_G = (EditableTextWidget) null;
          }
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "e.M(" + param0 + ')');
        }
    }

    final void drawLayer(byte param0, int param1, int param2, int param3) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (null != this.field_E) {
            ia.field_c.drawParagraph(this.field_E, 20 + this.field_n + param1, 15 + (this.field_j + param3), this.field_v - 40, this.field_k, 16777215, -1, 1, 0, ia.field_c.field_C);
          }
          if (this.field_J != null) {
            SoftwareRasterizer.drawHorizontalLine(param1 + 10, param3 + 134, this.field_v - 20, 4210752);
          }
          super.drawLayer((byte) -62, param1, param2, param3);
          if (param0 >= -52) {
            LoginPanel.a(-70);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var5), "e.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    LoginPanel(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (WidgetPainter) null);
        LabeledField dupTemp$0 = null;
        LabeledField dupTemp$1 = null;
        TextButton stackIn_17_1 = null;
        TextButton stackIn_17_2 = null;
        TextButton stackIn_18_1 = null;
        TextButton stackIn_18_2 = null;
        String stackIn_18_3 = null;
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        String stackIn_92_2 = null;
        StringBuilder stackIn_95_1 = null;
        String stackIn_96_2 = null;
        RuntimeException decompiledCaughtException = null;
        MenuButtonPainter var6 = null;
        RuntimeException var6_ref = null;
        BitmapFont var7 = null;
        String var8 = null;
        LoginMethod var9 = null;
        LabeledField var10 = null;
        int var11 = 0;
        LabeledField var10Lifetime1;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          this.field_F = param2;
          this.field_N = param4;
          this.field_E = param1;
          this.field_R = param3;
          if (this.field_F && (this.field_R ||
            this.field_N)) {
            throw new IllegalStateException();
          }
          boolean decompiledFrameRemainder0 = true;
          this.field_O = (EditableTextWidget) ((Object) new ValidatedTextWidget(param0, (UiListener) (this), 100));
          this.field_G = (EditableTextWidget) ((Object) new ValidatedTextWidget("", (UiListener) (this), 20));
          if (this.field_F) {
            this.field_P = new TextButton(sk.field_b, (UiListener) null);
            this.field_L = new TextButton(ki.field_u, (UiListener) null);
            this.field_O.field_B = false;
            decompiledFrameRemainder0 = (var11 != 0);
          }
          if (decompiledFrameRemainder0) {
            this.field_P = new TextButton(w.field_Qb, (UiListener) null);
            stackIn_17_1 = null;
            stackIn_17_2 = null;
            if (this.field_N) {
              stackIn_18_1 = null;
              stackIn_18_2 = null;
              stackIn_18_3 = LoadingTracker.field_n;
            } else {
              stackIn_18_1 = null;
              stackIn_18_2 = null;
              stackIn_18_3 = ae.field_b;
            }
            this.field_L = new TextButton(stackIn_18_3, (UiListener) null);
            if (this.field_R) {
              this.field_J = new TextButton(BevelTextPainter.field_t, (UiListener) (this));
            }
          }
          this.field_O.field_r = (WidgetPainter) ((Object) new BevelTextPainter(10000536));
          this.field_G.field_r = (WidgetPainter) ((Object) new PasswordFieldPainter(10000536));
          var6 = new MenuButtonPainter();
          this.field_P.field_r = (WidgetPainter) ((Object) var6);
          if (null != this.field_L) {
            this.field_L.field_r = (WidgetPainter) ((Object) var6);
          }
          if (this.field_J != null) {
            this.field_J.field_r = (WidgetPainter) ((Object) var6);
          }
          this.field_O.field_q = AccountRegistrationPanel.field_L;
          if (this.field_J != null) {
            this.field_J.field_q = dh.field_Bb;
          }
          if (this.field_F) {
            this.field_L.field_q = fo.field_e;
            if (var11 != 0) {
              if (!this.field_N) {
                this.field_L.field_r = (WidgetPainter) ((Object) new LinkButtonPainter());
                this.field_L.field_q = hj.field_c;
                this.field_L.field_r = (WidgetPainter) ((Object) new LinkButtonPainter());
              } else {
                this.field_L.field_q = hj.field_c;
                this.field_L.field_r = (WidgetPainter) ((Object) new LinkButtonPainter());
              }
            }
          } else {
            boolean decompiledSharedTail2 = (this.field_N);
            if (!decompiledSharedTail2) {
              this.field_L.field_r = (WidgetPainter) ((Object) new LinkButtonPainter());
              decompiledSharedTail2 = (var11 != 0);
            }
            if (decompiledSharedTail2) {
              this.field_L.field_q = hj.field_c;
              this.field_L.field_r = (WidgetPainter) ((Object) new LinkButtonPainter());
            }
          }
          this.field_j = 15;
          var7 = ia.field_c;
          if (this.field_E != null) {
            this.field_j = this.field_j + (5 + var7.paragraphHeight(this.field_E, -40 + this.field_v, var7.field_C));
          }
          var8 = GrowableIntList.field_b;
          var9 = oj.readLastLoginMethod(122, IconButtonPainter.getApplet(117));
          if (var9 == DiskCacheRequest.field_y) {
            var8 = BirthDateEntryPanel.field_H;
            if ((var11 != 0) &&
              (of.field_n == var9)) {
              var8 = wh.field_b;
            }
          } else {
            if (of.field_n == var9) {
              var8 = wh.field_b;
            }
          }
          dupTemp$0 = new LabeledField(10, this.field_j, this.field_v - 20, 25, this.field_O, false, 80, 3, var7, 16777215, var8);
          var10 = dupTemp$0;
          this.addChild(-108, dupTemp$0);
          this.field_j = this.field_j + (((UiComponent) ((Object) var10)).field_k + 5);
          dupTemp$1 = new LabeledField(10, this.field_j, this.field_v - 20, 25, this.field_G, false, 80, 3, var7, 16777215, ValidationState.field_a);
          var10Lifetime1 = dupTemp$1;
          this.addChild(-108, dupTemp$1);
          this.field_P.field_o = (UiListener) (this);
          this.field_j = this.field_j + (((UiComponent) ((Object) var10Lifetime1)).field_k + 5);
          if (this.field_J != null) {
            this.field_J.field_o = (UiListener) (this);
          }
          if (null != this.field_L) {
            this.field_L.field_o = (UiListener) (this);
          }
          boolean decompiledSharedTail1 = (this.field_J != null);
          if (!decompiledSharedTail1) {
            this.field_P.setBounds(30, this.field_j, -10 + (this.field_v - 6), 8, -80);
            this.field_j = this.field_j + 35;
            decompiledSharedTail1 = (var11 != 0);
          }
          if (decompiledSharedTail1) {
            this.field_P.setBounds(30, this.field_j, -95 + this.field_v, 85, -126);
            this.field_j = this.field_j + 60;
          }
          if (null != this.field_J) {
            this.field_J.setBounds(30, this.field_j, -10 + (-6 + this.field_v), 8, -78);
            this.field_j = this.field_j + 35;
          }
          if (this.field_L != null) {
            boolean decompiledSharedTail0 = (!(this.field_F) &&
              !(this.field_N));
            if (!decompiledSharedTail0) {
              this.field_L.setBounds(30, this.field_j, this.field_v - 16, 8, -51);
              this.field_j = this.field_j + 35;
              decompiledSharedTail0 = (var11 != 0);
            }
            if (decompiledSharedTail0) {
              this.field_L.setBounds(20, this.field_j, 40, 8, -100);
              this.field_j = this.field_j + 25;
            }
          }
          this.setBounds(3 + this.field_j, 0, this.field_v, 0, -111);
          this.addChild(-105, this.field_P);
          if (null != this.field_J) {
            this.addChild(-93, this.field_J);
          }
          if (null != this.field_L) {
            this.addChild(-100, this.field_L);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_91_0 = var6_ref;
          stackIn_91_1 = new StringBuilder().append("e.<init>(");
          if (param0 == null) {
            stackIn_92_2 = "null";
          } else {
            stackIn_92_2 = "{...}";
          }
          stackIn_95_1 = ((StringBuilder) (Object) stackIn_91_1).append(stackIn_92_2).append(',');
          if (param1 == null) {
            stackIn_96_2 = "null";
          } else {
            stackIn_96_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_91_0), ((StringBuilder) (Object) stackIn_95_1).append(stackIn_96_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void submitLogin(byte param0) {
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (NanoFrameClock.b(true) ||
            !(this.field_O.field_g.length() <= 0) &&
            !(this.field_G.field_g.length() <= 0)) {
            UsernameCredentials.a(this.field_O.field_g, 0, this.field_G.field_g);
          }
          var2_int = -118 % ((param0 + 17) / 46);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var2), "e.O(" + param0 + ')');
        }
    }

    public final void onButtonActivated(boolean param0, int param1, int param2, int param3, TextButton param4) {
        int var7 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (!param0) {
            LoginPanel.isSingleRepeatedCharacter(-36, (String) null);
          }
          if (this.field_P != param4) {
            if (param4 != this.field_J) {
              if (param4 != this.field_L) {
                return;
              }
              if (!this.field_F) {
                if (this.field_N) {
                  PatchEnvelopeSet.a(123);
                  if (var7 == 0) {
                    return;
                  }
                }
                kj.a(21744);
                if (var7 == 0) {
                  return;
                }
              }
              BoundedRandomAccessFile.b(28579);
              if (var7 == 0) {
                return;
              }
            }
            PacketBuffer.k(970210916);
            if (var7 == 0) {
              return;
            }
          }
          this.submitLogin((byte) -69);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_35_0 = var6;
          stackIn_35_1 = new StringBuilder().append("e.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    final static boolean isDigit(int param0, char param1) {
        RuntimeException var2 = null;
        boolean stackIn_10_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 30) {
            field_C = (String) null;
          }
          stackIn_10_0 = (param1 >= 48) && (57 >= param1);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var2), "e.K(" + param0 + ',' + param1 + ')');
        }
    }

    final String getUsername(boolean param0) {
        RuntimeException var2 = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            this.field_G = (EditableTextWidget) null;
          }
          if (this.field_O.field_g == null) {
            stackIn_7_0 = "";
            return stackIn_7_0;
          }
          stackIn_9_0 = this.field_O.field_g;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var2), "e.L(" + param0 + ')');
        }
    }

    final static boolean isSingleRepeatedCharacter(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var2_int = param1.charAt(0);
          var3 = 1;
          if (param0 != -12055) {
            return true;
          }
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(param1.length() > var3)))) {
            stackIn_15_0 = ~var2_int;
            if (var4 == 0) {
              if (stackIn_15_0 != ~param1.charAt(var3)) {
                return false;
              }
              var3++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_15_0 = 1;
          }
          return stackIn_15_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_19_0 = var2;
          stackIn_19_1 = new StringBuilder().append("e.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static int submitAccountCreation(ConditionalTextValue param0, int param1, ConditionalTextValue param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 54 % ((param1 - 33) / 52);
          stackIn_1_0 = cj.a(false, (byte) -91, 0, param0, 0, param2, (String) null);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_5_0 = var3;
          stackIn_5_1 = new StringBuilder().append("e.F(");
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
          throw aa.wrapException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_C = "You are on <%0>";
        field_D = "The spell you have in this arena is Arcane Flash. This spell is for close range only and doesn't deal much damage. It will, however, throw anything it hits into the distance<br>(Hopefully into the water!)<br>Select Arcane Flash from your spellbook.";
    }
}
