/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ht implements Runnable {
    java.awt.EventQueue field_x;
    private Object field_f;
    private static int field_w;
    qaa field_h;
    static String field_g;
    private Object field_p;
    static String field_i;
    qaa[] field_v;
    private qp field_d;
    private Thread field_r;
    private static String field_e;
    private static String field_o;
    boolean field_k;
    static java.lang.reflect.Method field_m;
    qaa field_n;
    private static String field_s;
    private eh field_b;
    private boolean field_j;
    private static volatile long field_u;
    private eh field_t;
    static String field_c;
    qaa field_a;
    private pq field_l;
    private boolean field_q;

    private final static qaa a(String param0, String param1, int param2, int param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            Object var7 = null;
            Exception var8 = null;
            qaa var8_ref = null;
            qaa stackIn_15_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            qaa stackOut_14_0 = null;
            String var7_ref = null;
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
            if (param3 == -1) {
              var5_array = new String[]{"c:/rscache/", "/rscache/", field_o, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
              var6 = 0;
              L1: while (true) {
                if (var6 < var5_array.length) {
                  L2: {
                    var7_ref = var5_array[var6];
                    if (-1 <= (var7_ref.length() ^ -1)) {
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
                      var8_ref = new qaa(new File(var7_ref, var4), "rw", 10000L);
                      stackOut_14_0 = (qaa) (var8_ref);
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
              return (qaa) null;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final eh a(byte param0, String param1, int param2) {
        if (param0 < 117) {
            field_o = (String) null;
        }
        return this.a(param2, false, -127, param1);
    }

    final boolean b(int param0) {
        if (!this.field_k) {
            return false;
        }
        if (param0 != 34) {
            return false;
        }
        if (this.field_j) {
            return this.field_d != null ? true : false;
        }
        return null != this.field_f ? true : false;
    }

    final eh a(java.awt.Component param0, boolean param1, int param2) {
        if (param2 <= 122) {
            this.field_q = true;
        }
        return this.a(0, param0, param1 ? 1 : 0, 0, 15);
    }

    final eh a(int param0, int param1, int param2, int param3, int param4) {
        if (param2 < 87) {
            return (eh) null;
        }
        return this.a(param4 + (param0 << -62859664), (Object) null, param3 + (param1 << -671281808), 0, 6);
    }

    final eh a(java.net.URL param0, int param1) {
        int var3 = 54 % ((param1 - -56) / 36);
        return this.a(0, param0, 0, 0, 4);
    }

    final eh a(java.awt.Frame param0, boolean param1) {
        eh discarded$0 = null;
        if (param1) {
            discarded$0 = this.a(-38, -51, 84, 7, -4);
        }
        return this.a(0, param0, 0, 0, 7);
    }

    final eh c(int param0) {
        if (param0 != -1) {
            return (eh) null;
        }
        return this.a(0, (Object) null, 0, 0, 5);
    }

    final eh a(Runnable param0, int param1, int param2) {
        if (param1 != 2) {
            this.a(-34);
        }
        return this.a(0, param0, param2, 0, 2);
    }

    private final eh a(int param0, Object param1, int param2, int param3, int param4) {
        eh var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (param3 == 0) {
            break L0;
          } else {
            this.field_l = (pq) null;
            break L0;
          }
        }
        var6 = new eh();
        var6.field_d = param1;
        var6.field_c = param0;
        var6.field_a = param2;
        var6.field_b = param4;
        var7 = this;
        synchronized (var7) {
          L1: {
            L2: {
              if (null != this.field_b) {
                this.field_b.field_g = var6;
                this.field_b = var6;
                break L2;
              } else {
                this.field_t = var6;
                this.field_b = var6;
                break L2;
              }
            }
            this.notify();
            break L1;
          }
        }
        return var6;
    }

    private final eh a(int param0, boolean param1, int param2, String param3) {
        int var5 = 49 % ((param2 - -66) / 51);
        return this.a(0, param3, param0, 0, param1 ? 22 : 1);
    }

    public final void run() {
        try {
            Object discarded$6 = null;
            Object discarded$7 = null;
            Object discarded$8 = null;
            Object discarded$9 = null;
            Process discarded$10 = null;
            Object discarded$11 = null;
            Object var2 = null;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            en var3_ref = null;
            Exception var3_ref2 = null;
            qaa var3_ref3 = null;
            int var3_int = 0;
            Throwable var4 = null;
            int var4_int = 0;
            String var4_ref = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            Object var8 = null;
            eh var8_ref = null;
            Object[] var9 = null;
            Object[] var10 = null;
            Object[] var11 = null;
            String var12 = null;
            java.awt.Component var13 = null;
            java.awt.Frame var14 = null;
            String var15 = null;
            java.awt.datatransfer.Clipboard var16 = null;
            java.awt.datatransfer.Clipboard var17 = null;
            Thread var18 = null;
            int stackIn_95_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_94_0 = 0;
            int stackOut_93_0 = 0;
            L0: while (true) {
              synchronized (var2) {
                L1: {
                  var8_ref.notify();
                  var2 = this;
                  break L1;
                }
              }
              synchronized (var2) {
                L2: {
                  L3: while (true) {
                    if (this.field_q) {
                      return;
                    } else {
                      if (this.field_t == null) {
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
                          var8_ref = this.field_t;
                          this.field_t = this.field_t.field_g;
                          if (this.field_t == null) {
                            this.field_b = null;
                            break L6;
                          } else {
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
                    var2_int = var8_ref.field_b;
                    if (-2 != (var2_int ^ -1)) {
                      if (var2_int != 22) {
                        if ((var2_int ^ -1) == -3) {
                          var18 = new Thread((Runnable) (var8_ref.field_d));
                          var18.setDaemon(true);
                          var18.start();
                          var18.setPriority(var8_ref.field_a);
                          var8_ref.field_e = var18;
                          break L8;
                        } else {
                          if (4 != var2_int) {
                            if (-9 != (var2_int ^ -1)) {
                              if (var2_int != 9) {
                                if (18 == var2_int) {
                                  var17 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8_ref.field_e = var17.getContents((Object) null);
                                  break L8;
                                } else {
                                  if ((var2_int ^ -1) == -20) {
                                    var7 = (java.awt.datatransfer.Transferable) (var8_ref.field_d);
                                    var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var16.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L8;
                                  } else {
                                    if (this.field_k) {
                                      if (3 == var2_int) {
                                        if (field_u <= f.b((byte) 73)) {
                                          var15 = (255 & var8_ref.field_a >> 541306456) + "." + (var8_ref.field_a >> -1875997232 & 255) + "." + (var8_ref.field_a >> 669500040 & 255) + "." + (255 & var8_ref.field_a);
                                          var8_ref.field_e = java.net.InetAddress.getByName(var15).getHostName();
                                          break L8;
                                        } else {
                                          throw new IOException();
                                        }
                                      } else {
                                        if (21 != var2_int) {
                                          if (var2_int != 5) {
                                            if (6 == var2_int) {
                                              var14 = new java.awt.Frame("Jagex Full Screen");
                                              var8_ref.field_e = var14;
                                              var14.setResizable(false);
                                              if (this.field_j) {
                                                this.field_d.a((byte) -122, var8_ref.field_a & 65535, var8_ref.field_c >> -2136222448, var8_ref.field_a >>> -349671120, var14, 65535 & var8_ref.field_c);
                                                break L8;
                                              } else {
                                                discarded$6 = Class.forName("hma").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_f, new Object[]{var14, new Integer(var8_ref.field_a >>> -1170455984), new Integer(65535 & var8_ref.field_a), new Integer(var8_ref.field_c >> 1214989872), new Integer(var8_ref.field_c & 65535)});
                                                break L8;
                                              }
                                            } else {
                                              if (-8 != (var2_int ^ -1)) {
                                                if (12 == var2_int) {
                                                  var3_ref3 = ht.a(field_e, (String) (var8_ref.field_d), field_w, -1);
                                                  var8_ref.field_e = var3_ref3;
                                                  break L8;
                                                } else {
                                                  if (var2_int != 13) {
                                                    L9: {
                                                      if (!this.field_k) {
                                                        break L9;
                                                      } else {
                                                        if (var2_int != 14) {
                                                          break L9;
                                                        } else {
                                                          var3_int = var8_ref.field_a;
                                                          var4_int = var8_ref.field_c;
                                                          if (this.field_j) {
                                                            this.field_l.a(var4_int, var3_int, 9537);
                                                            break L8;
                                                          } else {
                                                            discarded$7 = Class.forName("br").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_p, new Object[]{new Integer(var3_int), new Integer(var4_int)});
                                                            break L8;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L10: {
                                                      if (!this.field_k) {
                                                        break L10;
                                                      } else {
                                                        if ((var2_int ^ -1) == -16) {
                                                          L11: {
                                                            if (-1 == (var8_ref.field_a ^ -1)) {
                                                              stackOut_94_0 = 0;
                                                              stackIn_95_0 = stackOut_94_0;
                                                              break L11;
                                                            } else {
                                                              stackOut_93_0 = 1;
                                                              stackIn_95_0 = stackOut_93_0;
                                                              break L11;
                                                            }
                                                          }
                                                          var3_int = stackIn_95_0;
                                                          var13 = (java.awt.Component) (var8_ref.field_d);
                                                          if (!this.field_j) {
                                                            discarded$8 = Class.forName("br").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_p, new Object[]{var13, new Boolean(var3_int != 0)});
                                                            break L8;
                                                          } else {
                                                            this.field_l.a(var13, (byte) -86, var3_int != 0);
                                                            break L8;
                                                          }
                                                        } else {
                                                          break L10;
                                                        }
                                                      }
                                                    }
                                                    L12: {
                                                      if (this.field_j) {
                                                        break L12;
                                                      } else {
                                                        if (-18 != (var2_int ^ -1)) {
                                                          break L12;
                                                        } else {
                                                          var11 = (Object[]) (var8_ref.field_d);
                                                          discarded$9 = Class.forName("br").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_p, new Object[]{var11[0], var11[1], new Integer(var8_ref.field_a), new Integer(var8_ref.field_c), var11[2]});
                                                          break L8;
                                                        }
                                                      }
                                                    }
                                                    if (16 != var2_int) {
                                                      throw ht.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    } else {
                                                      try {
                                                        L13: {
                                                          if (!field_i.startsWith("win")) {
                                                            throw ht.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          } else {
                                                            L14: {
                                                              var12 = (String) (var8_ref.field_d);
                                                              if (var12.startsWith("http://")) {
                                                                break L14;
                                                              } else {
                                                                if (var12.startsWith("https://")) {
                                                                  break L14;
                                                                } else {
                                                                  throw ht.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                            var4_ref = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L15: while (true) {
                                                              if (var12.length() <= var5) {
                                                                discarded$10 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var12 + "\"");
                                                                var8_ref.field_e = null;
                                                                break L13;
                                                              } else {
                                                                if (var4_ref.indexOf((int) var12.charAt(var5)) != -1) {
                                                                  var5++;
                                                                  continue L15;
                                                                } else {
                                                                  throw ht.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter1) {
                                                        decompiledCaughtException = decompiledCaughtParameter1;
                                                        var3_ref2 = (Exception) (Object) decompiledCaughtException;
                                                        var8_ref.field_e = var3_ref2;
                                                        throw ht.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                                                      }
                                                      break L8;
                                                    }
                                                  } else {
                                                    var3_ref3 = ht.a("", (String) (var8_ref.field_d), field_w, -1);
                                                    var8_ref.field_e = var3_ref3;
                                                    break L8;
                                                  }
                                                }
                                              } else {
                                                if (!this.field_j) {
                                                  discarded$11 = Class.forName("hma").getMethod("exit", new Class[]{}).invoke(this.field_f, new Object[]{});
                                                  break L8;
                                                } else {
                                                  this.field_d.a(-31, (java.awt.Frame) (var8_ref.field_d));
                                                  break L8;
                                                }
                                              }
                                            }
                                          } else {
                                            if (!this.field_j) {
                                              var8_ref.field_e = Class.forName("hma").getMethod("listmodes", new Class[]{}).invoke(this.field_f, new Object[]{});
                                              break L8;
                                            } else {
                                              var8_ref.field_e = this.field_d.a(101);
                                              break L8;
                                            }
                                          }
                                        } else {
                                          if ((f.b((byte) 73) ^ -1L) > (field_u ^ -1L)) {
                                            throw new IOException();
                                          } else {
                                            var8_ref.field_e = java.net.InetAddress.getByName((String) (var8_ref.field_d)).getAddress();
                                            break L8;
                                          }
                                        }
                                      }
                                    } else {
                                      throw ht.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    }
                                  }
                                }
                              } else {
                                L16: {
                                  var10 = (Object[]) (var8_ref.field_d);
                                  if (this.field_k) {
                                    if (null != ((Class) (var10[0])).getClassLoader()) {
                                      break L16;
                                    } else {
                                      throw new SecurityException();
                                    }
                                  } else {
                                    break L16;
                                  }
                                }
                                var8_ref.field_e = ((Class) (var10[0])).getDeclaredField((String) (var10[1]));
                                break L8;
                              }
                            } else {
                              L17: {
                                var9 = (Object[]) (var8_ref.field_d);
                                if (!this.field_k) {
                                  break L17;
                                } else {
                                  if (((Class) (var9[0])).getClassLoader() != null) {
                                    break L17;
                                  } else {
                                    throw new SecurityException();
                                  }
                                }
                              }
                              var8_ref.field_e = ((Class) (var9[0])).getDeclaredMethod((String) (var9[1]), (Class[]) (var9[2]));
                              break L8;
                            }
                          } else {
                            if ((field_u ^ -1L) >= (f.b((byte) 73) ^ -1L)) {
                              var8_ref.field_e = new DataInputStream(((java.net.URL) (var8_ref.field_d)).openStream());
                              break L8;
                            } else {
                              throw new IOException();
                            }
                          }
                        }
                      } else {
                        if ((f.b((byte) 73) ^ -1L) <= (field_u ^ -1L)) {
                          try {
                              if (false) throw (en) null;
                            L18: {
                              var8_ref.field_e = lda.a((String) (var8_ref.field_d), var8_ref.field_a, (byte) -113).a((byte) -70);
                              break L18;
                            }
                          } catch (en decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref = (en) (Object) decompiledCaughtException;
                            var8_ref.field_e = var3_ref.getMessage();
                            throw var3_ref;
                          }
                          break L8;
                        } else {
                          throw new IOException();
                        }
                      }
                    } else {
                      if ((f.b((byte) 73) ^ -1L) > (field_u ^ -1L)) {
                        throw new IOException();
                      } else {
                        var8_ref.field_e = new java.net.Socket(java.net.InetAddress.getByName((String) (var8_ref.field_d)), var8_ref.field_a);
                        break L8;
                      }
                    }
                  }
                  var8_ref.field_f = 1;
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
                  var8_ref.field_f = 2;
                  break L19;
                }
              }
              var2 = var8_ref;
              continue L0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0) {
        try {
            InterruptedException var2 = null;
            IOException var2_ref = null;
            int var2_int = 0;
            Object var2_ref2 = null;
            Throwable var3 = null;
            IOException var3_ref = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (param0 > 20) {
                break L0;
              } else {
                this.a(-108);
                break L0;
              }
            }
            var2_ref2 = this;
            synchronized (var2_ref2) {
              L1: {
                this.field_q = true;
                this.notifyAll();
                break L1;
              }
            }
            try {
              L2: {
                this.field_r.join();
                break L2;
              }
            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L3: {
                var2 = (InterruptedException) (Object) decompiledCaughtException;
                break L3;
              }
            }
            L4: {
              if (null == this.field_h) {
                break L4;
              } else {
                try {
                  L5: {
                    this.field_h.a(true);
                    break L5;
                  }
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L6: {
                    var2_ref = (IOException) (Object) decompiledCaughtException;
                    break L6;
                  }
                }
                break L4;
              }
            }
            L7: {
              if (null != this.field_n) {
                try {
                  L8: {
                    this.field_n.a(true);
                    break L8;
                  }
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L9: {
                    var2_ref = (IOException) (Object) decompiledCaughtException;
                    break L9;
                  }
                }
                break L7;
              } else {
                break L7;
              }
            }
            L10: {
              if (null != this.field_v) {
                var2_int = 0;
                L11: while (true) {
                  if (this.field_v.length <= var2_int) {
                    break L10;
                  } else {
                    if (null != this.field_v[var2_int]) {
                      try {
                        L12: {
                          this.field_v[var2_int].a(true);
                          var2_int++;
                          break L12;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L13: {
                          var3_ref = (IOException) (Object) decompiledCaughtException;
                          var2_int++;
                          break L13;
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
              if (null == this.field_a) {
                break L14;
              } else {
                try {
                  L15: {
                    this.field_a.a(true);
                    break L15;
                  }
                } catch (java.io.IOException decompiledCaughtParameter4) {
                  decompiledCaughtException = decompiledCaughtParameter4;
                  L16: {
                    var2_ref = (IOException) (Object) decompiledCaughtException;
                    break L16;
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

    final eh a(String param0, Class param1, int param2) {
        if (param2 >= -127) {
            return (eh) null;
        }
        return this.a(0, new Object[]{param1, param0}, 0, 0, 9);
    }

    final eh a(int param0, Class param1, Class[] param2, String param3) {
        if (param0 != 31633) {
            field_o = (String) null;
        }
        return this.a(0, new Object[]{param1, param3, param2}, 0, param0 + -31633, 8);
    }

    ht(int param0, String param1, int param2, boolean param3) throws Exception {
        String discarded$8 = null;
        String discarded$9 = null;
        java.lang.reflect.Method discarded$10 = null;
        Object discarded$11 = null;
        Exception exception = null;
        Throwable throwable = null;
        int var5_int = 0;
        qp var7 = null;
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
          this.field_k = false;
          this.field_h = null;
          this.field_b = null;
          this.field_j = false;
          this.field_n = null;
          this.field_a = null;
          this.field_q = false;
          this.field_t = null;
          field_e = param1;
          field_w = param0;
          field_g = "Unknown";
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
        ((ht) (this)).field_k = stackIn_3_1 != 0;
        field_c = "1.1";
        try {
          L1: {
            field_g = System.getProperty("java.vendor");
            field_c = System.getProperty("java.version");
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
          if (0 != (field_g.toLowerCase().indexOf("microsoft") ^ -1)) {
            this.field_j = true;
            break L3;
          } else {
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
            exception = (Exception) (Object) decompiledCaughtException;
            field_s = "Unknown";
            break L5;
          }
        }
        field_i = field_s.toLowerCase();
        try {
          L6: {
            discarded$8 = System.getProperty("os.arch").toLowerCase();
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
            discarded$9 = System.getProperty("os.version").toLowerCase();
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
              field_o = System.getProperty("user.home");
              if (field_o == null) {
                break L11;
              } else {
                field_o = field_o + "/";
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
          if (null != field_o) {
            break L13;
          } else {
            field_o = "~/";
            break L13;
          }
        }
        try {
          L14: {
            this.field_x = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
          if (this.field_j) {
            break L16;
          } else {
            try {
              L17: {
                discarded$10 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[]{Boolean.TYPE});
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
                field_m = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
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
          }
        }
        L21: {
          hu.a(0, field_w, field_e);
          if (!this.field_k) {
            break L21;
          } else {
            this.field_a = new qaa(hu.a(field_w, "random.dat", (String) null, 1), "rw", 25L);
            this.field_h = new qaa(hu.a("main_file_cache.dat2", 0), "rw", 314572800L);
            this.field_n = new qaa(hu.a("main_file_cache.idx255", 0), "rw", 1048576L);
            this.field_v = new qaa[param2];
            var5_int = 0;
            L22: while (true) {
              if (var5_int >= param2) {
                L23: {
                  if (!this.field_j) {
                    break L23;
                  } else {
                    try {
                      L24: {
                        discarded$11 = Class.forName("cna").newInstance();
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
                  }
                }
                try {
                  L26: {
                    L27: {
                      if (this.field_j) {
                        var7 = new qp();
                        this.field_d = var7;
                        break L27;
                      } else {
                        this.field_f = Class.forName("hma").newInstance();
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
                      if (!this.field_j) {
                        this.field_p = Class.forName("br").newInstance();
                        break L30;
                      } else {
                        this.field_l = new pq();
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
                this.field_v[var5_int] = new qaa(hu.a("main_file_cache.idx" + var5_int, 0), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        this.field_q = false;
        this.field_r = new Thread((Runnable) (this));
        this.field_r.setPriority(10);
        this.field_r.setDaemon(true);
        this.field_r.start();
    }

    static {
        field_u = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
