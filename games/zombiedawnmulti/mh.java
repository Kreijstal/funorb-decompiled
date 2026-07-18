/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class mh implements Runnable {
    private k field_g;
    private di field_b;
    private DataInputStream field_f;
    private int field_k;
    private di field_e;
    private go field_j;
    static th field_l;
    private di field_d;
    static jh field_c;
    static cj field_i;
    private java.net.URL field_a;
    static int field_h;

    protected final void finalize() {
        if (!(null == ((mh) this).field_e)) {
            if (!(((mh) this).field_e.field_d == null)) {
                try {
                    ((DataInputStream) ((mh) this).field_e.field_d).close();
                } catch (Exception exception) {
                }
            }
            ((mh) this).field_e = null;
        }
        if (!(((mh) this).field_b == null)) {
            if (((mh) this).field_b.field_d != null) {
                try {
                    ((java.net.Socket) ((mh) this).field_b.field_d).close();
                } catch (Exception exception) {
                }
            }
            ((mh) this).field_b = null;
        }
        if (!(null == ((mh) this).field_f)) {
            try {
                ((mh) this).field_f.close();
            } catch (Exception exception) {
            }
            ((mh) this).field_f = null;
        }
        ((mh) this).field_d = null;
    }

    final synchronized boolean b(int param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        Throwable decompiledCaughtException = null;
        if (((mh) this).field_k >= 2) {
          return true;
        } else {
          L0: {
            if (((mh) this).field_k == 0) {
              L1: {
                if (((mh) this).field_e != null) {
                  break L1;
                } else {
                  ((mh) this).field_e = ((mh) this).field_j.a((byte) -12, ((mh) this).field_a);
                  break L1;
                }
              }
              if (0 != ((mh) this).field_e.field_f) {
                if (((mh) this).field_e.field_f == 1) {
                  break L0;
                } else {
                  ((mh) this).field_e = null;
                  ((mh) this).field_k = ((mh) this).field_k + 1;
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
            if (((mh) this).field_k == 1) {
              L3: {
                if (((mh) this).field_b != null) {
                  break L3;
                } else {
                  ((mh) this).field_b = ((mh) this).field_j.a(((mh) this).field_a.getHost(), 443, (byte) -120);
                  break L3;
                }
              }
              if (((mh) this).field_b.field_f == 0) {
                return false;
              } else {
                if (((mh) this).field_b.field_f == 1) {
                  break L2;
                } else {
                  ((mh) this).field_k = ((mh) this).field_k + 1;
                  ((mh) this).field_b = null;
                  return false;
                }
              }
            } else {
              break L2;
            }
          }
          L4: {
            if (param0 < -87) {
              break L4;
            } else {
              ((mh) this).field_f = null;
              break L4;
            }
          }
          if (null == ((mh) this).field_f) {
            try {
              L5: {
                L6: {
                  if (((mh) this).field_k == 0) {
                    ((mh) this).field_f = (DataInputStream) ((mh) this).field_e.field_d;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (((mh) this).field_k == 1) {
                    var4 = (java.net.Socket) ((mh) this).field_b.field_d;
                    var4.setSoTimeout(10000);
                    var3 = var4.getOutputStream();
                    var3.write(17);
                    var5 = (CharSequence) (Object) ("JAGGRAB " + ((mh) this).field_a.getFile() + "\n\n");
                    int discarded$1 = -116;
                    var3.write(qo.a(var5));
                    ((mh) this).field_f = new DataInputStream(var4.getInputStream());
                    break L7;
                  } else {
                    break L7;
                  }
                }
                ((mh) this).field_g.field_j = 0;
                break L5;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L8: {
                var2 = (IOException) (Object) decompiledCaughtException;
                ((mh) this).finalize();
                ((mh) this).field_k = ((mh) this).field_k + 1;
                if (null == ((mh) this).field_d) {
                  ((mh) this).field_d = ((mh) this).field_j.a(117, (Runnable) this, 5);
                  break L8;
                } else {
                  break L8;
                }
              }
              if (0 != ((mh) this).field_d.field_f) {
                L9: {
                  if (1 != ((mh) this).field_d.field_f) {
                    ((mh) this).finalize();
                    ((mh) this).field_k = ((mh) this).field_k + 1;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                return false;
              } else {
                return false;
              }
            }
            L10: {
              if (null == ((mh) this).field_d) {
                ((mh) this).field_d = ((mh) this).field_j.a(117, (Runnable) this, 5);
                break L10;
              } else {
                break L10;
              }
            }
            if (0 != ((mh) this).field_d.field_f) {
              L11: {
                if (1 != ((mh) this).field_d.field_f) {
                  ((mh) this).finalize();
                  ((mh) this).field_k = ((mh) this).field_k + 1;
                  break L11;
                } else {
                  break L11;
                }
              }
              return false;
            } else {
              return false;
            }
          } else {
            L12: {
              if (null == ((mh) this).field_d) {
                ((mh) this).field_d = ((mh) this).field_j.a(117, (Runnable) this, 5);
                break L12;
              } else {
                break L12;
              }
            }
            if (0 != ((mh) this).field_d.field_f) {
              if (1 != ((mh) this).field_d.field_f) {
                ((mh) this).finalize();
                ((mh) this).field_k = ((mh) this).field_k + 1;
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
            var4 = ZombieDawnMulti.field_E ? 1 : 0;
            try {
              L0: while (true) {
                L1: {
                  if (((mh) this).field_g.field_j >= ((mh) this).field_g.field_m.length) {
                    break L1;
                  } else {
                    var1_int = ((mh) this).field_f.read(((mh) this).field_g.field_m, ((mh) this).field_g.field_j, ((mh) this).field_g.field_m.length + -((mh) this).field_g.field_j);
                    if (var1_int >= 0) {
                      ((mh) this).field_g.field_j = ((mh) this).field_g.field_j + var1_int;
                      continue L0;
                    } else {
                      break L1;
                    }
                  }
                }
                if (((mh) this).field_g.field_j != ((mh) this).field_g.field_m.length) {
                  var1 = this;
                  synchronized (var1) {
                    L2: {
                      ((mh) this).finalize();
                      ((mh) this).field_k = 3;
                      break L2;
                    }
                  }
                  return;
                } else {
                  throw mh.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + ((mh) this).field_g.field_m.length + " " + (Object) (Object) ((mh) this).field_a));
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref = this;
              synchronized (var2_ref) {
                L3: {
                  ((mh) this).finalize();
                  ((mh) this).field_k = ((mh) this).field_k + 1;
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

    final static void c() {
        vl var1 = (vl) (Object) lf.field_e.c(69);
        if (!(var1 != null)) {
            ak.a((byte) -112);
            return;
        }
        ga var2 = s.field_e;
        int discarded$0 = var2.i(-1478490344);
        int discarded$1 = var2.i(-1478490344);
        int discarded$2 = var2.i(-1478490344);
        int discarded$3 = var2.i(-1478490344);
        var1.a(true);
    }

    final k a(byte param0) {
        if (param0 == 21) {
          if (3 != ((mh) this).field_k) {
            return null;
          } else {
            return ((mh) this).field_g;
          }
        } else {
          field_i = null;
          if (3 != ((mh) this).field_k) {
            return null;
          } else {
            return ((mh) this).field_g;
          }
        }
    }

    public static void a() {
        field_l = null;
        field_c = null;
        field_i = null;
    }

    mh(go param0, java.net.URL param1, int param2) {
        try {
            ((mh) this).field_a = param1;
            ((mh) this).field_j = param0;
            ((mh) this).field_g = new k(param2);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "mh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new th();
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
