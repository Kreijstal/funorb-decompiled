/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jj implements Runnable {
    java.awt.EventQueue field_j;
    private static int field_f;
    private fl field_w;
    boolean field_p;
    static String field_m;
    private wk field_b;
    private Object field_c;
    private boolean field_u;
    bj field_k;
    private wk field_s;
    private static volatile long field_l;
    private static String field_t;
    static String field_v;
    private boolean field_q;
    private Object field_g;
    private a field_i;
    bj[] field_n;
    static java.lang.reflect.Method field_e;
    static String field_d;
    bj field_o;
    private Thread field_a;
    private static String field_x;
    bj field_r;
    private static String field_h;

    private final static bj a(int param0, int param1, String param2, String param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            bj var8_ref = null;
            bj stackIn_13_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            bj stackOut_12_0 = null;
            L0: {
              if (param1 != 33) {
                if (34 != param1) {
                  var4 = "jagex_" + param2 + "_preferences" + param3 + ".dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param2 + "_preferences" + param3 + "_wip.dat";
                  break L0;
                }
              } else {
                var4 = "jagex_" + param2 + "_preferences" + param3 + "_rc.dat";
                break L0;
              }
            }
            var5_array = new String[]{"c:/rscache/", "/rscache/", field_t, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            var6 = 0;
            L1: while (true) {
              if (var6 < var5_array.length) {
                L2: {
                  var7 = var5_array[var6];
                  if (0 >= var7.length()) {
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
                    var8_ref = new bj(new File(var7, var4), "rw", 10000L);
                    stackOut_12_0 = (bj) var8_ref;
                    stackIn_13_0 = stackOut_12_0;
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
                  return stackIn_13_0;
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

    final wk b(int param0) {
        if (param0 > -105) {
            ((jj) this).field_c = null;
        }
        return this.a(0, (Object) null, 0, 5, 0);
    }

    private final wk a(int param0, Object param1, int param2, int param3, int param4) {
        wk var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        var6 = new wk();
        var6.field_a = param3;
        var6.field_f = param1;
        var6.field_c = param2;
        var6.field_g = param0;
        var7 = this;
        synchronized (var7) {
          L0: {
            L1: {
              if (((jj) this).field_b == null) {
                ((jj) this).field_s = var6;
                ((jj) this).field_b = var6;
                break L1;
              } else {
                ((jj) this).field_b.field_e = var6;
                ((jj) this).field_b = var6;
                break L1;
              }
            }
            this.notify();
            break L0;
          }
        }
        return var6;
    }

    final wk a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 != 1636602704) {
            Object var7 = null;
            wk discarded$0 = ((jj) this).a(-115, (Runnable) null, -90);
        }
        return this.a((param1 << 16) - -param0, (Object) null, (param3 << 16) + param2, 6, 0);
    }

    final wk a(int param0, Class param1, String param2) {
        if (param0 > -50) {
            ((jj) this).run();
        }
        return this.a(0, (Object) (Object) new Object[2], 0, 9, 0);
    }

    private final wk a(boolean param0, String param1, int param2, int param3) {
        return this.a(param3, (Object) (Object) param1, 0, 1, 0);
    }

    final wk a(boolean param0, java.awt.Frame param1) {
        if (param0) {
            return null;
        }
        return this.a(0, (Object) (Object) param1, 0, 7, 0);
    }

    final wk a(int param0, Runnable param1, int param2) {
        if (param2 != 0) {
            return null;
        }
        return this.a(param0, (Object) (Object) param1, 0, 2, 0);
    }

    final wk a(Class[] param0, int param1, Class param2, String param3) {
        if (param1 < 29) {
            boolean discarded$0 = ((jj) this).a(38);
        }
        return this.a(0, (Object) (Object) new Object[3], 0, 8, 0);
    }

    final wk a(int param0, int param1, String param2) {
        if (param0 >= -79) {
            field_f = -84;
        }
        return this.a(false, param2, 1, param1);
    }

    final boolean a(int param0) {
        if (param0 >= -118) {
            ((jj) this).field_n = null;
        }
        if (!((jj) this).field_p) {
            return false;
        }
        if (((jj) this).field_u) {
            return ((jj) this).field_i != null ? true : false;
        }
        return null != ((jj) this).field_c ? true : false;
    }

    final wk a(int param0, java.net.URL param1) {
        int var3 = -127 % ((48 - param0) / 60);
        return this.a(0, (Object) (Object) param1, 0, 4, 0);
    }

    public final void run() {
        try {
            Object var2 = null;
            Throwable var2_ref = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            rg var3_ref = null;
            Exception var3_ref2 = null;
            bj var3_ref3 = null;
            int var3_int = 0;
            Throwable var4 = null;
            int var4_int = 0;
            String var4_ref = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            Object var8 = null;
            wk var8_ref = null;
            Thread var9 = null;
            java.awt.datatransfer.Clipboard var10 = null;
            java.awt.Component var11 = null;
            Object[] var12 = null;
            String var13 = null;
            java.awt.Frame var14 = null;
            String var15 = null;
            java.awt.datatransfer.Clipboard var16 = null;
            Object[] var17 = null;
            Object[] var18 = null;
            int stackIn_57_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_56_0 = 0;
            int stackOut_55_0 = 0;
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
                    if (((jj) this).field_q) {
                      return;
                    } else {
                      if (null == ((jj) this).field_s) {
                        {
                          L4: {
                            this.wait();
                            break L4;
                          }
                        }
                        continue L3;
                      } else {
                        L6: {
                          var8_ref = ((jj) this).field_s;
                          ((jj) this).field_s = ((jj) this).field_s.field_e;
                          if (null == ((jj) this).field_s) {
                            ((jj) this).field_b = null;
                            break L6;
                          } else {
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
                    var2_int = var8_ref.field_a;
                    if (var2_int == 1) {
                      if (field_l > gk.a(126)) {
                        throw new IOException();
                      } else {
                        var8_ref.field_d = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var8_ref.field_f), var8_ref.field_g);
                        break L8;
                      }
                    } else {
                      if (var2_int != 22) {
                        if (var2_int != 2) {
                          if (var2_int == 4) {
                            if (field_l <= gk.a(52)) {
                              var8_ref.field_d = (Object) (Object) new DataInputStream(((java.net.URL) var8_ref.field_f).openStream());
                              break L8;
                            } else {
                              throw new IOException();
                            }
                          } else {
                            if (var2_int == 8) {
                              L9: {
                                var18 = (Object[]) var8_ref.field_f;
                                if (!((jj) this).field_p) {
                                  break L9;
                                } else {
                                  if (((Class) var18[0]).getClassLoader() == null) {
                                    throw new SecurityException();
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              var8_ref.field_d = (Object) (Object) ((Class) var18[0]).getDeclaredMethod((String) var18[1], (Class[]) var18[2]);
                              break L8;
                            } else {
                              if (var2_int == 9) {
                                L10: {
                                  var17 = (Object[]) var8_ref.field_f;
                                  if (((jj) this).field_p) {
                                    if (null != ((Class) var17[0]).getClassLoader()) {
                                      break L10;
                                    } else {
                                      throw new SecurityException();
                                    }
                                  } else {
                                    break L10;
                                  }
                                }
                                var8_ref.field_d = (Object) (Object) ((Class) var17[0]).getDeclaredField((String) var17[1]);
                                break L8;
                              } else {
                                if (var2_int == 18) {
                                  var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8_ref.field_d = (Object) (Object) var16.getContents((Object) null);
                                  break L8;
                                } else {
                                  if (19 != var2_int) {
                                    if (!((jj) this).field_p) {
                                      throw jj.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    } else {
                                      if (3 == var2_int) {
                                        if (field_l <= gk.a(115)) {
                                          var15 = (var8_ref.field_g >> 24 & 255) + "." + ((16726532 & var8_ref.field_g) >> 16) + "." + (var8_ref.field_g >> 8 & 255) + "." + (var8_ref.field_g & 255);
                                          var8_ref.field_d = (Object) (Object) java.net.InetAddress.getByName(var15).getHostName();
                                          break L8;
                                        } else {
                                          throw new IOException();
                                        }
                                      } else {
                                        if (var2_int != 21) {
                                          if (var2_int == 5) {
                                            if (!((jj) this).field_u) {
                                              var8_ref.field_d = Class.forName("pa").getMethod("listmodes", new Class[0]).invoke(((jj) this).field_c, new Object[0]);
                                              break L8;
                                            } else {
                                              var8_ref.field_d = (Object) (Object) ((jj) this).field_i.a((byte) -99);
                                              break L8;
                                            }
                                          } else {
                                            if (var2_int == 6) {
                                              var14 = new java.awt.Frame("Jagex Full Screen");
                                              var8_ref.field_d = (Object) (Object) var14;
                                              var14.setResizable(false);
                                              if (!((jj) this).field_u) {
                                                Object discarded$6 = Class.forName("pa").getMethod("enter", new Class[5]).invoke(((jj) this).field_c, new Object[5]);
                                                break L8;
                                              } else {
                                                ((jj) this).field_i.a(var8_ref.field_g >>> 16, var8_ref.field_c & 65535, (byte) -70, var8_ref.field_c >> 16, 65535 & var8_ref.field_g, var14);
                                                break L8;
                                              }
                                            } else {
                                              if (var2_int != 7) {
                                                if (var2_int != 12) {
                                                  if (13 != var2_int) {
                                                    L11: {
                                                      if (!((jj) this).field_p) {
                                                        break L11;
                                                      } else {
                                                        if (var2_int != 14) {
                                                          break L11;
                                                        } else {
                                                          var3_int = var8_ref.field_g;
                                                          var4_int = var8_ref.field_c;
                                                          if (!((jj) this).field_u) {
                                                            Object discarded$7 = Class.forName("pj").getDeclaredMethod("movemouse", new Class[2]).invoke(((jj) this).field_g, new Object[2]);
                                                            break L8;
                                                          } else {
                                                            ((jj) this).field_w.a(var3_int, (byte) 76, var4_int);
                                                            break L8;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L12: {
                                                      if (!((jj) this).field_p) {
                                                        break L12;
                                                      } else {
                                                        if (var2_int != 15) {
                                                          break L12;
                                                        } else {
                                                          L13: {
                                                            if (var8_ref.field_g == 0) {
                                                              stackOut_56_0 = 0;
                                                              stackIn_57_0 = stackOut_56_0;
                                                              break L13;
                                                            } else {
                                                              stackOut_55_0 = 1;
                                                              stackIn_57_0 = stackOut_55_0;
                                                              break L13;
                                                            }
                                                          }
                                                          var3_int = stackIn_57_0;
                                                          var11 = (java.awt.Component) var8_ref.field_f;
                                                          if (((jj) this).field_u) {
                                                            ((jj) this).field_w.a(11333, var11, var3_int != 0);
                                                            break L8;
                                                          } else {
                                                            Object discarded$8 = Class.forName("pj").getDeclaredMethod("showcursor", new Class[2]).invoke(((jj) this).field_g, new Object[2]);
                                                            break L8;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L14: {
                                                      if (((jj) this).field_u) {
                                                        break L14;
                                                      } else {
                                                        if (var2_int != 17) {
                                                          break L14;
                                                        } else {
                                                          var12 = (Object[]) var8_ref.field_f;
                                                          Object discarded$9 = Class.forName("pj").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((jj) this).field_g, new Object[5]);
                                                          break L8;
                                                        }
                                                      }
                                                    }
                                                    if (var2_int != 16) {
                                                      throw jj.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    } else {
                                                      try {
                                                        L15: {
                                                          if (!field_v.startsWith("win")) {
                                                            throw jj.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          } else {
                                                            L16: {
                                                              var13 = (String) var8_ref.field_f;
                                                              if (var13.startsWith("http://")) {
                                                                break L16;
                                                              } else {
                                                                if (var13.startsWith("https://")) {
                                                                  break L16;
                                                                } else {
                                                                  throw jj.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                            var4_ref = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L17: while (true) {
                                                              if (var13.length() <= var5) {
                                                                Process discarded$10 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var13 + "\"");
                                                                var8_ref.field_d = null;
                                                                break L15;
                                                              } else {
                                                                if (var4_ref.indexOf((int) var13.charAt(var5)) == -1) {
                                                                  throw jj.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  var5++;
                                                                  continue L17;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter1) {
                                                        decompiledCaughtException = decompiledCaughtParameter1;
                                                        var3_ref2 = (Exception) (Object) decompiledCaughtException;
                                                        var8_ref.field_d = (Object) (Object) var3_ref2;
                                                        throw jj.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                                                      }
                                                      break L8;
                                                    }
                                                  } else {
                                                    var3_ref3 = jj.a(0, field_f, "", (String) var8_ref.field_f);
                                                    var8_ref.field_d = (Object) (Object) var3_ref3;
                                                    break L8;
                                                  }
                                                } else {
                                                  var3_ref3 = jj.a(0, field_f, field_h, (String) var8_ref.field_f);
                                                  var8_ref.field_d = (Object) (Object) var3_ref3;
                                                  break L8;
                                                }
                                              } else {
                                                if (((jj) this).field_u) {
                                                  ((jj) this).field_i.a((java.awt.Frame) var8_ref.field_f, 0);
                                                  break L8;
                                                } else {
                                                  Object discarded$11 = Class.forName("pa").getMethod("exit", new Class[0]).invoke(((jj) this).field_c, new Object[0]);
                                                  break L8;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          if (~field_l >= ~gk.a(101)) {
                                            var8_ref.field_d = (Object) (Object) java.net.InetAddress.getByName((String) var8_ref.field_f).getAddress();
                                            break L8;
                                          } else {
                                            throw new IOException();
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    var7 = (java.awt.datatransfer.Transferable) var8_ref.field_f;
                                    var10 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var10.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L8;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var9 = new Thread((Runnable) var8_ref.field_f);
                          var9.setDaemon(true);
                          var9.start();
                          var9.setPriority(var8_ref.field_g);
                          var8_ref.field_d = (Object) (Object) var9;
                          break L8;
                        }
                      } else {
                        if (field_l <= gk.a(61)) {
                          try {
                            L18: {
                              var8_ref.field_d = (Object) (Object) wp.a((String) var8_ref.field_f, (byte) -109, var8_ref.field_g).b(640);
                              break L18;
                            }
                          } catch (java.lang.Exception decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref = (rg) (Object) decompiledCaughtException;
                            var8_ref.field_d = (Object) (Object) var3_ref.getMessage();
                            throw var3_ref;
                          }
                          break L8;
                        } else {
                          throw new IOException();
                        }
                      }
                    }
                  }
                  var8_ref.field_b = 1;
                  break L7;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                L19: {
                  var2_ref = decompiledCaughtException;
                  var8_ref.field_b = 2;
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

    final void a(boolean param0) {
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
                ((jj) this).field_q = true;
                this.notifyAll();
                break L0;
              }
            }
            try {
              L1: {
                if (!param0) {
                  ((jj) this).field_a.join();
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
              if (null != ((jj) this).field_o) {
                {
                  L4: {
                    ((jj) this).field_o.a(0);
                    break L4;
                  }
                }
                break L3;
              } else {
                break L3;
              }
            }
            L6: {
              if (null == ((jj) this).field_r) {
                break L6;
              } else {
                {
                  L7: {
                    ((jj) this).field_r.a(0);
                    break L7;
                  }
                }
                break L6;
              }
            }
            L9: {
              if (((jj) this).field_n == null) {
                break L9;
              } else {
                var2_int = 0;
                L10: while (true) {
                  if (var2_int >= ((jj) this).field_n.length) {
                    break L9;
                  } else {
                    if (null != ((jj) this).field_n[var2_int]) {
                      {
                        L11: {
                          ((jj) this).field_n[var2_int].a(0);
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
              }
            }
            L13: {
              if (null != ((jj) this).field_k) {
                {
                  L14: {
                    ((jj) this).field_k.a(0);
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

    jj(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        a var7 = null;
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
          ((jj) this).field_p = false;
          ((jj) this).field_s = null;
          ((jj) this).field_b = null;
          ((jj) this).field_q = false;
          ((jj) this).field_k = null;
          ((jj) this).field_o = null;
          ((jj) this).field_u = false;
          ((jj) this).field_r = null;
          field_f = param0;
          field_h = param1;
          field_m = "Unknown";
          field_d = "1.1";
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
        ((jj) this).field_p = stackIn_3_1 != 0;
        try {
          L1: {
            field_m = System.getProperty("java.vendor");
            field_d = System.getProperty("java.version");
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
          if (field_m.toLowerCase().indexOf("microsoft") == -1) {
            break L3;
          } else {
            ((jj) this).field_u = true;
            break L3;
          }
        }
        try {
          L4: {
            field_x = System.getProperty("os.name");
            break L4;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var5 = (Exception) (Object) decompiledCaughtException;
            field_x = "Unknown";
            break L5;
          }
        }
        field_v = field_x.toLowerCase();
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
              field_t = System.getProperty("user.home");
              if (field_t == null) {
                break L11;
              } else {
                field_t = field_t + "/";
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
          if (null == field_t) {
            field_t = "~/";
            break L13;
          } else {
            break L13;
          }
        }
        try {
          L14: {
            ((jj) this).field_j = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
          if (!((jj) this).field_u) {
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
                field_e = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
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
          gq.a((byte) -110, field_h, field_f);
          if (!((jj) this).field_p) {
            break L21;
          } else {
            ((jj) this).field_k = new bj(gq.a(0, field_f, "random.dat", (String) null), "rw", 25L);
            ((jj) this).field_o = new bj(gq.a("main_file_cache.dat2", -122), "rw", 314572800L);
            ((jj) this).field_r = new bj(gq.a("main_file_cache.idx255", -121), "rw", 1048576L);
            ((jj) this).field_n = new bj[param2];
            var5_int = 0;
            L22: while (true) {
              if (param2 <= var5_int) {
                L23: {
                  if (((jj) this).field_u) {
                    try {
                      L24: {
                        Object discarded$7 = Class.forName("hf").newInstance();
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
                      if (((jj) this).field_u) {
                        var7 = new a();
                        ((jj) this).field_i = var7;
                        break L27;
                      } else {
                        ((jj) this).field_c = Class.forName("pa").newInstance();
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
                      if (((jj) this).field_u) {
                        ((jj) this).field_w = new fl();
                        break L30;
                      } else {
                        ((jj) this).field_g = Class.forName("pj").newInstance();
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
                ((jj) this).field_n[var5_int] = new bj(gq.a("main_file_cache.idx" + var5_int, -122), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        ((jj) this).field_q = false;
        ((jj) this).field_a = new Thread((Runnable) this);
        ((jj) this).field_a.setPriority(10);
        ((jj) this).field_a.setDaemon(true);
        ((jj) this).field_a.start();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
