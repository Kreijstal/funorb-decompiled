/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ka implements Runnable {
    private Object field_m;
    static String field_o;
    private static String field_j;
    cb field_c;
    private qh field_b;
    static String field_l;
    cb field_t;
    java.awt.EventQueue field_w;
    private boolean field_g;
    cb[] field_q;
    private boolean field_f;
    private bk field_h;
    private static String field_v;
    private static String field_u;
    private bk field_x;
    private Thread field_d;
    boolean field_n;
    private static volatile long field_k;
    static String field_r;
    private uk field_i;
    private Object field_s;
    cb field_e;
    static java.lang.reflect.Method field_p;
    private static int field_a;

    private final bk a(int param0, int param1, int param2, int param3, Object param4) {
        bk var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Object stackIn_3_0 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        var6 = new bk();
        var6.field_g = param4;
        var6.field_e = param2;
        var6.field_a = param0;
        var6.field_d = param1;
        var7 = this;
        synchronized (var7) {
          L0: {
            if (param3 == 16266) {
              L1: {
                if (((ka) this).field_x == null) {
                  ((ka) this).field_h = var6;
                  ((ka) this).field_x = var6;
                  break L1;
                } else {
                  ((ka) this).field_x.field_c = var6;
                  ((ka) this).field_x = var6;
                  break L1;
                }
              }
              this.notify();
              break L0;
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (bk) (Object) stackIn_3_0;
            }
          }
        }
        return var6;
    }

    final bk a(byte param0, java.net.URL param1) {
        if (param0 != -10) {
            return null;
        }
        return this.a(4, 0, 0, 16266, (Object) (Object) param1);
    }

    private final static cb a(byte param0, String param1, String param2, int param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            cb var8_ref = null;
            Object var9 = null;
            cb stackIn_12_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            cb stackOut_11_0 = null;
            L0: {
              if (param3 != 33) {
                if (param3 == 34) {
                  var4 = "jagex_" + param1 + "_preferences" + param2 + "_wip.dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param1 + "_preferences" + param2 + ".dat";
                  break L0;
                }
              } else {
                var4 = "jagex_" + param1 + "_preferences" + param2 + "_rc.dat";
                break L0;
              }
            }
            var5_array = new String[]{"c:/rscache/", "/rscache/", field_v, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            var6 = 0;
            L1: while (true) {
              if (var6 >= var5_array.length) {
                if (param0 > -64) {
                  var9 = null;
                  cb discarded$1 = ka.a((byte) 123, (String) null, (String) null, -123);
                  return null;
                } else {
                  return null;
                }
              } else {
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
                    var8_ref = new cb(new File(var7, var4), "rw", 10000L);
                    stackOut_11_0 = (cb) var8_ref;
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
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final bk a(int param0, int param1, Runnable param2) {
        if (param1 < 20) {
            bk discarded$0 = ((ka) this).a(72);
        }
        return this.a(2, 0, param0, 16266, (Object) (Object) param2);
    }

    private final bk a(int param0, String param1) {
        return this.a(1, 0, param0, 16266, (Object) (Object) param1);
    }

    final bk a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 != 2024561328) {
            return null;
        }
        return this.a(6, param0 + (param2 << 16), (param3 << 16) + param1, param4 + -2024545062, (Object) null);
    }

    final bk a(int param0, int param1, String param2) {
        int var4 = 66 % ((-55 - param1) / 35);
        int discarded$0 = 22;
        int discarded$1 = 0;
        return this.a(param0, param2);
    }

    final bk a(Class param0, int param1, String param2) {
        int var4 = -95 / ((param1 - -49) / 41);
        return this.a(9, 0, 0, 16266, (Object) (Object) new Object[2]);
    }

    final bk a(java.awt.Frame param0, int param1) {
        if (param1 != 12250) {
            Object var4 = null;
            cb discarded$0 = ka.a((byte) 6, (String) null, (String) null, 38);
        }
        return this.a(7, 0, 0, param1 + 4016, (Object) (Object) param0);
    }

    public final void run() {
        try {
            Throwable var2 = null;
            Object var2_ref = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            Exception var3_ref = null;
            le var3_ref2 = null;
            cb var3_ref3 = null;
            int var3_int = 0;
            Throwable var4_ref_Throwable = null;
            int var4 = 0;
            String var4_ref_String = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            Object var8 = null;
            bk var8_ref = null;
            Thread var9 = null;
            Object[] var10 = null;
            java.awt.datatransfer.Clipboard var11 = null;
            java.awt.datatransfer.Clipboard var12 = null;
            String var13 = null;
            java.awt.Frame var14 = null;
            String var15 = null;
            Object[] var16 = null;
            Object var17 = null;
            java.awt.Component var17_ref = null;
            Object[] var18 = null;
            int stackIn_89_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_88_0 = 0;
            int stackOut_87_0 = 0;
            var17 = null;
            L0: while (true) {
              var2_ref = this;
              synchronized (var2_ref) {
                L1: {
                  L2: while (true) {
                    if (!((ka) this).field_f) {
                      if (((ka) this).field_h != null) {
                        L3: {
                          var8_ref = ((ka) this).field_h;
                          ((ka) this).field_h = ((ka) this).field_h.field_c;
                          if (null == ((ka) this).field_h) {
                            ((ka) this).field_x = null;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        break L1;
                      } else {
                        {
                          L4: {
                            this.wait();
                            break L4;
                          }
                        }
                        continue L2;
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
                    var2_int = var8_ref.field_a;
                    if (var2_int == 1) {
                      if (~field_k >= ~dd.b(106)) {
                        var8_ref.field_f = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var8_ref.field_g), var8_ref.field_e);
                        break L7;
                      } else {
                        throw new IOException();
                      }
                    } else {
                      if (var2_int == 22) {
                        if (field_k <= dd.b(56)) {
                          try {
                            L8: {
                              var8_ref.field_f = (Object) (Object) hh.a(91, var8_ref.field_e, (String) var8_ref.field_g).a((byte) -42);
                              break L8;
                            }
                          } catch (java.lang.Exception decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref2 = (le) (Object) decompiledCaughtException;
                            var8_ref.field_f = (Object) (Object) var3_ref2.getMessage();
                            throw var3_ref2;
                          }
                          break L7;
                        } else {
                          throw new IOException();
                        }
                      } else {
                        if (var2_int != 2) {
                          if (var2_int == 4) {
                            if (~dd.b(126) <= ~field_k) {
                              var8_ref.field_f = (Object) (Object) new DataInputStream(((java.net.URL) var8_ref.field_g).openStream());
                              break L7;
                            } else {
                              throw new IOException();
                            }
                          } else {
                            if (8 != var2_int) {
                              if (9 == var2_int) {
                                L9: {
                                  var18 = (Object[]) var8_ref.field_g;
                                  if (((ka) this).field_n) {
                                    if (null != ((Class) var18[0]).getClassLoader()) {
                                      break L9;
                                    } else {
                                      throw new SecurityException();
                                    }
                                  } else {
                                    break L9;
                                  }
                                }
                                var8_ref.field_f = (Object) (Object) ((Class) var18[0]).getDeclaredField((String) var18[1]);
                                break L7;
                              } else {
                                if (var2_int != 18) {
                                  if (19 != var2_int) {
                                    if (!((ka) this).field_n) {
                                      throw ka.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    } else {
                                      if (var2_int != 3) {
                                        if (21 != var2_int) {
                                          if (var2_int == 5) {
                                            if (!((ka) this).field_g) {
                                              var8_ref.field_f = Class.forName("dj").getMethod("listmodes", new Class[0]).invoke(((ka) this).field_s, new Object[0]);
                                              break L7;
                                            } else {
                                              var8_ref.field_f = (Object) (Object) ((ka) this).field_b.a(0);
                                              break L7;
                                            }
                                          } else {
                                            if (var2_int != 6) {
                                              if (var2_int != 7) {
                                                if (var2_int != 12) {
                                                  if (var2_int != 13) {
                                                    L10: {
                                                      if (!((ka) this).field_n) {
                                                        break L10;
                                                      } else {
                                                        if (var2_int == 14) {
                                                          var3_int = var8_ref.field_e;
                                                          var4 = var8_ref.field_d;
                                                          if (!((ka) this).field_g) {
                                                            Object discarded$6 = Class.forName("sf").getDeclaredMethod("movemouse", new Class[2]).invoke(((ka) this).field_m, new Object[2]);
                                                            break L7;
                                                          } else {
                                                            ((ka) this).field_i.a(var4, -4, var3_int);
                                                            break L7;
                                                          }
                                                        } else {
                                                          break L10;
                                                        }
                                                      }
                                                    }
                                                    L11: {
                                                      if (!((ka) this).field_n) {
                                                        break L11;
                                                      } else {
                                                        if (var2_int == 15) {
                                                          L12: {
                                                            if (var8_ref.field_e == 0) {
                                                              stackOut_88_0 = 0;
                                                              stackIn_89_0 = stackOut_88_0;
                                                              break L12;
                                                            } else {
                                                              stackOut_87_0 = 1;
                                                              stackIn_89_0 = stackOut_87_0;
                                                              break L12;
                                                            }
                                                          }
                                                          var3_int = stackIn_89_0;
                                                          var17_ref = (java.awt.Component) var8_ref.field_g;
                                                          if (((ka) this).field_g) {
                                                            ((ka) this).field_i.a(var17_ref, 0, var3_int != 0);
                                                            break L7;
                                                          } else {
                                                            Object discarded$7 = Class.forName("sf").getDeclaredMethod("showcursor", new Class[2]).invoke(((ka) this).field_m, new Object[2]);
                                                            break L7;
                                                          }
                                                        } else {
                                                          break L11;
                                                        }
                                                      }
                                                    }
                                                    L13: {
                                                      if (((ka) this).field_g) {
                                                        break L13;
                                                      } else {
                                                        if (var2_int == 17) {
                                                          var16 = (Object[]) var8_ref.field_g;
                                                          Object discarded$8 = Class.forName("sf").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((ka) this).field_m, new Object[5]);
                                                          break L7;
                                                        } else {
                                                          break L13;
                                                        }
                                                      }
                                                    }
                                                    if (var2_int != 16) {
                                                      throw ka.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    } else {
                                                      try {
                                                        L14: {
                                                          if (!field_r.startsWith("win")) {
                                                            throw ka.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          } else {
                                                            L15: {
                                                              var15 = (String) var8_ref.field_g;
                                                              if (var15.startsWith("http://")) {
                                                                break L15;
                                                              } else {
                                                                if (!var15.startsWith("https://")) {
                                                                  throw ka.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  break L15;
                                                                }
                                                              }
                                                            }
                                                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L16: while (true) {
                                                              if (~var15.length() >= ~var5) {
                                                                Process discarded$9 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var15 + "\"");
                                                                var8_ref.field_f = null;
                                                                break L14;
                                                              } else {
                                                                if (var4_ref_String.indexOf((int) var15.charAt(var5)) == -1) {
                                                                  throw ka.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  var5++;
                                                                  continue L16;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                                                        decompiledCaughtException = decompiledCaughtParameter2;
                                                        var3_ref = (Exception) (Object) decompiledCaughtException;
                                                        var8_ref.field_f = (Object) (Object) var3_ref;
                                                        throw ka.<RuntimeException>$cfr$sneakyThrow(var3_ref);
                                                      }
                                                      break L7;
                                                    }
                                                  } else {
                                                    var3_ref3 = ka.a((byte) -70, "", (String) var8_ref.field_g, field_a);
                                                    var8_ref.field_f = (Object) (Object) var3_ref3;
                                                    break L7;
                                                  }
                                                } else {
                                                  var3_ref3 = ka.a((byte) -73, field_j, (String) var8_ref.field_g, field_a);
                                                  var8_ref.field_f = (Object) (Object) var3_ref3;
                                                  break L7;
                                                }
                                              } else {
                                                if (!((ka) this).field_g) {
                                                  Object discarded$10 = Class.forName("dj").getMethod("exit", new Class[0]).invoke(((ka) this).field_s, new Object[0]);
                                                  break L7;
                                                } else {
                                                  ((ka) this).field_b.a((java.awt.Frame) var8_ref.field_g, 8);
                                                  break L7;
                                                }
                                              }
                                            } else {
                                              var14 = new java.awt.Frame("Jagex Full Screen");
                                              var8_ref.field_f = (Object) (Object) var14;
                                              var14.setResizable(false);
                                              if (!((ka) this).field_g) {
                                                Object discarded$11 = Class.forName("dj").getMethod("enter", new Class[5]).invoke(((ka) this).field_s, new Object[5]);
                                                break L7;
                                              } else {
                                                ((ka) this).field_b.a(var8_ref.field_d >> 16, 65535 & var8_ref.field_e, 65535 & var8_ref.field_d, var14, var8_ref.field_e >>> 16, (byte) -70);
                                                break L7;
                                              }
                                            }
                                          }
                                        } else {
                                          if (dd.b(118) < field_k) {
                                            throw new IOException();
                                          } else {
                                            var8_ref.field_f = (Object) (Object) java.net.InetAddress.getByName((String) var8_ref.field_g).getAddress();
                                            break L7;
                                          }
                                        }
                                      } else {
                                        if (field_k > dd.b(104)) {
                                          throw new IOException();
                                        } else {
                                          var13 = (255 & var8_ref.field_e >> 24) + "." + (var8_ref.field_e >> 16 & 255) + "." + (255 & var8_ref.field_e >> 8) + "." + (255 & var8_ref.field_e);
                                          var8_ref.field_f = (Object) (Object) java.net.InetAddress.getByName(var13).getHostName();
                                          break L7;
                                        }
                                      }
                                    }
                                  } else {
                                    var7 = (java.awt.datatransfer.Transferable) var8_ref.field_g;
                                    var12 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var12.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L7;
                                  }
                                } else {
                                  var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8_ref.field_f = (Object) (Object) var11.getContents((Object) null);
                                  break L7;
                                }
                              }
                            } else {
                              L17: {
                                var10 = (Object[]) var8_ref.field_g;
                                if (((ka) this).field_n) {
                                  if (((Class) var10[0]).getClassLoader() != null) {
                                    break L17;
                                  } else {
                                    throw new SecurityException();
                                  }
                                } else {
                                  break L17;
                                }
                              }
                              var8_ref.field_f = (Object) (Object) ((Class) var10[0]).getDeclaredMethod((String) var10[1], (Class[]) var10[2]);
                              break L7;
                            }
                          }
                        } else {
                          var9 = new Thread((Runnable) var8_ref.field_g);
                          var9.setDaemon(true);
                          var9.start();
                          var9.setPriority(var8_ref.field_e);
                          var8_ref.field_f = (Object) (Object) var9;
                          break L7;
                        }
                      }
                    }
                  }
                  var8_ref.field_b = 1;
                  break L6;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                L18: {
                  var2 = decompiledCaughtException;
                  var8_ref.field_b = 2;
                  break L18;
                }
              }
              var2_ref = (Object) (Object) var8_ref;
              synchronized (var2_ref) {
                L19: {
                  ((Object) (Object) var8_ref).notify();
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

    final bk a(int param0) {
        if (param0 > -123) {
            field_p = null;
        }
        return this.a(5, 0, 0, 16266, (Object) null);
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
                ((ka) this).field_f = true;
                this.notifyAll();
                break L0;
              }
            }
            try {
              L1: {
                if (param0 == 0) {
                  ((ka) this).field_d.join();
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
              if (((ka) this).field_e != null) {
                {
                  L4: {
                    ((ka) this).field_e.a(param0 ^ 1);
                    break L4;
                  }
                }
                break L3;
              } else {
                break L3;
              }
            }
            L6: {
              if (null == ((ka) this).field_t) {
                break L6;
              } else {
                {
                  L7: {
                    ((ka) this).field_t.a(1);
                    break L7;
                  }
                }
                break L6;
              }
            }
            L9: {
              if (((ka) this).field_q != null) {
                var2_int = 0;
                L10: while (true) {
                  if (var2_int >= ((ka) this).field_q.length) {
                    break L9;
                  } else {
                    if (null != ((ka) this).field_q[var2_int]) {
                      {
                        L11: {
                          ((ka) this).field_q[var2_int].a(1);
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
              if (((ka) this).field_c != null) {
                {
                  L14: {
                    ((ka) this).field_c.a(1);
                    break L14;
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

    final bk a(Class param0, String param1, Class[] param2, int param3) {
        if (param3 != 29389) {
            return null;
        }
        return this.a(8, 0, 0, param3 + -13123, (Object) (Object) new Object[3]);
    }

    final boolean a(byte param0) {
        if (!(((ka) this).field_n)) {
            return false;
        }
        if (param0 != -68) {
            boolean discarded$0 = ((ka) this).a((byte) 20);
        }
        if (!((ka) this).field_g) {
            return ((ka) this).field_s != null ? true : false;
        }
        return ((ka) this).field_b != null ? true : false;
    }

    ka(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        qh var7 = null;
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
          ((ka) this).field_t = null;
          ((ka) this).field_f = false;
          ((ka) this).field_h = null;
          ((ka) this).field_g = false;
          ((ka) this).field_x = null;
          ((ka) this).field_n = false;
          ((ka) this).field_c = null;
          ((ka) this).field_e = null;
          field_a = param0;
          field_o = "1.1";
          field_j = param1;
          field_l = "Unknown";
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
        ((ka) this).field_n = stackIn_3_1 != 0;
        try {
          L1: {
            field_l = System.getProperty("java.vendor");
            field_o = System.getProperty("java.version");
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
          if (-1 == field_l.toLowerCase().indexOf("microsoft")) {
            break L3;
          } else {
            ((ka) this).field_g = true;
            break L3;
          }
        }
        try {
          L4: {
            field_u = System.getProperty("os.name");
            break L4;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var5 = (Exception) (Object) decompiledCaughtException;
            field_u = "Unknown";
            break L5;
          }
        }
        field_r = field_u.toLowerCase();
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
              field_v = System.getProperty("user.home");
              if (null == field_v) {
                break L11;
              } else {
                field_v = field_v + "/";
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
          if (field_v == null) {
            field_v = "~/";
            break L13;
          } else {
            break L13;
          }
        }
        try {
          L14: {
            ((ka) this).field_w = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
          if (!((ka) this).field_g) {
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
                field_p = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
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
          e.a(field_a, field_j, -19960);
          if (!((ka) this).field_n) {
            break L21;
          } else {
            ((ka) this).field_c = new cb(e.a("random.dat", (String) null, -8204, field_a), "rw", 25L);
            ((ka) this).field_e = new cb(e.a(0, "main_file_cache.dat2"), "rw", 314572800L);
            ((ka) this).field_t = new cb(e.a(0, "main_file_cache.idx255"), "rw", 1048576L);
            ((ka) this).field_q = new cb[param2];
            var5_int = 0;
            L22: while (true) {
              if (var5_int >= param2) {
                L23: {
                  if (((ka) this).field_g) {
                    try {
                      L24: {
                        Object discarded$7 = Class.forName("f").newInstance();
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
                  } else {
                    break L23;
                  }
                }
                try {
                  L26: {
                    L27: {
                      if (((ka) this).field_g) {
                        var7 = new qh();
                        ((ka) this).field_b = var7;
                        break L27;
                      } else {
                        ((ka) this).field_s = Class.forName("dj").newInstance();
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
                      if (!((ka) this).field_g) {
                        ((ka) this).field_m = Class.forName("sf").newInstance();
                        break L30;
                      } else {
                        ((ka) this).field_i = new uk();
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
                ((ka) this).field_q[var5_int] = new cb(e.a(0, "main_file_cache.idx" + var5_int), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        ((ka) this).field_f = false;
        ((ka) this).field_d = new Thread((Runnable) this);
        ((ka) this).field_d.setPriority(10);
        ((ka) this).field_d.setDaemon(true);
        ((ka) this).field_d.start();
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
