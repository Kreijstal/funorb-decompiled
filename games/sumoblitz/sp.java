/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class sp extends pk implements ug {
    static qr field_z;
    static int[] field_x;
    jn field_y;

    private final void a(StringBuilder param0, byte param1, Hashtable param2, int param3) {
        cb var5 = null;
        RuntimeException var5_ref = null;
        pk var6 = null;
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
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var5 = new cb(((sp) this).field_y);
            var6 = (pk) (Object) var5.b((byte) -80);
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                StringBuilder discarded$12 = param0.append(10);
                var7 = 0;
                L2: while (true) {
                  if (var7 > param3) {
                    StringBuilder discarded$13 = var6.a(param3 - -1, param2, param0, 0);
                    var6 = (pk) (Object) var5.b(0);
                    continue L1;
                  } else {
                    StringBuilder discarded$14 = param0.append(32);
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
            stackOut_8_1 = new StringBuilder().append("sp.SA(");
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
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44).append(-57).append(44);
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
          throw qo.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param3 + 41);
        }
    }

    sp(int param0, int param1, int param2, int param3, mh param4) {
        super(param0, param1, param2, param3, param4, (qm) null);
        ((sp) this).field_y = new jn();
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, pk param5, int param6) {
        cb var8 = null;
        RuntimeException var8_ref = null;
        pk var9 = null;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var8 = new cb(((sp) this).field_y);
            if (param2 == -1) {
              var9 = (pk) (Object) var8.b((byte) -80);
              L1: while (true) {
                L2: {
                  if (var9 == null) {
                    break L2;
                  } else {
                    if (!var9.a(false)) {
                      break L2;
                    } else {
                      L3: {
                        if (!var9.d(-1)) {
                          break L3;
                        } else {
                          if (!var9.a(param0, param1, -1, param3, param4, param5, param6)) {
                            break L3;
                          } else {
                            stackOut_9_0 = 1;
                            stackIn_10_0 = stackOut_9_0;
                            return stackIn_10_0 != 0;
                          }
                        }
                      }
                      var9 = (pk) (Object) var8.b(~param2);
                      continue L1;
                    }
                  }
                }
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
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
            stackOut_14_0 = (RuntimeException) var8_ref;
            stackOut_14_1 = new StringBuilder().append("sp.RA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param5 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param6 + 41);
        }
        return stackIn_13_0 != 0;
    }

    final boolean a(byte param0, pk param1) {
        cb var3 = null;
        RuntimeException var3_ref = null;
        pk var4_ref_pk = null;
        int var4 = 0;
        cb var5 = null;
        pk var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
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
        int stackOut_16_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (!((sp) this).field_y.a((byte) -86)) {
              var3 = new cb(((sp) this).field_y);
              var4_ref_pk = (pk) (Object) var3.a((byte) -58);
              L1: while (true) {
                if (var4_ref_pk == null) {
                  var4 = 39 % ((param0 - 84) / 34);
                  stackOut_16_0 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  break L0;
                } else {
                  L2: {
                    if (var4_ref_pk.d(-1)) {
                      var5 = new cb(((sp) this).field_y);
                      ms discarded$2 = var5.a((byte) -70, (ms) (Object) var4_ref_pk);
                      var6 = (pk) (Object) var5.c((byte) 87);
                      L3: while (true) {
                        if (var6 == null) {
                          break L2;
                        } else {
                          if (var6.a(param1, (byte) 61)) {
                            stackOut_12_0 = 1;
                            stackIn_13_0 = stackOut_12_0;
                            return stackIn_13_0 != 0;
                          } else {
                            var6 = (pk) (Object) var5.c((byte) 87);
                            continue L3;
                          }
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                  var4_ref_pk = (pk) (Object) var3.c((byte) 87);
                  continue L1;
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
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3_ref;
            stackOut_18_1 = new StringBuilder().append("sp.VA(").append(param0).append(44);
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
          throw qo.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
        return stackIn_17_0 != 0;
    }

    final boolean a(pk param0, boolean param1) {
        cb var3 = null;
        RuntimeException var3_ref = null;
        pk var4 = null;
        cb var5 = null;
        pk var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (!((sp) this).field_y.a((byte) -87)) {
              var3 = new cb(((sp) this).field_y);
              var4 = (pk) (Object) var3.b((byte) -80);
              L1: while (true) {
                if (var4 == null) {
                  if (!param1) {
                    stackOut_19_0 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    break L0;
                  } else {
                    stackOut_17_0 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    return stackIn_18_0 != 0;
                  }
                } else {
                  L2: {
                    if (var4.d(-1)) {
                      var5 = new cb(((sp) this).field_y);
                      ms discarded$2 = var5.a(14, (ms) (Object) var4);
                      var6 = (pk) (Object) var5.b(0);
                      L3: while (true) {
                        if (var6 == null) {
                          break L2;
                        } else {
                          if (var6.a(param0, (byte) 61)) {
                            stackOut_12_0 = 1;
                            stackIn_13_0 = stackOut_12_0;
                            return stackIn_13_0 != 0;
                          } else {
                            var6 = (pk) (Object) var5.b(0);
                            continue L3;
                          }
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                  var4 = (pk) (Object) var3.b(0);
                  continue L1;
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
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var3_ref;
            stackOut_21_1 = new StringBuilder().append("sp.TA(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L4;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L4;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param1 + 41);
        }
        return stackIn_20_0 != 0;
    }

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        RuntimeException var5 = null;
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
              if (((sp) this).a(param0, param1, -22, param2)) {
                ((sp) this).a(param0, (byte) -128, param2, param1);
                this.a(param2, (byte) -57, param1, param0);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param3 == 0) {
                break L2;
              } else {
                ((sp) this).field_y = null;
                break L2;
              }
            }
            stackOut_5_0 = (StringBuilder) param2;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("sp.S(").append(param0).append(44);
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
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
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
          throw qo.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param3 + 41);
        }
        return stackIn_6_0;
    }

    String c(int param0) {
        cb var2 = null;
        pk var3 = null;
        String var4 = null;
        int var5 = 0;
        var5 = Sumoblitz.field_L ? 1 : 0;
        var2 = new cb(((sp) this).field_y);
        var3 = (pk) (Object) var2.b((byte) -80);
        L0: while (true) {
          if (var3 != null) {
            var4 = var3.c(-6696);
            if (var4 == null) {
              var3 = (pk) (Object) var2.b(0);
              continue L0;
            } else {
              return var4;
            }
          } else {
            return null;
          }
        }
    }

    void a(int param0, int param1, byte param2, int param3) {
        int var7 = Sumoblitz.field_L ? 1 : 0;
        if (param3 == 0) {
            if (!(null == ((sp) this).field_w)) {
                ((sp) this).field_w.a((pk) this, param1, 5592405, true, param0);
            }
        }
        cb var5 = new cb(((sp) this).field_y);
        if (param2 >= -35) {
            field_x = null;
        }
        pk var6 = (pk) (Object) var5.a((byte) -83);
        while (var6 != null) {
            var6.a(((sp) this).field_r + param0, ((sp) this).field_v + param1, (byte) -62, param3);
            var6 = (pk) (Object) var5.c((byte) 87);
        }
    }

    final int e(int param0) {
        int var6 = 0;
        int var7 = Sumoblitz.field_L ? 1 : 0;
        int var2 = 0;
        cb var3 = new cb(((sp) this).field_y);
        int var4 = 51 % ((param0 - -10) / 46);
        pk var5 = (pk) (Object) var3.b((byte) -80);
        while (var5 != null) {
            var6 = var5.e(-99);
            if (!(var6 <= var2)) {
                var2 = var6;
            }
            var5 = (pk) (Object) var3.b(0);
        }
        return var2;
    }

    boolean a(pk param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        cb var8 = null;
        RuntimeException var8_ref = null;
        pk var9 = null;
        int var10 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var8 = new cb(((sp) this).field_y);
            var9 = (pk) (Object) var8.b((byte) -80);
            L1: while (true) {
              L2: {
                if (var9 == null) {
                  break L2;
                } else {
                  if (!var9.a(false)) {
                    break L2;
                  } else {
                    if (!var9.a(param0, -79, param2, param3, param4 + ((sp) this).field_r, param5, param6 - -((sp) this).field_v)) {
                      var9 = (pk) (Object) var8.b(0);
                      continue L1;
                    } else {
                      stackOut_5_0 = 1;
                      stackIn_6_0 = stackOut_5_0;
                      return stackIn_6_0 != 0;
                    }
                  }
                }
              }
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var8_ref;
            stackOut_12_1 = new StringBuilder().append("sp.R(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + -54 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_11_0 != 0;
    }

    public static void d() {
        field_z = null;
        field_x = null;
    }

    private final void a(int param0) {
        int var4 = Sumoblitz.field_L ? 1 : 0;
        cb var2 = new cb(((sp) this).field_y);
        pk var3 = (pk) (Object) var2.b((byte) -80);
        while (var3 != null) {
            var3.c(false);
            var3 = (pk) (Object) var2.b(0);
        }
    }

    pk f(int param0) {
        int var4 = Sumoblitz.field_L ? 1 : 0;
        cb var2 = new cb(((sp) this).field_y);
        pk var3_ref_pk = (pk) (Object) var2.b((byte) -80);
        while (var3_ref_pk != null) {
            if (!(!var3_ref_pk.d(-1))) {
                return var3_ref_pk;
            }
            var3_ref_pk = (pk) (Object) var2.b(0);
        }
        int var3 = -6 / ((param0 - -25) / 58);
        return null;
    }

    final void a(pk param0, int param1) {
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
              ((sp) this).field_y.a((ms) (Object) param0, (byte) 39);
              if (param1 > 59) {
                break L1;
              } else {
                field_x = null;
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
            stackOut_3_1 = new StringBuilder().append("sp.UA(");
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
          throw qo.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    void c(byte param0) {
        int var4 = Sumoblitz.field_L ? 1 : 0;
        cb var2 = new cb(((sp) this).field_y);
        pk var5 = (pk) (Object) var2.b((byte) -80);
        while (var5 != null) {
            var5.c((byte) 127);
            var5 = (pk) (Object) var2.b(0);
        }
        int var3 = 0;
    }

    boolean a(pk param0, byte param1) {
        cb var3 = null;
        RuntimeException var3_ref = null;
        pk var4 = null;
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
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var3 = new cb(((sp) this).field_y);
              var4 = (pk) (Object) var3.b((byte) -80);
              if (param1 == 61) {
                break L1;
              } else {
                var6 = null;
                ((sp) this).a(27, -11, (pk) null, -73);
                break L1;
              }
            }
            L2: while (true) {
              if (var4 == null) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                if (var4.a(param0, (byte) 61)) {
                  stackOut_6_0 = 1;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0 != 0;
                } else {
                  var4 = (pk) (Object) var3.b(0);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("sp.Q(");
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
          throw qo.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 41);
        }
        return stackIn_10_0 != 0;
    }

    void a(int param0, int param1, pk param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        cb var6 = null;
        pk var7 = null;
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
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var5_int = -16 % ((-25 - param1) / 45);
            super.a(param0, 105, param2, param3);
            var6 = new cb(((sp) this).field_y);
            var7 = (pk) (Object) var6.b((byte) -80);
            L1: while (true) {
              L2: {
                if (var7 == null) {
                  break L2;
                } else {
                  if (!var7.a(false)) {
                    break L2;
                  } else {
                    var7.a(((sp) this).field_r + param0, -88, param2, param3 - -((sp) this).field_v);
                    var7 = (pk) (Object) var6.b(0);
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
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("sp.U(").append(param0).append(44).append(param1).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
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
          throw qo.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param3 + 41);
        }
    }

    boolean d(int param0) {
        return null != ((sp) this).f(55);
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = -30 / ((28 - param0) / 63);
        super.a(94, param1, param2, param3, param4);
        this.a(-29587);
    }

    final void a(pk param0, boolean param1, int param2, int param3, int param4, int param5) {
        cb var7 = null;
        RuntimeException var7_ref = null;
        pk var8 = null;
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
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (!param1) {
              var7 = new cb(((sp) this).field_y);
              var8 = (pk) (Object) var7.b((byte) -80);
              L1: while (true) {
                L2: {
                  if (var8 == null) {
                    break L2;
                  } else {
                    if (!var8.a(param1)) {
                      break L2;
                    } else {
                      var8.a(param0, false, param2 + ((sp) this).field_r, param3, param4, ((sp) this).field_v + param5);
                      var8 = (pk) (Object) var7.b(0);
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
            stackOut_8_1 = new StringBuilder().append("sp.T(");
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
          throw qo.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    boolean a(pk param0, char param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        cb var8 = null;
        pk var9 = null;
        int stackIn_9_0 = 0;
        boolean stackIn_15_0 = false;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_16_0 = 0;
        boolean stackOut_14_0 = false;
        boolean stackOut_13_0 = false;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var8 = new cb(((sp) this).field_y);
              var9 = (pk) (Object) var8.b((byte) -80);
              if (param2 > 9) {
                break L1;
              } else {
                field_x = null;
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                if (var9 == null) {
                  break L3;
                } else {
                  if (!var9.a(false)) {
                    break L3;
                  } else {
                    L4: {
                      if (!var9.d(-1)) {
                        break L4;
                      } else {
                        if (var9.a(param0, param1, (byte) 67, param3)) {
                          stackOut_8_0 = 1;
                          stackIn_9_0 = stackOut_8_0;
                          return stackIn_9_0 != 0;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var9 = (pk) (Object) var8.b(0);
                    continue L2;
                  }
                }
              }
              var6 = param3;
              if (var6 != 80) {
                stackOut_16_0 = 0;
                stackIn_17_0 = stackOut_16_0;
                break L0;
              } else {
                L5: {
                  if (!hw.field_b[81]) {
                    stackOut_14_0 = ((sp) this).a(param0, false);
                    stackIn_15_0 = stackOut_14_0;
                    break L5;
                  } else {
                    stackOut_13_0 = ((sp) this).a((byte) -5, param0);
                    stackIn_15_0 = stackOut_13_0;
                    break L5;
                  }
                }
                return stackIn_15_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var5;
            stackOut_18_1 = new StringBuilder().append("sp.KA(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_17_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = new int[]{0, 4, 6, 8, 12, 16, 18, 20, 24};
        field_z = new qr();
    }
}
