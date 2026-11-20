/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ScrollBarWidget extends Widget {
    private Widget pageDownRegion;
    static Object field_vb;
    private Widget pageUpRegion;
    private Widget track;
    private Widget upButton;
    private int repeatDelay;
    private Widget thumb;
    private Widget downButton;
    static String field_Db;

    final boolean pollScrollDown(int param0) {
        if (0 != this.downButton.field_o) {
          this.repeatDelay = 20;
          return true;
        }
        if (param0 >= -2) {
          this.pageDownRegion = (Widget) null;
        }
        if (this.downButton.field_C == 0) {
          return false;
        }
        if (this.repeatDelay > 0) {
          this.repeatDelay = this.repeatDelay - 1;
        }
        if (this.repeatDelay != 0) {
          return false;
        }
        this.repeatDelay = 3;
        return true;
    }

    final void setBoundsAndGeometry(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this.height = param5;
        this.x = param0;
        this.width = param6;
        this.y = param2;
        this.updateGeometry(param1, param3, (byte) 88, param4);
        if (param7 != -1) {
          Class[] var10 = (Class[]) null;
          ScrollBarWidget.writePolymorphicStateArray((IsaacPacketBuffer) null, (SerializableGameState[]) null, -91, 37, (Class[]) null, 13);
        }
    }

    final static void writePolymorphicStateArray(IsaacPacketBuffer param0, SerializableGameState[] param1, int param2, int param3, Class[] param4, int param5) {
        int var9 = 0;
        int stackIn_4_0 = 0;
        IsaacPacketBuffer stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        boolean stackIn_11_2 = false;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        SerializableGameState[] var8 = null;
        SerializableGameState var10 = null;
        int var11 = 0;
        int var12 = 0;
        var12 = VoidHunters.field_G;
        try {
          if (param1 != null) {
            stackIn_4_0 = param1.length;
          } else {
            stackIn_4_0 = 0;
          }
          var6_int = stackIn_4_0;
          param0.writeBits(-632, var6_int, param2);
          if (var6_int != 0) {
            var7 = BodyInZoneCondition.a(-98, -1 + param4.length);
            var8 = param1;
            for (var9 = 0; var8.length > var9; var9++) {
              var10 = var8[var9];
              stackIn_10_0 = (IsaacPacketBuffer) (param0);
              stackIn_10_1 = 114;
              stackIn_11_2 = (var10 != null);
              if (DateOfBirthInput.writeBoolean(stackIn_10_0, stackIn_10_1, stackIn_11_2)) {
                var11 = 0;
                boolean decompiledNaturalLoopExit0 = false;
                while (!(decompiledNaturalLoopExit0 = (param4.length <= var11))) {
                  if (param4[var11] != var10.getClass()) {
                    var11++;
                    continue;
                  }
                  param0.writeBits(-632, var11, var7);
                  GetComponentBreakingExplosionForceMultiplier.a(2, param3, param0, var10);
                  break;
                }
                if (decompiledNaturalLoopExit0) {
                  GetComponentBreakingExplosionForceMultiplier.a(2, param3, param0, var10);
                }
              }
            }
          }
          if (param5 < 117) {
            field_vb = (Object) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_28_0 = var6;
          stackIn_28_1 = new StringBuilder().append("pjb.C(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param5).append(')').toString());
        }
    }

    final int getScrollPosition(int param0, int param1, byte param2, boolean param3) {
        int var8 = 0;
        int var9 = 0;
        int var5 = 50 % ((24 - param2) / 41);
        int var6 = 0;
        int var7 = this.track.height - this.thumb.height;
        if (0 < var7) {
          var8 = this.thumb.y;
          var9 = param0 - param1;
          var6 = (var9 * var8 + var7 / 2) / var7;
        }
        if (!param3) {
          if (param0 - param1 < var6) {
            var6 = param0 - param1;
          }
          if (0 <= var6) {
            return var6;
          }
          var6 = 0;
          return var6;
        }
        if (0 > var6) {
          var6 = 0;
        }
        if (-param1 + param0 < var6) {
          var6 = -param1 + param0;
          return var6;
        }
        return var6;
    }

    public static void clearSharedReferences(byte param0) {
        field_vb = null;
        if (param0 == 22) {
          field_Db = null;
          return;
        }
        Class[] var2 = (Class[]) null;
        ScrollBarWidget.writePolymorphicStateArray((IsaacPacketBuffer) null, (SerializableGameState[]) null, 92, 41, (Class[]) null, -34);
        field_Db = null;
    }

    final static jk a(long param0, boolean param1) {
        if (!param1) {
          return (jk) null;
        }
        return (jk) (SetUseDetailLines.field_p.get(-1, param0));
    }

    final boolean pollPageUp(int param0) {
        if (this.pageUpRegion.field_o != 0) {
          this.repeatDelay = 20;
          return true;
        }
        if (param0 != 20) {
          this.isThumbDragging(false);
          if (this.pageUpRegion.field_C == 0) {
            return false;
          }
          if (this.repeatDelay > 0) {
            this.repeatDelay = this.repeatDelay - 1;
          }
          if (0 != this.repeatDelay) {
            return false;
          }
          if (this.thumb.field_db + this.thumb.screenY > uia.field_b) {
            this.repeatDelay = 3;
            return true;
          }
          return false;
        }
        if (this.pageUpRegion.field_C == 0) {
          return false;
        }
        if (this.repeatDelay > 0) {
          this.repeatDelay = this.repeatDelay - 1;
        }
        if (0 != this.repeatDelay) {
          return false;
        }
        if (this.thumb.field_db + this.thumb.screenY > uia.field_b) {
          this.repeatDelay = 3;
          return true;
        }
        return false;
    }

    ScrollBarWidget(long param0, ScrollBarWidget param1) {
        this(param0, param1.upButton, param1.downButton, param1.pageUpRegion, param1.thumb);
    }

    final void updateGeometry(int param0, int param1, byte param2, int param3) {
        int var6 = 0;
        int var5 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Widget var15 = null;
        Widget var16 = null;
        int var14 = 0;
        Widget var17 = null;
        Widget var18 = null;
        Widget var19 = null;
        Widget var20 = null;
        Widget var15Lifetime1;
        Widget var16Lifetime1;
        Widget var17Lifetime1;
        Widget var18Lifetime1;
        Widget var19Lifetime1;
        Widget var20Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var14Lifetime1;
        if (this.height < this.width * 2) {
          var6 = this.height / 2;
          var5 = this.height / 2;
        } else {
          var6 = -this.width + this.height;
          var5 = this.width;
        }
        int var7 = -var5 + var6;
        int var8 = var7;
        if (param0 > 0) {
          var8 = var8 * param3 / param0;
          if (!(this.width <= var8)) {
            var8 = this.width;
          }
          if (var7 < var8) {
            var8 = var7;
          }
          var9 = param0 - param3;
          var10 = var7 - var8;
          var11 = 0;
          if (var9 > 0) {
            var11 = (var10 * param1 + var9 / 2) / var9;
          }
          var12 = var11 + var8 / 2;
          var15 = this.upButton;
          var15.height = var5;
          var15.width = this.width;
          var15.x = 0;
          var15.y = 0;
          var16 = this.downButton;
          var16.x = 0;
          var16.height = this.height - var6;
          var16.y = var6;
          var16.width = this.width;
          var14 = 60 / ((-68 - param2) / 40);
          var17 = this.track;
          var17.y = var5;
          var17.height = var7;
          var17.x = 0;
          var17.width = this.width;
          var18 = this.pageUpRegion;
          var18.width = this.width;
          var18.x = 0;
          var18.height = var12;
          var18.y = 0;
          var19 = this.pageDownRegion;
          var19.width = this.width;
          var19.x = 0;
          var19.y = var12;
          var19.height = -var12 + var7;
          var20 = this.thumb;
          var20.height = var8;
          this.track.enabled = param3 < param0 ? true : false;
          this.downButton.enabled = param3 < param0 ? true : false;
          this.upButton.enabled = param3 < param0 ? true : false;
          var20.x = 0;
          var20.width = this.width;
          var20.y = var11;
          return;
        }
        var9Lifetime1 = param0 - param3;
        var10Lifetime1 = var7 - var8;
        var11Lifetime1 = 0;
        if (var9Lifetime1 > 0) {
          var11Lifetime1 = (var10Lifetime1 * param1 + var9Lifetime1 / 2) / var9Lifetime1;
        }
        var12Lifetime1 = var11Lifetime1 + var8 / 2;
        var15Lifetime1 = this.upButton;
        var15Lifetime1.height = var5;
        var15Lifetime1.width = this.width;
        var15Lifetime1.x = 0;
        var15Lifetime1.y = 0;
        var16Lifetime1 = this.downButton;
        var16Lifetime1.x = 0;
        var16Lifetime1.height = this.height - var6;
        var16Lifetime1.y = var6;
        var16Lifetime1.width = this.width;
        var14Lifetime1 = 60 / ((-68 - param2) / 40);
        var17Lifetime1 = this.track;
        var17Lifetime1.y = var5;
        var17Lifetime1.height = var7;
        var17Lifetime1.x = 0;
        var17Lifetime1.width = this.width;
        var18Lifetime1 = this.pageUpRegion;
        var18Lifetime1.width = this.width;
        var18Lifetime1.x = 0;
        var18Lifetime1.height = var12Lifetime1;
        var18Lifetime1.y = 0;
        var19Lifetime1 = this.pageDownRegion;
        var19Lifetime1.width = this.width;
        var19Lifetime1.x = 0;
        var19Lifetime1.y = var12Lifetime1;
        var19Lifetime1.height = -var12Lifetime1 + var7;
        var20Lifetime1 = this.thumb;
        var20Lifetime1.height = var8;
        this.track.enabled = param3 < param0 ? true : false;
        this.downButton.enabled = param3 < param0 ? true : false;
        this.upButton.enabled = param3 < param0 ? true : false;
        var20Lifetime1.x = 0;
        var20Lifetime1.width = this.width;
        var20Lifetime1.y = var11Lifetime1;
    }

    final boolean isThumbDragging(boolean param0) {
        if (param0) {
          return 0 != this.thumb.field_C ? true : false;
        }
        this.track = (Widget) null;
        return 0 != this.thumb.field_C ? true : false;
    }

    final boolean pollPageDown(boolean param0) {
        if (this.pageDownRegion.field_o != 0) {
          this.repeatDelay = 20;
          return true;
        }
        if (this.pageDownRegion.field_C != 0) {
          if (this.repeatDelay > 0) {
            this.repeatDelay = this.repeatDelay - 1;
          }
          if (this.repeatDelay == 0 &&
            uia.field_b >= this.thumb.field_E + (this.thumb.screenY + this.thumb.field_db + this.thumb.height)) {
            this.repeatDelay = 3;
            return true;
          }
        }
        if (param0) {
          return false;
        }
        this.pageUpRegion = (Widget) null;
        return false;
    }

    final boolean pollScrollUp(int param0) {
        if (this.upButton.field_o != param0) {
          this.repeatDelay = 20;
          return true;
        }
        if (0 == this.upButton.field_C) {
          return false;
        }
        if (0 < this.repeatDelay) {
          this.repeatDelay = this.repeatDelay - 1;
          if (this.repeatDelay == 0) {
            this.repeatDelay = 3;
            return true;
          }
          return false;
        }
        if (this.repeatDelay == 0) {
          this.repeatDelay = 3;
          return true;
        }
        return false;
    }

    ScrollBarWidget(long param0, Widget param1, Widget param2, Widget param3, Widget param4) {
        super(param0, (Widget) null);
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        Widget var9 = null;
        Widget var10 = null;
        try {
          this.upButton = new Widget(0L, param1);
          this.downButton = new Widget(0L, param2);
          this.addChild(-561, this.upButton);
          this.addChild(-561, this.downButton);
          this.track = new Widget(0L, (Widget) null);
          this.addChild(-561, this.track);
          this.pageUpRegion = new Widget(0L, param3);
          this.pageDownRegion = new Widget(0L, param3);
          this.pageDownRegion.field_S = true;
          var9 = this.pageUpRegion;
          var10 = var9;
          var10.field_S = true;
          this.track.addChild(-561, this.pageUpRegion);
          this.track.addChild(-561, this.pageDownRegion);
          this.thumb = new Widget(0L, param4);
          this.thumb.draggable = true;
          this.track.addChild(-561, this.thumb);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_5_0 = var7;
          stackIn_5_1 = new StringBuilder().append("pjb.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_Db = "Next condition/action value 2";
    }
}
