/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class iha extends at {
    static int field_j;
    static String field_k;

    iha() {
    }

    final boolean b(int param0) {
        int var3;
        at var4;
        boolean stackIn_34_0 = false;
        boolean stackIn_50_0 = false;
        at var4Lifetime1;
        at var4Lifetime2;
        var3 = BachelorFridge.field_y;
        if (this.field_f) {
          if (param0 != 21807) {
            return true;
          }
          if (null == this.field_h) {
            return this.field_f;
          }
          var4 = (at) (this.field_h.b((byte) 90));
          while (var4 != null) {
            if (var4.b(param0 + 0)) {
              var4.a(false);
            }
            var4 = (at) (this.field_h.c(0));
          }
          if (!this.field_f) {
            return false;
          }
          if (!this.field_h.e(12917)) {
            return false;
          }
          return true;
        }
        if (!this.c((byte) 122)) {
          if (param0 != 21807) {
            return true;
          }
          if (null == this.field_h) {
            return this.field_f;
          }
          var4Lifetime1 = (at) (this.field_h.b((byte) 90));
          while (var4Lifetime1 != null) {
            if (var4Lifetime1.b(param0 + 0)) {
              var4Lifetime1.a(false);
            }
            var4Lifetime1 = (at) (this.field_h.c(0));
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
        var4Lifetime2 = (at) (this.field_h.b((byte) 90));
        while (var4Lifetime2 != null) {
          if (var4Lifetime2.b(param0 + 0)) {
            var4Lifetime2.a(false);
          }
          var4Lifetime2 = (at) (this.field_h.c(0));
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
