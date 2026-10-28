/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SlidingSpriteTransition {
    private Sprite sprite;
    private int alpha;
    private TransitionPoint end;
    private int durationTicks;
    static String field_i;
    private TransitionPoint current;
    static QuickChatDynamicCommand field_g;
    private TransitionPoint start;
    static Sprite field_d;
    private int elapsedTicks;
    static Sprite field_f;

    final void draw(int guard) {
        if (guard == 256) {
          this.sprite.drawAlpha(this.current.x, this.current.y, this.alpha);
          return;
        }
        SlidingSpriteTransition.isReflectionCheckReady((byte) -28);
        this.sprite.drawAlpha(this.current.x, this.current.y, this.alpha);
    }

    final static CoverageBitmapFont buildCoverageFontFromSheet(byte[] fontBytes, int guard) {
        String stackIn_10_2 = null;
        try {
          if (guard != -1) {
            field_f = (Sprite) null;
          }
          if (fontBytes == null) {
            return null;
          }
          CoverageBitmapFont var2 = new CoverageBitmapFont(fontBytes, gn.spriteOffsetXs, ChatMessage.spriteOffsetYs, qh.spriteWidths, SavedDataQuerySupport.spriteHeights, ArchiveLoadTask.spritePalette, AnimatedPathMarker.spriteIndices);
          SpriteDecodeSupport.releaseSpriteSheet(false);
          CoverageBitmapFont stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2_ref = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var2_ref;
          StringBuilder stackIn_9_1 = new StringBuilder().append("ea.F(");
          if (fontBytes == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(guard).append(')').toString());
        }
    }

    public static void releaseStatics(byte guard) {
        field_g = null;
        field_i = null;
        field_d = null;
        if (guard <= 114) {
          field_f = (Sprite) null;
          field_f = null;
          return;
        }
        field_f = null;
    }

    final static int legacyMenuHeight(byte guard) {
        if (guard > -95) {
          SlidingSpriteTransition.releaseStatics((byte) -6);
          return mh.legacyMenuHeight;
        }
        return mh.legacyMenuHeight;
    }

    final boolean isComplete(byte guard) {
        if (guard == -7) {
          return this.elapsedTicks >= this.durationTicks ? true : false;
        }
        field_i = (String) null;
        return this.elapsedTicks >= this.durationTicks ? true : false;
    }

    final void advance(byte guard) {
        this.elapsedTicks = this.elapsedTicks + 1;
        if (guard > 36) {
          if (this.isComplete((byte) -7)) {
            this.elapsedTicks = this.durationTicks;
          }
          this.alpha = ProgressQuery.a(256, this.durationTicks, 0, this.elapsedTicks, 64);
          this.current.x = ProgressQuery.a(this.end.x, this.durationTicks, this.start.x, this.elapsedTicks, 64);
          this.current.y = ProgressQuery.a(this.end.y, this.durationTicks, this.start.y, this.elapsedTicks, 64);
          return;
        }
        this.alpha = -19;
        if (this.isComplete((byte) -7)) {
          this.elapsedTicks = this.durationTicks;
        }
        this.alpha = ProgressQuery.a(256, this.durationTicks, 0, this.elapsedTicks, 64);
        this.current.x = ProgressQuery.a(this.end.x, this.durationTicks, this.start.x, this.elapsedTicks, 64);
        this.current.y = ProgressQuery.a(this.end.y, this.durationTicks, this.start.y, this.elapsedTicks, 64);
    }

    final static boolean isReflectionCheckReady(byte guard) {
        int var3 = EscapeVector.obfuscationControl;
        try {
          ReflectionCheck var4 = (ReflectionCheck) (SpriteFactorySupport.field_a.first(false));
          ReflectionCheck var1 = var4;
          if (var1 == null) {
            return false;
          }
          if (guard > -47) {
            return true;
          }
          for (int var2 = 0; var1.operationCount > var2; var2++) {
            if (var4.fieldTasks[var2] != null &&
              0 == var4.fieldTasks[var2].field_f) {
              return false;
            }
            if (null != var4.methodTasks[var2] &&
              var4.methodTasks[var2].field_f == 0) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1_ref), "ea.D(" + guard + ')');
        }
    }

    SlidingSpriteTransition(TransitionPoint start, TransitionPoint end, Sprite sprite, int durationTicks) {
        this.alpha = 0;
        this.elapsedTicks = 0;
        try {
          this.end = end;
          this.sprite = sprite;
          this.start = start;
          this.durationTicks = durationTicks;
          this.current = this.start.copy(10);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "ea.<init>(" + (start != null ? "{...}" : "null") + ',' + (end != null ? "{...}" : "null") + ',' + (sprite != null ? "{...}" : "null") + ',' + durationTicks + ')');
        }
    }

    static {
        field_i = "M";
        field_g = new QuickChatDynamicCommand(9, 0, 4, 1);
        field_d = new Sprite(270, 70);
    }
}
