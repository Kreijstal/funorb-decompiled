/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class td implements Runnable {
    private OutputStream field_d;
    static long[][] field_f;
    private InputStream field_n;
    private od field_q;
    private int field_r;
    private boolean field_a;
    static int field_i;
    private boolean field_l;
    private int field_b;
    static long[] field_c;
    private ce field_p;
    private byte[] field_h;
    private int field_e;
    static dd field_m;
    static ke field_g;
    static w field_k;
    static wk field_j;
    private java.net.Socket field_o;

    final static int a(boolean param0) {
        if (!param0) {
            return -33;
        }
        return lg.field_d;
    }

    final void c(int param0) throws IOException {
        if (param0 != 0) {
            this.finalize();
        }
        if (!(!this.field_l)) {
            return;
        }
        if (!(!this.field_a)) {
            this.field_a = false;
            throw new IOException();
        }
    }

    final static void b(int param0) {
        int var2 = 0;
        ql var3 = null;
        L0: {
          L1: {
            L2: {
              var2 = fleas.field_A ? 1 : 0;
              tj.field_a = tj.field_a + 1;
              if (wc.field_q <= 0) {
                break L2;
              } else {
                if (!qh.c((byte) 68)) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            if (fleas.field_E != 0) {
              break L1;
            } else {
              if ((tj.field_a ^ -1) > -16) {
                break L1;
              } else {
                oa.a(9, true, 15);
                if (var2 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          L3: {
            if (ia.field_m[fleas.field_E].length <= tj.field_a) {
              break L3;
            } else {
              L4: {
                bc.field_V = -1;
                if (-1 <= (em.field_b ^ -1)) {
                  break L4;
                } else {
                  wi.field_p.a(-119, em.field_b);
                  wi.field_p.a(false);
                  em.field_b = 0;
                  break L4;
                }
              }
              L5: {
                if (-13 != (tj.field_a ^ -1)) {
                  break L5;
                } else {
                  if (fleas.field_E != 0) {
                    break L5;
                  } else {
                    if (!c.field_U) {
                      hg.a(-25389, 10, 245, tj.field_a);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              L6: {
                if (tj.field_a >= ia.field_m[fleas.field_E].length) {
                  break L6;
                } else {
                  L7: {
                    L8: {
                      hj.field_a[fleas.field_E] = Math.max(tj.field_a, hj.field_a[fleas.field_E]);
                      var3 = new ql(fleas.field_E, -1 + hj.field_a[fleas.field_E], 0, 0, 0, 0);
                      if (!qh.c((byte) 38)) {
                        break L8;
                      } else {
                        mi.field_r.a(false, var3);
                        if (var2 == 0) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    rd.a(var3, 79, 5);
                    break L7;
                  }
                  ej.a((byte) -39);
                  if (var2 == 0) {
                    break L0;
                  } else {
                    break L6;
                  }
                }
              }
              oa.a(9, true, 41);
              if (var2 == 0) {
                break L0;
              } else {
                break L3;
              }
            }
          }
          L9: {
            if (hj.field_a[1] != -1 + pl.field_l[1]) {
              break L9;
            } else {
              if (hj.field_a[0] != -1 + pl.field_l[0]) {
                break L9;
              } else {
                hg.a(-25389, 3, 252, tj.field_a);
                break L9;
              }
            }
          }
          L10: {
            L11: {
              if (pl.field_l[1] - 1 == hj.field_a[1]) {
                break L11;
              } else {
                if (hj.field_a[0] == -1 + pl.field_l[0]) {
                  break L11;
                } else {
                  break L10;
                }
              }
            }
            if (tg.field_g) {
              hg.a(-25389, 15, 240, tj.field_a);
              break L10;
            } else {
              break L10;
            }
          }
          oa.a(9, true, 37);
          break L0;
        }
        L12: {
          if (param0 > 8) {
            break L12;
          } else {
            field_m = (dd) null;
            break L12;
          }
        }
    }

    public static void a(int param0) {
        field_f = (long[][]) null;
        field_j = null;
        field_g = null;
        field_k = null;
        field_c = null;
        field_m = null;
        if (param0 != 123167272) {
            field_f = (long[][]) null;
        }
    }

    final static void g(int param0) {
        cg.a((byte) -105, param0);
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
            var6 = fleas.field_A ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  var3_ref = this;
                  synchronized (var3_ref) {
                    L2: {
                      L3: {
                        if (this.field_e == this.field_b) {
                          L4: {
                            if (this.field_l) {
                              if (var6 == 0) {
                                decompiledRegionSelector0 = 0;
                                break L2;
                              } else {
                                break L4;
                              }
                            } else {
                              break L4;
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
                          if (this.field_e <= this.field_b) {
                            break L8;
                          } else {
                            var1_int = this.field_r - this.field_e;
                            if (var6 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var1_int = -this.field_e + this.field_b;
                        break L7;
                      }
                      var2 = this.field_e;
                      decompiledRegionSelector0 = 1;
                      break L2;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    try {
                      L9: {
                        L10: {
                          if (null == this.field_n) {
                            break L10;
                          } else {
                            this.field_n.close();
                            break L10;
                          }
                        }
                        L11: {
                          if (null != this.field_d) {
                            this.field_d.close();
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        L12: {
                          if (null == this.field_o) {
                            break L12;
                          } else {
                            this.field_o.close();
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
                    this.field_h = null;
                    break L0;
                  } else {
                    if (-1 > (var1_int ^ -1)) {
                      try {
                        L14: {
                          this.field_d.write(this.field_h, var2, var1_int);
                          break L14;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L15: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          this.field_a = true;
                          break L15;
                        }
                      }
                      this.field_e = (var1_int + this.field_e) % this.field_r;
                      try {
                        L16: {
                          L17: {
                            if (this.field_e == this.field_b) {
                              this.field_d.flush();
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                          break L16;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L18: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          this.field_a = true;
                          break L18;
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
              L19: {
                var1_ref = (Exception) (Object) decompiledCaughtException;
                var7 = (String) null;
                ud.a((String) null, (Throwable) ((Object) var1_ref), 0);
                break L19;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void h(int param0) {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            Throwable var3 = null;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            var4 = fleas.field_A ? 1 : 0;
            if (!this.field_l) {
              var2 = this;
              synchronized (var2) {
                L0: {
                  this.field_l = true;
                  this.notifyAll();
                  break L0;
                }
              }
              if (param0 == 0) {
                L1: {
                  if (null != this.field_q) {
                    L2: while (true) {
                      L3: {
                        if (this.field_q.field_b != 0) {
                          break L3;
                        } else {
                          vh.a(1L, param0 + 104);
                          if (var4 != 0) {
                            break L1;
                          } else {
                            if (var4 == 0) {
                              continue L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      if (1 == this.field_q.field_b) {
                        try {
                          L4: {
                            ((Thread) (this.field_q.field_e)).join();
                            break L4;
                          }
                        } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          L5: {
                            interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                            break L5;
                          }
                        }
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
                this.field_q = null;
                return;
              } else {
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

    final static boolean d(int param0) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0 < -79) {
            break L0;
          } else {
            field_j = (wk) null;
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (!vc.field_b) {
                break L3;
              } else {
                if (mf.field_a == null) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            if (!qh.c((byte) 33)) {
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              break L1;
            } else {
              break L2;
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    protected final void finalize() {
        this.h(0);
    }

    final static void a(byte param0, ni param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              rf.field_l = param1.d((byte) 72) << 324436709;
              var2_int = param1.e(false);
              rf.field_l = rf.field_l + (var2_int >> -1982762621);
              wd.field_c = var2_int << -976228430 & 1835008;
              wd.field_c = wd.field_c + (param1.d((byte) -112) << -1786963710);
              var2_int = param1.e(false);
              wd.field_c = wd.field_c + (var2_int >> -753536666);
              dk.field_B = 2064384 & var2_int << -1150991121;
              dk.field_B = dk.field_B + (param1.e(false) << -1115925337);
              var2_int = param1.e(false);
              w.field_a = var2_int << -1678141744 & 65536;
              dk.field_B = dk.field_B + (var2_int >> -526079167);
              w.field_a = w.field_a + param1.d((byte) -88);
              if (param0 == -107) {
                break L1;
              } else {
                td.b(13);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (var2);
            stackOut_3_1 = new StringBuilder().append("td.M(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    td(java.net.Socket param0, ce param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(byte param0, int param1, int param2, byte[] param3) throws IOException {
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
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var8 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (param0 <= -85) {
              if (!this.field_l) {
                if (!this.field_a) {
                  L1: {
                    if (this.field_h == null) {
                      this.field_h = new byte[this.field_r];
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
                        L4: {
                          if (var6 >= param1) {
                            L5: {
                              if (null != this.field_q) {
                                break L5;
                              } else {
                                this.field_q = this.field_p.a(4532, (Runnable) (this), 3);
                                break L5;
                              }
                            }
                            this.notifyAll();
                            break L4;
                          } else {
                            this.field_h[this.field_b] = param3[param2 + var6];
                            this.field_b = (1 + this.field_b) % this.field_r;
                            if (var8 != 0) {
                              break L4;
                            } else {
                              if ((-100 + this.field_r + this.field_e) % this.field_r != this.field_b) {
                                var6++;
                                continue L3;
                              } else {
                                throw new IOException();
                              }
                            }
                          }
                        }
                        break L2;
                      }
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  this.field_a = false;
                  throw new IOException();
                }
              } else {
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
          L6: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var5);
            stackOut_24_1 = new StringBuilder().append("td.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param3 == null) {
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
          throw pf.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final int f(int param0) throws IOException {
        if (!(!this.field_l)) {
            return 0;
        }
        if (param0 != 1605772320) {
            this.field_a = false;
        }
        return this.field_n.read();
    }

    final void a(int param0, byte[] param1, int param2, boolean param3) throws IOException {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var6 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (!this.field_l) {
              L1: {
                if (!param3) {
                  break L1;
                } else {
                  field_c = (long[]) null;
                  break L1;
                }
              }
              L2: while (true) {
                L3: {
                  if ((param0 ^ -1) >= -1) {
                    break L3;
                  } else {
                    var5_int = this.field_n.read(param1, param2, param0);
                    if (var6 != 0) {
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      if ((var5_int ^ -1) >= -1) {
                        throw new EOFException();
                      } else {
                        param0 = param0 - var5_int;
                        param2 = param2 + var5_int;
                        if (var6 == 0) {
                          continue L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
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
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (runtimeException);
            stackOut_12_1 = new StringBuilder().append("td.L(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static void a(int param0, int param1) {
        ql var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        fi var4 = null;
        ql stackIn_4_0 = null;
        Object stackIn_6_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ql stackOut_3_0 = null;
        lh stackOut_5_0 = null;
        var3 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var2 = (ql) ((Object) sd.field_d.c((byte) 47));
            L1: while (true) {
              L2: {
                L3: {
                  if (var2 == null) {
                    break L3;
                  } else {
                    qb.a(param0, (byte) 90, var2);
                    stackOut_3_0 = (ql) ((Object) sd.field_d.b((byte) -105));
                    stackIn_6_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var3 != 0) {
                      break L2;
                    } else {
                      var2 = stackIn_4_0;
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_5_0 = lk.field_O.c((byte) 47);
                stackIn_6_0 = stackOut_5_0;
                break L2;
              }
              L4: {
                var4 = (fi) ((Object) stackIn_6_0);
                if (param1 == -1115925337) {
                  break L4;
                } else {
                  td.g(-22);
                  break L4;
                }
              }
              L5: while (true) {
                L6: {
                  if (var4 == null) {
                    break L6;
                  } else {
                    rd.a(param0, var4, (byte) -118);
                    var4 = (fi) ((Object) lk.field_O.b((byte) -105));
                    if (var3 != 0) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      if (var3 == 0) {
                        continue L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var2_ref), "td.C(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int e(int param0) throws IOException {
        if (this.field_l) {
            return 0;
        }
        int var2 = 49 % ((param0 - -57) / 48);
        return this.field_n.available();
    }

    private td(java.net.Socket param0, ce param1, int param2) throws IOException {
        this.field_b = 0;
        this.field_e = 0;
        this.field_l = false;
        this.field_a = false;
        try {
            this.field_o = param0;
            this.field_p = param1;
            this.field_o.setSoTimeout(30000);
            this.field_o.setTcpNoDelay(true);
            this.field_n = this.field_o.getInputStream();
            this.field_d = this.field_o.getOutputStream();
            this.field_r = param2;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "td.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit: {
            int var0 = 0;
            int var1 = 0;
            long var2 = 0L;
            long var4 = 0L;
            long var6 = 0L;
            long var8 = 0L;
            long var10 = 0L;
            long var12 = 0L;
            int var14 = 0;
            int var15 = 0;
            long stackIn_5_0 = 0L;
            long stackOut_4_0 = 0L;
            long stackOut_3_0 = 0L;
            field_f = new long[8][256];
            field_c = new long[11];
            var0 = 0;
            L0: while (true) {
              if ((var0 ^ -1) <= -257) {
                field_c[0] = 0L;
                var15 = 1;
                var0 = var15;
                L1: while (true) {
                  if (-11 > (var15 ^ -1)) {
                    break $cfr$clinit;
                  } else {
                    var1 = -8 + var15 * 8;
                    field_c[var15] = ik.a(re.a(field_f[7][var1 + 7], 255L), ik.a(re.a(65280L, field_f[6][var1 + 6]), ik.a(ik.a(ik.a(re.a(field_f[3][var1 - -3], 1095216660480L), ik.a(ik.a(re.a(-72057594037927936L, field_f[0][var1]), re.a(71776119061217280L, field_f[1][var1 - -1])), re.a(field_f[2][2 + var1], 280375465082880L))), re.a(field_f[4][4 + var1], 4278190080L)), re.a(field_f[5][var1 - -5], 16711680L))));
                    var15++;
                    continue L1;
                  }
                }
              } else {
                L2: {
                  var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
                  if ((var0 & 1) == 0) {
                    stackOut_4_0 = (long)(var1 >>> -717312504);
                    stackIn_5_0 = stackOut_4_0;
                    break L2;
                  } else {
                    stackOut_3_0 = (long)(var1 & 255);
                    stackIn_5_0 = stackOut_3_0;
                    break L2;
                  }
                }
                L3: {
                  var2 = stackIn_5_0;
                  var4 = var2 << 1934584129;
                  if ((var4 ^ -1L) <= -257L) {
                    var4 = var4 ^ 285L;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  var6 = var4 << 1978889857;
                  if (256L > var6) {
                    break L4;
                  } else {
                    var6 = var6 ^ 285L;
                    break L4;
                  }
                }
                L5: {
                  var8 = var2 ^ var6;
                  var10 = var6 << 344694401;
                  if (256L <= var10) {
                    var10 = var10 ^ 285L;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var12 = var2 ^ var10;
                field_f[0][var0] = cd.a(cd.a(var4 << -750757048, cd.a(cd.a(var10 << -286779944, cd.a(var2 << 1605772320, cd.a(var6 << 123167272, cd.a(var2 << 743919288, var2 << -368416976)))), var8 << -640463792)), var12);
                var14 = 1;
                L6: while (true) {
                  if ((var14 ^ -1) <= -9) {
                    var0++;
                    continue L0;
                  } else {
                    field_f[var14][var0] = cd.a(field_f[-1 + var14][var0] >>> -1233610744, field_f[-1 + var14][var0] << 1052021880);
                    var14++;
                    continue L6;
                  }
                }
              }
            }
        }
    }
}
