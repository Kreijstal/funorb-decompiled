/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class AnimationNode extends IntrusiveNode {
    static String field_i;
    static String[] field_g;
    boolean field_f;
    IntrusiveDeque field_h;

    final void a(int param0, AnimationNode param1) {
        try {
          if (this.field_h == null) {
            this.field_h = new IntrusiveDeque();
          }
          if (param0 != 27799) {
            field_g = (String[]) null;
          }
          this.field_h.a(param1, true);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "at.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    abstract boolean c(byte param0);

    boolean b(int param0) {
        AnimationNode var2;
        int var3;
        boolean stackIn_11_0 = false;
        boolean stackIn_34_0 = false;
        boolean stackIn_43_0 = false;
        boolean stackIn_55_0 = false;
        boolean stackIn_61_0 = false;
        AnimationNode var2Lifetime1;
        AnimationNode var2Lifetime2;
        var3 = BachelorFridge.field_y;
        if (this.field_f) {
          if (param0 != 21807) {
            return false;
          }
          if (this.field_h == null) {
            return this.field_f;
          }
          var2 = (AnimationNode) (this.field_h.b((byte) 90));
          while (true) {
            if (var2 == null) {
              stackIn_11_0 = (this.field_f) && (this.field_h.e(param0 - 8890));
              return stackIn_11_0;
            }
            if (var2.b(21807)) {
              var2.unlink(false);
              var2 = (AnimationNode) (this.field_h.c(0));
              continue;
            }
            break;
          }
          if (!this.field_f) {
            return false;
          }
          if (this.field_h.e(param0 - 8890)) {
            return true;
          }
          return false;
        }
        if (!this.c((byte) -14)) {
          if (param0 != 21807) {
            return false;
          }
          if (this.field_h == null) {
            return this.field_f;
          }
          var2Lifetime1 = (AnimationNode) (this.field_h.b((byte) 90));
          while (true) {
            if (var2Lifetime1 == null) {
              stackIn_61_0 = (this.field_f) && (this.field_h.e(param0 - 8890));
              return stackIn_61_0;
            }
            if (var2Lifetime1.b(21807)) {
              var2Lifetime1.unlink(false);
              var2Lifetime1 = (AnimationNode) (this.field_h.c(0));
              continue;
            }
            break;
          }
          stackIn_55_0 = (this.field_f) && (this.field_h.e(param0 - 8890));
          return stackIn_55_0;
        }
        this.field_f = true;
        if (param0 != 21807) {
          return false;
        }
        if (this.field_h == null) {
          return this.field_f;
        }
        var2Lifetime2 = (AnimationNode) (this.field_h.b((byte) 90));
        while (true) {
          if (var2Lifetime2 == null) {
            stackIn_34_0 = (this.field_f) && (this.field_h.e(param0 - 8890));
            return stackIn_34_0;
          }
          if (var2Lifetime2.b(21807)) {
            var2Lifetime2.unlink(false);
            var2Lifetime2 = (AnimationNode) (this.field_h.c(0));
            continue;
          }
          break;
        }
        stackIn_43_0 = (this.field_f) && (this.field_h.e(param0 - 8890));
        return stackIn_43_0;
    }

    protected AnimationNode() {
    }

    void c(int param0) {
        if (param0 >= -10) {
          this.c((byte) 120);
        }
    }

    public static void a(int param0) {
        field_i = null;
        if (param0 != 5849) {
          return;
        }
        field_g = null;
    }

    static {
        field_i = null;
        field_g = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
    }
}
