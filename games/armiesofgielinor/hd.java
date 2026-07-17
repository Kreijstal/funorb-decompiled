/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hd implements Runnable {
    private boolean field_h;
    ei field_r;
    static String field_t;
    private hj field_l;
    private wo field_w;
    boolean field_e;
    ei field_m;
    private Object field_b;
    ei[] field_c;
    private static int field_k;
    private static String field_f;
    private fv field_q;
    private static String field_a;
    static String field_n;
    ei field_d;
    private Thread field_v;
    private static String field_i;
    private static volatile long field_p;
    static String field_u;
    private wo field_s;
    static java.lang.reflect.Method field_x;
    private boolean field_g;
    private Object field_o;
    java.awt.EventQueue field_j;

    final wo a(int param0, byte param1, String param2) {
        if (param1 < 37) {
            field_p = -11L;
        }
        return this.a((byte) 125, param0, false, param2);
    }

    final wo a(boolean param0, int param1, int param2, int param3, int param4) {
        if (!param0) {
            ((hd) this).field_c = null;
        }
        return this.a((param4 << 16) - -param3, (param2 << 16) - -param1, (Object) null, (byte) 81, 6);
    }

    private final wo a(byte param0, int param1, boolean param2, String param3) {
        return this.a(0, param1, (Object) (Object) param3, (byte) -20, 1);
    }

    final wo a(java.awt.datatransfer.Transferable param0, int param1) {
        if (param1 != -26522) {
            return null;
        }
        return this.a(0, 0, (Object) (Object) param0, (byte) 102, 19);
    }

    private final static ei a(boolean param0, String param1, int param2, String param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            ei var8_ref = null;
            ei stackIn_13_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            ei stackOut_12_0 = null;
            L0: {
              if (33 != param2) {
                if (34 != param2) {
                  var4 = "jagex_" + param3 + "_preferences" + param1 + ".dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param3 + "_preferences" + param1 + "_wip.dat";
                  break L0;
                }
              } else {
                var4 = "jagex_" + param3 + "_preferences" + param1 + "_rc.dat";
                break L0;
              }
            }
            var5_array = new String[]{"c:/rscache/", "/rscache/", field_f, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
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
                    var8_ref = new ei(new File(var7, var4), "rw", 10000L);
                    stackOut_12_0 = (ei) var8_ref;
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

    final wo a(int param0, int param1, Runnable param2) {
        if (param1 != 0) {
            ((hd) this).field_j = null;
        }
        return this.a(0, param0, (Object) (Object) param2, (byte) -26, 2);
    }

    final wo a(Class param0, int param1, Class[] param2, String param3) {
        if (param1 != 0) {
            boolean discarded$0 = ((hd) this).b(false);
        }
        return this.a(0, 0, (Object) (Object) new Object[3], (byte) 124, 8);
    }

    final wo a(int param0) {
        if (param0 != 0) {
            return null;
        }
        return this.a(0, 0, (Object) null, (byte) -99, 18);
    }

    final void a(boolean param0) {
        try {
            Object var2 = null;
            InterruptedException var2_ref = null;
            IOException var2_ref2 = null;
            int var2_int = 0;
            Throwable var3 = null;
            IOException var3_ref = null;
            Object stackIn_2_0 = null;
            Object stackIn_3_0 = null;
            Object stackIn_4_0 = null;
            int stackIn_4_1 = 0;
            Throwable decompiledCaughtException = null;
            Object stackOut_1_0 = null;
            Object stackOut_3_0 = null;
            int stackOut_3_1 = 0;
            Object stackOut_2_0 = null;
            int stackOut_2_1 = 0;
            var2 = this;
            synchronized (var2) {
              L0: {
                L1: {
                  stackOut_1_0 = this;
                  stackIn_3_0 = stackOut_1_0;
                  stackIn_2_0 = stackOut_1_0;
                  if (!param0) {
                    stackOut_3_0 = this;
                    stackOut_3_1 = 0;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    break L1;
                  } else {
                    stackOut_2_0 = this;
                    stackOut_2_1 = 1;
                    stackIn_4_0 = stackOut_2_0;
                    stackIn_4_1 = stackOut_2_1;
                    break L1;
                  }
                }
                ((hd) this).field_g = stackIn_4_1 != 0;
                this.notifyAll();
                break L0;
              }
            }
            try {
              L2: {
                ((hd) this).field_v.join();
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
              if (null != ((hd) this).field_r) {
                {
                  L5: {
                    ((hd) this).field_r.b(783);
                    break L5;
                  }
                }
                break L4;
              } else {
                break L4;
              }
            }
            L7: {
              if (((hd) this).field_d != null) {
                {
                  L8: {
                    ((hd) this).field_d.b(783);
                    break L8;
                  }
                }
                break L7;
              } else {
                break L7;
              }
            }
            L10: {
              if (((hd) this).field_c != null) {
                var2_int = 0;
                L11: while (true) {
                  if (((hd) this).field_c.length <= var2_int) {
                    break L10;
                  } else {
                    if (((hd) this).field_c[var2_int] != null) {
                      {
                        L12: {
                          ((hd) this).field_c[var2_int].b(783);
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
              if (((hd) this).field_m != null) {
                {
                  L15: {
                    ((hd) this).field_m.b(783);
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

    private final wo a(int param0, int param1, Object param2, byte param3, int param4) {
        wo var6 = null;
        Object var7_ref_Object = null;
        int var7 = 0;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        var6 = new wo();
        var6.field_d = param0;
        var6.field_b = param2;
        var6.field_e = param4;
        var6.field_c = param1;
        var7_ref_Object = this;
        synchronized (var7_ref_Object) {
          L0: {
            L1: {
              if (((hd) this).field_s == null) {
                ((hd) this).field_w = var6;
                ((hd) this).field_s = var6;
                break L1;
              } else {
                ((hd) this).field_s.field_a = var6;
                ((hd) this).field_s = var6;
                break L1;
              }
            }
            this.notify();
            break L0;
          }
        }
        var7 = -48 % ((18 - param3) / 35);
        return var6;
    }

    final wo a(byte param0, java.awt.Frame param1) {
        int var3 = -12 % ((param0 - -4) / 59);
        return this.a(0, 0, (Object) (Object) param1, (byte) 108, 7);
    }

    final wo a(java.net.URL param0, boolean param1) {
        if (param1) {
            boolean discarded$0 = ((hd) this).b(true);
        }
        return this.a(0, 0, (Object) (Object) param0, (byte) -126, 4);
    }

    public final void run() {
        try {
            Object var2 = null;
            Throwable var2_ref = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            ug var3_ref = null;
            Exception var3_ref2 = null;
            ei var3_ref3 = null;
            int var3_int = 0;
            Throwable var4_ref_Throwable = null;
            int var4 = 0;
            String var4_ref_String = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            Object var8 = null;
            wo var8_ref = null;
            Thread var9 = null;
            Object[] var10 = null;
            String var11 = null;
            Object[] var12 = null;
            java.awt.Component var13 = null;
            java.awt.Frame var14 = null;
            String var15 = null;
            java.awt.datatransfer.Clipboard var16 = null;
            java.awt.datatransfer.Clipboard var17 = null;
            Object[] var18 = null;
            int stackIn_83_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_82_0 = 0;
            int stackOut_81_0 = 0;
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
                    if (!((hd) this).field_g) {
                      if (((hd) this).field_w != null) {
                        L4: {
                          var8_ref = ((hd) this).field_w;
                          ((hd) this).field_w = ((hd) this).field_w.field_a;
                          if (null != ((hd) this).field_w) {
                            break L4;
                          } else {
                            ((hd) this).field_s = null;
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
                    var2_int = var8_ref.field_e;
                    if (var2_int != 1) {
                      if (var2_int != 22) {
                        if (var2_int != 2) {
                          if (var2_int != 4) {
                            if (8 != var2_int) {
                              if (9 == var2_int) {
                                L9: {
                                  var18 = (Object[]) var8_ref.field_b;
                                  if (!((hd) this).field_e) {
                                    break L9;
                                  } else {
                                    if (((Class) var18[0]).getClassLoader() == null) {
                                      throw new SecurityException();
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                var8_ref.field_f = (Object) (Object) ((Class) var18[0]).getDeclaredField((String) var18[1]);
                                break L8;
                              } else {
                                if (18 == var2_int) {
                                  var17 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8_ref.field_f = (Object) (Object) var17.getContents((Object) null);
                                  break L8;
                                } else {
                                  if (var2_int == 19) {
                                    var7 = (java.awt.datatransfer.Transferable) var8_ref.field_b;
                                    var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var16.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L8;
                                  } else {
                                    if (!((hd) this).field_e) {
                                      throw hd.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    } else {
                                      if (var2_int == 3) {
                                        if (~vi.b(-127) <= ~field_p) {
                                          var15 = (var8_ref.field_c >> 24 & 255) + "." + (255 & var8_ref.field_c >> 16) + "." + (255 & var8_ref.field_c >> 8) + "." + (var8_ref.field_c & 255);
                                          var8_ref.field_f = (Object) (Object) java.net.InetAddress.getByName(var15).getHostName();
                                          break L8;
                                        } else {
                                          throw new IOException();
                                        }
                                      } else {
                                        if (var2_int != 21) {
                                          if (var2_int == 5) {
                                            if (((hd) this).field_h) {
                                              var8_ref.field_f = (Object) (Object) ((hd) this).field_q.a(0);
                                              break L8;
                                            } else {
                                              var8_ref.field_f = Class.forName("wu").getMethod("listmodes", new Class[0]).invoke(((hd) this).field_o, new Object[0]);
                                              break L8;
                                            }
                                          } else {
                                            if (var2_int == 6) {
                                              var14 = new java.awt.Frame("Jagex Full Screen");
                                              var8_ref.field_f = (Object) (Object) var14;
                                              var14.setResizable(false);
                                              if (!((hd) this).field_h) {
                                                Object discarded$6 = Class.forName("wu").getMethod("enter", new Class[5]).invoke(((hd) this).field_o, new Object[5]);
                                                break L8;
                                              } else {
                                                ((hd) this).field_q.a(65535 & var8_ref.field_c, var8_ref.field_d & 65535, var14, var8_ref.field_d >> 16, var8_ref.field_c >>> 16, false);
                                                break L8;
                                              }
                                            } else {
                                              if (var2_int == 7) {
                                                if (!((hd) this).field_h) {
                                                  Object discarded$7 = Class.forName("wu").getMethod("exit", new Class[0]).invoke(((hd) this).field_o, new Object[0]);
                                                  break L8;
                                                } else {
                                                  ((hd) this).field_q.a(122, (java.awt.Frame) var8_ref.field_b);
                                                  break L8;
                                                }
                                              } else {
                                                if (var2_int == 12) {
                                                  var3_ref3 = hd.a(true, (String) var8_ref.field_b, field_k, field_i);
                                                  var8_ref.field_f = (Object) (Object) var3_ref3;
                                                  break L8;
                                                } else {
                                                  if (var2_int == 13) {
                                                    var3_ref3 = hd.a(true, (String) var8_ref.field_b, field_k, "");
                                                    var8_ref.field_f = (Object) (Object) var3_ref3;
                                                    break L8;
                                                  } else {
                                                    L10: {
                                                      if (!((hd) this).field_e) {
                                                        break L10;
                                                      } else {
                                                        if (14 == var2_int) {
                                                          var3_int = var8_ref.field_c;
                                                          var4 = var8_ref.field_d;
                                                          if (((hd) this).field_h) {
                                                            ((hd) this).field_l.a(var4, 74, var3_int);
                                                            break L8;
                                                          } else {
                                                            Object discarded$8 = Class.forName("gf").getDeclaredMethod("movemouse", new Class[2]).invoke(((hd) this).field_b, new Object[2]);
                                                            break L8;
                                                          }
                                                        } else {
                                                          break L10;
                                                        }
                                                      }
                                                    }
                                                    L11: {
                                                      if (!((hd) this).field_e) {
                                                        break L11;
                                                      } else {
                                                        if (var2_int == 15) {
                                                          L12: {
                                                            if (var8_ref.field_c == 0) {
                                                              stackOut_82_0 = 0;
                                                              stackIn_83_0 = stackOut_82_0;
                                                              break L12;
                                                            } else {
                                                              stackOut_81_0 = 1;
                                                              stackIn_83_0 = stackOut_81_0;
                                                              break L12;
                                                            }
                                                          }
                                                          var3_int = stackIn_83_0;
                                                          var13 = (java.awt.Component) var8_ref.field_b;
                                                          if (((hd) this).field_h) {
                                                            ((hd) this).field_l.a(48, var3_int != 0, var13);
                                                            break L8;
                                                          } else {
                                                            Object discarded$9 = Class.forName("gf").getDeclaredMethod("showcursor", new Class[2]).invoke(((hd) this).field_b, new Object[2]);
                                                            break L8;
                                                          }
                                                        } else {
                                                          break L11;
                                                        }
                                                      }
                                                    }
                                                    L13: {
                                                      if (((hd) this).field_h) {
                                                        break L13;
                                                      } else {
                                                        if (var2_int == 17) {
                                                          var12 = (Object[]) var8_ref.field_b;
                                                          Object discarded$10 = Class.forName("gf").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((hd) this).field_b, new Object[5]);
                                                          break L8;
                                                        } else {
                                                          break L13;
                                                        }
                                                      }
                                                    }
                                                    if (var2_int != 16) {
                                                      throw hd.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    } else {
                                                      try {
                                                        L14: {
                                                          if (!field_n.startsWith("win")) {
                                                            throw hd.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          } else {
                                                            L15: {
                                                              var11 = (String) var8_ref.field_b;
                                                              if (var11.startsWith("http://")) {
                                                                break L15;
                                                              } else {
                                                                if (!var11.startsWith("https://")) {
                                                                  throw hd.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  break L15;
                                                                }
                                                              }
                                                            }
                                                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L16: while (true) {
                                                              if (~var5 <= ~var11.length()) {
                                                                Process discarded$11 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var11 + "\"");
                                                                var8_ref.field_f = null;
                                                                break L14;
                                                              } else {
                                                                if (var4_ref_String.indexOf((int) var11.charAt(var5)) != -1) {
                                                                  var5++;
                                                                  continue L16;
                                                                } else {
                                                                  throw hd.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter1) {
                                                        decompiledCaughtException = decompiledCaughtParameter1;
                                                        var3_ref2 = (Exception) (Object) decompiledCaughtException;
                                                        var8_ref.field_f = (Object) (Object) var3_ref2;
                                                        throw hd.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                                                      }
                                                      break L8;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          if (~field_p < ~vi.b(46)) {
                                            throw new IOException();
                                          } else {
                                            var8_ref.field_f = (Object) (Object) java.net.InetAddress.getByName((String) var8_ref.field_b).getAddress();
                                            break L8;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              L17: {
                                var10 = (Object[]) var8_ref.field_b;
                                if (!((hd) this).field_e) {
                                  break L17;
                                } else {
                                  if (((Class) var10[0]).getClassLoader() != null) {
                                    break L17;
                                  } else {
                                    throw new SecurityException();
                                  }
                                }
                              }
                              var8_ref.field_f = (Object) (Object) ((Class) var10[0]).getDeclaredMethod((String) var10[1], (Class[]) var10[2]);
                              break L8;
                            }
                          } else {
                            if (vi.b(89) >= field_p) {
                              var8_ref.field_f = (Object) (Object) new DataInputStream(((java.net.URL) var8_ref.field_b).openStream());
                              break L8;
                            } else {
                              throw new IOException();
                            }
                          }
                        } else {
                          var9 = new Thread((Runnable) var8_ref.field_b);
                          var9.setDaemon(true);
                          var9.start();
                          var9.setPriority(var8_ref.field_c);
                          var8_ref.field_f = (Object) (Object) var9;
                          break L8;
                        }
                      } else {
                        if (~vi.b(-118) > ~field_p) {
                          throw new IOException();
                        } else {
                          try {
                            L18: {
                              var8_ref.field_f = (Object) (Object) ti.a((String) var8_ref.field_b, (byte) 102, var8_ref.field_c).a(111);
                              break L18;
                            }
                          } catch (java.lang.Exception decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref = (ug) (Object) decompiledCaughtException;
                            var8_ref.field_f = (Object) (Object) var3_ref.getMessage();
                            throw var3_ref;
                          }
                          break L8;
                        }
                      }
                    } else {
                      if (vi.b(-108) >= field_p) {
                        var8_ref.field_f = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var8_ref.field_b), var8_ref.field_c);
                        break L8;
                      } else {
                        throw new IOException();
                      }
                    }
                  }
                  var8_ref.field_g = 1;
                  break L7;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                L19: {
                  var2_ref = decompiledCaughtException;
                  var8_ref.field_g = 2;
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

    final wo b(int param0) {
        if (param0 != -20681) {
            return null;
        }
        return this.a(0, 0, (Object) null, (byte) 109, 5);
    }

    final wo a(int param0, Class param1, String param2) {
        if (param0 != -30598) {
            ((hd) this).a(false);
        }
        return this.a(0, 0, (Object) (Object) new Object[2], (byte) -60, 9);
    }

    final boolean b(boolean param0) {
        if (param0) {
            Object var3 = null;
            wo discarded$0 = ((hd) this).a((java.awt.datatransfer.Transferable) null, 84);
        }
        if (!(((hd) this).field_e)) {
            return false;
        }
        if (((hd) this).field_h) {
            return null != ((hd) this).field_q ? true : false;
        }
        return ((hd) this).field_o != null ? true : false;
    }

    hd(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        fv var7 = null;
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
          ((hd) this).field_e = false;
          ((hd) this).field_d = null;
          ((hd) this).field_h = false;
          ((hd) this).field_r = null;
          ((hd) this).field_m = null;
          ((hd) this).field_w = null;
          ((hd) this).field_g = false;
          ((hd) this).field_s = null;
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
        ((hd) this).field_e = stackIn_3_1 != 0;
        field_t = "Unknown";
        field_u = "1.1";
        field_k = param0;
        field_i = param1;
        try {
          L1: {
            field_t = System.getProperty("java.vendor");
            field_u = System.getProperty("java.version");
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
          if (field_t.toLowerCase().indexOf("microsoft") != -1) {
            ((hd) this).field_h = true;
            break L3;
          } else {
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
        field_n = field_a.toLowerCase();
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
              field_f = System.getProperty("user.home");
              if (null == field_f) {
                break L11;
              } else {
                field_f = field_f + "/";
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
          if (null == field_f) {
            field_f = "~/";
            break L13;
          } else {
            break L13;
          }
        }
        try {
          L14: {
            ((hd) this).field_j = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
          if (!((hd) this).field_h) {
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
          } else {
            break L16;
          }
        }
        L21: {
          qi.a(field_k, field_i, 1);
          if (!((hd) this).field_e) {
            break L21;
          } else {
            ((hd) this).field_m = new ei(qi.a("random.dat", field_k, 39, (String) null), "rw", 25L);
            ((hd) this).field_r = new ei(qi.a(true, "main_file_cache.dat2"), "rw", 314572800L);
            ((hd) this).field_d = new ei(qi.a(true, "main_file_cache.idx255"), "rw", 1048576L);
            ((hd) this).field_c = new ei[param2];
            var5_int = 0;
            L22: while (true) {
              if (param2 <= var5_int) {
                L23: {
                  if (!((hd) this).field_h) {
                    break L23;
                  } else {
                    try {
                      L24: {
                        Object discarded$7 = Class.forName("qr").newInstance();
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
                      if (!((hd) this).field_h) {
                        ((hd) this).field_o = Class.forName("wu").newInstance();
                        break L27;
                      } else {
                        var7 = new fv();
                        ((hd) this).field_q = var7;
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
                      if (((hd) this).field_h) {
                        ((hd) this).field_l = new hj();
                        break L30;
                      } else {
                        ((hd) this).field_b = Class.forName("gf").newInstance();
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
                ((hd) this).field_c[var5_int] = new ei(qi.a(true, "main_file_cache.idx" + var5_int), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        ((hd) this).field_g = false;
        ((hd) this).field_v = new Thread((Runnable) this);
        ((hd) this).field_v.setPriority(10);
        ((hd) this).field_v.setDaemon(true);
        ((hd) this).field_v.start();
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
