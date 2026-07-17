/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ep extends le {
    byte[] field_j;
    static volatile int field_m;
    static java.util.zip.CRC32 field_h;
    static bp field_l;
    static int field_i;
    int field_k;

    final static void c() {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = ZombieDawn.field_J;
        try {
          L0: {
            wo.field_yb.a(true);
            var1_int = 0;
            L1: while (true) {
              if (var1_int >= 32) {
                break L0;
              } else {
                ji.field_c[var1_int] = 0L;
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var1, "ep.C(" + -50 + 41);
        }
    }

    final static void a(int param0, int param1) {
        pk.field_N = param1;
        b.field_l = param0;
        if (null != wo.field_xb) {
            wo.field_xb.b(param0, false, param1);
        }
    }

    public static void a() {
        field_h = null;
        field_l = null;
    }

    private ep() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = 0;
        field_h = new java.util.zip.CRC32();
    }
}
