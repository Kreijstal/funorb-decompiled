/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vf implements Runnable {
    private static String field_n;
    private static volatile long field_l;
    an field_i;
    private Object field_x;
    private boolean field_u;
    static String field_s;
    private ue field_t;
    static String field_b;
    private static int field_v;
    an field_k;
    static String field_j;
    an field_f;
    private static String field_r;
    private ia field_c;
    private static String field_g;
    private Thread field_d;
    private Object field_m;
    private boolean field_q;
    static java.lang.reflect.Method field_h;
    boolean field_a;
    java.awt.EventQueue field_p;
    an[] field_e;
    private ia field_o;
    private ga field_w;

    final boolean b(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        var2_int = -48 % ((-43 - param0) / 55);
        if (((vf) this).field_a) {
          if (((vf) this).field_q) {
            L0: {
              if (null == ((vf) this).field_w) {
                stackOut_13_0 = 0;
                stackIn_14_0 = stackOut_13_0;
                break L0;
              } else {
                stackOut_11_0 = 1;
                stackIn_14_0 = stackOut_11_0;
                break L0;
              }
            }
            return stackIn_14_0 != 0;
          } else {
            L1: {
              if (null == ((vf) this).field_x) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L1;
              } else {
                stackOut_6_0 = 1;
                stackIn_9_0 = stackOut_6_0;
                break L1;
              }
            }
            return stackIn_9_0 != 0;
          }
        } else {
          return false;
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
                ((vf) this).field_u = true;
                this.notifyAll();
                break L0;
              }
            }
            try {
              L1: {
                if (param0 == -29109) {
                  ((vf) this).field_d.join();
                  break L1;
                } else {
                  return;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var2_ref = (InterruptedException) (Object) decompiledCaughtException;
                break L2;
              }
            }
            L3: {
              if (null != ((vf) this).field_k) {
                {
                  L4: {
                    ((vf) this).field_k.b(param0 ^ 29131);
                    break L4;
                  }
                }
                break L3;
              } else {
                break L3;
              }
            }
            L6: {
              if (((vf) this).field_f != null) {
                {
                  L7: {
                    ((vf) this).field_f.b(-126);
                    break L7;
                  }
                }
                break L6;
              } else {
                break L6;
              }
            }
            L9: {
              if (null == ((vf) this).field_e) {
                break L9;
              } else {
                var2_int = 0;
                L10: while (true) {
                  if (~var2_int <= ~((vf) this).field_e.length) {
                    break L9;
                  } else {
                    L11: {
                      if (((vf) this).field_e[var2_int] != null) {
                        {
                          L12: {
                            ((vf) this).field_e[var2_int].b(-111);
                            break L12;
                          }
                        }
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    var2_int++;
                    continue L10;
                  }
                }
              }
            }
            L14: {
              if (null == ((vf) this).field_i) {
                break L14;
              } else {
                {
                  L15: {
                    ((vf) this).field_i.b(-114);
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

    public final void run() {
        try {
            Object var1 = null;
            ia var1_ref = null;
            Object var2 = null;
            Throwable var2_ref = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            Exception var3_ref = null;
            pm var3_ref2 = null;
            Thread var3_ref3 = null;
            Object[] var3_array = null;
            java.awt.datatransfer.Transferable var3_ref4 = null;
            java.awt.datatransfer.Clipboard var3_ref5 = null;
            String var3_ref6 = null;
            java.awt.Frame var3_ref7 = null;
            an var3_ref8 = null;
            int var3_int = 0;
            Throwable var4_ref_Throwable = null;
            java.awt.datatransfer.Clipboard var4_ref_java_awt_datatransfer_Clipboard = null;
            int var4 = 0;
            String var4_ref_String = null;
            java.awt.Component var4_ref_java_awt_Component = null;
            int var5 = 0;
            Throwable var6 = null;
            int stackIn_87_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_86_0 = 0;
            int stackOut_84_0 = 0;
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
                    if (((vf) this).field_u) {
                      return;
                    } else {
                      if (null == ((vf) this).field_c) {
                        {
                          L4: {
                            this.wait();
                            break L4;
                          }
                        }
                        continue L3;
                      } else {
                        L6: {
                          var1_ref = ((vf) this).field_c;
                          ((vf) this).field_c = ((vf) this).field_c.field_e;
                          if (null != ((vf) this).field_c) {
                            break L6;
                          } else {
                            ((vf) this).field_o = null;
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
                    var2_int = var1_ref.field_g;
                    if (var2_int == 1) {
                      if (sf.a((byte) 116) < field_l) {
                        throw new IOException();
                      } else {
                        var1_ref.field_a = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var1_ref.field_d), var1_ref.field_f);
                        break L8;
                      }
                    } else {
                      if (var2_int == 22) {
                        if (~field_l < ~sf.a((byte) 99)) {
                          throw new IOException();
                        } else {
                          try {
                            L9: {
                              var1_ref.field_a = (Object) (Object) id.a((byte) -34, (String) var1_ref.field_d, var1_ref.field_f).a(0);
                              break L9;
                            }
                          } catch (java.lang.Exception decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref2 = (pm) (Object) decompiledCaughtException;
                            var1_ref.field_a = (Object) (Object) var3_ref2.getMessage();
                            throw var3_ref2;
                          }
                          break L8;
                        }
                      } else {
                        if (2 == var2_int) {
                          var3_ref3 = new Thread((Runnable) var1_ref.field_d);
                          var3_ref3.setDaemon(true);
                          var3_ref3.start();
                          var3_ref3.setPriority(var1_ref.field_f);
                          var1_ref.field_a = (Object) (Object) var3_ref3;
                          break L8;
                        } else {
                          if (4 != var2_int) {
                            if (8 == var2_int) {
                              L10: {
                                var3_array = (Object[]) var1_ref.field_d;
                                if (!((vf) this).field_a) {
                                  break L10;
                                } else {
                                  if (((Class) var3_array[0]).getClassLoader() != null) {
                                    break L10;
                                  } else {
                                    throw new SecurityException();
                                  }
                                }
                              }
                              var1_ref.field_a = (Object) (Object) ((Class) var3_array[0]).getDeclaredMethod((String) var3_array[1], (Class[]) var3_array[2]);
                              break L8;
                            } else {
                              if (var2_int == 9) {
                                L11: {
                                  var3_array = (Object[]) var1_ref.field_d;
                                  if (((vf) this).field_a) {
                                    if (null == ((Class) var3_array[0]).getClassLoader()) {
                                      throw new SecurityException();
                                    } else {
                                      break L11;
                                    }
                                  } else {
                                    break L11;
                                  }
                                }
                                var1_ref.field_a = (Object) (Object) ((Class) var3_array[0]).getDeclaredField((String) var3_array[1]);
                                break L8;
                              } else {
                                if (18 != var2_int) {
                                  if (19 != var2_int) {
                                    if (((vf) this).field_a) {
                                      if (3 != var2_int) {
                                        if (var2_int == 21) {
                                          if (~field_l >= ~sf.a((byte) -38)) {
                                            var1_ref.field_a = (Object) (Object) java.net.InetAddress.getByName((String) var1_ref.field_d).getAddress();
                                            break L8;
                                          } else {
                                            throw new IOException();
                                          }
                                        } else {
                                          if (5 == var2_int) {
                                            if (!((vf) this).field_q) {
                                              var1_ref.field_a = Class.forName("ej").getMethod("listmodes", new Class[0]).invoke(((vf) this).field_x, new Object[0]);
                                              break L8;
                                            } else {
                                              var1_ref.field_a = (Object) (Object) ((vf) this).field_w.a(0);
                                              break L8;
                                            }
                                          } else {
                                            if (var2_int == 6) {
                                              L12: {
                                                var3_ref7 = new java.awt.Frame("Jagex Full Screen");
                                                var1_ref.field_a = (Object) (Object) var3_ref7;
                                                var3_ref7.setResizable(false);
                                                if (((vf) this).field_q) {
                                                  ((vf) this).field_w.a(65535 & var1_ref.field_b, var1_ref.field_f >>> -514158576, (byte) 114, var3_ref7, 65535 & var1_ref.field_f, var1_ref.field_b >> 1783228272);
                                                  break L12;
                                                } else {
                                                  Object discarded$6 = Class.forName("ej").getMethod("enter", new Class[5]).invoke(((vf) this).field_x, new Object[5]);
                                                  break L12;
                                                }
                                              }
                                              break L8;
                                            } else {
                                              if (7 == var2_int) {
                                                if (!((vf) this).field_q) {
                                                  Object discarded$7 = Class.forName("ej").getMethod("exit", new Class[0]).invoke(((vf) this).field_x, new Object[0]);
                                                  break L8;
                                                } else {
                                                  ((vf) this).field_w.a((byte) -101, (java.awt.Frame) var1_ref.field_d);
                                                  break L8;
                                                }
                                              } else {
                                                if (var2_int != 12) {
                                                  if (13 != var2_int) {
                                                    L13: {
                                                      if (!((vf) this).field_a) {
                                                        break L13;
                                                      } else {
                                                        if (var2_int == 14) {
                                                          L14: {
                                                            var3_int = var1_ref.field_f;
                                                            var4 = var1_ref.field_b;
                                                            if (((vf) this).field_q) {
                                                              ((vf) this).field_t.a(false, var3_int, var4);
                                                              break L14;
                                                            } else {
                                                              Object discarded$8 = Class.forName("jj").getDeclaredMethod("movemouse", new Class[2]).invoke(((vf) this).field_m, new Object[2]);
                                                              break L14;
                                                            }
                                                          }
                                                          break L8;
                                                        } else {
                                                          break L13;
                                                        }
                                                      }
                                                    }
                                                    L15: {
                                                      if (!((vf) this).field_a) {
                                                        break L15;
                                                      } else {
                                                        if (var2_int != 15) {
                                                          break L15;
                                                        } else {
                                                          L16: {
                                                            if (0 == var1_ref.field_f) {
                                                              stackOut_86_0 = 0;
                                                              stackIn_87_0 = stackOut_86_0;
                                                              break L16;
                                                            } else {
                                                              stackOut_84_0 = 1;
                                                              stackIn_87_0 = stackOut_84_0;
                                                              break L16;
                                                            }
                                                          }
                                                          L17: {
                                                            var3_int = stackIn_87_0;
                                                            var4_ref_java_awt_Component = (java.awt.Component) var1_ref.field_d;
                                                            if (((vf) this).field_q) {
                                                              ((vf) this).field_t.a(0, var4_ref_java_awt_Component, var3_int != 0);
                                                              break L17;
                                                            } else {
                                                              Object discarded$9 = Class.forName("jj").getDeclaredMethod("showcursor", new Class[2]).invoke(((vf) this).field_m, new Object[2]);
                                                              break L17;
                                                            }
                                                          }
                                                          break L8;
                                                        }
                                                      }
                                                    }
                                                    L18: {
                                                      if (((vf) this).field_q) {
                                                        break L18;
                                                      } else {
                                                        if (17 == var2_int) {
                                                          var3_array = (Object[]) var1_ref.field_d;
                                                          Object discarded$10 = Class.forName("jj").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((vf) this).field_m, new Object[5]);
                                                          break L8;
                                                        } else {
                                                          break L18;
                                                        }
                                                      }
                                                    }
                                                    if (var2_int == 16) {
                                                      try {
                                                        L19: {
                                                          if (!field_j.startsWith("win")) {
                                                            throw vf.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          } else {
                                                            L20: {
                                                              var3_ref6 = (String) var1_ref.field_d;
                                                              if (var3_ref6.startsWith("http://")) {
                                                                break L20;
                                                              } else {
                                                                if (!var3_ref6.startsWith("https://")) {
                                                                  throw vf.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  break L20;
                                                                }
                                                              }
                                                            }
                                                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L21: while (true) {
                                                              if (~var5 <= ~var3_ref6.length()) {
                                                                Process discarded$11 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var3_ref6 + "\"");
                                                                var1_ref.field_a = null;
                                                                break L19;
                                                              } else {
                                                                if (-1 == var4_ref_String.indexOf((int) var3_ref6.charAt(var5))) {
                                                                  throw vf.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  var5++;
                                                                  continue L21;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                                                        decompiledCaughtException = decompiledCaughtParameter2;
                                                        var3_ref = (Exception) (Object) decompiledCaughtException;
                                                        var1_ref.field_a = (Object) (Object) var3_ref;
                                                        throw vf.<RuntimeException>$cfr$sneakyThrow(var3_ref);
                                                      }
                                                      break L8;
                                                    } else {
                                                      throw vf.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    }
                                                  } else {
                                                    var3_ref8 = vf.a("", (String) var1_ref.field_d, field_v, 34);
                                                    var1_ref.field_a = (Object) (Object) var3_ref8;
                                                    break L8;
                                                  }
                                                } else {
                                                  var3_ref8 = vf.a(field_g, (String) var1_ref.field_d, field_v, 34);
                                                  var1_ref.field_a = (Object) (Object) var3_ref8;
                                                  break L8;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        if (field_l > sf.a((byte) 113)) {
                                          throw new IOException();
                                        } else {
                                          var3_ref6 = (255 & var1_ref.field_f >> -425671944) + "." + ((var1_ref.field_f & 16776460) >> 1084091248) + "." + ((var1_ref.field_f & 65306) >> 1259736808) + "." + (255 & var1_ref.field_f);
                                          var1_ref.field_a = (Object) (Object) java.net.InetAddress.getByName(var3_ref6).getHostName();
                                          break L8;
                                        }
                                      }
                                    } else {
                                      throw vf.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    }
                                  } else {
                                    var3_ref4 = (java.awt.datatransfer.Transferable) var1_ref.field_d;
                                    var4_ref_java_awt_datatransfer_Clipboard = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var4_ref_java_awt_datatransfer_Clipboard.setContents(var3_ref4, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L8;
                                  }
                                } else {
                                  var3_ref5 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var1_ref.field_a = (Object) (Object) var3_ref5.getContents((Object) null);
                                  break L8;
                                }
                              }
                            }
                          } else {
                            if (sf.a((byte) 126) < field_l) {
                              throw new IOException();
                            } else {
                              var1_ref.field_a = (Object) (Object) new DataInputStream(((java.net.URL) var1_ref.field_d).openStream());
                              break L8;
                            }
                          }
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

    private final ia a(int param0, int param1, String param2, boolean param3) {
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
          if (param1 > 62) {
            break L0;
          } else {
            ia discarded$2 = ((vf) this).a((java.awt.Frame) null, false);
            break L0;
          }
        }
        L1: {
          stackOut_3_0 = this;
          stackOut_3_1 = (String) param2;
          stackOut_3_2 = param0;
          stackOut_3_3 = 67;
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
        return this.a((Object) (Object) stackIn_7_1, stackIn_7_2, (byte) stackIn_7_3, stackIn_7_4, stackIn_7_5);
    }

    final ia a(int param0, int param1, int param2, int param3, byte param4) {
        RuntimeException var6 = null;
        L0: {
          if (param4 < -97) {
            break L0;
          } else {
            ia discarded$2 = ((vf) this).a((Runnable) null, (byte) -99, 23);
            break L0;
          }
        }
        return this.a((Object) null, param3 + (param2 << -30453008), (byte) 67, (param0 << 1627323632) - -param1, 6);
    }

    private final ia a(Object param0, int param1, byte param2, int param3, int param4) {
        ia var6 = null;
        RuntimeException var6_ref = null;
        Object var7 = null;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        var6 = new ia();
        var6.field_g = param4;
        var6.field_f = param1;
        var6.field_b = param3;
        var6.field_d = param0;
        var7 = this;
        synchronized (var7) {
          L0: {
            L1: {
              if (((vf) this).field_o != null) {
                ((vf) this).field_o.field_e = var6;
                ((vf) this).field_o = var6;
                break L1;
              } else {
                ((vf) this).field_c = var6;
                ((vf) this).field_o = var6;
                break L1;
              }
            }
            this.notify();
            break L0;
          }
        }
        if (param2 == 67) {
          return var6;
        } else {
          return null;
        }
    }

    final ia a(Runnable param0, byte param1, int param2) {
        RuntimeException var4 = null;
        if (param1 >= 0) {
          return this.a((Object) (Object) param0, param2, (byte) 67, 0, 2);
        } else {
          return null;
        }
    }

    final ia a(byte param0) {
        RuntimeException var2 = null;
        if (param0 == -114) {
          return this.a((Object) null, 0, (byte) 67, 0, 5);
        } else {
          return null;
        }
    }

    private final static an a(String param0, String param1, int param2, int param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            an var8_ref = null;
            an stackIn_15_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            an stackOut_14_0 = null;
            L0: {
              if (param3 == 34) {
                break L0;
              } else {
                an discarded$1 = vf.a((String) null, (String) null, 82, 95);
                break L0;
              }
            }
            L1: {
              if (param2 != 33) {
                if (34 == param2) {
                  var4 = "jagex_" + param0 + "_preferences" + param1 + "_wip.dat";
                  break L1;
                } else {
                  var4 = "jagex_" + param0 + "_preferences" + param1 + ".dat";
                  break L1;
                }
              } else {
                var4 = "jagex_" + param0 + "_preferences" + param1 + "_rc.dat";
                break L1;
              }
            }
            var5_array = new String[]{"c:/rscache/", "/rscache/", field_r, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            var6 = 0;
            L2: while (true) {
              if (var6 >= var5_array.length) {
                return null;
              } else {
                L3: {
                  L4: {
                    var7 = var5_array[var6];
                    if (var7.length() <= 0) {
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
                      var8_ref = new an(new File(var7, var4), "rw", 10000L);
                      stackOut_14_0 = (an) var8_ref;
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

    final ia a(java.awt.Frame param0, boolean param1) {
        RuntimeException var3 = null;
        L0: {
          if (param1) {
            break L0;
          } else {
            ((vf) this).field_i = null;
            break L0;
          }
        }
        return this.a((Object) (Object) param0, 0, (byte) 67, 0, 7);
    }

    final ia a(Class param0, String param1, int param2) {
        RuntimeException var4 = null;
        L0: {
          if (param2 == 21268) {
            break L0;
          } else {
            ((vf) this).field_k = null;
            break L0;
          }
        }
        return this.a((Object) (Object) new Object[2], 0, (byte) 67, 0, 9);
    }

    final ia a(String param0, int param1, byte param2) {
        RuntimeException var4 = null;
        L0: {
          if (param2 >= 3) {
            break L0;
          } else {
            ia discarded$2 = ((vf) this).a((byte) 66);
            break L0;
          }
        }
        return this.a(param1, 67, param0, false);
    }

    final ia a(String param0, Class param1, int param2, Class[] param3) {
        RuntimeException var5 = null;
        if (param2 >= 5) {
          return this.a((Object) (Object) new Object[3], 0, (byte) 67, 0, 8);
        } else {
          return null;
        }
    }

    final ia a(byte param0, java.net.URL param1) {
        RuntimeException var3 = null;
        if (param0 == -83) {
          return this.a((Object) (Object) param1, 0, (byte) 67, 0, 4);
        } else {
          return null;
        }
    }

    vf(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        Throwable decompiledCaughtException = null;
        ((vf) this).field_i = null;
        ((vf) this).field_u = false;
        ((vf) this).field_c = null;
        ((vf) this).field_k = null;
        ((vf) this).field_q = false;
        ((vf) this).field_a = false;
        ((vf) this).field_f = null;
        ((vf) this).field_o = null;
        ((vf) this).field_a = param3;
        field_b = "1.1";
        field_v = param0;
        field_g = param1;
        field_s = "Unknown";
        try {
          L0: {
            field_s = System.getProperty("java.vendor");
            field_b = System.getProperty("java.version");
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
          if (-1 != field_s.toLowerCase().indexOf("microsoft")) {
            ((vf) this).field_q = true;
            break L2;
          } else {
            break L2;
          }
        }
        try {
          L3: {
            field_n = System.getProperty("os.name");
            break L3;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var5 = (Exception) (Object) decompiledCaughtException;
            field_n = "Unknown";
            break L4;
          }
        }
        field_j = field_n.toLowerCase();
        try {
          L5: {
            String discarded$4 = System.getProperty("os.arch").toLowerCase();
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
            String discarded$5 = System.getProperty("os.version").toLowerCase();
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
              field_r = System.getProperty("user.home");
              if (field_r == null) {
                break L10;
              } else {
                field_r = field_r + "/";
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
          if (null == field_r) {
            field_r = "~/";
            break L12;
          } else {
            break L12;
          }
        }
        try {
          L13: {
            ((vf) this).field_p = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
          if (!((vf) this).field_q) {
            try {
              L16: {
                java.lang.reflect.Method discarded$6 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[1]);
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
                field_h = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
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
          fk.a(true, field_g, field_v);
          if (((vf) this).field_a) {
            ((vf) this).field_i = new an(fk.a((String) null, "random.dat", false, field_v), "rw", 25L);
            ((vf) this).field_k = new an(fk.a(0, "main_file_cache.dat2"), "rw", 314572800L);
            ((vf) this).field_f = new an(fk.a(0, "main_file_cache.idx255"), "rw", 1048576L);
            ((vf) this).field_e = new an[param2];
            var5_int = 0;
            L21: while (true) {
              if (param2 <= var5_int) {
                L22: {
                  if (((vf) this).field_q) {
                    try {
                      L23: {
                        Object discarded$7 = Class.forName("qj").newInstance();
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
                      if (((vf) this).field_q) {
                        ((vf) this).field_w = new ga();
                        break L26;
                      } else {
                        ((vf) this).field_x = Class.forName("ej").newInstance();
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
                      if (!((vf) this).field_q) {
                        ((vf) this).field_m = Class.forName("jj").newInstance();
                        break L29;
                      } else {
                        ((vf) this).field_t = new ue();
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
                ((vf) this).field_e[var5_int] = new an(fk.a(0, "main_file_cache.idx" + var5_int), "rw", 1048576L);
                var5_int++;
                continue L21;
              }
            }
          } else {
            break L20;
          }
        }
        ((vf) this).field_u = false;
        ((vf) this).field_d = new Thread((Runnable) this);
        ((vf) this).field_d.setPriority(10);
        ((vf) this).field_d.setDaemon(true);
        ((vf) this).field_d.start();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
