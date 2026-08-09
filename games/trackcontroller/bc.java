/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bc implements Runnable {
    static long[] field_a;
    private InputStream field_g;
    private int field_h;
    private OutputStream field_b;
    static int field_o;
    private java.net.Socket field_k;
    private int field_n;
    private uf field_m;
    private boolean field_j;
    static int[][] field_c;
    private ce field_f;
    private byte[] field_e;
    private boolean field_l;
    private int field_i;
    static boolean field_d;

    final static int a(int param0, int param1) {
        param0--;
        param0 = param0 | param0 >>> 1548905857;
        param0 = param0 | param0 >>> -71695006;
        param0 = param0 | param0 >>> 1409272580;
        param0 = param0 | param0 >>> -1980750520;
        param0 = param0 | param0 >>> -147347280;
        if (param1 > -58) {
          return -67;
        } else {
          return param0 + 1;
        }
    }

    final static byte[] a(byte param0, CharSequence param1) {
        byte[] stackIn_69_0 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        CharSequence var7 = null;
        var6 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              var3 = new byte[var2_int];
              if (param0 == -6) {
                break L1;
              } else {
                var7 = (CharSequence) null;
                bc.a((byte) 8, (CharSequence) null);
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var2_int <= var4) {
                stackIn_69_0 = (byte[]) (var3);
                break L0;
              } else {
                L3: {
                  L4: {
                    L5: {
                      var5 = param1.charAt(var4);
                      if (var5 <= 0) {
                        break L5;
                      } else {
                        if (var5 < 128) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var5 < 160) {
                        break L6;
                      } else {
                        if (var5 <= 255) {
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if (8364 != var5) {
                      if (var5 != 8218) {
                        if (402 == var5) {
                          var3[var4] = (byte)-125;
                          break L3;
                        } else {
                          if (8222 != var5) {
                            if (8230 == var5) {
                              var3[var4] = (byte)-123;
                              break L3;
                            } else {
                              if (var5 != 8224) {
                                if (var5 != 8225) {
                                  if (var5 != 710) {
                                    if (8240 != var5) {
                                      if (var5 != 352) {
                                        if (8249 != var5) {
                                          if (var5 != 338) {
                                            if (var5 != 381) {
                                              if (var5 != 8216) {
                                                if (var5 == 8217) {
                                                  var3[var4] = (byte)-110;
                                                  break L3;
                                                } else {
                                                  if (var5 == 8220) {
                                                    var3[var4] = (byte)-109;
                                                    break L3;
                                                  } else {
                                                    if (var5 == 8221) {
                                                      var3[var4] = (byte)-108;
                                                      break L3;
                                                    } else {
                                                      if (var5 != 8226) {
                                                        if (var5 == 8211) {
                                                          var3[var4] = (byte)-106;
                                                          break L3;
                                                        } else {
                                                          if (8212 == var5) {
                                                            var3[var4] = (byte)-105;
                                                            break L3;
                                                          } else {
                                                            if (var5 != 732) {
                                                              if (var5 != 8482) {
                                                                if (var5 != 353) {
                                                                  if (var5 == 8250) {
                                                                    var3[var4] = (byte)-101;
                                                                    break L3;
                                                                  } else {
                                                                    if (var5 == 339) {
                                                                      var3[var4] = (byte)-100;
                                                                      break L3;
                                                                    } else {
                                                                      if (var5 != 382) {
                                                                        if (var5 == 376) {
                                                                          var3[var4] = (byte)-97;
                                                                          break L3;
                                                                        } else {
                                                                          var3[var4] = (byte)63;
                                                                          break L3;
                                                                        }
                                                                      } else {
                                                                        var3[var4] = (byte)-98;
                                                                        break L3;
                                                                      }
                                                                    }
                                                                  }
                                                                } else {
                                                                  var3[var4] = (byte)-102;
                                                                  break L3;
                                                                }
                                                              } else {
                                                                var3[var4] = (byte)-103;
                                                                break L3;
                                                              }
                                                            } else {
                                                              var3[var4] = (byte)-104;
                                                              break L3;
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        var3[var4] = (byte)-107;
                                                        break L3;
                                                      }
                                                    }
                                                  }
                                                }
                                              } else {
                                                var3[var4] = (byte)-111;
                                                break L3;
                                              }
                                            } else {
                                              var3[var4] = (byte)-114;
                                              break L3;
                                            }
                                          } else {
                                            var3[var4] = (byte)-116;
                                            break L3;
                                          }
                                        } else {
                                          var3[var4] = (byte)-117;
                                          break L3;
                                        }
                                      } else {
                                        var3[var4] = (byte)-118;
                                        break L3;
                                      }
                                    } else {
                                      var3[var4] = (byte)-119;
                                      break L3;
                                    }
                                  } else {
                                    var3[var4] = (byte)-120;
                                    break L3;
                                  }
                                } else {
                                  var3[var4] = (byte)-121;
                                  break L3;
                                }
                              } else {
                                var3[var4] = (byte)-122;
                                break L3;
                              }
                            }
                          } else {
                            var3[var4] = (byte)-124;
                            break L3;
                          }
                        }
                      } else {
                        var3[var4] = (byte)-126;
                        break L3;
                      }
                    } else {
                      var3[var4] = (byte)-128;
                      break L3;
                    }
                  }
                  var3[var4] = (byte)var5;
                  break L3;
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_72_0 = (RuntimeException) (var2);

            stackIn_72_1 = new StringBuilder().append("bc.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "null";
              break L7;
            } else {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "{...}";
              break L7;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_73_0), stackIn_73_2 + ')');
        }
        return stackIn_69_0;
    }

    final static ck a(int param0, byte[] param1) {
        ck var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        Object stackIn_2_0 = null;
        ck stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                if (param0 == 12587) {
                  break L1;
                } else {
                  var3 = (CharSequence) null;
                  bc.a((byte) -122, (CharSequence) null);
                  break L1;
                }
              }
              var2 = new ck(param1, ka.field_f, vb.field_a, cf.field_p, j.field_f, qe.field_z, qk.field_M);
              ff.b(26);
              stackIn_6_0 = (ck) (var2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2_ref);

            stackIn_9_1 = new StringBuilder().append("bc.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ck) ((Object) stackIn_2_0);
        } else {
          return stackIn_6_0;
        }
    }

    protected final void finalize() {
        this.d(16777215);
    }

    final int b(int param0) throws IOException {
        if (param0 != 0) {
            CharSequence var3 = (CharSequence) null;
            bc.a((byte) 44, (CharSequence) null);
            if (!(!this.field_j)) {
                return 0;
            }
            return this.field_g.available();
        }
        if (!(!this.field_j)) {
            return 0;
        }
        return this.field_g.available();
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            if (this.field_j) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: while (true) {
                if (0 >= param2) {
                  if (param1 == 0) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    this.field_b = (OutputStream) null;
                    return;
                  }
                } else {
                  var5_int = this.field_g.read(param0, param3, param2);
                  if ((var5_int ^ -1) < -1) {
                    param2 = param2 - var5_int;
                    param3 = param3 + var5_int;
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
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("bc.I(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void d(int param0) {
        try {
            Throwable decompiledCaughtException = null;
            Object var2 = null;
            InterruptedException var2_ref = null;
            int var4 = 0;
            byte[] var5 = null;
            L0: {
              var4 = TrackController.field_F ? 1 : 0;
              if (param0 == 16777215) {
                break L0;
              } else {
                var5 = (byte[]) null;
                bc.a(-6, (byte[]) null);
                break L0;
              }
            }
            if (!this.field_j) {
              var2 = this;
              synchronized (var2) {
                L1: {
                  this.field_j = true;
                  this.notifyAll();
                  break L1;
                }
              }
              if (null == this.field_f) {
                this.field_f = null;
                return;
              } else {
                L2: while (true) {
                  if (this.field_f.field_f != 0) {
                    if (this.field_f.field_f != 1) {
                      this.field_f = null;
                      return;
                    } else {
                      try {
                        L3: {
                          ((Thread) (this.field_f.field_e)).join();
                          break L3;
                        }
                      } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var2_ref = (InterruptedException) (Object) decompiledCaughtException;
                        this.field_f = null;
                        return;
                      }
                      this.field_f = null;
                      return;
                    }
                  } else {
                    wl.a(1L, false);
                    continue L2;
                  }
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

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param2 + param4;
              var6 = param3 + param0;
              if (ll.field_a >= param4) {
                stackIn_4_0 = ll.field_a;
                break L1;
              } else {
                stackIn_4_0 = param4;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_4_0;
              if (ll.field_b < param3) {
                stackIn_7_0 = param3;
                break L2;
              } else {
                stackIn_7_0 = ll.field_b;
                break L2;
              }
            }
            L3: {
              var8 = stackIn_7_0;
              if (ll.field_e > var5_int) {
                stackIn_10_0 = var5_int;
                break L3;
              } else {
                stackIn_10_0 = ll.field_e;
                break L3;
              }
            }
            L4: {
              var9 = stackIn_10_0;
              if (param1 == -28846) {
                break L4;
              } else {
                field_a = (long[]) null;
                break L4;
              }
            }
            L5: {
              if (ll.field_g <= var6) {
                stackIn_15_0 = ll.field_g;
                break L5;
              } else {
                stackIn_15_0 = var6;
                break L5;
              }
            }
            L6: {
              var10 = stackIn_15_0;
              if (param4 < ll.field_a) {
                break L6;
              } else {
                if (param4 >= ll.field_e) {
                  break L6;
                } else {
                  var11 = param4 + var8 * ll.field_d;
                  var12 = -var8 + var10 + 1 >> 677255297;
                  L7: while (true) {
                    var12--;
                    if (-1 < (var12 ^ -1)) {
                      break L6;
                    } else {
                      ll.field_i[var11] = 16777215;
                      var11 = var11 + ll.field_d * 2;
                      continue L7;
                    }
                  }
                }
              }
            }
            L8: {
              if (ll.field_b > param3) {
                break L8;
              } else {
                if (ll.field_g > var6) {
                  var11 = var7 + param3 * ll.field_d;
                  var12 = var9 + (1 - var7) >> -1081567551;
                  L9: while (true) {
                    var12--;
                    if ((var12 ^ -1) > -1) {
                      break L8;
                    } else {
                      ll.field_i[var11] = 16777215;
                      var11 += 2;
                      continue L9;
                    }
                  }
                } else {
                  break L8;
                }
              }
            }
            L10: {
              if (ll.field_a > var5_int) {
                break L10;
              } else {
                if (ll.field_e > var5_int) {
                  var11 = ((1 & -param4 + var5_int) + var8) * ll.field_d - -var5_int;
                  var12 = 1 + var10 + -var8 >> 422854881;
                  L11: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L10;
                    } else {
                      ll.field_i[var11] = 16777215;
                      var11 = var11 + ll.field_d * 2;
                      continue L11;
                    }
                  }
                } else {
                  break L10;
                }
              }
            }
            L12: {
              if (param3 < ll.field_b) {
                break L12;
              } else {
                if (var6 >= ll.field_g) {
                  break L12;
                } else {
                  var11 = ll.field_d * var6 + var7 - -(1 & -param3 + var6);
                  var12 = var9 + (1 + -var7) >> -1345020191;
                  L13: while (true) {
                    var12--;
                    if (-1 < (var12 ^ -1)) {
                      break L12;
                    } else {
                      ll.field_i[var11] = 16777215;
                      var11 += 2;
                      continue L13;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var5), "bc.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    bc(java.net.Socket param0, uf param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
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
        var8 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            if (!this.field_j) {
              if (!this.field_l) {
                L1: {
                  if (this.field_e == null) {
                    this.field_e = new byte[this.field_n];
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var5 = this;
                synchronized (var5) {
                  L2: {
                    L3: {
                      if (param0 < -101) {
                        break L3;
                      } else {
                        this.field_k = (java.net.Socket) null;
                        break L3;
                      }
                    }
                    var6 = 0;
                    L4: while (true) {
                      if (param2 <= var6) {
                        L5: {
                          if (this.field_f == null) {
                            this.field_f = this.field_m.a(3, (Runnable) (this), 17);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        this.notifyAll();
                        break L2;
                      } else {
                        this.field_e[this.field_h] = param1[param3 + var6];
                        this.field_h = (1 + this.field_h) % this.field_n;
                        if ((-100 + (this.field_n + this.field_i)) % this.field_n == this.field_h) {
                          throw new IOException();
                        } else {
                          var6++;
                          continue L4;
                        }
                      }
                    }
                  }
                }
                return;
              } else {
                this.field_l = false;
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

            stackIn_27_1 = new StringBuilder().append("bc.K(").append(param0).append(',');

            if (param1 == null) {
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
          throw sl.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param2 + ',' + param3 + ')');
        }
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
            var6 = TrackController.field_F ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  var3 = this;
                  synchronized (var3) {
                    L2: {
                      L3: {
                        if (this.field_i == this.field_h) {
                          if (!this.field_j) {
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
                        if (this.field_h < this.field_i) {
                          var1_int = -this.field_i + this.field_n;
                          break L6;
                        } else {
                          var1_int = -this.field_i + this.field_h;
                          break L6;
                        }
                      }
                      var2 = this.field_i;
                      decompiledRegionSelector0 = 1;
                      break L2;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    try {
                      L7: {
                        L8: {
                          if (null == this.field_g) {
                            break L8;
                          } else {
                            this.field_g.close();
                            break L8;
                          }
                        }
                        L9: {
                          if (null == this.field_b) {
                            break L9;
                          } else {
                            this.field_b.close();
                            break L9;
                          }
                        }
                        L10: {
                          if (null != this.field_k) {
                            this.field_k.close();
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
                    if (-1 <= (var1_int ^ -1)) {
                      continue L1;
                    } else {
                      try {
                        L12: {
                          this.field_b.write(this.field_e, var2, var1_int);
                          break L12;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3_ref = (IOException) (Object) decompiledCaughtException;
                          this.field_l = true;
                          break L13;
                        }
                      }
                      this.field_i = (this.field_i + var1_int) % this.field_n;
                      try {
                        L14: {
                          L15: {
                            if (this.field_i == this.field_h) {
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
                          var3_ref = (IOException) (Object) decompiledCaughtException;
                          this.field_l = true;
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
                hb.a((Throwable) ((Object) var1_ref), 0, (String) null);
                break L17;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(boolean param0) throws IOException {
        byte[] var3;
        if (!this.field_j) {
          if (!this.field_l) {
            if (param0) {
              return;
            } else {
              var3 = (byte[]) null;
              bc.a(113, (byte[]) null);
              return;
            }
          } else {
            this.field_l = false;
            throw new IOException();
          }
        } else {
          return;
        }
    }

    public static void c(int param0) {
        if (param0 != 32) {
            return;
        }
        field_a = null;
        field_c = (int[][]) null;
    }

    final int a(int param0) throws IOException {
        if (param0 > -23) {
            return 58;
        }
        if (this.field_j) {
            return 0;
        }
        return this.field_g.read();
    }

    private bc(java.net.Socket param0, uf param1, int param2) throws IOException {
        this.field_h = 0;
        this.field_j = false;
        this.field_l = false;
        this.field_i = 0;
        try {
            this.field_m = param1;
            this.field_k = param0;
            this.field_k.setSoTimeout(30000);
            this.field_k.setTcpNoDelay(true);
            this.field_g = this.field_k.getInputStream();
            this.field_b = this.field_k.getOutputStream();
            this.field_n = param2;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "bc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_a = new long[32];
        field_o = 50;
    }
}
