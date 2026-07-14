/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pc implements Runnable {
    static String field_c;
    static String field_i;
    static int[] field_j;
    static String field_p;
    private mk field_f;
    private si field_e;
    private java.net.Socket field_n;
    private int field_g;
    private boolean field_b;
    private int field_h;
    static tg field_o;
    private InputStream field_m;
    private boolean field_l;
    private OutputStream field_k;
    private int field_a;
    private byte[] field_d;

    public final void run() {
        try {
            IOException var1 = null;
            Exception var1_ref = null;
            int var1_int = 0;
            int var2 = 0;
            Object var3 = null;
            IOException var3_ref = null;
            int var6 = 0;
            Object var7 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            var6 = Bounce.field_N;
            try {
              L0: while (true) {
                L1: {
                  var3 = this;
                  if (((pc) this).field_a == ((pc) this).field_h) {
                    if (((pc) this).field_l) {
                      try {
                        L2: {
                          if (((pc) this).field_m == null) {
                            break L2;
                          } else {
                            ((pc) this).field_m.close();
                            break L2;
                          }
                        }
                        L3: {
                          if (null != ((pc) this).field_k) {
                            ((pc) this).field_k.close();
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        L4: {
                          if (null != ((pc) this).field_n) {
                            ((pc) this).field_n.close();
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      } catch (java.io.IOException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var1 = (IOException) (Object) decompiledCaughtException;
                      }
                      ((pc) this).field_d = null;
                    } else {
                      this.wait();
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
                L5: {
                  if (((pc) this).field_a <= ((pc) this).field_h) {
                    var1_int = ((pc) this).field_h + -((pc) this).field_a;
                    break L5;
                  } else {
                    var1_int = -((pc) this).field_a + ((pc) this).field_g;
                    break L5;
                  }
                }
                var2 = ((pc) this).field_a;
                if (-1 > (var1_int ^ -1)) {
                  try {
                    ((pc) this).field_k.write(((pc) this).field_d, var2, var1_int);
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    var3_ref = (IOException) (Object) decompiledCaughtException;
                    ((pc) this).field_b = true;
                  }
                  ((pc) this).field_a = (var1_int + ((pc) this).field_a) % ((pc) this).field_g;
                  try {
                    if (((pc) this).field_a != ((pc) this).field_h) {
                      decompiledRegionSelector0 = 0;
                    } else {
                      decompiledRegionSelector0 = 1;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter2) {
                    decompiledCaughtException = decompiledCaughtParameter2;
                    var3_ref = (IOException) (Object) decompiledCaughtException;
                    ((pc) this).field_b = true;
                    decompiledRegionSelector0 = 0;
                  }
                  if (decompiledRegionSelector0 == 0) {
                    continue L0;
                  } else {
                    ((pc) this).field_k.flush();
                    continue L0;
                  }
                } else {
                  continue L0;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              var1_ref = (Exception) (Object) decompiledCaughtException;
              var7 = null;
              ti.a((Throwable) (Object) var1_ref, (byte) 100, (String) null);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        Object var5 = null;
        int var6 = 0;
        Throwable var7 = null;
        int var8 = 0;
        Throwable decompiledCaughtException = null;
        var8 = Bounce.field_N;
        if (!((pc) this).field_l) {
          if (!((pc) this).field_b) {
            L0: {
              if (((pc) this).field_d == null) {
                ((pc) this).field_d = new byte[((pc) this).field_g];
                break L0;
              } else {
                break L0;
              }
            }
            var5 = this;
            synchronized (var5) {
              var6 = param3;
              L1: while (true) {
                if (var6 >= param0) {
                  L2: {
                    if (null != ((pc) this).field_f) {
                      break L2;
                    } else {
                      ((pc) this).field_f = ((pc) this).field_e.a(3, (byte) -113, (Runnable) this);
                      break L2;
                    }
                  }
                  this.notifyAll();
                } else {
                  ((pc) this).field_d[((pc) this).field_h] = param1[var6 + param2];
                  ((pc) this).field_h = (1 + ((pc) this).field_h) % ((pc) this).field_g;
                  if (((pc) this).field_h != (-100 + (((pc) this).field_g + ((pc) this).field_a)) % ((pc) this).field_g) {
                    var6++;
                    continue L1;
                  } else {
                    throw new IOException();
                  }
                }
              }
            }
            return;
          } else {
            ((pc) this).field_b = false;
            throw new IOException();
          }
        } else {
          return;
        }
    }

    final void a(byte[] param0, boolean param1, int param2, int param3) throws IOException {
        int var5 = 0;
        int var6 = Bounce.field_N;
        if (!(!((pc) this).field_l)) {
            return;
        }
        if (!param1) {
            return;
        }
        while ((param2 ^ -1) < -1) {
            var5 = ((pc) this).field_m.read(param0, param3, param2);
            if (!((var5 ^ -1) < -1)) {
                throw new EOFException();
            }
            param3 = param3 + var5;
            param2 = param2 - var5;
        }
    }

    final int b(int param0) throws IOException {
        if (((pc) this).field_l) {
            return 0;
        }
        if (param0 != 0) {
            ((pc) this).finalize();
        }
        return ((pc) this).field_m.read();
    }

    final static boolean a(int param0, boolean param1, CharSequence param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = Bounce.field_N;
          if (param3 < 2) {
            break L0;
          } else {
            if (-37 <= (param3 ^ -1)) {
              var4 = 0;
              var5 = 0;
              if (param0 == 8272) {
                var6 = 0;
                var7 = param2.length();
                var8 = 0;
                L1: while (true) {
                  if (var7 <= var8) {
                    return var5 != 0;
                  } else {
                    L2: {
                      var9 = param2.charAt(var8);
                      if (-1 == (var8 ^ -1)) {
                        if (var9 == 45) {
                          var4 = 1;
                          var8++;
                          continue L1;
                        } else {
                          if (43 != var9) {
                            break L2;
                          } else {
                            if (!param1) {
                              break L2;
                            } else {
                              var8++;
                              continue L1;
                            }
                          }
                        }
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      L4: {
                        if (var9 < 48) {
                          break L4;
                        } else {
                          if (57 >= var9) {
                            var9 -= 48;
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (65 > var9) {
                          break L5;
                        } else {
                          if (90 < var9) {
                            break L5;
                          } else {
                            var9 -= 55;
                            break L3;
                          }
                        }
                      }
                      L6: {
                        if (var9 < 97) {
                          break L6;
                        } else {
                          if (var9 > 122) {
                            break L6;
                          } else {
                            var9 -= 87;
                            break L3;
                          }
                        }
                      }
                      return false;
                    }
                    if (var9 < param3) {
                      L7: {
                        if (var4 == 0) {
                          break L7;
                        } else {
                          var9 = -var9;
                          break L7;
                        }
                      }
                      var10 = var9 + var6 * param3;
                      if (var6 != var10 / param3) {
                        return false;
                      } else {
                        var5 = 1;
                        var6 = var10;
                        var8++;
                        continue L1;
                      }
                    } else {
                      return false;
                    }
                  }
                }
              } else {
                return true;
              }
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException("" + param3);
    }

    final void a(byte param0) {
        InterruptedException interruptedException = null;
        Object var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = Bounce.field_N;
        if (!((pc) this).field_l) {
          var2 = this;
          synchronized (var2) {
            ((pc) this).field_l = true;
            this.notifyAll();
          }
          if (param0 == -70) {
            L0: {
              if (null == ((pc) this).field_f) {
                break L0;
              } else {
                L1: while (true) {
                  if (0 != ((pc) this).field_f.field_f) {
                    if (1 == ((pc) this).field_f.field_f) {
                      try {
                        ((Thread) ((pc) this).field_f.field_e).join();
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                      }
                      break L0;
                    } else {
                      break L0;
                    }
                  } else {
                    wh.a(1L, 19406);
                    continue L1;
                  }
                }
              }
            }
            ((pc) this).field_f = null;
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static void a(int param0, byte param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Bounce.field_N;
        if (oa.field_a >= 0) {
          L0: {
            var3 = param2 - 135;
            var4 = -35 + param0;
            var5 = 256;
            if (-76 < (oa.field_a ^ -1)) {
              var5 = (oa.field_a << 943877992) / 75;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (200 < oa.field_a) {
              var5 = (-oa.field_a + 250 << 107660840) / 50;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            kh.a(bi.field_j, 1);
            qk.c();
            na.a();
            jf.c(0);
            if (var5 < 256) {
              na.a(0, 0, na.field_e, na.field_k, 0, 256 + -var5);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            ve.a(-121);
            if ((oa.field_a ^ -1) > -151) {
              bi.field_j.c(var3, var4);
              break L3;
            } else {
              jl.field_c.d(15 + var3, 10 + var4, var5);
              break L3;
            }
          }
          L4: {
            var6 = -125 + oa.field_a;
            if (var6 <= 0) {
              break L4;
            } else {
              if (-51 >= (var6 ^ -1)) {
                break L4;
              } else {
                if ((var6 ^ -1) <= -21) {
                  if (30 <= var6) {
                    var7 = (-(var6 * 256) + 12800) / 20;
                    Bounce.field_G.a(var3, var4, var7);
                    break L4;
                  } else {
                    Bounce.field_G.a(var3, var4, 256);
                    break L4;
                  }
                } else {
                  var7 = 256 * var6 / 20;
                  Bounce.field_G.a(var3, var4, var7);
                  break L4;
                }
              }
            }
          }
          L5: {
            var6 = -140 + oa.field_a;
            if (param1 <= -44) {
              break L5;
            } else {
              field_o = null;
              break L5;
            }
          }
          L6: {
            if (var6 <= 0) {
              break L6;
            } else {
              L7: {
                var7 = 256;
                if (var6 >= 20) {
                  break L7;
                } else {
                  var7 = var6 * 256 / 20;
                  break L7;
                }
              }
              bf.field_o.d(15 + var3, 10 + var4, var5 * var7 >> -237166552);
              break L6;
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void c(int param0) {
        field_c = null;
        field_j = null;
        field_p = null;
        field_i = null;
        if (param0 != -14582) {
            return;
        }
        field_o = null;
    }

    final void a(int param0) throws IOException {
        if (!(!((pc) this).field_l)) {
            return;
        }
        int var2 = -51 % ((param0 - -67) / 34);
        if (!(!((pc) this).field_b)) {
            ((pc) this).field_b = false;
            throw new IOException();
        }
    }

    final int d(int param0) throws IOException {
        if (((pc) this).field_l) {
            return 0;
        }
        if (param0 != 0) {
            ((pc) this).field_a = -27;
        }
        return ((pc) this).field_m.available();
    }

    protected final void finalize() {
        ((pc) this).a((byte) -70);
    }

    pc(java.net.Socket param0, si param1) throws IOException {
        this(param0, param1, 5000);
    }

    private pc(java.net.Socket param0, si param1, int param2) throws IOException {
        ((pc) this).field_h = 0;
        ((pc) this).field_l = false;
        ((pc) this).field_a = 0;
        ((pc) this).field_b = false;
        ((pc) this).field_e = param1;
        ((pc) this).field_n = param0;
        ((pc) this).field_n.setSoTimeout(30000);
        ((pc) this).field_n.setTcpNoDelay(true);
        ((pc) this).field_m = ((pc) this).field_n.getInputStream();
        ((pc) this).field_k = ((pc) this).field_n.getOutputStream();
        ((pc) this).field_g = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new int[8192];
        field_i = "Continue";
        field_c = "Type your email address again to make sure it's correct";
    }
}
