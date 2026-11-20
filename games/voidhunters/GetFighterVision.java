/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class GetFighterVision extends ConsoleCommand {
    static long field_p;
    static int field_o;

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard >= -119) {
            GetFighterVision.a(-97, 123, -112);
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.a(2, 124));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("eib.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2) {
        qw var3 = null;
        int var3_int = 0;
        ana var4 = null;
        qw var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = VoidHunters.field_G;
        try {
          if (NetworkGameClient.activeOneShotSounds != null &&
            null != TextureTransformMode.field_a) {
            var3 = (qw) (NetworkGameClient.activeOneShotSounds.first(0));
            while (var3 != null) {
              if (param1 == var3.field_f &&
                !var3.field_m &&
                Math.abs(var3.field_i - SetReverbDry.field_o) < param2) {
                return;
              }
              var3 = (qw) (NetworkGameClient.activeOneShotSounds.next((byte) 92));
            }
            var3_int = param1;
            if (fbb.field_j[param1] > 1) {
              var3_int = hob.a(OpenGlGpuToolkit.field_Jc, fbb.field_j[param1], 117) + param1;
            }
            var4 = GetNebulaFadesOutWhenClose.a(param0 ^ -6902, fa.field_d[var3_int]);
            var5 = new qw();
            var5.field_k = var4;
            var5.field_m = false;
            var5.field_i = SetReverbDry.field_o;
            var5.field_f = param1;
            NetworkGameClient.activeOneShotSounds.addLast(-10258, var5);
          }
          if (param0 == 6811) {
            return;
          }
          field_o = 48;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var3_ref), "eib.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static Sprite[] a(boolean param0, boolean param1, int param2, int param3, int param4, int param5) {
        Object var10 = null;
        Object var11 = null;
        Sprite var13 = null;
        Sprite var14 = null;
        int[] var16 = SoftwareRasterizer2D.pixels;
        int[] var15 = var16;
        int[] var12 = var15;
        int[] var6 = var12;
        int var7 = SoftwareRasterizer2D.width;
        int var8 = SoftwareRasterizer2D.height;
        Sprite var9 = new Sprite(16, param5);
        var9.setRasterTarget();
        SoftwareRasterizer2D.fillGradientRectangle(0, 0, 16, param5, param4, param2);
        if (param3 == 24436) {
          var10 = null;
          var11 = null;
          if (param0) {
            var13 = var9.copy();
            var10 = var13;
            var13.setRasterTarget();
            SoftwareRasterizer2D.drawHorizontalLine(0, 0, 5, 0);
            SoftwareRasterizer2D.drawHorizontalLine(0, 1, 3, 0);
            SoftwareRasterizer2D.drawHorizontalLine(0, 2, 2, 0);
            SoftwareRasterizer2D.drawHorizontalLine(0, 3, 1, 0);
            SoftwareRasterizer2D.drawHorizontalLine(0, 4, 1, 0);
          }
          if (param1) {
            var14 = var9.copy();
            var11 = var14;
            var14.setRasterTarget();
            SoftwareRasterizer2D.drawHorizontalLine(11, 0, 5, 0);
            SoftwareRasterizer2D.drawHorizontalLine(13, 1, 3, 0);
            SoftwareRasterizer2D.drawHorizontalLine(14, 2, 2, 0);
            SoftwareRasterizer2D.drawHorizontalLine(15, 3, 1, 0);
            SoftwareRasterizer2D.drawHorizontalLine(15, 4, 1, 0);
          }
          SoftwareRasterizer2D.setTarget(var16, var7, var8);
          return new Sprite[]{null, null, null, (Sprite) (var10), var9, (Sprite) (var11), null, null, null};
        }
        return (Sprite[]) null;
    }

    GetFighterVision(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_o = 3;
    }
}
