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

    private final boolean b(fi param0, int param1) {
        RuntimeException var3 = null;
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
              if (param1 == -1) {
                break L1;
              } else {
                this.c(46);
                break L1;
              }
            }
            stackIn_3_0 = this.a(param0, 1, (byte) -29);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("gf.F(");

            if (param0 == null) {
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
          throw kg.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final boolean f(boolean param0) {
        if (!param0) {
            return true;
        }
        return this.a(16711935) != null ? true : false;
    }

    final static hm g(boolean param0) {
        if (!param0) {
            field_x = (String) null;
        }
        return (hm) ((Object) new mf());
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
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (null != this.field_E) {
              var6 = 54 / ((param3 - -75) / 36);
              var10 = this.field_E;
              var5 = var10;
              var7 = 0;
              L1: while (true) {
                if (var7 >= var10.length) {
                  var5_int = param2;
                  if (80 == var5_int) {
                    L2: {
                      if (dc.field_Y[81]) {
                        stackIn_17_0 = this.b(param0, -1);
                        break L2;
                      } else {
                        stackIn_17_0 = this.c(param0, 65793);
                        break L2;
                      }
                    }
                    decompiledRegionSelector0 = 2;
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
                          stackIn_10_0 = 1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                  var7++;
                  continue L1;
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
          L4: {
            var5_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var5_ref);

            stackIn_20_1 = new StringBuilder().append("gf.AA(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            return stackIn_17_0;
          }
        }
    }

    final static void a(String param0, int param1, boolean param2, String param3, int param4, String param5) {
        cj var6 = null;
        try {
            if (param2) {
                String var7 = (String) null;
                gf.a((String) null, -123, false, (String) null, -113, (String) null);
            }
            var6 = new cj(param4, param0, param1, param5, param3);
            ln.a(var6, 112);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "gf.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    void a(byte param0, int param1, int param2, int param3) {
        int var5;
        fi var6;
        int var7;
        L0: {
          var7 = Virogrid.field_F ? 1 : 0;
          if (param3 != 0) {
            break L0;
          } else {
            if (this.field_w == null) {
              break L0;
            } else {
              this.field_w.a(param1, (fi) (this), true, param2, -23294);
              break L0;
            }
          }
        }
        if (param0 == 37) {
          L1: {
            if (null == this.field_E) {
              break L1;
            } else {
              var5 = this.field_E.length + -1;
              L2: while (true) {
                if (-1 < (var5 ^ -1)) {
                  break L1;
                } else {
                  var6 = this.field_E[var5];
                  if (var6 != null) {
                    var6.a((byte) 37, param1 - -this.field_l, this.field_u + param2, param3);
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
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var7 = this.field_E;
              var3 = var7;
              if (param1 == -8515) {
                break L1;
              } else {
                this.field_E = (fi[]) null;
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var7.length <= var4) {
                stackIn_12_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L3: {
                  var5 = var7[var4];
                  if (var5 == null) {
                    break L3;
                  } else {
                    if (var5.a(param0, -8515)) {
                      stackIn_9_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L0;
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
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("gf.G(");

            if (param0 == null) {
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
          throw kg.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    final boolean a(fi param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        fi[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        fi var10 = null;
        int var11 = 0;
        StringBuilder var12 = null;
        fi[] var13 = null;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (this.field_E != null) {
              L1: {
                if (!param2) {
                  break L1;
                } else {
                  var12 = (StringBuilder) null;
                  this.a(121, (Hashtable) null, 48, (StringBuilder) null);
                  break L1;
                }
              }
              var13 = this.field_E;
              var8 = var13;
              var9 = 0;
              L2: while (true) {
                if (var13.length <= var9) {
                  stackIn_14_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    var10 = var13[var9];
                    if (var10 == null) {
                      break L3;
                    } else {
                      if (!var10.a(param0, param1, false, this.field_l + param3, param4, param5 - -this.field_u, param6)) {
                        break L3;
                      } else {
                        stackIn_11_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                  var9++;
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
          L4: {
            var8_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var8_ref);

            stackIn_17_1 = new StringBuilder().append("gf.NA(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            return stackIn_14_0 != 0;
          }
        }
    }

    final int b(byte param0) {
        int var2;
        fi[] var3;
        int var4;
        fi var5;
        int var7;
        int var6;
        var7 = Virogrid.field_F ? 1 : 0;
        var2 = 0;
        if (param0 == -39) {
          var3 = this.field_E;
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
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        int var6 = 0;
        fi var7 = null;
        int var8 = 0;
        int var9 = 0;
        StringBuilder var10 = null;
        fi[] var11 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var9 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (this.field_E != null) {
              var11 = this.field_E;
              var6 = 0;
              L1: while (true) {
                if (var11.length <= var6) {
                  L2: {
                    if (param2 > 5) {
                      break L2;
                    } else {
                      var10 = (StringBuilder) null;
                      this.a((Hashtable) null, (byte) 102, 71, (StringBuilder) null);
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var7 = var11[var6];
                  discarded$3 = param3.append('\n');
                  var8 = 0;
                  L3: while (true) {
                    if (var8 > param0) {
                      L4: {
                        if (var7 == null) {
                          discarded$4 = param3.append("null");
                          break L4;
                        } else {
                          var7.a(param1, (byte) 126, param0 - -1, param3);
                          break L4;
                        }
                      }
                      var6++;
                      continue L1;
                    } else {
                      discarded$5 = param3.append(' ');
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
            stackIn_17_0 = (RuntimeException) (var5);

            stackIn_17_1 = new StringBuilder().append("gf.R(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (null == this.field_E) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var12 = this.field_E;
              var8 = var12;
              var9 = param5;
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
                      if (!var10.f(true)) {
                        break L2;
                      } else {
                        if (!var10.a(param0, param1, param2, param3, param4, param5 + 0, param6)) {
                          break L2;
                        } else {
                          stackIn_11_0 = 1;
                          decompiledRegionSelector0 = 1;
                          break L0;
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
            stackIn_17_0 = (RuntimeException) (var8_ref);

            stackIn_17_1 = new StringBuilder().append("gf.TA(").append(param0).append(',');

            if (param1 == null) {
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
          throw kg.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
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

    gf(int param0, int param1, int param2, int param3, ol param4) {
        super(param0, param1, param2, param3, param4, (cd) null);
    }

    private final fi a(int param0) {
        fi[] var2;
        int var3;
        fi var4;
        int var5;
        fi[] var6;
        var5 = Virogrid.field_F ? 1 : 0;
        if (this.field_E != null) {
          L0: {
            if (param0 == 16711935) {
              break L0;
            } else {
              field_B = (String) null;
              break L0;
            }
          }
          var6 = this.field_E;
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

    private final boolean a(int param0, fi param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        fi var5 = null;
        fi var6 = null;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (null == this.field_E) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var4_int = param2;
              L1: while (true) {
                if (var4_int >= this.field_E.length) {
                  stackIn_19_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L2: {
                    var5 = this.field_E[var4_int];
                    var6 = var5;
                    var6 = var5;
                    if (var5 == null) {
                      break L2;
                    } else {
                      if (var5.f(true)) {
                        var4_int = var4_int + param0;
                        L3: while (true) {
                          if (var4_int >= this.field_E.length) {
                            break L2;
                          } else {
                            L4: {
                              var6 = this.field_E[var4_int];
                              if (var6 == null) {
                                break L4;
                              } else {
                                if (!var6.a(param1, -8515)) {
                                  break L4;
                                } else {
                                  stackIn_15_0 = 1;
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                }
                              }
                            }
                            var4_int = var4_int + param0;
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
            stackIn_22_0 = (RuntimeException) (var4);

            stackIn_22_1 = new StringBuilder().append("gf.P(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0 != 0;
          } else {
            return stackIn_19_0 != 0;
          }
        }
    }

    final void c(int param0) {
        fi[] var2;
        int var3;
        fi var4;
        int var5;
        fi[] var7;
        fi var6;
        var5 = Virogrid.field_F ? 1 : 0;
        var7 = this.field_E;
        var2 = var7;
        var3 = 0;
        L0: while (true) {
          if (var3 >= var7.length) {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                var6 = (fi) null;
                this.a((fi) null, -37);
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
        fi discarded$0 = null;
        fi[] var2;
        int var3;
        fi var4;
        int var6;
        String var5;
        var6 = Virogrid.field_F ? 1 : 0;
        if (this.field_E != null) {
          var2 = this.field_E;
          var3 = 0;
          L0: while (true) {
            if (var3 >= var2.length) {
              if (param0 <= 35) {
                discarded$0 = this.a(-52);
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
            return -1 == ((1 + param1) % 4 ^ -1) ? true : false;
        }
        if ((param1 ^ -1) > -1583) {
            return param1 % 4 == 0 ? true : false;
        }
        if (!(param1 % 4 == 0)) {
            return false;
        }
        if (param1 % 100 != 0) {
            return true;
        }
        if (param0 > -83) {
            gf.g(false);
        }
        if (param1 % 400 == 0) {
            return true;
        }
        return false;
    }

    private final boolean c(fi param0, int param1) {
        RuntimeException var3 = null;
        String var4 = null;
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
              if (param1 == 65793) {
                break L1;
              } else {
                var4 = (String) null;
                gf.a((String) null, -17, true, (String) null, 83, (String) null);
                break L1;
              }
            }
            stackIn_3_0 = this.a(1, param0, param1 + -65793);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("gf.M(");

            if (param0 == null) {
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
          throw kg.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, boolean param1, int param2, int param3, int param4) {
        if (!param1) {
            return;
        }
        super.a(param0, param1, param2, param3, param4);
        this.c((byte) -99);
    }

    final static void a(int param0, int param1, int param2, int param3, wm param4, int param5, int param6, int param7) {
        int stackIn_15_0 = 0;
        int[] stackIn_17_0 = null;
        int[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        tf stackIn_39_0 = null;
        int stackIn_45_0 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var8 = null;
        RuntimeException var8_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        tf var21 = null;
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
        int var44 = 0;
        wm var45 = null;
        int[] var50 = null;
        int[] var55 = null;
        byte[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        var40 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var45 = param4;
                if (var45.field_z == null) {
                  break L2;
                } else {
                  if ((var45.field_a ^ -1) < -2) {
                    var61 = var45.field_z;
                    al.a(var61, ph.field_o, 0, 0, param7 ^ -22074);
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              fh.b((byte) -80);
              break L1;
            }
            var55 = new int[param4.field_i];
            var50 = var55;
            var41 = var50;
            var8 = var41;
            var65 = new int[param4.field_i];
            var63 = u.field_q;
            var64 = fb.field_p;
            var62 = dc.field_Q;
            var13 = 0;
            L3: while (true) {
              if (var13 >= param4.field_i) {
                L4: {
                  if (param7 == -22085) {
                    break L4;
                  } else {
                    gf.a((byte) -54);
                    break L4;
                  }
                }
                var44 = 0;
                var13 = var44;
                L5: while (true) {
                  if (var44 >= ck.field_f) {
                    break L0;
                  } else {
                    L6: {
                      var14 = bf.field_m[var44];
                      var15 = param4.field_J[var14];
                      var16 = param4.field_e[var14];
                      var17 = param4.field_j[var14];
                      if (u.field_q.length > param4.field_y[var14]) {
                        stackIn_26_0 = param4.field_y[var14];
                        break L6;
                      } else {
                        stackIn_26_0 = -1;
                        break L6;
                      }
                    }
                    L7: {
                      var18 = stackIn_26_0;
                      if (param4.field_I[var14] < u.field_q.length) {
                        stackIn_29_0 = param4.field_I[var14];
                        break L7;
                      } else {
                        stackIn_29_0 = -1;
                        break L7;
                      }
                    }
                    L8: {
                      var19 = stackIn_29_0;
                      if (param4.field_K[var14] >= u.field_q.length) {
                        stackIn_32_0 = -1;
                        break L8;
                      } else {
                        stackIn_32_0 = param4.field_K[var14];
                        break L8;
                      }
                    }
                    L9: {
                      L10: {
                        var20 = stackIn_32_0;
                        if (td.field_e == null) {
                          break L10;
                        } else {
                          if (param4.field_S == null) {
                            break L10;
                          } else {
                            if (param4.field_S.length <= var14) {
                              break L10;
                            } else {
                              if (0 == (param4.field_S[var14] ^ -1)) {
                                break L10;
                              } else {
                                if (td.field_e.length <= param4.field_S[var14]) {
                                  break L10;
                                } else {
                                  stackIn_39_0 = td.field_e[param4.field_S[var14]];
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackIn_39_0 = null;
                      break L9;
                    }
                    L11: {
                      L12: {
                        var21 = stackIn_39_0;
                        var22 = en.field_Hb[var15];
                        var23 = ld.field_h[var15];
                        var24 = en.field_Hb[var16];
                        var25 = ld.field_h[var16];
                        var26 = en.field_Hb[var17];
                        var27 = ld.field_h[var17];
                        if (var18 != var19) {
                          break L12;
                        } else {
                          if (var19 == var20) {
                            L13: {
                              var28 = var55[var18];
                              var29 = var65[var18];
                              if (var21 == null) {
                                stackIn_49_0 = 8355711;
                                break L13;
                              } else {
                                stackIn_49_0 = var21.field_b;
                                break L13;
                              }
                            }
                            var30 = stackIn_49_0;
                            var31 = var30 & 16711935;
                            var32 = var30 & 65280;
                            var33 = var31 * var28 >>> -572003352 & 721355007 | (var32 * var28 & 16711835) >>> 2109971400;
                            var33 = var33 + var29 * 65793;
                            rj.a(var24, var23, (var33 & 16711422) >> 1460680993, var26, -69, var25, var22, var27);
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      L14: {
                        var28 = var55[var18];
                        var29 = var55[var19];
                        var30 = var55[var20];
                        var31 = var65[var18];
                        var32 = var65[var19];
                        var33 = var65[var20];
                        if (var21 != null) {
                          stackIn_45_0 = var21.field_b;
                          break L14;
                        } else {
                          stackIn_45_0 = 8355711;
                          break L14;
                        }
                      }
                      var34 = stackIn_45_0;
                      var35 = var34 & 16711935;
                      var36 = var34 & 65280;
                      var37 = (16711876 & var36 * var28) >>> -893506136 | (var28 * var35 & -16711806) >>> -57324536;
                      var38 = (16711883 & var36 * var29) >>> -1766529624 | (-16711801 & var35 * var29) >>> -1975323288;
                      var37 = var37 + 65793 * var31;
                      var38 = var38 + 65793 * var32;
                      var39 = (16711742 & var36 * var30) >>> -20100216 | (-16711685 & var35 * var30) >>> -1538775256;
                      var39 = var39 + 65793 * var33;
                      rf.a(false, var25, var39 >> 808665008, var39 & 255, (var39 & 65404) >> -1977101848, var24, var38 >> -1388777232, var38 >> 1313226408 & 255, var23, var37 >> -1245705264, var27, (var37 & 65315) >> 449189032, var26, var22, var38 & 255, var37 & 255);
                      break L11;
                    }
                    var44++;
                    continue L5;
                  }
                }
              } else {
                L15: {
                  var14 = param5 * var62[var13] + param1 * var63[var13] - -(param6 * var64[var13]) >> -1991744408;
                  if (0 <= var14) {
                    break L15;
                  } else {
                    var14 = -var14;
                    break L15;
                  }
                }
                L16: {
                  if (0 > var14) {
                    stackIn_15_0 = 128;
                    break L16;
                  } else {
                    if (128 <= var14) {
                      stackIn_15_0 = 256;
                      break L16;
                    } else {
                      stackIn_15_0 = var14 + 128;
                      break L16;
                    }
                  }
                }
                L17: {
                  var14 = stackIn_15_0;
                  var15 = var62[var13] * param2 + (var63[var13] * param3 - -(var64[var13] * param0)) >> 1054733672;
                  stackIn_17_0 = dm.field_x;

                  if (var15 < 0) {
                    stackIn_18_0 = (int[]) ((Object) stackIn_17_0);
                    stackIn_18_1 = -var15;
                    break L17;
                  } else {
                    stackIn_18_0 = (int[]) ((Object) stackIn_17_0);
                    stackIn_18_1 = var15;
                    break L17;
                  }
                }
                var15 = stackIn_18_0[stackIn_18_1];
                var14 = var14 * (256 + -var15) >>> -2101004920;
                var55[var13] = var14;
                var65[var13] = var15;
                var13++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var8_ref = decompiledCaughtException;
            stackIn_54_0 = (RuntimeException) (var8_ref);

            stackIn_54_1 = new StringBuilder().append("gf.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_55_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "null";
              break L18;
            } else {
              stackIn_55_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "{...}";
              break L18;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_55_0), stackIn_55_2 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    private final boolean a(fi param0, int param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        fi var5 = null;
        fi var6 = null;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (null == this.field_E) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param2 == -29) {
                  break L1;
                } else {
                  field_A = (String) null;
                  break L1;
                }
              }
              var4_int = -1 + this.field_E.length;
              L2: while (true) {
                if (-1 < (var4_int ^ -1)) {
                  stackIn_22_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    var5 = this.field_E[var4_int];
                    if (var5 == null) {
                      break L3;
                    } else {
                      if (!var5.f(true)) {
                        break L3;
                      } else {
                        var4_int = var4_int - param1;
                        L4: while (true) {
                          if (var4_int < 0) {
                            break L3;
                          } else {
                            L5: {
                              var6 = this.field_E[var4_int];
                              if (var6 != null) {
                                if (var6.a(param0, -8515)) {
                                  stackIn_18_0 = 1;
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                } else {
                                  break L5;
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
            stackIn_25_0 = (RuntimeException) (var4);

            stackIn_25_1 = new StringBuilder().append("gf.K(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L6;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L6;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_18_0 != 0;
          } else {
            return stackIn_22_0 != 0;
          }
        }
    }

    public static void a(byte param0) {
        field_z = null;
        field_D = null;
        field_C = null;
        field_y = null;
        field_B = null;
        field_x = null;
        int var1 = -19 / ((param0 - 70) / 41);
        field_A = null;
    }

    final void a(int param0, int param1, int param2, fi param3, int param4, int param5) {
        fi[] var7 = null;
        int var8 = 0;
        fi var9 = null;
        int var10 = 0;
        fi[] var11 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var10 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (null != this.field_E) {
              var11 = this.field_E;
              var7 = var11;
              var8 = 0;
              L1: while (true) {
                if (var11.length <= var8) {
                  L2: {
                    if (param5 >= 73) {
                      break L2;
                    } else {
                      this.field_E = (fi[]) null;
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    var9 = var11[var8];
                    if (var9 != null) {
                      var9.a(param0, param1, this.field_l + param2, param3, param4 - -this.field_u, 104);
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
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var7_ref);

            stackIn_14_1 = new StringBuilder().append("gf.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw kg.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    void a(int param0, int param1, fi param2, int param3) {
        fi[] var5 = null;
        int var6 = 0;
        fi var7 = null;
        int var8 = 0;
        fi[] var9 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            super.a(param0, 114, param2, param3);
            if (this.field_E != null) {
              var9 = this.field_E;
              var5 = var9;
              var6 = 0;
              if (param1 > 113) {
                L1: while (true) {
                  if (var6 >= var9.length) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    L2: {
                      var7 = var9[var6];
                      if (var7 != null) {
                        var7.a(param0 - -this.field_l, 125, param2, param3 - -this.field_u);
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
          L3: {
            var5_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5_ref);

            stackIn_13_1 = new StringBuilder().append("gf.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final StringBuilder a(Hashtable param0, byte param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
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
              if (this.a(param0, param2, 34, param3)) {
                this.a(param2, param0, (byte) 127, param3);
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
                field_A = (String) null;
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

            stackIn_9_1 = new StringBuilder().append("gf.MA(");

            if (param0 == null) {
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


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');

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
          throw kg.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    static {
        field_B = "Your turn - playing <%0> (<%1>)";
        field_C = "Invalid date";
        field_D = "Real-life threats";
        field_z = new lc(6, 0, 4, 2);
        field_A = "Tips";
        field_y = "Email: ";
        field_x = "Find opponent";
    }
}
