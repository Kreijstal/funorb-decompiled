/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qg implements Runnable {
    private boolean field_w;
    static String field_p;
    private static String field_r;
    private static volatile long field_a;
    private static String field_k;
    private Object field_b;
    private pn field_u;
    static String field_c;
    static String field_n;
    private ma field_m;
    qp[] field_v;
    private Thread field_f;
    private static String field_i;
    private on field_l;
    boolean field_j;
    private static int field_t;
    qp field_h;
    static java.lang.reflect.Method field_g;
    java.awt.EventQueue field_e;
    private Object field_s;
    qp field_q;
    qp field_x;
    private boolean field_d;
    private pn field_o;

    private final static qp a(String param0, String param1, int param2, int param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            qp var8_ref = null;
            Object var9 = null;
            qp stackIn_14_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            qp stackOut_13_0 = null;
            L0: {
              if (param3 == 33) {
                var4 = "jagex_" + param1 + "_preferences" + param0 + "_rc.dat";
                break L0;
              } else {
                if (param3 == 34) {
                  var4 = "jagex_" + param1 + "_preferences" + param0 + "_wip.dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param1 + "_preferences" + param0 + ".dat";
                  break L0;
                }
              }
            }
            L1: {
              var5_array = new String[]{"c:/rscache/", "/rscache/", field_r, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
              var6 = 0;
              if (param2 == -35) {
                break L1;
              } else {
                var9 = null;
                qp discarded$1 = qg.a((String) null, (String) null, -3, -52);
                break L1;
              }
            }
            L2: while (true) {
              if (var6 < var5_array.length) {
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
                    var8_ref = new qp(new File(var7, var4), "rw", 10000L);
                    stackOut_13_0 = (qp) var8_ref;
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

    public final void run() {
        try {
            Object var2 = null;
            Throwable var2_ref = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            Exception var3_ref = null;
            wl var3_ref2 = null;
            qp var3_ref3 = null;
            int var3_int = 0;
            Throwable var4_ref_Throwable = null;
            int var4 = 0;
            String var4_ref_String = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            Object var8 = null;
            pn var8_ref = null;
            String var9 = null;
            java.awt.Frame var10 = null;
            java.awt.Component var11 = null;
            Object[] var12 = null;
            String var13 = null;
            java.awt.datatransfer.Clipboard var14 = null;
            java.awt.datatransfer.Clipboard var15 = null;
            Object[] var16 = null;
            Object[] var17 = null;
            Thread var18 = null;
            int stackIn_55_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_54_0 = 0;
            int stackOut_53_0 = 0;
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
                    if (!((qg) this).field_w) {
                      if (((qg) this).field_o != null) {
                        L4: {
                          var8_ref = ((qg) this).field_o;
                          ((qg) this).field_o = ((qg) this).field_o.field_a;
                          if (((qg) this).field_o == null) {
                            ((qg) this).field_u = null;
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
                    var2_int = var8_ref.field_e;
                    if (var2_int == 1) {
                      if (~kd.c(-2456) > ~field_a) {
                        throw new IOException();
                      } else {
                        var8_ref.field_f = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var8_ref.field_d), var8_ref.field_g);
                        break L8;
                      }
                    } else {
                      if (var2_int == 22) {
                        if (field_a > kd.c(-2456)) {
                          throw new IOException();
                        } else {
                          try {
                            L9: {
                              var8_ref.field_f = (Object) (Object) bp.a(var8_ref.field_g, (byte) 127, (String) var8_ref.field_d).b(13905);
                              break L9;
                            }
                          } catch (java.lang.Exception decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref2 = (wl) (Object) decompiledCaughtException;
                            var8_ref.field_f = (Object) (Object) var3_ref2.getMessage();
                            throw var3_ref2;
                          }
                          break L8;
                        }
                      } else {
                        if (2 == var2_int) {
                          var18 = new Thread((Runnable) var8_ref.field_d);
                          var18.setDaemon(true);
                          var18.start();
                          var18.setPriority(var8_ref.field_g);
                          var8_ref.field_f = (Object) (Object) var18;
                          break L8;
                        } else {
                          if (4 != var2_int) {
                            if (var2_int == 8) {
                              L10: {
                                var17 = (Object[]) var8_ref.field_d;
                                if (((qg) this).field_j) {
                                  if (((Class) var17[0]).getClassLoader() == null) {
                                    throw new SecurityException();
                                  } else {
                                    break L10;
                                  }
                                } else {
                                  break L10;
                                }
                              }
                              var8_ref.field_f = (Object) (Object) ((Class) var17[0]).getDeclaredMethod((String) var17[1], (Class[]) var17[2]);
                              break L8;
                            } else {
                              if (9 == var2_int) {
                                L11: {
                                  var16 = (Object[]) var8_ref.field_d;
                                  if (!((qg) this).field_j) {
                                    break L11;
                                  } else {
                                    if (null == ((Class) var16[0]).getClassLoader()) {
                                      throw new SecurityException();
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                var8_ref.field_f = (Object) (Object) ((Class) var16[0]).getDeclaredField((String) var16[1]);
                                break L8;
                              } else {
                                if (var2_int == 18) {
                                  var15 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8_ref.field_f = (Object) (Object) var15.getContents((Object) null);
                                  break L8;
                                } else {
                                  if (var2_int == 19) {
                                    var7 = (java.awt.datatransfer.Transferable) var8_ref.field_d;
                                    var14 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var14.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L8;
                                  } else {
                                    if (((qg) this).field_j) {
                                      if (var2_int != 3) {
                                        if (var2_int != 21) {
                                          if (var2_int == 5) {
                                            if (((qg) this).field_d) {
                                              var8_ref.field_f = (Object) (Object) ((qg) this).field_m.a(10127);
                                              break L8;
                                            } else {
                                              var8_ref.field_f = Class.forName("eo").getMethod("listmodes", new Class[0]).invoke(((qg) this).field_b, new Object[0]);
                                              break L8;
                                            }
                                          } else {
                                            if (6 != var2_int) {
                                              if (var2_int == 7) {
                                                if (((qg) this).field_d) {
                                                  ((qg) this).field_m.a(42, (java.awt.Frame) var8_ref.field_d);
                                                  break L8;
                                                } else {
                                                  Object discarded$6 = Class.forName("eo").getMethod("exit", new Class[0]).invoke(((qg) this).field_b, new Object[0]);
                                                  break L8;
                                                }
                                              } else {
                                                if (var2_int != 12) {
                                                  if (var2_int == 13) {
                                                    var3_ref3 = qg.a((String) var8_ref.field_d, "", -35, field_t);
                                                    var8_ref.field_f = (Object) (Object) var3_ref3;
                                                    break L8;
                                                  } else {
                                                    L12: {
                                                      if (!((qg) this).field_j) {
                                                        break L12;
                                                      } else {
                                                        if (var2_int == 14) {
                                                          var3_int = var8_ref.field_g;
                                                          var4 = var8_ref.field_b;
                                                          if (!((qg) this).field_d) {
                                                            Object discarded$7 = Class.forName("w").getDeclaredMethod("movemouse", new Class[2]).invoke(((qg) this).field_s, new Object[2]);
                                                            break L8;
                                                          } else {
                                                            ((qg) this).field_l.a(var3_int, true, var4);
                                                            break L8;
                                                          }
                                                        } else {
                                                          break L12;
                                                        }
                                                      }
                                                    }
                                                    L13: {
                                                      if (!((qg) this).field_j) {
                                                        break L13;
                                                      } else {
                                                        if (15 != var2_int) {
                                                          break L13;
                                                        } else {
                                                          L14: {
                                                            if (var8_ref.field_g == 0) {
                                                              stackOut_54_0 = 0;
                                                              stackIn_55_0 = stackOut_54_0;
                                                              break L14;
                                                            } else {
                                                              stackOut_53_0 = 1;
                                                              stackIn_55_0 = stackOut_53_0;
                                                              break L14;
                                                            }
                                                          }
                                                          var3_int = stackIn_55_0;
                                                          var11 = (java.awt.Component) var8_ref.field_d;
                                                          if (((qg) this).field_d) {
                                                            ((qg) this).field_l.a(-14677, var11, var3_int != 0);
                                                            break L8;
                                                          } else {
                                                            Object discarded$8 = Class.forName("w").getDeclaredMethod("showcursor", new Class[2]).invoke(((qg) this).field_s, new Object[2]);
                                                            break L8;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L15: {
                                                      if (((qg) this).field_d) {
                                                        break L15;
                                                      } else {
                                                        if (var2_int != 17) {
                                                          break L15;
                                                        } else {
                                                          var12 = (Object[]) var8_ref.field_d;
                                                          Object discarded$9 = Class.forName("w").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((qg) this).field_s, new Object[5]);
                                                          break L8;
                                                        }
                                                      }
                                                    }
                                                    if (16 != var2_int) {
                                                      throw qg.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    } else {
                                                      try {
                                                        L16: {
                                                          if (field_n.startsWith("win")) {
                                                            L17: {
                                                              var13 = (String) var8_ref.field_d;
                                                              if (var13.startsWith("http://")) {
                                                                break L17;
                                                              } else {
                                                                if (!var13.startsWith("https://")) {
                                                                  throw qg.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  break L17;
                                                                }
                                                              }
                                                            }
                                                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L18: while (true) {
                                                              if (var13.length() <= var5) {
                                                                Process discarded$10 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var13 + "\"");
                                                                var8_ref.field_f = null;
                                                                break L16;
                                                              } else {
                                                                if (var4_ref_String.indexOf((int) var13.charAt(var5)) == -1) {
                                                                  throw qg.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  var5++;
                                                                  continue L18;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            throw qg.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                                                        decompiledCaughtException = decompiledCaughtParameter2;
                                                        var3_ref = (Exception) (Object) decompiledCaughtException;
                                                        var8_ref.field_f = (Object) (Object) var3_ref;
                                                        throw qg.<RuntimeException>$cfr$sneakyThrow(var3_ref);
                                                      }
                                                      break L8;
                                                    }
                                                  }
                                                } else {
                                                  var3_ref3 = qg.a((String) var8_ref.field_d, field_k, -35, field_t);
                                                  var8_ref.field_f = (Object) (Object) var3_ref3;
                                                  break L8;
                                                }
                                              }
                                            } else {
                                              var10 = new java.awt.Frame("Jagex Full Screen");
                                              var8_ref.field_f = (Object) (Object) var10;
                                              var10.setResizable(false);
                                              if (((qg) this).field_d) {
                                                ((qg) this).field_m.a((byte) 6, var10, var8_ref.field_g >>> 16, var8_ref.field_g & 65535, var8_ref.field_b >> 16, 65535 & var8_ref.field_b);
                                                break L8;
                                              } else {
                                                Object discarded$11 = Class.forName("eo").getMethod("enter", new Class[5]).invoke(((qg) this).field_b, new Object[5]);
                                                break L8;
                                              }
                                            }
                                          }
                                        } else {
                                          if (~kd.c(-2456) > ~field_a) {
                                            throw new IOException();
                                          } else {
                                            var8_ref.field_f = (Object) (Object) java.net.InetAddress.getByName((String) var8_ref.field_d).getAddress();
                                            break L8;
                                          }
                                        }
                                      } else {
                                        if (~kd.c(-2456) <= ~field_a) {
                                          var9 = (255 & var8_ref.field_g >> 24) + "." + (255 & var8_ref.field_g >> 16) + "." + (255 & var8_ref.field_g >> 8) + "." + (255 & var8_ref.field_g);
                                          var8_ref.field_f = (Object) (Object) java.net.InetAddress.getByName(var9).getHostName();
                                          break L8;
                                        } else {
                                          throw new IOException();
                                        }
                                      }
                                    } else {
                                      throw qg.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            if (field_a <= kd.c(-2456)) {
                              var8_ref.field_f = (Object) (Object) new DataInputStream(((java.net.URL) var8_ref.field_d).openStream());
                              break L8;
                            } else {
                              throw new IOException();
                            }
                          }
                        }
                      }
                    }
                  }
                  var8_ref.field_c = 1;
                  break L7;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                L19: {
                  var2_ref = decompiledCaughtException;
                  var8_ref.field_c = 2;
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

    final pn a(int param0, java.net.URL param1) {
        if (param0 != -18) {
            return null;
        }
        return this.a(0, (Object) (Object) param1, 6, 4, 0);
    }

    final boolean a(int param0) {
        if (!((qg) this).field_j) {
            return false;
        }
        if (param0 < 25) {
            Object var3 = null;
            pn discarded$0 = ((qg) this).a((java.awt.Frame) null, (byte) -13);
        }
        if (!((qg) this).field_d) {
            return ((qg) this).field_b != null ? true : false;
        }
        return ((qg) this).field_m != null ? true : false;
    }

    private final pn a(int param0, Object param1, int param2, int param3, int param4) {
        pn var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Object var9 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (param2 == 6) {
            break L0;
          } else {
            var9 = null;
            pn discarded$3 = ((qg) this).a(91, 66, (String) null);
            break L0;
          }
        }
        var6 = new pn();
        var6.field_d = param1;
        var6.field_g = param0;
        var6.field_e = param3;
        var6.field_b = param4;
        var7 = this;
        synchronized (var7) {
          L1: {
            L2: {
              if (null == ((qg) this).field_u) {
                ((qg) this).field_o = var6;
                ((qg) this).field_u = var6;
                break L2;
              } else {
                ((qg) this).field_u.field_a = var6;
                ((qg) this).field_u = var6;
                break L2;
              }
            }
            this.notify();
            break L1;
          }
        }
        return var6;
    }

    final pn a(int param0, int param1, String param2) {
        if (param0 >= -68) {
            return null;
        }
        return this.a(false, param2, param1, 1);
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
                ((qg) this).field_w = true;
                this.notifyAll();
                break L0;
              }
            }
            try {
              L1: {
                ((qg) this).field_f.join();
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
              if (((qg) this).field_x == null) {
                break L3;
              } else {
                {
                  L4: {
                    ((qg) this).field_x.a(param0 ^ -119);
                    break L4;
                  }
                }
                break L3;
              }
            }
            L6: {
              if (param0 == -119) {
                break L6;
              } else {
                field_i = null;
                break L6;
              }
            }
            L7: {
              if (((qg) this).field_q == null) {
                break L7;
              } else {
                {
                  L8: {
                    ((qg) this).field_q.a(0);
                    break L8;
                  }
                }
                break L7;
              }
            }
            L10: {
              if (null != ((qg) this).field_v) {
                var2_int = 0;
                L11: while (true) {
                  if (var2_int >= ((qg) this).field_v.length) {
                    break L10;
                  } else {
                    if (null != ((qg) this).field_v[var2_int]) {
                      {
                        L12: {
                          ((qg) this).field_v[var2_int].a(0);
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
              if (null != ((qg) this).field_h) {
                {
                  L15: {
                    ((qg) this).field_h.a(param0 ^ -119);
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

    final pn a(int param0, int param1, Runnable param2) {
        if (param0 != -21432) {
            return null;
        }
        return this.a(param1, (Object) (Object) param2, 6, 2, 0);
    }

    final pn a(byte param0, int param1, int param2, int param3, int param4) {
        if (param0 >= -10) {
            Object var7 = null;
            pn discarded$0 = ((qg) this).a(-77, -50, (Runnable) null);
        }
        return this.a((param2 << 16) - -param4, (Object) null, 6, 6, param1 + (param3 << 16));
    }

    final pn a(java.awt.Component param0, byte param1, boolean param2) {
        if (param1 < 13) {
            ((qg) this).field_v = null;
        }
        return this.a(!param2 ? 0 : 1, (Object) (Object) param0, 6, 15, 0);
    }

    final pn a(int param0, Class param1, String param2) {
        if (param0 != 65535) {
            Object var5 = null;
            pn discarded$0 = this.a(21, (Object) null, -63, 47, 126);
        }
        return this.a(0, (Object) (Object) new Object[2], 6, 9, 0);
    }

    final pn a(boolean param0) {
        if (param0) {
            field_a = 9L;
        }
        return this.a(0, (Object) null, 6, 5, 0);
    }

    final pn a(java.awt.Frame param0, byte param1) {
        if (param1 > -36) {
            field_c = null;
        }
        return this.a(0, (Object) (Object) param0, 6, 7, 0);
    }

    final pn a(Class[] param0, Class param1, int param2, String param3) {
        if (param2 != -1) {
            return null;
        }
        return this.a(0, (Object) (Object) new Object[3], 6, 8, 0);
    }

    private final pn a(boolean param0, String param1, int param2, int param3) {
        return this.a(param2, (Object) (Object) param1, 6, 1, 0);
    }

    qg(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        ma var7 = null;
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
          ((qg) this).field_w = false;
          ((qg) this).field_u = null;
          ((qg) this).field_j = false;
          ((qg) this).field_x = null;
          ((qg) this).field_h = null;
          ((qg) this).field_d = false;
          ((qg) this).field_o = null;
          ((qg) this).field_q = null;
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
        ((qg) this).field_j = stackIn_3_1 != 0;
        field_c = "Unknown";
        field_k = param1;
        field_t = param0;
        field_p = "1.1";
        try {
          L1: {
            field_c = System.getProperty("java.vendor");
            field_p = System.getProperty("java.version");
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
          if (-1 == field_c.toLowerCase().indexOf("microsoft")) {
            break L3;
          } else {
            ((qg) this).field_d = true;
            break L3;
          }
        }
        try {
          L4: {
            field_i = System.getProperty("os.name");
            break L4;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var5 = (Exception) (Object) decompiledCaughtException;
            field_i = "Unknown";
            break L5;
          }
        }
        field_n = field_i.toLowerCase();
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
          if (field_r != null) {
            break L13;
          } else {
            field_r = "~/";
            break L13;
          }
        }
        try {
          L14: {
            ((qg) this).field_e = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
          if (!((qg) this).field_d) {
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
                field_g = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
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
          nc.a(field_t, 116, field_k);
          if (!((qg) this).field_j) {
            break L21;
          } else {
            ((qg) this).field_h = new qp(nc.a("random.dat", field_t, (String) null, -6665), "rw", 25L);
            ((qg) this).field_x = new qp(nc.a(0, "main_file_cache.dat2"), "rw", 314572800L);
            ((qg) this).field_q = new qp(nc.a(0, "main_file_cache.idx255"), "rw", 1048576L);
            ((qg) this).field_v = new qp[param2];
            var5_int = 0;
            L22: while (true) {
              if (param2 <= var5_int) {
                L23: {
                  if (((qg) this).field_d) {
                    try {
                      L24: {
                        Object discarded$7 = Class.forName("pl").newInstance();
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
                      if (!((qg) this).field_d) {
                        ((qg) this).field_b = Class.forName("eo").newInstance();
                        break L27;
                      } else {
                        var7 = new ma();
                        ((qg) this).field_m = var7;
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
                      if (!((qg) this).field_d) {
                        ((qg) this).field_s = Class.forName("w").newInstance();
                        break L30;
                      } else {
                        ((qg) this).field_l = new on();
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
                ((qg) this).field_v[var5_int] = new qp(nc.a(0, "main_file_cache.idx" + var5_int), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        ((qg) this).field_w = false;
        ((qg) this).field_f = new Thread((Runnable) this);
        ((qg) this).field_f.setPriority(10);
        ((qg) this).field_f.setDaemon(true);
        ((qg) this).field_f.start();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
