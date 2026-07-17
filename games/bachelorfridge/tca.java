/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tca implements Runnable {
    static int field_f;
    static String field_b;
    private ht field_d;
    private lu field_h;
    private java.net.URL field_i;
    static sna field_c;
    private eh field_g;
    private DataInputStream field_l;
    static vr field_m;
    static String field_a;
    private eh field_j;
    private int field_e;
    private eh field_k;

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
            var4 = BachelorFridge.field_y;
            try {
              L0: while (true) {
                L1: {
                  if (((tca) this).field_h.field_h.length <= ((tca) this).field_h.field_g) {
                    break L1;
                  } else {
                    var1_int = ((tca) this).field_l.read(((tca) this).field_h.field_h, ((tca) this).field_h.field_g, -((tca) this).field_h.field_g + ((tca) this).field_h.field_h.length);
                    if (var1_int < 0) {
                      break L1;
                    } else {
                      ((tca) this).field_h.field_g = ((tca) this).field_h.field_g + var1_int;
                      continue L0;
                    }
                  }
                }
                if (((tca) this).field_h.field_g != ((tca) this).field_h.field_h.length) {
                  var1 = this;
                  synchronized (var1) {
                    L2: {
                      ((tca) this).finalize();
                      ((tca) this).field_e = 3;
                      break L2;
                    }
                  }
                  return;
                } else {
                  throw tca.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + ((tca) this).field_h.field_h.length + " " + ((tca) this).field_i));
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref = this;
              synchronized (var2_ref) {
                L3: {
                  ((tca) this).finalize();
                  ((tca) this).field_e = ((tca) this).field_e + 1;
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

    protected final void finalize() {
        if (!(((tca) this).field_j == null)) {
            if (((tca) this).field_j.field_e != null) {
                try {
                    ((DataInputStream) ((tca) this).field_j.field_e).close();
                } catch (Exception exception) {
                }
            }
            ((tca) this).field_j = null;
        }
        if (!(null == ((tca) this).field_g)) {
            if (!(((tca) this).field_g.field_e == null)) {
                try {
                    ((java.net.Socket) ((tca) this).field_g.field_e).close();
                } catch (Exception exception) {
                }
            }
            ((tca) this).field_g = null;
        }
        if (!(null == ((tca) this).field_l)) {
            try {
                ((tca) this).field_l.close();
            } catch (Exception exception) {
            }
            ((tca) this).field_l = null;
        }
        ((tca) this).field_k = null;
    }

    final synchronized boolean b(byte param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        if (((tca) this).field_e < 2) {
          L0: {
            if (((tca) this).field_e == 0) {
              L1: {
                if (((tca) this).field_j == null) {
                  ((tca) this).field_j = ((tca) this).field_d.a(((tca) this).field_i, 97);
                  break L1;
                } else {
                  break L1;
                }
              }
              if (((tca) this).field_j.field_f != 0) {
                if (((tca) this).field_j.field_f == 1) {
                  break L0;
                } else {
                  ((tca) this).field_e = ((tca) this).field_e + 1;
                  ((tca) this).field_j = null;
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
            if (((tca) this).field_e != 1) {
              break L2;
            } else {
              L3: {
                if (((tca) this).field_g != null) {
                  break L3;
                } else {
                  ((tca) this).field_g = ((tca) this).field_d.a((byte) 122, ((tca) this).field_i.getHost(), 443);
                  break L3;
                }
              }
              if (((tca) this).field_g.field_f != 0) {
                if (((tca) this).field_g.field_f != 1) {
                  ((tca) this).field_e = ((tca) this).field_e + 1;
                  ((tca) this).field_g = null;
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
            if (null != ((tca) this).field_l) {
              break L4;
            } else {
              try {
                L5: {
                  L6: {
                    if (-1 == ((tca) this).field_e) {
                      ((tca) this).field_l = (DataInputStream) ((tca) this).field_j.field_e;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (-2 == ((tca) this).field_e) {
                      var4 = (java.net.Socket) ((tca) this).field_g.field_e;
                      var4.setSoTimeout(10000);
                      var3 = var4.getOutputStream();
                      var3.write(17);
                      var5 = (CharSequence) (Object) ("JAGGRAB " + ((tca) this).field_i.getFile() + "\n\n");
                      var3.write(bv.a(18019, var5));
                      ((tca) this).field_l = new DataInputStream(var4.getInputStream());
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  ((tca) this).field_h.field_g = 0;
                  decompiledRegionSelector0 = 0;
                  break L5;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L8: {
                  var2 = (IOException) (Object) decompiledCaughtException;
                  ((tca) this).finalize();
                  ((tca) this).field_e = ((tca) this).field_e + 1;
                  decompiledRegionSelector0 = 1;
                  break L8;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                L9: {
                  if (((tca) this).field_k == null) {
                    ((tca) this).field_k = ((tca) this).field_d.a((Runnable) this, 2, 5);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                if (param0 > 119) {
                  if (0 == ((tca) this).field_k.field_f) {
                    return false;
                  } else {
                    if (((tca) this).field_k.field_f == 1) {
                      return false;
                    } else {
                      ((tca) this).finalize();
                      ((tca) this).field_e = ((tca) this).field_e + 1;
                      return false;
                    }
                  }
                } else {
                  return true;
                }
              } else {
                break L4;
              }
            }
          }
          L10: {
            if (((tca) this).field_k == null) {
              ((tca) this).field_k = ((tca) this).field_d.a((Runnable) this, 2, 5);
              break L10;
            } else {
              break L10;
            }
          }
          if (param0 > 119) {
            if (0 == ((tca) this).field_k.field_f) {
              return false;
            } else {
              L11: {
                if (((tca) this).field_k.field_f != 1) {
                  ((tca) this).finalize();
                  ((tca) this).field_e = ((tca) this).field_e + 1;
                  break L11;
                } else {
                  break L11;
                }
              }
              return false;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final lu a(int param0) {
        if (param0 == -11514) {
          if (((tca) this).field_e != 3) {
            return null;
          } else {
            return ((tca) this).field_h;
          }
        } else {
          tca.a((byte) 18);
          if (((tca) this).field_e != 3) {
            return null;
          } else {
            return ((tca) this).field_h;
          }
        }
    }

    public static void a(byte param0) {
        if (param0 != -84) {
            return;
        }
        field_b = null;
        field_a = null;
        field_c = null;
        field_m = null;
    }

    tca(ht param0, java.net.URL param1, int param2) {
        try {
            ((tca) this).field_i = param1;
            ((tca) this).field_d = param0;
            ((tca) this).field_h = new lu(param2);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "tca.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final static void a(gea param0, int param1, int param2) {
        pf var5 = sja.field_fb;
        var5.c(param2, (byte) 102);
        var5.field_g = var5.field_g + 1;
        int var4 = var5.field_g;
        var5.d(1, 0);
        var5.d(param0.field_i, 0);
        var5.c((byte) 110, param0.field_m);
        var5.e(param0.field_o, -1615464796);
        var5.e(param0.field_j, param1 + -1615464801);
        var5.e(param0.field_k, -1615464796);
        if (param1 != 5) {
            return;
        }
        try {
            var5.e(param0.field_h, -1615464796);
            int discarded$0 = var5.a(var4, 19);
            var5.b((byte) 124, -var4 + var5.field_g);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "tca.D(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Day";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
