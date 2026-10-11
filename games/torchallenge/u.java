/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u {
    static int[] field_c;
    private ha field_f;
    static uj field_a;
    private lj field_d;
    private lj field_e;
    private ha field_g;
    static int[][][] field_b;

    final static void a(int param0, int param1) {
        fe var2 = null;
        int var3 = 0;
        fe var2Lifetime1;
        int var3Lifetime1;
        if (0 > param1) {
          return;
        }
        if (param1 >= 13) {
          return;
        }
        if (param0 == 12604) {
          var2 = cj.field_h[param1];
          var3 = ab.field_g[param1];
          ol.a(param0 - 12732, var2, var3);
          return;
        }
        field_c = (int[]) null;
        var2Lifetime1 = cj.field_h[param1];
        var3Lifetime1 = ab.field_g[param1];
        ol.a(param0 - 12732, var2Lifetime1, var3Lifetime1);
    }

    public static void a(int param0) {
        field_b = (int[][][]) null;
        field_a = null;
        if (param0 != -26193) {
          u.a((byte) 11, 88);
          field_c = null;
          return;
        }
        field_c = null;
    }

    private final fe a(int param0, int[] param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        fe var8 = null;
        q var9 = null;
        int[] var10 = null;
        fe var11 = null;
        fe stackIn_5_0 = null;
        Object stackIn_9_0 = null;
        fe stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        fe var8Lifetime1;
        try {
          if (param0 != 0) {
            var10 = (int[]) null;
            this.a(74, -112, (int[]) null);
          }
          var5_int = (param3 << 4 & 65533 | param3 >>> 12) ^ param2;
          var5_int = var5_int | param3 << 16;
          var6 = (long)var5_int;
          var8 = (fe) (this.field_g.a((byte) 97, var6));
          if (var8 != null) {
            stackIn_5_0 = var8;
            return stackIn_5_0;
          }
          if (param1 != null &&
            0 >= param1[0]) {
            stackIn_9_0 = null;
            return (fe) (stackIn_9_0);
          }
          var9 = q.a(this.field_d, param3, param2);
          if (var9 == null) {
            return null;
          }
          var11 = var9.b();
          var8Lifetime1 = var11;
          this.field_g.a(106, var8Lifetime1, var6);
          if (param1 != null) {
            param1[0] = param1[0] - var11.field_k.length;
          }
          stackIn_16_0 = var8Lifetime1;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("u.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final fe a(int param0, int param1, int[] param2) {
        RuntimeException var4 = null;
        int[] var5 = null;
        fe stackIn_4_0 = null;
        fe stackIn_7_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 85) {
            var5 = (int[]) null;
            this.a(108, (int[]) null, -71);
          }
          if (this.field_e.c((byte) 52) == 1) {
            stackIn_4_0 = this.a((byte) 113, param2, param1, 0);
            return stackIn_4_0;
          }
          if (this.field_e.a(param1, -89) != 1) {
            throw new RuntimeException();
          }
          stackIn_7_0 = this.a((byte) 119, param2, 0, param1);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("u.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final fe a(int param0, int[] param1, int param2) {
        RuntimeException var4 = null;
        fe stackIn_3_0 = null;
        fe stackIn_8_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_d.c((byte) 52) == 1) {
            stackIn_3_0 = this.a(0, param1, param2, 0);
            return stackIn_3_0;
          }
          if (param0 != -1) {
            u.a(-35, -112);
          }
          if (this.field_d.a(param2, -77) != 1) {
            throw new RuntimeException();
          }
          stackIn_8_0 = this.a(0, param1, 0, param2);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("u.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(boolean param0, lj param1) {
        ka var2 = new ka(param1.a(-2, "", "final_frame.jpg"), (java.awt.Component) ((Object) bg.field_P));
        int var3 = var2.field_u;
        int var4 = var2.field_x;
        wb.b((byte) 66);
        hf.field_a = new ka(var3, 3 * var4 / 4);
        hf.field_a.d();
        var2.a(0, 0);
        td.field_o = new ka(var3, var4 - hf.field_a.field_x);
        td.field_o.d();
        var2.a(0, -hf.field_a.field_x);
        if (!param0) {
          return;
        }
        try {
          td.field_o.field_p = hf.field_a.field_x;
          ie.b((byte) -9);
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "u.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(java.applet.Applet param0, boolean param1, int param2, String param3) {
        try {
          java.net.MalformedURLException var4 = null;
          RuntimeException var4_ref = null;
          RuntimeException stackIn_11_0 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (uj.field_a.startsWith("win") &&
              ol.a(param3, true)) {
              return;
            }
            if (param2 >= -56) {
              field_b = (int[][][]) null;
            }
            try {
              param0.getAppletContext().showDocument(new java.net.URL(param3), "_blank");
              return;
            } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
              td.a("MGR1: " + param3, (Throwable) null, (byte) -90);
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var4_ref;
            stackIn_11_1 = new StringBuilder().append("u.B(");
            if (param0 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            throw oj.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    u(lj param0, lj param1) {
        this.field_f = new ha(256);
        this.field_g = new ha(256);
        try {
          this.field_d = param0;
          this.field_e = param1;
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "u.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final fe a(byte param0, int[] param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        fe var8 = null;
        wg var9 = null;
        fe stackIn_2_0 = null;
        fe stackIn_5_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_18_0 = null;
        fe stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        fe var8Lifetime1;
        try {
          var5_int = param2 ^ (param3 >>> 12 | (param3 & -268431361) << 4);
          if (param0 <= 109) {
            stackIn_2_0 = (fe) null;
            return stackIn_2_0;
          }
          var5_int = var5_int | param3 << 16;
          var6 = 4294967296L ^ (long)var5_int;
          var8 = (fe) (this.field_g.a((byte) 89, var6));
          if (var8 != null) {
            stackIn_5_0 = var8;
            return stackIn_5_0;
          }
          if (param1 != null &&
            0 >= param1[0]) {
            stackIn_9_0 = null;
            return (fe) (stackIn_9_0);
          }
          var9 = (wg) (this.field_f.a((byte) 100, var6));
          if (var9 == null) {
            var9 = wg.a(this.field_e, param3, param2);
            if (var9 == null) {
              stackIn_14_0 = null;
              return (fe) (stackIn_14_0);
            }
            this.field_f.a(-101, var9, var6);
          }
          var8Lifetime1 = var9.a(param1);
          if (var8Lifetime1 == null) {
            stackIn_18_0 = null;
            return (fe) (stackIn_18_0);
          }
          var9.a(true);
          this.field_g.a(-98, var8Lifetime1, var6);
          stackIn_20_0 = var8Lifetime1;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("u.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(byte param0, int param1) {
        if (50 != param1) {
          throw new IllegalArgumentException();
        }
        int var2 = -73 / ((10 - param0) / 41);
    }

    static {
        field_c = new int[]{0, 200, 450};
        field_b = new int[][][]{new int[][]{new int[]{-1, -1, -1, 6, -1, -1}, new int[]{-1}, new int[]{-1}, new int[]{-1, -1, -1, 6, -1, -1}, new int[]{-1}, new int[]{-1}, new int[]{-1}}, new int[][]{new int[]{-1, -1, -1, 6, -1, -1}, new int[]{-1, -1, 6, -1, -1}, new int[]{-1, 6, -1, -1}, new int[]{-1}, new int[]{-1}, new int[]{-1, -1, -1, -1, -1, 6, -1}, new int[]{-1}}, new int[][]{new int[]{-1, -1, -1, -1, 6, -1}, new int[]{-1}, new int[]{-1}, new int[]{-1}, new int[]{-1, -1, -1, -1, -1, -1, 6}, new int[]{-1}, new int[]{-1, -1, -1, -1, -1, 6}}};
    }
}
