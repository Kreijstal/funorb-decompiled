/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vh implements Runnable {
    static java.lang.reflect.Method field_j;
    private rc field_m;
    private static volatile long field_s;
    private Object field_x;
    private boolean field_l;
    private static String field_h;
    ue field_t;
    private an field_a;
    ue field_n;
    static String field_i;
    ue field_c;
    private static int field_f;
    ue[] field_w;
    boolean field_d;
    private boolean field_o;
    private rc field_g;
    private kd field_b;
    private Object field_e;
    private Thread field_k;
    private static String field_r;
    static String field_v;
    java.awt.EventQueue field_p;
    private static String field_q;
    static String field_u;

    final rc a(boolean param0, int param1, int param2, int param3, int param4) {
        if (!param0) {
            String var7 = (String) null;
            this.a((Class) null, false, (String) null);
        }
        return this.a((param1 << 1664881104) + param2, 6, (Object) null, param3 + (param4 << -252885616), (byte) -116);
    }

    final rc a(int param0, java.net.URL param1) {
        if (param0 != 0) {
            field_i = (String) null;
        }
        return this.a(0, 4, param1, 0, (byte) -101);
    }

    final boolean a(byte param0) {
        if (param0 != 13) {
            this.field_l = false;
        }
        if (!this.field_d) {
            return false;
        }
        if (this.field_o) {
            return null != this.field_a ? true : false;
        }
        return this.field_x != null ? true : false;
    }

    final rc a(Class[] param0, int param1, String param2, Class param3) {
        if (param1 != -30475) {
            String var6 = (String) null;
            this.a((String) null, -80, 20);
        }
        return this.a(0, 8, new Object[]{param3, param2, param0}, 0, (byte) -119);
    }

    final void b(int param0) {
        try {
            Throwable decompiledCaughtException = null;
            Object var2 = null;
            InterruptedException var2_ref = null;
            IOException var2_ref2 = null;
            int var2_int = 0;
            int var3_int = 0;
            IOException var3 = null;
            var2 = this;
            synchronized (var2) {
              L0: {
                this.field_l = true;
                this.notifyAll();
                var3_int = -46 % ((param0 - -47) / 50);
                break L0;
              }
            }
            try {
              L1: {
                this.field_k.join();
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
              if (this.field_t == null) {
                break L3;
              } else {
                try {
                  L4: {
                    this.field_t.a((byte) 92);
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
              if (null != this.field_n) {
                try {
                  L7: {
                    this.field_n.a((byte) 126);
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
              if (this.field_w != null) {
                var2_int = 0;
                L10: while (true) {
                  if (this.field_w.length <= var2_int) {
                    break L9;
                  } else {
                    if (this.field_w[var2_int] != null) {
                      try {
                        L11: {
                          this.field_w[var2_int].a((byte) 127);
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
              if (this.field_c == null) {
                break L13;
              } else {
                try {
                  L14: {
                    this.field_c.a((byte) 94);
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
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final rc a(byte param0, int param1, Runnable param2) {
        if (param0 > -51) {
            return (rc) null;
        }
        return this.a(param1, 2, param2, 0, (byte) -123);
    }

    private final rc a(boolean param0, String param1, int param2, byte param3) {
        if (param3 != -96) {
            return (rc) null;
        }
        return this.a(param2, param0 ? 22 : 1, param1, 0, (byte) -128);
    }

    public final void run() {
        try {
            int stackIn_79_0 = 0;
            Throwable decompiledCaughtException = null;
            Object var2 = null;
            int var2_int = 0;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            InterruptedException var3 = null;
            ko var3_ref = null;
            ue var3_ref2 = null;
            int var3_int = 0;
            Exception var3_ref3 = null;
            int var4 = 0;
            String var4_ref_String = null;
            int var5 = 0;
            java.awt.datatransfer.Transferable var7 = null;
            rc var8 = null;
            Thread var9 = null;
            Object[] var10 = null;
            java.awt.datatransfer.Clipboard var11 = null;
            java.awt.Frame var12 = null;
            Object[] var13 = null;
            String var14 = null;
            java.awt.Component var15 = null;
            String var16 = null;
            java.awt.datatransfer.Clipboard var17 = null;
            Object[] var18 = null;
            L0: while (true) {
              var2 = this;
              synchronized (var2) {
                L1: {
                  L2: while (true) {
                    if (!this.field_l) {
                      if (this.field_m != null) {
                        L3: {
                          var8 = this.field_m;
                          this.field_m = this.field_m.field_f;
                          if (this.field_m != null) {
                            break L3;
                          } else {
                            this.field_g = null;
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
                    var2_int = var8.field_g;
                    if ((var2_int ^ -1) != -2) {
                      if (-23 == (var2_int ^ -1)) {
                        if (field_s <= km.b(-1)) {
                          try {
                              if (false) throw (ko) null;
                            L8: {
                              var8.field_d = gm.a(true, var8.field_b, (String) (var8.field_e)).a(-2049);
                              break L8;
                            }
                          } catch (ko decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref = (ko) (Object) decompiledCaughtException;
                            var8.field_d = var3_ref.getMessage();
                            throw var3_ref;
                          }
                          break L7;
                        } else {
                          throw new IOException();
                        }
                      } else {
                        if (2 != var2_int) {
                          if (var2_int == 4) {
                            if (km.b(-1) < field_s) {
                              throw new IOException();
                            } else {
                              var8.field_d = new DataInputStream(((java.net.URL) (var8.field_e)).openStream());
                              break L7;
                            }
                          } else {
                            if (-9 != (var2_int ^ -1)) {
                              if ((var2_int ^ -1) == -10) {
                                L9: {
                                  var18 = (Object[]) (var8.field_e);
                                  if (!this.field_d) {
                                    break L9;
                                  } else {
                                    if (null != ((Class) (var18[0])).getClassLoader()) {
                                      break L9;
                                    } else {
                                      throw new SecurityException();
                                    }
                                  }
                                }
                                var8.field_d = ((Class) (var18[0])).getDeclaredField((String) (var18[1]));
                                break L7;
                              } else {
                                if (var2_int != 18) {
                                  if (var2_int == 19) {
                                    var7 = (java.awt.datatransfer.Transferable) (var8.field_e);
                                    var17 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var17.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L7;
                                  } else {
                                    if (this.field_d) {
                                      if ((var2_int ^ -1) == -4) {
                                        if (km.b(-1) >= field_s) {
                                          var16 = (255 & var8.field_b >> -1808325064) + "." + (var8.field_b >> -79988912 & 255) + "." + ((65334 & var8.field_b) >> -661318296) + "." + (255 & var8.field_b);
                                          var8.field_d = java.net.InetAddress.getByName(var16).getHostName();
                                          break L7;
                                        } else {
                                          throw new IOException();
                                        }
                                      } else {
                                        if (var2_int == 21) {
                                          if (km.b(-1) < field_s) {
                                            throw new IOException();
                                          } else {
                                            var8.field_d = java.net.InetAddress.getByName((String) (var8.field_e)).getAddress();
                                            break L7;
                                          }
                                        } else {
                                          if (-6 != (var2_int ^ -1)) {
                                            if ((var2_int ^ -1) != -7) {
                                              if (var2_int == 7) {
                                                if (this.field_o) {
                                                  this.field_a.a((byte) -102, (java.awt.Frame) (var8.field_e));
                                                  break L7;
                                                } else {
                                                  Class.forName("fl").getMethod("exit", new Class[]{}).invoke(this.field_x, new Object[]{});
                                                  break L7;
                                                }
                                              } else {
                                                if (var2_int == 12) {
                                                  var3_ref2 = vh.a(field_r, (String) (var8.field_e), field_f, (byte) 95);
                                                  var8.field_d = var3_ref2;
                                                  break L7;
                                                } else {
                                                  if ((var2_int ^ -1) != -14) {
                                                    L10: {
                                                      if (!this.field_d) {
                                                        break L10;
                                                      } else {
                                                        if ((var2_int ^ -1) == -15) {
                                                          var3_int = var8.field_b;
                                                          var4 = var8.field_c;
                                                          if (!this.field_o) {
                                                            Class.forName("ve").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_e, new Object[]{new Integer(var3_int), new Integer(var4)});
                                                            break L7;
                                                          } else {
                                                            this.field_b.a(var4, var3_int, -85);
                                                            break L7;
                                                          }
                                                        } else {
                                                          break L10;
                                                        }
                                                      }
                                                    }
                                                    L11: {
                                                      if (!this.field_d) {
                                                        break L11;
                                                      } else {
                                                        if (-16 == (var2_int ^ -1)) {
                                                          L12: {
                                                            if (0 == var8.field_b) {
                                                              stackIn_79_0 = 0;
                                                              break L12;
                                                            } else {
                                                              stackIn_79_0 = 1;
                                                              break L12;
                                                            }
                                                          }
                                                          var3_int = stackIn_79_0;
                                                          var15 = (java.awt.Component) (var8.field_e);
                                                          if (this.field_o) {
                                                            this.field_b.a(var3_int != 0, (byte) 84, var15);
                                                            break L7;
                                                          } else {
                                                            Class.forName("ve").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_e, new Object[]{var15, new Boolean(var3_int != 0)});
                                                            break L7;
                                                          }
                                                        } else {
                                                          break L11;
                                                        }
                                                      }
                                                    }
                                                    L13: {
                                                      if (this.field_o) {
                                                        break L13;
                                                      } else {
                                                        if ((var2_int ^ -1) != -18) {
                                                          break L13;
                                                        } else {
                                                          var13 = (Object[]) (var8.field_e);
                                                          Class.forName("ve").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_e, new Object[]{var13[0], var13[1], new Integer(var8.field_b), new Integer(var8.field_c), var13[2]});
                                                          break L7;
                                                        }
                                                      }
                                                    }
                                                    if ((var2_int ^ -1) != -17) {
                                                      throw vh.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    } else {
                                                      try {
                                                        L14: {
                                                          if (field_i.startsWith("win")) {
                                                            L15: {
                                                              var14 = (String) (var8.field_e);
                                                              if (var14.startsWith("http://")) {
                                                                break L15;
                                                              } else {
                                                                if (!var14.startsWith("https://")) {
                                                                  throw vh.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  break L15;
                                                                }
                                                              }
                                                            }
                                                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L16: while (true) {
                                                              if (var14.length() <= var5) {
                                                                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var14 + "\"");
                                                                var8.field_d = null;
                                                                break L14;
                                                              } else {
                                                                if (var4_ref_String.indexOf((int) var14.charAt(var5)) == -1) {
                                                                  throw vh.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  var5++;
                                                                  continue L16;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            throw vh.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                                                        decompiledCaughtException = decompiledCaughtParameter2;
                                                        var3_ref3 = (Exception) (Object) decompiledCaughtException;
                                                        var8.field_d = var3_ref3;
                                                        throw vh.<RuntimeException>$cfr$sneakyThrow(var3_ref3);
                                                      }
                                                      break L7;
                                                    }
                                                  } else {
                                                    var3_ref2 = vh.a("", (String) (var8.field_e), field_f, (byte) 101);
                                                    var8.field_d = var3_ref2;
                                                    break L7;
                                                  }
                                                }
                                              }
                                            } else {
                                              var12 = new java.awt.Frame("Jagex Full Screen");
                                              var8.field_d = var12;
                                              var12.setResizable(false);
                                              if (this.field_o) {
                                                this.field_a.a(var8.field_c & 65535, var8.field_b >>> -808508688, var12, var8.field_b & 65535, -4013, var8.field_c >> -1141046288);
                                                break L7;
                                              } else {
                                                Class.forName("fl").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_x, new Object[]{var12, new Integer(var8.field_b >>> -1976680432), new Integer(var8.field_b & 65535), new Integer(var8.field_c >> -921645424), new Integer(65535 & var8.field_c)});
                                                break L7;
                                              }
                                            }
                                          } else {
                                            if (!this.field_o) {
                                              var8.field_d = Class.forName("fl").getMethod("listmodes", new Class[]{}).invoke(this.field_x, new Object[]{});
                                              break L7;
                                            } else {
                                              var8.field_d = this.field_a.a(3152);
                                              break L7;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      throw vh.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    }
                                  }
                                } else {
                                  var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8.field_d = var11.getContents((Object) null);
                                  break L7;
                                }
                              }
                            } else {
                              L17: {
                                var10 = (Object[]) (var8.field_e);
                                if (this.field_d) {
                                  if (((Class) (var10[0])).getClassLoader() == null) {
                                    throw new SecurityException();
                                  } else {
                                    break L17;
                                  }
                                } else {
                                  break L17;
                                }
                              }
                              var8.field_d = ((Class) (var10[0])).getDeclaredMethod((String) (var10[1]), (Class[]) (var10[2]));
                              break L7;
                            }
                          }
                        } else {
                          var9 = new Thread((Runnable) (var8.field_e));
                          var9.setDaemon(true);
                          var9.start();
                          var9.setPriority(var8.field_b);
                          var8.field_d = var9;
                          break L7;
                        }
                      }
                    } else {
                      if (field_s <= km.b(-1)) {
                        var8.field_d = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.field_e)), var8.field_b);
                        break L7;
                      } else {
                        throw new IOException();
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

    private final rc a(int param0, int param1, Object param2, int param3, byte param4) {
        rc var6 = null;
        Object var7 = null;
        Object var7_ref = null;
        rc stackIn_6_0 = null;
        Throwable decompiledCaughtException = null;
        var6 = new rc();
        var6.field_c = param3;
        var6.field_b = param0;
        var6.field_g = param1;
        var6.field_e = param2;
        var7_ref = this;
        synchronized (var7_ref) {
          L0: {
            L1: {
              if (null != this.field_g) {
                this.field_g.field_f = var6;
                this.field_g = var6;
                break L1;
              } else {
                this.field_m = var6;
                this.field_g = var6;
                break L1;
              }
            }
            if (param4 <= -99) {
              this.notify();
              break L0;
            } else {
              stackIn_6_0 = (rc) null;
              return stackIn_6_0;
            }
          }
        }
        return var6;
    }

    private final static ue a(String param0, String param1, int param2, byte param3) {
        try {
            ue stackIn_14_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            String var7 = null;
            ue var8 = null;
            Exception var8_ref = null;
            if (param3 >= 77) {
              L0: {
                if ((param2 ^ -1) != -34) {
                  if ((param2 ^ -1) != -35) {
                    var4 = "jagex_" + param0 + "_preferences" + param1 + ".dat";
                    break L0;
                  } else {
                    var4 = "jagex_" + param0 + "_preferences" + param1 + "_wip.dat";
                    break L0;
                  }
                } else {
                  var4 = "jagex_" + param0 + "_preferences" + param1 + "_rc.dat";
                  break L0;
                }
              }
              var5 = new String[]{"c:/rscache/", "/rscache/", field_q, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
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
                      var8 = new ue(new File(var7, var4), "rw", 10000L);
                      stackIn_14_0 = (ue) (var8);
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
              return (ue) null;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final rc a(Class param0, boolean param1, String param2) {
        if (!param1) {
            this.run();
        }
        return this.a(0, 9, new Object[]{param0, param2}, 0, (byte) -108);
    }

    final rc a(String param0, int param1, int param2) {
        if (param2 >= -58) {
            field_q = (String) null;
        }
        return this.a(false, param0, param1, (byte) -96);
    }

    final rc a(boolean param0, java.awt.Frame param1) {
        if (param0) {
            java.net.URL var4 = (java.net.URL) null;
            this.a(3, (java.net.URL) null);
        }
        return this.a(0, 7, param1, 0, (byte) -110);
    }

    final rc a(int param0) {
        int var2 = 13 / ((param0 - -26) / 60);
        return this.a(0, 5, (Object) null, 0, (byte) -125);
    }

    vh(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception exception = null;
        Throwable throwable = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        an var7 = null;
        L0: {
          this.field_n = null;
          this.field_o = false;
          this.field_g = null;
          this.field_m = null;
          this.field_c = null;
          this.field_t = null;
          this.field_l = false;
          this.field_d = false;
          field_f = param0;
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
        ((vh) (this)).field_d = stackIn_3_1 != 0;
        field_r = param1;
        field_v = "1.1";
        field_u = "Unknown";
        try {
          L1: {
            field_u = System.getProperty("java.vendor");
            field_v = System.getProperty("java.version");
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
          if (-1 != field_u.toLowerCase().indexOf("microsoft")) {
            this.field_o = true;
            break L3;
          } else {
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
        field_i = field_h.toLowerCase();
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
              field_q = System.getProperty("user.home");
              if (null == field_q) {
                break L11;
              } else {
                field_q = field_q + "/";
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
          if (null == field_q) {
            field_q = "~/";
            break L13;
          } else {
            break L13;
          }
        }
        try {
          L14: {
            this.field_p = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
          if (!this.field_o) {
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
                field_j = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
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
          f.a((byte) 32, field_r, field_f);
          if (!this.field_d) {
            break L21;
          } else {
            this.field_c = new ue(f.a(-31192, "random.dat", (String) null, field_f), "rw", 25L);
            this.field_t = new ue(f.a(-3455, "main_file_cache.dat2"), "rw", 314572800L);
            this.field_n = new ue(f.a(-3455, "main_file_cache.idx255"), "rw", 1048576L);
            this.field_w = new ue[param2];
            var5_int = 0;
            L22: while (true) {
              if (param2 <= var5_int) {
                L23: {
                  if (!this.field_o) {
                    break L23;
                  } else {
                    try {
                      L24: {
                        Class.forName("ic").newInstance();
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
                      if (this.field_o) {
                        var7 = new an();
                        this.field_a = var7;
                        break L27;
                      } else {
                        this.field_x = Class.forName("fl").newInstance();
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
                      if (this.field_o) {
                        this.field_b = new kd();
                        break L30;
                      } else {
                        this.field_e = Class.forName("ve").newInstance();
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
                this.field_w[var5_int] = new ue(f.a(-3455, "main_file_cache.idx" + var5_int), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        this.field_l = false;
        this.field_k = new Thread((Runnable) (this));
        this.field_k.setPriority(10);
        this.field_k.setDaemon(true);
        this.field_k.start();
    }

    static {
        field_s = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
