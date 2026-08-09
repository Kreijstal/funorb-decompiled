/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we extends hi {
    private String field_j;
    private int field_i;
    static mk field_e;
    private int field_f;
    static String field_m;
    static String field_n;
    private int field_h;
    private int field_p;
    private jb field_g;
    static jb field_k;
    private int field_l;
    private boolean field_o;

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
        int incrementValue$0 = 0;
        int stackIn_23_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = TetraLink.field_J;
        try {
          L0: {
            if (param5 < param3) {
              if (param2 > param5 + 1) {
                L1: {
                  if (5 + param5 >= param2) {
                    break L1;
                  } else {
                    if (param6 == param1) {
                      break L1;
                    } else {
                      var7_int = (param1 >> -1284620991) - -(param6 >> 577326401) - -(1 & (param6 & param1));
                      var8 = param5;
                      var9 = param6;
                      var10 = param1;
                      var11 = param5;
                      L2: while (true) {
                        if (var11 >= param2) {
                          we.a(0, var9, var8, param3, param4, param5, param6);
                          we.a(param0 ^ param0, param1, param2, param3, param4, var8, var10);
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          L3: {
                            var12 = qd.field_W[var11];
                            if (!param4) {
                              stackIn_23_0 = fe.field_b[var12];
                              break L3;
                            } else {
                              stackIn_23_0 = lb.field_P[var12];
                              break L3;
                            }
                          }
                          L4: {
                            var13 = stackIn_23_0;
                            if (var13 <= var7_int) {
                              if (var13 > var10) {
                                var10 = var13;
                                break L4;
                              } else {
                                var11++;
                                continue L2;
                              }
                            } else {
                              qd.field_W[var11] = qd.field_W[var8];
                              incrementValue$0 = var8;
                              var8++;
                              qd.field_W[incrementValue$0] = var12;
                              if (var9 > var13) {
                                var9 = var13;
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                          }
                          var11++;
                          continue L2;
                        }
                      }
                    }
                  }
                }
                var7_int = -1 + param2;
                L5: while (true) {
                  if (param5 >= var7_int) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var8 = param5;
                    L6: while (true) {
                      if (var7_int <= var8) {
                        var7_int--;
                        continue L5;
                      } else {
                        L7: {
                          var9 = qd.field_W[var8];
                          var10 = qd.field_W[var8 + 1];
                          if (om.a(param4, var10, 113, var9)) {
                            qd.field_W[var8] = var10;
                            qd.field_W[1 + var8] = var9;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        var8++;
                        continue L6;
                      }
                    }
                  }
                }
              } else {
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
          var7 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var7), "we.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final static bf a(int param0, ee param1) {
        bf var2 = null;
        RuntimeException var2_ref = null;
        bf stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2 = new bf(param1, param1);
              ha.field_b.a(var2, false);
              u.field_g.a(param1);
              if (param0 == -11040) {
                break L1;
              } else {
                field_e = (mk) null;
                break L1;
              }
            }
            stackIn_3_0 = (bf) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2_ref);

            stackIn_6_1 = new StringBuilder().append("we.H(").append(param0).append(',');

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
          throw oi.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(String param0, int param1, int param2, boolean param3, jb param4) {
        bk var8 = null;
        bk var9 = null;
        if (!(param0 != null)) {
            this.field_c = null;
            return;
        }
        if (param4 == this.field_g && this.field_o && this.field_l == 2 && this.field_j != null && this.field_j.equals(param0)) {
            return;
        }
        try {
            this.field_j = param0;
            this.field_g = param4;
            this.field_l = 2;
            this.field_o = true;
            var8 = this.a(param0, param1, -19395, param4);
            var9 = var8;
            var9.field_j[0] = -param4.b(param0) + param2;
            var9.field_j[param0.length()] = param2;
            la.a(param0, var9, param4, param3, 0);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "we.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(String param0, byte param1, jb param2, int param3, int param4) {
        bk var8 = null;
        int var7 = 0;
        if (param0 == null) {
            this.field_c = null;
            return;
        }
        if (this.field_g == param2 && this.field_o && this.field_l == 1 && null != this.field_j && this.field_j.equals(param0)) {
            return;
        }
        try {
            if (param1 != 124) {
                this.field_o = true;
            }
            this.field_o = true;
            this.field_g = param2;
            this.field_l = 1;
            var8 = this.a(param0, param4, -19395, param2);
            var7 = param2.b(param0);
            var8.field_j[0] = param3 - (var7 >> -1529841663);
            var8.field_j[param0.length()] = param3 - -(var7 >> -1135519039);
            la.a(param0, var8, param2, false, 0);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "we.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3) {
        if (param2 != -2) {
            return;
        }
        gh.a((byte) 116, param0);
        hj.a(param0, param3, param1, false);
    }

    final void a(int param0, jb param1, int param2, int param3, String param4) {
        bk var7 = null;
        bk var8 = null;
        if (param4 == null) {
            this.field_c = null;
            return;
        }
        if (param1 == this.field_g && this.field_o && 0 == this.field_l && null != this.field_j) {
            if (!(!this.field_j.equals(param4))) {
                return;
            }
        }
        try {
            this.field_g = param1;
            this.field_j = param4;
            this.field_o = true;
            this.field_l = 0;
            var7 = this.a(param4, param3, -19395, param1);
            var8 = var7;
            var7.field_j[param2] = param0;
            var8.field_j[param4.length()] = param1.b(param4) + param0;
            la.a(param4, var8, param1, false, 0);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "we.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, String param2, int param3, jb param4, int param5, int param6, int param7) {
        bk stackIn_38_0;
        bk stackIn_38_1;
        int stackIn_38_2;
        int stackIn_38_3;
        bk stackIn_39_0 = null;
        bk stackIn_39_1 = null;
        int stackIn_39_2 = 0;
        int stackIn_39_3 = 0;
        int stackIn_39_4 = 0;
        String stackIn_43_0;
        bk stackIn_43_1;
        jb stackIn_43_2;
        int stackIn_43_3;
        String stackIn_44_0;
        bk stackIn_44_1;
        jb stackIn_44_2;
        int stackIn_44_3;
        int stackIn_44_4;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        StringBuilder stackIn_52_1 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        bk var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        var15 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (param7 == 0) {
                param7 = param4.field_H;
                break L1;
              } else {
                break L1;
              }
            }
            if (param2 == null) {
              this.field_c = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (param4 != this.field_g) {
                  break L2;
                } else {
                  if (this.field_o) {
                    break L2;
                  } else {
                    if (this.field_l != param5) {
                      break L2;
                    } else {
                      if (this.field_f != param6) {
                        break L2;
                      } else {
                        if (param7 != this.field_p) {
                          break L2;
                        } else {
                          if (this.field_h != param1) {
                            break L2;
                          } else {
                            if (param3 != this.field_i) {
                              break L2;
                            } else {
                              if (null == this.field_j) {
                                break L2;
                              } else {
                                if (!this.field_j.equals(param2)) {
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
              this.field_p = param7;
              this.field_i = param3;
              this.field_f = param6;
              this.field_h = param1;
              this.field_l = param5;
              this.field_j = param2;
              if (param0 == -24340) {
                L3: {
                  this.field_g = param4;
                  this.field_o = false;
                  var16 = new String[1 + param4.c(param2, param3)];
                  var17 = var16;
                  var10 = Math.max(1, param4.a(param2, new int[]{param3}, var17));
                  if (-4 != (this.field_f ^ -1)) {
                    break L3;
                  } else {
                    if (-2 != (var10 ^ -1)) {
                      break L3;
                    } else {
                      this.field_f = 1;
                      break L3;
                    }
                  }
                }
                L4: {
                  this.field_c = new bk[var10];
                  if (this.field_f == 0) {
                    var11 = param4.field_N;
                    break L4;
                  } else {
                    if (1 != this.field_f) {
                      if (2 == this.field_f) {
                        var11 = -(var10 * this.field_p) + (-param4.field_K + this.field_h);
                        break L4;
                      } else {
                        L5: {
                          var12 = (-(this.field_p * var10) + this.field_h) / (1 + var10);
                          if (-1 < (var12 ^ -1)) {
                            var12 = 0;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        this.field_p = this.field_p + var12;
                        var11 = var12 + param4.field_N;
                        break L4;
                      }
                    } else {
                      var11 = (this.field_h + -(var10 * this.field_p) >> -704354079) + param4.field_N;
                      break L4;
                    }
                  }
                }
                var12 = 0;
                L6: while (true) {
                  if (var10 <= var12) {
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    L7: {
                      var13 = var16[var12];
                      stackIn_38_0 = null;

                      stackIn_38_1 = null;

                      stackIn_38_2 = var11 + -param4.field_N;

                      stackIn_38_3 = var11 + param4.field_K;

                      if (var13 != null) {
                        stackIn_39_0 = null;
                        stackIn_39_1 = null;
                        stackIn_39_2 = stackIn_38_2;
                        stackIn_39_3 = stackIn_38_3;
                        stackIn_39_4 = var13.length();
                        break L7;
                      } else {
                        stackIn_39_0 = null;
                        stackIn_39_1 = null;
                        stackIn_39_2 = stackIn_38_2;
                        stackIn_39_3 = stackIn_38_3;
                        stackIn_39_4 = 0;
                        break L7;
                      }
                    }
                    L8: {
                      var14 = new bk(stackIn_39_2, stackIn_39_3, stackIn_39_4);
                      var14.field_j[0] = 0;
                      if (var13 != null) {
                        L9: {
                          var14.field_j[var13.length()] = param4.b(var13);
                          stackIn_43_0 = (String) (var13);

                          stackIn_43_1 = (bk) (var14);

                          stackIn_43_2 = (jb) (param4);

                          stackIn_43_3 = 0;

                          if (-4 == (param5 ^ -1)) {
                            stackIn_44_0 = (String) ((Object) stackIn_43_0);
                            stackIn_44_1 = (bk) ((Object) stackIn_43_1);
                            stackIn_44_2 = (jb) ((Object) stackIn_43_2);
                            stackIn_44_3 = stackIn_43_3;
                            stackIn_44_4 = this.a(param4.b(var13), (byte) -126, param3, var13);
                            break L9;
                          } else {
                            stackIn_44_0 = (String) ((Object) stackIn_43_0);
                            stackIn_44_1 = (bk) ((Object) stackIn_43_1);
                            stackIn_44_2 = (jb) ((Object) stackIn_43_2);
                            stackIn_44_3 = stackIn_43_3;
                            stackIn_44_4 = 0;
                            break L9;
                          }
                        }
                        la.a(stackIn_44_0, stackIn_44_1, stackIn_44_2, stackIn_44_3 != 0, stackIn_44_4);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    this.field_c[var12] = var14;
                    var11 = var11 + param7;
                    var12++;
                    continue L6;
                  }
                }
              } else {
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var9 = decompiledCaughtException;
            stackIn_49_0 = (RuntimeException) (var9);

            stackIn_49_1 = new StringBuilder().append("we.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_50_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackIn_50_2 = "null";
              break L10;
            } else {
              stackIn_50_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackIn_50_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_52_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "null";
              break L11;
            } else {
              stackIn_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "{...}";
              break L11;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_50_0), stackIn_53_2 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    public static void c(int param0) {
        if (param0 != 0) {
            field_n = (String) null;
        }
        field_e = null;
        field_k = null;
        field_m = null;
        field_n = null;
    }

    private final bk a(String param0, int param1, int param2, jb param3) {
        bk var5 = null;
        RuntimeException var5_ref = null;
        bk var6 = null;
        bk stackIn_3_0 = null;
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
              if (param2 == -19395) {
                break L1;
              } else {
                we.a(-73, 23, -34, 70, true, 88, 94);
                break L1;
              }
            }
            var6 = new bk(-param3.field_N + param1, param1 + param3.field_K, param0.length());
            var5 = var6;
            this.field_c = new bk[]{var6};
            stackIn_3_0 = (bk) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5_ref);

            stackIn_6_1 = new StringBuilder().append("we.F(");

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


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw oi.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5, boolean param6) {
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        var13 = TetraLink.field_J;
        try {
          L0: {
            var7_int = li.field_l[0].field_t + (param5 - 3);
            var8 = param0 + li.field_l[0].field_F + -3;
            var9 = -li.field_l[2].field_t + -li.field_l[0].field_t + param2 - -6;
            var10 = -li.field_l[6].field_F + (-li.field_l[0].field_F + 6 + param3);
            var11 = 0;
            L1: while (true) {
              if (var11 >= 48) {
                L2: {
                  if (param6) {
                    stackIn_10_0 = 244;
                    break L2;
                  } else {
                    stackIn_10_0 = 4;
                    break L2;
                  }
                }
                L3: {
                  var11 = stackIn_10_0;
                  ra.c(48 + var7_int, var8, var9 + -96, var10, var11);
                  qj.a(param2, (byte) -36, li.field_l, param5, param3, param0);
                  if (param4 > 39) {
                    break L3;
                  } else {
                    field_e = (mk) null;
                    break L3;
                  }
                }
                break L0;
              } else {
                L4: {
                  if (param6) {
                    stackIn_6_0 = var11 * 5 + 4;
                    break L4;
                  } else {
                    stackIn_6_0 = -(var11 * 5) + 239;
                    break L4;
                  }
                }
                var12 = stackIn_6_0;
                ra.c(var11 + var7_int, var8, var10, var12);
                ra.c(-var11 + (-1 + var7_int) - -var9, var8, var10, var12);
                var11++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var7), "we.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public we() {
    }

    static {
        field_n = "Not available in 2D mode";
        field_m = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
    }
}
