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
        if (param0 < -64) {
            return;
        }
        field_g = 33;
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        RuntimeException var5 = null;
        Object var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (this.field_a) {
              decompiledRegionSelector1 = 0;
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
                var5_ref = this;
                synchronized (var5_ref) {
                  L2: {
                    var6 = 0;
                    L3: while (true) {
                      L4: {
                        if (var6 >= param2) {
                          break L4;
                        } else {
                          this.field_c[this.field_m] = param0[var6 + param1];
                          this.field_m = (1 + this.field_m) % this.field_d;
                          var10 = (this.field_d + this.field_k - 100) % this.field_d ^ -1;
                          var9 = this.field_m ^ -1;
                          if (var8 != 0) {
                            if (var9 >= var10) {
                              decompiledRegionSelector0 = 0;
                              break L2;
                            } else {
                              decompiledRegionSelector0 = 1;
                              break L2;
                            }
                          } else {
                            if (var9 != var10) {
                              var6++;
                              if (var8 == 0) {
                                continue L3;
                              } else {
                                break L4;
                              }
                            } else {
                              throw new IOException();
                            }
                          }
                        }
                      }
                      L5: {
                        if (this.field_j != null) {
                          break L5;
                        } else {
                          this.field_j = this.field_i.a((Runnable) (this), 425, 3);
                          break L5;
                        }
                      }
                      this.notifyAll();
                      decompiledRegionSelector0 = 2;
                      break L2;
                    }
                  }
                }
                L6: {
                  if (decompiledRegionSelector0 == 0) {
                    break L6;
                  } else {
                    L7: {
                      if (decompiledRegionSelector0 == 1) {
                        break L7;
                      } else {
                        if (param3 >= 99) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    this.field_k = 121;
                    return;
                  }
                }
                decompiledRegionSelector1 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) (var5);
            stackOut_29_1 = new StringBuilder().append("jqa.H(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L8;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L8;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          return;
        }
    }

    final int d(int param0) throws IOException {
        int discarded$2 = 0;
        Random var3 = null;
        if (this.field_a) {
          return 0;
        } else {
          if (param0 != -2147483648) {
            var3 = (Random) null;
            discarded$2 = jqa.a(-72, (Random) null, -100);
            return this.field_h.read();
          } else {
            return this.field_h.read();
          }
        }
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        if (!pda.a(param9, param4, param6, 256, param7, param3, param0, param8, param2)) {
          return 0;
        } else {
          if (param1 != 1) {
            L0: {
              field_b = (jea) null;
              var10 = ova.a(param7, param8, true, param9, param6);
              var11 = ova.a(param4, param3, true, param0, param2);
              if (-1 > (param5 ^ -1)) {
                var10 = var10 + (1 << param5 - 1);
                var11 = var11 + (1 << -1 + param5);
                break L0;
              } else {
                break L0;
              }
            }
            return (var10 >> param5) * (var11 >> param5);
          } else {
            L1: {
              var10 = ova.a(param7, param8, true, param9, param6);
              var11 = ova.a(param4, param3, true, param0, param2);
              if (-1 > (param5 ^ -1)) {
                var10 = var10 + (1 << param5 - 1);
                var11 = var11 + (1 << -1 + param5);
                break L1;
              } else {
                break L1;
              }
            }
            return (var10 >> param5) * (var11 >> param5);
          }
        }
    }

    jqa(java.net.Socket param0, fia param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void b(int param0) throws IOException {
        if (!this.field_a) {
          if (!this.field_f) {
            if (param0 >= 79) {
              return;
            } else {
              this.a((byte) 122);
              return;
            }
          } else {
            this.field_f = false;
            throw new IOException();
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
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
                    if (var6 == 0) {
                      if (-1 > (var5_int ^ -1)) {
                        param3 = param3 - var5_int;
                        param1 = param1 + var5_int;
                        continue L1;
                      } else {
                        throw new EOFException();
                      }
                    } else {
                      return;
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
            stackOut_12_0 = (RuntimeException) (var5);
            stackOut_12_1 = new StringBuilder().append("jqa.E(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ')');
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
            return this.field_h.available();
        }
        return this.field_h.available();
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
            var6 = TombRacer.field_G ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  var3_ref = this;
                  synchronized (var3_ref) {
                    L2: {
                      L3: {
                        if (this.field_m == this.field_k) {
                          L4: {
                            if (this.field_a) {
                              if (var6 == 0) {
                                decompiledRegionSelector0 = 0;
                                break L2;
                              } else {
                                break L4;
                              }
                            } else {
                              break L4;
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
                          var2 = this.field_k;
                          if (this.field_k > this.field_m) {
                            break L8;
                          } else {
                            var1_int = -this.field_k + this.field_m;
                            if (var6 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var1_int = this.field_d - this.field_k;
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
                          if (null == this.field_h) {
                            break L10;
                          } else {
                            this.field_h.close();
                            break L10;
                          }
                        }
                        L11: {
                          if (this.field_l == null) {
                            break L11;
                          } else {
                            this.field_l.close();
                            break L11;
                          }
                        }
                        L12: {
                          if (null == this.field_e) {
                            break L12;
                          } else {
                            this.field_e.close();
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
                    this.field_c = null;
                    break L0;
                  } else {
                    if (-1 > (var1_int ^ -1)) {
                      try {
                        L14: {
                          this.field_l.write(this.field_c, var2, var1_int);
                          break L14;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L15: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          this.field_f = true;
                          break L15;
                        }
                      }
                      this.field_k = (this.field_k - -var1_int) % this.field_d;
                      try {
                        L16: {
                          L17: {
                            if (this.field_m != this.field_k) {
                              break L17;
                            } else {
                              this.field_l.flush();
                              break L17;
                            }
                          }
                          break L16;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L18: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          this.field_f = true;
                          break L18;
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
              L19: {
                var1_ref = (Exception) (Object) decompiledCaughtException;
                var7 = (String) null;
                ssa.a((String) null, (byte) 122, (Throwable) ((Object) var1_ref));
                break L19;
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
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (param0 <= 0) {
              throw new IllegalArgumentException();
            } else {
              var3_int = -43 % ((param2 - -14) / 57);
              if (cla.a(9181, param0)) {
                stackOut_5_0 = (int)((4294967295L & (long)param1.nextInt()) * (long)param0 >> 625570336);
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                var4 = -2147483648 - (int)(4294967296L % (long)param0);
                L1: while (true) {
                  var5 = param1.nextInt();
                  if (var4 > var5) {
                    stackOut_10_0 = oea.a(var5, param0, -127);
                    stackIn_11_0 = stackOut_10_0;
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
            stackOut_12_0 = (RuntimeException) (var3);
            stackOut_12_1 = new StringBuilder().append("jqa.A(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
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
            InterruptedException var2 = null;
            Object var2_ref = null;
            Throwable var3 = null;
            int var4 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            var4 = TombRacer.field_G ? 1 : 0;
            if (!this.field_a) {
              var2_ref = this;
              synchronized (var2_ref) {
                L0: {
                  this.field_a = true;
                  this.notifyAll();
                  break L0;
                }
              }
              if (this.field_j != null) {
                L1: while (true) {
                  if (-1 != (this.field_j.field_b ^ -1)) {
                    L2: {
                      if (1 != this.field_j.field_b) {
                        break L2;
                      } else {
                        try {
                          L3: {
                            ((Thread) (this.field_j.field_f)).join();
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
                          if (param0 == 105) {
                            this.field_j = null;
                            return;
                          } else {
                            this.field_c = (byte[]) null;
                            this.field_j = null;
                            return;
                          }
                        } else {
                          break L2;
                        }
                      }
                    }
                    if (param0 == 105) {
                      this.field_j = null;
                      return;
                    } else {
                      this.field_c = (byte[]) null;
                      this.field_j = null;
                      return;
                    }
                  } else {
                    vja.a(0, 1L);
                    if (var4 == 0) {
                      continue L1;
                    } else {
                      if (param0 == 105) {
                        this.field_j = null;
                        return;
                      } else {
                        this.field_c = (byte[]) null;
                        this.field_j = null;
                        return;
                      }
                    }
                  }
                }
              } else {
                if (param0 == 105) {
                  this.field_j = null;
                  return;
                } else {
                  this.field_c = (byte[]) null;
                  this.field_j = null;
                  return;
                }
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
