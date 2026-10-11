/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gk {
    static int field_a;
    static ie field_e;
    static java.applet.Applet field_j;
    static int[] field_i;
    private boolean field_b;
    private td field_n;
    static String field_h;
    static boolean field_f;
    private Object[] field_o;
    static byte[][] field_g;
    private int field_k;
    private g field_l;
    static char field_d;
    private Object[][] field_c;
    static String field_m;

    final boolean a(String param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        boolean stackIn_9_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.c(-109)) {
            return false;
          }
          param0 = param0.toLowerCase();
          param1 = param1.toLowerCase();
          var6 = (CharSequence) ((Object) param0);
          var4_int = this.field_l.field_a.a(param2 ^ -16444, ae.a(param2 - 51781023, var6));
          if (!this.a(var4_int, false)) {
            return false;
          }
          if (param2 != 16484) {
            stackIn_9_0 = ((boolean[]) (this.field_o[9]))[3];
            return stackIn_9_0;
          }
          var7 = (CharSequence) ((Object) param1);
          var5 = this.field_l.field_k[var4_int].a(-122, ae.a(-51764539, var7));
          stackIn_11_0 = this.a(var4_int, var5, (byte) -14);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("gk.L(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    private final synchronized void e(int param0, int param1) {
        if (this.field_b) {
          this.field_o[param1] = this.field_n.a(param1, true);
        } else {
          this.field_o[param1] = nh.a(false, -11560, this.field_n.a(param1, true));
        }
        if (param0 != -19250) {
          gk.a(((int[]) (this.field_o[1]))[10], (String) (this.field_o[2]));
        }
    }

    final static boolean b(int param0) {
        if (param0 < 110) {
          field_g = (byte[][]) null;
        }
        return ih.field_Q.a(-125);
    }

    final int a(byte param0, int param1) {
        if (param0 != 47) {
          return ((int[]) (this.field_o[6]))[22];
        }
        if (!this.a(param1, false)) {
          return 0;
        }
        return this.field_l.field_c[param1];
    }

    final static void a(int param0, String param1) {
        int stackIn_16_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = Bounce.field_N;
        try {
          ge.field_c = ge.field_c + 1;
          if (ck.field_c == -1 &&
            sj.field_d == -1) {
            ck.field_c = uc.field_C;
            sj.field_d = ll.field_y;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param1 != null) {
            decompiledFrameRemainder0 = !(param1.equals(oc.field_b));
          } else {
            decompiledFrameRemainder0 = (null == oc.field_b);
          }
          if (decompiledFrameRemainder0) {
            if (!nh.field_P) {
              if (ea.field_b <= ge.field_c) {
                stackIn_16_0 = (ge.field_c < ea.field_b + sd.field_lb) ? 1 : 0;
              } else {
                stackIn_16_0 = 0;
              }
            } else {
              stackIn_16_0 = 0;
            }
            boolean decompiledFrameRemainder1 = true;
            var2_int = stackIn_16_0;
            if (param1 != null && (nh.field_P ||
              var2_int != 0)) {
              ge.field_c = ea.field_b;
              decompiledFrameRemainder1 = false;
            }
            else {
              ge.field_c = 0;
            }
            mh.field_Z = ck.field_c;
            if (param1 != null) {
              nh.field_P = false;
            } else {
              if (var2_int != 0) {
                nh.field_P = true;
              }
            }
            ha.field_b = sj.field_d;
          }
          oc.field_b = param1;
          if (!nh.field_P &&
            ge.field_c < ea.field_b &&
            mi.field_j) {
            ge.field_c = 0;
            mh.field_Z = ck.field_c;
            ha.field_b = sj.field_d;
          }
          ck.field_c = -1;
          if (param0 <= 20) {
            gk.b(false);
          }
          if (nh.field_P &&
            jk.field_K == ge.field_c) {
            nh.field_P = false;
            ge.field_c = 0;
          }
          sj.field_d = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_41_0 = var2;
          stackIn_41_1 = new StringBuilder().append("gk.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(')').toString());
        }
    }

    private final synchronized boolean a(int param0, boolean param1) {
        if (!this.c(-94)) {
          return false;
        }
        if (param1) {
          this.field_c = (Object[][]) (this.field_o[8]);
        }
        if (0 > param0 ||
          this.field_l.field_c.length <= param0 ||
          0 == this.field_l.field_c[param0]) {
          if (pe.field_e) {
            throw new IllegalArgumentException(Integer.toString(param0));
          }
          return false;
        }
        return true;
    }

    final boolean b(String param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.c(-78)) {
            return false;
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_l.field_a.a(-55, ae.a(-51764539, var4));
          if (param1) {
            field_g = (byte[][]) (this.field_o[0]);
          }
          stackIn_6_0 = this.d(var3_int, 77);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("gk.M(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized int a(int param0, int param1) {
        if (!this.a(param0, false)) {
          return 0;
        }
        if (param1 != 0) {
          return -128;
        }
        if (null != this.field_o[param0]) {
          return 100;
        }
        return this.field_n.a(113, param0);
    }

    final synchronized boolean c(int param0) {
        if (this.field_l == null) {
          this.field_l = this.field_n.b(1);
          if (null == this.field_l) {
            return false;
          }
          this.field_o = new Object[this.field_l.field_m];
          this.field_c = new Object[this.field_l.field_m][];
        }
        int var2 = 110 % ((-19 - param0) / 57);
        return true;
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        if (!this.c(72)) {
          return false;
        }
        if (param2 > param0 ||
          0 > param1 ||
          this.field_l.field_c.length <= param0 ||
          param1 >= this.field_l.field_c[param0]) {
          if (pe.field_e) {
            throw new IllegalArgumentException(param0 + " " + param1);
          }
          return false;
        }
        return true;
    }

    public static void b(boolean param0) {
        field_e = null;
        field_g = (byte[][]) null;
        field_i = null;
        field_j = null;
        field_h = null;
        field_m = null;
        if (param0) {
          gk.b(-83, -52);
        }
    }

    final boolean a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.c(115)) {
            return false;
          }
          param0 = param0.toLowerCase();
          if (param1 != -16) {
            ((byte[]) (this.field_o[1]))[0] = (byte) 78;
          }
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_l.field_a.a(-86, ae.a(-51764539, var4));
          if (0 <= var3_int) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("gk.CA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final int b(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.c(param1 + 145)) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          param0 = param0.toLowerCase();
          if (param1 != -100) {
            stackIn_5_0 = ((int[]) (this.field_o[0]))[19];
            return stackIn_5_0;
          }
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_l.field_a.a(-64, ae.a(-51764539, var4));
          stackIn_7_0 = this.a(var3_int, 0);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("gk.V(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized int a(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var4Lifetime1;
        var5 = Bounce.field_N;
        if (!this.c(94)) {
          return 0;
        }
        var2 = 0;
        var3 = 0;
        for (var4 = 0; var4 < this.field_o.length; var4++) {
          if (this.field_l.field_q[var4] > 0) {
            var3 = var3 + this.a(var4, 0);
            var2 += 100;
          }
        }
        if (var2 == 0) {
          return 100;
        }
        var4Lifetime1 = var3 * param0 / var2;
        return var4Lifetime1;
    }

    final int a(boolean param0) {
        if (!this.c(45)) {
          return -1;
        }
        if (!param0) {
          return -115;
        }
        return this.field_l.field_c.length;
    }

    final static void a(int param0, int param1, tg[] param2, int param3, int param4) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = Bounce.field_N;
        if (param2 == null ||
          param4 <= 0) {
          return;
        }
        try {
          var5_int = param2[0].field_t;
          var6 = param2[2].field_t;
          var7 = param2[1].field_t;
          param2[0].a(param0, param3);
          param2[2].a(param4 + (param0 - var6), param3);
          na.b(hh.field_h);
          na.c(var5_int + param0, param3, param4 + param0 - var6, param3 + param2[param1].field_o);
          var8 = param0 + var5_int;
          var9 = param4 + (param0 - var6);
          for (param0 = var8; var9 > param0; param0 = param0 + var7) {
            param2[1].a(param0, param3);
          }
          na.a(hh.field_h);
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "gk.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final synchronized byte[] b(String param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        Object stackIn_5_0 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = -22 / ((70 - param2) / 47);
          if (!this.c(50)) {
            return null;
          }
          param0 = param0.toLowerCase();
          param1 = param1.toLowerCase();
          var7 = (CharSequence) ((Object) param0);
          var5 = this.field_l.field_a.a(-73, ae.a(-51764539, var7));
          if (!this.a(var5, false)) {
            stackIn_5_0 = null;
            return (byte[]) (stackIn_5_0);
          }
          var8 = (CharSequence) ((Object) param1);
          var6 = this.field_l.field_k[var5].a(-96, ae.a(-51764539, var8));
          stackIn_7_0 = this.b(104, var6, var5);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("gk.Q(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized boolean d(int param0, int param1) {
        if (!this.a(param0, false)) {
          return false;
        }
        if (this.field_o[param0] != null) {
          return true;
        }
        this.e(-19250, param0);
        if (param1 <= 68) {
          field_d = '￾';
        }
        if (null == this.field_o[param0]) {
          return false;
        }
        return true;
    }

    final int a(int param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a(param0, false)) {
            stackIn_2_0 = -1;
            return stackIn_2_0;
          }
          var5 = -1 / ((51 - param2) / 44);
          param1 = param1.toLowerCase();
          var6 = (CharSequence) ((Object) param1);
          var4_int = this.field_l.field_k[param0].a(-79, ae.a(-51764539, var6));
          if (this.a(param0, var4_int, 0)) {
            stackIn_7_0 = var4_int;
            return stackIn_7_0;
          }
          stackIn_5_0 = -1;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("gk.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized boolean a(byte param0) {
        int var3 = 0;
        int var2;
        int var4;
        int var5;
        var5 = Bounce.field_N;
        if (!this.c(-95)) {
          return false;
        }
        if (param0 > -35) {
          this.a(-77, -72, (byte) -81);
        }
        var2 = 1;
        for (var3 = 0; var3 < this.field_l.field_n.length; var3++) {
          var4 = this.field_l.field_n[var3];
          if (null == this.field_o[var4]) {
            this.e(-19250, var4);
            if (null == this.field_o[var4]) {
              var2 = 0;
            }
          }
        }
        return var2 != 0;
    }

    final static void b(int param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = Bounce.field_N;
        var2 = 0;
        var3 = oa.field_a;
        if (var3 < 5) {
          var2 = var3 * var3 * 8192 / 1100;
        } else {
          if (105 > var3) {
            var2 = (-40960 + var3 * 16384) / 220;
          } else {
            if (var3 < 120) {
              var3 = 120 - var3;
              var2 = 8192 - var3 * var3 * 8192 / 3300;
            }
          }
        }
        var4 = 1;
        if (param1 != -1) {
          field_j = (java.applet.Applet) null;
        }
        var5 = 0;
        if (param0 == 3) {
          var4 = -1;
        }
        if (param0 == 1) {
          var5 = 1;
        }
        if (4 == param0) {
          var5 = 1;
          var4 = 1;
        }
        if (param0 == 5) {
          var4 = -1;
          var5 = 1;
        }
        if (6 == param0) {
          var5 = -1;
          var4 = 1;
        }
        if (7 == param0 ||
          param0 == 8) {
          var4 = -1;
          var5 = -1;
        }
        if (param0 == 11) {
          var4 = -1;
        }
        if (12 == param0) {
          var5 = -1;
          var4 = -1;
        }
        if (param0 == 13) {
          var4 = 1;
          var5 = -1;
        }
        if (14 == param0) {
          var5 = 1;
          var4 = -1;
        }
        if (param0 == 15) {
          var5 = 1;
          var4 = 1;
        }
        il.field_e = jf.a(var2 * var4, false, var5 * var2);
    }

    final synchronized boolean a(int param0, int param1, byte param2) {
        if (!this.a(param0, param1, 0)) {
          return false;
        }
        if (null != this.field_c[param0] &&
          this.field_c[param0][param1] != null) {
          return true;
        }
        if (null != this.field_o[param0]) {
          return true;
        }
        if (param2 != -14) {
          this.a((String) null, ((boolean[]) (this.field_o[2]))[0]);
        }
        this.e(param2 ^ 19260, param0);
        if (this.field_o[param0] != null) {
          return true;
        }
        return false;
    }

    final byte[] b(int param0, int param1, int param2) {
        int var4 = -13 % ((46 - param0) / 44);
        return this.a((byte) 121, param2, param1, (int[]) null);
    }

    gk(td param0, boolean param1, int param2) {
        this.field_l = null;
        try {
          if (0 > param2 ||
            2 < param2) {
            throw new IllegalArgumentException("");
          }
          this.field_b = param1 ? true : false;
          this.field_k = param2;
          this.field_n = param0;
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "gk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final synchronized byte[] a(byte param0, int param1, int param2, int[] param3) {
        Object stackIn_2_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        byte[] var7 = null;
        try {
          if (!this.a(param1, param2, 0)) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          var5 = null;
          if ((this.field_c[param1] == null ||
            null == this.field_c[param1][param2]) && !this.a(param1, false, param3, param2)) {
            this.e(-19250, param1);
            if (!this.a(param1, false, param3, param2)) {
              return null;
            }
          }
          if (null == this.field_c[param1]) {
            throw new RuntimeException("");
          }
          if (this.field_c[param1][param2] != null) {
            var7 = qf.a(0, false, this.field_c[param1][param2]);
            var5 = var7;
            if (var7 == null) {
              throw new RuntimeException("");
            }
          }
          if (param0 != 121) {
            ((boolean[]) (this.field_o[1]))[5] = true;
          }
          if (var5 != null) {
            if (this.field_k != 1) {
              if (this.field_k == 2) {
                this.field_c[param1] = null;
              }
            } else {
              this.field_c[param1][param2] = null;
              if (1 == this.field_l.field_c[param1]) {
                this.field_c[param1] = null;
              }
            }
          }
          stackIn_26_0 = var5;
          return (byte[]) (stackIn_26_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_29_0 = var5;
          stackIn_29_1 = new StringBuilder().append("gk.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw ii.a((Throwable) (stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final synchronized byte[] c(int param0, int param1) {
        if (!this.c(68)) {
          return null;
        }
        if (this.field_l.field_c.length == 1) {
          return this.b(113, param1, 0);
        }
        if (!this.a(param1, false)) {
          return null;
        }
        if (param0 <= 118) {
          field_h = (String) null;
        }
        if (this.field_l.field_c[param1] == 1) {
          return this.b(-19, 0, param1);
        }
        throw new RuntimeException();
    }

    private final synchronized boolean a(int param0, boolean param1, int[] param2, int param3) {
        Object[] array$0 = null;
        int var9_int = 0;
        int var20 = 0;
        byte[] array$1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        boolean stackIn_37_2 = false;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_105_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        byte[] var9 = null;
        int var10 = 0;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int[] var14_ref_int__ = null;
        int var15 = 0;
        byte[][] var15_ref_byte____ = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var21 = 0;
        int var22 = 0;
        byte[] var23 = null;
        int[] var24 = null;
        byte[] var25 = null;
        wi var26 = null;
        byte[] var27 = null;
        wi var29 = null;
        int[] var30 = null;
        byte[][] var31 = null;
        wi var32 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var38 = null;
        byte[][] var39 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        int var14Lifetime1;
        var22 = Bounce.field_N;
        try {
          if (!this.a(param0, param1)) {
            return false;
          }
          if (null == this.field_o[param0]) {
            return false;
          }
          var5_int = this.field_l.field_q[param0];
          if (param1) {
            this.field_o[9] = this.field_o[11];
          }
          var34 = this.field_l.field_o[param0];
          var24 = var34;
          var6 = var24;
          if (null == this.field_c[param0]) {
            array$0 = new Object[this.field_l.field_c[param0]];
            this.field_c[param0] = array$0;
          }
          var7 = this.field_c[param0];
          var8 = 1;
          for (var9_int = 0; var9_int < var5_int; var9_int++) {
            if (var6 != null) {
              var10 = var34[var9_int];
            } else {
              var10 = var9_int;
            }
            if (var7[var10] != null) {
              continue;
            }
            var8 = 0;
            break;
          }
          if (var8 != 0) {
            return true;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param2 != null && (0 != param2[0] ||
            param2[1] != 0 ||
            param2[2] != 0 ||
            param2[3] != 0)) {
            var35 = qf.a(0, true, this.field_o[param0]);
            var25 = var35;
            var9 = var25;
            var26 = new wi(var35);
            var26.a(85, param2, 5, var26.field_i.length);
            decompiledFrameRemainder0 = false;
          }
          else {
            var9 = qf.a(0, false, this.field_o[param0]);
          }
          try {
            var36 = ta.a(21125, var9);
            var27 = var36;
            var23 = var27;
            var43 = var23;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var11_ref_RuntimeException = decompiledCaughtException;
            stackIn_36_0 = var11_ref_RuntimeException;
            stackIn_36_1 = new StringBuilder();
            stackIn_37_2 = (param2 != null);
            throw ii.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(" ").append(param0).append(" ").append(var9.length).append(" ").append(nb.a(var9, var9.length, (byte) -86)).append(" ").append(nb.a(var9, -2 + var9.length, (byte) -82)).append(" ").append(this.field_l.field_j[param0]).append(" ").append(this.field_l.field_b).toString());
          }
          if (this.field_b) {
            this.field_o[param0] = null;
          }
          if (var5_int > 1) {
            if (2 == this.field_k) {
              var11 = var36.length;
              var11--;
              var12 = 255 & var23[var11];
              var11 = var11 - var5_int * var12 * 4;
              var32 = new wi(var43);
              var14 = 0;
              var32.field_h = var11;
              var15 = 0;
              for (var16 = 0; var12 > var16; var16++) {
                var17 = 0;
                for (var18 = 0; var5_int > var18; var18++) {
                  var17 = var17 + var32.j(-3);
                  if (var6 != null) {
                    var19 = var34[var18];
                  } else {
                    var19 = var18;
                  }
                  if (param3 == var19) {
                    var15 = var19;
                    var14 = var14 + var17;
                  }
                }
              }
              if (var14 == 0) {
                return true;
              }
              var44 = new byte[var14];
              var32.field_h = var11;
              var14Lifetime1 = 0;
              var17 = 0;
              for (var18 = 0; var18 < var12; var18++) {
                var19 = 0;
                for (var20 = 0; var5_int > var20; var20++) {
                  var19 = var19 + var32.j(-3);
                  if (var6 == null) {
                    var21 = var20;
                  } else {
                    var21 = var34[var20];
                  }
                  if (var21 == param3) {
                    cb.a(var43, var17, var44, var14Lifetime1, var19);
                    var14Lifetime1 = var14Lifetime1 + var19;
                  }
                  var17 = var17 + var19;
                }
              }
              var7[var15] = var44;
            } else {
              var11 = var36.length;
              var11--;
              var12 = var23[var11] & 255;
              var11 = var11 - 4 * (var5_int * var12);
              var29 = new wi(var43);
              var38 = new int[var5_int];
              var30 = var38;
              var14_ref_int__ = var30;
              var29.field_h = var11;
              for (var15 = 0; var15 < var12; var15++) {
                var16 = 0;
                for (var17 = 0; var17 < var5_int; var17++) {
                  var16 = var16 + var29.j(-3);
                  var14_ref_int__[var17] = var14_ref_int__[var17] + var16;
                }
              }
              var39 = new byte[var5_int][];
              var31 = var39;
              var15_ref_byte____ = var31;
              for (var16 = 0; var16 < var5_int; var16++) {
                array$1 = new byte[var38[var16]];
                var15_ref_byte____[var16] = array$1;
                var38[var16] = 0;
              }
              var29.field_h = var11;
              var16 = 0;
              for (var17 = 0; var12 > var17; var17++) {
                var18 = 0;
                for (var19 = 0; var19 < var5_int; var19++) {
                  var18 = var18 + var29.j(-3);
                  cb.a(var43, var16, var39[var19], var38[var19], var18);
                  var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                  var16 = var16 + var18;
                }
              }
              for (var17 = 0; var5_int > var17; var17++) {
                if (var6 != null) {
                  var18 = var34[var17];
                } else {
                  var18 = var17;
                }
                if (0 == this.field_k) {
                  var7[var18] = nh.a(false, -11560, var39[var17]);
                } else {
                  var7[var18] = var39[var17];
                }
              }
            }
          } else {
            if (var6 != null) {
              var11 = var34[0];
            } else {
              var11 = 0;
            }
            if (0 != this.field_k) {
              var7[var11] = var36;
              return true;
            }
            var7[var11] = nh.a(false, -11560, var43);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = decompiledCaughtException;
          stackIn_104_0 = var5;
          stackIn_104_1 = new StringBuilder().append("gk.P(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_105_2 = "null";
          } else {
            stackIn_105_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_104_0), ((StringBuilder) (Object) stackIn_104_1).append(stackIn_105_2).append(',').append(param3).append(')').toString());
        }
    }

    final int a(String param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.c(-104)) {
            stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_l.field_a.a(-107, ae.a(-51764539, var4));
          if (this.a(var3_int, param1)) {
            return var3_int;
          }
          stackIn_7_0 = -1;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("gk.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_m = "Create a free Account";
    }
}
