/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ab implements Runnable {
    java.awt.EventQueue field_i;
    private static String field_n;
    private ei field_k;
    private ai field_r;
    private static int field_l;
    ea field_t;
    static String field_v;
    ea field_o;
    boolean field_e;
    static java.lang.reflect.Method field_x;
    private static String field_s;
    private static String field_a;
    private od field_u;
    ea field_w;
    private Object field_f;
    private boolean field_g;
    static String field_b;
    ea[] field_c;
    private boolean field_h;
    private static volatile long field_p;
    static String field_j;
    private Object field_d;
    private ei field_q;
    private Thread field_m;

    final ei a(int param0, java.awt.Frame param1) {
        if (param0 != 0) {
            Object var4 = null;
            ei discarded$0 = ((ab) this).a((Runnable) null, true, -106);
        }
        return this.a(param0 ^ -402166672, 0, 0, 7, (Object) (Object) param1);
    }

    final ei a(Runnable param0, boolean param1, int param2) {
        if (param1) {
            return null;
        }
        return this.a(-402166672, 0, param2, 2, (Object) (Object) param0);
    }

    final void a(int param0) {
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
                L1: {
                  if (param0 == -265) {
                    break L1;
                  } else {
                    var4 = null;
                    ei discarded$1 = ((ab) this).a(55, (byte) 0, (String) null);
                    break L1;
                  }
                }
                ((ab) this).field_h = true;
                this.notifyAll();
                break L0;
              }
            }
            try {
              L2: {
                ((ab) this).field_m.join();
                break L2;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L3: {
                var2_ref = (InterruptedException) (Object) decompiledCaughtException;
                break L3;
              }
            }
            L4: {
              if (((ab) this).field_t != null) {
                {
                  L5: {
                    ((ab) this).field_t.a(true);
                    break L5;
                  }
                }
                break L4;
              } else {
                break L4;
              }
            }
            L7: {
              if (((ab) this).field_o == null) {
                break L7;
              } else {
                {
                  L8: {
                    ((ab) this).field_o.a(true);
                    break L8;
                  }
                }
                break L7;
              }
            }
            L10: {
              if (((ab) this).field_c != null) {
                var2_int = 0;
                L11: while (true) {
                  if (((ab) this).field_c.length <= var2_int) {
                    break L10;
                  } else {
                    if (null != ((ab) this).field_c[var2_int]) {
                      {
                        L12: {
                          ((ab) this).field_c[var2_int].a(true);
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
              if (((ab) this).field_w != null) {
                {
                  L15: {
                    ((ab) this).field_w.a(true);
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

    public final void run() {
        try {
            Object var2 = null;
            Throwable var2_ref = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            ck var3_ref = null;
            Exception var3_ref2 = null;
            ea var3_ref3 = null;
            int var3_int = 0;
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
            java.awt.datatransfer.Clipboard var11 = null;
            String var12 = null;
            Object[] var13 = null;
            String var14 = null;
            java.awt.Component var15 = null;
            java.awt.Frame var16 = null;
            java.awt.datatransfer.Clipboard var17 = null;
            Object[] var18 = null;
            int stackIn_82_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_81_0 = 0;
            int stackOut_80_0 = 0;
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
                    if (!((ab) this).field_h) {
                      if (((ab) this).field_k != null) {
                        L4: {
                          var8_ref = ((ab) this).field_k;
                          ((ab) this).field_k = ((ab) this).field_k.field_f;
                          if (null == ((ab) this).field_k) {
                            ((ab) this).field_q = null;
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
                    var2_int = var8_ref.field_a;
                    if (var2_int == 1) {
                      if (~rf.c(0) <= ~field_p) {
                        var8_ref.field_g = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var8_ref.field_c), var8_ref.field_d);
                        break L8;
                      } else {
                        throw new IOException();
                      }
                    } else {
                      if (var2_int != 22) {
                        if (2 != var2_int) {
                          if (var2_int != 4) {
                            if (var2_int != 8) {
                              if (var2_int == 9) {
                                L9: {
                                  var18 = (Object[]) var8_ref.field_c;
                                  if (((ab) this).field_e) {
                                    if (null != ((Class) var18[0]).getClassLoader()) {
                                      break L9;
                                    } else {
                                      throw new SecurityException();
                                    }
                                  } else {
                                    break L9;
                                  }
                                }
                                var8_ref.field_g = (Object) (Object) ((Class) var18[0]).getDeclaredField((String) var18[1]);
                                break L8;
                              } else {
                                if (var2_int != 18) {
                                  if (var2_int == 19) {
                                    var7 = (java.awt.datatransfer.Transferable) var8_ref.field_c;
                                    var17 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var17.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L8;
                                  } else {
                                    if (!((ab) this).field_e) {
                                      throw ab.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    } else {
                                      if (3 != var2_int) {
                                        if (var2_int == 21) {
                                          if (~rf.c(0) <= ~field_p) {
                                            var8_ref.field_g = (Object) (Object) java.net.InetAddress.getByName((String) var8_ref.field_c).getAddress();
                                            break L8;
                                          } else {
                                            throw new IOException();
                                          }
                                        } else {
                                          if (var2_int == 5) {
                                            if (!((ab) this).field_g) {
                                              var8_ref.field_g = Class.forName("tk").getMethod("listmodes", new Class[0]).invoke(((ab) this).field_f, new Object[0]);
                                              break L8;
                                            } else {
                                              var8_ref.field_g = (Object) (Object) ((ab) this).field_r.a(0);
                                              break L8;
                                            }
                                          } else {
                                            if (var2_int == 6) {
                                              var16 = new java.awt.Frame("Jagex Full Screen");
                                              var8_ref.field_g = (Object) (Object) var16;
                                              var16.setResizable(false);
                                              if (((ab) this).field_g) {
                                                ((ab) this).field_r.a(var16, var8_ref.field_e >> 16, 13486, var8_ref.field_d >>> 16, 65535 & var8_ref.field_d, var8_ref.field_e & 65535);
                                                break L8;
                                              } else {
                                                Object discarded$7 = Class.forName("tk").getMethod("enter", new Class[5]).invoke(((ab) this).field_f, new Object[5]);
                                                break L8;
                                              }
                                            } else {
                                              if (7 == var2_int) {
                                                if (((ab) this).field_g) {
                                                  ((ab) this).field_r.a((java.awt.Frame) var8_ref.field_c, -20);
                                                  break L8;
                                                } else {
                                                  Object discarded$8 = Class.forName("tk").getMethod("exit", new Class[0]).invoke(((ab) this).field_f, new Object[0]);
                                                  break L8;
                                                }
                                              } else {
                                                if (12 == var2_int) {
                                                  var3_ref3 = ab.a((String) var8_ref.field_c, 2, field_s, field_l);
                                                  var8_ref.field_g = (Object) (Object) var3_ref3;
                                                  break L8;
                                                } else {
                                                  if (var2_int == 13) {
                                                    var3_ref3 = ab.a((String) var8_ref.field_c, 2, "", field_l);
                                                    var8_ref.field_g = (Object) (Object) var3_ref3;
                                                    break L8;
                                                  } else {
                                                    L10: {
                                                      if (!((ab) this).field_e) {
                                                        break L10;
                                                      } else {
                                                        if (var2_int == 14) {
                                                          var3_int = var8_ref.field_d;
                                                          var4 = var8_ref.field_e;
                                                          if (!((ab) this).field_g) {
                                                            Object discarded$9 = Class.forName("lc").getDeclaredMethod("movemouse", new Class[2]).invoke(((ab) this).field_d, new Object[2]);
                                                            break L8;
                                                          } else {
                                                            ((ab) this).field_u.a(var3_int, var4, 123);
                                                            break L8;
                                                          }
                                                        } else {
                                                          break L10;
                                                        }
                                                      }
                                                    }
                                                    L11: {
                                                      if (!((ab) this).field_e) {
                                                        break L11;
                                                      } else {
                                                        if (var2_int == 15) {
                                                          L12: {
                                                            if (0 == var8_ref.field_d) {
                                                              stackOut_81_0 = 0;
                                                              stackIn_82_0 = stackOut_81_0;
                                                              break L12;
                                                            } else {
                                                              stackOut_80_0 = 1;
                                                              stackIn_82_0 = stackOut_80_0;
                                                              break L12;
                                                            }
                                                          }
                                                          var3_int = stackIn_82_0;
                                                          var15 = (java.awt.Component) var8_ref.field_c;
                                                          if (((ab) this).field_g) {
                                                            ((ab) this).field_u.a(var15, var3_int != 0, true);
                                                            break L8;
                                                          } else {
                                                            Object discarded$10 = Class.forName("lc").getDeclaredMethod("showcursor", new Class[2]).invoke(((ab) this).field_d, new Object[2]);
                                                            break L8;
                                                          }
                                                        } else {
                                                          break L11;
                                                        }
                                                      }
                                                    }
                                                    L13: {
                                                      if (((ab) this).field_g) {
                                                        break L13;
                                                      } else {
                                                        if (var2_int != 17) {
                                                          break L13;
                                                        } else {
                                                          var13 = (Object[]) var8_ref.field_c;
                                                          Object discarded$11 = Class.forName("lc").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((ab) this).field_d, new Object[5]);
                                                          break L8;
                                                        }
                                                      }
                                                    }
                                                    if (var2_int != 16) {
                                                      throw ab.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    } else {
                                                      try {
                                                        L14: {
                                                          if (field_b.startsWith("win")) {
                                                            L15: {
                                                              var14 = (String) var8_ref.field_c;
                                                              if (var14.startsWith("http://")) {
                                                                break L15;
                                                              } else {
                                                                if (var14.startsWith("https://")) {
                                                                  break L15;
                                                                } else {
                                                                  throw ab.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L16: while (true) {
                                                              if (~var14.length() >= ~var5) {
                                                                Process discarded$12 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var14 + "\"");
                                                                var8_ref.field_g = null;
                                                                break L14;
                                                              } else {
                                                                if (var4_ref_String.indexOf((int) var14.charAt(var5)) == -1) {
                                                                  throw ab.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  var5++;
                                                                  continue L16;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            throw ab.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter1) {
                                                        decompiledCaughtException = decompiledCaughtParameter1;
                                                        var3_ref2 = (Exception) (Object) decompiledCaughtException;
                                                        var8_ref.field_g = (Object) (Object) var3_ref2;
                                                        throw ab.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                                                      }
                                                      break L8;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        if (field_p > rf.c(0)) {
                                          throw new IOException();
                                        } else {
                                          var12 = (var8_ref.field_d >> 24 & 255) + "." + (255 & var8_ref.field_d >> 16) + "." + ((var8_ref.field_d & 65321) >> 8) + "." + (255 & var8_ref.field_d);
                                          var8_ref.field_g = (Object) (Object) java.net.InetAddress.getByName(var12).getHostName();
                                          break L8;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8_ref.field_g = (Object) (Object) var11.getContents((Object) null);
                                  break L8;
                                }
                              }
                            } else {
                              L17: {
                                var10 = (Object[]) var8_ref.field_c;
                                if (((ab) this).field_e) {
                                  if (((Class) var10[0]).getClassLoader() == null) {
                                    throw new SecurityException();
                                  } else {
                                    break L17;
                                  }
                                } else {
                                  break L17;
                                }
                              }
                              var8_ref.field_g = (Object) (Object) ((Class) var10[0]).getDeclaredMethod((String) var10[1], (Class[]) var10[2]);
                              break L8;
                            }
                          } else {
                            if (~field_p < ~rf.c(0)) {
                              throw new IOException();
                            } else {
                              var8_ref.field_g = (Object) (Object) new DataInputStream(((java.net.URL) var8_ref.field_c).openStream());
                              break L8;
                            }
                          }
                        } else {
                          var9 = new Thread((Runnable) var8_ref.field_c);
                          var9.setDaemon(true);
                          var9.start();
                          var9.setPriority(var8_ref.field_d);
                          var8_ref.field_g = (Object) (Object) var9;
                          break L8;
                        }
                      } else {
                        if (~rf.c(0) > ~field_p) {
                          throw new IOException();
                        } else {
                          try {
                            L18: {
                              int discarded$13 = 127;
                              var8_ref.field_g = (Object) (Object) v.a((String) var8_ref.field_c, var8_ref.field_d).b(51);
                              break L18;
                            }
                          } catch (java.lang.Exception decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref = (ck) (Object) decompiledCaughtException;
                            var8_ref.field_g = (Object) (Object) var3_ref.getMessage();
                            throw var3_ref;
                          }
                          break L8;
                        }
                      }
                    }
                  }
                  var8_ref.field_b = 1;
                  break L7;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                L19: {
                  var2_ref = decompiledCaughtException;
                  var8_ref.field_b = 2;
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

    private final ei a(byte param0, boolean param1, String param2, int param3) {
        return this.a(-402166672, 0, param3, 1, (Object) (Object) param2);
    }

    final boolean b(int param0) {
        if (param0 != 0) {
            Object var3 = null;
            ei discarded$0 = this.a(25, 83, 116, 75, (Object) null);
        }
        if (!(((ab) this).field_e)) {
            return false;
        }
        if (!((ab) this).field_g) {
            return null != ((ab) this).field_f ? true : false;
        }
        return null != ((ab) this).field_r ? true : false;
    }

    final ei a(int param0, byte param1, String param2) {
        int var4 = -71 % ((71 - param1) / 46);
        return this.a((byte) -126, false, param2, param0);
    }

    final ei a(String param0, int param1, Class param2) {
        if (param1 != 2) {
            ((ab) this).field_f = null;
        }
        return this.a(param1 ^ -402166670, 0, 0, 9, (Object) (Object) new Object[2]);
    }

    final ei a(int param0, int param1, int param2, int param3, int param4) {
        if (param0 != 28460) {
            ((ab) this).field_i = null;
        }
        return this.a(-402166672, (param3 << 16) - -param4, param2 + (param1 << 16), 6, (Object) null);
    }

    final ei a(int param0, java.net.URL param1) {
        if (param0 != -23816) {
            ((ab) this).field_c = null;
        }
        return this.a(-402166672, 0, 0, 4, (Object) (Object) param1);
    }

    final ei a(byte param0) {
        if (param0 < 67) {
            return null;
        }
        return this.a(-402166672, 0, 0, 5, (Object) null);
    }

    final ei a(String param0, Class param1, Class[] param2, byte param3) {
        if (param3 != 113) {
            Object var6 = null;
            ei discarded$0 = ((ab) this).a((String) null, (Class) null, (Class[]) null, (byte) -43);
        }
        return this.a(-402166672, 0, 0, 8, (Object) (Object) new Object[3]);
    }

    private final ei a(int param0, int param1, int param2, int param3, Object param4) {
        ei var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          var6 = new ei();
          var6.field_e = param1;
          var6.field_a = param3;
          var6.field_c = param4;
          var6.field_d = param2;
          if (param0 == -402166672) {
            break L0;
          } else {
            field_v = null;
            break L0;
          }
        }
        var7 = this;
        synchronized (var7) {
          L1: {
            L2: {
              if (null == ((ab) this).field_q) {
                ((ab) this).field_k = var6;
                ((ab) this).field_q = var6;
                break L2;
              } else {
                ((ab) this).field_q.field_f = var6;
                ((ab) this).field_q = var6;
                break L2;
              }
            }
            this.notify();
            break L1;
          }
        }
        return var6;
    }

    private final static ea a(String param0, int param1, String param2, int param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            ea var8_ref = null;
            Object var9 = null;
            ea stackIn_12_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            ea stackOut_11_0 = null;
            L0: {
              if (param3 != 33) {
                if (param3 != 34) {
                  var4 = "jagex_" + param2 + "_preferences" + param0 + ".dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param2 + "_preferences" + param0 + "_wip.dat";
                  break L0;
                }
              } else {
                var4 = "jagex_" + param2 + "_preferences" + param0 + "_rc.dat";
                break L0;
              }
            }
            var5_array = new String[]{"c:/rscache/", "/rscache/", field_n, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            var6 = 0;
            L1: while (true) {
              if (var6 >= var5_array.length) {
                if (param1 != 2) {
                  var9 = null;
                  ea discarded$1 = ab.a((String) null, -113, (String) null, 96);
                  return null;
                } else {
                  return null;
                }
              } else {
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
                    var8_ref = new ea(new File(var7, var4), "rw", 10000L);
                    stackOut_11_0 = (ea) var8_ref;
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

    ab(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        ai var7 = null;
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
          ((ab) this).field_k = null;
          ((ab) this).field_w = null;
          ((ab) this).field_t = null;
          ((ab) this).field_g = false;
          ((ab) this).field_h = false;
          ((ab) this).field_o = null;
          ((ab) this).field_e = false;
          ((ab) this).field_q = null;
          field_j = "Unknown";
          field_v = "1.1";
          field_s = param1;
          field_l = param0;
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
        ((ab) this).field_e = stackIn_3_1 != 0;
        try {
          L1: {
            field_j = System.getProperty("java.vendor");
            field_v = System.getProperty("java.version");
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
          if (-1 == field_j.toLowerCase().indexOf("microsoft")) {
            break L3;
          } else {
            ((ab) this).field_g = true;
            break L3;
          }
        }
        try {
          L4: {
            field_a = System.getProperty("os.name");
            break L4;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var5 = (Exception) (Object) decompiledCaughtException;
            field_a = "Unknown";
            break L5;
          }
        }
        field_b = field_a.toLowerCase();
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
              if (field_n == null) {
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
          if (field_n == null) {
            field_n = "~/";
            break L13;
          } else {
            break L13;
          }
        }
        try {
          L14: {
            ((ab) this).field_i = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
          if (((ab) this).field_g) {
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
          s.a(field_l, field_s, false);
          if (!((ab) this).field_e) {
            break L21;
          } else {
            ((ab) this).field_w = new ea(s.a("random.dat", (String) null, field_l, (byte) -45), "rw", 25L);
            ((ab) this).field_t = new ea(s.a(true, "main_file_cache.dat2"), "rw", 314572800L);
            ((ab) this).field_o = new ea(s.a(true, "main_file_cache.idx255"), "rw", 1048576L);
            ((ab) this).field_c = new ea[param2];
            var5_int = 0;
            L22: while (true) {
              if (var5_int >= param2) {
                L23: {
                  if (((ab) this).field_g) {
                    try {
                      L24: {
                        Object discarded$7 = Class.forName("dk").newInstance();
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
                      if (!((ab) this).field_g) {
                        ((ab) this).field_f = Class.forName("tk").newInstance();
                        break L27;
                      } else {
                        var7 = new ai();
                        ((ab) this).field_r = var7;
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
                      if (!((ab) this).field_g) {
                        ((ab) this).field_d = Class.forName("lc").newInstance();
                        break L30;
                      } else {
                        ((ab) this).field_u = new od();
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
                ((ab) this).field_c[var5_int] = new ea(s.a(true, "main_file_cache.idx" + var5_int), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        ((ab) this).field_h = false;
        ((ab) this).field_m = new Thread((Runnable) this);
        ((ab) this).field_m.setPriority(10);
        ((ab) this).field_m.setDaemon(true);
        ((ab) this).field_m.start();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
