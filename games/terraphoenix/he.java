/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class he implements Runnable {
    b field_q;
    static String field_j;
    private Object field_f;
    private mf field_h;
    private static String field_t;
    private static int field_e;
    private static String field_k;
    private static String field_i;
    private boolean field_n;
    private Object field_p;
    boolean field_v;
    static String field_d;
    private gk field_l;
    private Thread field_u;
    private static volatile long field_b;
    private mf field_a;
    static String field_o;
    b[] field_s;
    static java.lang.reflect.Method field_x;
    b field_m;
    private ff field_c;
    java.awt.EventQueue field_g;
    b field_r;
    private boolean field_w;

    final void c(int param0) {
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
                ((he) this).field_w = true;
                this.notifyAll();
                break L0;
              }
            }
            try {
              L1: {
                ((he) this).field_u.join();
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
              if (null != ((he) this).field_r) {
                {
                  L4: {
                    ((he) this).field_r.a(115);
                    break L4;
                  }
                }
                break L3;
              } else {
                break L3;
              }
            }
            L6: {
              if (((he) this).field_q != null) {
                {
                  L7: {
                    ((he) this).field_q.a(124);
                    break L7;
                  }
                }
                break L6;
              } else {
                break L6;
              }
            }
            if (param0 == -7538) {
              L9: {
                if (((he) this).field_s != null) {
                  var2_int = 0;
                  L10: while (true) {
                    if (((he) this).field_s.length <= var2_int) {
                      break L9;
                    } else {
                      if (((he) this).field_s[var2_int] != null) {
                        {
                          L11: {
                            ((he) this).field_s[var2_int].a(127);
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
                if (null != ((he) this).field_m) {
                  {
                    L14: {
                      ((he) this).field_m.a(114);
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

    private final mf a(int param0, int param1, int param2, int param3, Object param4) {
        mf var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        var6 = new mf();
        var6.field_f = param1;
        if (param0 == 0) {
          var6.field_g = param2;
          var6.field_a = param3;
          var6.field_c = param4;
          var7 = this;
          synchronized (var7) {
            L0: {
              L1: {
                if (((he) this).field_h == null) {
                  ((he) this).field_a = var6;
                  ((he) this).field_h = var6;
                  break L1;
                } else {
                  ((he) this).field_h.field_b = var6;
                  ((he) this).field_h = var6;
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

    final mf a(int param0, String param1, byte param2) {
        if (param2 != 60) {
            mf discarded$0 = ((he) this).a(-116);
        }
        int discarded$1 = -2;
        int discarded$2 = 0;
        return this.a(param1, param0);
    }

    private final static b a(String param0, int param1, String param2, int param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            b var8_ref = null;
            b stackIn_13_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            b stackOut_12_0 = null;
            L0: {
              if (param3 == 33) {
                var4 = "jagex_" + param0 + "_preferences" + param2 + "_rc.dat";
                break L0;
              } else {
                if (param3 == 34) {
                  var4 = "jagex_" + param0 + "_preferences" + param2 + "_wip.dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param0 + "_preferences" + param2 + ".dat";
                  break L0;
                }
              }
            }
            var5_array = new String[]{"c:/rscache/", "/rscache/", field_i, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            var6 = 0;
            L1: while (true) {
              if (var5_array.length > var6) {
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
                    var8_ref = new b(new File(var7, var4), "rw", 10000L);
                    stackOut_12_0 = (b) var8_ref;
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

    final mf a(int param0, int param1, boolean param2, int param3, int param4) {
        if (!param2) {
            ((he) this).field_w = false;
        }
        return this.a(0, param4 + (param3 << 16), param1 + (param0 << 16), 6, (Object) null);
    }

    private final mf a(String param0, int param1) {
        return this.a(0, param1, 0, 1, (Object) (Object) param0);
    }

    final mf a(int param0, Class param1, String param2, Class[] param3) {
        if (param0 < 87) {
            field_j = null;
        }
        return this.a(0, 0, 0, 8, (Object) (Object) new Object[3]);
    }

    final mf a(Runnable param0, byte param1, int param2) {
        if (param1 != -21) {
            Object var5 = null;
            mf discarded$0 = ((he) this).a(-53, (String) null, (byte) -45);
        }
        return this.a(param1 ^ -21, param2, 0, 2, (Object) (Object) param0);
    }

    final mf a(java.net.URL param0, int param1) {
        int var3 = 119 / ((17 - param1) / 54);
        return this.a(0, 0, 0, 4, (Object) (Object) param0);
    }

    public final void run() {
        try {
            Object var2 = null;
            Throwable var2_ref = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            wb var3_ref = null;
            Exception var3_ref2 = null;
            b var3_ref3 = null;
            int var3_int = 0;
            Throwable var4_ref_Throwable = null;
            int var4 = 0;
            String var4_ref_String = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            Object var8 = null;
            mf var8_ref = null;
            Thread var9 = null;
            Object[] var10 = null;
            java.awt.datatransfer.Clipboard var11 = null;
            String var12 = null;
            java.awt.Component var13 = null;
            Object[] var14 = null;
            String var15 = null;
            java.awt.Frame var16 = null;
            java.awt.datatransfer.Clipboard var17 = null;
            Object[] var18 = null;
            int stackIn_62_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_61_0 = 0;
            int stackOut_60_0 = 0;
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
                    if (((he) this).field_w) {
                      return;
                    } else {
                      if (((he) this).field_a == null) {
                        {
                          L4: {
                            this.wait();
                            break L4;
                          }
                        }
                        continue L3;
                      } else {
                        L6: {
                          var8_ref = ((he) this).field_a;
                          ((he) this).field_a = ((he) this).field_a.field_b;
                          if (null != ((he) this).field_a) {
                            break L6;
                          } else {
                            ((he) this).field_h = null;
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
                      if (~field_b < ~ll.a(1000)) {
                        throw new IOException();
                      } else {
                        var8_ref.field_e = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var8_ref.field_c), var8_ref.field_f);
                        break L8;
                      }
                    } else {
                      if (var2_int != 22) {
                        if (var2_int != 2) {
                          if (4 == var2_int) {
                            if (~ll.a(1000) <= ~field_b) {
                              var8_ref.field_e = (Object) (Object) new DataInputStream(((java.net.URL) var8_ref.field_c).openStream());
                              break L8;
                            } else {
                              throw new IOException();
                            }
                          } else {
                            if (8 != var2_int) {
                              if (var2_int == 9) {
                                L9: {
                                  var18 = (Object[]) var8_ref.field_c;
                                  if (!((he) this).field_v) {
                                    break L9;
                                  } else {
                                    if (null != ((Class) var18[0]).getClassLoader()) {
                                      break L9;
                                    } else {
                                      throw new SecurityException();
                                    }
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
                                    if (!((he) this).field_v) {
                                      throw he.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    } else {
                                      if (var2_int != 3) {
                                        if (var2_int != 21) {
                                          if (5 == var2_int) {
                                            if (((he) this).field_n) {
                                              var8_ref.field_e = (Object) (Object) ((he) this).field_c.a(0);
                                              break L8;
                                            } else {
                                              var8_ref.field_e = Class.forName("ti").getMethod("listmodes", new Class[0]).invoke(((he) this).field_f, new Object[0]);
                                              break L8;
                                            }
                                          } else {
                                            if (var2_int == 6) {
                                              var16 = new java.awt.Frame("Jagex Full Screen");
                                              var8_ref.field_e = (Object) (Object) var16;
                                              var16.setResizable(false);
                                              if (!((he) this).field_n) {
                                                Object discarded$7 = Class.forName("ti").getMethod("enter", new Class[5]).invoke(((he) this).field_f, new Object[5]);
                                                break L8;
                                              } else {
                                                ((he) this).field_c.a(var8_ref.field_f >>> 16, var16, 0, var8_ref.field_g >> 16, 65535 & var8_ref.field_f, var8_ref.field_g & 65535);
                                                break L8;
                                              }
                                            } else {
                                              if (var2_int != 7) {
                                                if (var2_int != 12) {
                                                  if (var2_int == 13) {
                                                    var3_ref3 = he.a("", 0, (String) var8_ref.field_c, field_e);
                                                    var8_ref.field_e = (Object) (Object) var3_ref3;
                                                    break L8;
                                                  } else {
                                                    L10: {
                                                      if (!((he) this).field_v) {
                                                        break L10;
                                                      } else {
                                                        if (14 == var2_int) {
                                                          var3_int = var8_ref.field_f;
                                                          var4 = var8_ref.field_g;
                                                          if (!((he) this).field_n) {
                                                            Object discarded$8 = Class.forName("ub").getDeclaredMethod("movemouse", new Class[2]).invoke(((he) this).field_p, new Object[2]);
                                                            break L8;
                                                          } else {
                                                            ((he) this).field_l.a(-2, var4, var3_int);
                                                            break L8;
                                                          }
                                                        } else {
                                                          break L10;
                                                        }
                                                      }
                                                    }
                                                    L11: {
                                                      if (!((he) this).field_v) {
                                                        break L11;
                                                      } else {
                                                        if (var2_int != 15) {
                                                          break L11;
                                                        } else {
                                                          L12: {
                                                            if (var8_ref.field_f == 0) {
                                                              stackOut_61_0 = 0;
                                                              stackIn_62_0 = stackOut_61_0;
                                                              break L12;
                                                            } else {
                                                              stackOut_60_0 = 1;
                                                              stackIn_62_0 = stackOut_60_0;
                                                              break L12;
                                                            }
                                                          }
                                                          var3_int = stackIn_62_0;
                                                          var13 = (java.awt.Component) var8_ref.field_c;
                                                          if (!((he) this).field_n) {
                                                            Object discarded$9 = Class.forName("ub").getDeclaredMethod("showcursor", new Class[2]).invoke(((he) this).field_p, new Object[2]);
                                                            break L8;
                                                          } else {
                                                            ((he) this).field_l.a(var3_int != 0, var13, -64);
                                                            break L8;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L13: {
                                                      if (((he) this).field_n) {
                                                        break L13;
                                                      } else {
                                                        if (var2_int != 17) {
                                                          break L13;
                                                        } else {
                                                          var14 = (Object[]) var8_ref.field_c;
                                                          Object discarded$10 = Class.forName("ub").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((he) this).field_p, new Object[5]);
                                                          break L8;
                                                        }
                                                      }
                                                    }
                                                    if (var2_int == 16) {
                                                      try {
                                                        L14: {
                                                          if (field_o.startsWith("win")) {
                                                            L15: {
                                                              var15 = (String) var8_ref.field_c;
                                                              if (var15.startsWith("http://")) {
                                                                break L15;
                                                              } else {
                                                                if (!var15.startsWith("https://")) {
                                                                  throw he.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  break L15;
                                                                }
                                                              }
                                                            }
                                                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L16: while (true) {
                                                              if (var15.length() <= var5) {
                                                                Process discarded$11 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var15 + "\"");
                                                                var8_ref.field_e = null;
                                                                break L14;
                                                              } else {
                                                                if (-1 == var4_ref_String.indexOf((int) var15.charAt(var5))) {
                                                                  throw he.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  var5++;
                                                                  continue L16;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            throw he.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter1) {
                                                        decompiledCaughtException = decompiledCaughtParameter1;
                                                        var3_ref2 = (Exception) (Object) decompiledCaughtException;
                                                        var8_ref.field_e = (Object) (Object) var3_ref2;
                                                        throw he.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                                                      }
                                                      break L8;
                                                    } else {
                                                      throw he.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    }
                                                  }
                                                } else {
                                                  var3_ref3 = he.a(field_t, 0, (String) var8_ref.field_c, field_e);
                                                  var8_ref.field_e = (Object) (Object) var3_ref3;
                                                  break L8;
                                                }
                                              } else {
                                                if (((he) this).field_n) {
                                                  ((he) this).field_c.a((java.awt.Frame) var8_ref.field_c, 8);
                                                  break L8;
                                                } else {
                                                  Object discarded$12 = Class.forName("ti").getMethod("exit", new Class[0]).invoke(((he) this).field_f, new Object[0]);
                                                  break L8;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          if (~field_b < ~ll.a(1000)) {
                                            throw new IOException();
                                          } else {
                                            var8_ref.field_e = (Object) (Object) java.net.InetAddress.getByName((String) var8_ref.field_c).getAddress();
                                            break L8;
                                          }
                                        }
                                      } else {
                                        if (ll.a(1000) >= field_b) {
                                          var12 = (255 & var8_ref.field_f >> 24) + "." + ((var8_ref.field_f & 16731075) >> 16) + "." + ((var8_ref.field_f & 65324) >> 8) + "." + (255 & var8_ref.field_f);
                                          var8_ref.field_e = (Object) (Object) java.net.InetAddress.getByName(var12).getHostName();
                                          break L8;
                                        } else {
                                          throw new IOException();
                                        }
                                      }
                                    }
                                  } else {
                                    var7 = (java.awt.datatransfer.Transferable) var8_ref.field_c;
                                    var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var11.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L8;
                                  }
                                }
                              }
                            } else {
                              L17: {
                                var10 = (Object[]) var8_ref.field_c;
                                if (!((he) this).field_v) {
                                  break L17;
                                } else {
                                  if (null != ((Class) var10[0]).getClassLoader()) {
                                    break L17;
                                  } else {
                                    throw new SecurityException();
                                  }
                                }
                              }
                              var8_ref.field_e = (Object) (Object) ((Class) var10[0]).getDeclaredMethod((String) var10[1], (Class[]) var10[2]);
                              break L8;
                            }
                          }
                        } else {
                          var9 = new Thread((Runnable) var8_ref.field_c);
                          var9.setDaemon(true);
                          var9.start();
                          var9.setPriority(var8_ref.field_f);
                          var8_ref.field_e = (Object) (Object) var9;
                          break L8;
                        }
                      } else {
                        if (~ll.a(1000) > ~field_b) {
                          throw new IOException();
                        } else {
                          try {
                            L18: {
                              int discarded$13 = -23891;
                              var8_ref.field_e = (Object) (Object) ah.a((String) var8_ref.field_c, var8_ref.field_f).b(true);
                              break L18;
                            }
                          } catch (java.lang.Exception decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref = (wb) (Object) decompiledCaughtException;
                            var8_ref.field_e = (Object) (Object) var3_ref.getMessage();
                            throw var3_ref;
                          }
                          break L8;
                        }
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

    final mf a(Class param0, int param1, String param2) {
        if (param1 != -3645) {
            Object var5 = null;
            mf discarded$0 = this.a(-35, 55, -69, 103, (Object) null);
        }
        return this.a(0, 0, 0, 9, (Object) (Object) new Object[2]);
    }

    final boolean b(int param0) {
        if (!(((he) this).field_v)) {
            return false;
        }
        if (param0 != 2) {
            ((he) this).field_w = true;
        }
        if (!((he) this).field_n) {
            return ((he) this).field_f != null ? true : false;
        }
        return ((he) this).field_c != null ? true : false;
    }

    final mf a(java.awt.Frame param0, int param1) {
        if (param1 >= -120) {
            Object var4 = null;
            mf discarded$0 = ((he) this).a((Class) null, -83, (String) null);
        }
        return this.a(0, 0, 0, 7, (Object) (Object) param0);
    }

    final mf a(int param0) {
        if (param0 >= -77) {
            return null;
        }
        return this.a(0, 0, 0, 5, (Object) null);
    }

    he(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        ff var7 = null;
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
          ((he) this).field_v = false;
          ((he) this).field_n = false;
          ((he) this).field_m = null;
          ((he) this).field_h = null;
          ((he) this).field_a = null;
          ((he) this).field_q = null;
          ((he) this).field_r = null;
          ((he) this).field_w = false;
          field_e = param0;
          field_d = "1.1";
          field_j = "Unknown";
          field_t = param1;
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
        ((he) this).field_v = stackIn_3_1 != 0;
        try {
          L1: {
            field_j = System.getProperty("java.vendor");
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
          if (field_j.toLowerCase().indexOf("microsoft") == -1) {
            break L3;
          } else {
            ((he) this).field_n = true;
            break L3;
          }
        }
        try {
          L4: {
            field_k = System.getProperty("os.name");
            break L4;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var5 = (Exception) (Object) decompiledCaughtException;
            field_k = "Unknown";
            break L5;
          }
        }
        field_o = field_k.toLowerCase();
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
          if (field_i == null) {
            field_i = "~/";
            break L13;
          } else {
            break L13;
          }
        }
        try {
          L14: {
            ((he) this).field_g = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
          if (((he) this).field_n) {
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
                field_x = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
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
          la.a((byte) 119, field_e, field_t);
          if (!((he) this).field_v) {
            break L21;
          } else {
            ((he) this).field_m = new b(la.a("random.dat", (String) null, false, field_e), "rw", 25L);
            ((he) this).field_r = new b(la.a("main_file_cache.dat2", -3), "rw", 314572800L);
            ((he) this).field_q = new b(la.a("main_file_cache.idx255", -20), "rw", 1048576L);
            ((he) this).field_s = new b[param2];
            var5_int = 0;
            L22: while (true) {
              if (var5_int >= param2) {
                L23: {
                  if (!((he) this).field_n) {
                    break L23;
                  } else {
                    try {
                      L24: {
                        Object discarded$7 = Class.forName("lc").newInstance();
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
                      if (((he) this).field_n) {
                        var7 = new ff();
                        ((he) this).field_c = var7;
                        break L27;
                      } else {
                        ((he) this).field_f = Class.forName("ti").newInstance();
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
                      if (!((he) this).field_n) {
                        ((he) this).field_p = Class.forName("ub").newInstance();
                        break L30;
                      } else {
                        ((he) this).field_l = new gk();
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
                ((he) this).field_s[var5_int] = new b(la.a("main_file_cache.idx" + var5_int, -31), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        ((he) this).field_w = false;
        ((he) this).field_u = new Thread((Runnable) this);
        ((he) this).field_u.setPriority(10);
        ((he) this).field_u.setDaemon(true);
        ((he) this).field_u.start();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
