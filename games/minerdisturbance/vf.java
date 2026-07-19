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
        int var2 = -48 % ((-43 - param0) / 55);
        if (!this.field_a) {
            return false;
        }
        if (!this.field_q) {
            return null != this.field_x ? true : false;
        }
        return null != this.field_w ? true : false;
    }

    final void a(int param0) {
        try {
            Object var2 = null;
            InterruptedException var2_ref = null;
            IOException var2_ref2 = null;
            int var2_int = 0;
            Throwable var3 = null;
            IOException var3_ref = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            var2 = this;
            synchronized (var2) {
              L0: {
                this.field_u = true;
                this.notifyAll();
                break L0;
              }
            }
            try {
              L1: {
                if (param0 == -29109) {
                  this.field_d.join();
                  decompiledRegionSelector0 = 1;
                  break L1;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L1;
                }
              }
            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var2_ref = (InterruptedException) (Object) decompiledCaughtException;
                decompiledRegionSelector0 = 1;
                break L2;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              L3: {
                if (null != this.field_k) {
                  try {
                    L4: {
                      this.field_k.b(param0 ^ 29131);
                      break L4;
                    }
                  } catch (java.io.IOException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L5: {
                      var2_ref2 = (IOException) (Object) decompiledCaughtException;
                      break L5;
                    }
                  }
                  break L3;
                } else {
                  break L3;
                }
              }
              L6: {
                if (this.field_f != null) {
                  try {
                    L7: {
                      this.field_f.b(-126);
                      break L7;
                    }
                  } catch (java.io.IOException decompiledCaughtParameter2) {
                    decompiledCaughtException = decompiledCaughtParameter2;
                    L8: {
                      var2_ref2 = (IOException) (Object) decompiledCaughtException;
                      break L8;
                    }
                  }
                  break L6;
                } else {
                  break L6;
                }
              }
              L9: {
                if (null == this.field_e) {
                  break L9;
                } else {
                  var2_int = 0;
                  L10: while (true) {
                    if (var2_int >= this.field_e.length) {
                      break L9;
                    } else {
                      if (this.field_e[var2_int] != null) {
                        try {
                          L11: {
                            this.field_e[var2_int].b(-111);
                            var2_int++;
                            break L11;
                          }
                        } catch (java.io.IOException decompiledCaughtParameter3) {
                          decompiledCaughtException = decompiledCaughtParameter3;
                          L12: {
                            var3_ref = (IOException) (Object) decompiledCaughtException;
                            var2_int++;
                            break L12;
                          }
                        }
                        continue L10;
                      } else {
                        var2_int++;
                        continue L10;
                      }
                    }
                  }
                }
              }
              L13: {
                if (null == this.field_i) {
                  break L13;
                } else {
                  try {
                    L14: {
                      this.field_i.b(-114);
                      break L14;
                    }
                  } catch (java.io.IOException decompiledCaughtParameter4) {
                    decompiledCaughtException = decompiledCaughtParameter4;
                    L15: {
                      var2_ref2 = (IOException) (Object) decompiledCaughtException;
                      break L15;
                    }
                  }
                  break L13;
                }
              }
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void run() {
        try {
            Object discarded$6 = null;
            Object discarded$7 = null;
            Object discarded$8 = null;
            Object discarded$9 = null;
            Object discarded$10 = null;
            Process discarded$11 = null;
            Object var2 = null;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            Exception var3_ref = null;
            pm var3_ref2 = null;
            an var3_ref3 = null;
            int var3_int = 0;
            Throwable var4_ref_Throwable = null;
            int var4 = 0;
            String var4_ref_String = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            String var8 = null;
            Object var9 = null;
            ia var9_ref = null;
            java.awt.datatransfer.Clipboard var10 = null;
            java.awt.datatransfer.Clipboard var11 = null;
            String var12 = null;
            java.awt.Component var13 = null;
            Object[] var14 = null;
            java.awt.Frame var15 = null;
            Object[] var16 = null;
            Object[] var17 = null;
            Thread var18 = null;
            int stackIn_52_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_51_0 = 0;
            int stackOut_50_0 = 0;
            L0: while (true) {
              synchronized (var2) {
                L1: {
                  var9_ref.notify();
                  var2 = this;
                  break L1;
                }
              }
              synchronized (var2) {
                L2: {
                  L3: while (true) {
                    if (this.field_u) {
                      return;
                    } else {
                      if (null == this.field_c) {
                        try {
                          L4: {
                            this.wait();
                            break L4;
                          }
                        } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          L5: {
                            var3 = (InterruptedException) (Object) decompiledCaughtException;
                            break L5;
                          }
                        }
                        continue L3;
                      } else {
                        L6: {
                          var9_ref = this.field_c;
                          this.field_c = this.field_c.field_e;
                          if (null != this.field_c) {
                            break L6;
                          } else {
                            this.field_o = null;
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
                    var2_int = var9_ref.field_g;
                    if (-2 == (var2_int ^ -1)) {
                      if (sf.a((byte) 116) < field_l) {
                        throw new IOException();
                      } else {
                        var9_ref.field_a = new java.net.Socket(java.net.InetAddress.getByName((String) (var9_ref.field_d)), var9_ref.field_f);
                        break L8;
                      }
                    } else {
                      if (-23 == (var2_int ^ -1)) {
                        if ((field_l ^ -1L) < (sf.a((byte) 99) ^ -1L)) {
                          throw new IOException();
                        } else {
                          try {
                              if (false) throw (pm) null;
                            L9: {
                              var9_ref.field_a = id.a((byte) -34, (String) (var9_ref.field_d), var9_ref.field_f).a(0);
                              break L9;
                            }
                          } catch (pm decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var3_ref2 = (pm) (Object) decompiledCaughtException;
                            var9_ref.field_a = var3_ref2.getMessage();
                            throw var3_ref2;
                          }
                          break L8;
                        }
                      } else {
                        if (2 == var2_int) {
                          var18 = new Thread((Runnable) (var9_ref.field_d));
                          var18.setDaemon(true);
                          var18.start();
                          var18.setPriority(var9_ref.field_f);
                          var9_ref.field_a = var18;
                          break L8;
                        } else {
                          if (4 != var2_int) {
                            if (8 == var2_int) {
                              L10: {
                                var17 = (Object[]) (var9_ref.field_d);
                                if (!this.field_a) {
                                  break L10;
                                } else {
                                  if (((Class) (var17[0])).getClassLoader() != null) {
                                    break L10;
                                  } else {
                                    throw new SecurityException();
                                  }
                                }
                              }
                              var9_ref.field_a = ((Class) (var17[0])).getDeclaredMethod((String) (var17[1]), (Class[]) (var17[2]));
                              break L8;
                            } else {
                              if (-10 == (var2_int ^ -1)) {
                                L11: {
                                  var16 = (Object[]) (var9_ref.field_d);
                                  if (this.field_a) {
                                    if (null == ((Class) (var16[0])).getClassLoader()) {
                                      throw new SecurityException();
                                    } else {
                                      break L11;
                                    }
                                  } else {
                                    break L11;
                                  }
                                }
                                var9_ref.field_a = ((Class) (var16[0])).getDeclaredField((String) (var16[1]));
                                break L8;
                              } else {
                                if (18 != var2_int) {
                                  if (19 != var2_int) {
                                    if (this.field_a) {
                                      if (3 != var2_int) {
                                        if (-22 == (var2_int ^ -1)) {
                                          if ((field_l ^ -1L) >= (sf.a((byte) -38) ^ -1L)) {
                                            var9_ref.field_a = java.net.InetAddress.getByName((String) (var9_ref.field_d)).getAddress();
                                            break L8;
                                          } else {
                                            throw new IOException();
                                          }
                                        } else {
                                          if (5 == var2_int) {
                                            if (!this.field_q) {
                                              var9_ref.field_a = Class.forName("ej").getMethod("listmodes", new Class[]{}).invoke(this.field_x, new Object[]{});
                                              break L8;
                                            } else {
                                              var9_ref.field_a = this.field_w.a(0);
                                              break L8;
                                            }
                                          } else {
                                            if ((var2_int ^ -1) == -7) {
                                              var15 = new java.awt.Frame("Jagex Full Screen");
                                              var9_ref.field_a = var15;
                                              var15.setResizable(false);
                                              if (this.field_q) {
                                                this.field_w.a(65535 & var9_ref.field_b, var9_ref.field_f >>> -514158576, (byte) 114, var15, 65535 & var9_ref.field_f, var9_ref.field_b >> 1783228272);
                                                break L8;
                                              } else {
                                                discarded$6 = Class.forName("ej").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_x, new Object[]{var15, new Integer(var9_ref.field_f >>> 2099801744), new Integer(var9_ref.field_f & 65535), new Integer(var9_ref.field_b >> -1236202864), new Integer(var9_ref.field_b & 65535)});
                                                break L8;
                                              }
                                            } else {
                                              if (7 == var2_int) {
                                                if (!this.field_q) {
                                                  discarded$7 = Class.forName("ej").getMethod("exit", new Class[]{}).invoke(this.field_x, new Object[]{});
                                                  break L8;
                                                } else {
                                                  this.field_w.a((byte) -101, (java.awt.Frame) (var9_ref.field_d));
                                                  break L8;
                                                }
                                              } else {
                                                if (var2_int != 12) {
                                                  if (13 != var2_int) {
                                                    L12: {
                                                      if (!this.field_a) {
                                                        break L12;
                                                      } else {
                                                        if (-15 == (var2_int ^ -1)) {
                                                          var3_int = var9_ref.field_f;
                                                          var4 = var9_ref.field_b;
                                                          if (this.field_q) {
                                                            this.field_t.a(false, var3_int, var4);
                                                            break L8;
                                                          } else {
                                                            discarded$8 = Class.forName("jj").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_m, new Object[]{new Integer(var3_int), new Integer(var4)});
                                                            break L8;
                                                          }
                                                        } else {
                                                          break L12;
                                                        }
                                                      }
                                                    }
                                                    L13: {
                                                      if (!this.field_a) {
                                                        break L13;
                                                      } else {
                                                        if ((var2_int ^ -1) != -16) {
                                                          break L13;
                                                        } else {
                                                          L14: {
                                                            if (0 == var9_ref.field_f) {
                                                              stackOut_51_0 = 0;
                                                              stackIn_52_0 = stackOut_51_0;
                                                              break L14;
                                                            } else {
                                                              stackOut_50_0 = 1;
                                                              stackIn_52_0 = stackOut_50_0;
                                                              break L14;
                                                            }
                                                          }
                                                          var3_int = stackIn_52_0;
                                                          var13 = (java.awt.Component) (var9_ref.field_d);
                                                          if (this.field_q) {
                                                            this.field_t.a(0, var13, var3_int != 0);
                                                            break L8;
                                                          } else {
                                                            discarded$9 = Class.forName("jj").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_m, new Object[]{var13, new Boolean(var3_int != 0)});
                                                            break L8;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L15: {
                                                      if (this.field_q) {
                                                        break L15;
                                                      } else {
                                                        if (17 == var2_int) {
                                                          var14 = (Object[]) (var9_ref.field_d);
                                                          discarded$10 = Class.forName("jj").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_m, new Object[]{var14[0], var14[1], new Integer(var9_ref.field_f), new Integer(var9_ref.field_b), var14[2]});
                                                          break L8;
                                                        } else {
                                                          break L15;
                                                        }
                                                      }
                                                    }
                                                    if ((var2_int ^ -1) == -17) {
                                                      try {
                                                        L16: {
                                                          if (!field_j.startsWith("win")) {
                                                            throw vf.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          } else {
                                                            L17: {
                                                              var8 = (String) (var9_ref.field_d);
                                                              if (var8.startsWith("http://")) {
                                                                break L17;
                                                              } else {
                                                                if (!var8.startsWith("https://")) {
                                                                  throw vf.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  break L17;
                                                                }
                                                              }
                                                            }
                                                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L18: while (true) {
                                                              if (var5 >= var8.length()) {
                                                                discarded$11 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var8 + "\"");
                                                                var9_ref.field_a = null;
                                                                break L16;
                                                              } else {
                                                                if (-1 == var4_ref_String.indexOf((int) var8.charAt(var5))) {
                                                                  throw vf.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  var5++;
                                                                  continue L18;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                                                        decompiledCaughtException = decompiledCaughtParameter2;
                                                        var3_ref = (Exception) (Object) decompiledCaughtException;
                                                        var9_ref.field_a = var3_ref;
                                                        throw vf.<RuntimeException>$cfr$sneakyThrow(var3_ref);
                                                      }
                                                      break L8;
                                                    } else {
                                                      throw vf.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    }
                                                  } else {
                                                    var3_ref3 = vf.a("", (String) (var9_ref.field_d), field_v, 34);
                                                    var9_ref.field_a = var3_ref3;
                                                    break L8;
                                                  }
                                                } else {
                                                  var3_ref3 = vf.a(field_g, (String) (var9_ref.field_d), field_v, 34);
                                                  var9_ref.field_a = var3_ref3;
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
                                          var12 = (255 & var9_ref.field_f >> -425671944) + "." + ((var9_ref.field_f & 16776460) >> 1084091248) + "." + ((var9_ref.field_f & 65306) >> 1259736808) + "." + (255 & var9_ref.field_f);
                                          var9_ref.field_a = java.net.InetAddress.getByName(var12).getHostName();
                                          break L8;
                                        }
                                      }
                                    } else {
                                      throw vf.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    }
                                  } else {
                                    var7 = (java.awt.datatransfer.Transferable) (var9_ref.field_d);
                                    var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var11.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L8;
                                  }
                                } else {
                                  var10 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var9_ref.field_a = var10.getContents((Object) null);
                                  break L8;
                                }
                              }
                            }
                          } else {
                            if (sf.a((byte) 126) < field_l) {
                              throw new IOException();
                            } else {
                              var9_ref.field_a = new DataInputStream(((java.net.URL) (var9_ref.field_d)).openStream());
                              break L8;
                            }
                          }
                        }
                      }
                    }
                  }
                  var9_ref.field_c = 1;
                  break L7;
                }
              } catch (java.lang.ThreadDeath decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var2_ref = (ThreadDeath) (Object) decompiledCaughtException;
                throw var2_ref;
              } catch (java.lang.Throwable decompiledCaughtParameter4) {
                decompiledCaughtException = decompiledCaughtParameter4;
                L19: {
                  var2_ref2 = decompiledCaughtException;
                  var9_ref.field_c = 2;
                  break L19;
                }
              }
              var2 = var9_ref;
              continue L0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final ia a(int param0, int param1, String param2, boolean param3) {
        ia discarded$0 = null;
        if (param1 <= 62) {
            java.awt.Frame var6 = (java.awt.Frame) null;
            discarded$0 = this.a((java.awt.Frame) null, false);
        }
        return this.a(param2, param0, (byte) 67, 0, param3 ? 22 : 1);
    }

    final ia a(int param0, int param1, int param2, int param3, byte param4) {
        ia discarded$0 = null;
        if (param4 >= -97) {
            Runnable var7 = (Runnable) null;
            discarded$0 = this.a((Runnable) null, (byte) -99, 23);
        }
        return this.a((Object) null, param3 + (param2 << -30453008), (byte) 67, (param0 << 1627323632) - -param1, 6);
    }

    private final ia a(Object param0, int param1, byte param2, int param3, int param4) {
        ia var6 = null;
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
              if (this.field_o != null) {
                this.field_o.field_e = var6;
                this.field_o = var6;
                break L1;
              } else {
                this.field_c = var6;
                this.field_o = var6;
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
          return (ia) null;
        }
    }

    final ia a(Runnable param0, byte param1, int param2) {
        if (param1 < 0) {
            return (ia) null;
        }
        return this.a(param0, param2, (byte) 67, 0, 2);
    }

    final ia a(byte param0) {
        if (param0 != -114) {
            return (ia) null;
        }
        return this.a((Object) null, 0, (byte) 67, 0, 5);
    }

    private final static an a(String param0, String param1, int param2, int param3) {
        try {
            an discarded$1 = null;
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            Object var7 = null;
            Exception var8 = null;
            an var8_ref = null;
            String var9 = null;
            an stackIn_15_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            an stackOut_14_0 = null;
            String var7_ref = null;
            L0: {
              if (param3 == 34) {
                break L0;
              } else {
                var9 = (String) null;
                discarded$1 = vf.a((String) null, (String) null, 82, 95);
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
              if (var6 < var5_array.length) {
                L3: {
                  var7_ref = var5_array[var6];
                  if ((var7_ref.length() ^ -1) >= -1) {
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
                    var8_ref = new an(new File(var7_ref, var4), "rw", 10000L);
                    stackOut_14_0 = (an) (var8_ref);
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

    final ia a(java.awt.Frame param0, boolean param1) {
        if (!param1) {
            this.field_i = (an) null;
        }
        return this.a(param0, 0, (byte) 67, 0, 7);
    }

    final ia a(Class param0, String param1, int param2) {
        if (param2 != 21268) {
            this.field_k = (an) null;
        }
        return this.a(new Object[]{param0, param1}, 0, (byte) 67, 0, 9);
    }

    final ia a(String param0, int param1, byte param2) {
        ia discarded$0 = null;
        if (param2 < 3) {
            discarded$0 = this.a((byte) 66);
        }
        return this.a(param1, 67, param0, false);
    }

    final ia a(String param0, Class param1, int param2, Class[] param3) {
        if (param2 < 5) {
            return (ia) null;
        }
        return this.a(new Object[]{param1, param0, param3}, 0, (byte) 67, 0, 8);
    }

    final ia a(byte param0, java.net.URL param1) {
        if (param0 != -83) {
            return (ia) null;
        }
        return this.a(param1, 0, (byte) 67, 0, 4);
    }

    vf(int param0, String param1, int param2, boolean param3) throws Exception {
        String discarded$6 = null;
        String discarded$7 = null;
        java.lang.reflect.Method discarded$8 = null;
        Object discarded$9 = null;
        Exception exception = null;
        Throwable throwable = null;
        int var5_int = 0;
        ga var6 = null;
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
          this.field_i = null;
          this.field_u = false;
          this.field_c = null;
          this.field_k = null;
          this.field_q = false;
          this.field_a = false;
          this.field_f = null;
          this.field_o = null;
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
        ((vf) (this)).field_a = stackIn_3_1 != 0;
        field_b = "1.1";
        field_v = param0;
        field_g = param1;
        field_s = "Unknown";
        try {
          L1: {
            field_s = System.getProperty("java.vendor");
            field_b = System.getProperty("java.version");
            break L1;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            exception = (Exception) (Object) decompiledCaughtException;
            break L2;
          }
        }
        L3: {
          if (-1 != field_s.toLowerCase().indexOf("microsoft")) {
            this.field_q = true;
            break L3;
          } else {
            break L3;
          }
        }
        try {
          L4: {
            field_n = System.getProperty("os.name");
            break L4;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            exception = (Exception) (Object) decompiledCaughtException;
            field_n = "Unknown";
            break L5;
          }
        }
        field_j = field_n.toLowerCase();
        try {
          L6: {
            discarded$6 = System.getProperty("os.arch").toLowerCase();
            break L6;
          }
        } catch (java.lang.Exception decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L7: {
            exception = (Exception) (Object) decompiledCaughtException;
            break L7;
          }
        }
        try {
          L8: {
            discarded$7 = System.getProperty("os.version").toLowerCase();
            break L8;
          }
        } catch (java.lang.Exception decompiledCaughtParameter3) {
          decompiledCaughtException = decompiledCaughtParameter3;
          L9: {
            exception = (Exception) (Object) decompiledCaughtException;
            break L9;
          }
        }
        try {
          L10: {
            L11: {
              field_r = System.getProperty("user.home");
              if (field_r == null) {
                break L11;
              } else {
                field_r = field_r + "/";
                break L11;
              }
            }
            break L10;
          }
        } catch (java.lang.Exception decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          L12: {
            exception = (Exception) (Object) decompiledCaughtException;
            break L12;
          }
        }
        L13: {
          if (null == field_r) {
            field_r = "~/";
            break L13;
          } else {
            break L13;
          }
        }
        try {
          L14: {
            this.field_p = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
            break L14;
          }
        } catch (java.lang.Throwable decompiledCaughtParameter5) {
          decompiledCaughtException = decompiledCaughtParameter5;
          L15: {
            throwable = decompiledCaughtException;
            break L15;
          }
        }
        L16: {
          if (!this.field_q) {
            try {
              L17: {
                discarded$8 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[]{Boolean.TYPE});
                break L17;
              }
            } catch (java.lang.Exception decompiledCaughtParameter6) {
              decompiledCaughtException = decompiledCaughtParameter6;
              L18: {
                exception = (Exception) (Object) decompiledCaughtException;
                break L18;
              }
            }
            try {
              L19: {
                field_h = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
                break L19;
              }
            } catch (java.lang.Exception decompiledCaughtParameter7) {
              decompiledCaughtException = decompiledCaughtParameter7;
              L20: {
                exception = (Exception) (Object) decompiledCaughtException;
                break L20;
              }
            }
            break L16;
          } else {
            break L16;
          }
        }
        L21: {
          fk.a(true, field_g, field_v);
          if (!this.field_a) {
            break L21;
          } else {
            this.field_i = new an(fk.a((String) null, "random.dat", false, field_v), "rw", 25L);
            this.field_k = new an(fk.a(0, "main_file_cache.dat2"), "rw", 314572800L);
            this.field_f = new an(fk.a(0, "main_file_cache.idx255"), "rw", 1048576L);
            this.field_e = new an[param2];
            var5_int = 0;
            L22: while (true) {
              if (param2 <= var5_int) {
                L23: {
                  if (this.field_q) {
                    try {
                      L24: {
                        discarded$9 = Class.forName("qj").newInstance();
                        break L24;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter8) {
                      decompiledCaughtException = decompiledCaughtParameter8;
                      L25: {
                        throwable = decompiledCaughtException;
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
                      if (this.field_q) {
                        var6 = new ga();
                        this.field_w = var6;
                        break L27;
                      } else {
                        this.field_x = Class.forName("ej").newInstance();
                        break L27;
                      }
                    }
                    break L26;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter9) {
                  decompiledCaughtException = decompiledCaughtParameter9;
                  L28: {
                    throwable = decompiledCaughtException;
                    break L28;
                  }
                }
                try {
                  L29: {
                    L30: {
                      if (!this.field_q) {
                        this.field_m = Class.forName("jj").newInstance();
                        break L30;
                      } else {
                        this.field_t = new ue();
                        break L30;
                      }
                    }
                    break L29;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter10) {
                  decompiledCaughtException = decompiledCaughtParameter10;
                  L31: {
                    throwable = decompiledCaughtException;
                    break L31;
                  }
                }
                break L21;
              } else {
                this.field_e[var5_int] = new an(fk.a(0, "main_file_cache.idx" + var5_int), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        this.field_u = false;
        this.field_d = new Thread((Runnable) (this));
        this.field_d.setPriority(10);
        this.field_d.setDaemon(true);
        this.field_d.start();
    }

    static {
        field_l = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
