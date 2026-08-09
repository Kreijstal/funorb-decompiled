/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class sj {
    static int field_c;
    static ko field_d;
    int field_e;
    int field_a;
    static java.util.zip.CRC32 field_b;
    static int field_f;

    final static tl a(int param0, String param1, byte param2) {
        wf var3 = null;
        RuntimeException var3_ref = null;
        db var4 = null;
        wf stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 > 101) {
                break L1;
              } else {
                var4 = (db) null;
                sj.a(42, -122, (db) null, 40);
                break L1;
              }
            }
            var3 = new wf();
            ((tl) ((Object) var3)).field_d = param0;
            ((tl) ((Object) var3)).field_c = param1;
            stackIn_3_0 = (wf) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("sj.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return (tl) ((Object) stackIn_3_0);
    }

    final static void a(dl param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, byte param8) {
        try {
            wn.field_c = param4;
            a.field_c = param0;
            if (param8 < 108) {
                sj.a(5);
            }
            o.field_f = param7;
            field_f = param3;
            kl.field_U = param1;
            sc.field_h = param5;
            fk.field_u = param6;
            km.field_e = param2;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "sj.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static dl a(int param0, int param1, db param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        dl stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = 13 % ((-38 - param3) / 55);
            if (gm.a(param2, param0, true, param1)) {
              stackIn_4_0 = tn.b(true);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("sj.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (dl) ((Object) stackIn_2_0);
        } else {
          return stackIn_4_0;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    sj(int param0, int param1, int param2, int param3) {
        this.field_a = param3;
        this.field_e = param0;
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        if (param0 != 21732) {
            db var2 = (db) null;
            sj.a(-71, -36, (db) null, -87);
        }
    }

    static {
        field_b = new java.util.zip.CRC32();
    }
}
