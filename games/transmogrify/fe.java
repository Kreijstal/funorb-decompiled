/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fe implements Runnable {
    private Thread field_l;
    static String field_c;
    static String field_k;
    static java.lang.reflect.Method field_x;
    private boolean field_r;
    private static String field_u;
    java.awt.EventQueue field_m;
    private ib field_p;
    private t field_o;
    private Object field_t;
    private static int field_g;
    private static String field_n;
    private ke field_q;
    private static volatile long field_a;
    boolean field_e;
    static String field_w;
    di field_h;
    di field_v;
    di field_b;
    di[] field_s;
    private static String field_f;
    private Object field_d;
    private ib field_j;
    private boolean field_i;

    final boolean b(int param0) {
        if (!((fe) this).field_e) {
            return false;
        }
        if (param0 != 5) {
            return false;
        }
        if (((fe) this).field_i) {
            return null != ((fe) this).field_q ? true : false;
        }
        return null != ((fe) this).field_d ? true : false;
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
                ((fe) this).field_r = true;
                this.notifyAll();
                break L0;
              }
            }
            try {
              L1: {
                L2: {
                  if (param0 <= -15) {
                    break L2;
                  } else {
                    ib discarded$1 = ((fe) this).a(-108, -85, -43, -56, -118);
                    break L2;
                  }
                }
                ((fe) this).field_l.join();
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
              if (((fe) this).field_b == null) {
                break L4;
              } else {
                {
                  L5: {
                    ((fe) this).field_b.a(false);
                    break L5;
                  }
                }
                break L4;
              }
            }
            L7: {
              if (null != ((fe) this).field_h) {
                {
                  L8: {
                    ((fe) this).field_h.a(false);
                    break L8;
                  }
                }
                break L7;
              } else {
                break L7;
              }
            }
            L10: {
              if (((fe) this).field_s != null) {
                var2_int = 0;
                L11: while (true) {
                  if (var2_int >= ((fe) this).field_s.length) {
                    break L10;
                  } else {
                    if (((fe) this).field_s[var2_int] != null) {
                      {
                        L12: {
                          ((fe) this).field_s[var2_int].a(false);
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
              if (((fe) this).field_v != null) {
                {
                  L15: {
                    ((fe) this).field_v.a(false);
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

    final ib a(Class param0, byte param1, Class[] param2, String param3) {
        if (param1 <= 51) {
            Object var6 = null;
            ib discarded$0 = ((fe) this).a(-46, (java.net.URL) null);
        }
        return this.a(8, 0, (byte) -75, 0, (Object) (Object) new Object[3]);
    }

    public final void run() {
        try {
            Object var2 = null;
            Throwable var2_ref = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            Exception var3_ref = null;
            jd var3_ref2 = null;
            di var3_ref3 = null;
            int var3_int = 0;
            Throwable var4_ref_Throwable = null;
            int var4 = 0;
            String var4_ref_String = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            Object var8 = null;
            ib var8_ref = null;
            Thread var9 = null;
            Object[] var10 = null;
            java.awt.datatransfer.Clipboard var11 = null;
            java.awt.datatransfer.Clipboard var12 = null;
            java.awt.Frame var13 = null;
            java.awt.Component var14 = null;
            String var15 = null;
            Object[] var16 = null;
            String var17 = null;
            Object[] var18 = null;
            int stackIn_58_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_57_0 = 0;
            int stackOut_56_0 = 0;
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
                    if (!((fe) this).field_r) {
                      if (null == ((fe) this).field_p) {
                        {
                          L4: {
                            this.wait();
                            break L4;
                          }
                        }
                        continue L3;
                      } else {
                        L6: {
                          var8_ref = ((fe) this).field_p;
                          ((fe) this).field_p = ((fe) this).field_p.field_a;
                          if (null == ((fe) this).field_p) {
                            ((fe) this).field_j = null;
                            break L6;
                          } else {
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
                    var2_int = var8_ref.field_d;
                    if (var2_int != 1) {
                      if (var2_int == 22) {
                        if (lk.a(0) >= field_a) {
                          try {
                            L9: {
                              var8_ref.field_g = (Object) (Object) li.a(false, (String) var8_ref.field_f, var8_ref.field_b).a(-70);
                              break L9;
                            }
                          } catch (java.lang.Exception decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref2 = (jd) (Object) decompiledCaughtException;
                            var8_ref.field_g = (Object) (Object) var3_ref2.getMessage();
                            throw var3_ref2;
                          }
                          break L8;
                        } else {
                          throw new IOException();
                        }
                      } else {
                        if (var2_int != 2) {
                          if (var2_int == 4) {
                            if (lk.a(0) >= field_a) {
                              var8_ref.field_g = (Object) (Object) new DataInputStream(((java.net.URL) var8_ref.field_f).openStream());
                              break L8;
                            } else {
                              throw new IOException();
                            }
                          } else {
                            if (8 != var2_int) {
                              if (var2_int == 9) {
                                L10: {
                                  var18 = (Object[]) var8_ref.field_f;
                                  if (!((fe) this).field_e) {
                                    break L10;
                                  } else {
                                    if (null != ((Class) var18[0]).getClassLoader()) {
                                      break L10;
                                    } else {
                                      throw new SecurityException();
                                    }
                                  }
                                }
                                var8_ref.field_g = (Object) (Object) ((Class) var18[0]).getDeclaredField((String) var18[1]);
                                break L8;
                              } else {
                                if (var2_int != 18) {
                                  if (var2_int != 19) {
                                    if (!((fe) this).field_e) {
                                      throw fe.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    } else {
                                      if (var2_int == 3) {
                                        if (~lk.a(0) > ~field_a) {
                                          throw new IOException();
                                        } else {
                                          var17 = (255 & var8_ref.field_b >> 24) + "." + (255 & var8_ref.field_b >> 16) + "." + (var8_ref.field_b >> 8 & 255) + "." + (255 & var8_ref.field_b);
                                          var8_ref.field_g = (Object) (Object) java.net.InetAddress.getByName(var17).getHostName();
                                          break L8;
                                        }
                                      } else {
                                        if (21 == var2_int) {
                                          if (~lk.a(0) > ~field_a) {
                                            throw new IOException();
                                          } else {
                                            var8_ref.field_g = (Object) (Object) java.net.InetAddress.getByName((String) var8_ref.field_f).getAddress();
                                            break L8;
                                          }
                                        } else {
                                          if (var2_int == 5) {
                                            if (((fe) this).field_i) {
                                              var8_ref.field_g = (Object) (Object) ((fe) this).field_q.a((byte) 106);
                                              break L8;
                                            } else {
                                              var8_ref.field_g = Class.forName("cb").getMethod("listmodes", new Class[0]).invoke(((fe) this).field_d, new Object[0]);
                                              break L8;
                                            }
                                          } else {
                                            if (var2_int != 6) {
                                              if (var2_int != 7) {
                                                if (var2_int != 12) {
                                                  if (var2_int == 13) {
                                                    var3_ref3 = fe.a("", (String) var8_ref.field_f, field_g, -7);
                                                    var8_ref.field_g = (Object) (Object) var3_ref3;
                                                    break L8;
                                                  } else {
                                                    L11: {
                                                      if (!((fe) this).field_e) {
                                                        break L11;
                                                      } else {
                                                        if (var2_int == 14) {
                                                          var3_int = var8_ref.field_b;
                                                          var4 = var8_ref.field_e;
                                                          if (!((fe) this).field_i) {
                                                            Object discarded$6 = Class.forName("na").getDeclaredMethod("movemouse", new Class[2]).invoke(((fe) this).field_t, new Object[2]);
                                                            break L8;
                                                          } else {
                                                            ((fe) this).field_o.a(var3_int, 101024, var4);
                                                            break L8;
                                                          }
                                                        } else {
                                                          break L11;
                                                        }
                                                      }
                                                    }
                                                    L12: {
                                                      if (!((fe) this).field_e) {
                                                        break L12;
                                                      } else {
                                                        if (15 != var2_int) {
                                                          break L12;
                                                        } else {
                                                          L13: {
                                                            if (var8_ref.field_b == 0) {
                                                              stackOut_57_0 = 0;
                                                              stackIn_58_0 = stackOut_57_0;
                                                              break L13;
                                                            } else {
                                                              stackOut_56_0 = 1;
                                                              stackIn_58_0 = stackOut_56_0;
                                                              break L13;
                                                            }
                                                          }
                                                          var3_int = stackIn_58_0;
                                                          var14 = (java.awt.Component) var8_ref.field_f;
                                                          if (!((fe) this).field_i) {
                                                            Object discarded$7 = Class.forName("na").getDeclaredMethod("showcursor", new Class[2]).invoke(((fe) this).field_t, new Object[2]);
                                                            break L8;
                                                          } else {
                                                            ((fe) this).field_o.a(var3_int != 0, 0, var14);
                                                            break L8;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L14: {
                                                      if (((fe) this).field_i) {
                                                        break L14;
                                                      } else {
                                                        if (var2_int == 17) {
                                                          var16 = (Object[]) var8_ref.field_f;
                                                          Object discarded$8 = Class.forName("na").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((fe) this).field_t, new Object[5]);
                                                          break L8;
                                                        } else {
                                                          break L14;
                                                        }
                                                      }
                                                    }
                                                    if (var2_int != 16) {
                                                      throw fe.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    } else {
                                                      try {
                                                        L15: {
                                                          if (field_k.startsWith("win")) {
                                                            L16: {
                                                              var15 = (String) var8_ref.field_f;
                                                              if (var15.startsWith("http://")) {
                                                                break L16;
                                                              } else {
                                                                if (!var15.startsWith("https://")) {
                                                                  throw fe.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  break L16;
                                                                }
                                                              }
                                                            }
                                                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L17: while (true) {
                                                              if (var5 >= var15.length()) {
                                                                Process discarded$9 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var15 + "\"");
                                                                var8_ref.field_g = null;
                                                                break L15;
                                                              } else {
                                                                if (var4_ref_String.indexOf((int) var15.charAt(var5)) == -1) {
                                                                  throw fe.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  var5++;
                                                                  continue L17;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            throw fe.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                                                        decompiledCaughtException = decompiledCaughtParameter2;
                                                        var3_ref = (Exception) (Object) decompiledCaughtException;
                                                        var8_ref.field_g = (Object) (Object) var3_ref;
                                                        throw fe.<RuntimeException>$cfr$sneakyThrow(var3_ref);
                                                      }
                                                      break L8;
                                                    }
                                                  }
                                                } else {
                                                  var3_ref3 = fe.a(field_u, (String) var8_ref.field_f, field_g, -7);
                                                  var8_ref.field_g = (Object) (Object) var3_ref3;
                                                  break L8;
                                                }
                                              } else {
                                                if (((fe) this).field_i) {
                                                  ((fe) this).field_q.a(-16986, (java.awt.Frame) var8_ref.field_f);
                                                  break L8;
                                                } else {
                                                  Object discarded$10 = Class.forName("cb").getMethod("exit", new Class[0]).invoke(((fe) this).field_d, new Object[0]);
                                                  break L8;
                                                }
                                              }
                                            } else {
                                              var13 = new java.awt.Frame("Jagex Full Screen");
                                              var8_ref.field_g = (Object) (Object) var13;
                                              var13.setResizable(false);
                                              if (((fe) this).field_i) {
                                                ((fe) this).field_q.a(70, var8_ref.field_e >> 16, var8_ref.field_e & 65535, var13, 65535 & var8_ref.field_b, var8_ref.field_b >>> 16);
                                                break L8;
                                              } else {
                                                Object discarded$11 = Class.forName("cb").getMethod("enter", new Class[5]).invoke(((fe) this).field_d, new Object[5]);
                                                break L8;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    var7 = (java.awt.datatransfer.Transferable) var8_ref.field_f;
                                    var12 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var12.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L8;
                                  }
                                } else {
                                  var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8_ref.field_g = (Object) (Object) var11.getContents((Object) null);
                                  break L8;
                                }
                              }
                            } else {
                              L18: {
                                var10 = (Object[]) var8_ref.field_f;
                                if (((fe) this).field_e) {
                                  if (null == ((Class) var10[0]).getClassLoader()) {
                                    throw new SecurityException();
                                  } else {
                                    break L18;
                                  }
                                } else {
                                  break L18;
                                }
                              }
                              var8_ref.field_g = (Object) (Object) ((Class) var10[0]).getDeclaredMethod((String) var10[1], (Class[]) var10[2]);
                              break L8;
                            }
                          }
                        } else {
                          var9 = new Thread((Runnable) var8_ref.field_f);
                          var9.setDaemon(true);
                          var9.start();
                          var9.setPriority(var8_ref.field_b);
                          var8_ref.field_g = (Object) (Object) var9;
                          break L8;
                        }
                      }
                    } else {
                      if (~lk.a(0) <= ~field_a) {
                        var8_ref.field_g = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var8_ref.field_f), var8_ref.field_b);
                        break L8;
                      } else {
                        throw new IOException();
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

    final ib a(java.awt.Frame param0, int param1) {
        if (param1 < 44) {
            Object var4 = null;
            ib discarded$0 = ((fe) this).a(57, (String) null, (Class) null);
        }
        return this.a(7, 0, (byte) -92, 0, (Object) (Object) param0);
    }

    final ib a(int param0, java.net.URL param1) {
        if (param0 != -21377) {
            field_a = 73L;
        }
        return this.a(4, 0, (byte) -110, 0, (Object) (Object) param1);
    }

    final ib a(int param0, int param1, int param2, int param3, int param4) {
        if (param2 != -7573) {
            ib discarded$0 = ((fe) this).a(127);
        }
        return this.a(6, param4 + (param1 << 16), (byte) -65, (param3 << 16) + param0, (Object) null);
    }

    final ib a(Runnable param0, int param1, int param2) {
        if (param2 != 65535) {
            return null;
        }
        return this.a(2, 0, (byte) -72, param1, (Object) (Object) param0);
    }

    final ib a(int param0) {
        if (param0 != -1) {
            Object var3 = null;
            ib discarded$0 = this.a(115, true, 98, (String) null);
        }
        return this.a(5, 0, (byte) -79, 0, (Object) null);
    }

    private final static di a(String param0, String param1, int param2, int param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            di var8_ref = null;
            di stackIn_13_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            di stackOut_12_0 = null;
            L0: {
              if (param2 == 33) {
                var4 = "jagex_" + param0 + "_preferences" + param1 + "_rc.dat";
                break L0;
              } else {
                if (param2 == 34) {
                  var4 = "jagex_" + param0 + "_preferences" + param1 + "_wip.dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param0 + "_preferences" + param1 + ".dat";
                  break L0;
                }
              }
            }
            var5_array = new String[]{"c:/rscache/", "/rscache/", field_n, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            var6 = 0;
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
                    var8_ref = new di(new File(var7, var4), "rw", 10000L);
                    stackOut_12_0 = (di) var8_ref;
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

    final ib a(int param0, String param1, Class param2) {
        if (param0 >= -107) {
            return null;
        }
        return this.a(9, 0, (byte) -62, 0, (Object) (Object) new Object[2]);
    }

    private final ib a(int param0, int param1, byte param2, int param3, Object param4) {
        ib var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (param2 <= -48) {
            break L0;
          } else {
            ib discarded$3 = ((fe) this).a(-23);
            break L0;
          }
        }
        var6 = new ib();
        var6.field_f = param4;
        var6.field_e = param1;
        var6.field_d = param0;
        var6.field_b = param3;
        var7 = this;
        synchronized (var7) {
          L1: {
            L2: {
              if (null == ((fe) this).field_j) {
                ((fe) this).field_p = var6;
                ((fe) this).field_j = var6;
                break L2;
              } else {
                ((fe) this).field_j.field_a = var6;
                ((fe) this).field_j = var6;
                break L2;
              }
            }
            this.notify();
            break L1;
          }
        }
        return var6;
    }

    private final ib a(int param0, boolean param1, int param2, String param3) {
        if (param2 != 18832) {
            field_f = null;
        }
        return this.a(param1 ? 22 : 1, 0, (byte) -118, param0, (Object) (Object) param3);
    }

    final ib a(int param0, String param1, int param2) {
        if (param0 < 9) {
            Object var5 = null;
            ib discarded$0 = ((fe) this).a(-86, (String) null, (Class) null);
        }
        return this.a(param2, false, 18832, param1);
    }

    fe(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        ke var7 = null;
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
          ((fe) this).field_r = false;
          ((fe) this).field_p = null;
          ((fe) this).field_e = false;
          ((fe) this).field_v = null;
          ((fe) this).field_j = null;
          ((fe) this).field_h = null;
          ((fe) this).field_i = false;
          ((fe) this).field_b = null;
          field_g = param0;
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
        ((fe) this).field_e = stackIn_3_1 != 0;
        field_c = "1.1";
        field_w = "Unknown";
        field_u = param1;
        try {
          L1: {
            field_w = System.getProperty("java.vendor");
            field_c = System.getProperty("java.version");
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
          if (-1 == field_w.toLowerCase().indexOf("microsoft")) {
            break L3;
          } else {
            ((fe) this).field_i = true;
            break L3;
          }
        }
        try {
          L4: {
            field_f = System.getProperty("os.name");
            break L4;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var5 = (Exception) (Object) decompiledCaughtException;
            field_f = "Unknown";
            break L5;
          }
        }
        field_k = field_f.toLowerCase();
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
          if (null == field_n) {
            field_n = "~/";
            break L13;
          } else {
            break L13;
          }
        }
        try {
          L14: {
            ((fe) this).field_m = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
          if (((fe) this).field_i) {
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
          ed.a((byte) -4, field_u, field_g);
          if (!((fe) this).field_e) {
            break L21;
          } else {
            ((fe) this).field_v = new di(ed.a(83, field_g, "random.dat", (String) null), "rw", 25L);
            ((fe) this).field_b = new di(ed.a("main_file_cache.dat2", 32718), "rw", 314572800L);
            ((fe) this).field_h = new di(ed.a("main_file_cache.idx255", 32718), "rw", 1048576L);
            ((fe) this).field_s = new di[param2];
            var5_int = 0;
            L22: while (true) {
              if (var5_int >= param2) {
                L23: {
                  if (((fe) this).field_i) {
                    try {
                      L24: {
                        Object discarded$7 = Class.forName("pk").newInstance();
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
                      if (((fe) this).field_i) {
                        var7 = new ke();
                        ((fe) this).field_q = var7;
                        break L27;
                      } else {
                        ((fe) this).field_d = Class.forName("cb").newInstance();
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
                      if (((fe) this).field_i) {
                        ((fe) this).field_o = new t();
                        break L30;
                      } else {
                        ((fe) this).field_t = Class.forName("na").newInstance();
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
                ((fe) this).field_s[var5_int] = new di(ed.a("main_file_cache.idx" + var5_int, 32718), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        ((fe) this).field_r = false;
        ((fe) this).field_l = new Thread((Runnable) this);
        ((fe) this).field_l.setPriority(10);
        ((fe) this).field_l.setDaemon(true);
        ((fe) this).field_l.start();
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
