/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sb implements Runnable {
    private InputStream field_d;
    private ka field_k;
    private OutputStream field_q;
    private boolean field_i;
    private int field_r;
    private bk field_b;
    private boolean field_l;
    static p field_n;
    static String field_o;
    static String field_f;
    static String field_p;
    private int field_a;
    private java.net.Socket field_j;
    static int field_m;
    private int field_h;
    static kh field_g;
    static int field_c;
    private byte[] field_e;

    final void b(byte param0) {
        InterruptedException interruptedException = null;
        Object var2 = null;
        Throwable var3 = null;
        Throwable decompiledCaughtException = null;
        if (((sb) this).field_i) {
          return;
        } else {
          var2 = this;
          synchronized (var2) {
            L0: {
              ((sb) this).field_i = true;
              this.notifyAll();
              break L0;
            }
          }
          L1: {
            if (((sb) this).field_b != null) {
              L2: while (true) {
                if (((sb) this).field_b.field_b != 0) {
                  if (((sb) this).field_b.field_b != 1) {
                    break L1;
                  } else {
                    try {
                      L3: {
                        ((Thread) ((sb) this).field_b.field_f).join();
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
                  uc.a(-113, 1L);
                  continue L2;
                }
              }
            } else {
              break L1;
            }
          }
          L5: {
            ((sb) this).field_b = null;
            if (param0 <= -20) {
              break L5;
            } else {
              ((sb) this).field_r = 0;
              break L5;
            }
          }
          return;
        }
    }

    public static void b(int param0) {
        field_n = null;
        field_o = null;
        field_p = null;
        field_f = null;
        field_g = null;
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var8_int = 0;
              var9 = 65536 / param7;
              if (ki.field_l > param6) {
                param1 = param1 - (ki.field_l - param6);
                param6 = ki.field_l;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param4 >= ki.field_e) {
                break L2;
              } else {
                param7 = param7 - (-param4 + ki.field_e);
                var8_int = var8_int + var9 * (ki.field_e - param4);
                param4 = ki.field_e;
                break L2;
              }
            }
            L3: {
              if (param1 + param6 > ki.field_g) {
                param1 = ki.field_g - param6;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param4 + param7 > ki.field_i) {
                param7 = ki.field_i + -param4;
                break L4;
              } else {
                break L4;
              }
            }
            var10 = -param1 + ki.field_j;
            var11 = param6 + param4 * ki.field_j;
            if (param0) {
              var12 = -param7;
              L5: while (true) {
                if (var12 >= 0) {
                  break L0;
                } else {
                  var13 = 65536 - var8_int >> 8;
                  var14 = var8_int >> 8;
                  var15 = ((param2 & 16711935) * var13 - -((16711935 & param3) * var14) & -16711936) - -(16711680 & (param2 & 65280) * var13 + (param3 & 65280) * var14) >>> 8;
                  var16 = -param1;
                  L6: while (true) {
                    if (0 <= var16) {
                      var8_int = var8_int + var9;
                      var11 = var11 + var10;
                      var12++;
                      continue L5;
                    } else {
                      L7: {
                        if (param5 != ki.field_a[var11]) {
                          var11++;
                          break L7;
                        } else {
                          int incrementValue$1 = var11;
                          var11++;
                          ki.field_a[incrementValue$1] = var15;
                          break L7;
                        }
                      }
                      var16++;
                      continue L6;
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
          var8 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var8, "sb.E(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    sb(java.net.Socket param0, ka param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(byte param0) throws IOException {
        if (!(!((sb) this).field_i)) {
            return;
        }
        if (((sb) this).field_l) {
            ((sb) this).field_l = false;
            throw new IOException();
        }
        int var2 = 69 % ((param0 - 67) / 58);
    }

    final int a(int param0) throws IOException {
        if (param0 != 488852616) {
            ((sb) this).field_e = null;
        }
        if (!(!((sb) this).field_i)) {
            return 0;
        }
        return ((sb) this).field_d.read();
    }

    final static kl[] a(ia param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        kl[] var4 = null;
        int var5 = 0;
        int var6_int = 0;
        kl var6 = null;
        int var7 = 0;
        kl[] stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        kl[] stackOut_10_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var7 = StarCannon.field_A;
        try {
          L0: {
            var2_int = param0.e(8, 8);
            if (0 >= var2_int) {
              var3 = param0.e(8, 12);
              var4 = new kl[var3];
              var5 = 0;
              L1: while (true) {
                if (var3 <= var5) {
                  stackOut_10_0 = (kl[]) var4;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  L2: {
                    if (od.a(-2, param0)) {
                      var6 = new kl();
                      int discarded$12 = param0.e(8, 24);
                      int discarded$13 = param0.e(8, 24);
                      var6.field_e = param0.e(8, 24);
                      int discarded$14 = param0.e(8, 9);
                      int discarded$15 = param0.e(8, 12);
                      int discarded$16 = param0.e(8, 12);
                      int discarded$17 = param0.e(8, 12);
                      var4[var5] = var6;
                      break L2;
                    } else {
                      var6_int = param0.e(8, wg.a(false, -1 + var5));
                      var4[var5] = var4[var6_int];
                      break L2;
                    }
                  }
                  var5++;
                  continue L1;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("sb.A(");
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
          throw sd.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + 107 + 41);
        }
        return stackIn_11_0;
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
            var6 = StarCannon.field_A;
            try {
              L0: {
                L1: while (true) {
                  var3_ref = this;
                  synchronized (var3_ref) {
                    L2: {
                      L3: {
                        if (((sb) this).field_h != ((sb) this).field_r) {
                          break L3;
                        } else {
                          if (!((sb) this).field_i) {
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
                        var2 = ((sb) this).field_h;
                        if (((sb) this).field_h > ((sb) this).field_r) {
                          var1_int = ((sb) this).field_a + -((sb) this).field_h;
                          break L6;
                        } else {
                          var1_int = ((sb) this).field_r - ((sb) this).field_h;
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
                          if (((sb) this).field_d != null) {
                            ((sb) this).field_d.close();
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          if (((sb) this).field_q != null) {
                            ((sb) this).field_q.close();
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: {
                          if (((sb) this).field_j != null) {
                            ((sb) this).field_j.close();
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
                    ((sb) this).field_e = null;
                    break L0;
                  } else {
                    if (var1_int > 0) {
                      try {
                        L12: {
                          ((sb) this).field_q.write(((sb) this).field_e, var2, var1_int);
                          break L12;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          ((sb) this).field_l = true;
                          break L13;
                        }
                      }
                      ((sb) this).field_h = (((sb) this).field_h - -var1_int) % ((sb) this).field_a;
                      try {
                        L14: {
                          L15: {
                            if (((sb) this).field_h == ((sb) this).field_r) {
                              ((sb) this).field_q.flush();
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
                          ((sb) this).field_l = true;
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
                hc.a((Throwable) (Object) var1_ref, (String) null, (byte) 126);
                break L17;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
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
        try {
          L0: {
            if (!((sb) this).field_i) {
              L1: while (true) {
                if (param2 <= 0) {
                  L2: {
                    if (param1 == 32498) {
                      break L2;
                    } else {
                      ((sb) this).field_i = true;
                      break L2;
                    }
                  }
                  break L0;
                } else {
                  var5_int = ((sb) this).field_d.read(param3, param0, param2);
                  if (var5_int > 0) {
                    param2 = param2 - var5_int;
                    param0 = param0 + var5_int;
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
          L3: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var5;
            stackOut_9_1 = new StringBuilder().append("sb.K(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
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
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
    }

    final static void a(int param0, byte param1, hb param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              hi.field_f.b(105, (rf) (Object) param2);
              hb.a(-114, param0, param2);
              if (param1 == -41) {
                break L1;
              } else {
                field_o = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("sb.B(").append(param0).append(44).append(param1).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final static void a(boolean param0, byte param1) {
        qa.field_a.a(param0, false);
    }

    final void a(int param0, byte[] param1, byte param2, int param3) throws IOException {
        RuntimeException var5 = null;
        Object var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
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
        try {
          L0: {
            if (!((sb) this).field_i) {
              if (((sb) this).field_l) {
                ((sb) this).field_l = false;
                throw new IOException();
              } else {
                L1: {
                  if (((sb) this).field_e == null) {
                    ((sb) this).field_e = new byte[((sb) this).field_a];
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var5_ref = this;
                synchronized (var5_ref) {
                  L2: {
                    if (param2 == 87) {
                      var6 = 0;
                      L3: while (true) {
                        if (var6 >= param3) {
                          L4: {
                            if (((sb) this).field_b != null) {
                              break L4;
                            } else {
                              ((sb) this).field_b = ((sb) this).field_k.a(3, 115, (Runnable) this);
                              break L4;
                            }
                          }
                          this.notifyAll();
                          break L2;
                        } else {
                          ((sb) this).field_e[((sb) this).field_r] = param1[param0 + var6];
                          ((sb) this).field_r = (((sb) this).field_r - -1) % ((sb) this).field_a;
                          if ((-100 + ((sb) this).field_h - -((sb) this).field_a) % ((sb) this).field_a == ((sb) this).field_r) {
                            throw new IOException();
                          } else {
                            var6++;
                            continue L3;
                          }
                        }
                      }
                    } else {
                      return;
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
          L5: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var5;
            stackOut_25_1 = new StringBuilder().append("sb.G(").append(param0).append(44);
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
          throw sd.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    protected final void finalize() {
        ((sb) this).b((byte) -113);
    }

    final int c(int param0) throws IOException {
        if (((sb) this).field_i) {
            return 0;
        }
        if (param0 < 45) {
            sb.a(false, 123, -100, 77, -90, -56, 113, -109);
        }
        return ((sb) this).field_d.available();
    }

    final static ue a(int param0, boolean param1, boolean param2, int param3, byte param4) {
        if (param4 < 100) {
            field_g = null;
        }
        return ri.a(true, param2, param0, param3, false, param1);
    }

    private sb(java.net.Socket param0, ka param1, int param2) throws IOException {
        ((sb) this).field_i = false;
        ((sb) this).field_l = false;
        ((sb) this).field_r = 0;
        ((sb) this).field_h = 0;
        try {
            ((sb) this).field_k = param1;
            ((sb) this).field_j = param0;
            ((sb) this).field_j.setSoTimeout(30000);
            ((sb) this).field_j.setTcpNoDelay(true);
            ((sb) this).field_d = ((sb) this).field_j.getInputStream();
            ((sb) this).field_q = ((sb) this).field_j.getOutputStream();
            ((sb) this).field_a = param2;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "sb.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "<br><br><br>Become a member of Funorb to continue humanity's<br>fight against the Paragulans";
        field_f = "Visit the Account Management section on the main site to view.";
        field_p = "STORY:";
        field_n = new p();
        field_c = 10;
    }
}
