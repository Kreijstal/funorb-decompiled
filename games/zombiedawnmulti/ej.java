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
            boolean stackIn_4_0 = false;
            int stackIn_11_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            boolean stackOut_3_0 = false;
            int stackOut_10_0 = 0;
            var6 = ZombieDawnMulti.field_E ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  var3_ref = this;
                  synchronized (var3_ref) {
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
                        stackOut_10_0 = this.field_a;
                        stackIn_11_0 = stackOut_10_0;
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
                          var3 = (IOException) (Object) decompiledCaughtException;
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
                          var3 = (IOException) (Object) decompiledCaughtException;
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
        cr var2 = null;
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
        RuntimeException var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
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
            if (param1 < -4) {
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
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("ej.H(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        long stackOut_12_0 = 0L;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var1_long = 0L;
            var3 = -15 / ((35 - param0) / 62);
            var4 = 0;
            L1: while (true) {
              stackOut_2_0 = var4;
              stackOut_2_1 = em.field_Y.length;
              stackIn_3_0 = stackOut_2_0;
              stackIn_3_1 = stackOut_2_1;
              L2: while (true) {
                L3: {
                  if (stackIn_3_0 >= stackIn_3_1) {
                    break L3;
                  } else {
                    var5 = 0;
                    L4: while (true) {
                      L5: {
                        if (var5 >= em.field_Y[var4][0].length) {
                          break L5;
                        } else {
                          stackOut_6_0 = em.field_Y[var4][0][var5] ^ -1;
                          stackOut_6_1 = -256;
                          stackIn_3_0 = stackOut_6_0;
                          stackIn_3_1 = stackOut_6_1;
                          stackIn_7_0 = stackOut_6_0;
                          stackIn_7_1 = stackOut_6_1;
                          if (var6 != 0) {
                            continue L2;
                          } else {
                            L6: {
                              if (stackIn_7_0 != stackIn_7_1) {
                                var1_long = var1_long | 1L << em.field_Y[var4][0][var5];
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                            var5++;
                            if (var6 == 0) {
                              continue L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      var4++;
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_12_0 = var1_long;
                stackIn_13_0 = stackOut_12_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "ej.C(" + param0 + ')');
        }
        return stackIn_13_0;
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (this.field_r) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              stackOut_4_0 = 0;
              stackIn_6_0 = stackOut_4_0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (stackIn_6_0 >= param0) {
                      break L3;
                    } else {
                      var5_int = this.field_d.read(param2, param1, param0);
                      stackOut_7_0 = var5_int;
                      stackIn_13_0 = stackOut_7_0;
                      stackIn_8_0 = stackOut_7_0;
                      if (var6 != 0) {
                        break L2;
                      } else {
                        if (stackIn_8_0 <= 0) {
                          throw new EOFException();
                        } else {
                          param1 = param1 + var5_int;
                          param0 = param0 - var5_int;
                          if (var6 == 0) {
                            stackOut_5_0 = 0;
                            stackIn_6_0 = stackOut_5_0;
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  stackOut_12_0 = param3;
                  stackIn_13_0 = stackOut_12_0;
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
            stackOut_16_0 = (RuntimeException) (var5);
            stackOut_16_1 = new StringBuilder().append("ej.J(").append(param0).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
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
            Object var2_ref_Object = null;
            int var2 = 0;
            Throwable var3 = null;
            InterruptedException var3_ref = null;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
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
                  if (this.field_c.field_f != 0) {
                    if (this.field_c.field_f != 1) {
                      this.field_c = null;
                      return;
                    } else {
                      try {
                        L2: {
                          ((Thread) (this.field_c.field_d)).join();
                          break L2;
                        }
                      } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var3_ref = (InterruptedException) (Object) decompiledCaughtException;
                        this.field_c = null;
                        return;
                      }
                      this.field_c = null;
                      return;
                    }
                  } else {
                    vd.a(false, 1L);
                    if (var4 == 0) {
                      continue L1;
                    } else {
                      return;
                    }
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
        RuntimeException var5 = null;
        Object var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int var8 = 0;
        ja var9 = null;
        Object stackIn_14_0 = null;
        Object stackIn_21_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_20_0 = null;
        Object stackOut_13_0 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
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
                var5_ref = this;
                synchronized (var5_ref) {
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
                        if (param2 <= var6) {
                          L6: {
                            if (null != this.field_c) {
                              break L6;
                            } else {
                              this.field_c = this.field_s.a(47, (Runnable) (this), 3);
                              break L6;
                            }
                          }
                          this.notifyAll();
                          stackOut_20_0 = var5_ref;
                          stackIn_21_0 = stackOut_20_0;
                          break L5;
                        } else {
                          this.field_b[this.field_a] = param3[param0 + var6];
                          this.field_a = (this.field_a - -1) % this.field_m;
                          stackOut_13_0 = this;
                          stackIn_21_0 = stackOut_13_0;
                          stackIn_14_0 = stackOut_13_0;
                          if (var8 != 0) {
                            break L5;
                          } else {
                            if (((ej) (this)).field_a == (-100 + (this.field_m + this.field_h)) % this.field_m) {
                              throw new IOException();
                            } else {
                              var6++;
                              continue L4;
                            }
                          }
                        }
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
          L7: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) (var5);
            stackOut_26_1 = new StringBuilder().append("ej.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param3 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L7;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L7;
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
