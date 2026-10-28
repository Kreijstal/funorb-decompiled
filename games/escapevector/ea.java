/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea {
    private Sprite field_a;
    private int field_c;
    private gb field_h;
    private int field_e;
    static String field_i;
    private gb field_j;
    static QuickChatDynamicCommand field_g;
    private gb field_k;
    static Sprite field_d;
    private int field_b;
    static Sprite field_f;

    final void a(int param0) {
        if (param0 == 256) {
          this.field_a.d(this.field_j.field_a, this.field_j.field_c, this.field_c);
          return;
        }
        ea.c((byte) -28);
        this.field_a.d(this.field_j.field_a, this.field_j.field_c, this.field_c);
    }

    final static CoverageBitmapFont a(byte[] param0, int param1) {
        String stackIn_10_2 = null;
        try {
          if (param1 != -1) {
            field_f = (Sprite) null;
          }
          if (param0 == null) {
            return null;
          }
          CoverageBitmapFont var2 = new CoverageBitmapFont(param0, gn.spriteOffsetXs, gi.spriteOffsetYs, qh.spriteWidths, bc.spriteHeights, qk.spritePalette, qe.spriteIndices);
          of.a(false);
          CoverageBitmapFont stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2_ref = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var2_ref;
          StringBuilder stackIn_9_1 = new StringBuilder().append("ea.F(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
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

    final static int d(byte param0) {
        if (param0 > -95) {
          ea.releaseStatics((byte) -6);
          return mh.field_f;
        }
        return mh.field_f;
    }

    final boolean e(byte param0) {
        if (param0 == -7) {
          return this.field_b >= this.field_e ? true : false;
        }
        field_i = (String) null;
        return this.field_b >= this.field_e ? true : false;
    }

    final void a(byte param0) {
        this.field_b = this.field_b + 1;
        if (param0 > 36) {
          if (this.e((byte) -7)) {
            this.field_b = this.field_e;
          }
          this.field_c = ProgressQuery.a(256, this.field_e, 0, this.field_b, 64);
          this.field_j.field_a = ProgressQuery.a(this.field_h.field_a, this.field_e, this.field_k.field_a, this.field_b, 64);
          this.field_j.field_c = ProgressQuery.a(this.field_h.field_c, this.field_e, this.field_k.field_c, this.field_b, 64);
          return;
        }
        this.field_c = -19;
        if (this.e((byte) -7)) {
          this.field_b = this.field_e;
        }
        this.field_c = ProgressQuery.a(256, this.field_e, 0, this.field_b, 64);
        this.field_j.field_a = ProgressQuery.a(this.field_h.field_a, this.field_e, this.field_k.field_a, this.field_b, 64);
        this.field_j.field_c = ProgressQuery.a(this.field_h.field_c, this.field_e, this.field_k.field_c, this.field_b, 64);
    }

    final static boolean c(byte param0) {
        int var3 = EscapeVector.obfuscationControl;
        try {
          ReflectionCheck var4 = (ReflectionCheck) (je.field_a.first(false));
          ReflectionCheck var1 = var4;
          if (var1 == null) {
            return false;
          }
          if (param0 > -47) {
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
          throw t.a((Throwable) ((Object) var1_ref), "ea.D(" + param0 + ')');
        }
    }

    ea(gb param0, gb param1, Sprite param2, int param3) {
        this.field_c = 0;
        this.field_b = 0;
        try {
          this.field_h = param1;
          this.field_a = param2;
          this.field_k = param0;
          this.field_e = param3;
          this.field_j = this.field_k.a(10);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "ea.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_i = "M";
        field_g = new QuickChatDynamicCommand(9, 0, 4, 1);
        field_d = new Sprite(270, 70);
    }
}
