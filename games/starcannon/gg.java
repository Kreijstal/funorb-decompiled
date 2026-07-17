/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class gg implements Runnable {
    private DataInputStream field_j;
    private bk field_k;
    private bk field_h;
    private ka field_l;
    static o field_i;
    private rb field_b;
    static hl[] field_f;
    static java.math.BigInteger field_e;
    static int[] field_d;
    private java.net.URL field_g;
    private int field_c;
    private bk field_a;

    protected final void finalize() {
        if (null != ((gg) this).field_h) {
            if (((gg) this).field_h.field_f != null) {
                try {
                    ((DataInputStream) ((gg) this).field_h.field_f).close();
                } catch (Exception exception) {
                }
            }
            ((gg) this).field_h = null;
        }
        if (null != ((gg) this).field_k) {
            if (!(((gg) this).field_k.field_f == null)) {
                try {
                    ((java.net.Socket) ((gg) this).field_k.field_f).close();
                } catch (Exception exception) {
                }
            }
            ((gg) this).field_k = null;
        }
        if (null != ((gg) this).field_j) {
            try {
                ((gg) this).field_j.close();
            } catch (Exception exception) {
            }
            ((gg) this).field_j = null;
        }
        ((gg) this).field_a = null;
    }

    final rb a(byte param0) {
        if (((gg) this).field_c == 3) {
          return ((gg) this).field_b;
        } else {
          if (param0 > 30) {
            return null;
          } else {
            boolean discarded$2 = ((gg) this).c((byte) 115);
            return null;
          }
        }
    }

    final synchronized boolean c(byte param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        if (-3 < ((gg) this).field_c) {
          L0: {
            if (-1 == ((gg) this).field_c) {
              L1: {
                if (null != ((gg) this).field_h) {
                  break L1;
                } else {
                  ((gg) this).field_h = ((gg) this).field_l.a((byte) -10, ((gg) this).field_g);
                  break L1;
                }
              }
              if (((gg) this).field_h.field_b == 0) {
                return false;
              } else {
                if (((gg) this).field_h.field_b == 1) {
                  break L0;
                } else {
                  ((gg) this).field_c = ((gg) this).field_c + 1;
                  ((gg) this).field_h = null;
                  return false;
                }
              }
            } else {
              break L0;
            }
          }
          L2: {
            if (param0 <= -86) {
              break L2;
            } else {
              ((gg) this).field_l = null;
              break L2;
            }
          }
          L3: {
            if (((gg) this).field_c == 1) {
              L4: {
                if (null == ((gg) this).field_k) {
                  ((gg) this).field_k = ((gg) this).field_l.a(443, -102, ((gg) this).field_g.getHost());
                  break L4;
                } else {
                  break L4;
                }
              }
              if (0 != ((gg) this).field_k.field_b) {
                if (1 == ((gg) this).field_k.field_b) {
                  break L3;
                } else {
                  ((gg) this).field_k = null;
                  ((gg) this).field_c = ((gg) this).field_c + 1;
                  return false;
                }
              } else {
                return false;
              }
            } else {
              break L3;
            }
          }
          L5: {
            if (null != ((gg) this).field_j) {
              break L5;
            } else {
              try {
                L6: {
                  L7: {
                    if (0 == ((gg) this).field_c) {
                      ((gg) this).field_j = (DataInputStream) ((gg) this).field_h.field_f;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (((gg) this).field_c == 1) {
                      var4 = (java.net.Socket) ((gg) this).field_k.field_f;
                      var4.setSoTimeout(10000);
                      var3 = var4.getOutputStream();
                      var3.write(17);
                      var5 = (CharSequence) (Object) ("JAGGRAB " + ((gg) this).field_g.getFile() + "\n\n");
                      var3.write(ld.a((byte) -101, var5));
                      ((gg) this).field_j = new DataInputStream(var4.getInputStream());
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  ((gg) this).field_b.field_g = 0;
                  decompiledRegionSelector0 = 0;
                  break L6;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L9: {
                  var2 = (IOException) (Object) decompiledCaughtException;
                  ((gg) this).finalize();
                  ((gg) this).field_c = ((gg) this).field_c + 1;
                  decompiledRegionSelector0 = 1;
                  break L9;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                L10: {
                  if (null == ((gg) this).field_a) {
                    ((gg) this).field_a = ((gg) this).field_l.a(5, 104, (Runnable) this);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                if (-1 == ((gg) this).field_a.field_b) {
                  return false;
                } else {
                  if (-2 == ((gg) this).field_a.field_b) {
                    return false;
                  } else {
                    ((gg) this).finalize();
                    ((gg) this).field_c = ((gg) this).field_c + 1;
                    return false;
                  }
                }
              } else {
                break L5;
              }
            }
          }
          L11: {
            if (null == ((gg) this).field_a) {
              ((gg) this).field_a = ((gg) this).field_l.a(5, 104, (Runnable) this);
              break L11;
            } else {
              break L11;
            }
          }
          if (-1 == ((gg) this).field_a.field_b) {
            return false;
          } else {
            L12: {
              if (-2 != ((gg) this).field_a.field_b) {
                ((gg) this).finalize();
                ((gg) this).field_c = ((gg) this).field_c + 1;
                break L12;
              } else {
                break L12;
              }
            }
            return false;
          }
        } else {
          return true;
        }
    }

    public static void b() {
        field_e = null;
        field_d = null;
        field_f = null;
        field_i = null;
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
            var4 = StarCannon.field_A;
            try {
              L0: while (true) {
                L1: {
                  if (((gg) this).field_b.field_f.length <= ((gg) this).field_b.field_g) {
                    break L1;
                  } else {
                    var1_int = ((gg) this).field_j.read(((gg) this).field_b.field_f, ((gg) this).field_b.field_g, -((gg) this).field_b.field_g + ((gg) this).field_b.field_f.length);
                    if (var1_int < 0) {
                      break L1;
                    } else {
                      ((gg) this).field_b.field_g = ((gg) this).field_b.field_g + var1_int;
                      continue L0;
                    }
                  }
                }
                if (((gg) this).field_b.field_f.length == ((gg) this).field_b.field_g) {
                  throw gg.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + ((gg) this).field_b.field_f.length + " " + ((gg) this).field_g));
                } else {
                  var1 = this;
                  synchronized (var1) {
                    L2: {
                      ((gg) this).finalize();
                      ((gg) this).field_c = 3;
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
                  ((gg) this).finalize();
                  ((gg) this).field_c = ((gg) this).field_c + 1;
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

    gg(ka param0, java.net.URL param1, int param2) {
        try {
            ((gg) this).field_l = param0;
            ((gg) this).field_g = param1;
            ((gg) this).field_b = new rb(param2);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "gg.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new o(14, 0, 4, 1);
        field_e = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
