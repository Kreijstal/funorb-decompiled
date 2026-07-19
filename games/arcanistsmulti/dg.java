/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg extends rl {
    private String field_r;
    static String field_v;
    static String field_q;
    static String field_t;
    static int field_u;
    static boolean field_s;
    private boolean field_w;

    public static void d(int param0) {
        if (param0 != -1) {
          field_v = (String) null;
          field_t = null;
          field_q = null;
          field_v = null;
          return;
        } else {
          field_t = null;
          field_q = null;
          field_v = null;
          return;
        }
    }

    final eh a(String param0, int param1) {
        ho var3 = null;
        int var3_int = 0;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        eh stackIn_2_0 = null;
        eh stackIn_8_0 = null;
        eh stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        eh stackOut_7_0 = null;
        eh stackOut_12_0 = null;
        eh stackOut_11_0 = null;
        eh stackOut_1_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            var4 = (CharSequence) ((Object) param0);
            if (ee.a((byte) 127, var4)) {
              L1: {
                if (param0.equals(this.field_r)) {
                  break L1;
                } else {
                  L2: {
                    var3 = r.a(param0, 256);
                    if (var3 == null) {
                      break L2;
                    } else {
                      if (null != var3.field_e) {
                        break L2;
                      } else {
                        this.field_r = param0;
                        this.field_w = var3.field_f;
                        break L1;
                      }
                    }
                  }
                  stackOut_7_0 = ug.field_c;
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
              L3: {
                var3_int = 0 % ((param1 - -50) / 36);
                if (!this.field_w) {
                  stackOut_12_0 = ra.field_k;
                  stackIn_13_0 = stackOut_12_0;
                  break L3;
                } else {
                  stackOut_11_0 = nn.field_s;
                  stackIn_13_0 = stackOut_11_0;
                  break L3;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackOut_1_0 = ra.field_k;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3_ref);
            stackOut_14_1 = new StringBuilder().append("dg.E(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_13_0;
          }
        }
    }

    final void e(int param0) {
        this.field_r = null;
        if (param0 <= 123) {
            this.field_w = false;
        }
    }

    final static void d(byte param0) {
        if (param0 <= -52) {
          L0: {
            if (ce.field_m.field_m != vd.field_k) {
              ma.field_N = ma.field_N + (ce.field_m.field_m - vd.field_k);
              vd.field_k = ce.field_m.field_m;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (-1 > (jo.field_e ^ -1)) {
              jo.field_e = jo.field_e - 1;
              break L1;
            } else {
              break L1;
            }
          }
          if (0 < jo.field_e) {
            ed.j(120);
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    dg(rn param0) {
        super(param0);
        this.field_w = false;
    }

    final String a(String param0, byte param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        ho var4 = null;
        CharSequence var5 = null;
        String stackIn_5_0 = null;
        Object stackIn_12_0 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        Object stackOut_11_0 = null;
        String stackOut_16_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -114) {
                break L1;
              } else {
                field_u = 97;
                break L1;
              }
            }
            var5 = (CharSequence) ((Object) param0);
            var3 = uk.a(var5, (byte) -118);
            if (var3 != null) {
              stackOut_4_0 = (String) (var3);
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (!param0.equals(this.field_r)) {
                  var4 = r.a(param0, 256);
                  if (var4 != null) {
                    if (var4.field_e == null) {
                      this.field_r = param0;
                      this.field_w = var4.field_f;
                      break L2;
                    } else {
                      stackOut_11_0 = null;
                      stackIn_12_0 = stackOut_11_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                } else {
                  break L2;
                }
              }
              if (!this.field_w) {
                stackOut_16_0 = ec.field_e;
                stackIn_17_0 = stackOut_16_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                return wk.field_i;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var3_ref);
            stackOut_18_1 = new StringBuilder().append("dg.A(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L3;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (String) ((Object) stackIn_12_0);
          } else {
            return stackIn_17_0;
          }
        }
    }

    static {
        field_v = "Enter name of friend to add to list";
        field_q = "This is the Book of Nature. Nature spells focus on trapping enemies and controlling the battlefield. You require 5 wands to purchase this spellbook; you currently have ";
        field_t = "Rated games are available to members only. To become a member and gain access to all the spells, please visit the 'Account' section of the website.";
        field_s = false;
    }
}
