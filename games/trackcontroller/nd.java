/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd extends td implements m {
    private rh[] field_K;
    private a field_J;
    private String[] field_D;
    static int[] field_F;
    static nh field_M;
    static int[] field_G;
    static String field_I;
    static String field_H;
    static qj[] field_L;

    final static String a(int param0, be param1, int param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          if (param0 >= -4) {
            field_I = (String) null;
          }
          try {
            var3_int = param1.l(-1);
            if (param2 < var3_int) {
              var3_int = param2;
            }
            var4 = new byte[var3_int];
            param1.field_k = param1.field_k + nb.field_v.a(param1.field_j, param1.field_k, 0, 0, var3_int, var4);
            var5 = ka.a(0, -129, var4, var3_int);
            stackIn_6_0 = var5;
            return stackIn_6_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            stackIn_8_0 = "Cabbage";
            return stackIn_8_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("nd.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param3 != 29221) {
          nd.b(false);
        }
        super.a(param0, param1, param2, param3 ^ 0);
        if (param0 != 0) {
          return;
        }
        oh var5 = gk.field_c;
        if (null != this.field_D) {
          var5.a(el.field_K, this.field_p + param1, this.field_m + param2, this.field_x, 20, 16777215, -1, 0, 0, var5.field_u + var5.field_G);
        }
    }

    final static ng[] a(kk param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        be var5 = null;
        Object stackIn_4_0 = null;
        ng[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 16777215) {
            var5 = (be) null;
            nd.a(83, (be) null, -120);
          }
          if (sk.a(param1, param0, 1, param2)) {
            stackIn_6_0 = me.d(-104);
            return stackIn_6_0;
          }
          stackIn_4_0 = null;
          return (ng[]) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("nd.C(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9;
        var9 = TrackController.field_F ? 1 : 0;
        if (param4 <= param3) {
          if (param3 < param1) {
            e.a(param7, param1, ll.field_i, param3, param2, param6, param5, param0 ^ -26362, param4);
          } else {
            if (param1 <= param4) {
              e.a(param6, param3, ll.field_i, param4, param7, param2, param5, param0 ^ -26362, param1);
            } else {
              e.a(param7, param3, ll.field_i, param1, param6, param2, param5, -26361, param4);
            }
          }
        } else {
          if (param4 < param1) {
            e.a(param2, param1, ll.field_i, param4, param7, param6, param5, param0 ^ -26362, param3);
          } else {
            if (param1 <= param3) {
              e.a(param6, param4, ll.field_i, param3, param2, param7, param5, -26361, param1);
            } else {
              e.a(param2, param4, ll.field_i, param1, param6, param7, param5, -26361, param3);
            }
          }
        }
        if (param0 != 1) {
          field_L = (qj[]) null;
        }
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = TrackController.field_F ? 1 : 0;
        try {
          if (param0 > -34) {
            return true;
          }
          if (param1 > 0 &&
            param1 < 128) {
            return true;
          }
          if (param1 >= 160 &&
            param1 <= 255) {
            return true;
          }
          if (param1 != 0) {
            var6 = h.field_e;
            var2 = var6;
            var3 = 0;
            while (var3 < var6.length) {
              var4 = var6[var3];
              if (var4 != param1) {
                var3++;
                continue;
              }
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var2_ref), "nd.F(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(String[] param0, byte param1) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        ne var4 = null;
        int var6 = 0;
        be var7 = null;
        var6 = TrackController.field_F ? 1 : 0;
        try {
          this.field_B.e(1);
          if (param0 != null &&
            param0.length != 0) {
            var3_int = param0.length;
            this.field_D = new String[var3_int];
            for (var4_int = 0; var3_int > var4_int; var4_int++) {
              this.field_D[var4_int] = ob.a((byte) 100, (CharSequence) ((Object) param0[var4_int])).replace(' ', ' ');
            }
            var4 = new ne(gk.field_c, 0, 1);
            this.field_K = new rh[1 + var3_int];
            if (param1 != -58) {
              var7 = (be) null;
              nd.a(59, (be) null, -116);
            }
            for (var5 = 0; var3_int > var5; var5++) {
              this.field_K[var5] = new rh(this.field_D[var5], (tg) (this));
              this.field_K[var5].field_y = (t) ((Object) var4);
              this.field_K[var5].field_n = ke.field_b;
              this.field_K[var5].a(15, -3050, 16 * var5 + 20, 80, 0);
              this.a(false, this.field_K[var5]);
            }
            this.field_K[var3_int] = new rh(j.field_d, (tg) (this));
            this.field_K[var3_int].field_y = (t) ((Object) var4);
            this.field_K[var3_int].a(15, -3050, (var3_int + 1) * 16 + 20, 100, 0);
            this.a(false, this.field_K[var3_int]);
            return;
          }
          this.field_D = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("nd.D(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void a(rh param0, int param1, int param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = TrackController.field_F ? 1 : 0;
        try {
          if (param4 != -27322) {
            return;
          }
          for (var6_int = 0; this.field_D.length > var6_int; var6_int++) {
            if (this.field_K[var6_int] == param0) {
              this.field_J.a(true, this.field_D[var6_int]);
            }
          }
          if (param0 == this.field_K[this.field_D.length]) {
            this.field_J.a((byte) 125);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("nd.A(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    nd(a param0) {
        super(0, 0, 0, 0, (t) null);
        try {
          this.field_J = param0;
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "nd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(byte param0, char param1, al param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a((byte) -84, param1, param2, param3)) {
            return true;
          }
          if (param3 == 98) {
            stackIn_7_0 = this.a(param2, -52);
            return stackIn_7_0;
          }
          if (param3 == 99) {
            stackIn_11_0 = this.a(param2, true);
            return stackIn_11_0;
          }
          var5_int = 68 / ((17 - param0) / 51);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("nd.GA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        field_M = null;
        field_H = null;
        field_G = null;
        field_L = null;
        field_I = null;
        field_F = null;
        if (param0) {
          kk var2 = (kk) null;
          nd.a((kk) null, 7, 76, -121);
        }
    }

    static {
        field_F = new int[4];
        field_M = new nh(3);
        field_G = new int[13];
        field_H = "Log in";
        field_I = "No highscores";
    }
}
