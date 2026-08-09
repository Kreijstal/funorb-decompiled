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

    public static void a(byte param0) {
        field_o = null;
        field_b = null;
        if (param0 < 64) {
            field_c = (String[]) null;
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 < -11) {
                break L1;
              } else {
                field_o = (String) null;
                break L1;
              }
            }
            L2: {
              if (mc.a(param1, (byte) 105) == null) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("ad.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var8 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (!this.field_n) {
              if (!this.field_p) {
                L1: {
                  if (this.field_a == null) {
                    this.field_a = new byte[this.field_f];
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var5 = this;
                synchronized (var5) {
                  L2: {
                    var6 = 0;
                    L3: while (true) {
                      L4: {
                        L5: {
                          L6: {
                            if (param2 <= var6) {
                              break L6;
                            } else {
                              this.field_a[this.field_j] = param3[param1 + var6];
                              this.field_j = (1 + this.field_j) % this.field_f;
                              var10 = (-100 + (this.field_f + this.field_i)) % this.field_f;
                              var9 = this.field_j;
                              if (var8 != 0) {
                                if (var9 == var10) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              } else {
                                if (var9 != var10) {
                                  var6++;
                                  if (var8 == 0) {
                                    continue L3;
                                  } else {
                                    break L6;
                                  }
                                } else {
                                  throw new IOException();
                                }
                              }
                            }
                          }
                          if (param0 == -28748) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                        field_c = (String[]) null;
                        break L4;
                      }
                      L7: {
                        if (this.field_d != null) {
                          break L7;
                        } else {
                          this.field_d = this.field_k.a(3, -29, (Runnable) (this));
                          break L7;
                        }
                      }
                      this.notifyAll();
                      break L2;
                    }
                  }
                }
                return;
              } else {
                this.field_p = false;
                throw new IOException();
              }
            } else {
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var5_ref);

            stackIn_29_1 = new StringBuilder().append("ad.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L8;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L8;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ')');
        }
    }

    final void a(boolean param0) throws IOException {
        if (param0) {
          if (!this.field_n) {
            if (this.field_p) {
              this.field_p = false;
              throw new IOException();
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          this.run();
          if (!this.field_n) {
            if (this.field_p) {
              this.field_p = false;
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
            String var3 = (String) null;
            ad.a((byte) -118, (String) null);
            if (!(!this.field_n)) {
                return 0;
            }
            return this.field_l.available();
        }
        if (!(!this.field_n)) {
            return 0;
        }
        return this.field_l.available();
    }

    public final void run() {
        try {
            boolean stackIn_4_0 = false;
            int stackIn_12_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            boolean stackOut_3_0;
            int var1_int = 0;
            IOException var1 = null;
            Exception var1_ref = null;
            int var2 = 0;
            Object var3 = null;
            IOException var3_ref = null;
            InterruptedException var4 = null;
            int var6 = 0;
            String var7 = null;
            var6 = SolKnight.field_L ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  var3 = this;
                  synchronized (var3) {
                    L2: {
                      L3: {
                        L4: {
                          if (this.field_i != this.field_j) {
                            break L4;
                          } else {
                            stackOut_3_0 = this.field_n;
                            stackIn_12_0 = stackOut_3_0 ? 1 : 0;
                            stackIn_4_0 = stackOut_3_0;
                            if (var6 != 0) {
                              break L3;
                            } else {
                              L5: {
                                if (stackIn_4_0) {
                                  if (var6 == 0) {
                                    decompiledRegionSelector0 = 0;
                                    break L2;
                                  } else {
                                    break L5;
                                  }
                                } else {
                                  break L5;
                                }
                              }
                              try {
                                L6: {
                                  this.wait();
                                  break L6;
                                }
                              } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                                decompiledCaughtException = decompiledCaughtParameter0;
                                L7: {
                                  var4 = (InterruptedException) (Object) decompiledCaughtException;
                                  break L7;
                                }
                              }
                              break L4;
                            }
                          }
                        }
                        stackIn_12_0 = this.field_i;
                        break L3;
                      }
                      L8: {
                        L9: {
                          var2 = stackIn_12_0;
                          if (this.field_j >= this.field_i) {
                            break L9;
                          } else {
                            var1_int = this.field_f + -this.field_i;
                            if (var6 == 0) {
                              break L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                        var1_int = -this.field_i + this.field_j;
                        break L8;
                      }
                      decompiledRegionSelector0 = 1;
                      break L2;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    try {
                      L10: {
                        L11: {
                          if (this.field_l == null) {
                            break L11;
                          } else {
                            this.field_l.close();
                            break L11;
                          }
                        }
                        L12: {
                          if (null == this.field_g) {
                            break L12;
                          } else {
                            this.field_g.close();
                            break L12;
                          }
                        }
                        L13: {
                          if (null != this.field_e) {
                            this.field_e.close();
                            break L13;
                          } else {
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
                    this.field_a = null;
                    break L0;
                  } else {
                    if (-1 <= (var1_int ^ -1)) {
                      continue L1;
                    } else {
                      try {
                        L15: {
                          this.field_g.write(this.field_a, var2, var1_int);
                          break L15;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L16: {
                          var3_ref = (IOException) (Object) decompiledCaughtException;
                          this.field_p = true;
                          break L16;
                        }
                      }
                      this.field_i = (var1_int + this.field_i) % this.field_f;
                      try {
                        L17: {
                          L18: {
                            if (this.field_i != this.field_j) {
                              break L18;
                            } else {
                              this.field_g.flush();
                              break L18;
                            }
                          }
                          break L17;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L19: {
                          var3_ref = (IOException) (Object) decompiledCaughtException;
                          this.field_p = true;
                          break L19;
                        }
                      }
                      continue L1;
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter4) {
              decompiledCaughtException = decompiledCaughtParameter4;
              L20: {
                var1_ref = (Exception) (Object) decompiledCaughtException;
                var7 = (String) null;
                hi.a((Throwable) ((Object) var1_ref), (String) null, 1);
                break L20;
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

    final static int a(int param0, int param1, int param2) {
        if (null != dh.field_j) {
          if (param2 == 0) {
            L0: {
              if (param1 < sa.field_m) {
                break L0;
              } else {
                if (sa.field_m - -dh.field_j.field_p <= param1) {
                  break L0;
                } else {
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
            field_b = (hd) null;
            if (param1 >= sa.field_m) {
              if (sa.field_m - -dh.field_j.field_p > param1) {
                L1: {
                  if (param0 < da.field_f) {
                    break L1;
                  } else {
                    if (dh.field_j.field_t + da.field_f <= param0) {
                      break L1;
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
          }
        } else {
          return -1;
        }
    }

    final int a(int param0) throws IOException {
        if (this.field_n) {
            return 0;
        }
        if (param0 > -104) {
            this.run();
            return this.field_l.read();
        }
        return this.field_l.read();
    }

    protected final void finalize() {
        this.d(2);
    }

    final void a(byte param0, int param1, int param2, byte[] param3) throws IOException {
        int var6 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var7 = 0;
        int var8 = 0;
        var6 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (this.field_n) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              stackIn_6_0 = -1;
              L1: while (true) {
                L2: {
                  L3: {
                    L4: {
                      if (stackIn_6_0 <= (param2 ^ -1)) {
                        break L4;
                      } else {
                        var5_int = this.field_l.read(param3, param1, param2);
                        var8 = var5_int ^ -1;
                        var7 = -1;
                        if (var6 != 0) {
                          if (var7 > var8) {
                            break L2;
                          } else {
                            break L3;
                          }
                        } else {
                          if (var7 > var8) {
                            param2 = param2 - var5_int;
                            param1 = param1 + var5_int;
                            if (var6 == 0) {
                              stackIn_6_0 = -1;
                              continue L1;
                            } else {
                              break L4;
                            }
                          } else {
                            throw new EOFException();
                          }
                        }
                      }
                    }
                    if (param0 > 32) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                  this.field_l = (InputStream) null;
                  return;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var5);

            stackIn_19_1 = new StringBuilder().append("ad.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static pc b(byte param0, String param1) {
        pc stackIn_4_0 = null;
        pc stackIn_7_0 = null;
        pc stackIn_11_0 = null;
        int stackIn_19_0 = 0;
        pc stackIn_24_0 = null;
        Object stackIn_28_0 = null;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        pc stackIn_39_0 = null;
        pc stackIn_44_0 = null;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        Object stackIn_49_0 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = SolKnight.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = param1.length();
                        if (-1 == (var2_int ^ -1)) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_4_0 = h.field_a;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return stackIn_4_0;
                }
                case 5: {
                    try {
                        if (64 >= var2_int) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_7_0 = el.field_o;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0;
                }
                case 8: {
                    try {
                        if (param1.charAt(0) != 34) {
                            statePc = 29;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (param1.charAt(var2_int + -1) == 34) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_11_0 = si.field_C;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return stackIn_11_0;
                }
                case 12: {
                    try {
                        var3 = 0;
                        var4 = 1;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var2_int + -1 > var4) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        return null;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var5 = param1.charAt(var4);
                        if (var5 != 92) {
                            statePc = 20;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var3 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_19_0 = 1;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_19_0 = 0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var3 = stackIn_19_0;
                        if (var6 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var5 != 34) {
                            statePc = 25;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var3 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackIn_24_0 = si.field_C;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 24: {
                    return stackIn_24_0;
                }
                case 25: {
                    try {
                        var3 = 0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var4++;
                        if (var6 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackIn_28_0 = null;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 28: {
                    return (pc) ((Object) stackIn_28_0);
                }
                case 29: {
                    try {
                        var3 = 0;
                        var4 = 0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (var2_int <= var4) {
                            statePc = 47;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var5 = param1.charAt(var4);
                        stackIn_48_0 = -47;
                        stackIn_32_0 = stackIn_48_0;
                        stackIn_48_1 = var5 ^ -1;
                        stackIn_32_1 = stackIn_48_1;
                        if (var6 != 0) {
                            statePc = 48;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (stackIn_32_0 == stackIn_32_1) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (0 == var4) {
                            statePc = 38;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (-1 + var2_int == var4) {
                            statePc = 38;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (var3 == 0) {
                            statePc = 40;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackIn_39_0 = si.field_C;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 39: {
                    return stackIn_39_0;
                }
                case 40: {
                    try {
                        var3 = 1;
                        if (var6 == 0) {
                            statePc = 46;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (0 == (ab.field_q.indexOf(var5) ^ -1)) {
                            statePc = 43;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackIn_44_0 = si.field_C;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 44: {
                    return stackIn_44_0;
                }
                case 45: {
                    try {
                        var3 = 0;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var4++;
                        if (var6 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        stackIn_48_0 = 107;
                        stackIn_48_1 = (param0 - -79) / 45;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var4 = stackIn_48_0 % stackIn_48_1;
                        stackIn_49_0 = null;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 49: {
                    return (pc) ((Object) stackIn_49_0);
                }
                case 50: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_52_0 = (RuntimeException) (var2);
                    stackIn_51_0 = stackIn_52_0;
                    stackIn_52_1 = new StringBuilder().append("ad.F(").append(param0).append(',');
                    stackIn_51_1 = stackIn_52_1;
                    if (param1 == null) {
                        statePc = 52;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    stackIn_53_0 = (RuntimeException) ((Object) stackIn_51_0);
                    stackIn_53_1 = (StringBuilder) ((Object) stackIn_51_1);
                    stackIn_53_2 = "{...}";
                    statePc = 53;
                    continue stateLoop;
                }
                case 52: {
                    stackIn_53_0 = (RuntimeException) ((Object) stackIn_52_0);
                    stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
                    stackIn_53_2 = "null";
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    throw fc.a((Throwable) ((Object) stackIn_53_0), stackIn_53_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int c(int param0) {
        boolean stackIn_12_0 = false;
        int stackIn_30_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = 0;
              var2 = 0;
              if (param0 > 64) {
                break L1;
              } else {
                field_b = (hd) null;
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  if (!wk.a((byte) -56)) {
                    break L4;
                  } else {
                    bc.field_K.a(true);
                    stackIn_12_0 = bc.field_K.d((byte) -38);

                    if (var7 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (stackIn_12_0) {
                          var1_int = 1;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      if (13 == el.field_n) {
                        var2 = 1;
                        if (var7 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      } else {
                        continue L2;
                      }
                    }
                  }
                }
                bc.field_K.a(-121, uc.a(gb.field_j, 1691746689, field_m), uc.a(db.field_o, 1691746689, s.field_gb));
                stackIn_12_0 = bc.field_K.d((byte) -36);
                break L3;
              }
              L6: {
                if (stackIn_12_0) {
                  var1_int = 1;
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                L8: {
                  var3 = 0;
                  if (var1_int == 0) {
                    break L8;
                  } else {
                    if (-1 < (bc.field_K.field_f ^ -1)) {
                      break L8;
                    } else {
                      L9: {
                        var3 = fl.field_b[bc.field_K.field_f];
                        if (var3 == 2) {
                          break L9;
                        } else {
                          if (5 == var3) {
                            break L9;
                          } else {
                            break L7;
                          }
                        }
                      }
                      kh.a(-78);
                      if (var7 == 0) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                }
                if (var2 == 0) {
                  break L7;
                } else {
                  if (te.field_M == 2) {
                    break L7;
                  } else {
                    kh.a(-89);
                    break L7;
                  }
                }
              }
              L10: {
                if (0 != var3) {
                  break L10;
                } else {
                  if (te.field_M != 2) {
                    break L10;
                  } else {
                    var4 = je.a(1) + -fg.field_f;
                    var6 = (int)((-var4 + 10999L) / 1000L);
                    if (0 >= var6) {
                      hc.a(true, true, 5);
                      var3 = 2;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                }
              }
              stackIn_30_0 = var3;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var1), "ad.C(" + param0 + ')');
        }
        return stackIn_30_0;
    }

    final void d(int param0) {
        try {
            Throwable decompiledCaughtException = null;
            Object var2 = null;
            InterruptedException var2_ref = null;
            int var4 = 0;
            var4 = SolKnight.field_L ? 1 : 0;
            if (!this.field_n) {
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
                  this.field_n = true;
                  this.notifyAll();
                  break L0;
                }
              }
              if (null != this.field_d) {
                L2: while (true) {
                  L3: {
                    if (0 != this.field_d.field_c) {
                      break L3;
                    } else {
                      i.a((byte) 56, 1L);
                      if (var4 == 0) {
                        if (var4 == 0) {
                          continue L2;
                        } else {
                          break L3;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                  if (-2 != (this.field_d.field_c ^ -1)) {
                    this.field_d = null;
                    return;
                  } else {
                    try {
                      L4: {
                        ((Thread) (this.field_d.field_e)).join();
                        break L4;
                      }
                    } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var2_ref = (InterruptedException) (Object) decompiledCaughtException;
                      this.field_d = null;
                      return;
                    }
                    this.field_d = null;
                    return;
                  }
                }
              } else {
                this.field_d = null;
                return;
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

    private ad(java.net.Socket param0, dl param1, int param2) throws IOException {
        this.field_n = false;
        this.field_j = 0;
        this.field_i = 0;
        this.field_p = false;
        try {
            this.field_k = param1;
            this.field_e = param0;
            this.field_e.setSoTimeout(30000);
            this.field_e.setTcpNoDelay(true);
            this.field_l = this.field_e.getInputStream();
            this.field_g = this.field_e.getOutputStream();
            this.field_f = param2;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "ad.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_o = "Friends can be added in multiplayer<nbsp>games";
        field_c = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_m = 0;
    }
}
