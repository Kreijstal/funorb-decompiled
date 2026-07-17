/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc extends qt {
    static String[] field_B;
    static int field_E;
    private int field_C;
    private hd field_A;
    static int field_D;
    static wp[] field_F;

    final void b(int param0) {
        ((sc) this).field_A = eo.a("", 7126504, (hu) (Object) un.field_d, -1, false);
        if (param0 != -38) {
            ((sc) this).a((byte) -76, false);
        }
    }

    final void a(boolean param0, int param1) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Kickabout.field_G;
        super.a(param0, 116);
        on.a(((sc) this).field_A.field_F - 150, ((sc) this).field_A.field_T + -150, ((sc) this).field_A.field_q - -300, ((sc) this).field_A.field_mb - -160, 8, 65793, ((sc) this).field_C >> 1);
        ((sc) this).field_A.a(50, param0);
        var3 = ct.field_w.toLowerCase();
        var4 = (int)Math.abs(-(nj.a(-58) / 1000L % 6L) + 3L);
        un.field_d.c(hv.field_d.toUpperCase(), (((sc) this).field_A.field_q >> 1) + ((sc) this).field_A.field_F, ((sc) this).field_A.field_T + (((sc) this).field_A.field_mb >> 1) - -6, 16777215, -1, ((sc) this).field_C);
        var5 = 0;
        L0: while (true) {
          if (var4 <= var5) {
            if (param1 < 99) {
              return;
            } else {
              int discarded$1 = un.field_d.a(var3, ((sc) this).field_A.field_F + -150, -150 + ((sc) this).field_A.field_T, ((sc) this).field_A.field_q + 300, 130, 16777215, -1, ((sc) this).field_C, 1, 1, 0);
              return;
            }
          } else {
            var3 = var3 + ".";
            var5++;
            continue L0;
          }
        }
    }

    final void a(int param0, boolean param1, int param2, js param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, -126, param3);
              this.a(false);
              if (param1) {
                ((sc) this).field_C = param0;
                break L1;
              } else {
                ((sc) this).field_C = 256 + -(param0 << 1);
                break L1;
              }
            }
            L2: {
              if (((sc) this).field_C <= 256) {
                break L2;
              } else {
                ((sc) this).field_C = 256;
                break L2;
              }
            }
            L3: {
              if (((sc) this).field_C >= 0) {
                break L3;
              } else {
                ((sc) this).field_C = 0;
                break L3;
              }
            }
            ((sc) this).field_A.field_P = ((sc) this).field_C;
            if (param2 < -28) {
              break L0;
            } else {
              field_F = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("sc.F(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
    }

    final static void g(byte param0) {
        eo.b(ug.a(0, (int)wm.field_C), lf.a((byte) -125, (int)cq.field_f), 10, 16711680);
    }

    private final void a(boolean param0) {
        ((sc) this).field_A.a(true, ((sc) this).field_A.field_q, (f.field_d >> 1) - (((sc) this).field_A.field_q >> 1), 100 + (vc.field_B >> 1), ((sc) this).field_A.field_mb);
    }

    sc() {
        ((sc) this).field_C = 0;
    }

    public static void e(int param0) {
        field_F = null;
        if (param0 != 130) {
            return;
        }
        field_B = null;
    }

    final void a(byte param0, boolean param1) {
        int var3 = 0;
        super.a((byte) 122, param1);
        ((sc) this).field_A.b(0, param1);
        var3 = -96 % ((param0 - 38) / 60);
        if (1 == ((sc) this).field_A.field_sb) {
          ii.a((byte) -120);
          vj.a(-81, true);
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, boolean param2) {
        super.a(param0 + param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_B = new String[255];
        field_F = new wp[255];
        for (var0 = 0; field_F.length > var0; var0++) {
            field_F[var0] = new wp();
        }
    }
}
