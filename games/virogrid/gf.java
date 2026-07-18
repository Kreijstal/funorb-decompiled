/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class gf extends fi implements ja {
    fi[] field_E;
    static String field_B;
    static String field_C;
    static lc field_z;
    static String field_D;
    static String field_A;
    static String field_y;
    static String field_x;

    private final boolean b(fi param0) {
        RuntimeException var3 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
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
            int discarded$4 = -29;
            int discarded$5 = 1;
            stackOut_0_0 = this.a(param0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("gf.F(");
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
          throw kg.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + -1 + ')');
        }
        return stackIn_1_0;
    }

    final boolean f(boolean param0) {
        if (!param0) {
            return true;
        }
        return this.a(16711935) != null ? true : false;
    }

    final static hm g() {
        return (hm) (Object) new mf();
    }

    abstract void c(byte param0);

    final boolean a(fi param0, char param1, int param2, int param3) {
        fi[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        fi var8 = null;
        int var9 = 0;
        fi[] var10 = null;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        boolean stackIn_17_0 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_16_0 = false;
        boolean stackOut_15_0 = false;
        int stackOut_9_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var9 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (null != ((gf) this).field_E) {
              var6 = 54 / ((param3 - -75) / 36);
              var10 = ((gf) this).field_E;
              var5 = var10;
              var7 = 0;
              L1: while (true) {
                if (var7 >= var10.length) {
                  var5_int = param2;
                  if (80 == var5_int) {
                    L2: {
                      if (dc.field_Y[81]) {
                        int discarded$5 = -1;
                        stackOut_16_0 = this.b(param0);
                        stackIn_17_0 = stackOut_16_0;
                        break L2;
                      } else {
                        int discarded$6 = 65793;
                        stackOut_15_0 = this.c(param0);
                        stackIn_17_0 = stackOut_15_0;
                        break L2;
                      }
                    }
                    break L0;
                  } else {
                    return false;
                  }
                } else {
                  L3: {
                    var8 = var10[var7];
                    if (var8 == null) {
                      break L3;
                    } else {
                      if (!var8.f(true)) {
                        break L3;
                      } else {
                        if (!var8.a(param0, param1, param2, 88)) {
                          break L3;
                        } else {
                          stackOut_9_0 = 1;
                          stackIn_10_0 = stackOut_9_0;
                          return stackIn_10_0 != 0;
                        }
                      }
                    }
                  }
                  var7++;
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
            var5_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var5_ref;
            stackOut_18_1 = new StringBuilder().append("gf.AA(");
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
          throw kg.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_17_0;
    }

    final static void a(String param0, int param1, boolean param2, String param3, int param4, String param5) {
        cj var6 = null;
        try {
            if (param2) {
                Object var7 = null;
                gf.a((String) null, -123, false, (String) null, -113, (String) null);
            }
            var6 = new cj(param4, param0, param1, param5, param3);
            ln.a(var6, 112);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "gf.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        fi var6 = null;
        int var7 = 0;
        L0: {
          var7 = Virogrid.field_F ? 1 : 0;
          if (param3 != 0) {
            break L0;
          } else {
            if (((gf) this).field_w == null) {
              break L0;
            } else {
              ((gf) this).field_w.a(param1, (fi) this, true, param2, -23294);
              break L0;
            }
          }
        }
        if (param0 == 37) {
          L1: {
            if (null == ((gf) this).field_E) {
              break L1;
            } else {
              var5 = ((gf) this).field_E.length + -1;
              L2: while (true) {
                if (var5 < 0) {
                  break L1;
                } else {
                  var6 = ((gf) this).field_E[var5];
                  if (var6 != null) {
                    var6.a((byte) 37, param1 - -((gf) this).field_l, ((gf) this).field_u + param2, param3);
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
          return;
        } else {
          return;
        }
    }

    final boolean a(fi param0, int param1) {
        fi[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        fi var5 = null;
        int var6 = 0;
        fi[] var7 = null;
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
        int stackOut_11_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var7 = ((gf) this).field_E;
              var3 = var7;
              if (param1 == -8515) {
                break L1;
              } else {
                ((gf) this).field_E = null;
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var7.length <= var4) {
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                L3: {
                  var5 = var7[var4];
                  if (var5 == null) {
                    break L3;
                  } else {
                    if (var5.a(param0, -8515)) {
                      stackOut_8_0 = 1;
                      stackIn_9_0 = stackOut_8_0;
                      return stackIn_9_0 != 0;
                    } else {
                      break L3;
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
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("gf.G(");
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
          throw kg.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ')');
        }
        return stackIn_12_0 != 0;
    }

    final boolean a(fi param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        fi[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        fi var10 = null;
        int var11 = 0;
        Object var12 = null;
        fi[] var13 = null;
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
        int stackOut_13_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var11 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (((gf) this).field_E != null) {
              L1: {
                if (!param2) {
                  break L1;
                } else {
                  var12 = null;
                  this.a(121, (Hashtable) null, 48, (StringBuilder) null);
                  break L1;
                }
              }
              var13 = ((gf) this).field_E;
              var8 = var13;
              var9 = 0;
              L2: while (true) {
                if (var13.length <= var9) {
                  stackOut_13_0 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                } else {
                  L3: {
                    var10 = var13[var9];
                    if (var10 == null) {
                      break L3;
                    } else {
                      if (!var10.a(param0, param1, false, ((gf) this).field_l + param3, param4, param5 - -((gf) this).field_u, param6)) {
                        break L3;
                      } else {
                        stackOut_10_0 = 1;
                        stackIn_11_0 = stackOut_10_0;
                        return stackIn_11_0 != 0;
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
            stackOut_15_0 = (RuntimeException) var8_ref;
            stackOut_15_1 = new StringBuilder().append("gf.NA(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
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
          throw kg.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_14_0 != 0;
    }

    final int b(byte param0) {
        int var2 = 0;
        fi[] var3 = null;
        int var4 = 0;
        fi var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = Virogrid.field_F ? 1 : 0;
        var2 = 0;
        if (param0 == -39) {
          var3 = ((gf) this).field_E;
          var4 = 0;
          L0: while (true) {
            if (var4 >= var3.length) {
              return var2;
            } else {
              var5 = var3[var4];
              if (var5 != null) {
                var6 = var5.b((byte) -39);
                if (var2 < var6) {
                  var2 = var6;
                  var4++;
                  continue L0;
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                var4++;
                continue L0;
              }
            }
          }
        } else {
          return 27;
        }
    }

    private final void a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        fi var7 = null;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        fi[] var11 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var9 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (((gf) this).field_E != null) {
              var11 = ((gf) this).field_E;
              var6 = 0;
              L1: while (true) {
                if (var11.length <= var6) {
                  L2: {
                    if (param2 > 5) {
                      break L2;
                    } else {
                      var10 = null;
                      StringBuilder discarded$11 = ((gf) this).a((Hashtable) null, (byte) 102, 71, (StringBuilder) null);
                      break L2;
                    }
                  }
                  break L0;
                } else {
                  var7 = var11[var6];
                  StringBuilder discarded$12 = param3.append('\n');
                  var8 = 0;
                  L3: while (true) {
                    if (var8 > param0) {
                      L4: {
                        if (var7 == null) {
                          StringBuilder discarded$13 = param3.append("null");
                          break L4;
                        } else {
                          StringBuilder discarded$14 = var7.a(param1, (byte) 126, param0 - -1, param3);
                          break L4;
                        }
                      }
                      var6++;
                      continue L1;
                    } else {
                      StringBuilder discarded$15 = param3.append(' ');
                      var8++;
                      continue L3;
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5;
            stackOut_15_1 = new StringBuilder().append("gf.R(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
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
          throw kg.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
    }

    final boolean a(int param0, fi param1, int param2, int param3, int param4, int param5, int param6) {
        fi[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        fi var10 = null;
        int var11 = 0;
        fi[] var12 = null;
        int stackIn_4_0 = 0;
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
        int stackOut_3_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var11 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (null == ((gf) this).field_E) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              var12 = ((gf) this).field_E;
              var8 = var12;
              var9 = param5;
              L1: while (true) {
                if (var12.length <= var9) {
                  stackOut_13_0 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                } else {
                  L2: {
                    var10 = var12[var9];
                    if (var10 == null) {
                      break L2;
                    } else {
                      if (!var10.f(true)) {
                        break L2;
                      } else {
                        if (!var10.a(param0, param1, param2, param3, param4, param5, param6)) {
                          break L2;
                        } else {
                          stackOut_10_0 = 1;
                          stackIn_11_0 = stackOut_10_0;
                          return stackIn_11_0 != 0;
                        }
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
            stackOut_15_0 = (RuntimeException) var8_ref;
            stackOut_15_1 = new StringBuilder().append("gf.TA(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_14_0 != 0;
    }

    gf(int param0, int param1, int param2, int param3, ol param4) {
        super(param0, param1, param2, param3, param4, (cd) null);
    }

    private final fi a(int param0) {
        fi[] var2 = null;
        int var3 = 0;
        fi var4 = null;
        int var5 = 0;
        fi[] var6 = null;
        var5 = Virogrid.field_F ? 1 : 0;
        if (((gf) this).field_E != null) {
          L0: {
            if (param0 == 16711935) {
              break L0;
            } else {
              field_B = null;
              break L0;
            }
          }
          var6 = ((gf) this).field_E;
          var2 = var6;
          var3 = 0;
          L1: while (true) {
            if (var6.length > var3) {
              var4 = var6[var3];
              if (var4 != null) {
                if (var4.f(true)) {
                  return var4;
                } else {
                  var3++;
                  continue L1;
                }
              } else {
                var3++;
                continue L1;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    private final boolean a(int param0, fi param1) {
        int var4_int = 0;
        RuntimeException var4 = null;
        fi var5 = null;
        fi var6 = null;
        int var7 = 0;
        int stackIn_4_0 = 0;
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
        int stackOut_3_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var7 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (null == ((gf) this).field_E) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              var4_int = 0;
              L1: while (true) {
                if (var4_int >= ((gf) this).field_E.length) {
                  stackOut_18_0 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  break L0;
                } else {
                  L2: {
                    var5 = ((gf) this).field_E[var4_int];
                    var6 = var5;
                    var6 = var5;
                    if (var5 == null) {
                      break L2;
                    } else {
                      if (var5.f(true)) {
                        var4_int = var4_int + 1;
                        L3: while (true) {
                          if (var4_int >= ((gf) this).field_E.length) {
                            break L2;
                          } else {
                            L4: {
                              var6 = ((gf) this).field_E[var4_int];
                              if (var6 == null) {
                                break L4;
                              } else {
                                if (!var6.a(param1, -8515)) {
                                  break L4;
                                } else {
                                  stackOut_14_0 = 1;
                                  stackIn_15_0 = stackOut_14_0;
                                  return stackIn_15_0 != 0;
                                }
                              }
                            }
                            var4_int = var4_int + 1;
                            continue L3;
                          }
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                  var4_int++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var4;
            stackOut_20_1 = new StringBuilder().append("gf.P(").append(1).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + 0 + ')');
        }
        return stackIn_19_0 != 0;
    }

    final void c(int param0) {
        fi[] var2 = null;
        int var3 = 0;
        fi var4 = null;
        int var5 = 0;
        Object var6 = null;
        fi[] var7 = null;
        var5 = Virogrid.field_F ? 1 : 0;
        var7 = ((gf) this).field_E;
        var2 = var7;
        var3 = 0;
        L0: while (true) {
          if (var3 >= var7.length) {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                var6 = null;
                boolean discarded$1 = ((gf) this).a((fi) null, -37);
                break L1;
              }
            }
            return;
          } else {
            var4 = var7[var3];
            if (var4 != null) {
              var4.c(-1);
              var3++;
              continue L0;
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    final String d(int param0) {
        fi[] var2 = null;
        int var3 = 0;
        fi var4 = null;
        String var5 = null;
        int var6 = 0;
        var6 = Virogrid.field_F ? 1 : 0;
        if (((gf) this).field_E != null) {
          var2 = ((gf) this).field_E;
          var3 = 0;
          L0: while (true) {
            if (var3 >= var2.length) {
              if (param0 <= 35) {
                fi discarded$1 = this.a(-52);
                return null;
              } else {
                return null;
              }
            } else {
              var4 = var2[var3];
              if (var4 != null) {
                var5 = var4.d(117);
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

    final static boolean a(int param0, int param1) {
        if (!(0 <= param1)) {
            return (1 + param1) % 4 == 0 ? true : false;
        }
        if (param1 < 1582) {
            return param1 % 4 == 0 ? true : false;
        }
        if (!(param1 % 4 == 0)) {
            return false;
        }
        if (param1 % 100 != 0) {
            return true;
        }
        if (param1 % 400 == 0) {
            return true;
        }
        return false;
    }

    private final boolean c(fi param0) {
        RuntimeException var3 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
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
            int discarded$2 = 0;
            stackOut_0_0 = this.a(1, param0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("gf.M(");
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
          throw kg.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + 65793 + ')');
        }
        return stackIn_1_0;
    }

    final void a(int param0, boolean param1, int param2, int param3, int param4) {
        if (!param1) {
            return;
        }
        super.a(param0, param1, param2, param3, param4);
        ((gf) this).c((byte) -99);
    }

    final static void a(int param0, int param1, int param2, int param3, wm param4, int param5, int param6) {
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
        tf var21_ref = null;
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
        byte[] var43 = null;
        int var44 = 0;
        wm var45 = null;
        int[] var49 = null;
        int[] var53 = null;
        int[] var57 = null;
        int[] var59 = null;
        int[] var60 = null;
        int[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int stackIn_15_0 = 0;
        int[] stackIn_16_0 = null;
        int[] stackIn_17_0 = null;
        int[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        tf stackIn_39_0 = null;
        int stackIn_45_0 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        short stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        short stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_31_0 = 0;
        short stackOut_30_0 = 0;
        tf stackOut_37_0 = null;
        Object stackOut_38_0 = null;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int[] stackOut_15_0 = null;
        int[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        var40 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var45 = param4;
                if (var45.field_z == null) {
                  break L2;
                } else {
                  if (var45.field_a > 1) {
                    var43 = var45.field_z;
                    int discarded$2 = 125;
                    al.a(var43, ph.field_o, 0, 0);
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              int discarded$3 = -80;
              fh.b();
              break L1;
            }
            var62 = new int[param4.field_i];
            var57 = var62;
            var53 = var57;
            var49 = var53;
            var41 = var49;
            var8_array = var41;
            var63 = new int[param4.field_i];
            var60 = u.field_q;
            var61 = fb.field_p;
            var59 = dc.field_Q;
            var13 = 0;
            L3: while (true) {
              if (var13 >= param4.field_i) {
                var44 = 0;
                var13 = var44;
                L4: while (true) {
                  if (var44 >= ck.field_f) {
                    break L0;
                  } else {
                    L5: {
                      var14 = bf.field_m[var44];
                      var15 = param4.field_J[var14];
                      var16 = param4.field_e[var14];
                      var17 = param4.field_j[var14];
                      if (u.field_q.length > param4.field_y[var14]) {
                        stackOut_25_0 = param4.field_y[var14];
                        stackIn_26_0 = stackOut_25_0;
                        break L5;
                      } else {
                        stackOut_24_0 = -1;
                        stackIn_26_0 = stackOut_24_0;
                        break L5;
                      }
                    }
                    L6: {
                      var18 = stackIn_26_0;
                      if (param4.field_I[var14] < u.field_q.length) {
                        stackOut_28_0 = param4.field_I[var14];
                        stackIn_29_0 = stackOut_28_0;
                        break L6;
                      } else {
                        stackOut_27_0 = -1;
                        stackIn_29_0 = stackOut_27_0;
                        break L6;
                      }
                    }
                    L7: {
                      var19 = stackIn_29_0;
                      if (param4.field_K[var14] >= u.field_q.length) {
                        stackOut_31_0 = -1;
                        stackIn_32_0 = stackOut_31_0;
                        break L7;
                      } else {
                        stackOut_30_0 = param4.field_K[var14];
                        stackIn_32_0 = stackOut_30_0;
                        break L7;
                      }
                    }
                    L8: {
                      L9: {
                        var20 = stackIn_32_0;
                        if (td.field_e == null) {
                          break L9;
                        } else {
                          if (param4.field_S == null) {
                            break L9;
                          } else {
                            if (param4.field_S.length <= var14) {
                              break L9;
                            } else {
                              if (param4.field_S[var14] == -1) {
                                break L9;
                              } else {
                                if (td.field_e.length <= param4.field_S[var14]) {
                                  break L9;
                                } else {
                                  stackOut_37_0 = td.field_e[param4.field_S[var14]];
                                  stackIn_39_0 = stackOut_37_0;
                                  break L8;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_38_0 = null;
                      stackIn_39_0 = (tf) (Object) stackOut_38_0;
                      break L8;
                    }
                    L10: {
                      L11: {
                        var21_ref = stackIn_39_0;
                        var22 = en.field_Hb[var15];
                        var23 = ld.field_h[var15];
                        var24 = en.field_Hb[var16];
                        var25 = ld.field_h[var16];
                        var26 = en.field_Hb[var17];
                        var27 = ld.field_h[var17];
                        if (var18 != var19) {
                          break L11;
                        } else {
                          if (var19 == var20) {
                            L12: {
                              var28 = var62[var18];
                              var29 = var63[var18];
                              if (var21_ref == null) {
                                stackOut_48_0 = 8355711;
                                stackIn_49_0 = stackOut_48_0;
                                break L12;
                              } else {
                                stackOut_47_0 = var21_ref.field_b;
                                stackIn_49_0 = stackOut_47_0;
                                break L12;
                              }
                            }
                            var30 = stackIn_49_0;
                            var31 = var30 & 16711935;
                            var32 = var30 & 65280;
                            var33 = var31 * var28 >>> 8 & 721355007 | (var32 * var28 & 16711835) >>> 8;
                            var33 = var33 + var29 * 65793;
                            rj.a(var24, var23, (var33 & 16711422) >> 1, var26, -69, var25, var22, var27);
                            break L10;
                          } else {
                            break L11;
                          }
                        }
                      }
                      L13: {
                        var28 = var62[var18];
                        var29 = var62[var19];
                        var30 = var62[var20];
                        var31 = var63[var18];
                        var32 = var63[var19];
                        var33 = var63[var20];
                        if (var21_ref != null) {
                          stackOut_44_0 = var21_ref.field_b;
                          stackIn_45_0 = stackOut_44_0;
                          break L13;
                        } else {
                          stackOut_43_0 = 8355711;
                          stackIn_45_0 = stackOut_43_0;
                          break L13;
                        }
                      }
                      var34 = stackIn_45_0;
                      var35 = var34 & 16711935;
                      var36 = var34 & 65280;
                      var37 = (16711876 & var36 * var28) >>> 8 | (var28 * var35 & -16711806) >>> 8;
                      var38 = (16711883 & var36 * var29) >>> 8 | (-16711801 & var35 * var29) >>> 8;
                      var37 = var37 + 65793 * var31;
                      var38 = var38 + 65793 * var32;
                      var39 = (16711742 & var36 * var30) >>> 8 | (-16711685 & var35 * var30) >>> 8;
                      var39 = var39 + 65793 * var33;
                      rf.a(false, var25, var39 >> 16, var39 & 255, (var39 & 65404) >> 8, var24, var38 >> 16, var38 >> 8 & 255, var23, var37 >> 16, var27, (var37 & 65315) >> 8, var26, var22, var38 & 255, var37 & 255);
                      break L10;
                    }
                    var44++;
                    continue L4;
                  }
                }
              } else {
                L14: {
                  var14 = param5 * var59[var13] + param1 * var60[var13] - -(param6 * var61[var13]) >> 8;
                  if (0 <= var14) {
                    break L14;
                  } else {
                    var14 = -var14;
                    break L14;
                  }
                }
                L15: {
                  if (0 > var14) {
                    stackOut_14_0 = 128;
                    stackIn_15_0 = stackOut_14_0;
                    break L15;
                  } else {
                    if (128 <= var14) {
                      stackOut_13_0 = 256;
                      stackIn_15_0 = stackOut_13_0;
                      break L15;
                    } else {
                      stackOut_12_0 = var14 + 128;
                      stackIn_15_0 = stackOut_12_0;
                      break L15;
                    }
                  }
                }
                L16: {
                  var14 = stackIn_15_0;
                  var15 = var59[var13] * param2 + (var60[var13] * param3 - -(var61[var13] * param0)) >> 8;
                  stackOut_15_0 = dm.field_x;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_16_0 = stackOut_15_0;
                  if (var15 < 0) {
                    stackOut_17_0 = (int[]) (Object) stackIn_17_0;
                    stackOut_17_1 = -var15;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    break L16;
                  } else {
                    stackOut_16_0 = (int[]) (Object) stackIn_16_0;
                    stackOut_16_1 = var15;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    break L16;
                  }
                }
                var15 = stackIn_18_0[stackIn_18_1];
                var14 = var14 * (256 + -var15) >>> 8;
                var62[var13] = var14;
                var63[var13] = var15;
                var13++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var8 = decompiledCaughtException;
            stackOut_52_0 = (RuntimeException) var8;
            stackOut_52_1 = new StringBuilder().append("gf.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param4 == null) {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L17;
            } else {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "{...}";
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              break L17;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_55_0, stackIn_55_2 + ',' + param5 + ',' + param6 + ',' + -22085 + ')');
        }
    }

    private final boolean a(fi param0) {
        int var4_int = 0;
        RuntimeException var4 = null;
        fi var5 = null;
        fi var6 = null;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var7 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (null == ((gf) this).field_E) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              var4_int = -1 + ((gf) this).field_E.length;
              L1: while (true) {
                if (var4_int < 0) {
                  stackOut_19_0 = 0;
                  stackIn_20_0 = stackOut_19_0;
                  break L0;
                } else {
                  L2: {
                    var5 = ((gf) this).field_E[var4_int];
                    if (var5 == null) {
                      break L2;
                    } else {
                      if (!var5.f(true)) {
                        break L2;
                      } else {
                        var4_int = var4_int - 1;
                        L3: while (true) {
                          if (var4_int < 0) {
                            break L2;
                          } else {
                            L4: {
                              var6 = ((gf) this).field_E[var4_int];
                              if (var6 != null) {
                                if (var6.a(param0, -8515)) {
                                  stackOut_15_0 = 1;
                                  stackIn_16_0 = stackOut_15_0;
                                  return stackIn_16_0 != 0;
                                } else {
                                  break L4;
                                }
                              } else {
                                break L4;
                              }
                            }
                            var4_int = var4_int - 1;
                            continue L3;
                          }
                        }
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
            stackOut_21_0 = (RuntimeException) var4;
            stackOut_21_1 = new StringBuilder().append("gf.K(");
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
          throw kg.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + 1 + ',' + -29 + ')');
        }
        return stackIn_20_0 != 0;
    }

    public static void a() {
        field_z = null;
        field_D = null;
        field_C = null;
        field_y = null;
        field_B = null;
        field_x = null;
        int var1 = -19;
        field_A = null;
    }

    final void a(int param0, int param1, int param2, fi param3, int param4, int param5) {
        fi[] var7 = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        fi var9 = null;
        int var10 = 0;
        fi[] var11 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var10 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (null != ((gf) this).field_E) {
              var11 = ((gf) this).field_E;
              var7 = var11;
              var8 = 0;
              L1: while (true) {
                if (var11.length <= var8) {
                  L2: {
                    if (param5 >= 73) {
                      break L2;
                    } else {
                      ((gf) this).field_E = null;
                      break L2;
                    }
                  }
                  break L0;
                } else {
                  L3: {
                    var9 = var11[var8];
                    if (var9 != null) {
                      var9.a(param0, param1, ((gf) this).field_l + param2, param3, param4 - -((gf) this).field_u, 104);
                      break L3;
                    } else {
                      break L3;
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
          L4: {
            var7_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var7_ref;
            stackOut_12_1 = new StringBuilder().append("gf.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    void a(int param0, int param1, fi param2, int param3) {
        fi[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        fi var7 = null;
        int var8 = 0;
        fi[] var9 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var8 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            super.a(param0, 114, param2, param3);
            if (((gf) this).field_E != null) {
              var9 = ((gf) this).field_E;
              var5 = var9;
              var6 = 0;
              L1: while (true) {
                if (var6 >= var9.length) {
                  break L0;
                } else {
                  L2: {
                    var7 = var9[var6];
                    if (var7 != null) {
                      var7.a(param0 - -((gf) this).field_l, 125, param2, param3 - -((gf) this).field_u);
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
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5_ref;
            stackOut_11_1 = new StringBuilder().append("gf.E(").append(param0).append(',').append(124).append(',');
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
          throw kg.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param3 + ')');
        }
    }

    final StringBuilder a(Hashtable param0, byte param1, int param2, StringBuilder param3) {
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
              if (((gf) this).a(param0, param2, 34, param3)) {
                ((gf) this).a(param2, param0, (byte) 127, param3);
                this.a(param2, param0, 56, param3);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 >= 118) {
                break L2;
              } else {
                field_A = null;
                break L2;
              }
            }
            stackOut_5_0 = (StringBuilder) param3;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("gf.MA(");
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
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');
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
          throw kg.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "Your turn - playing <%0> (<%1>)";
        field_C = "Invalid date";
        field_D = "Real-life threats";
        field_z = new lc(6, 0, 4, 2);
        field_A = "Tips";
        field_y = "Email: ";
        field_x = "Find opponent";
    }
}
