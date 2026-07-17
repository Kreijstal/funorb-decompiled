/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class id implements Runnable {
    static String field_h;
    private java.net.Socket field_j;
    private OutputStream field_b;
    static int field_a;
    private md field_f;
    private InputStream field_g;
    private ic field_d;
    private int field_l;
    static int field_m;
    private byte[] field_c;
    private int field_e;
    private boolean field_n;
    private boolean field_i;
    private int field_k;

    protected final void finalize() {
        ((id) this).a((byte) 73);
    }

    final int a(int param0) throws IOException {
        if (param0 != -16840) {
            return 43;
        }
        if (!(!((id) this).field_n)) {
            return 0;
        }
        return ((id) this).field_g.read();
    }

    final void a(byte param0) {
        InterruptedException interruptedException = null;
        Object var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (!((id) this).field_n) {
          var2 = this;
          synchronized (var2) {
            L0: {
              ((id) this).field_n = true;
              this.notifyAll();
              break L0;
            }
          }
          L1: {
            if (((id) this).field_d == null) {
              break L1;
            } else {
              L2: while (true) {
                if (((id) this).field_d.field_g != 0) {
                  if (1 != ((id) this).field_d.field_g) {
                    break L1;
                  } else {
                    try {
                      L3: {
                        ((Thread) ((id) this).field_d.field_b).join();
                        break L3;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L4: {
                        interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                        break L4;
                      }
                    }
                    break L1;
                  }
                } else {
                  em.a(1L, false);
                  continue L2;
                }
              }
            }
          }
          L5: {
            ((id) this).field_d = null;
            if (param0 == 73) {
              break L5;
            } else {
              ((id) this).field_n = true;
              break L5;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void b(byte param0) throws IOException {
        if (!(!((id) this).field_n)) {
            return;
        }
        if (!(!((id) this).field_i)) {
            ((id) this).field_i = false;
            throw new IOException();
        }
        int var2 = 122 / ((-61 - param0) / 56);
    }

    final static String a(Throwable param0, byte param1) throws IOException {
        String var2 = null;
        PrintWriter var4 = null;
        String var5 = null;
        BufferedReader var6 = null;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        dd var14 = null;
        StringWriter var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        L0: {
          var13 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (param0 instanceof dd) {
            var14 = (dd) (Object) param0;
            param0 = var14.field_b;
            var2 = var14.field_c + " | ";
            var11 = var2;
            var2 = var11;
            var11 = var2;
            break L0;
          } else {
            var2 = "";
            break L0;
          }
        }
        var15 = new StringWriter();
        var4 = new PrintWriter((Writer) (Object) var15);
        param0.printStackTrace(var4);
        var4.close();
        var5 = var15.toString();
        var11 = var5;
        var2 = var11;
        var11 = var5;
        var6 = new BufferedReader((Reader) (Object) new StringReader(var5));
        var7 = var6.readLine();
        var11 = var7;
        var2 = var11;
        var11 = var7;
        L1: while (true) {
          var8 = var6.readLine();
          var11 = var8;
          var2 = var11;
          var11 = var8;
          if (var8 == null) {
            var2 = var2 + "| " + var7;
            return var2;
          } else {
            L2: {
              var9 = var8.indexOf('(');
              var10 = var8.indexOf(')', 1 + var9);
              if (var9 == -1) {
                var11 = var8;
                var2 = var11;
                var2 = var11;
                break L2;
              } else {
                var11 = var8.substring(0, var9);
                break L2;
              }
            }
            L3: {
              var16 = var11.trim();
              var2 = var16;
              var2 = var16;
              var17 = var16.substring(1 + var16.lastIndexOf(' '));
              var2 = var17;
              var2 = var17;
              var18 = var17.substring(var17.lastIndexOf('\t') + 1);
              var2 = var18;
              var2 = var18;
              var19 = var2 + var18;
              var2 = var19;
              var2 = var19;
              if (var9 == -1) {
                break L3;
              } else {
                if (var10 != -1) {
                  var12 = var8.indexOf(".java:", var9);
                  if (var12 >= 0) {
                    var2 = var19 + var8.substring(5 + var12, var10);
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  var2 = var2 + 32;
                  continue L1;
                }
              }
            }
            var2 = var2 + 32;
            continue L1;
          }
        }
    }

    id(java.net.Socket param0, md param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(byte[] param0, int param1, byte param2, int param3) throws IOException {
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
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (!((id) this).field_n) {
              if (!((id) this).field_i) {
                L1: {
                  if (((id) this).field_c != null) {
                    break L1;
                  } else {
                    ((id) this).field_c = new byte[((id) this).field_k];
                    break L1;
                  }
                }
                var5_ref = this;
                synchronized (var5_ref) {
                  L2: {
                    var6 = 0;
                    L3: while (true) {
                      if (var6 >= param3) {
                        L4: {
                          if (null == ((id) this).field_d) {
                            ((id) this).field_d = ((id) this).field_f.a((Runnable) this, 3, 0);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        L5: {
                          if (param2 >= 12) {
                            break L5;
                          } else {
                            ((id) this).a((byte) 110);
                            break L5;
                          }
                        }
                        this.notifyAll();
                        break L2;
                      } else {
                        ((id) this).field_c[((id) this).field_e] = param0[var6 + param1];
                        ((id) this).field_e = (((id) this).field_e - -1) % ((id) this).field_k;
                        if ((-100 + (((id) this).field_k + ((id) this).field_l)) % ((id) this).field_k == ((id) this).field_e) {
                          throw new IOException();
                        } else {
                          var6++;
                          continue L3;
                        }
                      }
                    }
                  }
                }
                break L0;
              } else {
                ((id) this).field_i = false;
                throw new IOException();
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var5;
            stackOut_24_1 = new StringBuilder().append("id.F(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L6;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L6;
            }
          }
          throw la.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    public static void b(int param0) {
        field_h = null;
    }

    final void a(int param0, boolean param1, byte[] param2, int param3) throws IOException {
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
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (((id) this).field_n) {
              return;
            } else {
              L1: while (true) {
                if (0 >= param0) {
                  L2: {
                    if (param1) {
                      break L2;
                    } else {
                      ((id) this).a((byte) 64);
                      break L2;
                    }
                  }
                  break L0;
                } else {
                  var5_int = ((id) this).field_g.read(param2, param3, param0);
                  if (var5_int <= 0) {
                    throw new EOFException();
                  } else {
                    param0 = param0 - var5_int;
                    param3 = param3 + var5_int;
                    continue L1;
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
            stackOut_12_1 = new StringBuilder().append("id.E(").append(param0).append(44).append(param1).append(44);
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
          throw la.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param3 + 41);
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
            var6 = MonkeyPuzzle2.field_F ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  var3_ref = this;
                  synchronized (var3_ref) {
                    L2: {
                      L3: {
                        if (((id) this).field_e != ((id) this).field_l) {
                          break L3;
                        } else {
                          if (((id) this).field_n) {
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
                        var2 = ((id) this).field_l;
                        if (((id) this).field_e < ((id) this).field_l) {
                          var1_int = ((id) this).field_k - ((id) this).field_l;
                          break L6;
                        } else {
                          var1_int = ((id) this).field_e - ((id) this).field_l;
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
                          if (((id) this).field_g == null) {
                            break L8;
                          } else {
                            ((id) this).field_g.close();
                            break L8;
                          }
                        }
                        L9: {
                          if (((id) this).field_b == null) {
                            break L9;
                          } else {
                            ((id) this).field_b.close();
                            break L9;
                          }
                        }
                        L10: {
                          if (null != ((id) this).field_j) {
                            ((id) this).field_j.close();
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
                    ((id) this).field_c = null;
                    break L0;
                  } else {
                    if (var1_int > 0) {
                      try {
                        L12: {
                          ((id) this).field_b.write(((id) this).field_c, var2, var1_int);
                          break L12;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          ((id) this).field_i = true;
                          break L13;
                        }
                      }
                      ((id) this).field_l = (((id) this).field_l - -var1_int) % ((id) this).field_k;
                      try {
                        L14: {
                          L15: {
                            if (((id) this).field_e != ((id) this).field_l) {
                              break L15;
                            } else {
                              ((id) this).field_b.flush();
                              break L15;
                            }
                          }
                          break L14;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L16: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          ((id) this).field_i = true;
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
                kk.a((String) null, (byte) 69, (Throwable) (Object) var1_ref);
                break L17;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int c(int param0) throws IOException {
        int var2 = -80 % ((param0 - -42) / 38);
        if (((id) this).field_n) {
            return 0;
        }
        return ((id) this).field_g.available();
    }

    private id(java.net.Socket param0, md param1, int param2) throws IOException {
        ((id) this).field_l = 0;
        ((id) this).field_n = false;
        ((id) this).field_e = 0;
        ((id) this).field_i = false;
        try {
            ((id) this).field_j = param0;
            ((id) this).field_f = param1;
            ((id) this).field_j.setSoTimeout(30000);
            ((id) this).field_j.setTcpNoDelay(true);
            ((id) this).field_g = ((id) this).field_j.getInputStream();
            ((id) this).field_b = ((id) this).field_j.getOutputStream();
            ((id) this).field_k = param2;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "id.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Type your password again to make sure it's correct";
        field_a = 250;
    }
}
