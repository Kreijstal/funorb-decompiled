/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bha extends wda {
    private int field_t;
    static String field_q;
    static String field_x;
    private boolean field_w;
    static String field_o;
    private int field_v;
    static int field_z;
    private int field_u;
    private int field_A;
    static jpa field_C;
    static String field_y;
    private boolean field_r;
    static String field_B;
    private ir field_s;
    private int field_E;
    private int field_p;
    private boolean field_D;

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
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var8Lifetime4;
        int var9Lifetime4;
        int var10Lifetime4;
        int var11Lifetime4;
        int var12Lifetime4;
        var13 = TombRacer.field_G ? 1 : 0;
        var14 = this.field_n.H(-119);
        if (var14.u(-25561)) {
          return;
        }
        var3 = -103 / ((-69 - param0) / 42);
        this.field_s.field_f = var14.d(3);
        this.field_s.field_d = var14.e(9648);
        this.field_n.a(this.field_s, 117);
        var4 = this.field_s.field_f - this.field_n.s(25745);
        var5 = this.field_s.field_d - this.field_n.e(false);
        var6 = (var5 >> 16) * (var5 >> 16) + (var4 >> 16) * (var4 >> 16);
        if (this.field_D &&
          !this.field_r) {
          if (!this.field_D) {
            return;
          }
          var7 = (this.field_v >> 16) * (this.field_v >> 16);
          if (var7 < var6) {
            this.field_D = false;
            return;
          }
          if (var4 == 0) {
            if (0 != var5) {
              if (this.field_r) {
                var8 = this.field_E;
              } else {
                var8 = dfa.a(qva.a((byte) -13, -var5, -var4) + this.field_p, 8192, 78);
              }
              var9 = hua.a((byte) 95, var8 >> 2);
              var10 = bua.a(0, var8 >> 2);
              var11 = doa.a(2, this.field_A, var9);
              var12 = doa.a(2, this.field_A, var10);
              this.field_n.a((byte) -110, var11, var12);
              if (this.field_w) {
                this.field_n.c(false, -this.field_n.q((byte) -80) + var8);
              }
              return;
            }
            var5 = 1;
          }
          if (this.field_r) {
            var8Lifetime4 = this.field_E;
          } else {
            var8Lifetime4 = dfa.a(qva.a((byte) -13, -var5, -var4) + this.field_p, 8192, 78);
          }
          var9Lifetime4 = hua.a((byte) 95, var8Lifetime4 >> 2);
          var10Lifetime4 = bua.a(0, var8Lifetime4 >> 2);
          var11Lifetime4 = doa.a(2, this.field_A, var9Lifetime4);
          var12Lifetime4 = doa.a(2, this.field_A, var10Lifetime4);
          this.field_n.a((byte) -110, var11Lifetime4, var12Lifetime4);
          if (!this.field_w) {
            return;
          }
          this.field_n.c(false, -this.field_n.q((byte) -80) + var8Lifetime4);
          return;
        }
        var7Lifetime1 = (this.field_t >> 16) * (this.field_t >> 16);
        if (var7Lifetime1 > var6) {
          if (!this.field_D) {
            if (0 >= this.field_u) {
              this.field_p = 0;
              this.field_D = true;
              if (this.field_r) {
                this.field_E = dfa.a(qva.a((byte) -61, -var5, -var4) + this.field_p, 8192, 87);
              }
              if (!this.field_D) {
                return;
              }
              var7Lifetime1 = (this.field_v >> 16) * (this.field_v >> 16);
              if (var7Lifetime1 < var6) {
                this.field_D = false;
              } else {
                if (var4 == 0 &&
                  0 == var5) {
                  var5 = 1;
                }
                if (this.field_r) {
                  var8Lifetime1 = this.field_E;
                } else {
                  var8Lifetime1 = dfa.a(qva.a((byte) -13, -var5, -var4) + this.field_p, 8192, 78);
                }
                var9Lifetime1 = hua.a((byte) 95, var8Lifetime1 >> 2);
                var10Lifetime1 = bua.a(0, var8Lifetime1 >> 2);
                var11Lifetime1 = doa.a(2, this.field_A, var9Lifetime1);
                var12Lifetime1 = doa.a(2, this.field_A, var10Lifetime1);
                this.field_n.a((byte) -110, var11Lifetime1, var12Lifetime1);
                if (this.field_w) {
                  this.field_n.c(false, -this.field_n.q((byte) -80) + var8Lifetime1);
                }
              }
              return;
            }
            this.field_p = this.field_n.y(1751085328).a(this.field_u, 0) - this.field_u / 2;
          }
          this.field_D = true;
          if (this.field_r) {
            this.field_E = dfa.a(qva.a((byte) -61, -var5, -var4) + this.field_p, 8192, 87);
          }
        }
        if (!this.field_D) {
          return;
        }
        var7Lifetime2 = (this.field_v >> 16) * (this.field_v >> 16);
        if (var7Lifetime2 < var6) {
          this.field_D = false;
          return;
        }
        if (var4 == 0) {
          if (0 != var5) {
            if (this.field_r) {
              var8Lifetime2 = this.field_E;
            } else {
              var8Lifetime2 = dfa.a(qva.a((byte) -13, -var5, -var4) + this.field_p, 8192, 78);
            }
            var9Lifetime2 = hua.a((byte) 95, var8Lifetime2 >> 2);
            var10Lifetime2 = bua.a(0, var8Lifetime2 >> 2);
            var11Lifetime2 = doa.a(2, this.field_A, var9Lifetime2);
            var12Lifetime2 = doa.a(2, this.field_A, var10Lifetime2);
            this.field_n.a((byte) -110, var11Lifetime2, var12Lifetime2);
            if (this.field_w) {
              this.field_n.c(false, -this.field_n.q((byte) -80) + var8Lifetime2);
            }
            return;
          }
          var5 = 1;
        }
        if (this.field_r) {
          var8Lifetime3 = this.field_E;
        } else {
          var8Lifetime3 = dfa.a(qva.a((byte) -13, -var5, -var4) + this.field_p, 8192, 78);
        }
        var9Lifetime3 = hua.a((byte) 95, var8Lifetime3 >> 2);
        var10Lifetime3 = bua.a(0, var8Lifetime3 >> 2);
        var11Lifetime3 = doa.a(2, this.field_A, var9Lifetime3);
        var12Lifetime3 = doa.a(2, this.field_A, var10Lifetime3);
        this.field_n.a((byte) -110, var11Lifetime3, var12Lifetime3);
        if (!this.field_w) {
          return;
        }
        this.field_n.c(false, -this.field_n.q((byte) -80) + var8Lifetime3);
        return;
    }

    bha(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        boolean stackIn_6_1 = false;
        boolean stackIn_9_1 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        this.field_u = 1024;
        this.field_s = new ir();
        try {
          this.field_t = param1.b((byte) 44, 10) << 16;
          if (7 < param0.field_E) {
            this.field_v = param1.b((byte) 44, 10) << 16;
            this.field_A = this.a(param1.b((byte) 44, 8), false);
            stackIn_6_1 = (param1.b((byte) 44, 1) == 1);
            this.field_r = stackIn_6_1;
            this.field_u = oo.a(8, 8192, 0, param1.b((byte) 44, 8));
            stackIn_9_1 = (param1.b((byte) 44, 1) == 1);
            this.field_w = stackIn_9_1;
          } else {
            this.field_v = this.field_t;
            this.field_A = param1.b((byte) 44, 4) << 16;
            this.field_w = false;
            this.field_r = false;
            this.field_u = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("bha.<init>(");
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

    public static void e(int param0) {
        field_y = null;
        field_q = null;
        field_C = null;
        if (param0 == 8561) {
          field_B = null;
          field_o = null;
          field_x = null;
          return;
        }
        bha.f(-55);
        field_B = null;
        field_o = null;
        field_x = null;
    }

    final void a(int param0, fsa param1) {
        if (param0 < 35) {
          return;
        }
        try {
          super.a(96, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "bha.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(int param0, int param1) {
        param1 = upa.a(this.field_D, param1, (byte) -41);
        param1 = fs.a((byte) 37, param1, this.field_p);
        if (param0 == 0) {
          return param1;
        }
        this.b((byte) -46);
        return param1;
    }

    final void b(int param0) {
        if (param0 != 1) {
          field_o = (String) null;
        }
    }

    final static int f(int param0) {
        if (param0 != 1) {
          bha.e((byte) 123);
          return 1;
        }
        return 1;
    }

    final int c(int param0) {
        if (param0 != 1) {
          return 58;
        }
        return 3;
    }

    final void a(kh param0, byte param1) {
        kh stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_3_2 = 0;
        kh stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_6_2 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          super.a(param0, (byte) -108);
          param0.a((byte) -34, this.field_t >> 16, 10);
          param0.a((byte) -128, this.field_v >> 16, 10);
          param0.a((byte) -128, this.b(0, this.field_A), 8);
          stackIn_2_0 = (kh) (param0);
          stackIn_2_1 = 111;
          if (!this.field_r) {
            stackIn_3_2 = 0;
          } else {
            stackIn_3_2 = 1;
          }
          ((kh) (Object) stackIn_2_0).a((byte) stackIn_2_1, stackIn_3_2, 1);
          param0.a((byte) -128, cn.a((byte) -104, this.field_u, 8192, 8), 8);
          stackIn_5_0 = (kh) (param0);
          stackIn_5_1 = -128;
          if (this.field_w) {
            stackIn_6_2 = 1;
          } else {
            stackIn_6_2 = 0;
          }
          ((kh) (Object) stackIn_5_0).a((byte) stackIn_5_1, stackIn_6_2, 1);
          if (param1 >= -78) {
            this.field_w = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("bha.R(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void e(byte param0) {
        kra.field_a = new lqa(3, 4, true, true, true, true, true, true, true, false, true);
        nj.field_t = new lqa(3, 1, true, false, false, true, true, true, true, false, true);
        if (param0 == -33) {
          paa.field_z = new lqa(1, 4, true, true, true, true, true, true, true, false, true);
          vea.field_c = new lqa(1, 1, true, false, false, true, true, true, true, false, true);
          laa.field_x = new lqa(0, 1, true, false, false, false, false, false, false, true, false);
          daa.field_d = new lqa(0, 1, false, false, false, false, false, false, false, true, false);
          rc.field_a = new ei[]{(ei) ((Object) kra.field_a), (ei) ((Object) paa.field_z), (ei) ((Object) nj.field_t), (ei) ((Object) vea.field_c), (ei) ((Object) laa.field_x), (ei) ((Object) daa.field_d)};
          return;
        }
        field_B = (String) null;
        paa.field_z = new lqa(1, 4, true, true, true, true, true, true, true, false, true);
        vea.field_c = new lqa(1, 1, true, false, false, true, true, true, true, false, true);
        laa.field_x = new lqa(0, 1, true, false, false, false, false, false, false, true, false);
        daa.field_d = new lqa(0, 1, false, false, false, false, false, false, false, true, false);
        rc.field_a = new ei[]{(ei) ((Object) kra.field_a), (ei) ((Object) paa.field_z), (ei) ((Object) nj.field_t), (ei) ((Object) vea.field_c), (ei) ((Object) laa.field_x), (ei) ((Object) daa.field_d)};
    }

    static {
        field_x = "Idols x2";
        field_q = "This entry doesn't match";
        field_y = "You can spectate this game";
        field_o = "Please remove <%0> from your friend list first.";
        field_B = "Click";
    }
}
