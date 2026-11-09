/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DerelictMapReader implements MapGenerator {
    private PacketBuffer field_m;
    private int field_l;
    static QuickChatMenu field_h;
    private int field_b;
    static Sprite field_g;
    static boolean field_f;
    static AnimatedPanel[] field_d;
    static Sprite[] field_i;
    private int field_k;
    static String field_c;
    static int field_a;
    private int field_e;
    private int field_j;

    public final GalaxyMap generate(byte param0) throws MapGenerationException {
        int var6 = 0;
        GalaxyMap var3;
        Star[] var4;
        int var5;
        Star var7;
        int var8;
        int var9;
        int var10;
        Star var11;
        int var12;
        DerelictMapGenerator var13;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        this.field_e = this.field_e - 1;
        var13 = new DerelictMapGenerator(this.field_b, this.field_j, this.field_l, this.field_e, this.field_k);
        var3 = var13.generate((byte) 77);
        var4 = var3.field_e;
        var5 = -23 % ((-67 - param0) / 44);
        for (var6 = 0; var4.length > var6; var6++) {
          var7 = var4[var6];
          var8 = this.field_m.readUnsignedByte(-110);
          for (var9 = 0; var9 < var8; var9++) {
            var10 = this.field_m.readUnsignedByte(-75);
            var11 = var3.field_e[var10];
            if (!var7.isNeighbour(var11, (byte) 10)) {
              var7.addNeighbour((byte) -76, var11);
              var11.addNeighbour((byte) -89, var7);
            }
          }
          var9Lifetime1 = 0;
          while (var9Lifetime1 < 4) {
            var10Lifetime1 = this.field_m.readUnsignedByte(-119);
            var7.field_G[var9Lifetime1] = we.intAnd(15, var10Lifetime1);
            var9Lifetime1++;
            if (var9Lifetime1 < 4) {
              var7.field_G[var9Lifetime1] = we.intAnd(var10Lifetime1, 240) >> 4;
              var9Lifetime1++;
              continue;
            }
            break;
          }
          if (var7.field_L == 2) {
            for (var9Lifetime2 = 0; var9Lifetime2 < 4; var9Lifetime2++) {
              var7.field_G[var9Lifetime2] = -var7.field_G[var9Lifetime2];
            }
          }
          var7.field_x = this.field_m.readUnsignedShort(-20976);
          if ((32768 & var7.field_x) != 0) {
            var7.field_x = var7.field_x & 32767;
            var7.field_u = true;
          }
          var7.field_B = this.field_m.readUnsignedByte(-128);
          var7.field_L = var7.field_B >>> 6;
          var7.field_B = var7.field_B & 63;
        }
        return var3;
    }

    public static void clearStatics(boolean param0) {
        field_g = null;
        field_d = null;
        if (param0) {
          return;
        }
        field_h = null;
        field_c = null;
        field_i = null;
    }

    final static Sprite a(int param0, int param1) {
        Sprite dupTemp$0 = null;
        Sprite var3 = null;
        Sprite var2 = MapView.field_sb[param0];
        if (var2 == null) {
          dupTemp$0 = new Sprite(256, 256);
          var3 = dupTemp$0;
          var2 = var3;
          MapView.field_sb[param0] = dupTemp$0;
          bs.a(var3, 100);
          CellVertex.field_j[param0].draw(64, 64);
          SoftwareRasterizer.b(12, 12, 0, 0, 256, 256);
          OpacityWidget.popLegacyRasterState(0);
        }
        if (param1 >= -28) {
          field_a = 123;
        }
        return var2;
    }

    final static int a(int param0) {
        if (param0 != 0) {
          DerelictMapReader.clearStatics(false);
        }
        return ul.field_Hb + (sq.field_a << 2) + (QuickChatMenu.field_Bb << 4);
    }

    DerelictMapReader(PacketBuffer param0, int param1, int param2, int param3, int param4, int param5) {
        try {
          this.field_j = param3;
          this.field_l = param1;
          this.field_k = param5;
          this.field_e = param4;
          this.field_m = param0;
          this.field_b = param2;
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "mr.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_c = "Select a friendly system to commence terraforming, or right click to cancel this project.";
    }
}
