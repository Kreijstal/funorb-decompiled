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
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                  stackIn_8_0 = ug.field_c;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
              L3: {
                var3_int = 0 % ((param1 - -50) / 36);
                if (!this.field_w) {
                  stackIn_13_0 = ra.field_k;
                  break L3;
                } else {
                  stackIn_13_0 = nn.field_s;
                  break L3;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_2_0 = ra.field_k;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3_ref);

            stackIn_16_1 = new StringBuilder().append("dg.E(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
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
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
              stackIn_5_0 = (String) (var3);
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
                      stackIn_12_0 = null;
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
                stackIn_17_0 = ec.field_e;
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
            stackIn_20_0 = (RuntimeException) (var3_ref);

            stackIn_20_1 = new StringBuilder().append("dg.A(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L3;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
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
