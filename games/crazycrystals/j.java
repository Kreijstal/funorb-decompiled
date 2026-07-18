/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class j implements Runnable {
    private InputStream field_n;
    private int field_d;
    private boolean field_m;
    private int field_g;
    private byte[] field_a;
    private java.net.Socket field_c;
    static int field_j;
    private int field_f;
    private un field_b;
    static String field_h;
    private OutputStream field_e;
    private gb field_l;
    private boolean field_k;
    static int[] field_i;

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
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
        var8 = CrazyCrystals.field_B;
        try {
          if (!((j) this).field_k) {
            if (!((j) this).field_m) {
              L0: {
                if (((j) this).field_a == null) {
                  ((j) this).field_a = new byte[((j) this).field_d];
                  break L0;
                } else {
                  break L0;
                }
              }
              L1: {
                if (param1 >= 85) {
                  break L1;
                } else {
                  boolean discarded$1 = j.c((byte) -1);
                  break L1;
                }
              }
              var5_ref = this;
              synchronized (var5_ref) {
                L2: {
                  var6 = 0;
                  L3: while (true) {
                    if (param3 <= var6) {
                      L4: {
                        if (null != ((j) this).field_l) {
                          break L4;
                        } else {
                          ((j) this).field_l = ((j) this).field_b.a((Runnable) this, 2, 3);
                          break L4;
                        }
                      }
                      this.notifyAll();
                      break L2;
                    } else {
                      ((j) this).field_a[((j) this).field_g] = param2[var6 + param0];
                      ((j) this).field_g = (((j) this).field_g + 1) % ((j) this).field_d;
                      if ((-100 + (((j) this).field_d + ((j) this).field_f)) % ((j) this).field_d == ((j) this).field_g) {
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
              ((j) this).field_m = false;
              throw new IOException();
            }
          } else {
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var5;
            stackOut_24_1 = new StringBuilder().append("j.E(").append(param0).append(',').append(param1).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L5;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L5;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + param3 + ')');
        }
    }

    final static void a(ak param0, int param1, boolean param2) {
        md var3 = tp.field_f;
        try {
            var3.d(8, 3);
            var3.a(true, 5);
            var3.a(true, 0);
            var3.c(-161478600, param0.field_g);
            var3.a(true, param0.field_h);
            var3.a(true, param0.field_j);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "j.I(" + (param0 != null ? "{...}" : "null") + ',' + 3 + ',' + false + ')');
        }
    }

    final int b(int param0) throws IOException {
        if (param0 == 5) {
          if (((j) this).field_k) {
            return 0;
          } else {
            return ((j) this).field_n.read();
          }
        } else {
          ((j) this).field_m = true;
          if (((j) this).field_k) {
            return 0;
          } else {
            return ((j) this).field_n.read();
          }
        }
    }

    j(java.net.Socket param0, un param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(int param0) throws IOException {
        int var2 = 0;
        var2 = 0 % ((param0 - -23) / 37);
        if (!((j) this).field_k) {
          if (((j) this).field_m) {
            ((j) this).field_m = false;
            throw new IOException();
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void b(byte param0) {
        Object var2 = null;
        InterruptedException var2_ref = null;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = CrazyCrystals.field_B;
        if (((j) this).field_k) {
          return;
        } else {
          var2 = this;
          synchronized (var2) {
            L0: {
              L1: {
                ((j) this).field_k = true;
                this.notifyAll();
                if (param0 == -118) {
                  break L1;
                } else {
                  ((j) this).field_g = -44;
                  break L1;
                }
              }
              break L0;
            }
          }
          if (null != ((j) this).field_l) {
            L2: while (true) {
              if (((j) this).field_l.field_a != 0) {
                if (((j) this).field_l.field_a == 1) {
                  try {
                    L3: {
                      ((Thread) ((j) this).field_l.field_b).join();
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var2_ref = (InterruptedException) (Object) decompiledCaughtException;
                    ((j) this).field_l = null;
                    return;
                  }
                  ((j) this).field_l = null;
                  return;
                } else {
                  ((j) this).field_l = null;
                  return;
                }
              } else {
                fh.a(true, 1L);
                continue L2;
              }
            }
          } else {
            ((j) this).field_l = null;
            return;
          }
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
            var6 = CrazyCrystals.field_B;
            try {
              L0: {
                L1: while (true) {
                  var3_ref = this;
                  synchronized (var3_ref) {
                    L2: {
                      L3: {
                        if (((j) this).field_g == ((j) this).field_f) {
                          if (((j) this).field_k) {
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
                        if (((j) this).field_f <= ((j) this).field_g) {
                          var1_int = ((j) this).field_g + -((j) this).field_f;
                          break L6;
                        } else {
                          var1_int = -((j) this).field_f + ((j) this).field_d;
                          break L6;
                        }
                      }
                      var2 = ((j) this).field_f;
                      decompiledRegionSelector0 = 1;
                      break L2;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    try {
                      L7: {
                        L8: {
                          if (((j) this).field_n == null) {
                            break L8;
                          } else {
                            ((j) this).field_n.close();
                            break L8;
                          }
                        }
                        L9: {
                          if (null == ((j) this).field_e) {
                            break L9;
                          } else {
                            ((j) this).field_e.close();
                            break L9;
                          }
                        }
                        L10: {
                          if (null != ((j) this).field_c) {
                            ((j) this).field_c.close();
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
                    ((j) this).field_a = null;
                    break L0;
                  } else {
                    if (var1_int <= 0) {
                      continue L1;
                    } else {
                      try {
                        L12: {
                          ((j) this).field_e.write(((j) this).field_a, var2, var1_int);
                          break L12;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          ((j) this).field_m = true;
                          break L13;
                        }
                      }
                      ((j) this).field_f = (((j) this).field_f - -var1_int) % ((j) this).field_d;
                      try {
                        L14: {
                          L15: {
                            if (((j) this).field_f != ((j) this).field_g) {
                              break L15;
                            } else {
                              ((j) this).field_e.flush();
                              break L15;
                            }
                          }
                          break L14;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L16: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          ((j) this).field_m = true;
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
                wp.a((Throwable) (Object) var1_ref, (String) null, 21862);
                break L17;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    protected final void finalize() {
        ((j) this).b((byte) -118);
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
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
        var6 = CrazyCrystals.field_B;
        try {
          L0: {
            if (((j) this).field_k) {
              return;
            } else {
              L1: while (true) {
                if (param1 <= 0) {
                  if (param2 == 2034) {
                    break L0;
                  } else {
                    ((j) this).field_f = -31;
                    return;
                  }
                } else {
                  var5_int = ((j) this).field_n.read(param0, param3, param1);
                  if (var5_int <= 0) {
                    throw new EOFException();
                  } else {
                    param3 = param3 + var5_int;
                    param1 = param1 - var5_int;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("j.B(");
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
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void a(byte param0) {
        field_i = null;
        field_h = null;
    }

    final int c(int param0) throws IOException {
        if (((j) this).field_k) {
            return 0;
        }
        if (param0 != 0) {
            return -14;
        }
        return ((j) this).field_n.available();
    }

    private j(java.net.Socket param0, un param1, int param2) throws IOException {
        ((j) this).field_f = 0;
        ((j) this).field_g = 0;
        ((j) this).field_k = false;
        ((j) this).field_m = false;
        try {
            ((j) this).field_b = param1;
            ((j) this).field_c = param0;
            ((j) this).field_c.setSoTimeout(30000);
            ((j) this).field_c.setTcpNoDelay(true);
            ((j) this).field_n = ((j) this).field_c.getInputStream();
            ((j) this).field_e = ((j) this).field_c.getOutputStream();
            ((j) this).field_d = param2;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "j.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static boolean c(byte param0) {
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        ka.field_j = true;
        if (param0 != -23) {
          return false;
        } else {
          L0: {
            ee.field_e = lo.a((byte) 81) - -15000L;
            if (hp.field_s != 11) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
    }
}
