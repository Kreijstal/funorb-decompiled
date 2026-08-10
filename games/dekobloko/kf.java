/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class kf extends ce implements ra {
    static int field_M;
    static String field_N;
    static qc field_I;
    static String field_R;
    static ud field_P;
    static w field_Q;
    static int field_O;
    static int field_L;
    vj field_H;
    static ke field_G;
    static String field_J;
    static int field_K;

    final boolean a(boolean param0) {
        if (!param0) {
            return false;
        }
        return null != this.e((byte) -74) ? true : false;
    }

    void a(ce param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        rd var5 = null;
        ce var6 = null;
        int var7 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 > 38) {
                break L1;
              } else {
                this.a(false);
                break L1;
              }
            }
            super.a(param0, 68, param2, param3);
            var5 = new rd(this.field_H);
            var6 = (ce) ((Object) var5.a((byte) 71));
            L2: while (true) {
              L3: {
                if (var6 == null) {
                  break L3;
                } else {
                  if (!var6.a((byte) 38)) {
                    break L3;
                  } else {
                    var6.a(param0, 47, this.field_D + param2, param3 - -this.field_u);
                    var6 = (ce) ((Object) var5.a(-62));
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
            runtimeException = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (runtimeException);

            stackIn_10_1 = new StringBuilder().append("kf.A(");

            if (param0 == null) {
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
          throw dh.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void b(ce param0, byte param1) {
        try {
            if (param1 != -55) {
                ce var4 = (ce) null;
                this.a(false, (ce) null);
            }
            this.field_H.a(param0, 2777);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "kf.KC(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    boolean a(int param0, int param1, ce param2, char param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ce var9 = null;
        rd var10 = null;
        int stackIn_8_0 = 0;
        boolean stackIn_15_0 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = client.field_A ? 1 : 0;
        try {
          L0: {
            var10 = new rd(this.field_H);
            var6 = 18 % ((-22 - param0) / 49);
            var9 = (ce) ((Object) var10.a((byte) 71));
            L1: while (true) {
              L2: {
                if (var9 == null) {
                  break L2;
                } else {
                  if (!var9.a((byte) 124)) {
                    break L2;
                  } else {
                    L3: {
                      if (!var9.a(true)) {
                        break L3;
                      } else {
                        if (var9.a(-79, param1, param2, param3)) {
                          stackIn_8_0 = 1;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var9 = (ce) ((Object) var10.a(-78));
                    continue L1;
                  }
                }
              }
              var7 = param1;
              if (-81 == (var7 ^ -1)) {
                L4: {
                  if (!bj.field_d[81]) {
                    stackIn_15_0 = this.a(32, param2);
                    break L4;
                  } else {
                    stackIn_15_0 = this.a(param2, (byte) -120);
                    break L4;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var5);

            stackIn_18_1 = new StringBuilder().append("kf.QA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw dh.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          return stackIn_15_0;
        }
    }

    final void a(int param0, int param1, int param2, ce param3, int param4, int param5) {
        rd var7 = null;
        ce var8 = null;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var9 = client.field_A ? 1 : 0;
        try {
          L0: {
            var7 = new rd(this.field_H);
            var8 = (ce) ((Object) var7.a((byte) 71));
            L1: while (true) {
              L2: {
                if (var8 == null) {
                  break L2;
                } else {
                  if (!var8.a((byte) 119)) {
                    break L2;
                  } else {
                    var8.a(param0, param1 ^ 0, this.field_u + param2, param3, this.field_D + param4, param5);
                    var8 = (ce) ((Object) var7.a(-126));
                    continue L1;
                  }
                }
              }
              L3: {
                if (param1 == 64) {
                  break L3;
                } else {
                  field_J = (String) null;
                  break L3;
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

            stackIn_10_1 = new StringBuilder().append("kf.IB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw dh.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static String a(CharSequence param0, byte param1) {
        StringBuilder discarded$0 = null;
        Object stackIn_3_0 = null;
        String stackIn_19_0 = null;
        Object stackIn_28_0 = null;
        String stackIn_30_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (param0 != null) {
              var2_int = 0;
              var3 = param0.length();
              L1: while (true) {
                L2: {
                  if (var3 <= var2_int) {
                    break L2;
                  } else {
                    if (!ug.a(param0.charAt(var2_int), 32)) {
                      break L2;
                    } else {
                      var2_int++;
                      continue L1;
                    }
                  }
                }
                L3: while (true) {
                  L4: {
                    if (var2_int >= var3) {
                      break L4;
                    } else {
                      if (!ug.a(param0.charAt(var3 + -1), 32)) {
                        break L4;
                      } else {
                        var3--;
                        continue L3;
                      }
                    }
                  }
                  var4 = -var2_int + var3;
                  if ((var4 ^ -1) <= -2) {
                    if (12 >= var4) {
                      var5 = new StringBuilder(var4);
                      if (param1 == 2) {
                        var6 = var2_int;
                        L5: while (true) {
                          if (var3 <= var6) {
                            if (0 != var5.length()) {
                              stackIn_30_0 = var5.toString();
                              decompiledRegionSelector0 = 3;
                              break L0;
                            } else {
                              stackIn_28_0 = null;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            }
                          } else {
                            L6: {
                              var7 = param0.charAt(var6);
                              if (!oe.a((char) var7, param1 ^ -6239)) {
                                break L6;
                              } else {
                                var8 = un.a(228, (char) var7);
                                if (var8 == 0) {
                                  break L6;
                                } else {
                                  discarded$0 = var5.append((char) var8);
                                  break L6;
                                }
                              }
                            }
                            var6++;
                            continue L5;
                          }
                        }
                      } else {
                        stackIn_19_0 = (String) null;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_33_0 = (RuntimeException) (var2);

            stackIn_33_1 = new StringBuilder().append("kf.MC(");

            if (param0 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L7;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L7;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (String) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_19_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (String) ((Object) stackIn_28_0);
            } else {
              return stackIn_30_0;
            }
          }
        }
    }

    final int d(int param0) {
        int var5 = 0;
        int var6 = client.field_A ? 1 : 0;
        int var2 = 0;
        rd var3 = new rd(this.field_H);
        ce var4 = (ce) ((Object) var3.a((byte) 71));
        while (var4 != null) {
            var5 = var4.d(-31);
            if (!(var2 >= var5)) {
                var2 = var5;
            }
            var4 = (ce) ((Object) var3.a(-61));
        }
        var5 = -18 / ((36 - param0) / 51);
        return var2;
    }

    String c(byte param0) {
        rd var2;
        ce var3;
        String var4;
        int var5;
        ce var6;
        L0: {
          var5 = client.field_A ? 1 : 0;
          var2 = new rd(this.field_H);
          var3 = (ce) ((Object) var2.a((byte) 71));
          if (param0 == 113) {
            break L0;
          } else {
            var6 = (ce) null;
            this.a(59, 12, 76, (ce) null, -65, -4, true);
            break L0;
          }
        }
        L1: while (true) {
          if (var3 != null) {
            var4 = var3.c((byte) 113);
            if (var4 == null) {
              var3 = (ce) ((Object) var2.a(-47));
              continue L1;
            } else {
              return var4;
            }
          } else {
            return null;
          }
        }
    }

    private final void g(int param0) {
        int var4 = client.field_A ? 1 : 0;
        if (param0 != 0) {
            field_L = -109;
        }
        rd var2 = new rd(this.field_H);
        ce var3 = (ce) ((Object) var2.a((byte) 71));
        while (var3 != null) {
            var3.f(121);
            var3 = (ce) ((Object) var2.a(param0 + -57));
        }
    }

    void b(int param0, int param1, int param2, int param3, int param4) {
        if (param4 != -16555) {
            ce var7 = (ce) null;
            this.a((ce) null, (byte) 126);
        }
        super.b(param0, param1, param2, param3, param4 + 0);
        this.g(0);
    }

    final boolean a(ce param0, byte param1) {
        RuntimeException var3 = null;
        ce var4 = null;
        rd var5 = null;
        ce var6 = null;
        int var7 = 0;
        rd var8 = null;
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
        var7 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (!this.field_H.b(-105)) {
              var8 = new rd(this.field_H);
              var4 = (ce) ((Object) var8.a(true));
              L1: while (true) {
                if (var4 == null) {
                  if (param1 < -16) {
                    stackIn_18_0 = 0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    field_Q = (w) null;
                    return false;
                  }
                } else {
                  L2: {
                    if (!var4.a(true)) {
                      break L2;
                    } else {
                      var5 = new rd(this.field_H);
                      var5.a(var4, (byte) -88);
                      var6 = (ce) ((Object) var5.d(2078965185));
                      L3: while (true) {
                        if (var6 == null) {
                          break L2;
                        } else {
                          if (var6.a(false, param0)) {
                            stackIn_12_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            var6 = (ce) ((Object) var5.d(2078965185));
                            continue L3;
                          }
                        }
                      }
                    }
                  }
                  var4 = (ce) ((Object) var8.d(2078965185));
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

            stackIn_21_1 = new StringBuilder().append("kf.QC(");

            if (param0 == null) {
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
          throw dh.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
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

    final void d(byte param0) {
        int var4 = client.field_A ? 1 : 0;
        rd var2 = new rd(this.field_H);
        if (param0 != -95) {
            this.c((byte) 50);
        }
        ce var3 = (ce) ((Object) var2.a((byte) 71));
        while (var3 != null) {
            var3.d((byte) -95);
            var3 = (ce) ((Object) var2.a(-98));
        }
    }

    final boolean a(int param0, int param1, ce param2, int param3, int param4, int param5, byte param6) {
        rd var8 = null;
        RuntimeException var8_ref = null;
        ce var9 = null;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = client.field_A ? 1 : 0;
        try {
          L0: {
            var8 = new rd(this.field_H);
            var9 = (ce) ((Object) var8.a((byte) 71));
            if (param6 == -55) {
              L1: while (true) {
                L2: {
                  if (var9 == null) {
                    break L2;
                  } else {
                    if (!var9.a((byte) 120)) {
                      break L2;
                    } else {
                      if (var9.a(param0, param1, param2, param3, this.field_D + param4, this.field_u + param5, (byte) -55)) {
                        stackIn_9_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        var9 = (ce) ((Object) var8.a(-113));
                        continue L1;
                      }
                    }
                  }
                }
                stackIn_12_0 = 0;
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
          L3: {
            var8_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var8_ref);

            stackIn_15_1 = new StringBuilder().append("kf.LB(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            return stackIn_12_0 != 0;
          }
        }
    }

    kf(int param0, int param1, int param2, int param3, gl param4) {
        super(param0, param1, param2, param3, param4, (kg) null);
        this.field_H = new vj();
    }

    final boolean a(int param0, int param1, int param2, ce param3, int param4, int param5, boolean param6) {
        RuntimeException var8 = null;
        ce var9 = null;
        int var10 = 0;
        ce var11 = null;
        rd var12 = null;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var12 = new rd(this.field_H);
              if (!param6) {
                break L1;
              } else {
                var11 = (ce) null;
                this.a(true, (ce) null);
                break L1;
              }
            }
            var9 = (ce) ((Object) var12.a((byte) 71));
            L2: while (true) {
              L3: {
                if (var9 == null) {
                  break L3;
                } else {
                  if (!var9.a((byte) 67)) {
                    break L3;
                  } else {
                    L4: {
                      if (!var9.a(true)) {
                        break L4;
                      } else {
                        if (var9.a(param0, param1, param2, param3, param4, param5, param6)) {
                          stackIn_10_0 = 1;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var9 = (ce) ((Object) var12.a(-128));
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

            stackIn_16_1 = new StringBuilder().append("kf.FC(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw dh.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0 != 0;
        } else {
          return stackIn_13_0 != 0;
        }
    }

    private final void a(int param0, int param1, StringBuilder param2, Hashtable param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        ce var6 = null;
        int var7 = 0;
        int var8 = 0;
        StringBuilder var9 = null;
        rd var10 = null;
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
        var8 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                var9 = (StringBuilder) null;
                this.a((Hashtable) null, -83, (StringBuilder) null, true);
                break L1;
              }
            }
            var10 = new rd(this.field_H);
            var6 = (ce) ((Object) var10.a((byte) 71));
            L2: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                discarded$3 = param2.append('\n');
                var7 = 0;
                L3: while (true) {
                  if (var7 > param0) {
                    var6.a(param3, 1 + param0, param2, true);
                    var6 = (ce) ((Object) var10.a(-113));
                    continue L2;
                  } else {
                    discarded$4 = param2.append(' ');
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

            stackIn_12_1 = new StringBuilder().append("kf.OC(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

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
          throw dh.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = client.field_A ? 1 : 0;
        if (param2 == 0 && this.field_p != null) {
            this.field_p.a(true, param0, param3, (byte) -108, (ce) (this));
        }
        rd var5 = new rd(this.field_H);
        ce var6 = (ce) ((Object) var5.a(true));
        while (var6 != null) {
            var6.a(param0 + this.field_u, -124, param2, param3 - -this.field_D);
            var6 = (ce) ((Object) var5.d(2078965185));
        }
        if (param1 > -103) {
            this.a(59, -115, 20, 76);
        }
    }

    final StringBuilder a(Hashtable param0, int param1, StringBuilder param2, boolean param3) {
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
              if (!this.a(0, param1, param0, param2)) {
                break L1;
              } else {
                this.a((byte) 72, param2, param0, param1);
                this.a(param1, 0, param2, param0);
                break L1;
              }
            }
            L2: {
              if (param3) {
                break L2;
              } else {
                field_P = (ud) null;
                break L2;
              }
            }
            stackIn_5_0 = (StringBuilder) (param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("kf.MB(");

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


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw dh.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ',' + param3 + ')');
        }
        return stackIn_5_0;
    }

    final boolean a(int param0, ce param1) {
        RuntimeException var3 = null;
        ce var4 = null;
        rd var5 = null;
        ce var6 = null;
        int var7 = 0;
        rd var8 = null;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (this.field_H.b(-15)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var8 = new rd(this.field_H);
              var4 = (ce) ((Object) var8.a((byte) 71));
              L1: while (true) {
                if (var4 == null) {
                  L2: {
                    if (param0 == 32) {
                      break L2;
                    } else {
                      kf.h(-42);
                      break L2;
                    }
                  }
                  stackIn_19_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    if (!var4.a(true)) {
                      break L3;
                    } else {
                      var5 = new rd(this.field_H);
                      var5.a(var4, false);
                      var6 = (ce) ((Object) var5.a(param0 ^ -24));
                      L4: while (true) {
                        if (var6 == null) {
                          break L3;
                        } else {
                          if (var6.a(false, param1)) {
                            stackIn_13_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            var6 = (ce) ((Object) var5.a(param0 + -119));
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                  var4 = (ce) ((Object) var8.a(-109));
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var3);

            stackIn_22_1 = new StringBuilder().append("kf.PC(").append(param0).append(',');

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
          throw dh.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            return stackIn_19_0 != 0;
          }
        }
    }

    public static void h(int param0) {
        if (param0 < 72) {
            kf.h(-51);
        }
        field_P = null;
        field_R = null;
        field_Q = null;
        field_I = null;
        field_J = null;
        field_N = null;
        field_G = null;
    }

    ce e(byte param0) {
        int var4 = client.field_A ? 1 : 0;
        rd var2 = new rd(this.field_H);
        ce var3 = (ce) ((Object) var2.a((byte) 71));
        while (var3 != null) {
            if (!(!var3.a(true))) {
                return var3;
            }
            var3 = (ce) ((Object) var2.a(-92));
        }
        if (param0 == -74) {
            return null;
        }
        field_P = (ud) null;
        return null;
    }

    final boolean a(boolean param0, ce param1) {
        rd var3 = null;
        RuntimeException var3_ref = null;
        ce var4 = null;
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
        var5 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_O = -99;
                break L1;
              }
            }
            var3 = new rd(this.field_H);
            var4 = (ce) ((Object) var3.a((byte) 71));
            L2: while (true) {
              if (var4 == null) {
                stackIn_10_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!var4.a(false, param1)) {
                  var4 = (ce) ((Object) var3.a(-69));
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

            stackIn_13_1 = new StringBuilder().append("kf.EC(").append(param0).append(',');

            if (param1 == null) {
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
          throw dh.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    static {
        field_R = "Offer draw";
        field_N = "Unable to connect to the data server. Please check any firewall you are using.";
        field_L = -1;
        field_J = "This is your RuneScape clan if you have one.";
    }
}
