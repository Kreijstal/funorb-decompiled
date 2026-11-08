/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AchievementNotice extends IntrusiveNode {
    int field_i;
    static int field_h;
    static IndexedSprite[] field_g;

    public static void releaseStatics(int param0) {
        if (param0 != 17) {
          field_h = 99;
          field_g = null;
          return;
        }
        field_g = null;
    }

    AchievementNotice(int param0) {
        this.field_i = param0;
    }

    final static IndexedSprite loadIndexedSprite(Js5Archive param0, int param1, int param2) {
        RuntimeException var3 = null;
        Js5Archive var4 = null;
        IndexedSprite stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!IsaacRandom.loadSpriteSheet(10332, param1, param0)) {
            return null;
          }
          if (param2 != 12) {
            var4 = (Js5Archive) null;
            AchievementNotice.loadIndexedSprite((Js5Archive) null, -36, 3);
          }
          stackIn_6_0 = LoginCredentials.takeDecodedIndexedSprite(121);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("hj.B(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void writeServiceHeader(int param0, PacketBuffer param1, int param2, int param3, int param4) {
        try {
          param1.writeByte(param4, 84);
          param1.writeShort((byte) -73, 17);
          param1.writeShort((byte) -100, param3);
          param1.writeShort((byte) -94, param0);
          param1.writeByte(param2, 66);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "hj.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static SpriteWidget getScrollPaneContent(int param0) {
        if (param0 < 43) {
          field_h = 95;
          return TriangleMesh.field_r.field_Jb;
        }
        return TriangleMesh.field_r.field_Jb;
    }

    static {
        field_h = 0;
    }
}
