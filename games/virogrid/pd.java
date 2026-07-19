/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pd implements Runnable {
    static String field_q;
    private boolean field_g;
    ji field_o;
    private Thread field_t;
    private un field_h;
    private static volatile long field_f;
    ji[] field_i;
    static java.lang.reflect.Method field_v;
    static String field_k;
    java.awt.EventQueue field_w;
    static String field_x;
    private ki field_l;
    private un field_m;
    private static int field_u;
    boolean field_a;
    private static String field_d;
    private static String field_r;
    private boolean field_e;
    private static String field_n;
    private Object field_b;
    ji field_j;
    ji field_c;
    private om field_s;
    private Object field_p;

    final un a(java.awt.Frame param0, boolean param1) {
        if (param1) {
            this.field_e = false;
        }
        return this.a(7, (byte) -30, 0, param0, 0);
    }

    public final void run() {
        try {
            Object discarded$6 = null;
            Object discarded$7 = null;
            Object discarded$8 = null;
            Process discarded$9 = null;
            Object discarded$10 = null;
            Object discarded$11 = null;
            Object var2 = null;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            te var3_ref = null;
            Exception var3_ref2 = null;
            ji var3_ref3 = null;
            int var3_int = 0;
            Throwable var4_ref_Throwable = null;
            int var4 = 0;
            String var4_ref_String = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            String var8 = null;
            Object var9 = null;
            un var9_ref = null;
            Object[] var10 = null;
            Object[] var11 = null;
            String var12 = null;
            java.awt.Frame var13 = null;
            Object[] var14 = null;
            java.awt.Component var15 = null;
            java.awt.datatransfer.Clipboard var16 = null;
            java.awt.datatransfer.Clipboard var17 = null;
            Thread var18 = null;
            int stackIn_97_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_96_0 = 0;
            int stackOut_95_0 = 0;
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
                    if (!this.field_e) {
                      if (null != this.field_h) {
                        L4: {
                          var9_ref = this.field_h;
                          this.field_h = this.field_h.field_d;
                          if (null != this.field_h) {
                            break L4;
                          } else {
                            this.field_m = null;
                            break L4;
                          }
                        }
                        break L2;
                      } else {
                        try {
                          L5: {
                            this.wait();
                            break L5;
                          }
                        } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          L6: {
                            var3 = (InterruptedException) (Object) decompiledCaughtException;
                            break L6;
                          }
                        }
                        continue L3;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
              try {
                L7: {
                  L8: {
                    var2_int = var9_ref.field_b;
                    if (1 != var2_int) {
                      if (22 != var2_int) {
                        if (2 == var2_int) {
                          var18 = new Thread((Runnable) (var9_ref.field_g));
                          var18.setDaemon(true);
                          var18.start();
                          var18.setPriority(var9_ref.field_e);
                          var9_ref.field_f = var18;
                          break L8;
                        } else {
                          if ((var2_int ^ -1) == -5) {
                            if ((hc.a(-9986) ^ -1L) <= (field_f ^ -1L)) {
                              var9_ref.field_f = new DataInputStream(((java.net.URL) (var9_ref.field_g)).openStream());
                              break L8;
                            } else {
                              throw new IOException();
                            }
                          } else {
                            if (var2_int != 8) {
                              if (9 != var2_int) {
                                if ((var2_int ^ -1) == -19) {
                                  var17 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var9_ref.field_f = var17.getContents((Object) null);
                                  break L8;
                                } else {
                                  if (-20 == (var2_int ^ -1)) {
                                    var7 = (java.awt.datatransfer.Transferable) (var9_ref.field_g);
                                    var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var16.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L8;
                                  } else {
                                    if (!this.field_a) {
                                      throw pd.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    } else {
                                      if (-4 != (var2_int ^ -1)) {
                                        if ((var2_int ^ -1) != -22) {
                                          if (var2_int != 5) {
                                            if (6 != var2_int) {
                                              if (7 != var2_int) {
                                                if (var2_int == 12) {
                                                  var3_ref3 = pd.a(field_n, (String) (var9_ref.field_g), field_u, 100150608);
                                                  var9_ref.field_f = var3_ref3;
                                                  break L8;
                                                } else {
                                                  if (13 == var2_int) {
                                                    var3_ref3 = pd.a("", (String) (var9_ref.field_g), field_u, 100150608);
                                                    var9_ref.field_f = var3_ref3;
                                                    break L8;
                                                  } else {
                                                    L9: {
                                                      if (!this.field_a) {
                                                        break L9;
                                                      } else {
                                                        if (-15 == (var2_int ^ -1)) {
                                                          var3_int = var9_ref.field_e;
                                                          var4 = var9_ref.field_c;
                                                          if (!this.field_g) {
                                                            discarded$6 = Class.forName("uj").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_b, new Object[]{new Integer(var3_int), new Integer(var4)});
                                                            break L8;
                                                          } else {
                                                            this.field_l.a(-1340, var3_int, var4);
                                                            break L8;
                                                          }
                                                        } else {
                                                          break L9;
                                                        }
                                                      }
                                                    }
                                                    L10: {
                                                      if (!this.field_a) {
                                                        break L10;
                                                      } else {
                                                        if (15 == var2_int) {
                                                          L11: {
                                                            if (0 == var9_ref.field_e) {
                                                              stackOut_96_0 = 0;
                                                              stackIn_97_0 = stackOut_96_0;
                                                              break L11;
                                                            } else {
                                                              stackOut_95_0 = 1;
                                                              stackIn_97_0 = stackOut_95_0;
                                                              break L11;
                                                            }
                                                          }
                                                          var3_int = stackIn_97_0;
                                                          var15 = (java.awt.Component) (var9_ref.field_g);
                                                          if (!this.field_g) {
                                                            discarded$7 = Class.forName("uj").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_b, new Object[]{var15, new Boolean(var3_int != 0)});
                                                            break L8;
                                                          } else {
                                                            this.field_l.a(var15, -110, var3_int != 0);
                                                            break L8;
                                                          }
                                                        } else {
                                                          break L10;
                                                        }
                                                      }
                                                    }
                                                    L12: {
                                                      if (this.field_g) {
                                                        break L12;
                                                      } else {
                                                        if (17 == var2_int) {
                                                          var14 = (Object[]) (var9_ref.field_g);
                                                          discarded$8 = Class.forName("uj").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_b, new Object[]{var14[0], var14[1], new Integer(var9_ref.field_e), new Integer(var9_ref.field_c), var14[2]});
                                                          break L8;
                                                        } else {
                                                          break L12;
                                                        }
                                                      }
                                                    }
                                                    if (16 == var2_int) {
                                                      try {
                                                        L13: {
                                                          if (!field_x.startsWith("win")) {
                                                            throw pd.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          } else {
                                                            L14: {
                                                              var8 = (String) (var9_ref.field_g);
                                                              if (var8.startsWith("http://")) {
                                                                break L14;
                                                              } else {
                                                                if (!var8.startsWith("https://")) {
                                                                  throw pd.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  break L14;
                                                                }
                                                              }
                                                            }
                                                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L15: while (true) {
                                                              if (var8.length() <= var5) {
                                                                discarded$9 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var8 + "\"");
                                                                var9_ref.field_f = null;
                                                                break L13;
                                                              } else {
                                                                if (0 == (var4_ref_String.indexOf((int) var8.charAt(var5)) ^ -1)) {
                                                                  throw pd.<RuntimeException>$cfr$sneakyThrow(new Exception());
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
                                                        var9_ref.field_f = var3_ref2;
                                                        throw pd.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                                                      }
                                                      break L8;
                                                    } else {
                                                      throw pd.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    }
                                                  }
                                                }
                                              } else {
                                                if (!this.field_g) {
                                                  discarded$10 = Class.forName("vk").getMethod("exit", new Class[]{}).invoke(this.field_p, new Object[]{});
                                                  break L8;
                                                } else {
                                                  this.field_s.a((byte) -54, (java.awt.Frame) (var9_ref.field_g));
                                                  break L8;
                                                }
                                              }
                                            } else {
                                              var13 = new java.awt.Frame("Jagex Full Screen");
                                              var9_ref.field_f = var13;
                                              var13.setResizable(false);
                                              if (!this.field_g) {
                                                discarded$11 = Class.forName("vk").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_p, new Object[]{var13, new Integer(var9_ref.field_e >>> 100150608), new Integer(var9_ref.field_e & 65535), new Integer(var9_ref.field_c >> -1393109456), new Integer(var9_ref.field_c & 65535)});
                                                break L8;
                                              } else {
                                                this.field_s.a(-80, var9_ref.field_c & 65535, var13, var9_ref.field_e >>> -1094514160, 65535 & var9_ref.field_e, var9_ref.field_c >> -1421081936);
                                                break L8;
                                              }
                                            }
                                          } else {
                                            if (this.field_g) {
                                              var9_ref.field_f = this.field_s.a(123);
                                              break L8;
                                            } else {
                                              var9_ref.field_f = Class.forName("vk").getMethod("listmodes", new Class[]{}).invoke(this.field_p, new Object[]{});
                                              break L8;
                                            }
                                          }
                                        } else {
                                          if (hc.a(-9986) >= field_f) {
                                            var9_ref.field_f = java.net.InetAddress.getByName((String) (var9_ref.field_g)).getAddress();
                                            break L8;
                                          } else {
                                            throw new IOException();
                                          }
                                        }
                                      } else {
                                        if ((field_f ^ -1L) >= (hc.a(-9986) ^ -1L)) {
                                          var12 = (var9_ref.field_e >> 1988519064 & 255) + "." + ((16761372 & var9_ref.field_e) >> 1374038736) + "." + (255 & var9_ref.field_e >> -1438212376) + "." + (255 & var9_ref.field_e);
                                          var9_ref.field_f = java.net.InetAddress.getByName(var12).getHostName();
                                          break L8;
                                        } else {
                                          throw new IOException();
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                L16: {
                                  var11 = (Object[]) (var9_ref.field_g);
                                  if (!this.field_a) {
                                    break L16;
                                  } else {
                                    if (null == ((Class) (var11[0])).getClassLoader()) {
                                      throw new SecurityException();
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                                var9_ref.field_f = ((Class) (var11[0])).getDeclaredField((String) (var11[1]));
                                break L8;
                              }
                            } else {
                              L17: {
                                var10 = (Object[]) (var9_ref.field_g);
                                if (this.field_a) {
                                  if (null != ((Class) (var10[0])).getClassLoader()) {
                                    break L17;
                                  } else {
                                    throw new SecurityException();
                                  }
                                } else {
                                  break L17;
                                }
                              }
                              var9_ref.field_f = ((Class) (var10[0])).getDeclaredMethod((String) (var10[1]), (Class[]) (var10[2]));
                              break L8;
                            }
                          }
                        }
                      } else {
                        if (hc.a(-9986) < field_f) {
                          throw new IOException();
                        } else {
                          try {
                              if (false) throw (te) null;
                            L18: {
                              var9_ref.field_f = ig.a(var9_ref.field_e, (String) (var9_ref.field_g), -92).b(-18982);
                              break L18;
                            }
                          } catch (te decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref = (te) (Object) decompiledCaughtException;
                            var9_ref.field_f = var3_ref.getMessage();
                            throw var3_ref;
                          }
                          break L8;
                        }
                      }
                    } else {
                      if (field_f > hc.a(-9986)) {
                        throw new IOException();
                      } else {
                        var9_ref.field_f = new java.net.Socket(java.net.InetAddress.getByName((String) (var9_ref.field_g)), var9_ref.field_e);
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

    final un a(int param0, int param1, int param2, int param3, int param4) {
        if (param3 != 1289287280) {
            this.a(50);
        }
        return this.a(6, (byte) -30, param4 + (param2 << 1289287280), (Object) null, (param1 << 1011124560) - -param0);
    }

    final un a(int param0, Runnable param1, int param2) {
        if (param2 != 255) {
            field_d = (String) null;
        }
        return this.a(2, (byte) -30, param0, param1, 0);
    }

    final un a(Class param0, String param1, boolean param2) {
        un discarded$0 = null;
        if (!param2) {
            Object var5 = (Object) null;
            discarded$0 = this.a(-84, (byte) -3, -6, (Object) null, -93);
        }
        return this.a(9, (byte) -30, 0, new Object[]{param0, param1}, 0);
    }

    final un a(int param0, int param1, String param2) {
        if (param1 != 27402) {
            return (un) null;
        }
        return this.a(param1 + -27401, false, param2, param0);
    }

    private final static ji a(String param0, String param1, int param2, int param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            Object var7 = null;
            Exception var8 = null;
            ji var8_ref = null;
            ji stackIn_14_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            ji stackOut_13_0 = null;
            String var7_ref = null;
            L0: {
              if (param3 == 100150608) {
                break L0;
              } else {
                field_k = (String) null;
                break L0;
              }
            }
            L1: {
              if (33 != param2) {
                if (-35 != (param2 ^ -1)) {
                  var4 = "jagex_" + param0 + "_preferences" + param1 + ".dat";
                  break L1;
                } else {
                  var4 = "jagex_" + param0 + "_preferences" + param1 + "_wip.dat";
                  break L1;
                }
              } else {
                var4 = "jagex_" + param0 + "_preferences" + param1 + "_rc.dat";
                break L1;
              }
            }
            var5_array = new String[]{"c:/rscache/", "/rscache/", field_r, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            var6 = 0;
            L2: while (true) {
              if (var6 < var5_array.length) {
                L3: {
                  var7_ref = var5_array[var6];
                  if (0 >= var7_ref.length()) {
                    break L3;
                  } else {
                    if (new File(var7_ref).exists()) {
                      break L3;
                    } else {
                      var6++;
                      continue L2;
                    }
                  }
                }
                try {
                  L4: {
                    var8_ref = new ji(new File(var7_ref, var4), "rw", 10000L);
                    stackOut_13_0 = (ji) (var8_ref);
                    stackIn_14_0 = stackOut_13_0;
                    decompiledRegionSelector0 = 0;
                    break L4;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    var8 = (Exception) (Object) decompiledCaughtException;
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

    private final un a(int param0, boolean param1, String param2, int param3) {
        if (param0 != 1) {
            return (un) null;
        }
        return this.a(param1 ? 22 : 1, (byte) -30, param3, param2, 0);
    }

    final un a(java.net.URL param0, boolean param1) {
        if (!param1) {
            field_n = (String) null;
        }
        return this.a(4, (byte) -30, 0, param0, 0);
    }

    final un a(Class param0, Class[] param1, boolean param2, String param3) {
        un discarded$0 = null;
        if (!param2) {
            String var6 = (String) null;
            discarded$0 = this.a((Class) null, (Class[]) null, true, (String) null);
        }
        return this.a(8, (byte) -30, 0, new Object[]{param0, param3, param1}, 0);
    }

    private final un a(int param0, byte param1, int param2, Object param3, int param4) {
        un var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        var6 = new un();
        var6.field_g = param3;
        if (param1 == -30) {
          var6.field_e = param2;
          var6.field_c = param4;
          var6.field_b = param0;
          var7 = this;
          synchronized (var7) {
            L0: {
              L1: {
                if (this.field_m != null) {
                  this.field_m.field_d = var6;
                  this.field_m = var6;
                  break L1;
                } else {
                  this.field_h = var6;
                  this.field_m = var6;
                  break L1;
                }
              }
              this.notify();
              break L0;
            }
          }
          return var6;
        } else {
          return (un) null;
        }
    }

    final void a(int param0) {
        try {
            Object var2 = null;
            InterruptedException var2_ref = null;
            IOException var2_ref2 = null;
            int var2_int = 0;
            Throwable var3 = null;
            IOException var3_ref = null;
            Throwable decompiledCaughtException = null;
            var2 = this;
            synchronized (var2) {
              L0: {
                this.field_e = true;
                this.notifyAll();
                break L0;
              }
            }
            try {
              L1: {
                this.field_t.join();
                break L1;
              }
            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var2_ref = (InterruptedException) (Object) decompiledCaughtException;
                break L2;
              }
            }
            if (param0 == 23607) {
              L3: {
                if (this.field_c != null) {
                  try {
                    L4: {
                      this.field_c.b(0);
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
                if (null == this.field_j) {
                  break L6;
                } else {
                  try {
                    L7: {
                      this.field_j.b(0);
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
                if (this.field_i != null) {
                  var2_int = 0;
                  L10: while (true) {
                    if (this.field_i.length <= var2_int) {
                      break L9;
                    } else {
                      if (null != this.field_i[var2_int]) {
                        try {
                          L11: {
                            this.field_i[var2_int].b(0);
                            var2_int++;
                            break L11;
                          }
                        } catch (java.io.IOException decompiledCaughtParameter3) {
                          decompiledCaughtException = decompiledCaughtParameter3;
                          L12: {
                            var3_ref = (IOException) (Object) decompiledCaughtException;
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
                if (this.field_o != null) {
                  try {
                    L14: {
                      this.field_o.b(0);
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
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final un a(byte param0) {
        if (param0 > -106) {
            this.field_o = (ji) null;
        }
        return this.a(5, (byte) -30, 0, (Object) null, 0);
    }

    final boolean b(int param0) {
        int var2 = 71 % ((param0 - -58) / 60);
        if (!(this.field_a)) {
            return false;
        }
        if (this.field_g) {
            return this.field_s != null ? true : false;
        }
        return this.field_p != null ? true : false;
    }

    pd(int param0, String param1, int param2, boolean param3) throws Exception {
        String discarded$7 = null;
        String discarded$8 = null;
        java.lang.reflect.Method discarded$9 = null;
        Object discarded$10 = null;
        Exception exception = null;
        Throwable throwable = null;
        int var5_int = 0;
        om var6 = null;
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
          this.field_g = false;
          this.field_a = false;
          this.field_m = null;
          this.field_h = null;
          this.field_e = false;
          this.field_j = null;
          this.field_o = null;
          this.field_c = null;
          field_u = param0;
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
        ((pd) (this)).field_a = stackIn_3_1 != 0;
        field_k = "1.1";
        field_q = "Unknown";
        field_n = param1;
        try {
          L1: {
            field_q = System.getProperty("java.vendor");
            field_k = System.getProperty("java.version");
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
          if (field_q.toLowerCase().indexOf("microsoft") != -1) {
            this.field_g = true;
            break L3;
          } else {
            break L3;
          }
        }
        try {
          L4: {
            field_d = System.getProperty("os.name");
            break L4;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            exception = (Exception) (Object) decompiledCaughtException;
            field_d = "Unknown";
            break L5;
          }
        }
        field_x = field_d.toLowerCase();
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
            this.field_w = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
          if (this.field_g) {
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
          ui.a((byte) 125, field_u, field_n);
          if (!this.field_a) {
            break L21;
          } else {
            this.field_o = new ji(ui.a((byte) 123, (String) null, "random.dat", field_u), "rw", 25L);
            this.field_c = new ji(ui.a("main_file_cache.dat2", (byte) -83), "rw", 314572800L);
            this.field_j = new ji(ui.a("main_file_cache.idx255", (byte) -83), "rw", 1048576L);
            this.field_i = new ji[param2];
            var5_int = 0;
            L22: while (true) {
              if (param2 <= var5_int) {
                L23: {
                  if (this.field_g) {
                    try {
                      L24: {
                        discarded$10 = Class.forName("jn").newInstance();
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
                      if (!this.field_g) {
                        this.field_p = Class.forName("vk").newInstance();
                        break L27;
                      } else {
                        var6 = new om();
                        this.field_s = var6;
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
                      if (this.field_g) {
                        this.field_l = new ki();
                        break L30;
                      } else {
                        this.field_b = Class.forName("uj").newInstance();
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
                this.field_i[var5_int] = new ji(ui.a("main_file_cache.idx" + var5_int, (byte) -83), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        this.field_e = false;
        this.field_t = new Thread((Runnable) (this));
        this.field_t.setPriority(10);
        this.field_t.setDaemon(true);
        this.field_t.start();
    }

    static {
        field_f = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
