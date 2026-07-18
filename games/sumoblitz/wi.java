/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wi implements Runnable {
    private static int field_j;
    java.awt.EventQueue field_g;
    private static volatile long field_c;
    static String field_o;
    sr field_l;
    static String field_u;
    private ep field_w;
    private static String field_s;
    private static String field_p;
    static String field_q;
    private static String field_h;
    private boolean field_m;
    private Object field_r;
    static java.lang.reflect.Method field_e;
    sr[] field_i;
    boolean field_f;
    boolean field_t;
    private jr field_k;
    sr field_n;
    private jr field_x;
    private Thread field_a;
    private Object field_v;
    sr field_d;
    private bm field_b;

    private final static sr a(String param0, boolean param1, String param2, int param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            sr var8_ref = null;
            sr stackIn_15_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            sr stackOut_14_0 = null;
            L0: {
              if (param1) {
                break L0;
              } else {
                sr discarded$1 = wi.a((String) null, true, (String) null, 127);
                break L0;
              }
            }
            L1: {
              if (param3 != 33) {
                if (34 == param3) {
                  var4 = "jagex_" + param0 + "_preferences" + param2 + "_wip.dat";
                  break L1;
                } else {
                  var4 = "jagex_" + param0 + "_preferences" + param2 + ".dat";
                  break L1;
                }
              } else {
                var4 = "jagex_" + param0 + "_preferences" + param2 + "_rc.dat";
                break L1;
              }
            }
            var5_array = new String[]{"c:/rscache/", "/rscache/", field_s, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            var6 = 0;
            L2: while (true) {
              if (~var6 <= ~var5_array.length) {
                return null;
              } else {
                L3: {
                  L4: {
                    var7 = var5_array[var6];
                    if (0 >= var7.length()) {
                      break L4;
                    } else {
                      if (!new File(var7).exists()) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  try {
                    L5: {
                      var8_ref = new sr(new File(var7, var4), "rw", 10000L);
                      stackOut_14_0 = (sr) var8_ref;
                      stackIn_15_0 = stackOut_14_0;
                      decompiledRegionSelector0 = 0;
                      break L5;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L6: {
                      var8 = (Exception) (Object) decompiledCaughtException;
                      decompiledRegionSelector0 = 1;
                      break L6;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    return stackIn_15_0;
                  } else {
                    break L3;
                  }
                }
                var6++;
                continue L2;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final jr a(Object param0, int param1, int param2, boolean param3, int param4) {
        jr var6 = null;
        RuntimeException var6_ref = null;
        Object var7 = null;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        var6 = new jr();
        var6.field_e = param1;
        var6.field_b = param4;
        var6.field_a = param0;
        var6.field_g = param2;
        var7 = this;
        synchronized (var7) {
          L0: {
            L1: {
              if (!param3) {
                break L1;
              } else {
                ((wi) this).field_d = null;
                break L1;
              }
            }
            L2: {
              if (((wi) this).field_x == null) {
                ((wi) this).field_k = var6;
                ((wi) this).field_x = var6;
                break L2;
              } else {
                ((wi) this).field_x.field_f = var6;
                ((wi) this).field_x = var6;
                break L2;
              }
            }
            this.notify();
            break L0;
          }
        }
        return var6;
    }

    private final jr a(int param0, String param1, boolean param2, boolean param3) {
        RuntimeException var5 = null;
        Object stackIn_4_0 = null;
        String stackIn_4_1 = null;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        int stackIn_4_4 = 0;
        Object stackIn_6_0 = null;
        String stackIn_6_1 = null;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        int stackIn_6_4 = 0;
        Object stackIn_7_0 = null;
        String stackIn_7_1 = null;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        int stackIn_7_4 = 0;
        int stackIn_7_5 = 0;
        Object stackOut_3_0 = null;
        String stackOut_3_1 = null;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        int stackOut_3_4 = 0;
        Object stackOut_6_0 = null;
        String stackOut_6_1 = null;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        int stackOut_6_4 = 0;
        int stackOut_6_5 = 0;
        Object stackOut_4_0 = null;
        String stackOut_4_1 = null;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        int stackOut_4_4 = 0;
        int stackOut_4_5 = 0;
        L0: {
          if (param2) {
            break L0;
          } else {
            ((wi) this).field_b = null;
            break L0;
          }
        }
        L1: {
          stackOut_3_0 = this;
          stackOut_3_1 = (String) param1;
          stackOut_3_2 = 0;
          stackOut_3_3 = param0;
          stackOut_3_4 = 0;
          stackIn_6_0 = stackOut_3_0;
          stackIn_6_1 = stackOut_3_1;
          stackIn_6_2 = stackOut_3_2;
          stackIn_6_3 = stackOut_3_3;
          stackIn_6_4 = stackOut_3_4;
          stackIn_4_0 = stackOut_3_0;
          stackIn_4_1 = stackOut_3_1;
          stackIn_4_2 = stackOut_3_2;
          stackIn_4_3 = stackOut_3_3;
          stackIn_4_4 = stackOut_3_4;
          if (!param3) {
            stackOut_6_0 = this;
            stackOut_6_1 = (String) (Object) stackIn_6_1;
            stackOut_6_2 = stackIn_6_2;
            stackOut_6_3 = stackIn_6_3;
            stackOut_6_4 = stackIn_6_4;
            stackOut_6_5 = 1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            stackIn_7_2 = stackOut_6_2;
            stackIn_7_3 = stackOut_6_3;
            stackIn_7_4 = stackOut_6_4;
            stackIn_7_5 = stackOut_6_5;
            break L1;
          } else {
            stackOut_4_0 = this;
            stackOut_4_1 = (String) (Object) stackIn_4_1;
            stackOut_4_2 = stackIn_4_2;
            stackOut_4_3 = stackIn_4_3;
            stackOut_4_4 = stackIn_4_4;
            stackOut_4_5 = 22;
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_7_2 = stackOut_4_2;
            stackIn_7_3 = stackOut_4_3;
            stackIn_7_4 = stackOut_4_4;
            stackIn_7_5 = stackOut_4_5;
            break L1;
          }
        }
        return this.a((Object) (Object) stackIn_7_1, stackIn_7_2, stackIn_7_3, stackIn_7_4 != 0, stackIn_7_5);
    }

    final void a(boolean param0) {
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
                ((wi) this).field_m = true;
                this.notifyAll();
                break L0;
              }
            }
            L1: {
              if (!param0) {
                break L1;
              } else {
                jr discarded$1 = ((wi) this).a(true, (Runnable) null, 68);
                break L1;
              }
            }
            try {
              L2: {
                ((wi) this).field_a.join();
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
              if (((wi) this).field_l == null) {
                break L4;
              } else {
                {
                  L5: {
                    ((wi) this).field_l.b(0);
                    break L5;
                  }
                }
                break L4;
              }
            }
            L7: {
              if (null == ((wi) this).field_d) {
                break L7;
              } else {
                {
                  L8: {
                    ((wi) this).field_d.b(0);
                    break L8;
                  }
                }
                break L7;
              }
            }
            L10: {
              if (((wi) this).field_i == null) {
                break L10;
              } else {
                var2_int = 0;
                L11: while (true) {
                  if (((wi) this).field_i.length <= var2_int) {
                    break L10;
                  } else {
                    L12: {
                      if (null != ((wi) this).field_i[var2_int]) {
                        {
                          L13: {
                            ((wi) this).field_i[var2_int].b(0);
                            break L13;
                          }
                        }
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    var2_int++;
                    continue L11;
                  }
                }
              }
            }
            L15: {
              if (((wi) this).field_n == null) {
                break L15;
              } else {
                {
                  L16: {
                    ((wi) this).field_n.b(0);
                    break L16;
                  }
                }
                break L15;
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
            Object var1 = null;
            jr var1_ref = null;
            Object var2 = null;
            Throwable var2_ref = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            hh var3_ref = null;
            Exception var3_ref2 = null;
            Thread var3_ref3 = null;
            Object[] var3_array = null;
            java.awt.datatransfer.Clipboard var3_ref4 = null;
            java.awt.datatransfer.Transferable var3_ref5 = null;
            String var3_ref6 = null;
            java.awt.Frame var3_ref7 = null;
            sr var3_ref8 = null;
            int var3_int = 0;
            Throwable var4 = null;
            java.awt.datatransfer.Clipboard var4_ref = null;
            int var4_int = 0;
            String var4_ref2 = null;
            java.awt.Component var4_ref3 = null;
            int var5 = 0;
            Throwable var6 = null;
            int stackIn_113_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_112_0 = 0;
            int stackOut_110_0 = 0;
            L0: while (true) {
              synchronized (var2) {
                L1: {
                  ((Object) (Object) var1_ref).notify();
                  var2 = this;
                  break L1;
                }
              }
              synchronized (var2) {
                L2: {
                  L3: while (true) {
                    if (((wi) this).field_m) {
                      return;
                    } else {
                      if (null == ((wi) this).field_k) {
                        {
                          L4: {
                            this.wait();
                            break L4;
                          }
                        }
                        continue L3;
                      } else {
                        L6: {
                          var1_ref = ((wi) this).field_k;
                          ((wi) this).field_k = ((wi) this).field_k.field_f;
                          if (((wi) this).field_k != null) {
                            break L6;
                          } else {
                            ((wi) this).field_x = null;
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
                    var2_int = var1_ref.field_b;
                    if (var2_int == 1) {
                      if (wq.a(-24) < field_c) {
                        throw new IOException();
                      } else {
                        var1_ref.field_d = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var1_ref.field_a), var1_ref.field_g);
                        break L8;
                      }
                    } else {
                      if (22 != var2_int) {
                        if (var2_int != 2) {
                          if (var2_int == 4) {
                            if (field_c <= wq.a(-94)) {
                              var1_ref.field_d = (Object) (Object) new DataInputStream(((java.net.URL) var1_ref.field_a).openStream());
                              break L8;
                            } else {
                              throw new IOException();
                            }
                          } else {
                            if (var2_int != 8) {
                              if (var2_int != 9) {
                                if (18 != var2_int) {
                                  if (var2_int == 19) {
                                    var3_ref5 = (java.awt.datatransfer.Transferable) var1_ref.field_a;
                                    var4_ref = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var4_ref.setContents(var3_ref5, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L8;
                                  } else {
                                    if (((wi) this).field_f) {
                                      if (var2_int != 3) {
                                        if (var2_int != 21) {
                                          if (var2_int != 5) {
                                            if (var2_int == 6) {
                                              L9: {
                                                var3_ref7 = new java.awt.Frame("Jagex Full Screen");
                                                var1_ref.field_d = (Object) (Object) var3_ref7;
                                                var3_ref7.setResizable(false);
                                                if (((wi) this).field_t) {
                                                  ((wi) this).field_w.a(var1_ref.field_g & 65535, (byte) -123, var1_ref.field_g >>> 254430288, var1_ref.field_e & 65535, var1_ref.field_e >> -2084239760, var3_ref7);
                                                  break L9;
                                                } else {
                                                  Object discarded$6 = Class.forName("cu").getMethod("enter", new Class[5]).invoke(((wi) this).field_r, new Object[5]);
                                                  break L9;
                                                }
                                              }
                                              break L8;
                                            } else {
                                              if (var2_int != 7) {
                                                if (12 != var2_int) {
                                                  if (var2_int == 13) {
                                                    var3_ref8 = wi.a("", true, (String) var1_ref.field_a, field_j);
                                                    var1_ref.field_d = (Object) (Object) var3_ref8;
                                                    break L8;
                                                  } else {
                                                    L10: {
                                                      if (!((wi) this).field_f) {
                                                        break L10;
                                                      } else {
                                                        if (14 == var2_int) {
                                                          L11: {
                                                            var3_int = var1_ref.field_g;
                                                            var4_int = var1_ref.field_e;
                                                            if (!((wi) this).field_t) {
                                                              Object discarded$7 = Class.forName("cg").getDeclaredMethod("movemouse", new Class[2]).invoke(((wi) this).field_v, new Object[2]);
                                                              break L11;
                                                            } else {
                                                              ((wi) this).field_b.a(var4_int, var3_int, (byte) 84);
                                                              break L11;
                                                            }
                                                          }
                                                          break L8;
                                                        } else {
                                                          break L10;
                                                        }
                                                      }
                                                    }
                                                    L12: {
                                                      if (!((wi) this).field_f) {
                                                        break L12;
                                                      } else {
                                                        if (var2_int != 15) {
                                                          break L12;
                                                        } else {
                                                          L13: {
                                                            if (var1_ref.field_g == 0) {
                                                              stackOut_112_0 = 0;
                                                              stackIn_113_0 = stackOut_112_0;
                                                              break L13;
                                                            } else {
                                                              stackOut_110_0 = 1;
                                                              stackIn_113_0 = stackOut_110_0;
                                                              break L13;
                                                            }
                                                          }
                                                          L14: {
                                                            var3_int = stackIn_113_0;
                                                            var4_ref3 = (java.awt.Component) var1_ref.field_a;
                                                            if (((wi) this).field_t) {
                                                              ((wi) this).field_b.a(false, var3_int != 0, var4_ref3);
                                                              break L14;
                                                            } else {
                                                              Object discarded$8 = Class.forName("cg").getDeclaredMethod("showcursor", new Class[2]).invoke(((wi) this).field_v, new Object[2]);
                                                              break L14;
                                                            }
                                                          }
                                                          break L8;
                                                        }
                                                      }
                                                    }
                                                    L15: {
                                                      if (((wi) this).field_t) {
                                                        break L15;
                                                      } else {
                                                        if (var2_int != 17) {
                                                          break L15;
                                                        } else {
                                                          var3_array = (Object[]) var1_ref.field_a;
                                                          Object discarded$9 = Class.forName("cg").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((wi) this).field_v, new Object[5]);
                                                          break L8;
                                                        }
                                                      }
                                                    }
                                                    if (16 == var2_int) {
                                                      try {
                                                        L16: {
                                                          if (!field_o.startsWith("win")) {
                                                            throw wi.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          } else {
                                                            L17: {
                                                              var3_ref6 = (String) var1_ref.field_a;
                                                              if (var3_ref6.startsWith("http://")) {
                                                                break L17;
                                                              } else {
                                                                if (!var3_ref6.startsWith("https://")) {
                                                                  throw wi.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  break L17;
                                                                }
                                                              }
                                                            }
                                                            var4_ref2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L18: while (true) {
                                                              if (~var3_ref6.length() >= ~var5) {
                                                                Process discarded$10 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var3_ref6 + "\"");
                                                                var1_ref.field_d = null;
                                                                break L16;
                                                              } else {
                                                                if (var4_ref2.indexOf((int) var3_ref6.charAt(var5)) != -1) {
                                                                  var5++;
                                                                  continue L18;
                                                                } else {
                                                                  throw wi.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter1) {
                                                        decompiledCaughtException = decompiledCaughtParameter1;
                                                        var3_ref2 = (Exception) (Object) decompiledCaughtException;
                                                        var1_ref.field_d = (Object) (Object) var3_ref2;
                                                        throw wi.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                                                      }
                                                      break L8;
                                                    } else {
                                                      throw wi.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    }
                                                  }
                                                } else {
                                                  var3_ref8 = wi.a(field_p, true, (String) var1_ref.field_a, field_j);
                                                  var1_ref.field_d = (Object) (Object) var3_ref8;
                                                  break L8;
                                                }
                                              } else {
                                                if (!((wi) this).field_t) {
                                                  Object discarded$11 = Class.forName("cu").getMethod("exit", new Class[0]).invoke(((wi) this).field_r, new Object[0]);
                                                  break L8;
                                                } else {
                                                  ((wi) this).field_w.a((java.awt.Frame) var1_ref.field_a, 8);
                                                  break L8;
                                                }
                                              }
                                            }
                                          } else {
                                            if (((wi) this).field_t) {
                                              var1_ref.field_d = (Object) (Object) ((wi) this).field_w.a((byte) -128);
                                              break L8;
                                            } else {
                                              var1_ref.field_d = Class.forName("cu").getMethod("listmodes", new Class[0]).invoke(((wi) this).field_r, new Object[0]);
                                              break L8;
                                            }
                                          }
                                        } else {
                                          if (~wq.a(-18) > ~field_c) {
                                            throw new IOException();
                                          } else {
                                            var1_ref.field_d = (Object) (Object) java.net.InetAddress.getByName((String) var1_ref.field_a).getAddress();
                                            break L8;
                                          }
                                        }
                                      } else {
                                        if (field_c <= wq.a(-106)) {
                                          var3_ref6 = (var1_ref.field_g >> -884897608 & 255) + "." + (var1_ref.field_g >> 76807024 & 255) + "." + ((var1_ref.field_g & 65425) >> -460963224) + "." + (var1_ref.field_g & 255);
                                          var1_ref.field_d = (Object) (Object) java.net.InetAddress.getByName(var3_ref6).getHostName();
                                          break L8;
                                        } else {
                                          throw new IOException();
                                        }
                                      }
                                    } else {
                                      throw wi.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    }
                                  }
                                } else {
                                  var3_ref4 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var1_ref.field_d = (Object) (Object) var3_ref4.getContents((Object) null);
                                  break L8;
                                }
                              } else {
                                L19: {
                                  var3_array = (Object[]) var1_ref.field_a;
                                  if (((wi) this).field_f) {
                                    if (null != ((Class) var3_array[0]).getClassLoader()) {
                                      break L19;
                                    } else {
                                      throw new SecurityException();
                                    }
                                  } else {
                                    break L19;
                                  }
                                }
                                var1_ref.field_d = (Object) (Object) ((Class) var3_array[0]).getDeclaredField((String) var3_array[1]);
                                break L8;
                              }
                            } else {
                              L20: {
                                var3_array = (Object[]) var1_ref.field_a;
                                if (((wi) this).field_f) {
                                  if (null == ((Class) var3_array[0]).getClassLoader()) {
                                    throw new SecurityException();
                                  } else {
                                    break L20;
                                  }
                                } else {
                                  break L20;
                                }
                              }
                              var1_ref.field_d = (Object) (Object) ((Class) var3_array[0]).getDeclaredMethod((String) var3_array[1], (Class[]) var3_array[2]);
                              break L8;
                            }
                          }
                        } else {
                          var3_ref3 = new Thread((Runnable) var1_ref.field_a);
                          var3_ref3.setDaemon(true);
                          var3_ref3.start();
                          var3_ref3.setPriority(var1_ref.field_g);
                          var1_ref.field_d = (Object) (Object) var3_ref3;
                          break L8;
                        }
                      } else {
                        if (field_c > wq.a(-96)) {
                          throw new IOException();
                        } else {
                          try {
                            L21: {
                              var1_ref.field_d = (Object) (Object) rf.a((String) var1_ref.field_a, var1_ref.field_g, true).b((byte) 61);
                              break L21;
                            }
                          } catch (java.lang.Exception decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref = (hh) (Object) decompiledCaughtException;
                            var1_ref.field_d = (Object) (Object) var3_ref.getMessage();
                            throw var3_ref;
                          }
                          break L8;
                        }
                      }
                    }
                  }
                  var1_ref.field_c = 1;
                  break L7;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                L22: {
                  var2_ref = decompiledCaughtException;
                  var1_ref.field_c = 2;
                  break L22;
                }
              }
              var2 = (Object) (Object) var1_ref;
              continue L0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        if (!((wi) this).field_f) {
          return false;
        } else {
          var2_int = -31 % ((param0 - 16) / 51);
          if (((wi) this).field_t) {
            L0: {
              if (null == ((wi) this).field_w) {
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L0;
              } else {
                stackOut_13_0 = 1;
                stackIn_16_0 = stackOut_13_0;
                break L0;
              }
            }
            return stackIn_16_0 != 0;
          } else {
            L1: {
              if (((wi) this).field_r == null) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L1;
              } else {
                stackOut_8_0 = 1;
                stackIn_11_0 = stackOut_8_0;
                break L1;
              }
            }
            return stackIn_11_0 != 0;
          }
        }
    }

    final jr a(int param0, Class param1, String param2, Class[] param3) {
        RuntimeException var5 = null;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            ((wi) this).field_i = null;
            break L0;
          }
        }
        return this.a((Object) (Object) new Object[3], 0, 0, false, 8);
    }

    final jr a(boolean param0, Runnable param1, int param2) {
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        Runnable stackIn_4_1 = null;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        Object stackIn_6_0 = null;
        Runnable stackIn_6_1 = null;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        Object stackIn_7_0 = null;
        Runnable stackIn_7_1 = null;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        int stackIn_7_4 = 0;
        Object stackOut_3_0 = null;
        Runnable stackOut_3_1 = null;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        Object stackOut_6_0 = null;
        Runnable stackOut_6_1 = null;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        int stackOut_6_4 = 0;
        Object stackOut_4_0 = null;
        Runnable stackOut_4_1 = null;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        int stackOut_4_4 = 0;
        L0: {
          if (param0) {
            break L0;
          } else {
            boolean discarded$2 = ((wi) this).a((byte[]) null, -30, (File) null);
            break L0;
          }
        }
        L1: {
          stackOut_3_0 = this;
          stackOut_3_1 = (Runnable) param1;
          stackOut_3_2 = 0;
          stackOut_3_3 = param2;
          stackIn_6_0 = stackOut_3_0;
          stackIn_6_1 = stackOut_3_1;
          stackIn_6_2 = stackOut_3_2;
          stackIn_6_3 = stackOut_3_3;
          stackIn_4_0 = stackOut_3_0;
          stackIn_4_1 = stackOut_3_1;
          stackIn_4_2 = stackOut_3_2;
          stackIn_4_3 = stackOut_3_3;
          if (param0) {
            stackOut_6_0 = this;
            stackOut_6_1 = (Runnable) (Object) stackIn_6_1;
            stackOut_6_2 = stackIn_6_2;
            stackOut_6_3 = stackIn_6_3;
            stackOut_6_4 = 0;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            stackIn_7_2 = stackOut_6_2;
            stackIn_7_3 = stackOut_6_3;
            stackIn_7_4 = stackOut_6_4;
            break L1;
          } else {
            stackOut_4_0 = this;
            stackOut_4_1 = (Runnable) (Object) stackIn_4_1;
            stackOut_4_2 = stackIn_4_2;
            stackOut_4_3 = stackIn_4_3;
            stackOut_4_4 = 1;
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_7_2 = stackOut_4_2;
            stackIn_7_3 = stackOut_4_3;
            stackIn_7_4 = stackOut_4_4;
            break L1;
          }
        }
        return this.a((Object) (Object) stackIn_7_1, stackIn_7_2, stackIn_7_3, stackIn_7_4 != 0, 2);
    }

    final jr a(byte param0, String param1, int param2) {
        RuntimeException var4 = null;
        L0: {
          if (param0 >= 8) {
            break L0;
          } else {
            field_j = 62;
            break L0;
          }
        }
        return this.a(param2, param1, true, false);
    }

    final boolean a(byte[] param0, int param1, File param2) {
        FileOutputStream var4 = null;
        IOException var4_ref = null;
        RuntimeException var4_ref2 = null;
        int stackIn_4_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              var4 = new FileOutputStream(param2);
              if (param1 == -31357) {
                break L1;
              } else {
                jr discarded$2 = ((wi) this).a(-111, (Class) null, (String) null, (Class[]) null);
                break L1;
              }
            }
            var4.write(param0, 0, param0.length);
            var4.close();
            stackOut_3_0 = 1;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (IOException) (Object) decompiledCaughtException;
          throw new RuntimeException();
        }
        return stackIn_4_0 != 0;
    }

    final jr a(byte param0, java.net.URL param1) {
        RuntimeException var3 = null;
        if (param0 > 71) {
          return this.a((Object) (Object) param1, 0, 0, false, 4);
        } else {
          return null;
        }
    }

    final jr a(java.awt.Frame param0, int param1) {
        RuntimeException var3 = null;
        L0: {
          if (param1 == 19) {
            break L0;
          } else {
            boolean discarded$2 = ((wi) this).a((byte) -116);
            break L0;
          }
        }
        return this.a((Object) (Object) param0, 0, 0, false, 7);
    }

    final jr b(byte param0) {
        int var2_int = 0;
        var2_int = -105 % ((73 - param0) / 41);
        return this.a((Object) null, 0, 0, false, 5);
    }

    final jr a(int param0, String param1, Class param2) {
        RuntimeException var4 = null;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            jr discarded$2 = ((wi) this).a(-2, (String) null, (Class) null);
            break L0;
          }
        }
        return this.a((Object) (Object) new Object[2], 0, 0, false, 9);
    }

    final jr a(boolean param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        if (!param0) {
          return this.a((Object) null, param1 + (param2 << 1698487824), param4 + (param3 << -551835248), false, 6);
        } else {
          return null;
        }
    }

    wi(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        ThreadGroup var5_ref2 = null;
        ThreadGroup var6 = null;
        Thread[] var7 = null;
        int var8 = 0;
        Throwable decompiledCaughtException = null;
        ((wi) this).field_l = null;
        ((wi) this).field_m = false;
        ((wi) this).field_f = false;
        ((wi) this).field_t = false;
        ((wi) this).field_k = null;
        ((wi) this).field_x = null;
        ((wi) this).field_n = null;
        ((wi) this).field_d = null;
        field_u = "Unknown";
        ((wi) this).field_f = param3;
        field_p = param1;
        field_j = param0;
        field_q = "1.1";
        try {
          L0: {
            field_u = System.getProperty("java.vendor");
            field_q = System.getProperty("java.version");
            break L0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = (Exception) (Object) decompiledCaughtException;
            break L1;
          }
        }
        L2: {
          if (field_u.toLowerCase().indexOf("microsoft") != -1) {
            ((wi) this).field_t = true;
            break L2;
          } else {
            break L2;
          }
        }
        try {
          L3: {
            field_h = System.getProperty("os.name");
            break L3;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var5 = (Exception) (Object) decompiledCaughtException;
            field_h = "Unknown";
            break L4;
          }
        }
        field_o = field_h.toLowerCase();
        try {
          L5: {
            String discarded$5 = System.getProperty("os.arch").toLowerCase();
            break L5;
          }
        } catch (java.lang.Exception decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L6: {
            var5 = (Exception) (Object) decompiledCaughtException;
            break L6;
          }
        }
        try {
          L7: {
            String discarded$6 = System.getProperty("os.version").toLowerCase();
            break L7;
          }
        } catch (java.lang.Exception decompiledCaughtParameter3) {
          decompiledCaughtException = decompiledCaughtParameter3;
          L8: {
            var5 = (Exception) (Object) decompiledCaughtException;
            break L8;
          }
        }
        try {
          L9: {
            L10: {
              field_s = System.getProperty("user.home");
              if (field_s == null) {
                break L10;
              } else {
                field_s = field_s + "/";
                break L10;
              }
            }
            break L9;
          }
        } catch (java.lang.Exception decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          L11: {
            var5 = (Exception) (Object) decompiledCaughtException;
            break L11;
          }
        }
        L12: {
          if (null == field_s) {
            field_s = "~/";
            break L12;
          } else {
            break L12;
          }
        }
        try {
          L13: {
            ((wi) this).field_g = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
            break L13;
          }
        } catch (java.lang.Throwable decompiledCaughtParameter5) {
          decompiledCaughtException = decompiledCaughtParameter5;
          L14: {
            var5_ref = decompiledCaughtException;
            break L14;
          }
        }
        L15: {
          if (!((wi) this).field_t) {
            try {
              L16: {
                java.lang.reflect.Method discarded$7 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[1]);
                break L16;
              }
            } catch (java.lang.Exception decompiledCaughtParameter6) {
              decompiledCaughtException = decompiledCaughtParameter6;
              L17: {
                var5 = (Exception) (Object) decompiledCaughtException;
                break L17;
              }
            }
            try {
              L18: {
                field_e = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
                break L18;
              }
            } catch (java.lang.Exception decompiledCaughtParameter7) {
              decompiledCaughtException = decompiledCaughtParameter7;
              L19: {
                var5 = (Exception) (Object) decompiledCaughtException;
                break L19;
              }
            }
            break L15;
          } else {
            break L15;
          }
        }
        L20: {
          el.a(0, field_j, field_p);
          if (!((wi) this).field_f) {
            break L20;
          } else {
            ((wi) this).field_n = new sr(el.a((String) null, field_j, 95, "random.dat"), "rw", 25L);
            ((wi) this).field_l = new sr(el.a("main_file_cache.dat2", (byte) -8), "rw", 314572800L);
            ((wi) this).field_d = new sr(el.a("main_file_cache.idx255", (byte) -8), "rw", 1048576L);
            ((wi) this).field_i = new sr[param2];
            var5_int = 0;
            L21: while (true) {
              if (~param2 >= ~var5_int) {
                L22: {
                  if (((wi) this).field_t) {
                    try {
                      L23: {
                        Object discarded$8 = Class.forName("uf").newInstance();
                        break L23;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter8) {
                      decompiledCaughtException = decompiledCaughtParameter8;
                      L24: {
                        var5_ref = decompiledCaughtException;
                        break L24;
                      }
                    }
                    break L22;
                  } else {
                    break L22;
                  }
                }
                try {
                  L25: {
                    L26: {
                      if (!((wi) this).field_t) {
                        ((wi) this).field_r = Class.forName("cu").newInstance();
                        break L26;
                      } else {
                        ((wi) this).field_w = new ep();
                        break L26;
                      }
                    }
                    break L25;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter9) {
                  decompiledCaughtException = decompiledCaughtParameter9;
                  L27: {
                    var5_ref = decompiledCaughtException;
                    break L27;
                  }
                }
                try {
                  L28: {
                    L29: {
                      if (((wi) this).field_t) {
                        ((wi) this).field_b = new bm();
                        break L29;
                      } else {
                        ((wi) this).field_v = Class.forName("cg").newInstance();
                        break L29;
                      }
                    }
                    break L28;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter10) {
                  decompiledCaughtException = decompiledCaughtParameter10;
                  L30: {
                    var5_ref = decompiledCaughtException;
                    break L30;
                  }
                }
                break L20;
              } else {
                ((wi) this).field_i[var5_int] = new sr(el.a("main_file_cache.idx" + var5_int, (byte) -8), "rw", 1048576L);
                var5_int++;
                continue L21;
              }
            }
          }
        }
        L31: {
          if (!((wi) this).field_f) {
            break L31;
          } else {
            if (((wi) this).field_t) {
              break L31;
            } else {
              var5_ref2 = Thread.currentThread().getThreadGroup();
              var6 = var5_ref2.getParent();
              L32: while (true) {
                if (var6 == null) {
                  var7 = new Thread[1000];
                  int discarded$9 = var5_ref2.enumerate(var7);
                  var8 = 0;
                  L33: while (true) {
                    if (~var8 <= ~var7.length) {
                      break L31;
                    } else {
                      L34: {
                        if (var7[var8] == null) {
                          break L34;
                        } else {
                          if (var7[var8].getName().startsWith("AWT")) {
                            var7[var8].setPriority(1);
                            break L34;
                          } else {
                            break L34;
                          }
                        }
                      }
                      var8++;
                      continue L33;
                    }
                  }
                } else {
                  var5_ref2 = var6;
                  var6 = var5_ref2.getParent();
                  continue L32;
                }
              }
            }
          }
        }
        ((wi) this).field_m = false;
        ((wi) this).field_a = new Thread((Runnable) this);
        ((wi) this).field_a.setPriority(10);
        ((wi) this).field_a.setDaemon(true);
        ((wi) this).field_a.start();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
