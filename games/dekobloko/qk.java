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
        Object var5 = null;
        int var6 = 0;
        Throwable var7 = null;
        int var8 = 0;
        Object stackIn_14_0 = null;
        Object stackIn_21_0 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_20_0 = null;
        Object stackOut_13_0 = null;
        var8 = client.field_A ? 1 : 0;
        if (((qk) this).field_g) {
          return;
        } else {
          L0: {
            if (param2 == 1) {
              break L0;
            } else {
              field_s = null;
              break L0;
            }
          }
          if (!((qk) this).field_c) {
            L1: {
              if (((qk) this).field_h == null) {
                ((qk) this).field_h = new byte[((qk) this).field_r];
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
                  L4: {
                    if (var6 >= param1) {
                      L5: {
                        if (null != ((qk) this).field_p) {
                          break L5;
                        } else {
                          ((qk) this).field_p = ((qk) this).field_j.a((byte) -45, 3, (Runnable) this);
                          break L5;
                        }
                      }
                      this.notifyAll();
                      stackOut_20_0 = var5;
                      stackIn_21_0 = stackOut_20_0;
                      break L4;
                    } else {
                      ((qk) this).field_h[((qk) this).field_f] = param3[param0 + var6];
                      ((qk) this).field_f = (1 + ((qk) this).field_f) % ((qk) this).field_r;
                      stackOut_13_0 = this;
                      stackIn_21_0 = stackOut_13_0;
                      stackIn_14_0 = stackOut_13_0;
                      if (var8 != 0) {
                        break L4;
                      } else {
                        if (((qk) this).field_f == (((qk) this).field_r + ((qk) this).field_q + -100) % ((qk) this).field_r) {
                          throw new IOException();
                        } else {
                          var6++;
                          continue L3;
                        }
                      }
                    }
                  }
                  break L2;
                }
              }
            }
            return;
          } else {
            ((qk) this).field_c = false;
            throw new IOException();
          }
        }
    }

    final int c(byte param0) throws IOException {
        if (!(!((qk) this).field_g)) {
            return 0;
        }
        int var2 = -99 % ((-44 - param0) / 41);
        return ((qk) this).field_o.read();
    }

    final static String d(byte param0) {
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_8_0 = null;
        String stackIn_9_0 = null;
        String stackOut_7_0 = null;
        var5 = client.field_A ? 1 : 0;
        var1 = "(" + lg.field_U + " " + bb.field_d + " " + kf.field_L + ") " + bh.field_k;
        if (param0 >= 14) {
          if (-1 > (sm.field_e ^ -1)) {
            var1 = var1 + ":";
            var2 = 0;
            L0: while (true) {
              if (var2 < sm.field_e) {
                stackOut_7_0 = var1 + 32;
                stackIn_9_0 = stackOut_7_0;
                stackIn_8_0 = stackOut_7_0;
                if (var5 == 0) {
                  L1: {
                    L2: {
                      var1 = stackIn_9_0;
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
                      var1 = var1 + (char)var4;
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
                  var1 = var1 + (char)var3;
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
          return null;
        }
    }

    final void a(int param0) {
        Object var2 = null;
        InterruptedException var2_ref = null;
        Throwable var3 = null;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        var4 = client.field_A ? 1 : 0;
        if (((qk) this).field_g) {
          return;
        } else {
          var2 = this;
          synchronized (var2) {
            L0: {
              ((qk) this).field_g = true;
              this.notifyAll();
              break L0;
            }
          }
          if (param0 == 0) {
            if (null != ((qk) this).field_p) {
              L1: while (true) {
                if (((qk) this).field_p.field_c != 0) {
                  L2: {
                    if (1 != ((qk) this).field_p.field_c) {
                      break L2;
                    } else {
                      try {
                        L3: {
                          ((Thread) ((qk) this).field_p.field_b).join();
                          decompiledRegionSelector0 = 0;
                          break L3;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L4: {
                          var2_ref = (InterruptedException) (Object) decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                          break L4;
                        }
                      }
                      if (decompiledRegionSelector0 == 0) {
                        ((qk) this).field_p = null;
                        return;
                      } else {
                        break L2;
                      }
                    }
                  }
                  ((qk) this).field_p = null;
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
              ((qk) this).field_p = null;
              return;
            }
          } else {
            return;
          }
        }
    }

    public final void run() {
        try {
            IOException iOException = null;
            int var1_int = 0;
            IOException var1 = null;
            Exception var1_ref = null;
            int var2 = 0;
            Object var3 = null;
            int var6 = 0;
            Object var7 = null;
            Throwable decompiledCaughtException = null;
            var6 = client.field_A ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  L2: {
                    var3 = this;
                    if (((qk) this).field_f == ((qk) this).field_q) {
                      L3: {
                        if (!((qk) this).field_g) {
                          break L3;
                        } else {
                          if (var6 == 0) {
                            try {
                              L4: {
                                L5: {
                                  if (null != ((qk) this).field_o) {
                                    ((qk) this).field_o.close();
                                    break L5;
                                  } else {
                                    break L5;
                                  }
                                }
                                L6: {
                                  if (null != ((qk) this).field_b) {
                                    ((qk) this).field_b.close();
                                    break L6;
                                  } else {
                                    break L6;
                                  }
                                }
                                L7: {
                                  if (null == ((qk) this).field_l) {
                                    break L7;
                                  } else {
                                    ((qk) this).field_l.close();
                                    break L7;
                                  }
                                }
                                break L4;
                              }
                            } catch (java.io.IOException decompiledCaughtParameter0) {
                              decompiledCaughtException = decompiledCaughtParameter0;
                              L8: {
                                var1 = (IOException) (Object) decompiledCaughtException;
                                break L8;
                              }
                            }
                            ((qk) this).field_h = null;
                            break L0;
                          } else {
                            break L3;
                          }
                        }
                      }
                      this.wait();
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L9: {
                    var2 = ((qk) this).field_q;
                    if (((qk) this).field_q > ((qk) this).field_f) {
                      break L9;
                    } else {
                      var1_int = ((qk) this).field_f + -((qk) this).field_q;
                      break L9;
                    }
                  }
                  var1_int = ((qk) this).field_r - ((qk) this).field_q;
                  if ((var1_int ^ -1) >= -1) {
                    continue L1;
                  } else {
                    try {
                      L10: {
                        ((qk) this).field_b.write(((qk) this).field_h, var2, var1_int);
                        break L10;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L11: {
                        iOException = (IOException) (Object) decompiledCaughtException;
                        ((qk) this).field_c = true;
                        break L11;
                      }
                    }
                    ((qk) this).field_q = (var1_int + ((qk) this).field_q) % ((qk) this).field_r;
                    try {
                      L12: {
                        L13: {
                          if (((qk) this).field_f == ((qk) this).field_q) {
                            ((qk) this).field_b.flush();
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                        break L12;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      L14: {
                        iOException = (IOException) (Object) decompiledCaughtException;
                        ((qk) this).field_c = true;
                        break L14;
                      }
                    }
                    continue L1;
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L15: {
                var1_ref = (Exception) (Object) decompiledCaughtException;
                var7 = null;
                qb.a((Throwable) (Object) var1_ref, 16408, (String) null);
                break L15;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    protected final void finalize() {
        ((qk) this).a(0);
    }

    final static Object a(byte[] param0, int param1, boolean param2) {
        fn var3 = null;
        if (param0 != null) {
          if (136 < param0.length) {
            var3 = new fn();
            ((mk) (Object) var3).a(param0, true);
            return (Object) (Object) var3;
          } else {
            if (param1 == -1389597532) {
              if (param2) {
                return (Object) (Object) jd.a(0, param0);
              } else {
                return (Object) (Object) param0;
              }
            } else {
              field_i = 67;
              if (param2) {
                return (Object) (Object) jd.a(0, param0);
              } else {
                return (Object) (Object) param0;
              }
            }
          }
        } else {
          return null;
        }
    }

    final int b(int param0) throws IOException {
        if (!(!((qk) this).field_g)) {
            return 0;
        }
        if (param0 != 0) {
            return -106;
        }
        return ((qk) this).field_o.available();
    }

    public static void c(int param0) {
        field_e = null;
        if (param0 != -11657) {
            return;
        }
        field_s = null;
    }

    final void a(int param0, int param1, byte param2, byte[] param3) throws IOException {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var6 = client.field_A ? 1 : 0;
        if (!((qk) this).field_g) {
          L0: while (true) {
            L1: {
              if (-1 <= (param0 ^ -1)) {
                break L1;
              } else {
                var5 = ((qk) this).field_o.read(param3, param1, param0);
                var8 = var5;
                var7 = 0;
                if (var6 != 0) {
                  if (var7 == var8) {
                    return;
                  } else {
                    ((qk) this).a(31);
                    return;
                  }
                } else {
                  if (var7 < var8) {
                    param1 = param1 + var5;
                    param0 = param0 - var5;
                    if (var6 == 0) {
                      continue L0;
                    } else {
                      break L1;
                    }
                  } else {
                    throw new EOFException();
                  }
                }
              }
            }
            if (param2 != 17) {
              ((qk) this).a(31);
              return;
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final void b(byte param0) throws IOException {
        if (!(!((qk) this).field_g)) {
            return;
        }
        if (param0 > -21) {
            return;
        }
        if (!(!((qk) this).field_c)) {
            ((qk) this).field_c = false;
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
        ((qk) this).field_g = false;
        ((qk) this).field_c = false;
        ((qk) this).field_q = 0;
        ((qk) this).field_f = 0;
        ((qk) this).field_j = param1;
        ((qk) this).field_l = param0;
        ((qk) this).field_l.setSoTimeout(30000);
        ((qk) this).field_l.setTcpNoDelay(true);
        ((qk) this).field_o = ((qk) this).field_l.getInputStream();
        ((qk) this).field_b = ((qk) this).field_l.getOutputStream();
        ((qk) this).field_r = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = new String[]{"Deko Bloko", "Double Deko", "Triple Deko", "Mega Deko", "Double Bloko", "Triple Bloko", "Mini Bombo", "Maxi Bombo", "Tower Bloko", "Massive Attako", "Clean Sweepo", "Uh-Oh Bloko", "Floral Bloko", "Urban Bloko", "Retro Bloko", "Bronze Blokker", "Silver Blokker", "Gold Blokker", "Blok of Beginning", "Blok of Victory", "Blok of Supremacy", "Deko Pwnage", "Ultimate Pwnage", "Quick Deko", "Safe Deko", "Deko Modo", "Shape Mover", "Shape Sender", "Shape Dispatcher", "Shape Consigner", "Shape Shifter"};
        field_e = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
    }
}
