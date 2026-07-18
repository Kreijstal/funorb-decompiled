/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fia implements Runnable {
    private Object field_i;
    boolean field_c;
    private static int field_d;
    ml field_x;
    private Thread field_m;
    private static volatile long field_o;
    ml[] field_h;
    private naa field_l;
    private boolean field_f;
    private static String field_s;
    static String field_j;
    private Object field_t;
    ml field_n;
    java.awt.EventQueue field_r;
    private sp field_w;
    private qj field_g;
    static java.lang.reflect.Method field_b;
    private static String field_u;
    ml field_q;
    static String field_v;
    boolean field_p;
    static String field_e;
    private naa field_k;
    private static String field_a;

    final naa a(java.net.URL param0, int param1) {
        RuntimeException var3 = null;
        if (param1 >= 69) {
          return this.a(0, 0, (byte) 104, (Object) (Object) param0, 4);
        } else {
          return null;
        }
    }

    public final void run() {
        try {
            Object var1 = null;
            naa var1_ref = null;
            Object var2 = null;
            Throwable var2_ref = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            Exception var3_ref = null;
            wra var3_ref2 = null;
            Thread var3_ref3 = null;
            Object[] var3_array = null;
            java.awt.datatransfer.Transferable var3_ref4 = null;
            java.awt.datatransfer.Clipboard var3_ref5 = null;
            java.awt.Frame var3_ref6 = null;
            String var3_ref7 = null;
            ml var3_ref8 = null;
            int var3_int = 0;
            Throwable var4 = null;
            java.awt.datatransfer.Clipboard var4_ref = null;
            int var4_int = 0;
            String var4_ref2 = null;
            java.awt.Component var4_ref3 = null;
            int var5 = 0;
            Throwable var6 = null;
            int stackIn_136_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_135_0 = 0;
            int stackOut_133_0 = 0;
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
                    if (((fia) this).field_f) {
                      return;
                    } else {
                      if (((fia) this).field_l != null) {
                        L4: {
                          var1_ref = ((fia) this).field_l;
                          ((fia) this).field_l = ((fia) this).field_l.field_g;
                          if (null == ((fia) this).field_l) {
                            ((fia) this).field_k = null;
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
                    }
                  }
                }
              }
              try {
                L7: {
                  L8: {
                    var2_int = var1_ref.field_a;
                    if (var2_int == 1) {
                      if (bva.b((byte) -107) < field_o) {
                        throw new IOException();
                      } else {
                        var1_ref.field_f = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var1_ref.field_c), var1_ref.field_e);
                        break L8;
                      }
                    } else {
                      if (var2_int == 22) {
                        if (field_o <= bva.b((byte) -107)) {
                          try {
                            L9: {
                              var1_ref.field_f = (Object) (Object) hg.a((String) var1_ref.field_c, var1_ref.field_e, false).a(25927);
                              break L9;
                            }
                          } catch (java.lang.Exception decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref2 = (wra) (Object) decompiledCaughtException;
                            var1_ref.field_f = (Object) (Object) var3_ref2.getMessage();
                            throw var3_ref2;
                          }
                          break L8;
                        } else {
                          throw new IOException();
                        }
                      } else {
                        if (var2_int == 2) {
                          var3_ref3 = new Thread((Runnable) var1_ref.field_c);
                          var3_ref3.setDaemon(true);
                          var3_ref3.start();
                          var3_ref3.setPriority(var1_ref.field_e);
                          var1_ref.field_f = (Object) (Object) var3_ref3;
                          break L8;
                        } else {
                          if (4 != var2_int) {
                            if (8 != var2_int) {
                              if (9 == var2_int) {
                                L10: {
                                  var3_array = (Object[]) var1_ref.field_c;
                                  if (((fia) this).field_c) {
                                    if (((Class) var3_array[0]).getClassLoader() != null) {
                                      break L10;
                                    } else {
                                      throw new SecurityException();
                                    }
                                  } else {
                                    break L10;
                                  }
                                }
                                var1_ref.field_f = (Object) (Object) ((Class) var3_array[0]).getDeclaredField((String) var3_array[1]);
                                break L8;
                              } else {
                                if (var2_int != 18) {
                                  if (var2_int == 19) {
                                    var3_ref4 = (java.awt.datatransfer.Transferable) var1_ref.field_c;
                                    var4_ref = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var4_ref.setContents(var3_ref4, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L8;
                                  } else {
                                    if (!((fia) this).field_c) {
                                      throw fia.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    } else {
                                      if (var2_int != 3) {
                                        if (var2_int != 21) {
                                          if (var2_int == 5) {
                                            if (!((fia) this).field_p) {
                                              var1_ref.field_f = Class.forName("pj").getMethod("listmodes", new Class[0]).invoke(((fia) this).field_i, new Object[0]);
                                              break L8;
                                            } else {
                                              var1_ref.field_f = (Object) (Object) ((fia) this).field_w.a((byte) 52);
                                              break L8;
                                            }
                                          } else {
                                            if (6 != var2_int) {
                                              if (var2_int != 7) {
                                                if (var2_int == 12) {
                                                  var3_ref8 = fia.a(-20529, field_d, (String) var1_ref.field_c, field_u);
                                                  var1_ref.field_f = (Object) (Object) var3_ref8;
                                                  break L8;
                                                } else {
                                                  if (13 != var2_int) {
                                                    L11: {
                                                      if (!((fia) this).field_c) {
                                                        break L11;
                                                      } else {
                                                        if (14 == var2_int) {
                                                          L12: {
                                                            var3_int = var1_ref.field_e;
                                                            var4_int = var1_ref.field_d;
                                                            if (((fia) this).field_p) {
                                                              ((fia) this).field_g.a(0, var3_int, var4_int);
                                                              break L12;
                                                            } else {
                                                              Object discarded$6 = Class.forName("kfa").getDeclaredMethod("movemouse", new Class[2]).invoke(((fia) this).field_t, new Object[2]);
                                                              break L12;
                                                            }
                                                          }
                                                          break L8;
                                                        } else {
                                                          break L11;
                                                        }
                                                      }
                                                    }
                                                    L13: {
                                                      if (!((fia) this).field_c) {
                                                        break L13;
                                                      } else {
                                                        if (15 == var2_int) {
                                                          L14: {
                                                            if (var1_ref.field_e == 0) {
                                                              stackOut_135_0 = 0;
                                                              stackIn_136_0 = stackOut_135_0;
                                                              break L14;
                                                            } else {
                                                              stackOut_133_0 = 1;
                                                              stackIn_136_0 = stackOut_133_0;
                                                              break L14;
                                                            }
                                                          }
                                                          L15: {
                                                            var3_int = stackIn_136_0;
                                                            var4_ref3 = (java.awt.Component) var1_ref.field_c;
                                                            if (!((fia) this).field_p) {
                                                              Object discarded$7 = Class.forName("kfa").getDeclaredMethod("showcursor", new Class[2]).invoke(((fia) this).field_t, new Object[2]);
                                                              break L15;
                                                            } else {
                                                              ((fia) this).field_g.a(var3_int != 0, -54, var4_ref3);
                                                              break L15;
                                                            }
                                                          }
                                                          break L8;
                                                        } else {
                                                          break L13;
                                                        }
                                                      }
                                                    }
                                                    L16: {
                                                      if (((fia) this).field_p) {
                                                        break L16;
                                                      } else {
                                                        if (17 != var2_int) {
                                                          break L16;
                                                        } else {
                                                          var3_array = (Object[]) var1_ref.field_c;
                                                          Object discarded$8 = Class.forName("kfa").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((fia) this).field_t, new Object[5]);
                                                          break L8;
                                                        }
                                                      }
                                                    }
                                                    if (var2_int == 16) {
                                                      try {
                                                        L17: {
                                                          if (field_j.startsWith("win")) {
                                                            L18: {
                                                              var3_ref7 = (String) var1_ref.field_c;
                                                              if (var3_ref7.startsWith("http://")) {
                                                                break L18;
                                                              } else {
                                                                if (var3_ref7.startsWith("https://")) {
                                                                  break L18;
                                                                } else {
                                                                  throw fia.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                            var4_ref2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L19: while (true) {
                                                              if (~var5 <= ~var3_ref7.length()) {
                                                                Process discarded$9 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var3_ref7 + "\"");
                                                                var1_ref.field_f = null;
                                                                break L17;
                                                              } else {
                                                                if (var4_ref2.indexOf((int) var3_ref7.charAt(var5)) != -1) {
                                                                  var5++;
                                                                  continue L19;
                                                                } else {
                                                                  throw fia.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            throw fia.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                                                        decompiledCaughtException = decompiledCaughtParameter2;
                                                        var3_ref = (Exception) (Object) decompiledCaughtException;
                                                        var1_ref.field_f = (Object) (Object) var3_ref;
                                                        throw fia.<RuntimeException>$cfr$sneakyThrow(var3_ref);
                                                      }
                                                      break L8;
                                                    } else {
                                                      throw fia.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    }
                                                  } else {
                                                    var3_ref8 = fia.a(-20529, field_d, (String) var1_ref.field_c, "");
                                                    var1_ref.field_f = (Object) (Object) var3_ref8;
                                                    break L8;
                                                  }
                                                }
                                              } else {
                                                if (!((fia) this).field_p) {
                                                  Object discarded$10 = Class.forName("pj").getMethod("exit", new Class[0]).invoke(((fia) this).field_i, new Object[0]);
                                                  break L8;
                                                } else {
                                                  ((fia) this).field_w.a((java.awt.Frame) var1_ref.field_c, (byte) -108);
                                                  break L8;
                                                }
                                              }
                                            } else {
                                              L20: {
                                                var3_ref6 = new java.awt.Frame("Jagex Full Screen");
                                                var1_ref.field_f = (Object) (Object) var3_ref6;
                                                var3_ref6.setResizable(false);
                                                if (((fia) this).field_p) {
                                                  ((fia) this).field_w.a(var3_ref6, var1_ref.field_e >>> 435914000, var1_ref.field_d >> 1199163120, var1_ref.field_d & 65535, var1_ref.field_e & 65535, true);
                                                  break L20;
                                                } else {
                                                  Object discarded$11 = Class.forName("pj").getMethod("enter", new Class[5]).invoke(((fia) this).field_i, new Object[5]);
                                                  break L20;
                                                }
                                              }
                                              break L8;
                                            }
                                          }
                                        } else {
                                          if (~bva.b((byte) -107) <= ~field_o) {
                                            var1_ref.field_f = (Object) (Object) java.net.InetAddress.getByName((String) var1_ref.field_c).getAddress();
                                            break L8;
                                          } else {
                                            throw new IOException();
                                          }
                                        }
                                      } else {
                                        if (bva.b((byte) -107) < field_o) {
                                          throw new IOException();
                                        } else {
                                          var3_ref7 = (255 & var1_ref.field_e >> 1821467352) + "." + ((16739670 & var1_ref.field_e) >> -1640614736) + "." + (var1_ref.field_e >> 1967332360 & 255) + "." + (255 & var1_ref.field_e);
                                          var1_ref.field_f = (Object) (Object) java.net.InetAddress.getByName(var3_ref7).getHostName();
                                          break L8;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var3_ref5 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var1_ref.field_f = (Object) (Object) var3_ref5.getContents((Object) null);
                                  break L8;
                                }
                              }
                            } else {
                              L21: {
                                var3_array = (Object[]) var1_ref.field_c;
                                if (((fia) this).field_c) {
                                  if (((Class) var3_array[0]).getClassLoader() == null) {
                                    throw new SecurityException();
                                  } else {
                                    break L21;
                                  }
                                } else {
                                  break L21;
                                }
                              }
                              var1_ref.field_f = (Object) (Object) ((Class) var3_array[0]).getDeclaredMethod((String) var3_array[1], (Class[]) var3_array[2]);
                              break L8;
                            }
                          } else {
                            if (field_o <= bva.b((byte) -107)) {
                              var1_ref.field_f = (Object) (Object) new DataInputStream(((java.net.URL) var1_ref.field_c).openStream());
                              break L8;
                            } else {
                              throw new IOException();
                            }
                          }
                        }
                      }
                    }
                  }
                  var1_ref.field_b = 1;
                  break L7;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                L22: {
                  var2_ref = decompiledCaughtException;
                  var1_ref.field_b = 2;
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

    final naa a(int param0, String param1, int param2) {
        RuntimeException var4 = null;
        L0: {
          if (param0 == -24818) {
            break L0;
          } else {
            naa discarded$2 = ((fia) this).a((byte) 92, (java.awt.datatransfer.Transferable) null);
            break L0;
          }
        }
        return this.a(param0 + 24819, param1, false, param2);
    }

    final naa a(int param0, String param1, Class param2) {
        RuntimeException var4 = null;
        L0: {
          if (param0 == 10355) {
            break L0;
          } else {
            ml discarded$2 = fia.a(-73, 85, (String) null, (String) null);
            break L0;
          }
        }
        return this.a(0, 0, (byte) 104, (Object) (Object) new Object[2], 9);
    }

    private final naa a(int param0, String param1, boolean param2, int param3) {
        RuntimeException var5 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        String stackIn_4_4 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        String stackIn_6_4 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        String stackIn_7_4 = null;
        int stackIn_7_5 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        String stackOut_3_4 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        String stackOut_6_4 = null;
        int stackOut_6_5 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        String stackOut_4_4 = null;
        int stackOut_4_5 = 0;
        L0: {
          if (param0 == 1) {
            break L0;
          } else {
            ml discarded$2 = fia.a(-120, 43, (String) null, (String) null);
            break L0;
          }
        }
        L1: {
          stackOut_3_0 = this;
          stackOut_3_1 = param3;
          stackOut_3_2 = 0;
          stackOut_3_3 = 104;
          stackOut_3_4 = (String) param1;
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
          if (!param2) {
            stackOut_6_0 = this;
            stackOut_6_1 = stackIn_6_1;
            stackOut_6_2 = stackIn_6_2;
            stackOut_6_3 = stackIn_6_3;
            stackOut_6_4 = (String) (Object) stackIn_6_4;
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
            stackOut_4_1 = stackIn_4_1;
            stackOut_4_2 = stackIn_4_2;
            stackOut_4_3 = stackIn_4_3;
            stackOut_4_4 = (String) (Object) stackIn_4_4;
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
        return this.a(stackIn_7_1, stackIn_7_2, (byte) stackIn_7_3, (Object) (Object) stackIn_7_4, stackIn_7_5);
    }

    final naa a(int param0, Class[] param1, String param2, Class param3) {
        RuntimeException var5 = null;
        L0: {
          if (param0 == 26868) {
            break L0;
          } else {
            ((fia) this).field_i = null;
            break L0;
          }
        }
        return this.a(0, 0, (byte) 104, (Object) (Object) new Object[3], 8);
    }

    final boolean a(byte param0) {
        RuntimeException var2 = null;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        if (!((fia) this).field_c) {
          return false;
        } else {
          L0: {
            if (param0 == 69) {
              break L0;
            } else {
              ((fia) this).field_r = null;
              break L0;
            }
          }
          if (!((fia) this).field_p) {
            L1: {
              if (null == ((fia) this).field_i) {
                stackOut_18_0 = 0;
                stackIn_19_0 = stackOut_18_0;
                break L1;
              } else {
                stackOut_16_0 = 1;
                stackIn_19_0 = stackOut_16_0;
                break L1;
              }
            }
            return stackIn_19_0 != 0;
          } else {
            L2: {
              if (((fia) this).field_w == null) {
                stackOut_13_0 = 0;
                stackIn_14_0 = stackOut_13_0;
                break L2;
              } else {
                stackOut_11_0 = 1;
                stackIn_14_0 = stackOut_11_0;
                break L2;
              }
            }
            return stackIn_14_0 != 0;
          }
        }
    }

    final void b(byte param0) {
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
                ((fia) this).field_f = true;
                this.notifyAll();
                break L0;
              }
            }
            L1: {
              if (param0 == 59) {
                break L1;
              } else {
                naa discarded$1 = ((fia) this).a((java.awt.Frame) null, 58);
                break L1;
              }
            }
            try {
              L2: {
                ((fia) this).field_m.join();
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
              if (null != ((fia) this).field_n) {
                {
                  L5: {
                    ((fia) this).field_n.b((byte) -112);
                    break L5;
                  }
                }
                break L4;
              } else {
                break L4;
              }
            }
            L7: {
              if (null != ((fia) this).field_q) {
                {
                  L8: {
                    ((fia) this).field_q.b((byte) -77);
                    break L8;
                  }
                }
                break L7;
              } else {
                break L7;
              }
            }
            L10: {
              if (((fia) this).field_h != null) {
                var2_int = 0;
                L11: while (true) {
                  if (~var2_int <= ~((fia) this).field_h.length) {
                    break L10;
                  } else {
                    L12: {
                      if (null == ((fia) this).field_h[var2_int]) {
                        break L12;
                      } else {
                        {
                          L13: {
                            ((fia) this).field_h[var2_int].b((byte) -101);
                            break L13;
                          }
                        }
                        break L12;
                      }
                    }
                    var2_int++;
                    continue L11;
                  }
                }
              } else {
                break L10;
              }
            }
            L15: {
              if (((fia) this).field_x != null) {
                {
                  L16: {
                    ((fia) this).field_x.b((byte) -101);
                    break L16;
                  }
                }
                break L15;
              } else {
                break L15;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final static ml a(int param0, int param1, String param2, String param3) {
        try {
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            ml var8_ref = null;
            ml stackIn_14_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            ml stackOut_13_0 = null;
            L0: {
              if (33 != param1) {
                if (param1 == 34) {
                  var4 = "jagex_" + param3 + "_preferences" + param2 + "_wip.dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param3 + "_preferences" + param2 + ".dat";
                  break L0;
                }
              } else {
                var4 = "jagex_" + param3 + "_preferences" + param2 + "_rc.dat";
                break L0;
              }
            }
            var5 = new String[]{"c:/rscache/", "/rscache/", field_a, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            if (param0 == -20529) {
              var6 = 0;
              L1: while (true) {
                if (~var6 <= ~var5.length) {
                  return null;
                } else {
                  L2: {
                    L3: {
                      var7 = var5[var6];
                      if (var7.length() <= 0) {
                        break L3;
                      } else {
                        if (!new File(var7).exists()) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    try {
                      L4: {
                        var8_ref = new ml(new File(var7, var4), "rw", 10000L);
                        stackOut_13_0 = (ml) var8_ref;
                        stackIn_14_0 = stackOut_13_0;
                        decompiledRegionSelector0 = 0;
                        break L4;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        var8 = (Exception) (Object) decompiledCaughtException;
                        decompiledRegionSelector0 = 1;
                        break L5;
                      }
                    }
                    if (decompiledRegionSelector0 == 0) {
                      return stackIn_14_0;
                    } else {
                      break L2;
                    }
                  }
                  var6++;
                  continue L1;
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

    final naa a(int param0) {
        RuntimeException var2 = null;
        if (param0 <= -87) {
          return this.a(0, 0, (byte) 104, (Object) null, 5);
        } else {
          return null;
        }
    }

    final naa a(java.awt.Frame param0, int param1) {
        RuntimeException var3 = null;
        if (param1 == 18885) {
          return this.a(0, 0, (byte) 104, (Object) (Object) param0, 7);
        } else {
          return null;
        }
    }

    private final naa a(int param0, int param1, byte param2, Object param3, int param4) {
        naa var6 = null;
        RuntimeException var6_ref = null;
        Object var7 = null;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        if (param2 == 104) {
          var6 = new naa();
          var6.field_e = param0;
          var6.field_d = param1;
          var6.field_a = param4;
          var6.field_c = param3;
          var7 = this;
          synchronized (var7) {
            L0: {
              L1: {
                if (null != ((fia) this).field_k) {
                  ((fia) this).field_k.field_g = var6;
                  ((fia) this).field_k = var6;
                  break L1;
                } else {
                  ((fia) this).field_l = var6;
                  ((fia) this).field_k = var6;
                  break L1;
                }
              }
              this.notify();
              break L0;
            }
          }
          return var6;
        } else {
          return null;
        }
    }

    final naa a(int param0, int param1, int param2, byte param3, int param4) {
        RuntimeException var6 = null;
        if (param3 == 66) {
          return this.a(param2 + (param4 << -711272432), param1 + (param0 << -1645972240), (byte) 104, (Object) null, 6);
        } else {
          return null;
        }
    }

    final naa a(Runnable param0, int param1, int param2) {
        RuntimeException var4 = null;
        L0: {
          if (param1 == 425) {
            break L0;
          } else {
            ((fia) this).field_h = null;
            break L0;
          }
        }
        return this.a(param2, 0, (byte) 104, (Object) (Object) param0, 2);
    }

    final boolean a(byte[] param0, File param1, boolean param2) {
        FileOutputStream var4 = null;
        IOException var4_ref = null;
        RuntimeException var4_ref2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            var4 = new FileOutputStream(param1);
            var4.write(param0, 0, param0.length);
            if (param2) {
              var4.close();
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (IOException) (Object) decompiledCaughtException;
          throw new RuntimeException();
        }
        return stackIn_4_0 != 0;
    }

    final naa a(byte param0, java.awt.datatransfer.Transferable param1) {
        RuntimeException var3 = null;
        L0: {
          if (param0 > 56) {
            break L0;
          } else {
            naa discarded$2 = ((fia) this).a(96);
            break L0;
          }
        }
        return this.a(0, 0, (byte) 104, (Object) (Object) param1, 19);
    }

    final naa b(int param0) {
        RuntimeException var2 = null;
        if (param0 > 104) {
          return this.a(0, 0, (byte) 104, (Object) null, 18);
        } else {
          return null;
        }
    }

    fia(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        ThreadGroup var5_ref2 = null;
        ThreadGroup var6 = null;
        Thread[] var7 = null;
        int var8 = 0;
        Throwable decompiledCaughtException = null;
        ((fia) this).field_c = false;
        ((fia) this).field_x = null;
        ((fia) this).field_l = null;
        ((fia) this).field_n = null;
        ((fia) this).field_f = false;
        ((fia) this).field_p = false;
        ((fia) this).field_k = null;
        ((fia) this).field_q = null;
        field_d = param0;
        field_u = param1;
        field_e = "Unknown";
        field_v = "1.1";
        ((fia) this).field_c = param3;
        try {
          L0: {
            field_e = System.getProperty("java.vendor");
            field_v = System.getProperty("java.version");
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
          if (-1 == field_e.toLowerCase().indexOf("microsoft")) {
            break L2;
          } else {
            ((fia) this).field_p = true;
            break L2;
          }
        }
        try {
          L3: {
            field_s = System.getProperty("os.name");
            break L3;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var5 = (Exception) (Object) decompiledCaughtException;
            field_s = "Unknown";
            break L4;
          }
        }
        field_j = field_s.toLowerCase();
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
              field_a = System.getProperty("user.home");
              if (field_a != null) {
                field_a = field_a + "/";
                break L10;
              } else {
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
          if (null != field_a) {
            break L12;
          } else {
            field_a = "~/";
            break L12;
          }
        }
        try {
          L13: {
            ((fia) this).field_r = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
          if (!((fia) this).field_p) {
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
                field_b = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
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
          iba.a(field_d, -70, field_u);
          if (!((fia) this).field_c) {
            break L20;
          } else {
            ((fia) this).field_x = new ml(iba.a((String) null, "random.dat", 0, field_d), "rw", 25L);
            ((fia) this).field_n = new ml(iba.a("main_file_cache.dat2", (byte) -71), "rw", 314572800L);
            ((fia) this).field_q = new ml(iba.a("main_file_cache.idx255", (byte) -123), "rw", 1048576L);
            ((fia) this).field_h = new ml[param2];
            var5_int = 0;
            L21: while (true) {
              if (~param2 >= ~var5_int) {
                L22: {
                  if (!((fia) this).field_p) {
                    break L22;
                  } else {
                    try {
                      L23: {
                        Object discarded$8 = Class.forName("nva").newInstance();
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
                  }
                }
                try {
                  L25: {
                    L26: {
                      if (!((fia) this).field_p) {
                        ((fia) this).field_i = Class.forName("pj").newInstance();
                        break L26;
                      } else {
                        ((fia) this).field_w = new sp();
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
                      if (!((fia) this).field_p) {
                        ((fia) this).field_t = Class.forName("kfa").newInstance();
                        break L29;
                      } else {
                        ((fia) this).field_g = new qj();
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
                ((fia) this).field_h[var5_int] = new ml(iba.a("main_file_cache.idx" + var5_int, (byte) -108), "rw", 1048576L);
                var5_int++;
                continue L21;
              }
            }
          }
        }
        L31: {
          if (!((fia) this).field_c) {
            break L31;
          } else {
            if (!((fia) this).field_p) {
              var5_ref2 = Thread.currentThread().getThreadGroup();
              var6 = var5_ref2.getParent();
              L32: while (true) {
                if (var6 == null) {
                  var7 = new Thread[1000];
                  int discarded$9 = var5_ref2.enumerate(var7);
                  var8 = 0;
                  L33: while (true) {
                    if (~var7.length >= ~var8) {
                      break L31;
                    } else {
                      L34: {
                        if (null == var7[var8]) {
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
            } else {
              break L31;
            }
          }
        }
        ((fia) this).field_f = false;
        ((fia) this).field_m = new Thread((Runnable) this);
        ((fia) this).field_m.setPriority(10);
        ((fia) this).field_m.setDaemon(true);
        ((fia) this).field_m.start();
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
