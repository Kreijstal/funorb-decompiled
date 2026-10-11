/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nva extends dqa implements oo {
    private htb field_x;
    private int field_y;
    boolean field_H;
    sha field_G;
    private htb field_A;
    tia field_w;
    static String field_D;
    static String field_I;
    no field_v;
    private int field_B;
    String field_E;
    private boolean field_z;

    final boolean h(int param0) {
        if (param0 != 0) {
          return true;
        }
        return this.field_H;
    }

    private final void a(byte param0, String param1) {
        if (null == this.field_w.field_L) {
          return;
        }
        int var3_int = this.a(param1.toLowerCase(), param0 - 108);
        if (var3_int == -1) {
          return;
        }
        try {
          if (param0 != 40) {
            this.f((byte) 41);
          }
          this.field_w.field_H = var3_int;
          this.e(125);
          this.field_E = param1;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "nva.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void b(int param0, int param1, int param2, int param3, int param4) {
        super.a(param3, param0, param4, 1, param1);
        this.field_A.a(0, param2 + param0, this.field_B, param2 + 21, 0);
        this.field_x.a(-20 + param0, 20, this.field_B, 1, 0);
        if (this.field_H) {
          this.field_G.a(0, param0, -this.field_B + param4, 1, this.field_B);
        }
    }

    private final void e(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var8Lifetime1;
        int var9Lifetime1;
        if (this.h(0) &&
          this.field_w.field_H != -1 &&
          null != this.field_w.field_L &&
          null != this.field_G.field_B) {
          var2 = this.field_G.field_y.field_f;
          var3 = this.field_w.field_I;
          var4 = -var2 + this.field_w.field_f;
          if (var4 <= 0) {
            return;
          }
          var5 = -93 / ((72 - param0) / 35);
          var6 = var3 * this.field_w.field_H;
          var7 = var6 + this.field_G.field_y.field_t.field_r;
          var8 = var2 >> 2;
          if (var7 < var8) {
            var9 = -(var8 - var6 << 16) / var4;
            if (var9 < 0) {
              var9 = 0;
            }
            this.field_G.field_B.field_L = var9;
          }
          var8Lifetime1 = -var3 + (3 * var2 >> 2);
          if (var8Lifetime1 < var7) {
            var9Lifetime1 = -(-var6 + var8Lifetime1 << 16) / var4;
            if (var9Lifetime1 > 65536) {
              var9Lifetime1 = 65536;
            }
            this.field_G.field_B.field_L = var9Lifetime1;
          }
          return;
        }
    }

    private final void d(int param0) {
        int var2 = this.field_w.e(4);
        int var3 = var2;
        int var4 = 0;
        if (this.field_y < var3) {
          var3 = this.field_y;
          var4 = 1;
        }
        this.b(this.field_h, this.field_r, -20, this.field_g, this.field_B + var3);
        this.field_w.a(0, this.field_h, var2, 1, 0);
        this.field_G = new sha(0, 0, 0, 0, new nrb(), this.field_w, (wwa) null);
        if (var4 != 0) {
          this.field_G.a(true, qe.a(0), (byte) -99);
        }
        this.field_G.a(0, this.field_h, this.field_f - this.field_B, 1, this.field_B);
        this.field_H = true;
        this.b(param0 ^ -6447, this.field_G);
        this.e(param0 ^ 20500);
        if (param0 != 20589) {
          shb var5 = (shb) null;
          this.a(76, 36, (shb) null, '3');
        }
    }

    final void i(int param0) {
        if (param0 != 21694) {
          this.field_H = false;
        }
        if (this.field_l instanceof aca) {
          ((aca) ((Object) this.field_l)).a(-3, this);
        }
    }

    nva(Object[] param0, int param1, int param2) {
        super(0, 0, 0, 0, (wwa) null);
        this.field_E = "";
        this.field_v = loa.field_o;
        try {
          this.field_w = new tia(this, this.field_v, param0, param1);
          this.field_y = param2;
          this.field_w.field_l = (sba) (this);
          this.field_H = false;
          this.field_A = new htb("", new bpa(this), (sba) (this));
          this.field_x = new htb();
          this.field_x.field_q = (wwa) ((Object) new pbb());
          this.field_x.field_l = (sba) (this);
          this.b(-18756, this.field_A);
          this.b(-18756, this.field_x);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "nva.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void a(int param0, int param1, int param2, htb param3, int param4) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param0 != 11) {
            return;
          }
          if (!this.h(0)) {
            this.d(20589);
          } else {
            this.g(5647);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("nva.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void f(int param0) {
        if (param0 > -77) {
          return;
        }
        field_D = null;
        field_I = null;
    }

    final boolean e(byte param0) {
        shb var3;
        boolean stackIn_7_0 = false;
        if (param0 != -120) {
          var3 = (shb) null;
          this.a(27, 77, (shb) null, 'ￔ');
        }
        stackIn_7_0 = (this.field_z) || (super.e((byte) -120));
        return stackIn_7_0;
    }

    private final void g(int param0) {
        if (!this.h(param0 ^ param0)) {
          return;
        }
        this.b(this.field_h, this.field_r, -20, this.field_g, this.field_B);
        this.field_H = false;
        this.field_G.b(param0 - 9493);
    }

    final void f(byte param0) {
        this.field_z = false;
        super.f(param0);
    }

    final boolean a(int param0, shb param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param1.f((byte) -34);
          if (param0 != 0) {
            this.a(-101, -112, (shb) null, '￭');
          }
          this.field_z = true;
          this.field_E = "";
          if (null != this.field_l &&
            this.field_l instanceof dta) {
            ((dta) (this.field_l)).a(this.field_z, (shb) (this), true);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("nva.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, shb param3) {
        try {
          super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "nva.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final String d(byte param0) {
        int discarded$0 = 0;
        if (!this.field_e) {
          return null;
        }
        if (this.h(0) &&
          this.field_G.field_e &&
          this.field_w.field_D != -1) {
          return this.field_w.field_L[this.field_w.field_D].toString();
        }
        if (null != this.field_w.g((byte) 96)) {
          return this.field_w.g((byte) 96).toString();
        }
        if (param0 != 125) {
          String var3 = (String) null;
          discarded$0 = this.a((String) null, -80);
        }
        return super.d((byte) 125);
    }

    final boolean a(int param0, int param1, int param2, int param3, shb param4, int param5, byte param6) {
        RuntimeException var8 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param6 >= -17) {
            this.field_v = (no) null;
          }
          stackIn_3_0 = super.a(param0, param1, param2, param3, param4, param5, (byte) -93);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("nva.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, shb param2, char param3) {
        boolean stackIn_61_0 = false;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_65_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6_int = 0;
        String var6 = null;
        int var7 = 0;
        int var6_intLifetime1;
        var7 = VoidHunters.field_G;
        try {
          if (!this.e((byte) -120)) {
            return false;
          }
          if (param0 != -15834) {
            return true;
          }
          boolean decompiledFrameRemainder0 = true;
          if (null != this.field_w.field_L) {
            var5_int = this.field_w.field_L.length;
            if (param1 != 99 &&
              param1 != 98) {
              if (param1 != 105 &&
                param1 != 104) {
                if (84 == param1) {
                  if (this.field_H) {
                    this.g(5647);
                  } else {
                    this.d(20589);
                  }
                  return true;
                }
                if (85 == param1) {
                  var6_int = this.field_E.length();
                  if (var6_int <= 0) {
                    return true;
                  }
                  this.field_E = this.field_E.substring(0, -1 + var6_int);
                  return true;
                }
                decompiledFrameRemainder0 = !(param3 < 32);
                if ((decompiledFrameRemainder0) &&
                  (decompiledFrameRemainder0 = !(param3 >= 128))) {
                  var6 = this.field_E + param3;
                  this.a((byte) 40, var6);
                  return true;
                }
              }
              if (decompiledFrameRemainder0) {
                if (!this.h(0)) {
                  this.d(20589);
                }
                var6_intLifetime1 = this.field_G.field_y.field_f / this.field_w.field_I;
                if (param1 == 105) {
                  this.field_w.field_H = this.field_w.field_H + var6_intLifetime1;
                } else {
                  this.field_w.field_H = this.field_w.field_H - var6_intLifetime1;
                }
                if (0 > this.field_w.field_H) {
                  this.field_w.field_H = 0;
                }
                if (this.field_w.field_H >= var5_int) {
                  this.field_w.field_H = -1 + var5_int;
                }
                this.e(120);
                return true;
              }
            }
            if (decompiledFrameRemainder0) {
              if (!this.h(0)) {
                this.d(20589);
              }
              if (param1 == 99) {
                this.field_w.field_H = this.field_w.field_H + 1;
              } else {
                this.field_w.field_H = this.field_w.field_H - 1;
              }
              if (this.field_w.field_H < 0) {
                this.field_w.field_H = 0;
              }
              if (var5_int <= this.field_w.field_H) {
                this.field_w.field_H = -1 + var5_int;
              }
              this.e(115);
              return true;
            }
          }
          if (80 != param1) {
            stackIn_61_0 = super.a(-15834, param1, param2, param3);
            return stackIn_61_0;
          }
          this.g(5647);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_64_0 = var5;
          stackIn_64_1 = new StringBuilder().append("nva.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_65_2 = "null";
          } else {
            stackIn_65_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_64_0), ((StringBuilder) (Object) stackIn_64_1).append(stackIn_65_2).append(',').append(param3).append(')').toString());
        }
    }

    private final int a(String param0, int param1) {
        int var4 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var5 = null;
        int var6 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = VoidHunters.field_G;
        try {
          var3_int = -55 / ((45 - param1) / 53);
          param0 = param0.toLowerCase();
          for (var4 = 0; this.field_w.field_L.length > var4; var4++) {
            var5 = this.field_w.field_L[var4].toString().toLowerCase();
            if (var5.startsWith(param0)) {
              stackIn_6_0 = var4;
              return stackIn_6_0;
            }
          }
          stackIn_9_0 = -1;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("nva.C(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        this.field_B = param2;
        if (param3 != 1) {
          this.field_B = 17;
        }
        this.b(param1, param4, -20, param0, param2);
    }

    final int a(int param0) {
        if (param0 != 0) {
          this.field_y = 67;
        }
        return this.field_w.field_H;
    }

    final static String a(char param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = VoidHunters.field_G;
        char[] var6 = new char[param2];
        char[] var3 = var6;
        if (!param1) {
          nva.f(-90);
        }
        for (var4 = 0; var4 < param2; var4++) {
          var6[var4] = param0;
        }
        return new String(var6);
    }

    final static void a(int param0, boolean param1, int param2, int param3) {
        fda.field_o = param2;
        mb.field_j = param0;
        if (!param1) {
          nva.a('W', true, -7);
        }
        eqa.field_o = param3;
    }

    static {
        field_D = "Hint: to start quickly, choose 'Don't mind' for as many options as you can!";
        field_I = "Activate to confuse nearby missiles";
    }
}
