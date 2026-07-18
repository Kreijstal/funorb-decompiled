/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class cb implements Runnable {
    private int field_p;
    static String field_g;
    private boolean field_d;
    private byte[] field_c;
    private int field_l;
    private int field_h;
    static im field_b;
    static fh field_a;
    private eb field_f;
    private OutputStream field_i;
    private InputStream field_m;
    static int field_j;
    private be field_k;
    static int field_e;
    private boolean field_o;
    private java.net.Socket field_n;

    final void a(int param0) {
        InterruptedException var2 = null;
        Object var2_ref = null;
        Throwable var3 = null;
        int var4 = 0;
        Object var5 = null;
        Throwable decompiledCaughtException = null;
        var4 = OrbDefence.field_D ? 1 : 0;
        if (((cb) this).field_d) {
          return;
        } else {
          var2_ref = this;
          synchronized (var2_ref) {
            L0: {
              ((cb) this).field_d = true;
              this.notifyAll();
              break L0;
            }
          }
          if (null != ((cb) this).field_f) {
            L1: while (true) {
              if (((cb) this).field_f.field_a != 0) {
                if (((cb) this).field_f.field_a == 1) {
                  try {
                    L2: {
                      ((Thread) ((cb) this).field_f.field_g).join();
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var2 = (InterruptedException) (Object) decompiledCaughtException;
                    ((cb) this).field_f = null;
                    if (param0 == 1) {
                      return;
                    } else {
                      var5 = null;
                      cb.a(-74, (java.awt.Component) null);
                      return;
                    }
                  }
                  ((cb) this).field_f = null;
                  if (param0 == 1) {
                    return;
                  } else {
                    var5 = null;
                    cb.a(-74, (java.awt.Component) null);
                    return;
                  }
                } else {
                  ((cb) this).field_f = null;
                  if (param0 == 1) {
                    return;
                  } else {
                    var5 = null;
                    cb.a(-74, (java.awt.Component) null);
                    return;
                  }
                }
              } else {
                hb.a(1L, param0 + 120);
                continue L1;
              }
            }
          } else {
            ((cb) this).field_f = null;
            if (param0 == 1) {
              return;
            } else {
              var5 = null;
              cb.a(-74, (java.awt.Component) null);
              return;
            }
          }
        }
    }

    final static void a(int param0, java.awt.Component param1) {
        if (param0 != 5000) {
            return;
        }
        try {
            param1.removeMouseListener((java.awt.event.MouseListener) (Object) nk.field_q);
            param1.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) nk.field_q);
            param1.removeFocusListener((java.awt.event.FocusListener) (Object) nk.field_q);
            db.field_f = 0;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "cb.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
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
            var6 = OrbDefence.field_D ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  var3_ref = this;
                  synchronized (var3_ref) {
                    L2: {
                      L3: {
                        if (((cb) this).field_h == ((cb) this).field_l) {
                          if (!((cb) this).field_d) {
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
                        if (((cb) this).field_h <= ((cb) this).field_l) {
                          var1_int = -((cb) this).field_h + ((cb) this).field_l;
                          break L6;
                        } else {
                          var1_int = ((cb) this).field_p - ((cb) this).field_h;
                          break L6;
                        }
                      }
                      var2 = ((cb) this).field_h;
                      decompiledRegionSelector0 = 1;
                      break L2;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    try {
                      L7: {
                        L8: {
                          if (null == ((cb) this).field_m) {
                            break L8;
                          } else {
                            ((cb) this).field_m.close();
                            break L8;
                          }
                        }
                        L9: {
                          if (null == ((cb) this).field_i) {
                            break L9;
                          } else {
                            ((cb) this).field_i.close();
                            break L9;
                          }
                        }
                        L10: {
                          if (((cb) this).field_n != null) {
                            ((cb) this).field_n.close();
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
                    ((cb) this).field_c = null;
                    break L0;
                  } else {
                    if (var1_int <= 0) {
                      continue L1;
                    } else {
                      try {
                        L12: {
                          ((cb) this).field_i.write(((cb) this).field_c, var2, var1_int);
                          break L12;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          ((cb) this).field_o = true;
                          break L13;
                        }
                      }
                      ((cb) this).field_h = (var1_int + ((cb) this).field_h) % ((cb) this).field_p;
                      try {
                        L14: {
                          L15: {
                            if (((cb) this).field_l == ((cb) this).field_h) {
                              ((cb) this).field_i.flush();
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
                          ((cb) this).field_o = true;
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
                pe.a((byte) -13, (Throwable) (Object) var1_ref, (String) null);
                break L17;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        if (param0 >= -66) {
          cb.a((byte) -75);
          field_a = null;
          field_b = null;
          field_g = null;
          return;
        } else {
          field_a = null;
          field_b = null;
          field_g = null;
          return;
        }
    }

    cb(java.net.Socket param0, be param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(byte param0, byte[] param1, int param2, int param3) throws IOException {
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
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          if (((cb) this).field_d) {
            return;
          } else {
            if (!((cb) this).field_o) {
              L0: {
                if (null != ((cb) this).field_c) {
                  break L0;
                } else {
                  ((cb) this).field_c = new byte[((cb) this).field_p];
                  break L0;
                }
              }
              var5_ref = this;
              synchronized (var5_ref) {
                L1: {
                  L2: {
                    if (param0 == 30) {
                      break L2;
                    } else {
                      ((cb) this).field_m = null;
                      break L2;
                    }
                  }
                  var6 = 0;
                  L3: while (true) {
                    if (param3 <= var6) {
                      L4: {
                        if (((cb) this).field_f != null) {
                          break L4;
                        } else {
                          ((cb) this).field_f = ((cb) this).field_k.a(314572800, 3, (Runnable) this);
                          break L4;
                        }
                      }
                      this.notifyAll();
                      break L1;
                    } else {
                      ((cb) this).field_c[((cb) this).field_l] = param1[param2 + var6];
                      ((cb) this).field_l = (1 + ((cb) this).field_l) % ((cb) this).field_p;
                      if ((-100 + ((cb) this).field_h - -((cb) this).field_p) % ((cb) this).field_p == ((cb) this).field_l) {
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
              ((cb) this).field_o = false;
              throw new IOException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var5;
            stackOut_24_1 = new StringBuilder().append("cb.D(").append(param0).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
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
          throw dd.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final int b(byte param0) throws IOException {
        Object var3 = null;
        if (((cb) this).field_d) {
          return 0;
        } else {
          if (param0 != 101) {
            var3 = null;
            cb.a(45, (java.awt.Component) null);
            return ((cb) this).field_m.available();
          } else {
            return ((cb) this).field_m.available();
          }
        }
    }

    final void b(int param0) throws IOException {
        if (param0 < -54) {
          if (!((cb) this).field_d) {
            if (((cb) this).field_o) {
              ((cb) this).field_o = false;
              throw new IOException();
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          ((cb) this).a(62);
          if (!((cb) this).field_d) {
            if (((cb) this).field_o) {
              ((cb) this).field_o = false;
              throw new IOException();
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final int a(boolean param0) throws IOException {
        if (param0) {
          if (((cb) this).field_d) {
            return 0;
          } else {
            return ((cb) this).field_m.read();
          }
        } else {
          ((cb) this).field_h = 44;
          if (((cb) this).field_d) {
            return 0;
          } else {
            return ((cb) this).field_m.read();
          }
        }
    }

    protected final void finalize() {
        ((cb) this).a(1);
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (!((cb) this).field_d) {
              var5_int = -79 / ((23 - param2) / 35);
              L1: while (true) {
                if (param1 <= 0) {
                  break L0;
                } else {
                  var6 = ((cb) this).field_m.read(param3, param0, param1);
                  if (var6 > 0) {
                    param1 = param1 - var6;
                    param0 = param0 + var6;
                    continue L1;
                  } else {
                    throw new EOFException();
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var5;
            stackOut_9_1 = new StringBuilder().append("cb.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
    }

    private cb(java.net.Socket param0, be param1, int param2) throws IOException {
        ((cb) this).field_h = 0;
        ((cb) this).field_l = 0;
        ((cb) this).field_o = false;
        ((cb) this).field_d = false;
        try {
            ((cb) this).field_k = param1;
            ((cb) this).field_n = param0;
            ((cb) this).field_n.setSoTimeout(30000);
            ((cb) this).field_n.setTcpNoDelay(true);
            ((cb) this).field_m = ((cb) this).field_n.getInputStream();
            ((cb) this).field_i = ((cb) this).field_n.getOutputStream();
            ((cb) this).field_p = param2;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "cb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Achieved";
        field_b = new im();
    }
}
