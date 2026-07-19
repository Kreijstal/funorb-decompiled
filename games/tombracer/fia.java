/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fia implements Runnable {
    private Object field_i;
    boolean field_c;
    private static int field_d;
    ml field_x;
    private Thread field_m;
    private static volatile long field_o;
    ml[] field_h;
    private naa field_l;
    private boolean field_f;
    private static String field_s;
    static String field_j;
    private Object field_t;
    ml field_n;
    java.awt.EventQueue field_r;
    private sp field_w;
    private qj field_g;
    static java.lang.reflect.Method field_b;
    private static String field_u;
    ml field_q;
    static String field_v;
    boolean field_p;
    static String field_e;
    private naa field_k;
    private static String field_a;

    final naa a(java.net.URL param0, int param1) {
        if (param1 < 69) {
            return (naa) null;
        }
        return this.a(0, 0, (byte) 104, param0, 4);
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
            Exception var3_ref = null;
            wra var3_ref2 = null;
            ml var3_ref3 = null;
            int var3_int = 0;
            Throwable var4_ref_Throwable = null;
            int var4 = 0;
            String var4_ref_String = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            Object var8 = null;
            naa var8_ref = null;
            Object[] var9 = null;
            java.awt.datatransfer.Clipboard var10 = null;
            String var11 = null;
            java.awt.Frame var12 = null;
            Object[] var13 = null;
            String var14 = null;
            java.awt.Component var15 = null;
            java.awt.datatransfer.Clipboard var16 = null;
            Object[] var17 = null;
            Thread var18 = null;
            int stackIn_84_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_83_0 = 0;
            int stackOut_82_0 = 0;
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
                    if (this.field_f) {
                      return;
                    } else {
                      if (this.field_l != null) {
                        L4: {
                          var8_ref = this.field_l;
                          this.field_l = this.field_l.field_g;
                          if (null == this.field_l) {
                            this.field_k = null;
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
                    }
                  }
                }
              }
              try {
                L7: {
                  L8: {
                    var2_int = var8_ref.field_a;
                    if (-2 == (var2_int ^ -1)) {
                      if (bva.b((byte) -107) < field_o) {
                        throw new IOException();
                      } else {
                        var8_ref.field_f = new java.net.Socket(java.net.InetAddress.getByName((String) (var8_ref.field_c)), var8_ref.field_e);
                        break L8;
                      }
                    } else {
                      if (-23 == (var2_int ^ -1)) {
                        if (field_o <= bva.b((byte) -107)) {
                          try {
                              if (false) throw (wra) null;
                            L9: {
                              var8_ref.field_f = hg.a((String) (var8_ref.field_c), var8_ref.field_e, false).a(25927);
                              break L9;
                            }
                          } catch (wra decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref2 = (wra) (Object) decompiledCaughtException;
                            var8_ref.field_f = var3_ref2.getMessage();
                            throw var3_ref2;
                          }
                          break L8;
                        } else {
                          throw new IOException();
                        }
                      } else {
                        if ((var2_int ^ -1) == -3) {
                          var18 = new Thread((Runnable) (var8_ref.field_c));
                          var18.setDaemon(true);
                          var18.start();
                          var18.setPriority(var8_ref.field_e);
                          var8_ref.field_f = var18;
                          break L8;
                        } else {
                          if (4 != var2_int) {
                            if (8 != var2_int) {
                              if (9 == var2_int) {
                                L10: {
                                  var17 = (Object[]) (var8_ref.field_c);
                                  if (this.field_c) {
                                    if (((Class) (var17[0])).getClassLoader() != null) {
                                      break L10;
                                    } else {
                                      throw new SecurityException();
                                    }
                                  } else {
                                    break L10;
                                  }
                                }
                                var8_ref.field_f = ((Class) (var17[0])).getDeclaredField((String) (var17[1]));
                                break L8;
                              } else {
                                if (-19 != (var2_int ^ -1)) {
                                  if (-20 == (var2_int ^ -1)) {
                                    var7 = (java.awt.datatransfer.Transferable) (var8_ref.field_c);
                                    var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var16.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L8;
                                  } else {
                                    if (!this.field_c) {
                                      throw fia.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    } else {
                                      if (var2_int != 3) {
                                        if ((var2_int ^ -1) != -22) {
                                          if (-6 == (var2_int ^ -1)) {
                                            if (!this.field_p) {
                                              var8_ref.field_f = Class.forName("pj").getMethod("listmodes", new Class[]{}).invoke(this.field_i, new Object[]{});
                                              break L8;
                                            } else {
                                              var8_ref.field_f = this.field_w.a((byte) 52);
                                              break L8;
                                            }
                                          } else {
                                            if (6 != var2_int) {
                                              if (-8 != (var2_int ^ -1)) {
                                                if (var2_int == 12) {
                                                  var3_ref3 = fia.a(-20529, field_d, (String) (var8_ref.field_c), field_u);
                                                  var8_ref.field_f = var3_ref3;
                                                  break L8;
                                                } else {
                                                  if (13 != var2_int) {
                                                    L11: {
                                                      if (!this.field_c) {
                                                        break L11;
                                                      } else {
                                                        if (14 == var2_int) {
                                                          var3_int = var8_ref.field_e;
                                                          var4 = var8_ref.field_d;
                                                          if (this.field_p) {
                                                            this.field_g.a(0, var3_int, var4);
                                                            break L8;
                                                          } else {
                                                            discarded$6 = Class.forName("kfa").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_t, new Object[]{new Integer(var3_int), new Integer(var4)});
                                                            break L8;
                                                          }
                                                        } else {
                                                          break L11;
                                                        }
                                                      }
                                                    }
                                                    L12: {
                                                      if (!this.field_c) {
                                                        break L12;
                                                      } else {
                                                        if (15 == var2_int) {
                                                          L13: {
                                                            if (var8_ref.field_e == 0) {
                                                              stackOut_83_0 = 0;
                                                              stackIn_84_0 = stackOut_83_0;
                                                              break L13;
                                                            } else {
                                                              stackOut_82_0 = 1;
                                                              stackIn_84_0 = stackOut_82_0;
                                                              break L13;
                                                            }
                                                          }
                                                          var3_int = stackIn_84_0;
                                                          var15 = (java.awt.Component) (var8_ref.field_c);
                                                          if (!this.field_p) {
                                                            discarded$7 = Class.forName("kfa").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_t, new Object[]{var15, new Boolean(var3_int != 0)});
                                                            break L8;
                                                          } else {
                                                            this.field_g.a(var3_int != 0, -54, var15);
                                                            break L8;
                                                          }
                                                        } else {
                                                          break L12;
                                                        }
                                                      }
                                                    }
                                                    L14: {
                                                      if (this.field_p) {
                                                        break L14;
                                                      } else {
                                                        if (17 != var2_int) {
                                                          break L14;
                                                        } else {
                                                          var13 = (Object[]) (var8_ref.field_c);
                                                          discarded$8 = Class.forName("kfa").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_t, new Object[]{var13[0], var13[1], new Integer(var8_ref.field_e), new Integer(var8_ref.field_d), var13[2]});
                                                          break L8;
                                                        }
                                                      }
                                                    }
                                                    if (-17 == (var2_int ^ -1)) {
                                                      try {
                                                        L15: {
                                                          if (field_j.startsWith("win")) {
                                                            L16: {
                                                              var14 = (String) (var8_ref.field_c);
                                                              if (var14.startsWith("http://")) {
                                                                break L16;
                                                              } else {
                                                                if (var14.startsWith("https://")) {
                                                                  break L16;
                                                                } else {
                                                                  throw fia.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L17: while (true) {
                                                              if (var5 >= var14.length()) {
                                                                discarded$9 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var14 + "\"");
                                                                var8_ref.field_f = null;
                                                                break L15;
                                                              } else {
                                                                if (0 != (var4_ref_String.indexOf((int) var14.charAt(var5)) ^ -1)) {
                                                                  var5++;
                                                                  continue L17;
                                                                } else {
                                                                  throw fia.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            throw fia.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                                                        decompiledCaughtException = decompiledCaughtParameter2;
                                                        var3_ref = (Exception) (Object) decompiledCaughtException;
                                                        var8_ref.field_f = var3_ref;
                                                        throw fia.<RuntimeException>$cfr$sneakyThrow(var3_ref);
                                                      }
                                                      break L8;
                                                    } else {
                                                      throw fia.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    }
                                                  } else {
                                                    var3_ref3 = fia.a(-20529, field_d, (String) (var8_ref.field_c), "");
                                                    var8_ref.field_f = var3_ref3;
                                                    break L8;
                                                  }
                                                }
                                              } else {
                                                if (!this.field_p) {
                                                  discarded$10 = Class.forName("pj").getMethod("exit", new Class[]{}).invoke(this.field_i, new Object[]{});
                                                  break L8;
                                                } else {
                                                  this.field_w.a((java.awt.Frame) (var8_ref.field_c), (byte) -108);
                                                  break L8;
                                                }
                                              }
                                            } else {
                                              var12 = new java.awt.Frame("Jagex Full Screen");
                                              var8_ref.field_f = var12;
                                              var12.setResizable(false);
                                              if (this.field_p) {
                                                this.field_w.a(var12, var8_ref.field_e >>> 435914000, var8_ref.field_d >> 1199163120, var8_ref.field_d & 65535, var8_ref.field_e & 65535, true);
                                                break L8;
                                              } else {
                                                discarded$11 = Class.forName("pj").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_i, new Object[]{var12, new Integer(var8_ref.field_e >>> -1524913424), new Integer(65535 & var8_ref.field_e), new Integer(var8_ref.field_d >> 1634244688), new Integer(var8_ref.field_d & 65535)});
                                                break L8;
                                              }
                                            }
                                          }
                                        } else {
                                          if ((bva.b((byte) -107) ^ -1L) <= (field_o ^ -1L)) {
                                            var8_ref.field_f = java.net.InetAddress.getByName((String) (var8_ref.field_c)).getAddress();
                                            break L8;
                                          } else {
                                            throw new IOException();
                                          }
                                        }
                                      } else {
                                        if (bva.b((byte) -107) < field_o) {
                                          throw new IOException();
                                        } else {
                                          var11 = (255 & var8_ref.field_e >> 1821467352) + "." + ((16739670 & var8_ref.field_e) >> -1640614736) + "." + (var8_ref.field_e >> 1967332360 & 255) + "." + (255 & var8_ref.field_e);
                                          var8_ref.field_f = java.net.InetAddress.getByName(var11).getHostName();
                                          break L8;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var10 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8_ref.field_f = var10.getContents((Object) null);
                                  break L8;
                                }
                              }
                            } else {
                              L18: {
                                var9 = (Object[]) (var8_ref.field_c);
                                if (this.field_c) {
                                  if (((Class) (var9[0])).getClassLoader() == null) {
                                    throw new SecurityException();
                                  } else {
                                    break L18;
                                  }
                                } else {
                                  break L18;
                                }
                              }
                              var8_ref.field_f = ((Class) (var9[0])).getDeclaredMethod((String) (var9[1]), (Class[]) (var9[2]));
                              break L8;
                            }
                          } else {
                            if (field_o <= bva.b((byte) -107)) {
                              var8_ref.field_f = new DataInputStream(((java.net.URL) (var8_ref.field_c)).openStream());
                              break L8;
                            } else {
                              throw new IOException();
                            }
                          }
                        }
                      }
                    }
                  }
                  var8_ref.field_b = 1;
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
                  var8_ref.field_b = 2;
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

    final naa a(int param0, String param1, int param2) {
        naa discarded$0 = null;
        if (param0 != -24818) {
            java.awt.datatransfer.Transferable var5 = (java.awt.datatransfer.Transferable) null;
            discarded$0 = this.a((byte) 92, (java.awt.datatransfer.Transferable) null);
        }
        return this.a(param0 + 24819, param1, false, param2);
    }

    final naa a(int param0, String param1, Class param2) {
        ml discarded$0 = null;
        if (param0 != 10355) {
            String var5 = (String) null;
            discarded$0 = fia.a(-73, 85, (String) null, (String) null);
        }
        return this.a(0, 0, (byte) 104, new Object[]{param2, param1}, 9);
    }

    private final naa a(int param0, String param1, boolean param2, int param3) {
        ml discarded$0 = null;
        if (param0 != 1) {
            String var6 = (String) null;
            discarded$0 = fia.a(-120, 43, (String) null, (String) null);
        }
        return this.a(param3, 0, (byte) 104, param1, param2 ? 22 : 1);
    }

    final naa a(int param0, Class[] param1, String param2, Class param3) {
        if (param0 != 26868) {
            this.field_i = (Object) null;
        }
        return this.a(0, 0, (byte) 104, new Object[]{param3, param2, param1}, 8);
    }

    final boolean a(byte param0) {
        if (!(this.field_c)) {
            return false;
        }
        if (param0 != 69) {
            this.field_r = (java.awt.EventQueue) null;
        }
        if (this.field_p) {
            return this.field_w != null ? true : false;
        }
        return null != this.field_i ? true : false;
    }

    final void b(byte param0) {
        try {
            naa discarded$1 = null;
            Object var2 = null;
            InterruptedException var2_ref = null;
            IOException var2_ref2 = null;
            int var2_int = 0;
            Throwable var3 = null;
            IOException var3_ref = null;
            java.awt.Frame var4 = null;
            Throwable decompiledCaughtException = null;
            var2 = this;
            synchronized (var2) {
              L0: {
                this.field_f = true;
                this.notifyAll();
                break L0;
              }
            }
            L1: {
              if (param0 == 59) {
                break L1;
              } else {
                var4 = (java.awt.Frame) null;
                discarded$1 = this.a((java.awt.Frame) null, 58);
                break L1;
              }
            }
            try {
              L2: {
                this.field_m.join();
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
              if (null != this.field_n) {
                try {
                  L5: {
                    this.field_n.b((byte) -112);
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
              if (null != this.field_q) {
                try {
                  L8: {
                    this.field_q.b((byte) -77);
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
              if (this.field_h != null) {
                var2_int = 0;
                L11: while (true) {
                  if (var2_int >= this.field_h.length) {
                    break L10;
                  } else {
                    if (null != this.field_h[var2_int]) {
                      try {
                        L12: {
                          this.field_h[var2_int].b((byte) -101);
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
              if (this.field_x != null) {
                try {
                  L15: {
                    this.field_x.b((byte) -101);
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

    private final static ml a(int param0, int param1, String param2, String param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            ml var8_ref = null;
            ml stackIn_15_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            ml stackOut_14_0 = null;
            L0: {
              if (33 != param1) {
                if ((param1 ^ -1) == -35) {
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
            var5_array = new String[]{"c:/rscache/", "/rscache/", field_a, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            if (param0 == -20529) {
              var6 = 0;
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
                      var8_ref = new ml(new File(var7, var4), "rw", 10000L);
                      stackOut_14_0 = (ml) (var8_ref);
                      stackIn_15_0 = stackOut_14_0;
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
                    return stackIn_15_0;
                  } else {
                    continue L1;
                  }
                } else {
                  return null;
                }
              }
            } else {
              return (ml) null;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final naa a(int param0) {
        if (param0 > -87) {
            return (naa) null;
        }
        return this.a(0, 0, (byte) 104, (Object) null, 5);
    }

    final naa a(java.awt.Frame param0, int param1) {
        if (param1 != 18885) {
            return (naa) null;
        }
        return this.a(0, 0, (byte) 104, param0, 7);
    }

    private final naa a(int param0, int param1, byte param2, Object param3, int param4) {
        naa var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        if (param2 == 104) {
          var6 = new naa();
          var6.field_e = param0;
          var6.field_d = param1;
          var6.field_a = param4;
          var6.field_c = param3;
          var7 = this;
          synchronized (var7) {
            L0: {
              L1: {
                if (null != this.field_k) {
                  this.field_k.field_g = var6;
                  this.field_k = var6;
                  break L1;
                } else {
                  this.field_l = var6;
                  this.field_k = var6;
                  break L1;
                }
              }
              this.notify();
              break L0;
            }
          }
          return var6;
        } else {
          return (naa) null;
        }
    }

    final naa a(int param0, int param1, int param2, byte param3, int param4) {
        if (param3 != 66) {
            return (naa) null;
        }
        return this.a(param2 + (param4 << -711272432), param1 + (param0 << -1645972240), (byte) 104, (Object) null, 6);
    }

    final naa a(Runnable param0, int param1, int param2) {
        if (param1 != 425) {
            this.field_h = (ml[]) null;
        }
        return this.a(param2, 0, (byte) 104, param0, 2);
    }

    final boolean a(byte[] param0, File param1, boolean param2) {
        FileOutputStream var4 = null;
        IOException var4_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            var4 = new FileOutputStream(param1);
            var4.write(param0, 0, param0.length);
            if (param2) {
              var4.close();
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (IOException) (Object) decompiledCaughtException;
          throw new RuntimeException();
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    final naa a(byte param0, java.awt.datatransfer.Transferable param1) {
        naa discarded$0 = null;
        if (param0 <= 56) {
            discarded$0 = this.a(96);
        }
        return this.a(0, 0, (byte) 104, param1, 19);
    }

    final naa b(int param0) {
        if (param0 <= 104) {
            return (naa) null;
        }
        return this.a(0, 0, (byte) 104, (Object) null, 18);
    }

    fia(int param0, String param1, int param2, boolean param3) throws Exception {
        String discarded$7 = null;
        String discarded$8 = null;
        java.lang.reflect.Method discarded$9 = null;
        Object discarded$10 = null;
        int discarded$11 = 0;
        Exception exception = null;
        Throwable throwable = null;
        int var5_int = 0;
        ThreadGroup var5 = null;
        ThreadGroup var6 = null;
        Thread[] var7 = null;
        int var8 = 0;
        sp var9 = null;
        ThreadGroup var10 = null;
        ThreadGroup var11 = null;
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
          this.field_c = false;
          this.field_x = null;
          this.field_l = null;
          this.field_n = null;
          this.field_f = false;
          this.field_p = false;
          this.field_k = null;
          this.field_q = null;
          field_d = param0;
          field_u = param1;
          field_e = "Unknown";
          field_v = "1.1";
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
        ((fia) (this)).field_c = stackIn_3_1 != 0;
        try {
          L1: {
            field_e = System.getProperty("java.vendor");
            field_v = System.getProperty("java.version");
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
          if (-1 == field_e.toLowerCase().indexOf("microsoft")) {
            break L3;
          } else {
            this.field_p = true;
            break L3;
          }
        }
        try {
          L4: {
            field_s = System.getProperty("os.name");
            break L4;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            exception = (Exception) (Object) decompiledCaughtException;
            field_s = "Unknown";
            break L5;
          }
        }
        field_j = field_s.toLowerCase();
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
              field_a = System.getProperty("user.home");
              if (field_a == null) {
                break L11;
              } else {
                field_a = field_a + "/";
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
          if (null != field_a) {
            break L13;
          } else {
            field_a = "~/";
            break L13;
          }
        }
        try {
          L14: {
            this.field_r = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
          if (!this.field_p) {
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
                field_b = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
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
          iba.a(field_d, -70, field_u);
          if (!this.field_c) {
            break L21;
          } else {
            this.field_x = new ml(iba.a((String) null, "random.dat", 0, field_d), "rw", 25L);
            this.field_n = new ml(iba.a("main_file_cache.dat2", (byte) -71), "rw", 314572800L);
            this.field_q = new ml(iba.a("main_file_cache.idx255", (byte) -123), "rw", 1048576L);
            this.field_h = new ml[param2];
            var5_int = 0;
            L22: while (true) {
              if (param2 <= var5_int) {
                L23: {
                  if (!this.field_p) {
                    break L23;
                  } else {
                    try {
                      L24: {
                        discarded$10 = Class.forName("nva").newInstance();
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
                      if (!this.field_p) {
                        this.field_i = Class.forName("pj").newInstance();
                        break L27;
                      } else {
                        var9 = new sp();
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
                      if (!this.field_p) {
                        this.field_t = Class.forName("kfa").newInstance();
                        break L30;
                      } else {
                        this.field_g = new qj();
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
                this.field_h[var5_int] = new ml(iba.a("main_file_cache.idx" + var5_int, (byte) -108), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        L32: {
          if (!this.field_c) {
            break L32;
          } else {
            if (this.field_p) {
              break L32;
            } else {
              var10 = Thread.currentThread().getThreadGroup();
              var5 = var10;
              var6 = var10.getParent();
              L33: while (true) {
                if (var6 == null) {
                  var7 = new Thread[1000];
                  discarded$11 = var5.enumerate(var7);
                  var8 = 0;
                  L34: while (true) {
                    if (var7.length <= var8) {
                      break L32;
                    } else {
                      if (null != var7[var8]) {
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
        this.field_f = false;
        this.field_m = new Thread((Runnable) (this));
        this.field_m.setPriority(10);
        this.field_m.setDaemon(true);
        this.field_m.start();
    }

    static {
        field_o = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
