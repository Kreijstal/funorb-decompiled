/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class le implements Runnable {
    private static String field_s;
    private gb field_f;
    wk field_d;
    java.awt.EventQueue field_e;
    private boolean field_q;
    static String field_m;
    private l field_i;
    wk field_t;
    wk field_x;
    static String field_v;
    private Thread field_j;
    static java.lang.reflect.Method field_g;
    private static int field_u;
    boolean field_b;
    wk[] field_o;
    private static String field_r;
    private vi field_c;
    private static String field_a;
    static String field_w;
    private boolean field_n;
    private Object field_l;
    private static volatile long field_k;
    private Object field_h;
    private vi field_p;

    final vi a(java.net.URL param0, boolean param1) {
        if (!param1) {
            ((le) this).field_d = null;
        }
        return this.a(4, 0, 0, 13003, (Object) (Object) param0);
    }

    final boolean b(byte param0) {
        if (!((le) this).field_b) {
            return false;
        }
        if (param0 >= -115) {
            Object var3 = null;
            vi discarded$0 = ((le) this).a((byte) 54, (java.awt.Frame) null);
        }
        if (!((le) this).field_q) {
            return null != ((le) this).field_l ? true : false;
        }
        return null != ((le) this).field_i ? true : false;
    }

    private final static wk a(int param0, int param1, String param2, String param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            wk var8_ref = null;
            wk stackIn_12_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            wk stackOut_11_0 = null;
            L0: {
              if (param1 == 33) {
                var4 = "jagex_" + param3 + "_preferences" + param2 + "_rc.dat";
                break L0;
              } else {
                if (param1 == 34) {
                  var4 = "jagex_" + param3 + "_preferences" + param2 + "_wip.dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param3 + "_preferences" + param2 + ".dat";
                  break L0;
                }
              }
            }
            var5_array = new String[]{"c:/rscache/", "/rscache/", field_s, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            var6 = 0;
            L1: while (true) {
              if (var5_array.length > var6) {
                L2: {
                  var7 = var5_array[var6];
                  if (var7.length() <= 0) {
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
                    var8_ref = new wk(new File(var7, var4), "rw", 10000L);
                    stackOut_11_0 = (wk) var8_ref;
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

    private final vi a(int param0, int param1, int param2, int param3, Object param4) {
        vi var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        var6 = new vi();
        var6.field_c = param0;
        var6.field_g = param4;
        var6.field_d = param2;
        var6.field_b = param1;
        var7 = this;
        synchronized (var7) {
          L0: {
            L1: {
              if (null == ((le) this).field_c) {
                ((le) this).field_p = var6;
                ((le) this).field_c = var6;
                break L1;
              } else {
                ((le) this).field_c.field_f = var6;
                ((le) this).field_c = var6;
                break L1;
              }
            }
            this.notify();
            break L0;
          }
        }
        return var6;
    }

    final vi a(byte param0) {
        if (param0 != 104) {
            return null;
        }
        return this.a(5, 0, 0, 13003, (Object) null);
    }

    final vi a(int param0, int param1, Runnable param2) {
        if (param0 != 0) {
            ((le) this).run();
        }
        return this.a(2, 0, param1, 13003, (Object) (Object) param2);
    }

    final vi a(Class param0, String param1, int param2) {
        if (param2 <= 58) {
            Object var5 = null;
            vi discarded$0 = ((le) this).a((java.net.URL) null, true);
        }
        return this.a(9, 0, 0, 13003, (Object) (Object) new Object[2]);
    }

    final vi a(byte param0, java.awt.Frame param1) {
        if (param0 >= -9) {
            return null;
        }
        return this.a(7, 0, 0, 13003, (Object) (Object) param1);
    }

    final void a(int param0) {
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
                ((le) this).field_n = true;
                this.notifyAll();
                break L0;
              }
            }
            try {
              L1: {
                if (param0 == 0) {
                  ((le) this).field_j.join();
                  break L1;
                } else {
                  return;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var2_ref = (InterruptedException) (Object) decompiledCaughtException;
                break L2;
              }
            }
            L3: {
              if (null != ((le) this).field_t) {
                {
                  L4: {
                    ((le) this).field_t.a((byte) 42);
                    break L4;
                  }
                }
                break L3;
              } else {
                break L3;
              }
            }
            L6: {
              if (((le) this).field_d == null) {
                break L6;
              } else {
                {
                  L7: {
                    ((le) this).field_d.a((byte) 79);
                    break L7;
                  }
                }
                break L6;
              }
            }
            L9: {
              if (null != ((le) this).field_o) {
                var2_int = 0;
                L10: while (true) {
                  if (((le) this).field_o.length <= var2_int) {
                    break L9;
                  } else {
                    if (((le) this).field_o[var2_int] != null) {
                      {
                        L11: {
                          ((le) this).field_o[var2_int].a((byte) 39);
                          var2_int++;
                          break L11;
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
              if (null == ((le) this).field_x) {
                break L13;
              } else {
                {
                  L14: {
                    ((le) this).field_x.a((byte) 14);
                    break L14;
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

    final vi a(byte param0, Class param1, String param2, Class[] param3) {
        if (param0 != 99) {
            ((le) this).field_t = null;
        }
        return this.a(8, 0, 0, 13003, (Object) (Object) new Object[3]);
    }

    final vi a(int param0, int param1, int param2, byte param3, int param4) {
        if (param3 != -30) {
            return null;
        }
        return this.a(6, (param0 << 16) + param2, param1 + (param4 << 16), 13003, (Object) null);
    }

    public final void run() {
        try {
            Object var2 = null;
            Throwable var2_ref = null;
            int var2_int = 0;
            InterruptedException var3_ref_InterruptedException = null;
            vc var3_ref_vc = null;
            Exception var3_ref_Exception = null;
            wk var3_ref_wk = null;
            int var3 = 0;
            Throwable var4_ref_Throwable = null;
            int var4 = 0;
            String var4_ref_String = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            Object var8 = null;
            vi var8_ref = null;
            Thread var9 = null;
            java.awt.datatransfer.Clipboard var10 = null;
            java.awt.datatransfer.Clipboard var11 = null;
            Object[] var12 = null;
            String var13 = null;
            java.awt.Component var14 = null;
            java.awt.Frame var15 = null;
            String var16 = null;
            Object[] var17 = null;
            Object[] var18 = null;
            int stackIn_77_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_76_0 = 0;
            int stackOut_75_0 = 0;
            L0: while (true) {
              synchronized (var2) {
                L1: {
                  ((Object) (Object) var8_ref).notify();
                  var2 = this;
                  break L1;
                }
              }
              synchronized (var2) {
                L2: {
                  L3: while (true) {
                    if (((le) this).field_n) {
                      return;
                    } else {
                      if (null == ((le) this).field_p) {
                        {
                          L4: {
                            this.wait();
                            break L4;
                          }
                        }
                        continue L3;
                      } else {
                        L6: {
                          var8_ref = ((le) this).field_p;
                          ((le) this).field_p = ((le) this).field_p.field_f;
                          if (((le) this).field_p != null) {
                            break L6;
                          } else {
                            ((le) this).field_c = null;
                            break L6;
                          }
                        }
                        break L2;
                      }
                    }
                  }
                }
              }
              try {
                L7: {
                  L8: {
                    var2_int = var8_ref.field_c;
                    if (var2_int == 1) {
                      if (~id.a(22) > ~field_k) {
                        throw new IOException();
                      } else {
                        var8_ref.field_e = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var8_ref.field_g), var8_ref.field_d);
                        break L8;
                      }
                    } else {
                      if (22 != var2_int) {
                        if (var2_int != 2) {
                          if (var2_int == 4) {
                            if (~id.a(58) > ~field_k) {
                              throw new IOException();
                            } else {
                              var8_ref.field_e = (Object) (Object) new DataInputStream(((java.net.URL) var8_ref.field_g).openStream());
                              break L8;
                            }
                          } else {
                            if (var2_int == 8) {
                              L9: {
                                var18 = (Object[]) var8_ref.field_g;
                                if (!((le) this).field_b) {
                                  break L9;
                                } else {
                                  if (null != ((Class) var18[0]).getClassLoader()) {
                                    break L9;
                                  } else {
                                    throw new SecurityException();
                                  }
                                }
                              }
                              var8_ref.field_e = (Object) (Object) ((Class) var18[0]).getDeclaredMethod((String) var18[1], (Class[]) var18[2]);
                              break L8;
                            } else {
                              if (var2_int == 9) {
                                L10: {
                                  var17 = (Object[]) var8_ref.field_g;
                                  if (!((le) this).field_b) {
                                    break L10;
                                  } else {
                                    if (((Class) var17[0]).getClassLoader() == null) {
                                      throw new SecurityException();
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                var8_ref.field_e = (Object) (Object) ((Class) var17[0]).getDeclaredField((String) var17[1]);
                                break L8;
                              } else {
                                if (var2_int != 18) {
                                  if (var2_int != 19) {
                                    if (!((le) this).field_b) {
                                      throw le.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    } else {
                                      if (var2_int == 3) {
                                        if (~id.a(23) > ~field_k) {
                                          throw new IOException();
                                        } else {
                                          var16 = (255 & var8_ref.field_d >> 24) + "." + ((var8_ref.field_d & 16776207) >> 16) + "." + (255 & var8_ref.field_d >> 8) + "." + (255 & var8_ref.field_d);
                                          var8_ref.field_e = (Object) (Object) java.net.InetAddress.getByName(var16).getHostName();
                                          break L8;
                                        }
                                      } else {
                                        if (var2_int != 21) {
                                          if (var2_int == 5) {
                                            if (!((le) this).field_q) {
                                              var8_ref.field_e = Class.forName("ka").getMethod("listmodes", new Class[0]).invoke(((le) this).field_l, new Object[0]);
                                              break L8;
                                            } else {
                                              var8_ref.field_e = (Object) (Object) ((le) this).field_i.a(0);
                                              break L8;
                                            }
                                          } else {
                                            if (var2_int == 6) {
                                              var15 = new java.awt.Frame("Jagex Full Screen");
                                              var8_ref.field_e = (Object) (Object) var15;
                                              var15.setResizable(false);
                                              if (((le) this).field_q) {
                                                ((le) this).field_i.a(119, var8_ref.field_d & 65535, var8_ref.field_d >>> 16, var8_ref.field_b >> 16, 65535 & var8_ref.field_b, var15);
                                                break L8;
                                              } else {
                                                Object discarded$6 = Class.forName("ka").getMethod("enter", new Class[5]).invoke(((le) this).field_l, new Object[5]);
                                                break L8;
                                              }
                                            } else {
                                              if (var2_int != 7) {
                                                if (var2_int != 12) {
                                                  if (var2_int != 13) {
                                                    L11: {
                                                      if (!((le) this).field_b) {
                                                        break L11;
                                                      } else {
                                                        if (14 == var2_int) {
                                                          var3 = var8_ref.field_d;
                                                          var4 = var8_ref.field_b;
                                                          if (!((le) this).field_q) {
                                                            Object discarded$7 = Class.forName("ob").getDeclaredMethod("movemouse", new Class[2]).invoke(((le) this).field_h, new Object[2]);
                                                            break L8;
                                                          } else {
                                                            ((le) this).field_f.a(var3, var4, 32512);
                                                            break L8;
                                                          }
                                                        } else {
                                                          break L11;
                                                        }
                                                      }
                                                    }
                                                    L12: {
                                                      if (!((le) this).field_b) {
                                                        break L12;
                                                      } else {
                                                        if (var2_int == 15) {
                                                          L13: {
                                                            if (var8_ref.field_d == 0) {
                                                              stackOut_76_0 = 0;
                                                              stackIn_77_0 = stackOut_76_0;
                                                              break L13;
                                                            } else {
                                                              stackOut_75_0 = 1;
                                                              stackIn_77_0 = stackOut_75_0;
                                                              break L13;
                                                            }
                                                          }
                                                          var3 = stackIn_77_0;
                                                          var14 = (java.awt.Component) var8_ref.field_g;
                                                          if (((le) this).field_q) {
                                                            ((le) this).field_f.a(var3 != 0, var14, -4);
                                                            break L8;
                                                          } else {
                                                            Object discarded$8 = Class.forName("ob").getDeclaredMethod("showcursor", new Class[2]).invoke(((le) this).field_h, new Object[2]);
                                                            break L8;
                                                          }
                                                        } else {
                                                          break L12;
                                                        }
                                                      }
                                                    }
                                                    L14: {
                                                      if (((le) this).field_q) {
                                                        break L14;
                                                      } else {
                                                        if (var2_int != 17) {
                                                          break L14;
                                                        } else {
                                                          var12 = (Object[]) var8_ref.field_g;
                                                          Object discarded$9 = Class.forName("ob").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((le) this).field_h, new Object[5]);
                                                          break L8;
                                                        }
                                                      }
                                                    }
                                                    if (var2_int != 16) {
                                                      throw le.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    } else {
                                                      try {
                                                        L15: {
                                                          if (!field_m.startsWith("win")) {
                                                            throw le.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          } else {
                                                            L16: {
                                                              var13 = (String) var8_ref.field_g;
                                                              if (var13.startsWith("http://")) {
                                                                break L16;
                                                              } else {
                                                                if (!var13.startsWith("https://")) {
                                                                  throw le.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  break L16;
                                                                }
                                                              }
                                                            }
                                                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L17: while (true) {
                                                              if (var5 >= var13.length()) {
                                                                Process discarded$10 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var13 + "\"");
                                                                var8_ref.field_e = null;
                                                                break L15;
                                                              } else {
                                                                if (-1 != var4_ref_String.indexOf((int) var13.charAt(var5))) {
                                                                  var5++;
                                                                  continue L17;
                                                                } else {
                                                                  throw le.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter1) {
                                                        decompiledCaughtException = decompiledCaughtParameter1;
                                                        var3_ref_Exception = (Exception) (Object) decompiledCaughtException;
                                                        var8_ref.field_e = (Object) (Object) var3_ref_Exception;
                                                        throw le.<RuntimeException>$cfr$sneakyThrow(var3_ref_Exception);
                                                      }
                                                      break L8;
                                                    }
                                                  } else {
                                                    var3_ref_wk = le.a(-120, field_u, (String) var8_ref.field_g, "");
                                                    var8_ref.field_e = (Object) (Object) var3_ref_wk;
                                                    break L8;
                                                  }
                                                } else {
                                                  var3_ref_wk = le.a(-120, field_u, (String) var8_ref.field_g, field_a);
                                                  var8_ref.field_e = (Object) (Object) var3_ref_wk;
                                                  break L8;
                                                }
                                              } else {
                                                if (((le) this).field_q) {
                                                  ((le) this).field_i.a((java.awt.Frame) var8_ref.field_g, -104);
                                                  break L8;
                                                } else {
                                                  Object discarded$11 = Class.forName("ka").getMethod("exit", new Class[0]).invoke(((le) this).field_l, new Object[0]);
                                                  break L8;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          if (id.a(123) >= field_k) {
                                            var8_ref.field_e = (Object) (Object) java.net.InetAddress.getByName((String) var8_ref.field_g).getAddress();
                                            break L8;
                                          } else {
                                            throw new IOException();
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    var7 = (java.awt.datatransfer.Transferable) var8_ref.field_g;
                                    var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var11.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L8;
                                  }
                                } else {
                                  var10 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8_ref.field_e = (Object) (Object) var10.getContents((Object) null);
                                  break L8;
                                }
                              }
                            }
                          }
                        } else {
                          var9 = new Thread((Runnable) var8_ref.field_g);
                          var9.setDaemon(true);
                          var9.start();
                          var9.setPriority(var8_ref.field_d);
                          var8_ref.field_e = (Object) (Object) var9;
                          break L8;
                        }
                      } else {
                        if (~field_k < ~id.a(98)) {
                          throw new IOException();
                        } else {
                          try {
                            L18: {
                              var8_ref.field_e = (Object) (Object) nc.a((String) var8_ref.field_g, (byte) 40, var8_ref.field_d).a(-26042);
                              break L18;
                            }
                          } catch (java.lang.Exception decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref_vc = (vc) (Object) decompiledCaughtException;
                            var8_ref.field_e = (Object) (Object) var3_ref_vc.getMessage();
                            throw var3_ref_vc;
                          }
                          break L8;
                        }
                      }
                    }
                  }
                  var8_ref.field_a = 1;
                  break L7;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                L19: {
                  var2_ref = decompiledCaughtException;
                  var8_ref.field_a = 2;
                  break L19;
                }
              }
              var2 = (Object) (Object) var8_ref;
              continue L0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final vi a(String param0, byte param1, int param2) {
        if (param1 >= -19) {
            vi discarded$0 = ((le) this).a((byte) -67);
        }
        int discarded$1 = 127;
        return this.a(param0, false, param2);
    }

    private final vi a(String param0, boolean param1, int param2) {
        return this.a(1, 0, param2, 13003, (Object) (Object) param0);
    }

    le(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        l var6 = null;
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
          ((le) this).field_t = null;
          ((le) this).field_b = false;
          ((le) this).field_d = null;
          ((le) this).field_x = null;
          ((le) this).field_q = false;
          ((le) this).field_n = false;
          ((le) this).field_c = null;
          ((le) this).field_p = null;
          field_v = "Unknown";
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
        ((le) this).field_b = stackIn_3_1 != 0;
        field_u = param0;
        field_w = "1.1";
        field_a = param1;
        try {
          L1: {
            field_v = System.getProperty("java.vendor");
            field_w = System.getProperty("java.version");
            break L1;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = (Exception) (Object) decompiledCaughtException;
            break L2;
          }
        }
        L3: {
          if (field_v.toLowerCase().indexOf("microsoft") != -1) {
            ((le) this).field_q = true;
            break L3;
          } else {
            break L3;
          }
        }
        try {
          L4: {
            field_r = System.getProperty("os.name");
            break L4;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var5 = (Exception) (Object) decompiledCaughtException;
            field_r = "Unknown";
            break L5;
          }
        }
        field_m = field_r.toLowerCase();
        try {
          L6: {
            String discarded$4 = System.getProperty("os.arch").toLowerCase();
            break L6;
          }
        } catch (java.lang.Exception decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L7: {
            var5 = (Exception) (Object) decompiledCaughtException;
            break L7;
          }
        }
        try {
          L8: {
            String discarded$5 = System.getProperty("os.version").toLowerCase();
            break L8;
          }
        } catch (java.lang.Exception decompiledCaughtParameter3) {
          decompiledCaughtException = decompiledCaughtParameter3;
          L9: {
            var5 = (Exception) (Object) decompiledCaughtException;
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
            var5 = (Exception) (Object) decompiledCaughtException;
            break L12;
          }
        }
        L13: {
          if (null != field_s) {
            break L13;
          } else {
            field_s = "~/";
            break L13;
          }
        }
        try {
          L14: {
            ((le) this).field_e = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
            break L14;
          }
        } catch (java.lang.Throwable decompiledCaughtParameter5) {
          decompiledCaughtException = decompiledCaughtParameter5;
          L15: {
            var5_ref = decompiledCaughtException;
            break L15;
          }
        }
        L16: {
          if (!((le) this).field_q) {
            try {
              L17: {
                java.lang.reflect.Method discarded$6 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[1]);
                break L17;
              }
            } catch (java.lang.Exception decompiledCaughtParameter6) {
              decompiledCaughtException = decompiledCaughtParameter6;
              L18: {
                var5 = (Exception) (Object) decompiledCaughtException;
                break L18;
              }
            }
            try {
              L19: {
                field_g = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
                break L19;
              }
            } catch (java.lang.Exception decompiledCaughtParameter7) {
              decompiledCaughtException = decompiledCaughtParameter7;
              L20: {
                var5 = (Exception) (Object) decompiledCaughtException;
                break L20;
              }
            }
            break L16;
          } else {
            break L16;
          }
        }
        L21: {
          dk.a(field_a, field_u, (byte) 86);
          if (!((le) this).field_b) {
            break L21;
          } else {
            ((le) this).field_x = new wk(dk.a((String) null, field_u, (byte) 123, "random.dat"), "rw", 25L);
            ((le) this).field_t = new wk(dk.a(false, "main_file_cache.dat2"), "rw", 314572800L);
            ((le) this).field_d = new wk(dk.a(false, "main_file_cache.idx255"), "rw", 1048576L);
            ((le) this).field_o = new wk[param2];
            var5_int = 0;
            L22: while (true) {
              if (param2 <= var5_int) {
                L23: {
                  if (!((le) this).field_q) {
                    break L23;
                  } else {
                    try {
                      L24: {
                        Object discarded$7 = Class.forName("oi").newInstance();
                        break L24;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter8) {
                      decompiledCaughtException = decompiledCaughtParameter8;
                      L25: {
                        var5_ref = decompiledCaughtException;
                        break L25;
                      }
                    }
                    break L23;
                  }
                }
                try {
                  L26: {
                    L27: {
                      if (((le) this).field_q) {
                        var6 = new l();
                        ((le) this).field_i = var6;
                        break L27;
                      } else {
                        ((le) this).field_l = Class.forName("ka").newInstance();
                        break L27;
                      }
                    }
                    break L26;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter9) {
                  decompiledCaughtException = decompiledCaughtParameter9;
                  L28: {
                    var5_ref = decompiledCaughtException;
                    break L28;
                  }
                }
                try {
                  L29: {
                    L30: {
                      if (((le) this).field_q) {
                        ((le) this).field_f = new gb();
                        break L30;
                      } else {
                        ((le) this).field_h = Class.forName("ob").newInstance();
                        break L30;
                      }
                    }
                    break L29;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter10) {
                  decompiledCaughtException = decompiledCaughtParameter10;
                  L31: {
                    var5_ref = decompiledCaughtException;
                    break L31;
                  }
                }
                break L21;
              } else {
                ((le) this).field_o[var5_int] = new wk(dk.a(false, "main_file_cache.idx" + var5_int), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        ((le) this).field_n = false;
        ((le) this).field_j = new Thread((Runnable) this);
        ((le) this).field_j.setPriority(10);
        ((le) this).field_j.setDaemon(true);
        ((le) this).field_j.start();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
