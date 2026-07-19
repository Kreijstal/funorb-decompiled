/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ad implements Runnable {
    static String field_c;
    static String field_h;
    private la field_g;
    private DataInputStream field_b;
    private la field_e;
    private n field_i;
    private java.net.URL field_j;
    private lk field_f;
    static int field_d;
    private la field_a;
    private int field_k;

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        rl var4 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = EscapeVector.field_A;
        try {
          L0: {
            if (param1 >= 44) {
              var4 = (rl) ((Object) cd.field_s.a(false));
              L1: while (true) {
                if (var4 == null) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  qh.a(var4, true, param0);
                  var4 = (rl) ((Object) cd.field_s.b((byte) 70));
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "ad.A(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void b(int param0) {
        field_c = null;
        field_h = null;
        if (param0 != -1) {
            field_d = -109;
        }
    }

    final n c(int param0) {
        if (!(this.field_k != 3)) {
            return this.field_i;
        }
        if (param0 < -12) {
            return null;
        }
        return (n) null;
    }

    public final void run() {
        try {
            int var1_int = 0;
            Object var1 = null;
            Object var2 = null;
            Throwable var3 = null;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            var4 = EscapeVector.field_A;
            try {
              L0: while (true) {
                L1: {
                  if (this.field_i.field_g.length <= this.field_i.field_m) {
                    break L1;
                  } else {
                    var1_int = this.field_b.read(this.field_i.field_g, this.field_i.field_m, -this.field_i.field_m + this.field_i.field_g.length);
                    if (0 <= var1_int) {
                      this.field_i.field_m = this.field_i.field_m + var1_int;
                      continue L0;
                    } else {
                      break L1;
                    }
                  }
                }
                if (this.field_i.field_g.length == this.field_i.field_m) {
                  throw ad.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_i.field_g.length + " " + this.field_j));
                } else {
                  var1 = this;
                  synchronized (var1) {
                    L2: {
                      this.finalize();
                      this.field_k = 3;
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

    protected final void finalize() {
        if (null != this.field_e) {
            if (null != this.field_e.field_b) {
                try {
                    ((DataInputStream) (this.field_e.field_b)).close();
                } catch (Exception exception) {
                }
            }
            this.field_e = null;
        }
        if (this.field_a != null) {
            if (!(this.field_a.field_b == null)) {
                try {
                    ((java.net.Socket) (this.field_a.field_b)).close();
                } catch (Exception exception) {
                }
            }
            this.field_a = null;
        }
        if (null != this.field_b) {
            try {
                this.field_b.close();
            } catch (Exception exception) {
            }
            this.field_b = null;
        }
        this.field_g = null;
    }

    final synchronized boolean a(int param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        Throwable decompiledCaughtException = null;
        if (-3 >= (this.field_k ^ -1)) {
          return true;
        } else {
          L0: {
            if (0 == this.field_k) {
              L1: {
                if (null != this.field_e) {
                  break L1;
                } else {
                  this.field_e = this.field_f.a((byte) -12, this.field_j);
                  break L1;
                }
              }
              if (this.field_e.field_f == 0) {
                return false;
              } else {
                if ((this.field_e.field_f ^ -1) != -2) {
                  this.field_e = null;
                  this.field_k = this.field_k + 1;
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
            if (1 != this.field_k) {
              break L2;
            } else {
              L3: {
                if (this.field_a == null) {
                  this.field_a = this.field_f.a(443, 4, this.field_j.getHost());
                  break L3;
                } else {
                  break L3;
                }
              }
              if (-1 != (this.field_a.field_f ^ -1)) {
                if (1 != this.field_a.field_f) {
                  this.field_a = null;
                  this.field_k = this.field_k + 1;
                  return false;
                } else {
                  break L2;
                }
              } else {
                return false;
              }
            }
          }
          if (null == this.field_b) {
            try {
              L4: {
                L5: {
                  if (this.field_k != 0) {
                    break L5;
                  } else {
                    this.field_b = (DataInputStream) (this.field_e.field_b);
                    break L5;
                  }
                }
                L6: {
                  if (1 == this.field_k) {
                    var4 = (java.net.Socket) (this.field_a.field_b);
                    var4.setSoTimeout(10000);
                    var3 = var4.getOutputStream();
                    var3.write(17);
                    var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_j.getFile() + "\n\n"));
                    var3.write(dk.a((byte) -14, var5));
                    this.field_b = new DataInputStream(var4.getInputStream());
                    break L6;
                  } else {
                    break L6;
                  }
                }
                this.field_i.field_m = 0;
                break L4;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = (IOException) (Object) decompiledCaughtException;
              this.finalize();
              this.field_k = this.field_k + 1;
              if (this.field_g != null) {
                if (-1 != (this.field_g.field_f ^ -1)) {
                  if (1 == this.field_g.field_f) {
                    if (param0 != 17) {
                      ad.a(49, -88);
                      return false;
                    } else {
                      return false;
                    }
                  } else {
                    this.finalize();
                    this.field_k = this.field_k + 1;
                    if (param0 != 17) {
                      ad.a(49, -88);
                      return false;
                    } else {
                      return false;
                    }
                  }
                } else {
                  return false;
                }
              } else {
                this.field_g = this.field_f.a(true, 5, (Runnable) (this));
                if (-1 != (this.field_g.field_f ^ -1)) {
                  if (1 != this.field_g.field_f) {
                    this.finalize();
                    this.field_k = this.field_k + 1;
                    if (param0 == 17) {
                      return false;
                    } else {
                      ad.a(49, -88);
                      return false;
                    }
                  } else {
                    if (param0 != 17) {
                      ad.a(49, -88);
                      return false;
                    } else {
                      return false;
                    }
                  }
                } else {
                  return false;
                }
              }
            }
            L7: {
              if (this.field_g != null) {
                break L7;
              } else {
                this.field_g = this.field_f.a(true, 5, (Runnable) (this));
                break L7;
              }
            }
            if (-1 == (this.field_g.field_f ^ -1)) {
              return false;
            } else {
              L8: {
                if (1 == this.field_g.field_f) {
                  break L8;
                } else {
                  this.finalize();
                  this.field_k = this.field_k + 1;
                  break L8;
                }
              }
              L9: {
                if (param0 == 17) {
                  break L9;
                } else {
                  ad.a(49, -88);
                  break L9;
                }
              }
              return false;
            }
          } else {
            L10: {
              if (this.field_g != null) {
                break L10;
              } else {
                this.field_g = this.field_f.a(true, 5, (Runnable) (this));
                break L10;
              }
            }
            if (-1 == (this.field_g.field_f ^ -1)) {
              return false;
            } else {
              L11: {
                if (1 == this.field_g.field_f) {
                  break L11;
                } else {
                  this.finalize();
                  this.field_k = this.field_k + 1;
                  break L11;
                }
              }
              L12: {
                if (param0 == 17) {
                  break L12;
                } else {
                  ad.a(49, -88);
                  break L12;
                }
              }
              return false;
            }
          }
        }
    }

    ad(lk param0, java.net.URL param1, int param2) {
        try {
            this.field_f = param0;
            this.field_j = param1;
            this.field_i = new n(param2);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ad.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_h = "Updates will sent to the email address you've given";
        field_c = "Total score: ";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
