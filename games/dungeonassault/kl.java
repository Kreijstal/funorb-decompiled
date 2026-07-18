/*
 * Decompiled by CFR-JS 0.4.0.
 */
class kl {
    static String field_e;
    boolean field_d;
    static String field_b;
    int field_j;
    md field_f;
    private ph field_g;
    static String[] field_c;
    int field_k;
    int field_a;
    static gd field_h;
    int field_i;
    ph field_l;

    private final void c() {
        int var3 = 0;
        rj var4 = null;
        var3 = DungeonAssault.field_K;
        qe.a(((kl) this).field_g, ((kl) this).field_k, ((kl) this).field_j, ((kl) this).field_a, ((kl) this).field_i);
        ((kl) this).field_g.h(((kl) this).field_k, ((kl) this).field_j);
        var4 = (rj) (Object) ((kl) this).field_f.e(-24172);
        L0: while (true) {
          if (var4 != null) {
            var4.d(0);
            var4 = (rj) (Object) ((kl) this).field_f.a(4);
            continue L0;
          } else {
            return;
          }
        }
    }

    kl(int param0, int param1, int param2, int param3) {
        this();
        ((kl) this).a(param1, param2, param0, -23241, param3);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        ((kl) this).field_i = param4;
        ((kl) this).field_j = param0;
        ((kl) this).field_a = param1;
        ((kl) this).field_k = param2;
        ((kl) this).b((byte) 37);
        nm.field_ib = new int[((kl) this).field_i * ((kl) this).field_a];
        if (param3 != -23241) {
            ((kl) this).a(true);
        }
        ((kl) this).field_g = new ph(new cn(((kl) this).field_a, ((kl) this).field_i), new cn(((kl) this).field_a, ((kl) this).field_i));
    }

    void b(byte param0) {
        int[] var2 = null;
        int var3_int = 0;
        cn var3 = null;
        int[] var4 = null;
        cn var5 = null;
        int var6 = 0;
        int[] var7 = null;
        var6 = DungeonAssault.field_K;
        var7 = new int[64];
        var2 = var7;
        var3_int = 0;
        L0: while (true) {
          if (64 <= var3_int) {
            var3 = te.a(((kl) this).field_a, ((kl) this).field_i, var7, 16, 8, 0.125);
            if (param0 == 37) {
              var4 = te.b(((kl) this).field_a, ((kl) this).field_i, 0.125);
              var5 = new cn(0, 0);
              var5.field_v = ((kl) this).field_i;
              var5.field_B = var4;
              var5.field_y = ((kl) this).field_a;
              ((kl) this).field_l = new ph(var3, var5);
              jh.a(((kl) this).field_l);
              ke.a(-101, 0, ((kl) this).field_i, 0);
              ke.a(21, ((kl) this).field_a + -8, ((kl) this).field_i, 0);
              int discarded$2 = 1;
              un.a(8, (byte) -127, ((kl) this).field_a - 16, 0);
              int discarded$3 = 1;
              un.a(8, (byte) 50, ((kl) this).field_a - 16, ((kl) this).field_i - 8);
              qe.a(8, 8, -16 + ((kl) this).field_a, ((kl) this).field_i + -16, 224, 32, 7, 128);
              jh.b();
              return;
            } else {
              return;
            }
          } else {
            var7[var3_int] = mp.a(-2147483648, 65793 * (24 - -var3_int));
            var3_int++;
            continue L0;
          }
        }
    }

    void a(boolean param0) {
        int discarded$4 = 1;
        eg.a(((kl) this).field_f);
        if (!param0) {
            return;
        }
        field_c = null;
    }

    public static void a() {
        field_b = null;
        field_c = null;
        field_e = null;
        field_h = null;
    }

    void c(int param0) {
        int var3 = 0;
        rj var4 = null;
        L0: {
          var3 = DungeonAssault.field_K;
          if (param0 <= -115) {
            break L0;
          } else {
            ((kl) this).field_i = -43;
            break L0;
          }
        }
        var4 = (rj) (Object) ((kl) this).field_f.e(-24172);
        L1: while (true) {
          if (var4 != null) {
            var4.b((byte) 30);
            var4 = (rj) (Object) ((kl) this).field_f.a(4);
            continue L1;
          } else {
            return;
          }
        }
    }

    kl(int param0, int param1) {
        this();
        ((kl) this).a(param0, 0, param1);
    }

    void c(byte param0) {
        int var2 = -121 % ((-34 - param0) / 57);
    }

    final void a(int param0, int param1, int param2) {
        ((kl) this).a(-param2 + 480 >> 1, param0, 640 - param0 >> 1, -23241, param2);
        if (param1 == 0) {
            return;
        }
        ((kl) this).b(-9);
    }

    final void a(byte param0) {
        rj var2 = null;
        int var3 = 0;
        L0: {
          var3 = DungeonAssault.field_K;
          jh.a(((kl) this).field_g);
          if (param0 <= -12) {
            break L0;
          } else {
            ((kl) this).field_g = null;
            break L0;
          }
        }
        ((kl) this).field_l.b(0, 0);
        var2 = (rj) (Object) ((kl) this).field_f.e(-24172);
        L1: while (true) {
          if (var2 == null) {
            jh.b();
            return;
          } else {
            var2.a(-((kl) this).field_k, -((kl) this).field_j, (byte) -96);
            var2 = (rj) (Object) ((kl) this).field_f.a(4);
            continue L1;
          }
        }
    }

    void b(int param0) {
        int var2 = -91 / ((param0 - 41) / 63);
        int discarded$0 = 0;
        this.c();
    }

    void b(boolean param0) {
        if (!param0) {
            return;
        }
        ((kl) this).field_g = null;
    }

    final static String a(CharSequence param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var2_int = 0;
              int discarded$4 = 2;
              int discarded$5 = -1;
              var3 = uj.a(ci.a(param0));
              if (var3 != null) {
                break L1;
              } else {
                var3 = "";
                break L1;
              }
            }
            stackOut_2_0 = (String) var3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("kl.BA(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + -49 + ')');
        }
        return stackIn_3_0;
    }

    public kl() {
        ((kl) this).field_f = new md();
        ((kl) this).field_d = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Renown gained: ";
        field_c = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_b = "Glamour";
    }
}
