/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LocalGameWorld extends GameWorld {
    static IntrusiveDeque field_M;
    static UiComponent field_O;
    static boolean field_L;
    static String field_N;

    LocalGameWorld(String[] param0, LevelData param1) {
        super(param0, param1);
    }

    public static void releaseStatics(byte param0) {
        field_N = null;
        field_M = null;
        if (param0 <= 37) {
          field_L = false;
          field_O = null;
          return;
        }
        field_O = null;
    }

    final static int countCharacter(int param0, char param1, CharSequence param2) {
        int var5 = 0;
        int var3_int = 0;
        int var4 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param0 > -118) {
            stackIn_3_0 = 101;
            return stackIn_3_0;
          }
          var3_int = 0;
          var4 = param2.length();
          for (var5 = 0; var4 > var5; var5++) {
            if (param1 == param2.charAt(var5)) {
              var3_int++;
            }
          }
          stackIn_11_0 = var3_int;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("ro.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void writeWorldState(PacketBuffer param0, byte param1) {
        PacketBuffer stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_4_2 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        SimEntity var3 = null;
        TerrainEffectZone var3_ref = null;
        RuntimeException var3_ref2 = null;
        MeltdownPuddle var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        SimUnit var7 = null;
        ZombieDrop var8 = null;
        SimZombie var9 = null;
        int var3_intLifetime1;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          param0.writeByte(-110, this.field_r);
          param0.writeShort(this.currentTick, (byte) -96);
          stackIn_3_0 = (PacketBuffer) (param0);
          stackIn_3_1 = 109;
          if (this.field_i) {
            stackIn_4_2 = 1;
          } else {
            stackIn_4_2 = 0;
          }
          ((PacketBuffer) (Object) stackIn_3_0).writeByte(stackIn_3_1, stackIn_4_2);
          param0.writeShort(this.field_C, (byte) -121);
          param0.writeShort(this.field_I, (byte) -55);
          param0.writeShort(this.field_g, (byte) -54);
          param0.writeByte(-73, this.phase);
          for (var3_int = 0; this.teamCount > var3_int; var3_int++) {
            param0.writeByte(110, this.field_y[var3_int]);
            param0.writeMedium(this.field_D[var3_int][0], -8593);
            param0.writeMedium(this.field_D[var3_int][1], -8593);
            param0.writeShort(this.teamScores[var3_int], (byte) -84);
            param0.writeMedium((int)(this.teamUpgradeMask[var3_int] >>> 40), -8593);
            param0.writeShort(this.field_a[var3_int], (byte) -85);
            param0.writeShort(this.field_z[var3_int], (byte) -78);
          }
          var3 = (SimEntity) (this.characters.last(40));
          while (var3 != null) {
            boolean decompiledFrameRemainder0 = true;
            if (var3 instanceof SimUnit) {
              var7 = (SimUnit) (var3);
              decompiledFrameRemainder0 = (var7.state != 21);
              if (decompiledFrameRemainder0) {
                decompiledFrameRemainder0 = !(var7.removed);
              }
            }
            if (decompiledFrameRemainder0) {
              param0.writeByte(108, this.getEntityTypeCode(var3, (byte) -105));
              param0.writeByte(110, var3.objectId);
              param0.writeShort(var3.getX((byte) -112), (byte) -67);
              param0.writeShort(var3.getY(1829947600), (byte) -95);
              var4_int = var3.field_D;
              if (var3 instanceof SimZombie) {
                var9 = (SimZombie) (var3);
                var4_int = var4_int | var9.field_gb << 30;
              } else {
                if (var3 instanceof ZombieDrop) {
                  var8 = (ZombieDrop) (var3);
                  if (var8.field_Q) {
                    var4_int = var4_int | 536870912;
                  }
                }
              }
              var4_int = var4_int & 255 | (-16777216 & var4_int) >> 16;
              param0.writeShort(var4_int, (byte) -104);
            }
            var3 = (SimEntity) (this.characters.previous(6));
          }
          var3_ref = (TerrainEffectZone) (this.field_s.last(102));
          while (var3_ref != null) {
            param0.writeByte(-64, 5);
            param0.writeByte(112, var3_ref.field_q);
            param0.writeShort((var3_ref.field_m + ClientProtocolStage.field_f) * 24, (byte) -69);
            param0.writeShort((ClientProtocolStage.field_f + var3_ref.field_t) * 24, (byte) -54);
            param0.writeShort(var3_ref.field_s, (byte) -103);
            var3_ref = (TerrainEffectZone) (this.field_s.previous(6));
          }
          var3_intLifetime1 = 11 + 16 * this.teamCount + (this.characters.size(0) + this.field_s.size(0) + this.field_A.size(0)) * 8;
          if (57 + var3_intLifetime1 > 2000) {
            param0.writeByte(117, 0);
            return;
          }
          var4 = (MeltdownPuddle) (this.field_A.last(59));
          if (param1 >= -107) {
            return;
          }
          while (var4 != null) {
            param0.writeByte(-94, 4);
            param0.writeByte(-36, 0);
            param0.writeShort(var4.field_i, (byte) -104);
            param0.writeShort(var4.field_l, (byte) -107);
            var5 = 0;
            var5 = var5 | var4.field_o << 30;
            param0.writeShort(var5, (byte) -105);
            var4 = (MeltdownPuddle) (this.field_A.previous(6));
          }
          param0.writeByte(-106, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref2 = decompiledCaughtException;
          stackIn_39_0 = var3_ref2;
          stackIn_39_1 = new StringBuilder().append("ro.E(");
          if (param0 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int getEntityTypeCode(SimEntity param0, byte param1) {
        RuntimeException var3 = null;
        PacketBuffer var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -80) {
            var4 = (PacketBuffer) null;
            this.writeWorldState((PacketBuffer) null, (byte) 11);
          }
          if (param0 instanceof SimZombie) {
            stackIn_12_0 = 1;
            return stackIn_12_0;
          }
          if (param0 instanceof SimHuman) {
            stackIn_5_0 = 2;
            return stackIn_5_0;
          }
          if (!(param0 instanceof ZombieDrop)) {
            stackIn_10_0 = 0;
            return stackIn_10_0;
          }
          stackIn_8_0 = 3;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("ro.B(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int packChatFilterSettings(byte param0) {
        if (param0 < 116) {
          return 69;
        }
        return (DiskArchiveRequest.field_C << 4) + ((GameHud.field_g << 2) + MusicPatchPcmStream.field_q);
    }

    static {
        field_N = "? ? ?";
    }
}
