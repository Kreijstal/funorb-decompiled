/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class hn extends gm implements cj {
    static int field_z;
    static String field_A;
    ei field_y;
    static int field_x;

    final static void a(String param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -71) {
                break L1;
              } else {
                field_x = 53;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("hn.CB(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    private final void a(StringBuilder param0, int param1, Hashtable param2) {
        re var5 = null;
        RuntimeException var5_ref = null;
        gm var6 = null;
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
        var8 = Torquing.field_u;
        try {
          L0: {
            var5 = new re(((hn) this).field_y);
            var6 = (gm) (Object) var5.a((byte) 106);
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                StringBuilder discarded$12 = param0.append('\n');
                var7 = 0;
                L2: while (true) {
                  if (var7 > param1) {
                    StringBuilder discarded$13 = var6.a(param0, (byte) 117, param2, 1 + param1);
                    var6 = (gm) (Object) var5.b(true);
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
            stackOut_8_1 = new StringBuilder().append("hn.AB(");
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
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');
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
          throw rb.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + 114 + ')');
        }
    }

    final boolean a(int param0, boolean param1, int param2, int param3, gm param4, int param5, int param6) {
        re var8 = null;
        RuntimeException var8_ref = null;
        gm var9 = null;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var10 = Torquing.field_u;
        try {
          L0: {
            var8 = new re(((hn) this).field_y);
            if (!param1) {
              var9 = (gm) (Object) var8.a((byte) 124);
              L1: while (true) {
                L2: {
                  if (var9 == null) {
                    break L2;
                  } else {
                    if (!var9.e(17)) {
                      break L2;
                    } else {
                      L3: {
                        if (!var9.g(2)) {
                          break L3;
                        } else {
                          if (var9.a(param0, false, param2, param3, param4, param5, param6)) {
                            stackOut_10_0 = 1;
                            stackIn_11_0 = stackOut_10_0;
                            return stackIn_11_0 != 0;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var9 = (gm) (Object) var8.b(true);
                      continue L1;
                    }
                  }
                }
                stackOut_13_0 = 0;
                stackIn_14_0 = stackOut_13_0;
                break L0;
              }
            } else {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var8_ref;
            stackOut_15_1 = new StringBuilder().append("hn.IA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param4 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_14_0 != 0;
    }

    void a(int param0, byte param1, int param2, int param3) {
        int var7 = Torquing.field_u;
        if (param1 > -7) {
            field_z = -92;
        }
        if (0 == param0) {
            if (!(((hn) this).field_q == null)) {
                ((hn) this).field_q.a(127, param2, param3, true, (gm) this);
            }
        }
        re var5 = new re(((hn) this).field_y);
        gm var6 = (gm) (Object) var5.a(17514);
        while (var6 != null) {
            var6.a(param0, (byte) -107, ((hn) this).field_k + param2, param3 - -((hn) this).field_w);
            var6 = (gm) (Object) var5.a(true);
        }
    }

    final void a(gm param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((hn) this).field_y.a((byte) 54, (q) (Object) param0);
              if (param1 == -6938) {
                break L1;
              } else {
                ((hn) this).a(69, (byte) -75, 83, -7);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("hn.JB(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    private final void a() {
        int var4 = Torquing.field_u;
        re var2 = new re(((hn) this).field_y);
        gm var3 = (gm) (Object) var2.a((byte) 66);
        while (var3 != null) {
            var3.e((byte) 88);
            var3 = (gm) (Object) var2.b(true);
        }
    }

    final void a(int param0, int param1, int param2, byte param3, gm param4, int param5) {
        re var7 = null;
        RuntimeException var7_ref = null;
        gm var8 = null;
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
        var9 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var7 = new re(((hn) this).field_y);
              if (param3 > 109) {
                break L1;
              } else {
                ((hn) this).field_y = null;
                break L1;
              }
            }
            var8 = (gm) (Object) var7.a((byte) 110);
            L2: while (true) {
              L3: {
                if (var8 == null) {
                  break L3;
                } else {
                  if (!var8.e(17)) {
                    break L3;
                  } else {
                    var8.a(((hn) this).field_k + param0, ((hn) this).field_w + param1, param2, (byte) 116, param4, param5);
                    var8 = (gm) (Object) var7.b(true);
                    continue L2;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var7_ref;
            stackOut_8_1 = new StringBuilder().append("hn.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param4 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param5 + ')');
        }
    }

    final StringBuilder a(StringBuilder param0, byte param1, Hashtable param2, int param3) {
        RuntimeException var5 = null;
        Object var6 = null;
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
              if (param1 == 117) {
                break L1;
              } else {
                var6 = null;
                boolean discarded$4 = ((hn) this).a(-99, -92, -99, -25, -38, (gm) null, (byte) 51);
                break L1;
              }
            }
            L2: {
              if (((hn) this).a(-31866, param0, param2, param3)) {
                ((hn) this).a(param0, param3, true, param2);
                int discarded$5 = 114;
                this.a(param0, param3, param2);
                break L2;
              } else {
                break L2;
              }
            }
            stackOut_5_0 = (StringBuilder) param0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("hn.O(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    final boolean b(gm param0, int param1) {
        RuntimeException var3 = null;
        gm var4 = null;
        re var5 = null;
        gm var6 = null;
        int var7 = 0;
        re var8 = null;
        int stackIn_4_0 = 0;
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
        int stackOut_3_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var7 = Torquing.field_u;
        try {
          L0: {
            if (((hn) this).field_y.e(-93)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                var8 = new re(((hn) this).field_y);
                var4 = (gm) (Object) var8.a((byte) 84);
                if (param1 == -9928) {
                  break L1;
                } else {
                  field_z = 67;
                  break L1;
                }
              }
              L2: while (true) {
                if (var4 == null) {
                  stackOut_17_0 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  break L0;
                } else {
                  L3: {
                    if (!var4.g(2)) {
                      break L3;
                    } else {
                      var5 = new re(((hn) this).field_y);
                      q discarded$2 = var5.a(param1 + 23699, (q) (Object) var4);
                      var6 = (gm) (Object) var5.b(true);
                      L4: while (true) {
                        if (var6 == null) {
                          break L3;
                        } else {
                          if (var6.a(param0, false)) {
                            stackOut_13_0 = 1;
                            stackIn_14_0 = stackOut_13_0;
                            return stackIn_14_0 != 0;
                          } else {
                            var6 = (gm) (Object) var5.b(true);
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                  var4 = (gm) (Object) var8.b(true);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var3;
            stackOut_19_1 = new StringBuilder().append("hn.EB(");
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
          throw rb.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param1 + ')');
        }
        return stackIn_18_0 != 0;
    }

    final String b(int param0) {
        re var2 = null;
        gm var3 = null;
        String var4 = null;
        int var5 = 0;
        L0: {
          var5 = Torquing.field_u;
          var2 = new re(((hn) this).field_y);
          var3 = (gm) (Object) var2.a((byte) 63);
          if (param0 == 0) {
            break L0;
          } else {
            field_A = null;
            break L0;
          }
        }
        L1: while (true) {
          if (var3 != null) {
            var4 = var3.b(0);
            if (var4 != null) {
              return var4;
            } else {
              var3 = (gm) (Object) var2.b(true);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final boolean a(byte param0, gm param1) {
        re var3 = null;
        RuntimeException var3_ref = null;
        gm var4 = null;
        int var5 = 0;
        re var6 = null;
        gm var7 = null;
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var8 = Torquing.field_u;
        try {
          L0: {
            if (((hn) this).field_y.e(-102)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              var3 = new re(((hn) this).field_y);
              var5 = -124 / ((param0 - -40) / 51);
              var4 = (gm) (Object) var3.a(17514);
              L1: while (true) {
                if (var4 == null) {
                  stackOut_16_0 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  break L0;
                } else {
                  L2: {
                    if (var4.g(2)) {
                      var6 = new re(((hn) this).field_y);
                      q discarded$2 = var6.a((q) (Object) var4, -27392);
                      var7 = (gm) (Object) var6.a(true);
                      L3: while (true) {
                        if (var7 == null) {
                          break L2;
                        } else {
                          if (!var7.a(param1, false)) {
                            var7 = (gm) (Object) var6.a(true);
                            continue L3;
                          } else {
                            stackOut_12_0 = 1;
                            stackIn_13_0 = stackOut_12_0;
                            return stackIn_13_0 != 0;
                          }
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                  var4 = (gm) (Object) var3.a(true);
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3_ref;
            stackOut_18_1 = new StringBuilder().append("hn.DB(").append(param0).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
        return stackIn_17_0 != 0;
    }

    final int d(byte param0) {
        int var5 = 0;
        int var6 = Torquing.field_u;
        int var2 = 0;
        re var3 = new re(((hn) this).field_y);
        if (param0 != 28) {
            return -77;
        }
        gm var4 = (gm) (Object) var3.a((byte) 126);
        while (var4 != null) {
            var5 = var4.d((byte) 28);
            if (!(var5 <= var2)) {
                var2 = var5;
            }
            var4 = (gm) (Object) var3.b(true);
        }
        return var2;
    }

    void a(int param0, gm param1, int param2, int param3) {
        re var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        gm var7 = null;
        int var8 = 0;
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
        var8 = Torquing.field_u;
        try {
          L0: {
            super.a(-123, param1, param2, param3);
            var6 = -74 % ((param0 - -28) / 43);
            var5 = new re(((hn) this).field_y);
            var7 = (gm) (Object) var5.a((byte) 29);
            L1: while (true) {
              L2: {
                if (var7 == null) {
                  break L2;
                } else {
                  if (!var7.e(17)) {
                    break L2;
                  } else {
                    var7.a(113, param1, ((hn) this).field_k + param2, ((hn) this).field_w + param3);
                    var7 = (gm) (Object) var5.b(true);
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
            stackOut_6_1 = new StringBuilder().append("hn.P(").append(param0).append(',');
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
          throw rb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void c(byte param0) {
        int var4 = Torquing.field_u;
        re var2 = new re(((hn) this).field_y);
        if (param0 < 89) {
            ((hn) this).field_y = null;
        }
        gm var3 = (gm) (Object) var2.a((byte) 84);
        while (var3 != null) {
            var3.c((byte) 92);
            var3 = (gm) (Object) var2.b(true);
        }
    }

    final boolean g(int param0) {
        if (param0 != 2) {
            String discarded$0 = ((hn) this).b(57);
        }
        return ((hn) this).a(0) != null ? true : false;
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        super.a((byte) 6, param1, param2, param3, param4);
        int var6 = -94 % ((param0 - 66) / 57);
        int discarded$0 = 1;
        this.a();
    }

    hn(int param0, int param1, int param2, int param3, el param4) {
        super(param0, param1, param2, param3, param4, (ca) null);
        ((hn) this).field_y = new ei();
    }

    gm a(int param0) {
        int var4 = Torquing.field_u;
        re var2 = new re(((hn) this).field_y);
        gm var3 = (gm) (Object) var2.a((byte) 49);
        while (var3 != null) {
            if (!(!var3.g(2))) {
                return var3;
            }
            var3 = (gm) (Object) var2.b(true);
        }
        if (param0 == 0) {
            return null;
        }
        String discarded$0 = ((hn) this).b(19);
        return null;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, gm param5, byte param6) {
        re var8 = null;
        RuntimeException var8_ref = null;
        gm var9 = null;
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
        var10 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var8 = new re(((hn) this).field_y);
              if (param6 > 5) {
                break L1;
              } else {
                hn.f((byte) 79);
                break L1;
              }
            }
            var9 = (gm) (Object) var8.a((byte) 122);
            L2: while (true) {
              L3: {
                if (var9 == null) {
                  break L3;
                } else {
                  if (!var9.e(17)) {
                    break L3;
                  } else {
                    if (var9.a(param0, param1 + ((hn) this).field_w, ((hn) this).field_k + param2, param3, param4, param5, (byte) 58)) {
                      stackOut_8_0 = 1;
                      stackIn_9_0 = stackOut_8_0;
                      return stackIn_9_0 != 0;
                    } else {
                      var9 = (gm) (Object) var8.b(true);
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
            stackOut_13_1 = new StringBuilder().append("hn.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param5 == null) {
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
          throw rb.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param6 + ')');
        }
        return stackIn_12_0 != 0;
    }

    final boolean a(gm param0, boolean param1) {
        re var3 = null;
        RuntimeException var3_ref = null;
        gm var4 = null;
        int var5 = 0;
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
        var5 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var3 = new re(((hn) this).field_y);
              if (!param1) {
                break L1;
              } else {
                field_A = null;
                break L1;
              }
            }
            var4 = (gm) (Object) var3.a((byte) 83);
            L2: while (true) {
              if (var4 == null) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                if (!var4.a(param0, false)) {
                  var4 = (gm) (Object) var3.b(true);
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
            stackOut_11_1 = new StringBuilder().append("hn.JA(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
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
          throw rb.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
        return stackIn_10_0 != 0;
    }

    public static void f(byte param0) {
        if (param0 != 2) {
            Object var2 = null;
            hn.a((String) null, (byte) -33);
        }
        field_A = null;
    }

    boolean a(int param0, gm param1, char param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        re var6 = null;
        int var7 = 0;
        int var8 = 0;
        gm var9 = null;
        int stackIn_7_0 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_14_0 = 0;
        boolean stackOut_12_0 = false;
        boolean stackOut_11_0 = false;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var8 = Torquing.field_u;
        try {
          L0: {
            var5_int = -43 % ((param3 - -33) / 57);
            var6 = new re(((hn) this).field_y);
            var9 = (gm) (Object) var6.a((byte) 125);
            L1: while (true) {
              L2: {
                if (var9 == null) {
                  break L2;
                } else {
                  if (!var9.e(17)) {
                    break L2;
                  } else {
                    L3: {
                      if (!var9.g(2)) {
                        break L3;
                      } else {
                        if (!var9.a(param0, param1, param2, 41)) {
                          break L3;
                        } else {
                          stackOut_6_0 = 1;
                          stackIn_7_0 = stackOut_6_0;
                          return stackIn_7_0 != 0;
                        }
                      }
                    }
                    var9 = (gm) (Object) var6.b(true);
                    continue L1;
                  }
                }
              }
              var7 = param0;
              if (var7 != 80) {
                stackOut_14_0 = 0;
                stackIn_15_0 = stackOut_14_0;
                break L0;
              } else {
                L4: {
                  if (i.field_P[81]) {
                    stackOut_12_0 = ((hn) this).a((byte) -125, param1);
                    stackIn_13_0 = stackOut_12_0;
                    break L4;
                  } else {
                    stackOut_11_0 = ((hn) this).b(param1, -9928);
                    stackIn_13_0 = stackOut_11_0;
                    break L4;
                  }
                }
                return stackIn_13_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var5;
            stackOut_16_1 = new StringBuilder().append("hn.D(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_15_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "Loading sound effects";
    }
}
