/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class le implements Runnable {
    private static String field_s;
    private gb field_f;
    wk field_d;
    java.awt.EventQueue field_e;
    private boolean field_q;
    static String field_m;
    private l field_i;
    wk field_t;
    wk field_x;
    static String field_v;
    private Thread field_j;
    static java.lang.reflect.Method field_g;
    private static int field_u;
    boolean field_b;
    wk[] field_o;
    private static String field_r;
    private vi field_c;
    private static String field_a;
    static String field_w;
    private boolean field_n;
    private Object field_l;
    private static volatile long field_k;
    private Object field_h;
    private vi field_p;

    final vi a(java.net.URL param0, boolean param1) {
        if (!param1) {
            this.field_d = (wk) null;
        }
        return this.a(4, 0, 0, 13003, param0);
    }

    final boolean b(byte param0) {
        if (!this.field_b) {
            return false;
        }
        if (param0 >= -115) {
            java.awt.Frame var3 = (java.awt.Frame) null;
            this.a((byte) 54, (java.awt.Frame) null);
        }
        if (!this.field_q) {
            return null != this.field_l ? true : false;
        }
        return null != this.field_i ? true : false;
    }

    private final static wk a(int param0, int param1, String param2, String param3) {
        try {
            wk stackIn_14_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            String var7 = null;
            wk var8 = null;
            Exception var8_ref = null;
            L0: {
              if ((param1 ^ -1) == -34) {
                var4 = "jagex_" + param3 + "_preferences" + param2 + "_rc.dat";
                break L0;
              } else {
                if (param1 == 34) {
                  var4 = "jagex_" + param3 + "_preferences" + param2 + "_wip.dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param3 + "_preferences" + param2 + ".dat";
                  break L0;
                }
              }
            }
            var5 = new String[]{"c:/rscache/", "/rscache/", field_s, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            if (param0 <= -61) {
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
                      var8 = new wk(new File(var7, var4), "rw", 10000L);
                      stackIn_14_0 = (wk) (var8);
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
                    return stackIn_14_0;
                  } else {
                    continue L1;
                  }
                } else {
                  return null;
                }
              }
            } else {
              return (wk) null;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final vi a(int param0, int param1, int param2, int param3, Object param4) {
        vi var6 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        L0: {
          if (param3 == 13003) {
            break L0;
          } else {
            this.field_o = (wk[]) null;
            break L0;
          }
        }
        var6 = new vi();
        var6.field_c = param0;
        var6.field_g = param4;
        var6.field_d = param2;
        var6.field_b = param1;
        var7 = this;
        synchronized (var7) {
          L1: {
            L2: {
              if (null == this.field_c) {
                this.field_p = var6;
                this.field_c = var6;
                break L2;
              } else {
                this.field_c.field_f = var6;
                this.field_c = var6;
                break L2;
              }
            }
            this.notify();
            break L1;
          }
        }
        return var6;
    }

    final vi a(byte param0) {
        if (param0 != 104) {
            return (vi) null;
        }
        return this.a(5, 0, 0, 13003, (Object) null);
    }

    final vi a(int param0, int param1, Runnable param2) {
        if (param0 != 0) {
            this.run();
        }
        return this.a(2, 0, param1, 13003, param2);
    }

    final vi a(Class param0, String param1, int param2) {
        if (param2 <= 58) {
            java.net.URL var5 = (java.net.URL) null;
            this.a((java.net.URL) null, true);
        }
        return this.a(9, 0, 0, 13003, new Object[]{param0, param1});
    }

    final vi a(byte param0, java.awt.Frame param1) {
        if (param0 >= -9) {
            return (vi) null;
        }
        return this.a(7, 0, 0, 13003, param1);
    }

    final void a(int param0) {
        try {
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Object var2 = null;
            InterruptedException var2_ref = null;
            IOException var2_ref2 = null;
            int var2_int = 0;
            IOException var3 = null;
            var2 = this;
            synchronized (var2) {
              L0: {
                this.field_n = true;
                this.notifyAll();
                break L0;
              }
            }
            try {
              L1: {
                if (param0 == 0) {
                  this.field_j.join();
                  decompiledRegionSelector0 = 1;
                  break L1;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L1;
                }
              }
            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var2_ref = (InterruptedException) (Object) decompiledCaughtException;
                decompiledRegionSelector0 = 1;
                break L2;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              L3: {
                if (null != this.field_t) {
                  try {
                    L4: {
                      this.field_t.a((byte) 42);
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
                if (this.field_d == null) {
                  break L6;
                } else {
                  try {
                    L7: {
                      this.field_d.a((byte) 79);
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
                if (null != this.field_o) {
                  var2_int = 0;
                  L10: while (true) {
                    if (this.field_o.length <= var2_int) {
                      break L9;
                    } else {
                      if (this.field_o[var2_int] != null) {
                        try {
                          L11: {
                            this.field_o[var2_int].a((byte) 39);
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
                if (null == this.field_x) {
                  break L13;
                } else {
                  try {
                    L14: {
                      this.field_x.a((byte) 14);
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
                }
              }
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final vi a(byte param0, Class param1, String param2, Class[] param3) {
        if (param0 != 99) {
            this.field_t = (wk) null;
        }
        return this.a(8, 0, 0, 13003, new Object[]{param1, param2, param3});
    }

    final vi a(int param0, int param1, int param2, byte param3, int param4) {
        if (param3 != -30) {
            return (vi) null;
        }
        return this.a(6, (param0 << 1230207248) + param2, param1 + (param4 << -515191568), 13003, (Object) null);
    }

    public final void run() {
        try {
            int stackIn_77_0 = 0;
            Throwable decompiledCaughtException = null;
            Object var2 = null;
            int var2_int = 0;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            InterruptedException var3_ref_InterruptedException = null;
            int var3 = 0;
            Exception var3_ref_Exception = null;
            wk var3_ref_wk = null;
            vc var3_ref_vc = null;
            int var4 = 0;
            String var4_ref_String = null;
            int var5 = 0;
            java.awt.datatransfer.Transferable var7 = null;
            vi var8 = null;
            Thread var9 = null;
            java.awt.datatransfer.Clipboard var10 = null;
            java.awt.datatransfer.Clipboard var11 = null;
            Object[] var12 = null;
            String var13 = null;
            java.awt.Component var14 = null;
            java.awt.Frame var15 = null;
            String var16 = null;
            Object[] var17 = null;
            Object[] var18 = null;
            L0: while (true) {
              var2 = this;
              synchronized (var2) {
                L1: {
                  L2: while (true) {
                    if (this.field_n) {
                      return;
                    } else {
                      if (null == this.field_p) {
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
                          var8 = this.field_p;
                          this.field_p = this.field_p.field_f;
                          if (this.field_p != null) {
                            break L5;
                          } else {
                            this.field_c = null;
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
                    var2_int = var8.field_c;
                    if ((var2_int ^ -1) == -2) {
                      if ((id.a(22) ^ -1L) > (field_k ^ -1L)) {
                        throw new IOException();
                      } else {
                        var8.field_e = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.field_g)), var8.field_d);
                        break L7;
                      }
                    } else {
                      if (22 != var2_int) {
                        if (-3 != (var2_int ^ -1)) {
                          if (var2_int == 4) {
                            if ((id.a(58) ^ -1L) > (field_k ^ -1L)) {
                              throw new IOException();
                            } else {
                              var8.field_e = new DataInputStream(((java.net.URL) (var8.field_g)).openStream());
                              break L7;
                            }
                          } else {
                            if (-9 == (var2_int ^ -1)) {
                              L8: {
                                var18 = (Object[]) (var8.field_g);
                                if (!this.field_b) {
                                  break L8;
                                } else {
                                  if (null != ((Class) (var18[0])).getClassLoader()) {
                                    break L8;
                                  } else {
                                    throw new SecurityException();
                                  }
                                }
                              }
                              var8.field_e = ((Class) (var18[0])).getDeclaredMethod((String) (var18[1]), (Class[]) (var18[2]));
                              break L7;
                            } else {
                              if (var2_int == 9) {
                                L9: {
                                  var17 = (Object[]) (var8.field_g);
                                  if (!this.field_b) {
                                    break L9;
                                  } else {
                                    if (((Class) (var17[0])).getClassLoader() == null) {
                                      throw new SecurityException();
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                var8.field_e = ((Class) (var17[0])).getDeclaredField((String) (var17[1]));
                                break L7;
                              } else {
                                if (-19 != (var2_int ^ -1)) {
                                  if (var2_int != 19) {
                                    if (!this.field_b) {
                                      throw le.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    } else {
                                      if (-4 == (var2_int ^ -1)) {
                                        if ((id.a(23) ^ -1L) > (field_k ^ -1L)) {
                                          throw new IOException();
                                        } else {
                                          var16 = (255 & var8.field_d >> 268944440) + "." + ((var8.field_d & 16776207) >> -1105248112) + "." + (255 & var8.field_d >> 1233793992) + "." + (255 & var8.field_d);
                                          var8.field_e = java.net.InetAddress.getByName(var16).getHostName();
                                          break L7;
                                        }
                                      } else {
                                        if ((var2_int ^ -1) != -22) {
                                          if (-6 == (var2_int ^ -1)) {
                                            if (!this.field_q) {
                                              var8.field_e = Class.forName("ka").getMethod("listmodes", new Class[]{}).invoke(this.field_l, new Object[]{});
                                              break L7;
                                            } else {
                                              var8.field_e = this.field_i.a(0);
                                              break L7;
                                            }
                                          } else {
                                            if (var2_int == 6) {
                                              var15 = new java.awt.Frame("Jagex Full Screen");
                                              var8.field_e = var15;
                                              var15.setResizable(false);
                                              if (this.field_q) {
                                                this.field_i.a(119, var8.field_d & 65535, var8.field_d >>> 343492560, var8.field_b >> -1968731152, 65535 & var8.field_b, var15);
                                                break L7;
                                              } else {
                                                Class.forName("ka").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_l, new Object[]{var15, new Integer(var8.field_d >>> -1268506160), new Integer(65535 & var8.field_d), new Integer(var8.field_b >> -1677926000), new Integer(var8.field_b & 65535)});
                                                break L7;
                                              }
                                            } else {
                                              if (var2_int != 7) {
                                                if ((var2_int ^ -1) != -13) {
                                                  if (-14 != (var2_int ^ -1)) {
                                                    L10: {
                                                      if (!this.field_b) {
                                                        break L10;
                                                      } else {
                                                        if (14 == var2_int) {
                                                          var3 = var8.field_d;
                                                          var4 = var8.field_b;
                                                          if (!this.field_q) {
                                                            Class.forName("ob").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_h, new Object[]{new Integer(var3), new Integer(var4)});
                                                            break L7;
                                                          } else {
                                                            this.field_f.a(var3, var4, 32512);
                                                            break L7;
                                                          }
                                                        } else {
                                                          break L10;
                                                        }
                                                      }
                                                    }
                                                    L11: {
                                                      if (!this.field_b) {
                                                        break L11;
                                                      } else {
                                                        if (-16 == (var2_int ^ -1)) {
                                                          L12: {
                                                            if (-1 == (var8.field_d ^ -1)) {
                                                              stackIn_77_0 = 0;
                                                              break L12;
                                                            } else {
                                                              stackIn_77_0 = 1;
                                                              break L12;
                                                            }
                                                          }
                                                          var3 = stackIn_77_0;
                                                          var14 = (java.awt.Component) (var8.field_g);
                                                          if (this.field_q) {
                                                            this.field_f.a(var3 != 0, var14, -4);
                                                            break L7;
                                                          } else {
                                                            Class.forName("ob").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_h, new Object[]{var14, new Boolean(var3 != 0)});
                                                            break L7;
                                                          }
                                                        } else {
                                                          break L11;
                                                        }
                                                      }
                                                    }
                                                    L13: {
                                                      if (this.field_q) {
                                                        break L13;
                                                      } else {
                                                        if (var2_int != 17) {
                                                          break L13;
                                                        } else {
                                                          var12 = (Object[]) (var8.field_g);
                                                          Class.forName("ob").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_h, new Object[]{var12[0], var12[1], new Integer(var8.field_d), new Integer(var8.field_b), var12[2]});
                                                          break L7;
                                                        }
                                                      }
                                                    }
                                                    if (var2_int != 16) {
                                                      throw le.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    } else {
                                                      try {
                                                        L14: {
                                                          if (!field_m.startsWith("win")) {
                                                            throw le.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          } else {
                                                            L15: {
                                                              var13 = (String) (var8.field_g);
                                                              if (var13.startsWith("http://")) {
                                                                break L15;
                                                              } else {
                                                                if (!var13.startsWith("https://")) {
                                                                  throw le.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  break L15;
                                                                }
                                                              }
                                                            }
                                                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L16: while (true) {
                                                              if (var5 >= var13.length()) {
                                                                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var13 + "\"");
                                                                var8.field_e = null;
                                                                break L14;
                                                              } else {
                                                                if (-1 != var4_ref_String.indexOf((int) var13.charAt(var5))) {
                                                                  var5++;
                                                                  continue L16;
                                                                } else {
                                                                  throw le.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter1) {
                                                        decompiledCaughtException = decompiledCaughtParameter1;
                                                        var3_ref_Exception = (Exception) (Object) decompiledCaughtException;
                                                        var8.field_e = var3_ref_Exception;
                                                        throw le.<RuntimeException>$cfr$sneakyThrow(var3_ref_Exception);
                                                      }
                                                      break L7;
                                                    }
                                                  } else {
                                                    var3_ref_wk = le.a(-120, field_u, (String) (var8.field_g), "");
                                                    var8.field_e = var3_ref_wk;
                                                    break L7;
                                                  }
                                                } else {
                                                  var3_ref_wk = le.a(-120, field_u, (String) (var8.field_g), field_a);
                                                  var8.field_e = var3_ref_wk;
                                                  break L7;
                                                }
                                              } else {
                                                if (this.field_q) {
                                                  this.field_i.a((java.awt.Frame) (var8.field_g), -104);
                                                  break L7;
                                                } else {
                                                  Class.forName("ka").getMethod("exit", new Class[]{}).invoke(this.field_l, new Object[]{});
                                                  break L7;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          if (id.a(123) >= field_k) {
                                            var8.field_e = java.net.InetAddress.getByName((String) (var8.field_g)).getAddress();
                                            break L7;
                                          } else {
                                            throw new IOException();
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    var7 = (java.awt.datatransfer.Transferable) (var8.field_g);
                                    var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var11.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L7;
                                  }
                                } else {
                                  var10 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8.field_e = var10.getContents((Object) null);
                                  break L7;
                                }
                              }
                            }
                          }
                        } else {
                          var9 = new Thread((Runnable) (var8.field_g));
                          var9.setDaemon(true);
                          var9.start();
                          var9.setPriority(var8.field_d);
                          var8.field_e = var9;
                          break L7;
                        }
                      } else {
                        if ((field_k ^ -1L) < (id.a(98) ^ -1L)) {
                          throw new IOException();
                        } else {
                          try {
                              if (false) throw (vc) null;
                            L17: {
                              var8.field_e = nc.a((String) (var8.field_g), (byte) 40, var8.field_d).a(-26042);
                              break L17;
                            }
                          } catch (vc decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref_vc = (vc) (Object) decompiledCaughtException;
                            var8.field_e = var3_ref_vc.getMessage();
                            throw var3_ref_vc;
                          }
                          break L7;
                        }
                      }
                    }
                  }
                  var8.field_a = 1;
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
                  var8.field_a = 2;
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

    final vi a(String param0, byte param1, int param2) {
        if (param1 >= -19) {
            this.a((byte) -67);
        }
        return this.a(param0, false, param2, (byte) 127);
    }

    private final vi a(String param0, boolean param1, int param2, byte param3) {
        if (param3 <= 126) {
            this.field_e = (java.awt.EventQueue) null;
        }
        return this.a(param1 ? 22 : 1, 0, param2, 13003, param0);
    }

    le(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception exception = null;
        Throwable throwable = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        l var6 = null;
        L0: {
          this.field_t = null;
          this.field_b = false;
          this.field_d = null;
          this.field_x = null;
          this.field_q = false;
          this.field_n = false;
          this.field_c = null;
          this.field_p = null;
          field_v = "Unknown";
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
        ((le) (this)).field_b = stackIn_3_1 != 0;
        field_u = param0;
        field_w = "1.1";
        field_a = param1;
        try {
          L1: {
            field_v = System.getProperty("java.vendor");
            field_w = System.getProperty("java.version");
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
          if ((field_v.toLowerCase().indexOf("microsoft") ^ -1) != 0) {
            this.field_q = true;
            break L3;
          } else {
            break L3;
          }
        }
        try {
          L4: {
            field_r = System.getProperty("os.name");
            break L4;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            exception = (Exception) (Object) decompiledCaughtException;
            field_r = "Unknown";
            break L5;
          }
        }
        field_m = field_r.toLowerCase();
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
              field_s = System.getProperty("user.home");
              if (field_s == null) {
                break L11;
              } else {
                field_s = field_s + "/";
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
          if (null != field_s) {
            break L13;
          } else {
            field_s = "~/";
            break L13;
          }
        }
        try {
          L14: {
            this.field_e = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
          if (!this.field_q) {
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
                field_g = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
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
          dk.a(field_a, field_u, (byte) 86);
          if (!this.field_b) {
            break L21;
          } else {
            this.field_x = new wk(dk.a((String) null, field_u, (byte) 123, "random.dat"), "rw", 25L);
            this.field_t = new wk(dk.a(false, "main_file_cache.dat2"), "rw", 314572800L);
            this.field_d = new wk(dk.a(false, "main_file_cache.idx255"), "rw", 1048576L);
            this.field_o = new wk[param2];
            var5_int = 0;
            L22: while (true) {
              if (param2 <= var5_int) {
                L23: {
                  if (!this.field_q) {
                    break L23;
                  } else {
                    try {
                      L24: {
                        Class.forName("oi").newInstance();
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
                      if (this.field_q) {
                        var6 = new l();
                        this.field_i = var6;
                        break L27;
                      } else {
                        this.field_l = Class.forName("ka").newInstance();
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
                      if (this.field_q) {
                        this.field_f = new gb();
                        break L30;
                      } else {
                        this.field_h = Class.forName("ob").newInstance();
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
                this.field_o[var5_int] = new wk(dk.a(false, "main_file_cache.idx" + var5_int), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        this.field_n = false;
        this.field_j = new Thread((Runnable) (this));
        this.field_j.setPriority(10);
        this.field_j.setDaemon(true);
        this.field_j.start();
    }

    static {
        field_k = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
