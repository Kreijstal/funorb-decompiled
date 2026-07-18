/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bi implements Runnable {
    private mob field_f;
    private mob field_c;
    private ds field_h;
    static String field_g;
    private mob field_b;
    private java.net.URL field_i;
    private DataInputStream field_d;
    private eab field_e;
    private int field_a;

    public static void b() {
        field_g = null;
    }

    final synchronized boolean c(int param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        if (((bi) this).field_a < 2) {
          L0: {
            if (0 != ((bi) this).field_a) {
              break L0;
            } else {
              L1: {
                if (null == ((bi) this).field_c) {
                  ((bi) this).field_c = ((bi) this).field_e.a(((bi) this).field_i, 97);
                  break L1;
                } else {
                  break L1;
                }
              }
              if (((bi) this).field_c.field_f != 0) {
                if (((bi) this).field_c.field_f != 1) {
                  ((bi) this).field_a = ((bi) this).field_a + 1;
                  ((bi) this).field_c = null;
                  return false;
                } else {
                  break L0;
                }
              } else {
                return false;
              }
            }
          }
          L2: {
            if (((bi) this).field_a != 1) {
              break L2;
            } else {
              L3: {
                if (((bi) this).field_b == null) {
                  ((bi) this).field_b = ((bi) this).field_e.a(443, ((bi) this).field_i.getHost(), 91);
                  break L3;
                } else {
                  break L3;
                }
              }
              if (((bi) this).field_b.field_f == 0) {
                return false;
              } else {
                if (1 != ((bi) this).field_b.field_f) {
                  ((bi) this).field_b = null;
                  ((bi) this).field_a = ((bi) this).field_a + 1;
                  return false;
                } else {
                  break L2;
                }
              }
            }
          }
          L4: {
            if (null != ((bi) this).field_d) {
              break L4;
            } else {
              try {
                L5: {
                  L6: {
                    if (((bi) this).field_a != 0) {
                      break L6;
                    } else {
                      ((bi) this).field_d = (DataInputStream) ((bi) this).field_c.field_d;
                      break L6;
                    }
                  }
                  L7: {
                    if (((bi) this).field_a != 1) {
                      break L7;
                    } else {
                      var4 = (java.net.Socket) ((bi) this).field_b.field_d;
                      var4.setSoTimeout(10000);
                      var3 = var4.getOutputStream();
                      var3.write(17);
                      var5 = (CharSequence) (Object) ("JAGGRAB " + ((bi) this).field_i.getFile() + "\n\n");
                      var3.write(hi.a(var5, 126));
                      ((bi) this).field_d = new DataInputStream(var4.getInputStream());
                      break L7;
                    }
                  }
                  ((bi) this).field_h.field_e = 0;
                  decompiledRegionSelector0 = 0;
                  break L5;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L8: {
                  var2 = (IOException) (Object) decompiledCaughtException;
                  ((bi) this).finalize();
                  ((bi) this).field_a = ((bi) this).field_a + 1;
                  decompiledRegionSelector0 = 1;
                  break L8;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                L9: {
                  if (null != ((bi) this).field_f) {
                    break L9;
                  } else {
                    ((bi) this).field_f = ((bi) this).field_e.a(0, 5, (Runnable) this);
                    break L9;
                  }
                }
                if (0 == ((bi) this).field_f.field_f) {
                  return false;
                } else {
                  L10: {
                    if (param0 > 38) {
                      break L10;
                    } else {
                      ((bi) this).run();
                      break L10;
                    }
                  }
                  if (((bi) this).field_f.field_f != 1) {
                    ((bi) this).finalize();
                    ((bi) this).field_a = ((bi) this).field_a + 1;
                    return false;
                  } else {
                    return false;
                  }
                }
              } else {
                break L4;
              }
            }
          }
          if (null != ((bi) this).field_f) {
            if (0 == ((bi) this).field_f.field_f) {
              return false;
            } else {
              if (param0 > 38) {
                L11: {
                  if (((bi) this).field_f.field_f != 1) {
                    ((bi) this).finalize();
                    ((bi) this).field_a = ((bi) this).field_a + 1;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                return false;
              } else {
                L12: {
                  ((bi) this).run();
                  if (((bi) this).field_f.field_f != 1) {
                    ((bi) this).finalize();
                    ((bi) this).field_a = ((bi) this).field_a + 1;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                return false;
              }
            }
          } else {
            ((bi) this).field_f = ((bi) this).field_e.a(0, 5, (Runnable) this);
            if (0 == ((bi) this).field_f.field_f) {
              return false;
            } else {
              if (param0 <= 38) {
                L13: {
                  ((bi) this).run();
                  if (((bi) this).field_f.field_f != 1) {
                    ((bi) this).finalize();
                    ((bi) this).field_a = ((bi) this).field_a + 1;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                return false;
              } else {
                L14: {
                  if (((bi) this).field_f.field_f != 1) {
                    ((bi) this).finalize();
                    ((bi) this).field_a = ((bi) this).field_a + 1;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                return false;
              }
            }
          }
        } else {
          return true;
        }
    }

    protected final void finalize() {
        if (null != ((bi) this).field_c) {
            if (!(null == ((bi) this).field_c.field_d)) {
                try {
                    ((DataInputStream) ((bi) this).field_c.field_d).close();
                } catch (Exception exception) {
                }
            }
            ((bi) this).field_c = null;
        }
        if (!(null == ((bi) this).field_b)) {
            if (!(((bi) this).field_b.field_d == null)) {
                try {
                    ((java.net.Socket) ((bi) this).field_b.field_d).close();
                } catch (Exception exception) {
                }
            }
            ((bi) this).field_b = null;
        }
        if (!(((bi) this).field_d == null)) {
            try {
                ((bi) this).field_d.close();
            } catch (Exception exception) {
            }
            ((bi) this).field_d = null;
        }
        ((bi) this).field_f = null;
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
            var4 = VoidHunters.field_G;
            try {
              L0: while (true) {
                L1: {
                  if (((bi) this).field_h.field_h.length <= ((bi) this).field_h.field_e) {
                    break L1;
                  } else {
                    var1_int = ((bi) this).field_d.read(((bi) this).field_h.field_h, ((bi) this).field_h.field_e, ((bi) this).field_h.field_h.length + -((bi) this).field_h.field_e);
                    if (var1_int < 0) {
                      break L1;
                    } else {
                      ((bi) this).field_h.field_e = ((bi) this).field_h.field_e + var1_int;
                      continue L0;
                    }
                  }
                }
                if (((bi) this).field_h.field_e == ((bi) this).field_h.field_h.length) {
                  throw bi.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + ((bi) this).field_h.field_h.length + " " + (Object) (Object) ((bi) this).field_i));
                } else {
                  var1 = this;
                  synchronized (var1) {
                    L2: {
                      ((bi) this).finalize();
                      ((bi) this).field_a = 3;
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
                  ((bi) this).finalize();
                  ((bi) this).field_a = ((bi) this).field_a + 1;
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

    final ds a(int param0) {
        int var2 = 0;
        var2 = 118 % ((param0 - -32) / 54);
        if (((bi) this).field_a != 3) {
          return null;
        } else {
          return ((bi) this).field_h;
        }
    }

    bi(eab param0, java.net.URL param1, int param2) {
        try {
            ((bi) this).field_e = param0;
            ((bi) this).field_i = param1;
            ((bi) this).field_h = new ds(param2);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "bi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Scale down map width";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
