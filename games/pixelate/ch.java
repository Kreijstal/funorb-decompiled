/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ch extends ng implements j {
    static String field_H;
    static String field_G;
    bb field_F;

    private final void a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        ng var6 = null;
        int var7 = 0;
        int var8 = 0;
        StringBuilder var9 = null;
        nm var10 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              var10 = new nm(this.field_F);
              if (param2 == 32) {
                break L1;
              } else {
                var9 = (StringBuilder) null;
                this.a(-23, (Hashtable) null, -77, (StringBuilder) null);
                break L1;
              }
            }
            var6 = (ng) ((Object) var10.d(param2 + -32));
            L2: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                discarded$3 = param3.append('\n');
                var7 = 0;
                L3: while (true) {
                  if (var7 > param0) {
                    var6.a(param3, false, param0 - -1, param1);
                    var6 = (ng) ((Object) var10.a((byte) -104));
                    continue L2;
                  } else {
                    discarded$4 = param3.append(' ');
                    var7++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("ch.IA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
    }

    boolean a(int param0, int param1, ng param2, char param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        ng var8 = null;
        nm var9 = null;
        int stackIn_7_0 = 0;
        boolean stackIn_14_0 = false;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var9 = new nm(this.field_F);
            var8 = (ng) ((Object) var9.d(0));
            L1: while (true) {
              L2: {
                if (var8 == null) {
                  break L2;
                } else {
                  if (!var8.b(0)) {
                    break L2;
                  } else {
                    L3: {
                      if (!var8.b(true)) {
                        break L3;
                      } else {
                        if (!var8.a(param0, param1 + 0, param2, param3)) {
                          break L3;
                        } else {
                          stackIn_7_0 = 1;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      }
                    }
                    var8 = (ng) ((Object) var9.a((byte) -104));
                    continue L1;
                  }
                }
              }
              var6 = param0;
              if (80 == var6) {
                L4: {
                  if (!bc.field_m[81]) {
                    stackIn_14_0 = this.b(10, param2);
                    break L4;
                  } else {
                    stackIn_14_0 = this.a(0, param2);
                    break L4;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param1 == 3) {
                  stackIn_18_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  field_H = (String) null;
                  return false;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var5);

            stackIn_21_1 = new StringBuilder().append("ch.G(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw aa.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0;
          } else {
            return stackIn_18_0 != 0;
          }
        }
    }

    final boolean a(int param0, byte param1, int param2, int param3, int param4, int param5, ng param6) {
        RuntimeException var8 = null;
        ng var9 = null;
        int var10 = 0;
        StringBuilder var11 = null;
        nm var12 = null;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 > 61) {
                break L1;
              } else {
                var11 = (StringBuilder) null;
                this.a(95, (Hashtable) null, -28, (StringBuilder) null);
                break L1;
              }
            }
            var12 = new nm(this.field_F);
            var9 = (ng) ((Object) var12.d(0));
            L2: while (true) {
              L3: {
                if (var9 == null) {
                  break L3;
                } else {
                  if (!var9.b(0)) {
                    break L3;
                  } else {
                    L4: {
                      if (!var9.b(true)) {
                        break L4;
                      } else {
                        if (var9.a(param0, (byte) 112, param2, param3, param4, param5, param6)) {
                          stackIn_10_0 = 1;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var9 = (ng) ((Object) var12.a((byte) -104));
                    continue L2;
                  }
                }
              }
              stackIn_13_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var8);

            stackIn_16_1 = new StringBuilder().append("ch.FA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
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
          throw aa.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0 != 0;
        } else {
          return stackIn_13_0 != 0;
        }
    }

    final boolean a(int param0, ng param1) {
        nm var3 = null;
        RuntimeException var3_ref = null;
        ng var4 = null;
        nm var5 = null;
        ng var6 = null;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (this.field_F.a(param0)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3 = new nm(this.field_F);
              var4 = (ng) ((Object) var3.b(param0 ^ -1));
              L1: while (true) {
                if (var4 == null) {
                  stackIn_17_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L2: {
                    if (var4.b(true)) {
                      var5 = new nm(this.field_F);
                      var5.a((byte) -99, var4);
                      var6 = (ng) ((Object) var5.e(-59));
                      L3: while (true) {
                        if (var6 == null) {
                          break L2;
                        } else {
                          if (!var6.a(param1, 27)) {
                            var6 = (ng) ((Object) var5.e(-94));
                            continue L3;
                          } else {
                            stackIn_13_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                  var4 = (ng) ((Object) var3.e(-79));
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3_ref);

            stackIn_20_1 = new StringBuilder().append("ch.BA(").append(param0).append(',');

            if (param1 == null) {
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
          throw aa.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            return stackIn_17_0 != 0;
          }
        }
    }

    void a(int param0, int param1, int param2, ng param3) {
        RuntimeException runtimeException = null;
        nm var5 = null;
        ng var6 = null;
        int var7 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            super.a(param0, param1, param2, param3);
            var5 = new nm(this.field_F);
            var6 = (ng) ((Object) var5.d(0));
            L1: while (true) {
              L2: {
                if (var6 == null) {
                  break L2;
                } else {
                  if (!var6.b(param0 + -40)) {
                    break L2;
                  } else {
                    var6.a(40, param1 - -this.field_p, param2 + this.field_z, param3);
                    var6 = (ng) ((Object) var5.a((byte) -104));
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

            stackIn_8_1 = new StringBuilder().append("ch.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

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

    final boolean b(int param0, ng param1) {
        RuntimeException var3 = null;
        ng var4 = null;
        nm var5 = null;
        ng var6 = null;
        int var7 = 0;
        nm var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (!this.field_F.a(param0 ^ 10)) {
              var8 = new nm(this.field_F);
              var4 = (ng) ((Object) var8.d(0));
              L1: while (true) {
                if (var4 == null) {
                  if (param0 == 10) {
                    stackIn_18_0 = 0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    this.k(-117);
                    return false;
                  }
                } else {
                  L2: {
                    if (var4.b(true)) {
                      var5 = new nm(this.field_F);
                      var5.b((byte) -87, var4);
                      var6 = (ng) ((Object) var5.a((byte) -104));
                      L3: while (true) {
                        if (var6 == null) {
                          break L2;
                        } else {
                          if (!var6.a(param1, 27)) {
                            var6 = (ng) ((Object) var5.a((byte) -104));
                            continue L3;
                          } else {
                            stackIn_12_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                  var4 = (ng) ((Object) var8.a((byte) -104));
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
            var3 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var3);

            stackIn_21_1 = new StringBuilder().append("ch.NA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L4;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0 != 0;
          } else {
            return stackIn_18_0 != 0;
          }
        }
    }

    final void h(int param0) {
        int var4 = Pixelate.field_H ? 1 : 0;
        if (param0 != 2) {
            ng var5 = (ng) null;
            this.a(-101, 97, (ng) null, '');
        }
        nm var2 = new nm(this.field_F);
        ng var3 = (ng) ((Object) var2.d(0));
        while (var3 != null) {
            var3.h(2);
            var3 = (ng) ((Object) var2.a((byte) -104));
        }
    }

    void a(int param0, byte param1, int param2, int param3, int param4) {
        if (param1 <= 19) {
            this.field_F = (bb) null;
        }
        super.a(param0, (byte) 126, param2, param3, param4);
        this.j(-8133);
    }

    final boolean a(byte param0, ng param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        ng var9 = null;
        int var10 = 0;
        StringBuilder var11 = null;
        nm var12 = null;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              var12 = new nm(this.field_F);
              if (param0 == -58) {
                break L1;
              } else {
                var11 = (StringBuilder) null;
                this.a(-76, (Hashtable) null, 78, (StringBuilder) null);
                break L1;
              }
            }
            var9 = (ng) ((Object) var12.d(0));
            L2: while (true) {
              L3: {
                if (var9 == null) {
                  break L3;
                } else {
                  if (!var9.b(0)) {
                    break L3;
                  } else {
                    if (var9.a((byte) -58, param1, param2, this.field_p + param3, param4, this.field_z + param5, param6)) {
                      stackIn_9_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var9 = (ng) ((Object) var12.a((byte) -104));
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
            var8 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var8);

            stackIn_15_1 = new StringBuilder().append("ch.N(").append(param0).append(',');

            if (param1 == null) {
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
          throw aa.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    final boolean b(boolean param0) {
        if (!param0) {
            StringBuilder var3 = (StringBuilder) null;
            this.a(82, (Hashtable) null, -45, (StringBuilder) null);
        }
        return null != this.k(-105) ? true : false;
    }

    ch(int param0, int param1, int param2, int param3, eb param4) {
        super(param0, param1, param2, param3, param4, (fn) null);
        this.field_F = new bb();
    }

    final void b(ng param0, int param1) {
        try {
            this.field_F.a(22125, param0);
            if (param1 != 80) {
                field_H = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "ch.LA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void d(byte param0) {
        field_H = null;
        field_G = null;
        int var1 = -42 / ((3 - param0) / 46);
    }

    final boolean a(ng param0, int param1) {
        nm var3 = null;
        RuntimeException var3_ref = null;
        ng var4 = null;
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              var3 = new nm(this.field_F);
              var4 = (ng) ((Object) var3.d(0));
              if (param1 == 27) {
                break L1;
              } else {
                this.b(false);
                break L1;
              }
            }
            L2: while (true) {
              if (var4 == null) {
                stackIn_10_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (var4.a(param0, 27)) {
                  stackIn_7_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  var4 = (ng) ((Object) var3.a((byte) -104));
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("ch.HA(");

            if (param0 == null) {
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
          throw aa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    final void a(int param0, int param1, ng param2, int param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        nm var7 = null;
        ng var8 = null;
        int var9 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var7 = new nm(this.field_F);
            var8 = (ng) ((Object) var7.d(param3));
            L1: while (true) {
              L2: {
                if (var8 == null) {
                  break L2;
                } else {
                  if (!var8.b(0)) {
                    break L2;
                  } else {
                    var8.a(param0, param1 - -this.field_z, param2, 0, param4 - -this.field_p, param5);
                    var8 = (ng) ((Object) var7.a((byte) -104));
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

            stackIn_8_1 = new StringBuilder().append("ch.EA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw aa.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final StringBuilder a(StringBuilder param0, boolean param1, int param2, Hashtable param3) {
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
                field_G = (String) null;
                break L1;
              }
            }
            L2: {
              if (!this.a(-60, param2, param0, param3)) {
                break L2;
              } else {
                this.a(param2, (byte) -2, param3, param0);
                this.a(param2, param3, 32, param0);
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

            stackIn_8_1 = new StringBuilder().append("ch.AA(");

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

    void a(int param0, int param1, int param2, byte param3) {
        int var8 = Pixelate.field_H ? 1 : 0;
        if (param1 == 0) {
            if (!(null == this.field_y)) {
                this.field_y.a((ng) (this), (byte) -124, param0, param2, true);
            }
        }
        nm var5 = new nm(this.field_F);
        int var7 = 101 % ((param3 - 70) / 49);
        ng var6 = (ng) ((Object) var5.b(-1));
        while (var6 != null) {
            var6.a(this.field_p + param0, param1, this.field_z + param2, (byte) -68);
            var6 = (ng) ((Object) var5.e(-91));
        }
    }

    String b(byte param0) {
        nm var2;
        ng var3;
        String var4;
        int var5;
        var5 = Pixelate.field_H ? 1 : 0;
        var2 = new nm(this.field_F);
        if (param0 > 16) {
          var3 = (ng) ((Object) var2.d(0));
          L0: while (true) {
            if (var3 != null) {
              var4 = var3.b((byte) 36);
              if (var4 == null) {
                var3 = (ng) ((Object) var2.a((byte) -104));
                continue L0;
              } else {
                return var4;
              }
            } else {
              return null;
            }
          }
        } else {
          return (String) null;
        }
    }

    ng k(int param0) {
        int var4 = Pixelate.field_H ? 1 : 0;
        nm var2 = new nm(this.field_F);
        ng var3_ref_ng = (ng) ((Object) var2.d(0));
        while (var3_ref_ng != null) {
            if (var3_ref_ng.b(true)) {
                return var3_ref_ng;
            }
            var3_ref_ng = (ng) ((Object) var2.a((byte) -104));
        }
        int var3 = 125 % ((-51 - param0) / 39);
        return null;
    }

    final int e(int param0) {
        int var5 = 0;
        int var6 = Pixelate.field_H ? 1 : 0;
        int var2 = 0;
        if (param0 < 31) {
            field_H = (String) null;
        }
        nm var3 = new nm(this.field_F);
        ng var4 = (ng) ((Object) var3.d(0));
        while (var4 != null) {
            var5 = var4.e(58);
            if (var2 < var5) {
                var2 = var5;
            }
            var4 = (ng) ((Object) var3.a((byte) -104));
        }
        return var2;
    }

    private final void j(int param0) {
        int var4 = Pixelate.field_H ? 1 : 0;
        nm var2 = new nm(this.field_F);
        ng var3 = (ng) ((Object) var2.d(param0 ^ param0));
        while (var3 != null) {
            var3.c((byte) 51);
            var3 = (ng) ((Object) var2.a((byte) -104));
        }
    }

    final static void a(boolean param0, String param1, int param2, int param3, tf[] param4, int param5, int param6, int param7, tf[] param8, boolean param9, jl param10, int param11, byte param12, int param13, int param14) {
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var15_int = 0;
        RuntimeException var15 = null;
        try {
          L0: {
            qm.a(param13, nl.field_c, param2, param11, new sb(param4), ao.field_d, v.field_d, mh.field_a, new sb(param8), param6, param11, param10, param7, param6, param10, param14, mj.field_k, 108, hd.field_n, param5);
            var15_int = 75 % ((param12 - -21) / 34);
            uh.a(param0, param9, param1, 0, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var15 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var15);

            stackIn_4_1 = new StringBuilder().append("ch.V(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param9).append(',');

            if (param10 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_5_0), stackIn_14_2 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ')');
        }
    }

    static {
        field_H = "Tips";
        field_G = "Exploiting a bug";
    }
}
