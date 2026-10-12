/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AnimationSkeleton extends IntrusiveNode {
    int[] transformTypes;
    static uv field_n;
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
        field_n = null;
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
        int[] array$0 = null;
        int var5 = 0;
        boolean[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        boolean stackIn_9_2 = false;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        PacketBuffer var7 = null;
        PacketBuffer var8 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        try {
          this.skeletonId = skeletonId;
          var7 = new PacketBuffer(encodedSkeleton);
          var8 = var7;
          this.transformCount = var8.readUnsignedByte(0);
          this.transformGroups = new int[this.transformCount][];
          this.encodedTransformFlags = new boolean[this.transformCount];
          this.transformTypes = new int[this.transformCount];
          this.transformMasks = new int[this.transformCount];
          for (var4 = 0; var4 < this.transformCount; var4++) {
            this.transformTypes[var4] = var7.readUnsignedByte(0);
          }
          for (var4Lifetime1 = 0; var4Lifetime1 < this.transformCount; var4Lifetime1++) {
            stackIn_8_0 = this.encodedTransformFlags;
            stackIn_8_1 = var4Lifetime1;
            stackIn_9_2 = (var8.readUnsignedByte(0) == 1);
            stackIn_8_0[stackIn_8_1] = stackIn_9_2;
          }
          for (var4Lifetime2 = 0; this.transformCount > var4Lifetime2; var4Lifetime2++) {
            this.transformMasks[var4Lifetime2] = var7.readUnsignedShort((byte) -104);
          }
          for (var4Lifetime3 = 0; var4Lifetime3 < this.transformCount; var4Lifetime3++) {
            array$0 = new int[var7.readUnsignedByte(0)];
            this.transformGroups[var4Lifetime3] = array$0;
          }
          for (var4Lifetime4 = 0; this.transformCount > var4Lifetime4; var4Lifetime4++) {
            for (var5 = 0; var5 < this.transformGroups[var4Lifetime4].length; var5++) {
              this.transformGroups[var4Lifetime4][var5] = var7.readUnsignedByte(0);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_25_0 = var3;
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
