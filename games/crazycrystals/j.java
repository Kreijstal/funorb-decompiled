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
        Object var5 = null;
        int var6 = 0;
        Throwable var7 = null;
        int var8 = 0;
        Throwable decompiledCaughtException = null;
        var8 = CrazyCrystals.field_B;
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
                boolean discarded$3 = j.c((byte) -1);
                break L1;
              }
            }
            var5 = this;
            synchronized (var5) {
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
    }

    final static void a(ak param0, int param1, boolean param2) {
        md var3 = null;
        md stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        md stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        md stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        md stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        var3 = tp.field_f;
        if (param2) {
          return;
        } else {
          var3.d(8, param1);
          var3.a(true, 5);
          stackOut_1_0 = (md) var3;
          stackOut_1_1 = 1;
          stackIn_3_0 = stackOut_1_0;
          stackIn_3_1 = stackOut_1_1;
          ((md) (Object) stackIn_3_0).a(stackIn_3_1 != 0, 0);
          var3.c(-161478600, param0.field_g);
          var3.a(true, param0.field_h);
          stackOut_3_0 = (md) var3;
          stackOut_3_1 = 1;
          stackIn_5_0 = stackOut_3_0;
          stackIn_5_1 = stackOut_3_1;
          ((md) (Object) stackIn_5_0).a(stackIn_5_1 != 0, param0.field_j);
          return;
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
            int var1_int = 0;
            IOException var1 = null;
            Exception var1_ref = null;
            int var2 = 0;
            Object var3 = null;
            IOException var3_ref = null;
            int var6 = 0;
            Object var7 = null;
            Throwable decompiledCaughtException = null;
            var6 = CrazyCrystals.field_B;
            try {
              L0: {
                L1: while (true) {
                  L2: {
                    var3 = this;
                    if (((j) this).field_g == ((j) this).field_f) {
                      if (((j) this).field_k) {
                        try {
                          L3: {
                            L4: {
                              if (((j) this).field_n == null) {
                                break L4;
                              } else {
                                ((j) this).field_n.close();
                                break L4;
                              }
                            }
                            L5: {
                              if (null == ((j) this).field_e) {
                                break L5;
                              } else {
                                ((j) this).field_e.close();
                                break L5;
                              }
                            }
                            L6: {
                              if (null != ((j) this).field_c) {
                                ((j) this).field_c.close();
                                break L6;
                              } else {
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
                        ((j) this).field_a = null;
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
                    if (((j) this).field_f <= ((j) this).field_g) {
                      var1_int = ((j) this).field_g + -((j) this).field_f;
                      break L8;
                    } else {
                      var1_int = -((j) this).field_f + ((j) this).field_d;
                      break L8;
                    }
                  }
                  var2 = ((j) this).field_f;
                  if (var1_int <= 0) {
                    continue L1;
                  } else {
                    try {
                      L9: {
                        ((j) this).field_e.write(((j) this).field_a, var2, var1_int);
                        break L9;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L10: {
                        var3_ref = (IOException) (Object) decompiledCaughtException;
                        ((j) this).field_m = true;
                        break L10;
                      }
                    }
                    ((j) this).field_f = (((j) this).field_f - -var1_int) % ((j) this).field_d;
                    try {
                      L11: {
                        L12: {
                          if (((j) this).field_f != ((j) this).field_g) {
                            break L12;
                          } else {
                            ((j) this).field_e.flush();
                            break L12;
                          }
                        }
                        break L11;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      L13: {
                        var3_ref = (IOException) (Object) decompiledCaughtException;
                        ((j) this).field_m = true;
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
                wp.a((Throwable) (Object) var1_ref, (String) null, 21862);
                break L14;
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
        int var5 = 0;
        int var6 = 0;
        var6 = CrazyCrystals.field_B;
        if (!((j) this).field_k) {
          L0: while (true) {
            if (param1 <= 0) {
              if (param2 == 2034) {
                return;
              } else {
                ((j) this).field_f = -31;
                return;
              }
            } else {
              var5 = ((j) this).field_n.read(param0, param3, param1);
              if (var5 <= 0) {
                throw new EOFException();
              } else {
                param3 = param3 + var5;
                param1 = param1 - var5;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        field_i = null;
        field_h = null;
        if (param0 == 45) {
            return;
        }
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
        ((j) this).field_b = param1;
        ((j) this).field_c = param0;
        ((j) this).field_c.setSoTimeout(30000);
        ((j) this).field_c.setTcpNoDelay(true);
        ((j) this).field_n = ((j) this).field_c.getInputStream();
        ((j) this).field_e = ((j) this).field_c.getOutputStream();
        ((j) this).field_d = param2;
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
