/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad extends gf {
    private String field_m;
    static String field_l;
    private boolean field_o;
    static int field_n;
    private um field_p;

    final String a(byte param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_p.a(127, param1) != so.field_u) {
              L1: {
                if (param0 == -121) {
                  break L1;
                } else {
                  ad.c((byte) 37);
                  break L1;
                }
              }
              if (this.a(114, param1) == so.field_u) {
                stackIn_8_0 = ul.field_c;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return cp.field_h;
              }
            } else {
              stackIn_2_0 = this.field_p.a((byte) -121, param1);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("ad.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_8_0;
        }
    }

    final cd a(int param0, String param1) {
        up var3 = null;
        RuntimeException var3_ref = null;
        cd stackIn_4_0 = null;
        cd stackIn_9_0 = null;
        cd stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 62) {
                break L1;
              } else {
                this.field_o = true;
                break L1;
              }
            }
            if (this.field_p.a(110, param1) != so.field_u) {
              L2: {
                if (!param1.equals(this.field_m)) {
                  var3 = vf.a(param1, 0);
                  if (var3.c(484)) {
                    this.field_m = param1;
                    this.field_o = var3.a(484);
                    break L2;
                  } else {
                    stackIn_9_0 = gn.field_h;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L2;
                }
              }
              L3: {
                if (!this.field_o) {
                  stackIn_14_0 = so.field_u;
                  break L3;
                } else {
                  stackIn_14_0 = so.field_s;
                  break L3;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_4_0 = so.field_u;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("ad.F(").append(param0).append(',');

            if (param1 == null) {
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
          throw rb.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    public static void c(byte param0) {
        if (param0 != 17) {
            ad.c((byte) 10);
            field_l = null;
            return;
        }
        field_l = null;
    }

    ad(tk param0, tk param1) {
        super(param0);
        this.field_o = false;
        this.field_m = "";
        try {
            this.field_p = new um(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "ad.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = "Player Name: ";
        field_n = -1;
    }
}
