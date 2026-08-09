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
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -29513) {
                break L1;
              } else {
                this.i(-105);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("vk.DA(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final void a(String param0, byte param1) {
        ga var3 = null;
        String var4 = null;
        if (param1 <= 50) {
            return;
        }
        try {
            var3 = this.field_J;
            var4 = param0;
            var3.a(false, -84, var4);
            this.field_z.k(-119);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "vk.CA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
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
                if (0 >= this.field_J.field_o.length()) {
                  break L0;
                } else {
                  if (-1 > (this.field_z.field_o.length() ^ -1)) {
                    break L1;
                  } else {
                    break L0;
                  }
                }
              }
            }
            mh.a((byte) 1, this.field_J.field_o, this.field_z.field_o);
            break L0;
          }
          return;
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        L0: {
          if (null == this.field_B) {
            break L0;
          } else {
            ai.field_h.a(this.field_B, 20 + (param2 - -this.field_r), 15 + param0 + this.field_j, -40 + this.field_g, this.field_f, 16777215, -1, 1, 0, ai.field_h.field_o);
            break L0;
          }
        }
        L1: {
          if (null == this.field_H) {
            break L1;
          } else {
            kh.f(10 + param2, 134 + param0, this.field_g - 20, 4210752);
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
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        var7 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (this.field_M != param4) {
                if (this.field_H == param4) {
                  ih.a((byte) 63);
                  break L1;
                } else {
                  if (this.field_G != param4) {
                    break L1;
                  } else {
                    if (this.field_E) {
                      cb.e((byte) 125);
                      break L1;
                    } else {
                      if (!this.field_A) {
                        wg.f(-11142);
                        break L1;
                      } else {
                        ba.c((byte) 93);
                        break L1;
                      }
                    }
                  }
                }
              } else {
                this.c(false);
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
            stackIn_15_0 = (RuntimeException) (var6);

            stackIn_15_1 = new StringBuilder().append("vk.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    final static void a(int param0, boolean param1, boolean param2) {
        if (param0 != -40) {
            field_N = (am) null;
        }
        String var4 = (String) null;
        fa.a(param1, param2, (String) null, true);
    }

    final String i(int param0) {
        if (param0 != -1) {
            vk.a(-27);
        }
        if (null == this.field_J.field_o) {
            return "";
        }
        return this.field_J.field_o;
    }

    final static void j(int param0) {
        m dupTemp$0 = null;
        m dupTemp$1 = null;
        int var1;
        re var2;
        Object var3;
        int var4;
        int var5;
        String var6;
        L0: {
          var5 = CrazyCrystals.field_B;
          li.field_a = null;
          var1 = q.field_a[2].field_i;
          var6 = (String) null;
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
          tm.field_d = (f[][]) null;
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
          a.field_b = (ue) ((Object) var2);
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
                  dupTemp$0 = new m(var2, 8, cp.field_h, 0, 70, true);
                  var3 = dupTemp$0;
                  a.field_b = (ue) ((Object) dupTemp$0);
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
                dupTemp$1 = new m(var2, 9, fq.field_G, 1, 25, true);
                var3 = dupTemp$1;
                a.field_b = (ue) ((Object) dupTemp$1);
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
                  a.field_b = (ue) ((Object) new nc((m) (var3), var2));
                  break L5;
                }
              }
            }
          }
          if (0 != pc.field_y) {
            a.field_b = (ue) ((Object) new vn((m) (var3), var2, true));
            break L5;
          } else {
            if (mo.field_l != 0) {
              break L5;
            } else {
              if (uo.field_o > dk.field_h) {
                a.field_b = (ue) ((Object) new rb(var2, true));
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
        ei dupTemp$0 = null;
        ei dupTemp$1 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_17_0 = null;
        pc stackIn_17_1 = null;
        pc stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        pc stackIn_18_1 = null;
        pc stackIn_18_2 = null;
        String stackIn_18_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        ve var6 = null;
        RuntimeException var6_ref = null;
        vc var7 = null;
        String var8 = null;
        mb var9 = null;
        ei var12 = null;
        ei var13 = null;
        try {
          L0: {
            L1: {
              stackIn_3_0 = this;

              if (!param3) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            L2: {
              ((vk) (this)).field_C = stackIn_4_1 != 0;
              this.field_B = param1;
              stackIn_6_0 = this;

              if (!param2) {
                stackIn_7_0 = this;
                stackIn_7_1 = 0;
                break L2;
              } else {
                stackIn_7_0 = this;
                stackIn_7_1 = 1;
                break L2;
              }
            }
            L3: {
              ((vk) (this)).field_E = stackIn_7_1 != 0;
              stackIn_9_0 = this;

              if (!param4) {
                stackIn_10_0 = this;
                stackIn_10_1 = 0;
                break L3;
              } else {
                stackIn_10_0 = this;
                stackIn_10_1 = 1;
                break L3;
              }
            }
            L4: {
              ((vk) (this)).field_A = stackIn_10_1 != 0;
              if (!this.field_E) {
                break L4;
              } else {
                L5: {
                  if (this.field_C) {
                    break L5;
                  } else {
                    if (!this.field_A) {
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
              this.field_J = (ga) ((Object) new sd(param0, (bi) (this), 100));
              this.field_z = (ga) ((Object) new sd("", (bi) (this), 20));
              if (this.field_E) {
                this.field_M = new pc(ba.field_l, (bi) null);
                this.field_G = new pc(dn.field_c, (bi) null);
                this.field_J.field_x = false;
                break L6;
              } else {
                L7: {
                  this.field_M = new pc(e.field_b, (bi) null);
                  stackIn_17_0 = this;

                  stackIn_17_1 = null;

                  stackIn_17_2 = null;

                  if (this.field_A) {
                    stackIn_18_0 = this;
                    stackIn_18_1 = null;
                    stackIn_18_2 = null;
                    stackIn_18_3 = ip.field_b;
                    break L7;
                  } else {
                    stackIn_18_0 = this;
                    stackIn_18_1 = null;
                    stackIn_18_2 = null;
                    stackIn_18_3 = cf.field_h;
                    break L7;
                  }
                }
                ((vk) (this)).field_G = new pc(stackIn_18_3, (bi) null);
                if (!this.field_C) {
                  break L6;
                } else {
                  this.field_H = new pc(mj.field_d, (bi) (this));
                  break L6;
                }
              }
            }
            L8: {
              this.field_J.field_i = (wo) ((Object) new wc(10000536));
              this.field_z.field_i = (wo) ((Object) new aq(10000536));
              var6 = new ve();
              this.field_M.field_i = (wo) ((Object) var6);
              if (this.field_G == null) {
                break L8;
              } else {
                this.field_G.field_i = (wo) ((Object) var6);
                break L8;
              }
            }
            L9: {
              if (this.field_H == null) {
                break L9;
              } else {
                this.field_H.field_i = (wo) ((Object) var6);
                break L9;
              }
            }
            L10: {
              this.field_J.field_t = tm.field_c;
              if (this.field_H == null) {
                break L10;
              } else {
                this.field_H.field_t = pg.field_c;
                break L10;
              }
            }
            L11: {
              if (!this.field_E) {
                if (!this.field_A) {
                  this.field_G.field_i = (wo) ((Object) new ok());
                  break L11;
                } else {
                  this.field_G.field_t = md.field_o;
                  this.field_G.field_i = (wo) ((Object) new ok());
                  break L11;
                }
              } else {
                this.field_G.field_t = sl.field_n;
                break L11;
              }
            }
            L12: {
              this.field_j = 15;
              var7 = ai.field_h;
              if (this.field_B == null) {
                break L12;
              } else {
                this.field_j = this.field_j + (5 + var7.b(this.field_B, -40 + this.field_g, var7.field_o));
                break L12;
              }
            }
            L13: {
              var8 = ee.field_q;
              var9 = ua.a(-11662, le.b((byte) -20));
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
              dupTemp$0 = new ei(10, this.field_j, -20 + this.field_g, 25, this.field_J, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$0;
              this.b(dupTemp$0, 16);
              this.field_j = this.field_j + (((qm) ((Object) var12)).field_f + 5);
              dupTemp$1 = new ei(10, this.field_j, -20 + this.field_g, 25, this.field_z, false, 80, 3, var7, 16777215, fh.field_h);
              var13 = dupTemp$1;
              this.b(dupTemp$1, -127);
              this.field_M.field_l = (bi) (this);
              this.field_j = this.field_j + (5 + ((qm) ((Object) var13)).field_f);
              if (this.field_H == null) {
                break L14;
              } else {
                this.field_H.field_l = (bi) (this);
                break L14;
              }
            }
            L15: {
              if (null == this.field_G) {
                break L15;
              } else {
                this.field_G.field_l = (bi) (this);
                break L15;
              }
            }
            L16: {
              if (this.field_H != null) {
                this.field_M.a(30, 85, this.field_j, -95 + this.field_g, (byte) -52);
                this.field_j = this.field_j + 60;
                break L16;
              } else {
                this.field_M.a(30, 8, this.field_j, -6 + (this.field_g - 10), (byte) -52);
                this.field_j = this.field_j + 35;
                break L16;
              }
            }
            L17: {
              if (this.field_H == null) {
                break L17;
              } else {
                this.field_H.a(30, 8, this.field_j, -10 + (this.field_g - 6), (byte) -52);
                this.field_j = this.field_j + 35;
                break L17;
              }
            }
            L18: {
              if (null == this.field_G) {
                break L18;
              } else {
                L19: {
                  if (this.field_E) {
                    break L19;
                  } else {
                    if (this.field_A) {
                      break L19;
                    } else {
                      this.field_G.a(20, 8, this.field_j, 40, (byte) -52);
                      this.field_j = this.field_j + 25;
                      break L18;
                    }
                  }
                }
                this.field_G.a(30, 8, this.field_j, this.field_g + -6 + -10, (byte) -52);
                this.field_j = this.field_j + 35;
                break L18;
              }
            }
            L20: {
              this.a(3 + this.field_j, 0, 0, this.field_g, (byte) -52);
              this.b(this.field_M, 108);
              if (this.field_H == null) {
                break L20;
              } else {
                this.b(this.field_H, 45);
                break L20;
              }
            }
            L21: {
              if (null == this.field_G) {
                break L21;
              } else {
                this.b(this.field_G, 34);
                break L21;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var6_ref = decompiledCaughtException;
            stackIn_59_0 = (RuntimeException) (var6_ref);

            stackIn_59_1 = new StringBuilder().append("vk.<init>(");

            if (param0 == null) {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackIn_60_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackIn_60_2 = "null";
              break L22;
            } else {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackIn_60_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackIn_60_2 = "{...}";
              break L22;
            }
          }
          L23: {


            stackIn_62_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_60_2).append(',');

            if (param1 == null) {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_60_0);
              stackIn_63_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackIn_63_2 = "null";
              break L23;
            } else {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_60_0);
              stackIn_63_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackIn_63_2 = "{...}";
              break L23;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_60_0), stackIn_63_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(int param0, int param1, qm param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_8_0 = false;
        boolean stackIn_11_0 = false;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!super.a(param0, param1 + 0, param2, param3)) {
              L1: {
                if (param1 == 19279) {
                  break L1;
                } else {
                  this.field_G = (pc) null;
                  break L1;
                }
              }
              if (-99 == (param0 ^ -1)) {
                stackIn_8_0 = this.a((byte) -117, param2);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param0 != 99) {
                  stackIn_13_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_11_0 = this.a(param2, param1 ^ -11898);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("vk.AA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return stackIn_13_0 != 0;
            }
          }
        }
    }

    final void e(byte param0) {
        this.field_J.k(-100);
        if (param0 <= 45) {
            ga var3 = (ga) null;
            this.a((ga) null, 105);
        }
        this.field_z.k(-108);
    }

    public final void a(int param0, ga param1) {
        int var3_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              var3_int = 3 / ((param0 - -20) / 46);
              if (param1 == this.field_J) {
                this.field_z.a(true, (qm) (this));
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (this.field_z != param1) {
                break L2;
              } else {
                this.c(false);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("vk.U(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
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
        field_D = "OFF";
    }
}
