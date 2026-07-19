/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii extends wi {
    static String field_l;
    static int field_k;
    static int[] field_n;
    private qb field_o;
    private int field_m;

    final void o(int param0) {
        this.field_m = this.field_h * param0;
    }

    public static void l(int param0) {
        if (param0 != 0) {
            return;
        }
        field_n = null;
        field_l = null;
    }

    final static void a(int param0, String param1, int param2, int param3, int param4) {
        od.field_f.a(param1, param0 - 1, param2, 0, 0);
        if (param4 != 8) {
            return;
        }
        try {
            od.field_f.a(param1, param0, -1 + param2, 0, 0);
            od.field_f.a(param1, param0, param2, param3, -1);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "ii.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void n(int param0) {
        ga discarded$0 = null;
        lg.field_b = new gh();
        if (param0 != 8) {
            String var2 = (String) null;
            discarded$0 = ii.a((Throwable) null, (String) null);
            ed.field_c.a(10768, lg.field_b);
            return;
        }
        ed.field_c.a(10768, lg.field_b);
    }

    final void a(boolean param0, int param1) {
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_i[fieldTemp$0] = (byte)(param1 + this.field_o.b((byte) 123));
        if (param0) {
            return;
        }
        this.field_m = 20;
    }

    final void m(int param0) {
        this.field_h = (this.field_m + 7) / 8;
        if (param0 <= -36) {
            return;
        }
        byte[] var3 = (byte[]) null;
        this.a(-77, -85, 1, (byte[]) null);
    }

    final void b(int[] param0, int param1) {
        int discarded$2 = 0;
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.field_o = new qb(param0);
              if (param1 > 83) {
                break L1;
              } else {
                discarded$2 = this.f(60, 33);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("ii.G(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final int h(byte param0) {
        if (param0 <= 1) {
            return -119;
        }
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        return this.field_i[fieldTemp$0] + -this.field_o.b((byte) 123) & 255;
    }

    ii(int param0) {
        super(param0);
    }

    ii(byte[] param0) {
        super(param0);
    }

    final static ga a(Throwable param0, String param1) {
        ga var2 = null;
        if (!(param0 instanceof ga)) {
            var2 = new ga(param0, param1);
        } else {
            var2 = (ga) ((Object) param0);
            var2.field_a = var2.field_a + ' ' + param1;
        }
        return var2;
    }

    final void a(int param0, int param1, int param2, byte[] param3) {
        int fieldTemp$5 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var6 = Bounce.field_N;
        try {
          L0: {
            var5_int = 0;
            if (param1 == 8) {
              L1: while (true) {
                if (var5_int >= param0) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  fieldTemp$5 = this.field_h;
                  this.field_h = this.field_h + 1;
                  param3[var5_int - -param2] = (byte)(this.field_i[fieldTemp$5] + -this.field_o.b((byte) 123));
                  var5_int++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var5);
            stackOut_6_1 = new StringBuilder().append("ii.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int f(int param0, int param1) {
        int incrementValue$0 = 0;
        int var6 = Bounce.field_N;
        int var3 = this.field_m >> 1238811907;
        int var4 = 8 - (this.field_m & param0);
        this.field_m = this.field_m + param1;
        int var5 = 0;
        while (var4 < param1) {
            incrementValue$0 = var3;
            var3++;
            var5 = var5 + ((this.field_i[incrementValue$0] & nh.field_N[var4]) << -var4 + param1);
            param1 = param1 - var4;
            var4 = 8;
        }
        if (var4 == param1) {
            var5 = var5 + (nh.field_N[var4] & this.field_i[var3]);
        } else {
            var5 = var5 + (this.field_i[var3] >> -param1 + var4 & nh.field_N[param1]);
        }
        return var5;
    }

    static {
        field_k = 0;
    }
}
