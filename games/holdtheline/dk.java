/*
 * Decompiled by CFR-JS 0.4.0.
 */
class dk implements dh, vc {
    int field_h;
    static String field_m;
    int field_n;
    int field_i;
    static int field_l;
    int field_a;
    int field_d;
    int field_c;
    int field_b;
    int field_j;
    static int field_g;
    private int field_k;
    private boolean field_o;
    int field_p;
    qi field_f;
    int field_e;

    public static void b(boolean param0) {
        if (!param0) {
            return;
        }
        field_m = null;
    }

    public final int a(n param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 == 13112) {
              stackIn_4_0 = this.a((byte) 122, 0, param1, param0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 116;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("dk.K(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void a(byte param0, dk param1) {
        try {
            param1.field_f = this.field_f;
            param1.field_c = this.field_c;
            param1.field_d = this.field_d;
            param1.field_i = this.field_i;
            param1.field_j = this.field_j;
            param1.field_p = this.field_p;
            param1.field_a = this.field_a;
            param1.field_h = this.field_h;
            param1.field_k = this.field_k;
            param1.field_b = this.field_b;
            if (param0 >= -106) {
                this.field_b = -91;
            }
            param1.field_e = this.field_e;
            param1.field_o = this.field_o;
            param1.field_n = this.field_n;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "dk.GA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, n param1, int param2, byte param3, int param4) {
        int var6_int = 0;
        lm var7 = null;
        int var8 = 0;
        lf var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_5_0;
        int stackIn_5_1;
        int stackIn_5_2;
        int stackIn_5_3;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          L0: {
            L1: {
              var6_int = -67 % ((param3 - 57) / 49);
              if (param1.c((byte) -20)) {
                L2: {
                  var7 = this.a((byte) 20, param1);
                  var8 = var7.b(param2, -22539);
                  var9 = var7.field_b[var8];
                  var10 = var7.a(16777215, param2);
                  var11 = this.a((byte) -19, var10, param0, param1);
                  var12 = this.a(-1337403295, param1, param4) + Math.max(0, var9.field_h);
                  stackIn_4_0 = this.a(-1337403295, param1, param4);

                  stackIn_4_1 = this.c((byte) -109, param1);

                  stackIn_4_2 = var9.field_k;

                  if (var7.field_b.length > 1 + var8) {
                    stackIn_5_0 = stackIn_4_0;
                    stackIn_5_1 = stackIn_4_1;
                    stackIn_5_2 = stackIn_4_2;
                    stackIn_5_3 = var7.field_b[1 + var8].field_h;
                    break L2;
                  } else {
                    stackIn_5_0 = stackIn_4_0;
                    stackIn_5_1 = stackIn_4_1;
                    stackIn_5_2 = stackIn_4_2;
                    stackIn_5_3 = var9.field_k;
                    break L2;
                  }
                }
                var13 = stackIn_5_0 - -Math.min(stackIn_5_1, Math.min(stackIn_5_2, stackIn_5_3));
                td.a(param1.field_k + (param0 + param1.field_x), param1.field_k + param0, param1.field_o + param4 - -param1.field_u, true, param1.field_o + param4);
                pc.field_b.a(this.field_a, var12, (byte) -53, var13, var11, var11);
                dm.b((byte) -10);
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var6);

            stackIn_9_1 = new StringBuilder().append("dk.L(").append(param0).append(',');

            if (param1 == null) {
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
          throw kk.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(int param0, int param1, n param2, byte param3) {
        if (param3 != -53) {
            return;
        }
        try {
            this.a(0, param0, this.field_k, (byte) -63, param1, this.field_c, param2, 0);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "dk.V(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public void a(boolean param0, int param1, int param2, n param3, int param4) {
        if (param2 >= -48) {
            return;
        }
        if (!(null != this.field_f)) {
            return;
        }
        try {
            this.a(param1, param4, param3, (byte) -53);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "dk.C(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    public final lm a(byte param0, n param1) {
        RuntimeException var3 = null;
        lm stackIn_5_0 = null;
        lm stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1.field_i == null) {
                param1.field_i = (lm) ((Object) new lg());
                break L1;
              } else {
                break L1;
              }
            }
            if (param0 == 20) {
              L2: {
                if (this.field_o) {
                  ((lg) ((Object) param1.field_i)).a(this.a(45, param1), this.a(param1, (byte) 127), this.field_h, param0 + -19, this.c((byte) -109, param1), this.field_f, this.field_d, this.field_i);
                  break L2;
                } else {
                  this.b(-1337403295, param1);
                  break L2;
                }
              }
              stackIn_10_0 = param1.field_i;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_5_0 = (lm) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("dk.I(").append(param0).append(',');

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
          throw kk.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_10_0;
        }
    }

    public final int b(byte param0, n param1) {
        RuntimeException var3 = null;
        n var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.a((byte) 20, param1);
              if (param0 == -36) {
                break L1;
              } else {
                var4 = (n) null;
                this.a((n) null, -60);
                break L1;
              }
            }
            stackIn_3_0 = param1.field_i.a((byte) 108) - -this.field_j + this.field_n;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("dk.J(").append(param0).append(',');

            if (param1 == null) {
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
          throw kk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    String a(n param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = 114 / ((73 - param1) / 49);
            stackIn_1_0 = param0.field_q;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("dk.S(");

            if (param0 == null) {
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
          throw kk.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    private final void a(int param0, int param1, int param2, byte param3, int param4, int param5, n param6, int param7) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (param3 <= -57) {
                break L1;
              } else {
                dk.b(true);
                break L1;
              }
            }
            L2: {
              td.a(param6.field_k + (param1 + param6.field_x), param6.field_k + param1, param6.field_o + (param4 - -param6.field_u), true, param6.field_o + param4);
              var9_int = this.a(21, param6);
              var10 = this.c((byte) -63, param6);
              if (!this.field_o) {
                L3: {
                  var12 = this.field_d;
                  if (var12 != 0) {
                    if ((var12 ^ -1) == -3) {
                      var11 = -this.field_f.field_I + var10;
                      break L3;
                    } else {
                      L4: {
                        if (-4 == (var12 ^ -1)) {
                          break L4;
                        } else {
                          if (1 != var12) {
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var11 = this.field_f.field_G - -(var10 + (-this.field_f.field_G + -this.field_f.field_I) >> -1371020127);
                      break L3;
                    }
                  } else {
                    var11 = this.field_f.field_G;
                    break L3;
                  }
                }
                L5: {
                  var12 = this.field_i;
                  if (0 == var12) {
                    break L5;
                  } else {
                    if (-4 == (var12 ^ -1)) {
                      break L5;
                    } else {
                      if (1 != var12) {
                        if (-3 != (var12 ^ -1)) {
                          break L2;
                        } else {
                          this.field_f.c(this.a(param6, (byte) -5), this.a((byte) 98, param0, param1, param6) + var9_int, var11 + this.a(param7, (byte) -56, param6, param4), param5, param2);
                          break L2;
                        }
                      } else {
                        this.field_f.b(this.a(param6, (byte) -98), (var9_int >> -1507810591) + this.a((byte) 107, param0, param1, param6), this.a(param7, (byte) -46, param6, param4) + var11, param5, param2);
                        break L2;
                      }
                    }
                  }
                }
                this.field_f.a(this.a(param6, (byte) 125), this.a((byte) -96, param0, param1, param6), var11 + this.a(param7, (byte) 57, param6, param4), param5, param2);
                break L2;
              } else {
                this.field_f.a(this.a(param6, (byte) -12), this.a((byte) 101, param0, param1, param6), this.a(param7, (byte) -114, param6, param4), var9_int, var10, param5, param2, this.field_i, this.field_d, this.field_h);
                break L2;
              }
            }
            dm.b((byte) -10);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var9 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var9);

            stackIn_27_1 = new StringBuilder().append("dk.FA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L6;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L6;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param7 + ')');
        }
    }

    private final int c(byte param0, n param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 <= -59) {
                break L1;
              } else {
                this.field_f = (qi) null;
                break L1;
              }
            }
            stackIn_3_0 = -this.field_e + param1.field_u - this.field_p;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("dk.W(").append(param0).append(',');

            if (param1 == null) {
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
          throw kk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public final int a(int param0, n param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 6) {
                break L1;
              } else {
                this.field_n = 95;
                break L1;
              }
            }
            stackIn_3_0 = -this.field_n + (param1.field_x + -this.field_j);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("dk.P(").append(param0).append(',');

            if (param1 == null) {
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
          throw kk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public final int a(int param0, byte param1, int param2, int param3, n param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 >= 38) {
              this.a((byte) 20, param4);
              stackIn_4_0 = param4.field_i.a(-this.a(param4, param3, 13112) + param2, 8, -this.a(-1337403295, param4, param0) + param5);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -32;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var7);

            stackIn_7_1 = new StringBuilder().append("dk.O(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final int a(int param0, byte param1, n param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = 122 / ((-1 - param1) / 32);
            stackIn_1_0 = param0 + param3 + (param2.field_o - -this.field_p) + param2.field_y;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var5);

            stackIn_4_1 = new StringBuilder().append("dk.EA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw kk.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param3 + ')');
        }
        return stackIn_1_0;
    }

    public final int a(boolean param0) {
        if (!param0) {
            this.field_n = 120;
        }
        return this.field_f.field_I + this.field_f.field_G;
    }

    public final int a(int param0, n param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -1337403295) {
              stackIn_4_0 = this.a(0, (byte) -68, param1, param2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -41;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("dk.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public final int a(n param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.a((byte) 20, param0);
              if (param1 <= -82) {
                break L1;
              } else {
                this.field_c = 115;
                break L1;
              }
            }
            stackIn_3_0 = param0.field_i.a(-112) + (this.field_p + this.field_e);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("dk.M(");

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
          throw kk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public final void a(int param0, int param1, int param2, int param3, int param4, n param5) {
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        lf var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        lm var17 = null;
        lm var18 = null;
        var16 = HoldTheLine.field_D;
        try {
          L0: {
            if (param3 == param4) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param5.c((byte) -20)) {
                  L2: {
                    var17 = this.a((byte) 20, param5);
                    var18 = var17;
                    if (param4 < param3) {
                      var9 = param3;
                      var8 = param4;
                      break L2;
                    } else {
                      var9 = param4;
                      var8 = param3;
                      break L2;
                    }
                  }
                  var10 = var18.b(var8, -22539);
                  var11 = var18.b(var9, -22539);
                  td.a(param5.field_x + param2 - -param5.field_k, param2 + param5.field_k, param1 + param5.field_o + param5.field_u, true, param5.field_o + param1);
                  var12 = var10;
                  L3: while (true) {
                    if (var12 > var11) {
                      dm.b((byte) -10);
                      break L1;
                    } else {
                      L4: {
                        var13 = var17.field_b[var12];
                        if (var12 == var10) {
                          stackIn_16_0 = var18.a(16777215, var8);
                          break L4;
                        } else {
                          stackIn_16_0 = var13.field_c[0];
                          break L4;
                        }
                      }
                      L5: {
                        var14 = stackIn_16_0;
                        if (var11 == var12) {
                          stackIn_21_0 = var18.a(16777215, var9);
                          break L5;
                        } else {
                          if (var13 != null) {
                            stackIn_21_0 = var13.field_c[-1 + var13.field_c.length];
                            break L5;
                          } else {
                            stackIn_21_0 = 0;
                            break L5;
                          }
                        }
                      }
                      var15 = stackIn_21_0;
                      pc.field_b.a(this.field_b >>> 1749227032, 13421772, this.field_p + param5.field_o + (param1 - -param5.field_y - -var13.field_h), var13.field_k, this.a((byte) -54, var14, param2, param5), this.field_b, -var14 + var15);
                      var12++;
                      continue L3;
                    }
                  }
                } else {
                  break L1;
                }
              }
              L6: {
                if (param0 < -23) {
                  break L6;
                } else {
                  this.field_o = false;
                  break L6;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var7 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var7);

            stackIn_28_1 = new StringBuilder().append("dk.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L7;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L7;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final int a(byte param0, int param1, int param2, n param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = 101 / ((58 - param0) / 36);
            stackIn_1_0 = param3.field_m + param2 - -param3.field_k - (-this.field_j + -param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var5);

            stackIn_4_1 = new StringBuilder().append("dk.DA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw kk.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    protected dk() {
    }

    dk(qi param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    private final void b(int param0, n param1) {
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (param1.field_i == null) {
                param1.field_i = (lm) ((Object) new lg());
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var3_int = this.a(param0 ^ -1337403314, param1);
              if (param0 == -1337403295) {
                break L2;
              } else {
                this.field_k = -67;
                break L2;
              }
            }
            L3: {
              var4 = this.c((byte) -121, param1);
              var6 = this.field_d;
              if (0 != var6) {
                if (2 != var6) {
                  L4: {
                    if (var6 == 3) {
                      break L4;
                    } else {
                      if (var6 == 1) {
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var5 = (-this.field_f.field_I + (var4 + -this.field_f.field_G) >> 1210378689) + this.field_f.field_G;
                  break L3;
                } else {
                  var5 = var4 + -this.field_f.field_I;
                  break L3;
                }
              } else {
                var5 = this.field_f.field_G;
                break L3;
              }
            }
            L5: {
              L6: {
                var6 = this.field_i;
                if (var6 == 0) {
                  break L6;
                } else {
                  if (var6 != 3) {
                    if (1 == var6) {
                      if (param1.field_i instanceof lg) {
                        ((lg) ((Object) param1.field_i)).a(this.field_f, (byte) -37, var5, this.a(param1, (byte) -96), var3_int >> -1337403295);
                        break L5;
                      } else {
                        break L5;
                      }
                    } else {
                      if (-3 != (var6 ^ -1)) {
                        break L5;
                      } else {
                        if (!(param1.field_i instanceof lg)) {
                          break L5;
                        } else {
                          ((lg) ((Object) param1.field_i)).a(this.a(param1, (byte) -43), 965, this.field_f, var5, var3_int);
                          break L5;
                        }
                      }
                    }
                  } else {
                    break L6;
                  }
                }
              }
              if (param1.field_i instanceof lg) {
                ((lg) ((Object) param1.field_i)).a(this.a(param1, (byte) 124), -12476, var5, 0, this.field_f);
                break L5;
              } else {
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_33_0 = (RuntimeException) (var3);

            stackIn_33_1 = new StringBuilder().append("dk.BA(").append(param0).append(',');

            if (param1 == null) {
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
          throw kk.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ')');
        }
    }

    final static io a(int param0) {
        String var1 = tn.d(param0 ^ param0);
        if (var1 != null) {
            if (!(-1 < (var1.indexOf('@') ^ -1))) {
                var1 = "";
            }
        }
        return new io(tn.d(0), ab.n(112));
    }

    dk(qi param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
            this.field_a = param10;
            this.field_i = param7;
            this.field_c = param5;
            this.field_o = param12 ? true : false;
            this.field_f = param0;
            this.field_d = param8;
            this.field_p = param3;
            this.field_n = param2;
            this.field_k = param6;
            this.field_j = param1;
            this.field_b = param11;
            this.field_h = param9;
            this.field_e = param4;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "dk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    static {
        field_m = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
    }
}
