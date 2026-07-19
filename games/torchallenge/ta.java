/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta extends wa implements sg {
    static am field_Db;
    private dg field_Bb;
    private boolean field_Cb;
    private boolean field_Eb;
    static String field_Ab;
    static String field_zb;

    public final void a(ng param0, int param1, int param2, int param3, boolean param4) {
        if (this.field_Eb) {
            ee.a(false, 1, true);
            return;
        }
        try {
            if (param4) {
                this.field_Bb = (dg) null;
            }
            bj.a(30);
            this.o(77);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "ta.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
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
            if (param0 < -42) {
              L1: {
                if (null == ri.a(0, param1)) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var2);
            stackOut_7_1 = new StringBuilder().append("ta.R(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    final boolean j(int param0) {
        ef var2 = null;
        L0: {
          if (!this.field_K) {
            break L0;
          } else {
            if (!this.field_Cb) {
              var2 = uf.d(false);
              if (var2 != null) {
                this.a(false, var2, (byte) 98);
                break L0;
              } else {
                if (param0 != 1) {
                  return true;
                } else {
                  return super.j(1);
                }
              }
            } else {
              if (param0 != 1) {
                return true;
              } else {
                return super.j(1);
              }
            }
          }
        }
        if (param0 != 1) {
          return true;
        } else {
          return super.j(1);
        }
    }

    ta(si param0, dg param1) {
        super(param0, dl.field_H, cd.field_a, false, false);
        try {
            this.field_Bb = param1;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "ta.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void p(int param0) {
        field_Ab = null;
        if (param0 != 255) {
            return;
        }
        field_zb = null;
        field_Db = null;
    }

    final void h(byte param0) {
        this.a(true, mg.a((byte) 122, pa.field_u, 248), (byte) 57);
        if (param0 != 21) {
            ng var3 = (ng) null;
            this.a((ng) null, 30, -74, -95, false);
        }
    }

    private final void a(boolean param0, ef param1, byte param2) {
        ng discarded$2 = null;
        ng discarded$3 = null;
        RuntimeException var4 = null;
        String var4_ref = null;
        sj var5 = null;
        int var6 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var6 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_Cb = true;
              if (!param1.field_m) {
                if (null == param1.field_b) {
                  var4_ref = param1.field_g;
                  if (-249 != (param1.field_n ^ -1)) {
                    break L1;
                  } else {
                    L2: {
                      if (param0) {
                        break L2;
                      } else {
                        qc.a(0);
                        break L2;
                      }
                    }
                    this.field_Eb = true;
                    var4_ref = pa.field_u;
                    break L1;
                  }
                } else {
                  var4_ref = qb.field_f;
                  if (this.field_Bb == null) {
                    break L1;
                  } else {
                    this.field_Bb.a(-23128);
                    break L1;
                  }
                }
              } else {
                var4_ref = ak.field_e;
                break L1;
              }
            }
            var5 = new sj((wa) (this), dl.field_H, var4_ref);
            if (param2 >= 41) {
              L3: {
                if (!param1.field_m) {
                  L4: {
                    if (!this.field_Eb) {
                      if (param1.field_n != 5) {
                        var5.a(-1, 2083, b.field_R);
                        break L4;
                      } else {
                        var5.a(11, 2083, te.field_c);
                        var5.a(17, 2083, ph.field_f);
                        break L4;
                      }
                    } else {
                      discarded$2 = var5.a((byte) 46, (gg) (this), be.field_a);
                      break L4;
                    }
                  }
                  if (-4 != (param1.field_n ^ -1)) {
                    if (6 == param1.field_n) {
                      var5.a(9, 2083, qc.field_b);
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    var5.a(7, 2083, aj.field_a);
                    break L3;
                  }
                } else {
                  if (!param1.field_c) {
                    discarded$3 = var5.a((byte) 46, (gg) (this), be.field_a);
                    break L3;
                  } else {
                    this.c(0, new qh((ta) (this)));
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              this.c(0, var5);
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
            var4 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) (var4);
            stackOut_29_1 = new StringBuilder().append("ta.UA(").append(param0).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L5;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L5;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param2 + ')');
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

    final static int b(int param0, int param1) {
        int var2 = 0;
        if (param0 == 0) {
            return 0;
        }
        if (param0 > param1) {
            var2 = 1;
            if (!((param0 ^ -1) >= -65536)) {
                var2 += 16;
                param0 = param0 >> 16;
            }
            if (!(255 >= param0)) {
                param0 = param0 >> 8;
                var2 += 8;
            }
            if (!((param0 ^ -1) >= -16)) {
                param0 = param0 >> 4;
                var2 += 4;
            }
            if (!((param0 ^ -1) >= -4)) {
                var2 += 2;
                param0 = param0 >> 2;
            }
            if (!(1 >= param0)) {
                var2++;
                param0 = param0 >> 1;
            }
            return var2;
        }
        var2 = 2;
        if ((param0 ^ -1) > 65535) {
            param0 = param0 >> 16;
            var2 += 16;
        }
        if ((param0 ^ -1) > 255) {
            param0 = param0 >> 8;
            var2 += 8;
        }
        if (!(param0 >= -16)) {
            var2 += 4;
            param0 = param0 >> 4;
        }
        if (3 < (param0 ^ -1)) {
            param0 = param0 >> 2;
            var2 += 2;
        }
        if (-2 > param0) {
            param0 = param0 >> 1;
            var2++;
        }
        return var2;
    }

    static {
        field_Db = new am(3);
    }
}
