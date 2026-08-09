/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class uf implements Runnable {
    private tb field_w;
    tc field_p;
    private Thread field_u;
    static String field_e;
    private boolean field_r;
    private ul field_j;
    private static String field_a;
    private Object field_d;
    java.awt.EventQueue field_i;
    static java.lang.reflect.Method field_m;
    private static String field_h;
    boolean field_l;
    private Object field_f;
    tc[] field_q;
    private boolean field_c;
    tc field_t;
    tc field_v;
    private static int field_s;
    private static String field_x;
    static String field_g;
    static String field_b;
    private ce field_k;
    private ce field_n;
    private static volatile long field_o;

    final ce a(boolean param0, java.net.URL param1) {
        if (param0) {
            Class var4 = (Class) null;
            this.a((String) null, (Class[]) null, -97, (Class) null);
        }
        return this.a(0, 1484280784, param1, 0, 4);
    }

    final boolean b(int param0) {
        if (!this.field_l) {
            return false;
        }
        if (param0 != -4) {
            return false;
        }
        if (!this.field_c) {
            return null != this.field_d ? true : false;
        }
        return this.field_j != null ? true : false;
    }

    final ce a(int param0, int param1, String param2) {
        if (param0 <= 14) {
            String var5 = (String) null;
            this.a(-124, 6, (String) null);
        }
        return this.a(false, param1, param2, (byte) -126);
    }

    final ce a(int param0, Runnable param1, int param2) {
        if (param2 < 0) {
            return (ce) null;
        }
        return this.a(0, 1484280784, param1, param0, 2);
    }

    final ce a(String param0, Class[] param1, int param2, Class param3) {
        if (param2 != 0) {
            field_h = (String) null;
        }
        return this.a(0, 1484280784, new Object[]{param3, param0, param1}, 0, 8);
    }

    private final ce a(boolean param0, int param1, String param2, byte param3) {
        if (param3 > -124) {
            field_g = (String) null;
        }
        return this.a(0, 1484280784, param2, param1, !param0 ? 1 : 22);
    }

    final ce a(java.awt.Frame param0, int param1) {
        if (param1 > -15) {
            return (ce) null;
        }
        return this.a(0, 1484280784, param0, 0, 7);
    }

    final ce a(int param0, int param1, int param2, int param3, int param4) {
        if (param0 <= 54) {
            Class var7 = (Class) null;
            this.a((String) null, (Class[]) null, 110, (Class) null);
        }
        return this.a((param1 << 604983024) - -param2, 1484280784, (Object) null, param4 + (param3 << 1484280784), 6);
    }

    private final static tc a(String param0, int param1, int param2, String param3) {
        try {
            tc stackIn_15_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            String var7 = null;
            tc var8 = null;
            Exception var8_ref = null;
            L0: {
              if (-34 == (param1 ^ -1)) {
                var4 = "jagex_" + param3 + "_preferences" + param0 + "_rc.dat";
                break L0;
              } else {
                if ((param1 ^ -1) == -35) {
                  var4 = "jagex_" + param3 + "_preferences" + param0 + "_wip.dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param3 + "_preferences" + param0 + ".dat";
                  break L0;
                }
              }
            }
            L1: {
              var5 = new String[]{"c:/rscache/", "/rscache/", field_x, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
              if (param2 > 33) {
                break L1;
              } else {
                field_g = (String) null;
                break L1;
              }
            }
            var6 = 0;
            L2: while (true) {
              if (var6 < var5.length) {
                L3: {
                  var7 = var5[var6];
                  if ((var7.length() ^ -1) >= -1) {
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
                    var8 = new tc(new File(var7, var4), "rw", 10000L);
                    stackIn_15_0 = (tc) (var8);
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

    final ce a(int param0, String param1, Class param2) {
        if (param0 != -26462) {
            this.run();
        }
        return this.a(0, 1484280784, new Object[]{param2, param1}, 0, 9);
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
                this.field_r = true;
                this.notifyAll();
                break L0;
              }
            }
            try {
              L1: {
                this.field_u.join();
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
              if (this.field_t == null) {
                break L3;
              } else {
                try {
                  L4: {
                    this.field_t.a(-31576);
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
              if (this.field_v == null) {
                break L6;
              } else {
                try {
                  L7: {
                    this.field_v.a(-31576);
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
              }
            }
            L9: {
              if (this.field_q == null) {
                break L9;
              } else {
                var2 = 0;
                L10: while (true) {
                  if (var2 >= this.field_q.length) {
                    break L9;
                  } else {
                    if (this.field_q[var2] != null) {
                      try {
                        L11: {
                          this.field_q[var2].a(-31576);
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
              if (this.field_p != null) {
                try {
                  L14: {
                    this.field_p.a(-31576);
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
            var2 = -30 / ((1 - param0) / 47);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final ce a(int param0, int param1, Object param2, int param3, int param4) {
        ce var6 = null;
        String var9 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        L0: {
          var6 = new ce();
          if (param1 == 1484280784) {
            break L0;
          } else {
            var9 = (String) null;
            this.a(21, 107, (String) null);
            break L0;
          }
        }
        var6.field_c = param2;
        var6.field_d = param0;
        var6.field_g = param4;
        var6.field_b = param3;
        var7 = this;
        synchronized (var7) {
          L1: {
            L2: {
              if (null != this.field_n) {
                this.field_n.field_a = var6;
                this.field_n = var6;
                break L2;
              } else {
                this.field_k = var6;
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

    public final void run() {
        try {
            int stackIn_85_0 = 0;
            Throwable decompiledCaughtException = null;
            Object var2 = null;
            int var2_int = 0;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            InterruptedException var3 = null;
            tc var3_ref = null;
            int var3_int = 0;
            Exception var3_ref2 = null;
            dj var3_ref3 = null;
            int var4_int = 0;
            String var4 = null;
            int var5 = 0;
            java.awt.datatransfer.Transferable var7 = null;
            ce var8 = null;
            Object[] var9 = null;
            java.awt.datatransfer.Clipboard var10 = null;
            Object[] var11 = null;
            String var12 = null;
            java.awt.Component var13 = null;
            java.awt.Frame var14 = null;
            String var15 = null;
            java.awt.datatransfer.Clipboard var16 = null;
            Object[] var17 = null;
            Thread var18 = null;
            L0: while (true) {
              var2 = this;
              synchronized (var2) {
                L1: {
                  L2: while (true) {
                    if (!this.field_r) {
                      if (null == this.field_k) {
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
                          var8 = this.field_k;
                          this.field_k = this.field_k.field_a;
                          if (this.field_k != null) {
                            break L5;
                          } else {
                            this.field_n = null;
                            break L5;
                          }
                        }
                        break L1;
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
                    var2_int = var8.field_g;
                    if (-2 == (var2_int ^ -1)) {
                      if (qg.a(false) < field_o) {
                        throw new IOException();
                      } else {
                        var8.field_e = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.field_c)), var8.field_b);
                        break L7;
                      }
                    } else {
                      if (22 != var2_int) {
                        if (-3 == (var2_int ^ -1)) {
                          var18 = new Thread((Runnable) (var8.field_c));
                          var18.setDaemon(true);
                          var18.start();
                          var18.setPriority(var8.field_b);
                          var8.field_e = var18;
                          break L7;
                        } else {
                          if (4 != var2_int) {
                            if (var2_int != 8) {
                              if (var2_int == 9) {
                                L8: {
                                  var17 = (Object[]) (var8.field_c);
                                  if (!this.field_l) {
                                    break L8;
                                  } else {
                                    if (((Class) (var17[0])).getClassLoader() != null) {
                                      break L8;
                                    } else {
                                      throw new SecurityException();
                                    }
                                  }
                                }
                                var8.field_e = ((Class) (var17[0])).getDeclaredField((String) (var17[1]));
                                break L7;
                              } else {
                                if (18 == var2_int) {
                                  var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8.field_e = var16.getContents((Object) null);
                                  break L7;
                                } else {
                                  if (19 != var2_int) {
                                    if (this.field_l) {
                                      if ((var2_int ^ -1) == -4) {
                                        if (qg.a(false) >= field_o) {
                                          var15 = (var8.field_b >> -417455912 & 255) + "." + (255 & var8.field_b >> 743279344) + "." + ((65479 & var8.field_b) >> 633715528) + "." + (255 & var8.field_b);
                                          var8.field_e = java.net.InetAddress.getByName(var15).getHostName();
                                          break L7;
                                        } else {
                                          throw new IOException();
                                        }
                                      } else {
                                        if (21 == var2_int) {
                                          if ((field_o ^ -1L) >= (qg.a(false) ^ -1L)) {
                                            var8.field_e = java.net.InetAddress.getByName((String) (var8.field_c)).getAddress();
                                            break L7;
                                          } else {
                                            throw new IOException();
                                          }
                                        } else {
                                          if (-6 != (var2_int ^ -1)) {
                                            if (-7 == (var2_int ^ -1)) {
                                              var14 = new java.awt.Frame("Jagex Full Screen");
                                              var8.field_e = var14;
                                              var14.setResizable(false);
                                              if (this.field_c) {
                                                this.field_j.a(65535 & var8.field_b, var8.field_d >> -1496725264, var8.field_b >>> 864236560, false, var14, var8.field_d & 65535);
                                                break L7;
                                              } else {
                                                Class.forName("eg").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_d, new Object[]{var14, new Integer(var8.field_b >>> -1651784592), new Integer(var8.field_b & 65535), new Integer(var8.field_d >> 238734768), new Integer(var8.field_d & 65535)});
                                                break L7;
                                              }
                                            } else {
                                              if ((var2_int ^ -1) != -8) {
                                                if (12 == var2_int) {
                                                  var3_ref = uf.a((String) (var8.field_c), field_s, 40, field_a);
                                                  var8.field_e = var3_ref;
                                                  break L7;
                                                } else {
                                                  if ((var2_int ^ -1) == -14) {
                                                    var3_ref = uf.a((String) (var8.field_c), field_s, 124, "");
                                                    var8.field_e = var3_ref;
                                                    break L7;
                                                  } else {
                                                    L9: {
                                                      if (!this.field_l) {
                                                        break L9;
                                                      } else {
                                                        if (-15 != (var2_int ^ -1)) {
                                                          break L9;
                                                        } else {
                                                          var3_int = var8.field_b;
                                                          var4_int = var8.field_d;
                                                          if (!this.field_c) {
                                                            Class.forName("wc").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_f, new Object[]{new Integer(var3_int), new Integer(var4_int)});
                                                            break L7;
                                                          } else {
                                                            this.field_w.a(31942, var3_int, var4_int);
                                                            break L7;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L10: {
                                                      if (!this.field_l) {
                                                        break L10;
                                                      } else {
                                                        if ((var2_int ^ -1) == -16) {
                                                          L11: {
                                                            if (var8.field_b == 0) {
                                                              stackIn_85_0 = 0;
                                                              break L11;
                                                            } else {
                                                              stackIn_85_0 = 1;
                                                              break L11;
                                                            }
                                                          }
                                                          var3_int = stackIn_85_0;
                                                          var13 = (java.awt.Component) (var8.field_c);
                                                          if (!this.field_c) {
                                                            Class.forName("wc").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_f, new Object[]{var13, new Boolean(var3_int != 0)});
                                                            break L7;
                                                          } else {
                                                            this.field_w.a(var3_int != 0, var13, 5745);
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
                                                        if (var2_int != 17) {
                                                          break L12;
                                                        } else {
                                                          var11 = (Object[]) (var8.field_c);
                                                          Class.forName("wc").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_f, new Object[]{var11[0], var11[1], new Integer(var8.field_b), new Integer(var8.field_d), var11[2]});
                                                          break L7;
                                                        }
                                                      }
                                                    }
                                                    if (-17 != (var2_int ^ -1)) {
                                                      throw uf.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    } else {
                                                      try {
                                                        L13: {
                                                          if (!field_b.startsWith("win")) {
                                                            throw uf.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          } else {
                                                            L14: {
                                                              var12 = (String) (var8.field_c);
                                                              if (var12.startsWith("http://")) {
                                                                break L14;
                                                              } else {
                                                                if (!var12.startsWith("https://")) {
                                                                  throw uf.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  break L14;
                                                                }
                                                              }
                                                            }
                                                            var4 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L15: while (true) {
                                                              if (var5 >= var12.length()) {
                                                                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var12 + "\"");
                                                                var8.field_e = null;
                                                                break L13;
                                                              } else {
                                                                if ((var4.indexOf((int) var12.charAt(var5)) ^ -1) == 0) {
                                                                  throw uf.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  var5++;
                                                                  continue L15;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter1) {
                                                        decompiledCaughtException = decompiledCaughtParameter1;
                                                        var3_ref2 = (Exception) (Object) decompiledCaughtException;
                                                        var8.field_e = var3_ref2;
                                                        throw uf.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                                                      }
                                                      break L7;
                                                    }
                                                  }
                                                }
                                              } else {
                                                if (this.field_c) {
                                                  this.field_j.a((byte) -2, (java.awt.Frame) (var8.field_c));
                                                  break L7;
                                                } else {
                                                  Class.forName("eg").getMethod("exit", new Class[]{}).invoke(this.field_d, new Object[]{});
                                                  break L7;
                                                }
                                              }
                                            }
                                          } else {
                                            if (this.field_c) {
                                              var8.field_e = this.field_j.a(0);
                                              break L7;
                                            } else {
                                              var8.field_e = Class.forName("eg").getMethod("listmodes", new Class[]{}).invoke(this.field_d, new Object[]{});
                                              break L7;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      throw uf.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    }
                                  } else {
                                    var7 = (java.awt.datatransfer.Transferable) (var8.field_c);
                                    var10 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var10.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L7;
                                  }
                                }
                              }
                            } else {
                              L16: {
                                var9 = (Object[]) (var8.field_c);
                                if (!this.field_l) {
                                  break L16;
                                } else {
                                  if (((Class) (var9[0])).getClassLoader() == null) {
                                    throw new SecurityException();
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                              var8.field_e = ((Class) (var9[0])).getDeclaredMethod((String) (var9[1]), (Class[]) (var9[2]));
                              break L7;
                            }
                          } else {
                            if ((qg.a(false) ^ -1L) > (field_o ^ -1L)) {
                              throw new IOException();
                            } else {
                              var8.field_e = new DataInputStream(((java.net.URL) (var8.field_c)).openStream());
                              break L7;
                            }
                          }
                        }
                      } else {
                        if ((field_o ^ -1L) < (qg.a(false) ^ -1L)) {
                          throw new IOException();
                        } else {
                          try {
                              if (false) throw (dj) null;
                            L17: {
                              var8.field_e = oj.a((String) (var8.field_c), var8.field_b, 0).c(-118);
                              break L17;
                            }
                          } catch (dj decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref3 = (dj) (Object) decompiledCaughtException;
                            var8.field_e = var3_ref3.getMessage();
                            throw var3_ref3;
                          }
                          break L7;
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

    final ce a(int param0) {
        if (param0 <= 33) {
            return (ce) null;
        }
        return this.a(0, 1484280784, (Object) null, 0, 5);
    }

    uf(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception exception = null;
        Throwable throwable = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        ul var6 = null;
        L0: {
          this.field_p = null;
          this.field_l = false;
          this.field_r = false;
          this.field_c = false;
          this.field_v = null;
          this.field_t = null;
          this.field_n = null;
          this.field_k = null;
          field_a = param1;
          field_g = "1.1";
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
        ((uf) (this)).field_l = stackIn_3_1 != 0;
        field_e = "Unknown";
        field_s = param0;
        try {
          L1: {
            field_e = System.getProperty("java.vendor");
            field_g = System.getProperty("java.version");
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
          if (0 == (field_e.toLowerCase().indexOf("microsoft") ^ -1)) {
            break L3;
          } else {
            this.field_c = true;
            break L3;
          }
        }
        try {
          L4: {
            field_h = System.getProperty("os.name");
            break L4;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            exception = (Exception) (Object) decompiledCaughtException;
            field_h = "Unknown";
            break L5;
          }
        }
        field_b = field_h.toLowerCase();
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
              field_x = System.getProperty("user.home");
              if (null == field_x) {
                break L11;
              } else {
                field_x = field_x + "/";
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
          if (null == field_x) {
            field_x = "~/";
            break L13;
          } else {
            break L13;
          }
        }
        try {
          L14: {
            this.field_i = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
          if (!this.field_c) {
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
                field_m = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
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
          tj.a(field_s, field_a, (byte) -119);
          if (!this.field_l) {
            break L21;
          } else {
            this.field_p = new tc(tj.a(field_s, (byte) 78, (String) null, "random.dat"), "rw", 25L);
            this.field_t = new tc(tj.a((byte) -61, "main_file_cache.dat2"), "rw", 314572800L);
            this.field_v = new tc(tj.a((byte) -61, "main_file_cache.idx255"), "rw", 1048576L);
            this.field_q = new tc[param2];
            var5_int = 0;
            L22: while (true) {
              if (var5_int >= param2) {
                L23: {
                  if (!this.field_c) {
                    break L23;
                  } else {
                    try {
                      L24: {
                        Class.forName("ph").newInstance();
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
                        var6 = new ul();
                        this.field_j = var6;
                        break L27;
                      } else {
                        this.field_d = Class.forName("eg").newInstance();
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
                        this.field_w = new tb();
                        break L30;
                      } else {
                        this.field_f = Class.forName("wc").newInstance();
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
                this.field_q[var5_int] = new tc(tj.a((byte) -61, "main_file_cache.idx" + var5_int), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        this.field_r = false;
        this.field_u = new Thread((Runnable) (this));
        this.field_u.setPriority(10);
        this.field_u.setDaemon(true);
        this.field_u.start();
    }

    static {
        field_o = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
