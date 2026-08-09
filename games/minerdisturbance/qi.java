/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi extends cb {
    private boolean field_k;
    static int field_j;
    private String field_i;

    final static boolean f(int param0) {
        String var2;
        if (param0 == -9202) {
          if (!kj.a(false)) {
            if (si.field_a) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          var2 = (String) null;
          qi.a((String) null, -46, (ik) null, true, -5, (String) null, (String) null);
          if (!kj.a(false)) {
            if (si.field_a) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static boolean a(String param0, int param1, ik param2, boolean param3, int param4, String param5, String param6) {
        RuntimeException var7 = null;
        uk var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (mc.field_t != ic.field_l) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param4 <= -81) {
                var8 = new uk(mb.field_b, param2);
                mb.field_b.b(1, var8);
                if (!cm.a(true)) {
                  L1: {
                    qf.field_r = param5;
                    km.field_b = param6;
                    wm.field_d = param0;
                    ic.field_l = ci.field_e;
                    if (!param3) {
                      stackIn_12_0 = 0;
                      break L1;
                    } else {
                      stackIn_12_0 = 1;
                      break L1;
                    }
                  }
                  g.field_o = stackIn_12_0 != 0;
                  vk.field_g = null;
                  me.field_j = param1;
                  return true;
                } else {
                  var8.t(23101);
                  stackIn_14_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var7);

            stackIn_17_1 = new StringBuilder().append("qi.A(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L2;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');

            if (param6 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L5;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_18_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            return stackIn_14_0 != 0;
          }
        }
    }

    qi(ui param0) {
        super(param0);
        this.field_k = false;
    }

    final ag a(String param0, int param1) {
        ed var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        ag stackIn_2_0 = null;
        ag stackIn_9_0 = null;
        ag stackIn_13_0 = null;
        ag stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = (CharSequence) ((Object) param0);
            if (ra.a((byte) -38, var4)) {
              L1: {
                if (!param0.equals(this.field_i)) {
                  L2: {
                    var3 = rf.a((byte) -75, param0);
                    if (var3 == null) {
                      break L2;
                    } else {
                      if (var3.field_h != null) {
                        break L2;
                      } else {
                        this.field_i = param0;
                        this.field_k = var3.field_c;
                        break L1;
                      }
                    }
                  }
                  stackIn_9_0 = bm.field_o;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
              if (param1 == 5) {
                L3: {
                  if (this.field_k) {
                    stackIn_17_0 = sc.field_a;
                    break L3;
                  } else {
                    stackIn_17_0 = fg.field_d;
                    break L3;
                  }
                }
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                stackIn_13_0 = (ag) null;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_2_0 = fg.field_d;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3_ref);

            stackIn_20_1 = new StringBuilder().append("qi.D(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              return stackIn_17_0;
            }
          }
        }
    }

    final void b(byte param0) {
        if (param0 >= -30) {
            this.field_k = false;
            this.field_i = null;
            return;
        }
        this.field_i = null;
    }

    final String a(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        ed var5 = null;
        CharSequence var6 = null;
        String stackIn_2_0 = null;
        Object stackIn_8_0 = null;
        String stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6 = (CharSequence) ((Object) param1);
            var3 = qa.a((byte) 31, var6);
            var4 = 98 / ((49 - param0) / 56);
            if (var3 == null) {
              L1: {
                if (param1.equals(this.field_i)) {
                  break L1;
                } else {
                  var5 = rf.a((byte) -75, param1);
                  if (var5 != null) {
                    if (var5.field_h == null) {
                      this.field_k = var5.field_c;
                      this.field_i = param1;
                      break L1;
                    } else {
                      stackIn_8_0 = null;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                }
              }
              if (!this.field_k) {
                stackIn_13_0 = hm.field_L;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                return lg.field_a;
              }
            } else {
              stackIn_2_0 = (String) (var3);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3_ref);

            stackIn_16_1 = new StringBuilder().append("qi.C(").append(param0).append(',');

            if (param1 == null) {
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
          throw lj.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (String) ((Object) stackIn_8_0);
          } else {
            return stackIn_13_0;
          }
        }
    }

    static {
        field_j = 0;
    }
}
