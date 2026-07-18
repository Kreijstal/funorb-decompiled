/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg {
    static fh field_b;
    static boolean field_a;

    final static void a(int param0, bd[] param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var10 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (0 >= param2) {
                  break L1;
                } else {
                  L2: {
                    if (param0 > 91) {
                      break L2;
                    } else {
                      field_a = true;
                      break L2;
                    }
                  }
                  var5_int = param1[0].field_u;
                  var6 = param1[2].field_u;
                  var7 = param1[1].field_u;
                  param1[0].e(param4, param3);
                  param1[2].e(param2 + param4 - var6, param3);
                  si.b(ia.field_i);
                  si.f(param4 + var5_int, param3, param4 - (-param2 + var6), param1[1].field_r + param3);
                  var8 = param4 - -var5_int;
                  var9 = param4 + param2 + -var6;
                  param4 = var8;
                  L3: while (true) {
                    if (param4 >= var9) {
                      si.a(ia.field_i);
                      break L0;
                    } else {
                      param1[1].e(param4, param3);
                      param4 = param4 + var7;
                      continue L3;
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("tg.C(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void b() {
        cl var1 = (cl) (Object) ne.field_q.g(-64);
        if (!(var1 != null)) {
            le.c((byte) 113);
            return;
        }
        en var2 = sc.field_g;
        int discarded$0 = var2.d(8195);
        int discarded$1 = var2.d(8195);
        int discarded$2 = var2.d(8195);
        int discarded$3 = var2.d(8195);
        var1.b(-96);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int[] param11, int param12, int param13, int param14, int param15, int param16) {
        int var42 = 0;
        L0: {
          var42 = HostileSpawn.field_I ? 1 : 0;
          if (param16 < 0) {
            break L0;
          } else {
            if (param8 < ge.field_f) {
              L1: {
                if (0 <= param15) {
                  break L1;
                } else {
                  if (param6 >= 0) {
                    break L1;
                  } else {
                    if (0 > param5) {
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (param15 < ge.field_h) {
                  break L2;
                } else {
                  if (param6 < ge.field_h) {
                    break L2;
                  } else {
                    if (ge.field_h > param5) {
                      break L2;
                    } else {
                      return;
                    }
                  }
                }
              }
              return;
            } else {
              break L0;
            }
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        int var1 = -104 % ((36 - param0) / 62);
    }

    final static void a() {
        tb.f((byte) -85);
        if (null != se.field_h) {
            v.a(67, se.field_h);
        }
        qc.c((byte) -118);
        int discarded$6 = 114;
        lj.d();
        md.b(51);
        if (bj.c((byte) -29)) {
            s.field_b.i(19319, 1);
            mb.d(0, -22370);
        }
        le.c((byte) 99);
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var2_int = ln.field_a.field_d;
            var3 = param0 % var2_int;
            var4 = var3;
            var5 = param0 / var2_int;
            var6 = var5;
            ln.field_a.field_f[param0] = 3;
            var7 = 0;
            L1: while (true) {
              if (var7 != 0) {
                int discarded$1 = 2;
                pc.a();
                break L0;
              } else {
                var7 = 1;
                var8 = var3;
                L2: while (true) {
                  if (var4 < var8) {
                    continue L1;
                  } else {
                    var9 = var5;
                    L3: while (true) {
                      if (var6 < var9) {
                        var8++;
                        continue L2;
                      } else {
                        L4: {
                          if (ln.field_a.field_f[var9 * var2_int + var8] != 3) {
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        var9++;
                        continue L3;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2, "tg.B(" + param0 + ',' + 30427 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new fh();
    }
}
