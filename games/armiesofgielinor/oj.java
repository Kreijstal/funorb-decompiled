/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class oj extends tc {
    static int field_k;
    static String field_p;
    static String field_u;
    static at field_r;
    static int[] field_n;
    boolean field_o;
    static int field_v;
    jd field_w;
    static String field_x;
    static int[] field_t;
    int field_m;
    static int[] field_q;
    int field_s;
    static String field_l;

    abstract void a(ha param0, int param1);

    final void a(int param0) {
        this.field_o = false;
        if (param0 >= -30) {
          return;
        }
    }

    private final boolean e(int param0) {
        boolean stackIn_43_0 = false;
        int var2;
        int var3;
        bv var4;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 != 1023) {
          var4 = (bv) null;
          oj.a(-38, (bv) null);
        }
        var2 = this.field_m;
        if (0 == var2) {
          return true;
        }
        L1: {
          if (var2 != 1 &&
            var2 != 2) {
            if (var2 == 23) {
              return false;
            }
            if (var2 != 3 &&
              4 != var2 &&
              5 != var2) {
              switch (var2) {
                case 6:
                  return true;
                case 21:
                  return true;
                case 7:
                  return true;
                case 8:
                  return true;
                case 9:
                  return true;
                case 10:
                  return false;
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 22:
                case -1:
                default:
                  if (var2 != 11 &&
                    var2 != 12 &&
                    13 != var2) {
                    switch (var2) {
                      case 14:
                        return true;
                      case 15:
                        return true;
                      case 16:
                        return true;
                      case 17:
                        return true;
                      case 18:
                        return true;
                      case 22:
                      case -1:
                      default:
                        if (var2 != 19 &&
                          var2 != 20) {
                          if (22 == var2) {
                            return true;
                          }
                          if (var2 == -1) {
                            return false;
                          }
                          if (25 != var2 &&
                            var2 != 24 &&
                            27 != var2) {
                            stackIn_43_0 = false;
                            break L1;
                          }
                          return true;
                        }
                        return false;
                    }
                  }
                  return true;
              }
            }
            return true;
          }
          stackIn_43_0 = true;
        }
        return stackIn_43_0;
    }

    abstract String a(byte param0, boolean param1);

    final boolean a(byte param0, ic param1, at param2, boolean param3) {
        vb var5 = null;
        RuntimeException var5_ref = null;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -39) {
            return false;
          }
          var5 = cp.a(param1, 10120, param1.field_xb, this.e(1023) & param3, this, param1.field_gb);
          if (var5 != null) {
            param2.a((byte) -119, (tc) (var5));
          }
          if (var5 != null) {
            stackIn_10_0 = var5.field_w;
            return stackIn_10_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_13_0 = var5_ref;
          stackIn_13_1 = new StringBuilder().append("oj.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    final void c(byte param0) {
        this.field_s = this.field_s - 1;
        if (this.field_s > 0) {
          return;
        }
        this.field_o = true;
        if (null != this.field_w &&
          this.field_m != 19) {
          this.field_w.field_u = false;
          this.field_w.field_z = 0;
        }
        if (param0 > -46) {
          this.c((byte) -28);
        }
    }

    final void a(jd param0, int param1) {
        RuntimeException var3 = null;
        jd var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 12) {
            var4 = (jd) null;
            this.a((jd) null, -102);
          }
          param0.field_u = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("oj.J(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_r = null;
        field_t = null;
        field_u = null;
        field_q = null;
        field_x = null;
        if (param0 != -103) {
          return;
        }
        field_p = null;
        field_l = null;
        field_n = null;
    }

    final boolean a(int param0, int param1, ic param2, at param3, int param4) {
        vb var6 = null;
        RuntimeException var6_ref = null;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = ub.a(this, param2.field_xb, this.e(param1 + 1008), param0, param2, 17, param4, param2.field_gb);
          if (var6 != null) {
            param3.a((byte) -119, (tc) (var6));
          }
          if (param1 != 15) {
            return true;
          }
          if (var6 != null) {
            stackIn_9_0 = var6.field_w;
            return stackIn_9_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_12_0 = var6_ref;
          stackIn_12_1 = new StringBuilder().append("oj.Q(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(')').toString());
        }
    }

    abstract boolean a(at param0, byte param1, ic param2);

    final static pu a(int param0, bv param1) {
        int var8 = 0;
        pu stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        pu var6 = null;
        int var7 = 0;
        int var9 = 0;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          var2_int = param1.g(-113, 8);
          if (var2_int > 0) {
            throw new IllegalStateException("" + var2_int);
          }
          var3 = vq.a(param1, -2) ? 1 : 0;
          var5 = 1 / ((param0 - 61) / 50);
          var4 = vq.a(param1, -2) ? 1 : 0;
          var6 = new pu();
          var6.field_O = (short)param1.g(61, 16);
          var6.field_z = to.a(var6.field_z, 16, param1, 10064);
          var6.field_y = to.a(var6.field_y, 16, param1, 10064);
          var6.field_o = to.a(var6.field_o, 16, param1, 10064);
          var6.field_q = (short)param1.g(107, 16);
          var6.field_c = to.a(var6.field_c, 16, param1, 10064);
          var6.field_j = to.a(var6.field_j, 16, param1, 10064);
          var6.field_e = to.a(var6.field_e, 16, param1, 10064);
          if (var3 != 0) {
            var6.field_t = (short)param1.g(-100, 16);
            var6.field_l = to.a(var6.field_l, 16, param1, 10064);
            var6.field_f = to.a(var6.field_f, 16, param1, 10064);
            var6.field_x = to.a(var6.field_x, 16, param1, 10064);
            var6.field_w = to.a(var6.field_w, 16, param1, 10064);
            var6.field_Q = to.a(var6.field_Q, 16, param1, 10064);
            var6.field_d = to.a(var6.field_d, 16, param1, 10064);
          }
          if (var4 != 0) {
            param1.g(-102, 16);
            var6.field_r = to.a(var6.field_r, 16, param1, 10064);
            var6.field_s = to.a(var6.field_s, 16, param1, 10064);
            var6.field_A = to.a(var6.field_A, 16, param1, 10064);
            var6.field_i = to.a(var6.field_i, 16, param1, 10064);
            var6.field_b = to.a(var6.field_b, 16, param1, 10064);
          }
          if (vq.a(param1, -2)) {
            var6.field_u = to.a(var6.field_u, 16, param1, 10064);
          }
          if (vq.a(param1, -2)) {
            var6.field_K = kd.a(16, param1, var6.field_K, (byte) -122);
            var7 = 0;
            for (var8 = 0; var8 < var6.field_K.length; var8++) {
              if ((var6.field_K[var8] & 255) > var7) {
                var7 = var6.field_K[var8] & 255;
              }
            }
            if (var7 == 0) {
              var6.field_K = null;
            } else {
              var6.field_E = (byte)(1 + var7);
            }
          }
          stackIn_26_0 = var6;
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_29_0 = var2;
          stackIn_29_1 = new StringBuilder().append("oj.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final void f(int param0) {
        if (this.field_w != null) {
          this.field_w.field_u = false;
          this.field_w.field_z = 0;
        }
        if (param0 != 6) {
          oj.a((byte) 88);
        }
        this.field_s = 0;
        this.field_o = true;
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4) {
        int var5_int = 0;
        int[] stackIn_14_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          if (param3 < 0) {
            return;
          }
          if (!param1) {
            field_r = (at) null;
          }
          param4 += 23;
          for (var5_int = -72; var5_int < 0; var5_int++) {
            var6 = var5_int;
            var7 = var5_int;
            if (var6 < 0) {
              var6 = (var6 << 1) + 256;
            } else {
              var6 = -(var6 << 4) + 256;
            }
            var7 = var7 >> 5;
            var8 = (122 ^ var6) >> 3;
            var9 = 15 & var6 >> 4;
            if (param3 == -1) {
              stackIn_14_0 = dr.field_z;
            } else {
              stackIn_14_0 = dr.field_v[param3];
            }
            var13 = stackIn_14_0;
            var12 = var13;
            var10 = var12;
            qn.a((-6 + param4 << 4) + (var7 * ae.b(param2 + var5_int << 4, 100) >> 12), -4 + (param0 + var5_int) << 4, var8 << 4, var9, var13);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var5), "oj.L(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    protected oj() {
        this.field_s = 1;
    }

    static {
        field_u = "Restart Level";
        field_p = "Allow spectators?";
        field_v = 0;
        field_t = new int[]{2, 17, 18, 36, 37, 38, 6, 5, 50, 9};
        field_x = "Quick Chat Help";
        field_k = 4;
        field_n = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
        field_q = new int[56];
        field_r = new at();
        field_l = "Large screen sizes and high resolutions may cause the game to run slowly. If so, try using lower resolutions or screen sizes.";
    }
}
