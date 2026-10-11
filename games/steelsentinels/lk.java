/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class lk extends oa {
    static int field_W;
    static String field_X;
    private int field_ab;
    static String field_V;
    private tl field_db;
    static int field_eb;
    static String field_bb;
    static String field_Y;
    static wg field_cb;
    static String field_Z;

    final static void a(pn param0, String param1, boolean param2, int param3, int param4, boolean param5, int param6, int param7, int param8, long param9, byte param10, int param11, int param12, int param13) {
        try {
          RuntimeException stackIn_16_0 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          IOException var15 = null;
          RuntimeException var15_ref = null;
          try {
            rf.field_d = new kj(param8);
            mm.field_g = new kj(param11);
            bk.field_Z = param4;
            kg.field_Wb = param3;
            ll.field_l = param13;
            og.field_b = param9;
            cd.field_a = param2;
            ki.field_ib = param5;
            if (param10 < 112) {
              lk.g(-71);
            }
            fe.field_F = param6;
            e.field_b = param1;
            vi.field_T = param7;
            nk.field_A = param0;
            kk.field_d = param12;
            if (null != nk.field_A.field_m) {
              try {
                va.field_h = new rj(nk.field_A.field_m, 64, 0);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var15 = (IOException) (Object) decompiledCaughtException;
                throw new RuntimeException(var15.toString());
              }
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var15_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_16_0 = var15_ref;
            stackIn_16_1 = new StringBuilder().append("lk.A(");
            if (param0 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
            if (param1 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw ci.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(String param0, byte param1, String param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (vm.b(param0, 75)) {
            return false;
          }
          if (eb.b(param0, 29974)) {
            return false;
          }
          if (mn.a(-30157, param0)) {
            return false;
          }
          if (param2.length() == 0) {
            return true;
          }
          if (nj.a(param0, 300, param2)) {
            return false;
          }
          if (fj.a(param2, -7036, param0)) {
            return false;
          }
          if (wl.a(param0, true, param2)) {
            return false;
          }
          var3_int = -38 % ((param1 + 50) / 37);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_28_0 = var3;
          stackIn_28_1 = new StringBuilder().append("lk.B(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    public static void h(int param0) {
        field_Z = null;
        if (param0 != -30289) {
          return;
        }
        field_Y = null;
        field_V = null;
        field_X = null;
        field_cb = null;
        field_bb = null;
    }

    final static void a(byte param0, boolean param1) {
        ji.a(param1, (byte) 44);
        if (param0 > -58) {
          return;
        }
        ci.a(param1, (byte) 122);
    }

    final static void g(int param0) {
        jn.field_g = true;
        ib.field_b = param0;
    }

    lk(tl param0) {
        try {
          this.field_db = param0;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "lk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0) {
        int var1_int = 0;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var1_intLifetime1;
        var4 = SteelSentinels.field_G;
        try {
          lf.a();
          kf.field_t = new int[260];
          cj.field_j = 11;
          for (var1_int = 0; 256 > var1_int; var1_int++) {
            var2 = 15.0;
            kf.field_t[var1_int] = (int)(Math.pow((double)((float)var1_int / 256.0f), var2) * 255.0);
          }
          var5 = 256;
          var1_intLifetime1 = var5;
          while (var5 < kf.field_t.length) {
            kf.field_t[var5] = 255;
            var5++;
          }
          if (!param0) {
            field_V = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "lk.Q(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, lh param2, int param3) {
        try {
          this.field_ab = this.field_ab + 1;
          if (param1 <= 56) {
            this.a(71, (byte) 105, -24, 10);
          }
          super.a(param0, 123, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "lk.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5;
        int var6;
        vd var8;
        int var9;
        int var10;
        int var11;
        wk var12;
        wk var13;
        wk var14;
        var11 = SteelSentinels.field_G;
        if (param1 > -99) {
          this.field_ab = 58;
        }
        super.a(param0, (byte) -124, param2, param3);
        if (param3 != 0) {
          return;
        }
        var5 = param2 - (-this.field_o - (this.field_x >> 1));
        var6 = param0 + (this.field_z + (this.field_E >> 1));
        var8 = this.field_db.a((byte) 21);
        if (nh.field_J != var8 &&
          ma.field_Y != var8) {
          if (var8 == fa.field_d) {
            var14 = t.field_i[2];
            var14.a(var5 - (var14.field_A >> 1), -(var14.field_F >> 1) + var6, 256);
          } else if (vf.field_b == var8) {
            var13 = t.field_i[1];
            var13.a(var5 - (var13.field_A >> 1), var6 - (var13.field_F >> 1), 256);
          }
        } else {
          var12 = t.field_i[0];
          var9 = var12.field_z << 1;
          var10 = var12.field_B << 1;
          if (null != qf.field_f &&
            var9 <= qf.field_f.field_A &&
            var10 <= qf.field_f.field_F) {
            q.a(qf.field_f, (byte) -71);
            pb.b();
          } else {
            qf.field_f = new wk(var9, var10);
            q.a(qf.field_f, (byte) -108);
          }
          var12.a(112, 144, var12.field_z << 4, var12.field_B << 4, -this.field_ab << 10, 4096);
          tk.$cfr$intArgs$f$20d51497949f(106);
          qf.field_f.a(-var12.field_z + var5, -var12.field_B + var6, 256);
        }
    }

    final String e(int param0) {
        if (this.field_C) {
          return this.field_db.a(true);
        }
        if (param0 == 0) {
          return null;
        }
        field_eb = 95;
        return null;
    }

    final boolean a(int param0, lh param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 1) {
            return false;
          }
          field_V = (String) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("lk.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_V = "Hide lobby chat";
        field_Y = "Names should contain a maximum of 12 characters";
        field_X = "D";
        field_Z = "Account created successfully!";
        field_eb = 0;
        field_bb = "Please log in as a subscribing member to access this feature.";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$7ffe4b125357(int param0, boolean param1) {
        ji.a(param1, (byte) 44);
        if (param0 > -58) {
          return;
        }
        ci.a(param1, (byte) 122);
    }
}
