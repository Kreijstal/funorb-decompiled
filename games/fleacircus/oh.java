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
        uc.field_c = pk.a((byte) 68, "");
        uc.field_c.a(false, 10518);
        j.a(param4, param1, param3 ^ 31756, param0);
        if (param3 != 28) {
          dd discarded$2 = oh.c(2, -119, 119);
          mg.a(-125);
          ui.field_kb = ql.field_l;
          cb.field_v = ql.field_l;
          return;
        } else {
          mg.a(-125);
          ui.field_kb = ql.field_l;
          cb.field_v = ql.field_l;
          return;
        }
    }

    boolean a(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = fleas.field_A ? 1 : 0;
        if (null != ((oh) this).field_fb) {
          if (((oh) this).field_fb == rk.field_w) {
            ((oh) this).field_eb = ((oh) this).field_eb + 1;
            if (((oh) this).field_eb + 1 != ((oh) this).field_ab) {
              ((oh) this).field_hb.field_F = -((((oh) this).field_eb << -2050684568) / ((oh) this).field_ab) + 256;
              var2 = -59 / ((38 - param0) / 49);
              return super.a(-57);
            } else {
              ((oh) this).field_fb = ml.field_I;
              ((oh) this).a(((oh) this).field_bb, 12 - -((oh) this).field_ib.field_u, 12 - (-((oh) this).field_gb - ((oh) this).field_ib.field_j), -95);
              ((oh) this).field_hb.field_F = 0;
              ((oh) this).field_eb = 0;
              var2 = -59 / ((38 - param0) / 49);
              return super.a(-57);
            }
          } else {
            if (((oh) this).field_fb == fl.field_e) {
              ((oh) this).field_eb = ((oh) this).field_eb + 1;
              if (((oh) this).field_cb != ((oh) this).field_eb + 1) {
                ((oh) this).field_hb.field_F = (((oh) this).field_eb << 825741992) / ((oh) this).field_cb;
                var2 = -59 / ((38 - param0) / 49);
                return super.a(-57);
              } else {
                ((oh) this).field_fb = null;
                ((oh) this).field_hb.field_F = 256;
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
        ((oh) this).field_bb = param4;
        ((oh) this).field_gb = param2;
        ((oh) this).field_cb = param3;
        ((oh) this).field_ab = param3;
        this.c(param1, 98);
    }

    private final void c(qa param0, int param1) {
        L0: {
          if (null != ((oh) this).field_hb) {
            ((oh) this).field_hb.c(-1);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 == null) {
          ((oh) this).field_hb = new tf();
          ((oh) this).a((qa) (Object) ((oh) this).field_hb, (byte) -85);
          if (param1 <= 79) {
            return;
          } else {
            ((oh) this).field_ib = null;
            return;
          }
        } else {
          param0.a(6, param0.field_u, 6 + ((oh) this).field_gb, param0.field_j, 80);
          ((oh) this).field_hb = new tf(param0);
          ((oh) this).a((qa) (Object) ((oh) this).field_hb, (byte) -85);
          if (param1 <= 79) {
            return;
          } else {
            ((oh) this).field_ib = null;
            return;
          }
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
            dd discarded$0 = oh.c(73, 19, -11);
        }
    }

    void d(qa param0, int param1) {
        ((oh) this).field_ib = param0;
        if (ml.field_I == ((oh) this).field_fb) {
          ((oh) this).a(((oh) this).field_bb, 12 - -((oh) this).field_ib.field_u, 12 - (-((oh) this).field_gb - ((oh) this).field_ib.field_j), 122);
          ((oh) this).field_eb = 0;
          if (param1 == 26034) {
            return;
          } else {
            ((oh) this).m(-84);
            return;
          }
        } else {
          if (((oh) this).field_fb == rk.field_w) {
            if (param1 != 26034) {
              ((oh) this).m(-84);
              return;
            } else {
              return;
            }
          } else {
            ((oh) this).field_eb = 0;
            ((oh) this).field_fb = rk.field_w;
            if (param1 == 26034) {
              return;
            } else {
              ((oh) this).m(-84);
              return;
            }
          }
        }
    }

    final static void d(boolean param0) {
        if (param0) {
          field_jb = null;
          ol.field_d = new ca();
          ak.field_a.d((qa) (Object) ol.field_d, 26034);
          return;
        } else {
          ol.field_d = new ca();
          ak.field_a.d((qa) (Object) ol.field_d, 26034);
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17 = 0;
        var17 = fleas.field_A ? 1 : 0;
        if (param8 < param11) {
          if (param0 <= param11) {
            if (param0 <= param8) {
              pa.a(param9, param8, param14, param15, param4, param12, param2, param0, param1, param3, param10, gb.field_a, param6, param13, param11, param5 + 32679, param7);
              if (param5 != 0) {
                field_jb = null;
                return;
              } else {
                return;
              }
            } else {
              pa.a(param1, param0, param14, param3, param2, param12, param4, param8, param9, param15, param13, gb.field_a, param6, param10, param11, 32679, param7);
              if (param5 != 0) {
                field_jb = null;
                return;
              } else {
                return;
              }
            }
          } else {
            pa.a(param6, param11, param4, param3, param2, param15, param14, param8, param9, param12, param13, gb.field_a, param1, param7, param0, 32679, param10);
            if (param5 != 0) {
              field_jb = null;
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
                field_jb = null;
                return;
              }
            } else {
              pa.a(param1, param0, param2, param12, param14, param3, param4, param11, param6, param15, param7, gb.field_a, param9, param10, param8, param5 ^ 32679, param13);
              if (param5 == 0) {
                return;
              } else {
                field_jb = null;
                return;
              }
            }
          } else {
            pa.a(param9, param8, param4, param12, param14, param15, param2, param11, param6, param3, param7, gb.field_a, param1, param13, param0, 32679, param10);
            if (param5 != 0) {
              field_jb = null;
              return;
            } else {
              return;
            }
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
        if (super.a(param0 + 0, param1, param2, param3)) {
          return true;
        } else {
          if (param0 == -2) {
            if (null != ((oh) this).field_hb) {
              L0: {
                if (param1 == -99) {
                  boolean discarded$8 = ((oh) this).field_hb.a(param2, -61);
                  break L0;
                } else {
                  break L0;
                }
              }
              if (-100 != param1) {
                return false;
              } else {
                boolean discarded$9 = ((oh) this).field_hb.a(param2, -70);
                return false;
              }
            } else {
              return false;
            }
          } else {
            ((oh) this).l(118);
            if (null != ((oh) this).field_hb) {
              L1: {
                if (param1 == -99) {
                  boolean discarded$10 = ((oh) this).field_hb.a(param2, -61);
                  break L1;
                } else {
                  break L1;
                }
              }
              if (-100 != param1) {
                return false;
              } else {
                boolean discarded$11 = ((oh) this).field_hb.a(param2, -70);
                return false;
              }
            } else {
              return false;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_db = 50;
        field_jb = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
