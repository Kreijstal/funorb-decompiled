/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntKeyLookup {
    static iv field_a;
    private int[] keyIndexSlots;

    IntKeyLookup(int[] keys) {
        int capacity = 0;
        int slotIndex = 0;
        int bucket = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int inputIndex;
        try {
          capacity = 1;
          while ((keys.length >> 1) + keys.length >= capacity) {
            capacity = capacity << 1;
          }
          this.keyIndexSlots = new int[capacity + capacity];
          for (slotIndex = 0; capacity + capacity > slotIndex; slotIndex++) {
            this.keyIndexSlots[slotIndex] = -1;
          }
          for (inputIndex = 0; keys.length > inputIndex; inputIndex++) {
            for (bucket = capacity - 1 & keys[inputIndex]; this.keyIndexSlots[bucket + (bucket + 1)] != -1; bucket = bucket + 1 & capacity - 1) {
            }
            this.keyIndexSlots[bucket + bucket] = keys[inputIndex];
            this.keyIndexSlots[bucket + bucket + 1] = inputIndex;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("lr.<init>(");
          if (keys == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static IndexedSprite[] a(int param0) {
        int var2 = 0;
        int var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        IndexedSprite[] var1 = new IndexedSprite[iw.field_n];
        for (var2 = 0; var2 < iw.field_n; var2++) {
          var1[var2] = new IndexedSprite(lg.field_d, wr.field_J, j.field_e[var2], CampaignMenuButton.field_g[var2], qm.field_K[var2], c.field_e[var2], AnimationPlayer.field_j[var2], MovementPresentation.field_j);
        }
        if (param0 < 102) {
          co[] var4 = (co[]) null;
          IntKeyLookup.a((co[]) null, (byte) -34);
        }
        rj.d((byte) 103);
        return var1;
    }

    final int get(int key, int obfuscationGuard) {
        int bucketMask;
        int bucket;
        int inputIndex;
        int var6;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        bucketMask = -1 + (this.keyIndexSlots.length >> 1);
        if (obfuscationGuard != 1) {
          return -110;
        }
        bucket = bucketMask & key;
        while (true) {
          inputIndex = this.keyIndexSlots[1 + (bucket + bucket)];
          if (inputIndex == -1) {
            return -1;
          }
          if (this.keyIndexSlots[bucket + bucket] == key) {
            return inputIndex;
          }
          bucket = bucketMask & 1 + bucket;
        }
    }

    final static void a(co[] param0, byte param1) {
        int var3 = 0;
        co[] var2 = null;
        int var4 = 0;
        co[] var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var5 = param0;
          var2 = var5;
          if (param1 <= 35) {
            IntKeyLookup.a(-11);
          }
          for (var3 = 0; var3 < var5.length; var3++) {
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("lr.B(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_a = null;
    }
}
