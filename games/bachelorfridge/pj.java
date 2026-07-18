/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pj implements Runnable {
    static int[][] field_b;
    static int[] field_o;
    private int field_q;
    private byte[] field_d;
    static int[] field_l;
    private boolean field_g;
    private boolean field_r;
    private ht field_i;
    private InputStream field_f;
    static int[] field_c;
    private eh field_m;
    private int field_j;
    static int[] field_h;
    private int field_e;
    private OutputStream field_p;
    private java.net.Socket field_k;
    static kf field_n;
    static String field_a;

    final int b(int param0) throws IOException {
        if (!(!((pj) this).field_g)) {
            return 0;
        }
        int var2 = 120 / ((param0 - 21) / 63);
        return ((pj) this).field_f.available();
    }

    protected final void finalize() {
        ((pj) this).a((byte) 55);
    }

    final void c(byte param0) throws IOException {
        if (param0 != 34) {
            pj.a(100, 22, -76, 55, -23, -24, -104);
        }
        if (((pj) this).field_g) {
            return;
        }
        if (((pj) this).field_r) {
            ((pj) this).field_r = false;
            throw new IOException();
        }
    }

    pj(java.net.Socket param0, ht param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(byte param0) {
        InterruptedException interruptedException = null;
        Object var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Object var5 = null;
        Throwable decompiledCaughtException = null;
        var4 = BachelorFridge.field_y;
        if (((pj) this).field_g) {
          return;
        } else {
          var2 = this;
          synchronized (var2) {
            L0: {
              L1: {
                ((pj) this).field_g = true;
                this.notifyAll();
                if (param0 >= 26) {
                  break L1;
                } else {
                  var5 = null;
                  pj.a(true, (vr) null);
                  break L1;
                }
              }
              break L0;
            }
          }
          L2: {
            if (null != ((pj) this).field_m) {
              L3: while (true) {
                if (-1 != ((pj) this).field_m.field_f) {
                  if (-2 == ((pj) this).field_m.field_f) {
                    try {
                      L4: {
                        ((Thread) ((pj) this).field_m.field_e).join();
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
                  gda.a(false, 1L);
                  continue L3;
                }
              }
            } else {
              break L2;
            }
          }
          ((pj) this).field_m = null;
          return;
        }
    }

    final static void a(boolean param0, vr param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
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
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            bk.field_v = param1;
            bca.field_n = new al[50][12];
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= 50) {
                break L0;
              } else {
                var3 = 0;
                L2: while (true) {
                  if (var3 >= 12) {
                    var2_int++;
                    continue L1;
                  } else {
                    bca.field_n[var2_int][var3] = new al((hs) null);
                    var3++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var2;
            stackOut_10_1 = new StringBuilder().append("pj.B(").append(true).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
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
          throw pe.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    final static void a(String param0, byte param1, long param2) {
        RuntimeException var4 = null;
        CharSequence var5 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            gk.field_d = 2;
            bd.field_k = param0;
            var5 = (CharSequence) (Object) param0;
            df.field_s = fq.a(0, var5);
            eaa.field_a = param2;
            bb.h(0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("pj.D(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + 89 + ',' + param2 + ')');
        }
    }

    final void a(int param0, byte[] param1, boolean param2, int param3) throws IOException {
        RuntimeException var5 = null;
        Object var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int var8 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var8 = BachelorFridge.field_y;
        try {
          L0: {
            if (!((pj) this).field_g) {
              if (!((pj) this).field_r) {
                L1: {
                  if (null != ((pj) this).field_d) {
                    break L1;
                  } else {
                    ((pj) this).field_d = new byte[((pj) this).field_e];
                    break L1;
                  }
                }
                var5_ref = this;
                synchronized (var5_ref) {
                  L2: {
                    L3: {
                      if (!param2) {
                        break L3;
                      } else {
                        field_a = null;
                        break L3;
                      }
                    }
                    var6 = 0;
                    L4: while (true) {
                      if (param3 <= var6) {
                        L5: {
                          if (null == ((pj) this).field_m) {
                            ((pj) this).field_m = ((pj) this).field_i.a((Runnable) this, 2, 3);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        this.notifyAll();
                        break L2;
                      } else {
                        ((pj) this).field_d[((pj) this).field_j] = param1[var6 + param0];
                        ((pj) this).field_j = (1 + ((pj) this).field_j) % ((pj) this).field_e;
                        if (((pj) this).field_j != (((pj) this).field_e + ((pj) this).field_q + -100) % ((pj) this).field_e) {
                          var6++;
                          continue L4;
                        } else {
                          throw new IOException();
                        }
                      }
                    }
                  }
                }
                break L0;
              } else {
                ((pj) this).field_r = false;
                throw new IOException();
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var5;
            stackOut_23_1 = new StringBuilder().append("pj.F(").append(param0).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L6;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L6;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, byte param1, byte[] param2, int param3) throws IOException {
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
        var6 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param1 >= 63) {
                break L1;
              } else {
                ((pj) this).field_k = null;
                break L1;
              }
            }
            if (!((pj) this).field_g) {
              L2: while (true) {
                if (param3 <= 0) {
                  break L0;
                } else {
                  var5_int = ((pj) this).field_f.read(param2, param0, param3);
                  if (var5_int > 0) {
                    param3 = param3 - var5_int;
                    param0 = param0 + var5_int;
                    continue L2;
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
            stackOut_10_1 = new StringBuilder().append("pj.J(").append(param0).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
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
          throw pe.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param3 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        int var1 = 0;
        field_o = null;
        field_l = null;
        field_n = null;
        field_a = null;
        field_c = null;
        field_h = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
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
        int var23 = 0;
        int[] var39 = null;
        int[] var40 = null;
        int[] var41 = null;
        int[] var42 = null;
        int[] var43 = null;
        int stackIn_39_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        var23 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              gp.a(true, param4);
              var7_int = 0;
              var8 = param4 + -param1;
              if (var8 >= 0) {
                break L1;
              } else {
                var8 = 0;
                break L1;
              }
            }
            L2: {
              var9 = param4;
              if (param2 == 170) {
                break L2;
              } else {
                pj.a(-84, 121, -44, 18, 93, 118, -63);
                break L2;
              }
            }
            L3: {
              L4: {
                var10 = -param4;
                var11 = var8;
                var12 = -var8;
                var13 = -1;
                var14 = -1;
                if (~an.field_q < ~param0) {
                  break L4;
                } else {
                  if (~param0 >= ~ha.field_n) {
                    var39 = tj.field_b[param0];
                    var16 = cr.a(eo.field_l, param3 - param4, pw.field_x, 0);
                    var17 = cr.a(eo.field_l, param3 + param4, pw.field_x, param2 + -170);
                    var18 = cr.a(eo.field_l, -var8 + param3, pw.field_x, param2 ^ 170);
                    var19 = cr.a(eo.field_l, var8 + param3, pw.field_x, param2 + -170);
                    hba.a(param5, var16, var39, 7, var18);
                    hba.a(param6, var18, var39, param2 + -163, var19);
                    hba.a(param5, var19, var39, 7, var17);
                    break L4;
                  } else {
                    break L3;
                  }
                }
              }
              break L3;
            }
            L5: while (true) {
              if (var7_int >= var9) {
                break L0;
              } else {
                L6: {
                  var13 += 2;
                  var14 += 2;
                  var10 = var10 + var13;
                  var12 = var12 + var14;
                  if (var12 < 0) {
                    break L6;
                  } else {
                    if (var11 >= 1) {
                      var11--;
                      var12 = var12 - (var11 << 1);
                      it.field_l[var11] = var7_int;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  var7_int++;
                  if (var10 < 0) {
                    break L7;
                  } else {
                    var9--;
                    var10 = var10 - (var9 << 1);
                    var15 = -var9 + param0;
                    var16 = param0 + var9;
                    if (var16 < an.field_q) {
                      break L7;
                    } else {
                      if (~ha.field_n <= ~var15) {
                        if (~var8 < ~var9) {
                          L8: {
                            var17 = it.field_l[var9];
                            var18 = cr.a(eo.field_l, var7_int + param3, pw.field_x, param2 + -170);
                            var19 = cr.a(eo.field_l, param3 - var7_int, pw.field_x, 0);
                            var20 = cr.a(eo.field_l, param3 + var17, pw.field_x, 0);
                            var21 = cr.a(eo.field_l, -var17 + param3, pw.field_x, 0);
                            if (~ha.field_n > ~var16) {
                              break L8;
                            } else {
                              var40 = tj.field_b[var16];
                              hba.a(param5, var19, var40, 7, var21);
                              hba.a(param6, var21, var40, 7, var20);
                              hba.a(param5, var20, var40, 7, var18);
                              break L8;
                            }
                          }
                          if (~an.field_q >= ~var15) {
                            var41 = tj.field_b[var15];
                            hba.a(param5, var19, var41, 7, var21);
                            hba.a(param6, var21, var41, param2 ^ 173, var20);
                            hba.a(param5, var20, var41, 7, var18);
                            break L7;
                          } else {
                            break L7;
                          }
                        } else {
                          L9: {
                            var17 = cr.a(eo.field_l, var7_int + param3, pw.field_x, 0);
                            var18 = cr.a(eo.field_l, -var7_int + param3, pw.field_x, 0);
                            if (ha.field_n >= var16) {
                              hba.a(param5, var18, tj.field_b[var16], 7, var17);
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          if (~an.field_q < ~var15) {
                            break L7;
                          } else {
                            hba.a(param5, var18, tj.field_b[var15], 7, var17);
                            break L7;
                          }
                        }
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                L10: {
                  var15 = param0 - var7_int;
                  var16 = param0 - -var7_int;
                  if (var16 < an.field_q) {
                    break L10;
                  } else {
                    if (~ha.field_n > ~var15) {
                      break L10;
                    } else {
                      var17 = param3 + var9;
                      var18 = -var9 + param3;
                      if (eo.field_l > var17) {
                        break L10;
                      } else {
                        if (~pw.field_x <= ~var18) {
                          var17 = cr.a(eo.field_l, var17, pw.field_x, param2 ^ 170);
                          var18 = cr.a(eo.field_l, var18, pw.field_x, 0);
                          if (~var7_int <= ~var8) {
                            L11: {
                              if (var16 <= ha.field_n) {
                                hba.a(param5, var18, tj.field_b[var16], 7, var17);
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                            if (var15 < an.field_q) {
                              break L10;
                            } else {
                              hba.a(param5, var18, tj.field_b[var15], param2 + -163, var17);
                              continue L5;
                            }
                          } else {
                            L12: {
                              if (~var11 > ~var7_int) {
                                stackOut_38_0 = it.field_l[var7_int];
                                stackIn_39_0 = stackOut_38_0;
                                break L12;
                              } else {
                                stackOut_37_0 = var11;
                                stackIn_39_0 = stackOut_37_0;
                                break L12;
                              }
                            }
                            L13: {
                              var19 = stackIn_39_0;
                              var20 = cr.a(eo.field_l, param3 + var19, pw.field_x, 0);
                              var21 = cr.a(eo.field_l, -var19 + param3, pw.field_x, 0);
                              if (~ha.field_n > ~var16) {
                                break L13;
                              } else {
                                var42 = tj.field_b[var16];
                                hba.a(param5, var18, var42, 7, var21);
                                hba.a(param6, var21, var42, 7, var20);
                                hba.a(param5, var20, var42, 7, var17);
                                break L13;
                              }
                            }
                            if (~an.field_q >= ~var15) {
                              var43 = tj.field_b[var15];
                              hba.a(param5, var18, var43, 7, var21);
                              hba.a(param6, var21, var43, param2 ^ 173, var20);
                              hba.a(param5, var20, var43, 7, var17);
                              continue L5;
                            } else {
                              continue L5;
                            }
                          }
                        } else {
                          continue L5;
                        }
                      }
                    }
                  }
                }
                continue L5;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var7, "pj.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
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
            var6 = BachelorFridge.field_y;
            try {
              L0: {
                L1: while (true) {
                  var3_ref = this;
                  synchronized (var3_ref) {
                    L2: {
                      L3: {
                        if (((pj) this).field_j == ((pj) this).field_q) {
                          if (((pj) this).field_g) {
                            decompiledRegionSelector0 = 0;
                            break L2;
                          } else {
                            {
                              L4: {
                                this.wait();
                                break L4;
                              }
                            }
                            break L3;
                          }
                        } else {
                          break L3;
                        }
                      }
                      L6: {
                        if (((pj) this).field_q <= ((pj) this).field_j) {
                          var1_int = -((pj) this).field_q + ((pj) this).field_j;
                          break L6;
                        } else {
                          var1_int = ((pj) this).field_e + -((pj) this).field_q;
                          break L6;
                        }
                      }
                      var2 = ((pj) this).field_q;
                      decompiledRegionSelector0 = 1;
                      break L2;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    try {
                      L7: {
                        L8: {
                          if (((pj) this).field_f != null) {
                            ((pj) this).field_f.close();
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          if (((pj) this).field_p == null) {
                            break L9;
                          } else {
                            ((pj) this).field_p.close();
                            break L9;
                          }
                        }
                        L10: {
                          if (((pj) this).field_k != null) {
                            ((pj) this).field_k.close();
                            break L10;
                          } else {
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
                    ((pj) this).field_d = null;
                    break L0;
                  } else {
                    if (var1_int > 0) {
                      try {
                        L12: {
                          ((pj) this).field_p.write(((pj) this).field_d, var2, var1_int);
                          break L12;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          ((pj) this).field_r = true;
                          break L13;
                        }
                      }
                      ((pj) this).field_q = (var1_int + ((pj) this).field_q) % ((pj) this).field_e;
                      try {
                        L14: {
                          L15: {
                            if (((pj) this).field_q != ((pj) this).field_j) {
                              break L15;
                            } else {
                              ((pj) this).field_p.flush();
                              break L15;
                            }
                          }
                          break L14;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L16: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          ((pj) this).field_r = true;
                          break L16;
                        }
                      }
                      continue L1;
                    } else {
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
                cv.a(1, (String) null, (Throwable) (Object) var1_ref);
                break L17;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private pj(java.net.Socket param0, ht param1, int param2) throws IOException {
        ((pj) this).field_q = 0;
        ((pj) this).field_r = false;
        ((pj) this).field_g = false;
        ((pj) this).field_j = 0;
        try {
            ((pj) this).field_k = param0;
            ((pj) this).field_i = param1;
            ((pj) this).field_k.setSoTimeout(30000);
            ((pj) this).field_k.setTcpNoDelay(true);
            ((pj) this).field_f = ((pj) this).field_k.getInputStream();
            ((pj) this).field_p = ((pj) this).field_k.getOutputStream();
            ((pj) this).field_e = param2;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "pj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final int b(byte param0) throws IOException {
        if (!(!((pj) this).field_g)) {
            return 0;
        }
        if (param0 != -47) {
            Object var3 = null;
            pj.a(true, (vr) null);
        }
        return ((pj) this).field_f.read();
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, kv[] param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var11 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param5 == null) {
                break L1;
              } else {
                if (0 < param4) {
                  var6_int = param5[0].field_n;
                  var7 = param5[2].field_n;
                  var8 = param5[1].field_n;
                  param5[0].e(param0, param3, param1);
                  param5[2].e(param4 + param0 + -var7, param3, param1);
                  dg.a(eha.field_q);
                  dg.c(var6_int + param0, param3, -var7 + (param0 + param4), param3 - -param5[1].field_o);
                  var9 = var6_int + param0;
                  var10 = param0 - -param4 + -var7;
                  param0 = var9;
                  L2: while (true) {
                    if (var10 <= param0) {
                      dg.b(eha.field_q);
                      break L0;
                    } else {
                      param5[1].e(param0, param3, param1);
                      param0 = param0 + var8;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var6;
            stackOut_9_1 = new StringBuilder().append("pj.A(").append(param0).append(',').append(param1).append(',').append(447).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param5 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new int[16];
        field_b = new int[16][];
        field_l = new int[16];
        field_c = new int[16];
        field_h = new int[16];
        ku.a(46, 460, new int[7], 190, 170, 36, 0);
        ku.a(-117, 460, new int[5], 132, 170, 36, 1);
        ku.a(-57, 460, new int[7], 34, 170, 36, 2);
        ku.a(-57, 460, new int[2], 200, 170, 36, 3);
        ku.a(97, 460, new int[5], 34, 170, 36, 4);
        ku.a(40, 460, new int[4], 410, 180, 36, 5);
        ku.a(-58, 460, new int[3], 447, 70, 36, 6);
        ku.a(-91, 460, new int[2], 400, 180, 36, 7);
        ku.a(26, 460, new int[2], 400, 180, 36, 8);
        ku.a(-55, 460, new int[2], 400, 180, 36, 9);
        ku.a(-81, 460, new int[1], 400, 290, 36, 10);
        ku.a(101, 460, new int[0], 200, 170, 36, 11);
        ku.a(-108, 460, new int[3], 200, 170, 36, 12);
        ku.a(42, 460, new int[2], 200, 170, 36, 13);
        ku.a(-101, 460, new int[4], 200, 170, 36, 14);
        ku.a(-97, 460, new int[4], 237, 170, 36, 15);
        field_a = "Spectating...";
        field_n = new kf();
    }
}
