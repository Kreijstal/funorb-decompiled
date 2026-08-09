/*
 * Decompiled by CFR-JS 0.4.0.
 */
class cn implements nn, mi {
    int field_b;
    int field_j;
    static byte[][] field_m;
    int field_a;
    static String field_c;
    int field_o;
    int field_n;
    vm field_g;
    int field_q;
    int field_i;
    static bd field_h;
    int field_d;
    static int[] field_e;
    private int field_f;
    int field_p;
    int field_k;
    static int field_r;
    private boolean field_l;

    public final int a(int param0, ag param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                field_e = (int[]) null;
                break L1;
              }
            }
            stackIn_3_0 = this.a(-1, param1, 0, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("cn.T(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    public final int a(int param0, int param1, int param2, ag param3, int param4, int param5) {
        RuntimeException var7 = null;
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
            this.a(param3, 1);
            if (param2 <= -68) {
              stackIn_4_0 = param3.field_l.a(83, param5 - this.a(-1, param3, param4), param1 - this.a(param0, -1, param3));
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -96;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var7);

            stackIn_7_1 = new StringBuilder().append("cn.R(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw wg.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final int a(ag param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 == -26318) {
                break L1;
              } else {
                this.field_p = -119;
                break L1;
              }
            }
            stackIn_3_0 = param0.field_v + param1 - (-this.field_q - param0.field_q) + param2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("cn.Q(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    private final int a(int param0, ag param1) {
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
            if (param0 == -4) {
              stackIn_4_0 = -this.field_i + (param1.field_x - this.field_n);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 46;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("cn.G(").append(param0).append(',');

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
          throw wg.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    String c(ag param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 3) {
              stackIn_4_0 = param0.field_n;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("cn.V(");

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
          throw wg.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final void a(int param0, boolean param1, int param2, ag param3) {
        try {
            if (param1) {
                this.field_d = -113;
            }
            this.a(param3, this.field_f, 0, param0, 0, this.field_j, param2, (byte) 94);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "cn.H(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final int a(int param0, ag param1, int param2, int param3) {
        RuntimeException var5 = null;
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
            if (param0 == -1) {
              stackIn_4_0 = param2 + param1.field_m + param3 - -this.field_n + param1.field_o;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -52;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("cn.F(").append(param0).append(',');

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
          throw wg.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(int param0, vm param1, int param2, vm param3) {
        try {
            cg.field_a = param2;
            lj.field_u = param1;
            na.field_c = param3;
            if (param0 <= 125) {
                cn.a(122);
            }
            wc.a(si.field_e / 2, si.field_k / 2, -1);
            ub.a(param1.field_F + param1.field_N, param3.field_F + param3.field_N, param3.field_N, param1.field_N, (byte) -127);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "cn.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public final ce a(ag param0, int param1) {
        RuntimeException var3 = null;
        ag var4 = null;
        ce stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null == param0.field_l) {
                param0.field_l = (ce) ((Object) new mb());
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 == 1) {
                break L2;
              } else {
                var4 = (ag) null;
                this.b((ag) null, (byte) 124);
                break L2;
              }
            }
            L3: {
              if (this.field_l) {
                ((mb) ((Object) param0.field_l)).a(0, this.a(-4, param0), this.a(param0, (byte) 67), this.field_b, this.field_g, this.c(param0, 3), this.field_k, this.field_a);
                break L3;
              } else {
                this.b(param0, 3);
                break L3;
              }
            }
            stackIn_9_0 = param0.field_l;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("cn.N(");

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
          throw wg.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    public final int a(int param0, int param1, ag param2) {
        RuntimeException var4 = null;
        ag var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -1) {
                break L1;
              } else {
                var5 = (ag) null;
                this.a(false, (ag) null);
                break L1;
              }
            }
            stackIn_3_0 = this.a(param2, param0, 0, -26318);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("cn.M(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, cn param1) {
        try {
            param1.field_k = this.field_k;
            if (param0 > -32) {
                this.field_p = -18;
            }
            param1.field_o = this.field_o;
            param1.field_q = this.field_q;
            param1.field_l = this.field_l;
            param1.field_n = this.field_n;
            param1.field_j = this.field_j;
            param1.field_p = this.field_p;
            param1.field_i = this.field_i;
            param1.field_d = this.field_d;
            param1.field_f = this.field_f;
            param1.field_a = this.field_a;
            param1.field_g = this.field_g;
            param1.field_b = this.field_b;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "cn.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final int a(boolean param0, ag param1) {
        RuntimeException var3 = null;
        vm var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                var4 = (vm) null;
                cn.a(114, (vm) null, 6, (vm) null);
                break L1;
              }
            }
            this.a(param1, 1);
            stackIn_3_0 = param1.field_l.a(3915) + this.field_q - -this.field_p;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("cn.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public final int b(ag param0, byte param1) {
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
            L1: {
              this.a(param0, 1);
              if (param1 < -58) {
                break L1;
              } else {
                cn.a(false, (byte) -4);
                break L1;
              }
            }
            stackIn_3_0 = param0.field_l.a(true) + (this.field_n - -this.field_i);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("cn.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(int param0) {
        field_m = (byte[][]) null;
        field_e = null;
        field_c = null;
        if (param0 < 14) {
            return;
        }
        field_h = null;
    }

    public void a(int param0, int param1, int param2, ag param3, boolean param4) {
        if (null == this.field_g) {
            return;
        }
        try {
            this.a(param0, false, param1, param3);
            if (param2 != 15430) {
                this.field_n = 13;
            }
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "cn.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    public final int a(boolean param0) {
        if (!param0) {
            this.field_d = 10;
        }
        return this.field_g.field_F + this.field_g.field_y;
    }

    final static void a(boolean param0, byte param1) {
        int var2;
        int var3;
        L0: {
          var3 = HostileSpawn.field_I ? 1 : 0;
          if (wb.field_S <= 0) {
            if (ta.p(3)) {
              var2 = 0;
              break L0;
            } else {
              var2 = 1;
              break L0;
            }
          } else {
            L1: {
              if (null != ie.field_c) {
                wa.field_q = ie.field_c.d(16776960);
                sd.a(2, 0);
                break L1;
              } else {
                wa.field_q = jg.a(640, (byte) -114, gf.field_b, 0, 480, 0);
                break L1;
              }
            }
            if (wa.field_q != null) {
              ea.a(wa.field_q, 0);
              var2 = 2;
              break L0;
            } else {
              var2 = 3;
              break L0;
            }
          }
        }
        if (param1 > 76) {
          L2: {
            if (null != ie.field_c) {
              break L2;
            } else {
              if (!pm.field_e) {
                break L2;
              } else {
                hh.a(5, var2, param0);
                break L2;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    public final void a(int param0, ag param1, int param2, int param3, int param4) {
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_7_0;
        int stackIn_7_1;
        int stackIn_7_2;
        int stackIn_7_3;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        pm var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        cn var13 = null;
        ce var14 = null;
        ce var15 = null;
        try {
          L0: {
            L1: {
              if (param3 == 0) {
                break L1;
              } else {
                var13 = (cn) null;
                this.a(-73, (cn) null);
                break L1;
              }
            }
            L2: {
              if (param1.g(param3 + -9015)) {
                L3: {
                  var14 = this.a(param1, 1);
                  var15 = var14;
                  var7 = var15.a(param2, 0);
                  var8 = var14.field_d[var7];
                  var9 = var15.b(param2, 0);
                  var10 = this.a(param1, param4, var9, param3 + -26318);
                  var11 = this.a(-1, param1, param0) - -Math.max(0, var8.field_i);
                  stackIn_6_0 = this.a(-1, param1, param0);

                  stackIn_6_1 = this.a(-4, param1);

                  stackIn_6_2 = var8.field_f;

                  if (var15.field_d.length > var7 - -1) {
                    stackIn_7_0 = stackIn_6_0;
                    stackIn_7_1 = stackIn_6_1;
                    stackIn_7_2 = stackIn_6_2;
                    stackIn_7_3 = var14.field_d[1 + var7].field_i;
                    break L3;
                  } else {
                    stackIn_7_0 = stackIn_6_0;
                    stackIn_7_1 = stackIn_6_1;
                    stackIn_7_2 = stackIn_6_2;
                    stackIn_7_3 = var8.field_f;
                    break L3;
                  }
                }
                var12 = stackIn_7_0 - -Math.min(stackIn_7_1, Math.min(stackIn_7_2, stackIn_7_3));
                sf.a(param1.field_v + (param4 - -param1.field_s), param1.field_m + param0, param1.field_x + (param0 + param1.field_m), param1.field_v + param4, true);
                gf.field_e.a(1077952576, var10, var12, var10, this.field_o, var11);
                eh.b(false);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var6);

            stackIn_11_1 = new StringBuilder().append("cn.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(ag param0, int param1, int param2, int param3, int param4, int param5, int param6, byte param7) {
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        ag var14 = null;
        var13 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              sf.a(param6 + param0.field_v + param0.field_s, param0.field_m + param3, param0.field_m + (param3 + param0.field_x), param6 + param0.field_v, true);
              if (param7 >= 85) {
                break L1;
              } else {
                var14 = (ag) null;
                this.c((ag) null, 36);
                break L1;
              }
            }
            L2: {
              var9_int = this.a(param0, (byte) 69);
              var10 = this.a(-4, param0);
              if (!this.field_l) {
                L3: {
                  var12 = this.field_b;
                  if (-1 == (var12 ^ -1)) {
                    var11 = this.field_g.field_y;
                    break L3;
                  } else {
                    if (var12 != 2) {
                      L4: {
                        if ((var12 ^ -1) == -4) {
                          break L4;
                        } else {
                          if (var12 != 1) {
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var11 = this.field_g.field_y + (-this.field_g.field_y + var10 - this.field_g.field_F >> -556979871);
                      break L3;
                    } else {
                      var11 = var10 + -this.field_g.field_F;
                      break L3;
                    }
                  }
                }
                L5: {
                  var12 = this.field_k;
                  if (-1 != (var12 ^ -1)) {
                    if (var12 != 3) {
                      if ((var12 ^ -1) != -2) {
                        if ((var12 ^ -1) == -3) {
                          this.field_g.a(this.c(param0, 3), this.a(param0, param6, param2, -26318) - -var9_int, this.a(-1, param0, param4, param3) - -var11, param5, param1);
                          break L2;
                        } else {
                          break L2;
                        }
                      } else {
                        this.field_g.b(this.c(param0, 3), this.a(param0, param6, param2, -26318) + (var9_int >> -432479807), var11 + this.a(-1, param0, param4, param3), param5, param1);
                        break L2;
                      }
                    } else {
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                this.field_g.c(this.c(param0, 3), this.a(param0, param6, param2, -26318), this.a(-1, param0, param4, param3) + var11, param5, param1);
                break L2;
              } else {
                this.field_g.a(this.c(param0, 3), this.a(param0, param6, param2, -26318), this.a(-1, param0, param4, param3), var9_int, var10, param5, param1, this.field_k, this.field_b, this.field_a);
                break L2;
              }
            }
            eh.b(false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var9 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var9);

            stackIn_29_1 = new StringBuilder().append("cn.O(");

            if (param0 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L6;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L6;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    private final void b(ag param0, int param1) {
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0.field_l != null) {
                break L1;
              } else {
                param0.field_l = (ce) ((Object) new mb());
                break L1;
              }
            }
            L2: {
              var3_int = this.a(param0, (byte) 85);
              var4 = this.a(-4, param0);
              var6 = this.field_b;
              if (var6 == 0) {
                var5 = this.field_g.field_y;
                break L2;
              } else {
                if (-3 != (var6 ^ -1)) {
                  L3: {
                    if (3 != var6) {
                      if (-2 != (var6 ^ -1)) {
                        break L3;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  var5 = this.field_g.field_y - -(var4 + (-this.field_g.field_y + -this.field_g.field_F) >> -505709247);
                  break L2;
                } else {
                  var5 = -this.field_g.field_F + var4;
                  break L2;
                }
              }
            }
            L4: {
              if (param1 == 3) {
                break L4;
              } else {
                this.field_q = 69;
                break L4;
              }
            }
            L5: {
              L6: {
                var6 = this.field_k;
                if (-1 != (var6 ^ -1)) {
                  if (var6 != 3) {
                    L7: {
                      if (1 != var6) {
                        if ((var6 ^ -1) != -3) {
                          break L7;
                        } else {
                          if (param0.field_l instanceof mb) {
                            ((mb) ((Object) param0.field_l)).a(this.field_g, var5, -1002333144, var3_int, this.c(param0, param1 + 0));
                            break L7;
                          } else {
                            break L5;
                          }
                        }
                      } else {
                        if (!(param0.field_l instanceof mb)) {
                          break L7;
                        } else {
                          ((mb) ((Object) param0.field_l)).a(var5, this.c(param0, 3), var3_int >> -1513218015, 28916, this.field_g);
                          break L5;
                        }
                      }
                    }
                    break L5;
                  } else {
                    break L6;
                  }
                } else {
                  break L6;
                }
              }
              if (param0.field_l instanceof mb) {
                ((mb) ((Object) param0.field_l)).a(var5, 0, this.c(param0, 3), this.field_g, (byte) -2);
                break L5;
              } else {
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var3);

            stackIn_34_1 = new StringBuilder().append("cn.C(");

            if (param0 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L8;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L8;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param1 + ')');
        }
    }

    public final int a(ag param0, byte param1) {
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
            if (param1 > 12) {
              stackIn_4_0 = param0.field_s - (this.field_q - -this.field_p);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 104;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("cn.I(");

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
          throw wg.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public final void a(int param0, byte param1, int param2, ag param3, int param4, int param5) {
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        pm var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        ce var17 = null;
        ce var18 = null;
        var16 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 41) {
                break L1;
              } else {
                field_c = (String) null;
                break L1;
              }
            }
            if (param5 == param2) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (param3.g(param1 + -9056)) {
                  L3: {
                    var17 = this.a(param3, param1 ^ 40);
                    var18 = var17;
                    if (param5 > param2) {
                      var8 = param2;
                      var9 = param5;
                      break L3;
                    } else {
                      var9 = param2;
                      var8 = param5;
                      break L3;
                    }
                  }
                  var10 = var18.a(var8, 0);
                  var11 = var18.a(var9, param1 + -41);
                  sf.a(param3.field_s + (param0 + param3.field_v), param4 - -param3.field_m, param3.field_x + (param3.field_m + param4), param0 - -param3.field_v, true);
                  var12 = var10;
                  L4: while (true) {
                    if (var11 < var12) {
                      eh.b(false);
                      break L2;
                    } else {
                      L5: {
                        var13 = var17.field_d[var12];
                        if (var10 == var12) {
                          stackIn_16_0 = var18.b(var8, 0);
                          break L5;
                        } else {
                          stackIn_16_0 = var13.field_b[0];
                          break L5;
                        }
                      }
                      L6: {
                        var14 = stackIn_16_0;
                        if (var12 == var11) {
                          stackIn_21_0 = var18.b(var9, param1 ^ 41);
                          break L6;
                        } else {
                          if (var13 == null) {
                            stackIn_21_0 = 0;
                            break L6;
                          } else {
                            stackIn_21_0 = var13.field_b[var13.field_b.length + -1];
                            break L6;
                          }
                        }
                      }
                      var15 = stackIn_21_0;
                      gf.field_e.a(this.a(param3, param0, var14, -26318), var15 - var14, this.field_d >>> -1486050088, this.field_d, var13.field_f, this.field_n + param3.field_m + (param4 + (param3.field_o - -var13.field_i)), 11776);
                      var12++;
                      continue L4;
                    }
                  }
                } else {
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var7 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var7);

            stackIn_26_1 = new StringBuilder().append("cn.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L7;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L7;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    cn(vm param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    protected cn() {
    }

    cn(vm param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
            this.field_f = param6;
            this.field_i = param4;
            this.field_a = param9;
            this.field_j = param5;
            this.field_g = param0;
            this.field_b = param8;
            this.field_p = param2;
            this.field_n = param3;
            this.field_o = param10;
            this.field_k = param7;
            this.field_d = param11;
            this.field_l = param12 ? true : false;
            this.field_q = param1;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "cn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    static {
        int var0 = 0;
        int var1 = 0;
        field_m = new byte[50][];
        field_c = "Find and exterminate the spawn queen, then exit via the lift.";
        field_e = new int[255];
        for (var0 = 0; var0 < 255; var0++) {
            var1 = 3 * (var0 - 128);
            if (255 < var1) {
                var1 = 255;
            }
            if ((var1 ^ -1) > -1) {
                var1 = 0;
            }
            field_e[var0] = 255 + 256 * var0;
        }
    }
}
