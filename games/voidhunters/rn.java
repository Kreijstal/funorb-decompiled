/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rn extends fh {
    int[] field_n;
    String field_p;
    static int field_o;
    char[] field_q;
    char[] field_m;
    boolean field_k;
    int[] field_l;

    final void a(int param0) {
        int var4 = 0;
        int var2 = 0;
        int var3 = VoidHunters.field_G;
        int var2Lifetime1;
        if (this.field_n != null) {
          for (var2 = 0; this.field_n.length > var2; var2++) {
            this.field_n[var2] = knb.a(this.field_n[var2], 32768);
          }
        }
        if (this.field_l != null) {
          var4 = 0;
          var2Lifetime1 = var4;
          while (this.field_l.length > var4) {
            this.field_l[var4] = knb.a(this.field_l[var4], 32768);
            var4++;
          }
        }
        if (param0 != 0) {
          this.a(63);
        }
    }

    final void a(ds param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = VoidHunters.field_G;
        try {
          if (param1 != 8452) {
            return;
          }
          while (true) {
            var3_int = param0.e((byte) -94);
            if (0 == var3_int) {
              return;
            }
            this.a(var3_int, (byte) 19, param0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("rn.B(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, byte param1, ds param2) {
        char[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        char stackIn_9_2 = 0;
        char[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        char stackIn_16_2 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = VoidHunters.field_G;
        try {
          if (1 != param0) {
            if (param0 == 2) {
              var4_int = param2.e((byte) -122);
              this.field_q = new char[var4_int];
              this.field_l = new int[var4_int];
              for (var5 = 0; var5 < var4_int; var5++) {
                this.field_l[var5] = param2.e(mgb.a((int) param1, 1886));
                var6 = param2.d((byte) -114);
                stackIn_8_0 = this.field_q;
                stackIn_8_1 = var5;
                if (var6 == 0) {
                  stackIn_9_2 = (char)0;
                } else {
                  stackIn_9_2 = qe.a((byte) var6, param1 + 5);
                }
                stackIn_8_0[stackIn_8_1] = stackIn_9_2;
              }
            } else {
              if (param0 == 3) {
                var4_int = param2.e((byte) -106);
                this.field_n = new int[var4_int];
                this.field_m = new char[var4_int];
                for (var5 = 0; var5 < var4_int; var5++) {
                  this.field_n[var5] = param2.e(1869);
                  var6 = param2.d((byte) -114);
                  stackIn_15_0 = this.field_m;
                  stackIn_15_1 = var5;
                  if (0 == var6) {
                    stackIn_16_2 = (char)0;
                  } else {
                    stackIn_16_2 = qe.a((byte) var6, -120);
                  }
                  stackIn_15_0[stackIn_15_1] = stackIn_16_2;
                }
              } else {
                if (4 == param0) {
                  this.field_k = true;
                }
              }
            }
          } else {
            this.field_p = param2.a(param1 - 20);
          }
          if (param1 != 19) {
            this.field_n = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_25_0 = var4;
          stackIn_25_1 = new StringBuilder().append("rn.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    rn() {
        this.field_k = false;
    }

    static {
        field_o = 50;
    }
}
