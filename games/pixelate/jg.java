/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class jg extends ng implements j {
    ng[] field_L;
    static fp field_F;
    static String field_M;
    static java.awt.Image field_K;
    static tf field_H;
    static char[] field_I;
    static int field_J;

    final boolean b(boolean param0) {
        if (!param0) {
            field_H = null;
        }
        return null != this.m(0) ? true : false;
    }

    final boolean a(ng param0, int param1) {
        ng[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        ng var5 = null;
        int var6 = 0;
        ng[] var7 = null;
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
        int stackOut_12_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (param1 == 27) {
              var7 = ((jg) this).field_L;
              var3 = var7;
              var4 = 0;
              L1: while (true) {
                if (var7.length <= var4) {
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  L2: {
                    var5 = var7[var4];
                    if (var5 == null) {
                      break L2;
                    } else {
                      if (var5.a(param0, 27)) {
                        stackOut_9_0 = 1;
                        stackIn_10_0 = stackOut_9_0;
                        return stackIn_10_0 != 0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var4++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3_ref;
            stackOut_14_1 = new StringBuilder().append("jg.HA(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 41);
        }
        return stackIn_13_0 != 0;
    }

    private final void a(StringBuilder param0, Hashtable param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        ng var7 = null;
        int var8 = 0;
        int var9 = 0;
        ng[] var10 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var9 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (null == ((jg) this).field_L) {
              return;
            } else {
              L1: {
                var10 = ((jg) this).field_L;
                if (param2 > 126) {
                  break L1;
                } else {
                  field_J = -27;
                  break L1;
                }
              }
              var6 = 0;
              L2: while (true) {
                if (var10.length <= var6) {
                  break L0;
                } else {
                  var7 = var10[var6];
                  StringBuilder discarded$29 = param0.append(10);
                  var8 = 0;
                  L3: while (true) {
                    if (param3 < var8) {
                      L4: {
                        if (var7 != null) {
                          StringBuilder discarded$30 = var7.a(param0, false, param3 - -1, param1);
                          break L4;
                        } else {
                          StringBuilder discarded$31 = param0.append("null");
                          break L4;
                        }
                      }
                      var6++;
                      continue L2;
                    } else {
                      StringBuilder discarded$32 = param0.append(32);
                      var8++;
                      continue L3;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var5;
            stackOut_16_1 = new StringBuilder().append("jg.H(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
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
          L6: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static boolean a(byte param0) {
        if (param0 < 56) {
            field_F = null;
        }
        return lo.field_Nb;
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        super.a(param0, (byte) 75, param2, param3, param4);
        ((jg) this).a(14210);
        if (param1 < 19) {
            field_H = null;
        }
    }

    final static boolean k(int param0) {
        return null != he.field_f && he.field_f.c((byte) -87);
    }

    private final boolean a(byte param0, ng param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
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
              if (param0 < -95) {
                break L1;
              } else {
                ((jg) this).a(-13, (byte) -36, 75, -82, -49);
                break L1;
              }
            }
            stackOut_2_0 = this.a(-18125, 1, param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("jg.J(").append(param0).append(44);
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
          throw aa.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    void a(int param0, int param1, int param2, ng param3) {
        ng[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        ng var7 = null;
        int var8 = 0;
        ng[] var9 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            super.a(param0, param1, param2, param3);
            if (((jg) this).field_L != null) {
              var9 = ((jg) this).field_L;
              var5 = var9;
              var6 = 0;
              L1: while (true) {
                if (var9.length <= var6) {
                  break L0;
                } else {
                  L2: {
                    var7 = var9[var6];
                    if (var7 == null) {
                      break L2;
                    } else {
                      var7.a(param0, ((jg) this).field_p + param1, param2 - -((jg) this).field_z, param3);
                      break L2;
                    }
                  }
                  var6++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var5_ref;
            stackOut_9_1 = new StringBuilder().append("jg.L(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
    }

    final String b(byte param0) {
        ng[] var2 = null;
        int var3 = 0;
        ng var4 = null;
        String var5 = null;
        int var6 = 0;
        ng[] var7 = null;
        var6 = Pixelate.field_H ? 1 : 0;
        if (null != ((jg) this).field_L) {
          var7 = ((jg) this).field_L;
          var2 = var7;
          var3 = 0;
          if (param0 >= 16) {
            L0: while (true) {
              if (var7.length > var3) {
                var4 = var7[var3];
                if (var4 != null) {
                  var5 = var4.b((byte) 36);
                  if (var5 != null) {
                    return var5;
                  } else {
                    var3++;
                    continue L0;
                  }
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                return null;
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static void a(int param0, int param1) {
        wn.field_u = param0;
        if (!(null == to.field_q)) {
            to.field_q.c((byte) 30, param0);
        }
        int var2 = -13 % ((52 - param1) / 59);
        if (ri.field_a != null) {
            ri.field_a.a(param0, (byte) 2);
        }
    }

    final boolean a(byte param0, ng param1, int param2, int param3, int param4, int param5, int param6) {
        ng[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        ng var10 = null;
        int var11 = 0;
        ng[] var12 = null;
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var11 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -58) {
                break L1;
              } else {
                boolean discarded$2 = ((jg) this).b(true);
                break L1;
              }
            }
            if (((jg) this).field_L != null) {
              var12 = ((jg) this).field_L;
              var8 = var12;
              var9 = 0;
              L2: while (true) {
                if (var9 >= var12.length) {
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
                } else {
                  L3: {
                    var10 = var12[var9];
                    if (var10 == null) {
                      break L3;
                    } else {
                      if (var10.a((byte) -58, param1, param2, param3 + ((jg) this).field_p, param4, ((jg) this).field_z + param5, param6)) {
                        stackOut_11_0 = 1;
                        stackIn_12_0 = stackOut_11_0;
                        return stackIn_12_0 != 0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var9++;
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
          L4: {
            var8_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var8_ref;
            stackOut_16_1 = new StringBuilder().append("jg.N(").append(param0).append(44);
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
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_15_0 != 0;
    }

    final StringBuilder a(StringBuilder param0, boolean param1, int param2, Hashtable param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                field_F = null;
                break L1;
              }
            }
            L2: {
              if (!((jg) this).a(-90, param2, param0, param3)) {
                break L2;
              } else {
                ((jg) this).a(param2, (byte) -2, param3, param0);
                this.a(param0, param3, (byte) 127, param2);
                break L2;
              }
            }
            stackOut_4_0 = (StringBuilder) param0;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("jg.AA(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
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
          L4: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
        return stackIn_5_0;
    }

    final static int l(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_11_0 = 0;
        var2 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            boolean discarded$14 = wa.field_c.a(hf.field_w, true, (byte) 99, ph.field_o);
            wa.field_c.d((byte) 112);
            L1: while (true) {
              if (!bh.b((byte) 120)) {
                if (u.field_h != -1) {
                  var1_int = u.field_h;
                  te.a(-1, -2671);
                  stackOut_6_0 = var1_int;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                } else {
                  L2: {
                    if (param0 > 51) {
                      break L2;
                    } else {
                      boolean discarded$15 = jg.a((byte) -82);
                      break L2;
                    }
                  }
                  if (!dk.field_c) {
                    if (qo.field_n == rj.field_F) {
                      stackOut_15_0 = 1;
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0;
                    } else {
                      if (!an.field_e.d(123)) {
                        stackOut_19_0 = 1;
                        stackIn_20_0 = stackOut_19_0;
                        return stackIn_20_0;
                      } else {
                        if (tm.field_X != rj.field_F) {
                          stackOut_24_0 = -1;
                          stackIn_25_0 = stackOut_24_0;
                          break L0;
                        } else {
                          stackOut_22_0 = 2;
                          stackIn_23_0 = stackOut_22_0;
                          return stackIn_23_0;
                        }
                      }
                    }
                  } else {
                    stackOut_11_0 = 3;
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0;
                  }
                }
              } else {
                boolean discarded$16 = wa.field_c.a(nj.field_f, ke.field_a, false);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "jg.M(" + param0 + 41);
        }
        return stackIn_25_0;
    }

    final void h(int param0) {
        ng[] var2 = null;
        int var3 = 0;
        ng var4 = null;
        int var5 = 0;
        ng[] var6 = null;
        L0: {
          var5 = Pixelate.field_H ? 1 : 0;
          var6 = ((jg) this).field_L;
          var2 = var6;
          if (param0 == 2) {
            break L0;
          } else {
            field_K = null;
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          if (var3 >= var6.length) {
            return;
          } else {
            var4 = var6[var3];
            if (var4 != null) {
              var4.h(2);
              var3++;
              continue L1;
            } else {
              var3++;
              continue L1;
            }
          }
        }
    }

    final int e(int param0) {
        int var2 = 0;
        ng[] var3 = null;
        int var4 = 0;
        ng var5 = null;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Pixelate.field_H ? 1 : 0;
          var2 = 0;
          var3 = ((jg) this).field_L;
          if (param0 > 31) {
            break L0;
          } else {
            ((jg) this).field_L = null;
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var3.length <= var4) {
            return var2;
          } else {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.e(61);
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

    private final boolean a(ng param0, byte param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        ng var5 = null;
        ng var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var7 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (((jg) this).field_L != null) {
              L1: {
                var4_int = 0;
                if (param1 == -44) {
                  break L1;
                } else {
                  int discarded$2 = ((jg) this).e(-60);
                  break L1;
                }
              }
              L2: while (true) {
                if (((jg) this).field_L.length <= var4_int) {
                  stackOut_18_0 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  break L0;
                } else {
                  L3: {
                    var5 = ((jg) this).field_L[var4_int];
                    if (var5 == null) {
                      break L3;
                    } else {
                      if (!var5.b(true)) {
                        break L3;
                      } else {
                        var4_int = var4_int + 1;
                        L4: while (true) {
                          if (var4_int >= ((jg) this).field_L.length) {
                            break L3;
                          } else {
                            L5: {
                              var6 = ((jg) this).field_L[var4_int];
                              if (var6 != null) {
                                if (!var6.a(param0, 27)) {
                                  break L5;
                                } else {
                                  stackOut_14_0 = 1;
                                  stackIn_15_0 = stackOut_14_0;
                                  return stackIn_15_0 != 0;
                                }
                              } else {
                                break L5;
                              }
                            }
                            var4_int = var4_int + 1;
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                  var4_int++;
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
          L6: {
            var4 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var4;
            stackOut_20_1 = new StringBuilder().append("jg.F(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
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
          throw aa.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param1 + 44 + 1 + 41);
        }
        return stackIn_19_0 != 0;
    }

    public static void j(int param0) {
        field_I = null;
        field_M = null;
        field_F = null;
        field_K = null;
        field_H = null;
    }

    final void a(int param0, int param1, ng param2, int param3, int param4, int param5) {
        ng[] var7 = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        ng var9 = null;
        int var10 = 0;
        ng[] var11 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var10 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (null != ((jg) this).field_L) {
              var11 = ((jg) this).field_L;
              var7 = var11;
              var8 = param3;
              L1: while (true) {
                if (var11.length <= var8) {
                  break L0;
                } else {
                  L2: {
                    var9 = var11[var8];
                    if (var9 == null) {
                      break L2;
                    } else {
                      var9.a(param0, param1 + ((jg) this).field_z, param2, 0, param4 + ((jg) this).field_p, param5);
                      break L2;
                    }
                  }
                  var8++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var7_ref;
            stackOut_9_1 = new StringBuilder().append("jg.EA(").append(param0).append(44).append(param1).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    private final ng m(int param0) {
        ng[] var2 = null;
        int var3 = 0;
        ng var4 = null;
        int var5 = 0;
        ng[] var6 = null;
        var5 = Pixelate.field_H ? 1 : 0;
        if (null != ((jg) this).field_L) {
          var6 = ((jg) this).field_L;
          var2 = var6;
          var3 = 0;
          L0: while (true) {
            if (var3 < var6.length) {
              var4 = var6[var3];
              if (var4 != null) {
                if (var4.b(true)) {
                  return var4;
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    void a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        ng var6 = null;
        int var7 = 0;
        L0: {
          var7 = Pixelate.field_H ? 1 : 0;
          if (param1 != 0) {
            break L0;
          } else {
            if (null == ((jg) this).field_y) {
              break L0;
            } else {
              ((jg) this).field_y.a((ng) this, (byte) -124, param0, param2, true);
              break L0;
            }
          }
        }
        L1: {
          if (null == ((jg) this).field_L) {
            break L1;
          } else {
            var5 = ((jg) this).field_L.length + -1;
            L2: while (true) {
              if (0 > var5) {
                break L1;
              } else {
                var6 = ((jg) this).field_L[var5];
                if (var6 != null) {
                  var6.a(((jg) this).field_p + param0, param1, param2 - -((jg) this).field_z, (byte) -95);
                  var5--;
                  continue L2;
                } else {
                  var5--;
                  continue L2;
                }
              }
            }
          }
        }
        var5 = -65;
    }

    jg(int param0, int param1, int param2, int param3, eb param4) {
        super(param0, param1, param2, param3, param4, (fn) null);
    }

    abstract void a(int param0);

    private final boolean b(ng param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
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
            stackOut_2_0 = this.a(param0, (byte) -44, 1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("jg.I(");
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
          throw aa.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + -17753 + 41);
        }
        return stackIn_3_0;
    }

    private final boolean a(int param0, int param1, ng param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        ng var5 = null;
        ng var6 = null;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var7 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (null == ((jg) this).field_L) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              var4_int = -1 + ((jg) this).field_L.length;
              L1: while (true) {
                if (var4_int < 0) {
                  if (param0 == -18125) {
                    stackOut_22_0 = 0;
                    stackIn_23_0 = stackOut_22_0;
                    break L0;
                  } else {
                    field_J = -62;
                    return false;
                  }
                } else {
                  L2: {
                    var5 = ((jg) this).field_L[var4_int];
                    var6 = var5;
                    var6 = var5;
                    if (var5 == null) {
                      break L2;
                    } else {
                      if (var5.b(true)) {
                        var4_int = var4_int - param1;
                        L3: while (true) {
                          if (var4_int < 0) {
                            break L2;
                          } else {
                            L4: {
                              var6 = ((jg) this).field_L[var4_int];
                              if (var6 != null) {
                                if (var6.a(param2, 27)) {
                                  stackOut_16_0 = 1;
                                  stackIn_17_0 = stackOut_16_0;
                                  return stackIn_17_0 != 0;
                                } else {
                                  break L4;
                                }
                              } else {
                                break L4;
                              }
                            }
                            var4_int = var4_int - param1;
                            continue L3;
                          }
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                  var4_int--;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var4;
            stackOut_24_1 = new StringBuilder().append("jg.P(").append(param0).append(44).append(param1).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
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
          throw aa.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 41);
        }
        return stackIn_23_0 != 0;
    }

    final boolean a(int param0, int param1, ng param2, char param3) {
        ng[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        int var6 = 0;
        ng var7 = null;
        int var8 = 0;
        ng[] var9 = null;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        boolean stackIn_20_0 = false;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        boolean stackOut_19_0 = false;
        boolean stackOut_18_0 = false;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (null == ((jg) this).field_L) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                var9 = ((jg) this).field_L;
                var5 = var9;
                if (param1 == 3) {
                  break L1;
                } else {
                  boolean discarded$2 = jg.a((byte) 125);
                  break L1;
                }
              }
              var6 = 0;
              L2: while (true) {
                if (var6 >= var9.length) {
                  var5_int = param0;
                  if (var5_int == 80) {
                    L3: {
                      if (!bc.field_m[81]) {
                        stackOut_19_0 = this.b(param2, -17753);
                        stackIn_20_0 = stackOut_19_0;
                        break L3;
                      } else {
                        stackOut_18_0 = this.a((byte) -126, param2);
                        stackIn_20_0 = stackOut_18_0;
                        break L3;
                      }
                    }
                    break L0;
                  } else {
                    return false;
                  }
                } else {
                  L4: {
                    var7 = var9[var6];
                    if (var7 == null) {
                      break L4;
                    } else {
                      if (!var7.b(true)) {
                        break L4;
                      } else {
                        if (!var7.a(param0, 3, param2, param3)) {
                          break L4;
                        } else {
                          stackOut_12_0 = 1;
                          stackIn_13_0 = stackOut_12_0;
                          return stackIn_13_0 != 0;
                        }
                      }
                    }
                  }
                  var6++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5_ref = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var5_ref;
            stackOut_21_1 = new StringBuilder().append("jg.G(").append(param0).append(44).append(param1).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L5;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L5;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param3 + 41);
        }
        return stackIn_20_0;
    }

    final boolean a(int param0, byte param1, int param2, int param3, int param4, int param5, ng param6) {
        ng[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        ng var10 = null;
        int var11 = 0;
        ng[] var12 = null;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var11 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (((jg) this).field_L != null) {
              L1: {
                var12 = ((jg) this).field_L;
                var8 = var12;
                if (param1 >= 61) {
                  break L1;
                } else {
                  ((jg) this).h(91);
                  break L1;
                }
              }
              var9 = 0;
              L2: while (true) {
                if (var12.length <= var9) {
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
                } else {
                  L3: {
                    var10 = var12[var9];
                    if (var10 == null) {
                      break L3;
                    } else {
                      if (!var10.b(true)) {
                        break L3;
                      } else {
                        if (!var10.a(param0, (byte) 105, param2, param3, param4, param5, param6)) {
                          break L3;
                        } else {
                          stackOut_11_0 = 1;
                          stackIn_12_0 = stackOut_11_0;
                          return stackIn_12_0 != 0;
                        }
                      }
                    }
                  }
                  var9++;
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
          L4: {
            var8_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var8_ref;
            stackOut_16_1 = new StringBuilder().append("jg.FA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param6 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
        return stackIn_15_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = new fp();
        field_M = "<%0> disconnected.";
        field_I = new char[]{'€', ' ', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', ' ', 'Ž', ' ', ' ', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', ' ', 'ž', 'Ÿ'};
    }
}
