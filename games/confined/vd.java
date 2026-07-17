/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vd implements Runnable {
    private byte[] field_m;
    static si field_c;
    private int field_g;
    private int field_b;
    private int field_k;
    private df field_i;
    private boolean field_f;
    private bc field_h;
    private OutputStream field_d;
    private boolean field_a;
    private InputStream field_j;
    private java.net.Socket field_e;
    static String field_l;

    public static void c(int param0) {
        field_c = null;
        field_l = null;
    }

    protected final void finalize() {
        ((vd) this).a(1);
    }

    final int a(byte param0) throws IOException {
        if (!((vd) this).field_f) {
          if (param0 != -5) {
            ((vd) this).field_d = null;
            return ((vd) this).field_j.read();
          } else {
            return ((vd) this).field_j.read();
          }
        } else {
          return 0;
        }
    }

    final int c(byte param0) throws IOException {
        if (!(!((vd) this).field_f)) {
            return 0;
        }
        int var2 = -60 / ((-11 - param0) / 39);
        return ((vd) this).field_j.available();
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
            var6 = Confined.field_J ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  var3_ref = this;
                  synchronized (var3_ref) {
                    L2: {
                      L3: {
                        if (((vd) this).field_b != ((vd) this).field_k) {
                          break L3;
                        } else {
                          if (!((vd) this).field_f) {
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
                        }
                      }
                      L6: {
                        if (((vd) this).field_k > ((vd) this).field_b) {
                          var1_int = ((vd) this).field_g - ((vd) this).field_k;
                          break L6;
                        } else {
                          var1_int = -((vd) this).field_k + ((vd) this).field_b;
                          break L6;
                        }
                      }
                      var2 = ((vd) this).field_k;
                      decompiledRegionSelector0 = 1;
                      break L2;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    try {
                      L7: {
                        L8: {
                          if (((vd) this).field_j != null) {
                            ((vd) this).field_j.close();
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          if (((vd) this).field_d != null) {
                            ((vd) this).field_d.close();
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: {
                          if (null == ((vd) this).field_e) {
                            break L10;
                          } else {
                            ((vd) this).field_e.close();
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
                    ((vd) this).field_m = null;
                    break L0;
                  } else {
                    if (var1_int > 0) {
                      try {
                        L12: {
                          ((vd) this).field_d.write(((vd) this).field_m, var2, var1_int);
                          break L12;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          ((vd) this).field_a = true;
                          break L13;
                        }
                      }
                      ((vd) this).field_k = (var1_int + ((vd) this).field_k) % ((vd) this).field_g;
                      try {
                        L14: {
                          L15: {
                            if (((vd) this).field_b != ((vd) this).field_k) {
                              break L15;
                            } else {
                              ((vd) this).field_d.flush();
                              break L15;
                            }
                          }
                          break L14;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L16: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          ((vd) this).field_a = true;
                          break L16;
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
              L17: {
                var1_ref = (Exception) (Object) decompiledCaughtException;
                var7 = null;
                mb.a((String) null, true, (Throwable) (Object) var1_ref);
                break L17;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    vd(java.net.Socket param0, df param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(int param0, boolean param1, byte[] param2, int param3) throws IOException {
        RuntimeException var5 = null;
        Object var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int var8 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var8 = Confined.field_J ? 1 : 0;
        try {
          if (((vd) this).field_f) {
            return;
          } else {
            if (!((vd) this).field_a) {
              L0: {
                if (null == ((vd) this).field_m) {
                  ((vd) this).field_m = new byte[((vd) this).field_g];
                  break L0;
                } else {
                  break L0;
                }
              }
              var5_ref = this;
              synchronized (var5_ref) {
                L1: {
                  var6 = 0;
                  L2: while (true) {
                    if (param0 <= var6) {
                      L3: {
                        if (null == ((vd) this).field_h) {
                          ((vd) this).field_h = ((vd) this).field_i.a((byte) 48, (Runnable) this, 3);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      if (!param1) {
                        this.notifyAll();
                        break L1;
                      } else {
                        return;
                      }
                    } else {
                      ((vd) this).field_m[((vd) this).field_b] = param2[var6 + param3];
                      ((vd) this).field_b = (((vd) this).field_b - -1) % ((vd) this).field_g;
                      if (((vd) this).field_b == (-100 + ((vd) this).field_k + ((vd) this).field_g) % ((vd) this).field_g) {
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
            } else {
              ((vd) this).field_a = false;
              throw new IOException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var5;
            stackOut_27_1 = new StringBuilder().append("vd.C(").append(param0).append(44).append(param1).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param2 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L4;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L4;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + param3 + 41);
        }
    }

    final static String d(int param0) {
        String var1 = "";
        if (!(null == om.field_p)) {
            var1 = om.field_p.j(-102);
        }
        if (var1.length() == 0) {
            var1 = di.a(true);
        }
        if (var1.length() == 0) {
            var1 = an.field_o;
        }
        return var1;
    }

    final void a(int param0) {
        InterruptedException var2 = null;
        Object var2_ref = null;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = Confined.field_J ? 1 : 0;
        if (!((vd) this).field_f) {
          var2_ref = this;
          synchronized (var2_ref) {
            L0: {
              ((vd) this).field_f = true;
              this.notifyAll();
              break L0;
            }
          }
          if (((vd) this).field_h != null) {
            L1: while (true) {
              if (((vd) this).field_h.field_g != 0) {
                if (((vd) this).field_h.field_g == 1) {
                  try {
                    L2: {
                      ((Thread) ((vd) this).field_h.field_f).join();
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var2 = (InterruptedException) (Object) decompiledCaughtException;
                    ((vd) this).field_h = null;
                    if (param0 == 1) {
                      return;
                    } else {
                      ((vd) this).field_k = -52;
                      return;
                    }
                  }
                  ((vd) this).field_h = null;
                  if (param0 == 1) {
                    return;
                  } else {
                    ((vd) this).field_k = -52;
                    return;
                  }
                } else {
                  ((vd) this).field_h = null;
                  if (param0 == 1) {
                    return;
                  } else {
                    ((vd) this).field_k = -52;
                    return;
                  }
                }
              } else {
                jd.a(1, 1L);
                continue L1;
              }
            }
          } else {
            ((vd) this).field_h = null;
            if (param0 == 1) {
              return;
            } else {
              ((vd) this).field_k = -52;
              return;
            }
          }
        } else {
          return;
        }
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
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
        var7 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var5_int = -108 % ((param1 - -19) / 46);
            if (!((vd) this).field_f) {
              L1: while (true) {
                if (param2 <= 0) {
                  break L0;
                } else {
                  var6 = ((vd) this).field_j.read(param0, param3, param2);
                  if (var6 <= 0) {
                    throw new EOFException();
                  } else {
                    param3 = param3 + var6;
                    param2 = param2 - var6;
                    continue L1;
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
            stackOut_9_1 = new StringBuilder().append("vd.I(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
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
          throw sd.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void b(int param0) throws IOException {
        int var2 = 0;
        if (!((vd) this).field_f) {
          var2 = -78 / ((16 - param0) / 55);
          if (((vd) this).field_a) {
            ((vd) this).field_a = false;
            throw new IOException();
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static void b(byte param0) {
        int var1 = 0;
        Object var2 = null;
        Throwable var3 = null;
        Throwable decompiledCaughtException = null;
        var1 = 0;
        if (tf.field_a != null) {
          var2 = (Object) (Object) tf.field_a;
          synchronized (var2) {
            L0: {
              tf.field_a = null;
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    private vd(java.net.Socket param0, df param1, int param2) throws IOException {
        ((vd) this).field_f = false;
        ((vd) this).field_b = 0;
        ((vd) this).field_k = 0;
        ((vd) this).field_a = false;
        try {
            ((vd) this).field_i = param1;
            ((vd) this).field_e = param0;
            ((vd) this).field_e.setSoTimeout(30000);
            ((vd) this).field_e.setTcpNoDelay(true);
            ((vd) this).field_j = ((vd) this).field_e.getInputStream();
            ((vd) this).field_d = ((vd) this).field_e.getOutputStream();
            ((vd) this).field_g = param2;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "vd.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new si(0);
        field_l = "Try the arrow keys.";
    }
}
