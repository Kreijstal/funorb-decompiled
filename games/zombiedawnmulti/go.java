/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class go implements Runnable {
    private Object field_b;
    mc field_k;
    mc field_i;
    private Object field_x;
    java.awt.EventQueue field_j;
    private di field_f;
    static java.lang.reflect.Method field_h;
    private tc field_m;
    private static String field_o;
    mc[] field_t;
    private static String field_c;
    private boolean field_w;
    static String field_l;
    static String field_q;
    private boolean field_v;
    private di field_u;
    mc field_s;
    boolean field_d;
    private cl field_p;
    private static volatile long field_g;
    private Thread field_n;
    static String field_r;
    private static int field_e;
    private static String field_a;

    final di a(int param0, Runnable param1, int param2) {
        if (param0 < 19) {
            ((go) this).field_v = true;
        }
        return this.a(2, (Object) (Object) param1, true, param2, 0);
    }

    final di a(Class[] param0, boolean param1, Class param2, String param3) {
        if (param1) {
            return null;
        }
        return this.a(8, (Object) (Object) new Object[3], true, 0, 0);
    }

    final void b(int param0) {
        try {
            InterruptedException var2 = null;
            IOException var2_ref = null;
            int var2_int = 0;
            Object var2_ref2 = null;
            Throwable var3 = null;
            IOException var3_ref = null;
            Object var4 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (param0 > 123) {
                break L0;
              } else {
                var4 = null;
                di discarded$1 = ((go) this).a((java.awt.Frame) null, true);
                break L0;
              }
            }
            var2_ref2 = this;
            synchronized (var2_ref2) {
              L1: {
                ((go) this).field_w = true;
                this.notifyAll();
                break L1;
              }
            }
            try {
              L2: {
                ((go) this).field_n.join();
                break L2;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L3: {
                var2 = (InterruptedException) (Object) decompiledCaughtException;
                break L3;
              }
            }
            L4: {
              if (null == ((go) this).field_i) {
                break L4;
              } else {
                {
                  L5: {
                    ((go) this).field_i.b((byte) 38);
                    break L5;
                  }
                }
                break L4;
              }
            }
            L7: {
              if (null != ((go) this).field_k) {
                {
                  L8: {
                    ((go) this).field_k.b((byte) 38);
                    break L8;
                  }
                }
                break L7;
              } else {
                break L7;
              }
            }
            L10: {
              if (null == ((go) this).field_t) {
                break L10;
              } else {
                var2_int = 0;
                L11: while (true) {
                  if (var2_int >= ((go) this).field_t.length) {
                    break L10;
                  } else {
                    if (((go) this).field_t[var2_int] != null) {
                      {
                        L12: {
                          ((go) this).field_t[var2_int].b((byte) 38);
                          var2_int++;
                          break L12;
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
              if (null == ((go) this).field_s) {
                break L14;
              } else {
                {
                  L15: {
                    ((go) this).field_s.b((byte) 38);
                    break L15;
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
            Object var2 = null;
            Throwable var2_ref = null;
            int var2_int = 0;
            InterruptedException var3_ref_InterruptedException = null;
            en var3_ref_en = null;
            Exception var3_ref_Exception = null;
            mc var3_ref_mc = null;
            int var3 = 0;
            Throwable var4_ref_Throwable = null;
            int var4 = 0;
            String var4_ref_String = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            Object var8 = null;
            di var8_ref = null;
            Thread var9 = null;
            Object[] var10 = null;
            java.awt.Frame var11 = null;
            Object[] var12 = null;
            String var13 = null;
            java.awt.Component var14 = null;
            String var15 = null;
            java.awt.datatransfer.Clipboard var16 = null;
            java.awt.datatransfer.Clipboard var17 = null;
            Object[] var18 = null;
            int stackIn_88_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_87_0 = 0;
            int stackOut_86_0 = 0;
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
                    if (!((go) this).field_w) {
                      if (((go) this).field_f == null) {
                        {
                          L4: {
                            this.wait();
                            break L4;
                          }
                        }
                        continue L3;
                      } else {
                        L6: {
                          var8_ref = ((go) this).field_f;
                          ((go) this).field_f = ((go) this).field_f.field_e;
                          if (null != ((go) this).field_f) {
                            break L6;
                          } else {
                            ((go) this).field_u = null;
                            break L6;
                          }
                        }
                        break L2;
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
                    var2_int = var8_ref.field_g;
                    if (var2_int == 1) {
                      if (~field_g >= ~bl.a((byte) 109)) {
                        var8_ref.field_d = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var8_ref.field_a), var8_ref.field_c);
                        break L8;
                      } else {
                        throw new IOException();
                      }
                    } else {
                      if (var2_int != 22) {
                        if (var2_int != 2) {
                          if (4 != var2_int) {
                            if (var2_int != 8) {
                              if (9 == var2_int) {
                                L9: {
                                  var18 = (Object[]) var8_ref.field_a;
                                  if (((go) this).field_d) {
                                    if (null == ((Class) var18[0]).getClassLoader()) {
                                      throw new SecurityException();
                                    } else {
                                      break L9;
                                    }
                                  } else {
                                    break L9;
                                  }
                                }
                                var8_ref.field_d = (Object) (Object) ((Class) var18[0]).getDeclaredField((String) var18[1]);
                                break L8;
                              } else {
                                if (var2_int == 18) {
                                  var17 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8_ref.field_d = (Object) (Object) var17.getContents((Object) null);
                                  break L8;
                                } else {
                                  if (var2_int == 19) {
                                    var7 = (java.awt.datatransfer.Transferable) var8_ref.field_a;
                                    var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var16.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L8;
                                  } else {
                                    if (((go) this).field_d) {
                                      if (var2_int == 3) {
                                        if (bl.a((byte) 85) < field_g) {
                                          throw new IOException();
                                        } else {
                                          var15 = (255 & var8_ref.field_c >> 24) + "." + ((var8_ref.field_c & 16770086) >> 16) + "." + ((65396 & var8_ref.field_c) >> 8) + "." + (255 & var8_ref.field_c);
                                          var8_ref.field_d = (Object) (Object) java.net.InetAddress.getByName(var15).getHostName();
                                          break L8;
                                        }
                                      } else {
                                        if (21 != var2_int) {
                                          if (var2_int != 5) {
                                            if (var2_int != 6) {
                                              if (var2_int == 7) {
                                                if (!((go) this).field_v) {
                                                  Object discarded$6 = Class.forName("te").getMethod("exit", new Class[0]).invoke(((go) this).field_b, new Object[0]);
                                                  break L8;
                                                } else {
                                                  ((go) this).field_m.a((java.awt.Frame) var8_ref.field_a, (byte) 3);
                                                  break L8;
                                                }
                                              } else {
                                                if (var2_int != 12) {
                                                  if (var2_int != 13) {
                                                    L10: {
                                                      if (!((go) this).field_d) {
                                                        break L10;
                                                      } else {
                                                        if (var2_int == 14) {
                                                          var3 = var8_ref.field_c;
                                                          var4 = var8_ref.field_b;
                                                          if (((go) this).field_v) {
                                                            ((go) this).field_p.a(var4, -12, var3);
                                                            break L8;
                                                          } else {
                                                            Object discarded$7 = Class.forName("to").getDeclaredMethod("movemouse", new Class[2]).invoke(((go) this).field_x, new Object[2]);
                                                            break L8;
                                                          }
                                                        } else {
                                                          break L10;
                                                        }
                                                      }
                                                    }
                                                    L11: {
                                                      if (!((go) this).field_d) {
                                                        break L11;
                                                      } else {
                                                        if (var2_int == 15) {
                                                          L12: {
                                                            if (var8_ref.field_c == 0) {
                                                              stackOut_87_0 = 0;
                                                              stackIn_88_0 = stackOut_87_0;
                                                              break L12;
                                                            } else {
                                                              stackOut_86_0 = 1;
                                                              stackIn_88_0 = stackOut_86_0;
                                                              break L12;
                                                            }
                                                          }
                                                          var3 = stackIn_88_0;
                                                          var14 = (java.awt.Component) var8_ref.field_a;
                                                          if (((go) this).field_v) {
                                                            ((go) this).field_p.a(var14, var3 != 0, -1101);
                                                            break L8;
                                                          } else {
                                                            Object discarded$8 = Class.forName("to").getDeclaredMethod("showcursor", new Class[2]).invoke(((go) this).field_x, new Object[2]);
                                                            break L8;
                                                          }
                                                        } else {
                                                          break L11;
                                                        }
                                                      }
                                                    }
                                                    L13: {
                                                      if (((go) this).field_v) {
                                                        break L13;
                                                      } else {
                                                        if (var2_int != 17) {
                                                          break L13;
                                                        } else {
                                                          var12 = (Object[]) var8_ref.field_a;
                                                          Object discarded$9 = Class.forName("to").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((go) this).field_x, new Object[5]);
                                                          break L8;
                                                        }
                                                      }
                                                    }
                                                    if (16 != var2_int) {
                                                      throw go.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    } else {
                                                      try {
                                                        L14: {
                                                          if (!field_l.startsWith("win")) {
                                                            throw go.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          } else {
                                                            L15: {
                                                              var13 = (String) var8_ref.field_a;
                                                              if (var13.startsWith("http://")) {
                                                                break L15;
                                                              } else {
                                                                if (!var13.startsWith("https://")) {
                                                                  throw go.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  break L15;
                                                                }
                                                              }
                                                            }
                                                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L16: while (true) {
                                                              if (~var13.length() >= ~var5) {
                                                                Process discarded$10 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var13 + "\"");
                                                                var8_ref.field_d = null;
                                                                break L14;
                                                              } else {
                                                                if (-1 == var4_ref_String.indexOf((int) var13.charAt(var5))) {
                                                                  throw go.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  var5++;
                                                                  continue L16;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter1) {
                                                        decompiledCaughtException = decompiledCaughtParameter1;
                                                        var3_ref_Exception = (Exception) (Object) decompiledCaughtException;
                                                        var8_ref.field_d = (Object) (Object) var3_ref_Exception;
                                                        throw go.<RuntimeException>$cfr$sneakyThrow(var3_ref_Exception);
                                                      }
                                                      break L8;
                                                    }
                                                  } else {
                                                    var3_ref_mc = go.a("", (String) var8_ref.field_a, true, field_e);
                                                    var8_ref.field_d = (Object) (Object) var3_ref_mc;
                                                    break L8;
                                                  }
                                                } else {
                                                  var3_ref_mc = go.a(field_c, (String) var8_ref.field_a, true, field_e);
                                                  var8_ref.field_d = (Object) (Object) var3_ref_mc;
                                                  break L8;
                                                }
                                              }
                                            } else {
                                              var11 = new java.awt.Frame("Jagex Full Screen");
                                              var8_ref.field_d = (Object) (Object) var11;
                                              var11.setResizable(false);
                                              if (((go) this).field_v) {
                                                ((go) this).field_m.a(65535 & var8_ref.field_b, var8_ref.field_c >>> 16, var8_ref.field_c & 65535, var11, 0, var8_ref.field_b >> 16);
                                                break L8;
                                              } else {
                                                Object discarded$11 = Class.forName("te").getMethod("enter", new Class[5]).invoke(((go) this).field_b, new Object[5]);
                                                break L8;
                                              }
                                            }
                                          } else {
                                            if (!((go) this).field_v) {
                                              var8_ref.field_d = Class.forName("te").getMethod("listmodes", new Class[0]).invoke(((go) this).field_b, new Object[0]);
                                              break L8;
                                            } else {
                                              var8_ref.field_d = (Object) (Object) ((go) this).field_m.a(81);
                                              break L8;
                                            }
                                          }
                                        } else {
                                          if (~bl.a((byte) 53) > ~field_g) {
                                            throw new IOException();
                                          } else {
                                            var8_ref.field_d = (Object) (Object) java.net.InetAddress.getByName((String) var8_ref.field_a).getAddress();
                                            break L8;
                                          }
                                        }
                                      }
                                    } else {
                                      throw go.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    }
                                  }
                                }
                              }
                            } else {
                              L17: {
                                var10 = (Object[]) var8_ref.field_a;
                                if (((go) this).field_d) {
                                  if (null != ((Class) var10[0]).getClassLoader()) {
                                    break L17;
                                  } else {
                                    throw new SecurityException();
                                  }
                                } else {
                                  break L17;
                                }
                              }
                              var8_ref.field_d = (Object) (Object) ((Class) var10[0]).getDeclaredMethod((String) var10[1], (Class[]) var10[2]);
                              break L8;
                            }
                          } else {
                            if (field_g > bl.a((byte) 119)) {
                              throw new IOException();
                            } else {
                              var8_ref.field_d = (Object) (Object) new DataInputStream(((java.net.URL) var8_ref.field_a).openStream());
                              break L8;
                            }
                          }
                        } else {
                          var9 = new Thread((Runnable) var8_ref.field_a);
                          var9.setDaemon(true);
                          var9.start();
                          var9.setPriority(var8_ref.field_c);
                          var8_ref.field_d = (Object) (Object) var9;
                          break L8;
                        }
                      } else {
                        if (field_g <= bl.a((byte) 92)) {
                          try {
                            L18: {
                              var8_ref.field_d = (Object) (Object) wj.a((byte) 3, var8_ref.field_c, (String) var8_ref.field_a).b(4646);
                              break L18;
                            }
                          } catch (java.lang.Exception decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref_en = (en) (Object) decompiledCaughtException;
                            var8_ref.field_d = (Object) (Object) var3_ref_en.getMessage();
                            throw var3_ref_en;
                          }
                          break L8;
                        } else {
                          throw new IOException();
                        }
                      }
                    }
                  }
                  var8_ref.field_f = 1;
                  break L7;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                L19: {
                  var2_ref = decompiledCaughtException;
                  var8_ref.field_f = 2;
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

    final di a(boolean param0, java.awt.Component param1, int param2) {
        if (param2 != -14697) {
            Object var5 = null;
            di discarded$0 = ((go) this).a((String) null, -2, (byte) -60);
        }
        return this.a(15, (Object) (Object) param1, true, param0 ? 1 : 0, 0);
    }

    private final di a(int param0, Object param1, boolean param2, int param3, int param4) {
        di var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        var6 = new di();
        var6.field_c = param3;
        var6.field_b = param4;
        var6.field_a = param1;
        var6.field_g = param0;
        var7 = this;
        synchronized (var7) {
          L0: {
            L1: {
              if (((go) this).field_u != null) {
                ((go) this).field_u.field_e = var6;
                ((go) this).field_u = var6;
                break L1;
              } else {
                ((go) this).field_f = var6;
                ((go) this).field_u = var6;
                break L1;
              }
            }
            this.notify();
            break L0;
          }
        }
        return var6;
    }

    private final static mc a(String param0, String param1, boolean param2, int param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            mc var8_ref = null;
            mc stackIn_12_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            mc stackOut_11_0 = null;
            L0: {
              if (param3 != 33) {
                if (param3 == 34) {
                  var4 = "jagex_" + param0 + "_preferences" + param1 + "_wip.dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param0 + "_preferences" + param1 + ".dat";
                  break L0;
                }
              } else {
                var4 = "jagex_" + param0 + "_preferences" + param1 + "_rc.dat";
                break L0;
              }
            }
            var5_array = new String[]{"c:/rscache/", "/rscache/", field_o, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            var6 = 0;
            L1: while (true) {
              if (var6 < var5_array.length) {
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
                    var8_ref = new mc(new File(var7, var4), "rw", 10000L);
                    stackOut_11_0 = (mc) var8_ref;
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

    final di a(byte param0, String param1, Class param2) {
        int var4 = 81 / ((param0 - 7) / 59);
        return this.a(9, (Object) (Object) new Object[2], true, 0, 0);
    }

    final di a(String param0, int param1, byte param2) {
        if (param2 != -120) {
            ((go) this).field_p = null;
        }
        int discarded$0 = 0;
        return this.a((byte) -121, param0, param1);
    }

    final boolean a(int param0) {
        if (!((go) this).field_d) {
            return false;
        }
        if (param0 >= -35) {
            ((go) this).field_p = null;
        }
        if (((go) this).field_v) {
            return null != ((go) this).field_m ? true : false;
        }
        return null != ((go) this).field_b ? true : false;
    }

    final di c(int param0) {
        if (param0 != 0) {
            ((go) this).run();
        }
        return this.a(5, (Object) null, true, 0, 0);
    }

    final di a(java.awt.Frame param0, boolean param1) {
        if (!param1) {
            Object var4 = null;
            di discarded$0 = ((go) this).a((Class[]) null, true, (Class) null, (String) null);
        }
        return this.a(7, (Object) (Object) param0, true, 0, 0);
    }

    private final di a(byte param0, String param1, int param2) {
        int var5 = 62;
        return this.a(1, (Object) (Object) param1, true, param2, 0);
    }

    final di a(byte param0, java.net.URL param1) {
        if (param0 != -12) {
            field_r = null;
        }
        return this.a(4, (Object) (Object) param1, true, 0, 0);
    }

    final di a(int param0, byte param1, int param2, int param3, int param4) {
        int var6 = 66 % ((param1 - 73) / 53);
        return this.a(6, (Object) null, true, param4 + (param0 << 16), (param3 << 16) - -param2);
    }

    go(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        tc var7 = null;
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
          ((go) this).field_i = null;
          ((go) this).field_f = null;
          ((go) this).field_w = false;
          ((go) this).field_k = null;
          ((go) this).field_s = null;
          ((go) this).field_u = null;
          ((go) this).field_d = false;
          ((go) this).field_v = false;
          field_c = param1;
          field_e = param0;
          field_q = "1.1";
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
        ((go) this).field_d = stackIn_3_1 != 0;
        field_r = "Unknown";
        try {
          L1: {
            field_r = System.getProperty("java.vendor");
            field_q = System.getProperty("java.version");
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
          if (field_r.toLowerCase().indexOf("microsoft") == -1) {
            break L3;
          } else {
            ((go) this).field_v = true;
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
            var5 = (Exception) (Object) decompiledCaughtException;
            field_a = "Unknown";
            break L5;
          }
        }
        field_l = field_a.toLowerCase();
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
              field_o = System.getProperty("user.home");
              if (null == field_o) {
                break L11;
              } else {
                field_o = field_o + "/";
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
          if (field_o != null) {
            break L13;
          } else {
            field_o = "~/";
            break L13;
          }
        }
        try {
          L14: {
            ((go) this).field_j = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
          if (((go) this).field_v) {
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
                field_h = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
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
          nd.a(field_c, field_e, -7682);
          if (!((go) this).field_d) {
            break L21;
          } else {
            ((go) this).field_s = new mc(nd.a("random.dat", -25157, (String) null, field_e), "rw", 25L);
            ((go) this).field_i = new mc(nd.a("main_file_cache.dat2", 0), "rw", 314572800L);
            ((go) this).field_k = new mc(nd.a("main_file_cache.idx255", 0), "rw", 1048576L);
            ((go) this).field_t = new mc[param2];
            var5_int = 0;
            L22: while (true) {
              if (var5_int >= param2) {
                L23: {
                  if (!((go) this).field_v) {
                    break L23;
                  } else {
                    try {
                      L24: {
                        Object discarded$7 = Class.forName("rd").newInstance();
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
                      if (((go) this).field_v) {
                        var7 = new tc();
                        ((go) this).field_m = var7;
                        break L27;
                      } else {
                        ((go) this).field_b = Class.forName("te").newInstance();
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
                      if (!((go) this).field_v) {
                        ((go) this).field_x = Class.forName("to").newInstance();
                        break L30;
                      } else {
                        ((go) this).field_p = new cl();
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
                ((go) this).field_t[var5_int] = new mc(nd.a("main_file_cache.idx" + var5_int, 0), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        ((go) this).field_w = false;
        ((go) this).field_n = new Thread((Runnable) this);
        ((go) this).field_n.setPriority(10);
        ((go) this).field_n.setDaemon(true);
        ((go) this).field_n.start();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
