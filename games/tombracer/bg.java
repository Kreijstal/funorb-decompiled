/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg extends wda {
    private int field_q;
    static String field_p;
    static iu field_s;
    private boolean field_u;
    private int field_v;
    static int field_t;
    private boolean field_r;
    private ir field_o;

    final void b(byte param0) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        hca var14;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var8Lifetime2;
        int var9Lifetime2;
        int var10Lifetime2;
        int var11Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        var13 = TombRacer.field_G ? 1 : 0;
        var3 = -93 % ((param0 + 69) / 42);
        var14 = this.field_n.H(-122);
        if (var14.u(-25561)) {
          return;
        }
        this.field_o.field_f = var14.d(3);
        this.field_o.field_d = var14.e(9648);
        this.field_n.a(this.field_o, 30);
        var4 = this.field_o.field_f - this.field_n.s(25745);
        var5 = this.field_o.field_d - this.field_n.e(false);
        var6 = this.field_q >> 16;
        var6 = var6 * var6;
        var7 = (var4 >> 16) * (var4 >> 16) + (var5 >> 16) * (var5 >> 16);
        if (var7 <= var6) {
          return;
        }
        if (var4 == 0) {
          if (var5 == 0) {
            return;
          }
          if (this.field_u) {
            var8 = ua.a(var4, -106);
            var9 = ua.a(var5, -115);
            var10 = 0;
            var11 = 0;
            if ((!this.field_r ||
              var8 * 4 < var9 * 3) && (this.field_r ||
              var9 * 4 >= 3 * var8)) {
              this.field_r = false;
              if (var5 > 0) {
                var11 = this.field_v;
              } else {
                var11 = -this.field_v;
              }
              if (var9 >= ua.a(var11, 60)) {
                this.field_n.a((byte) -120, var10, var11);
                return;
              }
              var11 = var5;
              this.field_n.a((byte) -120, var10, var11);
              return;
            }
            this.field_r = true;
            if (var4 > 0) {
              var10Lifetime3 = this.field_v;
            } else {
              var10Lifetime3 = -this.field_v;
            }
            if (var8 >= ua.a(var10Lifetime3, -103)) {
              this.field_n.a((byte) -120, var10Lifetime3, var11);
              return;
            }
            var10Lifetime4 = var4;
            this.field_n.a((byte) -120, var10Lifetime4, var11);
            return;
          }
          if (var5 == 0) {
            var5 = 1;
          }
          var8Lifetime2 = qva.a((byte) -73, var5, var4);
          var9Lifetime2 = hua.a((byte) 107, var8Lifetime2 >> 2);
          var10Lifetime2 = bua.a(0, var8Lifetime2 >> 2);
          var11Lifetime2 = doa.a(2, this.field_v, var9Lifetime2);
          var12 = doa.a(2, this.field_v, var10Lifetime2);
          this.field_n.a((byte) -113, var11Lifetime2, var12);
          return;
        }
        if (this.field_u) {
          var8Lifetime1 = ua.a(var4, -106);
          var9Lifetime1 = ua.a(var5, -115);
          var10Lifetime1 = 0;
          var11Lifetime1 = 0;
          if (this.field_r) {
            if (var8Lifetime1 * 4 >= var9Lifetime1 * 3) {
              this.field_r = true;
              if (var4 > 0) {
                var10Lifetime1 = this.field_v;
              } else {
                var10Lifetime1 = -this.field_v;
              }
              if (var8Lifetime1 < ua.a(var10Lifetime1, -103)) {
                var10Lifetime1 = var4;
              }
            } else {
              if (!this.field_r &&
                var9Lifetime1 * 4 < 3 * var8Lifetime1) {
                this.field_r = true;
                if (var4 > 0) {
                  var10Lifetime1 = this.field_v;
                } else {
                  var10Lifetime1 = -this.field_v;
                }
                if (var8Lifetime1 < ua.a(var10Lifetime1, -103)) {
                  var10Lifetime1 = var4;
                }
              } else {
                this.field_r = false;
                if (var5 > 0) {
                  var11Lifetime1 = this.field_v;
                } else {
                  var11Lifetime1 = -this.field_v;
                }
                if (var9Lifetime1 < ua.a(var11Lifetime1, 60)) {
                  var11Lifetime1 = var5;
                }
              }
            }
            this.field_n.a((byte) -120, var10Lifetime1, var11Lifetime1);
            return;
          }
          if (!this.field_r &&
            var9Lifetime1 * 4 < 3 * var8Lifetime1) {
            this.field_r = true;
            if (var4 > 0) {
              var10Lifetime1 = this.field_v;
            } else {
              var10Lifetime1 = -this.field_v;
            }
            if (var8Lifetime1 < ua.a(var10Lifetime1, -103)) {
              var10Lifetime1 = var4;
            }
            this.field_n.a((byte) -120, var10Lifetime1, var11Lifetime1);
            return;
          }
          this.field_r = false;
          if (var5 > 0) {
            var11Lifetime1 = this.field_v;
          } else {
            var11Lifetime1 = -this.field_v;
          }
          if (var9Lifetime1 >= ua.a(var11Lifetime1, 60)) {
            this.field_n.a((byte) -120, var10Lifetime1, var11Lifetime1);
            return;
          }
          var11Lifetime1 = var5;
          this.field_n.a((byte) -120, var10Lifetime1, var11Lifetime1);
        } else {
          var8Lifetime1 = qva.a((byte) -73, var5, var4);
          var9Lifetime1 = hua.a((byte) 107, var8Lifetime1 >> 2);
          var10Lifetime1 = bua.a(0, var8Lifetime1 >> 2);
          var11Lifetime1 = doa.a(2, this.field_v, var9Lifetime1);
          var12Lifetime1 = doa.a(2, this.field_v, var10Lifetime1);
          this.field_n.a((byte) -113, var11Lifetime1, var12Lifetime1);
        }
        return;
    }

    final void c(int param0, int param1) {
        this.field_q = param1;
        int var3 = 108 / ((param0 + 57) / 33);
    }

    final void a(kh param0, byte param1) {
        if (param1 >= -78) {
          return;
        }
        try {
          super.a(param0, (byte) -83);
          param0.a((byte) -128, this.field_q >> 16, 10);
          param0.a((byte) -25, this.b(0, this.field_v), 8);
          param0.a((byte) -128, this.field_u ? 1 : 0, 1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "bg.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    bg(la param0, boolean param1) {
        super(param0, param1);
        this.field_r = true;
        this.field_o = new ir();
        try {
          this.field_q = 1048576;
          this.field_v = 131072;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "bg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    bg(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        this.field_r = true;
        this.field_o = new ir();
        try {
          this.field_q = param1.b((byte) 44, 10) << 16;
          if (7 < param0.field_E) {
            this.field_v = this.a(param1.b((byte) 44, 8), false);
          } else {
            this.field_v = param1.b((byte) 44, 4) << 16;
          }
          if (this.c(true).field_E < 3) {
            this.field_u = false;
          } else {
            stackIn_8_1 = (1 == param1.b((byte) 44, 1));
            this.field_u = stackIn_8_1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("bg.<init>(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    final void b(int param0) {
        if (param0 != 1) {
          this.field_q = 125;
        }
    }

    final int a(int param0, int param1) {
        param1 = fs.a((byte) 75, param1, this.field_v);
        if (param0 != 0) {
          this.a(-97, -102);
          return param1;
        }
        return param1;
    }

    final void a(boolean param0, int param1) {
        this.field_v = param1;
        if (param0) {
          field_p = (String) null;
        }
    }

    public static void e(byte param0) {
        if (param0 != 67) {
          return;
        }
        field_s = null;
        field_p = null;
    }

    final void a(int param0, fsa param1) {
        try {
          super.a(66, param1);
          if (param0 <= 35) {
            this.c(65, 104);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "bg.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int c(int param0) {
        if (param0 != 1) {
          this.b((byte) -128);
          return 1;
        }
        return 1;
    }

    static {
        field_p = "Play free version";
    }
}
