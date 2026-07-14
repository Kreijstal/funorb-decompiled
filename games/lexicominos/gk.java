/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gk {
    static volatile int field_b;
    static String field_c;
    static int field_e;
    private java.util.zip.Inflater field_d;
    static int[][] field_f;
    static sh field_a;

    public static void b(int param0) {
        field_a = null;
        if (param0 != 11) {
            return;
        }
        field_f = null;
        field_c = null;
    }

    final void a(int param0, byte[] param1, wf param2) {
        try {
            if (param0 != 8) {
                gk.a(-58);
            }
            if ((param2.field_j[param2.field_h] ^ -1) == -32) {
                // if_icmpne L61
            } else {
                throw new RuntimeException("");
            }
            if (((gk) this).field_d == null) {
                ((gk) this).field_d = new java.util.zip.Inflater(true);
            }
            try {
                ((gk) this).field_d.setInput(param2.field_j, param2.field_h + 10, param2.field_j.length + -param2.field_h + -10 + -8);
                int discarded$0 = ((gk) this).field_d.inflate(param1);
            } catch (Exception exception) {
                ((gk) this).field_d.reset();
                throw new RuntimeException("");
            }
            ((gk) this).field_d.reset();
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(int param0, int param1, byte param2) {
        int var3 = 0;
        if (param2 != 71) {
          field_c = null;
          var3 = -1 + param1 & param0 >> 887128191;
          return ((param0 >>> 1852482975) + param0) % param1 + var3;
        } else {
          var3 = -1 + param1 & param0 >> 887128191;
          return ((param0 >>> 1852482975) + param0) % param1 + var3;
        }
    }

    public gk() {
        this(-1, 1000000, 1000000);
    }

    final static void a(int param0) {
        mg.field_x = null;
        rg.field_c = null;
        ci.field_b = null;
        be.field_f = null;
        bd.field_m = null;
        if (param0 != 12428) {
          gk.b(-80);
          pb.field_h = null;
          return;
        } else {
          pb.field_h = null;
          return;
        }
    }

    private gk(int param0, int param1, int param2) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 64;
        field_b = 0;
        field_f = new int[][]{new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10]};
    }
}
