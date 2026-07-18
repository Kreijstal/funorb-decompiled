/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pc implements Runnable {
    static String field_c;
    static String field_i;
    static int[] field_j;
    static String field_p;
    private mk field_f;
    private si field_e;
    private java.net.Socket field_n;
    private int field_g;
    private boolean field_b;
    private int field_h;
    static tg field_o;
    private InputStream field_m;
    private boolean field_l;
    private OutputStream field_k;
    private int field_a;
    private byte[] field_d;

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
            var6 = Bounce.field_N;
            try {
              L0: {
                L1: while (true) {
                  var3_ref = this;
                  synchronized (var3_ref) {
                    L2: {
                      L3: {
                        if (((pc) this).field_a == ((pc) this).field_h) {
                          if (((pc) this).field_l) {
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
                        if (((pc) this).field_a <= ((pc) this).field_h) {
                          var1_int = ((pc) this).field_h + -((pc) this).field_a;
                          break L6;
                        } else {
                          var1_int = -((pc) this).field_a + ((pc) this).field_g;
                          break L6;
                        }
                      }
                      var2 = ((pc) this).field_a;
                      decompiledRegionSelector0 = 1;
                      break L2;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    try {
                      L7: {
                        L8: {
                          if (((pc) this).field_m == null) {
                            break L8;
                          } else {
                            ((pc) this).field_m.close();
                            break L8;
                          }
                        }
                        L9: {
                          if (null != ((pc) this).field_k) {
                            ((pc) this).field_k.close();
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: {
                          if (null != ((pc) this).field_n) {
                            ((pc) this).field_n.close();
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
                    ((pc) this).field_d = null;
                    break L0;
                  } else {
                    if (var1_int > 0) {
                      try {
                        L12: {
                          ((pc) this).field_k.write(((pc) this).field_d, var2, var1_int);
                          break L12;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          ((pc) this).field_b = true;
                          break L13;
                        }
                      }
                      ((pc) this).field_a = (var1_int + ((pc) this).field_a) % ((pc) this).field_g;
                      try {
                        L14: {
                          L15: {
                            if (((pc) this).field_a != ((pc) this).field_h) {
                              break L15;
                            } else {
                              ((pc) this).field_k.flush();
                              break L15;
                            }
                          }
                          break L14;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L16: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          ((pc) this).field_b = true;
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
                ti.a((Throwable) (Object) var1_ref, (byte) 100, (String) null);
                break L17;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int var8 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var8 = Bounce.field_N;
        try {
          L0: {
            if (!((pc) this).field_l) {
              if (!((pc) this).field_b) {
                L1: {
                  if (((pc) this).field_d == null) {
                    ((pc) this).field_d = new byte[((pc) this).field_g];
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var5 = this;
                synchronized (var5) {
                  L2: {
                    var6 = param3;
                    L3: while (true) {
                      if (var6 >= param0) {
                        L4: {
                          if (null != ((pc) this).field_f) {
                            break L4;
                          } else {
                            ((pc) this).field_f = ((pc) this).field_e.a(3, (byte) -113, (Runnable) this);
                            break L4;
                          }
                        }
                        this.notifyAll();
                        break L2;
                      } else {
                        ((pc) this).field_d[((pc) this).field_h] = param1[var6 + param2];
                        ((pc) this).field_h = (1 + ((pc) this).field_h) % ((pc) this).field_g;
                        if (((pc) this).field_h != (-100 + (((pc) this).field_g + ((pc) this).field_a)) % ((pc) this).field_g) {
                          var6++;
                          continue L3;
                        } else {
                          throw new IOException();
                        }
                      }
                    }
                  }
                }
                break L0;
              } else {
                ((pc) this).field_b = false;
                throw new IOException();
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var5_ref;
            stackOut_21_1 = new StringBuilder().append("pc.I(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L5;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L5;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param2 + ',' + param3 + ')');
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
        var6 = Bounce.field_N;
        try {
          L0: {
            if (((pc) this).field_l) {
              return;
            } else {
              if (param1) {
                L1: while (true) {
                  if (param2 <= 0) {
                    break L0;
                  } else {
                    var5_int = ((pc) this).field_m.read(param0, param3, param2);
                    if (var5_int <= 0) {
                      throw new EOFException();
                    } else {
                      param3 = param3 + var5_int;
                      param2 = param2 - var5_int;
                      continue L1;
                    }
                  }
                }
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("pc.H(");
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
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final int b(int param0) throws IOException {
        if (((pc) this).field_l) {
            return 0;
        }
        if (param0 != 0) {
            ((pc) this).finalize();
        }
        return ((pc) this).field_m.read();
    }

    final static boolean a(int param0, boolean param1, CharSequence param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_38_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_37_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_27_0 = 0;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        var11 = Bounce.field_N;
        try {
          L0: {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            var7 = param2.length();
            var8 = 0;
            L1: while (true) {
              if (var7 <= var8) {
                stackOut_37_0 = var5;
                stackIn_38_0 = stackOut_37_0;
                break L0;
              } else {
                L2: {
                  L3: {
                    var9 = param2.charAt(var8);
                    if (var8 == 0) {
                      if (var9 == 45) {
                        var4_int = 1;
                        break L2;
                      } else {
                        if (43 != var9) {
                          break L3;
                        } else {
                          break L2;
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    L5: {
                      if (var9 < 48) {
                        break L5;
                      } else {
                        if (57 >= var9) {
                          var9 -= 48;
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (65 > var9) {
                        break L6;
                      } else {
                        if (90 < var9) {
                          break L6;
                        } else {
                          var9 -= 55;
                          break L4;
                        }
                      }
                    }
                    L7: {
                      if (var9 < 97) {
                        break L7;
                      } else {
                        if (var9 > 122) {
                          break L7;
                        } else {
                          var9 -= 87;
                          break L4;
                        }
                      }
                    }
                    stackOut_23_0 = 0;
                    stackIn_24_0 = stackOut_23_0;
                    return stackIn_24_0 != 0;
                  }
                  if (var9 < 10) {
                    L8: {
                      if (var4_int == 0) {
                        break L8;
                      } else {
                        var9 = -var9;
                        break L8;
                      }
                    }
                    var10 = var9 + var6 * 10;
                    if (var6 != var10 / 10) {
                      stackOut_33_0 = 0;
                      stackIn_34_0 = stackOut_33_0;
                      return stackIn_34_0 != 0;
                    } else {
                      var5 = 1;
                      var6 = var10;
                      break L2;
                    }
                  } else {
                    stackOut_27_0 = 0;
                    stackIn_28_0 = stackOut_27_0;
                    return stackIn_28_0 != 0;
                  }
                }
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) var4;
            stackOut_39_1 = new StringBuilder().append("pc.F(").append(8272).append(',').append(true).append(',');
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param2 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L9;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L9;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + ',' + 10 + ')');
        }
        return stackIn_38_0 != 0;
    }

    final void a(byte param0) {
        InterruptedException interruptedException = null;
        Object var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = Bounce.field_N;
        if (!((pc) this).field_l) {
          var2 = this;
          synchronized (var2) {
            L0: {
              ((pc) this).field_l = true;
              this.notifyAll();
              break L0;
            }
          }
          if (param0 == -70) {
            L1: {
              if (null == ((pc) this).field_f) {
                break L1;
              } else {
                L2: while (true) {
                  if (0 != ((pc) this).field_f.field_f) {
                    if (1 == ((pc) this).field_f.field_f) {
                      try {
                        L3: {
                          ((Thread) ((pc) this).field_f.field_e).join();
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
                    } else {
                      break L1;
                    }
                  } else {
                    wh.a(1L, 19406);
                    continue L2;
                  }
                }
              }
            }
            ((pc) this).field_f = null;
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static void a(int param0, byte param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Bounce.field_N;
        if (oa.field_a >= 0) {
          L0: {
            var3 = 185;
            var4 = 205;
            var5 = 256;
            if (oa.field_a < 75) {
              var5 = (oa.field_a << 8) / 75;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (200 < oa.field_a) {
              var5 = (-oa.field_a + 250 << 8) / 50;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            kh.a(bi.field_j, 1);
            qk.c();
            na.a();
            jf.c(0);
            if (var5 < 256) {
              na.a(0, 0, na.field_e, na.field_k, 0, 256 + -var5);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            ve.a(-121);
            if (oa.field_a < 150) {
              bi.field_j.c(var3, var4);
              break L3;
            } else {
              jl.field_c.d(15 + var3, 10 + var4, var5);
              break L3;
            }
          }
          L4: {
            var6 = -125 + oa.field_a;
            if (var6 <= 0) {
              break L4;
            } else {
              if (var6 >= 50) {
                break L4;
              } else {
                if (var6 >= 20) {
                  if (30 <= var6) {
                    var7 = (-(var6 * 256) + 12800) / 20;
                    Bounce.field_G.a(var3, var4, var7);
                    break L4;
                  } else {
                    Bounce.field_G.a(var3, var4, 256);
                    break L4;
                  }
                } else {
                  var7 = 256 * var6 / 20;
                  Bounce.field_G.a(var3, var4, var7);
                  break L4;
                }
              }
            }
          }
          L5: {
            var6 = -140 + oa.field_a;
            if (var6 <= 0) {
              break L5;
            } else {
              L6: {
                var7 = 256;
                if (var6 >= 20) {
                  break L6;
                } else {
                  var7 = var6 * 256 / 20;
                  break L6;
                }
              }
              bf.field_o.d(15 + var3, 10 + var4, var5 * var7 >> 8);
              break L5;
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void c(int param0) {
        field_c = null;
        field_j = null;
        field_p = null;
        field_i = null;
        field_o = null;
    }

    final void a(int param0) throws IOException {
        if (!(!((pc) this).field_l)) {
            return;
        }
        int var2 = -51 % ((param0 - -67) / 34);
        if (!(!((pc) this).field_b)) {
            ((pc) this).field_b = false;
            throw new IOException();
        }
    }

    final int d(int param0) throws IOException {
        if (((pc) this).field_l) {
            return 0;
        }
        if (param0 != 0) {
            ((pc) this).field_a = -27;
        }
        return ((pc) this).field_m.available();
    }

    protected final void finalize() {
        ((pc) this).a((byte) -70);
    }

    pc(java.net.Socket param0, si param1) throws IOException {
        this(param0, param1, 5000);
    }

    private pc(java.net.Socket param0, si param1, int param2) throws IOException {
        ((pc) this).field_h = 0;
        ((pc) this).field_l = false;
        ((pc) this).field_a = 0;
        ((pc) this).field_b = false;
        try {
            ((pc) this).field_e = param1;
            ((pc) this).field_n = param0;
            ((pc) this).field_n.setSoTimeout(30000);
            ((pc) this).field_n.setTcpNoDelay(true);
            ((pc) this).field_m = ((pc) this).field_n.getInputStream();
            ((pc) this).field_k = ((pc) this).field_n.getOutputStream();
            ((pc) this).field_g = param2;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "pc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new int[8192];
        field_i = "Continue";
        field_c = "Type your email address again to make sure it's correct";
    }
}
