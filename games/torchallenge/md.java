/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class md implements Iterator {
    static ka field_b;
    static int field_i;
    static int field_h;
    private da field_g;
    private da field_c;
    static boolean field_a;
    static boolean field_f;
    private int field_d;
    private fd field_e;
    static qe field_j;

    public final Object next() {
        int fieldTemp$0 = 0;
        da stackIn_3_0 = null;
        da stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        RuntimeException decompiledCaughtException = null;
        da var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        da var1Lifetime1;
        var2 = TorChallenge.field_F ? 1 : 0;
        try {
          if (this.field_g != this.field_e.field_a[-1 + this.field_d]) {
            var1 = this.field_g;
            this.field_g = var1.field_f;
            this.field_c = var1;
            stackIn_3_0 = var1;
            return stackIn_3_0;
          }
          while (this.field_e.field_d > this.field_d) {
            fieldTemp$0 = this.field_d;
            this.field_d = this.field_d + 1;
            var1Lifetime1 = this.field_e.field_a[fieldTemp$0].field_f;
            if (var1Lifetime1 != this.field_e.field_a[-1 + this.field_d]) {
              this.field_c = var1Lifetime1;
              this.field_g = var1Lifetime1.field_f;
              stackIn_7_0 = var1Lifetime1;
              return stackIn_7_0;
            }
            if (var2 == 0) {
              continue;
            }
            break;
          }
          stackIn_10_0 = null;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1_ref), "md.next()");
        }
    }

    private final void a(int param0) {
        this.field_d = 1;
        this.field_c = null;
        if (param0 < 82) {
          return;
        }
        try {
          this.field_g = this.field_e.field_a[0].field_f;
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "md.C(" + param0 + ')');
        }
    }

    final static boolean a(byte param0) {
        RuntimeException var1 = null;
        boolean stackIn_18_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 69) {
            md.b(109);
          }
          if (bb.field_i == -1) {
            if (!pe.a((byte) 81, 1)) {
              return false;
            }
            bb.field_i = id.field_b.j(-116);
            id.field_b.field_q = 0;
          }
          if (bb.field_i == -2) {
            if (!pe.a((byte) 102, 2)) {
              return false;
            }
            bb.field_i = id.field_b.c(false);
            id.field_b.field_q = 0;
          }
          stackIn_18_0 = pe.a((byte) 75, bb.field_i);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "md.A(" + param0 + ')');
        }
    }

    public static void b(int param0) {
        if (param0 != -1) {
          return;
        }
        try {
          field_j = null;
          field_b = null;
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "md.B(" + param0 + ')');
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, vg param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_10_0 = false;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_24_2 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_45_0 = 0;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_9_0;
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
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int stackIn_35_0Lifetime1;
        int stackIn_35_1Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        var20 = TorChallenge.field_F ? 1 : 0;
        try {
          var5_int = sa.a((byte) 119, 3 * (param3 - param2));
          var6 = param2 * 3;
          var7 = -10 + var5_int;
          qc.b(0);
          if (0 < param4.field_s &&
            null != param4.field_z) {
            ef.c(-13730);
          }
          ni.field_f = 0;
          var8 = 0;
          var9 = 101 % ((param0 + 60) / 54);
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(param4.field_x > var8)))) {
            var10 = param4.field_i[var8];
            var11 = param4.field_w[var8];
            var12 = param4.field_F[var8];
            stackOut_9_0 = param1;
            stackIn_45_0 = stackOut_9_0 ? 1 : 0;
            stackIn_10_0 = stackOut_9_0;
            if (var20 == 0) {
              if (stackIn_10_0) {
                var13 = tj.field_a[var10];
                var14 = si.field_K[var10];
                var15 = -var13 + tj.field_a[var11];
                var16 = -var13 + tj.field_a[var12];
                var17 = si.field_K[var11] - var14;
                var18 = si.field_K[var12] - var14;
              }
              if (!stackIn_10_0 ||
                !(-(var16 * var17) + var15 * var18 >= 0)) {
                var13Lifetime1 = bg.field_O[var10];
                if (var13Lifetime1 != -2147483648) {
                  var14Lifetime1 = bg.field_O[var11];
                  if (-2147483648 != var14Lifetime1) {
                    var15 = bg.field_O[var12];
                    if (var15 != -2147483648) {
                      var16 = -var6 + (var15 + var14Lifetime1 + var13Lifetime1);
                      stackIn_23_0 = vf.field_b.length;
                      stackIn_23_1 = 1;
                      if (var7 < 0) {
                        stackIn_24_2 = var16 << -var7;
                      } else {
                        stackIn_24_2 = var16 >> var7;
                      }
                      var17 = stackIn_23_0 - (stackIn_23_1 + stackIn_24_2);
                      var18 = vf.field_b[var17];
                      while (true) {
                        if (var18 >> 4 != 0) {
                          var17--;
                          stackIn_35_0 = ~var17;
                          stackIn_35_1 = -1;
                          if (stackIn_35_0 > stackIn_35_1) {
                            System.err.println("Out of range!");
                            break;
                          }
                          var18 = vf.field_b[var17];
                          continue;
                        }
                        stackIn_35_0Lifetime1 = var17 << 4;
                        stackIn_35_1Lifetime1 = var18;
                        var19 = stackIn_35_0Lifetime1 + stackIn_35_1Lifetime1;
                        k.field_e[var19] = var8;
                        vf.field_b[var17] = 1 + var18;
                        if (0 < param4.field_s &&
                          param4.field_z != null) {
                          dupTemp$0 = param4.field_z[var8];
                          m.field_i[dupTemp$0] = m.field_i[dupTemp$0] + 1;
                        }
                        ni.field_f = ni.field_f + 1;
                        break;
                      }
                    }
                  }
                }
              }
              var8++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_45_0 = -1;
          }
          if (stackIn_45_0 > ~param4.field_s &&
            null != param4.field_z) {
            var8Lifetime1 = 0;
            var9Lifetime1 = 0;
            while (!(m.field_i.length <= var9Lifetime1)) {
              var10Lifetime1 = m.field_i[var9Lifetime1];
              m.field_i[var9Lifetime1] = var8Lifetime1;
              var8Lifetime1 = var8Lifetime1 + var10Lifetime1;
              var9Lifetime1++;
              if (var20 != 0) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_59_0 = var5;
          stackIn_59_1 = new StringBuilder().append("md.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(')').toString());
        }
    }

    public final boolean hasNext() {
        int fieldTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        var2 = TorChallenge.field_F ? 1 : 0;
        try {
          if (this.field_g != this.field_e.field_a[this.field_d - 1]) {
            return true;
          }
          while (this.field_e.field_d > this.field_d) {
            fieldTemp$0 = this.field_d;
            this.field_d = this.field_d + 1;
            if (this.field_e.field_a[fieldTemp$0].field_f != this.field_e.field_a[-1 + this.field_d]) {
              this.field_g = this.field_e.field_a[this.field_d - 1].field_f;
              return true;
            }
            this.field_g = this.field_e.field_a[this.field_d - 1];
            if (var2 == 0) {
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "md.hasNext()");
        }
    }

    public final void remove() {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (this.field_c == null) {
            throw new IllegalStateException();
          }
          this.field_c.a(true);
          this.field_c = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "md.remove()");
        }
    }

    md(fd param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_c = null;
        try {
          this.field_e = param0;
          this.a(101);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("md.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_a = false;
        field_i = -1;
        field_h = 480;
    }
}
