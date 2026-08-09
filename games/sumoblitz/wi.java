/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wi implements Runnable {
    private static int field_j;
    java.awt.EventQueue field_g;
    private static volatile long field_c;
    static String field_o;
    sr field_l;
    static String field_u;
    private ep field_w;
    private static String field_s;
    private static String field_p;
    static String field_q;
    private static String field_h;
    private boolean field_m;
    private Object field_r;
    static java.lang.reflect.Method field_e;
    sr[] field_i;
    boolean field_f;
    boolean field_t;
    private jr field_k;
    sr field_n;
    private jr field_x;
    private Thread field_a;
    private Object field_v;
    sr field_d;
    private bm field_b;

    private final static sr a(String param0, boolean param1, String param2, int param3) {
        try {
            sr stackIn_15_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            String var7 = null;
            sr var8 = null;
            Exception var8_ref = null;
            String var9 = null;
            L0: {
              if (param1) {
                break L0;
              } else {
                var9 = (String) null;
                wi.a((String) null, true, (String) null, 127);
                break L0;
              }
            }
            L1: {
              if (-34 != (param3 ^ -1)) {
                if (34 == param3) {
                  var4 = "jagex_" + param0 + "_preferences" + param2 + "_wip.dat";
                  break L1;
                } else {
                  var4 = "jagex_" + param0 + "_preferences" + param2 + ".dat";
                  break L1;
                }
              } else {
                var4 = "jagex_" + param0 + "_preferences" + param2 + "_rc.dat";
                break L1;
              }
            }
            var5 = new String[]{"c:/rscache/", "/rscache/", field_s, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            var6 = 0;
            L2: while (true) {
              if (var6 < var5.length) {
                L3: {
                  var7 = var5[var6];
                  if (0 >= var7.length()) {
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
                    var8 = new sr(new File(var7, var4), "rw", 10000L);
                    stackIn_15_0 = (sr) (var8);
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

    private final jr a(Object param0, int param1, int param2, boolean param3, int param4) {
        jr var6 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        var6 = new jr();
        var6.field_e = param1;
        var6.field_b = param4;
        var6.field_a = param0;
        var6.field_g = param2;
        var7 = this;
        synchronized (var7) {
          L0: {
            L1: {
              if (!param3) {
                break L1;
              } else {
                this.field_d = (sr) null;
                break L1;
              }
            }
            L2: {
              if (this.field_x == null) {
                this.field_k = var6;
                this.field_x = var6;
                break L2;
              } else {
                this.field_x.field_f = var6;
                this.field_x = var6;
                break L2;
              }
            }
            this.notify();
            break L0;
          }
        }
        return var6;
    }

    private final jr a(int param0, String param1, boolean param2, boolean param3) {
        if (!param2) {
            this.field_b = (bm) null;
        }
        return this.a(param1, 0, param0, false, param3 ? 22 : 1);
    }

    final void a(boolean param0) {
        try {
            Throwable decompiledCaughtException = null;
            Object var2 = null;
            InterruptedException var2_ref = null;
            IOException var2_ref2 = null;
            int var2_int = 0;
            IOException var3 = null;
            Runnable var4 = null;
            var2 = this;
            synchronized (var2) {
              L0: {
                this.field_m = true;
                this.notifyAll();
                break L0;
              }
            }
            L1: {
              if (!param0) {
                break L1;
              } else {
                var4 = (Runnable) null;
                this.a(true, (Runnable) null, 68);
                break L1;
              }
            }
            try {
              L2: {
                this.field_a.join();
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
              if (this.field_l == null) {
                break L4;
              } else {
                try {
                  L5: {
                    this.field_l.b(0);
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
              if (null == this.field_d) {
                break L7;
              } else {
                try {
                  L8: {
                    this.field_d.b(0);
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
              if (this.field_i == null) {
                break L10;
              } else {
                var2_int = 0;
                L11: while (true) {
                  if (this.field_i.length <= var2_int) {
                    break L10;
                  } else {
                    if (null != this.field_i[var2_int]) {
                      try {
                        L12: {
                          this.field_i[var2_int].b(0);
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
              }
            }
            L14: {
              if (this.field_n == null) {
                break L14;
              } else {
                try {
                  L15: {
                    this.field_n.b(0);
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

    public final void run() {
        try {
            int stackIn_74_0 = 0;
            Throwable decompiledCaughtException = null;
            Object var2 = null;
            int var2_int = 0;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            InterruptedException var3 = null;
            sr var3_ref = null;
            int var3_int = 0;
            Exception var3_ref2 = null;
            hh var3_ref3 = null;
            int var4 = 0;
            String var4_ref_String = null;
            int var5 = 0;
            java.awt.datatransfer.Transferable var7 = null;
            jr var8 = null;
            Thread var9 = null;
            Object[] var10 = null;
            Object[] var11 = null;
            java.awt.datatransfer.Clipboard var12 = null;
            String var13 = null;
            java.awt.Component var14 = null;
            Object[] var15 = null;
            Object var16 = null;
            String var16_ref = null;
            java.awt.Frame var17 = null;
            java.awt.datatransfer.Clipboard var18 = null;
            var16 = null;
            L0: while (true) {
              var2 = this;
              synchronized (var2) {
                L1: {
                  L2: while (true) {
                    if (this.field_m) {
                      return;
                    } else {
                      if (null == this.field_k) {
                        try {
                          L3: {
                            this.wait();
                            break L3;
                          }
                        } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          L4: {
                            var3 = (InterruptedException) (Object) decompiledCaughtException;
                            break L4;
                          }
                        }
                        continue L2;
                      } else {
                        L5: {
                          var8 = this.field_k;
                          this.field_k = this.field_k.field_f;
                          if (this.field_k != null) {
                            break L5;
                          } else {
                            this.field_x = null;
                            break L5;
                          }
                        }
                        break L1;
                      }
                    }
                  }
                }
              }
              try {
                L6: {
                  L7: {
                    var2_int = var8.field_b;
                    if (-2 == (var2_int ^ -1)) {
                      if (wq.a(-24) < field_c) {
                        throw new IOException();
                      } else {
                        var8.field_d = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.field_a)), var8.field_g);
                        break L7;
                      }
                    } else {
                      if (22 != var2_int) {
                        if ((var2_int ^ -1) != -3) {
                          if (-5 == (var2_int ^ -1)) {
                            if (field_c <= wq.a(-94)) {
                              var8.field_d = new DataInputStream(((java.net.URL) (var8.field_a)).openStream());
                              break L7;
                            } else {
                              throw new IOException();
                            }
                          } else {
                            if (-9 != (var2_int ^ -1)) {
                              if ((var2_int ^ -1) != -10) {
                                if (18 != var2_int) {
                                  if (var2_int == 19) {
                                    var7 = (java.awt.datatransfer.Transferable) (var8.field_a);
                                    var18 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var18.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L7;
                                  } else {
                                    if (this.field_f) {
                                      if (var2_int != 3) {
                                        if (-22 != (var2_int ^ -1)) {
                                          if (-6 != (var2_int ^ -1)) {
                                            if (-7 == (var2_int ^ -1)) {
                                              var17 = new java.awt.Frame("Jagex Full Screen");
                                              var8.field_d = var17;
                                              var17.setResizable(false);
                                              if (this.field_t) {
                                                this.field_w.a(var8.field_g & 65535, (byte) -123, var8.field_g >>> 254430288, var8.field_e & 65535, var8.field_e >> -2084239760, var17);
                                                break L7;
                                              } else {
                                                Class.forName("cu").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_r, new Object[]{var17, new Integer(var8.field_g >>> 1559682192), new Integer(var8.field_g & 65535), new Integer(var8.field_e >> -724105296), new Integer(65535 & var8.field_e)});
                                                break L7;
                                              }
                                            } else {
                                              if (-8 != (var2_int ^ -1)) {
                                                if (12 != var2_int) {
                                                  if (-14 == (var2_int ^ -1)) {
                                                    var3_ref = wi.a("", true, (String) (var8.field_a), field_j);
                                                    var8.field_d = var3_ref;
                                                    break L7;
                                                  } else {
                                                    L8: {
                                                      if (!this.field_f) {
                                                        break L8;
                                                      } else {
                                                        if (14 == var2_int) {
                                                          var3_int = var8.field_g;
                                                          var4 = var8.field_e;
                                                          if (!this.field_t) {
                                                            Class.forName("cg").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_v, new Object[]{new Integer(var3_int), new Integer(var4)});
                                                            break L7;
                                                          } else {
                                                            this.field_b.a(var4, var3_int, (byte) 84);
                                                            break L7;
                                                          }
                                                        } else {
                                                          break L8;
                                                        }
                                                      }
                                                    }
                                                    L9: {
                                                      if (!this.field_f) {
                                                        break L9;
                                                      } else {
                                                        if (var2_int != 15) {
                                                          break L9;
                                                        } else {
                                                          L10: {
                                                            if (-1 == (var8.field_g ^ -1)) {
                                                              stackIn_74_0 = 0;
                                                              break L10;
                                                            } else {
                                                              stackIn_74_0 = 1;
                                                              break L10;
                                                            }
                                                          }
                                                          var3_int = stackIn_74_0;
                                                          var14 = (java.awt.Component) (var8.field_a);
                                                          if (this.field_t) {
                                                            this.field_b.a(false, var3_int != 0, var14);
                                                            break L7;
                                                          } else {
                                                            Class.forName("cg").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_v, new Object[]{var14, new Boolean(var3_int != 0)});
                                                            break L7;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L11: {
                                                      if (this.field_t) {
                                                        break L11;
                                                      } else {
                                                        if (-18 != (var2_int ^ -1)) {
                                                          break L11;
                                                        } else {
                                                          var15 = (Object[]) (var8.field_a);
                                                          Class.forName("cg").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_v, new Object[]{var15[0], var15[1], new Integer(var8.field_g), new Integer(var8.field_e), var15[2]});
                                                          break L7;
                                                        }
                                                      }
                                                    }
                                                    if (16 == var2_int) {
                                                      try {
                                                        L12: {
                                                          if (!field_o.startsWith("win")) {
                                                            throw wi.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          } else {
                                                            L13: {
                                                              var16_ref = (String) (var8.field_a);
                                                              if (var16_ref.startsWith("http://")) {
                                                                break L13;
                                                              } else {
                                                                if (!var16_ref.startsWith("https://")) {
                                                                  throw wi.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  break L13;
                                                                }
                                                              }
                                                            }
                                                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L14: while (true) {
                                                              if (var16_ref.length() <= var5) {
                                                                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var16_ref + "\"");
                                                                var8.field_d = null;
                                                                break L12;
                                                              } else {
                                                                if (var4_ref_String.indexOf((int) var16_ref.charAt(var5)) != -1) {
                                                                  var5++;
                                                                  continue L14;
                                                                } else {
                                                                  throw wi.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter1) {
                                                        decompiledCaughtException = decompiledCaughtParameter1;
                                                        var3_ref2 = (Exception) (Object) decompiledCaughtException;
                                                        var8.field_d = var3_ref2;
                                                        throw wi.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                                                      }
                                                      break L7;
                                                    } else {
                                                      throw wi.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    }
                                                  }
                                                } else {
                                                  var3_ref = wi.a(field_p, true, (String) (var8.field_a), field_j);
                                                  var8.field_d = var3_ref;
                                                  break L7;
                                                }
                                              } else {
                                                if (!this.field_t) {
                                                  Class.forName("cu").getMethod("exit", new Class[]{}).invoke(this.field_r, new Object[]{});
                                                  break L7;
                                                } else {
                                                  this.field_w.a((java.awt.Frame) (var8.field_a), 8);
                                                  break L7;
                                                }
                                              }
                                            }
                                          } else {
                                            if (this.field_t) {
                                              var8.field_d = this.field_w.a((byte) -128);
                                              break L7;
                                            } else {
                                              var8.field_d = Class.forName("cu").getMethod("listmodes", new Class[]{}).invoke(this.field_r, new Object[]{});
                                              break L7;
                                            }
                                          }
                                        } else {
                                          if ((wq.a(-18) ^ -1L) > (field_c ^ -1L)) {
                                            throw new IOException();
                                          } else {
                                            var8.field_d = java.net.InetAddress.getByName((String) (var8.field_a)).getAddress();
                                            break L7;
                                          }
                                        }
                                      } else {
                                        if (field_c <= wq.a(-106)) {
                                          var13 = (var8.field_g >> -884897608 & 255) + "." + (var8.field_g >> 76807024 & 255) + "." + ((var8.field_g & 65425) >> -460963224) + "." + (var8.field_g & 255);
                                          var8.field_d = java.net.InetAddress.getByName(var13).getHostName();
                                          break L7;
                                        } else {
                                          throw new IOException();
                                        }
                                      }
                                    } else {
                                      throw wi.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    }
                                  }
                                } else {
                                  var12 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8.field_d = var12.getContents((Object) null);
                                  break L7;
                                }
                              } else {
                                L15: {
                                  var11 = (Object[]) (var8.field_a);
                                  if (this.field_f) {
                                    if (null != ((Class) (var11[0])).getClassLoader()) {
                                      break L15;
                                    } else {
                                      throw new SecurityException();
                                    }
                                  } else {
                                    break L15;
                                  }
                                }
                                var8.field_d = ((Class) (var11[0])).getDeclaredField((String) (var11[1]));
                                break L7;
                              }
                            } else {
                              L16: {
                                var10 = (Object[]) (var8.field_a);
                                if (this.field_f) {
                                  if (null == ((Class) (var10[0])).getClassLoader()) {
                                    throw new SecurityException();
                                  } else {
                                    break L16;
                                  }
                                } else {
                                  break L16;
                                }
                              }
                              var8.field_d = ((Class) (var10[0])).getDeclaredMethod((String) (var10[1]), (Class[]) (var10[2]));
                              break L7;
                            }
                          }
                        } else {
                          var9 = new Thread((Runnable) (var8.field_a));
                          var9.setDaemon(true);
                          var9.start();
                          var9.setPriority(var8.field_g);
                          var8.field_d = var9;
                          break L7;
                        }
                      } else {
                        if (field_c > wq.a(-96)) {
                          throw new IOException();
                        } else {
                          try {
                              if (false) throw (hh) null;
                            L17: {
                              var8.field_d = rf.a((String) (var8.field_a), var8.field_g, true).b((byte) 61);
                              break L17;
                            }
                          } catch (hh decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref3 = (hh) (Object) decompiledCaughtException;
                            var8.field_d = var3_ref3.getMessage();
                            throw var3_ref3;
                          }
                          break L7;
                        }
                      }
                    }
                  }
                  var8.field_c = 1;
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
                  var8.field_c = 2;
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

    final boolean a(byte param0) {
        if (!(this.field_f)) {
            return false;
        }
        int var2 = -31 % ((param0 - 16) / 51);
        if (!this.field_t) {
            return this.field_r != null ? true : false;
        }
        return null != this.field_w ? true : false;
    }

    final jr a(int param0, Class param1, String param2, Class[] param3) {
        if (param0 != 0) {
            this.field_i = (sr[]) null;
        }
        return this.a(new Object[]{param1, param2, param3}, 0, 0, false, 8);
    }

    final jr a(boolean param0, Runnable param1, int param2) {
        if (!param0) {
            File var5 = (File) null;
            this.a((byte[]) null, -30, (File) null);
        }
        return this.a(param1, 0, param2, !param0 ? true : false, 2);
    }

    final jr a(byte param0, String param1, int param2) {
        if (param0 < 8) {
            field_j = 62;
        }
        return this.a(param2, param1, true, false);
    }

    final boolean a(byte[] param0, int param1, File param2) {
        FileOutputStream var4 = null;
        IOException var4_ref = null;
        Class[] var5 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = new FileOutputStream(param2);
              if (param1 == -31357) {
                break L1;
              } else {
                var5 = (Class[]) null;
                this.a(-111, (Class) null, (String) null, (Class[]) null);
                break L1;
              }
            }
            var4.write(param0, 0, param0.length);
            var4.close();
            stackIn_3_0 = 1;
            break L0;
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (IOException) (Object) decompiledCaughtException;
          throw new RuntimeException();
        }
        return stackIn_3_0 != 0;
    }

    final jr a(byte param0, java.net.URL param1) {
        if (param0 <= 71) {
            return (jr) null;
        }
        return this.a(param1, 0, 0, false, 4);
    }

    final jr a(java.awt.Frame param0, int param1) {
        if (param1 != 19) {
            this.a((byte) -116);
        }
        return this.a(param0, 0, 0, false, 7);
    }

    final jr b(byte param0) {
        int var2 = -105 % ((73 - param0) / 41);
        return this.a((Object) null, 0, 0, false, 5);
    }

    final jr a(int param0, String param1, Class param2) {
        if (param0 != 0) {
            Class var5 = (Class) null;
            this.a(-2, (String) null, (Class) null);
        }
        return this.a(new Object[]{param2, param1}, 0, 0, false, 9);
    }

    final jr a(boolean param0, int param1, int param2, int param3, int param4) {
        if (param0) {
            return (jr) null;
        }
        return this.a((Object) null, param1 + (param2 << 1698487824), param4 + (param3 << -551835248), false, 6);
    }

    wi(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception exception = null;
        Throwable throwable = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        ThreadGroup var5 = null;
        ThreadGroup var6 = null;
        Thread[] var7 = null;
        int var8 = 0;
        ep var9 = null;
        ThreadGroup var10 = null;
        ThreadGroup var11 = null;
        L0: {
          this.field_l = null;
          this.field_m = false;
          this.field_f = false;
          this.field_t = false;
          this.field_k = null;
          this.field_x = null;
          this.field_n = null;
          this.field_d = null;
          field_u = "Unknown";
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
        ((wi) (this)).field_f = stackIn_3_1 != 0;
        field_p = param1;
        field_j = param0;
        field_q = "1.1";
        try {
          L1: {
            field_u = System.getProperty("java.vendor");
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
          if ((field_u.toLowerCase().indexOf("microsoft") ^ -1) != 0) {
            this.field_t = true;
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
        field_o = field_h.toLowerCase();
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
              field_s = System.getProperty("user.home");
              if (field_s == null) {
                break L11;
              } else {
                field_s = field_s + "/";
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
          if (null == field_s) {
            field_s = "~/";
            break L13;
          } else {
            break L13;
          }
        }
        try {
          L14: {
            this.field_g = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
          if (!this.field_t) {
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
          } else {
            break L16;
          }
        }
        L21: {
          el.a(0, field_j, field_p);
          if (!this.field_f) {
            break L21;
          } else {
            this.field_n = new sr(el.a((String) null, field_j, 95, "random.dat"), "rw", 25L);
            this.field_l = new sr(el.a("main_file_cache.dat2", (byte) -8), "rw", 314572800L);
            this.field_d = new sr(el.a("main_file_cache.idx255", (byte) -8), "rw", 1048576L);
            this.field_i = new sr[param2];
            var5_int = 0;
            L22: while (true) {
              if (param2 <= var5_int) {
                L23: {
                  if (this.field_t) {
                    try {
                      L24: {
                        Class.forName("uf").newInstance();
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
                      if (!this.field_t) {
                        this.field_r = Class.forName("cu").newInstance();
                        break L27;
                      } else {
                        var9 = new ep();
                        this.field_w = var9;
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
                      if (this.field_t) {
                        this.field_b = new bm();
                        break L30;
                      } else {
                        this.field_v = Class.forName("cg").newInstance();
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
                this.field_i[var5_int] = new sr(el.a("main_file_cache.idx" + var5_int, (byte) -8), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        L32: {
          if (!this.field_f) {
            break L32;
          } else {
            if (this.field_t) {
              break L32;
            } else {
              var10 = Thread.currentThread().getThreadGroup();
              var5 = var10;
              var6 = var10.getParent();
              L33: while (true) {
                if (var6 == null) {
                  var7 = new Thread[1000];
                  var5.enumerate(var7);
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
                  var11 = var6;
                  var5 = var11;
                  var6 = var11.getParent();
                  continue L33;
                }
              }
            }
          }
        }
        this.field_m = false;
        this.field_a = new Thread((Runnable) (this));
        this.field_a.setPriority(10);
        this.field_a.setDaemon(true);
        this.field_a.start();
    }

    static {
        field_c = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
