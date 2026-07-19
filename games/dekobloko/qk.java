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
        var8 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (this.field_g) {
              return;
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
                      if (var6 >= param1) {
                        L5: {
                          if (null != this.field_p) {
                            break L5;
                          } else {
                            this.field_p = this.field_j.a((byte) -45, 3, (Runnable) (this));
                            break L5;
                          }
                        }
                        this.notifyAll();
                        break L3;
                      } else {
                        this.field_h[this.field_f] = param3[param0 + var6];
                        this.field_f = (1 + this.field_f) % this.field_r;
                        if (this.field_f == (this.field_r + this.field_q + -100) % this.field_r) {
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
              } else {
                this.field_c = false;
                throw new IOException();
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var5);
            stackOut_25_1 = new StringBuilder().append("qk.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param3 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L6;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L6;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
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
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = client.field_A ? 1 : 0;
        String var1 = "(" + lg.field_U + " " + bb.field_d + " " + kf.field_L + ") " + bh.field_k;
        if (param0 < 14) {
            return (String) null;
        }
        if (sm.field_e > 0) {
            var1 = var1 + ":";
            for (var2 = 0; var2 < sm.field_e; var2++) {
                var1 = var1 + ' ';
                var3 = de.field_V.field_r[var2] & 255;
                var4 = var3 >> 4;
                if (var4 < 10) {
                    var4 += 48;
                } else {
                    var4 += 55;
                }
                var3 = var3 & 15;
                var1 = var1 + (char)var4;
                if (var3 < 10) {
                    var3 += 48;
                } else {
                    var3 += 55;
                }
                var1 = var1 + (char)var3;
            }
        }
        return var1;
    }

    final void a(int param0) {
        try {
            int var4 = 0;
            var4 = client.field_A ? 1 : 0;
            if (!(!this.field_g)) {
                return;
            }
            synchronized (this) {
                this.field_g = true;
                this.notifyAll();
            }
            if (param0 != 0) {
                return;
            }
            if (!(null == this.field_p)) {
                while (this.field_p.field_c == 0) {
                    ua.a(1L, param0 ^ -128);
                }
                if (1 == this.field_p.field_c) {
                    try {
                        ((Thread) (this.field_p.field_b)).join();
                    } catch (InterruptedException interruptedException) {
                    }
                }
            }
            this.field_p = null;
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
                        if (~this.field_f == ~this.field_q) {
                          if (!this.field_g) {
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
                          } else {
                            decompiledRegionSelector0 = 0;
                            break L2;
                          }
                        } else {
                          break L3;
                        }
                      }
                      L6: {
                        var2 = this.field_q;
                        if (this.field_q > this.field_f) {
                          var1_int = this.field_r - this.field_q;
                          break L6;
                        } else {
                          var1_int = this.field_f + -this.field_q;
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
                          if (null != this.field_o) {
                            this.field_o.close();
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          if (null != this.field_b) {
                            this.field_b.close();
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: {
                          if (null == this.field_l) {
                            break L10;
                          } else {
                            this.field_l.close();
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
                    this.field_h = null;
                    break L0;
                  } else {
                    if (var1_int <= 0) {
                      continue L1;
                    } else {
                      try {
                        L12: {
                          this.field_b.write(this.field_h, var2, var1_int);
                          break L12;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          this.field_c = true;
                          break L13;
                        }
                      }
                      this.field_q = (var1_int + this.field_q) % this.field_r;
                      try {
                        L14: {
                          L15: {
                            if (this.field_f == this.field_q) {
                              this.field_b.flush();
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          break L14;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L16: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          this.field_c = true;
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
                qb.a((Throwable) ((Object) var1_ref), 16408, (String) null);
                break L17;
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
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        fn stackOut_5_0 = null;
        byte[] stackOut_8_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (param0 != null) {
              if (136 < param0.length) {
                var3 = new fn();
                ((mk) ((Object) var3)).a(param0, true);
                stackOut_5_0 = (fn) (var3);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              } else {
                stackOut_8_0 = (byte[]) (param0);
                stackIn_9_0 = stackOut_8_0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3_ref);
            stackOut_10_1 = new StringBuilder().append("qk.E(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L1;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + -1389597532 + ',' + false + ')');
        }
        return stackIn_9_0;
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
        field_s = null;
    }

    final void a(int param0, int param1, byte param2, byte[] param3) throws IOException {
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
        var6 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (!this.field_g) {
              L1: while (true) {
                if (param0 <= 0) {
                  L2: {
                    if (param2 == 17) {
                      break L2;
                    } else {
                      this.a(31);
                      break L2;
                    }
                  }
                  break L0;
                } else {
                  var5_int = this.field_o.read(param3, param1, param0);
                  if (0 >= var5_int) {
                    throw new EOFException();
                  } else {
                    param1 = param1 + var5_int;
                    param0 = param0 - var5_int;
                    continue L1;
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
            stackOut_11_0 = (RuntimeException) (var5);
            stackOut_11_1 = new StringBuilder().append("qk.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
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
