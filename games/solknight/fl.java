/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl {
    private static int[] field_a;
    static int[] field_b;

    final static void a(int param0, int param1, int param2, int param3, int param4, o param5) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var15Lifetime1;
        int var15Lifetime2;
        int var15Lifetime3;
        try {
          var6_int = (param1 - param0 << 8) / param5.field_q;
          var7 = param5.field_s * var6_int + (param0 << 8);
          param4 = param4 + param5.field_n;
          param2 = param2 + param5.field_s;
          var8 = 70 % ((param3 + 32) / 52);
          var9 = param4 * mi.field_a + param2;
          var10 = 0;
          var11 = param5.field_t;
          var12 = param5.field_p;
          var13 = mi.field_a - var12;
          if (param4 < mi.field_l) {
            var15 = mi.field_l - param4;
            var11 = var11 - var15;
            var10 = var10 + var15 * var12;
            param4 = mi.field_l;
            var9 = var9 + var15 * mi.field_a;
          }
          var14 = 0;
          if (mi.field_b > param2) {
            var15Lifetime1 = -param2 + mi.field_b;
            var9 = var9 + var15Lifetime1;
            var14 = var14 + var15Lifetime1;
            var10 = var10 + var15Lifetime1;
            var13 = var13 + var15Lifetime1;
            var7 = var7 + var6_int * var15Lifetime1;
            var12 = var12 - var15Lifetime1;
            param2 = mi.field_b;
          }
          if (param4 + var11 > mi.field_e) {
            var11 = var11 - (param4 - (-var11 + mi.field_e));
          }
          if (var12 + param2 > mi.field_k) {
            var15Lifetime2 = param2 + (var12 - mi.field_k);
            var13 = var13 + var15Lifetime2;
            var14 = var14 + var15Lifetime2;
            var12 = var12 - var15Lifetime2;
          }
          if (var12 > 0 &&
            var11 > 0) {
            for (param4 = -var11; 0 > param4; param4++) {
              var15Lifetime3 = var7;
              for (param2 = -var12; param2 < 0; param2++) {
                var16 = var15Lifetime3 >> 8;
                var15Lifetime3 = var15Lifetime3 + var6_int;
                var17 = -var16 + 256;
                if (var16 >= 0) {
                  incrementValue$0 = var10;
                  var10++;
                  var18 = param5.field_v[incrementValue$0];
                  if (var18 != 0) {
                    if (255 >= var16) {
                      var19 = mi.field_f[var9];
                      var20 = (16711935 & var19) * var17 + var16 * (16711935 & var18) >> 8 & 16711935;
                      mi.field_f[var9] = fi.a(fi.a(var19, 65280) * var17 + fi.a(var18, 65280) * var16 >> 8, 65280) + var20;
                    } else {
                      mi.field_f[var9] = var18;
                    }
                  }
                  var9++;
                } else {
                  var9++;
                  var10++;
                }
              }
              var10 = var10 + var14;
              var9 = var9 + var13;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_31_0 = var6;
          stackIn_31_1 = new StringBuilder().append("fl.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    final synchronized static byte[] a(int param0, int param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int var2 = 0;
        int dupTemp$3 = 0;
        byte[][] arrayValue$4 = null;
        byte[] var2_ref_byte__;
        byte[] var3;
        o var4;
        byte[] var2_ref_byte__Lifetime1;
        byte[] var2_ref_byte__Lifetime2;
        if (param0 == 100 &&
          kk.field_e > 0) {
          fieldTemp$0 = kk.field_e - 1;
          kk.field_e = kk.field_e - 1;
          var2_ref_byte__ = ng.field_g[fieldTemp$0];
          ng.field_g[kk.field_e] = null;
          return var2_ref_byte__;
        }
        if (param0 == 5000 &&
          0 < nf.field_V) {
          fieldTemp$1 = nf.field_V - 1;
          nf.field_V = nf.field_V - 1;
          var2_ref_byte__Lifetime1 = hc.field_e[fieldTemp$1];
          hc.field_e[nf.field_V] = null;
          return var2_ref_byte__Lifetime1;
        }
        if (param1 != -1) {
          var4 = (o) null;
          fl.a(40, -45, 42, 86, 61, (o) null);
        }
        if (30000 == param0 &&
          sf.field_c > 0) {
          fieldTemp$2 = sf.field_c - 1;
          sf.field_c = sf.field_c - 1;
          var2_ref_byte__Lifetime2 = ef.field_d[fieldTemp$2];
          ef.field_d[sf.field_c] = null;
          return var2_ref_byte__Lifetime2;
        }
        if (rg.field_d != null) {
          for (var2 = 0; var2 < sf.field_i.length; var2++) {
            if (sf.field_i[var2] == param0 &&
              cl.field_l[var2] > 0) {
              dupTemp$3 = cl.field_l[var2] - 1;
              arrayValue$4 = rg.field_d[var2];
              cl.field_l[var2] = dupTemp$3;
              var3 = arrayValue$4[dupTemp$3];
              rg.field_d[var2][cl.field_l[var2]] = null;
              return var3;
            }
          }
        }
        return new byte[param0];
    }

    final static void b(byte param0) {
        if (param0 != 91) {
          fl.a(112, -6);
        }
        al var1 = (al) (uc.field_a.e((byte) 86));
        if (var1 == null) {
          var1 = new al();
        }
        var1.a(mi.field_b, mi.field_k, mi.field_a, (byte) 86, mi.field_f, mi.field_e, mi.field_l, mi.field_d);
        cj.field_a.a(var1, param0 - 7135);
    }

    public static void a(byte param0) {
        if (param0 != -108) {
          o var2 = (o) null;
          fl.a(88, 111, 27, -112, 11, (o) null);
        }
        field_a = null;
        field_b = null;
    }

    static {
        int var0 = 0;
        long var4 = 0L;
        long var6 = 0L;
        int var3 = 0;
        int var2 = 0;
        int var1 = 0;
        field_a = new int[98304];
        for (var0 = 92682; var0 >= 46341; var0--) {
          var4 = (long)(-1 + (var0 << 1));
          var6 = (long)((var0 << 1) + 1);
          var3 = (int)(-32768L + (var6 * var6 >> 18));
          var2 = (int)((var4 * var4 >> 18) - 32768L);
          if (field_a.length <= var3) {
            var3 = field_a.length - 1;
          }
          for (var1 = 0 > var2 ? 0 : var2; var1 <= var3; var1++) {
            field_a[var1] = var0;
          }
        }
    }
}
