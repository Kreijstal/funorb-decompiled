/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class IterableNodeHashTable implements Iterable {
    static int field_e;
    static int[] field_h;
    static String field_c;
    static int field_b;
    static String field_i;
    static java.awt.Image field_a;
    private IntrusiveNode field_j;
    int field_d;
    static String[] field_g;
    IntrusiveNode[] field_f;

    public static void a(int param0) {
        field_a = null;
        field_h = null;
        field_g = null;
        field_i = null;
        if (param0 != -1215) {
          IterableNodeHashTable.b(57);
          field_c = null;
          return;
        }
        field_c = null;
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new NodeHashTableIterator(this));
    }

    final static void b(int param0) {
        ai.a(true, -1, ae.field_g, aa.field_G);
        if (param0 > -28) {
          byte[] var2 = (byte[]) null;
          IterableNodeHashTable.a((byte[]) null, -113);
          jh.field_D = true;
          return;
        }
        jh.field_D = true;
    }

    final static String a(byte[] param0, int param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 17746) {
            field_a = (java.awt.Image) null;
          }
          stackIn_3_0 = StellarBombEvent.a(param0, param0.length, 0, param1 - 17864);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("rm.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final IntrusiveNode get(int param0, long param1) {
        IntrusiveNode var4;
        IntrusiveNode var5;
        int var6;
        IntrusiveNode var4Lifetime1;
        IntrusiveNode var5Lifetime1;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 < -72) {
          var4 = this.field_f[(int)((long)(this.field_d - 1) & param1)];
          this.field_j = var4.next;
          while (true) {
            if (this.field_j == var4) {
              this.field_j = null;
              return null;
            }
            if (~this.field_j.key != ~param1) {
              this.field_j = this.field_j.next;
              continue;
            }
            break;
          }
          var5 = this.field_j;
          this.field_j = this.field_j.next;
          return var5;
        }
        this.put((IntrusiveNode) null, true, 61L);
        var4Lifetime1 = this.field_f[(int)((long)(this.field_d - 1) & param1)];
        this.field_j = var4Lifetime1.next;
        while (true) {
          if (this.field_j == var4Lifetime1) {
            this.field_j = null;
            return null;
          }
          if (~this.field_j.key != ~param1) {
            this.field_j = this.field_j.next;
            continue;
          }
          break;
        }
        var5Lifetime1 = this.field_j;
        this.field_j = this.field_j.next;
        return var5Lifetime1;
    }

    final void put(IntrusiveNode param0, boolean param1, long param2) {
        IntrusiveNode var5 = null;
        try {
          if (param0.previous != null) {
            param0.unlink((byte) -58);
          }
          if (!param1) {
            this.field_f = (IntrusiveNode[]) null;
          }
          var5 = this.field_f[(int)((long)(-1 + this.field_d) & param2)];
          param0.next = var5;
          param0.previous = var5.previous;
          param0.previous.next = param0;
          param0.next.previous = param0;
          param0.key = param2;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "rm.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    IterableNodeHashTable(int param0) {
        int var2 = 0;
        IntrusiveNode dupTemp$0 = null;
        IntrusiveNode var3 = null;
        this.field_d = param0;
        this.field_f = new IntrusiveNode[param0];
        for (var2 = 0; var2 < param0; var2++) {
          dupTemp$0 = new IntrusiveNode();
          var3 = dupTemp$0;
          this.field_f[var2] = dupTemp$0;
          var3.next = var3;
          var3.previous = var3;
        }
    }

    final static Archive a(int param0, boolean param1, boolean param2, boolean param3, boolean param4) {
        if (!param3) {
          field_c = (String) null;
          return PasswordValidator.a(!param2 ? 0 : 1, false, param0, 12000, param1, param4);
        }
        return PasswordValidator.a(!param2 ? 0 : 1, false, param0, 12000, param1, param4);
    }

    static {
        field_c = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_h = new int[]{2, 21, 22, 7, 6, 10};
        field_i = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_e = -1;
    }
}
