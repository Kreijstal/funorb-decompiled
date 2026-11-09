/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntrusiveNodeHashTable {
    private IntrusiveNode[] buckets;
    static int field_c;
    private int iterationBucket;
    private int capacity;
    static TextureFormat ALPHA;
    private IntrusiveNode lookupCursor;
    private IntrusiveNode iterationCursor;
    static IntrusiveDeque field_g;
    static String field_h;

    final IntrusiveNode next(boolean guard) {
        int fieldTemp$0 = 0;
        IntrusiveNode var2;
        int var3;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (this.iterationBucket > 0 &&
          this.buckets[this.iterationBucket - 1] != this.iterationCursor) {
          var2 = this.iterationCursor;
          this.iterationCursor = var2.next;
          return var2;
        }
        if (!guard) {
          return (IntrusiveNode) null;
        }
        do {
          if (this.capacity <= this.iterationBucket) {
            return null;
          }
          fieldTemp$0 = this.iterationBucket;
          this.iterationBucket = this.iterationBucket + 1;
          var2 = this.buckets[fieldTemp$0].next;
        } while (this.buckets[-1 + this.iterationBucket] == var2);
        this.iterationCursor = var2.next;
        return var2;
    }

    final IntrusiveNode get(int guard, long key) {
        IntrusiveNode var5 = null;
        int var6 = Sumoblitz.field_L ? 1 : 0;
        if (guard < 102) {
          return (IntrusiveNode) null;
        }
        IntrusiveNode var4 = this.buckets[(int)(key & (long)(-1 + this.capacity))];
        this.lookupCursor = var4.next;
        while (this.lookupCursor != var4) {
          if (~key == ~this.lookupCursor.key) {
            var5 = this.lookupCursor;
            this.lookupCursor = this.lookupCursor.next;
            return var5;
          }
          this.lookupCursor = this.lookupCursor.next;
        }
        this.lookupCursor = null;
        return null;
    }

    final void clear(int guard) {
        int var2 = 0;
        IntrusiveNode var3 = null;
        IntrusiveNode var4 = null;
        int var5 = Sumoblitz.field_L ? 1 : 0;
        if (guard != 6407) {
          return;
        }
        for (var2 = 0; this.capacity > var2; var2++) {
          var3 = this.buckets[var2];
          while (true) {
            var4 = var3.next;
            if (var4 == var3) {
              break;
            }
            var4.unlink(false);
          }
        }
        this.iterationCursor = null;
        this.lookupCursor = null;
    }

    public static void releaseStatics(int param0) {
        if (param0 != 6406) {
          IntrusiveNodeHashTable.releaseStatics(41);
        }
        field_h = null;
        ALPHA = null;
        field_g = null;
    }

    final IntrusiveNode first(int guard) {
        this.iterationBucket = 0;
        if (guard < 36) {
          return (IntrusiveNode) null;
        }
        return this.next(true);
    }

    final static boolean hasFlag2048AndMask55(boolean guard, int flags, int unused) {
        if (guard) {
          field_h = (String) null;
        }
        return (QuickChatPhraseProvider.hasAnyMask33(!guard ? true : false, flags, unused) | BeveledCheckboxRenderer.hasAnyMask34(flags, unused, -126) | UiWidget.hasAnyMask52(flags, unused, 52)) & ContentTransitionPhase.hasFlag2048(flags, (byte) -91, unused);
    }

    final void put(IntrusiveNode node, int guard, long key) {
        IntrusiveNode var5 = null;
        try {
          if (node.previous != null) {
            node.unlink(false);
          }
          var5 = this.buckets[(int)(key & (long)(guard + this.capacity))];
          node.previous = var5.previous;
          node.next = var5;
          node.previous.next = node;
          node.next.previous = node;
          node.key = key;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "te.B(" + (node != null ? "{...}" : "null") + ',' + guard + ',' + key + ')');
        }
    }

    final static int glTextureFormat(int guard, TextureFormat format) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard != -21339) {
            stackIn_2_0 = 57;
            return stackIn_2_0;
          }
          if (ProgressDialog.RGB == format) {
            stackIn_5_0 = 6407;
            return stackIn_5_0;
          }
          if (BeveledTextInputRenderer.RGBA == format) {
            stackIn_8_0 = 6408;
            return stackIn_8_0;
          }
          if (ALPHA == format) {
            stackIn_11_0 = 6406;
            return stackIn_11_0;
          }
          if (IntroLogoRenderer.LUMINANCE == format) {
            stackIn_14_0 = 6409;
            return stackIn_14_0;
          }
          if (format == AchievementThresholds.LUMINANCE_ALPHA) {
            stackIn_21_0 = 6410;
            return stackIn_21_0;
          }
          if (ModalDialog.DEPTH_COMPONENT != format) {
            throw new IllegalStateException();
          }
          stackIn_19_0 = 6145;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("te.E(").append(guard).append(',');
          if (format == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    IntrusiveNodeHashTable(int param0) {
        int var2 = 0;
        IntrusiveNode dupTemp$0 = null;
        IntrusiveNode var3 = null;
        this.iterationBucket = 0;
        this.capacity = param0;
        this.buckets = new IntrusiveNode[param0];
        for (var2 = 0; var2 < param0; var2++) {
          dupTemp$0 = new IntrusiveNode();
          var3 = dupTemp$0;
          this.buckets[var2] = dupTemp$0;
          var3.next = var3;
          var3.previous = var3;
        }
    }

    static {
        field_c = 0;
        ALPHA = new TextureFormat(1);
        field_g = new IntrusiveDeque();
        field_h = "Cancel";
    }
}
