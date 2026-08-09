/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class jqa implements Runnable {
    private boolean field_a;
    private int field_k;
    private int field_d;
    private java.net.Socket field_e;
    static jea field_b;
    private InputStream field_h;
    private fia field_i;
    private OutputStream field_l;
    private byte[] field_c;
    static int field_g;
    private boolean field_f;
    private naa field_j;
    private int field_m;

    protected final void finalize() {
        this.a((byte) 105);
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 >= -64) {
            field_g = 33;
        }
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var8 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (this.field_a) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (this.field_f) {
                this.field_f = false;
                throw new IOException();
              } else {
                L1: {
                  if (this.field_c == null) {
                    this.field_c = new byte[this.field_d];
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
                      if (var6 >= param2) {
                        L4: {
                          if (this.field_j != null) {
                            break L4;
                          } else {
                            this.field_j = this.field_i.a((Runnable) (this), 425, 3);
                            break L4;
                          }
                        }
                        this.notifyAll();
                        break L2;
                      } else {
                        this.field_c[this.field_m] = param0[var6 + param1];
                        this.field_m = (1 + this.field_m) % this.field_d;
                        if ((this.field_m ^ -1) != ((this.field_d + this.field_k - 100) % this.field_d ^ -1)) {
                          var6++;
                          continue L3;
                        } else {
                          throw new IOException();
                        }
                      }
                    }
                  }
                }
                L5: {
                  if (param3 >= 99) {
                    break L5;
                  } else {
                    this.field_k = 121;
                    break L5;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var5_ref);

            stackIn_29_1 = new StringBuilder().append("jqa.H(");

            if (param0 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L6;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int d(int param0) throws IOException {
        if (!(!this.field_a)) {
            return 0;
        }
        if (param0 != -2147483648) {
            Random var3 = (Random) null;
            jqa.a(-72, (Random) null, -100);
        }
        return this.field_h.read();
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        if (!(pda.a(param9, param4, param6, 256, param7, param3, param0, param8, param2))) {
            return 0;
        }
        if (param1 != 1) {
            field_b = (jea) null;
        }
        int var10 = ova.a(param7, param8, true, param9, param6);
        int var11 = ova.a(param4, param3, true, param0, param2);
        if (!(-1 <= (param5 ^ -1))) {
            var10 = var10 + (1 << param5 - 1);
            var11 = var11 + (1 << -1 + param5);
        }
        return (var10 >> param5) * (var11 >> param5);
    }

    jqa(java.net.Socket param0, fia param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void b(int param0) throws IOException {
        if (this.field_a) {
            return;
        }
        if (this.field_f) {
            this.field_f = false;
            throw new IOException();
        }
        if (param0 < 79) {
            this.a((byte) 122);
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (!this.field_a) {
              if (param0 == 0) {
                L1: while (true) {
                  if ((param3 ^ -1) >= -1) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var5_int = this.field_h.read(param2, param1, param3);
                    if (-1 > (var5_int ^ -1)) {
                      param3 = param3 - var5_int;
                      param1 = param1 + var5_int;
                      continue L1;
                    } else {
                      throw new EOFException();
                    }
                  }
                }
              } else {
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
          L2: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("jqa.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final int c(int param0) throws IOException {
        if (this.field_a) {
            return 0;
        }
        if (param0 != 0) {
            this.a((byte) 47);
        }
        return this.field_h.available();
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
            var6 = TombRacer.field_G ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  var3 = this;
                  synchronized (var3) {
                    L2: {
                      L3: {
                        if (this.field_m == this.field_k) {
                          if (this.field_a) {
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
                        } else {
                          break L3;
                        }
                      }
                      L6: {
                        var2 = this.field_k;
                        if (this.field_k > this.field_m) {
                          var1_int = this.field_d - this.field_k;
                          break L6;
                        } else {
                          var1_int = -this.field_k + this.field_m;
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
                          if (null == this.field_h) {
                            break L8;
                          } else {
                            this.field_h.close();
                            break L8;
                          }
                        }
                        L9: {
                          if (this.field_l == null) {
                            break L9;
                          } else {
                            this.field_l.close();
                            break L9;
                          }
                        }
                        L10: {
                          if (null == this.field_e) {
                            break L10;
                          } else {
                            this.field_e.close();
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
                    this.field_c = null;
                    break L0;
                  } else {
                    if (-1 > (var1_int ^ -1)) {
                      try {
                        L12: {
                          this.field_l.write(this.field_c, var2, var1_int);
                          break L12;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3_ref = (IOException) (Object) decompiledCaughtException;
                          this.field_f = true;
                          break L13;
                        }
                      }
                      this.field_k = (this.field_k - -var1_int) % this.field_d;
                      try {
                        L14: {
                          L15: {
                            if (this.field_m != this.field_k) {
                              break L15;
                            } else {
                              this.field_l.flush();
                              break L15;
                            }
                          }
                          break L14;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L16: {
                          var3_ref = (IOException) (Object) decompiledCaughtException;
                          this.field_f = true;
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
                var7 = (String) null;
                ssa.a((String) null, (byte) 122, (Throwable) ((Object) var1_ref));
                break L17;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(int param0, Random param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 <= 0) {
              throw new IllegalArgumentException();
            } else {
              var3_int = -43 % ((param2 - -14) / 57);
              if (cla.a(9181, param0)) {
                stackIn_6_0 = (int)((4294967295L & (long)param1.nextInt()) * (long)param0 >> 625570336);
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                var4 = -2147483648 - (int)(4294967296L % (long)param0);
                L1: while (true) {
                  var5 = param1.nextInt();
                  if (var4 > var5) {
                    stackIn_11_0 = oea.a(var5, param0, -127);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("jqa.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_11_0;
        }
    }

    final void a(byte param0) {
        try {
            int var4 = 0;
            var4 = TombRacer.field_G ? 1 : 0;
            if (this.field_a) {
                return;
            }
            synchronized (this) {
                this.field_a = true;
                this.notifyAll();
            }
            if (this.field_j != null) {
                while (-1 == (this.field_j.field_b ^ -1)) {
                    vja.a(0, 1L);
                }
                if (1 == this.field_j.field_b) {
                    try {
                        ((Thread) (this.field_j.field_f)).join();
                    } catch (InterruptedException interruptedException) {
                    }
                }
            }
            if (param0 != 105) {
                this.field_c = (byte[]) null;
            }
            this.field_j = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private jqa(java.net.Socket param0, fia param1, int param2) throws IOException {
        this.field_k = 0;
        this.field_a = false;
        this.field_f = false;
        this.field_m = 0;
        try {
            this.field_i = param1;
            this.field_e = param0;
            this.field_e.setSoTimeout(30000);
            this.field_e.setTcpNoDelay(true);
            this.field_h = this.field_e.getInputStream();
            this.field_l = this.field_e.getOutputStream();
            this.field_d = param2;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "jqa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
    }
}
