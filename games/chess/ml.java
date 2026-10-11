/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml {
    static rk field_g;
    static ci field_f;
    static long field_d;
    private int[] field_c;
    private int field_e;
    private boolean field_b;
    static String field_h;
    private int field_a;

    final static void a(java.applet.Applet param0, byte param1) {
        RuntimeException runtimeException = null;
        String var2 = null;
        CharSequence var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = param0.getParameter("username");
          if (var2 != null) {
            var3 = (CharSequence) ((Object) var2);
            if (0L != jl.a(var3, false)) {
              if (param1 != -43) {
                field_h = (String) null;
              }
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_9_0 = runtimeException;
          stackIn_9_1 = new StringBuilder().append("ml.P(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final static short[] a(short[] param0, int param1, nk param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        java.applet.Applet var9 = null;
        Object stackIn_5_0 = null;
        short[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = Chess.field_G;
        try {
          var4_int = param2.e(20, param1);
          if (param3 <= 40) {
            var9 = (java.applet.Applet) null;
            ml.a((java.applet.Applet) null, (byte) 24);
          }
          if (var4_int == 0) {
            stackIn_5_0 = null;
            return (short[]) (stackIn_5_0);
          }
          if (param0 == null ||
            param0.length != var4_int) {
            param0 = new short[var4_int];
          }
          var5 = param2.e(127, 4);
          var6 = (short)param2.e(22, 16);
          if (var5 > 0) {
            for (var7 = 0; var4_int > var7; var7++) {
              param0[var7] = (short)(param2.e(29, var5) + var6);
            }
          } else {
            for (var7 = 0; var7 < var4_int; var7++) {
              param0[var7] = (short)var6;
            }
          }
          stackIn_18_0 = (short[]) (param0);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("ml.B(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param3).append(')').toString());
        }
    }

    private final int b(int param0, int param1) {
        int var3;
        int var4;
        var4 = Chess.field_G;
        var3 = this.field_c.length;
        if (param1 != -1) {
          return 7;
        }
        while (var3 <= param0) {
          if (!this.field_b) {
            var3 = var3 + this.field_a;
            continue;
          }
          if (var3 != 0) {
            var3 = var3 * this.field_a;
            continue;
          }
          var3 = 1;
        }
        return var3;
    }

    final static void a(byte param0, ld param1) {
        int dupTemp$3 = 0;
        int dupTemp$0 = 0;
        int var3 = 0;
        int incrementValue$2 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        var5 = Chess.field_G;
        try {
          for (var2_int = 0; var2_int < 3; var2_int++) {
            pj.field_f[var2_int] = 0;
          }
          for (var2_intLifetime1 = 0; qf.field_c > var2_intLifetime1; var2_intLifetime1++) {
            if (param1.field_k == ik.field_i[var2_intLifetime1].field_k) {
              dupTemp$3 = ik.field_i[var2_intLifetime1].b(2);
              pj.field_f[dupTemp$3] = pj.field_f[dupTemp$3] + 1;
            }
          }
          dupTemp$0 = param1.b(2);
          pj.field_f[dupTemp$0] = pj.field_f[dupTemp$0] + 1;
          var2_intLifetime2 = 0;
          if (param0 <= 3) {
            field_f = (ci) null;
          }
          for (var3 = 0; var3 < qf.field_c; var3++) {
            boolean decompiledFrameRemainder0 = true;
            if (param1.field_k == ik.field_i[var3].field_k) {
              var4 = ik.field_i[var3].b(2);
              if (pj.field_f[var4] > fh.field_b) {
                pj.field_f[var4] = pj.field_f[var4] - 1;
                decompiledFrameRemainder0 = false;
              }
            }
            if (decompiledFrameRemainder0) {
              incrementValue$2 = var2_intLifetime2;
              var2_intLifetime2++;
              ik.field_i[incrementValue$2] = ik.field_i[var3];
            }
          }
          qf.field_c = var2_intLifetime2;
          fieldTemp$1 = qf.field_c;
          qf.field_c = qf.field_c + 1;
          ik.field_i[fieldTemp$1] = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("ml.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final static void a(int param0, km[] param1, int param2, int param3, int param4) {
        int var8 = 0;
        int var9 = 0;
        int var10 = Chess.field_G;
        if (param1 == null ||
          0 >= param4) {
          return;
        }
        int var5_int = param1[0].field_v;
        int var6 = param1[2].field_v;
        int var7 = param1[1].field_v;
        param1[0].b(param2, param0);
        param1[2].b(param2 + (param4 - var6), param0);
        wb.b(o.field_d);
        wb.e(var5_int + param2, param0, param4 + (param2 - var6), param1[1].field_u + param0);
        if (param3 > -125) {
          return;
        }
        try {
          var8 = var5_int + param2;
          var9 = -var6 + param2 + param4;
          for (param2 = var8; param2 < var9; param2 = param2 + var7) {
            param1[1].b(param2, param0);
          }
          wb.a(o.field_d);
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "ml.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final int c(int param0, int param1) {
        if (param1 != 1) {
          java.applet.Applet var4 = (java.applet.Applet) null;
          ml.a((java.applet.Applet) null, (byte) 91);
        }
        if (this.field_e < param0) {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
        return this.field_c[param0];
    }

    private final void d(int param0, int param1) {
        int[] var4 = new int[this.b(param1, -1)];
        int[] var3 = var4;
        ne.a(this.field_c, 0, var4, 0, this.field_c.length);
        if (param0 != 19840) {
          field_f = (ci) null;
        }
        this.field_c = var4;
    }

    final static void a(String param0, ln param1, byte param2, boolean param3) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        dh var9 = null;
        String var10 = null;
        dh var11 = null;
        String var12 = null;
        dh var13 = null;
        String var14 = null;
        dh var15 = null;
        try {
          ja.$cfr$intArgs$a$c398e174f2fe(0L, (String) null, -103, ci.field_zb, -1, param1, (int[]) null, param1.g((byte) -82), (String) null);
          if (param1.field_Vb && (param1.field_Mb == 2 ||
            !(2 > sk.field_t))) {
            var9 = pi.field_d;
            var10 = oc.a(sl.field_h, new String[]{param0}, (byte) -43);
            var9.field_b.a((byte) -12, var10, 10);
          }
          pi.field_d.b((byte) -97);
          if (param3) {
            if (cn.field_g == pi.field_d.field_d) {
              var13 = pi.field_d;
              var14 = oc.a(qc.field_c, new String[]{param0}, (byte) -54);
              var13.field_b.a((byte) -12, var14, 16);
            } else {
              var11 = pi.field_d;
              var12 = oc.a(tm.field_b, new String[]{param0}, (byte) -71);
              var11.field_b.a((byte) -12, var12, 15);
            }
          }
          var5 = -10 / ((34 - param2) / 47);
          var15 = pi.field_d;
          var6 = re.field_m;
          var7 = ag.field_f;
          var15.field_b.a(true, var6, 0, var7, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("ml.F(");
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
          throw fk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(boolean param0, int param1, int param2) {
        if (this.field_e < param1) {
          this.field_e = param1;
        }
        if (this.field_c.length <= param1) {
          this.d(19840, param1);
        }
        this.field_c[param1] = param2;
        if (!param0) {
          this.field_c = (int[]) null;
        }
    }

    final static void a(int param0) {
        sg.field_c.setLength(param0);
        vk.field_g = 0;
    }

    final void a(int param0, byte param1) {
        this.a(true, this.field_e + 1, param0);
        int var3 = 77 / ((param1 - 0) / 42);
    }

    final void a(int param0, int param1) {
        if (param0 < ~param1 ||
          this.field_e < param1) {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
        if (this.field_e != param1) {
          ne.a(this.field_c, param1 + 1, this.field_c, param1, this.field_e - param1);
        }
        this.field_e = this.field_e - 1;
    }

    final int a(boolean param0) {
        if (!param0) {
          return 127;
        }
        return 1 + this.field_e;
    }

    public static void a(byte param0) {
        field_g = null;
        if (param0 != -122) {
          field_f = (ci) null;
        }
        field_h = null;
        field_f = null;
    }

    final static boolean a(String param0, String param1, int param2) {
        String var3 = null;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = i.a(param2, param0);
          if (param1.indexOf(param0) != -1) {
            return true;
          }
          if (param1.indexOf(var3) != -1) {
            return true;
          }
          stackIn_12_0 = (param1.startsWith(param0)) || (param1.startsWith(var3)) || (param1.endsWith(param0)) || (param1.endsWith(var3));
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("ml.H(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean a(int param0, um param1) {
        RuntimeException var2 = null;
        nk var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            var3 = (nk) null;
            ml.a((short[]) null, 52, (nk) null, 27);
          }
          stackIn_3_0 = param1.b((byte) -40);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ml.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    private ml() throws Throwable {
        throw new Error();
    }

    static {
    }
}
