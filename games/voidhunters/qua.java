/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qua {
    static dpb field_a;
    lu field_e;
    static float field_b;
    ml[] field_c;
    static kb field_d;

    final void a(byte param0, ml param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4Lifetime1;
        var5 = VoidHunters.field_G;
        try {
          var3_int = 1;
          for (var4 = 0; this.field_c.length > var4; var4++) {
            if (this.field_c[var4] != param1 &&
              !this.field_c[var4].a(16, param1)) {
              continue;
            }
            var3_int = 0;
            break;
          }
          if (var3_int != 0) {
            var4Lifetime1 = 0;
            while (var4Lifetime1 < this.field_c.length) {
              if (param1.a(16, this.field_c[var4Lifetime1])) {
                this.field_c = (ml[]) (dt.a(ii.field_d, var4Lifetime1, 15667, this.field_c));
                var4Lifetime1--;
              }
              var4Lifetime1++;
            }
            this.field_c = (ml[]) (ija.a(param1, this.field_c, 0, ii.field_d));
          }
          if (param0 != 108) {
            var6 = (String) null;
            qua.a(false, (String) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("qua.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final static long a(CharSequence param0, boolean param1) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        long var3 = 0L;
        int var6 = 0;
        long stackIn_3_0 = 0L;
        long stackIn_8_0 = 0L;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = VoidHunters.field_G;
        try {
          if (!param1) {
            stackIn_3_0 = -34L;
            return stackIn_3_0;
          }
          var2_int = param0.length();
          var3 = 0L;
          for (var5 = 0; var5 < var2_int; var5++) {
            var3 = (var3 << 5) - (var3 - (long)param0.charAt(var5));
          }
          stackIn_8_0 = var3;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("qua.F(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int a(int param0, byte param1, int param2, int param3) {
        int stackIn_52_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_61_0 = 0;
        int var4;
        int var5;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        var5 = param3 >> 31;
        param3 = var5 ^ var5 + param3;
        var5Lifetime1 = param2 >> 31;
        param2 = var5Lifetime1 ^ var5Lifetime1 + param2;
        if (param1 != 119) {
          field_d = (kb) null;
        }
        var5Lifetime2 = param0 >> 31;
        param0 = param0 + var5Lifetime2 ^ var5Lifetime2;
        var4 = 0;
        if (param2 > param3 &&
          param0 < param2) {
          var5Lifetime3 = param3;
          param3 = param2;
          param2 = var5Lifetime3;
        } else {
          if (param0 > param3) {
            var5Lifetime3 = param3;
            param3 = param0;
            param0 = var5Lifetime3;
          }
        }
        if (16384 <= param3) {
          if (param3 >= 536870912) {
            var4 += 16;
            param2 = param2 >> 16;
            param0 = param0 >> 16;
            param3 = param3 >> 16;
          }
          if (2097152 <= param3) {
            param2 = param2 >> 8;
            param0 = param0 >> 8;
            param3 = param3 >> 8;
            var4 += 8;
          }
          if (param3 >= 131072) {
            param3 = param3 >> 4;
            param0 = param0 >> 4;
            param2 = param2 >> 4;
            var4 += 4;
          }
          if (param3 >= 32768) {
            param3 = param3 >> 2;
            param2 = param2 >> 2;
            var4 += 2;
            param0 = param0 >> 2;
          }
          if (16384 <= param3) {
            param2 = param2 >> 1;
            var4++;
            param0 = param0 >> 1;
            param3 = param3 >> 1;
          }
        }
        if (param3 > param2 << 5 &&
          param0 << 5 < param3) {
          return param3 << var4;
        }
        param3 = param0 * param0 + param2 * param2 + param3 * param3;
        if (param3 < 65536) {
          if (param3 < 256) {
            if (param3 >= 0) {
              return eo.field_o[param3] >> 12;
            }
            return -1;
          }
          if (param3 < 4096) {
            if (param3 < 1024) {
              return eo.field_o[param3 >> 2] >> 11;
            }
            return eo.field_o[param3 >> 4] >> 10;
          }
          if (param3 >= 16384) {
            return eo.field_o[param3 >> 8] >> 8;
          }
          return eo.field_o[param3 >> 6] >> 9;
        }
        if (param3 < 16777216) {
          if (param3 < 1048576) {
            if (param3 < 262144) {
              return eo.field_o[param3 >> 10] >> 7;
            }
            return eo.field_o[param3 >> 12] >> 6;
          }
          if (4194304 > param3) {
            return eo.field_o[param3 >> 14] >> 5;
          }
          return eo.field_o[param3 >> 16] >> 4;
        }
        if (param3 >= 268435456) {
          if (1073741824 <= param3) {
            return eo.field_o[param3 >> 24] << var4;
          }
          if (var4 < 1) {
            stackIn_52_0 = eo.field_o[param3 >> 22] >> -var4 + 1;
          } else {
            stackIn_52_0 = eo.field_o[param3 >> 22] << -1 + var4;
          }
          return stackIn_52_0;
        }
        if (param3 >= 67108864) {
          if (var4 < 2) {
            stackIn_61_0 = eo.field_o[param3 >> 20] >> 2 - var4;
          } else {
            stackIn_61_0 = eo.field_o[param3 >> 20] << var4 - 2;
          }
          return stackIn_61_0;
        }
        if (3 <= var4) {
          stackIn_57_0 = eo.field_o[param3 >> 18] << -3 + var4;
        } else {
          stackIn_57_0 = eo.field_o[param3 >> 18] >> 3 - var4;
        }
        return stackIn_57_0;
    }

    final static int a(dj param0, boolean param1, dj param2) {
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            field_a = (dpb) null;
          }
          var4 = (String) null;
          stackIn_3_0 = cnb.a(0, param2, param0, 0, 0, (String) null, false);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("qua.B(");
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
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    qua(lu param0) {
        try {
          this.field_e = param0;
          this.field_c = new ml[]{};
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "qua.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static tpa a(boolean param0, String param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        Object stackIn_9_0 = null;
        tpa stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (dw.field_c == lrb.field_b) {
            return null;
          }
          if (param0) {
            var3 = (CharSequence) null;
            qua.a((CharSequence) null, true);
          }
          if (gka.field_o == lrb.field_b &&
            param1.equals(vsa.field_q)) {
            lrb.field_b = kla.field_d;
            stackIn_11_0 = jra.field_a;
            return stackIn_11_0;
          }
          lrb.field_b = dw.field_c;
          jra.field_a = null;
          vsa.field_q = param1;
          stackIn_9_0 = null;
          return (tpa) (stackIn_9_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("qua.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != 16606) {
          String var2 = (String) null;
          qua.a(false, (String) null);
        }
        field_a = null;
    }

    static {
        field_a = new dpb();
        field_b = 0.4000000059604645f;
        field_d = new kb(4);
    }
}
