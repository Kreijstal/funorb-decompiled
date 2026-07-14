/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w extends ga implements uj, el {
    private boolean field_L;
    private rg field_P;
    static int[] field_R;
    private boolean field_W;
    private boolean field_S;
    static String field_Q;
    private String field_H;
    private rg field_U;
    private ul field_X;
    private rg field_V;
    private ul field_T;

    private final void a(byte param0) {
        if (param0 != -65) {
            ((w) this).field_U = null;
        }
        if (!hh.a(param0 ^ 13676)) {
            // ifle L82
            // if_icmpge L82
        }
        rm.a(((w) this).field_T.field_B, (byte) 38, ((w) this).field_X.field_B);
    }

    public final void a(int param0, int param1, int param2, rg param3, int param4) {
        int var7 = 0;
        var7 = Confined.field_J ? 1 : 0;
        if (param0 <= 68) {
          return;
        } else {
          L0: {
            if (((w) this).field_V != param3) {
              if (param3 != ((w) this).field_P) {
                if (((w) this).field_U != param3) {
                  break L0;
                } else {
                  if (!((w) this).field_W) {
                    if (!((w) this).field_L) {
                      um.a((byte) -126);
                      break L0;
                    } else {
                      ke.g((byte) -120);
                      break L0;
                    }
                  } else {
                    wa.a(-20683);
                    break L0;
                  }
                }
              } else {
                jl.a((byte) -123);
                break L0;
              }
            } else {
              this.a((byte) -65);
              break L0;
            }
          }
          return;
        }
    }

    final void g(byte param0) {
        ((w) this).field_T.l((byte) 115);
        if (param0 != -104) {
            Object var3 = null;
            ((w) this).a(-119, (String) null);
        }
        ((w) this).field_X.l((byte) 90);
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (!(((w) this).field_H == null)) {
            int discarded$0 = gm.field_cb.a(((w) this).field_H, 20 + (param3 + ((w) this).field_q), ((w) this).field_m + param0 - -15, -40 + ((w) this).field_F, ((w) this).field_z, 16777215, -1, 1, 0, gm.field_cb.field_C);
        }
        if (param2 < 36) {
            w.k(-83);
        }
        if (!(null == ((w) this).field_P)) {
            fn.b(param3 + 10, 134 + param0, ((w) this).field_F - 20, 4210752);
        }
        super.a(param0, param1, (byte) 61, param3);
    }

    public final void a(ul param0, byte param1) {
        if (((w) this).field_T == param0) {
            boolean discarded$0 = ((w) this).field_X.a((fj) this, 418);
        }
        if (!(param0 != ((w) this).field_X)) {
            this.a((byte) -65);
        }
        if (param1 != 83) {
            w.k(88);
        }
    }

    final boolean a(fj param0, byte param1, int param2, char param3) {
        int var5 = 0;
        if (!super.a(param0, (byte) -48, param2, param3)) {
          if (98 == param2) {
            return ((w) this).c(param0, 32);
          } else {
            var5 = 89 % ((param1 - 47) / 43);
            if ((param2 ^ -1) == -100) {
              return ((w) this).a(17731, param0);
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    public final void a(int param0, ul param1) {
        if (param0 != 32175) {
            Object var4 = null;
            boolean discarded$0 = ((w) this).a((fj) null, (byte) 37, 92, '8');
        }
    }

    final void a(int param0, String param1) {
        if (param0 != 0) {
            return;
        }
        ul var3 = ((w) this).field_T;
        String var4 = param1;
        var3.a(false, false, var4);
        ((w) this).field_X.l((byte) 110);
    }

    public static void k(int param0) {
        field_Q = null;
        field_R = null;
        if (param0 != 1) {
            w.k(50);
        }
    }

    final String j(int param0) {
        if (param0 > -97) {
            return null;
        }
        if (null == ((w) this).field_T.field_B) {
            return "";
        }
        return ((w) this).field_T.field_B;
    }

    w(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (fe) null);
        je var6 = null;
        ok var7 = null;
        String var8 = null;
        al var9 = null;
        la var12 = null;
        la var13 = null;
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
        rg stackIn_16_1 = null;
        rg stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        rg stackIn_17_1 = null;
        rg stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        rg stackIn_18_1 = null;
        rg stackIn_18_2 = null;
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
        rg stackOut_15_1 = null;
        rg stackOut_15_2 = null;
        Object stackOut_17_0 = null;
        rg stackOut_17_1 = null;
        rg stackOut_17_2 = null;
        String stackOut_17_3 = null;
        Object stackOut_16_0 = null;
        rg stackOut_16_1 = null;
        rg stackOut_16_2 = null;
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
          ((w) this).field_W = stackIn_3_1 != 0;
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (!param3) {
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
          ((w) this).field_S = stackIn_6_1 != 0;
          ((w) this).field_H = param1;
          stackOut_6_0 = this;
          stackIn_8_0 = stackOut_6_0;
          stackIn_7_0 = stackOut_6_0;
          if (!param4) {
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
          ((w) this).field_L = stackIn_9_1 != 0;
          if (!((w) this).field_W) {
            break L3;
          } else {
            L4: {
              if (((w) this).field_S) {
                break L4;
              } else {
                if (!((w) this).field_L) {
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
          ((w) this).field_T = (ul) (Object) new wh(param0, (uk) this, 100);
          ((w) this).field_X = (ul) (Object) new wh("", (uk) this, 20);
          if (!((w) this).field_W) {
            L6: {
              ((w) this).field_V = new rg(o.field_d, (uk) null);
              stackOut_15_0 = this;
              stackOut_15_1 = null;
              stackOut_15_2 = null;
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              if (!((w) this).field_L) {
                stackOut_17_0 = this;
                stackOut_17_1 = null;
                stackOut_17_2 = null;
                stackOut_17_3 = te.field_i;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                stackIn_18_2 = stackOut_17_2;
                stackIn_18_3 = stackOut_17_3;
                break L6;
              } else {
                stackOut_16_0 = this;
                stackOut_16_1 = null;
                stackOut_16_2 = null;
                stackOut_16_3 = ug.field_cb;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_18_2 = stackOut_16_2;
                stackIn_18_3 = stackOut_16_3;
                break L6;
              }
            }
            new rg(stackIn_18_3, (uk) null);
            ((w) this).field_U = stackIn_18_1;
            if (!((w) this).field_S) {
              break L5;
            } else {
              ((w) this).field_P = new rg(ej.field_c, (uk) this);
              break L5;
            }
          } else {
            ((w) this).field_V = new rg(aa.field_a, (uk) null);
            ((w) this).field_U = new rg(al.field_c, (uk) null);
            ((w) this).field_T.field_L = false;
            break L5;
          }
        }
        L7: {
          ((w) this).field_T.field_n = (fe) (Object) new db(10000536);
          ((w) this).field_X.field_n = (fe) (Object) new qm(10000536);
          var6 = new je();
          ((w) this).field_V.field_n = (fe) (Object) var6;
          if (((w) this).field_U == null) {
            break L7;
          } else {
            ((w) this).field_U.field_n = (fe) (Object) var6;
            break L7;
          }
        }
        L8: {
          if (((w) this).field_P == null) {
            break L8;
          } else {
            ((w) this).field_P.field_n = (fe) (Object) var6;
            break L8;
          }
        }
        L9: {
          ((w) this).field_T.field_C = vl.field_a;
          if (null == ((w) this).field_P) {
            break L9;
          } else {
            ((w) this).field_P.field_C = eh.field_eb;
            break L9;
          }
        }
        L10: {
          if (!((w) this).field_W) {
            if (((w) this).field_L) {
              ((w) this).field_U.field_C = nl.field_a;
              ((w) this).field_U.field_n = (fe) (Object) new hk();
              break L10;
            } else {
              ((w) this).field_U.field_n = (fe) (Object) new hk();
              break L10;
            }
          } else {
            ((w) this).field_U.field_C = cj.field_c;
            break L10;
          }
        }
        L11: {
          ((w) this).field_m = 15;
          var7 = gm.field_cb;
          if (((w) this).field_H == null) {
            break L11;
          } else {
            ((w) this).field_m = ((w) this).field_m + (5 + var7.b(((w) this).field_H, ((w) this).field_F - 40, var7.field_C));
            break L11;
          }
        }
        L12: {
          var8 = hd.field_a;
          var9 = tm.a(ii.b(false), -118);
          if (pi.field_T == var9) {
            var8 = hn.field_p;
            break L12;
          } else {
            if (tj.field_n != var9) {
              break L12;
            } else {
              var8 = nm.field_D;
              break L12;
            }
          }
        }
        L13: {
          var12 = new la(10, ((w) this).field_m, ((w) this).field_F + -20, 25, (fj) (Object) ((w) this).field_T, false, 80, 3, var7, 16777215, var8);
          ((w) this).b((fj) (Object) new la(10, ((w) this).field_m, ((w) this).field_F + -20, 25, (fj) (Object) ((w) this).field_T, false, 80, 3, var7, 16777215, var8), 10);
          ((w) this).field_m = ((w) this).field_m + (((fj) (Object) var12).field_z + 5);
          var13 = new la(10, ((w) this).field_m, ((w) this).field_F + -20, 25, (fj) (Object) ((w) this).field_X, false, 80, 3, var7, 16777215, sc.field_b);
          ((w) this).b((fj) (Object) new la(10, ((w) this).field_m, ((w) this).field_F + -20, 25, (fj) (Object) ((w) this).field_X, false, 80, 3, var7, 16777215, sc.field_b), 10);
          ((w) this).field_V.field_t = (uk) this;
          ((w) this).field_m = ((w) this).field_m + (((fj) (Object) var13).field_z + 5);
          if (null == ((w) this).field_P) {
            break L13;
          } else {
            ((w) this).field_P.field_t = (uk) this;
            break L13;
          }
        }
        L14: {
          if (((w) this).field_U == null) {
            break L14;
          } else {
            ((w) this).field_U.field_t = (uk) this;
            break L14;
          }
        }
        L15: {
          if (((w) this).field_P != null) {
            ((w) this).field_V.a(-125, -95 + ((w) this).field_F, ((w) this).field_m, 30, 85);
            ((w) this).field_m = ((w) this).field_m + 60;
            break L15;
          } else {
            ((w) this).field_V.a(-119, -10 + (((w) this).field_F + -6), ((w) this).field_m, 30, 8);
            ((w) this).field_m = ((w) this).field_m + 35;
            break L15;
          }
        }
        L16: {
          if (null == ((w) this).field_P) {
            break L16;
          } else {
            ((w) this).field_P.a(-112, -16 + ((w) this).field_F, ((w) this).field_m, 30, 8);
            ((w) this).field_m = ((w) this).field_m + 35;
            break L16;
          }
        }
        L17: {
          if (((w) this).field_U == null) {
            break L17;
          } else {
            L18: {
              if (((w) this).field_W) {
                break L18;
              } else {
                if (!((w) this).field_L) {
                  ((w) this).field_U.a(-110, 40, ((w) this).field_m, 20, 8);
                  ((w) this).field_m = ((w) this).field_m + 25;
                  break L17;
                } else {
                  break L18;
                }
              }
            }
            ((w) this).field_U.a(-123, -6 + ((w) this).field_F - 10, ((w) this).field_m, 30, 8);
            ((w) this).field_m = ((w) this).field_m + 35;
            break L17;
          }
        }
        L19: {
          ((w) this).a(-110, ((w) this).field_F, 0, 3 + ((w) this).field_m, 0);
          ((w) this).b((fj) (Object) ((w) this).field_V, 10);
          if (((w) this).field_P == null) {
            break L19;
          } else {
            ((w) this).b((fj) (Object) ((w) this).field_P, 10);
            break L19;
          }
        }
        L20: {
          if (((w) this).field_U == null) {
            break L20;
          } else {
            ((w) this).b((fj) (Object) ((w) this).field_U, 10);
            break L20;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_R = new int[8192];
        field_Q = "Quit";
    }
}
