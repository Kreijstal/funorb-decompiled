/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class eab implements Runnable {
    private tlb field_e;
    static String field_s;
    boolean field_j;
    private mob field_u;
    private Thread field_p;
    au field_d;
    au field_o;
    private static int field_b;
    au field_t;
    private static String field_v;
    private mob field_f;
    private Object field_a;
    private static volatile long field_h;
    private eea field_x;
    private Object field_c;
    static java.lang.reflect.Method field_q;
    private static String field_m;
    static String field_r;
    private static String field_i;
    static String field_w;
    boolean field_k;
    au[] field_l;
    private boolean field_g;
    java.awt.EventQueue field_n;

    final mob a(int param0, int param1, Runnable param2) {
        mob discarded$0 = null;
        if (param0 != 0) {
            Object var5 = (Object) null;
            discarded$0 = this.a((byte) -95, 5, 55, 125, (Object) null);
        }
        return this.a((byte) -107, 2, param1, 0, param2);
    }

    final mob a(java.awt.Component param0, boolean param1, byte param2) {
        mob discarded$0 = null;
        if (param2 > -92) {
            java.awt.datatransfer.Transferable var5 = (java.awt.datatransfer.Transferable) null;
            discarded$0 = this.a((byte) 95, (java.awt.datatransfer.Transferable) null);
        }
        return this.a((byte) -107, 15, param1 ? 1 : 0, 0, param0);
    }

    final boolean a(int param0) {
        if (!this.field_k) {
            return false;
        }
        if (param0 != 0) {
            return true;
        }
        if (!this.field_j) {
            return this.field_c != null ? true : false;
        }
        return this.field_x != null ? true : false;
    }

    final mob a(String param0, Class param1, int param2) {
        mob discarded$0 = null;
        if (param2 != -6576) {
            String var5 = (String) null;
            discarded$0 = this.a(-99, (String) null, -92);
        }
        return this.a((byte) -107, 9, 0, 0, new Object[]{param1, param0});
    }

    private final mob a(int param0, boolean param1, byte param2, String param3) {
        if (param2 != 85) {
            return (mob) null;
        }
        return this.a((byte) -107, !param1 ? 1 : 22, param0, 0, param3);
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
                this.field_g = true;
                this.notifyAll();
                break L0;
              }
            }
            try {
              L1: {
                this.field_p.join();
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
              if (this.field_d != null) {
                try {
                  L4: {
                    this.field_d.a(false);
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
              if (this.field_t != null) {
                try {
                  L7: {
                    this.field_t.a(false);
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
            L9: {
              if (this.field_l == null) {
                break L9;
              } else {
                var2_int = 0;
                L10: while (true) {
                  if (this.field_l.length <= var2_int) {
                    break L9;
                  } else {
                    if (this.field_l[var2_int] != null) {
                      try {
                        L11: {
                          this.field_l[var2_int].a(false);
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
              }
            }
            L13: {
              if (param0 == 0) {
                break L13;
              } else {
                this.field_d = (au) null;
                break L13;
              }
            }
            L14: {
              if (null == this.field_o) {
                break L14;
              } else {
                try {
                  L15: {
                    this.field_o.a(false);
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
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final mob a(Class[] param0, byte param1, Class param2, String param3) {
        mob discarded$0 = null;
        if (param1 < 12) {
            Runnable var6 = (Runnable) null;
            discarded$0 = this.a(2, 98, (Runnable) null);
        }
        return this.a((byte) -107, 8, 0, 0, new Object[]{param2, param3, param0});
    }

    private final mob a(byte param0, int param1, int param2, int param3, Object param4) {
        mob discarded$4 = null;
        mob var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        java.awt.Frame var9 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (param0 == -107) {
            break L0;
          } else {
            var9 = (java.awt.Frame) null;
            discarded$4 = this.a((java.awt.Frame) null, (byte) 92);
            break L0;
          }
        }
        var6 = new mob();
        var6.field_b = param4;
        var6.field_c = param1;
        var6.field_e = param3;
        var6.field_a = param2;
        var7 = this;
        synchronized (var7) {
          L1: {
            L2: {
              if (this.field_u == null) {
                this.field_f = var6;
                this.field_u = var6;
                break L2;
              } else {
                this.field_u.field_g = var6;
                this.field_u = var6;
                break L2;
              }
            }
            this.notify();
            break L1;
          }
        }
        return var6;
    }

    final mob a(java.net.URL param0, int param1) {
        if (param1 < 90) {
            return (mob) null;
        }
        return this.a((byte) -107, 4, 0, 0, param0);
    }

    final mob a(byte param0, java.awt.datatransfer.Transferable param1) {
        boolean discarded$0 = false;
        if (param0 != -45) {
            discarded$0 = this.a(-33);
        }
        return this.a((byte) -107, 19, 0, 0, param1);
    }

    final mob a(int param0, String param1, int param2) {
        int var4 = -31 % ((-10 - param2) / 45);
        return this.a(param0, false, (byte) 85, param1);
    }

    final mob a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 != 4) {
            this.field_x = (eea) null;
        }
        return this.a((byte) -107, 6, (param3 << 1233998256) + param0, (param2 << -1815172880) + param4, (Object) null);
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
            Exception var3_ref = null;
            ndb var3_ref2 = null;
            au var3_ref3 = null;
            int var3_int = 0;
            Throwable var4_ref_Throwable = null;
            int var4 = 0;
            String var4_ref_String = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            Object var8 = null;
            mob var8_ref = null;
            Object[] var9 = null;
            java.awt.datatransfer.Clipboard var10 = null;
            Object[] var11 = null;
            String var12 = null;
            java.awt.Component var13 = null;
            java.awt.Frame var14 = null;
            String var15 = null;
            java.awt.datatransfer.Clipboard var16 = null;
            Object[] var17 = null;
            Thread var18 = null;
            int stackIn_81_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_80_0 = 0;
            int stackOut_79_0 = 0;
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
                    if (!this.field_g) {
                      if (this.field_f == null) {
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
                          var8_ref = this.field_f;
                          this.field_f = this.field_f.field_g;
                          if (null != this.field_f) {
                            break L6;
                          } else {
                            this.field_u = null;
                            break L6;
                          }
                        }
                        break L2;
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
                    var2_int = var8_ref.field_c;
                    if (1 != var2_int) {
                      if (22 == var2_int) {
                        if ((wt.a(false) ^ -1L) <= (field_h ^ -1L)) {
                          try {
                              if (false) throw (ndb) null;
                            L9: {
                              var8_ref.field_d = ppb.a((String) (var8_ref.field_b), var8_ref.field_a, (byte) -112).a(2048);
                              break L9;
                            }
                          } catch (ndb decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref2 = (ndb) (Object) decompiledCaughtException;
                            var8_ref.field_d = var3_ref2.getMessage();
                            throw var3_ref2;
                          }
                          break L8;
                        } else {
                          throw new IOException();
                        }
                      } else {
                        if (-3 == (var2_int ^ -1)) {
                          var18 = new Thread((Runnable) (var8_ref.field_b));
                          var18.setDaemon(true);
                          var18.start();
                          var18.setPriority(var8_ref.field_a);
                          var8_ref.field_d = var18;
                          break L8;
                        } else {
                          if (4 != var2_int) {
                            if ((var2_int ^ -1) != -9) {
                              if (9 == var2_int) {
                                L10: {
                                  var17 = (Object[]) (var8_ref.field_b);
                                  if (this.field_k) {
                                    if (null != ((Class) (var17[0])).getClassLoader()) {
                                      break L10;
                                    } else {
                                      throw new SecurityException();
                                    }
                                  } else {
                                    break L10;
                                  }
                                }
                                var8_ref.field_d = ((Class) (var17[0])).getDeclaredField((String) (var17[1]));
                                break L8;
                              } else {
                                if (-19 != (var2_int ^ -1)) {
                                  if ((var2_int ^ -1) == -20) {
                                    var7 = (java.awt.datatransfer.Transferable) (var8_ref.field_b);
                                    var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var16.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L8;
                                  } else {
                                    if (!this.field_k) {
                                      throw eab.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    } else {
                                      if ((var2_int ^ -1) == -4) {
                                        if (wt.a(false) < field_h) {
                                          throw new IOException();
                                        } else {
                                          var15 = (255 & var8_ref.field_a >> 1743848856) + "." + ((var8_ref.field_a & 16719400) >> -1852358736) + "." + (255 & var8_ref.field_a >> 1405733512) + "." + (var8_ref.field_a & 255);
                                          var8_ref.field_d = java.net.InetAddress.getByName(var15).getHostName();
                                          break L8;
                                        }
                                      } else {
                                        if ((var2_int ^ -1) != -22) {
                                          if (-6 == (var2_int ^ -1)) {
                                            if (!this.field_j) {
                                              var8_ref.field_d = Class.forName("rk").getMethod("listmodes", new Class[]{}).invoke(this.field_c, new Object[]{});
                                              break L8;
                                            } else {
                                              var8_ref.field_d = this.field_x.a(false);
                                              break L8;
                                            }
                                          } else {
                                            if ((var2_int ^ -1) == -7) {
                                              var14 = new java.awt.Frame("Jagex Full Screen");
                                              var8_ref.field_d = var14;
                                              var14.setResizable(false);
                                              if (this.field_j) {
                                                this.field_x.a(-70, var14, var8_ref.field_e >> -98560208, var8_ref.field_a >>> 1866735120, var8_ref.field_e & 65535, var8_ref.field_a & 65535);
                                                break L8;
                                              } else {
                                                discarded$6 = Class.forName("rk").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_c, new Object[]{var14, new Integer(var8_ref.field_a >>> -1478193680), new Integer(var8_ref.field_a & 65535), new Integer(var8_ref.field_e >> 604695568), new Integer(var8_ref.field_e & 65535)});
                                                break L8;
                                              }
                                            } else {
                                              if (var2_int != 7) {
                                                if (-13 != (var2_int ^ -1)) {
                                                  if (13 != var2_int) {
                                                    L11: {
                                                      if (!this.field_k) {
                                                        break L11;
                                                      } else {
                                                        if (var2_int == 14) {
                                                          var3_int = var8_ref.field_a;
                                                          var4 = var8_ref.field_e;
                                                          if (!this.field_j) {
                                                            discarded$7 = Class.forName("jg").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_a, new Object[]{new Integer(var3_int), new Integer(var4)});
                                                            break L8;
                                                          } else {
                                                            this.field_e.a(var4, var3_int, (byte) -122);
                                                            break L8;
                                                          }
                                                        } else {
                                                          break L11;
                                                        }
                                                      }
                                                    }
                                                    L12: {
                                                      if (!this.field_k) {
                                                        break L12;
                                                      } else {
                                                        if (15 == var2_int) {
                                                          L13: {
                                                            if (0 == var8_ref.field_a) {
                                                              stackOut_80_0 = 0;
                                                              stackIn_81_0 = stackOut_80_0;
                                                              break L13;
                                                            } else {
                                                              stackOut_79_0 = 1;
                                                              stackIn_81_0 = stackOut_79_0;
                                                              break L13;
                                                            }
                                                          }
                                                          var3_int = stackIn_81_0;
                                                          var13 = (java.awt.Component) (var8_ref.field_b);
                                                          if (!this.field_j) {
                                                            discarded$8 = Class.forName("jg").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_a, new Object[]{var13, new Boolean(var3_int != 0)});
                                                            break L8;
                                                          } else {
                                                            this.field_e.a(var13, -4, var3_int != 0);
                                                            break L8;
                                                          }
                                                        } else {
                                                          break L12;
                                                        }
                                                      }
                                                    }
                                                    L14: {
                                                      if (this.field_j) {
                                                        break L14;
                                                      } else {
                                                        if (17 != var2_int) {
                                                          break L14;
                                                        } else {
                                                          var11 = (Object[]) (var8_ref.field_b);
                                                          discarded$9 = Class.forName("jg").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_a, new Object[]{var11[0], var11[1], new Integer(var8_ref.field_a), new Integer(var8_ref.field_e), var11[2]});
                                                          break L8;
                                                        }
                                                      }
                                                    }
                                                    if (var2_int != 16) {
                                                      throw eab.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    } else {
                                                      try {
                                                        L15: {
                                                          if (!field_s.startsWith("win")) {
                                                            throw eab.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          } else {
                                                            L16: {
                                                              var12 = (String) (var8_ref.field_b);
                                                              if (var12.startsWith("http://")) {
                                                                break L16;
                                                              } else {
                                                                if (!var12.startsWith("https://")) {
                                                                  throw eab.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  break L16;
                                                                }
                                                              }
                                                            }
                                                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L17: while (true) {
                                                              if (var5 >= var12.length()) {
                                                                discarded$10 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var12 + "\"");
                                                                var8_ref.field_d = null;
                                                                break L15;
                                                              } else {
                                                                if (0 != (var4_ref_String.indexOf((int) var12.charAt(var5)) ^ -1)) {
                                                                  var5++;
                                                                  continue L17;
                                                                } else {
                                                                  throw eab.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                                                        decompiledCaughtException = decompiledCaughtParameter2;
                                                        var3_ref = (Exception) (Object) decompiledCaughtException;
                                                        var8_ref.field_d = var3_ref;
                                                        throw eab.<RuntimeException>$cfr$sneakyThrow(var3_ref);
                                                      }
                                                      break L8;
                                                    }
                                                  } else {
                                                    var3_ref3 = eab.a(field_b, "", (byte) -127, (String) (var8_ref.field_b));
                                                    var8_ref.field_d = var3_ref3;
                                                    break L8;
                                                  }
                                                } else {
                                                  var3_ref3 = eab.a(field_b, field_m, (byte) -128, (String) (var8_ref.field_b));
                                                  var8_ref.field_d = var3_ref3;
                                                  break L8;
                                                }
                                              } else {
                                                if (this.field_j) {
                                                  this.field_x.a(-76, (java.awt.Frame) (var8_ref.field_b));
                                                  break L8;
                                                } else {
                                                  discarded$11 = Class.forName("rk").getMethod("exit", new Class[]{}).invoke(this.field_c, new Object[]{});
                                                  break L8;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          if ((wt.a(false) ^ -1L) > (field_h ^ -1L)) {
                                            throw new IOException();
                                          } else {
                                            var8_ref.field_d = java.net.InetAddress.getByName((String) (var8_ref.field_b)).getAddress();
                                            break L8;
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var10 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8_ref.field_d = var10.getContents((Object) null);
                                  break L8;
                                }
                              }
                            } else {
                              L18: {
                                var9 = (Object[]) (var8_ref.field_b);
                                if (this.field_k) {
                                  if (null != ((Class) (var9[0])).getClassLoader()) {
                                    break L18;
                                  } else {
                                    throw new SecurityException();
                                  }
                                } else {
                                  break L18;
                                }
                              }
                              var8_ref.field_d = ((Class) (var9[0])).getDeclaredMethod((String) (var9[1]), (Class[]) (var9[2]));
                              break L8;
                            }
                          } else {
                            if ((field_h ^ -1L) < (wt.a(false) ^ -1L)) {
                              throw new IOException();
                            } else {
                              var8_ref.field_d = new DataInputStream(((java.net.URL) (var8_ref.field_b)).openStream());
                              break L8;
                            }
                          }
                        }
                      }
                    } else {
                      if ((wt.a(false) ^ -1L) <= (field_h ^ -1L)) {
                        var8_ref.field_d = new java.net.Socket(java.net.InetAddress.getByName((String) (var8_ref.field_b)), var8_ref.field_a);
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

    private final static au a(int param0, String param1, byte param2, String param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            Object var7 = null;
            Exception var8 = null;
            au var8_ref = null;
            au stackIn_14_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            au stackOut_13_0 = null;
            String var7_ref = null;
            if (param2 < -126) {
              L0: {
                if (-34 == (param0 ^ -1)) {
                  var4 = "jagex_" + param1 + "_preferences" + param3 + "_rc.dat";
                  break L0;
                } else {
                  if ((param0 ^ -1) == -35) {
                    var4 = "jagex_" + param1 + "_preferences" + param3 + "_wip.dat";
                    break L0;
                  } else {
                    var4 = "jagex_" + param1 + "_preferences" + param3 + ".dat";
                    break L0;
                  }
                }
              }
              var5_array = new String[]{"c:/rscache/", "/rscache/", field_v, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
              var6 = 0;
              L1: while (true) {
                if (var6 < var5_array.length) {
                  L2: {
                    var7_ref = var5_array[var6];
                    if (-1 <= (var7_ref.length() ^ -1)) {
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
                      var8_ref = new au(new File(var7_ref, var4), "rw", 10000L);
                      stackOut_13_0 = (au) (var8_ref);
                      stackIn_14_0 = stackOut_13_0;
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
                    return stackIn_14_0;
                  } else {
                    continue L1;
                  }
                } else {
                  return null;
                }
              }
            } else {
              return (au) null;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(byte[] param0, byte param1, File param2) {
        FileOutputStream var4 = null;
        IOException var4_ref = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        try {
          L0: {
            L1: {
              var4 = new FileOutputStream(param2);
              var4.write(param0, 0, param0.length);
              if (param1 == 110) {
                break L1;
              } else {
                field_m = (String) null;
                break L1;
              }
            }
            var4.close();
            stackOut_2_0 = 1;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (IOException) (Object) decompiledCaughtException;
          throw new RuntimeException();
        }
        return stackIn_3_0 != 0;
    }

    final mob a(java.awt.Component param0, int param1, int param2, int param3) {
        mob discarded$0 = null;
        java.awt.Point var5 = param0.getLocationOnScreen();
        if (param3 != 14) {
            java.awt.Component var6 = (java.awt.Component) null;
            discarded$0 = this.a((java.awt.Component) null, true, (byte) 77);
        }
        return this.a((byte) -107, 14, var5.x + param2, var5.y + param1, (Object) null);
    }

    final mob c(int param0) {
        if (param0 < 91) {
            return (mob) null;
        }
        return this.a((byte) -107, 18, 0, 0, (Object) null);
    }

    final mob a(java.awt.Frame param0, byte param1) {
        int var3 = -90 % ((param1 - -51) / 55);
        return this.a((byte) -107, 7, 0, 0, param0);
    }

    final mob d(int param0) {
        if (param0 <= 84) {
            return (mob) null;
        }
        return this.a((byte) -107, 5, 0, 0, (Object) null);
    }

    eab(int param0, String param1, int param2, boolean param3) throws Exception {
        String discarded$9 = null;
        String discarded$10 = null;
        java.lang.reflect.Method discarded$11 = null;
        Object discarded$12 = null;
        int discarded$13 = 0;
        Exception exception = null;
        Throwable throwable = null;
        int var5_int = 0;
        ThreadGroup var5 = null;
        ThreadGroup var6 = null;
        Thread[] var7 = null;
        int var8 = 0;
        eea var10 = null;
        ThreadGroup var11 = null;
        ThreadGroup var12 = null;
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
          this.field_u = null;
          this.field_d = null;
          this.field_t = null;
          this.field_j = false;
          this.field_o = null;
          this.field_g = false;
          this.field_f = null;
          this.field_k = false;
          field_m = param1;
          field_r = "1.1";
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
        ((eab) (this)).field_k = stackIn_3_1 != 0;
        field_b = param0;
        field_w = "Unknown";
        try {
          L1: {
            field_w = System.getProperty("java.vendor");
            field_r = System.getProperty("java.version");
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
          if (field_w.toLowerCase().indexOf("microsoft") != -1) {
            this.field_j = true;
            break L3;
          } else {
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
        field_s = field_i.toLowerCase();
        try {
          L6: {
            discarded$9 = System.getProperty("os.arch").toLowerCase();
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
            discarded$10 = System.getProperty("os.version").toLowerCase();
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
              field_v = System.getProperty("user.home");
              if (field_v == null) {
                break L11;
              } else {
                field_v = field_v + "/";
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
          if (field_v == null) {
            field_v = "~/";
            break L13;
          } else {
            break L13;
          }
        }
        try {
          L14: {
            this.field_n = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
          if (this.field_j) {
            break L16;
          } else {
            try {
              L17: {
                discarded$11 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[]{Boolean.TYPE});
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
                field_q = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
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
          lfb.a(field_b, -109, field_m);
          if (!this.field_k) {
            break L21;
          } else {
            this.field_o = new au(lfb.a("random.dat", -1, (String) null, field_b), "rw", 25L);
            this.field_d = new au(lfb.a("main_file_cache.dat2", (byte) 34), "rw", 314572800L);
            this.field_t = new au(lfb.a("main_file_cache.idx255", (byte) 34), "rw", 1048576L);
            this.field_l = new au[param2];
            var5_int = 0;
            L22: while (true) {
              if (var5_int >= param2) {
                L23: {
                  if (!this.field_j) {
                    break L23;
                  } else {
                    try {
                      L24: {
                        discarded$12 = Class.forName("dna").newInstance();
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
                      if (this.field_j) {
                        var10 = new eea();
                        this.field_x = var10;
                        break L27;
                      } else {
                        this.field_c = Class.forName("rk").newInstance();
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
                      if (this.field_j) {
                        this.field_e = new tlb();
                        break L30;
                      } else {
                        this.field_a = Class.forName("jg").newInstance();
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
                this.field_l[var5_int] = new au(lfb.a("main_file_cache.idx" + var5_int, (byte) 34), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        L32: {
          if (!this.field_k) {
            break L32;
          } else {
            if (this.field_j) {
              break L32;
            } else {
              var11 = Thread.currentThread().getThreadGroup();
              var5 = var11;
              var6 = var11.getParent();
              L33: while (true) {
                if (var6 == null) {
                  var7 = new Thread[1000];
                  discarded$13 = var5.enumerate(var7);
                  var8 = 0;
                  L34: while (true) {
                    if (var7.length <= var8) {
                      break L32;
                    } else {
                      if (var7[var8] != null) {
                        if (var7[var8].getName().startsWith("AWT")) {
                          var7[var8].setPriority(1);
                          var8++;
                          continue L34;
                        } else {
                          var8++;
                          continue L34;
                        }
                      } else {
                        var8++;
                        continue L34;
                      }
                    }
                  }
                } else {
                  var12 = var6;
                  var5 = var12;
                  var6 = var12.getParent();
                  continue L33;
                }
              }
            }
          }
        }
        this.field_g = false;
        this.field_p = new Thread((Runnable) (this));
        this.field_p.setPriority(10);
        this.field_p.setDaemon(true);
        this.field_p.start();
    }

    static {
        field_h = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
