/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RaceSetupMenu extends MenuList {
    private boolean field_w;
    private int[] controlActions;
    private int[] rowWidths;
    int[][] rowItemIds;
    static MusicTrack field_D;
    static String field_z;
    private int[] field_S;
    private int transitionTicks;
    static int field_C;
    private int[] rowScrollTargets;
    private int hoveredControl;
    String[] rowTitles;
    private int field_ab;
    private boolean field_t;
    private int field_Z;
    private int[] field_K;
    private int[] rowColors;
    private String field_L;
    private String[] field_O;
    String[][] rowLabels;
    private float[] rowScrollPositions;
    private int[] field_B;
    private int pendingSelection;
    static String field_v;
    private float verticalOffset;
    private float[] field_x;
    String[][] rowDescriptions;
    private int targetVerticalOffset;
    private int hoveredRow;
    Sprite[][] rowSprites;
    private int hoveredItem;
    static tk field_s;
    private int[] selectedValues;
    private int[] selectedIndices;
    private int menuId;
    private int[] field_I;
    int transitionState;
    static ArchiveKeyRequest field_y;

    final void activateItem(int param0, int param1) {
        if (param1 != -3565) {
          return;
        }
        this.activateRowSelection(param0, true, (byte) 122, false);
    }

    final void drawItem(int param0, int param1, boolean param2, byte param3) {
        if (param3 >= -75) {
          this.rowScrollPositions = (float[]) null;
        }
    }

    final void handleKey(boolean param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        boolean stackIn_10_0 = false;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = HoldTheLine.field_D;
        if (!param0) {
          this.rowScrollPositions = (float[]) null;
        }
        if (this.mouseHeld) {
          return;
        }
        if (DelayedServerPacket.field_n == 1 &&
          RotatedSpriteCache.field_c) {
          stackIn_10_0 = !(LoginCredentialType.field_c);
          LoginCredentialType.field_c = stackIn_10_0;
        }
        if (!pj.b((byte) 116) &&
          this.itemCount <= 1) {
          stackIn_16_0 = 0;
        } else {
          stackIn_16_0 = 1;
        }
        var2 = stackIn_16_0;
        stackIn_19_0 = (this.itemCount > 1) ? 0 : 2;
        var3 = stackIn_19_0;
        if (DelayedServerPacket.field_n == 98) {
          fieldTemp$0 = this.hoveredRow - 1;
          this.hoveredRow = this.hoveredRow - 1;
          if (0 > fieldTemp$0) {
            if (1 != this.hoveredControl) {
              if (0 == this.hoveredControl &&
                var2 != 0) {
                this.hoveredControl = 1;
                this.field_Z = var3;
                this.hoveredRow = -1;
                return;
              }
              this.hoveredControl = 0;
              this.hoveredRow = -1;
              return;
            }
            if (this.hoveredItem == -1) {
              this.hoveredItem = 0;
            }
            this.hoveredRow = this.selectedItem;
            this.hoveredControl = -1;
          } else {
            this.hoveredControl = -1;
            this.keyboardSelection = true;
            if (this.rowItemIds[this.hoveredRow].length != this.rowItemIds[this.hoveredRow + 1].length) {
              var4 = this.rowItemIds[this.hoveredRow].length - this.rowItemIds[1 + this.hoveredRow].length;
              this.hoveredItem = this.hoveredItem + var4 / 2;
              if (0 > this.hoveredItem) {
                this.hoveredItem = 0;
              }
              if (this.hoveredItem <= this.rowItemIds[this.hoveredRow].length - 1) {
                return;
              }
              this.hoveredItem = -1 + this.rowItemIds[this.hoveredRow].length;
              return;
            }
          }
        } else {
          if (DelayedServerPacket.field_n == 84) {
            if (this.hoveredControl != -1) {
              this.handleControlAction(this.hoveredControl, this.controlActions[this.hoveredControl], 2, -79);
              return;
            }
            if (this.hoveredRow == -1) {
              return;
            }
            if (this.hoveredItem == -1) {
              return;
            }
            this.selectItem(this.hoveredItem, this.hoveredRow, 16777215);
            this.activateRowSelection(this.hoveredRow, true, (byte) 122, false);
            this.keyboardSelection = true;
            return;
          }
          if (99 == DelayedServerPacket.field_n) {
            if (-1 != this.hoveredRow) {
              fieldTemp$1 = this.hoveredRow + 1;
              this.hoveredRow = this.hoveredRow + 1;
              if (fieldTemp$1 < this.itemCount) {
                this.keyboardSelection = true;
                this.hoveredControl = -1;
                if (this.rowItemIds[this.hoveredRow].length == this.rowItemIds[-1 + this.hoveredRow].length) {
                  return;
                }
                var4 = -this.rowItemIds[-1 + this.hoveredRow].length + this.rowItemIds[this.hoveredRow].length;
                this.hoveredItem = this.hoveredItem + var4 / 2;
                if (this.hoveredItem < 0) {
                  this.hoveredItem = 0;
                }
                if ((-1 + this.rowItemIds[this.hoveredRow].length) >= this.hoveredItem) {
                  return;
                }
                this.hoveredItem = this.rowItemIds[this.hoveredRow].length - 1;
                return;
              }
            }
            if (this.hoveredControl != 0) {
              if (this.hoveredControl != 1 &&
                var2 != 0) {
                this.hoveredRow = -1;
                this.field_Z = var3;
                this.hoveredControl = 1;
                return;
              }
              this.hoveredRow = -1;
              this.hoveredControl = 0;
              return;
            }
            this.hoveredRow = 0;
            this.hoveredControl = -1;
            if (this.hoveredItem == -1) {
              this.hoveredItem = 0;
              return;
            }
          } else {
            if (DelayedServerPacket.field_n == 1 &&
              IterableSecondaryNodeDeque.field_g[82] &&
              RotatedSpriteCache.field_c) {
              l.field_b = true;
              hk.field_d = -1 + MenuList.field_l[3];
              ao.field_b = 3;
              h.b((byte) -78);
              this.truncateAfterRow((byte) -77, 0);
              return;
            }
            if (this.hoveredControl != -1) {
              if (DelayedServerPacket.field_n == 96) {
                this.handleControlAction(this.hoveredControl, this.controlActions[this.hoveredControl], 1, -45);
              }
              if (97 == DelayedServerPacket.field_n) {
                this.handleControlAction(this.hoveredControl, this.controlActions[this.hoveredControl], 0, 3);
                return;
              }
            } else {
              if (this.hoveredRow == -1) {
                return;
              }
              if (DelayedServerPacket.field_n == 96) {
                fieldTemp$2 = this.hoveredItem - 1;
                this.hoveredItem = this.hoveredItem - 1;
                if (fieldTemp$2 < 0) {
                  this.hoveredItem = this.hoveredItem + 1;
                }
              }
              if (97 != DelayedServerPacket.field_n) {
                return;
              }
              fieldTemp$3 = this.hoveredItem + 1;
              this.hoveredItem = this.hoveredItem + 1;
              if (fieldTemp$3 >= this.rowItemIds[this.hoveredRow].length) {
                this.hoveredItem = this.hoveredItem - 1;
                return;
              }
            }
          }
        }
        return;
    }

    final boolean isClosed(byte param0) {
        int var2 = 78 / ((param0 - 19) / 59);
        return this.transitionState == 3 ? true : false;
    }

    private final void handleChoiceMouse(int param0) {
        int var6 = 0;
        int discarded$0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_39_2 = 0;
        int stackIn_40_3 = 0;
        int var2;
        float var2_float;
        int var3;
        int var4;
        int var5;
        int var7;
        int var8;
        int var2Lifetime1;
        int var2Lifetime2;
        int var3Lifetime1;
        int var4Lifetime1;
        var8 = HoldTheLine.field_D;
        if (this.transitionState == 1) {
          var2 = this.hitTestControl(FullscreenErrorDialog.field_X, -110, NodeHashTableIterator.field_g);
          if (var2 != -1 ||
            !this.keyboardSelection) {
            this.hoveredControl = var2;
            this.keyboardSelection = false;
          }
          var3 = this.hitTestRow(FullscreenErrorDialog.field_X, false);
          if (0 <= var3 &&
            this.itemCount > var3) {
            var4 = FullscreenErrorDialog.field_X - this.getRowY((byte) -113, var3);
            var5 = -1;
            if (var4 > 18 &&
              var4 < 102) {
              for (var6 = 0; this.rowItemIds[var3].length > var6; var6++) {
                var7 = NodeHashTableIterator.field_g - this.getItemX(var3, 4, var6);
                if (var7 > 24 &&
                  var7 < 136) {
                  var5 = var6;
                  break;
                }
              }
            }
            if (var5 != -1 ||
              !this.keyboardSelection) {
              this.hoveredRow = var3;
              this.hoveredItem = var5;
              this.keyboardSelection = false;
              if (this.hoveredItem != -1 &&
                this.itemCount - 1 == this.hoveredRow) {
                this.selectItem(this.hoveredItem, this.hoveredRow, 16777215);
                ArchiveCatalog.a(1, (byte) 125, 13, this.hoveredItem);
              }
            }
          }
        }
        if (this.itemCount - 1 == this.hoveredRow) {
          var2_float = (float)NodeHashTableIterator.field_g / 640.0f;
          this.scrollRowTo(this.itemCount - 1, -1, (int)((float)this.rowWidths[-1 + this.itemCount] * var2_float));
        }
        if (ValidationIndicator.field_J != 0) {
          if (0 == this.transitionState) {
            this.transitionTicks = 0;
            this.verticalOffset = (float)this.targetVerticalOffset;
            this.transitionState = 1;
            return;
          }
          if (this.transitionState == 2) {
            this.transitionTicks = 0;
            this.transitionState = 3;
            this.verticalOffset = (float)this.targetVerticalOffset;
            return;
          }
          if (this.hoveredControl != -1) {
            var2Lifetime1 = this.hitTestControl(FullscreenErrorDialog.field_X, -108, NodeHashTableIterator.field_g);
            if (var2Lifetime1 != this.hoveredControl) {
              return;
            }
            stackIn_39_1 = this.hoveredControl;
            stackIn_39_2 = this.controlActions[this.hoveredControl];
            if (1 != ValidationIndicator.field_J) {
              stackIn_40_3 = 4;
            } else {
              stackIn_40_3 = 3;
            }
            this.handleControlAction(stackIn_39_1, stackIn_39_2, stackIn_40_3, -69);
            return;
          }
        }
        if (ValidationIndicator.field_J == 1 &&
          NodeHashTableIterator.field_g != -1) {
          this.hoveredRow = this.hitTestRow(ValidatedTextField.field_U, false);
          if (this.hoveredRow >= 0 &&
            this.hoveredRow < this.itemCount) {
            var2Lifetime2 = ValidatedTextField.field_U - this.getRowY((byte) -113, this.hoveredRow);
            if (var2Lifetime2 > 18 &&
              94 > var2Lifetime2) {
              for (var3Lifetime1 = 0; this.rowItemIds[this.hoveredRow].length > var3Lifetime1; var3Lifetime1++) {
                var4Lifetime1 = TrackBoundary.field_x - this.getItemX(this.hoveredRow, 4, var3Lifetime1);
                if (var4Lifetime1 > 24 &&
                  136 > var4Lifetime1 && (this.hoveredRow == -1 + this.itemCount ||
                  this.selectedIndices[this.hoveredRow] != var3Lifetime1)) {
                  this.selectItem(var3Lifetime1, this.hoveredRow, 16777215);
                  this.activateRowSelection(this.hoveredRow, false, (byte) 122, false);
                  break;
                }
              }
            }
          }
        }
        if (param0 <= 85) {
          discarded$0 = this.hitTestRow(81, true);
        }
    }

    private final void truncateAfterRow(byte param0, int param1) {
        int var3 = 0;
        int[] var10 = null;
        int var5 = 0;
        int var6 = HoldTheLine.field_D;
        this.pendingSelection = -1;
        if (param0 >= -74) {
          this.reset((byte) -107, false);
        }
        for (var3 = param1 + 1; var3 < this.itemCount; var3++) {
          var10 = this.selectedIndices;
          var5 = var3;
          this.selectedValues[var3] = -1;
          var10[var5] = -1;
          this.rowScrollTargets[var3] = (-640 + this.rowWidths[var3]) / 2;
        }
        this.itemCount = param1 + 1;
        if (this.selectedItem > param1) {
          this.selectedItem = param1;
        }
        if (this.hoveredRow > param1) {
          this.hoveredRow = param1;
          this.hoveredItem = this.selectedValues[param1];
          if (this.hoveredItem == -1) {
            this.hoveredItem = 0;
          }
        }
        TrackObjectDefinition.setMenuDescriptions(new String[][]{this.field_O, this.rowDescriptions[this.selectedItem]}, 103, 13);
        this.targetVerticalOffset = 312 + (112 - 112 * this.itemCount);
    }

    final void draw(int param0) {
        int var3_int = 0;
        int var2;
        String var3;
        int var4;
        int var5;
        int var6;
        int var2Lifetime1;
        var6 = HoldTheLine.field_D;
        if (3 == this.transitionState) {
          return;
        }
        for (var2 = 0; var2 < 4; var2++) {
          if (null != this.rowItemIds[var2]) {
            this.drawChoiceRow((byte) 47, var2);
          }
        }
        var2Lifetime1 = 0;
        if (param0 != -55) {
          return;
        }
        if (this.transitionState == 2) {
          var2Lifetime1 = (int)((double)we.field_n * (-Math.exp((double)(0.20000000298023224f * (float)(this.transitionTicks - 5))) + 1.0));
        }
        BlobWriteRequest.drawTitleBar(this.field_L.toUpperCase(), var2Lifetime1, 1, param0 - 1698, 8);
        for (var3_int = 0; var3_int < this.controlActions.length; var3_int++) {
          this.drawControl(this.getControlY((byte) -128, var3_int), this.controlActions[var3_int], true, var3_int);
        }
        var3 = this.rowTitles[this.itemCount - 1];
        if (var3 != null) {
          var4 = HoldTheLine.field_F.measureText(var3);
          var5 = this.getRowY((byte) -113, this.itemCount - 1);
          SoftwareRasterizer.fillRectangleAlpha(0, var5, 20 + var4, 28, 0, 192);
          SoftwareRasterizer.drawRectangle(0, var5, 20 + var4, 28, 16777215);
          HoldTheLine.field_F.draw(var3, 10, 18 + var5, 4, -1);
        }
        oi.a(1, 13);
        return;
    }

    private final int hitTestRow(int param0, boolean param1) {
        int var3 = 0;
        int var4;
        int var5;
        var5 = HoldTheLine.field_D;
        if (param1) {
          return -38;
        }
        for (var3 = -1 + this.itemCount; var3 >= 0; var3--) {
          var4 = this.getRowY((byte) -113, var3);
          if (param0 >= var4 &&
            var4 + 112 > param0) {
            return var3;
          }
        }
        return -1;
    }

    private final int getItemX(int param0, int param1, int param2) {
        if (param1 != 4) {
          this.hoveredItem = -9;
        }
        return 160 * param2 + (240 - (int)this.rowScrollPositions[param0]);
    }

    private final void initializeRowLayout(int param0, byte param1) {
        this.rowWidths[param0] = this.rowItemIds[param0].length * 160;
        this.scrollRowTo(param0, -1, 0);
        this.rowScrollPositions[param0] = (float)this.rowScrollTargets[param0];
        int var3 = -102 / ((-66 - param1) / 45);
    }

    final void reset(byte param0, boolean param1) {
        int var3 = 0;
        int var4 = HoldTheLine.field_D;
        this.transitionState = 0;
        this.transitionTicks = 0;
        for (var3 = 0; var3 < 4; var3++) {
          this.field_B[var3] = 0;
        }
        this.targetVerticalOffset = 312;
        this.pendingSelection = -1;
        this.hoveredRow = !param1 ? 0 : -1;
        this.verticalOffset = 480.0f;
        if (param0 != 69) {
          return;
        }
        this.field_ab = 0;
        this.itemCount = 1;
        this.selectedItem = 0;
        this.field_Z = 0;
        this.hoveredItem = !param1 ? 0 : -1;
        this.refreshMenuOptions(true, 6267);
        TrackObjectDefinition.setMenuDescriptions(new String[][]{this.field_O, this.rowDescriptions[0]}, 67, 13);
    }

    private final void selectItem(int param0, int param1, int param2) {
        if (param0 < 0) {
          param0 = 0;
        }
        if (this.rowItemIds[param1].length <= param0) {
          param0 = -1 + this.rowItemIds[param1].length;
        }
        if (param2 != 16777215) {
          this.hoveredControl = -76;
        }
        this.selectedIndices[param1] = param0;
        this.selectedValues[param1] = this.rowItemIds[param1][param0];
        this.scrollRowTo(param1, -1, param0 * 160 + 80);
    }

    final static void resendPendingDataRequests(int param0, byte param1) {
        IntrusiveNode var2 = null;
        int var3 = 0;
        BlobWriteRequest var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = HoldTheLine.field_D;
        try {
          if (param1 != 51) {
            return;
          }
          var4 = (BlobWriteRequest) (UsernameLoginCredentials.field_e.first((byte) 125));
          while (var4 != null) {
            TrackObjectDefinition.sendBlobWriteRequest(27391, var4, param0);
            var4 = (BlobWriteRequest) (UsernameLoginCredentials.field_e.next((byte) -89));
          }
          var2 = oc.field_d.first((byte) 121);
          while (var2 != null) {
            q.sendBlobReadRequest(param0, 60);
            var2 = oc.field_d.next((byte) 124);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var2_ref), "ec.LB(" + param0 + ',' + param1 + ')');
        }
    }

    final void increaseItemValue(int param0, int param1) {
        if (param0 < 97) {
          this.field_S = (int[]) null;
        }
    }

    public static void clearSharedReferences(byte param0) {
        field_y = null;
        if (param0 != -122) {
          return;
        }
        field_z = null;
        field_v = null;
        field_s = null;
        field_D = null;
    }

    private final int getRowX(byte param0, int param1) {
        int var3 = 78 % ((74 - param0) / 33);
        return 240 - (int)this.rowScrollPositions[param1];
    }

    final void update(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        float var2;
        int var3;
        int var4;
        int var5;
        int var3Lifetime1;
        var4 = HoldTheLine.field_D;
        if (this.transitionState == 3) {
          return;
        }
        if (this.transitionState == 0) {
          if (this.transitionTicks == 0) {
            ValidationHelpWidget.a(17405, 64, 0, HuffmanDecoder.field_c.field_f);
            ValidationHelpWidget.a(param0 + 17514, 64, 256, HuffmanDecoder.field_c.field_h);
          }
          fieldTemp$0 = this.transitionTicks + 1;
          this.transitionTicks = this.transitionTicks + 1;
          if (fieldTemp$0 == 5 * this.controlActions.length + 50) {
            this.transitionState = 1;
            this.transitionTicks = 0;
          }
        } else {
          if (this.transitionState == 2) {
            fieldTemp$1 = this.transitionTicks + 1;
            this.transitionTicks = this.transitionTicks + 1;
            if (-260.0 > (double)we.field_n * (1.0 - Math.exp((double)(0.20000000298023224f * (float)(fieldTemp$1 - 5))))) {
              this.transitionState = 3;
              this.transitionTicks = 0;
            }
          }
        }
        var2 = (float)this.targetVerticalOffset - this.verticalOffset;
        this.verticalOffset = this.verticalOffset + 0.20000000298023224f * var2;
        if (this.pendingSelection != -1 &&
          Math.abs(var2) < 5.0f) {
          this.activateRowSelection(-1 + this.itemCount, this.field_w, (byte) 122, true);
        }
        for (var3 = 0; this.itemCount > var3; var3++) {
          if ((float)this.rowScrollTargets[var3] != this.rowScrollPositions[var3]) {
            this.rowScrollPositions[var3] = this.rowScrollPositions[var3] + ((float)this.rowScrollTargets[var3] - this.rowScrollPositions[var3]) * 0.05000000074505806f;
          }
          if (this.field_B[var3] > 0) {
            this.field_B[var3] = this.field_B[var3] - 1;
          }
        }
        var5 = 0;
        var3Lifetime1 = var5;
        while (var5 < this.controlActions.length) {
          this.field_x[var5] = this.field_x[var5] + (-this.field_x[var5] + (float)this.field_I[var5]) * 0.20000000298023224f;
          var5++;
        }
        if (param0 != -109) {
          RaceSetupMenu.clearSharedReferences((byte) 121);
        }
        if (1 >= this.transitionState) {
          if (na.field_k &&
            -1 != NodeHashTableIterator.field_g) {
            this.handleChoiceMouse(86);
          }
          while (qh.c(-85)) {
            this.handleKey(true);
          }
        }
        PacketBuffer.b(true);
        return;
    }

    private final int getRowY(byte param0, int param1) {
        if (param0 != -113) {
          return -39;
        }
        return 112 * param1 + (int)this.verticalOffset;
    }

    final void beginExit(byte param0) {
        if (this.transitionState != 2) {
          if (3 == this.transitionState) {
            return;
          }
          bn.a(1, -107);
          this.transitionState = 2;
          if (param0 >= -104) {
            return;
          }
          this.transitionTicks = 0;
          this.targetVerticalOffset = 480;
          return;
        }
    }

    private final void addChoiceRow(String param0, int param1, int[] param2, Sprite[] param3, boolean param4, String[] param5, String[] param6, int param7) {
        int fieldTemp$0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        try {
          this.rowItemIds[this.itemCount] = param2;
          this.rowSprites[this.itemCount] = param3;
          this.rowLabels[this.itemCount] = param6;
          this.rowDescriptions[this.itemCount] = param5;
          this.rowTitles[this.itemCount] = param0;
          this.rowColors[this.itemCount] = param1;
          this.selectedIndices[this.itemCount] = -1;
          this.selectedValues[this.itemCount] = -1;
          if (param4) {
            this.hoveredRow = this.itemCount;
            this.hoveredItem = 0;
          }
          this.initializeRowLayout(this.itemCount, (byte) 126);
          fieldTemp$0 = this.itemCount;
          this.itemCount = this.itemCount + 1;
          this.selectedItem = fieldTemp$0;
          TrackObjectDefinition.setMenuDescriptions(new String[][]{this.field_O, this.rowDescriptions[this.selectedItem]}, param7 ^ 374, 13);
          this.targetVerticalOffset = -(112 * (this.itemCount - 1)) + param7;
          this.pendingSelection = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_6_0 = var9;
          stackIn_6_1 = new StringBuilder().append("ec.FB(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param6 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param7).append(')').toString());
        }
    }

    private final void drawChoiceRow(byte param0, int param1) {
        int[] var3;
        Sprite[] var4;
        String[] var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int[] var13;
        int[] var14;
        int var10Lifetime1;
        var11 = HoldTheLine.field_D;
        var14 = this.rowItemIds[param1];
        var13 = var14;
        var3 = var13;
        var4 = this.rowSprites[param1];
        var5 = this.rowLabels[param1];
        if (param0 != 47) {
          field_y = (ArchiveKeyRequest) null;
        }
        if (var3 == null) {
          return;
        }
        var6 = this.getRowX((byte) 17, param1) + 24;
        var7 = this.getRowY((byte) -113, param1);
        var8 = 18 + var7;
        var9 = (424 - var7) * 256 / 112;
        if (16 >= var9) {
          return;
        }
        if (var9 < 256) {
          hh.field_e.drawAlpha(0, var7, var9);
          for (var10 = 0; var10 < var14.length; var10++) {
            if (var10 == this.selectedIndices[param1] &&
              this.hoveredControl == -1) {
              SoftwareRasterizer.fillRectangleAlpha(var6 - 5, -5 + var8, 121, 94, 16777215, var9 >> 1);
              var4[var10].drawAlpha(var6, var8, var9);
              if (this.field_B[param1] > 0 &&
                (-this.field_B[param1] + 90) % 30 <= 15) {
                SoftwareRasterizer.fillRectangleAlpha(var6, var8, 111, 84, 16777215, var9 >> 1);
              }
            } else if (this.hoveredRow == param1 &&
              this.hoveredItem == var10 &&
              this.hoveredControl == -1) {
              SoftwareRasterizer.fillRectangleAlpha(-5 + var6, -5 + var8, 121, 94, 16777215, var9 >> 1);
              var4[var10].drawAlpha(var6, var8, var9);
            } else {
              var4[var10].drawAlpha(var6, var8, var9);
              o.a(128, 84, var8, 128, 111, param0 - 4488, var6);
            }
            Vector2i.a(20, var5[var10], 4, 2, 111, var8, var6, 74, param0 ^ -48, 1, HoldTheLine.field_F);
            var6 += 160;
          }
          return;
        }
        hh.field_e.drawUnkeyed(0, var7);
        var12 = 0;
        var10Lifetime1 = var12;
        while (var12 < var14.length) {
          if (param1 == this.hoveredRow &&
            this.hoveredItem == var12 &&
            this.hoveredControl == -1) {
            SoftwareRasterizer.fillRectangleAlpha(-5 + var6, -5 + var8, 121, 94, 16744576, 128);
            var4[var12].drawUnkeyed(var6, var8);
          } else if (this.selectedIndices[param1] == var12 &&
            this.hoveredControl == -1) {
            SoftwareRasterizer.fillRectangleAlpha(var6 - 5, -5 + var8, 121, 94, 16777215, 128);
            var4[var12].drawUnkeyed(var6, var8);
            if (this.field_B[param1] > 0 &&
              (-this.field_B[param1] + 90) % 30 <= 15) {
              SoftwareRasterizer.fillRectangleAlpha(var6, var8, 111, 84, 16777215, 128);
            }
          } else {
            var4[var12].drawUnkeyed(var6, var8);
            o.a(128, 84, var8, 128, 111, -4441, var6);
          }
          Vector2i.a(20, var5[var12], 4, 2, 111, var8, var6, 74, -1, 1, HoldTheLine.field_F);
          var6 += 160;
          var12++;
        }
        return;
    }

    private final void scrollRowTo(int param0, int param1, int param2) {
        if (this.rowWidths[param0] <= 640) {
          this.rowScrollTargets[param0] = (-160 + this.rowWidths[param0]) / 2;
          return;
        }
        int var4 = -80 + param2;
        if (param1 != -1) {
          field_s = (tk) null;
        }
        if (var4 < 240) {
          var4 = 240;
        }
        if (-400 + this.rowWidths[param0] < var4) {
          var4 = this.rowWidths[param0] - 400;
        }
        this.rowScrollTargets[param0] = var4;
    }

    final void decreaseItemValue(int param0, int param1) {
        if (param0 != 1) {
          String[] var4 = (String[]) null;
          this.addChoiceRow((String) null, 117, (int[]) null, (Sprite[]) null, true, (String[]) null, (String[]) null, 115);
        }
    }

    private final void drawControl(int param0, int param1, boolean param2, int param3) {
        String[] array$0 = null;
        String stackIn_16_0 = null;
        String stackIn_19_0 = null;
        int[] stackIn_21_0 = null;
        String[] stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        int stackIn_22_3;
        StringBuilder stackIn_31_0 = null;
        String stackIn_32_1 = null;
        StringBuilder stackIn_36_0 = null;
        String stackIn_37_1 = null;
        StringBuilder stackIn_40_0 = null;
        String stackIn_41_1 = null;
        String[] stackIn_43_0 = null;
        String[] stackIn_43_1 = null;
        int stackIn_43_2 = 0;
        String stackIn_44_3 = null;
        int[] stackIn_46_0 = null;
        String[] stackIn_46_1 = null;
        int stackIn_46_2 = 0;
        int stackIn_47_3;
        int var5;
        int var6;
        String var7;
        String[] var7_array;
        String var8;
        String[] var9;
        String var9_ref;
        int var10;
        var10 = HoldTheLine.field_D;
        var5 = 0;
        if (0 == this.transitionState) {
          var5 = 50 - this.transitionTicks + 5 * param3;
        } else {
          if (this.transitionState == 2) {
            var5 = this.transitionTicks - (-25 + 5 * (this.controlActions.length - param3));
          }
        }
        if (!param2) {
          return;
        }
        if (var5 < 0) {
          var5 = 0;
        }
        var6 = (int)((double)we.field_n * (1.0 - Math.exp((double)(0.20000000298023224f * (float)var5))));
        var6 = (int)((float)var6 + this.field_x[param3]);
        if (param1 == 22) {
          if (7 != DelegatingCanvas.field_d) {
            if (DelegatingCanvas.field_d == 0) {
              stackIn_36_0 = new StringBuilder();
              if (!Vector2i.field_c) {
                stackIn_37_1 = MusicCrossfadeStream.field_r;
              } else {
                stackIn_37_1 = h.field_e;
              }
              var7 = ((StringBuilder) (Object) stackIn_36_0).append(stackIn_37_1).append(" ").append(bo.field_a).toString();
            } else {
              if (DelegatingCanvas.field_d == 1) {
                var7 = TextHotspotWidget.field_M;
              } else {
                if (DelegatingCanvas.field_d != 2) {
                  throw new RuntimeException();
                }
                stackIn_31_0 = new StringBuilder();
                if (Vector2i.field_c) {
                  stackIn_32_1 = h.field_e;
                } else {
                  stackIn_32_1 = MusicCrossfadeStream.field_r;
                }
                var7 = ((StringBuilder) (Object) stackIn_31_0).append(stackIn_32_1).append(" ").append(Point2i.field_g).toString();
              }
            }
          } else {
            var7 = DropTargetWidget.field_H;
          }
          var7 = uk.field_c[20] + var7;
          stackIn_40_0 = new StringBuilder().append(uk.field_c[21]);
          if (AgeValidator.field_o) {
            stackIn_41_1 = ProxySocketConnector.field_l;
          } else {
            stackIn_41_1 = UrlPacketDownloader.field_h;
          }
          var8 = ((StringBuilder) (Object) stackIn_40_0).append(stackIn_41_1).toString();
          array$0 = new String[3];
          stackIn_43_0 = array$0;
          stackIn_43_1 = array$0;
          stackIn_43_2 = 2;
          if (this.field_t) {
            stackIn_44_3 = var8;
          } else {
            stackIn_44_3 = "";
          }
          stackIn_43_1[stackIn_43_2] = stackIn_44_3;
          var9 = stackIn_43_0;
          stackIn_46_0 = this.field_K;
          stackIn_46_1 = var9;
          stackIn_46_2 = 120;
          if (this.hoveredControl == param3) {
            stackIn_47_3 = this.field_ab;
          } else {
            stackIn_47_3 = -1;
          }
          fk.a(stackIn_46_0, stackIn_46_1, stackIn_46_2, stackIn_47_3, param0, -1, var6);
        } else {
          if (param1 == 23) {
            if (this.itemCount > 1) {
              stackIn_16_0 = CachedTextLayout.field_r;
            } else {
              stackIn_16_0 = "";
            }
            var8 = stackIn_16_0;
            var7 = var8;
            var7 = var8;
            if (pj.b((byte) 124)) {
              stackIn_19_0 = uk.field_c[9];
            } else {
              stackIn_19_0 = "";
            }
            var9_ref = stackIn_19_0;
            var7 = var9_ref;
            var7 = var9_ref;
            var7_array = new String[]{var8, "", var9_ref};
            stackIn_21_0 = this.field_K;
            stackIn_21_1 = var7_array;
            stackIn_21_2 = 72;
            if (this.hoveredControl != param3) {
              stackIn_22_3 = -1;
            } else {
              stackIn_22_3 = this.field_Z;
            }
            fk.a(stackIn_21_0, stackIn_21_1, stackIn_21_2, stackIn_22_3, param0, -1, var6);
          }
        }
        return;
    }

    private final void handleControlAction(int param0, int param1, int param2, int param3) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_31_0 = 0;
        boolean stackIn_50_0 = false;
        boolean stackIn_78_0 = false;
        boolean stackIn_85_0 = false;
        int stackIn_97_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_109_1 = 0;
        int stackIn_127_1 = 0;
        int stackIn_133_1 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        var14 = HoldTheLine.field_D;
        stackIn_3_0 = (param2 != 1) ? 0 : 1;
        var5 = stackIn_3_0;
        stackIn_6_0 = (param2 != 0) ? 0 : 1;
        var6 = stackIn_6_0;
        var9 = 116 / ((param3 - 55) / 51);
        if (param2 != 2) {
          stackIn_12_0 = (param2 == 3) ? 1 : 0;
        } else {
          stackIn_12_0 = 1;
        }
        var7 = stackIn_12_0;
        stackIn_15_0 = (param2 != 4) ? 0 : 1;
        var8 = stackIn_15_0;
        if (param2 != 2) {
          stackIn_21_0 = (param2 == 3) ? 1 : 0;
        } else {
          stackIn_21_0 = 1;
        }
        var10 = stackIn_21_0;
        if (param2 == 3) {
          stackIn_27_0 = 1;
        } else {
          stackIn_27_0 = (param2 == 4) ? 1 : 0;
        }
        var11 = stackIn_27_0;
        MatchingTextValidator.a(293, StrongCacheEntry.field_r);
        if (param1 != 22) {
          if (param1 == 23) {
            stackIn_97_0 = (0 < this.selectedItem) ? 0 : 2;
            var12 = stackIn_97_0;
            if (pj.b((byte) 90)) {
              stackIn_102_0 = (this.selectedItem <= 0) ? 0 : 1;
            } else {
              stackIn_102_0 = 0;
            }
            var13 = stackIn_102_0;
            if (var5 != 0 ||
              var6 != 0) {
              if (var13 == 0) {
                this.field_Z = var12;
              } else {
                if (this.field_Z != 0) {
                  stackIn_109_1 = 0;
                } else {
                  stackIn_109_1 = 2;
                }
                this.field_Z = stackIn_109_1;
              }
            }
            if (var10 != 0) {
              if (0 == this.field_Z) {
                if (this.selectedItem != 0) {
                  this.truncateAfterRow((byte) -92, -1 + this.selectedItem);
                  this.keyboardSelection = true;
                  this.hoveredControl = -1;
                }
              } else {
                if (this.field_Z == 2 &&
                  pj.b((byte) 113)) {
                  i.a((byte) 60, true);
                }
              }
            }
            if (var13 == 0) {
              if (var7 != 0 ||
                var8 != 0) {
                this.field_Z = var12;
              }
            } else {
              if (var7 != 0) {
                if (this.field_Z == 2) {
                  stackIn_127_1 = 0;
                } else {
                  stackIn_127_1 = 2;
                }
                this.field_Z = stackIn_127_1;
              }
              if (var8 != 0) {
                if (this.field_Z == 0) {
                  stackIn_133_1 = 2;
                } else {
                  stackIn_133_1 = 0;
                }
                this.field_Z = stackIn_133_1;
              }
            }
          }
        } else {
          stackIn_31_0 = (this.field_t) ? 2 : 1;
          var12 = stackIn_31_0;
          if (var5 == 0) {
            if (var6 != 0) {
              fieldTemp$0 = this.field_ab + 1;
              this.field_ab = this.field_ab + 1;
              if (var12 < fieldTemp$0) {
                this.field_ab = 0;
              }
            }
          } else {
            fieldTemp$1 = this.field_ab - 1;
            this.field_ab = this.field_ab - 1;
            if (0 > fieldTemp$1) {
              this.field_ab = var12;
            }
          }
          if (this.field_ab == 0) {
            if (var7 != 0) {
              if (DelegatingCanvas.field_d == 7) {
                Vector2i.field_c = false;
                DelegatingCanvas.field_d = 0;
              } else {
                if (DelegatingCanvas.field_d == 0) {
                  if (Vector2i.field_c) {
                    DelegatingCanvas.field_d = 1;
                  }
                  stackIn_85_0 = !(Vector2i.field_c);
                  Vector2i.field_c = stackIn_85_0;
                } else {
                  if (1 != DelegatingCanvas.field_d) {
                    if (2 == DelegatingCanvas.field_d) {
                      if (Vector2i.field_c) {
                        DelegatingCanvas.field_d = 7;
                      }
                      stackIn_78_0 = !(Vector2i.field_c);
                      Vector2i.field_c = stackIn_78_0;
                    }
                  } else {
                    DelegatingCanvas.field_d = 2;
                  }
                }
              }
            } else {
              if (var8 != 0) {
                if (7 != DelegatingCanvas.field_d) {
                  if (DelegatingCanvas.field_d != 0) {
                    if (DelegatingCanvas.field_d != 1) {
                      if (DelegatingCanvas.field_d == 2) {
                        if (!Vector2i.field_c) {
                          DelegatingCanvas.field_d = 1;
                        }
                        Vector2i.field_c = false;
                      }
                    } else {
                      DelegatingCanvas.field_d = 0;
                      Vector2i.field_c = true;
                    }
                  } else {
                    if (!Vector2i.field_c) {
                      DelegatingCanvas.field_d = 7;
                    }
                    Vector2i.field_c = false;
                  }
                } else {
                  Vector2i.field_c = true;
                  DelegatingCanvas.field_d = 2;
                }
              }
            }
            if (var7 != 0 ||
              var8 != 0) {
              h.b((byte) 125);
              this.field_O[param0] = NetworkArchiveRequest.field_C[DelegatingCanvas.field_d];
              this.refreshMenuOptions(false, 6267);
              this.initializeRowLayout(0, (byte) -124);
              this.selectedIndices[0] = -1;
              this.selectedValues[0] = -1;
              this.truncateAfterRow((byte) -96, 0);
            }
          } else {
            if (1 != this.field_ab) {
              if (this.field_t && (var10 != 0 ||
                var7 != 0 ||
                var8 != 0)) {
                stackIn_50_0 = !(AgeValidator.field_o);
                AgeValidator.field_o = stackIn_50_0;
              }
            } else {
              if (var10 != 0) {
                wm.a(var11 != 0, false, 0);
              }
            }
          }
        }

    }

    private final int hitTestControl(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        var6 = HoldTheLine.field_D;
        if (param1 > -51) {
          this.field_L = (String) null;
        }
        var4 = 0;
        while (this.controlActions.length > var4) {
          var5 = this.getControlY((byte) -128, var4);
          if (param0 < var5 ||
            30 + var5 < param0) {
            var4++;
            continue;
          }
          break;
        }
        if (this.controlActions.length == var4) {
          return -1;
        }
        boolean decompiledFrameRemainder0 = true;
        if (22 != this.controlActions[var4]) {
          if ((this.controlActions[var4] != 23) &&
            (decompiledFrameRemainder0 = (!(param2 >= 15) ||
            !(param2 <= 355)))) {
            return -1;
          }
          if (decompiledFrameRemainder0) {
            this.field_Z = fj.a(this.field_S, (byte) -119, param2);
          }
        } else {
          this.field_ab = fj.a(this.field_K, (byte) -119, param2);
          if (this.field_ab == 0) {
            ArchiveCatalog.a(0, (byte) 67, 13, 0);
          } else {
            if (this.field_ab == 2 &&
              this.field_t) {
              ArchiveCatalog.a(0, (byte) 100, 13, 1);
            }
          }
        }
        return var4;
    }

    final void refreshMenuOptions(boolean param0, int param1) {
        int discarded$0 = 0;
        this.controlActions = AgeValidator.field_i[this.menuId];
        this.field_t = Vector2i.field_c;
        if (param1 != 6267) {
          discarded$0 = this.hitTestControl(20, 52, -61);
        }
        this.field_t = this.field_t | (DelegatingCanvas.field_d == 1 ? true : false);
        this.field_t = this.field_t & (DelegatingCanvas.field_d != 7 ? true : false);
        this.field_O = new String[]{NetworkArchiveRequest.field_C[DelegatingCanvas.field_d], cd.field_c};
    }

    private final void activateRowSelection(int param0, boolean param1, byte param2, boolean param3) {
        boolean stackIn_4_1 = false;
        int stackIn_19_0 = 0;
        boolean stackIn_20_1 = false;
        int stackIn_27_0 = 0;
        boolean stackIn_28_1 = false;
        String stackIn_34_0 = null;
        String stackIn_47_0 = null;
        int stackIn_54_0 = 0;
        boolean stackIn_55_1 = false;
        int stackIn_61_0 = 0;
        boolean stackIn_62_1 = false;
        int stackIn_70_0 = 0;
        boolean stackIn_71_1 = false;
        int var5;
        int var6;
        int var7;
        int var8;
        String var9;
        String var10;
        int var11;
        Sprite[] var12;
        Sprite[] var13;
        Sprite[] var14;
        Sprite[] var15;
        var11 = HoldTheLine.field_D;
        this.hoveredControl = -1;
        if (this.itemCount - 1 > param0) {
          this.truncateAfterRow((byte) -75, param0);
          this.pendingSelection = this.selectedIndices[param0];
          stackIn_4_1 = (param1);
          this.field_w = stackIn_4_1;
          return;
        }
        this.pendingSelection = -1;
        MatchingTextValidator.a(293, StrongCacheEntry.field_r);
        var5 = this.selectedIndices[param0];
        if (param2 != 122) {
          this.rowScrollTargets = (int[]) null;
        }
        var6 = this.selectedValues[param0];
        if (-1 == var5) {
          return;
        }
        this.field_B[param0] = 90;
        if (DelegatingCanvas.field_d == 7) {
          if (param0 == 0) {
            if (param3) {
              return;
            }
            var7 = PolarSortVector.a((byte) 60, var6);
            if (var7 != 0) {
              return;
            }
            StrongCacheEntry.field_w = var6;
            LoginForm.field_P = 0;
            bn.a(var6 + 4, -107);
            stackIn_70_0 = -21383;
            stackIn_71_1 = !(param1);
            ma.a(stackIn_70_0, stackIn_71_1);
          }
        } else {
          if (DelegatingCanvas.field_d != 1 &&
            DelegatingCanvas.field_d != 0) {
            if (param0 == 0) {
              LoginForm.field_P = var6;
              StrongCacheEntry.field_w = var6;
              var7 = PolarSortVector.a((byte) 92, StrongCacheEntry.field_w);
              if (0 == var7) {
                var8 = StrongCacheEntry.field_w;
                var13 = new Sprite[]{ua.field_b.getSpriteOrPlaceholder(84, RotatedSpriteAsset.field_g[var8][0], 9, 111), ua.field_b.getSpriteOrPlaceholder(84, RotatedSpriteAsset.field_g[var8][1], param2 ^ 115, 111)};
                if (!Vector2i.field_c) {
                  stackIn_34_0 = SoundPlayback.field_m;
                } else {
                  stackIn_34_0 = SoundPlayback.field_m + " " + ArchiveLoadProgress.field_g;
                }
                var10 = stackIn_34_0;
                this.addChoiceRow(var10, 16711680, RotatedSpriteAsset.field_g[var8], var13, param1, WidgetContainer.field_A[var8], RaceWorld.field_gb[var8], 312);
              }
              bn.a(4 + StrongCacheEntry.field_w, param2 ^ -16);
              return;
            }
            if (1 != param0) {
              if (param0 != 2) {
                return;
              }
              if (param3) {
                return;
              }
              IntrusiveDeque.field_b = var6;
              stackIn_27_0 = -21383;
              stackIn_28_1 = !(param1);
              ma.a(stackIn_27_0, stackIn_28_1);
              return;
            }
            IntArrayReadRequest.field_l = var6;
            if (Vector2i.field_c) {
              var7 = StrongCacheEntry.field_w;
              var12 = new Sprite[]{ua.field_b.getSpriteOrPlaceholder(84, RotatedSpriteAsset.field_g[var7][0] + 8, 9, 111), ua.field_b.getSpriteOrPlaceholder(84, 8 + RotatedSpriteAsset.field_g[var7][1], 9, 111)};
              this.addChoiceRow(SoundPlayback.field_m + " " + SocketConnector.field_e, 65280, RotatedSpriteAsset.field_g[var7], var12, param1, WidgetContainer.field_A[var7], RaceWorld.field_gb[var7], 312);
              return;
            }
            if (param3) {
              return;
            }
            stackIn_19_0 = -21383;
            stackIn_20_1 = !(param1);
            ma.a(stackIn_19_0, stackIn_20_1);
            return;
          }
          if (0 == param0) {
            var7 = PolarSortVector.a((byte) 65, var6);
            if (var7 == 0) {
              StrongCacheEntry.field_w = var6;
              bn.a(4 + var6, -112);
              h.b((byte) 101);
              this.addChoiceRow(NodeHashTableIterator.field_a, Point2i.field_i[var5], this.rowItemIds[1], this.rowSprites[1], param1, this.rowDescriptions[1], this.rowLabels[1], 312);
            }
          }
          if (param0 == 1) {
            LoginForm.field_P = var6;
            var7 = ArchiveIndex.b((byte) -49).field_p;
            if (ArcTrackBoundary.a(LoginForm.field_P, -70, StrongCacheEntry.field_w) == 0) {
              var14 = new Sprite[]{ua.field_b.getSpriteOrPlaceholder(84, RotatedSpriteAsset.field_g[var7][0], 9, 111), ua.field_b.getSpriteOrPlaceholder(84, RotatedSpriteAsset.field_g[var7][1], 9, 111)};
              if (Vector2i.field_c) {
                stackIn_47_0 = SoundPlayback.field_m + " " + ArchiveLoadProgress.field_g;
              } else {
                stackIn_47_0 = SoundPlayback.field_m;
              }
              var9 = stackIn_47_0;
              this.addChoiceRow(var9, 16711680, RotatedSpriteAsset.field_g[var7], var14, param1, WidgetContainer.field_A[var7], RaceWorld.field_gb[var7], 312);
            }
          }
          if (param0 == 2) {
            IntArrayReadRequest.field_l = var6;
            var7 = ArchiveIndex.b((byte) -49).field_p;
            if (Vector2i.field_c) {
              var15 = new Sprite[]{ua.field_b.getSpriteOrPlaceholder(84, 8 + RotatedSpriteAsset.field_g[var7][0], 9, 111), ua.field_b.getSpriteOrPlaceholder(84, RotatedSpriteAsset.field_g[var7][1] + 8, 9, 111)};
              this.addChoiceRow(SoundPlayback.field_m + " " + SocketConnector.field_e, 65280, RotatedSpriteAsset.field_g[var7], var15, param1, WidgetContainer.field_A[var7], RaceWorld.field_gb[var7], 312);
            } else {
              if (!param3) {
                stackIn_54_0 = -21383;
                stackIn_55_1 = !(param1);
                ma.a(stackIn_54_0, stackIn_55_1);
              }
            }
          }
          if (param0 == 3 &&
            !param3) {
            IntrusiveDeque.field_b = var6;
            stackIn_61_0 = -21383;
            stackIn_62_1 = !(param1);
            ma.a(stackIn_61_0, stackIn_62_1);
            return;
          }
        }
        return;
    }

    private final int getControlY(byte param0, int param1) {
        if (this.controlActions[param1] == 23) {
          return 448;
        }
        if (param0 > -123) {
          this.reset((byte) -56, true);
        }
        return 35 * (1 + param1) + 8;
    }

    RaceSetupMenu(int param0, int[] param1, Sprite[] param2, String[] param3, String[] param4, String param5, int param6) {
        int var8_int = 0;
        this.field_S = new int[]{0, 240, 140, 240};
        this.field_K = new int[]{0, 240, 140, 240};
        try {
          this.rowItemIds = new int[4][];
          this.rowSprites = new Sprite[4][];
          this.rowLabels = new String[4][];
          this.rowDescriptions = new String[4][];
          this.menuId = param0;
          this.controlActions = AgeValidator.field_i[param0];
          this.field_x = new float[this.controlActions.length];
          this.field_I = new int[this.controlActions.length];
          this.rowColors = new int[4];
          this.field_B = new int[4];
          this.rowWidths = new int[4];
          this.rowScrollPositions = new float[4];
          this.selectedValues = new int[4];
          this.selectedIndices = new int[4];
          this.rowTitles = new String[4];
          this.rowScrollTargets = new int[4];
          this.field_L = SocketConnector.field_g[param0];
          for (var8_int = 0; var8_int < 4; var8_int++) {
            this.rowWidths[var8_int] = 0;
            this.rowScrollPositions[var8_int] = 0.0f;
            this.rowScrollTargets[var8_int] = 0;
            this.selectedIndices[var8_int] = -1;
            this.selectedValues[var8_int] = -1;
          }
          this.rowItemIds[0] = param1;
          this.rowSprites[0] = param2;
          this.rowLabels[0] = param3;
          this.rowDescriptions[0] = param4;
          if (pj.b((byte) 93)) {
            this.field_O = new String[]{NetworkArchiveRequest.field_C[DelegatingCanvas.field_d], null, cd.field_c};
          } else {
            this.field_O = new String[]{NetworkArchiveRequest.field_C[DelegatingCanvas.field_d], cd.field_c};
          }
          this.rowTitles[0] = param5;
          this.rowColors[0] = param6;
          this.selectedIndices[0] = -1;
          this.itemCount = 1;
          this.selectedValues[0] = param1[0];
          this.initializeRowLayout(0, (byte) -122);
          this.reset((byte) 69, false);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "ec.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ')');
        }
    }

    static {
        field_C = 0;
    }
}
