/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class uj implements Runnable {
    private Thread field_t;
    private Object field_v;
    static java.lang.reflect.Method field_o;
    private sb field_l;
    private ld field_b;
    private static String field_s;
    nd[] field_r;
    nd field_i;
    private boolean field_w;
    private static String field_c;
    private static String field_e;
    private static volatile long field_f;
    nd field_x;
    static String field_a;
    private mi field_m;
    java.awt.EventQueue field_p;
    static String field_n;
    static String field_j;
    private Object field_u;
    nd field_d;
    private boolean field_q;
    private mi field_k;
    private static int field_h;
    boolean field_g;

    private final mi a(int param0, int param1, int param2, Object param3, int param4) {
        mi var6 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        var6 = new mi();
        var6.field_a = param2;
        var6.field_c = param3;
        var6.field_f = param0;
        var6.field_b = param1;
        var7 = this;
        synchronized (var7) {
          L0: {
            L1: {
              if (null != this.field_k) {
                this.field_k.field_e = var6;
                this.field_k = var6;
                break L1;
              } else {
                this.field_m = var6;
                this.field_k = var6;
                break L1;
              }
            }
            this.notify();
            break L0;
          }
        }
        L2: {
          if (param4 == -27024) {
            break L2;
          } else {
            field_n = (String) null;
            break L2;
          }
        }
        return var6;
    }

    private final mi a(int param0, byte param1, String param2, boolean param3) {
        int var5 = -33 % ((param1 - -33) / 34);
        return this.a(param3 ? 22 : 1, 0, param0, param2, -27024);
    }

    final mi a(byte param0, String param1, Class param2) {
        if (param0 >= -121) {
            return (mi) null;
        }
        return this.a(9, 0, 0, new Object[]{param2, param1}, -27024);
    }

    final boolean a(byte param0) {
        if (param0 > -25) {
            this.field_b = (ld) null;
        }
        if (!(this.field_g)) {
            return false;
        }
        if (this.field_q) {
            return this.field_l != null ? true : false;
        }
        return this.field_v != null ? true : false;
    }

    final mi a(int param0, java.awt.Frame param1) {
        if (param0 != -3816) {
            java.net.URL var4 = (java.net.URL) null;
            this.a((java.net.URL) null, 122);
        }
        return this.a(7, 0, 0, param1, -27024);
    }

    final mi a(java.net.URL param0, int param1) {
        if (param1 > -122) {
            field_f = 125L;
        }
        return this.a(4, 0, 0, param0, -27024);
    }

    final mi a(Runnable param0, boolean param1, int param2) {
        if (!param1) {
            this.field_k = (mi) null;
        }
        return this.a(2, 0, param2, param0, -27024);
    }

    public final void run() {
        try {
            int stackIn_68_0 = 0;
            Throwable decompiledCaughtException = null;
            Object var2 = null;
            int var2_int = 0;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            InterruptedException var3 = null;
            nd var3_ref = null;
            int var3_int = 0;
            Exception var3_ref2 = null;
            bj var3_ref3 = null;
            int var4 = 0;
            String var4_ref_String = null;
            int var5 = 0;
            java.awt.datatransfer.Transferable var7 = null;
            mi var8 = null;
            String var9 = null;
            java.awt.Component var10 = null;
            String var11 = null;
            Object[] var12 = null;
            java.awt.Frame var13 = null;
            java.awt.datatransfer.Clipboard var14 = null;
            java.awt.datatransfer.Clipboard var15 = null;
            Object[] var16 = null;
            Object[] var17 = null;
            Thread var18 = null;
            L0: while (true) {
              var2 = this;
              synchronized (var2) {
                L1: {
                  L2: while (true) {
                    if (this.field_w) {
                      return;
                    } else {
                      if (null != this.field_m) {
                        L3: {
                          var8 = this.field_m;
                          this.field_m = this.field_m.field_e;
                          if (this.field_m != null) {
                            break L3;
                          } else {
                            this.field_k = null;
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
                    if (-2 != (var2_int ^ -1)) {
                      if ((var2_int ^ -1) != -23) {
                        if (2 == var2_int) {
                          var18 = new Thread((Runnable) (var8.field_c));
                          var18.setDaemon(true);
                          var18.start();
                          var18.setPriority(var8.field_a);
                          var8.field_g = var18;
                          break L7;
                        } else {
                          if ((var2_int ^ -1) != -5) {
                            if (8 == var2_int) {
                              L8: {
                                var17 = (Object[]) (var8.field_c);
                                if (!this.field_g) {
                                  break L8;
                                } else {
                                  if (null == ((Class) (var17[0])).getClassLoader()) {
                                    throw new SecurityException();
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              var8.field_g = ((Class) (var17[0])).getDeclaredMethod((String) (var17[1]), (Class[]) (var17[2]));
                              break L7;
                            } else {
                              if ((var2_int ^ -1) == -10) {
                                L9: {
                                  var16 = (Object[]) (var8.field_c);
                                  if (!this.field_g) {
                                    break L9;
                                  } else {
                                    if (null != ((Class) (var16[0])).getClassLoader()) {
                                      break L9;
                                    } else {
                                      throw new SecurityException();
                                    }
                                  }
                                }
                                var8.field_g = ((Class) (var16[0])).getDeclaredField((String) (var16[1]));
                                break L7;
                              } else {
                                if (var2_int == 18) {
                                  var15 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8.field_g = var15.getContents((Object) null);
                                  break L7;
                                } else {
                                  if ((var2_int ^ -1) == -20) {
                                    var7 = (java.awt.datatransfer.Transferable) (var8.field_c);
                                    var14 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var14.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L7;
                                  } else {
                                    if (this.field_g) {
                                      if (-4 != (var2_int ^ -1)) {
                                        if (-22 != (var2_int ^ -1)) {
                                          if (var2_int != 5) {
                                            if ((var2_int ^ -1) == -7) {
                                              var13 = new java.awt.Frame("Jagex Full Screen");
                                              var8.field_g = var13;
                                              var13.setResizable(false);
                                              if (this.field_q) {
                                                this.field_l.a(65535 & var8.field_b, var8.field_b >> -475514640, -16, var8.field_a >>> -1807175856, 65535 & var8.field_a, var13);
                                                break L7;
                                              } else {
                                                Class.forName("hg").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_v, new Object[]{var13, new Integer(var8.field_a >>> -957414096), new Integer(65535 & var8.field_a), new Integer(var8.field_b >> 1537859952), new Integer(var8.field_b & 65535)});
                                                break L7;
                                              }
                                            } else {
                                              if (var2_int != 7) {
                                                if (-13 == (var2_int ^ -1)) {
                                                  var3_ref = uj.a((String) (var8.field_c), field_c, field_h, (byte) 106);
                                                  var8.field_g = var3_ref;
                                                  break L7;
                                                } else {
                                                  if ((var2_int ^ -1) != -14) {
                                                    L10: {
                                                      if (!this.field_g) {
                                                        break L10;
                                                      } else {
                                                        if ((var2_int ^ -1) == -15) {
                                                          var3_int = var8.field_a;
                                                          var4 = var8.field_b;
                                                          if (this.field_q) {
                                                            this.field_b.a(var3_int, -86, var4);
                                                            break L7;
                                                          } else {
                                                            Class.forName("jg").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_u, new Object[]{new Integer(var3_int), new Integer(var4)});
                                                            break L7;
                                                          }
                                                        } else {
                                                          break L10;
                                                        }
                                                      }
                                                    }
                                                    L11: {
                                                      if (!this.field_g) {
                                                        break L11;
                                                      } else {
                                                        if (-16 != (var2_int ^ -1)) {
                                                          break L11;
                                                        } else {
                                                          L12: {
                                                            if (var8.field_a == 0) {
                                                              stackIn_68_0 = 0;
                                                              break L12;
                                                            } else {
                                                              stackIn_68_0 = 1;
                                                              break L12;
                                                            }
                                                          }
                                                          var3_int = stackIn_68_0;
                                                          var10 = (java.awt.Component) (var8.field_c);
                                                          if (!this.field_q) {
                                                            Class.forName("jg").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_u, new Object[]{var10, new Boolean(var3_int != 0)});
                                                            break L7;
                                                          } else {
                                                            this.field_b.a(var10, var3_int != 0, 0);
                                                            break L7;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L13: {
                                                      if (this.field_q) {
                                                        break L13;
                                                      } else {
                                                        if ((var2_int ^ -1) == -18) {
                                                          var12 = (Object[]) (var8.field_c);
                                                          Class.forName("jg").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_u, new Object[]{var12[0], var12[1], new Integer(var8.field_a), new Integer(var8.field_b), var12[2]});
                                                          break L7;
                                                        } else {
                                                          break L13;
                                                        }
                                                      }
                                                    }
                                                    if (-17 == (var2_int ^ -1)) {
                                                      try {
                                                        L14: {
                                                          if (field_a.startsWith("win")) {
                                                            L15: {
                                                              var11 = (String) (var8.field_c);
                                                              if (var11.startsWith("http://")) {
                                                                break L15;
                                                              } else {
                                                                if (!var11.startsWith("https://")) {
                                                                  throw uj.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  break L15;
                                                                }
                                                              }
                                                            }
                                                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L16: while (true) {
                                                              if (var5 >= var11.length()) {
                                                                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var11 + "\"");
                                                                var8.field_g = null;
                                                                break L14;
                                                              } else {
                                                                if (var4_ref_String.indexOf((int) var11.charAt(var5)) == -1) {
                                                                  throw uj.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  var5++;
                                                                  continue L16;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            throw uj.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter1) {
                                                        decompiledCaughtException = decompiledCaughtParameter1;
                                                        var3_ref2 = (Exception) (Object) decompiledCaughtException;
                                                        var8.field_g = var3_ref2;
                                                        throw uj.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                                                      }
                                                      break L7;
                                                    } else {
                                                      throw uj.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    }
                                                  } else {
                                                    var3_ref = uj.a((String) (var8.field_c), "", field_h, (byte) -97);
                                                    var8.field_g = var3_ref;
                                                    break L7;
                                                  }
                                                }
                                              } else {
                                                if (this.field_q) {
                                                  this.field_l.a(false, (java.awt.Frame) (var8.field_c));
                                                  break L7;
                                                } else {
                                                  Class.forName("hg").getMethod("exit", new Class[]{}).invoke(this.field_v, new Object[]{});
                                                  break L7;
                                                }
                                              }
                                            }
                                          } else {
                                            if (this.field_q) {
                                              var8.field_g = this.field_l.a(-27469);
                                              break L7;
                                            } else {
                                              var8.field_g = Class.forName("hg").getMethod("listmodes", new Class[]{}).invoke(this.field_v, new Object[]{});
                                              break L7;
                                            }
                                          }
                                        } else {
                                          if (field_f <= ol.a(256)) {
                                            var8.field_g = java.net.InetAddress.getByName((String) (var8.field_c)).getAddress();
                                            break L7;
                                          } else {
                                            throw new IOException();
                                          }
                                        }
                                      } else {
                                        if ((field_f ^ -1L) < (ol.a(256) ^ -1L)) {
                                          throw new IOException();
                                        } else {
                                          var9 = (255 & var8.field_a >> 431890200) + "." + ((var8.field_a & 16725364) >> 1474081264) + "." + ((var8.field_a & 65373) >> 2144337160) + "." + (var8.field_a & 255);
                                          var8.field_g = java.net.InetAddress.getByName(var9).getHostName();
                                          break L7;
                                        }
                                      }
                                    } else {
                                      throw uj.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            if (ol.a(256) < field_f) {
                              throw new IOException();
                            } else {
                              var8.field_g = new DataInputStream(((java.net.URL) (var8.field_c)).openStream());
                              break L7;
                            }
                          }
                        }
                      } else {
                        if (field_f > ol.a(256)) {
                          throw new IOException();
                        } else {
                          try {
                              if (false) throw (bj) null;
                            L17: {
                              var8.field_g = pg.a(var8.field_a, (String) (var8.field_c), -111).a((byte) 112);
                              break L17;
                            }
                          } catch (bj decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref3 = (bj) (Object) decompiledCaughtException;
                            var8.field_g = var3_ref3.getMessage();
                            throw var3_ref3;
                          }
                          break L7;
                        }
                      }
                    } else {
                      if (field_f <= ol.a(256)) {
                        var8.field_g = new java.net.Socket(java.net.InetAddress.getByName((String) (var8.field_c)), var8.field_a);
                        break L7;
                      } else {
                        throw new IOException();
                      }
                    }
                  }
                  var8.field_d = 1;
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
                  var8.field_d = 2;
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

    final mi a(String param0, byte param1, Class[] param2, Class param3) {
        if (param1 <= 40) {
            return (mi) null;
        }
        return this.a(8, 0, 0, new Object[]{param3, param0, param2}, -27024);
    }

    final mi a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 != -2) {
            field_h = 19;
        }
        return this.a(6, param3 + (param2 << -1654067120), (param0 << -1503788464) - -param1, (Object) null, -27024);
    }

    private final static nd a(String param0, String param1, int param2, byte param3) {
        try {
            nd stackIn_12_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            String var4 = null;
            int var5 = 0;
            String[] var6 = null;
            int var7 = 0;
            String var8 = null;
            nd var9 = null;
            Exception var9_ref = null;
            L0: {
              var5 = -67 / ((param3 - -38) / 58);
              if (param2 == 33) {
                var4 = "jagex_" + param1 + "_preferences" + param0 + "_rc.dat";
                break L0;
              } else {
                if ((param2 ^ -1) != -35) {
                  var4 = "jagex_" + param1 + "_preferences" + param0 + ".dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param1 + "_preferences" + param0 + "_wip.dat";
                  break L0;
                }
              }
            }
            var6 = new String[]{"c:/rscache/", "/rscache/", field_s, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            var7 = 0;
            L1: while (true) {
              if (var7 < var6.length) {
                L2: {
                  var8 = var6[var7];
                  if ((var8.length() ^ -1) >= -1) {
                    break L2;
                  } else {
                    if (new File(var8).exists()) {
                      break L2;
                    } else {
                      var7++;
                      continue L1;
                    }
                  }
                }
                try {
                  L3: {
                    var9 = new nd(new File(var8, var4), "rw", 10000L);
                    stackIn_12_0 = (nd) (var9);
                    decompiledRegionSelector0 = 0;
                    break L3;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var9_ref = (Exception) (Object) decompiledCaughtException;
                    var7++;
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

    final void a(boolean param0) {
        try {
            Object stackIn_3_0 = null;
            Object stackIn_4_0 = null;
            int stackIn_4_1 = 0;
            Throwable decompiledCaughtException = null;
            Object var2 = null;
            InterruptedException var2_ref = null;
            IOException var2_ref2 = null;
            int var2_int = 0;
            IOException var3 = null;
            var2 = this;
            synchronized (var2) {
              L0: {
                L1: {
                  stackIn_3_0 = this;

                  if (!param0) {
                    stackIn_4_0 = this;
                    stackIn_4_1 = 0;
                    break L1;
                  } else {
                    stackIn_4_0 = this;
                    stackIn_4_1 = 1;
                    break L1;
                  }
                }
                ((uj) (this)).field_w = stackIn_4_1 != 0;
                this.notifyAll();
                break L0;
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
                var2_ref = (InterruptedException) (Object) decompiledCaughtException;
                break L3;
              }
            }
            L4: {
              if (null != this.field_x) {
                try {
                  L5: {
                    this.field_x.a((byte) 47);
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
              if (null == this.field_i) {
                break L7;
              } else {
                try {
                  L8: {
                    this.field_i.a((byte) 47);
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
              if (this.field_r == null) {
                break L10;
              } else {
                var2_int = 0;
                L11: while (true) {
                  if (var2_int >= this.field_r.length) {
                    break L10;
                  } else {
                    if (this.field_r[var2_int] != null) {
                      try {
                        L12: {
                          this.field_r[var2_int].a((byte) 47);
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
              if (null != this.field_d) {
                try {
                  L15: {
                    this.field_d.a((byte) 47);
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

    final mi a(int param0, String param1, int param2) {
        if (param2 != 431890200) {
            return (mi) null;
        }
        return this.a(param0, (byte) 118, param1, false);
    }

    final mi a(int param0) {
        if (param0 != 5) {
            this.field_q = true;
        }
        return this.a(5, 0, 0, (Object) null, -27024);
    }

    uj(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception exception = null;
        Throwable throwable = null;
        int var5_int = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Throwable decompiledCaughtException = null;
        sb var6 = null;
        L0: {
          this.field_x = null;
          this.field_i = null;
          this.field_d = null;
          this.field_w = false;
          this.field_q = false;
          this.field_k = null;
          this.field_m = null;
          this.field_g = false;
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
        ((uj) (this)).field_g = stackIn_3_1 != 0;
        field_j = "Unknown";
        field_c = param1;
        field_n = "1.1";
        field_h = param0;
        try {
          L1: {
            field_j = System.getProperty("java.vendor");
            field_n = System.getProperty("java.version");
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
          if (field_j.toLowerCase().indexOf("microsoft") == -1) {
            break L3;
          } else {
            this.field_q = true;
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
        field_a = field_e.toLowerCase();
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
          if (field_s == null) {
            field_s = "~/";
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
          if (this.field_q) {
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
                field_o = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
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
          va.a((byte) -117, field_h, field_c);
          if (!this.field_g) {
            break L21;
          } else {
            this.field_d = new nd(va.a(field_h, -29755, (String) null, "random.dat"), "rw", 25L);
            this.field_x = new nd(va.a("main_file_cache.dat2", (byte) 40), "rw", 314572800L);
            this.field_i = new nd(va.a("main_file_cache.idx255", (byte) 40), "rw", 1048576L);
            this.field_r = new nd[param2];
            var5_int = 0;
            L22: while (true) {
              if (param2 <= var5_int) {
                L23: {
                  if (!this.field_q) {
                    break L23;
                  } else {
                    try {
                      L24: {
                        Class.forName("pj").newInstance();
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
                      if (this.field_q) {
                        var6 = new sb();
                        this.field_l = var6;
                        break L27;
                      } else {
                        this.field_v = Class.forName("hg").newInstance();
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
                      if (!this.field_q) {
                        this.field_u = Class.forName("jg").newInstance();
                        break L30;
                      } else {
                        this.field_b = new ld();
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
                this.field_r[var5_int] = new nd(va.a("main_file_cache.idx" + var5_int, (byte) 40), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        this.field_w = false;
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
