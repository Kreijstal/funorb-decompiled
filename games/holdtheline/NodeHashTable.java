/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NodeHashTable {
    private int field_d;
    private IntrusiveNode field_c;
    private IntrusiveNode[] field_a;
    private int field_e;
    private IntrusiveNode field_b;

    final IntrusiveNode a(byte param0, long param1) {
        IntrusiveNode var4;
        IntrusiveNode var5;
        int var6;
        var6 = HoldTheLine.field_D;
        if (param0 < 111) {
          return (IntrusiveNode) null;
        }
        var4 = this.field_a[(int)(param1 & (long)(this.field_d - 1))];
        this.field_b = var4.next;
        while (true) {
          if (var4 == this.field_b) {
            this.field_b = null;
            return null;
          }
          if (~this.field_b.key != ~param1) {
            this.field_b = this.field_b.next;
            continue;
          }
          break;
        }
        var5 = this.field_b;
        this.field_b = this.field_b.next;
        return var5;
    }

    final void a(IntrusiveNode param0, long param1, boolean param2) {
        IntrusiveNode var5 = null;
        if (param0.previous != null) {
          param0.unlink(0);
        }
        if (param2) {
          return;
        }
        try {
          var5 = this.field_a[(int)((long)(this.field_d - 1) & param1)];
          param0.previous = var5.previous;
          param0.next = var5;
          param0.previous.next = param0;
          param0.key = param1;
          param0.next.previous = param0;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "og.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(byte param0) {
        if (param0 != 44) {
          return;
        }
        sm.field_c.a((UiWidget) (new LoginChoicePanel()), (byte) 87);
    }

    final IntrusiveNode a(int param0) {
        this.field_e = param0;
        return this.b(-1);
    }

    final IntrusiveNode b(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int var3;
        IntrusiveNode var4;
        IntrusiveNode var5;
        IntrusiveNode var6;
        IntrusiveNode var9;
        var3 = HoldTheLine.field_D;
        if (0 >= this.field_e) {
          do {
            if (this.field_d <= this.field_e) {
              if (param0 == -1) {
                return null;
              }
              this.field_d = -105;
              return null;
            }
            fieldTemp$1 = this.field_e;
            this.field_e = this.field_e + 1;
            var4 = this.field_a[fieldTemp$1].next;
            var5 = var4;
          } while (var4 == this.field_a[-1 + this.field_e]);
          this.field_c = var5.next;
          return var5;
        }
        if (this.field_a[-1 + this.field_e] != this.field_c) {
          var9 = this.field_c;
          this.field_c = var9.next;
          return var9;
        }
        do {
          if (this.field_d <= this.field_e) {
            if (param0 == -1) {
              return null;
            }
            this.field_d = -105;
            return null;
          }
          fieldTemp$0 = this.field_e;
          this.field_e = this.field_e + 1;
          var4 = this.field_a[fieldTemp$0].next;
          var6 = var4;
        } while (var4 == this.field_a[-1 + this.field_e]);
        this.field_c = var6.next;
        return var6;
    }

    NodeHashTable(int param0) {
        int var2 = 0;
        IntrusiveNode dupTemp$1 = null;
        IntrusiveNode var3;
        this.field_e = 0;
        this.field_a = new IntrusiveNode[param0];
        this.field_d = param0;
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$1 = new IntrusiveNode();
          var3 = dupTemp$1;
          this.field_a[var2] = dupTemp$1;
          var3.next = var3;
          var3.previous = var3;
        }
    }

    static {
    }
}
