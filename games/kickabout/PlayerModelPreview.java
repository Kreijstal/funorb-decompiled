/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class PlayerModelPreview extends IntrusiveNode {
    static GameKeyHandler field_q;
    private int field_i;
    private ModelMesh field_p;
    private int field_n;
    private AnimationPlayer field_h;
    static String field_l;
    private int field_g;
    static int field_j;
    private int field_o;
    private int field_s;
    static long field_r;
    static String field_m;
    static int field_e;
    static AccountNameCheckState field_f;
    static String field_k;

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, BitmapFont param10, BitmapFont param11, NineSlicePanelPainter param12, int param13, int param14, int param15, NineSlicePanelPainter param16, int param17, int param18, NineSlicePanelPainter param19, int param20) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        try {
          BufferedCacheFile.a(126, param5, param10, param11);
          StringCursor.a(param18, param0, param13, param7, (byte) 5);
          if (param2 <= 25) {
            field_q = (GameKeyHandler) null;
          }
          ClientException.a(param8, 0, param4);
          VertexNormal.a(param19, param6, param16, param9, param15, -110);
          ConsoleCommand.a(param3, param1, false, param12);
          ArchiveNetworkClient.a(param20, param14, param17, 20);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_6_0 = var21;
          stackIn_6_1 = new StringBuilder().append("nr.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param11 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param12 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',');
          if (param16 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param17).append(',').append(param18).append(',');
          if (param19 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param20).append(')').toString());
        }
    }

    final void a(int param0, int param1) {
        param0 = (this.field_o + param0) % 6;
        if (param0 > 3) {
          param0 = 6 - param0;
        }
        this.field_h.setFrame(param0, 111);
        ModelMesh var5 = (ModelMesh) (this.field_h.applyCurrentFrame(this.field_p, false, true, true));
        SpritePixelSupport.a(param1 + this.field_g << 4, this.field_i << 4, 320, -4 + UiWidget.field_f.length, UiWidget.field_f);
        PacketBuffer.a(103, Cp1252EncodingSupport.field_d);
        SoftwareRasterizer.clearFramebuffer();
        TriangleRasterizer.useRasterClip();
        int var4 = 950;
        TriangleRasterizer.setProjectionCenter(128, 240);
        var5.a(0, this.field_n << 8, 0, 300, 0, 0, 0, var4);
        TeamManagementScreen.e(param1 ^ -124);
        Cp1252EncodingSupport.field_d.drawHalfSize(-64 + this.field_g, this.field_i - 120);
    }

    final static int a(int param0, CipherPacketBuffer param1, int param2, int param3, int param4, int param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6_int = param1.readBits(1, 59);
          if (param3 == var6_int) {
            if (param5 != 0) {
              stackIn_13_0 = IsaacRandom.a(param5, -30273, param1);
            } else {
              stackIn_13_0 = 0;
            }
            return stackIn_13_0;
          }
          if (var6_int != 1) {
            throw new IllegalStateException();
          }
          if (0 == param2) {
            stackIn_6_0 = 0;
          } else {
            stackIn_6_0 = IsaacRandom.a(param2, param3 ^ -30273, param1);
          }
          var7 = stackIn_6_0;
          var8 = param4;
          if (var7 >= 0) {
            stackIn_9_0 = var8 + var7;
          } else {
            stackIn_9_0 = -var8 + var7;
          }
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("nr.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    PlayerModelPreview(int param0, int param1, int param2, int param3) {
        this.field_i = param1;
        this.field_n = param2;
        this.field_g = param0;
        this.field_s = param3;
        Random var8 = new Random();
        var8 = var8;
        this.field_o = ProxySocketConnector.$cfr$intArgs$a$7f8aad568c81(-34, 6, var8);
        this.field_p = Cp1252EncodingSupport.a(-49, this.field_s, var8);
        this.field_h = new AnimationPlayer(1);
        int var6 = ProxySocketConnector.$cfr$intArgs$a$7f8aad568c81(-48, 5, var8);
        this.field_h.setClip(ClientInteractionSupport.field_b[var6], (byte) -107);
    }

    public static void releaseStatics(byte param0) {
        field_k = null;
        field_m = null;
        field_f = null;
        field_q = null;
        field_l = null;
        int var1 = 8 / ((param0 - 73) / 52);
    }

    static {
        field_l = "The Quater Finals start in <%0> seconds...";
        field_q = new GameKeyHandler();
        field_m = "This option cannot be combined with the current settings for:  ";
        field_k = "Sprint";
        field_f = new AccountNameCheckState();
    }
}
