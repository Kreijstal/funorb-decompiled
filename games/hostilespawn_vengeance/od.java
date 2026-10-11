/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class od extends fc {
    static bd field_D;
    static String field_B;
    static bd[] field_G;
    static java.lang.reflect.Constructor field_F;
    static String field_E;
    static String field_C;
    static fk field_I;
    static String field_H;

    private od(int param0, int param1, int param2, int param3, nn param4, mh param5, ag param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
          this.field_A = param6;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "od.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final static bd[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int stackIn_11_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_45_0 = 0;
        int var9 = 0;
        bd[] var10 = null;
        bd[] var11_ref_bd__ = null;
        int var11 = 0;
        int var12 = 0;
        bd var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var11Lifetime1;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime2Lifetime1;
        int var12Lifetime2Lifetime2;
        var15 = HostileSpawn.field_I ? 1 : 0;
        var9 = param2 + (param4 + param7);
        var10 = new bd[]{new bd(var9, var9), new bd(param0, var9), new bd(var9, var9), new bd(var9, param0), new bd(64, 64), new bd(var9, param0), new bd(var9, var9), new bd(param0, var9), new bd(var9, var9)};
        var11_ref_bd__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var12 < var11_ref_bd__.length) {
            var13 = var11_ref_bd__[var12];
            stackIn_11_0 = 0;
            if (var15 != 0) {
              break L0;
            }
            var14 = stackIn_11_0;
            while (var14 < var13.field_D.length) {
              var13.field_D[var14] = param8;
              var14++;
            }
            var12++;
            continue L0;
          }
          stackIn_11_0 = 0;
          break;
        }
        var11 = stackIn_11_0;
        L6: while (true) {
          if (var11 < param4) {
            stackIn_22_0 = 0;
            if (var15 != 0) {
              break L6;
            }
            var12Lifetime1 = stackIn_22_0;
            while (var9 > var12Lifetime1) {
              var10[6].field_D[(-var11 + var9 - 1) * var9 + var12Lifetime1] = param5;
              var10[8].field_D[var12Lifetime1 + var9 * (-var11 + (var9 - 1))] = param5;
              var10[2].field_D[-var11 + var9 - (1 - var9 * var12Lifetime1)] = param5;
              var10[8].field_D[var9 * var12Lifetime1 + (-var11 + (-1 + var9))] = param5;
              var12Lifetime1++;
            }
            var11++;
            continue L6;
          }
          stackIn_22_0 = 0;
          break;
        }
        var11Lifetime1 = stackIn_22_0;
        while (true) {
          stackIn_24_0 = param4;
          stackIn_24_1 = var11Lifetime1;
          if (stackIn_24_0 > stackIn_24_1) {
            stackIn_34_0 = 0;
            if (var15 == 0) {
              var12Lifetime2 = stackIn_34_0;
              while (var9 > var12Lifetime2) {
                var10[0].field_D[var12Lifetime2 + var9 * var11Lifetime1] = param6;
                var10[0].field_D[var11Lifetime1 + var12Lifetime2 * var9] = param6;
                stackIn_24_0 = var12Lifetime2;
                stackIn_24_1 = -var11Lifetime1 + var9;
                if (stackIn_24_0 < stackIn_24_1) {
                  var10[2].field_D[var12Lifetime2 + var9 * var11Lifetime1] = param6;
                  var10[6].field_D[var11Lifetime1 + var12Lifetime2 * var9] = param6;
                }
                var12Lifetime2++;
              }
              var11Lifetime1++;
              continue;
            }
          } else {
            stackIn_34_0 = 0;
          }
          var11Lifetime1 = stackIn_34_0;
          L19: while (true) {
            if (var11Lifetime1 < param0) {
              stackIn_45_0 = 0;
              if (var15 != 0) {
                break L19;
              }
              var12Lifetime2Lifetime1 = stackIn_45_0;
              while (param4 > var12Lifetime2Lifetime1) {
                var10[7].field_D[param0 * (var9 - (var12Lifetime2Lifetime1 + 1)) + var11Lifetime1] = param5;
                var10[5].field_D[var9 * var11Lifetime1 - (-var9 + 1) - var12Lifetime2Lifetime1] = param5;
                var10[1].field_D[var11Lifetime1 + var12Lifetime2Lifetime1 * param0] = param6;
                var10[3].field_D[var12Lifetime2Lifetime1 + var9 * var11Lifetime1] = param6;
                var12Lifetime2Lifetime1++;
              }
              var11Lifetime1++;
              continue L19;
            }
            stackIn_45_0 = param1;
            break;
          }
          if (stackIn_45_0 < 17) {
            return (bd[]) null;
          }
          var11Lifetime1 = 0;
          L25: while (var11Lifetime1 < param0 >> 1) {
            var12Lifetime2Lifetime2 = 0;
            while (true) {
              if (var12Lifetime2Lifetime2 < param2) {
                var10[1].field_D[var11Lifetime1 + param0 * (-1 + var9 - var12Lifetime2Lifetime2)] = param3;
                var10[3].field_D[var11Lifetime1 * var9 - 1 + (var9 - var12Lifetime2Lifetime2)] = param3;
                var10[7].field_D[var12Lifetime2Lifetime2 * param0 + var11Lifetime1] = param3;
                var10[5].field_D[var12Lifetime2Lifetime2 + var9 * var11Lifetime1] = param3;
                var12Lifetime2Lifetime2++;
                if (var15 == 0) {
                  continue;
                }
              } else {
                var11Lifetime1++;
              }
              break;
            }
            if (var15 == 0) {
              continue L25;
            }
            break;
          }
          return var10;
        }
    }

    final static void k(int param0) {
        if (!md.field_k) {
          throw new IllegalStateException();
        }
        ka.field_r = true;
        w.b(false, -23960);
        fa.field_c = param0;
    }

    final static boolean a(int param0, int param1) {
        int var3 = HostileSpawn.field_I ? 1 : 0;
        int var2 = param0;
        if (var2 == 10) {
          return true;
        }
        if (var2 == 11) {
          return true;
        }
        if (var2 == 129 &&
          var3 == 0) {
          return true;
        }
        if (var2 == 128 &&
          var3 == 0) {
          return true;
        }
        if (var2 == 131 &&
          var3 == 0) {
          return true;
        }
        if (var2 == 130) {
          return true;
        }
        if (var2 == 133) {
          return true;
        }
        if (132 == var2) {
          return true;
        }
        if (param1 == 1) {
          return false;
        }
        return true;
    }

    final static String a(byte param0, Throwable param1) throws IOException {
        String var2;
        PrintWriter var4;
        String var5;
        BufferedReader var6;
        String var7;
        String var8;
        int var9;
        int var10;
        String var11;
        int var12;
        int var13;
        kc var14;
        StringWriter var15;
        String var16;
        String var17;
        String var18;
        String var19;
        String var2Lifetime1;
        String var2Lifetime2;
        String var11Lifetime1;
        String var11Lifetime2;
        String var11Lifetime3;
        String var11Lifetime4;
        String var11Lifetime5;
        String var11Lifetime5Lifetime1;
        String var11Lifetime5Lifetime2;
        var13 = HostileSpawn.field_I ? 1 : 0;
        if (param1 instanceof kc) {
          var14 = (kc) ((Object) param1);
          var2 = var14.field_a + " | ";
          param1 = var14.field_g;
          if (var13 != 0) {
            var2 = "";
            var11 = var2;
            var2 = var11;
            var11 = var2;
          }
        } else {
          var2 = "";
          var11 = var2;
          var2 = var11;
          var11 = var2;
        }
        var15 = new StringWriter();
        var4 = new PrintWriter((Writer) ((Object) var15));
        param1.printStackTrace(var4);
        var4.close();
        var5 = var15.toString();
        var11Lifetime1 = var5;
        var2Lifetime1 = var11Lifetime1;
        var11Lifetime2 = var5;
        var6 = new BufferedReader((Reader) ((Object) new StringReader(var5)));
        if (param0 != -77) {
          od.a(68, -28);
        }
        var7 = var6.readLine();
        var11Lifetime3 = var7;
        var2Lifetime2 = var11Lifetime3;
        var11Lifetime4 = var7;
        while (true) {
          var8 = var6.readLine();
          var11Lifetime5 = var8;
          var2Lifetime2 = var11Lifetime5;
          var11Lifetime5Lifetime1 = var8;
          if (var8 != null) {
            var9 = var8.indexOf('(');
            var10 = var8.indexOf(')', 1 + var9);
            if (var13 == 0) {
              if (var9 == -1) {
                var11Lifetime5Lifetime2 = var8;
              } else {
                var11Lifetime5Lifetime2 = var8.substring(0, var9);
                var2Lifetime2 = var11Lifetime5Lifetime2;
                var2Lifetime2 = var11Lifetime5Lifetime2;
              }
              var16 = var11Lifetime5Lifetime2.trim();
              var2Lifetime2 = var16;
              var2Lifetime2 = var16;
              var17 = var16.substring(1 + var16.lastIndexOf(' '));
              var2Lifetime2 = var17;
              var2Lifetime2 = var17;
              var18 = var17.substring(var17.lastIndexOf('\t') + 1);
              var2Lifetime2 = var18;
              var2Lifetime2 = var18;
              var19 = var2Lifetime2 + var18;
              var2Lifetime2 = var19;
              var2Lifetime2 = var19;
              var2Lifetime2 = var19;
              if (-1 != var9 &&
                var10 != -1) {
                var12 = var8.indexOf(".java:", var9);
                if (var12 >= 0) {
                  var2Lifetime2 = var19 + var8.substring(var12 + 5, var10);
                }
              }
              var2Lifetime2 = var2Lifetime2 + ' ';
              continue;
            }
          } else {
            var2Lifetime2 = var2Lifetime2 + "| " + var7;
          }
          break;
        }
        return var2Lifetime2;
    }

    public static void e(byte param0) {
        field_F = null;
        if (param0 <= -43) {
          field_C = null;
          field_E = null;
          field_B = null;
          field_D = null;
          field_H = null;
          field_I = null;
          field_G = null;
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, ag param4, int param5) {
        rj var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        try {
          super.a(param0, param1, param2, param3, param4, param5);
          var7 = rh.field_D;
          if (var7 != null) {
            if (!this.b(param3, param0, 255, param1, param2)) {
              return;
            }
            if (!(this.field_p instanceof k)) {
              if (!(var7.field_p instanceof k)) {
                return;
              }
              ((k) (var7.field_p)).a(var7, false, this);
              rh.field_D = null;
              if (!HostileSpawn.field_I) {
                return;
              }
            }
            ((k) (this.field_p)).a(var7, false, this);
            rh.field_D = null;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_11_0 = var7_ref;
          stackIn_11_1 = new StringBuilder().append("od.GA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_B = "<col=ffffff>Health<nbsp>packs</col><br>One of the wonders of the century, the Omega Medicine Inc. health pack combines nanites with stem cells to repair almost every injury in a matter of seconds.";
        field_E = "Use the rocket launcher to destroy the turrets blocking the lift.";
        field_C = "<col=ffffff>Grenade<nbsp>launcher</col><br>The grenade launcher takes explosive ammo, and sets it to detonate after a time delay instead of on impact. It is very useful for clearing small rooms with the minimum of personal risk, but less useful in open spaces.";
        field_H = "Connection timed out. Please try using a different server.";
    }
}
