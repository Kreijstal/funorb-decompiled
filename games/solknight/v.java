/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v {
    static String field_a;
    static mc field_g;
    private int field_e;
    private ik field_c;
    static int field_d;
    private int field_b;
    private ii field_f;

    final static int a(int param0, CharSequence param1, int param2, boolean param3) {
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_43_0 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = SolKnight.field_L ? 1 : 0;
        try {
          if (param0 >= -77) {
            stackIn_3_0 = -36;
            return stackIn_3_0;
          }
          if (param2 >= 2 &&
            param2 <= 36) {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            var7 = param1.length();
            for (var8 = 0; var8 < var7; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param1.charAt(var8);
              if ((var8 == 0) &&
                (var9 == 45)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var8 != 0 || (var9 != 43 ||
                !param3))) {
                if (var9 >= 48 &&
                  57 >= var9) {
                  var9 -= 48;
                } else if (var9 >= 65 &&
                  var9 <= 90) {
                  var9 -= 55;
                } else if (var9 >= 97 &&
                  var9 <= 122) {
                  var9 -= 87;
                } else {
                  throw new NumberFormatException();
                }
                if (param2 <= var9) {
                  throw new NumberFormatException();
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = var6 * param2 + var9;
                if (var6 != var10 / param2) {
                  throw new NumberFormatException();
                }
                var6 = var10;
                var5 = 1;
              }
            }
            if (var5 == 0) {
              throw new NumberFormatException();
            }
            stackIn_43_0 = var6;
            return stackIn_43_0;
          }
          throw new IllegalArgumentException("" + param2);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_46_0 = var4;
          stackIn_46_1 = new StringBuilder().append("v.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(int param0, Object param1, int param2, long param3) {
        pe var6 = null;
        tk var6_ref = null;
        int var7 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6_ref2 = null;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          if (this.field_b < param0) {
            throw new IllegalStateException();
          }
          this.a((byte) -6, param3);
          this.field_e = this.field_e - param0;
          while (0 > this.field_e) {
            var6 = (pe) (this.field_c.a((byte) -115));
            this.a(var6, (byte) 126);
          }
          var6_ref = new tk(param1, param0);
          this.field_f.a(-858993458, param3, var6_ref);
          this.field_c.a(-114, var6_ref);
          ((pe) ((Object) var6_ref)).field_l = 0L;
          if (param2 < 126) {
            this.field_f = (ii) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref2 = decompiledCaughtException;
          stackIn_11_0 = var6_ref2;
          stackIn_11_1 = new StringBuilder().append("v.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(pe param0, byte param1) {
        int var3_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = -7 / ((68 - param1) / 53);
          if (param0 != null) {
            param0.c(10);
            param0.a(97);
            this.field_e = this.field_e + param0.field_o;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_5_0 = var3;
          stackIn_5_1 = new StringBuilder().append("v.A(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_g = null;
        if (param0 > -79) {
          field_a = (String) null;
        }
    }

    final static void a(int param0, int param1) {
        jd var2 = id.field_c;
        var2.e(param1, -2147483648);
        var2.c(8, 1);
        var2.c(-126, param0);
    }

    private final void a(byte param0, long param1) {
        int var4 = -115 / ((-83 - param0) / 41);
        pe var5 = (pe) (this.field_f.a(param1, -85));
        this.a(var5, (byte) -95);
    }

    final Object a(int param0, long param1) {
        tk var6 = null;
        pe var7 = (pe) (this.field_f.a(param1, param0 ^ -90));
        if (var7 == null) {
          return null;
        }
        Object var5 = var7.h(31476);
        if (var5 == null) {
          var7.c(10);
          var7.a(97);
          this.field_e = this.field_e + var7.field_o;
          return null;
        }
        if (param0 != 0) {
          return (Object) null;
        }
        if (!var7.g(param0 ^ 113)) {
          this.field_c.a(-109, var7);
          var7.field_l = 0L;
        } else {
          var6 = new tk(var5, var7.field_o);
          this.field_f.a(-858993458, var7.field_g, var6);
          this.field_c.a(param0 - 110, var6);
          ((pe) ((Object) var6)).field_l = 0L;
          var7.c(10);
          var7.a(97);
        }
        return var5;
    }

    final static void a(int param0, String param1, o param2) {
        try {
          qk.field_n = param1;
          va.field_g = param2;
          if (param0 != -98) {
            field_g = (mc) null;
          }
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "v.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, Object param1, long param2) {
        try {
          if (param0 < 67) {
            o var6 = (o) null;
            v.a(-25, (String) null, (o) null);
          }
          this.a(1, param1, 127, param2);
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "v.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private v() throws Throwable {
        throw new Error();
    }

    static {
        field_a = null;
    }
}
