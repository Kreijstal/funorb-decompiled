/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th extends wb {
    static dl field_t;
    int[] field_u;
    private int[][] field_v;
    private int[] field_x;
    static int field_z;
    private String[] field_w;
    static String field_r;
    static String[][] field_p;
    static il field_y;
    static km[] field_o;
    static String field_s;
    static boolean field_q;

    final void d(boolean param0) {
        int var2 = 0;
        int var3 = Virogrid.field_F ? 1 : 0;
        if (this.field_u != null) {
          for (var2 = 0; var2 < this.field_u.length; var2++) {
            this.field_u[var2] = oh.a(this.field_u[var2], 32768);
          }
        }
        if (param0) {
          field_q = false;
        }
    }

    final void a(jc param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          if (param1 != 0) {
            field_r = (String) null;
          }
          while (true) {
            var3_int = param0.g(11132);
            if (var3_int == 0) {
              return;
            }
            this.a(var3_int, 60, param0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("th.F(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final String d(int param0) {
        int var3 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4 = Virogrid.field_F ? 1 : 0;
        if (param0 < 113) {
          return (String) null;
        }
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (this.field_w == null) {
          return "";
        }
        StringBuilder discarded$0 = var5.append(this.field_w[0]);
        for (var3 = 1; this.field_w.length > var3; var3++) {
          discarded$1 = var2.append("...");
          discarded$2 = var5.append(this.field_w[var3]);
        }
        return var2.toString();
    }

    public static void e(int param0) {
        field_p = (String[][]) null;
        field_t = null;
        field_o = null;
        if (param0 != -5) {
          return;
        }
        field_r = null;
        field_y = null;
        field_s = null;
    }

    final static Object a(int param0, byte[] param1, boolean param2) {
        tl var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        tl stackIn_6_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            stackIn_2_0 = null;
            return stackIn_2_0;
          }
          if (136 < param1.length) {
            var3 = new tl();
            ((wh) ((Object) var3)).a(param1, (byte) -4);
            stackIn_6_0 = var3;
            return stackIn_6_0;
          }
          if (param0 != -3) {
            th.a((byte) 34, -128, -119, 34);
          }
          if (!param2) {
            stackIn_13_0 = (byte[]) (param1);
            return stackIn_13_0;
          }
          stackIn_11_0 = va.a(param1, 0);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("th.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void b(byte param0) {
        Object var1 = null;
        int var2 = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          var1 = w.field_L;
          synchronized (var1) {
            ph.field_h = re.field_l;
            um.field_Fb = um.field_Fb + 1;
            if (ch.field_f < 0) {
              for (var2 = 0; 112 > var2; var2++) {
                dc.field_Y[var2] = false;
              }
              ch.field_f = bf.field_i;
            } else {
              while (ch.field_f != bf.field_i) {
                var2 = ab.field_H[bf.field_i];
                bf.field_i = bf.field_i + 1 & 127;
                if (var2 < 0) {
                  dc.field_Y[~var2] = false;
                  continue;
                }
                dc.field_Y[var2] = true;
              }
            }
            re.field_l = hh.field_e;
          }
          if (param0 != 112) {
            field_z = 45;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var1_ref), "th.E(" + param0 + ')');
        }
    }

    final static boolean a(byte param0, int param1, int param2, int param3) {
        int var4;
        var4 = -93 % ((13 - param0) / 45);
        if (param3 >= 0 &&
          param3 <= 11) {
          if (param2 < 1) {
            return false;
          }
          if (kb.a(false, param1, param3) >= param2) {
            return true;
          }
          return false;
        }
        return false;
    }

    private final void a(int param0, int param1, jc param2) {
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
        lc var7 = null;
        int var9 = 0;
        var9 = Virogrid.field_F ? 1 : 0;
        try {
          if (param0 == 1) {
            this.field_w = ql.a(param2.h(-122), (byte) -123, '<');
          } else {
            if (param0 == 2) {
              var4_int = param2.g(11132);
              this.field_u = new int[var4_int];
              for (var5 = 0; var4_int > var5; var5++) {
                this.field_u[var5] = param2.c((byte) 110);
              }
            } else {
              if (param0 == 3) {
                var4_int = param2.g(11132);
                this.field_x = new int[var4_int];
                this.field_v = new int[var4_int][];
                for (var5 = 0; var5 < var4_int; var5++) {
                  var6 = param2.c((byte) 97);
                  var7 = vb.a((byte) 0, var6);
                  if (var7 != null) {
                    this.field_x[var5] = var6;
                    array$0 = new int[var7.field_g];
                    this.field_v[var5] = array$0;
                    for (var8 = 0; var7.field_g > var8; var8++) {
                      this.field_v[var5][var8] = param2.c((byte) 50);
                    }
                  }
                }
              } else {
                if (param0 == 4) {
                }
              }
            }
          }
          if (param1 != 60) {
            field_t = (dl) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_23_0 = var4;
          stackIn_23_1 = new StringBuilder().append("th.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    th() {
    }

    static {
        field_t = new dl();
        field_r = "Average rating";
        field_s = "Resign";
    }
}
