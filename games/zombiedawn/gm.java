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
        Object var5 = null;
        int var6 = 0;
        Throwable var7 = null;
        int var8 = 0;
        Throwable decompiledCaughtException = null;
        var8 = ZombieDawn.field_J;
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
            var5 = this;
            synchronized (var5) {
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
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        int var5 = 0;
        int var6 = 0;
        var6 = ZombieDawn.field_J;
        if (param3 == 0) {
          if (!((gm) this).field_b) {
            L0: while (true) {
              if ((param1 ^ -1) < -1) {
                var5 = ((gm) this).field_a.read(param2, param0, param1);
                if (var5 <= 0) {
                  throw new EOFException();
                } else {
                  param0 = param0 + var5;
                  param1 = param1 - var5;
                  continue L0;
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        } else {
          ((gm) this).field_c = null;
          if (!((gm) this).field_b) {
            L1: while (true) {
              if ((param1 ^ -1) < -1) {
                var5 = ((gm) this).field_a.read(param2, param0, param1);
                if (var5 <= 0) {
                  throw new EOFException();
                } else {
                  param0 = param0 + var5;
                  param1 = param1 - var5;
                  continue L1;
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
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
        Object var2 = null;
        if (param0 < 72) {
          var2 = null;
          gm.a((rc) null, (byte) -84, 22);
          field_f = null;
          field_h = null;
          return;
        } else {
          field_f = null;
          field_h = null;
          return;
        }
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
            int var1_int = 0;
            IOException var1 = null;
            Exception var1_ref = null;
            int var2 = 0;
            Object var3 = null;
            IOException var3_ref = null;
            int var6 = 0;
            Object var7 = null;
            Throwable decompiledCaughtException = null;
            var6 = ZombieDawn.field_J;
            try {
              L0: {
                L1: while (true) {
                  L2: {
                    var3 = this;
                    if (((gm) this).field_n != ((gm) this).field_j) {
                      break L2;
                    } else {
                      if (((gm) this).field_b) {
                        try {
                          L3: {
                            L4: {
                              if (((gm) this).field_a != null) {
                                ((gm) this).field_a.close();
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                            L5: {
                              if (null == ((gm) this).field_d) {
                                break L5;
                              } else {
                                ((gm) this).field_d.close();
                                break L5;
                              }
                            }
                            L6: {
                              if (((gm) this).field_l == null) {
                                break L6;
                              } else {
                                ((gm) this).field_l.close();
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
                        ((gm) this).field_e = null;
                        break L0;
                      } else {
                        this.wait();
                        break L2;
                      }
                    }
                  }
                  L8: {
                    if (((gm) this).field_n < ((gm) this).field_j) {
                      var1_int = -((gm) this).field_j + ((gm) this).field_g;
                      break L8;
                    } else {
                      var1_int = ((gm) this).field_n + -((gm) this).field_j;
                      break L8;
                    }
                  }
                  var2 = ((gm) this).field_j;
                  if (0 >= var1_int) {
                    continue L1;
                  } else {
                    try {
                      L9: {
                        ((gm) this).field_d.write(((gm) this).field_e, var2, var1_int);
                        break L9;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L10: {
                        var3_ref = (IOException) (Object) decompiledCaughtException;
                        ((gm) this).field_i = true;
                        break L10;
                      }
                    }
                    ((gm) this).field_j = (var1_int + ((gm) this).field_j) % ((gm) this).field_g;
                    try {
                      L11: {
                        L12: {
                          if (((gm) this).field_n == ((gm) this).field_j) {
                            ((gm) this).field_d.flush();
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
                        ((gm) this).field_i = true;
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
                ae.a((Throwable) (Object) var1_ref, 10331, (String) null);
                break L14;
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
        hk.field_F.a(0, (le) (Object) param0);
        rm.a((byte) -92, param2, param0);
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
              if ((((gm) this).field_c.field_f ^ -1) != -1) {
                if (-2 == (((gm) this).field_c.field_f ^ -1)) {
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
        ((gm) this).field_m = param1;
        ((gm) this).field_l = param0;
        ((gm) this).field_l.setSoTimeout(30000);
        ((gm) this).field_l.setTcpNoDelay(true);
        ((gm) this).field_a = ((gm) this).field_l.getInputStream();
        ((gm) this).field_d = ((gm) this).field_l.getOutputStream();
        ((gm) this).field_g = param2;
    }

    final static on a(byte[] param0, int param1) {
        int var2 = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        byte[] var7 = null;
        byte[] var8 = null;
        byte[] var9 = null;
        byte[] var10 = null;
        var6 = ZombieDawn.field_J;
        if (param1 >= -3) {
          return null;
        } else {
          var2 = 0;
          var10 = new byte[param0.length + 24];
          var9 = var10;
          var8 = var9;
          var7 = var8;
          var3 = var7;
          var2 = 0;
          L0: while (true) {
            if (-5 >= (var2 ^ -1)) {
              int incrementValue$4 = var2;
              var2++;
              var4 = md.a(incrementValue$4, param0, 82);
              int incrementValue$5 = var2;
              var2++;
              var5 = md.a(incrementValue$5, param0, 65);
              fb.a(4, var10, (byte) 69, var4);
              fb.a(5, var10, (byte) 61, var5);
              fb.a(6, var10, (byte) 79, var4);
              fb.a(7, var10, (byte) 80, var5);
              fb.a(8, var10, (byte) 56, var4);
              fb.a(9, var10, (byte) -64, var5);
              fb.a(10, var10, (byte) 66, var4);
              fb.a(11, var10, (byte) 74, var5);
              var2 = 6;
              L1: while (true) {
                if (param0.length / 4 <= var2) {
                  return vk.a((byte) -83, var10);
                } else {
                  fb.a(6 + var2, var3, (byte) 42, md.a(var2, param0, 93));
                  var2++;
                  continue L1;
                }
              }
            } else {
              fb.a(var2, var3, (byte) -81, md.a(var2, param0, 70));
              var2++;
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = 65;
        field_f = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
