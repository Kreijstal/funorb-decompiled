/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ui extends ch implements pe, tb {
    static ko field_U;
    private fe field_S;
    private fe field_W;
    private String field_T;
    private sl field_R;
    private boolean field_Y;
    private boolean field_O;
    private fe field_X;
    private boolean field_P;
    static String field_ab;
    static String field_N;
    private sl field_Q;
    static String field_Z;
    static int[] field_V;

    public final void a(sl param0, boolean param1) {
        if (param0 == ((ui) this).field_R) {
            boolean discarded$0 = ((ui) this).field_Q.a((ei) this, (byte) 115);
        }
        if (!(param0 != ((ui) this).field_Q)) {
            this.i(-1);
        }
        if (param1) {
            ((ui) this).field_Q = null;
        }
    }

    final String h(int param0) {
        if (param0 >= -99) {
            field_ab = null;
        }
        if (!(null != ((ui) this).field_R.field_m)) {
            return "";
        }
        return ((ui) this).field_R.field_m;
    }

    final void a(int param0, String param1) {
        sl var3 = ((ui) this).field_R;
        String var4 = param1;
        var3.a((byte) -124, false, var4);
        if (param0 != 8) {
            Object var5 = null;
            ui.a((byte) -7, (String) null, (String) null);
        }
        ((ui) this).field_Q.f(88);
    }

    ui(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (fp) null);
        ng var6 = null;
        lr var7 = null;
        String var8 = null;
        ml var9 = null;
        n var11 = null;
        n var12 = null;
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
        fe stackIn_16_1 = null;
        fe stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        fe stackIn_17_1 = null;
        fe stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        fe stackIn_18_1 = null;
        fe stackIn_18_2 = null;
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
        fe stackOut_15_1 = null;
        fe stackOut_15_2 = null;
        Object stackOut_17_0 = null;
        fe stackOut_17_1 = null;
        fe stackOut_17_2 = null;
        String stackOut_17_3 = null;
        Object stackOut_16_0 = null;
        fe stackOut_16_1 = null;
        fe stackOut_16_2 = null;
        String stackOut_16_3 = null;
        L0: {
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
          ((ui) this).field_P = stackIn_3_1 != 0;
          ((ui) this).field_T = param1;
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
          ((ui) this).field_O = stackIn_6_1 != 0;
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
          ((ui) this).field_Y = stackIn_9_1 != 0;
          if (!((ui) this).field_P) {
            break L3;
          } else {
            L4: {
              if (((ui) this).field_Y) {
                break L4;
              } else {
                if (!((ui) this).field_O) {
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
          ((ui) this).field_R = (sl) (Object) new ga(param0, (cc) this, 100);
          ((ui) this).field_Q = (sl) (Object) new ga("", (cc) this, 20);
          if (!((ui) this).field_P) {
            L6: {
              ((ui) this).field_S = new fe(sa.field_y, (cc) null);
              stackOut_15_0 = this;
              stackOut_15_1 = null;
              stackOut_15_2 = null;
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              if (((ui) this).field_O) {
                stackOut_17_0 = this;
                stackOut_17_1 = null;
                stackOut_17_2 = null;
                stackOut_17_3 = va.field_O;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                stackIn_18_2 = stackOut_17_2;
                stackIn_18_3 = stackOut_17_3;
                break L6;
              } else {
                stackOut_16_0 = this;
                stackOut_16_1 = null;
                stackOut_16_2 = null;
                stackOut_16_3 = jk.field_a;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_18_2 = stackOut_16_2;
                stackIn_18_3 = stackOut_16_3;
                break L6;
              }
            }
            ((ui) this).field_X = new fe(stackIn_18_3, (cc) null);
            if (!((ui) this).field_Y) {
              break L5;
            } else {
              ((ui) this).field_W = new fe(ad.field_t, (cc) this);
              break L5;
            }
          } else {
            ((ui) this).field_S = new fe(ap.field_F, (cc) null);
            ((ui) this).field_X = new fe(dj.field_e, (cc) null);
            ((ui) this).field_R.field_I = false;
            break L5;
          }
        }
        L7: {
          ((ui) this).field_R.field_z = (fp) (Object) new om(10000536);
          ((ui) this).field_Q.field_z = (fp) (Object) new sm(10000536);
          var6 = new ng();
          ((ui) this).field_S.field_z = (fp) (Object) var6;
          if (((ui) this).field_X == null) {
            break L7;
          } else {
            ((ui) this).field_X.field_z = (fp) (Object) var6;
            break L7;
          }
        }
        L8: {
          ((ui) this).field_R.field_p = pn.field_a;
          if (null == ((ui) this).field_W) {
            break L8;
          } else {
            ((ui) this).field_W.field_z = (fp) (Object) var6;
            break L8;
          }
        }
        L9: {
          if (((ui) this).field_W == null) {
            break L9;
          } else {
            ((ui) this).field_W.field_p = fc.field_d;
            break L9;
          }
        }
        L10: {
          if (!((ui) this).field_P) {
            if (((ui) this).field_O) {
              ((ui) this).field_X.field_p = lh.field_h;
              ((ui) this).field_X.field_z = (fp) (Object) new pd();
              break L10;
            } else {
              ((ui) this).field_X.field_z = (fp) (Object) new pd();
              break L10;
            }
          } else {
            ((ui) this).field_X.field_p = wg.field_Ob;
            break L10;
          }
        }
        L11: {
          ((ui) this).field_D = 15;
          var7 = lc.field_O;
          if (((ui) this).field_T == null) {
            break L11;
          } else {
            ((ui) this).field_D = ((ui) this).field_D + (5 + var7.b(((ui) this).field_T, -40 + ((ui) this).field_l, var7.field_C));
            break L11;
          }
        }
        L12: {
          var8 = vi.field_d;
          var9 = aj.a(hk.d(76), 5137);
          if (var9 == eo.field_Xb) {
            var8 = wm.field_Qb;
            break L12;
          } else {
            if (var9 != ug.field_v) {
              break L12;
            } else {
              var8 = qp.field_Ob;
              break L12;
            }
          }
        }
        L13: {
          n dupTemp$2 = new n(10, ((ui) this).field_D, -20 + ((ui) this).field_l, 25, (ei) (Object) ((ui) this).field_R, false, 80, 3, var7, 16777215, var8);
          var11 = dupTemp$2;
          ((ui) this).a(true, (ei) (Object) dupTemp$2);
          ((ui) this).field_D = ((ui) this).field_D + (((ei) (Object) var11).field_y + 5);
          n dupTemp$3 = new n(10, ((ui) this).field_D, -20 + ((ui) this).field_l, 25, (ei) (Object) ((ui) this).field_Q, false, 80, 3, var7, 16777215, to.field_n);
          var12 = dupTemp$3;
          ((ui) this).a(true, (ei) (Object) dupTemp$3);
          ((ui) this).field_D = ((ui) this).field_D + (5 + ((ei) (Object) var12).field_y);
          ((ui) this).field_S.field_t = (cc) this;
          if (((ui) this).field_W == null) {
            break L13;
          } else {
            ((ui) this).field_W.field_t = (cc) this;
            break L13;
          }
        }
        L14: {
          if (((ui) this).field_X == null) {
            break L14;
          } else {
            ((ui) this).field_X.field_t = (cc) this;
            break L14;
          }
        }
        L15: {
          if (((ui) this).field_W == null) {
            ((ui) this).field_S.a(((ui) this).field_l + -6 + -10, 8, 30, false, ((ui) this).field_D);
            ((ui) this).field_D = ((ui) this).field_D + 35;
            break L15;
          } else {
            ((ui) this).field_S.a(((ui) this).field_l + -95, 85, 30, false, ((ui) this).field_D);
            ((ui) this).field_D = ((ui) this).field_D + 60;
            break L15;
          }
        }
        L16: {
          if (null == ((ui) this).field_W) {
            break L16;
          } else {
            ((ui) this).field_W.a(-10 + ((ui) this).field_l + -6, 8, 30, false, ((ui) this).field_D);
            ((ui) this).field_D = ((ui) this).field_D + 35;
            break L16;
          }
        }
        L17: {
          if (null == ((ui) this).field_X) {
            break L17;
          } else {
            L18: {
              if (((ui) this).field_P) {
                break L18;
              } else {
                if (!((ui) this).field_O) {
                  ((ui) this).field_X.a(40, 8, 20, false, ((ui) this).field_D);
                  ((ui) this).field_D = ((ui) this).field_D + 25;
                  break L17;
                } else {
                  break L18;
                }
              }
            }
            ((ui) this).field_X.a(-6 + ((ui) this).field_l - 10, 8, 30, false, ((ui) this).field_D);
            ((ui) this).field_D = ((ui) this).field_D + 35;
            break L17;
          }
        }
        L19: {
          ((ui) this).a(((ui) this).field_l, 0, 3 + ((ui) this).field_D, false, 0);
          ((ui) this).a(true, (ei) (Object) ((ui) this).field_S);
          if (((ui) this).field_W == null) {
            break L19;
          } else {
            ((ui) this).a(true, (ei) (Object) ((ui) this).field_W);
            break L19;
          }
        }
        L20: {
          if (null == ((ui) this).field_X) {
            break L20;
          } else {
            ((ui) this).a(true, (ei) (Object) ((ui) this).field_X);
            break L20;
          }
        }
    }

    final boolean a(char param0, int param1, boolean param2, ei param3) {
        if (super.a(param0, param1, param2, param3)) {
            return true;
        }
        if (-99 == (param1 ^ -1)) {
            return ((ui) this).a(param3, 3);
        }
        if (-100 == (param1 ^ -1)) {
            return ((ui) this).b(param3, 0);
        }
        return false;
    }

    final void g(byte param0) {
        ((ui) this).field_R.f(90);
        ((ui) this).field_Q.f(100);
        if (param0 > -21) {
            ((ui) this).field_T = null;
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5 = -3 % ((param1 - -42) / 53);
        if (!(null == ((ui) this).field_T)) {
            int discarded$0 = lc.field_O.a(((ui) this).field_T, 20 + (((ui) this).field_C + param2), ((ui) this).field_D + (param3 - -15), ((ui) this).field_l - 40, ((ui) this).field_y, 16777215, -1, 1, 0, lc.field_O.field_C);
        }
        if (!(null == ((ui) this).field_W)) {
            qh.f(10 + param2, 134 + param3, -20 + ((ui) this).field_l, 4210752);
        }
        super.a(param0, (byte) 23, param2, param3);
    }

    public final void a(sl param0, int param1) {
        int var3 = 100 / ((-43 - param1) / 35);
    }

    private final void i(int param0) {
        Object var3 = null;
        L0: {
          L1: {
            if (td.a(true)) {
              break L1;
            } else {
              if (((ui) this).field_R.field_m.length() <= 0) {
                break L0;
              } else {
                if ((((ui) this).field_Q.field_m.length() ^ -1) < -1) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
          }
          ui.a((byte) 34, ((ui) this).field_R.field_m, ((ui) this).field_Q.field_m);
          break L0;
        }
        L2: {
          if (param0 == -1) {
            break L2;
          } else {
            var3 = null;
            boolean discarded$2 = ((ui) this).a('8', -107, true, (ei) null);
            break L2;
          }
        }
    }

    private final static void a(byte param0, String param1, String param2) {
        if (param0 != 34) {
            Object var4 = null;
            ui.a((byte) -59, (String) null, (String) null);
        }
        qa.a(false, param1, -102, param2);
    }

    final static int a(int param0, byte param1) {
        if (param1 <= 67) {
            return 14;
        }
        return jo.c(16, -54264319, param0);
    }

    final static void a(String param0, int param1, int param2, boolean param3, int param4) {
        aa var5 = null;
        lk var6 = null;
        int var7 = 0;
        var7 = Pool.field_O;
        var5 = new aa(ne.field_r);
        var6 = (lk) (Object) var5.b((byte) -92);
        L0: while (true) {
          if (var6 == null) {
            L1: {
              n.a(8, param0, param1, param3, param4);
              if (param2 == -6) {
                break L1;
              } else {
                field_ab = null;
                break L1;
              }
            }
            return;
          } else {
            L2: {
              if (var6.field_x == param0) {
                break L2;
              } else {
                if (var6.field_x.equals((Object) (Object) param0)) {
                  break L2;
                } else {
                  var6 = (lk) (Object) var5.b(-84);
                  continue L0;
                }
              }
            }
            return;
          }
        }
    }

    public static void a(int param0) {
        field_ab = null;
        field_V = null;
        field_Z = null;
        field_U = null;
        if (param0 != -31360) {
            return;
        }
        field_N = null;
    }

    public final void a(boolean param0, int param1, int param2, fe param3, int param4) {
        int var7 = 0;
        L0: {
          var7 = Pool.field_O;
          if (param3 != ((ui) this).field_S) {
            if (((ui) this).field_W != param3) {
              if (((ui) this).field_X == param3) {
                if (((ui) this).field_P) {
                  ib.c(-119);
                  break L0;
                } else {
                  if (!((ui) this).field_O) {
                    db.h(15158);
                    break L0;
                  } else {
                    od.a(true);
                    break L0;
                  }
                }
              } else {
                break L0;
              }
            } else {
              br.f(35);
              break L0;
            }
          } else {
            this.i(-1);
            break L0;
          }
        }
        L1: {
          if (param0) {
            break L1;
          } else {
            field_N = null;
            break L1;
          }
        }
    }

    final static void a(String param0, java.applet.Applet param1, boolean param2) {
        try {
            java.net.URL var3 = null;
            try {
                var3 = new java.net.URL(param1.getCodeBase(), param0);
                var3 = p.a((byte) -61, var3, param1);
                jc.a(-10553, param1, var3.toString(), true);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            if (param2) {
                Object var4 = null;
                ui.a((String) null, (java.applet.Applet) null, true);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_U = new ko();
        field_ab = "Updates will sent to the email address you've given";
        field_N = "To win nine-ball pool, pot the 9 ball without fouling.";
        field_Z = "Sorry, you were removed from the game you were in. This can happen if you are disconnected for too long or if the server is updated.";
    }
}
