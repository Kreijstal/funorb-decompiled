/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fe implements Runnable {
    private Thread field_l;
    static String field_c;
    static String field_k;
    static java.lang.reflect.Method field_x;
    private boolean field_r;
    private static String field_u;
    java.awt.EventQueue field_m;
    private ib field_p;
    private t field_o;
    private Object field_t;
    private static int field_g;
    private static String field_n;
    private ke field_q;
    private static volatile long field_a;
    boolean field_e;
    static String field_w;
    di field_h;
    di field_v;
    di field_b;
    di[] field_s;
    private static String field_f;
    private Object field_d;
    private ib field_j;
    private boolean field_i;

    final boolean b(int param0) {
        if (!this.field_e) {
            return false;
        }
        if (param0 != 5) {
            return false;
        }
        if (this.field_i) {
            return null != this.field_q ? true : false;
        }
        return null != this.field_d ? true : false;
    }

    final void a(byte param0) {
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
                this.field_r = true;
                this.notifyAll();
                break L0;
              }
            }
            try {
              L1: {
                L2: {
                  if (param0 <= -15) {
                    break L2;
                  } else {
                    this.a(-108, -85, -43, -56, -118);
                    break L2;
                  }
                }
                this.field_l.join();
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
              if (this.field_b == null) {
                break L4;
              } else {
                try {
                  L5: {
                    this.field_b.a(false);
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
              if (null != this.field_h) {
                try {
                  L8: {
                    this.field_h.a(false);
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
              if (this.field_s != null) {
                var2_int = 0;
                L11: while (true) {
                  if (var2_int >= this.field_s.length) {
                    break L10;
                  } else {
                    if (this.field_s[var2_int] != null) {
                      try {
                        L12: {
                          this.field_s[var2_int].a(false);
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
              if (this.field_v != null) {
                try {
                  L15: {
                    this.field_v.a(false);
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

    final ib a(Class param0, byte param1, Class[] param2, String param3) {
        if (param1 <= 51) {
            java.net.URL var6 = (java.net.URL) null;
            this.a(-46, (java.net.URL) null);
        }
        return this.a(8, 0, (byte) -75, 0, new Object[]{param0, param3, param2});
    }

    public final void run() {
        try {
            int stackIn_58_0 = 0;
            Throwable decompiledCaughtException = null;
            Object var2 = null;
            int var2_int = 0;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            InterruptedException var3 = null;
            jd var3_ref = null;
            di var3_ref2 = null;
            int var3_int = 0;
            Exception var3_ref3 = null;
            int var4 = 0;
            String var4_ref_String = null;
            int var5 = 0;
            java.awt.datatransfer.Transferable var7 = null;
            ib var8 = null;
            Thread var9 = null;
            Object[] var10 = null;
            java.awt.datatransfer.Clipboard var11 = null;
            java.awt.datatransfer.Clipboard var12 = null;
            java.awt.Frame var13 = null;
            java.awt.Component var14 = null;
            String var15 = null;
            Object[] var16 = null;
            String var17 = null;
            Object[] var18 = null;
            L0: while (true) {
              var2 = this;
              synchronized (var2) {
                L1: {
                  L2: while (true) {
                    if (!this.field_r) {
                      if (null == this.field_p) {
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
                          var8 = this.field_p;
                          this.field_p = this.field_p.field_a;
                          if (null == this.field_p) {
                            this.field_j = null;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        break L1;
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
                    var2_int = var8.field_d;
                    if (-2 != (var2_int ^ -1)) {
                      if ((var2_int ^ -1) == -23) {
                        if (lk.a(0) >= field_a) {
                          try {
                              if (false) throw (jd) null;
                            L8: {
                              var8.field_g = li.a(false, (String) (var8.field_f), var8.field_b).a(-70);
                              break L8;
                            }
                          } catch (jd decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref = (jd) (Object) decompiledCaughtException;
                            var8.field_g = var3_ref.getMessage();
                            throw var3_ref;
                          }
                          break L7;
                        } else {
                          throw new IOException();
                        }
                      } else {
                        if ((var2_int ^ -1) != -3) {
                          if ((var2_int ^ -1) == -5) {
                            if (lk.a(0) >= field_a) {
                              var8.field_g = new DataInputStream(((java.net.URL) (var8.field_f)).openStream());
                              break L7;
                            } else {
                              throw new IOException();
                            }
                          } else {
                            if (8 != var2_int) {
                              if (-10 == (var2_int ^ -1)) {
                                L9: {
                                  var18 = (Object[]) (var8.field_f);
                                  if (!this.field_e) {
                                    break L9;
                                  } else {
                                    if (null != ((Class) (var18[0])).getClassLoader()) {
                                      break L9;
                                    } else {
                                      throw new SecurityException();
                                    }
                                  }
                                }
                                var8.field_g = ((Class) (var18[0])).getDeclaredField((String) (var18[1]));
                                break L7;
                              } else {
                                if (var2_int != 18) {
                                  if (-20 != (var2_int ^ -1)) {
                                    if (!this.field_e) {
                                      throw fe.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    } else {
                                      if (-4 == (var2_int ^ -1)) {
                                        if ((lk.a(0) ^ -1L) > (field_a ^ -1L)) {
                                          throw new IOException();
                                        } else {
                                          var17 = (255 & var8.field_b >> -449713480) + "." + (255 & var8.field_b >> -431375760) + "." + (var8.field_b >> -1471754776 & 255) + "." + (255 & var8.field_b);
                                          var8.field_g = java.net.InetAddress.getByName(var17).getHostName();
                                          break L7;
                                        }
                                      } else {
                                        if (21 == var2_int) {
                                          if ((lk.a(0) ^ -1L) > (field_a ^ -1L)) {
                                            throw new IOException();
                                          } else {
                                            var8.field_g = java.net.InetAddress.getByName((String) (var8.field_f)).getAddress();
                                            break L7;
                                          }
                                        } else {
                                          if (-6 == (var2_int ^ -1)) {
                                            if (this.field_i) {
                                              var8.field_g = this.field_q.a((byte) 106);
                                              break L7;
                                            } else {
                                              var8.field_g = Class.forName("cb").getMethod("listmodes", new Class[]{}).invoke(this.field_d, new Object[]{});
                                              break L7;
                                            }
                                          } else {
                                            if ((var2_int ^ -1) != -7) {
                                              if ((var2_int ^ -1) != -8) {
                                                if ((var2_int ^ -1) != -13) {
                                                  if (-14 == (var2_int ^ -1)) {
                                                    var3_ref2 = fe.a("", (String) (var8.field_f), field_g, -7);
                                                    var8.field_g = var3_ref2;
                                                    break L7;
                                                  } else {
                                                    L10: {
                                                      if (!this.field_e) {
                                                        break L10;
                                                      } else {
                                                        if ((var2_int ^ -1) == -15) {
                                                          var3_int = var8.field_b;
                                                          var4 = var8.field_e;
                                                          if (!this.field_i) {
                                                            Class.forName("na").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_t, new Object[]{new Integer(var3_int), new Integer(var4)});
                                                            break L7;
                                                          } else {
                                                            this.field_o.a(var3_int, 101024, var4);
                                                            break L7;
                                                          }
                                                        } else {
                                                          break L10;
                                                        }
                                                      }
                                                    }
                                                    L11: {
                                                      if (!this.field_e) {
                                                        break L11;
                                                      } else {
                                                        if (15 != var2_int) {
                                                          break L11;
                                                        } else {
                                                          L12: {
                                                            if (-1 == (var8.field_b ^ -1)) {
                                                              stackIn_58_0 = 0;
                                                              break L12;
                                                            } else {
                                                              stackIn_58_0 = 1;
                                                              break L12;
                                                            }
                                                          }
                                                          var3_int = stackIn_58_0;
                                                          var14 = (java.awt.Component) (var8.field_f);
                                                          if (!this.field_i) {
                                                            Class.forName("na").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_t, new Object[]{var14, new Boolean(var3_int != 0)});
                                                            break L7;
                                                          } else {
                                                            this.field_o.a(var3_int != 0, 0, var14);
                                                            break L7;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L13: {
                                                      if (this.field_i) {
                                                        break L13;
                                                      } else {
                                                        if (-18 == (var2_int ^ -1)) {
                                                          var16 = (Object[]) (var8.field_f);
                                                          Class.forName("na").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_t, new Object[]{var16[0], var16[1], new Integer(var8.field_b), new Integer(var8.field_e), var16[2]});
                                                          break L7;
                                                        } else {
                                                          break L13;
                                                        }
                                                      }
                                                    }
                                                    if (-17 != (var2_int ^ -1)) {
                                                      throw fe.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    } else {
                                                      try {
                                                        L14: {
                                                          if (field_k.startsWith("win")) {
                                                            L15: {
                                                              var15 = (String) (var8.field_f);
                                                              if (var15.startsWith("http://")) {
                                                                break L15;
                                                              } else {
                                                                if (!var15.startsWith("https://")) {
                                                                  throw fe.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  break L15;
                                                                }
                                                              }
                                                            }
                                                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L16: while (true) {
                                                              if (var5 >= var15.length()) {
                                                                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var15 + "\"");
                                                                var8.field_g = null;
                                                                break L14;
                                                              } else {
                                                                if (0 == (var4_ref_String.indexOf((int) var15.charAt(var5)) ^ -1)) {
                                                                  throw fe.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  var5++;
                                                                  continue L16;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            throw fe.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                                                        decompiledCaughtException = decompiledCaughtParameter2;
                                                        var3_ref3 = (Exception) (Object) decompiledCaughtException;
                                                        var8.field_g = var3_ref3;
                                                        throw fe.<RuntimeException>$cfr$sneakyThrow(var3_ref3);
                                                      }
                                                      break L7;
                                                    }
                                                  }
                                                } else {
                                                  var3_ref2 = fe.a(field_u, (String) (var8.field_f), field_g, -7);
                                                  var8.field_g = var3_ref2;
                                                  break L7;
                                                }
                                              } else {
                                                if (this.field_i) {
                                                  this.field_q.a(-16986, (java.awt.Frame) (var8.field_f));
                                                  break L7;
                                                } else {
                                                  Class.forName("cb").getMethod("exit", new Class[]{}).invoke(this.field_d, new Object[]{});
                                                  break L7;
                                                }
                                              }
                                            } else {
                                              var13 = new java.awt.Frame("Jagex Full Screen");
                                              var8.field_g = var13;
                                              var13.setResizable(false);
                                              if (this.field_i) {
                                                this.field_q.a(70, var8.field_e >> 536852240, var8.field_e & 65535, var13, 65535 & var8.field_b, var8.field_b >>> 773056912);
                                                break L7;
                                              } else {
                                                Class.forName("cb").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_d, new Object[]{var13, new Integer(var8.field_b >>> -23457552), new Integer(var8.field_b & 65535), new Integer(var8.field_e >> 1626380496), new Integer(65535 & var8.field_e)});
                                                break L7;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    var7 = (java.awt.datatransfer.Transferable) (var8.field_f);
                                    var12 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var12.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L7;
                                  }
                                } else {
                                  var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8.field_g = var11.getContents((Object) null);
                                  break L7;
                                }
                              }
                            } else {
                              L17: {
                                var10 = (Object[]) (var8.field_f);
                                if (this.field_e) {
                                  if (null == ((Class) (var10[0])).getClassLoader()) {
                                    throw new SecurityException();
                                  } else {
                                    break L17;
                                  }
                                } else {
                                  break L17;
                                }
                              }
                              var8.field_g = ((Class) (var10[0])).getDeclaredMethod((String) (var10[1]), (Class[]) (var10[2]));
                              break L7;
                            }
                          }
                        } else {
                          var9 = new Thread((Runnable) (var8.field_f));
                          var9.setDaemon(true);
                          var9.start();
                          var9.setPriority(var8.field_b);
                          var8.field_g = var9;
                          break L7;
                        }
                      }
                    } else {
                      if ((lk.a(0) ^ -1L) <= (field_a ^ -1L)) {
                        var8.field_g = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.field_f)), var8.field_b);
                        break L7;
                      } else {
                        throw new IOException();
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

    final ib a(java.awt.Frame param0, int param1) {
        if (param1 < 44) {
            Class var4 = (Class) null;
            this.a(57, (String) null, (Class) null);
        }
        return this.a(7, 0, (byte) -92, 0, param0);
    }

    final ib a(int param0, java.net.URL param1) {
        if (param0 != -21377) {
            field_a = 73L;
        }
        return this.a(4, 0, (byte) -110, 0, param1);
    }

    final ib a(int param0, int param1, int param2, int param3, int param4) {
        if (param2 != -7573) {
            this.a(127);
        }
        return this.a(6, param4 + (param1 << -1747912016), (byte) -65, (param3 << -1359998640) + param0, (Object) null);
    }

    final ib a(Runnable param0, int param1, int param2) {
        if (param2 != 65535) {
            return (ib) null;
        }
        return this.a(2, 0, (byte) -72, param1, param0);
    }

    final ib a(int param0) {
        ib discarded$0 = null;
        if (param0 != -1) {
            String var3 = (String) null;
            discarded$0 = this.a(115, true, 98, (String) null);
        }
        return this.a(5, 0, (byte) -79, 0, (Object) null);
    }

    private final static di a(String param0, String param1, int param2, int param3) {
        try {
            di stackIn_15_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            String var7 = null;
            di var8 = null;
            Exception var8_ref = null;
            L0: {
              if (-34 == (param2 ^ -1)) {
                var4 = "jagex_" + param0 + "_preferences" + param1 + "_rc.dat";
                break L0;
              } else {
                if ((param2 ^ -1) == -35) {
                  var4 = "jagex_" + param0 + "_preferences" + param1 + "_wip.dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param0 + "_preferences" + param1 + ".dat";
                  break L0;
                }
              }
            }
            if (param3 == -7) {
              var5 = new String[]{"c:/rscache/", "/rscache/", field_n, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
              var6 = 0;
              L1: while (true) {
                if (var5.length > var6) {
                  L2: {
                    var7 = var5[var6];
                    if ((var7.length() ^ -1) >= -1) {
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
                      var8 = new di(new File(var7, var4), "rw", 10000L);
                      stackIn_15_0 = (di) (var8);
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
                    return stackIn_15_0;
                  } else {
                    continue L1;
                  }
                } else {
                  return null;
                }
              }
            } else {
              return (di) null;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final ib a(int param0, String param1, Class param2) {
        if (param0 >= -107) {
            return (ib) null;
        }
        return this.a(9, 0, (byte) -62, 0, new Object[]{param2, param1});
    }

    private final ib a(int param0, int param1, byte param2, int param3, Object param4) {
        ib var6 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        L0: {
          if (param2 <= -48) {
            break L0;
          } else {
            this.a(-23);
            break L0;
          }
        }
        var6 = new ib();
        var6.field_f = param4;
        var6.field_e = param1;
        var6.field_d = param0;
        var6.field_b = param3;
        var7 = this;
        synchronized (var7) {
          L1: {
            L2: {
              if (null == this.field_j) {
                this.field_p = var6;
                this.field_j = var6;
                break L2;
              } else {
                this.field_j.field_a = var6;
                this.field_j = var6;
                break L2;
              }
            }
            this.notify();
            break L1;
          }
        }
        return var6;
    }

    private final ib a(int param0, boolean param1, int param2, String param3) {
        if (param2 != 18832) {
            field_f = (String) null;
        }
        return this.a(param1 ? 22 : 1, 0, (byte) -118, param0, param3);
    }

    final ib a(int param0, String param1, int param2) {
        if (param0 < 9) {
            Class var5 = (Class) null;
            this.a(-86, (String) null, (Class) null);
        }
        return this.a(param2, false, 18832, param1);
    }

    fe(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception exception = null;
        Throwable throwable = null;
        int var5_int = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Throwable decompiledCaughtException = null;
        ke var7 = null;
        L0: {
          this.field_r = false;
          this.field_p = null;
          this.field_e = false;
          this.field_v = null;
          this.field_j = null;
          this.field_h = null;
          this.field_i = false;
          this.field_b = null;
          field_g = param0;
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
        ((fe) (this)).field_e = stackIn_3_1 != 0;
        field_c = "1.1";
        field_w = "Unknown";
        field_u = param1;
        try {
          L1: {
            field_w = System.getProperty("java.vendor");
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
          if (-1 == field_w.toLowerCase().indexOf("microsoft")) {
            break L3;
          } else {
            this.field_i = true;
            break L3;
          }
        }
        try {
          L4: {
            field_f = System.getProperty("os.name");
            break L4;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            exception = (Exception) (Object) decompiledCaughtException;
            field_f = "Unknown";
            break L5;
          }
        }
        field_k = field_f.toLowerCase();
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
              field_n = System.getProperty("user.home");
              if (field_n == null) {
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
            this.field_m = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
                field_x = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
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
          ed.a((byte) -4, field_u, field_g);
          if (!this.field_e) {
            break L21;
          } else {
            this.field_v = new di(ed.a(83, field_g, "random.dat", (String) null), "rw", 25L);
            this.field_b = new di(ed.a("main_file_cache.dat2", 32718), "rw", 314572800L);
            this.field_h = new di(ed.a("main_file_cache.idx255", 32718), "rw", 1048576L);
            this.field_s = new di[param2];
            var5_int = 0;
            L22: while (true) {
              if (var5_int >= param2) {
                L23: {
                  if (this.field_i) {
                    try {
                      L24: {
                        Class.forName("pk").newInstance();
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
                      if (this.field_i) {
                        var7 = new ke();
                        this.field_q = var7;
                        break L27;
                      } else {
                        this.field_d = Class.forName("cb").newInstance();
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
                        this.field_o = new t();
                        break L30;
                      } else {
                        this.field_t = Class.forName("na").newInstance();
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
                this.field_s[var5_int] = new di(ed.a("main_file_cache.idx" + var5_int, 32718), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        this.field_r = false;
        this.field_l = new Thread((Runnable) (this));
        this.field_l.setPriority(10);
        this.field_l.setDaemon(true);
        this.field_l.start();
    }

    static {
        field_a = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
