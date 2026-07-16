/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class rl extends td implements se, m {
    private boolean field_L;
    private rh field_G;
    private rh field_O;
    static q[] field_C;
    private String field_M;
    private lb field_H;
    static kk field_D;
    static int field_N;
    private boolean field_K;
    private lb field_F;
    private boolean field_I;
    private rh field_J;

    final static kd a(int param0, boolean param1, String param2, String param3) {
        long var4 = 0L;
        Object var6 = null;
        CharSequence var7 = null;
        L0: {
          if (param0 == 20) {
            break L0;
          } else {
            field_C = null;
            break L0;
          }
        }
        L1: {
          L2: {
            var4 = 0L;
            var6 = null;
            if (0 != (param3.indexOf('@') ^ -1)) {
              break L2;
            } else {
              var7 = (CharSequence) (Object) param3;
              var4 = vh.a((byte) -81, var7);
              if (!TrackController.field_F) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          var6 = (Object) (Object) param3;
          break L1;
        }
        return ie.a(var4, param2, param1, (String) var6, (byte) -124);
    }

    final void a(byte param0, String param1) {
        if (param0 < 45) {
            ((rl) this).field_H = null;
        }
        lb var3 = ((rl) this).field_H;
        String var4 = param1;
        var3.a(false, var4, 122);
        ((rl) this).field_F.l(-68);
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (null != ((rl) this).field_M) {
            int discarded$0 = gk.field_c.a(((rl) this).field_M, param1 - -((rl) this).field_p + 20, ((rl) this).field_m + param2 + 15, ((rl) this).field_x + -40, ((rl) this).field_u, 16777215, -1, 1, 0, gk.field_c.field_G);
        }
        if (!(((rl) this).field_O == null)) {
            ll.a(param1 - -10, 134 + param2, ((rl) this).field_x + -20, 4210752);
        }
        super.a(param0, param1, param2, param3);
    }

    final void a(byte param0) {
        if (param0 < 117) {
            return;
        }
        ((rl) this).field_H.l(-73);
        ((rl) this).field_F.l(-72);
    }

    public static void b(boolean param0) {
        field_C = null;
        if (param0) {
            return;
        }
        field_D = null;
    }

    public final void a(int param0, lb param1) {
        if (param0 != -12230) {
            ((rl) this).field_I = true;
        }
    }

    rl(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (t) null);
        dc var6 = null;
        oh var7 = null;
        String var8 = null;
        bl var9 = null;
        int var11 = 0;
        sa var12 = null;
        sa var13 = null;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_16_0 = null;
        rh stackIn_16_1 = null;
        rh stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        rh stackIn_17_1 = null;
        rh stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        rh stackIn_18_1 = null;
        rh stackIn_18_2 = null;
        String stackIn_18_3 = null;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_15_0 = null;
        rh stackOut_15_1 = null;
        rh stackOut_15_2 = null;
        Object stackOut_17_0 = null;
        rh stackOut_17_1 = null;
        rh stackOut_17_2 = null;
        String stackOut_17_3 = null;
        Object stackOut_16_0 = null;
        rh stackOut_16_1 = null;
        rh stackOut_16_2 = null;
        String stackOut_16_3 = null;
        L0: {
          var11 = TrackController.field_F ? 1 : 0;
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param2) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          ((rl) this).field_L = stackIn_3_1 != 0;
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (!param4) {
            stackOut_5_0 = this;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = this;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        L2: {
          ((rl) this).field_I = stackIn_6_1 != 0;
          stackOut_6_0 = this;
          stackIn_8_0 = stackOut_6_0;
          stackIn_7_0 = stackOut_6_0;
          if (!param3) {
            stackOut_8_0 = this;
            stackOut_8_1 = 0;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            break L2;
          } else {
            stackOut_7_0 = this;
            stackOut_7_1 = 1;
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            break L2;
          }
        }
        L3: {
          ((rl) this).field_K = stackIn_9_1 != 0;
          ((rl) this).field_M = param1;
          if (!((rl) this).field_L) {
            break L3;
          } else {
            L4: {
              if (((rl) this).field_K) {
                break L4;
              } else {
                if (!((rl) this).field_I) {
                  break L3;
                } else {
                  break L4;
                }
              }
            }
            throw new IllegalStateException();
          }
        }
        L5: {
          L6: {
            ((rl) this).field_H = (lb) (Object) new lf(param0, (tg) this, 100);
            ((rl) this).field_F = (lb) (Object) new lf("", (tg) this, 20);
            if (!((rl) this).field_L) {
              break L6;
            } else {
              ((rl) this).field_G = new rh(ib.field_c, (tg) null);
              ((rl) this).field_J = new rh(cg.field_b, (tg) null);
              ((rl) this).field_H.field_B = false;
              if (var11 == 0) {
                break L5;
              } else {
                break L6;
              }
            }
          }
          L7: {
            ((rl) this).field_G = new rh(nd.field_H, (tg) null);
            stackOut_15_0 = this;
            stackOut_15_1 = null;
            stackOut_15_2 = null;
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_17_2 = stackOut_15_2;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            stackIn_16_2 = stackOut_15_2;
            if (!((rl) this).field_I) {
              stackOut_17_0 = this;
              stackOut_17_1 = null;
              stackOut_17_2 = null;
              stackOut_17_3 = ea.field_p;
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              stackIn_18_3 = stackOut_17_3;
              break L7;
            } else {
              stackOut_16_0 = this;
              stackOut_16_1 = null;
              stackOut_16_2 = null;
              stackOut_16_3 = v.field_d;
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              stackIn_18_3 = stackOut_16_3;
              break L7;
            }
          }
          ((rl) this).field_J = new rh(stackIn_18_3, (tg) null);
          if (!((rl) this).field_K) {
            break L5;
          } else {
            ((rl) this).field_O = new rh(md.field_f, (tg) this);
            break L5;
          }
        }
        L8: {
          ((rl) this).field_H.field_y = (t) (Object) new dd(10000536);
          ((rl) this).field_F.field_y = (t) (Object) new ql(10000536);
          var6 = new dc();
          ((rl) this).field_G.field_y = (t) (Object) var6;
          if (((rl) this).field_J == null) {
            break L8;
          } else {
            ((rl) this).field_J.field_y = (t) (Object) var6;
            break L8;
          }
        }
        L9: {
          if (null == ((rl) this).field_O) {
            break L9;
          } else {
            ((rl) this).field_O.field_y = (t) (Object) var6;
            break L9;
          }
        }
        L10: {
          ((rl) this).field_H.field_n = ie.field_a;
          if (((rl) this).field_O == null) {
            break L10;
          } else {
            ((rl) this).field_O.field_n = ic.field_g;
            break L10;
          }
        }
        L11: {
          L12: {
            if (!((rl) this).field_L) {
              break L12;
            } else {
              ((rl) this).field_J.field_n = lc.field_E;
              if (var11 == 0) {
                break L11;
              } else {
                break L12;
              }
            }
          }
          L13: {
            if (!((rl) this).field_I) {
              break L13;
            } else {
              ((rl) this).field_J.field_n = kh.field_b;
              ((rl) this).field_J.field_y = (t) (Object) new ne();
              break L13;
            }
          }
          ((rl) this).field_J.field_y = (t) (Object) new ne();
          break L11;
        }
        L14: {
          ((rl) this).field_m = 15;
          var7 = gk.field_c;
          if (((rl) this).field_M == null) {
            break L14;
          } else {
            ((rl) this).field_m = ((rl) this).field_m + (var7.a(((rl) this).field_M, -40 + ((rl) this).field_x, var7.field_G) - -5);
            break L14;
          }
        }
        L15: {
          L16: {
            var8 = ai.field_i;
            var9 = gj.a(100, gd.b((byte) 77));
            if (rd.field_o != var9) {
              break L16;
            } else {
              var8 = re.field_m;
              if (var11 == 0) {
                break L15;
              } else {
                break L16;
              }
            }
          }
          if (qi.field_f != var9) {
            break L15;
          } else {
            var8 = nb.field_q;
            break L15;
          }
        }
        L17: {
          sa dupTemp$2 = new sa(10, ((rl) this).field_m, ((rl) this).field_x + -20, 25, (al) (Object) ((rl) this).field_H, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$2;
          ((rl) this).a(false, (al) (Object) dupTemp$2);
          ((rl) this).field_m = ((rl) this).field_m + (5 + ((al) (Object) var12).field_u);
          sa dupTemp$3 = new sa(10, ((rl) this).field_m, ((rl) this).field_x - 20, 25, (al) (Object) ((rl) this).field_F, false, 80, 3, var7, 16777215, rf.field_d);
          var13 = dupTemp$3;
          ((rl) this).a(false, (al) (Object) dupTemp$3);
          ((rl) this).field_m = ((rl) this).field_m + (5 + ((al) (Object) var13).field_u);
          ((rl) this).field_G.field_l = (tg) this;
          if (null == ((rl) this).field_O) {
            break L17;
          } else {
            ((rl) this).field_O.field_l = (tg) this;
            break L17;
          }
        }
        L18: {
          if (((rl) this).field_J == null) {
            break L18;
          } else {
            ((rl) this).field_J.field_l = (tg) this;
            break L18;
          }
        }
        L19: {
          L20: {
            if (((rl) this).field_O == null) {
              break L20;
            } else {
              ((rl) this).field_G.a(30, -3050, ((rl) this).field_m, -95 + ((rl) this).field_x, 85);
              ((rl) this).field_m = ((rl) this).field_m + 60;
              if (var11 == 0) {
                break L19;
              } else {
                break L20;
              }
            }
          }
          ((rl) this).field_G.a(30, -3050, ((rl) this).field_m, -10 + (-6 + ((rl) this).field_x), 8);
          ((rl) this).field_m = ((rl) this).field_m + 35;
          break L19;
        }
        L21: {
          if (null == ((rl) this).field_O) {
            break L21;
          } else {
            ((rl) this).field_O.a(30, -3050, ((rl) this).field_m, ((rl) this).field_x + -16, 8);
            ((rl) this).field_m = ((rl) this).field_m + 35;
            break L21;
          }
        }
        L22: {
          if (((rl) this).field_J == null) {
            break L22;
          } else {
            L23: {
              L24: {
                if (((rl) this).field_L) {
                  break L24;
                } else {
                  if (!((rl) this).field_I) {
                    break L23;
                  } else {
                    break L24;
                  }
                }
              }
              ((rl) this).field_J.a(30, -3050, ((rl) this).field_m, -16 + ((rl) this).field_x, 8);
              ((rl) this).field_m = ((rl) this).field_m + 35;
              if (var11 == 0) {
                break L22;
              } else {
                break L23;
              }
            }
            ((rl) this).field_J.a(20, -3050, ((rl) this).field_m, 40, 8);
            ((rl) this).field_m = ((rl) this).field_m + 25;
            break L22;
          }
        }
        L25: {
          ((rl) this).a(((rl) this).field_m + 3, -3050, 0, ((rl) this).field_x, 0);
          ((rl) this).a(false, (al) (Object) ((rl) this).field_G);
          if (((rl) this).field_O == null) {
            break L25;
          } else {
            ((rl) this).a(false, (al) (Object) ((rl) this).field_O);
            break L25;
          }
        }
        L26: {
          if (((rl) this).field_J == null) {
            break L26;
          } else {
            ((rl) this).a(false, (al) (Object) ((rl) this).field_J);
            break L26;
          }
        }
    }

    final boolean a(byte param0, char param1, al param2, int param3) {
        if (!(!super.a((byte) -38, param1, param2, param3))) {
            return true;
        }
        if ((param3 ^ -1) == -99) {
            return ((rl) this).a(param2, -45);
        }
        if (!(param3 != 99)) {
            return ((rl) this).a(param2, true);
        }
        int var5 = -54 / ((17 - param0) / 51);
        return false;
    }

    private final void c(boolean param0) {
        L0: {
          L1: {
            if (kk.b((byte) -128)) {
              break L1;
            } else {
              if (0 >= ((rl) this).field_H.field_s.length()) {
                break L0;
              } else {
                if (((rl) this).field_F.field_s.length() <= 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          vh.a(((rl) this).field_H.field_s, 224, ((rl) this).field_F.field_s);
          break L0;
        }
        L2: {
          if (!param0) {
            break L2;
          } else {
            this.c(true);
            break L2;
          }
        }
    }

    public final void b(int param0, lb param1) {
        L0: {
          if (((rl) this).field_H == param1) {
            boolean discarded$2 = ((rl) this).field_F.a((byte) -108, (al) this);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 >= -23) {
          return;
        } else {
          L1: {
            if (((rl) this).field_F != param1) {
              break L1;
            } else {
              this.c(false);
              break L1;
            }
          }
          return;
        }
    }

    public final void a(rh param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        L0: {
          var7 = TrackController.field_F ? 1 : 0;
          if (((rl) this).field_G != param0) {
            L1: {
              if (param0 != ((rl) this).field_O) {
                break L1;
              } else {
                lb.o(-127);
                if (var7 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (param0 != ((rl) this).field_J) {
              break L0;
            } else {
              L2: {
                if (!((rl) this).field_L) {
                  break L2;
                } else {
                  ti.a((byte) -58);
                  break L2;
                }
              }
              L3: {
                if (!((rl) this).field_I) {
                  break L3;
                } else {
                  hl.m(param4 ^ 1217388583);
                  break L3;
                }
              }
              ie.a((byte) 93);
              this.c(false);
              break L0;
            }
          } else {
            this.c(false);
            break L0;
          }
        }
        L4: {
          if (param4 == -27322) {
            break L4;
          } else {
            ((rl) this).field_O = null;
            break L4;
          }
        }
    }

    final String d(boolean param0) {
        if (!(null != ((rl) this).field_H.field_s)) {
            return "";
        }
        if (!param0) {
            return null;
        }
        return ((rl) this).field_H.field_s;
    }

    static {
    }
}
