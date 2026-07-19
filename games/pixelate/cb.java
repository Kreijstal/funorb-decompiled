/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class cb implements Runnable {
    lj field_m;
    static String field_p;
    private boolean field_v;
    boolean field_x;
    private cp field_d;
    private static volatile long field_c;
    private static String field_r;
    static String field_l;
    lj field_k;
    private ei field_q;
    private static String field_i;
    private Object field_g;
    private ei field_h;
    private Object field_n;
    private boolean field_f;
    static java.lang.reflect.Method field_j;
    java.awt.EventQueue field_w;
    private Thread field_b;
    static String field_o;
    private static String field_a;
    private static int field_t;
    lj[] field_u;
    private vb field_s;
    lj field_e;

    private final ei a(int param0, int param1, int param2, Object param3, int param4) {
        ei var6 = null;
        Object var7 = null;
        int var8 = 0;
        Throwable var9 = null;
        Throwable decompiledCaughtException = null;
        var6 = new ei();
        var6.field_g = param3;
        var6.field_a = param4;
        var6.field_d = param1;
        var6.field_c = param0;
        var7 = this;
        synchronized (var7) {
          L0: {
            L1: {
              if (null != this.field_q) {
                this.field_q.field_f = var6;
                this.field_q = var6;
                break L1;
              } else {
                this.field_h = var6;
                this.field_q = var6;
                break L1;
              }
            }
            var8 = 10 % ((param2 - -52) / 43);
            this.notify();
            break L0;
          }
        }
        return var6;
    }

    final ei a(int param0, Class[] param1, String param2, Class param3) {
        if (param0 != 0) {
            return (ei) null;
        }
        return this.a(0, 8, 19, new Object[]{param3, param2, param1}, 0);
    }

    private final static lj a(int param0, String param1, String param2, int param3) {
        try {
            lj discarded$1 = null;
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            Object var7 = null;
            Exception var8 = null;
            lj var8_ref = null;
            String var9 = null;
            lj stackIn_14_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            lj stackOut_13_0 = null;
            String var7_ref = null;
            L0: {
              if (param3 == 33) {
                var4 = "jagex_" + param2 + "_preferences" + param1 + "_rc.dat";
                break L0;
              } else {
                if ((param3 ^ -1) == -35) {
                  var4 = "jagex_" + param2 + "_preferences" + param1 + "_wip.dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param2 + "_preferences" + param1 + ".dat";
                  break L0;
                }
              }
            }
            L1: {
              if (param0 < -98) {
                break L1;
              } else {
                var9 = (String) null;
                discarded$1 = cb.a(120, (String) null, (String) null, 79);
                break L1;
              }
            }
            var5_array = new String[]{"c:/rscache/", "/rscache/", field_a, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
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
                    var8_ref = new lj(new File(var7_ref, var4), "rw", 10000L);
                    stackOut_13_0 = (lj) (var8_ref);
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

    final void a(int param0) {
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
                this.field_f = true;
                this.notifyAll();
                break L0;
              }
            }
            try {
              L1: {
                L2: {
                  if (param0 == -1204) {
                    break L2;
                  } else {
                    field_j = (java.lang.reflect.Method) null;
                    break L2;
                  }
                }
                this.field_b.join();
                break L1;
              }
            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L3: {
                var2_ref = (InterruptedException) (Object) decompiledCaughtException;
                break L3;
              }
            }
            L4: {
              if (this.field_k != null) {
                try {
                  L5: {
                    this.field_k.b(-5317);
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
              if (this.field_m == null) {
                break L7;
              } else {
                try {
                  L8: {
                    this.field_m.b(param0 ^ 4215);
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
              }
            }
            L10: {
              if (this.field_u != null) {
                var2_int = 0;
                L11: while (true) {
                  if (this.field_u.length <= var2_int) {
                    break L10;
                  } else {
                    if (this.field_u[var2_int] != null) {
                      try {
                        L12: {
                          this.field_u[var2_int].b(-5317);
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
              if (this.field_e != null) {
                try {
                  L15: {
                    this.field_e.b(-5317);
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

    public final void run() {
        try {
            Object discarded$6 = null;
            Object discarded$7 = null;
            Object discarded$8 = null;
            Object discarded$9 = null;
            Object discarded$10 = null;
            Process discarded$11 = null;
            Object var2 = null;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            int var2_int = 0;
            InterruptedException var3_ref_InterruptedException = null;
            uf var3_ref_uf = null;
            Exception var3_ref_Exception = null;
            lj var3_ref_lj = null;
            int var3 = 0;
            Throwable var4_ref_Throwable = null;
            int var4 = 0;
            String var4_ref_String = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            Object var8 = null;
            ei var8_ref = null;
            Thread var9 = null;
            Object[] var10 = null;
            Object[] var11 = null;
            String var12 = null;
            java.awt.Component var13 = null;
            Object[] var14 = null;
            String var15 = null;
            java.awt.Frame var16 = null;
            java.awt.datatransfer.Clipboard var17 = null;
            java.awt.datatransfer.Clipboard var18 = null;
            int stackIn_75_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_74_0 = 0;
            int stackOut_73_0 = 0;
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
                    if (this.field_f) {
                      return;
                    } else {
                      if (this.field_h != null) {
                        L4: {
                          var8_ref = this.field_h;
                          this.field_h = this.field_h.field_f;
                          if (this.field_h != null) {
                            break L4;
                          } else {
                            this.field_q = null;
                            break L4;
                          }
                        }
                        break L2;
                      } else {
                        try {
                          L5: {
                            this.wait();
                            break L5;
                          }
                        } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          L6: {
                            var3_ref_InterruptedException = (InterruptedException) (Object) decompiledCaughtException;
                            break L6;
                          }
                        }
                        continue L3;
                      }
                    }
                  }
                }
              }
              try {
                L7: {
                  L8: {
                    var2_int = var8_ref.field_d;
                    if (1 != var2_int) {
                      if (22 != var2_int) {
                        if (2 != var2_int) {
                          if (var2_int != 4) {
                            if (8 != var2_int) {
                              if ((var2_int ^ -1) != -10) {
                                if (-19 == (var2_int ^ -1)) {
                                  var18 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8_ref.field_e = var18.getContents((Object) null);
                                  break L8;
                                } else {
                                  if (19 == var2_int) {
                                    var7 = (java.awt.datatransfer.Transferable) (var8_ref.field_g);
                                    var17 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var17.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L8;
                                  } else {
                                    if (this.field_x) {
                                      if (var2_int != 3) {
                                        if (21 != var2_int) {
                                          if (-6 != (var2_int ^ -1)) {
                                            if (-7 == (var2_int ^ -1)) {
                                              var16 = new java.awt.Frame("Jagex Full Screen");
                                              var8_ref.field_e = var16;
                                              var16.setResizable(false);
                                              if (!this.field_v) {
                                                discarded$6 = Class.forName("gl").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_g, new Object[]{var16, new Integer(var8_ref.field_a >>> -1003145328), new Integer(65535 & var8_ref.field_a), new Integer(var8_ref.field_c >> -412683888), new Integer(65535 & var8_ref.field_c)});
                                                break L8;
                                              } else {
                                                this.field_s.a(65535 & var8_ref.field_a, (byte) 122, 65535 & var8_ref.field_c, var8_ref.field_c >> 1436388368, var8_ref.field_a >>> 666638064, var16);
                                                break L8;
                                              }
                                            } else {
                                              if (7 == var2_int) {
                                                if (this.field_v) {
                                                  this.field_s.a(8, (java.awt.Frame) (var8_ref.field_g));
                                                  break L8;
                                                } else {
                                                  discarded$7 = Class.forName("gl").getMethod("exit", new Class[]{}).invoke(this.field_g, new Object[]{});
                                                  break L8;
                                                }
                                              } else {
                                                if ((var2_int ^ -1) != -13) {
                                                  if (13 != var2_int) {
                                                    L9: {
                                                      if (!this.field_x) {
                                                        break L9;
                                                      } else {
                                                        if ((var2_int ^ -1) == -15) {
                                                          var3 = var8_ref.field_a;
                                                          var4 = var8_ref.field_c;
                                                          if (!this.field_v) {
                                                            discarded$8 = Class.forName("cj").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_n, new Object[]{new Integer(var3), new Integer(var4)});
                                                            break L8;
                                                          } else {
                                                            this.field_d.a(var3, var4, (byte) 112);
                                                            break L8;
                                                          }
                                                        } else {
                                                          break L9;
                                                        }
                                                      }
                                                    }
                                                    L10: {
                                                      if (!this.field_x) {
                                                        break L10;
                                                      } else {
                                                        if (-16 != (var2_int ^ -1)) {
                                                          break L10;
                                                        } else {
                                                          L11: {
                                                            if (var8_ref.field_a == 0) {
                                                              stackOut_74_0 = 0;
                                                              stackIn_75_0 = stackOut_74_0;
                                                              break L11;
                                                            } else {
                                                              stackOut_73_0 = 1;
                                                              stackIn_75_0 = stackOut_73_0;
                                                              break L11;
                                                            }
                                                          }
                                                          var3 = stackIn_75_0;
                                                          var13 = (java.awt.Component) (var8_ref.field_g);
                                                          if (this.field_v) {
                                                            this.field_d.a(var13, var3 != 0, false);
                                                            break L8;
                                                          } else {
                                                            discarded$9 = Class.forName("cj").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_n, new Object[]{var13, new Boolean(var3 != 0)});
                                                            break L8;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L12: {
                                                      if (this.field_v) {
                                                        break L12;
                                                      } else {
                                                        if ((var2_int ^ -1) != -18) {
                                                          break L12;
                                                        } else {
                                                          var14 = (Object[]) (var8_ref.field_g);
                                                          discarded$10 = Class.forName("cj").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_n, new Object[]{var14[0], var14[1], new Integer(var8_ref.field_a), new Integer(var8_ref.field_c), var14[2]});
                                                          break L8;
                                                        }
                                                      }
                                                    }
                                                    if ((var2_int ^ -1) != -17) {
                                                      throw cb.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    } else {
                                                      try {
                                                        L13: {
                                                          if (field_p.startsWith("win")) {
                                                            L14: {
                                                              var15 = (String) (var8_ref.field_g);
                                                              if (var15.startsWith("http://")) {
                                                                break L14;
                                                              } else {
                                                                if (var15.startsWith("https://")) {
                                                                  break L14;
                                                                } else {
                                                                  throw cb.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L15: while (true) {
                                                              if (var15.length() <= var5) {
                                                                discarded$11 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var15 + "\"");
                                                                var8_ref.field_e = null;
                                                                break L13;
                                                              } else {
                                                                if (var4_ref_String.indexOf((int) var15.charAt(var5)) != -1) {
                                                                  var5++;
                                                                  continue L15;
                                                                } else {
                                                                  throw cb.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            throw cb.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter1) {
                                                        decompiledCaughtException = decompiledCaughtParameter1;
                                                        var3_ref_Exception = (Exception) (Object) decompiledCaughtException;
                                                        var8_ref.field_e = var3_ref_Exception;
                                                        throw cb.<RuntimeException>$cfr$sneakyThrow(var3_ref_Exception);
                                                      }
                                                      break L8;
                                                    }
                                                  } else {
                                                    var3_ref_lj = cb.a(-117, (String) (var8_ref.field_g), "", field_t);
                                                    var8_ref.field_e = var3_ref_lj;
                                                    break L8;
                                                  }
                                                } else {
                                                  var3_ref_lj = cb.a(-121, (String) (var8_ref.field_g), field_r, field_t);
                                                  var8_ref.field_e = var3_ref_lj;
                                                  break L8;
                                                }
                                              }
                                            }
                                          } else {
                                            if (!this.field_v) {
                                              var8_ref.field_e = Class.forName("gl").getMethod("listmodes", new Class[]{}).invoke(this.field_g, new Object[]{});
                                              break L8;
                                            } else {
                                              var8_ref.field_e = this.field_s.a(5003);
                                              break L8;
                                            }
                                          }
                                        } else {
                                          if (field_c > hm.a(64)) {
                                            throw new IOException();
                                          } else {
                                            var8_ref.field_e = java.net.InetAddress.getByName((String) (var8_ref.field_g)).getAddress();
                                            break L8;
                                          }
                                        }
                                      } else {
                                        if (field_c > hm.a(64)) {
                                          throw new IOException();
                                        } else {
                                          var12 = (var8_ref.field_a >> 447997272 & 255) + "." + (255 & var8_ref.field_a >> 1450062288) + "." + (255 & var8_ref.field_a >> -582846200) + "." + (var8_ref.field_a & 255);
                                          var8_ref.field_e = java.net.InetAddress.getByName(var12).getHostName();
                                          break L8;
                                        }
                                      }
                                    } else {
                                      throw cb.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    }
                                  }
                                }
                              } else {
                                L16: {
                                  var11 = (Object[]) (var8_ref.field_g);
                                  if (!this.field_x) {
                                    break L16;
                                  } else {
                                    if (null != ((Class) (var11[0])).getClassLoader()) {
                                      break L16;
                                    } else {
                                      throw new SecurityException();
                                    }
                                  }
                                }
                                var8_ref.field_e = ((Class) (var11[0])).getDeclaredField((String) (var11[1]));
                                break L8;
                              }
                            } else {
                              L17: {
                                var10 = (Object[]) (var8_ref.field_g);
                                if (this.field_x) {
                                  if (((Class) (var10[0])).getClassLoader() != null) {
                                    break L17;
                                  } else {
                                    throw new SecurityException();
                                  }
                                } else {
                                  break L17;
                                }
                              }
                              var8_ref.field_e = ((Class) (var10[0])).getDeclaredMethod((String) (var10[1]), (Class[]) (var10[2]));
                              break L8;
                            }
                          } else {
                            if ((hm.a(64) ^ -1L) <= (field_c ^ -1L)) {
                              var8_ref.field_e = new DataInputStream(((java.net.URL) (var8_ref.field_g)).openStream());
                              break L8;
                            } else {
                              throw new IOException();
                            }
                          }
                        } else {
                          var9 = new Thread((Runnable) (var8_ref.field_g));
                          var9.setDaemon(true);
                          var9.start();
                          var9.setPriority(var8_ref.field_a);
                          var8_ref.field_e = var9;
                          break L8;
                        }
                      } else {
                        if ((hm.a(64) ^ -1L) <= (field_c ^ -1L)) {
                          try {
                              if (false) throw (uf) null;
                            L18: {
                              var8_ref.field_e = qe.a((String) (var8_ref.field_g), var8_ref.field_a, (byte) 126).a(116);
                              break L18;
                            }
                          } catch (uf decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref_uf = (uf) (Object) decompiledCaughtException;
                            var8_ref.field_e = var3_ref_uf.getMessage();
                            throw var3_ref_uf;
                          }
                          break L8;
                        } else {
                          throw new IOException();
                        }
                      }
                    } else {
                      if (field_c <= hm.a(64)) {
                        var8_ref.field_e = new java.net.Socket(java.net.InetAddress.getByName((String) (var8_ref.field_g)), var8_ref.field_a);
                        break L8;
                      } else {
                        throw new IOException();
                      }
                    }
                  }
                  var8_ref.field_b = 1;
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
                  var8_ref.field_b = 2;
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

    final ei a(int param0, String param1, int param2) {
        if (param0 != 20278) {
            this.field_n = (Object) null;
        }
        return this.a(false, param2, false, param1);
    }

    final ei a(java.awt.Frame param0, int param1) {
        lj discarded$0 = null;
        if (param1 >= -71) {
            String var4 = (String) null;
            discarded$0 = cb.a(112, (String) null, (String) null, 9);
        }
        return this.a(0, 7, -102, param0, 0);
    }

    final ei a(int param0, int param1, int param2, int param3, int param4) {
        lj discarded$0 = null;
        if (param3 != 27705) {
            String var7 = (String) null;
            discarded$0 = cb.a(-61, (String) null, (String) null, -124);
        }
        return this.a(param4 + (param0 << 155206064), 6, param3 + -27832, (Object) null, param1 + (param2 << -1754554384));
    }

    final boolean a(byte param0) {
        int var2 = -64 % ((28 - param0) / 46);
        if (!(this.field_x)) {
            return false;
        }
        if (!this.field_v) {
            return null != this.field_g ? true : false;
        }
        return this.field_s != null ? true : false;
    }

    final ei a(String param0, Class param1, byte param2) {
        int var4 = -55 / ((param2 - -22) / 54);
        return this.a(0, 9, 123, new Object[]{param1, param0}, 0);
    }

    private final ei a(boolean param0, int param1, boolean param2, String param3) {
        if (param2) {
            field_i = (String) null;
        }
        return this.a(0, param0 ? 22 : 1, 34, param3, param1);
    }

    final ei a(int param0, Runnable param1, byte param2) {
        if (param2 != -123) {
            return (ei) null;
        }
        return this.a(0, 2, param2 + 249, param1, param0);
    }

    final ei a(boolean param0) {
        if (!param0) {
            return (ei) null;
        }
        return this.a(0, 5, -110, (Object) null, 0);
    }

    final ei a(byte param0, java.net.URL param1) {
        if (param0 != -44) {
            this.field_n = (Object) null;
        }
        return this.a(0, 4, 32, param1, 0);
    }

    cb(int param0, String param1, int param2, boolean param3) throws Exception {
        String discarded$6 = null;
        String discarded$7 = null;
        java.lang.reflect.Method discarded$8 = null;
        Object discarded$9 = null;
        Exception exception = null;
        Throwable throwable = null;
        int var5_int = 0;
        vb var6 = null;
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
          this.field_h = null;
          this.field_k = null;
          this.field_q = null;
          this.field_f = false;
          this.field_x = false;
          this.field_m = null;
          this.field_e = null;
          field_o = "Unknown";
          field_l = "1.1";
          field_r = param1;
          field_t = param0;
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
        ((cb) (this)).field_x = stackIn_3_1 != 0;
        try {
          L1: {
            field_o = System.getProperty("java.vendor");
            field_l = System.getProperty("java.version");
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
          if ((field_o.toLowerCase().indexOf("microsoft") ^ -1) == 0) {
            break L3;
          } else {
            this.field_v = true;
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
            exception = (Exception) (Object) decompiledCaughtException;
            field_i = "Unknown";
            break L5;
          }
        }
        field_p = field_i.toLowerCase();
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
              field_a = System.getProperty("user.home");
              if (field_a == null) {
                break L11;
              } else {
                field_a = field_a + "/";
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
          if (null != field_a) {
            break L13;
          } else {
            field_a = "~/";
            break L13;
          }
        }
        try {
          L14: {
            this.field_w = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
          if (!this.field_v) {
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
                field_j = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
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
          va.a(field_r, 71, field_t);
          if (!this.field_x) {
            break L21;
          } else {
            this.field_e = new lj(va.a((String) null, field_t, true, "random.dat"), "rw", 25L);
            this.field_k = new lj(va.a("main_file_cache.dat2", (byte) -61), "rw", 314572800L);
            this.field_m = new lj(va.a("main_file_cache.idx255", (byte) -61), "rw", 1048576L);
            this.field_u = new lj[param2];
            var5_int = 0;
            L22: while (true) {
              if (var5_int >= param2) {
                L23: {
                  if (!this.field_v) {
                    break L23;
                  } else {
                    try {
                      L24: {
                        discarded$9 = Class.forName("mf").newInstance();
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
                      if (!this.field_v) {
                        this.field_g = Class.forName("gl").newInstance();
                        break L27;
                      } else {
                        var6 = new vb();
                        this.field_s = var6;
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
                      if (!this.field_v) {
                        this.field_n = Class.forName("cj").newInstance();
                        break L30;
                      } else {
                        this.field_d = new cp();
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
                this.field_u[var5_int] = new lj(va.a("main_file_cache.idx" + var5_int, (byte) -61), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        this.field_f = false;
        this.field_b = new Thread((Runnable) (this));
        this.field_b.setPriority(10);
        this.field_b.setDaemon(true);
        this.field_b.start();
    }

    static {
        field_c = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
