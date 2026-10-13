/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk {
    private DualLinkNode field_f;
    private int field_k;
    private long field_g;
    private int field_h;
    private DualLinkNode[] field_e;
    static long field_j;
    private DualLinkNode field_d;
    static int[] earnedAchievementMask;
    static String[][] field_c;
    static java.applet.Applet field_i;
    static String field_a;

    final DualLinkNode a(long param0, int param1) {
        DualLinkNode var4;
        DualLinkNode var5;
        int var6;
        var6 = BrickABrac.field_J ? 1 : 0;
        this.field_g = param0;
        var4 = this.field_e[(int)((long)(this.field_k + param1) & param0)];
        this.field_d = var4.secondaryNext;
        while (true) {
          if (this.field_d == var4) {
            this.field_d = null;
            return null;
          }
          if (param0 != this.field_d.secondaryKey) {
            this.field_d = this.field_d.secondaryNext;
            continue;
          }
          break;
        }
        var5 = this.field_d;
        this.field_d = this.field_d.secondaryNext;
        return var5;
    }

    final DualLinkNode a(byte param0) {
        DualLinkNode var2;
        int var3_int;
        DualLinkNode var3;
        int var4;
        var4 = BrickABrac.field_J ? 1 : 0;
        if (null == this.field_d) {
          return null;
        }
        var2 = this.field_e[(int)((long)(this.field_k - 1) & this.field_g)];
        while (true) {
          if (this.field_d == var2) {
            var3_int = 61 / ((param0 - 37) / 63);
            this.field_d = null;
            return null;
          }
          if (this.field_g != this.field_d.secondaryKey) {
            this.field_d = this.field_d.secondaryNext;
            continue;
          }
          break;
        }
        var3 = this.field_d;
        this.field_d = this.field_d.secondaryNext;
        return var3;
    }

    final DualLinkNode a(boolean param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$2 = 0;
        int var3;
        DualLinkNode var4;
        DualLinkNode var5;
        DualLinkNode var36;
        DualLinkNode var37;
        DualLinkNode var38;
        DualLinkNode var39;
        DualLinkNode var42;
        var3 = BrickABrac.field_J ? 1 : 0;
        if (!param0) {
          if (0 >= this.field_h) {
            do {
              if (this.field_k <= this.field_h) {
                return null;
              }
              fieldTemp$1 = this.field_h;
              this.field_h = this.field_h + 1;
              var4 = this.field_e[fieldTemp$1].secondaryNext;
              var38 = var4;
            } while (var4 == this.field_e[-1 + this.field_h]);
            this.field_f = var38.secondaryNext;
            return var38;
          }
          if (this.field_e[-1 + this.field_h] != this.field_f) {
            var42 = this.field_f;
            this.field_f = var42.secondaryNext;
            return var42;
          }
          do {
            if (this.field_k <= this.field_h) {
              return null;
            }
            fieldTemp$0 = this.field_h;
            this.field_h = this.field_h + 1;
            var4 = this.field_e[fieldTemp$0].secondaryNext;
            var39 = var4;
          } while (var4 == this.field_e[-1 + this.field_h]);
          this.field_f = var39.secondaryNext;
          return var39;
        }
        this.a(31L, -107);
        if (0 >= this.field_h) {
          do {
            if (this.field_k <= this.field_h) {
              return null;
            }
            fieldTemp$3 = this.field_h;
            this.field_h = this.field_h + 1;
            var4 = this.field_e[fieldTemp$3].secondaryNext;
            var5 = var4;
          } while (var4 == this.field_e[-1 + this.field_h]);
          this.field_f = var5.secondaryNext;
          return var5;
        }
        if (this.field_e[-1 + this.field_h] != this.field_f) {
          var36 = this.field_f;
          this.field_f = var36.secondaryNext;
          return var36;
        }
        do {
          if (this.field_k <= this.field_h) {
            return null;
          }
          fieldTemp$2 = this.field_h;
          this.field_h = this.field_h + 1;
          var4 = this.field_e[fieldTemp$2].secondaryNext;
          var37 = var4;
        } while (var4 == this.field_e[-1 + this.field_h]);
        this.field_f = var37.secondaryNext;
        return var37;
    }

    final DualLinkNode b(byte param0) {
        this.field_h = 0;
        if (param0 <= 57) {
          return (DualLinkNode) null;
        }
        return this.a(false);
    }

    final static void a(int param0) {
        if (param0 == -1) {
          return;
        }
        mk.c((byte) 88);
    }

    final void a(long param0, DualLinkNode param1, int param2) {
        if (null != param1.secondaryPrevious) {
          param1.unlinkSecondary(3);
        }
        DualLinkNode var5 = this.field_e[(int)(param0 & (long)(-1 + this.field_k))];
        param1.secondaryPrevious = var5.secondaryPrevious;
        param1.secondaryNext = var5;
        param1.secondaryPrevious.secondaryNext = param1;
        if (param2 <= 38) {
          return;
        }
        try {
          param1.secondaryNext.secondaryPrevious = param1;
          param1.secondaryKey = param0;
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "mk.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void c(byte param0) {
        field_i = null;
        field_c = (String[][]) null;
        earnedAchievementMask = null;
        field_a = null;
        if (param0 > 47) {
          return;
        }
        field_i = (java.applet.Applet) null;
    }

    mk(int param0) {
        int var2 = 0;
        DualLinkNode dupTemp$1 = null;
        DualLinkNode var3;
        this.field_h = 0;
        this.field_e = new DualLinkNode[param0];
        this.field_k = param0;
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$1 = new DualLinkNode();
          var3 = dupTemp$1;
          this.field_e[var2] = dupTemp$1;
          var3.secondaryPrevious = var3;
          var3.secondaryNext = var3;
        }
    }

    static {
        earnedAchievementMask = Ball.d(8);
        field_a = "Wipe out: cancels out any positive power-ups.";
    }
}
