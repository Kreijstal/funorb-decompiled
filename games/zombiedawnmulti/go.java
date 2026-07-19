/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class go implements Runnable {
    private Object field_b;
    mc field_k;
    mc field_i;
    private Object field_x;
    java.awt.EventQueue field_j;
    private di field_f;
    static java.lang.reflect.Method field_h;
    private tc field_m;
    private static String field_o;
    mc[] field_t;
    private static String field_c;
    private boolean field_w;
    static String field_l;
    static String field_q;
    private boolean field_v;
    private di field_u;
    mc field_s;
    boolean field_d;
    private cl field_p;
    private static volatile long field_g;
    private Thread field_n;
    static String field_r;
    private static int field_e;
    private static String field_a;

    final di a(int param0, Runnable param1, int param2) {
        if (param0 < 19) {
            this.field_v = true;
        }
        return this.a(2, param1, true, param2, 0);
    }

    final di a(Class[] param0, boolean param1, Class param2, String param3) {
        if (param1) {
            return (di) null;
        }
        return this.a(8, new Object[]{param2, param3, param0}, true, 0, 0);
    }

    final void b(int param0) {
        try {
            di discarded$1 = null;
            InterruptedException var2 = null;
            IOException var2_ref = null;
            int var2_int = 0;
            Object var2_ref2 = null;
            Throwable var3 = null;
            IOException var3_ref = null;
            java.awt.Frame var4 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (param0 > 123) {
                break L0;
              } else {
                var4 = (java.awt.Frame) null;
                discarded$1 = this.a((java.awt.Frame) null, true);
                break L0;
              }
            }
            var2_ref2 = this;
            synchronized (var2_ref2) {
              L1: {
                this.field_w = true;
                this.notifyAll();
                break L1;
              }
            }
            try {
              L2: {
                this.field_n.join();
                break L2;
              }
            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L3: {
                var2 = (InterruptedException) (Object) decompiledCaughtException;
                break L3;
              }
            }
            L4: {
              if (null == this.field_i) {
                break L4;
              } else {
                try {
                  L5: {
                    this.field_i.b((byte) 38);
                    break L5;
                  }
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L6: {
                    var2_ref = (IOException) (Object) decompiledCaughtException;
                    break L6;
                  }
                }
                break L4;
              }
            }
            L7: {
              if (null != this.field_k) {
                try {
                  L8: {
                    this.field_k.b((byte) 38);
                    break L8;
                  }
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L9: {
                    var2_ref = (IOException) (Object) decompiledCaughtException;
                    break L9;
                  }
                }
                break L7;
              } else {
                break L7;
              }
            }
            L10: {
              if (null == this.field_t) {
                break L10;
              } else {
                var2_int = 0;
                L11: while (true) {
                  if (var2_int >= this.field_t.length) {
                    break L10;
                  } else {
                    if (this.field_t[var2_int] != null) {
                      try {
                        L12: {
                          this.field_t[var2_int].b((byte) 38);
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
              }
            }
            L14: {
              if (null == this.field_s) {
                break L14;
              } else {
                try {
                  L15: {
                    this.field_s.b((byte) 38);
                    break L15;
                  }
                } catch (java.io.IOException decompiledCaughtParameter4) {
                  decompiledCaughtException = decompiledCaughtParameter4;
                  L16: {
                    var2_ref = (IOException) (Object) decompiledCaughtException;
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

    public final void run() {
        try {
            Object discarded$6 = null;
            Object discarded$7 = null;
            Object discarded$8 = null;
            Object discarded$9 = null;
            Process discarded$10 = null;
            Object discarded$11 = null;
            Object var2 = null;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            int var2_int = 0;
            InterruptedException var3_ref_InterruptedException = null;
            en var3_ref_en = null;
            Exception var3_ref_Exception = null;
            mc var3_ref_mc = null;
            int var3 = 0;
            Throwable var4_ref_Throwable = null;
            int var4 = 0;
            String var4_ref_String = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            Object var8 = null;
            di var8_ref = null;
            Thread var9 = null;
            Object[] var10 = null;
            java.awt.Frame var11 = null;
            Object[] var12 = null;
            String var13 = null;
            java.awt.Component var14 = null;
            String var15 = null;
            java.awt.datatransfer.Clipboard var16 = null;
            java.awt.datatransfer.Clipboard var17 = null;
            Object[] var18 = null;
            int stackIn_88_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_87_0 = 0;
            int stackOut_86_0 = 0;
            L0: while (true) {
              synchronized (var2) {
                L1: {
                  var8_ref.notify();
                  var2 = this;
                  break L1;
                }
              }
              synchronized (var2) {
                L2: {
                  L3: while (true) {
                    if (!this.field_w) {
                      if (this.field_f == null) {
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
                        continue L3;
                      } else {
                        L6: {
                          var8_ref = this.field_f;
                          this.field_f = this.field_f.field_e;
                          if (null != this.field_f) {
                            break L6;
                          } else {
                            this.field_u = null;
                            break L6;
                          }
                        }
                        break L2;
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
                    var2_int = var8_ref.field_g;
                    if (var2_int == 1) {
                      if ((field_g ^ -1L) >= (bl.a((byte) 109) ^ -1L)) {
                        var8_ref.field_d = new java.net.Socket(java.net.InetAddress.getByName((String) (var8_ref.field_a)), var8_ref.field_c);
                        break L8;
                      } else {
                        throw new IOException();
                      }
                    } else {
                      if (-23 != (var2_int ^ -1)) {
                        if ((var2_int ^ -1) != -3) {
                          if (4 != var2_int) {
                            if (var2_int != 8) {
                              if (9 == var2_int) {
                                L9: {
                                  var18 = (Object[]) (var8_ref.field_a);
                                  if (this.field_d) {
                                    if (null == ((Class) (var18[0])).getClassLoader()) {
                                      throw new SecurityException();
                                    } else {
                                      break L9;
                                    }
                                  } else {
                                    break L9;
                                  }
                                }
                                var8_ref.field_d = ((Class) (var18[0])).getDeclaredField((String) (var18[1]));
                                break L8;
                              } else {
                                if (var2_int == 18) {
                                  var17 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8_ref.field_d = var17.getContents((Object) null);
                                  break L8;
                                } else {
                                  if ((var2_int ^ -1) == -20) {
                                    var7 = (java.awt.datatransfer.Transferable) (var8_ref.field_a);
                                    var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var16.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L8;
                                  } else {
                                    if (this.field_d) {
                                      if (-4 == (var2_int ^ -1)) {
                                        if (bl.a((byte) 85) < field_g) {
                                          throw new IOException();
                                        } else {
                                          var15 = (255 & var8_ref.field_c >> -1062958824) + "." + ((var8_ref.field_c & 16770086) >> -1606534896) + "." + ((65396 & var8_ref.field_c) >> -617841688) + "." + (255 & var8_ref.field_c);
                                          var8_ref.field_d = java.net.InetAddress.getByName(var15).getHostName();
                                          break L8;
                                        }
                                      } else {
                                        if (21 != var2_int) {
                                          if (var2_int != 5) {
                                            if (-7 != (var2_int ^ -1)) {
                                              if ((var2_int ^ -1) == -8) {
                                                if (!this.field_v) {
                                                  discarded$6 = Class.forName("te").getMethod("exit", new Class[]{}).invoke(this.field_b, new Object[]{});
                                                  break L8;
                                                } else {
                                                  this.field_m.a((java.awt.Frame) (var8_ref.field_a), (byte) 3);
                                                  break L8;
                                                }
                                              } else {
                                                if (-13 != (var2_int ^ -1)) {
                                                  if ((var2_int ^ -1) != -14) {
                                                    L10: {
                                                      if (!this.field_d) {
                                                        break L10;
                                                      } else {
                                                        if (-15 == (var2_int ^ -1)) {
                                                          var3 = var8_ref.field_c;
                                                          var4 = var8_ref.field_b;
                                                          if (this.field_v) {
                                                            this.field_p.a(var4, -12, var3);
                                                            break L8;
                                                          } else {
                                                            discarded$7 = Class.forName("to").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_x, new Object[]{new Integer(var3), new Integer(var4)});
                                                            break L8;
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
                                                            if (var8_ref.field_c == 0) {
                                                              stackOut_87_0 = 0;
                                                              stackIn_88_0 = stackOut_87_0;
                                                              break L12;
                                                            } else {
                                                              stackOut_86_0 = 1;
                                                              stackIn_88_0 = stackOut_86_0;
                                                              break L12;
                                                            }
                                                          }
                                                          var3 = stackIn_88_0;
                                                          var14 = (java.awt.Component) (var8_ref.field_a);
                                                          if (this.field_v) {
                                                            this.field_p.a(var14, var3 != 0, -1101);
                                                            break L8;
                                                          } else {
                                                            discarded$8 = Class.forName("to").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_x, new Object[]{var14, new Boolean(var3 != 0)});
                                                            break L8;
                                                          }
                                                        } else {
                                                          break L11;
                                                        }
                                                      }
                                                    }
                                                    L13: {
                                                      if (this.field_v) {
                                                        break L13;
                                                      } else {
                                                        if (var2_int != 17) {
                                                          break L13;
                                                        } else {
                                                          var12 = (Object[]) (var8_ref.field_a);
                                                          discarded$9 = Class.forName("to").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_x, new Object[]{var12[0], var12[1], new Integer(var8_ref.field_c), new Integer(var8_ref.field_b), var12[2]});
                                                          break L8;
                                                        }
                                                      }
                                                    }
                                                    if (16 != var2_int) {
                                                      throw go.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    } else {
                                                      try {
                                                        L14: {
                                                          if (!field_l.startsWith("win")) {
                                                            throw go.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          } else {
                                                            L15: {
                                                              var13 = (String) (var8_ref.field_a);
                                                              if (var13.startsWith("http://")) {
                                                                break L15;
                                                              } else {
                                                                if (!var13.startsWith("https://")) {
                                                                  throw go.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  break L15;
                                                                }
                                                              }
                                                            }
                                                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L16: while (true) {
                                                              if (var13.length() <= var5) {
                                                                discarded$10 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var13 + "\"");
                                                                var8_ref.field_d = null;
                                                                break L14;
                                                              } else {
                                                                if (-1 == var4_ref_String.indexOf((int) var13.charAt(var5))) {
                                                                  throw go.<RuntimeException>$cfr$sneakyThrow(new Exception());
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
                                                        var3_ref_Exception = (Exception) (Object) decompiledCaughtException;
                                                        var8_ref.field_d = var3_ref_Exception;
                                                        throw go.<RuntimeException>$cfr$sneakyThrow(var3_ref_Exception);
                                                      }
                                                      break L8;
                                                    }
                                                  } else {
                                                    var3_ref_mc = go.a("", (String) (var8_ref.field_a), true, field_e);
                                                    var8_ref.field_d = var3_ref_mc;
                                                    break L8;
                                                  }
                                                } else {
                                                  var3_ref_mc = go.a(field_c, (String) (var8_ref.field_a), true, field_e);
                                                  var8_ref.field_d = var3_ref_mc;
                                                  break L8;
                                                }
                                              }
                                            } else {
                                              var11 = new java.awt.Frame("Jagex Full Screen");
                                              var8_ref.field_d = var11;
                                              var11.setResizable(false);
                                              if (this.field_v) {
                                                this.field_m.a(65535 & var8_ref.field_b, var8_ref.field_c >>> 1665071856, var8_ref.field_c & 65535, var11, 0, var8_ref.field_b >> 2113147600);
                                                break L8;
                                              } else {
                                                discarded$11 = Class.forName("te").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_b, new Object[]{var11, new Integer(var8_ref.field_c >>> -1483244304), new Integer(65535 & var8_ref.field_c), new Integer(var8_ref.field_b >> -1675426800), new Integer(var8_ref.field_b & 65535)});
                                                break L8;
                                              }
                                            }
                                          } else {
                                            if (!this.field_v) {
                                              var8_ref.field_d = Class.forName("te").getMethod("listmodes", new Class[]{}).invoke(this.field_b, new Object[]{});
                                              break L8;
                                            } else {
                                              var8_ref.field_d = this.field_m.a(81);
                                              break L8;
                                            }
                                          }
                                        } else {
                                          if ((bl.a((byte) 53) ^ -1L) > (field_g ^ -1L)) {
                                            throw new IOException();
                                          } else {
                                            var8_ref.field_d = java.net.InetAddress.getByName((String) (var8_ref.field_a)).getAddress();
                                            break L8;
                                          }
                                        }
                                      }
                                    } else {
                                      throw go.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    }
                                  }
                                }
                              }
                            } else {
                              L17: {
                                var10 = (Object[]) (var8_ref.field_a);
                                if (this.field_d) {
                                  if (null != ((Class) (var10[0])).getClassLoader()) {
                                    break L17;
                                  } else {
                                    throw new SecurityException();
                                  }
                                } else {
                                  break L17;
                                }
                              }
                              var8_ref.field_d = ((Class) (var10[0])).getDeclaredMethod((String) (var10[1]), (Class[]) (var10[2]));
                              break L8;
                            }
                          } else {
                            if (field_g > bl.a((byte) 119)) {
                              throw new IOException();
                            } else {
                              var8_ref.field_d = new DataInputStream(((java.net.URL) (var8_ref.field_a)).openStream());
                              break L8;
                            }
                          }
                        } else {
                          var9 = new Thread((Runnable) (var8_ref.field_a));
                          var9.setDaemon(true);
                          var9.start();
                          var9.setPriority(var8_ref.field_c);
                          var8_ref.field_d = var9;
                          break L8;
                        }
                      } else {
                        if (field_g <= bl.a((byte) 92)) {
                          try {
                              if (false) throw (en) null;
                            L18: {
                              var8_ref.field_d = wj.a((byte) 3, var8_ref.field_c, (String) (var8_ref.field_a)).b(4646);
                              break L18;
                            }
                          } catch (en decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref_en = (en) (Object) decompiledCaughtException;
                            var8_ref.field_d = var3_ref_en.getMessage();
                            throw var3_ref_en;
                          }
                          break L8;
                        } else {
                          throw new IOException();
                        }
                      }
                    }
                  }
                  var8_ref.field_f = 1;
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
                  var8_ref.field_f = 2;
                  break L19;
                }
              }
              var2 = var8_ref;
              continue L0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final di a(boolean param0, java.awt.Component param1, int param2) {
        di discarded$0 = null;
        if (param2 != -14697) {
            String var5 = (String) null;
            discarded$0 = this.a((String) null, -2, (byte) -60);
        }
        return this.a(15, param1, true, param0 ? 1 : 0, 0);
    }

    private final di a(int param0, Object param1, boolean param2, int param3, int param4) {
        di var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          var6 = new di();
          if (param2) {
            break L0;
          } else {
            field_r = (String) null;
            break L0;
          }
        }
        var6.field_c = param3;
        var6.field_b = param4;
        var6.field_a = param1;
        var6.field_g = param0;
        var7 = this;
        synchronized (var7) {
          L1: {
            L2: {
              if (this.field_u != null) {
                this.field_u.field_e = var6;
                this.field_u = var6;
                break L2;
              } else {
                this.field_f = var6;
                this.field_u = var6;
                break L2;
              }
            }
            this.notify();
            break L1;
          }
        }
        return var6;
    }

    private final static mc a(String param0, String param1, boolean param2, int param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            mc var8_ref = null;
            mc stackIn_11_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            mc stackOut_10_0 = null;
            L0: {
              if ((param3 ^ -1) != -34) {
                if (-35 == (param3 ^ -1)) {
                  var4 = "jagex_" + param0 + "_preferences" + param1 + "_wip.dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param0 + "_preferences" + param1 + ".dat";
                  break L0;
                }
              } else {
                var4 = "jagex_" + param0 + "_preferences" + param1 + "_rc.dat";
                break L0;
              }
            }
            var5_array = new String[]{"c:/rscache/", "/rscache/", field_o, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            var6 = 0;
            L1: while (true) {
              if (var6 >= var5_array.length) {
                if (!param2) {
                  field_g = -28L;
                  return null;
                } else {
                  return null;
                }
              } else {
                L2: {
                  var7 = var5_array[var6];
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
                    var8_ref = new mc(new File(var7, var4), "rw", 10000L);
                    stackOut_10_0 = (mc) (var8_ref);
                    stackIn_11_0 = stackOut_10_0;
                    decompiledRegionSelector0 = 0;
                    break L3;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var8 = (Exception) (Object) decompiledCaughtException;
                    var6++;
                    decompiledRegionSelector0 = 1;
                    break L4;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  return stackIn_11_0;
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

    final di a(byte param0, String param1, Class param2) {
        int var4 = 81 / ((param0 - 7) / 59);
        return this.a(9, new Object[]{param2, param1}, true, 0, 0);
    }

    final di a(String param0, int param1, byte param2) {
        if (param2 != -120) {
            this.field_p = (cl) null;
        }
        return this.a((byte) -121, param0, param1, false);
    }

    final boolean a(int param0) {
        if (!this.field_d) {
            return false;
        }
        if (param0 >= -35) {
            this.field_p = (cl) null;
        }
        if (this.field_v) {
            return null != this.field_m ? true : false;
        }
        return null != this.field_b ? true : false;
    }

    final di c(int param0) {
        if (param0 != 0) {
            this.run();
        }
        return this.a(5, (Object) null, true, 0, 0);
    }

    final di a(java.awt.Frame param0, boolean param1) {
        di discarded$0 = null;
        if (!param1) {
            String var4 = (String) null;
            discarded$0 = this.a((Class[]) null, true, (Class) null, (String) null);
        }
        return this.a(7, param0, true, 0, 0);
    }

    private final di a(byte param0, String param1, int param2, boolean param3) {
        int var5 = -62 / ((param0 - -53) / 58);
        return this.a(!param3 ? 1 : 22, param1, true, param2, 0);
    }

    final di a(byte param0, java.net.URL param1) {
        if (param0 != -12) {
            field_r = (String) null;
        }
        return this.a(4, param1, true, 0, 0);
    }

    final di a(int param0, byte param1, int param2, int param3, int param4) {
        int var6 = 66 % ((param1 - 73) / 53);
        return this.a(6, (Object) null, true, param4 + (param0 << -1330614192), (param3 << -505898800) - -param2);
    }

    go(int param0, String param1, int param2, boolean param3) throws Exception {
        String discarded$8 = null;
        String discarded$9 = null;
        java.lang.reflect.Method discarded$10 = null;
        Object discarded$11 = null;
        Exception exception = null;
        Throwable throwable = null;
        int var5_int = 0;
        tc var7 = null;
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
          this.field_i = null;
          this.field_f = null;
          this.field_w = false;
          this.field_k = null;
          this.field_s = null;
          this.field_u = null;
          this.field_d = false;
          this.field_v = false;
          field_c = param1;
          field_e = param0;
          field_q = "1.1";
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
        ((go) (this)).field_d = stackIn_3_1 != 0;
        field_r = "Unknown";
        try {
          L1: {
            field_r = System.getProperty("java.vendor");
            field_q = System.getProperty("java.version");
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
          if (0 == (field_r.toLowerCase().indexOf("microsoft") ^ -1)) {
            break L3;
          } else {
            this.field_v = true;
            break L3;
          }
        }
        try {
          L4: {
            field_a = System.getProperty("os.name");
            break L4;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            exception = (Exception) (Object) decompiledCaughtException;
            field_a = "Unknown";
            break L5;
          }
        }
        field_l = field_a.toLowerCase();
        try {
          L6: {
            discarded$8 = System.getProperty("os.arch").toLowerCase();
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
            discarded$9 = System.getProperty("os.version").toLowerCase();
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
              field_o = System.getProperty("user.home");
              if (null == field_o) {
                break L11;
              } else {
                field_o = field_o + "/";
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
          if (field_o != null) {
            break L13;
          } else {
            field_o = "~/";
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
          if (this.field_v) {
            break L16;
          } else {
            try {
              L17: {
                discarded$10 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[]{Boolean.TYPE});
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
                field_h = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
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
          nd.a(field_c, field_e, -7682);
          if (!this.field_d) {
            break L21;
          } else {
            this.field_s = new mc(nd.a("random.dat", -25157, (String) null, field_e), "rw", 25L);
            this.field_i = new mc(nd.a("main_file_cache.dat2", 0), "rw", 314572800L);
            this.field_k = new mc(nd.a("main_file_cache.idx255", 0), "rw", 1048576L);
            this.field_t = new mc[param2];
            var5_int = 0;
            L22: while (true) {
              if (var5_int >= param2) {
                L23: {
                  if (!this.field_v) {
                    break L23;
                  } else {
                    try {
                      L24: {
                        discarded$11 = Class.forName("rd").newInstance();
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
                      if (this.field_v) {
                        var7 = new tc();
                        this.field_m = var7;
                        break L27;
                      } else {
                        this.field_b = Class.forName("te").newInstance();
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
                      if (!this.field_v) {
                        this.field_x = Class.forName("to").newInstance();
                        break L30;
                      } else {
                        this.field_p = new cl();
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
                this.field_t[var5_int] = new mc(nd.a("main_file_cache.idx" + var5_int, 0), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        this.field_w = false;
        this.field_n = new Thread((Runnable) (this));
        this.field_n.setPriority(10);
        this.field_n.setDaemon(true);
        this.field_n.start();
    }

    static {
        field_g = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
