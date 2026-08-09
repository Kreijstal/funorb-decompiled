/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ag extends oc implements sd {
    oc[] field_H;
    static int[] field_M;
    static String field_I;
    static mf field_G;
    static String[] field_D;
    static String field_J;
    static int[] field_L;
    static int field_E;
    static ta field_F;
    static String field_C;
    static int[] field_K;

    final static void f(byte param0) {
        int var1 = 0;
        if (-33 > (ul.field_p ^ -1)) {
            var1 = ul.field_p % 32;
            if (!(0 != var1)) {
                var1 = 32;
            }
            wp.a(1, -var1 + ul.field_p);
        } else {
            wp.a(1, 0);
        }
        var1 = -4 % ((73 - param0) / 40);
    }

    private final boolean a(int param0, int param1, oc param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        oc var5 = null;
        oc var6 = null;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (this.field_H == null) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 > 99) {
                  break L1;
                } else {
                  this.f(-98);
                  break L1;
                }
              }
              var4_int = -1 + this.field_H.length;
              L2: while (true) {
                if ((var4_int ^ -1) > -1) {
                  stackIn_21_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    var5 = this.field_H[var4_int];
                    if (var5 == null) {
                      break L3;
                    } else {
                      if (!var5.f(-106)) {
                        break L3;
                      } else {
                        var4_int = var4_int - param1;
                        L4: while (true) {
                          if (0 > var4_int) {
                            break L3;
                          } else {
                            L5: {
                              var6 = this.field_H[var4_int];
                              if (var6 != null) {
                                if (!var6.a(true, param2)) {
                                  break L5;
                                } else {
                                  stackIn_17_0 = 1;
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                }
                              } else {
                                break L5;
                              }
                            }
                            var4_int = var4_int - param1;
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                  var4_int--;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var4);

            stackIn_24_1 = new StringBuilder().append("ag.L(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L6;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L6;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_17_0 != 0;
          } else {
            return stackIn_21_0 != 0;
          }
        }
    }

    void a(int param0, int param1, int param2, byte param3) {
        int var5;
        oc var6;
        int var7;
        var7 = BrickABrac.field_J ? 1 : 0;
        if (param3 == -11) {
          L0: {
            if (param2 != 0) {
              break L0;
            } else {
              if (null != this.field_l) {
                this.field_l.a(true, param3 + -20607, param1, (oc) (this), param0);
                break L0;
              } else {
                break L0;
              }
            }
          }
          L1: {
            if (this.field_H != null) {
              var5 = -1 + this.field_H.length;
              L2: while (true) {
                if ((var5 ^ -1) > -1) {
                  break L1;
                } else {
                  var6 = this.field_H[var5];
                  if (var6 != null) {
                    var6.a(param0 - -this.field_w, this.field_o + param1, param2, (byte) -11);
                    var5--;
                    continue L2;
                  } else {
                    var5--;
                    continue L2;
                  }
                }
              }
            } else {
              break L1;
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void c(boolean param0) {
        field_M = null;
        field_I = null;
        field_L = null;
        field_D = null;
        field_J = null;
        field_K = null;
        field_C = null;
        field_F = null;
        if (param0) {
            ag.c(true);
        }
        field_G = null;
    }

    private final boolean a(int param0, oc param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 1) {
              stackIn_4_0 = this.a(param0 ^ 125, 1, param1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("ag.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    final boolean a(oc param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        oc[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        oc var10 = null;
        int var11 = 0;
        oc[] var12 = null;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (this.field_H == null) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var12 = this.field_H;
              var8 = var12;
              var9 = param6;
              L1: while (true) {
                if (var12.length <= var9) {
                  stackIn_14_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L2: {
                    var10 = var12[var9];
                    if (var10 == null) {
                      break L2;
                    } else {
                      if (var10.a(param0, param1, param2 + this.field_o, this.field_w + param3, param4, param5, 0)) {
                        stackIn_11_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var9++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var8_ref);

            stackIn_17_1 = new StringBuilder().append("ag.MA(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            return stackIn_14_0 != 0;
          }
        }
    }

    final boolean a(int param0, byte param1, oc param2, char param3) {
        oc[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        int var6 = 0;
        oc var7 = null;
        int var8 = 0;
        oc var9 = null;
        oc[] var10 = null;
        int stackIn_4_0 = 0;
        int stackIn_14_0 = 0;
        boolean stackIn_20_0 = false;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (null == this.field_H) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var10 = this.field_H;
                var5 = var10;
                if (param1 == 110) {
                  break L1;
                } else {
                  var9 = (oc) null;
                  this.a(26, 34, 108, (oc) null, -13, -79);
                  break L1;
                }
              }
              var6 = 0;
              L2: while (true) {
                if (var6 >= var10.length) {
                  var5_int = param0;
                  if (-81 != (var5_int ^ -1)) {
                    stackIn_22_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    L3: {
                      if (pe.field_l[81]) {
                        stackIn_20_0 = this.a(1, param2);
                        break L3;
                      } else {
                        stackIn_20_0 = this.b(true, param2);
                        break L3;
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  L4: {
                    var7 = var10[var6];
                    if (var7 == null) {
                      break L4;
                    } else {
                      if (!var7.f(-58)) {
                        break L4;
                      } else {
                        if (var7.a(param0, (byte) 110, param2, param3)) {
                          stackIn_14_0 = 1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L4;
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
            stackIn_25_0 = (RuntimeException) (var5_ref);

            stackIn_25_1 = new StringBuilder().append("ag.T(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L5;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L5;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_20_0;
            } else {
              return stackIn_22_0 != 0;
            }
          }
        }
    }

    private final boolean b(boolean param0, oc param1) {
        RuntimeException var3 = null;
        oc var4 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                var4 = (oc) null;
                this.a(91, (byte) 97, (oc) null, '<');
                break L1;
              }
            }
            stackIn_3_0 = this.a(1, param1, (byte) 116);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ag.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, int param1, int param2, oc param3, int param4, int param5) {
        oc[] var7 = null;
        int var8 = 0;
        oc var9 = null;
        int var10 = 0;
        oc var11 = null;
        oc[] var12 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var10 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4 == 19223) {
                break L1;
              } else {
                var11 = (oc) null;
                this.a(78, (byte) -22, (oc) null, '￻');
                break L1;
              }
            }
            if (null == this.field_H) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var12 = this.field_H;
              var7 = var12;
              var8 = 0;
              L2: while (true) {
                if (var12.length <= var8) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    var9 = var12[var8];
                    if (var9 != null) {
                      var9.a(param0, param1, param2 + this.field_w, param3, param4 ^ 0, param5 + this.field_o);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var8++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var7_ref);

            stackIn_15_1 = new StringBuilder().append("ag.GA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(byte param0, int param1, Hashtable param2, StringBuilder param3) {
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        int var6 = 0;
        oc var7 = null;
        int var8 = 0;
        int var9 = 0;
        oc[] var10 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var9 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (null != this.field_H) {
              L1: {
                var10 = this.field_H;
                var6 = 0;
                if (param0 > 72) {
                  break L1;
                } else {
                  ag.c(true);
                  break L1;
                }
              }
              L2: while (true) {
                if (var6 >= var10.length) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var7 = var10[var6];
                  discarded$4 = param3.append('\n');
                  var8 = 0;
                  L3: while (true) {
                    if (param1 < var8) {
                      L4: {
                        if (var7 == null) {
                          discarded$5 = param3.append("null");
                          break L4;
                        } else {
                          var7.a(param1 - -1, param2, 24, param3);
                          break L4;
                        }
                      }
                      var6++;
                      continue L2;
                    } else {
                      discarded$6 = param3.append(' ');
                      var8++;
                      continue L3;
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("ag.C(").append(param0).append(',').append(param1).append(',');

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
          throw qb.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean f(int param0) {
        if (param0 > -49) {
            this.field_H = (oc[]) null;
        }
        return null != this.a((byte) -78) ? true : false;
    }

    ag(int param0, int param1, int param2, int param3, ub param4) {
        super(param0, param1, param2, param3, param4, (uh) null);
    }

    final void b(boolean param0) {
        oc discarded$1 = null;
        oc[] var2;
        int var3;
        oc var4;
        int var5;
        L0: {
          var5 = BrickABrac.field_J ? 1 : 0;
          var2 = this.field_H;
          var3 = 0;
          if (!param0) {
            break L0;
          } else {
            discarded$1 = this.a((byte) 108);
            break L0;
          }
        }
        L1: while (true) {
          if (var2.length <= var3) {
            return;
          } else {
            var4 = var2[var3];
            if (var4 != null) {
              var4.b(false);
              var3++;
              continue L1;
            } else {
              var3++;
              continue L1;
            }
          }
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, oc param5, int param6) {
        oc[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        oc var10 = null;
        int var11 = 0;
        oc[] var12 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (null == this.field_H) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param3 < -125) {
                var12 = this.field_H;
                var8 = var12;
                var9 = 0;
                L1: while (true) {
                  if (var12.length <= var9) {
                    stackIn_18_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    L2: {
                      var10 = var12[var9];
                      if (var10 == null) {
                        break L2;
                      } else {
                        if (!var10.f(-109)) {
                          break L2;
                        } else {
                          if (var10.a(param0, param1, param2, -126, param4, param5, param6)) {
                            stackIn_15_0 = 1;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                    var9++;
                    continue L1;
                  }
                }
              } else {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8_ref = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var8_ref);

            stackIn_21_1 = new StringBuilder().append("ag.SA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L3;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0 != 0;
            } else {
              return stackIn_18_0 != 0;
            }
          }
        }
    }

    abstract void a(int param0);

    private final oc a(byte param0) {
        oc[] var2;
        int var3;
        oc var4;
        int var5;
        oc[] var6;
        var5 = BrickABrac.field_J ? 1 : 0;
        if (null != this.field_H) {
          if (param0 == -78) {
            var6 = this.field_H;
            var2 = var6;
            var3 = 0;
            L0: while (true) {
              if (var3 < var6.length) {
                var4 = var6[var3];
                if (var4 != null) {
                  if (var4.f(-88)) {
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
            return (oc) null;
          }
        } else {
          return null;
        }
    }

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.a(param3 ^ -251);
    }

    private final boolean a(int param0, oc param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        oc var5 = null;
        oc var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (null != this.field_H) {
              L1: {
                if (param2 == 116) {
                  break L1;
                } else {
                  field_F = (ta) null;
                  break L1;
                }
              }
              var4_int = 0;
              L2: while (true) {
                if (this.field_H.length <= var4_int) {
                  stackIn_19_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    var5 = this.field_H[var4_int];
                    if (null == var5) {
                      break L3;
                    } else {
                      if (!var5.f(-57)) {
                        break L3;
                      } else {
                        var4_int = var4_int + param0;
                        L4: while (true) {
                          if (this.field_H.length <= var4_int) {
                            break L3;
                          } else {
                            L5: {
                              var6 = this.field_H[var4_int];
                              if (null == var6) {
                                break L5;
                              } else {
                                if (!var6.a(true, param1)) {
                                  break L5;
                                } else {
                                  stackIn_15_0 = 1;
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                }
                              }
                            }
                            var4_int = var4_int + param0;
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
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var4);

            stackIn_22_1 = new StringBuilder().append("ag.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0 != 0;
          } else {
            return stackIn_19_0 != 0;
          }
        }
    }

    final static void a(byte param0, String param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        on.field_A.field_Mb = param1;
        sc.field_c = true;
        int var2_int = kc.field_q.field_g;
        if (param0 != -83) {
            return;
        }
        try {
            var3 = kc.field_q.field_f;
            var4 = on.field_A.field_O.b(param1, 272, on.field_A.field_R);
            var5 = -(var4 / 2) + var3 / 2 + -103;
            qp.field_f.a(-(2 * var5) + (-120 + var3), var5, (var2_int + -320) / 2, 320, (byte) 64);
            qp.field_f.field_Jb = na.a(false, 8421504, 3, 11579568, qp.field_f.field_cb, 2105376);
            on.field_A.a(-24 + (qp.field_f.field_cb + -20), 16, 24, -24 + (-24 + qp.field_f.field_Ib), (byte) 64);
            nh.field_a.a(24, -24 + (-20 + qp.field_f.field_cb), 120, 80, (byte) 64);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "ag.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    void a(oc param0, byte param1, int param2, int param3) {
        oc[] var5 = null;
        int var6 = 0;
        oc var7 = null;
        int var8 = 0;
        oc[] var9 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            super.a(param0, param1, param2, param3);
            if (this.field_H != null) {
              var9 = this.field_H;
              var5 = var9;
              var6 = 0;
              L1: while (true) {
                if (var6 >= var9.length) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    var7 = var9[var6];
                    if (var7 != null) {
                      var7.a(param0, (byte) 0, this.field_o + param2, param3 - -this.field_w);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var6++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5_ref);

            stackIn_12_1 = new StringBuilder().append("ag.WA(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final String d(int param0) {
        oc[] var2;
        int var3;
        oc var4;
        int var6;
        String var5;
        var6 = BrickABrac.field_J ? 1 : 0;
        if (this.field_H != null) {
          var2 = this.field_H;
          var3 = 0;
          L0: while (true) {
            if (var3 >= var2.length) {
              if (param0 < 6) {
                field_D = (String[]) null;
                return null;
              } else {
                return null;
              }
            } else {
              var4 = var2[var3];
              if (var4 != null) {
                var5 = var4.d(21);
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
            }
          }
        } else {
          return null;
        }
    }

    final StringBuilder a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        boolean discarded$1 = false;
        RuntimeException var5 = null;
        oc var6 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.a(param3, param2 ^ 1595638000, param0, param1)) {
                this.a(param1, param0, param2 ^ 24, param3);
                this.a((byte) 119, param0, param1, param3);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param2 == 24) {
                break L2;
              } else {
                var6 = (oc) null;
                discarded$1 = this.a(26, -76, (oc) null);
                break L2;
              }
            }
            stackIn_6_0 = (StringBuilder) (param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("ag.UA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    final boolean a(boolean param0, oc param1) {
        oc[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        oc var5 = null;
        int var6 = 0;
        oc var7 = null;
        oc[] var8 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var8 = this.field_H;
              var3 = var8;
              if (param0) {
                break L1;
              } else {
                var7 = (oc) null;
                this.a(18, 61, 105, -29, 39, (oc) null, -74);
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var4 >= var8.length) {
                stackIn_11_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L3: {
                  var5 = var8[var4];
                  if (var5 == null) {
                    break L3;
                  } else {
                    if (!var5.a(true, param1)) {
                      break L3;
                    } else {
                      stackIn_8_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3_ref);

            stackIn_14_1 = new StringBuilder().append("ag.CA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    final int e(byte param0) {
        int var2;
        oc[] var3;
        int var4;
        int var5;
        oc var6;
        int var8;
        int var7;
        var8 = BrickABrac.field_J ? 1 : 0;
        var2 = 0;
        var4 = -128 % ((-17 - param0) / 43);
        var3 = this.field_H;
        var5 = 0;
        L0: while (true) {
          if (var3.length <= var5) {
            return var2;
          } else {
            var6 = var3[var5];
            if (var6 != null) {
              var7 = var6.e((byte) 117);
              if (var7 > var2) {
                var2 = var7;
                var5++;
                continue L0;
              } else {
                var5++;
                continue L0;
              }
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    final static void a(byte param0, boolean param1, boolean param2) {
        if (param0 != -16) {
            String var4 = (String) null;
            ag.a((byte) 10, (String) null);
        }
        String var5 = (String) null;
        bf.a(param2, param1, -15947, (String) null);
    }

    static {
        int var0 = 0;
        int var1 = 0;
        field_M = new int[256];
        field_I = "Spectate";
        for (var0 = 0; var0 < 256; var0++) {
            var1 = var0;
            field_M[var0] = ud.d(ud.d(var1 << -1036165168, var1 << 442626152), 0 * var1);
        }
        field_J = "Find opponents";
        field_L = new int[]{7, 40, 41};
        field_C = "Oh no!";
    }
}
