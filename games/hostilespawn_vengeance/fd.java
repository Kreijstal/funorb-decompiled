/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fd implements Runnable {
    private boolean field_o;
    ee field_q;
    private sl field_r;
    ee field_l;
    static String field_c;
    ee[] field_v;
    private Object field_p;
    private static volatile long field_x;
    private static String field_m;
    static java.lang.reflect.Method field_i;
    private kk field_s;
    ee field_f;
    boolean field_k;
    private static String field_e;
    private kk field_n;
    private tl field_a;
    static String field_h;
    private static int field_t;
    private static String field_g;
    private boolean field_b;
    private Thread field_w;
    static String field_u;
    private Object field_j;
    java.awt.EventQueue field_d;

    private final kk a(boolean param0, String param1, int param2, int param3) {
        if (param3 != 20691) {
            field_u = null;
        }
        return this.a(!param0 ? 1 : 22, (Object) (Object) param1, false, 0, param2);
    }

    final kk a(String param0, int param1, int param2) {
        if (param1 <= 47) {
            ((fd) this).field_o = true;
        }
        return this.a(false, param0, param2, 20691);
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
                ((fd) this).field_o = true;
                this.notifyAll();
                break L0;
              }
            }
            try {
              L1: {
                ((fd) this).field_w.join();
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
              if (((fd) this).field_l == null) {
                break L3;
              } else {
                {
                  L4: {
                    ((fd) this).field_l.c(-1);
                    break L4;
                  }
                }
                break L3;
              }
            }
            L6: {
              if (null != ((fd) this).field_f) {
                {
                  L7: {
                    ((fd) this).field_f.c(-1);
                    break L7;
                  }
                }
                break L6;
              } else {
                break L6;
              }
            }
            L9: {
              if (null == ((fd) this).field_v) {
                break L9;
              } else {
                var2 = 0;
                L10: while (true) {
                  if (((fd) this).field_v.length <= var2) {
                    break L9;
                  } else {
                    if (null != ((fd) this).field_v[var2]) {
                      {
                        L11: {
                          ((fd) this).field_v[var2].c(-1);
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
              if (null != ((fd) this).field_q) {
                {
                  L14: {
                    ((fd) this).field_q.c(-1);
                    break L14;
                  }
                }
                break L13;
              } else {
                break L13;
              }
            }
            var2 = 53 / ((47 - param0) / 41);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final kk a(boolean param0, int param1, int param2, int param3, int param4) {
        if (param0) {
            return null;
        }
        return this.a(6, (Object) null, param0, param2 + (param4 << 16), (param1 << 16) + param3);
    }

    final boolean a(boolean param0) {
        if (!param0) {
            return false;
        }
        if (!((fd) this).field_k) {
            return false;
        }
        if (!((fd) this).field_b) {
            return null != ((fd) this).field_p ? true : false;
        }
        return null != ((fd) this).field_r ? true : false;
    }

    final kk a(int param0, java.awt.Frame param1) {
        if (param0 != 7) {
            return null;
        }
        return this.a(7, (Object) (Object) param1, false, 0, 0);
    }

    private final static ee a(int param0, String param1, String param2, int param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            ee var8_ref = null;
            ee stackIn_13_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            ee stackOut_12_0 = null;
            L0: {
              if (param0 == 33) {
                var4 = "jagex_" + param2 + "_preferences" + param1 + "_rc.dat";
                break L0;
              } else {
                if (param0 == 34) {
                  var4 = "jagex_" + param2 + "_preferences" + param1 + "_wip.dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param2 + "_preferences" + param1 + ".dat";
                  break L0;
                }
              }
            }
            var5_array = new String[]{"c:/rscache/", "/rscache/", field_g, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            var6 = 0;
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
                    var8_ref = new ee(new File(var7, var4), "rw", 10000L);
                    stackOut_12_0 = (ee) var8_ref;
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

    final kk a(int param0, java.net.URL param1) {
        if (param0 != 30085) {
            Object var4 = null;
            kk discarded$0 = this.a(true, (String) null, -77, -50);
        }
        return this.a(4, (Object) (Object) param1, false, 0, 0);
    }

    public final void run() {
        try {
            Object var2 = null;
            Throwable var2_ref = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            Exception var3_ref = null;
            ab var3_ref2 = null;
            ee var3_ref3 = null;
            int var3_int = 0;
            Throwable var4 = null;
            int var4_int = 0;
            String var4_ref = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            Object var8 = null;
            kk var8_ref = null;
            Object[] var9 = null;
            java.awt.Component var10 = null;
            String var11 = null;
            Object[] var12 = null;
            java.awt.Frame var13 = null;
            String var14 = null;
            java.awt.datatransfer.Clipboard var15 = null;
            java.awt.datatransfer.Clipboard var16 = null;
            Object[] var17 = null;
            Thread var18 = null;
            int stackIn_50_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_49_0 = 0;
            int stackOut_48_0 = 0;
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
                    if (((fd) this).field_o) {
                      return;
                    } else {
                      if (null != ((fd) this).field_s) {
                        L4: {
                          var8_ref = ((fd) this).field_s;
                          ((fd) this).field_s = ((fd) this).field_s.field_e;
                          if (((fd) this).field_s != null) {
                            break L4;
                          } else {
                            ((fd) this).field_n = null;
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
                    }
                  }
                }
              }
              try {
                L7: {
                  L8: {
                    var2_int = var8_ref.field_g;
                    if (var2_int == 1) {
                      if (~field_x < ~hn.a((byte) 80)) {
                        throw new IOException();
                      } else {
                        var8_ref.field_c = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var8_ref.field_a), var8_ref.field_b);
                        break L8;
                      }
                    } else {
                      if (22 == var2_int) {
                        if (~hn.a((byte) 80) > ~field_x) {
                          throw new IOException();
                        } else {
                          try {
                            L9: {
                              var8_ref.field_c = (Object) (Object) qj.a(27, (String) var8_ref.field_a, var8_ref.field_b).a(31067);
                              break L9;
                            }
                          } catch (java.lang.Exception decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref2 = (ab) (Object) decompiledCaughtException;
                            var8_ref.field_c = (Object) (Object) var3_ref2.getMessage();
                            throw var3_ref2;
                          }
                          break L8;
                        }
                      } else {
                        if (var2_int == 2) {
                          var18 = new Thread((Runnable) var8_ref.field_a);
                          var18.setDaemon(true);
                          var18.start();
                          var18.setPriority(var8_ref.field_b);
                          var8_ref.field_c = (Object) (Object) var18;
                          break L8;
                        } else {
                          if (4 == var2_int) {
                            if (hn.a((byte) 80) < field_x) {
                              throw new IOException();
                            } else {
                              var8_ref.field_c = (Object) (Object) new DataInputStream(((java.net.URL) var8_ref.field_a).openStream());
                              break L8;
                            }
                          } else {
                            if (8 != var2_int) {
                              if (var2_int == 9) {
                                L10: {
                                  var17 = (Object[]) var8_ref.field_a;
                                  if (((fd) this).field_k) {
                                    if (((Class) var17[0]).getClassLoader() == null) {
                                      throw new SecurityException();
                                    } else {
                                      break L10;
                                    }
                                  } else {
                                    break L10;
                                  }
                                }
                                var8_ref.field_c = (Object) (Object) ((Class) var17[0]).getDeclaredField((String) var17[1]);
                                break L8;
                              } else {
                                if (var2_int == 18) {
                                  var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8_ref.field_c = (Object) (Object) var16.getContents((Object) null);
                                  break L8;
                                } else {
                                  if (var2_int == 19) {
                                    var7 = (java.awt.datatransfer.Transferable) var8_ref.field_a;
                                    var15 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var15.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L8;
                                  } else {
                                    if (((fd) this).field_k) {
                                      if (var2_int == 3) {
                                        if (hn.a((byte) 80) >= field_x) {
                                          var14 = (255 & var8_ref.field_b >> 24) + "." + ((var8_ref.field_b & 16770738) >> 16) + "." + ((var8_ref.field_b & 65486) >> 8) + "." + (255 & var8_ref.field_b);
                                          var8_ref.field_c = (Object) (Object) java.net.InetAddress.getByName(var14).getHostName();
                                          break L8;
                                        } else {
                                          throw new IOException();
                                        }
                                      } else {
                                        if (var2_int == 21) {
                                          if (hn.a((byte) 80) < field_x) {
                                            throw new IOException();
                                          } else {
                                            var8_ref.field_c = (Object) (Object) java.net.InetAddress.getByName((String) var8_ref.field_a).getAddress();
                                            break L8;
                                          }
                                        } else {
                                          if (var2_int == 5) {
                                            if (!((fd) this).field_b) {
                                              var8_ref.field_c = Class.forName("hc").getMethod("listmodes", new Class[0]).invoke(((fd) this).field_p, new Object[0]);
                                              break L8;
                                            } else {
                                              var8_ref.field_c = (Object) (Object) ((fd) this).field_r.a((byte) 113);
                                              break L8;
                                            }
                                          } else {
                                            if (var2_int == 6) {
                                              var13 = new java.awt.Frame("Jagex Full Screen");
                                              var8_ref.field_c = (Object) (Object) var13;
                                              var13.setResizable(false);
                                              if (((fd) this).field_b) {
                                                ((fd) this).field_r.a(65535 & var8_ref.field_b, var8_ref.field_b >>> 16, -7018, 65535 & var8_ref.field_d, var13, var8_ref.field_d >> 16);
                                                break L8;
                                              } else {
                                                Object discarded$6 = Class.forName("hc").getMethod("enter", new Class[5]).invoke(((fd) this).field_p, new Object[5]);
                                                break L8;
                                              }
                                            } else {
                                              if (var2_int == 7) {
                                                if (((fd) this).field_b) {
                                                  ((fd) this).field_r.a((java.awt.Frame) var8_ref.field_a, -7738);
                                                  break L8;
                                                } else {
                                                  Object discarded$7 = Class.forName("hc").getMethod("exit", new Class[0]).invoke(((fd) this).field_p, new Object[0]);
                                                  break L8;
                                                }
                                              } else {
                                                if (var2_int == 12) {
                                                  var3_ref3 = fd.a(field_t, (String) var8_ref.field_a, field_m, -7);
                                                  var8_ref.field_c = (Object) (Object) var3_ref3;
                                                  break L8;
                                                } else {
                                                  if (var2_int != 13) {
                                                    L11: {
                                                      if (!((fd) this).field_k) {
                                                        break L11;
                                                      } else {
                                                        if (14 != var2_int) {
                                                          break L11;
                                                        } else {
                                                          var3_int = var8_ref.field_b;
                                                          var4_int = var8_ref.field_d;
                                                          if (!((fd) this).field_b) {
                                                            Object discarded$8 = Class.forName("dm").getDeclaredMethod("movemouse", new Class[2]).invoke(((fd) this).field_j, new Object[2]);
                                                            break L8;
                                                          } else {
                                                            ((fd) this).field_a.a(var4_int, -93, var3_int);
                                                            break L8;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L12: {
                                                      if (!((fd) this).field_k) {
                                                        break L12;
                                                      } else {
                                                        if (15 != var2_int) {
                                                          break L12;
                                                        } else {
                                                          L13: {
                                                            if (var8_ref.field_b == 0) {
                                                              stackOut_49_0 = 0;
                                                              stackIn_50_0 = stackOut_49_0;
                                                              break L13;
                                                            } else {
                                                              stackOut_48_0 = 1;
                                                              stackIn_50_0 = stackOut_48_0;
                                                              break L13;
                                                            }
                                                          }
                                                          var3_int = stackIn_50_0;
                                                          var10 = (java.awt.Component) var8_ref.field_a;
                                                          if (((fd) this).field_b) {
                                                            ((fd) this).field_a.a(0, var3_int != 0, var10);
                                                            break L8;
                                                          } else {
                                                            Object discarded$9 = Class.forName("dm").getDeclaredMethod("showcursor", new Class[2]).invoke(((fd) this).field_j, new Object[2]);
                                                            break L8;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L14: {
                                                      if (((fd) this).field_b) {
                                                        break L14;
                                                      } else {
                                                        if (var2_int == 17) {
                                                          var12 = (Object[]) var8_ref.field_a;
                                                          Object discarded$10 = Class.forName("dm").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((fd) this).field_j, new Object[5]);
                                                          break L8;
                                                        } else {
                                                          break L14;
                                                        }
                                                      }
                                                    }
                                                    if (var2_int != 16) {
                                                      throw fd.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    } else {
                                                      try {
                                                        L15: {
                                                          if (field_c.startsWith("win")) {
                                                            L16: {
                                                              var11 = (String) var8_ref.field_a;
                                                              if (var11.startsWith("http://")) {
                                                                break L16;
                                                              } else {
                                                                if (var11.startsWith("https://")) {
                                                                  break L16;
                                                                } else {
                                                                  throw fd.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                            var4_ref = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L17: while (true) {
                                                              if (var5 >= var11.length()) {
                                                                Process discarded$11 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var11 + "\"");
                                                                var8_ref.field_c = null;
                                                                break L15;
                                                              } else {
                                                                if (var4_ref.indexOf((int) var11.charAt(var5)) == -1) {
                                                                  throw fd.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  var5++;
                                                                  continue L17;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            throw fd.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                                                        decompiledCaughtException = decompiledCaughtParameter2;
                                                        var3_ref = (Exception) (Object) decompiledCaughtException;
                                                        var8_ref.field_c = (Object) (Object) var3_ref;
                                                        throw fd.<RuntimeException>$cfr$sneakyThrow(var3_ref);
                                                      }
                                                      break L8;
                                                    }
                                                  } else {
                                                    var3_ref3 = fd.a(field_t, (String) var8_ref.field_a, "", -7);
                                                    var8_ref.field_c = (Object) (Object) var3_ref3;
                                                    break L8;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      throw fd.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    }
                                  }
                                }
                              }
                            } else {
                              L18: {
                                var9 = (Object[]) var8_ref.field_a;
                                if (((fd) this).field_k) {
                                  if (null == ((Class) var9[0]).getClassLoader()) {
                                    throw new SecurityException();
                                  } else {
                                    break L18;
                                  }
                                } else {
                                  break L18;
                                }
                              }
                              var8_ref.field_c = (Object) (Object) ((Class) var9[0]).getDeclaredMethod((String) var9[1], (Class[]) var9[2]);
                              break L8;
                            }
                          }
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

    final kk a(byte param0, Class param1, String param2) {
        if (param0 <= 91) {
            ((fd) this).field_s = null;
        }
        return this.a(9, (Object) (Object) new Object[2], false, 0, 0);
    }

    private final kk a(int param0, Object param1, boolean param2, int param3, int param4) {
        kk var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          var6 = new kk();
          if (!param2) {
            break L0;
          } else {
            field_c = null;
            break L0;
          }
        }
        var6.field_d = param3;
        var6.field_b = param4;
        var6.field_a = param1;
        var6.field_g = param0;
        var7 = this;
        synchronized (var7) {
          L1: {
            L2: {
              if (null != ((fd) this).field_n) {
                ((fd) this).field_n.field_e = var6;
                ((fd) this).field_n = var6;
                break L2;
              } else {
                ((fd) this).field_s = var6;
                ((fd) this).field_n = var6;
                break L2;
              }
            }
            this.notify();
            break L1;
          }
        }
        return var6;
    }

    final kk a(int param0, Runnable param1, int param2) {
        int var4 = -31 / ((9 - param2) / 44);
        return this.a(2, (Object) (Object) param1, false, 0, param0);
    }

    final kk a(int param0) {
        int var2 = 102 % ((-15 - param0) / 43);
        return this.a(5, (Object) null, false, 0, 0);
    }

    final kk a(Class[] param0, Class param1, String param2, int param3) {
        if (param3 < 104) {
            ((fd) this).field_w = null;
        }
        return this.a(8, (Object) (Object) new Object[3], false, 0, 0);
    }

    fd(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        sl var6 = null;
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
          ((fd) this).field_o = false;
          ((fd) this).field_q = null;
          ((fd) this).field_n = null;
          ((fd) this).field_k = false;
          ((fd) this).field_b = false;
          ((fd) this).field_f = null;
          ((fd) this).field_l = null;
          ((fd) this).field_s = null;
          field_m = param1;
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
        ((fd) this).field_k = stackIn_3_1 != 0;
        field_u = "Unknown";
        field_t = param0;
        field_h = "1.1";
        try {
          L1: {
            field_u = System.getProperty("java.vendor");
            field_h = System.getProperty("java.version");
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
          if (field_u.toLowerCase().indexOf("microsoft") != -1) {
            ((fd) this).field_b = true;
            break L3;
          } else {
            break L3;
          }
        }
        try {
          L4: {
            field_e = System.getProperty("os.name");
            break L4;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var5 = (Exception) (Object) decompiledCaughtException;
            field_e = "Unknown";
            break L5;
          }
        }
        field_c = field_e.toLowerCase();
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
              field_g = System.getProperty("user.home");
              if (null == field_g) {
                break L11;
              } else {
                field_g = field_g + "/";
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
          if (field_g == null) {
            field_g = "~/";
            break L13;
          } else {
            break L13;
          }
        }
        try {
          L14: {
            ((fd) this).field_d = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
          if (!((fd) this).field_b) {
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
                field_i = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
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
          qd.a(-1, field_t, field_m);
          if (!((fd) this).field_k) {
            break L21;
          } else {
            ((fd) this).field_q = new ee(qd.a(field_t, (String) null, "random.dat", true), "rw", 25L);
            ((fd) this).field_l = new ee(qd.a("main_file_cache.dat2", -19005), "rw", 314572800L);
            ((fd) this).field_f = new ee(qd.a("main_file_cache.idx255", -19005), "rw", 1048576L);
            ((fd) this).field_v = new ee[param2];
            var5_int = 0;
            L22: while (true) {
              if (var5_int >= param2) {
                L23: {
                  if (((fd) this).field_b) {
                    try {
                      L24: {
                        Object discarded$7 = Class.forName("qe").newInstance();
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
                      if (((fd) this).field_b) {
                        var6 = new sl();
                        ((fd) this).field_r = var6;
                        break L27;
                      } else {
                        ((fd) this).field_p = Class.forName("hc").newInstance();
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
                      if (!((fd) this).field_b) {
                        ((fd) this).field_j = Class.forName("dm").newInstance();
                        break L30;
                      } else {
                        ((fd) this).field_a = new tl();
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
                ((fd) this).field_v[var5_int] = new ee(qd.a("main_file_cache.idx" + var5_int, -19005), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        ((fd) this).field_o = false;
        ((fd) this).field_w = new Thread((Runnable) this);
        ((fd) this).field_w.setPriority(10);
        ((fd) this).field_w.setDaemon(true);
        ((fd) this).field_w.start();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
