/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lbb implements ntb {
    static String field_c;
    private int field_b;
    private int[] field_j;
    private int field_e;
    private int field_d;
    private qqb field_f;
    private qdb field_i;
    private int field_a;
    static String field_h;
    et[] field_g;

    final int d(byte param0) {
        int var2 = -14 / ((param0 + 56) / 40);
        return this.field_i.field_f;
    }

    final int g(byte param0) {
        if (param0 <= 39) {
          this.field_d = -39;
        }
        return this.field_b;
    }

    public final void a(tv param0, int param1) {
        int stackIn_26_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_42_1 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        lbb var5 = null;
        try {
          var5 = (lbb) (param0);
          tja.a(var5.field_g, 1, this.field_g, false, 5547);
          if (null != this.field_i &&
            var5.field_i != null) {
            this.field_i.a(var5.field_i, -123);
          }
          if (null != this.field_f &&
            null != var5.field_f) {
            this.field_f.a(var5.field_f, -102);
          }
          var4 = 0;
          if (var5.field_d != this.field_d) {
            var4 = 1;
            System.out.println("int mission_phase has changed. before=" + var5.field_d + ", now=" + this.field_d);
          }
          if (var5.field_e != this.field_e) {
            var4 = 1;
            System.out.println("int phase_change_countdown has changed. before=" + var5.field_e + ", now=" + this.field_e);
          }
          if (this.field_a != var5.field_a) {
            System.out.println("int phase_timer has changed. before=" + var5.field_a + ", now=" + this.field_a);
            var4 = 1;
          }
          if (this.field_b != var5.field_b) {
            var4 = 1;
            System.out.println("int winner has changed. before=" + var5.field_b + ", now=" + this.field_b);
          }
          if (dn.a(var5.field_g, false, 1, this.field_g, -77)) {
            System.out.println("MissionVariable[] custom_variables has changed. ");
            var4 = 1;
          }
          if (param1 >= -19) {
            return;
          }
          stackIn_26_0 = (this.field_i != null) ? 0 : 1;
          if (var5.field_i != null) {
            stackIn_29_1 = 0;
          } else {
            stackIn_29_1 = 1;
          }
          if ((stackIn_26_0 ^ stackIn_29_1) != 0 ||
            this.field_i != null &&
            this.field_i.a((byte) 84, var5.field_i)) {
            System.out.println("MissionGenerationData nextround has changed. before=" + var5.field_i + ", now=" + this.field_i);
            var4 = 1;
          }
          if (ikb.a(this.field_j, var5.field_j, false)) {
            System.out.println("int[] teamscores has changed. ");
            var4 = 1;
          }
          stackIn_39_0 = (var5.field_f != null) ? 0 : 1;
          if (null != this.field_f) {
            stackIn_42_1 = 0;
          } else {
            stackIn_42_1 = 1;
          }
          if ((stackIn_39_0 ^ stackIn_42_1) != 0 ||
            null != this.field_f &&
            this.field_f.a((byte) 126, var5.field_f)) {
            System.out.println("MatchResults current_match has changed. before=" + var5.field_f + ", now=" + this.field_f);
            var4 = 1;
          }
          if (var4 != 0) {
            System.out.println("This instance of MissionState has changed");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_53_0 = var3;
          stackIn_53_1 = new StringBuilder().append("lbb.F(");
          if (param0 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_53_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, rsb param1) {
        int var5_int = 0;
        int var4 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        tfa var5 = null;
        int var6 = 0;
        int var7 = 0;
        bea var8 = null;
        bea var9 = null;
        Random var10 = null;
        String var11 = null;
        var7 = VoidHunters.field_G;
        try {
          var8 = new bea();
          var9 = var8;
          var9.field_d = this.a((byte) 120);
          if (qab.a(param0 + 92, this.d(6472))) {
            var10 = new Random((long)var9.field_d);
            this.b(-1, param1);
            this.a(var10, 2196, param1);
          }
          var9.field_c = this.c(true);
          var9.a(91, param1);
          if (vpa.a((byte) -125)) {
            var11 = ih.field_f[param1.field_e.d(6472)];
            qa.a(202, "missions_started_" + var11, 1);
            qa.a(param0 + 202, "missions_started", 1);
            for (var5_int = 0; var5_int < var9.field_c.length; var5_int++) {
              var6 = var8.field_c[var5_int];
              if (0 < var6) {
                qa.a(param0 + 202, "votes_for_" + ih.field_f[var5_int], var6);
              }
            }
          }
          this.b(-1);
          this.c(5, -7, 0);
          this.field_b = -1;
          this.field_e = 0;
          for (var4 = param0; var4 < param1.field_c.length; var4++) {
            var5 = param1.a(var4, (byte) 59);
            var5.b((byte) 127);
            var5.b(-1);
            var5.field_k = null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("lbb.NA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final boolean c(byte param0) {
        int var2;
        boolean stackIn_7_0 = false;
        var2 = -41 % ((14 - param0) / 41);
        stackIn_7_0 = (this.field_d == 0) || (this.field_d == 1) || (this.field_d == 2) || (this.field_d == 3);
        return stackIn_7_0;
    }

    final int e(byte param0) {
        int var2 = -113 % ((-74 - param0) / 52);
        return this.field_e;
    }

    private final boolean a(boolean param0, rsb param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        tfa var4 = null;
        int var5 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = VoidHunters.field_G;
        try {
          if (param0) {
            return true;
          }
          for (var3_int = 0; var3_int < param1.field_c.length; var3_int++) {
            var4 = param1.a(var3_int, (byte) 59);
            if (var4.field_a &&
              54 == var4.field_b) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("lbb.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void a(Random param0, int param1, rsb param2) {
        int var8 = 0;
        int var12 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        tfa var8_ref_tfa = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        tfa var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int[] var18 = null;
        int var7Lifetime1;
        int var9Lifetime1;
        var16 = VoidHunters.field_G;
        try {
          var18 = new int[2];
          var17 = var18;
          var4 = var17;
          var5 = 0;
          var6 = 0;
          for (var7 = 0; param2.field_c.length > var7; var7++) {
            var8_ref_tfa = param2.a(var7, (byte) 59);
            if (var8_ref_tfa.field_a ||
              foa.field_p != 0) {
              var5++;
              var9 = var8_ref_tfa.field_h;
              if (var9 >= 0 &&
                var9 < var18.length) {
                var6++;
                var4[var9] = var4[var9] + 1;
              }
            }
          }
          var7Lifetime1 = -var6 + var5;
          for (var8 = 0; var8 < var7Lifetime1; var8++) {
            var9Lifetime1 = var7Lifetime1 - var8;
            var10 = 0;
            if (1 < var9Lifetime1) {
              var10 = hob.a(param0, var9Lifetime1, 122);
            }
            var11 = 0;
            for (var12 = 0; param2.field_c.length > var12; var12++) {
              var13 = param2.a(var12, (byte) 59);
              var14 = var13.field_h;
              if ((var13.field_a ||
                foa.field_p != 0) && (var14 < 0 ||
                var18.length <= var14)) {
                if (var11 == var10) {
                  var15 = ccb.a(param0, var18, (byte) -21, false);
                  var13.field_h = var15;
                  var4[var15] = var4[var15] + 1;
                }
                var11++;
              }
            }
          }
          if (param1 != 2196) {
            field_h = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_38_0 = var4_ref;
          stackIn_38_1 = new StringBuilder().append("lbb.I(");
          if (param0 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          stackIn_41_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(')').toString());
        }
    }

    final void b(boolean param0) {
        nkb.a(param0, "Skipping phase countdown for " + this.field_d);
        this.field_e = 0;
        if (param0) {
          this.field_g = (et[]) null;
        }
    }

    public final void b(faa param0, int param1) {
        int var7 = 0;
        int stackIn_6_0 = 0;
        faa stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        boolean stackIn_13_2 = false;
        faa stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        boolean stackIn_20_2 = false;
        int stackIn_25_0 = 0;
        int stackIn_26_1 = 0;
        faa stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        boolean stackIn_29_2 = false;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        faa var3 = null;
        RuntimeException var3_ref = null;
        et[] var4 = null;
        int var5 = 0;
        et[] var6 = null;
        et var8 = null;
        int var9 = 0;
        faa var10 = null;
        var9 = VoidHunters.field_G;
        try {
          param0.a(-632, this.field_d, 32);
          param0.a(-632, this.field_e, 32);
          param0.a(-632, this.field_a, 32);
          param0.a(-632, this.field_b, 32);
          var10 = param0;
          var3 = var10;
          if (param1 >= -109) {
            return;
          }
          var4 = this.field_g;
          if (var4 == null) {
            stackIn_6_0 = 0;
          } else {
            stackIn_6_0 = var4.length;
          }
          var5 = stackIn_6_0;
          var10.a(-632, var5, 8);
          if (0 != var5) {
            var6 = var4;
            for (var7 = 0; var6.length > var7; var7++) {
              var8 = var6[var7];
              stackIn_12_0 = var3;
              stackIn_12_1 = 80;
              stackIn_13_2 = (var8 != null);
              if (vq.a(stackIn_12_0, stackIn_12_1, stackIn_13_2)) {
                stb.a(2, 1, var10, var8);
              }
            }
          }
          stackIn_19_0 = (faa) (param0);
          stackIn_19_1 = 99;
          stackIn_20_2 = (this.field_i != null);
          if (vq.a(stackIn_19_0, stackIn_19_1, stackIn_20_2)) {
            this.field_i.b(param0, -112);
          }
          stackIn_25_0 = 8;
          if (this.field_j != null) {
            stackIn_26_1 = this.field_j.length;
          } else {
            stackIn_26_1 = 0;
          }
          pgb.a(stackIn_25_0, stackIn_26_1, 76, param0, this.field_j);
          stackIn_28_0 = (faa) (param0);
          stackIn_28_1 = 84;
          stackIn_29_2 = (this.field_f != null);
          if (vq.a(stackIn_28_0, stackIn_28_1, stackIn_29_2)) {
            this.field_f.b(param0, -126);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_35_0 = var3_ref;
          stackIn_35_1 = new StringBuilder().append("lbb.B(");
          if (param0 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param1).append(')').toString());
        }
    }

    final void b(int param0, int param1, int param2) {
        if (param0 != 2) {
          this.field_j = (int[]) null;
        }
        et var6 = this.c(-1, param2);
        et var7 = var6;
        if (var7 != null) {
          var7.field_a = param1;
        }
    }

    final static boolean a(int param0, int param1, byte param2) {
        if (param2 < 15) {
          return true;
        }
        return wh.a(param0, (byte) 99, param1) & (((param1 & 8192) != 0 ? true : false) | bla.a(param1, false, param0) | hsb.a(param0, 65536, param1));
    }

    public final boolean a(byte param0, tv param1) {
        int stackIn_8_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_1 = 0;
        boolean stackIn_28_0 = false;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        lbb var5 = null;
        try {
          boolean decompiledFrameRemainder0 = true;
          var5 = (lbb) (param1);
          var4 = 97 / ((param0 - 22) / 59);
          if (this.field_d == var5.field_d &&
            this.field_e == var5.field_e &&
            this.field_a == var5.field_a &&
            this.field_b == var5.field_b &&
            !dn.a(var5.field_g, false, 1, this.field_g, -22)) {
            stackIn_8_0 = (var5.field_i != null) ? 0 : 1;
            if (this.field_i != null) {
              stackIn_11_1 = 0;
            } else {
              stackIn_11_1 = 1;
            }
            if ((stackIn_8_0 ^ stackIn_11_1) == 0 && (this.field_i == null ||
              !this.field_i.a((byte) -74, var5.field_i)) && !wpb.a(var5.field_j, this.field_j, (byte) 28)) {
              stackIn_19_0 = (null != this.field_f) ? 0 : 1;
              if (var5.field_f != null) {
                stackIn_22_1 = 0;
              } else {
                stackIn_22_1 = 1;
              }
              if ((stackIn_19_0 ^ stackIn_22_1) == 0 && (this.field_f == null ||
                !this.field_f.a((byte) -57, var5.field_f))) {
                stackIn_28_0 = false;
                decompiledFrameRemainder0 = false;
              }
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_28_0 = true;
          }
          return stackIn_28_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_31_0 = var3;
          stackIn_31_1 = new StringBuilder().append("lbb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    final int d(int param0) {
        if (param0 != 6472) {
          int[] var3 = (int[]) null;
          this.a((int[]) null, false);
        }
        return this.field_i.field_b;
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 > -8) {
          this.b(54, -62, 111);
        }
        int var4 = this.b(7061, param2);
        this.b(2, var4 + param1, param2);
    }

    private final void a(rsb param0, byte param1, int param2) {
        int var6 = 0;
        int var4_int = 0;
        int var5 = 0;
        int var7 = 0;
        tfa var8 = null;
        int var10 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var9 = 0;
        var10 = VoidHunters.field_G;
        try {
          var4_int = -2147483648;
          var5 = -1;
          var7 = 28 / ((-37 - param1) / 47);
          for (var6 = 0; param0.field_c.length > var6; var6++) {
            var8 = param0.a(var6, (byte) 59);
            if (var8.a((byte) -43) &&
              param2 == var8.field_h) {
              var9 = var8.field_n + var8.field_c;
              if (var4_int < var9) {
                var5 = var9;
                var5 = var6;
              }
            }
          }
          if (var5 >= 0) {
            param0.a(var5, (byte) 59).a(255);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("lbb.KA(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0) {
        if (param0 < 125) {
          return;
        }
        nkb.a(false, "Extending phase countdown for " + this.field_d);
        this.field_e = this.field_e + 600 * oq.field_l;
    }

    final et a(int param0, int param1) {
        if (param0 != -31634) {
          int[] var4 = (int[]) null;
          this.a((int[]) null, false);
        }
        if (null == this.field_g) {
          return null;
        }
        if (0 > param1) {
          return null;
        }
        if (this.field_g.length <= param1) {
          return null;
        }
        if (this.field_g[param1] == null) {
          return null;
        }
        return this.field_g[param1];
    }

    private final int[] a(byte param0, rsb param1) {
        int var4 = 0;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        tfa var5 = null;
        int var6 = 0;
        int var7 = 0;
        int[] stackIn_11_0 = null;
        int[] stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = VoidHunters.field_G;
        try {
          var3 = new int[2];
          for (var4 = 0; param1.field_c.length > var4; var4++) {
            var5 = param1.a(var4, (byte) 59);
            if (var5.a((byte) -119)) {
              var6 = var5.field_h;
              if (var6 >= 0 &&
                var6 < var3.length) {
                var3[var6] = var3[var6] + 1;
              }
            }
          }
          if (param0 == -63) {
            stackIn_13_0 = var3;
            return stackIn_13_0;
          }
          stackIn_11_0 = (int[]) null;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("lbb.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final int[] c(boolean param0) {
        if (!param0) {
          int[] var3 = (int[]) null;
          this.a((int[]) null, true);
        }
        return this.field_i.field_c;
    }

    final int f(byte param0) {
        if (param0 >= -87) {
          this.field_a = -116;
        }
        return this.field_a;
    }

    public final void b(byte param0, tv param1) {
        int var4 = 0;
        lbb var5 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = VoidHunters.field_G;
        try {
          var5 = (lbb) (param1);
          var5.field_b = this.field_b;
          var5.field_a = this.field_a;
          var5.field_d = this.field_d;
          var5.field_e = this.field_e;
          if (param0 <= 54) {
            this.field_a = 126;
          }
          var5.field_g = (et[]) (sqb.a(var5.field_g, this.field_g, 1, mja.field_p, false));
          if (this.field_i == null) {
            var5.field_i = null;
          } else {
            if (null == var5.field_i) {
              var5.field_i = new qdb();
            }
            this.field_i.b((byte) 98, var5.field_i);
          }
          var5.field_j = dob.a(var5.field_j, (byte) -57, this.field_j);
          if (null != this.field_f) {
            if (var5.field_f == null) {
              var5.field_f = new qqb();
            }
            this.field_f.b((byte) 64, var5.field_f);
          } else {
            var5.field_f = null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("lbb.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          lbb.a(111, -111, (byte) -58);
        }
        field_c = null;
        field_h = null;
    }

    private final int a(byte param0) {
        if (param0 != 120) {
          return 73;
        }
        return this.field_i.field_d;
    }

    final boolean c(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 1) {
          return true;
        }
        stackIn_6_0 = (this.f(24416)) && (uaa.a(this.d(param0 + 6471), 103) > 1);
        return stackIn_6_0;
    }

    final boolean f(int param0) {
        if (param0 != 24416) {
          field_h = (String) null;
        }
        return this.field_i != null ? true : false;
    }

    private final void a(int param0, byte param1, int param2, rsb param3, int param4, int param5) {
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        tfa var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        var13 = VoidHunters.field_G;
        try {
          var7_int = 0;
          var9 = -90 % ((-72 - param1) / 52);
          var8 = 0;
          L1: while (true) {
            if (var8 < param3.field_c.length) {
              var10 = param3.a(var8, (byte) 59);
              if (var10.field_a) {
                var11 = var10.a(param5, 11863, param5);
                var12 = var10.a(param4, 11863, param0);
                if (var11 == 0 &&
                  param2 > var12) {
                  var7_int = 1;
                  break L1;
                }
              }
              var8++;
              continue;
            }
            break;
          }
          if (var7_int == 0) {
            this.field_e = this.field_e - 16;
            if (this.field_e < 0) {
              this.field_e = 0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_17_0 = var7;
          stackIn_17_1 = new StringBuilder().append("lbb.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void b(boolean param0, int param1) {
        wna var3 = null;
        if (this.field_d == 5) {
          this.field_b = param1;
          if (null != this.field_f) {
            var3 = new wna();
            var3.field_b = this.field_a;
            var3.field_d = this.field_b;
            this.field_f.a(126, var3);
          }
          this.c(6, -7, oq.field_l * 10);
        }
        if (param0) {
          tv var4 = (tv) null;
          this.a((byte) -35, (tv) null);
        }
    }

    final int b(int param0, int param1) {
        if (param0 != 7061) {
          return -10;
        }
        if (null != this.field_g &&
          param1 >= 0 &&
          param1 < this.field_g.length) {
          if (null == this.field_g[param1]) {
            return 0;
          }
          return this.field_g[param1].field_a;
        }
        return 0;
    }

    final int a(boolean param0, int param1) {
        tv var4;
        if (param0) {
          var4 = (tv) null;
          this.a((byte) 66, (tv) null);
        }
        if (param1 < 0) {
          return 0;
        }
        if (param1 < this.field_j.length) {
          return this.field_j[param1];
        }
        return 0;
    }

    private final void b(int param0) {
        if (this.field_i == null) {
          return;
        }
        this.field_i.field_f = this.field_i.field_f - 1;
        if (!(param0 > ~this.field_i.field_f)) {
          this.field_i = null;
        }
    }

    final et c(int param0, int param1) {
        int var4 = 0;
        int var5 = VoidHunters.field_G;
        if (~param1 > param0) {
          return null;
        }
        if (null != this.field_g &&
          this.field_g.length > param1) {
          return this.field_g[param1];
        }
        if (null == this.field_g) {
          this.field_g = new et[1 + param1];
          this.field_g[param1] = new et();
          return this.field_g[param1];
        }
        et[] var6 = new et[1 + param1];
        et[] var3 = var6;
        for (var4 = 0; var4 < this.field_g.length; var4++) {
          var6[var4] = this.field_g[var4];
        }
        var3[param1] = new et();
        this.field_g = var3;
        return this.field_g[param1];
    }

    private final int[] a(rsb param0, byte param1) {
        int var7 = 0;
        int dupTemp$1 = 0;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        tfa var6 = null;
        int var8 = 0;
        int[] var9 = null;
        int[] stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = VoidHunters.field_G;
        try {
          var9 = new int[31];
          var3 = var9;
          var4 = 0;
          var5 = 126 / ((-8 - param1) / 48);
          while (var4 < param0.field_c.length) {
            var6 = param0.a(var4, (byte) 59);
            if (var6.field_a &&
              var6.field_i != null &&
              var6.field_i.length > 0) {
              for (var7 = 0; var7 < var6.field_i.length; var7++) {
                if (var6.field_i[var7] >= 0) {
                  dupTemp$1 = var6.field_i[var7];
                  var9[dupTemp$1] = var9[dupTemp$1] + 1;
                }
              }
            }
            var4++;
          }
          stackIn_13_0 = var9;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("lbb.W(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != 1) {
          this.a(-126);
        }
        this.field_i = new qdb();
        this.field_i.field_d = param0;
        this.field_i.field_b = param2;
        this.field_i.field_f = uaa.a(param2, param1 ^ 57);
        this.field_f = new qqb();
    }

    final qqb b(byte param0) {
        if (param0 > -45) {
          return (qqb) null;
        }
        return this.field_f;
    }

    private final void b(int param0, rsb param1) {
        int var7 = 0;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        int var6 = 0;
        var8 = VoidHunters.field_G;
        try {
          var9 = this.a((byte) -63, param1);
          var3 = var9;
          var4 = -var9[1] + var9[0];
          var5 = param0;
          if (var4 > 1) {
            var5 = 0;
          } else {
            if (var4 < -1) {
              var5 = 1;
            }
          }
          if (var5 != -1) {
            var6 = Math.abs(var4) / 2;
            for (var7 = 0; var7 < var6; var7++) {
              this.a(param1, (byte) -128, var5);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("lbb.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final void a(int[] param0, boolean param1) {
        try {
          this.field_i.field_c = param0;
          if (param1) {
            faa var4 = (faa) null;
            this.a((faa) null, false);
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "lbb.JA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int e(int param0) {
        if (param0 != 8) {
          return -38;
        }
        return this.field_d;
    }

    final et[] d(boolean param0) {
        if (param0) {
          this.d(53);
        }
        return this.field_g;
    }

    public final void a(faa param0, boolean param1) {
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = VoidHunters.field_G;
        try {
          this.field_d = param0.i(0, 32);
          this.field_e = param0.i(0, 32);
          this.field_a = param0.i(0, 32);
          this.field_b = param0.i(0, 32);
          this.field_g = (et[]) (kcb.a(8, mja.field_p, param0, 1, -128, this.field_g));
          if (kv.a(false, param0)) {
            if (null == this.field_i) {
              this.field_i = new qdb();
            }
            this.field_i.a(param0, false);
          } else {
            this.field_i = null;
          }
          this.field_j = wkb.a((byte) 37, this.field_j, param0, 8);
          if (kv.a(param1, param0)) {
            if (this.field_f == null) {
              this.field_f = new qqb();
            }
            this.field_f.a(param0, false);
          } else {
            this.field_f = null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("lbb.H(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(rsb param0, int param1, byte param2) {
        int var7 = 0;
        int stackIn_75_0 = 0;
        int stackIn_79_0 = 0;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        String stackIn_89_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int[] var5_ref_int__ = null;
        int var6 = 0;
        Random var6_ref_Random = null;
        int var8 = 0;
        int var9 = 0;
        rsb var10 = null;
        int[] var11 = null;
        int[] var13 = null;
        pe var14 = null;
        hkb var15 = null;
        hkb var16 = null;
        int[] var19 = null;
        int[] var23 = null;
        int[] var24 = null;
        int var5Lifetime1;
        int var8Lifetime1;
        int var8Lifetime2;
        var9 = VoidHunters.field_G;
        try {
          if (this.field_e > 0) {
            this.field_e = this.field_e - 1;
          }
          var14 = param0.field_g;
          this.field_a = this.field_a + 1;
          if (param2 != -19) {
            var10 = (rsb) null;
            this.a((rsb) null, -55, (byte) 8);
          }
          if (qrb.field_a == 1 &&
            5 != this.field_d) {
            for (var5 = 0; var5 < param0.field_c.length; var5++) {
              param0.a(var5, (byte) 59).field_g = null;
            }
          }
          if (this.field_d == 0) {
            if (this.field_e == 0) {
              stackIn_75_0 = (!ahb.a(param0, (byte) -106)) ? 0 : 1;
              var5Lifetime1 = stackIn_75_0;
              if (var5Lifetime1 == 0) {
                stackIn_79_0 = (!this.a(false, param0)) ? 0 : 1;
                var5Lifetime1 = stackIn_79_0;
              }
              if (var5Lifetime1 == 0) {
                return;
              }
              if (this.f(24416)) {
                this.c(3, -7, oq.field_j);
                return;
              }
              this.c(1, -7, oq.field_h);
              return;
            }
          } else {
            if (this.field_d == 1) {
              if (this.field_e > 0) {
                this.a(13, (byte) -126, sl.field_a, param0, 0, -1);
              }
              if (this.field_e != 0) {
                return;
              }
              var5Lifetime1 = param1;
              var6_ref_Random = new Random((long)var5Lifetime1);
              var23 = this.a(param0, (byte) -96);
              for (var8 = 0; var23.length > var8; var8++) {
                if (!tla.b(param2 ^ -110, var8)) {
                  var23[var8] = -1;
                }
              }
              var8Lifetime2 = sj.a(-126, 14, var6_ref_Random, true, var23);
              this.a(var5Lifetime1, 1, var8Lifetime2);
              this.c(2, -7, oq.field_z);
              return;
            }
            if (this.field_d == 2) {
              if (0 < this.field_e) {
                this.a(30, (byte) -128, ena.field_q, param0, 14, -2);
              }
              if (this.field_e != 0) {
                return;
              }
              var24 = this.a(param0, (byte) -95);
              this.a(var24, false);
              if (qab.a(82, this.field_i.field_b)) {
                this.c(3, -7, oq.field_j);
                return;
              }
              this.c(3, -7, oq.field_j);
              this.field_e = 0;
              return;
            }
            if (this.field_d == 3) {
              if (1 == dcb.field_f) {
                var19 = new int[2];
                var13 = var19;
                var11 = var13;
                var5_ref_int__ = var11;
                var6 = 1;
                for (var7 = 0; param0.field_c.length > var7; var7++) {
                  if (param0.field_c[var7].field_a ||
                    foa.field_p != 0) {
                    var8Lifetime1 = param0.a(var7, (byte) 59).field_h;
                    if (var8Lifetime1 >= 0 &&
                      var8Lifetime1 < var19.length) {
                      var11[var8Lifetime1] = var11[var8Lifetime1] + 1;
                    } else {
                      var6 = 0;
                    }
                  }
                }
                if (var6 != 0 &&
                  this.field_e > 0) {
                  this.field_e = this.field_e - 1;
                }
              }
              if (this.field_e == 0) {
                this.a(0, param0);
              }
              var14.a((byte) 127, param0);
              return;
            }
            if (this.field_d != 5) {
              if (this.field_d == 6) {
                if (0 != this.field_e) {
                  return;
                }
                if (null != this.field_f &&
                  !this.f(24416) &&
                  qab.a(81, var14.d(false))) {
                  var5Lifetime1 = this.field_f.a(true);
                  if (0 <= var5Lifetime1 &&
                    this.field_j.length > var5Lifetime1) {
                    this.field_j[var5Lifetime1] = this.field_j[var5Lifetime1] + 1;
                  }
                }
                if (unb.field_o) {
                  var16 = pba.b(false).a(3, false);
                  var16.a(true, param0, param2 ^ -112);
                } else {
                  var15 = bkb.a(0);
                  var15.a(true, param0, param2 ^ 104);
                }
                this.c(0, param2 ^ 20, oq.field_l * 1);
                if (0 != qv.field_o) {
                  return;
                }
                for (var5Lifetime1 = 0; var5Lifetime1 < param0.field_c.length; var5Lifetime1++) {
                  param0.a(var5Lifetime1, (byte) 59).field_h = -1;
                }
              }
            } else {
              var14.a((byte) 127, param0);
              if (this.a(false, param0)) {
                this.b(false, -1);
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_88_0 = var4;
          stackIn_88_1 = new StringBuilder().append("lbb.O(");
          if (param0 == null) {
            stackIn_89_2 = "null";
          } else {
            stackIn_89_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_88_0), ((StringBuilder) (Object) stackIn_88_1).append(stackIn_89_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public lbb() {
        this.field_j = new int[unb.field_p];
        this.field_e = 1 * oq.field_l;
        this.field_g = null;
        this.field_d = 0;
        this.field_a = 0;
        this.field_b = -1;
    }

    final void c(int param0, int param1, int param2) {
        this.field_d = param0;
        this.field_e = param2;
        if (param1 != ~this.field_d) {
          this.field_g = null;
        }
        this.field_a = 0;
    }

    static {
        field_h = "Email (Login):";
        field_c = "Scale down map height";
    }
}
