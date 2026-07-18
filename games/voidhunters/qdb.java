/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qdb implements ntb {
    int field_b;
    int field_d;
    int field_f;
    static dja field_a;
    int[] field_c;
    static String field_e;

    public final void a(faa param0, boolean param1) {
        if (param1) {
            return;
        }
        try {
            ((qdb) this).field_b = param0.i(0, 8);
            ((qdb) this).field_d = param0.i(0, 32);
            ((qdb) this).field_c = wkb.a((byte) 37, ((qdb) this).field_c, param0, 8);
            ((qdb) this).field_f = param0.i(0, 32);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "qdb.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var18 = 0;
        int[] var22 = null;
        RuntimeException decompiledCaughtException = null;
        var18 = VoidHunters.field_G;
        try {
          L0: {
            var12 = ksa.a(31123, lua.field_c, hab.field_i, param5);
            var13 = ksa.a(31123, lua.field_c, hab.field_i, param7);
            var14 = ksa.a(31123, ob.field_j, mt.field_o, param4);
            var15 = ksa.a(31123, ob.field_j, mt.field_o, param0);
            var8_int = ksa.a(31123, lua.field_c, hab.field_i, param5 + param1);
            var9 = ksa.a(31123, lua.field_c, hab.field_i, param7 - param1);
            var16 = var12;
            L1: while (true) {
              if (var16 >= var8_int) {
                field_a = null;
                var16 = var13;
                L2: while (true) {
                  if (var16 <= var9) {
                    var10 = ksa.a(31123, ob.field_j, mt.field_o, param1 + param4);
                    var11 = ksa.a(31123, ob.field_j, mt.field_o, -param1 + param0);
                    var16 = var8_int;
                    L3: while (true) {
                      if (var16 > var9) {
                        break L0;
                      } else {
                        var22 = rba.field_b[var16];
                        ww.a(param6, var10, var22, (byte) 75, var14);
                        ww.a(param3, var11, var22, (byte) 75, var10);
                        ww.a(param6, var15, var22, (byte) 75, var11);
                        var16++;
                        continue L3;
                      }
                    }
                  } else {
                    ww.a(param6, var15, rba.field_b[var16], (byte) 75, var14);
                    var16--;
                    continue L2;
                  }
                }
              } else {
                ww.a(param6, var15, rba.field_b[var16], (byte) 75, var14);
                var16++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var8, "qdb.G(" + param0 + ',' + param1 + ',' + 0 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    public final void b(byte param0, tv param1) {
        qdb var3 = (qdb) (Object) param1;
        var3.field_b = ((qdb) this).field_b;
        var3.field_d = ((qdb) this).field_d;
        var3.field_c = dob.a(var3.field_c, (byte) -38, ((qdb) this).field_c);
        if (param0 < 54) {
            return;
        }
        try {
            var3.field_f = ((qdb) this).field_f;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "qdb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_a = null;
    }

    public final boolean a(byte param0, tv param1) {
        qdb var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var4 = -60 % ((param0 - 22) / 59);
                var3 = (qdb) (Object) param1;
                if (((qdb) this).field_b != var3.field_b) {
                  break L2;
                } else {
                  if (((qdb) this).field_d != var3.field_d) {
                    break L2;
                  } else {
                    if (wpb.a(var3.field_c, ((qdb) this).field_c, (byte) 28)) {
                      break L2;
                    } else {
                      if (var3.field_f == ((qdb) this).field_f) {
                        stackOut_6_0 = 0;
                        stackIn_7_0 = stackOut_6_0;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("qdb.C(").append(param0).append(',');
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
          throw rta.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    public final void b(faa param0, int param1) {
        if (param1 >= -109) {
            return;
        }
        try {
            param0.a(-632, ((qdb) this).field_b, 8);
            param0.a(-632, ((qdb) this).field_d, 32);
            pgb.a(8, ((qdb) this).field_c != null ? ((qdb) this).field_c.length : 0, 49, param0, ((qdb) this).field_c);
            param0.a(-632, ((qdb) this).field_f, 32);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "qdb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, boolean param6, boolean param7, int param8, boolean param9, int param10, int param11, int param12, boolean param13) {
        lob.field_a = null;
        tr.c(6939);
        param4 = oga.a(33, 11, 15, 0, 13, 14, param4);
        rl.a(param4, -1, 16777215, 16777215, param7, 11, param5, param6, param13, true);
        chb.a(0, param5, param7);
        mn.a(param4, param5, 0, 97);
    }

    public final void a(tv param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        Object var5 = null;
        qdb var6 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              var6 = (qdb) (Object) param0;
              var4 = 0;
              if (((qdb) this).field_b != var6.field_b) {
                var4 = 1;
                System.out.println("int voted_objective has changed. before=" + var6.field_b + ", now=" + ((qdb) this).field_b);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (var6.field_d == ((qdb) this).field_d) {
                break L2;
              } else {
                System.out.println("int mission_generation_seed has changed. before=" + var6.field_d + ", now=" + ((qdb) this).field_d);
                var4 = 1;
                break L2;
              }
            }
            L3: {
              if (!ikb.a(((qdb) this).field_c, var6.field_c, false)) {
                break L3;
              } else {
                var4 = 1;
                System.out.println("int[] option_totals has changed. ");
                break L3;
              }
            }
            L4: {
              if (var6.field_f == ((qdb) this).field_f) {
                break L4;
              } else {
                var4 = 1;
                System.out.println("int rounds_left has changed. before=" + var6.field_f + ", now=" + ((qdb) this).field_f);
                break L4;
              }
            }
            L5: {
              if (var4 == 0) {
                break L5;
              } else {
                System.out.println("This instance of MissionGenerationData has changed");
                break L5;
              }
            }
            L6: {
              if (param1 <= -19) {
                break L6;
              } else {
                var5 = null;
                ((qdb) this).b((faa) null, -26);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("qdb.F(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L7;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L7;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Average rating";
        field_a = (dja) (Object) new ccb();
    }
}
