/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class c {
    static ge[] field_d;
    static volatile boolean field_a;
    static ka field_b;
    static ka[][][] field_c;

    final static void a(int param0, int param1, int param2, int param3, ka param4, int param5) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
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
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        var20 = TorChallenge.field_F ? 1 : 0;
        try {
          var6_int = (-param0 + param3 << 8) / param4.field_q;
          param1 = param1 + param4.field_p;
          param2 = param2 + param4.field_s;
          var7 = (param0 << 8) + param4.field_s * var6_int;
          var8 = param1 * qg.field_g + param2;
          var9 = 0;
          var10 = param4.field_x;
          var11 = param4.field_u;
          var12 = -var11 + qg.field_g;
          if (param1 < qg.field_k) {
            var14 = qg.field_k - param1;
            var9 = var9 + var11 * var14;
            var8 = var8 + qg.field_g * var14;
            param1 = qg.field_k;
            var10 = var10 - var14;
          }
          var13 = 0;
          if (param2 < qg.field_a) {
            var14Lifetime1 = -param2 + qg.field_a;
            var11 = var11 - var14Lifetime1;
            param2 = qg.field_a;
            var7 = var7 + var14Lifetime1 * var6_int;
            var9 = var9 + var14Lifetime1;
            var12 = var12 + var14Lifetime1;
            var13 = var13 + var14Lifetime1;
            var8 = var8 + var14Lifetime1;
          }
          if (qg.field_l < param1 + var10) {
            var10 = var10 - (-qg.field_l + param1 + var10);
          }
          if (qg.field_c < param2 + var11) {
            var14Lifetime2 = -qg.field_c + (param2 + var11);
            var11 = var11 - var14Lifetime2;
            var13 = var13 + var14Lifetime2;
            var12 = var12 + var14Lifetime2;
          }
          if (param5 < 51) {
            field_d = (ge[]) null;
          }
          if (var11 > 0 &&
            var10 > 0) {
            for (param1 = -var10; param1 < 0; param1++) {
              var14Lifetime3 = var7;
              for (param2 = -var11; param2 < 0; param2++) {
                var15 = var14Lifetime3 >> 8;
                var14Lifetime3 = var14Lifetime3 + var6_int;
                var16 = 256 - var15;
                if (var15 >= 0) {
                  incrementValue$0 = var9;
                  var9++;
                  var17 = param4.field_y[incrementValue$0];
                  if (var17 != 0) {
                    if (255 >= var15) {
                      var18 = qg.field_i[var8];
                      var19 = var15 * (16711935 & var17) + var16 * (var18 & 16711935) >> 8 & 16711935;
                      qg.field_i[var8] = var19 + jh.a(var16 * jh.a(65280, var18) + var15 * jh.a(65280, var17) >> 8, 65280);
                    } else {
                      qg.field_i[var8] = var17;
                    }
                  }
                  var8++;
                } else {
                  var8++;
                  var9++;
                }
              }
              var9 = var9 + var13;
              var8 = var8 + var12;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_34_0 = var6;
          stackIn_34_1 = new StringBuilder().append("c.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param5).append(')').toString());
        }
    }

    public static void b(int param0) {
        if (param0 != 0) {
          ka var2 = (ka) null;
          c.a(93, -47, -27, 44, (ka) null, 19);
        }
        field_b = null;
        field_c = (ka[][][]) null;
        field_d = null;
    }

    final static int a(int param0, int param1, int param2) {
        if (param1 != 1067751487) {
          field_b = (ka) null;
        }
        int var3 = param2 >>> 31;
        return -var3 + (param2 + var3) / param0;
    }

    final static void a(int param0) {
        int var4 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var5 = 0;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = TorChallenge.field_F ? 1 : 0;
        try {
          var1_int = 5;
          if (!d.p(-88)) {
            stackIn_7_0 = (ee.field_o <= 0) ? 1 : 0;
          } else {
            stackIn_7_0 = 1;
          }
          var2 = stackIn_7_0;
          for (var3 = 0; var3 < 3; var3++) {
            pa.field_s[var3][0] = true;
          }
          var3Lifetime1 = 0;
          if (param0 < 86) {
            field_a = true;
          }
          while (var3Lifetime1 < 6) {
            for (var4 = 0; var4 < var1_int; var4++) {
              if ((var2 == 0 ||
                var3Lifetime1 <= 1) &&
                (1 << var3Lifetime1 & pi.field_d[ok.field_b][ak.field_h]) <= 0) {
              }
            }
            if (var3Lifetime1 != 5) {
              if ((1 << var3Lifetime1 & k.field_b[ok.field_b]) <= 0) {
                pa.field_s[ok.field_b][1 + var3Lifetime1] = false;
              } else {
                pa.field_s[ok.field_b][1 + var3Lifetime1] = true;
              }
              if (var2 != 0 &&
                var3Lifetime1 > 0) {
                pa.field_s[ok.field_b][1 + var3Lifetime1] = false;
              }
              if (aj.field_h) {
                pa.field_s[ok.field_b][var3Lifetime1 + 1] = true;
              }
            }
            var3Lifetime1++;
          }
          for (var3Lifetime2 = 0; var3Lifetime2 < 6; var3Lifetime2++) {
            kj.field_I[var3Lifetime2] = false;
            if (var2 != 0 &&
              1 < var3Lifetime2) {
              kj.field_I[var3Lifetime2] = true;
            }
            if (bh.field_p &&
              aj.field_h) {
              ac.field_d = ac.field_d + 64;
              pi.field_a = pi.field_a + 128;
              kj.field_I[var3Lifetime2] = false;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "c.G(" + param0 + ')');
        }
    }

    final static void a(int param0, long param1) {
        if (param1 <= 0L) {
          return;
        }
        if (param1 % 10L != 0L) {
          nd.a(123, param1);
        } else {
          nd.a(117, -1L + param1);
          nd.a(125, 1L);
        }
        int var3 = 70 % ((param0 + 35) / 61);
    }

    final static void a(boolean param0, boolean param1) {
        t.field_b.a(0, 0, 0);
        if (param1) {
          field_b = (ka) null;
        }
    }

    final static void a(String param0, int param1, boolean param2, float param3) {
        try {
          if (null == oa.field_k) {
            oa.field_k = new pe(t.field_b, jh.field_a);
            t.field_b.a((byte) 86, (ee) (oa.field_k));
          }
          oa.field_k.a(param2, param0, param3, false);
          qg.b();
          int var4_int = -58 / ((-64 - param1) / 51);
          c.a(true, false);
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "c.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_a = true;
        field_c = new ka[20][3][];
    }
}
