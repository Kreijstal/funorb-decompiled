/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ae extends ca implements ke {
    static Calendar field_ib;
    private hf field_fb;
    static nh[] field_hb;
    static String field_jb;
    static int field_kb;
    static int field_gb;
    static he[] field_lb;

    ae(k param0, ia param1) {
        super(param0, 200, 150);
        Object var3 = null;
        vg var4 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = null;
          if (rk.field_b != param1) {
            if (param1 == uf.field_a) {
              var3 = o.field_f;
              this.field_k = this.field_k + 10;
              if (l.b(-1)) {
                this.field_k = this.field_k + 20;
                var3 = ei.field_j;
              }
            } else {
              if (param1 == bk.field_e) {
                var3 = de.field_z;
                this.field_k = this.field_k + 30;
              }
            }
          } else {
            var3 = of.field_u;
          }
          var4 = new vg((String) (var3), (fd) null);
          var4.field_w = this.field_w;
          var4.field_k = 80;
          var4.field_m = 50;
          var4.field_o = 0;
          var4.field_l = (cg) ((Object) new l(u.field_d, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.b(var4, (byte) 121);
          this.field_fb = this.a((fd) (this), ei.field_h, 10);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("ae.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ie.a((Throwable) (stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void n(int param0) {
        field_lb = null;
        field_ib = null;
        if (param0 != 1) {
          ae.a(53, -128, 35, 24, true, 96, 70);
        }
        field_hb = null;
        field_jb = null;
    }

    public final void a(int param0, int param1, boolean param2, hf param3, int param4) {
        hf discarded$1 = null;
        String var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (!param2) {
            var7 = (String) null;
            discarded$1 = this.a((fd) null, (String) null, -72);
          }
          if (this.field_fb == param3) {
            this.o(0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("ae.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
        int var11 = 0;
        int incrementValue$0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var14 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (param6 <= param5) {
            return;
          }
          if (param3 <= param5 + 1) {
            return;
          }
          if (5 + param5 < param3 &&
            param1 != param2) {
            var7_int = (param1 >> 1) + (param2 >> 1) + (1 & (param1 & param2));
            var8 = param5;
            var9 = param1;
            var10 = param2;
            for (var11 = param5; var11 < param3; var11++) {
              var12 = bj.field_a[var11];
              if (!param4) {
                stackIn_24_0 = kf.field_c[var12];
              } else {
                stackIn_24_0 = rc.field_i[var12];
              }
              var13 = stackIn_24_0;
              if (var7_int < var13) {
                bj.field_a[var11] = bj.field_a[var8];
                incrementValue$0 = var8;
                var8++;
                bj.field_a[incrementValue$0] = var12;
                if (var13 < var9) {
                  var9 = var13;
                }
              } else {
                if (var10 < var13) {
                  var10 = var13;
                }
              }
            }
            ae.a(param0 + 0, param1, var9, var8, param4, param5, param6);
            ae.a(param0, var10, param2, param3, param4, var8, param6);
            return;
          }
          for (var7_intLifetime1 = -1 + param3; param5 < var7_intLifetime1; var7_intLifetime1--) {
            for (var8Lifetime1 = param5; var7_intLifetime1 > var8Lifetime1; var8Lifetime1++) {
              var9Lifetime1 = bj.field_a[var8Lifetime1];
              var10Lifetime1 = bj.field_a[1 + var8Lifetime1];
              if (oa.a((byte) 123, var10Lifetime1, var9Lifetime1, param4)) {
                bj.field_a[var8Lifetime1] = var10Lifetime1;
                bj.field_a[1 + var8Lifetime1] = var9Lifetime1;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var7), "ae.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    private final hf a(fd param0, String param1, int param2) {
        hf var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        hf stackIn_2_0 = null;
        hf stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new hf(param1, param0);
          var4.field_l = (cg) ((Object) new ie());
          var5 = this.field_k - 6;
          this.field_k = this.field_k + 38;
          var4.a(var5, 30, 15, 16535, -14 + this.field_w - 16);
          if (param2 != 10) {
            stackIn_2_0 = (hf) null;
            return stackIn_2_0;
          }
          this.b(var4, (byte) 63);
          this.e((byte) 64);
          stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("ae.E(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void o(int param0) {
        if (!this.field_Q) {
          return;
        }
        if (param0 != 0) {
          return;
        }
        this.field_Q = false;
    }

    static {
        field_jb = "Password is valid";
        field_ib = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field_gb = 0;
    }
}
