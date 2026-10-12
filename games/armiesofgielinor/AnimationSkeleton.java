/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AnimationSkeleton extends IntrusiveNode {
    int[] transformTypes;
    static PcmStreamMixer effectsMixer;
    int skeletonId;
    private boolean[] encodedTransformFlags;
    static String field_m;
    int[][] transformGroups;
    static IndexedSprite field_t;
    static String field_r;
    int[] transformMasks;
    int transformCount;

    public static void e(int param0) {
        field_m = null;
        effectsMixer = null;
        field_t = null;
        field_r = null;
        if (param0 < 1) {
          field_m = (String) null;
        }
    }

    final static ContextualRuntimeException addExceptionContext(Throwable cause, String context) {
        ContextualRuntimeException var2 = null;
        if (cause instanceof ContextualRuntimeException) {
          var2 = (ContextualRuntimeException) ((Object) cause);
          var2.context = var2.context + ' ' + context;
        } else {
          var2 = new ContextualRuntimeException(cause, context);
        }
        return var2;
    }

    AnimationSkeleton(int skeletonId, byte[] encodedSkeleton) {
        int[] groupIndices = null;
        int groupIndexOrdinal = 0;
        boolean[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        boolean stackIn_9_2 = false;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException failure = null;
        int typeSlot = 0;
        PacketBuffer packet = null;
        PacketBuffer packetAlias = null;
        int flagSlot;
        int maskSlot;
        int groupSizeSlot;
        int groupSlot;
        try {
          this.skeletonId = skeletonId;
          packet = new PacketBuffer(encodedSkeleton);
          packetAlias = packet;
          this.transformCount = packetAlias.readUnsignedByte(0);
          this.transformGroups = new int[this.transformCount][];
          this.encodedTransformFlags = new boolean[this.transformCount];
          this.transformTypes = new int[this.transformCount];
          this.transformMasks = new int[this.transformCount];
          for (typeSlot = 0; typeSlot < this.transformCount; typeSlot++) {
            this.transformTypes[typeSlot] = packet.readUnsignedByte(0);
          }
          for (flagSlot = 0; flagSlot < this.transformCount; flagSlot++) {
            stackIn_8_0 = this.encodedTransformFlags;
            stackIn_8_1 = flagSlot;
            stackIn_9_2 = (packetAlias.readUnsignedByte(0) == 1);
            stackIn_8_0[stackIn_8_1] = stackIn_9_2;
          }
          for (maskSlot = 0; this.transformCount > maskSlot; maskSlot++) {
            this.transformMasks[maskSlot] = packet.readUnsignedShort((byte) -104);
          }
          for (groupSizeSlot = 0; groupSizeSlot < this.transformCount; groupSizeSlot++) {
            groupIndices = new int[packet.readUnsignedByte(0)];
            this.transformGroups[groupSizeSlot] = groupIndices;
          }
          for (groupSlot = 0; this.transformCount > groupSlot; groupSlot++) {
            for (groupIndexOrdinal = 0; groupIndexOrdinal < this.transformGroups[groupSlot].length; groupIndexOrdinal++) {
              this.transformGroups[groupSlot][groupIndexOrdinal] = packet.readUnsignedByte(0);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          failure = decompiledCaughtException;
          stackIn_25_0 = failure;
          stackIn_25_1 = new StringBuilder().append("ig.<init>(").append(skeletonId).append(',');
          if (encodedSkeleton == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final static boolean a(int param0) {
        if (param0 != -8327) {
          String var2 = (String) null;
          AnimationSkeleton.addExceptionContext((Throwable) null, (String) null);
        }
        return da.a(23660, CombatEvent.d((byte) 16));
    }

    static {
        field_m = "Tutorial";
        field_r = "Scamming";
    }
}
