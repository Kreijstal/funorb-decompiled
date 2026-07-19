/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class d implements Runnable {
    private static String field_x;
    static java.lang.reflect.Method field_v;
    pa field_s;
    private cb field_d;
    java.awt.EventQueue field_q;
    static String field_t;
    private cb field_g;
    pa field_n;
    private static volatile long field_m;
    private Object field_u;
    private ie field_w;
    private static int field_f;
    pa field_j;
    pa[] field_r;
    private Thread field_i;
    static String field_b;
    private boolean field_h;
    static String field_o;
    private Object field_e;
    private tg field_a;
    private boolean field_l;
    private boolean field_c;
    private static String field_p;
    private static String field_k;

    final cb a(int param0) {
        pa discarded$0 = null;
        if (param0 != 34) {
            String var3 = (String) null;
            discarded$0 = d.a((byte) 23, 7, (String) null, (String) null);
        }
        return this.a(1, (Object) null, 0, 5, 0);
    }

    final cb a(java.awt.Frame param0, int param1) {
        if (param1 != 0) {
            return (cb) null;
        }
        return this.a(1, param0, 0, 7, 0);
    }

    final boolean b(int param0) {
        if (param0 != -26098) {
            return false;
        }
        if (!this.field_h) {
            return false;
        }
        if (!this.field_l) {
            return null != this.field_e ? true : false;
        }
        return this.field_w != null ? true : false;
    }

    public final void run() {
        try {
            Object discarded$6 = null;
            Object discarded$7 = null;
            Object discarded$8 = null;
            Object discarded$9 = null;
            Object discarded$10 = null;
            Process discarded$11 = null;
            Object var2 = null;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            bd var3_ref = null;
            Exception var3_ref2 = null;
            pa var3_ref3 = null;
            int var3_int = 0;
            Throwable var4 = null;
            int var4_int = 0;
            String var4_ref = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            String var8 = null;
            Object var9 = null;
            cb var9_ref = null;
            Thread var10 = null;
            Object[] var11 = null;
            java.awt.Component var12 = null;
            java.awt.Frame var13 = null;
            String var14 = null;
            java.awt.datatransfer.Clipboard var15 = null;
            java.awt.datatransfer.Clipboard var16 = null;
            Object[] var17 = null;
            Object[] var18 = null;
            int stackIn_76_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_75_0 = 0;
            int stackOut_74_0 = 0;
            L0: while (true) {
              synchronized (var2) {
                L1: {
                  var9_ref.notify();
                  var2 = this;
                  break L1;
                }
              }
              synchronized (var2) {
                L2: {
                  L3: while (true) {
                    if (this.field_c) {
                      return;
                    } else {
                      if (this.field_d == null) {
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
                        continue L3;
                      } else {
                        L6: {
                          var9_ref = this.field_d;
                          this.field_d = this.field_d.field_e;
                          if (null == this.field_d) {
                            this.field_g = null;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        break L2;
                      }
                    }
                  }
                }
              }
              try {
                L7: {
                  L8: {
                    var2_int = var9_ref.field_d;
                    if (1 != var2_int) {
                      if (-23 != (var2_int ^ -1)) {
                        if ((var2_int ^ -1) != -3) {
                          if (4 == var2_int) {
                            if (oa.a(-12520) < field_m) {
                              throw new IOException();
                            } else {
                              var9_ref.field_b = new DataInputStream(((java.net.URL) (var9_ref.field_f)).openStream());
                              break L8;
                            }
                          } else {
                            if ((var2_int ^ -1) == -9) {
                              L9: {
                                var18 = (Object[]) (var9_ref.field_f);
                                if (!this.field_h) {
                                  break L9;
                                } else {
                                  if (((Class) (var18[0])).getClassLoader() == null) {
                                    throw new SecurityException();
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              var9_ref.field_b = ((Class) (var18[0])).getDeclaredMethod((String) (var18[1]), (Class[]) (var18[2]));
                              break L8;
                            } else {
                              if ((var2_int ^ -1) == -10) {
                                L10: {
                                  var17 = (Object[]) (var9_ref.field_f);
                                  if (!this.field_h) {
                                    break L10;
                                  } else {
                                    if (null != ((Class) (var17[0])).getClassLoader()) {
                                      break L10;
                                    } else {
                                      throw new SecurityException();
                                    }
                                  }
                                }
                                var9_ref.field_b = ((Class) (var17[0])).getDeclaredField((String) (var17[1]));
                                break L8;
                              } else {
                                if (18 == var2_int) {
                                  var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var9_ref.field_b = var16.getContents((Object) null);
                                  break L8;
                                } else {
                                  if (var2_int == 19) {
                                    var7 = (java.awt.datatransfer.Transferable) (var9_ref.field_f);
                                    var15 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var15.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L8;
                                  } else {
                                    if (!this.field_h) {
                                      throw d.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    } else {
                                      if (-4 == (var2_int ^ -1)) {
                                        if ((oa.a(-12520) ^ -1L) > (field_m ^ -1L)) {
                                          throw new IOException();
                                        } else {
                                          var14 = (255 & var9_ref.field_c >> -411661352) + "." + ((var9_ref.field_c & 16718053) >> -1690845136) + "." + (var9_ref.field_c >> -2059917432 & 255) + "." + (255 & var9_ref.field_c);
                                          var9_ref.field_b = java.net.InetAddress.getByName(var14).getHostName();
                                          break L8;
                                        }
                                      } else {
                                        if (-22 == (var2_int ^ -1)) {
                                          if ((oa.a(-12520) ^ -1L) <= (field_m ^ -1L)) {
                                            var9_ref.field_b = java.net.InetAddress.getByName((String) (var9_ref.field_f)).getAddress();
                                            break L8;
                                          } else {
                                            throw new IOException();
                                          }
                                        } else {
                                          if (var2_int != 5) {
                                            if (6 == var2_int) {
                                              var13 = new java.awt.Frame("Jagex Full Screen");
                                              var9_ref.field_b = var13;
                                              var13.setResizable(false);
                                              if (this.field_l) {
                                                this.field_w.a(8, var9_ref.field_c >>> 1309967216, var13, var9_ref.field_g >> 1043765136, var9_ref.field_c & 65535, var9_ref.field_g & 65535);
                                                break L8;
                                              } else {
                                                discarded$6 = Class.forName("pd").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_e, new Object[]{var13, new Integer(var9_ref.field_c >>> 711185008), new Integer(var9_ref.field_c & 65535), new Integer(var9_ref.field_g >> 2054285520), new Integer(var9_ref.field_g & 65535)});
                                                break L8;
                                              }
                                            } else {
                                              if ((var2_int ^ -1) == -8) {
                                                if (this.field_l) {
                                                  this.field_w.a(111, (java.awt.Frame) (var9_ref.field_f));
                                                  break L8;
                                                } else {
                                                  discarded$7 = Class.forName("pd").getMethod("exit", new Class[]{}).invoke(this.field_e, new Object[]{});
                                                  break L8;
                                                }
                                              } else {
                                                if (12 == var2_int) {
                                                  var3_ref3 = d.a((byte) -103, field_f, field_p, (String) (var9_ref.field_f));
                                                  var9_ref.field_b = var3_ref3;
                                                  break L8;
                                                } else {
                                                  if ((var2_int ^ -1) == -14) {
                                                    var3_ref3 = d.a((byte) 19, field_f, "", (String) (var9_ref.field_f));
                                                    var9_ref.field_b = var3_ref3;
                                                    break L8;
                                                  } else {
                                                    L11: {
                                                      if (!this.field_h) {
                                                        break L11;
                                                      } else {
                                                        if (var2_int != 14) {
                                                          break L11;
                                                        } else {
                                                          var3_int = var9_ref.field_c;
                                                          var4_int = var9_ref.field_g;
                                                          if (!this.field_l) {
                                                            discarded$8 = Class.forName("tk").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_u, new Object[]{new Integer(var3_int), new Integer(var4_int)});
                                                            break L8;
                                                          } else {
                                                            this.field_a.a(-71, var4_int, var3_int);
                                                            break L8;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L12: {
                                                      if (!this.field_h) {
                                                        break L12;
                                                      } else {
                                                        if (var2_int == 15) {
                                                          L13: {
                                                            if (-1 == (var9_ref.field_c ^ -1)) {
                                                              stackOut_75_0 = 0;
                                                              stackIn_76_0 = stackOut_75_0;
                                                              break L13;
                                                            } else {
                                                              stackOut_74_0 = 1;
                                                              stackIn_76_0 = stackOut_74_0;
                                                              break L13;
                                                            }
                                                          }
                                                          var3_int = stackIn_76_0;
                                                          var12 = (java.awt.Component) (var9_ref.field_f);
                                                          if (this.field_l) {
                                                            this.field_a.a(12758, var3_int != 0, var12);
                                                            break L8;
                                                          } else {
                                                            discarded$9 = Class.forName("tk").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_u, new Object[]{var12, new Boolean(var3_int != 0)});
                                                            break L8;
                                                          }
                                                        } else {
                                                          break L12;
                                                        }
                                                      }
                                                    }
                                                    L14: {
                                                      if (this.field_l) {
                                                        break L14;
                                                      } else {
                                                        if (-18 == (var2_int ^ -1)) {
                                                          var11 = (Object[]) (var9_ref.field_f);
                                                          discarded$10 = Class.forName("tk").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_u, new Object[]{var11[0], var11[1], new Integer(var9_ref.field_c), new Integer(var9_ref.field_g), var11[2]});
                                                          break L8;
                                                        } else {
                                                          break L14;
                                                        }
                                                      }
                                                    }
                                                    if ((var2_int ^ -1) != -17) {
                                                      throw d.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    } else {
                                                      try {
                                                        L15: {
                                                          if (field_b.startsWith("win")) {
                                                            L16: {
                                                              var8 = (String) (var9_ref.field_f);
                                                              if (var8.startsWith("http://")) {
                                                                break L16;
                                                              } else {
                                                                if (var8.startsWith("https://")) {
                                                                  break L16;
                                                                } else {
                                                                  throw d.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                            var4_ref = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L17: while (true) {
                                                              if (var5 >= var8.length()) {
                                                                discarded$11 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var8 + "\"");
                                                                var9_ref.field_b = null;
                                                                break L15;
                                                              } else {
                                                                if (-1 != var4_ref.indexOf((int) var8.charAt(var5))) {
                                                                  var5++;
                                                                  continue L17;
                                                                } else {
                                                                  throw d.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            throw d.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter1) {
                                                        decompiledCaughtException = decompiledCaughtParameter1;
                                                        var3_ref2 = (Exception) (Object) decompiledCaughtException;
                                                        var9_ref.field_b = var3_ref2;
                                                        throw d.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                                                      }
                                                      break L8;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            if (!this.field_l) {
                                              var9_ref.field_b = Class.forName("pd").getMethod("listmodes", new Class[]{}).invoke(this.field_e, new Object[]{});
                                              break L8;
                                            } else {
                                              var9_ref.field_b = this.field_w.a(8);
                                              break L8;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var10 = new Thread((Runnable) (var9_ref.field_f));
                          var10.setDaemon(true);
                          var10.start();
                          var10.setPriority(var9_ref.field_c);
                          var9_ref.field_b = var10;
                          break L8;
                        }
                      } else {
                        if (oa.a(-12520) >= field_m) {
                          try {
                              if (false) throw (bd) null;
                            L18: {
                              var9_ref.field_b = mk.a(-43, (String) (var9_ref.field_f), var9_ref.field_c).b(0);
                              break L18;
                            }
                          } catch (bd decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref = (bd) (Object) decompiledCaughtException;
                            var9_ref.field_b = var3_ref.getMessage();
                            throw var3_ref;
                          }
                          break L8;
                        } else {
                          throw new IOException();
                        }
                      }
                    } else {
                      if ((oa.a(-12520) ^ -1L) > (field_m ^ -1L)) {
                        throw new IOException();
                      } else {
                        var9_ref.field_b = new java.net.Socket(java.net.InetAddress.getByName((String) (var9_ref.field_f)), var9_ref.field_c);
                        break L8;
                      }
                    }
                  }
                  var9_ref.field_a = 1;
                  break L7;
                }
              } catch (java.lang.ThreadDeath decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var2_ref = (ThreadDeath) (Object) decompiledCaughtException;
                throw var2_ref;
              } catch (java.lang.Throwable decompiledCaughtParameter4) {
                decompiledCaughtException = decompiledCaughtParameter4;
                L19: {
                  var2_ref2 = decompiledCaughtException;
                  var9_ref.field_a = 2;
                  break L19;
                }
              }
              var2 = var9_ref;
              continue L0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final cb a(int param0, int param1, boolean param2, String param3) {
        if (param0 != 0) {
            this.field_j = (pa) null;
        }
        return this.a(1, param3, param1, param2 ? 22 : 1, 0);
    }

    final cb a(Runnable param0, int param1, int param2) {
        if (param1 != 0) {
            return (cb) null;
        }
        return this.a(param1 + 1, param0, param2, 2, 0);
    }

    private final static pa a(byte param0, int param1, String param2, String param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            int var7 = 0;
            String var8 = null;
            Exception var9 = null;
            pa var9_ref = null;
            pa stackIn_13_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            pa stackOut_12_0 = null;
            L0: {
              if (33 == param1) {
                var4 = "jagex_" + param2 + "_preferences" + param3 + "_rc.dat";
                break L0;
              } else {
                if (34 != param1) {
                  var4 = "jagex_" + param2 + "_preferences" + param3 + ".dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param2 + "_preferences" + param3 + "_wip.dat";
                  break L0;
                }
              }
            }
            var5_array = new String[]{"c:/rscache/", "/rscache/", field_x, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            var7 = -95 % ((-46 - param0) / 35);
            var6 = 0;
            L1: while (true) {
              if (var6 < var5_array.length) {
                L2: {
                  var8 = var5_array[var6];
                  if (0 >= var8.length()) {
                    break L2;
                  } else {
                    if (new File(var8).exists()) {
                      break L2;
                    } else {
                      var6++;
                      continue L1;
                    }
                  }
                }
                try {
                  L3: {
                    var9_ref = new pa(new File(var8, var4), "rw", 10000L);
                    stackOut_12_0 = (pa) (var9_ref);
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector0 = 0;
                    break L3;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var9 = (Exception) (Object) decompiledCaughtException;
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

    final void a(byte param0) {
        try {
            cb discarded$1 = null;
            Object var2 = null;
            InterruptedException var2_ref = null;
            IOException var2_ref2 = null;
            int var2_int = 0;
            Throwable var3 = null;
            IOException var3_ref = null;
            String var4 = null;
            Throwable decompiledCaughtException = null;
            var2 = this;
            synchronized (var2) {
              L0: {
                L1: {
                  this.field_c = true;
                  if (param0 == 13) {
                    break L1;
                  } else {
                    var4 = (String) null;
                    discarded$1 = this.a(-99, 45, true, (String) null);
                    break L1;
                  }
                }
                this.notifyAll();
                break L0;
              }
            }
            try {
              L2: {
                this.field_i.join();
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
              if (this.field_j != null) {
                try {
                  L5: {
                    this.field_j.a((byte) -5);
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
              if (null == this.field_s) {
                break L7;
              } else {
                try {
                  L8: {
                    this.field_s.a((byte) -5);
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
              if (null != this.field_r) {
                var2_int = 0;
                L11: while (true) {
                  if (var2_int >= this.field_r.length) {
                    break L10;
                  } else {
                    if (this.field_r[var2_int] != null) {
                      try {
                        L12: {
                          this.field_r[var2_int].a((byte) -5);
                          var2_int++;
                          break L12;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L13: {
                          var3_ref = (IOException) (Object) decompiledCaughtException;
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
              if (null != this.field_n) {
                try {
                  L15: {
                    this.field_n.a((byte) -5);
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

    final cb a(int param0, String param1, boolean param2) {
        cb discarded$0 = null;
        if (param2) {
            discarded$0 = this.a(82);
        }
        return this.a(0, param0, false, param1);
    }

    final cb a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 != -1743550128) {
            return (cb) null;
        }
        return this.a(param1 ^ -1743550127, (Object) null, param0 + (param4 << -1333938256), 6, (param3 << -1743550128) + param2);
    }

    final cb a(Class param0, int param1, String param2) {
        if (param1 != 0) {
            this.field_w = (ie) null;
        }
        return this.a(1, new Object[]{param0, param2}, 0, 9, 0);
    }

    private final cb a(int param0, Object param1, int param2, int param3, int param4) {
        cb var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        var6 = new cb();
        var6.field_f = param1;
        var6.field_c = param2;
        var6.field_g = param4;
        if (param0 == 1) {
          var6.field_d = param3;
          var7 = this;
          synchronized (var7) {
            L0: {
              L1: {
                if (this.field_g == null) {
                  this.field_d = var6;
                  this.field_g = var6;
                  break L1;
                } else {
                  this.field_g.field_e = var6;
                  this.field_g = var6;
                  break L1;
                }
              }
              this.notify();
              break L0;
            }
          }
          return var6;
        } else {
          return (cb) null;
        }
    }

    final cb a(String param0, int param1, Class[] param2, Class param3) {
        if (param1 >= -118) {
            this.field_e = (Object) null;
        }
        return this.a(1, new Object[]{param3, param0, param2}, 0, 8, 0);
    }

    final cb a(int param0, java.net.URL param1) {
        if (param0 != -14) {
            return (cb) null;
        }
        return this.a(1, param1, 0, 4, 0);
    }

    d(int param0, String param1, int param2, boolean param3) throws Exception {
        String discarded$7 = null;
        String discarded$8 = null;
        java.lang.reflect.Method discarded$9 = null;
        Object discarded$10 = null;
        Exception exception = null;
        Throwable throwable = null;
        int var5_int = 0;
        ie var6 = null;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          this.field_d = null;
          this.field_n = null;
          this.field_j = null;
          this.field_g = null;
          this.field_s = null;
          this.field_l = false;
          this.field_h = false;
          this.field_c = false;
          field_p = param1;
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param3) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((d) (this)).field_h = stackIn_3_1 != 0;
        field_o = "Unknown";
        field_t = "1.1";
        field_f = param0;
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
          if (field_o.toLowerCase().indexOf("microsoft") != -1) {
            this.field_l = true;
            break L3;
          } else {
            break L3;
          }
        }
        try {
          L4: {
            field_k = System.getProperty("os.name");
            break L4;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            exception = (Exception) (Object) decompiledCaughtException;
            field_k = "Unknown";
            break L5;
          }
        }
        field_b = field_k.toLowerCase();
        try {
          L6: {
            discarded$7 = System.getProperty("os.arch").toLowerCase();
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
            discarded$8 = System.getProperty("os.version").toLowerCase();
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
              if (field_x == null) {
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
          if (null != field_x) {
            break L13;
          } else {
            field_x = "~/";
            break L13;
          }
        }
        try {
          L14: {
            this.field_q = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
                discarded$9 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[]{Boolean.TYPE});
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
                field_v = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
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
          aj.a((byte) 66, field_p, field_f);
          if (!this.field_h) {
            break L21;
          } else {
            this.field_n = new pa(aj.a((String) null, -27533, "random.dat", field_f), "rw", 25L);
            this.field_j = new pa(aj.a("main_file_cache.dat2", (byte) -116), "rw", 314572800L);
            this.field_s = new pa(aj.a("main_file_cache.idx255", (byte) -77), "rw", 1048576L);
            this.field_r = new pa[param2];
            var5_int = 0;
            L22: while (true) {
              if (var5_int >= param2) {
                L23: {
                  if (this.field_l) {
                    try {
                      L24: {
                        discarded$10 = Class.forName("of").newInstance();
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
                      if (this.field_l) {
                        var6 = new ie();
                        this.field_w = var6;
                        break L27;
                      } else {
                        this.field_e = Class.forName("pd").newInstance();
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
                        this.field_u = Class.forName("tk").newInstance();
                        break L30;
                      } else {
                        this.field_a = new tg();
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
                this.field_r[var5_int] = new pa(aj.a("main_file_cache.idx" + var5_int, (byte) -104), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        this.field_c = false;
        this.field_i = new Thread((Runnable) (this));
        this.field_i.setPriority(10);
        this.field_i.setDaemon(true);
        this.field_i.start();
    }

    static {
        field_m = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
