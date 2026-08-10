/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ke extends ui implements sg {
    static ag field_W;
    static boolean field_V;
    static boolean[] field_X;
    static bk field_U;
    private int field_T;
    private jm field_S;

    final static int a(int param0, int param1, Random param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -21937) {
                break L1;
              } else {
                field_X = (boolean[]) null;
                break L1;
              }
            }
            if (0 < param0) {
              if (!tn.a(param0, -3236)) {
                var3_int = -2147483648 + -(int)(4294967296L % (long)param0);
                L2: while (true) {
                  var4 = param2.nextInt();
                  if (var4 < var3_int) {
                    stackIn_11_0 = vj.a((byte) -101, var4, param0);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    continue L2;
                  }
                }
              } else {
                stackIn_6_0 = (int)((4294967295L & (long)param2.nextInt()) * (long)param0 >> 849271456);
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              throw new IllegalArgumentException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("ke.U(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_11_0;
        }
    }

    final void r(int param0) {
        if (param0 <= 123) {
            return;
        }
        super.r(124);
        if (!(null == this.field_S)) {
            this.field_S.c(-11);
        }
    }

    public final jm a(int param0) {
        if (param0 != 35) {
            this.h(-84);
            return this.field_S;
        }
        return this.field_S;
    }

    final void a(jm param0, int param1) {
        if (param1 != 1048576) {
            return;
        }
        try {
            this.field_S = param0;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "ke.W(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(wh param0, boolean param1, int param2, boolean param3) {
        Object var4 = null;
        RuntimeException var4_ref = null;
        Throwable var5 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param3) {
                break L1;
              } else {
                ke.s(-5);
                break L1;
              }
            }
            L2: {
              if (nj.field_e == null) {
                break L2;
              } else {
                dl.a(param1, param0, -32532, 1048576, param2);
                break L2;
              }
            }
            if (km.field_a == null) {
              break L0;
            } else {
              var4 = mj.field_o;
              synchronized (var4) {
                L3: {
                  km.field_a.a(param2, true, -1);
                  if (param0 == de.field_b) {
                    return;
                  } else {
                    L4: {
                      km.field_a.c((byte) 108);
                      mj.field_o.f();
                      de.field_b = param0;
                      if (de.field_b != null) {
                        km.field_a.a(param1, de.field_b, (byte) 2);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    break L3;
                  }
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var4_ref);

            stackIn_20_1 = new StringBuilder().append("ke.S(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static String a(char param0, byte param1, String param2, String param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        int var11 = 0;
        String stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        var11 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              var4_int = param2.length();
              if (param1 == 75) {
                break L1;
              } else {
                field_U = (bk) null;
                break L1;
              }
            }
            L2: {
              var5 = param3.length();
              var6 = var4_int;
              var7 = var5 - 1;
              if (var7 != 0) {
                var8_int = 0;
                L3: while (true) {
                  var8_int = param2.indexOf((int) param0, var8_int);
                  if (var8_int >= 0) {
                    var8_int++;
                    var6 = var6 + var7;
                    continue L3;
                  } else {
                    break L2;
                  }
                }
              } else {
                break L2;
              }
            }
            var8 = new StringBuilder(var6);
            var9 = 0;
            L4: while (true) {
              var10 = param2.indexOf((int) param0, var9);
              if (0 > var10) {
                discarded$0 = var8.append(param2.substring(var9));
                stackIn_13_0 = var8.toString();
                break L0;
              } else {
                discarded$1 = var8.append(param2.substring(var9, var10));
                discarded$2 = var8.append(param3);
                var9 = 1 + var10;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var4);

            stackIn_16_1 = new StringBuilder().append("ke.AB(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ')');
        }
        return stackIn_13_0;
    }

    final void a(int param0, int param1, byte param2, fe param3) {
        try {
            super.a(param0, param1, (byte) 62, param3);
            this.field_T = -param1 + (nk.field_w + -this.field_u);
            if (param2 <= 49) {
                Random var6 = (Random) null;
                ke.a(-45, -96, (Random) null);
            }
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "ke.V(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final String h(int param0) {
        if (this.field_x) {
          if (null != this.field_n) {
            qh.a(gb.field_e, nk.field_w + (-this.field_T + this.field_v), 1);
            if (param0 != -27867) {
              field_W = (ag) null;
              return this.field_n;
            } else {
              return this.field_n;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public static void s(int param0) {
        field_X = null;
        field_U = null;
        if (param0 > -65) {
            field_V = false;
            field_W = null;
            return;
        }
        field_W = null;
    }

    ke(String param0, rm param1, int param2) {
        super(param0, param1, param2);
    }

    static {
        field_W = new ag();
        field_X = new boolean[35];
    }
}
