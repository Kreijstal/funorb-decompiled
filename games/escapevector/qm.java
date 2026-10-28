/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qm implements Iterable {
    private IntrusiveNode field_e;
    static gi[] field_d;
    static int field_c;
    int field_g;
    static String[] field_f;
    IntrusiveNode[] field_b;
    static String field_a;

    final IntrusiveNode a(int param0, long param1) {
        int var6 = EscapeVector.obfuscationControl;
        if (param0 != -2678) {
          this.field_g = -103;
        }
        IntrusiveNode var4 = this.field_b[(int)((long)(-1 + this.field_g) & param1)];
        this.field_e = var4.next;
        while (var4 != this.field_e) {
          if (~param1 == ~this.field_e.key) {
            IntrusiveNode var5 = this.field_e;
            this.field_e = this.field_e.next;
            return var5;
          }
          this.field_e = this.field_e.next;
        }
        this.field_e = null;
        return null;
    }

    final static int a(dk[] param0, byte param1) {
        String stackIn_18_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          int var2_int = 2147483647;
          dk[] var3 = param0;
          for (int var4 = 0; var4 < var3.length; var4++) {
            dk var5 = var3[var4];
            if (var5.field_f < var2_int) {
              var2_int = var5.field_f;
            }
          }
          if (param1 <= 9) {
            dk[] var7 = (dk[]) null;
            qm.a((dk[]) null, (byte) 66);
          }
          if (var2_int != 2147483647) {
            int stackIn_14_0 = var2_int;
            return stackIn_14_0;
          }
          int stackIn_12_0 = 0;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_17_0 = var2;
          StringBuilder stackIn_17_1 = new StringBuilder().append("qm.A(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new hb(this));
    }

    final void a(long param0, byte param1, IntrusiveNode param2) {
        if (param2.previous != null) {
          param2.unlink((byte) -51);
        }
        if (param1 != -106) {
          return;
        }
        try {
          IntrusiveNode var5 = this.field_b[(int)(param0 & (long)(-1 + this.field_g))];
          param2.previous = var5.previous;
          param2.next = var5;
          param2.previous.next = param2;
          param2.next.previous = param2;
          param2.key = param0;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "qm.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(byte guard) {
        field_d = null;
        field_a = null;
        field_f = null;
        if (guard < 86) {
          field_d = (gi[]) null;
        }
    }

    private qm() throws Throwable {
        throw new Error();
    }

    static {
        field_c = 64;
        field_a = "Age:";
    }
}
