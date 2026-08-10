/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je {
    static boolean field_c;
    static String field_b;
    static String field_a;
    static int field_d;

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        if (param0 <= 21) {
            field_c = false;
        }
    }

    final static void a(o[] param0, int param1, int param2, int param3, byte param4) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (param3 <= 0) {
                  break L1;
                } else {
                  var5_int = param0[0].field_q;
                  var6 = param0[2].field_q;
                  var7 = param0[1].field_q;
                  param0[0].d(param1, param2);
                  param0[2].d(-var6 + param1 + param3, param2);
                  mi.b(ql.field_q);
                  mi.d(var5_int + param1, param2, param1 + param3 + -var6, param0[1].field_r + param2);
                  var8 = param1 - -var5_int;
                  var9 = param1 + (param3 + -var6);
                  param1 = var8;
                  L2: while (true) {
                    if (var9 <= param1) {
                      mi.a(ql.field_q);
                      var10 = -88 % ((-22 - param4) / 53);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      param0[1].d(param1, param2);
                      param1 = param1 + var7;
                      continue L2;
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("je.G(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static o[] a(int param0, byte param1, int param2, int param3, int param4) {
        int var5 = -125 % ((param1 - 30) / 35);
        return md.a(param2, param3, param0, param4, 1, -1, 1, 3, 1);
    }

    final synchronized static long a(int param0) {
        long var1;
        var1 = System.currentTimeMillis();
        if (qf.field_b <= var1) {
          if (param0 != 1) {
            je.a((byte) 110);
            qf.field_b = var1;
            return var1 + of.field_e;
          } else {
            qf.field_b = var1;
            return var1 + of.field_e;
          }
        } else {
          of.field_e = of.field_e + (qf.field_b + -var1);
          if (param0 == 1) {
            qf.field_b = var1;
            return var1 + of.field_e;
          } else {
            je.a((byte) 110);
            qf.field_b = var1;
            return var1 + of.field_e;
          }
        }
    }

    final static boolean a(ia param0, ia param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2) {
                break L1;
              } else {
                field_c = false;
                break L1;
              }
            }
            L2: {
              var3_int = param0.field_jb - param1.field_jb;
              if (param0.field_gb != qa.field_r) {
                if (param0.field_gb == null) {
                  var3_int += 200;
                  break L2;
                } else {
                  break L2;
                }
              } else {
                var3_int -= 200;
                break L2;
              }
            }
            L3: {
              if (qa.field_r != param1.field_gb) {
                if (null == param1.field_gb) {
                  var3_int -= 200;
                  break L3;
                } else {
                  break L3;
                }
              } else {
                var3_int += 200;
                break L3;
              }
            }
            L4: {
              if (0 >= var3_int) {
                stackIn_16_0 = 0;
                break L4;
              } else {
                stackIn_16_0 = 1;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3);

            stackIn_19_1 = new StringBuilder().append("je.F(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_20_0), stackIn_23_2 + ',' + param2 + ')');
        }
        return stackIn_16_0 != 0;
    }

    final static void a(int param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 <= -59) {
              if (null != kf.field_G) {
                var3_int = 0;
                L1: while (true) {
                  if (kf.field_G.length <= var3_int) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    L2: {
                      if (null == kf.field_G[var3_int]) {
                        break L2;
                      } else {
                        kf.field_G[var3_int].a((byte) 117, param2, param1);
                        break L2;
                      }
                    }
                    var3_int++;
                    continue L1;
                  }
                }
              } else {
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var3), "je.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(boolean param0) {
        if (param0) {
          L0: {
            je.a(false);
            if (lf.field_d != null) {
              lf.field_d.d(2);
              lf.field_d = null;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (lf.field_d != null) {
              lf.field_d.d(2);
              lf.field_d = null;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    static {
        field_b = "Waiting for music";
        field_a = "Player";
        field_d = 0;
    }
}
