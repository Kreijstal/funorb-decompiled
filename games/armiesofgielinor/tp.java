/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tp {
    static NodeDeque field_e;
    private long field_d;
    private DualLinkedNode[] field_h;
    private int field_b;
    private DualLinkedNode field_a;
    static String field_c;
    static String field_f;
    private int field_i;
    private DualLinkedNode field_g;

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    final DualLinkedNode d(int param0) {
        DualLinkedNode var3 = null;
        int var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.field_g == null) {
          return null;
        }
        DualLinkedNode var2 = this.field_h[(int)(this.field_d & (long)(this.field_b - 1))];
        if (param0 == -348) {
          while (var2 != this.field_g) {
            if (~this.field_d == ~this.field_g.secondaryKey) {
              var3 = this.field_g;
              this.field_g = this.field_g.secondaryNext;
              return var3;
            }
            this.field_g = this.field_g.secondaryNext;
          }
          this.field_g = null;
          return null;
        }
        return (DualLinkedNode) null;
    }

    public static void a(int param0) {
        field_c = null;
        field_f = null;
        field_e = null;
        int var1 = 20 / ((11 - param0) / 56);
    }

    final DualLinkedNode a(byte param0, long param1) {
        DualLinkedNode var5 = null;
        int var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        this.field_d = param1;
        DualLinkedNode var4 = this.field_h[(int)((long)(this.field_b - 1) & param1)];
        this.field_g = var4.secondaryNext;
        while (var4 != this.field_g) {
          if (~this.field_g.secondaryKey == ~param1) {
            var5 = this.field_g;
            this.field_g = this.field_g.secondaryNext;
            return var5;
          }
          this.field_g = this.field_g.secondaryNext;
        }
        if (param0 != -27) {
          DualLinkedNode var7 = (DualLinkedNode) null;
          this.a(-62, 115L, (DualLinkedNode) null);
          this.field_g = null;
          return null;
        }
        this.field_g = null;
        return null;
    }

    final DualLinkedNode a(byte param0) {
        if (param0 != 66) {
          field_f = (String) null;
          this.field_i = 0;
          return this.c(1);
        }
        this.field_i = 0;
        return this.c(1);
    }

    final static int getNominalTickRate(int obfuscationGuard) {
        if (obfuscationGuard > -68) {
          return -119;
        }
        return (int)(1000000000L / rd.field_i);
    }

    final void a(int param0, long param1, DualLinkedNode param2) {
        DualLinkedNode var5 = null;
        try {
          if (param2.secondaryPrevious != null) {
            param2.unlinkSecondary((byte) -76);
          }
          var5 = this.field_h[(int)(param1 & (long)(param0 + this.field_b))];
          param2.secondaryPrevious = var5.secondaryPrevious;
          param2.secondaryNext = var5;
          param2.secondaryPrevious.secondaryNext = param2;
          param2.secondaryKey = param1;
          param2.secondaryNext.secondaryPrevious = param2;
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "tp.G(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final DualLinkedNode c(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int var3;
        DualLinkedNode var4;
        DualLinkedNode var5;
        DualLinkedNode var6;
        DualLinkedNode var9;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.field_i <= 0) {
          do {
            if (this.field_i >= this.field_b) {
              if (param0 != 1) {
                return (DualLinkedNode) null;
              }
              return null;
            }
            fieldTemp$1 = this.field_i;
            this.field_i = this.field_i + 1;
            var4 = this.field_h[fieldTemp$1].secondaryNext;
            var5 = var4;
          } while (var4 == this.field_h[-1 + this.field_i]);
          this.field_a = var5.secondaryNext;
          return var5;
        }
        if (this.field_h[this.field_i - 1] != this.field_a) {
          var9 = this.field_a;
          this.field_a = var9.secondaryNext;
          return var9;
        }
        do {
          if (this.field_i >= this.field_b) {
            if (param0 != 1) {
              return (DualLinkedNode) null;
            }
            return null;
          }
          fieldTemp$0 = this.field_i;
          this.field_i = this.field_i + 1;
          var4 = this.field_h[fieldTemp$0].secondaryNext;
          var6 = var4;
        } while (var4 == this.field_h[-1 + this.field_i]);
        this.field_a = var6.secondaryNext;
        return var6;
    }

    tp(int param0) {
        int var2 = 0;
        DualLinkedNode dupTemp$1 = null;
        DualLinkedNode var3;
        this.field_i = 0;
        this.field_h = new DualLinkedNode[param0];
        this.field_b = param0;
        for (var2 = 0; var2 < param0; var2++) {
          dupTemp$1 = new DualLinkedNode();
          var3 = dupTemp$1;
          this.field_h[var2] = dupTemp$1;
          var3.secondaryPrevious = var3;
          var3.secondaryNext = var3;
        }
    }

    static {
        field_e = new NodeDeque();
        field_f = "Your game";
        field_c = "Try changing the '<%0>' setting.";
    }
}
