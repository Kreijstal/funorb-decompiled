/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ee {
    static int field_a;

    final static void a(int param0) {
        if (param0 < 12) {
          ee.a(-95, true);
        }
        od.field_v.field_i = 0;
        od.field_v.field_g = 0;
    }

    final static fd a(String param0, byte param1) {
        String var2 = null;
        fd var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        fd stackIn_17_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = stellarshard.field_B;
        try {
          if (ac.field_n == null) {
            return null;
          }
          var6 = (CharSequence) ((Object) param0);
          var2 = nh.a(var6, false);
          if (param1 != -98) {
            field_a = 46;
          }
          if (var2 == null) {
            var2 = param0;
          }
          var3 = (fd) (ac.field_n.a((long)var2.hashCode(), param1 - 18));
          while (var3 != null) {
            var7 = (CharSequence) ((Object) var3.field_rb);
            var4 = nh.a(var7, false);
            if (var4 == null) {
              var4 = var3.field_rb;
            }
            if (var4.equals(var2)) {
              stackIn_17_0 = var3;
              return stackIn_17_0;
            }
            var3 = (fd) (ac.field_n.a(true));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_22_0 = var2_ref;
          stackIn_22_1 = new StringBuilder().append("ee.C(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized static byte[] a(int param0, boolean param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int var2 = 0;
        int dupTemp$3 = 0;
        byte[][] arrayValue$4 = null;
        byte[] var2_ref_byte__;
        byte[] var3;
        byte[] var2_ref_byte__Lifetime1;
        byte[] var2_ref_byte__Lifetime2;
        if (!param1) {
          field_a = 3;
        }
        if (100 == param0 &&
          db.field_g > 0) {
          fieldTemp$0 = db.field_g - 1;
          db.field_g = db.field_g - 1;
          var2_ref_byte__ = ck.field_ib[fieldTemp$0];
          ck.field_ib[db.field_g] = null;
          return var2_ref_byte__;
        }
        if (param0 == 5000 &&
          ja.field_q > 0) {
          fieldTemp$1 = ja.field_q - 1;
          ja.field_q = ja.field_q - 1;
          var2_ref_byte__Lifetime1 = ei.field_H[fieldTemp$1];
          ei.field_H[ja.field_q] = null;
          return var2_ref_byte__Lifetime1;
        }
        if (param0 == 30000 &&
          u.field_p > 0) {
          fieldTemp$2 = u.field_p - 1;
          u.field_p = u.field_p - 1;
          var2_ref_byte__Lifetime2 = mh.field_j[fieldTemp$2];
          mh.field_j[u.field_p] = null;
          return var2_ref_byte__Lifetime2;
        }
        if (qf.field_i != null) {
          for (var2 = 0; var2 < ol.field_a.length; var2++) {
            if (ol.field_a[var2] == param0 &&
              tc.field_s[var2] > 0) {
              dupTemp$3 = tc.field_s[var2] - 1;
              arrayValue$4 = qf.field_i[var2];
              tc.field_s[var2] = dupTemp$3;
              var3 = arrayValue$4[dupTemp$3];
              qf.field_i[var2][tc.field_s[var2]] = null;
              return var3;
            }
          }
        }
        return new byte[param0];
    }

    final static boolean b(int param0) {
        int var1;
        boolean stackIn_7_0 = false;
        boolean decompiledFrameRemainder0 = true;
        var1 = -125 / ((-2 - param0) / 47);
        if (rk.field_f >= 20 &&
          vj.a(25424) && (!(ag.field_c > 0) ||
          fa.a(-54))) {
          stackIn_7_0 = false;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_7_0 = true;
        }
        return stackIn_7_0;
    }

    final static af a(int param0, int param1, byte param2, int param3) {
        af var4 = new af();
        var4.field_p = param1;
        var4.field_s = new int[param3];
        if (param2 >= -108) {
          field_a = 106;
        }
        pf.field_b.b(-53, var4);
        kg.a(param0, var4, false);
        return var4;
    }

    final static li a(int param0, byte param1) {
        int var3 = 0;
        li[] var2;
        int var4;
        li[] var5;
        var4 = stellarshard.field_B;
        var5 = lc.e((byte) 33);
        var2 = var5;
        if (param1 != 8) {
          field_a = -93;
        }
        for (var3 = 0; var3 < var5.length; var3++) {
          if (param0 == var5[var3].field_e) {
            return var5[var3];
          }
        }
        return null;
    }

    static {
        field_a = -1;
    }
}
