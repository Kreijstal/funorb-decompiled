/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kma implements nua {
    static String[] field_e;
    static String field_d;
    static String[] defaultPlayerNames;
    private long field_b;
    static String field_a;

    public final void c(int param0) {
        this.field_b = bva.currentTimeMillis((byte) -107);
        if (param0 > -63) {
          this.a(109);
        }
    }

    abstract String e(int param0);

    public final String a(int param0) {
        if (this.isEmpty(true)) {
          return null;
        }
        if (bva.currentTimeMillis((byte) -107) < this.field_b + 350L) {
          return null;
        }
        if (param0 >= 34) {
          return this.e(1890);
        }
        kma.releaseStatics((byte) -83);
        return this.e(1890);
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

    abstract it d(int param0);

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
            PowerDownItemBehaviour.a(var4, param2, (byte) 87, var5 != 0, RoomViewRenderer.field_c.field_Db, RoomViewRenderer.field_c.f(80));
          }
          RoomViewRenderer.field_c = null;
          wp.a(-1);
          return;
        }
    }

    public final it b(int param0) {
        if (param0 != -4666) {
          this.a(82);
          if (this.isEmpty(true)) {
            return fk.field_d;
          }
          if (!(bva.currentTimeMillis((byte) -107) >= this.field_b + 350L)) {
            return BevelOperator.field_p;
          }
          return this.d(-1891);
        }
        if (this.isEmpty(true)) {
          return fk.field_d;
        }
        if (!(bva.currentTimeMillis((byte) -107) >= this.field_b + 350L)) {
          return BevelOperator.field_p;
        }
        return this.d(-1891);
    }

    static {
        field_d = "Borees";
        defaultPlayerNames = new String[]{"Player 1", "Player 2", "Player 3", "Player 4"};
        field_a = "The account name you use to access RuneScape and other Jagex.com games";
    }
}
