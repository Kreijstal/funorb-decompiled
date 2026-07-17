/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qa implements Runnable {
    private gk field_e;
    private java.net.URL field_f;
    static le field_i;
    private DataInputStream field_l;
    private int field_k;
    private ic field_g;
    static pj field_d;
    static String field_b;
    private md field_h;
    private ic field_j;
    static int field_a;
    private ic field_c;

    final static void a(byte param0, gg param1, int param2, int param3) {
        hh.field_u = param1;
        wg.field_h = param2;
        try {
            rb.field_cb = param3;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "qa.D(" + -39 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 41);
        }
    }

    public static void a() {
        field_d = null;
        field_i = null;
        field_b = null;
    }

    final gk a(int param0) {
        if (param0 >= 13) {
          if (-4 != ((qa) this).field_k) {
            return null;
          } else {
            return ((qa) this).field_e;
          }
        } else {
          field_d = null;
          if (-4 != ((qa) this).field_k) {
            return null;
          } else {
            return ((qa) this).field_e;
          }
        }
    }

    final synchronized boolean c(int param0) {
        int var2 = 0;
        IOException var3 = null;
        OutputStream var4 = null;
        java.net.Socket var5 = null;
        CharSequence var6 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        if (((qa) this).field_k < 2) {
          L0: {
            if (((qa) this).field_k == 0) {
              L1: {
                if (((qa) this).field_j != null) {
                  break L1;
                } else {
                  ((qa) this).field_j = ((qa) this).field_h.a((byte) 112, ((qa) this).field_f);
                  break L1;
                }
              }
              if (((qa) this).field_j.field_g == 0) {
                return false;
              } else {
                if (((qa) this).field_j.field_g != 1) {
                  ((qa) this).field_k = ((qa) this).field_k + 1;
                  ((qa) this).field_j = null;
                  return false;
                } else {
                  break L0;
                }
              }
            } else {
              break L0;
            }
          }
          L2: {
            if (1 != ((qa) this).field_k) {
              break L2;
            } else {
              L3: {
                if (((qa) this).field_g != null) {
                  break L3;
                } else {
                  ((qa) this).field_g = ((qa) this).field_h.a(((qa) this).field_f.getHost(), 0, 443);
                  break L3;
                }
              }
              if (((qa) this).field_g.field_g != 0) {
                if (1 != ((qa) this).field_g.field_g) {
                  ((qa) this).field_k = ((qa) this).field_k + 1;
                  ((qa) this).field_g = null;
                  return false;
                } else {
                  break L2;
                }
              } else {
                return false;
              }
            }
          }
          L4: {
            var2 = -62 / ((-17 - param0) / 60);
            if (null != ((qa) this).field_l) {
              break L4;
            } else {
              try {
                L5: {
                  L6: {
                    if (0 != ((qa) this).field_k) {
                      break L6;
                    } else {
                      ((qa) this).field_l = (DataInputStream) ((qa) this).field_j.field_b;
                      break L6;
                    }
                  }
                  L7: {
                    if (1 == ((qa) this).field_k) {
                      var5 = (java.net.Socket) ((qa) this).field_g.field_b;
                      var5.setSoTimeout(10000);
                      var4 = var5.getOutputStream();
                      var4.write(17);
                      var6 = (CharSequence) (Object) ("JAGGRAB " + ((qa) this).field_f.getFile() + "\n\n");
                      var4.write(pj.a(3231, var6));
                      ((qa) this).field_l = new DataInputStream(var5.getInputStream());
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  ((qa) this).field_e.field_h = 0;
                  decompiledRegionSelector0 = 0;
                  break L5;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L8: {
                  var3 = (IOException) (Object) decompiledCaughtException;
                  ((qa) this).finalize();
                  ((qa) this).field_k = ((qa) this).field_k + 1;
                  decompiledRegionSelector0 = 1;
                  break L8;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                L9: {
                  if (((qa) this).field_c != null) {
                    break L9;
                  } else {
                    ((qa) this).field_c = ((qa) this).field_h.a((Runnable) this, 5, 0);
                    break L9;
                  }
                }
                if (((qa) this).field_c.field_g != 0) {
                  if (((qa) this).field_c.field_g != 1) {
                    ((qa) this).finalize();
                    ((qa) this).field_k = ((qa) this).field_k + 1;
                    return false;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                break L4;
              }
            }
          }
          if (((qa) this).field_c != null) {
            if (((qa) this).field_c.field_g != 0) {
              if (((qa) this).field_c.field_g != 1) {
                ((qa) this).finalize();
                ((qa) this).field_k = ((qa) this).field_k + 1;
                return false;
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            ((qa) this).field_c = ((qa) this).field_h.a((Runnable) this, 5, 0);
            if (((qa) this).field_c.field_g != 0) {
              if (((qa) this).field_c.field_g == 1) {
                return false;
              } else {
                ((qa) this).finalize();
                ((qa) this).field_k = ((qa) this).field_k + 1;
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

    protected final void finalize() {
        if (!(null == ((qa) this).field_j)) {
            if (null != ((qa) this).field_j.field_b) {
                try {
                    ((DataInputStream) ((qa) this).field_j.field_b).close();
                } catch (Exception exception) {
                }
            }
            ((qa) this).field_j = null;
        }
        if (!(((qa) this).field_g == null)) {
            if (!(null == ((qa) this).field_g.field_b)) {
                try {
                    ((java.net.Socket) ((qa) this).field_g.field_b).close();
                } catch (Exception exception) {
                }
            }
            ((qa) this).field_g = null;
        }
        if (null != ((qa) this).field_l) {
            try {
                ((qa) this).field_l.close();
            } catch (Exception exception) {
            }
            ((qa) this).field_l = null;
        }
        ((qa) this).field_c = null;
    }

    final static int b() {
        return je.field_c;
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
            var4 = MonkeyPuzzle2.field_F ? 1 : 0;
            try {
              L0: while (true) {
                L1: {
                  if (((qa) this).field_e.field_h >= ((qa) this).field_e.field_g.length) {
                    break L1;
                  } else {
                    var1_int = ((qa) this).field_l.read(((qa) this).field_e.field_g, ((qa) this).field_e.field_h, -((qa) this).field_e.field_h + ((qa) this).field_e.field_g.length);
                    if (var1_int >= 0) {
                      ((qa) this).field_e.field_h = ((qa) this).field_e.field_h + var1_int;
                      continue L0;
                    } else {
                      break L1;
                    }
                  }
                }
                if (((qa) this).field_e.field_h != ((qa) this).field_e.field_g.length) {
                  var1 = this;
                  synchronized (var1) {
                    L2: {
                      ((qa) this).finalize();
                      ((qa) this).field_k = 3;
                      break L2;
                    }
                  }
                  return;
                } else {
                  throw qa.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + ((qa) this).field_e.field_g.length + " " + ((qa) this).field_f));
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref = this;
              synchronized (var2_ref) {
                L3: {
                  ((qa) this).finalize();
                  ((qa) this).field_k = ((qa) this).field_k + 1;
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

    qa(md param0, java.net.URL param1, int param2) {
        try {
            ((qa) this).field_h = param0;
            ((qa) this).field_f = param1;
            ((qa) this).field_e = new gk(param2);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "qa.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Change display name";
        field_d = new pj();
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
