/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class cn {
    static String field_c;
    static jpa field_h;
    boolean field_g;
    private dla field_i;
    static String field_e;
    static int field_k;
    static int field_b;
    private Object[][] field_l;
    static String field_f;
    int field_j;
    private dr field_d;
    private Object[] field_a;

    final boolean b(String param0, byte param1, String param2) {
        byte[] discarded$2 = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        boolean stackOut_9_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (this.b(param1 ^ -44)) {
              L1: {
                param0 = param0.toLowerCase();
                if (param1 == 2) {
                  break L1;
                } else {
                  discarded$2 = this.a(((boolean[]) (((Object[]) (this.field_a[4]))[5]))[6], 76, -83);
                  break L1;
                }
              }
              param2 = param2.toLowerCase();
              var6 = (CharSequence) ((Object) param0);
              var4_int = this.field_i.field_b.a(vta.a(var6, -12754), 1);
              if (!this.b(-1, var4_int)) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var7 = (CharSequence) ((Object) param2);
                var5 = this.field_i.field_e[var4_int].a(vta.a(var7, -12754), 1);
                stackOut_9_0 = this.a(var4_int, (byte) -126, var5);
                stackIn_10_0 = stackOut_9_0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var4);
            stackOut_11_1 = new StringBuilder().append("cn.G(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          L3: {
            stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    public static void d(int param0) {
        field_h = null;
        field_f = null;
        field_e = null;
        field_c = null;
        if (param0 != 0) {
            cn.e(22);
        }
    }

    final synchronized int a(int param0, byte param1) {
        if (!this.b(-1, param0)) {
            return 0;
        }
        if (!(null == this.field_a[param0])) {
            return 100;
        }
        if (param1 <= 108) {
            return -36;
        }
        return this.field_d.b(27079, param0);
    }

    final synchronized int a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        boolean stackOut_10_0 = false;
        int stackOut_10_1 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        if (!this.b(-90)) {
          return 0;
        } else {
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            L1: {
              L2: {
                if ((this.field_a.length ^ -1) >= (var4 ^ -1)) {
                  break L2;
                } else {
                  stackOut_5_0 = 0;
                  stackOut_5_1 = this.field_i.field_c[var4];
                  stackIn_11_0 = stackOut_5_0;
                  stackIn_11_1 = stackOut_5_1;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  if (var5 != 0) {
                    break L1;
                  } else {
                    L3: {
                      if (stackIn_6_0 < stackIn_6_1) {
                        var2 += 100;
                        var3 = var3 + this.a(var4, (byte) 118);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var4++;
                    if (var5 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackOut_10_0 = param0;
              stackOut_10_1 = 1;
              stackIn_11_0 = stackOut_10_0 ? 1 : 0;
              stackIn_11_1 = stackOut_10_1;
              break L1;
            }
            if (stackIn_11_0 == stackIn_11_1) {
              if ((var2 ^ -1) == -1) {
                return 100;
              } else {
                var4 = var3 * 100 / var2;
                return var4;
              }
            } else {
              return -39;
            }
          }
        }
    }

    final boolean a(String param0, int param1) {
        int discarded$2 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_1_0 = 0;
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
            if (this.b(-123)) {
              L1: {
                param0 = param0.toLowerCase();
                if (param1 > 80) {
                  break L1;
                } else {
                  var4 = (String) null;
                  discarded$2 = this.a((String) null, true);
                  break L1;
                }
              }
              var5 = (CharSequence) ((Object) param0);
              var3_int = this.field_i.field_b.a(vta.a(var5, -12754), 1);
              if (-1 < (var3_int ^ -1)) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return true;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3);
            stackOut_9_1 = new StringBuilder().append("cn.E(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    final static void e(int param0) {
        sla.b(29585);
        if (param0 != 19470) {
            cn.e(46);
        }
    }

    final synchronized boolean b(int param0) {
        boolean discarded$0 = false;
        if (param0 > -30) {
            discarded$0 = this.a(((int[]) (this.field_a[0]))[3], (byte) -61, 31);
        }
        if (null == this.field_i) {
            this.field_i = this.field_d.a(true);
            if (!(this.field_i != null)) {
                return false;
            }
            this.field_l = new Object[this.field_i.field_l][];
            this.field_a = new Object[this.field_i.field_l];
        }
        return true;
    }

    final synchronized boolean a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_10_0 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        if (!this.b(param0 + -86)) {
          return false;
        } else {
          var2 = 1;
          var3 = param0;
          L0: while (true) {
            L1: {
              L2: {
                if ((this.field_i.field_k.length ^ -1) >= (var3 ^ -1)) {
                  break L2;
                } else {
                  stackOut_5_0 = this.field_i.field_k[var3];
                  stackIn_11_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (var5 != 0) {
                    break L1;
                  } else {
                    L3: {
                      var4 = stackIn_6_0;
                      if (this.field_a[var4] != null) {
                        break L3;
                      } else {
                        this.c(param0 + 22214, var4);
                        if (null != this.field_a[var4]) {
                          break L3;
                        } else {
                          var2 = 0;
                          break L3;
                        }
                      }
                    }
                    var3++;
                    if (var5 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackOut_10_0 = var2;
              stackIn_11_0 = stackOut_10_0;
              break L1;
            }
            return stackIn_11_0 != 0;
          }
        }
    }

    final static int a(byte param0, int param1, int param2, int param3) {
        int var4 = 26 % ((-23 - param0) / 48);
        return param1 / (param2 / (1 << param3));
    }

    final int a(boolean param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_1_0 = 0;
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
            if (this.b(-1, param2)) {
              L1: {
                if (param0) {
                  break L1;
                } else {
                  ((boolean[]) (this.field_a[2]))[0] = ((boolean[]) (this.field_a[11]))[0];
                  break L1;
                }
              }
              param1 = param1.toLowerCase();
              var5 = (CharSequence) ((Object) param1);
              var4_int = this.field_i.field_e[param2].a(vta.a(var5, -12754), 1);
              if (this.a(param2, var4_int, (byte) -75)) {
                stackOut_8_0 = var4_int;
                stackIn_9_0 = stackOut_8_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_6_0 = -1;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = -1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var4);
            stackOut_10_1 = new StringBuilder().append("cn.I(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_9_0;
          }
        }
    }

    final synchronized boolean e(int param0, int param1) {
        int discarded$0 = 0;
        if (!this.b(-1, param0)) {
            return false;
        }
        if (!(null == this.field_a[param0])) {
            return true;
        }
        if (param1 != -2) {
            discarded$0 = this.a(((boolean[]) (this.field_a[20]))[1]);
        }
        this.c(22214, param0);
        if (this.field_a[param0] != null) {
            return true;
        }
        return false;
    }

    final synchronized boolean a(int param0, int param1) {
        if (!(this.b(-71))) {
            return false;
        }
        if (!((this.field_i.field_p.length ^ -1) != -2)) {
            return this.a(0, (byte) -127, param1);
        }
        if (!this.b(-1, param1)) {
            return false;
        }
        if (param0 != -15121) {
            return ((boolean[]) (this.field_a[6]))[1];
        }
        if (!(this.field_i.field_p[param1] != 1)) {
            return this.a(param1, (byte) -80, 0);
        }
        throw new RuntimeException();
    }

    private final synchronized void c(int param0, int param1) {
        if (param0 == 22214) {
          L0: {
            L1: {
              if (!this.field_g) {
                break L1;
              } else {
                this.field_a[param1] = this.field_d.a(param1, (byte) -39);
                if (!TombRacer.field_G) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            this.field_a[param1] = bw.a(270, this.field_d.a(param1, (byte) -39), false);
            break L0;
          }
          return;
        } else {
          return;
        }
    }

    private final synchronized boolean a(int param0, int[] param1, int param2, int param3) {
        Object[] array$2 = null;
        byte[] array$3 = null;
        RuntimeException var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var10_int = 0;
        byte[] var10_array = null;
        int var11 = 0;
        RuntimeException var12_ref_RuntimeException = null;
        int var12 = 0;
        int var13 = 0;
        int var15 = 0;
        int[] var15_ref_int__ = null;
        int var16 = 0;
        byte[][] var16_ref_byte____ = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        byte[] var24 = null;
        int[] var25 = null;
        byte[] var26 = null;
        uia var27 = null;
        byte[] var28 = null;
        uia var30 = null;
        int[] var31 = null;
        byte[][] var32 = null;
        uia var33 = null;
        int[] var35 = null;
        byte[] var36 = null;
        byte[] var37 = null;
        int[] var39 = null;
        byte[][] var40 = null;
        byte[] var44 = null;
        byte[] var45 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        Object stackIn_15_0 = null;
        int[] stackIn_15_1 = null;
        int stackIn_24_0 = 0;
        Object stackIn_26_0 = null;
        int[] stackIn_26_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        int stackIn_39_2 = 0;
        int stackIn_48_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_128_0 = 0;
        RuntimeException stackIn_130_0 = null;
        StringBuilder stackIn_130_1 = null;
        RuntimeException stackIn_131_0 = null;
        StringBuilder stackIn_131_1 = null;
        RuntimeException stackIn_132_0 = null;
        StringBuilder stackIn_132_1 = null;
        String stackIn_132_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        Object stackOut_14_0 = null;
        int[] stackOut_14_1 = null;
        Object stackOut_25_0 = null;
        int[] stackOut_25_1 = null;
        int stackOut_23_0 = 0;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        int stackOut_47_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_127_0 = 0;
        RuntimeException stackOut_129_0 = null;
        StringBuilder stackOut_129_1 = null;
        RuntimeException stackOut_131_0 = null;
        StringBuilder stackOut_131_1 = null;
        String stackOut_131_2 = null;
        RuntimeException stackOut_130_0 = null;
        StringBuilder stackOut_130_1 = null;
        String stackOut_130_2 = null;
        var23 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (!this.b(-1, param0)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (null == this.field_a[param0]) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  var5_int = this.field_i.field_c[param0];
                  var35 = this.field_i.field_n[param0];
                  var25 = var35;
                  var6 = var25;
                  if (null == this.field_l[param0]) {
                    array$2 = new Object[this.field_i.field_p[param0]];
                    this.field_l[param0] = array$2;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var9 = -97 / ((-45 - param3) / 57);
                var7 = this.field_l[param0];
                var8 = 1;
                var10_int = 0;
                L2: while (true) {
                  L3: {
                    L4: {
                      if (var10_int >= var5_int) {
                        break L4;
                      } else {
                        stackOut_14_0 = null;
                        stackOut_14_1 = (int[]) (var6);
                        stackIn_26_0 = stackOut_14_0;
                        stackIn_26_1 = stackOut_14_1;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        if (var23 != 0) {
                          break L3;
                        } else {
                          L5: {
                            L6: {
                              if (stackIn_15_0 == stackIn_15_1) {
                                break L6;
                              } else {
                                var11 = var35[var10_int];
                                if (var23 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            var11 = var10_int;
                            break L5;
                          }
                          L7: {
                            if (null != var7[var11]) {
                              break L7;
                            } else {
                              var8 = 0;
                              if (var23 == 0) {
                                break L4;
                              } else {
                                break L7;
                              }
                            }
                          }
                          var10_int++;
                          if (var23 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    if (var8 == 0) {
                      stackOut_25_0 = null;
                      stackOut_25_1 = (int[]) (param1);
                      stackIn_26_0 = stackOut_25_0;
                      stackIn_26_1 = stackOut_25_1;
                      break L3;
                    } else {
                      stackOut_23_0 = 1;
                      stackIn_24_0 = stackOut_23_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                  L8: {
                    L9: {
                      if (stackIn_26_0 == stackIn_26_1) {
                        break L9;
                      } else {
                        L10: {
                          if ((param1[0] ^ -1) != -1) {
                            break L10;
                          } else {
                            if (-1 != (param1[1] ^ -1)) {
                              break L10;
                            } else {
                              if ((param1[2] ^ -1) != -1) {
                                break L10;
                              } else {
                                if (param1[3] != 0) {
                                  break L10;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                        var36 = ir.a(this.field_a[param0], 13588, true);
                        var26 = var36;
                        var10_array = var26;
                        var27 = new uia(var36);
                        var27.a(var27.field_g.length, -84984444, param1, 5);
                        break L8;
                      }
                    }
                    var10_array = ir.a(this.field_a[param0], 13588, false);
                    break L8;
                  }
                  try {
                    L11: {
                      var37 = sua.a(var10_array, -101);
                      var28 = var37;
                      var24 = var28;
                      var44 = var24;
                      break L11;
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L12: {
                      var12_ref_RuntimeException = decompiledCaughtException;
                      stackOut_36_0 = (RuntimeException) (var12_ref_RuntimeException);
                      stackOut_36_1 = new StringBuilder();
                      stackIn_38_0 = stackOut_36_0;
                      stackIn_38_1 = stackOut_36_1;
                      stackIn_37_0 = stackOut_36_0;
                      stackIn_37_1 = stackOut_36_1;
                      if (param1 == null) {
                        stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
                        stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
                        stackOut_38_2 = 0;
                        stackIn_39_0 = stackOut_38_0;
                        stackIn_39_1 = stackOut_38_1;
                        stackIn_39_2 = stackOut_38_2;
                        break L12;
                      } else {
                        stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
                        stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
                        stackOut_37_2 = 1;
                        stackIn_39_0 = stackOut_37_0;
                        stackIn_39_1 = stackOut_37_1;
                        stackIn_39_2 = stackOut_37_2;
                        break L12;
                      }
                    }
                    throw tba.a((Throwable) ((Object) stackIn_39_0), (stackIn_39_2 != 0) + " " + param0 + " " + param1.length + " " + sq.a(param1.length, var10_array, (byte) -103) + " " + sq.a(-2 + param1.length, var10_array, (byte) -99) + " " + this.field_i.field_j[param0] + " " + this.field_i.field_d);
                  }
                  L13: {
                    if (this.field_g) {
                      this.field_a[param0] = null;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    L15: {
                      L16: {
                        if (var5_int <= 1) {
                          break L16;
                        } else {
                          L17: {
                            if (this.field_j == 2) {
                              break L17;
                            } else {
                              var12 = var37.length;
                              var12--;
                              var13 = var24[var12] & 255;
                              var12 = var12 - var13 * var5_int * 4;
                              var30 = new uia(var44);
                              var39 = new int[var5_int];
                              var31 = var39;
                              var15_ref_int__ = var31;
                              var30.field_h = var12;
                              var16 = 0;
                              L18: while (true) {
                                L19: {
                                  L20: {
                                    if ((var16 ^ -1) <= (var13 ^ -1)) {
                                      break L20;
                                    } else {
                                      var17 = 0;
                                      stackOut_47_0 = 0;
                                      stackIn_56_0 = stackOut_47_0;
                                      stackIn_48_0 = stackOut_47_0;
                                      if (var23 != 0) {
                                        break L19;
                                      } else {
                                        var18 = stackIn_48_0;
                                        L21: while (true) {
                                          L22: {
                                            L23: {
                                              if (var18 >= var5_int) {
                                                break L23;
                                              } else {
                                                var17 = var17 + var30.e(101);
                                                var15_ref_int__[var18] = var15_ref_int__[var18] + var17;
                                                var18++;
                                                if (var23 != 0) {
                                                  break L22;
                                                } else {
                                                  if (var23 == 0) {
                                                    continue L21;
                                                  } else {
                                                    break L23;
                                                  }
                                                }
                                              }
                                            }
                                            var16++;
                                            break L22;
                                          }
                                          if (var23 == 0) {
                                            continue L18;
                                          } else {
                                            break L20;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  stackOut_55_0 = var5_int;
                                  stackIn_56_0 = stackOut_55_0;
                                  break L19;
                                }
                                var40 = new byte[stackIn_56_0][];
                                var32 = var40;
                                var16_ref_byte____ = var32;
                                var17 = 0;
                                L24: while (true) {
                                  L25: {
                                    L26: {
                                      if (var5_int <= var17) {
                                        break L26;
                                      } else {
                                        array$3 = new byte[var39[var17]];
                                        var16_ref_byte____[var17] = array$3;
                                        var39[var17] = 0;
                                        var17++;
                                        if (var23 != 0) {
                                          break L25;
                                        } else {
                                          if (var23 == 0) {
                                            continue L24;
                                          } else {
                                            break L26;
                                          }
                                        }
                                      }
                                    }
                                    var30.field_h = var12;
                                    var17 = 0;
                                    break L25;
                                  }
                                  var18 = 0;
                                  L27: while (true) {
                                    L28: {
                                      L29: {
                                        if ((var13 ^ -1) >= (var18 ^ -1)) {
                                          break L29;
                                        } else {
                                          var19 = 0;
                                          stackOut_64_0 = 0;
                                          stackIn_73_0 = stackOut_64_0;
                                          stackIn_65_0 = stackOut_64_0;
                                          if (var23 != 0) {
                                            break L28;
                                          } else {
                                            var20 = stackIn_65_0;
                                            L30: while (true) {
                                              L31: {
                                                L32: {
                                                  if (var20 >= var5_int) {
                                                    break L32;
                                                  } else {
                                                    var19 = var19 + var30.e(-98);
                                                    lua.a(var37, var17, var40[var20], var39[var20], var19);
                                                    var17 = var17 + var19;
                                                    var15_ref_int__[var20] = var15_ref_int__[var20] + var19;
                                                    var20++;
                                                    if (var23 != 0) {
                                                      break L31;
                                                    } else {
                                                      if (var23 == 0) {
                                                        continue L30;
                                                      } else {
                                                        break L32;
                                                      }
                                                    }
                                                  }
                                                }
                                                var18++;
                                                break L31;
                                              }
                                              if (var23 == 0) {
                                                continue L27;
                                              } else {
                                                break L29;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      stackOut_72_0 = 0;
                                      stackIn_73_0 = stackOut_72_0;
                                      break L28;
                                    }
                                    var18 = stackIn_73_0;
                                    L33: while (true) {
                                      L34: {
                                        if (var5_int <= var18) {
                                          break L34;
                                        } else {
                                          if (var23 != 0) {
                                            break L15;
                                          } else {
                                            L35: {
                                              L36: {
                                                if (var6 != null) {
                                                  break L36;
                                                } else {
                                                  var19 = var18;
                                                  if (var23 == 0) {
                                                    break L35;
                                                  } else {
                                                    break L36;
                                                  }
                                                }
                                              }
                                              var19 = var35[var18];
                                              break L35;
                                            }
                                            L37: {
                                              L38: {
                                                if (this.field_j != 0) {
                                                  break L38;
                                                } else {
                                                  var7[var19] = bw.a(270, var40[var18], false);
                                                  if (var23 == 0) {
                                                    break L37;
                                                  } else {
                                                    break L38;
                                                  }
                                                }
                                              }
                                              var7[var19] = var40[var18];
                                              break L37;
                                            }
                                            var18++;
                                            if (var23 == 0) {
                                              continue L33;
                                            } else {
                                              break L34;
                                            }
                                          }
                                        }
                                      }
                                      if (var23 == 0) {
                                        break L15;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var12 = var37.length;
                          var12--;
                          var13 = var24[var12] & 255;
                          var12 = var12 - 4 * (var5_int * var13);
                          var33 = new uia(var44);
                          var15 = 0;
                          var33.field_h = var12;
                          var16 = 0;
                          var17 = 0;
                          L39: while (true) {
                            L40: {
                              L41: {
                                if (var17 >= var13) {
                                  break L41;
                                } else {
                                  var18 = 0;
                                  stackOut_87_0 = 0;
                                  stackIn_100_0 = stackOut_87_0;
                                  stackIn_88_0 = stackOut_87_0;
                                  if (var23 != 0) {
                                    break L40;
                                  } else {
                                    var19 = stackIn_88_0;
                                    L42: while (true) {
                                      L43: {
                                        L44: {
                                          if ((var5_int ^ -1) >= (var19 ^ -1)) {
                                            break L44;
                                          } else {
                                            var18 = var18 + var33.e(118);
                                            if (var23 != 0) {
                                              break L43;
                                            } else {
                                              L45: {
                                                L46: {
                                                  if (var6 == null) {
                                                    break L46;
                                                  } else {
                                                    var20 = var35[var19];
                                                    if (var23 == 0) {
                                                      break L45;
                                                    } else {
                                                      break L46;
                                                    }
                                                  }
                                                }
                                                var20 = var19;
                                                break L45;
                                              }
                                              L47: {
                                                if ((var20 ^ -1) != (param2 ^ -1)) {
                                                  break L47;
                                                } else {
                                                  var16 = var20;
                                                  var15 = var15 + var18;
                                                  break L47;
                                                }
                                              }
                                              var19++;
                                              if (var23 == 0) {
                                                continue L42;
                                              } else {
                                                break L44;
                                              }
                                            }
                                          }
                                        }
                                        var17++;
                                        break L43;
                                      }
                                      if (var23 == 0) {
                                        continue L39;
                                      } else {
                                        break L41;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_99_0 = var15 ^ -1;
                              stackIn_100_0 = stackOut_99_0;
                              break L40;
                            }
                            if (stackIn_100_0 == -1) {
                              stackOut_102_0 = 1;
                              stackIn_103_0 = stackOut_102_0;
                              decompiledRegionSelector0 = 3;
                              break L0;
                            } else {
                              var45 = new byte[var15];
                              var33.field_h = var12;
                              var15 = 0;
                              var18 = 0;
                              var19 = 0;
                              L48: while (true) {
                                L49: {
                                  if ((var13 ^ -1) >= (var19 ^ -1)) {
                                    break L49;
                                  } else {
                                    var20 = 0;
                                    stackOut_106_0 = 0;
                                    stackIn_128_0 = stackOut_106_0;
                                    stackIn_107_0 = stackOut_106_0;
                                    if (var23 != 0) {
                                      break L14;
                                    } else {
                                      var21 = stackIn_107_0;
                                      L50: while (true) {
                                        L51: {
                                          L52: {
                                            if ((var5_int ^ -1) >= (var21 ^ -1)) {
                                              break L52;
                                            } else {
                                              var20 = var20 + var33.e(-14);
                                              if (var23 != 0) {
                                                break L51;
                                              } else {
                                                L53: {
                                                  L54: {
                                                    if (var6 != null) {
                                                      break L54;
                                                    } else {
                                                      var22 = var21;
                                                      if (var23 == 0) {
                                                        break L53;
                                                      } else {
                                                        break L54;
                                                      }
                                                    }
                                                  }
                                                  var22 = var35[var21];
                                                  break L53;
                                                }
                                                L55: {
                                                  if (var22 == param2) {
                                                    lua.a(var44, var18, var45, var15, var20);
                                                    var15 = var15 + var20;
                                                    break L55;
                                                  } else {
                                                    break L55;
                                                  }
                                                }
                                                var18 = var18 + var20;
                                                var21++;
                                                if (var23 == 0) {
                                                  continue L50;
                                                } else {
                                                  break L52;
                                                }
                                              }
                                            }
                                          }
                                          var19++;
                                          break L51;
                                        }
                                        if (var23 == 0) {
                                          continue L48;
                                        } else {
                                          break L49;
                                        }
                                      }
                                    }
                                  }
                                }
                                var7[var16] = var45;
                                if (var23 == 0) {
                                  break L15;
                                } else {
                                  break L16;
                                }
                              }
                            }
                          }
                        }
                      }
                      L56: {
                        L57: {
                          if (var6 != null) {
                            break L57;
                          } else {
                            var12 = 0;
                            if (var23 == 0) {
                              break L56;
                            } else {
                              break L57;
                            }
                          }
                        }
                        var12 = var35[0];
                        break L56;
                      }
                      L58: {
                        if ((this.field_j ^ -1) != -1) {
                          break L58;
                        } else {
                          var7[var12] = bw.a(270, var37, false);
                          if (var23 == 0) {
                            break L15;
                          } else {
                            break L58;
                          }
                        }
                      }
                      var7[var12] = var37;
                      return true;
                    }
                    stackOut_127_0 = 1;
                    stackIn_128_0 = stackOut_127_0;
                    break L14;
                  }
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L59: {
            var5 = decompiledCaughtException;
            stackOut_129_0 = (RuntimeException) (var5);
            stackOut_129_1 = new StringBuilder().append("cn.D(").append(param0).append(',');
            stackIn_131_0 = stackOut_129_0;
            stackIn_131_1 = stackOut_129_1;
            stackIn_130_0 = stackOut_129_0;
            stackIn_130_1 = stackOut_129_1;
            if (param1 == null) {
              stackOut_131_0 = (RuntimeException) ((Object) stackIn_131_0);
              stackOut_131_1 = (StringBuilder) ((Object) stackIn_131_1);
              stackOut_131_2 = "null";
              stackIn_132_0 = stackOut_131_0;
              stackIn_132_1 = stackOut_131_1;
              stackIn_132_2 = stackOut_131_2;
              break L59;
            } else {
              stackOut_130_0 = (RuntimeException) ((Object) stackIn_130_0);
              stackOut_130_1 = (StringBuilder) ((Object) stackIn_130_1);
              stackOut_130_2 = "{...}";
              stackIn_132_0 = stackOut_130_0;
              stackIn_132_1 = stackOut_130_1;
              stackIn_132_2 = stackOut_130_2;
              break L59;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_132_0), stackIn_132_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_24_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_103_0 != 0;
              } else {
                return stackIn_128_0 != 0;
              }
            }
          }
        }
    }

    final int c(int param0) {
        if (param0 != 4) {
            this.field_a[4] = ((Object[]) (this.field_a[0]))[5];
        }
        if (!(this.b(-44))) {
            return -1;
        }
        return this.field_i.field_p.length;
    }

    private final synchronized boolean a(int param0, int param1, byte param2) {
        int var4 = 0;
        if (this.b(-74)) {
          L0: {
            if (-1 < (param0 ^ -1)) {
              break L0;
            } else {
              if (param1 < 0) {
                break L0;
              } else {
                if (param0 >= this.field_i.field_p.length) {
                  break L0;
                } else {
                  if (param1 >= this.field_i.field_p[param0]) {
                    break L0;
                  } else {
                    var4 = 9 % ((23 - param2) / 61);
                    return true;
                  }
                }
              }
            }
          }
          if (nl.field_b) {
            throw new IllegalArgumentException(param0 + " " + param1);
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final synchronized int[] d(int param0, int param1) {
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int[] stackIn_7_0 = null;
        int[] stackIn_10_0 = null;
        int[] stackOut_6_0 = null;
        int[] stackOut_9_0 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        if (this.b(-1, param1)) {
          L0: {
            L1: {
              var3 = 121 % ((param0 - -15) / 58);
              var4 = this.field_i.field_n[param1];
              if (var4 == null) {
                var7 = new int[this.field_i.field_c[param1]];
                var4 = var7;
                var5 = 0;
                L2: while (true) {
                  if (var5 >= var7.length) {
                    break L1;
                  } else {
                    stackOut_6_0 = (int[]) (var7);
                    stackIn_10_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var6 != 0) {
                      break L0;
                    } else {
                      stackIn_7_0[var5] = var5;
                      var5++;
                      if (var6 == 0) {
                        continue L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            stackOut_9_0 = (int[]) (var4);
            stackIn_10_0 = stackOut_9_0;
            break L0;
          }
          return stackIn_10_0;
        } else {
          return null;
        }
    }

    final boolean a(String param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (!this.b(-89)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param0 = param0.toLowerCase();
              param1 = param1.toLowerCase();
              var6 = (CharSequence) ((Object) param0);
              var4_int = this.field_i.field_b.a(vta.a(var6, -12754), 1);
              if (var4_int >= param2) {
                var7 = (CharSequence) ((Object) param1);
                var5 = this.field_i.field_e[var4_int].a(vta.a(var7, -12754), 1);
                if (0 > var5) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return true;
                }
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var4);
            stackOut_11_1 = new StringBuilder().append("cn.O(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          L2: {
            stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            return stackIn_10_0 != 0;
          }
        }
    }

    final synchronized byte[] f(int param0, int param1) {
        if (!this.b(-63)) {
            return null;
        }
        if ((this.field_i.field_p.length ^ -1) == -2) {
            return this.a(false, 0, param0);
        }
        if (!this.b(-1, param0)) {
            return null;
        }
        if ((this.field_i.field_p[param0] ^ -1) == -2) {
            return this.a(false, param0, 0);
        }
        int var3 = -8 / ((50 - param1) / 42);
        throw new RuntimeException();
    }

    final static int a(byte param0) {
        if (param0 < 53) {
            return 20;
        }
        return 1900 + new Date().getYear();
    }

    final int b(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
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
            if (this.b(-93)) {
              param0 = param0.toLowerCase();
              if (param1 == -7768) {
                var4 = (CharSequence) ((Object) param0);
                var3_int = this.field_i.field_b.a(vta.a(var4, -12754), param1 ^ -7767);
                if (!this.b(param1 ^ 7767, var3_int)) {
                  stackOut_8_0 = -1;
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return var3_int;
                }
              } else {
                stackOut_4_0 = 61;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = -1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3);
            stackOut_10_1 = new StringBuilder().append("cn.P(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_9_0;
          }
        }
    }

    final boolean c(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_7_0 = false;
        int stackOut_5_0 = 0;
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
            if (!this.b(-108)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1 < -121) {
                param0 = param0.toLowerCase();
                var4 = (CharSequence) ((Object) param0);
                var3_int = this.field_i.field_b.a(vta.a(var4, -12754), 1);
                stackOut_7_0 = this.e(var3_int, -2);
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3);
            stackOut_9_1 = new StringBuilder().append("cn.F(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            return stackIn_8_0;
          }
        }
    }

    final synchronized byte[] a(String param0, byte param1, String param2) {
        boolean discarded$2 = false;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_8_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (this.b(-31)) {
              param0 = param0.toLowerCase();
              param2 = param2.toLowerCase();
              var6 = (CharSequence) ((Object) param0);
              var4_int = this.field_i.field_b.a(vta.a(var6, -12754), 1);
              if (this.b(-1, var4_int)) {
                L1: {
                  if (param1 > 112) {
                    break L1;
                  } else {
                    discarded$2 = this.a(((int[]) (this.field_a[12]))[21]);
                    break L1;
                  }
                }
                var7 = (CharSequence) ((Object) param2);
                var5 = this.field_i.field_e[var4_int].a(vta.a(var7, -12754), 1);
                stackOut_8_0 = this.a(false, var4_int, var5);
                stackIn_9_0 = stackOut_8_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var4);
            stackOut_10_1 = new StringBuilder().append("cn.DA(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_2_0);
        } else {
          return stackIn_9_0;
        }
    }

    final synchronized boolean a(int param0, byte param1, int param2) {
        int discarded$0 = 0;
        if (!(this.a(param0, param2, (byte) -97))) {
            return false;
        }
        if (null != this.field_l[param0]) {
            if (this.field_l[param0][param2] != null) {
                return true;
            }
        }
        if (this.field_a[param0] != null) {
            return true;
        }
        this.c(22214, param0);
        if (this.field_a[param0] != null) {
            return true;
        }
        if (param1 >= -70) {
            discarded$0 = this.a(false, (String) (this.field_a[14]), ((int[]) (((Object[]) (this.field_a[14]))[3]))[2]);
            return false;
        }
        return false;
    }

    private final synchronized byte[] a(int param0, boolean param1, int[] param2, int param3) {
        Object var5 = null;
        byte[] var7 = null;
        byte[] stackIn_2_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_31_0 = null;
        Object stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        Object stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        Object stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_12_0 = null;
        Object stackOut_30_0 = null;
        byte[] stackOut_1_0 = null;
        Object stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        Object stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        Object stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        try {
          L0: {
            if (param1) {
              if (this.a(param3, param0, (byte) 92)) {
                L1: {
                  L2: {
                    var5 = null;
                    if (null == this.field_l[param3]) {
                      break L2;
                    } else {
                      if (this.field_l[param3][param0] == null) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  if (!this.a(param3, param2, param0, -122)) {
                    this.c(22214, param3);
                    if (this.a(param3, param2, param0, 43)) {
                      break L1;
                    } else {
                      stackOut_12_0 = null;
                      stackIn_13_0 = stackOut_12_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    break L1;
                  }
                }
                if (this.field_l[param3] == null) {
                  throw new RuntimeException("");
                } else {
                  L3: {
                    if (this.field_l[param3][param0] != null) {
                      var7 = ir.a(this.field_l[param3][param0], 13588, false);
                      var5 = var7;
                      if (var7 == null) {
                        throw new RuntimeException("");
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (var5 == null) {
                      break L4;
                    } else {
                      L5: {
                        if (this.field_j == 1) {
                          break L5;
                        } else {
                          if (this.field_j != 2) {
                            break L4;
                          } else {
                            this.field_l[param3] = null;
                            if (!TombRacer.field_G) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      this.field_l[param3][param0] = null;
                      if (1 == this.field_i.field_p[param3]) {
                        this.field_l[param3] = null;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  stackOut_30_0 = var5;
                  stackIn_31_0 = stackOut_30_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                return null;
              }
            } else {
              stackOut_1_0 = (byte[]) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_32_0 = var5;
            stackOut_32_1 = new StringBuilder().append("cn.FA(").append(param0).append(',').append(param1).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param2 == null) {
              stackOut_34_0 = stackIn_34_0;
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L6;
            } else {
              stackOut_33_0 = stackIn_33_0;
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (byte[]) ((Object) stackIn_13_0);
          } else {
            return (byte[]) ((Object) stackIn_31_0);
          }
        }
    }

    final int a(byte param0, int param1) {
        if (!(this.b(-1, param1))) {
            return 0;
        }
        int var3 = -70 % ((param0 - 3) / 53);
        return this.field_i.field_p[param1];
    }

    final int a(String param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (this.b(-124)) {
              L1: {
                if (param1) {
                  break L1;
                } else {
                  this.field_j = -49;
                  break L1;
                }
              }
              param0 = param0.toLowerCase();
              var4 = (CharSequence) ((Object) param0);
              var3_int = this.field_i.field_b.a(vta.a(var4, -12754), 1);
              stackOut_5_0 = this.a(var3_int, (byte) 119);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("cn.N(");
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
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_6_0;
        }
    }

    private final synchronized boolean b(int param0, int param1) {
        if (!this.b(-80)) {
          return false;
        } else {
          L0: {
            if ((param1 ^ -1) > param0) {
              break L0;
            } else {
              if (param1 >= this.field_i.field_p.length) {
                break L0;
              } else {
                if (this.field_i.field_p[param1] != 0) {
                  return true;
                } else {
                  break L0;
                }
              }
            }
          }
          if (nl.field_b) {
            throw new IllegalArgumentException(Integer.toString(param1));
          } else {
            return false;
          }
        }
    }

    final byte[] a(boolean param0, int param1, int param2) {
        boolean discarded$0 = false;
        if (param0) {
            discarded$0 = this.b(((int[]) (this.field_a[11]))[23], 94);
        }
        return this.a(param2, true, (int[]) null, param1);
    }

    cn(dr param0, boolean param1, int param2) {
        RuntimeException runtimeException = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        this.field_i = null;
        try {
          L0: {
            L1: {
              if (0 > param2) {
                break L1;
              } else {
                if (2 >= param2) {
                  L2: {
                    this.field_j = param2;
                    this.field_d = param0;
                    stackOut_4_0 = this;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (!param1) {
                      stackOut_6_0 = this;
                      stackOut_6_1 = 0;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      break L2;
                    } else {
                      stackOut_5_0 = this;
                      stackOut_5_1 = 1;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      break L2;
                    }
                  }
                  ((cn) (this)).field_g = stackIn_7_1 != 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (runtimeException);
            stackOut_9_1 = new StringBuilder().append("cn.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_k = -1;
        field_c = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find suitable opponents in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
        field_e = "End Game";
        field_f = "Low";
    }
}
