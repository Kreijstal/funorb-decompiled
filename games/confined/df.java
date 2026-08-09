/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class df implements Runnable {
    private Object field_q;
    private static String field_g;
    static String field_b;
    static String field_s;
    private boolean field_l;
    private bc field_x;
    private bc field_i;
    boolean field_p;
    static String field_f;
    private static volatile long field_h;
    private Thread field_a;
    fm[] field_d;
    fm field_n;
    private static String field_u;
    private le field_w;
    private boolean field_j;
    private mj field_c;
    private static int field_o;
    private Object field_m;
    fm field_t;
    java.awt.EventQueue field_k;
    private static String field_e;
    fm field_v;
    static java.lang.reflect.Method field_r;

    final bc a(int param0, java.net.URL param1) {
        if (param0 != 0) {
            return (bc) null;
        }
        return this.a(4, (byte) -93, param1, 0, 0);
    }

    final bc a(java.awt.Frame param0, int param1) {
        int var3 = 28 % ((param1 - -7) / 57);
        return this.a(7, (byte) -119, param0, 0, 0);
    }

    final void b(int param0) {
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
                this.field_j = true;
                this.notifyAll();
                break L0;
              }
            }
            L1: {
              if (param0 == 20269) {
                break L1;
              } else {
                this.field_p = true;
                break L1;
              }
            }
            try {
              L2: {
                this.field_a.join();
                break L2;
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
                    this.field_t.b(0);
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
              if (null == this.field_v) {
                break L7;
              } else {
                try {
                  L8: {
                    this.field_v.b(0);
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
              }
            }
            L10: {
              if (this.field_d != null) {
                var2_int = 0;
                L11: while (true) {
                  if (var2_int >= this.field_d.length) {
                    break L10;
                  } else {
                    if (null != this.field_d[var2_int]) {
                      try {
                        L12: {
                          this.field_d[var2_int].b(0);
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
              } else {
                break L10;
              }
            }
            L14: {
              if (null == this.field_n) {
                break L14;
              } else {
                try {
                  L15: {
                    this.field_n.b(0);
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

    final bc a(int param0, int param1, String param2) {
        int var4 = 114 % ((param1 - 34) / 51);
        return this.a((byte) -93, false, param0, param2);
    }

    final bc a(byte param0, Runnable param1, int param2) {
        if (param0 < 31) {
            return (bc) null;
        }
        return this.a(2, (byte) -59, param1, 0, param2);
    }

    public final void run() {
        try {
            int stackIn_80_0 = 0;
            Throwable decompiledCaughtException = null;
            Object var2 = null;
            int var2_int = 0;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            InterruptedException var3 = null;
            fm var3_ref = null;
            int var3_int = 0;
            Exception var3_ref2 = null;
            kk var3_ref3 = null;
            int var4_int = 0;
            String var4 = null;
            int var5 = 0;
            java.awt.datatransfer.Transferable var7 = null;
            String var8 = null;
            bc var9 = null;
            Object[] var10 = null;
            Object[] var11 = null;
            java.awt.Component var12 = null;
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
                    if (!this.field_j) {
                      if (null == this.field_i) {
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
                          var9 = this.field_i;
                          this.field_i = this.field_i.field_a;
                          if (null == this.field_i) {
                            this.field_x = null;
                            break L5;
                          } else {
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
                    var2_int = var9.field_b;
                    if (var2_int == 1) {
                      if ((field_h ^ -1L) >= (ri.a(-3) ^ -1L)) {
                        var9.field_f = new java.net.Socket(java.net.InetAddress.getByName((String) (var9.field_c)), var9.field_e);
                        break L7;
                      } else {
                        throw new IOException();
                      }
                    } else {
                      if ((var2_int ^ -1) != -23) {
                        if (var2_int == 2) {
                          var18 = new Thread((Runnable) (var9.field_c));
                          var18.setDaemon(true);
                          var18.start();
                          var18.setPriority(var9.field_e);
                          var9.field_f = var18;
                          break L7;
                        } else {
                          if ((var2_int ^ -1) == -5) {
                            if ((field_h ^ -1L) >= (ri.a(-3) ^ -1L)) {
                              var9.field_f = new DataInputStream(((java.net.URL) (var9.field_c)).openStream());
                              break L7;
                            } else {
                              throw new IOException();
                            }
                          } else {
                            if ((var2_int ^ -1) != -9) {
                              if (-10 == (var2_int ^ -1)) {
                                L8: {
                                  var17 = (Object[]) (var9.field_c);
                                  if (this.field_p) {
                                    if (null == ((Class) (var17[0])).getClassLoader()) {
                                      throw new SecurityException();
                                    } else {
                                      break L8;
                                    }
                                  } else {
                                    break L8;
                                  }
                                }
                                var9.field_f = ((Class) (var17[0])).getDeclaredField((String) (var17[1]));
                                break L7;
                              } else {
                                if (var2_int == 18) {
                                  var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var9.field_f = var16.getContents((Object) null);
                                  break L7;
                                } else {
                                  if ((var2_int ^ -1) == -20) {
                                    var7 = (java.awt.datatransfer.Transferable) (var9.field_c);
                                    var15 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var15.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L7;
                                  } else {
                                    if (this.field_p) {
                                      if ((var2_int ^ -1) == -4) {
                                        if (field_h > ri.a(-3)) {
                                          throw new IOException();
                                        } else {
                                          var14 = (var9.field_e >> -1814629000 & 255) + "." + (255 & var9.field_e >> 1556087984) + "." + ((65510 & var9.field_e) >> -2070388472) + "." + (255 & var9.field_e);
                                          var9.field_f = java.net.InetAddress.getByName(var14).getHostName();
                                          break L7;
                                        }
                                      } else {
                                        if (-22 == (var2_int ^ -1)) {
                                          if ((ri.a(-3) ^ -1L) > (field_h ^ -1L)) {
                                            throw new IOException();
                                          } else {
                                            var9.field_f = java.net.InetAddress.getByName((String) (var9.field_c)).getAddress();
                                            break L7;
                                          }
                                        } else {
                                          if (var2_int != 5) {
                                            if (-7 == (var2_int ^ -1)) {
                                              var13 = new java.awt.Frame("Jagex Full Screen");
                                              var9.field_f = var13;
                                              var13.setResizable(false);
                                              if (!this.field_l) {
                                                Class.forName("ff").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_m, new Object[]{var13, new Integer(var9.field_e >>> -524350384), new Integer(var9.field_e & 65535), new Integer(var9.field_d >> -794030928), new Integer(var9.field_d & 65535)});
                                                break L7;
                                              } else {
                                                this.field_c.a(var9.field_e >>> 56086064, var13, var9.field_d & 65535, var9.field_d >> -448723632, var9.field_e & 65535, -2147483648);
                                                break L7;
                                              }
                                            } else {
                                              if (7 == var2_int) {
                                                if (this.field_l) {
                                                  this.field_c.a((byte) 73, (java.awt.Frame) (var9.field_c));
                                                  break L7;
                                                } else {
                                                  Class.forName("ff").getMethod("exit", new Class[]{}).invoke(this.field_m, new Object[]{});
                                                  break L7;
                                                }
                                              } else {
                                                if (var2_int == 12) {
                                                  var3_ref = df.a((String) (var9.field_c), field_g, 0, field_o);
                                                  var9.field_f = var3_ref;
                                                  break L7;
                                                } else {
                                                  if (-14 != (var2_int ^ -1)) {
                                                    L9: {
                                                      if (!this.field_p) {
                                                        break L9;
                                                      } else {
                                                        if ((var2_int ^ -1) != -15) {
                                                          break L9;
                                                        } else {
                                                          var3_int = var9.field_e;
                                                          var4_int = var9.field_d;
                                                          if (this.field_l) {
                                                            this.field_w.a((byte) -127, var3_int, var4_int);
                                                            break L7;
                                                          } else {
                                                            Class.forName("jm").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_q, new Object[]{new Integer(var3_int), new Integer(var4_int)});
                                                            break L7;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L10: {
                                                      if (!this.field_p) {
                                                        break L10;
                                                      } else {
                                                        if (-16 == (var2_int ^ -1)) {
                                                          L11: {
                                                            if (var9.field_e == 0) {
                                                              stackIn_80_0 = 0;
                                                              break L11;
                                                            } else {
                                                              stackIn_80_0 = 1;
                                                              break L11;
                                                            }
                                                          }
                                                          var3_int = stackIn_80_0;
                                                          var12 = (java.awt.Component) (var9.field_c);
                                                          if (this.field_l) {
                                                            this.field_w.a((byte) -83, var12, var3_int != 0);
                                                            break L7;
                                                          } else {
                                                            Class.forName("jm").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_q, new Object[]{var12, new Boolean(var3_int != 0)});
                                                            break L7;
                                                          }
                                                        } else {
                                                          break L10;
                                                        }
                                                      }
                                                    }
                                                    L12: {
                                                      if (this.field_l) {
                                                        break L12;
                                                      } else {
                                                        if (-18 == (var2_int ^ -1)) {
                                                          var11 = (Object[]) (var9.field_c);
                                                          Class.forName("jm").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_q, new Object[]{var11[0], var11[1], new Integer(var9.field_e), new Integer(var9.field_d), var11[2]});
                                                          break L7;
                                                        } else {
                                                          break L12;
                                                        }
                                                      }
                                                    }
                                                    if (var2_int != 16) {
                                                      throw df.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    } else {
                                                      try {
                                                        L13: {
                                                          if (field_f.startsWith("win")) {
                                                            L14: {
                                                              var8 = (String) (var9.field_c);
                                                              if (var8.startsWith("http://")) {
                                                                break L14;
                                                              } else {
                                                                if (!var8.startsWith("https://")) {
                                                                  throw df.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  break L14;
                                                                }
                                                              }
                                                            }
                                                            var4 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L15: while (true) {
                                                              if (var5 >= var8.length()) {
                                                                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var8 + "\"");
                                                                var9.field_f = null;
                                                                break L13;
                                                              } else {
                                                                if (0 == (var4.indexOf((int) var8.charAt(var5)) ^ -1)) {
                                                                  throw df.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  var5++;
                                                                  continue L15;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            throw df.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter1) {
                                                        decompiledCaughtException = decompiledCaughtParameter1;
                                                        var3_ref2 = (Exception) (Object) decompiledCaughtException;
                                                        var9.field_f = var3_ref2;
                                                        throw df.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                                                      }
                                                      break L7;
                                                    }
                                                  } else {
                                                    var3_ref = df.a((String) (var9.field_c), "", 0, field_o);
                                                    var9.field_f = var3_ref;
                                                    break L7;
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            if (this.field_l) {
                                              var9.field_f = this.field_c.a(0);
                                              break L7;
                                            } else {
                                              var9.field_f = Class.forName("ff").getMethod("listmodes", new Class[]{}).invoke(this.field_m, new Object[]{});
                                              break L7;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      throw df.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    }
                                  }
                                }
                              }
                            } else {
                              L16: {
                                var10 = (Object[]) (var9.field_c);
                                if (this.field_p) {
                                  if (null == ((Class) (var10[0])).getClassLoader()) {
                                    throw new SecurityException();
                                  } else {
                                    break L16;
                                  }
                                } else {
                                  break L16;
                                }
                              }
                              var9.field_f = ((Class) (var10[0])).getDeclaredMethod((String) (var10[1]), (Class[]) (var10[2]));
                              break L7;
                            }
                          }
                        }
                      } else {
                        if (field_h <= ri.a(-3)) {
                          try {
                              if (false) throw (kk) null;
                            L17: {
                              var9.field_f = fb.a(12, var9.field_e, (String) (var9.field_c)).b(-22176);
                              break L17;
                            }
                          } catch (kk decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref3 = (kk) (Object) decompiledCaughtException;
                            var9.field_f = var3_ref3.getMessage();
                            throw var3_ref3;
                          }
                          break L7;
                        } else {
                          throw new IOException();
                        }
                      }
                    }
                  }
                  var9.field_g = 1;
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
                  var9.field_g = 2;
                  break L18;
                }
              }
              var2 = var9;
              synchronized (var2) {
                L19: {
                  var9.notify();
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

    final bc a(int param0, Class param1, String param2) {
        if (param0 != 0) {
            String var5 = (String) null;
            this.a(-42, 93, (String) null);
        }
        return this.a(9, (byte) -55, new Object[]{param1, param2}, 0, 0);
    }

    private final bc a(byte param0, boolean param1, int param2, String param3) {
        int var5 = -5 % ((-38 - param0) / 54);
        return this.a(param1 ? 22 : 1, (byte) -102, param3, 0, param2);
    }

    private final bc a(int param0, byte param1, Object param2, int param3, int param4) {
        bc var6 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        L0: {
          var6 = new bc();
          var6.field_b = param0;
          var6.field_c = param2;
          if (param1 <= -36) {
            break L0;
          } else {
            field_o = -104;
            break L0;
          }
        }
        var6.field_e = param4;
        var6.field_d = param3;
        var7 = this;
        synchronized (var7) {
          L1: {
            L2: {
              if (this.field_x == null) {
                this.field_i = var6;
                this.field_x = var6;
                break L2;
              } else {
                this.field_x.field_a = var6;
                this.field_x = var6;
                break L2;
              }
            }
            this.notify();
            break L1;
          }
        }
        return var6;
    }

    final bc a(byte param0, int param1, int param2, int param3, int param4) {
        if (param0 > -57) {
            this.b(38);
        }
        return this.a(6, (byte) -70, (Object) null, param2 + (param3 << 1872193360), (param1 << -697776752) + param4);
    }

    final boolean c(int param0) {
        if (!(this.field_p)) {
            return false;
        }
        if (param0 > -120) {
            this.field_i = (bc) null;
        }
        if (!this.field_l) {
            return this.field_m != null ? true : false;
        }
        return this.field_c != null ? true : false;
    }

    private final static fm a(String param0, String param1, int param2, int param3) {
        try {
            fm stackIn_12_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            String var7 = null;
            fm var8 = null;
            Exception var8_ref = null;
            L0: {
              if (param3 != 33) {
                if (-35 == (param3 ^ -1)) {
                  var4 = "jagex_" + param1 + "_preferences" + param0 + "_wip.dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param1 + "_preferences" + param0 + ".dat";
                  break L0;
                }
              } else {
                var4 = "jagex_" + param1 + "_preferences" + param0 + "_rc.dat";
                break L0;
              }
            }
            var5 = new String[]{"c:/rscache/", "/rscache/", field_u, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            var6 = param2;
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
                    var8 = new fm(new File(var7, var4), "rw", 10000L);
                    stackIn_12_0 = (fm) (var8);
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
                  return stackIn_12_0;
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

    final bc a(int param0) {
        if (param0 != 5) {
            field_e = (String) null;
        }
        return this.a(5, (byte) -86, (Object) null, 0, 0);
    }

    final bc a(byte param0, Class param1, Class[] param2, String param3) {
        int var5 = 59 % ((-21 - param0) / 46);
        return this.a(8, (byte) -38, new Object[]{param1, param3, param2}, 0, 0);
    }

    df(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception exception = null;
        Throwable throwable = null;
        int var5_int = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Throwable decompiledCaughtException = null;
        mj var6 = null;
        L0: {
          this.field_l = false;
          this.field_n = null;
          this.field_x = null;
          this.field_p = false;
          this.field_i = null;
          this.field_t = null;
          this.field_j = false;
          this.field_v = null;
          field_o = param0;
          field_g = param1;
          field_b = "Unknown";
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
        ((df) (this)).field_p = stackIn_3_1 != 0;
        field_s = "1.1";
        try {
          L1: {
            field_b = System.getProperty("java.vendor");
            field_s = System.getProperty("java.version");
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
          if (field_b.toLowerCase().indexOf("microsoft") == -1) {
            break L3;
          } else {
            this.field_l = true;
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
        field_f = field_e.toLowerCase();
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
              field_u = System.getProperty("user.home");
              if (null == field_u) {
                break L11;
              } else {
                field_u = field_u + "/";
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
          if (field_u != null) {
            break L13;
          } else {
            field_u = "~/";
            break L13;
          }
        }
        try {
          L14: {
            this.field_k = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
          if (this.field_l) {
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
                field_r = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
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
          ub.a(field_g, field_o, -26761);
          if (!this.field_p) {
            break L21;
          } else {
            this.field_n = new fm(ub.a((String) null, -3, field_o, "random.dat"), "rw", 25L);
            this.field_t = new fm(ub.a("main_file_cache.dat2", (byte) 96), "rw", 314572800L);
            this.field_v = new fm(ub.a("main_file_cache.idx255", (byte) 127), "rw", 1048576L);
            this.field_d = new fm[param2];
            var5_int = 0;
            L22: while (true) {
              if (param2 <= var5_int) {
                L23: {
                  if (!this.field_l) {
                    break L23;
                  } else {
                    try {
                      L24: {
                        Class.forName("re").newInstance();
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
                      if (this.field_l) {
                        var6 = new mj();
                        this.field_c = var6;
                        break L27;
                      } else {
                        this.field_m = Class.forName("ff").newInstance();
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
                        this.field_q = Class.forName("jm").newInstance();
                        break L30;
                      } else {
                        this.field_w = new le();
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
                this.field_d[var5_int] = new fm(ub.a("main_file_cache.idx" + var5_int, (byte) -87), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        this.field_j = false;
        this.field_a = new Thread((Runnable) (this));
        this.field_a.setPriority(10);
        this.field_a.setDaemon(true);
        this.field_a.start();
    }

    static {
        field_h = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
