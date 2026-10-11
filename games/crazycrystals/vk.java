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
        try {
          if (param1 != -29513) {
            this.i(-105);
          }
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "vk.DA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
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
        }
        if (oo.b(param0) ||
          !(0 >= this.field_J.field_o.length()) &&
          !(this.field_z.field_o.length() <= 0)) {
          mh.a((byte) 1, this.field_J.field_o, this.field_z.field_o);
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (null != this.field_B) {
          ai.field_h.a(this.field_B, 20 + (param2 + this.field_r), 15 + param0 + this.field_j, -40 + this.field_g, this.field_f, 16777215, -1, 1, 0, ai.field_h.field_o);
        }
        if (null != this.field_H) {
          kh.f(10 + param2, 134 + param0, this.field_g - 20, 4210752);
        }
        if (param1 <= -12) {
          super.a(param0, (byte) -71, param2, param3);
          return;
        }
    }

    public final void a(byte param0, int param1, int param2, int param3, pc param4) {
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        var7 = CrazyCrystals.field_B;
        try {
          if (this.field_M != param4) {
            if (this.field_H == param4) {
              ih.a((byte) 63);
            } else {
              if (this.field_G == param4) {
                if (this.field_E) {
                  cb.e((byte) 125);
                } else {
                  if (!this.field_A) {
                    wg.f(-11142);
                  } else {
                    ba.c((byte) 93);
                  }
                }
              }
            }
          } else {
            this.c(false);
          }
          var6_int = 109 / ((83 - param0) / 36);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("vk.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
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
        }
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
        } else {
          fn.field_j = bh.field_c;
          wd.field_j = df.field_c;
          mb.field_g = field_I;
          ob.field_l = no.field_k;
        }
        a.field_b = (ue) ((Object) var2);
        var3 = null;
        var4 = uo.field_o;
        fn.field_j = fn.field_j + var4;
        if (param0 <= 4) {
          vk.j(-59);
        }
        if (ke.field_b[jo.field_o] >= uo.field_o) {
          if (var1 > 0 &&
            jo.field_o == 1) {
            wd.a(-111, 65535, uo.field_o - 1, dk.field_h, var1, 70, 0);
            dupTemp$0 = new m(var2, 8, cp.field_h, 0, 70, true);
            var3 = dupTemp$0;
            a.field_b = (ue) ((Object) dupTemp$0);
          }
          if (0 < var1 &&
            4 == jo.field_o) {
            wd.a(-77, 65534, -1 + uo.field_o, dk.field_h, var1, 25, 1);
            dupTemp$1 = new m(var2, 9, fq.field_G, 1, 25, true);
            var3 = dupTemp$1;
            a.field_b = (ue) ((Object) dupTemp$1);
          }
        }
        if (rc.a(-116) &&
          uo.field_o > 0 &&
          uo.field_o <= ke.field_b[jo.field_o]) {
          a.field_b = (ue) ((Object) new nc((m) (var3), var2));
        } else {
          if (0 != pc.field_y) {
            a.field_b = (ue) ((Object) new vn((m) (var3), var2, true));
          } else {
            if (mo.field_l == 0 &&
              uo.field_o > dk.field_h) {
              a.field_b = (ue) ((Object) new rb(var2, true));
            }
          }
        }
        rc.field_a = null;
    }

    vk(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (wo) null);
        ei dupTemp$0 = null;
        ei dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        pc stackIn_17_1 = null;
        pc stackIn_17_2 = null;
        pc stackIn_18_1 = null;
        pc stackIn_18_2 = null;
        String stackIn_18_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
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
          stackIn_4_1 = (param3);
          this.field_C = stackIn_4_1;
          this.field_B = param1;
          stackIn_7_1 = (param2);
          this.field_E = stackIn_7_1;
          stackIn_10_1 = (param4);
          this.field_A = stackIn_10_1;
          if (this.field_E && (this.field_C ||
            this.field_A)) {
            throw new IllegalStateException();
          }
          this.field_J = (ga) ((Object) new sd(param0, (bi) (this), 100));
          this.field_z = (ga) ((Object) new sd("", (bi) (this), 20));
          if (this.field_E) {
            this.field_M = new pc(ba.field_l, (bi) null);
            this.field_G = new pc(dn.field_c, (bi) null);
            this.field_J.field_x = false;
          } else {
            this.field_M = new pc(e.field_b, (bi) null);
            stackIn_17_1 = null;
            stackIn_17_2 = null;
            if (this.field_A) {
              stackIn_18_1 = null;
              stackIn_18_2 = null;
              stackIn_18_3 = ip.field_b;
            } else {
              stackIn_18_1 = null;
              stackIn_18_2 = null;
              stackIn_18_3 = cf.field_h;
            }
            this.field_G = new pc(stackIn_18_3, (bi) null);
            if (this.field_C) {
              this.field_H = new pc(mj.field_d, (bi) (this));
            }
          }
          this.field_J.field_i = (wo) ((Object) new wc(10000536));
          this.field_z.field_i = (wo) ((Object) new aq(10000536));
          var6 = new ve();
          this.field_M.field_i = (wo) ((Object) var6);
          if (this.field_G != null) {
            this.field_G.field_i = (wo) ((Object) var6);
          }
          if (this.field_H != null) {
            this.field_H.field_i = (wo) ((Object) var6);
          }
          this.field_J.field_t = tm.field_c;
          if (this.field_H != null) {
            this.field_H.field_t = pg.field_c;
          }
          if (!this.field_E) {
            if (!this.field_A) {
              this.field_G.field_i = (wo) ((Object) new ok());
            } else {
              this.field_G.field_t = md.field_o;
              this.field_G.field_i = (wo) ((Object) new ok());
            }
          } else {
            this.field_G.field_t = sl.field_n;
          }
          this.field_j = 15;
          var7 = ai.field_h;
          if (this.field_B != null) {
            this.field_j = this.field_j + (5 + var7.b(this.field_B, -40 + this.field_g, var7.field_o));
          }
          var8 = ee.field_q;
          var9 = ua.a(-11662, le.b((byte) -20));
          if (var9 != gg.field_d) {
            if (var9 == wp.field_c) {
              var8 = to.field_e;
            }
          } else {
            var8 = ce.field_bb;
          }
          dupTemp$0 = new ei(10, this.field_j, -20 + this.field_g, 25, this.field_J, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$0;
          this.b(dupTemp$0, 16);
          this.field_j = this.field_j + (((qm) ((Object) var12)).field_f + 5);
          dupTemp$1 = new ei(10, this.field_j, -20 + this.field_g, 25, this.field_z, false, 80, 3, var7, 16777215, fh.field_h);
          var13 = dupTemp$1;
          this.b(dupTemp$1, -127);
          this.field_M.field_l = (bi) (this);
          this.field_j = this.field_j + (5 + ((qm) ((Object) var13)).field_f);
          if (this.field_H != null) {
            this.field_H.field_l = (bi) (this);
          }
          if (null != this.field_G) {
            this.field_G.field_l = (bi) (this);
          }
          if (this.field_H != null) {
            this.field_M.a(30, 85, this.field_j, -95 + this.field_g, (byte) -52);
            this.field_j = this.field_j + 60;
          } else {
            this.field_M.a(30, 8, this.field_j, -6 + (this.field_g - 10), (byte) -52);
            this.field_j = this.field_j + 35;
          }
          if (this.field_H != null) {
            this.field_H.a(30, 8, this.field_j, -10 + (this.field_g - 6), (byte) -52);
            this.field_j = this.field_j + 35;
          }
          if (null != this.field_G) {
            if (!this.field_E &&
              !this.field_A) {
              this.field_G.a(20, 8, this.field_j, 40, (byte) -52);
              this.field_j = this.field_j + 25;
            } else {
              this.field_G.a(30, 8, this.field_j, this.field_g - 6 - 10, (byte) -52);
              this.field_j = this.field_j + 35;
            }
          }
          this.a(3 + this.field_j, 0, 0, this.field_g, (byte) -52);
          this.b(this.field_M, 108);
          if (this.field_H != null) {
            this.b(this.field_H, 45);
          }
          if (null != this.field_G) {
            this.b(this.field_G, 34);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = var6_ref;
          stackIn_59_1 = new StringBuilder().append("vk.<init>(");
          if (param0 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          stackIn_62_1 = ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(',');
          if (param1 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, qm param2, char param3) {
        RuntimeException var5 = null;
        boolean stackIn_8_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1 + 0, param2, param3)) {
            return true;
          }
          if (param1 != 19279) {
            this.field_G = (pc) null;
          }
          if (param0 == 98) {
            stackIn_8_0 = this.a((byte) -117, param2);
            return stackIn_8_0;
          }
          if (param0 != 99) {
            return false;
          }
          stackIn_11_0 = this.a(param2, param1 ^ -11898);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("vk.AA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
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
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = 3 / ((param0 + 20) / 46);
          if (param1 == this.field_J) {
            this.field_z.a(true, (qm) (this));
          }
          if (this.field_z == param1) {
            this.c(false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("vk.U(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
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
