/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p extends cg {
    private fg field_o;
    static int field_k;
    static int field_l;
    private String field_j;
    static int[] field_n;
    private boolean field_m;

    final static de a(int param0, int param1) {
        de[] var2;
        int var3;
        int var4;
        de[] var5;
        var4 = Main.field_T;
        var5 = bg.v(113);
        var2 = var5;
        var3 = 0;
        L0: while (true) {
          if (var3 >= var5.length) {
            if (param0 != -1) {
              return (de) null;
            } else {
              return null;
            }
          } else {
            if ((param1 ^ -1) == (var5[var3].field_a ^ -1)) {
              return var5[var3];
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    p(hf param0, hf param1) {
        super(param0);
        this.field_j = "";
        this.field_m = false;
        try {
            this.field_o = new fg(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "p.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void g(int param0) {
        if (param0 != 0) {
            return;
        }
        field_n = null;
    }

    final String a(String param0, boolean param1) {
        RuntimeException var3 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                this.field_j = (String) null;
                break L1;
              }
            }
            if (this.field_o.a(param0, -79) == pe.field_b) {
              stackIn_5_0 = this.field_o.a(param0, param1);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (this.a(param0, -99) != pe.field_b) {
                stackIn_10_0 = gi.field_g;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_8_0 = bk.field_b;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("p.I(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    final sg a(String param0, int param1) {
        lb var3 = null;
        RuntimeException var3_ref = null;
        sg stackIn_5_0 = null;
        sg stackIn_11_0 = null;
        sg stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -58) {
                break L1;
              } else {
                p.g(126);
                break L1;
              }
            }
            if (this.field_o.a(param0, -61) == pe.field_b) {
              stackIn_5_0 = pe.field_b;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (!param0.equals(this.field_j)) {
                  var3 = hg.a(param0, (byte) -125);
                  if (!var3.a(640)) {
                    stackIn_11_0 = a.field_n;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    this.field_j = param0;
                    this.field_m = var3.b(640);
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              L3: {
                if (this.field_m) {
                  stackIn_16_0 = ii.field_e;
                  break L3;
                } else {
                  stackIn_16_0 = pe.field_b;
                  break L3;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3_ref);

            stackIn_19_1 = new StringBuilder().append("p.M(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            return stackIn_16_0;
          }
        }
    }

    static {
        field_k = -1;
    }
}
