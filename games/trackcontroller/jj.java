/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

class jj extends db implements m {
    private dg field_eb;
    private oh field_gb;
    private boolean field_jb;
    private boolean field_kb;
    static int[] field_fb;
    private boolean field_ib;
    private boolean field_hb;

    final void a(int param0, String param1, int param2) {
        RuntimeException var4 = null;
        int var5 = 0;
        lc var6 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        lc stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        lc stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        lc stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        String stackIn_16_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        lc stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        lc stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        String stackOut_15_2 = null;
        lc stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        String stackOut_14_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var5 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            if (((jj) this).field_ib) {
              return;
            } else {
              L1: {
                stackOut_4_0 = this;
                stackIn_6_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (param0 != 256) {
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
              ((jj) this).field_jb = stackIn_7_1 != 0;
              ((jj) this).field_ib = true;
              if (param2 == -10) {
                L2: {
                  ((jj) this).field_eb.a(4210752, 8405024, (byte) -33);
                  var6 = new lc((jj) this, ((jj) this).field_gb, param1);
                  if (param0 != 5) {
                    if (param0 != 256) {
                      L3: {
                        stackOut_13_0 = (lc) var6;
                        stackOut_13_1 = param2 + -17030;
                        stackIn_15_0 = stackOut_13_0;
                        stackIn_15_1 = stackOut_13_1;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        if (!((jj) this).field_hb) {
                          stackOut_15_0 = (lc) (Object) stackIn_15_0;
                          stackOut_15_1 = stackIn_15_1;
                          stackOut_15_2 = ea.field_p;
                          stackIn_16_0 = stackOut_15_0;
                          stackIn_16_1 = stackOut_15_1;
                          stackIn_16_2 = stackOut_15_2;
                          break L3;
                        } else {
                          stackOut_14_0 = (lc) (Object) stackIn_14_0;
                          stackOut_14_1 = stackIn_14_1;
                          stackOut_14_2 = ib.field_c;
                          stackIn_16_0 = stackOut_14_0;
                          stackIn_16_1 = stackOut_14_1;
                          stackIn_16_2 = stackOut_14_2;
                          break L3;
                        }
                      }
                      ((lc) (Object) stackIn_16_0).a(stackIn_16_1, stackIn_16_2, -1);
                      break L2;
                    } else {
                      rh discarded$2 = var6.a(param2 ^ 4, (tg) this, ib.field_c);
                      break L2;
                    }
                  } else {
                    var6.a(param2 + -17030, dh.field_r, 11);
                    var6.a(-17040, cg.field_b, 17);
                    break L2;
                  }
                }
                L4: {
                  if (3 != param0) {
                    if (param0 != 4) {
                      if (param0 == 6) {
                        var6.a(-17040, md.field_c, 9);
                        break L4;
                      } else {
                        if (param0 == 9) {
                          rh discarded$3 = var6.a(param2 + -4, (tg) this, fh.field_d);
                          break L4;
                        } else {
                          ((jj) this).b((al) (Object) var6, -101);
                          return;
                        }
                      }
                    } else {
                      var6.a(-17040, wg.field_h, 8);
                      break L4;
                    }
                  } else {
                    var6.a(-17040, ea.field_y, 7);
                    break L4;
                  }
                }
                ((jj) this).b((al) (Object) var6, -101);
                break L0;
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var4;
            stackOut_28_1 = new StringBuilder().append("jj.AA(").append(param0).append(44);
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
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
          throw sl.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 44 + param2 + 41);
        }
    }

    public void a(rh param0, int param1, int param2, int param3, int param4) {
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
              if (!((jj) this).field_jb) {
                gk.a("tochangedisplayname.ws", gd.b((byte) 77), -110);
                break L1;
              } else {
                qc.b(3, (byte) -42);
                ((jj) this).t(20252);
                break L1;
              }
            }
            if (param4 == -27322) {
              break L0;
            } else {
              ((jj) this).field_hb = true;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var6;
            stackOut_6_1 = new StringBuilder().append("jj.A(");
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
          throw sl.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    jj(vl param0, oh param1, String param2, boolean param3, boolean param4) {
        super(param0, (al) (Object) new lc((jj) null, param1, param2), 77, 10, 10);
        try {
            ((jj) this).field_jb = false;
            ((jj) this).field_ib = false;
            ((jj) this).field_kb = param4 ? true : false;
            ((jj) this).field_gb = param1;
            ((jj) this).field_hb = param3 ? true : false;
            ((jj) this).field_eb = new dg(13, 50, 274, 30, 15, 2113632, 4210752);
            ((jj) this).field_eb.field_C = true;
            ((jj) this).a(false, (al) (Object) ((jj) this).field_eb);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "jj.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 41);
        }
    }

    final void t(int param0) {
        if (((jj) this).field_E) {
          if (param0 == 20252) {
            ((jj) this).field_E = false;
            if (!((jj) this).field_hb) {
              if (!((jj) this).field_kb) {
                return;
              } else {
                ja.c(1);
                return;
              }
            } else {
              hh.a((byte) 111);
              return;
            }
          } else {
            ((jj) this).field_eb = null;
            ((jj) this).field_E = false;
            if (!((jj) this).field_hb) {
              if (!((jj) this).field_kb) {
                return;
              } else {
                ja.c(1);
                return;
              }
            } else {
              hh.a((byte) 111);
              return;
            }
          }
        } else {
          return;
        }
    }

    final static boolean s(int param0) {
        if (param0 <= 22) {
            field_fb = null;
            return ge.field_D;
        }
        return ge.field_D;
    }

    final void r(int param0) {
        ((jj) this).field_eb.a(4210752, 2121792, (byte) -33);
        int var3 = -36 % ((-22 - param0) / 60);
        lc var2 = new lc((jj) this, ((jj) this).field_gb, gf.field_a);
        var2.a(-17040, sg.field_e, 15);
        ((jj) this).b((al) (Object) var2, -78);
    }

    final boolean a(byte param0, char param1, al param2, int param3) {
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
            if (param3 == 13) {
              ((jj) this).t(20252);
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              var5_int = -113 / ((param0 - 17) / 51);
              stackOut_4_0 = super.a((byte) -104, param1, param2, param3);
              stackIn_5_0 = stackOut_4_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("jj.GA(").append(param0).append(44).append(param1).append(44);
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
          throw sl.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param3 + 41);
        }
        return stackIn_5_0;
    }

    public static void e(byte param0) {
        field_fb = null;
        if (param0 < 98) {
            jj.e((byte) 9);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_fb = null;
    }
}
