/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kga extends dg {
    private bua field_s;
    private int field_p;
    private int field_r;
    private int field_t;
    private int field_m;
    static String field_q;
    static dn field_o;
    static eua field_n;

    final void a(gr param0, gma param1, byte param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.a(param0, param1, param2);
          if (this.a(127).field_E < 20) {
            this.a(param1, -2159, param0);
          }
          if (0 != this.field_t) {
            return;
          }
          this.field_s = new bua(3, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("kga.E(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(gma param0, int param1, gr param2) {
        int var5 = 0;
        int var6 = 0;
        ue var7 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          super.a(param0, param1, param2);
          if (!(param2 instanceof ue)) {
            if (param2 instanceof rl) {
              this.field_t = 5;
              return;
            }
            if (param2 instanceof ok) {
              this.field_t = 5;
              return;
            }
            if (!(param2 instanceof ef)) {
              return;
            }
            this.field_t = 4;
            return;
          }
          var7 = (ue) (param2);
          var5 = var7.j((byte) -77);
          if (var5 == 0) {
            this.field_t = 3;
            return;
          }
          if (var5 == 3) {
            this.field_t = 2;
            return;
          }
          if (var5 == 1) {
            this.field_t = 0;
            return;
          }
          if (var5 != 2) {
            return;
          }
          this.field_t = 1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_23_0 = var4;
          stackIn_23_1 = new StringBuilder().append("kga.C(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        int stackIn_9_0 = 0;
        ka stackIn_21_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var8Lifetime1;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          if (null == this.field_h) {
            return;
          }
          if (this.field_k instanceof pd) {
            stackIn_9_0 = (((pd) (this.field_k)).c(-72)) ? 1 : 0;
          } else {
            stackIn_9_0 = 0;
          }
          var6_int = stackIn_9_0;
          var7 = null;
          var8 = this.field_t;
          if (var8 == 0) {
            if (var6_int == 0) {
              stackIn_21_0 = rl.field_t[0];
            } else {
              stackIn_21_0 = this.field_s.b((byte) 74);
            }
            var7 = stackIn_21_0;
            if (var6_int != 0) {
              this.field_s.a(3, false, (byte) -84, 9);
              var7 = this.field_s.b((byte) 74);
            }
          } else {
            if (var8 != 1) {
              if (var8 != 2) {
                if (3 == var8) {
                  var7 = rl.field_t[4];
                } else {
                  if (var8 == 4) {
                    var7 = rl.field_t[5];
                  } else {
                    if (var8 == 5) {
                      var7 = rl.field_t[7];
                    }
                  }
                }
              } else {
                var7 = rl.field_t[2];
              }
            } else {
              var7 = rl.field_t[1];
            }
          }
          var8Lifetime1 = 73 / ((-38 - param4) / 47);
          if (var6_int == 0) {
            param3 = param3 + this.field_r;
          } else {
            if (this.field_t != 0) {
              return;
            }
          }
          if (var7 != null) {
            var9 = dfa.a(-this.field_h.g(-25787) + 4096 + this.field_m >> 2, 2048, -117);
            gqa.a(var9, -83584144, param1, param2, (ka) (var7), param3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_39_0 = var6;
          stackIn_39_1 = new StringBuilder().append("kga.D(");
          if (param0 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void n(byte param0) {
        field_n = null;
        field_o = null;
        if (param0 != 9) {
          return;
        }
        field_q = null;
    }

    final void a(int param0, la param1, kh param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.a(124, param1, param2);
          if (param0 <= 119) {
            this.f(88);
          }
          if (param1.field_E < 20) {
            return;
          }
          this.field_t = param2.b((byte) 44, 4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("kga.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static void i(int param0) {
        qpa.a(275, ht.field_Pb, 3, 40, 440, 126, 200);
        qpa.a(275, cla.field_n, 5, 40, 440, 126, 200);
        qpa.a(275, se.field_s, 6, 40, 440, 124, 200);
        qpa.a(335, jta.field_z, 9, 40, 440, 125, 200);
        if (param0 < 97) {
          cka var2 = (cka) null;
          kga.a((cka) null, -2);
        }
    }

    kga(int param0, la param1, kh param2) {
        super(param0, param1, param2);
        this.field_m = 0;
        this.field_p = 0;
    }

    public final void f(int param0) {
        super.f(param0 ^ 0);
        if (param0 != -4366) {
          return;
        }
        if (null != this.field_s) {
          this.field_s.a(0);
        }
        if (this.field_t == 1) {
          return;
        }
        if (this.field_t != 2) {
          this.field_p = this.field_p + 32;
          this.field_m = this.field_m + 96;
          this.field_r = 524288 + hua.a((byte) 119, dfa.a(this.field_p, 2048, -122)) * 8;
          return;
        }
    }

    final void a(byte param0, kh param1) {
        try {
          super.a((byte) -58, param1);
          param1.a((byte) 61, this.field_t, 4);
          int var3_int = 15 % ((-8 - param0) / 40);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "kga.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(cka param0, int param1) {
        ama var7 = null;
        byte[] var19 = null;
        dca var9 = null;
        byte[] var20 = null;
        mq var11 = null;
        byte[] var21 = null;
        try {
          if (hna.field_e == null) {
            var7 = new ama();
            var19 = var7.a(16, 128, 0, 128);
            hna.field_e = bw.a(270, var19, false);
          }
          if (null == gu.field_l) {
            var9 = new dca();
            var20 = var9.a(128, 16, 123, 128);
            gu.field_l = bw.a(270, var20, false);
          }
          var11 = param0.field_zc;
          if (param1 < 116) {
            kga.n((byte) 16);
          }
          if (var11.a((byte) 89)) {
            if (uga.field_m != null) {
              return;
            }
            var21 = gaa.a(4.0f, 16.0f, 128, new tda(419684), 8, 128, 0.5f, 16, 4, 4.0f, 0.6000000238418579f);
            uga.field_m = bw.a(270, var21, false);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "kga.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void b(byte param0, int param1) {
        this.field_t = param1;
        if (param0 <= 73) {
          cka var4 = (cka) null;
          kga.a((cka) null, 79);
        }
    }

    kga(int param0) {
        super(param0);
        this.field_m = 0;
        this.field_p = 0;
    }

    static {
        field_q = "Bouncy Fireballs";
        field_o = new dn();
    }
}
