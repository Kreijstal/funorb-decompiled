/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class st extends iq {
    private int field_k;
    private int field_l;
    private hu field_g;
    private boolean field_h;
    private int field_n;
    private String field_p;
    static ld field_j;
    static ut field_q;
    private int field_e;
    static String field_m;
    static String field_o;
    private int field_i;
    static String field_d;
    static String field_f;

    final static void a(nu param0, int param1, int param2) {
        try {
            vl.field_d = true;
            gp.field_i = -pq.field_Q.field_o;
            bm.field_I = 0;
            mk.field_c = param1;
            iu.field_i = param2;
            tb.field_w = param0;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "st.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static int[] c(int param0) {
        if (param0 != -23091) {
            st.b((byte) -38);
            return new int[8];
        }
        return new int[8];
    }

    private final qj a(int param0, boolean param1, hu param2, String param3) {
        qj var5 = null;
        RuntimeException var5_ref = null;
        qj var6 = null;
        qj stackIn_3_0 = null;
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
              if (param1) {
                break L1;
              } else {
                field_o = (String) null;
                break L1;
              }
            }
            var6 = new qj(param0 - param2.field_G, param2.field_p + param0, param3.length());
            var5 = var6;
            this.field_c = new qj[]{var6};
            stackIn_3_0 = (qj) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5_ref);

            stackIn_6_1 = new StringBuilder().append("st.J(").append(param0).append(',').append(param1).append(',');

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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

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
          throw nb.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, String param1, byte param2, hu param3, int param4) {
        qj var8 = null;
        qj var9 = null;
        if (param1 == null) {
            this.field_c = null;
            return;
        }
        if (this.field_g == param3 && this.field_h && this.field_l == 0 && this.field_p != null) {
            if (!(!this.field_p.equals(param1))) {
                return;
            }
        }
        try {
            this.field_h = true;
            this.field_p = param1;
            this.field_g = param3;
            this.field_l = 0;
            var8 = this.a(param4, true, param3, param1);
            var9 = var8;
            var8.field_b[0] = param0;
            var9.field_b[param1.length()] = param3.a(param1) + param0;
            if (param2 != 80) {
                nu var7 = (nu) null;
                st.a((nu) null, -19, 117);
            }
            is.a(param3, param1, var9, 0, -1942293368);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "st.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final void a(int param0, hu param1, int param2, int param3, int param4, byte param5, String param6, int param7) {
        qj stackIn_36_0;
        qj stackIn_36_1;
        int stackIn_36_2;
        int stackIn_36_3;
        qj stackIn_37_0 = null;
        qj stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        int stackIn_37_4 = 0;
        hu stackIn_40_0 = null;
        String stackIn_40_1 = null;
        qj stackIn_40_2 = null;
        hu stackIn_41_0;
        String stackIn_41_1;
        qj stackIn_41_2;
        int stackIn_41_3;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        StringBuilder stackIn_49_1 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        qj var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        var15 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param7 != 0) {
                break L1;
              } else {
                param7 = param1.field_x;
                break L1;
              }
            }
            if (param6 == null) {
              this.field_c = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (this.field_g != param1) {
                  break L2;
                } else {
                  if (this.field_h) {
                    break L2;
                  } else {
                    if (this.field_l != param4) {
                      break L2;
                    } else {
                      if (param2 != this.field_n) {
                        break L2;
                      } else {
                        if (param7 != this.field_i) {
                          break L2;
                        } else {
                          if (param3 != this.field_k) {
                            break L2;
                          } else {
                            if (param0 != this.field_e) {
                              break L2;
                            } else {
                              if (this.field_p == null) {
                                break L2;
                              } else {
                                if (this.field_p.equals(param6)) {
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
              this.field_i = param7;
              this.field_h = false;
              this.field_n = param2;
              this.field_e = param0;
              this.field_l = param4;
              this.field_g = param1;
              this.field_p = param6;
              this.field_k = param3;
              var16 = new String[1 + param1.b(param6, param0)];
              var17 = var16;
              var10 = Math.max(1, param1.a(param6, new int[]{param0}, var17));
              if (param5 >= 89) {
                L3: {
                  if ((this.field_n ^ -1) != -4) {
                    break L3;
                  } else {
                    if (var10 != 1) {
                      break L3;
                    } else {
                      this.field_n = 1;
                      break L3;
                    }
                  }
                }
                L4: {
                  this.field_c = new qj[var10];
                  if (-1 != (this.field_n ^ -1)) {
                    if (this.field_n == 1) {
                      var11 = (this.field_k + -(var10 * this.field_i) >> -137005791) + param1.field_G;
                      break L4;
                    } else {
                      if ((this.field_n ^ -1) != -3) {
                        L5: {
                          var12 = (this.field_k - var10 * this.field_i) / (1 + var10);
                          if (0 <= var12) {
                            break L5;
                          } else {
                            var12 = 0;
                            break L5;
                          }
                        }
                        this.field_i = this.field_i + var12;
                        var11 = param1.field_G - -var12;
                        break L4;
                      } else {
                        var11 = -param1.field_p + this.field_k + -(var10 * this.field_i);
                        break L4;
                      }
                    }
                  } else {
                    var11 = param1.field_G;
                    break L4;
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
                      stackIn_36_0 = null;

                      stackIn_36_1 = null;

                      stackIn_36_2 = -param1.field_G + var11;

                      stackIn_36_3 = var11 + param1.field_p;

                      if (var13 == null) {
                        stackIn_37_0 = null;
                        stackIn_37_1 = null;
                        stackIn_37_2 = stackIn_36_2;
                        stackIn_37_3 = stackIn_36_3;
                        stackIn_37_4 = 0;
                        break L7;
                      } else {
                        stackIn_37_0 = null;
                        stackIn_37_1 = null;
                        stackIn_37_2 = stackIn_36_2;
                        stackIn_37_3 = stackIn_36_3;
                        stackIn_37_4 = var13.length();
                        break L7;
                      }
                    }
                    L8: {
                      var14 = new qj(stackIn_37_2, stackIn_37_3, stackIn_37_4);
                      var14.field_b[0] = 0;
                      if (var13 == null) {
                        break L8;
                      } else {
                        L9: {
                          var14.field_b[var13.length()] = param1.a(var13);
                          stackIn_40_0 = (hu) (param1);

                          stackIn_40_1 = (String) (var13);

                          stackIn_40_2 = (qj) (var14);

                          if ((param4 ^ -1) == -4) {
                            stackIn_41_0 = (hu) ((Object) stackIn_40_0);
                            stackIn_41_1 = (String) ((Object) stackIn_40_1);
                            stackIn_41_2 = (qj) ((Object) stackIn_40_2);
                            stackIn_41_3 = this.a(param0, -61, param1.a(var13), var13);
                            break L9;
                          } else {
                            stackIn_41_0 = (hu) ((Object) stackIn_40_0);
                            stackIn_41_1 = (String) ((Object) stackIn_40_1);
                            stackIn_41_2 = (qj) ((Object) stackIn_40_2);
                            stackIn_41_3 = 0;
                            break L9;
                          }
                        }
                        is.a(stackIn_41_0, stackIn_41_1, stackIn_41_2, stackIn_41_3, -1942293368);
                        break L8;
                      }
                    }
                    var11 = var11 + param7;
                    this.field_c[var12] = var14;
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
            stackIn_46_0 = (RuntimeException) (var9);

            stackIn_46_1 = new StringBuilder().append("st.L(").append(param0).append(',');

            if (param1 == null) {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "null";
              break L10;
            } else {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_49_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_47_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackIn_50_2 = "null";
              break L11;
            } else {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackIn_50_2 = "{...}";
              break L11;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_47_0), stackIn_50_2 + ',' + param7 + ')');
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

    final void a(byte param0, String param1, int param2, int param3, hu param4) {
        qj var8 = null;
        qj var9 = null;
        if (param1 == null) {
            this.field_c = null;
            return;
        }
        if (param4 == this.field_g && this.field_h && -3 == (this.field_l ^ -1) && null != this.field_p) {
            if (!(!this.field_p.equals(param1))) {
                return;
            }
        }
        this.field_p = param1;
        this.field_h = true;
        this.field_g = param4;
        this.field_l = 2;
        if (param0 < 120) {
            return;
        }
        try {
            var8 = this.a(param2, true, param4, param1);
            var9 = var8;
            var9.field_b[0] = -param4.a(param1) + param3;
            var9.field_b[param1.length()] = param3;
            is.a(param4, param1, var9, 0, -1942293368);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "st.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(byte param0) {
        field_j = null;
        field_f = null;
        if (param0 != -103) {
            return;
        }
        field_o = null;
        field_d = null;
        field_m = null;
        field_q = null;
    }

    final void a(int param0, int param1, hu param2, String param3, int param4) {
        qj var8 = null;
        int var7 = 0;
        if (!(param3 != null)) {
            this.field_c = null;
            return;
        }
        if (param2 == this.field_g && this.field_h && -2 == (this.field_l ^ -1) && null != this.field_p) {
            if (!(!this.field_p.equals(param3))) {
                return;
            }
        }
        try {
            this.field_l = param0;
            this.field_h = true;
            this.field_g = param2;
            var8 = this.a(param4, true, param2, param3);
            var7 = param2.a(param3);
            var8.field_b[0] = param1 + -(var7 >> 762736673);
            var8.field_b[param3.length()] = (var7 >> 1296583297) + param1;
            is.a(param2, param3, var8, 0, -1942293368);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "st.Q(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static void b(int param0, int param1, int param2) {
        gp.field_i = param0;
        if (param1 < 76) {
            field_d = (String) null;
            hq.field_d = param2;
            return;
        }
        hq.field_d = param2;
    }

    public st() {
    }

    static {
        field_j = new ld();
        field_o = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_m = null;
        field_d = "Loading models";
        field_f = "Quick Chat game";
    }
}
