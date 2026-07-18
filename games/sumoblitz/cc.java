/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class cc implements Runnable {
    private jr field_c;
    private DataInputStream field_h;
    private java.net.URL field_a;
    private fs field_d;
    private int field_g;
    private jr field_f;
    private jr field_e;
    static int field_j;
    private wi field_b;
    static ck field_i;

    protected final void finalize() {
        if (((cc) this).field_e != null) {
            if (!(null == ((cc) this).field_e.field_d)) {
                try {
                    ((DataInputStream) ((cc) this).field_e.field_d).close();
                } catch (Exception exception) {
                }
            }
            ((cc) this).field_e = null;
        }
        if (((cc) this).field_f != null) {
            if (null != ((cc) this).field_f.field_d) {
                try {
                    ((java.net.Socket) ((cc) this).field_f.field_d).close();
                } catch (Exception exception) {
                }
            }
            ((cc) this).field_f = null;
        }
        if (!(null == ((cc) this).field_h)) {
            try {
                ((cc) this).field_h.close();
            } catch (Exception exception) {
            }
            ((cc) this).field_h = null;
        }
        ((cc) this).field_c = null;
    }

    final synchronized boolean a(byte param0) {
        int var2 = 0;
        IOException var3 = null;
        OutputStream var4 = null;
        java.net.Socket var5 = null;
        CharSequence var6 = null;
        Throwable decompiledCaughtException = null;
        if (((cc) this).field_g < 2) {
          L0: {
            var2 = 4 / ((param0 - -41) / 43);
            if (((cc) this).field_g == 0) {
              L1: {
                if (((cc) this).field_e == null) {
                  ((cc) this).field_e = ((cc) this).field_b.a((byte) 107, ((cc) this).field_a);
                  break L1;
                } else {
                  break L1;
                }
              }
              if (0 != ((cc) this).field_e.field_c) {
                if (1 == ((cc) this).field_e.field_c) {
                  break L0;
                } else {
                  ((cc) this).field_e = null;
                  ((cc) this).field_g = ((cc) this).field_g + 1;
                  return false;
                }
              } else {
                return false;
              }
            } else {
              break L0;
            }
          }
          L2: {
            if (((cc) this).field_g != 1) {
              break L2;
            } else {
              L3: {
                if (((cc) this).field_f == null) {
                  ((cc) this).field_f = ((cc) this).field_b.a((byte) 51, ((cc) this).field_a.getHost(), 443);
                  break L3;
                } else {
                  break L3;
                }
              }
              if (-1 != ((cc) this).field_f.field_c) {
                if (-2 != ((cc) this).field_f.field_c) {
                  ((cc) this).field_f = null;
                  ((cc) this).field_g = ((cc) this).field_g + 1;
                  return false;
                } else {
                  break L2;
                }
              } else {
                return false;
              }
            }
          }
          if (((cc) this).field_h == null) {
            try {
              L4: {
                L5: {
                  if (0 == ((cc) this).field_g) {
                    ((cc) this).field_h = (DataInputStream) ((cc) this).field_e.field_d;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (((cc) this).field_g == 1) {
                    var5 = (java.net.Socket) ((cc) this).field_f.field_d;
                    var5.setSoTimeout(10000);
                    var4 = var5.getOutputStream();
                    var4.write(17);
                    var6 = (CharSequence) (Object) ("JAGGRAB " + ((cc) this).field_a.getFile() + "\n\n");
                    var4.write(mb.a(var6, (byte) 32));
                    ((cc) this).field_h = new DataInputStream(var5.getInputStream());
                    break L6;
                  } else {
                    break L6;
                  }
                }
                ((cc) this).field_d.field_p = 0;
                break L4;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L7: {
                var3 = (IOException) (Object) decompiledCaughtException;
                ((cc) this).finalize();
                ((cc) this).field_g = ((cc) this).field_g + 1;
                if (null == ((cc) this).field_c) {
                  ((cc) this).field_c = ((cc) this).field_b.a(true, (Runnable) this, 5);
                  break L7;
                } else {
                  break L7;
                }
              }
              if (0 != ((cc) this).field_c.field_c) {
                if (((cc) this).field_c.field_c != 1) {
                  ((cc) this).finalize();
                  ((cc) this).field_g = ((cc) this).field_g + 1;
                  return false;
                } else {
                  return false;
                }
              } else {
                return false;
              }
            }
            L8: {
              if (null == ((cc) this).field_c) {
                ((cc) this).field_c = ((cc) this).field_b.a(true, (Runnable) this, 5);
                break L8;
              } else {
                break L8;
              }
            }
            if (0 == ((cc) this).field_c.field_c) {
              return false;
            } else {
              L9: {
                if (((cc) this).field_c.field_c == 1) {
                  break L9;
                } else {
                  ((cc) this).finalize();
                  ((cc) this).field_g = ((cc) this).field_g + 1;
                  break L9;
                }
              }
              return false;
            }
          } else {
            L10: {
              if (null == ((cc) this).field_c) {
                ((cc) this).field_c = ((cc) this).field_b.a(true, (Runnable) this, 5);
                break L10;
              } else {
                break L10;
              }
            }
            if (0 != ((cc) this).field_c.field_c) {
              if (((cc) this).field_c.field_c != 1) {
                ((cc) this).finalize();
                ((cc) this).field_g = ((cc) this).field_g + 1;
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
            var4 = Sumoblitz.field_L ? 1 : 0;
            try {
              L0: while (true) {
                L1: {
                  if (((cc) this).field_d.field_p >= ((cc) this).field_d.field_n.length) {
                    break L1;
                  } else {
                    var1_int = ((cc) this).field_h.read(((cc) this).field_d.field_n, ((cc) this).field_d.field_p, -((cc) this).field_d.field_p + ((cc) this).field_d.field_n.length);
                    if (var1_int < 0) {
                      break L1;
                    } else {
                      ((cc) this).field_d.field_p = ((cc) this).field_d.field_p + var1_int;
                      continue L0;
                    }
                  }
                }
                if (((cc) this).field_d.field_n.length == ((cc) this).field_d.field_p) {
                  throw cc.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + ((cc) this).field_d.field_n.length + " " + (Object) (Object) ((cc) this).field_a));
                } else {
                  var1 = this;
                  synchronized (var1) {
                    L2: {
                      ((cc) this).finalize();
                      ((cc) this).field_g = 3;
                      break L2;
                    }
                  }
                  return;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref = this;
              synchronized (var2_ref) {
                L3: {
                  ((cc) this).finalize();
                  ((cc) this).field_g = ((cc) this).field_g + 1;
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

    final fs b(byte param0) {
        if (3 == ((cc) this).field_g) {
          return ((cc) this).field_d;
        } else {
          if (param0 == 126) {
            return null;
          } else {
            ((cc) this).field_a = null;
            return null;
          }
        }
    }

    cc(wi param0, java.net.URL param1, int param2) {
        try {
            ((cc) this).field_b = param0;
            ((cc) this).field_a = param1;
            ((cc) this).field_d = new fs(param2);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "cc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 < 121) {
            cc.a(82);
            field_i = null;
            return;
        }
        field_i = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new ck();
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
