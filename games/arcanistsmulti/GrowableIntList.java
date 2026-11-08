/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GrowableIntList {
    static MidiPcmStream field_h;
    static String field_f;
    static String field_i;
    private int field_k;
    private int[] field_j;
    private boolean field_d;
    static String field_e;
    static String field_l;
    static SceneWidget field_a;
    static Js5Transport field_c;
    static String field_b;
    static String[] field_g;
    private int field_m;

    final static void showTextOverlay(int param0, String param1) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4Lifetime1;
        try {
          IntrusiveNode.field_d = true;
          ScreenClearHelpers.field_c.field_rb = param1;
          var2_int = GameSelectionHelpers.field_m.field_e;
          var3 = GameSelectionHelpers.field_m.field_m;
          var4 = -22 % ((-64 - param0) / 46);
          var4Lifetime1 = ScreenClearHelpers.field_c.field_Z.paragraphHeight(param1, 272, ScreenClearHelpers.field_c.field_z);
          var5 = -103 + var3 / 2 - var4Lifetime1 / 2;
          LinkButtonPainter.field_h.setBounds(320, (-320 + var2_int) / 2, var5, -120 + var3 - 2 * var5, (byte) -120);
          LinkButtonPainter.field_h.field_v = GradientBarPainter.createGradientFrame(3, LinkButtonPainter.field_h.field_I, 1, 2105376, 11579568, 8421504);
          ScreenClearHelpers.field_c.setBounds(-24 + (LinkButtonPainter.field_h.field_x - 24), 24, 16, -20 + (LinkButtonPainter.field_h.field_I - 24), (byte) -120);
          AlphaContainer.field_E.setBounds(80, 120, LinkButtonPainter.field_h.field_I - 44, 24, (byte) -120);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("jl.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final void removeAt(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (0 <= param0 &&
            this.field_m >= param0) {
            if (param1 != -11292) {
              return;
            }
            if (~this.field_m != ~param0) {
              ArraySupport.copyInts(this.field_j, param0 + 1, this.field_j, param0, this.field_m - param0);
            }
            this.field_m = this.field_m - 1;
            return;
          }
          throw new ArrayIndexOutOfBoundsException(param0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var3), "jl.D(" + param0 + ',' + param1 + ')');
        }
    }

    final int get(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_m < param1) {
            throw new ArrayIndexOutOfBoundsException(param1);
          }
          if (param0 != 31103) {
            field_e = (String) null;
          }
          stackIn_8_0 = this.field_j[param1];
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var3), "jl.F(" + param0 + ',' + param1 + ')');
        }
    }

    final static String getChatInputCaption(int param0) {
        String stackIn_3_0 = null;
        String stackIn_63_0 = null;
        Object stackIn_103_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object var1 = null;
        Object var2 = null;
        String var3 = null;
        String var4 = null;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        var10 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var1 = null;
          if (param0 != 0) {
            stackIn_3_0 = (String) null;
            return stackIn_3_0;
          }
          var2 = null;
          if (NameCheckHelpers.field_c == 0 &&
            null != CapsuleBar.field_x) {
            var2 = GameListHelpers.field_i;
          }
          if (2 == NameCheckHelpers.field_c &&
            !PaddedContainer.isLoginNameValid(false)) {
            boolean decompiledSharedTail1 = !(!ArrayWidgetContainer.hasEntryNamed(GridContainer.field_S, 1));
            if (!decompiledSharedTail1) {
              var2 = CachedArchiveProvider.formatTemplate(125, new String[]{MenuInputState.field_p}, ViewportSetupHelpers.field_b);
              decompiledSharedTail1 = (var10 != 0);
            }
            if (decompiledSharedTail1) {
              var2 = CachedArchiveProvider.formatTemplate(-41, new String[]{MenuInputState.field_p}, QuickChatCategory.field_m);
            }
            if (LoginMethodHelpers.field_i) {
              LobbyLayoutHelpers.addChatMessage(0, (byte) 83, (String) (var2), (String) null, 2, (String) null);
              QuickChatHelpers.closeQuickChatIfOpen(3);
            }
          }
          if (var2 == null &&
            !NodeHashTable.field_j &&
            IntensityTableHelpers.field_d == null) {
            var2 = LoginResultHelpers.field_a;
          }
          boolean decompiledFrameRemainder0 = true;
          if (null != var2) {
            TimedMessage.showSavedLayout(ArchiveIndex.field_u, (String) (var2), 0, (String) null, param0 ^ -96);
            decompiledFrameRemainder0 = (var10 != 0);
          }
          if (decompiledFrameRemainder0) {
            var3 = AccountFlowHelpers.field_b;
            var3 = MusicPatch.prefixRankIcon(var3, -2);
            var4 = "";
            var5 = "|";
            var6 = NameCheckHelpers.field_c;
            var7 = 0;
            if (var6 == 2) {
              var4 = CachedArchiveProvider.formatTemplate(-99, new String[]{MenuInputState.field_p}, BattleAction.field_n);
              var8 = CachedArchiveProvider.formatTemplate(-51, new String[]{var3}, IterableNodeHashTable.field_f);
              var7 = -485 + (ConfirmScene.field_Cb.field_x + SingleChildContainer.field_D.field_x + QuickChatCategory.field_x.textWidth(var8)) - QuickChatCategory.field_x.textWidth(var4);
              if (0 > var7) {
                var7 = 0;
              }
            } else {
              if (0 == var6) {
                if (DirectByteStorage.field_f == null &&
                  Cp1252Helpers.field_c) {
                  var4 = "[" + NanoFrameClock.field_p + "] ";
                }
                if (null != DirectByteStorage.field_f) {
                  boolean decompiledSharedTail0 = (!(CalendarHelpers.field_a) ||
                    StatusMessageHelpers.field_d == null);
                  if (!decompiledSharedTail0) {
                    var4 = "[" + StatusMessageHelpers.field_d + "] ";
                    decompiledSharedTail0 = (var10 != 0);
                  }
                  if (decompiledSharedTail0) {
                    var4 = "[" + CachedArchiveProvider.formatTemplate(param0 + 126, new String[]{DirectByteStorage.field_f.field_ic}, Bzip2State.field_j) + "] ";
                  }
                  var6 = 1;
                }
              }
              if (QuickChatPhrase.hasResizableListener((byte) -128)) {
                stackIn_63_0 = ": ";
              } else {
                stackIn_63_0 = "<img=3>: ";
              }
              var8 = stackIn_63_0;
              var4 = var4 + var3 + var8;
              if (!PaletteSpriteHelpers.field_g) {
                if (AlternateUsernameCredentials.field_p) {
                  var4 = "<col=999999>" + var4 + AudioShutdownHelpers.field_b + "</col>";
                  var5 = "";
                  if (var10 != 0) {
                    var4 = "<col=999999>" + var4 + GradientBarButton.field_N + "</col>";
                    var5 = "";
                  }
                }
              } else {
                var4 = "<col=999999>" + var4 + GradientBarButton.field_N + "</col>";
                var5 = "";
              }
              var9 = QuickChatCategory.field_x.textWidth(var4);
              if (!QuickChatPhrase.hasResizableListener((byte) -113)) {
                if (SingleChildContainer.field_D.field_C &&
                  (-SingleChildContainer.field_D.field_V + EmailLoginCredentials.field_g) < var9) {
                  if (!PaletteSpriteHelpers.field_g) {
                    var1 = AudioShutdownHelpers.field_b;
                  } else {
                    var1 = "Broken!";
                  }
                }
                if (SingleChildContainer.field_D.field_U != 0 &&
                  SingleChildContainer.field_D.field_cb < var9 &&
                  !PaletteSpriteHelpers.field_g) {
                  ScreenSwitchHelpers.resetLoginMode((byte) 104);
                }
              }
            }
            TimedMessage.showSavedLayout(ResizableViewResizeListener.field_c[var6], var4 + BitmapFont.escapeMarkup(ViewControllerHelpers.field_e.toString()), var7, var5, -126);
            if (!SocketJs5Transport.field_r) {
              ConfirmScene.field_Cb.field_C = false;
            }
            if (ConfirmScene.field_Cb.field_C) {
              var1 = CachedArchiveProvider.formatTemplate(-118, new String[]{var3, MenuInputState.field_p}, SceneTabStrip.field_Db);
            }
          }
          stackIn_103_0 = var1;
          return (String) (stackIn_103_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) (var1), "jl.G(" + param0 + ')');
        }
    }

    final void add(int param0, int param1) {
        try {
          this.set(false, param1 + this.field_m, param0);
        } catch (RuntimeException runtimeException) {
          throw CommonUiHelpers.wrapException((Throwable) ((Object) runtimeException), "jl.B(" + param0 + ',' + param1 + ')');
        }
    }

    final static Class classForDescriptor(String param0, int param1) throws ClassNotFoundException {
        int var2_int = 0;
        RuntimeException var2 = null;
        Class stackIn_2_0 = null;
        Class stackIn_6_0 = null;
        Class stackIn_10_0 = null;
        Class stackIn_16_0 = null;
        Class stackIn_19_0 = null;
        Class stackIn_23_0 = null;
        Class stackIn_28_0 = null;
        Class stackIn_33_0 = null;
        Class stackIn_35_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.equals("B")) {
            stackIn_2_0 = Byte.TYPE;
            return stackIn_2_0;
          }
          if (param0.equals("I")) {
            stackIn_6_0 = Integer.TYPE;
            return stackIn_6_0;
          }
          if (param0.equals("S")) {
            stackIn_10_0 = Short.TYPE;
            return stackIn_10_0;
          }
          if (param0.equals("J")) {
            stackIn_16_0 = Long.TYPE;
            return stackIn_16_0;
          }
          if (param0.equals("Z")) {
            stackIn_19_0 = Boolean.TYPE;
            return stackIn_19_0;
          }
          var2_int = -29 % ((-25 - param1) / 44);
          if (param0.equals("F")) {
            stackIn_23_0 = Float.TYPE;
            return stackIn_23_0;
          }
          if (param0.equals("D")) {
            stackIn_28_0 = Double.TYPE;
            return stackIn_28_0;
          }
          if (param0.equals("C")) {
            stackIn_33_0 = Character.TYPE;
            return stackIn_33_0;
          }
          stackIn_35_0 = Class.forName(param0);
          return stackIn_35_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_39_0 = var2;
          stackIn_39_1 = new StringBuilder().append("jl.C(");
          if (param0 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_f = null;
          field_g = null;
          field_i = null;
          field_b = null;
          if (param0 >= -122) {
            field_g = (String[]) null;
          }
          field_e = null;
          field_l = null;
          field_c = null;
          field_a = null;
          field_h = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var1), "jl.A(" + param0 + ')');
        }
    }

    final static int highestBitIndex(byte param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_11_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 0;
          if (param1 < 0 ||
            param1 >= 65536) {
            var2_int += 16;
            param1 = param1 >>> 16;
          }
          if (param1 >= 256) {
            param1 = param1 >>> 8;
            var2_int += 8;
          }
          if (param1 >= 16) {
            var2_int += 4;
            param1 = param1 >>> 4;
          }
          if (param0 != -79) {
            stackIn_11_0 = 43;
            return stackIn_11_0;
          }
          if (param1 >= 4) {
            var2_int += 2;
            param1 = param1 >>> 2;
          }
          if (param1 >= 1) {
            var2_int++;
            param1 = param1 >>> 1;
          }
          stackIn_19_0 = param1 + var2_int;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "jl.I(" + param0 + ',' + param1 + ')');
        }
    }

    private final void growTo(int param0, byte param1) {
        int[] var3 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (param1 <= 12) {
            this.field_m = -38;
          }
          var3 = new int[this.capacityFor((byte) 115, param0)];
          ArraySupport.copyInts(this.field_j, 0, var3, 0, this.field_j.length);
          this.field_j = var3;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var3_ref), "jl.E(" + param0 + ',' + param1 + ')');
        }
    }

    final int size(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 1) {
            stackIn_4_0 = 1 + this.field_m;
            return stackIn_4_0;
          }
          stackIn_2_0 = 12;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "jl.L(" + param0 + ')');
        }
    }

    private final void set(boolean param0, int param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param0) {
            this.add(-96, -127);
          }
          if (param1 > this.field_m) {
            this.field_m = param1;
          }
          if (this.field_j.length <= param1) {
            this.growTo(param1, (byte) 14);
          }
          this.field_j[param1] = param2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var4), "jl.K(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int capacityFor(byte param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var3_int = this.field_j.length;
          var4 = -48 % ((35 - param0) / 43);
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var3_int > param1))) {
            stackOut_3_0 = this.field_d;
            stackIn_14_0 = stackOut_3_0 ? 1 : 0;
            stackIn_4_0 = stackOut_3_0;
            if (var5 == 0) {
              if (stackIn_4_0) {
                if (0 == var3_int) {
                  var3_int = 1;
                  continue;
                }
                var3_int = var3_int * this.field_k;
                continue;
              }
              var3_int = var3_int + this.field_k;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_14_0 = var3_int;
          }
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var3), "jl.H(" + param0 + ',' + param1 + ')');
        }
    }

    private GrowableIntList() throws Throwable {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          throw new Error();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var1), "jl.<init>()");
        }
    }

    static {
        field_i = "<%0> has been defeated.";
        field_e = "Just to the left of this message box, you will see the time you have left for your turn. When this runs out you will forfeit your go, so be swift!";
        field_l = "No wands";
        field_f = "  Play will proceed with one player from each team taking turns to move. So even when a team is down to its last Arcanist, they will still have as many turns as the opposing team.<br>  Also, in Team Games, <u>you can control your allies' minions</u>! Work as a team to defend each other, trap the enemy and achieve victory. When setting up Unrated games, the teams will be divided into the top half of the players and the bottom half, also known as TvB.";
        field_b = "Login: ";
        field_g = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
    }
}
