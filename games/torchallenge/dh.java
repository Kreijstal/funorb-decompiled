/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dh extends df {
    private ka field_Z;
    static ka[][] field_cb;
    private String field_W;
    static ka field_Y;
    static am field_V;
    private wd field_bb;
    private int field_X;
    static ka field_ab;

    final static fb a(int param0, lj param1, boolean param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_4_0 = null;
        fb stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2) {
            field_V = (am) null;
          }
          var4 = param1.c(param0, -103);
          var3 = var4;
          if (var4 != null) {
            stackIn_6_0 = new fb(var4);
            return stackIn_6_0;
          }
          stackIn_4_0 = null;
          return (fb) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("dh.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    dh(wd param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, kk.c(false));
        try {
          this.field_W = param1;
          this.field_bb = param0;
          this.a((byte) 118, param2, param5, param4, param3);
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "dh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (0 != (7 & param1)) {
          var2 = 8 - (param1 & 7);
        }
        int var3 = var2 + param1;
        if (param0 == 8) {
          return var3;
        }
        return 26;
    }

    final void a(ee param0, int param1, byte param2, int param3) {
        this.field_X = this.field_X + 1;
        if (param2 > -97) {
          return;
        }
        try {
          super.a(param0, param1, (byte) -103, param3);
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "dh.U(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void g(int param0) {
        field_Y = null;
        field_cb = (ka[][]) null;
        if (param0 == 112) {
          field_ab = null;
          field_V = null;
          return;
        }
        dh.a(-110, -29);
        field_ab = null;
        field_V = null;
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        rj var6;
        int var9;
        int var10;
        int var13;
        String var17;
        Object var18;
        ka var19;
        ka var20;
        Object var24;
        Object var37;
        gd var41;
        String var5;
        int var11;
        int var12;
        ka var16;
        ka var21;
        String var23;
        ka var25;
        ka var27;
        ka var30;
        ka var32;
        ka var38;
        ka var39;
        ka var40;
        gd var42;
        gd var43;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        rj var6Lifetime1;
        ka var16Lifetime1;
        ka var16Lifetime2;
        var18 = null;
        var24 = null;
        var37 = null;
        var13 = TorChallenge.field_F ? 1 : 0;
        var6 = this.field_bb.b(105);
        if (bl.field_S == var6) {
          var17 = hb.field_h;
          if (!var17.equals(this.field_v)) {
            this.field_v = var17;
            this.d(false);
          }
          super.a(param0, param1, param2, param3);
          var6 = this.field_bb.b(-74);
          var41 = (gd) ((Object) this.field_q);
          var9 = this.field_m + param1;
          var10 = var41.a((ee) (this), 3, param0) + (var41.a(102, (ee) (this)).a((byte) -63) >> 1);
          if (var6 != bl.field_S &&
            jh.field_c != var6) {
            if (lk.field_c == var6) {
              var19 = ub.field_f[2];
              var19.b(var9, -(var19.field_x >> 1) + var10, 256);
              return;
            }
            if (var6 != tf.field_w) {
              return;
            }
            var20 = ub.field_f[1];
            var20.b(var9, var10 - (var20.field_x >> 1), 256);
            return;
          }
          var21 = ub.field_f[0];
          var16 = var21;
          var11 = var21.field_q << 1;
          var12 = var21.field_v << 1;
          if (this.field_Z != null &&
            this.field_Z.field_u >= var11 &&
            this.field_Z.field_x >= var12) {
            ad.a(122, this.field_Z);
            qg.b();
          } else {
            this.field_Z = new ka(var11, var12);
            ad.a(-114, this.field_Z);
          }
          var21.b(112, 144, var21.field_q << 4, var21.field_v << 4, -this.field_X << 10, 4096);
          ie.b((byte) -9);
          this.field_Z.b(-(var21.field_q >> 1) + var9, var10 - var21.field_v, 256);
          return;
        }
        if (var6 != jh.field_c) {
          var5 = this.field_bb.a((byte) -10);
          if (var5 == null) {
            var5 = this.field_W;
          }
          if (!var5.equals(this.field_v)) {
            this.field_v = var5;
            this.d(false);
          }
          super.a(param0, param1, param2, param3);
          var6 = this.field_bb.b(-74);
          var43 = (gd) ((Object) this.field_q);
          var9Lifetime1 = this.field_m + param1;
          var10Lifetime1 = var43.a((ee) (this), 3, param0) + (var43.a(102, (ee) (this)).a((byte) -63) >> 1);
          if (var6 != bl.field_S &&
            jh.field_c != var6) {
            if (lk.field_c == var6) {
              var38 = ub.field_f[2];
              var38.b(var9Lifetime1, -(var38.field_x >> 1) + var10Lifetime1, 256);
              return;
            }
            if (var6 != tf.field_w) {
              return;
            }
            var39 = ub.field_f[1];
            var39.b(var9Lifetime1, var10Lifetime1 - (var39.field_x >> 1), 256);
            return;
          }
          var40 = ub.field_f[0];
          var11Lifetime1 = var40.field_q << 1;
          var12Lifetime1 = var40.field_v << 1;
          if (this.field_Z == null) {
            this.field_Z = new ka(var11Lifetime1, var12Lifetime1);
            ad.a(-114, this.field_Z);
          } else {
            if (this.field_Z.field_u < var11Lifetime1) {
              this.field_Z = new ka(var11Lifetime1, var12Lifetime1);
              ad.a(-114, this.field_Z);
            } else {
              if (this.field_Z.field_x >= var12Lifetime1) {
                ad.a(122, this.field_Z);
                qg.b();
              } else {
                this.field_Z = new ka(var11Lifetime1, var12Lifetime1);
                ad.a(-114, this.field_Z);
              }
            }
          }
          var40.b(112, 144, var40.field_q << 4, var40.field_v << 4, -this.field_X << 10, 4096);
          ie.b((byte) -9);
          this.field_Z.b(-(var40.field_q >> 1) + var9Lifetime1, var10Lifetime1 - var40.field_v, 256);
          return;
        }
        var23 = hb.field_h;
        if (!var23.equals(this.field_v)) {
          this.field_v = var23;
          this.d(false);
        }
        super.a(param0, param1, param2, param3);
        var6Lifetime1 = this.field_bb.b(-74);
        var42 = (gd) ((Object) this.field_q);
        var9Lifetime2 = this.field_m + param1;
        var10Lifetime2 = var42.a((ee) (this), 3, param0) + (var42.a(102, (ee) (this)).a((byte) -63) >> 1);
        if (var6Lifetime1 == bl.field_S) {
          var25 = ub.field_f[0];
          var16Lifetime1 = var25;
          var11Lifetime2 = var25.field_q << 1;
          var12Lifetime2 = var25.field_v << 1;
          if (this.field_Z != null &&
            this.field_Z.field_u >= var11Lifetime2 &&
            this.field_Z.field_x >= var12Lifetime2) {
            ad.a(122, this.field_Z);
            qg.b();
          } else {
            this.field_Z = new ka(var11Lifetime2, var12Lifetime2);
            ad.a(-114, this.field_Z);
          }
          var25.b(112, 144, var25.field_q << 4, var25.field_v << 4, -this.field_X << 10, 4096);
          ie.b((byte) -9);
          this.field_Z.b(-(var25.field_q >> 1) + var9Lifetime2, var10Lifetime2 - var25.field_v, 256);
          return;
        }
        if (jh.field_c != var6Lifetime1) {
          if (lk.field_c == var6Lifetime1) {
            var27 = ub.field_f[2];
            var27.b(var9Lifetime2, -(var27.field_x >> 1) + var10Lifetime2, 256);
            return;
          }
          if (var6Lifetime1 != tf.field_w) {
            return;
          }
          var30 = ub.field_f[1];
          var30.b(var9Lifetime2, var10Lifetime2 - (var30.field_x >> 1), 256);
          return;
        }
        var32 = ub.field_f[0];
        var16Lifetime2 = var32;
        var11Lifetime3 = var32.field_q << 1;
        var12Lifetime3 = var32.field_v << 1;
        if (this.field_Z == null) {
          this.field_Z = new ka(var11Lifetime3, var12Lifetime3);
          ad.a(-114, this.field_Z);
        } else {
          if (this.field_Z.field_u < var11Lifetime3) {
            this.field_Z = new ka(var11Lifetime3, var12Lifetime3);
            ad.a(-114, this.field_Z);
          } else {
            if (this.field_Z.field_x >= var12Lifetime3) {
              ad.a(122, this.field_Z);
              qg.b();
            } else {
              this.field_Z = new ka(var11Lifetime3, var12Lifetime3);
              ad.a(-114, this.field_Z);
            }
          }
        }
        var32.b(112, 144, var32.field_q << 4, var32.field_v << 4, -this.field_X << 10, 4096);
        ie.b((byte) -9);
        this.field_Z.b(-(var32.field_q >> 1) + var9Lifetime2, var10Lifetime2 - var32.field_v, 256);
        return;
    }

    final boolean a(ee param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 0) {
            return false;
          }
          this.field_W = (String) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("dh.RA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static ae a(int param0, int param1, byte param2, int param3, int param4) {
        Object var5;
        ae var5_ref;
        int var6;
        ae var5_refLifetime1;
        var5 = null;
        var6 = TorChallenge.field_F ? 1 : 0;
        if (param2 == -69) {
          var5_ref = (ae) (bk.field_t.c((byte) 121));
          while (var5_ref != null) {
            if (var5_ref.field_o == param0) {
              return var5_ref;
            }
            var5_ref = (ae) (bk.field_t.c(param2 ^ 329));
          }
        } else {
          dh.a(-109, -75, (byte) -32, 2, -86);
          var5_ref = (ae) (bk.field_t.c((byte) 121));
          while (var5_ref != null) {
            if (var5_ref.field_o == param0) {
              return var5_ref;
            }
            var5_ref = (ae) (bk.field_t.c(param2 ^ 329));
          }
        }
        var5_refLifetime1 = new ae();
        var5_refLifetime1.field_r = param1;
        var5_refLifetime1.field_q = param3;
        var5_refLifetime1.field_o = param0;
        bk.field_t.a(var5_refLifetime1, -53);
        bg.a(param4, (byte) 26, var5_refLifetime1);
        return var5_refLifetime1;
    }

    final String b(boolean param0) {
        if (!param0) {
          return null;
        }
        this.b(false);
        return null;
    }

    static {
        field_V = new am(0);
    }
}
