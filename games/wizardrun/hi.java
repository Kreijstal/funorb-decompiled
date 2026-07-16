/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.awt.Canvas;

final class hi implements Runnable {
    private int field_b;
    private jh field_e;
    private byte[] field_i;
    private boolean field_g;
    private java.net.Socket field_o;
    static int field_c;
    private int field_n;
    private OutputStream field_h;
    static boolean[] field_p;
    private InputStream field_m;
    private boolean field_f;
    private int field_d;
    private vh field_j;
    static rc field_l;
    static long field_k;
    static int field_a;

    final int a(byte param0) throws IOException {
        if (param0 != 19) {
            return 111;
        }
        if (!(!((hi) this).field_g)) {
            return 0;
        }
        return ((hi) this).field_m.read();
    }

    hi(java.net.Socket param0, vh param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        Object var5 = null;
        int var6 = 0;
        Throwable var7 = null;
        int var8 = 0;
        Throwable decompiledCaughtException = null;
        var8 = wizardrun.field_H;
        if (!((hi) this).field_g) {
          if (!((hi) this).field_f) {
            L0: {
              if (null != ((hi) this).field_i) {
                break L0;
              } else {
                ((hi) this).field_i = new byte[((hi) this).field_n];
                break L0;
              }
            }
            L1: {
              if (param2 == 1) {
                break L1;
              } else {
                ((hi) this).b((byte) 47);
                break L1;
              }
            }
            var5 = this;
            synchronized (var5) {
              L2: {
                var6 = 0;
                L3: while (true) {
                  if (param0 <= var6) {
                    L4: {
                      if (null == ((hi) this).field_e) {
                        ((hi) this).field_e = ((hi) this).field_j.a((byte) -118, (Runnable) this, 3);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    this.notifyAll();
                    break L2;
                  } else {
                    ((hi) this).field_i[((hi) this).field_b] = param1[var6 + param3];
                    ((hi) this).field_b = (1 + ((hi) this).field_b) % ((hi) this).field_n;
                    if (((hi) this).field_b == (-100 + (((hi) this).field_n + ((hi) this).field_d)) % ((hi) this).field_n) {
                      throw new IOException();
                    } else {
                      var6++;
                      continue L3;
                    }
                  }
                }
              }
            }
            return;
          } else {
            ((hi) this).field_f = false;
            throw new IOException();
          }
        } else {
          return;
        }
    }

    final void a(int param0) throws IOException {
        if (((hi) this).field_g) {
          return;
        } else {
          if (param0 == 0) {
            if (((hi) this).field_f) {
              ((hi) this).field_f = false;
              throw new IOException();
            } else {
              return;
            }
          } else {
            ((hi) this).field_e = null;
            if (((hi) this).field_f) {
              ((hi) this).field_f = false;
              throw new IOException();
            } else {
              return;
            }
          }
        }
    }

    final static java.awt.Canvas d(byte param0) {
        Object stackIn_4_0 = null;
        Object stackIn_8_0 = null;
        ui stackOut_7_0 = null;
        java.awt.Canvas stackOut_6_0 = null;
        ui stackOut_3_0 = null;
        java.awt.Canvas stackOut_2_0 = null;
        if (param0 <= 66) {
          L0: {
            field_c = 115;
            if (null != ki.field_E) {
              stackOut_7_0 = ki.field_E;
              stackIn_8_0 = (Object) (Object) stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = wizardrun.field_G;
              stackIn_8_0 = (Object) (Object) stackOut_6_0;
              break L0;
            }
          }
          return (java.awt.Canvas) (Object) stackIn_8_0;
        } else {
          L1: {
            if (null != ki.field_E) {
              stackOut_3_0 = ki.field_E;
              stackIn_4_0 = (Object) (Object) stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = wizardrun.field_G;
              stackIn_4_0 = (Object) (Object) stackOut_2_0;
              break L1;
            }
          }
          return (java.awt.Canvas) (Object) stackIn_4_0;
        }
    }

    final void b(byte param0) {
        Object var2 = null;
        InterruptedException var2_ref = null;
        Throwable var3 = null;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        var4 = wizardrun.field_H;
        if (((hi) this).field_g) {
          return;
        } else {
          var2 = this;
          synchronized (var2) {
            L0: {
              L1: {
                if (param0 == 76) {
                  break L1;
                } else {
                  java.awt.Canvas discarded$2 = hi.d((byte) 8);
                  break L1;
                }
              }
              ((hi) this).field_g = true;
              this.notifyAll();
              break L0;
            }
          }
          L2: {
            if (null == ((hi) this).field_e) {
              break L2;
            } else {
              L3: while (true) {
                if (-1 != (((hi) this).field_e.field_a ^ -1)) {
                  if (1 == ((hi) this).field_e.field_a) {
                    try {
                      L4: {
                        ((Thread) ((hi) this).field_e.field_e).join();
                        decompiledRegionSelector0 = 0;
                        break L4;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        var2_ref = (InterruptedException) (Object) decompiledCaughtException;
                        decompiledRegionSelector0 = 1;
                        break L5;
                      }
                    }
                    if (decompiledRegionSelector0 == 0) {
                      ((hi) this).field_e = null;
                      return;
                    } else {
                      break L2;
                    }
                  } else {
                    ((hi) this).field_e = null;
                    return;
                  }
                } else {
                  tg.a(1L, false);
                  continue L3;
                }
              }
            }
          }
          ((hi) this).field_e = null;
          return;
        }
    }

    final int c(byte param0) throws IOException {
        if (param0 != 89) {
            ((hi) this).field_g = true;
            if (!(!((hi) this).field_g)) {
                return 0;
            }
            return ((hi) this).field_m.available();
        }
        if (!(!((hi) this).field_g)) {
            return 0;
        }
        return ((hi) this).field_m.available();
    }

    protected final void finalize() {
        ((hi) this).b((byte) 76);
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = wizardrun.field_H;
        var5 = -119 % ((-63 - param1) / 40);
        if (!((hi) this).field_g) {
          L0: while (true) {
            if ((param2 ^ -1) < -1) {
              var6 = ((hi) this).field_m.read(param0, param3, param2);
              if (var6 <= 0) {
                throw new EOFException();
              } else {
                param2 = param2 - var6;
                param3 = param3 + var6;
                continue L0;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    public static void b(int param0) {
        if (param0 != -30534) {
            field_k = 39L;
            field_l = null;
            field_p = null;
            return;
        }
        field_l = null;
        field_p = null;
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
            var6 = wizardrun.field_H;
            try {
              L0: {
                L1: while (true) {
                  L2: {
                    var3 = this;
                    if (((hi) this).field_b != ((hi) this).field_d) {
                      break L2;
                    } else {
                      if (((hi) this).field_g) {
                        try {
                          L3: {
                            L4: {
                              if (((hi) this).field_m == null) {
                                break L4;
                              } else {
                                ((hi) this).field_m.close();
                                break L4;
                              }
                            }
                            L5: {
                              if (null == ((hi) this).field_h) {
                                break L5;
                              } else {
                                ((hi) this).field_h.close();
                                break L5;
                              }
                            }
                            L6: {
                              if (null == ((hi) this).field_o) {
                                break L6;
                              } else {
                                ((hi) this).field_o.close();
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
                        ((hi) this).field_i = null;
                        break L0;
                      } else {
                        this.wait();
                        break L2;
                      }
                    }
                  }
                  L8: {
                    if (((hi) this).field_d > ((hi) this).field_b) {
                      var1_int = -((hi) this).field_d + ((hi) this).field_n;
                      break L8;
                    } else {
                      var1_int = ((hi) this).field_b - ((hi) this).field_d;
                      break L8;
                    }
                  }
                  var2 = ((hi) this).field_d;
                  if (var1_int <= 0) {
                    continue L1;
                  } else {
                    try {
                      L9: {
                        ((hi) this).field_h.write(((hi) this).field_i, var2, var1_int);
                        break L9;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L10: {
                        var3_ref = (IOException) (Object) decompiledCaughtException;
                        ((hi) this).field_f = true;
                        break L10;
                      }
                    }
                    ((hi) this).field_d = (((hi) this).field_d - -var1_int) % ((hi) this).field_n;
                    try {
                      L11: {
                        L12: {
                          if (((hi) this).field_b == ((hi) this).field_d) {
                            ((hi) this).field_h.flush();
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
                        ((hi) this).field_f = true;
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
                rg.a((Throwable) (Object) var1_ref, (String) null, -562);
                break L14;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private hi(java.net.Socket param0, vh param1, int param2) throws IOException {
        ((hi) this).field_g = false;
        ((hi) this).field_b = 0;
        ((hi) this).field_f = false;
        ((hi) this).field_d = 0;
        ((hi) this).field_j = param1;
        ((hi) this).field_o = param0;
        ((hi) this).field_o.setSoTimeout(30000);
        ((hi) this).field_o.setTcpNoDelay(true);
        ((hi) this).field_m = ((hi) this).field_o.getInputStream();
        ((hi) this).field_h = ((hi) this).field_o.getOutputStream();
        ((hi) this).field_n = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new boolean[112];
        field_l = new rc();
        field_a = -480;
    }
}
