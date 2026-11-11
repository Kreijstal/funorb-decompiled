/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FacePointLocomotor extends Locomotor {
    private boolean field_o;
    private int field_p;
    private int field_q;
    private int field_s;
    static MenuInputState field_r;

    final int hashState(int param0, int param1) {
        param1 = CurveOperator.mixHash((byte) 75, param1, this.field_p);
        if (param0 != 0) {
          return -7;
        }
        param1 = CurveOperator.mixHash((byte) 117, param1, this.field_q);
        param1 = CurveOperator.mixHash((byte) 121, param1, this.field_s);
        return param1;
    }

    final static ResourceArchive openArchive(boolean param0, int param1, boolean param2, int param3, byte param4) {
        if (param4 > -75) {
          return (ResourceArchive) null;
        }
        return nt.openArchive(param1, param3, 5200, param2, false, param0);
    }

    final static QuickChatMenu buildQuickChatPhraseMenu(UiComponent param0, UiComponent param1, UiComponent param2, int[] param3, boolean param4) {
        int var10_int = 0;
        int var5_int = 0;
        String[] var6 = null;
        char[] var7 = null;
        QuickChatMenu[] var8 = null;
        int var9 = 0;
        QuickChatPhraseDefinition var11 = null;
        int var12 = 0;
        char[] var13 = null;
        char[] var14 = null;
        QuickChatMenu stackIn_3_0 = null;
        Object stackIn_10_0 = null;
        QuickChatMenu stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var5 = null;
        Exception var10 = null;
        var12 = TombRacer.field_G ? 1 : 0;
        try {
          var5_int = param3.length;
          var6 = new String[var5_int];
          var14 = new char[var5_int];
          var13 = var14;
          var7 = var13;
          if (param4) {
            stackIn_3_0 = (QuickChatMenu) null;
            return stackIn_3_0;
          }
          var8 = new QuickChatMenu[var5_int];
          var9 = 49;
          try {
            for (var10_int = 0; var10_int < var5_int; var10_int++) {
              var11 = ByteStorage.field_a.getPhrase(false, param3[var10_int]);
              var6[var10_int] = var11.getPreview((byte) -5);
              var9 = (char)(var9 + 1);
              var7[var10_int] = (char)var9;
              var8[var10_int] = null;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var10 = (Exception) (Object) decompiledCaughtException;
            stackIn_10_0 = null;
            return (QuickChatMenu) (stackIn_10_0);
          }
          stackIn_12_0 = new QuickChatMenu(0L, param2, param0, param1, var8, param3, var6, var14);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("sa.M(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param4).append(')').toString());
        }
    }

    final int getTypeId(int param0) {
        if (param0 != 1) {
          return 68;
        }
        return 10;
    }

    final static void a(boolean param0, byte param1) {
        if (mla.field_a > 0 &&
          LegacyOpenGlBloomEffect.field_o) {
          SoftwareRasterizer.darkenRectangle(0, 0, SoftwareRasterizer.width, era.field_e.field_A);
          VboVertexArray.field_k.drawFullScreen(108, param0);
        }
        if (param1 <= 6) {
          int[] var3 = (int[]) null;
          FacePointLocomotor.buildQuickChatPhraseMenu((UiComponent) null, (UiComponent) null, (UiComponent) null, (int[]) null, true);
        }
        if ((GameKeyHandler.field_a > 0 || fp.field_e > 0) &&
          OpenGlDisplayLists.field_e) {
          SoftwareRasterizer.darkenRectangle(0, 0, SoftwareRasterizer.width, era.field_e.field_A);
          PlayerModel.field_a.drawFullScreen(85, param0);
        }
    }

    final void encode(BitPacketBuffer param0, byte param1) {
        super.encode(param0, (byte) -85);
        param0.writeBits((byte) 2, dqa.toOffsetBinary(true, this.field_p >> 16, 12), 12);
        param0.writeBits((byte) -126, dqa.toOffsetBinary(true, this.field_q >> 16, 12), 12);
        if (param1 > -78) {
          return;
        }
        try {
          param0.writeBits((byte) 79, this.field_o ? 1 : 0, 1);
          param0.writeBits((byte) 56, dqa.toOffsetBinary(true, this.field_s, 12), 12);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "sa.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void applyConstraint(int param0) {
        if (param0 != 1) {
          field_r = (MenuInputState) null;
        }
    }

    final void tick(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        var9 = TombRacer.field_G ? 1 : 0;
        var2 = this.trap.getLocalX(25745) - this.getTrapInitialLocalX((byte) -57);
        var5 = -32 / ((-69 - param0) / 42);
        var3 = this.trap.getLocalY(false) - this.getTrapInitialLocalY(false);
        if (this.field_o) {
          var6 = -this.field_q + var3 >> 10;
          var4 = -this.field_p + var2 >> 10;
        } else {
          var6 = this.field_q - var3 >> 10;
          var4 = this.field_p - var2 >> 10;
        }
        var7 = tia.atan2(var6, var4, -29543) - tia.atan2(-256, 0, -29543);
        for (var7 = var7 * -1; var7 < 0; var7 += 8192) {
        }
        regionExit1: {
          var8 = var7 - this.trap.getFacingAngle(-25787);
          if (0 < this.field_s) {
            while (var8 < -4096) {
              var8 += 8192;
            }
            while (var8 > 4096) {
              var8 -= 8192;
            }
            if (this.field_s < var8) {
              var8 = this.field_s;
            } else {
              if (var8 >= -this.field_s) {
                this.trap.rotateBy(false, var8);
              } else {
                var8 = -this.field_s;
                this.trap.rotateBy(false, var8);
              }
              break regionExit1;
            }
          }
          this.trap.rotateBy(false, var8);
        }
    }

    public static void releaseStatics(int param0) {
        field_r = null;
        if (param0 >= -43) {
          field_r = (MenuInputState) null;
        }
    }

    final void attachToTrap(int param0, Trap param1) {
        try {
          if (param0 <= 35) {
            FacePointLocomotor.openArchive(true, 47, true, -59, (byte) -121);
          }
          super.attachToTrap(110, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "sa.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    FacePointLocomotor(Room param0, BitPacketBuffer param1, boolean param2) {
        super(param0, param1, param2);
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        this.field_o = true;
        try {
          this.field_p = CoinItemComponent.fromOffsetBinary(true, 12, param1.readBits((byte) 44, 12)) << 16;
          this.field_q = CoinItemComponent.fromOffsetBinary(true, 12, param1.readBits((byte) 44, 12)) << 16;
          stackIn_4_1 = (param1.readBits((byte) 44, 1) == 1);
          this.field_o = stackIn_4_1;
          if (this.getRoom(true).formatVersion < 3) {
            this.field_s = 0;
          } else {
            this.field_s = CoinItemComponent.fromOffsetBinary(true, 12, param1.readBits((byte) 44, 12));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("sa.<init>(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_r = new MenuInputState(1);
    }
}
