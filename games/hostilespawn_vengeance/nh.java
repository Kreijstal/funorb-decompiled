/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh extends fc {
    private int field_J;
    static int[] field_O;
    private boolean field_K;
    static int field_M;
    static oc field_E;
    private String field_B;
    static uj field_L;
    static int field_H;
    private vm field_N;
    private int field_I;
    private int field_F;
    static we field_P;
    static bd field_C;

    final String e(int param0) {
        int var2 = this.field_A.field_u ? 1 : 0;
        this.field_A.field_u = this.field_u;
        String var3 = this.field_A.e((int) (char)param0);
        this.field_A.field_u = var2 != 0 ? true : false;
        return var3;
    }

    final static double a(int param0, p param1, p param2) {
        RuntimeException var3 = null;
        double stackIn_3_0 = 0.0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -12149) {
            field_O = (int[]) null;
          }
          stackIn_3_0 = 128.0 * Math.atan2(-param2.field_l.field_f + ((double)(-param2.field_j.field_e) + ((double)param1.field_j.field_e + param1.field_l.field_f)), (double)(-param2.field_j.field_g) + (param1.field_l.field_a + (double)param1.field_j.field_g) - param2.field_l.field_a) / 3.141592653589793;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("nh.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var7 = 0;
        int var5 = param1 + this.field_v;
        int var6 = this.field_m + param0;
        super.a(param0, param1, (byte) 70, param3);
        if (param3 != 0) {
          return;
        }
        if (param2 > 42) {
          var7 = !this.field_K ? 0 : -(this.field_I * 2) + (this.field_s - this.field_J);
          this.field_N.a(this.field_B, this.field_I + var5 + var7, this.field_I + var6, -this.field_I + this.field_J, -(this.field_I * 2) + this.field_x, this.field_F, -1, !this.field_K ? 2 : 0, 1, this.field_N.field_y);
          return;
        }
    }

    final static void a(boolean param0, byte param1) {
        if (param1 > -63) {
          field_M = 78;
          if (wa.field_q != null) {
            tb.f((byte) -122);
            return;
          }
          cn.a(param0, (byte) 91);
          return;
        }
        if (wa.field_q != null) {
          tb.f((byte) -122);
          return;
        }
        cn.a(param0, (byte) 91);
    }

    final static void a(oj param0, int param1) {
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        oj var4 = null;
        var3 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (param0 == null) {
            return;
          }
          L0: {
            if (0 < param0.field_I) {
              var2_int = param0.field_i;
              if (var2_int != 1 &&
                18 != var2_int &&
                19 != var2_int &&
                var2_int != 3 &&
                var2_int != 4 &&
                var2_int != 5 &&
                6 != var2_int &&
                var2_int != 8 &&
                10 != var2_int &&
                var2_int != 11 &&
                var2_int != 12 &&
                var2_int != 20 &&
                var2_int != 21) {
              }
            } else {
              var2_int = param0.field_i;
              if (var2_int != 1 &&
                var2_int != 24) {
                switch (var2_int) {
                  case 225:
                    jh.a(3 * uh.field_i / 2, (byte) 88, 9, jc.field_c, 3);
                    break L0;
                  case 18:
                    jh.a(uh.field_i * 3 / 2, (byte) 126, 21, jc.field_c, 3);
                    break L0;
                  case 19:
                    jh.a(uh.field_i * 3 / 2, (byte) 118, 26, jc.field_c, 1);
                    break L0;
                  case 27:
                    break L0;
                  case 8:
                    jh.a(3 * uh.field_i / 2, (byte) 55, 40, jc.field_c, 1);
                    break L0;
                  case 3:
                    tk.a(7, jc.field_c, 55, true);
                    break L0;
                  case 4:
                    if (1 != uj.field_l) {
                      break L0;
                    }
                    eh.field_c.a(em.field_a[22], (int)(20.0 * Math.random() - 10.0) + 100, uh.field_i);
                    break L0;
                  case 21:
                  default:
                    if (var2_int != 5 &&
                      var2_int != 6) {
                      if (var2_int != 10 &&
                        var2_int != 11 &&
                        var2_int != 12 &&
                        var2_int != 20) {
                        if (((21 == var2_int)) &&
                          ((uj.field_l == 1)) &&
                          (!(!ej.d((byte) 107)))) {
                          eh.field_c.a(lm.field_A[14], 100, uh.field_i / 3);
                        }
                      } else {
                        if (((uj.field_l == 1)) &&
                          (!(!ej.d((byte) 102)))) {
                          eh.field_c.a(lm.field_A[17], 100, uh.field_i);
                        }
                      }
                      break L0;
                    }
                    if (1 != uj.field_l) {
                      break L0;
                    }
                    if (!ej.d((byte) 61)) {
                      break L0;
                    }
                    eh.field_c.a(lm.field_A[17], 100 + (int)(20.0 * Math.random() - 10.0), uh.field_i / 3);
                    break L0;
                }
              }
              jh.a(3 * uh.field_i / 2, (byte) 88, 9, jc.field_c, 3);
            }
          }
          if (param1 == -29966) {
            return;
          }
          var4 = (oj) null;
          nh.a((oj) null, -68);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_74_0 = var2;
          stackIn_74_1 = new StringBuilder().append("nh.D(");
          if (param0 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_74_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param1).append(')').toString());
        }
    }

    nh(int param0, int param1, int param2, int param3, ag param4, boolean param5, int param6, int param7, vm param8, int param9, String param10) {
        super(param0, param1, param2, param3, (nn) null, (mh) null);
        boolean stackIn_4_1 = false;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        try {
          this.field_J = param6;
          this.field_F = param9;
          this.field_B = param10;
          stackIn_4_1 = (param5);
          this.field_K = stackIn_4_1;
          this.field_A = param4;
          this.field_N = param8;
          this.field_I = param7;
          var12_int = this.field_J - this.field_I;
          var13 = this.field_N.b(param10, var12_int, this.field_N.field_y) + 2 * this.field_I;
          if (param3 < var13) {
            this.a(param2, param1, 0, param0, var13);
          } else {
            var13 = param3;
          }
          if (!this.field_K) {
            stackIn_10_0 = this.field_J + 2 * this.field_I;
          } else {
            stackIn_10_0 = 0;
          }
          var14 = stackIn_10_0;
          this.field_A.a(-(this.field_I * 3) + (-this.field_J + param2), this.field_I + (var13 - param3 >> 1), 0, var14, param3 - 2 * this.field_I);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_14_0 = var12;
          stackIn_14_1 = new StringBuilder().append("nh.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    public static void k(int param0) {
        field_P = null;
        field_C = null;
        field_E = null;
        if (param0 != 0) {
          return;
        }
        field_L = null;
        field_O = null;
    }

    static {
        field_M = 0;
        field_H = 0;
        field_E = new oc(-1, -1);
        field_P = new we(field_E);
    }
}
