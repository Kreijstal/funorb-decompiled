/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fq extends ea implements Cloneable {
    fb field_I;
    private int field_v;
    private transient int field_E;
    int field_u;
    transient int field_w;
    transient int field_t;
    static int field_D;
    transient int field_A;
    static volatile int field_C;
    transient int field_B;
    private transient boolean field_y;
    static wg field_x;
    static String field_z;
    private transient int field_F;
    static String field_G;
    private transient mi field_H;

    final static void a(int param0, java.awt.Canvas param1) {
        rh.a(-1, (java.awt.Component) ((Object) param1));
        ji.a(-110, (java.awt.Component) ((Object) param1));
        if (param0 >= -29) {
          return;
        }
        try {
          if (ok.field_g != null) {
            ok.field_g.a((byte) 55, (java.awt.Component) ((Object) param1));
          }
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "fq.TC(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final sl a(f[][] param0, int param1, boolean param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_11_1 = 0;
        sl stackIn_13_0 = null;
        sl stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!vh.field_a ||
            2 == this.field_u) {
            qp.field_f = false;
          }
          if (0 > param5) {
            stackIn_11_1 = 4;
          } else {
            if (param5 > 0) {
              stackIn_11_1 = 5;
            } else {
              if (param3 >= 0) {
                stackIn_11_1 = 7;
              } else {
                stackIn_11_1 = 6;
              }
            }
          }
          this.d(stackIn_11_1, 1, -9634);
          if (!param2) {
            stackIn_15_0 = super.a(param0, param1, false, param3, param4, param5);
            return stackIn_15_0;
          }
          stackIn_13_0 = (sl) null;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_18_0 = var7;
          stackIn_18_1 = new StringBuilder().append("fq.R(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final f e(int param0, int param1, f[][] param2, int param3) {
        f var5 = null;
        de var6 = null;
        de var7 = null;
        int var8 = 0;
        f stackIn_3_0 = null;
        f stackIn_8_0 = null;
        f stackIn_12_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = CrazyCrystals.field_B;
        try {
          if (param3 < 120) {
            stackIn_3_0 = (f) null;
            return stackIn_3_0;
          }
          var5 = this.field_l;
          while (true) {
            if (var5 instanceof ma) {
              stackIn_8_0 = this.a(param2, param0, (f) (this), 11460, param1);
              return stackIn_8_0;
            }
            if (!(var5 instanceof de)) {
              if (var5 instanceof pn) {
                var5 = ((pn) (var5)).field_l;
                continue;
              }
            } else {
              var6 = (de) (var5);
              if (var6.field_j == null) {
                fn.field_j = fn.field_j + 20;
                mb.field_g = mb.field_g + 20;
                var7 = new de();
                var7.a((byte) 72, (f) (this));
                stackIn_12_0 = this.a(param2, param0, var7, 11460, param1);
                return stackIn_12_0;
              }
            }
            break;
          }
          return (f) (this);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_20_0 = var5_ref;
          stackIn_20_1 = new StringBuilder().append("fq.OA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(')').toString());
        }
    }

    private final boolean a(int param0, int param1, byte param2, f[][] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        gh var6 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = 109 / ((param2 + 54) / 45);
          if (!(param3[param1][param0] instanceof gh)) {
            return false;
          }
          var6 = (gh) (param3[param1][param0]);
          if (0 == var6.field_x) {
            return false;
          }
          if (param3[param1 - 1][param0].a(16736352, param3, true, -1, param1, param0, var6, 0)) {
            return false;
          }
          if (!param3[param1 + 1][param0].a(16736352, param3, true, 1, param1, param0, var6, 0)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("fq.RC(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final f b(f[][] param0, int param1, byte param2, int param3) {
        int var10 = 0;
        f stackIn_35_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        mi var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        mi var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var5_intLifetime1;
        int var9Lifetime1;
        var11 = CrazyCrystals.field_B;
        try {
          if (null != this.field_I) {
            return (f) (this);
          }
          this.field_l.a(this, 127);
          if (!this.a(param3, this.field_w, 49, param1, param0)) {
            this.field_y = true;
          }
          if (this.i(12555)) {
            this.d(mb.field_c[this.field_w], 0, -9634);
          }
          boolean decompiledFrameRemainder0 = true;
          if (this.field_w < 4) {
            if (this.field_F < 180) {
              this.a((byte) -128, param0);
              var5_int = -1 / ((-43 - param2) / 51);
              return super.b(param0, param1, (byte) 43, param3);
            }
            var5 = this.g(param1, param3 - 1, param0, 98);
            var6 = this.g(param1, 1 + param3, param0, 109);
            if (var5 != null && (var6 == null ||
              Math.random() < 0.5)) {
              this.d(17, 99, -9634);
              this.field_H = var5;
              this.field_H.field_C = this;
              decompiledFrameRemainder0 = false;
            }
            else {
              if (var6 == null) {
                if (this.field_F == 360) {
                  var7 = 0;
                  var8 = 0;
                  for (var9 = 0; 8 > var9; var9++) {
                    if (this.a(param3, var9 + 8, 105, param1, param0)) {
                      var8 = var8 | 1 << var9;
                      var7++;
                    }
                  }
                  var9Lifetime1 = (int)(0.01 + (-0.02 + (double)var7) * Math.random());
                  for (var10 = 0; var10 <= var9Lifetime1; var10++) {
                    if ((1 << var10 & var8) == 0) {
                      var9Lifetime1++;
                    }
                  }
                  this.d(8 + var9Lifetime1, hp.field_m[8 + var9Lifetime1], -9634);
                }
              } else {
                this.d(16, 99, -9634);
                this.field_H = var6;
                this.field_H.field_z = this;
              }
            }
          }
          this.a((byte) -128, param0);
          var5_intLifetime1 = -1 / ((-43 - param2) / 51);
          stackIn_35_0 = super.b(param0, param1, (byte) 43, param3);
          return stackIn_35_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_38_0 = var5_ref;
          stackIn_38_1 = new StringBuilder().append("fq.B(");
          if (param0 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(int param0, f[][] param1, boolean param2, int param3, int param4, int param5, ea param6, int param7) {
        RuntimeException var9 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 16736352) {
            stackIn_4_0 = this.field_l.a(param0 + 0, param1, param2, param3, param4, param5, param6, param7);
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_7_0 = var9;
          stackIn_7_1 = new StringBuilder().append("fq.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param7).append(')').toString());
        }
    }

    final boolean b(byte param0) {
        if (param0 < 43) {
          return false;
        }
        return this.field_l.b((byte) 53);
    }

    final void d(int param0, int param1, int param2) {
        if (param2 != -9634) {
          ea var5 = (ea) null;
          this.a(-45, (f[][]) null, false, -6, 34, -108, (ea) null, -128);
        }
        this.e((byte) -126);
        this.field_F = 0;
        this.field_E = param1;
        this.field_B = 0;
        this.field_w = param0;
        this.field_y = false;
    }

    final f a(f[][] param0, int param1, f param2, int param3, int param4) {
        vh dupTemp$0 = null;
        f stackIn_3_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var6_intLifetime1;
        int var7Lifetime1;
        var8 = CrazyCrystals.field_B;
        try {
          if (param3 != 11460) {
            stackIn_3_0 = (f) null;
            return stackIn_3_0;
          }
          if (this.field_I == null) {
            mb.field_g = mb.field_g + 11;
            fn.field_j = fn.field_j + 11;
            wd.field_j = wd.field_j - 1;
            mb.field_g = mb.field_g - ob.field_l;
            we.field_h = we.field_h + 28;
            fp.field_a = fp.field_a + 28;
            je.field_j = je.field_j + 14;
            b.field_a = b.field_a + 14;
            this.e((byte) 76);
            if (ab.field_D == null &&
              param2 != null) {
              var6_int = param2.a(false);
              for (var7 = 0; var7 < 3; var7++) {
                if (~this.field_u != ~var7 &&
                  0 != (var6_int & 1 << var7)) {
                  dupTemp$0 = q.field_a[var7];
                  dupTemp$0.field_l = dupTemp$0.field_l + 1;
                }
              }
            }
            oe.field_a[this.field_u] = null;
            if (null == ab.field_D) {
              q.field_a[this.field_u].field_h = true;
            }
            qh.field_o.addElement(this);
            var6_intLifetime1 = 1;
            for (var7Lifetime1 = 0; var7Lifetime1 < 3; var7Lifetime1++) {
              if (oe.field_a[var7Lifetime1] == null) {
                continue;
              }
              var6_intLifetime1 = 0;
              break;
            }
            if (var6_intLifetime1 != 0) {
              var9 = (String) null;
              um.a(0, (String) null, (byte) 124);
            }
            this.field_I = gg.a(this, (byte) 119, param2, param0);
          }
          return (f) (this);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_31_0 = var6;
          stackIn_31_1 = new StringBuilder().append("fq.VA(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        int var8;
        var8 = CrazyCrystals.field_B;
        if (this.field_I == null) {
          if (24 == param2 &&
            param3 == 24) {
            this.h(-110).c(param1, -param3 + param4, ek.field_f[this.field_u]);
          } else {
            this.h(-62).b(param1, -param3 + param4, param2 * 2, param3 * 3, ek.field_f[this.field_u]);
          }
        } else {
          this.field_I.a(false, param2, param3, (byte) -107, false, param1, param4);
        }
        if (param5 != 4261) {
          this.a(false, -26, -116, 104, 89, -124);
        }
    }

    final f a(f[][] param0, f param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        f stackIn_3_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (2 * this.field_m >= this.field_p) {
            stackIn_3_0 = this.a(-this.field_s + param2, param3 - this.field_o, param1, -117, param0);
            return stackIn_3_0;
          }
          if (!param4) {
            this.field_u = 109;
          }
          return (f) (this);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("fq.GB(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final int d(byte param0) {
        if (param0 > -40) {
          return 72;
        }
        if (vh.field_a &&
          this.field_u != 2) {
          return -1;
        }
        return -3;
    }

    fq(f param0, int param1, int param2, int param3) {
        super(param0);
        this.field_E = 0;
        this.field_w = 3;
        this.field_I = null;
        this.field_B = 0;
        this.field_y = false;
        this.field_F = 0;
        this.field_H = null;
        try {
          this.field_A = param2;
          this.field_u = param1;
          this.field_t = param3;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "fq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void f(int param0, int param1, f[][] param2, int param3) {
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = CrazyCrystals.field_B;
        try {
          if (param0 != 1) {
            this.f(101, -113, (f[][]) null, -55);
          }
          var5_int = 0;
          var6 = 0;
          if (vh.field_a &&
            this.field_u != 2) {
            if (this.field_v == 24) {
              var6++;
            }
            if (this.field_v == 74) {
              var5_int--;
            }
            if (25 == this.field_v) {
              var6--;
            }
            if (this.field_v == 87) {
              var5_int++;
            }
            this.field_v = this.field_v + 1;
            if (this.field_v == 124) {
              this.field_v = 0;
            }
          } else {
            if (cp.field_k[bm.field_e[this.field_u][0]]) {
              var5_int--;
            }
            if (cp.field_k[bm.field_e[this.field_u][2]]) {
              var6--;
            }
            if (cp.field_k[bm.field_e[this.field_u][1]]) {
              var5_int++;
            }
            if (cp.field_k[bm.field_e[this.field_u][3]]) {
              var6++;
            }
          }
          if (0 > var5_int &&
            param2[param1][-1 + param3].a((byte) -21, param2, param3, 0, param1, this, -1)) {
            this.a(param2, param1, false, 0, param3, -1);
            return;
          }
          if (var5_int > 0 &&
            param2[param1][param3 + 1].a((byte) -21, param2, param3, 0, param1, this, 1)) {
            this.a(param2, param1, false, 0, param3, 1);
            return;
          }
          if (var6 < 0 &&
            param2[-1 + param1][param3].a((byte) -21, param2, param3, -1, param1, this, 0)) {
            this.a(param2, param1, false, -1, param3, 0);
            return;
          }
          if (var6 > 0 &&
            param2[1 + param1][param3].a((byte) -21, param2, param3, 1, param1, this, 0)) {
            this.a(param2, param1, false, 1, param3, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_47_0 = var5;
          stackIn_47_1 = new StringBuilder().append("fq.LA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_48_2 = "null";
          } else {
            stackIn_48_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_47_0), ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(',').append(param3).append(')').toString());
        }
    }

    final f a(int param0, int param1, f[][] param2, int param3, int param4, int param5, ea param6) {
        RuntimeException var8 = null;
        f stackIn_2_0 = null;
        f stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 == -31135) {
            stackIn_4_0 = this.a(param4, param1, param6, param3 + 31015, param2);
            return stackIn_4_0;
          }
          stackIn_2_0 = (f) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("fq.P(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final boolean a(byte param0, f[][] param1, f param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 42) {
            this.a((f[][]) null, -104, 91, false);
          }
          if (!this.field_l.b((byte) 66)) {
            return false;
          }
          this.a(param1, this.field_t, new ig(param2, (dl[]) null, (f) null, false), param0 + 11418, this.field_A);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("fq.FB(").append(param0).append(',');
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
          throw dn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final nj a(int param0, nj param1) {
        int var4_int = 0;
        nj stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        int var7 = 0;
        var7 = CrazyCrystals.field_B;
        try {
          var3_int = 0;
          for (var4_int = 0; var4_int < 3; var4_int++) {
            if (q.field_a[var4_int].field_b) {
              var3_int++;
            }
          }
          if (param0 != 23525) {
            field_z = (String) null;
          }
          if (!vh.field_a) {
            var6 = qa.field_h;
            var5 = var6;
            var5 = var6;
            if (var3_int <= 1) {
              var4 = g.field_c;
              var5 = p.field_h;
            } else {
              var4 = q.field_c[this.field_u];
              var5 = fh.field_j;
            }
          } else {
            if (2 != this.field_u) {
              var4 = q.field_c[this.field_u];
              var5 = pl.field_s;
              var6 = en.field_F;
            } else {
              var6 = ol.field_E;
              var4 = g.field_c;
              var5 = p.field_h;
            }
          }
          stackIn_17_0 = ng.a(var4, param1, new fq(new kp(-1), this.field_u, 0, 0), (byte) -83, var5 + "<br><br>" + var6);
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("fq.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final f a(sl param0, f[][] param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        f stackIn_2_0 = null;
        f stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          wd.field_j = wd.field_j - 1;
          if (param4 != 17512) {
            stackIn_2_0 = (f) null;
            return stackIn_2_0;
          }
          fn.field_j = fn.field_j + ob.field_l;
          this.field_A = param6;
          this.field_t = param3;
          fn.field_j = fn.field_j + wd.field_j;
          ob.field_l = ob.field_l - 1;
          stackIn_4_0 = super.a(param0, param1, param2, param3, 17512, param5, param6);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("fq.I(");
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
          throw dn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static boolean a(int param0, byte param1) {
        try {
          int var2 = 0;
          int var3_int = 0;
          Throwable decompiledCaughtException = null;
          IOException var3 = null;
          if (kd.field_n.field_f >= param0) {
            return true;
          }
          if (oi.field_c == null) {
            return false;
          }
          var2 = 43 / ((-3 - param1) / 34);
          try {
            var3_int = oi.field_c.c(0);
            if (var3_int > 0) {
              if (param0 - kd.field_n.field_f < var3_int) {
                var3_int = -kd.field_n.field_f + param0;
              }
              oi.field_c.a(kd.field_n.field_h, var3_int, 2034, kd.field_n.field_f);
              wg.field_y = lo.a((byte) -60);
              kd.field_n.field_f = kd.field_n.field_f + var3_int;
              if (param0 > kd.field_n.field_f) {
                return false;
              }
              kd.field_n.field_f = 0;
              return true;
            }
            if (0 <= var3_int &&
              30000L >= wd.d(-1322)) {
              return false;
            }
            jj.a(4);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (IOException) (Object) decompiledCaughtException;
            jj.a(4);
          }
          return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void c(int param0, int param1, f[][] param2, int param3) {
        pn var5 = null;
        int var6 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var6 = CrazyCrystals.field_B;
        try {
          if (param1 != 0) {
            return;
          }
          if (this.field_I != null) {
            this.field_I = this.field_I.a(124);
            if (this.field_I != null) {
              return;
            }
            if ((this.field_s | this.field_o) != 0) {
              this.a(param3, param2, param0, (byte) -115);
            }
            if (this != param2[param0][param3]) {
              var5 = (pn) (param2[param0][param3]);
              while (var5.field_l != this) {
                var5 = (pn) (var5.field_l);
              }
              var5.field_l = this.field_l;
            } else {
              param2[param0][param3] = this.field_l;
            }
            qh.field_o.removeElement(this);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_19_0 = var5_ref;
          stackIn_19_1 = new StringBuilder().append("fq.W(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, String param1) {
        try {
          qn.field_z = param1;
          int var2_int = -64 / ((-73 - param0) / 44);
          rc.a(-25537, 12);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "fq.PC(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void e(byte param0) {
        int var2;
        var2 = -37 / ((param0 + 26) / 56);
        if (null != this.field_H) {
          if (this.field_H.field_z == this) {
            this.field_H.field_z = null;
          } else {
            if (this.field_H.field_C == this) {
              this.field_H.field_C = null;
            }
          }
          this.field_H = null;
        }
    }

    final void c(boolean param0, boolean param1) {
        if (param1) {
          return;
        }
        if (vh.field_a &&
          2 != this.field_u) {
          return;
        }
        if (!param0) {
          return;
        }
        oe.field_a[this.field_u] = this;
        q.field_a[this.field_u].field_b = true;
    }

    final boolean a(mj param0, boolean param1, f[][] param2) {
        RuntimeException var4 = null;
        f var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            return true;
          }
          var5 = (f) null;
          this.a((f[][]) null, 18, (f) null, 35, -62);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("fq.PA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final f a(int param0, int param1, f[][] param2, f param3, byte param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        f stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          we.field_h = we.field_h + 20;
          var6_int = 78 % ((param4 - 73) / 42);
          je.field_j = je.field_j + 10;
          fp.field_a = fp.field_a + 20;
          b.field_a = b.field_a + 10;
          mb.field_g = mb.field_g - 10;
          fn.field_j = fn.field_j - 10;
          stackIn_1_0 = this.a(param0, param1, param3, 6, param2);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_4_0 = var6;
          stackIn_4_1 = new StringBuilder().append("fq.L(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param4).append(')').toString());
        }
    }

    final int a(boolean param0, int param1) {
        boolean discarded$0 = false;
        if (param0) {
          return 3;
        }
        if (param1 != 0) {
          discarded$0 = this.a(95, -64, (byte) 36, (f[][]) null);
          return 0;
        }
        return 0;
    }

    private final mi g(int param0, int param1, f[][] param2, int param3) {
        mi var5 = null;
        RuntimeException var5_ref = null;
        mi stackIn_2_0 = null;
        mi stackIn_8_0 = null;
        Object stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 <= 96) {
            stackIn_2_0 = (mi) null;
            return stackIn_2_0;
          }
          if (!(param2[param0][param1] instanceof mi)) {
            stackIn_10_0 = null;
            return (mi) (stackIn_10_0);
          }
          var5 = (mi) (param2[param0][param1]);
          if (0 != (var5.field_o | var5.field_s)) {
            return null;
          }
          stackIn_8_0 = var5;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_13_0 = var5_ref;
          stackIn_13_1 = new StringBuilder().append("fq.CD(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, f[][] param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException runtimeException = null;
        fq var7 = null;
        int var8 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = CrazyCrystals.field_B;
        try {
          if (param0 != -35) {
            this.e((byte) -95);
          }
          this.field_A = param2;
          this.field_t = param3;
          if (param1 != null) {
            for (var5_int = 0; var5_int < param1.length; var5_int++) {
              for (var6 = 0; var6 < param1[0].length; var6++) {
                if ((var6 != param2 ||
                  var5_int != param3) &&
                  param1[var5_int][var6] instanceof fq) {
                  var7 = (fq) (param1[var5_int][var6]);
                  if (this.field_u == var7.field_u) {
                    param1[var5_int][var6] = var7.field_l;
                  }
                }
              }
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_20_0 = runtimeException;
          stackIn_20_1 = new StringBuilder().append("fq.KC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, boolean param4) {
        this.field_I.a(param4, param2, param0, (byte) -126, false, param1, param3);
    }

    final boolean i(int param0) {
        if (!this.field_y) {
          if (this.field_w < 4) {
            this.field_F = this.field_F + 1;
          }
          this.field_B = this.field_B + 1;
          if (this.field_B >= bp.field_c[this.field_w] << uc.field_c[this.field_w]) {
            this.field_B = fg.field_j[this.field_w] << uc.field_c[this.field_w];
            if (this.field_B < 0) {
              return true;
            }
            if (this.field_E > 0) {
              this.field_E = this.field_E - 1;
              if (0 == this.field_E) {
                this.field_y = true;
              }
            }
          }
        } else {
          this.field_B = this.field_B - 1;
          if (this.field_B < 0) {
            return true;
          }
        }
        if (param0 == 12555) {
        }
        return false;
    }

    final void a(f[][] param0, int param1, int param2, boolean param3) {
        if (null != this.field_I) {
          return;
        }
        try {
          super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "fq.UA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final int b(int param0) {
        if (param0 != -3445) {
          field_G = (String) null;
        }
        return tm.field_e;
    }

    final f a(mj param0, byte param1, boolean param2, f[][] param3) {
        Object var5 = null;
        ma stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -74) {
            this.f(115, -99, (f[][]) null, -6);
          }
          var5 = this;
          if (param2 &&
            this.field_p >= 2 * this.field_m) {
            var5 = this.a(param0.field_c, param0.field_b, param0.field_a, 122, param3);
          }
          stackIn_7_0 = new ma(param0.b((byte) 84), (f) (var5), param0);
          return (f) ((Object) stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("fq.S(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dn.a((Throwable) (stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final boolean a(int param0, int param1, int param2, int param3, f[][] param4) {
        boolean stackIn_15_0 = false;
        boolean stackIn_19_0 = false;
        boolean stackIn_21_0 = false;
        boolean stackIn_23_0 = false;
        boolean stackIn_27_0 = false;
        boolean stackIn_31_0 = false;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        qf var8 = null;
        var7 = CrazyCrystals.field_B;
        try {
          var6_int = param1;
          if (var6_int == 12) {
            if (!(param4[-1 + param3][param0] instanceof qf)) {
              return false;
            }
            var8 = (qf) (param4[param3 - 1][param0]);
            stackIn_15_0 = ((var8.field_o | var8.field_s) == 0);
            return stackIn_15_0;
          }
          if (var6_int == 14) {
            stackIn_19_0 = this.a(-1 + param0, param3, (byte) 87, param4);
            return stackIn_19_0;
          }
          if (var6_int == 13) {
            stackIn_21_0 = this.a(param0 + 1, param3, (byte) 39, param4);
            return stackIn_21_0;
          }
          if (var6_int == 15) {
            stackIn_23_0 = this.field_l instanceof pf;
            return stackIn_23_0;
          }
          if (var6_int == 17) {
            stackIn_27_0 = (null != this.g(param3, -1 + param0, param4, 124));
            return stackIn_27_0;
          }
          if (16 == var6_int) {
            stackIn_31_0 = (this.g(param3, param0 + 1, param4, 100) != null);
            return stackIn_31_0;
          }
          if (param2 >= 44) {
            return true;
          }
          fq.a(-24, (byte) -122);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_38_0 = var6;
          stackIn_38_1 = new StringBuilder().append("fq.ED(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(')').toString());
        }
    }

    final int a(boolean param0) {
        if (param0) {
          return -14;
        }
        return 1 << this.field_u;
    }

    private final void a(byte param0, f[][] param1) {
        am stackIn_38_0 = null;
        int stackIn_39_1 = 0;
        am stackIn_45_0 = null;
        int stackIn_46_1 = 0;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_66_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = CrazyCrystals.field_B;
        try {
          if (param0 >= -110) {
            this.a((f[][]) null, 107, true, -13, -41, 97);
          }
          var3_int = this.field_w;
          if (var3_int != 4 &&
            var3_int != 5 &&
            6 != var3_int &&
            7 != var3_int) {
            if (9 != var3_int &&
              var3_int != 10) {
              if (var3_int == 12) {
                if (36 != this.field_B) {
                  return;
                }
                if (this.field_E != 2) {
                  return;
                }
                rb.field_g.a(128, this.field_A * 12, -6 + 12 * this.field_t, 60, (byte) -111);
                return;
              }
              if (var3_int == 13) {
                if (this.field_B != 28 &&
                  this.field_B != 34) {
                  return;
                }
                stackIn_38_0 = cb.field_n;
                if (this.field_B == 28) {
                  stackIn_39_1 = 128;
                } else {
                  stackIn_39_1 = 96;
                }
                ((am) (Object) stackIn_38_0).a(stackIn_39_1, 6 + this.field_A * 12, 12 * this.field_t, 60, (byte) -111);
                return;
              }
              if (var3_int == 14) {
                if (this.field_B != 28 &&
                  34 != this.field_B) {
                  return;
                }
                stackIn_45_0 = cb.field_n;
                if (this.field_B != 28) {
                  stackIn_46_1 = 96;
                } else {
                  stackIn_46_1 = 128;
                }
                ((am) (Object) stackIn_45_0).a(stackIn_46_1, 12 * this.field_A - 6, this.field_t * 12, 60, (byte) -111);
                return;
              }
              if (15 == var3_int) {
                if (this.field_B != 0 &&
                  this.field_B != 48) {
                  return;
                }
                ln.field_f.a(48, this.field_A * 12, 12 * this.field_t, 60, (byte) -111);
                return;
              }
              if (var3_int == 16) {
                if (this.field_B == 30) {
                  oj.field_E.a(128, 12 * this.field_A + 9, 12 * this.field_t, 60, (byte) -111);
                  return;
                }
                if (this.field_B != 36) {
                  return;
                }
                if (this.field_E != 97) {
                  return;
                }
                c.field_q.a(128, this.field_A * 12 + 3, this.field_t * 12, 60, (byte) -111);
                return;
              }
              if (var3_int != 17) {
                return;
              }
              if (this.field_B == 30) {
                oj.field_E.a(128, this.field_A * 12 - 9, 12 * this.field_t, 60, (byte) -111);
                return;
              }
              if (36 != this.field_B) {
                return;
              }
              if (this.field_E != 97) {
                return;
              }
              c.field_q.a(128, -3 + this.field_A * 12, this.field_t * 12, 60, (byte) -111);
              return;
            }
            if (this.field_B == 10) {
              this.field_l.a(-29660, this.field_t * 12, this.field_A * 12);
              return;
            }
            return;
          }
          if (2 != this.field_B) {
            if (this.field_B == 8) {
              param1[this.field_t + this.field_s][this.field_A + this.field_o].a(-29660, this.field_t * 12 + this.field_s * this.field_m, this.field_m * this.field_o + this.field_A * 12);
            }
          } else {
            this.field_l.a(-29660, this.field_t * 12 + this.field_s * this.field_m, this.field_o * this.field_m + this.field_A * 12);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_65_0 = var3;
          stackIn_65_1 = new StringBuilder().append("fq.UC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_66_2 = "null";
          } else {
            stackIn_66_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_65_0), ((StringBuilder) (Object) stackIn_65_1).append(stackIn_66_2).append(')').toString());
        }
    }

    final void c(int param0, int param1, int param2) {
        this.field_A = param0;
        this.field_t = param2;
        if (param1 != -5) {
          this.field_u = -80;
        }
    }

    public static void b(boolean param0) {
        field_G = null;
        field_z = null;
        field_x = null;
        if (!param0) {
          fq.a(29, (byte) -86);
        }
    }

    final dl h(int param0) {
        if (param0 > -2) {
          this.d(102, -119, -74);
        }
        return vj.field_a[this.field_w][this.field_B >> uc.field_c[this.field_w]];
    }

    static {
        field_C = -1;
        field_z = "OVER <%0>";
        field_G = "Arcade Highscores";
    }
}
