/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk extends kj {
    static int field_ab;
    private String field_V;
    private o field_W;
    static String field_T;
    static String field_X;
    private int field_Z;
    static o field_Y;
    private oe field_U;

    final static void i(int param0) {
        wb.a(ia.g(-74), (byte) -83);
        if (param0 != 918092705) {
          pk.a(41, false, 105);
        }
    }

    final boolean a(int param0, rc param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -1463) {
            return false;
          }
          field_Y = (o) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("pk.MA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static int[] a(int param0, boolean param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var3 = uk.a((byte) -64, param0);
        int var4 = rd.a((byte) -30, param0);
        if (!param1) {
          var5 = uk.a((byte) -64, param2);
          var6 = rd.a((byte) -30, param2);
          var7 = (int)((long)var3 * (long)var5 >> 16);
          var8 = (int)((long)var3 * (long)var6 >> 16);
          var9 = (int)((long)var4 * (long)var5 >> 16);
          var10 = (int)((long)var4 * (long)var6 >> 16);
          return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
        }
        field_Y = (o) null;
        var5 = uk.a((byte) -64, param2);
        var6 = rd.a((byte) -30, param2);
        var7 = (int)((long)var3 * (long)var5 >> 16);
        var8 = (int)((long)var3 * (long)var6 >> 16);
        var9 = (int)((long)var4 * (long)var5 >> 16);
        var10 = (int)((long)var4 * (long)var6 >> 16);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    final void a(int param0, int param1, int param2, int param3) {
        qf var6;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        String var17;
        Object var18;
        o var19;
        o var20;
        o var21;
        String var22;
        Object var23;
        o var24;
        o var25;
        o var26;
        String var27;
        Object var28;
        o var29;
        o var30;
        Object var33;
        eg var37;
        eg var38;
        eg var39;
        o var16;
        o var31;
        String var32;
        o var34;
        o var35;
        o var36;
        eg var40;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        qf var6Lifetime1;
        qf var6Lifetime2;
        var18 = null;
        var23 = null;
        var28 = null;
        var33 = null;
        var13 = SolKnight.field_L ? 1 : 0;
        var6 = this.field_U.b(param3 ^ -9362);
        if (hg.field_E == var6) {
          var17 = g.field_e;
          if (!var17.equals(this.field_i)) {
            this.field_i = var17;
            this.a((byte) -21);
          }
          super.a(param0, param1, param2, param3);
          var6 = this.field_U.b(-9362);
          var37 = (eg) ((Object) this.field_w);
          var9 = param2 + this.field_m;
          var10 = var37.a((rc) (this), false, param0) + (var37.a(-21480, (rc) (this)).a((byte) 126) >> 1);
          if (var6 != hg.field_E &&
            db.field_u != var6) {
            if (rg.field_f == var6) {
              var20 = gb.field_k[2];
              var20.a(var9, -(var20.field_t >> 1) + var10, 256);
              return;
            }
            if (var6 != ph.field_g) {
              return;
            }
            var19 = gb.field_k[1];
            var19.a(var9, var10 - (var19.field_t >> 1), 256);
            return;
          }
          var21 = gb.field_k[0];
          var11 = var21.field_q << 1;
          var12 = var21.field_r << 1;
          if (null == this.field_W) {
            this.field_W = new o(var11, var12);
            cl.a(-94, this.field_W);
          } else {
            if (var11 > this.field_W.field_p) {
              this.field_W = new o(var11, var12);
              cl.a(-94, this.field_W);
            } else {
              if (var12 <= this.field_W.field_t) {
                cl.a(-125, this.field_W);
                mi.a();
              } else {
                this.field_W = new o(var11, var12);
                cl.a(-94, this.field_W);
              }
            }
          }
          var21.b(112, 144, var21.field_q << 4, var21.field_r << 4, -this.field_Z << 10, 4096);
          mf.e(4096);
          this.field_W.a(-(var21.field_q >> 1) + var9, var10 - var21.field_r, 256);
          return;
        }
        if (db.field_u == var6) {
          var22 = g.field_e;
          if (!var22.equals(this.field_i)) {
            this.field_i = var22;
            this.a((byte) -21);
          }
          super.a(param0, param1, param2, param3);
          var6 = this.field_U.b(-9362);
          var38 = (eg) ((Object) this.field_w);
          var9Lifetime1 = param2 + this.field_m;
          var10Lifetime1 = var38.a((rc) (this), false, param0) + (var38.a(-21480, (rc) (this)).a((byte) 126) >> 1);
          if (var6 != hg.field_E &&
            db.field_u != var6) {
            if (rg.field_f == var6) {
              var25 = gb.field_k[2];
              var25.a(var9Lifetime1, -(var25.field_t >> 1) + var10Lifetime1, 256);
              return;
            }
            if (var6 != ph.field_g) {
              return;
            }
            var24 = gb.field_k[1];
            var24.a(var9Lifetime1, var10Lifetime1 - (var24.field_t >> 1), 256);
            return;
          }
          var26 = gb.field_k[0];
          var11Lifetime1 = var26.field_q << 1;
          var12Lifetime1 = var26.field_r << 1;
          if (null == this.field_W) {
            this.field_W = new o(var11Lifetime1, var12Lifetime1);
            cl.a(-94, this.field_W);
          } else {
            if (var11Lifetime1 > this.field_W.field_p) {
              this.field_W = new o(var11Lifetime1, var12Lifetime1);
              cl.a(-94, this.field_W);
            } else {
              if (var12Lifetime1 > this.field_W.field_t) {
                this.field_W = new o(var11Lifetime1, var12Lifetime1);
                cl.a(-94, this.field_W);
              } else {
                cl.a(-125, this.field_W);
                mi.a();
              }
            }
          }
          var26.b(112, 144, var26.field_q << 4, var26.field_r << 4, -this.field_Z << 10, 4096);
          mf.e(4096);
          this.field_W.a(-(var26.field_q >> 1) + var9Lifetime1, var10Lifetime1 - var26.field_r, 256);
          return;
        }
        var27 = this.field_U.c(-111);
        if (var27 != null) {
          if (!var27.equals(this.field_i)) {
            this.field_i = var27;
            this.a((byte) -21);
          }
          super.a(param0, param1, param2, param3);
          var6Lifetime1 = this.field_U.b(-9362);
          var39 = (eg) ((Object) this.field_w);
          var9Lifetime2 = param2 + this.field_m;
          var10Lifetime2 = var39.a((rc) (this), false, param0) + (var39.a(-21480, (rc) (this)).a((byte) 126) >> 1);
          if (var6Lifetime1 != hg.field_E &&
            db.field_u != var6Lifetime1) {
            if (rg.field_f == var6Lifetime1) {
              var30 = gb.field_k[2];
              var30.a(var9Lifetime2, -(var30.field_t >> 1) + var10Lifetime2, 256);
            } else {
              if (var6Lifetime1 != ph.field_g) {
                return;
              }
              var29 = gb.field_k[1];
              var29.a(var9Lifetime2, var10Lifetime2 - (var29.field_t >> 1), 256);
            }
            return;
          }
          var31 = gb.field_k[0];
          var16 = var31;
          var11Lifetime2 = var31.field_q << 1;
          var12Lifetime2 = var31.field_r << 1;
          if (null == this.field_W) {
            this.field_W = new o(var11Lifetime2, var12Lifetime2);
            cl.a(-94, this.field_W);
          } else {
            if (var11Lifetime2 > this.field_W.field_p) {
              this.field_W = new o(var11Lifetime2, var12Lifetime2);
              cl.a(-94, this.field_W);
            } else {
              if (var12Lifetime2 <= this.field_W.field_t) {
                cl.a(-125, this.field_W);
                mi.a();
              } else {
                this.field_W = new o(var11Lifetime2, var12Lifetime2);
                cl.a(-94, this.field_W);
              }
            }
          }
          var31.b(112, 144, var31.field_q << 4, var31.field_r << 4, -this.field_Z << 10, 4096);
          mf.e(4096);
          this.field_W.a(-(var31.field_q >> 1) + var9Lifetime2, var10Lifetime2 - var31.field_r, 256);
          return;
        }
        var32 = this.field_V;
        if (!var32.equals(this.field_i)) {
          this.field_i = var32;
          this.a((byte) -21);
        }
        super.a(param0, param1, param2, param3);
        var6Lifetime2 = this.field_U.b(-9362);
        var40 = (eg) ((Object) this.field_w);
        var9Lifetime3 = param2 + this.field_m;
        var10Lifetime3 = var40.a((rc) (this), false, param0) + (var40.a(-21480, (rc) (this)).a((byte) 126) >> 1);
        if (var6Lifetime2 != hg.field_E &&
          db.field_u != var6Lifetime2) {
          if (rg.field_f == var6Lifetime2) {
            var35 = gb.field_k[2];
            var35.a(var9Lifetime3, -(var35.field_t >> 1) + var10Lifetime3, 256);
            return;
          }
          if (var6Lifetime2 != ph.field_g) {
            return;
          }
          var34 = gb.field_k[1];
          var34.a(var9Lifetime3, var10Lifetime3 - (var34.field_t >> 1), 256);
          return;
        }
        var36 = gb.field_k[0];
        var11Lifetime3 = var36.field_q << 1;
        var12Lifetime3 = var36.field_r << 1;
        if (null == this.field_W) {
          this.field_W = new o(var11Lifetime3, var12Lifetime3);
          cl.a(-94, this.field_W);
        } else {
          if (var11Lifetime3 > this.field_W.field_p) {
            this.field_W = new o(var11Lifetime3, var12Lifetime3);
            cl.a(-94, this.field_W);
          } else {
            if (var12Lifetime3 <= this.field_W.field_t) {
              cl.a(-125, this.field_W);
              mi.a();
            } else {
              this.field_W = new o(var11Lifetime3, var12Lifetime3);
              cl.a(-94, this.field_W);
            }
          }
        }
        var36.b(112, 144, var36.field_q << 4, var36.field_r << 4, -this.field_Z << 10, 4096);
        mf.e(4096);
        this.field_W.a(-(var36.field_q >> 1) + var9Lifetime3, var10Lifetime3 - var36.field_r, 256);
        return;
    }

    public static void j(int param0) {
        int var1 = 118 % ((param0 + 39) / 46);
        field_X = null;
        field_Y = null;
        field_T = null;
    }

    final static void a(byte param0, int param1, boolean param2) {
        Throwable decompiledCaughtException = null;
        Object var3 = null;
        var3 = kj.field_P;
        synchronized (var3) {
          jg.a(c.field_M[param1], param0 + 182, param2);
          be.field_K = qc.field_o[param1];
          ed.a((byte) -122);
        }
        if (param0 == -96) {
          return;
        }
        pk.a(-56, true, 93);
    }

    final String c(byte param0) {
        if (param0 >= 14) {
          return null;
        }
        pk.i(109);
        return null;
    }

    final static void a(byte param0, rb param1) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        rb[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        rb[] var4 = null;
        var3 = SolKnight.field_L ? 1 : 0;
        try {
          if (0 < (param1.field_b << 17) + lc.field_h) {
            lc.field_h = lc.field_h + (param1.field_b << 17);
            ic.field_t = ic.field_t + ud.field_k * param1.field_b;
          } else {
            if (param1.field_b < lc.field_h >>> 17) {
              lc.field_h = lc.field_h - (param1.field_b << 17);
              ic.field_t = ic.field_t - ud.field_k * param1.field_b;
            }
          }
          boolean decompiledFrameCompleted0 = true;
          if (kf.field_G != null) {
            var2_int = 0;
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (kf.field_G.length <= var2_int))) {
              if (kf.field_G[var2_int] != null) {
                var2_int++;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              var4 = kf.field_G;
              var2 = var4;
              kf.field_G = new rb[kf.field_G.length << 1];
              fk.a(var2, 0, kf.field_G, 0, var4.length);
              kf.field_G[var4.length] = param1;
              decompiledFrameCompleted0 = false;
            }
            if (decompiledFrameCompleted0) {
              kf.field_G[var2_int] = param1;
              return;
            }
          }
          if (decompiledFrameCompleted0) {
            kf.field_G = new rb[8];
            kf.field_G[0] = param1;
          }
          if (param0 != 32) {
            pk.a((byte) 49, 75);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_19_0 = var2_ref;
          stackIn_19_1 = new StringBuilder().append("pk.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, mg param3, int param4, int param5, int param6, int param7, int param8, o[] param9, int param10, byte param11, o[] param12, int param13, int param14, int param15, int param16, mg param17, int param18, int param19, o[] param20) {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        try {
          la.a(param8, param0, param5, param15, param3, new hi(param20), param10, param18, param16, param13, param14, -111, param17, param1, param6, param7, new hi(param12), param4, new hi(param9), param2, param19);
          if (param11 >= -59) {
            pk.i(112);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_5_0 = var21;
          stackIn_5_1 = new StringBuilder().append("pk.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param10).append(',').append(param11).append(',');
          if (param12 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(',');
          if (param17 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param18).append(',').append(param19).append(',');
          if (param20 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static void c(boolean param0) {
        qk.d(14995);
        if (null == dc.field_q) {
          cb.a((byte) -15);
          nh.a(-117);
          m.b(param0);
          if (ak.a(60)) {
            id.field_c.e(1, -2147483648);
            qf.a(0, 0);
          }
          je.a(param0);
          return;
        }
        nc.a((byte) 86, dc.field_q);
        cb.a((byte) -15);
        nh.a(-117);
        m.b(param0);
        if (ak.a(60)) {
          id.field_c.e(1, -2147483648);
          qf.a(0, 0);
        }
        je.a(param0);
    }

    final void a(int param0, int param1, int param2, rc param3) {
        this.field_Z = this.field_Z + 1;
        if (param1 != 18874) {
          return;
        }
        try {
          super.a(param0, param1 + 0, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "pk.JA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    pk(oe param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, hj.a((byte) -65));
        try {
          this.field_V = param1;
          this.field_U = param0;
          this.b(param5, param4, param2, 0, param3);
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "pk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(byte param0, int param1) {
        vk.field_g = (param1 & 57) >> 4;
        lh.field_q = (15 & param1) >> 2;
        if (vk.field_g > 2) {
          vk.field_g = 2;
          if (2 < lh.field_q) {
            lh.field_q = 2;
          }
          if (param0 == -48) {
            bi.field_d = 3 & param1;
            if (bi.field_d > 2) {
              bi.field_d = 2;
            }
            return;
          }
          pk.d(true);
        } else {
          if (2 < lh.field_q) {
            lh.field_q = 2;
          }
          if (param0 != -48) {
            pk.d(true);
          }
        }
        bi.field_d = 3 & param1;
        if (bi.field_d <= 2) {
          return;
        }
        bi.field_d = 2;
    }

    final static void d(boolean param0) {
        if (!param0) {
          pk.i(16);
        }
    }

    static {
        field_T = "Combo Power: <%0>";
        field_X = "Confirm Password: ";
    }
}
