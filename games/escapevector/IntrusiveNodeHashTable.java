/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntrusiveNodeHashTable {
    private int field_d;
    private IntrusiveNode[] field_c;
    private int field_e;
    private IntrusiveNode field_b;
    private IntrusiveNode field_g;
    static PcmSample field_a;
    static TickClock field_f;

    final IntrusiveNode get(long key, int guard) {
        int var6 = EscapeVector.obfuscationControl;
        IntrusiveNode var4 = this.field_c[(int)((long)(guard + this.field_d) & key)];
        this.field_g = var4.next;
        while (var4 != this.field_g) {
          if (~key == ~this.field_g.key) {
            IntrusiveNode var5 = this.field_g;
            this.field_g = this.field_g.next;
            return var5;
          }
          this.field_g = this.field_g.next;
        }
        this.field_g = null;
        return null;
    }

    public static void releaseStatics(int guard) {
        field_a = null;
        if (guard != 0) {
          field_a = (PcmSample) null;
        }
        field_f = null;
    }

    final IntrusiveNode next(byte guard) {
        IntrusiveNode var2;
        int var3 = EscapeVector.obfuscationControl;
        if (this.field_e > 0 &&
          this.field_b != this.field_c[this.field_e - 1]) {
          var2 = this.field_b;
          this.field_b = var2.next;
          return var2;
        }
        if (guard != 62) {
          return (IntrusiveNode) null;
        }
        do {
          if (this.field_e >= this.field_d) {
            return null;
          }
          int fieldTemp$0 = this.field_e;
          this.field_e = this.field_e + 1;
          var2 = this.field_c[fieldTemp$0].next;
        } while (this.field_c[-1 + this.field_e] == var2);
        this.field_b = var2.next;
        return var2;
    }

    final IntrusiveNode first(boolean guard) {
        if (guard) {
          this.get(-30L, 70);
        }
        this.field_e = 0;
        return this.next((byte) 62);
    }

    final void put(IntrusiveNode node, int guard, long key) {
        if (null != node.previous) {
          node.unlink((byte) -115);
        }
        if (guard != 10901) {
          return;
        }
        try {
          IntrusiveNode var5 = this.field_c[(int)((long)(this.field_d - 1) & key)];
          node.previous = var5.previous;
          node.next = var5;
          node.previous.next = node;
          node.next.previous = node;
          node.key = key;
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "ib.D(" + (node != null ? "{...}" : "null") + ',' + guard + ',' + key + ')');
        }
    }

    final static java.awt.Frame enterFullscreen(byte guard, int width, int height, SystemTaskService taskService, int bitDepth, int refreshRate) {
        String stackIn_45_2 = null;
        int var9 = EscapeVector.obfuscationControl;
        try {
          if (!taskService.supportsFullscreen(0)) {
            return null;
          }
          if (bitDepth == 0) {
            DisplayModeInfo[] var10 = GzipDecoder.enumerateDisplayModes(6629, taskService);
            DisplayModeInfo[] var6 = var10;
            if (var6 == null) {
              return null;
            }
            boolean var7_int = false;
            for (int var8 = 0; var8 < var10.length; var8++) {
              if (var10[var8].width == width &&
                height == var10[var8].height && ((0 == refreshRate ||
                var10[var8].refreshRate == refreshRate) &&
                (!var7_int ||
                !(bitDepth >= var10[var8].bitDepth)))) {
                var7_int = true;
                bitDepth = var10[var8].bitDepth;
              }
            }
            if (!var7_int) {
              return null;
            }
          }
          if (guard != 93) {
            field_a = (PcmSample) null;
          }
          SystemTask var11 = taskService.enterFullscreen(-103, bitDepth, height, refreshRate, width);
          while (var11.status == 0) {
            AchievementTracker.sleepMillis((byte) -31, 10L);
          }
          java.awt.Frame var7 = (java.awt.Frame) (var11.result);
          if (var7 == null) {
            return null;
          }
          if (var11.status != 2) {
            java.awt.Frame stackIn_41_0 = var7;
            return stackIn_41_0;
          }
          FullscreenFocusCanvas.exitFullscreenAndDispose(taskService, var7, false);
          Object stackIn_39_0 = null;
          return (java.awt.Frame) (stackIn_39_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6_ref = decompiledCaughtException;
          RuntimeException stackIn_44_0 = var6_ref;
          StringBuilder stackIn_44_1 = new StringBuilder().append("ib.A(").append(guard).append(',').append(width).append(',').append(height).append(',');
          if (taskService == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(bitDepth).append(',').append(refreshRate).append(')').toString());
        }
    }

    IntrusiveNodeHashTable(int param0) {
        this.field_e = 0;
        this.field_d = param0;
        this.field_c = new IntrusiveNode[param0];
        for (int var2 = 0; param0 > var2; var2++) {
          IntrusiveNode dupTemp$0 = new IntrusiveNode();
          IntrusiveNode var3 = dupTemp$0;
          this.field_c[var2] = dupTemp$0;
          var3.previous = var3;
          var3.next = var3;
        }
    }

    static {
    }
}
