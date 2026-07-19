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
                field_o = (String) null;
                break L1;
              }
            }
            L2: {
              if (mc.a(param1, (byte) 105) == null) {
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
            stackOut_6_0 = (RuntimeException) (var2);
            stackOut_6_1 = new StringBuilder().append("ad.J(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        RuntimeException var5 = null;
        Object var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
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
                var5_ref = this;
                synchronized (var5_ref) {
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
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) (var5);
            stackOut_27_1 = new StringBuilder().append("ad.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param3 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
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
        boolean discarded$4 = false;
        if (param0 != -30119) {
            String var3 = (String) null;
            discarded$4 = ad.a((byte) -118, (String) null);
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
            IOException var1 = null;
            Exception var1_ref = null;
            int var1_int = 0;
            int var2 = 0;
            IOException var3 = null;
            Object var3_ref = null;
            InterruptedException var4 = null;
            Throwable var5 = null;
            int var6 = 0;
            String var7 = null;
            boolean stackIn_4_0 = false;
            int stackIn_12_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            boolean stackOut_3_0 = false;
            int stackOut_11_0 = 0;
            var6 = SolKnight.field_L ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  var3_ref = this;
                  synchronized (var3_ref) {
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
                        stackOut_11_0 = this.field_i;
                        stackIn_12_0 = stackOut_11_0;
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
                          var3 = (IOException) (Object) decompiledCaughtException;
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
                          var3 = (IOException) (Object) decompiledCaughtException;
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
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var6 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (this.field_n) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              stackOut_4_0 = -1;
              stackIn_6_0 = stackOut_4_0;
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
                              stackOut_5_0 = -1;
                              stackIn_6_0 = stackOut_5_0;
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
            stackOut_17_0 = (RuntimeException) (var5);
            stackOut_17_1 = new StringBuilder().append("ad.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
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
        RuntimeException decompiledCaughtException = null;
        pc stackOut_3_0 = null;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        pc stackOut_38_0 = null;
        pc stackOut_43_0 = null;
        Object stackOut_48_0 = null;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        pc stackOut_23_0 = null;
        pc stackOut_10_0 = null;
        pc stackOut_6_0 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        var6 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            if (-1 == (var2_int ^ -1)) {
              stackOut_3_0 = h.field_a;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (64 >= var2_int) {
                if (param1.charAt(0) != 34) {
                  var3 = 0;
                  var4 = 0;
                  L1: while (true) {
                    L2: {
                      if (var2_int <= var4) {
                        stackOut_47_0 = 107;
                        stackOut_47_1 = (param0 - -79) / 45;
                        stackIn_48_0 = stackOut_47_0;
                        stackIn_48_1 = stackOut_47_1;
                        break L2;
                      } else {
                        var5 = param1.charAt(var4);
                        stackOut_31_0 = -47;
                        stackOut_31_1 = var5 ^ -1;
                        stackIn_48_0 = stackOut_31_0;
                        stackIn_48_1 = stackOut_31_1;
                        stackIn_32_0 = stackOut_31_0;
                        stackIn_32_1 = stackOut_31_1;
                        if (var6 != 0) {
                          break L2;
                        } else {
                          L3: {
                            L4: {
                              if (stackIn_32_0 == stackIn_32_1) {
                                L5: {
                                  if (0 == var4) {
                                    break L5;
                                  } else {
                                    if (-1 + var2_int == var4) {
                                      break L5;
                                    } else {
                                      if (var3 == 0) {
                                        var3 = 1;
                                        if (var6 == 0) {
                                          break L3;
                                        } else {
                                          break L4;
                                        }
                                      } else {
                                        break L5;
                                      }
                                    }
                                  }
                                }
                                stackOut_38_0 = si.field_C;
                                stackIn_39_0 = stackOut_38_0;
                                decompiledRegionSelector0 = 4;
                                break L0;
                              } else {
                                break L4;
                              }
                            }
                            if (0 == (ab.field_q.indexOf(var5) ^ -1)) {
                              stackOut_43_0 = si.field_C;
                              stackIn_44_0 = stackOut_43_0;
                              decompiledRegionSelector0 = 5;
                              break L0;
                            } else {
                              var3 = 0;
                              break L3;
                            }
                          }
                          var4++;
                          continue L1;
                        }
                      }
                    }
                    var4 = stackIn_48_0 % stackIn_48_1;
                    stackOut_48_0 = null;
                    stackIn_49_0 = stackOut_48_0;
                    decompiledRegionSelector0 = 6;
                    break L0;
                  }
                } else {
                  if (param1.charAt(var2_int + -1) == 34) {
                    var3 = 0;
                    var4 = 1;
                    L6: while (true) {
                      if (var2_int + -1 > var4) {
                        L7: {
                          L8: {
                            var5 = param1.charAt(var4);
                            if (var5 != 92) {
                              break L8;
                            } else {
                              L9: {
                                if (var3 != 0) {
                                  stackOut_18_0 = 0;
                                  stackIn_19_0 = stackOut_18_0;
                                  break L9;
                                } else {
                                  stackOut_17_0 = 1;
                                  stackIn_19_0 = stackOut_17_0;
                                  break L9;
                                }
                              }
                              var3 = stackIn_19_0;
                              if (var6 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          L10: {
                            if (var5 != 34) {
                              break L10;
                            } else {
                              if (var3 == 0) {
                                stackOut_23_0 = si.field_C;
                                stackIn_24_0 = stackOut_23_0;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                break L10;
                              }
                            }
                          }
                          var3 = 0;
                          break L7;
                        }
                        var4++;
                        continue L6;
                      } else {
                        return null;
                      }
                    }
                  } else {
                    stackOut_10_0 = si.field_C;
                    stackIn_11_0 = stackOut_10_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              } else {
                stackOut_6_0 = el.field_o;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = decompiledCaughtException;
            stackOut_50_0 = (RuntimeException) (var2);
            stackOut_50_1 = new StringBuilder().append("ad.F(").append(param0).append(',');
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param1 == null) {
              stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackOut_52_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L11;
            } else {
              stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L11;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_53_0), stackIn_53_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_24_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_39_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_44_0;
                  } else {
                    return (pc) ((Object) stackIn_49_0);
                  }
                }
              }
            }
          }
        }
    }

    final static int c(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_12_0 = false;
        int stackIn_30_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_4_0 = false;
        boolean stackOut_11_0 = false;
        int stackOut_29_0 = 0;
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
                    stackOut_4_0 = bc.field_K.d((byte) -38);
                    stackIn_12_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (var7 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (stackIn_5_0) {
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
                stackOut_11_0 = bc.field_K.d((byte) -36);
                stackIn_12_0 = stackOut_11_0;
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
              stackOut_29_0 = var3;
              stackIn_30_0 = stackOut_29_0;
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
            InterruptedException var2 = null;
            Object var2_ref = null;
            Throwable var3 = null;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            var4 = SolKnight.field_L ? 1 : 0;
            if (!this.field_n) {
              var2_ref = this;
              synchronized (var2_ref) {
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
                  if (0 != this.field_d.field_c) {
                    if (-2 != (this.field_d.field_c ^ -1)) {
                      this.field_d = null;
                      return;
                    } else {
                      try {
                        L3: {
                          ((Thread) (this.field_d.field_e)).join();
                          break L3;
                        }
                      } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var2 = (InterruptedException) (Object) decompiledCaughtException;
                        this.field_d = null;
                        return;
                      }
                      this.field_d = null;
                      return;
                    }
                  } else {
                    i.a((byte) 56, 1L);
                    if (var4 == 0) {
                      continue L2;
                    } else {
                      return;
                    }
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
