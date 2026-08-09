/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ie extends ng implements j {
    static jl field_G;
    static String field_F;
    ng field_H;

    public static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        field_F = null;
        field_G = null;
    }

    private final boolean a(byte param0, ng param1) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 <= -95) {
                break L1;
              } else {
                this.j(110);
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.field_H == null) {
                  break L3;
                } else {
                  if (this.field_H.b(true)) {
                    break L3;
                  } else {
                    if (!this.field_H.a(param1, 27)) {
                      break L3;
                    } else {
                      stackIn_7_0 = 1;
                      break L2;
                    }
                  }
                }
              }
              stackIn_7_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("ie.V(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    ng l(int param0) {
        if (param0 <= 48) {
            field_G = (jl) null;
        }
        ng var2 = this.field_H;
        if (var2 == null) {
            return null;
        }
        if (!(!var2.b(true))) {
            return var2;
        }
        return null;
    }

    boolean a(byte param0, ng param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -58) {
                break L1;
              } else {
                this.field_H = (ng) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == this.field_H) {
                  break L3;
                } else {
                  if (!this.field_H.a((byte) -58, param1, param2, param3 + this.field_p, param4, param5 - -this.field_z, param6)) {
                    break L3;
                  } else {
                    stackIn_6_0 = 1;
                    break L2;
                  }
                }
              }
              stackIn_6_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var8);

            stackIn_9_1 = new StringBuilder().append("ie.N(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_6_0 != 0;
    }

    void j(int param0) {
        if (!(this.field_H == null)) {
            this.field_H.c((byte) 99);
        }
        if (param0 != 0) {
            this.field_H = (ng) null;
        }
    }

    final boolean b(boolean param0) {
        if (!param0) {
            this.h(43);
        }
        return this.l(118) != null ? true : false;
    }

    final boolean a(int param0, byte param1, int param2, int param3, int param4, int param5, ng param6) {
        boolean discarded$1 = false;
        RuntimeException var8 = null;
        ng var9 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 > 61) {
                break L1;
              } else {
                var9 = (ng) null;
                discarded$1 = this.a((byte) -50, (ng) null);
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == this.field_H) {
                  break L3;
                } else {
                  if (!this.field_H.b(true)) {
                    break L3;
                  } else {
                    if (!this.field_H.a(param0, (byte) 68, param2, param3, param4, param5, param6)) {
                      break L3;
                    } else {
                      stackIn_7_0 = 1;
                      break L2;
                    }
                  }
                }
              }
              stackIn_7_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var8);

            stackIn_10_1 = new StringBuilder().append("ie.FA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        int incrementValue$0 = 0;
        int stackIn_24_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (param4 < param6) {
              if (param0 > param4 + 1) {
                L1: {
                  if (param5 >= 8) {
                    break L1;
                  } else {
                    ie.a(-1, -100, false, 25, 54, 90, -71);
                    break L1;
                  }
                }
                L2: {
                  if (param0 <= param4 + 5) {
                    break L2;
                  } else {
                    if (param1 != param3) {
                      var7_int = (param1 >> -2021044287) - (-(param3 >> 645197793) + -(1 & (param3 & param1)));
                      var8 = param4;
                      var9 = param3;
                      var10 = param1;
                      var11 = param4;
                      L3: while (true) {
                        if (var11 >= param0) {
                          ie.a(var8, var9, param2, param3, param4, 87, param6);
                          ie.a(param0, param1, param2, var10, var8, 54, param6);
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          L4: {
                            var12 = gn.field_A[var11];
                            if (!param2) {
                              stackIn_24_0 = nb.field_c[var12];
                              break L4;
                            } else {
                              stackIn_24_0 = ep.field_c[var12];
                              break L4;
                            }
                          }
                          L5: {
                            var13 = stackIn_24_0;
                            if (var7_int >= var13) {
                              if (var10 < var13) {
                                var10 = var13;
                                break L5;
                              } else {
                                break L5;
                              }
                            } else {
                              gn.field_A[var11] = gn.field_A[var8];
                              incrementValue$0 = var8;
                              var8++;
                              gn.field_A[incrementValue$0] = var12;
                              if (var9 > var13) {
                                var9 = var13;
                                break L5;
                              } else {
                                var11++;
                                continue L3;
                              }
                            }
                          }
                          var11++;
                          continue L3;
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                }
                var7_int = -1 + param0;
                L6: while (true) {
                  if (var7_int <= param4) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var8 = param4;
                    L7: while (true) {
                      if (var7_int <= var8) {
                        var7_int--;
                        continue L6;
                      } else {
                        L8: {
                          var9 = gn.field_A[var8];
                          var10 = gn.field_A[1 + var8];
                          if (!tj.a(false, param2, var9, var10)) {
                            break L8;
                          } else {
                            gn.field_A[var8] = var10;
                            gn.field_A[var8 - -1] = var9;
                            break L8;
                          }
                        }
                        var8++;
                        continue L7;
                      }
                    }
                  }
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var7), "ie.BA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    ie(int param0, int param1, int param2, int param3, eb param4, fn param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final void h(int param0) {
        if (!(null == this.field_H)) {
            this.field_H.h(param0 ^ 0);
        }
        if (param0 != 2) {
            ng var3 = (ng) null;
            this.a(86, -99, (ng) null, 'ﾻ');
        }
    }

    final static void k(int param0) {
        te.a(4, -2671);
        if (param0 != 8149) {
            field_F = (String) null;
        }
    }

    private final boolean a(int param0, ng param1) {
        RuntimeException var3 = null;
        ng var4 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 11627) {
                break L1;
              } else {
                var4 = (ng) null;
                this.a(-52, -66, (ng) null, -50, -35, 36);
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.field_H == null) {
                  break L3;
                } else {
                  if (this.field_H.b(true)) {
                    break L3;
                  } else {
                    if (!this.field_H.a(param1, param0 + -11600)) {
                      break L3;
                    } else {
                      stackIn_7_0 = 1;
                      break L2;
                    }
                  }
                }
              }
              stackIn_7_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("ie.T(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    String b(byte param0) {
        String var3 = null;
        String var2 = super.b((byte) 115);
        if (param0 <= 16) {
            field_F = (String) null;
        }
        if (this.field_H != null) {
            var3 = this.field_H.b((byte) 84);
            if (!(var3 == null)) {
                return var3;
            }
        }
        return var2;
    }

    final boolean a(ng param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 27) {
              L1: {
                L2: {
                  if (null == this.field_H) {
                    break L2;
                  } else {
                    if (!this.field_H.a(param0, param1 ^ 0)) {
                      break L2;
                    } else {
                      stackIn_7_0 = 1;
                      break L1;
                    }
                  }
                }
                stackIn_7_0 = 0;
                break L1;
              }
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
          L3: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("ie.HA(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        if (param1 < 19) {
            return;
        }
        super.a(param0, (byte) 113, param2, param3, param4);
        this.j(0);
    }

    final int e(int param0) {
        if (param0 < 31) {
            return -41;
        }
        return this.field_H != null ? this.field_H.e(122) : 0;
    }

    final static void a(boolean param0, int param1, int param2) {
        int var4;
        int var3;
        L0: {
          L1: {
            var4 = Pixelate.field_H ? 1 : 0;
            if (-1 != param2) {
              if ((param2 ^ -1) == 1) {
                te.b(true, -116);
                break L1;
              } else {
                wo.b(107, param2).c(0);
                if (!pm.field_u) {
                  wo.b(-73, param2).a(11);
                  break L1;
                } else {
                  var3 = 81 % ((-12 - param1) / 42);
                  break L0;
                }
              }
            } else {
              if (ro.field_e == null) {
                if (null == qo.field_r) {
                  break L1;
                } else {
                  qo.field_r.a(param0, 0);
                  break L1;
                }
              } else {
                ro.field_e.a(param0, 0);
                break L1;
              }
            }
          }
          var3 = 81 % ((-12 - param1) / 42);
          break L0;
        }
    }

    void a(int param0, int param1, int param2, byte param3) {
        if (param1 == 0 && this.field_y != null) {
            this.field_y.a((ng) (this), (byte) -124, param0, param2, true);
        }
        if (this.field_H != null) {
            this.field_H.a(param0 - -this.field_p, param1, param2 - -this.field_z, (byte) -36);
        }
        int var5 = -46 % ((param3 - 70) / 49);
    }

    StringBuilder a(StringBuilder param0, boolean param1, int param2, Hashtable param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                ie.k(-23);
                break L1;
              }
            }
            L2: {
              if (!this.a(-114, param2, param0, param3)) {
                break L2;
              } else {
                this.a(param2, (byte) -2, param3, param0);
                this.a(param3, (byte) -80, param0, param2);
                break L2;
              }
            }
            stackIn_5_0 = (StringBuilder) (param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("ie.AA(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ')');
        }
        return stackIn_5_0;
    }

    void a(int param0, int param1, int param2, ng param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              if (param0 == 40) {
                break L1;
              } else {
                this.field_H = (ng) null;
                break L1;
              }
            }
            L2: {
              super.a(param0 ^ 0, param1, param2, param3);
              if (this.field_H != null) {
                this.field_H.a(40, this.field_p + param1, param2 - -this.field_z, param3);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("ie.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    void a(int param0, int param1, ng param2, int param3, int param4, int param5) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          L0: {
            if (param3 == 0) {
              L1: {
                if (this.field_H != null) {
                  this.field_H.a(param0, this.field_z + param1, param2, 0, param4 + this.field_p, param5);
                  break L1;
                } else {
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var7);

            stackIn_8_1 = new StringBuilder().append("ie.EA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(Hashtable param0, byte param1, StringBuilder param2, int param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            discarded$3 = param2.append('\n');
            var5_int = 0;
            if (param1 < -79) {
              L1: while (true) {
                if (var5_int > param3) {
                  L2: {
                    if (this.field_H == null) {
                      discarded$4 = param2.append("null");
                      break L2;
                    } else {
                      this.field_H.a(param2, false, param3 - -1, param0);
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  discarded$5 = param2.append(' ');
                  var5_int++;
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
            var5 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("ie.W(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(int param0, int param1, ng param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null == this.field_H) {
                break L1;
              } else {
                if (!this.field_H.b(true)) {
                  break L1;
                } else {
                  if (!this.field_H.a(param0, param1 + 0, param2, param3)) {
                    break L1;
                  } else {
                    stackIn_4_0 = 1;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
            }
            L2: {
              if (param1 == 3) {
                break L2;
              } else {
                this.field_H = (ng) null;
                break L2;
              }
            }
            var5_int = param0;
            if (var5_int == 80) {
              L3: {
                if (bc.field_m[81]) {
                  stackIn_12_0 = this.a((byte) -127, param2);
                  break L3;
                } else {
                  stackIn_12_0 = this.a(11627, param2);
                  break L3;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var5);

            stackIn_15_1 = new StringBuilder().append("ie.G(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw aa.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_12_0;
        }
    }

    static {
    }
}
