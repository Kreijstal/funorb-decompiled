/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class un implements Runnable {
    private Object field_v;
    private in field_t;
    private static String field_r;
    private gb field_o;
    gl field_g;
    private gb field_b;
    private static int field_c;
    static String field_m;
    private Object field_w;
    gl field_s;
    private boolean field_q;
    gl[] field_n;
    static String field_u;
    static java.lang.reflect.Method field_l;
    private static volatile long field_k;
    static String field_e;
    private hh field_x;
    java.awt.EventQueue field_d;
    private Thread field_j;
    private boolean field_i;
    private static String field_f;
    boolean field_h;
    gl field_p;
    private static String field_a;

    final gb a(byte param0, Class param1, Class[] param2, String param3) {
        if (param0 > -49) {
            this.run();
        }
        return this.a(0, 8, new Object[]{param1, param3, param2}, true, 0);
    }

    final boolean b(int param0) {
        if (param0 != 5) {
            this.field_d = (java.awt.EventQueue) null;
        }
        if (!(this.field_h)) {
            return false;
        }
        if (!this.field_i) {
            return this.field_v != null ? true : false;
        }
        return this.field_x != null ? true : false;
    }

    final gb a(int param0, String param1, Class param2) {
        int var4 = -116 % ((param0 - -49) / 40);
        return this.a(0, 9, new Object[]{param2, param1}, true, 0);
    }

    private final static gl a(String param0, int param1, int param2, String param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            gl var8_ref = null;
            gl stackIn_14_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            gl stackOut_13_0 = null;
            L0: {
              if (33 != param2) {
                if ((param2 ^ -1) == -35) {
                  var4 = "jagex_" + param3 + "_preferences" + param0 + "_wip.dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param3 + "_preferences" + param0 + ".dat";
                  break L0;
                }
              } else {
                var4 = "jagex_" + param3 + "_preferences" + param0 + "_rc.dat";
                break L0;
              }
            }
            var5_array = new String[]{"c:/rscache/", "/rscache/", field_f, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            var6 = 0;
            if (param1 < -12) {
              L1: while (true) {
                if (var6 < var5_array.length) {
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
                      var8_ref = new gl(new File(var7, var4), "rw", 10000L);
                      stackOut_13_0 = (gl) (var8_ref);
                      stackIn_14_0 = stackOut_13_0;
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
                    return stackIn_14_0;
                  } else {
                    continue L1;
                  }
                } else {
                  return null;
                }
              }
            } else {
              return (gl) null;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final gb a(byte param0) {
        gb discarded$0 = null;
        if (param0 > -12) {
            String var3 = (String) null;
            discarded$0 = this.a(-51, false, (String) null);
        }
        return this.a(0, 5, (Object) null, true, 0);
    }

    private final gb a(int param0, int param1, Object param2, boolean param3, int param4) {
        gb var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        var6 = new gb();
        var6.field_g = param4;
        var6.field_e = param2;
        var6.field_f = param0;
        var6.field_d = param1;
        var7 = this;
        synchronized (var7) {
          L0: {
            L1: {
              if (param3) {
                break L1;
              } else {
                field_c = -46;
                break L1;
              }
            }
            L2: {
              if (null == this.field_o) {
                this.field_b = var6;
                this.field_o = var6;
                break L2;
              } else {
                this.field_o.field_c = var6;
                this.field_o = var6;
                break L2;
              }
            }
            this.notify();
            break L0;
          }
        }
        return var6;
    }

    final gb a(int param0, java.net.URL param1) {
        if (param0 != 5) {
            return (gb) null;
        }
        return this.a(0, 4, param1, true, 0);
    }

    final gb a(java.awt.Frame param0, byte param1) {
        gb discarded$0 = null;
        if (param1 != -116) {
            Runnable var4 = (Runnable) null;
            discarded$0 = this.a((Runnable) null, 17, -112);
        }
        return this.a(0, 7, param0, true, 0);
    }

    final gb a(int param0, boolean param1, String param2) {
        gb discarded$0 = null;
        if (param1) {
            String var5 = (String) null;
            discarded$0 = this.a(52, false, (String) null);
        }
        return this.a(param2, true, false, param0);
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
                L1: {
                  this.field_q = true;
                  if (param0 > 95) {
                    break L1;
                  } else {
                    field_f = (String) null;
                    break L1;
                  }
                }
                this.notifyAll();
                break L0;
              }
            }
            try {
              L2: {
                this.field_j.join();
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
              if (this.field_p != null) {
                try {
                  L5: {
                    this.field_p.d(107);
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
              if (null != this.field_g) {
                try {
                  L8: {
                    this.field_g.d(102);
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
              if (null != this.field_n) {
                var2_int = 0;
                L11: while (true) {
                  if (var2_int >= this.field_n.length) {
                    break L10;
                  } else {
                    if (this.field_n[var2_int] != null) {
                      try {
                        L12: {
                          this.field_n[var2_int].d(119);
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
              if (null != this.field_s) {
                try {
                  L15: {
                    this.field_s.d(98);
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

    private final gb a(String param0, boolean param1, boolean param2, int param3) {
        if (!param1) {
            return (gb) null;
        }
        return this.a(param3, !param2 ? 1 : 22, param0, param1, 0);
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
            InterruptedException var3 = null;
            Exception var3_ref = null;
            va var3_ref2 = null;
            gl var3_ref3 = null;
            int var3_int = 0;
            Throwable var4 = null;
            int var4_int = 0;
            String var4_ref = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            Object var8 = null;
            gb var8_ref = null;
            Object[] var9 = null;
            java.awt.datatransfer.Clipboard var10 = null;
            java.awt.Component var11 = null;
            String var12 = null;
            Object[] var13 = null;
            java.awt.Frame var14 = null;
            String var15 = null;
            java.awt.datatransfer.Clipboard var16 = null;
            Object[] var17 = null;
            Thread var18 = null;
            int stackIn_57_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_56_0 = 0;
            int stackOut_55_0 = 0;
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
                    if (!this.field_q) {
                      if (this.field_b != null) {
                        L4: {
                          var8_ref = this.field_b;
                          this.field_b = this.field_b.field_c;
                          if (this.field_b == null) {
                            this.field_o = null;
                            break L4;
                          } else {
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
                    var2_int = var8_ref.field_d;
                    if ((var2_int ^ -1) == -2) {
                      if (field_k > lo.a((byte) 111)) {
                        throw new IOException();
                      } else {
                        var8_ref.field_b = new java.net.Socket(java.net.InetAddress.getByName((String) (var8_ref.field_e)), var8_ref.field_f);
                        break L8;
                      }
                    } else {
                      if (22 == var2_int) {
                        if (lo.a((byte) 108) < field_k) {
                          throw new IOException();
                        } else {
                          try {
                              if (false) throw (va) null;
                            L9: {
                              var8_ref.field_b = sj.a(var8_ref.field_f, (String) (var8_ref.field_e), (byte) 122).a(true);
                              break L9;
                            }
                          } catch (va decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref2 = (va) (Object) decompiledCaughtException;
                            var8_ref.field_b = var3_ref2.getMessage();
                            throw var3_ref2;
                          }
                          break L8;
                        }
                      } else {
                        if (-3 == (var2_int ^ -1)) {
                          var18 = new Thread((Runnable) (var8_ref.field_e));
                          var18.setDaemon(true);
                          var18.start();
                          var18.setPriority(var8_ref.field_f);
                          var8_ref.field_b = var18;
                          break L8;
                        } else {
                          if ((var2_int ^ -1) != -5) {
                            if ((var2_int ^ -1) == -9) {
                              L10: {
                                var17 = (Object[]) (var8_ref.field_e);
                                if (!this.field_h) {
                                  break L10;
                                } else {
                                  if (null == ((Class) (var17[0])).getClassLoader()) {
                                    throw new SecurityException();
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              var8_ref.field_b = ((Class) (var17[0])).getDeclaredMethod((String) (var17[1]), (Class[]) (var17[2]));
                              break L8;
                            } else {
                              if (9 != var2_int) {
                                if ((var2_int ^ -1) != -19) {
                                  if (var2_int == 19) {
                                    var7 = (java.awt.datatransfer.Transferable) (var8_ref.field_e);
                                    var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var16.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L8;
                                  } else {
                                    if (this.field_h) {
                                      if (-4 == (var2_int ^ -1)) {
                                        if (field_k <= lo.a((byte) 90)) {
                                          var15 = (var8_ref.field_f >> -1945308808 & 255) + "." + (255 & var8_ref.field_f >> 1028868624) + "." + (var8_ref.field_f >> -1219629784 & 255) + "." + (255 & var8_ref.field_f);
                                          var8_ref.field_b = java.net.InetAddress.getByName(var15).getHostName();
                                          break L8;
                                        } else {
                                          throw new IOException();
                                        }
                                      } else {
                                        if ((var2_int ^ -1) == -22) {
                                          if (field_k <= lo.a((byte) 127)) {
                                            var8_ref.field_b = java.net.InetAddress.getByName((String) (var8_ref.field_e)).getAddress();
                                            break L8;
                                          } else {
                                            throw new IOException();
                                          }
                                        } else {
                                          if (var2_int == 5) {
                                            if (!this.field_i) {
                                              var8_ref.field_b = Class.forName("bg").getMethod("listmodes", new Class[]{}).invoke(this.field_v, new Object[]{});
                                              break L8;
                                            } else {
                                              var8_ref.field_b = this.field_x.a((byte) 88);
                                              break L8;
                                            }
                                          } else {
                                            if (-7 == (var2_int ^ -1)) {
                                              var14 = new java.awt.Frame("Jagex Full Screen");
                                              var8_ref.field_b = var14;
                                              var14.setResizable(false);
                                              if (this.field_i) {
                                                this.field_x.a(var8_ref.field_f >>> 1073737104, var8_ref.field_g >> -124729264, (byte) -108, 65535 & var8_ref.field_f, var14, var8_ref.field_g & 65535);
                                                break L8;
                                              } else {
                                                discarded$6 = Class.forName("bg").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_v, new Object[]{var14, new Integer(var8_ref.field_f >>> -505433520), new Integer(65535 & var8_ref.field_f), new Integer(var8_ref.field_g >> 861343120), new Integer(65535 & var8_ref.field_g)});
                                                break L8;
                                              }
                                            } else {
                                              if ((var2_int ^ -1) != -8) {
                                                if (var2_int != 12) {
                                                  if ((var2_int ^ -1) == -14) {
                                                    var3_ref3 = un.a((String) (var8_ref.field_e), -26, field_c, "");
                                                    var8_ref.field_b = var3_ref3;
                                                    break L8;
                                                  } else {
                                                    L11: {
                                                      if (!this.field_h) {
                                                        break L11;
                                                      } else {
                                                        if ((var2_int ^ -1) != -15) {
                                                          break L11;
                                                        } else {
                                                          var3_int = var8_ref.field_f;
                                                          var4_int = var8_ref.field_g;
                                                          if (this.field_i) {
                                                            this.field_t.a(var4_int, var3_int, 0);
                                                            break L8;
                                                          } else {
                                                            discarded$7 = Class.forName("up").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_w, new Object[]{new Integer(var3_int), new Integer(var4_int)});
                                                            break L8;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L12: {
                                                      if (!this.field_h) {
                                                        break L12;
                                                      } else {
                                                        if (15 != var2_int) {
                                                          break L12;
                                                        } else {
                                                          L13: {
                                                            if (-1 == (var8_ref.field_f ^ -1)) {
                                                              stackOut_56_0 = 0;
                                                              stackIn_57_0 = stackOut_56_0;
                                                              break L13;
                                                            } else {
                                                              stackOut_55_0 = 1;
                                                              stackIn_57_0 = stackOut_55_0;
                                                              break L13;
                                                            }
                                                          }
                                                          var3_int = stackIn_57_0;
                                                          var11 = (java.awt.Component) (var8_ref.field_e);
                                                          if (!this.field_i) {
                                                            discarded$8 = Class.forName("up").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_w, new Object[]{var11, new Boolean(var3_int != 0)});
                                                            break L8;
                                                          } else {
                                                            this.field_t.a(var3_int != 0, var11, (byte) 88);
                                                            break L8;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L14: {
                                                      if (this.field_i) {
                                                        break L14;
                                                      } else {
                                                        if (var2_int == 17) {
                                                          var13 = (Object[]) (var8_ref.field_e);
                                                          discarded$9 = Class.forName("up").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_w, new Object[]{var13[0], var13[1], new Integer(var8_ref.field_f), new Integer(var8_ref.field_g), var13[2]});
                                                          break L8;
                                                        } else {
                                                          break L14;
                                                        }
                                                      }
                                                    }
                                                    if (16 == var2_int) {
                                                      try {
                                                        L15: {
                                                          if (!field_u.startsWith("win")) {
                                                            throw un.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          } else {
                                                            L16: {
                                                              var12 = (String) (var8_ref.field_e);
                                                              if (var12.startsWith("http://")) {
                                                                break L16;
                                                              } else {
                                                                if (var12.startsWith("https://")) {
                                                                  break L16;
                                                                } else {
                                                                  throw un.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                            var4_ref = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L17: while (true) {
                                                              if (var5 >= var12.length()) {
                                                                discarded$10 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var12 + "\"");
                                                                var8_ref.field_b = null;
                                                                break L15;
                                                              } else {
                                                                if ((var4_ref.indexOf((int) var12.charAt(var5)) ^ -1) == 0) {
                                                                  throw un.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  var5++;
                                                                  continue L17;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                                                        decompiledCaughtException = decompiledCaughtParameter2;
                                                        var3_ref = (Exception) (Object) decompiledCaughtException;
                                                        var8_ref.field_b = var3_ref;
                                                        throw un.<RuntimeException>$cfr$sneakyThrow(var3_ref);
                                                      }
                                                      break L8;
                                                    } else {
                                                      throw un.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    }
                                                  }
                                                } else {
                                                  var3_ref3 = un.a((String) (var8_ref.field_e), -63, field_c, field_a);
                                                  var8_ref.field_b = var3_ref3;
                                                  break L8;
                                                }
                                              } else {
                                                if (!this.field_i) {
                                                  discarded$11 = Class.forName("bg").getMethod("exit", new Class[]{}).invoke(this.field_v, new Object[]{});
                                                  break L8;
                                                } else {
                                                  this.field_x.a((byte) 54, (java.awt.Frame) (var8_ref.field_e));
                                                  break L8;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      throw un.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    }
                                  }
                                } else {
                                  var10 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8_ref.field_b = var10.getContents((Object) null);
                                  break L8;
                                }
                              } else {
                                L18: {
                                  var9 = (Object[]) (var8_ref.field_e);
                                  if (!this.field_h) {
                                    break L18;
                                  } else {
                                    if (null == ((Class) (var9[0])).getClassLoader()) {
                                      throw new SecurityException();
                                    } else {
                                      break L18;
                                    }
                                  }
                                }
                                var8_ref.field_b = ((Class) (var9[0])).getDeclaredField((String) (var9[1]));
                                break L8;
                              }
                            }
                          } else {
                            if (field_k > lo.a((byte) 97)) {
                              throw new IOException();
                            } else {
                              var8_ref.field_b = new DataInputStream(((java.net.URL) (var8_ref.field_e)).openStream());
                              break L8;
                            }
                          }
                        }
                      }
                    }
                  }
                  var8_ref.field_a = 1;
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
                  var8_ref.field_a = 2;
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

    final gb a(int param0, int param1, int param2, int param3, byte param4) {
        gb discarded$0 = null;
        if (param4 != 4) {
            String var7 = (String) null;
            discarded$0 = this.a((String) null, false, true, 4);
        }
        return this.a((param0 << 844095504) - -param1, 6, (Object) null, true, param3 + (param2 << 1496836240));
    }

    final gb a(Runnable param0, int param1, int param2) {
        if (param1 != 2) {
            return (gb) null;
        }
        return this.a(param2, 2, param0, true, 0);
    }

    un(int param0, String param1, int param2, boolean param3) throws Exception {
        String discarded$8 = null;
        String discarded$9 = null;
        java.lang.reflect.Method discarded$10 = null;
        Object discarded$11 = null;
        Exception exception = null;
        Throwable throwable = null;
        int var5_int = 0;
        hh var6 = null;
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
          this.field_o = null;
          this.field_b = null;
          this.field_g = null;
          this.field_q = false;
          this.field_p = null;
          this.field_i = false;
          this.field_h = false;
          this.field_s = null;
          field_m = "1.1";
          field_a = param1;
          field_e = "Unknown";
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
        ((un) (this)).field_h = stackIn_3_1 != 0;
        field_c = param0;
        try {
          L1: {
            field_e = System.getProperty("java.vendor");
            field_m = System.getProperty("java.version");
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
          if ((field_e.toLowerCase().indexOf("microsoft") ^ -1) == 0) {
            break L3;
          } else {
            this.field_i = true;
            break L3;
          }
        }
        try {
          L4: {
            field_r = System.getProperty("os.name");
            break L4;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            exception = (Exception) (Object) decompiledCaughtException;
            field_r = "Unknown";
            break L5;
          }
        }
        field_u = field_r.toLowerCase();
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
              field_f = System.getProperty("user.home");
              if (field_f == null) {
                break L11;
              } else {
                field_f = field_f + "/";
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
          if (null != field_f) {
            break L13;
          } else {
            field_f = "~/";
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
          if (this.field_i) {
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
                field_l = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
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
          lh.a(-98, field_a, field_c);
          if (!this.field_h) {
            break L21;
          } else {
            this.field_s = new gl(lh.a((String) null, 6234, "random.dat", field_c), "rw", 25L);
            this.field_p = new gl(lh.a("main_file_cache.dat2", -93), "rw", 314572800L);
            this.field_g = new gl(lh.a("main_file_cache.idx255", -86), "rw", 1048576L);
            this.field_n = new gl[param2];
            var5_int = 0;
            L22: while (true) {
              if (param2 <= var5_int) {
                L23: {
                  if (!this.field_i) {
                    break L23;
                  } else {
                    try {
                      L24: {
                        discarded$11 = Class.forName("ki").newInstance();
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
                        var6 = new hh();
                        this.field_x = var6;
                        break L27;
                      } else {
                        this.field_v = Class.forName("bg").newInstance();
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
                        this.field_t = new in();
                        break L30;
                      } else {
                        this.field_w = Class.forName("up").newInstance();
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
                this.field_n[var5_int] = new gl(lh.a("main_file_cache.idx" + var5_int, -95), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        this.field_q = false;
        this.field_j = new Thread((Runnable) (this));
        this.field_j.setPriority(10);
        this.field_j.setDaemon(true);
        this.field_j.start();
    }

    static {
        field_k = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
