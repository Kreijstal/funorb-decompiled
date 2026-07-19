/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qn extends t {
    private boolean field_qb;
    private r field_ob;
    private String field_kb;
    private String field_mb;
    static int field_lb;
    static String field_pb;
    private boolean field_nb;
    static String field_rb;

    final static vj a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        vj var8 = new vj();
        uk var9 = new uk();
        var9.field_n = 10000;
        var9.field_A = param5;
        var9.field_q = new pi[param0 * param5];
        var9.field_r = param2;
        var9.field_w = param4;
        var9.field_u = param1;
        var9.field_t = param0;
        var9.field_v = param6;
        var8.a(var9, 2777);
        int var10 = -11 / ((param7 - 10) / 35);
        var9.b(11976, param3);
        return var8;
    }

    qn(ka param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
            this.field_kb = param1;
            if (this.field_kb != null) {
                var3_int = ec.field_p.b(this.field_kb, 260, ec.field_p.field_R);
                this.a(112, 300, var3_int + 150);
            }
            this.field_ob = new r(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_nb = false;
            this.field_ob.field_L = true;
            this.field_qb = false;
            this.b(this.field_ob, (byte) -55);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "qn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void n(byte param0) {
        ck var2 = null;
        field_pb = null;
        if (param0 <= 60) {
          var2 = (ck) null;
          qn.a((ck) null, (ck) null, (byte) -20);
          field_rb = null;
          return;
        } else {
          field_rb = null;
          return;
        }
    }

    final static void c(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        ug var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -20494) {
                break L1;
              } else {
                field_pb = (String) null;
                break L1;
              }
            }
            var4 = (ug) ((Object) qi.field_Q.c((byte) 125));
            L2: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                in.a(var4, (byte) -70, param1);
                var4 = (ug) ((Object) qi.field_Q.d(true));
                if (var3 == 0) {
                  continue L2;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2), "qn.HA(" + param0 + ',' + param1 + ')');
        }
    }

    final void m(byte param0) {
        this.field_ob.field_L = false;
        this.field_nb = true;
        if (param0 < 75) {
            this.m((byte) -99);
        }
    }

    final static void a(ck param0, ck param1, byte param2) {
        RuntimeException var3 = null;
        float var3_float = 0.0f;
        float var4 = 0.0f;
        float var5 = 0.0f;
        int var6 = 0;
        int var7 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        ck var17 = null;
        int[] var24 = null;
        int[] var25 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var16 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var4 = 1.0f;
              var6 = param1.field_I;
              var7 = param1.field_H;
              var24 = param1.field_D;
              var25 = param0.field_D;
              var10 = 0;
              if (param2 <= -73) {
                break L1;
              } else {
                var17 = (ck) null;
                qn.a((ck) null, (ck) null, (byte) 15);
                break L1;
              }
            }
            var11 = 0;
            L2: while (true) {
              if (var7 <= var11) {
                break L0;
              } else {
                if (var16 == 0) {
                  var12 = 0;
                  L3: while (true) {
                    L4: {
                      if (var6 <= var12) {
                        var11++;
                        break L4;
                      } else {
                        var13 = 255 & var24[var10];
                        var14 = var12 + var11 - -(var13 / 5) - -uf.field_A & 127;
                        var5 = (float)var13 / 255.0f;
                        var3_float = (float)var14 / 128.0f;
                        var15 = nm.a(var3_float, var5, false, var4);
                        var25[var10] = var15;
                        var10++;
                        var12++;
                        if (var16 != 0) {
                          break L4;
                        } else {
                          continue L3;
                        }
                      }
                    }
                    continue L2;
                  }
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var3);
            stackOut_15_1 = new StringBuilder().append("qn.EA(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, fd param1, int param2, wl param3) {
        try {
            byte[] array$1 = null;
            RuntimeException var4 = null;
            int var5 = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            int var6_int = 0;
            String var8 = null;
            int var9 = 0;
            String[] var10 = null;
            int var11_int = 0;
            byte[][] var11 = null;
            int var12_int = 0;
            Class[] var12 = null;
            int var13 = 0;
            int var14 = 0;
            Object var15 = null;
            kl var15_ref = null;
            byte[][] var16 = null;
            String var17 = null;
            String var18 = null;
            byte[][] var19 = null;
            int var20 = 0;
            int var21 = 0;
            RuntimeException stackIn_48_0 = null;
            StringBuilder stackIn_48_1 = null;
            RuntimeException stackIn_49_0 = null;
            StringBuilder stackIn_49_1 = null;
            RuntimeException stackIn_50_0 = null;
            StringBuilder stackIn_50_1 = null;
            String stackIn_50_2 = null;
            RuntimeException stackIn_51_0 = null;
            StringBuilder stackIn_51_1 = null;
            RuntimeException stackIn_52_0 = null;
            StringBuilder stackIn_52_1 = null;
            RuntimeException stackIn_53_0 = null;
            StringBuilder stackIn_53_1 = null;
            String stackIn_53_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_47_0 = null;
            StringBuilder stackOut_47_1 = null;
            RuntimeException stackOut_49_0 = null;
            StringBuilder stackOut_49_1 = null;
            String stackOut_49_2 = null;
            RuntimeException stackOut_48_0 = null;
            StringBuilder stackOut_48_1 = null;
            String stackOut_48_2 = null;
            RuntimeException stackOut_50_0 = null;
            StringBuilder stackOut_50_1 = null;
            RuntimeException stackOut_52_0 = null;
            StringBuilder stackOut_52_1 = null;
            String stackOut_52_2 = null;
            RuntimeException stackOut_51_0 = null;
            StringBuilder stackOut_51_1 = null;
            String stackOut_51_2 = null;
            var14 = client.field_A ? 1 : 0;
            try {
              L0: {
                var15_ref = new kl();
                var15_ref.field_o = param3.d((byte) -116);
                var15_ref.field_C = param3.i(7553);
                var15_ref.field_q = new int[var15_ref.field_o];
                var15_ref.field_A = new int[var15_ref.field_o];
                var15_ref.field_s = new byte[var15_ref.field_o][][];
                var15_ref.field_y = new mh[var15_ref.field_o];
                var15_ref.field_u = new int[var15_ref.field_o];
                var15_ref.field_t = new mh[var15_ref.field_o];
                var5 = 0;
                L1: while (true) {
                  L2: {
                    L3: {
                      L4: {
                        if (var5 >= var15_ref.field_o) {
                          break L4;
                        } else {
                          try {
                            L5: {
                              var6_int = param3.d((byte) -21);
                              var21 = var6_int;
                              var20 = 0;
                              if (var14 != 0) {
                                if (var20 == var21) {
                                  decompiledRegionSelector0 = 0;
                                  break L5;
                                } else {
                                  decompiledRegionSelector0 = 1;
                                  break L5;
                                }
                              } else {
                                L6: {
                                  L7: {
                                    if (var20 == var21) {
                                      break L7;
                                    } else {
                                      if ((var6_int ^ -1) == -2) {
                                        break L7;
                                      } else {
                                        if (-3 == (var6_int ^ -1)) {
                                          break L7;
                                        } else {
                                          L8: {
                                            if ((var6_int ^ -1) == -4) {
                                              break L8;
                                            } else {
                                              if (4 == var6_int) {
                                                break L8;
                                              } else {
                                                break L6;
                                              }
                                            }
                                          }
                                          var17 = param3.c((byte) -38);
                                          var8 = param3.c((byte) -38);
                                          var9 = param3.d((byte) -72);
                                          var10 = new String[var9];
                                          var11_int = 0;
                                          L9: while (true) {
                                            if (var11_int >= var9) {
                                              L10: {
                                                L11: {
                                                  var19 = new byte[var9][];
                                                  var16 = var19;
                                                  var11 = var16;
                                                  if (-4 != (var6_int ^ -1)) {
                                                    break L11;
                                                  } else {
                                                    var12_int = 0;
                                                    L12: while (true) {
                                                      if (var9 <= var12_int) {
                                                        break L11;
                                                      } else {
                                                        var13 = param3.i(7553);
                                                        array$1 = new byte[var13];
                                                        var11[var12_int] = array$1;
                                                        param3.a(var19[var12_int], 0, (byte) 127, var13);
                                                        var12_int++;
                                                        if (var14 != 0) {
                                                          break L10;
                                                        } else {
                                                          continue L12;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                var15_ref.field_u[var5] = var6_int;
                                                break L10;
                                              }
                                              var12 = new Class[var9];
                                              var13 = 0;
                                              L13: while (true) {
                                                L14: {
                                                  if (var9 <= var13) {
                                                    var15_ref.field_t[var5] = param1.a(-10962, var8, cg.a(var17, (byte) -108), var12);
                                                    var15_ref.field_s[var5] = var19;
                                                    break L14;
                                                  } else {
                                                    var12[var13] = cg.a(var10[var13], (byte) -122);
                                                    var13++;
                                                    if (var14 != 0) {
                                                      break L14;
                                                    } else {
                                                      continue L13;
                                                    }
                                                  }
                                                }
                                                if (var14 == 0) {
                                                  break L6;
                                                } else {
                                                  break L7;
                                                }
                                              }
                                            } else {
                                              var10[var11_int] = param3.c((byte) -38);
                                              var11_int++;
                                              if (var14 != 0) {
                                                break L6;
                                              } else {
                                                continue L9;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L15: {
                                    var18 = param3.c((byte) -38);
                                    var8 = param3.c((byte) -38);
                                    var9 = 0;
                                    if (1 == var6_int) {
                                      var9 = param3.i(7553);
                                      break L15;
                                    } else {
                                      break L15;
                                    }
                                  }
                                  var15_ref.field_u[var5] = var6_int;
                                  var15_ref.field_q[var5] = var9;
                                  var15_ref.field_y[var5] = param1.a(false, var8, cg.a(var18, (byte) 9));
                                  break L6;
                                }
                                decompiledRegionSelector0 = 2;
                                break L5;
                              }
                            }
                          } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                            decompiledCaughtException = decompiledCaughtParameter0;
                            L16: {
                              var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                              var15_ref.field_A[var5] = -1;
                              decompiledRegionSelector0 = 2;
                              break L16;
                            }
                          } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            L17: {
                              var6_ref = (SecurityException) (Object) decompiledCaughtException;
                              var15_ref.field_A[var5] = -2;
                              decompiledRegionSelector0 = 2;
                              break L17;
                            }
                          } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            L18: {
                              var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                              var15_ref.field_A[var5] = -3;
                              decompiledRegionSelector0 = 2;
                              break L18;
                            }
                          } catch (java.lang.Exception decompiledCaughtParameter3) {
                            decompiledCaughtException = decompiledCaughtParameter3;
                            L19: {
                              var6_ref3 = (Exception) (Object) decompiledCaughtException;
                              var15_ref.field_A[var5] = -4;
                              decompiledRegionSelector0 = 2;
                              break L19;
                            }
                          } catch (java.lang.Throwable decompiledCaughtParameter4) {
                            decompiledCaughtException = decompiledCaughtParameter4;
                            L20: {
                              var6_ref4 = decompiledCaughtException;
                              var15_ref.field_A[var5] = -5;
                              decompiledRegionSelector0 = 2;
                              break L20;
                            }
                          }
                          if (decompiledRegionSelector0 == 0) {
                            break L2;
                          } else {
                            if (decompiledRegionSelector0 == 1) {
                              break L3;
                            } else {
                              var5++;
                              if (var14 == 0) {
                                continue L1;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                      }
                      if (param2 == 4210752) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                    field_pb = (String) null;
                    break L2;
                  }
                  aa.field_f.a(var15_ref, 2777);
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L21: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_47_0 = (RuntimeException) (var4);
                stackOut_47_1 = new StringBuilder().append("qn.JA(").append(param0).append(',');
                stackIn_49_0 = stackOut_47_0;
                stackIn_49_1 = stackOut_47_1;
                stackIn_48_0 = stackOut_47_0;
                stackIn_48_1 = stackOut_47_1;
                if (param1 == null) {
                  stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
                  stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
                  stackOut_49_2 = "null";
                  stackIn_50_0 = stackOut_49_0;
                  stackIn_50_1 = stackOut_49_1;
                  stackIn_50_2 = stackOut_49_2;
                  break L21;
                } else {
                  stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
                  stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
                  stackOut_48_2 = "{...}";
                  stackIn_50_0 = stackOut_48_0;
                  stackIn_50_1 = stackOut_48_1;
                  stackIn_50_2 = stackOut_48_2;
                  break L21;
                }
              }
              L22: {
                stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
                stackOut_50_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(',').append(param2).append(',');
                stackIn_52_0 = stackOut_50_0;
                stackIn_52_1 = stackOut_50_1;
                stackIn_51_0 = stackOut_50_0;
                stackIn_51_1 = stackOut_50_1;
                if (param3 == null) {
                  stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
                  stackOut_52_1 = (StringBuilder) ((Object) stackIn_52_1);
                  stackOut_52_2 = "null";
                  stackIn_53_0 = stackOut_52_0;
                  stackIn_53_1 = stackOut_52_1;
                  stackIn_53_2 = stackOut_52_2;
                  break L22;
                } else {
                  stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
                  stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
                  stackOut_51_2 = "{...}";
                  stackIn_53_0 = stackOut_51_0;
                  stackIn_53_1 = stackOut_51_1;
                  stackIn_53_2 = stackOut_51_2;
                  break L22;
                }
              }
              throw dh.a((Throwable) ((Object) stackIn_53_0), stackIn_53_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(boolean param0, float param1, int param2, String param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              if (param0) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              if (stackIn_3_0 != (this.field_qb ? 1 : 0)) {
                break L2;
              } else {
                L3: {
                  stackOut_4_0 = this;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (!param0) {
                    stackOut_6_0 = this;
                    stackOut_6_1 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    break L3;
                  } else {
                    stackOut_5_0 = this;
                    stackOut_5_1 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    break L3;
                  }
                }
                ((qn) (this)).field_qb = stackIn_7_1 != 0;
                if (this.field_qb) {
                  this.field_ob.a(4210752, 4088, 8405024);
                  this.field_ob.field_L = true;
                  break L2;
                } else {
                  this.field_ob.a(4210752, 4088, 2113632);
                  if (!this.field_nb) {
                    break L2;
                  } else {
                    this.field_ob.field_L = false;
                    if (!client.field_A) {
                      break L2;
                    } else {
                      this.field_ob.a(4210752, 4088, 8405024);
                      this.field_ob.field_L = true;
                      break L2;
                    }
                  }
                }
              }
            }
            L4: {
              if (param2 == 4210752) {
                break L4;
              } else {
                qn.l(68);
                break L4;
              }
            }
            this.field_ob.field_Q = (int)(param1 / 100.0f * 65536.0f);
            this.field_mb = param3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var5);
            stackOut_17_1 = new StringBuilder().append("qn.IA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
    }

    final void b(int param0, int param1, int param2) {
        int discarded$2 = 0;
        super.b(-128, param1, param2);
        ec.field_p.b(this.field_mb, (this.field_t >> -544182591) + param2, 103 + param1, 16777215, -1);
        if (param0 >= -127) {
          return;
        } else {
          L0: {
            if (null == this.field_kb) {
              break L0;
            } else {
              hk.a(param2 - -20, param1 - -113, 260, 8421504);
              discarded$2 = ec.field_p.a(this.field_kb, param2 - -20, 128 + param1, 260, 100, 16777215, -1, 1, 0, ec.field_p.field_R);
              break L0;
            }
          }
          return;
        }
    }

    final static void l(int param0) {
        if (!jh.field_h) {
          if (param0 != 13) {
            field_rb = (String) null;
            return;
          } else {
            return;
          }
        } else {
          pf.a(false);
          if (param0 == 13) {
            return;
          } else {
            field_rb = (String) null;
            return;
          }
        }
    }

    static {
        field_pb = "This game has started.";
        field_rb = "Log in / Create account";
    }
}
