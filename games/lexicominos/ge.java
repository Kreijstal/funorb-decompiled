/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ge implements Runnable {
    private int field_a;
    private InputStream field_b;
    private int field_i;
    private int field_k;
    private ab field_d;
    private byte[] field_f;
    private java.net.Socket field_g;
    private ei field_c;
    private boolean field_l;
    private OutputStream field_h;
    private boolean field_j;
    static String field_e;

    final void a(byte[] param0, byte param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (!((ge) this).field_l) {
              L1: while (true) {
                if (0 >= param2) {
                  L2: {
                    if (param1 == -109) {
                      break L2;
                    } else {
                      field_e = null;
                      break L2;
                    }
                  }
                  break L0;
                } else {
                  var5_int = ((ge) this).field_b.read(param0, param3, param2);
                  if (var5_int > 0) {
                    param3 = param3 + var5_int;
                    param2 = param2 - var5_int;
                    continue L1;
                  } else {
                    throw new EOFException();
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("ge.B(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    protected final void finalize() {
        ((ge) this).b(58);
    }

    ge(java.net.Socket param0, ab param1) throws IOException {
        this(param0, param1, 5000);
    }

    public static void a() {
        field_e = null;
    }

    final static void c(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        f var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        th var13 = null;
        int var14 = 0;
        int var15 = 0;
        th var16 = null;
        int[][] var20 = null;
        RuntimeException decompiledCaughtException = null;
        var12 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var13 = ig.field_a;
              var16 = var13;
              var2 = var16.d(true);
              if (param0 > 105) {
                break L1;
              } else {
                ge.f(-123);
                break L1;
              }
            }
            var3 = (f) (Object) dj.field_c.a(true);
            L2: while (true) {
              L3: {
                if (var3 == null) {
                  break L3;
                } else {
                  if (var3.field_k == var2) {
                    break L3;
                  } else {
                    var3 = (f) (Object) dj.field_c.f(2);
                    continue L2;
                  }
                }
              }
              if (var3 == null) {
                ck.b((byte) -47);
                return;
              } else {
                L4: {
                  var4 = var16.d(true);
                  if (var4 != 0) {
                    var5 = var3.field_j;
                    ph.field_a[0] = og.field_c;
                    var6_int = 1;
                    L5: while (true) {
                      if (var4 <= var6_int) {
                        fb.a((byte) -107, var5, var4);
                        var6_int = 0;
                        L6: while (true) {
                          if (var6_int >= var4) {
                            bh.b((byte) 83, var5);
                            var6 = new String[2][var5];
                            var20 = new int[2][4 * var5];
                            var8 = pf.field_o;
                            var9 = 0;
                            var10 = 0;
                            L7: while (true) {
                              if (var8 <= var9) {
                                var14 = 0;
                                var9 = var14;
                                var15 = 0;
                                var10 = var15;
                                L8: while (true) {
                                  if (var8 > var14) {
                                    L9: {
                                      var11 = ff.field_a[var5 + var14];
                                      var6[1][var15] = ph.field_a[var11];
                                      var20[1][var15 * 4] = we.field_g[var11];
                                      var20[1][1 + 4 * var15] = l.field_D[var11];
                                      var20[1][2 + 4 * var15] = oc.field_a[var11];
                                      var20[1][var15 * 4 - -3] = hl.field_N[var11];
                                      if (md.a(ph.field_a[var11], -101)) {
                                        if (0 == hl.field_N[var11] + oc.field_a[var11] + l.field_D[var11]) {
                                          var6[1][var15] = null;
                                          var15--;
                                          break L9;
                                        } else {
                                          break L9;
                                        }
                                      } else {
                                        break L9;
                                      }
                                    }
                                    var15++;
                                    var14++;
                                    continue L8;
                                  } else {
                                    var3.b((byte) -127);
                                    break L4;
                                  }
                                }
                              } else {
                                L10: {
                                  var11 = ff.field_a[var9];
                                  var6[0][var10] = ph.field_a[var11];
                                  var20[0][4 * var10] = we.field_g[var11];
                                  var20[0][1 + 4 * var10] = l.field_D[var11];
                                  var20[0][2 + var10 * 4] = oc.field_a[var11];
                                  var20[0][var10 * 4 + 3] = hl.field_N[var11];
                                  if (!md.a(ph.field_a[var11], -113)) {
                                    break L10;
                                  } else {
                                    if (oc.field_a[var11] + (l.field_D[var11] - -hl.field_N[var11]) != 0) {
                                      break L10;
                                    } else {
                                      var6[0][var10] = null;
                                      var10--;
                                      break L10;
                                    }
                                  }
                                }
                                var10++;
                                var9++;
                                continue L7;
                              }
                            }
                          } else {
                            L11: {
                              lh.a((wf) (Object) var16, -95);
                              if (var6_int == 0) {
                                ra.a(sg.field_a, 0, th.field_s, hh.field_I, var6_int, ki.field_g);
                                break L11;
                              } else {
                                ra.a(sg.field_a, 0, th.field_s, hh.field_I, var6_int, ki.field_g);
                                break L11;
                              }
                            }
                            var6_int++;
                            continue L6;
                          }
                        }
                      } else {
                        ph.field_a[var6_int] = var13.c(false);
                        var6_int++;
                        continue L5;
                      }
                    }
                  } else {
                    var3.b((byte) -127);
                    break L4;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var1, "ge.K(" + param0 + ')');
        }
    }

    final static void a(byte param0, int param1, wf param2, ab param3) {
        try {
            RuntimeException var4 = null;
            int var5 = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            int var6_int = 0;
            String var7 = null;
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
            Object var18 = null;
            byte[][] var19 = null;
            String var20 = null;
            byte[][] var21 = null;
            byte[][] var22 = null;
            byte[][] var23 = null;
            RuntimeException stackIn_36_0 = null;
            StringBuilder stackIn_36_1 = null;
            RuntimeException stackIn_37_0 = null;
            StringBuilder stackIn_37_1 = null;
            RuntimeException stackIn_38_0 = null;
            StringBuilder stackIn_38_1 = null;
            String stackIn_38_2 = null;
            RuntimeException stackIn_39_0 = null;
            StringBuilder stackIn_39_1 = null;
            RuntimeException stackIn_40_0 = null;
            StringBuilder stackIn_40_1 = null;
            RuntimeException stackIn_41_0 = null;
            StringBuilder stackIn_41_1 = null;
            String stackIn_41_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_35_0 = null;
            StringBuilder stackOut_35_1 = null;
            RuntimeException stackOut_37_0 = null;
            StringBuilder stackOut_37_1 = null;
            String stackOut_37_2 = null;
            RuntimeException stackOut_36_0 = null;
            StringBuilder stackOut_36_1 = null;
            String stackOut_36_2 = null;
            RuntimeException stackOut_38_0 = null;
            StringBuilder stackOut_38_1 = null;
            RuntimeException stackOut_40_0 = null;
            StringBuilder stackOut_40_1 = null;
            String stackOut_40_2 = null;
            RuntimeException stackOut_39_0 = null;
            StringBuilder stackOut_39_1 = null;
            String stackOut_39_2 = null;
            var14 = Lexicominos.field_L ? 1 : 0;
            try {
              L0: {
                var18 = (Object) (Object) new pd();
                ((pd) var18).field_p = param2.d(true);
                ((pd) var18).field_j = param2.d((byte) 19);
                ((pd) var18).field_n = new int[((pd) var18).field_p];
                ((pd) var18).field_h = new int[((pd) var18).field_p];
                ((pd) var18).field_i = new ei[((pd) var18).field_p];
                ((pd) var18).field_k = new ei[((pd) var18).field_p];
                ((pd) var18).field_m = new int[((pd) var18).field_p];
                ((pd) var18).field_o = new byte[((pd) var18).field_p][][];
                var5 = 0;
                L1: while (true) {
                  if (((pd) var18).field_p <= var5) {
                    al.field_C.b(124, (kd) var18);
                    break L0;
                  } else {
                    try {
                      L2: {
                        L3: {
                          L4: {
                            var6_int = param2.d(true);
                            if (0 == var6_int) {
                              break L4;
                            } else {
                              if (1 == var6_int) {
                                break L4;
                              } else {
                                if (var6_int != 2) {
                                  L5: {
                                    if (var6_int == 3) {
                                      break L5;
                                    } else {
                                      if (var6_int == 4) {
                                        break L5;
                                      } else {
                                        break L3;
                                      }
                                    }
                                  }
                                  var20 = param2.c(false);
                                  var8 = param2.c(false);
                                  var9 = param2.d(true);
                                  var10 = new String[var9];
                                  var11_int = 0;
                                  L6: while (true) {
                                    if (var11_int >= var9) {
                                      L7: {
                                        var23 = new byte[var9][];
                                        var22 = var23;
                                        var21 = var22;
                                        var19 = var21;
                                        var11 = var19;
                                        if (var6_int == 3) {
                                          var12_int = 0;
                                          L8: while (true) {
                                            if (var12_int >= var9) {
                                              break L7;
                                            } else {
                                              var13 = param2.d((byte) 19);
                                              var11[var12_int] = new byte[var13];
                                              param2.a(116, var13, 0, var23[var12_int]);
                                              var12_int++;
                                              continue L8;
                                            }
                                          }
                                        } else {
                                          break L7;
                                        }
                                      }
                                      ((pd) var18).field_m[var5] = var6_int;
                                      var12 = new Class[var9];
                                      var17 = 0;
                                      var13 = var17;
                                      L9: while (true) {
                                        if (~var9 >= ~var17) {
                                          ((pd) var18).field_i[var5] = param3.a(var8, qf.a(-4174, var20), var12, (byte) 113);
                                          ((pd) var18).field_o[var5] = var23;
                                          break L3;
                                        } else {
                                          var12[var17] = qf.a(-4174, var10[var17]);
                                          var17++;
                                          continue L9;
                                        }
                                      }
                                    } else {
                                      var10[var11_int] = param2.c(false);
                                      var11_int++;
                                      continue L6;
                                    }
                                  }
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                          L10: {
                            var16 = param2.c(false);
                            var7 = var16;
                            var15 = param2.c(false);
                            var8 = var15;
                            var9 = 0;
                            if (var6_int == 1) {
                              var9 = param2.d((byte) 19);
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          ((pd) var18).field_m[var5] = var6_int;
                          ((pd) var18).field_h[var5] = var9;
                          ((pd) var18).field_k[var5] = param3.a(var15, 2, qf.a(-4174, var16));
                          break L3;
                        }
                        break L2;
                      }
                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L11: {
                        var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                        ((pd) var18).field_n[var5] = -1;
                        break L11;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter3) {
                      decompiledCaughtException = decompiledCaughtParameter3;
                      L14: {
                        var6_ref3 = (Exception) (Object) decompiledCaughtException;
                        ((pd) var18).field_n[var5] = -4;
                        break L14;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter4) {
                      decompiledCaughtException = decompiledCaughtParameter4;
                      L15: {
                        var6_ref4 = decompiledCaughtException;
                        ((pd) var18).field_n[var5] = -5;
                        break L15;
                      }
                    }
                    var5++;
                    continue L1;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L16: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_35_0 = (RuntimeException) var4;
                stackOut_35_1 = new StringBuilder().append("ge.H(").append(-127).append(',').append(param1).append(',');
                stackIn_37_0 = stackOut_35_0;
                stackIn_37_1 = stackOut_35_1;
                stackIn_36_0 = stackOut_35_0;
                stackIn_36_1 = stackOut_35_1;
                if (param2 == null) {
                  stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
                  stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
                  stackOut_37_2 = "null";
                  stackIn_38_0 = stackOut_37_0;
                  stackIn_38_1 = stackOut_37_1;
                  stackIn_38_2 = stackOut_37_2;
                  break L16;
                } else {
                  stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
                  stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
                  stackOut_36_2 = "{...}";
                  stackIn_38_0 = stackOut_36_0;
                  stackIn_38_1 = stackOut_36_1;
                  stackIn_38_2 = stackOut_36_2;
                  break L16;
                }
              }
              L17: {
                stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
                stackOut_38_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(',');
                stackIn_40_0 = stackOut_38_0;
                stackIn_40_1 = stackOut_38_1;
                stackIn_39_0 = stackOut_38_0;
                stackIn_39_1 = stackOut_38_1;
                if (param3 == null) {
                  stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
                  stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
                  stackOut_40_2 = "null";
                  stackIn_41_0 = stackOut_40_0;
                  stackIn_41_1 = stackOut_40_1;
                  stackIn_41_2 = stackOut_40_2;
                  break L17;
                } else {
                  stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
                  stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
                  stackOut_39_2 = "{...}";
                  stackIn_41_0 = stackOut_39_0;
                  stackIn_41_1 = stackOut_39_1;
                  stackIn_41_2 = stackOut_39_2;
                  break L17;
                }
              }
              throw ld.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int d(int param0) throws IOException {
        if (!(!((ge) this).field_l)) {
            return 0;
        }
        if (param0 != -6448) {
            ((ge) this).field_k = 100;
        }
        return ((ge) this).field_b.available();
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              try {
                L0: {
                  if (param0 == 0) {
                    var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
                    param1.getAppletContext().showDocument(gf.a(3, var2, param1), "_top");
                    break L0;
                  } else {
                    return;
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L1: {
                  var2_ref = (Exception) (Object) decompiledCaughtException;
                  var2_ref.printStackTrace();
                  break L1;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var2_ref2;
                stackOut_6_1 = new StringBuilder().append("ge.J(").append(param0).append(',');
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param1 == null) {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L2;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L2;
                }
              }
              throw ld.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void run() {
        try {
            IOException var1 = null;
            Exception var1_ref = null;
            int var1_int = 0;
            int var2 = 0;
            IOException var3 = null;
            Object var3_ref = null;
            InterruptedException var4 = null;
            Throwable var5 = null;
            int var6 = 0;
            Object var7 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            var6 = Lexicominos.field_L ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  var3_ref = this;
                  synchronized (var3_ref) {
                    L2: {
                      L3: {
                        if (((ge) this).field_k == ((ge) this).field_i) {
                          if (!((ge) this).field_l) {
                            {
                              L4: {
                                this.wait();
                                break L4;
                              }
                            }
                            break L3;
                          } else {
                            decompiledRegionSelector0 = 0;
                            break L2;
                          }
                        } else {
                          break L3;
                        }
                      }
                      L6: {
                        var2 = ((ge) this).field_k;
                        if (((ge) this).field_k <= ((ge) this).field_i) {
                          var1_int = ((ge) this).field_i + -((ge) this).field_k;
                          break L6;
                        } else {
                          var1_int = ((ge) this).field_a + -((ge) this).field_k;
                          break L6;
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L2;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    try {
                      L7: {
                        L8: {
                          if (null == ((ge) this).field_b) {
                            break L8;
                          } else {
                            ((ge) this).field_b.close();
                            break L8;
                          }
                        }
                        L9: {
                          if (((ge) this).field_h == null) {
                            break L9;
                          } else {
                            ((ge) this).field_h.close();
                            break L9;
                          }
                        }
                        L10: {
                          if (null == ((ge) this).field_g) {
                            break L10;
                          } else {
                            ((ge) this).field_g.close();
                            break L10;
                          }
                        }
                        break L7;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L11: {
                        var1 = (IOException) (Object) decompiledCaughtException;
                        break L11;
                      }
                    }
                    ((ge) this).field_f = null;
                    break L0;
                  } else {
                    if (0 >= var1_int) {
                      continue L1;
                    } else {
                      try {
                        L12: {
                          ((ge) this).field_h.write(((ge) this).field_f, var2, var1_int);
                          break L12;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          ((ge) this).field_j = true;
                          break L13;
                        }
                      }
                      ((ge) this).field_k = (((ge) this).field_k + var1_int) % ((ge) this).field_a;
                      try {
                        L14: {
                          L15: {
                            if (((ge) this).field_k != ((ge) this).field_i) {
                              break L15;
                            } else {
                              ((ge) this).field_h.flush();
                              break L15;
                            }
                          }
                          break L14;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L16: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          ((ge) this).field_j = true;
                          break L16;
                        }
                      }
                      continue L1;
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter4) {
              decompiledCaughtException = decompiledCaughtParameter4;
              L17: {
                var1_ref = (Exception) (Object) decompiledCaughtException;
                var7 = null;
                uj.a((String) null, (Throwable) (Object) var1_ref, 1);
                break L17;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void f(int param0) {
        int discarded$0 = -1980;
        int var1 = hc.f();
        if (param0 < 55) {
            field_e = null;
        }
        int discarded$1 = -6;
        int var2 = eb.d();
        ki.field_a.a(rf.field_c + -id.field_v, (id.field_v << 1) + var2, var1 - -(wh.field_f << 1), me.field_v - wh.field_f, -1160208572);
        int discarded$2 = 0;
        hi.b();
    }

    final int e(int param0) throws IOException {
        if (param0 != 291208897) {
            return -65;
        }
        if (!(!((ge) this).field_l)) {
            return 0;
        }
        return ((ge) this).field_b.read();
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        RuntimeException var5 = null;
        int var5_int = 0;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        int var9 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var9 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (((ge) this).field_l) {
              return;
            } else {
              if (!((ge) this).field_j) {
                L1: {
                  var5_int = 120 / ((param2 - -44) / 56);
                  if (null != ((ge) this).field_f) {
                    break L1;
                  } else {
                    ((ge) this).field_f = new byte[((ge) this).field_a];
                    break L1;
                  }
                }
                var6 = this;
                synchronized (var6) {
                  L2: {
                    var7 = 0;
                    L3: while (true) {
                      if (param1 <= var7) {
                        L4: {
                          if (((ge) this).field_c == null) {
                            ((ge) this).field_c = ((ge) this).field_d.a((Runnable) this, false, 3);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        this.notifyAll();
                        break L2;
                      } else {
                        ((ge) this).field_f[((ge) this).field_i] = param0[param3 + var7];
                        ((ge) this).field_i = (((ge) this).field_i - -1) % ((ge) this).field_a;
                        if (((ge) this).field_i != (((ge) this).field_a + (((ge) this).field_k - 100)) % ((ge) this).field_a) {
                          var7++;
                          continue L3;
                        } else {
                          throw new IOException();
                        }
                      }
                    }
                  }
                }
                break L0;
              } else {
                ((ge) this).field_j = false;
                throw new IOException();
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var5;
            stackOut_22_1 = new StringBuilder().append("ge.E(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L5;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L5;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void b(int param0) {
        InterruptedException interruptedException = null;
        Object var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        if (!((ge) this).field_l) {
          L0: {
            if (param0 > 13) {
              break L0;
            } else {
              ((ge) this).field_d = null;
              break L0;
            }
          }
          var2 = this;
          synchronized (var2) {
            L1: {
              ((ge) this).field_l = true;
              this.notifyAll();
              break L1;
            }
          }
          L2: {
            if (((ge) this).field_c != null) {
              L3: while (true) {
                if (((ge) this).field_c.field_b != 0) {
                  if (1 == ((ge) this).field_c.field_b) {
                    try {
                      L4: {
                        ((Thread) ((ge) this).field_c.field_g).join();
                        break L4;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                        break L5;
                      }
                    }
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  ge.a(0, 1L);
                  continue L3;
                }
              }
            } else {
              break L2;
            }
          }
          ((ge) this).field_c = null;
          return;
        } else {
          return;
        }
    }

    final void a(int param0) throws IOException {
        if (((ge) this).field_l) {
            return;
        }
        if (param0 != 0) {
            return;
        }
        if (!(!((ge) this).field_j)) {
            ((ge) this).field_j = false;
            throw new IOException();
        }
    }

    final static void a(int param0, long param1) {
        if (!(param1 > 0L)) {
            return;
        }
        if ((long)param0 == param1 % 10L) {
            wa.a((byte) 5, -1L + param1);
            wa.a((byte) 5, 1L);
        } else {
            wa.a((byte) 5, param1);
        }
    }

    private ge(java.net.Socket param0, ab param1, int param2) throws IOException {
        ((ge) this).field_k = 0;
        ((ge) this).field_i = 0;
        ((ge) this).field_l = false;
        ((ge) this).field_j = false;
        try {
            ((ge) this).field_g = param0;
            ((ge) this).field_d = param1;
            ((ge) this).field_g.setSoTimeout(30000);
            ((ge) this).field_g.setTcpNoDelay(true);
            ((ge) this).field_b = ((ge) this).field_g.getInputStream();
            ((ge) this).field_h = ((ge) this).field_g.getOutputStream();
            ((ge) this).field_a = param2;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "ge.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
    }
}
