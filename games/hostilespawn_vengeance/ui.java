/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ui implements Iterable {
    static String field_f;
    static String field_h;
    static int field_e;
    dk field_a;
    static String field_d;
    static bd field_c;
    static bd field_b;
    static String field_g;

    final static void a(double param0, int[] param1, p param2, int param3, int param4, double param5, boolean param6) {
        int dupTemp$0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_59_0 = 0;
        jb[] stackIn_59_1 = null;
        int stackIn_59_2 = 0;
        boolean stackIn_60_3;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        String stackIn_91_2 = null;
        StringBuilder stackIn_93_1 = null;
        String stackIn_94_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        double var11 = 0.0;
        double var13 = 0.0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        oj var19 = null;
        int var20 = 0;
        double var21 = 0.0;
        double var23 = 0.0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        java.awt.Canvas var29 = null;
        int var30 = 0;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var26Lifetime1;
        int var17Lifetime2;
        var28 = HostileSpawn.field_I ? 1 : 0;
        try {
          var9_int = 0;
          stackIn_4_0 = (25 != param4) ? 0 : 1;
          var10 = stackIn_4_0;
          var11 = param2.field_l.field_f + (double)param2.field_j.field_e;
          if (param6) {
            var29 = (java.awt.Canvas) null;
            ui.a(-37, (java.awt.Canvas) null, (byte) -30, 35);
          }
          var13 = (double)param2.field_j.field_g + param2.field_l.field_a;
          while (param2.field_e < 5 &&
            var9_int < 4) {
            if (4 > param2.field_e) {
              param2.field_e = param2.field_e + 1;
            }
            var9_int++;
            if (2 != param1[param2.field_j.b(-4)]) {
              param2.field_l.a(5, (byte) 94, param2.field_c);
              ln.field_a.field_u[param2.field_j.b(-4)] = 48;
              param2.a(8573);
              var11 = (double)param2.field_j.field_e + param2.field_l.field_f;
              var13 = (double)param2.field_j.field_g + param2.field_l.field_a;
              param1[param3] = 0;
              var15 = 0;
              var30 = 1;
              var16 = var30;
              while (var30 < rc.field_e) {
                var17 = 0;
                var18 = 0;
                var19 = re.field_n[var30];
                var20 = var19.field_i;
                if (var19.field_I > 0 && (var20 < 12 ||
                  var20 >= 18)) {
                  var21 = var19.field_l.field_f + (double)var19.field_j.field_e;
                  var17Lifetime2 = (int)(24.0 * (var21 - var11));
                  var23 = (double)var19.field_j.field_g + var19.field_l.field_a;
                  var18Lifetime1 = (int)((var23 - var13) * 24.0);
                  var25 = 16;
                  var26 = var20;
                  if (var26 == 8 ||
                    var26 == 27) {
                    var18Lifetime1 = (int)(24.0 * (var23 - 0.5 - var13));
                    var17Lifetime2 = (int)((-var11 + (-0.5 + var21)) * 24.0);
                    var25 = 24;
                  }
                  if (var17Lifetime2 >= -var25 &&
                    var17Lifetime2 <= var25 &&
                    -var25 <= var18Lifetime1 &&
                    var18Lifetime1 < var25) {
                    if (var19.field_b) {
                      var15 = 1;
                    }
                    stackIn_49_0 = (0 >= var19.field_I) ? 0 : 1;
                    var26Lifetime1 = stackIn_49_0;
                    if (var19.a(11, -96)) {
                      if (var10 == 0) {
                        var19.field_I = var19.field_I - 2;
                      } else {
                        var19.field_I = var19.field_I - 8;
                      }
                      if (var19.field_b &&
                        var19.field_I > 0) {
                        stackIn_59_0 = 8;
                        stackIn_59_1 = jc.field_c;
                        stackIn_59_2 = 1;
                        stackIn_60_3 = !(param6);
                        tk.a(stackIn_59_0, stackIn_59_1, stackIn_59_2, stackIn_60_3);
                      }
                    }
                    if (var19.field_I < 0) {
                      var19.field_I = 0;
                    }
                    var19.field_F = 255;
                    if (!od.a(var20, 1) ||
                      var19.field_h != 0) {
                      param2.field_i = 11;
                      param2.field_e = 1;
                    }
                    if (var19.field_I <= 0 &&
                      var26Lifetime1 != 0 &&
                      var19.field_b &&
                      var19.field_i != 27) {
                      dupTemp$0 = al.field_U[4] + 1;
                      al.field_U[4] = dupTemp$0;
                      if (30 == dupTemp$0) {
                        ti.a(246, (byte) -30, 9);
                      }
                    }
                    nh.a(var19, -29966);
                    if (1 == uj.field_l) {
                      var17Lifetime2 = (int)(24.0 * (-var11 + param5));
                      var18Lifetime1 = (int)(24.0 * (-var13 + param0));
                      var27 = -(int)Math.sqrt((double)(var17Lifetime2 * var17Lifetime2 + var18Lifetime1 * var18Lifetime1)) + 256;
                      if (var27 > 128) {
                        var27 = 128;
                      }
                      if (var27 > 0) {
                        eh.field_c.a(sf.field_V[38], 100, uh.field_i * var27 >> 9);
                      }
                    }
                  }
                }
                var30++;
              }
              if (var15 != 0) {
                param2.field_i = 34;
              }
              param1[param3] = 3;
              continue;
            }
            param2.field_i = 11;
            param2.field_e = 5;
            var9_int = 4;
            if (uj.field_l == 1) {
              var15Lifetime1 = (int)((-var11 + param5) * 24.0);
              var16Lifetime1 = (int)((-var13 + param0) * 24.0);
              var17Lifetime1 = -(int)Math.sqrt((double)(var15Lifetime1 * var15Lifetime1 + var16Lifetime1 * var16Lifetime1)) + 256;
              if (128 < var17Lifetime1) {
                var17Lifetime1 = 128;
              }
              if (var17Lifetime1 <= 0) {
                return;
              }
              eh.field_c.a(sf.field_V[38], 100, uh.field_i * var17Lifetime1 >> 8);
              return;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_90_0 = var9;
          stackIn_90_1 = new StringBuilder().append("ui.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_91_2 = "null";
          } else {
            stackIn_91_2 = "{...}";
          }
          stackIn_93_1 = ((StringBuilder) (Object) stackIn_90_1).append(stackIn_91_2).append(',');
          if (param2 == null) {
            stackIn_94_2 = "null";
          } else {
            stackIn_94_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_90_0), ((StringBuilder) (Object) stackIn_93_1).append(stackIn_94_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_d = null;
        field_f = null;
        field_b = null;
        if (param0 != -1667734544) {
          java.awt.Canvas var2 = (java.awt.Canvas) null;
          ui.a(-40, (java.awt.Canvas) null, (byte) -69, -92);
        }
        field_c = null;
        field_h = null;
    }

    final void a(int param0, dk param1) {
        try {
          if (param1.field_i != null) {
            param1.c(-1);
          }
          if (param0 != 24) {
            dk var4 = (dk) null;
            this.a(-75, (dk) null);
          }
          param1.field_i = this.field_a.field_i;
          param1.field_j = this.field_a;
          param1.field_i.field_j = param1;
          param1.field_j.field_i = param1;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "ui.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = param2 >> 16;
        int var4 = param2 & 65535;
        int var5 = param1 >> 16;
        int var6 = param1 & param0;
        return var3 * param1 - (-(var5 * var4) - (var4 * var6 >> 16));
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        float var5_float = 0.0f;
        RuntimeException var5 = null;
        int var6 = 0;
        float var6_float = 0.0f;
        int var7 = 0;
        float var7_float = 0.0f;
        int var8 = 0;
        int var9 = 0;
        int var5_intLifetime1;
        int var5_intLifetime2;
        int var6Lifetime1;
        float var6_floatLifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var6Lifetime2;
        int var6Lifetime1Lifetime1;
        var9 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (param4 != -69) {
            ui.a(-0.019849789144301654, (int[]) null, (p) null, 108, -25, 1.6753937786913926, true);
          }
          pl.field_k = true;
          if (param1 == param3) {
            var5_int = param1 + param2 * ln.field_a.field_d;
            if (param2 >= param0) {
              for (var6 = param2; var6 >= param0; var6--) {
                if (kc.a(var5_int, (byte) -120)) {
                  return;
                }
                var5_int = var5_int - ln.field_a.field_d;
              }
              return;
            }
            for (var6Lifetime2 = param2; param0 >= var6Lifetime2; var6Lifetime2++) {
              if (kc.a(var5_int, (byte) 120)) {
                return;
              }
              var5_int = var5_int + ln.field_a.field_d;
            }
            return;
          }
          if (param2 == param0) {
            var5_intLifetime1 = param2 * ln.field_a.field_d;
            if (param3 > param1) {
              for (var6Lifetime1 = param1; param3 >= var6Lifetime1; var6Lifetime1++) {
                if (kc.a(var6Lifetime1 + var5_intLifetime1, (byte) -124)) {
                  return;
                }
              }
              return;
            }
            for (var6Lifetime1Lifetime1 = param1; param3 <= var6Lifetime1Lifetime1; var6Lifetime1Lifetime1--) {
              if (kc.a(var5_intLifetime1 + var6Lifetime1Lifetime1, (byte) 77)) {
                return;
              }
            }
            return;
          }
          if (Math.abs(param0 - param2) < Math.abs(-param1 + param3)) {
            var5_float = (float)(-param2 + param0) / (float)(param3 - param1);
            var6_float = (float)param2;
            if (param3 > param1) {
              for (var7 = param1; var7 <= param3; var7++) {
                if (!kc.a(var7 + (int)var6_float * ln.field_a.field_d, (byte) 82)) {
                  var6_float = var6_float + var5_float;
                  continue;
                }
                break;
              }
              return;
            }
            for (var7Lifetime1 = param1; param3 <= var7Lifetime1; var7Lifetime1--) {
              if (!kc.a(var7Lifetime1 + (int)var6_float * ln.field_a.field_d, (byte) 8)) {
                var6_float = var6_float - var5_float;
                continue;
              }
              break;
            }
            return;
          }
          var5_intLifetime2 = param2 * ln.field_a.field_d;
          var6_floatLifetime1 = (float)(-param1 + param3) / (float)(-param2 + param0);
          var7_float = (float)param1;
          if (param2 < param0) {
            for (var8 = param2; param0 >= var8; var8++) {
              if (!kc.a(var5_intLifetime2 + (int)var7_float, (byte) -12)) {
                var7_float = var7_float + var6_floatLifetime1;
                var5_intLifetime2 = var5_intLifetime2 + ln.field_a.field_d;
                continue;
              }
              break;
            }
            return;
          }
          for (var8Lifetime1 = param2; var8Lifetime1 >= param0; var8Lifetime1--) {
            if (!kc.a((int)var7_float + var5_intLifetime2, (byte) -123)) {
              var7_float = var7_float - var6_floatLifetime1;
              var5_intLifetime2 = var5_intLifetime2 - ln.field_a.field_d;
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var5), "ui.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new kj(this));
    }

    final dk a(boolean param0) {
        dk var2 = this.field_a.field_j;
        if (var2 == this.field_a) {
          return null;
        }
        if (!param0) {
          field_f = (String) null;
        }
        var2.c(-1);
        return var2;
    }

    final static void a(int param0, java.awt.Canvas param1, byte param2, int param3) {
        java.awt.Graphics var4 = null;
        int var5 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        try {
          try {
            var4 = param1.getGraphics();
            var5 = -75 / ((param2 - 46) / 41);
            o.field_n.a(param3, (byte) -126, param0, var4);
            var4.dispose();
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4_ref = (Exception) (Object) decompiledCaughtException;
            param1.repaint();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_6_0 = var4_ref2;
          stackIn_6_1 = new StringBuilder().append("ui.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private ui() throws Throwable {
        throw new Error();
    }

    static {
        field_e = 50;
        field_f = "Someone's usefully left some rockets here.";
        field_h = "Return to game";
        field_d = "Previous";
        field_g = "Names cannot start or end with space or underscore";
    }
}
