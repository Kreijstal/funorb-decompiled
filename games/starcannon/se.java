/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se extends bd {
    private int field_r;
    private int field_i;
    private String field_s;
    private int field_v;
    static int field_u;
    static String field_t;
    static String[] field_n;
    private int field_q;
    private boolean field_k;
    static ue field_l;
    private qe field_h;
    private int field_j;
    static ia field_p;
    static int[] field_o;
    static int field_m;

    private final nh a(String param0, int param1, qe param2, int param3) {
        nh var5 = null;
        RuntimeException var5_ref = null;
        nh var6 = null;
        nh stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var6 = new nh(-param2.field_p + param1, param2.field_q + param1, param0.length());
              var5 = var6;
              this.field_d = new nh[]{var6};
              if (param3 >= 99) {
                break L1;
              } else {
                field_t = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = (nh) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5_ref);

            stackIn_6_1 = new StringBuilder().append("se.J(");

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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    public static void c(byte param0) {
        field_l = null;
        field_p = null;
        field_t = null;
        if (param0 != -2) {
            se.c((byte) 85);
            field_o = null;
            field_n = null;
            return;
        }
        field_o = null;
        field_n = null;
    }

    final static void a(boolean param0, hh param1, int param2, int param3, boolean param4) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          L0: {
            L1: {
              jl.field_b[param2] = di.field_l.nextInt();
              jl.field_b[1] = di.field_l.nextInt();
              ck.field_g.field_g = 0;
              jl.field_b[3] = (int)mi.field_o;
              jl.field_b[2] = (int)(mi.field_o >> -743624096);
              ck.field_g.c((byte) -113, jl.field_b[0]);
              ck.field_g.c((byte) -71, jl.field_b[1]);
              ck.field_g.c((byte) -109, jl.field_b[2]);
              ck.field_g.c((byte) -107, jl.field_b[3]);
              fd.a(ck.field_g, (byte) -111);
              ck.field_g.c(param3, param2 + -306);
              param1.a((byte) 69, ck.field_g);
              d.field_b.field_g = 0;
              if (!param0) {
                d.field_b.a(16, -110);
                break L1;
              } else {
                d.field_b.a(18, -108);
                break L1;
              }
            }
            L2: {
              d.field_b.field_g = d.field_b.field_g + 2;
              var5_int = d.field_b.field_g;
              d.field_b.c((byte) -123, ce.field_b);
              d.field_b.a(true, gh.field_B);
              var6 = 0;
              if (ah.field_i) {
                var6 = var6 | 1;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!qa.field_e) {
                break L3;
              } else {
                var6 = var6 | 4;
                break L3;
              }
            }
            L4: {
              if (!param4) {
                break L4;
              } else {
                var6 = var6 | 8;
                break L4;
              }
            }
            L5: {
              if (lj.field_c != null) {
                var6 = var6 | 16;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              d.field_b.a(var6, param2 + -93);
              var7 = uj.a(ll.b(125), 61);
              if (var7 == null) {
                var7 = "";
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              d.field_b.b(false, var7);
              if (null != lj.field_c) {
                d.field_b.a(false, lj.field_c);
                break L7;
              } else {
                break L7;
              }
            }
            fc.a(ck.field_g, d.field_b, ed.field_j, gg.field_e, 0);
            d.field_b.a((byte) 88, -var5_int + d.field_b.field_g);
            nf.a(-1, (byte) 95);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var5);

            stackIn_23_1 = new StringBuilder().append("se.N(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L8;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L8;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static boolean b(byte param0) {
        if (param0 != -91) {
            field_n = (String[]) null;
            if (-11 < (bl.field_a ^ -1)) {
                return false;
            }
            if (ai.field_c) {
                return false;
            }
            return !fc.a((byte) 57) ? true : false;
        }
        if (-11 < (bl.field_a ^ -1)) {
            return false;
        }
        if (ai.field_c) {
            return false;
        }
        return !fc.a((byte) 57) ? true : false;
    }

    final void a(byte param0, qe param1, int param2, int param3, int param4, int param5, int param6, String param7) {
        nh stackIn_37_0;
        nh stackIn_37_1;
        int stackIn_37_2;
        int stackIn_37_3;
        nh stackIn_38_0 = null;
        nh stackIn_38_1 = null;
        int stackIn_38_2 = 0;
        int stackIn_38_3 = 0;
        int stackIn_38_4 = 0;
        nh stackIn_42_0;
        qe stackIn_42_1;
        int stackIn_42_2;
        String stackIn_42_3;
        nh stackIn_43_0;
        qe stackIn_43_1;
        int stackIn_43_2;
        String stackIn_43_3;
        int stackIn_43_4;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        StringBuilder stackIn_51_1 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        nh var14 = null;
        int var15 = 0;
        qe var16 = null;
        String[] var17 = null;
        String[] var18 = null;
        var15 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              if (param6 == 0) {
                param6 = param1.field_x;
                break L1;
              } else {
                break L1;
              }
            }
            if (param7 != null) {
              L2: {
                if (this.field_h != param1) {
                  break L2;
                } else {
                  if (this.field_k) {
                    break L2;
                  } else {
                    if ((this.field_v ^ -1) != (param2 ^ -1)) {
                      break L2;
                    } else {
                      if ((param5 ^ -1) != (this.field_q ^ -1)) {
                        break L2;
                      } else {
                        if ((this.field_r ^ -1) != (param6 ^ -1)) {
                          break L2;
                        } else {
                          if (this.field_i != param4) {
                            break L2;
                          } else {
                            if ((this.field_j ^ -1) != (param3 ^ -1)) {
                              break L2;
                            } else {
                              if (null == this.field_s) {
                                break L2;
                              } else {
                                if (!this.field_s.equals(param7)) {
                                  break L2;
                                } else {
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              L3: {
                this.field_s = param7;
                this.field_i = param4;
                this.field_q = param5;
                this.field_v = param2;
                this.field_h = param1;
                if (param0 >= 5) {
                  break L3;
                } else {
                  var16 = (qe) null;
                  this.a(16, -33, (byte) 44, (String) null, (qe) null);
                  break L3;
                }
              }
              L4: {
                this.field_j = param3;
                this.field_r = param6;
                this.field_k = false;
                var17 = new String[param1.a(param7, param3) - -1];
                var18 = var17;
                var10 = Math.max(1, param1.a(param7, new int[]{param3}, var18));
                if (this.field_q != 3) {
                  break L4;
                } else {
                  if (1 != var10) {
                    break L4;
                  } else {
                    this.field_q = 1;
                    break L4;
                  }
                }
              }
              L5: {
                this.field_d = new nh[var10];
                if (-1 != (this.field_q ^ -1)) {
                  if ((this.field_q ^ -1) == -2) {
                    var11 = (this.field_i - var10 * this.field_r >> -678881375) + param1.field_p;
                    break L5;
                  } else {
                    if (-3 != (this.field_q ^ -1)) {
                      L6: {
                        var12 = (this.field_i + -(this.field_r * var10)) / (1 + var10);
                        if ((var12 ^ -1) > -1) {
                          var12 = 0;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      this.field_r = this.field_r + var12;
                      var11 = param1.field_p - -var12;
                      break L5;
                    } else {
                      var11 = -(this.field_r * var10) + -param1.field_q + this.field_i;
                      break L5;
                    }
                  }
                } else {
                  var11 = param1.field_p;
                  break L5;
                }
              }
              var12 = 0;
              L7: while (true) {
                if (var10 <= var12) {
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L8: {
                    var13 = var17[var12];
                    stackIn_37_0 = null;

                    stackIn_37_1 = null;

                    stackIn_37_2 = var11 - param1.field_p;

                    stackIn_37_3 = var11 + param1.field_q;

                    if (var13 == null) {
                      stackIn_38_0 = null;
                      stackIn_38_1 = null;
                      stackIn_38_2 = stackIn_37_2;
                      stackIn_38_3 = stackIn_37_3;
                      stackIn_38_4 = 0;
                      break L8;
                    } else {
                      stackIn_38_0 = null;
                      stackIn_38_1 = null;
                      stackIn_38_2 = stackIn_37_2;
                      stackIn_38_3 = stackIn_37_3;
                      stackIn_38_4 = var13.length();
                      break L8;
                    }
                  }
                  L9: {
                    var14 = new nh(stackIn_38_2, stackIn_38_3, stackIn_38_4);
                    var14.field_d[0] = 0;
                    if (var13 != null) {
                      L10: {
                        var14.field_d[var13.length()] = param1.a(var13);
                        stackIn_42_0 = (nh) (var14);

                        stackIn_42_1 = (qe) (param1);

                        stackIn_42_2 = 3853;

                        stackIn_42_3 = (String) (var13);

                        if (param2 == 3) {
                          stackIn_43_0 = (nh) ((Object) stackIn_42_0);
                          stackIn_43_1 = (qe) ((Object) stackIn_42_1);
                          stackIn_43_2 = stackIn_42_2;
                          stackIn_43_3 = (String) ((Object) stackIn_42_3);
                          stackIn_43_4 = this.a((byte) 85, param3, param1.a(var13), var13);
                          break L10;
                        } else {
                          stackIn_43_0 = (nh) ((Object) stackIn_42_0);
                          stackIn_43_1 = (qe) ((Object) stackIn_42_1);
                          stackIn_43_2 = stackIn_42_2;
                          stackIn_43_3 = (String) ((Object) stackIn_42_3);
                          stackIn_43_4 = 0;
                          break L10;
                        }
                      }
                      lb.a(stackIn_43_0, stackIn_43_1, stackIn_43_2, stackIn_43_3, stackIn_43_4);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  this.field_d[var12] = var14;
                  var11 = var11 + param6;
                  var12++;
                  continue L7;
                }
              }
            } else {
              this.field_d = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var9 = decompiledCaughtException;
            stackIn_48_0 = (RuntimeException) (var9);

            stackIn_48_1 = new StringBuilder().append("se.L(").append(param0).append(',');

            if (param1 == null) {
              stackIn_49_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackIn_49_2 = "null";
              break L11;
            } else {
              stackIn_49_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackIn_49_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_51_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_49_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "null";
              break L12;
            } else {
              stackIn_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "{...}";
              break L12;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_49_0), stackIn_52_2 + ')');
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

    final static boolean d(byte param0) {
        int var1 = 62 % ((param0 - 86) / 37);
        return tc.field_x;
    }

    final void a(String param0, int param1, byte param2, int param3, qe param4) {
        nh var8 = null;
        nh var9 = null;
        if (param2 <= 126) {
            this.field_i = -18;
        }
        if (!(param0 != null)) {
            this.field_d = null;
            return;
        }
        if (this.field_h == param4 && this.field_k && this.field_v == 2 && this.field_s != null && this.field_s.equals(param0)) {
            return;
        }
        try {
            this.field_h = param4;
            this.field_k = true;
            this.field_v = 2;
            this.field_s = param0;
            var8 = this.a(param0, param3, param4, 119);
            var9 = var8;
            var9.field_d[0] = param1 - param4.a(param0);
            var9.field_d[param0.length()] = param1;
            lb.a(var9, param4, 3853, param0, 0);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "se.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(qe param0, String param1, int param2, int param3, int param4) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        nh var8 = null;
        try {
          L0: {
            if (param1 == null) {
              this.field_d = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 != this.field_h) {
                  break L1;
                } else {
                  if (!this.field_k) {
                    break L1;
                  } else {
                    if ((this.field_v ^ -1) != -2) {
                      break L1;
                    } else {
                      if (null == this.field_s) {
                        break L1;
                      } else {
                        if (!this.field_s.equals(param1)) {
                          break L1;
                        } else {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                }
              }
              L2: {
                this.field_k = true;
                this.field_v = 1;
                this.field_h = param0;
                var8 = this.a(param1, param4, param0, param2 ^ 466572270);
                var7 = param0.a(param1);
                var8.field_d[0] = -(var7 >> 466572161) + param3;
                var8.field_d[param1.length()] = param3 - -(var7 >> -1405445823);
                if (param2 == 466572161) {
                  break L2;
                } else {
                  field_u = 97;
                  break L2;
                }
              }
              lb.a(var8, param0, 3853, param1, 0);
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var6);

            stackIn_17_1 = new StringBuilder().append("se.P(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
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

    final void a(int param0, int param1, byte param2, String param3, qe param4) {
        nh var7 = null;
        nh var8 = null;
        if (param2 <= 9) {
            return;
        }
        if (!(param3 != null)) {
            this.field_d = null;
            return;
        }
        if (this.field_h == param4 && this.field_k && -1 == (this.field_v ^ -1) && this.field_s != null && this.field_s.equals(param3)) {
            return;
        }
        try {
            this.field_s = param3;
            this.field_k = true;
            this.field_v = 0;
            this.field_h = param4;
            var7 = this.a(param3, param0, param4, 123);
            var8 = var7;
            var7.field_d[0] = param1;
            var8.field_d[param3.length()] = param4.a(param3) + param1;
            lb.a(var8, param4, 3853, param3, 0);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "se.S(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        int var2;
        if (0 >= u.field_d) {
          if (wk.a(param1 ^ 421)) {
            var2 = 0;
            if (param1 == 480) {
              L0: {
                if (kd.field_B != null) {
                  break L0;
                } else {
                  if (!vf.field_b) {
                    break L0;
                  } else {
                    ig.a((byte) 61, var2, param0);
                    return;
                  }
                }
              }
              return;
            } else {
              L1: {
                field_t = (String) null;
                if (kd.field_B != null) {
                  break L1;
                } else {
                  if (!vf.field_b) {
                    break L1;
                  } else {
                    ig.a((byte) 61, var2, param0);
                    return;
                  }
                }
              }
              return;
            }
          } else {
            var2 = 1;
            if (param1 == 480) {
              L2: {
                if (kd.field_B != null) {
                  break L2;
                } else {
                  if (!vf.field_b) {
                    break L2;
                  } else {
                    ig.a((byte) 61, var2, param0);
                    return;
                  }
                }
              }
              return;
            } else {
              L3: {
                field_t = (String) null;
                if (kd.field_B != null) {
                  break L3;
                } else {
                  if (!vf.field_b) {
                    break L3;
                  } else {
                    ig.a((byte) 61, var2, param0);
                    return;
                  }
                }
              }
              return;
            }
          }
        } else {
          L4: {
            if (null == kd.field_B) {
              n.field_a = re.a(0, nb.field_e, 0, true, 640, 480);
              break L4;
            } else {
              n.field_a = kd.field_B.a(2);
              ae.a(2, (byte) 31);
              break L4;
            }
          }
          if (n.field_a == null) {
            var2 = 3;
            if (param1 == 480) {
              L5: {
                if (kd.field_B != null) {
                  break L5;
                } else {
                  if (!vf.field_b) {
                    break L5;
                  } else {
                    ig.a((byte) 61, var2, param0);
                    return;
                  }
                }
              }
              return;
            } else {
              field_t = (String) null;
              if (kd.field_B == null) {
                if (vf.field_b) {
                  ig.a((byte) 61, var2, param0);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            var2 = 2;
            mf.a(true, n.field_a);
            if (param1 != 480) {
              field_t = (String) null;
              if (kd.field_B == null) {
                if (!vf.field_b) {
                  return;
                } else {
                  ig.a((byte) 61, var2, param0);
                  return;
                }
              } else {
                return;
              }
            } else {
              if (kd.field_B == null) {
                if (vf.field_b) {
                  ig.a((byte) 61, var2, param0);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
    }

    public se() {
    }

    static {
        field_t = "Members' Benefits";
        field_u = 256;
    }
}
