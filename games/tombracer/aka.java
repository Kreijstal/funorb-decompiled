/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aka extends cda {
    static String field_A;
    private int field_z;
    private bua field_C;
    private int field_x;
    private boolean field_w;
    static float field_B;
    private boolean field_y;

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        int var7 = 0;
        ka var8 = null;
        if (this.field_C == null) {
          return;
        }
        try {
          int var6_int = 0 % ((-38 - param4) / 47);
          var7 = this.i(-6874);
          var8 = this.field_C.a(false, -1, false, (byte) 1);
          gqa.a(var7, -83584144, param1, param2, var8, param3);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "aka.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0, la param1, kh param2) {
        if (param0 <= 119) {
          return;
        }
        try {
          super.a(123, param1, param2);
          this.field_x = param2.b((byte) 44, 4);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "aka.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, int param1) {
        int var3;
        int var4;
        int var5_int;
        w var5;
        nta var6;
        int var5_intLifetime1;
        super.a((byte) 51, param1);
        if (null == this.field_C) {
          return;
        }
        var4 = 2 / ((7 - param0) / 36);
        var3 = 0;
        var5_int = this.field_x;
        if (var5_int == 0) {
          if (param1 == 4) {
            return;
          }
          this.field_C.a(6, -23308, 1);
          var3 = -1;
          this.field_C.a(1, true, (byte) -101, 3);
        }
        if (var3 != 0) {
          var5_intLifetime1 = this.i(-6874);
          var6 = new nta(this.b((byte) 40), this.c((byte) 123), this.e((byte) -96), this.field_C, var5_intLifetime1, var3);
          var6.a((byte) -113, this.field_h.f((byte) -109).j((byte) -118), this.k((byte) -99));
        }
        var5 = (w) (this.field_h.f((byte) -99).field_G);
        if (var5 == null) {
          return;
        }
        if (param1 == 3) {
          var5.a(new fm(78, this.b((byte) 71), this.c((byte) 106), this.e((byte) -91)), -58);
          return;
        }
        if (param1 != 2) {
          return;
        }
        var5.a(new fm(80, this.b((byte) 90), this.c((byte) 94), this.e((byte) -108)), -58);
        return;
    }

    public static void o(byte param0) {
        if (param0 <= 80) {
          field_A = (String) null;
          field_A = null;
          return;
        }
        field_A = null;
    }

    final void a(uw param0, int param1) {
        try {
          if (param1 < 82) {
            this.field_C = (bua) null;
          }
          super.a(param0, 93);
          this.field_C = null;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "aka.RA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void b(int param0, uw param1) {
        int var3_int = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          super.b(param0 ^ param0, param1);
          var3_int = this.field_x;
          if (var3_int == 0) {
            this.field_C = new bua(6, 0, 0);
            this.field_C.a(1, true, (byte) -121, 1);
            this.field_C.a(false, 176);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("aka.WA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void j(int param0) {
        if (param0 != 28191) {
          return;
        }
        jo.a(oba.field_f, 0, kua.field_i, rfa.field_C, lma.field_r);
    }

    final void a(gr param0, gma param1, byte param2) {
        try {
          super.a(param0, param1, param2);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "aka.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    aka(int param0, la param1, kh param2) {
        super(param0, param1, param2);
        this.field_w = false;
        this.field_z = 0;
        this.field_y = false;
    }

    public final void f(int param0) {
        int var2;
        int var3;
        int var4;
        int var5_int;
        w var5;
        int var7;
        int var8;
        fsa var9;
        fsa var10;
        fsa var11;
        fsa var12;
        fsa var13;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var7Lifetime4;
        var8 = TombRacer.field_G ? 1 : 0;
        super.f(param0 ^ 0);
        if (null == this.field_C) {
          return;
        }
        var2 = this.a(true) ? 1 : 0;
        var3 = this.b(false);
        var4 = 1;
        var5_int = this.field_x;
        if (0 == var5_int) {
          if (var2 == 0 &&
            var3 > 5) {
            var4 = 0;
          }
          this.field_C.a(1, false, (byte) -114, var4);
        }
        this.field_C.a(param0 ^ param0);
        var5 = (w) (this.field_h.f((byte) -79).field_G);
        if (var5 == null) {
          return;
        }
        if (var4 != 1) {
          this.field_z = 0;
          if (!this.field_y) {
            if (!this.field_h.j(-1)) {
              var12 = (fsa) (this.field_h);
              if (var12 == null) {
                return;
              }
              var7 = var12.a((byte) 110, var12.H(param0 ^ -4445).e(param0 ^ -13502), var12.H(66).d(param0 ^ -4367), var12.H(-128).a((byte) 55), var12.H(-120).c(-125)) ? 1 : 0;
              if (var7 != 0 &&
                !this.field_w) {
                var5.a(new fm(81, this.b((byte) 56), this.c((byte) 99), this.e((byte) -117)), -58);
                this.field_w = true;
              }
              if (var7 == 0 &&
                this.field_w) {
                this.field_w = false;
              }
              return;
            }
            var5.a(new fm(79, this.b((byte) -112), this.c((byte) 121), this.e((byte) -119)), param0 + 4308);
            this.field_y = true;
          }
          var13 = (fsa) (this.field_h);
          if (var13 == null) {
            return;
          }
          var7Lifetime4 = var13.a((byte) 110, var13.H(param0 ^ -4445).e(param0 ^ -13502), var13.H(66).d(param0 ^ -4367), var13.H(-128).a((byte) 55), var13.H(-120).c(-125)) ? 1 : 0;
          if (var7Lifetime4 != 0) {
            if (this.field_w) {
              if (var7Lifetime4 == 0 &&
                this.field_w) {
                this.field_w = false;
              }
              return;
            }
            var5.a(new fm(81, this.b((byte) 56), this.c((byte) 99), this.e((byte) -117)), -58);
            this.field_w = true;
          }
          if (var7Lifetime4 != 0) {
            return;
          }
          if (!this.field_w) {
            return;
          }
          this.field_w = false;
          return;
        }
        if (this.field_z == 20) {
          var5.a(new fm(77, this.b((byte) 49), this.c((byte) 108), this.e((byte) -87)), -58);
          this.field_z = 0;
          if (!this.field_y &&
            this.field_h.j(-1)) {
            var5.a(new fm(79, this.b((byte) -112), this.c((byte) 121), this.e((byte) -119)), param0 + 4308);
            this.field_y = true;
          }
          var11 = (fsa) (this.field_h);
          if (var11 == null) {
            return;
          }
          var7Lifetime1 = var11.a((byte) 110, var11.H(param0 ^ -4445).e(param0 ^ -13502), var11.H(66).d(param0 ^ -4367), var11.H(-128).a((byte) 55), var11.H(-120).c(-125)) ? 1 : 0;
          if (var7Lifetime1 != 0) {
            if (!this.field_w) {
              var5.a(new fm(81, this.b((byte) 56), this.c((byte) 99), this.e((byte) -117)), -58);
              this.field_w = true;
            }
            if (var7Lifetime1 == 0 &&
              this.field_w) {
              this.field_w = false;
            }
          } else {
            if (this.field_w) {
              this.field_w = false;
            }
          }
          return;
        }
        this.field_z = this.field_z + 1;
        if (this.field_y) {
          var9 = (fsa) (this.field_h);
          if (var9 == null) {
            return;
          }
          var7Lifetime2 = var9.a((byte) 110, var9.H(param0 ^ -4445).e(param0 ^ -13502), var9.H(66).d(param0 ^ -4367), var9.H(-128).a((byte) 55), var9.H(-120).c(-125)) ? 1 : 0;
          if (var7Lifetime2 != 0) {
            if (!this.field_w) {
              var5.a(new fm(81, this.b((byte) 56), this.c((byte) 99), this.e((byte) -117)), -58);
              this.field_w = true;
            }
            if (var7Lifetime2 == 0 &&
              this.field_w) {
              this.field_w = false;
            }
          } else {
            if (this.field_w) {
              this.field_w = false;
            }
          }
          return;
        }
        if (this.field_h.j(-1)) {
          var5.a(new fm(79, this.b((byte) -112), this.c((byte) 121), this.e((byte) -119)), param0 + 4308);
          this.field_y = true;
        }
        var10 = (fsa) (this.field_h);
        if (var10 == null) {
          return;
        }
        var7Lifetime3 = var10.a((byte) 110, var10.H(param0 ^ -4445).e(param0 ^ -13502), var10.H(66).d(param0 ^ -4367), var10.H(-128).a((byte) 55), var10.H(-120).c(-125)) ? 1 : 0;
        if (var7Lifetime3 == 0) {
          if (this.field_w) {
            this.field_w = false;
          }
        } else {
          if (!this.field_w) {
            var5.a(new fm(81, this.b((byte) 56), this.c((byte) 99), this.e((byte) -117)), -58);
            this.field_w = true;
          }
          if (var7Lifetime3 == 0 &&
            this.field_w) {
            this.field_w = false;
          }
        }
        return;
    }

    private final int i(int param0) {
        if (param0 == -6874) {
          return dfa.a(-this.field_h.g(param0 - 18913) >> 2, 2048, param0 ^ -6797);
        }
        return -83;
    }

    final void b(int param0, int param1) {
        this.field_x = param1;
        if (param0 < 28) {
          this.field_z = -120;
        }
    }

    aka(int param0) {
        super(param0);
        this.field_w = false;
        this.field_z = 0;
        this.field_y = false;
    }

    final void a(byte param0, kh param1) {
        try {
          super.a((byte) 98, param1);
          param1.a((byte) -5, this.field_x, 4);
          int var3_int = 102 % ((param0 + 8) / 40);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "aka.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_A = "Blade Launcher";
    }
}
