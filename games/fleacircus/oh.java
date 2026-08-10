/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class oh extends jj {
    private int field_ab;
    private qa field_ib;
    private int field_eb;
    private ak field_fb;
    static int field_db;
    private tf field_hb;
    private int field_cb;
    private int field_gb;
    private int field_bb;
    static String field_jb;

    final void l(int param0) {
        if (this.field_fb != null) {
          if (fl.field_e == this.field_fb) {
            this.field_hb.field_F = 256;
            this.field_fb = null;
            super.l(param0);
            return;
          } else {
            this.a(this.field_ib.field_j + (this.field_gb + 12), (byte) -128, this.field_ib.field_u + 12);
            this.c(this.field_ib, 115);
            this.field_hb.field_F = 256;
            this.field_fb = null;
            super.l(param0);
            return;
          }
        } else {
          super.l(param0);
          return;
        }
    }

    final static void a(rh param0, rh param1, boolean param2, byte param3, rh param4) {
        try {
            uc.field_c = pk.a((byte) 68, "");
            uc.field_c.a(false, 10518);
            j.a(param4, param1, param3 ^ 31756, param0);
            if (param3 != 28) {
                oh.c(2, -119, 119);
            }
            mg.a(-125);
            ui.field_kb = ql.field_l;
            cb.field_v = ql.field_l;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "oh.FA(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    boolean a(int param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var2;
        int var3;
        var3 = fleas.field_A ? 1 : 0;
        if (null != this.field_fb) {
          if (this.field_fb == rk.field_w) {
            fieldTemp$2 = this.field_eb + 1;
            this.field_eb = this.field_eb + 1;
            if (fieldTemp$2 != this.field_ab) {
              this.field_hb.field_F = -((this.field_eb << -2050684568) / this.field_ab) + 256;
              var2 = -59 / ((38 - param0) / 49);
              return super.a(-57);
            } else {
              this.field_fb = ml.field_I;
              this.a(this.field_bb, 12 - -this.field_ib.field_u, 12 - (-this.field_gb - this.field_ib.field_j), -95);
              this.field_hb.field_F = 0;
              this.field_eb = 0;
              var2 = -59 / ((38 - param0) / 49);
              return super.a(-57);
            }
          } else {
            if (this.field_fb == fl.field_e) {
              fieldTemp$3 = this.field_eb + 1;
              this.field_eb = this.field_eb + 1;
              if (this.field_cb != fieldTemp$3) {
                this.field_hb.field_F = (this.field_eb << 825741992) / this.field_cb;
                var2 = -59 / ((38 - param0) / 49);
                return super.a(-57);
              } else {
                this.field_fb = null;
                this.field_hb.field_F = 256;
                var2 = -59 / ((38 - param0) / 49);
                return super.a(-57);
              }
            } else {
              var2 = -59 / ((38 - param0) / 49);
              return super.a(-57);
            }
          }
        } else {
          var2 = -59 / ((38 - param0) / 49);
          return super.a(-57);
        }
    }

    final void m(int param0) {
        if (!(rk.field_w != this.field_fb)) {
            return;
        }
        this.field_eb = 0;
        this.field_fb = fl.field_e;
        this.c(this.field_ib, 99);
        this.field_hb.field_F = 0;
        this.field_ib = null;
        int var2 = 89 % ((-56 - param0) / 45);
    }

    oh(f param0, qa param1, int param2, int param3, int param4) {
        super(param0, 12 - -param1.field_u, param1.field_j + (12 - -param2));
        try {
            this.field_bb = param4;
            this.field_gb = param2;
            this.field_cb = param3;
            this.field_ab = param3;
            this.c(param1, 98);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "oh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void c(qa param0, int param1) {
        if (!(null == this.field_hb)) {
            this.field_hb.c(-1);
        }
        if (param0 != null) {
            param0.a(6, param0.field_u, 6 + this.field_gb, param0.field_j, 80);
            this.field_hb = new tf(param0);
        } else {
            this.field_hb = new tf();
        }
        this.a((qa) (this.field_hb), (byte) -85);
        if (param1 <= 79) {
            return;
        }
        try {
            this.field_ib = null;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "oh.DB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static dd c(int param0, int param1, int param2) {
        int var6 = fleas.field_A ? 1 : 0;
        dd var7 = new dd(param2, param2);
        dd var3 = var7;
        int var4 = 0;
        int var5 = 73 % ((param0 - 37) / 48);
        while (var3.field_B.length > var4) {
            var7.field_B[var4] = param1;
            var4++;
        }
        return var3;
    }

    public static void f(byte param0) {
        field_jb = null;
        if (param0 >= -86) {
            oh.c(73, 19, -11);
        }
    }

    void d(qa param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_ib = param0;
              if (ml.field_I == this.field_fb) {
                this.a(this.field_bb, 12 - -this.field_ib.field_u, 12 - (-this.field_gb - this.field_ib.field_j), 122);
                this.field_eb = 0;
                break L1;
              } else {
                if (this.field_fb == rk.field_w) {
                  break L1;
                } else {
                  this.field_eb = 0;
                  this.field_fb = rk.field_w;
                  break L1;
                }
              }
            }
            if (param1 == 26034) {
              break L0;
            } else {
              this.m(-84);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("oh.IA(");

            if (param0 == null) {
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
          throw pf.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
    }

    final static void d(boolean param0) {
        if (param0) {
          field_jb = (String) null;
          ol.field_d = new ca();
          ak.field_a.d(ol.field_d, 26034);
          return;
        } else {
          ol.field_d = new ca();
          ak.field_a.d(ol.field_d, 26034);
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17;
        var17 = fleas.field_A ? 1 : 0;
        if (param8 < param11) {
          if (param0 <= param11) {
            if (param0 <= param8) {
              pa.a(param9, param8, param14, param15, param4, param12, param2, param0, param1, param3, param10, gb.field_a, param6, param13, param11, param5 + 32679, param7);
              if (param5 != 0) {
                field_jb = (String) null;
                return;
              } else {
                return;
              }
            } else {
              pa.a(param1, param0, param14, param3, param2, param12, param4, param8, param9, param15, param13, gb.field_a, param6, param10, param11, 32679, param7);
              if (param5 != 0) {
                field_jb = (String) null;
                return;
              } else {
                return;
              }
            }
          } else {
            pa.a(param6, param11, param4, param3, param2, param15, param14, param8, param9, param12, param13, gb.field_a, param1, param7, param0, 32679, param10);
            if (param5 != 0) {
              field_jb = (String) null;
              return;
            } else {
              return;
            }
          }
        } else {
          if (param8 >= param0) {
            if (param0 <= param11) {
              pa.a(param6, param11, param2, param15, param4, param3, param14, param0, param1, param12, param10, gb.field_a, param9, param7, param8, 32679, param13);
              if (param5 == 0) {
                return;
              } else {
                field_jb = (String) null;
                return;
              }
            } else {
              pa.a(param1, param0, param2, param12, param14, param3, param4, param11, param6, param15, param7, gb.field_a, param9, param10, param8, param5 ^ 32679, param13);
              if (param5 == 0) {
                return;
              } else {
                field_jb = (String) null;
                return;
              }
            }
          } else {
            pa.a(param9, param8, param4, param12, param14, param15, param2, param11, param6, param3, param7, gb.field_a, param1, param13, param0, 32679, param10);
            if (param5 != 0) {
              field_jb = (String) null;
              return;
            } else {
              return;
            }
          }
        }
    }

    final boolean j(int param0) {
        qa var3;
        this.l(-1);
        if (param0 <= 70) {
          var3 = (qa) null;
          this.d((qa) null, 45);
          return super.j(80);
        } else {
          return super.j(80);
        }
    }

    boolean a(int param0, int param1, qa param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0 + 0, param1, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 == -2) {
                  break L1;
                } else {
                  this.l(118);
                  break L1;
                }
              }
              if (null != this.field_hb) {
                L2: {
                  if ((param1 ^ -1) == -99) {
                    this.field_hb.a(param2, -61);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (-100 == (param1 ^ -1)) {
                    this.field_hb.a(param2, -70);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                stackIn_15_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var5);

            stackIn_18_1 = new StringBuilder().append("oh.N(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_15_0 != 0;
        }
    }

    static {
        field_db = 50;
        field_jb = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
