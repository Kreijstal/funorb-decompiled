/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

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
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -29513) {
                break L1;
              } else {
                String discarded$2 = ((vk) this).i(-105);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("vk.DA(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final void a(String param0, byte param1) {
        ga var3 = null;
        String var4 = null;
        if (param1 <= 50) {
            return;
        }
        try {
            var3 = ((vk) this).field_J;
            var4 = param0;
            var3.a(false, -84, var4);
            ((vk) this).field_z.k(-119);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "vk.CA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void c() {
        L0: {
          L1: {
            int discarded$6 = 0;
            if (oo.b()) {
              break L1;
            } else {
              if (0 >= ((vk) this).field_J.field_o.length()) {
                break L0;
              } else {
                if (((vk) this).field_z.field_o.length() > 0) {
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
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var7 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (((vk) this).field_M != param4) {
                if (((vk) this).field_H == param4) {
                  ih.a((byte) 63);
                  break L1;
                } else {
                  if (((vk) this).field_G != param4) {
                    break L1;
                  } else {
                    if (((vk) this).field_E) {
                      int discarded$1293 = 125;
                      cb.e();
                      break L1;
                    } else {
                      if (!((vk) this).field_A) {
                        wg.f(-11142);
                        break L1;
                      } else {
                        int discarded$1294 = 93;
                        ba.c();
                        break L1;
                      }
                    }
                  }
                }
              } else {
                int discarded$1295 = 0;
                this.c();
                break L1;
              }
            }
            var6_int = 109 / ((83 - param0) / 36);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var6;
            stackOut_13_1 = new StringBuilder().append("vk.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param4 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    final static void a(int param0, boolean param1, boolean param2) {
        int discarded$0 = 1;
        fa.a(param1, param2, (String) null);
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
        Object var3 = null;
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
                if (jo.field_o != 1) {
                  break L4;
                } else {
                  wd.a(-111, 65535, uo.field_o + -1, dk.field_h, var1, 70, 0);
                  m dupTemp$2 = new m(var2, 8, cp.field_h, 0, 70, true);
                  var3 = (Object) (Object) dupTemp$2;
                  a.field_b = (ue) (Object) dupTemp$2;
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
                m dupTemp$3 = new m(var2, 9, fq.field_G, 1, 25, true);
                var3 = (Object) (Object) dupTemp$3;
                a.field_b = (ue) (Object) dupTemp$3;
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
              if (uo.field_o <= 0) {
                break L6;
              } else {
                if (uo.field_o > ke.field_b[jo.field_o]) {
                  break L6;
                } else {
                  a.field_b = (ue) (Object) new nc((m) var3, var2);
                  break L5;
                }
              }
            }
          }
          if (0 != pc.field_y) {
            a.field_b = (ue) (Object) new vn((m) var3, var2, true);
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
        RuntimeException var6 = null;
        ve var6_ref = null;
        vc var7 = null;
        String var8 = null;
        mb var9 = null;
        ei var12 = null;
        ei var13 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_16_0 = null;
        pc stackIn_16_1 = null;
        pc stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        pc stackIn_17_1 = null;
        pc stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        pc stackIn_18_1 = null;
        pc stackIn_18_2 = null;
        String stackIn_18_3 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_15_0 = null;
        pc stackOut_15_1 = null;
        pc stackOut_15_2 = null;
        Object stackOut_17_0 = null;
        pc stackOut_17_1 = null;
        pc stackOut_17_2 = null;
        String stackOut_17_3 = null;
        Object stackOut_16_0 = null;
        pc stackOut_16_1 = null;
        pc stackOut_16_2 = null;
        String stackOut_16_3 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        try {
          L0: {
            L1: {
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param3) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((vk) this).field_C = stackIn_4_1 != 0;
              ((vk) this).field_B = param1;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param2) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            L3: {
              ((vk) this).field_E = stackIn_7_1 != 0;
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (!param4) {
                stackOut_9_0 = this;
                stackOut_9_1 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L3;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L3;
              }
            }
            L4: {
              ((vk) this).field_A = stackIn_10_1 != 0;
              if (!((vk) this).field_E) {
                break L4;
              } else {
                L5: {
                  if (((vk) this).field_C) {
                    break L5;
                  } else {
                    if (!((vk) this).field_A) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                throw new IllegalStateException();
              }
            }
            L6: {
              ((vk) this).field_J = (ga) (Object) new sd(param0, (bi) this, 100);
              ((vk) this).field_z = (ga) (Object) new sd("", (bi) this, 20);
              if (((vk) this).field_E) {
                ((vk) this).field_M = new pc(ba.field_l, (bi) null);
                ((vk) this).field_G = new pc(dn.field_c, (bi) null);
                ((vk) this).field_J.field_x = false;
                break L6;
              } else {
                L7: {
                  ((vk) this).field_M = new pc(e.field_b, (bi) null);
                  stackOut_15_0 = this;
                  stackOut_15_1 = null;
                  stackOut_15_2 = null;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  if (((vk) this).field_A) {
                    stackOut_17_0 = this;
                    stackOut_17_1 = null;
                    stackOut_17_2 = null;
                    stackOut_17_3 = ip.field_b;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    stackIn_18_2 = stackOut_17_2;
                    stackIn_18_3 = stackOut_17_3;
                    break L7;
                  } else {
                    stackOut_16_0 = this;
                    stackOut_16_1 = null;
                    stackOut_16_2 = null;
                    stackOut_16_3 = cf.field_h;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    stackIn_18_2 = stackOut_16_2;
                    stackIn_18_3 = stackOut_16_3;
                    break L7;
                  }
                }
                ((vk) this).field_G = new pc(stackIn_18_3, (bi) null);
                if (!((vk) this).field_C) {
                  break L6;
                } else {
                  ((vk) this).field_H = new pc(mj.field_d, (bi) this);
                  break L6;
                }
              }
            }
            L8: {
              ((vk) this).field_J.field_i = (wo) (Object) new wc(10000536);
              ((vk) this).field_z.field_i = (wo) (Object) new aq(10000536);
              var6_ref = new ve();
              ((vk) this).field_M.field_i = (wo) (Object) var6_ref;
              if (((vk) this).field_G == null) {
                break L8;
              } else {
                ((vk) this).field_G.field_i = (wo) (Object) var6_ref;
                break L8;
              }
            }
            L9: {
              if (((vk) this).field_H == null) {
                break L9;
              } else {
                ((vk) this).field_H.field_i = (wo) (Object) var6_ref;
                break L9;
              }
            }
            L10: {
              ((vk) this).field_J.field_t = tm.field_c;
              if (((vk) this).field_H == null) {
                break L10;
              } else {
                ((vk) this).field_H.field_t = pg.field_c;
                break L10;
              }
            }
            L11: {
              if (!((vk) this).field_E) {
                if (!((vk) this).field_A) {
                  ((vk) this).field_G.field_i = (wo) (Object) new ok();
                  break L11;
                } else {
                  ((vk) this).field_G.field_t = md.field_o;
                  ((vk) this).field_G.field_i = (wo) (Object) new ok();
                  break L11;
                }
              } else {
                ((vk) this).field_G.field_t = sl.field_n;
                break L11;
              }
            }
            L12: {
              ((vk) this).field_j = 15;
              var7 = ai.field_h;
              if (((vk) this).field_B == null) {
                break L12;
              } else {
                ((vk) this).field_j = ((vk) this).field_j + (5 + var7.b(((vk) this).field_B, -40 + ((vk) this).field_g, var7.field_o));
                break L12;
              }
            }
            L13: {
              var8 = ee.field_q;
              int discarded$3 = -20;
              var9 = ua.a(-11662, le.b());
              if (var9 != gg.field_d) {
                if (var9 != wp.field_c) {
                  break L13;
                } else {
                  var8 = to.field_e;
                  break L13;
                }
              } else {
                var8 = ce.field_bb;
                break L13;
              }
            }
            L14: {
              ei dupTemp$4 = new ei(10, ((vk) this).field_j, -20 + ((vk) this).field_g, 25, (qm) (Object) ((vk) this).field_J, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$4;
              ((vk) this).b((qm) (Object) dupTemp$4, 16);
              ((vk) this).field_j = ((vk) this).field_j + (((qm) (Object) var12).field_f + 5);
              ei dupTemp$5 = new ei(10, ((vk) this).field_j, -20 + ((vk) this).field_g, 25, (qm) (Object) ((vk) this).field_z, false, 80, 3, var7, 16777215, fh.field_h);
              var13 = dupTemp$5;
              ((vk) this).b((qm) (Object) dupTemp$5, -127);
              ((vk) this).field_M.field_l = (bi) this;
              ((vk) this).field_j = ((vk) this).field_j + (5 + ((qm) (Object) var13).field_f);
              if (((vk) this).field_H == null) {
                break L14;
              } else {
                ((vk) this).field_H.field_l = (bi) this;
                break L14;
              }
            }
            L15: {
              if (null == ((vk) this).field_G) {
                break L15;
              } else {
                ((vk) this).field_G.field_l = (bi) this;
                break L15;
              }
            }
            L16: {
              if (((vk) this).field_H != null) {
                ((vk) this).field_M.a(30, 85, ((vk) this).field_j, -95 + ((vk) this).field_g, (byte) -52);
                ((vk) this).field_j = ((vk) this).field_j + 60;
                break L16;
              } else {
                ((vk) this).field_M.a(30, 8, ((vk) this).field_j, -6 + (((vk) this).field_g - 10), (byte) -52);
                ((vk) this).field_j = ((vk) this).field_j + 35;
                break L16;
              }
            }
            L17: {
              if (((vk) this).field_H == null) {
                break L17;
              } else {
                ((vk) this).field_H.a(30, 8, ((vk) this).field_j, -10 + (((vk) this).field_g - 6), (byte) -52);
                ((vk) this).field_j = ((vk) this).field_j + 35;
                break L17;
              }
            }
            L18: {
              if (null == ((vk) this).field_G) {
                break L18;
              } else {
                L19: {
                  if (((vk) this).field_E) {
                    break L19;
                  } else {
                    if (((vk) this).field_A) {
                      break L19;
                    } else {
                      ((vk) this).field_G.a(20, 8, ((vk) this).field_j, 40, (byte) -52);
                      ((vk) this).field_j = ((vk) this).field_j + 25;
                      break L18;
                    }
                  }
                }
                ((vk) this).field_G.a(30, 8, ((vk) this).field_j, ((vk) this).field_g - 16, (byte) -52);
                ((vk) this).field_j = ((vk) this).field_j + 35;
                break L18;
              }
            }
            L20: {
              ((vk) this).a(3 + ((vk) this).field_j, 0, 0, ((vk) this).field_g, (byte) -52);
              ((vk) this).b((qm) (Object) ((vk) this).field_M, 108);
              if (((vk) this).field_H == null) {
                break L20;
              } else {
                ((vk) this).b((qm) (Object) ((vk) this).field_H, 45);
                break L20;
              }
            }
            L21: {
              if (null == ((vk) this).field_G) {
                break L21;
              } else {
                ((vk) this).b((qm) (Object) ((vk) this).field_G, 34);
                break L21;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var6 = decompiledCaughtException;
            stackOut_57_0 = (RuntimeException) var6;
            stackOut_57_1 = new StringBuilder().append("vk.<init>(");
            stackIn_59_0 = stackOut_57_0;
            stackIn_59_1 = stackOut_57_1;
            stackIn_58_0 = stackOut_57_0;
            stackIn_58_1 = stackOut_57_1;
            if (param0 == null) {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "null";
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              break L22;
            } else {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "{...}";
              stackIn_60_0 = stackOut_58_0;
              stackIn_60_1 = stackOut_58_1;
              stackIn_60_2 = stackOut_58_2;
              break L22;
            }
          }
          L23: {
            stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
            stackOut_60_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_60_2).append(',');
            stackIn_62_0 = stackOut_60_0;
            stackIn_62_1 = stackOut_60_1;
            stackIn_61_0 = stackOut_60_0;
            stackIn_61_1 = stackOut_60_1;
            if (param1 == null) {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "null";
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              break L23;
            } else {
              stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
              stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
              stackOut_61_2 = "{...}";
              stackIn_63_0 = stackOut_61_0;
              stackIn_63_1 = stackOut_61_1;
              stackIn_63_2 = stackOut_61_2;
              break L23;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_63_0, stackIn_63_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(int param0, int param1, qm param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_8_0 = false;
        boolean stackIn_11_0 = false;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_7_0 = false;
        int stackOut_12_0 = 0;
        boolean stackOut_10_0 = false;
        int stackOut_1_0 = 0;
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
            if (!super.a(param0, param1, param2, param3)) {
              L1: {
                if (param1 == 19279) {
                  break L1;
                } else {
                  ((vk) this).field_G = null;
                  break L1;
                }
              }
              if (param0 == 98) {
                stackOut_7_0 = ((vk) this).a((byte) -117, param2);
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              } else {
                if (param0 != 99) {
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  stackOut_10_0 = ((vk) this).a(param2, param1 ^ -11898);
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                }
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("vk.AA(").append(param0).append(',').append(param1).append(',');
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
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param3 + ')');
        }
        return stackIn_13_0 != 0;
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
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              var3_int = 3 / ((param0 - -20) / 46);
              if (param1 == ((vk) this).field_J) {
                boolean discarded$4 = ((vk) this).field_z.a(true, (qm) this);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((vk) this).field_z != param1) {
                break L2;
              } else {
                int discarded$5 = 0;
                this.c();
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("vk.U(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
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
