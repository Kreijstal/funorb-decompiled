/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jk implements Runnable {
    private ff field_h;
    static java.lang.reflect.Method field_m;
    eg field_n;
    private static volatile long field_f;
    private gj field_v;
    boolean field_k;
    static String field_c;
    private static String field_l;
    private nl field_w;
    private nl field_q;
    private Thread field_t;
    private Object field_g;
    private static String field_e;
    eg field_a;
    private boolean field_s;
    private static String field_j;
    private Object field_u;
    java.awt.EventQueue field_x;
    eg field_d;
    private static int field_b;
    static String field_o;
    eg[] field_r;
    static String field_i;
    private boolean field_p;

    final nl a(int param0, String param1, Class[] param2, Class param3) {
        nl discarded$0 = null;
        if (param0 != 8) {
            String var6 = (String) null;
            discarded$0 = this.a((String) null, 21, 78, false);
        }
        return this.a(param0 ^ 9, 0, new Object[]{param3, param1, param2}, 8, 0);
    }

    final nl a(int param0, boolean param1, Runnable param2) {
        nl discarded$0 = null;
        if (!param1) {
            discarded$0 = this.a(117);
        }
        return this.a(1, param0, param2, 2, 0);
    }

    final nl a(String param0, Class param1, byte param2) {
        if (param2 < 4) {
            field_m = (java.lang.reflect.Method) null;
        }
        return this.a(1, 0, new Object[]{param1, param0}, 9, 0);
    }

    final void b(int param0) {
        try {
            nl discarded$1 = null;
            InterruptedException var2 = null;
            IOException var2_ref = null;
            int var2_int = 0;
            Object var2_ref2 = null;
            Throwable var3 = null;
            IOException var3_ref = null;
            String var4 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (param0 == 0) {
                break L0;
              } else {
                var4 = (String) null;
                discarded$1 = this.a((String) null, true, -30);
                break L0;
              }
            }
            var2_ref2 = this;
            synchronized (var2_ref2) {
              L1: {
                this.field_s = true;
                this.notifyAll();
                break L1;
              }
            }
            try {
              L2: {
                this.field_t.join();
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
              if (null != this.field_a) {
                try {
                  L5: {
                    this.field_a.a(10992);
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
              } else {
                break L4;
              }
            }
            L7: {
              if (null == this.field_n) {
                break L7;
              } else {
                try {
                  L8: {
                    this.field_n.a(10992);
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
              }
            }
            L10: {
              if (null != this.field_r) {
                var2_int = 0;
                L11: while (true) {
                  if (var2_int >= this.field_r.length) {
                    break L10;
                  } else {
                    if (null != this.field_r[var2_int]) {
                      try {
                        L12: {
                          this.field_r[var2_int].a(10992);
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
              if (null == this.field_d) {
                break L14;
              } else {
                try {
                  L15: {
                    this.field_d.a(param0 ^ 10992);
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

    private final nl a(String param0, int param1, int param2, boolean param3) {
        nl discarded$0 = null;
        if (param1 != 0) {
            discarded$0 = this.a(97, -106, 27, 64, -97);
        }
        return this.a(param1 + 1, param2, param0, !param3 ? 1 : 22, 0);
    }

    final nl a(java.awt.Frame param0, boolean param1) {
        if (param1) {
            return (nl) null;
        }
        return this.a(1, 0, param0, 7, 0);
    }

    private final nl a(int param0, int param1, Object param2, int param3, int param4) {
        nl var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        if (param0 == 1) {
          var6 = new nl();
          var6.field_d = param4;
          var6.field_g = param3;
          var6.field_c = param2;
          var6.field_e = param1;
          var7 = this;
          synchronized (var7) {
            L0: {
              L1: {
                if (null != this.field_q) {
                  this.field_q.field_a = var6;
                  this.field_q = var6;
                  break L1;
                } else {
                  this.field_w = var6;
                  this.field_q = var6;
                  break L1;
                }
              }
              this.notify();
              break L0;
            }
          }
          return var6;
        } else {
          return (nl) null;
        }
    }

    final nl a(int param0, int param1, int param2, int param3, int param4) {
        if (param2 < 89) {
            return (nl) null;
        }
        return this.a(1, (param0 << -269751472) - -param1, (Object) null, 6, param4 + (param3 << 1185007888));
    }

    final nl a(byte param0, java.net.URL param1) {
        nl discarded$0 = null;
        if (param0 != -49) {
            discarded$0 = this.a(100, -38, -20, -23, 39);
        }
        return this.a(1, 0, param1, 4, 0);
    }

    private final static eg a(String param0, String param1, int param2, int param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            Object var7 = null;
            Exception var8 = null;
            eg var8_ref = null;
            eg stackIn_15_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            eg stackOut_14_0 = null;
            String var7_ref = null;
            L0: {
              if (param2 > 74) {
                break L0;
              } else {
                field_j = (String) null;
                break L0;
              }
            }
            L1: {
              if (33 != param3) {
                if (-35 != (param3 ^ -1)) {
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
            var5_array = new String[]{"c:/rscache/", "/rscache/", field_l, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            var6 = 0;
            L2: while (true) {
              if (var6 < var5_array.length) {
                L3: {
                  var7_ref = var5_array[var6];
                  if (var7_ref.length() <= 0) {
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
                    var8_ref = new eg(new File(var7_ref, var4), "rw", 10000L);
                    stackOut_14_0 = (eg) (var8_ref);
                    stackIn_15_0 = stackOut_14_0;
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
                  return stackIn_15_0;
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
            oa var3_ref = null;
            Exception var3_ref2 = null;
            eg var3_ref3 = null;
            int var3_int = 0;
            Throwable var4 = null;
            int var4_int = 0;
            String var4_ref = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            Object var8 = null;
            nl var8_ref = null;
            Object[] var9 = null;
            Object[] var10 = null;
            java.awt.Frame var11 = null;
            java.awt.Component var12 = null;
            String var13 = null;
            Object[] var14 = null;
            String var15 = null;
            java.awt.datatransfer.Clipboard var16 = null;
            java.awt.datatransfer.Clipboard var17 = null;
            Thread var18 = null;
            int stackIn_72_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_71_0 = 0;
            int stackOut_70_0 = 0;
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
                    if (!this.field_s) {
                      if (null != this.field_w) {
                        L4: {
                          var8_ref = this.field_w;
                          this.field_w = this.field_w.field_a;
                          if (this.field_w != null) {
                            break L4;
                          } else {
                            this.field_q = null;
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
                    var2_int = var8_ref.field_g;
                    if (var2_int != 1) {
                      if (-23 != (var2_int ^ -1)) {
                        if (var2_int == 2) {
                          var18 = new Thread((Runnable) (var8_ref.field_c));
                          var18.setDaemon(true);
                          var18.start();
                          var18.setPriority(var8_ref.field_e);
                          var8_ref.field_b = var18;
                          break L8;
                        } else {
                          if (-5 != (var2_int ^ -1)) {
                            if ((var2_int ^ -1) != -9) {
                              if (9 != var2_int) {
                                if ((var2_int ^ -1) == -19) {
                                  var17 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8_ref.field_b = var17.getContents((Object) null);
                                  break L8;
                                } else {
                                  if (-20 == (var2_int ^ -1)) {
                                    var7 = (java.awt.datatransfer.Transferable) (var8_ref.field_c);
                                    var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var16.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L8;
                                  } else {
                                    if (!this.field_k) {
                                      throw jk.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    } else {
                                      if (3 == var2_int) {
                                        if (field_f <= ud.a(2)) {
                                          var15 = (255 & var8_ref.field_e >> -992366056) + "." + (255 & var8_ref.field_e >> -1530555920) + "." + ((var8_ref.field_e & 65468) >> 506224200) + "." + (255 & var8_ref.field_e);
                                          var8_ref.field_b = java.net.InetAddress.getByName(var15).getHostName();
                                          break L8;
                                        } else {
                                          throw new IOException();
                                        }
                                      } else {
                                        if (-22 == (var2_int ^ -1)) {
                                          if ((field_f ^ -1L) < (ud.a(2) ^ -1L)) {
                                            throw new IOException();
                                          } else {
                                            var8_ref.field_b = java.net.InetAddress.getByName((String) (var8_ref.field_c)).getAddress();
                                            break L8;
                                          }
                                        } else {
                                          if ((var2_int ^ -1) == -6) {
                                            if (this.field_p) {
                                              var8_ref.field_b = this.field_v.a(0);
                                              break L8;
                                            } else {
                                              var8_ref.field_b = Class.forName("wd").getMethod("listmodes", new Class[]{}).invoke(this.field_g, new Object[]{});
                                              break L8;
                                            }
                                          } else {
                                            if ((var2_int ^ -1) != -7) {
                                              if ((var2_int ^ -1) != -8) {
                                                if (var2_int != 12) {
                                                  if (13 == var2_int) {
                                                    var3_ref3 = jk.a("", (String) (var8_ref.field_c), 90, field_b);
                                                    var8_ref.field_b = var3_ref3;
                                                    break L8;
                                                  } else {
                                                    L9: {
                                                      if (!this.field_k) {
                                                        break L9;
                                                      } else {
                                                        if ((var2_int ^ -1) != -15) {
                                                          break L9;
                                                        } else {
                                                          var3_int = var8_ref.field_e;
                                                          var4_int = var8_ref.field_d;
                                                          if (!this.field_p) {
                                                            discarded$6 = Class.forName("sm").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_u, new Object[]{new Integer(var3_int), new Integer(var4_int)});
                                                            break L8;
                                                          } else {
                                                            this.field_h.a(0, var3_int, var4_int);
                                                            break L8;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L10: {
                                                      if (!this.field_k) {
                                                        break L10;
                                                      } else {
                                                        if ((var2_int ^ -1) != -16) {
                                                          break L10;
                                                        } else {
                                                          L11: {
                                                            if (0 == var8_ref.field_e) {
                                                              stackOut_71_0 = 0;
                                                              stackIn_72_0 = stackOut_71_0;
                                                              break L11;
                                                            } else {
                                                              stackOut_70_0 = 1;
                                                              stackIn_72_0 = stackOut_70_0;
                                                              break L11;
                                                            }
                                                          }
                                                          var3_int = stackIn_72_0;
                                                          var12 = (java.awt.Component) (var8_ref.field_c);
                                                          if (this.field_p) {
                                                            this.field_h.a(29783, var3_int != 0, var12);
                                                            break L8;
                                                          } else {
                                                            discarded$7 = Class.forName("sm").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_u, new Object[]{var12, new Boolean(var3_int != 0)});
                                                            break L8;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L12: {
                                                      if (this.field_p) {
                                                        break L12;
                                                      } else {
                                                        if (var2_int == 17) {
                                                          var14 = (Object[]) (var8_ref.field_c);
                                                          discarded$8 = Class.forName("sm").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_u, new Object[]{var14[0], var14[1], new Integer(var8_ref.field_e), new Integer(var8_ref.field_d), var14[2]});
                                                          break L8;
                                                        } else {
                                                          break L12;
                                                        }
                                                      }
                                                    }
                                                    if (var2_int == 16) {
                                                      try {
                                                        L13: {
                                                          if (!field_c.startsWith("win")) {
                                                            throw jk.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          } else {
                                                            L14: {
                                                              var13 = (String) (var8_ref.field_c);
                                                              if (var13.startsWith("http://")) {
                                                                break L14;
                                                              } else {
                                                                if (!var13.startsWith("https://")) {
                                                                  throw jk.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  break L14;
                                                                }
                                                              }
                                                            }
                                                            var4_ref = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L15: while (true) {
                                                              if (var5 >= var13.length()) {
                                                                discarded$9 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var13 + "\"");
                                                                var8_ref.field_b = null;
                                                                break L13;
                                                              } else {
                                                                if ((var4_ref.indexOf((int) var13.charAt(var5)) ^ -1) != 0) {
                                                                  var5++;
                                                                  continue L15;
                                                                } else {
                                                                  throw jk.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter1) {
                                                        decompiledCaughtException = decompiledCaughtParameter1;
                                                        var3_ref2 = (Exception) (Object) decompiledCaughtException;
                                                        var8_ref.field_b = var3_ref2;
                                                        throw jk.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                                                      }
                                                      break L8;
                                                    } else {
                                                      throw jk.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    }
                                                  }
                                                } else {
                                                  var3_ref3 = jk.a(field_j, (String) (var8_ref.field_c), 91, field_b);
                                                  var8_ref.field_b = var3_ref3;
                                                  break L8;
                                                }
                                              } else {
                                                if (this.field_p) {
                                                  this.field_v.a(121, (java.awt.Frame) (var8_ref.field_c));
                                                  break L8;
                                                } else {
                                                  discarded$10 = Class.forName("wd").getMethod("exit", new Class[]{}).invoke(this.field_g, new Object[]{});
                                                  break L8;
                                                }
                                              }
                                            } else {
                                              var11 = new java.awt.Frame("Jagex Full Screen");
                                              var8_ref.field_b = var11;
                                              var11.setResizable(false);
                                              if (this.field_p) {
                                                this.field_v.a(var11, var8_ref.field_e & 65535, 65535 & var8_ref.field_d, 127, var8_ref.field_e >>> 416092144, var8_ref.field_d >> -1900860176);
                                                break L8;
                                              } else {
                                                discarded$11 = Class.forName("wd").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_g, new Object[]{var11, new Integer(var8_ref.field_e >>> 630858640), new Integer(65535 & var8_ref.field_e), new Integer(var8_ref.field_d >> -1025486128), new Integer(65535 & var8_ref.field_d)});
                                                break L8;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                L16: {
                                  var10 = (Object[]) (var8_ref.field_c);
                                  if (this.field_k) {
                                    if (null == ((Class) (var10[0])).getClassLoader()) {
                                      throw new SecurityException();
                                    } else {
                                      break L16;
                                    }
                                  } else {
                                    break L16;
                                  }
                                }
                                var8_ref.field_b = ((Class) (var10[0])).getDeclaredField((String) (var10[1]));
                                break L8;
                              }
                            } else {
                              L17: {
                                var9 = (Object[]) (var8_ref.field_c);
                                if (this.field_k) {
                                  if (null == ((Class) (var9[0])).getClassLoader()) {
                                    throw new SecurityException();
                                  } else {
                                    break L17;
                                  }
                                } else {
                                  break L17;
                                }
                              }
                              var8_ref.field_b = ((Class) (var9[0])).getDeclaredMethod((String) (var9[1]), (Class[]) (var9[2]));
                              break L8;
                            }
                          } else {
                            if ((field_f ^ -1L) >= (ud.a(2) ^ -1L)) {
                              var8_ref.field_b = new DataInputStream(((java.net.URL) (var8_ref.field_c)).openStream());
                              break L8;
                            } else {
                              throw new IOException();
                            }
                          }
                        }
                      } else {
                        if ((field_f ^ -1L) < (ud.a(2) ^ -1L)) {
                          throw new IOException();
                        } else {
                          try {
                              if (false) throw (oa) null;
                            L18: {
                              var8_ref.field_b = bl.a(0, var8_ref.field_e, (String) (var8_ref.field_c)).a((byte) -101);
                              break L18;
                            }
                          } catch (oa decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref = (oa) (Object) decompiledCaughtException;
                            var8_ref.field_b = var3_ref.getMessage();
                            throw var3_ref;
                          }
                          break L8;
                        }
                      }
                    } else {
                      if (ud.a(2) >= field_f) {
                        var8_ref.field_b = new java.net.Socket(java.net.InetAddress.getByName((String) (var8_ref.field_c)), var8_ref.field_e);
                        break L8;
                      } else {
                        throw new IOException();
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

    final boolean a(boolean param0) {
        if (!param0) {
            this.field_k = false;
        }
        if (!this.field_k) {
            return false;
        }
        if (this.field_p) {
            return this.field_v != null ? true : false;
        }
        return null != this.field_g ? true : false;
    }

    final nl a(String param0, boolean param1, int param2) {
        if (param1) {
            return (nl) null;
        }
        return this.a(param0, 0, param2, false);
    }

    final nl a(int param0) {
        if (param0 != -16312) {
            return (nl) null;
        }
        return this.a(1, 0, (Object) null, 5, 0);
    }

    jk(int param0, String param1, int param2, boolean param3) throws Exception {
        String discarded$7 = null;
        String discarded$8 = null;
        java.lang.reflect.Method discarded$9 = null;
        Object discarded$10 = null;
        Exception exception = null;
        Throwable throwable = null;
        int var5_int = 0;
        gj var6 = null;
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
          this.field_k = false;
          this.field_s = false;
          this.field_w = null;
          this.field_a = null;
          this.field_d = null;
          this.field_q = null;
          this.field_n = null;
          this.field_p = false;
          field_i = "1.1";
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
        ((jk) (this)).field_k = stackIn_3_1 != 0;
        field_o = "Unknown";
        field_b = param0;
        field_j = param1;
        try {
          L1: {
            field_o = System.getProperty("java.vendor");
            field_i = System.getProperty("java.version");
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
            this.field_p = true;
            break L3;
          }
        }
        try {
          L4: {
            field_e = System.getProperty("os.name");
            break L4;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            exception = (Exception) (Object) decompiledCaughtException;
            field_e = "Unknown";
            break L5;
          }
        }
        field_c = field_e.toLowerCase();
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
          if (null != field_l) {
            break L13;
          } else {
            field_l = "~/";
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
          if (this.field_p) {
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
                field_m = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
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
          ul.a(21747, field_j, field_b);
          if (!this.field_k) {
            break L21;
          } else {
            this.field_d = new eg(ul.a((String) null, field_b, "random.dat", (byte) 86), "rw", 25L);
            this.field_a = new eg(ul.a((byte) -103, "main_file_cache.dat2"), "rw", 314572800L);
            this.field_n = new eg(ul.a((byte) -69, "main_file_cache.idx255"), "rw", 1048576L);
            this.field_r = new eg[param2];
            var5_int = 0;
            L22: while (true) {
              if (param2 <= var5_int) {
                L23: {
                  if (this.field_p) {
                    try {
                      L24: {
                        discarded$10 = Class.forName("kc").newInstance();
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
                        this.field_g = Class.forName("wd").newInstance();
                        break L27;
                      } else {
                        var6 = new gj();
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
                      if (!this.field_p) {
                        this.field_u = Class.forName("sm").newInstance();
                        break L30;
                      } else {
                        this.field_h = new ff();
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
                this.field_r[var5_int] = new eg(ul.a((byte) -113, "main_file_cache.idx" + var5_int), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        this.field_s = false;
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
