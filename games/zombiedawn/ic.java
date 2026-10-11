/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ic extends tb implements mi {
    static sd field_S;
    static String field_Q;
    static int field_P;
    private int field_R;
    private vc field_V;
    static gd[] field_W;
    static boolean field_U;
    static af field_T;

    ic(String param0, sk param1, int param2) {
        super(param0, param1, param2);
    }

    final String d(int param0) {
        if (!this.field_l) {
          return null;
        }
        if (null != this.field_s) {
          pb.a(this.field_i - this.field_R + ha.field_b, (byte) 74, ei.field_K);
          int var2 = -109 % ((10 - param0) / 58);
          return this.field_s;
        }
        return null;
    }

    public final vc a(int param0) {
        if (param0 != 0) {
          String var3 = (String) null;
          ic.a((String) null, -61, (String) null, 'ￌ');
          return this.field_V;
        }
        return this.field_V;
    }

    final void d(byte param0) {
        int var2 = 101 / ((-50 - param0) / 49);
        super.d((byte) -124);
        if (this.field_V == null) {
          return;
        }
        this.field_V.a(-7674);
    }

    public static void l(int param0) {
        field_S = null;
        field_T = null;
        field_Q = null;
        if (param0 != 16604) {
          return;
        }
        field_W = null;
    }

    final static String a(String param0, byte param1, String param2, dj param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String stackIn_3_0 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = 121 / ((param1 + 44) / 61);
          if (!param3.a((byte) 73)) {
            stackIn_3_0 = (String) (param2);
            return stackIn_3_0;
          }
          stackIn_5_0 = param0 + " - " + param3.e(-105) + "%";
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("ic.F(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static String a(String param0, int param1, String param2, char param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        int var11 = 0;
        String stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        var11 = ZombieDawn.field_J;
        try {
          var4_int = param2.length();
          var5 = param0.length();
          var6 = var4_int;
          var7 = var5 - 1;
          if (var7 != 0) {
            var8_int = 0;
            while (true) {
              var8_int = param2.indexOf((int) param3, var8_int);
              if (var8_int < 0) {
                break;
              }
              var6 = var6 + var7;
              var8_int++;
            }
          }
          var8 = new StringBuilder(var6);
          var9 = param1;
          while (true) {
            var10 = param2.indexOf((int) param3, var9);
            if (0 > var10) {
              discarded$0 = var8.append(param2.substring(var9));
              stackIn_11_0 = var8.toString();
              return stackIn_11_0;
            }
            discarded$1 = var8.append(param2.substring(var9, var10));
            var9 = var10 + 1;
            discarded$2 = var8.append(param0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("ic.Q(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, vc param1) {
        try {
          this.field_V = param1;
          int var3_int = -18 / ((param0 + 34) / 34);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "ic.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(String param0, String param1, int param2) {
        String var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param1 = ic.a("", param2 ^ param2, param1, '_');
          var3 = am.a(param0, 1);
          stackIn_5_0 = (-1 != param1.indexOf(param0)) || (param1.indexOf(var3) != -1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("ic.L(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(ga param0, byte param1, int param2, int param3) {
        try {
          super.a(param0, (byte) 121, param2, param3);
          int var5_int = -112 % ((46 - param1) / 42);
          this.field_R = -param3 + ha.field_b - this.field_k;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "ic.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_Q = "Suggested names: ";
        field_P = 48;
        field_S = new sd();
        field_U = false;
    }
}
