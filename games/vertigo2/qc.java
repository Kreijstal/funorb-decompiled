/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qc extends gp {
    static r field_B;
    static db field_v;
    static int field_A;
    int field_C;
    static String field_y;
    static String field_u;
    static int field_z;
    static int field_t;
    static byte[] field_w;
    static cc field_x;

    abstract Object a(byte param0);

    public static void h(int param0) {
        field_y = null;
        field_u = null;
        field_x = null;
        field_B = null;
        if (param0 != 0) {
          qc.h(126);
          field_v = null;
          field_w = null;
          return;
        } else {
          field_v = null;
          field_w = null;
          return;
        }
    }

    final static bk a(int param0, String param1) {
        RuntimeException var2 = null;
        bk stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        bk stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = new bk(param1);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("qc.A(").append(0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
        return stackIn_1_0;
    }

    abstract boolean i(int param0);

    final static void a(String param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var3 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              qf.field_b = qf.field_b + 1;
              if (ek.field_E != -1) {
                break L1;
              } else {
                if (or.field_c == -1) {
                  ek.field_E = ed.field_n;
                  or.field_c = gb.field_d;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                if (param0 != null) {
                  if (param0.equals((Object) (Object) as.field_a)) {
                    break L2;
                  } else {
                    break L3;
                  }
                } else {
                  if (null != as.field_a) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (!gl.field_o) {
                  if (qf.field_b >= aj.field_h) {
                    if (aj.field_h + ea.field_g > qf.field_b) {
                      stackOut_15_0 = 1;
                      stackIn_17_0 = stackOut_15_0;
                      break L4;
                    } else {
                      stackOut_14_0 = 0;
                      stackIn_17_0 = stackOut_14_0;
                      break L4;
                    }
                  } else {
                    stackOut_12_0 = 0;
                    stackIn_17_0 = stackOut_12_0;
                    break L4;
                  }
                } else {
                  stackOut_10_0 = 0;
                  stackIn_17_0 = stackOut_10_0;
                  break L4;
                }
              }
              L5: {
                var2_int = stackIn_17_0;
                if (param0 == null) {
                  qf.field_b = 0;
                  break L5;
                } else {
                  if (gl.field_o) {
                    qf.field_b = aj.field_h;
                    break L5;
                  } else {
                    if (var2_int != 0) {
                      qf.field_b = aj.field_h;
                      break L5;
                    } else {
                      qf.field_b = 0;
                      break L5;
                    }
                  }
                }
              }
              L6: {
                if (param0 == null) {
                  if (var2_int == 0) {
                    break L6;
                  } else {
                    gl.field_o = true;
                    break L6;
                  }
                } else {
                  gl.field_o = false;
                  break L6;
                }
              }
              hn.field_n = ek.field_E;
              rl.field_db = or.field_c;
              break L2;
            }
            L7: {
              as.field_a = param0;
              if (gl.field_o) {
                break L7;
              } else {
                if (qf.field_b >= aj.field_h) {
                  break L7;
                } else {
                  if (wo.field_s) {
                    hn.field_n = ek.field_E;
                    qf.field_b = 0;
                    rl.field_db = or.field_c;
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
            }
            L8: {
              if (!gl.field_o) {
                break L8;
              } else {
                if (qf.field_b == td.field_g) {
                  gl.field_o = false;
                  qf.field_b = 0;
                  break L8;
                } else {
                  break L8;
                }
              }
            }
            or.field_c = -1;
            var2_int = 0;
            ek.field_E = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var2;
            stackOut_41_1 = new StringBuilder().append("qc.E(");
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param0 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L9;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L9;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + 44 + 74 + 41);
        }
    }

    qc(int param0) {
        ((qc) this).field_C = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "This option cannot be combined with the current settings for:  ";
        field_y = "Enter name of player to delete from list";
    }
}
