/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class ll implements Runnable {
    private InputStream field_i;
    private int field_g;
    private int field_m;
    static int field_h;
    private OutputStream field_o;
    private ia field_b;
    private byte[] field_c;
    static String field_e;
    private boolean field_l;
    private java.net.Socket field_j;
    private vf field_n;
    static hm field_a;
    private boolean field_f;
    static int field_d;
    private int field_k;

    protected final void finalize() {
        this.b(120);
    }

    ll(java.net.Socket param0, vf param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(byte param0, byte[] param1, int param2, int param3) throws IOException {
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
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var8 = MinerDisturbance.field_ab;
        try {
          L0: {
            if (!this.field_l) {
              if (!this.field_f) {
                if (param0 >= 92) {
                  L1: {
                    if (null != this.field_c) {
                      break L1;
                    } else {
                      this.field_c = new byte[this.field_g];
                      break L1;
                    }
                  }
                  var5_ref = this;
                  synchronized (var5_ref) {
                    L2: {
                      var6 = 0;
                      L3: while (true) {
                        if (param2 <= var6) {
                          L4: {
                            if (null != this.field_b) {
                              break L4;
                            } else {
                              this.field_b = this.field_n.a((Runnable) (this), (byte) 44, 3);
                              break L4;
                            }
                          }
                          this.notifyAll();
                          break L2;
                        } else {
                          this.field_c[this.field_m] = param1[var6 + param3];
                          this.field_m = (this.field_m + 1) % this.field_g;
                          if (this.field_m == (this.field_k - -this.field_g + -100) % this.field_g) {
                            throw new IOException();
                          } else {
                            var6++;
                            continue L3;
                          }
                        }
                      }
                    }
                  }
                  return;
                } else {
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                this.field_f = false;
                throw new IOException();
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var5);
            stackOut_23_1 = new StringBuilder().append("ll.E(").append(param0).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L5;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L5;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void b(int param0) {
        try {
            int discarded$3 = 0;
            InterruptedException var2 = null;
            Object var2_ref = null;
            Throwable var3 = null;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            var4 = MinerDisturbance.field_ab;
            if (!this.field_l) {
              var2_ref = this;
              synchronized (var2_ref) {
                L0: {
                  L1: {
                    this.field_l = true;
                    if (param0 >= 84) {
                      break L1;
                    } else {
                      discarded$3 = ll.a((byte) 104, -28);
                      break L1;
                    }
                  }
                  this.notifyAll();
                  break L0;
                }
              }
              if (this.field_b != null) {
                L2: while (true) {
                  if (this.field_b.field_c != 0) {
                    if (this.field_b.field_c == 1) {
                      try {
                        L3: {
                          ((Thread) (this.field_b.field_a)).join();
                          break L3;
                        }
                      } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var2 = (InterruptedException) (Object) decompiledCaughtException;
                        this.field_b = null;
                        return;
                      }
                      this.field_b = null;
                      return;
                    } else {
                      this.field_b = null;
                      return;
                    }
                  } else {
                    gf.a(1L, -10309);
                    continue L2;
                  }
                }
              } else {
                this.field_b = null;
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
            var6 = MinerDisturbance.field_ab;
            try {
              L0: {
                L1: while (true) {
                  var3_ref = this;
                  synchronized (var3_ref) {
                    L2: {
                      L3: {
                        if (this.field_m == this.field_k) {
                          if (this.field_l) {
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
                        if (this.field_m < this.field_k) {
                          var1_int = -this.field_k + this.field_g;
                          break L6;
                        } else {
                          var1_int = this.field_m + -this.field_k;
                          break L6;
                        }
                      }
                      var2 = this.field_k;
                      decompiledRegionSelector0 = 1;
                      break L2;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    try {
                      L7: {
                        L8: {
                          if (null != this.field_i) {
                            this.field_i.close();
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          if (null == this.field_o) {
                            break L9;
                          } else {
                            this.field_o.close();
                            break L9;
                          }
                        }
                        L10: {
                          if (this.field_j == null) {
                            break L10;
                          } else {
                            this.field_j.close();
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
                          this.field_o.write(this.field_c, var2, var1_int);
                          break L12;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          this.field_f = true;
                          break L13;
                        }
                      }
                      this.field_k = (this.field_k - -var1_int) % this.field_g;
                      try {
                        L14: {
                          L15: {
                            if (this.field_m != this.field_k) {
                              break L15;
                            } else {
                              this.field_o.flush();
                              break L15;
                            }
                          }
                          break L14;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L16: {
                          var3 = (IOException) (Object) decompiledCaughtException;
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
                di.a((Throwable) ((Object) var1_ref), 1, (String) null);
                break L17;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(byte param0, int param1) {
        int discarded$0 = 0;
        if (param0 != -73) {
            discarded$0 = ll.a((byte) -58, -86);
            return ke.a(param1, -21937, sb.field_t);
        }
        return ke.a(param1, -21937, sb.field_t);
    }

    final static void a(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (param0 <= -46) {
            break L0;
          } else {
            field_a = (hm) null;
            break L0;
          }
        }
        if (null != lb.field_y) {
          var1 = lb.field_y;
          synchronized (var1) {
            L1: {
              lb.field_y = null;
              break L1;
            }
          }
          return;
        } else {
          return;
        }
    }

    final int c(int param0) throws IOException {
        if (!(!this.field_l)) {
            return 0;
        }
        if (param0 != 0) {
            return -37;
        }
        return this.field_i.available();
    }

    public static void b(byte param0) {
        field_e = null;
        field_a = null;
        if (param0 == -121) {
            return;
        }
        ll.a(-77);
    }

    final void a(boolean param0, byte[] param1, int param2, int param3) throws IOException {
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = MinerDisturbance.field_ab;
        try {
          L0: {
            if (this.field_l) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: while (true) {
                if (-1 <= (param3 ^ -1)) {
                  if (!param0) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    field_a = (hm) null;
                    return;
                  }
                } else {
                  var5_int = this.field_i.read(param1, param2, param3);
                  if (var5_int > 0) {
                    param2 = param2 + var5_int;
                    param3 = param3 - var5_int;
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
            stackOut_11_0 = (RuntimeException) (var5);
            stackOut_11_1 = new StringBuilder().append("ll.I(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int a(boolean param0) throws IOException {
        if (!param0) {
          if (this.field_l) {
            return 0;
          } else {
            return this.field_i.read();
          }
        } else {
          this.field_k = -72;
          if (this.field_l) {
            return 0;
          } else {
            return this.field_i.read();
          }
        }
    }

    final void a(byte param0) throws IOException {
        int var2 = 0;
        if (!this.field_l) {
          var2 = -54 / ((param0 - 65) / 38);
          if (this.field_f) {
            this.field_f = false;
            throw new IOException();
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private ll(java.net.Socket param0, vf param1, int param2) throws IOException {
        this.field_l = false;
        this.field_f = false;
        this.field_m = 0;
        this.field_k = 0;
        try {
            this.field_j = param0;
            this.field_n = param1;
            this.field_j.setSoTimeout(30000);
            this.field_j.setTcpNoDelay(true);
            this.field_i = this.field_j.getInputStream();
            this.field_o = this.field_j.getOutputStream();
            this.field_g = param2;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "ll.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_d = 0;
        field_e = "Loading...";
    }
}
