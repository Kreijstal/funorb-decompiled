/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh {
    static String[] field_b;
    static String field_a;
    static String field_d;
    static String field_e;
    static String field_c;

    final static void a(int param0, int param1) {
        if (bd.field_Q != null &&
          null != i.field_k[param1]) {
          lc.field_d = i.field_k[param1];
          gn.a(false, i.field_k[param1], (byte) 69, 30);
        } else {
          if (ab.field_jb == -1) {
            bi.field_e = 2;
            ab.field_jb = param1;
          }
        }
        if (param0 != 0) {
          field_a = (String) null;
        }
    }

    final static boolean a(byte param0, ei param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        ei var4 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = HoldTheLine.field_D;
        try {
          if (param0 != -63) {
            var4 = (ei) null;
            qh.a((byte) -114, (ei) null);
          }
          var2_int = 0;
          while (true) {
            if (var2_int >= param1.field_e) {
              return false;
            }
            if (((vj) (param1.field_b[var2_int])).field_q) {
              var2_int++;
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("qh.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_a = null;
        if (param0 != 30) {
          return;
        }
        field_d = null;
        field_c = null;
        field_e = null;
        field_b = null;
    }

    final static fg a(int param0) {
        if (param0 < 80) {
          qh.a(67);
        }
        return pk.field_H;
    }

    final static boolean c(int param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        boolean stackIn_8_0 = false;
        Throwable decompiledCaughtException = null;
        var1_ref = tf.field_n;
        synchronized (var1_ref) {
          if (qd.field_i == vj.field_l) {
            return false;
          }
          aa.field_n = p.field_a[vj.field_l];
          pk.field_M = d.field_b[vj.field_l];
          if (param0 >= -23) {
            return false;
          }
          vj.field_l = 127 & 1 + vj.field_l;
          stackIn_8_0 = true;
        }
        return stackIn_8_0;
    }

    static {
        field_a = "Touring Car";
        field_d = null;
        field_e = "Leaderboard";
        field_c = "Log in";
    }
}
