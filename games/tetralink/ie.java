/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ie implements Runnable {
    private static int field_h;
    sa field_g;
    private Object field_d;
    static java.lang.reflect.Method field_o;
    static String field_l;
    private boolean field_c;
    private vl field_n;
    private rg field_r;
    private vl field_q;
    private boolean field_a;
    static String field_x;
    sa field_b;
    static String field_v;
    private Thread field_k;
    sa field_f;
    private be field_t;
    private static volatile long field_s;
    boolean field_e;
    sa[] field_m;
    private static String field_i;
    private static String field_u;
    private static String field_w;
    java.awt.EventQueue field_p;
    private Object field_j;

    private final vl a(String param0, int param1, int param2, boolean param3) {
        if (param1 < 52) {
            this.a(true);
        }
        return this.a(0, param0, !param3 ? 1 : 22, 19696, param2);
    }

    final vl a(String param0, int param1, Class param2) {
        if (param1 != 26298) {
            this.a(false);
        }
        return this.a(0, new Object[]{param2, param0}, 9, param1 ^ 10826, 0);
    }

    final vl a(Runnable param0, int param1, int param2) {
        int var4 = -62 % ((-2 - param1) / 53);
        return this.a(0, param0, 2, 19696, param2);
    }

    final vl a(int param0, String param1, byte param2) {
        if (param2 <= 84) {
            return (vl) null;
        }
        return this.a(param1, 63, param0, false);
    }

    final vl a(boolean param0) {
        if (param0) {
            Class var3 = (Class) null;
            this.a((String) null, -86, (Class) null);
        }
        return this.a(0, (Object) null, 5, 19696, 0);
    }

    final vl a(int param0, int param1, int param2, int param3, int param4) {
        if (param0 != 0) {
            String var7 = (String) null;
            ie.a((String) null, (String) null, 18, -31);
        }
        return this.a(param1 + (param4 << -1993636848), (Object) null, 6, 19696, (param2 << 727008240) - -param3);
    }

    final vl a(java.awt.Frame param0, int param1) {
        if (param1 != 0) {
            return (vl) null;
        }
        return this.a(0, param0, 7, 19696, 0);
    }

    final boolean a(byte param0) {
        if (!(this.field_e)) {
            return false;
        }
        if (param0 >= -59) {
            return true;
        }
        if (this.field_c) {
            return this.field_r != null ? true : false;
        }
        return this.field_d != null ? true : false;
    }

    final void a(int param0) {
        try {
            InterruptedException interruptedException = null;
            IOException iOException = null;
            int var2_int = 0;
            Throwable decompiledCaughtException = null;
            Object var2 = null;
            IOException var3 = null;
            var2 = this;
            synchronized (var2) {
              L0: {
                this.field_a = true;
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
                interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                break L2;
              }
            }
            L3: {
              if (null != this.field_g) {
                try {
                  L4: {
                    this.field_g.b(0);
                    break L4;
                  }
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L5: {
                    iOException = (IOException) (Object) decompiledCaughtException;
                    break L5;
                  }
                }
                break L3;
              } else {
                break L3;
              }
            }
            L6: {
              if (this.field_b != null) {
                try {
                  L7: {
                    this.field_b.b(0);
                    break L7;
                  }
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L8: {
                    iOException = (IOException) (Object) decompiledCaughtException;
                    break L8;
                  }
                }
                break L6;
              } else {
                break L6;
              }
            }
            L9: {
              if (null == this.field_m) {
                break L9;
              } else {
                var2_int = 0;
                L10: while (true) {
                  if (this.field_m.length <= var2_int) {
                    break L9;
                  } else {
                    if (null != this.field_m[var2_int]) {
                      try {
                        L11: {
                          this.field_m[var2_int].b(0);
                          var2_int++;
                          break L11;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L12: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          var2_int++;
                          break L12;
                        }
                      }
                      continue L10;
                    } else {
                      var2_int++;
                      continue L10;
                    }
                  }
                }
              }
            }
            L13: {
              if (null != this.field_f) {
                try {
                  L14: {
                    this.field_f.b(0);
                    break L14;
                  }
                } catch (java.io.IOException decompiledCaughtParameter4) {
                  decompiledCaughtException = decompiledCaughtParameter4;
                  L15: {
                    iOException = (IOException) (Object) decompiledCaughtException;
                    break L15;
                  }
                }
                break L13;
              } else {
                break L13;
              }
            }
            L16: {
              if (param0 == 32632) {
                break L16;
              } else {
                this.field_r = (rg) null;
                break L16;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final static sa a(String param0, String param1, int param2, int param3) {
        try {
            sa stackIn_15_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            String var7 = null;
            sa var8 = null;
            Exception var8_ref = null;
            L0: {
              if (33 != param3) {
                if ((param3 ^ -1) != -35) {
                  var4 = "jagex_" + param1 + "_preferences" + param0 + ".dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param1 + "_preferences" + param0 + "_wip.dat";
                  break L0;
                }
              } else {
                var4 = "jagex_" + param1 + "_preferences" + param0 + "_rc.dat";
                break L0;
              }
            }
            L1: {
              var5 = new String[]{"c:/rscache/", "/rscache/", field_i, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
              if (param2 == -1) {
                break L1;
              } else {
                field_i = (String) null;
                break L1;
              }
            }
            var6 = 0;
            L2: while (true) {
              if (var6 < var5.length) {
                L3: {
                  var7 = var5[var6];
                  if (-1 <= (var7.length() ^ -1)) {
                    break L3;
                  } else {
                    if (new File(var7).exists()) {
                      break L3;
                    } else {
                      var6++;
                      continue L2;
                    }
                  }
                }
                try {
                  L4: {
                    var8 = new sa(new File(var7, var4), "rw", 10000L);
                    stackIn_15_0 = (sa) (var8);
                    decompiledRegionSelector0 = 0;
                    break L4;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    var8_ref = (Exception) (Object) decompiledCaughtException;
                    var6++;
                    decompiledRegionSelector0 = 1;
                    break L5;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  return stackIn_15_0;
                } else {
                  continue L2;
                }
              } else {
                return null;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void run() {
        try {
            int stackIn_83_0 = 0;
            Throwable decompiledCaughtException = null;
            Object var2 = null;
            int var2_int = 0;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            InterruptedException var3 = null;
            sa var3_ref = null;
            int var3_int = 0;
            Exception var3_ref2 = null;
            bn var3_ref3 = null;
            int var4_int = 0;
            java.awt.Component var4 = null;
            String var4_ref = null;
            int var5 = 0;
            java.awt.datatransfer.Transferable var7 = null;
            vl var8 = null;
            Thread var9 = null;
            Object[] var10 = null;
            String var11 = null;
            Object[] var12 = null;
            java.awt.Frame var13 = null;
            String var14 = null;
            java.awt.datatransfer.Clipboard var15 = null;
            java.awt.datatransfer.Clipboard var16 = null;
            Object[] var17 = null;
            L0: while (true) {
              var2 = this;
              synchronized (var2) {
                L1: {
                  L2: while (true) {
                    if (this.field_a) {
                      return;
                    } else {
                      if (this.field_n != null) {
                        L3: {
                          var8 = this.field_n;
                          this.field_n = this.field_n.field_e;
                          if (this.field_n != null) {
                            break L3;
                          } else {
                            this.field_q = null;
                            break L3;
                          }
                        }
                        break L1;
                      } else {
                        try {
                          L4: {
                            this.wait();
                            break L4;
                          }
                        } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          L5: {
                            var3 = (InterruptedException) (Object) decompiledCaughtException;
                            break L5;
                          }
                        }
                        continue L2;
                      }
                    }
                  }
                }
              }
              try {
                L6: {
                  L7: {
                    var2_int = var8.field_c;
                    if (-2 != (var2_int ^ -1)) {
                      if (-23 != (var2_int ^ -1)) {
                        if (var2_int != 2) {
                          if (var2_int == 4) {
                            if (field_s <= k.a(0)) {
                              var8.field_f = new DataInputStream(((java.net.URL) (var8.field_g)).openStream());
                              break L7;
                            } else {
                              throw new IOException();
                            }
                          } else {
                            if (8 == var2_int) {
                              L8: {
                                var17 = (Object[]) (var8.field_g);
                                if (this.field_e) {
                                  if (((Class) (var17[0])).getClassLoader() == null) {
                                    throw new SecurityException();
                                  } else {
                                    break L8;
                                  }
                                } else {
                                  break L8;
                                }
                              }
                              var8.field_f = ((Class) (var17[0])).getDeclaredMethod((String) (var17[1]), (Class[]) (var17[2]));
                              break L7;
                            } else {
                              if (9 != var2_int) {
                                if (-19 == (var2_int ^ -1)) {
                                  var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8.field_f = var16.getContents((Object) null);
                                  break L7;
                                } else {
                                  if (19 == var2_int) {
                                    var7 = (java.awt.datatransfer.Transferable) (var8.field_g);
                                    var15 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var15.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L7;
                                  } else {
                                    if (this.field_e) {
                                      if ((var2_int ^ -1) == -4) {
                                        if (k.a(0) >= field_s) {
                                          var14 = (var8.field_a >> -1182712712 & 255) + "." + (255 & var8.field_a >> -1079792816) + "." + ((var8.field_a & 65300) >> -1350520888) + "." + (255 & var8.field_a);
                                          var8.field_f = java.net.InetAddress.getByName(var14).getHostName();
                                          break L7;
                                        } else {
                                          throw new IOException();
                                        }
                                      } else {
                                        if ((var2_int ^ -1) != -22) {
                                          if (-6 == (var2_int ^ -1)) {
                                            if (!this.field_c) {
                                              var8.field_f = Class.forName("sg").getMethod("listmodes", new Class[]{}).invoke(this.field_d, new Object[]{});
                                              break L7;
                                            } else {
                                              var8.field_f = this.field_r.a((byte) 75);
                                              break L7;
                                            }
                                          } else {
                                            if ((var2_int ^ -1) == -7) {
                                              var13 = new java.awt.Frame("Jagex Full Screen");
                                              var8.field_f = var13;
                                              var13.setResizable(false);
                                              if (this.field_c) {
                                                this.field_r.a(90, 65535 & var8.field_a, var8.field_b >> -1983148848, var8.field_a >>> -1628151568, var13, var8.field_b & 65535);
                                                break L7;
                                              } else {
                                                Class.forName("sg").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_d, new Object[]{var13, new Integer(var8.field_a >>> -351970800), new Integer(var8.field_a & 65535), new Integer(var8.field_b >> 21291600), new Integer(var8.field_b & 65535)});
                                                break L7;
                                              }
                                            } else {
                                              if (-8 == (var2_int ^ -1)) {
                                                if (this.field_c) {
                                                  this.field_r.a((java.awt.Frame) (var8.field_g), 8);
                                                  break L7;
                                                } else {
                                                  Class.forName("sg").getMethod("exit", new Class[]{}).invoke(this.field_d, new Object[]{});
                                                  break L7;
                                                }
                                              } else {
                                                if (12 == var2_int) {
                                                  var3_ref = ie.a((String) (var8.field_g), field_w, -1, field_h);
                                                  var8.field_f = var3_ref;
                                                  break L7;
                                                } else {
                                                  if ((var2_int ^ -1) == -14) {
                                                    var3_ref = ie.a((String) (var8.field_g), "", -1, field_h);
                                                    var8.field_f = var3_ref;
                                                    break L7;
                                                  } else {
                                                    L9: {
                                                      if (!this.field_e) {
                                                        break L9;
                                                      } else {
                                                        if (14 != var2_int) {
                                                          break L9;
                                                        } else {
                                                          var3_int = var8.field_a;
                                                          var4_int = var8.field_b;
                                                          if (this.field_c) {
                                                            this.field_t.a(var3_int, 101024, var4_int);
                                                            break L7;
                                                          } else {
                                                            Class.forName("aj").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_j, new Object[]{new Integer(var3_int), new Integer(var4_int)});
                                                            break L7;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L10: {
                                                      if (!this.field_e) {
                                                        break L10;
                                                      } else {
                                                        if (15 == var2_int) {
                                                          L11: {
                                                            if (var8.field_a == 0) {
                                                              stackIn_83_0 = 0;
                                                              break L11;
                                                            } else {
                                                              stackIn_83_0 = 1;
                                                              break L11;
                                                            }
                                                          }
                                                          var3_int = stackIn_83_0;
                                                          var4 = (java.awt.Component) (var8.field_g);
                                                          if (this.field_c) {
                                                            this.field_t.a(var3_int != 0, var4, 101024);
                                                            break L7;
                                                          } else {
                                                            Class.forName("aj").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_j, new Object[]{var4, new Boolean(var3_int != 0)});
                                                            break L7;
                                                          }
                                                        } else {
                                                          break L10;
                                                        }
                                                      }
                                                    }
                                                    L12: {
                                                      if (this.field_c) {
                                                        break L12;
                                                      } else {
                                                        if (17 == var2_int) {
                                                          var12 = (Object[]) (var8.field_g);
                                                          Class.forName("aj").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_j, new Object[]{var12[0], var12[1], new Integer(var8.field_a), new Integer(var8.field_b), var12[2]});
                                                          break L7;
                                                        } else {
                                                          break L12;
                                                        }
                                                      }
                                                    }
                                                    if (-17 != (var2_int ^ -1)) {
                                                      throw ie.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    } else {
                                                      try {
                                                        L13: {
                                                          if (field_l.startsWith("win")) {
                                                            L14: {
                                                              var11 = (String) (var8.field_g);
                                                              if (var11.startsWith("http://")) {
                                                                break L14;
                                                              } else {
                                                                if (!var11.startsWith("https://")) {
                                                                  throw ie.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  break L14;
                                                                }
                                                              }
                                                            }
                                                            var4_ref = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L15: while (true) {
                                                              if (var5 >= var11.length()) {
                                                                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var11 + "\"");
                                                                var8.field_f = null;
                                                                break L13;
                                                              } else {
                                                                if (0 == (var4_ref.indexOf((int) var11.charAt(var5)) ^ -1)) {
                                                                  throw ie.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  var5++;
                                                                  continue L15;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            throw ie.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter1) {
                                                        decompiledCaughtException = decompiledCaughtParameter1;
                                                        var3_ref2 = (Exception) (Object) decompiledCaughtException;
                                                        var8.field_f = var3_ref2;
                                                        throw ie.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                                                      }
                                                      break L7;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          if ((field_s ^ -1L) >= (k.a(0) ^ -1L)) {
                                            var8.field_f = java.net.InetAddress.getByName((String) (var8.field_g)).getAddress();
                                            break L7;
                                          } else {
                                            throw new IOException();
                                          }
                                        }
                                      }
                                    } else {
                                      throw ie.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    }
                                  }
                                }
                              } else {
                                L16: {
                                  var10 = (Object[]) (var8.field_g);
                                  if (!this.field_e) {
                                    break L16;
                                  } else {
                                    if (((Class) (var10[0])).getClassLoader() != null) {
                                      break L16;
                                    } else {
                                      throw new SecurityException();
                                    }
                                  }
                                }
                                var8.field_f = ((Class) (var10[0])).getDeclaredField((String) (var10[1]));
                                break L7;
                              }
                            }
                          }
                        } else {
                          var9 = new Thread((Runnable) (var8.field_g));
                          var9.setDaemon(true);
                          var9.start();
                          var9.setPriority(var8.field_a);
                          var8.field_f = var9;
                          break L7;
                        }
                      } else {
                        if ((k.a(0) ^ -1L) <= (field_s ^ -1L)) {
                          try {
                              if (false) throw (bn) null;
                            L17: {
                              var8.field_f = co.a(var8.field_a, (String) (var8.field_g), (byte) 118).a((byte) -127);
                              break L17;
                            }
                          } catch (bn decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref3 = (bn) (Object) decompiledCaughtException;
                            var8.field_f = var3_ref3.getMessage();
                            throw var3_ref3;
                          }
                          break L7;
                        } else {
                          throw new IOException();
                        }
                      }
                    } else {
                      if (field_s > k.a(0)) {
                        throw new IOException();
                      } else {
                        var8.field_f = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.field_g)), var8.field_a);
                        break L7;
                      }
                    }
                  }
                  var8.field_d = 1;
                  break L6;
                }
              } catch (java.lang.ThreadDeath decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var2_ref = (ThreadDeath) (Object) decompiledCaughtException;
                throw var2_ref;
              } catch (java.lang.Throwable decompiledCaughtParameter4) {
                decompiledCaughtException = decompiledCaughtParameter4;
                L18: {
                  var2_ref2 = decompiledCaughtException;
                  var8.field_d = 2;
                  break L18;
                }
              }
              var2 = var8;
              synchronized (var2) {
                L19: {
                  var8.notify();
                  break L19;
                }
              }
              continue L0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final vl a(int param0, Object param1, int param2, int param3, int param4) {
        vl var6 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        var6 = new vl();
        var6.field_g = param1;
        var6.field_c = param2;
        var6.field_b = param0;
        if (param3 == 19696) {
          var6.field_a = param4;
          var7 = this;
          synchronized (var7) {
            L0: {
              L1: {
                if (this.field_q == null) {
                  this.field_n = var6;
                  this.field_q = var6;
                  break L1;
                } else {
                  this.field_q.field_e = var6;
                  this.field_q = var6;
                  break L1;
                }
              }
              this.notify();
              break L0;
            }
          }
          return var6;
        } else {
          return (vl) null;
        }
    }

    final vl a(boolean param0, java.net.URL param1) {
        if (param0) {
            field_h = 53;
        }
        return this.a(0, param1, 4, 19696, 0);
    }

    final vl a(int param0, Class param1, Class[] param2, String param3) {
        if (param0 != 8) {
            field_h = -19;
        }
        return this.a(0, new Object[]{param1, param3, param2}, 8, 19696, 0);
    }

    ie(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception exception = null;
        Throwable throwable = null;
        int var5_int = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Throwable decompiledCaughtException = null;
        rg var6 = null;
        L0: {
          this.field_c = false;
          this.field_q = null;
          this.field_b = null;
          this.field_g = null;
          this.field_a = false;
          this.field_n = null;
          this.field_e = false;
          this.field_f = null;
          field_x = "1.1";
          stackIn_2_0 = this;

          if (!param3) {
            stackIn_3_0 = this;
            stackIn_3_1 = 0;
            break L0;
          } else {
            stackIn_3_0 = this;
            stackIn_3_1 = 1;
            break L0;
          }
        }
        ((ie) (this)).field_e = stackIn_3_1 != 0;
        field_h = param0;
        field_v = "Unknown";
        field_w = param1;
        try {
          L1: {
            field_v = System.getProperty("java.vendor");
            field_x = System.getProperty("java.version");
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
          if (0 == (field_v.toLowerCase().indexOf("microsoft") ^ -1)) {
            break L3;
          } else {
            this.field_c = true;
            break L3;
          }
        }
        try {
          L4: {
            field_u = System.getProperty("os.name");
            break L4;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            exception = (Exception) (Object) decompiledCaughtException;
            field_u = "Unknown";
            break L5;
          }
        }
        field_l = field_u.toLowerCase();
        try {
          L6: {
            System.getProperty("os.arch").toLowerCase();
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
            System.getProperty("os.version").toLowerCase();
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
              field_i = System.getProperty("user.home");
              if (null == field_i) {
                break L11;
              } else {
                field_i = field_i + "/";
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
          if (field_i != null) {
            break L13;
          } else {
            field_i = "~/";
            break L13;
          }
        }
        try {
          L14: {
            this.field_p = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
          if (this.field_c) {
            break L16;
          } else {
            try {
              L17: {
                Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[]{Boolean.TYPE});
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
                field_o = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
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
          }
        }
        L21: {
          wi.a(field_w, 11217, field_h);
          if (!this.field_e) {
            break L21;
          } else {
            this.field_f = new sa(wi.a((String) null, false, field_h, "random.dat"), "rw", 25L);
            this.field_g = new sa(wi.a("main_file_cache.dat2", false), "rw", 314572800L);
            this.field_b = new sa(wi.a("main_file_cache.idx255", false), "rw", 1048576L);
            this.field_m = new sa[param2];
            var5_int = 0;
            L22: while (true) {
              if (param2 <= var5_int) {
                L23: {
                  if (!this.field_c) {
                    break L23;
                  } else {
                    try {
                      L24: {
                        Class.forName("qg").newInstance();
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
                      if (this.field_c) {
                        var6 = new rg();
                        this.field_r = var6;
                        break L27;
                      } else {
                        this.field_d = Class.forName("sg").newInstance();
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
                      if (this.field_c) {
                        this.field_t = new be();
                        break L30;
                      } else {
                        this.field_j = Class.forName("aj").newInstance();
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
                this.field_m[var5_int] = new sa(wi.a("main_file_cache.idx" + var5_int, false), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        this.field_a = false;
        this.field_k = new Thread((Runnable) (this));
        this.field_k.setPriority(10);
        this.field_k.setDaemon(true);
        this.field_k.start();
    }

    static {
        field_s = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
