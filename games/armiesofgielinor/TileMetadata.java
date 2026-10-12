/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TileMetadata implements TaggedFieldReader {
    int ownerPlayer;
    int modifierFlags;
    int tag;
    static int[] field_a;
    static int[] field_h;
    int godId;
    String displayName;
    static int[] field_f;
    static String field_i;

    public static void a(int param0) {
        field_f = null;
        field_a = null;
        field_i = null;
        field_h = null;
        if (param0 != 23582) {
          field_f = (int[]) null;
        }
    }

    public final void decodeTaggedField(int encodedLength, CipherPacketBuffer packet, String fieldName, byte obfuscationGuard) {
        int var6 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard != 37) {
            TileMetadata.b(-94);
          }
          if (fieldName.equals("name")) {
            if (0 >= encodedLength) {
              return;
            }
            this.displayName = PortalLossCondition.a(packet, encodedLength, (byte) -115);
          } else {
            if (!fieldName.equals("mf")) {
              if (fieldName.equals("ownr")) {
                if (0 >= encodedLength) {
                  return;
                }
                this.ownerPlayer = (int)tn.readTaggedInteger(false, encodedLength, packet);
                return;
              }
              if (fieldName.equals("tag")) {
                if (encodedLength <= 0) {
                  return;
                }
                this.tag = (int)tn.readTaggedInteger(false, encodedLength, packet);
                return;
              }
              if (!fieldName.equals("god")) {
                return;
              }
              if (0 >= encodedLength) {
                return;
              }
              this.godId = (int)tn.readTaggedInteger(false, encodedLength, packet);
              return;
            }
            if (encodedLength > 0) {
              this.modifierFlags = (int)tn.readTaggedInteger(false, encodedLength, packet);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_26_0 = var5;
          stackIn_26_1 = new StringBuilder().append("ca.B(").append(encodedLength).append(',');
          if (packet == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (fieldName == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void a(java.awt.Component param0, int param1, PlatformTaskService param2, boolean param3, int param4, MusicCrossfadeStream param5, int param6, int param7) {
        try {
          PcmPlayer.configureOutput(param7, param3, 10);
          l.musicPlayer = PcmPlayer.create(param2, param0, 0, param6);
          TextCursor.field_e = PcmPlayer.create(param2, param0, 1, param1);
          AnimationSkeleton.field_n = new PcmStreamMixer();
          ku.field_K = param1;
          if (param4 >= -38) {
            field_a = (int[]) null;
          }
          TextCursor.field_e.setStream(AnimationSkeleton.field_n);
          lk.musicCrossfadeStream = param5;
          lk.musicCrossfadeStream.setMasterGain(te.field_n, -120);
          l.musicPlayer.setStream(lk.musicCrossfadeStream);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ca.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static long b(int param0) {
        if (param0 != 0) {
          TileMetadata.a(-47, true);
        }
        return -CampaignMenuButton.lastPacketReadMillis + vi.monotonicMillis(-53);
    }

    final static pf[] c(int param0) {
        if (param0 != 0) {
          TileMetadata.c(-90);
        }
        return new pf[]{CombatSandbox.field_j, ps.field_y, MatchConditionEntry.field_l};
    }

    final static void a(int param0, boolean param1) {
        if (gk.field_J > 0 &&
          bw.field_g) {
          SoftwareRaster.d(0, 0, SoftwareRaster.width, CombatEvent.field_I.screenY);
          qc.field_c.draw(param1, 20);
        }
        if ((!(PreparedAction.field_r <= 0) ||
          !(0 >= InstructionsPanel.field_D)) &&
          ChannelGainProfile.field_f) {
          SoftwareRaster.d(0, 0, SoftwareRaster.width, CombatEvent.field_I.screenY);
          ta.field_R.draw(param1, 20);
        }
        if (param0 != 5295) {
          TileMetadata.a(88);
        }
    }

    TileMetadata() {
        this.godId = -1;
        this.tag = 0;
    }

    static {
        field_f = new int[8192];
        field_i = "Waiting for graphics";
    }
}
