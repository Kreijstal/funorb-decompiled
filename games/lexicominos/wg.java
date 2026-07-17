/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wg implements Runnable {
    static int[] field_j;
    private DataInputStream field_g;
    private wf field_i;
    private ei field_f;
    private int field_d;
    private ei field_h;
    private ab field_a;
    static int field_e;
    private java.net.URL field_c;
    private ei field_b;

    protected final void finalize() {
        if (!(null == ((wg) this).field_f)) {
            if (((wg) this).field_f.field_g != null) {
                try {
                    ((DataInputStream) ((wg) this).field_f.field_g).close();
                } catch (Exception exception) {
                }
            }
            ((wg) this).field_f = null;
        }
        if (!(null == ((wg) this).field_h)) {
            if (!(null == ((wg) this).field_h.field_g)) {
                try {
                    ((java.net.Socket) ((wg) this).field_h.field_g).close();
                } catch (Exception exception) {
                }
            }
            ((wg) this).field_h = null;
        }
        if (((wg) this).field_g != null) {
            try {
                ((wg) this).field_g.close();
            } catch (Exception exception) {
            }
            ((wg) this).field_g = null;
        }
        ((wg) this).field_b = null;
    }

    final static int b(int param0) {
        if (param0 != 13174) {
            int discarded$0 = wg.b(57);
            return 1;
        }
        return 1;
    }

    public static void c(int param0) {
        if (param0 <= 115) {
            field_e = -22;
            field_j = null;
            return;
        }
        field_j = null;
    }

    final wf a(byte param0) {
        if (param0 != -65) {
            return null;
        }
        if (!(((wg) this).field_d != 3)) {
            return ((wg) this).field_i;
        }
        return null;
    }

    final synchronized boolean a(int param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        Throwable decompiledCaughtException = null;
        if (((wg) this).field_d < 2) {
          L0: {
            if (0 == ((wg) this).field_d) {
              L1: {
                if (null != ((wg) this).field_f) {
                  break L1;
                } else {
                  ((wg) this).field_f = ((wg) this).field_a.a(-23816, ((wg) this).field_c);
                  break L1;
                }
              }
              if (0 == ((wg) this).field_f.field_b) {
                return false;
              } else {
                if (1 == ((wg) this).field_f.field_b) {
                  break L0;
                } else {
                  ((wg) this).field_d = ((wg) this).field_d + 1;
                  ((wg) this).field_f = null;
                  return false;
                }
              }
            } else {
              break L0;
            }
          }
          L2: {
            if (param0 >= 38) {
              break L2;
            } else {
              ((wg) this).field_c = null;
              break L2;
            }
          }
          L3: {
            if (((wg) this).field_d != 1) {
              break L3;
            } else {
              L4: {
                if (null != ((wg) this).field_h) {
                  break L4;
                } else {
                  ((wg) this).field_h = ((wg) this).field_a.a(443, (byte) 125, ((wg) this).field_c.getHost());
                  break L4;
                }
              }
              if (0 != ((wg) this).field_h.field_b) {
                if (((wg) this).field_h.field_b == 1) {
                  break L3;
                } else {
                  ((wg) this).field_d = ((wg) this).field_d + 1;
                  ((wg) this).field_h = null;
                  return false;
                }
              } else {
                return false;
              }
            }
          }
          if (null == ((wg) this).field_g) {
            try {
              L5: {
                L6: {
                  if (((wg) this).field_d != 0) {
                    break L6;
                  } else {
                    ((wg) this).field_g = (DataInputStream) ((wg) this).field_f.field_g;
                    break L6;
                  }
                }
                L7: {
                  if (((wg) this).field_d == 1) {
                    var4 = (java.net.Socket) ((wg) this).field_h.field_g;
                    var4.setSoTimeout(10000);
                    var3 = var4.getOutputStream();
                    var3.write(17);
                    var5 = (CharSequence) (Object) ("JAGGRAB " + ((wg) this).field_c.getFile() + "\n\n");
                    var3.write(cl.a((byte) -98, var5));
                    ((wg) this).field_g = new DataInputStream(var4.getInputStream());
                    break L7;
                  } else {
                    break L7;
                  }
                }
                ((wg) this).field_i.field_h = 0;
                break L5;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L8: {
                var2 = (IOException) (Object) decompiledCaughtException;
                ((wg) this).finalize();
                ((wg) this).field_d = ((wg) this).field_d + 1;
                if (((wg) this).field_b == null) {
                  ((wg) this).field_b = ((wg) this).field_a.a((Runnable) this, false, 5);
                  break L8;
                } else {
                  break L8;
                }
              }
              if (-1 == ((wg) this).field_b.field_b) {
                return false;
              } else {
                if (-2 != ((wg) this).field_b.field_b) {
                  ((wg) this).finalize();
                  ((wg) this).field_d = ((wg) this).field_d + 1;
                  return false;
                } else {
                  return false;
                }
              }
            }
            L9: {
              if (((wg) this).field_b == null) {
                ((wg) this).field_b = ((wg) this).field_a.a((Runnable) this, false, 5);
                break L9;
              } else {
                break L9;
              }
            }
            if (-1 == ((wg) this).field_b.field_b) {
              return false;
            } else {
              L10: {
                if (-2 == ((wg) this).field_b.field_b) {
                  break L10;
                } else {
                  ((wg) this).finalize();
                  ((wg) this).field_d = ((wg) this).field_d + 1;
                  break L10;
                }
              }
              return false;
            }
          } else {
            L11: {
              if (((wg) this).field_b == null) {
                ((wg) this).field_b = ((wg) this).field_a.a((Runnable) this, false, 5);
                break L11;
              } else {
                break L11;
              }
            }
            if (-1 == ((wg) this).field_b.field_b) {
              return false;
            } else {
              if (-2 != ((wg) this).field_b.field_b) {
                ((wg) this).finalize();
                ((wg) this).field_d = ((wg) this).field_d + 1;
                return false;
              } else {
                return false;
              }
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
            var4 = Lexicominos.field_L ? 1 : 0;
            try {
              L0: while (true) {
                L1: {
                  if (((wg) this).field_i.field_h >= ((wg) this).field_i.field_j.length) {
                    break L1;
                  } else {
                    var1_int = ((wg) this).field_g.read(((wg) this).field_i.field_j, ((wg) this).field_i.field_h, -((wg) this).field_i.field_h + ((wg) this).field_i.field_j.length);
                    if (var1_int >= 0) {
                      ((wg) this).field_i.field_h = ((wg) this).field_i.field_h + var1_int;
                      continue L0;
                    } else {
                      break L1;
                    }
                  }
                }
                if (((wg) this).field_i.field_h == ((wg) this).field_i.field_j.length) {
                  throw wg.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + ((wg) this).field_i.field_j.length + " " + ((wg) this).field_c));
                } else {
                  var1 = this;
                  synchronized (var1) {
                    L2: {
                      ((wg) this).finalize();
                      ((wg) this).field_d = 3;
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
                  ((wg) this).finalize();
                  ((wg) this).field_d = ((wg) this).field_d + 1;
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

    wg(ab param0, java.net.URL param1, int param2) {
        try {
            ((wg) this).field_a = param0;
            ((wg) this).field_c = param1;
            ((wg) this).field_i = new wf(param2);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "wg.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new int[8192];
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
