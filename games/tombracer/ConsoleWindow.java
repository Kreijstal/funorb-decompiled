/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ConsoleWindow implements ShellListener {
    private static String[] field_l;
    private static String[] field_f;
    BitmapFont field_m;
    static String field_n;
    String field_t;
    private int field_k;
    ScrollPane field_a;
    UiComponent field_p;
    EditableTextField field_o;
    static ToolkitSprite field_d;
    static String field_e;
    private UiComponent field_i;
    private IntrusiveDeque field_s;
    private int field_h;
    private boolean open;
    private int field_c;
    private String[] field_b;
    private ConsoleHistoryEntry field_g;
    private String field_r;
    private int field_q;

    private final void addToHistory(boolean param0, String param1) {
        ConsoleHistoryEntry var3 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (!param0) {
            this.field_h = -36;
          }
          var3 = (ConsoleHistoryEntry) (this.field_s.first(-80));
          if (var3 == null ||
            !param1.equals(var3.field_h)) {
            this.field_s.addFirst((byte) 88, (IntrusiveNode) (new ConsoleHistoryEntry(param1)));
          }
          if (this.field_s.size((byte) -16) > 30) {
            this.field_s.pollLast((byte) 22);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("uta.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final void printColouredText(int param0, String param1, int param2) {
        int var7 = 0;
        int var4_int = 0;
        String[] var5 = null;
        String[] var6 = null;
        String var8 = null;
        IntrusiveDeque var9 = null;
        ConsoleHistoryEntry var10 = null;
        int var11 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          var4_int = -10 + this.field_a.field_G - 15;
          var5 = rga.splitPreservingEmptyParts(32287, param1, '\n');
          if (param0 != 24219) {
            this.isModal(-59);
          }
          var6 = var5;
          for (var7 = 0; var7 < var6.length; var7++) {
            var8 = var6[var7];
            if (var4_int <= this.field_m.stringWidth(var8)) {
              var9 = this.wrapText(var4_int, true, var8);
              var10 = (ConsoleHistoryEntry) (var9.first(param0 ^ -24277));
              while (var10 != null) {
                this.appendLine(var10.field_h, param2, 230);
                var10 = (ConsoleHistoryEntry) (var9.next(param0 ^ 24289));
              }
            } else {
              this.appendLine(var8, param2, param0 - 23989);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("uta.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    private final IntrusiveDeque wrapText(int param0, boolean param1, String param2) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        IntrusiveDeque stackIn_25_0 = null;
        IntrusiveDeque stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        IntrusiveDeque var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var7Lifetime1;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          var4 = new IntrusiveDeque();
          scanLoop1: while (param2 != null) {
            boolean decompiledFrameRemainder0 = true;
            var5 = this.field_m.stringWidth(param2);
            var6 = param2;
            if (var5 > param0) {
              var7 = -1 + param2.length();
              while (var7 > 0) {
                stackIn_12_0 = var5;
                stackIn_12_1 = param0;
                if (stackIn_12_0 > stackIn_12_1 ||
                  32 != param2.charAt(var7)) {
                  incrementValue$0 = var7;
                  var7--;
                  var5 = var5 - this.field_m.charWidth(param2.charAt(incrementValue$0));
                  continue;
                }
                break;
              }
              if (var7 != 0) {
                var9 = param2.substring(0, var7);
                param2 = param2.substring(var7 + 1);
                var4.addLast((byte) -128, new ConsoleHistoryEntry(var9));
                continue scanLoop1;
              }
              var5 = this.field_m.stringWidth(param2);
              var7Lifetime1 = param2.length() - 1;
              while (var5 > param0) {
                incrementValue$1 = var7Lifetime1;
                var7Lifetime1--;
                var5 = var5 - this.field_m.charWidth(param2.charAt(incrementValue$1));
              }
              var6 = param2.substring(0, var7Lifetime1);
              param2 = param2.substring(var7Lifetime1 + 1);
              decompiledFrameRemainder0 = false;
            }
            else {
              param2 = null;
            }
            var4.addLast((byte) -128, new ConsoleHistoryEntry(var6));
          }
          if (param1) {
            stackIn_27_0 = var4;
            return stackIn_27_0;
          }
          stackIn_25_0 = (IntrusiveDeque) null;
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_30_0 = var4_ref;
          stackIn_30_1 = new StringBuilder().append("uta.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    abstract String[] getCompletions(boolean param0);

    public static void releaseStatics(int param0) {
        field_f = null;
        field_d = null;
        field_e = null;
        field_n = null;
        field_l = null;
        if (param0 != 0) {
          field_n = (String) null;
        }
    }

    private final UiComponent createColouredPanel(int param0, byte param1, int param2) {
        UiComponent var4 = new UiComponent(0L, (UiComponent) null);
        int var5 = 39 / ((-89 - param1) / 36);
        var4.field_w = RoomLighting.a(param2, param0, 4);
        return var4;
    }

    private final UiComponent createSelectionStyle(int param0, int param1) {
        int var4 = -128 / ((-18 - param0) / 61);
        UiComponent var3 = new UiComponent(0L, (UiComponent) null);
        var3.field_w = eca.a(4, param1);
        return var3;
    }

    public final boolean isModal(int param0) {
        if (param0 != -2) {
          return true;
        }
        return this.open;
    }

    public void drawOverlay(int param0) {
        int var4 = 0;
        int var2 = 0;
        int var3 = 0;
        int var5 = TombRacer.field_G ? 1 : 0;
        int var2Lifetime1;
        int var3Lifetime1;
        if (param0 != 1) {
          ConsoleWindow.releaseStatics(24);
        }
        if (!(this.field_i.field_t + this.field_i.field_T <= 0)) {
          SoftwareRasterizer.fillRectangleAlpha(this.field_i.field_q, this.field_i.field_A, this.field_a.field_qb, this.field_i.field_t, 5592405, 230);
          SoftwareRasterizer.fillRectangleAlpha(this.field_a.field_q + this.field_a.field_G, this.field_i.field_A, this.field_a.field_qb, this.field_i.field_t, 5592405, 230);
          SoftwareRasterizer.fillRectangleAlpha(this.field_a.field_q, this.field_i.field_A, this.field_a.field_G, this.field_a.field_T, 5592405, 230);
          SoftwareRasterizer.fillRectangleAlpha(this.field_a.field_q, this.field_a.field_A + this.field_a.field_t, this.field_a.field_G, -this.field_a.field_t - this.field_a.field_A + this.field_o.field_A, 5592405, 230);
          SoftwareRasterizer.fillRectangleAlpha(this.field_a.field_q, this.field_o.field_t + this.field_o.field_A, this.field_a.field_G, this.field_i.field_t - this.field_o.field_T - this.field_o.field_t, 5592405, 230);
          SoftwareRasterizer.fillRectangleAlpha(this.field_a.field_q, this.field_a.field_A, this.field_a.field_G, this.field_a.field_t, 2236962, 240);
          SoftwareRasterizer.fillRectangleAlpha(this.field_o.field_q, this.field_o.field_A, this.field_o.field_G, this.field_o.field_t, 2236962, 240);
          var2 = this.field_i.field_T + 256;
          if (var2 < 0) {
            var2 = 0;
          }
          SoftwareRasterizer.fillRectangleAlpha(this.field_i.field_q, this.field_i.field_t + this.field_i.field_A, this.field_i.field_G, -this.field_i.field_t + FloatPacketBuffer.field_i - this.field_i.field_A, 0, var2 >> 1);
          var3 = this.field_i.field_t + (this.field_i.field_T + 5);
          for (var4 = 0; 6 > var4; var4++) {
            SoftwareRasterizer.drawHorizontalLineAlpha(0, var3, mma.field_a, 0, var4 << 5);
            var3--;
          }
          this.field_i.drawFullScreen(100, (this.field_h & 8) == 0 ? true : false);
        }
        if (this.field_b != null &&
          this.open) {
          var2Lifetime1 = this.field_i.field_t + this.field_i.field_T;
          this.field_p.field_T = var2Lifetime1;
          this.field_p.drawFullScreen(74, false);
          var2Lifetime1 = var2Lifetime1 + (5 + this.field_k);
          for (var3Lifetime1 = 0; this.field_b.length > var3Lifetime1; var3Lifetime1++) {
            this.field_m.drawText(this.field_b[var3Lifetime1], this.field_p.field_q + 10, var2Lifetime1, 13421772, -1);
            var2Lifetime1 = var2Lifetime1 + this.field_k;
          }
        }
    }

    final static void setTextureSize(int param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        if (param2 != LegacyOpenGlTurbulentTextureEffect.textureWidth) {
          LobbyGameWidget.textureColumnCoords = new int[param2];
          for (var3_int = 0; var3_int < param2; var3_int++) {
            LobbyGameWidget.textureColumnCoords[var3_int] = (var3_int << 12) / param2;
          }
          ooa.field_g = 32 * param2;
          GpuDataType.textureWidthMask = -1 + param2;
          LegacyOpenGlTurbulentTextureEffect.textureWidth = param2;
        }
        if (param0 != 0) {
          return;
        }
        try {
          if (param1 != ArchiveNetworkClient.textureHeight) {
            if (param1 == LegacyOpenGlTurbulentTextureEffect.textureWidth) {
              sj.textureRowCoords = LobbyGameWidget.textureColumnCoords;
            } else {
              sj.textureRowCoords = new int[param1];
              for (var3_int = 0; param1 > var3_int; var3_int++) {
                sj.textureRowCoords[var3_int] = (var3_int << 12) / param1;
              }
            }
            hba.textureHeightMask = -1 + param1;
            ArchiveNetworkClient.textureHeight = param1;
          }
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "uta.L(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final UiComponent createFilledPanel(byte param0, int param1) {
        UiComponent var3 = new UiComponent();
        if (param0 <= 80) {
          String var4 = (String) null;
          this.addToHistory(true, (String) null);
        }
        var3.field_w = RoomLighting.a(param1, 0, 4);
        return var3;
    }

    private final UiComponent createLineWidget(String param0, int param1, int param2) {
        UiComponent var4 = null;
        RuntimeException var4_ref = null;
        UiComponent stackIn_2_0 = null;
        UiComponent stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new UiComponent(0L, (UiComponent) null, param0);
          if (param1 != 16733525) {
            stackIn_2_0 = (UiComponent) null;
            return stackIn_2_0;
          }
          var4.field_H = this.field_m;
          var4.field_ib = param2;
          var4.setBounds(this.field_m.stringWidth(var4.field_r), this.field_k, -23776, 0, 5);
          stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("uta.J(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public boolean handleKey(byte param0, char param1, int param2) {
        IntrusiveNode stackIn_19_1 = null;
        UiComponent var5;
        int var6;
        String var7;
        var6 = TombRacer.field_G ? 1 : 0;
        if (param0 != -72) {
          field_l = (String[]) null;
        }
        if (96 == param1) {
          this.toggleOpen(2);
          return true;
        }
        if (!this.open) {
          return false;
        }
        if (84 != param2) {
          if (param2 != 98) {
            if (99 == param2) {
              if (this.field_g != null &&
                this.field_s.sentinel != this.field_g.previous) {
                this.field_g = (ConsoleHistoryEntry) (this.field_g.previous);
                this.field_o.setText((byte) 74, this.field_g.field_h);
              }
            } else {
              if (param2 != 80) {
                this.field_o.handleKey(param2, param0 - 19624, param1);
              } else {
                this.autocomplete(param0 + 21375);
              }
            }
          } else {
            if (this.field_g == null ||
              this.field_g.next != this.field_s.sentinel) {
              if (null != this.field_g) {
                stackIn_19_1 = this.field_g.next;
              } else {
                stackIn_19_1 = this.field_s.first(-80);
              }
              this.field_g = (ConsoleHistoryEntry) (stackIn_19_1);
              if (this.field_g != null) {
                this.field_o.setText((byte) 12, this.field_g.field_h);
              }
            }
          }
        } else {
          var7 = this.field_o.getText((byte) -124);
          if (var7.length() <= 0) {
            return true;
          }
          this.printColouredText(24219, this.field_t + var7, 5635925);
          var5 = (UiComponent) (this.field_a.field_tb.field_J.last(3));
          if (!this.executeCommand(var7, (byte) -112)) {
            var5.field_ib = 16733525;
          }
          this.field_o.clear((byte) -113);
          this.addToHistory(true, var7);
          this.field_g = null;
        }
        return true;
    }

    final void printLine(int param0, String param1) {
        try {
          this.printColouredText(24219, param1, 13421772);
          int var3_int = 22 / ((param0 - 82) / 40);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "uta.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void printResult(byte param0, Object param1) {
        try {
          if (param0 > -15) {
            field_f = (String[]) null;
          }
          this.printLine(126, param1 != null ? param1.toString() : "null");
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "uta.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    abstract void autocomplete(int param0);

    abstract boolean executeCommand(String param0, byte param1);

    private final void toggleOpen(int param0) {
        boolean stackIn_3_1 = false;
        stackIn_3_1 = !(this.open);
        this.open = stackIn_3_1;
        if (param0 != 2) {
          this.updateScreen(false, false);
        }
        if (!this.open) {
          if (null != this.field_i) {
            this.field_i.propagateStyle(param0 ^ -125, (UiComponent) null);
          }
        } else {
          this.field_q = 15;
          if (null != this.field_i) {
            this.field_i.propagateStyle(param0 ^ -112, this.field_o);
          }
        }
    }

    public final void updateScreen(boolean param0, boolean param1) {
        int var4 = 0;
        int var3;
        int var5;
        int var6;
        var6 = TombRacer.field_G ? 1 : 0;
        if (this.open &&
          this.field_q > 0) {
          this.field_q = this.field_q - 1;
          this.field_i.field_T = this.field_q * (this.field_q * -200) / 225;
        } else {
          if (!this.open &&
            this.field_i.field_T + 200 > 0) {
            this.field_i.field_T = this.field_i.field_T - 28;
          }
        }
        if (!this.field_o.getText((byte) -117).equals(this.field_r) ||
          this.field_o.getCaret(-1320) != this.field_c) {
          this.field_r = this.field_o.getText((byte) -121);
          this.field_c = this.field_o.getCaret(-1320);
          this.field_b = this.getCompletions(false);
          if (this.field_b != null &&
            this.field_b.length == 0) {
            this.field_b = null;
          }
          if (null != this.field_b) {
            var3 = 0;
            for (var4 = 0; var4 < this.field_b.length; var4++) {
              var5 = this.field_m.stringWidth(this.field_b[var4]);
              if (var3 < var5) {
                var3 = var5;
              }
            }
            this.field_p.field_G = 20 + var3;
            this.field_p.field_t = this.field_b.length * this.field_k + 15;
          }
        }
        this.field_h = this.field_h + 1;
        this.field_i.layoutFullScreen(83, param1);
        this.field_a.updateScroll(param0, 0, this.field_k * 2 * pg.field_y, this.field_k);
        this.field_o.handleMouseSelection((byte) 87);
    }

    final static HiscoreTable getOrRequestHiscoreTable(int param0, int param1, int param2, int param3, int param4) {
        int var6 = TombRacer.field_G ? 1 : 0;
        if (param2 != 0) {
          field_f = (String[]) null;
        }
        HiscoreTable var5 = (HiscoreTable) (TimingPattern.field_b.first(-80));
        while (var5 != null) {
          if (param1 == var5.field_n) {
            return var5;
          }
          var5 = (HiscoreTable) (TimingPattern.field_b.next(126));
        }
        var5 = new HiscoreTable();
        var5.field_j = param3;
        var5.field_i = param4;
        var5.field_n = param1;
        TimingPattern.field_b.addLast((byte) -48, var5);
        BeamSegment.sendHiscoreTableRequest(false, param0, var5);
        return var5;
    }

    private final void appendLine(String param0, int param1, int param2) {
        int var4_int = 0;
        UiComponent var5 = null;
        int var6 = TombRacer.field_G ? 1 : 0;
        try {
          this.field_a.field_tb.addChild(param2 ^ -155, this.createLineWidget(param0, 16733525, param1));
          if (this.field_a.field_tb.field_J.size((byte) -16) > 256) {
            this.field_a.field_tb.field_J.removeFirst(-106);
          }
          var4_int = 5;
          var5 = (UiComponent) (this.field_a.field_tb.field_J.first(-80));
          while (var5 != null) {
            var5.field_T = var4_int;
            var4_int = var4_int + this.field_k;
            var5 = (UiComponent) (this.field_a.field_tb.field_J.next(116));
          }
          if (param2 != 230) {
            this.field_i = (UiComponent) null;
          }
          this.field_a.field_tb.field_t = var4_int;
          this.field_a.field_tb.field_T = -var4_int + this.field_a.field_t;
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "uta.U(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    ConsoleWindow(BitmapFont param0, PlatformTaskDispatcher param1) {
        int var3_int = 0;
        UiComponent var4 = null;
        UiComponent var5 = null;
        UiComponent var6 = null;
        UiComponent var7 = null;
        UiComponent var8 = null;
        UiComponent var9 = null;
        UiComponent var10 = null;
        UiComponent var11 = null;
        UiComponent var12 = null;
        VerticalScrollbar var13 = null;
        UiComponent var14 = null;
        UiComponent var15 = null;
        this.field_t = "# ";
        this.field_s = new IntrusiveDeque();
        this.open = false;
        this.field_h = 0;
        this.field_b = null;
        this.field_q = 0;
        try {
          this.field_m = param0;
          this.field_k = this.field_m.field_w + this.field_m.field_k;
          var3_int = 4 + this.field_k;
          var4 = this.createFilledPanel((byte) 104, 65793);
          var5 = var4;
          var6 = var4;
          var7 = var4;
          var8 = this.createColouredPanel(7829367, (byte) 31, 2236962);
          var9 = this.createColouredPanel(65793, (byte) 21, 65793);
          var10 = this.createColouredPanel(3355443, (byte) -126, 65793);
          var11 = this.createSelectionStyle(-91, 2263074);
          var12 = this.createColouredPanel(2236962, (byte) -125, 65793);
          this.field_i = new UiComponent(0L, var5);
          this.field_i.setBounds(mma.field_a, 200, -23776, -200, 0);
          var13 = new VerticalScrollbar(0L, var8, var8, var9, var10);
          var14 = new UiComponent();
          var14.field_J = new IntrusiveDeque();
          this.field_a = new ScrollPane(0L, var14, var6, var13);
          this.field_a.field_tb.field_J = new IntrusiveDeque();
          this.field_a.setPaneBounds(this.field_i.field_G - 10, 0, (byte) 127, 5, 15, -var3_int + 185, 5);
          this.field_i.addChild(-128, this.field_a);
          var15 = new UiComponent();
          var15.field_H = this.field_m;
          var15.field_ib = 13421772;
          var15.field_S = 5;
          var15.field_V = 2;
          this.field_o = new EditableTextField(0L, var7, var11, var15);
          this.field_o.setFieldBounds(this.field_a.field_G, 127, this.field_a.field_T + this.field_a.field_t + 5, var3_int, this.field_a.field_qb);
          this.field_o.setClipboardDispatcher(param1, (byte) -127);
          this.field_i.addChild(-126, this.field_o);
          this.field_p = new UiComponent(0L, var12);
          this.field_p.field_qb = 0;
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "uta.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = new String[2];
        field_l[1] = "Lava";
        field_l[0] = "Normal";
        field_n = "Death penalty <%0>";
        field_f = new String[9];
        field_f[4] = "Room: Windy";
        field_f[5] = "Room: Lights Out";
        field_f[7] = "Flip";
        field_f[2] = "Weapon Jammed";
        field_f[8] = "Tremors";
        field_f[6] = "Monsters";
        field_f[0] = "Slow Player";
        field_f[3] = "Difficulty Up";
        field_f[1] = "Invert Controls";
        field_e = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
    }
}
