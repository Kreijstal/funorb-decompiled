/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rk implements Runnable {
    private qg field_b;
    private int field_j;
    private boolean field_n;
    private int field_i;
    private InputStream field_g;
    private pn field_e;
    static String[] field_k;
    private OutputStream field_o;
    private boolean field_m;
    private java.net.Socket field_h;
    static String field_a;
    static long field_l;
    static String[] field_f;
    private byte[] field_c;
    private int field_d;

    public static void a(boolean param0) {
        if (!param0) {
          field_f = null;
          field_a = null;
          field_k = null;
          field_f = null;
          return;
        } else {
          field_a = null;
          field_k = null;
          field_f = null;
          return;
        }
    }

    final void a(byte[] param0, boolean param1, int param2, int param3) throws IOException {
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
        var6 = DungeonAssault.field_K;
        try {
          L0: {
            if (((rk) this).field_m) {
              return;
            } else {
              L1: {
                if (!param1) {
                  break L1;
                } else {
                  ((rk) this).field_i = 17;
                  break L1;
                }
              }
              L2: while (true) {
                if (param2 <= 0) {
                  break L0;
                } else {
                  var5_int = ((rk) this).field_g.read(param0, param3, param2);
                  if (var5_int <= 0) {
                    throw new EOFException();
                  } else {
                    param2 = param2 - var5_int;
                    param3 = param3 + var5_int;
                    continue L2;
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
            stackOut_12_1 = new StringBuilder().append("rk.B(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
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
          throw vk.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    protected final void finalize() {
        ((rk) this).c(-6624);
    }

    final int a(int param0) throws IOException {
        if (param0 != 0) {
            rk.a(false);
            if (!(!((rk) this).field_m)) {
                return 0;
            }
            return ((rk) this).field_g.available();
        }
        if (!(!((rk) this).field_m)) {
            return 0;
        }
        return ((rk) this).field_g.available();
    }

    final void b(int param0) throws IOException {
        int var2 = 0;
        var2 = 117 / ((param0 - -9) / 51);
        if (!((rk) this).field_m) {
          if (((rk) this).field_n) {
            ((rk) this).field_n = false;
            throw new IOException();
          } else {
            return;
          }
        } else {
          return;
        }
    }

    rk(java.net.Socket param0, qg param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void c(int param0) {
        InterruptedException var2 = null;
        Object var2_ref = null;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        L0: {
          var4 = DungeonAssault.field_K;
          if (param0 == -6624) {
            break L0;
          } else {
            ((rk) this).field_o = null;
            break L0;
          }
        }
        if (!((rk) this).field_m) {
          var2_ref = this;
          synchronized (var2_ref) {
            L1: {
              ((rk) this).field_m = true;
              this.notifyAll();
              break L1;
            }
          }
          if (((rk) this).field_e != null) {
            L2: while (true) {
              if (((rk) this).field_e.field_c != 0) {
                if (1 == ((rk) this).field_e.field_c) {
                  try {
                    L3: {
                      ((Thread) ((rk) this).field_e.field_f).join();
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var2 = (InterruptedException) (Object) decompiledCaughtException;
                    ((rk) this).field_e = null;
                    return;
                  }
                  ((rk) this).field_e = null;
                  return;
                } else {
                  ((rk) this).field_e = null;
                  return;
                }
              } else {
                pj.a(param0 + 6624, 1L);
                continue L2;
              }
            }
          } else {
            ((rk) this).field_e = null;
            return;
          }
        } else {
          return;
        }
    }

    final int a(byte param0) throws IOException {
        if (param0 == -108) {
          if (((rk) this).field_m) {
            return 0;
          } else {
            return ((rk) this).field_g.read();
          }
        } else {
          ((rk) this).field_g = null;
          if (((rk) this).field_m) {
            return 0;
          } else {
            return ((rk) this).field_g.read();
          }
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
            var6 = DungeonAssault.field_K;
            try {
              L0: {
                L1: while (true) {
                  var3_ref = this;
                  synchronized (var3_ref) {
                    L2: {
                      L3: {
                        if (((rk) this).field_i == ((rk) this).field_d) {
                          if (((rk) this).field_m) {
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
                        } else {
                          break L3;
                        }
                      }
                      L6: {
                        var2 = ((rk) this).field_d;
                        if (((rk) this).field_d <= ((rk) this).field_i) {
                          var1_int = ((rk) this).field_i - ((rk) this).field_d;
                          break L6;
                        } else {
                          var1_int = -((rk) this).field_d + ((rk) this).field_j;
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
                          if (((rk) this).field_g == null) {
                            break L8;
                          } else {
                            ((rk) this).field_g.close();
                            break L8;
                          }
                        }
                        L9: {
                          if (null != ((rk) this).field_o) {
                            ((rk) this).field_o.close();
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: {
                          if (null == ((rk) this).field_h) {
                            break L10;
                          } else {
                            ((rk) this).field_h.close();
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
                    ((rk) this).field_c = null;
                    break L0;
                  } else {
                    if (var1_int <= 0) {
                      continue L1;
                    } else {
                      try {
                        L12: {
                          ((rk) this).field_o.write(((rk) this).field_c, var2, var1_int);
                          break L12;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          ((rk) this).field_n = true;
                          break L13;
                        }
                      }
                      ((rk) this).field_d = (((rk) this).field_d + var1_int) % ((rk) this).field_j;
                      try {
                        L14: {
                          L15: {
                            if (((rk) this).field_i == ((rk) this).field_d) {
                              ((rk) this).field_o.flush();
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
                          ((rk) this).field_n = true;
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
                sm.a((Throwable) (Object) var1_ref, 1, (String) null);
                break L17;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, cn param8) {
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            var9_int = param8.field_w - (-param5 + -param2 + param6);
            var10 = param5 + (param8.field_w - (-param2 + -param0));
            var11 = param4 + param8.field_A - -(param8.field_v >> 1);
            if (param7 >= 97) {
              gf.a(var9_int, 0, var10, var11 - -param3);
              param8.b(-1 + param5, -1 + param4, param1);
              param8.b(param5 + -1, param4 - -1, param1);
              gf.b(rp.field_e);
              gf.a(1 + var9_int, 0, var10 + 1, param3 + var11);
              param8.b(1 + param5, param4 + -1, param1);
              param8.b(1 + param5, 1 + param4, param1);
              gf.b(rp.field_e);
              var9_int = -param0 + (param5 + (param8.field_w - -param8.field_y) - param2);
              var10 = param8.field_y + param8.field_w - (-param5 + param2) + -param6;
              gf.a(var9_int, -param3 + var11, var10, 480);
              param8.b(-1 + param5, param4 - 1, param1);
              param8.b(param5 + -1, 1 + param4, param1);
              gf.b(rp.field_e);
              gf.a(var9_int - -1, var11 + -param3, 1 + var10, 480);
              param8.b(1 + param5, param4 + -1, param1);
              param8.b(param5 - -1, 1 + param4, param1);
              gf.b(rp.field_e);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var9;
            stackOut_4_1 = new StringBuilder().append("rk.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44).append(param7).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param8 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
    }

    final void b(byte[] param0, boolean param1, int param2, int param3) throws IOException {
        RuntimeException var5 = null;
        Object var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int var8 = 0;
        Object var9 = null;
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
        var8 = DungeonAssault.field_K;
        try {
          if (((rk) this).field_m) {
            return;
          } else {
            if (!((rk) this).field_n) {
              L0: {
                if (null != ((rk) this).field_c) {
                  break L0;
                } else {
                  ((rk) this).field_c = new byte[((rk) this).field_j];
                  break L0;
                }
              }
              var5_ref = this;
              synchronized (var5_ref) {
                L1: {
                  L2: {
                    if (!param1) {
                      break L2;
                    } else {
                      var9 = null;
                      rk.a(-80, 100, -128, -38, -21, -28, 61, -115, (cn) null);
                      break L2;
                    }
                  }
                  var6 = 0;
                  L3: while (true) {
                    if (param3 <= var6) {
                      L4: {
                        if (null == ((rk) this).field_e) {
                          ((rk) this).field_e = ((rk) this).field_b.a(-21432, 3, (Runnable) this);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      this.notifyAll();
                      break L1;
                    } else {
                      ((rk) this).field_c[((rk) this).field_i] = param0[param2 + var6];
                      ((rk) this).field_i = (((rk) this).field_i + 1) % ((rk) this).field_j;
                      if ((-100 + ((rk) this).field_j + ((rk) this).field_d) % ((rk) this).field_j == ((rk) this).field_i) {
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
              ((rk) this).field_n = false;
              throw new IOException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var5;
            stackOut_25_1 = new StringBuilder().append("rk.E(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L5;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L5;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    private rk(java.net.Socket param0, qg param1, int param2) throws IOException {
        ((rk) this).field_i = 0;
        ((rk) this).field_n = false;
        ((rk) this).field_m = false;
        ((rk) this).field_d = 0;
        try {
            ((rk) this).field_b = param1;
            ((rk) this).field_h = param0;
            ((rk) this).field_h.setSoTimeout(30000);
            ((rk) this).field_h.setTcpNoDelay(true);
            ((rk) this).field_g = ((rk) this).field_h.getInputStream();
            ((rk) this).field_o = ((rk) this).field_h.getOutputStream();
            ((rk) this).field_j = param2;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "rk.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Snare";
        field_f = new String[]{"Toughness", "Any lethal blow becomes <col=FF0000>Defence -1</col>."};
        field_k = new String[]{null, "<%highlight>It's generally best to attack a player close to you in the table.</col> Players much higher than you are likely to be better defended, with more ferocious <%monsters> and devious <%traps>. Players far beneath you may be easier to assault, but the potential gains will be low."};
    }
}
