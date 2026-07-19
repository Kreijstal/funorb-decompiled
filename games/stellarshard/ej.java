/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ej implements Runnable {
    kb field_e;
    kb field_f;
    private Thread field_n;
    private boolean field_t;
    private me field_h;
    boolean field_p;
    private re field_q;
    private static volatile long field_o;
    private re field_v;
    private Object field_c;
    private static String field_x;
    kb field_d;
    private jl field_j;
    kb[] field_l;
    private static String field_i;
    private Object field_a;
    private static int field_b;
    private boolean field_m;
    static java.lang.reflect.Method field_w;
    private static String field_u;
    static String field_r;
    static String field_g;
    static String field_k;
    java.awt.EventQueue field_s;

    final re b(int param0) {
        if (param0 < 66) {
            field_k = (String) null;
        }
        return this.a(5, 0, 1, 0, (Object) null);
    }

    private final static kb a(int param0, int param1, String param2, String param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            kb var8_ref = null;
            kb stackIn_14_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            kb stackOut_13_0 = null;
            L0: {
              if (param1 == 33) {
                var4 = "jagex_" + param2 + "_preferences" + param3 + "_rc.dat";
                break L0;
              } else {
                if (-35 != (param1 ^ -1)) {
                  var4 = "jagex_" + param2 + "_preferences" + param3 + ".dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param2 + "_preferences" + param3 + "_wip.dat";
                  break L0;
                }
              }
            }
            L1: {
              var5_array = new String[]{"c:/rscache/", "/rscache/", field_u, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
              if (param0 < -48) {
                break L1;
              } else {
                field_w = (java.lang.reflect.Method) null;
                break L1;
              }
            }
            var6 = 0;
            L2: while (true) {
              if (var6 < var5_array.length) {
                L3: {
                  var7 = var5_array[var6];
                  if (-1 <= (var7.length() ^ -1)) {
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
                    var8_ref = new kb(new File(var7, var4), "rw", 10000L);
                    stackOut_13_0 = (kb) (var8_ref);
                    stackIn_14_0 = stackOut_13_0;
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

    final re a(int param0, int param1, int param2, int param3, int param4) {
        if (param0 != 2019341456) {
            field_o = 51L;
        }
        return this.a(6, (param4 << 1676019184) + param1, param0 ^ 2019341457, (param3 << 2019341456) - -param2, (Object) null);
    }

    final re a(java.awt.Frame param0, byte param1) {
        if (param1 != -107) {
            this.field_p = true;
        }
        return this.a(7, 0, param1 ^ -108, 0, param0);
    }

    final re a(int param0, java.net.URL param1) {
        if (param0 != 5284) {
            return (re) null;
        }
        return this.a(4, 0, 1, 0, param1);
    }

    private final re a(int param0, int param1, boolean param2, String param3) {
        if (param0 != -19897) {
            this.field_a = (Object) null;
        }
        return this.a(!param2 ? 1 : 22, 0, 1, param1, param3);
    }

    final re a(Runnable param0, int param1, int param2) {
        re discarded$0 = null;
        if (param2 != 0) {
            discarded$0 = this.b(27);
        }
        return this.a(2, 0, 1, param1, param0);
    }

    final re a(String param0, Class[] param1, int param2, Class param3) {
        if (param2 < 107) {
            return (re) null;
        }
        return this.a(8, 0, 1, 0, new Object[]{param3, param0, param1});
    }

    final void c(int param0) {
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
                if (param0 == 0) {
                  this.field_m = true;
                  this.notifyAll();
                  break L0;
                } else {
                  return;
                }
              }
            }
            try {
              L1: {
                this.field_n.join();
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
              if (this.field_f != null) {
                try {
                  L4: {
                    this.field_f.a(105);
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
              } else {
                break L3;
              }
            }
            L6: {
              if (null != this.field_d) {
                try {
                  L7: {
                    this.field_d.a(param0 ^ -30);
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
              } else {
                break L6;
              }
            }
            L9: {
              if (this.field_l != null) {
                var2_int = 0;
                L10: while (true) {
                  if (this.field_l.length <= var2_int) {
                    break L9;
                  } else {
                    if (null != this.field_l[var2_int]) {
                      try {
                        L11: {
                          this.field_l[var2_int].a(-101);
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
              if (this.field_e == null) {
                break L13;
              } else {
                try {
                  L14: {
                    this.field_e.a(-62);
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
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final re a(String param0, byte param1, int param2) {
        if (param1 != 34) {
            field_k = (String) null;
        }
        return this.a(-19897, param2, false, param0);
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
            tl var3_ref = null;
            Exception var3_ref2 = null;
            kb var3_ref3 = null;
            int var3_int = 0;
            Throwable var4_ref_Throwable = null;
            int var4 = 0;
            String var4_ref_String = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            Object var8 = null;
            re var8_ref = null;
            Object[] var9 = null;
            java.awt.datatransfer.Clipboard var10 = null;
            java.awt.Frame var11 = null;
            java.awt.Component var12 = null;
            String var13 = null;
            Object[] var14 = null;
            String var15 = null;
            java.awt.datatransfer.Clipboard var16 = null;
            Object[] var17 = null;
            Thread var18 = null;
            int stackIn_66_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_65_0 = 0;
            int stackOut_64_0 = 0;
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
                    if (this.field_m) {
                      return;
                    } else {
                      if (null != this.field_v) {
                        L4: {
                          var8_ref = this.field_v;
                          this.field_v = this.field_v.field_e;
                          if (null == this.field_v) {
                            this.field_q = null;
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
                    var2_int = var8_ref.field_d;
                    if (var2_int == 1) {
                      if ((field_o ^ -1L) < (ih.a((byte) -98) ^ -1L)) {
                        throw new IOException();
                      } else {
                        var8_ref.field_b = new java.net.Socket(java.net.InetAddress.getByName((String) (var8_ref.field_a)), var8_ref.field_g);
                        break L8;
                      }
                    } else {
                      if (var2_int != 22) {
                        if (-3 == (var2_int ^ -1)) {
                          var18 = new Thread((Runnable) (var8_ref.field_a));
                          var18.setDaemon(true);
                          var18.start();
                          var18.setPriority(var8_ref.field_g);
                          var8_ref.field_b = var18;
                          break L8;
                        } else {
                          if (var2_int == 4) {
                            if ((ih.a((byte) -98) ^ -1L) <= (field_o ^ -1L)) {
                              var8_ref.field_b = new DataInputStream(((java.net.URL) (var8_ref.field_a)).openStream());
                              break L8;
                            } else {
                              throw new IOException();
                            }
                          } else {
                            if (8 != var2_int) {
                              if ((var2_int ^ -1) == -10) {
                                L9: {
                                  var17 = (Object[]) (var8_ref.field_a);
                                  if (!this.field_p) {
                                    break L9;
                                  } else {
                                    if (null != ((Class) (var17[0])).getClassLoader()) {
                                      break L9;
                                    } else {
                                      throw new SecurityException();
                                    }
                                  }
                                }
                                var8_ref.field_b = ((Class) (var17[0])).getDeclaredField((String) (var17[1]));
                                break L8;
                              } else {
                                if (18 == var2_int) {
                                  var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8_ref.field_b = var16.getContents((Object) null);
                                  break L8;
                                } else {
                                  if (19 != var2_int) {
                                    if (this.field_p) {
                                      if (-4 == (var2_int ^ -1)) {
                                        if (ih.a((byte) -98) >= field_o) {
                                          var15 = (var8_ref.field_g >> -1586218504 & 255) + "." + ((16759916 & var8_ref.field_g) >> -1321324240) + "." + ((var8_ref.field_g & 65314) >> 1087273864) + "." + (var8_ref.field_g & 255);
                                          var8_ref.field_b = java.net.InetAddress.getByName(var15).getHostName();
                                          break L8;
                                        } else {
                                          throw new IOException();
                                        }
                                      } else {
                                        if (-22 != (var2_int ^ -1)) {
                                          if ((var2_int ^ -1) != -6) {
                                            if (var2_int != 6) {
                                              if (-8 == (var2_int ^ -1)) {
                                                if (!this.field_t) {
                                                  discarded$6 = Class.forName("hg").getMethod("exit", new Class[]{}).invoke(this.field_c, new Object[]{});
                                                  break L8;
                                                } else {
                                                  this.field_j.a((java.awt.Frame) (var8_ref.field_a), (byte) -86);
                                                  break L8;
                                                }
                                              } else {
                                                if (12 == var2_int) {
                                                  var3_ref3 = ej.a(-100, field_b, field_x, (String) (var8_ref.field_a));
                                                  var8_ref.field_b = var3_ref3;
                                                  break L8;
                                                } else {
                                                  if (var2_int != 13) {
                                                    L10: {
                                                      if (!this.field_p) {
                                                        break L10;
                                                      } else {
                                                        if (14 == var2_int) {
                                                          var3_int = var8_ref.field_g;
                                                          var4 = var8_ref.field_c;
                                                          if (this.field_t) {
                                                            this.field_h.a(var4, var3_int, (byte) -25);
                                                            break L8;
                                                          } else {
                                                            discarded$7 = Class.forName("ne").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_a, new Object[]{new Integer(var3_int), new Integer(var4)});
                                                            break L8;
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
                                                            if (var8_ref.field_g == 0) {
                                                              stackOut_65_0 = 0;
                                                              stackIn_66_0 = stackOut_65_0;
                                                              break L12;
                                                            } else {
                                                              stackOut_64_0 = 1;
                                                              stackIn_66_0 = stackOut_64_0;
                                                              break L12;
                                                            }
                                                          }
                                                          var3_int = stackIn_66_0;
                                                          var12 = (java.awt.Component) (var8_ref.field_a);
                                                          if (this.field_t) {
                                                            this.field_h.a(var3_int != 0, var12, (byte) -66);
                                                            break L8;
                                                          } else {
                                                            discarded$8 = Class.forName("ne").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_a, new Object[]{var12, new Boolean(var3_int != 0)});
                                                            break L8;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L13: {
                                                      if (this.field_t) {
                                                        break L13;
                                                      } else {
                                                        if ((var2_int ^ -1) == -18) {
                                                          var14 = (Object[]) (var8_ref.field_a);
                                                          discarded$9 = Class.forName("ne").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_a, new Object[]{var14[0], var14[1], new Integer(var8_ref.field_g), new Integer(var8_ref.field_c), var14[2]});
                                                          break L8;
                                                        } else {
                                                          break L13;
                                                        }
                                                      }
                                                    }
                                                    if (-17 != (var2_int ^ -1)) {
                                                      throw ej.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    } else {
                                                      try {
                                                        L14: {
                                                          if (field_k.startsWith("win")) {
                                                            L15: {
                                                              var13 = (String) (var8_ref.field_a);
                                                              if (var13.startsWith("http://")) {
                                                                break L15;
                                                              } else {
                                                                if (var13.startsWith("https://")) {
                                                                  break L15;
                                                                } else {
                                                                  throw ej.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L16: while (true) {
                                                              if (var13.length() <= var5) {
                                                                discarded$10 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var13 + "\"");
                                                                var8_ref.field_b = null;
                                                                break L14;
                                                              } else {
                                                                if (-1 == var4_ref_String.indexOf((int) var13.charAt(var5))) {
                                                                  throw ej.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  var5++;
                                                                  continue L16;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            throw ej.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter1) {
                                                        decompiledCaughtException = decompiledCaughtParameter1;
                                                        var3_ref2 = (Exception) (Object) decompiledCaughtException;
                                                        var8_ref.field_b = var3_ref2;
                                                        throw ej.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                                                      }
                                                      break L8;
                                                    }
                                                  } else {
                                                    var3_ref3 = ej.a(-122, field_b, "", (String) (var8_ref.field_a));
                                                    var8_ref.field_b = var3_ref3;
                                                    break L8;
                                                  }
                                                }
                                              }
                                            } else {
                                              var11 = new java.awt.Frame("Jagex Full Screen");
                                              var8_ref.field_b = var11;
                                              var11.setResizable(false);
                                              if (!this.field_t) {
                                                discarded$11 = Class.forName("hg").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_c, new Object[]{var11, new Integer(var8_ref.field_g >>> 871393104), new Integer(65535 & var8_ref.field_g), new Integer(var8_ref.field_c >> -1708731184), new Integer(var8_ref.field_c & 65535)});
                                                break L8;
                                              } else {
                                                this.field_j.a((byte) 85, var8_ref.field_g >>> 769608592, var8_ref.field_c & 65535, var11, var8_ref.field_c >> 235490096, 65535 & var8_ref.field_g);
                                                break L8;
                                              }
                                            }
                                          } else {
                                            if (!this.field_t) {
                                              var8_ref.field_b = Class.forName("hg").getMethod("listmodes", new Class[]{}).invoke(this.field_c, new Object[]{});
                                              break L8;
                                            } else {
                                              var8_ref.field_b = this.field_j.a(0);
                                              break L8;
                                            }
                                          }
                                        } else {
                                          if (field_o > ih.a((byte) -98)) {
                                            throw new IOException();
                                          } else {
                                            var8_ref.field_b = java.net.InetAddress.getByName((String) (var8_ref.field_a)).getAddress();
                                            break L8;
                                          }
                                        }
                                      }
                                    } else {
                                      throw ej.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    }
                                  } else {
                                    var7 = (java.awt.datatransfer.Transferable) (var8_ref.field_a);
                                    var10 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var10.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L8;
                                  }
                                }
                              }
                            } else {
                              L17: {
                                var9 = (Object[]) (var8_ref.field_a);
                                if (this.field_p) {
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
                          }
                        }
                      } else {
                        if (field_o > ih.a((byte) -98)) {
                          throw new IOException();
                        } else {
                          try {
                              if (false) throw (tl) null;
                            L18: {
                              var8_ref.field_b = og.a((byte) -122, (String) (var8_ref.field_a), var8_ref.field_g).b(-128);
                              break L18;
                            }
                          } catch (tl decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref = (tl) (Object) decompiledCaughtException;
                            var8_ref.field_b = var3_ref.getMessage();
                            throw var3_ref;
                          }
                          break L8;
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

    final re a(Class param0, int param1, String param2) {
        if (param1 != 0) {
            this.field_h = (me) null;
        }
        return this.a(9, 0, 1, 0, new Object[]{param0, param2});
    }

    private final re a(int param0, int param1, int param2, int param3, Object param4) {
        re var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        var6 = new re();
        var6.field_c = param1;
        var6.field_d = param0;
        var6.field_g = param3;
        var6.field_a = param4;
        var7 = this;
        synchronized (var7) {
          L0: {
            L1: {
              if (this.field_q != null) {
                this.field_q.field_e = var6;
                this.field_q = var6;
                break L1;
              } else {
                this.field_v = var6;
                this.field_q = var6;
                break L1;
              }
            }
            this.notify();
            break L0;
          }
        }
        L2: {
          if (param2 == 1) {
            break L2;
          } else {
            this.field_a = (Object) null;
            break L2;
          }
        }
        return var6;
    }

    final boolean a(int param0) {
        int var2 = 89 / ((param0 - 61) / 57);
        if (!this.field_p) {
            return false;
        }
        if (!this.field_t) {
            return null != this.field_c ? true : false;
        }
        return null != this.field_j ? true : false;
    }

    ej(int param0, String param1, int param2, boolean param3) throws Exception {
        String discarded$8 = null;
        String discarded$9 = null;
        java.lang.reflect.Method discarded$10 = null;
        Object discarded$11 = null;
        Exception exception = null;
        Throwable throwable = null;
        int var5_int = 0;
        jl var7 = null;
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
          this.field_f = null;
          this.field_t = false;
          this.field_v = null;
          this.field_q = null;
          this.field_d = null;
          this.field_m = false;
          this.field_p = false;
          this.field_e = null;
          field_x = param1;
          field_g = "Unknown";
          field_b = param0;
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
        ((ej) (this)).field_p = stackIn_3_1 != 0;
        field_r = "1.1";
        try {
          L1: {
            field_g = System.getProperty("java.vendor");
            field_r = System.getProperty("java.version");
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
          if ((field_g.toLowerCase().indexOf("microsoft") ^ -1) == 0) {
            break L3;
          } else {
            this.field_t = true;
            break L3;
          }
        }
        try {
          L4: {
            field_i = System.getProperty("os.name");
            break L4;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            exception = (Exception) (Object) decompiledCaughtException;
            field_i = "Unknown";
            break L5;
          }
        }
        field_k = field_i.toLowerCase();
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
              field_u = System.getProperty("user.home");
              if (field_u == null) {
                break L11;
              } else {
                field_u = field_u + "/";
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
          if (null != field_u) {
            break L13;
          } else {
            field_u = "~/";
            break L13;
          }
        }
        try {
          L14: {
            this.field_s = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
          if (this.field_t) {
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
                field_w = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
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
          c.a(field_b, 93, field_x);
          if (!this.field_p) {
            break L21;
          } else {
            this.field_e = new kb(c.a("random.dat", field_b, (String) null, (byte) -6), "rw", 25L);
            this.field_f = new kb(c.a("main_file_cache.dat2", 0), "rw", 314572800L);
            this.field_d = new kb(c.a("main_file_cache.idx255", 0), "rw", 1048576L);
            this.field_l = new kb[param2];
            var5_int = 0;
            L22: while (true) {
              if (param2 <= var5_int) {
                L23: {
                  if (!this.field_t) {
                    break L23;
                  } else {
                    try {
                      L24: {
                        discarded$11 = Class.forName("cb").newInstance();
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
                      if (this.field_t) {
                        var7 = new jl();
                        this.field_j = var7;
                        break L27;
                      } else {
                        this.field_c = Class.forName("hg").newInstance();
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
                      if (!this.field_t) {
                        this.field_a = Class.forName("ne").newInstance();
                        break L30;
                      } else {
                        this.field_h = new me();
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
                this.field_l[var5_int] = new kb(c.a("main_file_cache.idx" + var5_int, 0), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        this.field_m = false;
        this.field_n = new Thread((Runnable) (this));
        this.field_n.setPriority(10);
        this.field_n.setDaemon(true);
        this.field_n.start();
    }

    static {
        field_o = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
