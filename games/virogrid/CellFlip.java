/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CellFlip extends IntrusiveNode {
    int field_h;
    boolean newOwnerIsFirstPlayer;
    int phase;
    static SpriteWidget field_o;
    int column;
    static int[] field_p;
    static String field_m;
    static boolean field_i;
    static String[] field_l;
    int field_n;
    int row;

    final static void readSubmissionAcknowledgement(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        PendingSubmission var4_ref_fa = null;
        Object var5 = null;
        int var6 = 0;
        LogoRenderHelpers var9 = null;
        CipherPacketBuffer var10 = null;
        byte[] var14 = null;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          if (param0 != 26360) {
            CellFlip.readSubmissionAcknowledgement(-72);
          }
          var10 = ProgressMessageDialog.field_qb;
          var2 = var10.readUnsignedByte(11132);
          if (var2 == 0) {
            var9 = (LogoRenderHelpers) (UsernameAvailabilityValidator.field_v.first((byte) -51));
            if (var9 == null) {
              MenuInputState.closeGameConnection(false);
              return;
            }
            var4 = var10.readUnsignedByte(11132);
            if (var4 != 0) {
              var14 = new byte[var4];
              var10.readBytes(0, var4, true, var14);
            } else {
              var5 = null;
            }
            var10.position = var10.position + 4;
            if (var10.verifyChecksum(-29449)) {
              var9.unlink(false);
              return;
            }
            MenuInputState.closeGameConnection(false);
            return;
          }
          if (var2 != 1) {
            IconLabelWidget.reportClientError("A1: " + ClientException.describePacketHistory(true), (Throwable) null, 1);
            MenuInputState.closeGameConnection(false);
            return;
          }
          var3 = var10.readInt((byte) 122);
          var4_ref_fa = (PendingSubmission) (MenuScreen.field_a.first((byte) -65));
          while (var4_ref_fa != null) {
            if (var3 != var4_ref_fa.field_i) {
              var4_ref_fa = (PendingSubmission) (MenuScreen.field_a.next(16213));
              continue;
            }
            break;
          }
          if (var4_ref_fa != null) {
            var4_ref_fa.unlink(false);
            return;
          }
          MenuInputState.closeGameConnection(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var1), "fb.A(" + param0 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 == 21) {
          field_l = null;
          field_o = null;
          field_m = null;
          field_p = null;
          return;
        }
        CellFlip.releaseStatics((byte) -26);
        field_l = null;
        field_o = null;
        field_m = null;
        field_p = null;
    }

    CellFlip(int param0, int param1, boolean param2) {
        this.phase = 0;
        this.row = param1;
        this.newOwnerIsFirstPlayer = param2 ? true : false;
        this.field_h = 0;
        this.column = param0;
    }

    CellFlip(ChatShortcutHelpers param0, boolean param1) {
        try {
          this.newOwnerIsFirstPlayer = param1 ? true : false;
          this.phase = 0;
          this.row = param0.field_b;
          this.field_h = 0;
          this.field_n = 0;
          this.column = param0.field_a;
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "fb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_l = new String[16];
        field_p = new int[8192];
    }
}
