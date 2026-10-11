/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class um extends gf {
    static vn field_m;
    static int field_r;
    static int field_p;
    static int field_o;
    static String field_q;
    static int field_l;
    private tk field_n;

    um(tk param0, tk param1) {
        super(param0);
        try {
          this.field_n = param1;
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "um.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final cd a(int param0, String param1) {
        sk var3 = null;
        RuntimeException var3_ref = null;
        cd stackIn_5_0 = null;
        cd stackIn_8_0 = null;
        cd stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_n instanceof wg) {
            var3 = ((wg) ((Object) this.field_n)).a(-10116);
            if (var3 != null &&
              var3.a((byte) -95) != so.field_s) {
              stackIn_5_0 = so.field_u;
              return stackIn_5_0;
            }
          }
          if (param0 < 62) {
            stackIn_8_0 = (cd) null;
            return stackIn_8_0;
          }
          if (!param1.equals(this.field_n.field_m)) {
            stackIn_12_0 = so.field_u;
          } else {
            stackIn_12_0 = so.field_s;
          }
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("um.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final String a(byte param0, String param1) {
        sk var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_9_0 = null;
        String stackIn_11_0 = null;
        String stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -121) {
            field_m = (vn) null;
          }
          if (this.field_n instanceof wg) {
            var3 = ((wg) ((Object) this.field_n)).a(param0 ^ 10235);
            if (var3 != null) {
              if (var3.a((byte) -91) == so.field_s &&
                !param1.equals(this.field_n.field_m)) {
                stackIn_9_0 = hm.field_u;
                return stackIn_9_0;
              }
              stackIn_11_0 = var3.a(param0 ^ -8);
              return stackIn_11_0;
            }
          }
          if (param1.equals(this.field_n.field_m)) {
            return null;
          }
          stackIn_15_0 = hm.field_u;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("um.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static void a(uc param0, int param1, uc param2, int param3) {
        try {
          if (param3 < 13) {
            um.c((byte) 48);
          }
          sp.field_Q = param2;
          bo.field_e = param0;
          ka.field_j = param1;
          cl.a(-67, ph.field_j / 2, ph.field_d / 2);
          nb.a(param2.field_s, -108, param0.field_s, param0.field_t + param0.field_s, param2.field_t + param2.field_s);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "um.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        var14 = Torquing.field_u;
        if (param5) {
          return;
        }
        var6 = -param0 + param3;
        var7 = param4 - param2;
        if (var6 == 0) {
          if (0 != var7) {
            we.a(param0, param4, param1, -2686, param2);
          }
          return;
        }
        if (var7 == 0) {
          ef.a(param3, param1, param2, param0, 115);
          return;
        }
        var12 = (var7 << 12) / var6;
        var13 = -(var12 * param0 >> 12) + param2;
        if (param3 < kn.field_e) {
          var11 = (var12 * kn.field_e >> 12) + var13;
          var9 = kn.field_e;
          if (kn.field_e <= param0) {
            if (qg.field_z < param0) {
              var10 = var13 + (qg.field_z * var12 >> 12);
              var8 = qg.field_z;
            } else {
              var8 = param0;
              var10 = param2;
            }
          } else {
            var10 = var13 + (var12 * kn.field_e >> 12);
            var8 = kn.field_e;
          }
          if (j.field_q <= var11) {
            if (var11 > qk.field_p) {
              var9 = (qk.field_p - var13 << 12) / var12;
              var11 = qk.field_p;
            }
          } else {
            var11 = j.field_q;
            var9 = (j.field_q - var13 << 12) / var12;
          }
          if (var10 < j.field_q) {
            var8 = (j.field_q - var13 << 12) / var12;
            var10 = j.field_q;
          } else {
            if (qk.field_p < var10) {
              var8 = (-var13 + qk.field_p << 12) / var12;
              var10 = qk.field_p;
            }
          }
          oh.a(var8, var10, var11, (byte) -128, var9, param1);
          return;
        }
        if (qg.field_z < param3) {
          var11Lifetime1 = var13 + (var12 * qg.field_z >> 12);
          var9Lifetime1 = qg.field_z;
          if (kn.field_e <= param0) {
            if (qg.field_z < param0) {
              var10Lifetime1 = var13 + (qg.field_z * var12 >> 12);
              var8Lifetime1 = qg.field_z;
            } else {
              var8Lifetime1 = param0;
              var10Lifetime1 = param2;
            }
          } else {
            var10Lifetime1 = var13 + (var12 * kn.field_e >> 12);
            var8Lifetime1 = kn.field_e;
          }
          if (j.field_q > var11Lifetime1) {
            var11Lifetime1 = j.field_q;
            var9Lifetime1 = (j.field_q - var13 << 12) / var12;
          } else {
            if (var11Lifetime1 > qk.field_p) {
              var9Lifetime1 = (qk.field_p - var13 << 12) / var12;
              var11Lifetime1 = qk.field_p;
            }
          }
          if (var10Lifetime1 < j.field_q) {
            var8Lifetime1 = (j.field_q - var13 << 12) / var12;
            var10Lifetime1 = j.field_q;
          } else {
            if (qk.field_p < var10Lifetime1) {
              var8Lifetime1 = (-var13 + qk.field_p << 12) / var12;
              var10Lifetime1 = qk.field_p;
            }
          }
          oh.a(var8Lifetime1, var10Lifetime1, var11Lifetime1, (byte) -128, var9Lifetime1, param1);
          return;
        }
        var9Lifetime2 = param3;
        var11Lifetime2 = param4;
        if (kn.field_e > param0) {
          var10Lifetime2 = var13 + (var12 * kn.field_e >> 12);
          var8Lifetime2 = kn.field_e;
        } else {
          if (qg.field_z < param0) {
            var10Lifetime2 = var13 + (qg.field_z * var12 >> 12);
            var8Lifetime2 = qg.field_z;
            if (j.field_q > var11Lifetime2) {
              var11Lifetime2 = j.field_q;
              var9Lifetime2 = (j.field_q - var13 << 12) / var12;
            } else {
              if (var11Lifetime2 > qk.field_p) {
                var9Lifetime2 = (qk.field_p - var13 << 12) / var12;
                var11Lifetime2 = qk.field_p;
              }
            }
            if (var10Lifetime2 < j.field_q) {
              var8Lifetime2 = (j.field_q - var13 << 12) / var12;
              var10Lifetime2 = j.field_q;
            } else {
              if (qk.field_p < var10Lifetime2) {
                var8Lifetime2 = (-var13 + qk.field_p << 12) / var12;
                var10Lifetime2 = qk.field_p;
              }
            }
            oh.a(var8Lifetime2, var10Lifetime2, var11Lifetime2, (byte) -128, var9Lifetime2, param1);
            return;
          }
          var8Lifetime2 = param0;
          var10Lifetime2 = param2;
        }
        if (j.field_q > var11Lifetime2) {
          var11Lifetime2 = j.field_q;
          var9Lifetime2 = (j.field_q - var13 << 12) / var12;
        } else {
          if (var11Lifetime2 > qk.field_p) {
            var9Lifetime2 = (qk.field_p - var13 << 12) / var12;
            var11Lifetime2 = qk.field_p;
          }
        }
        if (var10Lifetime2 < j.field_q) {
          var8Lifetime2 = (j.field_q - var13 << 12) / var12;
          var10Lifetime2 = j.field_q;
        } else {
          if (qk.field_p < var10Lifetime2) {
            var8Lifetime2 = (-var13 + qk.field_p << 12) / var12;
            var10Lifetime2 = qk.field_p;
          }
        }
        oh.a(var8Lifetime2, var10Lifetime2, var11Lifetime2, (byte) -128, var9Lifetime2, param1);
        return;
    }

    public static void c(byte param0) {
        field_q = null;
        if (param0 >= -66) {
          return;
        }
        field_m = null;
    }

    static {
        field_l = 50;
        field_q = "Create your own free Jagex account";
    }
}
