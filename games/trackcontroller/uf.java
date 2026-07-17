/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class uf implements Runnable {
    private tb field_w;
    tc field_p;
    private Thread field_u;
    static String field_e;
    private boolean field_r;
    private ul field_j;
    private static String field_a;
    private Object field_d;
    java.awt.EventQueue field_i;
    static java.lang.reflect.Method field_m;
    private static String field_h;
    boolean field_l;
    private Object field_f;
    tc[] field_q;
    private boolean field_c;
    tc field_t;
    tc field_v;
    private static int field_s;
    private static String field_x;
    static String field_g;
    static String field_b;
    private ce field_k;
    private ce field_n;
    private static volatile long field_o;

    final ce a(boolean param0, java.net.URL param1) {
        if (param0) {
            Object var4 = null;
            ce discarded$0 = ((uf) this).a((String) null, (Class[]) null, -97, (Class) null);
        }
        return this.a(0, 1484280784, (Object) (Object) param1, 0, 4);
    }

    final boolean b(int param0) {
        if (!((uf) this).field_l) {
            return false;
        }
        if (param0 != -4) {
            return false;
        }
        if (!((uf) this).field_c) {
            return null != ((uf) this).field_d ? true : false;
        }
        return ((uf) this).field_j != null ? true : false;
    }

    final ce a(int param0, int param1, String param2) {
        if (param0 <= 14) {
            Object var5 = null;
            ce discarded$0 = ((uf) this).a(-124, 6, (String) null);
        }
        int discarded$1 = -126;
        return this.a(false, param1, param2);
    }

    final ce a(int param0, Runnable param1, int param2) {
        if (param2 < 0) {
            return null;
        }
        return this.a(0, 1484280784, (Object) (Object) param1, param0, 2);
    }

    final ce a(String param0, Class[] param1, int param2, Class param3) {
        if (param2 != 0) {
            field_h = null;
        }
        return this.a(0, 1484280784, (Object) (Object) new Object[3], 0, 8);
    }

    private final ce a(boolean param0, int param1, String param2) {
        return this.a(0, 1484280784, (Object) (Object) param2, param1, 1);
    }

    final ce a(java.awt.Frame param0, int param1) {
        if (param1 > -15) {
            return null;
        }
        return this.a(0, 1484280784, (Object) (Object) param0, 0, 7);
    }

    final ce a(int param0, int param1, int param2, int param3, int param4) {
        if (param0 <= 54) {
            Object var7 = null;
            ce discarded$0 = ((uf) this).a((String) null, (Class[]) null, 110, (Class) null);
        }
        return this.a((param1 << 16) - -param2, 1484280784, (Object) null, param4 + (param3 << 16), 6);
    }

    private final static tc a(String param0, int param1, int param2, String param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            tc var8_ref = null;
            tc stackIn_15_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            tc stackOut_14_0 = null;
            L0: {
              if (param1 == 33) {
                var4 = "jagex_" + param3 + "_preferences" + param0 + "_rc.dat";
                break L0;
              } else {
                if (param1 == 34) {
                  var4 = "jagex_" + param3 + "_preferences" + param0 + "_wip.dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param3 + "_preferences" + param0 + ".dat";
                  break L0;
                }
              }
            }
            L1: {
              var5_array = new String[]{"c:/rscache/", "/rscache/", field_x, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
              if (param2 > 33) {
                break L1;
              } else {
                field_g = null;
                break L1;
              }
            }
            var6 = 0;
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
                    var8_ref = new tc(new File(var7, var4), "rw", 10000L);
                    stackOut_14_0 = (tc) var8_ref;
                    stackIn_15_0 = stackOut_14_0;
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
                  return stackIn_15_0;
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

    final ce a(int param0, String param1, Class param2) {
        if (param0 != -26462) {
            ((uf) this).run();
        }
        return this.a(0, 1484280784, (Object) (Object) new Object[2], 0, 9);
    }

    final void a(byte param0) {
        try {
            InterruptedException interruptedException = null;
            Object var2_ref_Object = null;
            int var2 = 0;
            Throwable var3 = null;
            IOException var3_ref = null;
            Throwable decompiledCaughtException = null;
            var2_ref_Object = this;
            synchronized (var2_ref_Object) {
              L0: {
                ((uf) this).field_r = true;
                this.notifyAll();
                break L0;
              }
            }
            try {
              L1: {
                ((uf) this).field_u.join();
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                break L2;
              }
            }
            L3: {
              if (((uf) this).field_t == null) {
                break L3;
              } else {
                {
                  L4: {
                    ((uf) this).field_t.a(-31576);
                    break L4;
                  }
                }
                break L3;
              }
            }
            L6: {
              if (((uf) this).field_v == null) {
                break L6;
              } else {
                {
                  L7: {
                    ((uf) this).field_v.a(-31576);
                    break L7;
                  }
                }
                break L6;
              }
            }
            L9: {
              if (((uf) this).field_q == null) {
                break L9;
              } else {
                var2 = 0;
                L10: while (true) {
                  if (var2 >= ((uf) this).field_q.length) {
                    break L9;
                  } else {
                    if (((uf) this).field_q[var2] != null) {
                      {
                        L11: {
                          ((uf) this).field_q[var2].a(-31576);
                          var2++;
                          break L11;
                        }
                      }
                      continue L10;
                    } else {
                      var2++;
                      continue L10;
                    }
                  }
                }
              }
            }
            L13: {
              if (((uf) this).field_p != null) {
                {
                  L14: {
                    ((uf) this).field_p.a(-31576);
                    break L14;
                  }
                }
                break L13;
              } else {
                break L13;
              }
            }
            var2 = -30 / ((1 - param0) / 47);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final ce a(int param0, int param1, Object param2, int param3, int param4) {
        ce var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        var6 = new ce();
        var6.field_c = param2;
        var6.field_d = param0;
        var6.field_g = param4;
        var6.field_b = param3;
        var7 = this;
        synchronized (var7) {
          L0: {
            L1: {
              if (null != ((uf) this).field_n) {
                ((uf) this).field_n.field_a = var6;
                ((uf) this).field_n = var6;
                break L1;
              } else {
                ((uf) this).field_k = var6;
                ((uf) this).field_n = var6;
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
            dj var3_ref = null;
            Exception var3_ref2 = null;
            tc var3_ref3 = null;
            int var3_int = 0;
            Throwable var4 = null;
            int var4_int = 0;
            String var4_ref = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            Object var8 = null;
            ce var8_ref = null;
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
            int stackIn_85_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_84_0 = 0;
            int stackOut_83_0 = 0;
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
                    if (!((uf) this).field_r) {
                      if (null == ((uf) this).field_k) {
                        {
                          L4: {
                            this.wait();
                            break L4;
                          }
                        }
                        continue L3;
                      } else {
                        L6: {
                          var8_ref = ((uf) this).field_k;
                          ((uf) this).field_k = ((uf) this).field_k.field_a;
                          if (((uf) this).field_k != null) {
                            break L6;
                          } else {
                            ((uf) this).field_n = null;
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
                    var2_int = var8_ref.field_g;
                    if (var2_int == 1) {
                      if (qg.a(false) < field_o) {
                        throw new IOException();
                      } else {
                        var8_ref.field_e = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var8_ref.field_c), var8_ref.field_b);
                        break L8;
                      }
                    } else {
                      if (22 != var2_int) {
                        if (var2_int == 2) {
                          var18 = new Thread((Runnable) var8_ref.field_c);
                          var18.setDaemon(true);
                          var18.start();
                          var18.setPriority(var8_ref.field_b);
                          var8_ref.field_e = (Object) (Object) var18;
                          break L8;
                        } else {
                          if (4 != var2_int) {
                            if (var2_int != 8) {
                              if (var2_int == 9) {
                                L9: {
                                  var17 = (Object[]) var8_ref.field_c;
                                  if (!((uf) this).field_l) {
                                    break L9;
                                  } else {
                                    if (((Class) var17[0]).getClassLoader() != null) {
                                      break L9;
                                    } else {
                                      throw new SecurityException();
                                    }
                                  }
                                }
                                var8_ref.field_e = (Object) (Object) ((Class) var17[0]).getDeclaredField((String) var17[1]);
                                break L8;
                              } else {
                                if (18 == var2_int) {
                                  var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8_ref.field_e = (Object) (Object) var16.getContents((Object) null);
                                  break L8;
                                } else {
                                  if (19 != var2_int) {
                                    if (((uf) this).field_l) {
                                      if (var2_int == 3) {
                                        if (qg.a(false) >= field_o) {
                                          var15 = (var8_ref.field_b >> 24 & 255) + "." + (255 & var8_ref.field_b >> 16) + "." + ((65479 & var8_ref.field_b) >> 8) + "." + (255 & var8_ref.field_b);
                                          var8_ref.field_e = (Object) (Object) java.net.InetAddress.getByName(var15).getHostName();
                                          break L8;
                                        } else {
                                          throw new IOException();
                                        }
                                      } else {
                                        if (21 == var2_int) {
                                          if (~field_o >= ~qg.a(false)) {
                                            var8_ref.field_e = (Object) (Object) java.net.InetAddress.getByName((String) var8_ref.field_c).getAddress();
                                            break L8;
                                          } else {
                                            throw new IOException();
                                          }
                                        } else {
                                          if (var2_int != 5) {
                                            if (var2_int == 6) {
                                              var14 = new java.awt.Frame("Jagex Full Screen");
                                              var8_ref.field_e = (Object) (Object) var14;
                                              var14.setResizable(false);
                                              if (((uf) this).field_c) {
                                                ((uf) this).field_j.a(65535 & var8_ref.field_b, var8_ref.field_d >> 16, var8_ref.field_b >>> 16, false, var14, var8_ref.field_d & 65535);
                                                break L8;
                                              } else {
                                                Object discarded$7 = Class.forName("eg").getMethod("enter", new Class[5]).invoke(((uf) this).field_d, new Object[5]);
                                                break L8;
                                              }
                                            } else {
                                              if (var2_int != 7) {
                                                if (12 == var2_int) {
                                                  var3_ref3 = uf.a((String) var8_ref.field_c, field_s, 40, field_a);
                                                  var8_ref.field_e = (Object) (Object) var3_ref3;
                                                  break L8;
                                                } else {
                                                  if (var2_int == 13) {
                                                    var3_ref3 = uf.a((String) var8_ref.field_c, field_s, 124, "");
                                                    var8_ref.field_e = (Object) (Object) var3_ref3;
                                                    break L8;
                                                  } else {
                                                    L10: {
                                                      if (!((uf) this).field_l) {
                                                        break L10;
                                                      } else {
                                                        if (var2_int != 14) {
                                                          break L10;
                                                        } else {
                                                          var3_int = var8_ref.field_b;
                                                          var4_int = var8_ref.field_d;
                                                          if (!((uf) this).field_c) {
                                                            Object discarded$8 = Class.forName("wc").getDeclaredMethod("movemouse", new Class[2]).invoke(((uf) this).field_f, new Object[2]);
                                                            break L8;
                                                          } else {
                                                            ((uf) this).field_w.a(31942, var3_int, var4_int);
                                                            break L8;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L11: {
                                                      if (!((uf) this).field_l) {
                                                        break L11;
                                                      } else {
                                                        if (var2_int == 15) {
                                                          L12: {
                                                            if (var8_ref.field_b == 0) {
                                                              stackOut_84_0 = 0;
                                                              stackIn_85_0 = stackOut_84_0;
                                                              break L12;
                                                            } else {
                                                              stackOut_83_0 = 1;
                                                              stackIn_85_0 = stackOut_83_0;
                                                              break L12;
                                                            }
                                                          }
                                                          var3_int = stackIn_85_0;
                                                          var13 = (java.awt.Component) var8_ref.field_c;
                                                          if (!((uf) this).field_c) {
                                                            Object discarded$9 = Class.forName("wc").getDeclaredMethod("showcursor", new Class[2]).invoke(((uf) this).field_f, new Object[2]);
                                                            break L8;
                                                          } else {
                                                            ((uf) this).field_w.a(var3_int != 0, var13, 5745);
                                                            break L8;
                                                          }
                                                        } else {
                                                          break L11;
                                                        }
                                                      }
                                                    }
                                                    L13: {
                                                      if (((uf) this).field_c) {
                                                        break L13;
                                                      } else {
                                                        if (var2_int != 17) {
                                                          break L13;
                                                        } else {
                                                          var11 = (Object[]) var8_ref.field_c;
                                                          Object discarded$10 = Class.forName("wc").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((uf) this).field_f, new Object[5]);
                                                          break L8;
                                                        }
                                                      }
                                                    }
                                                    if (var2_int != 16) {
                                                      throw uf.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    } else {
                                                      try {
                                                        L14: {
                                                          if (!field_b.startsWith("win")) {
                                                            throw uf.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          } else {
                                                            L15: {
                                                              var12 = (String) var8_ref.field_c;
                                                              if (var12.startsWith("http://")) {
                                                                break L15;
                                                              } else {
                                                                if (!var12.startsWith("https://")) {
                                                                  throw uf.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  break L15;
                                                                }
                                                              }
                                                            }
                                                            var4_ref = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L16: while (true) {
                                                              if (var5 >= var12.length()) {
                                                                Process discarded$11 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var12 + "\"");
                                                                var8_ref.field_e = null;
                                                                break L14;
                                                              } else {
                                                                if (var4_ref.indexOf((int) var12.charAt(var5)) == -1) {
                                                                  throw uf.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  var5++;
                                                                  continue L16;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter1) {
                                                        decompiledCaughtException = decompiledCaughtParameter1;
                                                        var3_ref2 = (Exception) (Object) decompiledCaughtException;
                                                        var8_ref.field_e = (Object) (Object) var3_ref2;
                                                        throw uf.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                                                      }
                                                      break L8;
                                                    }
                                                  }
                                                }
                                              } else {
                                                if (((uf) this).field_c) {
                                                  ((uf) this).field_j.a((byte) -2, (java.awt.Frame) var8_ref.field_c);
                                                  break L8;
                                                } else {
                                                  Object discarded$12 = Class.forName("eg").getMethod("exit", new Class[0]).invoke(((uf) this).field_d, new Object[0]);
                                                  break L8;
                                                }
                                              }
                                            }
                                          } else {
                                            if (((uf) this).field_c) {
                                              var8_ref.field_e = (Object) (Object) ((uf) this).field_j.a(0);
                                              break L8;
                                            } else {
                                              var8_ref.field_e = Class.forName("eg").getMethod("listmodes", new Class[0]).invoke(((uf) this).field_d, new Object[0]);
                                              break L8;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      throw uf.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    }
                                  } else {
                                    var7 = (java.awt.datatransfer.Transferable) var8_ref.field_c;
                                    var10 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var10.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L8;
                                  }
                                }
                              }
                            } else {
                              L17: {
                                var9 = (Object[]) var8_ref.field_c;
                                if (!((uf) this).field_l) {
                                  break L17;
                                } else {
                                  if (((Class) var9[0]).getClassLoader() == null) {
                                    throw new SecurityException();
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                              var8_ref.field_e = (Object) (Object) ((Class) var9[0]).getDeclaredMethod((String) var9[1], (Class[]) var9[2]);
                              break L8;
                            }
                          } else {
                            if (~qg.a(false) > ~field_o) {
                              throw new IOException();
                            } else {
                              var8_ref.field_e = (Object) (Object) new DataInputStream(((java.net.URL) var8_ref.field_c).openStream());
                              break L8;
                            }
                          }
                        }
                      } else {
                        if (~field_o < ~qg.a(false)) {
                          throw new IOException();
                        } else {
                          try {
                            L18: {
                              int discarded$13 = 0;
                              var8_ref.field_e = (Object) (Object) oj.a((String) var8_ref.field_c, var8_ref.field_b).c(-118);
                              break L18;
                            }
                          } catch (java.lang.Exception decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref = (dj) (Object) decompiledCaughtException;
                            var8_ref.field_e = (Object) (Object) var3_ref.getMessage();
                            throw var3_ref;
                          }
                          break L8;
                        }
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

    final ce a(int param0) {
        if (param0 <= 33) {
            return null;
        }
        return this.a(0, 1484280784, (Object) null, 0, 5);
    }

    uf(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        ul var6 = null;
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
          ((uf) this).field_p = null;
          ((uf) this).field_l = false;
          ((uf) this).field_r = false;
          ((uf) this).field_c = false;
          ((uf) this).field_v = null;
          ((uf) this).field_t = null;
          ((uf) this).field_n = null;
          ((uf) this).field_k = null;
          field_a = param1;
          field_g = "1.1";
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
        ((uf) this).field_l = stackIn_3_1 != 0;
        field_e = "Unknown";
        field_s = param0;
        try {
          L1: {
            field_e = System.getProperty("java.vendor");
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
          if (field_e.toLowerCase().indexOf("microsoft") == -1) {
            break L3;
          } else {
            ((uf) this).field_c = true;
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
            var5 = (Exception) (Object) decompiledCaughtException;
            field_h = "Unknown";
            break L5;
          }
        }
        field_b = field_h.toLowerCase();
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
              field_x = System.getProperty("user.home");
              if (null == field_x) {
                break L11;
              } else {
                field_x = field_x + "/";
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
          if (null == field_x) {
            field_x = "~/";
            break L13;
          } else {
            break L13;
          }
        }
        try {
          L14: {
            ((uf) this).field_i = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
          if (!((uf) this).field_c) {
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
                field_m = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
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
          tj.a(field_s, field_a, (byte) -119);
          if (!((uf) this).field_l) {
            break L21;
          } else {
            ((uf) this).field_p = new tc(tj.a(field_s, (byte) 78, (String) null, "random.dat"), "rw", 25L);
            ((uf) this).field_t = new tc(tj.a((byte) -61, "main_file_cache.dat2"), "rw", 314572800L);
            ((uf) this).field_v = new tc(tj.a((byte) -61, "main_file_cache.idx255"), "rw", 1048576L);
            ((uf) this).field_q = new tc[param2];
            var5_int = 0;
            L22: while (true) {
              if (var5_int >= param2) {
                L23: {
                  if (!((uf) this).field_c) {
                    break L23;
                  } else {
                    try {
                      L24: {
                        Object discarded$7 = Class.forName("ph").newInstance();
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
                      if (((uf) this).field_c) {
                        var6 = new ul();
                        ((uf) this).field_j = var6;
                        break L27;
                      } else {
                        ((uf) this).field_d = Class.forName("eg").newInstance();
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
                      if (((uf) this).field_c) {
                        ((uf) this).field_w = new tb();
                        break L30;
                      } else {
                        ((uf) this).field_f = Class.forName("wc").newInstance();
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
                ((uf) this).field_q[var5_int] = new tc(tj.a((byte) -61, "main_file_cache.idx" + var5_int), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        ((uf) this).field_r = false;
        ((uf) this).field_u = new Thread((Runnable) this);
        ((uf) this).field_u.setPriority(10);
        ((uf) this).field_u.setDaemon(true);
        ((uf) this).field_u.start();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
