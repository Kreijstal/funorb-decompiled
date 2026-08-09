/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class hn extends gm implements cj {
    static int field_z;
    static String field_A;
    ei field_y;
    static int field_x;

    final static void a(String param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -71) {
                break L1;
              } else {
                field_x = 53;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("hn.CB(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    private final void a(StringBuilder param0, int param1, Hashtable param2, byte param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        gm var6 = null;
        int var7 = 0;
        int var8 = 0;
        gm var9 = null;
        re var10 = null;
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
        var8 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (param3 > 55) {
                break L1;
              } else {
                var9 = (gm) null;
                this.a(-19, false, 4, -101, (gm) null, 68, 32);
                break L1;
              }
            }
            var10 = new re(this.field_y);
            var6 = (gm) ((Object) var10.a((byte) 106));
            L2: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                discarded$3 = param0.append('\n');
                var7 = 0;
                L3: while (true) {
                  if (var7 > param1) {
                    var6.a(param0, (byte) 117, param2, 1 + param1);
                    var6 = (gm) ((Object) var10.b(true));
                    continue L2;
                  } else {
                    discarded$4 = param0.append(' ');
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

            stackIn_12_1 = new StringBuilder().append("hn.AB(");

            if (param0 == null) {
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


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw rb.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param3 + ')');
        }
    }

    final boolean a(int param0, boolean param1, int param2, int param3, gm param4, int param5, int param6) {
        re var8 = null;
        RuntimeException var8_ref = null;
        gm var9 = null;
        int var10 = 0;
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
        var10 = Torquing.field_u;
        try {
          L0: {
            var8 = new re(this.field_y);
            if (!param1) {
              var9 = (gm) ((Object) var8.a((byte) 124));
              L1: while (true) {
                L2: {
                  if (var9 == null) {
                    break L2;
                  } else {
                    if (!var9.e(17)) {
                      break L2;
                    } else {
                      L3: {
                        if (!var9.g(2)) {
                          break L3;
                        } else {
                          if (var9.a(param0, false, param2, param3, param4, param5, param6)) {
                            stackIn_11_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var9 = (gm) ((Object) var8.b(true));
                      continue L1;
                    }
                  }
                }
                stackIn_14_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var8_ref);

            stackIn_17_1 = new StringBuilder().append("hn.IA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
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
          throw rb.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param5 + ',' + param6 + ')');
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

    void a(int param0, byte param1, int param2, int param3) {
        int var7 = Torquing.field_u;
        if (param1 > -7) {
            field_z = -92;
        }
        if (0 == param0) {
            if (!(this.field_q == null)) {
                this.field_q.a(127, param2, param3, true, (gm) (this));
            }
        }
        re var5 = new re(this.field_y);
        gm var6 = (gm) ((Object) var5.a(17514));
        while (var6 != null) {
            var6.a(param0, (byte) -107, this.field_k + param2, param3 - -this.field_w);
            var6 = (gm) ((Object) var5.a(true));
        }
    }

    final void a(gm param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_y.a((byte) 54, param0);
              if (param1 == -6938) {
                break L1;
              } else {
                this.a(69, (byte) -75, 83, -7);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("hn.JB(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    private final void a(boolean param0) {
        int var4 = Torquing.field_u;
        re var2 = new re(this.field_y);
        if (!param0) {
            field_z = 36;
        }
        gm var3 = (gm) ((Object) var2.a((byte) 66));
        while (var3 != null) {
            var3.e((byte) 88);
            var3 = (gm) ((Object) var2.b(true));
        }
    }

    final void a(int param0, int param1, int param2, byte param3, gm param4, int param5) {
        re var7 = null;
        gm var8 = null;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var9 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var7 = new re(this.field_y);
              if (param3 > 109) {
                break L1;
              } else {
                this.field_y = (ei) null;
                break L1;
              }
            }
            var8 = (gm) ((Object) var7.a((byte) 110));
            L2: while (true) {
              L3: {
                if (var8 == null) {
                  break L3;
                } else {
                  if (!var8.e(17)) {
                    break L3;
                  } else {
                    var8.a(this.field_k + param0, this.field_w + param1, param2, (byte) 116, param4, param5);
                    var8 = (gm) ((Object) var7.b(true));
                    continue L2;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var7_ref);

            stackIn_10_1 = new StringBuilder().append("hn.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
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
          throw rb.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param5 + ')');
        }
    }

    final StringBuilder a(StringBuilder param0, byte param1, Hashtable param2, int param3) {
        RuntimeException var5 = null;
        gm var6 = null;
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
              if (param1 == 117) {
                break L1;
              } else {
                var6 = (gm) null;
                this.a(-99, -92, -99, -25, -38, (gm) null, (byte) 51);
                break L1;
              }
            }
            L2: {
              if (this.a(-31866, param0, param2, param3)) {
                this.a(param0, param3, true, param2);
                this.a(param0, param3, param2, (byte) 114);
                break L2;
              } else {
                break L2;
              }
            }
            stackIn_6_0 = (StringBuilder) (param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("hn.O(");

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


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw rb.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    final boolean b(gm param0, int param1) {
        RuntimeException var3 = null;
        gm var4 = null;
        re var5 = null;
        gm var6 = null;
        int var7 = 0;
        re var8 = null;
        int stackIn_4_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Torquing.field_u;
        try {
          L0: {
            if (this.field_y.e(-93)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var8 = new re(this.field_y);
                var4 = (gm) ((Object) var8.a((byte) 84));
                if (param1 == -9928) {
                  break L1;
                } else {
                  field_z = 67;
                  break L1;
                }
              }
              L2: while (true) {
                if (var4 == null) {
                  stackIn_18_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    if (!var4.g(2)) {
                      break L3;
                    } else {
                      var5 = new re(this.field_y);
                      var5.a(param1 + 23699, var4);
                      var6 = (gm) ((Object) var5.b(true));
                      L4: while (true) {
                        if (var6 == null) {
                          break L3;
                        } else {
                          if (var6.a(param0, false)) {
                            stackIn_14_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            var6 = (gm) ((Object) var5.b(true));
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                  var4 = (gm) ((Object) var8.b(true));
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var3);

            stackIn_21_1 = new StringBuilder().append("hn.EB(");

            if (param0 == null) {
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
          throw rb.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0 != 0;
          } else {
            return stackIn_18_0 != 0;
          }
        }
    }

    final String b(int param0) {
        re var2;
        gm var3;
        String var4;
        int var5;
        L0: {
          var5 = Torquing.field_u;
          var2 = new re(this.field_y);
          var3 = (gm) ((Object) var2.a((byte) 63));
          if (param0 == 0) {
            break L0;
          } else {
            field_A = (String) null;
            break L0;
          }
        }
        L1: while (true) {
          if (var3 != null) {
            var4 = var3.b(0);
            if (var4 != null) {
              return var4;
            } else {
              var3 = (gm) ((Object) var2.b(true));
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final boolean a(byte param0, gm param1) {
        RuntimeException var3 = null;
        gm var4 = null;
        int var5 = 0;
        re var6 = null;
        gm var7 = null;
        int var8 = 0;
        re var9 = null;
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
        var8 = Torquing.field_u;
        try {
          L0: {
            if (this.field_y.e(-102)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var9 = new re(this.field_y);
              var5 = -124 / ((param0 - -40) / 51);
              var4 = (gm) ((Object) var9.a(17514));
              L1: while (true) {
                if (var4 == null) {
                  stackIn_17_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L2: {
                    if (var4.g(2)) {
                      var6 = new re(this.field_y);
                      var6.a(var4, -27392);
                      var7 = (gm) ((Object) var6.a(true));
                      L3: while (true) {
                        if (var7 == null) {
                          break L2;
                        } else {
                          if (!var7.a(param1, false)) {
                            var7 = (gm) ((Object) var6.a(true));
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
                  var4 = (gm) ((Object) var9.a(true));
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3);

            stackIn_20_1 = new StringBuilder().append("hn.DB(").append(param0).append(',');

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
          throw rb.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
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

    final int d(byte param0) {
        int var5 = 0;
        int var6 = Torquing.field_u;
        int var2 = 0;
        re var3 = new re(this.field_y);
        if (param0 != 28) {
            return -77;
        }
        gm var4 = (gm) ((Object) var3.a((byte) 126));
        while (var4 != null) {
            var5 = var4.d((byte) 28);
            if (!(var5 <= var2)) {
                var2 = var5;
            }
            var4 = (gm) ((Object) var3.b(true));
        }
        return var2;
    }

    void a(int param0, gm param1, int param2, int param3) {
        re var5 = null;
        int var6 = 0;
        gm var7 = null;
        int var8 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = Torquing.field_u;
        try {
          L0: {
            super.a(-123, param1, param2, param3);
            var6 = -74 % ((param0 - -28) / 43);
            var5 = new re(this.field_y);
            var7 = (gm) ((Object) var5.a((byte) 29));
            L1: while (true) {
              L2: {
                if (var7 == null) {
                  break L2;
                } else {
                  if (!var7.e(17)) {
                    break L2;
                  } else {
                    var7.a(113, param1, this.field_k + param2, this.field_w + param3);
                    var7 = (gm) ((Object) var5.b(true));
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
            var5_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5_ref);

            stackIn_8_1 = new StringBuilder().append("hn.P(").append(param0).append(',');

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
          throw rb.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void c(byte param0) {
        int var4 = Torquing.field_u;
        re var2 = new re(this.field_y);
        if (param0 < 89) {
            this.field_y = (ei) null;
        }
        gm var3 = (gm) ((Object) var2.a((byte) 84));
        while (var3 != null) {
            var3.c((byte) 92);
            var3 = (gm) ((Object) var2.b(true));
        }
    }

    final boolean g(int param0) {
        if (param0 != 2) {
            this.b(57);
        }
        return this.a(0) != null ? true : false;
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        super.a((byte) 6, param1, param2, param3, param4);
        int var6 = -94 % ((param0 - 66) / 57);
        this.a(true);
    }

    hn(int param0, int param1, int param2, int param3, el param4) {
        super(param0, param1, param2, param3, param4, (ca) null);
        this.field_y = new ei();
    }

    gm a(int param0) {
        int var4 = Torquing.field_u;
        re var2 = new re(this.field_y);
        gm var3 = (gm) ((Object) var2.a((byte) 49));
        while (var3 != null) {
            if (!(!var3.g(2))) {
                return var3;
            }
            var3 = (gm) ((Object) var2.b(true));
        }
        if (param0 == 0) {
            return null;
        }
        this.b(19);
        return null;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, gm param5, byte param6) {
        re var8 = null;
        RuntimeException var8_ref = null;
        gm var9 = null;
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
        var10 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var8 = new re(this.field_y);
              if (param6 > 5) {
                break L1;
              } else {
                hn.f((byte) 79);
                break L1;
              }
            }
            var9 = (gm) ((Object) var8.a((byte) 122));
            L2: while (true) {
              L3: {
                if (var9 == null) {
                  break L3;
                } else {
                  if (!var9.e(17)) {
                    break L3;
                  } else {
                    if (var9.a(param0, param1 + this.field_w, this.field_k + param2, param3, param4, param5, (byte) 58)) {
                      stackIn_9_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var9 = (gm) ((Object) var8.b(true));
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

            stackIn_15_1 = new StringBuilder().append("hn.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
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
          throw rb.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    final boolean a(gm param0, boolean param1) {
        re var3 = null;
        RuntimeException var3_ref = null;
        gm var4 = null;
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
        var5 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var3 = new re(this.field_y);
              if (!param1) {
                break L1;
              } else {
                field_A = (String) null;
                break L1;
              }
            }
            var4 = (gm) ((Object) var3.a((byte) 83));
            L2: while (true) {
              if (var4 == null) {
                stackIn_10_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!var4.a(param0, false)) {
                  var4 = (gm) ((Object) var3.b(true));
                  continue L2;
                } else {
                  stackIn_7_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("hn.JA(");

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
          throw rb.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    public static void f(byte param0) {
        if (param0 != 2) {
            String var2 = (String) null;
            hn.a((String) null, (byte) -33);
        }
        field_A = null;
    }

    boolean a(int param0, gm param1, char param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        re var6 = null;
        int var7 = 0;
        int var8 = 0;
        gm var9 = null;
        int stackIn_7_0 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Torquing.field_u;
        try {
          L0: {
            var5_int = -43 % ((param3 - -33) / 57);
            var6 = new re(this.field_y);
            var9 = (gm) ((Object) var6.a((byte) 125));
            L1: while (true) {
              L2: {
                if (var9 == null) {
                  break L2;
                } else {
                  if (!var9.e(17)) {
                    break L2;
                  } else {
                    L3: {
                      if (!var9.g(2)) {
                        break L3;
                      } else {
                        if (!var9.a(param0, param1, param2, 41)) {
                          break L3;
                        } else {
                          stackIn_7_0 = 1;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      }
                    }
                    var9 = (gm) ((Object) var6.b(true));
                    continue L1;
                  }
                }
              }
              var7 = param0;
              if (-81 != (var7 ^ -1)) {
                stackIn_15_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                L4: {
                  if (i.field_P[81]) {
                    stackIn_13_0 = this.a((byte) -125, param1);
                    break L4;
                  } else {
                    stackIn_13_0 = this.b(param1, -9928);
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
            stackIn_18_0 = (RuntimeException) (var5);

            stackIn_18_1 = new StringBuilder().append("hn.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0;
          } else {
            return stackIn_15_0 != 0;
          }
        }
    }

    static {
        field_A = "Loading sound effects";
    }
}
