/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LobbyRoom extends ClientUiComponent {
    int playerCount;
    boolean rated;
    ClientUiComponent field_ec;
    ClientUiComponent field_Wb;
    int displayRating;
    static ih field_Kb;
    ClientUiComponent field_sc;
    static String field_Jb;
    ClientUiComponent capacityComponent;
    int notificationCode;
    ClientUiComponent field_Rb;
    ClientUiComponent spectatorIcon;
    int spectatorMode;
    byte[] gameOptions;
    ClientUiComponent field_Xb;
    int notificationTicks;
    String[] playerNames;
    long ownerAccountId;
    ClientUiComponent gameTypeIcon;
    boolean joinable;
    ClientUiComponent optionIconContainer;
    boolean openToJoin;
    int completedDurationMillis;
    ClientUiComponent field_Pb;
    int playerCapacity;
    ClientUiComponent playerCountComponent;
    ClientUiComponent[] optionIcons;
    ClientUiComponent ratingComponent;
    int gameType;
    boolean playing;
    String ownerName;
    long activityStartedMillis;
    ClientUiComponent field_Yb;
    ClientUiComponent ownerNameComponent;
    static int field_Ob;
    boolean joinRequestSent;
    boolean invitationReceived;
    boolean allowsAdmissionRequests;
    ClientUiComponent ratedIcon;
    ClientUiComponent field_Ib;

    public static void e(byte param0) {
        if (param0 > -52) {
          return;
        }
        field_Jb = null;
        field_Kb = null;
    }

    final boolean isRemovedFromIndex(int obfuscationGuard) {
        if (obfuscationGuard == -7) {
          return !this.isSecondaryLinked((byte) 90) ? true : false;
        }
        this.getRoomId((byte) -65);
        return !this.isSecondaryLinked((byte) 90) ? true : false;
    }

    final int getRoomId(byte obfuscationGuard) {
        int var2 = -52 / ((35 - obfuscationGuard) / 38);
        return (int)this.getSecondaryKey(116);
    }

    LobbyRoom(int gameOptionCount) {
        super(0L, (ClientUiComponent) null);
        this.gameOptions = new byte[gameOptionCount];
    }

    final boolean sortsBefore(byte obfuscationGuard, LobbyRoom other) {
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_1 = 0;
        boolean stackIn_31_0 = false;
        boolean stackIn_38_0 = false;
        boolean stackIn_41_0 = false;
        int stackIn_42_1 = 0;
        boolean stackIn_47_0 = false;
        int stackIn_55_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_63_0 = 0;
        boolean stackIn_67_0 = false;
        boolean stackIn_71_0 = false;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        int hasInvitationPriority = 0;
        RuntimeException var3 = null;
        int otherHasInvitationPriority = 0;
        int hasAdmissionPriority = 0;
        int otherHasAdmissionPriority = 0;
        try {
          if (obfuscationGuard > -13) {
            this.gameOptions = (byte[]) null;
          }
          if (!this.invitationReceived) {
            stackIn_8_0 = (this.notificationCode == 6) ? 1 : 0;
          } else {
            stackIn_8_0 = 1;
          }
          hasInvitationPriority = stackIn_8_0;
          if (!other.invitationReceived) {
            stackIn_14_0 = (other.notificationCode == 6) ? 1 : 0;
          } else {
            stackIn_14_0 = 1;
          }
          otherHasInvitationPriority = stackIn_14_0;
          stackIn_17_0 = (hasInvitationPriority != 0) ? 0 : 1;
          if (stackIn_17_0 == otherHasInvitationPriority) {
            stackIn_20_0 = hasInvitationPriority;
            return stackIn_20_0 != 0;
          }
          if (hasInvitationPriority == 0) {
            stackIn_25_0 = (this.joinable) ? 0 : 1;
            if (other.joinable) {
              stackIn_28_1 = 0;
            } else {
              stackIn_28_1 = 1;
            }
            if (stackIn_25_0 != stackIn_28_1) {
              stackIn_31_0 = this.joinable;
              return stackIn_31_0;
            }
            if (this.joinable &&
              other.gameType != this.gameType) {
              stackIn_38_0 = !(this.gameType >= other.gameType);
              return stackIn_38_0;
            }
          }
          stackIn_41_0 = other.playing;
          if (this.playing) {
            stackIn_42_1 = 0;
          } else {
            stackIn_42_1 = 1;
          }
          if ((stackIn_41_0 ? 1 : 0) == stackIn_42_1) {
            stackIn_47_0 = !(this.playing);
            return stackIn_47_0;
          }
          if (!this.playing) {
            stackIn_71_0 = !(this.activityStartedMillis >= other.activityStartedMillis);
            return stackIn_71_0;
          }
          if (this.allowsAdmissionRequests) {
            stackIn_55_0 = 1;
          } else {
            stackIn_55_0 = (this.spectatorMode == 2) ? 1 : 0;
          }
          hasAdmissionPriority = stackIn_55_0;
          if (!other.allowsAdmissionRequests) {
            stackIn_61_0 = (other.spectatorMode == 2) ? 1 : 0;
          } else {
            stackIn_61_0 = 1;
          }
          otherHasAdmissionPriority = stackIn_61_0;
          if (hasAdmissionPriority == otherHasAdmissionPriority) {
            stackIn_67_0 = !(other.activityStartedMillis >= this.activityStartedMillis);
            return stackIn_67_0;
          }
          stackIn_63_0 = hasAdmissionPriority;
          return stackIn_63_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_74_0 = var3;
          stackIn_74_1 = new StringBuilder().append("au.B(").append(obfuscationGuard).append(',');
          if (other == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_74_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(')').toString());
        }
    }

    static {
        field_Jb = "Invite more players, or alternatively try changing the following settings:  ";
        field_Ob = 0;
    }
}
