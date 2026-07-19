/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bl implements Runnable {
    private boolean field_s;
    private static String field_a;
    private mb field_v;
    private static String field_p;
    static String field_r;
    private static int field_l;
    java.awt.EventQueue field_x;
    pf field_b;
    private w field_k;
    private boolean field_i;
    boolean field_o;
    private static volatile long field_w;
    static String field_t;
    static String field_n;
    pf[] field_c;
    private Thread field_h;
    private static String field_f;
    pf field_d;
    private il field_q;
    private Object field_u;
    pf field_m;
    private il field_j;
    private Object field_e;
    static java.lang.reflect.Method field_g;

    final il a(int param0, java.net.URL param1) {
        if (param0 <= 96) {
            return (il) null;
        }
        return this.a(0, 4, param1, 0, 0);
    }

    final il a(String param0, int param1, int param2) {
        int var4 = -60 / ((param2 - -13) / 39);
        return this.a(param0, -122, param1, false);
    }

    final boolean a(int param0) {
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        if (!this.field_o) {
          return false;
        } else {
          if (param0 == -20) {
            if (!this.field_s) {
              L0: {
                if (this.field_e == null) {
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  stackOut_11_0 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  break L0;
                }
              }
              return stackIn_13_0 != 0;
            } else {
              L1: {
                if (null == this.field_v) {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  break L1;
                } else {
                  stackOut_7_0 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  break L1;
                }
              }
              return stackIn_9_0 != 0;
            }
          } else {
            return false;
          }
        }
    }

    final il a(Runnable param0, int param1, byte param2) {
        int var4 = 67 % ((param2 - -62) / 51);
        return this.a(0, 2, param0, param1, 0);
    }

    final il a(byte param0) {
        if (param0 > -77) {
            this.field_u = (Object) null;
        }
        return this.a(0, 5, (Object) null, 0, 0);
    }

    final void b(byte param0) {
        try {
            il discarded$1 = null;
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
                  this.field_i = true;
                  if (param0 > 50) {
                    break L1;
                  } else {
                    discarded$1 = this.a((byte) 40);
                    break L1;
                  }
                }
                this.notifyAll();
                break L0;
              }
            }
            try {
              L2: {
                this.field_h.join();
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
              if (null == this.field_d) {
                break L4;
              } else {
                try {
                  L5: {
                    this.field_d.c(127);
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
              if (null == this.field_b) {
                break L7;
              } else {
                try {
                  L8: {
                    this.field_b.c(-59);
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
              if (this.field_c == null) {
                break L10;
              } else {
                var2_int = 0;
                L11: while (true) {
                  if (this.field_c.length <= var2_int) {
                    break L10;
                  } else {
                    if (null != this.field_c[var2_int]) {
                      try {
                        L12: {
                          this.field_c[var2_int].c(108);
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
              if (null != this.field_m) {
                try {
                  L15: {
                    this.field_m.c(119);
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

    final il a(Class param0, String param1, byte param2) {
        il discarded$0 = null;
        if (param2 != 14) {
            String var5 = (String) null;
            discarded$0 = this.a((String) null, 80, -32, false);
        }
        return this.a(0, 9, new Object[]{param0, param1}, 0, 0);
    }

    final il a(java.awt.Frame param0, byte param1) {
        int var3 = -63 % ((-42 - param1) / 41);
        return this.a(0, 7, param0, 0, 0);
    }

    private final static pf a(String param0, byte param1, String param2, int param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            Object var7 = null;
            Exception var8 = null;
            pf var8_ref = null;
            pf stackIn_15_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            pf stackOut_14_0 = null;
            String var7_ref = null;
            L0: {
              if (33 == param3) {
                var4 = "jagex_" + param0 + "_preferences" + param2 + "_rc.dat";
                break L0;
              } else {
                if (-35 == (param3 ^ -1)) {
                  var4 = "jagex_" + param0 + "_preferences" + param2 + "_wip.dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param0 + "_preferences" + param2 + ".dat";
                  break L0;
                }
              }
            }
            if (param1 == -77) {
              var5_array = new String[]{"c:/rscache/", "/rscache/", field_f, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
              var6 = 0;
              L1: while (true) {
                if (var5_array.length > var6) {
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
                      var8_ref = new pf(new File(var7_ref, var4), "rw", 10000L);
                      stackOut_14_0 = (pf) (var8_ref);
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
              return (pf) null;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final il a(int param0, int param1, int param2, int param3, int param4) {
        if (param3 != 0) {
            this.field_j = (il) null;
        }
        return this.a(param2 + (param4 << -246695856), 6, (Object) null, (param0 << 1597502544) - -param1, 0);
    }

    final il a(String param0, Class param1, Class[] param2, byte param3) {
        if (param3 != -39) {
            field_w = 95L;
        }
        return this.a(0, 8, new Object[]{param1, param0, param2}, 0, 0);
    }

    private final il a(String param0, int param1, int param2, boolean param3) {
        if (param1 >= -120) {
            field_n = (String) null;
        }
        return this.a(0, !param3 ? 1 : 22, param0, param2, 0);
    }

    private final il a(int param0, int param1, Object param2, int param3, int param4) {
        il var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        if (param4 == 0) {
          var6 = new il();
          var6.field_e = param1;
          var6.field_d = param2;
          var6.field_a = param3;
          var6.field_f = param0;
          var7 = this;
          synchronized (var7) {
            L0: {
              L1: {
                if (null != this.field_j) {
                  this.field_j.field_c = var6;
                  this.field_j = var6;
                  break L1;
                } else {
                  this.field_q = var6;
                  this.field_j = var6;
                  break L1;
                }
              }
              this.notify();
              break L0;
            }
          }
          return var6;
        } else {
          return (il) null;
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
            qk var3_ref = null;
            Exception var3_ref2 = null;
            pf var3_ref3 = null;
            int var3_int = 0;
            Throwable var4 = null;
            int var4_int = 0;
            String var4_ref = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            Object var8 = null;
            il var8_ref = null;
            Object[] var9 = null;
            Object[] var10 = null;
            java.awt.datatransfer.Clipboard var11 = null;
            java.awt.Frame var12 = null;
            java.awt.Component var13 = null;
            String var14 = null;
            Object[] var15 = null;
            String var16 = null;
            java.awt.datatransfer.Clipboard var17 = null;
            Thread var18 = null;
            int stackIn_80_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_79_0 = 0;
            int stackOut_78_0 = 0;
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
                    if (!this.field_i) {
                      if (null != this.field_q) {
                        L4: {
                          var8_ref = this.field_q;
                          this.field_q = this.field_q.field_c;
                          if (null == this.field_q) {
                            this.field_j = null;
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
                    var2_int = var8_ref.field_e;
                    if (-2 != (var2_int ^ -1)) {
                      if (var2_int != 22) {
                        if (var2_int == 2) {
                          var18 = new Thread((Runnable) (var8_ref.field_d));
                          var18.setDaemon(true);
                          var18.start();
                          var18.setPriority(var8_ref.field_a);
                          var8_ref.field_g = var18;
                          break L8;
                        } else {
                          if (4 != var2_int) {
                            if (8 != var2_int) {
                              if (var2_int != 9) {
                                if (-19 == (var2_int ^ -1)) {
                                  var17 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8_ref.field_g = var17.getContents((Object) null);
                                  break L8;
                                } else {
                                  if ((var2_int ^ -1) != -20) {
                                    if (!this.field_o) {
                                      throw bl.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    } else {
                                      if (var2_int == 3) {
                                        if (la.a(false) >= field_w) {
                                          var16 = (255 & var8_ref.field_a >> 1374883384) + "." + (255 & var8_ref.field_a >> -1415344816) + "." + ((var8_ref.field_a & 65384) >> 919597160) + "." + (var8_ref.field_a & 255);
                                          var8_ref.field_g = java.net.InetAddress.getByName(var16).getHostName();
                                          break L8;
                                        } else {
                                          throw new IOException();
                                        }
                                      } else {
                                        if (var2_int != 21) {
                                          if ((var2_int ^ -1) != -6) {
                                            if (-7 != (var2_int ^ -1)) {
                                              if (var2_int != 7) {
                                                if ((var2_int ^ -1) != -13) {
                                                  if (13 != var2_int) {
                                                    L9: {
                                                      if (!this.field_o) {
                                                        break L9;
                                                      } else {
                                                        if (var2_int != 14) {
                                                          break L9;
                                                        } else {
                                                          var3_int = var8_ref.field_a;
                                                          var4_int = var8_ref.field_f;
                                                          if (this.field_s) {
                                                            this.field_k.a(var3_int, 1, var4_int);
                                                            break L8;
                                                          } else {
                                                            discarded$6 = Class.forName("tj").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_u, new Object[]{new Integer(var3_int), new Integer(var4_int)});
                                                            break L8;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L10: {
                                                      if (!this.field_o) {
                                                        break L10;
                                                      } else {
                                                        if (15 != var2_int) {
                                                          break L10;
                                                        } else {
                                                          L11: {
                                                            if (var8_ref.field_a == 0) {
                                                              stackOut_79_0 = 0;
                                                              stackIn_80_0 = stackOut_79_0;
                                                              break L11;
                                                            } else {
                                                              stackOut_78_0 = 1;
                                                              stackIn_80_0 = stackOut_78_0;
                                                              break L11;
                                                            }
                                                          }
                                                          var3_int = stackIn_80_0;
                                                          var13 = (java.awt.Component) (var8_ref.field_d);
                                                          if (!this.field_s) {
                                                            discarded$7 = Class.forName("tj").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_u, new Object[]{var13, new Boolean(var3_int != 0)});
                                                            break L8;
                                                          } else {
                                                            this.field_k.a((byte) -126, var13, var3_int != 0);
                                                            break L8;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L12: {
                                                      if (this.field_s) {
                                                        break L12;
                                                      } else {
                                                        if (-18 == (var2_int ^ -1)) {
                                                          var15 = (Object[]) (var8_ref.field_d);
                                                          discarded$8 = Class.forName("tj").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_u, new Object[]{var15[0], var15[1], new Integer(var8_ref.field_a), new Integer(var8_ref.field_f), var15[2]});
                                                          break L8;
                                                        } else {
                                                          break L12;
                                                        }
                                                      }
                                                    }
                                                    if (16 == var2_int) {
                                                      try {
                                                        L13: {
                                                          if (field_r.startsWith("win")) {
                                                            L14: {
                                                              var14 = (String) (var8_ref.field_d);
                                                              if (var14.startsWith("http://")) {
                                                                break L14;
                                                              } else {
                                                                if (var14.startsWith("https://")) {
                                                                  break L14;
                                                                } else {
                                                                  throw bl.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                            var4_ref = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L15: while (true) {
                                                              if (var14.length() <= var5) {
                                                                discarded$9 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var14 + "\"");
                                                                var8_ref.field_g = null;
                                                                break L13;
                                                              } else {
                                                                if ((var4_ref.indexOf((int) var14.charAt(var5)) ^ -1) != 0) {
                                                                  var5++;
                                                                  continue L15;
                                                                } else {
                                                                  throw bl.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            throw bl.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter1) {
                                                        decompiledCaughtException = decompiledCaughtParameter1;
                                                        var3_ref2 = (Exception) (Object) decompiledCaughtException;
                                                        var8_ref.field_g = var3_ref2;
                                                        throw bl.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                                                      }
                                                      break L8;
                                                    } else {
                                                      throw bl.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    }
                                                  } else {
                                                    var3_ref3 = bl.a("", (byte) -77, (String) (var8_ref.field_d), field_l);
                                                    var8_ref.field_g = var3_ref3;
                                                    break L8;
                                                  }
                                                } else {
                                                  var3_ref3 = bl.a(field_p, (byte) -77, (String) (var8_ref.field_d), field_l);
                                                  var8_ref.field_g = var3_ref3;
                                                  break L8;
                                                }
                                              } else {
                                                if (!this.field_s) {
                                                  discarded$10 = Class.forName("ve").getMethod("exit", new Class[]{}).invoke(this.field_e, new Object[]{});
                                                  break L8;
                                                } else {
                                                  this.field_v.a(7537, (java.awt.Frame) (var8_ref.field_d));
                                                  break L8;
                                                }
                                              }
                                            } else {
                                              var12 = new java.awt.Frame("Jagex Full Screen");
                                              var8_ref.field_g = var12;
                                              var12.setResizable(false);
                                              if (this.field_s) {
                                                this.field_v.a(65535 & var8_ref.field_f, var8_ref.field_a >>> -147600336, var8_ref.field_f >> 438819344, -16, 65535 & var8_ref.field_a, var12);
                                                break L8;
                                              } else {
                                                discarded$11 = Class.forName("ve").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_e, new Object[]{var12, new Integer(var8_ref.field_a >>> 29782608), new Integer(var8_ref.field_a & 65535), new Integer(var8_ref.field_f >> -1717490960), new Integer(65535 & var8_ref.field_f)});
                                                break L8;
                                              }
                                            }
                                          } else {
                                            if (this.field_s) {
                                              var8_ref.field_g = this.field_v.a(0);
                                              break L8;
                                            } else {
                                              var8_ref.field_g = Class.forName("ve").getMethod("listmodes", new Class[]{}).invoke(this.field_e, new Object[]{});
                                              break L8;
                                            }
                                          }
                                        } else {
                                          if (field_w <= la.a(false)) {
                                            var8_ref.field_g = java.net.InetAddress.getByName((String) (var8_ref.field_d)).getAddress();
                                            break L8;
                                          } else {
                                            throw new IOException();
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    var7 = (java.awt.datatransfer.Transferable) (var8_ref.field_d);
                                    var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var11.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L8;
                                  }
                                }
                              } else {
                                L16: {
                                  var10 = (Object[]) (var8_ref.field_d);
                                  if (this.field_o) {
                                    if (null != ((Class) (var10[0])).getClassLoader()) {
                                      break L16;
                                    } else {
                                      throw new SecurityException();
                                    }
                                  } else {
                                    break L16;
                                  }
                                }
                                var8_ref.field_g = ((Class) (var10[0])).getDeclaredField((String) (var10[1]));
                                break L8;
                              }
                            } else {
                              L17: {
                                var9 = (Object[]) (var8_ref.field_d);
                                if (this.field_o) {
                                  if (((Class) (var9[0])).getClassLoader() == null) {
                                    throw new SecurityException();
                                  } else {
                                    break L17;
                                  }
                                } else {
                                  break L17;
                                }
                              }
                              var8_ref.field_g = ((Class) (var9[0])).getDeclaredMethod((String) (var9[1]), (Class[]) (var9[2]));
                              break L8;
                            }
                          } else {
                            if (field_w <= la.a(false)) {
                              var8_ref.field_g = new DataInputStream(((java.net.URL) (var8_ref.field_d)).openStream());
                              break L8;
                            } else {
                              throw new IOException();
                            }
                          }
                        }
                      } else {
                        if ((la.a(false) ^ -1L) > (field_w ^ -1L)) {
                          throw new IOException();
                        } else {
                          try {
                              if (false) throw (qk) null;
                            L18: {
                              var8_ref.field_g = el.a((String) (var8_ref.field_d), var8_ref.field_a, (byte) 58).a(true);
                              break L18;
                            }
                          } catch (qk decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref = (qk) (Object) decompiledCaughtException;
                            var8_ref.field_g = var3_ref.getMessage();
                            throw var3_ref;
                          }
                          break L8;
                        }
                      }
                    } else {
                      if ((field_w ^ -1L) >= (la.a(false) ^ -1L)) {
                        var8_ref.field_g = new java.net.Socket(java.net.InetAddress.getByName((String) (var8_ref.field_d)), var8_ref.field_a);
                        break L8;
                      } else {
                        throw new IOException();
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

    bl(int param0, String param1, int param2, boolean param3) throws Exception {
        String discarded$7 = null;
        String discarded$8 = null;
        java.lang.reflect.Method discarded$9 = null;
        Object discarded$10 = null;
        Exception exception = null;
        Throwable throwable = null;
        int var5_int = 0;
        mb var6 = null;
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
          this.field_s = false;
          this.field_o = false;
          this.field_b = null;
          this.field_i = false;
          this.field_d = null;
          this.field_m = null;
          this.field_q = null;
          this.field_j = null;
          field_t = "1.1";
          field_n = "Unknown";
          field_p = param1;
          field_l = param0;
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
        ((bl) (this)).field_o = stackIn_3_1 != 0;
        try {
          L1: {
            field_n = System.getProperty("java.vendor");
            field_t = System.getProperty("java.version");
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
          if ((field_n.toLowerCase().indexOf("microsoft") ^ -1) == 0) {
            break L3;
          } else {
            this.field_s = true;
            break L3;
          }
        }
        try {
          L4: {
            field_a = System.getProperty("os.name");
            break L4;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            exception = (Exception) (Object) decompiledCaughtException;
            field_a = "Unknown";
            break L5;
          }
        }
        field_r = field_a.toLowerCase();
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
              field_f = System.getProperty("user.home");
              if (null == field_f) {
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
          if (null == field_f) {
            field_f = "~/";
            break L13;
          } else {
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
          if (this.field_s) {
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
                field_g = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
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
          vf.a(true, field_p, field_l);
          if (!this.field_o) {
            break L21;
          } else {
            this.field_m = new pf(vf.a(field_l, 1387, (String) null, "random.dat"), "rw", 25L);
            this.field_d = new pf(vf.a(0, "main_file_cache.dat2"), "rw", 314572800L);
            this.field_b = new pf(vf.a(0, "main_file_cache.idx255"), "rw", 1048576L);
            this.field_c = new pf[param2];
            var5_int = 0;
            L22: while (true) {
              if (param2 <= var5_int) {
                L23: {
                  if (this.field_s) {
                    try {
                      L24: {
                        discarded$10 = Class.forName("ef").newInstance();
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
                      if (this.field_s) {
                        var6 = new mb();
                        this.field_v = var6;
                        break L27;
                      } else {
                        this.field_e = Class.forName("ve").newInstance();
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
                      if (this.field_s) {
                        this.field_k = new w();
                        break L30;
                      } else {
                        this.field_u = Class.forName("tj").newInstance();
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
                this.field_c[var5_int] = new pf(vf.a(0, "main_file_cache.idx" + var5_int), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        this.field_i = false;
        this.field_h = new Thread((Runnable) (this));
        this.field_h.setPriority(10);
        this.field_h.setDaemon(true);
        this.field_h.start();
    }

    static {
        field_w = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
