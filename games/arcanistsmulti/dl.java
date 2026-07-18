/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class dl implements Runnable {
    private og field_x;
    private static volatile long field_w;
    kb field_e;
    private ca field_m;
    private static String field_t;
    static String field_c;
    private Object field_k;
    private Object field_g;
    static String field_l;
    private boolean field_j;
    kb field_n;
    private static String field_i;
    kb field_q;
    private boolean field_v;
    kb[] field_d;
    private static String field_h;
    private t field_u;
    boolean field_p;
    static String field_s;
    private og field_b;
    private static int field_r;
    java.awt.EventQueue field_a;
    static java.lang.reflect.Method field_f;
    private Thread field_o;

    final og a(boolean param0, java.net.URL param1) {
        if (!param0) {
            ((dl) this).field_v = true;
        }
        return this.a(false, 4, 0, 0, (Object) (Object) param1);
    }

    private final static kb a(String param0, int param1, String param2, int param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            kb var8_ref = null;
            kb stackIn_12_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            kb stackOut_11_0 = null;
            L0: {
              if (param1 == 33) {
                var4 = "jagex_" + param2 + "_preferences" + param0 + "_rc.dat";
                break L0;
              } else {
                if (param1 == 34) {
                  var4 = "jagex_" + param2 + "_preferences" + param0 + "_wip.dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param2 + "_preferences" + param0 + ".dat";
                  break L0;
                }
              }
            }
            var5_array = new String[]{"c:/rscache/", "/rscache/", field_h, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
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
                    var8_ref = new kb(new File(var7, var4), "rw", 10000L);
                    stackOut_11_0 = (kb) var8_ref;
                    stackIn_12_0 = stackOut_11_0;
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

    final og b(int param0) {
        if (param0 != -27886) {
            Object var3 = null;
            og discarded$0 = ((dl) this).a(-93, true, (String) null);
        }
        return this.a(false, 5, 0, 0, (Object) null);
    }

    final og a(int param0, boolean param1, String param2) {
        if (!param1) {
            field_i = null;
        }
        return this.a(false, param2, (byte) 46, param0);
    }

    public final void run() {
        try {
            Object var2 = null;
            Throwable var2_ref = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            Exception var3_ref = null;
            hj var3_ref2 = null;
            kb var3_ref3 = null;
            int var3_int = 0;
            Throwable var4_ref_Throwable = null;
            int var4 = 0;
            String var4_ref_String = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            Object var8 = null;
            og var8_ref = null;
            Object[] var9 = null;
            String var10 = null;
            java.awt.Component var11 = null;
            String var12 = null;
            Object[] var13 = null;
            java.awt.Frame var14 = null;
            java.awt.datatransfer.Clipboard var15 = null;
            java.awt.datatransfer.Clipboard var16 = null;
            Object[] var17 = null;
            Thread var18 = null;
            int stackIn_55_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_54_0 = 0;
            int stackOut_53_0 = 0;
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
                    if (((dl) this).field_v) {
                      return;
                    } else {
                      if (((dl) this).field_x != null) {
                        L4: {
                          var8_ref = ((dl) this).field_x;
                          ((dl) this).field_x = ((dl) this).field_x.field_d;
                          if (((dl) this).field_x == null) {
                            ((dl) this).field_b = null;
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
                    var2_int = var8_ref.field_f;
                    if (var2_int == 1) {
                      if (~qj.b(-26572) <= ~field_w) {
                        var8_ref.field_g = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var8_ref.field_b), var8_ref.field_c);
                        break L8;
                      } else {
                        throw new IOException();
                      }
                    } else {
                      if (var2_int == 22) {
                        if (~qj.b(-26572) > ~field_w) {
                          throw new IOException();
                        } else {
                          try {
                            L9: {
                              var8_ref.field_g = (Object) (Object) ka.a((String) var8_ref.field_b, var8_ref.field_c, 0).b((byte) -128);
                              break L9;
                            }
                          } catch (java.lang.Exception decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref2 = (hj) (Object) decompiledCaughtException;
                            var8_ref.field_g = (Object) (Object) var3_ref2.getMessage();
                            throw var3_ref2;
                          }
                          break L8;
                        }
                      } else {
                        if (var2_int == 2) {
                          var18 = new Thread((Runnable) var8_ref.field_b);
                          var18.setDaemon(true);
                          var18.start();
                          var18.setPriority(var8_ref.field_c);
                          var8_ref.field_g = (Object) (Object) var18;
                          break L8;
                        } else {
                          if (4 != var2_int) {
                            if (var2_int == 8) {
                              L10: {
                                var17 = (Object[]) var8_ref.field_b;
                                if (((dl) this).field_p) {
                                  if (((Class) var17[0]).getClassLoader() != null) {
                                    break L10;
                                  } else {
                                    throw new SecurityException();
                                  }
                                } else {
                                  break L10;
                                }
                              }
                              var8_ref.field_g = (Object) (Object) ((Class) var17[0]).getDeclaredMethod((String) var17[1], (Class[]) var17[2]);
                              break L8;
                            } else {
                              if (var2_int != 9) {
                                if (var2_int == 18) {
                                  var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8_ref.field_g = (Object) (Object) var16.getContents((Object) null);
                                  break L8;
                                } else {
                                  if (var2_int == 19) {
                                    var7 = (java.awt.datatransfer.Transferable) var8_ref.field_b;
                                    var15 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var15.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L8;
                                  } else {
                                    if (!((dl) this).field_p) {
                                      throw dl.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    } else {
                                      if (var2_int != 3) {
                                        if (var2_int == 21) {
                                          if (field_w > qj.b(-26572)) {
                                            throw new IOException();
                                          } else {
                                            var8_ref.field_g = (Object) (Object) java.net.InetAddress.getByName((String) var8_ref.field_b).getAddress();
                                            break L8;
                                          }
                                        } else {
                                          if (var2_int != 5) {
                                            if (var2_int == 6) {
                                              var14 = new java.awt.Frame("Jagex Full Screen");
                                              var8_ref.field_g = (Object) (Object) var14;
                                              var14.setResizable(false);
                                              if (!((dl) this).field_j) {
                                                Object discarded$6 = Class.forName("vj").getMethod("enter", new Class[5]).invoke(((dl) this).field_g, new Object[5]);
                                                break L8;
                                              } else {
                                                ((dl) this).field_u.a(18, var8_ref.field_a >> 16, var8_ref.field_c & 65535, var14, var8_ref.field_c >>> 16, var8_ref.field_a & 65535);
                                                break L8;
                                              }
                                            } else {
                                              if (var2_int == 7) {
                                                if (!((dl) this).field_j) {
                                                  Object discarded$7 = Class.forName("vj").getMethod("exit", new Class[0]).invoke(((dl) this).field_g, new Object[0]);
                                                  break L8;
                                                } else {
                                                  ((dl) this).field_u.a((java.awt.Frame) var8_ref.field_b, (byte) 6);
                                                  break L8;
                                                }
                                              } else {
                                                if (var2_int == 12) {
                                                  var3_ref3 = dl.a((String) var8_ref.field_b, field_r, field_i, 10000);
                                                  var8_ref.field_g = (Object) (Object) var3_ref3;
                                                  break L8;
                                                } else {
                                                  if (13 == var2_int) {
                                                    var3_ref3 = dl.a((String) var8_ref.field_b, field_r, "", 10000);
                                                    var8_ref.field_g = (Object) (Object) var3_ref3;
                                                    break L8;
                                                  } else {
                                                    L11: {
                                                      if (!((dl) this).field_p) {
                                                        break L11;
                                                      } else {
                                                        if (var2_int == 14) {
                                                          var3_int = var8_ref.field_c;
                                                          var4 = var8_ref.field_a;
                                                          if (((dl) this).field_j) {
                                                            ((dl) this).field_m.a(26899, var4, var3_int);
                                                            break L8;
                                                          } else {
                                                            Object discarded$8 = Class.forName("fa").getDeclaredMethod("movemouse", new Class[2]).invoke(((dl) this).field_k, new Object[2]);
                                                            break L8;
                                                          }
                                                        } else {
                                                          break L11;
                                                        }
                                                      }
                                                    }
                                                    L12: {
                                                      if (!((dl) this).field_p) {
                                                        break L12;
                                                      } else {
                                                        if (var2_int != 15) {
                                                          break L12;
                                                        } else {
                                                          L13: {
                                                            if (var8_ref.field_c == 0) {
                                                              stackOut_54_0 = 0;
                                                              stackIn_55_0 = stackOut_54_0;
                                                              break L13;
                                                            } else {
                                                              stackOut_53_0 = 1;
                                                              stackIn_55_0 = stackOut_53_0;
                                                              break L13;
                                                            }
                                                          }
                                                          var3_int = stackIn_55_0;
                                                          var11 = (java.awt.Component) var8_ref.field_b;
                                                          if (!((dl) this).field_j) {
                                                            Object discarded$9 = Class.forName("fa").getDeclaredMethod("showcursor", new Class[2]).invoke(((dl) this).field_k, new Object[2]);
                                                            break L8;
                                                          } else {
                                                            ((dl) this).field_m.a(122, var11, var3_int != 0);
                                                            break L8;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L14: {
                                                      if (((dl) this).field_j) {
                                                        break L14;
                                                      } else {
                                                        if (var2_int == 17) {
                                                          var13 = (Object[]) var8_ref.field_b;
                                                          Object discarded$10 = Class.forName("fa").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((dl) this).field_k, new Object[5]);
                                                          break L8;
                                                        } else {
                                                          break L14;
                                                        }
                                                      }
                                                    }
                                                    if (var2_int == 16) {
                                                      try {
                                                        L15: {
                                                          if (field_s.startsWith("win")) {
                                                            L16: {
                                                              var12 = (String) var8_ref.field_b;
                                                              if (var12.startsWith("http://")) {
                                                                break L16;
                                                              } else {
                                                                if (!var12.startsWith("https://")) {
                                                                  throw dl.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  break L16;
                                                                }
                                                              }
                                                            }
                                                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L17: while (true) {
                                                              if (var12.length() <= var5) {
                                                                Process discarded$11 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var12 + "\"");
                                                                var8_ref.field_g = null;
                                                                break L15;
                                                              } else {
                                                                if (-1 != var4_ref_String.indexOf((int) var12.charAt(var5))) {
                                                                  var5++;
                                                                  continue L17;
                                                                } else {
                                                                  throw dl.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            throw dl.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                                                        decompiledCaughtException = decompiledCaughtParameter2;
                                                        var3_ref = (Exception) (Object) decompiledCaughtException;
                                                        var8_ref.field_g = (Object) (Object) var3_ref;
                                                        throw dl.<RuntimeException>$cfr$sneakyThrow(var3_ref);
                                                      }
                                                      break L8;
                                                    } else {
                                                      throw dl.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            if (!((dl) this).field_j) {
                                              var8_ref.field_g = Class.forName("vj").getMethod("listmodes", new Class[0]).invoke(((dl) this).field_g, new Object[0]);
                                              break L8;
                                            } else {
                                              var8_ref.field_g = (Object) (Object) ((dl) this).field_u.a(0);
                                              break L8;
                                            }
                                          }
                                        }
                                      } else {
                                        if (field_w <= qj.b(-26572)) {
                                          var10 = (var8_ref.field_c >> 24 & 255) + "." + ((var8_ref.field_c & 16726054) >> 16) + "." + ((65321 & var8_ref.field_c) >> 8) + "." + (var8_ref.field_c & 255);
                                          var8_ref.field_g = (Object) (Object) java.net.InetAddress.getByName(var10).getHostName();
                                          break L8;
                                        } else {
                                          throw new IOException();
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                L18: {
                                  var9 = (Object[]) var8_ref.field_b;
                                  if (!((dl) this).field_p) {
                                    break L18;
                                  } else {
                                    if (null == ((Class) var9[0]).getClassLoader()) {
                                      throw new SecurityException();
                                    } else {
                                      break L18;
                                    }
                                  }
                                }
                                var8_ref.field_g = (Object) (Object) ((Class) var9[0]).getDeclaredField((String) var9[1]);
                                break L8;
                              }
                            }
                          } else {
                            if (qj.b(-26572) >= field_w) {
                              var8_ref.field_g = (Object) (Object) new DataInputStream(((java.net.URL) var8_ref.field_b).openStream());
                              break L8;
                            } else {
                              throw new IOException();
                            }
                          }
                        }
                      }
                    }
                  }
                  var8_ref.field_e = 1;
                  break L7;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                L19: {
                  var2_ref = decompiledCaughtException;
                  var8_ref.field_e = 2;
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

    final og a(java.awt.Frame param0, int param1) {
        if (param1 != 6) {
            Object var4 = null;
            og discarded$0 = ((dl) this).a(-82, (String) null, (Class[]) null, (Class) null);
        }
        return this.a(false, 7, 0, 0, (Object) (Object) param0);
    }

    final void a(int param0) {
        try {
            Object var2_ref_Object = null;
            InterruptedException var2_ref_InterruptedException = null;
            IOException var2_ref_IOException = null;
            int var2 = 0;
            Throwable var3 = null;
            int var3_int = 0;
            IOException var3_ref = null;
            IOException var4 = null;
            Throwable decompiledCaughtException = null;
            var2_ref_Object = this;
            synchronized (var2_ref_Object) {
              L0: {
                ((dl) this).field_v = true;
                this.notifyAll();
                break L0;
              }
            }
            try {
              L1: {
                ((dl) this).field_o.join();
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var2_ref_InterruptedException = (InterruptedException) (Object) decompiledCaughtException;
                break L2;
              }
            }
            L3: {
              if (null == ((dl) this).field_q) {
                break L3;
              } else {
                {
                  L4: {
                    ((dl) this).field_q.c(-103);
                    break L4;
                  }
                }
                break L3;
              }
            }
            L6: {
              if (((dl) this).field_e == null) {
                break L6;
              } else {
                {
                  L7: {
                    ((dl) this).field_e.c(101);
                    break L7;
                  }
                }
                break L6;
              }
            }
            L9: {
              var2 = -36 % ((param0 - -60) / 54);
              if (((dl) this).field_d == null) {
                break L9;
              } else {
                var3_int = 0;
                L10: while (true) {
                  if (var3_int >= ((dl) this).field_d.length) {
                    break L9;
                  } else {
                    if (null != ((dl) this).field_d[var3_int]) {
                      {
                        L11: {
                          ((dl) this).field_d[var3_int].c(101);
                          var3_int++;
                          break L11;
                        }
                      }
                      continue L10;
                    } else {
                      var3_int++;
                      continue L10;
                    }
                  }
                }
              }
            }
            L13: {
              if (null == ((dl) this).field_n) {
                break L13;
              } else {
                {
                  L14: {
                    ((dl) this).field_n.c(-20);
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

    private final og a(boolean param0, String param1, byte param2, int param3) {
        return this.a(false, 1, 0, param3, (Object) (Object) param1);
    }

    private final og a(boolean param0, int param1, int param2, int param3, Object param4) {
        og var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        var6 = new og();
        var6.field_b = param4;
        var6.field_f = param1;
        var6.field_a = param2;
        var6.field_c = param3;
        var7 = this;
        synchronized (var7) {
          L0: {
            L1: {
              if (null == ((dl) this).field_b) {
                ((dl) this).field_x = var6;
                ((dl) this).field_b = var6;
                break L1;
              } else {
                ((dl) this).field_b.field_d = var6;
                ((dl) this).field_b = var6;
                break L1;
              }
            }
            this.notify();
            break L0;
          }
        }
        return var6;
    }

    final og a(byte param0, String param1, Class param2) {
        if (param0 != -95) {
            ((dl) this).field_d = null;
        }
        return this.a(false, 9, 0, 0, (Object) (Object) new Object[2]);
    }

    final og a(int param0, int param1, int param2, int param3, int param4) {
        if (param2 <= 94) {
            ((dl) this).field_j = true;
        }
        return this.a(false, 6, (param1 << 16) + param4, (param0 << 16) - -param3, (Object) null);
    }

    final boolean a(byte param0) {
        if (!((dl) this).field_p) {
            return false;
        }
        if (param0 != 46) {
            og discarded$0 = ((dl) this).b(53);
        }
        if (((dl) this).field_j) {
            return null != ((dl) this).field_u ? true : false;
        }
        return ((dl) this).field_g != null ? true : false;
    }

    final og a(int param0, String param1, Class[] param2, Class param3) {
        if (param0 != -30176) {
            field_l = null;
        }
        return this.a(false, 8, 0, 0, (Object) (Object) new Object[3]);
    }

    final og a(int param0, int param1, Runnable param2) {
        if (param0 < 121) {
            field_t = null;
        }
        return this.a(false, 2, 0, param1, (Object) (Object) param2);
    }

    dl(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        t var7 = null;
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
          ((dl) this).field_x = null;
          ((dl) this).field_j = false;
          ((dl) this).field_v = false;
          ((dl) this).field_q = null;
          ((dl) this).field_e = null;
          ((dl) this).field_n = null;
          ((dl) this).field_b = null;
          ((dl) this).field_p = false;
          field_l = "Unknown";
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
        ((dl) this).field_p = stackIn_3_1 != 0;
        field_r = param0;
        field_c = "1.1";
        field_i = param1;
        try {
          L1: {
            field_l = System.getProperty("java.vendor");
            field_c = System.getProperty("java.version");
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
          if (field_l.toLowerCase().indexOf("microsoft") == -1) {
            break L3;
          } else {
            ((dl) this).field_j = true;
            break L3;
          }
        }
        try {
          L4: {
            field_t = System.getProperty("os.name");
            break L4;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var5 = (Exception) (Object) decompiledCaughtException;
            field_t = "Unknown";
            break L5;
          }
        }
        field_s = field_t.toLowerCase();
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
              field_h = System.getProperty("user.home");
              if (field_h == null) {
                break L11;
              } else {
                field_h = field_h + "/";
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
          if (null != field_h) {
            break L13;
          } else {
            field_h = "~/";
            break L13;
          }
        }
        try {
          L14: {
            ((dl) this).field_a = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
          if (!((dl) this).field_j) {
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
                field_f = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
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
          nd.a(field_i, field_r, true);
          if (!((dl) this).field_p) {
            break L21;
          } else {
            ((dl) this).field_n = new kb(nd.a("random.dat", -3, field_r, (String) null), "rw", 25L);
            ((dl) this).field_q = new kb(nd.a((byte) 67, "main_file_cache.dat2"), "rw", 314572800L);
            ((dl) this).field_e = new kb(nd.a((byte) 67, "main_file_cache.idx255"), "rw", 1048576L);
            ((dl) this).field_d = new kb[param2];
            var5_int = 0;
            L22: while (true) {
              if (var5_int >= param2) {
                L23: {
                  if (!((dl) this).field_j) {
                    break L23;
                  } else {
                    try {
                      L24: {
                        Object discarded$7 = Class.forName("te").newInstance();
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
                      if (((dl) this).field_j) {
                        var7 = new t();
                        ((dl) this).field_u = var7;
                        break L27;
                      } else {
                        ((dl) this).field_g = Class.forName("vj").newInstance();
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
                      if (!((dl) this).field_j) {
                        ((dl) this).field_k = Class.forName("fa").newInstance();
                        break L30;
                      } else {
                        ((dl) this).field_m = new ca();
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
                ((dl) this).field_d[var5_int] = new kb(nd.a((byte) 67, "main_file_cache.idx" + var5_int), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        ((dl) this).field_v = false;
        ((dl) this).field_o = new Thread((Runnable) this);
        ((dl) this).field_o.setPriority(10);
        ((dl) this).field_o.setDaemon(true);
        ((dl) this).field_o.start();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
