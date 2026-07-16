/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class mm implements Runnable {
    static int field_g;
    static int field_d;
    private fj field_i;
    private rc field_f;
    private DataInputStream field_c;
    private rc field_a;
    private vh field_j;
    private int field_e;
    private rc field_b;
    private java.net.URL field_k;
    static boolean field_h;

    final fj a(boolean param0) {
        if ((((mm) this).field_e ^ -1) == -4) {
            return ((mm) this).field_i;
        }
        if (param0) {
            return null;
        }
        ((mm) this).finalize();
        return null;
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
            var4 = Torquing.field_u;
            try {
              L0: {
                L1: while (true) {
                  L2: {
                    if (((mm) this).field_i.field_j.length <= ((mm) this).field_i.field_n) {
                      break L2;
                    } else {
                      var1_int = ((mm) this).field_c.read(((mm) this).field_i.field_j, ((mm) this).field_i.field_n, ((mm) this).field_i.field_j.length + -((mm) this).field_i.field_n);
                      if (var1_int >= 0) {
                        ((mm) this).field_i.field_n = ((mm) this).field_i.field_n + var1_int;
                        continue L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (((mm) this).field_i.field_j.length != ((mm) this).field_i.field_n) {
                    var1 = this;
                    synchronized (var1) {
                      L3: {
                        ((mm) this).finalize();
                        ((mm) this).field_e = 3;
                        break L3;
                      }
                    }
                    break L0;
                  } else {
                    throw mm.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + ((mm) this).field_i.field_j.length + " " + ((mm) this).field_k));
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L4: {
                var1_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref = this;
                synchronized (var2_ref) {
                  L5: {
                    ((mm) this).finalize();
                    ((mm) this).field_e = ((mm) this).field_e + 1;
                    break L5;
                  }
                }
                break L4;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0) {
        if (param0 != 60) {
            return;
        }
        qi.field_c = false;
        int discarded$0 = kj.field_d.i((byte) -101);
    }

    final synchronized boolean a(int param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        Throwable decompiledCaughtException = null;
        if (((mm) this).field_e < 2) {
          L0: {
            if (-1 == (((mm) this).field_e ^ -1)) {
              L1: {
                if (((mm) this).field_f == null) {
                  ((mm) this).field_f = ((mm) this).field_j.a(param0 ^ 3, ((mm) this).field_k);
                  break L1;
                } else {
                  break L1;
                }
              }
              if (((mm) this).field_f.field_a != 0) {
                if (1 == ((mm) this).field_f.field_a) {
                  break L0;
                } else {
                  ((mm) this).field_e = ((mm) this).field_e + 1;
                  ((mm) this).field_f = null;
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
            if (((mm) this).field_e == 1) {
              L3: {
                if (null == ((mm) this).field_b) {
                  ((mm) this).field_b = ((mm) this).field_j.a(((mm) this).field_k.getHost(), 443, -60);
                  break L3;
                } else {
                  break L3;
                }
              }
              if (-1 != (((mm) this).field_b.field_a ^ -1)) {
                if (((mm) this).field_b.field_a == 1) {
                  break L2;
                } else {
                  ((mm) this).field_e = ((mm) this).field_e + 1;
                  ((mm) this).field_b = null;
                  return false;
                }
              } else {
                return false;
              }
            } else {
              break L2;
            }
          }
          L4: {
            if (null == ((mm) this).field_c) {
              try {
                L5: {
                  L6: {
                    if (-1 == (((mm) this).field_e ^ -1)) {
                      ((mm) this).field_c = (DataInputStream) ((mm) this).field_f.field_d;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (1 != ((mm) this).field_e) {
                      break L7;
                    } else {
                      var4 = (java.net.Socket) ((mm) this).field_b.field_d;
                      var4.setSoTimeout(10000);
                      var3 = var4.getOutputStream();
                      var3.write(17);
                      var5 = (CharSequence) (Object) ("JAGGRAB " + ((mm) this).field_k.getFile() + "\n\n");
                      var3.write(vg.a(var5, (byte) -126));
                      ((mm) this).field_c = new DataInputStream(var4.getInputStream());
                      break L7;
                    }
                  }
                  ((mm) this).field_i.field_n = 0;
                  break L5;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L8: {
                  var2 = (IOException) (Object) decompiledCaughtException;
                  ((mm) this).finalize();
                  ((mm) this).field_e = ((mm) this).field_e + 1;
                  break L8;
                }
              }
              break L4;
            } else {
              break L4;
            }
          }
          if (param0 == 3) {
            L9: {
              if (((mm) this).field_a != null) {
                break L9;
              } else {
                ((mm) this).field_a = ((mm) this).field_j.a((byte) -102, 5, (Runnable) this);
                break L9;
              }
            }
            if (((mm) this).field_a.field_a == 0) {
              return false;
            } else {
              if (-2 == (((mm) this).field_a.field_a ^ -1)) {
                return false;
              } else {
                ((mm) this).finalize();
                ((mm) this).field_e = ((mm) this).field_e + 1;
                return false;
              }
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final static long a(CharSequence param0, byte param1) {
        long var2 = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Torquing.field_u;
        var2 = 0L;
        var4 = param0.length();
        var5 = 0;
        L0: while (true) {
          L1: {
            if (var5 >= var4) {
              break L1;
            } else {
              L2: {
                L3: {
                  var2 = var2 * 37L;
                  var6 = param0.charAt(var5);
                  if (65 > var6) {
                    break L3;
                  } else {
                    if (var6 > 90) {
                      break L3;
                    } else {
                      var2 = var2 + (long)(1 + var6 - 65);
                      break L2;
                    }
                  }
                }
                L4: {
                  if (var6 < 97) {
                    break L4;
                  } else {
                    if (122 < var6) {
                      break L4;
                    } else {
                      var2 = var2 + (long)(1 - -var6 + -97);
                      break L2;
                    }
                  }
                }
                if (48 > var6) {
                  break L2;
                } else {
                  if (57 < var6) {
                    break L2;
                  } else {
                    var2 = var2 + (long)(27 - (-var6 - -48));
                    break L2;
                  }
                }
              }
              if ((var2 ^ -1L) <= -177917621779460414L) {
                break L1;
              } else {
                var5++;
                continue L0;
              }
            }
          }
          L5: while (true) {
            L6: {
              if (0L != var2 % 37L) {
                break L6;
              } else {
                if (0L == var2) {
                  break L6;
                } else {
                  var2 = var2 / 37L;
                  continue L5;
                }
              }
            }
            L7: {
              if (param1 >= 86) {
                break L7;
              } else {
                field_h = false;
                break L7;
              }
            }
            return var2;
          }
        }
    }

    protected final void finalize() {
        if (((mm) this).field_f != null) {
            if (null != ((mm) this).field_f.field_d) {
                try {
                    ((DataInputStream) ((mm) this).field_f.field_d).close();
                } catch (Exception exception) {
                }
            }
            ((mm) this).field_f = null;
        }
        if (!(null == ((mm) this).field_b)) {
            if (!(((mm) this).field_b.field_d == null)) {
                try {
                    ((java.net.Socket) ((mm) this).field_b.field_d).close();
                } catch (Exception exception) {
                }
            }
            ((mm) this).field_b = null;
        }
        if (!(((mm) this).field_c == null)) {
            try {
                ((mm) this).field_c.close();
            } catch (Exception exception) {
            }
            ((mm) this).field_c = null;
        }
        ((mm) this).field_a = null;
    }

    mm(vh param0, java.net.URL param1, int param2) {
        ((mm) this).field_j = param0;
        ((mm) this).field_k = param1;
        ((mm) this).field_i = new fj(param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = -1;
        field_h = false;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
