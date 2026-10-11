/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class kj {
    static dl[] field_a;
    static int field_b;
    static String field_c;

    public static void a(int param0) {
        if (param0 >= -90) {
          kj.a(29);
        }
        field_a = null;
        field_c = null;
    }

    final static void a(byte param0) {
        bp.field_b = null;
        m.field_l = null;
        pd.field_g = null;
        r.field_i = null;
        ib.field_l = null;
        fo.field_m = null;
        if (param0 <= 16) {
          return;
        }
        ma.field_n = null;
        vm.field_j = null;
    }

    final static void a(uf param0, byte param1) {
        int dupTemp$3 = 0;
        int dupTemp$0 = 0;
        int var3 = 0;
        int incrementValue$2 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        var5 = CrazyCrystals.field_B;
        try {
          if (param1 <= 3) {
            return;
          }
          for (var2_int = 0; var2_int < 3; var2_int++) {
            cl.field_j[var2_int] = 0;
          }
          for (var2_intLifetime1 = 0; jl.field_d > var2_intLifetime1; var2_intLifetime1++) {
            if (ol.field_D[var2_intLifetime1].field_f == param0.field_f) {
              dupTemp$3 = ol.field_D[var2_intLifetime1].a(true);
              cl.field_j[dupTemp$3] = cl.field_j[dupTemp$3] + 1;
            }
          }
          dupTemp$0 = param0.a(true);
          cl.field_j[dupTemp$0] = cl.field_j[dupTemp$0] + 1;
          var2_intLifetime2 = 0;
          for (var3 = 0; jl.field_d > var3; var3++) {
            boolean decompiledFrameRemainder0 = true;
            if (param0.field_f == ol.field_D[var3].field_f) {
              var4 = ol.field_D[var3].a(true);
              if (cj.field_A < cl.field_j[var4]) {
                cl.field_j[var4] = cl.field_j[var4] - 1;
                decompiledFrameRemainder0 = false;
              }
            }
            if (decompiledFrameRemainder0) {
              incrementValue$2 = var2_intLifetime2;
              var2_intLifetime2++;
              ol.field_D[incrementValue$2] = ol.field_D[var3];
            }
          }
          jl.field_d = var2_intLifetime2;
          fieldTemp$1 = jl.field_d;
          jl.field_d = jl.field_d + 1;
          ol.field_D[fieldTemp$1] = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("kj.C(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_c = "Connection restored.";
        field_a = new dl[4];
    }
}
