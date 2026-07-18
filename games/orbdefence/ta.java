/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ta extends pj implements c {
    static int field_z;
    im field_x;
    static String field_y;

    final boolean a(boolean param0, int param1, int param2, int param3, int param4, int param5, pj param6) {
        km var8 = null;
        RuntimeException var8_ref = null;
        pj var9 = null;
        int var10 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var10 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var8 = new km(((ta) this).field_x);
            var9 = (pj) (Object) var8.d(27935);
            L1: while (true) {
              L2: {
                if (var9 == null) {
                  break L2;
                } else {
                  if (!var9.b(true)) {
                    break L2;
                  } else {
                    L3: {
                      if (!var9.d(-81)) {
                        break L3;
                      } else {
                        if (!var9.a(false, param1, param2, param3, param4, param5, param6)) {
                          break L3;
                        } else {
                          stackOut_6_0 = 1;
                          stackIn_7_0 = stackOut_6_0;
                          return stackIn_7_0 != 0;
                        }
                      }
                    }
                    var9 = (pj) (Object) var8.b(true);
                    continue L1;
                  }
                }
              }
              if (!param0) {
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                ((ta) this).field_x = null;
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var8_ref;
            stackOut_13_1 = new StringBuilder().append("ta.LA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param6 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_12_0 != 0;
    }

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.i(0);
    }

    final static void a(int param0, kc param1, kc param2, int param3) {
        vi.field_I = param3;
        jd.field_a = param1;
        ck.field_g = param2;
        jk.b(ul.field_l / 2, ul.field_f / 2, param0 ^ 249);
        if (param0 != 0) {
            return;
        }
        try {
            nc.a(param0 + 125, param2.field_E, param1.field_E + param1.field_B, param1.field_E, param2.field_E - -param2.field_B);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "ta.AA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private final void a(StringBuilder param0, int param1, Hashtable param2, int param3) {
        km var5 = null;
        RuntimeException var5_ref = null;
        pj var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var5 = new km(((ta) this).field_x);
            var6 = (pj) (Object) var5.d(27935);
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                StringBuilder discarded$12 = param0.append('\n');
                var7 = 0;
                L2: while (true) {
                  if (param3 < var7) {
                    StringBuilder discarded$13 = var6.a((byte) -34, param2, 1 + param3, param0);
                    var6 = (pj) (Object) var5.b(true);
                    continue L1;
                  } else {
                    StringBuilder discarded$14 = param0.append(' ');
                    var7++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5_ref;
            stackOut_8_1 = new StringBuilder().append("ta.HA(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(954).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param3 + ')');
        }
    }

    public static void c(byte param0) {
        field_y = null;
        int var1 = 50;
    }

    final boolean a(byte param0, pj param1, int param2, int param3, int param4, int param5, int param6) {
        km var8 = null;
        RuntimeException var8_ref = null;
        pj var9 = null;
        int var10 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var10 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var8 = new km(((ta) this).field_x);
              if (param0 < -115) {
                break L1;
              } else {
                String discarded$2 = ((ta) this).g(5);
                break L1;
              }
            }
            var9 = (pj) (Object) var8.d(27935);
            L2: while (true) {
              L3: {
                if (var9 == null) {
                  break L3;
                } else {
                  if (!var9.b(true)) {
                    break L3;
                  } else {
                    if (var9.a((byte) -124, param1, param2, param3 - -((ta) this).field_s, param4, param5, ((ta) this).field_n + param6)) {
                      stackOut_8_0 = 1;
                      stackIn_9_0 = stackOut_8_0;
                      return stackIn_9_0 != 0;
                    } else {
                      var9 = (pj) (Object) var8.b(true);
                      continue L2;
                    }
                  }
                }
              }
              stackOut_11_0 = 0;
              stackIn_12_0 = stackOut_11_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var8_ref;
            stackOut_13_1 = new StringBuilder().append("ta.F(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_12_0 != 0;
    }

    final int f(int param0) {
        int var5 = 0;
        int var6 = OrbDefence.field_D ? 1 : 0;
        int var2 = 0;
        km var3 = new km(((ta) this).field_x);
        pj var4 = (pj) (Object) var3.d(27935);
        while (var4 != null) {
            var5 = var4.f(-20598);
            if (var2 < var5) {
                var2 = var5;
            }
            var4 = (pj) (Object) var3.b(true);
        }
        if (param0 != -20598) {
            ((ta) this).field_x = null;
        }
        return var2;
    }

    final String g(int param0) {
        String var4 = null;
        int var5 = OrbDefence.field_D ? 1 : 0;
        km var2 = new km(((ta) this).field_x);
        pj var3 = (pj) (Object) var2.d(27935);
        while (var3 != null) {
            var4 = var3.g(-8235);
            if (!(var4 == null)) {
                return var4;
            }
            var3 = (pj) (Object) var2.b(true);
        }
        if (param0 == -8235) {
            return null;
        }
        field_z = 53;
        return null;
    }

    final boolean d(int param0) {
        if (param0 != -81) {
            field_z = 68;
        }
        return ((ta) this).b((byte) -109) != null ? true : false;
    }

    final StringBuilder a(byte param0, Hashtable param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        Object stackIn_4_0 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_5_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (!((ta) this).a(9882, param3, param2, param1)) {
                break L1;
              } else {
                ((ta) this).a(param2, (byte) -119, param1, param3);
                this.a(param3, 954, param1, param2);
                break L1;
              }
            }
            if (param0 < -23) {
              stackOut_5_0 = (StringBuilder) param3;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (StringBuilder) (Object) stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("ta.C(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    final static void j() {
        hj var1 = null;
        hj var2 = null;
        int var3 = 0;
        int var4 = OrbDefence.field_D ? 1 : 0;
        try {
            var1 = new hj(540, 140);
            de.a(-128, var1);
            wi.c();
            ul.d();
            ji.field_b = 0;
            bj.j(92);
            var2 = var1.f();
            for (var3 = 0; var3 < 15; var3++) {
                var2.b(-2, -2, 16777215);
                ul.e(4, 4, 0, 0, 540, 140);
            }
            jc.field_k.d();
            var1.d(0, 0);
            int discarded$0 = -105;
            oc.g();
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "ta.EA(" + 0 + ')');
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = OrbDefence.field_D ? 1 : 0;
        if (param2 != 1048575) {
            Object var8 = null;
            boolean discarded$0 = ((ta) this).a(68, (pj) null);
        }
        if (0 == param1) {
            if (!(((ta) this).field_j == null)) {
                ((ta) this).field_j.a(param0, param3, (pj) this, -4394, true);
            }
        }
        km var5 = new km(((ta) this).field_x);
        pj var6 = (pj) (Object) var5.c(-7651);
        while (var6 != null) {
            var6.a(param0 - -((ta) this).field_n, param1, param2, param3 + ((ta) this).field_s);
            var6 = (pj) (Object) var5.a((byte) -116);
        }
    }

    pj b(byte param0) {
        km var2 = null;
        pj var3 = null;
        int var4 = 0;
        L0: {
          var4 = OrbDefence.field_D ? 1 : 0;
          var2 = new km(((ta) this).field_x);
          if (param0 == -109) {
            break L0;
          } else {
            field_z = -74;
            break L0;
          }
        }
        var3 = (pj) (Object) var2.d(param0 + 28044);
        L1: while (true) {
          if (var3 != null) {
            if (var3.d(-81)) {
              return var3;
            } else {
              var3 = (pj) (Object) var2.b(true);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final boolean a(pj param0, boolean param1) {
        km var3 = null;
        RuntimeException var3_ref = null;
        pj var4 = null;
        km var5 = null;
        pj var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (!((ta) this).field_x.c(-3088)) {
              L1: {
                var3 = new km(((ta) this).field_x);
                if (!param1) {
                  break L1;
                } else {
                  field_y = null;
                  break L1;
                }
              }
              var4 = (pj) (Object) var3.c(-7651);
              L2: while (true) {
                if (var4 == null) {
                  stackOut_17_0 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  break L0;
                } else {
                  L3: {
                    if (!var4.d(-81)) {
                      break L3;
                    } else {
                      var5 = new km(((ta) this).field_x);
                      ca discarded$2 = var5.b((ca) (Object) var4, (byte) -120);
                      var6 = (pj) (Object) var5.a((byte) -81);
                      L4: while (true) {
                        if (var6 == null) {
                          break L3;
                        } else {
                          if (var6.a(-81, param0)) {
                            stackOut_13_0 = 1;
                            stackIn_14_0 = stackOut_13_0;
                            return stackIn_14_0 != 0;
                          } else {
                            var6 = (pj) (Object) var5.a((byte) -114);
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                  var4 = (pj) (Object) var3.a((byte) -113);
                  continue L2;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var3_ref;
            stackOut_19_1 = new StringBuilder().append("ta.BA(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param1 + ')');
        }
        return stackIn_18_0 != 0;
    }

    final void a(int param0, int param1, byte param2, pj param3, int param4, int param5) {
        km var7 = null;
        RuntimeException var7_ref = null;
        pj var8 = null;
        int var9 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var9 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var7 = new km(((ta) this).field_x);
            if (param2 < -91) {
              var8 = (pj) (Object) var7.d(27935);
              L1: while (true) {
                L2: {
                  if (var8 == null) {
                    break L2;
                  } else {
                    if (!var8.b(true)) {
                      break L2;
                    } else {
                      var8.a(((ta) this).field_n + param0, param1, (byte) -98, param3, param4 + ((ta) this).field_s, param5);
                      var8 = (pj) (Object) var7.b(true);
                      continue L1;
                    }
                  }
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var7_ref;
            stackOut_8_1 = new StringBuilder().append("ta.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(int param0, wd param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int[] var8_array = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        Object var21 = null;
        fa var21_ref = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        int var44 = 0;
        wd var45 = null;
        int[] var50 = null;
        int[] var55 = null;
        int[] var60 = null;
        byte[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int[] var66 = null;
        int[] var67 = null;
        int stackIn_18_0 = 0;
        int[] stackIn_19_0 = null;
        int[] stackIn_20_0 = null;
        int[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        fa stackIn_40_0 = null;
        int stackIn_46_0 = 0;
        int stackIn_50_0 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_26_0 = 0;
        short stackOut_25_0 = 0;
        int stackOut_29_0 = 0;
        short stackOut_28_0 = 0;
        short stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        fa stackOut_38_0 = null;
        Object stackOut_39_0 = null;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int[] stackOut_18_0 = null;
        int[] stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        var40 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var45 = param1;
                if (var45.field_t == null) {
                  break L2;
                } else {
                  if (var45.field_m > 1) {
                    var62 = var45.field_t;
                    li.a(0, 0, ji.field_a, -86, var62);
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              int discarded$1 = 88;
              fg.b();
              break L1;
            }
            var66 = new int[param1.field_w];
            var60 = var66;
            var55 = var60;
            var50 = var55;
            var41 = var50;
            var8_array = var41;
            var67 = new int[param1.field_w];
            var64 = ee.field_g;
            var63 = cf.field_e;
            var65 = ue.field_H;
            var13 = 0;
            L3: while (true) {
              if (var13 >= param1.field_w) {
                var44 = 0;
                var13 = var44;
                L4: while (true) {
                  if (var44 >= fg.field_u) {
                    break L0;
                  } else {
                    L5: {
                      var14 = dm.field_g[var44];
                      var15 = param1.field_M[var14];
                      var16 = param1.field_e[var14];
                      var17 = param1.field_l[var14];
                      if (ee.field_g.length <= param1.field_q[var14]) {
                        stackOut_26_0 = -1;
                        stackIn_27_0 = stackOut_26_0;
                        break L5;
                      } else {
                        stackOut_25_0 = param1.field_q[var14];
                        stackIn_27_0 = stackOut_25_0;
                        break L5;
                      }
                    }
                    L6: {
                      var18 = stackIn_27_0;
                      if (param1.field_y[var14] >= ee.field_g.length) {
                        stackOut_29_0 = -1;
                        stackIn_30_0 = stackOut_29_0;
                        break L6;
                      } else {
                        stackOut_28_0 = param1.field_y[var14];
                        stackIn_30_0 = stackOut_28_0;
                        break L6;
                      }
                    }
                    L7: {
                      var19 = stackIn_30_0;
                      if (param1.field_i[var14] < ee.field_g.length) {
                        stackOut_32_0 = param1.field_i[var14];
                        stackIn_33_0 = stackOut_32_0;
                        break L7;
                      } else {
                        stackOut_31_0 = -1;
                        stackIn_33_0 = stackOut_31_0;
                        break L7;
                      }
                    }
                    L8: {
                      L9: {
                        var20 = stackIn_33_0;
                        if (null == cg.field_c) {
                          break L9;
                        } else {
                          if (param1.field_N == null) {
                            break L9;
                          } else {
                            if (var14 >= param1.field_N.length) {
                              break L9;
                            } else {
                              if (param1.field_N[var14] == -1) {
                                break L9;
                              } else {
                                if (param1.field_N[var14] >= cg.field_c.length) {
                                  break L9;
                                } else {
                                  stackOut_38_0 = cg.field_c[param1.field_N[var14]];
                                  stackIn_40_0 = stackOut_38_0;
                                  break L8;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_39_0 = null;
                      stackIn_40_0 = (fa) (Object) stackOut_39_0;
                      break L8;
                    }
                    L10: {
                      L11: {
                        var21_ref = stackIn_40_0;
                        var22 = a.field_t[var15];
                        var23 = ph.field_x[var15];
                        var24 = a.field_t[var16];
                        var25 = ph.field_x[var16];
                        var26 = a.field_t[var17];
                        var27 = ph.field_x[var17];
                        if (var18 != var19) {
                          break L11;
                        } else {
                          if (var19 == var20) {
                            L12: {
                              var28 = var66[var18];
                              var29 = var67[var18];
                              if (var21_ref != null) {
                                stackOut_49_0 = var21_ref.field_d;
                                stackIn_50_0 = stackOut_49_0;
                                break L12;
                              } else {
                                stackOut_48_0 = 8355711;
                                stackIn_50_0 = stackOut_48_0;
                                break L12;
                              }
                            }
                            var30 = stackIn_50_0;
                            var31 = 16711935 & var30;
                            var32 = var30 & 65280;
                            var33 = (var28 * var32 & 16711902) >>> 8 | var31 * var28 >>> 8 & 1878982911;
                            var33 = var33 + 65793 * var29;
                            gi.a((var33 & 16711422) >> 1, var27, var26, var23, -54, var24, var25, var22);
                            break L10;
                          } else {
                            break L11;
                          }
                        }
                      }
                      L13: {
                        var28 = var66[var18];
                        var29 = var66[var19];
                        var30 = var66[var20];
                        var31 = var67[var18];
                        var32 = var67[var19];
                        var33 = var67[var20];
                        if (var21_ref != null) {
                          stackOut_45_0 = var21_ref.field_d;
                          stackIn_46_0 = stackOut_45_0;
                          break L13;
                        } else {
                          stackOut_44_0 = 8355711;
                          stackIn_46_0 = stackOut_44_0;
                          break L13;
                        }
                      }
                      var34 = stackIn_46_0;
                      var35 = 16711935 & var34;
                      var36 = var34 & 65280;
                      var37 = (-16711738 & var35 * var28) >>> 8 | (var36 * var28 & 16711772) >>> 8;
                      var38 = (-16711687 & var35 * var29) >>> 8 | (var29 * var36 & 16711710) >>> 8;
                      var39 = (var30 * var36 & 16711926) >>> 8 | (var30 * var35 & -16711931) >>> 8;
                      var38 = var38 + var32 * 65793;
                      var37 = var37 + 65793 * var31;
                      var39 = var39 + var33 * 65793;
                      dd.a(var37 >> 8 & 255, var37 >> 16, var38 >> 16, 255 & var37, (65431 & var38) >> 8, var27, var23, var26, var38 & 255, var24, false, 255 & var39, var39 >> 16, (var39 & 65535) >> 8, var25, var22);
                      break L10;
                    }
                    var44++;
                    continue L4;
                  }
                }
              } else {
                L14: {
                  var14 = param0 * var63[var13] + param6 * var64[var13] - -(var65[var13] * param3) >> 8;
                  if (var14 < 0) {
                    var14 = -var14;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (var14 < 0) {
                    stackOut_17_0 = 128;
                    stackIn_18_0 = stackOut_17_0;
                    break L15;
                  } else {
                    if (var14 >= 128) {
                      stackOut_16_0 = 256;
                      stackIn_18_0 = stackOut_16_0;
                      break L15;
                    } else {
                      stackOut_15_0 = var14 + 128;
                      stackIn_18_0 = stackOut_15_0;
                      break L15;
                    }
                  }
                }
                L16: {
                  var14 = stackIn_18_0;
                  var15 = param4 * var65[var13] + (var64[var13] * param2 - -(param5 * var63[var13])) >> 8;
                  stackOut_18_0 = dk.field_c;
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_19_0 = stackOut_18_0;
                  if (var15 >= 0) {
                    stackOut_20_0 = (int[]) (Object) stackIn_20_0;
                    stackOut_20_1 = var15;
                    stackIn_21_0 = stackOut_20_0;
                    stackIn_21_1 = stackOut_20_1;
                    break L16;
                  } else {
                    stackOut_19_0 = (int[]) (Object) stackIn_19_0;
                    stackOut_19_1 = -var15;
                    stackIn_21_0 = stackOut_19_0;
                    stackIn_21_1 = stackOut_19_1;
                    break L16;
                  }
                }
                var15 = stackIn_21_0[stackIn_21_1];
                var14 = (-var15 + 256) * var14 >>> 8;
                var66[var13] = var14;
                var67[var13] = var15;
                var13++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var8 = decompiledCaughtException;
            stackOut_53_0 = (RuntimeException) var8;
            stackOut_53_1 = new StringBuilder().append("ta.DA(").append(param0).append(',');
            stackIn_55_0 = stackOut_53_0;
            stackIn_55_1 = stackOut_53_1;
            stackIn_54_0 = stackOut_53_0;
            stackIn_54_1 = stackOut_53_1;
            if (param1 == null) {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "null";
              stackIn_56_0 = stackOut_55_0;
              stackIn_56_1 = stackOut_55_1;
              stackIn_56_2 = stackOut_55_2;
              break L17;
            } else {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "{...}";
              stackIn_56_0 = stackOut_54_0;
              stackIn_56_1 = stackOut_54_1;
              stackIn_56_2 = stackOut_54_2;
              break L17;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_56_0, stackIn_56_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + 23 + ')');
        }
    }

    final void a(pj param0, byte param1) {
        try {
            if (param1 != 74) {
                Object var4 = null;
                boolean discarded$0 = ((ta) this).a((pj) null, true);
            }
            ((ta) this).field_x.a(-100, (ca) (Object) param0);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "ta.JA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void i(int param0) {
        int var4 = OrbDefence.field_D ? 1 : 0;
        if (param0 != 0) {
            return;
        }
        km var2 = new km(((ta) this).field_x);
        pj var3 = (pj) (Object) var2.d(param0 + 27935);
        while (var3 != null) {
            var3.c(param0 ^ -26385);
            var3 = (pj) (Object) var2.b(true);
        }
    }

    void a(byte param0, pj param1, int param2, int param3) {
        km var5 = null;
        RuntimeException var5_ref = null;
        pj var6 = null;
        int var7 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            super.a(param0, param1, param2, param3);
            var5 = new km(((ta) this).field_x);
            var6 = (pj) (Object) var5.d(27935);
            L1: while (true) {
              L2: {
                if (var6 == null) {
                  break L2;
                } else {
                  if (!var6.b(true)) {
                    break L2;
                  } else {
                    var6.a((byte) -77, param1, param2 - -((ta) this).field_s, ((ta) this).field_n + param3);
                    var6 = (pj) (Object) var5.b(true);
                    continue L1;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5_ref;
            stackOut_6_1 = new StringBuilder().append("ta.A(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    boolean a(char param0, int param1, pj param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        pj var9 = null;
        km var10 = null;
        int stackIn_8_0 = 0;
        boolean stackIn_15_0 = false;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        boolean stackOut_14_0 = false;
        boolean stackOut_13_0 = false;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var10 = new km(((ta) this).field_x);
            var9 = (pj) (Object) var10.d(27935);
            L1: while (true) {
              L2: {
                if (var9 == null) {
                  break L2;
                } else {
                  if (!var9.b(true)) {
                    break L2;
                  } else {
                    L3: {
                      if (!var9.d(-81)) {
                        break L3;
                      } else {
                        if (var9.a(param0, param1, param2, 0)) {
                          stackOut_7_0 = 1;
                          stackIn_8_0 = stackOut_7_0;
                          return stackIn_8_0 != 0;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var9 = (pj) (Object) var10.b(true);
                    continue L1;
                  }
                }
              }
              var6 = param1;
              if (var6 == 80) {
                L4: {
                  if (!ek.field_a[81]) {
                    stackOut_14_0 = ((ta) this).b(param2, false);
                    stackIn_15_0 = stackOut_14_0;
                    break L4;
                  } else {
                    stackOut_13_0 = ((ta) this).a(param2, false);
                    stackIn_15_0 = stackOut_13_0;
                    break L4;
                  }
                }
                return stackIn_15_0;
              } else {
                L5: {
                  if (param3 == 0) {
                    break L5;
                  } else {
                    var8 = null;
                    ta.a(5, (kc) null, (kc) null, -95);
                    break L5;
                  }
                }
                stackOut_18_0 = 0;
                stackIn_19_0 = stackOut_18_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var5;
            stackOut_20_1 = new StringBuilder().append("ta.I(").append(param0).append(',').append(param1).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param3 + ')');
        }
        return stackIn_19_0 != 0;
    }

    final boolean a(int param0, pj param1) {
        km var3 = null;
        RuntimeException var3_ref = null;
        pj var4 = null;
        int var5 = 0;
        Object var6 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var3 = new km(((ta) this).field_x);
              if (param0 == -81) {
                break L1;
              } else {
                var6 = null;
                ((ta) this).a(-83, 78, (byte) -38, (pj) null, 11, -89);
                break L1;
              }
            }
            var4 = (pj) (Object) var3.d(27935);
            L2: while (true) {
              if (var4 == null) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                if (!var4.a(param0, param1)) {
                  var4 = (pj) (Object) var3.b(true);
                  continue L2;
                } else {
                  stackOut_6_0 = 1;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("ta.E(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_10_0 != 0;
    }

    ta(int param0, int param1, int param2, int param3, td param4) {
        super(param0, param1, param2, param3, param4, (ag) null);
        ((ta) this).field_x = new im();
    }

    final void h(int param0) {
        int var4 = OrbDefence.field_D ? 1 : 0;
        if (param0 != 0) {
            return;
        }
        km var2 = new km(((ta) this).field_x);
        pj var3 = (pj) (Object) var2.d(27935);
        while (var3 != null) {
            var3.h(param0);
            var3 = (pj) (Object) var2.b(true);
        }
    }

    final boolean b(pj param0, boolean param1) {
        km var3 = null;
        RuntimeException var3_ref = null;
        pj var4 = null;
        km var5 = null;
        pj var6 = null;
        int var7 = 0;
        int stackIn_5_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                this.i(24);
                break L1;
              }
            }
            if (!((ta) this).field_x.c(-3088)) {
              var3 = new km(((ta) this).field_x);
              var4 = (pj) (Object) var3.d(27935);
              L2: while (true) {
                if (var4 == null) {
                  stackOut_17_0 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  break L0;
                } else {
                  L3: {
                    if (!var4.d(-81)) {
                      break L3;
                    } else {
                      var5 = new km(((ta) this).field_x);
                      ca discarded$2 = var5.a((ca) (Object) var4, (byte) -1);
                      var6 = (pj) (Object) var5.b(true);
                      L4: while (true) {
                        if (var6 == null) {
                          break L3;
                        } else {
                          if (var6.a(-81, param0)) {
                            stackOut_13_0 = 1;
                            stackIn_14_0 = stackOut_13_0;
                            return stackIn_14_0 != 0;
                          } else {
                            var6 = (pj) (Object) var5.b(true);
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                  var4 = (pj) (Object) var3.b(true);
                  continue L2;
                }
              }
            } else {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var3_ref;
            stackOut_19_1 = new StringBuilder().append("ta.CA(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param1 + ')');
        }
        return stackIn_18_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
    }
}
