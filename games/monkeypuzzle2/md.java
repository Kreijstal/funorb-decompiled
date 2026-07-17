/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class md implements Runnable {
    private static volatile long field_s;
    private static int field_a;
    pl field_t;
    pl field_x;
    private eh field_g;
    boolean field_q;
    private static String field_w;
    private boolean field_o;
    private static String field_d;
    pl[] field_e;
    private static String field_j;
    private ic field_u;
    static String field_f;
    static String field_l;
    static String field_m;
    private Thread field_p;
    private pk field_k;
    static java.lang.reflect.Method field_h;
    private ic field_r;
    private boolean field_c;
    private Object field_v;
    pl field_i;
    java.awt.EventQueue field_b;
    private Object field_n;

    final ic b(byte param0) {
        if (param0 > -10) {
            ((md) this).field_v = null;
        }
        return this.a(0, 0, 5, (Object) null, (byte) 116);
    }

    final boolean a(int param0) {
        if (param0 != 2) {
            Object var3 = null;
            ic discarded$0 = this.a(76, -63, -117, (Object) null, (byte) 11);
        }
        if (!(((md) this).field_q)) {
            return false;
        }
        if (!((md) this).field_o) {
            return null != ((md) this).field_v ? true : false;
        }
        return null != ((md) this).field_k ? true : false;
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
                ((md) this).field_c = true;
                this.notifyAll();
                break L0;
              }
            }
            try {
              L1: {
                L2: {
                  if (param0 == -84) {
                    break L2;
                  } else {
                    ((md) this).run();
                    break L2;
                  }
                }
                ((md) this).field_p.join();
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L3: {
                var2_ref = (InterruptedException) (Object) decompiledCaughtException;
                break L3;
              }
            }
            L4: {
              if (((md) this).field_t == null) {
                break L4;
              } else {
                {
                  L5: {
                    ((md) this).field_t.a(19808);
                    break L5;
                  }
                }
                break L4;
              }
            }
            L7: {
              if (((md) this).field_i != null) {
                {
                  L8: {
                    ((md) this).field_i.a(param0 + 19892);
                    break L8;
                  }
                }
                break L7;
              } else {
                break L7;
              }
            }
            L10: {
              if (null == ((md) this).field_e) {
                break L10;
              } else {
                var2_int = 0;
                L11: while (true) {
                  if (((md) this).field_e.length <= var2_int) {
                    break L10;
                  } else {
                    if (((md) this).field_e[var2_int] != null) {
                      {
                        L12: {
                          ((md) this).field_e[var2_int].a(19808);
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
              if (((md) this).field_x == null) {
                break L14;
              } else {
                {
                  L15: {
                    ((md) this).field_x.a(19808);
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

    private final ic a(int param0, int param1, int param2, Object param3, byte param4) {
        ic var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          var6 = new ic();
          var6.field_c = param0;
          var6.field_e = param3;
          if (param4 == 116) {
            break L0;
          } else {
            ic discarded$3 = ((md) this).b((byte) 104);
            break L0;
          }
        }
        var6.field_d = param1;
        var6.field_a = param2;
        var7 = this;
        synchronized (var7) {
          L1: {
            L2: {
              if (((md) this).field_u != null) {
                ((md) this).field_u.field_f = var6;
                ((md) this).field_u = var6;
                break L2;
              } else {
                ((md) this).field_r = var6;
                ((md) this).field_u = var6;
                break L2;
              }
            }
            this.notify();
            break L1;
          }
        }
        return var6;
    }

    private final static pl a(int param0, String param1, String param2, byte param3) {
        try {
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            pl var8_ref = null;
            pl stackIn_12_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            pl stackOut_11_0 = null;
            L0: {
              if (param0 == 33) {
                var4 = "jagex_" + param1 + "_preferences" + param2 + "_rc.dat";
                break L0;
              } else {
                if (param0 == 34) {
                  var4 = "jagex_" + param1 + "_preferences" + param2 + "_wip.dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param1 + "_preferences" + param2 + ".dat";
                  break L0;
                }
              }
            }
            var5 = new String[]{"c:/rscache/", "/rscache/", field_d, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            var6 = 0;
            L1: while (true) {
              if (~var5.length < ~var6) {
                L2: {
                  L3: {
                    var7 = var5[var6];
                    if (var7.length() <= 0) {
                      break L3;
                    } else {
                      if (!new File(var7).exists()) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  try {
                    L4: {
                      var8_ref = new pl(new File(var7, var4), "rw", 10000L);
                      stackOut_11_0 = (pl) var8_ref;
                      stackIn_12_0 = stackOut_11_0;
                      decompiledRegionSelector0 = 0;
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L5: {
                      var8 = (Exception) (Object) decompiledCaughtException;
                      decompiledRegionSelector0 = 1;
                      break L5;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    return stackIn_12_0;
                  } else {
                    break L2;
                  }
                }
                var6++;
                continue L1;
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

    final ic a(int param0, Class[] param1, Class param2, String param3) {
        int var5 = -103 / ((param0 - 62) / 32);
        return this.a(0, 0, 8, (Object) (Object) new Object[3], (byte) 116);
    }

    private final ic a(byte param0, String param1, boolean param2, int param3) {
        if (param0 != 118) {
            return null;
        }
        return this.a(param3, 0, param2 ? 22 : 1, (Object) (Object) param1, (byte) 116);
    }

    public final void run() {
        try {
            Object var2 = null;
            Throwable var2_ref = null;
            int var2_int = 0;
            InterruptedException var3_ref_InterruptedException = null;
            pg var3_ref_pg = null;
            Exception var3_ref_Exception = null;
            pl var3_ref_pl = null;
            int var3 = 0;
            Throwable var4 = null;
            int var4_int = 0;
            String var4_ref = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            Object var8 = null;
            ic var8_ref = null;
            Object[] var9 = null;
            java.awt.datatransfer.Clipboard var10 = null;
            java.awt.datatransfer.Clipboard var11 = null;
            java.awt.Frame var12 = null;
            String var13 = null;
            Object[] var14 = null;
            java.awt.Component var15 = null;
            String var16 = null;
            Object[] var17 = null;
            Thread var18 = null;
            int stackIn_83_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_82_0 = 0;
            int stackOut_81_0 = 0;
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
                    if (((md) this).field_c) {
                      return;
                    } else {
                      if (null == ((md) this).field_r) {
                        {
                          L4: {
                            this.wait();
                            break L4;
                          }
                        }
                        continue L3;
                      } else {
                        L6: {
                          var8_ref = ((md) this).field_r;
                          ((md) this).field_r = ((md) this).field_r.field_f;
                          if (null != ((md) this).field_r) {
                            break L6;
                          } else {
                            ((md) this).field_u = null;
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
                      if (pf.a(0) >= field_s) {
                        var8_ref.field_b = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var8_ref.field_e), var8_ref.field_c);
                        break L8;
                      } else {
                        throw new IOException();
                      }
                    } else {
                      if (var2_int != 22) {
                        if (2 == var2_int) {
                          var18 = new Thread((Runnable) var8_ref.field_e);
                          var18.setDaemon(true);
                          var18.start();
                          var18.setPriority(var8_ref.field_c);
                          var8_ref.field_b = (Object) (Object) var18;
                          break L8;
                        } else {
                          if (var2_int == 4) {
                            if (~field_s >= ~pf.a(0)) {
                              var8_ref.field_b = (Object) (Object) new DataInputStream(((java.net.URL) var8_ref.field_e).openStream());
                              break L8;
                            } else {
                              throw new IOException();
                            }
                          } else {
                            if (var2_int == 8) {
                              L9: {
                                var17 = (Object[]) var8_ref.field_e;
                                if (((md) this).field_q) {
                                  if (((Class) var17[0]).getClassLoader() == null) {
                                    throw new SecurityException();
                                  } else {
                                    break L9;
                                  }
                                } else {
                                  break L9;
                                }
                              }
                              var8_ref.field_b = (Object) (Object) ((Class) var17[0]).getDeclaredMethod((String) var17[1], (Class[]) var17[2]);
                              break L8;
                            } else {
                              if (var2_int != 9) {
                                if (var2_int != 18) {
                                  if (var2_int != 19) {
                                    if (!((md) this).field_q) {
                                      throw md.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    } else {
                                      if (3 == var2_int) {
                                        if (pf.a(0) < field_s) {
                                          throw new IOException();
                                        } else {
                                          var16 = (255 & var8_ref.field_c >> 24) + "." + (255 & var8_ref.field_c >> 16) + "." + ((var8_ref.field_c & 65491) >> 8) + "." + (255 & var8_ref.field_c);
                                          var8_ref.field_b = (Object) (Object) java.net.InetAddress.getByName(var16).getHostName();
                                          break L8;
                                        }
                                      } else {
                                        if (var2_int == 21) {
                                          if (~pf.a(0) <= ~field_s) {
                                            var8_ref.field_b = (Object) (Object) java.net.InetAddress.getByName((String) var8_ref.field_e).getAddress();
                                            break L8;
                                          } else {
                                            throw new IOException();
                                          }
                                        } else {
                                          if (var2_int == 5) {
                                            if (((md) this).field_o) {
                                              var8_ref.field_b = (Object) (Object) ((md) this).field_k.a((byte) 88);
                                              break L8;
                                            } else {
                                              var8_ref.field_b = Class.forName("se").getMethod("listmodes", new Class[0]).invoke(((md) this).field_v, new Object[0]);
                                              break L8;
                                            }
                                          } else {
                                            if (var2_int != 6) {
                                              if (7 != var2_int) {
                                                if (var2_int != 12) {
                                                  if (var2_int != 13) {
                                                    L10: {
                                                      if (!((md) this).field_q) {
                                                        break L10;
                                                      } else {
                                                        if (var2_int != 14) {
                                                          break L10;
                                                        } else {
                                                          var3 = var8_ref.field_c;
                                                          var4_int = var8_ref.field_d;
                                                          if (((md) this).field_o) {
                                                            ((md) this).field_g.a((byte) 121, var3, var4_int);
                                                            break L8;
                                                          } else {
                                                            Object discarded$6 = Class.forName("bm").getDeclaredMethod("movemouse", new Class[2]).invoke(((md) this).field_n, new Object[2]);
                                                            break L8;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L11: {
                                                      if (!((md) this).field_q) {
                                                        break L11;
                                                      } else {
                                                        if (var2_int == 15) {
                                                          L12: {
                                                            if (var8_ref.field_c == 0) {
                                                              stackOut_82_0 = 0;
                                                              stackIn_83_0 = stackOut_82_0;
                                                              break L12;
                                                            } else {
                                                              stackOut_81_0 = 1;
                                                              stackIn_83_0 = stackOut_81_0;
                                                              break L12;
                                                            }
                                                          }
                                                          var3 = stackIn_83_0;
                                                          var15 = (java.awt.Component) var8_ref.field_e;
                                                          if (!((md) this).field_o) {
                                                            Object discarded$7 = Class.forName("bm").getDeclaredMethod("showcursor", new Class[2]).invoke(((md) this).field_n, new Object[2]);
                                                            break L8;
                                                          } else {
                                                            ((md) this).field_g.a(var3 != 0, (byte) 90, var15);
                                                            break L8;
                                                          }
                                                        } else {
                                                          break L11;
                                                        }
                                                      }
                                                    }
                                                    L13: {
                                                      if (((md) this).field_o) {
                                                        break L13;
                                                      } else {
                                                        if (17 == var2_int) {
                                                          var14 = (Object[]) var8_ref.field_e;
                                                          Object discarded$8 = Class.forName("bm").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((md) this).field_n, new Object[5]);
                                                          break L8;
                                                        } else {
                                                          break L13;
                                                        }
                                                      }
                                                    }
                                                    if (16 != var2_int) {
                                                      throw md.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    } else {
                                                      try {
                                                        L14: {
                                                          if (field_f.startsWith("win")) {
                                                            L15: {
                                                              var13 = (String) var8_ref.field_e;
                                                              if (var13.startsWith("http://")) {
                                                                break L15;
                                                              } else {
                                                                if (var13.startsWith("https://")) {
                                                                  break L15;
                                                                } else {
                                                                  throw md.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                            var4_ref = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L16: while (true) {
                                                              if (~var5 <= ~var13.length()) {
                                                                Process discarded$9 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var13 + "\"");
                                                                var8_ref.field_b = null;
                                                                break L14;
                                                              } else {
                                                                if (var4_ref.indexOf((int) var13.charAt(var5)) != -1) {
                                                                  var5++;
                                                                  continue L16;
                                                                } else {
                                                                  throw md.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            throw md.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter1) {
                                                        decompiledCaughtException = decompiledCaughtParameter1;
                                                        var3_ref_Exception = (Exception) (Object) decompiledCaughtException;
                                                        var8_ref.field_b = (Object) (Object) var3_ref_Exception;
                                                        throw md.<RuntimeException>$cfr$sneakyThrow(var3_ref_Exception);
                                                      }
                                                      break L8;
                                                    }
                                                  } else {
                                                    var3_ref_pl = md.a(field_a, "", (String) var8_ref.field_e, (byte) 84);
                                                    var8_ref.field_b = (Object) (Object) var3_ref_pl;
                                                    break L8;
                                                  }
                                                } else {
                                                  var3_ref_pl = md.a(field_a, field_j, (String) var8_ref.field_e, (byte) 84);
                                                  var8_ref.field_b = (Object) (Object) var3_ref_pl;
                                                  break L8;
                                                }
                                              } else {
                                                if (!((md) this).field_o) {
                                                  Object discarded$10 = Class.forName("se").getMethod("exit", new Class[0]).invoke(((md) this).field_v, new Object[0]);
                                                  break L8;
                                                } else {
                                                  ((md) this).field_k.a(106, (java.awt.Frame) var8_ref.field_e);
                                                  break L8;
                                                }
                                              }
                                            } else {
                                              var12 = new java.awt.Frame("Jagex Full Screen");
                                              var8_ref.field_b = (Object) (Object) var12;
                                              var12.setResizable(false);
                                              if (!((md) this).field_o) {
                                                Object discarded$11 = Class.forName("se").getMethod("enter", new Class[5]).invoke(((md) this).field_v, new Object[5]);
                                                break L8;
                                              } else {
                                                ((md) this).field_k.a(var8_ref.field_d & 65535, 65535 & var8_ref.field_c, var8_ref.field_d >> 16, var8_ref.field_c >>> 16, -16, var12);
                                                break L8;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    var7 = (java.awt.datatransfer.Transferable) var8_ref.field_e;
                                    var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var11.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L8;
                                  }
                                } else {
                                  var10 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8_ref.field_b = (Object) (Object) var10.getContents((Object) null);
                                  break L8;
                                }
                              } else {
                                L17: {
                                  var9 = (Object[]) var8_ref.field_e;
                                  if (((md) this).field_q) {
                                    if (null == ((Class) var9[0]).getClassLoader()) {
                                      throw new SecurityException();
                                    } else {
                                      break L17;
                                    }
                                  } else {
                                    break L17;
                                  }
                                }
                                var8_ref.field_b = (Object) (Object) ((Class) var9[0]).getDeclaredField((String) var9[1]);
                                break L8;
                              }
                            }
                          }
                        }
                      } else {
                        if (~pf.a(0) <= ~field_s) {
                          try {
                            L18: {
                              var8_ref.field_b = (Object) (Object) bf.a((String) var8_ref.field_e, (byte) -84, var8_ref.field_c).a(0);
                              break L18;
                            }
                          } catch (java.lang.Exception decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref_pg = (pg) (Object) decompiledCaughtException;
                            var8_ref.field_b = (Object) (Object) var3_ref_pg.getMessage();
                            throw var3_ref_pg;
                          }
                          break L8;
                        } else {
                          throw new IOException();
                        }
                      }
                    }
                  }
                  var8_ref.field_g = 1;
                  break L7;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                L19: {
                  var2_ref = decompiledCaughtException;
                  var8_ref.field_g = 2;
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

    final ic a(boolean param0, Class param1, String param2) {
        if (param0) {
            ic discarded$0 = ((md) this).b((byte) -62);
        }
        return this.a(0, 0, 9, (Object) (Object) new Object[2], (byte) 116);
    }

    final ic a(String param0, int param1, int param2) {
        if (param1 != 0) {
            ((md) this).a((byte) 110);
        }
        return this.a((byte) 118, param0, false, param2);
    }

    final ic a(java.awt.Frame param0, int param1) {
        int var3 = 18 % ((-50 - param1) / 57);
        return this.a(0, 0, 7, (Object) (Object) param0, (byte) 116);
    }

    final ic a(byte param0, java.net.URL param1) {
        if (param0 <= 96) {
            ((md) this).field_b = null;
        }
        return this.a(0, 0, 4, (Object) (Object) param1, (byte) 116);
    }

    final ic a(Runnable param0, int param1, int param2) {
        if (param2 != 0) {
            ((md) this).field_v = null;
        }
        return this.a(param1, 0, 2, (Object) (Object) param0, (byte) 116);
    }

    final ic a(int param0, int param1, boolean param2, int param3, int param4) {
        if (param2) {
            Object var7 = null;
            ic discarded$0 = ((md) this).a(111, (Class[]) null, (Class) null, (String) null);
        }
        return this.a(param1 + (param0 << 16), param3 + (param4 << 16), 6, (Object) null, (byte) 116);
    }

    md(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        pk var7 = null;
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
          ((md) this).field_x = null;
          ((md) this).field_u = null;
          ((md) this).field_q = false;
          ((md) this).field_t = null;
          ((md) this).field_r = null;
          ((md) this).field_o = false;
          ((md) this).field_c = false;
          ((md) this).field_i = null;
          field_a = param0;
          field_m = "1.1";
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
        ((md) this).field_q = stackIn_3_1 != 0;
        try {
          L1: {
            field_l = System.getProperty("java.vendor");
            field_m = System.getProperty("java.version");
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
          if (field_l.toLowerCase().indexOf("microsoft") != -1) {
            ((md) this).field_o = true;
            break L3;
          } else {
            break L3;
          }
        }
        try {
          L4: {
            field_w = System.getProperty("os.name");
            break L4;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var5 = (Exception) (Object) decompiledCaughtException;
            field_w = "Unknown";
            break L5;
          }
        }
        field_f = field_w.toLowerCase();
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
              field_d = System.getProperty("user.home");
              if (field_d == null) {
                break L11;
              } else {
                field_d = field_d + "/";
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
          if (field_d == null) {
            field_d = "~/";
            break L13;
          } else {
            break L13;
          }
        }
        try {
          L14: {
            ((md) this).field_b = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
          if (!((md) this).field_o) {
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
          } else {
            break L16;
          }
        }
        L21: {
          nk.a(field_a, 0, field_j);
          if (!((md) this).field_q) {
            break L21;
          } else {
            ((md) this).field_x = new pl(nk.a(-1, "random.dat", (String) null, field_a), "rw", 25L);
            ((md) this).field_t = new pl(nk.a("main_file_cache.dat2", -2), "rw", 314572800L);
            ((md) this).field_i = new pl(nk.a("main_file_cache.idx255", -2), "rw", 1048576L);
            ((md) this).field_e = new pl[param2];
            var5_int = 0;
            L22: while (true) {
              if (var5_int >= param2) {
                L23: {
                  if (((md) this).field_o) {
                    try {
                      L24: {
                        Object discarded$7 = Class.forName("oc").newInstance();
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
                      if (((md) this).field_o) {
                        var7 = new pk();
                        ((md) this).field_k = var7;
                        break L27;
                      } else {
                        ((md) this).field_v = Class.forName("se").newInstance();
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
                      if (((md) this).field_o) {
                        ((md) this).field_g = new eh();
                        break L30;
                      } else {
                        ((md) this).field_n = Class.forName("bm").newInstance();
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
                ((md) this).field_e[var5_int] = new pl(nk.a("main_file_cache.idx" + var5_int, -2), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        ((md) this).field_c = false;
        ((md) this).field_p = new Thread((Runnable) this);
        ((md) this).field_p.setPriority(10);
        ((md) this).field_p.setDaemon(true);
        ((md) this).field_p.start();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
