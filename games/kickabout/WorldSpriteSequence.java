/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class WorldSpriteSequence {
    private int field_b;
    private int field_a;
    private Sprite[] field_c;
    static Sprite field_h;
    static Sprite field_g;
    static JaggrabDownloader field_d;
    static String[][] field_e;
    static AccountRequestDialog field_f;

    WorldSpriteSequence(int param0, int param1, int param2) {
        int var14 = 0;
        int incrementValue$3 = 0;
        int var17 = 0;
        int var5;
        PlayerModelPreview var6;
        int var7;
        Sprite var8;
        Sprite var9;
        int var10;
        int var11;
        int var12;
        int var13;
        Sprite var15;
        int var16;
        Random var19;
        this.field_a = param0;
        this.field_c = new Sprite[4];
        this.field_b = param1;
        var19 = new Random();
        var5 = ProxySocketConnector.nextBoundedInt(87, 5, var19);
        var6 = new PlayerModelPreview(27, 64, param2, var5);
        var7 = ProxySocketConnector.nextBoundedInt(83, 4, var19);
        var8 = FootballerPreview.a(-5275);
        var9 = new Sprite(54, 85);
        PacketBuffer.a(114, var9);
        var10 = var8.field_o;
        var11 = var8.field_v;
        var12 = -15 - SingleChildContainer.floorMod(105, this.field_a - 27, var10);
        var13 = -SingleChildContainer.floorMod(-49, -64 + this.field_b, var11);
        var8.drawOpaque(var12, var13);
        var8.drawOpaque(var12 + var10, var13);
        var8.drawOpaque(var12, var11 + var13);
        var8.drawOpaque(var12 + var10, var11 + var13);
        TeamManagementScreen.e(120);
        for (var14 = 0; var14 < 4; var14++) {
          this.field_c[var14] = new Sprite(54, 85);
          var15 = this.field_c[var14];
          PacketBuffer.a(-114, var15);
          var9.drawOpaque(0, 0);
          incrementValue$3 = var7;
          var7++;
          var6.a(incrementValue$3 % 4, -2);
          TeamManagementScreen.e(123);
          var16 = var9.field_y.length;
          for (var17 = 0; var17 < var16; var17++) {
            if (~var15.field_y[var17] == ~var9.field_y[var17]) {
              var15.field_y[var17] = 0;
            }
          }
        }
    }

    final void drawFrame(int param0, boolean param1) {
        int var6 = 0;
        int var7 = 0;
        int var3 = MySquadScreen.worldToScreenX(-115, -27 + this.field_a);
        if (!param1) {
          this.drawFrame(-41, true);
        }
        int var4 = PitchProjectionSupport.worldToScreenY(this.field_b - 64, (byte) -56);
        Sprite var5 = this.field_c[param0];
        if (InstrumentNoteMask.field_i == 256) {
          var5.draw(var3, var4);
        } else {
          var6 = InstrumentNoteMask.field_i * var5.field_o >> 8;
          var7 = var5.field_v * InstrumentNoteMask.field_i >> 8;
          var5.drawScaled(var3, var4, var6, var7);
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != 0) {
          return;
        }
        field_h = null;
        field_g = null;
        field_d = null;
        field_e = (String[][]) null;
        field_f = null;
    }

    static {
        field_h = new Sprite(640, 480);
        field_e = new String[][]{new String[]{"4 Minutes", "8 Minutes", "12 Minutes"}, new String[]{"Off", "On"}, new String[]{"Normal", "Exhibition"}, new String[]{"Off", "On"}};
    }
}
