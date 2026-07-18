/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk {
    private kl field_a;
    private di field_d;
    static o field_b;
    private kl field_c;

    final ac b(byte param0, int param1) {
        byte[] var4 = null;
        ac var3 = (ac) ((uk) this).field_d.a((byte) 70, (long)param1);
        if (var3 != null) {
            return var3;
        }
        if (param0 < 27) {
            return null;
        }
        if (param1 >= 32768) {
            var4 = ((uk) this).field_a.a(param1 & 32767, 1, 1);
        } else {
            var4 = ((uk) this).field_c.a(param1, 1, 1);
        }
        var3 = new ac();
        if (!(var4 == null)) {
            var3.a(new va(var4), 72);
        }
        if (!(param1 < 32768)) {
            var3.d((byte) -127);
        }
        ((uk) this).field_d.a((long)param1, 1, (Object) (Object) var3);
        return var3;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, boolean param7, int param8, int param9) {
        int[] var10 = null;
        RuntimeException var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var16 = wizardrun.field_H;
        try {
          L0: {
            L1: while (true) {
              param0--;
              if (0 > param0) {
                break L0;
              } else {
                var17 = param6;
                var10 = var17;
                var11 = param4;
                var12 = param3;
                var13 = param8;
                var14 = param9;
                var15 = 8355711 & var17[var11] >> 1;
                var10[var11] = (kl.b(var13, 33423632) >> 9) + ((kl.b(33423361, var12) >> 1) - (-kl.b(255, var14 >> 17) - var15));
                param3 = param3 + param1;
                param9 = param9 + param2;
                param4++;
                param8 = param8 + param5;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var10_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var10_ref;
            stackOut_6_1 = new StringBuilder().append("uk.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param6 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + true + ',' + param8 + ',' + param9 + ')');
        }
    }

    final static void a(byte param0, int param1) {
        wj.field_E = 20000000L;
    }

    final static void a(int param0) {
        if (!(wi.field_J)) {
            throw new IllegalStateException();
        }
        if (!(aa.field_lb == null)) {
            aa.field_lb.l(-27697);
        }
        String var1 = qf.c((byte) 77);
        r.field_b = new qc(var1, (String) null, true, false, false);
        u.field_A.b((ub) (Object) td.field_f, (byte) 62);
        td.field_f.c((ub) (Object) r.field_b, -114);
        td.field_f.g((byte) -3);
    }

    final static uh a(String param0, int param1, long param2, boolean param3, String param4) {
        RuntimeException var6 = null;
        nh stackIn_4_0 = null;
        ka stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        ka stackOut_5_0 = null;
        nh stackOut_3_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param2 != 0L) {
                break L1;
              } else {
                if (param0 != null) {
                  stackOut_5_0 = new ka(param0, param4);
                  stackIn_6_0 = stackOut_5_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_3_0 = new nh(param2, param4);
            stackIn_4_0 = stackOut_3_0;
            return (uh) (Object) stackIn_4_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var6;
            stackOut_8_1 = new StringBuilder().append("uk.G(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(8355711).append(',').append(param2).append(',').append(false).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param4 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return (uh) (Object) stackIn_6_0;
    }

    final static void a(byte param0, boolean param1, boolean param2) {
        if (param2) {
            ed.d(0, 0, ed.field_h, ed.field_d, 0, 192);
        } else {
            ed.d();
        }
        od.a(-127, param2);
    }

    public static void a(byte param0) {
        field_b = null;
    }

    private uk() throws Throwable {
        throw new Error();
    }

    final static void a(int param0, kl param1) {
        RuntimeException var2 = null;
        mg var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        le var5 = null;
        int[] var6 = null;
        int var7 = 0;
        mg var8 = null;
        int var9 = 0;
        mg var10 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var7 = wizardrun.field_H;
        try {
          L0: {
            var8 = new mg(param1.a(93, "", "logo.fo3d"));
            var10 = var8;
            var2_ref = var10;
            var3 = var10.f(255);
            var10.l(19967);
            oh.field_a = ie.a(12, var10);
            cb.field_d = new int[var3][];
            ia.field_f = new le[var3];
            var4 = 0;
            L1: while (true) {
              if (var4 >= var3) {
                var10.i((byte) -31);
                var9 = 0;
                var4 = var9;
                L2: while (true) {
                  if (var9 >= var3) {
                    break L0;
                  } else {
                    var5 = ia.field_f[var9];
                    var5.a(6, (byte) 108, 6, 6, 1);
                    var5.b(-109);
                    var6 = new int[]{var5.field_g + var5.field_r >> 1, var5.field_D + var5.field_K >> 1, var5.field_E - -var5.field_M >> 1};
                    cb.field_d[var9] = var6;
                    var5.a(-var6[2], -var6[1], -var6[0], 0);
                    var9++;
                    continue L2;
                  }
                }
              } else {
                ia.field_f[var4] = mh.a((byte) -117, var8);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("uk.B(").append(125).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    static {
    }
}
