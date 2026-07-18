/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ba implements Runnable {
    private int field_k;
    static int[] field_h;
    private cb field_m;
    private int field_e;
    private int field_b;
    private byte[] field_d;
    static int field_c;
    private InputStream field_g;
    private boolean field_f;
    private OutputStream field_a;
    private java.net.Socket field_j;
    private d field_l;
    private boolean field_i;

    protected final void finalize() {
        ((ba) this).b(-124);
    }

    final void b(int param0) {
        Object var2 = null;
        InterruptedException var2_ref = null;
        Throwable var3 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        L0: {
          if (param0 < -117) {
            break L0;
          } else {
            ((ba) this).run();
            break L0;
          }
        }
        if (((ba) this).field_f) {
          return;
        } else {
          var2 = this;
          synchronized (var2) {
            L1: {
              ((ba) this).field_f = true;
              this.notifyAll();
              break L1;
            }
          }
          if (((ba) this).field_m != null) {
            L2: while (true) {
              if (0 != ((ba) this).field_m.field_a) {
                L3: {
                  if (1 != ((ba) this).field_m.field_a) {
                    break L3;
                  } else {
                    try {
                      L4: {
                        ((Thread) ((ba) this).field_m.field_b).join();
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
                      ((ba) this).field_m = null;
                      return;
                    } else {
                      break L3;
                    }
                  }
                }
                ((ba) this).field_m = null;
                return;
              } else {
                bc.a(0, 1L);
                continue L2;
              }
            }
          } else {
            ((ba) this).field_m = null;
            return;
          }
        }
    }

    final void d(int param0) throws IOException {
        if (((ba) this).field_f) {
          return;
        } else {
          if (param0 < -79) {
            if (((ba) this).field_i) {
              ((ba) this).field_i = false;
              throw new IOException();
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final int a(byte param0) throws IOException {
        if (param0 > 71) {
          if (((ba) this).field_f) {
            return 0;
          } else {
            return ((ba) this).field_g.available();
          }
        } else {
          ((ba) this).field_g = null;
          if (((ba) this).field_f) {
            return 0;
          } else {
            return ((ba) this).field_g.available();
          }
        }
    }

    final static cj a(int param0) {
        return (cj) (Object) new cm();
    }

    final void a(byte[] param0, byte param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (param1 == -97) {
              if (!((ba) this).field_f) {
                L1: while (true) {
                  if (param3 <= 0) {
                    break L0;
                  } else {
                    var5_int = ((ba) this).field_g.read(param0, param2, param3);
                    if (0 >= var5_int) {
                      throw new EOFException();
                    } else {
                      param3 = param3 - var5_int;
                      param2 = param2 + var5_int;
                      continue L1;
                    }
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("ba.B(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        RuntimeException var5 = null;
        Object var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
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
        try {
          if (((ba) this).field_f) {
            return;
          } else {
            if (((ba) this).field_i) {
              ((ba) this).field_i = false;
              throw new IOException();
            } else {
              L0: {
                if (null != ((ba) this).field_d) {
                  break L0;
                } else {
                  ((ba) this).field_d = new byte[((ba) this).field_b];
                  break L0;
                }
              }
              var5_ref = this;
              synchronized (var5_ref) {
                L1: {
                  var6 = 0;
                  L2: while (true) {
                    if (param2 <= var6) {
                      L3: {
                        if (param0 == 100) {
                          break L3;
                        } else {
                          ((ba) this).field_a = null;
                          break L3;
                        }
                      }
                      L4: {
                        if (null != ((ba) this).field_m) {
                          break L4;
                        } else {
                          ((ba) this).field_m = ((ba) this).field_l.a((Runnable) this, 0, 3);
                          break L4;
                        }
                      }
                      this.notifyAll();
                      break L1;
                    } else {
                      ((ba) this).field_d[((ba) this).field_e] = param3[param1 + var6];
                      ((ba) this).field_e = (((ba) this).field_e - -1) % ((ba) this).field_b;
                      if (((ba) this).field_e == (((ba) this).field_b + (((ba) this).field_k - 100)) % ((ba) this).field_b) {
                        throw new IOException();
                      } else {
                        var6++;
                        continue L2;
                      }
                    }
                  }
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var5;
            stackOut_24_1 = new StringBuilder().append("ba.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
          throw t.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ')');
        }
    }

    final int c(int param0) throws IOException {
        if (!(!((ba) this).field_f)) {
            return 0;
        }
        if (param0 != -17422) {
            return -104;
        }
        return ((ba) this).field_g.read();
    }

    public static void e(int param0) {
        field_h = null;
    }

    ba(java.net.Socket param0, d param1) throws IOException {
        this(param0, param1, 5000);
    }

    public final void run() {
        try {
            int var1_int = 0;
            IOException var1 = null;
            Exception var1_ref = null;
            int var2 = 0;
            Object var3 = null;
            IOException var3_ref = null;
            InterruptedException var4 = null;
            Throwable var5 = null;
            Object var6 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: while (true) {
                  var3 = this;
                  synchronized (var3) {
                    L2: {
                      L3: {
                        if (((ba) this).field_k == ((ba) this).field_e) {
                          if (!((ba) this).field_f) {
                            {
                              L4: {
                                this.wait();
                                break L4;
                              }
                            }
                            break L3;
                          } else {
                            decompiledRegionSelector0 = 0;
                            break L2;
                          }
                        } else {
                          break L3;
                        }
                      }
                      L6: {
                        var2 = ((ba) this).field_k;
                        if (((ba) this).field_e < ((ba) this).field_k) {
                          var1_int = ((ba) this).field_b - ((ba) this).field_k;
                          break L6;
                        } else {
                          var1_int = ((ba) this).field_e - ((ba) this).field_k;
                          break L6;
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L2;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    try {
                      L7: {
                        L8: {
                          if (((ba) this).field_g == null) {
                            break L8;
                          } else {
                            ((ba) this).field_g.close();
                            break L8;
                          }
                        }
                        L9: {
                          if (((ba) this).field_a != null) {
                            ((ba) this).field_a.close();
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: {
                          if (((ba) this).field_j != null) {
                            ((ba) this).field_j.close();
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
                    ((ba) this).field_d = null;
                    break L0;
                  } else {
                    if (var1_int <= 0) {
                      continue L1;
                    } else {
                      try {
                        L12: {
                          ((ba) this).field_a.write(((ba) this).field_d, var2, var1_int);
                          break L12;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3_ref = (IOException) (Object) decompiledCaughtException;
                          ((ba) this).field_i = true;
                          break L13;
                        }
                      }
                      ((ba) this).field_k = (var1_int + ((ba) this).field_k) % ((ba) this).field_b;
                      try {
                        L14: {
                          L15: {
                            if (((ba) this).field_e == ((ba) this).field_k) {
                              ((ba) this).field_a.flush();
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
                          var3_ref = (IOException) (Object) decompiledCaughtException;
                          ((ba) this).field_i = true;
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
                var6 = null;
                gi.a((Throwable) (Object) var1_ref, (String) null, (byte) 125);
                break L17;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            if (param0 != 116) {
                Object var3 = null;
                ba.a((byte) 45, (java.applet.Applet) null);
            }
            va.a("", param1, -1);
            h.a(param1, false);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "ba.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private ba(java.net.Socket param0, d param1, int param2) throws IOException {
        ((ba) this).field_f = false;
        ((ba) this).field_e = 0;
        ((ba) this).field_k = 0;
        ((ba) this).field_i = false;
        try {
            ((ba) this).field_l = param1;
            ((ba) this).field_j = param0;
            ((ba) this).field_j.setSoTimeout(30000);
            ((ba) this).field_j.setTcpNoDelay(true);
            ((ba) this).field_g = ((ba) this).field_j.getInputStream();
            ((ba) this).field_a = ((ba) this).field_j.getOutputStream();
            ((ba) this).field_b = param2;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "ba.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new int[8192];
        field_c = 0;
    }
}
