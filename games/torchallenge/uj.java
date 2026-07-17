/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class uj implements Runnable {
    private Thread field_t;
    private Object field_v;
    static java.lang.reflect.Method field_o;
    private sb field_l;
    private ld field_b;
    private static String field_s;
    nd[] field_r;
    nd field_i;
    private boolean field_w;
    private static String field_c;
    private static String field_e;
    private static volatile long field_f;
    nd field_x;
    static String field_a;
    private mi field_m;
    java.awt.EventQueue field_p;
    static String field_n;
    static String field_j;
    private Object field_u;
    nd field_d;
    private boolean field_q;
    private mi field_k;
    private static int field_h;
    boolean field_g;

    private final mi a(int param0, int param1, int param2, Object param3) {
        mi var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        var6 = new mi();
        var6.field_a = param2;
        var6.field_c = param3;
        var6.field_f = param0;
        var6.field_b = param1;
        var7 = this;
        synchronized (var7) {
          L0: {
            L1: {
              if (null != ((uj) this).field_k) {
                ((uj) this).field_k.field_e = var6;
                ((uj) this).field_k = var6;
                break L1;
              } else {
                ((uj) this).field_m = var6;
                ((uj) this).field_k = var6;
                break L1;
              }
            }
            this.notify();
            break L0;
          }
        }
        return var6;
    }

    private final mi a(int param0, byte param1, String param2) {
        int var5 = -1;
        int discarded$0 = -27024;
        return this.a(1, 0, param0, (Object) (Object) param2);
    }

    final mi a(byte param0, String param1, Class param2) {
        if (param0 >= -121) {
            return null;
        }
        int discarded$0 = -27024;
        return this.a(9, 0, 0, (Object) (Object) new Object[2]);
    }

    final boolean a(byte param0) {
        if (param0 > -25) {
            ((uj) this).field_b = null;
        }
        if (!(((uj) this).field_g)) {
            return false;
        }
        if (((uj) this).field_q) {
            return ((uj) this).field_l != null ? true : false;
        }
        return ((uj) this).field_v != null ? true : false;
    }

    final mi a(int param0, java.awt.Frame param1) {
        if (param0 != -3816) {
            Object var4 = null;
            mi discarded$0 = ((uj) this).a((java.net.URL) null, 122);
        }
        int discarded$1 = -27024;
        return this.a(7, 0, 0, (Object) (Object) param1);
    }

    final mi a(java.net.URL param0, int param1) {
        if (param1 > -122) {
            field_f = 125L;
        }
        int discarded$0 = -27024;
        return this.a(4, 0, 0, (Object) (Object) param0);
    }

    final mi a(Runnable param0, boolean param1, int param2) {
        if (!param1) {
            ((uj) this).field_k = null;
        }
        int discarded$0 = -27024;
        return this.a(2, 0, param2, (Object) (Object) param0);
    }

    public final void run() {
        try {
            Object var2 = null;
            Throwable var2_ref = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            bj var3_ref = null;
            Exception var3_ref2 = null;
            nd var3_ref3 = null;
            int var3_int = 0;
            Throwable var4_ref_Throwable = null;
            int var4 = 0;
            String var4_ref_String = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            Object var8 = null;
            mi var8_ref = null;
            String var9 = null;
            java.awt.Component var10 = null;
            String var11 = null;
            Object[] var12 = null;
            java.awt.Frame var13 = null;
            java.awt.datatransfer.Clipboard var14 = null;
            java.awt.datatransfer.Clipboard var15 = null;
            Object[] var16 = null;
            Object[] var17 = null;
            Thread var18 = null;
            int stackIn_68_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_67_0 = 0;
            int stackOut_66_0 = 0;
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
                    if (((uj) this).field_w) {
                      return;
                    } else {
                      if (null != ((uj) this).field_m) {
                        L4: {
                          var8_ref = ((uj) this).field_m;
                          ((uj) this).field_m = ((uj) this).field_m.field_e;
                          if (((uj) this).field_m != null) {
                            break L4;
                          } else {
                            ((uj) this).field_k = null;
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
                    var2_int = var8_ref.field_f;
                    if (var2_int != 1) {
                      if (var2_int != 22) {
                        if (2 == var2_int) {
                          var18 = new Thread((Runnable) var8_ref.field_c);
                          var18.setDaemon(true);
                          var18.start();
                          var18.setPriority(var8_ref.field_a);
                          var8_ref.field_g = (Object) (Object) var18;
                          break L8;
                        } else {
                          if (var2_int != 4) {
                            if (8 == var2_int) {
                              L9: {
                                var17 = (Object[]) var8_ref.field_c;
                                if (!((uj) this).field_g) {
                                  break L9;
                                } else {
                                  if (null == ((Class) var17[0]).getClassLoader()) {
                                    throw new SecurityException();
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              var8_ref.field_g = (Object) (Object) ((Class) var17[0]).getDeclaredMethod((String) var17[1], (Class[]) var17[2]);
                              break L8;
                            } else {
                              if (var2_int == 9) {
                                L10: {
                                  var16 = (Object[]) var8_ref.field_c;
                                  if (!((uj) this).field_g) {
                                    break L10;
                                  } else {
                                    if (null != ((Class) var16[0]).getClassLoader()) {
                                      break L10;
                                    } else {
                                      throw new SecurityException();
                                    }
                                  }
                                }
                                var8_ref.field_g = (Object) (Object) ((Class) var16[0]).getDeclaredField((String) var16[1]);
                                break L8;
                              } else {
                                if (var2_int == 18) {
                                  var15 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8_ref.field_g = (Object) (Object) var15.getContents((Object) null);
                                  break L8;
                                } else {
                                  if (var2_int == 19) {
                                    var7 = (java.awt.datatransfer.Transferable) var8_ref.field_c;
                                    var14 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var14.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L8;
                                  } else {
                                    if (((uj) this).field_g) {
                                      if (var2_int != 3) {
                                        if (var2_int != 21) {
                                          if (var2_int != 5) {
                                            if (var2_int == 6) {
                                              var13 = new java.awt.Frame("Jagex Full Screen");
                                              var8_ref.field_g = (Object) (Object) var13;
                                              var13.setResizable(false);
                                              if (((uj) this).field_q) {
                                                ((uj) this).field_l.a(65535 & var8_ref.field_b, var8_ref.field_b >> 16, -16, var8_ref.field_a >>> 16, 65535 & var8_ref.field_a, var13);
                                                break L8;
                                              } else {
                                                Object discarded$7 = Class.forName("hg").getMethod("enter", new Class[5]).invoke(((uj) this).field_v, new Object[5]);
                                                break L8;
                                              }
                                            } else {
                                              if (var2_int != 7) {
                                                if (var2_int == 12) {
                                                  var3_ref3 = uj.a((String) var8_ref.field_c, field_c, field_h, (byte) 106);
                                                  var8_ref.field_g = (Object) (Object) var3_ref3;
                                                  break L8;
                                                } else {
                                                  if (var2_int != 13) {
                                                    L11: {
                                                      if (!((uj) this).field_g) {
                                                        break L11;
                                                      } else {
                                                        if (var2_int == 14) {
                                                          var3_int = var8_ref.field_a;
                                                          var4 = var8_ref.field_b;
                                                          if (((uj) this).field_q) {
                                                            ((uj) this).field_b.a(var3_int, -86, var4);
                                                            break L8;
                                                          } else {
                                                            Object discarded$8 = Class.forName("jg").getDeclaredMethod("movemouse", new Class[2]).invoke(((uj) this).field_u, new Object[2]);
                                                            break L8;
                                                          }
                                                        } else {
                                                          break L11;
                                                        }
                                                      }
                                                    }
                                                    L12: {
                                                      if (!((uj) this).field_g) {
                                                        break L12;
                                                      } else {
                                                        if (var2_int != 15) {
                                                          break L12;
                                                        } else {
                                                          L13: {
                                                            if (var8_ref.field_a == 0) {
                                                              stackOut_67_0 = 0;
                                                              stackIn_68_0 = stackOut_67_0;
                                                              break L13;
                                                            } else {
                                                              stackOut_66_0 = 1;
                                                              stackIn_68_0 = stackOut_66_0;
                                                              break L13;
                                                            }
                                                          }
                                                          var3_int = stackIn_68_0;
                                                          var10 = (java.awt.Component) var8_ref.field_c;
                                                          if (!((uj) this).field_q) {
                                                            Object discarded$9 = Class.forName("jg").getDeclaredMethod("showcursor", new Class[2]).invoke(((uj) this).field_u, new Object[2]);
                                                            break L8;
                                                          } else {
                                                            ((uj) this).field_b.a(var10, var3_int != 0, 0);
                                                            break L8;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L14: {
                                                      if (((uj) this).field_q) {
                                                        break L14;
                                                      } else {
                                                        if (var2_int == 17) {
                                                          var12 = (Object[]) var8_ref.field_c;
                                                          Object discarded$10 = Class.forName("jg").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((uj) this).field_u, new Object[5]);
                                                          break L8;
                                                        } else {
                                                          break L14;
                                                        }
                                                      }
                                                    }
                                                    if (var2_int == 16) {
                                                      try {
                                                        L15: {
                                                          if (field_a.startsWith("win")) {
                                                            L16: {
                                                              var11 = (String) var8_ref.field_c;
                                                              if (var11.startsWith("http://")) {
                                                                break L16;
                                                              } else {
                                                                if (!var11.startsWith("https://")) {
                                                                  throw uj.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  break L16;
                                                                }
                                                              }
                                                            }
                                                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L17: while (true) {
                                                              if (var5 >= var11.length()) {
                                                                Process discarded$11 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var11 + "\"");
                                                                var8_ref.field_g = null;
                                                                break L15;
                                                              } else {
                                                                if (var4_ref_String.indexOf((int) var11.charAt(var5)) == -1) {
                                                                  throw uj.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  var5++;
                                                                  continue L17;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            throw uj.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter1) {
                                                        decompiledCaughtException = decompiledCaughtParameter1;
                                                        var3_ref2 = (Exception) (Object) decompiledCaughtException;
                                                        var8_ref.field_g = (Object) (Object) var3_ref2;
                                                        throw uj.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                                                      }
                                                      break L8;
                                                    } else {
                                                      throw uj.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    }
                                                  } else {
                                                    var3_ref3 = uj.a((String) var8_ref.field_c, "", field_h, (byte) -97);
                                                    var8_ref.field_g = (Object) (Object) var3_ref3;
                                                    break L8;
                                                  }
                                                }
                                              } else {
                                                if (((uj) this).field_q) {
                                                  ((uj) this).field_l.a(false, (java.awt.Frame) var8_ref.field_c);
                                                  break L8;
                                                } else {
                                                  Object discarded$12 = Class.forName("hg").getMethod("exit", new Class[0]).invoke(((uj) this).field_v, new Object[0]);
                                                  break L8;
                                                }
                                              }
                                            }
                                          } else {
                                            if (((uj) this).field_q) {
                                              var8_ref.field_g = (Object) (Object) ((uj) this).field_l.a(-27469);
                                              break L8;
                                            } else {
                                              var8_ref.field_g = Class.forName("hg").getMethod("listmodes", new Class[0]).invoke(((uj) this).field_v, new Object[0]);
                                              break L8;
                                            }
                                          }
                                        } else {
                                          if (field_f <= ol.a(256)) {
                                            var8_ref.field_g = (Object) (Object) java.net.InetAddress.getByName((String) var8_ref.field_c).getAddress();
                                            break L8;
                                          } else {
                                            throw new IOException();
                                          }
                                        }
                                      } else {
                                        if (~field_f < ~ol.a(256)) {
                                          throw new IOException();
                                        } else {
                                          var9 = (255 & var8_ref.field_a >> 24) + "." + ((var8_ref.field_a & 16725364) >> 16) + "." + ((var8_ref.field_a & 65373) >> 8) + "." + (var8_ref.field_a & 255);
                                          var8_ref.field_g = (Object) (Object) java.net.InetAddress.getByName(var9).getHostName();
                                          break L8;
                                        }
                                      }
                                    } else {
                                      throw uj.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            if (ol.a(256) < field_f) {
                              throw new IOException();
                            } else {
                              var8_ref.field_g = (Object) (Object) new DataInputStream(((java.net.URL) var8_ref.field_c).openStream());
                              break L8;
                            }
                          }
                        }
                      } else {
                        if (field_f > ol.a(256)) {
                          throw new IOException();
                        } else {
                          try {
                            L18: {
                              int discarded$13 = -111;
                              var8_ref.field_g = (Object) (Object) pg.a(var8_ref.field_a, (String) var8_ref.field_c).a((byte) 112);
                              break L18;
                            }
                          } catch (java.lang.Exception decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref = (bj) (Object) decompiledCaughtException;
                            var8_ref.field_g = (Object) (Object) var3_ref.getMessage();
                            throw var3_ref;
                          }
                          break L8;
                        }
                      }
                    } else {
                      if (field_f <= ol.a(256)) {
                        var8_ref.field_g = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var8_ref.field_c), var8_ref.field_a);
                        break L8;
                      } else {
                        throw new IOException();
                      }
                    }
                  }
                  var8_ref.field_d = 1;
                  break L7;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                L19: {
                  var2_ref = decompiledCaughtException;
                  var8_ref.field_d = 2;
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

    final mi a(String param0, byte param1, Class[] param2, Class param3) {
        if (param1 <= 40) {
            return null;
        }
        int discarded$0 = -27024;
        return this.a(8, 0, 0, (Object) (Object) new Object[3]);
    }

    final mi a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 != -2) {
            field_h = 19;
        }
        int discarded$0 = -27024;
        return this.a(6, param3 + (param2 << 16), (param0 << 16) - -param1, (Object) null);
    }

    private final static nd a(String param0, String param1, int param2, byte param3) {
        try {
            String var4 = null;
            int var5 = 0;
            Object[] var6 = null;
            String[] var6_array = null;
            int var7 = 0;
            String var8 = null;
            Exception var9 = null;
            nd var9_ref = null;
            nd stackIn_12_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            nd stackOut_11_0 = null;
            L0: {
              var5 = -67 / ((param3 - -38) / 58);
              if (param2 == 33) {
                var4 = "jagex_" + param1 + "_preferences" + param0 + "_rc.dat";
                break L0;
              } else {
                if (param2 != 34) {
                  var4 = "jagex_" + param1 + "_preferences" + param0 + ".dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param1 + "_preferences" + param0 + "_wip.dat";
                  break L0;
                }
              }
            }
            var6_array = new String[]{"c:/rscache/", "/rscache/", field_s, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            var7 = 0;
            L1: while (true) {
              if (var7 < var6_array.length) {
                L2: {
                  var8 = var6_array[var7];
                  if (var8.length() <= 0) {
                    break L2;
                  } else {
                    if (new File(var8).exists()) {
                      break L2;
                    } else {
                      var7++;
                      continue L1;
                    }
                  }
                }
                try {
                  L3: {
                    var9_ref = new nd(new File(var8, var4), "rw", 10000L);
                    stackOut_11_0 = (nd) var9_ref;
                    stackIn_12_0 = stackOut_11_0;
                    decompiledRegionSelector0 = 0;
                    break L3;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var9 = (Exception) (Object) decompiledCaughtException;
                    var7++;
                    decompiledRegionSelector0 = 1;
                    break L4;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  return stackIn_12_0;
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
                ((uj) this).field_w = stackIn_4_1 != 0;
                this.notifyAll();
                break L0;
              }
            }
            try {
              L2: {
                ((uj) this).field_t.join();
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
              if (null != ((uj) this).field_x) {
                {
                  L5: {
                    ((uj) this).field_x.a((byte) 47);
                    break L5;
                  }
                }
                break L4;
              } else {
                break L4;
              }
            }
            L7: {
              if (null == ((uj) this).field_i) {
                break L7;
              } else {
                {
                  L8: {
                    ((uj) this).field_i.a((byte) 47);
                    break L8;
                  }
                }
                break L7;
              }
            }
            L10: {
              if (((uj) this).field_r == null) {
                break L10;
              } else {
                var2_int = 0;
                L11: while (true) {
                  if (var2_int >= ((uj) this).field_r.length) {
                    break L10;
                  } else {
                    if (((uj) this).field_r[var2_int] != null) {
                      {
                        L12: {
                          ((uj) this).field_r[var2_int].a((byte) 47);
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
              }
            }
            L14: {
              if (null != ((uj) this).field_d) {
                {
                  L15: {
                    ((uj) this).field_d.a((byte) 47);
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

    final mi a(int param0, String param1, int param2) {
        if (param2 != 431890200) {
            return null;
        }
        int discarded$0 = 0;
        return this.a(param0, (byte) 118, param1);
    }

    final mi a(int param0) {
        if (param0 != 5) {
            ((uj) this).field_q = true;
        }
        int discarded$0 = -27024;
        return this.a(5, 0, 0, (Object) null);
    }

    uj(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        sb var6 = null;
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
          ((uj) this).field_x = null;
          ((uj) this).field_i = null;
          ((uj) this).field_d = null;
          ((uj) this).field_w = false;
          ((uj) this).field_q = false;
          ((uj) this).field_k = null;
          ((uj) this).field_m = null;
          ((uj) this).field_g = false;
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
        ((uj) this).field_g = stackIn_3_1 != 0;
        field_j = "Unknown";
        field_c = param1;
        field_n = "1.1";
        field_h = param0;
        try {
          L1: {
            field_j = System.getProperty("java.vendor");
            field_n = System.getProperty("java.version");
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
          if (field_j.toLowerCase().indexOf("microsoft") == -1) {
            break L3;
          } else {
            ((uj) this).field_q = true;
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
        field_a = field_e.toLowerCase();
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
              field_s = System.getProperty("user.home");
              if (field_s == null) {
                break L11;
              } else {
                field_s = field_s + "/";
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
          if (field_s == null) {
            field_s = "~/";
            break L13;
          } else {
            break L13;
          }
        }
        try {
          L14: {
            ((uj) this).field_p = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
          if (((uj) this).field_q) {
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
                field_o = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
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
          va.a((byte) -117, field_h, field_c);
          if (!((uj) this).field_g) {
            break L21;
          } else {
            ((uj) this).field_d = new nd(va.a(field_h, -29755, (String) null, "random.dat"), "rw", 25L);
            ((uj) this).field_x = new nd(va.a("main_file_cache.dat2", (byte) 40), "rw", 314572800L);
            ((uj) this).field_i = new nd(va.a("main_file_cache.idx255", (byte) 40), "rw", 1048576L);
            ((uj) this).field_r = new nd[param2];
            var5_int = 0;
            L22: while (true) {
              if (param2 <= var5_int) {
                L23: {
                  if (!((uj) this).field_q) {
                    break L23;
                  } else {
                    try {
                      L24: {
                        Object discarded$7 = Class.forName("pj").newInstance();
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
                      if (((uj) this).field_q) {
                        var6 = new sb();
                        ((uj) this).field_l = var6;
                        break L27;
                      } else {
                        ((uj) this).field_v = Class.forName("hg").newInstance();
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
                      if (!((uj) this).field_q) {
                        ((uj) this).field_u = Class.forName("jg").newInstance();
                        break L30;
                      } else {
                        ((uj) this).field_b = new ld();
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
                ((uj) this).field_r[var5_int] = new nd(va.a("main_file_cache.idx" + var5_int, (byte) 40), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        ((uj) this).field_w = false;
        ((uj) this).field_t = new Thread((Runnable) this);
        ((uj) this).field_t.setPriority(10);
        ((uj) this).field_t.setDaemon(true);
        ((uj) this).field_t.start();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
