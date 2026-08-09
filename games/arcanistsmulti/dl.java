/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class dl implements Runnable {
    private og field_x;
    private static volatile long field_w;
    kb field_e;
    private ca field_m;
    private static String field_t;
    static String field_c;
    private Object field_k;
    private Object field_g;
    static String field_l;
    private boolean field_j;
    kb field_n;
    private static String field_i;
    kb field_q;
    private boolean field_v;
    kb[] field_d;
    private static String field_h;
    private t field_u;
    boolean field_p;
    static String field_s;
    private og field_b;
    private static int field_r;
    java.awt.EventQueue field_a;
    static java.lang.reflect.Method field_f;
    private Thread field_o;

    final og a(boolean param0, java.net.URL param1) {
        if (!param0) {
            this.field_v = true;
        }
        return this.a(false, 4, 0, 0, param1);
    }

    private final static kb a(String param0, int param1, String param2, int param3) {
        try {
            kb stackIn_14_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            String var7 = null;
            kb var8 = null;
            Exception var8_ref = null;
            L0: {
              if (-34 == (param1 ^ -1)) {
                var4 = "jagex_" + param2 + "_preferences" + param0 + "_rc.dat";
                break L0;
              } else {
                if (param1 == 34) {
                  var4 = "jagex_" + param2 + "_preferences" + param0 + "_wip.dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param2 + "_preferences" + param0 + ".dat";
                  break L0;
                }
              }
            }
            L1: {
              var5 = new String[]{"c:/rscache/", "/rscache/", field_h, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
              if (param3 == 10000) {
                break L1;
              } else {
                field_l = (String) null;
                break L1;
              }
            }
            var6 = 0;
            L2: while (true) {
              if (var6 < var5.length) {
                L3: {
                  var7 = var5[var6];
                  if (var7.length() <= 0) {
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
                    var8 = new kb(new File(var7, var4), "rw", 10000L);
                    stackIn_14_0 = (kb) (var8);
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

    final og b(int param0) {
        if (param0 != -27886) {
            String var3 = (String) null;
            this.a(-93, true, (String) null);
        }
        return this.a(false, 5, 0, 0, (Object) null);
    }

    final og a(int param0, boolean param1, String param2) {
        if (!param1) {
            field_i = (String) null;
        }
        return this.a(false, param2, (byte) 46, param0);
    }

    public final void run() {
        try {
            int stackIn_55_0 = 0;
            Throwable decompiledCaughtException = null;
            Object var2 = null;
            int var2_int = 0;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            InterruptedException var3 = null;
            hj var3_ref = null;
            kb var3_ref2 = null;
            int var3_int = 0;
            Exception var3_ref3 = null;
            int var4 = 0;
            String var4_ref_String = null;
            int var5 = 0;
            java.awt.datatransfer.Transferable var7 = null;
            og var8 = null;
            Object[] var9 = null;
            String var10 = null;
            java.awt.Component var11 = null;
            String var12 = null;
            Object[] var13 = null;
            java.awt.Frame var14 = null;
            java.awt.datatransfer.Clipboard var15 = null;
            java.awt.datatransfer.Clipboard var16 = null;
            Object[] var17 = null;
            Thread var18 = null;
            L0: while (true) {
              var2 = this;
              synchronized (var2) {
                L1: {
                  L2: while (true) {
                    if (this.field_v) {
                      return;
                    } else {
                      if (this.field_x != null) {
                        L3: {
                          var8 = this.field_x;
                          this.field_x = this.field_x.field_d;
                          if (this.field_x == null) {
                            this.field_b = null;
                            break L3;
                          } else {
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
                    }
                  }
                }
              }
              try {
                L6: {
                  L7: {
                    var2_int = var8.field_f;
                    if (-2 == (var2_int ^ -1)) {
                      if ((qj.b(-26572) ^ -1L) <= (field_w ^ -1L)) {
                        var8.field_g = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.field_b)), var8.field_c);
                        break L7;
                      } else {
                        throw new IOException();
                      }
                    } else {
                      if (-23 == (var2_int ^ -1)) {
                        if ((qj.b(-26572) ^ -1L) > (field_w ^ -1L)) {
                          throw new IOException();
                        } else {
                          try {
                              if (false) throw (hj) null;
                            L8: {
                              var8.field_g = ka.a((String) (var8.field_b), var8.field_c, 0).b((byte) -128);
                              break L8;
                            }
                          } catch (hj decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref = (hj) (Object) decompiledCaughtException;
                            var8.field_g = var3_ref.getMessage();
                            throw var3_ref;
                          }
                          break L7;
                        }
                      } else {
                        if (-3 == (var2_int ^ -1)) {
                          var18 = new Thread((Runnable) (var8.field_b));
                          var18.setDaemon(true);
                          var18.start();
                          var18.setPriority(var8.field_c);
                          var8.field_g = var18;
                          break L7;
                        } else {
                          if (4 != var2_int) {
                            if (-9 == (var2_int ^ -1)) {
                              L9: {
                                var17 = (Object[]) (var8.field_b);
                                if (this.field_p) {
                                  if (((Class) (var17[0])).getClassLoader() != null) {
                                    break L9;
                                  } else {
                                    throw new SecurityException();
                                  }
                                } else {
                                  break L9;
                                }
                              }
                              var8.field_g = ((Class) (var17[0])).getDeclaredMethod((String) (var17[1]), (Class[]) (var17[2]));
                              break L7;
                            } else {
                              if ((var2_int ^ -1) != -10) {
                                if (var2_int == 18) {
                                  var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8.field_g = var16.getContents((Object) null);
                                  break L7;
                                } else {
                                  if (var2_int == 19) {
                                    var7 = (java.awt.datatransfer.Transferable) (var8.field_b);
                                    var15 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var15.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L7;
                                  } else {
                                    if (!this.field_p) {
                                      throw dl.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    } else {
                                      if (var2_int != 3) {
                                        if (var2_int == 21) {
                                          if (field_w > qj.b(-26572)) {
                                            throw new IOException();
                                          } else {
                                            var8.field_g = java.net.InetAddress.getByName((String) (var8.field_b)).getAddress();
                                            break L7;
                                          }
                                        } else {
                                          if (-6 != (var2_int ^ -1)) {
                                            if (var2_int == 6) {
                                              var14 = new java.awt.Frame("Jagex Full Screen");
                                              var8.field_g = var14;
                                              var14.setResizable(false);
                                              if (!this.field_j) {
                                                Class.forName("vj").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_g, new Object[]{var14, new Integer(var8.field_c >>> -359904656), new Integer(var8.field_c & 65535), new Integer(var8.field_a >> -922196016), new Integer(var8.field_a & 65535)});
                                                break L7;
                                              } else {
                                                this.field_u.a(18, var8.field_a >> -289391728, var8.field_c & 65535, var14, var8.field_c >>> -61650896, var8.field_a & 65535);
                                                break L7;
                                              }
                                            } else {
                                              if ((var2_int ^ -1) == -8) {
                                                if (!this.field_j) {
                                                  Class.forName("vj").getMethod("exit", new Class[]{}).invoke(this.field_g, new Object[]{});
                                                  break L7;
                                                } else {
                                                  this.field_u.a((java.awt.Frame) (var8.field_b), (byte) 6);
                                                  break L7;
                                                }
                                              } else {
                                                if (var2_int == 12) {
                                                  var3_ref2 = dl.a((String) (var8.field_b), field_r, field_i, 10000);
                                                  var8.field_g = var3_ref2;
                                                  break L7;
                                                } else {
                                                  if (13 == var2_int) {
                                                    var3_ref2 = dl.a((String) (var8.field_b), field_r, "", 10000);
                                                    var8.field_g = var3_ref2;
                                                    break L7;
                                                  } else {
                                                    L10: {
                                                      if (!this.field_p) {
                                                        break L10;
                                                      } else {
                                                        if ((var2_int ^ -1) == -15) {
                                                          var3_int = var8.field_c;
                                                          var4 = var8.field_a;
                                                          if (this.field_j) {
                                                            this.field_m.a(26899, var4, var3_int);
                                                            break L7;
                                                          } else {
                                                            Class.forName("fa").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_k, new Object[]{new Integer(var3_int), new Integer(var4)});
                                                            break L7;
                                                          }
                                                        } else {
                                                          break L10;
                                                        }
                                                      }
                                                    }
                                                    L11: {
                                                      if (!this.field_p) {
                                                        break L11;
                                                      } else {
                                                        if (var2_int != 15) {
                                                          break L11;
                                                        } else {
                                                          L12: {
                                                            if (var8.field_c == 0) {
                                                              stackIn_55_0 = 0;
                                                              break L12;
                                                            } else {
                                                              stackIn_55_0 = 1;
                                                              break L12;
                                                            }
                                                          }
                                                          var3_int = stackIn_55_0;
                                                          var11 = (java.awt.Component) (var8.field_b);
                                                          if (!this.field_j) {
                                                            Class.forName("fa").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_k, new Object[]{var11, new Boolean(var3_int != 0)});
                                                            break L7;
                                                          } else {
                                                            this.field_m.a(122, var11, var3_int != 0);
                                                            break L7;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L13: {
                                                      if (this.field_j) {
                                                        break L13;
                                                      } else {
                                                        if (-18 == (var2_int ^ -1)) {
                                                          var13 = (Object[]) (var8.field_b);
                                                          Class.forName("fa").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_k, new Object[]{var13[0], var13[1], new Integer(var8.field_c), new Integer(var8.field_a), var13[2]});
                                                          break L7;
                                                        } else {
                                                          break L13;
                                                        }
                                                      }
                                                    }
                                                    if (-17 == (var2_int ^ -1)) {
                                                      try {
                                                        L14: {
                                                          if (field_s.startsWith("win")) {
                                                            L15: {
                                                              var12 = (String) (var8.field_b);
                                                              if (var12.startsWith("http://")) {
                                                                break L15;
                                                              } else {
                                                                if (!var12.startsWith("https://")) {
                                                                  throw dl.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  break L15;
                                                                }
                                                              }
                                                            }
                                                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L16: while (true) {
                                                              if (var12.length() <= var5) {
                                                                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var12 + "\"");
                                                                var8.field_g = null;
                                                                break L14;
                                                              } else {
                                                                if (-1 != var4_ref_String.indexOf((int) var12.charAt(var5))) {
                                                                  var5++;
                                                                  continue L16;
                                                                } else {
                                                                  throw dl.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            throw dl.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                                                        decompiledCaughtException = decompiledCaughtParameter2;
                                                        var3_ref3 = (Exception) (Object) decompiledCaughtException;
                                                        var8.field_g = var3_ref3;
                                                        throw dl.<RuntimeException>$cfr$sneakyThrow(var3_ref3);
                                                      }
                                                      break L7;
                                                    } else {
                                                      throw dl.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            if (!this.field_j) {
                                              var8.field_g = Class.forName("vj").getMethod("listmodes", new Class[]{}).invoke(this.field_g, new Object[]{});
                                              break L7;
                                            } else {
                                              var8.field_g = this.field_u.a(0);
                                              break L7;
                                            }
                                          }
                                        }
                                      } else {
                                        if (field_w <= qj.b(-26572)) {
                                          var10 = (var8.field_c >> 75295768 & 255) + "." + ((var8.field_c & 16726054) >> -1512485584) + "." + ((65321 & var8.field_c) >> -1528070872) + "." + (var8.field_c & 255);
                                          var8.field_g = java.net.InetAddress.getByName(var10).getHostName();
                                          break L7;
                                        } else {
                                          throw new IOException();
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                L17: {
                                  var9 = (Object[]) (var8.field_b);
                                  if (!this.field_p) {
                                    break L17;
                                  } else {
                                    if (null == ((Class) (var9[0])).getClassLoader()) {
                                      throw new SecurityException();
                                    } else {
                                      break L17;
                                    }
                                  }
                                }
                                var8.field_g = ((Class) (var9[0])).getDeclaredField((String) (var9[1]));
                                break L7;
                              }
                            }
                          } else {
                            if (qj.b(-26572) >= field_w) {
                              var8.field_g = new DataInputStream(((java.net.URL) (var8.field_b)).openStream());
                              break L7;
                            } else {
                              throw new IOException();
                            }
                          }
                        }
                      }
                    }
                  }
                  var8.field_e = 1;
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
                  var8.field_e = 2;
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

    final og a(java.awt.Frame param0, int param1) {
        if (param1 != 6) {
            Class var4 = (Class) null;
            this.a(-82, (String) null, (Class[]) null, (Class) null);
        }
        return this.a(false, 7, 0, 0, param0);
    }

    final void a(int param0) {
        try {
            Throwable decompiledCaughtException = null;
            Object var2_ref_Object = null;
            InterruptedException var2_ref_InterruptedException = null;
            IOException var2_ref_IOException = null;
            int var2 = 0;
            int var3_int = 0;
            IOException var3 = null;
            IOException var4 = null;
            var2_ref_Object = this;
            synchronized (var2_ref_Object) {
              L0: {
                this.field_v = true;
                this.notifyAll();
                break L0;
              }
            }
            try {
              L1: {
                this.field_o.join();
                break L1;
              }
            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var2_ref_InterruptedException = (InterruptedException) (Object) decompiledCaughtException;
                break L2;
              }
            }
            L3: {
              if (null == this.field_q) {
                break L3;
              } else {
                try {
                  L4: {
                    this.field_q.c(-103);
                    break L4;
                  }
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L5: {
                    var2_ref_IOException = (IOException) (Object) decompiledCaughtException;
                    break L5;
                  }
                }
                break L3;
              }
            }
            L6: {
              if (this.field_e == null) {
                break L6;
              } else {
                try {
                  L7: {
                    this.field_e.c(101);
                    break L7;
                  }
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L8: {
                    var2_ref_IOException = (IOException) (Object) decompiledCaughtException;
                    break L8;
                  }
                }
                break L6;
              }
            }
            L9: {
              var2 = -36 % ((param0 - -60) / 54);
              if (this.field_d == null) {
                break L9;
              } else {
                var3_int = 0;
                L10: while (true) {
                  if (var3_int >= this.field_d.length) {
                    break L9;
                  } else {
                    if (null != this.field_d[var3_int]) {
                      try {
                        L11: {
                          this.field_d[var3_int].c(101);
                          var3_int++;
                          break L11;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L12: {
                          var4 = (IOException) (Object) decompiledCaughtException;
                          var3_int++;
                          break L12;
                        }
                      }
                      continue L10;
                    } else {
                      var3_int++;
                      continue L10;
                    }
                  }
                }
              }
            }
            L13: {
              if (null == this.field_n) {
                break L13;
              } else {
                try {
                  L14: {
                    this.field_n.c(-20);
                    break L14;
                  }
                } catch (java.io.IOException decompiledCaughtParameter4) {
                  decompiledCaughtException = decompiledCaughtParameter4;
                  L15: {
                    var3 = (IOException) (Object) decompiledCaughtException;
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

    private final og a(boolean param0, String param1, byte param2, int param3) {
        if (param2 <= 8) {
            this.a((byte) -97);
        }
        return this.a(false, param0 ? 22 : 1, 0, param3, param1);
    }

    private final og a(boolean param0, int param1, int param2, int param3, Object param4) {
        og var6 = null;
        Object var7 = null;
        Object var7_ref = null;
        og stackIn_3_0 = null;
        Throwable decompiledCaughtException = null;
        var6 = new og();
        var6.field_b = param4;
        var6.field_f = param1;
        var6.field_a = param2;
        var6.field_c = param3;
        var7_ref = this;
        synchronized (var7_ref) {
          L0: {
            if (!param0) {
              L1: {
                if (null == this.field_b) {
                  this.field_x = var6;
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
            } else {
              stackIn_3_0 = (og) null;
              return stackIn_3_0;
            }
          }
        }
        return var6;
    }

    final og a(byte param0, String param1, Class param2) {
        if (param0 != -95) {
            this.field_d = (kb[]) null;
        }
        return this.a(false, 9, 0, 0, new Object[]{param2, param1});
    }

    final og a(int param0, int param1, int param2, int param3, int param4) {
        if (param2 <= 94) {
            this.field_j = true;
        }
        return this.a(false, 6, (param1 << -1227485840) + param4, (param0 << -661178480) - -param3, (Object) null);
    }

    final boolean a(byte param0) {
        if (!this.field_p) {
            return false;
        }
        if (param0 != 46) {
            this.b(53);
        }
        if (this.field_j) {
            return null != this.field_u ? true : false;
        }
        return this.field_g != null ? true : false;
    }

    final og a(int param0, String param1, Class[] param2, Class param3) {
        if (param0 != -30176) {
            field_l = (String) null;
        }
        return this.a(false, 8, 0, 0, new Object[]{param3, param1, param2});
    }

    final og a(int param0, int param1, Runnable param2) {
        if (param0 < 121) {
            field_t = (String) null;
        }
        return this.a(false, 2, 0, param1, param2);
    }

    dl(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception exception = null;
        Throwable throwable = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        t var7 = null;
        L0: {
          this.field_x = null;
          this.field_j = false;
          this.field_v = false;
          this.field_q = null;
          this.field_e = null;
          this.field_n = null;
          this.field_b = null;
          this.field_p = false;
          field_l = "Unknown";
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
        ((dl) (this)).field_p = stackIn_3_1 != 0;
        field_r = param0;
        field_c = "1.1";
        field_i = param1;
        try {
          L1: {
            field_l = System.getProperty("java.vendor");
            field_c = System.getProperty("java.version");
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
          if ((field_l.toLowerCase().indexOf("microsoft") ^ -1) == 0) {
            break L3;
          } else {
            this.field_j = true;
            break L3;
          }
        }
        try {
          L4: {
            field_t = System.getProperty("os.name");
            break L4;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            exception = (Exception) (Object) decompiledCaughtException;
            field_t = "Unknown";
            break L5;
          }
        }
        field_s = field_t.toLowerCase();
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
              field_h = System.getProperty("user.home");
              if (field_h == null) {
                break L11;
              } else {
                field_h = field_h + "/";
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
          if (null != field_h) {
            break L13;
          } else {
            field_h = "~/";
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
          if (!this.field_j) {
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
                field_f = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
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
          nd.a(field_i, field_r, true);
          if (!this.field_p) {
            break L21;
          } else {
            this.field_n = new kb(nd.a("random.dat", -3, field_r, (String) null), "rw", 25L);
            this.field_q = new kb(nd.a((byte) 67, "main_file_cache.dat2"), "rw", 314572800L);
            this.field_e = new kb(nd.a((byte) 67, "main_file_cache.idx255"), "rw", 1048576L);
            this.field_d = new kb[param2];
            var5_int = 0;
            L22: while (true) {
              if (var5_int >= param2) {
                L23: {
                  if (!this.field_j) {
                    break L23;
                  } else {
                    try {
                      L24: {
                        Class.forName("te").newInstance();
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
                        var7 = new t();
                        this.field_u = var7;
                        break L27;
                      } else {
                        this.field_g = Class.forName("vj").newInstance();
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
                        this.field_k = Class.forName("fa").newInstance();
                        break L30;
                      } else {
                        this.field_m = new ca();
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
                this.field_d[var5_int] = new kb(nd.a((byte) 67, "main_file_cache.idx" + var5_int), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        this.field_v = false;
        this.field_o = new Thread((Runnable) (this));
        this.field_o.setPriority(10);
        this.field_o.setDaemon(true);
        this.field_o.start();
    }

    static {
        field_w = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
