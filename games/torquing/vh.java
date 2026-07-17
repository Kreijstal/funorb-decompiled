/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vh implements Runnable {
    static java.lang.reflect.Method field_j;
    private rc field_m;
    private static volatile long field_s;
    private Object field_x;
    private boolean field_l;
    private static String field_h;
    ue field_t;
    private an field_a;
    ue field_n;
    static String field_i;
    ue field_c;
    private static int field_f;
    ue[] field_w;
    boolean field_d;
    private boolean field_o;
    private rc field_g;
    private kd field_b;
    private Object field_e;
    private Thread field_k;
    private static String field_r;
    static String field_v;
    java.awt.EventQueue field_p;
    private static String field_q;
    static String field_u;

    final rc a(boolean param0, int param1, int param2, int param3, int param4) {
        if (!param0) {
            Object var7 = null;
            rc discarded$0 = ((vh) this).a((Class) null, false, (String) null);
        }
        return this.a((param1 << 16) + param2, 6, (Object) null, param3 + (param4 << 16), (byte) -116);
    }

    final rc a(int param0, java.net.URL param1) {
        if (param0 != 0) {
            field_i = null;
        }
        return this.a(0, 4, (Object) (Object) param1, 0, (byte) -101);
    }

    final boolean a(byte param0) {
        if (param0 != 13) {
            ((vh) this).field_l = false;
        }
        if (!((vh) this).field_d) {
            return false;
        }
        if (((vh) this).field_o) {
            return null != ((vh) this).field_a ? true : false;
        }
        return ((vh) this).field_x != null ? true : false;
    }

    final rc a(Class[] param0, int param1, String param2, Class param3) {
        if (param1 != -30475) {
            Object var6 = null;
            rc discarded$0 = ((vh) this).a((String) null, -80, 20);
        }
        return this.a(0, 8, (Object) (Object) new Object[3], 0, (byte) -119);
    }

    final void b(int param0) {
        try {
            Object var2 = null;
            InterruptedException var2_ref = null;
            IOException var2_ref2 = null;
            int var2_int = 0;
            IOException var3 = null;
            int var3_int = 0;
            Throwable var4 = null;
            Throwable decompiledCaughtException = null;
            var2 = this;
            synchronized (var2) {
              L0: {
                ((vh) this).field_l = true;
                this.notifyAll();
                var3_int = -46 % ((param0 - -47) / 50);
                break L0;
              }
            }
            try {
              L1: {
                ((vh) this).field_k.join();
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var2_ref = (InterruptedException) (Object) decompiledCaughtException;
                break L2;
              }
            }
            L3: {
              if (((vh) this).field_t == null) {
                break L3;
              } else {
                {
                  L4: {
                    ((vh) this).field_t.a((byte) 92);
                    break L4;
                  }
                }
                break L3;
              }
            }
            L6: {
              if (null != ((vh) this).field_n) {
                {
                  L7: {
                    ((vh) this).field_n.a((byte) 126);
                    break L7;
                  }
                }
                break L6;
              } else {
                break L6;
              }
            }
            L9: {
              if (((vh) this).field_w != null) {
                var2_int = 0;
                L10: while (true) {
                  if (((vh) this).field_w.length <= var2_int) {
                    break L9;
                  } else {
                    if (((vh) this).field_w[var2_int] != null) {
                      {
                        L11: {
                          ((vh) this).field_w[var2_int].a((byte) 127);
                          var2_int++;
                          break L11;
                        }
                      }
                      continue L10;
                    } else {
                      var2_int++;
                      continue L10;
                    }
                  }
                }
              } else {
                break L9;
              }
            }
            L13: {
              if (((vh) this).field_c == null) {
                break L13;
              } else {
                {
                  L14: {
                    ((vh) this).field_c.a((byte) 94);
                    break L14;
                  }
                }
                break L13;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final rc a(byte param0, int param1, Runnable param2) {
        if (param0 > -51) {
            return null;
        }
        return this.a(param1, 2, (Object) (Object) param2, 0, (byte) -123);
    }

    private final rc a(boolean param0, String param1, int param2) {
        return this.a(param2, 1, (Object) (Object) param1, 0, (byte) -128);
    }

    public final void run() {
        try {
            Object var2 = null;
            Throwable var2_ref = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            Exception var3_ref = null;
            ko var3_ref2 = null;
            ue var3_ref3 = null;
            int var3_int = 0;
            Throwable var4_ref_Throwable = null;
            int var4 = 0;
            String var4_ref_String = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            Object var8 = null;
            rc var8_ref = null;
            Thread var9 = null;
            Object[] var10 = null;
            java.awt.datatransfer.Clipboard var11 = null;
            java.awt.Frame var12 = null;
            Object[] var13 = null;
            String var14 = null;
            java.awt.Component var15 = null;
            String var16 = null;
            java.awt.datatransfer.Clipboard var17 = null;
            Object[] var18 = null;
            int stackIn_79_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_78_0 = 0;
            int stackOut_77_0 = 0;
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
                    if (!((vh) this).field_l) {
                      if (((vh) this).field_m != null) {
                        L4: {
                          var8_ref = ((vh) this).field_m;
                          ((vh) this).field_m = ((vh) this).field_m.field_f;
                          if (((vh) this).field_m != null) {
                            break L4;
                          } else {
                            ((vh) this).field_g = null;
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
                    var2_int = var8_ref.field_g;
                    if (var2_int != 1) {
                      if (var2_int == 22) {
                        if (field_s <= km.b(-1)) {
                          try {
                            L9: {
                              var8_ref.field_d = (Object) (Object) gm.a(true, var8_ref.field_b, (String) var8_ref.field_e).a(-2049);
                              break L9;
                            }
                          } catch (java.lang.Exception decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref2 = (ko) (Object) decompiledCaughtException;
                            var8_ref.field_d = (Object) (Object) var3_ref2.getMessage();
                            throw var3_ref2;
                          }
                          break L8;
                        } else {
                          throw new IOException();
                        }
                      } else {
                        if (2 != var2_int) {
                          if (var2_int == 4) {
                            if (km.b(-1) < field_s) {
                              throw new IOException();
                            } else {
                              var8_ref.field_d = (Object) (Object) new DataInputStream(((java.net.URL) var8_ref.field_e).openStream());
                              break L8;
                            }
                          } else {
                            if (var2_int != 8) {
                              if (var2_int == 9) {
                                L10: {
                                  var18 = (Object[]) var8_ref.field_e;
                                  if (!((vh) this).field_d) {
                                    break L10;
                                  } else {
                                    if (null != ((Class) var18[0]).getClassLoader()) {
                                      break L10;
                                    } else {
                                      throw new SecurityException();
                                    }
                                  }
                                }
                                var8_ref.field_d = (Object) (Object) ((Class) var18[0]).getDeclaredField((String) var18[1]);
                                break L8;
                              } else {
                                if (var2_int != 18) {
                                  if (var2_int == 19) {
                                    var7 = (java.awt.datatransfer.Transferable) var8_ref.field_e;
                                    var17 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var17.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L8;
                                  } else {
                                    if (((vh) this).field_d) {
                                      if (var2_int == 3) {
                                        if (km.b(-1) >= field_s) {
                                          var16 = (255 & var8_ref.field_b >> 24) + "." + (var8_ref.field_b >> 16 & 255) + "." + ((65334 & var8_ref.field_b) >> 8) + "." + (255 & var8_ref.field_b);
                                          var8_ref.field_d = (Object) (Object) java.net.InetAddress.getByName(var16).getHostName();
                                          break L8;
                                        } else {
                                          throw new IOException();
                                        }
                                      } else {
                                        if (var2_int == 21) {
                                          if (km.b(-1) < field_s) {
                                            throw new IOException();
                                          } else {
                                            var8_ref.field_d = (Object) (Object) java.net.InetAddress.getByName((String) var8_ref.field_e).getAddress();
                                            break L8;
                                          }
                                        } else {
                                          if (var2_int != 5) {
                                            if (var2_int != 6) {
                                              if (var2_int == 7) {
                                                if (((vh) this).field_o) {
                                                  ((vh) this).field_a.a((byte) -102, (java.awt.Frame) var8_ref.field_e);
                                                  break L8;
                                                } else {
                                                  Object discarded$6 = Class.forName("fl").getMethod("exit", new Class[0]).invoke(((vh) this).field_x, new Object[0]);
                                                  break L8;
                                                }
                                              } else {
                                                if (var2_int == 12) {
                                                  var3_ref3 = vh.a(field_r, (String) var8_ref.field_e, field_f, (byte) 95);
                                                  var8_ref.field_d = (Object) (Object) var3_ref3;
                                                  break L8;
                                                } else {
                                                  if (var2_int != 13) {
                                                    L11: {
                                                      if (!((vh) this).field_d) {
                                                        break L11;
                                                      } else {
                                                        if (var2_int == 14) {
                                                          var3_int = var8_ref.field_b;
                                                          var4 = var8_ref.field_c;
                                                          if (!((vh) this).field_o) {
                                                            Object discarded$7 = Class.forName("ve").getDeclaredMethod("movemouse", new Class[2]).invoke(((vh) this).field_e, new Object[2]);
                                                            break L8;
                                                          } else {
                                                            ((vh) this).field_b.a(var4, var3_int, -85);
                                                            break L8;
                                                          }
                                                        } else {
                                                          break L11;
                                                        }
                                                      }
                                                    }
                                                    L12: {
                                                      if (!((vh) this).field_d) {
                                                        break L12;
                                                      } else {
                                                        if (var2_int == 15) {
                                                          L13: {
                                                            if (0 == var8_ref.field_b) {
                                                              stackOut_78_0 = 0;
                                                              stackIn_79_0 = stackOut_78_0;
                                                              break L13;
                                                            } else {
                                                              stackOut_77_0 = 1;
                                                              stackIn_79_0 = stackOut_77_0;
                                                              break L13;
                                                            }
                                                          }
                                                          var3_int = stackIn_79_0;
                                                          var15 = (java.awt.Component) var8_ref.field_e;
                                                          if (((vh) this).field_o) {
                                                            ((vh) this).field_b.a(var3_int != 0, (byte) 84, var15);
                                                            break L8;
                                                          } else {
                                                            Object discarded$8 = Class.forName("ve").getDeclaredMethod("showcursor", new Class[2]).invoke(((vh) this).field_e, new Object[2]);
                                                            break L8;
                                                          }
                                                        } else {
                                                          break L12;
                                                        }
                                                      }
                                                    }
                                                    L14: {
                                                      if (((vh) this).field_o) {
                                                        break L14;
                                                      } else {
                                                        if (var2_int != 17) {
                                                          break L14;
                                                        } else {
                                                          var13 = (Object[]) var8_ref.field_e;
                                                          Object discarded$9 = Class.forName("ve").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((vh) this).field_e, new Object[5]);
                                                          break L8;
                                                        }
                                                      }
                                                    }
                                                    if (var2_int != 16) {
                                                      throw vh.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    } else {
                                                      try {
                                                        L15: {
                                                          if (field_i.startsWith("win")) {
                                                            L16: {
                                                              var14 = (String) var8_ref.field_e;
                                                              if (var14.startsWith("http://")) {
                                                                break L16;
                                                              } else {
                                                                if (!var14.startsWith("https://")) {
                                                                  throw vh.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  break L16;
                                                                }
                                                              }
                                                            }
                                                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L17: while (true) {
                                                              if (~var14.length() >= ~var5) {
                                                                Process discarded$10 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var14 + "\"");
                                                                var8_ref.field_d = null;
                                                                break L15;
                                                              } else {
                                                                if (var4_ref_String.indexOf((int) var14.charAt(var5)) == -1) {
                                                                  throw vh.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  var5++;
                                                                  continue L17;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            throw vh.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                                                        decompiledCaughtException = decompiledCaughtParameter2;
                                                        var3_ref = (Exception) (Object) decompiledCaughtException;
                                                        var8_ref.field_d = (Object) (Object) var3_ref;
                                                        throw vh.<RuntimeException>$cfr$sneakyThrow(var3_ref);
                                                      }
                                                      break L8;
                                                    }
                                                  } else {
                                                    var3_ref3 = vh.a("", (String) var8_ref.field_e, field_f, (byte) 101);
                                                    var8_ref.field_d = (Object) (Object) var3_ref3;
                                                    break L8;
                                                  }
                                                }
                                              }
                                            } else {
                                              var12 = new java.awt.Frame("Jagex Full Screen");
                                              var8_ref.field_d = (Object) (Object) var12;
                                              var12.setResizable(false);
                                              if (((vh) this).field_o) {
                                                ((vh) this).field_a.a(var8_ref.field_c & 65535, var8_ref.field_b >>> 16, var12, var8_ref.field_b & 65535, -4013, var8_ref.field_c >> 16);
                                                break L8;
                                              } else {
                                                Object discarded$11 = Class.forName("fl").getMethod("enter", new Class[5]).invoke(((vh) this).field_x, new Object[5]);
                                                break L8;
                                              }
                                            }
                                          } else {
                                            if (!((vh) this).field_o) {
                                              var8_ref.field_d = Class.forName("fl").getMethod("listmodes", new Class[0]).invoke(((vh) this).field_x, new Object[0]);
                                              break L8;
                                            } else {
                                              var8_ref.field_d = (Object) (Object) ((vh) this).field_a.a(3152);
                                              break L8;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      throw vh.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    }
                                  }
                                } else {
                                  var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8_ref.field_d = (Object) (Object) var11.getContents((Object) null);
                                  break L8;
                                }
                              }
                            } else {
                              L18: {
                                var10 = (Object[]) var8_ref.field_e;
                                if (((vh) this).field_d) {
                                  if (((Class) var10[0]).getClassLoader() == null) {
                                    throw new SecurityException();
                                  } else {
                                    break L18;
                                  }
                                } else {
                                  break L18;
                                }
                              }
                              var8_ref.field_d = (Object) (Object) ((Class) var10[0]).getDeclaredMethod((String) var10[1], (Class[]) var10[2]);
                              break L8;
                            }
                          }
                        } else {
                          var9 = new Thread((Runnable) var8_ref.field_e);
                          var9.setDaemon(true);
                          var9.start();
                          var9.setPriority(var8_ref.field_b);
                          var8_ref.field_d = (Object) (Object) var9;
                          break L8;
                        }
                      }
                    } else {
                      if (field_s <= km.b(-1)) {
                        var8_ref.field_d = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var8_ref.field_e), var8_ref.field_b);
                        break L8;
                      } else {
                        throw new IOException();
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

    private final rc a(int param0, int param1, Object param2, int param3, byte param4) {
        rc var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Object stackIn_6_0 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        var6 = new rc();
        var6.field_c = param3;
        var6.field_b = param0;
        var6.field_g = param1;
        var6.field_e = param2;
        var7 = this;
        synchronized (var7) {
          L0: {
            L1: {
              if (null != ((vh) this).field_g) {
                ((vh) this).field_g.field_f = var6;
                ((vh) this).field_g = var6;
                break L1;
              } else {
                ((vh) this).field_m = var6;
                ((vh) this).field_g = var6;
                break L1;
              }
            }
            if (param4 <= -99) {
              this.notify();
              break L0;
            } else {
              stackOut_5_0 = null;
              stackIn_6_0 = stackOut_5_0;
              return (rc) (Object) stackIn_6_0;
            }
          }
        }
        return var6;
    }

    private final static ue a(String param0, String param1, int param2, byte param3) {
        try {
            String var7_ref = null;
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            Object var7 = null;
            Exception var8 = null;
            ue var8_ref = null;
            ue stackIn_14_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            ue stackOut_13_0 = null;
            var7_ref = null;
            if (param3 >= 77) {
              L0: {
                if (param2 != 33) {
                  if (param2 != 34) {
                    var4 = "jagex_" + param0 + "_preferences" + param1 + ".dat";
                    break L0;
                  } else {
                    var4 = "jagex_" + param0 + "_preferences" + param1 + "_wip.dat";
                    break L0;
                  }
                } else {
                  var4 = "jagex_" + param0 + "_preferences" + param1 + "_rc.dat";
                  break L0;
                }
              }
              var5_array = new String[]{"c:/rscache/", "/rscache/", field_q, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
              var6 = 0;
              L1: while (true) {
                if (var6 < var5_array.length) {
                  L2: {
                    var7_ref = var5_array[var6];
                    if (var7_ref.length() <= 0) {
                      break L2;
                    } else {
                      if (new File(var7_ref).exists()) {
                        break L2;
                      } else {
                        var6++;
                        continue L1;
                      }
                    }
                  }
                  try {
                    L3: {
                      var8_ref = new ue(new File(var7_ref, var4), "rw", 10000L);
                      stackOut_13_0 = (ue) var8_ref;
                      stackIn_14_0 = stackOut_13_0;
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
                    return stackIn_14_0;
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

    final rc a(Class param0, boolean param1, String param2) {
        if (!param1) {
            ((vh) this).run();
        }
        return this.a(0, 9, (Object) (Object) new Object[2], 0, (byte) -108);
    }

    final rc a(String param0, int param1, int param2) {
        if (param2 >= -58) {
            field_q = null;
        }
        int discarded$0 = -96;
        return this.a(false, param0, param1);
    }

    final rc a(boolean param0, java.awt.Frame param1) {
        if (param0) {
            Object var4 = null;
            rc discarded$0 = ((vh) this).a(3, (java.net.URL) null);
        }
        return this.a(0, 7, (Object) (Object) param1, 0, (byte) -110);
    }

    final rc a(int param0) {
        int var2 = 13 / ((param0 - -26) / 60);
        return this.a(0, 5, (Object) null, 0, (byte) -125);
    }

    vh(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        an var7 = null;
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
          ((vh) this).field_n = null;
          ((vh) this).field_o = false;
          ((vh) this).field_g = null;
          ((vh) this).field_m = null;
          ((vh) this).field_c = null;
          ((vh) this).field_t = null;
          ((vh) this).field_l = false;
          ((vh) this).field_d = false;
          field_f = param0;
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
        ((vh) this).field_d = stackIn_3_1 != 0;
        field_r = param1;
        field_v = "1.1";
        field_u = "Unknown";
        try {
          L1: {
            field_u = System.getProperty("java.vendor");
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
          if (-1 != field_u.toLowerCase().indexOf("microsoft")) {
            ((vh) this).field_o = true;
            break L3;
          } else {
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
        field_i = field_h.toLowerCase();
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
              field_q = System.getProperty("user.home");
              if (null == field_q) {
                break L11;
              } else {
                field_q = field_q + "/";
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
          if (null == field_q) {
            field_q = "~/";
            break L13;
          } else {
            break L13;
          }
        }
        try {
          L14: {
            ((vh) this).field_p = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
          if (!((vh) this).field_o) {
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
                field_j = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
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
          f.a((byte) 32, field_r, field_f);
          if (!((vh) this).field_d) {
            break L21;
          } else {
            ((vh) this).field_c = new ue(f.a(-31192, "random.dat", (String) null, field_f), "rw", 25L);
            ((vh) this).field_t = new ue(f.a(-3455, "main_file_cache.dat2"), "rw", 314572800L);
            ((vh) this).field_n = new ue(f.a(-3455, "main_file_cache.idx255"), "rw", 1048576L);
            ((vh) this).field_w = new ue[param2];
            var5_int = 0;
            L22: while (true) {
              if (param2 <= var5_int) {
                L23: {
                  if (!((vh) this).field_o) {
                    break L23;
                  } else {
                    try {
                      L24: {
                        Object discarded$7 = Class.forName("ic").newInstance();
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
                      if (((vh) this).field_o) {
                        var7 = new an();
                        ((vh) this).field_a = var7;
                        break L27;
                      } else {
                        ((vh) this).field_x = Class.forName("fl").newInstance();
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
                      if (((vh) this).field_o) {
                        ((vh) this).field_b = new kd();
                        break L30;
                      } else {
                        ((vh) this).field_e = Class.forName("ve").newInstance();
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
                ((vh) this).field_w[var5_int] = new ue(f.a(-3455, "main_file_cache.idx" + var5_int), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        ((vh) this).field_l = false;
        ((vh) this).field_k = new Thread((Runnable) this);
        ((vh) this).field_k.setPriority(10);
        ((vh) this).field_k.setDaemon(true);
        ((vh) this).field_k.start();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
