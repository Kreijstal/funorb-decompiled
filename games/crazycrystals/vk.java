/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk extends og implements ho, vd {
    static String field_D;
    private pc field_G;
    private ga field_J;
    static int field_L;
    private ga field_z;
    static java.awt.Frame field_F;
    private String field_B;
    private boolean field_E;
    private boolean field_A;
    private pc field_M;
    static am field_N;
    private boolean field_C;
    private pc field_H;
    static int field_I;

    public final void a(ga param0, int param1) {
        if (param1 != -29513) {
            String discarded$0 = ((vk) this).i(-105);
        }
    }

    final void a(String param0, byte param1) {
        ga var3 = null;
        String var4 = null;
        if (param1 <= 50) {
          return;
        } else {
          var3 = ((vk) this).field_J;
          var4 = param0;
          var3.a(false, -84, var4);
          ((vk) this).field_z.k(-119);
          return;
        }
    }

    private final void c(boolean param0) {
        if (param0) {
          return;
        } else {
          L0: {
            L1: {
              if (oo.b(param0)) {
                break L1;
              } else {
                if (0 >= ((vk) this).field_J.field_o.length()) {
                  break L0;
                } else {
                  if (-1 > (((vk) this).field_z.field_o.length() ^ -1)) {
                    break L1;
                  } else {
                    break L0;
                  }
                }
              }
            }
            mh.a((byte) 1, ((vk) this).field_J.field_o, ((vk) this).field_z.field_o);
            break L0;
          }
          return;
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        L0: {
          if (null == ((vk) this).field_B) {
            break L0;
          } else {
            int discarded$2 = ai.field_h.a(((vk) this).field_B, 20 + (param2 - -((vk) this).field_r), 15 + param0 + ((vk) this).field_j, -40 + ((vk) this).field_g, ((vk) this).field_f, 16777215, -1, 1, 0, ai.field_h.field_o);
            break L0;
          }
        }
        L1: {
          if (null == ((vk) this).field_H) {
            break L1;
          } else {
            kh.f(10 + param2, 134 + param0, ((vk) this).field_g - 20, 4210752);
            break L1;
          }
        }
        if (param1 > -12) {
          return;
        } else {
          super.a(param0, (byte) -71, param2, param3);
          return;
        }
    }

    public final void a(byte param0, int param1, int param2, int param3, pc param4) {
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = CrazyCrystals.field_B;
          if (((vk) this).field_M != param4) {
            if (((vk) this).field_H == param4) {
              ih.a((byte) 63);
              break L0;
            } else {
              if (((vk) this).field_G != param4) {
                break L0;
              } else {
                if (((vk) this).field_E) {
                  cb.e((byte) 125);
                  break L0;
                } else {
                  if (!((vk) this).field_A) {
                    wg.f(-11142);
                    break L0;
                  } else {
                    ba.c((byte) 93);
                    break L0;
                  }
                }
              }
            }
          } else {
            this.c(false);
            break L0;
          }
        }
        var6 = 109 / ((83 - param0) / 36);
    }

    final static void a(int param0, boolean param1, boolean param2) {
        if (param0 != -40) {
            field_N = null;
        }
        Object var4 = null;
        fa.a(param1, param2, (String) null, true);
    }

    final String i(int param0) {
        if (param0 != -1) {
            vk.a(-27);
        }
        if (null == ((vk) this).field_J.field_o) {
            return "";
        }
        return ((vk) this).field_J.field_o;
    }

    final static void j(int param0) {
        int var1 = 0;
        re var2 = null;
        m var3 = null;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        L0: {
          var5 = CrazyCrystals.field_B;
          li.field_a = null;
          var1 = q.field_a[2].field_i;
          var6 = null;
          um.a(0, (String) null, (byte) 118);
          ck.field_db.b((byte) -107);
          field_N.b((byte) 64);
          fp.field_c.b((byte) 111);
          aa.field_a.b((byte) -126);
          oe.field_a = null;
          q.field_a = null;
          if (ab.field_D != null) {
            ab.field_D.a(-1);
            ab.field_D = null;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          cn.field_d = null;
          kd.field_l = null;
          vh.field_a = false;
          tm.field_d = null;
          bq.field_i = null;
          r.field_m = false;
          gm.field_c = null;
          td.field_c = null;
          qh.field_o = null;
          var2 = new re();
          if (go.field_i) {
            uo.field_o = uo.field_o + 1;
            break L1;
          } else {
            fn.field_j = bh.field_c;
            wd.field_j = df.field_c;
            mb.field_g = field_I;
            ob.field_l = no.field_k;
            break L1;
          }
        }
        L2: {
          a.field_b = (ue) (Object) var2;
          var3 = null;
          var4 = uo.field_o;
          fn.field_j = fn.field_j + var4;
          if (param0 > 4) {
            break L2;
          } else {
            vk.j(-59);
            break L2;
          }
        }
        L3: {
          if (ke.field_b[jo.field_o] >= uo.field_o) {
            L4: {
              if (var1 <= 0) {
                break L4;
              } else {
                if ((jo.field_o ^ -1) != -2) {
                  break L4;
                } else {
                  wd.a(-111, 65535, uo.field_o + -1, dk.field_h, var1, 70, 0);
                  var3 = new m(var2, 8, cp.field_h, 0, 70, true);
                  a.field_b = (ue) (Object) new m(var2, 8, cp.field_h, 0, 70, true);
                  break L4;
                }
              }
            }
            if (0 >= var1) {
              break L3;
            } else {
              if (4 != jo.field_o) {
                break L3;
              } else {
                wd.a(-77, 65534, -1 + uo.field_o, dk.field_h, var1, 25, 1);
                var3 = new m(var2, 9, fq.field_G, 1, 25, true);
                a.field_b = (ue) (Object) new m(var2, 9, fq.field_G, 1, 25, true);
                break L3;
              }
            }
          } else {
            break L3;
          }
        }
        L5: {
          L6: {
            if (!rc.a(-116)) {
              break L6;
            } else {
              if ((uo.field_o ^ -1) >= -1) {
                break L6;
              } else {
                if (uo.field_o > ke.field_b[jo.field_o]) {
                  break L6;
                } else {
                  a.field_b = (ue) (Object) new nc(var3, var2);
                  break L5;
                }
              }
            }
          }
          if (0 != pc.field_y) {
            a.field_b = (ue) (Object) new vn(var3, var2, true);
            break L5;
          } else {
            if (mo.field_l != 0) {
              break L5;
            } else {
              if (uo.field_o > dk.field_h) {
                a.field_b = (ue) (Object) new rb(var2, true);
                break L5;
              } else {
                break L5;
              }
            }
          }
        }
        rc.field_a = null;
    }

    vk(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (wo) null);
        ve var6 = null;
        vc var7 = null;
        String var8 = null;
        mb var9 = null;
        ei var12 = null;
        ei var13 = null;
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
        pc stackIn_15_1 = null;
        pc stackIn_15_2 = null;
        Object stackIn_16_0 = null;
        pc stackIn_16_1 = null;
        pc stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        pc stackIn_17_1 = null;
        pc stackIn_17_2 = null;
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
        pc stackOut_14_1 = null;
        pc stackOut_14_2 = null;
        Object stackOut_16_0 = null;
        pc stackOut_16_1 = null;
        pc stackOut_16_2 = null;
        String stackOut_16_3 = null;
        Object stackOut_15_0 = null;
        pc stackOut_15_1 = null;
        pc stackOut_15_2 = null;
        String stackOut_15_3 = null;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param3) {
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
          ((vk) this).field_C = stackIn_3_1 != 0;
          ((vk) this).field_B = param1;
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
          ((vk) this).field_E = stackIn_6_1 != 0;
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
          ((vk) this).field_A = stackIn_9_1 != 0;
          if (!((vk) this).field_E) {
            break L3;
          } else {
            L4: {
              if (((vk) this).field_C) {
                break L4;
              } else {
                if (!((vk) this).field_A) {
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
          ((vk) this).field_J = (ga) (Object) new sd(param0, (bi) this, 100);
          ((vk) this).field_z = (ga) (Object) new sd("", (bi) this, 20);
          if (((vk) this).field_E) {
            ((vk) this).field_M = new pc(ba.field_l, (bi) null);
            ((vk) this).field_G = new pc(dn.field_c, (bi) null);
            ((vk) this).field_J.field_x = false;
            break L5;
          } else {
            L6: {
              ((vk) this).field_M = new pc(e.field_b, (bi) null);
              stackOut_14_0 = this;
              stackOut_14_1 = null;
              stackOut_14_2 = null;
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              if (((vk) this).field_A) {
                stackOut_16_0 = this;
                stackOut_16_1 = null;
                stackOut_16_2 = null;
                stackOut_16_3 = ip.field_b;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                stackIn_17_2 = stackOut_16_2;
                stackIn_17_3 = stackOut_16_3;
                break L6;
              } else {
                stackOut_15_0 = this;
                stackOut_15_1 = null;
                stackOut_15_2 = null;
                stackOut_15_3 = cf.field_h;
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                stackIn_17_2 = stackOut_15_2;
                stackIn_17_3 = stackOut_15_3;
                break L6;
              }
            }
            new pc(stackIn_17_3, (bi) null);
            ((vk) this).field_G = stackIn_17_1;
            if (!((vk) this).field_C) {
              break L5;
            } else {
              ((vk) this).field_H = new pc(mj.field_d, (bi) this);
              break L5;
            }
          }
        }
        L7: {
          ((vk) this).field_J.field_i = (wo) (Object) new wc(10000536);
          ((vk) this).field_z.field_i = (wo) (Object) new aq(10000536);
          var6 = new ve();
          ((vk) this).field_M.field_i = (wo) (Object) var6;
          if (((vk) this).field_G == null) {
            break L7;
          } else {
            ((vk) this).field_G.field_i = (wo) (Object) var6;
            break L7;
          }
        }
        L8: {
          if (((vk) this).field_H == null) {
            break L8;
          } else {
            ((vk) this).field_H.field_i = (wo) (Object) var6;
            break L8;
          }
        }
        L9: {
          ((vk) this).field_J.field_t = tm.field_c;
          if (((vk) this).field_H == null) {
            break L9;
          } else {
            ((vk) this).field_H.field_t = pg.field_c;
            break L9;
          }
        }
        L10: {
          if (!((vk) this).field_E) {
            if (!((vk) this).field_A) {
              ((vk) this).field_G.field_i = (wo) (Object) new ok();
              break L10;
            } else {
              ((vk) this).field_G.field_t = md.field_o;
              ((vk) this).field_G.field_i = (wo) (Object) new ok();
              break L10;
            }
          } else {
            ((vk) this).field_G.field_t = sl.field_n;
            break L10;
          }
        }
        L11: {
          ((vk) this).field_j = 15;
          var7 = ai.field_h;
          if (((vk) this).field_B == null) {
            break L11;
          } else {
            ((vk) this).field_j = ((vk) this).field_j + (5 + var7.b(((vk) this).field_B, -40 + ((vk) this).field_g, var7.field_o));
            break L11;
          }
        }
        L12: {
          var8 = ee.field_q;
          var9 = ua.a(-11662, le.b((byte) -20));
          if (var9 != gg.field_d) {
            if (var9 != wp.field_c) {
              break L12;
            } else {
              var8 = to.field_e;
              break L12;
            }
          } else {
            var8 = ce.field_bb;
            break L12;
          }
        }
        L13: {
          var12 = new ei(10, ((vk) this).field_j, -20 + ((vk) this).field_g, 25, (qm) (Object) ((vk) this).field_J, false, 80, 3, var7, 16777215, var8);
          ((vk) this).b((qm) (Object) new ei(10, ((vk) this).field_j, -20 + ((vk) this).field_g, 25, (qm) (Object) ((vk) this).field_J, false, 80, 3, var7, 16777215, var8), 16);
          ((vk) this).field_j = ((vk) this).field_j + (((qm) (Object) var12).field_f + 5);
          var13 = new ei(10, ((vk) this).field_j, -20 + ((vk) this).field_g, 25, (qm) (Object) ((vk) this).field_z, false, 80, 3, var7, 16777215, fh.field_h);
          ((vk) this).b((qm) (Object) new ei(10, ((vk) this).field_j, -20 + ((vk) this).field_g, 25, (qm) (Object) ((vk) this).field_z, false, 80, 3, var7, 16777215, fh.field_h), -127);
          ((vk) this).field_M.field_l = (bi) this;
          ((vk) this).field_j = ((vk) this).field_j + (5 + ((qm) (Object) var13).field_f);
          if (((vk) this).field_H == null) {
            break L13;
          } else {
            ((vk) this).field_H.field_l = (bi) this;
            break L13;
          }
        }
        L14: {
          if (null == ((vk) this).field_G) {
            break L14;
          } else {
            ((vk) this).field_G.field_l = (bi) this;
            break L14;
          }
        }
        L15: {
          if (((vk) this).field_H != null) {
            ((vk) this).field_M.a(30, 85, ((vk) this).field_j, -95 + ((vk) this).field_g, (byte) -52);
            ((vk) this).field_j = ((vk) this).field_j + 60;
            break L15;
          } else {
            ((vk) this).field_M.a(30, 8, ((vk) this).field_j, -6 + (((vk) this).field_g - 10), (byte) -52);
            ((vk) this).field_j = ((vk) this).field_j + 35;
            break L15;
          }
        }
        L16: {
          if (((vk) this).field_H == null) {
            break L16;
          } else {
            ((vk) this).field_H.a(30, 8, ((vk) this).field_j, -10 + (((vk) this).field_g - 6), (byte) -52);
            ((vk) this).field_j = ((vk) this).field_j + 35;
            break L16;
          }
        }
        L17: {
          if (null == ((vk) this).field_G) {
            break L17;
          } else {
            L18: {
              if (((vk) this).field_E) {
                break L18;
              } else {
                if (((vk) this).field_A) {
                  break L18;
                } else {
                  ((vk) this).field_G.a(20, 8, ((vk) this).field_j, 40, (byte) -52);
                  ((vk) this).field_j = ((vk) this).field_j + 25;
                  break L17;
                }
              }
            }
            ((vk) this).field_G.a(30, 8, ((vk) this).field_j, ((vk) this).field_g + -6 + -10, (byte) -52);
            ((vk) this).field_j = ((vk) this).field_j + 35;
            break L17;
          }
        }
        L19: {
          ((vk) this).a(3 + ((vk) this).field_j, 0, 0, ((vk) this).field_g, (byte) -52);
          ((vk) this).b((qm) (Object) ((vk) this).field_M, 108);
          if (((vk) this).field_H == null) {
            break L19;
          } else {
            ((vk) this).b((qm) (Object) ((vk) this).field_H, 45);
            break L19;
          }
        }
        L20: {
          if (null == ((vk) this).field_G) {
            break L20;
          } else {
            ((vk) this).b((qm) (Object) ((vk) this).field_G, 34);
            break L20;
          }
        }
    }

    final boolean a(int param0, int param1, qm param2, char param3) {
        if (!super.a(param0, param1 + 0, param2, param3)) {
          L0: {
            if (param1 == 19279) {
              break L0;
            } else {
              ((vk) this).field_G = null;
              break L0;
            }
          }
          if (-99 == (param0 ^ -1)) {
            return ((vk) this).a((byte) -117, param2);
          } else {
            if (param0 == 99) {
              return ((vk) this).a(param2, param1 ^ -11898);
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    final void e(byte param0) {
        ((vk) this).field_J.k(-100);
        if (param0 <= 45) {
            Object var3 = null;
            ((vk) this).a((ga) null, 105);
        }
        ((vk) this).field_z.k(-108);
    }

    public final void a(int param0, ga param1) {
        int var3 = 3 / ((param0 - -20) / 46);
        if (!(param1 != ((vk) this).field_J)) {
            boolean discarded$0 = ((vk) this).field_z.a(true, (qm) this);
        }
        if (((vk) this).field_z == param1) {
            this.c(false);
        }
    }

    public static void a(int param0) {
        field_D = null;
        field_N = null;
        if (param0 >= -21) {
            vk.a(-33);
        }
        field_F = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = "OFF";
    }
}
