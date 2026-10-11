/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh extends vf {
    private pn field_v;
    static vf field_y;
    static mn field_w;
    static fi field_x;
    private pn[] field_B;
    static String field_u;
    static String field_z;

    public final void a(byte param0, int param1, boolean param2, fj param3, int param4) {
        fj stackIn_3_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        pn var7 = null;
        pn var9 = null;
        rg var10 = null;
        pn var11 = null;
        pn var12 = null;
        pn var13 = null;
        pn var14 = null;
        try {
          if (!(param3 instanceof rg)) {
            stackIn_3_0 = null;
          } else {
            stackIn_3_0 = (fj) (param3);
          }
          var10 = (rg) (stackIn_3_0);
          lc.a(param1 + param3.field_q, param3.field_F + (param1 + param3.field_q), param4 - (-param3.field_m - param3.field_z), param4 + param3.field_m, 14907);
          if (var10 != null) {
            param2 = param2 & var10.field_L;
          }
          var7 = this.field_B[0];
          this.field_v.b(2585);
          var7.a(param4, this.field_v, param1, 2147483647, param3, this);
          if (param0 >= -97) {
            this.field_B = (pn[]) null;
          }
          if (var10 != null) {
            if (var10.field_O) {
              var11 = this.field_B[1];
              if (var11 != null) {
                var11.a(param4, this.field_v, param1, 2147483647, param3, this);
              }
            }
            if (var10.field_w) {
              var12 = this.field_B[3];
              if (var10.field_o != 0 &&
                var12 != null) {
                var12.a(param4, this.field_v, param1, 2147483647, param3, this);
              } else {
                var9 = this.field_B[2];
                if (var9 != null) {
                  var9.a(param4, this.field_v, param1, 2147483647, param3, this);
                }
              }
            }
          }
          if (param3.e((byte) -125)) {
            var13 = this.field_B[5];
            if (var13 != null) {
              var13.a(param4, this.field_v, param1, 2147483647, param3, this);
            }
          }
          if (!param2) {
            var14 = this.field_B[4];
            if (var14 != null) {
              var14.a(param4, this.field_v, param1, 2147483647, param3, this);
            }
          }
          this.field_v.a(param1, param4, param3, (byte) 100, this);
          ib.b(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_34_0 = var6;
          stackIn_34_1 = new StringBuilder().append("qh.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param4).append(')').toString());
        }
    }

    final static jb a(boolean param0, byte param1) {
        bd var9 = null;
        bd dupTemp$0 = null;
        bd var5 = null;
        bd var6 = null;
        bd dupTemp$1 = null;
        bd dupTemp$2 = null;
        bd var11 = null;
        int var7 = Confined.field_J ? 1 : 0;
        al.field_d = pa.field_c ? 1 : 0;
        jb var8 = new jb(7);
        jb var10 = var8;
        var10.field_b = 277;
        var10.field_s = 70;
        var10.field_c = 50;
        var10.field_k = 500;
        int var3 = 20 + var10.field_c + var10.field_b;
        if (!tj.a(true)) {
          var10.a((byte) -83, new bd(18, ca.field_s, pn.field_a));
          var10.a((byte) -84, new bd(18, kk.field_a, pn.field_a));
          var8.a((byte) -103, new bd(19, dn.field_e[0], pn.field_a));
          var8.a((byte) -90, new bd(19, dn.field_e[1], pn.field_a));
          var8.a((byte) -123, new bd(19, dn.field_e[2], pn.field_a));
          var8.field_h[1].field_f = 200;
          var9 = var8.field_h[0];
          bd var4 = var9;
          var9.field_f = 200;
          var8.field_h[0].field_j = -(var8.field_h[0].field_f / 2) + 200;
          dupTemp$0 = var8.field_h[1];
          dupTemp$0.field_b = var3;
          var8.field_h[0].field_b = var3;
          var8.field_h[1].field_j = -(var8.field_h[1].field_f / 2) + 440;
          var3 += 40;
          var5 = var8.field_h[2];
          var8.field_h[4].field_f = 145;
          var6 = var8.field_h[3];
          var6.field_f = 145;
          var5.field_f = 145;
          var8.field_h[2].field_j = 160 - var8.field_h[2].field_f / 2;
          var8.field_h[3].field_j = 320 - var8.field_h[3].field_f / 2;
          var8.field_h[4].field_j = -(var8.field_h[4].field_f / 2) + 480;
          dupTemp$1 = var8.field_h[4];
          dupTemp$1.field_b = var3;
          dupTemp$2 = var8.field_h[3];
          dupTemp$2.field_b = var3;
          var8.field_h[2].field_b = var3;
        } else {
          var11 = new bd(16, ba.field_Q, pn.field_a);
          var11.field_b = var3;
          var11.field_j = -(var11.field_f / 2) + 320;
          var10.a((byte) -53, var11);
        }
        var3 += 40;
        bd var12 = new bd(14, fl.field_b, pn.field_a);
        var12.field_b = var3;
        if (param1 < 102) {
          return (jb) null;
        }
        var12.field_j = 320 - var12.field_f / 2;
        var10.a((byte) -60, var12);
        if (tj.a(true)) {
          var10.a(param0, 26206, 0);
        } else {
          var10.a(param0, 26206, 2 + h.field_W);
        }
        return var10;
    }

    public static void d(int param0) {
        field_w = null;
        if (param0 <= 103) {
          field_x = (fi) null;
        }
        field_u = null;
        field_z = null;
        field_x = null;
        field_y = null;
    }

    final void a(int param0, nf param1) {
        int var5 = 0;
        pn[] var3 = null;
        int var4 = 0;
        pn var6 = null;
        int var7 = 0;
        pn[] var8 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var7 = Confined.field_J ? 1 : 0;
        try {
          var4 = -100 % ((param0 - 1) / 59);
          var8 = this.field_B;
          var3 = var8;
          for (var5 = 0; var8.length > var5; var5++) {
            var6 = var8[var5];
            if (var6 != null) {
              var6.field_d = param1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("qh.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void a(byte param0, nf[] param1) {
        int var5 = 0;
        pn[] var3 = null;
        int var4 = 0;
        pn var6 = null;
        int var7 = 0;
        pn[] var8 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var7 = Confined.field_J ? 1 : 0;
        try {
          var8 = this.field_B;
          var3 = var8;
          var4 = -37 / ((param0 - 45) / 52);
          for (var5 = 0; var5 < var8.length; var5++) {
            var6 = var8[var5];
            if (var6 != null) {
              var6.field_g = param1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("qh.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public qh() {
        this.field_B = new pn[6];
        this.field_v = new pn();
        pn dupTemp$0 = new pn();
        this.field_B[0] = dupTemp$0;
        pn var1 = dupTemp$0;
        var1.b(2585);
    }

    final static void c(int param0) {
        if (dn.field_d == null) {
          return;
        }
        if (param0 != 4) {
          qh.d(89);
        }
        fa.a(dn.field_d, param0 + 65);
        dn.field_d.a(-94, ki.field_d);
        dn.field_d = null;
        if (null != gg.field_m) {
          gg.field_m.a((byte) -127);
        }
        fb.field_b.requestFocus();
    }

    private final void a(int param0, qh param1, boolean param2) {
        int var4_int = 0;
        pn dupTemp$0 = null;
        pn stackIn_11_0 = null;
        boolean stackIn_11_1 = false;
        pn stackIn_12_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        pn var5 = null;
        pn var6 = null;
        int var7 = 0;
        pn var6Lifetime1;
        pn var6Lifetime2;
        var7 = Confined.field_J ? 1 : 0;
        try {
          super.a(false, param1);
          if (param0 != -29066) {
            qh.d(-13);
          }
          if (param2) {
            for (var4_int = 0; 6 > var4_int; var4_int++) {
              var5 = this.field_B[var4_int];
              var6 = var5;
              var6Lifetime1 = var5;
              if (var5 != null) {
                var6Lifetime2 = param1.field_B[var4_int];
                stackIn_11_0 = var5;
                stackIn_11_1 = false;
                if (var6Lifetime2 != null) {
                  stackIn_12_2 = var6Lifetime2;
                } else {
                  dupTemp$0 = new pn();
                  param1.field_B[var4_int] = dupTemp$0;
                  stackIn_12_2 = dupTemp$0;
                }
                ((pn) (Object) stackIn_11_0).a(stackIn_11_1, stackIn_12_2);
              } else {
                param1.field_B[var4_int] = null;
              }
            }
            return;
          }
          lj.a(this.field_B, 0, param1.field_B, 0, 6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("qh.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    final pn b(int param0, int param1) {
        if (param1 > -34) {
          qh.a(true, (byte) 21);
        }
        pn dupTemp$0 = new pn();
        this.field_B[param0] = dupTemp$0;
        return dupTemp$0;
    }

    qh(qh param0, boolean param1) {
        this();
        try {
          param0.a(-29066, this, param1);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "qh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(byte param0, nf[] param1, int param2) {
        int var4_int = 0;
        int var4_intLifetime1;
        try {
          var4_int = param2;
          if (null == this.field_B[var4_int]) {
            this.field_B[var4_int] = new pn();
          }
          this.field_B[param2].field_g = param1;
          var4_intLifetime1 = -53 % ((2 - param0) / 55);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "qh.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_x = new fi();
        field_z = "Congratulations. #You have done well.";
        field_u = "Unpacking music";
    }
}
