/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DisplayModeFailure {
    static int soundCleanupCountdown;
    static AccountConnectionPhase WAIT_ACCOUNT_RESPONSE;
    static String reloadGameText;
    static ResourceArchive field_a;
    static int spriteSheetWidth;

    final static void showDisplayNameForm(byte guard) {
        if (null != AccountStatusDialogState.activeDialog) {
          AccountStatusDialogState.activeDialog.closeDialog(-7);
          if (guard == -49) {
            SecondaryNodeQueue.field_a = new DisplayNameForm();
            SlowBurstParticle.field_y.transitionToContent((byte) -94, SecondaryNodeQueue.field_a);
            return;
          }
          DisplayModeFailure.flattenFaceBuckets(3);
          SecondaryNodeQueue.field_a = new DisplayNameForm();
          SlowBurstParticle.field_y.transitionToContent((byte) -94, SecondaryNodeQueue.field_a);
          return;
        }
        if (guard != -49) {
          DisplayModeFailure.flattenFaceBuckets(3);
          SecondaryNodeQueue.field_a = new DisplayNameForm();
          SlowBurstParticle.field_y.transitionToContent((byte) -94, SecondaryNodeQueue.field_a);
          return;
        }
        SecondaryNodeQueue.field_a = new DisplayNameForm();
        SlowBurstParticle.field_y.transitionToContent((byte) -94, SecondaryNodeQueue.field_a);
    }

    final static LegacyAlphaFont loadNamedAlphaFont(ResourceArchive fontArchive, boolean guard, String groupName, String fileName, ResourceArchive spriteArchive) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        LegacyAlphaFont stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!guard) {
            WAIT_ACCOUNT_RESPONSE = (AccountConnectionPhase) null;
          }
          var5_int = spriteArchive.groupId(0, groupName);
          var6 = spriteArchive.fileId(var5_int, fileName, (byte) 126);
          stackIn_3_0 = TextureTransformMode.loadAlphaFont(fontArchive, (byte) -71, var5_int, var6, spriteArchive);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("vf.D(");
          if (fontArchive == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(guard).append(',');
          if (groupName == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (fileName == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (spriteArchive == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void releaseStatics(int guard) {
        if (guard != 1) {
          ResourceArchive var2 = (ResourceArchive) null;
          DisplayModeFailure.loadNamedAlphaFont((ResourceArchive) null, false, (String) null, (String) null, (ResourceArchive) null);
          field_a = null;
          reloadGameText = null;
          WAIT_ACCOUNT_RESPONSE = null;
          return;
        }
        field_a = null;
        reloadGameText = null;
        WAIT_ACCOUNT_RESPONSE = null;
    }

    final static void flattenFaceBuckets(int firstBucket) {
        int var2 = 0;
        int var1_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          var1_int = ModalDialog.field_C[firstBucket];
          for (var2 = 1; var2 < ModalDialog.field_C.length; var2++) {
            var3 = ModalDialog.field_C[var2];
            ArrayUtils.copy(Sumoblitz.field_G, var2 << 4, Sumoblitz.field_G, var1_int, var3);
            var1_int = var1_int + var3;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var1), "vf.B(" + firstBucket + ')');
        }
    }

    static {
        soundCleanupCountdown = 200;
        reloadGameText = "Reload game";
        WAIT_ACCOUNT_RESPONSE = new AccountConnectionPhase();
    }
}
