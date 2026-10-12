/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qc {
    static ro field_a;
    static String field_b;
    static UiSelectionState field_d;
    static qc field_h;
    static String field_i;
    static int field_j;
    static ClientUiComponent field_e;
    static ClientUiComponent field_c;
    static String field_f;
    static NodeDeque lobbyRoomOrder;

    public static void a(byte param0) {
        field_i = null;
        field_b = null;
        field_e = null;
        if (param0 == -108) {
          field_c = null;
          field_a = null;
          field_d = null;
          lobbyRoomOrder = null;
          field_h = null;
          field_f = null;
          return;
        }
        field_c = (ClientUiComponent) null;
        field_c = null;
        field_a = null;
        field_d = null;
        lobbyRoomOrder = null;
        field_h = null;
        field_f = null;
    }

    final static RgbSprite a(int param0, int param1) {
        co var2 = null;
        co var2Lifetime1;
        if (param1 != 8806) {
          field_h = (qc) null;
          if (vc.field_m == null) {
            return null;
          }
          if (param0 < 0) {
            return null;
          }
          if (UnitLossCondition.field_d.length > param0) {
            var2 = UnitLossCondition.field_d[param0];
            return var2.c((byte) -116);
          }
          return null;
        }
        if (vc.field_m == null) {
          return null;
        }
        if (param0 < 0) {
          return null;
        }
        if (UnitLossCondition.field_d.length > param0) {
          var2Lifetime1 = UnitLossCondition.field_d[param0];
          return var2Lifetime1.c((byte) -116);
        }
        return null;
    }

    abstract int a(long param0, int param1);

    final int a(int param0, long param1) {
        long var4 = 0L;
        if (param0 < -124) {
          var4 = this.b((byte) -103);
          if (var4 > 0L) {
            nu.a(var4, 0);
          }
          return this.a(param1, 0);
        }
        return -53;
    }

    abstract long b(byte param0);

    abstract void a(int param0);

    static {
        field_b = "Solicitation";
        field_i = "Items";
        field_f = "This unit's passive effect expands 3 tiles in all directions.";
    }
}
