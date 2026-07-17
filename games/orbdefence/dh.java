/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.String;

class dh extends hl implements ai {
    private kc field_db;
    private dg field_ab;
    static tl field_bb;
    static hj field_X;
    static int field_Z;
    private boolean field_cb;
    private boolean field_eb;
    private boolean field_W;
    private boolean field_Y;

    final boolean a(char param0, int param1, pj param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
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
        int stackOut_5_0 = 0;
        boolean stackOut_7_0 = false;
        int stackOut_1_0 = 0;
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
            if (param3 == 0) {
              if (param1 == 13) {
                ((dh) this).q(4210752);
                stackOut_5_0 = 1;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              } else {
                stackOut_7_0 = super.a(param0, param1, param2, 0);
                stackIn_8_0 = stackOut_7_0;
                break L0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var5;
            stackOut_9_1 = new StringBuilder().append("dh.I(").append(param0).append(44).append(param1).append(44);
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
          throw dd.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param3 + 41);
        }
        return stackIn_8_0;
    }

    public static void e(byte param0) {
        field_bb = null;
        field_X = null;
    }

    final static String a(int param0, long param1) {
        qc.field_c.setTime(new Date(param1));
        int var3 = qc.field_c.get(7);
        int var4 = qc.field_c.get(5);
        int var5 = qc.field_c.get(2);
        int var6 = qc.field_c.get(1);
        int var7 = qc.field_c.get(11);
        int var8 = qc.field_c.get(12);
        int var9 = qc.field_c.get(13);
        if (param0 != -15591) {
            field_bb = null;
        }
        return te.field_N[var3 + -1] + ", " + var4 / 10 + var4 % 10 + "-" + md.field_e[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    final void d(byte param0) {
        ((dh) this).field_ab.a(16711422, 2121792, 4210752);
        int var2 = 96 % ((param0 - 8) / 44);
        ec var3 = new ec((dh) this, ((dh) this).field_db, oa.field_e);
        var3.a(il.field_d, 15, -15858);
        ((dh) this).a(false, (pj) (Object) var3);
    }

    final void q(int param0) {
        if (param0 != 4210752) {
            Object var3 = null;
            ((dh) this).a((byte) 120, -34, 27, (s) null, 96);
        }
        if (!((dh) this).field_A) {
            return;
        }
        ((dh) this).field_A = false;
        if (((dh) this).field_W) {
            jk.a(121);
        } else {
            if (!(!((dh) this).field_cb)) {
                rf.d(false);
            }
        }
    }

    final static e a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_9_0 = null;
        e stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        e stackOut_11_0 = null;
        Object stackOut_8_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            var3 = 0;
            L1: while (true) {
              if (var3 >= var2_int) {
                stackOut_11_0 = ba.field_a;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                var4 = param0.charAt(var3);
                if (48 <= var4) {
                  if (57 >= var4) {
                    var3++;
                    continue L1;
                  } else {
                    stackOut_8_0 = null;
                    stackIn_9_0 = stackOut_8_0;
                    return (e) (Object) stackIn_9_0;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var2;
            stackOut_13_1 = new StringBuilder().append("dh.MA(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + 118 + 41);
        }
        return stackIn_12_0;
    }

    final void a(int param0, int param1, String param2) {
        RuntimeException var4 = null;
        ec var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        ec var7 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        ec stackIn_11_0 = null;
        ec stackIn_12_0 = null;
        ec stackIn_13_0 = null;
        String stackIn_13_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        ec stackOut_10_0 = null;
        ec stackOut_12_0 = null;
        String stackOut_12_1 = null;
        ec stackOut_11_0 = null;
        String stackOut_11_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (((dh) this).field_Y) {
              return;
            } else {
              L1: {
                ((dh) this).field_Y = true;
                stackOut_4_0 = this;
                stackIn_6_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (param1 != 256) {
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
                ((dh) this).field_eb = stackIn_7_1 != 0;
                ((dh) this).field_ab.a(16711422, 8405024, 4210752);
                var7 = new ec((dh) this, ((dh) this).field_db, param2);
                var4_ref = var7;
                var5 = -74 % ((param0 - 43) / 46);
                if (param1 == 5) {
                  var7.a(vc.field_n, 11, -15858);
                  var7.a(ld.field_d, 17, -15858);
                  break L2;
                } else {
                  if (param1 != 256) {
                    L3: {
                      stackOut_10_0 = (ec) var7;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_11_0 = stackOut_10_0;
                      if (((dh) this).field_W) {
                        stackOut_12_0 = (ec) (Object) stackIn_12_0;
                        stackOut_12_1 = tk.field_l;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        break L3;
                      } else {
                        stackOut_11_0 = (ec) (Object) stackIn_11_0;
                        stackOut_11_1 = vc.field_i;
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_13_1 = stackOut_11_1;
                        break L3;
                      }
                    }
                    ((ec) (Object) stackIn_13_0).a(stackIn_13_1, -1, -15858);
                    break L2;
                  } else {
                    s discarded$2 = var7.a(tk.field_l, -34, (ag) this);
                    break L2;
                  }
                }
              }
              L4: {
                if (param1 != 3) {
                  if (param1 == 4) {
                    var7.a(l.field_a, 8, -15858);
                    break L4;
                  } else {
                    if (param1 != 6) {
                      if (param1 != 9) {
                        break L4;
                      } else {
                        s discarded$3 = var7.a(fk.field_d, -34, (ag) this);
                        break L4;
                      }
                    } else {
                      var7.a(qf.field_k, 9, -15858);
                      break L4;
                    }
                  }
                } else {
                  var7.a(vk.field_y, 7, -15858);
                  break L4;
                }
              }
              ((dh) this).a(false, (pj) (Object) var7);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var4;
            stackOut_25_1 = new StringBuilder().append("dh.PA(").append(param0).append(44).append(param1).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L5;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L5;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 41);
        }
    }

    dh(sk param0, kc param1, String param2, boolean param3, boolean param4) {
        super(param0, (pj) (Object) new ec((dh) null, param1, param2), 77, 10, 10);
        try {
            ((dh) this).field_eb = false;
            ((dh) this).field_Y = false;
            ((dh) this).field_db = param1;
            ((dh) this).field_W = param3 ? true : false;
            ((dh) this).field_cb = param4 ? true : false;
            ((dh) this).field_ab = new dg(13, 50, 274, 30, 15, 2113632, 4210752);
            ((dh) this).field_ab.field_z = true;
            ((dh) this).a((pj) (Object) ((dh) this).field_ab, (byte) 74);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "dh.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 41);
        }
    }

    public void a(byte param0, int param1, int param2, s param3, int param4) {
        try {
            if (!((dh) this).field_eb) {
                jj.a("tochangedisplayname.ws", (byte) -93, uj.b((byte) -120));
            } else {
                il.a(3, 0);
                ((dh) this).q(4210752);
            }
            int var6_int = -39 % ((-3 - param0) / 62);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "dh.M(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Z = 0;
    }
}
