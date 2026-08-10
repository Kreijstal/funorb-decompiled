/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh extends ug {
    static le[][][] field_f;
    int field_g;
    byte[] field_h;
    long field_e;

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = -((param2 - param3) * (param5 - param0)) + (param1 + -param8) * (-param6 + param7);
        if (!(0 != var9)) {
            return false;
        }
        int var10 = -(param6 * param2) + param7 * param3;
        int var11 = -param6 + param7;
        int var12 = param2 - param3;
        int var13 = param8 * param5 - param0 * param1;
        int var14 = -param0 + param5;
        int var15 = -param8 + param1;
        if (param4 != -5425) {
            field_f = (le[][][]) null;
        }
        ll.field_a = (var10 * var14 + -(var11 * var13)) / var9;
        ok.field_b = (-(var12 * var13) + var10 * var15) / var9;
        return true;
    }

    public static void a(int param0) {
        if (param0 != -19931) {
            field_f = (le[][][]) null;
        }
        field_f = (le[][][]) null;
    }

    final static void a(byte param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              if (-18 >= (var1_int ^ -1)) {
                var1_int = -117 % ((-69 - param0) / 44);
                var2 = 1;
                L2: while (true) {
                  if (var2 >= 17) {
                    var2 = 16;
                    var3 = 1;
                    L3: while (true) {
                      if (-33 >= (var2 ^ -1)) {
                        break L0;
                      } else {
                        hh.field_n[var2] = new gb(pe.field_d[var3], 240.0f, (float)(var3 * 30), 2.0f);
                        var3++;
                        var2++;
                        continue L3;
                      }
                    }
                  } else {
                    hh.field_n[var2 + -1] = new gb(pe.field_d[-1 + var2], pe.field_d[var2], 30.0f);
                    var2++;
                    continue L2;
                  }
                }
              } else {
                pe.field_d[var1_int] = new wg(320.0f, (float)(-(var1_int * 2) + 0));
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "nh.D(" + param0 + ')');
        }
    }

    final static void b(byte param0) {
        float[] dupTemp$0 = null;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var1_int = 37 % ((45 - param0) / 61);
            var2 = 1;
            L1: while (true) {
              if (var2 >= 17) {
                var1_int = 0;
                L2: while (true) {
                  if (3 <= var1_int) {
                    pe.field_d[0].field_e[1] = 0.0f;
                    pe.field_d[0].field_e[0] = 240.0f;
                    pe.field_d[0].field_i[0] = 240.0f;
                    pe.field_d[0].field_i[1] = 0.0f;
                    break L0;
                  } else {
                    L3: {
                      if ((1 & var1_int) == 0) {
                        stackIn_9_0 = 15;
                        break L3;
                      } else {
                        stackIn_9_0 = 0;
                        break L3;
                      }
                    }
                    L4: {
                      var2 = stackIn_9_0;
                      if ((1 & var1_int) != 0) {
                        stackIn_12_0 = 16;
                        break L4;
                      } else {
                        stackIn_12_0 = -1;
                        break L4;
                      }
                    }
                    L5: {
                      var3 = stackIn_12_0;
                      if ((1 & var1_int) == 0) {
                        stackIn_15_0 = -1;
                        break L5;
                      } else {
                        stackIn_15_0 = 1;
                        break L5;
                      }
                    }
                    var4 = stackIn_15_0;
                    var5 = var2;
                    L6: while (true) {
                      if (var3 == var5) {
                        var1_int++;
                        continue L2;
                      } else {
                        hh.field_n[var5].c((byte) 122);
                        var5 = var5 + var4;
                        continue L6;
                      }
                    }
                  }
                }
              } else {
                pe.field_d[var2].field_f[0] = 0.0f;
                dupTemp$0 = pe.field_d[var2].field_f;
                dupTemp$0[1] = dupTemp$0[1] + 8.0f;
                pe.field_d[var2].e(-85);
                var2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "nh.E(" + param0 + ')');
        }
    }

    nh(long param0, int param1, byte[] param2) {
        try {
            this.field_e = param0;
            this.field_g = param1;
            this.field_h = param2;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "nh.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        try {
            oa.field_I = true;
            var2 = "tuhstatbut";
            var3 = "rvnadlm";
            if (param0 <= 30) {
                field_f = (le[][][]) null;
            }
            var4 = -1L;
            wg.a(var2, param1, var3, -26372, var4);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "nh.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = new le[2][5][];
    }
}
