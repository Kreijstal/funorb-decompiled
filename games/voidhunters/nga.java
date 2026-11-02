/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class nga implements Iterable {
    static String field_a;
    private IntrusiveNode field_g;
    static String field_c;
    private IntrusiveNode field_b;
    int field_f;
    static String field_e;
    private int field_d;
    IntrusiveNode[] field_h;

    public final Iterator iterator() {
        return (Iterator) ((Object) new pnb(this));
    }

    final IntrusiveNode a(byte param0, long param1) {
        IntrusiveNode var5 = null;
        int var6 = VoidHunters.field_G;
        IntrusiveNode var4 = this.field_h[(int)(param1 & (long)(this.field_f - 1))];
        this.field_b = var4.field_c;
        if (param0 > -103) {
          return (IntrusiveNode) null;
        }
        while (var4 != this.field_b) {
          if (~param1 == ~this.field_b.field_b) {
            var5 = this.field_b;
            this.field_b = this.field_b.field_c;
            return var5;
          }
          this.field_b = this.field_b.field_c;
        }
        this.field_b = null;
        return null;
    }

    final void a(IntrusiveNode param0, int param1, long param2) {
        IntrusiveNode var5 = null;
        try {
          if (null != param0.field_a) {
            param0.b(-3846);
          }
          var5 = this.field_h[(int)(param2 & (long)(this.field_f - 1))];
          if (param1 != 0) {
            field_a = (String) null;
          }
          param0.field_c = var5;
          param0.field_a = var5.field_a;
          param0.field_a.field_c = param0;
          param0.field_b = param2;
          param0.field_c.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "nga.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final IntrusiveNode a(byte param0) {
        int fieldTemp$0 = 0;
        IntrusiveNode var2;
        int var3;
        IntrusiveNode var4;
        var3 = VoidHunters.field_G;
        if (0 < this.field_d &&
          this.field_h[-1 + this.field_d] != this.field_g) {
          var2 = this.field_g;
          this.field_g = var2.field_c;
          return var2;
        }
        do {
          if (this.field_f <= this.field_d) {
            if (param0 == 44) {
              return null;
            }
            this.a((IntrusiveNode) null, 116, -5L);
            return null;
          }
          fieldTemp$0 = this.field_d;
          this.field_d = this.field_d + 1;
          var4 = this.field_h[fieldTemp$0].field_c;
          var2 = var4;
        } while (var4 == this.field_h[this.field_d - 1]);
        this.field_g = var2.field_c;
        return var2;
    }

    final IntrusiveNode a(int param0) {
        int var2 = 110 / ((47 - param0) / 40);
        this.field_d = 0;
        return this.a((byte) 44);
    }

    final void b(int param0) {
        int var2 = 0;
        IntrusiveNode var3 = null;
        IntrusiveNode var4 = null;
        int var5 = VoidHunters.field_G;
        for (var2 = param0; var2 < this.field_f; var2++) {
          var3 = this.field_h[var2];
          while (true) {
            var4 = var3.field_c;
            if (var3 == var4) {
              break;
            }
            var4.b(-3846);
          }
        }
        this.field_b = null;
        this.field_g = null;
    }

    public static void b(byte param0) {
        field_e = null;
        field_c = null;
        if (param0 != -126) {
          return;
        }
        field_a = null;
    }

    nga(int param0) {
        int var2 = 0;
        IntrusiveNode dupTemp$0 = null;
        IntrusiveNode var3 = null;
        this.field_d = 0;
        this.field_f = param0;
        this.field_h = new IntrusiveNode[param0];
        for (var2 = 0; var2 < param0; var2++) {
          dupTemp$0 = new IntrusiveNode();
          var3 = dupTemp$0;
          this.field_h[var2] = dupTemp$0;
          var3.field_a = var3;
          var3.field_c = var3;
        }
    }

    static {
        field_a = "Show players in <%0>'s game";
        field_c = "Checking";
    }
}
