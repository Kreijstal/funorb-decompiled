/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class NodeHashTableIterator implements Iterator {
    private IterableNodeHashTable field_e;
    static String[] leaderboardSortStatusLabels;
    private IntrusiveNode field_b;
    static int field_d;
    private int field_f;
    static String suggestedNamesText;
    private IntrusiveNode field_g;

    public final Object next() {
        int fieldTemp$0 = 0;
        int var2;
        IntrusiveNode var3;
        IntrusiveNode var4;
        var2 = Sumoblitz.field_L ? 1 : 0;
        if (this.field_b != this.field_e.field_c[this.field_f - 1]) {
          var4 = this.field_b;
          this.field_b = var4.next;
          this.field_g = var4;
          return var4;
        }
        do {
          if (this.field_f >= this.field_e.field_d) {
            return null;
          }
          fieldTemp$0 = this.field_f;
          this.field_f = this.field_f + 1;
          var3 = this.field_e.field_c[fieldTemp$0].next;
        } while (var3 == this.field_e.field_c[this.field_f - 1]);
        this.field_g = var3;
        this.field_b = var3.next;
        return var3;
    }

    public final void remove() {
        if (null == this.field_g) {
          throw new IllegalStateException();
        }
        this.field_g.unlink(false);
        this.field_g = null;
    }

    public final boolean hasNext() {
        int fieldTemp$0 = 0;
        int var2;
        var2 = Sumoblitz.field_L ? 1 : 0;
        if (this.field_e.field_c[-1 + this.field_f] != this.field_b) {
          return true;
        }
        while (this.field_e.field_d > this.field_f) {
          fieldTemp$0 = this.field_f;
          this.field_f = this.field_f + 1;
          if (this.field_e.field_c[fieldTemp$0].next != this.field_e.field_c[-1 + this.field_f]) {
            this.field_b = this.field_e.field_c[this.field_f - 1].next;
            return true;
          }
          this.field_b = this.field_e.field_c[-1 + this.field_f];
        }
        return false;
    }

    public static void releaseStatics(int param0) {
        leaderboardSortStatusLabels = null;
        suggestedNamesText = null;
        if (param0 == 1) {
          return;
        }
        field_d = -74;
    }

    private final void reset(int param0) {
        this.field_f = 1;
        this.field_b = this.field_e.field_c[0].next;
        if (param0 > 4) {
          this.field_g = null;
          return;
        }
        this.reset(34);
        this.field_g = null;
    }

    NodeHashTableIterator(IterableNodeHashTable param0) {
        this.field_g = null;
        try {
          this.field_e = param0;
          this.reset(8);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ia.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, byte param1) {
        int var2 = ps.field_e[param0];
        if (param1 != -82) {
          suggestedNamesText = (String) null;
          so.a(var2, (byte) -127);
          return;
        }
        so.a(var2, (byte) -127);
    }

    static {
        suggestedNamesText = "Suggested names: ";
        leaderboardSortStatusLabels = new String[]{"Showing by rating", "Showing by win percentage"};
    }
}
