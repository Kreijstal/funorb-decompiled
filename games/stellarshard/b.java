/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b extends id {
    static int field_t;
    static boolean field_v;
    private int field_r;
    private int field_q;
    private int field_p;
    private pb[] field_s;
    static pf field_u;

    final static ek[] a(int param0, int param1, int param2, pf param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        ek[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = -9 / ((param0 + 59) / 44);
          if (tl.a(param3, (byte) -5, param2, param1)) {
            stackIn_4_0 = rb.g(1851);
            return stackIn_4_0;
          }
          stackIn_2_0 = null;
          return (ek[]) (stackIn_2_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("b.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static boolean a(char param0, byte param1) {
        if (param1 == -123) {
          if (Character.isISOControl(param0)) {
            return false;
          }
          if (od.a(param0, false)) {
            return true;
          }
          if (param0 != 45 &&
            160 != param0 &&
            param0 != 32 &&
            param0 != 95) {
            return false;
          }
          return true;
        }
        field_t = 127;
        if (Character.isISOControl(param0)) {
          return false;
        }
        if (od.a(param0, false)) {
          return true;
        }
        if (param0 == 45) {
          return true;
        }
        if (160 == param0) {
          return true;
        }
        if (param0 == 32) {
          return true;
        }
        if (param0 == 95) {
          return true;
        }
        return false;
    }

    public static void b(boolean param0) {
        field_u = null;
        if (!param0) {
          field_t = 69;
        }
    }

    final static void a(String param0, byte param1, long param2, String param3, java.applet.Applet param4) {
        try {
          RuntimeException stackIn_11_0 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var6 = null;
          RuntimeException var6_ref = null;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var7Lifetime1;
          String var7Lifetime2;
          String var7Lifetime3;
          String var7Lifetime4;
          try {
            try {
              var8 = param4.getParameter("cookiehost");
              var7 = var8;
              var7Lifetime1 = var8;
              var9 = param3 + "=" + param0 + "; version=1; path=/; domain=" + var8;
              var7Lifetime2 = var9;
              var7Lifetime3 = var9;
              if (param2 < 0L) {
                var7Lifetime4 = var9 + "; Discard;";
              } else {
                var7Lifetime4 = var9 + "; Expires=" + od.a(10, param2 * 1000L + ih.a((byte) -98)) + "; Max-Age=" + param2;
              }
              if (param1 != 38) {
                b.a(58, 43);
              }
              sh.a(-13847, "document.cookie=\"" + var7Lifetime4 + "\"", param4);
              return;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = decompiledCaughtException;
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var6_ref;
            stackIn_11_1 = new StringBuilder().append("b.F(");
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
            stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
            if (param4 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw ma.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public b() {
        this(2188450, 2591221, 9543);
    }

    final static void a(int param0, int param1) {
        if (param0 == 0) {
          e.field_e = 0;
          stellarshard.field_U[2] = stellarshard.field_U[2] + 1;
        }
        if (param0 == 1) {
          e.field_e = 1;
          stellarshard.field_U[6] = stellarshard.field_U[6] + 1;
        }
        if (2 == param0) {
          e.field_e = 2;
        }
        if (3 == param0) {
          e.field_e = 3;
          stellarshard.field_U[7] = stellarshard.field_U[7] + 1;
        }
        if (param0 == 4) {
          e.field_e = 4;
          stellarshard.field_U[14] = stellarshard.field_U[14] + 1;
        }
        if (param0 == 5) {
          e.field_e = 5;
        }
        if (param0 == param1) {
          e.field_e = 6;
        }
        if (param0 == 7) {
          e.field_e = 7;
        }
    }

    private b(int param0, int param1, int param2) {
        this.field_a = s.field_c;
        this.field_r = param0;
        this.field_p = param2;
        this.field_q = param1;
        this.field_s = mh.field_i;
    }

    public final void a(boolean param0, int param1, int param2, rj param3, int param4) {
        int stackIn_6_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          if (!param3.field_q) {
            stackIn_6_0 = (param3.e(0)) ? 1 : 0;
          } else {
            stackIn_6_0 = 1;
          }
          var6_int = stackIn_6_0;
          if (param3 instanceof ig) {
            param0 = param0 & ((ig) (param3)).field_E;
          }
          if (param4 != 4549) {
            return;
          }
          if (!param0) {
            stackIn_15_0 = this.field_p;
          } else {
            if (var6_int == 0) {
              stackIn_15_0 = this.field_r;
            } else {
              stackIn_15_0 = this.field_q;
            }
          }
          var7 = stackIn_15_0;
          stackIn_18_0 = (!param0) ? 7105644 : 16777215;
          var8 = stackIn_18_0;
          af.a(-57, var7, param3.field_p, param3.field_k + param2 + (param3.field_t - this.field_s[0].field_x >> 1), this.field_s, param3.field_w + param1);
          this.field_a.a(param3.field_m, param3.field_w + param1, param3.field_k + (param2 - 2), param3.field_p, param3.field_t, var8, -1, 1, 1, this.field_a.field_N);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("b.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
    }
}
