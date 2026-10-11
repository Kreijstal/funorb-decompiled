/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fe {
    private um field_f;
    static String field_e;
    private um field_a;
    static byte[] field_d;
    static ci field_h;
    static int field_g;
    private kl field_b;
    private kl field_c;

    final lm a(int param0, int[] param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        lm stackIn_2_0 = null;
        lm stackIn_5_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = -64 / ((-8 - param2) / 36);
          if (this.field_f.a(false) == 1) {
            stackIn_2_0 = this.a(param1, (byte) 12, param0, 0);
            return stackIn_2_0;
          }
          if (this.field_f.a((byte) -107, param0) != 1) {
            throw new RuntimeException();
          }
          stackIn_5_0 = this.a(param1, (byte) 12, 0, param0);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("fe.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_e = null;
        if (param0 < 100) {
          fe.a(-13, 48, 13);
        }
        field_h = null;
        field_d = null;
    }

    final lm a(String param0, boolean param1, String param2) {
        RuntimeException var4 = null;
        java.applet.Applet var5 = null;
        lm stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            var5 = (java.applet.Applet) null;
            fe.a((String) null, false, (byte) 17, (java.applet.Applet) null);
          }
          stackIn_3_0 = this.a(param2, 1, param0, (int[]) null);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("fe.F(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Chess.field_G;
        try {
          if (param1 != 1) {
            field_e = (String) null;
          }
          var3_int = 0;
          var4 = ak.field_j;
          while (var3_int < ka.field_g.length) {
            var5 = cb.field_k[var3_int];
            if (var5 >= 0) {
              var6 = kn.a(true, false, ka.field_g[var3_int]);
              var4 = var4 + ek.field_b;
              var7 = ob.field_C - (var6 >> 1);
              if (ve.a(var4, -m.field_d + var7, var6 + (m.field_d << 1), param2, (kl.field_i << 1) + vh.field_c, param1 ^ 3, param0)) {
                stackIn_10_0 = var5;
                return stackIn_10_0;
              }
              var4 = var4 + (vh.field_c + (kl.field_i << 1) + ek.field_b);
            } else {
              var4 = var4 + fd.field_n;
            }
            var3_int++;
          }
          stackIn_14_0 = -1;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var3), "fe.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final lm a(String param0, int param1, String param2, int[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object stackIn_2_0 = null;
        lm stackIn_5_0 = null;
        lm stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = this.field_f.a(param0, 0);
          if (0 > var5_int) {
            stackIn_2_0 = null;
            return (lm) (stackIn_2_0);
          }
          if (param1 != 1) {
            stackIn_5_0 = (lm) null;
            return stackIn_5_0;
          }
          var6 = this.field_f.a(param2, 7, var5_int);
          if (var6 < 0) {
            return null;
          }
          stackIn_10_0 = this.a(param3, (byte) 12, var6, var5_int);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("fe.G(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static void a(String param0, boolean param1, byte param2, java.applet.Applet param3) {
        try {
          int var4_int = 0;
          RuntimeException stackIn_10_0 = null;
          StringBuilder stackIn_10_1 = null;
          String stackIn_11_2 = null;
          StringBuilder stackIn_13_1 = null;
          String stackIn_14_2 = null;
          Throwable decompiledCaughtException = null;
          java.net.MalformedURLException var4 = null;
          RuntimeException var4_ref = null;
          try {
            if (jk.field_c.startsWith("win") &&
              ek.a(param0, false)) {
              return;
            }
            try {
              param3.getAppletContext().showDocument(new java.net.URL(param0), "_blank");
            } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
              fg.a((Throwable) null, (byte) -77, "MGR1: " + param0);
            }
            var4_int = -128 / ((63 - param2) / 40);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_10_0 = var4_ref;
            stackIn_10_1 = new StringBuilder().append("fe.E(");
            if (param0 == null) {
              stackIn_11_2 = "null";
            } else {
              stackIn_11_2 = "{...}";
            }
            stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_14_2 = "null";
            } else {
              stackIn_14_2 = "{...}";
            }
            throw fk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final lm a(String param0, String param1, int param2) {
        RuntimeException var4 = null;
        lm stackIn_2_0 = null;
        lm stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == -12983) {
            stackIn_4_0 = this.a((int[]) null, param1, 21887, param0);
            return stackIn_4_0;
          }
          stackIn_2_0 = (lm) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("fe.H(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    private final lm a(int[] param0, byte param1, int param2, int param3) {
        lm stackIn_2_0 = null;
        Object stackIn_13_0 = null;
        lm stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        lm var8 = null;
        hi var9 = null;
        lm var8Lifetime1;
        try {
          var5_int = param2 ^ ((536875007 & param3) << 4 | param3 >>> 12);
          var5_int = var5_int | param3 << 16;
          var6 = (long)var5_int ^ 4294967296L;
          var8 = (lm) (this.field_c.a(41, var6));
          if (var8 != null) {
            stackIn_2_0 = var8;
            return stackIn_2_0;
          }
          if (param0 != null &&
            param0[0] <= 0) {
            return null;
          }
          if (param1 != 12) {
            field_d = (byte[]) null;
          }
          var9 = (hi) (this.field_b.a(-115, var6));
          if (var9 == null) {
            var9 = hi.a(this.field_f, param3, param2);
            if (var9 == null) {
              stackIn_13_0 = null;
              return (lm) (stackIn_13_0);
            }
            this.field_b.a(param1 ^ -97, var6, var9);
          }
          var8Lifetime1 = var9.a(param0);
          if (var8Lifetime1 == null) {
            return null;
          }
          var9.c(param1 - 2205);
          this.field_c.a(param1 ^ -111, var6, var8Lifetime1);
          stackIn_19_0 = var8Lifetime1;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("fe.L(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final lm a(int[] param0, String param1, int param2, String param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        java.applet.Applet var7 = null;
        Object stackIn_2_0 = null;
        Object stackIn_7_0 = null;
        lm stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = this.field_a.a(param1, 0);
          if (var5_int < 0) {
            stackIn_2_0 = null;
            return (lm) (stackIn_2_0);
          }
          if (param2 != 21887) {
            var7 = (java.applet.Applet) null;
            fe.a((String) null, false, (byte) -34, (java.applet.Applet) null);
          }
          var6 = this.field_a.a(param3, 7, var5_int);
          if (var6 >= 0) {
            stackIn_9_0 = this.a(true, var6, var5_int, param0);
            return stackIn_9_0;
          }
          stackIn_7_0 = null;
          return (lm) (stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("fe.D(");
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
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    private final lm a(boolean param0, int param1, int param2, int[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        lm var8 = null;
        ck var9 = null;
        lm var10 = null;
        lm stackIn_4_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_11_0 = null;
        lm stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        lm var8Lifetime1;
        try {
          var5_int = param1 ^ (param2 >>> 12 | param2 << 4 & 65524);
          var5_int = var5_int | param2 << 16;
          var6 = (long)var5_int;
          var8 = (lm) (this.field_c.a(92, var6));
          if (!param0) {
            fe.a(8, 56, 11);
          }
          if (var8 != null) {
            stackIn_4_0 = var8;
            return stackIn_4_0;
          }
          if (param3 != null &&
            param3[0] <= 0) {
            stackIn_8_0 = null;
            return (lm) (stackIn_8_0);
          }
          var9 = ck.a(this.field_a, param2, param1);
          if (var9 == null) {
            stackIn_11_0 = null;
            return (lm) (stackIn_11_0);
          }
          var10 = var9.a();
          var8Lifetime1 = var10;
          this.field_c.a(29, var6, var8Lifetime1);
          if (param3 != null) {
            param3[0] = param3[0] - var10.field_m.length;
          }
          stackIn_15_0 = var8Lifetime1;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("fe.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static void a(long param0, int param1) {
        try {
          try {
            Thread.sleep(param0);
          } catch (InterruptedException interruptedException) {
          }
          if (param1 > -44) {
            fe.a((byte) -60);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final lm a(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        lm stackIn_2_0 = null;
        lm stackIn_7_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_a.a(false) == 1) {
            stackIn_2_0 = this.a(true, param1, 0, param0);
            return stackIn_2_0;
          }
          if (param2 != 968449200) {
            field_d = (byte[]) null;
          }
          if (1 != this.field_a.a((byte) -84, param1)) {
            throw new RuntimeException();
          }
          stackIn_7_0 = this.a(true, 0, param1, param0);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("fe.A(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    fe(um param0, um param1) {
        this.field_b = new kl(256);
        this.field_c = new kl(256);
        try {
          this.field_a = param0;
          this.field_f = param1;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "fe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
    }
}
