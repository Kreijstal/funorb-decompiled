/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ce implements Runnable {
    rl field_t;
    rl field_k;
    private ra field_s;
    rl[] field_l;
    private static String field_g;
    private static String field_v;
    private od field_h;
    private ac field_x;
    private static String field_w;
    static String field_d;
    rl field_q;
    boolean field_e;
    private boolean field_u;
    private static volatile long field_i;
    private Object field_o;
    static java.lang.reflect.Method field_b;
    private Thread field_f;
    java.awt.EventQueue field_a;
    private od field_m;
    static String field_r;
    private boolean field_j;
    private Object field_c;
    static String field_n;
    private static int field_p;

    final od a(Class[] param0, String param1, Class param2, int param3) {
        if (param3 != 0) {
            return null;
        }
        return this.a(0, param3 ^ -127, 8, (Object) (Object) new Object[3], 0);
    }

    final od a(int param0, byte param1, int param2, int param3, int param4) {
        if (param1 != -50) {
            ((ce) this).field_a = null;
        }
        return this.a(param2 + (param0 << 16), -108, 6, (Object) null, param4 + (param3 << 16));
    }

    final od a(int param0, byte param1, String param2) {
        if (param1 != 32) {
            return null;
        }
        int discarded$0 = 12411;
        return this.a(param0, false, param2);
    }

    final od b(byte param0) {
        if (param0 < 107) {
            ((ce) this).field_o = null;
        }
        return this.a(0, -122, 5, (Object) null, 0);
    }

    public final void run() {
        try {
            Object var2 = null;
            Throwable var2_ref = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            Exception var3_ref = null;
            em var3_ref2 = null;
            rl var3_ref3 = null;
            int var3_int = 0;
            Throwable var4 = null;
            int var4_int = 0;
            String var4_ref = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            Object var8 = null;
            od var8_ref = null;
            Thread var9 = null;
            Object[] var10 = null;
            java.awt.datatransfer.Clipboard var11 = null;
            String var12 = null;
            java.awt.Component var13 = null;
            String var14 = null;
            Object[] var15 = null;
            java.awt.Frame var16 = null;
            java.awt.datatransfer.Clipboard var17 = null;
            Object[] var18 = null;
            int stackIn_58_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_57_0 = 0;
            int stackOut_56_0 = 0;
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
                    if (!((ce) this).field_u) {
                      if (((ce) this).field_m != null) {
                        L4: {
                          var8_ref = ((ce) this).field_m;
                          ((ce) this).field_m = ((ce) this).field_m.field_c;
                          if (((ce) this).field_m != null) {
                            break L4;
                          } else {
                            ((ce) this).field_h = null;
                            break L4;
                          }
                        }
                        break L2;
                      } else {
                        {
                          L5: {
                            this.wait();
                            break L5;
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
                    var2_int = var8_ref.field_d;
                    if (var2_int == 1) {
                      if (~lj.a((byte) -125) <= ~field_i) {
                        var8_ref.field_e = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var8_ref.field_f), var8_ref.field_a);
                        break L8;
                      } else {
                        throw new IOException();
                      }
                    } else {
                      if (var2_int == 22) {
                        if (lj.a((byte) -126) >= field_i) {
                          try {
                            L9: {
                              var8_ref.field_e = (Object) (Object) ol.a((String) var8_ref.field_f, 89, var8_ref.field_a).a(true);
                              break L9;
                            }
                          } catch (java.lang.Exception decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref2 = (em) (Object) decompiledCaughtException;
                            var8_ref.field_e = (Object) (Object) var3_ref2.getMessage();
                            throw var3_ref2;
                          }
                          break L8;
                        } else {
                          throw new IOException();
                        }
                      } else {
                        if (var2_int != 2) {
                          if (var2_int != 4) {
                            if (var2_int != 8) {
                              if (9 == var2_int) {
                                L10: {
                                  var18 = (Object[]) var8_ref.field_f;
                                  if (((ce) this).field_e) {
                                    if (((Class) var18[0]).getClassLoader() != null) {
                                      break L10;
                                    } else {
                                      throw new SecurityException();
                                    }
                                  } else {
                                    break L10;
                                  }
                                }
                                var8_ref.field_e = (Object) (Object) ((Class) var18[0]).getDeclaredField((String) var18[1]);
                                break L8;
                              } else {
                                if (var2_int == 18) {
                                  var17 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8_ref.field_e = (Object) (Object) var17.getContents((Object) null);
                                  break L8;
                                } else {
                                  if (var2_int != 19) {
                                    if (((ce) this).field_e) {
                                      if (var2_int != 3) {
                                        if (var2_int != 21) {
                                          if (var2_int == 5) {
                                            if (((ce) this).field_j) {
                                              var8_ref.field_e = (Object) (Object) ((ce) this).field_x.a(-7581);
                                              break L8;
                                            } else {
                                              var8_ref.field_e = Class.forName("eh").getMethod("listmodes", new Class[0]).invoke(((ce) this).field_c, new Object[0]);
                                              break L8;
                                            }
                                          } else {
                                            if (var2_int == 6) {
                                              var16 = new java.awt.Frame("Jagex Full Screen");
                                              var8_ref.field_e = (Object) (Object) var16;
                                              var16.setResizable(false);
                                              if (!((ce) this).field_j) {
                                                Object discarded$6 = Class.forName("eh").getMethod("enter", new Class[5]).invoke(((ce) this).field_c, new Object[5]);
                                                break L8;
                                              } else {
                                                ((ce) this).field_x.a(var8_ref.field_a >>> 16, 65535 & var8_ref.field_a, var16, var8_ref.field_g & 65535, true, var8_ref.field_g >> 16);
                                                break L8;
                                              }
                                            } else {
                                              if (var2_int == 7) {
                                                if (!((ce) this).field_j) {
                                                  Object discarded$7 = Class.forName("eh").getMethod("exit", new Class[0]).invoke(((ce) this).field_c, new Object[0]);
                                                  break L8;
                                                } else {
                                                  ((ce) this).field_x.a((java.awt.Frame) var8_ref.field_f, 127);
                                                  break L8;
                                                }
                                              } else {
                                                if (var2_int == 12) {
                                                  var3_ref3 = ce.a((String) var8_ref.field_f, field_p, 18933, field_w);
                                                  var8_ref.field_e = (Object) (Object) var3_ref3;
                                                  break L8;
                                                } else {
                                                  if (var2_int == 13) {
                                                    var3_ref3 = ce.a((String) var8_ref.field_f, field_p, 18933, "");
                                                    var8_ref.field_e = (Object) (Object) var3_ref3;
                                                    break L8;
                                                  } else {
                                                    L11: {
                                                      if (!((ce) this).field_e) {
                                                        break L11;
                                                      } else {
                                                        if (14 != var2_int) {
                                                          break L11;
                                                        } else {
                                                          var3_int = var8_ref.field_a;
                                                          var4_int = var8_ref.field_g;
                                                          if (!((ce) this).field_j) {
                                                            Object discarded$8 = Class.forName("ig").getDeclaredMethod("movemouse", new Class[2]).invoke(((ce) this).field_o, new Object[2]);
                                                            break L8;
                                                          } else {
                                                            ((ce) this).field_s.a(-128, var3_int, var4_int);
                                                            break L8;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L12: {
                                                      if (!((ce) this).field_e) {
                                                        break L12;
                                                      } else {
                                                        if (var2_int != 15) {
                                                          break L12;
                                                        } else {
                                                          L13: {
                                                            if (var8_ref.field_a == 0) {
                                                              stackOut_57_0 = 0;
                                                              stackIn_58_0 = stackOut_57_0;
                                                              break L13;
                                                            } else {
                                                              stackOut_56_0 = 1;
                                                              stackIn_58_0 = stackOut_56_0;
                                                              break L13;
                                                            }
                                                          }
                                                          var3_int = stackIn_58_0;
                                                          var13 = (java.awt.Component) var8_ref.field_f;
                                                          if (!((ce) this).field_j) {
                                                            Object discarded$9 = Class.forName("ig").getDeclaredMethod("showcursor", new Class[2]).invoke(((ce) this).field_o, new Object[2]);
                                                            break L8;
                                                          } else {
                                                            ((ce) this).field_s.a(var13, (byte) -36, var3_int != 0);
                                                            break L8;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L14: {
                                                      if (((ce) this).field_j) {
                                                        break L14;
                                                      } else {
                                                        if (var2_int == 17) {
                                                          var15 = (Object[]) var8_ref.field_f;
                                                          Object discarded$10 = Class.forName("ig").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((ce) this).field_o, new Object[5]);
                                                          break L8;
                                                        } else {
                                                          break L14;
                                                        }
                                                      }
                                                    }
                                                    if (var2_int == 16) {
                                                      try {
                                                        L15: {
                                                          if (!field_d.startsWith("win")) {
                                                            throw ce.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          } else {
                                                            L16: {
                                                              var14 = (String) var8_ref.field_f;
                                                              if (var14.startsWith("http://")) {
                                                                break L16;
                                                              } else {
                                                                if (!var14.startsWith("https://")) {
                                                                  throw ce.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  break L16;
                                                                }
                                                              }
                                                            }
                                                            var4_ref = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L17: while (true) {
                                                              if (var5 >= var14.length()) {
                                                                Process discarded$11 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var14 + "\"");
                                                                var8_ref.field_e = null;
                                                                break L15;
                                                              } else {
                                                                if (var4_ref.indexOf((int) var14.charAt(var5)) == -1) {
                                                                  throw ce.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  var5++;
                                                                  continue L17;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                                                        decompiledCaughtException = decompiledCaughtParameter2;
                                                        var3_ref = (Exception) (Object) decompiledCaughtException;
                                                        var8_ref.field_e = (Object) (Object) var3_ref;
                                                        throw ce.<RuntimeException>$cfr$sneakyThrow(var3_ref);
                                                      }
                                                      break L8;
                                                    } else {
                                                      throw ce.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          if (lj.a((byte) -75) >= field_i) {
                                            var8_ref.field_e = (Object) (Object) java.net.InetAddress.getByName((String) var8_ref.field_f).getAddress();
                                            break L8;
                                          } else {
                                            throw new IOException();
                                          }
                                        }
                                      } else {
                                        if (field_i <= lj.a((byte) -107)) {
                                          var12 = (255 & var8_ref.field_a >> 24) + "." + ((var8_ref.field_a & 16723364) >> 16) + "." + ((var8_ref.field_a & 65409) >> 8) + "." + (var8_ref.field_a & 255);
                                          var8_ref.field_e = (Object) (Object) java.net.InetAddress.getByName(var12).getHostName();
                                          break L8;
                                        } else {
                                          throw new IOException();
                                        }
                                      }
                                    } else {
                                      throw ce.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    }
                                  } else {
                                    var7 = (java.awt.datatransfer.Transferable) var8_ref.field_f;
                                    var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var11.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L8;
                                  }
                                }
                              }
                            } else {
                              L18: {
                                var10 = (Object[]) var8_ref.field_f;
                                if (!((ce) this).field_e) {
                                  break L18;
                                } else {
                                  if (null != ((Class) var10[0]).getClassLoader()) {
                                    break L18;
                                  } else {
                                    throw new SecurityException();
                                  }
                                }
                              }
                              var8_ref.field_e = (Object) (Object) ((Class) var10[0]).getDeclaredMethod((String) var10[1], (Class[]) var10[2]);
                              break L8;
                            }
                          } else {
                            if (field_i > lj.a((byte) -34)) {
                              throw new IOException();
                            } else {
                              var8_ref.field_e = (Object) (Object) new DataInputStream(((java.net.URL) var8_ref.field_f).openStream());
                              break L8;
                            }
                          }
                        } else {
                          var9 = new Thread((Runnable) var8_ref.field_f);
                          var9.setDaemon(true);
                          var9.start();
                          var9.setPriority(var8_ref.field_a);
                          var8_ref.field_e = (Object) (Object) var9;
                          break L8;
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

    final void a(byte param0) {
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
                ((ce) this).field_u = true;
                this.notifyAll();
                break L0;
              }
            }
            try {
              L1: {
                ((ce) this).field_f.join();
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var2_ref = (InterruptedException) (Object) decompiledCaughtException;
                break L2;
              }
            }
            L3: {
              if (((ce) this).field_q == null) {
                break L3;
              } else {
                {
                  L4: {
                    ((ce) this).field_q.b(-1);
                    break L4;
                  }
                }
                break L3;
              }
            }
            if (param0 == 125) {
              L6: {
                if (((ce) this).field_t == null) {
                  break L6;
                } else {
                  {
                    L7: {
                      ((ce) this).field_t.b(-1);
                      break L7;
                    }
                  }
                  break L6;
                }
              }
              L9: {
                if (((ce) this).field_l == null) {
                  break L9;
                } else {
                  var2_int = 0;
                  L10: while (true) {
                    if (((ce) this).field_l.length <= var2_int) {
                      break L9;
                    } else {
                      if (null != ((ce) this).field_l[var2_int]) {
                        {
                          L11: {
                            ((ce) this).field_l[var2_int].b(-1);
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
                if (null != ((ce) this).field_k) {
                  {
                    L14: {
                      ((ce) this).field_k.b(-1);
                      break L14;
                    }
                  }
                  break L13;
                } else {
                  break L13;
                }
              }
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final od a(int param0, int param1, int param2, Object param3, int param4) {
        od var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Object var9 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (param1 < -72) {
            break L0;
          } else {
            var9 = null;
            od discarded$3 = ((ce) this).a((java.awt.Frame) null, (byte) 97);
            break L0;
          }
        }
        var6 = new od();
        var6.field_g = param4;
        var6.field_f = param3;
        var6.field_a = param0;
        var6.field_d = param2;
        var7 = this;
        synchronized (var7) {
          L1: {
            L2: {
              if (((ce) this).field_h != null) {
                ((ce) this).field_h.field_c = var6;
                ((ce) this).field_h = var6;
                break L2;
              } else {
                ((ce) this).field_m = var6;
                ((ce) this).field_h = var6;
                break L2;
              }
            }
            this.notify();
            break L1;
          }
        }
        return var6;
    }

    private final od a(int param0, boolean param1, String param2) {
        return this.a(param0, -125, 1, (Object) (Object) param2, 0);
    }

    private final static rl a(String param0, int param1, int param2, String param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            rl var8_ref = null;
            Object var9 = null;
            rl stackIn_14_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            rl stackOut_13_0 = null;
            L0: {
              if (param1 != 33) {
                if (34 == param1) {
                  var4 = "jagex_" + param3 + "_preferences" + param0 + "_wip.dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param3 + "_preferences" + param0 + ".dat";
                  break L0;
                }
              } else {
                var4 = "jagex_" + param3 + "_preferences" + param0 + "_rc.dat";
                break L0;
              }
            }
            L1: {
              var5_array = new String[]{"c:/rscache/", "/rscache/", field_v, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
              var6 = 0;
              if (param2 == 18933) {
                break L1;
              } else {
                var9 = null;
                rl discarded$1 = ce.a((String) null, 43, 59, (String) null);
                break L1;
              }
            }
            L2: while (true) {
              if (var5_array.length > var6) {
                L3: {
                  var7 = var5_array[var6];
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
                    var8_ref = new rl(new File(var7, var4), "rw", 10000L);
                    stackOut_13_0 = (rl) var8_ref;
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

    final od a(java.awt.Frame param0, byte param1) {
        if (param1 != -34) {
            od discarded$0 = ((ce) this).b((byte) 116);
        }
        return this.a(0, param1 + -64, 7, (Object) (Object) param0, 0);
    }

    final od a(int param0, Runnable param1, int param2) {
        if (param0 != 4532) {
            Object var5 = null;
            od discarded$0 = ((ce) this).a(-106, (Runnable) null, -56);
        }
        return this.a(param2, -99, 2, (Object) (Object) param1, 0);
    }

    final boolean a(int param0) {
        if (!((ce) this).field_e) {
            return false;
        }
        if (param0 < 95) {
            return false;
        }
        if (!((ce) this).field_j) {
            return null != ((ce) this).field_c ? true : false;
        }
        return null != ((ce) this).field_x ? true : false;
    }

    final od a(java.net.URL param0, int param1) {
        if (param1 != -34) {
            ((ce) this).field_t = null;
        }
        return this.a(0, -81, 4, (Object) (Object) param0, 0);
    }

    final od a(byte param0, String param1, Class param2) {
        if (param0 < 37) {
            Object var5 = null;
            od discarded$0 = ((ce) this).a((java.net.URL) null, 84);
        }
        return this.a(0, -97, 9, (Object) (Object) new Object[2], 0);
    }

    ce(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        ac var6 = null;
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
          ((ce) this).field_t = null;
          ((ce) this).field_k = null;
          ((ce) this).field_u = false;
          ((ce) this).field_h = null;
          ((ce) this).field_j = false;
          ((ce) this).field_m = null;
          ((ce) this).field_e = false;
          ((ce) this).field_q = null;
          field_n = "1.1";
          field_r = "Unknown";
          field_p = param0;
          field_w = param1;
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
        ((ce) this).field_e = stackIn_3_1 != 0;
        try {
          L1: {
            field_r = System.getProperty("java.vendor");
            field_n = System.getProperty("java.version");
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
          if (-1 != field_r.toLowerCase().indexOf("microsoft")) {
            ((ce) this).field_j = true;
            break L3;
          } else {
            break L3;
          }
        }
        try {
          L4: {
            field_g = System.getProperty("os.name");
            break L4;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var5 = (Exception) (Object) decompiledCaughtException;
            field_g = "Unknown";
            break L5;
          }
        }
        field_d = field_g.toLowerCase();
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
              if (field_v == null) {
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
          if (field_v != null) {
            break L13;
          } else {
            field_v = "~/";
            break L13;
          }
        }
        try {
          L14: {
            ((ce) this).field_a = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
          if (((ce) this).field_j) {
            break L16;
          } else {
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
                field_b = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
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
          }
        }
        L21: {
          kj.a(field_w, field_p, true);
          if (!((ce) this).field_e) {
            break L21;
          } else {
            ((ce) this).field_k = new rl(kj.a((String) null, -2, field_p, "random.dat"), "rw", 25L);
            ((ce) this).field_q = new rl(kj.a(20926, "main_file_cache.dat2"), "rw", 314572800L);
            ((ce) this).field_t = new rl(kj.a(20926, "main_file_cache.idx255"), "rw", 1048576L);
            ((ce) this).field_l = new rl[param2];
            var5_int = 0;
            L22: while (true) {
              if (param2 <= var5_int) {
                L23: {
                  if (((ce) this).field_j) {
                    try {
                      L24: {
                        Object discarded$7 = Class.forName("he").newInstance();
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
                      if (!((ce) this).field_j) {
                        ((ce) this).field_c = Class.forName("eh").newInstance();
                        break L27;
                      } else {
                        var6 = new ac();
                        ((ce) this).field_x = var6;
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
                      if (((ce) this).field_j) {
                        ((ce) this).field_s = new ra();
                        break L30;
                      } else {
                        ((ce) this).field_o = Class.forName("ig").newInstance();
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
                ((ce) this).field_l[var5_int] = new rl(kj.a(20926, "main_file_cache.idx" + var5_int), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        ((ce) this).field_u = false;
        ((ce) this).field_f = new Thread((Runnable) this);
        ((ce) this).field_f.setPriority(10);
        ((ce) this).field_f.setDaemon(true);
        ((ce) this).field_f.start();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
