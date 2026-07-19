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
                this.field_w = true;
                this.notifyAll();
                break L0;
              }
            }
            try {
              L1: {
                this.field_u.join();
                break L1;
              }
            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var2_ref = (InterruptedException) (Object) decompiledCaughtException;
                break L2;
              }
            }
            L3: {
              if (null != this.field_r) {
                try {
                  L4: {
                    this.field_r.a(115);
                    break L4;
                  }
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L5: {
                    var2_ref2 = (IOException) (Object) decompiledCaughtException;
                    break L5;
                  }
                }
                break L3;
              } else {
                break L3;
              }
            }
            L6: {
              if (this.field_q != null) {
                try {
                  L7: {
                    this.field_q.a(124);
                    break L7;
                  }
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L8: {
                    var2_ref2 = (IOException) (Object) decompiledCaughtException;
                    break L8;
                  }
                }
                break L6;
              } else {
                break L6;
              }
            }
            if (param0 == -7538) {
              L9: {
                if (this.field_s != null) {
                  var2_int = 0;
                  L10: while (true) {
                    if (this.field_s.length <= var2_int) {
                      break L9;
                    } else {
                      if (this.field_s[var2_int] != null) {
                        try {
                          L11: {
                            this.field_s[var2_int].a(127);
                            var2_int++;
                            break L11;
                          }
                        } catch (java.io.IOException decompiledCaughtParameter3) {
                          decompiledCaughtException = decompiledCaughtParameter3;
                          L12: {
                            var3_ref = (IOException) (Object) decompiledCaughtException;
                            var2_int++;
                            break L12;
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
                if (null != this.field_m) {
                  try {
                    L14: {
                      this.field_m.a(114);
                      break L14;
                    }
                  } catch (java.io.IOException decompiledCaughtParameter4) {
                    decompiledCaughtException = decompiledCaughtParameter4;
                    L15: {
                      var2_ref2 = (IOException) (Object) decompiledCaughtException;
                      break L15;
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
                if (this.field_h == null) {
                  this.field_a = var6;
                  this.field_h = var6;
                  break L1;
                } else {
                  this.field_h.field_b = var6;
                  this.field_h = var6;
                  break L1;
                }
              }
              this.notify();
              break L0;
            }
          }
          return var6;
        } else {
          return (mf) null;
        }
    }

    final mf a(int param0, String param1, byte param2) {
        mf discarded$0 = null;
        if (param2 != 60) {
            discarded$0 = this.a(-116);
        }
        return this.a(param1, param0, false, (byte) -2);
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
              if ((param3 ^ -1) == -34) {
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
            var6 = param1;
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
                    stackOut_12_0 = (b) (var8_ref);
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
            this.field_w = false;
        }
        return this.a(0, param4 + (param3 << 53898416), param1 + (param0 << -2029748656), 6, (Object) null);
    }

    private final mf a(String param0, int param1, boolean param2, byte param3) {
        if (param3 >= 0) {
            this.field_r = (b) null;
        }
        return this.a(0, param1, 0, !param2 ? 1 : 22, param0);
    }

    final mf a(int param0, Class param1, String param2, Class[] param3) {
        if (param0 < 87) {
            field_j = (String) null;
        }
        return this.a(0, 0, 0, 8, new Object[]{param1, param2, param3});
    }

    final mf a(Runnable param0, byte param1, int param2) {
        mf discarded$0 = null;
        if (param1 != -21) {
            String var5 = (String) null;
            discarded$0 = this.a(-53, (String) null, (byte) -45);
        }
        return this.a(param1 ^ -21, param2, 0, 2, param0);
    }

    final mf a(java.net.URL param0, int param1) {
        int var3 = 119 / ((17 - param1) / 54);
        return this.a(0, 0, 0, 4, param0);
    }

    public final void run() {
        try {
            Object discarded$6 = null;
            Object discarded$7 = null;
            Object discarded$8 = null;
            Object discarded$9 = null;
            Process discarded$10 = null;
            Object discarded$11 = null;
            Object var2 = null;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
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
                  var8_ref.notify();
                  var2 = this;
                  break L1;
                }
              }
              synchronized (var2) {
                L2: {
                  L3: while (true) {
                    if (this.field_w) {
                      return;
                    } else {
                      if (this.field_a == null) {
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
                          var8_ref = this.field_a;
                          this.field_a = this.field_a.field_b;
                          if (null != this.field_a) {
                            break L6;
                          } else {
                            this.field_h = null;
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
                      if ((field_b ^ -1L) < (ll.a(1000) ^ -1L)) {
                        throw new IOException();
                      } else {
                        var8_ref.field_e = new java.net.Socket(java.net.InetAddress.getByName((String) (var8_ref.field_c)), var8_ref.field_f);
                        break L8;
                      }
                    } else {
                      if (-23 != (var2_int ^ -1)) {
                        if (-3 != (var2_int ^ -1)) {
                          if (4 == var2_int) {
                            if ((ll.a(1000) ^ -1L) <= (field_b ^ -1L)) {
                              var8_ref.field_e = new DataInputStream(((java.net.URL) (var8_ref.field_c)).openStream());
                              break L8;
                            } else {
                              throw new IOException();
                            }
                          } else {
                            if (8 != var2_int) {
                              if (-10 == (var2_int ^ -1)) {
                                L9: {
                                  var18 = (Object[]) (var8_ref.field_c);
                                  if (!this.field_v) {
                                    break L9;
                                  } else {
                                    if (null != ((Class) (var18[0])).getClassLoader()) {
                                      break L9;
                                    } else {
                                      throw new SecurityException();
                                    }
                                  }
                                }
                                var8_ref.field_e = ((Class) (var18[0])).getDeclaredField((String) (var18[1]));
                                break L8;
                              } else {
                                if (var2_int == 18) {
                                  var17 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8_ref.field_e = var17.getContents((Object) null);
                                  break L8;
                                } else {
                                  if ((var2_int ^ -1) != -20) {
                                    if (!this.field_v) {
                                      throw he.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    } else {
                                      if ((var2_int ^ -1) != -4) {
                                        if (var2_int != 21) {
                                          if (5 == var2_int) {
                                            if (this.field_n) {
                                              var8_ref.field_e = this.field_c.a(0);
                                              break L8;
                                            } else {
                                              var8_ref.field_e = Class.forName("ti").getMethod("listmodes", new Class[]{}).invoke(this.field_f, new Object[]{});
                                              break L8;
                                            }
                                          } else {
                                            if (-7 == (var2_int ^ -1)) {
                                              var16 = new java.awt.Frame("Jagex Full Screen");
                                              var8_ref.field_e = var16;
                                              var16.setResizable(false);
                                              if (!this.field_n) {
                                                discarded$6 = Class.forName("ti").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_f, new Object[]{var16, new Integer(var8_ref.field_f >>> -316930928), new Integer(65535 & var8_ref.field_f), new Integer(var8_ref.field_g >> 2078646864), new Integer(var8_ref.field_g & 65535)});
                                                break L8;
                                              } else {
                                                this.field_c.a(var8_ref.field_f >>> -1669174320, var16, 0, var8_ref.field_g >> -361559024, 65535 & var8_ref.field_f, var8_ref.field_g & 65535);
                                                break L8;
                                              }
                                            } else {
                                              if (var2_int != 7) {
                                                if (var2_int != 12) {
                                                  if (var2_int == 13) {
                                                    var3_ref3 = he.a("", 0, (String) (var8_ref.field_c), field_e);
                                                    var8_ref.field_e = var3_ref3;
                                                    break L8;
                                                  } else {
                                                    L10: {
                                                      if (!this.field_v) {
                                                        break L10;
                                                      } else {
                                                        if (14 == var2_int) {
                                                          var3_int = var8_ref.field_f;
                                                          var4 = var8_ref.field_g;
                                                          if (!this.field_n) {
                                                            discarded$7 = Class.forName("ub").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_p, new Object[]{new Integer(var3_int), new Integer(var4)});
                                                            break L8;
                                                          } else {
                                                            this.field_l.a(-2, var4, var3_int);
                                                            break L8;
                                                          }
                                                        } else {
                                                          break L10;
                                                        }
                                                      }
                                                    }
                                                    L11: {
                                                      if (!this.field_v) {
                                                        break L11;
                                                      } else {
                                                        if (-16 != (var2_int ^ -1)) {
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
                                                          var13 = (java.awt.Component) (var8_ref.field_c);
                                                          if (!this.field_n) {
                                                            discarded$8 = Class.forName("ub").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_p, new Object[]{var13, new Boolean(var3_int != 0)});
                                                            break L8;
                                                          } else {
                                                            this.field_l.a(var3_int != 0, var13, -64);
                                                            break L8;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L13: {
                                                      if (this.field_n) {
                                                        break L13;
                                                      } else {
                                                        if (var2_int != 17) {
                                                          break L13;
                                                        } else {
                                                          var14 = (Object[]) (var8_ref.field_c);
                                                          discarded$9 = Class.forName("ub").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_p, new Object[]{var14[0], var14[1], new Integer(var8_ref.field_f), new Integer(var8_ref.field_g), var14[2]});
                                                          break L8;
                                                        }
                                                      }
                                                    }
                                                    if ((var2_int ^ -1) == -17) {
                                                      try {
                                                        L14: {
                                                          if (field_o.startsWith("win")) {
                                                            L15: {
                                                              var15 = (String) (var8_ref.field_c);
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
                                                                discarded$10 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var15 + "\"");
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
                                                        var8_ref.field_e = var3_ref2;
                                                        throw he.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                                                      }
                                                      break L8;
                                                    } else {
                                                      throw he.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    }
                                                  }
                                                } else {
                                                  var3_ref3 = he.a(field_t, 0, (String) (var8_ref.field_c), field_e);
                                                  var8_ref.field_e = var3_ref3;
                                                  break L8;
                                                }
                                              } else {
                                                if (this.field_n) {
                                                  this.field_c.a((java.awt.Frame) (var8_ref.field_c), 8);
                                                  break L8;
                                                } else {
                                                  discarded$11 = Class.forName("ti").getMethod("exit", new Class[]{}).invoke(this.field_f, new Object[]{});
                                                  break L8;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          if ((field_b ^ -1L) < (ll.a(1000) ^ -1L)) {
                                            throw new IOException();
                                          } else {
                                            var8_ref.field_e = java.net.InetAddress.getByName((String) (var8_ref.field_c)).getAddress();
                                            break L8;
                                          }
                                        }
                                      } else {
                                        if (ll.a(1000) >= field_b) {
                                          var12 = (255 & var8_ref.field_f >> -429780392) + "." + ((var8_ref.field_f & 16731075) >> -1633662288) + "." + ((var8_ref.field_f & 65324) >> 104177800) + "." + (255 & var8_ref.field_f);
                                          var8_ref.field_e = java.net.InetAddress.getByName(var12).getHostName();
                                          break L8;
                                        } else {
                                          throw new IOException();
                                        }
                                      }
                                    }
                                  } else {
                                    var7 = (java.awt.datatransfer.Transferable) (var8_ref.field_c);
                                    var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var11.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L8;
                                  }
                                }
                              }
                            } else {
                              L17: {
                                var10 = (Object[]) (var8_ref.field_c);
                                if (!this.field_v) {
                                  break L17;
                                } else {
                                  if (null != ((Class) (var10[0])).getClassLoader()) {
                                    break L17;
                                  } else {
                                    throw new SecurityException();
                                  }
                                }
                              }
                              var8_ref.field_e = ((Class) (var10[0])).getDeclaredMethod((String) (var10[1]), (Class[]) (var10[2]));
                              break L8;
                            }
                          }
                        } else {
                          var9 = new Thread((Runnable) (var8_ref.field_c));
                          var9.setDaemon(true);
                          var9.start();
                          var9.setPriority(var8_ref.field_f);
                          var8_ref.field_e = var9;
                          break L8;
                        }
                      } else {
                        if ((ll.a(1000) ^ -1L) > (field_b ^ -1L)) {
                          throw new IOException();
                        } else {
                          try {
                              if (false) throw (wb) null;
                            L18: {
                              var8_ref.field_e = ah.a((String) (var8_ref.field_c), var8_ref.field_f, -23891).b(true);
                              break L18;
                            }
                          } catch (wb decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref = (wb) (Object) decompiledCaughtException;
                            var8_ref.field_e = var3_ref.getMessage();
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
              } catch (java.lang.ThreadDeath decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var2_ref = (ThreadDeath) (Object) decompiledCaughtException;
                throw var2_ref;
              } catch (java.lang.Throwable decompiledCaughtParameter4) {
                decompiledCaughtException = decompiledCaughtParameter4;
                L19: {
                  var2_ref2 = decompiledCaughtException;
                  var8_ref.field_d = 2;
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

    final mf a(Class param0, int param1, String param2) {
        mf discarded$0 = null;
        if (param1 != -3645) {
            Object var5 = (Object) null;
            discarded$0 = this.a(-35, 55, -69, 103, (Object) null);
        }
        return this.a(0, 0, 0, 9, new Object[]{param0, param2});
    }

    final boolean b(int param0) {
        if (!(this.field_v)) {
            return false;
        }
        if (param0 != 2) {
            this.field_w = true;
        }
        if (!this.field_n) {
            return this.field_f != null ? true : false;
        }
        return this.field_c != null ? true : false;
    }

    final mf a(java.awt.Frame param0, int param1) {
        mf discarded$0 = null;
        if (param1 >= -120) {
            String var4 = (String) null;
            discarded$0 = this.a((Class) null, -83, (String) null);
        }
        return this.a(0, 0, 0, 7, param0);
    }

    final mf a(int param0) {
        if (param0 >= -77) {
            return (mf) null;
        }
        return this.a(0, 0, 0, 5, (Object) null);
    }

    he(int param0, String param1, int param2, boolean param3) throws Exception {
        String discarded$8 = null;
        String discarded$9 = null;
        java.lang.reflect.Method discarded$10 = null;
        Object discarded$11 = null;
        Exception exception = null;
        Throwable throwable = null;
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
          this.field_v = false;
          this.field_n = false;
          this.field_m = null;
          this.field_h = null;
          this.field_a = null;
          this.field_q = null;
          this.field_r = null;
          this.field_w = false;
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
        ((he) (this)).field_v = stackIn_3_1 != 0;
        try {
          L1: {
            field_j = System.getProperty("java.vendor");
            field_d = System.getProperty("java.version");
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
          if (0 == (field_j.toLowerCase().indexOf("microsoft") ^ -1)) {
            break L3;
          } else {
            this.field_n = true;
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
            exception = (Exception) (Object) decompiledCaughtException;
            field_k = "Unknown";
            break L5;
          }
        }
        field_o = field_k.toLowerCase();
        try {
          L6: {
            discarded$8 = System.getProperty("os.arch").toLowerCase();
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
            discarded$9 = System.getProperty("os.version").toLowerCase();
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
            exception = (Exception) (Object) decompiledCaughtException;
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
            this.field_g = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
          if (this.field_n) {
            break L16;
          } else {
            try {
              L17: {
                discarded$10 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[]{Boolean.TYPE});
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
          }
        }
        L21: {
          la.a((byte) 119, field_e, field_t);
          if (!this.field_v) {
            break L21;
          } else {
            this.field_m = new b(la.a("random.dat", (String) null, false, field_e), "rw", 25L);
            this.field_r = new b(la.a("main_file_cache.dat2", -3), "rw", 314572800L);
            this.field_q = new b(la.a("main_file_cache.idx255", -20), "rw", 1048576L);
            this.field_s = new b[param2];
            var5_int = 0;
            L22: while (true) {
              if (var5_int >= param2) {
                L23: {
                  if (!this.field_n) {
                    break L23;
                  } else {
                    try {
                      L24: {
                        discarded$11 = Class.forName("lc").newInstance();
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
                  }
                }
                try {
                  L26: {
                    L27: {
                      if (this.field_n) {
                        var7 = new ff();
                        this.field_c = var7;
                        break L27;
                      } else {
                        this.field_f = Class.forName("ti").newInstance();
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
                      if (!this.field_n) {
                        this.field_p = Class.forName("ub").newInstance();
                        break L30;
                      } else {
                        this.field_l = new gk();
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
                this.field_s[var5_int] = new b(la.a("main_file_cache.idx" + var5_int, -31), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        this.field_w = false;
        this.field_u = new Thread((Runnable) (this));
        this.field_u.setPriority(10);
        this.field_u.setDaemon(true);
        this.field_u.start();
    }

    static {
        field_b = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
