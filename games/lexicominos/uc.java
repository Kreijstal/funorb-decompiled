/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

class uc extends re implements jk {
    private le field_jb;
    static volatile int field_eb;
    private boolean field_ob;
    private md field_gb;
    static db[] field_hb;
    static String field_nb;
    static int field_fb;
    private boolean field_lb;
    private boolean field_db;
    private boolean field_ib;
    static String field_mb;
    static ik field_kb;

    final boolean a(char param0, int param1, w param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_4_0 = false;
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
            if (13 == param1) {
              ((uc) this).g(true);
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              var5_int = 23 % ((param3 - -13) / 55);
              stackOut_4_0 = super.a(param0, param1, param2, (byte) 114);
              stackIn_5_0 = stackOut_4_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("uc.P(").append(param0).append(44).append(param1).append(44);
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
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param3 + 41);
        }
        return stackIn_5_0;
    }

    final void a(int param0, int param1, String param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        vc var5 = null;
        int var6 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        vc stackIn_10_0 = null;
        vc stackIn_11_0 = null;
        vc stackIn_12_0 = null;
        String stackIn_12_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        vc stackOut_9_0 = null;
        vc stackOut_11_0 = null;
        String stackOut_11_1 = null;
        vc stackOut_10_0 = null;
        String stackOut_10_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (!((uc) this).field_lb) {
              L1: {
                ((uc) this).field_lb = true;
                var4_int = -97 / ((param0 - 31) / 49);
                stackOut_3_0 = this;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (param1 != 256) {
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
                ((uc) this).field_ob = stackIn_6_1 != 0;
                ((uc) this).field_gb.b(4210752, 8405024, 124);
                var5 = new vc((uc) this, ((uc) this).field_jb, param2);
                if (param1 == 5) {
                  var5.a(md.field_B, 11, 122);
                  var5.a(jd.field_d, 17, -62);
                  break L2;
                } else {
                  if (param1 != 256) {
                    L3: {
                      stackOut_9_0 = (vc) var5;
                      stackIn_11_0 = stackOut_9_0;
                      stackIn_10_0 = stackOut_9_0;
                      if (!((uc) this).field_ib) {
                        stackOut_11_0 = (vc) (Object) stackIn_11_0;
                        stackOut_11_1 = a.field_e;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        break L3;
                      } else {
                        stackOut_10_0 = (vc) (Object) stackIn_10_0;
                        stackOut_10_1 = og.field_j;
                        stackIn_12_0 = stackOut_10_0;
                        stackIn_12_1 = stackOut_10_1;
                        break L3;
                      }
                    }
                    ((vc) (Object) stackIn_12_0).a(stackIn_12_1, -1, 111);
                    break L2;
                  } else {
                    kf discarded$2 = var5.a(-1, og.field_j, (vd) this);
                    break L2;
                  }
                }
              }
              L4: {
                if (param1 == 3) {
                  var5.a(pa.field_b, 7, 112);
                  break L4;
                } else {
                  if (4 != param1) {
                    if (6 != param1) {
                      if (9 == param1) {
                        kf discarded$3 = var5.a(-1, qj.field_eb, (vd) this);
                        break L4;
                      } else {
                        ((uc) this).b(118, (w) (Object) var5);
                        return;
                      }
                    } else {
                      var5.a(lb.field_b, 9, 105);
                      break L4;
                    }
                  } else {
                    var5.a(dj.field_a, 8, 111);
                    break L4;
                  }
                }
              }
              ((uc) this).b(118, (w) (Object) var5);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var4;
            stackOut_25_1 = new StringBuilder().append("uc.J(").append(param0).append(44).append(param1).append(44);
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
          throw ld.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 41);
        }
    }

    final void g(boolean param0) {
        int stackIn_8_0 = 0;
        int stackIn_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (!((uc) this).field_D) {
          return;
        } else {
          ((uc) this).field_D = false;
          if (param0) {
            if (!((uc) this).field_ib) {
              if (((uc) this).field_db) {
                tj.c(0);
                return;
              } else {
                return;
              }
            } else {
              L0: {
                if (param0) {
                  stackOut_16_0 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  break L0;
                } else {
                  stackOut_15_0 = 1;
                  stackIn_17_0 = stackOut_15_0;
                  break L0;
                }
              }
              u.h(stackIn_17_0 != 0);
              return;
            }
          } else {
            field_hb = null;
            if (!((uc) this).field_ib) {
              if (((uc) this).field_db) {
                tj.c(0);
                return;
              } else {
                return;
              }
            } else {
              L1: {
                if (param0) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L1;
                } else {
                  stackOut_6_0 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  break L1;
                }
              }
              u.h(stackIn_8_0 != 0);
              return;
            }
          }
        }
    }

    public void a(int param0, int param1, int param2, int param3, kf param4) {
        RuntimeException var6 = null;
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
              if (!((uc) this).field_ob) {
                pd.a("tochangedisplayname.ws", -109, kk.c(-14047));
                break L1;
              } else {
                ni.a(56, 3);
                ((uc) this).g(true);
                break L1;
              }
            }
            if (param2 == 215535458) {
              break L0;
            } else {
              ((uc) this).g(true);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var6;
            stackOut_6_1 = new StringBuilder().append("uc.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param4 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    public static void h(int param0) {
        field_hb = null;
        if (param0 != 11331) {
            return;
        }
        field_mb = null;
        field_nb = null;
        field_kb = null;
    }

    final void i(int param0) {
        ((uc) this).field_gb.b(4210752, 2121792, 120);
        vc var2 = new vc((uc) this, ((uc) this).field_jb, la.field_a);
        var2.a(e.field_e, param0, 124);
        ((uc) this).b(117, (w) (Object) var2);
    }

    uc(eg param0, le param1, String param2, boolean param3, boolean param4) {
        super(param0, (w) (Object) new vc((uc) null, param1, param2), 77, 10, 10);
        try {
            ((uc) this).field_ob = false;
            ((uc) this).field_lb = false;
            ((uc) this).field_ib = param3 ? true : false;
            ((uc) this).field_db = param4 ? true : false;
            ((uc) this).field_jb = param1;
            ((uc) this).field_gb = new md(13, 50, 274, 30, 15, 2113632, 4210752);
            ((uc) this).field_gb.field_G = true;
            ((uc) this).b((byte) -65, (w) (Object) ((uc) this).field_gb);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "uc.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_nb = "Passwords must be between 5 and 20 letters and numbers";
        field_eb = 0;
        field_mb = "Not yet achieved";
    }
}
