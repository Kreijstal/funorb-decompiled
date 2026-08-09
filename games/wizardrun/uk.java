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
        ac var3 = (ac) (this.field_d.a((byte) 70, (long)param1));
        if (var3 != null) {
            return var3;
        }
        if (param0 < 27) {
            return (ac) null;
        }
        if (-32769 >= (param1 ^ -1)) {
            var4 = this.field_a.a(param1 & 32767, 1, 1);
        } else {
            var4 = this.field_c.a(param1, 1, 1);
        }
        var3 = new ac();
        if (!(var4 == null)) {
            var3.a(new va(var4), 72);
        }
        if (!(-32769 < (param1 ^ -1))) {
            var3.d((byte) -127);
        }
        this.field_d.a((long)param1, 1, var3);
        return var3;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, boolean param7, int param8, int param9) {
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10_ref = null;
        var16 = wizardrun.field_H;
        try {
          L0: {
            if (param7) {
              L1: while (true) {
                param0--;
                if (0 > param0) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var17 = param6;
                  var10 = var17;
                  var11 = param4;
                  var12 = param3;
                  var13 = param8;
                  var14 = param9;
                  var15 = 8355711 & var17[var11] >> 386573729;
                  var10[var11] = (kl.b(var13, 33423632) >> -56767927) + ((kl.b(33423361, var12) >> -1072357663) - (-kl.b(255, var14 >> 322571985) - var15));
                  param3 = param3 + param1;
                  param9 = param9 + param2;
                  param4++;
                  param8 = param8 + param5;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var10_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var10_ref);

            stackIn_8_1 = new StringBuilder().append("uk.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(byte param0, int param1) {
        wj.field_E = 1000000000L / (long)param1;
        if (param0 != 91) {
            field_b = (o) null;
        }
    }

    final static void a(int param0) {
        if (!(wi.field_J)) {
            throw new IllegalStateException();
        }
        if (param0 != 19702) {
            field_b = (o) null;
        }
        if (!(aa.field_lb == null)) {
            aa.field_lb.l(-27697);
        }
        String var1 = qf.c((byte) 77);
        r.field_b = new qc(var1, (String) null, true, false, false);
        u.field_A.b((ub) (td.field_f), (byte) 62);
        td.field_f.c(r.field_b, -114);
        td.field_f.g((byte) -3);
    }

    final static uh a(String param0, int param1, long param2, boolean param3, String param4) {
        RuntimeException var6 = null;
        nh stackIn_5_0 = null;
        ka stackIn_7_0 = null;
        bb stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 != 0L) {
                break L1;
              } else {
                if (param0 != null) {
                  stackIn_7_0 = new ka(param0, param4);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (!param3) {
              L2: {
                if (param1 == 8355711) {
                  break L2;
                } else {
                  field_b = (o) null;
                  break L2;
                }
              }
              stackIn_11_0 = new bb(param2, param4);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_5_0 = new nh(param2, param4);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var6);

            stackIn_14_1 = new StringBuilder().append("uk.G(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (uh) ((Object) stackIn_5_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (uh) ((Object) stackIn_7_0);
          } else {
            return (uh) ((Object) stackIn_11_0);
          }
        }
    }

    final static void a(byte param0, boolean param1, boolean param2) {
        if (param2) {
            ed.d(0, 0, ed.field_h, ed.field_d, 0, 192);
        } else {
            ed.d();
        }
        od.a(param0 ^ 4, param2);
        if (param0 != -123) {
            field_b = (o) null;
        }
    }

    public static void a(byte param0) {
        if (param0 != -44) {
            uk.a(108);
        }
        field_b = null;
    }

    private uk() throws Throwable {
        throw new Error();
    }

    final static void a(int param0, kl param1) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        le var5 = null;
        int[] var6 = null;
        int var7 = 0;
        mg var8 = null;
        int var9 = 0;
        mg var10 = null;
        var7 = wizardrun.field_H;
        try {
          L0: {
            var8 = new mg(param1.a(93, "", "logo.fo3d"));
            var10 = var8;
            var3 = var10.f(255);
            var10.l(19967);
            oh.field_a = ie.a(12, var10);
            cb.field_d = new int[var3][];
            ia.field_f = new le[var3];
            var4 = 0;
            L1: while (true) {
              if (var4 >= var3) {
                L2: {
                  var10.i((byte) -31);
                  if (param0 > 115) {
                    break L2;
                  } else {
                    uk.a((byte) -19);
                    break L2;
                  }
                }
                var9 = 0;
                var4 = var9;
                L3: while (true) {
                  if (var9 >= var3) {
                    break L0;
                  } else {
                    var5 = ia.field_f[var9];
                    var5.a(6, (byte) 108, 6, 6, 1);
                    var5.b(-109);
                    var6 = new int[]{var5.field_g + var5.field_r >> 735135713, var5.field_D + var5.field_K >> -2086113023, var5.field_E - -var5.field_M >> -770248351};
                    cb.field_d[var9] = var6;
                    var5.a(-var6[2], -var6[1], -var6[0], 0);
                    var9++;
                    continue L3;
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
          L4: {
            var2 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var2);

            stackIn_12_1 = new StringBuilder().append("uk.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    static {
    }
}
