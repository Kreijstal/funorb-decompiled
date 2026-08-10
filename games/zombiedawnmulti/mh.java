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
        if (!(null == this.field_e)) {
            if (!(this.field_e.field_d == null)) {
                try {
                    ((DataInputStream) (this.field_e.field_d)).close();
                } catch (Exception exception) {
                }
            }
            this.field_e = null;
        }
        if (!(this.field_b == null)) {
            if (this.field_b.field_d != null) {
                try {
                    ((java.net.Socket) (this.field_b.field_d)).close();
                } catch (Exception exception) {
                }
            }
            this.field_b = null;
        }
        if (!(null == this.field_f)) {
            try {
                this.field_f.close();
            } catch (Exception exception) {
            }
            this.field_f = null;
        }
        this.field_d = null;
    }

    final synchronized boolean b(int param0) {
        Throwable decompiledCaughtException = null;
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        if ((this.field_k ^ -1) <= -3) {
          return true;
        } else {
          L0: {
            if (-1 == (this.field_k ^ -1)) {
              L1: {
                if (this.field_e != null) {
                  break L1;
                } else {
                  this.field_e = this.field_j.a((byte) -12, this.field_a);
                  break L1;
                }
              }
              if (0 != this.field_e.field_f) {
                if ((this.field_e.field_f ^ -1) == -2) {
                  break L0;
                } else {
                  this.field_e = null;
                  this.field_k = this.field_k + 1;
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
            if (-2 == (this.field_k ^ -1)) {
              L3: {
                if (this.field_b != null) {
                  break L3;
                } else {
                  this.field_b = this.field_j.a(this.field_a.getHost(), 443, (byte) -120);
                  break L3;
                }
              }
              if (this.field_b.field_f == 0) {
                return false;
              } else {
                if (-2 == (this.field_b.field_f ^ -1)) {
                  break L2;
                } else {
                  this.field_k = this.field_k + 1;
                  this.field_b = null;
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
              this.field_f = (DataInputStream) null;
              break L4;
            }
          }
          if (null == this.field_f) {
            try {
              L5: {
                L6: {
                  if (-1 == (this.field_k ^ -1)) {
                    this.field_f = (DataInputStream) (this.field_e.field_d);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (-2 == (this.field_k ^ -1)) {
                    var4 = (java.net.Socket) (this.field_b.field_d);
                    var4.setSoTimeout(10000);
                    var3 = var4.getOutputStream();
                    var3.write(17);
                    var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_a.getFile() + "\n\n"));
                    var3.write(qo.a(var5, (byte) -116));
                    this.field_f = new DataInputStream(var4.getInputStream());
                    break L7;
                  } else {
                    break L7;
                  }
                }
                this.field_g.field_j = 0;
                break L5;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L8: {
                var2 = (IOException) (Object) decompiledCaughtException;
                this.finalize();
                this.field_k = this.field_k + 1;
                if (null == this.field_d) {
                  this.field_d = this.field_j.a(117, (Runnable) (this), 5);
                  break L8;
                } else {
                  break L8;
                }
              }
              if (0 == this.field_d.field_f) {
                return false;
              } else {
                L9: {
                  if (1 != this.field_d.field_f) {
                    this.finalize();
                    this.field_k = this.field_k + 1;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                return false;
              }
            }
            L10: {
              if (null == this.field_d) {
                this.field_d = this.field_j.a(117, (Runnable) (this), 5);
                break L10;
              } else {
                break L10;
              }
            }
            if (0 == this.field_d.field_f) {
              return false;
            } else {
              L11: {
                if (1 != this.field_d.field_f) {
                  this.finalize();
                  this.field_k = this.field_k + 1;
                  break L11;
                } else {
                  break L11;
                }
              }
              return false;
            }
          } else {
            L12: {
              if (null == this.field_d) {
                this.field_d = this.field_j.a(117, (Runnable) (this), 5);
                break L12;
              } else {
                break L12;
              }
            }
            if (0 != this.field_d.field_f) {
              if (1 == this.field_d.field_f) {
                return false;
              } else {
                this.finalize();
                this.field_k = this.field_k + 1;
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
            Object var2 = null;
            Throwable var3 = null;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            var4 = ZombieDawnMulti.field_E ? 1 : 0;
            try {
              L0: while (true) {
                L1: {
                  if (this.field_g.field_j >= this.field_g.field_m.length) {
                    break L1;
                  } else {
                    var1_int = this.field_f.read(this.field_g.field_m, this.field_g.field_j, this.field_g.field_m.length + -this.field_g.field_j);
                    if ((var1_int ^ -1) <= -1) {
                      this.field_g.field_j = this.field_g.field_j + var1_int;
                      continue L0;
                    } else {
                      break L1;
                    }
                  }
                }
                if (this.field_g.field_j != this.field_g.field_m.length) {
                  var1 = this;
                  synchronized (var1) {
                    L2: {
                      this.finalize();
                      this.field_k = 3;
                      break L2;
                    }
                  }
                  return;
                } else {
                  throw mh.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_g.field_m.length + " " + this.field_a));
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (Exception) (Object) decompiledCaughtException;
              var2 = this;
              synchronized (var2) {
                L3: {
                  this.finalize();
                  this.field_k = this.field_k + 1;
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

    final static void c(int param0) {
        vl var1 = null;
        ga var2 = null;
        if (param0 != 0) {
            field_l = (th) null;
            var1 = (vl) ((Object) lf.field_e.c(param0 + 69));
            if (!(var1 != null)) {
                ak.a((byte) -112);
                return;
            }
            var2 = s.field_e;
            var2.i(-1478490344);
            var2.i(-1478490344);
            var2.i(-1478490344);
            var2.i(-1478490344);
            var1.a(true);
            return;
        }
        var1 = (vl) ((Object) lf.field_e.c(param0 + 69));
        if (!(var1 != null)) {
            ak.a((byte) -112);
            return;
        }
        var2 = s.field_e;
        var2.i(-1478490344);
        var2.i(-1478490344);
        var2.i(-1478490344);
        var2.i(-1478490344);
        var1.a(true);
    }

    final k a(byte param0) {
        if (param0 == 21) {
          if (3 != this.field_k) {
            return null;
          } else {
            return this.field_g;
          }
        } else {
          field_i = (cj) null;
          if (3 != this.field_k) {
            return null;
          } else {
            return this.field_g;
          }
        }
    }

    public static void a(int param0) {
        field_l = null;
        if (param0 != 17) {
            mh.c(29);
            field_c = null;
            field_i = null;
            return;
        }
        field_c = null;
        field_i = null;
    }

    mh(go param0, java.net.URL param1, int param2) {
        try {
            this.field_a = param1;
            this.field_j = param0;
            this.field_g = new k(param2);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "mh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_l = new th();
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
