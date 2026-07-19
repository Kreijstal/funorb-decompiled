/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qk implements Runnable {
    private java.net.URL field_i;
    private nl field_d;
    static int field_e;
    private nl field_f;
    static mk field_b;
    private nl field_l;
    private p field_j;
    private DataInputStream field_c;
    private int field_a;
    static int field_h;
    private jk field_g;
    static km field_k;

    public static void a(boolean param0) {
        field_b = null;
        if (!param0) {
            qk.a(true);
            field_k = null;
            return;
        }
        field_k = null;
    }

    protected final void finalize() {
        if (null != this.field_f) {
            if (this.field_f.field_b != null) {
                try {
                    ((DataInputStream) (this.field_f.field_b)).close();
                } catch (Exception exception) {
                }
            }
            this.field_f = null;
        }
        if (null != this.field_l) {
            if (null != this.field_l.field_b) {
                try {
                    ((java.net.Socket) (this.field_l.field_b)).close();
                } catch (Exception exception) {
                }
            }
            this.field_l = null;
        }
        if (null != this.field_c) {
            try {
                this.field_c.close();
            } catch (Exception exception) {
            }
            this.field_c = null;
        }
        this.field_d = null;
    }

    final synchronized boolean a(int param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        if (-3 < (this.field_a ^ -1)) {
          L0: {
            if (this.field_a == 0) {
              L1: {
                if (this.field_f != null) {
                  break L1;
                } else {
                  this.field_f = this.field_g.a((byte) -49, this.field_i);
                  break L1;
                }
              }
              if (this.field_f.field_f != 0) {
                if (1 != this.field_f.field_f) {
                  this.field_a = this.field_a + 1;
                  this.field_f = null;
                  return false;
                } else {
                  break L0;
                }
              } else {
                return false;
              }
            } else {
              break L0;
            }
          }
          L2: {
            if (1 != this.field_a) {
              break L2;
            } else {
              L3: {
                if (this.field_l != null) {
                  break L3;
                } else {
                  this.field_l = this.field_g.a(this.field_i.getHost(), false, 443);
                  break L3;
                }
              }
              if (this.field_l.field_f == 0) {
                return false;
              } else {
                if (this.field_l.field_f != 1) {
                  this.field_a = this.field_a + 1;
                  this.field_l = null;
                  return false;
                } else {
                  break L2;
                }
              }
            }
          }
          L4: {
            if (null != this.field_c) {
              break L4;
            } else {
              try {
                L5: {
                  L6: {
                    if (this.field_a == 0) {
                      this.field_c = (DataInputStream) (this.field_f.field_b);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (1 == this.field_a) {
                      var4 = (java.net.Socket) (this.field_l.field_b);
                      var4.setSoTimeout(10000);
                      var3 = var4.getOutputStream();
                      var3.write(17);
                      var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_i.getFile() + "\n\n"));
                      var3.write(dj.a(var5, param0 ^ 17));
                      this.field_c = new DataInputStream(var4.getInputStream());
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  this.field_j.field_l = 0;
                  decompiledRegionSelector0 = 0;
                  break L5;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L8: {
                  var2 = (IOException) (Object) decompiledCaughtException;
                  this.finalize();
                  this.field_a = this.field_a + 1;
                  decompiledRegionSelector0 = 1;
                  break L8;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                L9: {
                  if (null == this.field_d) {
                    this.field_d = this.field_g.a(5, true, (Runnable) (this));
                    break L9;
                  } else {
                    break L9;
                  }
                }
                if (0 == this.field_d.field_f) {
                  return false;
                } else {
                  L10: {
                    if (param0 == 17) {
                      break L10;
                    } else {
                      field_k = (km) null;
                      break L10;
                    }
                  }
                  if (-2 == (this.field_d.field_f ^ -1)) {
                    return false;
                  } else {
                    this.finalize();
                    this.field_a = this.field_a + 1;
                    return false;
                  }
                }
              } else {
                break L4;
              }
            }
          }
          L11: {
            if (null == this.field_d) {
              this.field_d = this.field_g.a(5, true, (Runnable) (this));
              break L11;
            } else {
              break L11;
            }
          }
          if (0 == this.field_d.field_f) {
            return false;
          } else {
            if (param0 != 17) {
              L12: {
                field_k = (km) null;
                if (-2 != (this.field_d.field_f ^ -1)) {
                  this.finalize();
                  this.field_a = this.field_a + 1;
                  break L12;
                } else {
                  break L12;
                }
              }
              return false;
            } else {
              L13: {
                if (-2 != (this.field_d.field_f ^ -1)) {
                  this.finalize();
                  this.field_a = this.field_a + 1;
                  break L13;
                } else {
                  break L13;
                }
              }
              return false;
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
            Object var2 = null;
            Throwable var3 = null;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            var4 = Chess.field_G;
            try {
              L0: while (true) {
                L1: {
                  if (this.field_j.field_l >= this.field_j.field_o.length) {
                    break L1;
                  } else {
                    var1_int = this.field_c.read(this.field_j.field_o, this.field_j.field_l, this.field_j.field_o.length + -this.field_j.field_l);
                    if ((var1_int ^ -1) <= -1) {
                      this.field_j.field_l = this.field_j.field_l + var1_int;
                      continue L0;
                    } else {
                      break L1;
                    }
                  }
                }
                if (this.field_j.field_o.length != this.field_j.field_l) {
                  var1 = this;
                  synchronized (var1) {
                    L2: {
                      this.finalize();
                      this.field_a = 3;
                      break L2;
                    }
                  }
                  return;
                } else {
                  throw qk.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_j.field_o.length + " " + this.field_i));
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (Exception) (Object) decompiledCaughtException;
              var2 = this;
              synchronized (var2) {
                L3: {
                  this.finalize();
                  this.field_a = this.field_a + 1;
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

    qk(jk param0, java.net.URL param1, int param2) {
        try {
            this.field_g = param0;
            this.field_i = param1;
            this.field_j = new p(param2);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "qk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final p b(int param0) {
        int var2 = -89 % ((-84 - param0) / 36);
        if (!(-4 != (this.field_a ^ -1))) {
            return this.field_j;
        }
        return null;
    }

    static {
        field_b = new mk();
        field_k = new km(0, 0);
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
