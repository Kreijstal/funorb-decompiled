/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi extends fh {
    int[] field_n;
    private String[] field_k;
    private int[][] field_l;
    private int[] field_m;

    private final void a(ds param0, int param1, int param2) {
        int[] array$0 = null;
        int var8 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        ri var7 = null;
        int var9 = 0;
        var9 = VoidHunters.field_G;
        try {
          if (param2 != 0) {
            pi.a((byte) 3, false, false);
          }
          if (param1 == 1) {
            this.field_k = up.a((byte) -67, '<', param0.a(-1));
          } else {
            if (param1 == 2) {
              var4_int = param0.e((byte) -113);
              this.field_n = new int[var4_int];
              for (var5 = 0; var4_int > var5; var5++) {
                this.field_n[var5] = param0.e(1869);
              }
            } else if (param1 == 3) {
              var4_int = param0.e((byte) -107);
              this.field_m = new int[var4_int];
              this.field_l = new int[var4_int][];
              for (var5 = 0; var4_int > var5; var5++) {
                var6 = param0.e(param2 ^ 1869);
                var7 = itb.a(0, var6);
                if (var7 != null) {
                  this.field_m[var5] = var6;
                  array$0 = new int[var7.field_c];
                  this.field_l[var5] = array$0;
                  for (var8 = 0; var8 < var7.field_c; var8++) {
                    this.field_l[var5][var8] = param0.e(1869);
                  }
                }
              }
            } else {
              if (param1 != 4) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("pi.C(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final String a(int param0) {
        int var3 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4 = VoidHunters.field_G;
        StringBuilder var5 = new StringBuilder(param0);
        StringBuilder var2 = var5;
        if (null == this.field_k) {
          return "";
        }
        StringBuilder discarded$0 = var5.append(this.field_k[0]);
        for (var3 = 1; this.field_k.length > var3; var3++) {
          discarded$1 = var2.append("...");
          discarded$2 = var5.append(this.field_k[var3]);
        }
        return var2.toString();
    }

    final void e(byte param0) {
        int var2 = 0;
        int var3 = VoidHunters.field_G;
        if (param0 != 97) {
          return;
        }
        if (null != this.field_n) {
          for (var2 = 0; this.field_n.length > var2; var2++) {
            this.field_n[var2] = knb.a(this.field_n[var2], 32768);
          }
        }
    }

    final void a(ds param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = VoidHunters.field_G;
        try {
          while (true) {
            var3_int = param0.e((byte) -104);
            if (var3_int != 0) {
              this.a(param0, var3_int, 0);
              continue;
            }
            break;
          }
          if (param1 != -1) {
            this.field_n = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("pi.D(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(byte param0, boolean param1, boolean param2) {
        if (param0 > -6) {
          return;
        }
        if (!param1) {
          dma.a();
        } else {
          dma.e(0, 0, dma.field_g, dma.field_j, 0, 192);
        }
        vqb.a(param1, 76);
    }

    pi() {
    }

    static {
    }
}
