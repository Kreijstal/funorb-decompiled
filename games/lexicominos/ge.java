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
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (!this.field_l) {
              stackOut_3_0 = 0;
              stackIn_5_0 = stackOut_3_0;
              L1: while (true) {
                L2: {
                  L3: {
                    L4: {
                      if (stackIn_5_0 >= param2) {
                        break L4;
                      } else {
                        var5_int = this.field_b.read(param0, param3, param2);
                        var8 = var5_int ^ -1;
                        var7 = -1;
                        if (var6 != 0) {
                          if (var7 == var8) {
                            break L2;
                          } else {
                            break L3;
                          }
                        } else {
                          if (var7 > var8) {
                            param3 = param3 + var5_int;
                            param2 = param2 - var5_int;
                            if (var6 == 0) {
                              stackOut_4_0 = 0;
                              stackIn_5_0 = stackOut_4_0;
                              continue L1;
                            } else {
                              break L4;
                            }
                          } else {
                            throw new EOFException();
                          }
                        }
                      }
                    }
                    if (param1 == -109) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                  field_e = (String) null;
                  return;
                }
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
          L5: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var5);
            stackOut_16_1 = new StringBuilder().append("ge.B(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
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
        if (param0 == -59) {
            return;
        }
        field_e = (String) null;
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
        th var14 = null;
        int[][] var18 = null;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_31_0 = 0;
        boolean stackIn_34_0 = false;
        int stackIn_39_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_38_0 = 0;
        boolean stackOut_33_0 = false;
        var12 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var13 = ig.field_a;
              var14 = var13;
              var2 = var14.d(true);
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
                L4: {
                  if (var3 == null) {
                    break L4;
                  } else {
                    stackOut_5_0 = var3.field_k;
                    stackIn_11_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var12 != 0) {
                      break L3;
                    } else {
                      if (stackIn_6_0 == var2) {
                        break L4;
                      } else {
                        var3 = (f) ((Object) dj.field_c.f(2));
                        if (var12 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                if (var3 == null) {
                  stackOut_10_0 = -47;
                  stackIn_11_0 = stackOut_10_0;
                  break L3;
                } else {
                  L5: {
                    var4 = var14.d(true);
                    if (var4 != 0) {
                      var5 = var3.field_j;
                      ph.field_a[0] = og.field_c;
                      var6_int = 1;
                      L6: while (true) {
                        L7: {
                          if (var4 <= var6_int) {
                            fb.a((byte) -107, var5, var4);
                            break L7;
                          } else {
                            ph.field_a[var6_int] = var13.c(false);
                            var6_int++;
                            if (var12 != 0) {
                              break L7;
                            } else {
                              continue L6;
                            }
                          }
                        }
                        var6_int = 0;
                        L8: while (true) {
                          L9: {
                            if (var6_int >= var4) {
                              bh.b((byte) 83, var5);
                              stackOut_30_0 = 2;
                              stackIn_31_0 = stackOut_30_0;
                              break L9;
                            } else {
                              lh.a(var14, -95);
                              stackOut_23_0 = var6_int;
                              stackIn_31_0 = stackOut_23_0;
                              stackIn_24_0 = stackOut_23_0;
                              if (var12 != 0) {
                                break L9;
                              } else {
                                L10: {
                                  if (stackIn_24_0 == 0) {
                                    ra.a(sg.field_a, 0, th.field_s, hh.field_I, var6_int, ki.field_g);
                                    break L10;
                                  } else {
                                    ra.a(sg.field_a, 0, th.field_s, hh.field_I, var6_int, ki.field_g);
                                    if (var12 == 0) {
                                      break L10;
                                    } else {
                                      ra.a(sg.field_a, 0, th.field_s, hh.field_I, var6_int, ki.field_g);
                                      break L10;
                                    }
                                  }
                                }
                                var6_int++;
                                continue L8;
                              }
                            }
                          }
                          var6 = new String[stackIn_31_0][var5];
                          var18 = new int[2][4 * var5];
                          var8 = pf.field_o;
                          var9 = 0;
                          var10 = 0;
                          L11: while (true) {
                            L12: {
                              if (var8 <= var9) {
                                var9 = 0;
                                stackOut_38_0 = 0;
                                stackIn_39_0 = stackOut_38_0;
                                break L12;
                              } else {
                                var11 = ff.field_a[var9];
                                var6[0][var10] = ph.field_a[var11];
                                var18[0][4 * var10] = we.field_g[var11];
                                var18[0][1 + 4 * var10] = l.field_D[var11];
                                var18[0][2 + var10 * 4] = oc.field_a[var11];
                                var18[0][var10 * 4 + 3] = hl.field_N[var11];
                                stackOut_33_0 = md.a(ph.field_a[var11], -113);
                                stackIn_39_0 = stackOut_33_0 ? 1 : 0;
                                stackIn_34_0 = stackOut_33_0;
                                if (var12 != 0) {
                                  break L12;
                                } else {
                                  L13: {
                                    if (!stackIn_34_0) {
                                      break L13;
                                    } else {
                                      if (-1 != (oc.field_a[var11] + (l.field_D[var11] - -hl.field_N[var11]) ^ -1)) {
                                        break L13;
                                      } else {
                                        var6[0][var10] = null;
                                        var10--;
                                        break L13;
                                      }
                                    }
                                  }
                                  var10++;
                                  var9++;
                                  continue L11;
                                }
                              }
                            }
                            var10 = stackIn_39_0;
                            L14: while (true) {
                              if (var8 > var9) {
                                var11 = ff.field_a[var5 + var9];
                                var6[1][var10] = ph.field_a[var11];
                                var18[1][var10 * 4] = we.field_g[var11];
                                var18[1][1 + 4 * var10] = l.field_D[var11];
                                var18[1][2 + 4 * var10] = oc.field_a[var11];
                                var18[1][var10 * 4 - -3] = hl.field_N[var11];
                                if (var12 != 0) {
                                  break L5;
                                } else {
                                  L15: {
                                    if (md.a(ph.field_a[var11], -101)) {
                                      if (0 == hl.field_N[var11] + oc.field_a[var11] + l.field_D[var11]) {
                                        var6[1][var10] = null;
                                        var10--;
                                        break L15;
                                      } else {
                                        break L15;
                                      }
                                    } else {
                                      break L15;
                                    }
                                  }
                                  var10++;
                                  var9++;
                                  continue L14;
                                }
                              } else {
                                var3.b((byte) -127);
                                break L5;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      var3.b((byte) -127);
                      break L5;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
              ck.b((byte) stackIn_11_0);
              decompiledRegionSelector0 = 0;
              break L0;
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
            pd var15_ref = null;
            String var16 = null;
            byte[][] var17 = null;
            String var18 = null;
            byte[][] var19 = null;
            RuntimeException stackIn_47_0 = null;
            StringBuilder stackIn_47_1 = null;
            RuntimeException stackIn_48_0 = null;
            StringBuilder stackIn_48_1 = null;
            RuntimeException stackIn_49_0 = null;
            StringBuilder stackIn_49_1 = null;
            String stackIn_49_2 = null;
            RuntimeException stackIn_50_0 = null;
            StringBuilder stackIn_50_1 = null;
            RuntimeException stackIn_51_0 = null;
            StringBuilder stackIn_51_1 = null;
            RuntimeException stackIn_52_0 = null;
            StringBuilder stackIn_52_1 = null;
            String stackIn_52_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_46_0 = null;
            StringBuilder stackOut_46_1 = null;
            RuntimeException stackOut_48_0 = null;
            StringBuilder stackOut_48_1 = null;
            String stackOut_48_2 = null;
            RuntimeException stackOut_47_0 = null;
            StringBuilder stackOut_47_1 = null;
            String stackOut_47_2 = null;
            RuntimeException stackOut_49_0 = null;
            StringBuilder stackOut_49_1 = null;
            RuntimeException stackOut_51_0 = null;
            StringBuilder stackOut_51_1 = null;
            String stackOut_51_2 = null;
            RuntimeException stackOut_50_0 = null;
            StringBuilder stackOut_50_1 = null;
            String stackOut_50_2 = null;
            var14 = Lexicominos.field_L ? 1 : 0;
            try {
              L0: {
                L1: {
                  var15_ref = new pd();
                  var15_ref.field_p = param2.d(true);
                  var15_ref.field_j = param2.d((byte) 19);
                  var15_ref.field_n = new int[var15_ref.field_p];
                  var15_ref.field_h = new int[var15_ref.field_p];
                  if (param0 <= -120) {
                    break L1;
                  } else {
                    ge.a((byte) -107);
                    break L1;
                  }
                }
                var15_ref.field_i = new ei[var15_ref.field_p];
                var15_ref.field_k = new ei[var15_ref.field_p];
                var15_ref.field_m = new int[var15_ref.field_p];
                var15_ref.field_o = new byte[var15_ref.field_p][][];
                var5 = 0;
                L2: while (true) {
                  L3: {
                    L4: {
                      if (var15_ref.field_p <= var5) {
                        break L4;
                      } else {
                        try {
                          L5: {
                            var6_int = param2.d(true);
                            if (var14 != 0) {
                              decompiledRegionSelector0 = 0;
                              break L5;
                            } else {
                              L6: {
                                L7: {
                                  L8: {
                                    if (0 == var6_int) {
                                      break L8;
                                    } else {
                                      if (1 == var6_int) {
                                        break L8;
                                      } else {
                                        if (-3 != (var6_int ^ -1)) {
                                          break L7;
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                  }
                                  L9: {
                                    var16 = param2.c(false);
                                    var8 = param2.c(false);
                                    var9 = 0;
                                    if (var6_int == 1) {
                                      var9 = param2.d((byte) 19);
                                      break L9;
                                    } else {
                                      break L9;
                                    }
                                  }
                                  var15_ref.field_m[var5] = var6_int;
                                  var15_ref.field_h[var5] = var9;
                                  var15_ref.field_k[var5] = param3.a(var8, 2, qf.a(-4174, var16));
                                  if (var14 == 0) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                                L10: {
                                  if (-4 == (var6_int ^ -1)) {
                                    break L10;
                                  } else {
                                    if (-5 == (var6_int ^ -1)) {
                                      break L10;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                                var18 = param2.c(false);
                                var8 = param2.c(false);
                                var9 = param2.d(true);
                                var10 = new String[var9];
                                var11_int = 0;
                                L11: while (true) {
                                  if (var11_int >= var9) {
                                    L12: {
                                      L13: {
                                        var19 = new byte[var9][];
                                        var17 = var19;
                                        var11 = var17;
                                        if (var6_int == 3) {
                                          var12_int = 0;
                                          L14: while (true) {
                                            if (var12_int >= var9) {
                                              break L13;
                                            } else {
                                              var13 = param2.d((byte) 19);
                                              array$1 = new byte[var13];
                                              var11[var12_int] = array$1;
                                              param2.a(116, var13, 0, var19[var12_int]);
                                              var12_int++;
                                              if (var14 != 0) {
                                                break L12;
                                              } else {
                                                continue L14;
                                              }
                                            }
                                          }
                                        } else {
                                          break L13;
                                        }
                                      }
                                      var15_ref.field_m[var5] = var6_int;
                                      break L12;
                                    }
                                    var12 = new Class[var9];
                                    var13 = 0;
                                    L15: while (true) {
                                      L16: {
                                        if (var9 <= var13) {
                                          var15_ref.field_i[var5] = param3.a(var8, qf.a(-4174, var18), var12, (byte) 113);
                                          break L16;
                                        } else {
                                          var12[var13] = qf.a(-4174, var10[var13]);
                                          var13++;
                                          if (var14 != 0) {
                                            break L16;
                                          } else {
                                            continue L15;
                                          }
                                        }
                                      }
                                      var15_ref.field_o[var5] = var19;
                                      break L6;
                                    }
                                  } else {
                                    var10[var11_int] = param2.c(false);
                                    var11_int++;
                                    if (var14 != 0) {
                                      break L6;
                                    } else {
                                      continue L11;
                                    }
                                  }
                                }
                              }
                              decompiledRegionSelector0 = 1;
                              break L5;
                            }
                          }
                        } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          L17: {
                            var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                            var15_ref.field_n[var5] = -1;
                            decompiledRegionSelector0 = 1;
                            break L17;
                          }
                        } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          L18: {
                            var6_ref = (SecurityException) (Object) decompiledCaughtException;
                            var15_ref.field_n[var5] = -2;
                            decompiledRegionSelector0 = 1;
                            break L18;
                          }
                        } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                          decompiledCaughtException = decompiledCaughtParameter2;
                          L19: {
                            var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                            var15_ref.field_n[var5] = -3;
                            decompiledRegionSelector0 = 1;
                            break L19;
                          }
                        } catch (java.lang.Exception decompiledCaughtParameter3) {
                          decompiledCaughtException = decompiledCaughtParameter3;
                          L20: {
                            var6_ref3 = (Exception) (Object) decompiledCaughtException;
                            var15_ref.field_n[var5] = -4;
                            decompiledRegionSelector0 = 1;
                            break L20;
                          }
                        } catch (java.lang.Throwable decompiledCaughtParameter4) {
                          decompiledCaughtException = decompiledCaughtParameter4;
                          L21: {
                            var6_ref4 = decompiledCaughtException;
                            var15_ref.field_n[var5] = -5;
                            decompiledRegionSelector0 = 1;
                            break L21;
                          }
                        }
                        if (decompiledRegionSelector0 == 0) {
                          break L3;
                        } else {
                          var5++;
                          if (var14 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    al.field_C.b(124, var15_ref);
                    break L3;
                  }
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L22: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_46_0 = (RuntimeException) (var4);
                stackOut_46_1 = new StringBuilder().append("ge.H(").append(param0).append(',').append(param1).append(',');
                stackIn_48_0 = stackOut_46_0;
                stackIn_48_1 = stackOut_46_1;
                stackIn_47_0 = stackOut_46_0;
                stackIn_47_1 = stackOut_46_1;
                if (param2 == null) {
                  stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
                  stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
                  stackOut_48_2 = "null";
                  stackIn_49_0 = stackOut_48_0;
                  stackIn_49_1 = stackOut_48_1;
                  stackIn_49_2 = stackOut_48_2;
                  break L22;
                } else {
                  stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
                  stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
                  stackOut_47_2 = "{...}";
                  stackIn_49_0 = stackOut_47_0;
                  stackIn_49_1 = stackOut_47_1;
                  stackIn_49_2 = stackOut_47_2;
                  break L22;
                }
              }
              L23: {
                stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
                stackOut_49_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_49_2).append(',');
                stackIn_51_0 = stackOut_49_0;
                stackIn_51_1 = stackOut_49_1;
                stackIn_50_0 = stackOut_49_0;
                stackIn_50_1 = stackOut_49_1;
                if (param3 == null) {
                  stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
                  stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
                  stackOut_51_2 = "null";
                  stackIn_52_0 = stackOut_51_0;
                  stackIn_52_1 = stackOut_51_1;
                  stackIn_52_2 = stackOut_51_2;
                  break L23;
                } else {
                  stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
                  stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
                  stackOut_50_2 = "{...}";
                  stackIn_52_0 = stackOut_50_0;
                  stackIn_52_1 = stackOut_50_1;
                  stackIn_52_2 = stackOut_50_2;
                  break L23;
                }
              }
              throw ld.a((Throwable) ((Object) stackIn_52_0), stackIn_52_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int d(int param0) throws IOException {
        if (this.field_l) {
          return 0;
        } else {
          if (param0 != -6448) {
            this.field_k = 100;
            return this.field_b.available();
          } else {
            return this.field_b.available();
          }
        }
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
            int decompiledRegionSelector0 = 0;
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
                  var2_ref = (Exception) (Object) decompiledCaughtException;
                  var2_ref.printStackTrace();
                  return;
                }
                if (decompiledRegionSelector0 == 0) {
                  break L0;
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) (var2_ref2);
                stackOut_6_1 = new StringBuilder().append("ge.J(").append(param0).append(',');
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param1 == null) {
                  stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L2;
                } else {
                  stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L2;
                }
              }
              throw ld.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
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
            String var7 = null;
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
                        if (this.field_k == this.field_i) {
                          L4: {
                            if (!this.field_l) {
                              break L4;
                            } else {
                              if (var6 == 0) {
                                decompiledRegionSelector0 = 0;
                                break L2;
                              } else {
                                break L4;
                              }
                            }
                          }
                          try {
                            L5: {
                              this.wait();
                              break L5;
                            }
                          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                            decompiledCaughtException = decompiledCaughtParameter0;
                            L6: {
                              var4 = (InterruptedException) (Object) decompiledCaughtException;
                              break L6;
                            }
                          }
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L7: {
                        L8: {
                          var2 = this.field_k;
                          if (this.field_k <= this.field_i) {
                            break L8;
                          } else {
                            var1_int = this.field_a + -this.field_k;
                            if (var6 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var1_int = this.field_i + -this.field_k;
                        break L7;
                      }
                      decompiledRegionSelector0 = 1;
                      break L2;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    try {
                      L9: {
                        L10: {
                          if (null == this.field_b) {
                            break L10;
                          } else {
                            this.field_b.close();
                            break L10;
                          }
                        }
                        L11: {
                          if (this.field_h == null) {
                            break L11;
                          } else {
                            this.field_h.close();
                            break L11;
                          }
                        }
                        L12: {
                          if (null == this.field_g) {
                            break L12;
                          } else {
                            this.field_g.close();
                            break L12;
                          }
                        }
                        break L9;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L13: {
                        var1 = (IOException) (Object) decompiledCaughtException;
                        break L13;
                      }
                    }
                    this.field_f = null;
                    break L0;
                  } else {
                    if (0 >= var1_int) {
                      continue L1;
                    } else {
                      try {
                        L14: {
                          this.field_h.write(this.field_f, var2, var1_int);
                          break L14;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L15: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          this.field_j = true;
                          break L15;
                        }
                      }
                      this.field_k = (this.field_k + var1_int) % this.field_a;
                      try {
                        L16: {
                          L17: {
                            if (this.field_k != this.field_i) {
                              break L17;
                            } else {
                              this.field_h.flush();
                              break L17;
                            }
                          }
                          break L16;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L18: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          this.field_j = true;
                          break L18;
                        }
                      }
                      continue L1;
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter4) {
              decompiledCaughtException = decompiledCaughtParameter4;
              L19: {
                var1_ref = (Exception) (Object) decompiledCaughtException;
                var7 = (String) null;
                uj.a((String) null, (Throwable) ((Object) var1_ref), 1);
                break L19;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void f(int param0) {
        int var1 = 0;
        int var2 = 0;
        var1 = hc.f(-1980);
        if (param0 < 55) {
          field_e = (String) null;
          var2 = eb.d((byte) -6);
          ki.field_a.a(rf.field_c + -id.field_v, (id.field_v << 291208897) + var2, var1 - -(wh.field_f << -2129819103), me.field_v - wh.field_f, -1160208572);
          hi.b(0);
          return;
        } else {
          var2 = eb.d((byte) -6);
          ki.field_a.a(rf.field_c + -id.field_v, (id.field_v << 291208897) + var2, var1 - -(wh.field_f << -2129819103), me.field_v - wh.field_f, -1160208572);
          hi.b(0);
          return;
        }
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
        RuntimeException var5 = null;
        int var5_int = 0;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        int var9 = 0;
        Object stackIn_12_0 = null;
        Object stackIn_16_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_15_0 = null;
        Object stackOut_11_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var9 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (this.field_l) {
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
                      L4: {
                        if (param1 <= var7) {
                          stackOut_15_0 = this;
                          stackIn_16_0 = stackOut_15_0;
                          break L4;
                        } else {
                          this.field_f[this.field_i] = param0[param3 + var7];
                          this.field_i = (this.field_i - -1) % this.field_a;
                          stackOut_11_0 = this;
                          stackIn_16_0 = stackOut_11_0;
                          stackIn_12_0 = stackOut_11_0;
                          if (var9 != 0) {
                            break L4;
                          } else {
                            if (((ge) (this)).field_i != (this.field_a + (this.field_k - 100)) % this.field_a) {
                              var7++;
                              continue L3;
                            } else {
                              throw new IOException();
                            }
                          }
                        }
                      }
                      L5: {
                        if (((ge) (this)).field_c == null) {
                          this.field_c = this.field_d.a((Runnable) (this), false, 3);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      this.notifyAll();
                      break L2;
                    }
                  }
                }
                return;
              } else {
                this.field_j = false;
                throw new IOException();
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var5);
            stackOut_24_1 = new StringBuilder().append("ge.E(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L6;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L6;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void b(int param0) {
        try {
            InterruptedException var2 = null;
            Object var2_ref = null;
            Throwable var3 = null;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            var4 = Lexicominos.field_L ? 1 : 0;
            if (!this.field_l) {
              L0: {
                if (param0 > 13) {
                  break L0;
                } else {
                  this.field_d = (ab) null;
                  break L0;
                }
              }
              var2_ref = this;
              synchronized (var2_ref) {
                L1: {
                  this.field_l = true;
                  this.notifyAll();
                  break L1;
                }
              }
              if (this.field_c != null) {
                L2: while (true) {
                  L3: {
                    L4: {
                      if (-1 != (this.field_c.field_b ^ -1)) {
                        break L4;
                      } else {
                        ge.a(0, 1L);
                        if (var4 != 0) {
                          break L3;
                        } else {
                          if (var4 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    if (1 == this.field_c.field_b) {
                      try {
                        L5: {
                          ((Thread) (this.field_c.field_g)).join();
                          break L5;
                        }
                      } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var2 = (InterruptedException) (Object) decompiledCaughtException;
                        this.field_c = null;
                        return;
                      }
                      break L3;
                    } else {
                      this.field_c = null;
                      return;
                    }
                  }
                  this.field_c = null;
                  return;
                }
              } else {
                this.field_c = null;
                return;
              }
            } else {
              return;
            }
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
        if (param1 <= 0L) {
          return;
        } else {
          if ((long)param0 == param1 % 10L) {
            wa.a((byte) 5, -1L + param1);
            wa.a((byte) 5, 1L);
            if (Lexicominos.field_L) {
              wa.a((byte) 5, param1);
              return;
            } else {
              return;
            }
          } else {
            wa.a((byte) 5, param1);
            return;
          }
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
