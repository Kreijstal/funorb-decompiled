/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qn extends al {
    static je field_t;
    private dg field_u;
    private dg[] field_q;
    static int[] field_s;
    static hl field_r;
    static String field_v;

    final static void a(boolean param0, byte[] param1, byte[] param2, String[][] param3, oh[][] param4, boolean param5, oh[][] param6, String[][] param7, ah param8, ah param9, int[] param10, int param11, int param12, String[] param13, ah param14) {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var15 = null;
        kh[] var16 = null;
        int[] var17 = null;
        try {
          L0: {
            L1: {
              var17 = (int[]) null;
              var16 = (kh[]) null;
              c.a(param6, param2, param14, (byte) -35, param1, param7, (int[]) null, param12, param3, param10, param13, param9, param8, (kh[]) null, param5, param11, param4);
              if (!param0) {
                break L1;
              } else {
                qn.a(-32);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var15 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var15);

            stackIn_5_1 = new StringBuilder().append("qn.Q(").append(param0).append(',');

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
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param4 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param7 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L7;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

            if (param8 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L8;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');

            if (param9 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L9;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');

            if (param10 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L10;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',').append(param11).append(',').append(param12).append(',');

            if (param13 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L11;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_35_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',');

            if (param14 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L12;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L12;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_6_0), stackIn_36_2 + ')');
        }
    }

    private final void a(qn param0, byte param1, boolean param2) {
        dg dupTemp$2 = null;
        int var4_int = 0;
        dg var5 = null;
        dg var6 = null;
        int var7 = 0;
        dg stackIn_10_0 = null;
        dg stackIn_11_0 = null;
        dg stackIn_11_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var7 = TetraLink.field_J;
        try {
          L0: {
            if (param1 >= 28) {
              L1: {
                super.a(0, param0);
                if (param2) {
                  var4_int = 0;
                  L2: while (true) {
                    if (var4_int >= 6) {
                      break L1;
                    } else {
                      L3: {
                        var5 = this.field_q[var4_int];
                        if (var5 == null) {
                          param0.field_q[var4_int] = null;
                          break L3;
                        } else {
                          L4: {
                            var6 = param0.field_q[var4_int];
                            stackIn_10_0 = (dg) (var5);

                            if (var6 == null) {
                              dupTemp$2 = new dg();
                              param0.field_q[var4_int] = dupTemp$2;
                              stackIn_11_0 = (dg) ((Object) stackIn_10_0);
                              stackIn_11_1 = (dg) (dupTemp$2);
                              break L4;
                            } else {
                              stackIn_11_0 = (dg) ((Object) stackIn_10_0);
                              stackIn_11_1 = (dg) (var6);
                              break L4;
                            }
                          }
                          ((dg) (Object) stackIn_11_0).a(stackIn_11_1, -73);
                          break L3;
                        }
                      }
                      var4_int++;
                      continue L2;
                    }
                  }
                } else {
                  rd.a(this.field_q, 0, param0.field_q, 0, 6);
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("qn.P(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_r = null;
        field_s = null;
        field_v = null;
        field_t = null;
        if (param0 != 24468) {
            qn.a(-59);
        }
    }

    final void a(oh[] param0, int param1) {
        dg[] var3 = null;
        int var4 = 0;
        dg var5 = null;
        int var6 = 0;
        qn var7 = null;
        dg[] var8 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (param1 < -31) {
                break L1;
              } else {
                var7 = (qn) null;
                this.a((qn) null, (byte) -119, true);
                break L1;
              }
            }
            var8 = this.field_q;
            var3 = var8;
            var4 = 0;
            L2: while (true) {
              if (var8.length <= var4) {
                break L0;
              } else {
                L3: {
                  var5 = var8[var4];
                  if (var5 != null) {
                    var5.field_k = param0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3_ref);

            stackIn_12_1 = new StringBuilder().append("qn.J(");

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
          throw oi.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, oh[] param2) {
        int var4_int = param0;
        if (!(null != this.field_q[var4_int])) {
            this.field_q[var4_int] = new dg();
        }
        if (param1 != -1664329560) {
            return;
        }
        try {
            this.field_q[param0].field_k = param2;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "qn.K(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(na param0, int param1, int param2, boolean param3, boolean param4) {
        na stackIn_3_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        dg var7 = null;
        dg var9 = null;
        ae var10 = null;
        dg var11 = null;
        dg var12 = null;
        dg var13 = null;
        dg var14 = null;
        try {
          L0: {
            L1: {
              if (!(param0 instanceof ae)) {
                stackIn_3_0 = null;
                break L1;
              } else {
                stackIn_3_0 = (na) (param0);
                break L1;
              }
            }
            L2: {
              var10 = (ae) ((Object) stackIn_3_0);
              kl.a(param0.field_F + param0.field_t + param1, param2 + (param0.field_w - -param0.field_u), param0.field_w + param2, (byte) -79, param0.field_t + param1);
              if (var10 != null) {
                param4 = param4 & var10.field_K;
                break L2;
              } else {
                break L2;
              }
            }
            var7 = this.field_q[0];
            this.field_u.a(30033);
            var7.a(param2, param0, this.field_u, param3, param1, (qn) (this));
            if (param3) {
              L3: {
                if (var10 != null) {
                  L4: {
                    if (!var10.field_N) {
                      break L4;
                    } else {
                      var11 = this.field_q[1];
                      if (var11 == null) {
                        break L4;
                      } else {
                        var11.a(param2, param0, this.field_u, true, param1, (qn) (this));
                        break L4;
                      }
                    }
                  }
                  if (var10.field_r) {
                    L5: {
                      var12 = this.field_q[3];
                      if (var10.field_x == 0) {
                        break L5;
                      } else {
                        if (var12 != null) {
                          var12.a(param2, param0, this.field_u, param3, param1, (qn) (this));
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var9 = this.field_q[2];
                    if (var9 != null) {
                      var9.a(param2, param0, this.field_u, param3, param1, (qn) (this));
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              L6: {
                if (!param0.c(3)) {
                  break L6;
                } else {
                  var13 = this.field_q[5];
                  if (var13 != null) {
                    var13.a(param2, param0, this.field_u, true, param1, (qn) (this));
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
              L7: {
                if (param4) {
                  break L7;
                } else {
                  var14 = this.field_q[4];
                  if (var14 != null) {
                    var14.a(param2, param0, this.field_u, param3, param1, (qn) (this));
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
              this.field_u.a(46, param2, param1, (qn) (this), param0);
              dh.a(-581);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6 = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var6);

            stackIn_34_1 = new StringBuilder().append("qn.L(");

            if (param0 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L8;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L8;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, int param1) {
        bf var2 = null;
        int var3 = 0;
        boolean stackIn_14_0 = false;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = TetraLink.field_J;
        try {
          L0: {
            wb.field_c = param0;
            if (param1 == 128) {
              var2 = (bf) ((Object) ha.field_b.c(false));
              L1: while (true) {
                if (var2 == null) {
                  L2: {
                    if (gi.field_d != null) {
                      var2 = (bf) ((Object) gi.field_d.c(false));
                      L3: while (true) {
                        if (var2 == null) {
                          break L2;
                        } else {
                          stackIn_14_0 = var2.field_q.a((byte) 95);
                          L4: {
                            if (!stackIn_14_0) {
                              var2.b(false);
                              break L4;
                            } else {
                              var2.field_t.f(128 + wb.field_c * var2.field_u >> 465027432);
                              break L4;
                            }
                          }
                          var2 = (bf) ((Object) gi.field_d.a((byte) -70));
                          continue L3;
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L5: {
                    if (var2.field_q.a((byte) 95)) {
                      var2.field_t.f(128 + var2.field_u * wb.field_c >> -1664329560);
                      break L5;
                    } else {
                      var2.b(false);
                      break L5;
                    }
                  }
                  var2 = (bf) ((Object) ha.field_b.a((byte) -70));
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var2_ref), "qn.M(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    qn(qn param0, boolean param1) {
        this();
        try {
            param0.a((qn) (this), (byte) 52, param1);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "qn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(oh param0, byte param1) {
        dg[] var3 = null;
        int var4 = 0;
        dg var5 = null;
        int var6 = 0;
        dg[] var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              var7 = this.field_q;
              var3 = var7;
              if (param1 == 71) {
                break L1;
              } else {
                field_r = (hl) null;
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var4 >= var7.length) {
                break L0;
              } else {
                L3: {
                  var5 = var7[var4];
                  if (var5 == null) {
                    break L3;
                  } else {
                    var5.field_n = param0;
                    break L3;
                  }
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("qn.O(");

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
          throw oi.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    public qn() {
        this.field_q = new dg[6];
        this.field_u = new dg();
        dg dupTemp$0 = new dg();
        this.field_q[0] = dupTemp$0;
        dg var1 = dupTemp$0;
        var1.a(30033);
    }

    final dg a(byte param0, int param1) {
        if (param0 != -41) {
            return (dg) null;
        }
        dg dupTemp$0 = new dg();
        this.field_q[param1] = dupTemp$0;
        return dupTemp$0;
    }

    static {
        field_t = new je();
        field_s = new int[]{2};
        field_v = "Set up new game";
    }
}
