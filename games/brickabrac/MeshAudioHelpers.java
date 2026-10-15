/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MeshAudioHelpers {
    static boolean field_c;
    static PacketBuffer accountPacketScratch;
    static String field_b;
    static String field_a;
    static LevelPack field_d;
    static String field_h;
    static String field_g;
    static String field_e;

    final static void drawInterpolatedMeshTriangle(int blueC, int greenA, int xC, int greenB, int xB, int redB, int yC, int greenC, int yA, byte obfuscationGuard, int blueB, int xA, int blueA, int redC, int yB, int redA) {
        int var17 = BrickABrac.field_J ? 1 : 0;
        if (obfuscationGuard < -51) {
          if (yA < yB) {
            if (yB < yC) {
              MovingBody.a(blueA, xC, yA, (byte) -111, xB, greenA, greenB, xA, redC, Rasterizer2D.pixels, redB, blueC, greenC, blueB, yB, yC, redA);
              return;
            }
            if (yC <= yA) {
              MovingBody.a(blueC, xB, yC, (byte) -111, xA, greenC, greenA, xC, redB, Rasterizer2D.pixels, redA, blueB, greenB, blueA, yA, yB, redC);
              return;
            }
            MovingBody.a(blueA, xB, yA, (byte) -111, xC, greenA, greenC, xA, redB, Rasterizer2D.pixels, redC, blueB, greenB, blueC, yC, yB, redA);
            return;
          }
          if (yA < yC) {
            MovingBody.a(blueB, xC, yB, (byte) -111, xA, greenB, greenA, xB, redC, Rasterizer2D.pixels, redA, blueC, greenC, blueA, yA, yC, redB);
            return;
          }
          if (yC > yB) {
            MovingBody.a(blueB, xA, yB, (byte) -111, xC, greenB, greenC, xB, redA, Rasterizer2D.pixels, redC, blueA, greenA, blueC, yC, yA, redB);
            return;
          }
          MovingBody.a(blueC, xA, yC, (byte) -111, xB, greenC, greenB, xC, redA, Rasterizer2D.pixels, redB, blueA, greenA, blueB, yB, yA, redC);
          return;
        }
        MeshAudioHelpers.a(82);
        if (yA < yB) {
          if (yB < yC) {
            MovingBody.a(blueA, xC, yA, (byte) -111, xB, greenA, greenB, xA, redC, Rasterizer2D.pixels, redB, blueC, greenC, blueB, yB, yC, redA);
            return;
          }
          if (yC <= yA) {
            MovingBody.a(blueC, xB, yC, (byte) -111, xA, greenC, greenA, xC, redB, Rasterizer2D.pixels, redA, blueB, greenB, blueA, yA, yB, redC);
            return;
          }
          MovingBody.a(blueA, xB, yA, (byte) -111, xC, greenA, greenC, xA, redB, Rasterizer2D.pixels, redC, blueB, greenB, blueC, yC, yB, redA);
          return;
        }
        if (yA < yC) {
          MovingBody.a(blueB, xC, yB, (byte) -111, xA, greenB, greenA, xB, redC, Rasterizer2D.pixels, redA, blueC, greenC, blueA, yA, yC, redB);
          return;
        }
        if (yC > yB) {
          MovingBody.a(blueB, xA, yB, (byte) -111, xC, greenB, greenC, xB, redA, Rasterizer2D.pixels, redC, blueA, greenA, blueC, yC, yA, redB);
          return;
        }
        MovingBody.a(blueC, xA, yC, (byte) -111, xB, greenC, greenB, xC, redA, Rasterizer2D.pixels, redB, blueA, greenA, blueB, yB, yA, redC);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_h = null;
        field_g = null;
        field_b = null;
        accountPacketScratch = null;
        if (param0 == 1024) {
          field_a = null;
          field_d = null;
          field_e = null;
          return;
        }
    }

    final static void a(int param0, boolean param1, MidiSynthesizer param2, PlatformServices param3, int param4, java.awt.Component param5) {
        try {
          BubbleDistortion.a(param2, param3, param0, param4, param0, param4 ^ 2024, param5, param1);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "tq.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        accountPacketScratch = new PacketBuffer(256);
        field_b = "Quick Chat lobby";
        field_g = "Offensive account name";
        field_a = "Please remove <%0> from your friend list first.";
        field_e = "You need to play <%0> more rated games to unlock this option.";
    }
}
