/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class lk implements Runnable {
    private boolean field_a;
    java.awt.EventQueue field_k;
    ma field_b;
    private ra field_i;
    private la field_c;
    private static volatile long field_n;
    boolean field_f;
    private static String field_l;
    private boolean field_m;
    private static String field_o;
    ma field_j;
    ma[] field_u;
    private Object field_h;
    private Object field_t;
    static String field_s;
    private la field_p;
    static String field_v;
    private fb field_d;
    private static int field_q;
    ma field_x;
    static java.lang.reflect.Method field_r;
    private Thread field_g;
    static String field_e;
    private static String field_w;

    private final la a(int param0, byte param1, String param2, boolean param3) {
        int var5 = -14 % ((param1 - 27) / 41);
        return this.a(param0, (Object) (Object) param2, -14572, param3 ? 22 : 1, 0);
    }

    final la a(String param0, Class param1, int param2) {
        if (param2 >= -52) {
            return null;
        }
        return this.a(0, (Object) (Object) new Object[2], -14572, 9, 0);
    }

    final boolean c(int param0) {
        if (param0 != 0) {
            ((lk) this).b(-9);
        }
        if (!(((lk) this).field_f)) {
            return false;
        }
        if (((lk) this).field_m) {
            return ((lk) this).field_i != null ? true : false;
        }
        return ((lk) this).field_t != null ? true : false;
    }

    final la a(String param0, int param1, Class param2, Class[] param3) {
        int var5 = -101 % ((param1 - -41) / 55);
        return this.a(0, (Object) (Object) new Object[3], -14572, 8, 0);
    }

    private final static ma a(boolean param0, int param1, String param2, String param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            ma var8_ref = null;
            Object var9 = null;
            ma stackIn_15_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            ma stackOut_14_0 = null;
            L0: {
              if (-34 != (param1 ^ -1)) {
                if (param1 == 34) {
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
            L1: {
              var5_array = new String[]{"c:/rscache/", "/rscache/", field_o, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
              if (!param0) {
                break L1;
              } else {
                var9 = null;
                ma discarded$1 = lk.a(true, 124, (String) null, (String) null);
                break L1;
              }
            }
            var6 = 0;
            L2: while (true) {
              if (var5_array.length > var6) {
                L3: {
                  var7 = var5_array[var6];
                  if (0 >= var7.length()) {
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
                    var8_ref = new ma(new File(var7, var4), "rw", 10000L);
                    stackOut_14_0 = (ma) var8_ref;
                    stackIn_15_0 = stackOut_14_0;
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
                  return stackIn_15_0;
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

    final la a(int param0, int param1, String param2) {
        if (param1 != 4) {
            Object var5 = null;
            la discarded$0 = ((lk) this).a((byte) -72, (java.awt.Frame) null);
        }
        return this.a(param0, (byte) 82, param2, false);
    }

    public final void run() {
        try {
            Object var2 = null;
            Throwable var2_ref = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            im var3_ref = null;
            Exception var3_ref2 = null;
            ma var3_ref3 = null;
            int var3_int = 0;
            Throwable var4_ref_Throwable = null;
            int var4 = 0;
            String var4_ref_String = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            Object var8 = null;
            la var8_ref = null;
            Object[] var9 = null;
            java.awt.datatransfer.Clipboard var10 = null;
            Object[] var11 = null;
            String var12 = null;
            java.awt.Component var13 = null;
            java.awt.Frame var14 = null;
            String var15 = null;
            java.awt.datatransfer.Clipboard var16 = null;
            Object[] var17 = null;
            Thread var18 = null;
            int stackIn_85_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_84_0 = 0;
            int stackOut_83_0 = 0;
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
                    if (!((lk) this).field_a) {
                      if (null == ((lk) this).field_c) {
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
                        continue L3;
                      } else {
                        L6: {
                          var8_ref = ((lk) this).field_c;
                          ((lk) this).field_c = ((lk) this).field_c.field_g;
                          if (((lk) this).field_c != null) {
                            break L6;
                          } else {
                            ((lk) this).field_p = null;
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
                    var2_int = var8_ref.field_e;
                    if ((var2_int ^ -1) != -2) {
                      if (-23 != (var2_int ^ -1)) {
                        if (2 == var2_int) {
                          var18 = new Thread((Runnable) var8_ref.field_d);
                          var18.setDaemon(true);
                          var18.start();
                          var18.setPriority(var8_ref.field_c);
                          var8_ref.field_b = (Object) (Object) var18;
                          break L8;
                        } else {
                          if ((var2_int ^ -1) != -5) {
                            if (-9 != (var2_int ^ -1)) {
                              if (9 == var2_int) {
                                L9: {
                                  var17 = (Object[]) var8_ref.field_d;
                                  if (((lk) this).field_f) {
                                    if (((Class) var17[0]).getClassLoader() != null) {
                                      break L9;
                                    } else {
                                      throw new SecurityException();
                                    }
                                  } else {
                                    break L9;
                                  }
                                }
                                var8_ref.field_b = (Object) (Object) ((Class) var17[0]).getDeclaredField((String) var17[1]);
                                break L8;
                              } else {
                                if ((var2_int ^ -1) != -19) {
                                  if (var2_int == 19) {
                                    var7 = (java.awt.datatransfer.Transferable) var8_ref.field_d;
                                    var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var16.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L8;
                                  } else {
                                    if (!((lk) this).field_f) {
                                      throw lk.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    } else {
                                      if (3 == var2_int) {
                                        if (field_n > td.b(128)) {
                                          throw new IOException();
                                        } else {
                                          var15 = (var8_ref.field_c >> -152525032 & 255) + "." + ((var8_ref.field_c & 16763005) >> 1730215600) + "." + ((65512 & var8_ref.field_c) >> -1298296536) + "." + (var8_ref.field_c & 255);
                                          var8_ref.field_b = (Object) (Object) java.net.InetAddress.getByName(var15).getHostName();
                                          break L8;
                                        }
                                      } else {
                                        if (var2_int != 21) {
                                          if (5 != var2_int) {
                                            if (6 == var2_int) {
                                              var14 = new java.awt.Frame("Jagex Full Screen");
                                              var8_ref.field_b = (Object) (Object) var14;
                                              var14.setResizable(false);
                                              if (((lk) this).field_m) {
                                                ((lk) this).field_i.a(var14, var8_ref.field_c & 65535, var8_ref.field_a & 65535, var8_ref.field_c >>> -778296688, -7976, var8_ref.field_a >> -505615280);
                                                break L8;
                                              } else {
                                                Object discarded$6 = Class.forName("gg").getMethod("enter", new Class[5]).invoke(((lk) this).field_t, new Object[5]);
                                                break L8;
                                              }
                                            } else {
                                              if (7 != var2_int) {
                                                if (12 == var2_int) {
                                                  var3_ref3 = lk.a(false, field_q, (String) var8_ref.field_d, field_w);
                                                  var8_ref.field_b = (Object) (Object) var3_ref3;
                                                  break L8;
                                                } else {
                                                  if (var2_int == 13) {
                                                    var3_ref3 = lk.a(false, field_q, (String) var8_ref.field_d, "");
                                                    var8_ref.field_b = (Object) (Object) var3_ref3;
                                                    break L8;
                                                  } else {
                                                    L10: {
                                                      if (!((lk) this).field_f) {
                                                        break L10;
                                                      } else {
                                                        if (-15 == (var2_int ^ -1)) {
                                                          var3_int = var8_ref.field_c;
                                                          var4 = var8_ref.field_a;
                                                          if (((lk) this).field_m) {
                                                            ((lk) this).field_d.a(var4, var3_int, -11154);
                                                            break L8;
                                                          } else {
                                                            Object discarded$7 = Class.forName("vf").getDeclaredMethod("movemouse", new Class[2]).invoke(((lk) this).field_h, new Object[2]);
                                                            break L8;
                                                          }
                                                        } else {
                                                          break L10;
                                                        }
                                                      }
                                                    }
                                                    L11: {
                                                      if (!((lk) this).field_f) {
                                                        break L11;
                                                      } else {
                                                        if ((var2_int ^ -1) == -16) {
                                                          L12: {
                                                            if (0 == var8_ref.field_c) {
                                                              stackOut_84_0 = 0;
                                                              stackIn_85_0 = stackOut_84_0;
                                                              break L12;
                                                            } else {
                                                              stackOut_83_0 = 1;
                                                              stackIn_85_0 = stackOut_83_0;
                                                              break L12;
                                                            }
                                                          }
                                                          var3_int = stackIn_85_0;
                                                          var13 = (java.awt.Component) var8_ref.field_d;
                                                          if (((lk) this).field_m) {
                                                            ((lk) this).field_d.a(var13, var3_int != 0, (byte) 110);
                                                            break L8;
                                                          } else {
                                                            Object discarded$8 = Class.forName("vf").getDeclaredMethod("showcursor", new Class[2]).invoke(((lk) this).field_h, new Object[2]);
                                                            break L8;
                                                          }
                                                        } else {
                                                          break L11;
                                                        }
                                                      }
                                                    }
                                                    L13: {
                                                      if (((lk) this).field_m) {
                                                        break L13;
                                                      } else {
                                                        if (var2_int != 17) {
                                                          break L13;
                                                        } else {
                                                          var11 = (Object[]) var8_ref.field_d;
                                                          Object discarded$9 = Class.forName("vf").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((lk) this).field_h, new Object[5]);
                                                          break L8;
                                                        }
                                                      }
                                                    }
                                                    if ((var2_int ^ -1) != -17) {
                                                      throw lk.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    } else {
                                                      try {
                                                        L14: {
                                                          if (!field_e.startsWith("win")) {
                                                            throw lk.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          } else {
                                                            L15: {
                                                              var12 = (String) var8_ref.field_d;
                                                              if (var12.startsWith("http://")) {
                                                                break L15;
                                                              } else {
                                                                if (var12.startsWith("https://")) {
                                                                  break L15;
                                                                } else {
                                                                  throw lk.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L16: while (true) {
                                                              if (var5 >= var12.length()) {
                                                                Process discarded$10 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var12 + "\"");
                                                                var8_ref.field_b = null;
                                                                break L14;
                                                              } else {
                                                                if (var4_ref_String.indexOf((int) var12.charAt(var5)) == -1) {
                                                                  throw lk.<RuntimeException>$cfr$sneakyThrow(new Exception());
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
                                                        var3_ref2 = (Exception) (Object) decompiledCaughtException;
                                                        var8_ref.field_b = (Object) (Object) var3_ref2;
                                                        throw lk.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                                                      }
                                                      break L8;
                                                    }
                                                  }
                                                }
                                              } else {
                                                if (!((lk) this).field_m) {
                                                  Object discarded$11 = Class.forName("gg").getMethod("exit", new Class[0]).invoke(((lk) this).field_t, new Object[0]);
                                                  break L8;
                                                } else {
                                                  ((lk) this).field_i.a(8, (java.awt.Frame) var8_ref.field_d);
                                                  break L8;
                                                }
                                              }
                                            }
                                          } else {
                                            if (((lk) this).field_m) {
                                              var8_ref.field_b = (Object) (Object) ((lk) this).field_i.a(-2147483648);
                                              break L8;
                                            } else {
                                              var8_ref.field_b = Class.forName("gg").getMethod("listmodes", new Class[0]).invoke(((lk) this).field_t, new Object[0]);
                                              break L8;
                                            }
                                          }
                                        } else {
                                          if ((td.b(128) ^ -1L) > (field_n ^ -1L)) {
                                            throw new IOException();
                                          } else {
                                            var8_ref.field_b = (Object) (Object) java.net.InetAddress.getByName((String) var8_ref.field_d).getAddress();
                                            break L8;
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var10 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8_ref.field_b = (Object) (Object) var10.getContents((Object) null);
                                  break L8;
                                }
                              }
                            } else {
                              L17: {
                                var9 = (Object[]) var8_ref.field_d;
                                if (!((lk) this).field_f) {
                                  break L17;
                                } else {
                                  if (((Class) var9[0]).getClassLoader() != null) {
                                    break L17;
                                  } else {
                                    throw new SecurityException();
                                  }
                                }
                              }
                              var8_ref.field_b = (Object) (Object) ((Class) var9[0]).getDeclaredMethod((String) var9[1], (Class[]) var9[2]);
                              break L8;
                            }
                          } else {
                            if (field_n <= td.b(128)) {
                              var8_ref.field_b = (Object) (Object) new DataInputStream(((java.net.URL) var8_ref.field_d).openStream());
                              break L8;
                            } else {
                              throw new IOException();
                            }
                          }
                        }
                      } else {
                        if (field_n <= td.b(128)) {
                          try {
                            L18: {
                              var8_ref.field_b = (Object) (Object) he.a((String) var8_ref.field_d, var8_ref.field_c, (byte) 85).a(0);
                              break L18;
                            }
                          } catch (java.lang.Exception decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref = (im) (Object) decompiledCaughtException;
                            var8_ref.field_b = (Object) (Object) var3_ref.getMessage();
                            throw var3_ref;
                          }
                          break L8;
                        } else {
                          throw new IOException();
                        }
                      }
                    } else {
                      if (field_n <= td.b(128)) {
                        var8_ref.field_b = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var8_ref.field_d), var8_ref.field_c);
                        break L8;
                      } else {
                        throw new IOException();
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

    final la a(byte param0, java.net.URL param1) {
        if (param0 != -12) {
            Object var4 = null;
            ma discarded$0 = lk.a(true, 121, (String) null, (String) null);
        }
        return this.a(0, (Object) (Object) param1, param0 + -14560, 4, 0);
    }

    private final la a(int param0, Object param1, int param2, int param3, int param4) {
        la var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          var6 = new la();
          if (param2 == -14572) {
            break L0;
          } else {
            ((lk) this).field_i = null;
            break L0;
          }
        }
        var6.field_c = param0;
        var6.field_e = param3;
        var6.field_d = param1;
        var6.field_a = param4;
        var7 = this;
        synchronized (var7) {
          L1: {
            L2: {
              if (null != ((lk) this).field_p) {
                ((lk) this).field_p.field_g = var6;
                ((lk) this).field_p = var6;
                break L2;
              } else {
                ((lk) this).field_c = var6;
                ((lk) this).field_p = var6;
                break L2;
              }
            }
            this.notify();
            break L1;
          }
        }
        return var6;
    }

    final la a(byte param0, java.awt.Frame param1) {
        if (param0 != 45) {
            return null;
        }
        return this.a(0, (Object) (Object) param1, param0 + -14617, 7, 0);
    }

    final la a(int param0) {
        if (param0 != 5) {
            field_w = null;
        }
        return this.a(0, (Object) null, -14572, 5, 0);
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
                L1: {
                  ((lk) this).field_a = true;
                  this.notifyAll();
                  if (param0 == 0) {
                    break L1;
                  } else {
                    ((lk) this).field_f = true;
                    break L1;
                  }
                }
                break L0;
              }
            }
            try {
              L2: {
                ((lk) this).field_g.join();
                break L2;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L3: {
                var2_ref = (InterruptedException) (Object) decompiledCaughtException;
                break L3;
              }
            }
            L4: {
              if (null != ((lk) this).field_b) {
                try {
                  L5: {
                    ((lk) this).field_b.a(0);
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
              if (null != ((lk) this).field_x) {
                try {
                  L8: {
                    ((lk) this).field_x.a(param0 ^ 0);
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
              if (((lk) this).field_u == null) {
                break L10;
              } else {
                var2_int = 0;
                L11: while (true) {
                  if (((lk) this).field_u.length <= var2_int) {
                    break L10;
                  } else {
                    if (((lk) this).field_u[var2_int] != null) {
                      try {
                        L12: {
                          ((lk) this).field_u[var2_int].a(0);
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
              if (((lk) this).field_j != null) {
                try {
                  L15: {
                    ((lk) this).field_j.a(0);
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

    final la a(int param0, int param1, int param2, int param3, int param4) {
        if (param0 > -49) {
            return null;
        }
        return this.a(param2 + (param4 << -1134162064), (Object) null, -14572, 6, param3 + (param1 << -868017936));
    }

    final la a(boolean param0, int param1, Runnable param2) {
        if (!param0) {
            return null;
        }
        return this.a(param1, (Object) (Object) param2, -14572, 2, 0);
    }

    lk(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        ra var6 = null;
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
          ((lk) this).field_b = null;
          ((lk) this).field_j = null;
          ((lk) this).field_m = false;
          ((lk) this).field_f = false;
          ((lk) this).field_c = null;
          ((lk) this).field_p = null;
          ((lk) this).field_x = null;
          ((lk) this).field_a = false;
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
        ((lk) this).field_f = stackIn_3_1 != 0;
        field_s = "Unknown";
        field_q = param0;
        field_v = "1.1";
        field_w = param1;
        try {
          L1: {
            field_s = System.getProperty("java.vendor");
            field_v = System.getProperty("java.version");
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
          if (field_s.toLowerCase().indexOf("microsoft") == -1) {
            break L3;
          } else {
            ((lk) this).field_m = true;
            break L3;
          }
        }
        try {
          L4: {
            field_l = System.getProperty("os.name");
            break L4;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var5 = (Exception) (Object) decompiledCaughtException;
            field_l = "Unknown";
            break L5;
          }
        }
        field_e = field_l.toLowerCase();
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
              if (field_o == null) {
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
          if (null != field_o) {
            break L13;
          } else {
            field_o = "~/";
            break L13;
          }
        }
        try {
          L14: {
            ((lk) this).field_k = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
          if (!((lk) this).field_m) {
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
                field_r = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
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
          ai.a(field_w, field_q, -109);
          if (!((lk) this).field_f) {
            break L21;
          } else {
            ((lk) this).field_j = new ma(ai.a((String) null, field_q, 24173, "random.dat"), "rw", 25L);
            ((lk) this).field_b = new ma(ai.a("main_file_cache.dat2", (byte) -23), "rw", 314572800L);
            ((lk) this).field_x = new ma(ai.a("main_file_cache.idx255", (byte) 124), "rw", 1048576L);
            ((lk) this).field_u = new ma[param2];
            var5_int = 0;
            L22: while (true) {
              if (param2 <= var5_int) {
                L23: {
                  if (((lk) this).field_m) {
                    try {
                      L24: {
                        Object discarded$7 = Class.forName("wm").newInstance();
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
                      if (!((lk) this).field_m) {
                        ((lk) this).field_t = Class.forName("gg").newInstance();
                        break L27;
                      } else {
                        var6 = new ra();
                        ((lk) this).field_i = var6;
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
                      if (((lk) this).field_m) {
                        ((lk) this).field_d = new fb();
                        break L30;
                      } else {
                        ((lk) this).field_h = Class.forName("vf").newInstance();
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
                ((lk) this).field_u[var5_int] = new ma(ai.a("main_file_cache.idx" + var5_int, (byte) 87), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        ((lk) this).field_a = false;
        ((lk) this).field_g = new Thread((Runnable) this);
        ((lk) this).field_g.setPriority(10);
        ((lk) this).field_g.setDaemon(true);
        ((lk) this).field_g.start();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
