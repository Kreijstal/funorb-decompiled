/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wu extends hf {
    private qu field_A;
    private int field_D;

    final void a(byte param0, int param1, int param2, int param3) {
        kv var16 = null;
        kv var17 = null;
        kv var14 = null;
        kv var13 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = BachelorFridge.field_y;
        int var10Lifetime1;
        int var11Lifetime1;
        super.a((byte) -82, param1, param2, param3);
        if (0 != param2) {
          return;
        }
        int var5 = (this.field_p >> 1) + param3 + this.field_s;
        int var6 = this.field_v + (param1 + (this.field_q >> 1));
        int var9 = -121 % ((-20 - param0) / 54);
        jg var8 = this.field_A.b(-19704);
        if (var8 == cq.field_g) {
          var16 = fr.field_q[0];
          var10 = var16.field_n << 1;
          var11 = var16.field_o << 1;
          if (null == rs.field_f) {
            rs.field_f = new kv(var10, var11);
            bu.a(0, rs.field_f);
            var16.b(112, 144, var16.field_n << 4, var16.field_o << 4, -this.field_D << 10, 4096);
            db.b(89);
            rs.field_f.d(var5 - var16.field_n, var6 - var16.field_o, 256);
            return;
          }
          if (var10 > rs.field_f.field_q) {
            rs.field_f = new kv(var10, var11);
            bu.a(0, rs.field_f);
            var16.b(112, 144, var16.field_n << 4, var16.field_o << 4, -this.field_D << 10, 4096);
            db.b(89);
            rs.field_f.d(var5 - var16.field_n, var6 - var16.field_o, 256);
            return;
          }
          if (rs.field_f.field_p < var11) {
            rs.field_f = new kv(var10, var11);
            bu.a(0, rs.field_f);
            var16.b(112, 144, var16.field_n << 4, var16.field_o << 4, -this.field_D << 10, 4096);
            db.b(89);
            rs.field_f.d(var5 - var16.field_n, var6 - var16.field_o, 256);
            return;
          }
          bu.a(0, rs.field_f);
          dg.d();
          var16.b(112, 144, var16.field_n << 4, var16.field_o << 4, -this.field_D << 10, 4096);
          db.b(89);
          rs.field_f.d(var5 - var16.field_n, var6 - var16.field_o, 256);
          return;
        }
        if (var8 == ji.field_f) {
          var17 = fr.field_q[0];
          var10Lifetime1 = var17.field_n << 1;
          var11Lifetime1 = var17.field_o << 1;
          if (null == rs.field_f) {
            rs.field_f = new kv(var10Lifetime1, var11Lifetime1);
            bu.a(0, rs.field_f);
            var17.b(112, 144, var17.field_n << 4, var17.field_o << 4, -this.field_D << 10, 4096);
            db.b(89);
            rs.field_f.d(var5 - var17.field_n, var6 - var17.field_o, 256);
            return;
          }
          if (var10Lifetime1 > rs.field_f.field_q) {
            rs.field_f = new kv(var10Lifetime1, var11Lifetime1);
            bu.a(0, rs.field_f);
            var17.b(112, 144, var17.field_n << 4, var17.field_o << 4, -this.field_D << 10, 4096);
            db.b(89);
            rs.field_f.d(var5 - var17.field_n, var6 - var17.field_o, 256);
            return;
          }
          if (rs.field_f.field_p < var11Lifetime1) {
            rs.field_f = new kv(var10Lifetime1, var11Lifetime1);
            bu.a(0, rs.field_f);
            var17.b(112, 144, var17.field_n << 4, var17.field_o << 4, -this.field_D << 10, 4096);
            db.b(89);
            rs.field_f.d(var5 - var17.field_n, var6 - var17.field_o, 256);
            return;
          }
          bu.a(0, rs.field_f);
          dg.d();
          var17.b(112, 144, var17.field_n << 4, var17.field_o << 4, -this.field_D << 10, 4096);
          db.b(89);
          rs.field_f.d(var5 - var17.field_n, var6 - var17.field_o, 256);
          return;
        }
        if (var8 == jt.field_f) {
          var14 = fr.field_q[2];
          var14.d(-(var14.field_q >> 1) + var5, var6 - (var14.field_p >> 1), 256);
          return;
        }
        if (var8 == cm.field_u) {
          var13 = fr.field_q[1];
          var13.d(var5 - (var13.field_q >> 1), var6 - (var13.field_p >> 1), 256);
          return;
        }
    }

    wu(qu param0) {
        try {
          this.field_A = param0;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "wu.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, wj param2, int param3) {
        try {
          this.field_D = this.field_D + 1;
          super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "wu.O(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final String c(byte param0) {
        if (this.field_t) {
          return this.field_A.a((byte) 71);
        }
        if (param0 != 16) {
          wj var3 = (wj) null;
          this.a(-94, 42, (wj) null, -101);
          return null;
        }
        return null;
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        var15 = BachelorFridge.field_y;
        try {
          if (param4 != -23) {
            return;
          }
          var5_int = 0;
          var6 = param2;
          var7 = -param2;
          var8 = -1;
          var9 = cr.a(eo.field_l, param3 + param2, pw.field_x, 0);
          var10 = cr.a(eo.field_l, param3 - param2, pw.field_x, 0);
          hba.a(param0, var10, tj.field_b[param1], 7, var9);
          while (var6 > var5_int) {
            var8 += 2;
            var7 = var7 + var8;
            if (0 < var7) {
              var6--;
              var7 = var7 - (var6 << 1);
              var11 = param1 - var6;
              var12 = param1 + var6;
              if (an.field_q <= var12 &&
                var11 <= ha.field_n) {
                var13 = cr.a(eo.field_l, param3 + var5_int, pw.field_x, 0);
                var14 = cr.a(eo.field_l, -var5_int + param3, pw.field_x, 0);
                if (var12 <= ha.field_n) {
                  hba.a(param0, var14, tj.field_b[var12], 7, var13);
                }
                if (var11 >= an.field_q) {
                  hba.a(param0, var14, tj.field_b[var11], 7, var13);
                }
              }
            }
            var5_int++;
            var11Lifetime1 = param1 - var5_int;
            var12Lifetime1 = param1 + var5_int;
            if (an.field_q > var12Lifetime1) {
              continue;
            }
            if (var11Lifetime1 > ha.field_n) {
              continue;
            }
            var13Lifetime1 = cr.a(eo.field_l, var6 + param3, pw.field_x, 0);
            var14Lifetime1 = cr.a(eo.field_l, param3 - var6, pw.field_x, param4 + 23);
            if (var12Lifetime1 <= ha.field_n) {
              hba.a(param0, var14Lifetime1, tj.field_b[var12Lifetime1], 7, var13Lifetime1);
            }
            if (an.field_q > var11Lifetime1) {
              continue;
            }
            hba.a(param0, var14Lifetime1, tj.field_b[var11Lifetime1], param4 + 30, var13Lifetime1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var5), "wu.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static eq a(int param0, byte param1, String param2) {
        eq var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        eq stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new eq(false);
          var4 = -117 / ((35 - param1) / 41);
          var3.field_d = param0;
          var3.field_g = param2;
          stackIn_1_0 = var3;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_4_0 = var3_ref;
          stackIn_4_1 = new StringBuilder().append("wu.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final boolean a(wj param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < -78) {
            return false;
          }
          this.field_D = -13;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("wu.W(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
