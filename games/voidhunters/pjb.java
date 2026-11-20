/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pjb extends Widget {
    private Widget field_xb;
    static Object field_vb;
    private Widget field_Ab;
    private Widget field_yb;
    private Widget field_wb;
    private int field_zb;
    private Widget field_Bb;
    private Widget field_Cb;
    static String field_Db;

    final boolean j(int param0) {
        if (0 != this.field_Cb.field_o) {
          this.field_zb = 20;
          return true;
        }
        if (param0 >= -2) {
          this.field_xb = (Widget) null;
        }
        if (this.field_Cb.field_C == 0) {
          return false;
        }
        if (this.field_zb > 0) {
          this.field_zb = this.field_zb - 1;
        }
        if (this.field_zb != 0) {
          return false;
        }
        this.field_zb = 3;
        return true;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this.height = param5;
        this.x = param0;
        this.width = param6;
        this.y = param2;
        this.a(param1, param3, (byte) 88, param4);
        if (param7 != -1) {
          Class[] var10 = (Class[]) null;
          pjb.a((IsaacPacketBuffer) null, (SerializableGameState[]) null, -91, 37, (Class[]) null, 13);
        }
    }

    final static void a(IsaacPacketBuffer param0, SerializableGameState[] param1, int param2, int param3, Class[] param4, int param5) {
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
              if (vq.writeBoolean(stackIn_10_0, stackIn_10_1, stackIn_11_2)) {
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

    final int a(int param0, int param1, byte param2, boolean param3) {
        int var8 = 0;
        int var9 = 0;
        int var5 = 50 % ((24 - param2) / 41);
        int var6 = 0;
        int var7 = this.field_yb.height - this.field_Bb.height;
        if (0 < var7) {
          var8 = this.field_Bb.y;
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
        pjb.a((IsaacPacketBuffer) null, (SerializableGameState[]) null, 92, 41, (Class[]) null, -34);
        field_Db = null;
    }

    final static jk a(long param0, boolean param1) {
        if (!param1) {
          return (jk) null;
        }
        return (jk) (SetUseDetailLines.field_p.a(-1, param0));
    }

    final boolean i(int param0) {
        if (this.field_Ab.field_o != 0) {
          this.field_zb = 20;
          return true;
        }
        if (param0 != 20) {
          this.a(false);
          if (this.field_Ab.field_C == 0) {
            return false;
          }
          if (this.field_zb > 0) {
            this.field_zb = this.field_zb - 1;
          }
          if (0 != this.field_zb) {
            return false;
          }
          if (this.field_Bb.field_db + this.field_Bb.screenY > uia.field_b) {
            this.field_zb = 3;
            return true;
          }
          return false;
        }
        if (this.field_Ab.field_C == 0) {
          return false;
        }
        if (this.field_zb > 0) {
          this.field_zb = this.field_zb - 1;
        }
        if (0 != this.field_zb) {
          return false;
        }
        if (this.field_Bb.field_db + this.field_Bb.screenY > uia.field_b) {
          this.field_zb = 3;
          return true;
        }
        return false;
    }

    pjb(long param0, pjb param1) {
        this(param0, param1.field_wb, param1.field_Cb, param1.field_Ab, param1.field_Bb);
    }

    final void a(int param0, int param1, byte param2, int param3) {
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
          var15 = this.field_wb;
          var15.height = var5;
          var15.width = this.width;
          var15.x = 0;
          var15.y = 0;
          var16 = this.field_Cb;
          var16.x = 0;
          var16.height = this.height - var6;
          var16.y = var6;
          var16.width = this.width;
          var14 = 60 / ((-68 - param2) / 40);
          var17 = this.field_yb;
          var17.y = var5;
          var17.height = var7;
          var17.x = 0;
          var17.width = this.width;
          var18 = this.field_Ab;
          var18.width = this.width;
          var18.x = 0;
          var18.height = var12;
          var18.y = 0;
          var19 = this.field_xb;
          var19.width = this.width;
          var19.x = 0;
          var19.y = var12;
          var19.height = -var12 + var7;
          var20 = this.field_Bb;
          var20.height = var8;
          this.field_yb.enabled = param3 < param0 ? true : false;
          this.field_Cb.enabled = param3 < param0 ? true : false;
          this.field_wb.enabled = param3 < param0 ? true : false;
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
        var15Lifetime1 = this.field_wb;
        var15Lifetime1.height = var5;
        var15Lifetime1.width = this.width;
        var15Lifetime1.x = 0;
        var15Lifetime1.y = 0;
        var16Lifetime1 = this.field_Cb;
        var16Lifetime1.x = 0;
        var16Lifetime1.height = this.height - var6;
        var16Lifetime1.y = var6;
        var16Lifetime1.width = this.width;
        var14Lifetime1 = 60 / ((-68 - param2) / 40);
        var17Lifetime1 = this.field_yb;
        var17Lifetime1.y = var5;
        var17Lifetime1.height = var7;
        var17Lifetime1.x = 0;
        var17Lifetime1.width = this.width;
        var18Lifetime1 = this.field_Ab;
        var18Lifetime1.width = this.width;
        var18Lifetime1.x = 0;
        var18Lifetime1.height = var12Lifetime1;
        var18Lifetime1.y = 0;
        var19Lifetime1 = this.field_xb;
        var19Lifetime1.width = this.width;
        var19Lifetime1.x = 0;
        var19Lifetime1.y = var12Lifetime1;
        var19Lifetime1.height = -var12Lifetime1 + var7;
        var20Lifetime1 = this.field_Bb;
        var20Lifetime1.height = var8;
        this.field_yb.enabled = param3 < param0 ? true : false;
        this.field_Cb.enabled = param3 < param0 ? true : false;
        this.field_wb.enabled = param3 < param0 ? true : false;
        var20Lifetime1.x = 0;
        var20Lifetime1.width = this.width;
        var20Lifetime1.y = var11Lifetime1;
    }

    final boolean a(boolean param0) {
        if (param0) {
          return 0 != this.field_Bb.field_C ? true : false;
        }
        this.field_yb = (Widget) null;
        return 0 != this.field_Bb.field_C ? true : false;
    }

    final boolean b(boolean param0) {
        if (this.field_xb.field_o != 0) {
          this.field_zb = 20;
          return true;
        }
        if (this.field_xb.field_C != 0) {
          if (this.field_zb > 0) {
            this.field_zb = this.field_zb - 1;
          }
          if (this.field_zb == 0 &&
            uia.field_b >= this.field_Bb.field_E + (this.field_Bb.screenY + this.field_Bb.field_db + this.field_Bb.height)) {
            this.field_zb = 3;
            return true;
          }
        }
        if (param0) {
          return false;
        }
        this.field_Ab = (Widget) null;
        return false;
    }

    final boolean h(int param0) {
        if (this.field_wb.field_o != param0) {
          this.field_zb = 20;
          return true;
        }
        if (0 == this.field_wb.field_C) {
          return false;
        }
        if (0 < this.field_zb) {
          this.field_zb = this.field_zb - 1;
          if (this.field_zb == 0) {
            this.field_zb = 3;
            return true;
          }
          return false;
        }
        if (this.field_zb == 0) {
          this.field_zb = 3;
          return true;
        }
        return false;
    }

    pjb(long param0, Widget param1, Widget param2, Widget param3, Widget param4) {
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
          this.field_wb = new Widget(0L, param1);
          this.field_Cb = new Widget(0L, param2);
          this.addChild(-561, this.field_wb);
          this.addChild(-561, this.field_Cb);
          this.field_yb = new Widget(0L, (Widget) null);
          this.addChild(-561, this.field_yb);
          this.field_Ab = new Widget(0L, param3);
          this.field_xb = new Widget(0L, param3);
          this.field_xb.field_S = true;
          var9 = this.field_Ab;
          var10 = var9;
          var10.field_S = true;
          this.field_yb.addChild(-561, this.field_Ab);
          this.field_yb.addChild(-561, this.field_xb);
          this.field_Bb = new Widget(0L, param4);
          this.field_Bb.draggable = true;
          this.field_yb.addChild(-561, this.field_Bb);
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
