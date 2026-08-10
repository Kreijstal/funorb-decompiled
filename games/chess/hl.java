/*
 * Decompiled by CFR-JS 0.4.0.
 */
class hl implements jm, mg {
    static String field_a;
    int field_m;
    static String field_f;
    int field_g;
    private boolean field_o;
    int field_j;
    int field_p;
    private int field_b;
    static ci field_d;
    int field_c;
    int field_i;
    lh field_e;
    int field_r;
    static boolean field_h;
    int field_n;
    static String field_q;
    int field_k;
    int field_l;

    public void a(byte param0, int param1, int param2, boolean param3, mf param4) {
        if (!(this.field_e != null)) {
            return;
        }
        try {
            this.a(param1, false, param2, param4);
            if (param0 < 58) {
                this.field_i = -19;
            }
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "hl.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    private final int a(int param0, int param1, int param2, mf param3) {
        RuntimeException var5 = null;
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
            if (param1 == 2668) {
              stackIn_4_0 = param2 - -param3.field_u - -this.field_r + (param3.field_A + param0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -91;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("hl.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

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
          throw fk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void a(hl param0, int param1) {
        try {
            param0.field_b = this.field_b;
            param0.field_p = this.field_p;
            param0.field_m = this.field_m;
            param0.field_k = this.field_k;
            param0.field_l = this.field_l;
            param0.field_r = this.field_r;
            param0.field_j = this.field_j;
            param0.field_c = this.field_c;
            param0.field_o = this.field_o;
            param0.field_i = this.field_i;
            param0.field_g = this.field_g;
            param0.field_e = this.field_e;
            param0.field_n = this.field_n;
            if (param1 != -1053) {
                mf var4 = (mf) null;
                this.a(60, -118, 79, 112, (mf) null, 19);
            }
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "hl.BA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(int param0, boolean param1, int param2, mf param3) {
        try {
            this.a((byte) 119, param2, param3, param0, this.field_b, this.field_g, 0, 0);
            if (param1) {
                this.field_n = -109;
            }
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "hl.EA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    hl(lh param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    private final int a(int param0, mf param1, int param2, int param3) {
        RuntimeException var5 = null;
        mf var6 = null;
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
              if (param0 >= 23) {
                break L1;
              } else {
                var6 = (mf) null;
                this.a((byte) -15, (mf) null);
                break L1;
              }
            }
            stackIn_3_0 = this.field_m + (param3 + (param1.field_r - -param1.field_k - -param2));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("hl.S(").append(param0).append(',');

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
          throw fk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    public final int a(int param0, int param1, int param2, int param3, mf param4, int param5) {
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
              this.a(param4, -23159);
              if (param2 == -4) {
                break L1;
              } else {
                this.field_c = -125;
                break L1;
              }
            }
            stackIn_3_0 = param4.field_t.a(param0 - this.a(0, param1, param4), 57, -this.a(param4, param3, param2 ^ 1581179901) + param5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7);

            stackIn_6_1 = new StringBuilder().append("hl.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

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
          throw fk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param5 + ')');
        }
        return stackIn_3_0;
    }

    public final int b(mf param0, int param1) {
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
              if (param1 == 0) {
                break L1;
              } else {
                this.a((byte) 49);
                break L1;
              }
            }
            stackIn_3_0 = param0.field_y - (this.field_r + this.field_n);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("hl.T(");

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
          throw fk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public final int a(int param0, int param1, mf param2) {
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
            if (param0 == 0) {
              stackIn_4_0 = this.a(107, param2, 0, param1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 24;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("hl.CA(").append(param0).append(',').append(param1).append(',');

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
          throw fk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public final int a(mf param0, int param1, int param2) {
        RuntimeException var4 = null;
        hl var5 = null;
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
              if (param2 == -1581179903) {
                break L1;
              } else {
                var5 = (hl) null;
                this.a((hl) null, 101);
                break L1;
              }
            }
            stackIn_3_0 = this.a(0, 2668, param1, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("hl.AA(");

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
          throw fk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    private final void a(byte param0, int param1, mf param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = Chess.field_G;
        try {
          L0: {
            L1: {
              cf.b(param2.field_r + (param1 - -param2.field_C), param2.field_y + param2.field_u + param3, param2.field_r + param1, 80, param3 + param2.field_u);
              var11 = 36 / ((param0 - 29) / 47);
              var9_int = this.b(param2, 0);
              var10 = this.c((byte) 18, param2);
              if (this.field_o) {
                this.field_e.a(this.a(-29558, param2), this.a(param6, 2668, param3, param2), this.a(122, param2, param7, param1), var9_int, var10, param5, param4, this.field_l, this.field_c, this.field_j);
                break L1;
              } else {
                L2: {
                  var13 = this.field_c;
                  if (0 == var13) {
                    var12 = this.field_e.field_C;
                    break L2;
                  } else {
                    if ((var13 ^ -1) == -3) {
                      var12 = var10 - this.field_e.field_t;
                      break L2;
                    } else {
                      L3: {
                        if (-4 != (var13 ^ -1)) {
                          if (1 != var13) {
                            break L3;
                          } else {
                            break L3;
                          }
                        } else {
                          break L3;
                        }
                      }
                      var12 = this.field_e.field_C - -(-this.field_e.field_t + var10 + -this.field_e.field_C >> 1342021409);
                      break L2;
                    }
                  }
                }
                L4: {
                  var13 = this.field_l;
                  if (-1 == (var13 ^ -1)) {
                    break L4;
                  } else {
                    if ((var13 ^ -1) != -4) {
                      if ((var13 ^ -1) != -2) {
                        if ((var13 ^ -1) == -3) {
                          this.field_e.c(this.a(-29558, param2), var9_int + this.a(param6, 2668, param3, param2), var12 + this.a(37, param2, param7, param1), param5, param4);
                          break L1;
                        } else {
                          break L1;
                        }
                      } else {
                        this.field_e.b(this.a(-29558, param2), this.a(param6, 2668, param3, param2) - -(var9_int >> 477419905), var12 + this.a(100, param2, param7, param1), param5, param4);
                        break L1;
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                this.field_e.a(this.a(-29558, param2), this.a(param6, 2668, param3, param2), this.a(117, param2, param7, param1) - -var12, param5, param4);
                break L1;
              }
            }
            fd.a(28773);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var9 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var9);

            stackIn_26_1 = new StringBuilder().append("hl.LA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw fk.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static void a(int param0, boolean param1) {
        ci stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        ci stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        ci stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        ci stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        ci stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        ci stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        ci stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        ci stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_28_2 = 0;
        ci stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        ci stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int stackIn_37_2 = 0;
        ci stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        ci stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int stackIn_41_2 = 0;
        L0: {
          if (param0 == -416228287) {
            break L0;
          } else {
            hl.a(60, false);
            break L0;
          }
        }
        L1: {
          cf.b(wb.field_c, wb.field_h - -640 >> -416228287, 0, param0 ^ -416228335, -640 + wb.field_h >> 1387660993);
          if (an.field_e <= 0) {
            break L1;
          } else {
            L2: {
              if (null != ig.field_h) {
                ig.field_h.d(ql.field_d.field_mb, 0);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                stackIn_9_0 = ql.field_d;

                stackIn_9_1 = 0;

                if (!param1) {
                  break L4;
                } else {
                  stackIn_9_0 = (ci) ((Object) stackIn_9_0);

                  if (fm.field_V) {
                    break L4;
                  } else {
                    stackIn_10_0 = (ci) ((Object) stackIn_9_0);
                    stackIn_10_1 = stackIn_9_1;
                    stackIn_10_2 = 1;
                    break L3;
                  }
                }
              }
              stackIn_10_0 = (ci) ((Object) stackIn_9_0);
              stackIn_10_1 = stackIn_9_1;
              stackIn_10_2 = 0;
              break L3;
            }
            L5: {
              L6: {
                ((ci) (Object) stackIn_10_0).a(stackIn_10_1 != 0, stackIn_10_2 != 0);
                stackIn_13_0 = rb.field_c;

                stackIn_13_1 = 0;

                if (!param1) {
                  break L6;
                } else {
                  stackIn_13_0 = (ci) ((Object) stackIn_13_0);

                  if (fm.field_V) {
                    break L6;
                  } else {
                    stackIn_14_0 = (ci) ((Object) stackIn_13_0);
                    stackIn_14_1 = stackIn_13_1;
                    stackIn_14_2 = 1;
                    break L5;
                  }
                }
              }
              stackIn_14_0 = (ci) ((Object) stackIn_13_0);
              stackIn_14_1 = stackIn_13_1;
              stackIn_14_2 = 0;
              break L5;
            }
            ((ci) (Object) stackIn_14_0).a(stackIn_14_1 != 0, stackIn_14_2 != 0);
            break L1;
          }
        }
        if ((aj.field_c ^ -1) < -1) {
          L7: {
            if (ig.field_h != null) {
              ig.field_h.d(fm.field_T.field_mb, 0);
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            L9: {
              stackIn_36_0 = fm.field_T;

              stackIn_36_1 = 0;

              if (!param1) {
                break L9;
              } else {
                stackIn_36_0 = (ci) ((Object) stackIn_36_0);

                if (jh.field_a) {
                  break L9;
                } else {
                  stackIn_37_0 = (ci) ((Object) stackIn_36_0);
                  stackIn_37_1 = stackIn_36_1;
                  stackIn_37_2 = 1;
                  break L8;
                }
              }
            }
            stackIn_37_0 = (ci) ((Object) stackIn_36_0);
            stackIn_37_1 = stackIn_36_1;
            stackIn_37_2 = 0;
            break L8;
          }
          L10: {
            L11: {
              ((ci) (Object) stackIn_37_0).a(stackIn_37_1 != 0, stackIn_37_2 != 0);
              stackIn_40_0 = ri.field_k;

              stackIn_40_1 = 0;

              if (!param1) {
                break L11;
              } else {
                stackIn_40_0 = (ci) ((Object) stackIn_40_0);

                if (jh.field_a) {
                  break L11;
                } else {
                  stackIn_41_0 = (ci) ((Object) stackIn_40_0);
                  stackIn_41_1 = stackIn_40_1;
                  stackIn_41_2 = 1;
                  break L10;
                }
              }
            }
            stackIn_41_0 = (ci) ((Object) stackIn_40_0);
            stackIn_41_1 = stackIn_40_1;
            stackIn_41_2 = 0;
            break L10;
          }
          ((ci) (Object) stackIn_41_0).a(stackIn_41_1 != 0, stackIn_41_2 != 0);
          fd.a(28773);
          return;
        } else {
          L12: {
            if (-1 <= (ed.field_c ^ -1)) {
              break L12;
            } else {
              L13: {
                if (ig.field_h != null) {
                  ig.field_h.d(fm.field_T.field_mb, 0);
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                L15: {
                  stackIn_23_0 = fm.field_T;

                  stackIn_23_1 = 0;

                  if (!param1) {
                    break L15;
                  } else {
                    stackIn_23_0 = (ci) ((Object) stackIn_23_0);

                    if (jh.field_a) {
                      break L15;
                    } else {
                      stackIn_24_0 = (ci) ((Object) stackIn_23_0);
                      stackIn_24_1 = stackIn_23_1;
                      stackIn_24_2 = 1;
                      break L14;
                    }
                  }
                }
                stackIn_24_0 = (ci) ((Object) stackIn_23_0);
                stackIn_24_1 = stackIn_23_1;
                stackIn_24_2 = 0;
                break L14;
              }
              L16: {
                L17: {
                  ((ci) (Object) stackIn_24_0).a(stackIn_24_1 != 0, stackIn_24_2 != 0);
                  stackIn_27_0 = ri.field_k;

                  stackIn_27_1 = 0;

                  if (!param1) {
                    break L17;
                  } else {
                    stackIn_27_0 = (ci) ((Object) stackIn_27_0);

                    if (jh.field_a) {
                      break L17;
                    } else {
                      stackIn_28_0 = (ci) ((Object) stackIn_27_0);
                      stackIn_28_1 = stackIn_27_1;
                      stackIn_28_2 = 1;
                      break L16;
                    }
                  }
                }
                stackIn_28_0 = (ci) ((Object) stackIn_27_0);
                stackIn_28_1 = stackIn_27_1;
                stackIn_28_2 = 0;
                break L16;
              }
              ((ci) (Object) stackIn_28_0).a(stackIn_28_1 != 0, stackIn_28_2 != 0);
              break L12;
            }
          }
          fd.a(28773);
          return;
        }
    }

    public final int a(byte param0, mf param1) {
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
            var3_int = -7 % ((53 - param0) / 54);
            this.a(param1, -23159);
            stackIn_1_0 = param1.field_t.c((byte) -24) - (-this.field_r + -this.field_n);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("hl.P(").append(param0).append(',');

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
          throw fk.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    public final int a(boolean param0, mf param1) {
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
            this.a(param1, -23159);
            if (param0) {
              stackIn_4_0 = param1.field_t.a((byte) 34) - (-this.field_m - this.field_k);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 114;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("hl.O(").append(param0).append(',');

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
          throw fk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    String a(int param0, mf param1) {
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
            if (param0 == -29558) {
              stackIn_4_0 = param1.field_v;
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

            stackIn_7_1 = new StringBuilder().append("hl.Q(").append(param0).append(',');

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
          throw fk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public final int a(byte param0) {
        if (param0 < 52) {
            return 36;
        }
        return this.field_e.field_t + this.field_e.field_C;
    }

    public final void a(int param0, int param1, int param2, byte param3, mf param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        fj var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ub var13 = null;
        ub var14 = null;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_5_0;
        int stackIn_5_1;
        int stackIn_5_2;
        int stackIn_5_3;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param4.d((byte) -67)) {
                L2: {
                  var13 = this.a(param4, -23159);
                  var14 = var13;
                  var7 = var14.a((byte) -74, param1);
                  var8 = var13.field_a[var7];
                  var9 = var14.a(-5940, param1);
                  var10 = this.a(var9, 2668, param0, param4);
                  var11 = this.a(0, param2, param4) - -Math.max(0, var8.field_d);
                  stackIn_4_0 = this.a(0, param2, param4);

                  stackIn_4_1 = this.c((byte) 18, param4);

                  stackIn_4_2 = var8.field_e;

                  if (var14.field_a.length > var7 + 1) {
                    stackIn_5_0 = stackIn_4_0;
                    stackIn_5_1 = stackIn_4_1;
                    stackIn_5_2 = stackIn_4_2;
                    stackIn_5_3 = var13.field_a[1 + var7].field_d;
                    break L2;
                  } else {
                    stackIn_5_0 = stackIn_4_0;
                    stackIn_5_1 = stackIn_4_1;
                    stackIn_5_2 = stackIn_4_2;
                    stackIn_5_3 = var8.field_e;
                    break L2;
                  }
                }
                var12 = stackIn_5_0 - -Math.min(stackIn_5_1, Math.min(stackIn_5_2, stackIn_5_3));
                cf.b(param4.field_C + param2 - -param4.field_r, param4.field_y + param4.field_u + param0, param2 + param4.field_r, 80, param4.field_u + param0);
                a.field_a.a(var10, this.field_i, var10, var11, var12, false);
                fd.a(28773);
                break L1;
              } else {
                break L1;
              }
            }
            if (param3 <= -66) {
              break L0;
            } else {
              this.field_c = 69;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var6);

            stackIn_11_1 = new StringBuilder().append("hl.W(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    final static km a(int param0) {
        int var4_int = 0;
        int var5 = Chess.field_G;
        int var1 = b.field_c[0] * wm.field_b[0];
        byte[] var2 = vk.field_d[0];
        int[] var3 = new int[var1];
        for (var4_int = 0; var1 > var4_int; var4_int++) {
            var3[var4_int] = uh.field_r[ce.a((int) var2[var4_int], 255)];
        }
        km var4 = new km(cd.field_p, ek.field_a, be.field_a[0], a.field_c[param0], wm.field_b[0], b.field_c[0], var3);
        ch.k(4210752);
        return var4;
    }

    public static void a(boolean param0) {
        field_q = null;
        field_d = null;
        field_a = null;
        if (!param0) {
            field_f = (String) null;
            field_f = null;
            return;
        }
        field_f = null;
    }

    private final int c(byte param0, mf param1) {
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
              if (param0 == 18) {
                break L1;
              } else {
                field_q = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = -this.field_k + param1.field_C + -this.field_m;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("hl.V(").append(param0).append(',');

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
          throw fk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    private final void b(byte param0, mf param1) {
        int discarded$0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        mf var8 = null;
        var7 = Chess.field_G;
        try {
          L0: {
            L1: {
              if (param1.field_t != null) {
                break L1;
              } else {
                param1.field_t = (ub) ((Object) new ah());
                break L1;
              }
            }
            L2: {
              var3_int = this.b(param1, 0);
              var4 = this.c((byte) 18, param1);
              var6 = this.field_c;
              if (0 != var6) {
                if (-3 == (var6 ^ -1)) {
                  var5 = -this.field_e.field_t + var4;
                  break L2;
                } else {
                  L3: {
                    if ((var6 ^ -1) != -4) {
                      if (1 == var6) {
                        break L3;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  var5 = (-this.field_e.field_t + (-this.field_e.field_C + var4) >> -223214495) + this.field_e.field_C;
                  break L2;
                }
              } else {
                var5 = this.field_e.field_C;
                break L2;
              }
            }
            L4: {
              L5: {
                var6 = this.field_l;
                if (var6 != 0) {
                  if (-4 != (var6 ^ -1)) {
                    if ((var6 ^ -1) != -2) {
                      if (var6 != 2) {
                        break L4;
                      } else {
                        if (!(param1.field_t instanceof ah)) {
                          break L4;
                        } else {
                          ((ah) ((Object) param1.field_t)).a(0, var5, var3_int, this.a(-29558, param1), this.field_e);
                          break L4;
                        }
                      }
                    } else {
                      if (param1.field_t instanceof ah) {
                        ((ah) ((Object) param1.field_t)).a(0, this.a(-29558, param1), var3_int >> -1581179903, var5, this.field_e);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  } else {
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
              if (param1.field_t instanceof ah) {
                ((ah) ((Object) param1.field_t)).a(this.a(-29558, param1), 0, this.field_e, var5, 8829);
                break L4;
              } else {
                break L4;
              }
            }
            if (param0 > 72) {
              break L0;
            } else {
              var8 = (mf) null;
              discarded$0 = this.c((byte) -13, (mf) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var3);

            stackIn_34_1 = new StringBuilder().append("hl.IA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L6;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L6;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ')');
        }
    }

    public final ub a(mf param0, int param1) {
        RuntimeException var3 = null;
        ub stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != param0.field_t) {
                break L1;
              } else {
                param0.field_t = (ub) ((Object) new ah());
                break L1;
              }
            }
            L2: {
              if (!this.field_o) {
                this.b((byte) 97, param0);
                break L2;
              } else {
                ((ah) ((Object) param0.field_t)).a(this.field_l, (byte) 120, this.c((byte) 18, param0), this.field_j, this.field_c, this.a(param1 + -6399, param0), this.b(param0, 0), this.field_e);
                break L2;
              }
            }
            L3: {
              if (param1 == -23159) {
                break L3;
              } else {
                field_d = (ci) null;
                break L3;
              }
            }
            stackIn_8_0 = param0.field_t;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("hl.DA(");

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
          throw fk.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_8_0;
    }

    protected hl() {
    }

    public final void a(mf param0, int param1, int param2, int param3, int param4, int param5) {
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        fj var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        ub var17 = null;
        ub var18 = null;
        var16 = Chess.field_G;
        try {
          L0: {
            if (param5 == param2) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (!param0.d((byte) -67)) {
                  break L1;
                } else {
                  L2: {
                    var17 = this.a(param0, -23159);
                    var18 = var17;
                    if (param5 < param2) {
                      var9 = param2;
                      var8 = param5;
                      break L2;
                    } else {
                      var8 = param2;
                      var9 = param5;
                      break L2;
                    }
                  }
                  var10 = var18.a((byte) 126, var8);
                  var11 = var18.a((byte) 123, var9);
                  cf.b(param3 - -param0.field_r + param0.field_C, param0.field_y + param1 + param0.field_u, param3 + param0.field_r, 80, param0.field_u + param1);
                  var12 = var10;
                  L3: while (true) {
                    if (var11 < var12) {
                      fd.a(28773);
                      break L1;
                    } else {
                      L4: {
                        var13 = var17.field_a[var12];
                        if ((var12 ^ -1) == (var10 ^ -1)) {
                          stackIn_13_0 = var18.a(-5940, var8);
                          break L4;
                        } else {
                          stackIn_13_0 = var13.field_i[0];
                          break L4;
                        }
                      }
                      L5: {
                        var14 = stackIn_13_0;
                        if (var12 != var11) {
                          if (var13 == null) {
                            stackIn_18_0 = 0;
                            break L5;
                          } else {
                            stackIn_18_0 = var13.field_i[var13.field_i.length + -1];
                            break L5;
                          }
                        } else {
                          stackIn_18_0 = var18.a(-5940, var9);
                          break L5;
                        }
                      }
                      var15 = stackIn_18_0;
                      a.field_a.a(126, param0.field_k + this.field_m + (param0.field_r + param3) + var13.field_d, this.field_p, this.a(var14, 2668, param1, param0), var15 - var14, var13.field_e, this.field_p >>> -953177864);
                      var12++;
                      continue L3;
                    }
                  }
                }
              }
              var7_int = -16 % ((73 - param4) / 49);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var7 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var7);

            stackIn_24_1 = new StringBuilder().append("hl.FA(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L6;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L6;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    hl(lh param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
            this.field_b = param6;
            this.field_j = param9;
            this.field_k = param4;
            this.field_l = param7;
            this.field_m = param3;
            this.field_g = param5;
            this.field_i = param10;
            this.field_n = param2;
            this.field_c = param8;
            this.field_r = param1;
            this.field_p = param11;
            this.field_o = param12 ? true : false;
            this.field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "hl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    static {
        field_f = "Retry";
        field_a = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_q = "Type your email address again to make sure it's correct";
    }
}
