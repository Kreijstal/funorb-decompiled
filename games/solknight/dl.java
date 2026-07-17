/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class dl implements Runnable {
    static String field_a;
    sg field_b;
    sg field_c;
    private vj field_u;
    private nj field_m;
    private static String field_i;
    private boolean field_l;
    private static int field_o;
    private static String field_n;
    static String field_t;
    java.awt.EventQueue field_d;
    boolean field_h;
    private static volatile long field_p;
    sg[] field_v;
    private static String field_f;
    private Object field_r;
    static String field_x;
    private boolean field_k;
    private nj field_w;
    private tb field_g;
    static java.lang.reflect.Method field_e;
    private Object field_j;
    sg field_s;
    private Thread field_q;

    final void a(byte param0) {
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
                  ((dl) this).field_l = true;
                  if (param0 == 29) {
                    break L1;
                  } else {
                    ((dl) this).field_d = null;
                    break L1;
                  }
                }
                this.notifyAll();
                break L0;
              }
            }
            try {
              L2: {
                ((dl) this).field_q.join();
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
              if (null != ((dl) this).field_c) {
                {
                  L5: {
                    ((dl) this).field_c.a((byte) -5);
                    break L5;
                  }
                }
                break L4;
              } else {
                break L4;
              }
            }
            L7: {
              if (((dl) this).field_s == null) {
                break L7;
              } else {
                {
                  L8: {
                    ((dl) this).field_s.a((byte) -123);
                    break L8;
                  }
                }
                break L7;
              }
            }
            L10: {
              if (null != ((dl) this).field_v) {
                var2_int = 0;
                L11: while (true) {
                  if (var2_int >= ((dl) this).field_v.length) {
                    break L10;
                  } else {
                    if (null != ((dl) this).field_v[var2_int]) {
                      {
                        L12: {
                          ((dl) this).field_v[var2_int].a((byte) 53);
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
              if (null == ((dl) this).field_b) {
                break L14;
              } else {
                {
                  L15: {
                    ((dl) this).field_b.a((byte) -124);
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

    private final nj a(int param0, boolean param1, String param2, int param3) {
        int var5 = 0;
        return this.a(0, (Object) (Object) param2, param3, 1, -19);
    }

    final nj a(int param0, int param1, int param2, byte param3, int param4) {
        if (param3 >= 0) {
            field_o = -61;
        }
        return this.a((param2 << 16) + param4, (Object) null, param1 + (param0 << 16), 6, -19);
    }

    final nj a(java.net.URL param0, byte param1) {
        if (param1 != 68) {
            return null;
        }
        return this.a(0, (Object) (Object) param0, 0, 4, -19);
    }

    final nj a(byte param0, String param1, Class[] param2, Class param3) {
        if (param0 <= 93) {
            return null;
        }
        return this.a(0, (Object) (Object) new Object[3], 0, 8, -19);
    }

    final nj a(int param0) {
        if (param0 != 7721) {
            nj discarded$0 = ((dl) this).a(65);
        }
        return this.a(0, (Object) null, 0, 5, param0 + -7740);
    }

    private final nj a(int param0, Object param1, int param2, int param3, int param4) {
        nj var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        var6 = new nj();
        var6.field_a = param3;
        var6.field_d = param2;
        var6.field_f = param1;
        if (param4 == -19) {
          var6.field_b = param0;
          var7 = this;
          synchronized (var7) {
            L0: {
              L1: {
                if (null != ((dl) this).field_m) {
                  ((dl) this).field_m.field_g = var6;
                  ((dl) this).field_m = var6;
                  break L1;
                } else {
                  ((dl) this).field_w = var6;
                  ((dl) this).field_m = var6;
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

    final nj a(String param0, int param1, int param2) {
        if (param2 != -28148) {
            return null;
        }
        return this.a(109, false, param0, param1);
    }

    final nj a(int param0, java.awt.Frame param1) {
        if (param0 <= 12) {
            return null;
        }
        return this.a(0, (Object) (Object) param1, 0, 7, -19);
    }

    private final static sg a(int param0, String param1, int param2, String param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            sg var8_ref = null;
            sg stackIn_15_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            sg stackOut_14_0 = null;
            L0: {
              if (param2 != 33) {
                if (34 != param2) {
                  var4 = "jagex_" + param1 + "_preferences" + param3 + ".dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param1 + "_preferences" + param3 + "_wip.dat";
                  break L0;
                }
              } else {
                var4 = "jagex_" + param1 + "_preferences" + param3 + "_rc.dat";
                break L0;
              }
            }
            var5_array = new String[]{"c:/rscache/", "/rscache/", field_n, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            if (param0 > 34) {
              var6 = 0;
              L1: while (true) {
                if (var6 < var5_array.length) {
                  L2: {
                    var7 = var5_array[var6];
                    if (0 >= var7.length()) {
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
                      var8_ref = new sg(new File(var7, var4), "rw", 10000L);
                      stackOut_14_0 = (sg) var8_ref;
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

    final nj a(int param0, int param1, Runnable param2) {
        if (param1 > -2) {
            return null;
        }
        return this.a(0, (Object) (Object) param2, param0, 2, -19);
    }

    final nj a(int param0, Class param1, String param2) {
        if (param0 != 0) {
            boolean discarded$0 = ((dl) this).b((byte) -96);
        }
        return this.a(0, (Object) (Object) new Object[2], 0, 9, -19);
    }

    public final void run() {
        try {
            Throwable var2 = null;
            Object var2_ref = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            cb var3_ref = null;
            Exception var3_ref2 = null;
            sg var3_ref3 = null;
            int var3_int = 0;
            Throwable var4 = null;
            int var4_int = 0;
            String var4_ref = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            Object var8 = null;
            nj var8_ref = null;
            Thread var9 = null;
            Object[] var10 = null;
            Object[] var11 = null;
            java.awt.datatransfer.Clipboard var12 = null;
            String var13 = null;
            java.awt.Frame var14 = null;
            java.awt.Component var15 = null;
            Object[] var16 = null;
            Object var17 = null;
            String var17_ref = null;
            java.awt.datatransfer.Clipboard var18 = null;
            int stackIn_73_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_72_0 = 0;
            int stackOut_71_0 = 0;
            var17 = null;
            L0: while (true) {
              var2_ref = this;
              synchronized (var2_ref) {
                L1: {
                  L2: while (true) {
                    if (!((dl) this).field_l) {
                      if (((dl) this).field_w != null) {
                        L3: {
                          var8_ref = ((dl) this).field_w;
                          ((dl) this).field_w = ((dl) this).field_w.field_g;
                          if (((dl) this).field_w == null) {
                            ((dl) this).field_m = null;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        break L1;
                      } else {
                        {
                          L4: {
                            this.wait();
                            break L4;
                          }
                        }
                        continue L2;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
              try {
                L6: {
                  L7: {
                    var2_int = var8_ref.field_a;
                    if (var2_int == 1) {
                      if (~field_p >= ~je.a(1)) {
                        var8_ref.field_e = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var8_ref.field_f), var8_ref.field_d);
                        break L7;
                      } else {
                        throw new IOException();
                      }
                    } else {
                      if (var2_int != 22) {
                        if (2 != var2_int) {
                          if (4 != var2_int) {
                            if (8 != var2_int) {
                              if (var2_int != 9) {
                                if (var2_int == 18) {
                                  var18 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8_ref.field_e = (Object) (Object) var18.getContents((Object) null);
                                  break L7;
                                } else {
                                  if (var2_int != 19) {
                                    if (!((dl) this).field_h) {
                                      throw dl.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    } else {
                                      if (var2_int != 3) {
                                        if (var2_int != 21) {
                                          if (5 == var2_int) {
                                            if (!((dl) this).field_k) {
                                              var8_ref.field_e = Class.forName("bd").getMethod("listmodes", new Class[0]).invoke(((dl) this).field_j, new Object[0]);
                                              break L7;
                                            } else {
                                              var8_ref.field_e = (Object) (Object) ((dl) this).field_u.a((byte) -63);
                                              break L7;
                                            }
                                          } else {
                                            if (var2_int != 6) {
                                              if (7 == var2_int) {
                                                if (((dl) this).field_k) {
                                                  ((dl) this).field_u.a(-16, (java.awt.Frame) var8_ref.field_f);
                                                  break L7;
                                                } else {
                                                  Object discarded$7 = Class.forName("bd").getMethod("exit", new Class[0]).invoke(((dl) this).field_j, new Object[0]);
                                                  break L7;
                                                }
                                              } else {
                                                if (12 == var2_int) {
                                                  var3_ref3 = dl.a(92, field_i, field_o, (String) var8_ref.field_f);
                                                  var8_ref.field_e = (Object) (Object) var3_ref3;
                                                  break L7;
                                                } else {
                                                  if (var2_int == 13) {
                                                    var3_ref3 = dl.a(93, "", field_o, (String) var8_ref.field_f);
                                                    var8_ref.field_e = (Object) (Object) var3_ref3;
                                                    break L7;
                                                  } else {
                                                    L8: {
                                                      if (!((dl) this).field_h) {
                                                        break L8;
                                                      } else {
                                                        if (var2_int != 14) {
                                                          break L8;
                                                        } else {
                                                          var3_int = var8_ref.field_d;
                                                          var4_int = var8_ref.field_b;
                                                          if (((dl) this).field_k) {
                                                            ((dl) this).field_g.a(var3_int, var4_int, 0);
                                                            break L7;
                                                          } else {
                                                            Object discarded$8 = Class.forName("cc").getDeclaredMethod("movemouse", new Class[2]).invoke(((dl) this).field_r, new Object[2]);
                                                            break L7;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L9: {
                                                      if (!((dl) this).field_h) {
                                                        break L9;
                                                      } else {
                                                        if (15 != var2_int) {
                                                          break L9;
                                                        } else {
                                                          L10: {
                                                            if (0 == var8_ref.field_d) {
                                                              stackOut_72_0 = 0;
                                                              stackIn_73_0 = stackOut_72_0;
                                                              break L10;
                                                            } else {
                                                              stackOut_71_0 = 1;
                                                              stackIn_73_0 = stackOut_71_0;
                                                              break L10;
                                                            }
                                                          }
                                                          var3_int = stackIn_73_0;
                                                          var15 = (java.awt.Component) var8_ref.field_f;
                                                          if (((dl) this).field_k) {
                                                            ((dl) this).field_g.a(var3_int != 0, var15, (byte) -55);
                                                            break L7;
                                                          } else {
                                                            Object discarded$9 = Class.forName("cc").getDeclaredMethod("showcursor", new Class[2]).invoke(((dl) this).field_r, new Object[2]);
                                                            break L7;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L11: {
                                                      if (((dl) this).field_k) {
                                                        break L11;
                                                      } else {
                                                        if (var2_int != 17) {
                                                          break L11;
                                                        } else {
                                                          var16 = (Object[]) var8_ref.field_f;
                                                          Object discarded$10 = Class.forName("cc").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((dl) this).field_r, new Object[5]);
                                                          break L7;
                                                        }
                                                      }
                                                    }
                                                    if (var2_int == 16) {
                                                      try {
                                                        L12: {
                                                          if (field_t.startsWith("win")) {
                                                            L13: {
                                                              var17_ref = (String) var8_ref.field_f;
                                                              if (var17_ref.startsWith("http://")) {
                                                                break L13;
                                                              } else {
                                                                if (!var17_ref.startsWith("https://")) {
                                                                  throw dl.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  break L13;
                                                                }
                                                              }
                                                            }
                                                            var4_ref = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L14: while (true) {
                                                              if (~var17_ref.length() >= ~var5) {
                                                                Process discarded$11 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var17_ref + "\"");
                                                                var8_ref.field_e = null;
                                                                break L12;
                                                              } else {
                                                                if (-1 != var4_ref.indexOf((int) var17_ref.charAt(var5))) {
                                                                  var5++;
                                                                  continue L14;
                                                                } else {
                                                                  throw dl.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            throw dl.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter1) {
                                                        decompiledCaughtException = decompiledCaughtParameter1;
                                                        var3_ref2 = (Exception) (Object) decompiledCaughtException;
                                                        var8_ref.field_e = (Object) (Object) var3_ref2;
                                                        throw dl.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                                                      }
                                                      break L7;
                                                    } else {
                                                      throw dl.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              var14 = new java.awt.Frame("Jagex Full Screen");
                                              var8_ref.field_e = (Object) (Object) var14;
                                              var14.setResizable(false);
                                              if (((dl) this).field_k) {
                                                ((dl) this).field_u.a(65535 & var8_ref.field_b, var14, var8_ref.field_d >>> 16, -32, var8_ref.field_b >> 16, 65535 & var8_ref.field_d);
                                                break L7;
                                              } else {
                                                Object discarded$12 = Class.forName("bd").getMethod("enter", new Class[5]).invoke(((dl) this).field_j, new Object[5]);
                                                break L7;
                                              }
                                            }
                                          }
                                        } else {
                                          if (je.a(1) >= field_p) {
                                            var8_ref.field_e = (Object) (Object) java.net.InetAddress.getByName((String) var8_ref.field_f).getAddress();
                                            break L7;
                                          } else {
                                            throw new IOException();
                                          }
                                        }
                                      } else {
                                        if (~field_p >= ~je.a(1)) {
                                          var13 = (var8_ref.field_d >> 24 & 255) + "." + ((16723280 & var8_ref.field_d) >> 16) + "." + ((var8_ref.field_d & 65382) >> 8) + "." + (var8_ref.field_d & 255);
                                          var8_ref.field_e = (Object) (Object) java.net.InetAddress.getByName(var13).getHostName();
                                          break L7;
                                        } else {
                                          throw new IOException();
                                        }
                                      }
                                    }
                                  } else {
                                    var7 = (java.awt.datatransfer.Transferable) var8_ref.field_f;
                                    var12 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var12.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L7;
                                  }
                                }
                              } else {
                                L15: {
                                  var11 = (Object[]) var8_ref.field_f;
                                  if (((dl) this).field_h) {
                                    if (((Class) var11[0]).getClassLoader() != null) {
                                      break L15;
                                    } else {
                                      throw new SecurityException();
                                    }
                                  } else {
                                    break L15;
                                  }
                                }
                                var8_ref.field_e = (Object) (Object) ((Class) var11[0]).getDeclaredField((String) var11[1]);
                                break L7;
                              }
                            } else {
                              L16: {
                                var10 = (Object[]) var8_ref.field_f;
                                if (((dl) this).field_h) {
                                  if (null != ((Class) var10[0]).getClassLoader()) {
                                    break L16;
                                  } else {
                                    throw new SecurityException();
                                  }
                                } else {
                                  break L16;
                                }
                              }
                              var8_ref.field_e = (Object) (Object) ((Class) var10[0]).getDeclaredMethod((String) var10[1], (Class[]) var10[2]);
                              break L7;
                            }
                          } else {
                            if (je.a(1) >= field_p) {
                              var8_ref.field_e = (Object) (Object) new DataInputStream(((java.net.URL) var8_ref.field_f).openStream());
                              break L7;
                            } else {
                              throw new IOException();
                            }
                          }
                        } else {
                          var9 = new Thread((Runnable) var8_ref.field_f);
                          var9.setDaemon(true);
                          var9.start();
                          var9.setPriority(var8_ref.field_d);
                          var8_ref.field_e = (Object) (Object) var9;
                          break L7;
                        }
                      } else {
                        if (je.a(1) < field_p) {
                          throw new IOException();
                        } else {
                          try {
                            L17: {
                              int discarded$13 = 2525;
                              var8_ref.field_e = (Object) (Object) rg.a((String) var8_ref.field_f, var8_ref.field_d).a((byte) -93);
                              break L17;
                            }
                          } catch (java.lang.Exception decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref = (cb) (Object) decompiledCaughtException;
                            var8_ref.field_e = (Object) (Object) var3_ref.getMessage();
                            throw var3_ref;
                          }
                          break L7;
                        }
                      }
                    }
                  }
                  var8_ref.field_c = 1;
                  break L6;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                L18: {
                  var2 = decompiledCaughtException;
                  var8_ref.field_c = 2;
                  break L18;
                }
              }
              var2_ref = (Object) (Object) var8_ref;
              synchronized (var2_ref) {
                L19: {
                  ((Object) (Object) var8_ref).notify();
                  break L19;
                }
              }
              continue L0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean b(byte param0) {
        if (!(((dl) this).field_h)) {
            return false;
        }
        int var2 = -56 % ((-65 - param0) / 48);
        if (!((dl) this).field_k) {
            return ((dl) this).field_j != null ? true : false;
        }
        return null != ((dl) this).field_u ? true : false;
    }

    dl(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        vj var6 = null;
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
          ((dl) this).field_c = null;
          ((dl) this).field_b = null;
          ((dl) this).field_m = null;
          ((dl) this).field_k = false;
          ((dl) this).field_s = null;
          ((dl) this).field_w = null;
          ((dl) this).field_h = false;
          ((dl) this).field_l = false;
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
        ((dl) this).field_h = stackIn_3_1 != 0;
        field_x = "1.1";
        field_a = "Unknown";
        field_i = param1;
        field_o = param0;
        try {
          L1: {
            field_a = System.getProperty("java.vendor");
            field_x = System.getProperty("java.version");
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
          if (field_a.toLowerCase().indexOf("microsoft") != -1) {
            ((dl) this).field_k = true;
            break L3;
          } else {
            break L3;
          }
        }
        try {
          L4: {
            field_f = System.getProperty("os.name");
            break L4;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var5 = (Exception) (Object) decompiledCaughtException;
            field_f = "Unknown";
            break L5;
          }
        }
        field_t = field_f.toLowerCase();
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
              field_n = System.getProperty("user.home");
              if (field_n == null) {
                break L11;
              } else {
                field_n = field_n + "/";
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
          if (null != field_n) {
            break L13;
          } else {
            field_n = "~/";
            break L13;
          }
        }
        try {
          L14: {
            ((dl) this).field_d = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
          if (((dl) this).field_k) {
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
                field_e = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
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
          nd.a(field_i, field_o, (byte) -115);
          if (!((dl) this).field_h) {
            break L21;
          } else {
            ((dl) this).field_b = new sg(nd.a((String) null, "random.dat", field_o, (byte) -75), "rw", 25L);
            ((dl) this).field_c = new sg(nd.a("main_file_cache.dat2", -19154), "rw", 314572800L);
            ((dl) this).field_s = new sg(nd.a("main_file_cache.idx255", -19154), "rw", 1048576L);
            ((dl) this).field_v = new sg[param2];
            var5_int = 0;
            L22: while (true) {
              if (var5_int >= param2) {
                L23: {
                  if (!((dl) this).field_k) {
                    break L23;
                  } else {
                    try {
                      L24: {
                        Object discarded$7 = Class.forName("tf").newInstance();
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
                      if (((dl) this).field_k) {
                        var6 = new vj();
                        ((dl) this).field_u = var6;
                        break L27;
                      } else {
                        ((dl) this).field_j = Class.forName("bd").newInstance();
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
                      if (!((dl) this).field_k) {
                        ((dl) this).field_r = Class.forName("cc").newInstance();
                        break L30;
                      } else {
                        ((dl) this).field_g = new tb();
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
                ((dl) this).field_v[var5_int] = new sg(nd.a("main_file_cache.idx" + var5_int, -19154), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        ((dl) this).field_l = false;
        ((dl) this).field_q = new Thread((Runnable) this);
        ((dl) this).field_q.setPriority(10);
        ((dl) this).field_q.setDaemon(true);
        ((dl) this).field_q.start();
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
