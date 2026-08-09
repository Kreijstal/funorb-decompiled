/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni extends pv {
    static ss field_l;
    static String field_k;
    static kv field_j;

    ni(jfa param0) {
        try {
            this.field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ni.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static ai[] a(byte param0, pf param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        ai[] var4 = null;
        int var5 = 0;
        ai var6_ref_ai = null;
        int var6 = 0;
        int var7 = 0;
        ai[] stackIn_6_0 = null;
        ai[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = BachelorFridge.field_y;
        try {
          L0: {
            var2_int = param1.d(8, (byte) -65);
            if (-1 <= (var2_int ^ -1)) {
              var3 = param1.d(12, (byte) 45);
              if (param0 == 41) {
                var4 = new ai[var3];
                var5 = 0;
                L1: while (true) {
                  if (var5 >= var3) {
                    stackIn_14_0 = (ai[]) (var4);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    L2: {
                      if (!fa.a((byte) -75, param1)) {
                        var6 = param1.d(nia.a(-1 + var5, false), (byte) 64);
                        var4[var5] = var4[var6];
                        break L2;
                      } else {
                        var6_ref_ai = new ai();
                        param1.d(24, (byte) -105);
                        param1.d(24, (byte) 50);
                        var6_ref_ai.field_b = param1.d(24, (byte) -123);
                        param1.d(9, (byte) 69);
                        param1.d(12, (byte) -64);
                        param1.d(12, (byte) 58);
                        param1.d(12, (byte) -116);
                        var4[var5] = var6_ref_ai;
                        break L2;
                      }
                    }
                    var5++;
                    continue L1;
                  }
                }
              } else {
                stackIn_6_0 = (ai[]) null;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var2);

            stackIn_17_1 = new StringBuilder().append("ni.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_14_0;
        }
    }

    private final int c(boolean param0) {
        if (!param0) {
            this.b(true);
        }
        return 50;
    }

    final boolean b(boolean param0) {
        int fieldTemp$0 = this.field_g + 1;
        this.field_g = this.field_g + 1;
        if (!(fieldTemp$0 <= this.c(param0))) {
            this.field_f.field_p = 2048;
            this.field_f.field_k = this.field_f.b(true);
            return true;
        }
        if (!(this.field_g != 1)) {
            this.field_f.field_v.a((byte) 66, this.field_f.field_g.field_o.field_b, 0);
        }
        if (-41 >= (this.field_g ^ -1)) {
        }
        return false;
    }

    public static void b(int param0) {
        field_k = null;
        field_j = null;
        field_l = null;
        if (param0 >= -48) {
            ni.b(113);
        }
    }

    static {
        field_k = "to over <%0> great games";
    }
}
