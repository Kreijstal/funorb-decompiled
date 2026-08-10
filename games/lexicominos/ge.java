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
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (!this.field_l) {
              L1: while (true) {
                if (0 >= param2) {
                  L2: {
                    if (param1 == -109) {
                      break L2;
                    } else {
                      field_e = (String) null;
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var5_int = this.field_b.read(param0, param3, param2);
                  if (-1 > (var5_int ^ -1)) {
                    param3 = param3 + var5_int;
                    param2 = param2 - var5_int;
                    continue L1;
                  } else {
                    throw new EOFException();
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("ge.B(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    protected final void finalize() {
        this.b(58);
    }

    ge(java.net.Socket param0, ab param1) throws IOException {
        this(param0, param1, 5000);
    }

    public static void a(byte param0) {
        field_e = null;
        if (param0 != -59) {
            field_e = (String) null;
        }
    }

    final static void c(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
        th var15 = null;
        int[][] var19 = null;
        var12 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var13 = ig.field_a;
              var15 = var13;
              var2 = var15.d(true);
              if (param0 > 105) {
                break L1;
              } else {
                ge.f(-123);
                break L1;
              }
            }
            var3 = (f) ((Object) dj.field_c.a(true));
            L2: while (true) {
              L3: {
                if (var3 == null) {
                  break L3;
                } else {
                  if (var3.field_k == var2) {
                    break L3;
                  } else {
                    var3 = (f) ((Object) dj.field_c.f(2));
                    continue L2;
                  }
                }
              }
              if (var3 == null) {
                ck.b((byte) -47);
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                L4: {
                  var4 = var15.d(true);
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
                            var19 = new int[2][4 * var5];
                            var8 = pf.field_o;
                            var9 = 0;
                            var10 = 0;
                            L7: while (true) {
                              if (var8 <= var9) {
                                var9 = 0;
                                var14 = 0;
                                var10 = var14;
                                L8: while (true) {
                                  if (var8 > var9) {
                                    L9: {
                                      var11 = ff.field_a[var5 + var9];
                                      var6[1][var14] = ph.field_a[var11];
                                      var19[1][var14 * 4] = we.field_g[var11];
                                      var19[1][1 + 4 * var14] = l.field_D[var11];
                                      var19[1][2 + 4 * var14] = oc.field_a[var11];
                                      var19[1][var14 * 4 - -3] = hl.field_N[var11];
                                      if (md.a(ph.field_a[var11], -101)) {
                                        if (0 == hl.field_N[var11] + oc.field_a[var11] + l.field_D[var11]) {
                                          var6[1][var14] = null;
                                          var14--;
                                          break L9;
                                        } else {
                                          break L9;
                                        }
                                      } else {
                                        break L9;
                                      }
                                    }
                                    var14++;
                                    var9++;
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
                                  var19[0][4 * var10] = we.field_g[var11];
                                  var19[0][1 + 4 * var10] = l.field_D[var11];
                                  var19[0][2 + var10 * 4] = oc.field_a[var11];
                                  var19[0][var10 * 4 + 3] = hl.field_N[var11];
                                  if (!md.a(ph.field_a[var11], -113)) {
                                    break L10;
                                  } else {
                                    if (-1 != (oc.field_a[var11] + (l.field_D[var11] - -hl.field_N[var11]) ^ -1)) {
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
                              lh.a(var15, -95);
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
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var1), "ge.K(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(byte param0, int param1, wf param2, ab param3) {
        try {
            byte[] array$0 = null;
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
            pd var18 = null;
            byte[][] var19 = null;
            String var20 = null;
            byte[][] var21 = null;
            var14 = Lexicominos.field_L ? 1 : 0;
            try {
              L0: {
                L1: {
                  var18 = new pd();
                  var18.field_p = param2.d(true);
                  var18.field_j = param2.d((byte) 19);
                  var18.field_n = new int[var18.field_p];
                  var18.field_h = new int[var18.field_p];
                  if (param0 <= -120) {
                    break L1;
                  } else {
                    ge.a((byte) -107);
                    break L1;
                  }
                }
                var18.field_i = new ei[var18.field_p];
                var18.field_k = new ei[var18.field_p];
                var18.field_m = new int[var18.field_p];
                var18.field_o = new byte[var18.field_p][][];
                var5 = 0;
                L2: while (true) {
                  if (var18.field_p <= var5) {
                    al.field_C.b(124, var18);
                    break L0;
                  } else {
                    try {
                      L3: {
                        L4: {
                          L5: {
                            var6_int = param2.d(true);
                            if (0 == var6_int) {
                              break L5;
                            } else {
                              if (1 == var6_int) {
                                break L5;
                              } else {
                                if (-3 != (var6_int ^ -1)) {
                                  L6: {
                                    if (-4 == (var6_int ^ -1)) {
                                      break L6;
                                    } else {
                                      if (-5 == (var6_int ^ -1)) {
                                        break L6;
                                      } else {
                                        break L4;
                                      }
                                    }
                                  }
                                  var20 = param2.c(false);
                                  var8 = param2.c(false);
                                  var9 = param2.d(true);
                                  var10 = new String[var9];
                                  var11_int = 0;
                                  L7: while (true) {
                                    if (var11_int >= var9) {
                                      L8: {
                                        var21 = new byte[var9][];
                                        var19 = var21;
                                        var11 = var19;
                                        if (var6_int == 3) {
                                          var12_int = 0;
                                          L9: while (true) {
                                            if (var12_int >= var9) {
                                              break L8;
                                            } else {
                                              var13 = param2.d((byte) 19);
                                              array$0 = new byte[var13];
                                              var11[var12_int] = array$0;
                                              param2.a(116, var13, 0, var21[var12_int]);
                                              var12_int++;
                                              continue L9;
                                            }
                                          }
                                        } else {
                                          break L8;
                                        }
                                      }
                                      var18.field_m[var5] = var6_int;
                                      var12 = new Class[var9];
                                      var17 = 0;
                                      var13 = var17;
                                      L10: while (true) {
                                        if (var9 <= var17) {
                                          var18.field_i[var5] = param3.a(var8, qf.a(-4174, var20), var12, (byte) 113);
                                          var18.field_o[var5] = var21;
                                          break L4;
                                        } else {
                                          var12[var17] = qf.a(-4174, var10[var17]);
                                          var17++;
                                          continue L10;
                                        }
                                      }
                                    } else {
                                      var10[var11_int] = param2.c(false);
                                      var11_int++;
                                      continue L7;
                                    }
                                  }
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                          L11: {
                            var16 = param2.c(false);
                            var7 = var16;
                            var15 = param2.c(false);
                            var8 = var15;
                            var9 = 0;
                            if (var6_int == 1) {
                              var9 = param2.d((byte) 19);
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          var18.field_m[var5] = var6_int;
                          var18.field_h[var5] = var9;
                          var18.field_k[var5] = param3.a(var15, 2, qf.a(-4174, var16));
                          break L4;
                        }
                        break L3;
                      }
                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L12: {
                        var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                        var18.field_n[var5] = -1;
                        break L12;
                      }
                    } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L13: {
                        var6_ref = (SecurityException) (Object) decompiledCaughtException;
                        var18.field_n[var5] = -2;
                        break L13;
                      }
                    } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      L14: {
                        var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                        var18.field_n[var5] = -3;
                        break L14;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter3) {
                      decompiledCaughtException = decompiledCaughtParameter3;
                      L15: {
                        var6_ref3 = (Exception) (Object) decompiledCaughtException;
                        var18.field_n[var5] = -4;
                        break L15;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter4) {
                      decompiledCaughtException = decompiledCaughtParameter4;
                      L16: {
                        var6_ref4 = decompiledCaughtException;
                        var18.field_n[var5] = -5;
                        break L16;
                      }
                    }
                    var5++;
                    continue L2;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L17: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_39_0 = (RuntimeException) (var4);

                stackIn_39_1 = new StringBuilder().append("ge.H(").append(param0).append(',').append(param1).append(',');

                if (param2 == null) {
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


                stackIn_42_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_40_2).append(',');

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
              throw ld.a((Throwable) ((Object) stackIn_40_0), stackIn_43_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int d(int param0) throws IOException {
        if (!(!this.field_l)) {
            return 0;
        }
        if (param0 != -6448) {
            this.field_k = 100;
        }
        return this.field_b.available();
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            try {
              L0: {
                try {
                  L1: {
                    if (param0 == 0) {
                      var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
                      param1.getAppletContext().showDocument(gf.a(3, var2, param1), "_top");
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    decompiledRegionSelector0 = 1;
                    break L2;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var2_ref2);

                stackIn_8_1 = new StringBuilder().append("ge.J(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L3;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L3;
                }
              }
              throw ld.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void run() {
        try {
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int var1_int = 0;
            IOException var1 = null;
            Exception var1_ref = null;
            int var2 = 0;
            Object var3 = null;
            IOException var3_ref = null;
            InterruptedException var4 = null;
            int var6 = 0;
            String var7 = null;
            var6 = Lexicominos.field_L ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  var3 = this;
                  synchronized (var3) {
                    L2: {
                      L3: {
                        if (this.field_k == this.field_i) {
                          if (!this.field_l) {
                            try {
                              L4: {
                                this.wait();
                                break L4;
                              }
                            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                              decompiledCaughtException = decompiledCaughtParameter0;
                              L5: {
                                var4 = (InterruptedException) (Object) decompiledCaughtException;
                                break L5;
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
                        var2 = this.field_k;
                        if (this.field_k <= this.field_i) {
                          var1_int = this.field_i + -this.field_k;
                          break L6;
                        } else {
                          var1_int = this.field_a + -this.field_k;
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
                          if (null == this.field_b) {
                            break L8;
                          } else {
                            this.field_b.close();
                            break L8;
                          }
                        }
                        L9: {
                          if (this.field_h == null) {
                            break L9;
                          } else {
                            this.field_h.close();
                            break L9;
                          }
                        }
                        L10: {
                          if (null == this.field_g) {
                            break L10;
                          } else {
                            this.field_g.close();
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
                    this.field_f = null;
                    break L0;
                  } else {
                    if (0 >= var1_int) {
                      continue L1;
                    } else {
                      try {
                        L12: {
                          this.field_h.write(this.field_f, var2, var1_int);
                          break L12;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3_ref = (IOException) (Object) decompiledCaughtException;
                          this.field_j = true;
                          break L13;
                        }
                      }
                      this.field_k = (this.field_k + var1_int) % this.field_a;
                      try {
                        L14: {
                          L15: {
                            if (this.field_k != this.field_i) {
                              break L15;
                            } else {
                              this.field_h.flush();
                              break L15;
                            }
                          }
                          break L14;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L16: {
                          var3_ref = (IOException) (Object) decompiledCaughtException;
                          this.field_j = true;
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
                var7 = (String) null;
                uj.a((String) null, (Throwable) ((Object) var1_ref), 1);
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
        int var1 = hc.f(-1980);
        if (param0 < 55) {
            field_e = (String) null;
        }
        int var2 = eb.d((byte) -6);
        ki.field_a.a(rf.field_c + -id.field_v, (id.field_v << 291208897) + var2, var1 - -(wh.field_f << -2129819103), me.field_v - wh.field_f, -1160208572);
        hi.b(0);
    }

    final int e(int param0) throws IOException {
        if (param0 != 291208897) {
            return -65;
        }
        if (!(!this.field_l)) {
            return 0;
        }
        return this.field_b.read();
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        Object var6 = null;
        int var7 = 0;
        int var9 = 0;
        var9 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (this.field_l) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!this.field_j) {
                L1: {
                  var5_int = 120 / ((param2 - -44) / 56);
                  if (null != this.field_f) {
                    break L1;
                  } else {
                    this.field_f = new byte[this.field_a];
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
                          if (this.field_c == null) {
                            this.field_c = this.field_d.a((Runnable) (this), false, 3);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        this.notifyAll();
                        break L2;
                      } else {
                        this.field_f[this.field_i] = param0[param3 + var7];
                        this.field_i = (this.field_i - -1) % this.field_a;
                        if (this.field_i != (this.field_a + (this.field_k - 100)) % this.field_a) {
                          var7++;
                          continue L3;
                        } else {
                          throw new IOException();
                        }
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                this.field_j = false;
                throw new IOException();
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var5);

            stackIn_24_1 = new StringBuilder().append("ge.E(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L5;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L5;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void b(int param0) {
        try {
            int var4 = 0;
            var4 = Lexicominos.field_L ? 1 : 0;
            if (this.field_l) {
                return;
            }
            if (param0 <= 13) {
                this.field_d = (ab) null;
            }
            synchronized (this) {
                this.field_l = true;
                this.notifyAll();
            }
            if (!(this.field_c == null)) {
                while (-1 == (this.field_c.field_b ^ -1)) {
                    ge.a(0, 1L);
                }
                if (!(1 != this.field_c.field_b)) {
                    try {
                        ((Thread) (this.field_c.field_g)).join();
                    } catch (InterruptedException interruptedException) {
                    }
                }
            }
            this.field_c = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0) throws IOException {
        if (this.field_l) {
            return;
        }
        if (param0 != 0) {
            return;
        }
        if (!(!this.field_j)) {
            this.field_j = false;
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
        this.field_k = 0;
        this.field_i = 0;
        this.field_l = false;
        this.field_j = false;
        try {
            this.field_g = param0;
            this.field_d = param1;
            this.field_g.setSoTimeout(30000);
            this.field_g.setTcpNoDelay(true);
            this.field_b = this.field_g.getInputStream();
            this.field_h = this.field_g.getOutputStream();
            this.field_a = param2;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "ge.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_e = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
    }
}
