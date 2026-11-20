/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ComponentContact extends IntrusiveNode {
    ShipComponent second;
    static String field_k;
    int firstPath;
    int x;
    ShipComponent first;
    int firstEdge;
    int secondPath;
    static int field_d;
    int secondEdge;
    int y;

    public static void clearSharedReferences(byte param0) {
        field_k = null;
        if (param0 != 18) {
          field_d = -107;
        }
    }

    ComponentContact(ShipComponent param0, int param1, ShipComponent param2, int param3, int param4, int param5, int param6, int param7) {
        try {
          this.first = param0;
          this.secondPath = param3;
          this.y = param5;
          this.secondEdge = param7;
          this.second = param2;
          this.firstEdge = param6;
          this.firstPath = param1;
          this.x = param4;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "gda.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        field_d = 0;
        field_k = "You can join this game";
    }
}
