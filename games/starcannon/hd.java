/*
 * Decompiled by CFR-JS 0.4.0.
 */
class hd implements de, lg {
    qe field_f;
    int field_e;
    int field_c;
    int field_a;
    int field_k;
    private int field_n;
    int field_o;
    int field_b;
    int field_h;
    static String[] field_g;
    int field_d;
    private boolean field_l;
    int field_j;
    static String field_i;
    int field_m;
    static boolean field_p;

    private final void a(int param0, uj param1, byte param2, int param3) {
        try {
            this.a(param0, param3, 0, param1, this.field_c, 0, 26296, this.field_n);
            if (param2 >= -97) {
                this.field_b = 76;
            }
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "hd.W(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    hd(qe param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    public final void a(int param0, uj param1, int param2, int param3, int param4) {
        bd var13 = null;
        bd var14 = null;
        int var7 = 0;
        nh var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        try {
            if (param0 != -3) {
                field_p = true;
            }
            if (param1.d(true)) {
                var13 = this.a(param1, (byte) -41);
                var14 = var13;
                var7 = var14.a(param4, 0);
                var8 = var13.field_d[var7];
                var9 = var14.a((byte) -30, param4);
                var10 = this.a(param1, var9, (byte) 125, param2);
                var11 = this.a((byte) -95, param1, param3) + Math.max(0, var8.field_g);
                var12 = this.a((byte) -42, param1, param3) + Math.min(this.a(true, param1), Math.min(var8.field_c, var14.field_d.length <= var7 + 1 ? var8.field_c : var13.field_d[1 + var7].field_g));
                cl.a(true, param1.field_j + param3 + param1.field_f, param1.field_s + param2, param1.field_j + param3, param1.field_i + param1.field_s + param2);
                eh.field_j.a(this.field_j, var10, var11, var12, var10, false);
                wf.a(-82);
            }
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "hd.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final int a(uj param0, int param1, byte param2, int param3) {
        RuntimeException var5 = null;
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
              if (param2 == 125) {
                break L1;
              } else {
                this.field_d = -27;
                break L1;
              }
            }
            stackIn_3_0 = param0.field_s + (param3 - -this.field_d) + (param0.field_n - -param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("hd.Q(");

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
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    public final bd a(uj param0, byte param1) {
        int discarded$1 = 0;
        RuntimeException var3 = null;
        uj var4 = null;
        bd stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null == param0.field_m) {
                param0.field_m = (bd) ((Object) new se());
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (!this.field_l) {
                this.c(0, param0);
                break L2;
              } else {
                ((se) ((Object) param0.field_m)).a((byte) 104, this.field_f, this.field_h, this.b(105, param0), this.a(true, param0), this.field_a, this.field_k, this.a(param0, false));
                break L2;
              }
            }
            L3: {
              if (param1 < -36) {
                break L3;
              } else {
                var4 = (uj) null;
                discarded$1 = this.a(false, (uj) null);
                break L3;
              }
            }
            stackIn_9_0 = param0.field_m;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("hd.J(");

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
          throw sd.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    String a(uj param0, boolean param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param1) {
              stackIn_4_0 = param0.field_k;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("hd.R(");

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
          throw sd.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final void a(int param0, int param1, int param2, uj param3, int param4, int param5, int param6, int param7) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              cl.a(true, param3.field_j + param1 - -param3.field_f, param3.field_s + param0, param3.field_j + param1, param3.field_s + (param0 + param3.field_i));
              var9_int = this.b(113, param3);
              var10 = this.a(true, param3);
              if (!this.field_l) {
                L2: {
                  var12 = this.field_a;
                  if (var12 == 0) {
                    var11 = this.field_f.field_p;
                    break L2;
                  } else {
                    if ((var12 ^ -1) != -3) {
                      L3: {
                        if ((var12 ^ -1) == -4) {
                          break L3;
                        } else {
                          if (1 == var12) {
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var11 = (-this.field_f.field_q + (var10 - this.field_f.field_p) >> -103964319) + this.field_f.field_p;
                      break L2;
                    } else {
                      var11 = -this.field_f.field_q + var10;
                      break L2;
                    }
                  }
                }
                L4: {
                  var12 = this.field_h;
                  if (var12 != 0) {
                    if (3 == var12) {
                      break L4;
                    } else {
                      if (1 != var12) {
                        if (var12 == 2) {
                          this.field_f.c(this.a(param3, false), var9_int + this.a(param3, param2, (byte) 125, param0), this.a(param3, param5, param1, false) + var11, param4, param7);
                          break L1;
                        } else {
                          break L1;
                        }
                      } else {
                        this.field_f.b(this.a(param3, false), this.a(param3, param2, (byte) 125, param0) - -(var9_int >> 1390790977), this.a(param3, param5, param1, false) - -var11, param4, param7);
                        break L1;
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                this.field_f.a(this.a(param3, false), this.a(param3, param2, (byte) 125, param0), this.a(param3, param5, param1, false) - -var11, param4, param7);
                break L1;
              } else {
                this.field_f.a(this.a(param3, false), this.a(param3, param2, (byte) 125, param0), this.a(param3, param5, param1, false), var9_int, var10, param4, param7, this.field_h, this.field_a, this.field_k);
                break L1;
              }
            }
            L5: {
              if (param6 == 26296) {
                break L5;
              } else {
                field_g = (String[]) null;
                break L5;
              }
            }
            wf.a(param6 + -26355);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var9 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var9);

            stackIn_28_1 = new StringBuilder().append("hd.O(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L6;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L6;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    public final int a(int param0, uj param1) {
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
              this.a(param1, (byte) -119);
              if (param0 == 16293784) {
                break L1;
              } else {
                this.field_n = 62;
                break L1;
              }
            }
            stackIn_3_0 = param1.field_m.a(param0 ^ -16293862) - -this.field_e - -this.field_b;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("hd.I(").append(param0).append(',');

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
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(byte param0) {
        field_g = null;
        field_i = null;
        if (param0 != 125) {
            field_p = true;
        }
    }

    public final int a(int param0) {
        if (param0 != 0) {
            return -65;
        }
        return this.field_f.field_q + this.field_f.field_p;
    }

    public final int a(byte param0, uj param1, int param2) {
        RuntimeException var4 = null;
        uj var5 = null;
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
              if (param0 < -31) {
                break L1;
              } else {
                var5 = (uj) null;
                this.b(13, (uj) null);
                break L1;
              }
            }
            stackIn_3_0 = this.a(param1, 0, param2, false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("hd.F(").append(param0).append(',');

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
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    public final int a(int param0, int param1, uj param2, int param3, int param4, boolean param5) {
        RuntimeException var7 = null;
        hd var8 = null;
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
              if (param5) {
                break L1;
              } else {
                var8 = (hd) null;
                this.a(-92, (hd) null);
                break L1;
              }
            }
            this.a(param2, (byte) -85);
            stackIn_3_0 = param2.field_m.a(-this.a(param2, (byte) 12, param3) + param0, (byte) 19, -this.a((byte) -61, param2, param4) + param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7);

            stackIn_6_1 = new StringBuilder().append("hd.H(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_3_0;
    }

    public void a(int param0, boolean param1, int param2, int param3, uj param4) {
        if (!(null != this.field_f)) {
            return;
        }
        try {
            this.a(param0, param4, (byte) -114, param3);
            int var6_int = 78 % ((param2 - 2) / 54);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "hd.L(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    private final int a(uj param0, int param1, int param2, boolean param3) {
        RuntimeException var5 = null;
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
              if (!param3) {
                break L1;
              } else {
                this.field_n = -81;
                break L1;
              }
            }
            stackIn_3_0 = param1 + param2 + (param0.field_j - (-this.field_e - param0.field_q));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("hd.U(");

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
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    public final int a(uj param0, int param1) {
        RuntimeException var3 = null;
        uj var4 = null;
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
              this.a(param0, (byte) -103);
              if (param1 == -26557) {
                break L1;
              } else {
                var4 = (uj) null;
                this.a(50, (uj) null);
                break L1;
              }
            }
            stackIn_3_0 = param0.field_m.c(119) - (-this.field_d - this.field_o);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("hd.E(");

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
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    private final void c(int param0, uj param1) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        uj var8 = null;
        var7 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              if (param1.field_m == null) {
                param1.field_m = (bd) ((Object) new se());
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == 0) {
                break L2;
              } else {
                var8 = (uj) null;
                this.c(114, (uj) null);
                break L2;
              }
            }
            L3: {
              var3_int = this.b(108, param1);
              var4 = this.a(true, param1);
              var6 = this.field_a;
              if (var6 == 0) {
                var5 = this.field_f.field_p;
                break L3;
              } else {
                if (-3 != (var6 ^ -1)) {
                  L4: {
                    if (var6 == 3) {
                      break L4;
                    } else {
                      if (1 == var6) {
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var5 = (-this.field_f.field_q + (-this.field_f.field_p + var4) >> 579360673) + this.field_f.field_p;
                  break L3;
                } else {
                  var5 = -this.field_f.field_q + var4;
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                L7: {
                  var6 = this.field_h;
                  if (var6 != 0) {
                    if (3 != var6) {
                      if (1 == var6) {
                        if (!(param1.field_m instanceof se)) {
                          break L6;
                        } else {
                          ((se) ((Object) param1.field_m)).a(this.field_f, this.a(param1, false), 466572161, var3_int >> -1785899327, var5);
                          break L5;
                        }
                      } else {
                        if (2 == var6) {
                          if (!(param1.field_m instanceof se)) {
                            break L6;
                          } else {
                            ((se) ((Object) param1.field_m)).a(this.a(param1, false), var3_int, (byte) 127, var5, this.field_f);
                            break L5;
                          }
                        } else {
                          break L5;
                        }
                      }
                    } else {
                      break L7;
                    }
                  } else {
                    break L7;
                  }
                }
                if (!(param1.field_m instanceof se)) {
                  break L6;
                } else {
                  ((se) ((Object) param1.field_m)).a(var5, 0, (byte) 111, this.a(param1, false), this.field_f);
                  break L5;
                }
              }
              break L5;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var3);

            stackIn_31_1 = new StringBuilder().append("hd.P(").append(param0).append(',');

            if (param1 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L8;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L8;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ')');
        }
    }

    final void a(int param0, hd param1) {
        try {
            param1.field_j = this.field_j;
            param1.field_e = this.field_e;
            param1.field_m = this.field_m;
            param1.field_l = this.field_l;
            param1.field_c = this.field_c;
            param1.field_a = this.field_a;
            param1.field_b = this.field_b;
            param1.field_k = this.field_k;
            param1.field_o = this.field_o;
            param1.field_h = this.field_h;
            param1.field_f = this.field_f;
            param1.field_d = this.field_d;
            if (param0 >= -17) {
                this.field_n = 34;
            }
            param1.field_n = this.field_n;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "hd.S(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final int a(uj param0, byte param1, int param2) {
        RuntimeException var4 = null;
        uj var5 = null;
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
              if (param1 == 12) {
                break L1;
              } else {
                var5 = (uj) null;
                this.a((uj) null, true);
                break L1;
              }
            }
            stackIn_3_0 = this.a(param0, 0, (byte) 125, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("hd.A(");

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
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    protected hd() {
    }

    private final int a(boolean param0, uj param1) {
        RuntimeException var3 = null;
        uj var4 = null;
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
              if (param0) {
                break L1;
              } else {
                var4 = (uj) null;
                this.a((byte) -63, (uj) null, 80);
                break L1;
              }
            }
            stackIn_3_0 = -this.field_b + param1.field_f + -this.field_e;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("hd.T(").append(param0).append(',');

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
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public final int b(int param0, uj param1) {
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
              if (param0 >= 74) {
                break L1;
              } else {
                this.field_h = -39;
                break L1;
              }
            }
            stackIn_3_0 = param1.field_i + -this.field_d - this.field_o;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("hd.B(").append(param0).append(',');

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
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public final void a(int param0, int param1, int param2, uj param3, byte param4, int param5) {
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        nh var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        bd var17 = null;
        bd var18 = null;
        var16 = StarCannon.field_A;
        try {
          L0: {
            if (param5 == param2) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param4 > 54) {
                L1: {
                  if (param3.d(true)) {
                    L2: {
                      var17 = this.a(param3, (byte) -104);
                      var18 = var17;
                      if (param5 < param2) {
                        var8 = param5;
                        var9 = param2;
                        break L2;
                      } else {
                        var8 = param2;
                        var9 = param5;
                        break L2;
                      }
                    }
                    var10 = var18.a(var8, 0);
                    var11 = var18.a(var9, 0);
                    cl.a(true, param3.field_f + param0 + param3.field_j, param1 + param3.field_s, param0 - -param3.field_j, param3.field_s + param1 + param3.field_i);
                    var12 = var10;
                    L3: while (true) {
                      if (var12 > var11) {
                        wf.a(-76);
                        break L1;
                      } else {
                        L4: {
                          var13 = var17.field_d[var12];
                          if (var12 == var10) {
                            stackIn_16_0 = var18.a((byte) -30, var8);
                            break L4;
                          } else {
                            stackIn_16_0 = var13.field_d[0];
                            break L4;
                          }
                        }
                        L5: {
                          var14 = stackIn_16_0;
                          if (var12 == var11) {
                            stackIn_21_0 = var18.a((byte) -30, var9);
                            break L5;
                          } else {
                            if (var13 == null) {
                              stackIn_21_0 = 0;
                              break L5;
                            } else {
                              stackIn_21_0 = var13.field_d[-1 + var13.field_d.length];
                              break L5;
                            }
                          }
                        }
                        var15 = stackIn_21_0;
                        eh.field_j.a(this.field_m >>> 16293784, this.field_m, var13.field_g + param3.field_q + this.field_e + (param0 + param3.field_j), -var14 + var15, this.a(param3, var14, (byte) 125, param1), var13.field_c, (byte) 113);
                        var12++;
                        continue L3;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var7 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var7);

            stackIn_26_1 = new StringBuilder().append("hd.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param4 + ',' + param5 + ')');
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

    hd(qe param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
            this.field_c = param5;
            this.field_o = param2;
            this.field_m = param11;
            this.field_l = param12 ? true : false;
            this.field_k = param9;
            this.field_j = param10;
            this.field_b = param4;
            this.field_h = param7;
            this.field_e = param3;
            this.field_d = param1;
            this.field_a = param8;
            this.field_f = param0;
            this.field_n = param6;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "hd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    static {
        field_g = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_i = "Reload game";
    }
}
