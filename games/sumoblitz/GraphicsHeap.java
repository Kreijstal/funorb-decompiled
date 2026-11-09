/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class GraphicsHeap extends IntrusiveNode {
    static int tooltipY;
    static int[] menuLeft;

    final static void regroupIntroFaces(byte[] faceGroups, int[] groupOffsets, int remaining, int firstBucket, int face) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        byte dupTemp$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          var5_int = firstBucket;
          while (true) {
            if (ModalDialog.field_C.length <= var5_int) {
              return;
            }
            remaining = ModalDialog.field_C[var5_int];
            var6 = var5_int << 4;
            while (true) {
              incrementValue$0 = remaining;
              remaining--;
              if (incrementValue$0 == 0) {
                var5_int++;
                break;
              }
              incrementValue$1 = var6;
              var6++;
              face = Sumoblitz.field_G[incrementValue$1];
              dupTemp$2 = faceGroups[face];
              dupTemp$3 = groupOffsets[dupTemp$2];
              groupOffsets[dupTemp$2] = dupTemp$3 + 1;
              Sumoblitz.field_G[dupTemp$3] = face;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("za.I(");
          if (faceGroups == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (groupOffsets == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(remaining).append(',').append(firstBucket).append(',').append(face).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 > -93) {
          menuLeft = (int[]) null;
          menuLeft = null;
          return;
        }
        menuLeft = null;
    }

    final static int mouseInputSnapshotCount(boolean guard) {
        if (guard) {
          menuLeft = (int[]) null;
          return LegacyOpenGlTexture.field_h;
        }
        return LegacyOpenGlTexture.field_h;
    }

    protected GraphicsHeap() {
    }

    static {
        tooltipY = -1;
        menuLeft = new int[13];
    }
}
