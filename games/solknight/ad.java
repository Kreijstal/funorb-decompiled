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
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var8 = 0;
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
                      if (param2 <= var6) {
                        L4: {
                          if (param0 == -28748) {
                            break L4;
                          } else {
                            field_c = (String[]) null;
                            break L4;
                          }
                        }
                        L5: {
                          if (this.field_d != null) {
                            break L5;
                          } else {
                            this.field_d = this.field_k.a(3, -29, (Runnable) (this));
                            break L5;
                          }
                        }
                        this.notifyAll();
                        break L2;
                      } else {
                        this.field_a[this.field_j] = param3[param1 + var6];
                        this.field_j = (1 + this.field_j) % this.field_f;
                        if (this.field_j != (-100 + (this.field_f + this.field_i)) % this.field_f) {
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
          L6: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var5_ref);

            stackIn_27_1 = new StringBuilder().append("ad.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L6;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L6;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
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
            var6 = SolKnight.field_L ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  var3 = this;
                  synchronized (var3) {
                    L2: {
                      L3: {
                        if (this.field_i != this.field_j) {
                          break L3;
                        } else {
                          if (this.field_n) {
                            decompiledRegionSelector0 = 0;
                            break L2;
                          } else {
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
                          }
                        }
                      }
                      L6: {
                        var2 = this.field_i;
                        if (this.field_j >= this.field_i) {
                          var1_int = -this.field_i + this.field_j;
                          break L6;
                        } else {
                          var1_int = this.field_f + -this.field_i;
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
                          if (this.field_l == null) {
                            break L8;
                          } else {
                            this.field_l.close();
                            break L8;
                          }
                        }
                        L9: {
                          if (null == this.field_g) {
                            break L9;
                          } else {
                            this.field_g.close();
                            break L9;
                          }
                        }
                        L10: {
                          if (null != this.field_e) {
                            this.field_e.close();
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
                    this.field_a = null;
                    break L0;
                  } else {
                    if (-1 <= (var1_int ^ -1)) {
                      continue L1;
                    } else {
                      try {
                        L12: {
                          this.field_g.write(this.field_a, var2, var1_int);
                          break L12;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3_ref = (IOException) (Object) decompiledCaughtException;
                          this.field_p = true;
                          break L13;
                        }
                      }
                      this.field_i = (var1_int + this.field_i) % this.field_f;
                      try {
                        L14: {
                          L15: {
                            if (this.field_i != this.field_j) {
                              break L15;
                            } else {
                              this.field_g.flush();
                              break L15;
                            }
                          }
                          break L14;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L16: {
                          var3_ref = (IOException) (Object) decompiledCaughtException;
                          this.field_p = true;
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
                var7 = (String) null;
                hi.a((Throwable) ((Object) var1_ref), (String) null, 1);
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
        int var5_int = 0;
        int var6 = SolKnight.field_L ? 1 : 0;
        if (!(!this.field_n)) {
            return;
        }
        try {
            while (-1 > (param2 ^ -1)) {
                var5_int = this.field_l.read(param3, param1, param2);
                if (-1 <= (var5_int ^ -1)) {
                    throw new EOFException();
                }
                param2 = param2 - var5_int;
                param1 = param1 + var5_int;
            }
            if (param0 <= 32) {
                this.field_l = (InputStream) null;
                return;
            }
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "ad.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static pc b(byte param0, String param1) {
        pc stackIn_4_0 = null;
        pc stackIn_7_0 = null;
        pc stackIn_11_0 = null;
        int stackIn_19_0 = 0;
        pc stackIn_24_0 = null;
        pc stackIn_37_0 = null;
        pc stackIn_42_0 = null;
        Object stackIn_46_0 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            if (-1 == (var2_int ^ -1)) {
              stackIn_4_0 = h.field_a;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (64 >= var2_int) {
                if (param1.charAt(0) != 34) {
                  var3 = 0;
                  var4 = 0;
                  L1: while (true) {
                    if (var2_int <= var4) {
                      var4 = 107 % ((param0 - -79) / 45);
                      stackIn_46_0 = null;
                      decompiledRegionSelector0 = 6;
                      break L0;
                    } else {
                      L2: {
                        var5 = param1.charAt(var4);
                        if (-47 == (var5 ^ -1)) {
                          L3: {
                            if (0 == var4) {
                              break L3;
                            } else {
                              if (-1 + var2_int == var4) {
                                break L3;
                              } else {
                                if (var3 == 0) {
                                  var3 = 1;
                                  break L2;
                                } else {
                                  break L3;
                                }
                              }
                            }
                          }
                          stackIn_37_0 = si.field_C;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          if (0 == (ab.field_q.indexOf(var5) ^ -1)) {
                            stackIn_42_0 = si.field_C;
                            decompiledRegionSelector0 = 5;
                            break L0;
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
                                  stackIn_24_0 = si.field_C;
                                  decompiledRegionSelector0 = 3;
                                  break L0;
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
                                stackIn_19_0 = 0;
                                break L7;
                              } else {
                                stackIn_19_0 = 1;
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
                    stackIn_11_0 = si.field_C;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              } else {
                stackIn_7_0 = el.field_o;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_49_0 = (RuntimeException) (var2);

            stackIn_49_1 = new StringBuilder().append("ad.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_50_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackIn_50_2 = "null";
              break L8;
            } else {
              stackIn_50_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackIn_50_2 = "{...}";
              break L8;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_50_0), stackIn_50_2 + ')');
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
                  return stackIn_37_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_42_0;
                  } else {
                    return (pc) ((Object) stackIn_46_0);
                  }
                }
              }
            }
          }
        }
    }

    final static int c(int param0) {
        int stackIn_29_0 = 0;
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
              if (!wk.a((byte) -56)) {
                L3: {
                  bc.field_K.a(-121, uc.a(gb.field_j, 1691746689, field_m), uc.a(db.field_o, 1691746689, s.field_gb));
                  if (bc.field_K.d((byte) -36)) {
                    var1_int = 1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    var3 = 0;
                    if (var1_int == 0) {
                      break L5;
                    } else {
                      if (-1 < (bc.field_K.field_f ^ -1)) {
                        break L5;
                      } else {
                        var3 = fl.field_b[bc.field_K.field_f];
                        if (var3 == 2) {
                          kh.a(-78);
                          break L4;
                        } else {
                          if (5 == var3) {
                            kh.a(-78);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  if (var2 == 0) {
                    break L4;
                  } else {
                    if (te.field_M == 2) {
                      break L4;
                    } else {
                      kh.a(-89);
                      break L4;
                    }
                  }
                }
                L6: {
                  if (0 != var3) {
                    break L6;
                  } else {
                    if (te.field_M != 2) {
                      break L6;
                    } else {
                      var4 = je.a(1) + -fg.field_f;
                      var6 = (int)((-var4 + 10999L) / 1000L);
                      if (0 >= var6) {
                        hc.a(true, true, 5);
                        var3 = 2;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                stackIn_29_0 = var3;
                break L0;
              } else {
                L7: {
                  bc.field_K.a(true);
                  if (bc.field_K.d((byte) -38)) {
                    var1_int = 1;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                if (13 == el.field_n) {
                  var2 = 1;
                  continue L2;
                } else {
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var1), "ad.C(" + param0 + ')');
        }
        return stackIn_29_0;
    }

    final void d(int param0) {
        try {
            InterruptedException var2 = null;
            int var4 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Object var2_ref = null;
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
                    L3: {
                      if (-2 != (this.field_d.field_c ^ -1)) {
                        break L3;
                      } else {
                        try {
                          L4: {
                            ((Thread) (this.field_d.field_e)).join();
                            decompiledRegionSelector0 = 0;
                            break L4;
                          }
                        } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          L5: {
                            var2 = (InterruptedException) (Object) decompiledCaughtException;
                            decompiledRegionSelector0 = 1;
                            break L5;
                          }
                        }
                        if (decompiledRegionSelector0 == 0) {
                          this.field_d = null;
                          return;
                        } else {
                          break L3;
                        }
                      }
                    }
                    this.field_d = null;
                    return;
                  } else {
                    i.a((byte) 56, 1L);
                    continue L2;
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
