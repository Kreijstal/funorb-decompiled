/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class j {
    static int field_b;
    static String field_a;
    int field_c;
    int field_d;
    sj[] field_e;

    public static void a(byte param0) {
        field_a = null;
        if (param0 > -117) {
            j.a((byte) 18);
        }
    }

    final void a(int param0) {
        int incrementValue$1 = 0;
        int var2;
        int var3;
        sj var4;
        int var5;
        L0: {
          var5 = Transmogrify.field_A ? 1 : 0;
          if (param0 == -10874) {
            break L0;
          } else {
            field_a = (String) null;
            break L0;
          }
        }
        var2 = this.field_e.length;
        L1: while (true) {
          if ((var2 ^ -1) >= -2) {
            var2 = 0;
            L2: while (true) {
              if (var2 >= this.field_e.length) {
                return;
              } else {
                if (this.field_e[var2] != null) {
                  this.field_e[var2].field_t = var2;
                  this.field_e[var2].field_g = var2 * 32 + this.field_d;
                  if (this.field_e[var2].field_k == this) {
                    this.field_e[var2].field_s = var2;
                    var2++;
                    continue L2;
                  } else {
                    var2++;
                    continue L2;
                  }
                } else {
                  var2++;
                  continue L2;
                }
              }
            }
          } else {
            incrementValue$1 = var2;
            var2--;
            var3 = li.a(incrementValue$1, o.field_o, false);
            var4 = this.field_e[var3];
            this.field_e[var3] = this.field_e[var2];
            this.field_e[var2] = var4;
            continue L1;
          }
        }
    }

    final void a(boolean param0) {
        int var2;
        int var3;
        L0: {
          var3 = Transmogrify.field_A ? 1 : 0;
          var2 = 0;
          if (param0) {
            break L0;
          } else {
            this.a(false);
            break L0;
          }
        }
        L1: while (true) {
          if (this.field_e.length <= var2) {
            return;
          } else {
            if (this.field_e[var2] != null) {
              this.field_e[var2].d(1);
              this.field_e[var2] = null;
              var2++;
              continue L1;
            } else {
              var2++;
              continue L1;
            }
          }
        }
    }

    final void a(boolean param0, int param1, int param2, int[][] param3, int param4) {
        int[][] var6 = null;
        int var7 = 0;
        int[] var8 = null;
        sj[] var9 = null;
        int var10 = 0;
        sj var11 = null;
        int var12 = 0;
        int[][] var13 = null;
        boolean stackIn_12_0 = false;
        boolean stackIn_13_0 = false;
        int stackIn_13_1 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6_ref = null;
        var12 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              sb.a(nc.field_p);
              if (param2 == 3) {
                break L1;
              } else {
                this.a(false);
                break L1;
              }
            }
            var13 = param3;
            var6 = var13;
            var7 = 0;
            L2: while (true) {
              if (var13.length <= var7) {
                break L0;
              } else {
                var8 = var13[var7];
                sb.g(var8[0], var8[1], var8[2], var8[3]);
                var9 = this.field_e;
                var10 = 0;
                L3: while (true) {
                  if (var9.length <= var10) {
                    sb.b(nc.field_p);
                    var7++;
                    continue L2;
                  } else {
                    var11 = var9[var10];
                    if (var11 != null) {
                      L4: {
                        L5: {
                          stackIn_12_0 = param0;

                          if (var11.field_g != var11.field_j) {
                            break L5;
                          } else {

                            if (var11.field_q != var11.field_p) {
                              break L5;
                            } else {
                              stackIn_13_0 = stackIn_12_0;
                              stackIn_13_1 = 1;
                              break L4;
                            }
                          }
                        }
                        stackIn_13_0 = stackIn_12_0;
                        stackIn_13_1 = 0;
                        break L4;
                      }
                      L6: {
                        if (stackIn_13_0 ^ stackIn_13_1 != 0) {
                          var11.a(param1, param4, param2 + -2, 0);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var10++;
                      continue L3;
                    } else {
                      var10++;
                      continue L3;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6_ref = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var6_ref);

            stackIn_21_1 = new StringBuilder().append("j.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param4 + ')');
        }
    }

    j(int param0, int param1, int param2) {
        this.field_c = param2;
        this.field_d = param1;
        this.field_e = new sj[param0];
    }

    static {
        field_b = 0;
        field_a = "Loading...";
    }
}
