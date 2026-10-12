/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mq extends je {
    private int[] field_Ub;
    private int field_Sb;
    private int field_Yb;
    static volatile int field_Xb;
    private int field_Qb;
    private int field_Pb;
    static String field_Mb;
    static String[] field_Lb;
    private nf[] field_Vb;
    static int field_Wb;
    static String field_Nb;
    private int field_Tb;
    private int field_Zb;
    private int field_Ib;
    private mq field_Ob;
    private char[] field_Kb;
    private mq[] field_Rb;
    private int field_Jb;

    public static void k(int param0) {
        field_Nb = null;
        field_Lb = null;
        if (param0 != 85) {
          mq.k(22);
        }
        field_Mb = null;
    }

    final void b(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7;
        int var8;
        int var9;
        int var7Lifetime1;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        this.field_Qb = this.field_Jb + 2 * param0;
        this.a(this.field_Sb, param5 ^ 18789, this.field_Qb, -this.field_Sb + param2, param3);
        if (this.field_Zb != param4) {
          this.field_Zb = param4;
          this.c(this.field_Yb, 48);
        }
        for (var7 = 0; var7 < this.field_Tb; var7++) {
          this.field_Vb[var7].a(this.field_Ib, param0, -30061, this.field_Qb, this.field_Vb[var7].field_ab, 0, param1);
        }
        if (param5 != -6519) {
          this.field_Jb = 23;
        }
        if (this.field_Pb != -1 &&
          this.field_Rb[this.field_Pb] != null) {
          var7Lifetime1 = this.field_Rb[this.field_Pb].field_Tb;
          for (var8 = this.field_Ib * (var7Lifetime1 + this.field_Pb) + this.field_ab; param2 < var8; var8 = var8 - this.field_Ib) {
          }
          this.field_Rb[this.field_Pb].b(param0, param1, var8, this.field_Qb + param3, this.field_Vb[this.field_Pb].field_D, -6519);
        }
    }

    final boolean d(byte param0) {
        nf var5 = null;
        int var4 = 0;
        int var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var2 = 0;
        nf[] var3 = this.field_Vb;
        int var4Lifetime1;
        for (var4 = 0; var3.length > var4; var4++) {
          var5 = var3[var4];
          var2 = var2 | (var5.field_yb != 0 ? 1 : 0);
        }
        var4Lifetime1 = 98 % ((-22 - param0) / 32);
        if (var2 == 0 && this.field_Pb != -1 &&
          null != this.field_Rb[this.field_Pb]) {
          var2 = this.field_Rb[this.field_Pb].d((byte) -58) ? 1 : 0;
        }
        return var2 != 0;
    }

    final boolean a(boolean param0, int param1, int param2) {
        int var6 = 0;
        int var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var4 = 85 == rs.field_q ? 1 : 0;
        if (this.field_Ob != null) {
          if (var4 != 0 &&
            -1 == this.field_Ob.field_Pb) {
            this.f((byte) -106);
            this.c(0, -125);
            return true;
          }
          return this.field_Ob.a(false, param1, param2);
        }
        if (null == this.field_Ob && this == qd.field_I &&
          var4 != 0) {
          e.a((byte) -101);
          return true;
        }
        int var5 = DualNodeDeque.field_i;
        if (param0) {
          this.a(-72, (byte) -60, -60);
        }
        if (var5 > 0) {
          if (var5 == et.field_a) {
            var5 = 63;
          }
          for (var6 = 0; this.field_Kb.length > var6; var6++) {
            if (var5 == this.field_Kb[var6]) {
              this.a(param2, 23312, var6, param1);
              return true;
            }
          }
        }
        return false;
    }

    final void f(byte param0) {
        int var3 = 0;
        nf var4 = null;
        int var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        nf[] var6 = this.field_Vb;
        nf[] var2 = var6;
        if (param0 != -106) {
          this.a(true, -115, -112);
        }
        for (var3 = 0; var3 < var6.length; var3++) {
          var4 = var6[var3];
          var4.field_yb = 0;
          var4.field_rb = false;
        }
        if (this.field_Ob != null) {
          this.field_Ob.f((byte) -106);
          this.field_Ob.unlink(param0 ^ 25);
        }
        this.field_Pb = -1;
        this.field_Ob = null;
        this.c(12, -127);
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param1 != 23312) {
          this.a(-87, (byte) 117, -22);
        }
        if (param2 == this.field_Pb) {
          this.f((byte) -106);
          this.c(0, -123);
        } else {
          if (null != this.field_Rb[param2]) {
            this.f((byte) -106);
            this.c(0, -124);
            this.field_Pb = param2;
            this.field_Ob = this.field_Rb[this.field_Pb];
            lw.a((byte) 79, this.field_Ob);
            this.field_Ob.c(12, 42);
          } else {
            if (this.field_Ub[param2] == -1) {
              gn.d(5);
              e.a((byte) -115);
            } else {
              var5 = 32768 | this.field_Ub[param2];
              var6 = rs.field_t;
              if (var6 == 0 &&
                null != vu.field_M) {
                var6 = 1;
              }
              if (kp.a(var6, 114) == 2) {
                ud.b(1, false, var6, param3);
              }
              String var8 = (String) null;
              it.a(var5, -91, rs.field_t, qd.field_G, param0, (String) null);
              jh.a(qd.field_G, dj.field_e, var5, rs.field_t, param1 ^ 4124);
              e.a((byte) -126);
              wf.g(-20873);
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        ac.field_k[0].b(param0, param4, param5, param1);
        var8 = 0;
        var9 = CampaignMenuEntry.field_u[param2];
        if (var9 == 11) {
          var8 = 1;
          var9 = 7;
        }
        if (var9 == 0) {
          return;
        }
        var10 = 53 % ((param6 + 10) / 62);
        if (var9 == 7) {
          pv.field_b = var9;
          gt.field_i = var9;
          cs.field_Y = var9;
          np.field_Wb = var9;
          va.field_z = var9;
          rq.field_m = var9;
          j.field_b = var9;
          uf.field_e = var9;
          oh.field_E = var9;
          stackIn_9_0 = (param3 <= 0) ? 0 : 1;
          var11 = stackIn_9_0;
          stackIn_12_0 = (param3 >= -1 + ResourceRequest.field_y) ? 0 : 1;
          var12 = stackIn_12_0;
          if (param7 > 0) {
            if (var11 != 0) {
              np.field_Wb = CampaignMenuEntry.field_u[-1 + (param2 - ResourceRequest.field_y)];
            }
            pv.field_b = CampaignMenuEntry.field_u[param2 - ResourceRequest.field_y];
            if (var12 != 0) {
              rq.field_m = CampaignMenuEntry.field_u[-ResourceRequest.field_y + (param2 + 1)];
            }
          }
          if (var11 != 0) {
            cs.field_Y = CampaignMenuEntry.field_u[param2 - 1];
          }
          if (var12 != 0) {
            uf.field_e = CampaignMenuEntry.field_u[1 + param2];
          }
          var9 = var9 * 20;
          if (param7 < -1 + ef.field_c) {
            if (var11 != 0) {
              oh.field_E = CampaignMenuEntry.field_u[-1 + param2 + ResourceRequest.field_y];
            }
            va.field_z = CampaignMenuEntry.field_u[param2 + ResourceRequest.field_y];
            if (var12 != 0) {
              gt.field_i = CampaignMenuEntry.field_u[param2 + ResourceRequest.field_y + 1];
            }
          }
          ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, uf.field_e, -26) + (0 + var9)].b(param0, param4, param5, param1);
          ac.field_k[var9 - (-1 - ls.a(np.field_Wb, j.field_b, pv.field_b, cs.field_Y, -87))].b(param0, param4, param5, param1);
          ac.field_k[2 + var9 + ls.a(gt.field_i, j.field_b, va.field_z, uf.field_e, -68)].b(param0, param4, param5, param1);
          ac.field_k[3 + (var9 + ls.a(oh.field_E, j.field_b, va.field_z, cs.field_Y, -72))].b(param0, param4, param5, param1);
          if (cu.field_a &&
            var8 == 0 &&
            (og.field_p[param2] + param2 & 5) == 5) {
            nr.field_c[6 + og.field_p[param2] % 8].b(param0, -40 + param4, param5, param1);
          }
        }
        return;
    }

    final static void a(je param0, int param1, boolean param2) {
        tg var8 = null;
        RgbSprite var10 = null;
        String var9 = null;
        tg var11 = null;
        RgbSprite var13 = null;
        String var12 = null;
        tg var14 = null;
        RgbSprite var16 = null;
        String var15 = null;
        tg var17 = null;
        RgbSprite var19 = null;
        String var18 = null;
        tg var20 = null;
        RgbSprite var22 = null;
        String var21 = null;
        tg var23 = null;
        RgbSprite var25 = null;
        String var24 = null;
        tg var26 = null;
        String var27 = null;
        tg var29 = null;
        RgbSprite var31 = null;
        String var30 = null;
        tg var32 = null;
        RgbSprite var34 = null;
        String var33 = null;
        tg var35 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RgbSprite var28 = null;
        RgbSprite var28Lifetime1;
        RgbSprite var28Lifetime2;
        RgbSprite var28Lifetime3;
        RgbSprite var28Lifetime4;
        RgbSprite var28Lifetime5;
        RgbSprite var28Lifetime6;
        RgbSprite var28Lifetime7;
        RgbSprite var28Lifetime1Lifetime1;
        RgbSprite var28Lifetime1Lifetime2;
        RgbSprite var28Lifetime1Lifetime3;
        RgbSprite var28Lifetime1Lifetime4;
        RgbSprite var28Lifetime1Lifetime5;
        ng.a((dn) null, param0, (int[]) null, (String) null, -1, 2, param1, (String) null, 0L);
        if (param2) {
          return;
        }
        try {
          if (0 == param1) {
            var8 = tn.field_Z;
            var10 = dh.field_n[0];
            var28 = var10;
            var28Lifetime3 = var10;
            var9 = vl.field_o;
            var8.field_i.a(false, var9, 11, var10);
            var11 = tn.field_Z;
            var13 = dh.field_n[1];
            var28Lifetime4 = var13;
            var28Lifetime5 = var13;
            var12 = li.field_m;
            var11.field_i.a(false, var12, 12, var13);
            var14 = tn.field_Z;
            var16 = dh.field_n[2];
            var28Lifetime6 = var16;
            var28Lifetime7 = var16;
            var15 = ou.field_g;
            var14.field_i.a(param2, var15, 13, var16);
          }
          if (param1 == 1) {
            var17 = tn.field_Z;
            var19 = dh.field_n[0];
            var28Lifetime1 = var19;
            var28Lifetime1Lifetime1 = var19;
            var18 = vk.field_c;
            var17.field_i.a(false, var18, 11, var19);
            var20 = tn.field_Z;
            var22 = dh.field_n[1];
            var28Lifetime1Lifetime2 = var22;
            var28Lifetime1Lifetime3 = var22;
            var21 = fd.field_l;
            var20.field_i.a(param2, var21, 12, var22);
            var23 = tn.field_Z;
            var25 = dh.field_n[2];
            var28Lifetime1Lifetime4 = var25;
            var28Lifetime1Lifetime5 = var25;
            var24 = fa.field_c;
            var23.field_i.a(false, var24, 13, var25);
          }
          if (param1 == 2) {
            var26 = tn.field_Z;
            var28Lifetime2 = dh.field_n[0];
            var27 = SocketResourceClient.field_v;
            var26.field_i.a(param2, var27, 11, var28Lifetime2);
            var29 = tn.field_Z;
            var31 = dh.field_n[1];
            var30 = jj.field_e;
            var29.field_i.a(param2, var30, 12, var31);
            var32 = tn.field_Z;
            var34 = dh.field_n[2];
            var33 = ai.field_R;
            var32.field_i.a(false, var33, 13, var34);
          }
          var35 = tn.field_Z;
          var4 = param0.field_V;
          var5 = param0.field_D;
          var6 = param0.field_gb;
          var7 = param0.field_ob;
          var35.field_i.a(var7, var5, var6, (byte) -118, var4);
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "mq.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int e(byte param0) {
        int var2 = 6 / ((-76 - param0) / 46);
        return this.field_Qb + (this.field_Ob == null ? 0 : this.field_Ob.e((byte) -124));
    }

    private final void c(int param0, int param1) {
        int var6 = 0;
        int var4 = 0;
        int var5 = 0;
        int var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var3 = 61 % ((-72 - param1) / 51);
        this.field_Yb = param0;
        for (var6 = 0; var6 < this.field_Tb; var6++) {
          var4 = this.field_Ib * var6;
          var5 = this.field_Yb * this.field_Yb;
          this.field_Vb[var6].field_ab = ((-var5 + 144) * var4 + (this.field_Zb - this.field_D) * var5) / 144;
        }
    }

    final void a(int param0, byte param1, int param2) {
        int var4_int = 0;
        nf var5;
        int var6;
        nf stackIn_9_0 = null;
        boolean stackIn_10_1 = false;
        mq var4;
        mq var7;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param1 != -42) {
          return;
        }
        for (var4_int = 0; var4_int < this.field_Vb.length; var4_int++) {
          var5 = this.field_Vb[var4_int];
          if (var5.field_yb == 1) {
            this.a(param2, 23312, var4_int, param0);
            stackIn_9_0 = var5;
            stackIn_10_1 = (this.field_Pb == var4_int);
            stackIn_9_0.field_rb = stackIn_10_1;
          }
        }
        if (this.field_Pb != -1) {
          var7 = this.field_Rb[this.field_Pb];
          var4 = var7;
          if (var4 != null) {
            var7.a(param0, (byte) -42, param2);
          }
        }
        if (0 < this.field_Yb) {
          this.c(this.field_Yb - 1, -126);
        }
    }

    mq(long param0, je param1, je param2, je param3, mq[] param4, int[] param5, String[] param6, char[] param7) {
        super(param0, param1);
        int var13 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        String var11 = null;
        String var12 = null;
        Object var14 = null;
        int var15 = 0;
        BitmapFont var17 = null;
        BitmapFont var18 = null;
        this.field_Pb = -1;
        try {
          this.field_Ub = param5;
          this.field_Rb = param4;
          this.field_Kb = param7;
          this.field_Tb = this.field_Ub.length;
          var17 = param3.field_Z;
          var18 = var17;
          this.field_Ib = var18.field_L + var18.field_H + 2;
          this.field_Sb = this.field_Ib * this.field_Tb;
          this.field_Jb = 0;
          this.field_Vb = new nf[this.field_Tb];
          var11 = "<col=999999>";
          var12 = "</col>";
          for (var13 = 0; this.field_Tb > var13; var13++) {
            if (this.field_Kb[var13] > 0) {
              param6[var13] = var11 + db.a(true, this.field_Kb[var13]).toUpperCase() + ": " + var12 + param6[var13];
            }
            var14 = null;
            if (this.field_Rb[var13] != null ||
              this.field_Ub[var13] == -1) {
              var14 = s.field_c;
            }
            this.field_Vb[var13] = new nf(0L, param2, (je) null, param3, (RgbSprite) (var14), param6[var13]);
            this.a(this.field_Vb[var13], 55);
            var15 = var17.a(param6[var13]);
            if (this.field_Jb < var15) {
              this.field_Jb = var15;
            }
          }
          this.field_Jb = this.field_Jb + (10 + s.field_c.canvasWidth);
          this.c(12, -8);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_15_0 = var10;
          stackIn_15_1 = new StringBuilder().append("mq.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param4 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param5 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param6 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param7 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    static {
        field_Nb = "Please enter your date of birth to enable chat:";
        field_Xb = 0;
        field_Lb = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_Mb = "<%0> has been defeated";
        field_Wb = 3;
    }
}
