/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gk extends ii implements mg, vg {
    static String field_O;
    private ck field_M;
    gi field_P;
    private ck field_N;
    static String field_K;
    private uh field_R;
    static boolean[] field_Q;
    static gn field_L;

    private final boolean a(qn param0, int param1) {
        dp var3 = null;
        RuntimeException var3_ref = null;
        od var4 = null;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = param0.a(-84);
            if (var3 == null) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var4 = var3.a((byte) -95);
                var5 = -22 / ((param1 - 35) / 41);
                if (c.field_d != var4) {
                  stackIn_7_0 = 0;
                  break L1;
                } else {
                  stackIn_7_0 = 1;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("gk.R(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    public final void a(int param0) {
        ((kh) ((Object) this.field_R.a(-98))).e(true);
        if (param0 < 121) {
            this.field_M = (ck) null;
        }
    }

    final static int a(int param0, int param1) {
        param1--;
        param1 = param1 | param1 >>> 45765057;
        param1 = param1 | param1 >>> 1445209794;
        if (param0 != -912121912) {
          gk.b(false);
          param1 = param1 | param1 >>> 836974692;
          param1 = param1 | param1 >>> -912121912;
          param1 = param1 | param1 >>> -1522897680;
          return param1 + 1;
        } else {
          param1 = param1 | param1 >>> 836974692;
          param1 = param1 | param1 >>> -912121912;
          param1 = param1 | param1 >>> -1522897680;
          return param1 + 1;
        }
    }

    final void a(int param0, int param1, lm param2, boolean param3) {
        try {
            super.a(param0, param1, param2, param3);
            this.field_M.field_B = this.i(124);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "gk.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final boolean a(lm param0, char param1, int param2, byte param3) {
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        boolean stackIn_8_0 = false;
        boolean stackIn_11_0 = false;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 >= 55) {
                break L1;
              } else {
                gk.a(62, (byte) 25);
                break L1;
              }
            }
            if (!super.a(param0, param1, param2, (byte) 98)) {
              if (98 == param2) {
                stackIn_8_0 = this.a(param0, (byte) 71);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if ((param2 ^ -1) != -100) {
                  stackIn_13_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_11_0 = this.a((byte) -5, param0);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_4_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("gk.W(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return stackIn_13_0 != 0;
            }
          }
        }
    }

    final static me a(int param0, String param1) {
        RuntimeException var2 = null;
        me stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!im.field_b.b(36)) {
                break L1;
              } else {
                if (!param1.equals(im.field_b.c(-2085))) {
                  im.field_b = oh.a(param1, -8);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param0 < -88) {
                break L2;
              } else {
                field_L = (gn) null;
                break L2;
              }
            }
            stackIn_7_0 = im.field_b;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("gk.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    private final int a(String param0, int param1, lm param2, String param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param4 == 21287) {
                break L1;
              } else {
                gk.a(-63, (byte) 34);
                break L1;
              }
            }
            stackIn_3_0 = this.a(param0, 35, 50, param3, param2, param1, param5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7);

            stackIn_6_1 = new StringBuilder().append("gk.G(");

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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_3_0;
    }

    final static ai a(ec param0, byte param1) {
        int dupTemp$4 = 0;
        int dupTemp$5 = 0;
        int dupTemp$6 = 0;
        int dupTemp$7 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        ai var3 = null;
        int var4 = 0;
        ai stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = param0.c(true);
            var3 = new ai(var2_int);
            dupTemp$4 = param0.c(true);
            var3.field_j = dupTemp$4;
            var3.field_p = dupTemp$4;
            dupTemp$5 = param0.c(true);
            var3.field_l = dupTemp$5;
            var3.field_g = dupTemp$5;
            dupTemp$6 = param0.c(true);
            var3.field_s = dupTemp$6;
            var3.field_r = dupTemp$6;
            var4 = 58 / ((66 - param1) / 38);
            dupTemp$7 = param0.c(true);
            var3.field_o = dupTemp$7;
            var3.field_q = dupTemp$7;
            stackIn_1_0 = (ai) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2);

            stackIn_4_1 = new StringBuilder().append("gk.M(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    public final void a(byte param0, String param1) {
        uh var3 = null;
        String var4 = null;
        try {
            if (param0 >= -26) {
                this.field_R = (uh) null;
            }
            var3 = this.field_R;
            var4 = param1;
            ((rm) ((Object) var3)).a(var4, false, (byte) 74);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "gk.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(boolean param0) {
        field_L = null;
        if (param0) {
          field_K = (String) null;
          field_Q = null;
          field_K = null;
          field_O = null;
          return;
        } else {
          field_Q = null;
          field_K = null;
          field_O = null;
          return;
        }
    }

    private final int a(String param0, int param1, int param2, String param3, lm param4, int param5, int param6) {
        RuntimeException var8 = null;
        tn var9 = null;
        dg var10 = null;
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
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 == 50) {
              var10 = new dg(20, param6, param5 + 120, 25, param4, false, 120, 3, lp.field_C, 16777215, param3);
              this.b((byte) -61, var10);
              var9 = new tn(((qn) ((Object) param4)).a(-120), param0, 126, param6 + var10.field_s, 25 + param5, param1);
              var9.field_n = (pg) (this);
              this.b((byte) -43, var9);
              stackIn_4_0 = var9.field_s + var10.field_s;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -27;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var8);

            stackIn_7_1 = new StringBuilder().append("gk.L(");

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


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param4 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public gk() {
        super(0, 0, 496, 0, (ca) null);
        this.field_R = new uh("", (pg) null, 12);
        hh var1 = new hh(ta.field_e, 0, 0, 0, 0, 16777215, -1, 3, 0, lp.field_C.field_H, -1, 2147483647, true);
        lm var2 = new lm(vo.field_q, var1, (pg) null);
        this.field_M = new ck(m.field_g, (pg) null);
        this.field_N = new ck(dc.field_v, (pg) null);
        this.field_R.field_i = un.field_d;
        this.field_R.a(new kh(this.field_R), 10508);
        this.field_M.field_B = false;
        this.field_M.field_o = (ca) ((Object) new na());
        this.field_N.field_o = (ca) ((Object) new oa());
        this.field_R.field_o = (ca) ((Object) new mc(10000536));
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.b(0, 270, var3, 20, 50);
        this.b((byte) -49, var2);
        var3 += 50;
        var3 = var3 + (5 + this.a(an.field_z, 170, this.field_R, wf.field_B, 21287, var3));
        this.field_M.b(0, var5, var3, 496 - var5 >> 1000933057, 40);
        this.field_N.b(0, 60, var3 + 15, 3 + var4, 40);
        this.field_N.field_n = (pg) (this);
        this.field_M.field_n = (pg) (this);
        this.b((byte) -90, this.field_M);
        this.b((byte) -115, this.field_N);
        this.field_P = new gi((mg) (this));
        this.field_P.b(0, this.field_x - this.field_R.field_q + (-this.field_R.field_x + -60), 20, 60 + this.field_R.field_x + this.field_R.field_q, 150);
        this.b((byte) -77, this.field_P);
        this.b(0, 496, 0, 0, 55 + (var3 - -var4));
    }

    private final void f(byte param0) {
        if (param0 != -43) {
            return;
        }
        if (!(this.i(126))) {
            return;
        }
        pk.a(-96, this.field_R.field_w);
    }

    final static void a(int param0, h param1, int param2, int param3, int param4) {
        try {
            sd.a(param0, gd.field_E, 76, param3, param1.field_m, param4);
            if (param2 < 94) {
                field_L = (gn) null;
            }
            sd.a(40 + param0, jj.field_b, 66, param3, param1.field_r, param4);
            sd.a(param0, wl.field_d, 87, param3, param1.field_b, param4 + 18);
            sd.a(param0 + 40, pk.field_o, 89, param3, param1.field_o, param4 + 18);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "gk.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, byte param1) {
        try {
            Throwable throwable = null;
            String var3 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                ee.a("resizing", m.c(true), param1 + 15643, new Object[]{new Integer(param0)});
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                throwable = decompiledCaughtException;
                break L1;
              }
            }
            if (param1 != 4) {
              var3 = (String) null;
              gk.a(-128, (String) null);
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void a(ck param0, byte param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        lm var7 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 98) {
              break L0;
            } else {
              var7 = (lm) null;
              this.a(-18, 59, (lm) null, false);
              break L0;
            }
          }
          if (param0 == this.field_N) {
            rc.b(param1 ^ 4);
            return;
          } else {
            if (param0 == this.field_M) {
              this.f((byte) -43);
              return;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var6);

            stackIn_10_1 = new StringBuilder().append("gk.FA(");

            if (param0 == null) {
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
          throw vk.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static boolean a(String param0, String param1, int param2) {
        String var3 = null;
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              if (param2 == 16777215) {
                break L1;
              } else {
                field_O = (String) null;
                break L1;
              }
            }
            var3 = sh.a((byte) -122, param0);
            if (-1 != param1.indexOf(param0)) {
              stackIn_6_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((param1.indexOf(var3) ^ -1) == 0) {
                L2: {
                  L3: {
                    if (param1.startsWith(param0)) {
                      break L3;
                    } else {
                      if (param1.startsWith(var3)) {
                        break L3;
                      } else {
                        if (param1.endsWith(param0)) {
                          break L3;
                        } else {
                          if (!param1.endsWith(var3)) {
                            stackIn_14_0 = 0;
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  stackIn_14_0 = 1;
                  break L2;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return true;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("gk.F(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          return stackIn_14_0 != 0;
        }
    }

    private final boolean i(int param0) {
        if (!this.a(this.field_R, -70)) {
            return false;
        }
        if (param0 <= 123) {
            return false;
        }
        return true;
    }

    static {
        field_O = "Back";
        field_K = "PROFILE";
    }
}
