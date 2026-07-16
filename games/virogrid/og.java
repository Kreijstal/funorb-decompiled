/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class og implements Runnable {
    private jc field_p;
    private un field_m;
    static int field_s;
    static String field_e;
    static String field_k;
    private un field_q;
    static il field_l;
    static String field_c;
    static boolean[] field_j;
    static int field_b;
    private DataInputStream field_i;
    private pd field_f;
    static String field_n;
    private int field_h;
    static String[] field_o;
    static km[] field_g;
    static String[] field_t;
    private un field_d;
    private java.net.URL field_r;
    static String field_a;

    final static void a(int param0, int param1, int param2, int[] param3, int param4, byte param5, int param6) {
        ag.field_j[param0] = param3;
        ag.field_b[param0] = param6;
        ag.field_h[param0] = param1;
        ag.field_f[param0] = param2;
        if (param5 < 57) {
          return;
        } else {
          ag.field_a[param0] = param4;
          return;
        }
    }

    final synchronized boolean a(int param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        Throwable decompiledCaughtException = null;
        if (((og) this).field_h < 2) {
          L0: {
            if (((og) this).field_h != 0) {
              break L0;
            } else {
              L1: {
                if (((og) this).field_d == null) {
                  ((og) this).field_d = ((og) this).field_f.a(((og) this).field_r, true);
                  break L1;
                } else {
                  break L1;
                }
              }
              if (((og) this).field_d.field_a == 0) {
                return false;
              } else {
                if (((og) this).field_d.field_a == 1) {
                  break L0;
                } else {
                  ((og) this).field_h = ((og) this).field_h + 1;
                  ((og) this).field_d = null;
                  return false;
                }
              }
            }
          }
          L2: {
            if (-2 == (((og) this).field_h ^ -1)) {
              L3: {
                if (null == ((og) this).field_q) {
                  ((og) this).field_q = ((og) this).field_f.a(443, 27402, ((og) this).field_r.getHost());
                  break L3;
                } else {
                  break L3;
                }
              }
              if (((og) this).field_q.field_a != 0) {
                if (((og) this).field_q.field_a != 1) {
                  ((og) this).field_h = ((og) this).field_h + 1;
                  ((og) this).field_q = null;
                  return false;
                } else {
                  break L2;
                }
              } else {
                return false;
              }
            } else {
              break L2;
            }
          }
          if (((og) this).field_i == null) {
            try {
              L4: {
                L5: {
                  if (-1 != (((og) this).field_h ^ -1)) {
                    break L5;
                  } else {
                    ((og) this).field_i = (DataInputStream) ((og) this).field_d.field_f;
                    break L5;
                  }
                }
                L6: {
                  if (1 == ((og) this).field_h) {
                    var4 = (java.net.Socket) ((og) this).field_q.field_f;
                    var4.setSoTimeout(10000);
                    var3 = var4.getOutputStream();
                    var3.write(17);
                    var5 = (CharSequence) (Object) ("JAGGRAB " + ((og) this).field_r.getFile() + "\n\n");
                    var3.write(ak.a(param0 ^ 5700, var5));
                    ((og) this).field_i = new DataInputStream(var4.getInputStream());
                    break L6;
                  } else {
                    break L6;
                  }
                }
                ((og) this).field_p.field_l = 0;
                break L4;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L7: {
                var2 = (IOException) (Object) decompiledCaughtException;
                ((og) this).finalize();
                ((og) this).field_h = ((og) this).field_h + 1;
                if (((og) this).field_m == null) {
                  ((og) this).field_m = ((og) this).field_f.a(5, (Runnable) this, 255);
                  break L7;
                } else {
                  break L7;
                }
              }
              if (param0 == 5038) {
                if (0 != ((og) this).field_m.field_a) {
                  if (1 != ((og) this).field_m.field_a) {
                    ((og) this).finalize();
                    ((og) this).field_h = ((og) this).field_h + 1;
                    return false;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                ((og) this).field_m = null;
                if (0 != ((og) this).field_m.field_a) {
                  if (1 == ((og) this).field_m.field_a) {
                    return false;
                  } else {
                    ((og) this).finalize();
                    ((og) this).field_h = ((og) this).field_h + 1;
                    return false;
                  }
                } else {
                  return false;
                }
              }
            }
            L8: {
              if (((og) this).field_m == null) {
                ((og) this).field_m = ((og) this).field_f.a(5, (Runnable) this, 255);
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (param0 == 5038) {
                break L9;
              } else {
                ((og) this).field_m = null;
                break L9;
              }
            }
            if (0 == ((og) this).field_m.field_a) {
              return false;
            } else {
              L10: {
                if (1 == ((og) this).field_m.field_a) {
                  break L10;
                } else {
                  ((og) this).finalize();
                  ((og) this).field_h = ((og) this).field_h + 1;
                  break L10;
                }
              }
              return false;
            }
          } else {
            L11: {
              if (((og) this).field_m == null) {
                ((og) this).field_m = ((og) this).field_f.a(5, (Runnable) this, 255);
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              if (param0 == 5038) {
                break L12;
              } else {
                ((og) this).field_m = null;
                break L12;
              }
            }
            if (0 != ((og) this).field_m.field_a) {
              if (1 != ((og) this).field_m.field_a) {
                ((og) this).finalize();
                ((og) this).field_h = ((og) this).field_h + 1;
                return false;
              } else {
                return false;
              }
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    final static String a(String param0, int param1, byte param2, String param3) {
        hg var5 = null;
        int var6 = 0;
        int var7 = 0;
        gh var8 = null;
        CharSequence var9 = null;
        var9 = (CharSequence) (Object) param3;
        if (!dm.a(var9, -1478)) {
          return sa.field_l;
        } else {
          if ((oa.field_q ^ -1) != -3) {
            return dh.field_l;
          } else {
            var8 = kh.a((byte) 75, param0);
            if (var8 == null) {
              return oi.a(new String[1], a.field_z, 2);
            } else {
              var8.a(false);
              var8.c(102);
              mj.field_z = mj.field_z - 1;
              var6 = 24 % ((param2 - -33) / 45);
              var5 = gk.field_g;
              var5.g(param1, 8);
              var5.field_l = var5.field_l + 1;
              var7 = var5.field_l;
              var5.a(3, 124);
              var5.a(param3, (byte) -96);
              var5.b(-var7 + var5.field_l, -1);
              return null;
            }
          }
        }
    }

    public final void run() {
        try {
            int var1_int = 0;
            Exception var1 = null;
            Object var1_ref = null;
            Throwable var2 = null;
            Object var2_ref = null;
            Throwable var3 = null;
            int var4 = 0;
            int var5 = 0;
            int var6 = 0;
            Throwable decompiledCaughtException = null;
            var4 = Virogrid.field_F ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  L2: {
                    L3: {
                      L4: {
                        if (((og) this).field_p.field_g.length <= ((og) this).field_p.field_l) {
                          break L4;
                        } else {
                          var1_int = ((og) this).field_i.read(((og) this).field_p.field_g, ((og) this).field_p.field_l, -((og) this).field_p.field_l + ((og) this).field_p.field_g.length);
                          var6 = var1_int ^ -1;
                          var5 = -1;
                          if (var4 != 0) {
                            if (var5 != var6) {
                              break L2;
                            } else {
                              break L3;
                            }
                          } else {
                            if (var5 < var6) {
                              break L4;
                            } else {
                              ((og) this).field_p.field_l = ((og) this).field_p.field_l + var1_int;
                              if (var4 == 0) {
                                continue L1;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                      }
                      if (((og) this).field_p.field_l != ((og) this).field_p.field_g.length) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                    throw og.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + ((og) this).field_p.field_g.length + " " + ((og) this).field_r));
                  }
                  var1_ref = this;
                  synchronized (var1_ref) {
                    L5: {
                      ((og) this).finalize();
                      ((og) this).field_h = 3;
                      break L5;
                    }
                  }
                  break L0;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (Exception) (Object) decompiledCaughtException;
              var2_ref = this;
              synchronized (var2_ref) {
                L6: {
                  ((og) this).finalize();
                  ((og) this).field_h = ((og) this).field_h + 1;
                  break L6;
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

    final static String c(int param0) {
        String var1 = null;
        Object var2 = null;
        var1 = "";
        if (param0 > -47) {
          L0: {
            var2 = null;
            og.a(-2, -25, -21, (int[]) null, 58, (byte) 13, 49);
            if (aa.field_a == null) {
              break L0;
            } else {
              var1 = aa.field_a.f(-3);
              break L0;
            }
          }
          L1: {
            if (var1.length() != 0) {
              break L1;
            } else {
              var1 = hh.b((byte) -123);
              break L1;
            }
          }
          L2: {
            if (var1.length() == 0) {
              var1 = tl.field_f;
              break L2;
            } else {
              break L2;
            }
          }
          return var1;
        } else {
          L3: {
            if (aa.field_a == null) {
              break L3;
            } else {
              var1 = aa.field_a.f(-3);
              break L3;
            }
          }
          L4: {
            if (var1.length() != 0) {
              break L4;
            } else {
              var1 = hh.b((byte) -123);
              break L4;
            }
          }
          L5: {
            if (var1.length() == 0) {
              var1 = tl.field_f;
              break L5;
            } else {
              break L5;
            }
          }
          return var1;
        }
    }

    protected final void finalize() {
        if (!(null == ((og) this).field_d)) {
            if (!(((og) this).field_d.field_f == null)) {
                try {
                    ((DataInputStream) ((og) this).field_d.field_f).close();
                } catch (Exception exception) {
                }
            }
            ((og) this).field_d = null;
        }
        if (!(null == ((og) this).field_q)) {
            if (null != ((og) this).field_q.field_f) {
                try {
                    ((java.net.Socket) ((og) this).field_q.field_f).close();
                } catch (Exception exception) {
                }
            }
            ((og) this).field_q = null;
        }
        if (((og) this).field_i != null) {
            try {
                ((og) this).field_i.close();
            } catch (Exception exception) {
            }
            ((og) this).field_i = null;
        }
        ((og) this).field_m = null;
    }

    final jc d(int param0) {
        if (param0 != 18240) {
            ((og) this).field_p = null;
            if (!(3 != ((og) this).field_h)) {
                return ((og) this).field_p;
            }
            return null;
        }
        if (!(3 != ((og) this).field_h)) {
            return ((og) this).field_p;
        }
        return null;
    }

    final static String a(String param0, boolean param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        gh var7_ref = null;
        gh var8 = null;
        hg var9 = null;
        CharSequence var10 = null;
        var7 = null;
        var6 = Virogrid.field_F ? 1 : 0;
        var10 = (CharSequence) (Object) param0;
        if (dm.a(var10, -1478)) {
          if (oa.field_q == 2) {
            var8 = j.a(0, param0);
            if (var8 != null) {
              l discarded$1 = co.field_f.a(480, (l) (Object) var8);
              if (!param1) {
                field_k = null;
                L0: while (true) {
                  var7_ref = (gh) (Object) co.field_f.a(16213);
                  if (var7_ref != null) {
                    var7_ref.field_Nb = var7_ref.field_Nb - 1;
                    if (var6 == 0) {
                      if (var6 == 0) {
                        continue L0;
                      } else {
                        var8.a(false);
                        var8.c(20);
                        sg.field_j = sg.field_j - 1;
                        var9 = gk.field_g;
                        var9.g(param2, 8);
                        var9.field_l = var9.field_l + 1;
                        var5 = var9.field_l;
                        var9.a(1, -98);
                        var9.a(param0, (byte) -40);
                        var9.b(-var5 + var9.field_l, -1);
                        return null;
                      }
                    } else {
                      var9 = gk.field_g;
                      var9.g(param2, 8);
                      var9.field_l = var9.field_l + 1;
                      var5 = var9.field_l;
                      var9.a(1, -98);
                      var9.a(param0, (byte) -40);
                      var9.b(-var5 + var9.field_l, -1);
                      return null;
                    }
                  } else {
                    var8.a(false);
                    var8.c(20);
                    sg.field_j = sg.field_j - 1;
                    var9 = gk.field_g;
                    var9.g(param2, 8);
                    var9.field_l = var9.field_l + 1;
                    var5 = var9.field_l;
                    var9.a(1, -98);
                    var9.a(param0, (byte) -40);
                    var9.b(-var5 + var9.field_l, -1);
                    return null;
                  }
                }
              } else {
                L1: while (true) {
                  var7_ref = (gh) (Object) co.field_f.a(16213);
                  if (var7_ref != null) {
                    var7_ref.field_Nb = var7_ref.field_Nb - 1;
                    if (var6 == 0) {
                      continue L1;
                    } else {
                      var9 = gk.field_g;
                      var9.g(param2, 8);
                      var9.field_l = var9.field_l + 1;
                      var5 = var9.field_l;
                      var9.a(1, -98);
                      var9.a(param0, (byte) -40);
                      var9.b(-var5 + var9.field_l, -1);
                      return null;
                    }
                  } else {
                    var8.a(false);
                    var8.c(20);
                    sg.field_j = sg.field_j - 1;
                    var9 = gk.field_g;
                    var9.g(param2, 8);
                    var9.field_l = var9.field_l + 1;
                    var5 = var9.field_l;
                    var9.a(1, -98);
                    var9.a(param0, (byte) -40);
                    var9.b(-var5 + var9.field_l, -1);
                    return null;
                  }
                }
              }
            } else {
              return oi.a(new String[1], ji.field_c, 2);
            }
          } else {
            return am.field_c;
          }
        } else {
          return sa.field_l;
        }
    }

    final static java.net.URL a(int param0, java.applet.Applet param1, java.net.URL param2) {
        Object var3 = null;
        Object var4 = null;
        var3 = null;
        if (param0 == -1) {
          L0: {
            var4 = null;
            if (null == rh.field_a) {
              break L0;
            } else {
              if (!rh.field_a.equals((Object) (Object) param1.getParameter("settings"))) {
                var3 = (Object) (Object) rh.field_a;
                var4 = var3;
                var4 = var3;
                break L0;
              } else {
                L1: {
                  if (null == jj.field_g) {
                    break L1;
                  } else {
                    if (!jj.field_g.equals((Object) (Object) param1.getParameter("session"))) {
                      var4 = (Object) (Object) jj.field_g;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
                return tk.a(param2, (String) var3, (String) var4, -1, (byte) -31);
              }
            }
          }
          if (null != jj.field_g) {
            if (jj.field_g.equals((Object) (Object) param1.getParameter("session"))) {
              return tk.a(param2, (String) var3, (String) var4, -1, (byte) -31);
            } else {
              var4 = (Object) (Object) jj.field_g;
              return tk.a(param2, (String) var3, (String) var4, -1, (byte) -31);
            }
          } else {
            return tk.a(param2, (String) var3, (String) var4, -1, (byte) -31);
          }
        } else {
          String discarded$1 = og.c(-38);
          var4 = null;
          if (null != rh.field_a) {
            L2: {
              if (!rh.field_a.equals((Object) (Object) param1.getParameter("settings"))) {
                var3 = (Object) (Object) rh.field_a;
                var4 = var3;
                var4 = var3;
                break L2;
              } else {
                break L2;
              }
            }
            if (null == jj.field_g) {
              return tk.a(param2, (String) var3, (String) var4, -1, (byte) -31);
            } else {
              L3: {
                if (!jj.field_g.equals((Object) (Object) param1.getParameter("session"))) {
                  var4 = (Object) (Object) jj.field_g;
                  break L3;
                } else {
                  break L3;
                }
              }
              return tk.a(param2, (String) var3, (String) var4, -1, (byte) -31);
            }
          } else {
            L4: {
              if (null == jj.field_g) {
                break L4;
              } else {
                if (!jj.field_g.equals((Object) (Object) param1.getParameter("session"))) {
                  var4 = (Object) (Object) jj.field_g;
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            return tk.a(param2, (String) var3, (String) var4, -1, (byte) -31);
          }
        }
    }

    public static void b(int param0) {
        field_g = null;
        field_k = null;
        field_l = null;
        field_o = null;
        if (param0 <= 66) {
          return;
        } else {
          field_e = null;
          field_c = null;
          field_t = null;
          field_j = null;
          field_n = null;
          field_a = null;
          return;
        }
    }

    og(pd param0, java.net.URL param1, int param2) {
        ((og) this).field_f = param0;
        ((og) this).field_r = param1;
        ((og) this).field_p = new jc(param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Quit to website";
        field_c = "Send private Quick Chat to <%0>";
        field_n = "You have 1 unread message!";
        field_o = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        field_t = new String[]{"By rating", "By win percentage"};
        field_e = "<%0> is already on your friend list.";
        field_j = new boolean[]{true, true, true, true, true, false, true, true, false, false};
        field_a = "Add <%0> to ignore list";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
