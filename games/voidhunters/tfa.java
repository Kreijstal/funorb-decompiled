/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class tfa extends bha implements ntb {
    int field_j;
    int field_n;
    int[] field_k;
    int field_h;
    int field_e;
    int field_b;
    int field_f;
    int field_l;
    int field_m;
    sg field_g;
    int[] field_i;
    int field_c;
    int field_d;

    public final boolean a(byte param0, tv param1) {
        int stackIn_11_0 = 0;
        int stackIn_14_1 = 0;
        boolean stackIn_26_0 = false;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        tfa var5 = null;
        try {
          boolean decompiledFrameRemainder0 = true;
          var4 = 2 / ((param0 - 22) / 59);
          var5 = (tfa) (param1);
          if (!super.a((byte) -38, param1) &&
            var5.field_f == this.field_f &&
            var5.field_d == this.field_d &&
            this.field_e == var5.field_e &&
            var5.field_b == this.field_b &&
            this.field_m == var5.field_m &&
            var5.field_h == this.field_h &&
            !wpb.a(var5.field_i, this.field_i, (byte) 28)) {
            stackIn_11_0 = (this.field_g != null) ? 0 : 1;
            if (var5.field_g != null) {
              stackIn_14_1 = 0;
            } else {
              stackIn_14_1 = 1;
            }
            if ((stackIn_11_0 ^ stackIn_14_1) == 0 && (null == this.field_g ||
              !this.field_g.a((byte) -125, var5.field_g)) && (!wpb.a(var5.field_k, this.field_k, (byte) 28) &&
              this.field_c == var5.field_c &&
              var5.field_n == this.field_n &&
              this.field_l == var5.field_l &&
              var5.field_j == this.field_j)) {
              stackIn_26_0 = false;
              decompiledFrameRemainder0 = false;
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_26_0 = true;
          }
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_29_0 = var3;
          stackIn_29_1 = new StringBuilder().append("tfa.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final void c(byte param0) {
        if (this.field_j > 0) {
          this.field_j = this.field_j - 1;
        }
        if (param0 != 11) {
          tv var3 = (tv) null;
          this.a((tv) null, -82);
        }
    }

    final int a(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        var7 = VoidHunters.field_G;
        if (null == this.field_i) {
          return 0;
        }
        var4 = 0;
        var5 = 0;
        if (param1 != 11863) {
          return -83;
        }
        while (var5 < this.field_i.length) {
          var6 = this.field_i[var5];
          if (var6 >= param0 &&
            param2 >= var6) {
            var4++;
          }
          var5++;
        }
        return var4;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var11 = 0;
        int var6;
        int var7;
        int[] var8;
        int var9;
        int var10;
        int var12;
        int var13;
        int[] var14;
        int[] var15;
        int[] var15Lifetime1;
        var13 = VoidHunters.field_G;
        if (0 > param1) {
          if (this.a(param3, 11863, param0) == param4) {
            return;
          }
          this.field_i = qi.a(param1, true, this.field_i, (byte) -14);
          return;
        }
        this.field_i = kdb.a(this.field_i, param1, (byte) -99);
        var6 = this.a(param3, param2 - 18161, param0);
        if (param4 < var6) {
          var7 = var6 - param4;
          var15 = new int[this.field_i.length - var7];
          var14 = var15;
          var8 = var14;
          var9 = 0;
          var10 = 0;
          for (var11 = 0; var11 < this.field_i.length; var11++) {
            var12 = this.field_i[var11];
            if (var12 >= param3 &&
              param0 >= var12 &&
              var12 != param1) {
              if (var9 < var7) {
                var9++;
              } else {
                var8[var10++] = var12;
              }
            } else {
              var8[var10++] = var12;
            }
            var15Lifetime1 = var14;
            if (var15Lifetime1.length > var10) {
              continue;
            }
            break;
          }
          this.field_i = var8;
        }
        if (param2 != 30024) {
          this.field_n = -99;
        }
    }

    final void a(int param0) {
        this.field_j = param0;
        this.field_h = sja.field_c;
    }

    final void a(boolean param0, tja param1, int param2, int param3) {
        rsb var5 = null;
        rha var6 = null;
        try {
          var5 = (rsb) (param1);
          var6 = new rha(2, param3, param3);
          var5.field_d.a(var6, param0);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "tfa.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final void a(tv param0, int param1) {
        int stackIn_23_0 = 0;
        int stackIn_26_1 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        tfa var5 = null;
        try {
          super.a(param0, -44);
          var5 = (tfa) (param0);
          if (this.field_g != null &&
            var5.field_g != null) {
            this.field_g.a(var5.field_g, -122);
          }
          var4 = 0;
          if (var5.field_f != this.field_f) {
            System.out.println("int triggers has changed. before=" + var5.field_f + ", now=" + this.field_f);
            var4 = 1;
          }
          if (this.field_d != var5.field_d) {
            var4 = 1;
            System.out.println("int aimtargetx has changed. before=" + var5.field_d + ", now=" + this.field_d);
          }
          if (this.field_e != var5.field_e) {
            var4 = 1;
            System.out.println("int aimtargety has changed. before=" + var5.field_e + ", now=" + this.field_e);
          }
          if (this.field_b != var5.field_b) {
            var4 = 1;
            System.out.println("int specialorder has changed. before=" + var5.field_b + ", now=" + this.field_b);
          }
          if (var5.field_m != this.field_m) {
            var4 = 1;
            System.out.println("int spawn_choice has changed. before=" + var5.field_m + ", now=" + this.field_m);
          }
          if (this.field_h != var5.field_h) {
            System.out.println("int selected_team has changed. before=" + var5.field_h + ", now=" + this.field_h);
            var4 = 1;
          }
          if (ikb.a(this.field_i, var5.field_i, false)) {
            System.out.println("int[] votes has changed. ");
            var4 = 1;
          }
          stackIn_23_0 = (var5.field_g != null) ? 0 : 1;
          if (null != this.field_g) {
            stackIn_26_1 = 0;
          } else {
            stackIn_26_1 = 1;
          }
          if ((stackIn_23_0 ^ stackIn_26_1) != 0 ||
            null != this.field_g &&
            this.field_g.a((byte) 92, var5.field_g)) {
            var4 = 1;
            System.out.println("Ship saved_ship has changed. before=" + var5.field_g + ", now=" + this.field_g);
          }
          if (ikb.a(this.field_k, var5.field_k, false)) {
            var4 = 1;
            System.out.println("int[] carried_over_components has changed. ");
          }
          if (var5.field_c != this.field_c) {
            var4 = 1;
            System.out.println("int kills has changed. before=" + var5.field_c + ", now=" + this.field_c);
          }
          if (this.field_n != var5.field_n) {
            var4 = 1;
            System.out.println("int assists has changed. before=" + var5.field_n + ", now=" + this.field_n);
          }
          if (this.field_l != var5.field_l) {
            System.out.println("int deaths has changed. before=" + var5.field_l + ", now=" + this.field_l);
            var4 = 1;
          }
          if (this.field_j != var5.field_j) {
            System.out.println("int unassigned_for_autobalance_timer has changed. before=" + var5.field_j + ", now=" + this.field_j);
            var4 = 1;
          }
          if (param1 >= -19) {
            this.field_b = 45;
          }
          if (var4 != 0) {
            System.out.println("This instance of MyCarouselPlayerInfo has changed");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_52_0 = var3;
          stackIn_52_1 = new StringBuilder().append("tfa.F(");
          if (param0 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_52_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, byte param1) {
        int var4_int = 0;
        int var6 = 0;
        int var3;
        int[] var4;
        int var5;
        int var7;
        var7 = VoidHunters.field_G;
        if (this.field_i == null) {
          return;
        }
        var3 = -1;
        for (var4_int = 0; var4_int < this.field_i.length; var4_int++) {
          if (~this.field_i[var4_int] != ~param0) {
            continue;
          }
          var3 = var4_int;
          break;
        }
        if (param1 >= -10) {
          this.a(-58, (byte) 29);
        }
        if (var3 != -1) {
          if (1 < this.field_i.length) {
            var4 = new int[-1 + this.field_i.length];
            var5 = 0;
            for (var6 = 0; var6 < this.field_i.length; var6++) {
              if (var6 != var3) {
                var4[var5] = this.field_i[var6];
                var5++;
              }
            }
            this.field_i = var4;
          } else {
            this.field_i = null;
          }
        }
    }

    public final void b(faa param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_5_1 = 0;
        faa stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        boolean stackIn_8_2 = false;
        int stackIn_13_0 = 0;
        int stackIn_14_1 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          super.b(param0, -124);
          param0.a(-632, this.field_f, 4);
          param0.a(-632, this.field_d, 32);
          if (param1 >= -109) {
            this.b((byte) 107);
          }
          param0.a(-632, this.field_e, 32);
          param0.a(-632, 1 + this.field_b, 8);
          param0.a(-632, this.field_m, 4);
          param0.a(-632, 1 + this.field_h, 4);
          stackIn_4_0 = 4;
          if (this.field_i != null) {
            stackIn_5_1 = this.field_i.length;
          } else {
            stackIn_5_1 = 0;
          }
          pgb.a(stackIn_4_0, stackIn_5_1, 49, param0, this.field_i);
          stackIn_7_0 = (faa) (param0);
          stackIn_7_1 = 85;
          stackIn_8_2 = (this.field_g != null);
          if (vq.a(stackIn_7_0, stackIn_7_1, stackIn_8_2)) {
            this.field_g.b(param0, -114);
          }
          stackIn_13_0 = 8;
          if (this.field_k == null) {
            stackIn_14_1 = 0;
          } else {
            stackIn_14_1 = this.field_k.length;
          }
          pgb.a(stackIn_13_0, stackIn_14_1, 63, param0, this.field_k);
          param0.a(-632, this.field_c, 16);
          param0.a(-632, this.field_n, 16);
          param0.a(-632, this.field_l, 16);
          param0.a(-632, this.field_j, 8);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("tfa.B(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void b(byte param0, tv param1) {
        tfa var4 = (tfa) (param1);
        if (param0 <= 54) {
          return;
        }
        try {
          super.b((byte) 93, param1);
          var4.field_h = this.field_h;
          var4.field_f = this.field_f;
          var4.field_e = this.field_e;
          var4.field_m = this.field_m;
          var4.field_b = this.field_b;
          var4.field_d = this.field_d;
          var4.field_i = dob.a(var4.field_i, (byte) -108, this.field_i);
          if (this.field_g == null) {
            var4.field_g = null;
          } else {
            if (var4.field_g == null) {
              var4.field_g = new sg();
            }
            this.field_g.b((byte) 93, var4.field_g);
          }
          var4.field_k = dob.a(var4.field_k, (byte) -66, this.field_k);
          var4.field_n = this.field_n;
          var4.field_j = this.field_j;
          var4.field_c = this.field_c;
          var4.field_l = this.field_l;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "tfa.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(byte param0) {
        if (param0 <= 124) {
          this.field_h = 69;
        }
        this.field_i = null;
    }

    public final void a(faa param0, boolean param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          super.a(param0, param1);
          this.field_f = param0.i(0, 4);
          this.field_d = param0.i(0, 32);
          this.field_e = param0.i(0, 32);
          this.field_b = -1 + param0.i(0, 8);
          this.field_m = param0.i(0, 4);
          this.field_h = param0.i(0, 4) - 1;
          this.field_i = wkb.a((byte) 37, this.field_i, param0, 4);
          if (!kv.a(param1, param0)) {
            this.field_g = null;
          } else {
            if (this.field_g == null) {
              this.field_g = new sg();
            }
            this.field_g.a(param0, false);
          }
          this.field_k = wkb.a((byte) 37, this.field_k, param0, 8);
          this.field_c = param0.i(0, 16);
          this.field_n = param0.i(0, 16);
          this.field_l = param0.i(0, 16);
          this.field_j = param0.i(0, 8);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("tfa.H(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(byte param0) {
        int var2;
        boolean stackIn_5_0 = false;
        var2 = 81 % ((param0 - 12) / 41);
        stackIn_5_0 = (this.field_a) || (foa.field_p == 1);
        return stackIn_5_0;
    }

    final void b(int param0) {
        this.field_l = 0;
        if (param0 != -1) {
          faa var3 = (faa) null;
          this.b((faa) null, 126);
        }
        this.field_n = 0;
        this.field_c = 0;
    }

    final void a(tja param0, int param1, int param2, int param3) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        rha var6 = null;
        sg var7 = null;
        Random var8 = null;
        tja var9 = null;
        rsb var10 = null;
        try {
          this.field_h = -1;
          var10 = (rsb) (param0);
          if (!var10.field_e.c((byte) 125) &&
            !qab.a(param2 + 24476, var10.field_g.d(false))) {
            this.field_h = param1;
          }
          var6 = new rha(1, param1, param1);
          var10.field_d.a(var6, true);
          if (param2 != -24354) {
            var9 = (tja) null;
            this.a(false, (tja) null, -66, -35);
          }
          var7 = var10.field_g.d(param1, 92);
          if (var7 != null) {
            this.field_h = var7.q((byte) 65);
            return;
          }
          if (var10.field_e.e(8) == 5 &&
            qab.a(34, var10.field_g.d(false))) {
            var8 = new Random((long)param3);
            var10.field_e.a(var8, 2196, var10);
          }
          this.field_j = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("tfa.I(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    tfa() {
        this.field_b = -1;
        this.field_i = null;
        this.field_h = sja.field_c;
    }

    static {
    }
}
