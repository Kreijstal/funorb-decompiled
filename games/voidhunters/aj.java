/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj extends rqa {
    static String field_o;
    static String field_p;

    aj(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void e(byte param0) {
        field_p = null;
        field_o = null;
        if (param0 != 32) {
            aj.e((byte) 122);
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              oq.field_s = param0[0].a(125);
              if (param1 <= -119) {
                break L1;
              } else {
                field_o = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = new nc("void");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("aj.A(");

            if (param0 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(String param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              rg.field_b = false;
              vu.field_xb = false;
              if (hwa.field_o == null) {
                break L1;
              } else {
                if (!hwa.field_o.field_z) {
                  break L1;
                } else {
                  L2: {
                    var3_int = 1;
                    if (-9 == (param2 ^ -1)) {
                      L3: {
                        if (!tla.field_c) {
                          param0 = vj.field_p;
                          break L3;
                        } else {
                          param0 = uaa.field_p;
                          break L3;
                        }
                      }
                      param2 = 2;
                      jt.field_o.a((byte) 9, qsb.field_d);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L4: {
                    if ((param2 ^ -1) != -11) {
                      break L4;
                    } else {
                      qob.a(92);
                      var3_int = 0;
                      break L4;
                    }
                  }
                  L5: {
                    if (var3_int == 0) {
                      break L5;
                    } else {
                      L6: {
                        if (!vu.field_xb) {
                          break L6;
                        } else {
                          param0 = isa.a(vpb.field_o, new String[]{param0}, 107);
                          break L6;
                        }
                      }
                      L7: {
                        if (kmb.field_c) {
                          param0 = bbb.field_a;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      hwa.field_o.a(true, param0, param2);
                      break L5;
                    }
                  }
                  if (param2 == 256) {
                    break L1;
                  } else {
                    if (-11 != (param2 ^ -1)) {
                      if (tla.field_c) {
                        break L1;
                      } else {
                        jt.field_o.i((byte) -29);
                        break L1;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            if (param1 >= 5) {
              break L0;
            } else {
              field_p = (String) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var3);

            stackIn_27_1 = new StringBuilder().append("aj.B(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L8;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L8;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_o = "Repair mode in <%0>";
        field_p = "Options Menu";
    }
}
