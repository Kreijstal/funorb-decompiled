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
        if (((oh) this).field_fb != null) {
          if (fl.field_e == ((oh) this).field_fb) {
            ((oh) this).field_hb.field_F = 256;
            ((oh) this).field_fb = null;
            super.l(param0);
            return;
          } else {
            ((oh) this).a(((oh) this).field_ib.field_j + (((oh) this).field_gb + 12), (byte) -128, ((oh) this).field_ib.field_u + 12);
            this.c(((oh) this).field_ib, 115);
            ((oh) this).field_hb.field_F = 256;
            ((oh) this).field_fb = null;
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
            j.a(param4, param1, 31760, param0);
            mg.a(-125);
            ui.field_kb = ql.field_l;
            cb.field_v = ql.field_l;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "oh.FA(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + 28 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    boolean a(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = fleas.field_A ? 1 : 0;
        if (null != ((oh) this).field_fb) {
          if (((oh) this).field_fb == rk.field_w) {
            int fieldTemp$2 = ((oh) this).field_eb + 1;
            ((oh) this).field_eb = ((oh) this).field_eb + 1;
            if (fieldTemp$2 != ((oh) this).field_ab) {
              ((oh) this).field_hb.field_F = -((((oh) this).field_eb << 8) / ((oh) this).field_ab) + 256;
              var2 = 59;
              return super.a(-57);
            } else {
              ((oh) this).field_fb = ml.field_I;
              ((oh) this).a(((oh) this).field_bb, 12 - -((oh) this).field_ib.field_u, 12 - (-((oh) this).field_gb - ((oh) this).field_ib.field_j), -95);
              ((oh) this).field_hb.field_F = 0;
              ((oh) this).field_eb = 0;
              var2 = 59;
              return super.a(-57);
            }
          } else {
            if (((oh) this).field_fb == fl.field_e) {
              int fieldTemp$3 = ((oh) this).field_eb + 1;
              ((oh) this).field_eb = ((oh) this).field_eb + 1;
              if (((oh) this).field_cb != fieldTemp$3) {
                ((oh) this).field_hb.field_F = (((oh) this).field_eb << 8) / ((oh) this).field_cb;
                var2 = 59;
                return super.a(-57);
              } else {
                ((oh) this).field_fb = null;
                ((oh) this).field_hb.field_F = 256;
                var2 = 59;
                return super.a(-57);
              }
            } else {
              var2 = 59;
              return super.a(-57);
            }
          }
        } else {
          var2 = 59;
          return super.a(-57);
        }
    }

    final void m(int param0) {
        if (!(rk.field_w != ((oh) this).field_fb)) {
            return;
        }
        ((oh) this).field_eb = 0;
        ((oh) this).field_fb = fl.field_e;
        this.c(((oh) this).field_ib, 99);
        ((oh) this).field_hb.field_F = 0;
        ((oh) this).field_ib = null;
        int var2 = 89 % ((-56 - param0) / 45);
    }

    oh(f param0, qa param1, int param2, int param3, int param4) {
        super(param0, 12 - -param1.field_u, param1.field_j + (12 - -param2));
        try {
            ((oh) this).field_bb = param4;
            ((oh) this).field_gb = param2;
            ((oh) this).field_cb = param3;
            ((oh) this).field_ab = param3;
            this.c(param1, 98);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "oh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void c(qa param0, int param1) {
        if (!(null == ((oh) this).field_hb)) {
            ((oh) this).field_hb.c(-1);
        }
        if (param0 != null) {
            param0.a(6, param0.field_u, 6 + ((oh) this).field_gb, param0.field_j, 80);
            ((oh) this).field_hb = new tf(param0);
        } else {
            ((oh) this).field_hb = new tf();
        }
        ((oh) this).a((qa) (Object) ((oh) this).field_hb, (byte) -85);
        if (param1 <= 79) {
            return;
        }
        try {
            ((oh) this).field_ib = null;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "oh.DB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
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

    public static void f() {
        field_jb = null;
    }

    void d(qa param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              ((oh) this).field_ib = param0;
              if (ml.field_I == ((oh) this).field_fb) {
                ((oh) this).a(((oh) this).field_bb, 12 - -((oh) this).field_ib.field_u, 12 - (-((oh) this).field_gb - ((oh) this).field_ib.field_j), 122);
                ((oh) this).field_eb = 0;
                break L1;
              } else {
                if (((oh) this).field_fb == rk.field_w) {
                  break L1;
                } else {
                  ((oh) this).field_eb = 0;
                  ((oh) this).field_fb = rk.field_w;
                  break L1;
                }
              }
            }
            if (param1 == 26034) {
              break L0;
            } else {
              ((oh) this).m(-84);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("oh.IA(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ')');
        }
    }

    final static void d() {
        ol.field_d = new ca();
        ak.field_a.d((qa) (Object) ol.field_d, 26034);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17 = 0;
        var17 = fleas.field_A ? 1 : 0;
        if (param8 < param11) {
          if (param0 <= param11) {
            if (param0 <= param8) {
              pa.a(param9, param8, param14, param15, param4, param12, param2, param0, param1, param3, param10, gb.field_a, param6, param13, param11, 32679, param7);
              field_jb = null;
              return;
            } else {
              pa.a(param1, param0, param14, param3, param2, param12, param4, param8, param9, param15, param13, gb.field_a, param6, param10, param11, 32679, param7);
              field_jb = null;
              return;
            }
          } else {
            pa.a(param6, param11, param4, param3, param2, param15, param14, param8, param9, param12, param13, gb.field_a, param1, param7, param0, 32679, param10);
            field_jb = null;
            return;
          }
        } else {
          if (param8 >= param0) {
            if (param0 <= param11) {
              pa.a(param6, param11, param2, param15, param4, param3, param14, param0, param1, param12, param10, gb.field_a, param9, param7, param8, 32679, param13);
              field_jb = null;
              return;
            } else {
              pa.a(param1, param0, param2, param12, param14, param3, param4, param11, param6, param15, param7, gb.field_a, param9, param10, param8, 32679, param13);
              field_jb = null;
              return;
            }
          } else {
            pa.a(param9, param8, param4, param12, param14, param15, param2, param11, param6, param3, param7, gb.field_a, param1, param13, param0, 32679, param10);
            field_jb = null;
            return;
          }
        }
    }

    final boolean j(int param0) {
        Object var3 = null;
        ((oh) this).l(-1);
        if (param0 <= 70) {
          var3 = null;
          ((oh) this).d((qa) null, 45);
          return super.j(80);
        } else {
          return super.j(80);
        }
    }

    boolean a(int param0, int param1, qa param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (super.a(-2, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (null != ((oh) this).field_hb) {
                L1: {
                  if (param1 == 98) {
                    boolean discarded$4 = ((oh) this).field_hb.a(param2, -61);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (param1 == 99) {
                    boolean discarded$5 = ((oh) this).field_hb.a(param2, -70);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("oh.N(").append(-2).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param3 + ')');
        }
        return stackIn_13_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_db = 50;
        field_jb = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
