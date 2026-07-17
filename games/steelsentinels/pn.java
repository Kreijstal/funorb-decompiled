/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pn implements Runnable {
    static String field_p;
    sn field_m;
    boolean field_x;
    private boolean field_e;
    static String field_r;
    private static int field_t;
    private vj field_o;
    private pk field_v;
    static String field_w;
    sn field_f;
    sn[] field_a;
    private Thread field_i;
    private Object field_n;
    private static String field_k;
    private boolean field_s;
    private static String field_u;
    private static volatile long field_d;
    private wj field_h;
    private wj field_j;
    sn field_g;
    private static String field_l;
    private Object field_q;
    java.awt.EventQueue field_b;
    static java.lang.reflect.Method field_c;

    final wj a(java.awt.Frame param0, int param1) {
        if (param1 != -1463474960) {
            Object var4 = null;
            wj discarded$0 = ((pn) this).a((String) null, 76, -2);
        }
        return this.a(0, 0, 94, (Object) (Object) param0, 7);
    }

    final wj a(String param0, int param1, int param2) {
        if (param2 != 376255344) {
            field_w = null;
        }
        return this.a(param1, false, false, param0);
    }

    final wj a(int param0, Class param1, String param2) {
        if (param0 != 9) {
            ((pn) this).field_s = false;
        }
        return this.a(0, 0, -93, (Object) (Object) new Object[2], 9);
    }

    final wj a(java.net.URL param0, int param1) {
        if (param1 <= 28) {
            field_k = null;
        }
        return this.a(0, 0, -111, (Object) (Object) param0, 4);
    }

    private final static sn a(String param0, int param1, int param2, String param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            sn var8_ref = null;
            sn stackIn_13_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            sn stackOut_12_0 = null;
            L0: {
              if (param2 != 33) {
                if (34 == param2) {
                  var4 = "jagex_" + param0 + "_preferences" + param3 + "_wip.dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param0 + "_preferences" + param3 + ".dat";
                  break L0;
                }
              } else {
                var4 = "jagex_" + param0 + "_preferences" + param3 + "_rc.dat";
                break L0;
              }
            }
            var5_array = new String[]{"c:/rscache/", "/rscache/", field_l, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            var6 = 0;
            if (param1 == 11677) {
              L1: while (true) {
                if (var6 < var5_array.length) {
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
                      var8_ref = new sn(new File(var7, var4), "rw", 10000L);
                      stackOut_12_0 = (sn) var8_ref;
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
            } else {
              return null;
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
            InterruptedException var3_ref_InterruptedException = null;
            vg var3_ref_vg = null;
            Exception var3_ref_Exception = null;
            sn var3_ref_sn = null;
            int var3 = 0;
            Throwable var4_ref_Throwable = null;
            int var4 = 0;
            String var4_ref_String = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            Object var8 = null;
            wj var8_ref = null;
            Object[] var9 = null;
            Object[] var10 = null;
            java.awt.datatransfer.Clipboard var11 = null;
            java.awt.datatransfer.Clipboard var12 = null;
            String var13 = null;
            Object[] var14 = null;
            java.awt.Component var15 = null;
            java.awt.Frame var16 = null;
            String var17 = null;
            Thread var18 = null;
            int stackIn_93_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_92_0 = 0;
            int stackOut_91_0 = 0;
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
                    if (!((pn) this).field_s) {
                      if (null != ((pn) this).field_j) {
                        L4: {
                          var8_ref = ((pn) this).field_j;
                          ((pn) this).field_j = ((pn) this).field_j.field_d;
                          if (null != ((pn) this).field_j) {
                            break L4;
                          } else {
                            ((pn) this).field_h = null;
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
                    var2_int = var8_ref.field_f;
                    if (var2_int != 1) {
                      if (var2_int != 22) {
                        if (var2_int == 2) {
                          var18 = new Thread((Runnable) var8_ref.field_b);
                          var18.setDaemon(true);
                          var18.start();
                          var18.setPriority(var8_ref.field_e);
                          var8_ref.field_c = (Object) (Object) var18;
                          break L8;
                        } else {
                          if (var2_int != 4) {
                            if (8 != var2_int) {
                              if (var2_int != 9) {
                                if (var2_int != 18) {
                                  if (var2_int != 19) {
                                    if (((pn) this).field_x) {
                                      if (var2_int == 3) {
                                        if (mm.a(75) >= field_d) {
                                          var17 = (255 & var8_ref.field_e >> 24) + "." + (255 & var8_ref.field_e >> 16) + "." + ((65309 & var8_ref.field_e) >> 8) + "." + (255 & var8_ref.field_e);
                                          var8_ref.field_c = (Object) (Object) java.net.InetAddress.getByName(var17).getHostName();
                                          break L8;
                                        } else {
                                          throw new IOException();
                                        }
                                      } else {
                                        if (var2_int == 21) {
                                          if (~mm.a(-120) > ~field_d) {
                                            throw new IOException();
                                          } else {
                                            var8_ref.field_c = (Object) (Object) java.net.InetAddress.getByName((String) var8_ref.field_b).getAddress();
                                            break L8;
                                          }
                                        } else {
                                          if (var2_int == 5) {
                                            if (!((pn) this).field_e) {
                                              var8_ref.field_c = Class.forName("ga").getMethod("listmodes", new Class[0]).invoke(((pn) this).field_n, new Object[0]);
                                              break L8;
                                            } else {
                                              var8_ref.field_c = (Object) (Object) ((pn) this).field_v.a(0);
                                              break L8;
                                            }
                                          } else {
                                            if (var2_int == 6) {
                                              var16 = new java.awt.Frame("Jagex Full Screen");
                                              var8_ref.field_c = (Object) (Object) var16;
                                              var16.setResizable(false);
                                              if (!((pn) this).field_e) {
                                                Object discarded$6 = Class.forName("ga").getMethod("enter", new Class[5]).invoke(((pn) this).field_n, new Object[5]);
                                                break L8;
                                              } else {
                                                ((pn) this).field_v.a(var8_ref.field_g & 65535, var16, var8_ref.field_e & 65535, var8_ref.field_g >> 16, (byte) -107, var8_ref.field_e >>> 16);
                                                break L8;
                                              }
                                            } else {
                                              if (var2_int != 7) {
                                                if (var2_int != 12) {
                                                  if (var2_int != 13) {
                                                    L9: {
                                                      if (!((pn) this).field_x) {
                                                        break L9;
                                                      } else {
                                                        if (var2_int == 14) {
                                                          var3 = var8_ref.field_e;
                                                          var4 = var8_ref.field_g;
                                                          if (((pn) this).field_e) {
                                                            ((pn) this).field_o.a(var4, var3, false);
                                                            break L8;
                                                          } else {
                                                            Object discarded$7 = Class.forName("th").getDeclaredMethod("movemouse", new Class[2]).invoke(((pn) this).field_q, new Object[2]);
                                                            break L8;
                                                          }
                                                        } else {
                                                          break L9;
                                                        }
                                                      }
                                                    }
                                                    L10: {
                                                      if (!((pn) this).field_x) {
                                                        break L10;
                                                      } else {
                                                        if (var2_int == 15) {
                                                          L11: {
                                                            if (var8_ref.field_e == 0) {
                                                              stackOut_92_0 = 0;
                                                              stackIn_93_0 = stackOut_92_0;
                                                              break L11;
                                                            } else {
                                                              stackOut_91_0 = 1;
                                                              stackIn_93_0 = stackOut_91_0;
                                                              break L11;
                                                            }
                                                          }
                                                          var3 = stackIn_93_0;
                                                          var15 = (java.awt.Component) var8_ref.field_b;
                                                          if (!((pn) this).field_e) {
                                                            Object discarded$8 = Class.forName("th").getDeclaredMethod("showcursor", new Class[2]).invoke(((pn) this).field_q, new Object[2]);
                                                            break L8;
                                                          } else {
                                                            ((pn) this).field_o.a(var15, 32512, var3 != 0);
                                                            break L8;
                                                          }
                                                        } else {
                                                          break L10;
                                                        }
                                                      }
                                                    }
                                                    L12: {
                                                      if (((pn) this).field_e) {
                                                        break L12;
                                                      } else {
                                                        if (var2_int == 17) {
                                                          var14 = (Object[]) var8_ref.field_b;
                                                          Object discarded$9 = Class.forName("th").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((pn) this).field_q, new Object[5]);
                                                          break L8;
                                                        } else {
                                                          break L12;
                                                        }
                                                      }
                                                    }
                                                    if (var2_int != 16) {
                                                      throw pn.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    } else {
                                                      try {
                                                        L13: {
                                                          if (!field_w.startsWith("win")) {
                                                            throw pn.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          } else {
                                                            L14: {
                                                              var13 = (String) var8_ref.field_b;
                                                              if (var13.startsWith("http://")) {
                                                                break L14;
                                                              } else {
                                                                if (var13.startsWith("https://")) {
                                                                  break L14;
                                                                } else {
                                                                  throw pn.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L15: while (true) {
                                                              if (var5 >= var13.length()) {
                                                                Process discarded$10 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var13 + "\"");
                                                                var8_ref.field_c = null;
                                                                break L13;
                                                              } else {
                                                                if (var4_ref_String.indexOf((int) var13.charAt(var5)) != -1) {
                                                                  var5++;
                                                                  continue L15;
                                                                } else {
                                                                  throw pn.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter1) {
                                                        decompiledCaughtException = decompiledCaughtParameter1;
                                                        var3_ref_Exception = (Exception) (Object) decompiledCaughtException;
                                                        var8_ref.field_c = (Object) (Object) var3_ref_Exception;
                                                        throw pn.<RuntimeException>$cfr$sneakyThrow(var3_ref_Exception);
                                                      }
                                                      break L8;
                                                    }
                                                  } else {
                                                    var3_ref_sn = pn.a("", 11677, field_t, (String) var8_ref.field_b);
                                                    var8_ref.field_c = (Object) (Object) var3_ref_sn;
                                                    break L8;
                                                  }
                                                } else {
                                                  var3_ref_sn = pn.a(field_k, 11677, field_t, (String) var8_ref.field_b);
                                                  var8_ref.field_c = (Object) (Object) var3_ref_sn;
                                                  break L8;
                                                }
                                              } else {
                                                if (((pn) this).field_e) {
                                                  ((pn) this).field_v.a((java.awt.Frame) var8_ref.field_b, (byte) 107);
                                                  break L8;
                                                } else {
                                                  Object discarded$11 = Class.forName("ga").getMethod("exit", new Class[0]).invoke(((pn) this).field_n, new Object[0]);
                                                  break L8;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      throw pn.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    }
                                  } else {
                                    var7 = (java.awt.datatransfer.Transferable) var8_ref.field_b;
                                    var12 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var12.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L8;
                                  }
                                } else {
                                  var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8_ref.field_c = (Object) (Object) var11.getContents((Object) null);
                                  break L8;
                                }
                              } else {
                                L16: {
                                  var10 = (Object[]) var8_ref.field_b;
                                  if (!((pn) this).field_x) {
                                    break L16;
                                  } else {
                                    if (null == ((Class) var10[0]).getClassLoader()) {
                                      throw new SecurityException();
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                                var8_ref.field_c = (Object) (Object) ((Class) var10[0]).getDeclaredField((String) var10[1]);
                                break L8;
                              }
                            } else {
                              L17: {
                                var9 = (Object[]) var8_ref.field_b;
                                if (((pn) this).field_x) {
                                  if (null == ((Class) var9[0]).getClassLoader()) {
                                    throw new SecurityException();
                                  } else {
                                    break L17;
                                  }
                                } else {
                                  break L17;
                                }
                              }
                              var8_ref.field_c = (Object) (Object) ((Class) var9[0]).getDeclaredMethod((String) var9[1], (Class[]) var9[2]);
                              break L8;
                            }
                          } else {
                            if (mm.a(109) < field_d) {
                              throw new IOException();
                            } else {
                              var8_ref.field_c = (Object) (Object) new DataInputStream(((java.net.URL) var8_ref.field_b).openStream());
                              break L8;
                            }
                          }
                        }
                      } else {
                        if (~field_d >= ~mm.a(80)) {
                          try {
                            L18: {
                              var8_ref.field_c = (Object) (Object) tc.a((String) var8_ref.field_b, var8_ref.field_e, 22137).a(-90);
                              break L18;
                            }
                          } catch (java.lang.Exception decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref_vg = (vg) (Object) decompiledCaughtException;
                            var8_ref.field_c = (Object) (Object) var3_ref_vg.getMessage();
                            throw var3_ref_vg;
                          }
                          break L8;
                        } else {
                          throw new IOException();
                        }
                      }
                    } else {
                      if (~mm.a(105) > ~field_d) {
                        throw new IOException();
                      } else {
                        var8_ref.field_c = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var8_ref.field_b), var8_ref.field_e);
                        break L8;
                      }
                    }
                  }
                  var8_ref.field_a = 1;
                  break L7;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                L19: {
                  var2_ref = decompiledCaughtException;
                  var8_ref.field_a = 2;
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

    private final wj a(int param0, int param1, int param2, Object param3, int param4) {
        wj var6 = null;
        int var7 = 0;
        Object var8 = null;
        Throwable var9 = null;
        Throwable decompiledCaughtException = null;
        var6 = new wj();
        var6.field_e = param1;
        var6.field_b = param3;
        var6.field_f = param4;
        var7 = 101 % ((-43 - param2) / 45);
        var6.field_g = param0;
        var8 = this;
        synchronized (var8) {
          L0: {
            L1: {
              if (((pn) this).field_h == null) {
                ((pn) this).field_j = var6;
                ((pn) this).field_h = var6;
                break L1;
              } else {
                ((pn) this).field_h.field_d = var6;
                ((pn) this).field_h = var6;
                break L1;
              }
            }
            this.notify();
            break L0;
          }
        }
        return var6;
    }

    final boolean b(int param0) {
        if (!((pn) this).field_x) {
            return false;
        }
        if (param0 >= -26) {
            return false;
        }
        if (!((pn) this).field_e) {
            return ((pn) this).field_n != null ? true : false;
        }
        return ((pn) this).field_v != null ? true : false;
    }

    final wj a(int param0) {
        if (param0 != -30756) {
            return null;
        }
        return this.a(0, 0, 17, (Object) null, 5);
    }

    final wj a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 != 6) {
            return null;
        }
        return this.a(param1 + (param2 << 16), param0 + (param3 << 16), 127, (Object) null, 6);
    }

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
                L1: {
                  ((pn) this).field_s = true;
                  this.notifyAll();
                  if (param0 == 0) {
                    break L1;
                  } else {
                    field_t = -42;
                    break L1;
                  }
                }
                break L0;
              }
            }
            try {
              L2: {
                ((pn) this).field_i.join();
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
              if (((pn) this).field_f == null) {
                break L4;
              } else {
                {
                  L5: {
                    ((pn) this).field_f.a(true);
                    break L5;
                  }
                }
                break L4;
              }
            }
            L7: {
              if (null == ((pn) this).field_g) {
                break L7;
              } else {
                {
                  L8: {
                    ((pn) this).field_g.a(true);
                    break L8;
                  }
                }
                break L7;
              }
            }
            L10: {
              if (((pn) this).field_a != null) {
                var2_int = 0;
                L11: while (true) {
                  if (((pn) this).field_a.length <= var2_int) {
                    break L10;
                  } else {
                    if (null != ((pn) this).field_a[var2_int]) {
                      {
                        L12: {
                          ((pn) this).field_a[var2_int].a(true);
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
              if (null == ((pn) this).field_m) {
                break L14;
              } else {
                {
                  L15: {
                    ((pn) this).field_m.a(true);
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

    final wj a(String param0, byte param1, Class param2, Class[] param3) {
        if (param1 != 52) {
            field_k = null;
        }
        return this.a(0, 0, -122, (Object) (Object) new Object[3], 8);
    }

    final wj a(int param0, int param1, Runnable param2) {
        if (param0 != 2) {
            wj discarded$0 = ((pn) this).a(-125, -51, 63, 104, 101);
        }
        return this.a(0, param1, 112, (Object) (Object) param2, 2);
    }

    private final wj a(int param0, boolean param1, boolean param2, String param3) {
        if (param1) {
            Object var6 = null;
            wj discarded$0 = ((pn) this).a((String) null, -15, 36);
        }
        return this.a(0, param0, 108, (Object) (Object) param3, param2 ? 22 : 1);
    }

    pn(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        pk var6 = null;
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
          ((pn) this).field_m = null;
          ((pn) this).field_e = false;
          ((pn) this).field_x = false;
          ((pn) this).field_f = null;
          ((pn) this).field_s = false;
          ((pn) this).field_h = null;
          ((pn) this).field_j = null;
          ((pn) this).field_g = null;
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
        ((pn) this).field_x = stackIn_3_1 != 0;
        field_t = param0;
        field_p = "Unknown";
        field_k = param1;
        try {
          L1: {
            field_p = System.getProperty("java.vendor");
            field_r = System.getProperty("java.version");
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
          if (field_p.toLowerCase().indexOf("microsoft") == -1) {
            break L3;
          } else {
            ((pn) this).field_e = true;
            break L3;
          }
        }
        try {
          L4: {
            field_u = System.getProperty("os.name");
            break L4;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var5 = (Exception) (Object) decompiledCaughtException;
            field_u = "Unknown";
            break L5;
          }
        }
        field_w = field_u.toLowerCase();
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
          if (field_l == null) {
            field_l = "~/";
            break L13;
          } else {
            break L13;
          }
        }
        try {
          L14: {
            ((pn) this).field_b = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
          if (!((pn) this).field_e) {
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
                field_c = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
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
          wm.a(field_k, true, field_t);
          if (!((pn) this).field_x) {
            break L21;
          } else {
            ((pn) this).field_m = new sn(wm.a((String) null, field_t, (byte) 35, "random.dat"), "rw", 25L);
            ((pn) this).field_f = new sn(wm.a(8244, "main_file_cache.dat2"), "rw", 314572800L);
            ((pn) this).field_g = new sn(wm.a(8244, "main_file_cache.idx255"), "rw", 1048576L);
            ((pn) this).field_a = new sn[param2];
            var5_int = 0;
            L22: while (true) {
              if (var5_int >= param2) {
                L23: {
                  if (((pn) this).field_e) {
                    try {
                      L24: {
                        Object discarded$7 = Class.forName("gg").newInstance();
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
                      if (!((pn) this).field_e) {
                        ((pn) this).field_n = Class.forName("ga").newInstance();
                        break L27;
                      } else {
                        var6 = new pk();
                        ((pn) this).field_v = var6;
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
                      if (((pn) this).field_e) {
                        ((pn) this).field_o = new vj();
                        break L30;
                      } else {
                        ((pn) this).field_q = Class.forName("th").newInstance();
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
                ((pn) this).field_a[var5_int] = new sn(wm.a(8244, "main_file_cache.idx" + var5_int), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        ((pn) this).field_s = false;
        ((pn) this).field_i = new Thread((Runnable) this);
        ((pn) this).field_i.setPriority(10);
        ((pn) this).field_i.setDaemon(true);
        ((pn) this).field_i.start();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
