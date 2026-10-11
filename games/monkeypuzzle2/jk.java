/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class jk extends we implements ga {
    static int field_B;
    static int field_A;
    static gk field_z;
    static li[] field_C;
    static a field_x;
    static String[] field_y;
    static int field_u;
    we field_v;
    static int field_w;

    String a(byte param0) {
        String var3 = null;
        String var2 = super.a(param0);
        if (this.field_v != null) {
          var3 = this.field_v.a((byte) 54);
          if (var3 != null) {
            return var3;
          }
        }
        return var2;
    }

    final boolean a(we param0, boolean param1) {
        RuntimeException var3 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            this.e(109);
          }
          stackIn_6_0 = (this.field_v != null) && (this.field_v.a(param0, param1));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("jk.AA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    we a(int param0) {
        we var2 = this.field_v;
        if (var2 != null &&
          var2.b((byte) 72)) {
          return var2;
        }
        if (param0 == -1) {
          return null;
        }
        field_x = (a) null;
        return null;
    }

    final boolean b(byte param0) {
        if (param0 < 38) {
          field_C = (li[]) null;
        }
        return null != this.a(-1) ? true : false;
    }

    void i(int param0) {
        if (param0 != -2) {
          field_u = 112;
        }
        if (this.field_v != null) {
          this.field_v.g(-1);
        }
    }

    private final boolean a(byte param0, we param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -18) {
            field_C = (li[]) null;
          }
          stackIn_7_0 = (this.field_v != null) && (!this.field_v.b((byte) 74)) && (this.field_v.a(param1, false));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("jk.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    StringBuilder a(boolean param0, StringBuilder param1, Hashtable param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param2, (byte) -122, param3, param1)) {
            this.a(param2, param3, param1, -37);
            this.b(param2, -25844, param1, param3);
          }
          if (param0) {
            jk.a(44, true, 113);
          }
          stackIn_5_0 = (StringBuilder) (param1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("jk.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(')').toString());
        }
    }

    private final boolean a(int param0, we param1) {
        RuntimeException var3 = null;
        we var4 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -11) {
            var4 = (we) null;
            this.a(-19, -80, (we) null, 5, 102, 80);
          }
          stackIn_7_0 = (null != this.field_v) && (!this.field_v.b((byte) 79)) && (this.field_v.a(param1, false));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("jk.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    jk(int param0, int param1, int param2, int param3, ml param4, of param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    boolean a(int param0, int param1, int param2, int param3, we param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -1625) {
            field_B = -20;
          }
          stackIn_6_0 = (null != this.field_v) && (this.field_v.a(this.field_e + param0, param1, param2, -1625, param4, param5, param6 + this.field_r));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("jk.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param1 == 0 &&
          null != this.field_h) {
          this.field_h.a(true, (we) (this), param2, param3, 20);
        }
        if (param0 != 30) {
          return;
        }
        if (this.field_v != null) {
          this.field_v.a(30, param1, this.field_e + param2, this.field_r + param3);
        }
    }

    final void b(Hashtable param0, int param1, StringBuilder param2, int param3) {
        StringBuilder discarded$22 = null;
        int var5_int = 0;
        StringBuilder discarded$24 = null;
        StringBuilder discarded$23 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          discarded$22 = param2.append('\n');
          if (param1 != -25844) {
            field_A = 50;
          }
          for (var5_int = 0; var5_int <= param3; var5_int++) {
            discarded$24 = param2.append(' ');
          }
          if (null == this.field_v) {
            discarded$23 = param2.append("null");
          } else {
            this.field_v.a(false, param2, param0, param3 + 1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("jk.J(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void c(byte param0) {
        field_y = null;
        if (param0 != 77) {
          return;
        }
        field_z = null;
        field_x = null;
        field_C = null;
    }

    void a(we param0, int param1, int param2, byte param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.a(param0, param1, param2, (byte) -14);
          if (param3 > -13) {
            this.a(24);
          }
          if (this.field_v != null) {
            this.field_v.a(param0, param1 + this.field_e, this.field_r + param2, (byte) -86);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("jk.E(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int f(int param0) {
        if (param0 != 0) {
          return -59;
        }
        return this.field_v == null ? 0 : this.field_v.f(param0 ^ 0);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.i(-2);
    }

    final void e(int param0) {
        if (param0 != 13104) {
          this.a(49, -102, 107, 123);
        }
        if (null != this.field_v) {
          this.field_v.e(param0 ^ 0);
        }
    }

    final boolean a(we param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_v != null &&
            this.field_v.b((byte) 126) &&
            this.field_v.a(param0, param1, param2, 124)) {
            return true;
          }
          var5_int = param2;
          if (80 != var5_int) {
            var5_int = 9 % ((37 - param3) / 50);
            return false;
          }
          if (dl.field_c[81]) {
            stackIn_11_0 = this.a((byte) -94, param0);
          } else {
            stackIn_11_0 = this.a(-12, param0);
          }
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("jk.V(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    void a(int param0, int param1, we param2, int param3, int param4, int param5) {
        boolean discarded$1 = false;
        we var8 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (null != this.field_v) {
            this.field_v.a(param0 + this.field_e, param1, param2, param3, 0, this.field_r + param5);
          }
          if (param4 != 0) {
            var8 = (we) null;
            discarded$1 = this.a((byte) -34, (we) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_7_0 = var7;
          stackIn_7_1 = new StringBuilder().append("jk.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, int param2) {
        int stackIn_67_0 = 0;
        int stackIn_70_0 = 0;
        String[] stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        String stackIn_78_2 = null;
        String[] stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        int stackIn_82_2 = 0;
        int stackIn_82_3 = 0;
        String stackIn_85_2 = null;
        int stackIn_91_0 = 0;
        String stackIn_91_1 = null;
        boolean stackIn_92_2 = false;
        int stackIn_118_0 = 0;
        int stackIn_119_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String var11 = null;
        String var12 = null;
        String[] var4_ref_String__Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var6Lifetime1;
        int var8Lifetime1;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime2;
        int var8Lifetime3;
        int var5Lifetime2Lifetime1;
        int var7Lifetime1Lifetime1;
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          wd.field_g = true;
          ud.field_b = param2;
          if (0 == ud.field_b) {
            var3_int = aa.a(fe.field_a, rk.field_h, pc.field_P, true, vi.field_b);
            var4 = 3 + var3_int;
            gh.field_a = new int[var4];
            pl.field_k = new String[var4];
            for (var5 = 0; var4 > var5; var5++) {
              gh.field_a[var5] = -1;
            }
            bi.field_B = new int[2];
            for (var5 = 0; var5 < var3_int; var5++) {
              pl.field_k[var5] = vi.field_b[var5];
            }
            pl.field_k[-3 + var4] = "";
            pl.field_k[var4 - 2] = qd.field_d;
            gh.field_a[-2 + var4] = 0;
            bi.field_B[0] = 4;
            pl.field_k[-1 + var4] = db.field_e;
            gh.field_a[-1 + var4] = 1;
            bi.field_B[1] = 5;
          } else if (ud.field_b == 1) {
            var3_int = aa.a(fe.field_a, rk.field_h, pc.field_P, true, vi.field_b);
            var4 = var3_int + 2;
            pl.field_k = new String[var4];
            gh.field_a = new int[var4];
            for (var5 = 0; var4 > var5; var5++) {
              gh.field_a[var5] = -1;
            }
            bi.field_B = new int[1];
            for (var5 = 0; var5 < var3_int; var5++) {
              pl.field_k[var5] = vi.field_b[var5];
            }
            pl.field_k[-2 + var4] = "";
            pl.field_k[-1 + var4] = db.field_e;
            gh.field_a[var4 - 1] = 0;
            bi.field_B[0] = 5;
          } else if (ud.field_b != 2) {
            if (ud.field_b == 3) {
              if (rc.field_k.field_q) {
                var3_int = aa.a(fe.field_a, rk.field_h, uc.field_d, true, vi.field_b);
              } else {
                var3_int = aa.a(fe.field_a, rk.field_h, ld.field_b, true, vi.field_b);
              }
              var4 = 2 + var3_int;
              gh.field_a = new int[var4];
              pl.field_k = new String[var4];
              for (var5 = 0; var5 < var4; var5++) {
                gh.field_a[var5] = -1;
              }
              bi.field_B = new int[1];
              for (var5 = 0; var3_int > var5; var5++) {
                pl.field_k[var5] = vi.field_b[var5];
              }
              pl.field_k[var4 - 2] = "";
              pl.field_k[var4 - 1] = db.field_e;
              gh.field_a[-1 + var4] = 0;
              bi.field_B[0] = 5;
            } else if (ud.field_b == 4) {
              var3_int = aa.a(fe.field_a, rk.field_h, pd.field_e, true, vi.field_b);
              var4 = var3_int + 2;
              pl.field_k = new String[var4];
              gh.field_a = new int[var4];
              for (var5 = 0; var4 > var5; var5++) {
                gh.field_a[var5] = -1;
              }
              bi.field_B = new int[1];
              for (var5 = 0; var3_int > var5; var5++) {
                pl.field_k[var5] = vi.field_b[var5];
              }
              pl.field_k[-2 + var4] = "";
              pl.field_k[-1 + var4] = db.field_e;
              gh.field_a[-1 + var4] = 0;
              bi.field_B[0] = 5;
            } else {
              if (ud.field_b != 5) {
                throw new IllegalArgumentException();
              }
              var3_int = aa.a(fe.field_a, rk.field_h, mg.field_r, true, vi.field_b);
              var4 = 3 + var3_int;
              gh.field_a = new int[var4];
              pl.field_k = new String[var4];
              for (var5 = 0; var4 > var5; var5++) {
                gh.field_a[var5] = -1;
              }
              bi.field_B = new int[2];
              for (var5 = 0; var5 < var3_int; var5++) {
                pl.field_k[var5] = vi.field_b[var5];
              }
              pl.field_k[var4 - 3] = "";
              pl.field_k[var4 - 2] = j.field_b;
              gh.field_a[var4 - 2] = 0;
              bi.field_B[0] = 3;
              pl.field_k[var4 - 1] = db.field_e;
              gh.field_a[-1 + var4] = 1;
              bi.field_B[1] = 5;
            }
          } else {
            var3_int = aa.a(fe.field_a, rk.field_h, gg.a(new String[]{"<br><%0><br>"}, pd.field_h, true), true, vi.field_b);
            var4 = -1;
            for (var5 = 0; var5 < var3_int; var5++) {
              if (!"<%0>".equals(vi.field_b[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            wi.field_b = new String[var4];
            gl.a(vi.field_b, 0, wi.field_b, 0, var4);
            ud.field_e = new String[-1 + var3_int - var4];
            gl.a(vi.field_b, 1 + var4, ud.field_e, 0, var3_int - var4 - 1);
            var3_int = aa.a(fe.field_a, rk.field_h, gg.a(new String[]{"<br><%0><br>"}, wa.field_d, true), true, vi.field_b);
            var4 = -1;
            for (var5 = 0; var3_int > var5; var5++) {
              if (!"<%0>".equals(vi.field_b[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            uj.field_c = new String[var4];
            gl.a(vi.field_b, 0, uj.field_c, 0, var4);
            re.field_a = new String[var3_int - (var4 + 1)];
            gl.a(vi.field_b, 1 + var4, re.field_a, 0, -1 + var3_int - var4);
            if (uj.field_c.length > wi.field_b.length) {
              stackIn_67_0 = uj.field_c.length;
            } else {
              stackIn_67_0 = wi.field_b.length;
            }
            var5 = stackIn_67_0;
            if (ud.field_e.length >= re.field_a.length) {
              stackIn_70_0 = ud.field_e.length;
            } else {
              stackIn_70_0 = re.field_a.length;
            }
            var6 = stackIn_70_0;
            var7 = var6 + (var5 + 7);
            gh.field_a = new int[var7];
            pl.field_k = new String[var7];
            for (var8 = 0; var8 < var7; var8++) {
              gh.field_a[var8] = -1;
            }
            bi.field_B = new int[2];
            pl.field_k[0] = qb.field_d;
            gh.field_a[1] = 0;
            pl.field_k[1] = jf.field_p;
            gh.field_a[3] = 1;
            pl.field_k[4] = sk.field_F;
            bi.field_B[1] = 2;
            pl.field_k[2] = ua.field_y;
            bi.field_B[0] = 5;
            pl.field_k[3] = uf.field_c;
            pl.field_k[5] = "";
            for (var8Lifetime2 = 0; var5 > var8Lifetime2; var8Lifetime2++) {
              stackIn_77_0 = pl.field_k;
              stackIn_77_1 = var8Lifetime2 + 6;
              if (0 <= -var5 + var8Lifetime2 + uj.field_c.length) {
                stackIn_78_2 = uj.field_c[uj.field_c.length + var8Lifetime2 - var5];
              } else {
                stackIn_78_2 = "";
              }
              stackIn_77_0[stackIn_77_1] = stackIn_78_2;
            }
            pl.field_k[6 + var5] = null;
            gh.field_a[var5 + 6] = -2;
            for (var8Lifetime3 = 0; var6 > var8Lifetime3; var8Lifetime3++) {
              stackIn_82_0 = pl.field_k;
              stackIn_82_1 = var8Lifetime3 + 7 + var5;
              stackIn_82_2 = re.field_a.length;
              stackIn_82_3 = var8Lifetime3;
              if (stackIn_82_2 <= stackIn_82_3) {
                stackIn_85_2 = "";
              } else {
                stackIn_85_2 = re.field_a[var8Lifetime3];
              }
              stackIn_82_0[stackIn_82_1] = stackIn_85_2;
            }
            fb.field_n = pf.a(0);
          }
          sj.field_f.field_i = bi.field_B.length;
          var3_intLifetime1 = 0;
          for (var4Lifetime1 = 0; var4Lifetime1 < pl.field_k.length; var4Lifetime1++) {
            stackIn_91_0 = -108;
            stackIn_91_1 = pl.field_k[var4Lifetime1];
            stackIn_92_2 = !(gh.field_a[var4Lifetime1] < 0);
            var5Lifetime1 = hh.$cfr$intArgs$a$590e95718a07(stackIn_91_0, stackIn_91_1, stackIn_92_2);
            if (var3_intLifetime1 < var5Lifetime1) {
              var3_intLifetime1 = var5Lifetime1;
            }
          }
          if (ud.field_b == 2) {
            var10 = wi.field_b;
            var4_ref_String__ = var10;
            for (var5Lifetime2 = 0; var10.length > var5Lifetime2; var5Lifetime2++) {
              var11 = var10[var5Lifetime2];
              var7Lifetime1 = hh.$cfr$intArgs$a$590e95718a07(-109, var11, false);
              if (var7Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var7Lifetime1;
              }
            }
            var4_ref_String__Lifetime1 = ud.field_e;
            for (var5Lifetime2Lifetime1 = 0; var5Lifetime2Lifetime1 < var4_ref_String__Lifetime1.length; var5Lifetime2Lifetime1++) {
              var12 = var4_ref_String__Lifetime1[var5Lifetime2Lifetime1];
              var7Lifetime1Lifetime1 = hh.$cfr$intArgs$a$590e95718a07(-126, var12, false);
              if (var3_intLifetime1 < var7Lifetime1Lifetime1) {
                var3_intLifetime1 = var7Lifetime1Lifetime1;
              }
            }
          }
          h.field_b = -(var3_intLifetime1 >> 1) + (jc.field_b + var3_intLifetime1);
          sc.field_g = jc.field_b - (var3_intLifetime1 >> 1);
          fd.field_s = (ud.field_a + vf.field_b << 1) * sj.field_f.field_i;
          if (param0 >= -92) {
            return;
          }
          for (var4Lifetime2 = 0; pl.field_k.length > var4Lifetime2; var4Lifetime2++) {
            stackIn_118_0 = fd.field_s;
            if (gh.field_a[var4Lifetime2] >= 0) {
              stackIn_119_1 = hb.field_n;
            } else {
              stackIn_119_1 = gi.field_a;
            }
            fd.field_s = stackIn_118_0 + stackIn_119_1;
          }
          fb.field_k = -(fd.field_s >> 1) + fl.field_b;
          ja.field_A = new int[pl.field_k.length][];
          var4Lifetime3 = 0;
          var5Lifetime3 = fb.field_k;
          while (pl.field_k.length > var4Lifetime3) {
            var6Lifetime1 = gh.field_a[var4Lifetime3];
            if (var6Lifetime1 < 0) {
              var5Lifetime3 = var5Lifetime3 + gi.field_a;
            } else {
              var7Lifetime2 = hh.$cfr$intArgs$a$590e95718a07(-115, pl.field_k[var4Lifetime3], true);
              var8Lifetime1 = jc.field_b - (var7Lifetime2 >> 1);
              var5Lifetime3 = var5Lifetime3 + ud.field_a;
              ja.field_A[var4Lifetime3] = new int[4];
              ja.field_A[var4Lifetime3][0] = -pl.field_h + var8Lifetime1;
              ja.field_A[var4Lifetime3][1] = var5Lifetime3;
              ja.field_A[var4Lifetime3][2] = (pl.field_h << 1) + var7Lifetime2;
              var5Lifetime3 = var5Lifetime3 + ((vf.field_b << 1) + (ud.field_a + hb.field_n));
              ja.field_A[var4Lifetime3][3] = hb.field_n + (vf.field_b << 1);
            }
            var4Lifetime3++;
          }
          if (ud.field_b == 2) {
            sj.field_f.a(-1, -1, 0, param1);
          } else {
            sj.field_f.a(0, q.a(p.field_a, (byte) -36, ei.field_a), 0, param1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var3), "jk.U(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean a(int param0, we param1, int param2, int param3, int param4, int param5, int param6) {
        boolean discarded$1 = false;
        RuntimeException var8 = null;
        we var9 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param6 >= -109) {
            var9 = (we) null;
            discarded$1 = this.a((byte) -23, (we) null);
          }
          stackIn_7_0 = (null != this.field_v) && (this.field_v.b((byte) 43)) && (this.field_v.a(param0, param1, param2, param3, param4, param5, -127));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_10_0 = var8;
          stackIn_10_1 = new StringBuilder().append("jk.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    static {
        field_B = 0;
        field_A = 3;
        field_y = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_C = new li[field_A];
        field_u = 0;
        field_w = 0;
    }
}
