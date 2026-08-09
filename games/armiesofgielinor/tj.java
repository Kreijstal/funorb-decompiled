/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

class tj extends kb implements gw {
    static na field_C;
    at field_D;

    final int g(int param0) {
        int var5 = 0;
        int var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var2 = 0;
        bb var3 = new bb(this.field_D);
        if (param0 != -31989) {
            this.a(false);
        }
        kb var4 = (kb) ((Object) var3.c(param0 ^ -31943));
        while (var4 != null) {
            var5 = var4.g(-31989);
            if (!(var5 <= var2)) {
                var2 = var5;
            }
            var4 = (kb) ((Object) var3.b(50));
        }
        return var2;
    }

    final boolean b(byte param0, kb param1) {
        RuntimeException var3 = null;
        kb var4 = null;
        bb var5 = null;
        kb var6 = null;
        int var7 = 0;
        bb var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (!this.field_D.a(false)) {
              L1: {
                var8 = new bb(this.field_D);
                if (param0 < -121) {
                  break L1;
                } else {
                  tj.d((byte) 127);
                  break L1;
                }
              }
              var4 = (kb) ((Object) var8.c(50));
              L2: while (true) {
                if (var4 == null) {
                  stackIn_18_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    if (var4.a(false)) {
                      var5 = new bb(this.field_D);
                      var5.a(var4, true);
                      var6 = (kb) ((Object) var5.b(50));
                      L4: while (true) {
                        if (var6 == null) {
                          break L3;
                        } else {
                          if (!var6.a(11, param1)) {
                            var6 = (kb) ((Object) var5.b(50));
                            continue L4;
                          } else {
                            stackIn_14_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  var4 = (kb) ((Object) var8.b(50));
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
          L5: {
            var3 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var3);

            stackIn_21_1 = new StringBuilder().append("tj.BC(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0 != 0;
          } else {
            return stackIn_18_0 != 0;
          }
        }
    }

    void f(int param0) {
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        bb var2 = new bb(this.field_D);
        if (param0 != 1) {
            field_C = (na) null;
        }
        kb var3 = (kb) ((Object) var2.c(50));
        while (var3 != null) {
            var3.f(param0 + 0);
            var3 = (kb) ((Object) var2.b(50));
        }
    }

    kb e(byte param0) {
        bb var2;
        kb var3;
        int var4;
        L0: {
          var4 = ArmiesOfGielinor.field_M ? 1 : 0;
          var2 = new bb(this.field_D);
          if (param0 >= 24) {
            break L0;
          } else {
            this.field_D = (at) null;
            break L0;
          }
        }
        var3 = (kb) ((Object) var2.c(50));
        L1: while (true) {
          if (var3 != null) {
            if (var3.a(false)) {
              return var3;
            } else {
              var3 = (kb) ((Object) var2.b(50));
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    boolean a(int param0, kb param1) {
        bb var3 = null;
        RuntimeException var3_ref = null;
        kb var4 = null;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var3 = new bb(this.field_D);
            if (param0 == 11) {
              var4 = (kb) ((Object) var3.c(param0 + 39));
              L1: while (true) {
                if (var4 == null) {
                  stackIn_11_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (!var4.a(param0 ^ 0, param1)) {
                    var4 = (kb) ((Object) var3.b(param0 + 39));
                    continue L1;
                  } else {
                    stackIn_8_0 = 1;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            } else {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3_ref);

            stackIn_14_1 = new StringBuilder().append("tj.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            return stackIn_11_0 != 0;
          }
        }
    }

    final boolean a(boolean param0, kb param1) {
        RuntimeException var3 = null;
        kb var4 = null;
        bb var5 = null;
        kb var6 = null;
        int var7 = 0;
        kb var8 = null;
        bb var9 = null;
        int stackIn_5_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                var8 = (kb) null;
                this.a((kb) null, 21, '￘', -49);
                break L1;
              }
            }
            if (!this.field_D.a(param0)) {
              var9 = new bb(this.field_D);
              var4 = (kb) ((Object) var9.a(50));
              L2: while (true) {
                if (var4 == null) {
                  stackIn_18_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    if (!var4.a(false)) {
                      break L3;
                    } else {
                      var5 = new bb(this.field_D);
                      var5.a(false, var4);
                      var6 = (kb) ((Object) var5.b((byte) -112));
                      L4: while (true) {
                        if (var6 == null) {
                          break L3;
                        } else {
                          if (var6.a(11, param1)) {
                            stackIn_14_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            var6 = (kb) ((Object) var5.b((byte) -112));
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                  var4 = (kb) ((Object) var9.b((byte) -112));
                  continue L2;
                }
              }
            } else {
              stackIn_5_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var3);

            stackIn_21_1 = new StringBuilder().append("tj.WB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0 != 0;
          } else {
            return stackIn_18_0 != 0;
          }
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, kb param6) {
        bb var8 = null;
        RuntimeException var8_ref = null;
        kb var9 = null;
        int var10 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var8 = new bb(this.field_D);
            var9 = (kb) ((Object) var8.c(50));
            L1: while (true) {
              L2: {
                if (var9 == null) {
                  break L2;
                } else {
                  if (!var9.c(65280)) {
                    break L2;
                  } else {
                    L3: {
                      if (!var9.a(false)) {
                        break L3;
                      } else {
                        if (!var9.a(param0, param1, param2, param3, param4, 94, param6)) {
                          break L3;
                        } else {
                          stackIn_7_0 = 1;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      }
                    }
                    var9 = (kb) ((Object) var8.b(50));
                    continue L1;
                  }
                }
              }
              if (param5 > 93) {
                stackIn_12_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                this.g(116);
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var8_ref);

            stackIn_15_1 = new StringBuilder().append("tj.RA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    final void a(byte param0, kb param1) {
        try {
            this.field_D.a((byte) -119, (tc) (param1));
            if (param0 != 10) {
                this.f(-101);
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "tj.CC(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    String h(int param0) {
        String var4 = null;
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        bb var2 = new bb(this.field_D);
        kb var3 = (kb) ((Object) var2.c(param0 ^ 21434));
        while (var3 != null) {
            var4 = var3.h(21384);
            if (!(var4 == null)) {
                return var4;
            }
            var3 = (kb) ((Object) var2.b(50));
        }
        if (param0 == 21384) {
            return null;
        }
        this.field_D = (at) null;
        return null;
    }

    boolean a(int param0, int param1, int param2, int param3, kb param4, int param5, int param6) {
        bb var8 = null;
        RuntimeException var8_ref = null;
        kb var9 = null;
        int var10 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 > 103) {
                break L1;
              } else {
                field_C = (na) null;
                break L1;
              }
            }
            var8 = new bb(this.field_D);
            var9 = (kb) ((Object) var8.c(50));
            L2: while (true) {
              L3: {
                if (var9 == null) {
                  break L3;
                } else {
                  if (!var9.c(65280)) {
                    break L3;
                  } else {
                    if (var9.a(param0, this.field_B + param1, this.field_p + param2, 107, param4, param5, param6)) {
                      stackIn_9_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var9 = (kb) ((Object) var8.b(50));
                      continue L2;
                    }
                  }
                }
              }
              stackIn_12_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var8_ref);

            stackIn_15_1 = new StringBuilder().append("tj.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    boolean a(boolean param0) {
        if (param0) {
            this.field_D = (at) null;
        }
        return null != this.e((byte) 94) ? true : false;
    }

    final StringBuilder a(int param0, StringBuilder param1, int param2, Hashtable param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 == 26477) {
              L1: {
                if (!this.a(param3, param0, (byte) 96, param1)) {
                  break L1;
                } else {
                  this.a(param0, param3, true, param1);
                  this.a(param3, 81, param1, param0);
                  break L1;
                }
              }
              stackIn_6_0 = (StringBuilder) (param1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (StringBuilder) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("tj.OA(").append(param0).append(',');

            if (param1 == null) {
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
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_6_0;
        }
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3 ^ 0, param4);
        if (param3 != 8192) {
            field_C = (na) null;
        }
        this.i(0);
    }

    private final void a(Hashtable param0, int param1, StringBuilder param2, int param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        bb var5 = null;
        kb var6 = null;
        int var7 = 0;
        int var8 = 0;
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
        RuntimeException var5_ref = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var5 = new bb(this.field_D);
            var6 = (kb) ((Object) var5.c(50));
            if (param1 == 81) {
              L1: while (true) {
                if (var6 == null) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  discarded$3 = param2.append('\n');
                  var7 = 0;
                  L2: while (true) {
                    if (param3 < var7) {
                      var6.a(1 + param3, param2, 26477, param0);
                      var6 = (kb) ((Object) var5.b(50));
                      continue L1;
                    } else {
                      discarded$4 = param2.append(' ');
                      var7++;
                      continue L2;
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
          L3: {
            var5_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5_ref);

            stackIn_11_1 = new StringBuilder().append("tj.UB(");

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
          throw ig.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, kb param1, int param2, byte param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        bb var7 = null;
        int var8 = 0;
        kb var9 = null;
        int var10 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var7 = new bb(this.field_D);
            var8 = -73 / ((-58 - param3) / 53);
            var9 = (kb) ((Object) var7.c(50));
            L1: while (true) {
              L2: {
                if (var9 == null) {
                  break L2;
                } else {
                  if (!var9.c(65280)) {
                    break L2;
                  } else {
                    var9.a(this.field_p + param0, param1, param2, (byte) -112, param4, param5 - -this.field_B);
                    var9 = (kb) ((Object) var7.b(50));
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
            runtimeException = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (runtimeException);

            stackIn_8_1 = new StringBuilder().append("tj.JA(").append(param0).append(',');

            if (param1 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    boolean a(kb param0, int param1, char param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        kb var8 = null;
        bb var9 = null;
        int stackIn_7_0 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var9 = new bb(this.field_D);
            var8 = (kb) ((Object) var9.c(50));
            L1: while (true) {
              L2: {
                if (var8 == null) {
                  break L2;
                } else {
                  if (!var8.c(65280)) {
                    break L2;
                  } else {
                    L3: {
                      if (!var8.a(false)) {
                        break L3;
                      } else {
                        if (!var8.a(param0, param1, param2, -12215)) {
                          break L3;
                        } else {
                          stackIn_7_0 = 1;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      }
                    }
                    var8 = (kb) ((Object) var9.b(50));
                    continue L1;
                  }
                }
              }
              var6 = param1;
              if ((var6 ^ -1) != -81) {
                if (param3 == -12215) {
                  stackIn_17_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  this.field_D = (at) null;
                  return false;
                }
              } else {
                L4: {
                  if (!br.field_f[81]) {
                    stackIn_13_0 = this.b((byte) -123, param0);
                    break L4;
                  } else {
                    stackIn_13_0 = this.a(false, param0);
                    break L4;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var5);

            stackIn_20_1 = new StringBuilder().append("tj.F(");

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
          throw ig.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0;
          } else {
            return stackIn_17_0 != 0;
          }
        }
    }

    void a(int param0, int param1, int param2, kb param3) {
        RuntimeException runtimeException = null;
        bb var5 = null;
        kb var6 = null;
        int var7 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            super.a(param0, param1, param2, param3);
            var5 = new bb(this.field_D);
            var6 = (kb) ((Object) var5.c(50));
            L1: while (true) {
              L2: {
                if (var6 == null) {
                  break L2;
                } else {
                  if (!var6.c(param0 + 32558)) {
                    break L2;
                  } else {
                    var6.a(32722, this.field_B + param1, param2 - -this.field_p, param3);
                    var6 = (kb) ((Object) var5.b(50));
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
            runtimeException = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (runtimeException);

            stackIn_8_1 = new StringBuilder().append("tj.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

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
          throw ig.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    private final void i(int param0) {
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        bb var2 = new bb(this.field_D);
        kb var3 = (kb) ((Object) var2.c(50));
        if (param0 != 0) {
            return;
        }
        while (var3 != null) {
            var3.e(0);
            var3 = (kb) ((Object) var2.b(50));
        }
    }

    tj(int param0, int param1, int param2, int param3, kh param4) {
        super(param0, param1, param2, param3, param4, (qo) null);
        this.field_D = new at();
    }

    public static void d(byte param0) {
        if (param0 != -89) {
            tj.j(114);
        }
        field_C = null;
    }

    void a(int param0, int param1, byte param2, int param3) {
        int var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (0 == param3) {
            if (!(null == this.field_k)) {
                this.field_k.a((kb) (this), param0, -94, true, param1);
            }
        }
        bb var5 = new bb(this.field_D);
        kb var6 = (kb) ((Object) var5.a(50));
        while (var6 != null) {
            var6.a(param0 + this.field_B, this.field_p + param1, (byte) -101, param3);
            var6 = (kb) ((Object) var5.b((byte) -112));
        }
        if (param2 >= -82) {
            this.i(108);
        }
    }

    final static void j(int param0) {
        try {
            IOException iOException = null;
            int var1_int = 0;
            int var2 = 0;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException var1 = null;
            IOException var3 = null;
            var4 = ArmiesOfGielinor.field_M ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (ai.field_T != null) {
                    ai.field_T.c(-5758);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (ou.field_h != null) {
                    ou.field_h.a((byte) -117);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (null == rg.field_b) {
                    break L3;
                  } else {
                    try {
                      L4: {
                        rg.field_b.c((byte) 81);
                        break L4;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        iOException = (IOException) (Object) decompiledCaughtException;
                        break L5;
                      }
                    }
                    break L3;
                  }
                }
                L6: {
                  var1_int = -99 % ((param0 - -48) / 58);
                  if (null == mu.field_b) {
                    break L6;
                  } else {
                    var2 = 0;
                    L7: while (true) {
                      if (var2 >= mu.field_b.length) {
                        break L6;
                      } else {
                        if (null != mu.field_b[var2]) {
                          try {
                            L8: {
                              mu.field_b[var2].c((byte) 81);
                              break L8;
                            }
                          } catch (java.io.IOException decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            L9: {
                              var3 = (IOException) (Object) decompiledCaughtException;
                              break L9;
                            }
                          }
                          var2++;
                          continue L7;
                        } else {
                          var2++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (RuntimeException) (Object) decompiledCaughtException;
              throw ig.a((Throwable) ((Object) var1), "tj.AC(" + param0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
    }
}
