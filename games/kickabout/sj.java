/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj {
    static boolean field_g;
    private kl field_d;
    int field_c;
    private Object[] field_e;
    private Object[][] field_a;
    static int field_h;
    boolean field_b;
    static sj field_f;
    private ow field_i;

    final static void b(int param0) {
        nv.field_N = new tf();
        if (param0 != -1) {
          sj.a(4, 10, (byte) -102);
        }
    }

    final boolean a(String param0, String param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        String var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.d(-80)) {
            return false;
          }
          param0 = param0.toLowerCase();
          param1 = param1.toLowerCase();
          var7 = (CharSequence) ((Object) param0);
          var4_int = this.field_d.field_q.a(tf.a(true, var7), param2 - 33);
          if (param2 != -10) {
            var6 = (String) null;
            this.a(((byte[]) (this.field_e[3]))[2], (String) null, -100);
          }
          if (!this.a((byte) -58, var4_int)) {
            return false;
          }
          var8 = (CharSequence) ((Object) param1);
          var5 = this.field_d.field_s[var4_int].a(tf.a(true, var8), -67);
          stackIn_9_0 = this.a(var5, 125, var4_int);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("sj.R(");
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
          throw nb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized boolean a(int param0, int param1, int param2) {
        if (!this.a(param2, param0, true)) {
          return false;
        }
        if (this.field_a[param2] != null &&
          null != this.field_a[param2][param0]) {
          return true;
        }
        if (null != this.field_e[param2]) {
          return true;
        }
        if (param1 < 36) {
          this.a(false, (String) (this.field_e[4]));
        }
        this.a(param2, (byte) 41);
        if (this.field_e[param2] != null) {
          return true;
        }
        return false;
    }

    public static void c(int param0) {
        if (param0 >= -83) {
          sj.a(0.31954155933475825, (byte) 102, 1.241292563355284, 0.9239833289377695);
        }
        field_f = null;
    }

    final synchronized boolean a(boolean param0) {
        int var3 = 0;
        int var2;
        int var4;
        int var5;
        var5 = Kickabout.field_G;
        if (!this.d(-64)) {
          return false;
        }
        var2 = 1;
        if (param0) {
          this.field_d = (kl) null;
        }
        for (var3 = 0; this.field_d.field_b.length > var3; var3++) {
          var4 = this.field_d.field_b[var3];
          if (this.field_e[var4] == null) {
            this.a(var4, (byte) 38);
            if (null == this.field_e[var4]) {
              var2 = 0;
            }
          }
        }
        return var2 != 0;
    }

    private final synchronized byte[] a(int param0, int[] param1, boolean param2, int param3) {
        Object stackIn_11_0 = null;
        Object stackIn_25_0 = null;
        Object stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        byte[] var7 = null;
        try {
          if (!param2) {
            this.field_d = (kl) null;
          }
          if (!this.a(param0, param3, param2)) {
            return null;
          }
          var5 = null;
          if ((this.field_a[param0] == null ||
            null == this.field_a[param0][param3]) && !this.a(param0, param1, param3, 2)) {
            this.a(param0, (byte) 86);
            if (!this.a(param0, param1, param3, 2)) {
              stackIn_11_0 = null;
              return (byte[]) (stackIn_11_0);
            }
          }
          if (this.field_a[param0] == null) {
            throw new RuntimeException("");
          }
          if (this.field_a[param0][param3] != null) {
            var7 = lg.a(this.field_a[param0][param3], false, 18828);
            var5 = var7;
            if (var7 == null) {
              throw new RuntimeException("");
            }
          }
          if (var5 != null) {
            if (this.field_c != 1) {
              if (this.field_c == 2) {
                this.field_a[param0] = null;
              }
            } else {
              this.field_a[param0][param3] = null;
              if (this.field_d.field_e[param0] == 1) {
                this.field_a[param0] = null;
              }
            }
          }
          stackIn_25_0 = var5;
          return (byte[]) (stackIn_25_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_28_0 = var5;
          stackIn_28_1 = new StringBuilder().append("sj.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw nb.a((Throwable) (stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final synchronized void a(int param0, byte param1) {
        if (this.field_b) {
          this.field_e[param0] = this.field_i.b(param0, 4);
        } else {
          this.field_e[param0] = cq.a(this.field_i.b(param0, 4), false, 136);
        }
        if (param1 < 31) {
          this.b(-52, ((int[]) (this.field_e[5]))[1]);
        }
    }

    final synchronized byte[] a(String param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 <= 2) {
            sj.c(((int[]) (this.field_e[10]))[0]);
          }
          if (!this.d(-118)) {
            return null;
          }
          param1 = param1.toLowerCase();
          param0 = param0.toLowerCase();
          var6 = (CharSequence) ((Object) param1);
          var4_int = this.field_d.field_q.a(tf.a(true, var6), -73);
          if (!this.a((byte) -70, var4_int)) {
            return null;
          }
          var7 = (CharSequence) ((Object) param0);
          var5 = this.field_d.field_s[var4_int].a(tf.a(true, var7), -128);
          stackIn_9_0 = this.b(var4_int, -32669, var5);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("sj.J(");
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
          throw nb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    private final synchronized boolean a(int param0, int param1, boolean param2) {
        if (!param2) {
          this.a((String) (((Object[]) (this.field_e[6]))[2]), (String) (((Object[]) (this.field_e[5]))[6]), ((int[]) (((Object[]) (this.field_e[0]))[8]))[7]);
        }
        if (!this.d(-88)) {
          return false;
        }
        if (0 <= param0 &&
          param1 >= 0 &&
          param0 < this.field_d.field_e.length &&
          param1 < this.field_d.field_e[param0]) {
          return true;
        }
        if (rf.field_a) {
          throw new IllegalArgumentException(param0 + " " + param1);
        }
        return false;
    }

    final boolean a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.d(-121)) {
            return false;
          }
          if (param1 > -46) {
            ((long[]) (this.field_e[9]))[5] = -51L;
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_d.field_q.a(tf.a(true, var4), -108);
          if (var3_int >= 0) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("sj.B(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized int[] c(int param0, int param1) {
        int[] var6 = null;
        int var4 = 0;
        int var5 = Kickabout.field_G;
        if (!this.a((byte) -40, param0)) {
          return null;
        }
        if (param1 != 4) {
          return (int[]) null;
        }
        int[] var3 = this.field_d.field_r[param0];
        if (var3 == null) {
          var6 = new int[this.field_d.field_i[param0]];
          var3 = var6;
          for (var4 = 0; var6.length > var4; var4++) {
            var6[var4] = var4;
          }
        }
        return var3;
    }

    private final synchronized boolean a(byte param0, int param1) {
        if (!this.d(-78)) {
          return false;
        }
        int var3 = 38 % ((22 - param0) / 62);
        if (param1 >= 0 &&
          this.field_d.field_e.length > param1 &&
          this.field_d.field_e[param1] != 0) {
          return true;
        }
        if (!rf.field_a) {
          return false;
        }
        throw new IllegalArgumentException(Integer.toString(param1));
    }

    final synchronized byte[] a(int param0, int param1) {
        if (!this.d(param0 - 56)) {
          return null;
        }
        if (this.field_d.field_e.length == 1) {
          return this.b(0, -32669, param1);
        }
        if (!this.a((byte) 112, param1)) {
          return null;
        }
        if (param0 != 0) {
          return (byte[]) null;
        }
        if (this.field_d.field_e[param1] == 1) {
          return this.b(param1, param0 - 32669, 0);
        }
        throw new RuntimeException();
    }

    final byte[] b(int param0, int param1, int param2) {
        if (param1 != -32669) {
          this.a(((boolean[]) (this.field_e[17]))[4], -120);
        }
        return this.a(param0, (int[]) null, true, param2);
    }

    final int a(int param0) {
        if (param0 <= 79) {
          ((Object[]) (this.field_e[5]))[0] = (Object) null;
        }
        if (!this.d(-111)) {
          return -1;
        }
        return this.field_d.field_e.length;
    }

    final synchronized boolean d(int param0) {
        if (param0 >= -29) {
          return ((boolean[]) (this.field_e[1]))[1];
        }
        if (null != this.field_d) {
          return true;
        }
        this.field_d = this.field_i.a(-24854);
        if (null == this.field_d) {
          return false;
        }
        this.field_a = new Object[this.field_d.field_d][];
        this.field_e = new Object[this.field_d.field_d];
        return true;
    }

    final synchronized boolean b(int param0, int param1) {
        if (!this.d(-107)) {
          return false;
        }
        if (this.field_d.field_e.length == 1) {
          return this.a(param0, 44, 0);
        }
        if (!this.a((byte) 107, param0)) {
          return false;
        }
        if (1 == this.field_d.field_e[param0]) {
          return this.a(0, 66, param0);
        }
        if (param1 < 108) {
          this.a((String) null, ((int[]) (this.field_e[0]))[5]);
        }
        throw new RuntimeException();
    }

    final synchronized int b(int param0, byte param1) {
        if (!this.a((byte) -104, param0)) {
          return 0;
        }
        if (this.field_e[param0] != null) {
          return 100;
        }
        if (param1 != 56) {
          return -55;
        }
        return this.field_i.a(6999, param0);
    }

    final int a(byte param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a((byte) -108, param2)) {
            stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          param1 = param1.toLowerCase();
          var5 = (CharSequence) ((Object) param1);
          var4_int = this.field_d.field_s[param2].a(tf.a(true, var5), -78);
          if (!this.a(param2, var4_int, true)) {
            stackIn_7_0 = -1;
            return stackIn_7_0;
          }
          if (param0 > -63) {
            this.field_i = (ow) null;
          }
          stackIn_11_0 = var4_int;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("sj.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean a(boolean param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.d(-56)) {
            return false;
          }
          param1 = param1.toLowerCase();
          if (param0) {
            return true;
          }
          var4 = (CharSequence) ((Object) param1);
          var3_int = this.field_d.field_q.a(tf.a(true, var4), -123);
          stackIn_7_0 = this.b((byte) 20, var3_int);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("sj.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final int b(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.d(-100)) {
            stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_d.field_q.a(tf.a(true, var4), -66);
          if (!this.a((byte) 115, var3_int)) {
            stackIn_6_0 = -1;
            return stackIn_6_0;
          }
          if (param1 == -1) {
            stackIn_11_0 = var3_int;
            return stackIn_11_0;
          }
          stackIn_9_0 = ((int[]) (this.field_e[2]))[0];
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("sj.Q(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized int e(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var4Lifetime1;
        var5 = Kickabout.field_G;
        if (param0 != -8185) {
          this.b(-94, -79);
        }
        if (!this.d(param0 + 8092)) {
          return 0;
        }
        var2 = 0;
        var3 = 0;
        for (var4 = 0; this.field_e.length > var4; var4++) {
          if (this.field_d.field_i[var4] > 0) {
            var3 = var3 + this.b(var4, (byte) 56);
            var2 += 100;
          }
        }
        if (var2 == 0) {
          return 100;
        }
        var4Lifetime1 = 100 * var3 / var2;
        return var4Lifetime1;
    }

    final static void a(double param0, byte param1, double param2, double param3) {
        wm.field_C = wm.field_C + param2;
        if (param1 <= 125) {
          field_g = false;
        }
        cq.field_f = cq.field_f + param0;
        la.field_d = la.field_d + 8.0 * param3;
        if (848.0 > la.field_d) {
          la.field_d = 848.0;
        }
        if (2048.0 < la.field_d) {
          la.field_d = 2048.0;
        }
        if (pb.field_B) {
          return;
        }
        int var7 = 81920 / hw.field_i - 320;
        int var8 = 61440 / hw.field_i - 240;
        int var9 = 896 - var7;
        int var10 = -var8 + 1344;
        if ((double)var8 > cq.field_f) {
          cq.field_f = (double)var8;
        }
        if (wm.field_C < (double)var7) {
          wm.field_C = (double)var7;
        }
        if (cq.field_f > (double)var10) {
          cq.field_f = (double)var10;
        }
        if (wm.field_C > (double)var9) {
          wm.field_C = (double)var9;
        }
    }

    final static int a(int param0, int param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Kickabout.field_G;
        try {
          if (param2 > -71) {
            field_f = (sj) null;
          }
          var3_int = 0;
          var4 = uq.field_c;
          while (eq.field_c.length > var3_int) {
            var5 = dk.field_g[var3_int];
            if (var5 >= 0) {
              var6 = ud.a(10, eq.field_c[var3_int], true);
              var7 = -(var6 >> 1) + ta.field_A;
              var4 = var4 + aj.field_a;
              if (ec.a(-eb.field_d + var7, param1, param0, (byte) -124, var4, var6 + (eb.field_d << 1), nr.field_j + (pr.field_d << 1))) {
                stackIn_9_0 = var5;
                return stackIn_9_0;
              }
              var4 = var4 + ((pr.field_d << 1) + aj.field_a + nr.field_j);
            } else {
              var4 = var4 + la.field_c;
            }
            var3_int++;
          }
          stackIn_13_0 = -1;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var3), "sj.U(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int a(boolean param0, int param1) {
        if (!this.a((byte) 87, param1)) {
          return 0;
        }
        if (!param0) {
          this.a(-87, ((int[]) (this.field_e[5]))[0], -96);
        }
        return this.field_d.field_e[param1];
    }

    private final synchronized boolean a(int param0, int[] param1, int param2, int param3) {
        Object[] array$0 = null;
        int var9_int = 0;
        int var20 = 0;
        byte[] array$1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        boolean stackIn_36_2 = false;
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
        int[] var14 = null;
        int var14_int = 0;
        int var15_int = 0;
        byte[][] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var21 = 0;
        int var22 = 0;
        byte[] var23 = null;
        int[] var24 = null;
        byte[] var25 = null;
        iw var26 = null;
        byte[] var27 = null;
        iw var29 = null;
        iw var31 = null;
        int[] var32 = null;
        byte[][] var33 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var39 = null;
        byte[][] var40 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        int var14_intLifetime1;
        var22 = Kickabout.field_G;
        try {
          if (!this.a((byte) 91, param0)) {
            return false;
          }
          if (null == this.field_e[param0]) {
            return false;
          }
          if (param3 != 2) {
            field_g = ((boolean[]) (this.field_e[1]))[1];
          }
          var5_int = this.field_d.field_i[param0];
          var34 = this.field_d.field_r[param0];
          var24 = var34;
          var6 = var24;
          if (null == this.field_a[param0]) {
            array$0 = new Object[this.field_d.field_e[param0]];
            this.field_a[param0] = array$0;
          }
          var7 = this.field_a[param0];
          var8 = 1;
          for (var9_int = 0; var9_int < var5_int; var9_int++) {
            if (var6 == null) {
              var10 = var9_int;
            } else {
              var10 = var34[var9_int];
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
          if (param1 != null && (0 != param1[0] ||
            param1[1] != 0 ||
            param1[2] != 0 ||
            param1[3] != 0)) {
            var35 = lg.a(this.field_e[param0], true, 18828);
            var25 = var35;
            var9 = var25;
            var26 = new iw(var35);
            var26.a(var26.field_f.length, param1, true, 5);
            decompiledFrameRemainder0 = false;
          }
          else {
            var9 = lg.a(this.field_e[param0], false, param3 + 18826);
          }
          try {
            var36 = hh.a(var9, (byte) -3);
            var27 = var36;
            var23 = var27;
            var43 = var23;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var11_ref_RuntimeException = decompiledCaughtException;
            stackIn_35_0 = var11_ref_RuntimeException;
            stackIn_35_1 = new StringBuilder();
            stackIn_36_2 = (param1 != null);
            throw nb.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(" ").append(param0).append(" ").append(var9.length).append(" ").append(er.a(false, var9.length, var9)).append(" ").append(er.a(false, var9.length - 2, var9)).append(" ").append(this.field_d.field_c[param0]).append(" ").append(this.field_d.field_g).toString());
          }
          if (this.field_b) {
            this.field_e[param0] = null;
          }
          if (var5_int > 1) {
            if (this.field_c == 2) {
              var11 = var36.length;
              var11--;
              var12 = var23[var11] & 255;
              var11 = var11 - var5_int * var12 * 4;
              var29 = new iw(var43);
              var14_int = 0;
              var15_int = 0;
              var29.field_n = var11;
              for (var16 = 0; var12 > var16; var16++) {
                var17 = 0;
                for (var18 = 0; var18 < var5_int; var18++) {
                  var17 = var17 + var29.k(4);
                  if (var6 == null) {
                    var19 = var18;
                  } else {
                    var19 = var34[var18];
                  }
                  if (param2 == var19) {
                    var15_int = var19;
                    var14_int = var14_int + var17;
                  }
                }
              }
              if (var14_int == 0) {
                return true;
              }
              var44 = new byte[var14_int];
              var14_intLifetime1 = 0;
              var29.field_n = var11;
              var17 = 0;
              for (var18 = 0; var12 > var18; var18++) {
                var19 = 0;
                for (var20 = 0; var20 < var5_int; var20++) {
                  var19 = var19 + var29.k(4);
                  if (var6 == null) {
                    var21 = var20;
                  } else {
                    var21 = var34[var20];
                  }
                  if (var21 == param2) {
                    dv.a(var43, var17, var44, var14_intLifetime1, var19);
                    var14_intLifetime1 = var14_intLifetime1 + var19;
                  }
                  var17 = var17 + var19;
                }
              }
              var7[var15_int] = var44;
            } else {
              var11 = var36.length;
              var11--;
              var12 = var23[var11] & 255;
              var11 = var11 - 4 * var12 * var5_int;
              var31 = new iw(var43);
              var31.field_n = var11;
              var39 = new int[var5_int];
              var32 = var39;
              var14 = var32;
              for (var15_int = 0; var15_int < var12; var15_int++) {
                var16 = 0;
                for (var17 = 0; var5_int > var17; var17++) {
                  var16 = var16 + var31.k(4);
                  var14[var17] = var14[var17] + var16;
                }
              }
              var40 = new byte[var5_int][];
              var33 = var40;
              var15 = var33;
              for (var16 = 0; var16 < var5_int; var16++) {
                array$1 = new byte[var39[var16]];
                var15[var16] = array$1;
                var39[var16] = 0;
              }
              var31.field_n = var11;
              var16 = 0;
              for (var17 = 0; var17 < var12; var17++) {
                var18 = 0;
                for (var19 = 0; var19 < var5_int; var19++) {
                  var18 = var18 + var31.k(4);
                  dv.a(var43, var16, var40[var19], var39[var19], var18);
                  var14[var19] = var14[var19] + var18;
                  var16 = var16 + var18;
                }
              }
              for (var17 = 0; var5_int > var17; var17++) {
                if (var6 == null) {
                  var18 = var17;
                } else {
                  var18 = var34[var17];
                }
                if (this.field_c != 0) {
                  var7[var18] = var40[var17];
                } else {
                  var7[var18] = cq.a(var40[var17], false, ek.b(param3, 138));
                }
              }
            }
          } else {
            if (var6 != null) {
              var11 = var34[0];
            } else {
              var11 = 0;
            }
            if (this.field_c != 0) {
              var7[var11] = var36;
              return true;
            }
            var7[var11] = cq.a(var43, false, 136);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = decompiledCaughtException;
          stackIn_104_0 = var5;
          stackIn_104_1 = new StringBuilder().append("sj.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_105_2 = "null";
          } else {
            stackIn_105_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_104_0), ((StringBuilder) (Object) stackIn_104_1).append(stackIn_105_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final synchronized boolean b(byte param0, int param1) {
        if (!this.a((byte) 97, param1)) {
          return false;
        }
        if (param0 != 20) {
          String var4 = (String) null;
          this.a((String) null, (String) null, (byte) 110);
        }
        if (this.field_e[param1] != null) {
          return true;
        }
        this.a(param1, (byte) 35);
        if (this.field_e[param1] != null) {
          return true;
        }
        return false;
    }

    final int a(String param0, int param1) {
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
          if (!this.d(-124)) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          param0 = param0.toLowerCase();
          if (param1 != -16248) {
            this.field_b = true;
          }
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_d.field_q.a(tf.a(true, var4), -105);
          stackIn_7_0 = this.b(var3_int, (byte) 56);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("sj.H(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    sj(ow param0, boolean param1, int param2) {
        this.field_d = null;
        try {
          if (param2 < 0 ||
            param2 > 2) {
            throw new IllegalArgumentException("");
          }
          this.field_c = param2;
          this.field_i = param0;
          this.field_b = param1 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "sj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_g = false;
        field_h = 4;
    }
}
