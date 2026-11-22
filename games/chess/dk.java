/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk {
    static String field_e;
    static java.math.BigInteger field_k;
    private DualLinkNode field_i;
    static ci field_h;
    private int field_m;
    private DualLinkNode field_c;
    private DualLinkNode[] field_b;
    private int field_d;
    static boolean field_g;
    static tk field_f;
    static String field_a;
    private long field_j;
    static String field_l;

    final DualLinkNode b(boolean param0) {
        DualLinkNode var2;
        DualLinkNode var3;
        int var4;
        var4 = Chess.field_G;
        if (!param0) {
          return (DualLinkNode) null;
        }
        if (this.field_i == null) {
          return null;
        }
        var2 = this.field_b[(int)(this.field_j & (long)(-1 + this.field_m))];
        while (true) {
          if (this.field_i == var2) {
            this.field_i = null;
            return null;
          }
          if (~this.field_i.secondaryKey != ~this.field_j) {
            this.field_i = this.field_i.secondaryNext;
            continue;
          }
          break;
        }
        var3 = this.field_i;
        this.field_i = this.field_i.secondaryNext;
        return var3;
    }

    final DualLinkNode a(boolean param0) {
        if (!param0) {
          this.field_d = 0;
          return this.a(0);
        }
        dk.c(false);
        this.field_d = 0;
        return this.a(0);
    }

    final DualLinkNode a(long param0, int param1) {
        DualLinkNode var4;
        DualLinkNode var5;
        int var6;
        DualLinkNode var4Lifetime1;
        DualLinkNode var5Lifetime1;
        var6 = Chess.field_G;
        this.field_j = param0;
        if (param1 == 3000) {
          var4 = this.field_b[(int)((long)(-1 + this.field_m) & param0)];
          this.field_i = var4.secondaryNext;
          while (true) {
            if (var4 == this.field_i) {
              this.field_i = null;
              return null;
            }
            if (~this.field_i.secondaryKey != ~param0) {
              this.field_i = this.field_i.secondaryNext;
              continue;
            }
            break;
          }
          var5 = this.field_i;
          this.field_i = this.field_i.secondaryNext;
          return var5;
        }
        this.field_j = 72L;
        var4Lifetime1 = this.field_b[(int)((long)(-1 + this.field_m) & param0)];
        this.field_i = var4Lifetime1.secondaryNext;
        while (true) {
          if (var4Lifetime1 == this.field_i) {
            this.field_i = null;
            return null;
          }
          if (~this.field_i.secondaryKey != ~param0) {
            this.field_i = this.field_i.secondaryNext;
            continue;
          }
          break;
        }
        var5Lifetime1 = this.field_i;
        this.field_i = this.field_i.secondaryNext;
        return var5Lifetime1;
    }

    final void a(boolean param0, DualLinkNode param1, long param2) {
        DualLinkNode var5 = null;
        try {
          if (!param0) {
            this.a(false, (DualLinkNode) null, -111L);
          }
          if (null != param1.secondaryPrevious) {
            param1.unlinkSecondary(-1);
          }
          var5 = this.field_b[(int)(param2 & (long)(this.field_m - 1))];
          param1.secondaryPrevious = var5.secondaryPrevious;
          param1.secondaryNext = var5;
          param1.secondaryPrevious.secondaryNext = param1;
          param1.secondaryKey = param2;
          param1.secondaryNext.secondaryPrevious = param1;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "dk.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final DualLinkNode a(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int var3;
        DualLinkNode var4;
        DualLinkNode var5;
        DualLinkNode var9;
        DualLinkNode var12;
        var3 = Chess.field_G;
        if (this.field_d <= 0) {
          do {
            if (this.field_m <= this.field_d) {
              if (param0 == 0) {
                return null;
              }
              dk.clearStaticReferences(40);
              return null;
            }
            fieldTemp$1 = this.field_d;
            this.field_d = this.field_d + 1;
            var4 = this.field_b[fieldTemp$1].secondaryNext;
            var5 = var4;
          } while (var4 == this.field_b[-1 + this.field_d]);
          this.field_c = var5.secondaryNext;
          return var5;
        }
        if (this.field_c != this.field_b[this.field_d - 1]) {
          var12 = this.field_c;
          this.field_c = var12.secondaryNext;
          return var12;
        }
        do {
          if (this.field_m <= this.field_d) {
            if (param0 == 0) {
              return null;
            }
            dk.clearStaticReferences(40);
            return null;
          }
          fieldTemp$0 = this.field_d;
          this.field_d = this.field_d + 1;
          var4 = this.field_b[fieldTemp$0].secondaryNext;
          var9 = var4;
        } while (var4 == this.field_b[-1 + this.field_d]);
        this.field_c = var9.secondaryNext;
        return var9;
    }

    final static boolean c(boolean param0) {
        long var1;
        long var3;
        int var5;
        int var6;
        var6 = Chess.field_G;
        if (param0) {
          dk.c(false);
        }
        var1 = ud.a(2);
        var3 = -cf.field_Jb + var1;
        if (var3 > 30000L) {
          cf.field_Jb = var1;
          s.field_K = 0;
          return true;
        }
        var5 = 3000;
        if (7 <= s.field_K) {
          var5 = 12000;
        } else {
          if (s.field_K >= 5) {
            var5 = 9000;
          } else {
            if (s.field_K >= 3) {
              var5 = 6000;
            }
          }
        }
        if (var3 <= (long)var5) {
          return false;
        }
        cf.field_Jb = var1;
        s.field_K = s.field_K + 1;
        return true;
    }

    public static void clearStaticReferences(int param0) {
        if (param0 == 12000) {
          field_l = null;
          field_e = null;
          field_f = null;
          field_k = null;
          field_h = null;
          field_a = null;
          return;
        }
        field_l = (String) null;
        field_l = null;
        field_e = null;
        field_f = null;
        field_k = null;
        field_h = null;
        field_a = null;
    }

    dk(int param0) {
        int var2 = 0;
        DualLinkNode dupTemp$1 = null;
        DualLinkNode var3;
        this.field_d = 0;
        this.field_b = new DualLinkNode[param0];
        this.field_m = param0;
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$1 = new DualLinkNode();
          var3 = dupTemp$1;
          this.field_b[var2] = dupTemp$1;
          var3.secondaryPrevious = var3;
          var3.secondaryNext = var3;
        }
    }

    static {
        field_e = "Chat view has been scrolled up. Scroll down to chat.";
        field_k = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        field_f = new tk();
        field_a = "Players: <%0>/<%1>";
        field_l = "You can join this game";
    }
}
