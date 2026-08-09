/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vf implements Runnable {
    private int field_f;
    static String[] field_l;
    private InputStream field_g;
    private int field_h;
    private boolean field_i;
    private OutputStream field_j;
    private boolean field_k;
    private en field_a;
    private rk field_e;
    private int field_c;
    private byte[] field_b;
    private java.net.Socket field_d;

    protected final void finalize() {
        this.a(1);
    }

    public static void c(byte param0) {
        field_l = null;
        if (param0 <= -123) {
            return;
        }
        field_l = (String[]) null;
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var8 = 0;
        var8 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (this.field_k) {
              break L0;
            } else {
              if (this.field_i) {
                this.field_i = false;
                throw new IOException();
              } else {
                L1: {
                  if (null != this.field_b) {
                    break L1;
                  } else {
                    this.field_b = new byte[this.field_c];
                    break L1;
                  }
                }
                var5 = this;
                synchronized (var5) {
                  L2: {
                    var6 = 0;
                    L3: while (true) {
                      if (param0 <= var6) {
                        L4: {
                          if (null == this.field_a) {
                            this.field_a = this.field_e.a(3, 1048576, (Runnable) (this));
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        this.notifyAll();
                        var6 = 44 / ((param2 - -35) / 56);
                        break L2;
                      } else {
                        this.field_b[this.field_h] = param3[var6 + param1];
                        this.field_h = (this.field_h - -1) % this.field_c;
                        if ((this.field_h ^ -1) != ((this.field_f + this.field_c + -100) % this.field_c ^ -1)) {
                          var6++;
                          continue L3;
                        } else {
                          throw new IOException();
                        }
                      }
                    }
                  }
                }
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var5_ref);

            stackIn_25_1 = new StringBuilder().append("vf.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L5;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L5;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
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
            var6 = AceOfSkies.field_G ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  var3 = this;
                  synchronized (var3) {
                    L2: {
                      L3: {
                        if (this.field_f != this.field_h) {
                          break L3;
                        } else {
                          if (!this.field_k) {
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
                          } else {
                            decompiledRegionSelector0 = 0;
                            break L2;
                          }
                        }
                      }
                      L6: {
                        if (this.field_f <= this.field_h) {
                          var1_int = -this.field_f + this.field_h;
                          break L6;
                        } else {
                          var1_int = this.field_c + -this.field_f;
                          break L6;
                        }
                      }
                      var2 = this.field_f;
                      decompiledRegionSelector0 = 1;
                      break L2;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    try {
                      L7: {
                        L8: {
                          if (null == this.field_g) {
                            break L8;
                          } else {
                            this.field_g.close();
                            break L8;
                          }
                        }
                        L9: {
                          if (this.field_j == null) {
                            break L9;
                          } else {
                            this.field_j.close();
                            break L9;
                          }
                        }
                        L10: {
                          if (this.field_d != null) {
                            this.field_d.close();
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
                    this.field_b = null;
                    break L0;
                  } else {
                    if (-1 > (var1_int ^ -1)) {
                      try {
                        L12: {
                          this.field_j.write(this.field_b, var2, var1_int);
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
                      this.field_f = (var1_int + this.field_f) % this.field_c;
                      try {
                        L14: {
                          L15: {
                            if (this.field_h != this.field_f) {
                              break L15;
                            } else {
                              this.field_j.flush();
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
                v.a((String) null, (byte) -52, (Throwable) ((Object) var1_ref));
                break L17;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(long param0, int param1) {
        StringBuilder discarded$1 = null;
        int var3;
        long var4;
        StringBuilder var6;
        long var7;
        int var9;
        int var10;
        int var11;
        var11 = AceOfSkies.field_G ? 1 : 0;
        if (0L < param0) {
          if (-6582952005840035282L < (param0 ^ -1L)) {
            if (-1L != (param0 % 37L ^ -1L)) {
              if (param1 != 28304) {
                return (String) null;
              } else {
                var3 = 0;
                var4 = param0;
                L0: while (true) {
                  if (0L == var4) {
                    var6 = new StringBuilder(var3);
                    L1: while (true) {
                      if (param0 == 0L) {
                        var6.reverse();
                        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                        return var6.toString();
                      } else {
                        L2: {
                          var7 = param0;
                          param0 = param0 / 37L;
                          var9 = ou.field_n[(int)(var7 + -(param0 * 37L))];
                          if (var9 == 95) {
                            var10 = -1 + var6.length();
                            var9 = 160;
                            var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                        discarded$1 = var6.append((char) var9);
                        continue L1;
                      }
                    }
                  } else {
                    var4 = var4 / 37L;
                    var3++;
                    continue L0;
                  }
                }
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final int a(byte param0) throws IOException {
        if (this.field_k) {
            return 0;
        }
        int var2 = 60 / ((param0 - 26) / 55);
        return this.field_g.read();
    }

    final int b(int param0) throws IOException {
        if (this.field_k) {
            return 0;
        }
        if (param0 >= -110) {
            this.finalize();
            return this.field_g.available();
        }
        return this.field_g.available();
    }

    final void b(byte param0) throws IOException {
        if (this.field_k) {
          return;
        } else {
          if (!this.field_i) {
            if (param0 > 56) {
              return;
            } else {
              this.run();
              return;
            }
          } else {
            this.field_i = false;
            throw new IOException();
          }
        }
    }

    vf(java.net.Socket param0, rk param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(int param0) {
        try {
            InterruptedException var2 = null;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            Object var2_ref = null;
            var4 = AceOfSkies.field_G ? 1 : 0;
            if (!this.field_k) {
              var2_ref = this;
              synchronized (var2_ref) {
                L0: {
                  this.field_k = true;
                  this.notifyAll();
                  break L0;
                }
              }
              if (null != this.field_a) {
                L1: while (true) {
                  if (this.field_a.field_a != 0) {
                    if (1 == this.field_a.field_a) {
                      try {
                        L2: {
                          ((Thread) (this.field_a.field_f)).join();
                          break L2;
                        }
                      } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var2 = (InterruptedException) (Object) decompiledCaughtException;
                        this.field_a = null;
                        if (param0 == 1) {
                          return;
                        } else {
                          vf.c((byte) -69);
                          return;
                        }
                      }
                      this.field_a = null;
                      if (param0 == 1) {
                        return;
                      } else {
                        vf.c((byte) -69);
                        return;
                      }
                    } else {
                      this.field_a = null;
                      if (param0 == 1) {
                        return;
                      } else {
                        vf.c((byte) -69);
                        return;
                      }
                    }
                  } else {
                    wf.a(1L, false);
                    continue L1;
                  }
                }
              } else {
                this.field_a = null;
                if (param0 == 1) {
                  return;
                } else {
                  vf.c((byte) -69);
                  return;
                }
              }
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, byte[] param2, boolean param3) throws IOException {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3) {
                break L1;
              } else {
                this.field_k = false;
                break L1;
              }
            }
            if (this.field_k) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: while (true) {
                if (0 >= param1) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var5_int = this.field_g.read(param2, param0, param1);
                  if ((var5_int ^ -1) < -1) {
                    param1 = param1 - var5_int;
                    param0 = param0 + var5_int;
                    continue L2;
                  } else {
                    throw new EOFException();
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("vf.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private vf(java.net.Socket param0, rk param1, int param2) throws IOException {
        this.field_i = false;
        this.field_k = false;
        this.field_f = 0;
        this.field_h = 0;
        try {
            this.field_e = param1;
            this.field_d = param0;
            this.field_d.setSoTimeout(30000);
            this.field_d.setTcpNoDelay(true);
            this.field_g = this.field_d.getInputStream();
            this.field_j = this.field_d.getOutputStream();
            this.field_c = param2;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "vf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_l = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
    }
}
