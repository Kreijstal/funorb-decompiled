/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ej implements Runnable {
    static String field_o;
    static ja field_g;
    static jh field_n;
    static int field_e;
    private go field_s;
    private di field_c;
    private int field_m;
    private int field_h;
    static ja field_j;
    private boolean field_i;
    static int field_q;
    private InputStream field_d;
    private OutputStream field_l;
    private java.net.Socket field_f;
    private boolean field_r;
    private int field_a;
    private byte[] field_b;
    static String field_k;
    static int[] field_p;

    public static void b(byte param0) {
        field_n = null;
        field_g = null;
        field_j = null;
        field_k = null;
        if (param0 <= 10) {
          field_q = -107;
          field_o = null;
          field_p = null;
          return;
        } else {
          field_o = null;
          field_p = null;
          return;
        }
    }

    final void b(int param0) throws IOException {
        if (!this.field_r) {
          if (this.field_i) {
            this.field_i = false;
            throw new IOException();
          } else {
            if (param0 == -26844) {
              return;
            } else {
              this.c(-17);
              return;
            }
          }
        } else {
          return;
        }
    }

    public final void run() {
        try {
            boolean stackIn_4_0 = false;
            int stackIn_11_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            boolean stackOut_3_0;
            int var1_int = 0;
            IOException var1 = null;
            Exception var1_ref = null;
            int var2 = 0;
            Object var3 = null;
            IOException var3_ref = null;
            InterruptedException var4 = null;
            int var6 = 0;
            String var7 = null;
            var6 = ZombieDawnMulti.field_E ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  var3 = this;
                  synchronized (var3) {
                    L2: {
                      L3: {
                        L4: {
                          if (this.field_a != this.field_h) {
                            break L4;
                          } else {
                            stackOut_3_0 = this.field_r;
                            stackIn_11_0 = stackOut_3_0 ? 1 : 0;
                            stackIn_4_0 = stackOut_3_0;
                            if (var6 != 0) {
                              break L3;
                            } else {
                              L5: {
                                if (!stackIn_4_0) {
                                  break L5;
                                } else {
                                  if (var6 == 0) {
                                    decompiledRegionSelector0 = 0;
                                    break L2;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              try {
                                L6: {
                                  this.wait();
                                  break L6;
                                }
                              } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                                decompiledCaughtException = decompiledCaughtParameter0;
                                L7: {
                                  var4 = (InterruptedException) (Object) decompiledCaughtException;
                                  break L7;
                                }
                              }
                              break L4;
                            }
                          }
                        }
                        stackIn_11_0 = this.field_a;
                        break L3;
                      }
                      L8: {
                        L9: {
                          if (stackIn_11_0 < this.field_h) {
                            break L9;
                          } else {
                            var1_int = -this.field_h + this.field_a;
                            if (var6 == 0) {
                              break L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                        var1_int = -this.field_h + this.field_m;
                        break L8;
                      }
                      var2 = this.field_h;
                      decompiledRegionSelector0 = 1;
                      break L2;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    try {
                      L10: {
                        L11: {
                          if (null != this.field_d) {
                            this.field_d.close();
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        L12: {
                          if (null == this.field_l) {
                            break L12;
                          } else {
                            this.field_l.close();
                            break L12;
                          }
                        }
                        L13: {
                          if (this.field_f != null) {
                            this.field_f.close();
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                        break L10;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L14: {
                        var1 = (IOException) (Object) decompiledCaughtException;
                        break L14;
                      }
                    }
                    this.field_b = null;
                    break L0;
                  } else {
                    if (0 < var1_int) {
                      try {
                        L15: {
                          this.field_l.write(this.field_b, var2, var1_int);
                          break L15;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L16: {
                          var3_ref = (IOException) (Object) decompiledCaughtException;
                          this.field_i = true;
                          break L16;
                        }
                      }
                      this.field_h = (this.field_h - -var1_int) % this.field_m;
                      try {
                        L17: {
                          L18: {
                            if (this.field_h != this.field_a) {
                              break L18;
                            } else {
                              this.field_l.flush();
                              break L18;
                            }
                          }
                          break L17;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L19: {
                          var3_ref = (IOException) (Object) decompiledCaughtException;
                          this.field_i = true;
                          break L19;
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
              L20: {
                var1_ref = (Exception) (Object) decompiledCaughtException;
                var7 = (String) null;
                bd.a((String) null, (Throwable) ((Object) var1_ref), false);
                break L20;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static cr a(byte param0, int param1) {
        cr var2;
        if (param0 >= -32) {
          ej.b((byte) 24);
          var2 = new cr();
          dc.field_Gb.a(var2, false);
          mi.b(1, param1);
          return var2;
        } else {
          var2 = new cr();
          dc.field_Gb.a(var2, false);
          mi.b(1, param1);
          return var2;
        }
    }

    protected final void finalize() {
        this.c(92);
    }

    final static void a(ja param0, byte param1, ja param2) {
        jj.field_F = new ja[7];
        rb.field_e = new ja[7];
        eg.field_D = new ja(300, 200);
        rb.field_e[0] = param2;
        jj.field_F[0] = new ja(param2.field_x - -20, param2.field_w - -10);
        rb.field_e[1] = param0;
        jj.field_F[1] = new ja(param0.field_x + 10, 10 + param0.field_w);
        rb.field_e[2] = new ja(150, 100);
        jj.field_F[2] = new ja(150, 100);
        rb.field_e[3] = new ja(120, 50);
        jj.field_F[3] = new ja(120, 50);
        rb.field_e[4] = new ja(300, 50);
        jj.field_F[4] = new ja(300, 50);
        rb.field_e[5] = new ja(200, 90);
        jj.field_F[5] = new ja(200, 90);
        rb.field_e[6] = new ja(200, 50);
        if (param1 >= -4) {
            return;
        }
        try {
            jj.field_F[6] = new ja(200, 50);
            g.c();
            jj.field_F[0].a();
            rb.field_e[0].f(5, 5, 16777215);
            jm.d((byte) -18);
            rb.field_e[0].f(5, 5, 0);
            jj.field_F[1].a();
            rb.field_e[1].f(-35, 5, 16777215);
            g.a(16777215);
            jm.d((byte) -18);
            rb.field_e[1].f(-35, 5, 0);
            g.b();
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ej.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    ej(java.net.Socket param0, go param1) throws IOException {
        this(param0, param1, 5000);
    }

    final int a(int param0) throws IOException {
        if (this.field_r) {
            return 0;
        }
        int var2 = -42 / ((param0 - -37) / 35);
        return this.field_d.available();
    }

    final static long a(byte param0) {
        long var1_long = 0L;
        RuntimeException var1 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        long stackIn_13_0 = 0L;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var1_long = 0L;
                        var3 = -15 / ((35 - param0) / 62);
                        var4 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = var4;
                        stackIn_3_1 = em.field_Y.length;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (stackIn_3_0 >= stackIn_3_1) {
                            statePc = 12;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var5 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var5 >= em.field_Y[var4][0].length) {
                            statePc = 11;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_3_0 = em.field_Y[var4][0][var5] ^ -1;
                        stackIn_7_0 = stackIn_3_0;
                        stackIn_3_1 = -256;
                        stackIn_7_1 = stackIn_3_1;
                        if (var6 != 0) {
                            statePc = 3;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (stackIn_7_0 != stackIn_7_1) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var1_long = var1_long | 1L << em.field_Y[var4][0][var5];
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var5++;
                        if (var6 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var4++;
                        if (var6 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackIn_13_0 = var1_long;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    return stackIn_13_0;
                }
                case 14: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) var1), "ej.C(" + param0 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        int var6 = 0;
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (this.field_r) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              stackIn_6_0 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (stackIn_6_0 >= param0) {
                      break L3;
                    } else {
                      var5_int = this.field_d.read(param2, param1, param0);
                      stackIn_13_0 = var5_int;

                      if (var6 != 0) {
                        break L2;
                      } else {
                        if (stackIn_13_0 <= 0) {
                          throw new EOFException();
                        } else {
                          param1 = param1 + var5_int;
                          param0 = param0 - var5_int;
                          if (var6 == 0) {
                            stackIn_6_0 = 0;
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  stackIn_13_0 = param3;
                  break L2;
                }
                if (stackIn_13_0 > 96) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  ej.b((byte) 10);
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var5);

            stackIn_18_1 = new StringBuilder().append("ej.J(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void c(int param0) {
        try {
            Throwable decompiledCaughtException = null;
            Object var2_ref_Object = null;
            int var2 = 0;
            InterruptedException var3 = null;
            int var4 = 0;
            var4 = ZombieDawnMulti.field_E ? 1 : 0;
            if (!this.field_r) {
              var2_ref_Object = this;
              synchronized (var2_ref_Object) {
                L0: {
                  this.field_r = true;
                  this.notifyAll();
                  break L0;
                }
              }
              var2 = 61 / ((param0 - 20) / 58);
              if (this.field_c != null) {
                L1: while (true) {
                  L2: {
                    if (this.field_c.field_f != 0) {
                      break L2;
                    } else {
                      vd.a(false, 1L);
                      if (var4 == 0) {
                        if (var4 == 0) {
                          continue L1;
                        } else {
                          break L2;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                  if (this.field_c.field_f != 1) {
                    this.field_c = null;
                    return;
                  } else {
                    try {
                      L3: {
                        ((Thread) (this.field_c.field_d)).join();
                        break L3;
                      }
                    } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var3 = (InterruptedException) (Object) decompiledCaughtException;
                      this.field_c = null;
                      return;
                    }
                    this.field_c = null;
                    return;
                  }
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

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        Object stackIn_21_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var8 = 0;
        ja var9 = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (this.field_r) {
              break L0;
            } else {
              if (!this.field_i) {
                L1: {
                  if (null != this.field_b) {
                    break L1;
                  } else {
                    this.field_b = new byte[this.field_m];
                    break L1;
                  }
                }
                var5 = this;
                synchronized (var5) {
                  L2: {
                    L3: {
                      if (param1 == -100) {
                        break L3;
                      } else {
                        var9 = (ja) null;
                        ej.a((ja) null, (byte) -16, (ja) null);
                        break L3;
                      }
                    }
                    var6 = 0;
                    L4: while (true) {
                      L5: {
                        L6: {
                          if (param2 <= var6) {
                            break L6;
                          } else {
                            this.field_b[this.field_a] = param3[param0 + var6];
                            this.field_a = (this.field_a - -1) % this.field_m;
                            stackIn_21_0 = this;

                            if (var8 != 0) {
                              break L5;
                            } else {
                              if (((ej) (this)).field_a == (-100 + (this.field_m + this.field_h)) % this.field_m) {
                                throw new IOException();
                              } else {
                                var6++;
                                if (var8 == 0) {
                                  continue L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                        }
                        L7: {
                          if (null != this.field_c) {
                            break L7;
                          } else {
                            this.field_c = this.field_s.a(47, (Runnable) (this), 3);
                            break L7;
                          }
                        }
                        this.notifyAll();
                        stackIn_21_0 = var5;
                        break L5;
                      }
                      break L2;
                    }
                  }
                }
                return;
              } else {
                this.field_i = false;
                throw new IOException();
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var5_ref);

            stackIn_28_1 = new StringBuilder().append("ej.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L8;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L8;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ')');
        }
    }

    final int c(byte param0) throws IOException {
        if (param0 != 59) {
            this.field_r = true;
            if (!(!this.field_r)) {
                return 0;
            }
            return this.field_d.read();
        }
        if (!(!this.field_r)) {
            return 0;
        }
        return this.field_d.read();
    }

    private ej(java.net.Socket param0, go param1, int param2) throws IOException {
        this.field_h = 0;
        this.field_r = false;
        this.field_a = 0;
        this.field_i = false;
        try {
            this.field_s = param1;
            this.field_f = param0;
            this.field_f.setSoTimeout(30000);
            this.field_f.setTcpNoDelay(true);
            this.field_d = this.field_f.getInputStream();
            this.field_l = this.field_f.getOutputStream();
            this.field_m = param2;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ej.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_o = "Please log in as a subscribing member to access this feature.";
        field_e = 0;
        field_k = "Select a human!";
    }
}
