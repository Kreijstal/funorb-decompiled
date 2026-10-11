/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh {
    static String field_j;
    static he[] field_l;
    static String field_k;
    static int field_e;
    static nh field_b;
    static boolean field_i;
    static int field_a;
    static he field_h;
    private gi field_g;
    static he[] field_f;
    private vd field_c;
    static String field_d;

    final gi a(byte param0) {
        gi var2 = this.field_g;
        if (var2 == this.field_c.field_c) {
          this.field_g = null;
          return null;
        }
        if (param0 >= -66) {
          kc var3 = (kc) null;
          rh.a(58, (kc) null, -74);
        }
        this.field_g = var2.field_e;
        return var2;
    }

    final gi a(gi param0, byte param1) {
        gi var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        gi stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -67) {
            field_l = (he[]) null;
          }
          if (param0 != null) {
            var3 = param0;
          } else {
            var3 = this.field_c.field_c.field_e;
          }
          if (this.field_c.field_c == var3) {
            this.field_g = null;
            stackIn_8_0 = null;
            return (gi) (stackIn_8_0);
          }
          this.field_g = var3.field_e;
          stackIn_10_0 = var3;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("rh.D(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, kc param1, int param2) {
        lh var3 = null;
        try {
          var3 = nj.field_p;
          var3.d(param2, -18392);
          var3.c(param1.field_m, (byte) -113);
          if (param0 < 53) {
            field_e = 70;
          }
          var3.c(param1.field_h, -17402);
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "rh.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final gi a(gi param0, int param1) {
        gi var3 = null;
        RuntimeException var3_ref = null;
        gi stackIn_2_0 = null;
        Object stackIn_8_0 = null;
        gi stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -2) {
            stackIn_2_0 = (gi) null;
            return stackIn_2_0;
          }
          if (param0 != null) {
            var3 = param0;
          } else {
            var3 = this.field_c.field_c.field_b;
          }
          if (var3 != this.field_c.field_c) {
            this.field_g = var3.field_b;
            stackIn_10_0 = var3;
            return stackIn_10_0;
          }
          this.field_g = null;
          stackIn_8_0 = null;
          return (gi) (stackIn_8_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("rh.I(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String a(int param0, CharSequence param1) {
        int var7 = 0;
        StringBuilder discarded$0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_26_0 = null;
        String stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        StringBuilder var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (param1 == null) {
            stackIn_3_0 = null;
            return (String) (stackIn_3_0);
          }
          var2_int = 0;
          var3 = param1.length();
          while (var3 > var2_int) {
            if (je.a(param1.charAt(var2_int), 90)) {
              var2_int++;
              continue;
            }
            break;
          }
          var4 = 113 / ((60 - param0) / 54);
          while (var3 > var2_int) {
            if (je.a(param1.charAt(var3 - 1), 89)) {
              var3--;
              continue;
            }
            break;
          }
          var5 = -var2_int + var3;
          if (var5 < 1) {
            return null;
          }
          if (var5 > 12) {
            stackIn_16_0 = null;
            return (String) (stackIn_16_0);
          }
          var6 = new StringBuilder(var5);
          for (var7 = var2_int; var7 < var3; var7++) {
            var8 = param1.charAt(var7);
            if (ue.a((char) var8, (byte) 78)) {
              var9 = lc.a(249, (char) var8);
              if (var9 != 0) {
                discarded$0 = var6.append((char) var9);
              }
            }
          }
          if (var6.length() != 0) {
            stackIn_28_0 = var6.toString();
            return stackIn_28_0;
          }
          stackIn_26_0 = null;
          return (String) (stackIn_26_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_31_0 = var2;
          stackIn_31_1 = new StringBuilder().append("rh.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    final gi a(int param0) {
        gi var2 = this.field_c.field_c.field_b;
        if (this.field_c.field_c == var2) {
          this.field_g = null;
          return null;
        }
        this.field_g = var2.field_b;
        if (param0 > -71) {
          return (gi) null;
        }
        return var2;
    }

    rh(vd param0) {
        try {
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "rh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final gi c(int param0) {
        gi var2 = this.field_c.field_c.field_e;
        if (var2 == this.field_c.field_c) {
          this.field_g = null;
          return null;
        }
        if (param0 != -1) {
          gi var3 = (gi) null;
          this.a((gi) null, -101);
        }
        this.field_g = var2.field_e;
        return var2;
    }

    public static void b(int param0) {
        field_l = null;
        field_f = null;
        field_k = null;
        field_d = null;
        field_h = null;
        field_b = null;
        if (param0 != -2) {
          rh.b(-8);
        }
        field_j = null;
    }

    final gi b(byte param0) {
        gi var2 = this.field_g;
        if (var2 == this.field_c.field_c) {
          this.field_g = null;
          return null;
        }
        if (param0 != 87) {
          field_k = (String) null;
        }
        this.field_g = var2.field_b;
        return var2;
    }

    static {
        field_k = "Quit";
        field_b = null;
    }
}
