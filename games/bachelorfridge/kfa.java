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
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -71) {
            return;
          }
          var4_int = param2;
          if (var4_int != 0) {
            return;
          }
          this.field_k = (param1.b(param0 + 16712006) << 12) / 255;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("kfa.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(')').toString());
        }
    }

    private kfa(int param0) {
        super(0, true);
        this.field_k = 4096;
        this.field_k = param0;
    }

    final int[] a(int param0, int param1) {
        int[] var4 = null;
        int[] var3 = null;
        int[] var4Lifetime1;
        int[] var3Lifetime1;
        if (param1 == 0) {
          var4 = this.field_j.a(param0, param1 - 1);
          var3 = var4;
          if (this.field_j.field_m) {
            bl.a(var4, 0, hh.field_d, this.field_k);
          }
          return var4;
        }
        this.field_k = 54;
        var4Lifetime1 = this.field_j.a(param0, param1 - 1);
        var3Lifetime1 = var4Lifetime1;
        if (this.field_j.field_m) {
          bl.a(var4Lifetime1, 0, hh.field_d, this.field_k);
        }
        return var4Lifetime1;
    }

    final static ce a(lu param0, int param1, int param2) {
        RuntimeException var3 = null;
        lu var4 = null;
        ce stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 4096) {
            var4 = (lu) null;
            kfa.a((lu) null, -110, 53);
          }
          stackIn_3_0 = new ce(param2, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("kfa.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public kfa() {
        this(4096);
    }

    static {
    }
}
