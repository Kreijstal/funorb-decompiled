/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class o extends em {
    private boolean field_p;
    private int field_m;
    private int field_i;
    static vj field_l;
    static String field_n;
    private int field_q;
    private int field_g;
    static String field_f;
    private String field_j;
    static int[] field_k;
    private rf field_o;
    private int field_h;

    final static void a(boolean param0, int param1, java.awt.Canvas param2) {
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (hj.field_f < 10) {
            var3_int = 0;
            if (eh.field_a) {
              var3_int = 1;
              eh.field_a = false;
            }
            t.a(var3_int != 0, mg.a(true), tb.b((byte) -81), 2, qe.field_g);
          } else {
            if (!s.a((byte) -81)) {
              wj.c();
              ik.a(param1 + 11435, 320, 240);
              DrPhlogistonSavesTheEarth.a(0, param1 - 423, param2, 0);
            } else {
              if (af.field_b != 0) {
                dh.a(107, param2);
              } else {
                kf.a(param0, false, (byte) -125);
                DrPhlogistonSavesTheEarth.a(0, -120, param2, 0);
              }
            }
          }
          if (param1 != 320) {
            field_l = (vj) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("o.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 != 99) {
          o.a((byte) 0);
        }
        field_f = null;
        field_l = null;
        field_n = null;
        field_k = null;
    }

    final void a(rf param0, int param1, int param2, int param3, int param4, String param5, int param6, int param7) {
        mi stackIn_37_0;
        mi stackIn_37_1;
        int stackIn_37_2;
        int stackIn_37_3;
        mi stackIn_38_0 = null;
        mi stackIn_38_1 = null;
        int stackIn_38_4 = 0;
        boolean stackIn_42_0 = false;
        int stackIn_43_1 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        mi var15 = null;
        int var16 = 0;
        String[] var17 = null;
        String[] var18 = null;
        int var13Lifetime1;
        var16 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (param4 == 0) {
            param4 = param0.field_E;
          }
          if (param5 == null) {
            this.field_a = null;
            return;
          }
          if (this.field_o == param0 &&
            !this.field_p &&
            this.field_h == param2 &&
            param6 == this.field_q &&
            param4 == this.field_i &&
            this.field_g == param7 &&
            param1 == this.field_m &&
            null != this.field_j &&
            this.field_j.equals(param5)) {
            return;
          }
          this.field_o = param0;
          this.field_j = param5;
          this.field_h = param2;
          this.field_i = param4;
          this.field_g = param7;
          this.field_q = param6;
          this.field_m = param1;
          this.field_p = false;
          var17 = new String[param0.a(param5, param1) + 1];
          var18 = var17;
          var11 = -79 % ((-53 - param3) / 42);
          var10 = Math.max(1, param0.a(param5, new int[]{param1}, var18));
          if (this.field_q == 3 &&
            var10 == 1) {
            this.field_q = 1;
          }
          this.field_a = new mi[var10];
          if (this.field_q != 0) {
            if (this.field_q == 1) {
              var12 = (-(this.field_i * var10) + this.field_g >> 1) + param0.field_x;
            } else {
              if (this.field_q != 2) {
                var13 = (-(var10 * this.field_i) + this.field_g) / (1 + var10);
                if (var13 < 0) {
                  var13 = 0;
                }
                this.field_i = this.field_i + var13;
                var12 = param0.field_x + var13;
              } else {
                var12 = this.field_g + (-param0.field_S - this.field_i * var10);
              }
            }
          } else {
            var12 = param0.field_x;
          }
          for (var13Lifetime1 = 0; var13Lifetime1 < var10; var13Lifetime1++) {
            var14 = var17[var13Lifetime1];
            stackIn_37_0 = null;
            stackIn_37_1 = null;
            stackIn_37_2 = var12 - param0.field_x;
            stackIn_37_3 = var12 + param0.field_S;
            if (var14 == null) {
              stackIn_38_0 = null;
              stackIn_38_1 = null;
              stackIn_38_4 = 0;
            } else {
              stackIn_38_0 = null;
              stackIn_38_1 = null;
              stackIn_38_4 = var14.length();
            }
            var15 = new mi(stackIn_37_2, stackIn_37_3, stackIn_38_4);
            var15.field_a[0] = 0;
            if (var14 != null) {
              var15.field_a[var14.length()] = param0.b(var14);
              stackIn_42_0 = false;
              if (param2 != 3) {
                stackIn_43_1 = 0;
              } else {
                stackIn_43_1 = this.a(param1, var14, param0.b(var14), 0);
              }
              dc.a(stackIn_42_0, stackIn_43_1, var14, param0, var15);
            }
            this.field_a[var13Lifetime1] = var15;
            var12 = var12 + param4;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_48_0 = var9;
          stackIn_48_1 = new StringBuilder().append("o.C(");
          if (param0 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          stackIn_51_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_48_0), ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final void a(rf param0, String param1, int param2, int param3, int param4) {
        mi var7 = null;
        mi var8 = null;
        if (param1 == null) {
          this.field_a = null;
          return;
        }
        if (this.field_o == param0 &&
          this.field_p &&
          this.field_h == 0 &&
          this.field_j != null &&
          this.field_j.equals(param1)) {
          return;
        }
        try {
          this.field_h = param4;
          this.field_p = true;
          this.field_o = param0;
          this.field_j = param1;
          var7 = this.a(param0, (byte) 76, param3, param1);
          var8 = var7;
          var7.field_a[0] = param2;
          var8.field_a[param1.length()] = param0.b(param1) + param2;
          dc.a(false, 0, param1, param0, var8);
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "o.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(rf param0, int param1, int param2, String param3, boolean param4) {
        mi var8 = null;
        int var7 = 0;
        if (param3 == null) {
          this.field_a = null;
          return;
        }
        if (param0 == this.field_o && this.field_p && this.field_h == 1 && this.field_j != null &&
          this.field_j.equals(param3)) {
          return;
        }
        try {
          this.field_h = 1;
          this.field_p = true;
          this.field_o = param0;
          if (param4) {
            this.field_i = 109;
          }
          var8 = this.a(param0, (byte) 76, param2, param3);
          var7 = param0.b(param3);
          var8.field_a[0] = -(var7 >> 1) + param1;
          var8.field_a[param3.length()] = (var7 >> 1) + param1;
          dc.a(param4, 0, param3, param0, var8);
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "o.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final void a(rf param0, int param1, boolean param2, int param3, String param4) {
        mi var8 = null;
        mi var9 = null;
        if (param4 == null) {
          this.field_a = null;
          return;
        }
        if (this.field_o == param0 &&
          this.field_p &&
          2 == this.field_h &&
          null != this.field_j &&
          this.field_j.equals(param4)) {
          return;
        }
        try {
          this.field_j = param4;
          this.field_o = param0;
          this.field_h = 2;
          this.field_p = true;
          var8 = this.a(param0, (byte) 76, param3, param4);
          var9 = var8;
          var9.field_a[0] = -param0.b(param4) + param1;
          var9.field_a[param4.length()] = param1;
          dc.a(param2, 0, param4, param0, var9);
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "o.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    private final mi a(rf param0, byte param1, int param2, String param3) {
        mi var5 = null;
        RuntimeException var5_ref = null;
        String var6 = null;
        mi var7 = null;
        mi stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 76) {
            var6 = (String) null;
            this.a((rf) null, -123, false, -9, (String) null);
          }
          var7 = new mi(param2 - param0.field_x, param0.field_S + param2, param3.length());
          var5 = var7;
          this.field_a = new mi[]{var7};
          stackIn_3_0 = var5;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_6_0 = var5_ref;
          stackIn_6_1 = new StringBuilder().append("o.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public o() {
    }

    static {
        field_n = "Previous";
        field_k = new int[]{10, 3, 5, 2, 3, 6, 1, 1, 7, 8, 9, 6, 3, 1, 5, 1, 5, 6, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 3, 1, 3, 5, 2, 10, 3, 1, 3, 3, 3, 5, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        field_f = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
    }
}
