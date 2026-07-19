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
        Object stackIn_15_0 = null;
        Object stackIn_22_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_21_0 = null;
        Object stackOut_14_0 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var8 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (this.field_g) {
              break L0;
            } else {
              L1: {
                if (param2 == 1) {
                  break L1;
                } else {
                  field_s = (String[]) null;
                  break L1;
                }
              }
              if (!this.field_c) {
                L2: {
                  if (this.field_h == null) {
                    this.field_h = new byte[this.field_r];
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
                        if (var6 >= param1) {
                          L6: {
                            if (null != this.field_p) {
                              break L6;
                            } else {
                              this.field_p = this.field_j.a((byte) -45, 3, (Runnable) (this));
                              break L6;
                            }
                          }
                          this.notifyAll();
                          stackOut_21_0 = var5_ref;
                          stackIn_22_0 = stackOut_21_0;
                          break L5;
                        } else {
                          this.field_h[this.field_f] = param3[param0 + var6];
                          this.field_f = (1 + this.field_f) % this.field_r;
                          stackOut_14_0 = this;
                          stackIn_22_0 = stackOut_14_0;
                          stackIn_15_0 = stackOut_14_0;
                          if (var8 != 0) {
                            break L5;
                          } else {
                            if (((qk) (this)).field_f == (this.field_r + this.field_q + -100) % this.field_r) {
                              throw new IOException();
                            } else {
                              var6++;
                              continue L4;
                            }
                          }
                        }
                      }
                      break L3;
                    }
                  }
                }
                return;
              } else {
                this.field_c = false;
                throw new IOException();
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) (var5);
            stackOut_27_1 = new StringBuilder().append("qk.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
              break L7;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L7;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ')');
        }
    }

    final int c(byte param0) throws IOException {
        if (!(!this.field_g)) {
            return 0;
        }
        int var2 = -99 % ((-44 - param0) / 41);
        return this.field_o.read();
    }

    final static String d(byte param0) {
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        String stackIn_8_0 = null;
        String stackIn_9_0 = null;
        String stackOut_7_0 = null;
        var5 = client.field_A ? 1 : 0;
        var6 = "(" + lg.field_U + " " + bb.field_d + " " + kf.field_L + ") " + bh.field_k;
        var1 = var6;
        if (param0 >= 14) {
          if (-1 > (sm.field_e ^ -1)) {
            var1 = var6 + ":";
            var2 = 0;
            L0: while (true) {
              if (var2 < sm.field_e) {
                stackOut_7_0 = var1 + ' ';
                stackIn_9_0 = stackOut_7_0;
                stackIn_8_0 = stackOut_7_0;
                if (var5 == 0) {
                  L1: {
                    L2: {
                      var7 = stackIn_9_0;
                      var3 = de.field_V.field_r[var2] & 255;
                      var4 = var3 >> -1389597532;
                      if (var4 >= 10) {
                        break L2;
                      } else {
                        var4 += 48;
                        if (var5 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    var4 += 55;
                    break L1;
                  }
                  L3: {
                    L4: {
                      var3 = var3 & 15;
                      var8 = var7 + (char)var4;
                      if (-11 >= (var3 ^ -1)) {
                        break L4;
                      } else {
                        var3 += 48;
                        if (var5 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var3 += 55;
                    break L3;
                  }
                  var1 = var8 + (char)var3;
                  var2++;
                  continue L0;
                } else {
                  return stackIn_8_0;
                }
              } else {
                return var1;
              }
            }
          } else {
            return var1;
          }
        } else {
          return (String) null;
        }
    }

    final void a(int param0) {
        try {
            InterruptedException var2 = null;
            Object var2_ref = null;
            Throwable var3 = null;
            int var4 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            var4 = client.field_A ? 1 : 0;
            if (this.field_g) {
              return;
            } else {
              var2_ref = this;
              synchronized (var2_ref) {
                L0: {
                  this.field_g = true;
                  this.notifyAll();
                  break L0;
                }
              }
              if (param0 == 0) {
                if (null != this.field_p) {
                  L1: while (true) {
                    if (this.field_p.field_c != 0) {
                      L2: {
                        if (1 != this.field_p.field_c) {
                          break L2;
                        } else {
                          try {
                            L3: {
                              ((Thread) (this.field_p.field_b)).join();
                              decompiledRegionSelector0 = 0;
                              break L3;
                            }
                          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                            decompiledCaughtException = decompiledCaughtParameter0;
                            L4: {
                              var2 = (InterruptedException) (Object) decompiledCaughtException;
                              decompiledRegionSelector0 = 1;
                              break L4;
                            }
                          }
                          if (decompiledRegionSelector0 == 0) {
                            this.field_p = null;
                            return;
                          } else {
                            break L2;
                          }
                        }
                      }
                      this.field_p = null;
                      return;
                    } else {
                      ua.a(1L, param0 ^ -128);
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  this.field_p = null;
                  return;
                }
              } else {
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
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
            String var7 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            var6 = client.field_A ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  var3_ref = this;
                  synchronized (var3_ref) {
                    L2: {
                      L3: {
                        if (this.field_f == this.field_q) {
                          L4: {
                            if (!this.field_g) {
                              break L4;
                            } else {
                              if (var6 == 0) {
                                decompiledRegionSelector0 = 0;
                                break L2;
                              } else {
                                break L4;
                              }
                            }
                          }
                          try {
                            L5: {
                              this.wait();
                              break L5;
                            }
                          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                            decompiledCaughtException = decompiledCaughtParameter0;
                            L6: {
                              var4 = (InterruptedException) (Object) decompiledCaughtException;
                              break L6;
                            }
                          }
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L7: {
                        L8: {
                          var2 = this.field_q;
                          if (this.field_q > this.field_f) {
                            break L8;
                          } else {
                            var1_int = this.field_f + -this.field_q;
                            if (var6 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var1_int = this.field_r - this.field_q;
                        break L7;
                      }
                      decompiledRegionSelector0 = 1;
                      break L2;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    try {
                      L9: {
                        L10: {
                          if (null != this.field_o) {
                            this.field_o.close();
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        L11: {
                          if (null != this.field_b) {
                            this.field_b.close();
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        L12: {
                          if (null == this.field_l) {
                            break L12;
                          } else {
                            this.field_l.close();
                            break L12;
                          }
                        }
                        break L9;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L13: {
                        var1 = (IOException) (Object) decompiledCaughtException;
                        break L13;
                      }
                    }
                    this.field_h = null;
                    break L0;
                  } else {
                    if ((var1_int ^ -1) >= -1) {
                      continue L1;
                    } else {
                      try {
                        L14: {
                          this.field_b.write(this.field_h, var2, var1_int);
                          break L14;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L15: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          this.field_c = true;
                          break L15;
                        }
                      }
                      this.field_q = (var1_int + this.field_q) % this.field_r;
                      try {
                        L16: {
                          L17: {
                            if (this.field_f == this.field_q) {
                              this.field_b.flush();
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                          break L16;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L18: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          this.field_c = true;
                          break L18;
                        }
                      }
                      continue L1;
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter4) {
              decompiledCaughtException = decompiledCaughtParameter4;
              L19: {
                var1_ref = (Exception) (Object) decompiledCaughtException;
                var7 = (String) null;
                qb.a((Throwable) ((Object) var1_ref), 16408, (String) null);
                break L19;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    protected final void finalize() {
        this.a(0);
    }

    final static Object a(byte[] param0, int param1, boolean param2) {
        fn var3 = null;
        RuntimeException var3_ref = null;
        fn stackIn_6_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        fn stackOut_5_0 = null;
        byte[] stackOut_12_0 = null;
        byte[] stackOut_10_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (param0 != null) {
              if (136 < param0.length) {
                var3 = new fn();
                ((mk) ((Object) var3)).a(param0, true);
                stackOut_5_0 = (fn) (var3);
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 0;
                break L0;
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
                  stackOut_12_0 = (byte[]) (param0);
                  stackIn_13_0 = stackOut_12_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackOut_10_0 = jd.a(0, param0);
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3_ref);
            stackOut_14_1 = new StringBuilder().append("qk.E(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            return stackIn_13_0;
          }
        }
    }

    final int b(int param0) throws IOException {
        if (!(!this.field_g)) {
            return 0;
        }
        if (param0 != 0) {
            return -106;
        }
        return this.field_o.available();
    }

    public static void c(int param0) {
        field_e = null;
        if (param0 != -11657) {
            return;
        }
        field_s = null;
    }

    final void a(int param0, int param1, byte param2, byte[] param3) throws IOException {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var6 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (!this.field_g) {
              stackOut_3_0 = -1;
              stackIn_5_0 = stackOut_3_0;
              L1: while (true) {
                L2: {
                  L3: {
                    L4: {
                      if (stackIn_5_0 <= (param0 ^ -1)) {
                        break L4;
                      } else {
                        var5_int = this.field_o.read(param3, param1, param0);
                        var8 = var5_int;
                        var7 = 0;
                        if (var6 != 0) {
                          if (var7 == var8) {
                            break L2;
                          } else {
                            break L3;
                          }
                        } else {
                          if (var7 >= var8) {
                            throw new EOFException();
                          } else {
                            param1 = param1 + var5_int;
                            param0 = param0 - var5_int;
                            if (var6 == 0) {
                              stackOut_4_0 = -1;
                              stackIn_5_0 = stackOut_4_0;
                              continue L1;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                    if (param2 == 17) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                  this.a(31);
                  return;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var5);
            stackOut_16_1 = new StringBuilder().append("qk.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void b(byte param0) throws IOException {
        if (!(!this.field_g)) {
            return;
        }
        if (param0 > -21) {
            return;
        }
        if (!(!this.field_c)) {
            this.field_c = false;
            throw new IOException();
        }
    }

    qk(java.net.Socket param0, fd param1) throws IOException {
        this(param0, param1, 5000);
    }

    final static void a(byte param0) {
        dj.field_ab.setLength(0);
        pk.field_r = 0;
        if (param0 == 94) {
            return;
        }
        field_d = -4;
    }

    private qk(java.net.Socket param0, fd param1, int param2) throws IOException {
        this.field_g = false;
        this.field_c = false;
        this.field_q = 0;
        this.field_f = 0;
        try {
            this.field_j = param1;
            this.field_l = param0;
            this.field_l.setSoTimeout(30000);
            this.field_l.setTcpNoDelay(true);
            this.field_o = this.field_l.getInputStream();
            this.field_b = this.field_l.getOutputStream();
            this.field_r = param2;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "qk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_s = new String[]{"Deko Bloko", "Double Deko", "Triple Deko", "Mega Deko", "Double Bloko", "Triple Bloko", "Mini Bombo", "Maxi Bombo", "Tower Bloko", "Massive Attako", "Clean Sweepo", "Uh-Oh Bloko", "Floral Bloko", "Urban Bloko", "Retro Bloko", "Bronze Blokker", "Silver Blokker", "Gold Blokker", "Blok of Beginning", "Blok of Victory", "Blok of Supremacy", "Deko Pwnage", "Ultimate Pwnage", "Quick Deko", "Safe Deko", "Deko Modo", "Shape Mover", "Shape Sender", "Shape Dispatcher", "Shape Consigner", "Shape Shifter"};
        field_e = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
    }
}
