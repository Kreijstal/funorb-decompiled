/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CircleMovementLocomotor extends Locomotor {
    private int field_r;
    private boolean field_p;
    private boolean field_t;
    private int field_o;
    private int field_q;
    static String field_s;

    final int hashState(int param0, int param1) {
        if (param0 != 0) {
          return -79;
        }
        param1 = CurveOperator.mixHash((byte) 54, param1, this.field_o);
        param1 = CurveOperator.mixHash((byte) 100, param1, this.field_q);
        param1 = CurveOperator.mixHash((byte) 107, param1, this.field_r);
        return param1;
    }

    final void tick(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        var2 = this.getTrapInitialLocalX((byte) -112);
        var3 = this.getTrapInitialLocalY(false);
        if (!this.field_p &&
          !this.field_t) {
          var4 = (ConsoleTokenStream.sin8192(true, this.field_q >> 2) >> 8) * (this.field_o >> 8) + var2;
          var5 = var3 + (IntIntHashTable.cos8192(35, this.field_q >> 2) >> 8) * (this.field_o >> 8);
        } else {
          var4 = this.trap.getLocalX(25745);
          var5 = this.trap.getLocalY(false);
          this.field_p = false;
        }
        this.field_q = this.field_q - this.field_r;
        this.field_q = GameScreen.positiveModulo(this.field_q, 32768, 78);
        var7 = 49 % ((param0 + 69) / 42);
        var6 = var2 + (ConsoleTokenStream.sin8192(true, this.field_q >> 2) >> 8) * (this.field_o >> 8);
        var8 = var3 + (IntIntHashTable.cos8192(102, this.field_q >> 2) >> 8) * (this.field_o >> 8);
        this.trap.move((byte) -94, -var4 + var6, var8 - var5);
    }

    final static boolean readBitFlag(int param0, BitPacketBuffer param1) {
        RuntimeException var2 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 5907) {
            stackIn_6_0 = (param1.readBits((byte) 44, 1) == 1);
            return stackIn_6_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("uha.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void attachToTrap(int param0, Trap param1) {
        try {
          super.attachToTrap(85, param1);
          this.field_p = true;
          if (param0 < 35) {
            this.field_r = -34;
          }
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "uha.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void applyConstraint(int param0) {
        if (param0 != 1) {
          this.hashState(116, 3);
        }
    }

    final void mirror(byte param0) {
        if (param0 > -116) {
          this.field_t = false;
        }
        super.mirror((byte) -120);
        this.field_q = -this.field_q;
        this.field_r = -this.field_r;
    }

    final static int e(byte param0) {
        if (param0 < 47) {
          field_s = (String) null;
        }
        return 256;
    }

    final void encode(BitPacketBuffer param0, byte param1) {
        UiComponent var4 = null;
        BitPacketBuffer stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_3_2 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          super.encode(param0, (byte) -122);
          param0.writeBits((byte) -44, this.field_o >> 16, 10);
          param0.writeBits((byte) 90, dqa.toOffsetBinary(true, this.field_r, 12), 12);
          param0.writeBits((byte) -126, ResourceArchive.scaleToBits((byte) 74, this.field_q, 32768, 4), 4);
          stackIn_2_0 = (BitPacketBuffer) (param0);
          stackIn_2_1 = -128;
          if (!this.field_t) {
            stackIn_3_2 = 0;
          } else {
            stackIn_3_2 = 1;
          }
          ((BitPacketBuffer) (Object) stackIn_2_0).writeBits((byte) stackIn_2_1, stackIn_3_2, 1);
          if (param1 >= -78) {
            var4 = (UiComponent) null;
            CircleMovementLocomotor.initializeLobbyCollections((UiComponent) null, -46, (byte) 104, (UiComponent) null, -72, 112, (byte[]) null, -67, (UiComponent) null, 84);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("uha.R(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    CircleMovementLocomotor(Room param0, BitPacketBuffer param1, boolean param2) {
        super(param0, param1, param2);
        boolean stackIn_5_1 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        this.field_p = false;
        this.field_t = true;
        try {
          this.field_o = param1.readBits((byte) 44, 10) << 16;
          this.field_r = CoinItemComponent.fromOffsetBinary(true, 12, param1.readBits((byte) 44, 12));
          if (param0.formatVersion < 10) {
            this.field_q = SnakePitModel.unscaleFromBits(3, 32768, 0, param1.readBits((byte) 44, 3));
            this.field_t = true;
          } else {
            this.field_q = SnakePitModel.unscaleFromBits(4, 32768, 0, param1.readBits((byte) 44, 4));
            stackIn_5_1 = (1 == param1.readBits((byte) 44, 1));
            this.field_t = stackIn_5_1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("uha.<init>(");
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
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void initializeLobbyCollections(UiComponent param0, int param1, byte param2, UiComponent param3, int param4, int param5, byte[] param6, int param7, UiComponent param8, int param9) {
        int var11 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var12 = 0;
        var12 = TombRacer.field_G ? 1 : 0;
        try {
          um.field_m = param6;
          hpa.field_g = param5;
          SimpleConditionBehaviour.field_r = -1L;
          ColourRowCache.field_b = param6.length;
          C2SChooseRewardPacket.field_a = null;
          WaveformOperator.field_n = null;
          PlayerViewport.field_o = false;
          CourseLayoutFactory.field_b = new byte[(7 + hpa.field_g) / 8];
          if (param2 != -51) {
            return;
          }
          var10_int = 0;
          for (var11 = 0; var11 < um.field_m.length; var11++) {
            var10_int = var10_int + (um.field_m[var11] & 255);
          }
          var10_int = (var10_int + 7) / 8;
          TileGrid.field_e = new byte[var10_int];
          if (null == param8.field_J) {
            param8.field_J = new IntrusiveDeque();
          }
          uma.field_b = param8.field_J;
          uma.field_b.clear(param2 ^ -59);
          fua.field_a = new SecondaryNodeHashTable(param4);
          RasterizerOperator.field_o = 0;
          ValidatedTextInputWidget.field_K = 0;
          FleeLocomotor.field_z = -1;
          ProxySocketConnector.field_f = -1;
          if (param3.field_J == null) {
            param3.field_J = new IntrusiveDeque();
          }
          AffineTransform3D.field_j = param3.field_J;
          AffineTransform3D.field_j.clear(8);
          WhiteLightSensorComponent.field_K = new SecondaryNodeHashTable(param7);
          if (param0.field_J == null) {
            param0.field_J = new IntrusiveDeque();
          }
          DemoCourseGenerator.field_g = param0.field_J;
          DemoCourseGenerator.field_g.clear(8);
          tc.field_d = new SecondaryNodeHashTable(param1);
          qsa.field_a = param9;
          TileRenderable.field_d = 0L;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_18_0 = var10;
          stackIn_18_1 = new StringBuilder().append("uha.N(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param9).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        int var1 = -111 % ((-80 - param0) / 46);
        field_s = null;
    }

    final int getTypeId(int param0) {
        if (param0 != 1) {
          this.field_r = 5;
        }
        return 9;
    }

    static {
        field_s = "Bags";
    }
}
