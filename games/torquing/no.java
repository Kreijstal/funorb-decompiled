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
                if (-1 != (((no) this).field_k.field_a ^ -1)) {
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
            int var1_int = 0;
            IOException var1 = null;
            Exception var1_ref = null;
            int var2 = 0;
            Object var3 = null;
            IOException var3_ref = null;
            int var6 = 0;
            Object var7 = null;
            Throwable decompiledCaughtException = null;
            var6 = Torquing.field_u;
            try {
              L0: {
                L1: while (true) {
                  L2: {
                    var3 = this;
                    if (((no) this).field_a == ((no) this).field_m) {
                      if (((no) this).field_c) {
                        try {
                          L3: {
                            L4: {
                              if (null == ((no) this).field_f) {
                                break L4;
                              } else {
                                ((no) this).field_f.close();
                                break L4;
                              }
                            }
                            L5: {
                              if (null != ((no) this).field_e) {
                                ((no) this).field_e.close();
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                            L6: {
                              if (((no) this).field_b == null) {
                                break L6;
                              } else {
                                ((no) this).field_b.close();
                                break L6;
                              }
                            }
                            break L3;
                          }
                        } catch (java.io.IOException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          L7: {
                            var1 = (IOException) (Object) decompiledCaughtException;
                            break L7;
                          }
                        }
                        ((no) this).field_d = null;
                        break L0;
                      } else {
                        this.wait();
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                  L8: {
                    if (((no) this).field_a >= ((no) this).field_m) {
                      var1_int = ((no) this).field_a - ((no) this).field_m;
                      break L8;
                    } else {
                      var1_int = ((no) this).field_l - ((no) this).field_m;
                      break L8;
                    }
                  }
                  var2 = ((no) this).field_m;
                  if ((var1_int ^ -1) >= -1) {
                    continue L1;
                  } else {
                    try {
                      L9: {
                        ((no) this).field_e.write(((no) this).field_d, var2, var1_int);
                        break L9;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L10: {
                        var3_ref = (IOException) (Object) decompiledCaughtException;
                        ((no) this).field_h = true;
                        break L10;
                      }
                    }
                    ((no) this).field_m = (var1_int + ((no) this).field_m) % ((no) this).field_l;
                    try {
                      L11: {
                        L12: {
                          if (((no) this).field_m == ((no) this).field_a) {
                            ((no) this).field_e.flush();
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        break L11;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      L13: {
                        var3_ref = (IOException) (Object) decompiledCaughtException;
                        ((no) this).field_h = true;
                        break L13;
                      }
                    }
                    continue L1;
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L14: {
                var1_ref = (Exception) (Object) decompiledCaughtException;
                var7 = null;
                nn.a((String) null, (Throwable) (Object) var1_ref, -9958);
                break L14;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, byte[] param1, byte param2, int param3) throws IOException {
        Object var5_ref_Object = null;
        int var5 = 0;
        int var6 = 0;
        Throwable var7 = null;
        int var8 = 0;
        Throwable decompiledCaughtException = null;
        var8 = Torquing.field_u;
        if (((no) this).field_c) {
          return;
        } else {
          if (((no) this).field_h) {
            ((no) this).field_h = false;
            throw new IOException();
          } else {
            L0: {
              if (((no) this).field_d == null) {
                ((no) this).field_d = new byte[((no) this).field_l];
                break L0;
              } else {
                break L0;
              }
            }
            var5_ref_Object = this;
            synchronized (var5_ref_Object) {
              L1: {
                var6 = 0;
                L2: while (true) {
                  if (var6 >= param3) {
                    L3: {
                      if (((no) this).field_k == null) {
                        ((no) this).field_k = ((no) this).field_g.a((byte) -90, 3, (Runnable) this);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    this.notifyAll();
                    break L1;
                  } else {
                    ((no) this).field_d[((no) this).field_a] = param1[var6 + param0];
                    ((no) this).field_a = (((no) this).field_a - -1) % ((no) this).field_l;
                    if (((no) this).field_a == (((no) this).field_m + (((no) this).field_l + -100)) % ((no) this).field_l) {
                      throw new IOException();
                    } else {
                      var6++;
                      continue L2;
                    }
                  }
                }
              }
            }
            var5 = 44 / ((param2 - -55) / 42);
            return;
          }
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
                    if (-1 <= (var2_int ^ -1)) {
                      L2: {
                        if ((var2_int ^ -1) > -1) {
                          ih.b(true);
                          break L2;
                        } else {
                          if (-30001L <= (lc.h((byte) -76) ^ -1L)) {
                            decompiledRegionSelector0 = 0;
                            break L0;
                          } else {
                            ih.b(true);
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
                      rb.field_C = km.b(param1 ^ -1);
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
                    ih.b(true);
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
        int var5 = 0;
        int var6 = Torquing.field_u;
        if (!(!((no) this).field_c)) {
            return;
        }
        while (0 < param0) {
            var5 = ((no) this).field_f.read(param2, param1, param0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            param0 = param0 - var5;
            param1 = param1 + var5;
        }
        if (param3 != -74) {
            ((no) this).field_f = null;
        }
    }

    final static sf[] a(vh param0, int param1) {
        int var5 = 0;
        sf var6 = null;
        int var7 = Torquing.field_u;
        if (!param0.a((byte) 13)) {
            return new sf[]{};
        }
        if (param1 > -10) {
            pc discarded$0 = no.b(false);
        }
        rc var8 = param0.a(100);
        while (var8.field_a == 0) {
            ub.a(1976, 10L);
        }
        if (!(2 != var8.field_a)) {
            return new sf[]{};
        }
        int[] var12 = (int[]) var8.field_d;
        int[] var11 = var12;
        int[] var10 = var11;
        int[] var9 = var10;
        int[] var3 = var9;
        sf[] var4 = new sf[var12.length >> 626420226];
        for (var5 = 0; var4.length > var5; var5++) {
            var6 = new sf();
            var4[var5] = var6;
            var6.field_d = var3[var5 << 749009602];
            var6.field_c = var3[(var5 << -1164807710) + 1];
            var6.field_b = var3[2 + (var5 << 1225699106)];
            var6.field_e = var3[(var5 << -1680835230) + 3];
        }
        return var4;
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
        ((no) this).field_g = param1;
        ((no) this).field_b = param0;
        ((no) this).field_b.setSoTimeout(30000);
        ((no) this).field_b.setTcpNoDelay(true);
        ((no) this).field_f = ((no) this).field_b.getInputStream();
        ((no) this).field_e = ((no) this).field_b.getOutputStream();
        ((no) this).field_l = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new int[8192];
        field_i = new int[128];
    }
}
