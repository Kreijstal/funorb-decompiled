/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve extends op {
    private String field_t;
    private int field_n;
    static long field_m;
    private boolean field_k;
    static int field_j;
    static int[] field_w;
    static String[][] field_q;
    static String field_o;
    private lr field_i;
    static ml field_l;
    private int field_r;
    private int field_s;
    private int field_u;
    private static int field_p;
    private int field_v;

    final static void a(int param0, int param1, int param2, nm param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            Pool.field_I = param3;
            bk.field_v = param2;
            if (param0 >= 106) {
              ld.field_b = param1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (runtimeException);

            stackIn_7_1 = new StringBuilder().append("ve.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw wm.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final vj a(lr param0, int param1, boolean param2, String param3) {
        vj var5 = null;
        RuntimeException var5_ref = null;
        vj stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2) {
                break L1;
              } else {
                this.field_t = (String) null;
                break L1;
              }
            }
            var5 = new vj(param1 - param0.field_C, param1 + param0.field_w, param3.length());
            this.field_b = new vj[]{var5};
            stackIn_4_0 = (vj) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5_ref);

            stackIn_8_1 = new StringBuilder().append("ve.P(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), stackIn_13_2 + ')');
        }
        return stackIn_4_0;
    }

    final void a(int param0, String param1, lr param2, boolean param3, int param4) {
        RuntimeException runtimeException = null;
        vj var6 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null != param1) {
              L1: {
                if (param2 != this.field_i) {
                  break L1;
                } else {
                  if (!this.field_k) {
                    break L1;
                  } else {
                    if (0 != this.field_s) {
                      break L1;
                    } else {
                      if (this.field_t == null) {
                        break L1;
                      } else {
                        if (!this.field_t.equals(param1)) {
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
              this.field_t = param1;
              this.field_s = 0;
              this.field_i = param2;
              this.field_k = param3;
              var6 = this.a(param2, param0, true, param1);
              var6.field_h[0] = param4;
              var6.field_h[param1.length()] = param4 + param2.b(param1);
              kh.a(param1, var6, 6110, 0, param2);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              this.field_b = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (runtimeException);

            stackIn_22_1 = new StringBuilder().append("ve.Q(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L2;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param2 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L3;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_23_0), stackIn_27_2 + ',' + param3 + ',' + param4 + ')');
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

    final static void b(byte param0) {
        int var1_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (-33 > (ec.field_b ^ -1)) {
                  break L2;
                } else {
                  ka.a(true, 0);
                  if (Pool.field_O == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                var1_int = ec.field_b % 32;
                if ((var1_int ^ -1) != -1) {
                  break L3;
                } else {
                  var1_int = 32;
                  break L3;
                }
              }
              ka.a(true, ec.field_b - var1_int);
              break L1;
            }
            var1_int = -10 / ((74 - param0) / 42);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1), "ve.M(" + param0 + ')');
        }
    }

    final static String d(int param0) {
        String var1 = null;
        RuntimeException var1_ref = null;
        String stackIn_14_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var1 = "";
              if (param0 >= 116) {
                break L1;
              } else {
                field_p = -70;
                break L1;
              }
            }
            L2: {
              if (null == vj.field_j) {
                break L2;
              } else {
                var1 = vj.field_j.h(-103);
                break L2;
              }
            }
            L3: {
              if (-1 == (var1.length() ^ -1)) {
                var1 = rf.a((byte) -119);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if ((var1.length() ^ -1) == -1) {
                var1 = tf.field_b;
                break L4;
              } else {
                break L4;
              }
            }
            stackIn_14_0 = (String) (var1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1_ref), "ve.J(" + param0 + ')');
        }
        return stackIn_14_0;
    }

    final void a(lr param0, int param1, int param2, String param3, boolean param4) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_31_1 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        vj var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        try {
          L0: {
            L1: {
              if (!param4) {
                break L1;
              } else {
                this.field_n = 107;
                break L1;
              }
            }
            if (null == param3) {
              this.field_b = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (param0 != this.field_i) {
                  break L2;
                } else {
                  if (!this.field_k) {
                    break L2;
                  } else {
                    if (this.field_s != 1) {
                      break L2;
                    } else {
                      if (null == this.field_t) {
                        break L2;
                      } else {
                        if (!this.field_t.equals(param3)) {
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
              this.field_k = true;
              this.field_s = 1;
              this.field_i = param0;
              var6 = this.a(param0, param2, true, param3);
              var7 = param0.b(param3);
              var6.field_h[0] = param1 + -(var7 >> -234683519);
              var6.field_h[param3.length()] = (var7 >> 1501618049) + param1;
              kh.a(param3, var6, 6110, 0, param0);
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6_ref = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var6_ref);

            stackIn_27_1 = new StringBuilder().append("ve.S(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L3;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L4;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_28_0), stackIn_32_2 + ',' + param4 + ')');
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

    final void a(String param0, lr param1, boolean param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        vj var6 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null == param0) {
              this.field_b = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!param2) {
                L1: {
                  if (param1 != this.field_i) {
                    break L1;
                  } else {
                    if (!this.field_k) {
                      break L1;
                    } else {
                      if (-3 != (this.field_s ^ -1)) {
                        break L1;
                      } else {
                        if (this.field_t == null) {
                          break L1;
                        } else {
                          if (this.field_t.equals(param0)) {
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            break L1;
                          }
                        }
                      }
                    }
                  }
                }
                this.field_t = param0;
                this.field_k = true;
                this.field_i = param1;
                this.field_s = 2;
                var6 = this.a(param1, param3, true, param0);
                var6.field_h[0] = param4 + -param1.b(param0);
                var6.field_h[param0.length()] = param4;
                kh.a(param0, var6, 6110, 0, param1);
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (runtimeException);

            stackIn_28_1 = new StringBuilder().append("ve.R(");

            if (param0 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L2;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');

            if (param1 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L3;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_29_0), stackIn_33_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
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

    final void a(int param0, String param1, lr param2, int param3, int param4, int param5, int param6, int param7) {
        vj stackIn_63_0;
        vj stackIn_63_1;
        int stackIn_63_2;
        int stackIn_63_3;
        vj stackIn_64_0 = null;
        vj stackIn_64_1 = null;
        int stackIn_64_2 = 0;
        int stackIn_64_3 = 0;
        int stackIn_64_4 = 0;
        String stackIn_70_0 = null;
        vj stackIn_70_1 = null;
        int stackIn_70_2 = 0;
        String stackIn_71_0;
        vj stackIn_71_1;
        int stackIn_71_2;
        int stackIn_71_3;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        StringBuilder stackIn_81_1 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_82_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String[] var9 = null;
        RuntimeException var9_ref = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        vj var14 = null;
        int var15 = 0;
        var15 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (param4 != param7) {
                break L1;
              } else {
                param4 = param2.field_G;
                break L1;
              }
            }
            if (param1 != null) {
              L2: {
                if (this.field_i != param2) {
                  break L2;
                } else {
                  if (this.field_k) {
                    break L2;
                  } else {
                    if ((param0 ^ -1) != (this.field_s ^ -1)) {
                      break L2;
                    } else {
                      if (this.field_r != param6) {
                        break L2;
                      } else {
                        if (param4 != this.field_v) {
                          break L2;
                        } else {
                          if (this.field_u != param3) {
                            break L2;
                          } else {
                            if ((this.field_n ^ -1) != (param5 ^ -1)) {
                              break L2;
                            } else {
                              if (this.field_t == null) {
                                break L2;
                              } else {
                                if (this.field_t.equals(param1)) {
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                } else {
                                  break L2;
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
                this.field_n = param5;
                this.field_s = param0;
                this.field_u = param3;
                this.field_v = param4;
                this.field_t = param1;
                this.field_r = param6;
                this.field_k = false;
                this.field_i = param2;
                var9 = new String[1 + param2.b(param1, param5)];
                var10 = Math.max(1, param2.a(param1, new int[]{param5}, var9));
                if (3 != this.field_r) {
                  break L3;
                } else {
                  if ((var10 ^ -1) == -2) {
                    this.field_r = 1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                L5: {
                  this.field_b = new vj[var10];
                  if ((this.field_r ^ -1) != -1) {
                    break L5;
                  } else {
                    var11 = param2.field_C;
                    if (var15 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  if ((this.field_r ^ -1) == -2) {
                    break L6;
                  } else {
                    L7: {
                      if (-3 == (this.field_r ^ -1)) {
                        break L7;
                      } else {
                        L8: {
                          var12 = (this.field_u + -(var10 * this.field_v)) / (1 + var10);
                          if (-1 < (var12 ^ -1)) {
                            var12 = 0;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var11 = var12 + param2.field_C;
                        this.field_v = this.field_v + var12;
                        if (var15 == 0) {
                          break L4;
                        } else {
                          break L7;
                        }
                      }
                    }
                    var11 = -(this.field_v * var10) + -param2.field_w + this.field_u;
                    if (var15 == 0) {
                      break L4;
                    } else {
                      break L6;
                    }
                  }
                }
                var11 = (this.field_u + -(this.field_v * var10) >> 826561569) + param2.field_C;
                break L4;
              }
              var12 = 0;
              L9: while (true) {
                L10: {
                  L11: {
                    if ((var10 ^ -1) >= (var12 ^ -1)) {
                      break L11;
                    } else {
                      var13 = var9[var12];
                      if (var15 != 0) {
                        break L10;
                      } else {
                        L12: {
                          stackIn_63_0 = null;

                          stackIn_63_1 = null;

                          stackIn_63_2 = -param2.field_C + var11;

                          stackIn_63_3 = param2.field_w + var11;

                          if (var13 == null) {
                            stackIn_64_0 = null;
                            stackIn_64_1 = null;
                            stackIn_64_2 = stackIn_63_2;
                            stackIn_64_3 = stackIn_63_3;
                            stackIn_64_4 = 0;
                            break L12;
                          } else {




                            stackIn_64_0 = null;
                            stackIn_64_1 = null;
                            stackIn_64_2 = stackIn_63_2;
                            stackIn_64_3 = stackIn_63_3;
                            stackIn_64_4 = var13.length();
                            break L12;
                          }
                        }
                        L13: {
                          var14 = new vj(stackIn_64_2, stackIn_64_3, stackIn_64_4);
                          var14.field_h[0] = 0;
                          if (null != var13) {
                            L14: {
                              var14.field_h[var13.length()] = param2.b(var13);
                              stackIn_70_0 = (String) (var13);

                              stackIn_70_1 = (vj) (var14);

                              stackIn_70_2 = 6110;

                              if (-4 == (param0 ^ -1)) {
                                stackIn_71_0 = (String) ((Object) stackIn_70_0);
                                stackIn_71_1 = (vj) ((Object) stackIn_70_1);
                                stackIn_71_2 = stackIn_70_2;
                                stackIn_71_3 = this.a(param2.b(var13), (byte) 105, var13, param5);
                                break L14;
                              } else {
                                stackIn_71_0 = (String) ((Object) stackIn_70_0);
                                stackIn_71_1 = (vj) ((Object) stackIn_70_1);
                                stackIn_71_2 = stackIn_70_2;
                                stackIn_71_3 = 0;
                                break L14;
                              }
                            }
                            kh.a(stackIn_71_0, stackIn_71_1, stackIn_71_2, stackIn_71_3, param2);
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                        this.field_b[var12] = var14;
                        var11 = var11 + param4;
                        var12++;
                        if (var15 == 0) {
                          continue L9;
                        } else {
                          break L11;
                        }
                      }
                    }
                  }
                  break L10;
                }
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              this.field_b = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var9_ref = decompiledCaughtException;
            stackIn_77_0 = (RuntimeException) (var9_ref);

            stackIn_77_1 = new StringBuilder().append("ve.O(").append(param0).append(',');

            if (param1 == null) {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackIn_78_2 = "null";
              break L15;
            } else {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackIn_78_2 = "{...}";
              break L15;
            }
          }
          L16: {


            stackIn_81_1 = ((StringBuilder) (Object) stackIn_78_1).append(stackIn_78_2).append(',');

            if (param2 == null) {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackIn_82_1 = (StringBuilder) ((Object) stackIn_81_1);
              stackIn_82_2 = "null";
              break L16;
            } else {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackIn_82_1 = (StringBuilder) ((Object) stackIn_81_1);
              stackIn_82_2 = "{...}";
              break L16;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_78_0), stackIn_82_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
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

    public ve() {
    }

    final static void a(int param0, boolean param1, int[] param2, boolean param3, boolean param4, int[] param5, oc param6) {
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_65_2 = null;
        StringBuilder stackIn_68_1 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        StringBuilder stackIn_72_1 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
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
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        try {
          L0: {
            L1: {
              var7_int = 2147483647;
              var8 = -2147483648;
              var21 = param2[3] >> 2134879330;
              var22 = param2[4] >> -130093950;
              var23 = param2[5] >> -110279038;
              var24 = param2[6] >> -1188415262;
              var25 = param2[7] >> 1892543618;
              var26 = param2[8] >> -1026156862;
              var27 = param2[9] >> -505187422;
              var28 = param2[10] >> 778263874;
              var13 = var26 * param5[5] + var24 * param5[3] + param5[4] * var25 >> 444695118;
              var12 = param5[5] * var23 + (var21 * param5[3] + param5[4] * var22) >> 346934382;
              var29 = param2[11] >> -987077374;
              var17 = param5[8] * var29 + var27 * param5[6] - -(param5[7] * var28) >> 895884046;
              var19 = param5[9] * var24 + param5[10] * var25 + param5[11] * var26 >> -1790345042;
              var16 = param5[6] * var24 - (-(param5[7] * var25) + -(var26 * param5[8])) >> 1955852110;
              if (param0 == -3) {
                break L1;
              } else {
                field_l = (ml) null;
                break L1;
              }
            }
            var15 = var23 * param5[8] + (param5[7] * var22 + param5[6] * var21) >> 32830702;
            var18 = var23 * param5[11] + var21 * param5[9] + param5[10] * var22 >> 707962414;
            var14 = param5[5] * var29 + var27 * param5[3] - -(param5[4] * var28) >> -714157042;
            var20 = var29 * param5[11] + (var27 * param5[9] - -(param5[10] * var28)) >> 279567310;
            var21 = param5[0] - param2[0];
            var22 = param5[1] - param2[1];
            var23 = -param2[2] + param5[2];
            var9 = param2[3] * var21 - -(var22 * param2[4]) + param2[5] * var23 >> 16 + -ob.field_i;
            var10 = param2[8] * var23 + var21 * param2[6] + var22 * param2[7] >> 16 - ob.field_i;
            var11 = var21 * param2[9] - (-(var22 * param2[10]) + -(var23 * param2[11])) >> -604982608;
            var21 = fb.field_q;
            var22 = fb.field_d;
            var23 = 0;
            L2: while (true) {
              if (param6.field_k <= var23) {
                L3: {
                  if (param6.field_g == null) {
                    break L3;
                  } else {
                    if (param6.field_e == null) {
                      break L3;
                    } else {
                      if (param6.field_D == null) {
                        break L3;
                      } else {
                        if (null == param6.field_C) {
                          break L3;
                        } else {
                          if (null == param6.field_M) {
                            break L3;
                          } else {
                            if (null == param6.field_c) {
                              break L3;
                            } else {
                              if (null == param6.field_J) {
                                break L3;
                              } else {
                                if (null == param6.field_A) {
                                  break L3;
                                } else {
                                  if (null != param6.field_E) {
                                    var23 = 0;
                                    L4: while (true) {
                                      if ((var23 ^ -1) <= (param6.field_d ^ -1)) {
                                        break L3;
                                      } else {
                                        var24 = param6.field_g[var23];
                                        var25 = param6.field_e[var23];
                                        var26 = param6.field_D[var23];
                                        ap.field_B[var23] = (var25 * var15 + var24 * var12 + var18 * var26 >> -1686093456) + var9;
                                        ge.field_p[var23] = var10 - -(var16 * var25 + (var24 * var13 - -(var26 * var19)) >> -1140514768);
                                        dn.field_n[var23] = (var26 * var20 + var17 * var25 + var24 * var14 >> 56117584) + var11;
                                        var24 = param6.field_C[var23];
                                        var25 = param6.field_M[var23];
                                        var26 = param6.field_c[var23];
                                        hp.field_d[var23] = (var18 * var26 + (var24 * var12 - -(var15 * var25)) >> -1009593456) + var9;
                                        fj.field_g[var23] = (var26 * var19 + (var16 * var25 + var24 * var13) >> -673112816) + var10;
                                        kn.field_c[var23] = (var24 * var14 + (var25 * var17 + var20 * var26) >> 363905264) + var11;
                                        var24 = param6.field_J[var23];
                                        var25 = param6.field_A[var23];
                                        var26 = param6.field_E[var23];
                                        sl.field_P[var23] = var9 - -(var18 * var26 + var24 * var12 - -(var25 * var15) >> 745854128);
                                        oi.field_w[var23] = (var26 * var19 + var25 * var16 + var24 * var13 >> 464949168) + var10;
                                        mp.field_P[var23] = var11 + (var17 * var25 + var14 * var24 + var26 * var20 >> -2082029648);
                                        var23++;
                                        continue L4;
                                      }
                                    }
                                  } else {
                                    break L3;
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
                L5: {
                  if (!param4) {
                    break L5;
                  } else {
                    var9 = param5[3];
                    var10 = param5[4];
                    var11 = param5[5];
                    var12 = param5[6];
                    var13 = param5[7];
                    var14 = param5[8];
                    var15 = param5[9];
                    var16 = param5[10];
                    var17 = param5[11];
                    var18 = 0;
                    L6: while (true) {
                      if ((param6.field_o ^ -1) >= (var18 ^ -1)) {
                        break L5;
                      } else {
                        if (oj.field_r.length <= var18) {
                          break L5;
                        } else {
                          var19 = param6.field_Q[var18];
                          var20 = param6.field_p[var18];
                          var21 = param6.field_j[var18];
                          oj.field_r[var18] = var15 * var21 + (var12 * var20 + var19 * var9) >> -1312138960;
                          wa.field_mb[var18] = var16 * var21 + var20 * var13 + var10 * var19 >> -794223920;
                          al.field_g[var18] = var21 * var17 + var19 * var11 + var20 * var14 >> 1289253136;
                          var18++;
                          continue L6;
                        }
                      }
                    }
                  }
                }
                ej.a(param3, var8, var7_int, (byte) 48, param6);
                break L0;
              } else {
                L7: {
                  var24 = param6.field_m[var23];
                  var25 = param6.field_s[var23];
                  var26 = param6.field_l[var23];
                  var27 = var9 - -(var18 * var26 + var15 * var25 + var24 * var12 >> -ob.field_i + 16);
                  var28 = (var26 * var19 + (var16 * var25 + var24 * var13) >> -ob.field_i + 16) + var10;
                  var29 = (var20 * var26 + var24 * var14 + var17 * var25 >> -501311792) + var11;
                  if ((var29 ^ -1) > -51) {
                    fe.field_L[var23] = -2147483648;
                    break L7;
                  } else {
                    L8: {
                      ch.field_M[var23] = var21 + var27 / var29;
                      li.field_h[var23] = var22 + var28 / var29;
                      if (var29 > var8) {
                        var8 = var29;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (var29 < var7_int) {
                        var7_int = var29;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    fe.field_L[var23] = var29;
                    break L7;
                  }
                }
                L10: {
                  if (!param1) {
                    break L10;
                  } else {
                    ie.field_d[var23] = var27 >> ob.field_i;
                    vj.field_a[var23] = var28 >> ob.field_i;
                    ja.field_d[var23] = var29;
                    break L10;
                  }
                }
                var23++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var7 = decompiledCaughtException;
            stackIn_64_0 = (RuntimeException) (var7);

            stackIn_64_1 = new StringBuilder().append("ve.N(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_65_0 = (RuntimeException) ((Object) stackIn_64_0);
              stackIn_65_1 = (StringBuilder) ((Object) stackIn_64_1);
              stackIn_65_2 = "null";
              break L11;
            } else {
              stackIn_65_0 = (RuntimeException) ((Object) stackIn_64_0);
              stackIn_65_1 = (StringBuilder) ((Object) stackIn_64_1);
              stackIn_65_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_68_1 = ((StringBuilder) (Object) stackIn_65_1).append(stackIn_65_2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_65_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackIn_69_2 = "null";
              break L12;
            } else {
              stackIn_65_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackIn_69_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_72_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_69_2).append(',');

            if (param6 == null) {
              stackIn_65_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "null";
              break L13;
            } else {
              stackIn_65_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "{...}";
              break L13;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_65_0), stackIn_73_2 + ')');
        }
    }

    public static void c(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              field_l = null;
              field_w = null;
              field_q = (String[][]) null;
              if (param0 == -13268) {
                break L1;
              } else {
                field_p = 75;
                break L1;
              }
            }
            field_o = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1), "ve.K(" + param0 + ')');
        }
    }

    static {
        field_q = new String[][]{new String[]{"60", "45", "30", "20", "15", "10"}, null, null, null};
        field_o = "Allow spectators?";
        field_p = 16;
        field_j = 1 << field_p;
        field_l = new ml("");
    }
}
