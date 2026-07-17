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
        if (param1 < 69) {
            return null;
        }
        return this.a(0, 0, (byte) 104, (Object) (Object) param0, 4);
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
            java.awt.datatransfer.Clipboard var3_ref4 = null;
            String var3_ref5 = null;
            java.awt.Frame var3_ref6 = null;
            ml var3_ref7 = null;
            int var3_int = 0;
            Throwable var4 = null;
            java.awt.datatransfer.Clipboard var4_ref = null;
            int var4_int = 0;
            java.awt.Component var4_ref2 = null;
            String var4_ref3 = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            int stackIn_84_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_83_0 = 0;
            int stackOut_82_0 = 0;
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
                              int discarded$7 = 0;
                              var1_ref.field_f = (Object) (Object) hg.a((String) var1_ref.field_c, var1_ref.field_e).a(25927);
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
                                    var7 = (java.awt.datatransfer.Transferable) var1_ref.field_c;
                                    var4_ref = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var4_ref.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
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
                                                  var3_ref7 = fia.a(-20529, field_d, (String) var1_ref.field_c, field_u);
                                                  var1_ref.field_f = (Object) (Object) var3_ref7;
                                                  break L8;
                                                } else {
                                                  if (13 != var2_int) {
                                                    L11: {
                                                      if (!((fia) this).field_c) {
                                                        break L11;
                                                      } else {
                                                        if (14 == var2_int) {
                                                          var3_int = var1_ref.field_e;
                                                          var4_int = var1_ref.field_d;
                                                          if (((fia) this).field_p) {
                                                            ((fia) this).field_g.a(0, var3_int, var4_int);
                                                            break L8;
                                                          } else {
                                                            Object discarded$8 = Class.forName("kfa").getDeclaredMethod("movemouse", new Class[2]).invoke(((fia) this).field_t, new Object[2]);
                                                            break L8;
                                                          }
                                                        } else {
                                                          break L11;
                                                        }
                                                      }
                                                    }
                                                    L12: {
                                                      if (!((fia) this).field_c) {
                                                        break L12;
                                                      } else {
                                                        if (15 == var2_int) {
                                                          L13: {
                                                            if (var1_ref.field_e == 0) {
                                                              stackOut_83_0 = 0;
                                                              stackIn_84_0 = stackOut_83_0;
                                                              break L13;
                                                            } else {
                                                              stackOut_82_0 = 1;
                                                              stackIn_84_0 = stackOut_82_0;
                                                              break L13;
                                                            }
                                                          }
                                                          var3_int = stackIn_84_0;
                                                          var4_ref2 = (java.awt.Component) var1_ref.field_c;
                                                          if (!((fia) this).field_p) {
                                                            Object discarded$9 = Class.forName("kfa").getDeclaredMethod("showcursor", new Class[2]).invoke(((fia) this).field_t, new Object[2]);
                                                            break L8;
                                                          } else {
                                                            ((fia) this).field_g.a(var3_int != 0, -54, var4_ref2);
                                                            break L8;
                                                          }
                                                        } else {
                                                          break L12;
                                                        }
                                                      }
                                                    }
                                                    L14: {
                                                      if (((fia) this).field_p) {
                                                        break L14;
                                                      } else {
                                                        if (17 != var2_int) {
                                                          break L14;
                                                        } else {
                                                          var3_array = (Object[]) var1_ref.field_c;
                                                          Object discarded$10 = Class.forName("kfa").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((fia) this).field_t, new Object[5]);
                                                          break L8;
                                                        }
                                                      }
                                                    }
                                                    if (var2_int == 16) {
                                                      try {
                                                        L15: {
                                                          if (field_j.startsWith("win")) {
                                                            L16: {
                                                              var3_ref5 = (String) var1_ref.field_c;
                                                              if (var3_ref5.startsWith("http://")) {
                                                                break L16;
                                                              } else {
                                                                if (var3_ref5.startsWith("https://")) {
                                                                  break L16;
                                                                } else {
                                                                  throw fia.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                            var4_ref3 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L17: while (true) {
                                                              if (~var5 <= ~var3_ref5.length()) {
                                                                Process discarded$11 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var3_ref5 + "\"");
                                                                var1_ref.field_f = null;
                                                                break L15;
                                                              } else {
                                                                if (var4_ref3.indexOf((int) var3_ref5.charAt(var5)) != -1) {
                                                                  var5++;
                                                                  continue L17;
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
                                                    var3_ref7 = fia.a(-20529, field_d, (String) var1_ref.field_c, "");
                                                    var1_ref.field_f = (Object) (Object) var3_ref7;
                                                    break L8;
                                                  }
                                                }
                                              } else {
                                                if (!((fia) this).field_p) {
                                                  Object discarded$12 = Class.forName("pj").getMethod("exit", new Class[0]).invoke(((fia) this).field_i, new Object[0]);
                                                  break L8;
                                                } else {
                                                  ((fia) this).field_w.a((java.awt.Frame) var1_ref.field_c, (byte) -108);
                                                  break L8;
                                                }
                                              }
                                            } else {
                                              var3_ref6 = new java.awt.Frame("Jagex Full Screen");
                                              var1_ref.field_f = (Object) (Object) var3_ref6;
                                              var3_ref6.setResizable(false);
                                              if (((fia) this).field_p) {
                                                ((fia) this).field_w.a(var3_ref6, var1_ref.field_e >>> 16, var1_ref.field_d >> 16, var1_ref.field_d & 65535, var1_ref.field_e & 65535, true);
                                                break L8;
                                              } else {
                                                Object discarded$13 = Class.forName("pj").getMethod("enter", new Class[5]).invoke(((fia) this).field_i, new Object[5]);
                                                break L8;
                                              }
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
                                          var3_ref5 = (255 & var1_ref.field_e >> 24) + "." + ((16739670 & var1_ref.field_e) >> 16) + "." + (var1_ref.field_e >> 8 & 255) + "." + (255 & var1_ref.field_e);
                                          var1_ref.field_f = (Object) (Object) java.net.InetAddress.getByName(var3_ref5).getHostName();
                                          break L8;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var3_ref4 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var1_ref.field_f = (Object) (Object) var3_ref4.getContents((Object) null);
                                  break L8;
                                }
                              }
                            } else {
                              L18: {
                                var3_array = (Object[]) var1_ref.field_c;
                                if (((fia) this).field_c) {
                                  if (((Class) var3_array[0]).getClassLoader() == null) {
                                    throw new SecurityException();
                                  } else {
                                    break L18;
                                  }
                                } else {
                                  break L18;
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
                L19: {
                  var2_ref = decompiledCaughtException;
                  var1_ref.field_b = 2;
                  break L19;
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
        if (param0 != -24818) {
            Object var5 = null;
            naa discarded$0 = ((fia) this).a((byte) 92, (java.awt.datatransfer.Transferable) null);
        }
        return this.a(param0 + 24819, param1, false, param2);
    }

    final naa a(int param0, String param1, Class param2) {
        if (param0 != 10355) {
            Object var5 = null;
            ml discarded$0 = fia.a(-73, 85, (String) null, (String) null);
        }
        return this.a(0, 0, (byte) 104, (Object) (Object) new Object[2], 9);
    }

    private final naa a(int param0, String param1, boolean param2, int param3) {
        if (param0 != 1) {
            Object var6 = null;
            ml discarded$0 = fia.a(-120, 43, (String) null, (String) null);
        }
        return this.a(param3, 0, (byte) 104, (Object) (Object) param1, 1);
    }

    final naa a(int param0, Class[] param1, String param2, Class param3) {
        if (param0 != 26868) {
            ((fia) this).field_i = null;
        }
        return this.a(0, 0, (byte) 104, (Object) (Object) new Object[3], 8);
    }

    final boolean a(byte param0) {
        if (!(((fia) this).field_c)) {
            return false;
        }
        if (param0 != 69) {
            ((fia) this).field_r = null;
        }
        if (((fia) this).field_p) {
            return ((fia) this).field_w != null ? true : false;
        }
        return null != ((fia) this).field_i ? true : false;
    }

    final void b(byte param0) {
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
                ((fia) this).field_f = true;
                this.notifyAll();
                break L0;
              }
            }
            L1: {
              if (param0 == 59) {
                break L1;
              } else {
                var4 = null;
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
                  if (var2_int >= ((fia) this).field_h.length) {
                    break L10;
                  } else {
                    if (null != ((fia) this).field_h[var2_int]) {
                      {
                        L12: {
                          ((fia) this).field_h[var2_int].b((byte) -101);
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
              if (((fia) this).field_x != null) {
                {
                  L15: {
                    ((fia) this).field_x.b((byte) -101);
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

    private final static ml a(int param0, int param1, String param2, String param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            ml var8_ref = null;
            ml stackIn_15_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            ml stackOut_14_0 = null;
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
            var5_array = new String[]{"c:/rscache/", "/rscache/", field_a, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            if (param0 == -20529) {
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
                      var8_ref = new ml(new File(var7, var4), "rw", 10000L);
                      stackOut_14_0 = (ml) var8_ref;
                      stackIn_15_0 = stackOut_14_0;
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
                    return stackIn_15_0;
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

    final naa a(int param0) {
        if (param0 > -87) {
            return null;
        }
        return this.a(0, 0, (byte) 104, (Object) null, 5);
    }

    final naa a(java.awt.Frame param0, int param1) {
        if (param1 != 18885) {
            return null;
        }
        return this.a(0, 0, (byte) 104, (Object) (Object) param0, 7);
    }

    private final naa a(int param0, int param1, byte param2, Object param3, int param4) {
        naa var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
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
    }

    final naa a(int param0, int param1, int param2, byte param3, int param4) {
        if (param3 != 66) {
            return null;
        }
        return this.a(param2 + (param4 << 16), param1 + (param0 << 16), (byte) 104, (Object) null, 6);
    }

    final naa a(Runnable param0, int param1, int param2) {
        if (param1 != 425) {
            ((fia) this).field_h = null;
        }
        return this.a(param2, 0, (byte) 104, (Object) (Object) param0, 2);
    }

    final boolean a(byte[] param0, File param1, boolean param2) {
        FileOutputStream var4 = null;
        IOException var4_ref = null;
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
        if (param0 <= 56) {
            naa discarded$0 = ((fia) this).a(96);
        }
        return this.a(0, 0, (byte) 104, (Object) (Object) param1, 19);
    }

    final naa b(int param0) {
        if (param0 <= 104) {
            return null;
        }
        return this.a(0, 0, (byte) 104, (Object) null, 18);
    }

    fia(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        ThreadGroup var5_ref2 = null;
        ThreadGroup var6 = null;
        Thread[] var7 = null;
        int var8 = 0;
        sp var9 = null;
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
        ((fia) this).field_c = stackIn_3_1 != 0;
        try {
          L1: {
            field_e = System.getProperty("java.vendor");
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
          if (-1 == field_e.toLowerCase().indexOf("microsoft")) {
            break L3;
          } else {
            ((fia) this).field_p = true;
            break L3;
          }
        }
        try {
          L4: {
            field_s = System.getProperty("os.name");
            break L4;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var5 = (Exception) (Object) decompiledCaughtException;
            field_s = "Unknown";
            break L5;
          }
        }
        field_j = field_s.toLowerCase();
        try {
          L6: {
            String discarded$5 = System.getProperty("os.arch").toLowerCase();
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
            String discarded$6 = System.getProperty("os.version").toLowerCase();
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
              field_a = System.getProperty("user.home");
              if (field_a == null) {
                break L11;
              } else {
                field_a = field_a + "/";
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
          if (null != field_a) {
            break L13;
          } else {
            field_a = "~/";
            break L13;
          }
        }
        try {
          L14: {
            ((fia) this).field_r = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
          if (!((fia) this).field_p) {
            try {
              L17: {
                java.lang.reflect.Method discarded$7 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[1]);
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
                field_b = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
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
          iba.a(field_d, -70, field_u);
          if (!((fia) this).field_c) {
            break L21;
          } else {
            ((fia) this).field_x = new ml(iba.a((String) null, "random.dat", 0, field_d), "rw", 25L);
            ((fia) this).field_n = new ml(iba.a("main_file_cache.dat2", (byte) -71), "rw", 314572800L);
            ((fia) this).field_q = new ml(iba.a("main_file_cache.idx255", (byte) -123), "rw", 1048576L);
            ((fia) this).field_h = new ml[param2];
            var5_int = 0;
            L22: while (true) {
              if (param2 <= var5_int) {
                L23: {
                  if (!((fia) this).field_p) {
                    break L23;
                  } else {
                    try {
                      L24: {
                        Object discarded$8 = Class.forName("nva").newInstance();
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
                      if (!((fia) this).field_p) {
                        ((fia) this).field_i = Class.forName("pj").newInstance();
                        break L27;
                      } else {
                        var9 = new sp();
                        ((fia) this).field_w = var9;
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
                      if (!((fia) this).field_p) {
                        ((fia) this).field_t = Class.forName("kfa").newInstance();
                        break L30;
                      } else {
                        ((fia) this).field_g = new qj();
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
                ((fia) this).field_h[var5_int] = new ml(iba.a("main_file_cache.idx" + var5_int, (byte) -108), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        L32: {
          if (!((fia) this).field_c) {
            break L32;
          } else {
            if (((fia) this).field_p) {
              break L32;
            } else {
              var5_ref2 = Thread.currentThread().getThreadGroup();
              var6 = var5_ref2.getParent();
              L33: while (true) {
                if (var6 == null) {
                  var7 = new Thread[1000];
                  int discarded$9 = var5_ref2.enumerate(var7);
                  var8 = 0;
                  L34: while (true) {
                    if (var7.length <= var8) {
                      break L32;
                    } else {
                      if (null != var7[var8]) {
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
                  var5_ref2 = var6;
                  var6 = var5_ref2.getParent();
                  continue L33;
                }
              }
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
