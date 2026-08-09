/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v {
    static String field_j;
    private int field_i;
    t field_f;
    static int field_b;
    private int field_k;
    t[] field_g;
    private int field_h;
    private int field_c;
    private boolean field_e;
    static int field_a;
    private int field_d;

    final v a(int param0, boolean param1) {
        this.field_e = param1 ? true : false;
        if (param0 >= -69) {
            this.field_c = -25;
            return (v) (this);
        }
        return (v) (this);
    }

    final void a(int param0, byte param1, gm param2, v param3, int param4, se param5) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          L0: {
            L1: {
              if (this.field_e) {
                param3.a(param0, param5, param2, param4, (byte) 114);
                param3.b((byte) -117);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (null == this.field_g) {
                break L2;
              } else {
                param3.field_g = this.field_g;
                break L2;
              }
            }
            L3: {
              if (this.field_k >= -1) {
                param3.field_k = this.field_k;
                break L3;
              } else {
                break L3;
              }
            }
            if (param1 == 115) {
              L4: {
                if (this.field_d != -2147483648) {
                  param3.field_d = this.field_d;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (2147483647 != (this.field_i ^ -1)) {
                  param3.field_i = this.field_i;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (-1 > this.field_c) {
                  break L6;
                } else {
                  param3.field_c = this.field_c;
                  break L6;
                }
              }
              L7: {
                if (this.field_h != -2147483648) {
                  param3.field_h = this.field_h;
                  break L7;
                } else {
                  break L7;
                }
              }
              if (null == this.field_f) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                param3.field_f = this.field_f;
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var7);

            stackIn_26_1 = new StringBuilder().append("v.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L8;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');

            if (param3 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L9;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L10;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L10;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_27_0), stackIn_33_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(byte param0, v param1) {
        try {
            param1.field_i = this.field_i;
            param1.field_e = this.field_e;
            param1.field_k = this.field_k;
            param1.field_c = this.field_c;
            param1.field_d = this.field_d;
            param1.field_g = this.field_g;
            param1.field_f = this.field_f;
            if (param0 > -84) {
                this.field_d = -106;
            }
            param1.field_h = this.field_h;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "v.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final v b(byte param0, int param1) {
        if (param0 <= 104) {
            return (v) null;
        }
        this.field_i = param1;
        return (v) (this);
    }

    final v a(int param0, byte param1) {
        if (param1 != -113) {
            this.a(-26, true);
            this.field_h = param0;
            return (v) (this);
        }
        this.field_h = param0;
        return (v) (this);
    }

    public static void a(byte param0) {
        int var1 = -114 / ((38 - param0) / 50);
        field_j = null;
    }

    final v a(int param0, int param1) {
        gm var4;
        if (param1 != -26249) {
          var4 = (gm) null;
          this.a(-73, (se) null, (gm) null, -90, (byte) 73);
          this.field_c = param0;
          return (v) (this);
        } else {
          this.field_c = param0;
          return (v) (this);
        }
    }

    final void a(int param0, se param1, gm param2, int param3, byte param4) {
        uc stackIn_22_0 = null;
        String stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        uc stackIn_23_0 = null;
        String stackIn_23_1 = null;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        int stackIn_25_2;
        int stackIn_25_3;
        int stackIn_25_4;
        int stackIn_26_2 = 0;
        int stackIn_26_3 = 0;
        int stackIn_26_4 = 0;
        int stackIn_26_5 = 0;
        int stackIn_28_3;
        int stackIn_28_4;
        int stackIn_28_5;
        int stackIn_28_6;
        int stackIn_28_7;
        int stackIn_29_3;
        int stackIn_29_4;
        int stackIn_29_5;
        int stackIn_29_6;
        int stackIn_29_7;
        int stackIn_29_8;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        try {
          L0: {
            L1: {
              rh.a(param3 - -param2.field_w, param2.field_o, (byte) 71, param2.field_k + param0, param2.field_p, this.field_g);
              if (param4 >= 108) {
                break L1;
              } else {
                this.field_f = (t) null;
                break L1;
              }
            }
            L2: {
              if (null != this.field_f) {
                L3: {
                  var6_int = param3 + (param2.field_w - -this.field_h);
                  var7 = this.field_i + param2.field_k + param0;
                  if (-2 == (param1.field_f ^ -1)) {
                    var6_int = var6_int + (param2.field_p - this.field_f.field_w) / 2;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (-2 == (param1.field_g ^ -1)) {
                    var7 = var7 + (param2.field_o + -this.field_f.field_u) / 2;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (param1.field_f == 2) {
                    var6_int = var6_int + (-this.field_f.field_w + param2.field_p);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if ((param1.field_g ^ -1) != -3) {
                    break L6;
                  } else {
                    var7 = var7 + (param2.field_o - this.field_f.field_u);
                    break L6;
                  }
                }
                this.field_f.d(var6_int, var7);
                break L2;
              } else {
                break L2;
              }
            }
            L7: {
              var6 = param1.c((byte) 65, param2);
              if (var6 == null) {
                break L7;
              } else {
                if (null == param1.field_m) {
                  break L7;
                } else {
                  if (0 <= this.field_k) {
                    L8: {
                      stackIn_22_0 = param1.field_m;

                      stackIn_22_1 = (String) (var6);

                      stackIn_22_2 = param2.field_w + param3 - -param1.field_k;

                      if ((this.field_h ^ -1) != 2147483647) {
                        stackIn_23_0 = (uc) ((Object) stackIn_22_0);
                        stackIn_23_1 = (String) ((Object) stackIn_22_1);
                        stackIn_23_2 = stackIn_22_2;
                        stackIn_23_3 = this.field_h;
                        break L8;
                      } else {
                        stackIn_23_0 = (uc) ((Object) stackIn_22_0);
                        stackIn_23_1 = (String) ((Object) stackIn_22_1);
                        stackIn_23_2 = stackIn_22_2;
                        stackIn_23_3 = 0;
                        break L8;
                      }
                    }
                    L9: {




                      stackIn_25_2 = stackIn_23_2 + stackIn_23_3;

                      stackIn_25_3 = param1.field_p + param0;

                      stackIn_25_4 = param2.field_k;

                      if (this.field_i == -2147483648) {
                        stackIn_23_0 = (uc) ((Object) stackIn_23_0);
                        stackIn_23_1 = (String) ((Object) stackIn_23_1);
                        stackIn_26_2 = stackIn_25_2;
                        stackIn_26_3 = stackIn_25_3;
                        stackIn_26_4 = stackIn_25_4;
                        stackIn_26_5 = 0;
                        break L9;
                      } else {
                        stackIn_23_0 = (uc) ((Object) stackIn_23_0);
                        stackIn_23_1 = (String) ((Object) stackIn_23_1);
                        stackIn_26_2 = stackIn_25_2;
                        stackIn_26_3 = stackIn_25_3;
                        stackIn_26_4 = stackIn_25_4;
                        stackIn_26_5 = this.field_i;
                        break L9;
                      }
                    }
                    L10: {






                      stackIn_28_3 = stackIn_26_3 + (stackIn_26_4 - -stackIn_26_5);

                      stackIn_28_4 = -param1.field_e + -param1.field_k + param2.field_p;

                      stackIn_28_5 = -param1.field_p + param2.field_o - param1.field_o;

                      stackIn_28_6 = this.field_k;

                      stackIn_28_7 = this.field_c;

                      if ((this.field_d ^ -1) == 2147483647) {
                        stackIn_23_0 = (uc) ((Object) stackIn_23_0);
                        stackIn_23_1 = (String) ((Object) stackIn_23_1);

                        stackIn_29_3 = stackIn_28_3;
                        stackIn_29_4 = stackIn_28_4;
                        stackIn_29_5 = stackIn_28_5;
                        stackIn_29_6 = stackIn_28_6;
                        stackIn_29_7 = stackIn_28_7;
                        stackIn_29_8 = 256;
                        break L10;
                      } else {
                        stackIn_23_0 = (uc) ((Object) stackIn_23_0);
                        stackIn_23_1 = (String) ((Object) stackIn_23_1);

                        stackIn_29_3 = stackIn_28_3;
                        stackIn_29_4 = stackIn_28_4;
                        stackIn_29_5 = stackIn_28_5;
                        stackIn_29_6 = stackIn_28_6;
                        stackIn_29_7 = stackIn_28_7;
                        stackIn_29_8 = this.field_d;
                        break L10;
                      }
                    }
                    ((uc) (Object) stackIn_23_0).a(stackIn_23_1, stackIn_26_2, stackIn_29_3, stackIn_29_4, stackIn_29_5, stackIn_29_6, stackIn_29_7, stackIn_29_8, param1.field_f, param1.field_g, param1.field_a);
                    break L7;
                  } else {
                    return;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6_ref = decompiledCaughtException;
            stackIn_33_0 = (RuntimeException) (var6_ref);

            stackIn_33_1 = new StringBuilder().append("v.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L11;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_36_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',');

            if (param2 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L12;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L12;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_34_0), stackIn_37_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void b(byte param0) {
        this.field_c = -1;
        this.field_g = null;
        this.field_f = null;
        if (param0 >= -22) {
          v.a((byte) 1);
          this.field_h = 0;
          this.field_d = 256;
          this.field_i = 0;
          this.field_k = 0;
          return;
        } else {
          this.field_h = 0;
          this.field_d = 256;
          this.field_i = 0;
          this.field_k = 0;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = Torquing.field_u;
        try {
          L0: {
            if (param3 == 77) {
              var5_int = 0;
              var6 = param4;
              var7 = -param4;
              var8 = -1;
              var9 = ln.a(qg.field_z, kn.field_e, param1 + param4, 119);
              var10 = ln.a(qg.field_z, kn.field_e, -param4 + param1, 94);
              di.a(var10, (byte) 74, param2, qd.field_a[param0], var9);
              L1: while (true) {
                if (var6 <= var5_int) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    var8 += 2;
                    var7 = var7 + var8;
                    if (0 < var7) {
                      var6--;
                      var7 = var7 - (var6 << 1270638561);
                      var11 = -var6 + param0;
                      var12 = param0 + var6;
                      if (var12 < j.field_q) {
                        break L2;
                      } else {
                        if (var11 <= qk.field_p) {
                          L3: {
                            var13 = ln.a(qg.field_z, kn.field_e, param1 - -var5_int, param3 ^ 29);
                            var14 = ln.a(qg.field_z, kn.field_e, param1 + -var5_int, 92);
                            if (var12 > qk.field_p) {
                              break L3;
                            } else {
                              di.a(var14, (byte) -96, param2, qd.field_a[var12], var13);
                              break L3;
                            }
                          }
                          if (j.field_q > var11) {
                            break L2;
                          } else {
                            di.a(var14, (byte) -93, param2, qd.field_a[var11], var13);
                            break L2;
                          }
                        } else {
                          break L2;
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                  var5_int++;
                  var11 = param0 - var5_int;
                  var12 = param0 + var5_int;
                  if (j.field_q > var12) {
                    continue L1;
                  } else {
                    if (qk.field_p >= var11) {
                      L4: {
                        var13 = ln.a(qg.field_z, kn.field_e, var6 + param1, param3 ^ 59);
                        var14 = ln.a(qg.field_z, kn.field_e, param1 + -var6, 100);
                        if (qk.field_p < var12) {
                          break L4;
                        } else {
                          di.a(var14, (byte) -119, param2, qd.field_a[var12], var13);
                          break L4;
                        }
                      }
                      if (var11 < j.field_q) {
                        continue L1;
                      } else {
                        di.a(var14, (byte) -120, param2, qd.field_a[var11], var13);
                        continue L1;
                      }
                    } else {
                      continue L1;
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
          var5 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var5), "v.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final v a(byte param0, int param1) {
        if (param0 < 90) {
            this.a(-70, true);
            this.field_k = param1;
            return (v) (this);
        }
        this.field_k = param1;
        return (v) (this);
    }

    final v a(int param0, t[] param1) {
        RuntimeException var3 = null;
        Object stackIn_3_0 = null;
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
                this.field_f = (t) null;
                break L1;
              }
            }
            this.field_g = param1;
            stackIn_3_0 = this;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("v.J(").append(param0).append(',');

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
          throw rb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return (v) (this);
    }

    v() {
        this.field_f = null;
        this.field_k = -2;
        this.field_h = -2147483648;
        this.field_c = -2;
        this.field_g = null;
        this.field_i = -2147483648;
        this.field_d = -2147483648;
        this.field_e = false;
    }

    static {
        field_b = 0;
        field_j = null;
    }
}
