/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ib implements Runnable {
    static String field_j;
    private sc field_m;
    private static volatile long field_w;
    private static String field_i;
    bg field_a;
    boolean field_f;
    bg field_h;
    private Thread field_r;
    private boolean field_l;
    private af field_o;
    bg[] field_g;
    private af field_k;
    java.awt.EventQueue field_t;
    static java.lang.reflect.Method field_c;
    bg field_u;
    private static String field_n;
    private Object field_d;
    private Object field_e;
    private static String field_v;
    private static int field_b;
    private cl field_x;
    private boolean field_q;
    static String field_s;
    static String field_p;

    private final af a(String param0, int param1, int param2, boolean param3) {
        if (param1 < 37) {
            this.field_a = (bg) null;
        }
        return this.a(0, param2, !param3 ? 1 : 22, -15563, param0);
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
                this.field_q = true;
                this.notifyAll();
                break L0;
              }
            }
            if (param0 == 55) {
              try {
                L1: {
                  this.field_r.join();
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
                if (null == this.field_u) {
                  break L3;
                } else {
                  try {
                    L4: {
                      this.field_u.a((byte) 20);
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
                }
              }
              L6: {
                if (this.field_h != null) {
                  try {
                    L7: {
                      this.field_h.a((byte) 20);
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
                } else {
                  break L6;
                }
              }
              L9: {
                if (this.field_g != null) {
                  var2_int = 0;
                  L10: while (true) {
                    if (var2_int >= this.field_g.length) {
                      break L9;
                    } else {
                      if (null != this.field_g[var2_int]) {
                        try {
                          L11: {
                            this.field_g[var2_int].a((byte) 20);
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
                } else {
                  break L9;
                }
              }
              L13: {
                if (this.field_a != null) {
                  try {
                    L14: {
                      this.field_a.a((byte) 20);
                      break L14;
                    }
                  } catch (java.io.IOException decompiledCaughtParameter4) {
                    decompiledCaughtException = decompiledCaughtParameter4;
                    L15: {
                      var2_ref2 = (IOException) (Object) decompiledCaughtException;
                      break L15;
                    }
                  }
                  break L13;
                } else {
                  break L13;
                }
              }
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final af a(String param0, Class[] param1, Class param2, byte param3) {
        if (param3 != -32) {
            this.a(37);
        }
        return this.a(0, 0, 8, -15563, new Object[]{param2, param0, param1});
    }

    private final af a(int param0, int param1, int param2, int param3, Object param4) {
        af var6 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        L0: {
          var6 = new af();
          var6.field_f = param0;
          if (param3 == -15563) {
            break L0;
          } else {
            this.run();
            break L0;
          }
        }
        var6.field_c = param4;
        var6.field_a = param2;
        var6.field_g = param1;
        var7 = this;
        synchronized (var7) {
          L1: {
            L2: {
              if (this.field_o == null) {
                this.field_k = var6;
                this.field_o = var6;
                break L2;
              } else {
                this.field_o.field_e = var6;
                this.field_o = var6;
                break L2;
              }
            }
            this.notify();
            break L1;
          }
        }
        return var6;
    }

    final af a(java.net.URL param0, int param1) {
        if (param1 != 0) {
            String var4 = (String) null;
            ib.a((String) null, (String) null, 88, 91);
        }
        return this.a(0, 0, 4, param1 + -15563, param0);
    }

    final boolean a(boolean param0) {
        if (!param0) {
            Class var3 = (Class) null;
            this.a((String) null, 24, (Class) null);
        }
        if (!this.field_f) {
            return false;
        }
        if (!this.field_l) {
            return this.field_e != null ? true : false;
        }
        return this.field_x != null ? true : false;
    }

    public final void run() {
        try {
            int stackIn_84_0 = 0;
            Throwable decompiledCaughtException = null;
            Object var2 = null;
            int var2_int = 0;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            InterruptedException var3_ref_InterruptedException = null;
            int var3 = 0;
            Exception var3_ref_Exception = null;
            bg var3_ref_bg = null;
            uk var3_ref_uk = null;
            int var4_int = 0;
            String var4 = null;
            int var5 = 0;
            java.awt.datatransfer.Transferable var7 = null;
            af var8 = null;
            Thread var9 = null;
            String var10 = null;
            String var11 = null;
            Object[] var12 = null;
            java.awt.Component var13 = null;
            java.awt.Frame var14 = null;
            java.awt.datatransfer.Clipboard var15 = null;
            java.awt.datatransfer.Clipboard var16 = null;
            Object[] var17 = null;
            Object[] var18 = null;
            L0: while (true) {
              var2 = this;
              synchronized (var2) {
                L1: {
                  L2: while (true) {
                    if (!this.field_q) {
                      if (this.field_k != null) {
                        L3: {
                          var8 = this.field_k;
                          this.field_k = this.field_k.field_e;
                          if (null == this.field_k) {
                            this.field_o = null;
                            break L3;
                          } else {
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
                            var3_ref_InterruptedException = (InterruptedException) (Object) decompiledCaughtException;
                            break L5;
                          }
                        }
                        continue L2;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
              try {
                L6: {
                  L7: {
                    var2_int = var8.field_a;
                    if (-2 != (var2_int ^ -1)) {
                      if ((var2_int ^ -1) != -23) {
                        if (-3 != (var2_int ^ -1)) {
                          if (-5 == (var2_int ^ -1)) {
                            if ((bb.b(-1) ^ -1L) <= (field_w ^ -1L)) {
                              var8.field_b = new DataInputStream(((java.net.URL) (var8.field_c)).openStream());
                              break L7;
                            } else {
                              throw new IOException();
                            }
                          } else {
                            if (var2_int == 8) {
                              L8: {
                                var18 = (Object[]) (var8.field_c);
                                if (this.field_f) {
                                  if (null == ((Class) (var18[0])).getClassLoader()) {
                                    throw new SecurityException();
                                  } else {
                                    break L8;
                                  }
                                } else {
                                  break L8;
                                }
                              }
                              var8.field_b = ((Class) (var18[0])).getDeclaredMethod((String) (var18[1]), (Class[]) (var18[2]));
                              break L7;
                            } else {
                              if (var2_int == 9) {
                                L9: {
                                  var17 = (Object[]) (var8.field_c);
                                  if (!this.field_f) {
                                    break L9;
                                  } else {
                                    if (((Class) (var17[0])).getClassLoader() == null) {
                                      throw new SecurityException();
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                var8.field_b = ((Class) (var17[0])).getDeclaredField((String) (var17[1]));
                                break L7;
                              } else {
                                if (18 == var2_int) {
                                  var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8.field_b = var16.getContents((Object) null);
                                  break L7;
                                } else {
                                  if ((var2_int ^ -1) == -20) {
                                    var7 = (java.awt.datatransfer.Transferable) (var8.field_c);
                                    var15 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var15.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L7;
                                  } else {
                                    if (this.field_f) {
                                      if (3 != var2_int) {
                                        if (21 != var2_int) {
                                          if (5 == var2_int) {
                                            if (this.field_l) {
                                              var8.field_b = this.field_x.a(-16);
                                              break L7;
                                            } else {
                                              var8.field_b = Class.forName("rj").getMethod("listmodes", new Class[]{}).invoke(this.field_e, new Object[]{});
                                              break L7;
                                            }
                                          } else {
                                            if (6 == var2_int) {
                                              var14 = new java.awt.Frame("Jagex Full Screen");
                                              var8.field_b = var14;
                                              var14.setResizable(false);
                                              if (this.field_l) {
                                                this.field_x.a(var8.field_f >> -2053526128, 11468, var8.field_g >>> -540972080, var14, 65535 & var8.field_f, 65535 & var8.field_g);
                                                break L7;
                                              } else {
                                                Class.forName("rj").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_e, new Object[]{var14, new Integer(var8.field_g >>> 1879958352), new Integer(var8.field_g & 65535), new Integer(var8.field_f >> -1358766128), new Integer(65535 & var8.field_f)});
                                                break L7;
                                              }
                                            } else {
                                              if ((var2_int ^ -1) == -8) {
                                                if (!this.field_l) {
                                                  Class.forName("rj").getMethod("exit", new Class[]{}).invoke(this.field_e, new Object[]{});
                                                  break L7;
                                                } else {
                                                  this.field_x.a(8, (java.awt.Frame) (var8.field_c));
                                                  break L7;
                                                }
                                              } else {
                                                if (-13 != (var2_int ^ -1)) {
                                                  if (13 != var2_int) {
                                                    L10: {
                                                      if (!this.field_f) {
                                                        break L10;
                                                      } else {
                                                        if ((var2_int ^ -1) != -15) {
                                                          break L10;
                                                        } else {
                                                          var3 = var8.field_g;
                                                          var4_int = var8.field_f;
                                                          if (this.field_l) {
                                                            this.field_m.a(var4_int, true, var3);
                                                            break L7;
                                                          } else {
                                                            Class.forName("jl").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_d, new Object[]{new Integer(var3), new Integer(var4_int)});
                                                            break L7;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L11: {
                                                      if (!this.field_f) {
                                                        break L11;
                                                      } else {
                                                        if (15 == var2_int) {
                                                          L12: {
                                                            if (-1 == (var8.field_g ^ -1)) {
                                                              stackIn_84_0 = 0;
                                                              break L12;
                                                            } else {
                                                              stackIn_84_0 = 1;
                                                              break L12;
                                                            }
                                                          }
                                                          var3 = stackIn_84_0;
                                                          var13 = (java.awt.Component) (var8.field_c);
                                                          if (this.field_l) {
                                                            this.field_m.a(var3 != 0, var13, 54);
                                                            break L7;
                                                          } else {
                                                            Class.forName("jl").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_d, new Object[]{var13, new Boolean(var3 != 0)});
                                                            break L7;
                                                          }
                                                        } else {
                                                          break L11;
                                                        }
                                                      }
                                                    }
                                                    L13: {
                                                      if (this.field_l) {
                                                        break L13;
                                                      } else {
                                                        if (-18 == (var2_int ^ -1)) {
                                                          var12 = (Object[]) (var8.field_c);
                                                          Class.forName("jl").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_d, new Object[]{var12[0], var12[1], new Integer(var8.field_g), new Integer(var8.field_f), var12[2]});
                                                          break L7;
                                                        } else {
                                                          break L13;
                                                        }
                                                      }
                                                    }
                                                    if (-17 == (var2_int ^ -1)) {
                                                      try {
                                                        L14: {
                                                          if (field_s.startsWith("win")) {
                                                            L15: {
                                                              var11 = (String) (var8.field_c);
                                                              if (var11.startsWith("http://")) {
                                                                break L15;
                                                              } else {
                                                                if (!var11.startsWith("https://")) {
                                                                  throw ib.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  break L15;
                                                                }
                                                              }
                                                            }
                                                            var4 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L16: while (true) {
                                                              if (var5 >= var11.length()) {
                                                                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var11 + "\"");
                                                                var8.field_b = null;
                                                                break L14;
                                                              } else {
                                                                if (-1 == var4.indexOf((int) var11.charAt(var5))) {
                                                                  throw ib.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  var5++;
                                                                  continue L16;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            throw ib.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter1) {
                                                        decompiledCaughtException = decompiledCaughtParameter1;
                                                        var3_ref_Exception = (Exception) (Object) decompiledCaughtException;
                                                        var8.field_b = var3_ref_Exception;
                                                        throw ib.<RuntimeException>$cfr$sneakyThrow(var3_ref_Exception);
                                                      }
                                                      break L7;
                                                    } else {
                                                      throw ib.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    }
                                                  } else {
                                                    var3_ref_bg = ib.a("", (String) (var8.field_c), 69, field_b);
                                                    var8.field_b = var3_ref_bg;
                                                    break L7;
                                                  }
                                                } else {
                                                  var3_ref_bg = ib.a(field_n, (String) (var8.field_c), 104, field_b);
                                                  var8.field_b = var3_ref_bg;
                                                  break L7;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          if (field_w > bb.b(-1)) {
                                            throw new IOException();
                                          } else {
                                            var8.field_b = java.net.InetAddress.getByName((String) (var8.field_c)).getAddress();
                                            break L7;
                                          }
                                        }
                                      } else {
                                        if ((field_w ^ -1L) >= (bb.b(-1) ^ -1L)) {
                                          var10 = (var8.field_g >> -641062856 & 255) + "." + (255 & var8.field_g >> -2075453520) + "." + ((var8.field_g & 65493) >> 661687304) + "." + (var8.field_g & 255);
                                          var8.field_b = java.net.InetAddress.getByName(var10).getHostName();
                                          break L7;
                                        } else {
                                          throw new IOException();
                                        }
                                      }
                                    } else {
                                      throw ib.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    }
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var9 = new Thread((Runnable) (var8.field_c));
                          var9.setDaemon(true);
                          var9.start();
                          var9.setPriority(var8.field_g);
                          var8.field_b = var9;
                          break L7;
                        }
                      } else {
                        if (bb.b(-1) < field_w) {
                          throw new IOException();
                        } else {
                          try {
                              if (false) throw (uk) null;
                            L17: {
                              var8.field_b = lh.a(var8.field_g, (String) (var8.field_c), -1).b(-64);
                              break L17;
                            }
                          } catch (uk decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref_uk = (uk) (Object) decompiledCaughtException;
                            var8.field_b = var3_ref_uk.getMessage();
                            throw var3_ref_uk;
                          }
                          break L7;
                        }
                      }
                    } else {
                      if (field_w <= bb.b(-1)) {
                        var8.field_b = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.field_c)), var8.field_g);
                        break L7;
                      } else {
                        throw new IOException();
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

    final af a(java.awt.Frame param0, byte param1) {
        if (param1 != -95) {
            this.field_r = (Thread) null;
        }
        return this.a(0, 0, 7, -15563, param0);
    }

    final af a(int param0, int param1, int param2, int param3, boolean param4) {
        if (param4) {
            java.awt.Frame var7 = (java.awt.Frame) null;
            this.a((java.awt.Frame) null, (byte) 11);
        }
        return this.a(param0 + (param1 << -1290329808), (param3 << -1165186704) + param2, 6, -15563, (Object) null);
    }

    final af a(int param0) {
        if (param0 != 2) {
            return (af) null;
        }
        return this.a(0, 0, 5, -15563, (Object) null);
    }

    private final static bg a(String param0, String param1, int param2, int param3) {
        try {
            bg stackIn_15_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            String var7 = null;
            bg var8 = null;
            Exception var8_ref = null;
            if (param2 >= 55) {
              L0: {
                if (-34 == (param3 ^ -1)) {
                  var4 = "jagex_" + param0 + "_preferences" + param1 + "_rc.dat";
                  break L0;
                } else {
                  if (param3 != 34) {
                    var4 = "jagex_" + param0 + "_preferences" + param1 + ".dat";
                    break L0;
                  } else {
                    var4 = "jagex_" + param0 + "_preferences" + param1 + "_wip.dat";
                    break L0;
                  }
                }
              }
              var5 = new String[]{"c:/rscache/", "/rscache/", field_i, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
              var6 = 0;
              L1: while (true) {
                if (var5.length > var6) {
                  L2: {
                    var7 = var5[var6];
                    if (var7.length() <= 0) {
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
                      var8 = new bg(new File(var7, var4), "rw", 10000L);
                      stackIn_15_0 = (bg) (var8);
                      decompiledRegionSelector0 = 0;
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L4: {
                      var8_ref = (Exception) (Object) decompiledCaughtException;
                      var6++;
                      decompiledRegionSelector0 = 1;
                      break L4;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    return stackIn_15_0;
                  } else {
                    continue L1;
                  }
                } else {
                  return null;
                }
              }
            } else {
              return (bg) null;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final af a(String param0, int param1, Class param2) {
        af discarded$0 = null;
        if (param1 != 9) {
            Object var5 = (Object) null;
            discarded$0 = this.a(-70, -27, -21, 108, (Object) null);
        }
        return this.a(0, 0, 9, -15563, new Object[]{param2, param0});
    }

    final af a(int param0, int param1, String param2) {
        if (param0 != 0) {
            return (af) null;
        }
        return this.a(param2, 85, param1, false);
    }

    ib(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception exception = null;
        Throwable throwable = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        cl var7 = null;
        L0: {
          this.field_h = null;
          this.field_l = false;
          this.field_f = false;
          this.field_a = null;
          this.field_u = null;
          this.field_k = null;
          this.field_o = null;
          this.field_q = false;
          field_j = "1.1";
          field_p = "Unknown";
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
        ((ib) (this)).field_f = stackIn_3_1 != 0;
        field_b = param0;
        field_n = param1;
        try {
          L1: {
            field_p = System.getProperty("java.vendor");
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
          if (0 == (field_p.toLowerCase().indexOf("microsoft") ^ -1)) {
            break L3;
          } else {
            this.field_l = true;
            break L3;
          }
        }
        try {
          L4: {
            field_v = System.getProperty("os.name");
            break L4;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            exception = (Exception) (Object) decompiledCaughtException;
            field_v = "Unknown";
            break L5;
          }
        }
        field_s = field_v.toLowerCase();
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
          if (null == field_i) {
            field_i = "~/";
            break L13;
          } else {
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
          if (!this.field_l) {
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
                field_c = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
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
          me.a(field_n, field_b, -38);
          if (!this.field_f) {
            break L21;
          } else {
            this.field_a = new bg(me.a(field_b, "random.dat", false, (String) null), "rw", 25L);
            this.field_u = new bg(me.a("main_file_cache.dat2", 95), "rw", 314572800L);
            this.field_h = new bg(me.a("main_file_cache.idx255", 126), "rw", 1048576L);
            this.field_g = new bg[param2];
            var5_int = 0;
            L22: while (true) {
              if (param2 <= var5_int) {
                L23: {
                  if (this.field_l) {
                    try {
                      L24: {
                        Class.forName("df").newInstance();
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
                      if (!this.field_l) {
                        this.field_e = Class.forName("rj").newInstance();
                        break L27;
                      } else {
                        var7 = new cl();
                        this.field_x = var7;
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
                      if (!this.field_l) {
                        this.field_d = Class.forName("jl").newInstance();
                        break L30;
                      } else {
                        this.field_m = new sc();
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
                this.field_g[var5_int] = new bg(me.a("main_file_cache.idx" + var5_int, 37), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        this.field_q = false;
        this.field_r = new Thread((Runnable) (this));
        this.field_r.setPriority(10);
        this.field_r.setDaemon(true);
        this.field_r.start();
    }

    final af a(byte param0, int param1, Runnable param2) {
        if (param0 != -28) {
            field_s = (String) null;
        }
        return this.a(0, param1, 2, -15563, param2);
    }

    static {
        field_w = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
