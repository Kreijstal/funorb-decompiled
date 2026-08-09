/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lk implements kh, pm {
    ka field_q;
    int field_m;
    int field_n;
    int field_g;
    static je field_a;
    static boolean field_f;
    private boolean field_c;
    int field_d;
    static String field_r;
    static int field_h;
    static int field_p;
    int field_l;
    static String field_s;
    int field_i;
    static nm field_e;
    int field_j;
    int field_o;
    private int field_b;
    int field_t;
    int field_k;

    lk(ka param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    private final int a(kb param0, int param1, int param2, int param3) {
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
              if (param2 == 0) {
                break L1;
              } else {
                field_f = false;
                break L1;
              }
            }
            stackIn_3_0 = param1 + this.field_g + param0.field_p + (param3 - -param0.field_z);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("lk.Q(");

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
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    final void a(lk param0, int param1) {
        try {
            param0.field_i = this.field_i;
            param0.field_g = this.field_g;
            param0.field_o = this.field_o;
            param0.field_n = this.field_n;
            param0.field_l = this.field_l;
            param0.field_k = this.field_k;
            param0.field_m = this.field_m;
            param0.field_c = this.field_c;
            param0.field_b = this.field_b;
            param0.field_j = this.field_j;
            param0.field_q = this.field_q;
            param0.field_d = this.field_d;
            param0.field_t = this.field_t;
            if (param1 != 24978) {
                kb var4 = (kb) null;
                this.a((kb) null, -24, 63, -48, 119, -128);
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "lk.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(int param0, int param1, int param2, kb param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        ts var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        kb var13 = null;
        ju var14 = null;
        ju var15 = null;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_4_0;
        int stackIn_4_1;
        int stackIn_4_2;
        int stackIn_4_3;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param3.a(false)) {
                break L1;
              } else {
                L2: {
                  var14 = this.a(-75, param3);
                  var15 = var14;
                  var7 = var15.a(param1 + -1024, param4);
                  var8 = var14.field_b[var7];
                  var9 = var15.a((byte) -66, param4);
                  var10 = this.a(param2, param3, var9, 68);
                  var11 = this.a(-18033, param0, param3) - -Math.max(0, var8.field_n);
                  stackIn_3_0 = this.a(param1 ^ -17009, param0, param3);

                  stackIn_3_1 = this.c(-87, param3);

                  stackIn_3_2 = var8.field_c;

                  if (var15.field_b.length <= 1 + var7) {
                    stackIn_4_0 = stackIn_3_0;
                    stackIn_4_1 = stackIn_3_1;
                    stackIn_4_2 = stackIn_3_2;
                    stackIn_4_3 = var8.field_c;
                    break L2;
                  } else {
                    stackIn_4_0 = stackIn_3_0;
                    stackIn_4_1 = stackIn_3_1;
                    stackIn_4_2 = stackIn_3_2;
                    stackIn_4_3 = var14.field_b[1 + var7].field_n;
                    break L2;
                  }
                }
                var12 = stackIn_4_0 + Math.min(stackIn_4_1, Math.min(stackIn_4_2, stackIn_4_3));
                id.a(param2 - -param3.field_B, param3.field_B + param2 + param3.field_l, param3.field_w + (param3.field_p + param0), param3.field_p + param0, (byte) 100);
                t.field_c.a(this.field_o, var12, var10, (byte) 101, var11, var10);
                rf.b(-18862);
                break L1;
              }
            }
            if (param1 == 1024) {
              break L0;
            } else {
              var13 = (kb) null;
              this.d(35, (kb) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var6);

            stackIn_10_1 = new StringBuilder().append("lk.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param4 + ')');
        }
    }

    private final int c(int param0, kb param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = 16 / ((-48 - param0) / 33);
            stackIn_1_0 = -this.field_m + (param1.field_w + -this.field_g);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("lk.CA(").append(param0).append(',');

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
          throw ig.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    private final void b(kb param0, byte param1) {
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0.field_u != null) {
                break L1;
              } else {
                param0.field_u = (ju) ((Object) new ak());
                break L1;
              }
            }
            L2: {
              var4 = 78 % ((60 - param1) / 38);
              var3_int = this.b(55, param0);
              var5 = this.c(83, param0);
              var7 = this.field_k;
              if (var7 == 0) {
                var6 = this.field_q.field_H;
                break L2;
              } else {
                if ((var7 ^ -1) == -3) {
                  var6 = -this.field_q.field_L + var5;
                  break L2;
                } else {
                  L3: {
                    if (var7 != 3) {
                      if ((var7 ^ -1) == -2) {
                        break L3;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  var6 = this.field_q.field_H + (-this.field_q.field_L + (var5 + -this.field_q.field_H) >> 846808609);
                  break L2;
                }
              }
            }
            L4: {
              L5: {
                var7 = this.field_n;
                if (-1 != (var7 ^ -1)) {
                  if (3 != var7) {
                    if (var7 == 1) {
                      if (param0.field_u instanceof ak) {
                        ((ak) ((Object) param0.field_u)).a(var6, (byte) 117, this.field_q, this.d(0, param0), var3_int >> -1223110527);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if ((var7 ^ -1) != -3) {
                        break L4;
                      } else {
                        if (!(param0.field_u instanceof ak)) {
                          break L4;
                        } else {
                          ((ak) ((Object) param0.field_u)).a(var3_int, this.d(0, param0), this.field_q, -31932, var6);
                          return;
                        }
                      }
                    }
                  } else {
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
              if (!(param0.field_u instanceof ak)) {
                break L4;
              } else {
                ((ak) ((Object) param0.field_u)).a(this.d(0, param0), 0, this.field_q, var6, 0);
                return;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var3);

            stackIn_29_1 = new StringBuilder().append("lk.L(");

            if (param0 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L6;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param1 + ')');
        }
    }

    public final int a(kb param0, int param1) {
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
              this.a(-103, param0);
              if (param1 == -2) {
                break L1;
              } else {
                field_r = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = param0.field_u.a((byte) 120) - (-this.field_g - this.field_m);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("lk.F(");

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
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    private final int a(int param0, kb param1, int param2, int param3) {
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
            var5_int = 42 / ((param3 - -63) / 35);
            stackIn_1_0 = param2 + param1.field_r + param0 - (-param1.field_B - this.field_i);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var5);

            stackIn_4_1 = new StringBuilder().append("lk.O(").append(param0).append(',');

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
          throw ig.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_1_0;
    }

    public final int a(int param0, int param1, kb param2) {
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
            if (param0 == -18033) {
              stackIn_4_0 = this.a(param2, 0, 0, param1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 101;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("lk.T(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public final int a(kb param0, int param1, byte param2) {
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
            if (param2 < -108) {
              stackIn_4_0 = this.a(param1, param0, 0, -123);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 39;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("lk.U(");

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
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public final int b(int param0, kb param1) {
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
              if (param0 >= 44) {
                break L1;
              } else {
                field_p = -118;
                break L1;
              }
            }
            stackIn_3_0 = -this.field_t + param1.field_l - this.field_i;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("lk.DA(").append(param0).append(',');

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
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public final ju a(int param0, kb param1) {
        RuntimeException var3 = null;
        ju stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1.field_u == null) {
                param1.field_u = (ju) ((Object) new ak());
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 < -36) {
                break L2;
              } else {
                this.field_b = 58;
                break L2;
              }
            }
            L3: {
              if (this.field_c) {
                ((ak) ((Object) param1.field_u)).a(this.d(0, param1), (byte) 30, this.c(-123, param1), this.field_k, this.field_j, this.field_n, this.b(85, param1), this.field_q);
                break L3;
              } else {
                this.b(param1, (byte) 112);
                break L3;
              }
            }
            stackIn_9_0 = param1.field_u;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("lk.P(").append(param0).append(',');

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
          throw ig.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        return stackIn_9_0;
    }

    public void a(kb param0, int param1, int param2, boolean param3, int param4) {
        if (!(this.field_q != null)) {
            return;
        }
        try {
            if (param2 >= -79) {
                kb var7 = (kb) null;
                this.a((kb) null, 119, (byte) 95);
            }
            this.a(param1, -251, param4, param0);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "lk.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    String d(int param0, kb param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                this.field_t = -81;
                break L1;
              }
            }
            stackIn_3_0 = param1.field_v;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("lk.AA(").append(param0).append(',');

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
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public final int a(kb param0, int param1, int param2, int param3, int param4, int param5) {
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
            if (param2 >= 79) {
              this.a(-56, param0);
              stackIn_4_0 = param0.field_u.a(-this.a(param0, param5, (byte) -127) + param1, -this.a(-18033, param3, param0) + param4, -1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -92;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var7);

            stackIn_7_1 = new StringBuilder().append("lk.K(");

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
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public final void a(int param0, int param1, int param2, kb param3, int param4, int param5) {
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
        ts var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        ju var17 = null;
        ju var18 = null;
        var16 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param0 == -21259) {
              if (param2 == param1) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param3.a(false)) {
                  L1: {
                    var17 = this.a(-45, param3);
                    var18 = var17;
                    if (param2 < param1) {
                      var9 = param1;
                      var8 = param2;
                      break L1;
                    } else {
                      var8 = param1;
                      var9 = param2;
                      break L1;
                    }
                  }
                  var10 = var18.a(param0 ^ -21259, var8);
                  var11 = var18.a(param0 ^ -21259, var9);
                  id.a(param5 + param3.field_B, param3.field_l + (param5 - -param3.field_B), param3.field_w + (param4 - -param3.field_p), param3.field_p + param4, (byte) 116);
                  var12 = var10;
                  L2: while (true) {
                    if (var11 < var12) {
                      rf.b(param0 + 2397);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      L3: {
                        var13 = var17.field_b[var12];
                        if ((var12 ^ -1) != (var10 ^ -1)) {
                          stackIn_16_0 = var13.field_i[0];
                          break L3;
                        } else {
                          stackIn_16_0 = var18.a((byte) -66, var8);
                          break L3;
                        }
                      }
                      L4: {
                        var14 = stackIn_16_0;
                        if (var11 != var12) {
                          if (var13 == null) {
                            stackIn_21_0 = 0;
                            break L4;
                          } else {
                            stackIn_21_0 = var13.field_i[var13.field_i.length - 1];
                            break L4;
                          }
                        } else {
                          stackIn_21_0 = var18.a((byte) -66, var9);
                          break L4;
                        }
                      }
                      var15 = stackIn_21_0;
                      t.field_c.a(this.field_l >>> 1572958904, this.a(param5, param3, var14, -109), this.field_g + param4 + (param3.field_p - -param3.field_z) - -var13.field_n, true, var13.field_c, -var14 + var15, this.field_l);
                      var12++;
                      continue L2;
                    }
                  }
                } else {
                  return;
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
            var7 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var7);

            stackIn_26_1 = new StringBuilder().append("lk.V(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L5;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param4 + ',' + param5 + ')');
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

    public static void a(byte param0) {
        field_a = null;
        field_e = null;
        int var1 = -5 / ((-45 - param0) / 50);
        field_s = null;
        field_r = null;
    }

    final static boolean b(boolean param0) {
        if (!param0) {
            return true;
        }
        return (ib.field_j ^ -1) < -251 ? true : false;
    }

    private final void a(int param0, int param1, int param2, kb param3) {
        try {
            this.a(0, param2, param0, this.field_d, 0, this.field_b, param3, 2);
            if (param1 != -251) {
                this.field_m = 1;
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "lk.G(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, kb param6, int param7) {
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param7 == 2) {
                break L1;
              } else {
                this.field_b = -74;
                break L1;
              }
            }
            L2: {
              id.a(param6.field_B + param2, param6.field_l + param2 - -param6.field_B, param6.field_w + (param6.field_p + param1), param6.field_p + param1, (byte) 91);
              var9_int = this.b(103, param6);
              var10 = this.c(-99, param6);
              if (!this.field_c) {
                L3: {
                  var12 = this.field_k;
                  if (0 != var12) {
                    if (2 != var12) {
                      L4: {
                        if (-4 != (var12 ^ -1)) {
                          if ((var12 ^ -1) != -2) {
                            break L4;
                          } else {
                            break L4;
                          }
                        } else {
                          break L4;
                        }
                      }
                      var11 = this.field_q.field_H + (-this.field_q.field_H + var10 - this.field_q.field_L >> -1793473951);
                      break L3;
                    } else {
                      var11 = -this.field_q.field_L + var10;
                      break L3;
                    }
                  } else {
                    var11 = this.field_q.field_H;
                    break L3;
                  }
                }
                L5: {
                  var12 = this.field_n;
                  if (0 != var12) {
                    if (var12 == 3) {
                      break L5;
                    } else {
                      if (-2 != (var12 ^ -1)) {
                        if (var12 != 2) {
                          break L2;
                        } else {
                          this.field_q.a(this.d(param7 + -2, param6), var9_int + this.a(param2, param6, param0, -114), this.a(param6, param4, 0, param1) - -var11, param3, param5);
                          break L2;
                        }
                      } else {
                        this.field_q.c(this.d(param7 ^ 2, param6), this.a(param2, param6, param0, -13) + (var9_int >> 42811073), var11 + this.a(param6, param4, 0, param1), param3, param5);
                        break L2;
                      }
                    }
                  } else {
                    break L5;
                  }
                }
                this.field_q.b(this.d(0, param6), this.a(param2, param6, param0, param7 + 67), var11 + this.a(param6, param4, param7 + -2, param1), param3, param5);
                break L2;
              } else {
                this.field_q.a(this.d(param7 ^ 2, param6), this.a(param2, param6, param0, 66), this.a(param6, param4, 0, param1), var9_int, var10, param3, param5, this.field_n, this.field_k, this.field_j);
                break L2;
              }
            }
            rf.b(-18862);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var9 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var9);

            stackIn_30_1 = new StringBuilder().append("lk.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L6;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param7 + ')');
        }
    }

    public final int a(kb param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.a(-51, param0);
            var3_int = -62 / ((param1 - -20) / 38);
            stackIn_1_0 = param0.field_u.a(false) - (-this.field_i + -this.field_t);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("lk.I(");

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
          throw ig.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    public final int a(boolean param0) {
        if (!param0) {
            return -56;
        }
        return this.field_q.field_L + this.field_q.field_H;
    }

    final static void a(int param0, java.awt.Canvas param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 >= 70) {
              oq.a(27080, (java.awt.Component) ((Object) param1));
              il.a((java.awt.Component) ((Object) param1), (byte) 74);
              if (om.field_I != null) {
                om.field_I.a(0, (java.awt.Component) ((Object) param1));
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("lk.N(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    protected lk() {
    }

    final static void a(hd param0, int param1, nm param2, byte param3, boolean param4, java.awt.Component param5) {
        try {
            int var6_int = -98 / ((param3 - -3) / 46);
            ca.a(param5, 1024, param0, param4, -115, param2, param1, param1);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "lk.W(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    lk(ka param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
            this.field_g = param3;
            this.field_c = param12 ? true : false;
            this.field_d = param5;
            this.field_m = param4;
            this.field_l = param11;
            this.field_b = param6;
            this.field_q = param0;
            this.field_j = param9;
            this.field_n = param7;
            this.field_k = param8;
            this.field_o = param10;
            this.field_t = param2;
            this.field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "lk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    static {
        field_f = false;
        field_s = "Accept rematch";
    }
}
