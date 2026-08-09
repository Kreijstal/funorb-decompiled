/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dn extends h {
    static mh field_K;
    private int field_H;
    static String field_J;
    private int field_O;
    private int field_G;
    private int field_I;
    static mh field_N;
    private boolean field_L;
    private boolean field_M;

    final boolean a(oc param0, int param1, int param2, int param3, int param4, int param5, int param6) {
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
                if (this.field_M) {
                  stackIn_11_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (!this.a(param5, param3, param2, param6 ^ 3, param1)) {
              stackIn_9_0 = var8_int;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.field_n = param4;
              if (1 != param4) {
                stackIn_7_0 = 1;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                this.field_H = -param3 + (-this.field_w + param5);
                gd.field_c = (dn) (this);
                this.field_G = -param2 + -this.field_o + param1;
                return true;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var8);

            stackIn_14_1 = new StringBuilder().append("dn.MA(");

            if (param0 == null) {
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
          throw qb.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
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

    final static void a(int param0, String param1, ml param2, int param3, dh param4) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = 0;
              var6 = -1;
              if (param0 == 25293) {
                break L1;
              } else {
                field_N = (mh) null;
                break L1;
              }
            }
            var7 = 1;
            L2: while (true) {
              if (var7 >= param1.length()) {
                break L0;
              } else {
                L3: {
                  var8 = param1.charAt(var7);
                  if (60 != var8) {
                    break L3;
                  } else {
                    var6 = param2.field_g[0] + (var5_int >> 1459398344) + param4.c(param1.substring(0, var7));
                    break L3;
                  }
                }
                L4: {
                  if (-1 != var6) {
                    param2.field_g[var7] = var6;
                    break L4;
                  } else {
                    L5: {
                      if (32 == var8) {
                        var5_int = var5_int + param3;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    param2.field_g[var7] = (var5_int >> -345125144) - (-param2.field_g[0] - param4.c(param1.substring(0, var7 + 1))) - param4.a((char) var8);
                    break L4;
                  }
                }
                L6: {
                  if (var8 == 62) {
                    var6 = -1;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                var7++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var5);

            stackIn_20_1 = new StringBuilder().append("dn.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L7;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

            if (param2 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L8;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L9;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L9;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_21_0), stackIn_27_2 + ')');
        }
    }

    final void a(byte param0) {
        super.a((byte) -39);
        this.field_E.a(this.field_s, 0, 0, (byte) -119, this.field_t);
        if (param0 > -7) {
            dn.g(1);
        }
        this.field_I = this.field_o;
        this.field_O = this.field_w;
    }

    private dn(int param0, int param1, int param2, int param3, ub param4, uh param5, oc param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_O = 2147483647;
        this.field_I = 2147483647;
        try {
            this.field_L = param7 ? true : false;
            this.field_E = param6;
            this.field_M = param8 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "dn.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void a(oc param0, byte param1, int param2, int param3) {
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    if (!(this.field_E instanceof d)) {
                      break L4;
                    } else {
                      if (!((d) ((Object) this.field_E)).field_J) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (1 == this.field_n) {
                    L5: {
                      var5_int = pq.field_k - this.field_G - param2;
                      var6 = po.field_a + (-this.field_H - param3);
                      if (this.field_o != var5_int) {
                        break L5;
                      } else {
                        if (var6 != this.field_w) {
                          break L5;
                        } else {
                          super.a(param0, param1, param2, param3);
                          break L1;
                        }
                      }
                    }
                    this.field_w = var6;
                    this.field_o = var5_int;
                    if (this.field_i instanceof li) {
                      ((li) ((Object) this.field_i)).a((byte) -68, param3, param2, (dn) (this));
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    break L3;
                  }
                }
                if (this.field_L) {
                  L6: {
                    if (this.field_o != this.field_I) {
                      L7: {
                        var5_int = this.field_I - this.field_o;
                        stackIn_11_0 = this;

                        stackIn_11_1 = this.field_o;

                        if (Math.abs(var5_int) <= 2) {
                          stackIn_13_0 = this;

                          if (-1 <= (var5_int ^ -1)) {
                            stackIn_14_0 = this;
                            stackIn_14_1 = stackIn_11_1;
                            stackIn_14_2 = -1;
                            break L7;
                          } else {
                            stackIn_14_0 = this;
                            stackIn_14_1 = stackIn_11_1;
                            stackIn_14_2 = 1;
                            break L7;
                          }
                        } else {
                          stackIn_14_0 = this;
                          stackIn_14_1 = stackIn_11_1;
                          stackIn_14_2 = var5_int >> -1993788767;
                          break L7;
                        }
                      }
                      ((dn) (this)).field_o = stackIn_14_1 + stackIn_14_2;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  if (this.field_O != this.field_w) {
                    L8: {
                      var5_int = this.field_O - this.field_w;
                      stackIn_19_0 = this;

                      stackIn_19_1 = this.field_w;

                      if (2 >= Math.abs(var5_int)) {
                        stackIn_21_0 = this;

                        if ((var5_int ^ -1) >= -1) {
                          stackIn_22_0 = this;
                          stackIn_22_1 = stackIn_19_1;
                          stackIn_22_2 = -1;
                          break L8;
                        } else {
                          stackIn_22_0 = this;
                          stackIn_22_1 = stackIn_19_1;
                          stackIn_22_2 = 1;
                          break L8;
                        }
                      } else {
                        stackIn_22_0 = this;
                        stackIn_22_1 = stackIn_19_1;
                        stackIn_22_2 = var5_int >> 405685345;
                        break L8;
                      }
                    }
                    ((dn) (this)).field_w = stackIn_22_1 + stackIn_22_2;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              super.a(param0, param1, param2, param3);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_33_0 = (RuntimeException) (var5);

            stackIn_33_1 = new StringBuilder().append("dn.WA(");

            if (param0 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L9;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L9;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void a(int param0) {
        field_J = null;
        if (param0 != 1) {
            dn.g(-43);
        }
        field_N = null;
        field_K = null;
    }

    final static um g(int param0) {
        if (param0 != -23009) {
            field_J = (String) null;
        }
        if (ad.field_e == null) {
            ad.field_e = new um(og.field_Yb, 20, 0, 0, 0, 11579568, -1, 0, 0, og.field_Yb.field_F, -1, 2147483647, true);
        }
        return ad.field_e;
    }

    final void a(int param0, int param1, int param2, oc param3, int param4, int param5) {
        try {
            super.a(param0, param1, param2, param3, param4, param5);
            this.field_n = 0;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "dn.GA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void b(int param0, int param1, int param2) {
        int var3 = -51 / ((-23 - param1) / 62);
        pi var4 = k.field_h;
        var4.e(-13413, param2);
        var4.a(-100, 3);
        var4.a(-15, 10);
        var4.b((byte) 122, param0);
    }

    final StringBuilder a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        StringBuilder discarded$64 = null;
        StringBuilder discarded$65 = null;
        RuntimeException var5 = null;
        StringBuilder var6 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.a(param3, 1595637992, param0, param1)) {
                break L1;
              } else {
                this.a(param1, param0, 0, param3);
                this.a(param3, true, param1, param0);
                discarded$64 = param3.append(" revert=").append(this.field_L);
                if ((this.field_I ^ -1) == -2147483648) {
                  break L1;
                } else {
                  if (-2147483648 != (this.field_O ^ -1)) {
                    discarded$65 = param3.append(" to ").append(this.field_I).append(',').append(this.field_O);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (param2 == 24) {
                break L2;
              } else {
                var6 = (StringBuilder) null;
                this.a(-94, (Hashtable) null, 17, (StringBuilder) null);
                break L2;
              }
            }
            stackIn_8_0 = (StringBuilder) (param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("dn.UA(").append(param0).append(',');

            if (param1 == null) {
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


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw qb.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ')');
        }
        return stackIn_8_0;
    }

    static {
        field_J = "<%0> is already on your ignore list.";
    }
}
