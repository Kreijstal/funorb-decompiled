/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc extends al {
    private String[] field_w;
    int[] field_y;
    private int[][] field_v;
    private int[] field_x;
    static long field_u;

    private final void a(int param0, byte param1, sb param2) {
        int[] array$0 = null;
        int var8 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        bg var7 = null;
        int var9 = 0;
        var9 = MinerDisturbance.field_ab;
        try {
          if (param0 != 1) {
            if (2 == param0) {
              var4_int = param2.d((byte) -54);
              this.field_y = new int[var4_int];
              for (var5 = 0; var4_int > var5; var5++) {
                this.field_y[var5] = param2.e(-64);
              }
            } else {
              if (param0 == 3) {
                var4_int = param2.d((byte) -54);
                this.field_x = new int[var4_int];
                this.field_v = new int[var4_int][];
                for (var5 = 0; var5 < var4_int; var5++) {
                  var6 = param2.e(-103);
                  var7 = in.a(var6, (byte) 77);
                  if (var7 != null) {
                    this.field_x[var5] = var6;
                    array$0 = new int[var7.field_a];
                    this.field_v[var5] = array$0;
                    for (var8 = 0; var7.field_a > var8; var8++) {
                      this.field_v[var5][var8] = param2.e(-55);
                    }
                  }
                }
              } else {
                if (param0 == 4) {
                }
              }
            }
          } else {
            this.field_w = h.a('<', true, param2.a(false));
          }
          if (param1 <= 91) {
            this.field_v = (int[][]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_23_0 = var4;
          stackIn_23_1 = new StringBuilder().append("fc.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        int var1 = 0;
        if (param0) {
          fc.b((byte) -36);
        }
        if (oc.field_f > 32) {
          var1 = oc.field_f % 32;
          if (0 == var1) {
            var1 = 32;
          }
          ma.a(-96, oc.field_f - var1);
        } else {
          ma.a(-102, 0);
        }
    }

    final static String b(byte param0) {
        if (param0 <= 115) {
          return (String) null;
        }
        if (ci.field_e == ic.field_l) {
          return wm.field_d;
        }
        if (ci.field_e == bd.field_h) {
          return ic.field_m;
        }
        if (!wm.field_f.a(0)) {
          return ic.field_m;
        }
        return pl.field_a;
    }

    final String f(int param0) {
        int var3 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4 = MinerDisturbance.field_ab;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (null == this.field_w) {
          return "";
        }
        StringBuilder discarded$0 = var5.append(this.field_w[0]);
        for (var3 = param0; this.field_w.length > var3; var3++) {
          discarded$1 = var2.append("...");
          discarded$2 = var5.append(this.field_w[var3]);
        }
        return var2.toString();
    }

    final void a(int param0, sb param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = MinerDisturbance.field_ab;
        try {
          while (true) {
            var3_int = param1.d((byte) -54);
            if (var3_int != 0) {
              this.a(var3_int, (byte) 119, param1);
              continue;
            }
            break;
          }
          if (param0 != 32768) {
            fc.b((byte) -29);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("fc.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void g(int param0) {
        int var2 = 0;
        int var3 = MinerDisturbance.field_ab;
        if (param0 != 60) {
          sb var4 = (sb) null;
          this.a(80, (sb) null);
        }
        if (null != this.field_y) {
          for (var2 = 0; this.field_y.length > var2; var2++) {
            this.field_y[var2] = hi.a(this.field_y[var2], 32768);
          }
        }
    }

    final static void a(int param0, byte param1) {
        if (param1 <= 35) {
          fc.a(-84, (byte) 24);
        }
        ee.field_J = param0;
        if (null != km.field_a) {
          km.field_a.a((byte) -95, param0);
        }
        if (null != nj.field_e) {
          nj.field_e.a(81, param0);
        }
    }

    fc() {
    }

    static {
    }
}
