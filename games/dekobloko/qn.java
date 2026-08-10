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
        field_pb = null;
        if (param0 <= 60) {
            ck var2 = (ck) null;
            qn.a((ck) null, (ck) null, (byte) -20);
        }
        field_rb = null;
    }

    final static void c(int param0, int param1) {
        int var3 = 0;
        ug var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
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
                continue L2;
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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
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
                var12 = 0;
                L3: while (true) {
                  if (var6 <= var12) {
                    var11++;
                    continue L2;
                  } else {
                    var13 = 255 & var24[var10];
                    var14 = var12 + var11 - -(var13 / 5) - -uf.field_A & 127;
                    var5 = (float)var13 / 255.0f;
                    var3_float = (float)var14 / 128.0f;
                    var15 = nm.a(var3_float, var5, false, var4);
                    var25[var10] = var15;
                    var10++;
                    var12++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("qn.EA(");

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
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, fd param1, int param2, wl param3) {
        try {
            byte[] array$0 = null;
            String dupTemp$1 = null;
            RuntimeException stackIn_39_0 = null;
            StringBuilder stackIn_39_1 = null;
            RuntimeException stackIn_40_0 = null;
            StringBuilder stackIn_40_1 = null;
            String stackIn_40_2 = null;
            StringBuilder stackIn_42_1 = null;
            StringBuilder stackIn_43_1 = null;
            String stackIn_43_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException var4 = null;
            int var5 = 0;
            int var6_int = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            String var8 = null;
            int var9 = 0;
            String[] var10 = null;
            int var11_int = 0;
            byte[][] var11 = null;
            int var12_int = 0;
            Class[] var12 = null;
            int var13 = 0;
            int var14 = 0;
            String var15 = null;
            String var16 = null;
            int var17 = 0;
            kl var18 = null;
            byte[][] var19 = null;
            String var20 = null;
            byte[][] var21 = null;
            var14 = client.field_A ? 1 : 0;
            try {
              L0: {
                var18 = new kl();
                var18.field_o = param3.d((byte) -116);
                var18.field_C = param3.i(7553);
                var18.field_q = new int[var18.field_o];
                var18.field_A = new int[var18.field_o];
                var18.field_s = new byte[var18.field_o][][];
                var18.field_y = new mh[var18.field_o];
                var18.field_u = new int[var18.field_o];
                var18.field_t = new mh[var18.field_o];
                var5 = 0;
                L1: while (true) {
                  if (var5 >= var18.field_o) {
                    L2: {
                      if (param2 == 4210752) {
                        break L2;
                      } else {
                        field_pb = (String) null;
                        break L2;
                      }
                    }
                    aa.field_f.a(var18, 2777);
                    break L0;
                  } else {
                    try {
                      L3: {
                        L4: {
                          L5: {
                            var6_int = param3.d((byte) -21);
                            if (0 == var6_int) {
                              break L5;
                            } else {
                              if ((var6_int ^ -1) == -2) {
                                break L5;
                              } else {
                                if (-3 == (var6_int ^ -1)) {
                                  break L5;
                                } else {
                                  L6: {
                                    if ((var6_int ^ -1) == -4) {
                                      break L6;
                                    } else {
                                      if (4 == var6_int) {
                                        break L6;
                                      } else {
                                        break L4;
                                      }
                                    }
                                  }
                                  var20 = param3.c((byte) -38);
                                  var8 = param3.c((byte) -38);
                                  var9 = param3.d((byte) -72);
                                  var10 = new String[var9];
                                  var11_int = 0;
                                  L7: while (true) {
                                    if (var11_int >= var9) {
                                      L8: {
                                        var21 = new byte[var9][];
                                        var19 = var21;
                                        var11 = var19;
                                        if (-4 != (var6_int ^ -1)) {
                                          break L8;
                                        } else {
                                          var12_int = 0;
                                          L9: while (true) {
                                            if (var9 <= var12_int) {
                                              break L8;
                                            } else {
                                              var13 = param3.i(7553);
                                              array$0 = new byte[var13];
                                              var11[var12_int] = array$0;
                                              param3.a(var21[var12_int], 0, (byte) 127, var13);
                                              var12_int++;
                                              continue L9;
                                            }
                                          }
                                        }
                                      }
                                      var18.field_u[var5] = var6_int;
                                      var12 = new Class[var9];
                                      var17 = 0;
                                      var13 = var17;
                                      L10: while (true) {
                                        if (var9 <= var17) {
                                          var18.field_t[var5] = param1.a(-10962, var8, cg.a(var20, (byte) -108), var12);
                                          var18.field_s[var5] = var21;
                                          break L4;
                                        } else {
                                          var12[var17] = cg.a(var10[var17], (byte) -122);
                                          var17++;
                                          continue L10;
                                        }
                                      }
                                    } else {
                                      var10[var11_int] = param3.c((byte) -38);
                                      var11_int++;
                                      continue L7;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L11: {
                            var16 = param3.c((byte) -38);
                            dupTemp$1 = param3.c((byte) -38);
                            var15 = dupTemp$1;
                            var8 = dupTemp$1;
                            var9 = 0;
                            if (1 == var6_int) {
                              var9 = param3.i(7553);
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          var18.field_u[var5] = var6_int;
                          var18.field_q[var5] = var9;
                          var18.field_y[var5] = param1.a(false, var15, cg.a(var16, (byte) 9));
                          break L4;
                        }
                        break L3;
                      }
                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L12: {
                        var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                        var18.field_A[var5] = -1;
                        break L12;
                      }
                    } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L13: {
                        var6_ref = (SecurityException) (Object) decompiledCaughtException;
                        var18.field_A[var5] = -2;
                        break L13;
                      }
                    } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      L14: {
                        var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                        var18.field_A[var5] = -3;
                        break L14;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter3) {
                      decompiledCaughtException = decompiledCaughtParameter3;
                      L15: {
                        var6_ref3 = (Exception) (Object) decompiledCaughtException;
                        var18.field_A[var5] = -4;
                        break L15;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter4) {
                      decompiledCaughtException = decompiledCaughtParameter4;
                      L16: {
                        var6_ref4 = decompiledCaughtException;
                        var18.field_A[var5] = -5;
                        break L16;
                      }
                    }
                    var5++;
                    continue L1;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L17: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_39_0 = (RuntimeException) (var4);

                stackIn_39_1 = new StringBuilder().append("qn.JA(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
                  stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
                  stackIn_40_2 = "null";
                  break L17;
                } else {
                  stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
                  stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
                  stackIn_40_2 = "{...}";
                  break L17;
                }
              }
              L18: {


                stackIn_42_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_40_2).append(',').append(param2).append(',');

                if (param3 == null) {
                  stackIn_40_0 = (RuntimeException) ((Object) stackIn_40_0);
                  stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
                  stackIn_43_2 = "null";
                  break L18;
                } else {
                  stackIn_40_0 = (RuntimeException) ((Object) stackIn_40_0);
                  stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
                  stackIn_43_2 = "{...}";
                  break L18;
                }
              }
              throw dh.a((Throwable) ((Object) stackIn_40_0), stackIn_43_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(boolean param0, float param1, int param2, String param3) {
        RuntimeException runtimeException = null;
        int stackIn_3_0 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                stackIn_3_0 = 0;
                break L1;
              } else {
                stackIn_3_0 = 1;
                break L1;
              }
            }
            L2: {
              if (stackIn_3_0 != (this.field_qb ? 1 : 0)) {
                break L2;
              } else {
                L3: {
                  stackIn_6_0 = this;

                  if (!param0) {
                    stackIn_7_0 = this;
                    stackIn_7_1 = 0;
                    break L3;
                  } else {
                    stackIn_7_0 = this;
                    stackIn_7_1 = 1;
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
                    break L2;
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
            runtimeException = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (runtimeException);

            stackIn_17_1 = new StringBuilder().append("qn.IA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw dh.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
    }

    final void b(int param0, int param1, int param2) {
        super.b(-128, param1, param2);
        ec.field_p.b(this.field_mb, (this.field_t >> -544182591) + param2, 103 + param1, 16777215, -1);
        if (param0 >= -127) {
            return;
        }
        if (null != this.field_kb) {
            hk.a(param2 - -20, param1 - -113, 260, 8421504);
            ec.field_p.a(this.field_kb, param2 - -20, 128 + param1, 260, 100, 16777215, -1, 1, 0, ec.field_p.field_R);
        }
    }

    final static void l(int param0) {
        if (jh.field_h) {
            pf.a(false);
        }
        if (param0 != 13) {
            field_rb = (String) null;
        }
    }

    static {
        field_pb = "This game has started.";
        field_rb = "Log in / Create account";
    }
}
