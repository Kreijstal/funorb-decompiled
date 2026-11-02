/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bkb {
    static java.applet.Applet field_b;
    static String field_a;

    public static void b(int param0) {
        field_a = null;
        field_b = null;
        int var1 = -115 / ((param0 + 34) / 45);
    }

    final static Mission a(int param0) {
        World var10 = new World(1);
        var10.a(var10.getWidth((byte) -122) / 2, (byte) -66);
        var10.e(var10.m(1) / 2, 0);
        var10.b(-1, (byte) 23);
        int var2 = 131072;
        int var3 = var2;
        int var4 = 4096;
        MapZone var5 = new MapZone(-var4 + (-var2 + var10.getWidth((byte) -122) / 2), -(var10.m(1) / 2) + var4);
        var5.width = var2;
        var5.height = var3;
        var10.a(5706, var5);
        var10.a((byte) -64, new rdb(var2 / 2 + var5.x, var3 / 2 + var5.y, 1));
        var10.a((byte) -95, new rdb(-(var2 / 2) + var5.x, var3 / 2 + var5.y, 1));
        var10.a((byte) -120, new rdb(var5.x + var2 / 2, var3 / 2 + var3 + var5.y, 1));
        var10.a((byte) -120, new rdb(-(var2 / 2) + var5.x, var5.y + (var3 + var3 / 2), 1));
        MapZone var6 = new MapZone(var4 - var10.getWidth((byte) -122) / 2, -var4 + (-var3 + var10.m(1) / 2));
        var6.width = var2;
        var6.height = var3;
        var10.a(5706, var6);
        var10.a((byte) -65, new rdb(var2 / 2 + var6.x, var6.y + var3 / 2, param0));
        var10.a((byte) -106, new rdb(var2 / 2 + var2 + var6.x, var3 / 2 + var6.y, 0));
        var10.a((byte) -54, new rdb(var6.x + var2 / 2, -var3 + var6.y + var3 / 2, 0));
        var10.a((byte) -54, new rdb(var2 / 2 + var2 + var6.x, -var3 + var6.y + var3 / 2, 0));
        MissionEvent var7 = new MissionEvent();
        var7.a((byte) -114, (MissionCondition) (new BodyInZoneCondition(-1, 1)));
        var7.a(new SetShipTeamAction(-1, 0), true);
        var10.a(var7, -38);
        MissionEvent var8 = new MissionEvent();
        var8.a((byte) -124, (MissionCondition) (new BodyInZoneCondition(-1, 0)));
        var8.a(new SetShipTeamAction(-1, 1), true);
        var10.a(var8, -38);
        Mission var9 = new Mission(var10);
        return var9;
    }

    protected bkb() throws Throwable {
        throw new Error();
    }

    static {
        field_a = "Large screen sizes and high resolutions may cause the game to run slowly. If so, try using lower resolutions or screen sizes.";
    }
}
