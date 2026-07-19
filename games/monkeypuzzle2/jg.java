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
        t discarded$2 = null;
        t discarded$3 = null;
        RuntimeException var4 = null;
        String var4_ref = null;
        sk var5 = null;
        int var6 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                this.field_mb = true;
                if (param0.field_b) {
                  break L2;
                } else {
                  L3: {
                    if (null == param0.field_g) {
                      break L3;
                    } else {
                      var4_ref = me.field_l;
                      if (null == this.field_jb) {
                        break L1;
                      } else {
                        this.field_jb.a(param1 ^ 193);
                        if (var6 == 0) {
                          break L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  var4_ref = param0.field_h;
                  if (-249 == (param0.field_i ^ -1)) {
                    L4: {
                      if (!param2) {
                        jg.i((byte) 100);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var4_ref = fe.field_e;
                    this.field_nb = true;
                    if (var6 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              var4_ref = bh.field_h;
              break L1;
            }
            var5 = new sk((ha) (this), pj.field_c, var4_ref);
            if (param1 == 9) {
              L5: {
                L6: {
                  if (param0.field_b) {
                    break L6;
                  } else {
                    L7: {
                      L8: {
                        if (!this.field_nb) {
                          break L8;
                        } else {
                          discarded$2 = var5.a(0, (of) (this), pi.field_i);
                          if (var6 == 0) {
                            break L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                      if (5 == param0.field_i) {
                        var5.a((byte) -9, 11, wc.field_g);
                        var5.a((byte) 119, 17, vh.field_L);
                        break L7;
                      } else {
                        var5.a((byte) -81, -1, nf.field_E);
                        if (var6 == 0) {
                          break L7;
                        } else {
                          var5.a((byte) -9, 11, wc.field_g);
                          var5.a((byte) 119, 17, vh.field_L);
                          break L7;
                        }
                      }
                    }
                    L9: {
                      if (3 != param0.field_i) {
                        break L9;
                      } else {
                        var5.a((byte) 115, 7, fc.field_m);
                        if (var6 == 0) {
                          break L5;
                        } else {
                          break L9;
                        }
                      }
                    }
                    if (-7 == (param0.field_i ^ -1)) {
                      var5.a((byte) -105, 9, uf.field_k);
                      if (var6 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    } else {
                      this.c((byte) 46, var5);
                      return;
                    }
                  }
                }
                if (param0.field_f) {
                  this.c((byte) 54, new ja((jg) (this)));
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  discarded$3 = var5.a(0, (of) (this), pi.field_i);
                  break L5;
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
          L10: {
            var4 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) (var4);
            stackOut_37_1 = new StringBuilder().append("jg.OB(");
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param0 == null) {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L10;
            } else {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L10;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ',' + param1 + ',' + param2 + ')');
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
        cj var2 = null;
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
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
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
                    L2: while (true) {
                      if (var4 >= var3_int) {
                        continue L1;
                      } else {
                        if (var5 != 0) {
                          continue L2;
                        } else {
                          stackOut_14_0 = uf.a(-122, param1, var4);
                          stackIn_15_0 = stackOut_14_0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                  }
                } else {
                  stackOut_8_0 = 83;
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                stackOut_5_0 = (int)(((long)param2.nextInt() & 4294967295L) * (long)param1 >> 727797856);
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var3);
            stackOut_16_1 = new StringBuilder().append("jg.MB(").append(param0).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_15_0;
          }
        }
    }

    static {
        field_lb = 0;
        field_kb = "You have seen <%0> out of <%1> tips.";
    }
}
