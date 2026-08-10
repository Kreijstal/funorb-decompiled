/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class cj extends iq implements dq {
    nj field_C;
    static int field_D;

    boolean a(char param0, int param1, int param2, iq param3) {
        RuntimeException var5 = null;
        iq var6_ref_iq = null;
        int var6 = 0;
        int var7 = 0;
        vp var8 = null;
        int stackIn_10_0 = 0;
        boolean stackIn_17_0 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var8 = new vp(this.field_C);
              if (param1 == 13) {
                break L1;
              } else {
                this.field_C = (nj) null;
                break L1;
              }
            }
            var6_ref_iq = (iq) ((Object) var8.d(param1 + -9));
            L2: while (true) {
              L3: {
                if (var6_ref_iq == null) {
                  break L3;
                } else {
                  if (!var6_ref_iq.b(92)) {
                    break L3;
                  } else {
                    L4: {
                      if (!var6_ref_iq.f(102)) {
                        break L4;
                      } else {
                        if (var6_ref_iq.a(param0, param1 ^ 0, param2, param3)) {
                          stackIn_10_0 = 1;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var6_ref_iq = (iq) ((Object) var8.c(2));
                    continue L2;
                  }
                }
              }
              var6 = param2;
              if ((var6 ^ -1) == -81) {
                L5: {
                  if (!cr.field_eb[81]) {
                    stackIn_17_0 = this.b((byte) -89, param3);
                    break L5;
                  } else {
                    stackIn_17_0 = this.a(32345, param3);
                    break L5;
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
          L6: {
            var5 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var5);

            stackIn_20_1 = new StringBuilder().append("cj.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0 != 0;
        } else {
          return stackIn_17_0;
        }
    }

    final void d(byte param0) {
        int var4 = Vertigo2.field_L ? 1 : 0;
        vp var2 = new vp(this.field_C);
        if (param0 != 2) {
            field_D = 47;
        }
        iq var3 = (iq) ((Object) var2.d(param0 ^ 6));
        while (var3 != null) {
            var3.d((byte) 2);
            var3 = (iq) ((Object) var2.c(param0 + 0));
        }
    }

    String a(boolean param0) {
        vp var2;
        iq var3;
        String var4;
        int var5;
        L0: {
          var5 = Vertigo2.field_L ? 1 : 0;
          if (!param0) {
            break L0;
          } else {
            this.b(true);
            break L0;
          }
        }
        var2 = new vp(this.field_C);
        var3 = (iq) ((Object) var2.d(4));
        L1: while (true) {
          if (var3 != null) {
            var4 = var3.a(false);
            if (var4 != null) {
              return var4;
            } else {
              var3 = (iq) ((Object) var2.c(2));
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final boolean b(byte param0, iq param1) {
        RuntimeException var3 = null;
        iq var4 = null;
        vp var5 = null;
        iq var6 = null;
        int var7 = 0;
        vp var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (!this.field_C.a(false)) {
              var8 = new vp(this.field_C);
              var4 = (iq) ((Object) var8.d(4));
              L1: while (true) {
                if (var4 == null) {
                  if (param0 < -63) {
                    stackIn_17_0 = 0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    this.b(false);
                    return false;
                  }
                } else {
                  L2: {
                    if (!var4.f(34)) {
                      break L2;
                    } else {
                      var5 = new vp(this.field_C);
                      var5.a(-108, var4);
                      var6 = (iq) ((Object) var5.c(2));
                      L3: while (true) {
                        if (var6 == null) {
                          break L2;
                        } else {
                          if (!var6.a((byte) 116, param1)) {
                            var6 = (iq) ((Object) var5.c(2));
                            continue L3;
                          } else {
                            stackIn_11_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      }
                    }
                  }
                  var4 = (iq) ((Object) var8.c(2));
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
            stackIn_20_0 = (RuntimeException) (var3);

            stackIn_20_1 = new StringBuilder().append("cj.P(").append(param0).append(',');

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
          throw wn.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            return stackIn_17_0 != 0;
          }
        }
    }

    private final void h(int param0) {
        int var4 = Vertigo2.field_L ? 1 : 0;
        vp var2 = new vp(this.field_C);
        if (param0 != -641) {
            this.field_C = (nj) null;
        }
        iq var3 = (iq) ((Object) var2.d(4));
        while (var3 != null) {
            var3.g(param0 + 553);
            var3 = (iq) ((Object) var2.c(param0 + 643));
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, byte param5, iq param6) {
        vp var8 = null;
        RuntimeException var8_ref = null;
        iq var9 = null;
        int var10 = 0;
        int var11 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var8 = new vp(this.field_C);
            var9 = (iq) ((Object) var8.d(4));
            L1: while (true) {
              L2: {
                if (var9 == null) {
                  break L2;
                } else {
                  if (!var9.b(94)) {
                    break L2;
                  } else {
                    L3: {
                      if (!var9.f(61)) {
                        break L3;
                      } else {
                        if (var9.a(param0, param1, param2, param3, param4, (byte) -123, param6)) {
                          stackIn_8_0 = 1;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var9 = (iq) ((Object) var8.c(2));
                    continue L1;
                  }
                }
              }
              var10 = 39 % ((-87 - param5) / 35);
              stackIn_11_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var8_ref);

            stackIn_14_1 = new StringBuilder().append("cj.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
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
          throw wn.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    cj(int param0, int param1, int param2, int param3, ur param4) {
        super(param0, param1, param2, param3, param4, (uf) null);
        this.field_C = new nj();
    }

    final boolean f(int param0) {
        if (param0 < 3) {
            this.a(true, 15, -89, 98);
        }
        return null != this.b(true) ? true : false;
    }

    final int c(byte param0) {
        int var5 = 0;
        int var6 = Vertigo2.field_L ? 1 : 0;
        int var2 = 0;
        vp var3 = new vp(this.field_C);
        iq var4 = (iq) ((Object) var3.d(4));
        if (param0 > -97) {
            iq var7 = (iq) null;
            this.a((byte) 126, 47, 97, (iq) null);
        }
        while (var4 != null) {
            var5 = var4.c((byte) -121);
            if (var2 < var5) {
                var2 = var5;
            }
            var4 = (iq) ((Object) var3.c(2));
        }
        return var2;
    }

    final boolean a(int param0, int param1, int param2, iq param3, int param4, byte param5, int param6) {
        RuntimeException var8 = null;
        iq var9 = null;
        int var10 = 0;
        iq var11 = null;
        vp var12 = null;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param5 <= -107) {
                break L1;
              } else {
                var11 = (iq) null;
                this.a(77, -56, -46, (iq) null, 32, (byte) 26, 97);
                break L1;
              }
            }
            var12 = new vp(this.field_C);
            var9 = (iq) ((Object) var12.d(4));
            L2: while (true) {
              L3: {
                if (var9 == null) {
                  break L3;
                } else {
                  if (!var9.b(115)) {
                    break L3;
                  } else {
                    if (var9.a(param0, param1 - -this.field_o, param2 + this.field_t, param3, param4, (byte) -108, param6)) {
                      stackIn_9_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var9 = (iq) ((Object) var12.c(2));
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

            stackIn_15_1 = new StringBuilder().append("cj.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

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
          throw wn.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    void a(boolean param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.h(-641);
    }

    private final void a(int param0, boolean param1, StringBuilder param2, Hashtable param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        vp var5 = null;
        iq var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var5 = new vp(this.field_C);
            if (!param1) {
              var6 = (iq) ((Object) var5.d(4));
              L1: while (true) {
                if (var6 == null) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  discarded$3 = param2.append('\n');
                  var7 = 0;
                  L2: while (true) {
                    if (param0 < var7) {
                      var6.a(param3, 1 + param0, (byte) -79, param2);
                      var6 = (iq) ((Object) var5.c(2));
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
            stackIn_12_0 = (RuntimeException) (var5_ref);

            stackIn_12_1 = new StringBuilder().append("cj.U(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(iq param0, byte param1, int param2, int param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        vp var7 = null;
        iq var8 = null;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (param1 == 46) {
              var7 = new vp(this.field_C);
              var8 = (iq) ((Object) var7.d(4));
              L1: while (true) {
                L2: {
                  if (var8 == null) {
                    break L2;
                  } else {
                    if (!var8.b(125)) {
                      break L2;
                    } else {
                      var8.a(param0, (byte) 46, param2 - -this.field_o, this.field_t + param3, param4, param5);
                      var8 = (iq) ((Object) var7.c(param1 + -44));
                      continue L1;
                    }
                  }
                }
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
            runtimeException = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (runtimeException);

            stackIn_10_1 = new StringBuilder().append("cj.HA(");

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
          throw wn.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(int param0, iq param1) {
        RuntimeException var3 = null;
        iq var4 = null;
        vp var5 = null;
        iq var6 = null;
        int var7 = 0;
        vp var8 = null;
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
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (this.field_C.a(false)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var8 = new vp(this.field_C);
                if (param0 == 32345) {
                  break L1;
                } else {
                  this.field_C = (nj) null;
                  break L1;
                }
              }
              var4 = (iq) ((Object) var8.b(param0 + -32341));
              L2: while (true) {
                if (var4 == null) {
                  stackIn_18_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    if (!var4.f(85)) {
                      break L3;
                    } else {
                      var5 = new vp(this.field_C);
                      var5.a(var4, param0 + -32342);
                      var6 = (iq) ((Object) var5.a((byte) 76));
                      L4: while (true) {
                        if (var6 == null) {
                          break L3;
                        } else {
                          if (!var6.a((byte) 116, param1)) {
                            var6 = (iq) ((Object) var5.a((byte) 121));
                            continue L4;
                          } else {
                            stackIn_14_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      }
                    }
                  }
                  var4 = (iq) ((Object) var8.a((byte) 101));
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

            stackIn_21_1 = new StringBuilder().append("cj.S(").append(param0).append(',');

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
          throw wn.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
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

    final void c(byte param0, iq param1) {
        try {
            int var3_int = 36 / ((param0 - 35) / 38);
            this.field_C.a(param1, false);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "cj.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    iq b(boolean param0) {
        vp var2;
        iq var3;
        int var4;
        L0: {
          var4 = Vertigo2.field_L ? 1 : 0;
          if (param0) {
            break L0;
          } else {
            this.a(false);
            break L0;
          }
        }
        var2 = new vp(this.field_C);
        var3 = (iq) ((Object) var2.d(4));
        L1: while (true) {
          if (var3 != null) {
            if (var3.f(93)) {
              return var3;
            } else {
              var3 = (iq) ((Object) var2.c(2));
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    void a(boolean param0, int param1, int param2, int param3) {
        int var7 = Vertigo2.field_L ? 1 : 0;
        if (-1 == (param1 ^ -1)) {
            if (!(this.field_B == null)) {
                this.field_B.a(true, param2, true, (iq) (this), param3);
            }
        }
        vp var5 = new vp(this.field_C);
        if (param0) {
            this.a(true, 10, -73, -106);
        }
        iq var6 = (iq) ((Object) var5.b(4));
        while (var6 != null) {
            var6.a(false, param1, param2 - -this.field_o, this.field_t + param3);
            var6 = (iq) ((Object) var5.a((byte) 15));
        }
    }

    final StringBuilder a(Hashtable param0, int param1, byte param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.a(param3, param2 ^ 78, param1, param0)) {
                this.a(param0, param3, true, param1);
                this.a(param1, false, param3, param0);
                break L1;
              } else {
                break L1;
              }
            }
            if (param2 == -79) {
              stackIn_7_0 = (StringBuilder) (param3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_5_0 = (StringBuilder) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("cj.FA(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    void a(byte param0, int param1, int param2, iq param3) {
        RuntimeException runtimeException = null;
        vp var5 = null;
        iq var6 = null;
        int var7 = 0;
        iq var8 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              super.a((byte) 66, param1, param2, param3);
              var5 = new vp(this.field_C);
              if (param0 > 6) {
                break L1;
              } else {
                var8 = (iq) null;
                this.b((byte) 25, (iq) null);
                break L1;
              }
            }
            var6 = (iq) ((Object) var5.d(4));
            L2: while (true) {
              L3: {
                if (var6 == null) {
                  break L3;
                } else {
                  if (!var6.b(101)) {
                    break L3;
                  } else {
                    var6.a((byte) 73, param1 + this.field_o, this.field_t + param2, param3);
                    var6 = (iq) ((Object) var5.c(2));
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

            stackIn_10_1 = new StringBuilder().append("cj.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

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
          throw wn.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    final static void b(boolean param0, int param1, int param2, int param3) {
        int var4;
        int var5;
        if (pm.field_a) {
          L0: {
            ql.field_L.a(0, param0);
            var4 = ji.field_n.l(0) ? 1 : 0;
            if (param1 == (kf.field_c ^ -1)) {
              break L0;
            } else {
              if (var4 == 0) {
                param0 = false;
                on.a(9110);
                break L0;
              } else {
                break L0;
              }
            }
          }
          L1: {
            if (!param0) {
              break L1;
            } else {
              ji.field_n.a(param2, 538, param3);
              break L1;
            }
          }
          L2: {
            if (var4 != 0) {
              ql.field_L.a(0, param0);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            var5 = ji.field_n.k(12282) + ji.field_n.field_ob;
            if (-641 <= (var5 ^ -1)) {
              L4: {
                if (635 <= var5) {
                  break L4;
                } else {
                  if (0 < gr.field_Y) {
                    gr.field_Y = gr.field_Y - 5;
                    break L4;
                  } else {
                    break L3;
                  }
                }
              }
              break L3;
            } else {
              gr.field_Y = gr.field_Y + 5;
              break L3;
            }
          }
          return;
        } else {
          return;
        }
    }

    final boolean a(byte param0, iq param1) {
        vp var3 = null;
        RuntimeException var3_ref = null;
        iq var4 = null;
        int var5 = 0;
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
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 == 116) {
              var3 = new vp(this.field_C);
              var4 = (iq) ((Object) var3.d(param0 + -112));
              L1: while (true) {
                if (var4 == null) {
                  stackIn_12_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (var4.a((byte) 116, param1)) {
                    stackIn_9_0 = 1;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var4 = (iq) ((Object) var3.c(2));
                    continue L1;
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
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("cj.DA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
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

    static {
        field_D = 100;
    }
}
