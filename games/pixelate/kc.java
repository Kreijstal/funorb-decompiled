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
        field_s = null;
        field_u = null;
        if (param0 != 16) {
          kc.e(-78);
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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_t.a(param1, true) != sk.field_a) {
              if (param0 < -76) {
                if (this.a(param1, true) == sk.field_a) {
                  stackIn_9_0 = jc.field_e;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return e.field_c;
                }
              } else {
                stackIn_5_0 = (String) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = this.field_t.a(-80, param1);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("kc.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L1;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
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
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1) {
              if (this.field_t.a(param0, param1) != sk.field_a) {
                L1: {
                  if (!param0.equals(this.field_o)) {
                    var3 = rn.a(param0, (byte) -99);
                    if (!var3.d(121)) {
                      stackIn_11_0 = tg.field_j;
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
                    stackIn_16_0 = sk.field_a;
                    break L2;
                  } else {
                    stackIn_16_0 = qk.field_g;
                    break L2;
                  }
                }
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                stackIn_5_0 = sk.field_a;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (dj) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3_ref);

            stackIn_19_1 = new StringBuilder().append("kc.D(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
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
