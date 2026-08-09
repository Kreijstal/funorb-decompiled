/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sj implements Runnable {
    private Object field_j;
    private Object field_p;
    private static int field_r;
    static String field_t;
    static String field_o;
    private Thread field_s;
    static java.lang.reflect.Method field_q;
    v field_b;
    private static String field_g;
    private static String field_v;
    private dc field_m;
    private static String field_d;
    private static volatile long field_h;
    private le field_c;
    java.awt.EventQueue field_a;
    private boolean field_u;
    v field_x;
    private le field_l;
    static String field_w;
    v field_e;
    private boolean field_i;
    boolean field_k;
    private ce field_f;
    v[] field_n;

    final le a(boolean param0, byte param1, java.awt.Component param2) {
        if (param1 != 106) {
            return (le) null;
        }
        return this.a(15, !param0 ? 0 : 1, false, param2, 0);
    }

    private final static v a(String param0, int param1, boolean param2, String param3) {
        try {
            v stackIn_12_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            String var7 = null;
            v var8 = null;
            Exception var8_ref = null;
            String var9 = null;
            L0: {
              if ((param1 ^ -1) == -34) {
                var4 = "jagex_" + param3 + "_preferences" + param0 + "_rc.dat";
                break L0;
              } else {
                if (34 != param1) {
                  var4 = "jagex_" + param3 + "_preferences" + param0 + ".dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param3 + "_preferences" + param0 + "_wip.dat";
                  break L0;
                }
              }
            }
            var5 = new String[]{"c:/rscache/", "/rscache/", field_v, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            var6 = 0;
            L1: while (true) {
              if (var6 >= var5.length) {
                if (param2) {
                  var9 = (String) null;
                  sj.a((String) null, -124, false, (String) null);
                  return null;
                } else {
                  return null;
                }
              } else {
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
                    var8 = new v(new File(var7, var4), "rw", 10000L);
                    stackIn_12_0 = (v) (var8);
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
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final le a(int param0, int param1, Runnable param2) {
        if (param0 < 27) {
            field_h = -9L;
        }
        return this.a(2, param1, false, param2, 0);
    }

    public final void run() {
        try {
            int stackIn_78_0 = 0;
            Throwable decompiledCaughtException = null;
            Object var2 = null;
            int var2_int = 0;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            InterruptedException var3 = null;
            lo var3_ref = null;
            v var3_ref2 = null;
            int var3_int = 0;
            Exception var3_ref3 = null;
            int var4 = 0;
            String var4_ref_String = null;
            int var5 = 0;
            java.awt.datatransfer.Transferable var7 = null;
            String var8 = null;
            le var9 = null;
            String var10 = null;
            Object[] var11 = null;
            java.awt.Component var12 = null;
            java.awt.Frame var13 = null;
            java.awt.datatransfer.Clipboard var14 = null;
            java.awt.datatransfer.Clipboard var15 = null;
            Object[] var16 = null;
            Object[] var17 = null;
            Thread var18 = null;
            L0: while (true) {
              var2 = this;
              synchronized (var2) {
                L1: {
                  L2: while (true) {
                    if (!this.field_u) {
                      if (null != this.field_c) {
                        L3: {
                          var9 = this.field_c;
                          this.field_c = this.field_c.field_c;
                          if (null == this.field_c) {
                            this.field_l = null;
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
                            var3 = (InterruptedException) (Object) decompiledCaughtException;
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
                    var2_int = var9.field_d;
                    if (var2_int != 1) {
                      if (-23 == (var2_int ^ -1)) {
                        if (rl.a((byte) -113) < field_h) {
                          throw new IOException();
                        } else {
                          try {
                              if (false) throw (lo) null;
                            L8: {
                              var9.field_e = ii.a(114, (String) (var9.field_g), var9.field_a).a((byte) -108);
                              break L8;
                            }
                          } catch (lo decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref = (lo) (Object) decompiledCaughtException;
                            var9.field_e = var3_ref.getMessage();
                            throw var3_ref;
                          }
                          break L7;
                        }
                      } else {
                        if (var2_int == 2) {
                          var18 = new Thread((Runnable) (var9.field_g));
                          var18.setDaemon(true);
                          var18.start();
                          var18.setPriority(var9.field_a);
                          var9.field_e = var18;
                          break L7;
                        } else {
                          if (var2_int == 4) {
                            if ((rl.a((byte) -97) ^ -1L) <= (field_h ^ -1L)) {
                              var9.field_e = new DataInputStream(((java.net.URL) (var9.field_g)).openStream());
                              break L7;
                            } else {
                              throw new IOException();
                            }
                          } else {
                            if (-9 == (var2_int ^ -1)) {
                              L9: {
                                var17 = (Object[]) (var9.field_g);
                                if (this.field_k) {
                                  if (null == ((Class) (var17[0])).getClassLoader()) {
                                    throw new SecurityException();
                                  } else {
                                    break L9;
                                  }
                                } else {
                                  break L9;
                                }
                              }
                              var9.field_e = ((Class) (var17[0])).getDeclaredMethod((String) (var17[1]), (Class[]) (var17[2]));
                              break L7;
                            } else {
                              if (-10 == (var2_int ^ -1)) {
                                L10: {
                                  var16 = (Object[]) (var9.field_g);
                                  if (!this.field_k) {
                                    break L10;
                                  } else {
                                    if (null == ((Class) (var16[0])).getClassLoader()) {
                                      throw new SecurityException();
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                var9.field_e = ((Class) (var16[0])).getDeclaredField((String) (var16[1]));
                                break L7;
                              } else {
                                if (-19 == (var2_int ^ -1)) {
                                  var15 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var9.field_e = var15.getContents((Object) null);
                                  break L7;
                                } else {
                                  if (-20 == (var2_int ^ -1)) {
                                    var7 = (java.awt.datatransfer.Transferable) (var9.field_g);
                                    var14 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var14.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L7;
                                  } else {
                                    if (this.field_k) {
                                      if (var2_int != 3) {
                                        if (21 == var2_int) {
                                          if ((rl.a((byte) -113) ^ -1L) > (field_h ^ -1L)) {
                                            throw new IOException();
                                          } else {
                                            var9.field_e = java.net.InetAddress.getByName((String) (var9.field_g)).getAddress();
                                            break L7;
                                          }
                                        } else {
                                          if (-6 != (var2_int ^ -1)) {
                                            if (6 == var2_int) {
                                              var13 = new java.awt.Frame("Jagex Full Screen");
                                              var9.field_e = var13;
                                              var13.setResizable(false);
                                              if (!this.field_i) {
                                                Class.forName("ak").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_j, new Object[]{var13, new Integer(var9.field_a >>> -319609520), new Integer(65535 & var9.field_a), new Integer(var9.field_b >> 1753778736), new Integer(var9.field_b & 65535)});
                                                break L7;
                                              } else {
                                                this.field_f.a(var13, var9.field_a & 65535, 83, var9.field_a >>> -962755728, var9.field_b >> -1047858096, 65535 & var9.field_b);
                                                break L7;
                                              }
                                            } else {
                                              if (7 != var2_int) {
                                                if (12 != var2_int) {
                                                  if ((var2_int ^ -1) == -14) {
                                                    var3_ref2 = sj.a((String) (var9.field_g), field_r, false, "");
                                                    var9.field_e = var3_ref2;
                                                    break L7;
                                                  } else {
                                                    L11: {
                                                      if (!this.field_k) {
                                                        break L11;
                                                      } else {
                                                        if ((var2_int ^ -1) == -15) {
                                                          var3_int = var9.field_a;
                                                          var4 = var9.field_b;
                                                          if (this.field_i) {
                                                            this.field_m.a(-12384, var4, var3_int);
                                                            break L7;
                                                          } else {
                                                            Class.forName("vg").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_p, new Object[]{new Integer(var3_int), new Integer(var4)});
                                                            break L7;
                                                          }
                                                        } else {
                                                          break L11;
                                                        }
                                                      }
                                                    }
                                                    L12: {
                                                      if (!this.field_k) {
                                                        break L12;
                                                      } else {
                                                        if ((var2_int ^ -1) == -16) {
                                                          L13: {
                                                            if (0 == var9.field_a) {
                                                              stackIn_78_0 = 0;
                                                              break L13;
                                                            } else {
                                                              stackIn_78_0 = 1;
                                                              break L13;
                                                            }
                                                          }
                                                          var3_int = stackIn_78_0;
                                                          var12 = (java.awt.Component) (var9.field_g);
                                                          if (this.field_i) {
                                                            this.field_m.a(-11888, var3_int != 0, var12);
                                                            break L7;
                                                          } else {
                                                            Class.forName("vg").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_p, new Object[]{var12, new Boolean(var3_int != 0)});
                                                            break L7;
                                                          }
                                                        } else {
                                                          break L12;
                                                        }
                                                      }
                                                    }
                                                    L14: {
                                                      if (this.field_i) {
                                                        break L14;
                                                      } else {
                                                        if (-18 == (var2_int ^ -1)) {
                                                          var11 = (Object[]) (var9.field_g);
                                                          Class.forName("vg").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_p, new Object[]{var11[0], var11[1], new Integer(var9.field_a), new Integer(var9.field_b), var11[2]});
                                                          break L7;
                                                        } else {
                                                          break L14;
                                                        }
                                                      }
                                                    }
                                                    if (-17 != (var2_int ^ -1)) {
                                                      throw sj.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    } else {
                                                      try {
                                                        L15: {
                                                          if (!field_w.startsWith("win")) {
                                                            throw sj.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          } else {
                                                            L16: {
                                                              var8 = (String) (var9.field_g);
                                                              if (var8.startsWith("http://")) {
                                                                break L16;
                                                              } else {
                                                                if (!var8.startsWith("https://")) {
                                                                  throw sj.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  break L16;
                                                                }
                                                              }
                                                            }
                                                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L17: while (true) {
                                                              if (var5 >= var8.length()) {
                                                                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var8 + "\"");
                                                                var9.field_e = null;
                                                                break L15;
                                                              } else {
                                                                if ((var4_ref_String.indexOf((int) var8.charAt(var5)) ^ -1) != 0) {
                                                                  var5++;
                                                                  continue L17;
                                                                } else {
                                                                  throw sj.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                                                        decompiledCaughtException = decompiledCaughtParameter2;
                                                        var3_ref3 = (Exception) (Object) decompiledCaughtException;
                                                        var9.field_e = var3_ref3;
                                                        throw sj.<RuntimeException>$cfr$sneakyThrow(var3_ref3);
                                                      }
                                                      break L7;
                                                    }
                                                  }
                                                } else {
                                                  var3_ref2 = sj.a((String) (var9.field_g), field_r, false, field_d);
                                                  var9.field_e = var3_ref2;
                                                  break L7;
                                                }
                                              } else {
                                                if (this.field_i) {
                                                  this.field_f.a(0, (java.awt.Frame) (var9.field_g));
                                                  break L7;
                                                } else {
                                                  Class.forName("ak").getMethod("exit", new Class[]{}).invoke(this.field_j, new Object[]{});
                                                  break L7;
                                                }
                                              }
                                            }
                                          } else {
                                            if (!this.field_i) {
                                              var9.field_e = Class.forName("ak").getMethod("listmodes", new Class[]{}).invoke(this.field_j, new Object[]{});
                                              break L7;
                                            } else {
                                              var9.field_e = this.field_f.a(true);
                                              break L7;
                                            }
                                          }
                                        }
                                      } else {
                                        if (rl.a((byte) -97) >= field_h) {
                                          var10 = (255 & var9.field_a >> -1536750632) + "." + (var9.field_a >> 297912688 & 255) + "." + ((var9.field_a & 65341) >> -1436418072) + "." + (255 & var9.field_a);
                                          var9.field_e = java.net.InetAddress.getByName(var10).getHostName();
                                          break L7;
                                        } else {
                                          throw new IOException();
                                        }
                                      }
                                    } else {
                                      throw sj.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      if (rl.a((byte) -124) < field_h) {
                        throw new IOException();
                      } else {
                        var9.field_e = new java.net.Socket(java.net.InetAddress.getByName((String) (var9.field_g)), var9.field_a);
                        break L7;
                      }
                    }
                  }
                  var9.field_f = 1;
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
                  var9.field_f = 2;
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

    final le a(Class param0, String param1, byte param2) {
        if (param2 != -88) {
            return (le) null;
        }
        return this.a(9, 0, false, new Object[]{param0, param1}, 0);
    }

    private final le a(int param0, int param1, boolean param2, Object param3, int param4) {
        le var6 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        var6 = new le();
        var6.field_d = param0;
        var6.field_g = param3;
        var6.field_b = param4;
        var6.field_a = param1;
        var7 = this;
        synchronized (var7) {
          L0: {
            L1: {
              if (this.field_l == null) {
                this.field_c = var6;
                this.field_l = var6;
                break L1;
              } else {
                this.field_l.field_c = var6;
                this.field_l = var6;
                break L1;
              }
            }
            L2: {
              this.notify();
              if (!param2) {
                break L2;
              } else {
                this.a(-56, -20, -46, 113, (byte) -46);
                break L2;
              }
            }
            break L0;
          }
        }
        return var6;
    }

    final le a(java.awt.Frame param0, boolean param1) {
        if (param1) {
            this.field_l = (le) null;
        }
        return this.a(7, 0, false, param0, 0);
    }

    final le a(int param0) {
        if (param0 < 83) {
            return (le) null;
        }
        return this.a(5, 0, false, (Object) null, 0);
    }

    final le a(int param0, int param1, int param2, int param3, byte param4) {
        if (param4 != 85) {
            this.a(false);
        }
        return this.a(6, (param1 << -1721400176) - -param0, false, (Object) null, (param3 << -5297488) - -param2);
    }

    final boolean a(byte param0) {
        if (param0 < 104) {
            return false;
        }
        if (!this.field_k) {
            return false;
        }
        if (!this.field_i) {
            return null != this.field_j ? true : false;
        }
        return this.field_f != null ? true : false;
    }

    final le a(byte param0, Class param1, Class[] param2, String param3) {
        if (param0 < 12) {
            this.field_b = (v) null;
        }
        return this.a(8, 0, false, new Object[]{param1, param3, param2}, 0);
    }

    final le a(String param0, int param1, int param2) {
        if (param2 != 0) {
            java.awt.Component var5 = (java.awt.Component) null;
            this.a(true, (byte) -21, (java.awt.Component) null);
        }
        return this.a(param1, param0, false, (byte) -123);
    }

    private final le a(int param0, String param1, boolean param2, byte param3) {
        if (param3 > -104) {
            this.field_k = false;
        }
        return this.a(param2 ? 22 : 1, param0, false, param1, 0);
    }

    final void a(boolean param0) {
        try {
            Object stackIn_3_0 = null;
            Object stackIn_4_0 = null;
            int stackIn_4_1 = 0;
            Throwable decompiledCaughtException = null;
            Object var2 = null;
            InterruptedException var2_ref = null;
            IOException var2_ref2 = null;
            int var2_int = 0;
            IOException var3 = null;
            var2 = this;
            synchronized (var2) {
              L0: {
                L1: {
                  stackIn_3_0 = this;

                  if (!param0) {
                    stackIn_4_0 = this;
                    stackIn_4_1 = 0;
                    break L1;
                  } else {
                    stackIn_4_0 = this;
                    stackIn_4_1 = 1;
                    break L1;
                  }
                }
                ((sj) (this)).field_u = stackIn_4_1 != 0;
                this.notifyAll();
                break L0;
              }
            }
            try {
              L2: {
                this.field_s.join();
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
              if (null != this.field_x) {
                try {
                  L5: {
                    this.field_x.c((byte) 94);
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
              } else {
                break L4;
              }
            }
            L7: {
              if (this.field_e == null) {
                break L7;
              } else {
                try {
                  L8: {
                    this.field_e.c((byte) 110);
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
              if (null != this.field_n) {
                var2_int = 0;
                L11: while (true) {
                  if (this.field_n.length <= var2_int) {
                    break L10;
                  } else {
                    if (this.field_n[var2_int] != null) {
                      try {
                        L12: {
                          this.field_n[var2_int].c((byte) 115);
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
              if (this.field_b != null) {
                try {
                  L15: {
                    this.field_b.c((byte) 107);
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
              } else {
                break L14;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final le a(java.net.URL param0, int param1) {
        if (param1 != 1) {
            field_h = -125L;
        }
        return this.a(4, 0, false, param0, 0);
    }

    sj(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception exception = null;
        Throwable throwable = null;
        int var5_int = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Throwable decompiledCaughtException = null;
        ce var7 = null;
        L0: {
          this.field_c = null;
          this.field_u = false;
          this.field_b = null;
          this.field_x = null;
          this.field_e = null;
          this.field_l = null;
          this.field_i = false;
          this.field_k = false;
          field_o = "Unknown";
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
        ((sj) (this)).field_k = stackIn_3_1 != 0;
        field_r = param0;
        field_d = param1;
        field_t = "1.1";
        try {
          L1: {
            field_o = System.getProperty("java.vendor");
            field_t = System.getProperty("java.version");
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
          if (0 == (field_o.toLowerCase().indexOf("microsoft") ^ -1)) {
            break L3;
          } else {
            this.field_i = true;
            break L3;
          }
        }
        try {
          L4: {
            field_g = System.getProperty("os.name");
            break L4;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            exception = (Exception) (Object) decompiledCaughtException;
            field_g = "Unknown";
            break L5;
          }
        }
        field_w = field_g.toLowerCase();
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
              field_v = System.getProperty("user.home");
              if (field_v == null) {
                break L11;
              } else {
                field_v = field_v + "/";
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
          if (field_v == null) {
            field_v = "~/";
            break L13;
          } else {
            break L13;
          }
        }
        try {
          L14: {
            this.field_a = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
          if (this.field_i) {
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
                field_q = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
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
          nh.a(field_r, field_d, 25617);
          if (!this.field_k) {
            break L21;
          } else {
            this.field_b = new v(nh.a("random.dat", (String) null, field_r, (byte) 109), "rw", 25L);
            this.field_x = new v(nh.a("main_file_cache.dat2", -126), "rw", 314572800L);
            this.field_e = new v(nh.a("main_file_cache.idx255", -128), "rw", 1048576L);
            this.field_n = new v[param2];
            var5_int = 0;
            L22: while (true) {
              if (var5_int >= param2) {
                L23: {
                  if (!this.field_i) {
                    break L23;
                  } else {
                    try {
                      L24: {
                        Class.forName("fi").newInstance();
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
                      if (this.field_i) {
                        var7 = new ce();
                        this.field_f = var7;
                        break L27;
                      } else {
                        this.field_j = Class.forName("ak").newInstance();
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
                      if (this.field_i) {
                        this.field_m = new dc();
                        break L30;
                      } else {
                        this.field_p = Class.forName("vg").newInstance();
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
                this.field_n[var5_int] = new v(nh.a("main_file_cache.idx" + var5_int, -126), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        this.field_u = false;
        this.field_s = new Thread((Runnable) (this));
        this.field_s.setPriority(10);
        this.field_s.setDaemon(true);
        this.field_s.start();
    }

    final le a(java.awt.Component param0, int param1, int param2, int param3) {
        if (param2 >= -54) {
            return (le) null;
        }
        java.awt.Point var5 = param0.getLocationOnScreen();
        return this.a(14, param1 + var5.x, false, (Object) null, param3 - -var5.y);
    }

    static {
        field_h = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
