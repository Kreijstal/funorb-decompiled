/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa extends a {
    private el field_m;
    static int field_k;
    static java.math.BigInteger field_p;
    private boolean field_l;
    static dl field_n;
    private String field_j;
    static String[] field_o;
    static String field_r;
    static ib field_q;

    final static void a(boolean param0, int param1) {
        if (param1 > -88) {
            qa.a(true, -68);
            hl.a(false, 24574, param0);
            return;
        }
        hl.a(false, 24574, param0);
    }

    qa(vg param0, vg param1) {
        super(param0);
        this.field_j = "";
        this.field_l = false;
        try {
            this.field_m = new el(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "qa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(String param0, boolean param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_m.a(param0, (byte) -127) == rg.field_f) {
              stackIn_3_0 = this.field_m.a(param0, false);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (this.a(param0, (byte) -124) == rg.field_f) {
                stackIn_7_0 = wd.field_b;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (!param1) {
                    break L1;
                  } else {
                    field_n = (dl) null;
                    break L1;
                  }
                }
                stackIn_11_0 = dc.field_l;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("qa.K(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_11_0;
          }
        }
    }

    public static void a(boolean param0) {
        field_r = null;
        field_o = null;
        field_n = null;
        field_q = null;
        if (!param0) {
            return;
        }
        field_p = null;
    }

    final qf a(String param0, byte param1) {
        ce var3 = null;
        RuntimeException var3_ref = null;
        qf stackIn_3_0 = null;
        qf stackIn_9_0 = null;
        qf stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_m.a(param0, (byte) -110) == rg.field_f) {
              stackIn_3_0 = rg.field_f;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 < -109) {
                  break L1;
                } else {
                  field_k = -73;
                  break L1;
                }
              }
              L2: {
                if (param0.equals(this.field_j)) {
                  break L2;
                } else {
                  var3 = tg.a(param0, -44);
                  if (var3.a(false)) {
                    this.field_j = param0;
                    this.field_l = var3.a(-15004);
                    break L2;
                  } else {
                    stackIn_9_0 = db.field_u;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              L3: {
                if (!this.field_l) {
                  stackIn_14_0 = rg.field_f;
                  break L3;
                } else {
                  stackIn_14_0 = ph.field_g;
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
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("qa.J(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    static {
        field_k = 20;
        field_p = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
    }
}
