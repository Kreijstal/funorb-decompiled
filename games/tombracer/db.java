/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db extends vg implements fo, ffa, gma, noa, qn {
    private int field_n;
    private la field_m;
    private int field_p;
    static vna field_f;
    static mp field_h;
    static String field_j;
    static int field_l;
    private int field_r;
    private vna field_k;
    private int field_g;
    private int field_q;
    static jea field_s;
    private bca field_o;
    private boolean field_i;

    public final int a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        if (!param0) {
            this.g(25);
            return 0;
        }
        return 0;
    }

    private final void t(int param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        dg var4 = (dg) ((Object) this.field_k.f(-80));
        while (var4 != null) {
            var4.i((byte) -30);
            var4 = (dg) ((Object) this.field_k.e(param0 ^ 112));
        }
        if (param0 != 0) {
            this.field_o = (bca) null;
        }
        this.field_k.d(param0 + 8);
    }

    public final int c(int param0) {
        if (param0 >= -11) {
            this.j(-31);
        }
        return this.field_g;
    }

    public final boolean a(int param0, gma param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 < -77) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("db.OD(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    final void a(uw param0, byte param1) {
        int var3_int = 0;
        dg var4 = null;
        int var5 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = -41 % ((param1 - 62) / 37);
              if (!this.r(24269)) {
                break L1;
              } else {
                param0.a(9, (fo) (this), (byte) -33);
                break L1;
              }
            }
            var4 = (dg) ((Object) this.field_k.f(-80));
            L2: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                var4.a(param0, 111);
                var4 = (dg) ((Object) this.field_k.e(124));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("db.Q(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
    }

    public final int g(byte param0) {
        if (param0 != 115) {
            this.g(-111);
            return 0;
        }
        return 0;
    }

    public final boolean a(int param0) {
        int var2 = -91 / ((param0 - 6) / 46);
        return true;
    }

    public final int i(int param0) {
        if (param0 <= 90) {
            field_s = (jea) null;
        }
        return this.field_p;
    }

    public final void a(int param0, iq param1) {
        try {
            if (param0 < 103) {
                this.a((byte) -57);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "db.DB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void f(int param0) {
        if (param0 != -4366) {
            ep var3 = (ep) null;
            this.a((up) null, (ep) null, 117);
        }
    }

    public final boolean b(boolean param0) {
        if (!param0) {
            this.field_m = (la) null;
            return false;
        }
        return false;
    }

    public final int k(int param0) {
        if (param0 != -21185) {
            gma var3 = (gma) null;
            this.a(69, (gma) null);
        }
        return this.field_r;
    }

    public final int a(byte param0) {
        if (param0 != 55) {
            this.i(29);
        }
        return this.field_q;
    }

    public final boolean a(int param0, boolean param1, int param2, int param3, int param4, int param5) {
        if (param0 <= 68) {
            field_h = (mp) null;
            return false;
        }
        return false;
    }

    public final boolean l(int param0) {
        dg var3;
        int stackIn_6_0 = 0;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            var3 = (dg) null;
            this.a((dg) null, false);
            break L0;
          }
        }
        L1: {
          L2: {
            if (!this.field_m.o((byte) -82)) {
              break L2;
            } else {
              if (this.b(this.field_m.i(param0 ^ 6029), 1569)) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final void a(int param0, la param1) {
        int var4 = 0;
        dg var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              param1.field_u.a((ffa) (this), (byte) 105);
              if (param0 <= -74) {
                break L1;
              } else {
                this.field_k = (vna) null;
                break L1;
              }
            }
            this.field_p = param1.m((byte) -86) / 2 - (this.field_p - param1.m((byte) -86) / 2);
            param1.field_u.b((ffa) (this), 7073);
            var5 = (dg) ((Object) this.field_k.f(-80));
            L2: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                var5.h(61);
                var5 = (dg) ((Object) this.field_k.e(108));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("db.AA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    public final int a(up param0, ep param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 < -97) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -79;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("db.SD(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public final boolean h(int param0) {
        if (param0 != 18407) {
            this.field_n = -92;
            return false;
        }
        return false;
    }

    public final boolean a(int param0, gma param1, int param2, pc param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                field_s = (jea) null;
                break L1;
              }
            }
            var5_int = eha.a(this.field_g, 12, this.field_r, this.field_q, param3, this.field_p, 2);
            if (0 != (var5_int ^ -1)) {
              var6 = wm.a(4096, var5_int, param0 + -59);
              param3.a(var6, (byte) 47);
              stackIn_6_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("db.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    public final boolean a(int param0, gma param1, int param2, int param3, int param4, ffa param5, int param6, int param7) {
        RuntimeException var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this == param1) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (4 < param7) {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param2 > 55) {
                  stackIn_12_0 = this.a((byte) 110, param4, param6, param0, param3);
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_10_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var9);

            stackIn_15_1 = new StringBuilder().append("db.IC(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L1;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0 != 0;
            } else {
              return stackIn_12_0;
            }
          }
        }
    }

    public final boolean a(gma param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 0) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              this.j(-123);
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("db.OA(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final void c(boolean param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        dg var4 = (dg) ((Object) this.field_k.f(-80));
        while (var4 != null) {
            var4.e(-41);
            var4 = (dg) ((Object) this.field_k.e(118));
        }
        if (!param0) {
            this.field_i = false;
        }
    }

    final void a(boolean param0, kh param1) {
        dg var5 = null;
        int var4 = TombRacer.field_G ? 1 : 0;
        try {
            param1.a((byte) -1, this.field_p / 1048576, 7);
            param1.a((byte) -8, this.field_r / 1048576, 7);
            param1.a((byte) 74, this.field_g / 2097152, 6);
            param1.a((byte) -7, this.field_q / 2097152, 6);
            if (!param0) {
                this.field_i = false;
            }
            if ((this.field_m.field_E ^ -1) <= -10) {
                param1.a((byte) -36, this.field_k.a((byte) -16), 2);
                var5 = (dg) ((Object) this.field_k.f(-80));
                while (var5 != null) {
                    rm.field_a.a(15682, param1, var5);
                    var5 = (dg) ((Object) this.field_k.e(127));
                }
            }
            this.field_o.a((byte) -79, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "db.S(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final int b(int param0) {
        int var2 = -5 / ((1 - param0) / 45);
        return 0;
    }

    private final void n(int param0) {
        this.t(0);
        if (param0 != -8195) {
            return;
        }
        this.a(rm.field_a.a((gr) null, (gma) (this), -116), true);
    }

    public final int e(byte param0) {
        if (param0 > -86) {
            field_f = (vna) null;
            return 0;
        }
        return 0;
    }

    public final int a(up param0, int param1, pc param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 12) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -101;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("db.ED(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void a(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        L0: {
          this.field_m.field_u.a((ffa) (this), (byte) 104);
          this.field_p = this.field_p + param1;
          this.field_r = this.field_r + param1;
          var3 = -(this.field_g / 2) + this.field_p;
          var4 = -(this.field_q / 2) + this.field_r;
          if (param0 < -122) {
            break L0;
          } else {
            this.c((byte) 50);
            break L0;
          }
        }
        L1: {
          var5 = this.field_g / 2 + this.field_p;
          var6 = this.field_q / 2 + this.field_r;
          if (param1 >= var4) {
            var4 = 0;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (var3 > param1) {
            break L2;
          } else {
            var3 = 0;
            break L2;
          }
        }
        L3: {
          var7 = this.field_m.m((byte) -86);
          var8 = this.field_m.s(34);
          if (-param1 + var7 <= var5) {
            var5 = var7;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          this.field_p = (var5 + -var3) / 2 + var3;
          if (var6 < var8 + -param1) {
            break L4;
          } else {
            var6 = var8;
            break L4;
          }
        }
        this.field_q = var6 - var4;
        this.field_r = (var6 + -var4) / 2 + var4;
        this.field_g = -var3 + var5;
        this.field_m.field_u.b((ffa) (this), 7073);
    }

    public static void h(byte param0) {
        field_h = null;
        field_j = null;
        field_s = null;
        if (param0 >= -22) {
            return;
        }
        field_f = null;
    }

    private final boolean r(int param0) {
        if (param0 != 24269) {
            this.a(58, true, 114, 87, -117, -85);
        }
        return this.field_m.o((byte) -82);
    }

    public final int a(boolean param0) {
        if (!param0) {
            this.field_q = -83;
        }
        return 5 + 5 * this.field_n;
    }

    public final int e(int param0) {
        if (param0 != 9648) {
            return -56;
        }
        return this.field_r;
    }

    public final int g(int param0) {
        if (param0 != -25787) {
            this.a(82, -58);
        }
        return 0;
    }

    public final int b(byte param0) {
        int var2 = -80 % ((param0 - -23) / 53);
        return this.field_p;
    }

    public final la f(byte param0) {
        int var2 = 110 / ((param0 - 0) / 61);
        return this.field_m;
    }

    public final boolean a(byte param0, int param1, int param2, int param3, int param4) {
        if (param0 != 110) {
            return false;
        }
        return io.a(param4, this.e(9648), (byte) -80, param3, this.d(3), param1, this.field_q, this.field_g, param2);
    }

    final void s(int param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        dg var2 = (dg) ((Object) this.field_k.f(-80));
        if (param0 != 0) {
            this.field_p = 88;
        }
        while (var2 != null) {
            var2.d(-1);
            var2 = (dg) ((Object) this.field_k.e(124));
        }
    }

    public final boolean d(byte param0) {
        if (param0 != 48) {
            field_h = (mp) null;
            return false;
        }
        return false;
    }

    final void a(byte param0, uw param1) {
        int var4 = 0;
        dg var5 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (this.r(24269)) {
                param1.a((byte) -106, 9, (fo) (this));
                break L1;
              } else {
                break L1;
              }
            }
            if (param0 > 6) {
              var5 = (dg) ((Object) this.field_k.f(-80));
              L2: while (true) {
                if (var5 == null) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var5.b(0, param1);
                  var5 = (dg) ((Object) this.field_k.e(112));
                  continue L2;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("db.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final boolean a(byte param0, boolean param1) {
        if (param0 != -55) {
            dg var4 = (dg) null;
            this.a((dg) null, true);
        }
        return false;
    }

    public final int a(up param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3 == 0) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              field_l = 26;
              return 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7);

            stackIn_6_1 = new StringBuilder().append("db.WC(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_3_0;
    }

    final boolean b(int param0, int param1) {
        if (param1 != 1569) {
            gma var4 = (gma) null;
            this.a((gma) null, -24);
        }
        return this.field_o.a(param0, 14530);
    }

    final void m(int param0) {
        if (!(!this.field_i)) {
            return;
        }
        this.field_i = true;
        this.t(param0);
    }

    private final void a(dg param0, boolean param1) {
        if (!(param0 != null)) {
            return;
        }
        try {
            this.field_k.b((byte) -73, param0);
            if (!param1) {
                this.field_r = -69;
            }
            param0.a((gr) null, (gma) (this), (byte) 36);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "db.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final boolean j(int param0) {
        if (param0 != -1) {
            return false;
        }
        return false;
    }

    public final int c(byte param0) {
        if (param0 < 91) {
            this.field_g = -15;
        }
        return this.field_r;
    }

    public final int d(int param0) {
        if (param0 != 3) {
            return -6;
        }
        return this.field_p;
    }

    db(la param0, kh param1) {
        int fieldTemp$0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        dg var5 = null;
        this.field_k = new vna();
        this.field_o = new bca();
        this.field_i = false;
        try {
          L0: {
            L1: {
              this.field_m = param0;
              if (-21 > (param0.field_E ^ -1)) {
                this.field_p = 1048576 * param1.b((byte) 44, 7);
                this.field_r = param1.b((byte) 44, 7) * 1048576;
                this.field_g = param1.b((byte) 44, 6) * 2097152;
                this.field_q = param1.b((byte) 44, 6) * 2097152;
                break L1;
              } else {
                this.field_p = param1.b((byte) 44, 12) << 1304186320;
                this.field_r = param1.b((byte) 44, 12) << -1070925264;
                this.field_q = param1.b((byte) 44, 10) << 475970320;
                this.field_g = param1.b((byte) 44, 10) << 1636956496;
                break L1;
              }
            }
            L2: {
              if (8 >= param0.field_E) {
                this.n(-8195);
                break L2;
              } else {
                var3_int = param1.b((byte) 44, 2);
                var4 = 0;
                L3: while (true) {
                  if (var4 >= var3_int) {
                    break L2;
                  } else {
                    var5 = rm.field_a.a(param0, param1, false);
                    this.a(var5, true);
                    var4++;
                    continue L3;
                  }
                }
              }
            }
            this.field_o = new bca(param0.field_E, param1);
            fieldTemp$0 = fi.field_c;
            fi.field_c = fi.field_c + 1;
            this.field_n = fieldTemp$0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("db.<init>(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ')');
        }
    }

    static {
        field_f = null;
        field_j = "Unable to add friend - system busy";
        field_l = 5;
        field_h = new mp();
    }
}
