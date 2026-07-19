/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class od extends ah {
    private int[] field_t;
    static fb field_v;
    static int field_r;
    static long field_z;
    private String[] field_u;
    private int[][] field_x;
    int[] field_y;
    static String[] field_w;
    static int[] field_s;

    final void f(int param0) {
        int var2 = 0;
        int var3 = stellarshard.field_B;
        if (!(this.field_y == null)) {
            for (var2 = 0; var2 < this.field_y.length; var2++) {
                this.field_y[var2] = vf.b(this.field_y[var2], 32768);
            }
        }
        if (param0 != 20865) {
            od.d((byte) -65);
        }
    }

    final static String a(int param0, long param1) {
        fj.field_k.setTime(new Date(param1));
        int var3 = fj.field_k.get(7);
        int var4 = fj.field_k.get(5);
        int var5 = fj.field_k.get(2);
        int var6 = fj.field_k.get(1);
        int var7 = fj.field_k.get(11);
        if (param0 != 10) {
            od.d((byte) 71);
        }
        int var8 = fj.field_k.get(12);
        int var9 = fj.field_k.get(13);
        return rl.field_c[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + ng.field_a[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    final static boolean a(char param0, boolean param1) {
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        if (!param1) {
          L0: {
            L1: {
              L2: {
                if (param0 < 48) {
                  break L2;
                } else {
                  if (param0 <= 57) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (param0 < 65) {
                  break L3;
                } else {
                  if (param0 <= 90) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (param0 < 97) {
                  break L4;
                } else {
                  if (param0 > 122) {
                    break L4;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_12_0 = 0;
              stackIn_13_0 = stackOut_12_0;
              break L0;
            }
            stackOut_11_0 = 1;
            stackIn_13_0 = stackOut_11_0;
            break L0;
          }
          return stackIn_13_0 != 0;
        } else {
          return false;
        }
    }

    final void a(ka param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var4 = stellarshard.field_B;
        try {
          L0: {
            L1: while (true) {
              var3_int = param0.f(4);
              if (-1 != (var3_int ^ -1)) {
                this.a(param0, -11682, var3_int);
                continue L1;
              } else {
                L2: {
                  if (param1 == 745) {
                    break L2;
                  } else {
                    field_s = (int[]) null;
                    break L2;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("od.B(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
    }

    public static void d(byte param0) {
        if (param0 != 11) {
            return;
        }
        field_w = null;
        field_v = null;
        field_s = null;
    }

    final String e(int param0) {
        int var3 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4 = stellarshard.field_B;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (!(this.field_u != null)) {
            return "";
        }
        StringBuilder discarded$0 = var5.append(this.field_u[param0]);
        for (var3 = 1; var3 < this.field_u.length; var3++) {
            discarded$1 = var2.append("...");
            discarded$2 = var5.append(this.field_u[var3]);
        }
        return var2.toString();
    }

    private final void a(ka param0, int param1, int param2) {
        int[] array$1 = null;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        li var7 = null;
        int var8 = 0;
        int var9 = 0;
        ka var10 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var9 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              if (param2 != 1) {
                if (2 != param2) {
                  if (3 != param2) {
                    if (-5 == (param2 ^ -1)) {
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    var4_int = param0.f(param1 + 11686);
                    this.field_t = new int[var4_int];
                    this.field_x = new int[var4_int][];
                    var5 = 0;
                    L2: while (true) {
                      if (var5 >= var4_int) {
                        break L1;
                      } else {
                        L3: {
                          var6 = param0.c((byte) 54);
                          var7 = ee.a(var6, (byte) 8);
                          if (var7 != null) {
                            this.field_t[var5] = var6;
                            array$1 = new int[var7.field_c];
                            this.field_x[var5] = array$1;
                            var8 = 0;
                            L4: while (true) {
                              if (var8 >= var7.field_c) {
                                break L3;
                              } else {
                                this.field_x[var5][var8] = param0.c((byte) 96);
                                var8++;
                                continue L4;
                              }
                            }
                          } else {
                            break L3;
                          }
                        }
                        var5++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  var4_int = param0.f(param1 ^ -11686);
                  this.field_y = new int[var4_int];
                  var5 = 0;
                  L5: while (true) {
                    if (var4_int <= var5) {
                      break L1;
                    } else {
                      this.field_y[var5] = param0.c((byte) 107);
                      var5++;
                      continue L5;
                    }
                  }
                }
              } else {
                this.field_u = qj.a('<', param0.e((byte) 106), 10287);
                break L1;
              }
            }
            L6: {
              if (param1 == -11682) {
                break L6;
              } else {
                var10 = (ka) null;
                this.a((ka) null, 76, -96);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var4);
            stackOut_21_1 = new StringBuilder().append("od.D(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    od() {
    }

    static {
        field_w = new String[]{"All scores", "My scores", "Best each"};
        field_s = new int[8192];
    }
}
