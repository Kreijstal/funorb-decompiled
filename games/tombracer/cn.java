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
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.b(param1 ^ -44)) {
              L1: {
                param0 = param0.toLowerCase();
                if (param1 == 2) {
                  break L1;
                } else {
                  this.a(((boolean[]) (((Object[]) (this.field_a[4]))[5]))[6], 76, -83);
                  break L1;
                }
              }
              param2 = param2.toLowerCase();
              var6 = (CharSequence) ((Object) param0);
              var4_int = this.field_i.field_b.a(vta.a(var6, -12754), 1);
              if (!this.b(-1, var4_int)) {
                stackIn_8_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var7 = (CharSequence) ((Object) param2);
                var5 = this.field_i.field_e[var4_int].a(vta.a(var7, -12754), 1);
                stackIn_10_0 = this.a(var4_int, (byte) -126, var5);
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("cn.G(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ')');
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
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = TombRacer.field_G ? 1 : 0;
        if (!this.b(-90)) {
          return 0;
        } else {
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (this.field_a.length <= var4) {
              if (param0) {
                if (var2 == 0) {
                  return 100;
                } else {
                  var4 = var3 * 100 / var2;
                  return var4;
                }
              } else {
                return -39;
              }
            } else {
              if (0 < this.field_i.field_c[var4]) {
                var2 += 100;
                var3 = var3 + this.a(var4, (byte) 118);
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        }
    }

    final boolean a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.b(-123)) {
              L1: {
                param0 = param0.toLowerCase();
                if (param1 > 80) {
                  break L1;
                } else {
                  var4 = (String) null;
                  this.a((String) null, true);
                  break L1;
                }
              }
              var5 = (CharSequence) ((Object) param0);
              var3_int = this.field_i.field_b.a(vta.a(var5, -12754), 1);
              if (-1 < (var3_int ^ -1)) {
                stackIn_8_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return true;
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("cn.E(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
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
        if (param0 > -30) {
            this.a(((int[]) (this.field_a[0]))[3], (byte) -61, 31);
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
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = TombRacer.field_G ? 1 : 0;
        if (!this.b(param0 + -86)) {
          return false;
        } else {
          var2 = 1;
          var3 = param0;
          L0: while (true) {
            if (this.field_i.field_k.length <= var3) {
              return var2 != 0;
            } else {
              var4 = this.field_i.field_k[var3];
              if (this.field_a[var4] == null) {
                this.c(param0 + 22214, var4);
                if (null == this.field_a[var4]) {
                  var2 = 0;
                  var3++;
                  continue L0;
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                continue L0;
              }
            }
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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                stackIn_9_0 = var4_int;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_7_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("cn.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
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
        if (!this.b(-1, param0)) {
            return false;
        }
        if (!(null == this.field_a[param0])) {
            return true;
        }
        if (param1 != -2) {
            this.a(((boolean[]) (this.field_a[20]))[1]);
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
        if (param0 != 22214) {
            return;
        }
        if (this.field_g) {
            this.field_a[param1] = this.field_d.a(param1, (byte) -39);
        } else {
            this.field_a[param1] = bw.a(270, this.field_d.a(param1, (byte) -39), false);
        }
    }

    private final synchronized boolean a(int param0, int[] param1, int param2, int param3) {
        Object[] array$0 = null;
        byte[] array$1 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_80_0 = 0;
        int stackIn_101_0 = 0;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_105_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        byte[] var10 = null;
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
        var23 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (!this.b(-1, param0)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (null == this.field_a[param0]) {
                stackIn_8_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  var5_int = this.field_i.field_c[param0];
                  var35 = this.field_i.field_n[param0];
                  var25 = var35;
                  var6 = var25;
                  if (null == this.field_l[param0]) {
                    array$0 = new Object[this.field_i.field_p[param0]];
                    this.field_l[param0] = array$0;
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
                    if (var10_int >= var5_int) {
                      break L3;
                    } else {
                      L4: {
                        if (null == var6) {
                          var11 = var10_int;
                          break L4;
                        } else {
                          var11 = var35[var10_int];
                          break L4;
                        }
                      }
                      if (null != var7[var11]) {
                        var10_int++;
                        continue L2;
                      } else {
                        var8 = 0;
                        break L3;
                      }
                    }
                  }
                  if (var8 == 0) {
                    L5: {
                      L6: {
                        if (null == param1) {
                          break L6;
                        } else {
                          L7: {
                            if (param1[0] != 0) {
                              break L7;
                            } else {
                              if (-1 != (param1[1] ^ -1)) {
                                break L7;
                              } else {
                                if (param1[2] != 0) {
                                  break L7;
                                } else {
                                  if (param1[3] != 0) {
                                    break L7;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                          var36 = ir.a(this.field_a[param0], 13588, true);
                          var26 = var36;
                          var10 = var26;
                          var27 = new uia(var36);
                          var27.a(var27.field_g.length, -84984444, param1, 5);
                          break L5;
                        }
                      }
                      var10 = ir.a(this.field_a[param0], 13588, false);
                      break L5;
                    }
                    try {
                      L8: {
                        var37 = sua.a(var10, -101);
                        var28 = var37;
                        var24 = var28;
                        var44 = var24;
                        break L8;
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L9: {
                        var12_ref_RuntimeException = decompiledCaughtException;
                        stackIn_35_0 = (RuntimeException) (var12_ref_RuntimeException);

                        stackIn_35_1 = new StringBuilder();

                        if (param1 == null) {
                          stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
                          stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
                          stackIn_36_2 = 0;
                          break L9;
                        } else {
                          stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
                          stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
                          stackIn_36_2 = 1;
                          break L9;
                        }
                      }
                      throw tba.a((Throwable) ((Object) stackIn_36_0), (stackIn_36_2 != 0) + " " + param0 + " " + var10.length + " " + sq.a(var10.length, var10, (byte) -103) + " " + sq.a(-2 + var10.length, var10, (byte) -99) + " " + this.field_i.field_j[param0] + " " + this.field_i.field_d);
                    }
                    L10: {
                      if (this.field_g) {
                        this.field_a[param0] = null;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (var5_int <= 1) {
                        L12: {
                          if (var6 != null) {
                            var12 = var35[0];
                            break L12;
                          } else {
                            var12 = 0;
                            break L12;
                          }
                        }
                        if (this.field_j != 0) {
                          var7[var12] = var44;
                          break L11;
                        } else {
                          var7[var12] = bw.a(270, var37, false);
                          break L11;
                        }
                      } else {
                        if (this.field_j == 2) {
                          var12 = var37.length;
                          var12--;
                          var13 = var24[var12] & 255;
                          var12 = var12 - 4 * (var5_int * var13);
                          var33 = new uia(var44);
                          var15 = 0;
                          var33.field_h = var12;
                          var16 = 0;
                          var17 = 0;
                          L13: while (true) {
                            if (var17 >= var13) {
                              if (var15 == 0) {
                                stackIn_80_0 = 1;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                var45 = new byte[var15];
                                var33.field_h = var12;
                                var15 = 0;
                                var18 = 0;
                                var19 = 0;
                                L14: while (true) {
                                  if (var13 <= var19) {
                                    var7[var16] = var45;
                                    return true;
                                  } else {
                                    var20 = 0;
                                    var21 = 0;
                                    L15: while (true) {
                                      if (var5_int <= var21) {
                                        var19++;
                                        continue L14;
                                      } else {
                                        L16: {
                                          var20 = var20 + var33.e(-14);
                                          if (var6 != null) {
                                            var22 = var35[var21];
                                            break L16;
                                          } else {
                                            var22 = var21;
                                            break L16;
                                          }
                                        }
                                        L17: {
                                          if (var22 == param2) {
                                            lua.a(var44, var18, var45, var15, var20);
                                            var15 = var15 + var20;
                                            break L17;
                                          } else {
                                            break L17;
                                          }
                                        }
                                        var18 = var18 + var20;
                                        var21++;
                                        continue L15;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              var18 = 0;
                              var19 = 0;
                              L18: while (true) {
                                if (var5_int <= var19) {
                                  var17++;
                                  continue L13;
                                } else {
                                  L19: {
                                    var18 = var18 + var33.e(118);
                                    if (var6 == null) {
                                      var20 = var19;
                                      break L19;
                                    } else {
                                      var20 = var35[var19];
                                      break L19;
                                    }
                                  }
                                  if (var20 == param2) {
                                    var16 = var20;
                                    var15 = var15 + var18;
                                    var19++;
                                    continue L18;
                                  } else {
                                    var19++;
                                    continue L18;
                                  }
                                }
                              }
                            }
                          }
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
                          L20: while (true) {
                            if (var16 >= var13) {
                              var40 = new byte[var5_int][];
                              var32 = var40;
                              var16_ref_byte____ = var32;
                              var17 = 0;
                              L21: while (true) {
                                if (var5_int <= var17) {
                                  var30.field_h = var12;
                                  var17 = 0;
                                  var18 = 0;
                                  L22: while (true) {
                                    if (var13 <= var18) {
                                      var18 = 0;
                                      L23: while (true) {
                                        if (var5_int <= var18) {
                                          break L11;
                                        } else {
                                          L24: {
                                            if (var6 != null) {
                                              var19 = var35[var18];
                                              break L24;
                                            } else {
                                              var19 = var18;
                                              break L24;
                                            }
                                          }
                                          L25: {
                                            if (this.field_j != 0) {
                                              var7[var19] = var40[var18];
                                              break L25;
                                            } else {
                                              var7[var19] = bw.a(270, var40[var18], false);
                                              break L25;
                                            }
                                          }
                                          var18++;
                                          continue L23;
                                        }
                                      }
                                    } else {
                                      var19 = 0;
                                      var20 = 0;
                                      L26: while (true) {
                                        if (var20 >= var5_int) {
                                          var18++;
                                          continue L22;
                                        } else {
                                          var19 = var19 + var30.e(-98);
                                          lua.a(var44, var17, var40[var20], var39[var20], var19);
                                          var17 = var17 + var19;
                                          var15_ref_int__[var20] = var15_ref_int__[var20] + var19;
                                          var20++;
                                          continue L26;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  array$1 = new byte[var39[var17]];
                                  var16_ref_byte____[var17] = array$1;
                                  var39[var17] = 0;
                                  var17++;
                                  continue L21;
                                }
                              }
                            } else {
                              var17 = 0;
                              var18 = 0;
                              L27: while (true) {
                                if (var18 >= var5_int) {
                                  var16++;
                                  continue L20;
                                } else {
                                  var17 = var17 + var30.e(101);
                                  var15_ref_int__[var18] = var15_ref_int__[var18] + var17;
                                  var18++;
                                  continue L27;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    stackIn_101_0 = 1;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    stackIn_22_0 = 1;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L28: {
            var5 = decompiledCaughtException;
            stackIn_104_0 = (RuntimeException) (var5);

            stackIn_104_1 = new StringBuilder().append("cn.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_105_0 = (RuntimeException) ((Object) stackIn_104_0);
              stackIn_105_1 = (StringBuilder) ((Object) stackIn_104_1);
              stackIn_105_2 = "null";
              break L28;
            } else {
              stackIn_105_0 = (RuntimeException) ((Object) stackIn_104_0);
              stackIn_105_1 = (StringBuilder) ((Object) stackIn_104_1);
              stackIn_105_2 = "{...}";
              break L28;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_105_0), stackIn_105_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_22_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_80_0 != 0;
              } else {
                return stackIn_101_0 != 0;
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
        int var4;
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
        int[] var7 = null;
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        if (!this.b(-1, param1)) {
            return null;
        }
        int var3 = 121 % ((param0 - -15) / 58);
        int[] var4 = this.field_i.field_n[param1];
        if (!(var4 != null)) {
            var7 = new int[this.field_i.field_c[param1]];
            var4 = var7;
            for (var5 = 0; var5 < var7.length; var5++) {
                var7[var5] = var5;
            }
        }
        return var4;
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
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!this.b(-89)) {
              stackIn_3_0 = 0;
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
                  stackIn_10_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return true;
                }
              } else {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("cn.O(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ',' + param2 + ')');
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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.b(-93)) {
              param0 = param0.toLowerCase();
              if (param1 == -7768) {
                var4 = (CharSequence) ((Object) param0);
                var3_int = this.field_i.field_b.a(vta.a(var4, -12754), param1 ^ -7767);
                if (!this.b(param1 ^ 7767, var3_int)) {
                  stackIn_9_0 = -1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return var3_int;
                }
              } else {
                stackIn_5_0 = 61;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("cn.P(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L1;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
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
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!this.b(-108)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1 < -121) {
                param0 = param0.toLowerCase();
                var4 = (CharSequence) ((Object) param0);
                var3_int = this.field_i.field_b.a(vta.a(var4, -12754), 1);
                stackIn_8_0 = this.e(var3_int, -2);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("cn.F(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L1;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
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
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                    this.a(((int[]) (this.field_a[12]))[21]);
                    break L1;
                  }
                }
                var7 = (CharSequence) ((Object) param2);
                var5 = this.field_i.field_e[var4_int].a(vta.a(var7, -12754), 1);
                stackIn_9_0 = this.a(false, var4_int, var5);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("cn.DA(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_2_0);
        } else {
          return stackIn_9_0;
        }
    }

    final synchronized boolean a(int param0, byte param1, int param2) {
        if (!(this.a(param0, param2, (byte) -97))) {
            return false;
        }
        if (null != this.field_l[param0] && this.field_l[param0][param2] != null) {
            return true;
        }
        if (this.field_a[param0] != null) {
            return true;
        }
        this.c(22214, param0);
        if (this.field_a[param0] != null) {
            return true;
        }
        if (param1 >= -70) {
            this.a(false, (String) (this.field_a[14]), ((int[]) (((Object[]) (this.field_a[14]))[3]))[2]);
            return false;
        }
        return false;
    }

    private final synchronized byte[] a(int param0, boolean param1, int[] param2, int param3) {
        byte[] stackIn_2_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        Object stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        byte[] var7 = null;
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
                      stackIn_13_0 = null;
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
                      if (this.field_j == 1) {
                        this.field_l[param3][param0] = null;
                        if (1 == this.field_i.field_p[param3]) {
                          this.field_l[param3] = null;
                          break L4;
                        } else {
                          break L4;
                        }
                      } else {
                        if (this.field_j != 2) {
                          break L4;
                        } else {
                          this.field_l[param3] = null;
                          break L4;
                        }
                      }
                    }
                  }
                  stackIn_30_0 = var5;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                return null;
              }
            } else {
              stackIn_2_0 = (byte[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_33_0 = var5;

            stackIn_33_1 = new StringBuilder().append("cn.FA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_34_0 = stackIn_33_0;
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L5;
            } else {
              stackIn_34_0 = stackIn_33_0;
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (byte[]) ((Object) stackIn_13_0);
          } else {
            return (byte[]) ((Object) stackIn_30_0);
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
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
              stackIn_6_0 = this.a(var3_int, (byte) 119);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("cn.N(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
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
        if (!(this.b(-80))) {
            return false;
        }
        if ((param1 ^ -1) > param0 || param1 >= this.field_i.field_p.length || this.field_i.field_p[param1] == 0) {
            if (!nl.field_b) {
                return false;
            }
            throw new IllegalArgumentException(Integer.toString(param1));
        }
        return true;
    }

    final byte[] a(boolean param0, int param1, int param2) {
        boolean discarded$0 = false;
        if (param0) {
            discarded$0 = this.b(((int[]) (this.field_a[11]))[23], 94);
        }
        return this.a(param2, true, (int[]) null, param1);
    }

    cn(dr param0, boolean param1, int param2) {
        this.field_i = null;
        try {
            if (0 > param2 || 2 < param2) {
                throw new IllegalArgumentException("");
            }
            this.field_j = param2;
            this.field_d = param0;
            this.field_g = param1 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "cn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_k = -1;
        field_c = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find suitable opponents in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
        field_e = "End Game";
        field_f = "Low";
    }
}
