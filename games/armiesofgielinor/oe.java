/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe extends ro implements he {
    private boolean field_Ab;
    private kd field_xb;
    static at field_Bb;
    private boolean field_yb;
    static je field_Cb;
    static String field_zb;

    final boolean a(byte param0) {
        wd var2 = null;
        Object var3 = null;
        if (param0 == -1) {
          if (((oe) this).field_L) {
            if (!((oe) this).field_Ab) {
              var2 = ki.a(-61440);
              if (var2 == null) {
                return super.a((byte) -1);
              } else {
                this.a(false, (byte) -53, var2);
                return super.a((byte) -1);
              }
            } else {
              return super.a((byte) -1);
            }
          } else {
            return super.a((byte) -1);
          }
        } else {
          var3 = null;
          this.a(true, (byte) 54, (wd) null);
          if (((oe) this).field_L) {
            if (((oe) this).field_Ab) {
              return super.a((byte) -1);
            } else {
              L0: {
                var2 = ki.a(-61440);
                if (var2 != null) {
                  this.a(false, (byte) -53, var2);
                  break L0;
                } else {
                  break L0;
                }
              }
              return super.a((byte) -1);
            }
          } else {
            return super.a((byte) -1);
          }
        }
    }

    public static void j(byte param0) {
        field_Cb = null;
        field_Bb = null;
        field_zb = null;
        int var1 = -4;
    }

    final void k(byte param0) {
        this.a(true, (byte) -103, il.a(-1, 248, bp.field_m));
        if (param0 >= -81) {
            ((oe) this).field_Ab = false;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param6 < param4) {
          if (param2 <= param4) {
            if (param6 < param2) {
              vp.a(param2, param6, param3, param4, param7, param5, qn.field_d, param1, (byte) 20);
              return;
            } else {
              vp.a(param6, param2, param3, param4, param1, param5, qn.field_d, param7, (byte) 20);
              return;
            }
          } else {
            vp.a(param4, param6, param7, param2, param3, param5, qn.field_d, param1, (byte) 20);
            return;
          }
        } else {
          if (param2 <= param6) {
            if (param4 < param2) {
              vp.a(param2, param4, param1, param6, param7, param5, qn.field_d, param3, (byte) 20);
              return;
            } else {
              vp.a(param4, param2, param1, param6, param3, param5, qn.field_d, param7, (byte) 20);
              return;
            }
          } else {
            vp.a(param6, param4, param7, param2, param1, param5, qn.field_d, param3, (byte) 20);
            return;
          }
        }
    }

    public final void a(int param0, int param1, int param2, int param3, fw param4) {
        if (((oe) this).field_yb) {
            td.a(false, true, 21);
            return;
        }
        try {
            bt.b(param1 ^ param1);
            ((oe) this).b(true);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "oe.N(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(boolean param0, byte param1, wd param2) {
        RuntimeException var4 = null;
        String var4_ref = null;
        ad var5 = null;
        int var6 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              ((oe) this).field_Ab = true;
              if (!param2.field_a) {
                if (null == param2.field_c) {
                  var4_ref = param2.field_i;
                  if (param2.field_d == 248) {
                    L2: {
                      if (!param0) {
                        no.b(false);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    var4_ref = bp.field_m;
                    ((oe) this).field_yb = true;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  var4_ref = oc.field_Ob;
                  if (null == ((oe) this).field_xb) {
                    break L1;
                  } else {
                    ((oe) this).field_xb.a((byte) -116);
                    break L1;
                  }
                }
              } else {
                var4_ref = eq.field_i;
                break L1;
              }
            }
            L3: {
              if (param1 < -2) {
                break L3;
              } else {
                ((oe) this).field_xb = null;
                break L3;
              }
            }
            L4: {
              var5 = new ad((ro) this, bv.field_t, var4_ref);
              if (param2.field_a) {
                if (param2.field_h) {
                  ((oe) this).a((kb) (Object) new qd((oe) this), (byte) -81);
                  return;
                } else {
                  fw discarded$2 = var5.a(ro.field_kb, (qo) this, (byte) -61);
                  break L4;
                }
              } else {
                L5: {
                  if (!((oe) this).field_yb) {
                    if (param2.field_d != 5) {
                      var5.a(fj.field_a, -1, 1);
                      break L5;
                    } else {
                      var5.a(me.field_d, 11, 1);
                      var5.a(dt.field_c, 17, 1);
                      break L5;
                    }
                  } else {
                    fw discarded$3 = var5.a(ro.field_kb, (qo) this, (byte) 110);
                    break L5;
                  }
                }
                if (param2.field_d == 3) {
                  var5.a(te.field_m, 7, 1);
                  break L4;
                } else {
                  if (6 != param2.field_d) {
                    break L4;
                  } else {
                    var5.a(ag.field_O, 9, 1);
                    break L4;
                  }
                }
              }
            }
            ((oe) this).a((kb) (Object) var5, (byte) -110);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var4;
            stackOut_31_1 = new StringBuilder().append("oe.U(").append(param0).append(',').append(param1).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param2 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L6;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L6;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ')');
        }
    }

    oe(gk param0, kd param1) {
        super(param0, bv.field_t, wm.field_d, false, false);
        try {
            ((oe) this).field_xb = param1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "oe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static int c(int param0, int param1) {
        return param0 | param1;
    }

    final static void a(byte[] param0, int param1) {
        if (!(1 <= param0[0])) {
            return;
        }
        try {
            wp.field_E = param0[1];
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "oe.S(" + (param0 != null ? "{...}" : "null") + ',' + 1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Bb = new at();
        field_zb = "Withdraw invitation to <%0> to join this game";
    }
}
