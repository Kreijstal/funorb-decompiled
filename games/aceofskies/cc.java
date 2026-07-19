/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class cc implements Runnable {
    static String[] field_b;
    private rb field_a;
    private java.net.URL field_j;
    private DataInputStream field_g;
    static int field_i;
    private rk field_d;
    private en field_h;
    private en field_e;
    private en field_f;
    private int field_c;

    protected final void finalize() {
        if (null != this.field_f) {
            if (this.field_f.field_f != null) {
                try {
                    ((DataInputStream) (this.field_f.field_f)).close();
                } catch (Exception exception) {
                }
            }
            this.field_f = null;
        }
        if (!(null == this.field_e)) {
            if (this.field_e.field_f != null) {
                try {
                    ((java.net.Socket) (this.field_e.field_f)).close();
                } catch (Exception exception) {
                }
            }
            this.field_e = null;
        }
        if (!(this.field_g == null)) {
            try {
                this.field_g.close();
            } catch (Exception exception) {
            }
            this.field_g = null;
        }
        this.field_h = null;
    }

    final rb a(boolean param0) {
        if (!param0) {
            return (rb) null;
        }
        if (3 != this.field_c) {
            return null;
        }
        return this.field_a;
    }

    final synchronized boolean a(byte param0) {
        int var2 = 0;
        IOException var3 = null;
        OutputStream var4 = null;
        java.net.Socket var5 = null;
        CharSequence var6 = null;
        Throwable decompiledCaughtException = null;
        if (this.field_c >= 2) {
          return true;
        } else {
          L0: {
            if (0 != this.field_c) {
              break L0;
            } else {
              L1: {
                if (null == this.field_f) {
                  this.field_f = this.field_d.a((byte) 71, this.field_j);
                  break L1;
                } else {
                  break L1;
                }
              }
              if (this.field_f.field_a != 0) {
                if ((this.field_f.field_a ^ -1) != -2) {
                  this.field_f = null;
                  this.field_c = this.field_c + 1;
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
            var2 = -109 % ((11 - param0) / 36);
            if (-2 != (this.field_c ^ -1)) {
              break L2;
            } else {
              L3: {
                if (this.field_e == null) {
                  this.field_e = this.field_d.a(2, this.field_j.getHost(), 443);
                  break L3;
                } else {
                  break L3;
                }
              }
              if (this.field_e.field_a != 0) {
                if ((this.field_e.field_a ^ -1) == -2) {
                  break L2;
                } else {
                  this.field_c = this.field_c + 1;
                  this.field_e = null;
                  return false;
                }
              } else {
                return false;
              }
            }
          }
          if (null == this.field_g) {
            try {
              L4: {
                L5: {
                  if (-1 != (this.field_c ^ -1)) {
                    break L5;
                  } else {
                    this.field_g = (DataInputStream) (this.field_f.field_f);
                    break L5;
                  }
                }
                L6: {
                  if (-2 != (this.field_c ^ -1)) {
                    break L6;
                  } else {
                    var5 = (java.net.Socket) (this.field_e.field_f);
                    var5.setSoTimeout(10000);
                    var4 = var5.getOutputStream();
                    var4.write(17);
                    var6 = (CharSequence) ((Object) ("JAGGRAB " + this.field_j.getFile() + "\n\n"));
                    var4.write(fa.a(var6, 8482));
                    this.field_g = new DataInputStream(var5.getInputStream());
                    break L6;
                  }
                }
                this.field_a.field_g = 0;
                break L4;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L7: {
                var3 = (IOException) (Object) decompiledCaughtException;
                this.finalize();
                this.field_c = this.field_c + 1;
                if (null == this.field_h) {
                  this.field_h = this.field_d.a(5, 1048576, (Runnable) (this));
                  break L7;
                } else {
                  break L7;
                }
              }
              if (this.field_h.field_a == 0) {
                return false;
              } else {
                L8: {
                  if ((this.field_h.field_a ^ -1) != -2) {
                    this.finalize();
                    this.field_c = this.field_c + 1;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                return false;
              }
            }
            L9: {
              if (null == this.field_h) {
                this.field_h = this.field_d.a(5, 1048576, (Runnable) (this));
                break L9;
              } else {
                break L9;
              }
            }
            if (this.field_h.field_a == 0) {
              return false;
            } else {
              L10: {
                if ((this.field_h.field_a ^ -1) != -2) {
                  this.finalize();
                  this.field_c = this.field_c + 1;
                  break L10;
                } else {
                  break L10;
                }
              }
              return false;
            }
          } else {
            L11: {
              if (null == this.field_h) {
                this.field_h = this.field_d.a(5, 1048576, (Runnable) (this));
                break L11;
              } else {
                break L11;
              }
            }
            if (this.field_h.field_a != 0) {
              if ((this.field_h.field_a ^ -1) == -2) {
                return false;
              } else {
                this.finalize();
                this.field_c = this.field_c + 1;
                return false;
              }
            } else {
              return false;
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 != -2) {
            cc.a(-19);
            field_b = null;
            return;
        }
        field_b = null;
    }

    public final void run() {
        try {
            int var1_int = 0;
            Object var1 = null;
            Object var2 = null;
            Throwable var3 = null;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            var4 = AceOfSkies.field_G ? 1 : 0;
            try {
              L0: while (true) {
                L1: {
                  if (this.field_a.field_g >= this.field_a.field_f.length) {
                    break L1;
                  } else {
                    var1_int = this.field_g.read(this.field_a.field_f, this.field_a.field_g, -this.field_a.field_g + this.field_a.field_f.length);
                    if (0 > var1_int) {
                      break L1;
                    } else {
                      this.field_a.field_g = this.field_a.field_g + var1_int;
                      continue L0;
                    }
                  }
                }
                if (this.field_a.field_g == this.field_a.field_f.length) {
                  throw cc.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_a.field_f.length + " " + this.field_j));
                } else {
                  var1 = this;
                  synchronized (var1) {
                    L2: {
                      this.finalize();
                      this.field_c = 3;
                      break L2;
                    }
                  }
                  return;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (Exception) (Object) decompiledCaughtException;
              var2 = this;
              synchronized (var2) {
                L3: {
                  this.finalize();
                  this.field_c = this.field_c + 1;
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

    cc(rk param0, java.net.URL param1, int param2) {
        try {
            this.field_d = param0;
            this.field_j = param1;
            this.field_a = new rb(param2);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "cc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
