/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc extends mg {
    static String field_n;
    static String field_s;
    static String[] field_p;
    static jl field_r;
    private boolean field_q;
    static ak field_u;
    private qo field_t;
    private String field_o;
    static String field_m;

    public static void f(int param0) {
        ak discarded$2 = null;
        field_s = null;
        field_u = null;
        if (param0 != 16) {
          discarded$2 = kc.e(-78);
          field_m = null;
          field_p = null;
          field_n = null;
          field_r = null;
          return;
        } else {
          field_m = null;
          field_p = null;
          field_n = null;
          field_r = null;
          return;
        }
    }

    final String a(int param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_8_0 = null;
        String stackOut_4_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (this.field_t.a(param1, true) != sk.field_a) {
              if (param0 < -76) {
                if (this.a(param1, true) == sk.field_a) {
                  stackOut_8_0 = jc.field_e;
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return e.field_c;
                }
              } else {
                stackOut_4_0 = (String) null;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = this.field_t.a(-80, param1);
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3);
            stackOut_10_1 = new StringBuilder().append("kc.E(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L1;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_9_0;
          }
        }
    }

    kc(c param0, c param1) {
        super(param0);
        this.field_q = false;
        this.field_o = "";
        try {
            this.field_t = new qo(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "kc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static ak e(int param0) {
        if (param0 != 16) {
            return (ak) null;
        }
        return ae.field_c.field_Fb;
    }

    final dj a(String param0, boolean param1) {
        fl var3 = null;
        RuntimeException var3_ref = null;
        dj stackIn_2_0 = null;
        dj stackIn_5_0 = null;
        dj stackIn_11_0 = null;
        dj stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        dj stackOut_10_0 = null;
        dj stackOut_15_0 = null;
        dj stackOut_14_0 = null;
        dj stackOut_4_0 = null;
        dj stackOut_1_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            if (param1) {
              if (this.field_t.a(param0, param1) != sk.field_a) {
                L1: {
                  if (!param0.equals(this.field_o)) {
                    var3 = rn.a(param0, (byte) -99);
                    if (!var3.d(121)) {
                      stackOut_10_0 = tg.field_j;
                      stackIn_11_0 = stackOut_10_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      this.field_o = param0;
                      this.field_q = var3.b(-20425);
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (!this.field_q) {
                    stackOut_15_0 = sk.field_a;
                    stackIn_16_0 = stackOut_15_0;
                    break L2;
                  } else {
                    stackOut_14_0 = qk.field_g;
                    stackIn_16_0 = stackOut_14_0;
                    break L2;
                  }
                }
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                stackOut_4_0 = sk.field_a;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = (dj) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var3_ref);
            stackOut_17_1 = new StringBuilder().append("kc.D(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return stackIn_16_0;
            }
          }
        }
    }

    static {
        field_s = "Message lobby";
        field_n = "<%0> cannot join; the game is full.";
        field_p = new String[16];
        field_m = "On";
    }
}
