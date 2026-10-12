/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LobbyPlayer extends ClientUiComponent {
    long accountId;
    String displayName;
    int notificationCode;
    static IndexedSprite[] field_Mb;
    ClientUiComponent admissionButton;
    boolean invitationSent;
    ClientUiComponent field_fc;
    boolean packedFlag0;
    static String field_bc;
    int chatIconId;
    int ratedGamesPlayed;
    String accountName;
    static int field_Ib;
    int rating;
    ClientUiComponent nameComponent;
    ClientUiComponent cancelRejectButton;
    long lastActivityMillis;
    int notificationTicks;
    static ClientUiComponent field_Lb;
    static String field_Jb;
    static int field_Nb;
    ClientUiComponent ratingComponent;
    int optionUnlockMask;
    boolean joinRequested;

    final boolean isRemovedFromIndex(int obfuscationGuard) {
        if (obfuscationGuard == 0) {
          return !this.isSecondaryLinked((byte) -70) ? true : false;
        }
        LobbyPlayer var3 = (LobbyPlayer) null;
        this.sortsBefore(-15, (LobbyPlayer) null);
        return !this.isSecondaryLinked((byte) -70) ? true : false;
    }

    final void setNames(byte obfuscationGuard, String displayName, String accountName) {
        CharSequence var5 = null;
        try {
          this.displayName = displayName;
          this.accountName = accountName;
          var5 = (CharSequence) ((Object) this.accountName);
          AccountNameNormalizer.normalize(var5, false);
          if (obfuscationGuard != 53) {
            LobbyPlayer.e((byte) -11);
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "of.D(" + obfuscationGuard + ',' + (displayName != null ? "{...}" : "null") + ',' + (accountName != null ? "{...}" : "null") + ')');
        }
    }

    LobbyPlayer(String accountName, String displayName, long accountId) {
        super(0L, (ClientUiComponent) null);
        CharSequence var6 = null;
        try {
          this.accountId = accountId;
          this.accountName = accountName;
          this.displayName = displayName;
          var6 = (CharSequence) ((Object) this.accountName);
          AccountNameNormalizer.normalize(var6, false);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "of.<init>(" + (accountName != null ? "{...}" : "null") + ',' + (displayName != null ? "{...}" : "null") + ',' + accountId + ')');
        }
    }

    final boolean sortsBefore(int obfuscationGuard, LobbyPlayer other) {
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_1 = 0;
        boolean stackIn_11_0 = false;
        boolean stackIn_14_0 = false;
        int stackIn_15_1 = 0;
        boolean stackIn_17_0 = false;
        boolean stackIn_21_0 = false;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != 9687) {
            var4 = (String) null;
            this.setNames((byte) 41, (String) null, (String) null);
          }
          stackIn_5_0 = (other.joinRequested) ? 0 : 1;
          if (this.joinRequested) {
            stackIn_8_1 = 0;
          } else {
            stackIn_8_1 = 1;
          }
          if (stackIn_5_0 != stackIn_8_1) {
            stackIn_11_0 = this.joinRequested;
            return stackIn_11_0;
          }
          stackIn_14_0 = other.invitationSent;
          if (this.invitationSent) {
            stackIn_15_1 = 0;
          } else {
            stackIn_15_1 = 1;
          }
          if ((stackIn_14_0 ? 1 : 0) != stackIn_15_1) {
            stackIn_21_0 = !(this.lastActivityMillis >= other.lastActivityMillis);
            return stackIn_21_0;
          }
          stackIn_17_0 = this.invitationSent;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_24_0 = var3;
          stackIn_24_1 = new StringBuilder().append("of.A(").append(obfuscationGuard).append(',');
          if (other == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final static void d(byte param0) {
        String var2 = (String) null;
        vi.a(cd.field_e, 640, (String) null);
        if (param0 != -24) {
          LobbyPlayer.d((byte) -75);
        }
    }

    public static void e(byte param0) {
        if (param0 != 20) {
          LobbyPlayer.e((byte) 74);
          field_Jb = null;
          field_bc = null;
          field_Mb = null;
          field_Lb = null;
          return;
        }
        field_Jb = null;
        field_bc = null;
        field_Mb = null;
        field_Lb = null;
    }

    final static void uploadQuicksave(Battlefield battlefield, int damageTaken, int unitLossCount, byte obfuscationGuard, int missionId, int campaignIndex) {
        CampaignQuicksave quicksave = null;
        int payloadStart = 0;
        if (DamageEvent.g(121)) {
          return;
        }
        try {
          quicksave = new CampaignQuicksave(campaignIndex, missionId, battlefield, damageTaken, unitLossCount > 0 ? true : false);
          bu.storedQuicksave = quicksave;
          vl.outgoingPacket.writeCipheredOpcode(32161, 80);
          vl.outgoingPacket.position = vl.outgoingPacket.position + 2;
          if (obfuscationGuard != -80) {
            Battlefield var8 = (Battlefield) null;
            LobbyPlayer.uploadQuicksave((Battlefield) null, -98, 73, (byte) 105, 55, -24);
          }
          payloadStart = vl.outgoingPacket.position;
          quicksave.write(0, vl.outgoingPacket);
          vl.outgoingPacket.f(0, vl.outgoingPacket.position - payloadStart);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "of.E(" + (battlefield != null ? "{...}" : "null") + ',' + damageTaken + ',' + unitLossCount + ',' + obfuscationGuard + ',' + missionId + ',' + campaignIndex + ')');
        }
    }

    static {
        field_Ib = -1;
        field_bc = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
    }
}
