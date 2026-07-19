/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sb implements Runnable {
    private InputStream field_d;
    private ka field_k;
    private OutputStream field_q;
    private boolean field_i;
    private int field_r;
    private bk field_b;
    private boolean field_l;
    static p field_n;
    static String field_o;
    static String field_f;
    static String field_p;
    private int field_a;
    private java.net.Socket field_j;
    static int field_m;
    private int field_h;
    static kh field_g;
    static int field_c;
    private byte[] field_e;

    final void b(byte param0) {
        try {
            if (!(!this.field_i)) {
                return;
            }
            synchronized (this) {
                this.field_i = true;
                this.notifyAll();
            }
            if (!(this.field_b == null)) {
                while (this.field_b.field_b == 0) {
                    uc.a(-113, 1L);
                }
                if ((this.field_b.field_b ^ -1) == -2) {
                    try {
                        ((Thread) (this.field_b.field_f)).join();
                    } catch (InterruptedException interruptedException) {
                    }
                }
            }
            this.field_b = null;
            if (param0 > -20) {
                this.field_r = 0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        if (param0 < 13) {
            field_m = -57;
        }
        field_n = null;
        field_o = null;
        field_p = null;
        field_f = null;
        field_g = null;
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int incrementValue$1 = 0;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var8_int = 0;
              var9 = 65536 / param7;
              if (ki.field_l > param6) {
                param1 = param1 - (ki.field_l - param6);
                param6 = ki.field_l;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param4 >= ki.field_e) {
                break L2;
              } else {
                param7 = param7 - (-param4 + ki.field_e);
                var8_int = var8_int + var9 * (ki.field_e - param4);
                param4 = ki.field_e;
                break L2;
              }
            }
            L3: {
              if (param1 + param6 > ki.field_g) {
                param1 = ki.field_g - param6;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param4 + param7 > ki.field_i) {
                param7 = ki.field_i + -param4;
                break L4;
              } else {
                break L4;
              }
            }
            var10 = -param1 + ki.field_j;
            var11 = param6 + param4 * ki.field_j;
            if (param0) {
              var12 = -param7;
              L5: while (true) {
                if (var12 >= 0) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var13 = 65536 - var8_int >> -1363846488;
                  var14 = var8_int >> -1188627192;
                  var15 = ((param2 & 16711935) * var13 - -((16711935 & param3) * var14) & -16711936) - -(16711680 & (param2 & 65280) * var13 + (param3 & 65280) * var14) >>> 488852616;
                  var16 = -param1;
                  L6: while (true) {
                    if (0 <= var16) {
                      var8_int = var8_int + var9;
                      var11 = var11 + var10;
                      var12++;
                      continue L5;
                    } else {
                      L7: {
                        if (param5 != ki.field_a[var11]) {
                          var11++;
                          break L7;
                        } else {
                          incrementValue$1 = var11;
                          var11++;
                          ki.field_a[incrementValue$1] = var15;
                          break L7;
                        }
                      }
                      var16++;
                      continue L6;
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var8), "sb.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    sb(java.net.Socket param0, ka param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(byte param0) throws IOException {
        if (!(!this.field_i)) {
            return;
        }
        if (this.field_l) {
            this.field_l = false;
            throw new IOException();
        }
        int var2 = 69 % ((param0 - 67) / 58);
    }

    final int a(int param0) throws IOException {
        if (param0 != 488852616) {
            this.field_e = (byte[]) null;
        }
        if (!(!this.field_i)) {
            return 0;
        }
        return this.field_d.read();
    }

    final static kl[] a(ia param0, byte param1) {
        int discarded$6 = 0;
        int discarded$7 = 0;
        int discarded$8 = 0;
        int discarded$9 = 0;
        int discarded$10 = 0;
        int discarded$11 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        kl[] var4 = null;
        int var5 = 0;
        kl var6 = null;
        int var6_int = 0;
        int var7 = 0;
        kl[] stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        kl[] stackOut_12_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var7 = StarCannon.field_A;
        try {
          L0: {
            var2_int = param0.e(8, 8);
            if (0 >= var2_int) {
              L1: {
                var3 = param0.e(param1 + -99, 12);
                var4 = new kl[var3];
                if (param1 == 107) {
                  break L1;
                } else {
                  field_o = (String) null;
                  break L1;
                }
              }
              var5 = 0;
              L2: while (true) {
                if (var3 <= var5) {
                  stackOut_12_0 = (kl[]) (var4);
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  L3: {
                    if (od.a(-2, param0)) {
                      var6 = new kl();
                      discarded$6 = param0.e(8, 24);
                      discarded$7 = param0.e(8, 24);
                      var6.field_e = param0.e(8, 24);
                      discarded$8 = param0.e(param1 ^ 99, 9);
                      discarded$9 = param0.e(8, 12);
                      discarded$10 = param0.e(8, 12);
                      discarded$11 = param0.e(param1 ^ 99, 12);
                      var4[var5] = var6;
                      break L3;
                    } else {
                      var6_int = param0.e(8, wg.a(false, -1 + var5));
                      var4[var5] = var4[var6_int];
                      break L3;
                    }
                  }
                  var5++;
                  continue L2;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var2);
            stackOut_14_1 = new StringBuilder().append("sb.A(");
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
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        return stackIn_13_0;
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
            var6 = StarCannon.field_A;
            try {
              L0: {
                L1: while (true) {
                  var3_ref = this;
                  synchronized (var3_ref) {
                    L2: {
                      L3: {
                        if (this.field_h != this.field_r) {
                          break L3;
                        } else {
                          if (!this.field_i) {
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
                        }
                      }
                      L6: {
                        var2 = this.field_h;
                        if (this.field_h > this.field_r) {
                          var1_int = this.field_a + -this.field_h;
                          break L6;
                        } else {
                          var1_int = this.field_r - this.field_h;
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
                          if (this.field_d != null) {
                            this.field_d.close();
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          if (this.field_q != null) {
                            this.field_q.close();
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: {
                          if (this.field_j != null) {
                            this.field_j.close();
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
                    this.field_e = null;
                    break L0;
                  } else {
                    if ((var1_int ^ -1) < -1) {
                      try {
                        L12: {
                          this.field_q.write(this.field_e, var2, var1_int);
                          break L12;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          this.field_l = true;
                          break L13;
                        }
                      }
                      this.field_h = (this.field_h - -var1_int) % this.field_a;
                      try {
                        L14: {
                          L15: {
                            if (this.field_h == this.field_r) {
                              this.field_q.flush();
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
                          this.field_l = true;
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
                hc.a((Throwable) ((Object) var1_ref), (String) null, (byte) 126);
                break L17;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            if (!this.field_i) {
              L1: while (true) {
                if (-1 <= (param2 ^ -1)) {
                  L2: {
                    if (param1 == 32498) {
                      break L2;
                    } else {
                      this.field_i = true;
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var5_int = this.field_d.read(param3, param0, param2);
                  if ((var5_int ^ -1) < -1) {
                    param2 = param2 - var5_int;
                    param0 = param0 + var5_int;
                    continue L1;
                  } else {
                    throw new EOFException();
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var5);
            stackOut_9_1 = new StringBuilder().append("sb.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, byte param1, hb param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              hi.field_f.b(105, param2);
              hb.a(-114, param0, param2);
              if (param1 == -41) {
                break L1;
              } else {
                field_o = (String) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("sb.B(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final static void a(boolean param0, byte param1) {
        if (param1 < 93) {
            field_f = (String) null;
        }
        qa.field_a.a(param0, false);
    }

    final void a(int param0, byte[] param1, byte param2, int param3) throws IOException {
        RuntimeException var5 = null;
        Object var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        try {
          L0: {
            if (!this.field_i) {
              if (this.field_l) {
                this.field_l = false;
                throw new IOException();
              } else {
                L1: {
                  if (this.field_e == null) {
                    this.field_e = new byte[this.field_a];
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var5_ref = this;
                synchronized (var5_ref) {
                  L2: {
                    if (param2 == 87) {
                      var6 = 0;
                      L3: while (true) {
                        if (var6 >= param3) {
                          L4: {
                            if (this.field_b != null) {
                              break L4;
                            } else {
                              this.field_b = this.field_k.a(3, 115, (Runnable) (this));
                              break L4;
                            }
                          }
                          this.notifyAll();
                          break L2;
                        } else {
                          this.field_e[this.field_r] = param1[param0 + var6];
                          this.field_r = (this.field_r - -1) % this.field_a;
                          if ((-100 + this.field_h - -this.field_a) % this.field_a == this.field_r) {
                            throw new IOException();
                          } else {
                            var6++;
                            continue L3;
                          }
                        }
                      }
                    } else {
                      return;
                    }
                  }
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
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var5);
            stackOut_25_1 = new StringBuilder().append("sb.G(").append(param0).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L5;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L5;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    protected final void finalize() {
        this.b((byte) -113);
    }

    final int c(int param0) throws IOException {
        if (this.field_i) {
            return 0;
        }
        if (param0 < 45) {
            sb.a(false, 123, -100, 77, -90, -56, 113, -109);
        }
        return this.field_d.available();
    }

    final static ue a(int param0, boolean param1, boolean param2, int param3, byte param4) {
        if (param4 < 100) {
            field_g = (kh) null;
        }
        return ri.a(true, param2, param0, param3, false, param1);
    }

    private sb(java.net.Socket param0, ka param1, int param2) throws IOException {
        this.field_i = false;
        this.field_l = false;
        this.field_r = 0;
        this.field_h = 0;
        try {
            this.field_k = param1;
            this.field_j = param0;
            this.field_j.setSoTimeout(30000);
            this.field_j.setTcpNoDelay(true);
            this.field_d = this.field_j.getInputStream();
            this.field_q = this.field_j.getOutputStream();
            this.field_a = param2;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "sb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_o = "<br><br><br>Become a member of Funorb to continue humanity's<br>fight against the Paragulans";
        field_f = "Visit the Account Management section on the main site to view.";
        field_p = "STORY:";
        field_n = new p();
        field_c = 10;
    }
}
