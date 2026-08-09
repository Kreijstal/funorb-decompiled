/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dt {
    private boolean field_h;
    private int[] field_j;
    private int field_e;
    hca field_g;
    eha field_i;
    private boolean field_a;
    la[] field_b;
    private int field_l;
    private boolean field_k;
    int field_c;
    static String field_n;
    private boolean field_f;
    private int field_m;
    private int field_d;

    private final la a(byte param0, la param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        la stackIn_2_0 = null;
        la stackIn_6_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 > 68) {
              var3_int = param1.c(115);
              if (var3_int < this.field_b.length + -1) {
                stackIn_6_0 = this.field_b[1 + var3_int];
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            } else {
              stackIn_2_0 = (la) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("dt.CA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_6_0;
        }
    }

    private final boolean c(int param0, int param1) {
        if (param1 != -1) {
            this.field_b = (la[]) null;
            return -1 != this.field_j[param0] ? true : false;
        }
        return -1 != this.field_j[param0] ? true : false;
    }

    final void d(int param0, int param1) {
        int var3 = -110 % ((param0 - 73) / 33);
    }

    final void a(la param0, int param1) {
        eha var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              if (param1 == -9774) {
                break L1;
              } else {
                this.a(false);
                break L1;
              }
            }
            L2: {
              this.field_f = false;
              this.field_h = true;
              var3 = this.m(9262);
              if (var3 != null) {
                var3.a(35, param0);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3_ref);

            stackIn_8_1 = new StringBuilder().append("dt.A(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final boolean f(int param0, int param1) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        if (param1 == 10915) {
          L0: {
            if (this.c(param0, -1)) {
              stackIn_12_0 = 1;
              break L0;
            } else {
              if (!this.field_b[this.field_g.r(param1 ^ -10957)].b(param0, (byte) -44)) {
                stackIn_12_0 = 0;
                break L0;
              } else {
                return true;
              }
            }
          }
          return stackIn_12_0 != 0;
        } else {
          this.b(false);
          if (!this.c(param0, -1)) {
            L1: {
              if (!this.field_b[this.field_g.r(param1 ^ -10957)].b(param0, (byte) -44)) {
                stackIn_6_0 = 0;
                break L1;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
            return stackIn_6_0 != 0;
          } else {
            return true;
          }
        }
    }

    final int a(boolean param0) {
        if (!(!this.field_a)) {
            return 0;
        }
        if (!param0) {
            return -119;
        }
        return this.field_g.f((byte) -88).field_a;
    }

    final int l(int param0) {
        if (param0 > -2) {
            return 8;
        }
        return this.field_m;
    }

    final boolean g(int param0) {
        if (param0 < 67) {
            this.j(84);
            return this.field_f;
        }
        return this.field_f;
    }

    final boolean b(int param0) {
        if (param0 != 0) {
            field_n = (String) null;
            return this.field_a;
        }
        return this.field_a;
    }

    final boolean i(int param0) {
        if (param0 != -14886) {
            this.field_k = true;
            return this.field_h;
        }
        return this.field_h;
    }

    final void a(int param0, boolean param1) {
        this.field_a = param1 ? true : false;
        if (param0 <= 35) {
            this.field_l = 58;
        }
    }

    final void a(hca param0, int param1, int param2, int param3) {
        eha var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          L0: {
            L1: {
              var5 = this.m(9262);
              if (var5 == null) {
                break L1;
              } else {
                var5.a(15, param0, param1, param0.f((byte) -96), this.field_c, param3);
                break L1;
              }
            }
            L2: {
              if (param2 == 1) {
                break L2;
              } else {
                this.d(18, 84);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5_ref);

            stackIn_7_1 = new StringBuilder().append("dt.IA(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void n(int param0) {
        if (param0 != 0) {
            dt.n(-118);
            field_n = null;
            return;
        }
        field_n = null;
    }

    final boolean e(int param0) {
        if (param0 != -31170) {
            return false;
        }
        return this.field_k;
    }

    final boolean j(int param0) {
        if (param0 != 0) {
            this.field_m = 36;
            return this.field_a;
        }
        return this.field_a;
    }

    final int b(boolean param0) {
        if (param0) {
            field_n = (String) null;
            return this.field_l;
        }
        return this.field_l;
    }

    final boolean d(int param0) {
        if (param0 != 28091) {
            return true;
        }
        return (this.field_d ^ -1) < -1 ? true : false;
    }

    final void a(int param0, int param1) {
        la discarded$2 = null;
        if (param0 != -1) {
            la var4 = (la) null;
            discarded$2 = this.a((byte) -105, (la) null);
            if (this.field_a) {
                return;
            }
            this.field_f = this.field_g.d((byte) -95, 3);
            this.field_h = false;
            this.field_g.f((byte) -64).d(param1, 0);
            if (!(!this.field_a)) {
                return;
            }
            this.field_c = this.field_c + 1;
            return;
        }
        if (this.field_a) {
            return;
        }
        this.field_f = this.field_g.d((byte) -95, 3);
        this.field_h = false;
        this.field_g.f((byte) -64).d(param1, 0);
        if (!(!this.field_a)) {
            return;
        }
        this.field_c = this.field_c + 1;
    }

    final void a(int param0, int param1, int param2) {
        this.field_j[param0] = param1;
        if (param2 >= -28) {
            this.field_g = (hca) null;
        }
    }

    final void c(int param0) {
        la var2;
        la var3;
        la var5;
        eha var6;
        eha var7;
        var2 = this.a((byte) 123);
        if (param0 == -1) {
          L0: {
            var2.g(58);
            var3 = this.a((byte) 104, var2);
            if (!this.field_g.l(false)) {
              break L0;
            } else {
              if (var3 != null) {
                break L0;
              } else {
                var3 = this.a(param0 + -114);
                break L0;
              }
            }
          }
          var7 = this.m(param0 + 9263);
          if (var7 == null) {
            if (var3 == null) {
              this.a(89, true);
              return;
            } else {
              var3.i((byte) -98);
              return;
            }
          } else {
            var7.a(this.field_g, var2, false);
            if (var3 == null) {
              this.a(89, true);
              return;
            } else {
              var3.i((byte) -98);
              return;
            }
          }
        } else {
          L1: {
            var5 = (la) null;
            this.a((la) null, -52);
            var2.g(58);
            var3 = this.a((byte) 104, var2);
            if (!this.field_g.l(false)) {
              break L1;
            } else {
              if (var3 != null) {
                break L1;
              } else {
                var3 = this.a(param0 + -114);
                break L1;
              }
            }
          }
          var6 = this.m(param0 + 9263);
          if (var6 != null) {
            var6.a(this.field_g, var2, false);
            if (var3 == null) {
              this.a(89, true);
              return;
            } else {
              var3.i((byte) -98);
              return;
            }
          } else {
            L2: {
              if (var3 == null) {
                this.a(89, true);
                break L2;
              } else {
                var3.i((byte) -98);
                break L2;
              }
            }
            return;
          }
        }
    }

    final void a(iq param0, int param1) {
        int discarded$1 = 0;
        la[] var3 = null;
        int var4 = 0;
        la var5 = null;
        int var6 = 0;
        la[] var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var7 = this.field_b;
              var3 = var7;
              if (param1 == -1) {
                break L1;
              } else {
                discarded$1 = this.e(41, -81);
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var7.length <= var4) {
                break L0;
              } else {
                L3: {
                  var5 = var7[var4];
                  if (var5 != null) {
                    var5.a(param0, param1 ^ -6);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3_ref);

            stackIn_12_1 = new StringBuilder().append("dt.P(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
    }

    final void a(hca param0, int param1) {
        eha var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            var3 = this.m(9262);
            if (param1 == -1) {
              L1: {
                if (var3 != null) {
                  var3.a(15, param0, 0, param0.f((byte) -118), this.field_c, 2);
                  break L1;
                } else {
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3_ref);

            stackIn_8_1 = new StringBuilder().append("dt.B(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void b(byte param0) {
        System.out.println("DUMPING STATE on tick " + this.field_c);
        System.out.println("Player: " + this.field_g.toString());
        if (param0 != 114) {
            this.field_k = false;
            this.field_g.f((byte) 65).d(true);
            return;
        }
        this.field_g.f((byte) 65).d(true);
    }

    final boolean k(int param0) {
        if (param0 != -19271) {
            return false;
        }
        if (this.field_a) {
            return false;
        }
        if (this.field_k) {
            return false;
        }
        return true;
    }

    private final int e(int param0, int param1) {
        if (param1 != 0) {
            this.b(-8);
            return this.field_j[param0];
        }
        return this.field_j[param0];
    }

    final la a(int param0) {
        if (param0 >= -22) {
            this.b(-15);
            return this.field_b[0];
        }
        return this.field_b[0];
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param2 >= -86) {
            iq var6 = (iq) null;
            this.a((iq) null, 103);
            this.field_b[param3].b(false, param1, param0);
            return;
        }
        this.field_b[param3].b(false, param1, param0);
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 > -11) {
            this.a(96, 125);
            this.field_b[param2].c(-22490, param1);
            return;
        }
        this.field_b[param2].c(-22490, param1);
    }

    final int b(boolean param0, int param1) {
        if (param0) {
            this.a((byte) 29, -34, 71);
            return iia.d(this.e(param1, 0), this.field_b[this.field_g.r(-101)].a(-121, param1), 2);
        }
        return iia.d(this.e(param1, 0), this.field_b[this.field_g.r(-101)].a(-121, param1), 2);
    }

    final boolean h(int param0) {
        if (param0 < 118) {
            this.field_h = true;
            return !this.field_a ? true : false;
        }
        return !this.field_a ? true : false;
    }

    final la a(byte param0) {
        int var2 = -127 / ((param0 - 64) / 59);
        return this.field_b[this.field_g.r(-108)];
    }

    final int f(int param0) {
        int var2 = -97 % ((34 - param0) / 56);
        return this.field_b.length;
    }

    final void a(int param0, int param1, la param2) {
        try {
            param2.a(param1, false);
            if (param0 != -28088) {
                this.d(41);
            }
            this.field_b[param1] = param2;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "dt.V(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final eha m(int param0) {
        if (param0 != 9262) {
            this.d(36);
            return this.field_i;
        }
        return this.field_i;
    }

    final void b(int param0, int param1) {
        this.field_j[param0] = param1;
    }

    final la a(boolean param0, int param1) {
        if (!param0) {
            return (la) null;
        }
        return this.field_b[param1];
    }

    dt(eha param0, hca param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        this.field_j = new int[9];
        try {
          L0: {
            this.field_e = param2;
            this.field_g = param1;
            this.field_d = param3;
            this.field_i = param0;
            this.field_m = this.field_d + this.field_e;
            this.field_b = new la[this.field_m];
            var5_int = 0;
            L1: while (true) {
              if (var5_int >= this.field_j.length) {
                break L0;
              } else {
                this.field_j[var5_int] = -1;
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("dt.<init>(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_n = "Please wait...";
    }
}
