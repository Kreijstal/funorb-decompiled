/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jn {
    static String field_d;
    static fi field_g;
    private lo field_e;
    private r field_f;
    private r field_a;
    static int field_c;
    static er[] field_b;

    final q a(int param0, int param1) {
        q var3 = null;
        byte[] var4 = null;
        var3 = (q) ((jn) this).field_e.b((long)param1, (byte) 74);
        if (var3 == null) {
          L0: {
            if (32768 <= param1) {
              var4 = ((jn) this).field_a.a(1, param1 & 32767, (byte) -93);
              break L0;
            } else {
              var4 = ((jn) this).field_f.a(1, param1, (byte) -22);
              break L0;
            }
          }
          var3 = new q();
          if (param0 != 1) {
            L1: {
              q discarded$1 = ((jn) this).a(65, -27);
              if (var4 != null) {
                var3.a(new ed(var4), -88);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (32768 <= param1) {
                var3.a((byte) 93);
                break L2;
              } else {
                break L2;
              }
            }
            ((jn) this).field_e.a((long)param1, (Object) (Object) var3, (byte) -86);
            return var3;
          } else {
            L3: {
              if (var4 != null) {
                var3.a(new ed(var4), -88);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (32768 <= param1) {
                var3.a((byte) 93);
                break L4;
              } else {
                break L4;
              }
            }
            ((jn) this).field_e.a((long)param1, (Object) (Object) var3, (byte) -86);
            return var3;
          }
        } else {
          return var3;
        }
    }

    final static void a(li param0, li param1) {
        try {
            if (param0.field_a != null) {
                param0.c(2);
            }
            param0.field_c = param1;
            param0.field_a = param1.field_a;
            param0.field_a.field_c = param0;
            param0.field_c.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "jn.C(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + 18724 + 41);
        }
    }

    final static void a() {
        ga.a(nl.field_e, 5, 87);
        ga.a(nq.field_G, 6, 86);
        ga.a(ir.field_e, 8, 123);
        ga.a(aa.field_Jb, 13, 80);
        if (!mm.b(-12942)) {
            ga.a(po.field_c, 18, 127);
        }
    }

    public static void b() {
        field_g = null;
        field_b = null;
        field_d = null;
    }

    jn(int param0, r param1, r param2, jh param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        ((jn) this).field_e = new lo(64);
        try {
          L0: {
            L1: {
              ((jn) this).field_f = param1;
              ((jn) this).field_a = param2;
              if (((jn) this).field_f == null) {
                break L1;
              } else {
                int discarded$4 = ((jn) this).field_f.b(1, (byte) -99);
                break L1;
              }
            }
            if (((jn) this).field_a != null) {
              int discarded$5 = ((jn) this).field_a.b(1, (byte) -29);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("jn.<init>(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    final static void a(int param0, int param1, java.awt.Component param2, int param3, boolean param4, int param5, db param6, jj param7) {
        try {
            dd.a(22050, true, 10);
            ri.field_r = dd.a(param7, param2, 0, 22050);
            mh.field_d = dd.a(param7, param2, 1, 1024);
            il.field_g = new fp();
            wp.field_a = 46;
            mh.field_d.a((sn) (Object) il.field_g);
            qc.field_v = param6;
            qc.field_v.c(-82, nd.field_k);
            ri.field_r.a((sn) (Object) qc.field_v);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "jn.A(" + 22050 + 44 + 1024 + 44 + (param2 != null ? "{...}" : "null") + 44 + 22050 + 44 + 1 + 44 + 18246 + 44 + (param6 != null ? "{...}" : "null") + 44 + (param7 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(int param0, int param1, int param2) {
        or.field_c = param0;
        ek.field_E = param2;
    }

    final static void a(int[] param0, int param1, fb param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          param6 = param6 - param0[0];
          param3 = param3 - param0[1];
          param1 = param1 - param0[2];
          var9_int = param1 * param0[11] + (param3 * param0[10] + param0[9] * param6) >> 9;
          if (var9_int > 6400) {
            var10 = (param8 << 16) / var9_int;
            var11 = (param5 << 16) / var9_int;
            var12 = -(var10 >> 1) + ((param0[5] * param1 + param3 * param0[4] + param0[3] * param6) / var9_int + bi.field_d - -oo.field_l);
            var13 = oo.field_e + bi.field_f + (param6 * param0[6] - -(param3 * param0[7]) + param1 * param0[8]) / var9_int + -(var11 >> 1);
            if (param4 != 256) {
              param2.a(var12, var13, var10, var11, param4);
              return;
            } else {
              param2.a(var12, var13, var10, var11);
              return;
            }
          } else {
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var9 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var9;
            stackOut_6_1 = new StringBuilder().append("jn.E(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L0;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L0;
            }
          }
          L1: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44).append(param1).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L1;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + 10 + 44 + param8 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Names should contain a maximum of 12 characters";
        field_c = 1;
    }
}
