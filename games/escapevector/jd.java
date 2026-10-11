/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd {
    static String field_b;
    static String field_c;
    static cn field_a;

    final static void a(byte param0) {
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_57_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        oh var5_ref_oh = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        oh var5_ref_ohLifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        var11 = EscapeVector.field_A;
        try {
          if (!eh.field_k) {
            if (null != mm.field_b) {
              mm.field_b.g(256);
              vi.field_d.g(256);
              mm.field_b = null;
              vi.field_d = null;
            }
            return;
          }
          var1_int = 0;
          var2 = 0;
          var3 = 0;
          if (param0 != -54) {
            jd.a(15, false);
          }
          var5_ref_oh = (oh) (wa.field_c.a(false));
          while (var5_ref_oh != null) {
            stackIn_12_0 = var5_ref_oh.field_o;
            stackIn_12_1 = 100;
            if (stackIn_12_0 >= stackIn_12_1 &&
              var5_ref_oh.field_q >= 0 &&
              var5_ref_oh.field_q < 480) {
              var6 = 640 * var5_ref_oh.field_q;
              var7 = var5_ref_oh.field_i;
              if (var5_ref_oh.field_m < 0) {
                var7 = var7 - var5_ref_oh.field_s;
              }
              var8 = var7 + var5_ref_oh.field_s;
              for (var9 = var7; var9 < var8; var9 += 6) {
                if (var9 >= 0 &&
                  640 > var9 &&
                  em.field_i[var6 + var9] == 6324320) {
                  var10 = 256 * var9 / 640;
                  var1_int = var1_int + (-var10 + 256);
                  var2 = var2 + var10;
                }
              }
            }
            var5_ref_oh = (oh) (wa.field_c.b((byte) 70));
          }
          var4 = 0;
          var5_ref_ohLifetime1 = (oh) (si.field_u.a(false));
          while (var5_ref_ohLifetime1 != null) {
            if (var5_ref_ohLifetime1.field_i >= 0 &&
              var5_ref_ohLifetime1.field_i < 640) {
              var6Lifetime1 = var5_ref_ohLifetime1.field_q;
              if (0 > var5_ref_ohLifetime1.field_m) {
                var6Lifetime1 = var6Lifetime1 - var5_ref_ohLifetime1.field_s;
              }
              var7Lifetime1 = var6Lifetime1 + var5_ref_ohLifetime1.field_s;
              for (var8Lifetime1 = var6Lifetime1; var8Lifetime1 < var7Lifetime1; var8Lifetime1 += 6) {
                if (var8Lifetime1 >= 0 &&
                  var8Lifetime1 < 480 &&
                  6324320 == em.field_i[var8Lifetime1 * 640 + var5_ref_ohLifetime1.field_i]) {
                  var9Lifetime1 = 256 * var5_ref_ohLifetime1.field_i / 640;
                  var3 = var3 + (-var9Lifetime1 + 256);
                  var4 = var4 + var9Lifetime1;
                }
              }
            }
            var5_ref_ohLifetime1 = (oh) (si.field_u.b((byte) 70));
          }
          var5 = (int)Math.sqrt((double)((var1_int + var2) * 8));
          if (var2 + var1_int == 0) {
            stackIn_54_0 = 8192;
          } else {
            stackIn_54_0 = var2 * 16384 / (var1_int + var2);
          }
          var6Lifetime2 = stackIn_54_0;
          var7Lifetime2 = var4 + var3 >> 8;
          if (var4 + var3 != 0) {
            stackIn_57_0 = 16384 * var4 / (var4 + var3);
          } else {
            stackIn_57_0 = 8192;
          }
          var8Lifetime2 = stackIn_57_0;
          if (mm.field_b == null) {
            mm.field_b = hl.c(ob.field_d, 100, 0, var6Lifetime2);
            vi.field_d = hl.c(pa.field_b, 100, 0, var8Lifetime2);
            mm.field_b.h(-1);
            vi.field_d.h(-1);
            rk.field_e.a(mm.field_b);
            rk.field_e.a(vi.field_d);
          }
          mm.field_b.a(441, qm.field_c * var5 / 64, var6Lifetime2);
          vi.field_d.a(441, var7Lifetime2 * qm.field_c / 64, var8Lifetime2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "jd.D(" + param0 + ')');
        }
    }

    public static void b(byte param0) {
        field_c = null;
        int var1 = 19 % ((-6 - param0) / 50);
        field_a = null;
        field_b = null;
    }

    final synchronized static byte[] a(int param0, boolean param1) {
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
        if (param0 == 100 &&
          0 < vi.field_b) {
          fieldTemp$3 = vi.field_b - 1;
          vi.field_b = vi.field_b - 1;
          var2_ref_byte__ = ei.field_l[fieldTemp$3];
          ei.field_l[vi.field_b] = null;
          return var2_ref_byte__;
        }
        if (param0 == 5000 &&
          qj.field_c > 0) {
          fieldTemp$4 = qj.field_c - 1;
          qj.field_c = qj.field_c - 1;
          var2_ref_byte__Lifetime1 = ok.field_d[fieldTemp$4];
          ok.field_d[qj.field_c] = null;
          return var2_ref_byte__Lifetime1;
        }
        if (!param1) {
          field_a = (cn) null;
        }
        if (param0 == 30000 &&
          bm.field_c > 0) {
          fieldTemp$5 = bm.field_c - 1;
          bm.field_c = bm.field_c - 1;
          var2_ref_byte__Lifetime2 = id.field_b[fieldTemp$5];
          id.field_b[bm.field_c] = null;
          return var2_ref_byte__Lifetime2;
        }
        if (ve.field_n != null) {
          for (var2 = 0; var2 < rb.field_h.length; var2++) {
            if (rb.field_h[var2] == param0 &&
              0 < nb.field_b[var2]) {
              dupTemp$6 = nb.field_b[var2] - 1;
              arrayValue$7 = ve.field_n[var2];
              nb.field_b[var2] = dupTemp$6;
              var3 = arrayValue$7[dupTemp$6];
              ve.field_n[var2][nb.field_b[var2]] = null;
              return var3;
            }
          }
        }
        return new byte[param0];
    }

    final static sn a(boolean param0) {
        if (param0) {
          jd.a((byte) -80);
        }
        String var1 = fl.e(0);
        if (var1 != null &&
          !(0 > var1.indexOf('@'))) {
          var1 = "";
        }
        return new sn(fl.e(0), uf.c(62));
    }

    final static int a(ih param0, byte param1, String[] param2) {
        int var5 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        String var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = EscapeVector.field_A;
        try {
          if (param1 != -121) {
            stackIn_3_0 = -57;
            return stackIn_3_0;
          }
          var3_int = 0;
          var4 = param2;
          for (var5 = 0; var5 < var4.length; var5++) {
            var6 = var4[var5];
            var3_int = var3_int + ic.a(var6, param1 ^ -16777096, param0);
          }
          stackIn_8_0 = var3_int;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("jd.A(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_b = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_c = "To Level";
    }
}
