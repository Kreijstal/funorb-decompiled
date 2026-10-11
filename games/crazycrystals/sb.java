/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sb extends pc {
    private int field_D;
    private n field_H;
    static sj field_E;
    static String field_C;
    static dl[] field_B;
    static volatile int field_I;
    static int field_F;

    final String a(byte param0) {
        if (this.field_m) {
          return this.field_H.a(-16774);
        }
        if (param0 < -23) {
          return null;
        }
        sb.e((byte) -41);
        return null;
    }

    final static String a(int param0, DataInputStream param1) throws IOException {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        byte[] var4 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param1.readInt();
          var3 = var2_int >>> 24;
          var2_int = var2_int & 16777215;
          if (var3 > 1) {
            throw new RuntimeException("Unsupported string version number: " + var3);
          }
          var4 = new byte[var2_int];
          param1.readFully(var4);
          if (param0 <= var3) {
            stackIn_6_0 = db.a((byte) 109, var4);
            return stackIn_6_0;
          }
          stackIn_4_0 = fa.a((byte) -80, var4);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("sb.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void a(qm param0, int param1, int param2, int param3) {
        try {
          this.field_D = this.field_D + 1;
          int var5_int = -82 % ((param1 + 50) / 59);
          super.a(param0, -121, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "sb.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(boolean param0, qm param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            return false;
          }
          field_B = (dl[]) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("sb.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(db param0, int param1) {
        try {
          if (param1 != 18180) {
            db var3 = (db) null;
            sb.a((db) null, 6);
          }
          hb.field_k = bl.a(param0, "initialset", "level-lost").a();
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "sb.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void e(byte param0) {
        if (param0 == 2) {
          field_B = null;
          field_C = null;
          field_E = null;
          return;
        }
        field_C = (String) null;
        field_B = null;
        field_C = null;
        field_E = null;
    }

    sb(n param0) {
        try {
          this.field_H = param0;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "sb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5;
        int var6;
        oi var8;
        int var9;
        int var10;
        int var11;
        dl var15;
        dl var14;
        dl var16;
        dl var17;
        dl var18;
        dl var20;
        dl var21;
        dl var22;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        oi var8Lifetime1;
        var11 = CrazyCrystals.field_B;
        super.a(param0, (byte) -110, param2, param3);
        if (param3 != 0) {
          return;
        }
        var5 = (this.field_g >> 1) + (this.field_r + param2);
        var6 = (this.field_f >> 1) + (param0 + this.field_j);
        if (param1 < -12) {
          var8 = this.field_H.c((byte) 45);
          if (var8 != ta.field_h &&
            var8 != ec.field_h) {
            if (var8 == rk.field_c) {
              var20 = ao.field_b[2];
              var20.d(-(var20.field_l >> 1) + var5, -(var20.field_u >> 1) + var6, 256);
              return;
            }
            if (ih.field_b != var8) {
              return;
            }
            var21 = ao.field_b[1];
            var21.d(-(var21.field_l >> 1) + var5, -(var21.field_u >> 1) + var6, 256);
            return;
          }
          var22 = ao.field_b[0];
          var9 = var22.field_n << 1;
          var10 = var22.field_o << 1;
          if (null == tk.field_l) {
            tk.field_l = new dl(var9, var10);
            em.a((byte) 38, tk.field_l);
          } else {
            if (var9 > tk.field_l.field_l) {
              tk.field_l = new dl(var9, var10);
              em.a((byte) 38, tk.field_l);
            } else {
              if (tk.field_l.field_u < var10) {
                tk.field_l = new dl(var9, var10);
                em.a((byte) 38, tk.field_l);
              } else {
                em.a((byte) 38, tk.field_l);
                kh.a();
              }
            }
          }
          var22.a(112, 144, var22.field_n << 4, var22.field_o << 4, -this.field_D << 10, 4096);
          lg.a(1);
          tk.field_l.d(-var22.field_n + var5, -var22.field_o + var6, 256);
          return;
        }
        field_C = (String) null;
        var8Lifetime1 = this.field_H.c((byte) 45);
        if (var8Lifetime1 == ta.field_h) {
          var15 = ao.field_b[0];
          var9Lifetime1 = var15.field_n << 1;
          var10Lifetime1 = var15.field_o << 1;
          if (null != tk.field_l &&
            var9Lifetime1 <= tk.field_l.field_l &&
            tk.field_l.field_u >= var10Lifetime1) {
            em.a((byte) 38, tk.field_l);
            kh.a();
          } else {
            tk.field_l = new dl(var9Lifetime1, var10Lifetime1);
            em.a((byte) 38, tk.field_l);
          }
          var15.a(112, 144, var15.field_n << 4, var15.field_o << 4, -this.field_D << 10, 4096);
          lg.a(1);
          tk.field_l.d(-var15.field_n + var5, -var15.field_o + var6, 256);
          return;
        }
        if (var8Lifetime1 != ec.field_h) {
          if (var8Lifetime1 == rk.field_c) {
            var17 = ao.field_b[2];
            var17.d(-(var17.field_l >> 1) + var5, -(var17.field_u >> 1) + var6, 256);
            return;
          }
          if (ih.field_b != var8Lifetime1) {
            return;
          }
          var18 = ao.field_b[1];
          var18.d(-(var18.field_l >> 1) + var5, -(var18.field_u >> 1) + var6, 256);
          return;
        }
        var16 = ao.field_b[0];
        var14 = var16;
        var9Lifetime2 = var16.field_n << 1;
        var10Lifetime2 = var16.field_o << 1;
        if (null != tk.field_l &&
          var9Lifetime2 <= tk.field_l.field_l &&
          tk.field_l.field_u >= var10Lifetime2) {
          em.a((byte) 38, tk.field_l);
          kh.a();
        } else {
          tk.field_l = new dl(var9Lifetime2, var10Lifetime2);
          em.a((byte) 38, tk.field_l);
        }
        var16.a(112, 144, var16.field_n << 4, var16.field_o << 4, -this.field_D << 10, 4096);
        lg.a(1);
        tk.field_l.d(-var16.field_n + var5, -var16.field_o + var6, 256);
    }

    static {
        field_E = new sj(8, 0, 4, 1);
        field_C = "To Customer Support";
        field_I = 0;
    }
}
