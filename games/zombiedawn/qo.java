/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qo extends vf {
    static int field_s;
    private gj[] field_u;
    private gj field_v;
    static String field_t;
    static af field_w;
    static int[] field_r;
    static boolean field_x;

    final static void c(int param0) {
        if (param0 != 29756) {
            field_s = 56;
        }
    }

    final void a(int param0, vn[] param1, int param2) {
        int var4 = param2;
        if (param0 != 1) {
            return;
        }
        if (!(null != ((qo) this).field_u[var4])) {
            ((qo) this).field_u[var4] = new gj();
        }
        ((qo) this).field_u[param2].field_t = param1;
    }

    final static int b(byte param0) {
        int var1 = 0;
        int var2 = ZombieDawn.field_J;
        boolean discarded$7 = e.field_S.a(nm.field_f, rm.field_b, true, true);
        e.field_S.g(-123);
        if (param0 >= -120) {
            return -36;
        }
        while (on.b(-54)) {
            boolean discarded$8 = e.field_S.a(kg.field_i, (byte) 96, lc.field_c);
        }
        if (0 != (ba.field_s ^ -1)) {
            var1 = ba.field_s;
            og.b(-112, -1);
            return var1;
        }
        if (!(!ce.field_q)) {
            return 3;
        }
        if (!(vh.field_c != tk.field_a)) {
            return 1;
        }
        if (!(gl.field_E.a(-114))) {
            return 1;
        }
        if (!(vh.field_c != fk.field_F)) {
            return 2;
        }
        return -1;
    }

    qo(qo param0, boolean param1) {
        this();
        param0.a((byte) 125, param1, (qo) this);
    }

    final void a(int param0, vn[] param1) {
        gj[] var3 = null;
        int var4 = 0;
        gj var5 = null;
        int var6 = 0;
        gj[] var7 = null;
        L0: {
          var6 = ZombieDawn.field_J;
          var7 = ((qo) this).field_u;
          var3 = var7;
          if (param0 > 66) {
            break L0;
          } else {
            field_x = false;
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var4 >= var7.length) {
            return;
          } else {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_t = param1;
              var4++;
              continue L1;
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    final static void a(int param0, int param1, vn[] param2, int param3, vn[] param4, rb param5, int param6, int param7, int param8, byte param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16, int param17, rb param18, vn[] param19) {
        if (param9 != -75) {
            field_x = true;
        }
        ig.a(param18, param14, param11, 495, param12, param5, param3, param8, param0, new mf(param19), param15, new mf(param4), param1, new mf(param2), param17, param7, param6, param10, param16, param13);
    }

    public final void a(int param0, boolean param1, int param2, ga param3, int param4) {
        gj var7 = null;
        gj var9 = null;
        an var10 = null;
        gj var11 = null;
        gj var12 = null;
        gj var13 = null;
        gj var14 = null;
        ga stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        ga stackOut_1_0 = null;
        L0: {
          if (!(param3 instanceof an)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (ga) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (ga) param3;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var10 = (an) (Object) stackIn_3_0;
          g.a(param2 + param3.field_j, (byte) 99, param3.field_i + (param4 + param3.field_k), param2 - (-param3.field_j - param3.field_n), param3.field_k + param4);
          if (var10 != null) {
            param1 = param1 & var10.field_C;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var7 = ((qo) this).field_u[0];
          ((qo) this).field_v.a(false);
          var7.a((qo) this, param4, param2, (byte) 116, param3, ((qo) this).field_v);
          if (var10 != null) {
            L3: {
              if (!var10.field_x) {
                break L3;
              } else {
                var11 = ((qo) this).field_u[1];
                if (var11 == null) {
                  break L3;
                } else {
                  var11.a((qo) this, param4, param2, (byte) 116, param3, ((qo) this).field_v);
                  break L3;
                }
              }
            }
            if (!var10.field_l) {
              break L2;
            } else {
              L4: {
                var12 = ((qo) this).field_u[3];
                if (0 == var10.field_m) {
                  break L4;
                } else {
                  if (var12 == null) {
                    break L4;
                  } else {
                    var12.a((qo) this, param4, param2, (byte) 116, param3, ((qo) this).field_v);
                    break L2;
                  }
                }
              }
              var9 = ((qo) this).field_u[2];
              if (var9 != null) {
                var9.a((qo) this, param4, param2, (byte) 116, param3, ((qo) this).field_v);
                break L2;
              } else {
                break L2;
              }
            }
          } else {
            break L2;
          }
        }
        L5: {
          if (!param3.e(param0 + -16794956)) {
            break L5;
          } else {
            var13 = ((qo) this).field_u[5];
            if (var13 == null) {
              break L5;
            } else {
              var13.a((qo) this, param4, param2, (byte) 116, param3, ((qo) this).field_v);
              break L5;
            }
          }
        }
        L6: {
          if (param0 == 16777215) {
            break L6;
          } else {
            gj discarded$1 = ((qo) this).a((byte) 52, 14);
            break L6;
          }
        }
        L7: {
          if (!param1) {
            var14 = ((qo) this).field_u[4];
            if (var14 == null) {
              break L7;
            } else {
              var14.a((qo) this, param4, param2, (byte) 116, param3, ((qo) this).field_v);
              break L7;
            }
          } else {
            break L7;
          }
        }
        ((qo) this).field_v.a(0, param3, param2, (qo) this, param4);
        pa.a(-21189);
    }

    final gj a(byte param0, int param1) {
        if (param0 != 73) {
            return null;
        }
        gj dupTemp$0 = new gj();
        ((qo) this).field_u[param1] = dupTemp$0;
        return dupTemp$0;
    }

    public qo() {
        ((qo) this).field_u = new gj[6];
        ((qo) this).field_v = new gj();
        gj dupTemp$0 = new gj();
        ((qo) this).field_u[0] = dupTemp$0;
        gj var1 = dupTemp$0;
        var1.a(false);
    }

    private final void a(byte param0, boolean param1, qo param2) {
        int var4 = 0;
        int var5 = 0;
        gj var6 = null;
        gj var7 = null;
        int var8 = 0;
        gj stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        gj stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        gj stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        gj stackIn_8_2 = null;
        gj stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        gj stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        gj stackOut_7_2 = null;
        gj stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        gj stackOut_6_2 = null;
        L0: {
          var8 = ZombieDawn.field_J;
          super.a((vf) (Object) param2, (byte) -95);
          var4 = 118 / ((param0 - 32) / 58);
          if (param1) {
            var5 = 0;
            L1: while (true) {
              if (6 <= var5) {
                break L0;
              } else {
                var6 = ((qo) this).field_u[var5];
                if (var6 == null) {
                  param2.field_u[var5] = null;
                  var5++;
                  continue L1;
                } else {
                  L2: {
                    var7 = param2.field_u[var5];
                    stackOut_5_0 = (gj) var6;
                    stackOut_5_1 = 33;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    if (var7 != null) {
                      stackOut_7_0 = (gj) (Object) stackIn_7_0;
                      stackOut_7_1 = stackIn_7_1;
                      stackOut_7_2 = (gj) var7;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      stackIn_8_2 = stackOut_7_2;
                      break L2;
                    } else {
                      gj dupTemp$49 = new gj();
                      param2.field_u[var5] = dupTemp$49;
                      stackOut_6_0 = (gj) (Object) stackIn_6_0;
                      stackOut_6_1 = stackIn_6_1;
                      stackOut_6_2 = (gj) dupTemp$49;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      stackIn_8_2 = stackOut_6_2;
                      break L2;
                    }
                  }
                  ((gj) (Object) stackIn_8_0).a((byte) stackIn_8_1, stackIn_8_2);
                  var5++;
                  continue L1;
                }
              }
            }
          } else {
            gp.a((Object[]) (Object) ((qo) this).field_u, 0, (Object[]) (Object) param2.field_u, 0, 6);
            break L0;
          }
        }
    }

    final void a(vn param0, int param1) {
        gj[] var3 = null;
        int var4 = 0;
        gj var5 = null;
        int var6 = 0;
        gj[] var7 = null;
        var6 = ZombieDawn.field_J;
        var7 = ((qo) this).field_u;
        var3 = var7;
        var4 = param1;
        L0: while (true) {
          if (var7.length <= var4) {
            return;
          } else {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_x = param0;
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    public static void a(byte param0) {
        if (param0 >= -51) {
            return;
        }
        field_r = null;
        field_t = null;
        field_w = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Type your password again to make sure it's correct";
        field_w = new af();
        field_x = false;
    }
}
