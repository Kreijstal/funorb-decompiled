/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ib implements Runnable {
    static String field_j;
    private sc field_m;
    private static volatile long field_w;
    private static String field_i;
    bg field_a;
    boolean field_f;
    bg field_h;
    private Thread field_r;
    private boolean field_l;
    private af field_o;
    bg[] field_g;
    private af field_k;
    java.awt.EventQueue field_t;
    static java.lang.reflect.Method field_c;
    bg field_u;
    private static String field_n;
    private Object field_d;
    private Object field_e;
    private static String field_v;
    private static int field_b;
    private cl field_x;
    private boolean field_q;
    static String field_s;
    static String field_p;

    private final af a(String param0, int param1, int param2, boolean param3) {
        return this.a(0, param2, 1, -15563, (Object) (Object) param0);
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
                ((ib) this).field_q = true;
                this.notifyAll();
                break L0;
              }
            }
            if (param0 == 55) {
              try {
                L1: {
                  ((ib) this).field_r.join();
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
                if (null == ((ib) this).field_u) {
                  break L3;
                } else {
                  {
                    L4: {
                      ((ib) this).field_u.a((byte) 20);
                      break L4;
                    }
                  }
                  break L3;
                }
              }
              L6: {
                if (((ib) this).field_h != null) {
                  {
                    L7: {
                      ((ib) this).field_h.a((byte) 20);
                      break L7;
                    }
                  }
                  break L6;
                } else {
                  break L6;
                }
              }
              L9: {
                if (((ib) this).field_g != null) {
                  var2_int = 0;
                  L10: while (true) {
                    if (var2_int >= ((ib) this).field_g.length) {
                      break L9;
                    } else {
                      if (null != ((ib) this).field_g[var2_int]) {
                        {
                          L11: {
                            ((ib) this).field_g[var2_int].a((byte) 20);
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
                if (((ib) this).field_a != null) {
                  {
                    L14: {
                      ((ib) this).field_a.a((byte) 20);
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

    final af a(String param0, Class[] param1, Class param2, byte param3) {
        if (param3 != -32) {
            af discarded$0 = ((ib) this).a(37);
        }
        return this.a(0, 0, 8, -15563, (Object) (Object) new Object[3]);
    }

    private final af a(int param0, int param1, int param2, int param3, Object param4) {
        af var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          var6 = new af();
          var6.field_f = param0;
          if (param3 == -15563) {
            break L0;
          } else {
            ((ib) this).run();
            break L0;
          }
        }
        var6.field_c = param4;
        var6.field_a = param2;
        var6.field_g = param1;
        var7 = this;
        synchronized (var7) {
          L1: {
            L2: {
              if (((ib) this).field_o == null) {
                ((ib) this).field_k = var6;
                ((ib) this).field_o = var6;
                break L2;
              } else {
                ((ib) this).field_o.field_e = var6;
                ((ib) this).field_o = var6;
                break L2;
              }
            }
            this.notify();
            break L1;
          }
        }
        return var6;
    }

    final af a(java.net.URL param0, int param1) {
        if (param1 != 0) {
            Object var4 = null;
            bg discarded$0 = ib.a((String) null, (String) null, 88, 91);
        }
        return this.a(0, 0, 4, param1 + -15563, (Object) (Object) param0);
    }

    final boolean a(boolean param0) {
        if (!param0) {
            Object var3 = null;
            af discarded$0 = ((ib) this).a((String) null, 24, (Class) null);
        }
        if (!((ib) this).field_f) {
            return false;
        }
        if (!((ib) this).field_l) {
            return ((ib) this).field_e != null ? true : false;
        }
        return ((ib) this).field_x != null ? true : false;
    }

    public final void run() {
        try {
            Object var2 = null;
            Throwable var2_ref = null;
            int var2_int = 0;
            InterruptedException var3_ref_InterruptedException = null;
            uk var3_ref_uk = null;
            Exception var3_ref_Exception = null;
            bg var3_ref_bg = null;
            int var3 = 0;
            Throwable var4 = null;
            int var4_int = 0;
            String var4_ref = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            Object var8 = null;
            af var8_ref = null;
            Thread var9 = null;
            String var10 = null;
            String var11 = null;
            Object[] var12 = null;
            java.awt.Component var13 = null;
            java.awt.Frame var14 = null;
            java.awt.datatransfer.Clipboard var15 = null;
            java.awt.datatransfer.Clipboard var16 = null;
            Object[] var17 = null;
            Object[] var18 = null;
            int stackIn_84_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_83_0 = 0;
            int stackOut_82_0 = 0;
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
                    if (!((ib) this).field_q) {
                      if (((ib) this).field_k != null) {
                        L4: {
                          var8_ref = ((ib) this).field_k;
                          ((ib) this).field_k = ((ib) this).field_k.field_e;
                          if (null == ((ib) this).field_k) {
                            ((ib) this).field_o = null;
                            break L4;
                          } else {
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
                    var2_int = var8_ref.field_a;
                    if (var2_int != 1) {
                      if (var2_int != 22) {
                        if (var2_int != 2) {
                          if (var2_int == 4) {
                            if (~bb.b(-1) <= ~field_w) {
                              var8_ref.field_b = (Object) (Object) new DataInputStream(((java.net.URL) var8_ref.field_c).openStream());
                              break L8;
                            } else {
                              throw new IOException();
                            }
                          } else {
                            if (var2_int == 8) {
                              L9: {
                                var18 = (Object[]) var8_ref.field_c;
                                if (((ib) this).field_f) {
                                  if (null == ((Class) var18[0]).getClassLoader()) {
                                    throw new SecurityException();
                                  } else {
                                    break L9;
                                  }
                                } else {
                                  break L9;
                                }
                              }
                              var8_ref.field_b = (Object) (Object) ((Class) var18[0]).getDeclaredMethod((String) var18[1], (Class[]) var18[2]);
                              break L8;
                            } else {
                              if (var2_int == 9) {
                                L10: {
                                  var17 = (Object[]) var8_ref.field_c;
                                  if (!((ib) this).field_f) {
                                    break L10;
                                  } else {
                                    if (((Class) var17[0]).getClassLoader() == null) {
                                      throw new SecurityException();
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                var8_ref.field_b = (Object) (Object) ((Class) var17[0]).getDeclaredField((String) var17[1]);
                                break L8;
                              } else {
                                if (18 == var2_int) {
                                  var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8_ref.field_b = (Object) (Object) var16.getContents((Object) null);
                                  break L8;
                                } else {
                                  if (var2_int == 19) {
                                    var7 = (java.awt.datatransfer.Transferable) var8_ref.field_c;
                                    var15 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var15.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L8;
                                  } else {
                                    if (((ib) this).field_f) {
                                      if (3 != var2_int) {
                                        if (21 != var2_int) {
                                          if (5 == var2_int) {
                                            if (((ib) this).field_l) {
                                              var8_ref.field_b = (Object) (Object) ((ib) this).field_x.a(-16);
                                              break L8;
                                            } else {
                                              var8_ref.field_b = Class.forName("rj").getMethod("listmodes", new Class[0]).invoke(((ib) this).field_e, new Object[0]);
                                              break L8;
                                            }
                                          } else {
                                            if (6 == var2_int) {
                                              var14 = new java.awt.Frame("Jagex Full Screen");
                                              var8_ref.field_b = (Object) (Object) var14;
                                              var14.setResizable(false);
                                              if (((ib) this).field_l) {
                                                ((ib) this).field_x.a(var8_ref.field_f >> 16, 11468, var8_ref.field_g >>> 16, var14, 65535 & var8_ref.field_f, 65535 & var8_ref.field_g);
                                                break L8;
                                              } else {
                                                Object discarded$6 = Class.forName("rj").getMethod("enter", new Class[5]).invoke(((ib) this).field_e, new Object[5]);
                                                break L8;
                                              }
                                            } else {
                                              if (var2_int == 7) {
                                                if (!((ib) this).field_l) {
                                                  Object discarded$7 = Class.forName("rj").getMethod("exit", new Class[0]).invoke(((ib) this).field_e, new Object[0]);
                                                  break L8;
                                                } else {
                                                  ((ib) this).field_x.a(8, (java.awt.Frame) var8_ref.field_c);
                                                  break L8;
                                                }
                                              } else {
                                                if (var2_int != 12) {
                                                  if (13 != var2_int) {
                                                    L11: {
                                                      if (!((ib) this).field_f) {
                                                        break L11;
                                                      } else {
                                                        if (var2_int != 14) {
                                                          break L11;
                                                        } else {
                                                          var3 = var8_ref.field_g;
                                                          var4_int = var8_ref.field_f;
                                                          if (((ib) this).field_l) {
                                                            ((ib) this).field_m.a(var4_int, true, var3);
                                                            break L8;
                                                          } else {
                                                            Object discarded$8 = Class.forName("jl").getDeclaredMethod("movemouse", new Class[2]).invoke(((ib) this).field_d, new Object[2]);
                                                            break L8;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L12: {
                                                      if (!((ib) this).field_f) {
                                                        break L12;
                                                      } else {
                                                        if (15 == var2_int) {
                                                          L13: {
                                                            if (var8_ref.field_g == 0) {
                                                              stackOut_83_0 = 0;
                                                              stackIn_84_0 = stackOut_83_0;
                                                              break L13;
                                                            } else {
                                                              stackOut_82_0 = 1;
                                                              stackIn_84_0 = stackOut_82_0;
                                                              break L13;
                                                            }
                                                          }
                                                          var3 = stackIn_84_0;
                                                          var13 = (java.awt.Component) var8_ref.field_c;
                                                          if (((ib) this).field_l) {
                                                            ((ib) this).field_m.a(var3 != 0, var13, 54);
                                                            break L8;
                                                          } else {
                                                            Object discarded$9 = Class.forName("jl").getDeclaredMethod("showcursor", new Class[2]).invoke(((ib) this).field_d, new Object[2]);
                                                            break L8;
                                                          }
                                                        } else {
                                                          break L12;
                                                        }
                                                      }
                                                    }
                                                    L14: {
                                                      if (((ib) this).field_l) {
                                                        break L14;
                                                      } else {
                                                        if (var2_int == 17) {
                                                          var12 = (Object[]) var8_ref.field_c;
                                                          Object discarded$10 = Class.forName("jl").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((ib) this).field_d, new Object[5]);
                                                          break L8;
                                                        } else {
                                                          break L14;
                                                        }
                                                      }
                                                    }
                                                    if (var2_int == 16) {
                                                      try {
                                                        L15: {
                                                          if (field_s.startsWith("win")) {
                                                            L16: {
                                                              var11 = (String) var8_ref.field_c;
                                                              if (var11.startsWith("http://")) {
                                                                break L16;
                                                              } else {
                                                                if (!var11.startsWith("https://")) {
                                                                  throw ib.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  break L16;
                                                                }
                                                              }
                                                            }
                                                            var4_ref = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L17: while (true) {
                                                              if (~var5 <= ~var11.length()) {
                                                                Process discarded$11 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var11 + "\"");
                                                                var8_ref.field_b = null;
                                                                break L15;
                                                              } else {
                                                                if (-1 == var4_ref.indexOf((int) var11.charAt(var5))) {
                                                                  throw ib.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  var5++;
                                                                  continue L17;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            throw ib.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter1) {
                                                        decompiledCaughtException = decompiledCaughtParameter1;
                                                        var3_ref_Exception = (Exception) (Object) decompiledCaughtException;
                                                        var8_ref.field_b = (Object) (Object) var3_ref_Exception;
                                                        throw ib.<RuntimeException>$cfr$sneakyThrow(var3_ref_Exception);
                                                      }
                                                      break L8;
                                                    } else {
                                                      throw ib.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    }
                                                  } else {
                                                    var3_ref_bg = ib.a("", (String) var8_ref.field_c, 69, field_b);
                                                    var8_ref.field_b = (Object) (Object) var3_ref_bg;
                                                    break L8;
                                                  }
                                                } else {
                                                  var3_ref_bg = ib.a(field_n, (String) var8_ref.field_c, 104, field_b);
                                                  var8_ref.field_b = (Object) (Object) var3_ref_bg;
                                                  break L8;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          if (field_w > bb.b(-1)) {
                                            throw new IOException();
                                          } else {
                                            var8_ref.field_b = (Object) (Object) java.net.InetAddress.getByName((String) var8_ref.field_c).getAddress();
                                            break L8;
                                          }
                                        }
                                      } else {
                                        if (~field_w >= ~bb.b(-1)) {
                                          var10 = (var8_ref.field_g >> 24 & 255) + "." + (255 & var8_ref.field_g >> 16) + "." + ((var8_ref.field_g & 65493) >> 8) + "." + (var8_ref.field_g & 255);
                                          var8_ref.field_b = (Object) (Object) java.net.InetAddress.getByName(var10).getHostName();
                                          break L8;
                                        } else {
                                          throw new IOException();
                                        }
                                      }
                                    } else {
                                      throw ib.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    }
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var9 = new Thread((Runnable) var8_ref.field_c);
                          var9.setDaemon(true);
                          var9.start();
                          var9.setPriority(var8_ref.field_g);
                          var8_ref.field_b = (Object) (Object) var9;
                          break L8;
                        }
                      } else {
                        if (bb.b(-1) < field_w) {
                          throw new IOException();
                        } else {
                          try {
                            L18: {
                              var8_ref.field_b = (Object) (Object) lh.a(var8_ref.field_g, (String) var8_ref.field_c, -1).b(-64);
                              break L18;
                            }
                          } catch (java.lang.Exception decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref_uk = (uk) (Object) decompiledCaughtException;
                            var8_ref.field_b = (Object) (Object) var3_ref_uk.getMessage();
                            throw var3_ref_uk;
                          }
                          break L8;
                        }
                      }
                    } else {
                      if (field_w <= bb.b(-1)) {
                        var8_ref.field_b = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var8_ref.field_c), var8_ref.field_g);
                        break L8;
                      } else {
                        throw new IOException();
                      }
                    }
                  }
                  var8_ref.field_d = 1;
                  break L7;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                L19: {
                  var2_ref = decompiledCaughtException;
                  var8_ref.field_d = 2;
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

    final af a(java.awt.Frame param0, byte param1) {
        if (param1 != -95) {
            ((ib) this).field_r = null;
        }
        return this.a(0, 0, 7, -15563, (Object) (Object) param0);
    }

    final af a(int param0, int param1, int param2, int param3, boolean param4) {
        if (param4) {
            Object var7 = null;
            af discarded$0 = ((ib) this).a((java.awt.Frame) null, (byte) 11);
        }
        return this.a(param0 + (param1 << 16), (param3 << 16) + param2, 6, -15563, (Object) null);
    }

    final af a(int param0) {
        if (param0 != 2) {
            return null;
        }
        return this.a(0, 0, 5, -15563, (Object) null);
    }

    private final static bg a(String param0, String param1, int param2, int param3) {
        try {
            String var7_ref = null;
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            Object var7 = null;
            Exception var8 = null;
            bg var8_ref = null;
            bg stackIn_15_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            bg stackOut_14_0 = null;
            var7_ref = null;
            if (param2 >= 55) {
              L0: {
                if (param3 == 33) {
                  var4 = "jagex_" + param0 + "_preferences" + param1 + "_rc.dat";
                  break L0;
                } else {
                  if (param3 != 34) {
                    var4 = "jagex_" + param0 + "_preferences" + param1 + ".dat";
                    break L0;
                  } else {
                    var4 = "jagex_" + param0 + "_preferences" + param1 + "_wip.dat";
                    break L0;
                  }
                }
              }
              var5_array = new String[]{"c:/rscache/", "/rscache/", field_i, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
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
                      var8_ref = new bg(new File(var7_ref, var4), "rw", 10000L);
                      stackOut_14_0 = (bg) var8_ref;
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
              return null;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final af a(String param0, int param1, Class param2) {
        if (param1 != 9) {
            Object var5 = null;
            af discarded$0 = this.a(-70, -27, -21, 108, (Object) null);
        }
        return this.a(0, 0, 9, -15563, (Object) (Object) new Object[2]);
    }

    final af a(int param0, int param1, String param2) {
        if (param0 != 0) {
            return null;
        }
        return this.a(param2, 85, param1, false);
    }

    ib(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        cl var7 = null;
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
          ((ib) this).field_h = null;
          ((ib) this).field_l = false;
          ((ib) this).field_f = false;
          ((ib) this).field_a = null;
          ((ib) this).field_u = null;
          ((ib) this).field_k = null;
          ((ib) this).field_o = null;
          ((ib) this).field_q = false;
          field_j = "1.1";
          field_p = "Unknown";
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
        ((ib) this).field_f = stackIn_3_1 != 0;
        field_b = param0;
        field_n = param1;
        try {
          L1: {
            field_p = System.getProperty("java.vendor");
            field_j = System.getProperty("java.version");
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
          if (field_p.toLowerCase().indexOf("microsoft") == -1) {
            break L3;
          } else {
            ((ib) this).field_l = true;
            break L3;
          }
        }
        try {
          L4: {
            field_v = System.getProperty("os.name");
            break L4;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var5 = (Exception) (Object) decompiledCaughtException;
            field_v = "Unknown";
            break L5;
          }
        }
        field_s = field_v.toLowerCase();
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
              field_i = System.getProperty("user.home");
              if (null == field_i) {
                break L11;
              } else {
                field_i = field_i + "/";
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
          if (null == field_i) {
            field_i = "~/";
            break L13;
          } else {
            break L13;
          }
        }
        try {
          L14: {
            ((ib) this).field_t = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
          if (!((ib) this).field_l) {
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
                field_c = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
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
          me.a(field_n, field_b, -38);
          if (!((ib) this).field_f) {
            break L21;
          } else {
            ((ib) this).field_a = new bg(me.a(field_b, "random.dat", false, (String) null), "rw", 25L);
            ((ib) this).field_u = new bg(me.a("main_file_cache.dat2", 95), "rw", 314572800L);
            ((ib) this).field_h = new bg(me.a("main_file_cache.idx255", 126), "rw", 1048576L);
            ((ib) this).field_g = new bg[param2];
            var5_int = 0;
            L22: while (true) {
              if (param2 <= var5_int) {
                L23: {
                  if (((ib) this).field_l) {
                    try {
                      L24: {
                        Object discarded$7 = Class.forName("df").newInstance();
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
                      if (!((ib) this).field_l) {
                        ((ib) this).field_e = Class.forName("rj").newInstance();
                        break L27;
                      } else {
                        var7 = new cl();
                        ((ib) this).field_x = var7;
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
                      if (!((ib) this).field_l) {
                        ((ib) this).field_d = Class.forName("jl").newInstance();
                        break L30;
                      } else {
                        ((ib) this).field_m = new sc();
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
                ((ib) this).field_g[var5_int] = new bg(me.a("main_file_cache.idx" + var5_int, 37), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        ((ib) this).field_q = false;
        ((ib) this).field_r = new Thread((Runnable) this);
        ((ib) this).field_r.setPriority(10);
        ((ib) this).field_r.setDaemon(true);
        ((ib) this).field_r.start();
    }

    final af a(byte param0, int param1, Runnable param2) {
        if (param0 != -28) {
            field_s = null;
        }
        return this.a(0, param1, 2, -15563, (Object) (Object) param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
