/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wf extends uf {
    static int field_q;
    mf[] field_j;
    int field_p;
    int field_i;
    static int field_l;
    static boolean field_h;
    static int field_n;
    mf[] field_s;
    int[] field_r;
    int[] field_k;
    int[] field_m;
    byte[][][] field_o;
    static int field_t;

    final static int a(String param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Terraphoenix.field_V;
        try {
          if (!param1) {
            stackIn_3_0 = -51;
            return stackIn_3_0;
          }
          for (var2_int = 0; ph.field_n.length > var2_int; var2_int++) {
            if (param0.equals(ph.field_n[var2_int])) {
              stackIn_9_0 = var2_int;
              return stackIn_9_0;
            }
          }
          stackIn_12_0 = 0;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("wf.B(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void c(int param0) {
        dg.field_d = false;
        ia.field_r = null;
        kj.field_c = null;
        if (param0 != 25501) {
          return;
        }
        ec.field_d = null;
        km.field_c = null;
    }

    final static boolean a(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 31996) {
          wf.a(-109);
        }
        stackIn_6_0 = (q.field_Jb >= 10) && (uh.field_H >= 13);
        return stackIn_6_0;
    }

    wf() {
    }

    final static oa a(int param0, String param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        oa stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Terraphoenix.field_V;
        try {
          var2_int = param1.length();
          for (var3 = param0; var3 < var2_int; var3++) {
            var4 = param1.charAt(var3);
            if (48 > var4) {
              return null;
            }
            if (var4 > 57) {
              return null;
            }
          }
          stackIn_10_0 = ge.field_a;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("wf.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
        field_n = -1;
        field_t = -1;
    }
}
