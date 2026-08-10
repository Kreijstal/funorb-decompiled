/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class gj implements Runnable {
    private int field_o;
    private boolean field_i;
    private ib field_b;
    private int field_n;
    private OutputStream field_k;
    static java.awt.Color field_a;
    private byte[] field_h;
    private boolean field_e;
    private fe field_c;
    private int field_g;
    private java.net.Socket field_m;
    private InputStream field_d;
    static String field_f;
    static int[] field_j;
    static volatile int field_l;

    final void a(byte param0, byte[] param1, int param2, int param3) throws IOException {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var8 = 0;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (!this.field_e) {
              if (this.field_i) {
                this.field_i = false;
                throw new IOException();
              } else {
                L1: {
                  if (null != this.field_h) {
                    break L1;
                  } else {
                    this.field_h = new byte[this.field_o];
                    break L1;
                  }
                }
                var5 = this;
                synchronized (var5) {
                  L2: {
                    L3: {
                      if (param0 == 9) {
                        break L3;
                      } else {
                        this.run();
                        break L3;
                      }
                    }
                    var6 = 0;
                    L4: while (true) {
                      if (param2 <= var6) {
                        L5: {
                          if (null == this.field_b) {
                            this.field_b = this.field_c.a((Runnable) (this), 3, 65535);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        this.notifyAll();
                        break L2;
                      } else {
                        this.field_h[this.field_g] = param1[var6 + param3];
                        this.field_g = (this.field_g + 1) % this.field_o;
                        if ((this.field_o + (this.field_n + -100)) % this.field_o == this.field_g) {
                          throw new IOException();
                        } else {
                          var6++;
                          continue L4;
                        }
                      }
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
          L6: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var5_ref);

            stackIn_27_1 = new StringBuilder().append("gj.G(").append(param0).append(',');

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
          throw ch.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void b(int param0) {
        field_f = null;
        field_a = null;
        field_j = null;
        if (param0 > -69) {
            field_f = (String) null;
        }
    }

    gj(java.net.Socket param0, fe param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(boolean param0) {
        try {
            int var4 = 0;
            var4 = Transmogrify.field_A ? 1 : 0;
            if (!(!this.field_e)) {
                return;
            }
            synchronized (this) {
                this.field_e = param0 ? true : false;
                this.notifyAll();
            }
            if (null != this.field_b) {
                while (0 == this.field_b.field_c) {
                    pg.a(1L, -94);
                }
                if (!(-2 != (this.field_b.field_c ^ -1))) {
                    try {
                        ((Thread) (this.field_b.field_g)).join();
                    } catch (InterruptedException interruptedException) {
                    }
                }
            }
            this.field_b = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(byte param0, String param1, boolean param2) {
        StringBuilder discarded$0 = null;
        int stackIn_6_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        long var8 = 0L;
        int var10_int = 0;
        Object var10 = null;
        int var11 = 0;
        char[] var15 = null;
        var11 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            var15 = param1.toCharArray();
            var5 = -108 % ((param0 - 46) / 49);
            var6 = 0;
            L1: while (true) {
              if (var6 >= param1.length()) {
                stackIn_25_0 = li.field_n[-var3_int + param1.length()];
                break L0;
              } else {
                L2: {
                  if (var3_int > 2) {
                    stackIn_6_0 = var3_int - -1;
                    break L2;
                  } else {
                    stackIn_6_0 = 3;
                    break L2;
                  }
                }
                var7 = stackIn_6_0 + var6;
                L3: while (true) {
                  if (param1.length() < var7) {
                    var6++;
                    continue L1;
                  } else {
                    var8 = 0L;
                    var10_int = var6;
                    L4: while (true) {
                      if (var10_int >= var7) {
                        var10 = ac.field_n.a(-126, var8);
                        L5: while (true) {
                          L6: {
                            if (var10 == null) {
                              break L6;
                            } else {
                              L7: {
                                if (param1 == var10) {
                                  break L7;
                                } else {
                                  dj.field_b.setLength(0);
                                  discarded$0 = dj.field_b.append(param1.substring(var6, var7));
                                  if (-1 == ((String) (var10)).indexOf(dj.field_b.toString())) {
                                    break L7;
                                  } else {
                                    var3_int = var7 - var6;
                                    break L6;
                                  }
                                }
                              }
                              var10 = ac.field_n.b(-1);
                              continue L5;
                            }
                          }
                          L8: {
                            if (param2) {
                              ac.field_n.a(param1, (byte) 26, var8);
                              if (null == ac.field_n.a(-128, var8)) {
                                throw new IllegalStateException();
                              } else {
                                break L8;
                              }
                            } else {
                              break L8;
                            }
                          }
                          var7++;
                          continue L3;
                        }
                      } else {
                        var8 = -var8 + (var8 << 791048133) - -(long)(255 & var15[var10_int]);
                        var10_int++;
                        continue L4;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var3);

            stackIn_28_1 = new StringBuilder().append("gj.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L9;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L9;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param2 + ')');
        }
        return stackIn_25_0;
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (param3 == 5768) {
              if (this.field_e) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: while (true) {
                  if (param1 <= 0) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var5_int = this.field_d.read(param2, param0, param1);
                    if (-1 > (var5_int ^ -1)) {
                      param0 = param0 + var5_int;
                      param1 = param1 - var5_int;
                      continue L1;
                    } else {
                      throw new EOFException();
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
          L2: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("gj.J(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw ch.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
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

    final static void a(byte param0, cf param1, int param2) {
        hj var3 = ff.field_D;
        var3.a(false, param2);
        var3.f(param0 + 6306, param1.field_g);
        if (param0 != 83) {
            return;
        }
        try {
            var3.c(param1.field_h, -159688920);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "gj.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        wf.a(-1);
        if (!param0) {
            gj.b(-59);
        }
    }

    final static q a(int param0, String param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        q stackIn_4_0 = null;
        q stackIn_7_0 = null;
        q stackIn_17_0 = null;
        q stackIn_20_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var5 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            if (var2_int == param0) {
              stackIn_4_0 = ai.field_a;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-64 <= (var2_int ^ -1)) {
                var3 = 0;
                L1: while (true) {
                  if (var3 < var2_int) {
                    L2: {
                      var4 = param1.charAt(var3);
                      if (var4 == 45) {
                        L3: {
                          if (var3 == 0) {
                            break L3;
                          } else {
                            if (var2_int - 1 == var3) {
                              break L3;
                            } else {
                              break L2;
                            }
                          }
                        }
                        stackIn_17_0 = vc.field_N;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        if ((li.field_o.indexOf(var4) ^ -1) != 0) {
                          break L2;
                        } else {
                          stackIn_20_0 = vc.field_N;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      }
                    }
                    var3++;
                    continue L1;
                  } else {
                    return null;
                  }
                }
              } else {
                stackIn_7_0 = rd.field_d;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var2);

            stackIn_25_1 = new StringBuilder().append("gj.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L4;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_17_0;
            } else {
              return stackIn_20_0;
            }
          }
        }
    }

    final static void e(int param0) {
        if (param0 != 0) {
            String var2 = (String) null;
            gj.a((byte) -24, (String) null, true);
        }
        ha.field_a = null;
        hk.field_c = null;
    }

    final void d(int param0) throws IOException {
        int var2 = -36 / ((param0 - 16) / 54);
        if (this.field_e) {
            return;
        }
        if (!(!this.field_i)) {
            this.field_i = false;
            throw new IOException();
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
            var6 = Transmogrify.field_A ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  var3 = this;
                  synchronized (var3) {
                    L2: {
                      L3: {
                        if (this.field_g != this.field_n) {
                          break L3;
                        } else {
                          if (this.field_e) {
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
                        var2 = this.field_n;
                        if (this.field_n <= this.field_g) {
                          var1_int = this.field_g + -this.field_n;
                          break L6;
                        } else {
                          var1_int = this.field_o - this.field_n;
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
                          if (this.field_d == null) {
                            break L8;
                          } else {
                            this.field_d.close();
                            break L8;
                          }
                        }
                        L9: {
                          if (null != this.field_k) {
                            this.field_k.close();
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: {
                          if (null == this.field_m) {
                            break L10;
                          } else {
                            this.field_m.close();
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
                    if ((var1_int ^ -1) < -1) {
                      try {
                        L12: {
                          this.field_k.write(this.field_h, var2, var1_int);
                          break L12;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3_ref = (IOException) (Object) decompiledCaughtException;
                          this.field_i = true;
                          break L13;
                        }
                      }
                      this.field_n = (var1_int + this.field_n) % this.field_o;
                      try {
                        L14: {
                          L15: {
                            if (this.field_n != this.field_g) {
                              break L15;
                            } else {
                              this.field_k.flush();
                              break L15;
                            }
                          }
                          break L14;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L16: {
                          var3_ref = (IOException) (Object) decompiledCaughtException;
                          this.field_i = true;
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
                d.a((Throwable) ((Object) var1_ref), 28, (String) null);
                break L17;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int c(int param0) throws IOException {
        if (this.field_e) {
            return 0;
        }
        if (param0 != 1) {
            return 119;
        }
        return this.field_d.read();
    }

    final static String a(int param0) {
        if (param0 > -100) {
            gj.a(false, 74);
        }
        if (w.field_a == null) {
            return "";
        }
        return w.field_a;
    }

    final static boolean a(int[] param0, byte param1) {
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        b var4_ref_b = null;
        int var4 = 0;
        int var5_int = 0;
        b var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (ll.field_Q == lj.field_z) {
              L1: {
                var2_long = lk.a(0);
                if (aa.field_a == 0) {
                  break L1;
                } else {
                  if (-1 >= (md.field_k ^ -1)) {
                    break L1;
                  } else {
                    var4_ref_b = (b) ((Object) le.field_C.a((byte) -95));
                    if (var4_ref_b == null) {
                      break L1;
                    } else {
                      if (var4_ref_b.field_g >= var2_long) {
                        break L1;
                      } else {
                        var4_ref_b.c(5);
                        tg.field_a = var4_ref_b.field_h.length;
                        nf.field_l.field_h = 0;
                        var5_int = 0;
                        L2: while (true) {
                          if (tg.field_a <= var5_int) {
                            bd.field_t = nf.field_k;
                            nf.field_k = dg.field_a;
                            dg.field_a = ca.field_e;
                            ca.field_e = var4_ref_b.field_j;
                            stackIn_12_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            nf.field_l.field_g[var5_int] = var4_ref_b.field_h[var5_int];
                            var5_int++;
                            continue L2;
                          }
                        }
                      }
                    }
                  }
                }
              }
              L3: {
                if (param1 > 83) {
                  break L3;
                } else {
                  field_f = (String) null;
                  break L3;
                }
              }
              L4: while (true) {
                L5: {
                  if (0 > md.field_k) {
                    nf.field_l.field_h = 0;
                    if (ue.a(1, 0)) {
                      md.field_k = nf.field_l.l(-12135);
                      nf.field_l.field_h = 0;
                      tg.field_a = param0[md.field_k];
                      break L5;
                    } else {
                      stackIn_19_0 = 0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    break L5;
                  }
                }
                if (!ce.a(0)) {
                  stackIn_24_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  if (aa.field_a != 0) {
                    L6: {
                      var4 = aa.field_a;
                      if (lj.field_x == 0.0) {
                        break L6;
                      } else {
                        var4 = (int)((double)var4 + d.field_c.nextGaussian() * lj.field_x);
                        if (0 <= var4) {
                          break L6;
                        } else {
                          var4 = 0;
                          break L6;
                        }
                      }
                    }
                    var5 = new b((long)var4 + var2_long, md.field_k, new byte[tg.field_a]);
                    var6 = 0;
                    L7: while (true) {
                      if (tg.field_a <= var6) {
                        le.field_C.a(var5, -100);
                        md.field_k = -1;
                        continue L4;
                      } else {
                        var5.field_h[var6] = nf.field_l.field_g[var6];
                        var6++;
                        continue L7;
                      }
                    }
                  } else {
                    bd.field_t = nf.field_k;
                    nf.field_k = dg.field_a;
                    dg.field_a = ca.field_e;
                    ca.field_e = md.field_k;
                    md.field_k = -1;
                    stackIn_27_0 = 1;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_37_0 = (RuntimeException) (var2);

            stackIn_37_1 = new StringBuilder().append("gj.L(");

            if (param0 == null) {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L8;
            } else {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L8;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_19_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_24_0 != 0;
              } else {
                return stackIn_27_0 != 0;
              }
            }
          }
        }
    }

    protected final void finalize() {
        this.a(true);
    }

    final int a(byte param0) throws IOException {
        if (this.field_e) {
            return 0;
        }
        int var2 = -83 / ((-62 - param0) / 36);
        return this.field_d.available();
    }

    private gj(java.net.Socket param0, fe param1, int param2) throws IOException {
        this.field_i = false;
        this.field_n = 0;
        this.field_e = false;
        this.field_g = 0;
        try {
            this.field_c = param1;
            this.field_m = param0;
            this.field_m.setSoTimeout(30000);
            this.field_m.setTcpNoDelay(true);
            this.field_d = this.field_m.getInputStream();
            this.field_k = this.field_m.getOutputStream();
            this.field_o = param2;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "gj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_f = "Orb points: <%0>";
        field_a = new java.awt.Color(10040319);
        field_l = 0;
    }
}
