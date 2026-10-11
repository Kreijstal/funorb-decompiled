/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class os extends hn {
    NodeDeque field_p;
    private ih field_r;
    static int field_o;
    uv field_s;
    static String field_q;

    final hn b() {
        mi var1_ref = null;
        int var2 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        do {
          var1_ref = (mi) (this.field_p.next((byte) 123));
          if (var1_ref == null) {
            return null;
          }
        } while (null == var1_ref.field_K);
        return (hn) ((Object) var1_ref.field_K);
    }

    final hn a() {
        mi var1 = (mi) (this.field_p.first((byte) 99));
        if (var1 == null) {
          return null;
        }
        if (null != var1.field_K) {
          return (hn) ((Object) var1.field_K);
        }
        return this.b();
    }

    final void b(int[] param0, int param1, int param2) {
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        mi var6 = null;
        int var7 = 0;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          this.field_s.b(param0, param1, param2);
          var6 = (mi) (this.field_p.first((byte) 94));
          while (var6 != null) {
            stackIn_4_0 = this.field_r.c((byte) -109, var6);
            boolean decompiledFrameCompleted0 = true;
            if (!stackIn_4_0) {
              var4_int = param1;
              var5 = param2;
              while (var6.field_w < var5) {
                this.a(var4_int, var5 + var4_int, param0, -1, var6, var6.field_w);
                var5 = var5 - var6.field_w;
                var4_int = var4_int + var6.field_w;
                if (this.field_r.a(var5, var4_int, var6, (byte) 116, param0)) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted0) {
                this.a(var4_int, var4_int + var5, param0, -1, var6, var5);
                var6.field_w = var6.field_w - var5;
              }
            }
            var6 = (mi) (this.field_p.next((byte) 123));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("os.E(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = param1 >>> 31;
        if (param2 != 1589591487) {
          return 83;
        }
        return (param1 + var3) / param0 - var3;
    }

    final static boolean e(int param0) {
        if (param0 == -1) {
          return !vi.field_d ? true : false;
        }
        os.a(-56, 74, 21);
        return !vi.field_d ? true : false;
    }

    final static int g(int param0) {
        if (param0 != 4) {
          return 68;
        }
        return av.field_a;
    }

    final void a(int param0) {
        int var2;
        mi var3;
        int var4;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        this.field_s.a(param0);
        var3 = (mi) (this.field_p.first((byte) 103));
        while (var3 != null) {
          if (!this.field_r.c((byte) -97, var3)) {
            var2 = param0;
            do {
              if (var3.field_w >= var2) {
                this.a(var3, (byte) 16, var2);
                var3.field_w = var3.field_w - var2;
                break;
              }
              this.a(var3, (byte) 16, var3.field_w);
              var2 = var2 - var3.field_w;
            } while (!this.field_r.a(var2, 0, var3, (byte) 78, (int[]) null));
          }
          var3 = (mi) (this.field_p.next((byte) 123));
        }
    }

    private final void a(mi param0, byte param1, int param2) {
        ih stackIn_7_0 = null;
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          if ((this.field_r.field_o[param0.field_m] & 4) != 0 &&
            0 > param0.field_x) {
            var4_int = this.field_r.field_s[param0.field_m] / rc.field_d;
            var5 = (1048575 + var4_int - param0.field_B) / var4_int;
            param0.field_B = var4_int * param2 + param0.field_B & 1048575;
            if (param2 >= var5) {
              if (0 != this.field_r.field_W[param0.field_m]) {
                param0.field_K = aa.b(param0.field_q, param0.field_K.h(), 0, param0.field_K.k());
                stackIn_7_0 = this.field_r;
                stackIn_8_1 = !(0 <= param0.field_H.field_r[param0.field_D]);
                ((ih) (Object) stackIn_7_0).a(stackIn_8_1, param0, 16);
              } else {
                param0.field_K = aa.b(param0.field_q, param0.field_K.h(), param0.field_K.l(), param0.field_K.k());
              }
              if (0 > param0.field_H.field_r[param0.field_D]) {
                param0.field_K.f(-1);
              }
              param2 = param0.field_B / var4_int;
            }
          }
          if (param1 != 16) {
            os.f(119);
          }
          param0.field_K.a(param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_18_0 = var4;
          stackIn_18_1 = new StringBuilder().append("os.A(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final int c() {
        return 0;
    }

    os(ih param0) {
        this.field_p = new NodeDeque();
        this.field_s = new uv();
        try {
          this.field_r = param0;
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "os.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, int param1, int[] param2, int param3, mi param4, int param5) {
        ih stackIn_13_0 = null;
        boolean stackIn_14_1 = false;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        aa var11 = null;
        int var12 = 0;
        var12 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param3 != ~(this.field_r.field_o[param4.field_m] & 4) &&
            param4.field_x < 0) {
            var7_int = this.field_r.field_s[param4.field_m] / rc.field_d;
            while (true) {
              var8 = (-param4.field_B + (var7_int + 1048575)) / var7_int;
              if (param5 < var8) {
                param4.field_B = param4.field_B + param5 * var7_int;
                break;
              }
              param4.field_K.b(param2, param0, var8);
              param0 = param0 + var8;
              param5 = param5 - var8;
              param4.field_B = param4.field_B + (-1048576 + var7_int * var8);
              var9 = rc.field_d / 100;
              var10 = 262144 / var7_int;
              if (var9 > var10) {
                var9 = var10;
              }
              var11 = param4.field_K;
              if (this.field_r.field_W[param4.field_m] == 0) {
                param4.field_K = aa.b(param4.field_q, var11.h(), var11.l(), var11.k());
              } else {
                param4.field_K = aa.b(param4.field_q, var11.h(), 0, var11.k());
                stackIn_13_0 = this.field_r;
                stackIn_14_1 = !(param4.field_H.field_r[param4.field_D] >= 0);
                ((ih) (Object) stackIn_13_0).a(stackIn_14_1, param4, 16);
                param4.field_K.d(var9, var11.l());
              }
              if (param4.field_H.field_r[param4.field_D] < 0) {
                param4.field_K.f(-1);
              }
              var11.h(var9);
              var11.b(param2, param0, -param0 + param1);
              if (!var11.e()) {
                continue;
              }
              this.field_s.a(var11);
            }
          }
          param4.field_K.b(param2, param0, param5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_25_0 = var7;
          stackIn_25_1 = new StringBuilder().append("os.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param5).append(')').toString());
        }
    }

    public static void f(int param0) {
        field_q = null;
        if (param0 == 1048575) {
          return;
        }
        field_o = 68;
    }

    static {
        field_q = "This private message is prefixed with \"<col=9090FF>To <%1>:</col>\" on your screen.<br>On <%1>'s screen, it will be prefixed with \"<col=FF6060>From <%0>:</col>\", which is<br>a different length and may leave less room for the message itself.<br><br>This shading covers the area which is not available on <%1>'s screen.<br>Provided your message fits to the left of the shaded area,<br><%1> should be able to see it in full.<br><br>(Note: this may be inaccurate if <%1> is playing in a different<br>language from you.)";
    }
}
