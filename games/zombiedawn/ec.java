/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ec implements Runnable {
    qn[] field_q;
    java.awt.EventQueue field_x;
    private op field_a;
    private Object field_l;
    private boolean field_w;
    private Thread field_f;
    qn field_b;
    private go field_m;
    qn field_i;
    private static String field_r;
    private static volatile long field_j;
    private Object field_o;
    private th field_v;
    static String field_n;
    static java.lang.reflect.Method field_d;
    static String field_h;
    private boolean field_u;
    boolean field_t;
    private static String field_p;
    private op field_k;
    private static String field_s;
    static String field_g;
    qn field_e;
    private static int field_c;

    final boolean c(int param0) {
        if (!(this.field_t)) {
            return false;
        }
        if (param0 != 10) {
            return false;
        }
        if (this.field_u) {
            return null != this.field_m ? true : false;
        }
        return this.field_o != null ? true : false;
    }

    final op a(int param0, int param1, int param2, int param3, int param4) {
        op discarded$0 = null;
        if (param1 != 1525233840) {
            String var7 = (String) null;
            discarded$0 = this.a((String) null, -122, true, 56);
        }
        return this.a((byte) 61, (param4 << 1525233840) - -param2, 6, (param0 << 984950288) - -param3, (Object) null);
    }

    final op a(java.awt.Frame param0, byte param1) {
        if (param1 <= 4) {
            return (op) null;
        }
        return this.a((byte) 61, 0, 7, 0, param0);
    }

    final op a(int param0, java.net.URL param1) {
        if (param0 != 7645) {
            return (op) null;
        }
        return this.a((byte) 61, 0, 4, 0, param1);
    }

    final op a(int param0) {
        if (param0 != -1) {
            return (op) null;
        }
        return this.a((byte) 61, 0, 5, 0, (Object) null);
    }

    private final op a(byte param0, int param1, int param2, int param3, Object param4) {
        op var6 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        L0: {
          var6 = new op();
          if (param0 == 61) {
            break L0;
          } else {
            this.field_x = (java.awt.EventQueue) null;
            break L0;
          }
        }
        var6.field_g = param1;
        var6.field_e = param4;
        var6.field_a = param2;
        var6.field_c = param3;
        var7 = this;
        synchronized (var7) {
          L1: {
            L2: {
              if (this.field_a == null) {
                this.field_k = var6;
                this.field_a = var6;
                break L2;
              } else {
                this.field_a.field_b = var6;
                this.field_a = var6;
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
            int stackIn_71_0 = 0;
            Throwable decompiledCaughtException = null;
            Object var2 = null;
            int var2_int = 0;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            InterruptedException var3 = null;
            qn var3_ref = null;
            int var3_int = 0;
            Exception var3_ref2 = null;
            dg var3_ref3 = null;
            int var4_int = 0;
            String var4 = null;
            int var5 = 0;
            java.awt.datatransfer.Transferable var7 = null;
            op var8 = null;
            String var9 = null;
            java.awt.Frame var10 = null;
            java.awt.Component var11 = null;
            String var12 = null;
            Object[] var13 = null;
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
                    if (this.field_w) {
                      return;
                    } else {
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
                          this.field_k = this.field_k.field_b;
                          if (this.field_k == null) {
                            this.field_a = null;
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
                    if ((var2_int ^ -1) != -2) {
                      if (-23 != (var2_int ^ -1)) {
                        if ((var2_int ^ -1) == -3) {
                          var18 = new Thread((Runnable) (var8.field_e));
                          var18.setDaemon(true);
                          var18.start();
                          var18.setPriority(var8.field_g);
                          var8.field_d = var18;
                          break L7;
                        } else {
                          if (-5 != (var2_int ^ -1)) {
                            if (-9 == (var2_int ^ -1)) {
                              L8: {
                                var17 = (Object[]) (var8.field_e);
                                if (this.field_t) {
                                  if (((Class) (var17[0])).getClassLoader() != null) {
                                    break L8;
                                  } else {
                                    throw new SecurityException();
                                  }
                                } else {
                                  break L8;
                                }
                              }
                              var8.field_d = ((Class) (var17[0])).getDeclaredMethod((String) (var17[1]), (Class[]) (var17[2]));
                              break L7;
                            } else {
                              if (var2_int == 9) {
                                L9: {
                                  var16 = (Object[]) (var8.field_e);
                                  if (this.field_t) {
                                    if (null == ((Class) (var16[0])).getClassLoader()) {
                                      throw new SecurityException();
                                    } else {
                                      break L9;
                                    }
                                  } else {
                                    break L9;
                                  }
                                }
                                var8.field_d = ((Class) (var16[0])).getDeclaredField((String) (var16[1]));
                                break L7;
                              } else {
                                if (-19 == (var2_int ^ -1)) {
                                  var15 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8.field_d = var15.getContents((Object) null);
                                  break L7;
                                } else {
                                  if ((var2_int ^ -1) == -20) {
                                    var7 = (java.awt.datatransfer.Transferable) (var8.field_e);
                                    var14 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var14.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L7;
                                  } else {
                                    if (this.field_t) {
                                      if ((var2_int ^ -1) != -4) {
                                        if (var2_int != 21) {
                                          if ((var2_int ^ -1) != -6) {
                                            if (6 != var2_int) {
                                              if (var2_int == 7) {
                                                if (!this.field_u) {
                                                  Class.forName("bk").getMethod("exit", new Class[]{}).invoke(this.field_o, new Object[]{});
                                                  break L7;
                                                } else {
                                                  this.field_m.a((java.awt.Frame) (var8.field_e), 6411);
                                                  break L7;
                                                }
                                              } else {
                                                if (12 != var2_int) {
                                                  if (var2_int == 13) {
                                                    var3_ref = ec.a((String) (var8.field_e), (byte) -44, field_c, "");
                                                    var8.field_d = var3_ref;
                                                    break L7;
                                                  } else {
                                                    L10: {
                                                      if (!this.field_t) {
                                                        break L10;
                                                      } else {
                                                        if (var2_int != 14) {
                                                          break L10;
                                                        } else {
                                                          var3_int = var8.field_g;
                                                          var4_int = var8.field_c;
                                                          if (this.field_u) {
                                                            this.field_v.a(var4_int, var3_int, (byte) -70);
                                                            break L7;
                                                          } else {
                                                            Class.forName("jn").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_l, new Object[]{new Integer(var3_int), new Integer(var4_int)});
                                                            break L7;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L11: {
                                                      if (!this.field_t) {
                                                        break L11;
                                                      } else {
                                                        if (var2_int != 15) {
                                                          break L11;
                                                        } else {
                                                          L12: {
                                                            if (0 == var8.field_g) {
                                                              stackIn_71_0 = 0;
                                                              break L12;
                                                            } else {
                                                              stackIn_71_0 = 1;
                                                              break L12;
                                                            }
                                                          }
                                                          var3_int = stackIn_71_0;
                                                          var11 = (java.awt.Component) (var8.field_e);
                                                          if (this.field_u) {
                                                            this.field_v.a(var11, true, var3_int != 0);
                                                            break L7;
                                                          } else {
                                                            Class.forName("jn").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_l, new Object[]{var11, new Boolean(var3_int != 0)});
                                                            break L7;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L13: {
                                                      if (this.field_u) {
                                                        break L13;
                                                      } else {
                                                        if (17 == var2_int) {
                                                          var13 = (Object[]) (var8.field_e);
                                                          Class.forName("jn").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_l, new Object[]{var13[0], var13[1], new Integer(var8.field_g), new Integer(var8.field_c), var13[2]});
                                                          break L7;
                                                        } else {
                                                          break L13;
                                                        }
                                                      }
                                                    }
                                                    if ((var2_int ^ -1) != -17) {
                                                      throw ec.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    } else {
                                                      try {
                                                        L14: {
                                                          if (field_n.startsWith("win")) {
                                                            L15: {
                                                              var12 = (String) (var8.field_e);
                                                              if (var12.startsWith("http://")) {
                                                                break L15;
                                                              } else {
                                                                if (!var12.startsWith("https://")) {
                                                                  throw ec.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  break L15;
                                                                }
                                                              }
                                                            }
                                                            var4 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L16: while (true) {
                                                              if (var12.length() <= var5) {
                                                                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var12 + "\"");
                                                                var8.field_d = null;
                                                                break L14;
                                                              } else {
                                                                if (-1 != var4.indexOf((int) var12.charAt(var5))) {
                                                                  var5++;
                                                                  continue L16;
                                                                } else {
                                                                  throw ec.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            throw ec.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter1) {
                                                        decompiledCaughtException = decompiledCaughtParameter1;
                                                        var3_ref2 = (Exception) (Object) decompiledCaughtException;
                                                        var8.field_d = var3_ref2;
                                                        throw ec.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                                                      }
                                                      break L7;
                                                    }
                                                  }
                                                } else {
                                                  var3_ref = ec.a((String) (var8.field_e), (byte) -44, field_c, field_s);
                                                  var8.field_d = var3_ref;
                                                  break L7;
                                                }
                                              }
                                            } else {
                                              var10 = new java.awt.Frame("Jagex Full Screen");
                                              var8.field_d = var10;
                                              var10.setResizable(false);
                                              if (!this.field_u) {
                                                Class.forName("bk").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_o, new Object[]{var10, new Integer(var8.field_g >>> -1453176208), new Integer(65535 & var8.field_g), new Integer(var8.field_c >> 2014558192), new Integer(65535 & var8.field_c)});
                                                break L7;
                                              } else {
                                                this.field_m.a(var8.field_c >> -2062190256, var8.field_g >>> -164416560, 65535 & var8.field_c, 65535 & var8.field_g, (byte) 81, var10);
                                                break L7;
                                              }
                                            }
                                          } else {
                                            if (!this.field_u) {
                                              var8.field_d = Class.forName("bk").getMethod("listmodes", new Class[]{}).invoke(this.field_o, new Object[]{});
                                              break L7;
                                            } else {
                                              var8.field_d = this.field_m.a(8);
                                              break L7;
                                            }
                                          }
                                        } else {
                                          if (pd.a(-22826) < field_j) {
                                            throw new IOException();
                                          } else {
                                            var8.field_d = java.net.InetAddress.getByName((String) (var8.field_e)).getAddress();
                                            break L7;
                                          }
                                        }
                                      } else {
                                        if (pd.a(-22826) < field_j) {
                                          throw new IOException();
                                        } else {
                                          var9 = (255 & var8.field_g >> 467451928) + "." + (255 & var8.field_g >> -1402564112) + "." + ((65496 & var8.field_g) >> 1648328424) + "." + (255 & var8.field_g);
                                          var8.field_d = java.net.InetAddress.getByName(var9).getHostName();
                                          break L7;
                                        }
                                      }
                                    } else {
                                      throw ec.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            if (pd.a(-22826) >= field_j) {
                              var8.field_d = new DataInputStream(((java.net.URL) (var8.field_e)).openStream());
                              break L7;
                            } else {
                              throw new IOException();
                            }
                          }
                        }
                      } else {
                        if ((field_j ^ -1L) < (pd.a(-22826) ^ -1L)) {
                          throw new IOException();
                        } else {
                          try {
                              if (false) throw (dg) null;
                            L17: {
                              var8.field_d = ud.a((String) (var8.field_e), (byte) 68, var8.field_g).a(false);
                              break L17;
                            }
                          } catch (dg decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref3 = (dg) (Object) decompiledCaughtException;
                            var8.field_d = var3_ref3.getMessage();
                            throw var3_ref3;
                          }
                          break L7;
                        }
                      }
                    } else {
                      if ((field_j ^ -1L) < (pd.a(-22826) ^ -1L)) {
                        throw new IOException();
                      } else {
                        var8.field_d = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.field_e)), var8.field_g);
                        break L7;
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

    final op a(int param0, String param1, int param2) {
        op discarded$0 = null;
        if (param0 != 2) {
            String var5 = (String) null;
            discarded$0 = this.a((String) null, 28, true, -32);
        }
        return this.a(param1, param2, false, -124);
    }

    final op a(byte param0, String param1, Class param2) {
        if (param0 != -113) {
            Runnable var5 = (Runnable) null;
            this.a(50, (Runnable) null, false);
        }
        return this.a((byte) 61, 0, 9, 0, new Object[]{param2, param1});
    }

    private final op a(String param0, int param1, boolean param2, int param3) {
        int var5 = 28 / ((param3 - -56) / 58);
        return this.a((byte) 61, param1, !param2 ? 1 : 22, 0, param0);
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
                this.field_w = true;
                this.notifyAll();
                break L0;
              }
            }
            try {
              L1: {
                L2: {
                  if (param0 == 0) {
                    break L2;
                  } else {
                    field_d = (java.lang.reflect.Method) null;
                    break L2;
                  }
                }
                this.field_f.join();
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
              if (this.field_e != null) {
                try {
                  L5: {
                    this.field_e.c(-97);
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
              if (null != this.field_i) {
                try {
                  L8: {
                    this.field_i.c(param0 + -107);
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
              if (this.field_q != null) {
                var2_int = 0;
                L11: while (true) {
                  if (this.field_q.length <= var2_int) {
                    break L10;
                  } else {
                    if (this.field_q[var2_int] != null) {
                      try {
                        L12: {
                          this.field_q[var2_int].c(param0 + -73);
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
              if (null == this.field_b) {
                break L14;
              } else {
                try {
                  L15: {
                    this.field_b.c(param0 + -79);
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

    private final static qn a(String param0, byte param1, int param2, String param3) {
        try {
            qn stackIn_14_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            String var7 = null;
            qn var8 = null;
            Exception var8_ref = null;
            String var9 = null;
            L0: {
              if (param1 == -44) {
                break L0;
              } else {
                var9 = (String) null;
                ec.a((String) null, (byte) -111, 37, (String) null);
                break L0;
              }
            }
            L1: {
              if (33 == param2) {
                var4 = "jagex_" + param3 + "_preferences" + param0 + "_rc.dat";
                break L1;
              } else {
                if (param2 != 34) {
                  var4 = "jagex_" + param3 + "_preferences" + param0 + ".dat";
                  break L1;
                } else {
                  var4 = "jagex_" + param3 + "_preferences" + param0 + "_wip.dat";
                  break L1;
                }
              }
            }
            var5 = new String[]{"c:/rscache/", "/rscache/", field_r, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            var6 = 0;
            L2: while (true) {
              if (var5.length > var6) {
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
                    var8 = new qn(new File(var7, var4), "rw", 10000L);
                    stackIn_14_0 = (qn) (var8);
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
                  return stackIn_14_0;
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

    final op a(Class[] param0, Class param1, int param2, String param3) {
        if (param2 != 255) {
            this.field_q = (qn[]) null;
        }
        return this.a((byte) 61, 0, 8, 0, new Object[]{param1, param3, param0});
    }

    ec(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception exception = null;
        Throwable throwable = null;
        int var5_int = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Throwable decompiledCaughtException = null;
        go var6 = null;
        L0: {
          this.field_a = null;
          this.field_i = null;
          this.field_t = false;
          this.field_b = null;
          this.field_u = false;
          this.field_w = false;
          this.field_k = null;
          this.field_e = null;
          field_s = param1;
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
        ((ec) (this)).field_t = stackIn_3_1 != 0;
        field_c = param0;
        field_g = "1.1";
        field_h = "Unknown";
        try {
          L1: {
            field_h = System.getProperty("java.vendor");
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
          if (field_h.toLowerCase().indexOf("microsoft") == -1) {
            break L3;
          } else {
            this.field_u = true;
            break L3;
          }
        }
        try {
          L4: {
            field_p = System.getProperty("os.name");
            break L4;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            exception = (Exception) (Object) decompiledCaughtException;
            field_p = "Unknown";
            break L5;
          }
        }
        field_n = field_p.toLowerCase();
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
              field_r = System.getProperty("user.home");
              if (null == field_r) {
                break L11;
              } else {
                field_r = field_r + "/";
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
          if (null == field_r) {
            field_r = "~/";
            break L13;
          } else {
            break L13;
          }
        }
        try {
          L14: {
            this.field_x = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
          if (this.field_u) {
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
                field_d = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
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
          gh.a(field_c, (byte) 127, field_s);
          if (!this.field_t) {
            break L21;
          } else {
            this.field_b = new qn(gh.a((String) null, field_c, (byte) 21, "random.dat"), "rw", 25L);
            this.field_e = new qn(gh.a(-71, "main_file_cache.dat2"), "rw", 314572800L);
            this.field_i = new qn(gh.a(-115, "main_file_cache.idx255"), "rw", 1048576L);
            this.field_q = new qn[param2];
            var5_int = 0;
            L22: while (true) {
              if (var5_int >= param2) {
                L23: {
                  if (this.field_u) {
                    try {
                      L24: {
                        Class.forName("db").newInstance();
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
                      if (!this.field_u) {
                        this.field_o = Class.forName("bk").newInstance();
                        break L27;
                      } else {
                        var6 = new go();
                        this.field_m = var6;
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
                      if (!this.field_u) {
                        this.field_l = Class.forName("jn").newInstance();
                        break L30;
                      } else {
                        this.field_v = new th();
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
                this.field_q[var5_int] = new qn(gh.a(-97, "main_file_cache.idx" + var5_int), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        this.field_w = false;
        this.field_f = new Thread((Runnable) (this));
        this.field_f.setPriority(10);
        this.field_f.setDaemon(true);
        this.field_f.start();
    }

    final op a(int param0, Runnable param1, boolean param2) {
        if (!param2) {
            String var5 = (String) null;
            this.a(-51, (String) null, -36);
        }
        return this.a((byte) 61, param0, 2, 0, param1);
    }

    static {
        field_j = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
