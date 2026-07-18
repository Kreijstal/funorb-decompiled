/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

class na extends ud implements vd {
    private boolean field_gb;
    static dl field_eb;
    private boolean field_db;
    private boolean field_ib;
    static int field_kb;
    static String field_fb;
    private vc field_jb;
    private boolean field_hb;
    private co field_cb;

    final static int a(eb param0, boolean param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
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
              if (param2 == 10) {
                break L1;
              } else {
                field_fb = null;
                break L1;
              }
            }
            stackOut_2_0 = param0.a(36, param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("na.GA(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
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
          throw dn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, int param1, String param2) {
        RuntimeException var4 = null;
        jd var4_ref = null;
        int var5 = 0;
        jd var6 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        jd stackIn_11_0 = null;
        jd stackIn_12_0 = null;
        jd stackIn_13_0 = null;
        String stackIn_13_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        jd stackOut_10_0 = null;
        jd stackOut_12_0 = null;
        String stackOut_12_1 = null;
        jd stackOut_11_0 = null;
        String stackOut_11_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var5 = CrazyCrystals.field_B;
        try {
          L0: {
            if (!((na) this).field_hb) {
              L1: {
                ((na) this).field_hb = true;
                stackOut_3_0 = this;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (param0 != 256) {
                  stackOut_5_0 = this;
                  stackOut_5_1 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  break L1;
                } else {
                  stackOut_4_0 = this;
                  stackOut_4_1 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  break L1;
                }
              }
              L2: {
                ((na) this).field_gb = stackIn_6_1 != 0;
                ((na) this).field_cb.b((byte) -116, 4210752, 8405024);
                if (param1 == 1833) {
                  break L2;
                } else {
                  na.m(-107);
                  break L2;
                }
              }
              L3: {
                var6 = new jd((na) this, ((na) this).field_jb, param2);
                var4_ref = var6;
                if (param0 == 5) {
                  var6.a(ng.field_i, (byte) -124, 11);
                  var6.a(dn.field_c, (byte) -124, 17);
                  break L3;
                } else {
                  if (param0 == 256) {
                    pc discarded$2 = var6.a(ba.field_l, (bi) this, 98);
                    break L3;
                  } else {
                    L4: {
                      stackOut_10_0 = (jd) var6;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_11_0 = stackOut_10_0;
                      if (!((na) this).field_ib) {
                        stackOut_12_0 = (jd) (Object) stackIn_12_0;
                        stackOut_12_1 = cf.field_h;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        break L4;
                      } else {
                        stackOut_11_0 = (jd) (Object) stackIn_11_0;
                        stackOut_11_1 = ba.field_l;
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_13_1 = stackOut_11_1;
                        break L4;
                      }
                    }
                    ((jd) (Object) stackIn_13_0).a(stackIn_13_1, (byte) -124, -1);
                    break L3;
                  }
                }
              }
              L5: {
                if (param0 != 3) {
                  if (4 == param0) {
                    var6.a(pg.field_b, (byte) -124, 8);
                    break L5;
                  } else {
                    if (6 != param0) {
                      if (param0 != 9) {
                        break L5;
                      } else {
                        pc discarded$3 = var6.a(nk.field_k, (bi) this, 52);
                        break L5;
                      }
                    } else {
                      var6.a(sb.field_C, (byte) -124, 9);
                      break L5;
                    }
                  }
                } else {
                  var6.a(ik.field_f, (byte) -124, 7);
                  break L5;
                }
              }
              ((na) this).a((qm) (Object) var6, (byte) -50);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var4;
            stackOut_26_1 = new StringBuilder().append("na.IA(").append(param0).append(',').append(param1).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param2 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L6;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L6;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ')');
        }
    }

    final void l(int param0) {
        jd var2 = null;
        Object var3 = null;
        if (param0 < 117) {
          var3 = null;
          ((na) this).a((byte) -113, -16, -83, 107, (pc) null);
          ((na) this).field_cb.b((byte) 0, 4210752, 2121792);
          var2 = new jd((na) this, ((na) this).field_jb, kj.field_c);
          var2.a(vm.field_e, (byte) -124, 15);
          ((na) this).a((qm) (Object) var2, (byte) -50);
          return;
        } else {
          ((na) this).field_cb.b((byte) 0, 4210752, 2121792);
          var2 = new jd((na) this, ((na) this).field_jb, kj.field_c);
          var2.a(vm.field_e, (byte) -124, 15);
          ((na) this).a((qm) (Object) var2, (byte) -50);
          return;
        }
    }

    final static void a(int param0, boolean param1, f[][] param2, int param3, int param4) {
        try {
            ul.a(new mj(param0, param3, -1, 0), param1, param2, (byte) 102);
            ul.a(new mj(param0, param3, 1, 0), param1, param2, (byte) 48);
            ul.a(new mj(param0, param3, 0, -1), param1, param2, (byte) 92);
            if (param4 != 77) {
                na.a(-116, false, (f[][]) null, -41, 3);
            }
            ul.a(new mj(param0, param3, 0, 1), param1, param2, (byte) 113);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "na.JA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public void a(byte param0, int param1, int param2, int param3, pc param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          var6_int = -78 / ((param0 - 83) / 36);
          if (((na) this).field_gb) {
            rc.a(-25537, 3);
            ((na) this).i((byte) -65);
            return;
          } else {
            vo.a(31251, "tochangedisplayname.ws", le.b((byte) -20));
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var6 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var6;
            stackOut_4_1 = new StringBuilder().append("na.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param4 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L0;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L0;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    na(ol param0, vc param1, String param2, boolean param3, boolean param4) {
        super(param0, (qm) (Object) new jd((na) null, param1, param2), 77, 10, 10);
        try {
            ((na) this).field_gb = false;
            ((na) this).field_hb = false;
            ((na) this).field_jb = param1;
            ((na) this).field_db = param4 ? true : false;
            ((na) this).field_ib = param3 ? true : false;
            ((na) this).field_cb = new co(13, 50, 274, 30, 15, 2113632, 4210752);
            ((na) this).field_cb.field_H = true;
            ((na) this).b((qm) (Object) ((na) this).field_cb, -117);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "na.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(int param0, int param1, qm param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_7_0 = false;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            if (13 == param0) {
              ((na) this).i((byte) -52);
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (param1 == 19279) {
                stackOut_7_0 = super.a(param0, 19279, param2, param3);
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var5;
            stackOut_9_1 = new StringBuilder().append("na.AA(").append(param0).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L1;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param3 + ')');
        }
        return stackIn_8_0;
    }

    public static void m(int param0) {
        if (param0 != -18883) {
            return;
        }
        field_eb = null;
        field_fb = null;
    }

    final void i(byte param0) {
        Object var3 = null;
        if (((na) this).field_C) {
          ((na) this).field_C = false;
          if (((na) this).field_ib) {
            wm.b((byte) -12);
            if (param0 <= -9) {
              return;
            } else {
              var3 = null;
              int discarded$6 = na.a((eb) null, false, 44);
              return;
            }
          } else {
            if (!((na) this).field_db) {
              if (param0 > -9) {
                var3 = null;
                int discarded$7 = na.a((eb) null, false, 44);
                return;
              } else {
                return;
              }
            } else {
              mo.a((byte) -103);
              if (param0 <= -9) {
                return;
              } else {
                var3 = null;
                int discarded$8 = na.a((eb) null, false, 44);
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_fb = "Updates will sent to the email address you've given";
    }
}
