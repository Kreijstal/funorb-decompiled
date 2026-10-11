/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj {
    static int field_d;
    static int field_a;
    static String[] field_c;
    static int field_b;

    final synchronized static byte[] a(int param0, int param1) {
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int var2 = 0;
        int dupTemp$6 = 0;
        byte[][] arrayValue$7 = null;
        byte[] var2_ref_byte__;
        byte[] var3;
        byte[] var2_ref_byte__Lifetime1;
        byte[] var2_ref_byte__Lifetime2;
        if (param0 != 0) {
          field_a = 96;
        }
        if (param1 == 100 &&
          fd.field_r > 0) {
          fieldTemp$3 = fd.field_r - 1;
          fd.field_r = fd.field_r - 1;
          var2_ref_byte__ = wa.field_a[fieldTemp$3];
          wa.field_a[fd.field_r] = null;
          return var2_ref_byte__;
        }
        if (param1 == 5000 &&
          ak.field_r > 0) {
          fieldTemp$4 = ak.field_r - 1;
          ak.field_r = ak.field_r - 1;
          var2_ref_byte__Lifetime1 = hk.field_f[fieldTemp$4];
          hk.field_f[ak.field_r] = null;
          return var2_ref_byte__Lifetime1;
        }
        if (param1 == 30000 &&
          0 < jg.field_lb) {
          fieldTemp$5 = jg.field_lb - 1;
          jg.field_lb = jg.field_lb - 1;
          var2_ref_byte__Lifetime2 = bl.field_k[fieldTemp$5];
          bl.field_k[jg.field_lb] = null;
          return var2_ref_byte__Lifetime2;
        }
        if (me.field_g != null) {
          for (var2 = 0; var2 < tf.field_c.length; var2++) {
            if (tf.field_c[var2] == param1 &&
              me.field_i[var2] > 0) {
              dupTemp$6 = me.field_i[var2] - 1;
              arrayValue$7 = me.field_g[var2];
              me.field_i[var2] = dupTemp$6;
              var3 = arrayValue$7[dupTemp$6];
              me.field_g[var2][me.field_i[var2]] = null;
              return var3;
            }
          }
        }
        return new byte[param1];
    }

    final static int a(boolean param0, int param1, String param2, String param3, boolean param4, int param5, String param6) {
        aj var7 = null;
        RuntimeException var7_ref = null;
        aj var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param4) {
            nj.a(-90, 124);
          }
          var7 = new aj(param3);
          var8 = new aj(param6);
          stackIn_3_0 = qh.a(param5, var8, -1, param0, var7, param1, param2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_6_0 = var7_ref;
          stackIn_6_1 = new StringBuilder().append("nj.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != -151) {
          field_c = (String[]) null;
        }
        field_c = null;
    }

    final static void a(int param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var6Lifetime1;
        int var7Lifetime1;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (uj.field_i < 0) {
          return;
        }
        var3 = param1 - 135;
        var4 = -35 + param2;
        var5 = 256;
        if (uj.field_i < 75) {
          var5 = (uj.field_i << 8) / 75;
        }
        if (param0 != -21639) {
          field_c = (String[]) null;
        }
        if (uj.field_i > 200) {
          var5 = (-uj.field_i + 250 << 8) / 50;
        }
        mc.a(-8497, rj.field_H);
        ig.b();
        ge.d();
        ec.b(-128);
        if (var5 < 256) {
          ge.c(0, 0, ge.field_h, ge.field_g, 0, 256 - var5);
        }
        tj.b(653);
        if (uj.field_i >= 150) {
          ki.field_H.b(15 + var3, var4 + 10, var5);
        } else {
          rj.field_H.e(var3, var4);
        }
        var6 = uj.field_i - 125;
        if (var6 > 0 &&
          50 > var6) {
          if (var6 < 20) {
            var7 = var6 * 256 / 20;
            ca.field_f.c(var3, var4, var7);
          } else {
            if (var6 < 30) {
              ca.field_f.c(var3, var4, 256);
            } else {
              var7 = (50 - var6) * 256 / 20;
              ca.field_f.c(var3, var4, var7);
            }
          }
        }
        var6Lifetime1 = -140 + uj.field_i;
        if (0 < var6Lifetime1) {
          var7Lifetime1 = 256;
          if (var6Lifetime1 < 20) {
            var7Lifetime1 = 256 * var6Lifetime1 / 20;
          }
          dj.field_b.b(var3 + 15, 10 + var4, var5 * var7Lifetime1 >> 8);
        }
        return;
    }

    static {
        field_c = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_a = -1;
    }
}
