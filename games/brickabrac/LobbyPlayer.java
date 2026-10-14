/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LobbyPlayer extends UiComponent {
    static int field_Pb;
    long playerId;
    String accountName;
    boolean invitationPending;
    UiComponent field_Tb;
    UiComponent nameLabel;
    static String field_bc;
    long arrivalTimeMillis;
    UiComponent actionLabel;
    boolean member;
    int rating;
    int removalStatus;
    static String field_jc;
    UiComponent statusLabel;
    int ratedGameCount;
    int badgeId;
    String displayName;
    boolean joinRequestPending;
    static String field_Sb;
    int optionEligibilityMask;
    UiComponent ratingLabel;
    int statusChangeTick;

    public static void h(int param0) {
        int var1 = 102 % ((param0 - 48) / 43);
        field_jc = null;
        field_bc = null;
        field_Sb = null;
    }

    final void updateNames(String displayName, String accountName, byte obfuscationGuard) {
        CharSequence var6 = null;
        try {
          this.accountName = accountName;
          if (obfuscationGuard != -121) {
            LobbyPlayer var5 = (LobbyPlayer) null;
            this.comesBeforePlayer((LobbyPlayer) null, -125);
          }
          this.displayName = displayName;
          var6 = (CharSequence) ((Object) this.accountName);
          ChatMessage.normalizePlayerName(var6, 116);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "id.B(" + (displayName != null ? "{...}" : "null") + ',' + (accountName != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    LobbyPlayer(String accountName, String displayName, long playerId) {
        super(0L, (UiComponent) null);
        CharSequence var6 = null;
        try {
          this.accountName = accountName;
          this.displayName = displayName;
          this.playerId = playerId;
          var6 = (CharSequence) ((Object) this.accountName);
          ChatMessage.normalizePlayerName(var6, 124);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "id.<init>(" + (accountName != null ? "{...}" : "null") + ',' + (displayName != null ? "{...}" : "null") + ',' + playerId + ')');
        }
    }

    final static int[] createCharacterOrder(IsaacGenerator random, boolean obfuscationGuard) {
        int index = 0;
        int characterCount = 0;
        RuntimeException var2 = null;
        int[] order = null;
        int clientBranchFlag = 0;
        int[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        clientBranchFlag = BrickABrac.field_J ? 1 : 0;
        try {
          characterCount = tf.trackHeads.length;
          if (!LevelPackCard.hasFeatureBit(0, -107)) {
            characterCount--;
          }
          order = new int[characterCount];
          for (index = 0; order.length > index; index++) {
            order[index] = index;
          }
          if (obfuscationGuard) {
            field_Sb = (String) null;
          }
          AppletGameShell.shuffleFivePasses(order, (byte) 39, random);
          stackIn_9_0 = order;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("id.A(");
          if (random == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final boolean isUnindexed(int obfuscationGuard) {
        if (obfuscationGuard != 0) {
          return false;
        }
        return !this.isSecondaryLinked(2) ? true : false;
    }

    final boolean comesBeforePlayer(LobbyPlayer other, int obfuscationGuard) {
        RuntimeException var3 = null;
        String var4 = null;
        boolean stackIn_2_0 = false;
        int stackIn_3_1 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_11_0 = false;
        int stackIn_12_1 = 0;
        boolean stackIn_15_0 = false;
        boolean stackIn_19_0 = false;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_2_0 = other.joinRequestPending;
          if (this.joinRequestPending) {
            stackIn_3_1 = 0;
          } else {
            stackIn_3_1 = 1;
          }
          if ((stackIn_2_0 ? 1 : 0) == stackIn_3_1) {
            stackIn_6_0 = this.joinRequestPending;
            return stackIn_6_0;
          }
          if (obfuscationGuard != -755) {
            var4 = (String) null;
            this.updateNames((String) null, (String) null, (byte) -26);
          }
          stackIn_11_0 = this.invitationPending;
          if (other.invitationPending) {
            stackIn_12_1 = 0;
          } else {
            stackIn_12_1 = 1;
          }
          if ((stackIn_11_0 ? 1 : 0) == stackIn_12_1) {
            stackIn_15_0 = this.invitationPending;
            return stackIn_15_0;
          }
          stackIn_19_0 = !(this.arrivalTimeMillis >= other.arrivalTimeMillis);
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("id.D(");
          if (other == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
        field_bc = "Try changing the '<%0>' setting.";
        field_Pb = 0;
        field_jc = "You can spectate this game";
        field_Sb = "Concluded";
    }
}
