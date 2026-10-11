/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mp extends ij {
    private String[] field_l;
    private int[] field_m;
    private int[][] field_n;
    static long field_p;
    int[] field_o;

    final void a(byte param0) {
        int var2 = 0;
        int var3 = CrazyCrystals.field_B;
        if (this.field_o != null) {
          for (var2 = 0; this.field_o.length > var2; var2++) {
            this.field_o[var2] = hm.a(this.field_o[var2], 32768);
          }
        }
        if (param0 != -90) {
          this.field_m = (int[]) null;
        }
    }

    final static boolean a(int param0, String param1, dc param2, String param3, String param4, boolean param5, int param6) {
        RuntimeException var7 = null;
        sa var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (lc.field_c != tl.field_e) {
            return false;
          }
          var8 = new sa(qe.field_g, param2);
          qe.field_g.b(-3264, var8);
          if (!il.b(-120)) {
            ro.field_n = param6;
            qc.field_i = null;
            qh.field_f = param5;
            ji.field_x = param1;
            dg.field_a = param3;
            lc.field_c = l.field_b;
            fh.field_i = param4;
          } else {
            var8.o(106);
          }
          if (param0 == 0) {
            return true;
          }
          field_p = -79L;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_15_0 = var7;
          stackIn_15_1 = new StringBuilder().append("mp.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param4 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void a(ng param0, byte param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = CrazyCrystals.field_B;
        try {
          if (param1 <= 27) {
            field_p = 6L;
          }
          while (true) {
            var3_int = param0.h(255);
            if (var3_int == 0) {
              return;
            }
            this.a(var3_int, param0, -3);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("mp.E(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final String e(int param0) {
        int var3 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4 = CrazyCrystals.field_B;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (this.field_l == null) {
          return "";
        }
        if (param0 != 60) {
          this.a((byte) 25);
        }
        StringBuilder discarded$0 = var5.append(this.field_l[0]);
        for (var3 = 1; var3 < this.field_l.length; var3++) {
          discarded$1 = var2.append("...");
          discarded$2 = var5.append(this.field_l[var3]);
        }
        return var2.toString();
    }

    mp() {
    }

    private final void a(int param0, ng param1, int param2) {
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
        sj var7 = null;
        int var9 = 0;
        var9 = CrazyCrystals.field_B;
        try {
          if (param2 != -3) {
            return;
          }
          if (param0 == 1) {
            this.field_l = ik.a(param1.i(110), (byte) -76, '<');
          } else {
            if (param0 == 2) {
              var4_int = param1.h(255);
              this.field_o = new int[var4_int];
              for (var5 = 0; var5 < var4_int; var5++) {
                this.field_o[var5] = param1.c((byte) -7);
              }
            } else if (3 == param0) {
              var4_int = param1.h(255);
              this.field_m = new int[var4_int];
              this.field_n = new int[var4_int][];
              for (var5 = 0; var4_int > var5; var5++) {
                var6 = param1.c((byte) -7);
                var7 = cf.a(var6, 123);
                if (var7 != null) {
                  this.field_m[var5] = var6;
                  array$0 = new int[var7.field_a];
                  this.field_n[var5] = array$0;
                  for (var8 = 0; var8 < var7.field_a; var8++) {
                    this.field_n[var5][var8] = param1.c((byte) -7);
                  }
                }
              }
            } else {
              if (4 != param0) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("mp.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
    }
}
