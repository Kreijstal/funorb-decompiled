/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class gj implements Runnable {
    private int field_o;
    private boolean field_i;
    private ib field_b;
    private int field_n;
    private OutputStream field_k;
    static java.awt.Color field_a;
    private byte[] field_h;
    private boolean field_e;
    private fe field_c;
    private int field_g;
    private java.net.Socket field_m;
    private InputStream field_d;
    static String field_f;
    static int[] field_j;
    static volatile int field_l;

    final void a(byte param0, byte[] param1, int param2, int param3) throws IOException {
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
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (!((gj) this).field_e) {
              if (((gj) this).field_i) {
                ((gj) this).field_i = false;
                throw new IOException();
              } else {
                L1: {
                  if (null != ((gj) this).field_h) {
                    break L1;
                  } else {
                    ((gj) this).field_h = new byte[((gj) this).field_o];
                    break L1;
                  }
                }
                var5_ref = this;
                synchronized (var5_ref) {
                  L2: {
                    L3: {
                      if (param0 == 9) {
                        break L3;
                      } else {
                        ((gj) this).run();
                        break L3;
                      }
                    }
                    var6 = 0;
                    L4: while (true) {
                      if (param2 <= var6) {
                        L5: {
                          if (null == ((gj) this).field_b) {
                            ((gj) this).field_b = ((gj) this).field_c.a((Runnable) this, 3, 65535);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        this.notifyAll();
                        break L2;
                      } else {
                        ((gj) this).field_h[((gj) this).field_g] = param1[var6 + param3];
                        ((gj) this).field_g = (((gj) this).field_g + 1) % ((gj) this).field_o;
                        if ((((gj) this).field_o + (((gj) this).field_n + -100)) % ((gj) this).field_o == ((gj) this).field_g) {
                          throw new IOException();
                        } else {
                          var6++;
                          continue L4;
                        }
                      }
                    }
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
            stackOut_25_1 = new StringBuilder().append("gj.G(").append(param0).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
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
          throw ch.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void b(int param0) {
        field_f = null;
        field_a = null;
        field_j = null;
        if (param0 > -69) {
            field_f = null;
        }
    }

    gj(java.net.Socket param0, fe param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(boolean param0) {
        InterruptedException interruptedException = null;
        Object var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        var4 = Transmogrify.field_A ? 1 : 0;
        if (((gj) this).field_e) {
          return;
        } else {
          var2 = this;
          synchronized (var2) {
            L0: {
              L1: {
                stackOut_4_0 = this;
                stackIn_6_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (!param0) {
                  stackOut_6_0 = this;
                  stackOut_6_1 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  break L1;
                } else {
                  stackOut_5_0 = this;
                  stackOut_5_1 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L1;
                }
              }
              ((gj) this).field_e = stackIn_7_1 != 0;
              this.notifyAll();
              break L0;
            }
          }
          L2: {
            if (null == ((gj) this).field_b) {
              break L2;
            } else {
              L3: while (true) {
                if (0 != ((gj) this).field_b.field_c) {
                  if (((gj) this).field_b.field_c == 1) {
                    try {
                      L4: {
                        ((Thread) ((gj) this).field_b.field_g).join();
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
                  pg.a(1L, -94);
                  continue L3;
                }
              }
            }
          }
          ((gj) this).field_b = null;
          return;
        }
    }

    final static int a(byte param0, String param1, boolean param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        long var8 = 0L;
        int var10_int = 0;
        Object var10 = null;
        int var11 = 0;
        char[] var15 = null;
        int stackIn_6_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var11 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            var15 = param1.toCharArray();
            var5 = 0;
            var6 = 0;
            L1: while (true) {
              if (var6 >= param1.length()) {
                stackOut_22_0 = li.field_n[-var3_int + param1.length()];
                stackIn_23_0 = stackOut_22_0;
                break L0;
              } else {
                L2: {
                  if (var3_int > 2) {
                    stackOut_5_0 = var3_int - -1;
                    stackIn_6_0 = stackOut_5_0;
                    break L2;
                  } else {
                    stackOut_4_0 = 3;
                    stackIn_6_0 = stackOut_4_0;
                    break L2;
                  }
                }
                var7 = stackIn_6_0 + var6;
                L3: while (true) {
                  if (param1.length() < var7) {
                    var6++;
                    continue L1;
                  } else {
                    var8 = 0L;
                    var10_int = var6;
                    L4: while (true) {
                      if (var10_int >= var7) {
                        var10 = ac.field_n.a(-126, var8);
                        L5: while (true) {
                          L6: {
                            if (var10 == null) {
                              break L6;
                            } else {
                              L7: {
                                if ((Object) (Object) param1 == var10) {
                                  break L7;
                                } else {
                                  dj.field_b.setLength(0);
                                  StringBuilder discarded$1 = dj.field_b.append(param1.substring(var6, var7));
                                  if (-1 == ((String) var10).indexOf(dj.field_b.toString())) {
                                    break L7;
                                  } else {
                                    var3_int = var7 - var6;
                                    break L6;
                                  }
                                }
                              }
                              var10 = ac.field_n.b(-1);
                              continue L5;
                            }
                          }
                          ac.field_n.a((Object) (Object) param1, (byte) 26, var8);
                          if (null == ac.field_n.a(-128, var8)) {
                            throw new IllegalStateException();
                          } else {
                            var7++;
                            continue L3;
                          }
                        }
                      } else {
                        var8 = -var8 + (var8 << 5) - -(long)(255 & var15[var10_int]);
                        var10_int++;
                        continue L4;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var3;
            stackOut_24_1 = new StringBuilder().append("gj.B(").append(-39).append(',');
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
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + true + ')');
        }
        return stackIn_23_0;
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
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
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (param3 == 5768) {
              if (((gj) this).field_e) {
                return;
              } else {
                L1: while (true) {
                  if (param1 <= 0) {
                    break L0;
                  } else {
                    var5_int = ((gj) this).field_d.read(param2, param0, param1);
                    if (var5_int > 0) {
                      param0 = param0 + var5_int;
                      param1 = param1 - var5_int;
                      continue L1;
                    } else {
                      throw new EOFException();
                    }
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
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("gj.J(").append(param0).append(',').append(param1).append(',');
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
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param3 + ')');
        }
    }

    final static void a(byte param0, cf param1, int param2) {
        hj var3 = ff.field_D;
        var3.a(false, 2);
        var3.f(6389, param1.field_g);
        try {
            var3.c(param1.field_h, -159688920);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "gj.N(" + 83 + ',' + (param1 != null ? "{...}" : "null") + ',' + 2 + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        int discarded$4 = wf.a(-1);
        if (!param0) {
            gj.b(-59);
        }
    }

    final static q a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        q stackIn_4_0 = null;
        q stackIn_7_0 = null;
        q stackIn_17_0 = null;
        q stackIn_20_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        q stackOut_3_0 = null;
        q stackOut_16_0 = null;
        q stackOut_19_0 = null;
        q stackOut_6_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var5 = Transmogrify.field_A ? 1 : 0;
        try {
          var2_int = param1.length();
          if (var2_int == 0) {
            stackOut_3_0 = ai.field_a;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          } else {
            if (var2_int <= 63) {
              var3 = 0;
              L0: while (true) {
                if (var3 < var2_int) {
                  L1: {
                    var4 = param1.charAt(var3);
                    if (var4 == 45) {
                      L2: {
                        if (var3 == 0) {
                          break L2;
                        } else {
                          if (var2_int - 1 == var3) {
                            break L2;
                          } else {
                            break L1;
                          }
                        }
                      }
                      stackOut_16_0 = vc.field_N;
                      stackIn_17_0 = stackOut_16_0;
                      return stackIn_17_0;
                    } else {
                      if (li.field_o.indexOf(var4) != -1) {
                        break L1;
                      } else {
                        stackOut_19_0 = vc.field_N;
                        stackIn_20_0 = stackOut_19_0;
                        return stackIn_20_0;
                      }
                    }
                  }
                  var3++;
                  continue L0;
                } else {
                  return null;
                }
              }
            } else {
              stackOut_6_0 = rd.field_d;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var2;
            stackOut_23_1 = new StringBuilder().append("gj.I(").append(0).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L3;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L3;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ')');
        }
    }

    final static void e(int param0) {
        ha.field_a = null;
        hk.field_c = null;
    }

    final void d(int param0) throws IOException {
        int var2 = -36 / ((param0 - 16) / 54);
        if (((gj) this).field_e) {
            return;
        }
        if (!(!((gj) this).field_i)) {
            ((gj) this).field_i = false;
            throw new IOException();
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
            var6 = Transmogrify.field_A ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  var3_ref = this;
                  synchronized (var3_ref) {
                    L2: {
                      L3: {
                        if (((gj) this).field_g != ((gj) this).field_n) {
                          break L3;
                        } else {
                          if (((gj) this).field_e) {
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
                        var2 = ((gj) this).field_n;
                        if (((gj) this).field_n <= ((gj) this).field_g) {
                          var1_int = ((gj) this).field_g + -((gj) this).field_n;
                          break L6;
                        } else {
                          var1_int = ((gj) this).field_o - ((gj) this).field_n;
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
                          if (((gj) this).field_d == null) {
                            break L8;
                          } else {
                            ((gj) this).field_d.close();
                            break L8;
                          }
                        }
                        L9: {
                          if (null != ((gj) this).field_k) {
                            ((gj) this).field_k.close();
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: {
                          if (null == ((gj) this).field_m) {
                            break L10;
                          } else {
                            ((gj) this).field_m.close();
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
                    ((gj) this).field_h = null;
                    break L0;
                  } else {
                    if (var1_int > 0) {
                      try {
                        L12: {
                          ((gj) this).field_k.write(((gj) this).field_h, var2, var1_int);
                          break L12;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          ((gj) this).field_i = true;
                          break L13;
                        }
                      }
                      ((gj) this).field_n = (var1_int + ((gj) this).field_n) % ((gj) this).field_o;
                      try {
                        L14: {
                          L15: {
                            if (((gj) this).field_n != ((gj) this).field_g) {
                              break L15;
                            } else {
                              ((gj) this).field_k.flush();
                              break L15;
                            }
                          }
                          break L14;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L16: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          ((gj) this).field_i = true;
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
                d.a((Throwable) (Object) var1_ref, 28, (String) null);
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
        if (((gj) this).field_e) {
            return 0;
        }
        if (param0 != 1) {
            return 119;
        }
        return ((gj) this).field_d.read();
    }

    final static String a(int param0) {
        if (w.field_a == null) {
            return "";
        }
        return w.field_a;
    }

    final static boolean a(int[] param0, byte param1) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        b var4_ref_b = null;
        int var4 = 0;
        int var5_int = 0;
        b var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var7 = Transmogrify.field_A ? 1 : 0;
        try {
          if (ll.field_Q == lj.field_z) {
            L0: {
              var2_long = lk.a(0);
              if (aa.field_a == 0) {
                break L0;
              } else {
                if (md.field_k >= 0) {
                  break L0;
                } else {
                  var4_ref_b = (b) (Object) le.field_C.a((byte) -95);
                  if (var4_ref_b == null) {
                    break L0;
                  } else {
                    if (var4_ref_b.field_g >= var2_long) {
                      break L0;
                    } else {
                      var4_ref_b.c(5);
                      tg.field_a = var4_ref_b.field_h.length;
                      nf.field_l.field_h = 0;
                      var5_int = 0;
                      L1: while (true) {
                        if (tg.field_a <= var5_int) {
                          bd.field_t = nf.field_k;
                          nf.field_k = dg.field_a;
                          dg.field_a = ca.field_e;
                          ca.field_e = var4_ref_b.field_j;
                          stackOut_11_0 = 1;
                          stackIn_12_0 = stackOut_11_0;
                          return stackIn_12_0 != 0;
                        } else {
                          nf.field_l.field_g[var5_int] = var4_ref_b.field_h[var5_int];
                          var5_int++;
                          continue L1;
                        }
                      }
                    }
                  }
                }
              }
            }
            L2: {
              if (param1 > 83) {
                break L2;
              } else {
                field_f = null;
                break L2;
              }
            }
            L3: while (true) {
              L4: {
                if (0 > md.field_k) {
                  nf.field_l.field_h = 0;
                  if (ue.a(1, 0)) {
                    md.field_k = nf.field_l.l(-12135);
                    nf.field_l.field_h = 0;
                    tg.field_a = param0[md.field_k];
                    break L4;
                  } else {
                    stackOut_18_0 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    return stackIn_19_0 != 0;
                  }
                } else {
                  break L4;
                }
              }
              if (!ce.a(0)) {
                stackOut_23_0 = 0;
                stackIn_24_0 = stackOut_23_0;
                return stackIn_24_0 != 0;
              } else {
                if (aa.field_a != 0) {
                  L5: {
                    var4 = aa.field_a;
                    if (lj.field_x == 0.0) {
                      break L5;
                    } else {
                      var4 = (int)((double)var4 + d.field_c.nextGaussian() * lj.field_x);
                      if (0 <= var4) {
                        break L5;
                      } else {
                        var4 = 0;
                        break L5;
                      }
                    }
                  }
                  var5 = new b((long)var4 + var2_long, md.field_k, new byte[tg.field_a]);
                  var6 = 0;
                  L6: while (true) {
                    if (tg.field_a <= var6) {
                      le.field_C.a((wf) (Object) var5, -100);
                      md.field_k = -1;
                      continue L3;
                    } else {
                      var5.field_h[var6] = nf.field_l.field_g[var6];
                      var6++;
                      continue L6;
                    }
                  }
                } else {
                  bd.field_t = nf.field_k;
                  nf.field_k = dg.field_a;
                  dg.field_a = ca.field_e;
                  ca.field_e = md.field_k;
                  md.field_k = -1;
                  stackOut_26_0 = 1;
                  stackIn_27_0 = stackOut_26_0;
                  return stackIn_27_0 != 0;
                }
              }
            }
          } else {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) var2;
            stackOut_35_1 = new StringBuilder().append("gj.L(");
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param0 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L7;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L7;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + ',' + param1 + ')');
        }
    }

    protected final void finalize() {
        ((gj) this).a(true);
    }

    final int a(byte param0) throws IOException {
        if (((gj) this).field_e) {
            return 0;
        }
        int var2 = -83 / ((-62 - param0) / 36);
        return ((gj) this).field_d.available();
    }

    private gj(java.net.Socket param0, fe param1, int param2) throws IOException {
        ((gj) this).field_i = false;
        ((gj) this).field_n = 0;
        ((gj) this).field_e = false;
        ((gj) this).field_g = 0;
        try {
            ((gj) this).field_c = param1;
            ((gj) this).field_m = param0;
            ((gj) this).field_m.setSoTimeout(30000);
            ((gj) this).field_m.setTcpNoDelay(true);
            ((gj) this).field_d = ((gj) this).field_m.getInputStream();
            ((gj) this).field_k = ((gj) this).field_m.getOutputStream();
            ((gj) this).field_o = param2;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "gj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Orb points: <%0>";
        field_a = new java.awt.Color(10040319);
        field_l = 0;
    }
}
