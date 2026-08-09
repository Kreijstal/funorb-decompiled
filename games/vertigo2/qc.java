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
        bk stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                field_t = -26;
                break L1;
              }
            }
            stackIn_3_0 = new bk(param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("qc.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    abstract boolean i(int param0);

    final static void a(String param0, int param1) {
        int stackIn_17_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              qf.field_b = qf.field_b + 1;
              if (0 != (ek.field_E ^ -1)) {
                break L1;
              } else {
                if ((or.field_c ^ -1) == 0) {
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
                  if (param0.equals(as.field_a)) {
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
                      stackIn_17_0 = 1;
                      break L4;
                    } else {
                      stackIn_17_0 = 0;
                      break L4;
                    }
                  } else {
                    stackIn_17_0 = 0;
                    break L4;
                  }
                } else {
                  stackIn_17_0 = 0;
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
            var2_int = -102 % ((-47 - param1) / 38);
            ek.field_E = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackIn_43_0 = (RuntimeException) (var2);

            stackIn_43_1 = new StringBuilder().append("qc.E(");

            if (param0 == null) {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "null";
              break L9;
            } else {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "{...}";
              break L9;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ',' + param1 + ')');
        }
    }

    qc(int param0) {
        this.field_C = param0;
    }

    static {
        field_u = "This option cannot be combined with the current settings for:  ";
        field_y = "Enter name of player to delete from list";
    }
}
