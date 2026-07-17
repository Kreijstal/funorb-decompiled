/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class gm implements Runnable {
    private OutputStream field_d;
    private int field_n;
    private int field_g;
    static int field_k;
    static dj field_h;
    private ec field_m;
    static String field_f;
    private byte[] field_e;
    private InputStream field_a;
    private boolean field_b;
    private op field_c;
    private boolean field_i;
    private int field_j;
    private java.net.Socket field_l;

    final void a(int param0, boolean param1, int param2, byte[] param3) throws IOException {
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
        var8 = ZombieDawn.field_J;
        try {
          if (!((gm) this).field_b) {
            if (((gm) this).field_i) {
              ((gm) this).field_i = false;
              throw new IOException();
            } else {
              L0: {
                if (null == ((gm) this).field_e) {
                  ((gm) this).field_e = new byte[((gm) this).field_g];
                  break L0;
                } else {
                  break L0;
                }
              }
              var5_ref = this;
              synchronized (var5_ref) {
                L1: {
                  var6 = 0;
                  if (param1) {
                    L2: while (true) {
                      if (param0 <= var6) {
                        L3: {
                          if (null != ((gm) this).field_c) {
                            break L3;
                          } else {
                            ((gm) this).field_c = ((gm) this).field_m.a(3, (Runnable) this, true);
                            break L3;
                          }
                        }
                        this.notifyAll();
                        break L1;
                      } else {
                        ((gm) this).field_e[((gm) this).field_n] = param3[param2 + var6];
                        ((gm) this).field_n = (((gm) this).field_n + 1) % ((gm) this).field_g;
                        if (((gm) this).field_n != (((gm) this).field_g + ((gm) this).field_j - 100) % ((gm) this).field_g) {
                          var6++;
                          continue L2;
                        } else {
                          throw new IOException();
                        }
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
              return;
            }
          } else {
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var5;
            stackOut_24_1 = new StringBuilder().append("gm.H(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param3 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L4;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L4;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 41);
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var6 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              if (param3 == 0) {
                break L1;
              } else {
                ((gm) this).field_c = null;
                break L1;
              }
            }
            if (((gm) this).field_b) {
              return;
            } else {
              L2: while (true) {
                if (param1 <= 0) {
                  break L0;
                } else {
                  var5_int = ((gm) this).field_a.read(param2, param0, param1);
                  if (var5_int <= 0) {
                    throw new EOFException();
                  } else {
                    param0 = param0 + var5_int;
                    param1 = param1 - var5_int;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("gm.F(").append(param0).append(44).append(param1).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param3 + 41);
        }
    }

    final int b(byte param0) throws IOException {
        if (param0 < -2) {
          if (((gm) this).field_b) {
            return 0;
          } else {
            return ((gm) this).field_a.available();
          }
        } else {
          gm.b(6);
          if (((gm) this).field_b) {
            return 0;
          } else {
            return ((gm) this).field_a.available();
          }
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_h = null;
    }

    final int a(boolean param0) throws IOException {
        Object var3 = null;
        if (!((gm) this).field_b) {
          if (param0) {
            var3 = null;
            gm.a((rc) null, (byte) 8, -92);
            return ((gm) this).field_a.read();
          } else {
            return ((gm) this).field_a.read();
          }
        } else {
          return 0;
        }
    }

    protected final void finalize() {
        ((gm) this).a(-89);
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
            var6 = ZombieDawn.field_J;
            try {
              L0: {
                L1: while (true) {
                  var3_ref = this;
                  synchronized (var3_ref) {
                    L2: {
                      L3: {
                        if (((gm) this).field_n != ((gm) this).field_j) {
                          break L3;
                        } else {
                          if (((gm) this).field_b) {
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
                        }
                      }
                      L6: {
                        if (((gm) this).field_n < ((gm) this).field_j) {
                          var1_int = -((gm) this).field_j + ((gm) this).field_g;
                          break L6;
                        } else {
                          var1_int = ((gm) this).field_n + -((gm) this).field_j;
                          break L6;
                        }
                      }
                      var2 = ((gm) this).field_j;
                      decompiledRegionSelector0 = 1;
                      break L2;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    try {
                      L7: {
                        L8: {
                          if (((gm) this).field_a != null) {
                            ((gm) this).field_a.close();
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          if (null == ((gm) this).field_d) {
                            break L9;
                          } else {
                            ((gm) this).field_d.close();
                            break L9;
                          }
                        }
                        L10: {
                          if (((gm) this).field_l == null) {
                            break L10;
                          } else {
                            ((gm) this).field_l.close();
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
                    ((gm) this).field_e = null;
                    break L0;
                  } else {
                    if (0 >= var1_int) {
                      continue L1;
                    } else {
                      try {
                        L12: {
                          ((gm) this).field_d.write(((gm) this).field_e, var2, var1_int);
                          break L12;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          ((gm) this).field_i = true;
                          break L13;
                        }
                      }
                      ((gm) this).field_j = (var1_int + ((gm) this).field_j) % ((gm) this).field_g;
                      try {
                        L14: {
                          L15: {
                            if (((gm) this).field_n == ((gm) this).field_j) {
                              ((gm) this).field_d.flush();
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
                          ((gm) this).field_i = true;
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
                ae.a((Throwable) (Object) var1_ref, 10331, (String) null);
                break L17;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void b(int param0) {
        hf.field_I = 0;
        if (param0 == -23148) {
            return;
        }
        field_k = -44;
    }

    final static void a(rc param0, byte param1, int param2) {
        if (param1 < 109) {
            return;
        }
        try {
            hk.field_F.a(0, (le) (Object) param0);
            rm.a((byte) -92, param2, param0);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "gm.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    final void a(int param0) {
        Object var2_ref_Object = null;
        int var2 = 0;
        InterruptedException var2_ref_InterruptedException = null;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = ZombieDawn.field_J;
        if (((gm) this).field_b) {
          return;
        } else {
          var2_ref_Object = this;
          synchronized (var2_ref_Object) {
            L0: {
              ((gm) this).field_b = true;
              this.notifyAll();
              break L0;
            }
          }
          if (((gm) this).field_c != null) {
            L1: while (true) {
              if (((gm) this).field_c.field_f != 0) {
                if (((gm) this).field_c.field_f == 1) {
                  try {
                    L2: {
                      ((Thread) ((gm) this).field_c.field_d).join();
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var2_ref_InterruptedException = (InterruptedException) (Object) decompiledCaughtException;
                    ((gm) this).field_c = null;
                    var2 = 38 / ((-7 - param0) / 45);
                    return;
                  }
                  ((gm) this).field_c = null;
                  var2 = 38 / ((-7 - param0) / 45);
                  return;
                } else {
                  ((gm) this).field_c = null;
                  var2 = 38 / ((-7 - param0) / 45);
                  return;
                }
              } else {
                ld.a(1L, (byte) 89);
                continue L1;
              }
            }
          } else {
            ((gm) this).field_c = null;
            var2 = 38 / ((-7 - param0) / 45);
            return;
          }
        }
    }

    final void c(byte param0) throws IOException {
        if (param0 == 85) {
          if (!((gm) this).field_b) {
            if (((gm) this).field_i) {
              ((gm) this).field_i = false;
              throw new IOException();
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          ((gm) this).finalize();
          if (!((gm) this).field_b) {
            if (((gm) this).field_i) {
              ((gm) this).field_i = false;
              throw new IOException();
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    gm(java.net.Socket param0, ec param1) throws IOException {
        this(param0, param1, 5000);
    }

    private gm(java.net.Socket param0, ec param1, int param2) throws IOException {
        ((gm) this).field_n = 0;
        ((gm) this).field_b = false;
        ((gm) this).field_j = 0;
        ((gm) this).field_i = false;
        try {
            ((gm) this).field_m = param1;
            ((gm) this).field_l = param0;
            ((gm) this).field_l.setSoTimeout(30000);
            ((gm) this).field_l.setTcpNoDelay(true);
            ((gm) this).field_a = ((gm) this).field_l.getInputStream();
            ((gm) this).field_d = ((gm) this).field_l.getOutputStream();
            ((gm) this).field_g = param2;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "gm.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final static on a(byte[] param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        byte[] var7 = null;
        byte[] var8 = null;
        byte[] var9 = null;
        byte[] var10 = null;
        Object stackIn_3_0 = null;
        on stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        on stackOut_10_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var6 = ZombieDawn.field_J;
        try {
          L0: {
            if (param1 < -3) {
              var2_int = 0;
              var10 = new byte[param0.length + 24];
              var9 = var10;
              var8 = var9;
              var7 = var8;
              var3 = var7;
              var2_int = 0;
              L1: while (true) {
                if (var2_int >= 4) {
                  int incrementValue$2 = var2_int;
                  var2_int++;
                  var4 = md.a(incrementValue$2, param0, 82);
                  int incrementValue$3 = var2_int;
                  var2_int++;
                  var5 = md.a(incrementValue$3, param0, 65);
                  fb.a(4, var10, (byte) 69, var4);
                  fb.a(5, var10, (byte) 61, var5);
                  fb.a(6, var10, (byte) 79, var4);
                  fb.a(7, var10, (byte) 80, var5);
                  fb.a(8, var10, (byte) 56, var4);
                  fb.a(9, var10, (byte) -64, var5);
                  fb.a(10, var10, (byte) 66, var4);
                  fb.a(11, var10, (byte) 74, var5);
                  var2_int = 6;
                  L2: while (true) {
                    if (param0.length / 4 <= var2_int) {
                      stackOut_10_0 = vk.a((byte) -83, var10);
                      stackIn_11_0 = stackOut_10_0;
                      break L0;
                    } else {
                      fb.a(6 + var2_int, var3, (byte) 42, md.a(var2_int, param0, 93));
                      var2_int++;
                      continue L2;
                    }
                  }
                } else {
                  fb.a(var2_int, var3, (byte) -81, md.a(var2_int, param0, 70));
                  var2_int++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (on) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("gm.C(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 41);
        }
        return stackIn_11_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = 65;
        field_f = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
