/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rk implements Runnable {
    static String field_o;
    static String field_l;
    private static int field_v;
    private pc field_x;
    private static String field_k;
    private static volatile long field_u;
    private Thread field_s;
    fs field_a;
    private fi field_d;
    fs[] field_r;
    static java.lang.reflect.Method field_e;
    private en field_b;
    private static String field_t;
    private en field_w;
    fs field_g;
    boolean field_p;
    java.awt.EventQueue field_j;
    static String field_f;
    private Object field_m;
    fs field_n;
    private Object field_h;
    boolean field_q;
    private static String field_i;
    private boolean field_c;

    final en a(java.awt.Frame param0, int param1) {
        if (param1 != 16823) {
            this.field_m = (Object) null;
        }
        return this.a(param0, 0, 0, 7, (byte) 125);
    }

    final boolean a(File param0, byte[] param1, boolean param2) {
        FileOutputStream var4 = null;
        IOException var4_ref = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        try {
          L0: {
            var4 = new FileOutputStream(param0);
            var4.write(param1, 0, param1.length);
            var4.close();
            if (param2) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              field_t = (String) null;
              return true;
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (IOException) (Object) decompiledCaughtException;
          throw new RuntimeException();
        }
        return stackIn_3_0 != 0;
    }

    private final en a(int param0, boolean param1, String param2, int param3) {
        if (param3 < 10) {
            return (en) null;
        }
        return this.a(param2, 0, param0, !param1 ? 1 : 22, (byte) 125);
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
            ls var3_ref2 = null;
            fs var3_ref3 = null;
            int var3_int = 0;
            Throwable var4_ref_Throwable = null;
            int var4 = 0;
            String var4_ref_String = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            Object var8 = null;
            en var8_ref = null;
            Object[] var9 = null;
            String var10 = null;
            java.awt.Frame var11 = null;
            java.awt.Component var12 = null;
            String var13 = null;
            Object[] var14 = null;
            java.awt.datatransfer.Clipboard var15 = null;
            java.awt.datatransfer.Clipboard var16 = null;
            Object[] var17 = null;
            Thread var18 = null;
            int stackIn_60_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_59_0 = 0;
            int stackOut_58_0 = 0;
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
                    if (!this.field_c) {
                      if (null == this.field_w) {
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
                          var8_ref = this.field_w;
                          this.field_w = this.field_w.field_d;
                          if (this.field_w == null) {
                            this.field_b = null;
                            break L6;
                          } else {
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
                    if (-2 != (var2_int ^ -1)) {
                      if (-23 == (var2_int ^ -1)) {
                        if ((field_u ^ -1L) < (kh.a(-107) ^ -1L)) {
                          throw new IOException();
                        } else {
                          try {
                              if (false) throw (ls) null;
                            L9: {
                              var8_ref.field_f = dd.a((String) (var8_ref.field_e), var8_ref.field_c, -105).a((byte) 97);
                              break L9;
                            }
                          } catch (ls decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref2 = (ls) (Object) decompiledCaughtException;
                            var8_ref.field_f = var3_ref2.getMessage();
                            throw var3_ref2;
                          }
                          break L8;
                        }
                      } else {
                        if ((var2_int ^ -1) == -3) {
                          var18 = new Thread((Runnable) (var8_ref.field_e));
                          var18.setDaemon(true);
                          var18.start();
                          var18.setPriority(var8_ref.field_c);
                          var8_ref.field_f = var18;
                          break L8;
                        } else {
                          if ((var2_int ^ -1) != -5) {
                            if (-9 == (var2_int ^ -1)) {
                              L10: {
                                var17 = (Object[]) (var8_ref.field_e);
                                if (!this.field_q) {
                                  break L10;
                                } else {
                                  if (((Class) (var17[0])).getClassLoader() == null) {
                                    throw new SecurityException();
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              var8_ref.field_f = ((Class) (var17[0])).getDeclaredMethod((String) (var17[1]), (Class[]) (var17[2]));
                              break L8;
                            } else {
                              if ((var2_int ^ -1) != -10) {
                                if ((var2_int ^ -1) == -19) {
                                  var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8_ref.field_f = var16.getContents((Object) null);
                                  break L8;
                                } else {
                                  if (19 == var2_int) {
                                    var7 = (java.awt.datatransfer.Transferable) (var8_ref.field_e);
                                    var15 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var15.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L8;
                                  } else {
                                    if (this.field_q) {
                                      if (var2_int != 3) {
                                        if (var2_int == 21) {
                                          if (kh.a(-92) < field_u) {
                                            throw new IOException();
                                          } else {
                                            var8_ref.field_f = java.net.InetAddress.getByName((String) (var8_ref.field_e)).getAddress();
                                            break L8;
                                          }
                                        } else {
                                          if (5 == var2_int) {
                                            if (this.field_p) {
                                              var8_ref.field_f = this.field_x.a(-116);
                                              break L8;
                                            } else {
                                              var8_ref.field_f = Class.forName("il").getMethod("listmodes", new Class[]{}).invoke(this.field_m, new Object[]{});
                                              break L8;
                                            }
                                          } else {
                                            if (6 != var2_int) {
                                              if (7 == var2_int) {
                                                if (this.field_p) {
                                                  this.field_x.a((java.awt.Frame) (var8_ref.field_e), -70);
                                                  break L8;
                                                } else {
                                                  discarded$6 = Class.forName("il").getMethod("exit", new Class[]{}).invoke(this.field_m, new Object[]{});
                                                  break L8;
                                                }
                                              } else {
                                                if ((var2_int ^ -1) == -13) {
                                                  var3_ref3 = rk.a((String) (var8_ref.field_e), field_v, (byte) -97, field_t);
                                                  var8_ref.field_f = var3_ref3;
                                                  break L8;
                                                } else {
                                                  if (-14 == (var2_int ^ -1)) {
                                                    var3_ref3 = rk.a((String) (var8_ref.field_e), field_v, (byte) -97, "");
                                                    var8_ref.field_f = var3_ref3;
                                                    break L8;
                                                  } else {
                                                    L11: {
                                                      if (!this.field_q) {
                                                        break L11;
                                                      } else {
                                                        if ((var2_int ^ -1) == -15) {
                                                          var3_int = var8_ref.field_c;
                                                          var4 = var8_ref.field_b;
                                                          if (this.field_p) {
                                                            this.field_d.a(0, var3_int, var4);
                                                            break L8;
                                                          } else {
                                                            discarded$7 = Class.forName("wr").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_h, new Object[]{new Integer(var3_int), new Integer(var4)});
                                                            break L8;
                                                          }
                                                        } else {
                                                          break L11;
                                                        }
                                                      }
                                                    }
                                                    L12: {
                                                      if (!this.field_q) {
                                                        break L12;
                                                      } else {
                                                        if (var2_int != 15) {
                                                          break L12;
                                                        } else {
                                                          L13: {
                                                            if (-1 == (var8_ref.field_c ^ -1)) {
                                                              stackOut_59_0 = 0;
                                                              stackIn_60_0 = stackOut_59_0;
                                                              break L13;
                                                            } else {
                                                              stackOut_58_0 = 1;
                                                              stackIn_60_0 = stackOut_58_0;
                                                              break L13;
                                                            }
                                                          }
                                                          var3_int = stackIn_60_0;
                                                          var12 = (java.awt.Component) (var8_ref.field_e);
                                                          if (this.field_p) {
                                                            this.field_d.a(var3_int != 0, var12, -4);
                                                            break L8;
                                                          } else {
                                                            discarded$8 = Class.forName("wr").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_h, new Object[]{var12, new Boolean(var3_int != 0)});
                                                            break L8;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L14: {
                                                      if (this.field_p) {
                                                        break L14;
                                                      } else {
                                                        if ((var2_int ^ -1) == -18) {
                                                          var14 = (Object[]) (var8_ref.field_e);
                                                          discarded$9 = Class.forName("wr").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_h, new Object[]{var14[0], var14[1], new Integer(var8_ref.field_c), new Integer(var8_ref.field_b), var14[2]});
                                                          break L8;
                                                        } else {
                                                          break L14;
                                                        }
                                                      }
                                                    }
                                                    if (-17 == (var2_int ^ -1)) {
                                                      try {
                                                        L15: {
                                                          if (field_f.startsWith("win")) {
                                                            L16: {
                                                              var13 = (String) (var8_ref.field_e);
                                                              if (var13.startsWith("http://")) {
                                                                break L16;
                                                              } else {
                                                                if (!var13.startsWith("https://")) {
                                                                  throw rk.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  break L16;
                                                                }
                                                              }
                                                            }
                                                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L17: while (true) {
                                                              if (var5 >= var13.length()) {
                                                                discarded$10 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var13 + "\"");
                                                                var8_ref.field_f = null;
                                                                break L15;
                                                              } else {
                                                                if ((var4_ref_String.indexOf((int) var13.charAt(var5)) ^ -1) == 0) {
                                                                  throw rk.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  var5++;
                                                                  continue L17;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            throw rk.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                                                        decompiledCaughtException = decompiledCaughtParameter2;
                                                        var3_ref = (Exception) (Object) decompiledCaughtException;
                                                        var8_ref.field_f = var3_ref;
                                                        throw rk.<RuntimeException>$cfr$sneakyThrow(var3_ref);
                                                      }
                                                      break L8;
                                                    } else {
                                                      throw rk.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              var11 = new java.awt.Frame("Jagex Full Screen");
                                              var8_ref.field_f = var11;
                                              var11.setResizable(false);
                                              if (!this.field_p) {
                                                discarded$11 = Class.forName("il").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_m, new Object[]{var11, new Integer(var8_ref.field_c >>> -382622928), new Integer(var8_ref.field_c & 65535), new Integer(var8_ref.field_b >> -2122747152), new Integer(var8_ref.field_b & 65535)});
                                                break L8;
                                              } else {
                                                this.field_x.a(var8_ref.field_c >>> 644391888, 17, var11, 65535 & var8_ref.field_c, var8_ref.field_b >> -855980336, 65535 & var8_ref.field_b);
                                                break L8;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        if ((kh.a(-87) ^ -1L) > (field_u ^ -1L)) {
                                          throw new IOException();
                                        } else {
                                          var10 = (var8_ref.field_c >> 1176283960 & 255) + "." + ((16746416 & var8_ref.field_c) >> 1900384752) + "." + (255 & var8_ref.field_c >> 819548232) + "." + (var8_ref.field_c & 255);
                                          var8_ref.field_f = java.net.InetAddress.getByName(var10).getHostName();
                                          break L8;
                                        }
                                      }
                                    } else {
                                      throw rk.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    }
                                  }
                                }
                              } else {
                                L18: {
                                  var9 = (Object[]) (var8_ref.field_e);
                                  if (this.field_q) {
                                    if (((Class) (var9[0])).getClassLoader() != null) {
                                      break L18;
                                    } else {
                                      throw new SecurityException();
                                    }
                                  } else {
                                    break L18;
                                  }
                                }
                                var8_ref.field_f = ((Class) (var9[0])).getDeclaredField((String) (var9[1]));
                                break L8;
                              }
                            }
                          } else {
                            if ((kh.a(-59) ^ -1L) > (field_u ^ -1L)) {
                              throw new IOException();
                            } else {
                              var8_ref.field_f = new DataInputStream(((java.net.URL) (var8_ref.field_e)).openStream());
                              break L8;
                            }
                          }
                        }
                      }
                    } else {
                      if ((kh.a(-101) ^ -1L) > (field_u ^ -1L)) {
                        throw new IOException();
                      } else {
                        var8_ref.field_f = new java.net.Socket(java.net.InetAddress.getByName((String) (var8_ref.field_e)), var8_ref.field_c);
                        break L8;
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

    final en a(int param0, int param1, Runnable param2) {
        en discarded$0 = null;
        if (param1 != 1048576) {
            java.net.URL var5 = (java.net.URL) null;
            discarded$0 = this.a((byte) 49, (java.net.URL) null);
        }
        return this.a(param2, 0, param0, 2, (byte) 117);
    }

    final void b(int param0) {
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
                this.field_c = true;
                if (param0 < -99) {
                  this.notifyAll();
                  break L0;
                } else {
                  return;
                }
              }
            }
            try {
              L1: {
                this.field_s.join();
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
              if (null == this.field_n) {
                break L3;
              } else {
                try {
                  L4: {
                    this.field_n.a(19260);
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
              if (null == this.field_a) {
                break L6;
              } else {
                try {
                  L7: {
                    this.field_a.a(19260);
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
              if (this.field_r != null) {
                var2_int = 0;
                L10: while (true) {
                  if (this.field_r.length <= var2_int) {
                    break L9;
                  } else {
                    if (this.field_r[var2_int] != null) {
                      try {
                        L11: {
                          this.field_r[var2_int].a(19260);
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
              if (null != this.field_g) {
                try {
                  L14: {
                    this.field_g.a(19260);
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
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final en a(Class param0, Class[] param1, String param2, boolean param3) {
        if (!param3) {
            return (en) null;
        }
        return this.a(new Object[]{param0, param2, param1}, 0, 0, 8, (byte) 61);
    }

    final en a(int param0) {
        en discarded$0 = null;
        if (param0 != 255) {
            String var3 = (String) null;
            discarded$0 = this.a((Class) null, (Class[]) null, (String) null, false);
        }
        return this.a((Object) null, 0, 0, 5, (byte) 56);
    }

    private final static fs a(String param0, int param1, byte param2, String param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            Object var7 = null;
            Exception var8 = null;
            fs var8_ref = null;
            fs stackIn_14_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            fs stackOut_13_0 = null;
            String var7_ref = null;
            if (param2 == -97) {
              L0: {
                if ((param1 ^ -1) == -34) {
                  var4 = "jagex_" + param3 + "_preferences" + param0 + "_rc.dat";
                  break L0;
                } else {
                  if (param1 == 34) {
                    var4 = "jagex_" + param3 + "_preferences" + param0 + "_wip.dat";
                    break L0;
                  } else {
                    var4 = "jagex_" + param3 + "_preferences" + param0 + ".dat";
                    break L0;
                  }
                }
              }
              var5_array = new String[]{"c:/rscache/", "/rscache/", field_i, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
              var6 = 0;
              L1: while (true) {
                if (var6 < var5_array.length) {
                  L2: {
                    var7_ref = var5_array[var6];
                    if (var7_ref.length() <= 0) {
                      break L2;
                    } else {
                      if (new File(var7_ref).exists()) {
                        break L2;
                      } else {
                        var6++;
                        continue L1;
                      }
                    }
                  }
                  try {
                    L3: {
                      var8_ref = new fs(new File(var7_ref, var4), "rw", 10000L);
                      stackOut_13_0 = (fs) (var8_ref);
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
              return (fs) null;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(byte param0) {
        if (param0 != 84) {
            this.run();
        }
        if (!(this.field_q)) {
            return false;
        }
        if (this.field_p) {
            return this.field_x != null ? true : false;
        }
        return this.field_m != null ? true : false;
    }

    final en a(String param0, Class param1, int param2) {
        if (param2 != 9) {
            return (en) null;
        }
        return this.a(new Object[]{param1, param0}, 0, 0, 9, (byte) 87);
    }

    final en a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 >= -79) {
            this.field_x = (pc) null;
        }
        return this.a((Object) null, param2 + (param4 << -588128400), param3 + (param0 << 2039991504), 6, (byte) 83);
    }

    final en a(int param0, String param1, int param2) {
        if (param0 != 2) {
            this.field_d = (fi) null;
        }
        return this.a(param2, false, param1, param0 + 114);
    }

    final en a(byte param0, java.net.URL param1) {
        if (param0 < 55) {
            this.field_w = (en) null;
        }
        return this.a(param1, 0, 0, 4, (byte) 58);
    }

    private final en a(Object param0, int param1, int param2, int param3, byte param4) {
        en discarded$2 = null;
        en var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        var6 = new en();
        var6.field_e = param0;
        var6.field_b = param1;
        var6.field_g = param3;
        var6.field_c = param2;
        var7 = this;
        synchronized (var7) {
          L0: {
            L1: {
              if (this.field_b == null) {
                this.field_w = var6;
                this.field_b = var6;
                break L1;
              } else {
                this.field_b.field_d = var6;
                this.field_b = var6;
                break L1;
              }
            }
            this.notify();
            break L0;
          }
        }
        L2: {
          if (param4 > 54) {
            break L2;
          } else {
            discarded$2 = this.a(47, -115, 69, 14, 3);
            break L2;
          }
        }
        return var6;
    }

    rk(int param0, String param1, int param2, boolean param3) throws Exception {
        String discarded$8 = null;
        String discarded$9 = null;
        java.lang.reflect.Method discarded$10 = null;
        Object discarded$11 = null;
        int discarded$12 = 0;
        Exception exception = null;
        Throwable throwable = null;
        int var5_int = 0;
        ThreadGroup var5 = null;
        ThreadGroup var6 = null;
        Thread[] var7 = null;
        int var8 = 0;
        pc var10 = null;
        ThreadGroup var11 = null;
        ThreadGroup var12 = null;
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
          this.field_b = null;
          this.field_w = null;
          this.field_g = null;
          this.field_p = false;
          this.field_a = null;
          this.field_n = null;
          this.field_c = false;
          this.field_q = false;
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
        ((rk) (this)).field_q = stackIn_3_1 != 0;
        field_l = "1.1";
        field_t = param1;
        field_o = "Unknown";
        field_v = param0;
        try {
          L1: {
            field_o = System.getProperty("java.vendor");
            field_l = System.getProperty("java.version");
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
            this.field_p = true;
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
        field_f = field_k.toLowerCase();
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
              field_i = System.getProperty("user.home");
              if (null == field_i) {
                break L11;
              } else {
                field_i = field_i + "/";
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
          if (null != field_i) {
            break L13;
          } else {
            field_i = "~/";
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
          if (this.field_p) {
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
                field_e = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
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
          qc.a(field_t, field_v, 73);
          if (!this.field_q) {
            break L21;
          } else {
            this.field_g = new fs(qc.a("random.dat", 1, field_v, (String) null), "rw", 25L);
            this.field_n = new fs(qc.a(true, "main_file_cache.dat2"), "rw", 314572800L);
            this.field_a = new fs(qc.a(true, "main_file_cache.idx255"), "rw", 1048576L);
            this.field_r = new fs[param2];
            var5_int = 0;
            L22: while (true) {
              if (var5_int >= param2) {
                L23: {
                  if (this.field_p) {
                    try {
                      L24: {
                        discarded$11 = Class.forName("f").newInstance();
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
                      if (!this.field_p) {
                        this.field_m = Class.forName("il").newInstance();
                        break L27;
                      } else {
                        var10 = new pc();
                        this.field_x = var10;
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
                      if (this.field_p) {
                        this.field_d = new fi();
                        break L30;
                      } else {
                        this.field_h = Class.forName("wr").newInstance();
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
                this.field_r[var5_int] = new fs(qc.a(true, "main_file_cache.idx" + var5_int), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        L32: {
          if (!this.field_q) {
            break L32;
          } else {
            if (this.field_p) {
              break L32;
            } else {
              var11 = Thread.currentThread().getThreadGroup();
              var5 = var11;
              var6 = var11.getParent();
              L33: while (true) {
                if (var6 == null) {
                  var7 = new Thread[1000];
                  discarded$12 = var5.enumerate(var7);
                  var8 = 0;
                  L34: while (true) {
                    if (var8 >= var7.length) {
                      break L32;
                    } else {
                      if (var7[var8] != null) {
                        if (var7[var8].getName().startsWith("AWT")) {
                          var7[var8].setPriority(1);
                          var8++;
                          continue L34;
                        } else {
                          var8++;
                          continue L34;
                        }
                      } else {
                        var8++;
                        continue L34;
                      }
                    }
                  }
                } else {
                  var12 = var6;
                  var5 = var12;
                  var6 = var12.getParent();
                  continue L33;
                }
              }
            }
          }
        }
        this.field_c = false;
        this.field_s = new Thread((Runnable) (this));
        this.field_s.setPriority(10);
        this.field_s.setDaemon(true);
        this.field_s.start();
    }

    static {
        field_u = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
