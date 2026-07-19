/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ek implements Iterable {
    int field_d;
    static String field_c;
    static int[] field_e;
    static boolean[] field_a;
    private ca field_f;
    ca[] field_b;

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (!((param0 & param1) == 0)) {
            var2 = -(param0 & 7) + 8;
        }
        int var3 = param0 - -var2;
        return var3;
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new pl((ek) (this)));
    }

    final static void c(int param0) {
        int discarded$6 = 0;
        int discarded$7 = 0;
        int discarded$8 = 0;
        pc.field_Z = false;
        if (param0 <= 110) {
          discarded$6 = ek.a(28, 69);
          discarded$7 = cd.field_t.b((byte) 90);
          return;
        } else {
          discarded$8 = cd.field_t.b((byte) 90);
          return;
        }
    }

    public static void b(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != -1) {
            field_e = (int[]) null;
            field_e = null;
            return;
        }
        field_e = null;
    }

    final void a(ca param0, int param1, long param2) {
        ca var5 = null;
        try {
            if (null != param0.field_c) {
                param0.b(57);
            }
            var5 = this.field_b[(int)((long)(-1 + this.field_d) & param2)];
            param0.field_c = var5.field_c;
            if (param1 >= -122) {
                field_e = (int[]) null;
            }
            param0.field_e = var5;
            param0.field_c.field_e = param0;
            param0.field_e.field_c = param0;
            param0.field_d = param2;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "ek.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final ca a(long param0, int param1) {
        ca var4 = null;
        ca var5 = null;
        int var6 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackOut_3_0 = null;
        var6 = OrbDefence.field_D ? 1 : 0;
        var4 = this.field_b[(int)((long)(param1 + this.field_d) & param0)];
        this.field_f = var4.field_e;
        L0: while (true) {
          if (this.field_f != var4) {
            stackOut_3_0 = this;
            stackIn_5_0 = stackOut_3_0;
            stackIn_4_0 = stackOut_3_0;
            if (var6 == 0) {
              if (((ek) (this)).field_f.field_d == param0) {
                var5 = this.field_f;
                this.field_f = this.field_f.field_e;
                return var5;
              } else {
                this.field_f = this.field_f.field_e;
                continue L0;
              }
            } else {
              ((ek) (this)).field_f = null;
              return null;
            }
          } else {
            this.field_f = null;
            return null;
          }
        }
    }

    private ek() throws Throwable {
        throw new Error();
    }

    final static void a(int param0) {
        if (param0 > -58) {
            ek.c(126);
        }
    }

    static {
        field_c = "Unpacking graphics";
        field_e = new int[9];
        field_a = new boolean[112];
    }
}
