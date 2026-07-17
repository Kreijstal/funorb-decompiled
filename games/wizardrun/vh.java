/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vh implements Runnable {
    static String field_k;
    private static String field_l;
    static java.lang.reflect.Method field_q;
    private al field_x;
    ri field_i;
    private boolean field_j;
    ri field_m;
    private Object field_t;
    java.awt.EventQueue field_a;
    private static volatile long field_d;
    private static int field_w;
    static String field_p;
    private Thread field_e;
    boolean field_s;
    private static String field_v;
    private jh field_r;
    private Object field_h;
    private ba field_u;
    ri[] field_f;
    private static String field_n;
    ri field_c;
    private jh field_o;
    private boolean field_g;
    static String field_b;

    public final void run() {
        try {
            Object var2 = null;
            Throwable var2_ref = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            hf var3_ref = null;
            Exception var3_ref2 = null;
            ri var3_ref3 = null;
            int var3_int = 0;
            Throwable var4_ref_Throwable = null;
            int var4 = 0;
            String var4_ref_String = null;
            int var5 = 0;
            Throwable var6 = null;
            String var7 = null;
            java.awt.datatransfer.Transferable var8 = null;
            Object var9 = null;
            jh var9_ref = null;
            Object[] var10 = null;
            java.awt.datatransfer.Clipboard var11 = null;
            Object[] var12 = null;
            java.awt.Component var13 = null;
            java.awt.Frame var14 = null;
            String var15 = null;
            java.awt.datatransfer.Clipboard var16 = null;
            Object[] var17 = null;
            Thread var18 = null;
            int stackIn_70_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_69_0 = 0;
            int stackOut_68_0 = 0;
            L0: while (true) {
              synchronized (var2) {
                L1: {
                  ((Object) (Object) var9_ref).notify();
                  var2 = this;
                  break L1;
                }
              }
              synchronized (var2) {
                L2: {
                  L3: while (true) {
                    if (!((vh) this).field_g) {
                      if (((vh) this).field_o != null) {
                        L4: {
                          var9_ref = ((vh) this).field_o;
                          ((vh) this).field_o = ((vh) this).field_o.field_c;
                          if (((vh) this).field_o != null) {
                            break L4;
                          } else {
                            ((vh) this).field_r = null;
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
                    var2_int = var9_ref.field_b;
                    if (var2_int == 1) {
                      if (d.a((byte) 21) < field_d) {
                        throw new IOException();
                      } else {
                        var9_ref.field_e = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var9_ref.field_g), var9_ref.field_d);
                        break L8;
                      }
                    } else {
                      if (var2_int != 22) {
                        if (var2_int == 2) {
                          var18 = new Thread((Runnable) var9_ref.field_g);
                          var18.setDaemon(true);
                          var18.start();
                          var18.setPriority(var9_ref.field_d);
                          var9_ref.field_e = (Object) (Object) var18;
                          break L8;
                        } else {
                          if (4 == var2_int) {
                            if (d.a((byte) 56) >= field_d) {
                              var9_ref.field_e = (Object) (Object) new DataInputStream(((java.net.URL) var9_ref.field_g).openStream());
                              break L8;
                            } else {
                              throw new IOException();
                            }
                          } else {
                            if (var2_int != 8) {
                              if (var2_int == 9) {
                                L9: {
                                  var17 = (Object[]) var9_ref.field_g;
                                  if (((vh) this).field_s) {
                                    if (((Class) var17[0]).getClassLoader() == null) {
                                      throw new SecurityException();
                                    } else {
                                      break L9;
                                    }
                                  } else {
                                    break L9;
                                  }
                                }
                                var9_ref.field_e = (Object) (Object) ((Class) var17[0]).getDeclaredField((String) var17[1]);
                                break L8;
                              } else {
                                if (18 != var2_int) {
                                  if (var2_int == 19) {
                                    var8 = (java.awt.datatransfer.Transferable) var9_ref.field_g;
                                    var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var16.setContents(var8, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L8;
                                  } else {
                                    if (!((vh) this).field_s) {
                                      throw vh.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    } else {
                                      if (var2_int == 3) {
                                        if (~d.a((byte) 25) <= ~field_d) {
                                          var15 = (var9_ref.field_d >> 24 & 255) + "." + (255 & var9_ref.field_d >> 16) + "." + ((65409 & var9_ref.field_d) >> 8) + "." + (255 & var9_ref.field_d);
                                          var9_ref.field_e = (Object) (Object) java.net.InetAddress.getByName(var15).getHostName();
                                          break L8;
                                        } else {
                                          throw new IOException();
                                        }
                                      } else {
                                        if (var2_int == 21) {
                                          if (d.a((byte) 84) >= field_d) {
                                            var9_ref.field_e = (Object) (Object) java.net.InetAddress.getByName((String) var9_ref.field_g).getAddress();
                                            break L8;
                                          } else {
                                            throw new IOException();
                                          }
                                        } else {
                                          if (var2_int == 5) {
                                            if (((vh) this).field_j) {
                                              var9_ref.field_e = (Object) (Object) ((vh) this).field_u.a(true);
                                              break L8;
                                            } else {
                                              var9_ref.field_e = Class.forName("bj").getMethod("listmodes", new Class[0]).invoke(((vh) this).field_t, new Object[0]);
                                              break L8;
                                            }
                                          } else {
                                            if (6 == var2_int) {
                                              var14 = new java.awt.Frame("Jagex Full Screen");
                                              var9_ref.field_e = (Object) (Object) var14;
                                              var14.setResizable(false);
                                              if (!((vh) this).field_j) {
                                                Object discarded$6 = Class.forName("bj").getMethod("enter", new Class[5]).invoke(((vh) this).field_t, new Object[5]);
                                                break L8;
                                              } else {
                                                ((vh) this).field_u.a(var9_ref.field_f >> 16, (byte) 122, var9_ref.field_d >>> 16, 65535 & var9_ref.field_d, var9_ref.field_f & 65535, var14);
                                                break L8;
                                              }
                                            } else {
                                              if (7 == var2_int) {
                                                if (((vh) this).field_j) {
                                                  ((vh) this).field_u.a(-2147483648, (java.awt.Frame) var9_ref.field_g);
                                                  break L8;
                                                } else {
                                                  Object discarded$7 = Class.forName("bj").getMethod("exit", new Class[0]).invoke(((vh) this).field_t, new Object[0]);
                                                  break L8;
                                                }
                                              } else {
                                                if (var2_int == 12) {
                                                  var3_ref3 = vh.a(0, field_w, (String) var9_ref.field_g, field_v);
                                                  var9_ref.field_e = (Object) (Object) var3_ref3;
                                                  break L8;
                                                } else {
                                                  if (13 == var2_int) {
                                                    var3_ref3 = vh.a(0, field_w, (String) var9_ref.field_g, "");
                                                    var9_ref.field_e = (Object) (Object) var3_ref3;
                                                    break L8;
                                                  } else {
                                                    L10: {
                                                      if (!((vh) this).field_s) {
                                                        break L10;
                                                      } else {
                                                        if (var2_int == 14) {
                                                          var3_int = var9_ref.field_d;
                                                          var4 = var9_ref.field_f;
                                                          if (((vh) this).field_j) {
                                                            ((vh) this).field_x.a(var3_int, var4, (byte) 116);
                                                            break L8;
                                                          } else {
                                                            Object discarded$8 = Class.forName("ak").getDeclaredMethod("movemouse", new Class[2]).invoke(((vh) this).field_h, new Object[2]);
                                                            break L8;
                                                          }
                                                        } else {
                                                          break L10;
                                                        }
                                                      }
                                                    }
                                                    L11: {
                                                      if (!((vh) this).field_s) {
                                                        break L11;
                                                      } else {
                                                        if (15 == var2_int) {
                                                          L12: {
                                                            if (0 == var9_ref.field_d) {
                                                              stackOut_69_0 = 0;
                                                              stackIn_70_0 = stackOut_69_0;
                                                              break L12;
                                                            } else {
                                                              stackOut_68_0 = 1;
                                                              stackIn_70_0 = stackOut_68_0;
                                                              break L12;
                                                            }
                                                          }
                                                          var3_int = stackIn_70_0;
                                                          var13 = (java.awt.Component) var9_ref.field_g;
                                                          if (!((vh) this).field_j) {
                                                            Object discarded$9 = Class.forName("ak").getDeclaredMethod("showcursor", new Class[2]).invoke(((vh) this).field_h, new Object[2]);
                                                            break L8;
                                                          } else {
                                                            ((vh) this).field_x.a(0, var3_int != 0, var13);
                                                            break L8;
                                                          }
                                                        } else {
                                                          break L11;
                                                        }
                                                      }
                                                    }
                                                    L13: {
                                                      if (((vh) this).field_j) {
                                                        break L13;
                                                      } else {
                                                        if (var2_int != 17) {
                                                          break L13;
                                                        } else {
                                                          var12 = (Object[]) var9_ref.field_g;
                                                          Object discarded$10 = Class.forName("ak").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((vh) this).field_h, new Object[5]);
                                                          break L8;
                                                        }
                                                      }
                                                    }
                                                    if (var2_int != 16) {
                                                      throw vh.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    } else {
                                                      try {
                                                        L14: {
                                                          if (!field_k.startsWith("win")) {
                                                            throw vh.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          } else {
                                                            L15: {
                                                              var7 = (String) var9_ref.field_g;
                                                              if (var7.startsWith("http://")) {
                                                                break L15;
                                                              } else {
                                                                if (var7.startsWith("https://")) {
                                                                  break L15;
                                                                } else {
                                                                  throw vh.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L16: while (true) {
                                                              if (var7.length() <= var5) {
                                                                Process discarded$11 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var7 + "\"");
                                                                var9_ref.field_e = null;
                                                                break L14;
                                                              } else {
                                                                if (var4_ref_String.indexOf((int) var7.charAt(var5)) != -1) {
                                                                  var5++;
                                                                  continue L16;
                                                                } else {
                                                                  throw vh.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter1) {
                                                        decompiledCaughtException = decompiledCaughtParameter1;
                                                        var3_ref2 = (Exception) (Object) decompiledCaughtException;
                                                        var9_ref.field_e = (Object) (Object) var3_ref2;
                                                        throw vh.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                                                      }
                                                      break L8;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var9_ref.field_e = (Object) (Object) var11.getContents((Object) null);
                                  break L8;
                                }
                              }
                            } else {
                              L17: {
                                var10 = (Object[]) var9_ref.field_g;
                                if (((vh) this).field_s) {
                                  if (null != ((Class) var10[0]).getClassLoader()) {
                                    break L17;
                                  } else {
                                    throw new SecurityException();
                                  }
                                } else {
                                  break L17;
                                }
                              }
                              var9_ref.field_e = (Object) (Object) ((Class) var10[0]).getDeclaredMethod((String) var10[1], (Class[]) var10[2]);
                              break L8;
                            }
                          }
                        }
                      } else {
                        if (d.a((byte) 50) >= field_d) {
                          try {
                            L18: {
                              var9_ref.field_e = (Object) (Object) mj.a((String) var9_ref.field_g, var9_ref.field_d, -1).a((byte) -128);
                              break L18;
                            }
                          } catch (java.lang.Exception decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref = (hf) (Object) decompiledCaughtException;
                            var9_ref.field_e = (Object) (Object) var3_ref.getMessage();
                            throw var3_ref;
                          }
                          break L8;
                        } else {
                          throw new IOException();
                        }
                      }
                    }
                  }
                  var9_ref.field_a = 1;
                  break L7;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                L19: {
                  var2_ref = decompiledCaughtException;
                  var9_ref.field_a = 2;
                  break L19;
                }
              }
              var2 = (Object) (Object) var9_ref;
              continue L0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final jh a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 < 93) {
            return null;
        }
        return this.a(false, param2 + (param0 << 16), (Object) null, param4 + (param3 << 16), 6);
    }

    final jh a(boolean param0) {
        if (param0) {
            field_w = -25;
        }
        return this.a(false, 0, (Object) null, 0, 5);
    }

    private final static ri a(int param0, int param1, String param2, String param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            ri var8_ref = null;
            ri stackIn_12_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            ri stackOut_11_0 = null;
            L0: {
              if (param1 != 33) {
                if (34 == param1) {
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
            var5_array = new String[]{"c:/rscache/", "/rscache/", field_n, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            var6 = param0;
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
                    var8_ref = new ri(new File(var7, var4), "rw", 10000L);
                    stackOut_11_0 = (ri) var8_ref;
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

    private final jh a(int param0, String param1, boolean param2, byte param3) {
        if (param3 < 74) {
            field_b = null;
        }
        return this.a(false, 0, (Object) (Object) param1, param0, !param2 ? 1 : 22);
    }

    final jh a(byte param0, Runnable param1, int param2) {
        if (param0 > -47) {
            return null;
        }
        return this.a(false, 0, (Object) (Object) param1, param2, 2);
    }

    final jh a(java.net.URL param0, int param1) {
        if (param1 < 119) {
            ((vh) this).field_m = null;
        }
        return this.a(false, 0, (Object) (Object) param0, 0, 4);
    }

    final jh a(int param0, Class param1, String param2) {
        if (param0 != -8024) {
            Object var5 = null;
            jh discarded$0 = ((vh) this).a((String) null, (Class[]) null, (Class) null, -89);
        }
        return this.a(false, 0, (Object) (Object) new Object[2], 0, 9);
    }

    final jh a(String param0, Class[] param1, Class param2, int param3) {
        if (param3 != 3617) {
            field_k = null;
        }
        return this.a(false, 0, (Object) (Object) new Object[3], 0, 8);
    }

    final jh a(String param0, int param1, byte param2) {
        if (param2 != -20) {
            return null;
        }
        return this.a(param1, param0, false, (byte) 85);
    }

    final jh a(int param0, java.awt.Frame param1) {
        if (param0 != 7) {
            Object var4 = null;
            jh discarded$0 = this.a(69, (String) null, true, (byte) 10);
        }
        return this.a(false, 0, (Object) (Object) param1, 0, 7);
    }

    final boolean a(int param0) {
        if (param0 != 169978736) {
            return false;
        }
        if (!((vh) this).field_s) {
            return false;
        }
        if (!((vh) this).field_j) {
            return ((vh) this).field_t != null ? true : false;
        }
        return null != ((vh) this).field_u ? true : false;
    }

    final void b(int param0) {
        try {
            Object var2 = null;
            InterruptedException var2_ref = null;
            IOException var2_ref2 = null;
            int var2_int = 0;
            Throwable var3 = null;
            IOException var3_ref = null;
            Object var4 = null;
            Throwable decompiledCaughtException = null;
            var2 = this;
            synchronized (var2) {
              L0: {
                ((vh) this).field_g = true;
                this.notifyAll();
                break L0;
              }
            }
            try {
              L1: {
                L2: {
                  if (param0 == -3) {
                    break L2;
                  } else {
                    var4 = null;
                    jh discarded$1 = ((vh) this).a((java.net.URL) null, 108);
                    break L2;
                  }
                }
                ((vh) this).field_e.join();
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
              if (null != ((vh) this).field_m) {
                {
                  L5: {
                    ((vh) this).field_m.a(-1);
                    break L5;
                  }
                }
                break L4;
              } else {
                break L4;
              }
            }
            L7: {
              if (null != ((vh) this).field_i) {
                {
                  L8: {
                    ((vh) this).field_i.a(-1);
                    break L8;
                  }
                }
                break L7;
              } else {
                break L7;
              }
            }
            L10: {
              if (((vh) this).field_f == null) {
                break L10;
              } else {
                var2_int = 0;
                L11: while (true) {
                  if (var2_int >= ((vh) this).field_f.length) {
                    break L10;
                  } else {
                    if (((vh) this).field_f[var2_int] != null) {
                      {
                        L12: {
                          ((vh) this).field_f[var2_int].a(param0 ^ 2);
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
              if (((vh) this).field_c != null) {
                {
                  L15: {
                    ((vh) this).field_c.a(param0 + 2);
                    break L15;
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

    private final jh a(boolean param0, int param1, Object param2, int param3, int param4) {
        jh var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          var6 = new jh();
          var6.field_d = param3;
          var6.field_g = param2;
          var6.field_f = param1;
          var6.field_b = param4;
          if (!param0) {
            break L0;
          } else {
            field_d = 103L;
            break L0;
          }
        }
        var7 = this;
        synchronized (var7) {
          L1: {
            L2: {
              if (null == ((vh) this).field_r) {
                ((vh) this).field_o = var6;
                ((vh) this).field_r = var6;
                break L2;
              } else {
                ((vh) this).field_r.field_c = var6;
                ((vh) this).field_r = var6;
                break L2;
              }
            }
            this.notify();
            break L1;
          }
        }
        return var6;
    }

    vh(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        ba var7 = null;
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
          ((vh) this).field_m = null;
          ((vh) this).field_i = null;
          ((vh) this).field_j = false;
          ((vh) this).field_r = null;
          ((vh) this).field_s = false;
          ((vh) this).field_g = false;
          ((vh) this).field_c = null;
          ((vh) this).field_o = null;
          field_b = "1.1";
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
        ((vh) this).field_s = stackIn_3_1 != 0;
        field_v = param1;
        field_p = "Unknown";
        field_w = param0;
        try {
          L1: {
            field_p = System.getProperty("java.vendor");
            field_b = System.getProperty("java.version");
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
            ((vh) this).field_j = true;
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
        field_k = field_l.toLowerCase();
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
              field_n = System.getProperty("user.home");
              if (null == field_n) {
                break L11;
              } else {
                field_n = field_n + "/";
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
          if (null == field_n) {
            field_n = "~/";
            break L13;
          } else {
            break L13;
          }
        }
        try {
          L14: {
            ((vh) this).field_a = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
          if (((vh) this).field_j) {
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
                field_q = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
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
          fd.a(field_v, field_w, (byte) 125);
          if (!((vh) this).field_s) {
            break L21;
          } else {
            ((vh) this).field_c = new ri(fd.a("random.dat", field_w, (String) null, -93), "rw", 25L);
            ((vh) this).field_m = new ri(fd.a("main_file_cache.dat2", (byte) 115), "rw", 314572800L);
            ((vh) this).field_i = new ri(fd.a("main_file_cache.idx255", (byte) 115), "rw", 1048576L);
            ((vh) this).field_f = new ri[param2];
            var5_int = 0;
            L22: while (true) {
              if (param2 <= var5_int) {
                L23: {
                  if (!((vh) this).field_j) {
                    break L23;
                  } else {
                    try {
                      L24: {
                        Object discarded$7 = Class.forName("gl").newInstance();
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
                      if (((vh) this).field_j) {
                        var7 = new ba();
                        ((vh) this).field_u = var7;
                        break L27;
                      } else {
                        ((vh) this).field_t = Class.forName("bj").newInstance();
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
                      if (!((vh) this).field_j) {
                        ((vh) this).field_h = Class.forName("ak").newInstance();
                        break L30;
                      } else {
                        ((vh) this).field_x = new al();
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
                ((vh) this).field_f[var5_int] = new ri(fd.a("main_file_cache.idx" + var5_int, (byte) 115), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        ((vh) this).field_g = false;
        ((vh) this).field_e = new Thread((Runnable) this);
        ((vh) this).field_e.setPriority(10);
        ((vh) this).field_e.setDaemon(true);
        ((vh) this).field_e.start();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
