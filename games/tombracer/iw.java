/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class iw {
    static String field_a;
    static String field_b;
    static ica field_c;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void releaseStatics(boolean param0) {
        if (!param0) {
          field_a = null;
          field_c = null;
          field_b = null;
          return;
        }
        field_b = (String) null;
        field_a = null;
        field_c = null;
        field_b = null;
    }

    final static void a(byte param0, boolean param1) {
        rm.field_e = !param1 ? new lla(BitPacketBuffer.field_p, RoomRegion.field_l) : new lla(WheeledMountComponent.field_O, HazardModel.field_t);
        C2SRoomResultPacket.field_c = new UiComponent(0L, (UiComponent) null);
        C2SRoomResultPacket.field_c.addChild(param0 ^ 65, rm.field_e.field_a);
        C2SRoomResultPacket.field_c.addChild(param0 ^ 68, bc.field_b);
        PlayerModel.field_a = new UiComponent(0L, WallModel.field_r);
        if (param0 == -64) {
          vs.field_R = new UiComponent(0L, (UiComponent) null);
          PlayerModel.field_a.addChild(param0 - 64, S2CEventPacket.field_e);
          PlayerModel.field_a.addChild(-122, vs.field_R);
          vs.field_R.addChild(-125, RasterShape.field_e);
          vs.field_R.addChild(-124, Trap.field_q);
          MazeComponent.c(param1, param0 ^ -62);
          return;
        }
        iw.a((byte) 33, false);
        vs.field_R = new UiComponent(0L, (UiComponent) null);
        PlayerModel.field_a.addChild(param0 - 64, S2CEventPacket.field_e);
        PlayerModel.field_a.addChild(-122, vs.field_R);
        vs.field_R.addChild(-125, RasterShape.field_e);
        vs.field_R.addChild(-124, Trap.field_q);
        MazeComponent.c(param1, param0 ^ -62);
    }

    static {
        field_a = "Quick Chat Help";
        field_b = "Play rated game";
        field_c = new ica();
    }
}
