/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MotionWaypoint extends MovingBody {
    static RgbSprite halloweenMoonSprite;
    static int field_q;
    static UiComponent field_s;
    int durationTicks;
    static boolean[][] field_r;

    final static String b(boolean param0) {
        if (param0) {
          return (String) null;
        }
        if (MusicEnvelope.field_f == ik.field_g) {
          return VerticalScrollbar.field_Qb;
        }
        return dl.field_e;
    }

    private MotionWaypoint(int x256, int y256, int velocityX256, int velocityY256, int typeId) {
        super(x256, y256, velocityX256, velocityY256, typeId);
    }

    final static void c(int param0) {
        if (!HotspotTextWidget.a(9)) {
          return;
        }
        bq.a(false, param0, (byte) 104);
    }

    final static void clearDecodedSpriteData(byte obfuscationGuard) {
        ag.decodedSpriteOffsetX = null;
        dl.decodedSpriteOffsetY = null;
        if (obfuscationGuard == 96) {
          cn.decodedSpriteIndices = (byte[][]) null;
          jh.decodedSpriteWidths = null;
          qp.decodedSpritePalette = null;
          gg.decodedSpriteHeights = null;
          return;
        }
        halloweenMoonSprite = (RgbSprite) null;
        cn.decodedSpriteIndices = (byte[][]) null;
        jh.decodedSpriteWidths = null;
        qp.decodedSpritePalette = null;
        gg.decodedSpriteHeights = null;
    }

    final void readBodySnapshot(int obfuscationGuard, PacketBuffer packet) {
        try {
          super.readBodySnapshot(100, packet);
          this.durationTicks = packet.readUnsignedShort(65280);
          if (obfuscationGuard <= 89) {
            halloweenMoonSprite = (RgbSprite) null;
          }
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ee.L(" + obfuscationGuard + ',' + (packet != null ? "{...}" : "null") + ')');
        }
    }

    final static void d(int param0) {
        String var2 = null;
        String var2Lifetime1;
        if (param0 < -45) {
          var2 = (String) null;
          Mesh3D.a(true, (String) null, "");
          return;
        }
        field_s = (UiComponent) null;
        var2Lifetime1 = (String) null;
        Mesh3D.a(true, (String) null, "");
    }

    final int computeSyncChecksum(int obfuscationGuard, StringBuilder diagnostics) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard < 79) {
            field_s = (UiComponent) null;
          }
          stackIn_3_0 = 1734820418 ^ super.computeSyncChecksum(99, diagnostics) ^ 101 * this.durationTicks + 42148 << 2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ee.A(").append(obfuscationGuard).append(',');
          if (diagnostics == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void e(int param0) {
        int var1 = -7 / ((param0 - 17) / 34);
        field_s = null;
        halloweenMoonSprite = null;
        field_r = (boolean[][]) null;
    }

    MotionWaypoint() {
        this(0, 0, 0, 0, 0);
    }

    static {
        field_q = 1;
    }
}
