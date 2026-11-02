/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DualLinkNodeHashTable {
    static int field_b;
    private int field_a;
    private int field_e;
    private DualLinkNode field_f;
    private long field_d;
    private DualLinkNode field_c;
    private DualLinkNode[] field_g;

    final DualLinkNode a(long param0, byte param1) {
        DualLinkNode var4;
        DualLinkNode var5;
        int var6;
        var6 = BachelorFridge.field_y;
        this.field_d = param0;
        var4 = this.field_g[(int)((long)(-1 + this.field_e) & param0)];
        this.field_c = var4.secondaryNext;
        if (param1 != -87) {
          return (DualLinkNode) null;
        }
        while (true) {
          if (var4 == this.field_c) {
            this.field_c = null;
            return null;
          }
          if (~param0 != ~this.field_c.secondaryKey) {
            this.field_c = this.field_c.secondaryNext;
            continue;
          }
          break;
        }
        var5 = this.field_c;
        this.field_c = this.field_c.secondaryNext;
        return var5;
    }

    final void a(DualLinkNode param0, int param1, long param2) {
        DualLinkNode var5 = null;
        try {
          if (null != param0.secondaryPrevious) {
            param0.unlinkSecondary(0);
          }
          var5 = this.field_g[(int)((long)(-1 + this.field_e) & param2)];
          param0.secondaryPrevious = var5.secondaryPrevious;
          param0.secondaryNext = var5;
          param0.secondaryPrevious.secondaryNext = param0;
          if (param1 != 91) {
            this.a(47);
          }
          param0.secondaryNext.secondaryPrevious = param0;
          param0.secondaryKey = param2;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "wma.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final DualLinkNode b(byte param0) {
        this.field_a = 0;
        if (param0 != -73) {
          return (DualLinkNode) null;
        }
        return this.a(-25177);
    }

    final static void c(byte param0) {
        ru.field_d[44] = 71;
        ru.field_d[93] = 43;
        ru.field_d[92] = 74;
        if (param0 >= 0) {
          ru.field_d[46] = 72;
          ru.field_d[61] = 27;
          ru.field_d[59] = 57;
          ru.field_d[520] = 59;
          ru.field_d[222] = 58;
          ru.field_d[192] = 28;
          ru.field_d[45] = 26;
          ru.field_d[47] = 73;
          ru.field_d[91] = 42;
          return;
        }
        field_b = 39;
        ru.field_d[46] = 72;
        ru.field_d[61] = 27;
        ru.field_d[59] = 57;
        ru.field_d[520] = 59;
        ru.field_d[222] = 58;
        ru.field_d[192] = 28;
        ru.field_d[45] = 26;
        ru.field_d[47] = 73;
        ru.field_d[91] = 42;
    }

    final DualLinkNode a(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$2 = 0;
        int var3;
        DualLinkNode var4;
        DualLinkNode var35;
        DualLinkNode var36;
        DualLinkNode var37;
        DualLinkNode var38;
        DualLinkNode var41;
        var3 = BachelorFridge.field_y;
        if (param0 == -25177) {
          if (this.field_a <= 0) {
            do {
              if (this.field_e <= this.field_a) {
                return null;
              }
              fieldTemp$1 = this.field_a;
              this.field_a = this.field_a + 1;
              var37 = this.field_g[fieldTemp$1].secondaryNext;
            } while (this.field_g[this.field_a - 1] == var37);
            this.field_f = var37.secondaryNext;
            return var37;
          }
          if (this.field_g[this.field_a - 1] != this.field_f) {
            var41 = this.field_f;
            this.field_f = var41.secondaryNext;
            return var41;
          }
          do {
            if (this.field_e <= this.field_a) {
              return null;
            }
            fieldTemp$0 = this.field_a;
            this.field_a = this.field_a + 1;
            var38 = this.field_g[fieldTemp$0].secondaryNext;
          } while (this.field_g[this.field_a - 1] == var38);
          this.field_f = var38.secondaryNext;
          return var38;
        }
        this.a(72);
        if (this.field_a <= 0) {
          do {
            if (this.field_e <= this.field_a) {
              return null;
            }
            fieldTemp$3 = this.field_a;
            this.field_a = this.field_a + 1;
            var4 = this.field_g[fieldTemp$3].secondaryNext;
          } while (this.field_g[this.field_a - 1] == var4);
          this.field_f = var4.secondaryNext;
          return var4;
        }
        if (this.field_g[this.field_a - 1] != this.field_f) {
          var35 = this.field_f;
          this.field_f = var35.secondaryNext;
          return var35;
        }
        do {
          if (this.field_e <= this.field_a) {
            return null;
          }
          fieldTemp$2 = this.field_a;
          this.field_a = this.field_a + 1;
          var36 = this.field_g[fieldTemp$2].secondaryNext;
        } while (this.field_g[this.field_a - 1] == var36);
        this.field_f = var36.secondaryNext;
        return var36;
    }

    final DualLinkNode a(byte param0) {
        DualLinkNode var3 = null;
        int var4 = BachelorFridge.field_y;
        if (null == this.field_c) {
          return null;
        }
        DualLinkNode var2 = this.field_g[(int)(this.field_d & (long)(this.field_e - 1))];
        while (var2 != this.field_c) {
          if (this.field_d == this.field_c.secondaryKey) {
            var3 = this.field_c;
            this.field_c = this.field_c.secondaryNext;
            return var3;
          }
          this.field_c = this.field_c.secondaryNext;
        }
        if (param0 == -31) {
          this.field_c = null;
          return null;
        }
        this.a(-83L, (byte) 79);
        this.field_c = null;
        return null;
    }

    DualLinkNodeHashTable(int param0) {
        int var2 = 0;
        DualLinkNode dupTemp$1 = null;
        DualLinkNode var3;
        this.field_a = 0;
        this.field_g = new DualLinkNode[param0];
        this.field_e = param0;
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$1 = new DualLinkNode();
          var3 = dupTemp$1;
          this.field_g[var2] = dupTemp$1;
          var3.secondaryNext = var3;
          var3.secondaryPrevious = var3;
        }
    }

    static {
    }
}
