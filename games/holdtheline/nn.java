/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class nn implements Runnable {
    private int field_l;
    private boolean field_h;
    private java.net.Socket field_e;
    private int field_m;
    private byte[] field_j;
    private int field_c;
    static String[] field_g;
    private OutputStream field_d;
    private boolean field_a;
    private af field_k;
    private ib field_b;
    private InputStream field_i;
    static char[] field_f;

    final void d(int param0) {
        InterruptedException interruptedException = null;
        Object var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = HoldTheLine.field_D;
        if (!((nn) this).field_h) {
          L0: {
            if (param0 == 21135) {
              break L0;
            } else {
              field_g = null;
              break L0;
            }
          }
          var2 = this;
          synchronized (var2) {
            L1: {
              ((nn) this).field_h = true;
              this.notifyAll();
              break L1;
            }
          }
          L2: {
            if (((nn) this).field_k == null) {
              break L2;
            } else {
              L3: while (true) {
                if (((nn) this).field_k.field_d != 0) {
                  if (((nn) this).field_k.field_d != 1) {
                    break L2;
                  } else {
                    try {
                      L4: {
                        ((Thread) ((nn) this).field_k.field_b).join();
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
                  }
                } else {
                  int discarded$2 = 45;
                  qe.a(1L);
                  continue L3;
                }
              }
            }
          }
          ((nn) this).field_k = null;
          return;
        } else {
          return;
        }
    }

    final static void b() {
        RuntimeException var1 = null;
        int var2 = 0;
        qn var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        da var14 = null;
        int[][] var18 = null;
        RuntimeException decompiledCaughtException = null;
        var12 = HoldTheLine.field_D;
        try {
          L0: {
            var14 = rd.field_e;
            var2 = var14.f((byte) -85);
            var3 = (qn) (Object) cf.field_z.b((byte) 97);
            L1: while (true) {
              L2: {
                if (var3 == null) {
                  break L2;
                } else {
                  if (var2 != var3.field_j) {
                    var3 = (qn) (Object) cf.field_z.c((byte) 93);
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (var3 == null) {
                r.a(-28036);
                return;
              } else {
                L3: {
                  var4 = var14.f((byte) -31);
                  if (var4 != 0) {
                    wd.field_v[0] = ng.field_e;
                    var5 = var3.field_i;
                    var6_int = 1;
                    L4: while (true) {
                      if (var6_int >= var4) {
                        cc.a(var4, false, var5);
                        var6_int = 0;
                        L5: while (true) {
                          if (var6_int >= var4) {
                            uf.a(0, var5);
                            var6 = new String[2][var5];
                            var18 = new int[2][var5 * 4];
                            var8 = in.field_h;
                            var9 = 0;
                            var10 = 0;
                            L6: while (true) {
                              if (var8 <= var9) {
                                var9 = 0;
                                var13 = 0;
                                var10 = var13;
                                L7: while (true) {
                                  if (var8 > var9) {
                                    L8: {
                                      var11 = im.field_h[var5 - -var9];
                                      var6[1][var13] = wd.field_v[var11];
                                      var18[1][4 * var13] = va.field_j[var11];
                                      var18[1][var13 * 4 - -1] = da.field_u[var11];
                                      var18[1][4 * var13 + 2] = ua.field_c[var11];
                                      var18[1][var13 * 4 - -3] = fj.field_q[var11];
                                      int discarded$2 = 0;
                                      if (!ra.a(wd.field_v[var11])) {
                                        break L8;
                                      } else {
                                        if (fj.field_q[var11] + da.field_u[var11] - -ua.field_c[var11] != 0) {
                                          break L8;
                                        } else {
                                          var6[1][var13] = null;
                                          var13--;
                                          break L8;
                                        }
                                      }
                                    }
                                    var9++;
                                    var13++;
                                    continue L7;
                                  } else {
                                    var3.d(0);
                                    break L3;
                                  }
                                }
                              } else {
                                L9: {
                                  var11 = im.field_h[var9];
                                  var6[0][var10] = wd.field_v[var11];
                                  var18[0][var10 * 4] = va.field_j[var11];
                                  var18[0][1 + var10 * 4] = da.field_u[var11];
                                  var18[0][2 + var10 * 4] = ua.field_c[var11];
                                  var18[0][4 * var10 - -3] = fj.field_q[var11];
                                  int discarded$3 = 0;
                                  if (!ra.a(wd.field_v[var11])) {
                                    break L9;
                                  } else {
                                    if (fj.field_q[var11] + (da.field_u[var11] - -ua.field_c[var11]) != 0) {
                                      break L9;
                                    } else {
                                      var6[0][var10] = null;
                                      var10--;
                                      break L9;
                                    }
                                  }
                                }
                                var10++;
                                var9++;
                                continue L6;
                              }
                            }
                          } else {
                            L10: {
                              im.a(76, (th) (Object) var14);
                              if (var6_int == 0) {
                                rl.a(dk.field_l, ef.field_b, ae.field_a, (byte) 106, var6_int, si.field_jb);
                                break L10;
                              } else {
                                rl.a(dk.field_l, ef.field_b, ae.field_a, (byte) 108, var6_int, si.field_jb);
                                break L10;
                              }
                            }
                            var6_int++;
                            continue L5;
                          }
                        }
                      } else {
                        wd.field_v[var6_int] = var14.j(-1231);
                        var6_int++;
                        continue L4;
                      }
                    }
                  } else {
                    var3.d(0);
                    break L3;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var1, "nn.A(" + -126 + 41);
        }
    }

    final int c(int param0) throws IOException {
        if (param0 != -27418) {
            return -14;
        }
        if (!(!((nn) this).field_h)) {
            return 0;
        }
        return ((nn) this).field_i.read();
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        RuntimeException var5 = null;
        Object var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int var8 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var8 = HoldTheLine.field_D;
        try {
          L0: {
            if (!((nn) this).field_h) {
              if (!((nn) this).field_a) {
                L1: {
                  if (null == ((nn) this).field_j) {
                    ((nn) this).field_j = new byte[((nn) this).field_m];
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var5_ref = this;
                synchronized (var5_ref) {
                  L2: {
                    var6 = 0;
                    L3: while (true) {
                      if (param0 <= var6) {
                        L4: {
                          if (param3 == 1) {
                            break L4;
                          } else {
                            ((nn) this).run();
                            break L4;
                          }
                        }
                        L5: {
                          if (null == ((nn) this).field_k) {
                            ((nn) this).field_k = ((nn) this).field_b.a((byte) -28, 3, (Runnable) this);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        this.notifyAll();
                        break L2;
                      } else {
                        ((nn) this).field_j[((nn) this).field_c] = param1[var6 + param2];
                        ((nn) this).field_c = (1 + ((nn) this).field_c) % ((nn) this).field_m;
                        if (((nn) this).field_c != (-100 + ((nn) this).field_m + ((nn) this).field_l) % ((nn) this).field_m) {
                          var6++;
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
                ((nn) this).field_a = false;
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
            stackOut_24_0 = (RuntimeException) var5;
            stackOut_24_1 = new StringBuilder().append("nn.J(").append(param0).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L6;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L6;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    nn(java.net.Socket param0, ib param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var7 = HoldTheLine.field_D;
        try {
          L0: {
            var5_int = 90 % ((param3 - 89) / 35);
            if (!((nn) this).field_h) {
              L1: while (true) {
                if (param1 <= 0) {
                  break L0;
                } else {
                  var6 = ((nn) this).field_i.read(param0, param2, param1);
                  if (0 < var6) {
                    param2 = param2 + var6;
                    param1 = param1 - var6;
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
          L2: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("nn.C(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static void a() {
    }

    protected final void finalize() {
        ((nn) this).d(21135);
    }

    final void c(boolean param0) throws IOException {
        if (!param0) {
            ((nn) this).field_m = 101;
        }
        if (((nn) this).field_h) {
            return;
        }
        if (((nn) this).field_a) {
            ((nn) this).field_a = false;
            throw new IOException();
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
            var6 = HoldTheLine.field_D;
            try {
              L0: {
                L1: while (true) {
                  var3_ref = this;
                  synchronized (var3_ref) {
                    L2: {
                      L3: {
                        if (((nn) this).field_l == ((nn) this).field_c) {
                          if (((nn) this).field_h) {
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
                        var2 = ((nn) this).field_l;
                        if (((nn) this).field_l <= ((nn) this).field_c) {
                          var1_int = -((nn) this).field_l + ((nn) this).field_c;
                          break L6;
                        } else {
                          var1_int = ((nn) this).field_m + -((nn) this).field_l;
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
                          if (null != ((nn) this).field_i) {
                            ((nn) this).field_i.close();
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          if (null != ((nn) this).field_d) {
                            ((nn) this).field_d.close();
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: {
                          if (((nn) this).field_e != null) {
                            ((nn) this).field_e.close();
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
                    ((nn) this).field_j = null;
                    break L0;
                  } else {
                    if (var1_int <= 0) {
                      continue L1;
                    } else {
                      try {
                        L12: {
                          ((nn) this).field_d.write(((nn) this).field_j, var2, var1_int);
                          break L12;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          ((nn) this).field_a = true;
                          break L13;
                        }
                      }
                      ((nn) this).field_l = (var1_int + ((nn) this).field_l) % ((nn) this).field_m;
                      try {
                        L14: {
                          L15: {
                            if (((nn) this).field_c != ((nn) this).field_l) {
                              break L15;
                            } else {
                              ((nn) this).field_d.flush();
                              break L15;
                            }
                          }
                          break L14;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L16: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          ((nn) this).field_a = true;
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
                bl.a((Throwable) (Object) var1_ref, (byte) 94, (String) null);
                break L17;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(byte param0) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0 < -126) {
            break L0;
          } else {
            boolean discarded$7 = nn.a(-24);
            break L0;
          }
        }
        L1: {
          L2: {
            if (pf.field_d < 20) {
              break L2;
            } else {
              int discarded$8 = -30;
              if (!jn.a()) {
                break L2;
              } else {
                L3: {
                  if (q.field_c <= 0) {
                    break L3;
                  } else {
                    if (ai.a(-118)) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L1;
              }
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    public static void b(int param0) {
        field_g = null;
        field_f = null;
        if (param0 != 15281) {
            field_g = null;
        }
    }

    final int b(boolean param0) throws IOException {
        if (param0) {
            return -52;
        }
        if (((nn) this).field_h) {
            return 0;
        }
        return ((nn) this).field_i.available();
    }

    final static boolean a(int param0) {
        if (hk.field_a != null) {
            if (!(null == ho.field_j)) {
                return true;
            }
        }
        if (param0 > -3) {
            field_f = null;
        }
        if (!fb.field_i.b("font24", 118)) {
            return false;
        }
        if (!fb.field_i.b("overlayfont", -118)) {
            return false;
        }
        hk.field_a = ko.a(false);
        ho.field_j = om.a("font24", ef.field_c, "", 8192, fb.field_i);
        return true;
    }

    private nn(java.net.Socket param0, ib param1, int param2) throws IOException {
        ((nn) this).field_l = 0;
        ((nn) this).field_h = false;
        ((nn) this).field_c = 0;
        ((nn) this).field_a = false;
        try {
            ((nn) this).field_e = param0;
            ((nn) this).field_b = param1;
            ((nn) this).field_e.setSoTimeout(30000);
            ((nn) this).field_e.setTcpNoDelay(true);
            ((nn) this).field_i = ((nn) this).field_e.getInputStream();
            ((nn) this).field_d = ((nn) this).field_e.getOutputStream();
            ((nn) this).field_m = param2;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "nn.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new char[]{'[', ']', '#'};
    }
}
