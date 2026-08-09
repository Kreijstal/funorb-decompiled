/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kfa extends k {
    private int field_k;

    final void a(byte param0, lu param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -71) {
              var4_int = param2;
              if (var4_int == 0) {
                this.field_k = (param1.b(param0 + 16712006) << 2028433228) / 255;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("kfa.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private kfa(int param0) {
        super(0, true);
        this.field_k = 4096;
        this.field_k = param0;
    }

    final int[] a(int param0, int param1) {
        int[] var3;
        int[] var4;
        if (param1 != 0) {
          L0: {
            this.field_k = 54;
            var4 = this.field_j.a(param0, param1 + -1);
            var3 = var4;
            if (this.field_j.field_m) {
              bl.a(var4, 0, hh.field_d, this.field_k);
              break L0;
            } else {
              break L0;
            }
          }
          return var4;
        } else {
          L1: {
            var4 = this.field_j.a(param0, param1 + -1);
            var3 = var4;
            if (this.field_j.field_m) {
              bl.a(var4, 0, hh.field_d, this.field_k);
              break L1;
            } else {
              break L1;
            }
          }
          return var4;
        }
    }

    final static ce a(lu param0, int param1, int param2) {
        RuntimeException var3 = null;
        lu var4 = null;
        ce stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 4096) {
                break L1;
              } else {
                var4 = (lu) null;
                kfa.a((lu) null, -110, 53);
                break L1;
              }
            }
            stackIn_3_0 = new ce(param2, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("kfa.C(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    public kfa() {
        this(4096);
    }

    static {
    }
}
