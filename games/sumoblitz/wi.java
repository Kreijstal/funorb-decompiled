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
            String var7_ref = null;
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            Object var7 = null;
            Exception var8 = null;
            sr var8_ref = null;
            sr stackIn_15_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            sr stackOut_14_0 = null;
            var7_ref = null;
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
              if (var6 < var5_array.length) {
                L3: {
                  var7_ref = var5_array[var6];
                  if (0 >= var7_ref.length()) {
                    break L3;
                  } else {
                    if (new File(var7_ref).exists()) {
                      break L3;
                    } else {
                      var6++;
                      continue L2;
                    }
                  }
                }
                try {
                  L4: {
                    var8_ref = new sr(new File(var7_ref, var4), "rw", 10000L);
                    stackOut_14_0 = (sr) var8_ref;
                    stackIn_15_0 = stackOut_14_0;
                    decompiledRegionSelector0 = 0;
                    break L4;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    var8 = (Exception) (Object) decompiledCaughtException;
                    var6++;
                    decompiledRegionSelector0 = 1;
                    break L5;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  return stackIn_15_0;
                } else {
                  continue L2;
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

    private final jr a(Object param0, int param1, int param2, boolean param3, int param4) {
        jr var6 = null;
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
        if (!param2) {
            ((wi) this).field_b = null;
        }
        return this.a((Object) (Object) param1, 0, param0, false, 1);
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
                    if (null != ((wi) this).field_i[var2_int]) {
                      {
                        L12: {
                          ((wi) this).field_i[var2_int].b(0);
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
              if (((wi) this).field_n == null) {
                break L14;
              } else {
                {
                  L15: {
                    ((wi) this).field_n.b(0);
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
            String var3_ref5 = null;
            java.awt.Frame var3_ref6 = null;
            sr var3_ref7 = null;
            int var3_int = 0;
            Throwable var4 = null;
            java.awt.datatransfer.Clipboard var4_ref = null;
            int var4_int = 0;
            java.awt.Component var4_ref2 = null;
            String var4_ref3 = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            int stackIn_73_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_72_0 = 0;
            int stackOut_71_0 = 0;
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
                                    var7 = (java.awt.datatransfer.Transferable) var1_ref.field_a;
                                    var4_ref = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var4_ref.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L8;
                                  } else {
                                    if (((wi) this).field_f) {
                                      if (var2_int != 3) {
                                        if (var2_int != 21) {
                                          if (var2_int != 5) {
                                            if (var2_int == 6) {
                                              var3_ref6 = new java.awt.Frame("Jagex Full Screen");
                                              var1_ref.field_d = (Object) (Object) var3_ref6;
                                              var3_ref6.setResizable(false);
                                              if (((wi) this).field_t) {
                                                ((wi) this).field_w.a(var1_ref.field_g & 65535, (byte) -123, var1_ref.field_g >>> 16, var1_ref.field_e & 65535, var1_ref.field_e >> 16, var3_ref6);
                                                break L8;
                                              } else {
                                                Object discarded$6 = Class.forName("cu").getMethod("enter", new Class[5]).invoke(((wi) this).field_r, new Object[5]);
                                                break L8;
                                              }
                                            } else {
                                              if (var2_int != 7) {
                                                if (12 != var2_int) {
                                                  if (var2_int == 13) {
                                                    var3_ref7 = wi.a("", true, (String) var1_ref.field_a, field_j);
                                                    var1_ref.field_d = (Object) (Object) var3_ref7;
                                                    break L8;
                                                  } else {
                                                    L9: {
                                                      if (!((wi) this).field_f) {
                                                        break L9;
                                                      } else {
                                                        if (14 == var2_int) {
                                                          var3_int = var1_ref.field_g;
                                                          var4_int = var1_ref.field_e;
                                                          if (!((wi) this).field_t) {
                                                            Object discarded$7 = Class.forName("cg").getDeclaredMethod("movemouse", new Class[2]).invoke(((wi) this).field_v, new Object[2]);
                                                            break L8;
                                                          } else {
                                                            ((wi) this).field_b.a(var4_int, var3_int, (byte) 84);
                                                            break L8;
                                                          }
                                                        } else {
                                                          break L9;
                                                        }
                                                      }
                                                    }
                                                    L10: {
                                                      if (!((wi) this).field_f) {
                                                        break L10;
                                                      } else {
                                                        if (var2_int != 15) {
                                                          break L10;
                                                        } else {
                                                          L11: {
                                                            if (var1_ref.field_g == 0) {
                                                              stackOut_72_0 = 0;
                                                              stackIn_73_0 = stackOut_72_0;
                                                              break L11;
                                                            } else {
                                                              stackOut_71_0 = 1;
                                                              stackIn_73_0 = stackOut_71_0;
                                                              break L11;
                                                            }
                                                          }
                                                          var3_int = stackIn_73_0;
                                                          var4_ref2 = (java.awt.Component) var1_ref.field_a;
                                                          if (((wi) this).field_t) {
                                                            ((wi) this).field_b.a(false, var3_int != 0, var4_ref2);
                                                            break L8;
                                                          } else {
                                                            Object discarded$8 = Class.forName("cg").getDeclaredMethod("showcursor", new Class[2]).invoke(((wi) this).field_v, new Object[2]);
                                                            break L8;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L12: {
                                                      if (((wi) this).field_t) {
                                                        break L12;
                                                      } else {
                                                        if (var2_int != 17) {
                                                          break L12;
                                                        } else {
                                                          var3_array = (Object[]) var1_ref.field_a;
                                                          Object discarded$9 = Class.forName("cg").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((wi) this).field_v, new Object[5]);
                                                          break L8;
                                                        }
                                                      }
                                                    }
                                                    if (16 == var2_int) {
                                                      try {
                                                        L13: {
                                                          if (!field_o.startsWith("win")) {
                                                            throw wi.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          } else {
                                                            L14: {
                                                              var3_ref5 = (String) var1_ref.field_a;
                                                              if (var3_ref5.startsWith("http://")) {
                                                                break L14;
                                                              } else {
                                                                if (!var3_ref5.startsWith("https://")) {
                                                                  throw wi.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  break L14;
                                                                }
                                                              }
                                                            }
                                                            var4_ref3 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L15: while (true) {
                                                              if (~var3_ref5.length() >= ~var5) {
                                                                Process discarded$10 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var3_ref5 + "\"");
                                                                var1_ref.field_d = null;
                                                                break L13;
                                                              } else {
                                                                if (var4_ref3.indexOf((int) var3_ref5.charAt(var5)) != -1) {
                                                                  var5++;
                                                                  continue L15;
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
                                                  var3_ref7 = wi.a(field_p, true, (String) var1_ref.field_a, field_j);
                                                  var1_ref.field_d = (Object) (Object) var3_ref7;
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
                                          var3_ref5 = (var1_ref.field_g >> 24 & 255) + "." + (var1_ref.field_g >> 16 & 255) + "." + ((var1_ref.field_g & 65425) >> 8) + "." + (var1_ref.field_g & 255);
                                          var1_ref.field_d = (Object) (Object) java.net.InetAddress.getByName(var3_ref5).getHostName();
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
                                L16: {
                                  var3_array = (Object[]) var1_ref.field_a;
                                  if (((wi) this).field_f) {
                                    if (null != ((Class) var3_array[0]).getClassLoader()) {
                                      break L16;
                                    } else {
                                      throw new SecurityException();
                                    }
                                  } else {
                                    break L16;
                                  }
                                }
                                var1_ref.field_d = (Object) (Object) ((Class) var3_array[0]).getDeclaredField((String) var3_array[1]);
                                break L8;
                              }
                            } else {
                              L17: {
                                var3_array = (Object[]) var1_ref.field_a;
                                if (((wi) this).field_f) {
                                  if (null == ((Class) var3_array[0]).getClassLoader()) {
                                    throw new SecurityException();
                                  } else {
                                    break L17;
                                  }
                                } else {
                                  break L17;
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
                            L18: {
                              var1_ref.field_d = (Object) (Object) rf.a((String) var1_ref.field_a, var1_ref.field_g, true).b((byte) 61);
                              break L18;
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
                L19: {
                  var2_ref = decompiledCaughtException;
                  var1_ref.field_c = 2;
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

    final boolean a(byte param0) {
        if (!(((wi) this).field_f)) {
            return false;
        }
        int var2 = -31 % ((param0 - 16) / 51);
        if (!((wi) this).field_t) {
            return ((wi) this).field_r != null ? true : false;
        }
        return null != ((wi) this).field_w ? true : false;
    }

    final jr a(int param0, Class param1, String param2, Class[] param3) {
        if (param0 != 0) {
            ((wi) this).field_i = null;
        }
        return this.a((Object) (Object) new Object[3], 0, 0, false, 8);
    }

    final jr a(boolean param0, Runnable param1, int param2) {
        if (!param0) {
            boolean discarded$0 = ((wi) this).a((byte[]) null, -30, (File) null);
        }
        return this.a((Object) (Object) param1, 0, param2, !param0 ? true : false, 2);
    }

    final jr a(byte param0, String param1, int param2) {
        if (param0 < 8) {
            field_j = 62;
        }
        return this.a(param2, param1, true, false);
    }

    final boolean a(byte[] param0, int param1, File param2) {
        FileOutputStream var4 = null;
        IOException var4_ref = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
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
            stackOut_2_0 = 1;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (IOException) (Object) decompiledCaughtException;
          throw new RuntimeException();
        }
        return stackIn_3_0 != 0;
    }

    final jr a(byte param0, java.net.URL param1) {
        if (param0 <= 71) {
            return null;
        }
        return this.a((Object) (Object) param1, 0, 0, false, 4);
    }

    final jr a(java.awt.Frame param0, int param1) {
        if (param1 != 19) {
            boolean discarded$0 = ((wi) this).a((byte) -116);
        }
        return this.a((Object) (Object) param0, 0, 0, false, 7);
    }

    final jr b(byte param0) {
        int var2 = -105 % ((73 - param0) / 41);
        return this.a((Object) null, 0, 0, false, 5);
    }

    final jr a(int param0, String param1, Class param2) {
        if (param0 != 0) {
            jr discarded$0 = ((wi) this).a(-2, (String) null, (Class) null);
        }
        return this.a((Object) (Object) new Object[2], 0, 0, false, 9);
    }

    final jr a(boolean param0, int param1, int param2, int param3, int param4) {
        if (param0) {
            return null;
        }
        return this.a((Object) null, param1 + (param2 << 16), param4 + (param3 << 16), false, 6);
    }

    wi(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        ThreadGroup var5_ref2 = null;
        ThreadGroup var6 = null;
        Thread[] var7 = null;
        int var8 = 0;
        ep var9 = null;
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
          ((wi) this).field_l = null;
          ((wi) this).field_m = false;
          ((wi) this).field_f = false;
          ((wi) this).field_t = false;
          ((wi) this).field_k = null;
          ((wi) this).field_x = null;
          ((wi) this).field_n = null;
          ((wi) this).field_d = null;
          field_u = "Unknown";
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
        ((wi) this).field_f = stackIn_3_1 != 0;
        field_p = param1;
        field_j = param0;
        field_q = "1.1";
        try {
          L1: {
            field_u = System.getProperty("java.vendor");
            field_q = System.getProperty("java.version");
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
            ((wi) this).field_t = true;
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
        field_o = field_h.toLowerCase();
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
          if (null == field_s) {
            field_s = "~/";
            break L13;
          } else {
            break L13;
          }
        }
        try {
          L14: {
            ((wi) this).field_g = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
          if (!((wi) this).field_t) {
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
          } else {
            break L16;
          }
        }
        L21: {
          el.a(0, field_j, field_p);
          if (!((wi) this).field_f) {
            break L21;
          } else {
            ((wi) this).field_n = new sr(el.a((String) null, field_j, 95, "random.dat"), "rw", 25L);
            ((wi) this).field_l = new sr(el.a("main_file_cache.dat2", (byte) -8), "rw", 314572800L);
            ((wi) this).field_d = new sr(el.a("main_file_cache.idx255", (byte) -8), "rw", 1048576L);
            ((wi) this).field_i = new sr[param2];
            var5_int = 0;
            L22: while (true) {
              if (param2 <= var5_int) {
                L23: {
                  if (((wi) this).field_t) {
                    try {
                      L24: {
                        Object discarded$8 = Class.forName("uf").newInstance();
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
                      if (!((wi) this).field_t) {
                        ((wi) this).field_r = Class.forName("cu").newInstance();
                        break L27;
                      } else {
                        var9 = new ep();
                        ((wi) this).field_w = var9;
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
                      if (((wi) this).field_t) {
                        ((wi) this).field_b = new bm();
                        break L30;
                      } else {
                        ((wi) this).field_v = Class.forName("cg").newInstance();
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
                ((wi) this).field_i[var5_int] = new sr(el.a("main_file_cache.idx" + var5_int, (byte) -8), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        L32: {
          if (!((wi) this).field_f) {
            break L32;
          } else {
            if (((wi) this).field_t) {
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
                    if (var8 >= var7.length) {
                      break L32;
                    } else {
                      if (var7[var8] != null) {
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
