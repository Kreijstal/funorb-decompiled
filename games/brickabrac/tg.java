/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tg implements Runnable {
    static String field_b;
    private static String field_h;
    private boolean field_r;
    java.awt.EventQueue field_p;
    private io field_u;
    private Thread field_j;
    rn field_k;
    private static String field_e;
    boolean field_i;
    private static volatile long field_f;
    private static int field_c;
    private ql field_d;
    private Object field_a;
    private ql field_v;
    private boolean field_l;
    rn[] field_s;
    static String field_g;
    rn field_m;
    rn field_q;
    private static String field_t;
    private Object field_n;
    static java.lang.reflect.Method field_x;
    static String field_o;
    private in field_w;

    private final ql a(String param0, int param1, boolean param2, int param3) {
        if (param3 != -31592) {
            this.field_r = false;
        }
        return this.a(true, 0, param0, param2 ? 22 : 1, param1);
    }

    final ql a(int param0, Runnable param1, byte param2) {
        ql discarded$0 = null;
        if (param2 >= -68) {
            String var5 = (String) null;
            discarded$0 = this.a(-7, (Class) null, (Class[]) null, (String) null);
        }
        return this.a(true, 0, param1, 2, param0);
    }

    final boolean b(int param0) {
        int var2 = -94 / ((param0 - 4) / 42);
        if (!this.field_i) {
            return false;
        }
        if (!this.field_r) {
            return this.field_a != null ? true : false;
        }
        return null != this.field_u ? true : false;
    }

    final ql a(byte param0, java.net.URL param1) {
        int var3 = 36 / ((param0 - 3) / 40);
        return this.a(true, 0, param1, 4, 0);
    }

    final ql a(int param0, int param1, int param2, int param3, int param4) {
        ql discarded$0 = null;
        if (param1 != -35) {
            discarded$0 = this.a(125, -72, 117, -42, -13);
        }
        return this.a(true, param0 + (param3 << -2079092080), (Object) null, 6, (param4 << -729368880) + param2);
    }

    final ql a(String param0, byte param1, int param2) {
        ql discarded$0 = null;
        if (param1 != 120) {
            Object var5 = (Object) null;
            discarded$0 = this.a(false, -76, (Object) null, 124, 36);
        }
        return this.a(param0, param2, false, -31592);
    }

    public final void run() {
        try {
            Object discarded$6 = null;
            Object discarded$7 = null;
            Object discarded$8 = null;
            Process discarded$9 = null;
            Object discarded$10 = null;
            Object discarded$11 = null;
            Object var2 = null;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            ef var3_ref = null;
            Exception var3_ref2 = null;
            rn var3_ref3 = null;
            int var3_int = 0;
            Throwable var4 = null;
            int var4_int = 0;
            String var4_ref = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            Object var8 = null;
            ql var8_ref = null;
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
            int stackIn_67_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_66_0 = 0;
            int stackOut_65_0 = 0;
            L0: while (true) {
              synchronized (var2) {
                L1: {
                  var8_ref.notify();
                  var2 = this;
                  break L1;
                }
              }
              synchronized (var2) {
                L2: {
                  L3: while (true) {
                    if (this.field_l) {
                      return;
                    } else {
                      if (this.field_v == null) {
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
                          var8_ref = this.field_v;
                          this.field_v = this.field_v.field_a;
                          if (null != this.field_v) {
                            break L6;
                          } else {
                            this.field_d = null;
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
                    var2_int = var8_ref.field_d;
                    if ((var2_int ^ -1) != -2) {
                      if ((var2_int ^ -1) != -23) {
                        if (-3 == (var2_int ^ -1)) {
                          var18 = new Thread((Runnable) (var8_ref.field_b));
                          var18.setDaemon(true);
                          var18.start();
                          var18.setPriority(var8_ref.field_g);
                          var8_ref.field_e = var18;
                          break L8;
                        } else {
                          if ((var2_int ^ -1) == -5) {
                            if ((ue.a(false) ^ -1L) > (field_f ^ -1L)) {
                              throw new IOException();
                            } else {
                              var8_ref.field_e = new DataInputStream(((java.net.URL) (var8_ref.field_b)).openStream());
                              break L8;
                            }
                          } else {
                            if ((var2_int ^ -1) == -9) {
                              L9: {
                                var17 = (Object[]) (var8_ref.field_b);
                                if (!this.field_i) {
                                  break L9;
                                } else {
                                  if (((Class) (var17[0])).getClassLoader() == null) {
                                    throw new SecurityException();
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              var8_ref.field_e = ((Class) (var17[0])).getDeclaredMethod((String) (var17[1]), (Class[]) (var17[2]));
                              break L8;
                            } else {
                              if (var2_int == 9) {
                                L10: {
                                  var16 = (Object[]) (var8_ref.field_b);
                                  if (!this.field_i) {
                                    break L10;
                                  } else {
                                    if (null != ((Class) (var16[0])).getClassLoader()) {
                                      break L10;
                                    } else {
                                      throw new SecurityException();
                                    }
                                  }
                                }
                                var8_ref.field_e = ((Class) (var16[0])).getDeclaredField((String) (var16[1]));
                                break L8;
                              } else {
                                if (var2_int == 18) {
                                  var15 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8_ref.field_e = var15.getContents((Object) null);
                                  break L8;
                                } else {
                                  if ((var2_int ^ -1) == -20) {
                                    var7 = (java.awt.datatransfer.Transferable) (var8_ref.field_b);
                                    var14 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var14.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L8;
                                  } else {
                                    if (this.field_i) {
                                      if (var2_int != 3) {
                                        if ((var2_int ^ -1) != -22) {
                                          if (-6 != (var2_int ^ -1)) {
                                            if (6 != var2_int) {
                                              if (-8 != (var2_int ^ -1)) {
                                                if (12 != var2_int) {
                                                  if (-14 != (var2_int ^ -1)) {
                                                    L11: {
                                                      if (!this.field_i) {
                                                        break L11;
                                                      } else {
                                                        if ((var2_int ^ -1) != -15) {
                                                          break L11;
                                                        } else {
                                                          var3_int = var8_ref.field_g;
                                                          var4_int = var8_ref.field_c;
                                                          if (this.field_r) {
                                                            this.field_w.a(var4_int, -4, var3_int);
                                                            break L8;
                                                          } else {
                                                            discarded$6 = Class.forName("dd").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_n, new Object[]{new Integer(var3_int), new Integer(var4_int)});
                                                            break L8;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L12: {
                                                      if (!this.field_i) {
                                                        break L12;
                                                      } else {
                                                        if (15 != var2_int) {
                                                          break L12;
                                                        } else {
                                                          L13: {
                                                            if (-1 == (var8_ref.field_g ^ -1)) {
                                                              stackOut_66_0 = 0;
                                                              stackIn_67_0 = stackOut_66_0;
                                                              break L13;
                                                            } else {
                                                              stackOut_65_0 = 1;
                                                              stackIn_67_0 = stackOut_65_0;
                                                              break L13;
                                                            }
                                                          }
                                                          var3_int = stackIn_67_0;
                                                          var11 = (java.awt.Component) (var8_ref.field_b);
                                                          if (!this.field_r) {
                                                            discarded$7 = Class.forName("dd").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_n, new Object[]{var11, new Boolean(var3_int != 0)});
                                                            break L8;
                                                          } else {
                                                            this.field_w.a(var11, 0, var3_int != 0);
                                                            break L8;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L14: {
                                                      if (this.field_r) {
                                                        break L14;
                                                      } else {
                                                        if (17 != var2_int) {
                                                          break L14;
                                                        } else {
                                                          var12 = (Object[]) (var8_ref.field_b);
                                                          discarded$8 = Class.forName("dd").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_n, new Object[]{var12[0], var12[1], new Integer(var8_ref.field_g), new Integer(var8_ref.field_c), var12[2]});
                                                          break L8;
                                                        }
                                                      }
                                                    }
                                                    if ((var2_int ^ -1) != -17) {
                                                      throw tg.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    } else {
                                                      try {
                                                        L15: {
                                                          if (field_b.startsWith("win")) {
                                                            L16: {
                                                              var13 = (String) (var8_ref.field_b);
                                                              if (var13.startsWith("http://")) {
                                                                break L16;
                                                              } else {
                                                                if (!var13.startsWith("https://")) {
                                                                  throw tg.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  break L16;
                                                                }
                                                              }
                                                            }
                                                            var4_ref = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L17: while (true) {
                                                              if (var5 >= var13.length()) {
                                                                discarded$9 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var13 + "\"");
                                                                var8_ref.field_e = null;
                                                                break L15;
                                                              } else {
                                                                if (-1 == var4_ref.indexOf((int) var13.charAt(var5))) {
                                                                  throw tg.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  var5++;
                                                                  continue L17;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            throw tg.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter1) {
                                                        decompiledCaughtException = decompiledCaughtParameter1;
                                                        var3_ref2 = (Exception) (Object) decompiledCaughtException;
                                                        var8_ref.field_e = var3_ref2;
                                                        throw tg.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                                                      }
                                                      break L8;
                                                    }
                                                  } else {
                                                    var3_ref3 = tg.a((String) (var8_ref.field_b), field_c, "", (byte) -89);
                                                    var8_ref.field_e = var3_ref3;
                                                    break L8;
                                                  }
                                                } else {
                                                  var3_ref3 = tg.a((String) (var8_ref.field_b), field_c, field_t, (byte) -70);
                                                  var8_ref.field_e = var3_ref3;
                                                  break L8;
                                                }
                                              } else {
                                                if (this.field_r) {
                                                  this.field_u.a(-3887, (java.awt.Frame) (var8_ref.field_b));
                                                  break L8;
                                                } else {
                                                  discarded$10 = Class.forName("db").getMethod("exit", new Class[]{}).invoke(this.field_a, new Object[]{});
                                                  break L8;
                                                }
                                              }
                                            } else {
                                              var10 = new java.awt.Frame("Jagex Full Screen");
                                              var8_ref.field_e = var10;
                                              var10.setResizable(false);
                                              if (this.field_r) {
                                                this.field_u.a(var10, 65535 & var8_ref.field_g, var8_ref.field_g >>> 37161616, 0, var8_ref.field_c & 65535, var8_ref.field_c >> -2121238704);
                                                break L8;
                                              } else {
                                                discarded$11 = Class.forName("db").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_a, new Object[]{var10, new Integer(var8_ref.field_g >>> -585610128), new Integer(65535 & var8_ref.field_g), new Integer(var8_ref.field_c >> -137288240), new Integer(var8_ref.field_c & 65535)});
                                                break L8;
                                              }
                                            }
                                          } else {
                                            if (!this.field_r) {
                                              var8_ref.field_e = Class.forName("db").getMethod("listmodes", new Class[]{}).invoke(this.field_a, new Object[]{});
                                              break L8;
                                            } else {
                                              var8_ref.field_e = this.field_u.a((byte) -48);
                                              break L8;
                                            }
                                          }
                                        } else {
                                          if (ue.a(false) >= field_f) {
                                            var8_ref.field_e = java.net.InetAddress.getByName((String) (var8_ref.field_b)).getAddress();
                                            break L8;
                                          } else {
                                            throw new IOException();
                                          }
                                        }
                                      } else {
                                        if (ue.a(false) >= field_f) {
                                          var9 = (255 & var8_ref.field_g >> 868830360) + "." + (var8_ref.field_g >> -1719038832 & 255) + "." + ((65391 & var8_ref.field_g) >> -1513596184) + "." + (255 & var8_ref.field_g);
                                          var8_ref.field_e = java.net.InetAddress.getByName(var9).getHostName();
                                          break L8;
                                        } else {
                                          throw new IOException();
                                        }
                                      }
                                    } else {
                                      throw tg.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        if (field_f <= ue.a(false)) {
                          try {
                              if (false) throw (ef) null;
                            L18: {
                              var8_ref.field_e = nd.a(60, var8_ref.field_g, (String) (var8_ref.field_b)).a(0);
                              break L18;
                            }
                          } catch (ef decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref = (ef) (Object) decompiledCaughtException;
                            var8_ref.field_e = var3_ref.getMessage();
                            throw var3_ref;
                          }
                          break L8;
                        } else {
                          throw new IOException();
                        }
                      }
                    } else {
                      if ((ue.a(false) ^ -1L) <= (field_f ^ -1L)) {
                        var8_ref.field_e = new java.net.Socket(java.net.InetAddress.getByName((String) (var8_ref.field_b)), var8_ref.field_g);
                        break L8;
                      } else {
                        throw new IOException();
                      }
                    }
                  }
                  var8_ref.field_f = 1;
                  break L7;
                }
              } catch (java.lang.ThreadDeath decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var2_ref = (ThreadDeath) (Object) decompiledCaughtException;
                throw var2_ref;
              } catch (java.lang.Throwable decompiledCaughtParameter4) {
                decompiledCaughtException = decompiledCaughtParameter4;
                L19: {
                  var2_ref2 = decompiledCaughtException;
                  var8_ref.field_f = 2;
                  break L19;
                }
              }
              var2 = var8_ref;
              continue L0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final ql a(int param0) {
        ql discarded$0 = null;
        if (param0 != 0) {
            discarded$0 = this.a(79);
        }
        return this.a(true, 0, (Object) null, 5, 0);
    }

    final ql a(int param0, Class param1, String param2) {
        int var4 = 121 / ((param0 - 7) / 36);
        return this.a(true, 0, new Object[]{param1, param2}, 9, 0);
    }

    private final static rn a(String param0, int param1, String param2, byte param3) {
        try {
            rn discarded$1 = null;
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            rn var8_ref = null;
            String var9 = null;
            rn stackIn_12_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            rn stackOut_11_0 = null;
            L0: {
              if (-34 == (param1 ^ -1)) {
                var4 = "jagex_" + param2 + "_preferences" + param0 + "_rc.dat";
                break L0;
              } else {
                if (-35 == (param1 ^ -1)) {
                  var4 = "jagex_" + param2 + "_preferences" + param0 + "_wip.dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param2 + "_preferences" + param0 + ".dat";
                  break L0;
                }
              }
            }
            var5_array = new String[]{"c:/rscache/", "/rscache/", field_e, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            var6 = 0;
            L1: while (true) {
              if (var6 >= var5_array.length) {
                if (param3 >= -61) {
                  var9 = (String) null;
                  discarded$1 = tg.a((String) null, 48, (String) null, (byte) -119);
                  return null;
                } else {
                  return null;
                }
              } else {
                L2: {
                  var7 = var5_array[var6];
                  if (-1 <= (var7.length() ^ -1)) {
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
                    var8_ref = new rn(new File(var7, var4), "rw", 10000L);
                    stackOut_11_0 = (rn) (var8_ref);
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
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(boolean param0) {
        try {
            Object var2 = null;
            InterruptedException var2_ref = null;
            IOException var2_ref2 = null;
            int var2_int = 0;
            Throwable var3 = null;
            IOException var3_ref = null;
            Object stackIn_2_0 = null;
            Object stackIn_3_0 = null;
            Object stackIn_4_0 = null;
            int stackIn_4_1 = 0;
            Throwable decompiledCaughtException = null;
            Object stackOut_1_0 = null;
            Object stackOut_3_0 = null;
            int stackOut_3_1 = 0;
            Object stackOut_2_0 = null;
            int stackOut_2_1 = 0;
            var2 = this;
            synchronized (var2) {
              L0: {
                L1: {
                  stackOut_1_0 = this;
                  stackIn_3_0 = stackOut_1_0;
                  stackIn_2_0 = stackOut_1_0;
                  if (!param0) {
                    stackOut_3_0 = this;
                    stackOut_3_1 = 0;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    break L1;
                  } else {
                    stackOut_2_0 = this;
                    stackOut_2_1 = 1;
                    stackIn_4_0 = stackOut_2_0;
                    stackIn_4_1 = stackOut_2_1;
                    break L1;
                  }
                }
                ((tg) (this)).field_l = stackIn_4_1 != 0;
                this.notifyAll();
                break L0;
              }
            }
            try {
              L2: {
                this.field_j.join();
                break L2;
              }
            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L3: {
                var2_ref = (InterruptedException) (Object) decompiledCaughtException;
                break L3;
              }
            }
            L4: {
              if (this.field_q != null) {
                try {
                  L5: {
                    this.field_q.c(83);
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
              if (this.field_m != null) {
                try {
                  L8: {
                    this.field_m.c(-119);
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
              if (this.field_s != null) {
                var2_int = 0;
                L11: while (true) {
                  if (this.field_s.length <= var2_int) {
                    break L10;
                  } else {
                    if (null != this.field_s[var2_int]) {
                      try {
                        L12: {
                          this.field_s[var2_int].c(56);
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
              } else {
                break L10;
              }
            }
            L14: {
              if (null != this.field_k) {
                try {
                  L15: {
                    this.field_k.c(108);
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

    final ql a(int param0, Class param1, Class[] param2, String param3) {
        if (param0 != 23311) {
            return (ql) null;
        }
        return this.a(true, 0, new Object[]{param1, param3, param2}, 8, 0);
    }

    final ql a(int param0, java.awt.Frame param1) {
        int var3 = -2 / ((param0 - 54) / 37);
        return this.a(true, 0, param1, 7, 0);
    }

    private final ql a(boolean param0, int param1, Object param2, int param3, int param4) {
        ql discarded$14 = null;
        ql var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        String var9 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          var6 = new ql();
          var6.field_g = param4;
          var6.field_b = param2;
          if (param0) {
            break L0;
          } else {
            var9 = (String) null;
            discarded$14 = this.a((String) null, (byte) -43, 124);
            break L0;
          }
        }
        var6.field_c = param1;
        var6.field_d = param3;
        var7 = this;
        synchronized (var7) {
          L1: {
            L2: {
              if (null != this.field_d) {
                this.field_d.field_a = var6;
                this.field_d = var6;
                break L2;
              } else {
                this.field_v = var6;
                this.field_d = var6;
                break L2;
              }
            }
            this.notify();
            break L1;
          }
        }
        return var6;
    }

    tg(int param0, String param1, int param2, boolean param3) throws Exception {
        String discarded$6 = null;
        String discarded$7 = null;
        java.lang.reflect.Method discarded$8 = null;
        Object discarded$9 = null;
        Exception exception = null;
        Throwable throwable = null;
        int var5_int = 0;
        io var7 = null;
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
          this.field_k = null;
          this.field_v = null;
          this.field_d = null;
          this.field_r = false;
          this.field_m = null;
          this.field_i = false;
          this.field_q = null;
          this.field_l = false;
          field_o = "1.1";
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
        ((tg) (this)).field_i = stackIn_3_1 != 0;
        field_t = param1;
        field_g = "Unknown";
        field_c = param0;
        try {
          L1: {
            field_g = System.getProperty("java.vendor");
            field_o = System.getProperty("java.version");
            break L1;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            exception = (Exception) (Object) decompiledCaughtException;
            break L2;
          }
        }
        L3: {
          if (-1 == field_g.toLowerCase().indexOf("microsoft")) {
            break L3;
          } else {
            this.field_r = true;
            break L3;
          }
        }
        try {
          L4: {
            field_h = System.getProperty("os.name");
            break L4;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            exception = (Exception) (Object) decompiledCaughtException;
            field_h = "Unknown";
            break L5;
          }
        }
        field_b = field_h.toLowerCase();
        try {
          L6: {
            discarded$6 = System.getProperty("os.arch").toLowerCase();
            break L6;
          }
        } catch (java.lang.Exception decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L7: {
            exception = (Exception) (Object) decompiledCaughtException;
            break L7;
          }
        }
        try {
          L8: {
            discarded$7 = System.getProperty("os.version").toLowerCase();
            break L8;
          }
        } catch (java.lang.Exception decompiledCaughtParameter3) {
          decompiledCaughtException = decompiledCaughtParameter3;
          L9: {
            exception = (Exception) (Object) decompiledCaughtException;
            break L9;
          }
        }
        try {
          L10: {
            L11: {
              field_e = System.getProperty("user.home");
              if (null == field_e) {
                break L11;
              } else {
                field_e = field_e + "/";
                break L11;
              }
            }
            break L10;
          }
        } catch (java.lang.Exception decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          L12: {
            exception = (Exception) (Object) decompiledCaughtException;
            break L12;
          }
        }
        L13: {
          if (null != field_e) {
            break L13;
          } else {
            field_e = "~/";
            break L13;
          }
        }
        try {
          L14: {
            this.field_p = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
            break L14;
          }
        } catch (java.lang.Throwable decompiledCaughtParameter5) {
          decompiledCaughtException = decompiledCaughtParameter5;
          L15: {
            throwable = decompiledCaughtException;
            break L15;
          }
        }
        L16: {
          if (!this.field_r) {
            try {
              L17: {
                discarded$8 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[]{Boolean.TYPE});
                break L17;
              }
            } catch (java.lang.Exception decompiledCaughtParameter6) {
              decompiledCaughtException = decompiledCaughtParameter6;
              L18: {
                exception = (Exception) (Object) decompiledCaughtException;
                break L18;
              }
            }
            try {
              L19: {
                field_x = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
                break L19;
              }
            } catch (java.lang.Exception decompiledCaughtParameter7) {
              decompiledCaughtException = decompiledCaughtParameter7;
              L20: {
                exception = (Exception) (Object) decompiledCaughtException;
                break L20;
              }
            }
            break L16;
          } else {
            break L16;
          }
        }
        L21: {
          gl.a(98, field_c, field_t);
          if (!this.field_i) {
            break L21;
          } else {
            this.field_k = new rn(gl.a(-1, "random.dat", (String) null, field_c), "rw", 25L);
            this.field_q = new rn(gl.a("main_file_cache.dat2", -1), "rw", 314572800L);
            this.field_m = new rn(gl.a("main_file_cache.idx255", -1), "rw", 1048576L);
            this.field_s = new rn[param2];
            var5_int = 0;
            L22: while (true) {
              if (var5_int >= param2) {
                L23: {
                  if (this.field_r) {
                    try {
                      L24: {
                        discarded$9 = Class.forName("iq").newInstance();
                        break L24;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter8) {
                      decompiledCaughtException = decompiledCaughtParameter8;
                      L25: {
                        throwable = decompiledCaughtException;
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
                      if (this.field_r) {
                        var7 = new io();
                        this.field_u = var7;
                        break L27;
                      } else {
                        this.field_a = Class.forName("db").newInstance();
                        break L27;
                      }
                    }
                    break L26;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter9) {
                  decompiledCaughtException = decompiledCaughtParameter9;
                  L28: {
                    throwable = decompiledCaughtException;
                    break L28;
                  }
                }
                try {
                  L29: {
                    L30: {
                      if (!this.field_r) {
                        this.field_n = Class.forName("dd").newInstance();
                        break L30;
                      } else {
                        this.field_w = new in();
                        break L30;
                      }
                    }
                    break L29;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter10) {
                  decompiledCaughtException = decompiledCaughtParameter10;
                  L31: {
                    throwable = decompiledCaughtException;
                    break L31;
                  }
                }
                break L21;
              } else {
                this.field_s[var5_int] = new rn(gl.a("main_file_cache.idx" + var5_int, -1), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        this.field_l = false;
        this.field_j = new Thread((Runnable) (this));
        this.field_j.setPriority(10);
        this.field_j.setDaemon(true);
        this.field_j.start();
    }

    static {
        field_f = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
