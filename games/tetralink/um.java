/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class um extends d implements ih {
    static String field_m;
    static ah field_k;
    static hl field_n;
    static hl field_l;
    private nn field_p;
    static boolean field_o;

    public final void a(nn param0, byte param1) {
        try {
          if (param1 != 101) {
            String var4 = (String) null;
            um.a((String) null, ' ', false, (String) null);
          }
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "um.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    abstract jk a(int param0, String param1);

    abstract String a(String param0, int param1);

    final static String a(String param0, char param1, boolean param2, String param3) {
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$0 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        int var11 = 0;
        String stackIn_11_0 = null;
        String stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        var11 = TetraLink.field_J;
        try {
          var4_int = param0.length();
          var5 = param3.length();
          var6 = var4_int;
          var7 = -1 + var5;
          if (var7 != 0) {
            var8_int = 0;
            while (true) {
              var8_int = param0.indexOf((int) param1, var8_int);
              if (var8_int < 0) {
                break;
              }
              var6 = var6 + var7;
              var8_int++;
            }
          }
          var8 = new StringBuilder(var6);
          var9 = 0;
          while (true) {
            var10 = param0.indexOf((int) param1, var9);
            if (var10 >= 0) {
              discarded$1 = var8.append(param0.substring(var9, var10));
              var9 = var10 + 1;
              discarded$2 = var8.append(param3);
              continue;
            }
            break;
          }
          if (param2) {
            stackIn_11_0 = (String) null;
            return stackIn_11_0;
          }
          discarded$0 = var8.append(param0.substring(var9));
          stackIn_13_0 = var8.toString();
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("um.N(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final jk a(boolean param0) {
        if (!param0) {
          return this.a(0, this.field_p.field_A);
        }
        nn var3 = (nn) null;
        this.a((byte) 77, (nn) null);
        return this.a(0, this.field_p.field_A);
    }

    public final boolean b(int param0) {
        if (param0 != 13074) {
          return false;
        }
        if (null == this.field_p.field_A) {
          return true;
        }
        if (this.field_p.field_A.length() != 0) {
          return false;
        }
        return true;
    }

    public final void a(byte param0, nn param1) {
        try {
          this.a(127);
          int var3_int = 33 / ((-18 - param0) / 63);
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "um.O(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String e(int param0) {
        if (param0 != 0) {
          return (String) null;
        }
        return this.a(this.field_p.field_A, 26202);
    }

    public static void f(int param0) {
        field_m = null;
        if (param0 == 0) {
          field_k = null;
          field_n = null;
          field_l = null;
          return;
        }
        String var2 = (String) null;
        um.a((String) null, 'w', false, (String) null);
        field_k = null;
        field_n = null;
        field_l = null;
    }

    um(nn param0) {
        try {
          this.field_p = param0;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "um.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
