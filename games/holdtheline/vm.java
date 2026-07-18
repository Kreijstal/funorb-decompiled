/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vm extends ab implements pi {
    private boolean field_wb;
    static String field_zb;
    private a field_sb;
    private boolean field_yb;
    static hj[] field_Ab;
    static String field_ub;
    static String field_xb;
    static int field_Bb;
    static String field_tb;
    static hj field_vb;

    final boolean g(byte param0) {
        nd var2 = null;
        if (((vm) this).field_F) {
          if (!((vm) this).field_wb) {
            var2 = th.c((byte) -67);
            if (var2 != null) {
              this.a((byte) 100, false, var2);
              if (param0 != 39) {
                return false;
              } else {
                return super.g((byte) 39);
              }
            } else {
              if (param0 != 39) {
                return false;
              } else {
                return super.g((byte) 39);
              }
            }
          } else {
            if (param0 != 39) {
              return false;
            } else {
              return super.g((byte) 39);
            }
          }
        } else {
          if (param0 != 39) {
            return false;
          } else {
            return super.g((byte) 39);
          }
        }
    }

    private final void a(byte param0, boolean param1, nd param2) {
        RuntimeException var4 = null;
        String var4_ref = null;
        nh var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var7 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              ((vm) this).field_wb = true;
              var6 = 74 / ((7 - param0) / 34);
              if (!param2.field_f) {
                if (null != param2.field_j) {
                  var4_ref = ud.field_j;
                  if (((vm) this).field_sb == null) {
                    break L1;
                  } else {
                    ((vm) this).field_sb.a((byte) 125);
                    break L1;
                  }
                } else {
                  var4_ref = param2.field_d;
                  if (param2.field_b != 248) {
                    break L1;
                  } else {
                    L2: {
                      if (!param1) {
                        qf.a(true);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    var4_ref = vn.field_e;
                    ((vm) this).field_yb = true;
                    break L1;
                  }
                }
              } else {
                var4_ref = nh.field_H;
                break L1;
              }
            }
            L3: {
              var5 = new nh((ab) this, de.field_I, var4_ref);
              if (param2.field_f) {
                if (param2.field_i) {
                  ((vm) this).a((n) (Object) new bj((vm) this), (byte) 126);
                  return;
                } else {
                  rm discarded$2 = var5.a(112, (tb) this, sf.field_j);
                  break L3;
                }
              } else {
                L4: {
                  if (((vm) this).field_yb) {
                    rm discarded$3 = var5.a(81, (tb) this, sf.field_j);
                    break L4;
                  } else {
                    if (param2.field_b == 5) {
                      var5.a(11, vn.field_b, (byte) 66);
                      var5.a(17, dl.field_n, (byte) 120);
                      break L4;
                    } else {
                      var5.a(-1, kn.field_i, (byte) 108);
                      break L4;
                    }
                  }
                }
                if (param2.field_b == 3) {
                  var5.a(7, ek.field_u, (byte) 61);
                  break L3;
                } else {
                  if (param2.field_b != 6) {
                    break L3;
                  } else {
                    var5.a(9, gb.field_d, (byte) 77);
                    break L3;
                  }
                }
              }
            }
            ((vm) this).a((n) (Object) var5, (byte) 127);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var4;
            stackOut_28_1 = new StringBuilder().append("vm.EA(").append(param0).append(',').append(param1).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param2 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L5;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L5;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ')');
        }
    }

    public static void p(int param0) {
        field_Ab = null;
        if (param0 != -7) {
          field_ub = null;
          field_xb = null;
          field_ub = null;
          field_tb = null;
          field_zb = null;
          field_vb = null;
          return;
        } else {
          field_xb = null;
          field_ub = null;
          field_tb = null;
          field_zb = null;
          field_vb = null;
          return;
        }
    }

    public final void a(int param0, rm param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        Object var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            if (!((vm) this).field_yb) {
              L1: {
                hk.a(true);
                if (param2 != -4) {
                  var7 = null;
                  this.a((byte) 98, true, (nd) null);
                  ((vm) this).h((byte) -72);
                  break L1;
                } else {
                  ((vm) this).h((byte) -72);
                  break L1;
                }
              }
              break L0;
            } else {
              cg.a((byte) -93, true, false);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var6;
            stackOut_8_1 = new StringBuilder().append("vm.M(").append(param0).append(',');
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
          throw kk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void q(int param0) {
        if (param0 > -113) {
            return;
        }
        this.a((byte) -39, true, ij.a(vn.field_e, 256, 248));
    }

    vm(qj param0, a param1) {
        super(param0, de.field_I, na.field_o, false, false);
        try {
            ((vm) this).field_sb = param1;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "vm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_zb = "<br>Lap: ";
        field_ub = "Unable to connect to the data server. Please check any firewall you are using.";
        field_Bb = 0;
        field_tb = "<col=2>Not complete</col>";
        field_xb = "<img=0>, <img=7>";
    }
}
