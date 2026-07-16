/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ud implements Runnable {
    private jh field_h;
    private int field_g;
    private java.net.URL field_d;
    static sd field_c;
    private DataInputStream field_f;
    private vh field_k;
    private jh field_j;
    private jh field_e;
    static String field_a;
    static va field_b;
    private va field_i;

    final va b(int param0) {
        if ((((ud) this).field_g ^ -1) != param0) {
            return null;
        }
        return ((ud) this).field_i;
    }

    final static void a(byte param0, boolean param1, java.awt.Canvas param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = wizardrun.field_H;
        if (param0 > 35) {
          if (ri.field_a >= 10) {
            if (w.a((byte) -117)) {
              if (-1 != (ml.field_t ^ -1)) {
                uc.a(false, param2);
                return;
              } else {
                uk.a((byte) -123, param1, false);
                fc.a((byte) 80, 0, param2, 0);
                return;
              }
            } else {
              ed.d();
              dg.a(320, 240, (byte) -97);
              fc.a((byte) 80, 0, param2, 0);
              return;
            }
          } else {
            L0: {
              var3 = 0;
              if (!pk.field_o) {
                break L0;
              } else {
                pk.field_o = false;
                var3 = 1;
                break L0;
              }
            }
            ug.a(10487, var3 != 0, dl.a(true), wj.g(17325), sa.field_e);
            return;
          }
        } else {
          ud.a(-40, -128);
          if (ri.field_a >= 10) {
            if (w.a((byte) -117)) {
              if (-1 != (ml.field_t ^ -1)) {
                uc.a(false, param2);
                return;
              } else {
                uk.a((byte) -123, param1, false);
                fc.a((byte) 80, 0, param2, 0);
                return;
              }
            } else {
              ed.d();
              dg.a(320, 240, (byte) -97);
              fc.a((byte) 80, 0, param2, 0);
              return;
            }
          } else {
            L1: {
              var3 = 0;
              if (!pk.field_o) {
                break L1;
              } else {
                pk.field_o = false;
                var3 = 1;
                break L1;
              }
            }
            ug.a(10487, var3 != 0, dl.a(true), wj.g(17325), sa.field_e);
            return;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        field_c = null;
        if (param0 != 240) {
            Object var2 = null;
            ud.a((byte) -25, true, (java.awt.Canvas) null);
        }
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
            var4 = wizardrun.field_H;
            try {
              L0: while (true) {
                L1: {
                  if (((ud) this).field_i.field_m >= ((ud) this).field_i.field_k.length) {
                    break L1;
                  } else {
                    var1_int = ((ud) this).field_f.read(((ud) this).field_i.field_k, ((ud) this).field_i.field_m, ((ud) this).field_i.field_k.length - ((ud) this).field_i.field_m);
                    if (0 > var1_int) {
                      break L1;
                    } else {
                      ((ud) this).field_i.field_m = ((ud) this).field_i.field_m + var1_int;
                      continue L0;
                    }
                  }
                }
                if (((ud) this).field_i.field_m != ((ud) this).field_i.field_k.length) {
                  var1 = this;
                  synchronized (var1) {
                    L2: {
                      ((ud) this).finalize();
                      ((ud) this).field_g = 3;
                      break L2;
                    }
                  }
                  return;
                } else {
                  throw ud.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + ((ud) this).field_i.field_k.length + " " + ((ud) this).field_d));
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref = this;
              synchronized (var2_ref) {
                L3: {
                  ((ud) this).finalize();
                  ((ud) this).field_g = ((ud) this).field_g + 1;
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

    final static void a(int param0, int param1) {
        int var4 = wizardrun.field_H;
        dc var5 = (dc) (Object) v.field_d.b((byte) 111);
        while (var5 != null) {
            de.a(-14149, param0, var5);
            var5 = (dc) (Object) v.field_d.d(8192);
        }
        int var3 = 105 % ((param1 - -34) / 40);
        sc var6 = (sc) (Object) tg.field_c.b((byte) 118);
        while (var6 != null) {
            ld.a(param0, var6, 0);
            var6 = (sc) (Object) tg.field_c.d(8192);
        }
    }

    protected final void finalize() {
        if (!(((ud) this).field_h == null)) {
            if (!(((ud) this).field_h.field_e == null)) {
                try {
                    ((DataInputStream) ((ud) this).field_h.field_e).close();
                } catch (Exception exception) {
                }
            }
            ((ud) this).field_h = null;
        }
        if (null != ((ud) this).field_j) {
            if (null != ((ud) this).field_j.field_e) {
                try {
                    ((java.net.Socket) ((ud) this).field_j.field_e).close();
                } catch (Exception exception) {
                }
            }
            ((ud) this).field_j = null;
        }
        if (null != ((ud) this).field_f) {
            try {
                ((ud) this).field_f.close();
            } catch (Exception exception) {
            }
            ((ud) this).field_f = null;
        }
        ((ud) this).field_e = null;
    }

    final synchronized boolean c(int param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        Throwable decompiledCaughtException = null;
        if (((ud) this).field_g >= 2) {
          return true;
        } else {
          L0: {
            if (-1 != (((ud) this).field_g ^ -1)) {
              break L0;
            } else {
              L1: {
                if (((ud) this).field_h != null) {
                  break L1;
                } else {
                  ((ud) this).field_h = ((ud) this).field_k.a(((ud) this).field_d, 127);
                  break L1;
                }
              }
              if (-1 == (((ud) this).field_h.field_a ^ -1)) {
                return false;
              } else {
                if (((ud) this).field_h.field_a == 1) {
                  break L0;
                } else {
                  ((ud) this).field_h = null;
                  ((ud) this).field_g = ((ud) this).field_g + 1;
                  return false;
                }
              }
            }
          }
          L2: {
            if (1 == ((ud) this).field_g) {
              L3: {
                if (null != ((ud) this).field_j) {
                  break L3;
                } else {
                  ((ud) this).field_j = ((ud) this).field_k.a(((ud) this).field_d.getHost(), 443, (byte) -20);
                  break L3;
                }
              }
              if ((((ud) this).field_j.field_a ^ -1) == -1) {
                return false;
              } else {
                if (-2 == (((ud) this).field_j.field_a ^ -1)) {
                  break L2;
                } else {
                  ((ud) this).field_g = ((ud) this).field_g + 1;
                  ((ud) this).field_j = null;
                  return false;
                }
              }
            } else {
              break L2;
            }
          }
          if (((ud) this).field_f == null) {
            try {
              L4: {
                L5: {
                  if ((((ud) this).field_g ^ -1) == -1) {
                    ((ud) this).field_f = (DataInputStream) ((ud) this).field_h.field_e;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (((ud) this).field_g != 1) {
                    break L6;
                  } else {
                    var4 = (java.net.Socket) ((ud) this).field_j.field_e;
                    var4.setSoTimeout(10000);
                    var3 = var4.getOutputStream();
                    var3.write(17);
                    var5 = (CharSequence) (Object) ("JAGGRAB " + ((ud) this).field_d.getFile() + "\n\n");
                    var3.write(wh.a((byte) -111, var5));
                    ((ud) this).field_f = new DataInputStream(var4.getInputStream());
                    break L6;
                  }
                }
                ((ud) this).field_i.field_m = 0;
                break L4;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L7: {
                var2 = (IOException) (Object) decompiledCaughtException;
                ((ud) this).finalize();
                ((ud) this).field_g = ((ud) this).field_g + 1;
                if (((ud) this).field_e == null) {
                  ((ud) this).field_e = ((ud) this).field_k.a((byte) -82, (Runnable) this, 5);
                  break L7;
                } else {
                  break L7;
                }
              }
              if (0 != ((ud) this).field_e.field_a) {
                if (param0 > 71) {
                  L8: {
                    if (((ud) this).field_e.field_a != 1) {
                      ((ud) this).finalize();
                      ((ud) this).field_g = ((ud) this).field_g + 1;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  return false;
                } else {
                  L9: {
                    ud.a(-20);
                    if (((ud) this).field_e.field_a != 1) {
                      ((ud) this).finalize();
                      ((ud) this).field_g = ((ud) this).field_g + 1;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  return false;
                }
              } else {
                return false;
              }
            }
            L10: {
              if (((ud) this).field_e == null) {
                ((ud) this).field_e = ((ud) this).field_k.a((byte) -82, (Runnable) this, 5);
                break L10;
              } else {
                break L10;
              }
            }
            if (0 != ((ud) this).field_e.field_a) {
              L11: {
                if (param0 > 71) {
                  break L11;
                } else {
                  ud.a(-20);
                  break L11;
                }
              }
              L12: {
                if (((ud) this).field_e.field_a != 1) {
                  ((ud) this).finalize();
                  ((ud) this).field_g = ((ud) this).field_g + 1;
                  break L12;
                } else {
                  break L12;
                }
              }
              return false;
            } else {
              return false;
            }
          } else {
            L13: {
              if (((ud) this).field_e == null) {
                ((ud) this).field_e = ((ud) this).field_k.a((byte) -82, (Runnable) this, 5);
                break L13;
              } else {
                break L13;
              }
            }
            if (0 != ((ud) this).field_e.field_a) {
              L14: {
                if (param0 > 71) {
                  break L14;
                } else {
                  ud.a(-20);
                  break L14;
                }
              }
              if (((ud) this).field_e.field_a != 1) {
                ((ud) this).finalize();
                ((ud) this).field_g = ((ud) this).field_g + 1;
                return false;
              } else {
                return false;
              }
            } else {
              return false;
            }
          }
        }
    }

    final static void a(o param0, boolean param1) {
        if (param1) {
            return;
        }
        ph.d(-31782);
        ed.a(param0.field_B, param0.field_x, param0.field_s);
    }

    ud(vh param0, java.net.URL param1, int param2) {
        ((ud) this).field_d = param1;
        ((ud) this).field_k = param0;
        ((ud) this).field_i = new va(param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new sd(2);
        field_a = "Return to game";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
