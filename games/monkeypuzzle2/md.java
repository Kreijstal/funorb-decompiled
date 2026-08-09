/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class md implements Runnable {
    private static volatile long field_s;
    private static int field_a;
    pl field_t;
    pl field_x;
    private eh field_g;
    boolean field_q;
    private static String field_w;
    private boolean field_o;
    private static String field_d;
    pl[] field_e;
    private static String field_j;
    private ic field_u;
    static String field_f;
    static String field_l;
    static String field_m;
    private Thread field_p;
    private pk field_k;
    static java.lang.reflect.Method field_h;
    private ic field_r;
    private boolean field_c;
    private Object field_v;
    pl field_i;
    java.awt.EventQueue field_b;
    private Object field_n;

    final ic b(byte param0) {
        if (param0 > -10) {
            this.field_v = (Object) null;
        }
        return this.a(0, 0, 5, (Object) null, (byte) 116);
    }

    final boolean a(int param0) {
        ic discarded$0 = null;
        if (param0 != 2) {
            Object var3 = (Object) null;
            discarded$0 = this.a(76, -63, -117, (Object) null, (byte) 11);
        }
        if (!(this.field_q)) {
            return false;
        }
        if (!this.field_o) {
            return null != this.field_v ? true : false;
        }
        return null != this.field_k ? true : false;
    }

    final void a(byte param0) {
        try {
            Throwable decompiledCaughtException = null;
            Object var2 = null;
            InterruptedException var2_ref = null;
            IOException var2_ref2 = null;
            int var2_int = 0;
            IOException var3 = null;
            var2 = this;
            synchronized (var2) {
              L0: {
                this.field_c = true;
                this.notifyAll();
                break L0;
              }
            }
            try {
              L1: {
                L2: {
                  if (param0 == -84) {
                    break L2;
                  } else {
                    this.run();
                    break L2;
                  }
                }
                this.field_p.join();
                break L1;
              }
            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L3: {
                var2_ref = (InterruptedException) (Object) decompiledCaughtException;
                break L3;
              }
            }
            L4: {
              if (this.field_t == null) {
                break L4;
              } else {
                try {
                  L5: {
                    this.field_t.a(19808);
                    break L5;
                  }
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L6: {
                    var2_ref2 = (IOException) (Object) decompiledCaughtException;
                    break L6;
                  }
                }
                break L4;
              }
            }
            L7: {
              if (this.field_i != null) {
                try {
                  L8: {
                    this.field_i.a(param0 + 19892);
                    break L8;
                  }
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L9: {
                    var2_ref2 = (IOException) (Object) decompiledCaughtException;
                    break L9;
                  }
                }
                break L7;
              } else {
                break L7;
              }
            }
            L10: {
              if (null == this.field_e) {
                break L10;
              } else {
                var2_int = 0;
                L11: while (true) {
                  if (this.field_e.length <= var2_int) {
                    break L10;
                  } else {
                    if (this.field_e[var2_int] != null) {
                      try {
                        L12: {
                          this.field_e[var2_int].a(19808);
                          var2_int++;
                          break L12;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L13: {
                          var3 = (IOException) (Object) decompiledCaughtException;
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
              if (this.field_x == null) {
                break L14;
              } else {
                try {
                  L15: {
                    this.field_x.a(19808);
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

    private final ic a(int param0, int param1, int param2, Object param3, byte param4) {
        ic var6 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        L0: {
          var6 = new ic();
          var6.field_c = param0;
          var6.field_e = param3;
          if (param4 == 116) {
            break L0;
          } else {
            this.b((byte) 104);
            break L0;
          }
        }
        var6.field_d = param1;
        var6.field_a = param2;
        var7 = this;
        synchronized (var7) {
          L1: {
            L2: {
              if (this.field_u != null) {
                this.field_u.field_f = var6;
                this.field_u = var6;
                break L2;
              } else {
                this.field_r = var6;
                this.field_u = var6;
                break L2;
              }
            }
            this.notify();
            break L1;
          }
        }
        return var6;
    }

    private final static pl a(int param0, String param1, String param2, byte param3) {
        try {
            pl stackIn_15_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            String var7 = null;
            pl var8 = null;
            Exception var8_ref = null;
            L0: {
              if ((param0 ^ -1) == -34) {
                var4 = "jagex_" + param1 + "_preferences" + param2 + "_rc.dat";
                break L0;
              } else {
                if (-35 == (param0 ^ -1)) {
                  var4 = "jagex_" + param1 + "_preferences" + param2 + "_wip.dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param1 + "_preferences" + param2 + ".dat";
                  break L0;
                }
              }
            }
            L1: {
              if (param3 == 84) {
                break L1;
              } else {
                field_l = (String) null;
                break L1;
              }
            }
            var5 = new String[]{"c:/rscache/", "/rscache/", field_d, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            var6 = 0;
            L2: while (true) {
              if (var5.length > var6) {
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
                    var8 = new pl(new File(var7, var4), "rw", 10000L);
                    stackIn_15_0 = (pl) (var8);
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

    final ic a(int param0, Class[] param1, Class param2, String param3) {
        int var5 = -103 / ((param0 - 62) / 32);
        return this.a(0, 0, 8, new Object[]{param2, param3, param1}, (byte) 116);
    }

    private final ic a(byte param0, String param1, boolean param2, int param3) {
        if (param0 != 118) {
            return (ic) null;
        }
        return this.a(param3, 0, param2 ? 22 : 1, param1, (byte) 116);
    }

    public final void run() {
        try {
            int stackIn_83_0 = 0;
            Throwable decompiledCaughtException = null;
            Object var2 = null;
            int var2_int = 0;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            InterruptedException var3_ref_InterruptedException = null;
            int var3 = 0;
            Exception var3_ref_Exception = null;
            pl var3_ref_pl = null;
            pg var3_ref_pg = null;
            int var4_int = 0;
            String var4 = null;
            int var5 = 0;
            java.awt.datatransfer.Transferable var7 = null;
            ic var8 = null;
            Object[] var9 = null;
            java.awt.datatransfer.Clipboard var10 = null;
            java.awt.datatransfer.Clipboard var11 = null;
            java.awt.Frame var12 = null;
            String var13 = null;
            Object[] var14 = null;
            java.awt.Component var15 = null;
            String var16 = null;
            Object[] var17 = null;
            Thread var18 = null;
            L0: while (true) {
              var2 = this;
              synchronized (var2) {
                L1: {
                  L2: while (true) {
                    if (this.field_c) {
                      return;
                    } else {
                      if (null == this.field_r) {
                        try {
                          L3: {
                            this.wait();
                            break L3;
                          }
                        } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          L4: {
                            var3_ref_InterruptedException = (InterruptedException) (Object) decompiledCaughtException;
                            break L4;
                          }
                        }
                        continue L2;
                      } else {
                        L5: {
                          var8 = this.field_r;
                          this.field_r = this.field_r.field_f;
                          if (null != this.field_r) {
                            break L5;
                          } else {
                            this.field_u = null;
                            break L5;
                          }
                        }
                        break L1;
                      }
                    }
                  }
                }
              }
              try {
                L6: {
                  L7: {
                    var2_int = var8.field_a;
                    if ((var2_int ^ -1) == -2) {
                      if (pf.a(0) >= field_s) {
                        var8.field_b = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.field_e)), var8.field_c);
                        break L7;
                      } else {
                        throw new IOException();
                      }
                    } else {
                      if ((var2_int ^ -1) != -23) {
                        if (2 == var2_int) {
                          var18 = new Thread((Runnable) (var8.field_e));
                          var18.setDaemon(true);
                          var18.start();
                          var18.setPriority(var8.field_c);
                          var8.field_b = var18;
                          break L7;
                        } else {
                          if (var2_int == 4) {
                            if ((field_s ^ -1L) >= (pf.a(0) ^ -1L)) {
                              var8.field_b = new DataInputStream(((java.net.URL) (var8.field_e)).openStream());
                              break L7;
                            } else {
                              throw new IOException();
                            }
                          } else {
                            if (-9 == (var2_int ^ -1)) {
                              L8: {
                                var17 = (Object[]) (var8.field_e);
                                if (this.field_q) {
                                  if (((Class) (var17[0])).getClassLoader() == null) {
                                    throw new SecurityException();
                                  } else {
                                    break L8;
                                  }
                                } else {
                                  break L8;
                                }
                              }
                              var8.field_b = ((Class) (var17[0])).getDeclaredMethod((String) (var17[1]), (Class[]) (var17[2]));
                              break L7;
                            } else {
                              if (var2_int != 9) {
                                if (var2_int != 18) {
                                  if (-20 != (var2_int ^ -1)) {
                                    if (!this.field_q) {
                                      throw md.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    } else {
                                      if (3 == var2_int) {
                                        if (pf.a(0) < field_s) {
                                          throw new IOException();
                                        } else {
                                          var16 = (255 & var8.field_c >> -1496461928) + "." + (255 & var8.field_c >> 728374000) + "." + ((var8.field_c & 65491) >> -357642552) + "." + (255 & var8.field_c);
                                          var8.field_b = java.net.InetAddress.getByName(var16).getHostName();
                                          break L7;
                                        }
                                      } else {
                                        if (var2_int == 21) {
                                          if ((pf.a(0) ^ -1L) <= (field_s ^ -1L)) {
                                            var8.field_b = java.net.InetAddress.getByName((String) (var8.field_e)).getAddress();
                                            break L7;
                                          } else {
                                            throw new IOException();
                                          }
                                        } else {
                                          if (-6 == (var2_int ^ -1)) {
                                            if (this.field_o) {
                                              var8.field_b = this.field_k.a((byte) 88);
                                              break L7;
                                            } else {
                                              var8.field_b = Class.forName("se").getMethod("listmodes", new Class[]{}).invoke(this.field_v, new Object[]{});
                                              break L7;
                                            }
                                          } else {
                                            if (-7 != (var2_int ^ -1)) {
                                              if (7 != var2_int) {
                                                if ((var2_int ^ -1) != -13) {
                                                  if (-14 != (var2_int ^ -1)) {
                                                    L9: {
                                                      if (!this.field_q) {
                                                        break L9;
                                                      } else {
                                                        if (var2_int != 14) {
                                                          break L9;
                                                        } else {
                                                          var3 = var8.field_c;
                                                          var4_int = var8.field_d;
                                                          if (this.field_o) {
                                                            this.field_g.a((byte) 121, var3, var4_int);
                                                            break L7;
                                                          } else {
                                                            Class.forName("bm").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_n, new Object[]{new Integer(var3), new Integer(var4_int)});
                                                            break L7;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L10: {
                                                      if (!this.field_q) {
                                                        break L10;
                                                      } else {
                                                        if (-16 == (var2_int ^ -1)) {
                                                          L11: {
                                                            if (var8.field_c == 0) {
                                                              stackIn_83_0 = 0;
                                                              break L11;
                                                            } else {
                                                              stackIn_83_0 = 1;
                                                              break L11;
                                                            }
                                                          }
                                                          var3 = stackIn_83_0;
                                                          var15 = (java.awt.Component) (var8.field_e);
                                                          if (!this.field_o) {
                                                            Class.forName("bm").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_n, new Object[]{var15, new Boolean(var3 != 0)});
                                                            break L7;
                                                          } else {
                                                            this.field_g.a(var3 != 0, (byte) 90, var15);
                                                            break L7;
                                                          }
                                                        } else {
                                                          break L10;
                                                        }
                                                      }
                                                    }
                                                    L12: {
                                                      if (this.field_o) {
                                                        break L12;
                                                      } else {
                                                        if (17 == var2_int) {
                                                          var14 = (Object[]) (var8.field_e);
                                                          Class.forName("bm").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_n, new Object[]{var14[0], var14[1], new Integer(var8.field_c), new Integer(var8.field_d), var14[2]});
                                                          break L7;
                                                        } else {
                                                          break L12;
                                                        }
                                                      }
                                                    }
                                                    if (16 != var2_int) {
                                                      throw md.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    } else {
                                                      try {
                                                        L13: {
                                                          if (field_f.startsWith("win")) {
                                                            L14: {
                                                              var13 = (String) (var8.field_e);
                                                              if (var13.startsWith("http://")) {
                                                                break L14;
                                                              } else {
                                                                if (var13.startsWith("https://")) {
                                                                  break L14;
                                                                } else {
                                                                  throw md.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                            var4 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L15: while (true) {
                                                              if (var5 >= var13.length()) {
                                                                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var13 + "\"");
                                                                var8.field_b = null;
                                                                break L13;
                                                              } else {
                                                                if (0 != (var4.indexOf((int) var13.charAt(var5)) ^ -1)) {
                                                                  var5++;
                                                                  continue L15;
                                                                } else {
                                                                  throw md.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            throw md.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter1) {
                                                        decompiledCaughtException = decompiledCaughtParameter1;
                                                        var3_ref_Exception = (Exception) (Object) decompiledCaughtException;
                                                        var8.field_b = var3_ref_Exception;
                                                        throw md.<RuntimeException>$cfr$sneakyThrow(var3_ref_Exception);
                                                      }
                                                      break L7;
                                                    }
                                                  } else {
                                                    var3_ref_pl = md.a(field_a, "", (String) (var8.field_e), (byte) 84);
                                                    var8.field_b = var3_ref_pl;
                                                    break L7;
                                                  }
                                                } else {
                                                  var3_ref_pl = md.a(field_a, field_j, (String) (var8.field_e), (byte) 84);
                                                  var8.field_b = var3_ref_pl;
                                                  break L7;
                                                }
                                              } else {
                                                if (!this.field_o) {
                                                  Class.forName("se").getMethod("exit", new Class[]{}).invoke(this.field_v, new Object[]{});
                                                  break L7;
                                                } else {
                                                  this.field_k.a(106, (java.awt.Frame) (var8.field_e));
                                                  break L7;
                                                }
                                              }
                                            } else {
                                              var12 = new java.awt.Frame("Jagex Full Screen");
                                              var8.field_b = var12;
                                              var12.setResizable(false);
                                              if (!this.field_o) {
                                                Class.forName("se").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_v, new Object[]{var12, new Integer(var8.field_c >>> -1483718192), new Integer(var8.field_c & 65535), new Integer(var8.field_d >> -1904995120), new Integer(var8.field_d & 65535)});
                                                break L7;
                                              } else {
                                                this.field_k.a(var8.field_d & 65535, 65535 & var8.field_c, var8.field_d >> 1757663600, var8.field_c >>> -292531472, -16, var12);
                                                break L7;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    var7 = (java.awt.datatransfer.Transferable) (var8.field_e);
                                    var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var11.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L7;
                                  }
                                } else {
                                  var10 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8.field_b = var10.getContents((Object) null);
                                  break L7;
                                }
                              } else {
                                L16: {
                                  var9 = (Object[]) (var8.field_e);
                                  if (this.field_q) {
                                    if (null == ((Class) (var9[0])).getClassLoader()) {
                                      throw new SecurityException();
                                    } else {
                                      break L16;
                                    }
                                  } else {
                                    break L16;
                                  }
                                }
                                var8.field_b = ((Class) (var9[0])).getDeclaredField((String) (var9[1]));
                                break L7;
                              }
                            }
                          }
                        }
                      } else {
                        if ((pf.a(0) ^ -1L) <= (field_s ^ -1L)) {
                          try {
                              if (false) throw (pg) null;
                            L17: {
                              var8.field_b = bf.a((String) (var8.field_e), (byte) -84, var8.field_c).a(0);
                              break L17;
                            }
                          } catch (pg decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref_pg = (pg) (Object) decompiledCaughtException;
                            var8.field_b = var3_ref_pg.getMessage();
                            throw var3_ref_pg;
                          }
                          break L7;
                        } else {
                          throw new IOException();
                        }
                      }
                    }
                  }
                  var8.field_g = 1;
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
                  var8.field_g = 2;
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

    final ic a(boolean param0, Class param1, String param2) {
        if (param0) {
            this.b((byte) -62);
        }
        return this.a(0, 0, 9, new Object[]{param1, param2}, (byte) 116);
    }

    final ic a(String param0, int param1, int param2) {
        if (param1 != 0) {
            this.a((byte) 110);
        }
        return this.a((byte) 118, param0, false, param2);
    }

    final ic a(java.awt.Frame param0, int param1) {
        int var3 = 18 % ((-50 - param1) / 57);
        return this.a(0, 0, 7, param0, (byte) 116);
    }

    final ic a(byte param0, java.net.URL param1) {
        if (param0 <= 96) {
            this.field_b = (java.awt.EventQueue) null;
        }
        return this.a(0, 0, 4, param1, (byte) 116);
    }

    final ic a(Runnable param0, int param1, int param2) {
        if (param2 != 0) {
            this.field_v = (Object) null;
        }
        return this.a(param1, 0, 2, param0, (byte) 116);
    }

    final ic a(int param0, int param1, boolean param2, int param3, int param4) {
        if (param2) {
            String var7 = (String) null;
            this.a(111, (Class[]) null, (Class) null, (String) null);
        }
        return this.a(param1 + (param0 << -1854977072), param3 + (param4 << 663126928), 6, (Object) null, (byte) 116);
    }

    md(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception exception = null;
        Throwable throwable = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        pk var7 = null;
        L0: {
          this.field_x = null;
          this.field_u = null;
          this.field_q = false;
          this.field_t = null;
          this.field_r = null;
          this.field_o = false;
          this.field_c = false;
          this.field_i = null;
          field_a = param0;
          field_m = "1.1";
          field_j = param1;
          field_l = "Unknown";
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
        ((md) (this)).field_q = stackIn_3_1 != 0;
        try {
          L1: {
            field_l = System.getProperty("java.vendor");
            field_m = System.getProperty("java.version");
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
          if (0 != (field_l.toLowerCase().indexOf("microsoft") ^ -1)) {
            this.field_o = true;
            break L3;
          } else {
            break L3;
          }
        }
        try {
          L4: {
            field_w = System.getProperty("os.name");
            break L4;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            exception = (Exception) (Object) decompiledCaughtException;
            field_w = "Unknown";
            break L5;
          }
        }
        field_f = field_w.toLowerCase();
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
              field_d = System.getProperty("user.home");
              if (field_d == null) {
                break L11;
              } else {
                field_d = field_d + "/";
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
          if (field_d == null) {
            field_d = "~/";
            break L13;
          } else {
            break L13;
          }
        }
        try {
          L14: {
            this.field_b = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
          if (!this.field_o) {
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
                field_h = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
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
          nk.a(field_a, 0, field_j);
          if (!this.field_q) {
            break L21;
          } else {
            this.field_x = new pl(nk.a(-1, "random.dat", (String) null, field_a), "rw", 25L);
            this.field_t = new pl(nk.a("main_file_cache.dat2", -2), "rw", 314572800L);
            this.field_i = new pl(nk.a("main_file_cache.idx255", -2), "rw", 1048576L);
            this.field_e = new pl[param2];
            var5_int = 0;
            L22: while (true) {
              if (var5_int >= param2) {
                L23: {
                  if (this.field_o) {
                    try {
                      L24: {
                        Class.forName("oc").newInstance();
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
                  } else {
                    break L23;
                  }
                }
                try {
                  L26: {
                    L27: {
                      if (this.field_o) {
                        var7 = new pk();
                        this.field_k = var7;
                        break L27;
                      } else {
                        this.field_v = Class.forName("se").newInstance();
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
                      if (this.field_o) {
                        this.field_g = new eh();
                        break L30;
                      } else {
                        this.field_n = Class.forName("bm").newInstance();
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
                this.field_e[var5_int] = new pl(nk.a("main_file_cache.idx" + var5_int, -2), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        this.field_c = false;
        this.field_p = new Thread((Runnable) (this));
        this.field_p.setPriority(10);
        this.field_p.setDaemon(true);
        this.field_p.start();
    }

    static {
        field_s = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
