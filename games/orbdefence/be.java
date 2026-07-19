/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class be implements Runnable {
    gl field_u;
    private static String field_a;
    static String field_j;
    private kl field_o;
    private eb field_r;
    gl field_g;
    gl field_v;
    private Object field_i;
    private boolean field_b;
    private static String field_e;
    private Thread field_k;
    static java.lang.reflect.Method field_x;
    private rb field_l;
    private static volatile long field_w;
    static String field_s;
    private Object field_h;
    java.awt.EventQueue field_t;
    private static int field_f;
    private eb field_d;
    static String field_c;
    private boolean field_m;
    gl[] field_p;
    private static String field_n;
    boolean field_q;

    private final eb a(int param0, int param1, Object param2, int param3, int param4) {
        eb discarded$4 = null;
        eb var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        java.net.URL var9 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            var9 = (java.net.URL) null;
            discarded$4 = this.a((java.net.URL) null, (byte) 74);
            break L0;
          }
        }
        var6 = new eb();
        var6.field_e = param2;
        var6.field_f = param3;
        var6.field_b = param1;
        var6.field_c = param4;
        var7 = this;
        synchronized (var7) {
          L1: {
            L2: {
              if (this.field_d == null) {
                this.field_r = var6;
                this.field_d = var6;
                break L2;
              } else {
                this.field_d.field_d = var6;
                this.field_d = var6;
                break L2;
              }
            }
            this.notify();
            break L1;
          }
        }
        return var6;
    }

    final eb a(int param0, int param1, String param2) {
        if (param1 != 0) {
            this.field_d = (eb) null;
        }
        return this.a(false, param2, 1, param0);
    }

    final eb a(int param0, int param1, int param2, int param3, int param4) {
        if (param3 != 28252) {
            return (eb) null;
        }
        return this.a(param3 ^ 28252, (param1 << 863553136) - -param4, (Object) null, 6, (param0 << -397836560) - -param2);
    }

    final eb a(java.net.URL param0, byte param1) {
        if (param1 != -49) {
            return (eb) null;
        }
        return this.a(param1 + 49, 0, param0, 4, 0);
    }

    final void a(int param0) {
        try {
            Object var2 = null;
            InterruptedException var2_ref = null;
            IOException var2_ref2 = null;
            int var2_int = 0;
            Throwable var3 = null;
            IOException var3_ref = null;
            Throwable decompiledCaughtException = null;
            var2 = this;
            synchronized (var2) {
              L0: {
                this.field_b = true;
                this.notifyAll();
                break L0;
              }
            }
            try {
              L1: {
                this.field_k.join();
                break L1;
              }
            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var2_ref = (InterruptedException) (Object) decompiledCaughtException;
                break L2;
              }
            }
            L3: {
              if (null != this.field_u) {
                try {
                  L4: {
                    this.field_u.d(109);
                    break L4;
                  }
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L5: {
                    var2_ref2 = (IOException) (Object) decompiledCaughtException;
                    break L5;
                  }
                }
                break L3;
              } else {
                break L3;
              }
            }
            L6: {
              if (null == this.field_g) {
                break L6;
              } else {
                try {
                  L7: {
                    this.field_g.d(56);
                    break L7;
                  }
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L8: {
                    var2_ref2 = (IOException) (Object) decompiledCaughtException;
                    break L8;
                  }
                }
                break L6;
              }
            }
            L9: {
              if (param0 == 20647) {
                break L9;
              } else {
                this.field_t = (java.awt.EventQueue) null;
                break L9;
              }
            }
            L10: {
              if (this.field_p == null) {
                break L10;
              } else {
                var2_int = 0;
                L11: while (true) {
                  if (var2_int >= this.field_p.length) {
                    break L10;
                  } else {
                    if (this.field_p[var2_int] != null) {
                      try {
                        L12: {
                          this.field_p[var2_int].d(21);
                          var2_int++;
                          break L12;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L13: {
                          var3_ref = (IOException) (Object) decompiledCaughtException;
                          var2_int++;
                          break L13;
                        }
                      }
                      continue L11;
                    } else {
                      var2_int++;
                      continue L11;
                    }
                  }
                }
              }
            }
            L14: {
              if (this.field_v == null) {
                break L14;
              } else {
                try {
                  L15: {
                    this.field_v.d(param0 + -20603);
                    break L15;
                  }
                } catch (java.io.IOException decompiledCaughtParameter4) {
                  decompiledCaughtException = decompiledCaughtParameter4;
                  L16: {
                    var2_ref2 = (IOException) (Object) decompiledCaughtException;
                    break L16;
                  }
                }
                break L14;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final eb a(Class[] param0, int param1, String param2, Class param3) {
        if (param1 != -334290960) {
            field_s = (String) null;
        }
        return this.a(0, 0, new Object[]{param3, param2, param0}, 8, 0);
    }

    final boolean b(byte param0) {
        if (!this.field_q) {
            return false;
        }
        if (param0 > -70) {
            return false;
        }
        if (!this.field_m) {
            return this.field_i != null ? true : false;
        }
        return this.field_o != null ? true : false;
    }

    final eb a(byte param0, java.awt.Frame param1) {
        eb discarded$0 = null;
        if (param0 != -120) {
            String var4 = (String) null;
            discarded$0 = this.a(27, -112, (String) null);
        }
        return this.a(0, 0, param1, 7, 0);
    }

    final eb a(int param0, int param1, Runnable param2) {
        if (param0 != 314572800) {
            return (eb) null;
        }
        return this.a(0, param1, param2, 2, 0);
    }

    private final static gl a(String param0, String param1, byte param2, int param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            gl var8_ref = null;
            gl stackIn_11_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            gl stackOut_10_0 = null;
            L0: {
              if (-34 == (param3 ^ -1)) {
                var4 = "jagex_" + param1 + "_preferences" + param0 + "_rc.dat";
                break L0;
              } else {
                if (34 == param3) {
                  var4 = "jagex_" + param1 + "_preferences" + param0 + "_wip.dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param1 + "_preferences" + param0 + ".dat";
                  break L0;
                }
              }
            }
            var5_array = new String[]{"c:/rscache/", "/rscache/", field_n, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            var6 = 0;
            L1: while (true) {
              if (var5_array.length <= var6) {
                var6 = -32 % ((28 - param2) / 41);
                return null;
              } else {
                L2: {
                  var7 = var5_array[var6];
                  if (0 >= var7.length()) {
                    break L2;
                  } else {
                    if (new File(var7).exists()) {
                      break L2;
                    } else {
                      var6++;
                      continue L1;
                    }
                  }
                }
                try {
                  L3: {
                    var8_ref = new gl(new File(var7, var4), "rw", 10000L);
                    stackOut_10_0 = (gl) (var8_ref);
                    stackIn_11_0 = stackOut_10_0;
                    decompiledRegionSelector0 = 0;
                    break L3;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var8 = (Exception) (Object) decompiledCaughtException;
                    var6++;
                    decompiledRegionSelector0 = 1;
                    break L4;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  return stackIn_11_0;
                } else {
                  continue L1;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final eb a(boolean param0, String param1, int param2, int param3) {
        if (param2 != 1) {
            this.field_o = (kl) null;
        }
        return this.a(0, param3, param1, param0 ? 22 : 1, 0);
    }

    final eb a(Class param0, String param1, int param2) {
        int var4 = 16 % ((param2 - -85) / 34);
        return this.a(0, 0, new Object[]{param0, param1}, 9, 0);
    }

    final eb a(byte param0) {
        if (param0 != 31) {
            this.field_b = false;
        }
        return this.a(0, 0, (Object) null, 5, 0);
    }

    public final void run() {
        try {
            Object discarded$6 = null;
            Object discarded$7 = null;
            Object discarded$8 = null;
            Object discarded$9 = null;
            Process discarded$10 = null;
            Object discarded$11 = null;
            Object var2 = null;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            Exception var3_ref = null;
            bk var3_ref2 = null;
            gl var3_ref3 = null;
            int var3_int = 0;
            Throwable var4 = null;
            int var4_int = 0;
            String var4_ref = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            Object var8 = null;
            eb var8_ref = null;
            Thread var9 = null;
            Object[] var10 = null;
            java.awt.datatransfer.Clipboard var11 = null;
            java.awt.datatransfer.Clipboard var12 = null;
            java.awt.Component var13 = null;
            Object[] var14 = null;
            String var15 = null;
            java.awt.Frame var16 = null;
            String var17 = null;
            Object[] var18 = null;
            int stackIn_65_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_64_0 = 0;
            int stackOut_63_0 = 0;
            L0: while (true) {
              synchronized (var2) {
                L1: {
                  var8_ref.notify();
                  var2 = this;
                  break L1;
                }
              }
              synchronized (var2) {
                L2: {
                  L3: while (true) {
                    if (this.field_b) {
                      return;
                    } else {
                      if (this.field_r != null) {
                        L4: {
                          var8_ref = this.field_r;
                          this.field_r = this.field_r.field_d;
                          if (null != this.field_r) {
                            break L4;
                          } else {
                            this.field_d = null;
                            break L4;
                          }
                        }
                        break L2;
                      } else {
                        try {
                          L5: {
                            this.wait();
                            break L5;
                          }
                        } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          L6: {
                            var3 = (InterruptedException) (Object) decompiledCaughtException;
                            break L6;
                          }
                        }
                        continue L3;
                      }
                    }
                  }
                }
              }
              try {
                L7: {
                  L8: {
                    var2_int = var8_ref.field_f;
                    if ((var2_int ^ -1) != -2) {
                      if (22 == var2_int) {
                        if ((field_w ^ -1L) < (ji.b(127) ^ -1L)) {
                          throw new IOException();
                        } else {
                          try {
                              if (false) throw (bk) null;
                            L9: {
                              var8_ref.field_g = a.a(var8_ref.field_b, (String) (var8_ref.field_e), -115).b(0);
                              break L9;
                            }
                          } catch (bk decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref2 = (bk) (Object) decompiledCaughtException;
                            var8_ref.field_g = var3_ref2.getMessage();
                            throw var3_ref2;
                          }
                          break L8;
                        }
                      } else {
                        if (2 != var2_int) {
                          if (-5 == (var2_int ^ -1)) {
                            if ((ji.b(106) ^ -1L) <= (field_w ^ -1L)) {
                              var8_ref.field_g = new DataInputStream(((java.net.URL) (var8_ref.field_e)).openStream());
                              break L8;
                            } else {
                              throw new IOException();
                            }
                          } else {
                            if (-9 == (var2_int ^ -1)) {
                              L10: {
                                var18 = (Object[]) (var8_ref.field_e);
                                if (this.field_q) {
                                  if (null == ((Class) (var18[0])).getClassLoader()) {
                                    throw new SecurityException();
                                  } else {
                                    break L10;
                                  }
                                } else {
                                  break L10;
                                }
                              }
                              var8_ref.field_g = ((Class) (var18[0])).getDeclaredMethod((String) (var18[1]), (Class[]) (var18[2]));
                              break L8;
                            } else {
                              if ((var2_int ^ -1) != -10) {
                                if (18 != var2_int) {
                                  if (-20 != (var2_int ^ -1)) {
                                    if (this.field_q) {
                                      if (3 == var2_int) {
                                        if ((field_w ^ -1L) >= (ji.b(126) ^ -1L)) {
                                          var17 = (var8_ref.field_b >> 4231288 & 255) + "." + ((var8_ref.field_b & 16767812) >> 1266990736) + "." + ((var8_ref.field_b & 65280) >> -1098476408) + "." + (var8_ref.field_b & 255);
                                          var8_ref.field_g = java.net.InetAddress.getByName(var17).getHostName();
                                          break L8;
                                        } else {
                                          throw new IOException();
                                        }
                                      } else {
                                        if (21 != var2_int) {
                                          if (var2_int != 5) {
                                            if (6 == var2_int) {
                                              var16 = new java.awt.Frame("Jagex Full Screen");
                                              var8_ref.field_g = var16;
                                              var16.setResizable(false);
                                              if (this.field_m) {
                                                this.field_o.a(var8_ref.field_b >>> 1977134512, var8_ref.field_c & 65535, -121, var8_ref.field_c >> -334290960, var8_ref.field_b & 65535, var16);
                                                break L8;
                                              } else {
                                                discarded$6 = Class.forName("oi").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_i, new Object[]{var16, new Integer(var8_ref.field_b >>> 834301328), new Integer(var8_ref.field_b & 65535), new Integer(var8_ref.field_c >> -771667792), new Integer(65535 & var8_ref.field_c)});
                                                break L8;
                                              }
                                            } else {
                                              if (-8 != (var2_int ^ -1)) {
                                                if (12 != var2_int) {
                                                  if (13 != var2_int) {
                                                    L11: {
                                                      if (!this.field_q) {
                                                        break L11;
                                                      } else {
                                                        if (14 != var2_int) {
                                                          break L11;
                                                        } else {
                                                          var3_int = var8_ref.field_b;
                                                          var4_int = var8_ref.field_c;
                                                          if (!this.field_m) {
                                                            discarded$7 = Class.forName("jh").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_h, new Object[]{new Integer(var3_int), new Integer(var4_int)});
                                                            break L8;
                                                          } else {
                                                            this.field_l.a(var4_int, var3_int, -117);
                                                            break L8;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L12: {
                                                      if (!this.field_q) {
                                                        break L12;
                                                      } else {
                                                        if (15 != var2_int) {
                                                          break L12;
                                                        } else {
                                                          L13: {
                                                            if (0 == var8_ref.field_b) {
                                                              stackOut_64_0 = 0;
                                                              stackIn_65_0 = stackOut_64_0;
                                                              break L13;
                                                            } else {
                                                              stackOut_63_0 = 1;
                                                              stackIn_65_0 = stackOut_63_0;
                                                              break L13;
                                                            }
                                                          }
                                                          var3_int = stackIn_65_0;
                                                          var13 = (java.awt.Component) (var8_ref.field_e);
                                                          if (this.field_m) {
                                                            this.field_l.a(32512, var13, var3_int != 0);
                                                            break L8;
                                                          } else {
                                                            discarded$8 = Class.forName("jh").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_h, new Object[]{var13, new Boolean(var3_int != 0)});
                                                            break L8;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L14: {
                                                      if (this.field_m) {
                                                        break L14;
                                                      } else {
                                                        if ((var2_int ^ -1) != -18) {
                                                          break L14;
                                                        } else {
                                                          var14 = (Object[]) (var8_ref.field_e);
                                                          discarded$9 = Class.forName("jh").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_h, new Object[]{var14[0], var14[1], new Integer(var8_ref.field_b), new Integer(var8_ref.field_c), var14[2]});
                                                          break L8;
                                                        }
                                                      }
                                                    }
                                                    if (var2_int != 16) {
                                                      throw be.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    } else {
                                                      try {
                                                        L15: {
                                                          if (field_c.startsWith("win")) {
                                                            L16: {
                                                              var15 = (String) (var8_ref.field_e);
                                                              if (var15.startsWith("http://")) {
                                                                break L16;
                                                              } else {
                                                                if (!var15.startsWith("https://")) {
                                                                  throw be.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  break L16;
                                                                }
                                                              }
                                                            }
                                                            var4_ref = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L17: while (true) {
                                                              if (var5 >= var15.length()) {
                                                                discarded$10 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var15 + "\"");
                                                                var8_ref.field_g = null;
                                                                break L15;
                                                              } else {
                                                                if (var4_ref.indexOf((int) var15.charAt(var5)) == -1) {
                                                                  throw be.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  var5++;
                                                                  continue L17;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            throw be.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                                                        decompiledCaughtException = decompiledCaughtParameter2;
                                                        var3_ref = (Exception) (Object) decompiledCaughtException;
                                                        var8_ref.field_g = var3_ref;
                                                        throw be.<RuntimeException>$cfr$sneakyThrow(var3_ref);
                                                      }
                                                      break L8;
                                                    }
                                                  } else {
                                                    var3_ref3 = be.a((String) (var8_ref.field_e), "", (byte) -32, field_f);
                                                    var8_ref.field_g = var3_ref3;
                                                    break L8;
                                                  }
                                                } else {
                                                  var3_ref3 = be.a((String) (var8_ref.field_e), field_a, (byte) 123, field_f);
                                                  var8_ref.field_g = var3_ref3;
                                                  break L8;
                                                }
                                              } else {
                                                if (this.field_m) {
                                                  this.field_o.a((java.awt.Frame) (var8_ref.field_e), (byte) 34);
                                                  break L8;
                                                } else {
                                                  discarded$11 = Class.forName("oi").getMethod("exit", new Class[]{}).invoke(this.field_i, new Object[]{});
                                                  break L8;
                                                }
                                              }
                                            }
                                          } else {
                                            if (!this.field_m) {
                                              var8_ref.field_g = Class.forName("oi").getMethod("listmodes", new Class[]{}).invoke(this.field_i, new Object[]{});
                                              break L8;
                                            } else {
                                              var8_ref.field_g = this.field_o.a(109);
                                              break L8;
                                            }
                                          }
                                        } else {
                                          if ((field_w ^ -1L) >= (ji.b(-81) ^ -1L)) {
                                            var8_ref.field_g = java.net.InetAddress.getByName((String) (var8_ref.field_e)).getAddress();
                                            break L8;
                                          } else {
                                            throw new IOException();
                                          }
                                        }
                                      }
                                    } else {
                                      throw be.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    }
                                  } else {
                                    var7 = (java.awt.datatransfer.Transferable) (var8_ref.field_e);
                                    var12 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var12.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L8;
                                  }
                                } else {
                                  var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8_ref.field_g = var11.getContents((Object) null);
                                  break L8;
                                }
                              } else {
                                L18: {
                                  var10 = (Object[]) (var8_ref.field_e);
                                  if (this.field_q) {
                                    if (null != ((Class) (var10[0])).getClassLoader()) {
                                      break L18;
                                    } else {
                                      throw new SecurityException();
                                    }
                                  } else {
                                    break L18;
                                  }
                                }
                                var8_ref.field_g = ((Class) (var10[0])).getDeclaredField((String) (var10[1]));
                                break L8;
                              }
                            }
                          }
                        } else {
                          var9 = new Thread((Runnable) (var8_ref.field_e));
                          var9.setDaemon(true);
                          var9.start();
                          var9.setPriority(var8_ref.field_b);
                          var8_ref.field_g = var9;
                          break L8;
                        }
                      }
                    } else {
                      if ((field_w ^ -1L) >= (ji.b(-60) ^ -1L)) {
                        var8_ref.field_g = new java.net.Socket(java.net.InetAddress.getByName((String) (var8_ref.field_e)), var8_ref.field_b);
                        break L8;
                      } else {
                        throw new IOException();
                      }
                    }
                  }
                  var8_ref.field_a = 1;
                  break L7;
                }
              } catch (java.lang.ThreadDeath decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var2_ref = (ThreadDeath) (Object) decompiledCaughtException;
                throw var2_ref;
              } catch (java.lang.Throwable decompiledCaughtParameter4) {
                decompiledCaughtException = decompiledCaughtParameter4;
                L19: {
                  var2_ref2 = decompiledCaughtException;
                  var8_ref.field_a = 2;
                  break L19;
                }
              }
              var2 = var8_ref;
              continue L0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    be(int param0, String param1, int param2, boolean param3) throws Exception {
        String discarded$6 = null;
        String discarded$7 = null;
        java.lang.reflect.Method discarded$8 = null;
        Object discarded$9 = null;
        Exception exception = null;
        Throwable throwable = null;
        int var5_int = 0;
        kl var6 = null;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          this.field_b = false;
          this.field_v = null;
          this.field_r = null;
          this.field_u = null;
          this.field_m = false;
          this.field_g = null;
          this.field_d = null;
          this.field_q = false;
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param3) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((be) (this)).field_q = stackIn_3_1 != 0;
        field_j = "1.1";
        field_f = param0;
        field_a = param1;
        field_s = "Unknown";
        try {
          L1: {
            field_s = System.getProperty("java.vendor");
            field_j = System.getProperty("java.version");
            break L1;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            exception = (Exception) (Object) decompiledCaughtException;
            break L2;
          }
        }
        L3: {
          if ((field_s.toLowerCase().indexOf("microsoft") ^ -1) == 0) {
            break L3;
          } else {
            this.field_m = true;
            break L3;
          }
        }
        try {
          L4: {
            field_e = System.getProperty("os.name");
            break L4;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            exception = (Exception) (Object) decompiledCaughtException;
            field_e = "Unknown";
            break L5;
          }
        }
        field_c = field_e.toLowerCase();
        try {
          L6: {
            discarded$6 = System.getProperty("os.arch").toLowerCase();
            break L6;
          }
        } catch (java.lang.Exception decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L7: {
            exception = (Exception) (Object) decompiledCaughtException;
            break L7;
          }
        }
        try {
          L8: {
            discarded$7 = System.getProperty("os.version").toLowerCase();
            break L8;
          }
        } catch (java.lang.Exception decompiledCaughtParameter3) {
          decompiledCaughtException = decompiledCaughtParameter3;
          L9: {
            exception = (Exception) (Object) decompiledCaughtException;
            break L9;
          }
        }
        try {
          L10: {
            L11: {
              field_n = System.getProperty("user.home");
              if (field_n == null) {
                break L11;
              } else {
                field_n = field_n + "/";
                break L11;
              }
            }
            break L10;
          }
        } catch (java.lang.Exception decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          L12: {
            exception = (Exception) (Object) decompiledCaughtException;
            break L12;
          }
        }
        L13: {
          if (field_n != null) {
            break L13;
          } else {
            field_n = "~/";
            break L13;
          }
        }
        try {
          L14: {
            this.field_t = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
            break L14;
          }
        } catch (java.lang.Throwable decompiledCaughtParameter5) {
          decompiledCaughtException = decompiledCaughtParameter5;
          L15: {
            throwable = decompiledCaughtException;
            break L15;
          }
        }
        L16: {
          if (!this.field_m) {
            try {
              L17: {
                discarded$8 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[]{Boolean.TYPE});
                break L17;
              }
            } catch (java.lang.Exception decompiledCaughtParameter6) {
              decompiledCaughtException = decompiledCaughtParameter6;
              L18: {
                exception = (Exception) (Object) decompiledCaughtException;
                break L18;
              }
            }
            try {
              L19: {
                field_x = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
                break L19;
              }
            } catch (java.lang.Exception decompiledCaughtParameter7) {
              decompiledCaughtException = decompiledCaughtParameter7;
              L20: {
                exception = (Exception) (Object) decompiledCaughtException;
                break L20;
              }
            }
            break L16;
          } else {
            break L16;
          }
        }
        L21: {
          ri.a(field_a, (byte) -94, field_f);
          if (!this.field_q) {
            break L21;
          } else {
            this.field_v = new gl(ri.a(-121, (String) null, field_f, "random.dat"), "rw", 25L);
            this.field_u = new gl(ri.a("main_file_cache.dat2", 1), "rw", 314572800L);
            this.field_g = new gl(ri.a("main_file_cache.idx255", 1), "rw", 1048576L);
            this.field_p = new gl[param2];
            var5_int = 0;
            L22: while (true) {
              if (var5_int >= param2) {
                L23: {
                  if (!this.field_m) {
                    break L23;
                  } else {
                    try {
                      L24: {
                        discarded$9 = Class.forName("je").newInstance();
                        break L24;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter8) {
                      decompiledCaughtException = decompiledCaughtParameter8;
                      L25: {
                        throwable = decompiledCaughtException;
                        break L25;
                      }
                    }
                    break L23;
                  }
                }
                try {
                  L26: {
                    L27: {
                      if (this.field_m) {
                        var6 = new kl();
                        this.field_o = var6;
                        break L27;
                      } else {
                        this.field_i = Class.forName("oi").newInstance();
                        break L27;
                      }
                    }
                    break L26;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter9) {
                  decompiledCaughtException = decompiledCaughtParameter9;
                  L28: {
                    throwable = decompiledCaughtException;
                    break L28;
                  }
                }
                try {
                  L29: {
                    L30: {
                      if (!this.field_m) {
                        this.field_h = Class.forName("jh").newInstance();
                        break L30;
                      } else {
                        this.field_l = new rb();
                        break L30;
                      }
                    }
                    break L29;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter10) {
                  decompiledCaughtException = decompiledCaughtParameter10;
                  L31: {
                    throwable = decompiledCaughtException;
                    break L31;
                  }
                }
                break L21;
              } else {
                this.field_p[var5_int] = new gl(ri.a("main_file_cache.idx" + var5_int, 1), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        this.field_b = false;
        this.field_k = new Thread((Runnable) (this));
        this.field_k.setPriority(10);
        this.field_k.setDaemon(true);
        this.field_k.start();
    }

    static {
        field_w = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
