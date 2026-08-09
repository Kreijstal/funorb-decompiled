/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pn implements Runnable {
    static String field_p;
    sn field_m;
    boolean field_x;
    private boolean field_e;
    static String field_r;
    private static int field_t;
    private vj field_o;
    private pk field_v;
    static String field_w;
    sn field_f;
    sn[] field_a;
    private Thread field_i;
    private Object field_n;
    private static String field_k;
    private boolean field_s;
    private static String field_u;
    private static volatile long field_d;
    private wj field_h;
    private wj field_j;
    sn field_g;
    private static String field_l;
    private Object field_q;
    java.awt.EventQueue field_b;
    static java.lang.reflect.Method field_c;

    final wj a(java.awt.Frame param0, int param1) {
        if (param1 != -1463474960) {
            String var4 = (String) null;
            this.a((String) null, 76, -2);
        }
        return this.a(0, 0, 94, param0, 7);
    }

    final wj a(String param0, int param1, int param2) {
        if (param2 != 376255344) {
            field_w = (String) null;
        }
        return this.a(param1, false, false, param0);
    }

    final wj a(int param0, Class param1, String param2) {
        if (param0 != 9) {
            this.field_s = false;
        }
        return this.a(0, 0, -93, new Object[]{param1, param2}, 9);
    }

    final wj a(java.net.URL param0, int param1) {
        if (param1 <= 28) {
            field_k = (String) null;
        }
        return this.a(0, 0, -111, param0, 4);
    }

    private final static sn a(String param0, int param1, int param2, String param3) {
        try {
            sn stackIn_13_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            String var7 = null;
            sn var8 = null;
            Exception var8_ref = null;
            L0: {
              if (-34 != (param2 ^ -1)) {
                if (34 == param2) {
                  var4 = "jagex_" + param0 + "_preferences" + param3 + "_wip.dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param0 + "_preferences" + param3 + ".dat";
                  break L0;
                }
              } else {
                var4 = "jagex_" + param0 + "_preferences" + param3 + "_rc.dat";
                break L0;
              }
            }
            var5 = new String[]{"c:/rscache/", "/rscache/", field_l, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            var6 = 0;
            if (param1 == 11677) {
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
                      var8 = new sn(new File(var7, var4), "rw", 10000L);
                      stackIn_13_0 = (sn) (var8);
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
            } else {
              return (sn) null;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void run() {
        try {
            int stackIn_93_0 = 0;
            Throwable decompiledCaughtException = null;
            Object var2 = null;
            int var2_int = 0;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            InterruptedException var3_ref_InterruptedException = null;
            int var3 = 0;
            Exception var3_ref_Exception = null;
            sn var3_ref_sn = null;
            vg var3_ref_vg = null;
            int var4 = 0;
            String var4_ref_String = null;
            int var5 = 0;
            java.awt.datatransfer.Transferable var7 = null;
            wj var8 = null;
            Object[] var9 = null;
            Object[] var10 = null;
            java.awt.datatransfer.Clipboard var11 = null;
            java.awt.datatransfer.Clipboard var12 = null;
            String var13 = null;
            Object[] var14 = null;
            java.awt.Component var15 = null;
            java.awt.Frame var16 = null;
            String var17 = null;
            Thread var18 = null;
            L0: while (true) {
              var2 = this;
              synchronized (var2) {
                L1: {
                  L2: while (true) {
                    if (!this.field_s) {
                      if (null != this.field_j) {
                        L3: {
                          var8 = this.field_j;
                          this.field_j = this.field_j.field_d;
                          if (null != this.field_j) {
                            break L3;
                          } else {
                            this.field_h = null;
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
                    var2_int = var8.field_f;
                    if (var2_int != 1) {
                      if ((var2_int ^ -1) != -23) {
                        if (var2_int == 2) {
                          var18 = new Thread((Runnable) (var8.field_b));
                          var18.setDaemon(true);
                          var18.start();
                          var18.setPriority(var8.field_e);
                          var8.field_c = var18;
                          break L7;
                        } else {
                          if ((var2_int ^ -1) != -5) {
                            if (8 != var2_int) {
                              if ((var2_int ^ -1) != -10) {
                                if (var2_int != 18) {
                                  if (-20 != (var2_int ^ -1)) {
                                    if (this.field_x) {
                                      if ((var2_int ^ -1) == -4) {
                                        if (mm.a(75) >= field_d) {
                                          var17 = (255 & var8.field_e >> 1298511512) + "." + (255 & var8.field_e >> 541883216) + "." + ((65309 & var8.field_e) >> -614610360) + "." + (255 & var8.field_e);
                                          var8.field_c = java.net.InetAddress.getByName(var17).getHostName();
                                          break L7;
                                        } else {
                                          throw new IOException();
                                        }
                                      } else {
                                        if ((var2_int ^ -1) == -22) {
                                          if ((mm.a(-120) ^ -1L) > (field_d ^ -1L)) {
                                            throw new IOException();
                                          } else {
                                            var8.field_c = java.net.InetAddress.getByName((String) (var8.field_b)).getAddress();
                                            break L7;
                                          }
                                        } else {
                                          if (-6 == (var2_int ^ -1)) {
                                            if (!this.field_e) {
                                              var8.field_c = Class.forName("ga").getMethod("listmodes", new Class[]{}).invoke(this.field_n, new Object[]{});
                                              break L7;
                                            } else {
                                              var8.field_c = this.field_v.a(0);
                                              break L7;
                                            }
                                          } else {
                                            if (-7 == (var2_int ^ -1)) {
                                              var16 = new java.awt.Frame("Jagex Full Screen");
                                              var8.field_c = var16;
                                              var16.setResizable(false);
                                              if (!this.field_e) {
                                                Class.forName("ga").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_n, new Object[]{var16, new Integer(var8.field_e >>> 376255344), new Integer(var8.field_e & 65535), new Integer(var8.field_g >> -1056336592), new Integer(65535 & var8.field_g)});
                                                break L7;
                                              } else {
                                                this.field_v.a(var8.field_g & 65535, var16, var8.field_e & 65535, var8.field_g >> -1463474960, (byte) -107, var8.field_e >>> 1391263632);
                                                break L7;
                                              }
                                            } else {
                                              if (-8 != (var2_int ^ -1)) {
                                                if (var2_int != 12) {
                                                  if ((var2_int ^ -1) != -14) {
                                                    L8: {
                                                      if (!this.field_x) {
                                                        break L8;
                                                      } else {
                                                        if (-15 == (var2_int ^ -1)) {
                                                          var3 = var8.field_e;
                                                          var4 = var8.field_g;
                                                          if (this.field_e) {
                                                            this.field_o.a(var4, var3, false);
                                                            break L7;
                                                          } else {
                                                            Class.forName("th").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_q, new Object[]{new Integer(var3), new Integer(var4)});
                                                            break L7;
                                                          }
                                                        } else {
                                                          break L8;
                                                        }
                                                      }
                                                    }
                                                    L9: {
                                                      if (!this.field_x) {
                                                        break L9;
                                                      } else {
                                                        if (-16 == (var2_int ^ -1)) {
                                                          L10: {
                                                            if (var8.field_e == 0) {
                                                              stackIn_93_0 = 0;
                                                              break L10;
                                                            } else {
                                                              stackIn_93_0 = 1;
                                                              break L10;
                                                            }
                                                          }
                                                          var3 = stackIn_93_0;
                                                          var15 = (java.awt.Component) (var8.field_b);
                                                          if (!this.field_e) {
                                                            Class.forName("th").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_q, new Object[]{var15, new Boolean(var3 != 0)});
                                                            break L7;
                                                          } else {
                                                            this.field_o.a(var15, 32512, var3 != 0);
                                                            break L7;
                                                          }
                                                        } else {
                                                          break L9;
                                                        }
                                                      }
                                                    }
                                                    L11: {
                                                      if (this.field_e) {
                                                        break L11;
                                                      } else {
                                                        if (var2_int == 17) {
                                                          var14 = (Object[]) (var8.field_b);
                                                          Class.forName("th").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_q, new Object[]{var14[0], var14[1], new Integer(var8.field_e), new Integer(var8.field_g), var14[2]});
                                                          break L7;
                                                        } else {
                                                          break L11;
                                                        }
                                                      }
                                                    }
                                                    if (-17 != (var2_int ^ -1)) {
                                                      throw pn.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    } else {
                                                      try {
                                                        L12: {
                                                          if (!field_w.startsWith("win")) {
                                                            throw pn.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          } else {
                                                            L13: {
                                                              var13 = (String) (var8.field_b);
                                                              if (var13.startsWith("http://")) {
                                                                break L13;
                                                              } else {
                                                                if (var13.startsWith("https://")) {
                                                                  break L13;
                                                                } else {
                                                                  throw pn.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L14: while (true) {
                                                              if (var5 >= var13.length()) {
                                                                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var13 + "\"");
                                                                var8.field_c = null;
                                                                break L12;
                                                              } else {
                                                                if (var4_ref_String.indexOf((int) var13.charAt(var5)) != -1) {
                                                                  var5++;
                                                                  continue L14;
                                                                } else {
                                                                  throw pn.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter1) {
                                                        decompiledCaughtException = decompiledCaughtParameter1;
                                                        var3_ref_Exception = (Exception) (Object) decompiledCaughtException;
                                                        var8.field_c = var3_ref_Exception;
                                                        throw pn.<RuntimeException>$cfr$sneakyThrow(var3_ref_Exception);
                                                      }
                                                      break L7;
                                                    }
                                                  } else {
                                                    var3_ref_sn = pn.a("", 11677, field_t, (String) (var8.field_b));
                                                    var8.field_c = var3_ref_sn;
                                                    break L7;
                                                  }
                                                } else {
                                                  var3_ref_sn = pn.a(field_k, 11677, field_t, (String) (var8.field_b));
                                                  var8.field_c = var3_ref_sn;
                                                  break L7;
                                                }
                                              } else {
                                                if (this.field_e) {
                                                  this.field_v.a((java.awt.Frame) (var8.field_b), (byte) 107);
                                                  break L7;
                                                } else {
                                                  Class.forName("ga").getMethod("exit", new Class[]{}).invoke(this.field_n, new Object[]{});
                                                  break L7;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      throw pn.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    }
                                  } else {
                                    var7 = (java.awt.datatransfer.Transferable) (var8.field_b);
                                    var12 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var12.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L7;
                                  }
                                } else {
                                  var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8.field_c = var11.getContents((Object) null);
                                  break L7;
                                }
                              } else {
                                L15: {
                                  var10 = (Object[]) (var8.field_b);
                                  if (!this.field_x) {
                                    break L15;
                                  } else {
                                    if (null == ((Class) (var10[0])).getClassLoader()) {
                                      throw new SecurityException();
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                                var8.field_c = ((Class) (var10[0])).getDeclaredField((String) (var10[1]));
                                break L7;
                              }
                            } else {
                              L16: {
                                var9 = (Object[]) (var8.field_b);
                                if (this.field_x) {
                                  if (null == ((Class) (var9[0])).getClassLoader()) {
                                    throw new SecurityException();
                                  } else {
                                    break L16;
                                  }
                                } else {
                                  break L16;
                                }
                              }
                              var8.field_c = ((Class) (var9[0])).getDeclaredMethod((String) (var9[1]), (Class[]) (var9[2]));
                              break L7;
                            }
                          } else {
                            if (mm.a(109) < field_d) {
                              throw new IOException();
                            } else {
                              var8.field_c = new DataInputStream(((java.net.URL) (var8.field_b)).openStream());
                              break L7;
                            }
                          }
                        }
                      } else {
                        if ((field_d ^ -1L) >= (mm.a(80) ^ -1L)) {
                          try {
                              if (false) throw (vg) null;
                            L17: {
                              var8.field_c = tc.a((String) (var8.field_b), var8.field_e, 22137).a(-90);
                              break L17;
                            }
                          } catch (vg decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref_vg = (vg) (Object) decompiledCaughtException;
                            var8.field_c = var3_ref_vg.getMessage();
                            throw var3_ref_vg;
                          }
                          break L7;
                        } else {
                          throw new IOException();
                        }
                      }
                    } else {
                      if ((mm.a(105) ^ -1L) > (field_d ^ -1L)) {
                        throw new IOException();
                      } else {
                        var8.field_c = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.field_b)), var8.field_e);
                        break L7;
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

    private final wj a(int param0, int param1, int param2, Object param3, int param4) {
        wj var6 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var8 = null;
        var6 = new wj();
        var6.field_e = param1;
        var6.field_b = param3;
        var6.field_f = param4;
        var7 = 101 % ((-43 - param2) / 45);
        var6.field_g = param0;
        var8 = this;
        synchronized (var8) {
          L0: {
            L1: {
              if (this.field_h == null) {
                this.field_j = var6;
                this.field_h = var6;
                break L1;
              } else {
                this.field_h.field_d = var6;
                this.field_h = var6;
                break L1;
              }
            }
            this.notify();
            break L0;
          }
        }
        return var6;
    }

    final boolean b(int param0) {
        if (!this.field_x) {
            return false;
        }
        if (param0 >= -26) {
            return false;
        }
        if (!this.field_e) {
            return this.field_n != null ? true : false;
        }
        return this.field_v != null ? true : false;
    }

    final wj a(int param0) {
        if (param0 != -30756) {
            return (wj) null;
        }
        return this.a(0, 0, 17, (Object) null, 5);
    }

    final wj a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 != 6) {
            return (wj) null;
        }
        return this.a(param1 + (param2 << -505354032), param0 + (param3 << 1282052784), 127, (Object) null, 6);
    }

    final void c(int param0) {
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
                L1: {
                  this.field_s = true;
                  this.notifyAll();
                  if (param0 == 0) {
                    break L1;
                  } else {
                    field_t = -42;
                    break L1;
                  }
                }
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
              if (this.field_f == null) {
                break L4;
              } else {
                try {
                  L5: {
                    this.field_f.a(true);
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
              if (null == this.field_g) {
                break L7;
              } else {
                try {
                  L8: {
                    this.field_g.a(true);
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
              if (this.field_a != null) {
                var2_int = 0;
                L11: while (true) {
                  if (this.field_a.length <= var2_int) {
                    break L10;
                  } else {
                    if (null != this.field_a[var2_int]) {
                      try {
                        L12: {
                          this.field_a[var2_int].a(true);
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
              if (null == this.field_m) {
                break L14;
              } else {
                try {
                  L15: {
                    this.field_m.a(true);
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

    final wj a(String param0, byte param1, Class param2, Class[] param3) {
        if (param1 != 52) {
            field_k = (String) null;
        }
        return this.a(0, 0, -122, new Object[]{param2, param0, param3}, 8);
    }

    final wj a(int param0, int param1, Runnable param2) {
        if (param0 != 2) {
            this.a(-125, -51, 63, 104, 101);
        }
        return this.a(0, param1, 112, param2, 2);
    }

    private final wj a(int param0, boolean param1, boolean param2, String param3) {
        if (param1) {
            String var6 = (String) null;
            this.a((String) null, -15, 36);
        }
        return this.a(0, param0, 108, param3, param2 ? 22 : 1);
    }

    pn(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception exception = null;
        Throwable throwable = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        pk var6 = null;
        L0: {
          this.field_m = null;
          this.field_e = false;
          this.field_x = false;
          this.field_f = null;
          this.field_s = false;
          this.field_h = null;
          this.field_j = null;
          this.field_g = null;
          field_r = "1.1";
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
        ((pn) (this)).field_x = stackIn_3_1 != 0;
        field_t = param0;
        field_p = "Unknown";
        field_k = param1;
        try {
          L1: {
            field_p = System.getProperty("java.vendor");
            field_r = System.getProperty("java.version");
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
          if ((field_p.toLowerCase().indexOf("microsoft") ^ -1) == 0) {
            break L3;
          } else {
            this.field_e = true;
            break L3;
          }
        }
        try {
          L4: {
            field_u = System.getProperty("os.name");
            break L4;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            exception = (Exception) (Object) decompiledCaughtException;
            field_u = "Unknown";
            break L5;
          }
        }
        field_w = field_u.toLowerCase();
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
              field_l = System.getProperty("user.home");
              if (null == field_l) {
                break L11;
              } else {
                field_l = field_l + "/";
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
          if (field_l == null) {
            field_l = "~/";
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
          if (!this.field_e) {
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
          wm.a(field_k, true, field_t);
          if (!this.field_x) {
            break L21;
          } else {
            this.field_m = new sn(wm.a((String) null, field_t, (byte) 35, "random.dat"), "rw", 25L);
            this.field_f = new sn(wm.a(8244, "main_file_cache.dat2"), "rw", 314572800L);
            this.field_g = new sn(wm.a(8244, "main_file_cache.idx255"), "rw", 1048576L);
            this.field_a = new sn[param2];
            var5_int = 0;
            L22: while (true) {
              if (var5_int >= param2) {
                L23: {
                  if (this.field_e) {
                    try {
                      L24: {
                        Class.forName("gg").newInstance();
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
                      if (!this.field_e) {
                        this.field_n = Class.forName("ga").newInstance();
                        break L27;
                      } else {
                        var6 = new pk();
                        this.field_v = var6;
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
                      if (this.field_e) {
                        this.field_o = new vj();
                        break L30;
                      } else {
                        this.field_q = Class.forName("th").newInstance();
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
                this.field_a[var5_int] = new sn(wm.a(8244, "main_file_cache.idx" + var5_int), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        this.field_s = false;
        this.field_i = new Thread((Runnable) (this));
        this.field_i.setPriority(10);
        this.field_i.setDaemon(true);
        this.field_i.start();
    }

    static {
        field_d = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
