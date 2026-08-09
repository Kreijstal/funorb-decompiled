/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bob implements wwa, at {
    private int field_j;
    int field_f;
    int field_a;
    no field_d;
    int field_h;
    private boolean field_g;
    int field_i;
    static dja field_e;
    int field_b;
    static String field_l;
    int field_k;
    int field_o;
    int field_m;
    int field_c;
    int field_n;

    private final void c(shb param0, byte param1) {
        int discarded$0 = 0;
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
        shb var8 = null;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (null == param0.field_d) {
                param0.field_d = (ar) ((Object) new re());
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var3_int = this.b(param0, (byte) 110);
              var4 = this.a((byte) 96, param0);
              var6 = this.field_n;
              if (var6 != 0) {
                if ((var6 ^ -1) != -3) {
                  L3: {
                    if (-4 != (var6 ^ -1)) {
                      if (-2 != (var6 ^ -1)) {
                        break L3;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  var5 = this.field_d.field_k + (-this.field_d.field_A + (-this.field_d.field_k + var4) >> 340287457);
                  break L2;
                } else {
                  var5 = var4 - this.field_d.field_A;
                  break L2;
                }
              } else {
                var5 = this.field_d.field_k;
                break L2;
              }
            }
            L4: {
              if (param1 > 58) {
                break L4;
              } else {
                var8 = (shb) null;
                discarded$0 = this.a(-103, (shb) null, -65, (byte) 74);
                break L4;
              }
            }
            L5: {
              var6 = this.field_c;
              if (var6 != 0) {
                if (var6 == 3) {
                  break L5;
                } else {
                  L6: {
                    if (var6 == 1) {
                      if (!(param0.field_d instanceof re)) {
                        break L6;
                      } else {
                        ((re) ((Object) param0.field_d)).a(-2661, var3_int >> -342781407, this.b((byte) -97, param0), var5, this.field_d);
                        return;
                      }
                    } else {
                      if ((var6 ^ -1) == -3) {
                        if (!(param0.field_d instanceof re)) {
                          break L6;
                        } else {
                          ((re) ((Object) param0.field_d)).a(var5, this.field_d, 49, var3_int, this.b((byte) -56, param0));
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                  break L0;
                }
              } else {
                break L5;
              }
            }
            if (param0.field_d instanceof re) {
              ((re) ((Object) param0.field_d)).a(var5, this.field_d, -3, this.b((byte) -98, param0), 0);
              return;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_33_0 = (RuntimeException) (var3);

            stackIn_33_1 = new StringBuilder().append("bob.CA(");

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
          throw rta.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, shb param5, int param6, int param7) {
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
        var13 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              qca.a(param5.field_h + param5.field_g + param6, param5.field_f + (param7 + param5.field_r), param5.field_g + param6, true, param5.field_r + param7);
              var9_int = this.b(param5, (byte) 81);
              var10 = this.a((byte) 56, param5);
              if (param3 == -13997) {
                break L1;
              } else {
                this.field_j = 65;
                break L1;
              }
            }
            L2: {
              if (!this.field_g) {
                L3: {
                  var12 = this.field_n;
                  if (-1 != (var12 ^ -1)) {
                    if (-3 == (var12 ^ -1)) {
                      var11 = var10 + -this.field_d.field_A;
                      break L3;
                    } else {
                      L4: {
                        if (3 == var12) {
                          break L4;
                        } else {
                          if ((var12 ^ -1) == -2) {
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var11 = this.field_d.field_k + (-this.field_d.field_A + var10 - this.field_d.field_k >> 237200001);
                      break L3;
                    }
                  } else {
                    var11 = this.field_d.field_k;
                    break L3;
                  }
                }
                L5: {
                  var12 = this.field_c;
                  if (0 != var12) {
                    if (-4 == (var12 ^ -1)) {
                      break L5;
                    } else {
                      if ((var12 ^ -1) != -2) {
                        if (-3 == (var12 ^ -1)) {
                          this.field_d.b(this.b((byte) -72, param5), var9_int + this.a(param6, param5, param0, (byte) -13), var11 + this.a(param7, -124, param5, param2), param4, param1);
                          break L2;
                        } else {
                          break L2;
                        }
                      } else {
                        this.field_d.a(this.b((byte) -109, param5), (var9_int >> 522853505) + this.a(param6, param5, param0, (byte) -13), this.a(param7, -117, param5, param2) + var11, param4, param1);
                        break L2;
                      }
                    }
                  } else {
                    break L5;
                  }
                }
                this.field_d.c(this.b((byte) -68, param5), this.a(param6, param5, param0, (byte) -13), this.a(param7, param3 ^ 14041, param5, param2) - -var11, param4, param1);
                break L2;
              } else {
                this.field_d.a(this.b((byte) -112, param5), this.a(param6, param5, param0, (byte) -13), this.a(param7, -117, param5, param2), var9_int, var10, param4, param1, this.field_c, this.field_n, this.field_h);
                break L2;
              }
            }
            bia.a((byte) 124);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var9 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var9);

            stackIn_28_1 = new StringBuilder().append("bob.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param6 + ',' + param7 + ')');
        }
    }

    private final int a(int param0, int param1, shb param2, int param3) {
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
              if (param1 <= -116) {
                break L1;
              } else {
                this.field_g = true;
                break L1;
              }
            }
            stackIn_3_0 = param3 + (this.field_k + param0) - (-param2.field_r + -param2.field_i);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("bob.FA(").append(param0).append(',').append(param1).append(',');

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
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    bob(no param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    private final int a(int param0, shb param1, int param2, byte param3) {
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
              if (param3 == -13) {
                break L1;
              } else {
                this.field_n = -85;
                break L1;
              }
            }
            stackIn_3_0 = param2 + (this.field_f + param1.field_g + param0) + param1.field_s;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("bob.BA(").append(param0).append(',');

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
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    public final int a(shb param0, byte param1) {
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
            this.a(param0, 3);
            var3_int = -15 % ((param1 - -1) / 59);
            stackIn_1_0 = param0.field_d.a(29565) - (-this.field_k + -this.field_m);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("bob.I(");

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
          throw rta.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    public final int b(shb param0, byte param1) {
        RuntimeException var3 = null;
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
            if (param1 >= 66) {
              stackIn_4_0 = param0.field_h + (-this.field_f - this.field_o);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -93;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("bob.M(");

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
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public final int a(int param0, int param1, int param2, int param3, shb param4, int param5) {
        RuntimeException var7 = null;
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
              this.a(param4, 3);
              if (param5 == -1) {
                break L1;
              } else {
                bob.b(38);
                break L1;
              }
            }
            stackIn_3_0 = param4.field_d.a(param1 + -this.b(-3, param2, param4), -23381, param0 - this.a(0, param3, param4));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7);

            stackIn_6_1 = new StringBuilder().append("bob.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param5 + ')');
        }
        return stackIn_3_0;
    }

    public final ar a(shb param0, int param1) {
        RuntimeException var3 = null;
        ar stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 3) {
                break L1;
              } else {
                this.field_j = -104;
                break L1;
              }
            }
            L2: {
              if (param0.field_d != null) {
                break L2;
              } else {
                param0.field_d = (ar) ((Object) new re());
                break L2;
              }
            }
            L3: {
              if (this.field_g) {
                ((re) ((Object) param0.field_d)).a(this.field_h, this.a((byte) 83, param0), this.b(param0, (byte) 117), this.b((byte) -94, param0), this.field_d, this.field_c, 3, this.field_n);
                break L3;
              } else {
                this.c(param0, (byte) 87);
                break L3;
              }
            }
            stackIn_8_0 = param0.field_d;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("bob.D(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_8_0;
    }

    private final void a(int param0, shb param1, int param2, int param3) {
        int discarded$1 = 0;
        RuntimeException runtimeException = null;
        shb var6 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.a(0, this.field_j, 0, -13997, this.field_i, param1, param3, param2);
              if (param0 == 340287457) {
                break L1;
              } else {
                var6 = (shb) null;
                discarded$1 = this.a(-125, (shb) null, -85, (byte) -70);
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

            stackIn_5_1 = new StringBuilder().append("bob.W(").append(param0).append(',');

            if (param1 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, bob param1) {
        param1.field_b = this.field_b;
        if (param0 >= -121) {
            return;
        }
        try {
            param1.field_f = this.field_f;
            param1.field_m = this.field_m;
            param1.field_k = this.field_k;
            param1.field_g = this.field_g;
            param1.field_c = this.field_c;
            param1.field_n = this.field_n;
            param1.field_a = this.field_a;
            param1.field_i = this.field_i;
            param1.field_h = this.field_h;
            param1.field_d = this.field_d;
            param1.field_j = this.field_j;
            param1.field_o = this.field_o;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "bob.EA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void b(int param0, int param1, int param2, int param3, shb param4, int param5) {
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        toa var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        shb var17 = null;
        ar var18 = null;
        ar var19 = null;
        var16 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param2 == -24184) {
                break L1;
              } else {
                var17 = (shb) null;
                this.b(-123, -97, 78, -103, (shb) null, 79);
                break L1;
              }
            }
            if (param0 != param5) {
              if (param4.e((byte) -120)) {
                L2: {
                  var18 = this.a(param4, 3);
                  var19 = var18;
                  if (param5 > param0) {
                    var9 = param5;
                    var8 = param0;
                    break L2;
                  } else {
                    var8 = param5;
                    var9 = param0;
                    break L2;
                  }
                }
                var10 = var19.a(true, var8);
                var11 = var19.a(true, var9);
                qca.a(param4.field_g + param3 + param4.field_h, param4.field_r + param1 + param4.field_f, param4.field_g + param3, true, param1 - -param4.field_r);
                var12 = var10;
                L3: while (true) {
                  if (var11 < var12) {
                    bia.a((byte) 124);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    L4: {
                      var13 = var18.field_c[var12];
                      if (var10 == var12) {
                        stackIn_15_0 = var19.a(var8, -112);
                        break L4;
                      } else {
                        stackIn_15_0 = var13.field_c[0];
                        break L4;
                      }
                    }
                    L5: {
                      var14 = stackIn_15_0;
                      if (var12 == var11) {
                        stackIn_20_0 = var19.a(var9, -124);
                        break L5;
                      } else {
                        if (var13 != null) {
                          stackIn_20_0 = var13.field_c[-1 + var13.field_c.length];
                          break L5;
                        } else {
                          stackIn_20_0 = 0;
                          break L5;
                        }
                      }
                    }
                    var15 = stackIn_20_0;
                    msa.field_s.a(var13.field_b + (param4.field_i + this.field_k + (param4.field_r + param1)), this.field_b >>> 1554526424, true, var15 - var14, this.field_b, this.a(param3, param4, var14, (byte) -13), var13.field_a);
                    var12++;
                    continue L3;
                  }
                }
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
          L6: {
            var7 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var7);

            stackIn_25_1 = new StringBuilder().append("bob.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final int a(int param0, int param1, shb param2) {
        RuntimeException var4 = null;
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
              if (param0 == 0) {
                break L1;
              } else {
                this.field_f = -99;
                break L1;
              }
            }
            stackIn_3_0 = this.a(param1, param2, 0, (byte) -13);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("bob.H(").append(param0).append(',').append(param1).append(',');

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
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public final int a(int param0, shb param1) {
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
              if (param0 == -2) {
                break L1;
              } else {
                this.field_c = 43;
                break L1;
              }
            }
            this.a(param1, 3);
            stackIn_3_0 = param1.field_d.c(-18877) + this.field_f - -this.field_o;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("bob.J(").append(param0).append(',');

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
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    private final int a(byte param0, shb param1) {
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
              if (param0 >= 50) {
                break L1;
              } else {
                this.field_j = 14;
                break L1;
              }
            }
            stackIn_3_0 = param1.field_f - (this.field_k + this.field_m);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("bob.DA(").append(param0).append(',');

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
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public void a(int param0, shb param1, int param2, int param3, boolean param4) {
        if (!(this.field_d != null)) {
            return;
        }
        try {
            this.a(340287457, param1, param3, param2);
            int var6_int = 96 / ((param0 - -27) / 35);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "bob.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final int b(int param0, int param1, shb param2) {
        RuntimeException var4 = null;
        shb var5 = null;
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
              if (param0 == -3) {
                break L1;
              } else {
                var5 = (shb) null;
                this.b((shb) null, (byte) -80);
                break L1;
              }
            }
            stackIn_3_0 = this.a(param1, param0 + -114, param2, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("bob.L(").append(param0).append(',').append(param1).append(',');

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
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void b(int param0) {
        field_e = null;
        field_l = null;
        if (param0 != 22540) {
            field_l = (String) null;
        }
    }

    public final int a(int param0) {
        if (param0 < 7) {
            return -64;
        }
        return this.field_d.field_A + this.field_d.field_k;
    }

    String b(byte param0, shb param1) {
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
              if (param0 < -53) {
                break L1;
              } else {
                this.field_n = 73;
                break L1;
              }
            }
            stackIn_3_0 = param1.field_j;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("bob.C(").append(param0).append(',');

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
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public final void a(shb param0, int param1, byte param2, int param3, int param4) {
        ar var13 = null;
        ar var14 = null;
        int var7 = 0;
        toa var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        try {
            if (!(!param0.e((byte) -120))) {
                var13 = this.a(param0, 3);
                var14 = var13;
                var7 = var14.a(true, param4);
                var8 = var13.field_c[var7];
                var9 = var14.a(param4, -126);
                var10 = this.a(param3, param0, var9, (byte) -13);
                var11 = this.b(-3, param1, param0) + Math.max(0, var8.field_b);
                var12 = this.b(-3, param1, param0) + Math.min(this.a((byte) 71, param0), Math.min(var8.field_a, 1 + var7 >= var14.field_c.length ? var8.field_a : var13.field_c[var7 - -1].field_b));
                qca.a(param0.field_h + (param3 - -param0.field_g), param0.field_f + param1 + param0.field_r, param0.field_g + param3, true, param0.field_r + param1);
                msa.field_s.a(this.field_a, var11, var12, var10, var10, 11480);
                bia.a((byte) 124);
            }
            int var6_int = -36 / ((6 - param2) / 58);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "bob.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    protected bob() {
    }

    bob(no param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
            this.field_h = param9;
            this.field_j = param6;
            this.field_k = param3;
            this.field_b = param11;
            this.field_m = param4;
            this.field_a = param10;
            this.field_g = param12 ? true : false;
            this.field_n = param8;
            this.field_i = param5;
            this.field_d = param0;
            this.field_c = param7;
            this.field_o = param2;
            this.field_f = param1;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "bob.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    static {
        field_e = (dja) ((Object) new fjb());
        field_l = "Extend current mission phase";
    }
}
