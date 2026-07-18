/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.lang.String;
import java.net.URL;

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

    final static void a(int param0, int param1, int param2, int[] param3, int param4, byte param5) {
        ag.field_j[param0] = param3;
        ag.field_b[param0] = 150;
        ag.field_h[param0] = 490;
        ag.field_f[param0] = param2;
        if (param5 < 57) {
            return;
        }
        try {
            ag.field_a[param0] = param4;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "og.C(" + param0 + ',' + 490 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + 150 + ')');
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
            if (((og) this).field_h == 1) {
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
                  if (((og) this).field_h != 0) {
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
        RuntimeException var4 = null;
        hg var5 = null;
        int var6 = 0;
        int var7 = 0;
        gh var8 = null;
        CharSequence var9 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_10_0 = null;
        Object stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_6_0 = null;
        Object stackOut_11_0 = null;
        String stackOut_9_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            var9 = (CharSequence) (Object) param3;
            if (!dm.a(var9, -1478)) {
              stackOut_2_0 = sa.field_l;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (oa.field_q != 2) {
                stackOut_6_0 = dh.field_l;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                var8 = kh.a((byte) 75, param0);
                if (var8 != null) {
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
                  stackOut_11_0 = null;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  stackOut_9_0 = oi.a(new String[1], a.field_z, 2);
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("og.A(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L1;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L1;
            }
          }
          L2: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L2;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L2;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
        return (String) (Object) stackIn_12_0;
    }

    public final void run() {
        try {
            int var1_int = 0;
            Object var1 = null;
            Exception var1_ref = null;
            Throwable var2 = null;
            Object var2_ref = null;
            Throwable var3 = null;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            var4 = Virogrid.field_F ? 1 : 0;
            try {
              L0: while (true) {
                L1: {
                  if (((og) this).field_p.field_g.length <= ((og) this).field_p.field_l) {
                    break L1;
                  } else {
                    var1_int = ((og) this).field_i.read(((og) this).field_p.field_g, ((og) this).field_p.field_l, -((og) this).field_p.field_l + ((og) this).field_p.field_g.length);
                    if (var1_int < 0) {
                      break L1;
                    } else {
                      ((og) this).field_p.field_l = ((og) this).field_p.field_l + var1_int;
                      continue L0;
                    }
                  }
                }
                if (((og) this).field_p.field_l != ((og) this).field_p.field_g.length) {
                  var1 = this;
                  synchronized (var1) {
                    L2: {
                      ((og) this).finalize();
                      ((og) this).field_h = 3;
                      break L2;
                    }
                  }
                  return;
                } else {
                  throw og.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + ((og) this).field_p.field_g.length + " " + (Object) (Object) ((og) this).field_r));
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref = this;
              synchronized (var2_ref) {
                L3: {
                  ((og) this).finalize();
                  ((og) this).field_h = ((og) this).field_h + 1;
                  break L3;
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

    final static String c() {
        String var1 = "";
        if (aa.field_a != null) {
            var1 = aa.field_a.f(-3);
        }
        if (var1.length() == 0) {
            var1 = hh.b((byte) -123);
        }
        if (!(var1.length() != 0)) {
            var1 = tl.field_f;
        }
        return var1;
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
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        gh var7 = null;
        gh var8 = null;
        hg var9 = null;
        CharSequence var10 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        Object stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_13_0 = null;
        String stackOut_8_0 = null;
        String stackOut_5_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var10 = (CharSequence) (Object) param0;
            if (dm.a(var10, -1478)) {
              if (oa.field_q == 2) {
                var8 = j.a(0, param0);
                if (var8 != null) {
                  l discarded$2 = co.field_f.a(480, (l) (Object) var8);
                  L1: while (true) {
                    var7 = (gh) (Object) co.field_f.a(16213);
                    if (var7 == null) {
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
                      stackOut_13_0 = null;
                      stackIn_14_0 = stackOut_13_0;
                      break L0;
                    } else {
                      var7.field_Nb = var7.field_Nb - 1;
                      continue L1;
                    }
                  }
                } else {
                  stackOut_8_0 = oi.a(new String[1], ji.field_c, 2);
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              } else {
                stackOut_5_0 = am.field_c;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            } else {
              stackOut_2_0 = sa.field_l;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("og.D(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L2;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + true + ',' + param2 + ')');
        }
        return (String) (Object) stackIn_14_0;
    }

    final static java.net.URL a(int param0, java.applet.Applet param1, java.net.URL param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_9_0 = null;
        Object stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        Object stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        Object stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.net.URL stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        Object stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        Object stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        Object stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        Object stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        Object stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              var3 = null;
              var4 = null;
              if (null == rh.field_a) {
                break L1;
              } else {
                if (!rh.field_a.equals((Object) (Object) param1.getParameter("settings"))) {
                  var3 = (Object) (Object) rh.field_a;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (null == jj.field_g) {
                break L2;
              } else {
                if (!jj.field_g.equals((Object) (Object) param1.getParameter("session"))) {
                  var4 = (Object) (Object) jj.field_g;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            int discarded$4 = -31;
            int discarded$5 = -1;
            stackOut_8_0 = tk.a(param2, (String) var3, (String) var4);
            stackIn_9_0 = stackOut_8_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = (Object) (Object) decompiledCaughtException;
            stackOut_10_0 = var3;
            stackOut_10_1 = new StringBuilder().append("og.H(").append(-1).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_9_0;
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
        try {
            ((og) this).field_f = param0;
            ((og) this).field_r = param1;
            ((og) this).field_p = new jc(param2);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "og.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
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
