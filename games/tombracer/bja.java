/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class bja {
    static String field_d;
    static cn field_a;
    kha[] field_c;
    static float field_b;

    final static void a(int param0, byte param1, int param2) {
        qv.field_o = null;
        String var3 = fna.field_k;
        if (!(var3 != null)) {
            var3 = kma.field_c[0];
        }
        String[] var4 = new String[1];
        var4[0] = var3;
        int var5 = jqa.a(2147483647, new Random(), -76);
        wka.field_d = false;
        id var6 = new id(param0, var5);
        rba.field_a = new qh(false, var5, var4, 0, false, rga.b(26499, param0), 0, 1, param2, param0, (BitSet[]) null, new boolean[]{-1 > (wla.field_ub ^ -1) ? true : false}, var6);
        rba.field_a.j((byte) -64);
        rba.field_a.h((byte) -52);
        int var7 = -125 / ((param1 - 57) / 38);
        iqa.field_c.g(0);
        ira.a(false, -1, (byte) 92);
    }

    public static void c(int param0) {
        if (param0 < 126) {
            field_d = (String) null;
        }
        field_d = null;
        field_a = null;
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        kha var4 = null;
        int var5 = TombRacer.field_G ? 1 : 0;
        for (var3 = param1; this.field_c.length > var3; var3++) {
            var4 = this.field_c[var3];
            if (!(var4.field_c.length <= param0)) {
                return var3;
            }
            param0 = param0 - (var4.field_c.length + -1);
        }
        return this.field_c.length;
    }

    final int a(int param0, String param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = 0;
            var7 = param1.length();
            var8 = param0;
            L1: while (true) {
              if (var7 <= var8) {
                if ((var5_int ^ -1) < -1) {
                  stackIn_18_0 = (param2 - param3 << -576281880) / var5_int;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  stackIn_20_0 = 0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                L2: {
                  var9 = param1.charAt(var8);
                  if ((var9 ^ -1) == -61) {
                    var6 = 1;
                    break L2;
                  } else {
                    if (var9 == 62) {
                      var6 = 0;
                      break L2;
                    } else {
                      if (var6 == 0) {
                        if (var9 == 32) {
                          var5_int++;
                          break L2;
                        } else {
                          break L2;
                        }
                      } else {
                        var8++;
                        continue L1;
                      }
                    }
                  }
                }
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var5);

            stackIn_23_1 = new StringBuilder().append("bja.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L3;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_18_0;
        } else {
          return stackIn_20_0;
        }
    }

    final int a(int param0) {
        int var2;
        kha[] var3;
        int var4;
        kha var5;
        int var7;
        int var6;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          var2 = -1;
          if (null == this.field_c) {
            break L0;
          } else {
            var3 = this.field_c;
            var4 = 0;
            L1: while (true) {
              if (var4 >= var3.length) {
                break L0;
              } else {
                var5 = var3[var4];
                if (var5 != null) {
                  var6 = var5.a(true);
                  if (var6 > var2) {
                    var2 = var6;
                    var4++;
                    continue L1;
                  } else {
                    var4++;
                    continue L1;
                  }
                } else {
                  var4++;
                  continue L1;
                }
              }
            }
          }
        }
        L2: {
          if (param0 == 0) {
            break L2;
          } else {
            this.a(62, 38, 65);
            break L2;
          }
        }
        return var2;
    }

    final static void a(byte param0, cn param1, int param2, String param3) {
        sra var4 = null;
        String var5 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        try {
          L0: {
            L1: {
              var4 = (sra) ((Object) dma.field_l);
              var4.a(param2, (byte) 47, param3);
              haa.field_A = new jpa();
              haa.field_A.field_f = param1.a("", (byte) 127, "map.png");
              var4.a(param2 - -5, (byte) 47, param3);
              du.field_c = new jpa();
              du.field_c.field_f = param1.a("", (byte) 117, "wall_bg.jpg");
              if (param0 <= -100) {
                break L1;
              } else {
                var5 = (String) null;
                bja.a((byte) -1, (cn) null, 32, (String) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var4_ref);

            stackIn_5_1 = new StringBuilder().append("bja.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), stackIn_9_2 + ')');
        }
    }

    final int a(int param0, int param1, int param2) {
        int var5 = 0;
        kha var6 = null;
        int var7 = 0;
        int var8 = TombRacer.field_G ? 1 : 0;
        if (this.field_c == null || this.field_c.length == 0 || this.field_c[0].field_d > param2) {
            return -1;
        }
        if (!(param2 <= this.field_c[this.field_c.length + param0].field_b)) {
            return -1;
        }
        if (!(-2 != (this.field_c.length ^ -1))) {
            return this.field_c[0].a(param1, -1);
        }
        int var4 = 0;
        for (var5 = 0; var5 < this.field_c.length; var5++) {
            var6 = this.field_c[var5];
            if (param2 >= var6.field_d && var6.field_b >= param2) {
                var7 = var6.a(param1, -1);
                if (0 == (var7 ^ -1)) {
                    return -1;
                }
                return var4 - -var7;
            }
            var4 = var4 + (var6.field_c.length - 1);
        }
        return -1;
    }

    final int b(int param0) {
        int var2;
        int stackIn_5_0 = 0;
        L0: {
          L1: {
            var2 = -43 / ((79 - param0) / 44);
            if (null == this.field_c) {
              break L1;
            } else {
              if (-1 > (this.field_c.length ^ -1)) {
                stackIn_5_0 = this.field_c[this.field_c.length - 1].field_b + -this.field_c[0].field_d;
                break L0;
              } else {
                break L1;
              }
            }
          }
          stackIn_5_0 = 0;
          break L0;
        }
        return stackIn_5_0;
    }

    final int a(byte param0, int param1) {
        int var4 = 0;
        kha var5 = null;
        int var6 = TombRacer.field_G ? 1 : 0;
        if (param0 != -59) {
            return 84;
        }
        kha[] var7 = this.field_c;
        kha[] var3 = var7;
        for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (param1 < var5.field_c.length) {
                return var5.field_c[param1];
            }
            param1 = param1 - (-1 + var5.field_c.length);
        }
        return 0;
    }

    static {
        field_d = "Waiting for <%0> to start the game...";
    }
}
