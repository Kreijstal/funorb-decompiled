/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ln extends df {
    int field_C;
    int field_Q;
    sd field_R;
    static bi[][] field_O;
    int field_z;
    String field_I;
    int field_S;
    static String field_U;
    static String field_P;
    static String field_q;
    static int field_w;
    ln[] field_D;
    int field_x;
    static bi field_F;
    int field_B;
    jd[] field_r;
    int field_p;
    static int[] field_H;
    static String field_o;
    fi[] field_v;
    pf field_T;
    int field_N;
    boolean field_u;
    fs field_t;
    fs field_y;
    int field_L;
    static bi field_K;
    int field_A;
    int field_J;
    db field_s;
    int[] field_G;
    static String field_E;

    final void e(byte param0) {
        int var4 = 0;
        int var2;
        int var3;
        int var6;
        ln var5;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        if (this.field_D == null) {
          return;
        }
        var2 = 0;
        var3 = this.field_D.length;
        if (param0 >= -97) {
          this.field_z = -57;
        }
        while (var2 == 0) {
          var3--;
          var2 = 1;
          for (var4 = 0; var3 > var4; var4++) {
            if (this.field_D[var4].field_p > this.field_D[var4 + 1].field_p) {
              var5 = this.field_D[var4];
              this.field_D[var4] = this.field_D[1 + var4];
              this.field_D[var4 + 1] = var5;
              var2 = 0;
            }
          }
        }
    }

    public static void e(int param0) {
        field_E = null;
        field_H = null;
        field_P = null;
        if (param0 != 0) {
          ln.e(-26);
        }
        field_o = null;
        field_K = null;
        field_U = null;
        field_q = null;
        field_F = null;
        field_O = (bi[][]) null;
    }

    final void a(ln param0, byte param1) {
        ln[] var7 = null;
        ln[] var8 = null;
        int var4 = 0;
        int var5 = 0;
        int incrementValue$0 = 0;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!this.b(param0, (byte) 10)) {
          return;
        }
        if (this.field_D.length == 1) {
          this.field_D = new ln[]{};
          param0.a(this, (byte) -124);
          return;
        }
        try {
          var7 = new ln[-1 + this.field_D.length];
          var8 = var7;
          ln[] var3 = var8;
          var4 = 0;
          for (var5 = 0; this.field_D.length > var5; var5++) {
            if (param0 != this.field_D[var5]) {
              incrementValue$0 = var4;
              var4++;
              var7[incrementValue$0] = this.field_D[var5];
            }
          }
          if (param1 >= -122) {
            this.field_s = (db) null;
          }
          this.field_D = var8;
          param0.a(this, (byte) -123);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "ln.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(byte param0, ln param1) {
        int var4 = 0;
        ln[] var3 = null;
        int var5 = 0;
        ln[] var6 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (null != this.field_D) {
            var6 = new ln[1 + this.field_D.length];
            var3 = var6;
            for (var4 = 0; var4 < this.field_D.length; var4++) {
              var6[var4] = this.field_D[var4];
            }
            var3[this.field_D.length] = param1;
            this.field_D = var3;
          } else {
            this.field_D = new ln[]{param1};
          }
          if (param0 > -74) {
            field_q = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("ln.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void a(Random param0, byte param1) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ln var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int[] var10 = null;
        int[] var12 = null;
        int[] var15 = null;
        int var5Lifetime1;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (this.field_G[0] < 0) {
            this.field_B = 6;
            return;
          }
          if (0 != this.field_G[1] &&
            this.field_G[2] != 0 &&
            this.field_G[3] != 0 &&
            0 != this.field_G[0]) {
            this.field_B = 1;
            return;
          }
          var12 = new int[6];
          var10 = var12;
          var8 = var10;
          var15 = var8;
          var4 = 0;
          if (param1 < 61) {
            var7 = (ln) null;
            this.a((ln) null, (byte) 104);
          }
          var8[2] = 4 * this.field_G[3];
          var8[3] = 4 * this.field_G[2];
          var8[1] = 4 * this.field_G[1];
          var8[5] = this.field_G[0] * 4;
          var8[0] = (this.field_G[0] + this.field_G[3]) * 3;
          var8[4] = 2 * (this.field_G[2] + this.field_G[3] + this.field_G[1]);
          for (var5 = 0; var12.length > var5; var5++) {
            var4 = var4 + var12[var5];
          }
          var4 = qf.a((byte) 126, var4, param0);
          var9 = 0;
          var5Lifetime1 = var9;
          while (true) {
            if (var9 >= var15.length) {
              throw new RuntimeException();
            }
            var4 = var4 - var15[var9];
            if (var4 >= 0) {
              var9++;
              continue;
            }
            break;
          }
          this.field_B = var9;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_25_0 = var3;
          stackIn_25_1 = new StringBuilder().append("ln.A(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean b(ln param0, byte param1) {
        ln[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        ln var5 = null;
        int var6 = 0;
        ln[] var7 = null;
        ln stackIn_13_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (this.field_D == null) {
            return false;
          }
          var7 = this.field_D;
          var3 = var7;
          var4 = 0;
          while (true) {
            if (var7.length <= var4) {
              if (param1 != 10) {
                stackIn_13_1 = (ln) null;
                this.a(stackIn_13_1, (byte) 102);
              }
              return false;
            }
            var5 = var7[var4];
            if (param0 != var5) {
              var4++;
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("ln.E(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void f(byte param0) {
        int var2 = -118 / ((3 - param0) / 49);
        cl var1 = (cl) (ta.field_b.a(true));
        if (var1 == null) {
          throw new IllegalStateException();
        }
        gf.a(var1.field_i, var1.field_r, var1.field_k);
        gf.d(var1.field_o, var1.field_h, var1.field_j, var1.field_l);
        var1.field_i = null;
        ql.field_p.a((byte) -113, var1);
    }

    ln(int param0, int param1, int param2, int param3) {
        this.field_G = new int[4];
        this.field_z = param3;
        this.field_p = param0;
        this.field_S = param2;
        this.field_A = param1;
        this.field_T = new pf();
        this.field_s = new db();
    }

    static {
        field_U = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_P = "Battles lost in hostile space.";
        field_q = "Incoming fleet";
        field_E = "Enter name of player to delete from list";
    }
}
