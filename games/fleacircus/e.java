/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

class e implements ch, eg {
    private boolean field_l;
    static String field_g;
    int field_d;
    int field_i;
    fa field_j;
    int field_n;
    private int field_a;
    int field_h;
    int field_f;
    int field_k;
    int field_o;
    int field_c;
    int field_p;
    int field_m;
    static int field_b;
    static int field_e;

    final static String a(CharSequence param0, boolean param1, int param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_3_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_9_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var5 = fleas.field_A ? 1 : 0;
        try {
          var3 = fi.a(param0, param1, (byte) 124);
          if (var3 == null) {
            var4 = 0;
            L0: while (true) {
              if (param0.length() > var4) {
                if (!gi.a(45, param0.charAt(var4))) {
                  stackOut_9_0 = sd.field_b;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                return null;
              }
            }
          } else {
            stackOut_2_0 = (String) var3;
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("e.U(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L1;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L1;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 44 + 0 + 41);
        }
    }

    private final void a(int param0, int param1, int param2, qa param3, int param4, int param5, int param6, int param7) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var14 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var10 = -16 / ((54 - param2) / 63);
              mi.a((byte) -52, param3.field_u + (param3.field_y + param1), param1 + param3.field_y, param3.field_j + (param3.field_z + param5), param3.field_z + param5);
              var9_int = ((e) this).b(param3, (byte) -50);
              var11 = this.a(param3, 122);
              if (((e) this).field_l) {
                int discarded$1 = ((e) this).field_j.a(((e) this).c(66, param3), this.a(param3, param4, true, param1), this.a(param3, param5, param0, -3), var9_int, var11, param7, param6, ((e) this).field_i, ((e) this).field_h, ((e) this).field_d);
                break L1;
              } else {
                L2: {
                  var13 = ((e) this).field_h;
                  if (var13 != 0) {
                    if (var13 == 2) {
                      var12 = var11 + -((e) this).field_j.field_K;
                      break L2;
                    } else {
                      L3: {
                        if (3 != var13) {
                          if (var13 != 1) {
                            break L3;
                          } else {
                            break L3;
                          }
                        } else {
                          break L3;
                        }
                      }
                      var12 = (-((e) this).field_j.field_H + var11 + -((e) this).field_j.field_K >> 1) + ((e) this).field_j.field_H;
                      break L2;
                    }
                  } else {
                    var12 = ((e) this).field_j.field_H;
                    break L2;
                  }
                }
                L4: {
                  var13 = ((e) this).field_i;
                  if (var13 != 0) {
                    if (var13 == 3) {
                      break L4;
                    } else {
                      if (var13 == 1) {
                        ((e) this).field_j.a(((e) this).c(45, param3), (var9_int >> 1) + this.a(param3, param4, true, param1), this.a(param3, param5, param0, -3) + var12, param7, param6);
                        break L1;
                      } else {
                        if (var13 == 2) {
                          ((e) this).field_j.b(((e) this).c(90, param3), this.a(param3, param4, true, param1) + var9_int, var12 + this.a(param3, param5, param0, -3), param7, param6);
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                ((e) this).field_j.c(((e) this).c(31, param3), this.a(param3, param4, true, param1), var12 + this.a(param3, param5, param0, -3), param7, param6);
                break L1;
              }
            }
            ia.a(-99);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var9 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var9;
            stackOut_24_1 = new StringBuilder().append("e.T(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param3 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L5;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L5;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    public final int b(qa param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 < -37) {
              stackOut_3_0 = -((e) this).field_o + (-((e) this).field_n + param0.field_u);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 126;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("e.E(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
        return stackIn_4_0;
    }

    private final int a(qa param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            stackOut_2_0 = param0.field_z + (param1 + (((e) this).field_m + (param0.field_n + param2)));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("e.S(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 44 + param2 + 44 + -3 + 41);
        }
        return stackIn_3_0;
    }

    private final void a(qa param0, int param1, int param2, byte param3) {
        try {
            this.a(0, param1, 120, param0, 0, param2, ((e) this).field_a, ((e) this).field_f);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "e.V(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + -34 + 41);
        }
    }

    final void a(int param0, e param1) {
        try {
            param1.field_m = ((e) this).field_m;
            param1.field_k = ((e) this).field_k;
            if (param0 != 2) {
                Object var4 = null;
                this.c((qa) null, (byte) 95);
            }
            param1.field_a = ((e) this).field_a;
            param1.field_o = ((e) this).field_o;
            param1.field_l = ((e) this).field_l;
            param1.field_c = ((e) this).field_c;
            param1.field_n = ((e) this).field_n;
            param1.field_f = ((e) this).field_f;
            param1.field_p = ((e) this).field_p;
            param1.field_j = ((e) this).field_j;
            param1.field_i = ((e) this).field_i;
            param1.field_h = ((e) this).field_h;
            param1.field_d = ((e) this).field_d;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "e.R(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public final void a(int param0, int param1, qa param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        pi var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Object var13 = null;
        ne var14 = null;
        ne var15 = null;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                var13 = null;
                int discarded$1 = ((e) this).a(67, (qa) null);
                break L1;
              }
            }
            L2: {
              if (!param2.e(1)) {
                break L2;
              } else {
                L3: {
                  var14 = ((e) this).a(param2, (byte) -35);
                  var15 = var14;
                  var7 = var15.b(param3, -1);
                  var8 = var14.field_c[var7];
                  var9 = var15.c(-1, param3);
                  var10 = this.a(param2, var9, true, param4);
                  var11 = ((e) this).a(param0, param2, (byte) 60) - -Math.max(0, var8.field_a);
                  stackOut_3_0 = ((e) this).a(param0, param2, (byte) -82);
                  stackOut_3_1 = this.a(param2, -21);
                  stackOut_3_2 = var8.field_c;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_5_1 = stackOut_3_1;
                  stackIn_5_2 = stackOut_3_2;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  stackIn_4_2 = stackOut_3_2;
                  if (1 + var7 < var15.field_c.length) {
                    stackOut_5_0 = stackIn_5_0;
                    stackOut_5_1 = stackIn_5_1;
                    stackOut_5_2 = stackIn_5_2;
                    stackOut_5_3 = var14.field_c[1 + var7].field_a;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    stackIn_6_2 = stackOut_5_2;
                    stackIn_6_3 = stackOut_5_3;
                    break L3;
                  } else {
                    stackOut_4_0 = stackIn_4_0;
                    stackOut_4_1 = stackIn_4_1;
                    stackOut_4_2 = stackIn_4_2;
                    stackOut_4_3 = var8.field_c;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    stackIn_6_2 = stackOut_4_2;
                    stackIn_6_3 = stackOut_4_3;
                    break L3;
                  }
                }
                var12 = stackIn_6_0 + Math.min(stackIn_6_1, Math.min(stackIn_6_2, stackIn_6_3));
                mi.a((byte) -52, param2.field_u + (param4 + param2.field_y), param4 - -param2.field_y, param0 - (-param2.field_z - param2.field_j), param0 - -param2.field_z);
                nf.field_M.a(param1 ^ 4, var10, var11, var12, ((e) this).field_c, var10);
                ia.a(-69);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var6;
            stackOut_8_1 = new StringBuilder().append("e.D(").append(param0).append(44).append(param1).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
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
          throw pf.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    public final int a(byte param0) {
        Object var3 = null;
        if (param0 != 127) {
          var3 = null;
          int discarded$2 = this.a((qa) null, -117);
          return ((e) this).field_j.field_H - -((e) this).field_j.field_K;
        } else {
          return ((e) this).field_j.field_H - -((e) this).field_j.field_K;
        }
    }

    public final void a(qa param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        pi var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        ne var17 = null;
        ne var18 = null;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var16 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (param4 == -30298) {
              if (param1 != param3) {
                if (param0.e(1)) {
                  L1: {
                    var17 = ((e) this).a(param0, (byte) -35);
                    var18 = var17;
                    if (param1 > param3) {
                      var8 = param3;
                      var9 = param1;
                      break L1;
                    } else {
                      var9 = param3;
                      var8 = param1;
                      break L1;
                    }
                  }
                  var10 = var18.b(var8, -1);
                  var11 = var18.b(var9, -1);
                  mi.a((byte) -52, param0.field_u + param5 + param0.field_y, param5 - -param0.field_y, param0.field_z + param2 - -param0.field_j, param2 - -param0.field_z);
                  var12 = var10;
                  L2: while (true) {
                    if (var11 < var12) {
                      ia.a(-69);
                      break L0;
                    } else {
                      L3: {
                        var13 = var17.field_c[var12];
                        if (var12 == var10) {
                          stackOut_14_0 = var18.c(-1, var8);
                          stackIn_15_0 = stackOut_14_0;
                          break L3;
                        } else {
                          stackOut_13_0 = var13.field_d[0];
                          stackIn_15_0 = stackOut_13_0;
                          break L3;
                        }
                      }
                      L4: {
                        var14 = stackIn_15_0;
                        if (var11 == var12) {
                          stackOut_19_0 = var18.c(-1, var9);
                          stackIn_20_0 = stackOut_19_0;
                          break L4;
                        } else {
                          if (var13 != null) {
                            stackOut_18_0 = var13.field_d[-1 + var13.field_d.length];
                            stackIn_20_0 = stackOut_18_0;
                            break L4;
                          } else {
                            stackOut_17_0 = 0;
                            stackIn_20_0 = stackOut_17_0;
                            break L4;
                          }
                        }
                      }
                      var15 = stackIn_20_0;
                      nf.field_M.a(((e) this).field_p >>> 24, var15 + -var14, false, ((e) this).field_p, var13.field_c, ((e) this).field_m + param2 - -param0.field_z + (param0.field_n - -var13.field_a), this.a(param0, var14, true, param5));
                      var12++;
                      continue L2;
                    }
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var7 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var7;
            stackOut_23_1 = new StringBuilder().append("e.J(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L5;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L5;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    public final int a(boolean param0, int param1, qa param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                ((e) this).field_d = 20;
                break L1;
              }
            }
            stackOut_2_0 = this.a(param2, 0, true, param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("e.G(").append(param0).append(44).append(param1).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    public final ne a(qa param0, byte param1) {
        RuntimeException var3 = null;
        Object stackIn_8_0 = null;
        ne stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        ne stackOut_9_0 = null;
        Object stackOut_7_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (null == param0.field_w) {
                param0.field_w = (ne) (Object) new j();
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((e) this).field_l) {
                ((j) (Object) param0.field_w).a(true, ((e) this).field_d, ((e) this).field_i, ((e) this).field_j, ((e) this).c(param1 ^ -93, param0), ((e) this).b(param0, (byte) -98), ((e) this).field_h, this.a(param0, 122));
                break L2;
              } else {
                this.c(param0, (byte) 64);
                break L2;
              }
            }
            if (param1 == -35) {
              stackOut_9_0 = param0.field_w;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            } else {
              stackOut_7_0 = null;
              stackIn_8_0 = stackOut_7_0;
              return (ne) (Object) stackIn_8_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("e.A(");
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
          throw pf.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 41);
        }
        return stackIn_10_0;
    }

    public final int a(int param0, qa param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 <= -84) {
              ne discarded$2 = ((e) this).a(param1, (byte) -35);
              stackOut_3_0 = param1.field_w.b((byte) 97) - (-((e) this).field_n - ((e) this).field_o);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 94;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("e.I(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0;
    }

    private final int a(qa param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3_int = -90 / ((57 - param1) / 61);
            stackOut_0_0 = -((e) this).field_m + param0.field_j - ((e) this).field_k;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("e.AA(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 41);
        }
        return stackIn_1_0;
    }

    public final int a(int param0, qa param1, byte param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            ne discarded$7 = ((e) this).a(param1, (byte) -35);
            if (param2 > 18) {
              stackOut_3_0 = param1.field_w.a(-((e) this).a(false, param3, param1) + param5, param0 + -((e) this).a(param4, param1, (byte) 125), (byte) -116);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = -15;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var7;
            stackOut_5_1 = new StringBuilder().append("e.C(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
        return stackIn_4_0;
    }

    public void a(int param0, int param1, boolean param2, qa param3, int param4) {
        if (param0 > -36) {
            ((e) this).field_c = 31;
        }
        if (!(null != ((e) this).field_j)) {
            return;
        }
        try {
            this.a(param3, param1, param4, (byte) -34);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "e.B(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 41);
        }
    }

    public final int a(int param0, qa param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var4_int = 124 % ((param2 - -3) / 53);
            stackOut_0_0 = this.a(param1, param0, 0, -3);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("e.H(").append(param0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param2 + 41);
        }
        return stackIn_1_0;
    }

    e(fa param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    private final void c(qa param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var7 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0.field_w == null) {
                param0.field_w = (ne) (Object) new j();
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var3_int = ((e) this).b(param0, (byte) -117);
              var4 = this.a(param0, -13);
              var6 = ((e) this).field_h;
              if (0 == var6) {
                var5 = ((e) this).field_j.field_H;
                break L2;
              } else {
                if (var6 != 2) {
                  L3: {
                    if (3 == var6) {
                      break L3;
                    } else {
                      if (var6 == 1) {
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var5 = (-((e) this).field_j.field_K + var4 - ((e) this).field_j.field_H >> 1) + ((e) this).field_j.field_H;
                  break L2;
                } else {
                  var5 = var4 + -((e) this).field_j.field_K;
                  break L2;
                }
              }
            }
            L4: {
              if (param1 == 64) {
                break L4;
              } else {
                field_b = 28;
                break L4;
              }
            }
            L5: {
              L6: {
                var6 = ((e) this).field_i;
                if (var6 != 0) {
                  if (var6 == 3) {
                    break L6;
                  } else {
                    if (var6 != 1) {
                      if (var6 == 2) {
                        if (!(param0.field_w instanceof j)) {
                          break L5;
                        } else {
                          ((j) (Object) param0.field_w).a(var3_int, var5, param1 + -64, ((e) this).c(58, param0), ((e) this).field_j);
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      if (!(param0.field_w instanceof j)) {
                        break L5;
                      } else {
                        ((j) (Object) param0.field_w).a(((e) this).field_j, param1 ^ 4, ((e) this).c(param1 + 46, param0), var3_int >> 1, var5);
                        return;
                      }
                    }
                  }
                } else {
                  break L6;
                }
              }
              if (!(param0.field_w instanceof j)) {
                break L5;
              } else {
                ((j) (Object) param0.field_w).a(((e) this).c(93, param0), 0, ((e) this).field_j, true, var5);
                return;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var3;
            stackOut_29_1 = new StringBuilder().append("e.CA(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L7;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L7;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 44 + param1 + 41);
        }
    }

    public final int b(int param0, qa param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              ne discarded$7 = ((e) this).a(param1, (byte) -35);
              if (param0 <= -25) {
                break L1;
              } else {
                var4 = null;
                ((e) this).a((qa) null, -4, 97, -107, -121, 31);
                break L1;
              }
            }
            stackOut_2_0 = param1.field_w.a(true) - (-((e) this).field_m + -((e) this).field_k);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("e.F(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    protected e() {
    }

    e(fa param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
            ((e) this).field_d = param9;
            ((e) this).field_n = param1;
            ((e) this).field_p = param11;
            ((e) this).field_m = param3;
            ((e) this).field_l = param12 ? true : false;
            ((e) this).field_k = param4;
            ((e) this).field_a = param6;
            ((e) this).field_j = param0;
            ((e) this).field_o = param2;
            ((e) this).field_f = param5;
            ((e) this).field_i = param7;
            ((e) this).field_h = param8;
            ((e) this).field_c = param10;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "e.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 44 + param9 + 44 + param10 + 44 + param11 + 44 + param12 + 41);
        }
    }

    private final int a(qa param0, int param1, boolean param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param2) {
              stackOut_3_0 = param0.field_y + (param3 + (((e) this).field_n - -param0.field_r) - -param1);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 64;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("e.BA(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_4_0;
    }

    public static void b(byte param0) {
        field_g = null;
    }

    String c(int param0, qa param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 > 21) {
                break L1;
              } else {
                ((e) this).field_n = 77;
                break L1;
              }
            }
            stackOut_2_0 = param1.field_i;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("e.DA(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "OK";
        field_b = 0;
    }
}
