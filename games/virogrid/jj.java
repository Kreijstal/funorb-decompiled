/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj {
    private int field_j;
    private int field_b;
    private boolean field_d;
    private int field_e;
    mg[] field_k;
    private int field_l;
    mg field_c;
    static hh field_f;
    static String field_g;
    static km field_a;
    static km field_m;
    static String field_i;
    private int field_h;
    static uk field_n;

    final void a(int param0) {
        this.field_h = 256;
        if (param0 != 31749) {
            return;
        }
        this.field_j = 0;
        this.field_l = 0;
        this.field_b = 0;
        this.field_e = -1;
        this.field_k = null;
        this.field_c = null;
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 < 55) {
            field_g = (String) null;
        }
        field_g = null;
        field_i = null;
        field_f = null;
        field_m = null;
    }

    final jj a(int param0, mg[] param1) {
        RuntimeException var3 = null;
        jj stackIn_2_0 = null;
        Object stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_k = param1;
            if (param0 == -8779) {
              stackIn_4_0 = this;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (jj) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("jj.B(").append(param0).append(',');

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
          throw kg.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return (jj) (this);
        }
    }

    final void a(int param0, jj param1) {
        param1.field_e = this.field_e;
        param1.field_k = this.field_k;
        param1.field_b = this.field_b;
        param1.field_c = this.field_c;
        param1.field_d = this.field_d;
        param1.field_l = this.field_l;
        if (param0 != 13598) {
            return;
        }
        try {
            param1.field_j = this.field_j;
            param1.field_h = this.field_h;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "jj.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static mg[] a(String param0, eh param1, boolean param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        mg[] stackIn_2_0 = null;
        mg[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = param1.a(-1, param0);
            var5 = param1.a(-57, var4_int, param3);
            if (!param2) {
              stackIn_4_0 = tm.a(param1, var4_int, 4, var5);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (mg[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("jj.M(");

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
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final jj a(boolean param0, int param1) {
        this.field_d = param0 ? true : false;
        if (param1 != 0) {
            field_i = (String) null;
        }
        return (jj) (this);
    }

    final static void a(int param0, km param1, byte[] param2, int param3, km param4, int param5, int param6, int param7, int param8, km param9) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12 = 0;
        var12 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            hh.field_d = -1L;
            lk.field_Pb = param2;
            la.field_l = param8;
            vb.field_h = param2.length;
            kn.field_E = new byte[(7 + la.field_l) / param3];
            la.field_h = null;
            ld.field_c = false;
            wl.field_d = null;
            var10_int = 0;
            var11 = 0;
            L1: while (true) {
              if (var11 >= lk.field_Pb.length) {
                L2: {
                  var10_int = (var10_int + 7) / 8;
                  pm.field_p = new byte[var10_int];
                  if (param9.field_W != null) {
                    break L2;
                  } else {
                    param9.field_W = new p();
                    break L2;
                  }
                }
                L3: {
                  ci.field_o = param9.field_W;
                  ci.field_o.a(false);
                  ti.field_i = new kf(param7);
                  ea.field_a = 0;
                  nh.field_c = -1;
                  sb.field_i = -1;
                  wl.field_b = 0;
                  if (null == param1.field_W) {
                    param1.field_W = new p();
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  te.field_f = param1.field_W;
                  te.field_f.a(false);
                  ma.field_c = new kf(param5);
                  if (null != param4.field_W) {
                    break L4;
                  } else {
                    param4.field_W = new p();
                    break L4;
                  }
                }
                qm.field_Mb = param4.field_W;
                qm.field_Mb.a(false);
                ah.field_h = new kf(param0);
                fn.field_c = param6;
                d.field_Eb = 0L;
                break L0;
              } else {
                var10_int = var10_int + (lk.field_Pb[var11] & 255);
                var11++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var10 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var10);

            stackIn_15_1 = new StringBuilder().append("jj.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');

            if (param9 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_16_0), stackIn_25_2 + ')');
        }
    }

    final jj a(int param0, int param1) {
        this.field_l = param0;
        if (param1 < 123) {
            this.field_h = 36;
        }
        return (jj) (this);
    }

    final jj b(boolean param0, int param1) {
        this.field_b = param1;
        if (!param0) {
            jj.a((byte) -66);
        }
        return (jj) (this);
    }

    final void a(fi param0, int param1, nl param2, int param3, int param4) {
        e stackIn_20_0 = null;
        String stackIn_20_1 = null;
        e stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        int stackIn_23_2;
        int stackIn_23_3;
        int stackIn_23_4;
        int stackIn_23_5;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        int stackIn_24_4 = 0;
        int stackIn_24_5 = 0;
        int stackIn_24_6 = 0;
        int stackIn_26_3;
        int stackIn_26_4;
        int stackIn_26_5;
        int stackIn_26_6;
        int stackIn_26_7;
        int stackIn_27_3;
        int stackIn_27_4;
        int stackIn_27_5;
        int stackIn_27_6;
        int stackIn_27_7;
        int stackIn_27_8;
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
              tm.a(param4 - -param0.field_l, param3 + param0.field_u, false, param0.field_g, param0.field_m, this.field_k);
              if (null != this.field_c) {
                L2: {
                  var6_int = param0.field_l + (param4 + this.field_j);
                  if (param2.field_j == 1) {
                    var6_int = var6_int + (param0.field_g + -this.field_c.field_u) / 2;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  var7 = this.field_l + param3 - -param0.field_u;
                  if (1 == param2.field_k) {
                    var7 = var7 + (param0.field_m + -this.field_c.field_z) / 2;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if ((param2.field_j ^ -1) == -3) {
                    var6_int = var6_int + (-this.field_c.field_u + param0.field_g);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (-3 != (param2.field_k ^ -1)) {
                    break L5;
                  } else {
                    var7 = var7 + (param0.field_m + -this.field_c.field_z);
                    break L5;
                  }
                }
                this.field_c.d(var6_int, var7);
                break L1;
              } else {
                break L1;
              }
            }
            L6: {
              var6 = param2.c(param0, 218479361);
              if (var6 == null) {
                break L6;
              } else {
                if (param2.field_i == null) {
                  break L6;
                } else {
                  if (0 <= this.field_b) {
                    L7: {
                      stackIn_20_0 = param2.field_i;

                      stackIn_20_1 = (String) (var6);

                      if (2147483647 != (this.field_j ^ -1)) {
                        stackIn_21_0 = (e) ((Object) stackIn_20_0);
                        stackIn_21_1 = (String) ((Object) stackIn_20_1);
                        stackIn_21_2 = this.field_j;
                        break L7;
                      } else {
                        stackIn_21_0 = (e) ((Object) stackIn_20_0);
                        stackIn_21_1 = (String) ((Object) stackIn_20_1);
                        stackIn_21_2 = 0;
                        break L7;
                      }
                    }
                    L8: {




                      stackIn_23_2 = stackIn_21_2 + param4 - (-param0.field_l + -param2.field_p);

                      stackIn_23_3 = param2.field_n;

                      stackIn_23_4 = param0.field_u;

                      stackIn_23_5 = param3;

                      if (-2147483648 == this.field_l) {
                        stackIn_21_0 = (e) ((Object) stackIn_21_0);
                        stackIn_21_1 = (String) ((Object) stackIn_21_1);
                        stackIn_24_2 = stackIn_23_2;
                        stackIn_24_3 = stackIn_23_3;
                        stackIn_24_4 = stackIn_23_4;
                        stackIn_24_5 = stackIn_23_5;
                        stackIn_24_6 = 0;
                        break L8;
                      } else {
                        stackIn_21_0 = (e) ((Object) stackIn_21_0);
                        stackIn_21_1 = (String) ((Object) stackIn_21_1);
                        stackIn_24_2 = stackIn_23_2;
                        stackIn_24_3 = stackIn_23_3;
                        stackIn_24_4 = stackIn_23_4;
                        stackIn_24_5 = stackIn_23_5;
                        stackIn_24_6 = this.field_l;
                        break L8;
                      }
                    }
                    L9: {






                      stackIn_26_3 = stackIn_24_3 + (stackIn_24_4 + (stackIn_24_5 + stackIn_24_6));

                      stackIn_26_4 = -param2.field_d + (param0.field_g - param2.field_p);

                      stackIn_26_5 = param0.field_m - (param2.field_n - -param2.field_r);

                      stackIn_26_6 = this.field_b;

                      stackIn_26_7 = this.field_e;

                      if (this.field_h != -2147483648) {
                        stackIn_21_0 = (e) ((Object) stackIn_21_0);
                        stackIn_21_1 = (String) ((Object) stackIn_21_1);

                        stackIn_27_3 = stackIn_26_3;
                        stackIn_27_4 = stackIn_26_4;
                        stackIn_27_5 = stackIn_26_5;
                        stackIn_27_6 = stackIn_26_6;
                        stackIn_27_7 = stackIn_26_7;
                        stackIn_27_8 = this.field_h;
                        break L9;
                      } else {
                        stackIn_21_0 = (e) ((Object) stackIn_21_0);
                        stackIn_21_1 = (String) ((Object) stackIn_21_1);

                        stackIn_27_3 = stackIn_26_3;
                        stackIn_27_4 = stackIn_26_4;
                        stackIn_27_5 = stackIn_26_5;
                        stackIn_27_6 = stackIn_26_6;
                        stackIn_27_7 = stackIn_26_7;
                        stackIn_27_8 = 256;
                        break L9;
                      }
                    }
                    ((e) (Object) stackIn_21_0).a(stackIn_21_1, stackIn_24_2, stackIn_27_3, stackIn_27_4, stackIn_27_5, stackIn_27_6, stackIn_27_7, stackIn_27_8, param2.field_j, param2.field_k, param2.field_f);
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
            }
            L10: {
              if (param1 == 2) {
                break L10;
              } else {
                this.field_l = 118;
                break L10;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6_ref = decompiledCaughtException;
            stackIn_33_0 = (RuntimeException) (var6_ref);

            stackIn_33_1 = new StringBuilder().append("jj.I(");

            if (param0 == null) {
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


            stackIn_36_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',').append(param1).append(',');

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
          throw kg.a((Throwable) ((Object) stackIn_34_0), stackIn_37_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final jj a(byte param0, int param1) {
        this.field_j = param1;
        if (param0 != 64) {
            return (jj) null;
        }
        return (jj) (this);
    }

    final jj b(int param0, int param1) {
        if (param1 != -26973) {
            field_m = (km) null;
        }
        this.field_e = param0;
        return (jj) (this);
    }

    final void a(int param0, nl param1, byte param2, jj param3, fi param4, int param5) {
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
              if (!this.field_d) {
                break L1;
              } else {
                param3.a(param4, 2, param1, param0, param5);
                param3.a(31749);
                break L1;
              }
            }
            L2: {
              if (this.field_c != null) {
                param3.field_c = this.field_c;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (-2147483648 != this.field_j) {
                param3.field_j = this.field_j;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (-1 > this.field_b) {
                break L4;
              } else {
                param3.field_b = this.field_b;
                break L4;
              }
            }
            L5: {
              if (this.field_k != null) {
                param3.field_k = this.field_k;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if ((this.field_l ^ -1) != 2147483647) {
                param3.field_l = this.field_l;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (this.field_e >= -1) {
                param3.field_e = this.field_e;
                break L7;
              } else {
                break L7;
              }
            }
            if (param2 == -12) {
              L8: {
                if ((this.field_h ^ -1) == 2147483647) {
                  break L8;
                } else {
                  param3.field_h = this.field_h;
                  break L8;
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
          L9: {
            var7 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var7);

            stackIn_26_1 = new StringBuilder().append("jj.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L9;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L10;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');

            if (param4 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L11;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L11;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_27_0), stackIn_33_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    jj() {
        this.field_b = -2;
        this.field_l = -2147483648;
        this.field_e = -2;
        this.field_k = null;
        this.field_d = false;
        this.field_j = -2147483648;
        this.field_c = null;
        this.field_h = -2147483648;
    }

    static {
        field_f = new hh();
        field_i = "Use this alternative as your account name";
        field_n = null;
    }
}
