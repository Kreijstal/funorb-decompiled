/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bl extends gg {
    int field_h;
    static String field_m;
    static boolean field_p;
    static int field_i;
    int field_q;
    int field_l;
    int field_n;
    int field_j;
    int field_o;
    static int field_k;

    public static void a(int param0) {
        field_m = null;
        if (param0 != 0) {
          bl.a((byte) 16);
        }
    }

    final static od a(od param0, int[] param1, byte param2) {
        od var3 = null;
        RuntimeException var3_ref = null;
        int[] var4 = null;
        od stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 100) {
            var4 = (int[]) null;
            bl.a((od) null, (int[]) null, (byte) -77);
          }
          var3 = new od(0, 0, 0);
          var3.field_m = param1;
          var3.field_b = param0.field_b;
          var3.field_a = param0.field_a;
          var3.field_i = param0.field_i;
          var3.field_n = param0.field_n;
          var3.field_d = param0.field_d;
          var3.field_l = param0.field_l;
          var3.field_j = param0.field_j;
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("bl.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean a(byte param0) {
        if (param0 != -81) {
          bl.a((byte) -9);
          if (kj.field_R < 20) {
            return true;
          }
          if (!bb.h(param0 - 44)) {
            return true;
          }
          if (c.field_H <= 0) {
            return false;
          }
          if (!rd.b(6144)) {
            return true;
          }
          return false;
        }
        if (kj.field_R < 20) {
          return true;
        }
        if (!bb.h(param0 - 44)) {
          return true;
        }
        if (c.field_H <= 0) {
          return false;
        }
        if (!rd.b(6144)) {
          return true;
        }
        return false;
    }

    final static od[] b(boolean param0) {
        int var2 = 0;
        int var3 = SolKnight.field_L ? 1 : 0;
        od[] var1 = new od[nb.field_c];
        int var2Lifetime1;
        if (!param0) {
          for (var2 = 0; nb.field_c > var2; var2++) {
            var1[var2] = new od(kl.field_a, we.field_e, ph.field_h[var2], qf.field_d[var2], sa.field_l[var2], uj.field_b[var2], jc.field_c[var2], ig.field_H);
          }
          og.a((byte) -97);
          return var1;
        }
        bl.b(false);
        for (var2Lifetime1 = 0; nb.field_c > var2Lifetime1; var2Lifetime1++) {
          var1[var2Lifetime1] = new od(kl.field_a, we.field_e, ph.field_h[var2Lifetime1], qf.field_d[var2Lifetime1], sa.field_l[var2Lifetime1], uj.field_b[var2Lifetime1], jc.field_c[var2Lifetime1], ig.field_H);
        }
        og.a((byte) -97);
        return var1;
    }

    bl(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_q = param2;
        this.field_j = param1;
        this.field_h = param3;
        this.field_n = param0;
        this.field_l = param5;
        this.field_o = param4;
    }

    static {
        field_p = false;
        field_m = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
    }
}
