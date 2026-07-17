/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg {
    int[] field_d;
    int field_i;
    static String field_c;
    static int[] field_e;
    static String field_b;
    int field_h;
    static String field_g;
    static int field_f;
    static int field_a;

    final static sa a(int param0, rc param1) {
        sa var2 = null;
        RuntimeException var2_ref = null;
        sa stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        sa stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var2 = new sa(param1, (pi) (Object) param1);
              hj.field_b.a((byte) -107, (pi) (Object) var2);
              hj.field_f.b((um) (Object) param1);
              if (param0 == 1963987425) {
                break L1;
              } else {
                field_c = null;
                break L1;
              }
            }
            stackOut_2_0 = (sa) var2;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2_ref;
            stackOut_4_1 = new StringBuilder().append("mg.D(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    final static void a(byte param0) {
        tm var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        tm var3 = null;
        tm var4 = null;
        RuntimeException decompiledCaughtException = null;
        var2 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              if (param0 <= -84) {
                break L1;
              } else {
                field_f = 8;
                break L1;
              }
            }
            L2: while (true) {
              tm dupTemp$4 = (tm) (Object) ok.field_b.e(63854);
              var3 = dupTemp$4;
              var1 = var3;
              if (null == dupTemp$4) {
                L3: while (true) {
                  tm dupTemp$5 = (tm) (Object) ec.field_c.e(63854);
                  var4 = dupTemp$5;
                  var1 = var4;
                  if (null == dupTemp$5) {
                    break L0;
                  } else {
                    ke.field_X[var4.field_s] = false;
                    continue L3;
                  }
                }
              } else {
                ke.field_X[var3.field_s] = false;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var1_ref, "mg.A(" + param0 + 41);
        }
    }

    mg(int param0, int param1, int param2) {
        ((mg) this).field_h = param0;
        ((mg) this).field_d = new int[param2 + 1];
        ((mg) this).field_i = param1;
    }

    final int b(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -23719) {
            break L0;
          } else {
            mg.a((byte) -12);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((mg) this).field_d == null) {
              break L2;
            } else {
              if (((mg) this).field_d.length == 0) {
                break L2;
              } else {
                stackOut_4_0 = ((mg) this).field_d[((mg) this).field_d.length + -1];
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0;
    }

    public static void a(int param0) {
        field_e = null;
        field_b = null;
        field_g = null;
        field_c = null;
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = MinerDisturbance.field_ab;
          if (((mg) this).field_d == null) {
            break L0;
          } else {
            if (0 == ((mg) this).field_d.length) {
              break L0;
            } else {
              var3 = 1;
              L1: while (true) {
                if (var3 >= ((mg) this).field_d.length) {
                  if (param1 == -24040) {
                    return ((mg) this).field_d.length - 1;
                  } else {
                    return -91;
                  }
                } else {
                  if (((mg) this).field_d[var3] + ((mg) this).field_d[-1 + var3] >> 1 > param0) {
                    return var3 - 1;
                  } else {
                    var3++;
                    continue L1;
                  }
                }
              }
            }
          }
        }
        return 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[1024];
        field_b = "Gas mask: Prevents gas causing asphyxiation.";
        field_g = "Click to continue";
        field_c = "Flaming Firework";
    }
}
