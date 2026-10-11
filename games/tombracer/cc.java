/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cc extends vg {
    int field_i;
    int field_g;
    static String field_l;
    private int field_f;
    private int field_h;
    int field_k;
    int field_j;

    final void a(int param0, int param1, int param2) {
        if (!this.a(false)) {
          return;
        }
        int var4 = param1 + (this.b(true) ? this.field_j : jw.field_z[this.field_g]);
        int var5 = (!this.b(true) ? hq.field_b[this.field_g] : this.field_k) + param2;
        this.a(this.field_h, param2 + hq.field_b[this.field_i], var4, var5, jw.field_z[this.field_i] + param1, (byte) 35);
        if (param0 != 99) {
          field_l = (String) null;
        }
        if (this.b(true)) {
          this.a(this.field_f, var5, param1 + jw.field_z[this.field_g], hq.field_b[this.field_g] + param2, var4, (byte) 35);
          uda.field_r.a(this.field_j + param1 + uda.field_r.a(), param2 + (this.field_k + uda.field_r.c()));
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, byte param5) {
        int var13 = TombRacer.field_G ? 1 : 0;
        int var7 = param2 - param4 << 16;
        int var8 = -param1 + param3 << 16;
        int var9 = var7 / (param0 + 1);
        int var10 = var8 / (1 + param0);
        int var11 = 1;
        if (!bma.d(107, this.field_i) ||
          !bma.d(-121, this.field_g)) {
          var11 = 0;
        }
        int var12 = 0;
        if (param5 != 35) {
          this.field_g = -113;
        }
        while (var12 < param0) {
          uda.field_r.a((var9 * (1 + var12) >> 16) + (param4 + uda.field_r.a()), param1 + (var10 * (var12 + 1) >> 16) + uda.field_r.c(), var11, -1695485712, 1);
          var12++;
        }
    }

    final boolean b(boolean param0) {
        if (!param0) {
          return false;
        }
        return -1 != this.field_j ? true : false;
    }

    final boolean a(pfa param0, int param1, byte param2) {
        int stackIn_11_0 = 0;
        int[] stackIn_13_0 = null;
        int stackIn_14_1 = 0;
        int[] stackIn_16_0 = null;
        int stackIn_17_1 = 0;
        boolean stackIn_46_0 = false;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var8Lifetime1;
        try {
          if (!this.a((byte) -95, param0)) {
            return false;
          }
          var4_int = param0.field_j >> 16;
          var5 = param0.field_e >> 16;
          if (this.b(true)) {
            var7 = this.field_k;
            var6 = this.field_j;
          } else {
            if (var4_int == jw.field_z[this.field_i]) {
              stackIn_11_0 = (hq.field_b[this.field_i] == var5) ? 1 : 0;
            } else {
              stackIn_11_0 = 0;
            }
            var8 = stackIn_11_0;
            stackIn_13_0 = jw.field_z;
            if (var8 == 0) {
              stackIn_14_1 = this.field_i;
            } else {
              stackIn_14_1 = this.field_g;
            }
            var6 = stackIn_13_0[stackIn_14_1];
            stackIn_16_0 = hq.field_b;
            if (var8 != 0) {
              stackIn_17_1 = this.field_g;
            } else {
              stackIn_17_1 = this.field_i;
            }
            var7 = stackIn_16_0[stackIn_17_1];
          }
          var8Lifetime1 = var6 - var4_int;
          var9 = -var5 + var7;
          if (param2 != 116) {
            return true;
          }
          if (var8Lifetime1 * var8Lifetime1 <= var9 * var9) {
            if (mi.field_k != param1 &&
              param1 != 98 ||
              0 <= var9) {
              if (fp.field_a != param1 &&
                99 != param1) {
                return false;
              }
              if (var9 <= 0) {
                return false;
              }
            }
            return true;
          }
          boolean decompiledFrameRemainder0 = true;
          if (kda.field_hd != param1 &&
            param1 != 96 ||
            var8Lifetime1 >= 0) {
            if (param1 != mf.field_a &&
              param1 != 97) {
              return false;
            }
            if (var8Lifetime1 <= 0) {
              stackIn_46_0 = false;
              decompiledFrameRemainder0 = false;
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_46_0 = true;
          }
          return stackIn_46_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_53_0 = var4;
          stackIn_53_1 = new StringBuilder().append("cc.C(");
          if (param0 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_53_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, java.applet.Applet param1, String param2) {
        try {
          String var7 = null;
          String var4 = null;
          String var8 = null;
          String var5 = null;
          try {
            aia.field_j = param2;
            try {
              var7 = param1.getParameter("cookieprefix");
              if (param0 <= 1) {
                String var6 = (String) null;
                cc.a(-59, (java.applet.Applet) null, (String) null);
              }
              var4 = param1.getParameter("cookiehost");
              var8 = var7 + "session=" + param2 + "; version=1; path=/; domain=" + var4;
              var5 = var8;
              if (0 == param2.length()) {
                var5 = var8 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              lb.a(param1, 19467, "document.cookie=\"" + var5 + "\"");
            } catch (Throwable throwable) {
            }
            v.a((byte) 64, param1);
          } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "cc.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
          cc.a(62);
        }
        field_l = null;
    }

    private final boolean a(byte param0, pfa param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -92) {
            return false;
          }
          boolean decompiledFrameRemainder0 = true;
          var3_int = param1.field_j >> 16;
          var4 = param1.field_e >> 16;
          if ((var3_int != jw.field_z[this.field_i] ||
            hq.field_b[this.field_i] != var4) && (jw.field_z[this.field_g] != var3_int ||
            var4 != hq.field_b[this.field_g])) {
            stackIn_11_0 = false;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_11_0 = true;
          }
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("cc.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    private final boolean a(boolean param0) {
        String var3;
        boolean stackIn_6_0 = false;
        if (param0) {
          var3 = (String) null;
          cc.a(42, (java.applet.Applet) null, (String) null);
        }
        stackIn_6_0 = (mca.a((byte) 6, this.field_i)) && (mca.a((byte) 6, this.field_g));
        return stackIn_6_0;
    }

    cc(int param0, int param1, int param2) {
        this(param0, param1, -1, -1, param2, 0);
    }

    final static nl a(byte param0, java.applet.Applet param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        nl[] var4 = null;
        int var5 = 0;
        nl var6 = null;
        int var7 = 0;
        nl stackIn_4_0 = null;
        nl stackIn_9_0 = null;
        nl stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          var2_int = -61 / ((param0 - 61) / 57);
          var3 = og.a(param1, "jagex-last-login-method", (byte) 86);
          if (var3 == null) {
            stackIn_4_0 = npa.field_f;
            return stackIn_4_0;
          }
          var4 = aga.a(-1025);
          var5 = 0;
          while (true) {
            if (var5 >= var4.length) {
              stackIn_12_0 = npa.field_f;
              return stackIn_12_0;
            }
            var6 = var4[var5];
            if (!var6.a(var3, 5)) {
              var5++;
              continue;
            }
            break;
          }
          stackIn_9_0 = var6;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("cc.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    cc(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_i = param0;
        this.field_j = param2;
        this.field_f = param5;
        this.field_h = param4;
        this.field_g = param1;
        this.field_k = param3;
    }

    static {
        field_l = "Finish Time:";
    }
}
