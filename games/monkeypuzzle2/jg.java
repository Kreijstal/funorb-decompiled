/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jg extends ha implements ql {
    private bg field_jb;
    private boolean field_mb;
    private boolean field_nb;
    static String field_kb;
    static int field_lb;

    jg(kj param0, bg param1) {
        super(param0, pj.field_c, c.field_j, false, false);
        try {
            ((jg) this).field_jb = param1;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "jg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(cj param0, int param1, boolean param2) {
        RuntimeException var4 = null;
        String var4_ref = null;
        sk var5 = null;
        int var6 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              ((jg) this).field_mb = true;
              if (param0.field_b) {
                var4_ref = bh.field_h;
                break L1;
              } else {
                if (null == param0.field_g) {
                  var4_ref = param0.field_h;
                  if (param0.field_i == 248) {
                    L2: {
                      if (!param2) {
                        jg.i((byte) 100);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    var4_ref = fe.field_e;
                    ((jg) this).field_nb = true;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  var4_ref = me.field_l;
                  if (null == ((jg) this).field_jb) {
                    break L1;
                  } else {
                    ((jg) this).field_jb.a(200);
                    break L1;
                  }
                }
              }
            }
            var5 = new sk((ha) this, pj.field_c, var4_ref);
            L3: {
              if (param0.field_b) {
                if (param0.field_f) {
                  ((jg) this).c((byte) 54, (we) (Object) new ja((jg) this));
                  return;
                } else {
                  t discarded$2 = var5.a(0, (of) this, pi.field_i);
                  break L3;
                }
              } else {
                L4: {
                  if (!((jg) this).field_nb) {
                    if (5 == param0.field_i) {
                      var5.a((byte) -9, 11, wc.field_g);
                      var5.a((byte) 119, 17, vh.field_L);
                      break L4;
                    } else {
                      var5.a((byte) -81, -1, nf.field_E);
                      break L4;
                    }
                  } else {
                    t discarded$3 = var5.a(0, (of) this, pi.field_i);
                    break L4;
                  }
                }
                if (3 != param0.field_i) {
                  if (param0.field_i == 6) {
                    var5.a((byte) -105, 9, uf.field_k);
                    break L3;
                  } else {
                    ((jg) this).c((byte) 46, (we) (Object) var5);
                    return;
                  }
                } else {
                  var5.a((byte) 115, 7, fc.field_m);
                  break L3;
                }
              }
            }
            ((jg) this).c((byte) 46, (we) (Object) var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var4;
            stackOut_32_1 = new StringBuilder().append("jg.OB(");
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param0 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L5;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L5;
            }
          }
          throw la.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + ',' + 9 + ',' + param2 + ')');
        }
    }

    final void h(byte param0) {
        if (param0 < 79) {
          field_kb = null;
          this.a(lh.a(true, fe.field_e, 248), 9, true);
          return;
        } else {
          this.a(lh.a(true, fe.field_e, 248), 9, true);
          return;
        }
    }

    public static void r(int param0) {
        field_kb = null;
    }

    public final void a(int param0, int param1, int param2, int param3, t param4) {
        if (param3 != 7) {
            Object var7 = null;
            ((jg) this).a(63, -42, -38, 66, (t) null);
        }
        if (((jg) this).field_nb) {
            ll.a((byte) 91, true, false);
            return;
        }
        try {
            ud.a(49);
            ((jg) this).g((byte) -75);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "jg.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean k(int param0) {
        cj var2 = null;
        if (((jg) this).field_z) {
          if (!((jg) this).field_mb) {
            var2 = dl.b(param0 + 23913);
            if (var2 != null) {
              this.a(var2, 9, false);
              if (param0 != -23913) {
                return true;
              } else {
                return super.k(param0);
              }
            } else {
              if (param0 != -23913) {
                return true;
              } else {
                return super.k(param0);
              }
            }
          } else {
            if (param0 != -23913) {
              return true;
            } else {
              return super.k(param0);
            }
          }
        } else {
          if (param0 != -23913) {
            return true;
          } else {
            return super.k(param0);
          }
        }
    }

    final static void a(int param0, int param1) {
        MonkeyPuzzle2.field_E = d.field_h[param1];
        if (param0 != 3860) {
          jg.a(103, 94);
          ug.field_b = he.field_f[param1];
          tk.field_a = uk.field_o[param1];
          return;
        } else {
          ug.field_b = he.field_f[param1];
          tk.field_a = uk.field_o[param1];
          return;
        }
    }

    private final static void i(byte param0) {
        nh.a((byte) 93, ii.a(false));
    }

    final static int a(byte param0, int param1, Random param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (param1 <= 0) {
              throw new IllegalArgumentException();
            } else {
              if (!dk.a(param1, (byte) -15)) {
                var3_int = -(int)(4294967296L % (long)param1) + -2147483648;
                L1: while (true) {
                  var4 = param2.nextInt();
                  if (var4 >= var3_int) {
                    continue L1;
                  } else {
                    stackOut_10_0 = uf.a(-122, param1, var4);
                    stackIn_11_0 = stackOut_10_0;
                    break L0;
                  }
                }
              } else {
                stackOut_5_0 = (int)(((long)param2.nextInt() & 4294967295L) * (long)param1 >> 32);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("jg.MB(").append(80).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw la.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_11_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_lb = 0;
        field_kb = "You have seen <%0> out of <%1> tips.";
    }
}
