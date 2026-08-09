/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jj implements Runnable {
    java.awt.EventQueue field_j;
    private static int field_f;
    private fl field_w;
    boolean field_p;
    static String field_m;
    private wk field_b;
    private Object field_c;
    private boolean field_u;
    bj field_k;
    private wk field_s;
    private static volatile long field_l;
    private static String field_t;
    static String field_v;
    private boolean field_q;
    private Object field_g;
    private a field_i;
    bj[] field_n;
    static java.lang.reflect.Method field_e;
    static String field_d;
    bj field_o;
    private Thread field_a;
    private static String field_x;
    bj field_r;
    private static String field_h;

    private final static bj a(int param0, int param1, String param2, String param3) {
        try {
            bj stackIn_13_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            String var7 = null;
            bj var8 = null;
            Exception var8_ref = null;
            L0: {
              if ((param1 ^ -1) != -34) {
                if (34 != param1) {
                  var4 = "jagex_" + param2 + "_preferences" + param3 + ".dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param2 + "_preferences" + param3 + "_wip.dat";
                  break L0;
                }
              } else {
                var4 = "jagex_" + param2 + "_preferences" + param3 + "_rc.dat";
                break L0;
              }
            }
            var5 = new String[]{"c:/rscache/", "/rscache/", field_t, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            var6 = param0;
            L1: while (true) {
              if (var6 < var5.length) {
                L2: {
                  var7 = var5[var6];
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
                    var8 = new bj(new File(var7, var4), "rw", 10000L);
                    stackIn_13_0 = (bj) (var8);
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
                  return stackIn_13_0;
                } else {
                  continue L1;
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

    final wk b(int param0) {
        if (param0 > -105) {
            this.field_c = (Object) null;
        }
        return this.a(0, (Object) null, 0, 5, 0);
    }

    private final wk a(int param0, Object param1, int param2, int param3, int param4) {
        wk var6 = null;
        String var9 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        L0: {
          if (param4 == 0) {
            break L0;
          } else {
            var9 = (String) null;
            this.a(-30, (Class) null, (String) null);
            break L0;
          }
        }
        var6 = new wk();
        var6.field_a = param3;
        var6.field_f = param1;
        var6.field_c = param2;
        var6.field_g = param0;
        var7 = this;
        synchronized (var7) {
          L1: {
            L2: {
              if (this.field_b == null) {
                this.field_s = var6;
                this.field_b = var6;
                break L2;
              } else {
                this.field_b.field_e = var6;
                this.field_b = var6;
                break L2;
              }
            }
            this.notify();
            break L1;
          }
        }
        return var6;
    }

    final wk a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 != 1636602704) {
            Runnable var7 = (Runnable) null;
            this.a(-115, (Runnable) null, -90);
        }
        return this.a((param1 << 1636602704) - -param0, (Object) null, (param3 << 1667790544) + param2, 6, 0);
    }

    final wk a(int param0, Class param1, String param2) {
        if (param0 > -50) {
            this.run();
        }
        return this.a(0, new Object[]{param1, param2}, 0, 9, 0);
    }

    private final wk a(boolean param0, String param1, int param2, int param3) {
        if (param2 != 1) {
            return (wk) null;
        }
        return this.a(param3, param1, 0, param0 ? 22 : 1, 0);
    }

    final wk a(boolean param0, java.awt.Frame param1) {
        if (param0) {
            return (wk) null;
        }
        return this.a(0, param1, 0, 7, 0);
    }

    final wk a(int param0, Runnable param1, int param2) {
        if (param2 != 0) {
            return (wk) null;
        }
        return this.a(param0, param1, 0, 2, 0);
    }

    final wk a(Class[] param0, int param1, Class param2, String param3) {
        if (param1 < 29) {
            this.a(38);
        }
        return this.a(0, new Object[]{param2, param3, param0}, 0, 8, 0);
    }

    final wk a(int param0, int param1, String param2) {
        if (param0 >= -79) {
            field_f = -84;
        }
        return this.a(false, param2, 1, param1);
    }

    final boolean a(int param0) {
        if (param0 >= -118) {
            this.field_n = (bj[]) null;
        }
        if (!this.field_p) {
            return false;
        }
        if (this.field_u) {
            return this.field_i != null ? true : false;
        }
        return null != this.field_c ? true : false;
    }

    final wk a(int param0, java.net.URL param1) {
        int var3 = -127 % ((48 - param0) / 60);
        return this.a(0, param1, 0, 4, 0);
    }

    public final void run() {
        try {
            int stackIn_57_0 = 0;
            Throwable decompiledCaughtException = null;
            Object var2 = null;
            int var2_int = 0;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            InterruptedException var3 = null;
            int var3_int = 0;
            Exception var3_ref = null;
            bj var3_ref2 = null;
            rg var3_ref3 = null;
            int var4_int = 0;
            String var4 = null;
            int var5 = 0;
            java.awt.datatransfer.Transferable var7 = null;
            wk var8 = null;
            Thread var9 = null;
            java.awt.datatransfer.Clipboard var10 = null;
            java.awt.Component var11 = null;
            Object[] var12 = null;
            String var13 = null;
            java.awt.Frame var14 = null;
            String var15 = null;
            java.awt.datatransfer.Clipboard var16 = null;
            Object[] var17 = null;
            Object[] var18 = null;
            L0: while (true) {
              var2 = this;
              synchronized (var2) {
                L1: {
                  L2: while (true) {
                    if (this.field_q) {
                      return;
                    } else {
                      if (null == this.field_s) {
                        try {
                          L3: {
                            this.wait();
                            break L3;
                          }
                        } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          L4: {
                            var3 = (InterruptedException) (Object) decompiledCaughtException;
                            break L4;
                          }
                        }
                        continue L2;
                      } else {
                        L5: {
                          var8 = this.field_s;
                          this.field_s = this.field_s.field_e;
                          if (null == this.field_s) {
                            this.field_b = null;
                            break L5;
                          } else {
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
                      if (field_l > gk.a(126)) {
                        throw new IOException();
                      } else {
                        var8.field_d = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.field_f)), var8.field_g);
                        break L7;
                      }
                    } else {
                      if (-23 != (var2_int ^ -1)) {
                        if ((var2_int ^ -1) != -3) {
                          if (-5 == (var2_int ^ -1)) {
                            if (field_l <= gk.a(52)) {
                              var8.field_d = new DataInputStream(((java.net.URL) (var8.field_f)).openStream());
                              break L7;
                            } else {
                              throw new IOException();
                            }
                          } else {
                            if (var2_int == 8) {
                              L8: {
                                var18 = (Object[]) (var8.field_f);
                                if (!this.field_p) {
                                  break L8;
                                } else {
                                  if (((Class) (var18[0])).getClassLoader() == null) {
                                    throw new SecurityException();
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              var8.field_d = ((Class) (var18[0])).getDeclaredMethod((String) (var18[1]), (Class[]) (var18[2]));
                              break L7;
                            } else {
                              if ((var2_int ^ -1) == -10) {
                                L9: {
                                  var17 = (Object[]) (var8.field_f);
                                  if (this.field_p) {
                                    if (null != ((Class) (var17[0])).getClassLoader()) {
                                      break L9;
                                    } else {
                                      throw new SecurityException();
                                    }
                                  } else {
                                    break L9;
                                  }
                                }
                                var8.field_d = ((Class) (var17[0])).getDeclaredField((String) (var17[1]));
                                break L7;
                              } else {
                                if (var2_int == 18) {
                                  var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8.field_d = var16.getContents((Object) null);
                                  break L7;
                                } else {
                                  if (19 != var2_int) {
                                    if (!this.field_p) {
                                      throw jj.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    } else {
                                      if (3 == var2_int) {
                                        if (field_l <= gk.a(115)) {
                                          var15 = (var8.field_g >> -2068135208 & 255) + "." + ((16726532 & var8.field_g) >> -1798626576) + "." + (var8.field_g >> 1267688776 & 255) + "." + (var8.field_g & 255);
                                          var8.field_d = java.net.InetAddress.getByName(var15).getHostName();
                                          break L7;
                                        } else {
                                          throw new IOException();
                                        }
                                      } else {
                                        if ((var2_int ^ -1) != -22) {
                                          if (var2_int == 5) {
                                            if (!this.field_u) {
                                              var8.field_d = Class.forName("pa").getMethod("listmodes", new Class[]{}).invoke(this.field_c, new Object[]{});
                                              break L7;
                                            } else {
                                              var8.field_d = this.field_i.a((byte) -99);
                                              break L7;
                                            }
                                          } else {
                                            if ((var2_int ^ -1) == -7) {
                                              var14 = new java.awt.Frame("Jagex Full Screen");
                                              var8.field_d = var14;
                                              var14.setResizable(false);
                                              if (!this.field_u) {
                                                Class.forName("pa").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_c, new Object[]{var14, new Integer(var8.field_g >>> 2087415536), new Integer(var8.field_g & 65535), new Integer(var8.field_c >> -776182576), new Integer(var8.field_c & 65535)});
                                                break L7;
                                              } else {
                                                this.field_i.a(var8.field_g >>> 1238158800, var8.field_c & 65535, (byte) -70, var8.field_c >> -496884304, 65535 & var8.field_g, var14);
                                                break L7;
                                              }
                                            } else {
                                              if (var2_int != 7) {
                                                if ((var2_int ^ -1) != -13) {
                                                  if (13 != var2_int) {
                                                    L10: {
                                                      if (!this.field_p) {
                                                        break L10;
                                                      } else {
                                                        if ((var2_int ^ -1) != -15) {
                                                          break L10;
                                                        } else {
                                                          var3_int = var8.field_g;
                                                          var4_int = var8.field_c;
                                                          if (!this.field_u) {
                                                            Class.forName("pj").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_g, new Object[]{new Integer(var3_int), new Integer(var4_int)});
                                                            break L7;
                                                          } else {
                                                            this.field_w.a(var3_int, (byte) 76, var4_int);
                                                            break L7;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L11: {
                                                      if (!this.field_p) {
                                                        break L11;
                                                      } else {
                                                        if ((var2_int ^ -1) != -16) {
                                                          break L11;
                                                        } else {
                                                          L12: {
                                                            if (var8.field_g == 0) {
                                                              stackIn_57_0 = 0;
                                                              break L12;
                                                            } else {
                                                              stackIn_57_0 = 1;
                                                              break L12;
                                                            }
                                                          }
                                                          var3_int = stackIn_57_0;
                                                          var11 = (java.awt.Component) (var8.field_f);
                                                          if (this.field_u) {
                                                            this.field_w.a(11333, var11, var3_int != 0);
                                                            break L7;
                                                          } else {
                                                            Class.forName("pj").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_g, new Object[]{var11, new Boolean(var3_int != 0)});
                                                            break L7;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L13: {
                                                      if (this.field_u) {
                                                        break L13;
                                                      } else {
                                                        if (var2_int != 17) {
                                                          break L13;
                                                        } else {
                                                          var12 = (Object[]) (var8.field_f);
                                                          Class.forName("pj").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_g, new Object[]{var12[0], var12[1], new Integer(var8.field_g), new Integer(var8.field_c), var12[2]});
                                                          break L7;
                                                        }
                                                      }
                                                    }
                                                    if (var2_int != 16) {
                                                      throw jj.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    } else {
                                                      try {
                                                          if (false) throw (rg) null;
                                                        L14: {
                                                          if (!field_v.startsWith("win")) {
                                                            throw jj.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          } else {
                                                            L15: {
                                                              var13 = (String) (var8.field_f);
                                                              if (var13.startsWith("http://")) {
                                                                break L15;
                                                              } else {
                                                                if (var13.startsWith("https://")) {
                                                                  break L15;
                                                                } else {
                                                                  throw jj.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                            var4 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L16: while (true) {
                                                              if (var13.length() <= var5) {
                                                                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var13 + "\"");
                                                                var8.field_d = null;
                                                                break L14;
                                                              } else {
                                                                if (0 == (var4.indexOf((int) var13.charAt(var5)) ^ -1)) {
                                                                  throw jj.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  var5++;
                                                                  continue L16;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter1) {
                                                        decompiledCaughtException = decompiledCaughtParameter1;
                                                        var3_ref = (Exception) (Object) decompiledCaughtException;
                                                        var8.field_d = var3_ref;
                                                        throw jj.<RuntimeException>$cfr$sneakyThrow(var3_ref);
                                                      }
                                                      break L7;
                                                    }
                                                  } else {
                                                    var3_ref2 = jj.a(0, field_f, "", (String) (var8.field_f));
                                                    var8.field_d = var3_ref2;
                                                    break L7;
                                                  }
                                                } else {
                                                  var3_ref2 = jj.a(0, field_f, field_h, (String) (var8.field_f));
                                                  var8.field_d = var3_ref2;
                                                  break L7;
                                                }
                                              } else {
                                                if (this.field_u) {
                                                  this.field_i.a((java.awt.Frame) (var8.field_f), 0);
                                                  break L7;
                                                } else {
                                                  Class.forName("pa").getMethod("exit", new Class[]{}).invoke(this.field_c, new Object[]{});
                                                  break L7;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          if ((field_l ^ -1L) >= (gk.a(101) ^ -1L)) {
                                            var8.field_d = java.net.InetAddress.getByName((String) (var8.field_f)).getAddress();
                                            break L7;
                                          } else {
                                            throw new IOException();
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    var7 = (java.awt.datatransfer.Transferable) (var8.field_f);
                                    var10 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var10.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L7;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var9 = new Thread((Runnable) (var8.field_f));
                          var9.setDaemon(true);
                          var9.start();
                          var9.setPriority(var8.field_g);
                          var8.field_d = var9;
                          break L7;
                        }
                      } else {
                        if (field_l <= gk.a(61)) {
                          try {
                              if (false) throw (rg) null;
                            L17: {
                              var8.field_d = wp.a((String) (var8.field_f), (byte) -109, var8.field_g).b(640);
                              break L17;
                            }
                          } catch (rg decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref3 = (rg) (Object) decompiledCaughtException;
                            var8.field_d = var3_ref3.getMessage();
                            throw var3_ref3;
                          }
                          break L7;
                        } else {
                          throw new IOException();
                        }
                      }
                    }
                  }
                  var8.field_b = 1;
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
                  var8.field_b = 2;
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

    final void a(boolean param0) {
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
                this.field_q = true;
                this.notifyAll();
                break L0;
              }
            }
            try {
              L1: {
                if (!param0) {
                  this.field_a.join();
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
                if (null != this.field_o) {
                  try {
                    L4: {
                      this.field_o.a(0);
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
                if (null == this.field_r) {
                  break L6;
                } else {
                  try {
                    L7: {
                      this.field_r.a(0);
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
                if (this.field_n == null) {
                  break L9;
                } else {
                  var2_int = 0;
                  L10: while (true) {
                    if (var2_int >= this.field_n.length) {
                      break L9;
                    } else {
                      if (null != this.field_n[var2_int]) {
                        try {
                          L11: {
                            this.field_n[var2_int].a(0);
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
                if (null != this.field_k) {
                  try {
                    L14: {
                      this.field_k.a(0);
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
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    jj(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception exception = null;
        Throwable throwable = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        a var7 = null;
        L0: {
          this.field_p = false;
          this.field_s = null;
          this.field_b = null;
          this.field_q = false;
          this.field_k = null;
          this.field_o = null;
          this.field_u = false;
          this.field_r = null;
          field_f = param0;
          field_h = param1;
          field_m = "Unknown";
          field_d = "1.1";
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
        ((jj) (this)).field_p = stackIn_3_1 != 0;
        try {
          L1: {
            field_m = System.getProperty("java.vendor");
            field_d = System.getProperty("java.version");
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
          if (field_m.toLowerCase().indexOf("microsoft") == -1) {
            break L3;
          } else {
            this.field_u = true;
            break L3;
          }
        }
        try {
          L4: {
            field_x = System.getProperty("os.name");
            break L4;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            exception = (Exception) (Object) decompiledCaughtException;
            field_x = "Unknown";
            break L5;
          }
        }
        field_v = field_x.toLowerCase();
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
              field_t = System.getProperty("user.home");
              if (field_t == null) {
                break L11;
              } else {
                field_t = field_t + "/";
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
          if (null == field_t) {
            field_t = "~/";
            break L13;
          } else {
            break L13;
          }
        }
        try {
          L14: {
            this.field_j = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
          if (!this.field_u) {
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
                field_e = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
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
          gq.a((byte) -110, field_h, field_f);
          if (!this.field_p) {
            break L21;
          } else {
            this.field_k = new bj(gq.a(0, field_f, "random.dat", (String) null), "rw", 25L);
            this.field_o = new bj(gq.a("main_file_cache.dat2", -122), "rw", 314572800L);
            this.field_r = new bj(gq.a("main_file_cache.idx255", -121), "rw", 1048576L);
            this.field_n = new bj[param2];
            var5_int = 0;
            L22: while (true) {
              if (param2 <= var5_int) {
                L23: {
                  if (this.field_u) {
                    try {
                      L24: {
                        Class.forName("hf").newInstance();
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
                      if (this.field_u) {
                        var7 = new a();
                        this.field_i = var7;
                        break L27;
                      } else {
                        this.field_c = Class.forName("pa").newInstance();
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
                      if (this.field_u) {
                        this.field_w = new fl();
                        break L30;
                      } else {
                        this.field_g = Class.forName("pj").newInstance();
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
                this.field_n[var5_int] = new bj(gq.a("main_file_cache.idx" + var5_int, -122), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        this.field_q = false;
        this.field_a = new Thread((Runnable) (this));
        this.field_a.setPriority(10);
        this.field_a.setDaemon(true);
        this.field_a.start();
    }

    static {
        field_l = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
