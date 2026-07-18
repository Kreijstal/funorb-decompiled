/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

class rg extends jk implements sh {
    static boolean[] field_ub;
    private we field_vb;
    private boolean field_ob;
    static ea[] field_tb;
    private boolean field_rb;
    static int field_wb;
    private oi field_pb;
    private boolean field_qb;
    static int field_sb;
    private boolean field_nb;

    final static gj a(String param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        gj stackIn_4_0 = null;
        gj stackIn_7_0 = null;
        gj stackIn_16_0 = null;
        gj stackIn_19_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        gj stackOut_3_0 = null;
        gj stackOut_15_0 = null;
        gj stackOut_18_0 = null;
        gj stackOut_6_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var5 = MinerDisturbance.field_ab;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackOut_3_0 = dh.field_d;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          } else {
            if (var2_int <= 63) {
              var3 = 0;
              L0: while (true) {
                if (var3 >= var2_int) {
                  return null;
                } else {
                  L1: {
                    var4 = param0.charAt(var3);
                    if (var4 == 45) {
                      L2: {
                        if (var3 == 0) {
                          break L2;
                        } else {
                          if (var2_int + -1 == var3) {
                            break L2;
                          } else {
                            break L1;
                          }
                        }
                      }
                      stackOut_15_0 = vh.field_f;
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0;
                    } else {
                      if (wd.field_d.indexOf(var4) != -1) {
                        break L1;
                      } else {
                        stackOut_18_0 = vh.field_f;
                        stackIn_19_0 = stackOut_18_0;
                        return stackIn_19_0;
                      }
                    }
                  }
                  var3++;
                  continue L0;
                }
              }
            } else {
              stackOut_6_0 = ec.field_d;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var2;
            stackOut_24_1 = new StringBuilder().append("rg.C(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L3;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L3;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + true + ')');
        }
    }

    rg(hm param0, we param1, String param2, boolean param3, boolean param4) {
        super(param0, (fe) (Object) new fm((rg) null, param1, param2), 77, 10, 10);
        try {
            ((rg) this).field_qb = false;
            ((rg) this).field_vb = param1;
            ((rg) this).field_rb = param4 ? true : false;
            ((rg) this).field_ob = false;
            ((rg) this).field_nb = param3 ? true : false;
            ((rg) this).field_pb = new oi(13, 50, 274, 30, 15, 2113632, 4210752);
            ((rg) this).field_pb.field_O = true;
            ((rg) this).a(-1, (fe) (Object) ((rg) this).field_pb);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "rg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void i(byte param0) {
        ((rg) this).field_pb.a(4210752, 2121792, (byte) -112);
        if (param0 != -97) {
            return;
        }
        fm var2 = new fm((rg) this, ((rg) this).field_vb, pn.field_f);
        var2.a(15, ee.field_K, param0 ^ 54);
        ((rg) this).a((byte) -56, (fe) (Object) var2);
    }

    public void a(int param0, byte param1, hc param2, int param3, int param4) {
        RuntimeException var6 = null;
        Object var7 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (((rg) this).field_qb) {
                oj.a(3, 3);
                ((rg) this).s(2121792);
                break L1;
              } else {
                jk.a(bm.c(-121), 78, "tochangedisplayname.ws");
                break L1;
              }
            }
            L2: {
              if (param1 == 6) {
                break L2;
              } else {
                var7 = null;
                ((rg) this).a((String) null, 94, (byte) -118);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var6;
            stackOut_6_1 = new StringBuilder().append("rg.B(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(String param0, int param1, byte param2) {
        RuntimeException var4 = null;
        fm var4_ref = null;
        int var5 = 0;
        fm var6 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        fm stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        fm stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        fm stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        String stackIn_16_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        fm stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        fm stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        String stackOut_15_2 = null;
        fm stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        String stackOut_14_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var5 = MinerDisturbance.field_ab;
        try {
          L0: {
            if (((rg) this).field_ob) {
              return;
            } else {
              L1: {
                stackOut_4_0 = this;
                stackIn_6_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (256 != param1) {
                  stackOut_6_0 = this;
                  stackOut_6_1 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  break L1;
                } else {
                  stackOut_5_0 = this;
                  stackOut_5_1 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L1;
                }
              }
              L2: {
                ((rg) this).field_qb = stackIn_7_1 != 0;
                ((rg) this).field_ob = true;
                ((rg) this).field_pb.a(4210752, 8405024, (byte) -128);
                if (param2 <= -43) {
                  break L2;
                } else {
                  ((rg) this).field_rb = false;
                  break L2;
                }
              }
              L3: {
                var6 = new fm((rg) this, ((rg) this).field_vb, param0);
                var4_ref = var6;
                if (5 != param1) {
                  if (param1 != 256) {
                    L4: {
                      stackOut_13_0 = (fm) var6;
                      stackOut_13_1 = -1;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_15_1 = stackOut_13_1;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      if (((rg) this).field_nb) {
                        stackOut_15_0 = (fm) (Object) stackIn_15_0;
                        stackOut_15_1 = stackIn_15_1;
                        stackOut_15_2 = af.field_s;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        stackIn_16_2 = stackOut_15_2;
                        break L4;
                      } else {
                        stackOut_14_0 = (fm) (Object) stackIn_14_0;
                        stackOut_14_1 = stackIn_14_1;
                        stackOut_14_2 = hk.field_d;
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        stackIn_16_2 = stackOut_14_2;
                        break L4;
                      }
                    }
                    ((fm) (Object) stackIn_16_0).a(stackIn_16_1, stackIn_16_2, -89);
                    break L3;
                  } else {
                    hc discarded$2 = var6.a(af.field_s, 95, (rm) this);
                    break L3;
                  }
                } else {
                  var6.a(11, pc.field_i, -89);
                  var6.a(17, o.field_b, -68);
                  break L3;
                }
              }
              L5: {
                if (param1 == 3) {
                  var6.a(7, wb.field_q, -82);
                  break L5;
                } else {
                  if (4 == param1) {
                    var6.a(8, kd.field_e, -116);
                    break L5;
                  } else {
                    if (param1 != 6) {
                      if (param1 != 9) {
                        break L5;
                      } else {
                        hc discarded$3 = var6.a(bm.field_k, 66, (rm) this);
                        break L5;
                      }
                    } else {
                      var6.a(9, gj.field_b, -98);
                      break L5;
                    }
                  }
                }
              }
              ((rg) this).a((byte) -62, (fe) (Object) var6);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var4;
            stackOut_27_1 = new StringBuilder().append("rg.A(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L6;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L6;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean a(char param0, fe param1, byte param2, int param3) {
        RuntimeException var5 = null;
        Object var6 = null;
        int stackIn_5_0 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        boolean stackOut_6_0 = false;
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
              if (param2 == -79) {
                break L1;
              } else {
                var6 = null;
                ((rg) this).a(3, (byte) 82, (hc) null, -71, 108);
                break L1;
              }
            }
            if (param3 == 13) {
              ((rg) this).s(2121792);
              stackOut_4_0 = 1;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              stackOut_6_0 = super.a(param0, param1, (byte) -79, param3);
              stackIn_7_0 = stackOut_6_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("rg.K(").append(param0).append(',');
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
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_7_0;
    }

    final void s(int param0) {
        if (((rg) this).field_K) {
          L0: {
            if (param0 == 2121792) {
              break L0;
            } else {
              field_wb = -29;
              break L0;
            }
          }
          L1: {
            ((rg) this).field_K = false;
            if (((rg) this).field_nb) {
              fd.a(true);
              break L1;
            } else {
              if (!((rg) this).field_rb) {
                break L1;
              } else {
                r.a((byte) -127);
                break L1;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void r(int param0) {
        field_ub = null;
        field_tb = null;
        if (param0 != 28776) {
            field_sb = -1;
        }
    }

    static {
    }
}
