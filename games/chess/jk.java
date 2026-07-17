/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jk implements Runnable {
    private ff field_h;
    static java.lang.reflect.Method field_m;
    eg field_n;
    private static volatile long field_f;
    private gj field_v;
    boolean field_k;
    static String field_c;
    private static String field_l;
    private nl field_w;
    private nl field_q;
    private Thread field_t;
    private Object field_g;
    private static String field_e;
    eg field_a;
    private boolean field_s;
    private static String field_j;
    private Object field_u;
    java.awt.EventQueue field_x;
    eg field_d;
    private static int field_b;
    static String field_o;
    eg[] field_r;
    static String field_i;
    private boolean field_p;

    final nl a(int param0, String param1, Class[] param2, Class param3) {
        if (param0 != 8) {
            int discarded$0 = 0;
            nl discarded$1 = this.a((String) null, 21, 78);
        }
        return this.a(param0 ^ 9, 0, (Object) (Object) new Object[3], 8, 0);
    }

    final nl a(int param0, boolean param1, Runnable param2) {
        if (!param1) {
            nl discarded$0 = ((jk) this).a(117);
        }
        return this.a(1, param0, (Object) (Object) param2, 2, 0);
    }

    final nl a(String param0, Class param1, byte param2) {
        if (param2 < 4) {
            field_m = null;
        }
        return this.a(1, 0, (Object) (Object) new Object[2], 9, 0);
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
              if (param0 == 0) {
                break L0;
              } else {
                var4 = null;
                nl discarded$1 = ((jk) this).a((String) null, true, -30);
                break L0;
              }
            }
            var2_ref2 = this;
            synchronized (var2_ref2) {
              L1: {
                ((jk) this).field_s = true;
                this.notifyAll();
                break L1;
              }
            }
            try {
              L2: {
                ((jk) this).field_t.join();
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
              if (null != ((jk) this).field_a) {
                {
                  L5: {
                    ((jk) this).field_a.a(10992);
                    break L5;
                  }
                }
                break L4;
              } else {
                break L4;
              }
            }
            L7: {
              if (null == ((jk) this).field_n) {
                break L7;
              } else {
                {
                  L8: {
                    ((jk) this).field_n.a(10992);
                    break L8;
                  }
                }
                break L7;
              }
            }
            L10: {
              if (null != ((jk) this).field_r) {
                var2_int = 0;
                L11: while (true) {
                  if (var2_int >= ((jk) this).field_r.length) {
                    break L10;
                  } else {
                    if (null != ((jk) this).field_r[var2_int]) {
                      {
                        L12: {
                          ((jk) this).field_r[var2_int].a(10992);
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
              } else {
                break L10;
              }
            }
            L14: {
              if (null == ((jk) this).field_d) {
                break L14;
              } else {
                {
                  L15: {
                    ((jk) this).field_d.a(param0 ^ 10992);
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

    private final nl a(String param0, int param1, int param2) {
        if (param1 != 0) {
            nl discarded$0 = ((jk) this).a(97, -106, 27, 64, -97);
        }
        return this.a(param1 + 1, param2, (Object) (Object) param0, 1, 0);
    }

    final nl a(java.awt.Frame param0, boolean param1) {
        if (param1) {
            return null;
        }
        return this.a(1, 0, (Object) (Object) param0, 7, 0);
    }

    private final nl a(int param0, int param1, Object param2, int param3, int param4) {
        nl var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        if (param0 == 1) {
          var6 = new nl();
          var6.field_d = param4;
          var6.field_g = param3;
          var6.field_c = param2;
          var6.field_e = param1;
          var7 = this;
          synchronized (var7) {
            L0: {
              L1: {
                if (null != ((jk) this).field_q) {
                  ((jk) this).field_q.field_a = var6;
                  ((jk) this).field_q = var6;
                  break L1;
                } else {
                  ((jk) this).field_w = var6;
                  ((jk) this).field_q = var6;
                  break L1;
                }
              }
              this.notify();
              break L0;
            }
          }
          return var6;
        } else {
          return null;
        }
    }

    final nl a(int param0, int param1, int param2, int param3, int param4) {
        if (param2 < 89) {
            return null;
        }
        return this.a(1, (param0 << 16) - -param1, (Object) null, 6, param4 + (param3 << 16));
    }

    final nl a(byte param0, java.net.URL param1) {
        if (param0 != -49) {
            nl discarded$0 = ((jk) this).a(100, -38, -20, -23, 39);
        }
        return this.a(1, 0, (Object) (Object) param1, 4, 0);
    }

    private final static eg a(String param0, String param1, int param2, int param3) {
        try {
            String var7_ref = null;
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            Object var7 = null;
            Exception var8 = null;
            eg var8_ref = null;
            eg stackIn_15_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            eg stackOut_14_0 = null;
            var7_ref = null;
            L0: {
              if (param2 > 74) {
                break L0;
              } else {
                field_j = null;
                break L0;
              }
            }
            L1: {
              if (33 != param3) {
                if (param3 != 34) {
                  var4 = "jagex_" + param0 + "_preferences" + param1 + ".dat";
                  break L1;
                } else {
                  var4 = "jagex_" + param0 + "_preferences" + param1 + "_wip.dat";
                  break L1;
                }
              } else {
                var4 = "jagex_" + param0 + "_preferences" + param1 + "_rc.dat";
                break L1;
              }
            }
            var5_array = new String[]{"c:/rscache/", "/rscache/", field_l, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            var6 = 0;
            L2: while (true) {
              if (var6 < var5_array.length) {
                L3: {
                  var7_ref = var5_array[var6];
                  if (var7_ref.length() <= 0) {
                    break L3;
                  } else {
                    if (new File(var7_ref).exists()) {
                      break L3;
                    } else {
                      var6++;
                      continue L2;
                    }
                  }
                }
                try {
                  L4: {
                    var8_ref = new eg(new File(var7_ref, var4), "rw", 10000L);
                    stackOut_14_0 = (eg) var8_ref;
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

    public final void run() {
        try {
            Object var2 = null;
            Throwable var2_ref = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            oa var3_ref = null;
            Exception var3_ref2 = null;
            eg var3_ref3 = null;
            int var3_int = 0;
            Throwable var4 = null;
            int var4_int = 0;
            String var4_ref = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            Object var8 = null;
            nl var8_ref = null;
            Object[] var9 = null;
            Object[] var10 = null;
            java.awt.Frame var11 = null;
            java.awt.Component var12 = null;
            String var13 = null;
            Object[] var14 = null;
            String var15 = null;
            java.awt.datatransfer.Clipboard var16 = null;
            java.awt.datatransfer.Clipboard var17 = null;
            Thread var18 = null;
            int stackIn_72_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_71_0 = 0;
            int stackOut_70_0 = 0;
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
                    if (!((jk) this).field_s) {
                      if (null != ((jk) this).field_w) {
                        L4: {
                          var8_ref = ((jk) this).field_w;
                          ((jk) this).field_w = ((jk) this).field_w.field_a;
                          if (((jk) this).field_w != null) {
                            break L4;
                          } else {
                            ((jk) this).field_q = null;
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
                    var2_int = var8_ref.field_g;
                    if (var2_int != 1) {
                      if (var2_int != 22) {
                        if (var2_int == 2) {
                          var18 = new Thread((Runnable) var8_ref.field_c);
                          var18.setDaemon(true);
                          var18.start();
                          var18.setPriority(var8_ref.field_e);
                          var8_ref.field_b = (Object) (Object) var18;
                          break L8;
                        } else {
                          if (var2_int != 4) {
                            if (var2_int != 8) {
                              if (9 != var2_int) {
                                if (var2_int == 18) {
                                  var17 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8_ref.field_b = (Object) (Object) var17.getContents((Object) null);
                                  break L8;
                                } else {
                                  if (var2_int == 19) {
                                    var7 = (java.awt.datatransfer.Transferable) var8_ref.field_c;
                                    var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var16.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L8;
                                  } else {
                                    if (!((jk) this).field_k) {
                                      throw jk.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    } else {
                                      if (3 == var2_int) {
                                        if (field_f <= ud.a(2)) {
                                          var15 = (255 & var8_ref.field_e >> 24) + "." + (255 & var8_ref.field_e >> 16) + "." + ((var8_ref.field_e & 65468) >> 8) + "." + (255 & var8_ref.field_e);
                                          var8_ref.field_b = (Object) (Object) java.net.InetAddress.getByName(var15).getHostName();
                                          break L8;
                                        } else {
                                          throw new IOException();
                                        }
                                      } else {
                                        if (var2_int == 21) {
                                          if (~field_f < ~ud.a(2)) {
                                            throw new IOException();
                                          } else {
                                            var8_ref.field_b = (Object) (Object) java.net.InetAddress.getByName((String) var8_ref.field_c).getAddress();
                                            break L8;
                                          }
                                        } else {
                                          if (var2_int == 5) {
                                            if (((jk) this).field_p) {
                                              var8_ref.field_b = (Object) (Object) ((jk) this).field_v.a(0);
                                              break L8;
                                            } else {
                                              var8_ref.field_b = Class.forName("wd").getMethod("listmodes", new Class[0]).invoke(((jk) this).field_g, new Object[0]);
                                              break L8;
                                            }
                                          } else {
                                            if (var2_int != 6) {
                                              if (var2_int != 7) {
                                                if (var2_int != 12) {
                                                  if (13 == var2_int) {
                                                    var3_ref3 = jk.a("", (String) var8_ref.field_c, 90, field_b);
                                                    var8_ref.field_b = (Object) (Object) var3_ref3;
                                                    break L8;
                                                  } else {
                                                    L9: {
                                                      if (!((jk) this).field_k) {
                                                        break L9;
                                                      } else {
                                                        if (var2_int != 14) {
                                                          break L9;
                                                        } else {
                                                          var3_int = var8_ref.field_e;
                                                          var4_int = var8_ref.field_d;
                                                          if (!((jk) this).field_p) {
                                                            Object discarded$6 = Class.forName("sm").getDeclaredMethod("movemouse", new Class[2]).invoke(((jk) this).field_u, new Object[2]);
                                                            break L8;
                                                          } else {
                                                            ((jk) this).field_h.a(0, var3_int, var4_int);
                                                            break L8;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L10: {
                                                      if (!((jk) this).field_k) {
                                                        break L10;
                                                      } else {
                                                        if (var2_int != 15) {
                                                          break L10;
                                                        } else {
                                                          L11: {
                                                            if (0 == var8_ref.field_e) {
                                                              stackOut_71_0 = 0;
                                                              stackIn_72_0 = stackOut_71_0;
                                                              break L11;
                                                            } else {
                                                              stackOut_70_0 = 1;
                                                              stackIn_72_0 = stackOut_70_0;
                                                              break L11;
                                                            }
                                                          }
                                                          var3_int = stackIn_72_0;
                                                          var12 = (java.awt.Component) var8_ref.field_c;
                                                          if (((jk) this).field_p) {
                                                            ((jk) this).field_h.a(29783, var3_int != 0, var12);
                                                            break L8;
                                                          } else {
                                                            Object discarded$7 = Class.forName("sm").getDeclaredMethod("showcursor", new Class[2]).invoke(((jk) this).field_u, new Object[2]);
                                                            break L8;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L12: {
                                                      if (((jk) this).field_p) {
                                                        break L12;
                                                      } else {
                                                        if (var2_int == 17) {
                                                          var14 = (Object[]) var8_ref.field_c;
                                                          Object discarded$8 = Class.forName("sm").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((jk) this).field_u, new Object[5]);
                                                          break L8;
                                                        } else {
                                                          break L12;
                                                        }
                                                      }
                                                    }
                                                    if (var2_int == 16) {
                                                      try {
                                                        L13: {
                                                          if (!field_c.startsWith("win")) {
                                                            throw jk.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          } else {
                                                            L14: {
                                                              var13 = (String) var8_ref.field_c;
                                                              if (var13.startsWith("http://")) {
                                                                break L14;
                                                              } else {
                                                                if (!var13.startsWith("https://")) {
                                                                  throw jk.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  break L14;
                                                                }
                                                              }
                                                            }
                                                            var4_ref = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L15: while (true) {
                                                              if (var5 >= var13.length()) {
                                                                Process discarded$9 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var13 + "\"");
                                                                var8_ref.field_b = null;
                                                                break L13;
                                                              } else {
                                                                if (var4_ref.indexOf((int) var13.charAt(var5)) != -1) {
                                                                  var5++;
                                                                  continue L15;
                                                                } else {
                                                                  throw jk.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter1) {
                                                        decompiledCaughtException = decompiledCaughtParameter1;
                                                        var3_ref2 = (Exception) (Object) decompiledCaughtException;
                                                        var8_ref.field_b = (Object) (Object) var3_ref2;
                                                        throw jk.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                                                      }
                                                      break L8;
                                                    } else {
                                                      throw jk.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    }
                                                  }
                                                } else {
                                                  var3_ref3 = jk.a(field_j, (String) var8_ref.field_c, 91, field_b);
                                                  var8_ref.field_b = (Object) (Object) var3_ref3;
                                                  break L8;
                                                }
                                              } else {
                                                if (((jk) this).field_p) {
                                                  ((jk) this).field_v.a(121, (java.awt.Frame) var8_ref.field_c);
                                                  break L8;
                                                } else {
                                                  Object discarded$10 = Class.forName("wd").getMethod("exit", new Class[0]).invoke(((jk) this).field_g, new Object[0]);
                                                  break L8;
                                                }
                                              }
                                            } else {
                                              var11 = new java.awt.Frame("Jagex Full Screen");
                                              var8_ref.field_b = (Object) (Object) var11;
                                              var11.setResizable(false);
                                              if (((jk) this).field_p) {
                                                ((jk) this).field_v.a(var11, var8_ref.field_e & 65535, 65535 & var8_ref.field_d, 127, var8_ref.field_e >>> 16, var8_ref.field_d >> 16);
                                                break L8;
                                              } else {
                                                Object discarded$11 = Class.forName("wd").getMethod("enter", new Class[5]).invoke(((jk) this).field_g, new Object[5]);
                                                break L8;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                L16: {
                                  var10 = (Object[]) var8_ref.field_c;
                                  if (((jk) this).field_k) {
                                    if (null == ((Class) var10[0]).getClassLoader()) {
                                      throw new SecurityException();
                                    } else {
                                      break L16;
                                    }
                                  } else {
                                    break L16;
                                  }
                                }
                                var8_ref.field_b = (Object) (Object) ((Class) var10[0]).getDeclaredField((String) var10[1]);
                                break L8;
                              }
                            } else {
                              L17: {
                                var9 = (Object[]) var8_ref.field_c;
                                if (((jk) this).field_k) {
                                  if (null == ((Class) var9[0]).getClassLoader()) {
                                    throw new SecurityException();
                                  } else {
                                    break L17;
                                  }
                                } else {
                                  break L17;
                                }
                              }
                              var8_ref.field_b = (Object) (Object) ((Class) var9[0]).getDeclaredMethod((String) var9[1], (Class[]) var9[2]);
                              break L8;
                            }
                          } else {
                            if (~field_f >= ~ud.a(2)) {
                              var8_ref.field_b = (Object) (Object) new DataInputStream(((java.net.URL) var8_ref.field_c).openStream());
                              break L8;
                            } else {
                              throw new IOException();
                            }
                          }
                        }
                      } else {
                        if (~field_f < ~ud.a(2)) {
                          throw new IOException();
                        } else {
                          try {
                            L18: {
                              var8_ref.field_b = (Object) (Object) bl.a(0, var8_ref.field_e, (String) var8_ref.field_c).a((byte) -101);
                              break L18;
                            }
                          } catch (java.lang.Exception decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref = (oa) (Object) decompiledCaughtException;
                            var8_ref.field_b = (Object) (Object) var3_ref.getMessage();
                            throw var3_ref;
                          }
                          break L8;
                        }
                      }
                    } else {
                      if (ud.a(2) >= field_f) {
                        var8_ref.field_b = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var8_ref.field_c), var8_ref.field_e);
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

    final boolean a(boolean param0) {
        if (!param0) {
            ((jk) this).field_k = false;
        }
        if (!((jk) this).field_k) {
            return false;
        }
        if (((jk) this).field_p) {
            return ((jk) this).field_v != null ? true : false;
        }
        return null != ((jk) this).field_g ? true : false;
    }

    final nl a(String param0, boolean param1, int param2) {
        if (param1) {
            return null;
        }
        int discarded$0 = 0;
        return this.a(param0, 0, param2);
    }

    final nl a(int param0) {
        if (param0 != -16312) {
            return null;
        }
        return this.a(1, 0, (Object) null, 5, 0);
    }

    jk(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        gj var6 = null;
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
          ((jk) this).field_k = false;
          ((jk) this).field_s = false;
          ((jk) this).field_w = null;
          ((jk) this).field_a = null;
          ((jk) this).field_d = null;
          ((jk) this).field_q = null;
          ((jk) this).field_n = null;
          ((jk) this).field_p = false;
          field_i = "1.1";
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
        ((jk) this).field_k = stackIn_3_1 != 0;
        field_o = "Unknown";
        field_b = param0;
        field_j = param1;
        try {
          L1: {
            field_o = System.getProperty("java.vendor");
            field_i = System.getProperty("java.version");
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
          if (field_o.toLowerCase().indexOf("microsoft") == -1) {
            break L3;
          } else {
            ((jk) this).field_p = true;
            break L3;
          }
        }
        try {
          L4: {
            field_e = System.getProperty("os.name");
            break L4;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var5 = (Exception) (Object) decompiledCaughtException;
            field_e = "Unknown";
            break L5;
          }
        }
        field_c = field_e.toLowerCase();
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
              field_l = System.getProperty("user.home");
              if (null == field_l) {
                break L11;
              } else {
                field_l = field_l + "/";
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
          if (null != field_l) {
            break L13;
          } else {
            field_l = "~/";
            break L13;
          }
        }
        try {
          L14: {
            ((jk) this).field_x = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
          if (((jk) this).field_p) {
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
                field_m = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
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
          ul.a(21747, field_j, field_b);
          if (!((jk) this).field_k) {
            break L21;
          } else {
            ((jk) this).field_d = new eg(ul.a((String) null, field_b, "random.dat", (byte) 86), "rw", 25L);
            ((jk) this).field_a = new eg(ul.a((byte) -103, "main_file_cache.dat2"), "rw", 314572800L);
            ((jk) this).field_n = new eg(ul.a((byte) -69, "main_file_cache.idx255"), "rw", 1048576L);
            ((jk) this).field_r = new eg[param2];
            var5_int = 0;
            L22: while (true) {
              if (param2 <= var5_int) {
                L23: {
                  if (((jk) this).field_p) {
                    try {
                      L24: {
                        Object discarded$7 = Class.forName("kc").newInstance();
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
                      if (!((jk) this).field_p) {
                        ((jk) this).field_g = Class.forName("wd").newInstance();
                        break L27;
                      } else {
                        var6 = new gj();
                        ((jk) this).field_v = var6;
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
                      if (!((jk) this).field_p) {
                        ((jk) this).field_u = Class.forName("sm").newInstance();
                        break L30;
                      } else {
                        ((jk) this).field_h = new ff();
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
                ((jk) this).field_r[var5_int] = new eg(ul.a((byte) -113, "main_file_cache.idx" + var5_int), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        ((jk) this).field_s = false;
        ((jk) this).field_t = new Thread((Runnable) this);
        ((jk) this).field_t.setPriority(10);
        ((jk) this).field_t.setDaemon(true);
        ((jk) this).field_t.start();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
