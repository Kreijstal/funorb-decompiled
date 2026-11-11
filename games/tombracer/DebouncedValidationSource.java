/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class DebouncedValidationSource implements ValidationSource {
    static String[] field_e;
    static String field_d;
    static String[] defaultPlayerNames;
    private long lastEditTime;
    static String field_a;

    public final void markEdited(int param0) {
        this.lastEditTime = bva.currentTimeMillis((byte) -107);
        if (param0 > -63) {
          this.getMessage(109);
        }
    }

    abstract String computeMessage(int param0);

    public final String getMessage(int param0) {
        if (this.isEmpty(true)) {
          return null;
        }
        if (bva.currentTimeMillis((byte) -107) < this.lastEditTime + 350L) {
          return null;
        }
        if (param0 >= 34) {
          return this.computeMessage(1890);
        }
        DebouncedValidationSource.releaseStatics((byte) -83);
        return this.computeMessage(1890);
    }

    public static void releaseStatics(byte param0) {
        field_e = null;
        if (param0 == -91) {
          field_a = null;
          defaultPlayerNames = null;
          field_d = null;
          return;
        }
        field_e = (String[]) null;
        field_a = null;
        defaultPlayerNames = null;
        field_d = null;
    }

    abstract ValidationState computeState(int param0);

    final static void a(boolean param0, int param1, int param2) {
        int var5 = 0;
        int var3 = 32 % ((43 - param1) / 57);
        if (null == RoomViewRenderer.field_c) {
          return;
        }
        int var4 = RoomViewRenderer.field_c.updateAndPollReason(-1, param0);
        if (var4 != -2) {
          if (var4 != -1) {
            var5 = RoomViewRenderer.field_c.isMuteRequested(false) ? 1 : 0;
            PowerDownItemBehaviour.sendAbuseReport(var4, param2, (byte) 87, var5 != 0, RoomViewRenderer.field_c.field_Db, RoomViewRenderer.field_c.getEnteredText(80));
          }
          RoomViewRenderer.field_c = null;
          wp.closeContextMenu(-1);
          return;
        }
    }

    public final ValidationState getState(int param0) {
        if (param0 != -4666) {
          this.getMessage(82);
          if (this.isEmpty(true)) {
            return ColourRowCache.field_d;
          }
          if (!(bva.currentTimeMillis((byte) -107) >= this.lastEditTime + 350L)) {
            return BevelOperator.field_p;
          }
          return this.computeState(-1891);
        }
        if (this.isEmpty(true)) {
          return ColourRowCache.field_d;
        }
        if (!(bva.currentTimeMillis((byte) -107) >= this.lastEditTime + 350L)) {
          return BevelOperator.field_p;
        }
        return this.computeState(-1891);
    }

    static {
        field_d = "Borees";
        defaultPlayerNames = new String[]{"Player 1", "Player 2", "Player 3", "Player 4"};
        field_a = "The account name you use to access RuneScape and other Jagex.com games";
    }
}
