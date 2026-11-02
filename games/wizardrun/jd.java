/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd {
    static int field_b;
    static int field_f;
    static String field_a;
    static String field_c;
    private DualLinkNode field_h;
    private long field_g;
    private DualLinkNode[] field_d;
    private int field_e;

    final void a(DualLinkNode param0, long param1, int param2) {
        DualLinkNode var5 = null;
        if (param2 <= 103) {
          return;
        }
        try {
          if (param0.secondaryPrevious != null) {
            param0.unlink(false);
          }
          var5 = this.field_d[(int)((long)(this.field_e - 1) & param1)];
          param0.secondaryNext = var5;
          param0.secondaryPrevious = var5.secondaryPrevious;
          param0.secondaryPrevious.secondaryNext = param0;
          param0.secondaryNext.secondaryPrevious = param0;
          param0.secondaryKey = param1;
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "jd.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final DualLinkNode a(boolean param0) {
        DualLinkNode var3 = null;
        int var4 = wizardrun.field_H;
        DualLinkNode var3Lifetime1;
        if (this.field_h == null) {
          return null;
        }
        DualLinkNode var2 = this.field_d[(int)((long)(this.field_e - 1) & this.field_g)];
        if (!param0) {
          while (this.field_h != var2) {
            if (~this.field_h.secondaryKey == ~this.field_g) {
              var3 = this.field_h;
              this.field_h = this.field_h.secondaryNext;
              return var3;
            }
            this.field_h = this.field_h.secondaryNext;
          }
          this.field_h = null;
          return null;
        }
        this.field_h = (DualLinkNode) null;
        while (this.field_h != var2) {
          if (~this.field_h.secondaryKey == ~this.field_g) {
            var3Lifetime1 = this.field_h;
            this.field_h = this.field_h.secondaryNext;
            return var3Lifetime1;
          }
          this.field_h = this.field_h.secondaryNext;
        }
        this.field_h = null;
        return null;
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        if (param0 == -1) {
          return;
        }
        field_b = 86;
    }

    final DualLinkNode a(long param0, byte param1) {
        DualLinkNode var5 = null;
        int var6 = wizardrun.field_H;
        DualLinkNode var5Lifetime1;
        this.field_g = param0;
        DualLinkNode var4 = this.field_d[(int)(param0 & (long)(-1 + this.field_e))];
        this.field_h = var4.secondaryNext;
        if (param1 >= 96) {
          while (var4 != this.field_h) {
            if (~param0 == ~this.field_h.secondaryKey) {
              var5 = this.field_h;
              this.field_h = this.field_h.secondaryNext;
              return var5;
            }
            this.field_h = this.field_h.secondaryNext;
          }
          this.field_h = null;
          return null;
        }
        jd.a(-102);
        while (var4 != this.field_h) {
          if (~param0 == ~this.field_h.secondaryKey) {
            var5Lifetime1 = this.field_h;
            this.field_h = this.field_h.secondaryNext;
            return var5Lifetime1;
          }
          this.field_h = this.field_h.secondaryNext;
        }
        this.field_h = null;
        return null;
    }

    jd(int param0) {
        int var2 = 0;
        DualLinkNode dupTemp$1 = null;
        DualLinkNode var3;
        this.field_d = new DualLinkNode[param0];
        this.field_e = param0;
        for (var2 = 0; var2 < param0; var2++) {
          dupTemp$1 = new DualLinkNode();
          var3 = dupTemp$1;
          this.field_d[var2] = dupTemp$1;
          var3.secondaryNext = var3;
          var3.secondaryPrevious = var3;
        }
    }

    static {
        field_b = 64;
        field_a = "Music";
        field_c = "To defeat the boss hit";
    }
}
