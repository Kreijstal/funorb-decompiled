/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class IterableNodeHashTable implements Iterable {
    int field_d;
    IntrusiveNode[] field_c;
    private IntrusiveNode field_b;
    private IntrusiveNode field_a;
    private int field_e;

    final static void b(int param0) {
        if (null != SecondaryNodeDequeIterator.field_b) {
          SecondaryNodeDequeIterator.field_b.field_g = false;
        }
        jl.a(25, param0);
    }

    final IntrusiveNode first(int param0) {
        this.field_e = 0;
        if (param0 != -1) {
          this.field_c = (IntrusiveNode[]) null;
          return this.next(param0 + 0);
        }
        return this.next(param0 + 0);
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new NodeHashTableIterator(this));
    }

    final IntrusiveNode get(int param0, long param1) {
        IntrusiveNode var5 = null;
        int var6 = Sumoblitz.field_L ? 1 : 0;
        IntrusiveNode var4 = this.field_c[(int)(param1 & (long)(-1 + this.field_d))];
        this.field_a = var4.next;
        while (var4 != this.field_a) {
          if (~param1 == ~this.field_a.key) {
            var5 = this.field_a;
            this.field_a = this.field_a.next;
            return var5;
          }
          this.field_a = this.field_a.next;
        }
        this.field_a = null;
        if (param0 == 575) {
          return null;
        }
        this.field_d = -69;
        return null;
    }

    final void put(int param0, IntrusiveNode param1, long param2) {
        IntrusiveNode var5 = null;
        try {
          if (param1.previous != null) {
            param1.unlink(false);
          }
          if (param0 != -20657) {
            this.field_d = -114;
          }
          var5 = this.field_c[(int)((long)(this.field_d - 1) & param2)];
          param1.previous = var5.previous;
          param1.next = var5;
          param1.previous.next = param1;
          param1.key = param2;
          param1.next.previous = param1;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "um.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final IntrusiveNode next(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int var3;
        IntrusiveNode var4;
        IntrusiveNode var5;
        IntrusiveNode var6;
        IntrusiveNode var9;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (param0 != -1) {
          return (IntrusiveNode) null;
        }
        if (this.field_e <= 0) {
          do {
            if (this.field_d <= this.field_e) {
              return null;
            }
            fieldTemp$1 = this.field_e;
            this.field_e = this.field_e + 1;
            var4 = this.field_c[fieldTemp$1].next;
            var5 = var4;
          } while (var4 == this.field_c[-1 + this.field_e]);
          this.field_b = var5.next;
          return var5;
        }
        if (this.field_b != this.field_c[-1 + this.field_e]) {
          var9 = this.field_b;
          this.field_b = var9.next;
          return var9;
        }
        do {
          if (this.field_d <= this.field_e) {
            return null;
          }
          fieldTemp$0 = this.field_e;
          this.field_e = this.field_e + 1;
          var4 = this.field_c[fieldTemp$0].next;
          var6 = var4;
        } while (var4 == this.field_c[-1 + this.field_e]);
        this.field_b = var6.next;
        return var6;
    }

    final static void a(int param0, int param1, java.awt.Canvas param2, byte param3) {
        java.awt.Graphics var4 = null;
        if (param3 <= 123) {
          java.awt.Canvas var5 = (java.awt.Canvas) null;
          IterableNodeHashTable.a(-16, -25, (java.awt.Canvas) null, (byte) 50);
        }
        try {
          var4 = param2.getGraphics();
          ProgressDialog.field_R.a(-52, param1, var4, param0);
          var4.dispose();
        } catch (Exception exception) {
          param2.repaint();
        }
    }

    IterableNodeHashTable(int param0) {
        int var2 = 0;
        IntrusiveNode dupTemp$1 = null;
        IntrusiveNode var3;
        this.field_e = 0;
        this.field_c = new IntrusiveNode[param0];
        this.field_d = param0;
        for (var2 = 0; var2 < param0; var2++) {
          dupTemp$1 = new IntrusiveNode();
          var3 = dupTemp$1;
          this.field_c[var2] = dupTemp$1;
          var3.previous = var3;
          var3.next = var3;
        }
    }

    static {
    }
}
