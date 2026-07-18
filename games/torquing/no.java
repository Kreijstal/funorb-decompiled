/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class no implements Runnable {
    private java.net.Socket field_b;
    private boolean field_c;
    private boolean field_h;
    private rc field_k;
    static bo field_n;
    private int field_l;
    private vh field_g;
    private InputStream field_f;
    private int field_m;
    private int field_a;
    private OutputStream field_e;
    static int[] field_j;
    static int[] field_i;
    private byte[] field_d;

    final void e(int param0) throws IOException {
        if (param0 != 22685) {
            Object var3 = null;
            sf[] discarded$0 = no.a((vh) null, -81);
        }
        if (((no) this).field_c) {
            return;
        }
        if (!(!((no) this).field_h)) {
            ((no) this).field_h = false;
            throw new IOException();
        }
    }

    final void a(boolean param0) {
        InterruptedException interruptedException = null;
        Object var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        var4 = Torquing.field_u;
        if (!((no) this).field_c) {
          var2 = this;
          synchronized (var2) {
            L0: {
              L1: {
                stackOut_3_0 = this;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (!param0) {
                  stackOut_5_0 = this;
                  stackOut_5_1 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  break L1;
                } else {
                  stackOut_4_0 = this;
                  stackOut_4_1 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  break L1;
                }
              }
              ((no) this).field_c = stackIn_6_1 != 0;
              this.notifyAll();
              break L0;
            }
          }
          L2: {
            if (null == ((no) this).field_k) {
              break L2;
            } else {
              L3: while (true) {
                if (((no) this).field_k.field_a != 0) {
                  if (((no) this).field_k.field_a == 1) {
                    try {
                      L4: {
                        ((Thread) ((no) this).field_k.field_d).join();
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
                  ub.a(1976, 1L);
                  continue L3;
                }
              }
            }
          }
          ((no) this).field_k = null;
          return;
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
            Object var7 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            var6 = Torquing.field_u;
            try {
              L0: {
                L1: while (true) {
                  var3_ref = this;
                  synchronized (var3_ref) {
                    L2: {
                      L3: {
                        if (((no) this).field_a == ((no) this).field_m) {
                          if (((no) this).field_c) {
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
                        if (((no) this).field_a >= ((no) this).field_m) {
                          var1_int = ((no) this).field_a - ((no) this).field_m;
                          break L6;
                        } else {
                          var1_int = ((no) this).field_l - ((no) this).field_m;
                          break L6;
                        }
                      }
                      var2 = ((no) this).field_m;
                      decompiledRegionSelector0 = 1;
                      break L2;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    try {
                      L7: {
                        L8: {
                          if (null == ((no) this).field_f) {
                            break L8;
                          } else {
                            ((no) this).field_f.close();
                            break L8;
                          }
                        }
                        L9: {
                          if (null != ((no) this).field_e) {
                            ((no) this).field_e.close();
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: {
                          if (((no) this).field_b == null) {
                            break L10;
                          } else {
                            ((no) this).field_b.close();
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
                    ((no) this).field_d = null;
                    break L0;
                  } else {
                    if (var1_int <= 0) {
                      continue L1;
                    } else {
                      try {
                        L12: {
                          ((no) this).field_e.write(((no) this).field_d, var2, var1_int);
                          break L12;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          ((no) this).field_h = true;
                          break L13;
                        }
                      }
                      ((no) this).field_m = (var1_int + ((no) this).field_m) % ((no) this).field_l;
                      try {
                        L14: {
                          L15: {
                            if (((no) this).field_m == ((no) this).field_a) {
                              ((no) this).field_e.flush();
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          break L14;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L16: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          ((no) this).field_h = true;
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
                nn.a((String) null, (Throwable) (Object) var1_ref, -9958);
                break L17;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, byte[] param1, byte param2, int param3) throws IOException {
        RuntimeException var5 = null;
        Object var5_ref = null;
        int var5_int = 0;
        int var6 = 0;
        Throwable var7 = null;
        int var8 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var8 = Torquing.field_u;
        try {
          L0: {
            if (((no) this).field_c) {
              return;
            } else {
              if (((no) this).field_h) {
                ((no) this).field_h = false;
                throw new IOException();
              } else {
                L1: {
                  if (((no) this).field_d == null) {
                    ((no) this).field_d = new byte[((no) this).field_l];
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
                      if (var6 >= param3) {
                        L4: {
                          if (((no) this).field_k == null) {
                            ((no) this).field_k = ((no) this).field_g.a((byte) -90, 3, (Runnable) this);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        this.notifyAll();
                        break L2;
                      } else {
                        ((no) this).field_d[((no) this).field_a] = param1[var6 + param0];
                        ((no) this).field_a = (((no) this).field_a - -1) % ((no) this).field_l;
                        if (((no) this).field_a == (((no) this).field_m + (((no) this).field_l + -100)) % ((no) this).field_l) {
                          throw new IOException();
                        } else {
                          var6++;
                          continue L3;
                        }
                      }
                    }
                  }
                }
                var5_int = 44 / ((param2 - -55) / 42);
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var5;
            stackOut_26_1 = new StringBuilder().append("no.H(").append(param0).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L5;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L5;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void c(int param0) {
        if (!(!hj.field_b)) {
            return;
        }
        ra.field_e = of.field_l.field_r;
        fq.field_F.field_d = fq.field_F.field_d - of.field_l.field_r;
        fq.field_F.field_c = fq.field_F.field_c - of.field_l.field_v;
        hb.field_s = of.field_l.field_v;
        of.field_l.field_r = 0;
        t var4 = of.field_l;
        t var5 = var4;
        of.field_l.field_u = of.field_l.field_t;
        of.field_l.field_w = of.field_l.field_s;
        ub.field_E = -200;
        var5.field_v = 0;
        ra.field_c = (hb.field_s - ub.field_E) / 35;
        kc.field_v = la.field_j.field_r - -(la.field_j.field_t / 2);
        if (param0 > -68) {
            return;
        }
        ll.field_g = 63664;
        je.field_a = la.field_j.field_s / 2 + la.field_j.field_v;
        t var2 = la.field_j;
        la.field_j.field_r = 0;
        la.field_j.field_w = la.field_j.field_s;
        la.field_j.field_u = la.field_j.field_t;
        nn.field_e = -jb.field_b.field_c + 640;
        var2.field_v = 0;
        pp.field_a = nn.field_e / 30;
    }

    final static boolean a(int param0, int param1) {
        try {
            int var2_int = 0;
            IOException var2 = null;
            int stackIn_13_0 = 0;
            int stackIn_15_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_14_0 = 0;
            int stackOut_12_0 = 0;
            if (param0 <= kj.field_d.field_n) {
              return true;
            } else {
              if (vk.field_E == null) {
                return false;
              } else {
                try {
                  L0: {
                    L1: {
                      if (param1 == 0) {
                        break L1;
                      } else {
                        no.c(-9);
                        break L1;
                      }
                    }
                    var2_int = vk.field_E.a(-85);
                    if (var2_int <= 0) {
                      L2: {
                        if (var2_int < 0) {
                          int discarded$26 = 1;
                          ih.b();
                          break L2;
                        } else {
                          int discarded$27 = -76;
                          if (lc.h() <= 30000L) {
                            decompiledRegionSelector0 = 0;
                            break L0;
                          } else {
                            int discarded$28 = 1;
                            ih.b();
                            break L2;
                          }
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L3: {
                        if (var2_int <= param0 + -kj.field_d.field_n) {
                          break L3;
                        } else {
                          var2_int = param0 - kj.field_d.field_n;
                          break L3;
                        }
                      }
                      vk.field_E.a(var2_int, kj.field_d.field_n, kj.field_d.field_j, (byte) -74);
                      rb.field_C = km.b(~param1);
                      kj.field_d.field_n = kj.field_d.field_n + var2_int;
                      if (param0 <= kj.field_d.field_n) {
                        kj.field_d.field_n = 0;
                        stackOut_14_0 = 1;
                        stackIn_15_0 = stackOut_14_0;
                        return stackIn_15_0 != 0;
                      } else {
                        stackOut_12_0 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        return stackIn_13_0 != 0;
                      }
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var2 = (IOException) (Object) decompiledCaughtException;
                    int discarded$29 = 1;
                    ih.b();
                    decompiledRegionSelector0 = 1;
                    break L4;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  return false;
                } else {
                  return false;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int d(int param0) throws IOException {
        if (((no) this).field_c) {
            return 0;
        }
        if (param0 != 0) {
            field_j = null;
        }
        return ((no) this).field_f.read();
    }

    final void a(int param0, int param1, byte[] param2, byte param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = Torquing.field_u;
        try {
          L0: {
            if (((no) this).field_c) {
              return;
            } else {
              L1: while (true) {
                if (0 >= param0) {
                  L2: {
                    if (param3 == -74) {
                      break L2;
                    } else {
                      ((no) this).field_f = null;
                      break L2;
                    }
                  }
                  break L0;
                } else {
                  var5_int = ((no) this).field_f.read(param2, param1, param0);
                  if (var5_int > 0) {
                    param0 = param0 - var5_int;
                    param1 = param1 + var5_int;
                    continue L1;
                  } else {
                    throw new EOFException();
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("no.F(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param3 + ')');
        }
    }

    final static sf[] a(vh param0, int param1) {
        RuntimeException var2 = null;
        int[] var3 = null;
        sf[] var4 = null;
        int var5 = 0;
        sf var6 = null;
        int var7 = 0;
        rc var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        sf[] stackIn_3_0 = null;
        sf[] stackIn_12_0 = null;
        sf[] stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        sf[] stackOut_11_0 = null;
        sf[] stackOut_16_0 = null;
        sf[] stackOut_2_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var7 = Torquing.field_u;
        try {
          L0: {
            if (param0.a((byte) 13)) {
              L1: {
                if (param1 <= -10) {
                  break L1;
                } else {
                  pc discarded$1 = no.b(false);
                  break L1;
                }
              }
              var8 = param0.a(100);
              L2: while (true) {
                if (var8.field_a != 0) {
                  if (2 == var8.field_a) {
                    stackOut_11_0 = new sf[]{};
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0;
                  } else {
                    var12 = (int[]) var8.field_d;
                    var11 = var12;
                    var10 = var11;
                    var9 = var10;
                    var3 = var9;
                    var4 = new sf[var12.length >> 2];
                    var5 = 0;
                    L3: while (true) {
                      if (var4.length <= var5) {
                        stackOut_16_0 = (sf[]) var4;
                        stackIn_17_0 = stackOut_16_0;
                        break L0;
                      } else {
                        var6 = new sf();
                        var4[var5] = var6;
                        var6.field_d = var3[var5 << 2];
                        var6.field_c = var3[(var5 << 2) + 1];
                        var6.field_b = var3[2 + (var5 << 2)];
                        var6.field_e = var3[(var5 << 2) + 3];
                        var5++;
                        continue L3;
                      }
                    }
                  }
                } else {
                  ub.a(1976, 10L);
                  continue L2;
                }
              }
            } else {
              stackOut_2_0 = new sf[]{};
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var2;
            stackOut_18_1 = new StringBuilder().append("no.C(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param1 + ')');
        }
        return stackIn_17_0;
    }

    final int a(int param0) throws IOException {
        if (param0 >= -68) {
            field_j = null;
        }
        if (((no) this).field_c) {
            return 0;
        }
        return ((no) this).field_f.available();
    }

    protected final void finalize() {
        ((no) this).a(true);
    }

    no(java.net.Socket param0, vh param1) throws IOException {
        this(param0, param1, 5000);
    }

    final static pc b(boolean param0) {
        if (!param0) {
            field_j = null;
        }
        if (bi.field_f == null) {
            bi.field_f = new pc(sp.field_R, 20, 0, 0, 0, 11579568, -1, 0, 0, sp.field_R.field_x, -1, 2147483647, true);
        }
        return bi.field_f;
    }

    public static void b(int param0) {
        field_i = null;
        field_n = null;
        if (param0 != 0) {
            field_i = null;
        }
        field_j = null;
    }

    private no(java.net.Socket param0, vh param1, int param2) throws IOException {
        ((no) this).field_a = 0;
        ((no) this).field_m = 0;
        ((no) this).field_h = false;
        ((no) this).field_c = false;
        try {
            ((no) this).field_g = param1;
            ((no) this).field_b = param0;
            ((no) this).field_b.setSoTimeout(30000);
            ((no) this).field_b.setTcpNoDelay(true);
            ((no) this).field_f = ((no) this).field_b.getInputStream();
            ((no) this).field_e = ((no) this).field_b.getOutputStream();
            ((no) this).field_l = param2;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "no.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new int[8192];
        field_i = new int[128];
    }
}
