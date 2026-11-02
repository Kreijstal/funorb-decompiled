/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class iha extends AnimationNode {
    static int field_j;
    static String field_k;

    iha() {
    }

    final boolean update(int param0) {
        int var3;
        AnimationNode var4;
        boolean stackIn_34_0 = false;
        boolean stackIn_50_0 = false;
        AnimationNode var4Lifetime1;
        AnimationNode var4Lifetime2;
        var3 = BachelorFridge.field_y;
        if (this.field_f) {
          if (param0 != 21807) {
            return true;
          }
          if (null == this.field_h) {
            return this.field_f;
          }
          var4 = (AnimationNode) (this.field_h.b((byte) 90));
          while (var4 != null) {
            if (var4.update(param0 + 0)) {
              var4.unlink(false);
            }
            var4 = (AnimationNode) (this.field_h.c(0));
          }
          if (!this.field_f) {
            return false;
          }
          if (!this.field_h.e(12917)) {
            return false;
          }
          return true;
        }
        if (!this.isFinished((byte) 122)) {
          if (param0 != 21807) {
            return true;
          }
          if (null == this.field_h) {
            return this.field_f;
          }
          var4Lifetime1 = (AnimationNode) (this.field_h.b((byte) 90));
          while (var4Lifetime1 != null) {
            if (var4Lifetime1.update(param0 + 0)) {
              var4Lifetime1.unlink(false);
            }
            var4Lifetime1 = (AnimationNode) (this.field_h.c(0));
          }
          stackIn_34_0 = (this.field_f) && (this.field_h.e(12917));
          return stackIn_34_0;
        }
        this.field_f = true;
        if (param0 != 21807) {
          return true;
        }
        if (null == this.field_h) {
          return this.field_f;
        }
        var4Lifetime2 = (AnimationNode) (this.field_h.b((byte) 90));
        while (var4Lifetime2 != null) {
          if (var4Lifetime2.update(param0 + 0)) {
            var4Lifetime2.unlink(false);
          }
          var4Lifetime2 = (AnimationNode) (this.field_h.c(0));
        }
        stackIn_50_0 = (this.field_f) && (this.field_h.e(12917));
        return stackIn_50_0;
    }

    public static void d(int param0) {
        field_k = null;
        int var1 = -57 / ((param0 - 43) / 45);
    }

    final static void e(int param0) {
        if (param0 != 5) {
          field_k = (String) null;
        }
    }

    static {
        field_j = 5;
        field_k = "There are no valid types of game that match your preferences.";
    }
}
