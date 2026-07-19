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
            this.field_r = (ae) null;
        }
        return this.a(param4 + (param2 << 16), 1, (Object) null, 6, (param3 << 16) + param1);
    }

    final mh a(int param0, String param1, int param2) {
        mh discarded$0 = null;
        if (param0 <= 98) {
            String var5 = (String) null;
            discarded$0 = this.a(12, true, -60, (String) null);
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
              L0: {
                this.field_m = true;
                this.notifyAll();
                break L0;
              }
            }
            try {
              L1: {
                L2: {
                  this.field_s.join();
                  if (param0 == 0) {
                    break L2;
                  } else {
                    this.a(-106);
                    break L2;
                  }
                }
                break L1;
              }
            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L3: {
                var2_ref = (InterruptedException) (Object) decompiledCaughtException;
                break L3;
              }
            }
            L4: {
              if (this.field_i != null) {
                try {
                  L5: {
                    this.field_i.a(-72);
                    break L5;
                  }
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L6: {
                    var2_ref2 = (IOException) (Object) decompiledCaughtException;
                    break L6;
                  }
                }
                break L4;
              } else {
                break L4;
              }
            }
            L7: {
              if (null != this.field_l) {
                try {
                  L8: {
                    this.field_l.a(param0 + -55);
                    break L8;
                  }
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L9: {
                    var2_ref2 = (IOException) (Object) decompiledCaughtException;
                    break L9;
                  }
                }
                break L7;
              } else {
                break L7;
              }
            }
            L10: {
              if (null != this.field_o) {
                var2_int = 0;
                L11: while (true) {
                  if (~var2_int <= ~this.field_o.length) {
                    break L10;
                  } else {
                    if (null != this.field_o[var2_int]) {
                      try {
                        L12: {
                          this.field_o[var2_int].a(param0 ^ -71);
                          break L12;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L13: {
                          var3_ref = (IOException) (Object) decompiledCaughtException;
                          break L13;
                        }
                      }
                      var2_int++;
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
              if (this.field_v == null) {
                break L14;
              } else {
                try {
                  L15: {
                    this.field_v.a(-72);
                    break L15;
                  }
                } catch (java.io.IOException decompiledCaughtParameter4) {
                  decompiledCaughtException = decompiledCaughtParameter4;
                  L16: {
                    var2_ref2 = (IOException) (Object) decompiledCaughtException;
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

    final mh a(boolean param0, String param1, Class param2) {
        if (param0) {
            return (mh) null;
        }
        return this.a(0, 1, new Object[]{param2, param1}, 9, 0);
    }

    private final mh a(int param0, boolean param1, int param2, String param3) {
        if (param2 != -10742) {
            this.field_h = (mh) null;
        }
        return this.a(0, 1, param3, param1 ? 22 : 1, param0);
    }

    final boolean b(int param0) {
        if (param0 != -86) {
            return false;
        }
        if (!(this.field_a)) {
            return false;
        }
        if (this.field_j) {
            return null != this.field_e ? true : false;
        }
        return this.field_x != null ? true : false;
    }

    final mh a(int param0, String param1, Class param2, Class[] param3) {
        if (param0 != -10962) {
            field_f = (java.lang.reflect.Method) null;
        }
        return this.a(0, param0 ^ -10961, new Object[]{param2, param1, param3}, 8, 0);
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
            hf stackIn_12_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            hf stackOut_11_0 = null;
            L0: {
              if (33 == param3) {
                var4 = "jagex_" + param1 + "_preferences" + param2 + "_rc.dat";
                break L0;
              } else {
                if (param3 == 34) {
                  var4 = "jagex_" + param1 + "_preferences" + param2 + "_wip.dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param1 + "_preferences" + param2 + ".dat";
                  break L0;
                }
              }
            }
            var5_array = new String[]{"c:/rscache/", "/rscache/", field_u, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            var6 = 0;
            L1: while (true) {
              if (~var5_array.length < ~var6) {
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
                    var8_ref = new hf(new File(var7, var4), "rw", 10000L);
                    stackOut_11_0 = (hf) (var8_ref);
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

    final mh a(int param0, java.awt.Frame param1) {
        if (param0 != 75254128) {
            return (mh) null;
        }
        return this.a(0, 1, param1, 7, 0);
    }

    public final void run() {
        try {
            Object discarded$6 = null;
            Object discarded$7 = null;
            Object discarded$8 = null;
            Process discarded$9 = null;
            Object discarded$10 = null;
            Object discarded$11 = null;
            ThreadDeath var2 = null;
            Throwable var2_ref = null;
            Object var2_ref2 = null;
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
            Throwable decompiledCaughtException = null;
            int stackOut_94_0 = 0;
            int stackOut_93_0 = 0;
            var16 = null;
            var17 = null;
            L0: while (true) {
              var2_ref2 = this;
              synchronized (var2_ref2) {
                L1: {
                  L2: while (true) {
                    if (!this.field_m) {
                      if (this.field_h != null) {
                        L3: {
                          var8_ref = this.field_h;
                          this.field_h = this.field_h.field_f;
                          if (null == this.field_h) {
                            this.field_p = null;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        break L1;
                      } else {
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
                    var2_int = var8_ref.field_d;
                    if (var2_int == 1) {
                      if (ik.a(4) >= field_t) {
                        var8_ref.field_b = new java.net.Socket(java.net.InetAddress.getByName((String) (var8_ref.field_e)), var8_ref.field_g);
                        break L7;
                      } else {
                        throw new IOException();
                      }
                    } else {
                      if (var2_int != 22) {
                        if (var2_int == 2) {
                          var18 = new Thread((Runnable) (var8_ref.field_e));
                          var18.setDaemon(true);
                          var18.start();
                          var18.setPriority(var8_ref.field_g);
                          var8_ref.field_b = var18;
                          break L7;
                        } else {
                          if (4 == var2_int) {
                            if (field_t > ik.a(4)) {
                              throw new IOException();
                            } else {
                              var8_ref.field_b = new DataInputStream(((java.net.URL) (var8_ref.field_e)).openStream());
                              break L7;
                            }
                          } else {
                            if (var2_int != 8) {
                              if (var2_int != 9) {
                                if (var2_int != 18) {
                                  if (var2_int != 19) {
                                    if (!this.field_a) {
                                      throw fd.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                    } else {
                                      if (var2_int != 3) {
                                        if (var2_int == 21) {
                                          if (field_t <= ik.a(4)) {
                                            var8_ref.field_b = java.net.InetAddress.getByName((String) (var8_ref.field_e)).getAddress();
                                            break L7;
                                          } else {
                                            throw new IOException();
                                          }
                                        } else {
                                          if (var2_int != 5) {
                                            if (6 != var2_int) {
                                              if (var2_int != 7) {
                                                if (12 == var2_int) {
                                                  var3_ref3 = fd.a((byte) -32, field_g, (String) (var8_ref.field_e), field_n);
                                                  var8_ref.field_b = var3_ref3;
                                                  break L7;
                                                } else {
                                                  if (var2_int != 13) {
                                                    L8: {
                                                      if (!this.field_a) {
                                                        break L8;
                                                      } else {
                                                        if (var2_int == 14) {
                                                          var3_int = var8_ref.field_g;
                                                          var4 = var8_ref.field_a;
                                                          if (this.field_j) {
                                                            this.field_r.a(var3_int, var4, (byte) -98);
                                                            break L7;
                                                          } else {
                                                            discarded$6 = Class.forName("il").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.field_q, new Object[]{new Integer(var3_int), new Integer(var4)});
                                                            break L7;
                                                          }
                                                        } else {
                                                          break L8;
                                                        }
                                                      }
                                                    }
                                                    L9: {
                                                      if (!this.field_a) {
                                                        break L9;
                                                      } else {
                                                        if (15 == var2_int) {
                                                          L10: {
                                                            if (var8_ref.field_g == 0) {
                                                              stackOut_94_0 = 0;
                                                              stackIn_95_0 = stackOut_94_0;
                                                              break L10;
                                                            } else {
                                                              stackOut_93_0 = 1;
                                                              stackIn_95_0 = stackOut_93_0;
                                                              break L10;
                                                            }
                                                          }
                                                          var3_int = stackIn_95_0;
                                                          var17_ref = (java.awt.Component) (var8_ref.field_e);
                                                          if (this.field_j) {
                                                            this.field_r.a(var3_int != 0, var17_ref, (byte) 111);
                                                            break L7;
                                                          } else {
                                                            discarded$7 = Class.forName("il").getDeclaredMethod("showcursor", new Class[]{java.awt.Component.class, Boolean.TYPE}).invoke(this.field_q, new Object[]{var17_ref, new Boolean(var3_int != 0)});
                                                            break L7;
                                                          }
                                                        } else {
                                                          break L9;
                                                        }
                                                      }
                                                    }
                                                    L11: {
                                                      if (this.field_j) {
                                                        break L11;
                                                      } else {
                                                        if (var2_int != 17) {
                                                          break L11;
                                                        } else {
                                                          var15 = (Object[]) (var8_ref.field_e);
                                                          discarded$8 = Class.forName("il").getDeclaredMethod("setcustomcursor", new Class[]{java.awt.Component.class, int[].class, Integer.TYPE, Integer.TYPE, java.awt.Point.class}).invoke(this.field_q, new Object[]{var15[0], var15[1], new Integer(var8_ref.field_g), new Integer(var8_ref.field_a), var15[2]});
                                                          break L7;
                                                        }
                                                      }
                                                    }
                                                    if (16 == var2_int) {
                                                      try {
                                                        L12: {
                                                          if (!field_d.startsWith("win")) {
                                                            throw fd.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                          } else {
                                                            L13: {
                                                              var16_ref = (String) (var8_ref.field_e);
                                                              if (var16_ref.startsWith("http://")) {
                                                                break L13;
                                                              } else {
                                                                if (!var16_ref.startsWith("https://")) {
                                                                  throw fd.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                } else {
                                                                  break L13;
                                                                }
                                                              }
                                                            }
                                                            var4_ref_String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            var5 = 0;
                                                            L14: while (true) {
                                                              if (~var16_ref.length() >= ~var5) {
                                                                discarded$9 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var16_ref + "\"");
                                                                var8_ref.field_b = null;
                                                                break L12;
                                                              } else {
                                                                if (var4_ref_String.indexOf((int) var16_ref.charAt(var5)) != -1) {
                                                                  var5++;
                                                                  continue L14;
                                                                } else {
                                                                  throw fd.<RuntimeException>$cfr$sneakyThrow(new Exception());
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } catch (java.lang.Exception decompiledCaughtParameter1) {
                                                        decompiledCaughtException = decompiledCaughtParameter1;
                                                        var3_ref2 = (Exception) (Object) decompiledCaughtException;
                                                        var8_ref.field_b = var3_ref2;
                                                        throw fd.<RuntimeException>$cfr$sneakyThrow(var3_ref2);
                                                      }
                                                      break L7;
                                                    } else {
                                                      throw fd.<RuntimeException>$cfr$sneakyThrow(new Exception(""));
                                                    }
                                                  } else {
                                                    var3_ref3 = fd.a((byte) -32, "", (String) (var8_ref.field_e), field_n);
                                                    var8_ref.field_b = var3_ref3;
                                                    break L7;
                                                  }
                                                }
                                              } else {
                                                if (this.field_j) {
                                                  this.field_e.a((java.awt.Frame) (var8_ref.field_e), (byte) 122);
                                                  break L7;
                                                } else {
                                                  discarded$10 = Class.forName("vc").getMethod("exit", new Class[]{}).invoke(this.field_x, new Object[]{});
                                                  break L7;
                                                }
                                              }
                                            } else {
                                              var14 = new java.awt.Frame("Jagex Full Screen");
                                              var8_ref.field_b = var14;
                                              var14.setResizable(false);
                                              if (!this.field_j) {
                                                discarded$11 = Class.forName("vc").getMethod("enter", new Class[]{java.awt.Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.field_x, new Object[]{var14, new Integer(var8_ref.field_g >>> 16), new Integer(var8_ref.field_g & 65535), new Integer(var8_ref.field_a >> 16), new Integer(var8_ref.field_a & 65535)});
                                                break L7;
                                              } else {
                                                this.field_e.a(var8_ref.field_a >> 16, false, var8_ref.field_g >>> 16, var8_ref.field_g & 65535, var8_ref.field_a & 65535, var14);
                                                break L7;
                                              }
                                            }
                                          } else {
                                            if (!this.field_j) {
                                              var8_ref.field_b = Class.forName("vc").getMethod("listmodes", new Class[]{}).invoke(this.field_x, new Object[]{});
                                              break L7;
                                            } else {
                                              var8_ref.field_b = this.field_e.a(0);
                                              break L7;
                                            }
                                          }
                                        }
                                      } else {
                                        if (~field_t < ~ik.a(4)) {
                                          throw new IOException();
                                        } else {
                                          var13 = (var8_ref.field_g >> 24 & 255) + "." + (255 & var8_ref.field_g >> 16) + "." + ((var8_ref.field_g & 65502) >> 8) + "." + (255 & var8_ref.field_g);
                                          var8_ref.field_b = java.net.InetAddress.getByName(var13).getHostName();
                                          break L7;
                                        }
                                      }
                                    }
                                  } else {
                                    var7 = (java.awt.datatransfer.Transferable) (var8_ref.field_e);
                                    var12 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var12.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                                    break L7;
                                  }
                                } else {
                                  var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                                  var8_ref.field_b = var11.getContents((Object) null);
                                  break L7;
                                }
                              } else {
                                L15: {
                                  var10 = (Object[]) (var8_ref.field_e);
                                  if (this.field_a) {
                                    if (null == ((Class) (var10[0])).getClassLoader()) {
                                      throw new SecurityException();
                                    } else {
                                      break L15;
                                    }
                                  } else {
                                    break L15;
                                  }
                                }
                                var8_ref.field_b = ((Class) (var10[0])).getDeclaredField((String) (var10[1]));
                                break L7;
                              }
                            } else {
                              L16: {
                                var9 = (Object[]) (var8_ref.field_e);
                                if (this.field_a) {
                                  if (((Class) (var9[0])).getClassLoader() == null) {
                                    throw new SecurityException();
                                  } else {
                                    break L16;
                                  }
                                } else {
                                  break L16;
                                }
                              }
                              var8_ref.field_b = ((Class) (var9[0])).getDeclaredMethod((String) (var9[1]), (Class[]) (var9[2]));
                              break L7;
                            }
                          }
                        }
                      } else {
                        if (~ik.a(4) <= ~field_t) {
                          try {
                              if (false) throw (db) null;
                            L17: {
                              var8_ref.field_b = pn.a((String) (var8_ref.field_e), var8_ref.field_g, 23155).a(-7);
                              break L17;
                            }
                          } catch (db decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var3_ref = (db) (Object) decompiledCaughtException;
                            var8_ref.field_b = var3_ref.getMessage();
                            throw var3_ref;
                          }
                          break L7;
                        } else {
                          throw new IOException();
                        }
                      }
                    }
                  }
                  var8_ref.field_c = 1;
                  break L6;
                }
              } catch (java.lang.ThreadDeath decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var2 = (ThreadDeath) (Object) decompiledCaughtException;
                throw var2;
              } catch (java.lang.Throwable decompiledCaughtParameter4) {
                decompiledCaughtException = decompiledCaughtParameter4;
                L18: {
                  var2_ref = decompiledCaughtException;
                  var8_ref.field_c = 2;
                  break L18;
                }
              }
              var2_ref2 = var8_ref;
              synchronized (var2_ref2) {
                L19: {
                  var8_ref.notify();
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

    final mh a(java.net.URL param0, byte param1) {
        int var3 = -74 % ((-9 - param1) / 45);
        return this.a(0, 1, param0, 4, 0);
    }

    final mh a(byte param0) {
        if (param0 <= 121) {
            return (mh) null;
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
            L1: {
              if (null != this.field_p) {
                this.field_p.field_f = var6;
                this.field_p = var6;
                break L1;
              } else {
                this.field_h = var6;
                this.field_p = var6;
                break L1;
              }
            }
            L2: {
              this.notify();
              if (param1 == 1) {
                break L2;
              } else {
                field_t = -68L;
                break L2;
              }
            }
            break L0;
          }
        }
        return var6;
    }

    final mh a(byte param0, int param1, Runnable param2) {
        int var4 = -20 / ((param0 - 80) / 41);
        return this.a(0, 1, param2, 2, param1);
    }

    fd(int param0, String param1, int param2, boolean param3) throws Exception {
        String discarded$8 = null;
        String discarded$9 = null;
        java.lang.reflect.Method discarded$10 = null;
        Object discarded$11 = null;
        Exception exception = null;
        Throwable throwable = null;
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
          this.field_h = null;
          this.field_i = null;
          this.field_p = null;
          this.field_m = false;
          this.field_j = false;
          this.field_a = false;
          this.field_l = null;
          this.field_v = null;
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
        ((fd) (this)).field_a = stackIn_3_1 != 0;
        field_n = param0;
        field_c = "1.1";
        field_g = param1;
        field_k = "Unknown";
        try {
          L1: {
            field_k = System.getProperty("java.vendor");
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
          if (field_k.toLowerCase().indexOf("microsoft") != -1) {
            this.field_j = true;
            break L3;
          } else {
            break L3;
          }
        }
        try {
          L4: {
            field_b = System.getProperty("os.name");
            break L4;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            exception = (Exception) (Object) decompiledCaughtException;
            field_b = "Unknown";
            break L5;
          }
        }
        field_d = field_b.toLowerCase();
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
              field_u = System.getProperty("user.home");
              if (field_u == null) {
                break L11;
              } else {
                field_u = field_u + "/";
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
          if (field_u == null) {
            field_u = "~/";
            break L13;
          } else {
            break L13;
          }
        }
        try {
          L14: {
            this.field_w = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
                field_f = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
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
          od.a(field_n, field_g, 7154);
          if (!this.field_a) {
            break L21;
          } else {
            this.field_v = new hf(od.a((String) null, 30869, "random.dat", field_n), "rw", 25L);
            this.field_i = new hf(od.a(0, "main_file_cache.dat2"), "rw", 314572800L);
            this.field_l = new hf(od.a(0, "main_file_cache.idx255"), "rw", 1048576L);
            this.field_o = new hf[param2];
            var5_int = 0;
            L22: while (true) {
              if (param2 <= var5_int) {
                L23: {
                  if (this.field_j) {
                    try {
                      L24: {
                        discarded$11 = Class.forName("hi").newInstance();
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
                      if (!this.field_j) {
                        this.field_x = Class.forName("vc").newInstance();
                        break L27;
                      } else {
                        var6 = new fg();
                        this.field_e = var6;
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
                        this.field_q = Class.forName("il").newInstance();
                        break L30;
                      } else {
                        this.field_r = new ae();
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
                this.field_o[var5_int] = new hf(od.a(0, "main_file_cache.idx" + var5_int), "rw", 1048576L);
                var5_int++;
                continue L22;
              }
            }
          }
        }
        this.field_m = false;
        this.field_s = new Thread((Runnable) (this));
        this.field_s.setPriority(10);
        this.field_s.setDaemon(true);
        this.field_s.start();
    }

    static {
        field_t = 0L;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
