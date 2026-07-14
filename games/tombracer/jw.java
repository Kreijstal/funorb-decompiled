/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class jw extends b implements cd, tsa {
    private rj field_y;
    private tra field_A;
    private boolean field_w;
    private String field_F;
    private rj field_E;
    private rj field_B;
    static int[] field_z;
    private boolean field_x;
    private boolean field_D;
    private tra field_C;

    jw(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (isa) null);
        td var6 = null;
        il var7 = null;
        String var8 = null;
        nl var9 = null;
        jsa var12 = null;
        jsa var13 = null;
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
        Object stackIn_15_0 = null;
        rj stackIn_15_1 = null;
        rj stackIn_15_2 = null;
        Object stackIn_16_0 = null;
        rj stackIn_16_1 = null;
        rj stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        rj stackIn_17_1 = null;
        rj stackIn_17_2 = null;
        String stackIn_17_3 = null;
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
        Object stackOut_14_0 = null;
        rj stackOut_14_1 = null;
        rj stackOut_14_2 = null;
        Object stackOut_16_0 = null;
        rj stackOut_16_1 = null;
        rj stackOut_16_2 = null;
        String stackOut_16_3 = null;
        Object stackOut_15_0 = null;
        rj stackOut_15_1 = null;
        rj stackOut_15_2 = null;
        String stackOut_15_3 = null;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param4) {
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
          ((jw) this).field_w = stackIn_3_1 != 0;
          ((jw) this).field_F = param1;
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (!param2) {
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
          ((jw) this).field_x = stackIn_6_1 != 0;
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
          ((jw) this).field_D = stackIn_9_1 != 0;
          if (!((jw) this).field_x) {
            break L3;
          } else {
            L4: {
              if (((jw) this).field_D) {
                break L4;
              } else {
                if (!((jw) this).field_w) {
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
          ((jw) this).field_A = (tra) (Object) new so(param0, (qc) this, 100);
          ((jw) this).field_C = (tra) (Object) new so("", (qc) this, 20);
          if (((jw) this).field_x) {
            ((jw) this).field_B = new rj(nga.field_q, (qc) null);
            ((jw) this).field_y = new rj(nj.field_q, (qc) null);
            ((jw) this).field_A.field_y = false;
            break L5;
          } else {
            L6: {
              ((jw) this).field_B = new rj(goa.field_c, (qc) null);
              stackOut_14_0 = this;
              stackOut_14_1 = null;
              stackOut_14_2 = null;
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              if (!((jw) this).field_w) {
                stackOut_16_0 = this;
                stackOut_16_1 = null;
                stackOut_16_2 = null;
                stackOut_16_3 = sm.field_o;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                stackIn_17_2 = stackOut_16_2;
                stackIn_17_3 = stackOut_16_3;
                break L6;
              } else {
                stackOut_15_0 = this;
                stackOut_15_1 = null;
                stackOut_15_2 = null;
                stackOut_15_3 = fca.field_d;
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                stackIn_17_2 = stackOut_15_2;
                stackIn_17_3 = stackOut_15_3;
                break L6;
              }
            }
            new rj(stackIn_17_3, (qc) null);
            ((jw) this).field_y = stackIn_17_1;
            if (!((jw) this).field_D) {
              break L5;
            } else {
              ((jw) this).field_E = new rj(foa.field_a, (qc) this);
              break L5;
            }
          }
        }
        L7: {
          ((jw) this).field_A.field_r = (isa) (Object) new hga(10000536);
          ((jw) this).field_C.field_r = (isa) (Object) new poa(10000536);
          var6 = new td();
          ((jw) this).field_B.field_r = (isa) (Object) var6;
          if (((jw) this).field_y == null) {
            break L7;
          } else {
            ((jw) this).field_y.field_r = (isa) (Object) var6;
            break L7;
          }
        }
        L8: {
          ((jw) this).field_A.field_q = kma.field_a;
          if (((jw) this).field_E == null) {
            break L8;
          } else {
            ((jw) this).field_E.field_r = (isa) (Object) var6;
            break L8;
          }
        }
        L9: {
          if (null == ((jw) this).field_E) {
            break L9;
          } else {
            ((jw) this).field_E.field_q = hga.field_n;
            break L9;
          }
        }
        L10: {
          if (!((jw) this).field_x) {
            if (!((jw) this).field_w) {
              ((jw) this).field_y.field_r = (isa) (Object) new kaa();
              break L10;
            } else {
              ((jw) this).field_y.field_q = tg.field_a;
              ((jw) this).field_y.field_r = (isa) (Object) new kaa();
              break L10;
            }
          } else {
            ((jw) this).field_y.field_q = koa.field_c;
            break L10;
          }
        }
        L11: {
          ((jw) this).field_n = 15;
          var7 = mj.field_J;
          if (null == ((jw) this).field_F) {
            break L11;
          } else {
            ((jw) this).field_n = ((jw) this).field_n + (var7.a(((jw) this).field_F, ((jw) this).field_m - 40, var7.field_w) + 5);
            break L11;
          }
        }
        L12: {
          var8 = c.field_h;
          var9 = cc.a((byte) 122, di.a(28));
          if (vw.field_a != var9) {
            if (var9 != ub.field_d) {
              break L12;
            } else {
              var8 = ppa.field_a;
              break L12;
            }
          } else {
            var8 = daa.field_c;
            break L12;
          }
        }
        L13: {
          var12 = new jsa(10, ((jw) this).field_n, -20 + ((jw) this).field_m, 25, (ae) (Object) ((jw) this).field_A, false, 80, 3, var7, 16777215, var8);
          ((jw) this).a((ae) (Object) new jsa(10, ((jw) this).field_n, -20 + ((jw) this).field_m, 25, (ae) (Object) ((jw) this).field_A, false, 80, 3, var7, 16777215, var8), -1);
          ((jw) this).field_n = ((jw) this).field_n + (((ae) (Object) var12).field_p + 5);
          var13 = new jsa(10, ((jw) this).field_n, -20 + ((jw) this).field_m, 25, (ae) (Object) ((jw) this).field_C, false, 80, 3, var7, 16777215, rta.field_j);
          ((jw) this).a((ae) (Object) new jsa(10, ((jw) this).field_n, -20 + ((jw) this).field_m, 25, (ae) (Object) ((jw) this).field_C, false, 80, 3, var7, 16777215, rta.field_j), -1);
          ((jw) this).field_n = ((jw) this).field_n + (((ae) (Object) var13).field_p - -5);
          ((jw) this).field_B.field_h = (qc) this;
          if (((jw) this).field_E == null) {
            break L13;
          } else {
            ((jw) this).field_E.field_h = (qc) this;
            break L13;
          }
        }
        L14: {
          if (null == ((jw) this).field_y) {
            break L14;
          } else {
            ((jw) this).field_y.field_h = (qc) this;
            break L14;
          }
        }
        L15: {
          if (((jw) this).field_E != null) {
            ((jw) this).field_B.a((byte) -31, ((jw) this).field_m - 95, 30, 85, ((jw) this).field_n);
            ((jw) this).field_n = ((jw) this).field_n + 60;
            break L15;
          } else {
            ((jw) this).field_B.a((byte) -31, -10 + (((jw) this).field_m + -6), 30, 8, ((jw) this).field_n);
            ((jw) this).field_n = ((jw) this).field_n + 35;
            break L15;
          }
        }
        L16: {
          if (((jw) this).field_E == null) {
            break L16;
          } else {
            ((jw) this).field_E.a((byte) -31, -10 + (((jw) this).field_m + -6), 30, 8, ((jw) this).field_n);
            ((jw) this).field_n = ((jw) this).field_n + 35;
            break L16;
          }
        }
        L17: {
          if (((jw) this).field_y == null) {
            break L17;
          } else {
            L18: {
              if (((jw) this).field_x) {
                break L18;
              } else {
                if (((jw) this).field_w) {
                  break L18;
                } else {
                  ((jw) this).field_y.a((byte) -31, 40, 20, 8, ((jw) this).field_n);
                  ((jw) this).field_n = ((jw) this).field_n + 25;
                  break L17;
                }
              }
            }
            ((jw) this).field_y.a((byte) -31, -6 + ((jw) this).field_m + -10, 30, 8, ((jw) this).field_n);
            ((jw) this).field_n = ((jw) this).field_n + 35;
            break L17;
          }
        }
        L19: {
          ((jw) this).a((byte) -31, ((jw) this).field_m, 3 + ((jw) this).field_n, 0, 0);
          ((jw) this).a((ae) (Object) ((jw) this).field_B, -1);
          if (((jw) this).field_E == null) {
            break L19;
          } else {
            ((jw) this).a((ae) (Object) ((jw) this).field_E, -1);
            break L19;
          }
        }
        L20: {
          if (null == ((jw) this).field_y) {
            break L20;
          } else {
            ((jw) this).a((ae) (Object) ((jw) this).field_y, -1);
            break L20;
          }
        }
    }

    public static void c(int param0) {
        field_z = null;
        int var1 = -9 % ((34 - param0) / 46);
    }

    public final void a(int param0, int param1, rj param2, int param3, byte param4) {
        int var7 = 0;
        Object var8 = null;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          if (param2 != ((jw) this).field_B) {
            if (param2 != ((jw) this).field_E) {
              if (param2 != ((jw) this).field_y) {
                break L0;
              } else {
                if (((jw) this).field_x) {
                  eo.q(83);
                  break L0;
                } else {
                  if (!((jw) this).field_w) {
                    jga.b(50);
                    break L0;
                  } else {
                    gqa.a((byte) 62);
                    break L0;
                  }
                }
              }
            } else {
              qfa.a((byte) 6);
              break L0;
            }
          } else {
            this.i((byte) 85);
            break L0;
          }
        }
        L1: {
          if (param4 > 44) {
            break L1;
          } else {
            var8 = null;
            ((jw) this).a((String) null, -88);
            break L1;
          }
        }
    }

    public final void a(tra param0, int param1) {
        if (param1 != -10) {
            field_z = null;
        }
    }

    final void a(String param0, int param1) {
        tra var3 = ((jw) this).field_A;
        String var4 = param0;
        var3.a(false, -16719, var4);
        if (param1 < 121) {
            jw.c(-98);
        }
        ((jw) this).field_C.f(-10);
    }

    private final void i(byte param0) {
        if (param0 < 27) {
          return;
        } else {
          L0: {
            L1: {
              if (foa.a((byte) 91)) {
                break L1;
              } else {
                if (((jw) this).field_A.field_o.length() <= 0) {
                  break L0;
                } else {
                  if (((jw) this).field_C.field_o.length() <= 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            rt.a(true, ((jw) this).field_A.field_o, ((jw) this).field_C.field_o);
            break L0;
          }
          return;
        }
    }

    final void a(byte param0) {
        if (param0 != -92) {
            ((jw) this).field_w = false;
        }
        ((jw) this).field_A.f(-121);
        ((jw) this).field_C.f(param0 ^ 34);
    }

    final boolean a(char param0, ae param1, int param2, boolean param3) {
        if (!super.a(param0, param1, param2, param3)) {
          if (-99 == param2) {
            return ((jw) this).b(param1, (byte) -81);
          } else {
            if (-100 == param2) {
              return ((jw) this).a(param1, (byte) -9);
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (null != ((jw) this).field_F) {
            int discarded$0 = mj.field_J.a(((jw) this).field_F, param0 + (((jw) this).field_i + 20), param1 + ((jw) this).field_n + 15, ((jw) this).field_m + -40, ((jw) this).field_p, 16777215, -1, 1, 0, mj.field_J.field_w);
        }
        if (!(((jw) this).field_E == null)) {
            bea.c(param0 - -10, param1 + 134, ((jw) this).field_m - 20, 4210752);
        }
        super.a(param0, param1, param2 + param2, param3);
    }

    public final void a(int param0, tra param1) {
        if (param0 != -6038) {
            ((jw) this).field_A = null;
        }
        if (((jw) this).field_A == param1) {
            boolean discarded$0 = ((jw) this).field_C.a((ae) this, false);
        }
        if (param1 == ((jw) this).field_C) {
            this.i((byte) 60);
        }
    }

    final String a(int param0) {
        if (((jw) this).field_A.field_o == null) {
          return "";
        } else {
          L0: {
            if (param0 >= 29) {
              break L0;
            } else {
              ((jw) this).a(-72, 15, 19, 125);
              break L0;
            }
          }
          return ((jw) this).field_A.field_o;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = new int[]{99, 179, 108, 280, 219, 303, 398, 439, 500};
    }
}
