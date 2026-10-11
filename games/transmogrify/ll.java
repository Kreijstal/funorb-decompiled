/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll extends bi implements df {
    private lj field_P;
    static int field_U;
    static qj field_T;
    static kk field_V;
    static hi field_Q;
    static boolean field_S;
    static String field_W;
    static int field_R;

    public final void a(lj param0, int param1, int param2, int param3, int param4) {
        lj discarded$1 = null;
        RuntimeException var6 = null;
        ma var7 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 17) {
            var7 = (ma) null;
            discarded$1 = this.a((String) null, (ma) null, 33);
          }
          if (param0 != this.field_P) {
            return;
          }
          this.r(param1 - 28606);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("ll.MA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void q(int param0) {
        field_V = null;
        field_Q = null;
        field_W = null;
        if (param0 != 5) {
          return;
        }
        field_T = null;
    }

    final static int s(int param0) {
        int stackIn_29_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = Transmogrify.field_A ? 1 : 0;
        try {
          var1_int = 0;
          var2 = 0;
          while (pc.b(-10)) {
            bk.field_c.d((byte) -6);
            if (bk.field_c.b(31552)) {
              var1_int = 1;
            }
            if (ch.field_d != 13) {
              continue;
            }
            var2 = 1;
          }
          bk.field_c.a(-112, tl.a(196077633, ol.field_b, nk.field_c), tl.a(196077633, oa.field_j, bk.field_a));
          if (bk.field_c.b(31552)) {
            var1_int = 1;
          }
          var3 = 0;
          if (var1_int != 0 &&
            bk.field_c.field_d >= 0) {
            var3 = uj.field_d[bk.field_c.field_d];
            if (var3 == 2) {
              i.a(false);
            } else if (var3 == 5) {
              i.a(false);
            }
          } else {
            if (var2 != 0 &&
              q.field_a != 2) {
              i.a(false);
            }
          }
          if (param0 < 107) {
            field_W = (String) null;
          }
          if (0 == var3 &&
            q.field_a == 2) {
            var4 = -c.field_c + lk.a(0);
            var6 = (int)((-var4 + 10999L) / 1000L);
            if (var6 <= 0) {
              tf.a((byte) 79, true, 5);
              var3 = 2;
            }
          }
          stackIn_29_0 = var3;
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1), "ll.AA(" + param0 + ')');
        }
    }

    private final void r(int param0) {
        if (!this.field_A) {
          return;
        }
        if (param0 == -28589) {
          this.field_A = false;
          return;
        }
        ll.s(109);
        this.field_A = false;
    }

    ll(da param0, sh param1) {
        super(param0, 200, 150);
        Object var3 = null;
        qg var4 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = null;
          if (param1 != ni.field_o) {
            if (fi.field_w == param1) {
              this.field_h = this.field_h + 10;
              var3 = n.field_b;
              if (hi.b(-106)) {
                this.field_h = this.field_h + 20;
                var3 = lk.field_a;
              }
            } else {
              if (ge.field_A == param1) {
                var3 = dg.field_e;
                this.field_h = this.field_h + 30;
              }
            }
          } else {
            var3 = nh.field_m;
          }
          var4 = new qg((String) (var3), (ma) null);
          var4.field_l = this.field_l;
          var4.field_p = 0;
          var4.field_h = 80;
          var4.field_n = 50;
          var4.field_q = (ui) ((Object) new h(al.field_i, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.a(var4, (byte) -82);
          this.field_P = this.a(oe.field_a, (ma) (this), -3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("ll.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ch.a((Throwable) (stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final lj a(String param0, ma param1, int param2) {
        lj discarded$1 = null;
        lj var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        ma var6 = null;
        lj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new lj(param0, param1);
          var4.field_q = (ui) ((Object) new qa());
          var5 = -6 + this.field_h;
          this.field_h = this.field_h + 38;
          var4.a(-91, var5, 15, -14 + (this.field_l - 16), 30);
          this.a((qg) (var4), (byte) -114);
          if (param2 != -3) {
            var6 = (ma) null;
            discarded$1 = this.a((String) null, (ma) null, 24);
          }
          this.c((byte) 69);
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("ll.W(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean c(boolean param0) {
        if (!param0) {
          ll.c(true);
          return ej.field_n;
        }
        return ej.field_n;
    }

    static {
        field_V = null;
        field_T = new qj();
        field_W = "<u>Tutorial: lesson 2<br>A full game has 10 rounds. Reusing tiles causes their value to rise. If you use the bonus tile, it doubles your word score.<br><br>Make a second word, trying to use the bonus tile:<br><img=0>";
        field_R = 0;
        field_Q = new hi();
    }
}
