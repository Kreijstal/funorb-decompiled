/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wb extends lw {
    static vr field_l;

    final static boolean a(int param0, int param1, boolean param2, int param3) {
        if (null != ms.field_u) {
            if (ms.field_u.a(true)) {
                di.c(-87);
                return true;
            }
        }
        if (null != wt.field_n) {
            if (wt.field_n.f((byte) -116)) {
                wt.field_n = null;
                di.c(96);
                return true;
            }
        }
        if (lk.d(2)) {
            return true;
        }
        if (tc.a(param1, param0, param3, param2)) {
            return true;
        }
        return false;
    }

    public static void d(int param0) {
        field_l = null;
        if (param0 != 10046) {
            field_l = null;
        }
    }

    wb() {
        super(false, new String[6], jm.field_h);
        ((wb) this).field_c = new int[][]{new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2]};
    }

    final void a(int param0, byte param1) {
        int var4 = 0;
        L0: {
          var4 = BachelorFridge.field_y;
          if (param0 != 1) {
            if (-3 != (param0 ^ -1)) {
              if (param0 != 3) {
                if (-5 == param0) {
                  ((wb) this).field_a = 4;
                  ((wb) this).b(1);
                  ((wb) this).c(94);
                  break L0;
                } else {
                  if (-6 != param0) {
                    if (-7 == (param0 ^ -1)) {
                      ((wb) this).field_a = 6;
                      ((wb) this).b(param1 + -72);
                      ((wb) this).c(116);
                      break L0;
                    } else {
                      if (34 != param0) {
                        break L0;
                      } else {
                        if (!((wb) this).c((byte) 95)) {
                          break L0;
                        } else {
                          fla.b(23621);
                          break L0;
                        }
                      }
                    }
                  } else {
                    ((wb) this).field_a = 5;
                    ((wb) this).b(1);
                    ((wb) this).c(74);
                    break L0;
                  }
                }
              } else {
                ((wb) this).field_a = 3;
                ((wb) this).b(1);
                ((wb) this).c(param1 + 17);
                break L0;
              }
            } else {
              ((wb) this).field_a = 2;
              ((wb) this).b(1);
              ((wb) this).c(70);
              break L0;
            }
          } else {
            ((wb) this).field_a = 1;
            ((wb) this).b(1);
            ((wb) this).c(param1 ^ 39);
            break L0;
          }
        }
        L1: {
          if (param1 == 73) {
            break L1;
          } else {
            wb.a(false, 111, 23);
            break L1;
          }
        }
    }

    final static void a(boolean param0, int param1, int param2) {
        int var3 = 0;
        eaa var4 = null;
        int var5 = 0;
        nea var6 = null;
        nea var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var14_ref = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        ik var17 = null;
        ik var18 = null;
        sga stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        int stackIn_1_2 = 0;
        int stackIn_1_3 = 0;
        sga stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        int stackIn_2_3 = 0;
        sga stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        int stackIn_3_4 = 0;
        sna stackIn_18_0 = null;
        sna stackIn_19_0 = null;
        sna stackIn_20_0 = null;
        String stackIn_20_1 = null;
        int stackIn_23_0 = 0;
        sga stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        int stackOut_0_2 = 0;
        int stackOut_0_3 = 0;
        sga stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        int stackOut_2_4 = 0;
        sga stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        int stackOut_1_4 = 0;
        sna stackOut_17_0 = null;
        sna stackOut_19_0 = null;
        String stackOut_19_1 = null;
        sna stackOut_18_0 = null;
        String stackOut_18_1 = null;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        L0: {
          var16 = BachelorFridge.field_y;
          stackOut_0_0 = nr.field_w.field_xb;
          stackOut_0_1 = 2 + rg.field_h;
          stackOut_0_2 = 2;
          stackOut_0_3 = (6 + 3 * rg.field_h) * param1;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_2_2 = stackOut_0_2;
          stackIn_2_3 = stackOut_0_3;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          stackIn_1_2 = stackOut_0_2;
          stackIn_1_3 = stackOut_0_3;
          if (nr.field_w.field_xb != bga.field_m) {
            stackOut_2_0 = (sga) (Object) stackIn_2_0;
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = stackIn_2_2;
            stackOut_2_3 = stackIn_2_3;
            stackOut_2_4 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            stackIn_3_3 = stackOut_2_3;
            stackIn_3_4 = stackOut_2_4;
            break L0;
          } else {
            stackOut_1_0 = (sga) (Object) stackIn_1_0;
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = stackIn_1_2;
            stackOut_1_3 = stackIn_1_3;
            stackOut_1_4 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            stackIn_3_3 = stackOut_1_3;
            stackIn_3_4 = stackOut_1_4;
            break L0;
          }
        }
        L1: {
          L2: {
            var3 = ((sga) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2, stackIn_3_3, stackIn_3_4 != 0, param0, true) ? 1 : 0;
            var4 = nr.field_w.field_wb.field_z;
            var5 = -98 / ((-4 - param2) / 42);
            if (2 == um.field_c) {
              break L2;
            } else {
              if (-2 != (um.field_c ^ -1)) {
                nr.field_w.field_u = false;
                nr.field_w.field_xb.field_wb.field_Z = ema.field_Ab;
                nn.a((byte) -126, nr.field_w.field_wb);
                break L1;
              } else {
                break L2;
              }
            }
          }
          nr.field_w.field_u = true;
          nr.field_w.field_xb.field_wb.field_Z = null;
          var6 = null;
          var7 = (nea) (Object) var4.b((byte) 90);
          L3: while (true) {
            if (var7 == null) {
              L4: {
                if (nr.field_w.field_Ab.field_R != 0) {
                  wh.field_p = new oa(nr.field_w.field_Ab.field_D, nr.field_w.field_Ab.field_M, nr.field_w.field_Ab.field_sb, nr.field_w.field_Ab.field_p, nh.field_p, kha.field_i, qs.field_m, qs.field_m);
                  vaa.field_f = 2;
                  break L4;
                } else {
                  break L4;
                }
              }
              if (-1 != (nr.field_w.field_yb.field_R ^ -1)) {
                wh.field_p = new oa(nr.field_w.field_yb.field_D, nr.field_w.field_yb.field_M, nr.field_w.field_yb.field_sb, nr.field_w.field_yb.field_p, kma.field_p, kha.field_i, qs.field_m, qs.field_m);
                vaa.field_f = 3;
                break L1;
              } else {
                break L1;
              }
            } else {
              L5: {
                var8 = 0;
                if (var7.field_z == null) {
                  var7.field_Db = new sna(0L, gi.field_c);
                  var7.a(-1, var7.field_Db);
                  var7.field_zb = new sna(0L, gi.field_c);
                  var7.a(-1, var7.field_zb);
                  var7.d((byte) 116);
                  var8 = 1;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                var7.field_sb = nr.field_w.field_wb.field_sb;
                var7.field_Db.a(rg.field_h, 31407, var7.field_sb, 0, 0);
                var9 = 0;
                if (var7.field_Ab == null) {
                  break L6;
                } else {
                  if (!var7.field_Ab.equals((Object) (Object) "")) {
                    var7.field_zb.field_v = ln.field_x;
                    var7.field_zb.field_ab = 16737894;
                    var7.field_zb.a(rg.field_h, 31407, ln.field_x.field_n - -3, 0, 0);
                    var9 = 1;
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
              L7: {
                var10 = 0;
                var11 = var7.field_sb;
                if (var9 == 0) {
                  break L7;
                } else {
                  var10 = 3 + ln.field_x.field_n;
                  var11 = var11 - var10;
                  break L7;
                }
              }
              L8: {
                stackOut_17_0 = var7.field_Db;
                stackIn_19_0 = stackOut_17_0;
                stackIn_18_0 = stackOut_17_0;
                if (-1 > (var11 ^ -1)) {
                  stackOut_19_0 = (sna) (Object) stackIn_19_0;
                  stackOut_19_1 = po.a(var7.field_Db.field_jb, var7.field_xb, var11);
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  break L8;
                } else {
                  stackOut_18_0 = (sna) (Object) stackIn_18_0;
                  stackOut_18_1 = var7.field_xb;
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_20_1 = stackOut_18_1;
                  break L8;
                }
              }
              L9: {
                ((sna) (Object) stackIn_20_0).field_Z = (String) (Object) stackIn_20_1;
                if (var7.field_Db.field_Z.equals((Object) (Object) var7.field_xb)) {
                  stackOut_22_0 = 0;
                  stackIn_23_0 = stackOut_22_0;
                  break L9;
                } else {
                  stackOut_21_0 = 1;
                  stackIn_23_0 = stackOut_21_0;
                  break L9;
                }
              }
              L10: {
                var12 = stackIn_23_0;
                var7.field_Db.a(rg.field_h, 31407, var11, var10, 0);
                if (var3 == 0) {
                  var7.field_hb = rg.field_h + -var7.field_p;
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (var8 != 0) {
                  nr.field_w.field_wb.a(false, (sna) (Object) var7, (sna) (Object) var6, 2);
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                L13: {
                  if (null == var7.field_zb) {
                    break L13;
                  } else {
                    if (!var7.field_zb.field_T) {
                      break L13;
                    } else {
                      jja.field_m = var7.field_Ab;
                      break L12;
                    }
                  }
                }
                if (!var7.field_Db.field_T) {
                  break L12;
                } else {
                  if (var12 != 0) {
                    jja.field_m = var7.field_xb;
                    break L12;
                  } else {
                    break L12;
                  }
                }
              }
              L14: {
                if (-1 == (var7.field_R ^ -1)) {
                  break L14;
                } else {
                  mna.a(-1, (int[]) null, 0L, var7.field_xb, var7.field_Cb, -1, -113, nr.field_w.field_xb, (sna) (Object) var7);
                  var17 = ms.field_u;
                  var14_ref = mna.field_r;
                  var17.field_a.a(var14_ref, true, 7);
                  var18 = ms.field_u;
                  var14 = nfa.field_a;
                  var15 = jc.field_r;
                  var18.field_a.a(0, false, var14, 0, var15);
                  break L14;
                }
              }
              var6 = var7;
              var7 = (nea) (Object) var4.c(0);
              continue L3;
            }
          }
        }
    }

    final static pp a(lu param0, int param1) {
        int var2 = -61 / ((param1 - 52) / 43);
        return (pp) (Object) new tfa();
    }

    final static boolean a(byte param0, String param1) {
        if (param0 != 52) {
            field_l = null;
        }
        CharSequence var3 = (CharSequence) (Object) param1;
        return tca.field_a.equals((Object) (Object) fq.a(param0 ^ 52, var3));
    }

    final static k b(lu param0, int param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = BachelorFridge.field_y;
        if (param1 <= 45) {
            wb.a(false, -57, -18);
        }
        int discarded$0 = param0.b(16711935);
        int var2 = param0.b(16711935);
        k var3 = ffa.a(-16, var2);
        var3.field_i = param0.b(16711935);
        int var4 = param0.b(16711935);
        for (var5 = 0; var4 > var5; var5++) {
            var6 = param0.b(16711935);
            var3.a((byte) -71, param0, var6);
        }
        var3.d((byte) -68);
        return var3;
    }

    final void a(byte param0) {
        int var2 = (int)((-Math.cos((double)(vr.field_b * 4) * 3.141592653589793 / 200.0) + 1.0) * 32.0);
        if (!(0 != (((wb) this).field_e & 2))) {
            wa.field_n.a(520, 12, var2);
        }
        if (!(-1 != (4 & ((wb) this).field_e))) {
            lfa.field_s.a(419, 149, var2);
        }
        if (!(-1 != (((wb) this).field_e & 8))) {
            bn.field_i.a(419, 42, var2);
        }
        if (-1 == (((wb) this).field_e & 16 ^ -1)) {
            rj.field_l.a(522, 318, var2);
        }
        if (param0 <= 103) {
            boolean discarded$0 = wb.a(-31, 72, false, 62);
        }
        if ((((wb) this).field_e & 32) == 0) {
            ada.field_m.a(10, 7, var2);
        }
        if ((((wb) this).field_e & 64) == 0) {
            ew.field_q.a(36, 330, var2);
        }
    }

    static {
    }
}
