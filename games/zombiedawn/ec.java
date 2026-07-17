/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ec implements Runnable {
    qn[] field_q;
    java.awt.EventQueue field_x;
    private op field_a;
    private Object field_l;
    private boolean field_w;
    private Thread field_f;
    qn field_b;
    private go field_m;
    qn field_i;
    private static String field_r;
    private static volatile long field_j;
    private Object field_o;
    private th field_v;
    static String field_n;
    static java.lang.reflect.Method field_d;
    static String field_h;
    private boolean field_u;
    boolean field_t;
    private static String field_p;
    private op field_k;
    private static String field_s;
    static String field_g;
    qn field_e;
    private static int field_c;

    final boolean c(int param0) {
        if (!(((ec) this).field_t)) {
            return false;
        }
        if (param0 != 10) {
            return false;
        }
        if (((ec) this).field_u) {
            return null != ((ec) this).field_m ? true : false;
        }
        return ((ec) this).field_o != null ? true : false;
    }

    final op a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 != 1525233840) {
            Object var7 = null;
            op discarded$0 = this.a((String) null, -122, true, 56);
        }
        return this.a((byte) 61, (param4 << 16) - -param2, 6, (param0 << 16) - -param3, (Object) null);
    }

    final op a(java.awt.Frame param0, byte param1) {
        if (param1 <= 4) {
            return null;
        }
        return this.a((byte) 61, 0, 7, 0, (Object) (Object) param0);
    }

    final op a(int param0, java.net.URL param1) {
        if (param0 != 7645) {
            return null;
        }
        return this.a((byte) 61, 0, 4, 0, (Object) (Object) param1);
    }

    final op a(int param0) {
        if (param0 != -1) {
            return null;
        }
        return this.a((byte) 61, 0, 5, 0, (Object) null);
    }

    private final op a(byte param0, int param1, int param2, int param3, Object param4) {
        op var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        var6 = new op();
        var6.field_g = param1;
        var6.field_e = param4;
        var6.field_a = param2;
        var6.field_c = param3;
        var7 = this;
        synchronized (var7) {
          L0: {
            L1: {
              if (((ec) this).field_a == null) {
                ((ec) this).field_k = var6;
                ((ec) this).field_a = var6;
                break L1;
              } else {
                ((ec) this).field_a.field_b = var6;
                ((ec) this).field_a = var6;
                break L1;
              }
            }
            this.notify();
            break L0;
          }
        }
        return var6;
    }

    public final void run() {
        try {
            Object var2 = null;
            Throwable var2_ref = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            dg var3_ref = null;
            Exception var3_ref2 = null;
            qn var3_ref3 = null;
            int var3_int = 0;
            Throwable var4 = null;
            int var4_int = 0;
            String var4_ref = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            Object var8 = null;
            op var8_ref = null;
            String var9 = null;
            java.awt.Frame var10 = null;
            java.awt.Component var11 = null;
            String var12 = null;
            Object[] var13 = null;
            java.awt.datatransfer.Clipboard var14 = null;
            java.awt.datatransfer.Clipboard var15 = null;
            Object[] var16 = null;
            Object[] var17 = null;
            Thread var18 = null;
            int stackIn_71_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_70_0 = 0;
            int stackOut_69_0 = 0;
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
                    if (((ec) this).field_w) {
                      return;
                    } else {
                      if (null == ((ec) this).field_k) {
                        {
                          L4: {
                            this.wait();
                            break L4;
                          }
                        }
                        continue L3;
                      } else {
                        L6: {
                          var8_ref = ((ec) this).field_k;
                          ((ec) this).field_k = ((ec) this).field_k.field_b;
                          if (((ec) this).field_k == null) {
                            ((ec) this).field_a = null;
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
                    if (var2_int != 1) {
                      if (var2_int != 22) {
                        if (var2_int == 2) {
                          var18 = new Thread((Runnable) var8_ref.field_e);
                          var18.setDaemon(true);
                          var18.start();
                          var18.setPriority(var8_ref.field_g);
                          var8_ref.field_d = (Object) (Object) var18;
                          break L8;
                        } else {
                          if (var2_int != 4) {
                            if (var2_int == 8) {
                              L9: {
                                var17 = (Object[]) var8_ref.field_e;
                                if (((ec) this).field_t) {
                                  if (((Class) var17[0]).getClassLoader() != null) {
                                    break L9;
                                  } else {
                                    throw new SecurityException();
                                  }
                                } else {
                                  break L9;
                                }
                              }
                              var8_ref.field_d = (Object) (Object) ((Class) var17[0]).getDeclaredMethod((String) var17[1], (Class[]) var17[2]);
                              break L8;
                            } else {
                              if (var2_int == 9) {
                                L10: {
                                  var16 = (Object[]) var8_ref.field_e;
                                  if (((ec) this).field_t) {
                                    if (null == ((Class) var16[0]).getClassLoader()) {
                                      throw new SecurityException();
                                    } else {
                                      break L10;
                                    }
                                  } else {
                                    break L10;
                                  }
                                }
                                var8_ref.field_d = (Object) (Object) ((Class) var16[0]).getDeclaredField((String) var16[1]);
                                break L8;
                              } else {
                                if (var2_int == 18) {
                                  var15 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8_ref.field_d = (Object) (Object) var15.getContents((Object) null);
                                  break L8;
                                } else {
                                  if (var2_int == 19) {
                                    var7 = (java.awt.datatransfer.Transferable) var8_ref.field_e;
                                    var14 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var14.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L8;
                                  } else {
                                    if (((ec) this).field_t) {
                                      if (var2_int != 3) {
                                        if (var2_int != 21) {
                                          if (var2_int != 5) {
                                            if (6 != var2_int) {
                                              if (var2_int == 7) {
                                                if (!((ec) this).field_u) {
                                                  Object discarded$6 = Class.forName("bk").getMethod("exit", new Class[0]).invoke(((ec) this).field_o, new Object[0]);
                                                  break L8;
                                                } else {
                                                  ((ec) this).field_m.a((java.awt.Frame) var8_ref.field_e, 6411);
                                                  break L8;
                                                }
                                              } else {
                                                if (12 != var2_int) {
                                                  if (var2_int == 13) {
                                                    var3_ref3 = ec.a((String) var8_ref.field_e, (byte) -44, field_c, "");
                                                    var8_ref.field_d = (Object) (Object) var3_ref3;
                                                    break L8;
                                                  } else {
                                                    L11: {
                                                      if (!((ec) this).field_t) {
                                                        break L11;
                                                      } else {
                                                        if (var2_int != 14) {
                                                          break L11;
                                                        } else {
                                                          var3_int = var8_ref.field_g;
                                                          var4_int = var8_ref.field_c;
                                                          if (((ec) this).field_u) {
                                                            ((ec) this).field_v.a(var4_int, var3_int, (byte) -70);
                                                            break L8;
                                                          } else {
                                                            Object discarded$7 = Class.forName("jn").getDeclaredMethod("movemouse", new Class[2]).invoke(((ec) this).field_l, new Object[2]);
                                                            break L8;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L12: {
                                                      if (!((ec) this).field_t) {
                                                        break L12;
                                                      } else {
                                                        if (var2_int != 15) {
                                                          break L12;
                                                        } else {
                                                          L13: {
                                                            if (0 == var8_ref.field_g) {
                                                              stackOut_70_0 = 0;
                                                              stackIn_71_0 = stackOut_70_0;
                                                              break L13;
                                                            } else {
                                                              stackOut_69_0 = 1;
                                                              stackIn_71_0 = stackOut_69_0;
                                                              break L13;
                                                            }
                                                          }
                                                          var3_int = stackIn_71_0;
                                                          var11 = (java.awt.Component) var8_ref.field_e;
                                                          if (((ec) this).field_u) {
                                                            ((ec) this).field_v.a(var11, true, var3_int != 0);
                                                            break L8;
                                                          } else {
                                                            Object discarded$8 = Class.forName("jn").getDeclaredMethod("showcursor", new Class[2]).invoke(((ec) this).field_l, new Object[2]);
                                                            break L8;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L14: {
                                                      if (((ec) this).field_u) {
                                                        break L14;
                                                      } else {
                                                        if (17 == var2_int) {
                                                          var13 = (Object[]) var8_ref.field_e;
                                                          Object discarded$9 = Class.forName("jn").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((ec) this).field_l, new Object[5]);
                                                          break L8;
                                                        } else {
                                                          break L14;
                                                        }
                                                      }
                                                    }
                                                    if (var2_int != 16) {
                                                      throw ec.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    } else {
                                                      try {
                                                        L15: {
                                                          if (field_n.startsWith("win")) {
                                                            L16: {
                                                              var12 = (String) var8_ref.field_e;
                                                              if (var12.startsWith("http://")) {
                                                                break L16;
                                                              } else {
                                                                if (!var12.startsWith("https://")) {
                                                                  throw ec.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  break L16;
                                                                }
                                                              }
                                                            }
                                                            var4_ref = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L17: while (true) {
                                                              if (~var12.length() >= ~var5) {
                                                                Process discarded$10 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var12 + "\"");
                                                                var8_ref.field_d = null;
                                                                break L15;
                                                              } else {
                                                                if (-1 != var4_ref.indexOf((int) var12.charAt(var5))) {
                                                                  var5++;
                                                                  continue L17;
                                                                } else {
                                                                  throw ec.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            throw ec.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter1) {
                                                        decompiledCaughtException = decompiledCaughtParameter1;
                                                        var3_ref2 = (Exception) (Object) decompiledCaughtException;
                                                        var8_ref.field_d = (Object) (Object) var3_ref2;
                                                        throw ec.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                                                      }
                                                      break L8;
                                                    }
                                                  }
                                                } else {
                                                  var3_ref3 = ec.a((String) var8_ref.field_e, (byte) -44, field_c, field_s);
                                                  var8_ref.field_d = (Object) (Object) var3_ref3;
                                                  break L8;
                                                }
                                              }
                                            } else {
                                              var10 = new java.awt.Frame("Jagex Full Screen");
                                              var8_ref.field_d = (Object) (Object) var10;
                                              var10.setResizable(false);
                                              if (!((ec) this).field_u) {
                                                Object discarded$11 = Class.forName("bk").getMethod("enter", new Class[5]).invoke(((ec) this).field_o, new Object[5]);
                                                break L8;
                                              } else {
                                                ((ec) this).field_m.a(var8_ref.field_c >> 16, var8_ref.field_g >>> 16, 65535 & var8_ref.field_c, 65535 & var8_ref.field_g, (byte) 81, var10);
                                                break L8;
                                              }
                                            }
                                          } else {
                                            if (!((ec) this).field_u) {
                                              var8_ref.field_d = Class.forName("bk").getMethod("listmodes", new Class[0]).invoke(((ec) this).field_o, new Object[0]);
                                              break L8;
                                            } else {
                                              var8_ref.field_d = (Object) (Object) ((ec) this).field_m.a(8);
                                              break L8;
                                            }
                                          }
                                        } else {
                                          if (pd.a(-22826) < field_j) {
                                            throw new IOException();
                                          } else {
                                            var8_ref.field_d = (Object) (Object) java.net.InetAddress.getByName((String) var8_ref.field_e).getAddress();
                                            break L8;
                                          }
                                        }
                                      } else {
                                        if (pd.a(-22826) < field_j) {
                                          throw new IOException();
                                        } else {
                                          var9 = (255 & var8_ref.field_g >> 24) + "." + (255 & var8_ref.field_g >> 16) + "." + ((65496 & var8_ref.field_g) >> 8) + "." + (255 & var8_ref.field_g);
                                          var8_ref.field_d = (Object) (Object) java.net.InetAddress.getByName(var9).getHostName();
                                          break L8;
                                        }
                                      }
                                    } else {
                                      throw ec.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            if (pd.a(-22826) >= field_j) {
                              var8_ref.field_d = (Object) (Object) new DataInputStream(((java.net.URL) var8_ref.field_e).openStream());
                              break L8;
                            } else {
                              throw new IOException();
                            }
                          }
                        }
                      } else {
                        if (~field_j < ~pd.a(-22826)) {
                          throw new IOException();
                        } else {
                          try {
                            L18: {
                              var8_ref.field_d = (Object) (Object) ud.a((String) var8_ref.field_e, (byte) 68, var8_ref.field_g).a(false);
                              break L18;
                            }
                          } catch (java.lang.Exception decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref = (dg) (Object) decompiledCaughtException;
                            var8_ref.field_d = (Object) (Object) var3_ref.getMessage();
                            throw var3_ref;
                          }
                          break L8;
                        }
                      }
                    } else {
                      if (~field_j < ~pd.a(-22826)) {
                        throw new IOException();
                      } else {
                        var8_ref.field_d = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var8_ref.field_e), var8_ref.field_g);
                        break L8;
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

    final op a(int param0, String param1, int param2) {
        if (param0 != 2) {
            Object var5 = null;
            op discarded$0 = this.a((String) null, 28, true, -32);
        }
        return this.a(param1, param2, false, -124);
    }

    final op a(byte param0, String param1, Class param2) {
        if (param0 != -113) {
            Object var5 = null;
            op discarded$0 = ((ec) this).a(50, (Runnable) null, false);
        }
        return this.a((byte) 61, 0, 9, 0, (Object) (Object) new Object[2]);
    }

    private final op a(String param0, int param1, boolean param2, int param3) {
        int var5 = 28 / ((param3 - -56) / 58);
        return this.a((byte) 61, param1, !param2 ? 1 : 22, 0, (Object) (Object) param0);
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
                ((ec) this).field_w = true;
                this.notifyAll();
                break L0;
              }
            }
            try {
              L1: {
                L2: {
                  if (param0 == 0) {
                    break L2;
                  } else {
                    field_d = null;
                    break L2;
                  }
                }
                ((ec) this).field_f.join();
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
              if (((ec) this).field_e != null) {
                {
                  L5: {
                    ((ec) this).field_e.c(-97);
                    break L5;
                  }
                }
                break L4;
              } else {
                break L4;
              }
            }
            L7: {
              if (null != ((ec) this).field_i) {
                {
                  L8: {
                    ((ec) this).field_i.c(param0 + -107);
                    break L8;
                  }
                }
                break L7;
              } else {
                break L7;
              }
            }
            L10: {
              if (((ec) this).field_q != null) {
                var2_int = 0;
                L11: while (true) {
                  if (((ec) this).field_q.length <= var2_int) {
                    break L10;
                  } else {
                    if (((ec) this).field_q[var2_int] != null) {
                      {
                        L12: {
                          ((ec) this).field_q[var2_int].c(param0 + -73);
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
              if (null == ((ec) this).field_b) {
                break L14;
              } else {
                {
                  L15: {
                    ((ec) this).field_b.c(param0 + -79);
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

    private final static qn a(String param0, byte param1, int param2, String param3) {
        try {
            String var7_ref = null;
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            Object var7 = null;
            Exception var8 = null;
            qn var8_ref = null;
            Object var9 = null;
            qn stackIn_14_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            qn stackOut_13_0 = null;
            var7_ref = null;
            L0: {
              if (param1 == -44) {
                break L0;
              } else {
                var9 = null;
                qn discarded$1 = ec.a((String) null, (byte) -111, 37, (String) null);
                break L0;
              }
            }
            L1: {
              if (33 == param2) {
                var4 = "jagex_" + param3 + "_preferences" + param0 + "_rc.dat";
                break L1;
              } else {
                if (param2 != 34) {
                  var4 = "jagex_" + param3 + "_preferences" + param0 + ".dat";
                  break L1;
                } else {
                  var4 = "jagex_" + param3 + "_preferences" + param0 + "_wip.dat";
                  break L1;
                }
              }
            }
            var5_array = new String[]{"c:/rscache/", "/rscache/", field_r, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            var6 = 0;
            L2: while (true) {
              if (var5_array.length > var6) {
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
                    var8_ref = new qn(new File(var7_ref, var4), "rw", 10000L);
                    stackOut_13_0 = (qn) var8_ref;
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

    final op a(Class[] param0, Class param1, int param2, String param3) {
        if (param2 != 255) {
            ((ec) this).field_q = null;
        }
        return this.a((byte) 61, 0, 8, 0, (Object) (Object) new Object[3]);
    }

    ec(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        go var6 = null;
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
          ((ec) this).field_a = null;
          ((ec) this).field_i = null;
          ((ec) this).field_t = false;
          ((ec) this).field_b = null;
          ((ec) this).field_u = false;
          ((ec) this).field_w = false;
          ((ec) this).field_k = null;
          ((ec) this).field_e = null;
          field_s = param1;
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
        ((ec) this).field_t = stackIn_3_1 != 0;
        field_c = param0;
        field_g = "1.1";
        field_h = "Unknown";
        try {
          L1: {
            field_h = System.getProperty("java.vendor");
            field_g = System.getProperty("java.version");
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
          if (field_h.toLowerCase().indexOf("microsoft") == -1) {
            break L3;
          } else {
            ((ec) this).field_u = true;
            break L3;
          }
        }
        try {
          L4: {
            field_p = System.getProperty("os.name");
            break L4;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var5 = (Exception) (Object) decompiledCaughtException;
            field_p = "Unknown";
            break L5;
          }
        }
        field_n = field_p.toLowerCase();
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
              field_r = System.getProperty("user.home");
              if (null == field_r) {
                break L11;
              } else {
                field_r = field_r + "/";
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
          if (null == field_r) {
            field_r = "~/";
            break L13;
          } else {
            break L13;
          }
        }
        try {
          L14: {
            ((ec) this).field_x = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
          if (((ec) this).field_u) {
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
                field_d = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
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
          gh.a(field_c, (byte) 127, field_s);
          if (!((ec) this).field_t) {
            break L21;
          } else {
            ((ec) this).field_b = new qn(gh.a((String) null, field_c, (byte) 21, "random.dat"), "rw", 25L);
            ((ec) this).field_e = new qn(gh.a(-71, "main_file_cache.dat2"), "rw", 314572800L);
            ((ec) this).field_i = new qn(gh.a(-115, "main_file_cache.idx255"), "rw", 1048576L);
            ((ec) this).field_q = new qn[param2];
            var5_int = 0;
            L22: while (true) {
              if (var5_int >= param2) {
                L23: {
                  if (((ec) this).field_u) {
                    try {
                      L24: {
                        Object discarded$7 = Class.forName("db").newInstance();
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
                      if (!((ec) this).field_u) {
                        ((ec) this).field_o = Class.forName("bk").newInstance();
                        break L27;
                      } else {
                        var6 = new go();
                        ((ec) this).field_m = var6;
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
                      if (!((ec) this).field_u) {
                        ((ec) this).field_l = Class.forName("jn").newInstance();
                        break L30;
                      } else {
                        ((ec) this).field_v = new th();
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
                ((ec) this).field_q[var5_int] = new qn(gh.a(-97, "main_file_cache.idx" + var5_int), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        ((ec) this).field_w = false;
        ((ec) this).field_f = new Thread((Runnable) this);
        ((ec) this).field_f.setPriority(10);
        ((ec) this).field_f.setDaemon(true);
        ((ec) this).field_f.start();
    }

    final op a(int param0, Runnable param1, boolean param2) {
        if (!param2) {
            Object var5 = null;
            op discarded$0 = ((ec) this).a(-51, (String) null, -36);
        }
        return this.a((byte) 61, param0, 2, 0, (Object) (Object) param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
