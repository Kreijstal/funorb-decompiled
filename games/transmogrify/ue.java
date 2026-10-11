/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class ue {
    static int field_a;
    ol[] field_b;
    static ii[] field_c;

    final int a(int param0) {
        int stackIn_6_0 = 0;
        if (param0 <= 124) {
          this.b(-103, -63);
        }
        if (null != this.field_b &&
          this.field_b.length > 0) {
          stackIn_6_0 = this.field_b[-1 + this.field_b.length].field_f - this.field_b[0].field_a;
        } else {
          stackIn_6_0 = 0;
        }
        return stackIn_6_0;
    }

    final int c(int param0, int param1) {
        int var4 = 0;
        ol var5 = null;
        int var6 = Transmogrify.field_A ? 1 : 0;
        ol[] var7 = this.field_b;
        ol[] var3 = var7;
        for (var4 = param0; var7.length > var4; var4++) {
          var5 = var7[var4];
          if (!(param1 >= var5.field_g.length)) {
            return var5.field_g[param1];
          }
          param1 = param1 - (var5.field_g.length - 1);
        }
        return 0;
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 != 18) {
          field_a = -77;
        }
    }

    final int b(byte param0) {
        int var5 = 0;
        int var2;
        int var3;
        ol[] var4;
        ol var6;
        int var8;
        int var7;
        var8 = Transmogrify.field_A ? 1 : 0;
        var2 = 119 / ((param0 - 61) / 46);
        var3 = -1;
        if (this.field_b != null) {
          var4 = this.field_b;
          for (var5 = 0; var5 < var4.length; var5++) {
            var6 = var4[var5];
            if (var6 != null) {
              var7 = var6.a(-44);
              if (var3 < var7) {
                var3 = var7;
              }
            }
          }
        }
        return var3;
    }

    final static void b(int param0) {
        int incrementValue$0 = 0;
        String stackIn_13_0 = null;
        String stackIn_23_0 = null;
        String stackIn_34_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        sj var1 = null;
        RuntimeException var1_ref = null;
        int var2_int = 0;
        sj var2 = null;
        sj var3 = null;
        int var3_int = 0;
        String var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        sj var6 = null;
        String var7 = null;
        sj var8 = null;
        String var9 = null;
        sj var10 = null;
        String var11 = null;
        sj var12 = null;
        sj var3Lifetime1;
        String var3_refLifetime1;
        String var3_refLifetime2;
        int var1_intLifetime1;
        int var1_intLifetime2;
        int var1_intLifetime3;
        int var2_intLifetime1;
        int var2_intLifetime2;
        int var2_intLifetime3;
        int var3_intLifetime1;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          if (2 > va.field_j) {
            throw new RuntimeException();
          }
          for (var1_int = 0; var1_int < 12; var1_int++) {
            var6 = od.field_g.field_e[var1_int];
            if (var6 != null) {
              if (var6.field_o == od.field_g &&
                var1_int == var6.field_t) {
                stackIn_13_0 = "";
              } else {
                stackIn_13_0 = "; believes itself to be at " + ac.a(38, var6.field_o) + "[" + var6.field_t + "]";
              }
              var7 = stackIn_13_0;
              var3_ref = var7;
              System.out.println("submission_rack[" + var1_int + "]=" + var6.field_i + " with dest " + var6.field_g + "," + var6.field_p + var7);
              var6.field_g = -2147483648;
            }
          }
          for (var1_intLifetime1 = 0; 12 > var1_intLifetime1; var1_intLifetime1++) {
            var8 = wk.field_a.field_e[var1_intLifetime1];
            if (var8 != null) {
              if (var8.field_o == wk.field_a &&
                var8.field_t == var1_intLifetime1) {
                stackIn_23_0 = "";
              } else {
                stackIn_23_0 = "; believes itself to be at " + ac.a(97, var8.field_o) + "[" + var8.field_t + "]";
              }
              var9 = stackIn_23_0;
              var3_refLifetime1 = var9;
              System.out.println("carryover_rack[" + var1_intLifetime1 + "]=" + var8.field_i + " with dest " + var8.field_g + "," + var8.field_p + var9);
              var8.field_g = -2147483648;
            }
          }
          for (var1_intLifetime2 = 0; var1_intLifetime2 < 8; var1_intLifetime2++) {
            var10 = si.field_i.field_e[var1_intLifetime2];
            if (var10 != null) {
              if (si.field_i == var10.field_o &&
                var10.field_t == var1_intLifetime2) {
                stackIn_34_0 = "";
              } else {
                stackIn_34_0 = "; believes itself to be at " + ac.a(49, var10.field_o) + "[" + var10.field_t + "]";
              }
              var11 = stackIn_34_0;
              var3_refLifetime2 = var11;
              System.out.println("new_rack[" + var1_intLifetime2 + "]=" + var10.field_i + " with dest " + var10.field_g + "," + var10.field_p + var11);
              var10.field_g = -2147483648;
            }
          }
          if (param0 != 31370) {
            return;
          }
          var1 = (sj) (ch.field_e.a((byte) -95));
          while (null != var1) {
            if (var1.field_o != de.field_d &&
              var1.field_g != -2147483648) {
              System.out.println("Floating tile " + var1.field_i + " with dest " + var1.field_g + "," + var1.field_p + " believes itself to be at " + ac.a(82, var1.field_o) + "[" + var1.field_t + "]");
              var2_int = 0;
              for (var3_int = 0; 12 > var3_int; var3_int++) {
                if (wk.field_a.field_e[var3_int] != null) {
                  continue;
                }
                var2_int = 1;
                var1.a(var3_int, 28, wk.field_a);
                break;
              }
              if (var2_int != 0) {
                var1 = (sj) (ch.field_e.a(true));
                continue;
              }
              var5 = 0;
              var3_intLifetime1 = var5;
              while (var5 < 8) {
                if (null == si.field_i.field_e[var5]) {
                  var1.a(var5, 28, si.field_i);
                  break;
                }
                var5++;
              }
            }
            var1 = (sj) (ch.field_e.a(true));
          }
          var1_intLifetime3 = 0;
          for (var2_intLifetime1 = 0; var2_intLifetime1 < 12; var2_intLifetime1++) {
            var3 = od.field_g.field_e[var2_intLifetime1];
            if (null != var3) {
              incrementValue$0 = var1_intLifetime3;
              var1_intLifetime3++;
              var3.a(incrementValue$0, 28, od.field_g);
            }
          }
          for (var2_intLifetime2 = 0; var2_intLifetime2 < 12; var2_intLifetime2++) {
            var12 = wk.field_a.field_e[var2_intLifetime2];
            if (var12 != null) {
              var12.a(var2_intLifetime2, 28, wk.field_a);
            }
          }
          for (var2_intLifetime3 = 0; var2_intLifetime3 < 8; var2_intLifetime3++) {
            var3Lifetime1 = si.field_i.field_e[var2_intLifetime3];
            if (null != var3Lifetime1) {
              var3Lifetime1.a(var2_intLifetime3, 28, si.field_i);
            }
          }
          var2 = (sj) (ch.field_e.a((byte) -95));
          while (var2 != null) {
            var2.field_j = var2.field_g;
            var2.field_q = var2.field_p;
            var2 = (sj) (ch.field_e.a(true));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1_ref), "ue.E(" + param0 + ')');
        }
    }

    final static boolean a(int param0, int param1) {
        try {
          int var2_int = 0;
          Throwable decompiledCaughtException = null;
          IOException var2 = null;
          if (nf.field_l.field_h >= param0) {
            return true;
          }
          if (null == nk.field_b) {
            return false;
          }
          try {
            var2_int = nk.field_b.a((byte) -125);
            if (var2_int > 0) {
              if (param0 - nf.field_l.field_h < var2_int) {
                var2_int = -nf.field_l.field_h + param0;
              }
              nk.field_b.a(nf.field_l.field_h, var2_int, nf.field_l.field_g, 5768);
              wi.field_q = lk.a(param1 ^ 0);
              nf.field_l.field_h = nf.field_l.field_h + var2_int;
              if (param0 > nf.field_l.field_h) {
                return false;
              }
              nf.field_l.field_h = 0;
              return true;
            }
            if (param1 != 0) {
              field_a = 89;
            }
            if (var2_int >= 0 &&
              mc.b(true) <= 30000L) {
              return false;
            }
            pc.a(1);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (IOException) (Object) decompiledCaughtException;
            pc.a(1);
          }
          return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int a(int param0, String param1, int param2, int param3) {
        int var8 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = Transmogrify.field_A ? 1 : 0;
        try {
          var5_int = 0;
          var6 = 0;
          if (param3 != 12) {
            stackIn_3_0 = 126;
            return stackIn_3_0;
          }
          var7 = param1.length();
          for (var8 = 0; var8 < var7; var8++) {
            var9 = param1.charAt(var8);
            if (var9 == 60) {
              var6 = 1;
            } else {
              if (var9 != 62) {
                if (var6 == 0 &&
                  var9 == 32) {
                  var5_int++;
                }
              } else {
                var6 = 0;
              }
            }
          }
          if (var5_int <= 0) {
            stackIn_22_0 = 0;
            return stackIn_22_0;
          }
          stackIn_20_0 = (-param2 + param0 << 8) / var5_int;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_25_0 = var5;
          stackIn_25_1 = new StringBuilder().append("ue.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int a(int param0, int param1, int param2) {
        int var5 = 0;
        int var4;
        ol var6;
        int var7;
        int var8;
        var8 = Transmogrify.field_A ? 1 : 0;
        if (null != this.field_b &&
          this.field_b.length != 0 &&
          param2 >= this.field_b[0].field_a) {
          if (this.field_b[param1 + this.field_b.length].field_f < param2) {
            return -1;
          }
          if (1 == this.field_b.length) {
            return this.field_b[0].b(29791, param0);
          }
          var4 = 0;
          for (var5 = 0; this.field_b.length > var5; var5++) {
            var6 = this.field_b[var5];
            if (param2 >= var6.field_a &&
              var6.field_f >= param2) {
              var7 = var6.b(param1 + 29792, param0);
              if (var7 != -1) {
                return var4 + var7;
              }
              return -1;
            }
            var4 = var4 + (-1 + var6.field_g.length);
          }
          return -1;
        }
        return -1;
    }

    final int b(int param0, int param1) {
        int var3 = 0;
        ol var4 = null;
        int var5 = Transmogrify.field_A ? 1 : 0;
        if (param0 != -1) {
          this.b(79, -18);
        }
        for (var3 = 0; var3 < this.field_b.length; var3++) {
          var4 = this.field_b[var3];
          if (!(var4.field_g.length <= param1)) {
            return var3;
          }
          param1 = param1 - (-1 + var4.field_g.length);
        }
        return this.field_b.length;
    }

    static {
    }
}
