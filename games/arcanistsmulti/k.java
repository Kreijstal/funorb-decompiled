/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class k implements Runnable {
    private int field_s;
    private dl field_h;
    static kc field_d;
    static ch field_q;
    private boolean field_g;
    static String field_f;
    private boolean field_l;
    private byte[] field_b;
    private InputStream field_i;
    private java.net.Socket field_e;
    private int field_n;
    private OutputStream field_r;
    private og field_a;
    static String field_p;
    private int field_j;
    static String[] field_k;
    static volatile boolean field_c;
    static int[] field_m;
    static int field_o;

    final void a(boolean param0) throws IOException {
        if (param0) {
            return;
        }
        if (((k) this).field_g) {
            return;
        }
        if (!(!((k) this).field_l)) {
            ((k) this).field_l = false;
            throw new IOException();
        }
    }

    final static void a(le param0, boolean param1) {
        try {
            if (!param1) {
                Object var3 = null;
                k.a((le) null, false);
            }
            rk.field_O = param0.field_V;
            qn.field_ob = param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "k.G(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public static void c(int param0) {
        field_q = null;
        field_k = null;
        field_f = null;
        field_p = null;
        field_d = null;
        field_m = null;
    }

    final void a(byte[] param0, byte param1, int param2, int param3) throws IOException {
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
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (!((k) this).field_g) {
              L1: while (true) {
                if (param3 <= 0) {
                  L2: {
                    if (param1 < -122) {
                      break L2;
                    } else {
                      ((k) this).field_a = null;
                      break L2;
                    }
                  }
                  break L0;
                } else {
                  var5_int = ((k) this).field_i.read(param0, param2, param3);
                  if (var5_int <= 0) {
                    throw new EOFException();
                  } else {
                    param2 = param2 + var5_int;
                    param3 = param3 - var5_int;
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
          L3: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("k.C(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
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
          throw aa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void a(int param0, int param1, byte param2, byte[] param3) throws IOException {
        RuntimeException var5 = null;
        Object var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int var8 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (!((k) this).field_g) {
              if (((k) this).field_l) {
                ((k) this).field_l = false;
                throw new IOException();
              } else {
                L1: {
                  if (((k) this).field_b == null) {
                    ((k) this).field_b = new byte[((k) this).field_n];
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
                      if (var6 >= param0) {
                        L4: {
                          if (((k) this).field_a != null) {
                            break L4;
                          } else {
                            ((k) this).field_a = ((k) this).field_h.a(124, 3, (Runnable) this);
                            break L4;
                          }
                        }
                        this.notifyAll();
                        break L2;
                      } else {
                        ((k) this).field_b[((k) this).field_s] = param3[param1 + var6];
                        ((k) this).field_s = (1 + ((k) this).field_s) % ((k) this).field_n;
                        if (((k) this).field_s == (((k) this).field_j - (-((k) this).field_n - -100)) % ((k) this).field_n) {
                          throw new IOException();
                        } else {
                          var6++;
                          continue L3;
                        }
                      }
                    }
                  }
                }
                L5: {
                  if (param2 > 114) {
                    break L5;
                  } else {
                    ((k) this).field_r = null;
                    break L5;
                  }
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var5;
            stackOut_25_1 = new StringBuilder().append("k.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param3 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L6;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L6;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 41);
        }
    }

    final void d(int param0) {
        InterruptedException interruptedException = null;
        Object var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        L0: {
          var4 = ArcanistsMulti.field_G ? 1 : 0;
          if (param0 == -23482) {
            break L0;
          } else {
            field_f = null;
            break L0;
          }
        }
        if (!((k) this).field_g) {
          var2 = this;
          synchronized (var2) {
            L1: {
              ((k) this).field_g = true;
              this.notifyAll();
              break L1;
            }
          }
          L2: {
            if (null == ((k) this).field_a) {
              break L2;
            } else {
              L3: while (true) {
                if (((k) this).field_a.field_e != 0) {
                  if (((k) this).field_a.field_e == 1) {
                    try {
                      L4: {
                        ((Thread) ((k) this).field_a.field_g).join();
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
                  ao.a(1L, 1);
                  continue L3;
                }
              }
            }
          }
          ((k) this).field_a = null;
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
            var6 = ArcanistsMulti.field_G ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  var3_ref = this;
                  synchronized (var3_ref) {
                    L2: {
                      L3: {
                        if (((k) this).field_j != ((k) this).field_s) {
                          break L3;
                        } else {
                          if (((k) this).field_g) {
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
                        var2 = ((k) this).field_j;
                        if (((k) this).field_j <= ((k) this).field_s) {
                          var1_int = -((k) this).field_j + ((k) this).field_s;
                          break L6;
                        } else {
                          var1_int = ((k) this).field_n - ((k) this).field_j;
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
                          if (((k) this).field_i == null) {
                            break L8;
                          } else {
                            ((k) this).field_i.close();
                            break L8;
                          }
                        }
                        L9: {
                          if (((k) this).field_r == null) {
                            break L9;
                          } else {
                            ((k) this).field_r.close();
                            break L9;
                          }
                        }
                        L10: {
                          if (null != ((k) this).field_e) {
                            ((k) this).field_e.close();
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
                    ((k) this).field_b = null;
                    break L0;
                  } else {
                    if (var1_int > 0) {
                      try {
                        L12: {
                          ((k) this).field_r.write(((k) this).field_b, var2, var1_int);
                          break L12;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          ((k) this).field_l = true;
                          break L13;
                        }
                      }
                      ((k) this).field_j = (var1_int + ((k) this).field_j) % ((k) this).field_n;
                      try {
                        L14: {
                          L15: {
                            if (((k) this).field_s == ((k) this).field_j) {
                              ((k) this).field_r.flush();
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
                          ((k) this).field_l = true;
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
                jh.a((Throwable) (Object) var1_ref, (String) null, (byte) 20);
                break L17;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    k(java.net.Socket param0, dl param1) throws IOException {
        this(param0, param1, 5000);
    }

    final static String a(int param0) {
        if (!(in.field_Gb != sk.field_a)) {
            return on.field_d;
        }
        if (param0 != 0) {
            field_k = null;
        }
        if (!(wn.field_z.a((byte) -106))) {
            return wn.field_z.a(true);
        }
        if (hb.field_Gb == sk.field_a) {
            return wn.field_z.a(true);
        }
        return ge.field_g;
    }

    protected final void finalize() {
        ((k) this).d(-23482);
    }

    final int b(int param0) throws IOException {
        if (param0 != 0) {
            ((k) this).field_s = -21;
        }
        if (((k) this).field_g) {
            return 0;
        }
        return ((k) this).field_i.available();
    }

    final int a(byte param0) throws IOException {
        if (((k) this).field_g) {
            return 0;
        }
        if (param0 != 120) {
            ((k) this).d(-9);
        }
        return ((k) this).field_i.read();
    }

    private k(java.net.Socket param0, dl param1, int param2) throws IOException {
        ((k) this).field_s = 0;
        ((k) this).field_l = false;
        ((k) this).field_g = false;
        ((k) this).field_j = 0;
        try {
            ((k) this).field_e = param0;
            ((k) this).field_h = param1;
            ((k) this).field_e.setSoTimeout(30000);
            ((k) this).field_e.setTcpNoDelay(true);
            ((k) this).field_i = ((k) this).field_e.getInputStream();
            ((k) this).field_r = ((k) this).field_e.getOutputStream();
            ((k) this).field_n = param2;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "k.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "<%0> is not on your ignore list.";
        field_p = "You";
        field_q = new ch(3);
        field_k = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_m = new int[8192];
        field_o = 0;
        field_c = true;
    }
}
