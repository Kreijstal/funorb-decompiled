/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qk implements Runnable {
    private fd field_j;
    static int field_d;
    private InputStream field_o;
    private boolean field_g;
    static int field_a;
    private int field_r;
    private mh field_p;
    static int field_n;
    static int field_m;
    private java.net.Socket field_l;
    private int field_q;
    private boolean field_c;
    private OutputStream field_b;
    static String[] field_s;
    static int field_i;
    private byte[] field_h;
    static int field_k;
    static String[] field_e;
    private int field_f;

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        RuntimeException var5 = null;
        Object var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int var8 = 0;
        Object stackIn_19_0 = null;
        Object stackIn_30_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_18_0 = null;
        Object stackOut_29_0 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var8 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (((qk) this).field_g) {
              return;
            } else {
              L1: {
                if (param2 == 1) {
                  break L1;
                } else {
                  field_s = null;
                  break L1;
                }
              }
              if (!((qk) this).field_c) {
                L2: {
                  if (((qk) this).field_h == null) {
                    ((qk) this).field_h = new byte[((qk) this).field_r];
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var5_ref = this;
                synchronized (var5_ref) {
                  L3: {
                    var6 = 0;
                    L4: while (true) {
                      L5: {
                        L6: {
                          if (var6 >= param1) {
                            break L6;
                          } else {
                            ((qk) this).field_h[((qk) this).field_f] = param3[param0 + var6];
                            ((qk) this).field_f = (1 + ((qk) this).field_f) % ((qk) this).field_r;
                            stackOut_18_0 = this;
                            stackIn_30_0 = stackOut_18_0;
                            stackIn_19_0 = stackOut_18_0;
                            if (var8 != 0) {
                              break L5;
                            } else {
                              if (((qk) this).field_f == (((qk) this).field_r + ((qk) this).field_q + -100) % ((qk) this).field_r) {
                                throw new IOException();
                              } else {
                                var6++;
                                if (var8 == 0) {
                                  continue L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                        }
                        L7: {
                          if (null != ((qk) this).field_p) {
                            break L7;
                          } else {
                            ((qk) this).field_p = ((qk) this).field_j.a((byte) -45, 3, (Runnable) this);
                            break L7;
                          }
                        }
                        this.notifyAll();
                        stackOut_29_0 = var5_ref;
                        stackIn_30_0 = stackOut_29_0;
                        break L5;
                      }
                      break L3;
                    }
                  }
                }
                break L0;
              } else {
                ((qk) this).field_c = false;
                throw new IOException();
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) var5;
            stackOut_35_1 = new StringBuilder().append("qk.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_38_0 = stackOut_35_0;
            stackIn_38_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param3 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L8;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_39_0 = stackOut_36_0;
              stackIn_39_1 = stackOut_36_1;
              stackIn_39_2 = stackOut_36_2;
              break L8;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + ')');
        }
    }

    final int c(byte param0) throws IOException {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        try {
          L0: {
            if (((qk) this).field_g) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              var2_int = -99 % ((-44 - param0) / 41);
              stackOut_5_0 = ((qk) this).field_o.read();
              stackIn_6_0 = stackOut_5_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2, "qk.J(" + param0 + ')');
        }
        return stackIn_6_0;
    }

    final static String d(byte param0) {
        RuntimeException var1 = null;
        String var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_22_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_7_0 = null;
        String stackOut_21_0 = null;
        Object stackOut_2_0 = null;
        var5 = client.field_A ? 1 : 0;
        try {
          L0: {
            var1_ref = "(" + lg.field_U + " " + bb.field_d + " " + kf.field_L + ") " + bh.field_k;
            if (param0 >= 14) {
              L1: {
                L2: {
                  if (sm.field_e <= 0) {
                    break L2;
                  } else {
                    var1_ref = var1_ref + ":";
                    var2 = 0;
                    L3: while (true) {
                      if (var2 >= sm.field_e) {
                        break L2;
                      } else {
                        stackOut_7_0 = var1_ref + ' ';
                        stackIn_22_0 = stackOut_7_0;
                        stackIn_8_0 = stackOut_7_0;
                        if (var5 != 0) {
                          break L1;
                        } else {
                          L4: {
                            L5: {
                              var1_ref = stackIn_8_0;
                              var3 = de.field_V.field_r[var2] & 255;
                              var4 = var3 >> -1389597532;
                              if (var4 >= 10) {
                                break L5;
                              } else {
                                var4 += 48;
                                if (var5 == 0) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            var4 += 55;
                            break L4;
                          }
                          L6: {
                            L7: {
                              var3 = var3 & 15;
                              var1_ref = var1_ref + (char)var4;
                              if (var3 >= 10) {
                                break L7;
                              } else {
                                var3 += 48;
                                if (var5 == 0) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            var3 += 55;
                            break L6;
                          }
                          var1_ref = var1_ref + (char)var3;
                          var2++;
                          if (var5 == 0) {
                            continue L3;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_21_0 = (String) var1_ref;
                stackIn_22_0 = stackOut_21_0;
                break L1;
              }
              break L0;
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (String) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var1, "qk.F(" + param0 + ')');
        }
        return stackIn_22_0;
    }

    final void a(int param0) {
        Object var2 = null;
        InterruptedException var2_ref = null;
        RuntimeException var2_ref2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (((qk) this).field_g) {
              return;
            } else {
              var2 = this;
              synchronized (var2) {
                L1: {
                  ((qk) this).field_g = true;
                  this.notifyAll();
                  break L1;
                }
              }
              if (param0 == 0) {
                L2: {
                  L3: {
                    if (null != ((qk) this).field_p) {
                      L4: while (true) {
                        L5: {
                          if (((qk) this).field_p.field_c != 0) {
                            break L5;
                          } else {
                            ua.a(1L, param0 ^ -128);
                            if (var4 != 0) {
                              break L2;
                            } else {
                              if (var4 == 0) {
                                continue L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        if (1 != ((qk) this).field_p.field_c) {
                          break L3;
                        } else {
                          try {
                            L6: {
                              ((Thread) ((qk) this).field_p.field_b).join();
                              break L6;
                            }
                          } catch (java.lang.Exception decompiledCaughtParameter0) {
                            decompiledCaughtException = decompiledCaughtParameter0;
                            L7: {
                              var2_ref = (InterruptedException) (Object) decompiledCaughtException;
                              break L7;
                            }
                          }
                          break L3;
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  ((qk) this).field_p = null;
                  break L2;
                }
                break L0;
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2_ref2, "qk.C(" + param0 + ')');
        }
    }

    public final void run() {
        try {
            IOException var1 = null;
            Exception var1_ref = null;
            RuntimeException var1_ref2 = null;
            int var1_int = 0;
            int var2 = 0;
            IOException var3 = null;
            Object var3_ref = null;
            InterruptedException var4 = null;
            Throwable var5 = null;
            int var6 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            var6 = client.field_A ? 1 : 0;
            try {
              L0: {
                try {
                  L1: {
                    L2: while (true) {
                      var3_ref = this;
                      synchronized (var3_ref) {
                        L3: {
                          L4: {
                            if (~((qk) this).field_f == ~((qk) this).field_q) {
                              L5: {
                                if (!((qk) this).field_g) {
                                  break L5;
                                } else {
                                  if (var6 == 0) {
                                    decompiledRegionSelector0 = 0;
                                    break L3;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              {
                                L6: {
                                  this.wait();
                                  break L6;
                                }
                              }
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          L8: {
                            L9: {
                              var2 = ((qk) this).field_q;
                              if (((qk) this).field_q > ((qk) this).field_f) {
                                break L9;
                              } else {
                                var1_int = ((qk) this).field_f + -((qk) this).field_q;
                                if (var6 == 0) {
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            var1_int = ((qk) this).field_r - ((qk) this).field_q;
                            break L8;
                          }
                          decompiledRegionSelector0 = 1;
                          break L3;
                        }
                      }
                      if (decompiledRegionSelector0 == 0) {
                        try {
                          L10: {
                            L11: {
                              if (null != ((qk) this).field_o) {
                                ((qk) this).field_o.close();
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                            L12: {
                              if (null != ((qk) this).field_b) {
                                ((qk) this).field_b.close();
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                            L13: {
                              if (null == ((qk) this).field_l) {
                                break L13;
                              } else {
                                ((qk) this).field_l.close();
                                break L13;
                              }
                            }
                            break L10;
                          }
                        } catch (java.io.IOException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          L14: {
                            var1 = (IOException) (Object) decompiledCaughtException;
                            break L14;
                          }
                        }
                        ((qk) this).field_h = null;
                        break L1;
                      } else {
                        L15: {
                          if (var1_int <= 0) {
                            break L15;
                          } else {
                            try {
                              L16: {
                                ((qk) this).field_b.write(((qk) this).field_h, var2, var1_int);
                                break L16;
                              }
                            } catch (java.lang.Exception decompiledCaughtParameter2) {
                              decompiledCaughtException = decompiledCaughtParameter2;
                              L17: {
                                var3 = (IOException) (Object) decompiledCaughtException;
                                ((qk) this).field_c = true;
                                break L17;
                              }
                            }
                            ((qk) this).field_q = (var1_int + ((qk) this).field_q) % ((qk) this).field_r;
                            try {
                              L18: {
                                L19: {
                                  if (((qk) this).field_f == ((qk) this).field_q) {
                                    ((qk) this).field_b.flush();
                                    break L19;
                                  } else {
                                    break L19;
                                  }
                                }
                                break L18;
                              }
                            } catch (java.lang.Exception decompiledCaughtParameter3) {
                              decompiledCaughtException = decompiledCaughtParameter3;
                              L20: {
                                var3 = (IOException) (Object) decompiledCaughtException;
                                ((qk) this).field_c = true;
                                break L20;
                              }
                            }
                            break L15;
                          }
                        }
                        continue L2;
                      }
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter4) {
                  decompiledCaughtException = decompiledCaughtParameter4;
                  L21: {
                    var1_ref = (Exception) (Object) decompiledCaughtException;
                    qb.a((Throwable) (Object) var1_ref, 16408, (String) null);
                    break L21;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              var1_ref2 = (RuntimeException) (Object) decompiledCaughtException;
              throw dh.a((Throwable) (Object) var1_ref2, "qk.run()");
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    protected final void finalize() {
        try {
            ((qk) this).a(0);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "qk.finalize()");
        }
    }

    final static Object a(byte[] param0, int param1, boolean param2) {
        RuntimeException var3 = null;
        fn var3_ref = null;
        Object stackIn_4_0 = null;
        fn stackIn_9_0 = null;
        byte[] stackIn_15_0 = null;
        byte[] stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        fn stackOut_8_0 = null;
        byte[] stackOut_16_0 = null;
        byte[] stackOut_14_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            if (null == param0) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (136 < param0.length) {
                var3_ref = new fn();
                ((mk) (Object) var3_ref).a(param0, true);
                stackOut_8_0 = (fn) var3_ref;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              } else {
                L1: {
                  if (param1 == -1389597532) {
                    break L1;
                  } else {
                    field_i = 67;
                    break L1;
                  }
                }
                if (!param2) {
                  stackOut_16_0 = (byte[]) param0;
                  stackIn_17_0 = stackOut_16_0;
                  break L0;
                } else {
                  stackOut_14_0 = jd.a(0, param0);
                  stackIn_15_0 = stackOut_14_0;
                  return stackIn_15_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3;
            stackOut_18_1 = new StringBuilder().append("qk.E(");
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L2;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L2;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_17_0;
    }

    final int b(int param0) throws IOException {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        try {
          L0: {
            if (((qk) this).field_g) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (param0 == 0) {
                stackOut_9_0 = ((qk) this).field_o.available();
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_6_0 = -106;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2, "qk.H(" + param0 + ')');
        }
        return stackIn_10_0;
    }

    public static void c(int param0) {
        field_e = null;
        if (param0 != -11657) {
            return;
        }
        try {
            field_s = null;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "qk.D(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, byte param2, byte[] param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        byte stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var6 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (!((qk) this).field_g) {
              L1: while (true) {
                L2: {
                  L3: {
                    if (param0 <= 0) {
                      break L3;
                    } else {
                      var5_int = ((qk) this).field_o.read(param3, param1, param0);
                      stackOut_5_0 = 0;
                      stackOut_5_1 = var5_int;
                      stackIn_13_0 = stackOut_5_0;
                      stackIn_13_1 = stackOut_5_1;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      if (var6 != 0) {
                        break L2;
                      } else {
                        if (stackIn_6_0 >= stackIn_6_1) {
                          throw new EOFException();
                        } else {
                          param1 = param1 + var5_int;
                          param0 = param0 - var5_int;
                          if (var6 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  stackOut_12_0 = param2;
                  stackOut_12_1 = 17;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  break L2;
                }
                L4: {
                  if (stackIn_13_0 == stackIn_13_1) {
                    break L4;
                  } else {
                    ((qk) this).a(31);
                    break L4;
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
            var5 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var5;
            stackOut_17_1 = new StringBuilder().append("qk.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L5;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
    }

    final void b(byte param0) throws IOException {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (((qk) this).field_g) {
              return;
            } else {
              if (param0 <= -21) {
                if (((qk) this).field_c) {
                  ((qk) this).field_c = false;
                  throw new IOException();
                } else {
                  break L0;
                }
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2, "qk.B(" + param0 + ')');
        }
    }

    qk(java.net.Socket param0, fd param1) throws IOException {
        this(param0, param1, 5000);
    }

    final static void a(byte param0) {
        try {
            dj.field_ab.setLength(0);
            pk.field_r = 0;
            if (param0 != 94) {
                field_d = -4;
            }
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "qk.A(" + param0 + ')');
        }
    }

    private qk(java.net.Socket param0, fd param1, int param2) throws IOException {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        ((qk) this).field_g = false;
        ((qk) this).field_c = false;
        ((qk) this).field_q = 0;
        ((qk) this).field_f = 0;
        try {
          L0: {
            ((qk) this).field_j = param1;
            ((qk) this).field_l = param0;
            ((qk) this).field_l.setSoTimeout(30000);
            ((qk) this).field_l.setTcpNoDelay(true);
            ((qk) this).field_o = ((qk) this).field_l.getInputStream();
            ((qk) this).field_b = ((qk) this).field_l.getOutputStream();
            ((qk) this).field_r = param2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("qk.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ')');
        }
    }

    static {
        field_s = new String[]{"Deko Bloko", "Double Deko", "Triple Deko", "Mega Deko", "Double Bloko", "Triple Bloko", "Mini Bombo", "Maxi Bombo", "Tower Bloko", "Massive Attako", "Clean Sweepo", "Uh-Oh Bloko", "Floral Bloko", "Urban Bloko", "Retro Bloko", "Bronze Blokker", "Silver Blokker", "Gold Blokker", "Blok of Beginning", "Blok of Victory", "Blok of Supremacy", "Deko Pwnage", "Ultimate Pwnage", "Quick Deko", "Safe Deko", "Deko Modo", "Shape Mover", "Shape Sender", "Shape Dispatcher", "Shape Consigner", "Shape Shifter"};
        field_e = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
    }
}
