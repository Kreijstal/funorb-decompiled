/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj extends sq {
    static int[] field_g;
    static vh field_j;
    static int field_h;
    private int field_f;
    static String field_e;
    static String field_i;

    final int h(int param0) {
        qe var2;
        int var3;
        int var4;
        var4 = Pool.field_O;
        var2 = this.field_d.j(75);
        var2.field_t = true;
        if (param0 != -1) {
          return -103;
        }
        var3 = var2.field_u;
        if (var3 == 2) {
          return this.q(10) & ~nr.field_Y | nr.field_Q;
        }
        if (3 == var3) {
          return this.q(10) & ~nr.field_Y | nr.field_V;
        }
        if (var3 == 1) {
          return this.q(10) & ~nr.field_Y | nr.field_R;
        }
        if (var3 != 0) {
        }
        return this.q(10);
    }

    final void c(int param0) {
        int discarded$0 = 0;
        if (param0 > -25) {
          discarded$0 = this.p(60);
        }
    }

    fj(al param0) {
        super(param0);
        this.field_f = 1;
    }

    final int a(qe param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -96 / ((-32 - param1) / 40);
          stackIn_1_0 = 12 + param0.field_z;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("fj.CA(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final int a(boolean param0) {
        if (param0) {
          this.field_f = 76;
          return 1;
        }
        return 1;
    }

    public static void b(boolean param0) {
        field_e = null;
        if (param0) {
          field_j = (vh) null;
        }
        field_j = null;
        field_g = null;
        field_i = null;
    }

    final static int c(byte param0) {
        if (param0 >= -6) {
          fj.c((byte) -21);
        }
        return !pp.a(true) ? -1 + md.field_a.length : md.field_a.length;
    }

    private final int q(int param0) {
        if (param0 != 10) {
          field_j = (vh) null;
        }
        return nr.field_Q | ll.field_f;
    }

    final boolean a(int param0, byte param1, qe param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 9) {
            field_e = (String) null;
          }
          return !(param0 <= 0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("fj.EA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static dd[] a(int param0, int param1, int param2, boolean param3) {
        if (param3) {
          String var5 = (String) null;
          fj.a((String) null, (byte) 90);
        }
        return af.a(param0, 64, param2, param1, 1);
    }

    final static boolean a(String param0, byte param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!rg.field_p) {
            return false;
          }
          if (hn.field_b == 2 &&
            di.field_a != null) {
            var3 = (CharSequence) ((Object) param0);
            if (!di.field_a.equals(hq.a(91, var3))) {
              return false;
            }
            if (param1 == -101) {
              return true;
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("fj.RA(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    final int b(int param0) {
        int var2 = 77 / ((param0 + 79) / 38);
        return 1;
    }

    final boolean c(qe param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -33) {
            fj.a(67, 8, 86, true);
          }
          stackIn_5_0 = (param0.field_n == param0.field_z);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("fj.C(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final dd b(qe param0, int param1) {
        RuntimeException var3 = null;
        dd stackIn_2_0 = null;
        dd stackIn_5_0 = null;
        dd stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 1) {
            stackIn_2_0 = (dd) null;
            return stackIn_2_0;
          }
          if (param0.field_z != -1) {
            stackIn_7_0 = d.field_a[param0.field_z];
            return stackIn_7_0;
          }
          stackIn_5_0 = mf.field_n;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("fj.JA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final int a(int param0) {
        int var2 = 0;
        int var3 = Pool.field_O;
        if (param0 != -1) {
          String var4 = (String) null;
          fj.a((String) null, (byte) 119);
        }
        for (var2 = 1; var2 < 9; var2++) {
          if (this.field_d.field_l[var2].field_s) {
            return var2;
          }
        }
        return 9;
    }

    final void n(int param0) {
        this.field_f = this.a(-1);
        if (param0 != 11828) {
          this.n(-102);
        }
    }

    final boolean f(int param0) {
        if (param0 < 113) {
          fj.b(false);
        }
        return true;
    }

    final int a(byte param0) {
        int var3;
        int var4;
        Object var6;
        cr var6_ref;
        int var7;
        qe var8;
        qe var9;
        aa var10;
        aa var11;
        var6 = null;
        var7 = Pool.field_O;
        var8 = this.field_d.j(123);
        var9 = var8;
        if (var9 == null) {
          throw new IllegalStateException("Couldn't get the last shot to examine!");
        }
        var3 = 0;
        if (this.field_d.d((byte) 118)) {
          var9.a(3, -14, new int[]{this.field_d.field_A});
          var3 = var3 | (this.d((byte) -47) | um.field_c);
          var9.field_t = true;
          var9.field_w = (byte)(var9.field_w - 1);
        }
        if (var9.field_n != -1) {
          if (this.field_f != var9.field_n) {
            var9.a(8, -14, new int[]{});
            var3 = var3 | this.o(0);
            var9.field_w = (byte)(var9.field_w - 1);
            var9.field_t = true;
          }
        } else {
          var9.a(7, -14, new int[]{var8.field_L});
          var9.field_t = true;
          var3 = var3 | this.p(75);
          var9.field_w = (byte)(var9.field_w - 1);
        }
        var4 = 74 % ((-37 - param0) / 60);
        if (var3 != 0) {
          if (!var9.field_m.c(0)) {
            var11 = new aa(var9.field_m);
            var6_ref = (cr) (var11.b((byte) -92));
            while (var6_ref != null) {
              if (9 != var6_ref.field_n) {
                var6_ref = (cr) (var11.b(-86));
                continue;
              }
              var9.a(9, -14, new int[]{this.field_d.field_A});
              var9.field_t = true;
              return hm.field_e;
            }
          }
        } else {
          if (!var9.field_m.c(0)) {
            var10 = new aa(var9.field_m);
            var6_ref = (cr) (var10.b((byte) -92));
            while (var6_ref != null) {
              if (var6_ref.field_n == 9) {
                var9.a(10, -14, new int[]{this.field_d.field_A});
                return ag.field_e;
              }
              var3 = var3 | nd.field_j;
              var9.field_w = (byte)(var9.field_w + 1);
              var6_ref = (cr) (var10.b(-126));
            }
          }
          if (this.field_d.a(false, (byte) 81, var9)) {
            if (this.a((var9.field_L + 1) % this.field_d.field_n, -102)) {
              var9.field_w = (byte)(var9.field_w + 1);
            }
          } else {
            if (this.a(var9.field_L % this.field_d.field_n, -41)) {
              var9.field_w = (byte)(var9.field_w - 1);
            }
          }
        }
        return var3;
    }

    final static boolean a(String param0, int[] param1, int param2, int param3, long param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          boolean decompiledFrameRemainder0 = true;
          var6_int = 94 % ((param2 + 49) / 53);
          if (param1 != null && (2 != param3 ||
            tq.a(false, param4, param0))) {
            stackIn_6_0 = true;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_6_0 = false;
          }
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("fj.QA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final int o(int param0) {
        int discarded$0 = 0;
        if (param0 != 0) {
          discarded$0 = this.o(-69);
        }
        return this.q(param0 + 10);
    }

    final int i(int param0) {
        if (param0 != 26840) {
          field_j = (vh) null;
        }
        return 10;
    }

    final int[] a(int param0, byte param1) {
        int var4 = 0;
        int var5 = Pool.field_O;
        li var6 = new li(new int[]{1024 + param0});
        li var3 = var6;
        for (var4 = 0; var4 < 7; var4++) {
          up.field_M[var4] = var4 + 2;
          dj.field_a[var4] = var6.a(23165, 2048);
        }
        fd.a(dj.field_a, up.field_M, (byte) -54);
        no.field_s[1] = 1;
        no.field_s[0] = 0;
        no.field_s[3] = up.field_M[1];
        no.field_s[2] = up.field_M[0];
        no.field_s[6] = up.field_M[3];
        no.field_s[4] = up.field_M[2];
        no.field_s[5] = 9;
        no.field_s[7] = -1;
        if (param1 != -32) {
          field_g = (int[]) null;
        }
        no.field_s[10] = -1;
        no.field_s[12] = -1;
        no.field_s[14] = -1;
        no.field_s[13] = up.field_M[6];
        no.field_s[8] = up.field_M[4];
        no.field_s[9] = up.field_M[5];
        no.field_s[11] = -1;
        no.field_s[15] = -1;
        return no.field_s;
    }

    final byte b(int param0, int param1) {
        if (param1 != 30554) {
          this.a(93, (byte) 18);
        }
        return (byte)param0;
    }

    private final int d(byte param0) {
        int var2 = 94 / ((param0 - 5) / 44);
        return this.q(10);
    }

    final boolean a(int param0, byte param1, int param2) {
        if (param1 <= 122) {
          return false;
        }
        return param2 > 0 ? true : false;
    }

    private final int p(int param0) {
        if (param0 < 8) {
          fj.c((byte) -24);
        }
        return this.q(10);
    }

    final boolean a(int param0, int param1) {
        if (param1 >= -28) {
          return true;
        }
        this.field_d.e(12226, 0);
        return !this.field_d.field_r[this.a(-1)].field_j ? true : false;
    }

    static {
        field_g = new int[8192];
        field_i = "Chat view has been scrolled up. Scroll down to chat.";
        field_e = "Unpacking graphics";
    }
}
