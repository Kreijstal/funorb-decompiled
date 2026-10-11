/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ce extends bh {
    int field_x;
    static w field_A;
    int field_D;
    int field_F;
    static boolean field_w;
    String field_E;
    static int field_r;
    int field_t;
    int field_y;
    gl field_p;
    static String field_z;
    static ck[] field_s;
    int field_o;
    boolean field_q;
    int field_u;
    static qc field_C;
    String field_B;
    cf field_n;
    kg field_v;

    String c(byte param0) {
        if (param0 == 113) {
          return !this.field_q ? null : this.field_B;
        }
        field_s = (ck[]) null;
        return !this.field_q ? null : this.field_B;
    }

    boolean a(boolean param0, ce param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            return false;
          }
          field_A = (w) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ce.EC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void f(int param0) {
        if (param0 > 106) {
          this.b(this.field_y, this.field_t, this.field_u, this.field_D, -16555);
          return;
        }
        this.d(52);
        this.b(this.field_y, this.field_t, this.field_u, this.field_D, -16555);
    }

    StringBuilder a(Hashtable param0, int param1, StringBuilder param2, boolean param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param3) {
            stackIn_2_0 = (StringBuilder) null;
            return stackIn_2_0;
          }
          if (this.a(0, param1, param0, param2)) {
            this.a((byte) 72, param2, param0, param1);
          }
          stackIn_7_0 = (StringBuilder) (param2);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("ce.MB(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, Hashtable param2, StringBuilder param3) {
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            return true;
          }
          if (param2.containsKey(this)) {
            discarded$1 = param3.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
            return false;
          }
          param2.put(this, this);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("ce.HC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final boolean a(int param0, char param1, byte param2) {
        int var4 = 0;
        int var4Lifetime1;
        if (this.a(true)) {
          if (this.a(59, param0, this, param1)) {
            return true;
          }
          var4 = param0;
          if (var4 == 80) {
            return this.a(false, this);
          }
          if (param2 >= 100) {
            return false;
          }
          return true;
        }
        var4Lifetime1 = param0;
        if (var4Lifetime1 == 80) {
          return this.a(false, this);
        }
        if (param2 >= 100) {
          return false;
        }
        return true;
    }

    boolean a(int param0, int param1, int param2, ce param3, int param4, int param5, boolean param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param6) {
            return false;
          }
          field_C = (qc) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("ce.FC(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param2 == 0) {
          if (null == this.field_p) {
            if (param1 > -103) {
              ce.a(-50, -124, -49, 105, 114, (String) null, (fd) null, -111, -67);
              return;
            }
            return;
          }
          this.field_p.a(true, param0, param3, (byte) -118, this);
        }
        if (param1 > -103) {
          ce.a(-50, -124, -49, 105, 114, (String) null, (fd) null, -111, -67);
          return;
        }
    }

    ce(String param0, kg param1) {
        this(param0, bf.field_x.field_k, param1);
    }

    final static void a(int param0, byte param1, int param2, String param3, int param4, String param5) {
        int var7 = 0;
        uf var8 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          var8 = we.field_b;
          var8.f(param0, -4);
          var8.field_n = var8.field_n + 1;
          var7 = var8.field_n;
          var8.a(true, param2);
          if (param1 != -85) {
            ce.e(9);
          }
          if (2 == param2) {
            var8.a(0, param3);
          }
          if (param5 != null) {
            ij.a(-20539, var8, param5);
          } else {
            var8.d(-1, param4);
            if (client.field_A) {
              ij.a(-20539, var8, param5);
            }
          }
          var8.b(var8.field_n - var7, true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("ce.NB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static void a(int param0, ki param1, int param2) {
        if (param2 != -697) {
          return;
        }
        try {
          cg.field_c.a(param1, 2777);
          kk.a(param0, -15016, param1);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "ce.GC(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    void b(int param0, int param1, int param2, int param3, int param4) {
        this.field_y = param0;
        this.field_t = param1;
        this.field_D = param3;
        this.field_u = param2;
        if (param4 != -16555) {
          this.a(68, true, -45, 80);
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, String param5, fd param6, int param7, int param8) {
        cb.field_c = param4;
        fh.field_f = param2;
        bl.field_U = param6;
        gm.field_H = param0;
        hh.field_f = param8;
        pe.field_b = param5;
        cn.field_U = param3;
        if (param7 != 0) {
          return;
        }
        try {
          vm.field_w = param1;
          ta.field_k = (dd) ((Object) new qb());
          qb.field_r = new im(param6);
          sc.field_l = new ne(ta.field_k, qb.field_r);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "ce.SB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    int d(int param0) {
        int var2 = 7 / ((param0 - 36) / 51);
        return 0;
    }

    final static void e(int param0) {
        String var2 = null;
        if (null != ub.field_c) {
          var2 = ub.field_c;
          String var1 = var2;
          jb.a((byte) 107, cm.$cfr$intArgs$a$53ce4ab4c593(117, sl.field_d, new String[]{var2}));
          ub.field_c = null;
        }
        if (param0 <= 99) {
          field_C = (qc) null;
          return;
        }
    }

    boolean a(int param0, int param1, ce param2, int param3, int param4, int param5, byte param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param1, (byte) -83, param4, param0, param5)) {
            this.field_o = param3;
          }
          if (param6 == -55) {
            return false;
          }
          this.a(19, (byte) 11, -125, -81, -78);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_8_0 = var8;
          stackIn_8_1 = new StringBuilder().append("ce.LB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    void a(ce param0, int param1, int param2, int param3) {
        int var5_int = 0;
        int stackIn_3_0 = 0;
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          var5_int = this.a(bh.field_g, (byte) -87, param2, pm.field_f, param3) ? 1 : 0;
          stackIn_3_0 = (this.field_q) ? 0 : 1;
          if (stackIn_3_0 == var5_int) {
            stackIn_8_1 = (var5_int != 0);
            this.field_q = stackIn_8_1;
            if (this.field_v != null &&
              this.field_v instanceof gj) {
              ((gj) (this.field_v)).a(var5_int != 0, this, true);
            }
          }
          if (param1 < 38) {
            field_w = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("ce.A(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    void d(byte param0) {
        if (param0 == -95) {
          return;
        }
        this.field_B = (String) null;
    }

    final void a(int param0, int param1, byte param2) {
        int var4;
        int var5;
        int var6;
        String var7;
        String var8;
        var6 = client.field_A ? 1 : 0;
        var4 = this.d(94);
        var5 = 0;
        if (param2 == -72) {
          while (var5 <= var4) {
            this.a(param1, -118, var5, param0);
            var5++;
            if (var6 == 0) {
              continue;
            }
            break;
          }
          var7 = ea.b(true);
          if (var7 != null) {
            bf.field_x.a(var7, param2 + 71, dh.field_e, pa.field_Z);
          }
          return;
        }
        this.a(-73, -87, 50, 71);
        while (var5 <= var4) {
          this.a(param1, -118, var5, param0);
          var5++;
          if (var6 == 0) {
            continue;
          }
          break;
        }
        var8 = ea.b(true);
        if (var8 != null) {
          bf.field_x.a(var8, param2 + 71, dh.field_e, pa.field_Z);
        }
    }

    void a(int param0, int param1, int param2, ce param3, int param4, int param5) {
        try {
          this.field_o = 0;
          if (param1 != 64) {
            this.toString();
          }
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "ce.IB(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean a(int param0, boolean param1, int param2, int param3) {
        int var5;
        int var7;
        se var8;
        se var9;
        se var10;
        var7 = client.field_A ? 1 : 0;
        this.a(this, 79, param0, param2);
        var5 = this.a(true) ? 1 : 0;
        if (!param1) {
          if (var5 != 0 &&
            ig.field_Yb != 0) {
            this.d((byte) -95);
          }
          if (param3 != 29166) {
            this.field_D = 110;
          }
          tm.field_d = be.field_n;
          sa.a(this.c((byte) 113), -1);
          return param1;
        }
        if (jk.field_c == 0) {
          if (ig.field_Yb != 0) {
            if (this.a(nf.field_h, he.field_S, this, ig.field_Yb, param0, param2, (byte) -55)) {
              param1 = false;
              if ((var7 != 0) &&
                (var5 != 0)) {
                this.d((byte) -95);
              }
            } else {
              if (var5 != 0) {
                this.d((byte) -95);
              }
            }
          }
          if (be.field_n != 0) {
            if (param3 != 29166) {
              this.field_D = 110;
            }
            tm.field_d = be.field_n;
            sa.a(this.c((byte) 113), -1);
            return param1;
          }
          if (tm.field_d == 0) {
            if (param3 != 29166) {
              this.field_D = 110;
            }
            tm.field_d = be.field_n;
            sa.a(this.c((byte) 113), -1);
            return param1;
          }
          this.a(pm.field_f, 64, param2, this, param0, bh.field_g);
          var8 = lg.field_Y;
          if (var8 != null) {
            if (var8.field_v instanceof na) {
              ((na) (var8.field_v)).a(var8, (id) null, (byte) -128);
            }
            lg.field_Y = null;
          }
          if (var7 != 0 &&
            var5 != 0 &&
            ig.field_Yb != 0) {
            this.d((byte) -95);
          }
          if (param3 != 29166) {
            this.field_D = 110;
          }
          tm.field_d = be.field_n;
          sa.a(this.c((byte) 113), -1);
          return param1;
        }
        if (var5 == 0) {
          if (ig.field_Yb != 0 &&
            this.a(nf.field_h, he.field_S, this, ig.field_Yb, param0, param2, (byte) -55)) {
            param1 = false;
            if (var7 == 0) {
            }
          }
          if (be.field_n != 0) {
            if (param3 != 29166) {
              this.field_D = 110;
            }
            tm.field_d = be.field_n;
            sa.a(this.c((byte) 113), -1);
            return param1;
          }
          if (tm.field_d == 0) {
            if (param3 != 29166) {
              this.field_D = 110;
            }
            tm.field_d = be.field_n;
            sa.a(this.c((byte) 113), -1);
            return param1;
          }
          this.a(pm.field_f, 64, param2, this, param0, bh.field_g);
          var9 = lg.field_Y;
          if (var9 != null) {
            if (var9.field_v instanceof na) {
              ((na) (var9.field_v)).a(var9, (id) null, (byte) -128);
            }
            lg.field_Y = null;
          }
          if (var7 != 0 &&
            var5 != 0 &&
            ig.field_Yb != 0) {
            this.d((byte) -95);
          }
          if (param3 != 29166) {
            this.field_D = 110;
          }
          tm.field_d = be.field_n;
          sa.a(this.c((byte) 113), -1);
          return param1;
        }
        this.a(pm.field_f, param0, bh.field_g, this, jk.field_c, param2, false);
        if (ig.field_Yb != 0) {
          if (this.a(nf.field_h, he.field_S, this, ig.field_Yb, param0, param2, (byte) -55)) {
            param1 = false;
            if (var7 != 0) {
              this.d((byte) -95);
            }
          } else {
            this.d((byte) -95);
          }
        }
        if (be.field_n != 0) {
          if (param3 != 29166) {
            this.field_D = 110;
          }
          tm.field_d = be.field_n;
          sa.a(this.c((byte) 113), -1);
          return param1;
        }
        if (tm.field_d == 0) {
          if (param3 != 29166) {
            this.field_D = 110;
          }
          tm.field_d = be.field_n;
          sa.a(this.c((byte) 113), -1);
          return param1;
        }
        this.a(pm.field_f, 64, param2, this, param0, bh.field_g);
        var10 = lg.field_Y;
        if (var10 != null) {
          if (var10.field_v instanceof na) {
            ((na) (var10.field_v)).a(var10, (id) null, (byte) -128);
          }
          lg.field_Y = null;
        }
        if (var7 != 0 &&
          var5 != 0 &&
          ig.field_Yb != 0) {
          this.d((byte) -95);
        }
        if (param3 != 29166) {
          this.field_D = 110;
        }
        tm.field_d = be.field_n;
        sa.a(this.c((byte) 113), -1);
        return param1;
    }

    public final String toString() {
        return this.a(new Hashtable(), 0, new StringBuilder(), true).toString();
    }

    final boolean a(int param0, byte param1, int param2, int param3, int param4) {
        boolean stackIn_18_0 = false;
        if (param1 > -29) {
          ce.a(-81, (byte) -68, -126, (String) null, 93, (String) null);
          if (param0 < param4 + this.field_u) {
            return false;
          }
          if (param2 + this.field_D > param3) {
            return false;
          }
          if (this.field_t + (this.field_u + param4) <= param0) {
            return false;
          }
          if (param3 >= this.field_y + this.field_D + param2) {
            return false;
          }
          return true;
        }
        if (param0 < param4 + this.field_u) {
          return false;
        }
        if (param2 + this.field_D > param3) {
          return false;
        }
        stackIn_18_0 = (this.field_t + (this.field_u + param4) > param0) && (param3 < this.field_y + this.field_D + param2);
        return stackIn_18_0;
    }

    boolean a(int param0, int param1, ce param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = -128 / ((-22 - param0) / 49);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_4_0 = var5;
          stackIn_4_1 = new StringBuilder().append("ce.QA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void c(int param0) {
        field_s = null;
        field_A = null;
        field_C = null;
        field_z = null;
        if (param0 <= 52) {
          ce.a(-104, 121, -47, 103, 95, (String) null, (fd) null, -67, -90);
          return;
        }
    }

    final void a(byte param0, StringBuilder param1, Hashtable param2, int param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = client.field_A ? 1 : 0;
        try {
          if (param0 != 72) {
            ce.a(80, (byte) -66, 85, (String) null, 114, (String) null);
          }
          discarded$0 = param1.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_u).append(",").append(this.field_D).append(" ").append(this.field_t).append("x").append(this.field_y);
          if (this.field_E != null) {
            discarded$1 = param1.append(" text=\"").append(this.field_E).append('"');
          }
          if (this.field_q) {
            discarded$2 = param1.append(" mouseover");
          }
          if (this.a(true)) {
            discarded$3 = param1.append(" focused");
          }
          if (null != this.field_p) {
            discarded$4 = param1.append(" renderer=");
            if (this.field_p instanceof ce) {
              param1 = this.a(param2, param3 + 1, param1, true);
              if (var6 != 0) {
                discarded$5 = param1.append(this.field_p);
              }
            } else {
              discarded$5 = param1.append(this.field_p);
            }
          }
          if (this.field_v != null) {
            discarded$6 = param1.append(" listener=");
            if (!(this.field_v instanceof ce)) {
              discarded$7 = param1.append(this.field_v);
              if (var6 != 0) {
                param1 = this.a(param2, 1 + param3, param1, true);
              }
            } else {
              param1 = this.a(param2, 1 + param3, param1, true);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_25_0 = var5;
          stackIn_25_1 = new StringBuilder().append("ce.VB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param3).append(')').toString());
        }
    }

    boolean a(boolean param0) {
        if (!param0) {
          ce.e(120);
          return false;
        }
        return false;
    }

    final static ck[] a(int param0, int param1, int param2, int param3, int param4) {
        ck dupTemp$0 = null;
        ck dupTemp$1 = null;
        ck[] var6 = new ck[9];
        ck[] var5 = var6;
        if (param1 < -10) {
          dupTemp$0 = sm.a((byte) -125, param0, param3);
          var6[6] = dupTemp$0;
          var5[3] = dupTemp$0;
          var5[2] = dupTemp$0;
          var5[1] = dupTemp$0;
          var5[0] = dupTemp$0;
          dupTemp$1 = sm.a((byte) -109, param0, param2);
          var6[8] = dupTemp$1;
          var5[7] = dupTemp$1;
          var5[5] = dupTemp$1;
          if (0 != param4) {
            var6[4] = sm.a((byte) -121, 64, param4);
          }
          return var5;
        }
        field_z = (String) null;
        ck dupTemp$2 = sm.a((byte) -125, param0, param3);
        var6[6] = dupTemp$2;
        var5[3] = dupTemp$2;
        var5[2] = dupTemp$2;
        var5[1] = dupTemp$2;
        var5[0] = dupTemp$2;
        ck dupTemp$3 = sm.a((byte) -109, param0, param2);
        var6[8] = dupTemp$3;
        var5[7] = dupTemp$3;
        var5[5] = dupTemp$3;
        if (0 != param4) {
          var6[4] = sm.a((byte) -121, 64, param4);
        }
        return var5;
    }

    protected ce() {
        this.field_F = 0;
        this.field_x = 0;
    }

    ce(String param0, gl param1, kg param2) {
        RuntimeException runtimeException = null;
        nl var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_F = 0;
        this.field_x = 0;
        try {
          this.field_v = param2;
          this.field_E = param0;
          this.field_p = param1;
          if (this.field_p instanceof nl) {
            var4 = (nl) ((Object) this.field_p);
            this.field_t = var4.b(this, 0);
            this.field_y = var4.a(this, -49);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("ce.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    ce(int param0, int param1, int param2, int param3, gl param4, kg param5) {
        this.field_F = 0;
        this.field_x = 0;
        try {
          this.field_D = param1;
          this.field_y = param3;
          this.field_u = param0;
          this.field_t = param2;
          this.field_p = param4;
          this.field_v = param5;
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "ce.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_z = "To server list";
    }
}
