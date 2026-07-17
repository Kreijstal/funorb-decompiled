/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

class ph extends qj implements ga {
    static String[] field_nb;
    private fa field_kb;
    private qe field_fb;
    static String field_gb;
    private boolean field_ib;
    static String field_mb;
    private boolean field_hb;
    private boolean field_jb;
    private boolean field_lb;

    final static void a(int param0, boolean param1, int param2) {
        int var3 = 0;
        var3 = 1 << param2;
        if ((var3 & eb.field_c) == 0) {
          eb.field_c = eb.field_c | var3;
          jg.field_H = jg.field_H | var3;
          pk.field_a.b(90, (rf) (Object) new wf(param2));
          if (!a.field_a) {
            if (wk.a(112)) {
              bh.field_e.b(86, (rf) (Object) new hb(param2, param0, ja.field_d, oe.field_a, il.field_i, rj.field_h));
              return;
            } else {
              hb discarded$2 = rh.a(param0, rj.field_h, ja.field_d, il.field_i, oe.field_a, -1893600464, 4, param2);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void o(int param0) {
        kj var2 = null;
        ((ph) this).field_kb.b(2121792, 2, 4210752);
        var2 = new kj((ph) this, ((ph) this).field_fb, cf.field_p);
        if (param0 < 121) {
          return;
        } else {
          var2.a(fd.field_b, 13759, 15);
          ((ph) this).c(20317, (uj) (Object) var2);
          return;
        }
    }

    public static void m() {
        field_mb = null;
        field_nb = null;
        field_gb = null;
    }

    final void n(int param0) {
        int var2 = 0;
        if (((ph) this).field_G) {
          ((ph) this).field_G = false;
          var2 = -21 / ((param0 - -47) / 42);
          if (!((ph) this).field_ib) {
            if (!((ph) this).field_lb) {
              return;
            } else {
              ng.h((byte) -58);
              return;
            }
          } else {
            int discarded$2 = 32083;
            vg.a();
            return;
          }
        } else {
          return;
        }
    }

    public void a(dk param0, int param1, boolean param2, int param3, int param4) {
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
              if (((ph) this).field_hb) {
                fd.a(3, 0);
                ((ph) this).n(125);
                break L1;
              } else {
                ef.a("tochangedisplayname.ws", ll.b(90), 100);
                break L1;
              }
            }
            if (!param2) {
              break L0;
            } else {
              ph.a(-104, false, -124);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var6;
            stackOut_6_1 = new StringBuilder().append("ph.E(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
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
          throw sd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final boolean a(uj param0, char param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == -90) {
                break L1;
              } else {
                ((ph) this).field_jb = false;
                break L1;
              }
            }
            if (param3 != 13) {
              stackOut_5_0 = super.a(param0, param1, (byte) -90, param3);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              ((ph) this).n(108);
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("ph.EA(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_6_0;
    }

    final void a(String param0, int param1, boolean param2) {
        RuntimeException var4 = null;
        kj var5 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        kj stackIn_13_0 = null;
        kj stackIn_14_0 = null;
        kj stackIn_15_0 = null;
        String stackIn_15_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        kj stackOut_12_0 = null;
        kj stackOut_14_0 = null;
        String stackOut_14_1 = null;
        kj stackOut_13_0 = null;
        String stackOut_13_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        try {
          L0: {
            if (((ph) this).field_jb) {
              return;
            } else {
              L1: {
                stackOut_3_0 = this;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (!param2) {
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
                ((ph) this).field_jb = stackIn_6_1 != 0;
                stackOut_6_0 = this;
                stackIn_8_0 = stackOut_6_0;
                stackIn_7_0 = stackOut_6_0;
                if (param1 != 256) {
                  stackOut_8_0 = this;
                  stackOut_8_1 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  break L2;
                } else {
                  stackOut_7_0 = this;
                  stackOut_7_1 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  break L2;
                }
              }
              L3: {
                ((ph) this).field_hb = stackIn_9_1 != 0;
                ((ph) this).field_kb.b(8405024, 2, 4210752);
                var5 = new kj((ph) this, ((ph) this).field_fb, param0);
                if (param1 == 5) {
                  var5.a(hd.field_i, 13759, 11);
                  var5.a(bg.field_b, 13759, 17);
                  break L3;
                } else {
                  if (256 != param1) {
                    L4: {
                      stackOut_12_0 = (kj) var5;
                      stackIn_14_0 = stackOut_12_0;
                      stackIn_13_0 = stackOut_12_0;
                      if (((ph) this).field_ib) {
                        stackOut_14_0 = (kj) (Object) stackIn_14_0;
                        stackOut_14_1 = ma.field_g;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        break L4;
                      } else {
                        stackOut_13_0 = (kj) (Object) stackIn_13_0;
                        stackOut_13_1 = dk.field_t;
                        stackIn_15_0 = stackOut_13_0;
                        stackIn_15_1 = stackOut_13_1;
                        break L4;
                      }
                    }
                    ((kj) (Object) stackIn_15_0).a(stackIn_15_1, 13759, -1);
                    break L3;
                  } else {
                    dk discarded$2 = var5.a((byte) 88, (qg) this, ma.field_g);
                    break L3;
                  }
                }
              }
              L5: {
                if (3 == param1) {
                  var5.a(kf.field_u, 13759, 7);
                  break L5;
                } else {
                  if (param1 == 4) {
                    var5.a(s.field_d, 13759, 8);
                    break L5;
                  } else {
                    if (param1 != 6) {
                      if (param1 != 9) {
                        break L5;
                      } else {
                        dk discarded$3 = var5.a((byte) 123, (qg) this, db.field_B);
                        break L5;
                      }
                    } else {
                      var5.a(dk.field_w, 13759, 9);
                      break L5;
                    }
                  }
                }
              }
              ((ph) this).c(20317, (uj) (Object) var5);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var4;
            stackOut_27_1 = new StringBuilder().append("ph.J(");
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
          throw sd.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    ph(tc param0, qe param1, String param2, boolean param3, boolean param4) {
        super(param0, (uj) (Object) new kj((ph) null, param1, param2), 77, 10, 10);
        try {
            ((ph) this).field_hb = false;
            ((ph) this).field_jb = false;
            ((ph) this).field_lb = param4 ? true : false;
            ((ph) this).field_ib = param3 ? true : false;
            ((ph) this).field_fb = param1;
            ((ph) this).field_kb = new fa(13, 50, 274, 30, 15, 2113632, 4210752);
            ((ph) this).field_kb.field_D = true;
            ((ph) this).a(true, (uj) (Object) ((ph) this).field_kb);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "ph.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_gb = "If you do nothing the game will revert to normal view in <%0> second.";
        field_mb = "Confirm Email:";
    }
}
