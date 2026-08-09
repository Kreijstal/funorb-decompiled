/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lh {
    static fa field_b;
    lh field_a;
    static String field_d;
    static sk field_g;
    long field_c;
    static int[][] field_e;
    static int field_f;
    lh field_h;

    final boolean b(byte param0) {
        if (null != this.field_a) {
          if (param0 != -54) {
            lh.a(-118, -117, -87, false, -11, -87, -1);
            return true;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final static void a(boolean param0) {
        if (rh.field_p != null) {
          lh.a((byte) -97, rh.field_p);
          rh.field_p.a(fg.field_q, 20401);
          rh.field_p = null;
          if (aa.field_r == null) {
            ol.field_e.requestFocus();
            if (param0) {
              field_e = (int[][]) null;
              return;
            } else {
              return;
            }
          } else {
            aa.field_r.a(-115);
            ol.field_e.requestFocus();
            if (!param0) {
              return;
            } else {
              field_e = (int[][]) null;
              return;
            }
          }
        } else {
          return;
        }
    }

    final void c(int param0) {
        if (this.field_a == null) {
          return;
        } else {
          if (param0 != -1) {
            return;
          } else {
            this.field_a.field_h = this.field_h;
            this.field_h.field_a = this.field_a;
            this.field_h = null;
            this.field_a = null;
            return;
          }
        }
    }

    public static void b(int param0) {
        field_b = null;
        field_e = (int[][]) null;
        field_g = null;
        field_d = null;
        if (param0 != 1) {
            field_b = (fa) null;
        }
    }

    final static dd[] a(int param0, int param1, byte param2, int param3) {
        int var4 = 22 % ((-22 - param2) / 59);
        return cb.a(1, param0, 0, param3, param1);
    }

    final static void a(byte param0, java.awt.Canvas param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ca.a((java.awt.Component) ((Object) param1), (byte) 83);
              ui.a((java.awt.Component) ((Object) param1), 122);
              if (param0 < -4) {
                break L1;
              } else {
                field_f = 38;
                break L1;
              }
            }
            if (ui.field_pb == null) {
              break L0;
            } else {
              ui.field_pb.a((byte) 103, (java.awt.Component) ((Object) param1));
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("lh.PC(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    final static boolean a(String param0, String param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!fm.a(true, param0)) {
              if (hg.a(param0, 1)) {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (o.a(false, param0)) {
                  stackIn_10_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if ((param1.length() ^ -1) == param2) {
                    stackIn_14_0 = 1;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (!hj.a(param0, param1, 0)) {
                      if (!hf.a((byte) 98, param0, param1)) {
                        if (gl.a(param1, -1, param0)) {
                          stackIn_24_0 = 0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          return true;
                        }
                      } else {
                        stackIn_20_0 = 0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      stackIn_17_0 = 0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                }
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var3);

            stackIn_27_1 = new StringBuilder().append("lh.UC(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L1;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');

            if (param1 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L2;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_28_0), stackIn_31_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_17_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_20_0 != 0;
                  } else {
                    return stackIn_24_0 != 0;
                  }
                }
              }
            }
          }
        }
    }

    final static boolean a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6) {
        if (param3) {
          if (param5 >= param4) {
            if (param5 < param4 + param2) {
              if (param6 >= param0) {
                if (param6 >= param1 + param0) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          lh.a(-73, 30, -70, true, -43, 84, 103);
          if (param5 >= param4) {
            if (param5 < param4 + param2) {
              if (param6 >= param0) {
                if (param6 >= param1 + param0) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    static {
        field_e = new int[160][100];
        field_d = "Use this alternative as your account name";
    }
}
