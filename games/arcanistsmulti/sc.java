/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc extends ej {
    private qb field_Y;
    static String field_S;
    static aj field_W;
    private int field_X;
    private pd field_J;
    private String field_ab;
    static String field_Z;
    static int[] field_U;
    static boolean field_V;
    static String field_T;
    static String field_bb;

    final void a(byte param0, int param1, int param2, int param3) {
        String var17 = null;
        ac var35 = null;
        qb var19 = null;
        qb var20 = null;
        qb var21 = null;
        ac var36 = null;
        qb var23 = null;
        qb var24 = null;
        qb var29 = null;
        qb var30 = null;
        qb var32 = null;
        qb var33 = null;
        String var5 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Object var18 = null;
        Object var22 = null;
        Object var31 = null;
        int var13 = ArcanistsMulti.field_G ? 1 : 0;
        eh var6 = this.field_J.a(-92);
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12Lifetime1;
        int var12Lifetime2;
        int var11Lifetime1Lifetime1;
        int var12Lifetime1Lifetime1;
        if (da.field_f == var6) {
          var17 = ea.field_D;
          if (!var17.equals(this.field_g)) {
            this.field_g = var17;
            this.g((byte) 63);
          }
          super.a((byte) -58, param1, param2, param3);
          if (param0 > -52) {
            this.field_Y = (qb) null;
          }
          var6 = this.field_J.a(-103);
          var35 = (ac) ((Object) this.field_r);
          var9 = this.field_n + param1;
          var10 = var35.a(param3, -13372, (qm) (this)) + (var35.a((qm) (this), -126).a((byte) -58) >> 1);
          if (da.field_f != var6 &&
            ug.field_c != var6) {
            if (var6 == ra.field_k) {
              var19 = qk.field_lb[2];
              var19.b(var9, var10 - (var19.field_y >> 1), 256);
              return;
            }
            if (nn.field_s == var6) {
              var20 = qk.field_lb[1];
              var20.b(var9, var10 - (var20.field_y >> 1), 256);
              return;
            }
            return;
          }
          var21 = qk.field_lb[0];
          var11 = var21.field_n << 1;
          var12 = var21.field_w << 1;
          if (null == this.field_Y) {
            this.field_Y = new qb(var11, var12);
            fk.a(this.field_Y, -23095);
            var21.b(112, 144, var21.field_n << 4, var21.field_w << 4, -this.field_X << 10, 4096);
            oo.c(-15405);
            this.field_Y.b(-(var21.field_n >> 1) + var9, var10 - var21.field_w, 256);
            return;
          }
          if (var11 > this.field_Y.field_q) {
            this.field_Y = new qb(var11, var12);
            fk.a(this.field_Y, -23095);
            var21.b(112, 144, var21.field_n << 4, var21.field_w << 4, -this.field_X << 10, 4096);
            oo.c(-15405);
            this.field_Y.b(-(var21.field_n >> 1) + var9, var10 - var21.field_w, 256);
            return;
          }
          if (this.field_Y.field_y >= var12) {
            fk.a(this.field_Y, -23095);
            de.b();
            var21.b(112, 144, var21.field_n << 4, var21.field_w << 4, -this.field_X << 10, 4096);
            oo.c(-15405);
            this.field_Y.b(-(var21.field_n >> 1) + var9, var10 - var21.field_w, 256);
            return;
          }
          this.field_Y = new qb(var11, var12);
          fk.a(this.field_Y, -23095);
          var21.b(112, 144, var21.field_n << 4, var21.field_w << 4, -this.field_X << 10, 4096);
          oo.c(-15405);
          this.field_Y.b(-(var21.field_n >> 1) + var9, var10 - var21.field_w, 256);
          return;
        }
        if (ug.field_c == var6) {
          var5 = ea.field_D;
        } else {
          var5 = this.field_J.c(26146);
          if (var5 == null) {
            var5 = this.field_ab;
          }
        }
        if (!var5.equals(this.field_g)) {
          this.field_g = var5;
          this.g((byte) 63);
        }
        super.a((byte) -58, param1, param2, param3);
        if (param0 <= -52) {
          var6 = this.field_J.a(-103);
          var36 = (ac) ((Object) this.field_r);
          var9Lifetime1 = this.field_n + param1;
          var10Lifetime1 = var36.a(param3, -13372, (qm) (this)) + (var36.a((qm) (this), -126).a((byte) -58) >> 1);
          if (da.field_f == var6) {
            var23 = qk.field_lb[0];
            var11Lifetime1 = var23.field_n << 1;
            var12Lifetime1 = var23.field_w << 1;
            if (null == this.field_Y) {
              this.field_Y = new qb(var11Lifetime1, var12Lifetime1);
              fk.a(this.field_Y, -23095);
              var23.b(112, 144, var23.field_n << 4, var23.field_w << 4, -this.field_X << 10, 4096);
              oo.c(-15405);
              this.field_Y.b(-(var23.field_n >> 1) + var9Lifetime1, var10Lifetime1 - var23.field_w, 256);
              return;
            }
            if (var11Lifetime1 > this.field_Y.field_q) {
              this.field_Y = new qb(var11Lifetime1, var12Lifetime1);
              fk.a(this.field_Y, -23095);
              var23.b(112, 144, var23.field_n << 4, var23.field_w << 4, -this.field_X << 10, 4096);
              oo.c(-15405);
              this.field_Y.b(-(var23.field_n >> 1) + var9Lifetime1, var10Lifetime1 - var23.field_w, 256);
              return;
            }
            if (this.field_Y.field_y >= var12Lifetime1) {
              fk.a(this.field_Y, -23095);
              de.b();
              var23.b(112, 144, var23.field_n << 4, var23.field_w << 4, -this.field_X << 10, 4096);
              oo.c(-15405);
              this.field_Y.b(-(var23.field_n >> 1) + var9Lifetime1, var10Lifetime1 - var23.field_w, 256);
              return;
            }
            this.field_Y = new qb(var11Lifetime1, var12Lifetime1);
            fk.a(this.field_Y, -23095);
            var23.b(112, 144, var23.field_n << 4, var23.field_w << 4, -this.field_X << 10, 4096);
            oo.c(-15405);
            this.field_Y.b(-(var23.field_n >> 1) + var9Lifetime1, var10Lifetime1 - var23.field_w, 256);
            return;
          }
          if (ug.field_c == var6) {
            var24 = qk.field_lb[0];
            qb var16 = var24;
            var11Lifetime1Lifetime1 = var24.field_n << 1;
            var12Lifetime1Lifetime1 = var24.field_w << 1;
            if (null == this.field_Y) {
              this.field_Y = new qb(var11Lifetime1Lifetime1, var12Lifetime1Lifetime1);
              fk.a(this.field_Y, -23095);
              var24.b(112, 144, var24.field_n << 4, var24.field_w << 4, -this.field_X << 10, 4096);
              oo.c(-15405);
              this.field_Y.b(-(var24.field_n >> 1) + var9Lifetime1, var10Lifetime1 - var24.field_w, 256);
              return;
            }
            if (var11Lifetime1Lifetime1 > this.field_Y.field_q) {
              this.field_Y = new qb(var11Lifetime1Lifetime1, var12Lifetime1Lifetime1);
              fk.a(this.field_Y, -23095);
              var24.b(112, 144, var24.field_n << 4, var24.field_w << 4, -this.field_X << 10, 4096);
              oo.c(-15405);
              this.field_Y.b(-(var24.field_n >> 1) + var9Lifetime1, var10Lifetime1 - var24.field_w, 256);
              return;
            }
            if (this.field_Y.field_y < var12Lifetime1Lifetime1) {
              this.field_Y = new qb(var11Lifetime1Lifetime1, var12Lifetime1Lifetime1);
              fk.a(this.field_Y, -23095);
              var24.b(112, 144, var24.field_n << 4, var24.field_w << 4, -this.field_X << 10, 4096);
              oo.c(-15405);
              this.field_Y.b(-(var24.field_n >> 1) + var9Lifetime1, var10Lifetime1 - var24.field_w, 256);
              return;
            }
            fk.a(this.field_Y, -23095);
            de.b();
            var24.b(112, 144, var24.field_n << 4, var24.field_w << 4, -this.field_X << 10, 4096);
            oo.c(-15405);
            this.field_Y.b(-(var24.field_n >> 1) + var9Lifetime1, var10Lifetime1 - var24.field_w, 256);
            return;
          }
          if (var6 == ra.field_k) {
            var29 = qk.field_lb[2];
            var29.b(var9Lifetime1, var10Lifetime1 - (var29.field_y >> 1), 256);
            return;
          }
          if (nn.field_s != var6) {
            return;
          }
          var30 = qk.field_lb[1];
          var30.b(var9Lifetime1, var10Lifetime1 - (var30.field_y >> 1), 256);
          return;
        }
        this.field_Y = (qb) null;
        var6 = this.field_J.a(-103);
        ac var37 = (ac) ((Object) this.field_r);
        var9Lifetime2 = this.field_n + param1;
        var10Lifetime2 = var37.a(param3, -13372, (qm) (this)) + (var37.a((qm) (this), -126).a((byte) -58) >> 1);
        if (da.field_f != var6 &&
          ug.field_c != var6) {
          if (var6 == ra.field_k) {
            var32 = qk.field_lb[2];
            var32.b(var9Lifetime2, var10Lifetime2 - (var32.field_y >> 1), 256);
            return;
          }
          if (nn.field_s != var6) {
            return;
          }
          var33 = qk.field_lb[1];
          var33.b(var9Lifetime2, var10Lifetime2 - (var33.field_y >> 1), 256);
          return;
        }
        qb var34 = qk.field_lb[0];
        var11Lifetime2 = var34.field_n << 1;
        var12Lifetime2 = var34.field_w << 1;
        if (null == this.field_Y) {
          this.field_Y = new qb(var11Lifetime2, var12Lifetime2);
          fk.a(this.field_Y, -23095);
          var34.b(112, 144, var34.field_n << 4, var34.field_w << 4, -this.field_X << 10, 4096);
          oo.c(-15405);
          this.field_Y.b(-(var34.field_n >> 1) + var9Lifetime2, var10Lifetime2 - var34.field_w, 256);
          return;
        }
        if (var11Lifetime2 > this.field_Y.field_q) {
          this.field_Y = new qb(var11Lifetime2, var12Lifetime2);
          fk.a(this.field_Y, -23095);
          var34.b(112, 144, var34.field_n << 4, var34.field_w << 4, -this.field_X << 10, 4096);
          oo.c(-15405);
          this.field_Y.b(-(var34.field_n >> 1) + var9Lifetime2, var10Lifetime2 - var34.field_w, 256);
          return;
        }
        if (this.field_Y.field_y >= var12Lifetime2) {
          fk.a(this.field_Y, -23095);
          de.b();
          var34.b(112, 144, var34.field_n << 4, var34.field_w << 4, -this.field_X << 10, 4096);
          oo.c(-15405);
          this.field_Y.b(-(var34.field_n >> 1) + var9Lifetime2, var10Lifetime2 - var34.field_w, 256);
          return;
        }
        this.field_Y = new qb(var11Lifetime2, var12Lifetime2);
        fk.a(this.field_Y, -23095);
        var34.b(112, 144, var34.field_n << 4, var34.field_w << 4, -this.field_X << 10, 4096);
        oo.c(-15405);
        this.field_Y.b(-(var34.field_n >> 1) + var9Lifetime2, var10Lifetime2 - var34.field_w, 256);
    }

    private final static void c(boolean param0) {
        if (!param0) {
          return;
        }
        q.a(pg.field_c, false, be.field_l, mf.field_d, am.field_c);
    }

    final static void a(boolean param0, boolean param1, boolean param2) {
        String var4 = (String) null;
        j.a(param2, (String) null, param0, param1);
    }

    final static String a(byte param0, byte[] param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= 85) {
            stackIn_4_0 = ba.a(0, param1.length, (byte) -127, param1);
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("sc.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void b(int param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var2Lifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        if (param1 != 14130) {
          return;
        }
        var2 = 0;
        var3 = gi.field_a;
        if (var3 < 5) {
          var2 = 8192 * (var3 * var3) / 1100;
          var4 = 1;
          var5 = 0;
          if (3 == param0) {
            var4 = -1;
          }
          if (param0 == 1) {
            var5 = 1;
          }
          if (4 == param0) {
            var5 = 1;
            var4 = 1;
          }
          if (param0 == 5) {
            var4 = -1;
            var5 = 1;
          }
          if (param0 == 6) {
            var4 = 1;
            var5 = -1;
          }
          if (7 == param0) {
            var4 = -1;
            var5 = -1;
          } else {
            if (8 == param0) {
              var4 = -1;
              var5 = -1;
            }
          }
          if (param0 == 11) {
            var4 = -1;
          }
          if (param0 == 12) {
            var4 = -1;
            var5 = -1;
          }
          if (param0 == 13) {
            var5 = -1;
            var4 = 1;
          }
          if (param0 == 14) {
            var4 = -1;
            var5 = 1;
          }
          if (param0 == 15) {
            var5 = 1;
            var4 = 1;
          }
          tn.field_Gb = ri.a(var2 * var5, (byte) 66, var4 * var2);
          return;
        }
        if (var3 < 105) {
          var2 = (-40960 + 16384 * var3) / 220;
          var4Lifetime1 = 1;
          var5Lifetime1 = 0;
          if (3 == param0) {
            var4Lifetime1 = -1;
          }
          if (param0 == 1) {
            var5Lifetime1 = 1;
          }
          if (4 == param0) {
            var5Lifetime1 = 1;
            var4Lifetime1 = 1;
          }
          if (param0 == 5) {
            var4Lifetime1 = -1;
            var5Lifetime1 = 1;
          }
          if (param0 == 6) {
            var4Lifetime1 = 1;
            var5Lifetime1 = -1;
          }
          if (7 == param0) {
            var4Lifetime1 = -1;
            var5Lifetime1 = -1;
          } else {
            if (8 == param0) {
              var4Lifetime1 = -1;
              var5Lifetime1 = -1;
            }
          }
          if (param0 == 11) {
            var4Lifetime1 = -1;
          }
          if (param0 == 12) {
            var4Lifetime1 = -1;
            var5Lifetime1 = -1;
          }
          if (param0 == 13) {
            var5Lifetime1 = -1;
            var4Lifetime1 = 1;
          }
          if (param0 == 14) {
            var4Lifetime1 = -1;
            var5Lifetime1 = 1;
          }
          if (param0 == 15) {
            var5Lifetime1 = 1;
            var4Lifetime1 = 1;
          }
          tn.field_Gb = ri.a(var2 * var5Lifetime1, (byte) 66, var4Lifetime1 * var2);
          return;
        }
        if (120 <= var3) {
          var4Lifetime2 = 1;
          var5Lifetime2 = 0;
          if (3 == param0) {
            var4Lifetime2 = -1;
          }
          if (param0 == 1) {
            var5Lifetime2 = 1;
          }
          if (4 == param0) {
            var5Lifetime2 = 1;
            var4Lifetime2 = 1;
          }
          if (param0 == 5) {
            var4Lifetime2 = -1;
            var5Lifetime2 = 1;
          }
          if (param0 == 6) {
            var4Lifetime2 = 1;
            var5Lifetime2 = -1;
          }
          if (7 == param0) {
            var4Lifetime2 = -1;
            var5Lifetime2 = -1;
          } else {
            if (8 == param0) {
              var4Lifetime2 = -1;
              var5Lifetime2 = -1;
            }
          }
          if (param0 == 11) {
            var4Lifetime2 = -1;
          }
          if (param0 == 12) {
            var4Lifetime2 = -1;
            var5Lifetime2 = -1;
          }
          if (param0 == 13) {
            var5Lifetime2 = -1;
            var4Lifetime2 = 1;
          }
          if (param0 == 14) {
            var4Lifetime2 = -1;
            var5Lifetime2 = 1;
          }
          if (param0 == 15) {
            var5Lifetime2 = 1;
            var4Lifetime2 = 1;
          }
          tn.field_Gb = ri.a(var2 * var5Lifetime2, (byte) 66, var4Lifetime2 * var2);
          return;
        }
        var3 = -var3 + 120;
        var2Lifetime1 = -(8192 * var3 * var3 / 3300) + 8192;
        var4Lifetime3 = 1;
        var5Lifetime3 = 0;
        if (3 == param0) {
          var4Lifetime3 = -1;
        }
        if (param0 == 1) {
          var5Lifetime3 = 1;
        }
        if (4 == param0) {
          var5Lifetime3 = 1;
          var4Lifetime3 = 1;
        }
        if (param0 == 5) {
          var4Lifetime3 = -1;
          var5Lifetime3 = 1;
        }
        if (param0 == 6) {
          var4Lifetime3 = 1;
          var5Lifetime3 = -1;
        }
        if (7 == param0) {
          var4Lifetime3 = -1;
          var5Lifetime3 = -1;
        } else {
          if (8 == param0) {
            var4Lifetime3 = -1;
            var5Lifetime3 = -1;
          }
        }
        if (param0 == 11) {
          var4Lifetime3 = -1;
        }
        if (param0 == 12) {
          var4Lifetime3 = -1;
          var5Lifetime3 = -1;
        }
        if (param0 == 13) {
          var5Lifetime3 = -1;
          var4Lifetime3 = 1;
        }
        if (param0 == 14) {
          var4Lifetime3 = -1;
          var5Lifetime3 = 1;
        }
        if (param0 == 15) {
          var5Lifetime3 = 1;
          var4Lifetime3 = 1;
        }
        tn.field_Gb = ri.a(var2Lifetime1 * var5Lifetime3, (byte) 66, var4Lifetime3 * var2Lifetime1);
        return;
    }

    public static void g(int param0) {
        field_Z = null;
        field_U = null;
        field_S = null;
        field_T = null;
        if (param0 == 15428) {
          field_W = null;
          field_bb = null;
          return;
        }
        byte[] var2 = (byte[]) null;
        sc.a((byte) -71, (byte[]) null);
        field_W = null;
        field_bb = null;
    }

    final String b(boolean param0) {
        if (!param0) {
          return null;
        }
        field_Z = (String) null;
        return null;
    }

    final void a(qm param0, int param1, int param2, int param3) {
        try {
          this.field_X = this.field_X + 1;
          super.a(param0, param1, param2 + 0, param3);
          if (param2 != 170) {
            sc.g(-45);
          }
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "sc.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (param0 != 2) {
          return;
        }
        if (null == pn.field_c) {
          if (null != pn.field_c) {
            uh.a(pn.field_c, param0 + 0);
            return;
          }
          pn.field_c = new qb(param2 / 2, param1 / 2);
          pn.field_c.a();
          ql.a(param2, param1, 0);
          ce.field_m.a(true);
          uh.a(pn.field_c, param0 + 0);
          return;
        }
        if (pn.field_c.field_n == param2 / 2) {
          if (param1 / 2 == pn.field_c.field_w) {
            if (null != pn.field_c) {
              uh.a(pn.field_c, param0 + 0);
              return;
            }
            pn.field_c = new qb(param2 / 2, param1 / 2);
            pn.field_c.a();
            ql.a(param2, param1, 0);
            ce.field_m.a(true);
            uh.a(pn.field_c, param0 + 0);
            return;
          }
          if (mn.field_r == si.field_g) {
            pn.field_c = null;
            System.gc();
          }
          if (null != pn.field_c) {
            uh.a(pn.field_c, param0 + 0);
            return;
          }
          pn.field_c = new qb(param2 / 2, param1 / 2);
          pn.field_c.a();
          ql.a(param2, param1, 0);
          ce.field_m.a(true);
          uh.a(pn.field_c, param0 + 0);
          return;
        }
        if (mn.field_r != si.field_g) {
          if (null != pn.field_c) {
            uh.a(pn.field_c, param0 + 0);
            return;
          }
          pn.field_c = new qb(param2 / 2, param1 / 2);
          pn.field_c.a();
          ql.a(param2, param1, 0);
          ce.field_m.a(true);
          uh.a(pn.field_c, param0 + 0);
          return;
        }
        pn.field_c = null;
        System.gc();
        if (null != pn.field_c) {
          uh.a(pn.field_c, param0 + 0);
          return;
        }
        pn.field_c = new qb(param2 / 2, param1 / 2);
        pn.field_c.a();
        ql.a(param2, param1, 0);
        ce.field_m.a(true);
        uh.a(pn.field_c, param0 + 0);
    }

    sc(pd param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, cc.b((byte) -65));
        try {
          this.field_J = param0;
          this.field_ab = param1;
          this.a(param5, param3, param4, param2, -83);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "sc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static fk a(kd param0, byte param1) {
        fk var2 = null;
        RuntimeException var2_ref = null;
        fk stackIn_2_0 = null;
        fk stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new fk(param0, param0);
          qn.field_mb.b(var2, -1);
          pc.field_e.b(param0);
          if (param1 == 68) {
            stackIn_4_0 = var2;
            return stackIn_4_0;
          }
          stackIn_2_0 = (fk) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_7_0 = var2_ref;
          stackIn_7_1 = new StringBuilder().append("sc.W(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(int param0, qm param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 0) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("sc.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void i(byte param0) {
        sc.c(true);
        if (param0 >= -13) {
          sc.c(true);
        }
    }

    final static int h(byte param0) {
        if (param0 != -34) {
          sc.g(-11);
          return qc.field_a;
        }
        return qc.field_a;
    }

    static {
        field_S = "Amid the witches' huts and rotten trees, Arcanists battle to control the arcane sources of magic within the swamp. Keep hidden, as the high concentration of power draws storms in from afar.";
        field_W = new aj(0, 2, 2, 1);
        field_U = new int[17];
        field_Z = "Waiting for graphics";
        field_T = "You cannot cast tower spells while flying";
        field_bb = "<%0> is already on your ignore list.";
    }
}
