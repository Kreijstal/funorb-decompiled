/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cb extends AnimationNode {
    private int field_j;
    static String field_n;
    static UiComponent[] field_o;
    private int field_l;
    private CreatureActor field_k;
    static UiComponent field_m;

    private final void d(int param0) {
        if (param0 != -24070) {
          cb.releaseStatics((byte) -101);
        }
    }

    final boolean isFinished(byte param0) {
        int fieldTemp$0 = 0;
        int var2 = 0;
        int var2Lifetime1;
        if (this.field_l == 0) {
          this.field_k.b(-1, this.field_j);
          fieldTemp$0 = this.field_l + 1;
          this.field_l = this.field_l + 1;
          if (!(fieldTemp$0 < this.e((byte) 100))) {
            this.d(-24070);
            return true;
          }
          var2 = -15 / ((param0 - 71) / 47);
          return false;
        }
        int fieldTemp$1 = this.field_l + 1;
        this.field_l = this.field_l + 1;
        if (!(fieldTemp$1 < this.e((byte) 100))) {
          this.d(-24070);
          return true;
        }
        var2Lifetime1 = -15 / ((param0 - 71) / 47);
        return false;
    }

    private final int e(byte param0) {
        int var2 = 3 % ((param0 + 33) / 52);
        return 10;
    }

    public static void releaseStatics(byte param0) {
        if (param0 < 102) {
          return;
        }
        field_n = null;
        field_m = null;
        field_o = null;
    }

    cb(CreatureActor param0, int param1) {
        try {
          this.field_k = param0;
          this.field_j = param1;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "cb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_n = "Try changing the '<%0>' setting.";
    }
}
