/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fd implements Runnable {
    static String field_k;
    java.awt.EventQueue field_w;
    private ae field_r;
    private static int field_n;
    private mh field_h;
    private Object field_x;
    private static volatile long field_t;
    boolean field_a;
    hf field_i;
    private static String field_b;
    static String field_c;
    hf[] field_o;
    private Thread field_s;
    private mh field_p;
    private boolean field_j;
    private boolean field_m;
    static String field_d;
    static java.lang.reflect.Method field_f;
    private Object field_q;
    private static String field_u;
    hf field_v;
    private static String field_g;
    private fg field_e;
    hf field_l;

    final mh a(byte param0, int param1, int param2, int param3, int param4) {
        if (param0 <= 39) {
            ((fd) this).field_r = null;
        }
        return this.a(param4 + (param2 << 75254128), 1, (Object) null, 6, (param3 << 261205040) + param1);
    }

    final mh a(int param0, String param1, int param2) {
        if (param0 <= 98) {
            Object var5 = null;
            mh discarded$0 = this.a(12, true, -60, (String) null);
        }
        return this.a(param2, false, -10742, param1);
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
              ((fd) this).field_m = true;
              this.notifyAll();
            }
            try {
              L0: {
                ((fd) this).field_s.join();
                if (param0 == 0) {
                  break L0;
                } else {
                  ((fd) this).a(-106);
                  break L0;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (InterruptedException) (Object) decompiledCaughtException;
            }
            L1: {
              if (((fd) this).field_i != null) {
                try {
                  ((fd) this).field_i.a(-72);
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var2_ref2 = (IOException) (Object) decompiledCaughtException;
                }
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (null != ((fd) this).field_l) {
                try {
                  ((fd) this).field_l.a(param0 + -55);
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var2_ref2 = (IOException) (Object) decompiledCaughtException;
                }
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (null != ((fd) this).field_o) {
                var2_int = 0;
                L4: while (true) {
                  if (var2_int >= ((fd) this).field_o.length) {
                    break L3;
                  } else {
                    if (null != ((fd) this).field_o[var2_int]) {
                      try {
                        ((fd) this).field_o[var2_int].a(param0 ^ -71);
                        var2_int++;
                      } catch (java.io.IOException decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        var3_ref = (IOException) (Object) decompiledCaughtException;
                        var2_int++;
                      }
                      continue L4;
                    } else {
                      var2_int++;
                      continue L4;
                    }
                  }
                }
              } else {
                break L3;
              }
            }
            L5: {
              if (((fd) this).field_v == null) {
                break L5;
              } else {
                try {
                  ((fd) this).field_v.a(-72);
                } catch (java.io.IOException decompiledCaughtParameter4) {
                  decompiledCaughtException = decompiledCaughtParameter4;
                  var2_ref2 = (IOException) (Object) decompiledCaughtException;
                }
                break L5;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final mh a(boolean param0, String param1, Class param2) {
        if (param0) {
            return null;
        }
        return this.a(0, 1, (Object) (Object) new Object[2], 9, 0);
    }

    private final mh a(int param0, boolean param1, int param2, String param3) {
        if (param2 != -10742) {
            ((fd) this).field_h = null;
        }
        return this.a(0, 1, (Object) (Object) param3, param1 ? 22 : 1, param0);
    }

    final boolean b(int param0) {
        if (param0 != -86) {
            return false;
        }
        if (!(((fd) this).field_a)) {
            return false;
        }
        if (((fd) this).field_j) {
            return null != ((fd) this).field_e ? true : false;
        }
        return ((fd) this).field_x != null ? true : false;
    }

    final mh a(int param0, String param1, Class param2, Class[] param3) {
        if (param0 != -10962) {
            field_f = null;
        }
        return this.a(0, param0 ^ -10961, (Object) (Object) new Object[3], 8, 0);
    }

    private final static hf a(byte param0, String param1, String param2, int param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            hf var8_ref = null;
            hf stackIn_14_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            hf stackOut_13_0 = null;
            L0: {
              if (33 == param3) {
                var4 = "jagex_" + param1 + "_preferences" + param2 + "_rc.dat";
                break L0;
              } else {
                if ((param3 ^ -1) == -35) {
                  var4 = "jagex_" + param1 + "_preferences" + param2 + "_wip.dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param1 + "_preferences" + param2 + ".dat";
                  break L0;
                }
              }
            }
            var5_array = new String[]{"c:/rscache/", "/rscache/", field_u, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            if (param0 == -32) {
              var6 = 0;
              L1: while (true) {
                if (var5_array.length > var6) {
                  L2: {
                    var7 = var5_array[var6];
                    if (-1 <= (var7.length() ^ -1)) {
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
                    var8_ref = new hf(new File(var7, var4), "rw", 10000L);
                    stackOut_13_0 = (hf) var8_ref;
                    stackIn_14_0 = stackOut_13_0;
                    decompiledRegionSelector0 = 0;
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var8 = (Exception) (Object) decompiledCaughtException;
                    var6++;
                    decompiledRegionSelector0 = 1;
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

    final mh a(int param0, java.awt.Frame param1) {
        if (param0 != 75254128) {
            return null;
        }
        return this.a(0, 1, (Object) (Object) param1, 7, 0);
    }

    public final void run() {
        try {
            Throwable var2 = null;
            Object var2_ref = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            db var3_ref = null;
            Exception var3_ref2 = null;
            hf var3_ref3 = null;
            int var3_int = 0;
            Throwable var4_ref_Throwable = null;
            int var4 = 0;
            String var4_ref_String = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            Object var8 = null;
            mh var8_ref = null;
            Object[] var9 = null;
            Object[] var10 = null;
            java.awt.datatransfer.Clipboard var11 = null;
            java.awt.datatransfer.Clipboard var12 = null;
            String var13 = null;
            java.awt.Frame var14 = null;
            Object[] var15 = null;
            Object var16 = null;
            String var16_ref = null;
            Object var17 = null;
            java.awt.Component var17_ref = null;
            Thread var18 = null;
            int stackIn_95_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_94_0 = 0;
            int stackOut_93_0 = 0;
            var16 = null;
            var17 = null;
            L0: while (true) {
              var2_ref = this;
              synchronized (var2_ref) {
                L1: while (true) {
                  if (!((fd) this).field_m) {
                    if (((fd) this).field_h != null) {
                      L2: {
                        var8_ref = ((fd) this).field_h;
                        ((fd) this).field_h = ((fd) this).field_h.field_f;
                        if (null == ((fd) this).field_h) {
                          ((fd) this).field_p = null;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      break L1;
                    } else {
                      try {
                        this.wait();
                      } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var3 = (InterruptedException) (Object) decompiledCaughtException;
                      }
                      continue L1;
                    }
                  } else {
                    return;
                  }
                }
              }
              try {
                var2_int = var8_ref.field_d;
                if (-2 == var2_int) {
                  decompiledRegionSelector0 = 0;
                } else {
                  decompiledRegionSelector0 = 1;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2 = decompiledCaughtException;
                var8_ref.field_c = 2;
                decompiledRegionSelector0 = 2;
              }
              L3: {
                L4: {
                  if (decompiledRegionSelector0 == 0) {
                    if (ik.a(4) >= field_t) {
                      var8_ref.field_b = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var8_ref.field_e), var8_ref.field_g);
                      break L4;
                    } else {
                      throw new IOException();
                    }
                  } else {
                    if (decompiledRegionSelector0 == 1) {
                      if (-23 != var2_int) {
                        if (var2_int == -3) {
                          var18 = new Thread((Runnable) var8_ref.field_e);
                          var18.setDaemon(true);
                          var18.start();
                          var18.setPriority(var8_ref.field_g);
                          var8_ref.field_b = (Object) (Object) var18;
                          break L4;
                        } else {
                          if (4 == var2_int) {
                            if (field_t > ik.a(4)) {
                              throw new IOException();
                            } else {
                              var8_ref.field_b = (Object) (Object) new DataInputStream(((java.net.URL) var8_ref.field_e).openStream());
                              break L4;
                            }
                          } else {
                            if (-9 != var2_int) {
                              if (-10 != (var2_int ^ -1)) {
                                if (-19 != (var2_int ^ -1)) {
                                  if ((var2_int ^ -1) != -20) {
                                    if (!((fd) this).field_a) {
                                      throw fd.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    } else {
                                      if ((var2_int ^ -1) != -4) {
                                        if (var2_int == -22) {
                                          if (field_t <= ik.a(4)) {
                                            var8_ref.field_b = (Object) (Object) java.net.InetAddress.getByName((String) var8_ref.field_e).getAddress();
                                            break L4;
                                          } else {
                                            throw new IOException();
                                          }
                                        } else {
                                          if (-6 != var2_int) {
                                            if (6 != var2_int) {
                                              if ((var2_int ^ -1) != -8) {
                                                if (12 == var2_int) {
                                                  var3_ref3 = fd.a((byte) -32, field_g, (String) var8_ref.field_e, field_n);
                                                  var8_ref.field_b = (Object) (Object) var3_ref3;
                                                  break L4;
                                                } else {
                                                  if (-14 != (var2_int ^ -1)) {
                                                    L5: {
                                                      if (!((fd) this).field_a) {
                                                        break L5;
                                                      } else {
                                                        if (var2_int == -15) {
                                                          var3_int = var8_ref.field_g;
                                                          var4 = var8_ref.field_a;
                                                          if (((fd) this).field_j) {
                                                            ((fd) this).field_r.a(var3_int, var4, (byte) -98);
                                                            break L4;
                                                          } else {
                                                            Object discarded$6 = Class.forName("il").getDeclaredMethod("movemouse", new Class[2]).invoke(((fd) this).field_q, new Object[2]);
                                                            break L4;
                                                          }
                                                        } else {
                                                          break L5;
                                                        }
                                                      }
                                                    }
                                                    L6: {
                                                      if (!((fd) this).field_a) {
                                                        break L6;
                                                      } else {
                                                        if (15 == var2_int) {
                                                          L7: {
                                                            if (var8_ref.field_g == 0) {
                                                              stackOut_94_0 = 0;
                                                              stackIn_95_0 = stackOut_94_0;
                                                              break L7;
                                                            } else {
                                                              stackOut_93_0 = 1;
                                                              stackIn_95_0 = stackOut_93_0;
                                                              break L7;
                                                            }
                                                          }
                                                          var3_int = stackIn_95_0;
                                                          var17_ref = (java.awt.Component) var8_ref.field_e;
                                                          if (((fd) this).field_j) {
                                                            ((fd) this).field_r.a(var3_int != 0, var17_ref, (byte) 111);
                                                            break L4;
                                                          } else {
                                                            Object discarded$7 = Class.forName("il").getDeclaredMethod("showcursor", new Class[2]).invoke(((fd) this).field_q, new Object[2]);
                                                            break L4;
                                                          }
                                                        } else {
                                                          break L6;
                                                        }
                                                      }
                                                    }
                                                    L8: {
                                                      if (((fd) this).field_j) {
                                                        break L8;
                                                      } else {
                                                        if (-18 != var2_int) {
                                                          break L8;
                                                        } else {
                                                          var15 = (Object[]) var8_ref.field_e;
                                                          Object discarded$8 = Class.forName("il").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((fd) this).field_q, new Object[5]);
                                                          break L4;
                                                        }
                                                      }
                                                    }
                                                    if (16 == var2_int) {
                                                      try {
                                                        if (!field_d.startsWith("win")) {
                                                          throw fd.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                        } else {
                                                          L9: {
                                                            var16_ref = (String) var8_ref.field_e;
                                                            if (var16_ref.startsWith("http://")) {
                                                              break L9;
                                                            } else {
                                                              if (!var16_ref.startsWith("https://")) {
                                                                throw fd.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                              } else {
                                                                break L9;
                                                              }
                                                            }
                                                          }
                                                          var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                          var5 = 0;
                                                          L10: while (true) {
                                                            if (var16_ref.length() <= var5) {
                                                              Process discarded$9 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var16_ref + "\"");
                                                              var8_ref.field_b = null;
                                                              break L10;
                                                            } else {
                                                              if (0 != (var4_ref_String.indexOf((int) var16_ref.charAt(var5)) ^ -1)) {
                                                                var5++;
                                                                continue L10;
                                                              } else {
                                                                throw fd.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                                                        decompiledCaughtException = decompiledCaughtParameter2;
                                                        var3_ref2 = (Exception) (Object) decompiledCaughtException;
                                                        var8_ref.field_b = (Object) (Object) var3_ref2;
                                                        throw fd.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                                                      }
                                                      break L4;
                                                    } else {
                                                      throw fd.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    }
                                                  } else {
                                                    var3_ref3 = fd.a((byte) -32, "", (String) var8_ref.field_e, field_n);
                                                    var8_ref.field_b = (Object) (Object) var3_ref3;
                                                    break L4;
                                                  }
                                                }
                                              } else {
                                                if (((fd) this).field_j) {
                                                  ((fd) this).field_e.a((java.awt.Frame) var8_ref.field_e, (byte) 122);
                                                  break L4;
                                                } else {
                                                  Object discarded$10 = Class.forName("vc").getMethod("exit", new Class[0]).invoke(((fd) this).field_x, new Object[0]);
                                                  break L4;
                                                }
                                              }
                                            } else {
                                              var14 = new java.awt.Frame("Jagex Full Screen");
                                              var8_ref.field_b = (Object) (Object) var14;
                                              var14.setResizable(false);
                                              if (!((fd) this).field_j) {
                                                Object discarded$11 = Class.forName("vc").getMethod("enter", new Class[5]).invoke(((fd) this).field_x, new Object[5]);
                                                break L4;
                                              } else {
                                                ((fd) this).field_e.a(var8_ref.field_a >> -339845072, false, var8_ref.field_g >>> 615328656, var8_ref.field_g & 65535, var8_ref.field_a & 65535, var14);
                                                break L4;
                                              }
                                            }
                                          } else {
                                            if (!((fd) this).field_j) {
                                              var8_ref.field_b = Class.forName("vc").getMethod("listmodes", new Class[0]).invoke(((fd) this).field_x, new Object[0]);
                                              break L4;
                                            } else {
                                              var8_ref.field_b = (Object) (Object) ((fd) this).field_e.a(0);
                                              break L4;
                                            }
                                          }
                                        }
                                      } else {
                                        if ((field_t ^ -1L) < (ik.a(4) ^ -1L)) {
                                          throw new IOException();
                                        } else {
                                          var13 = (var8_ref.field_g >> -1649452392 & 255) + "." + (255 & var8_ref.field_g >> -1316320240) + "." + ((var8_ref.field_g & 65502) >> -1967676120) + "." + (255 & var8_ref.field_g);
                                          var8_ref.field_b = (Object) (Object) java.net.InetAddress.getByName(var13).getHostName();
                                          break L4;
                                        }
                                      }
                                    }
                                  } else {
                                    var7 = (java.awt.datatransfer.Transferable) var8_ref.field_e;
                                    var12 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var12.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L4;
                                  }
                                } else {
                                  var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8_ref.field_b = (Object) (Object) var11.getContents((Object) null);
                                  break L4;
                                }
                              } else {
                                L11: {
                                  var10 = (Object[]) var8_ref.field_e;
                                  if (((fd) this).field_a) {
                                    if (null == ((Class) var10[0]).getClassLoader()) {
                                      throw new SecurityException();
                                    } else {
                                      break L11;
                                    }
                                  } else {
                                    break L11;
                                  }
                                }
                                var8_ref.field_b = (Object) (Object) ((Class) var10[0]).getDeclaredField((String) var10[1]);
                                break L4;
                              }
                            } else {
                              L12: {
                                var9 = (Object[]) var8_ref.field_e;
                                if (((fd) this).field_a) {
                                  if (((Class) var9[0]).getClassLoader() == null) {
                                    throw new SecurityException();
                                  } else {
                                    break L12;
                                  }
                                } else {
                                  break L12;
                                }
                              }
                              var8_ref.field_b = (Object) (Object) ((Class) var9[0]).getDeclaredMethod((String) var9[1], (Class[]) var9[2]);
                              break L4;
                            }
                          }
                        }
                      } else {
                        if ((ik.a(4) ^ -1L) <= (field_t ^ -1L)) {
                          try {
                            var8_ref.field_b = (Object) (Object) pn.a((String) var8_ref.field_e, var8_ref.field_g, 23155).a(-7);
                          } catch (java.lang.Exception decompiledCaughtParameter3) {
                            decompiledCaughtException = decompiledCaughtParameter3;
                            var3_ref = (db) (Object) decompiledCaughtException;
                            var8_ref.field_b = (Object) (Object) var3_ref.getMessage();
                            throw var3_ref;
                          }
                          break L4;
                        } else {
                          throw new IOException();
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                var8_ref.field_c = 1;
                break L3;
              }
              var2_ref = (Object) (Object) var8_ref;
              synchronized (var2_ref) {
                ((Object) (Object) var8_ref).notify();
              }
              continue L0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final mh a(java.net.URL param0, byte param1) {
        int var3 = -74 % ((-9 - param1) / 45);
        return this.a(0, 1, (Object) (Object) param0, 4, 0);
    }

    final mh a(byte param0) {
        if (param0 <= 121) {
            return null;
        }
        return this.a(0, 1, (Object) null, 5, 0);
    }

    private final mh a(int param0, int param1, Object param2, int param3, int param4) {
        mh var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        var6 = new mh();
        var6.field_g = param4;
        var6.field_a = param0;
        var6.field_d = param3;
        var6.field_e = param2;
        var7 = this;
        synchronized (var7) {
          L0: {
            if (null != ((fd) this).field_p) {
              ((fd) this).field_p.field_f = var6;
              ((fd) this).field_p = var6;
              break L0;
            } else {
              ((fd) this).field_h = var6;
              ((fd) this).field_p = var6;
              break L0;
            }
          }
          L1: {
            this.notify();
            if (param1 == 1) {
              break L1;
            } else {
              field_t = -68L;
              break L1;
            }
          }
        }
        return var6;
    }

    final mh a(byte param0, int param1, Runnable param2) {
        int var4 = -20 / ((param0 - 80) / 41);
        return this.a(0, 1, (Object) (Object) param2, 2, param1);
    }

    fd(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        fg var6 = null;
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
          ((fd) this).field_h = null;
          ((fd) this).field_i = null;
          ((fd) this).field_p = null;
          ((fd) this).field_m = false;
          ((fd) this).field_j = false;
          ((fd) this).field_a = false;
          ((fd) this).field_l = null;
          ((fd) this).field_v = null;
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
        ((fd) this).field_a = stackIn_3_1 != 0;
        field_n = param0;
        field_c = "1.1";
        field_g = param1;
        field_k = "Unknown";
        try {
          field_k = System.getProperty("java.vendor");
          field_c = System.getProperty("java.version");
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (Exception) (Object) decompiledCaughtException;
        }
        L1: {
          if ((field_k.toLowerCase().indexOf("microsoft") ^ -1) != 0) {
            ((fd) this).field_j = true;
            break L1;
          } else {
            break L1;
          }
        }
        try {
          field_b = System.getProperty("os.name");
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = (Exception) (Object) decompiledCaughtException;
          field_b = "Unknown";
        }
        field_d = field_b.toLowerCase();
        try {
          String discarded$4 = System.getProperty("os.arch").toLowerCase();
        } catch (java.lang.Exception decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var5 = (Exception) (Object) decompiledCaughtException;
        }
        try {
          String discarded$5 = System.getProperty("os.version").toLowerCase();
        } catch (java.lang.Exception decompiledCaughtParameter3) {
          decompiledCaughtException = decompiledCaughtParameter3;
          var5 = (Exception) (Object) decompiledCaughtException;
        }
        try {
          L2: {
            field_u = System.getProperty("user.home");
            if (field_u == null) {
              break L2;
            } else {
              field_u = field_u + "/";
              break L2;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          var5 = (Exception) (Object) decompiledCaughtException;
        }
        L3: {
          if (field_u == null) {
            field_u = "~/";
            break L3;
          } else {
            break L3;
          }
        }
        try {
          ((fd) this).field_w = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (java.lang.Throwable decompiledCaughtParameter5) {
          decompiledCaughtException = decompiledCaughtParameter5;
          var5_ref = decompiledCaughtException;
        }
        L4: {
          if (((fd) this).field_j) {
            break L4;
          } else {
            try {
              java.lang.reflect.Method discarded$6 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[1]);
            } catch (java.lang.Exception decompiledCaughtParameter6) {
              decompiledCaughtException = decompiledCaughtParameter6;
              var5 = (Exception) (Object) decompiledCaughtException;
            }
            try {
              field_f = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
            } catch (java.lang.Exception decompiledCaughtParameter7) {
              decompiledCaughtException = decompiledCaughtParameter7;
              var5 = (Exception) (Object) decompiledCaughtException;
            }
            break L4;
          }
        }
        L5: {
          od.a(field_n, field_g, 7154);
          if (!((fd) this).field_a) {
            break L5;
          } else {
            ((fd) this).field_v = new hf(od.a((String) null, 30869, "random.dat", field_n), "rw", 25L);
            ((fd) this).field_i = new hf(od.a(0, "main_file_cache.dat2"), "rw", 314572800L);
            ((fd) this).field_l = new hf(od.a(0, "main_file_cache.idx255"), "rw", 1048576L);
            ((fd) this).field_o = new hf[param2];
            var5_int = 0;
            L6: while (true) {
              if (param2 <= var5_int) {
                L7: {
                  if (((fd) this).field_j) {
                    try {
                      Object discarded$7 = Class.forName("hi").newInstance();
                    } catch (java.lang.Throwable decompiledCaughtParameter8) {
                      decompiledCaughtException = decompiledCaughtParameter8;
                      var5_ref = decompiledCaughtException;
                    }
                    break L7;
                  } else {
                    break L7;
                  }
                }
                try {
                  L8: {
                    if (!((fd) this).field_j) {
                      ((fd) this).field_x = Class.forName("vc").newInstance();
                      break L8;
                    } else {
                      var6 = new fg();
                      ((fd) this).field_e = var6;
                      break L8;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter9) {
                  decompiledCaughtException = decompiledCaughtParameter9;
                  var5_ref = decompiledCaughtException;
                }
                try {
                  L9: {
                    if (!((fd) this).field_j) {
                      ((fd) this).field_q = Class.forName("il").newInstance();
                      break L9;
                    } else {
                      ((fd) this).field_r = new ae();
                      break L9;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter10) {
                  decompiledCaughtException = decompiledCaughtParameter10;
                  var5_ref = decompiledCaughtException;
                }
                break L5;
              } else {
                ((fd) this).field_o[var5_int] = new hf(od.a(0, "main_file_cache.idx" + var5_int), "rw", 1048576L);
                var5_int++;
                continue L6;
              }
            }
          }
        }
        ((fd) this).field_m = false;
        ((fd) this).field_s = new Thread((Runnable) this);
        ((fd) this).field_s.setPriority(10);
        ((fd) this).field_s.setDaemon(true);
        ((fd) this).field_s.start();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
