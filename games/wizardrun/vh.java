/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vh implements Runnable {
    static String field_k;
    private static String field_l;
    static java.lang.reflect.Method field_q;
    private al field_x;
    ri field_i;
    private boolean field_j;
    ri field_m;
    private Object field_t;
    java.awt.EventQueue field_a;
    private static volatile long field_d;
    private static int field_w;
    static String field_p;
    private Thread field_e;
    boolean field_s;
    private static String field_v;
    private jh field_r;
    private Object field_h;
    private ba field_u;
    ri[] field_f;
    private static String field_n;
    ri field_c;
    private jh field_o;
    private boolean field_g;
    static String field_b;

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
            hf var3_ref = null;
            Exception var3_ref2 = null;
            ri var3_ref3 = null;
            int var3_int = 0;
            Throwable var4_ref_Throwable = null;
            int var4 = 0;
            String var4_ref_String = null;
            int var5 = 0;
            Throwable var6 = null;
            String var7 = null;
            java.awt.datatransfer.Transferable var8 = null;
            Object var9 = null;
            jh var9_ref = null;
            Object[] var10 = null;
            java.awt.datatransfer.Clipboard var11 = null;
            Object[] var12 = null;
            java.awt.Component var13 = null;
            java.awt.Frame var14 = null;
            String var15 = null;
            java.awt.datatransfer.Clipboard var16 = null;
            Object[] var17 = null;
            Thread var18 = null;
            int stackIn_70_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_69_0 = 0;
            int stackOut_68_0 = 0;
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
                    if (!this.field_g) {
                      if (this.field_o != null) {
                        L4: {
                          var9_ref = this.field_o;
                          this.field_o = this.field_o.field_c;
                          if (this.field_o != null) {
                            break L4;
                          } else {
                            this.field_r = null;
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
                    if ((var2_int ^ -1) == -2) {
                      if (d.a((byte) 21) < field_d) {
                        throw new IOException();
                      } else {
                        var9_ref.field_e = new java.net.Socket(java.net.InetAddress.getByName((String) (var9_ref.field_g)), var9_ref.field_d);
                        break L8;
                      }
                    } else {
                      if (var2_int != 22) {
                        if (-3 == (var2_int ^ -1)) {
                          var18 = new Thread((Runnable) (var9_ref.field_g));
                          var18.setDaemon(true);
                          var18.start();
                          var18.setPriority(var9_ref.field_d);
                          var9_ref.field_e = var18;
                          break L8;
                        } else {
                          if (4 == var2_int) {
                            if (d.a((byte) 56) >= field_d) {
                              var9_ref.field_e = new DataInputStream(((java.net.URL) (var9_ref.field_g)).openStream());
                              break L8;
                            } else {
                              throw new IOException();
                            }
                          } else {
                            if ((var2_int ^ -1) != -9) {
                              if (var2_int == 9) {
                                L9: {
                                  var17 = (Object[]) (var9_ref.field_g);
                                  if (this.field_s) {
                                    if (((Class) (var17[0])).getClassLoader() == null) {
                                      throw new SecurityException();
                                    } else {
                                      break L9;
                                    }
                                  } else {
                                    break L9;
                                  }
                                }
                                var9_ref.field_e = ((Class) (var17[0])).getDeclaredField((String) (var17[1]));
                                break L8;
                              } else {
                                if (18 != var2_int) {
                                  if ((var2_int ^ -1) == -20) {
                                    var8 = (java.awt.datatransfer.Transferable) (var9_ref.field_g);
                                    var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var16.setContents(var8, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L8;
                                  } else {
                                    if (!this.field_s) {
                                      throw vh.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    } else {
                                      if ((var2_int ^ -1) == -4) {
                                        if ((d.a((byte) 25) ^ -1L) <= (field_d ^ -1L)) {
                                          var15 = (var9_ref.field_d >> 168063864 & 255) + "." + (255 & var9_ref.field_d >> 721460240) + "." + ((65409 & var9_ref.field_d) >> 951108808) + "." + (255 & var9_ref.field_d);
                                          var9_ref.field_e = java.net.InetAddress.getByName(var15).getHostName();
                                          break L8;
                                        } else {
                                          throw new IOException();
                                        }
                                      } else {
                                        if ((var2_int ^ -1) == -22) {
                                          if (d.a((byte) 84) >= field_d) {
                                            var9_ref.field_e = java.net.InetAddress.getByName((String) (var9_ref.field_g)).getAddress();
                                            break L8;
                                          } else {
                                            throw new IOException();
                                          }
                                        } else {
                                          if (var2_int == 5) {
                                            if (this.field_j) {
                                              var9_ref.field_e = this.field_u.a(true);
                                              break L8;
                                            } else {
                                              var9_ref.field_e = Class.forName("bj").getMethod("listmodes", new Class[]{}).invoke(this.field_t, new Object[]{});
                                              break L8;
                                            }
                                          } else {
                                            if (6 == var2_int) {
                                              var14 = new java.awt.Frame("Jagex Full Screen");
                                              var9_ref.field_e = var14;
                                              var14.setResizable(false);
                                              if (!this.field_j) {
                                                discarded$6 = Class.forName("bj").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_t, new Object[]{var14, new Integer(var9_ref.field_d >>> 1078796528), new Integer(var9_ref.field_d & 65535), new Integer(var9_ref.field_f >> -813931472), new Integer(65535 & var9_ref.field_f)});
                                                break L8;
                                              } else {
                                                this.field_u.a(var9_ref.field_f >> 760852976, (byte) 122, var9_ref.field_d >>> 169978736, 65535 & var9_ref.field_d, var9_ref.field_f & 65535, var14);
                                                break L8;
                                              }
                                            } else {
                                              if (7 == var2_int) {
                                                if (this.field_j) {
                                                  this.field_u.a(-2147483648, (java.awt.Frame) (var9_ref.field_g));
                                                  break L8;
                                                } else {
                                                  discarded$7 = Class.forName("bj").getMethod("exit", new Class[]{}).invoke(this.field_t, new Object[]{});
                                                  break L8;
                                                }
                                              } else {
                                                if ((var2_int ^ -1) == -13) {
                                                  var3_ref3 = vh.a(0, field_w, (String) (var9_ref.field_g), field_v);
                                                  var9_ref.field_e = var3_ref3;
                                                  break L8;
                                                } else {
                                                  if (13 == var2_int) {
                                                    var3_ref3 = vh.a(0, field_w, (String) (var9_ref.field_g), "");
                                                    var9_ref.field_e = var3_ref3;
                                                    break L8;
                                                  } else {
                                                    L10: {
                                                      if (!this.field_s) {
                                                        break L10;
                                                      } else {
                                                        if (-15 == (var2_int ^ -1)) {
                                                          var3_int = var9_ref.field_d;
                                                          var4 = var9_ref.field_f;
                                                          if (this.field_j) {
                                                            this.field_x.a(var3_int, var4, (byte) 116);
                                                            break L8;
                                                          } else {
                                                            discarded$8 = Class.forName("ak").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_h, new Object[]{new Integer(var3_int), new Integer(var4)});
                                                            break L8;
                                                          }
                                                        } else {
                                                          break L10;
                                                        }
                                                      }
                                                    }
                                                    L11: {
                                                      if (!this.field_s) {
                                                        break L11;
                                                      } else {
                                                        if (15 == var2_int) {
                                                          L12: {
                                                            if (0 == var9_ref.field_d) {
                                                              stackOut_69_0 = 0;
                                                              stackIn_70_0 = stackOut_69_0;
                                                              break L12;
                                                            } else {
                                                              stackOut_68_0 = 1;
                                                              stackIn_70_0 = stackOut_68_0;
                                                              break L12;
                                                            }
                                                          }
                                                          var3_int = stackIn_70_0;
                                                          var13 = (java.awt.Component) (var9_ref.field_g);
                                                          if (!this.field_j) {
                                                            discarded$9 = Class.forName("ak").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_h, new Object[]{var13, new Boolean(var3_int != 0)});
                                                            break L8;
                                                          } else {
                                                            this.field_x.a(0, var3_int != 0, var13);
                                                            break L8;
                                                          }
                                                        } else {
                                                          break L11;
                                                        }
                                                      }
                                                    }
                                                    L13: {
                                                      if (this.field_j) {
                                                        break L13;
                                                      } else {
                                                        if (var2_int != 17) {
                                                          break L13;
                                                        } else {
                                                          var12 = (Object[]) (var9_ref.field_g);
                                                          discarded$10 = Class.forName("ak").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_h, new Object[]{var12[0], var12[1], new Integer(var9_ref.field_d), new Integer(var9_ref.field_f), var12[2]});
                                                          break L8;
                                                        }
                                                      }
                                                    }
                                                    if (-17 != (var2_int ^ -1)) {
                                                      throw vh.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    } else {
                                                      try {
                                                        L14: {
                                                          if (!field_k.startsWith("win")) {
                                                            throw vh.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          } else {
                                                            L15: {
                                                              var7 = (String) (var9_ref.field_g);
                                                              if (var7.startsWith("http://")) {
                                                                break L15;
                                                              } else {
                                                                if (var7.startsWith("https://")) {
                                                                  break L15;
                                                                } else {
                                                                  throw vh.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L16: while (true) {
                                                              if (var7.length() <= var5) {
                                                                discarded$11 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var7 + "\"");
                                                                var9_ref.field_e = null;
                                                                break L14;
                                                              } else {
                                                                if ((var4_ref_String.indexOf((int) var7.charAt(var5)) ^ -1) != 0) {
                                                                  var5++;
                                                                  continue L16;
                                                                } else {
                                                                  throw vh.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter1) {
                                                        decompiledCaughtException = decompiledCaughtParameter1;
                                                        var3_ref2 = (Exception) (Object) decompiledCaughtException;
                                                        var9_ref.field_e = var3_ref2;
                                                        throw vh.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                                                      }
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
                                  var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var9_ref.field_e = var11.getContents((Object) null);
                                  break L8;
                                }
                              }
                            } else {
                              L17: {
                                var10 = (Object[]) (var9_ref.field_g);
                                if (this.field_s) {
                                  if (null != ((Class) (var10[0])).getClassLoader()) {
                                    break L17;
                                  } else {
                                    throw new SecurityException();
                                  }
                                } else {
                                  break L17;
                                }
                              }
                              var9_ref.field_e = ((Class) (var10[0])).getDeclaredMethod((String) (var10[1]), (Class[]) (var10[2]));
                              break L8;
                            }
                          }
                        }
                      } else {
                        if (d.a((byte) 50) >= field_d) {
                          try {
                              if (false) throw (hf) null;
                            L18: {
                              var9_ref.field_e = mj.a((String) (var9_ref.field_g), var9_ref.field_d, -1).a((byte) -128);
                              break L18;
                            }
                          } catch (hf decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref = (hf) (Object) decompiledCaughtException;
                            var9_ref.field_e = var3_ref.getMessage();
                            throw var3_ref;
                          }
                          break L8;
                        } else {
                          throw new IOException();
                        }
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

    final jh a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 < 93) {
            return (jh) null;
        }
        return this.a(false, param2 + (param0 << -889433872), (Object) null, param4 + (param3 << -419438256), 6);
    }

    final jh a(boolean param0) {
        if (param0) {
            field_w = -25;
        }
        return this.a(false, 0, (Object) null, 0, 5);
    }

    private final static ri a(int param0, int param1, String param2, String param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            ri var8_ref = null;
            ri stackIn_12_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            ri stackOut_11_0 = null;
            L0: {
              if ((param1 ^ -1) != -34) {
                if (34 == param1) {
                  var4 = "jagex_" + param3 + "_preferences" + param2 + "_wip.dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param3 + "_preferences" + param2 + ".dat";
                  break L0;
                }
              } else {
                var4 = "jagex_" + param3 + "_preferences" + param2 + "_rc.dat";
                break L0;
              }
            }
            var5_array = new String[]{"c:/rscache/", "/rscache/", field_n, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            var6 = param0;
            L1: while (true) {
              if (var5_array.length > var6) {
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
                    var8_ref = new ri(new File(var7, var4), "rw", 10000L);
                    stackOut_11_0 = (ri) (var8_ref);
                    stackIn_12_0 = stackOut_11_0;
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

    private final jh a(int param0, String param1, boolean param2, byte param3) {
        if (param3 < 74) {
            field_b = (String) null;
        }
        return this.a(false, 0, param1, param0, !param2 ? 1 : 22);
    }

    final jh a(byte param0, Runnable param1, int param2) {
        if (param0 > -47) {
            return (jh) null;
        }
        return this.a(false, 0, param1, param2, 2);
    }

    final jh a(java.net.URL param0, int param1) {
        if (param1 < 119) {
            this.field_m = (ri) null;
        }
        return this.a(false, 0, param0, 0, 4);
    }

    final jh a(int param0, Class param1, String param2) {
        jh discarded$0 = null;
        if (param0 != -8024) {
            Class var5 = (Class) null;
            discarded$0 = this.a((String) null, (Class[]) null, (Class) null, -89);
        }
        return this.a(false, 0, new Object[]{param1, param2}, 0, 9);
    }

    final jh a(String param0, Class[] param1, Class param2, int param3) {
        if (param3 != 3617) {
            field_k = (String) null;
        }
        return this.a(false, 0, new Object[]{param2, param0, param1}, 0, 8);
    }

    final jh a(String param0, int param1, byte param2) {
        if (param2 != -20) {
            return (jh) null;
        }
        return this.a(param1, param0, false, (byte) 85);
    }

    final jh a(int param0, java.awt.Frame param1) {
        jh discarded$0 = null;
        if (param0 != 7) {
            String var4 = (String) null;
            discarded$0 = this.a(69, (String) null, true, (byte) 10);
        }
        return this.a(false, 0, param1, 0, 7);
    }

    final boolean a(int param0) {
        if (param0 != 169978736) {
            return false;
        }
        if (!this.field_s) {
            return false;
        }
        if (!this.field_j) {
            return this.field_t != null ? true : false;
        }
        return null != this.field_u ? true : false;
    }

    final void b(int param0) {
        try {
            jh discarded$1 = null;
            Object var2 = null;
            InterruptedException var2_ref = null;
            IOException var2_ref2 = null;
            int var2_int = 0;
            Throwable var3 = null;
            IOException var3_ref = null;
            java.net.URL var4 = null;
            Throwable decompiledCaughtException = null;
            var2 = this;
            synchronized (var2) {
              L0: {
                this.field_g = true;
                this.notifyAll();
                break L0;
              }
            }
            try {
              L1: {
                L2: {
                  if (param0 == -3) {
                    break L2;
                  } else {
                    var4 = (java.net.URL) null;
                    discarded$1 = this.a((java.net.URL) null, 108);
                    break L2;
                  }
                }
                this.field_e.join();
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
              if (null != this.field_m) {
                try {
                  L5: {
                    this.field_m.a(-1);
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
                    this.field_i.a(-1);
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
              if (this.field_f == null) {
                break L10;
              } else {
                var2_int = 0;
                L11: while (true) {
                  if (var2_int >= this.field_f.length) {
                    break L10;
                  } else {
                    if (this.field_f[var2_int] != null) {
                      try {
                        L12: {
                          this.field_f[var2_int].a(param0 ^ 2);
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
              if (this.field_c != null) {
                try {
                  L15: {
                    this.field_c.a(param0 + 2);
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

    private final jh a(boolean param0, int param1, Object param2, int param3, int param4) {
        jh var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          var6 = new jh();
          var6.field_d = param3;
          var6.field_g = param2;
          var6.field_f = param1;
          var6.field_b = param4;
          if (!param0) {
            break L0;
          } else {
            field_d = 103L;
            break L0;
          }
        }
        var7 = this;
        synchronized (var7) {
          L1: {
            L2: {
              if (null == this.field_r) {
                this.field_o = var6;
                this.field_r = var6;
                break L2;
              } else {
                this.field_r.field_c = var6;
                this.field_r = var6;
                break L2;
              }
            }
            this.notify();
            break L1;
          }
        }
        return var6;
    }

    vh(int param0, String param1, int param2, boolean param3) throws Exception {
        String discarded$8 = null;
        String discarded$9 = null;
        java.lang.reflect.Method discarded$10 = null;
        Object discarded$11 = null;
        Exception exception = null;
        Throwable throwable = null;
        int var5_int = 0;
        ba var7 = null;
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
          this.field_m = null;
          this.field_i = null;
          this.field_j = false;
          this.field_r = null;
          this.field_s = false;
          this.field_g = false;
          this.field_c = null;
          this.field_o = null;
          field_b = "1.1";
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
        ((vh) (this)).field_s = stackIn_3_1 != 0;
        field_v = param1;
        field_p = "Unknown";
        field_w = param0;
        try {
          L1: {
            field_p = System.getProperty("java.vendor");
            field_b = System.getProperty("java.version");
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
          if (field_p.toLowerCase().indexOf("microsoft") == -1) {
            break L3;
          } else {
            this.field_j = true;
            break L3;
          }
        }
        try {
          L4: {
            field_l = System.getProperty("os.name");
            break L4;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            exception = (Exception) (Object) decompiledCaughtException;
            field_l = "Unknown";
            break L5;
          }
        }
        field_k = field_l.toLowerCase();
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
              field_n = System.getProperty("user.home");
              if (null == field_n) {
                break L11;
              } else {
                field_n = field_n + "/";
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
          if (null == field_n) {
            field_n = "~/";
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
          if (this.field_j) {
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
          fd.a(field_v, field_w, (byte) 125);
          if (!this.field_s) {
            break L21;
          } else {
            this.field_c = new ri(fd.a("random.dat", field_w, (String) null, -93), "rw", 25L);
            this.field_m = new ri(fd.a("main_file_cache.dat2", (byte) 115), "rw", 314572800L);
            this.field_i = new ri(fd.a("main_file_cache.idx255", (byte) 115), "rw", 1048576L);
            this.field_f = new ri[param2];
            var5_int = 0;
            L22: while (true) {
              if (param2 <= var5_int) {
                L23: {
                  if (!this.field_j) {
                    break L23;
                  } else {
                    try {
                      L24: {
                        discarded$11 = Class.forName("gl").newInstance();
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
                      if (this.field_j) {
                        var7 = new ba();
                        this.field_u = var7;
                        break L27;
                      } else {
                        this.field_t = Class.forName("bj").newInstance();
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
                      if (!this.field_j) {
                        this.field_h = Class.forName("ak").newInstance();
                        break L30;
                      } else {
                        this.field_x = new al();
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
                this.field_f[var5_int] = new ri(fd.a("main_file_cache.idx" + var5_int, (byte) 115), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        this.field_g = false;
        this.field_e = new Thread((Runnable) (this));
        this.field_e.setPriority(10);
        this.field_e.setDaemon(true);
        this.field_e.start();
    }

    static {
        field_d = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
