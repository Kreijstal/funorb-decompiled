/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntrusiveNodeHashTable {
    private IntrusiveNode[] field_i;
    static int field_c;
    private int field_b;
    private int field_a;
    static TextureFormat ALPHA;
    private IntrusiveNode field_e;
    private IntrusiveNode field_d;
    static IntrusiveDeque field_g;
    static String field_h;

    final IntrusiveNode next(boolean guard) {
        int fieldTemp$0 = 0;
        IntrusiveNode var2;
        int var3;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (this.field_b > 0 &&
          this.field_i[this.field_b - 1] != this.field_d) {
          var2 = this.field_d;
          this.field_d = var2.next;
          return var2;
        }
        if (!guard) {
          return (IntrusiveNode) null;
        }
        do {
          if (this.field_a <= this.field_b) {
            return null;
          }
          fieldTemp$0 = this.field_b;
          this.field_b = this.field_b + 1;
          var2 = this.field_i[fieldTemp$0].next;
        } while (this.field_i[-1 + this.field_b] == var2);
        this.field_d = var2.next;
        return var2;
    }

    final IntrusiveNode get(int guard, long key) {
        IntrusiveNode var5 = null;
        int var6 = Sumoblitz.field_L ? 1 : 0;
        if (guard < 102) {
          return (IntrusiveNode) null;
        }
        IntrusiveNode var4 = this.field_i[(int)(key & (long)(-1 + this.field_a))];
        this.field_e = var4.next;
        while (this.field_e != var4) {
          if (~key == ~this.field_e.key) {
            var5 = this.field_e;
            this.field_e = this.field_e.next;
            return var5;
          }
          this.field_e = this.field_e.next;
        }
        this.field_e = null;
        return null;
    }

    final void c(int param0) {
        int var2 = 0;
        IntrusiveNode var3 = null;
        IntrusiveNode var4 = null;
        int var5 = Sumoblitz.field_L ? 1 : 0;
        if (param0 != 6407) {
          return;
        }
        for (var2 = 0; this.field_a > var2; var2++) {
          var3 = this.field_i[var2];
          while (true) {
            var4 = var3.next;
            if (var4 == var3) {
              break;
            }
            var4.unlink(false);
          }
        }
        this.field_d = null;
        this.field_e = null;
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
        this.field_b = 0;
        if (guard < 36) {
          return (IntrusiveNode) null;
        }
        return this.next(true);
    }

    final static boolean a(boolean param0, int param1, int param2) {
        if (param0) {
          field_h = (String) null;
        }
        return (QuickChatPhraseProvider.a(!param0 ? true : false, param1, param2) | BeveledCheckboxRenderer.b(param1, param2, -126) | UiWidget.a(param1, param2, 52)) & ContentTransitionPhase.a(param1, (byte) -91, param2);
    }

    final void a(IntrusiveNode param0, int param1, long param2) {
        IntrusiveNode var5 = null;
        try {
          if (param0.previous != null) {
            param0.unlink(false);
          }
          var5 = this.field_i[(int)(param2 & (long)(param1 + this.field_a))];
          param0.previous = var5.previous;
          param0.next = var5;
          param0.previous.next = param0;
          param0.next.previous = param0;
          param0.key = param2;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "te.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
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
        this.field_b = 0;
        this.field_a = param0;
        this.field_i = new IntrusiveNode[param0];
        for (var2 = 0; var2 < param0; var2++) {
          dupTemp$0 = new IntrusiveNode();
          var3 = dupTemp$0;
          this.field_i[var2] = dupTemp$0;
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
