/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fd implements Runnable {
    private boolean field_o;
    ee field_q;
    private sl field_r;
    ee field_l;
    static String field_c;
    ee[] field_v;
    private Object field_p;
    private static volatile long field_x;
    private static String field_m;
    static java.lang.reflect.Method field_i;
    private kk field_s;
    ee field_f;
    boolean field_k;
    private static String field_e;
    private kk field_n;
    private tl field_a;
    static String field_h;
    private static int field_t;
    private static String field_g;
    private boolean field_b;
    private Thread field_w;
    static String field_u;
    private Object field_j;
    java.awt.EventQueue field_d;

    private final kk a(boolean param0, String param1, int param2, int param3) {
        if (param3 != 20691) {
            field_u = (String) null;
        }
        return this.a(!param0 ? 1 : 22, param1, false, 0, param2);
    }

    final kk a(String param0, int param1, int param2) {
        if (param1 <= 47) {
            this.field_o = true;
        }
        return this.a(false, param0, param2, 20691);
    }

    final void a(byte param0) {
        try {
            InterruptedException interruptedException = null;
            IOException iOException = null;
            int var2 = 0;
            Throwable decompiledCaughtException = null;
            Object var2_ref_Object = null;
            IOException var3 = null;
            var2_ref_Object = this;
            synchronized (var2_ref_Object) {
              L0: {
                this.field_o = true;
                this.notifyAll();
                break L0;
              }
            }
            try {
              L1: {
                this.field_w.join();
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
              if (this.field_l == null) {
                break L3;
              } else {
                try {
                  L4: {
                    this.field_l.c(-1);
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
              }
            }
            L6: {
              if (null != this.field_f) {
                try {
                  L7: {
                    this.field_f.c(-1);
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
              if (null == this.field_v) {
                break L9;
              } else {
                var2 = 0;
                L10: while (true) {
                  if (this.field_v.length <= var2) {
                    break L9;
                  } else {
                    if (null != this.field_v[var2]) {
                      try {
                        L11: {
                          this.field_v[var2].c(-1);
                          var2++;
                          break L11;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L12: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          var2++;
                          break L12;
                        }
                      }
                      continue L10;
                    } else {
                      var2++;
                      continue L10;
                    }
                  }
                }
              }
            }
            L13: {
              if (null != this.field_q) {
                try {
                  L14: {
                    this.field_q.c(-1);
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
            var2 = 53 / ((47 - param0) / 41);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final kk a(boolean param0, int param1, int param2, int param3, int param4) {
        if (param0) {
            return (kk) null;
        }
        return this.a(6, (Object) null, param0, param2 + (param4 << -786885712), (param1 << 558717520) + param3);
    }

    final boolean a(boolean param0) {
        if (!param0) {
            return false;
        }
        if (!this.field_k) {
            return false;
        }
        if (!this.field_b) {
            return null != this.field_p ? true : false;
        }
        return null != this.field_r ? true : false;
    }

    final kk a(int param0, java.awt.Frame param1) {
        if (param0 != 7) {
            return (kk) null;
        }
        return this.a(7, param1, false, 0, 0);
    }

    private final static ee a(int param0, String param1, String param2, int param3) {
        try {
            ee stackIn_15_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            String var7 = null;
            ee var8 = null;
            Exception var8_ref = null;
            if (param3 == -7) {
              L0: {
                if ((param0 ^ -1) == -34) {
                  var4 = "jagex_" + param2 + "_preferences" + param1 + "_rc.dat";
                  break L0;
                } else {
                  if ((param0 ^ -1) == -35) {
                    var4 = "jagex_" + param2 + "_preferences" + param1 + "_wip.dat";
                    break L0;
                  } else {
                    var4 = "jagex_" + param2 + "_preferences" + param1 + ".dat";
                    break L0;
                  }
                }
              }
              var5 = new String[]{"c:/rscache/", "/rscache/", field_g, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
              var6 = 0;
              L1: while (true) {
                if (var6 < var5.length) {
                  L2: {
                    var7 = var5[var6];
                    if (-1 <= (var7.length() ^ -1)) {
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
                      var8 = new ee(new File(var7, var4), "rw", 10000L);
                      stackIn_15_0 = (ee) (var8);
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
              return (ee) null;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final kk a(int param0, java.net.URL param1) {
        kk discarded$0 = null;
        if (param0 != 30085) {
            String var4 = (String) null;
            discarded$0 = this.a(true, (String) null, -77, -50);
        }
        return this.a(4, param1, false, 0, 0);
    }

    public final void run() {
        try {
            int stackIn_50_0 = 0;
            Throwable decompiledCaughtException = null;
            Object var2 = null;
            int var2_int = 0;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            InterruptedException var3 = null;
            ab var3_ref = null;
            ee var3_ref2 = null;
            int var3_int = 0;
            Exception var3_ref3 = null;
            int var4_int = 0;
            String var4 = null;
            int var5 = 0;
            java.awt.datatransfer.Transferable var7 = null;
            kk var8 = null;
            Object[] var9 = null;
            java.awt.Component var10 = null;
            String var11 = null;
            Object[] var12 = null;
            java.awt.Frame var13 = null;
            String var14 = null;
            java.awt.datatransfer.Clipboard var15 = null;
            java.awt.datatransfer.Clipboard var16 = null;
            Object[] var17 = null;
            Thread var18 = null;
            L0: while (true) {
              var2 = this;
              synchronized (var2) {
                L1: {
                  L2: while (true) {
                    if (this.field_o) {
                      return;
                    } else {
                      if (null != this.field_s) {
                        L3: {
                          var8 = this.field_s;
                          this.field_s = this.field_s.field_e;
                          if (this.field_s != null) {
                            break L3;
                          } else {
                            this.field_n = null;
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
                    var2_int = var8.field_g;
                    if ((var2_int ^ -1) == -2) {
                      if ((field_x ^ -1L) < (hn.a((byte) 80) ^ -1L)) {
                        throw new IOException();
                      } else {
                        var8.field_c = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.field_a)), var8.field_b);
                        break L7;
                      }
                    } else {
                      if (22 == var2_int) {
                        if ((hn.a((byte) 80) ^ -1L) > (field_x ^ -1L)) {
                          throw new IOException();
                        } else {
                          try {
                              if (false) throw (ab) null;
                            L8: {
                              var8.field_c = qj.a(27, (String) (var8.field_a), var8.field_b).a(31067);
                              break L8;
                            }
                          } catch (ab decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref = (ab) (Object) decompiledCaughtException;
                            var8.field_c = var3_ref.getMessage();
                            throw var3_ref;
                          }
                          break L7;
                        }
                      } else {
                        if (-3 == (var2_int ^ -1)) {
                          var18 = new Thread((Runnable) (var8.field_a));
                          var18.setDaemon(true);
                          var18.start();
                          var18.setPriority(var8.field_b);
                          var8.field_c = var18;
                          break L7;
                        } else {
                          if (4 == var2_int) {
                            if (hn.a((byte) 80) < field_x) {
                              throw new IOException();
                            } else {
                              var8.field_c = new DataInputStream(((java.net.URL) (var8.field_a)).openStream());
                              break L7;
                            }
                          } else {
                            if (8 != var2_int) {
                              if (-10 == (var2_int ^ -1)) {
                                L9: {
                                  var17 = (Object[]) (var8.field_a);
                                  if (this.field_k) {
                                    if (((Class) (var17[0])).getClassLoader() == null) {
                                      throw new SecurityException();
                                    } else {
                                      break L9;
                                    }
                                  } else {
                                    break L9;
                                  }
                                }
                                var8.field_c = ((Class) (var17[0])).getDeclaredField((String) (var17[1]));
                                break L7;
                              } else {
                                if (var2_int == 18) {
                                  var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8.field_c = var16.getContents((Object) null);
                                  break L7;
                                } else {
                                  if (-20 == (var2_int ^ -1)) {
                                    var7 = (java.awt.datatransfer.Transferable) (var8.field_a);
                                    var15 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var15.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L7;
                                  } else {
                                    if (this.field_k) {
                                      if ((var2_int ^ -1) == -4) {
                                        if (hn.a((byte) 80) >= field_x) {
                                          var14 = (255 & var8.field_b >> -98594184) + "." + ((var8.field_b & 16770738) >> -244953584) + "." + ((var8.field_b & 65486) >> -750180536) + "." + (255 & var8.field_b);
                                          var8.field_c = java.net.InetAddress.getByName(var14).getHostName();
                                          break L7;
                                        } else {
                                          throw new IOException();
                                        }
                                      } else {
                                        if (var2_int == 21) {
                                          if (hn.a((byte) 80) < field_x) {
                                            throw new IOException();
                                          } else {
                                            var8.field_c = java.net.InetAddress.getByName((String) (var8.field_a)).getAddress();
                                            break L7;
                                          }
                                        } else {
                                          if (-6 == (var2_int ^ -1)) {
                                            if (!this.field_b) {
                                              var8.field_c = Class.forName("hc").getMethod("listmodes", new Class[]{}).invoke(this.field_p, new Object[]{});
                                              break L7;
                                            } else {
                                              var8.field_c = this.field_r.a((byte) 113);
                                              break L7;
                                            }
                                          } else {
                                            if (-7 == (var2_int ^ -1)) {
                                              var13 = new java.awt.Frame("Jagex Full Screen");
                                              var8.field_c = var13;
                                              var13.setResizable(false);
                                              if (this.field_b) {
                                                this.field_r.a(65535 & var8.field_b, var8.field_b >>> 240395504, -7018, 65535 & var8.field_d, var13, var8.field_d >> 266378672);
                                                break L7;
                                              } else {
                                                Class.forName("hc").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_p, new Object[]{var13, new Integer(var8.field_b >>> 919278768), new Integer(var8.field_b & 65535), new Integer(var8.field_d >> 1050633712), new Integer(65535 & var8.field_d)});
                                                break L7;
                                              }
                                            } else {
                                              if ((var2_int ^ -1) == -8) {
                                                if (this.field_b) {
                                                  this.field_r.a((java.awt.Frame) (var8.field_a), -7738);
                                                  break L7;
                                                } else {
                                                  Class.forName("hc").getMethod("exit", new Class[]{}).invoke(this.field_p, new Object[]{});
                                                  break L7;
                                                }
                                              } else {
                                                if ((var2_int ^ -1) == -13) {
                                                  var3_ref2 = fd.a(field_t, (String) (var8.field_a), field_m, -7);
                                                  var8.field_c = var3_ref2;
                                                  break L7;
                                                } else {
                                                  if (-14 != (var2_int ^ -1)) {
                                                    L10: {
                                                      if (!this.field_k) {
                                                        break L10;
                                                      } else {
                                                        if (14 != var2_int) {
                                                          break L10;
                                                        } else {
                                                          var3_int = var8.field_b;
                                                          var4_int = var8.field_d;
                                                          if (!this.field_b) {
                                                            Class.forName("dm").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_j, new Object[]{new Integer(var3_int), new Integer(var4_int)});
                                                            break L7;
                                                          } else {
                                                            this.field_a.a(var4_int, -93, var3_int);
                                                            break L7;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L11: {
                                                      if (!this.field_k) {
                                                        break L11;
                                                      } else {
                                                        if (15 != var2_int) {
                                                          break L11;
                                                        } else {
                                                          L12: {
                                                            if (var8.field_b == 0) {
                                                              stackIn_50_0 = 0;
                                                              break L12;
                                                            } else {
                                                              stackIn_50_0 = 1;
                                                              break L12;
                                                            }
                                                          }
                                                          var3_int = stackIn_50_0;
                                                          var10 = (java.awt.Component) (var8.field_a);
                                                          if (this.field_b) {
                                                            this.field_a.a(0, var3_int != 0, var10);
                                                            break L7;
                                                          } else {
                                                            Class.forName("dm").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_j, new Object[]{var10, new Boolean(var3_int != 0)});
                                                            break L7;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L13: {
                                                      if (this.field_b) {
                                                        break L13;
                                                      } else {
                                                        if ((var2_int ^ -1) == -18) {
                                                          var12 = (Object[]) (var8.field_a);
                                                          Class.forName("dm").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_j, new Object[]{var12[0], var12[1], new Integer(var8.field_b), new Integer(var8.field_d), var12[2]});
                                                          break L7;
                                                        } else {
                                                          break L13;
                                                        }
                                                      }
                                                    }
                                                    if (var2_int != 16) {
                                                      throw fd.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    } else {
                                                      try {
                                                        L14: {
                                                          if (field_c.startsWith("win")) {
                                                            L15: {
                                                              var11 = (String) (var8.field_a);
                                                              if (var11.startsWith("http://")) {
                                                                break L15;
                                                              } else {
                                                                if (var11.startsWith("https://")) {
                                                                  break L15;
                                                                } else {
                                                                  throw fd.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                            var4 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L16: while (true) {
                                                              if (var5 >= var11.length()) {
                                                                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var11 + "\"");
                                                                var8.field_c = null;
                                                                break L14;
                                                              } else {
                                                                if ((var4.indexOf((int) var11.charAt(var5)) ^ -1) == 0) {
                                                                  throw fd.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  var5++;
                                                                  continue L16;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            throw fd.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                                                        decompiledCaughtException = decompiledCaughtParameter2;
                                                        var3_ref3 = (Exception) (Object) decompiledCaughtException;
                                                        var8.field_c = var3_ref3;
                                                        throw fd.<RuntimeException>$cfr$sneakyThrow(var3_ref3);
                                                      }
                                                      break L7;
                                                    }
                                                  } else {
                                                    var3_ref2 = fd.a(field_t, (String) (var8.field_a), "", -7);
                                                    var8.field_c = var3_ref2;
                                                    break L7;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      throw fd.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    }
                                  }
                                }
                              }
                            } else {
                              L17: {
                                var9 = (Object[]) (var8.field_a);
                                if (this.field_k) {
                                  if (null == ((Class) (var9[0])).getClassLoader()) {
                                    throw new SecurityException();
                                  } else {
                                    break L17;
                                  }
                                } else {
                                  break L17;
                                }
                              }
                              var8.field_c = ((Class) (var9[0])).getDeclaredMethod((String) (var9[1]), (Class[]) (var9[2]));
                              break L7;
                            }
                          }
                        }
                      }
                    }
                  }
                  var8.field_f = 1;
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
                  var8.field_f = 2;
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

    final kk a(byte param0, Class param1, String param2) {
        if (param0 <= 91) {
            this.field_s = (kk) null;
        }
        return this.a(9, new Object[]{param1, param2}, false, 0, 0);
    }

    private final kk a(int param0, Object param1, boolean param2, int param3, int param4) {
        kk var6 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        L0: {
          var6 = new kk();
          if (!param2) {
            break L0;
          } else {
            field_c = (String) null;
            break L0;
          }
        }
        var6.field_d = param3;
        var6.field_b = param4;
        var6.field_a = param1;
        var6.field_g = param0;
        var7 = this;
        synchronized (var7) {
          L1: {
            L2: {
              if (null != this.field_n) {
                this.field_n.field_e = var6;
                this.field_n = var6;
                break L2;
              } else {
                this.field_s = var6;
                this.field_n = var6;
                break L2;
              }
            }
            this.notify();
            break L1;
          }
        }
        return var6;
    }

    final kk a(int param0, Runnable param1, int param2) {
        int var4 = -31 / ((9 - param2) / 44);
        return this.a(2, param1, false, 0, param0);
    }

    final kk a(int param0) {
        int var2 = 102 % ((-15 - param0) / 43);
        return this.a(5, (Object) null, false, 0, 0);
    }

    final kk a(Class[] param0, Class param1, String param2, int param3) {
        if (param3 < 104) {
            this.field_w = (Thread) null;
        }
        return this.a(8, new Object[]{param1, param2, param0}, false, 0, 0);
    }

    fd(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception exception = null;
        Throwable throwable = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        sl var6 = null;
        L0: {
          this.field_o = false;
          this.field_q = null;
          this.field_n = null;
          this.field_k = false;
          this.field_b = false;
          this.field_f = null;
          this.field_l = null;
          this.field_s = null;
          field_m = param1;
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
        ((fd) (this)).field_k = stackIn_3_1 != 0;
        field_u = "Unknown";
        field_t = param0;
        field_h = "1.1";
        try {
          L1: {
            field_u = System.getProperty("java.vendor");
            field_h = System.getProperty("java.version");
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
          if ((field_u.toLowerCase().indexOf("microsoft") ^ -1) != 0) {
            this.field_b = true;
            break L3;
          } else {
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
              field_g = System.getProperty("user.home");
              if (null == field_g) {
                break L11;
              } else {
                field_g = field_g + "/";
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
          if (field_g == null) {
            field_g = "~/";
            break L13;
          } else {
            break L13;
          }
        }
        try {
          L14: {
            this.field_d = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
          if (!this.field_b) {
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
                field_i = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
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
          qd.a(-1, field_t, field_m);
          if (!this.field_k) {
            break L21;
          } else {
            this.field_q = new ee(qd.a(field_t, (String) null, "random.dat", true), "rw", 25L);
            this.field_l = new ee(qd.a("main_file_cache.dat2", -19005), "rw", 314572800L);
            this.field_f = new ee(qd.a("main_file_cache.idx255", -19005), "rw", 1048576L);
            this.field_v = new ee[param2];
            var5_int = 0;
            L22: while (true) {
              if (var5_int >= param2) {
                L23: {
                  if (this.field_b) {
                    try {
                      L24: {
                        Class.forName("qe").newInstance();
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
                      if (this.field_b) {
                        var6 = new sl();
                        this.field_r = var6;
                        break L27;
                      } else {
                        this.field_p = Class.forName("hc").newInstance();
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
                      if (!this.field_b) {
                        this.field_j = Class.forName("dm").newInstance();
                        break L30;
                      } else {
                        this.field_a = new tl();
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
                this.field_v[var5_int] = new ee(qd.a("main_file_cache.idx" + var5_int, -19005), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        this.field_o = false;
        this.field_w = new Thread((Runnable) (this));
        this.field_w.setPriority(10);
        this.field_w.setDaemon(true);
        this.field_w.start();
    }

    static {
        field_x = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
