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
        ((vf) this).a(1);
    }

    public static void c(byte param0) {
        field_l = null;
        if (param0 <= -123) {
            return;
        }
        field_l = null;
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        RuntimeException var5 = null;
        Object var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int var8 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var8 = AceOfSkies.field_G ? 1 : 0;
        try {
          if (((vf) this).field_k) {
            return;
          } else {
            if (((vf) this).field_i) {
              ((vf) this).field_i = false;
              throw new IOException();
            } else {
              L0: {
                if (null != ((vf) this).field_b) {
                  break L0;
                } else {
                  ((vf) this).field_b = new byte[((vf) this).field_c];
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
                        if (null == ((vf) this).field_a) {
                          ((vf) this).field_a = ((vf) this).field_e.a(3, 1048576, (Runnable) this);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      this.notifyAll();
                      var6 = 44 / ((param2 - -35) / 56);
                      break L1;
                    } else {
                      ((vf) this).field_b[((vf) this).field_h] = param3[var6 + param1];
                      ((vf) this).field_h = (((vf) this).field_h - -1) % ((vf) this).field_c;
                      if (((vf) this).field_h != (((vf) this).field_f + ((vf) this).field_c + -100) % ((vf) this).field_c) {
                        var6++;
                        continue L2;
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
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var5;
            stackOut_23_1 = new StringBuilder().append("vf.H(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param3 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L4;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L4;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
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
            var6 = AceOfSkies.field_G ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  var3_ref = this;
                  synchronized (var3_ref) {
                    L2: {
                      L3: {
                        if (((vf) this).field_f != ((vf) this).field_h) {
                          break L3;
                        } else {
                          if (!((vf) this).field_k) {
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
                        if (((vf) this).field_f <= ((vf) this).field_h) {
                          var1_int = -((vf) this).field_f + ((vf) this).field_h;
                          break L6;
                        } else {
                          var1_int = ((vf) this).field_c + -((vf) this).field_f;
                          break L6;
                        }
                      }
                      var2 = ((vf) this).field_f;
                      decompiledRegionSelector0 = 1;
                      break L2;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    try {
                      L7: {
                        L8: {
                          if (null == ((vf) this).field_g) {
                            break L8;
                          } else {
                            ((vf) this).field_g.close();
                            break L8;
                          }
                        }
                        L9: {
                          if (((vf) this).field_j == null) {
                            break L9;
                          } else {
                            ((vf) this).field_j.close();
                            break L9;
                          }
                        }
                        L10: {
                          if (((vf) this).field_d != null) {
                            ((vf) this).field_d.close();
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
                    ((vf) this).field_b = null;
                    break L0;
                  } else {
                    if (var1_int > 0) {
                      try {
                        L12: {
                          ((vf) this).field_j.write(((vf) this).field_b, var2, var1_int);
                          break L12;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          ((vf) this).field_i = true;
                          break L13;
                        }
                      }
                      ((vf) this).field_f = (var1_int + ((vf) this).field_f) % ((vf) this).field_c;
                      try {
                        L14: {
                          L15: {
                            if (((vf) this).field_h != ((vf) this).field_f) {
                              break L15;
                            } else {
                              ((vf) this).field_j.flush();
                              break L15;
                            }
                          }
                          break L14;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L16: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          ((vf) this).field_i = true;
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
                v.a((String) null, (byte) -52, (Throwable) (Object) var1_ref);
                break L17;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(long param0) {
        int var3 = 0;
        long var4 = 0L;
        StringBuilder var6 = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = AceOfSkies.field_G ? 1 : 0;
        if (0L < param0) {
          if (param0 < 6582952005840035281L) {
            if (param0 % 37L == 0L) {
              return null;
            } else {
              var3 = 0;
              var4 = param0;
              L0: while (true) {
                if (0L == var4) {
                  var6 = new StringBuilder(var3);
                  L1: while (true) {
                    if (param0 == 0L) {
                      StringBuilder discarded$2 = var6.reverse();
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
                      StringBuilder discarded$3 = var6.append(var9);
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
    }

    final int a(byte param0) throws IOException {
        if (((vf) this).field_k) {
            return 0;
        }
        int var2 = 60 / ((param0 - 26) / 55);
        return ((vf) this).field_g.read();
    }

    final int b(int param0) throws IOException {
        if (((vf) this).field_k) {
            return 0;
        }
        if (param0 >= -110) {
            ((vf) this).finalize();
            return ((vf) this).field_g.available();
        }
        return ((vf) this).field_g.available();
    }

    final void b(byte param0) throws IOException {
        if (((vf) this).field_k) {
          return;
        } else {
          if (!((vf) this).field_i) {
            if (param0 > 56) {
              return;
            } else {
              ((vf) this).run();
              return;
            }
          } else {
            ((vf) this).field_i = false;
            throw new IOException();
          }
        }
    }

    vf(java.net.Socket param0, rk param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(int param0) {
        Object var2 = null;
        InterruptedException var2_ref = null;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = AceOfSkies.field_G ? 1 : 0;
        if (!((vf) this).field_k) {
          var2 = this;
          synchronized (var2) {
            L0: {
              ((vf) this).field_k = true;
              this.notifyAll();
              break L0;
            }
          }
          if (null != ((vf) this).field_a) {
            L1: while (true) {
              if (((vf) this).field_a.field_a != 0) {
                if (1 == ((vf) this).field_a.field_a) {
                  try {
                    L2: {
                      ((Thread) ((vf) this).field_a.field_f).join();
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var2_ref = (InterruptedException) (Object) decompiledCaughtException;
                    ((vf) this).field_a = null;
                    if (param0 == 1) {
                      return;
                    } else {
                      vf.c((byte) -69);
                      return;
                    }
                  }
                  ((vf) this).field_a = null;
                  if (param0 == 1) {
                    return;
                  } else {
                    vf.c((byte) -69);
                    return;
                  }
                } else {
                  ((vf) this).field_a = null;
                  if (param0 == 1) {
                    return;
                  } else {
                    vf.c((byte) -69);
                    return;
                  }
                }
              } else {
                int discarded$2 = 0;
                wf.a(1L);
                continue L1;
              }
            }
          } else {
            ((vf) this).field_a = null;
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
    }

    final void a(int param0, int param1, byte[] param2, boolean param3) throws IOException {
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
        var6 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3) {
                break L1;
              } else {
                ((vf) this).field_k = false;
                break L1;
              }
            }
            if (((vf) this).field_k) {
              return;
            } else {
              L2: while (true) {
                if (0 >= param1) {
                  break L0;
                } else {
                  var5_int = ((vf) this).field_g.read(param2, param0, param1);
                  if (var5_int > 0) {
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
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("vf.C(").append(param0).append(44).append(param1).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
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
          throw pn.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param3 + 41);
        }
    }

    private vf(java.net.Socket param0, rk param1, int param2) throws IOException {
        ((vf) this).field_i = false;
        ((vf) this).field_k = false;
        ((vf) this).field_f = 0;
        ((vf) this).field_h = 0;
        try {
            ((vf) this).field_e = param1;
            ((vf) this).field_d = param0;
            ((vf) this).field_d.setSoTimeout(30000);
            ((vf) this).field_d.setTcpNoDelay(true);
            ((vf) this).field_g = ((vf) this).field_d.getInputStream();
            ((vf) this).field_j = ((vf) this).field_d.getOutputStream();
            ((vf) this).field_c = param2;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "vf.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
    }
}
