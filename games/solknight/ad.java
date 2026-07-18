/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ad implements Runnable {
    private int field_f;
    private boolean field_p;
    private boolean field_n;
    private byte[] field_a;
    private nj field_d;
    static int field_h;
    static String field_o;
    static hd field_b;
    private int field_j;
    private InputStream field_l;
    private java.net.Socket field_e;
    private dl field_k;
    static String[] field_c;
    private OutputStream field_g;
    static int field_m;
    private int field_i;

    public static void a() {
        field_o = null;
        field_b = null;
        field_c = null;
    }

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param0 < -11) {
                break L1;
              } else {
                field_o = null;
                break L1;
              }
            }
            L2: {
              int discarded$8 = 105;
              if (mc.a(param1) == null) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("ad.J(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_5_0 != 0;
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
        var8 = SolKnight.field_L ? 1 : 0;
        try {
          if (!((ad) this).field_n) {
            if (!((ad) this).field_p) {
              L0: {
                if (((ad) this).field_a == null) {
                  ((ad) this).field_a = new byte[((ad) this).field_f];
                  break L0;
                } else {
                  break L0;
                }
              }
              var5_ref = this;
              synchronized (var5_ref) {
                L1: {
                  var6 = 0;
                  L2: while (true) {
                    if (param2 <= var6) {
                      L3: {
                        if (param0 == -28748) {
                          break L3;
                        } else {
                          field_c = null;
                          break L3;
                        }
                      }
                      L4: {
                        if (((ad) this).field_d != null) {
                          break L4;
                        } else {
                          ((ad) this).field_d = ((ad) this).field_k.a(3, -29, (Runnable) this);
                          break L4;
                        }
                      }
                      this.notifyAll();
                      break L1;
                    } else {
                      ((ad) this).field_a[((ad) this).field_j] = param3[param1 + var6];
                      ((ad) this).field_j = (1 + ((ad) this).field_j) % ((ad) this).field_f;
                      if (((ad) this).field_j != (-100 + (((ad) this).field_f + ((ad) this).field_i)) % ((ad) this).field_f) {
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
            } else {
              ((ad) this).field_p = false;
              throw new IOException();
            }
          } else {
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var5;
            stackOut_23_1 = new StringBuilder().append("ad.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
              break L5;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L5;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ')');
        }
    }

    final void a(boolean param0) throws IOException {
        if (param0) {
          if (!((ad) this).field_n) {
            if (((ad) this).field_p) {
              ((ad) this).field_p = false;
              throw new IOException();
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          ((ad) this).run();
          if (!((ad) this).field_n) {
            if (((ad) this).field_p) {
              ((ad) this).field_p = false;
              throw new IOException();
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final int b(int param0) throws IOException {
        if (param0 != -30119) {
            Object var3 = null;
            boolean discarded$4 = ad.a((byte) -118, (String) null);
            if (!(!((ad) this).field_n)) {
                return 0;
            }
            return ((ad) this).field_l.available();
        }
        if (!(!((ad) this).field_n)) {
            return 0;
        }
        return ((ad) this).field_l.available();
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
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            var6 = SolKnight.field_L ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  var3_ref = this;
                  synchronized (var3_ref) {
                    L2: {
                      L3: {
                        if (((ad) this).field_i != ((ad) this).field_j) {
                          break L3;
                        } else {
                          if (((ad) this).field_n) {
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
                        var2 = ((ad) this).field_i;
                        if (((ad) this).field_j >= ((ad) this).field_i) {
                          var1_int = -((ad) this).field_i + ((ad) this).field_j;
                          break L6;
                        } else {
                          var1_int = ((ad) this).field_f + -((ad) this).field_i;
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
                          if (((ad) this).field_l == null) {
                            break L8;
                          } else {
                            ((ad) this).field_l.close();
                            break L8;
                          }
                        }
                        L9: {
                          if (null == ((ad) this).field_g) {
                            break L9;
                          } else {
                            ((ad) this).field_g.close();
                            break L9;
                          }
                        }
                        L10: {
                          if (null != ((ad) this).field_e) {
                            ((ad) this).field_e.close();
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
                    ((ad) this).field_a = null;
                    break L0;
                  } else {
                    if (var1_int <= 0) {
                      continue L1;
                    } else {
                      try {
                        L12: {
                          ((ad) this).field_g.write(((ad) this).field_a, var2, var1_int);
                          break L12;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          ((ad) this).field_p = true;
                          break L13;
                        }
                      }
                      ((ad) this).field_i = (var1_int + ((ad) this).field_i) % ((ad) this).field_f;
                      try {
                        L14: {
                          L15: {
                            if (((ad) this).field_i != ((ad) this).field_j) {
                              break L15;
                            } else {
                              ((ad) this).field_g.flush();
                              break L15;
                            }
                          }
                          break L14;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L16: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          ((ad) this).field_p = true;
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
                int discarded$1 = 1;
                hi.a((Throwable) (Object) var1_ref, (String) null);
                break L17;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    ad(java.net.Socket param0, dl param1) throws IOException {
        this(param0, param1, 5000);
    }

    final static int a(int param0, int param1) {
        if (null != dh.field_j) {
          field_b = null;
          if (param1 >= sa.field_m) {
            if (sa.field_m - -dh.field_j.field_p > param1) {
              L0: {
                if (param0 < da.field_f) {
                  break L0;
                } else {
                  if (dh.field_j.field_t + da.field_f <= param0) {
                    break L0;
                  } else {
                    return 0;
                  }
                }
              }
              if (ke.field_I <= param1) {
                if (ke.field_I + dh.field_j.field_p > param1) {
                  if (lk.field_c <= param0) {
                    if (param0 < dh.field_j.field_t + lk.field_c) {
                      return 1;
                    } else {
                      return -1;
                    }
                  } else {
                    return -1;
                  }
                } else {
                  return -1;
                }
              } else {
                return -1;
              }
            } else {
              if (ke.field_I <= param1) {
                if (ke.field_I + dh.field_j.field_p > param1) {
                  if (lk.field_c <= param0) {
                    if (param0 >= dh.field_j.field_t + lk.field_c) {
                      return -1;
                    } else {
                      return 1;
                    }
                  } else {
                    return -1;
                  }
                } else {
                  return -1;
                }
              } else {
                return -1;
              }
            }
          } else {
            if (ke.field_I <= param1) {
              if (ke.field_I + dh.field_j.field_p > param1) {
                if (lk.field_c <= param0) {
                  if (param0 >= dh.field_j.field_t + lk.field_c) {
                    return -1;
                  } else {
                    return 1;
                  }
                } else {
                  return -1;
                }
              } else {
                return -1;
              }
            } else {
              return -1;
            }
          }
        } else {
          return -1;
        }
    }

    final int a(int param0) throws IOException {
        if (((ad) this).field_n) {
            return 0;
        }
        if (param0 > -104) {
            ((ad) this).run();
            return ((ad) this).field_l.read();
        }
        return ((ad) this).field_l.read();
    }

    protected final void finalize() {
        ((ad) this).d(2);
    }

    final void a(byte param0, int param1, int param2, byte[] param3) throws IOException {
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
        var6 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (((ad) this).field_n) {
              return;
            } else {
              L1: while (true) {
                if (param2 <= 0) {
                  if (param0 > 32) {
                    break L0;
                  } else {
                    ((ad) this).field_l = null;
                    return;
                  }
                } else {
                  var5_int = ((ad) this).field_l.read(param3, param1, param2);
                  if (var5_int > 0) {
                    param2 = param2 - var5_int;
                    param1 = param1 + var5_int;
                    continue L1;
                  } else {
                    throw new EOFException();
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("ad.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
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
          throw fc.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
    }

    final static pc b(byte param0, String param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        pc stackIn_4_0 = null;
        pc stackIn_7_0 = null;
        pc stackIn_11_0 = null;
        int stackIn_19_0 = 0;
        pc stackIn_24_0 = null;
        pc stackIn_37_0 = null;
        pc stackIn_42_0 = null;
        Object stackIn_47_0 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        pc stackOut_3_0 = null;
        Object stackOut_46_0 = null;
        pc stackOut_36_0 = null;
        pc stackOut_41_0 = null;
        pc stackOut_23_0 = null;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        pc stackOut_10_0 = null;
        pc stackOut_6_0 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        var6 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            if (var2_int == 0) {
              stackOut_3_0 = h.field_a;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (64 >= var2_int) {
                if (param1.charAt(0) != 34) {
                  var3 = 0;
                  var4 = 0;
                  L1: while (true) {
                    if (var2_int <= var4) {
                      var4 = 0;
                      stackOut_46_0 = null;
                      stackIn_47_0 = stackOut_46_0;
                      break L0;
                    } else {
                      L2: {
                        var5 = param1.charAt(var4);
                        if (var5 == 46) {
                          L3: {
                            if (0 == var4) {
                              break L3;
                            } else {
                              if (-1 + var2_int == var4) {
                                break L3;
                              } else {
                                if (var3 == 0) {
                                  var3 = 1;
                                  var4++;
                                  break L2;
                                } else {
                                  break L3;
                                }
                              }
                            }
                          }
                          stackOut_36_0 = si.field_C;
                          stackIn_37_0 = stackOut_36_0;
                          return stackIn_37_0;
                        } else {
                          if (ab.field_q.indexOf(var5) == -1) {
                            stackOut_41_0 = si.field_C;
                            stackIn_42_0 = stackOut_41_0;
                            return stackIn_42_0;
                          } else {
                            var3 = 0;
                            break L2;
                          }
                        }
                      }
                      var4++;
                      continue L1;
                    }
                  }
                } else {
                  if (param1.charAt(var2_int + -1) == 34) {
                    var3 = 0;
                    var4 = 1;
                    L4: while (true) {
                      if (var2_int + -1 > var4) {
                        L5: {
                          var5 = param1.charAt(var4);
                          if (var5 != 92) {
                            L6: {
                              if (var5 != 34) {
                                break L6;
                              } else {
                                if (var3 == 0) {
                                  stackOut_23_0 = si.field_C;
                                  stackIn_24_0 = stackOut_23_0;
                                  return stackIn_24_0;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            var3 = 0;
                            break L5;
                          } else {
                            L7: {
                              if (var3 != 0) {
                                stackOut_18_0 = 0;
                                stackIn_19_0 = stackOut_18_0;
                                break L7;
                              } else {
                                stackOut_17_0 = 1;
                                stackIn_19_0 = stackOut_17_0;
                                break L7;
                              }
                            }
                            var3 = stackIn_19_0;
                            break L5;
                          }
                        }
                        var4++;
                        continue L4;
                      } else {
                        return null;
                      }
                    }
                  } else {
                    stackOut_10_0 = si.field_C;
                    stackIn_11_0 = stackOut_10_0;
                    return stackIn_11_0;
                  }
                }
              } else {
                stackOut_6_0 = el.field_o;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_48_0 = (RuntimeException) var2;
            stackOut_48_1 = new StringBuilder().append("ad.F(").append(-126).append(',');
            stackIn_50_0 = stackOut_48_0;
            stackIn_50_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (param1 == null) {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L8;
            } else {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "{...}";
              stackIn_51_0 = stackOut_49_0;
              stackIn_51_1 = stackOut_49_1;
              stackIn_51_2 = stackOut_49_2;
              break L8;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_51_0, stackIn_51_2 + ')');
        }
        return (pc) (Object) stackIn_47_0;
    }

    final static int c() {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int stackIn_28_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_27_0 = 0;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            var2 = 0;
            L1: while (true) {
              int discarded$1 = -56;
              if (!wk.a()) {
                L2: {
                  bc.field_K.a(-121, uc.a(gb.field_j, 1691746689, field_m), uc.a(db.field_o, 1691746689, s.field_gb));
                  if (bc.field_K.d((byte) -36)) {
                    var1_int = 1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var3 = 0;
                    if (var1_int == 0) {
                      break L4;
                    } else {
                      if (bc.field_K.field_f < 0) {
                        break L4;
                      } else {
                        var3 = fl.field_b[bc.field_K.field_f];
                        if (var3 == 2) {
                          kh.a(-78);
                          break L3;
                        } else {
                          if (5 == var3) {
                            kh.a(-78);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  if (var2 == 0) {
                    break L3;
                  } else {
                    if (te.field_M == 2) {
                      break L3;
                    } else {
                      kh.a(-89);
                      break L3;
                    }
                  }
                }
                L5: {
                  if (0 != var3) {
                    break L5;
                  } else {
                    if (te.field_M != 2) {
                      break L5;
                    } else {
                      var4 = je.a(1) + -fg.field_f;
                      var6 = (int)((-var4 + 10999L) / 1000L);
                      if (0 >= var6) {
                        hc.a(true, true, 5);
                        var3 = 2;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                stackOut_27_0 = var3;
                stackIn_28_0 = stackOut_27_0;
                break L0;
              } else {
                L6: {
                  bc.field_K.a(true);
                  if (bc.field_K.d((byte) -38)) {
                    var1_int = 1;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                if (13 == el.field_n) {
                  var2 = 1;
                  continue L1;
                } else {
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fc.a((Throwable) (Object) var1, "ad.C(" + 119 + ')');
        }
        return stackIn_28_0;
    }

    final void d(int param0) {
        Object var2 = null;
        InterruptedException var2_ref = null;
        Throwable var3 = null;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        var4 = SolKnight.field_L ? 1 : 0;
        if (!((ad) this).field_n) {
          var2 = this;
          synchronized (var2) {
            L0: {
              L1: {
                if (param0 == 2) {
                  break L1;
                } else {
                  field_m = -24;
                  break L1;
                }
              }
              ((ad) this).field_n = true;
              this.notifyAll();
              break L0;
            }
          }
          if (null != ((ad) this).field_d) {
            L2: while (true) {
              if (0 != ((ad) this).field_d.field_c) {
                L3: {
                  if (((ad) this).field_d.field_c != 1) {
                    break L3;
                  } else {
                    try {
                      L4: {
                        ((Thread) ((ad) this).field_d.field_e).join();
                        decompiledRegionSelector0 = 0;
                        break L4;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        var2_ref = (InterruptedException) (Object) decompiledCaughtException;
                        decompiledRegionSelector0 = 1;
                        break L5;
                      }
                    }
                    if (decompiledRegionSelector0 == 0) {
                      ((ad) this).field_d = null;
                      return;
                    } else {
                      break L3;
                    }
                  }
                }
                ((ad) this).field_d = null;
                return;
              } else {
                i.a((byte) 56, 1L);
                continue L2;
              }
            }
          } else {
            ((ad) this).field_d = null;
            return;
          }
        } else {
          return;
        }
    }

    private ad(java.net.Socket param0, dl param1, int param2) throws IOException {
        ((ad) this).field_n = false;
        ((ad) this).field_j = 0;
        ((ad) this).field_i = 0;
        ((ad) this).field_p = false;
        try {
            ((ad) this).field_k = param1;
            ((ad) this).field_e = param0;
            ((ad) this).field_e.setSoTimeout(30000);
            ((ad) this).field_e.setTcpNoDelay(true);
            ((ad) this).field_l = ((ad) this).field_e.getInputStream();
            ((ad) this).field_g = ((ad) this).field_e.getOutputStream();
            ((ad) this).field_f = param2;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "ad.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Friends can be added in multiplayer<nbsp>games";
        field_c = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_m = 0;
    }
}
