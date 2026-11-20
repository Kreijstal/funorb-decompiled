/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm {
    static String field_c;
    static long field_b;
    static Sprite field_d;
    static int field_a;

    final static boolean a(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != -2043140287) {
          cm.a(-80);
        }
        stackIn_6_0 = (null != IterableSecondaryNodeDeque.field_h) && (d.field_f.a(-1));
        return stackIn_6_0;
    }

    final static int a(byte param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = HoldTheLine.field_D;
        try {
          if (param0 != 110) {
            cm.clearSharedReferences((byte) 84);
          }
          var3_int = 0;
          var4 = BlobReadRequest.field_j;
          while (var3_int < ClientException.field_b.length) {
            var5 = cd.field_f[var3_int];
            if (var5 >= 0) {
              var6 = h.measureMenuTextWidthWithIntGuard(ClientException.field_b[var3_int], -113, true);
              var7 = -(var6 >> 1) + NanoTickClock.field_i;
              var4 = var4 + ContentTransitionDialog.field_bb;
              if (SpriteButtonRenderer.a((vf.field_w << 1) + TickClock.field_b, param2, var6 + (DropTargetWidget.field_G << 1), param1, 27, -DropTargetWidget.field_G + var7, var4)) {
                stackIn_9_0 = var5;
                return stackIn_9_0;
              }
              var4 = var4 + ((vf.field_w << 1) + ContentTransitionDialog.field_bb + TickClock.field_b);
            } else {
              var4 = var4 + CurvedRoadSegment.field_M;
            }
            var3_int++;
          }
          stackIn_13_0 = -1;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var3), "cm.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void clearSharedReferences(byte param0) {
        field_d = null;
        if (param0 >= -28) {
          field_a = 78;
        }
        field_c = null;
    }

    static {
        field_c = "Email (Login):";
    }
}
