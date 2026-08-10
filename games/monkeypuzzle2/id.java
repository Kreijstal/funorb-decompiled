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
        this.a((byte) 73);
    }

    final int a(int param0) throws IOException {
        if (param0 != -16840) {
            return 43;
        }
        if (!(!this.field_n)) {
            return 0;
        }
        return this.field_g.read();
    }

    final void a(byte param0) {
        try {
            int var4 = 0;
            var4 = MonkeyPuzzle2.field_F ? 1 : 0;
            if (this.field_n) {
                return;
            }
            synchronized (this) {
                this.field_n = true;
                this.notifyAll();
            }
            if (this.field_d != null) {
                while (this.field_d.field_g == 0) {
                    em.a(1L, false);
                }
                if (1 == this.field_d.field_g) {
                    try {
                        ((Thread) (this.field_d.field_b)).join();
                    } catch (InterruptedException interruptedException) {
                    }
                }
            }
            this.field_d = null;
            if (param0 != 73) {
                this.field_n = true;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(byte param0) throws IOException {
        if (!(!this.field_n)) {
            return;
        }
        if (!(!this.field_i)) {
            this.field_i = false;
            throw new IOException();
        }
        int var2 = 122 / ((-61 - param0) / 56);
    }

    final static String a(Throwable param0, byte param1) throws IOException {
        String var2;
        PrintWriter var4;
        String var5;
        BufferedReader var6;
        String var7;
        String var8;
        int var9;
        int var10;
        String var11;
        int var12;
        int var13;
        dd var14;
        StringWriter var15;
        String var16;
        String var17;
        String var18;
        String var19;
        L0: {
          var13 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (param0 instanceof dd) {
            var14 = (dd) ((Object) param0);
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
        L1: {
          if (param1 == 37) {
            break L1;
          } else {
            field_h = (String) null;
            break L1;
          }
        }
        var15 = new StringWriter();
        var4 = new PrintWriter((Writer) ((Object) var15));
        param0.printStackTrace(var4);
        var4.close();
        var5 = var15.toString();
        var11 = var5;
        var2 = var11;
        var11 = var5;
        var6 = new BufferedReader((Reader) ((Object) new StringReader(var5)));
        var7 = var6.readLine();
        var11 = var7;
        var2 = var11;
        var11 = var7;
        L2: while (true) {
          var8 = var6.readLine();
          var11 = var8;
          var2 = var11;
          var11 = var8;
          if (var8 == null) {
            var2 = var2 + "| " + var7;
            return var2;
          } else {
            L3: {
              var9 = var8.indexOf('(');
              var10 = var8.indexOf(')', 1 + var9);
              if (0 == (var9 ^ -1)) {
                var11 = var8;
                var2 = var11;
                var2 = var11;
                break L3;
              } else {
                var11 = var8.substring(0, var9);
                break L3;
              }
            }
            L4: {
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
              var2 = var19;
              if (var9 == -1) {
                break L4;
              } else {
                if ((var10 ^ -1) != 0) {
                  var12 = var8.indexOf(".java:", var9);
                  if (-1 >= (var12 ^ -1)) {
                    var2 = var19 + var8.substring(5 + var12, var10);
                    break L4;
                  } else {
                    break L4;
                  }
                } else {
                  var2 = var2 + ' ';
                  continue L2;
                }
              }
            }
            var2 = var2 + ' ';
            continue L2;
          }
        }
    }

    id(java.net.Socket param0, md param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(byte[] param0, int param1, byte param2, int param3) throws IOException {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var8 = 0;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (!this.field_n) {
              if (!this.field_i) {
                L1: {
                  if (this.field_c != null) {
                    break L1;
                  } else {
                    this.field_c = new byte[this.field_k];
                    break L1;
                  }
                }
                var5 = this;
                synchronized (var5) {
                  L2: {
                    var6 = 0;
                    L3: while (true) {
                      if (var6 >= param3) {
                        L4: {
                          if (null == this.field_d) {
                            this.field_d = this.field_f.a((Runnable) (this), 3, 0);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        L5: {
                          if (param2 >= 12) {
                            break L5;
                          } else {
                            this.a((byte) 110);
                            break L5;
                          }
                        }
                        this.notifyAll();
                        break L2;
                      } else {
                        this.field_c[this.field_e] = param0[var6 + param1];
                        this.field_e = (this.field_e - -1) % this.field_k;
                        if ((-100 + (this.field_k + this.field_l)) % this.field_k == this.field_e) {
                          throw new IOException();
                        } else {
                          var6++;
                          continue L3;
                        }
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                this.field_i = false;
                throw new IOException();
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var5_ref);

            stackIn_27_1 = new StringBuilder().append("id.F(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L6;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L6;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void b(int param0) {
        field_h = null;
        if (param0 != 1) {
            field_h = (String) null;
        }
    }

    final void a(int param0, boolean param1, byte[] param2, int param3) throws IOException {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (this.field_n) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: while (true) {
                if (0 >= param0) {
                  L2: {
                    if (param1) {
                      break L2;
                    } else {
                      this.a((byte) 64);
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var5_int = this.field_g.read(param2, param3, param0);
                  if (-1 <= (var5_int ^ -1)) {
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
            stackIn_15_0 = (RuntimeException) (var5);

            stackIn_15_1 = new StringBuilder().append("id.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void run() {
        try {
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int var1_int = 0;
            IOException var1 = null;
            Exception var1_ref = null;
            int var2 = 0;
            Object var3 = null;
            IOException var3_ref = null;
            InterruptedException var4 = null;
            int var6 = 0;
            String var7 = null;
            var6 = MonkeyPuzzle2.field_F ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  var3 = this;
                  synchronized (var3) {
                    L2: {
                      L3: {
                        if (this.field_e != this.field_l) {
                          break L3;
                        } else {
                          if (this.field_n) {
                            decompiledRegionSelector0 = 0;
                            break L2;
                          } else {
                            try {
                              L4: {
                                this.wait();
                                break L4;
                              }
                            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                              decompiledCaughtException = decompiledCaughtParameter0;
                              L5: {
                                var4 = (InterruptedException) (Object) decompiledCaughtException;
                                break L5;
                              }
                            }
                            break L3;
                          }
                        }
                      }
                      L6: {
                        var2 = this.field_l;
                        if (this.field_e < this.field_l) {
                          var1_int = this.field_k - this.field_l;
                          break L6;
                        } else {
                          var1_int = this.field_e - this.field_l;
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
                          if (this.field_g == null) {
                            break L8;
                          } else {
                            this.field_g.close();
                            break L8;
                          }
                        }
                        L9: {
                          if (this.field_b == null) {
                            break L9;
                          } else {
                            this.field_b.close();
                            break L9;
                          }
                        }
                        L10: {
                          if (null != this.field_j) {
                            this.field_j.close();
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
                    this.field_c = null;
                    break L0;
                  } else {
                    if (-1 > (var1_int ^ -1)) {
                      try {
                        L12: {
                          this.field_b.write(this.field_c, var2, var1_int);
                          break L12;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3_ref = (IOException) (Object) decompiledCaughtException;
                          this.field_i = true;
                          break L13;
                        }
                      }
                      this.field_l = (this.field_l - -var1_int) % this.field_k;
                      try {
                        L14: {
                          L15: {
                            if (this.field_e != this.field_l) {
                              break L15;
                            } else {
                              this.field_b.flush();
                              break L15;
                            }
                          }
                          break L14;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L16: {
                          var3_ref = (IOException) (Object) decompiledCaughtException;
                          this.field_i = true;
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
                var7 = (String) null;
                kk.a((String) null, (byte) 69, (Throwable) ((Object) var1_ref));
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
        if (this.field_n) {
            return 0;
        }
        return this.field_g.available();
    }

    private id(java.net.Socket param0, md param1, int param2) throws IOException {
        this.field_l = 0;
        this.field_n = false;
        this.field_e = 0;
        this.field_i = false;
        try {
            this.field_j = param0;
            this.field_f = param1;
            this.field_j.setSoTimeout(30000);
            this.field_j.setTcpNoDelay(true);
            this.field_g = this.field_j.getInputStream();
            this.field_b = this.field_j.getOutputStream();
            this.field_k = param2;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "id.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_h = "Type your password again to make sure it's correct";
        field_a = 250;
    }
}
