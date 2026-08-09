/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class tj extends kf {
    static String field_y;
    static int field_C;
    private int field_E;
    private int field_x;
    private int field_z;
    static int field_w;
    private boolean field_D;
    private int field_A;
    private boolean field_B;
    static int field_G;

    private tj(int param0, int param1, int param2, int param3, de param4, qg param5, uj param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_E = 2147483647;
        this.field_z = 2147483647;
        try {
            this.field_B = param8 ? true : false;
            this.field_t = param6;
            this.field_D = param7 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "tj.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final boolean a(uj param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var8_int = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
              if (var8_int == 0) {
                break L1;
              } else {
                if (this.field_B) {
                  stackIn_11_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (!this.a(param3, param2, param1, param5, -12790)) {
              stackIn_9_0 = var8_int;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L2: {
                if (1 != param6) {
                  break L2;
                } else {
                  il.field_k = (tj) (this);
                  this.field_A = param5 - (this.field_s + param2);
                  this.field_x = param1 + -this.field_j + -param3;
                  break L2;
                }
              }
              this.field_l = param6;
              stackIn_7_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var8);

            stackIn_14_1 = new StringBuilder().append("tj.G(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            return stackIn_11_0 != 0;
          }
        }
    }

    final void a(int param0, int param1, int param2, uj param3, byte param4, int param5) {
        try {
            super.a(param0, param1, param2, param3, param4, param5);
            this.field_l = 0;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "tj.OA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static int a(int param0, int param1, re param2, vc param3) {
        int stackIn_7_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        CharSequence var9 = null;
        var8 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              if (param3 == null) {
                break L1;
              } else {
                if (null == param3.field_o) {
                  break L1;
                } else {
                  if (param2 == null) {
                    break L1;
                  } else {
                    if (param2.field_n == param3.field_i) {
                      var4_int = param2.field_o.length;
                      var5 = param3.field_o[param0].length / var4_int;
                      var6 = 0;
                      L2: while (true) {
                        if (var5 <= var6) {
                          L3: {
                            if (param1 == -1) {
                              break L3;
                            } else {
                              var9 = (CharSequence) null;
                              tj.a((byte) -65, true, (CharSequence) null);
                              break L3;
                            }
                          }
                          stackIn_23_0 = -1;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          L4: {
                            if ((param2.field_k ^ -1L) != (param3.field_g[param0][var6] ^ -1L)) {
                              break L4;
                            } else {
                              if (mc.a(param3.field_n[param0][var6], 0)) {
                                var7 = 0;
                                L5: while (true) {
                                  if (var7 >= var4_int) {
                                    stackIn_18_0 = var6;
                                    decompiledRegionSelector0 = 1;
                                    break L0;
                                  } else {
                                    if (param2.field_o[var7] != param3.field_o[param0][var4_int * var6 + var7]) {
                                      break L4;
                                    } else {
                                      var7++;
                                      continue L5;
                                    }
                                  }
                                }
                              } else {
                                break L4;
                              }
                            }
                          }
                          var6++;
                          continue L2;
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            stackIn_7_0 = -1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var4);

            stackIn_26_1 = new StringBuilder().append("tj.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L6;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');

            if (param3 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L7;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L7;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_27_0), stackIn_30_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_18_0;
          } else {
            return stackIn_23_0;
          }
        }
    }

    final static void a(byte param0, dg param1, int param2) {
        ia var5 = null;
        int var4 = 0;
        try {
            var5 = d.field_b;
            var5.d((byte) 100, param2);
            var5.field_g = var5.field_g + 1;
            var4 = var5.field_g;
            var5.a(1, -70);
            var5.a(param1.field_k, -57);
            var5.d(5918, param1.field_f);
            var5.c((byte) -97, param1.field_h);
            if (param0 != 69) {
                field_G = 121;
            }
            var5.c((byte) -109, param1.field_m);
            var5.c((byte) -89, param1.field_g);
            var5.c((byte) -88, param1.field_i);
            var5.b((byte) -128, var4);
            var5.b(var5.field_g - var4, 31700);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "tj.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, uj param2, int param3) {
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (!(this.field_t instanceof dk)) {
                    break L3;
                  } else {
                    if (!((dk) ((Object) this.field_t)).field_u) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (-2 != (this.field_l ^ -1)) {
                  break L2;
                } else {
                  L4: {
                    var5_int = -this.field_A + (pe.field_d - param1);
                    var6 = -param3 + (la.field_c + -this.field_x);
                    if (var5_int != this.field_s) {
                      break L4;
                    } else {
                      if (var6 == this.field_j) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  this.field_j = var6;
                  this.field_s = var5_int;
                  if (!(this.field_g instanceof wb)) {
                    break L1;
                  } else {
                    ((wb) ((Object) this.field_g)).a((tj) (this), (byte) 117, param1, param3);
                    break L1;
                  }
                }
              }
              if (!this.field_D) {
                break L1;
              } else {
                L5: {
                  if (this.field_s != this.field_z) {
                    L6: {
                      var5_int = -this.field_s + this.field_z;
                      stackIn_17_0 = this;

                      stackIn_17_1 = this.field_s;

                      if (2 < Math.abs(var5_int)) {
                        stackIn_18_0 = this;
                        stackIn_18_1 = stackIn_17_1;
                        stackIn_18_2 = var5_int >> 1914981857;
                        break L6;
                      } else {
                        stackIn_16_0 = this;

                        if ((var5_int ^ -1) < -1) {
                          stackIn_18_0 = this;
                          stackIn_18_1 = stackIn_17_1;
                          stackIn_18_2 = 1;
                          break L6;
                        } else {
                          stackIn_18_0 = this;
                          stackIn_18_1 = stackIn_17_1;
                          stackIn_18_2 = -1;
                          break L6;
                        }
                      }
                    }
                    ((tj) (this)).field_s = stackIn_18_1 + stackIn_18_2;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                if (this.field_E != this.field_j) {
                  L7: {
                    var5_int = -this.field_j + this.field_E;
                    stackIn_23_0 = this;

                    stackIn_23_1 = this.field_j;

                    if ((Math.abs(var5_int) ^ -1) >= -3) {
                      stackIn_25_0 = this;

                      if ((var5_int ^ -1) < -1) {
                        stackIn_26_0 = this;
                        stackIn_26_1 = stackIn_23_1;
                        stackIn_26_2 = 1;
                        break L7;
                      } else {
                        stackIn_26_0 = this;
                        stackIn_26_1 = stackIn_23_1;
                        stackIn_26_2 = -1;
                        break L7;
                      }
                    } else {
                      stackIn_26_0 = this;
                      stackIn_26_1 = stackIn_23_1;
                      stackIn_26_2 = var5_int >> 1198063905;
                      break L7;
                    }
                  }
                  ((tj) (this)).field_j = stackIn_26_1 + stackIn_26_2;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            if (param0 >= 27) {
              super.a(98, param1, param2, param3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackIn_33_0 = (RuntimeException) (var5);

            stackIn_33_1 = new StringBuilder().append("tj.U(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L8;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L8;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static id[] h(int param0) {
        int var2 = 0;
        int var3 = StarCannon.field_A;
        id[] var1 = new id[bj.field_b];
        for (var2 = 0; var2 < bj.field_b; var2++) {
            var1[var2] = new id(td.field_m, gb.field_w, fc.field_d[var2], qd.field_H[var2], gg.field_d[var2], gh.field_C[var2], og.field_c[var2], of.field_g);
        }
        var2 = -67 / ((-49 - param0) / 58);
        rc.b((byte) 123);
        return var1;
    }

    public static void g(int param0) {
        field_y = null;
        if (param0 >= -113) {
            tj.g(104);
        }
    }

    final static boolean a(byte param0, boolean param1, CharSequence param2) {
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_35_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = StarCannon.field_A;
        try {
          L0: {
            if (param2 != null) {
              L1: {
                var3_int = param2.length();
                if (-2 < (var3_int ^ -1)) {
                  break L1;
                } else {
                  if (-13 > (var3_int ^ -1)) {
                    break L1;
                  } else {
                    L2: {
                      if (param0 <= -58) {
                        break L2;
                      } else {
                        field_C = 43;
                        break L2;
                      }
                    }
                    L3: {
                      var4 = ni.a(127, param2);
                      if (var4 == null) {
                        break L3;
                      } else {
                        if ((var4.length() ^ -1) > -2) {
                          break L3;
                        } else {
                          L4: {
                            if (dk.a((byte) -121, var4.charAt(0))) {
                              break L4;
                            } else {
                              if (dk.a((byte) -127, var4.charAt(var4.length() + -1))) {
                                break L4;
                              } else {
                                var5 = 0;
                                var6 = 0;
                                L5: while (true) {
                                  if (var6 >= param2.length()) {
                                    if (0 < var5) {
                                      stackIn_35_0 = 0;
                                      decompiledRegionSelector0 = 5;
                                      break L0;
                                    } else {
                                      return true;
                                    }
                                  } else {
                                    L6: {
                                      var7 = param2.charAt(var6);
                                      if (dk.a((byte) -122, (char) var7)) {
                                        var5++;
                                        break L6;
                                      } else {
                                        var5 = 0;
                                        break L6;
                                      }
                                    }
                                    L7: {
                                      if (var5 < 2) {
                                        break L7;
                                      } else {
                                        if (!param1) {
                                          stackIn_30_0 = 0;
                                          decompiledRegionSelector0 = 4;
                                          break L0;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                    var6++;
                                    continue L5;
                                  }
                                }
                              }
                            }
                          }
                          stackIn_20_0 = 0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      }
                    }
                    stackIn_15_0 = 0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              stackIn_8_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_38_0 = (RuntimeException) (var3);

            stackIn_38_1 = new StringBuilder().append("tj.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L8;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L8;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_20_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_30_0 != 0;
                } else {
                  return stackIn_35_0 != 0;
                }
              }
            }
          }
        }
    }

    final StringBuilder a(Hashtable param0, StringBuilder param1, byte param2, int param3) {
        StringBuilder discarded$64 = null;
        StringBuilder discarded$65 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        StringBuilder stackIn_8_0 = null;
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
        try {
          L0: {
            L1: {
              if (!this.a(param0, 0, param1, param3)) {
                break L1;
              } else {
                this.a(param0, param1, param3, 19103);
                this.a(param0, param3, -349, param1);
                discarded$64 = param1.append(" revert=").append(this.field_D);
                if (2147483647 == this.field_z) {
                  break L1;
                } else {
                  if ((this.field_E ^ -1) == -2147483648) {
                    break L1;
                  } else {
                    discarded$65 = param1.append(" to ").append(this.field_z).append(',').append(this.field_E);
                    break L1;
                  }
                }
              }
            }
            if (param2 == 39) {
              stackIn_8_0 = (StringBuilder) (param1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_6_0 = (StringBuilder) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("tj.SA(");

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
          L3: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_8_0;
        }
    }

    final void f(int param0) {
        super.f(-77);
        this.field_t.a(0, this.field_i, (byte) 122, this.field_f, 0);
        this.field_E = this.field_j;
        this.field_z = this.field_s;
        int var2 = 98 / ((47 - param0) / 52);
    }

    static {
        field_y = "Password: ";
    }
}
