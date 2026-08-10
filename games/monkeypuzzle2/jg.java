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
            this.field_jb = param1;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "jg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(cj param0, int param1, boolean param2) {
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        sk var5 = null;
        int var6 = 0;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_mb = true;
              if (param0.field_b) {
                var4 = bh.field_h;
                break L1;
              } else {
                if (null == param0.field_g) {
                  var4 = param0.field_h;
                  if (-249 == (param0.field_i ^ -1)) {
                    L2: {
                      if (!param2) {
                        jg.i((byte) 100);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    var4 = fe.field_e;
                    this.field_nb = true;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  var4 = me.field_l;
                  if (null == this.field_jb) {
                    break L1;
                  } else {
                    this.field_jb.a(param1 ^ 193);
                    break L1;
                  }
                }
              }
            }
            var5 = new sk((ha) (this), pj.field_c, var4);
            if (param1 == 9) {
              L3: {
                if (param0.field_b) {
                  if (param0.field_f) {
                    this.c((byte) 54, new ja((jg) (this)));
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var5.a(0, (of) (this), pi.field_i);
                    break L3;
                  }
                } else {
                  L4: {
                    if (!this.field_nb) {
                      if (5 == param0.field_i) {
                        var5.a((byte) -9, 11, wc.field_g);
                        var5.a((byte) 119, 17, vh.field_L);
                        break L4;
                      } else {
                        var5.a((byte) -81, -1, nf.field_E);
                        break L4;
                      }
                    } else {
                      var5.a(0, (of) (this), pi.field_i);
                      break L4;
                    }
                  }
                  if (3 != param0.field_i) {
                    if (-7 == (param0.field_i ^ -1)) {
                      var5.a((byte) -105, 9, uf.field_k);
                      break L3;
                    } else {
                      this.c((byte) 46, var5);
                      return;
                    }
                  } else {
                    var5.a((byte) 115, 7, fc.field_m);
                    break L3;
                  }
                }
              }
              this.c((byte) 46, var5);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var4_ref);

            stackIn_34_1 = new StringBuilder().append("jg.OB(");

            if (param0 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L5;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L5;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final void h(byte param0) {
        if (param0 < 79) {
          field_kb = (String) null;
          this.a(lh.a(true, fe.field_e, 248), 9, true);
          return;
        } else {
          this.a(lh.a(true, fe.field_e, 248), 9, true);
          return;
        }
    }

    public static void r(int param0) {
        if (param0 != -249) {
            field_kb = (String) null;
            field_kb = null;
            return;
        }
        field_kb = null;
    }

    public final void a(int param0, int param1, int param2, int param3, t param4) {
        if (param3 != 7) {
            t var7 = (t) null;
            this.a(63, -42, -38, 66, (t) null);
        }
        if (this.field_nb) {
            ll.a((byte) 91, true, false);
            return;
        }
        try {
            ud.a(49);
            this.g((byte) -75);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "jg.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean k(int param0) {
        cj var2;
        if (this.field_z) {
          if (!this.field_mb) {
            var2 = dl.b(param0 + 23913);
            if (var2 != null) {
              this.a(var2, 9, false);
              if (param0 != -23913) {
                return true;
              } else {
                return super.k(param0 ^ 0);
              }
            } else {
              if (param0 != -23913) {
                return true;
              } else {
                return super.k(param0 ^ 0);
              }
            }
          } else {
            if (param0 != -23913) {
              return true;
            } else {
              return super.k(param0 ^ 0);
            }
          }
        } else {
          if (param0 != -23913) {
            return true;
          } else {
            return super.k(param0 ^ 0);
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
        if (param0 < 73) {
            field_lb = -14;
            nh.a((byte) 93, ii.a(false));
            return;
        }
        nh.a((byte) 93, ii.a(false));
    }

    final static int a(byte param0, int param1, Random param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if ((param1 ^ -1) >= -1) {
              throw new IllegalArgumentException();
            } else {
              if (!dk.a(param1, (byte) -15)) {
                if (param0 > 69) {
                  var3_int = -(int)(4294967296L % (long)param1) + -2147483648;
                  L1: while (true) {
                    var4 = param2.nextInt();
                    if (var4 >= var3_int) {
                      continue L1;
                    } else {
                      stackIn_13_0 = uf.a(-122, param1, var4);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                } else {
                  stackIn_9_0 = 83;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                stackIn_6_0 = (int)(((long)param2.nextInt() & 4294967295L) * (long)param1 >> 727797856);
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("jg.MB(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_13_0;
          }
        }
    }

    static {
        field_lb = 0;
        field_kb = "You have seen <%0> out of <%1> tips.";
    }
}
