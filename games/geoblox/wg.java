/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wg implements Runnable {
    private java.net.URL field_h;
    static int field_e;
    private d field_b;
    private int field_l;
    static int field_j;
    private qc field_n;
    static ji field_i;
    static int field_m;
    static ck field_d;
    private DataInputStream field_c;
    private cb field_k;
    private cb field_f;
    private cb field_g;
    static int field_a;

    final qc b(byte param0) {
        int var2 = 62 / ((param0 - 9) / 53);
        if (!((this.field_l ^ -1) != -4)) {
            return this.field_n;
        }
        return null;
    }

    protected final void finalize() {
        if (null != this.field_f) {
            if (!(this.field_f.field_b == null)) {
                try {
                    ((DataInputStream) (this.field_f.field_b)).close();
                } catch (Exception exception) {
                }
            }
            this.field_f = null;
        }
        if (this.field_k != null) {
            if (null != this.field_k.field_b) {
                try {
                    ((java.net.Socket) (this.field_k.field_b)).close();
                } catch (Exception exception) {
                }
            }
            this.field_k = null;
        }
        if (!(null == this.field_c)) {
            try {
                this.field_c.close();
            } catch (Exception exception) {
            }
            this.field_c = null;
        }
        this.field_g = null;
    }

    public static void c(byte param0) {
        int var1 = 26 / ((param0 - 45) / 32);
        field_i = null;
        field_d = null;
    }

    final synchronized boolean a(byte param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        if (2 <= this.field_l) {
          return true;
        } else {
          L0: {
            if (this.field_l != 0) {
              break L0;
            } else {
              L1: {
                if (null != this.field_f) {
                  break L1;
                } else {
                  this.field_f = this.field_b.a(-14, this.field_h);
                  break L1;
                }
              }
              if (0 == this.field_f.field_a) {
                return false;
              } else {
                if (1 != this.field_f.field_a) {
                  this.field_l = this.field_l + 1;
                  this.field_f = null;
                  return false;
                } else {
                  break L0;
                }
              }
            }
          }
          L2: {
            if (-2 != (this.field_l ^ -1)) {
              break L2;
            } else {
              L3: {
                if (this.field_k == null) {
                  this.field_k = this.field_b.a(443, this.field_h.getHost(), false);
                  break L3;
                } else {
                  break L3;
                }
              }
              if (this.field_k.field_a != 0) {
                if (1 == this.field_k.field_a) {
                  break L2;
                } else {
                  this.field_k = null;
                  this.field_l = this.field_l + 1;
                  return false;
                }
              } else {
                return false;
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
                    if (-1 == (this.field_l ^ -1)) {
                      this.field_c = (DataInputStream) (this.field_f.field_b);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if ((this.field_l ^ -1) != -2) {
                      break L7;
                    } else {
                      var4 = (java.net.Socket) (this.field_k.field_b);
                      var4.setSoTimeout(10000);
                      var3 = var4.getOutputStream();
                      var3.write(17);
                      var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_h.getFile() + "\n\n"));
                      var3.write(jf.a(var5, (byte) 127));
                      this.field_c = new DataInputStream(var4.getInputStream());
                      break L7;
                    }
                  }
                  this.field_n.field_f = 0;
                  decompiledRegionSelector0 = 0;
                  break L5;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L8: {
                  var2 = (IOException) (Object) decompiledCaughtException;
                  this.finalize();
                  this.field_l = this.field_l + 1;
                  decompiledRegionSelector0 = 1;
                  break L8;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                L9: {
                  if (null != this.field_g) {
                    break L9;
                  } else {
                    this.field_g = this.field_b.a((Runnable) (this), 0, 5);
                    break L9;
                  }
                }
                if (0 == this.field_g.field_a) {
                  return false;
                } else {
                  if (param0 == 45) {
                    if (this.field_g.field_a == 1) {
                      return false;
                    } else {
                      this.finalize();
                      this.field_l = this.field_l + 1;
                      return false;
                    }
                  } else {
                    return false;
                  }
                }
              } else {
                break L4;
              }
            }
          }
          if (null != this.field_g) {
            if (0 == this.field_g.field_a) {
              return false;
            } else {
              if (param0 != 45) {
                return false;
              } else {
                L10: {
                  if (this.field_g.field_a != 1) {
                    this.finalize();
                    this.field_l = this.field_l + 1;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                return false;
              }
            }
          } else {
            this.field_g = this.field_b.a((Runnable) (this), 0, 5);
            if (0 == this.field_g.field_a) {
              return false;
            } else {
              if (param0 != 45) {
                return false;
              } else {
                L11: {
                  if (this.field_g.field_a != 1) {
                    this.finalize();
                    this.field_l = this.field_l + 1;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                return false;
              }
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
            var4 = Geoblox.field_C;
            try {
              L0: while (true) {
                L1: {
                  if (this.field_n.field_f >= this.field_n.field_j.length) {
                    break L1;
                  } else {
                    var1_int = this.field_c.read(this.field_n.field_j, this.field_n.field_f, -this.field_n.field_f + this.field_n.field_j.length);
                    if (0 <= var1_int) {
                      this.field_n.field_f = this.field_n.field_f + var1_int;
                      continue L0;
                    } else {
                      break L1;
                    }
                  }
                }
                if (this.field_n.field_j.length == this.field_n.field_f) {
                  throw wg.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_n.field_j.length + " " + this.field_h));
                } else {
                  var1 = this;
                  synchronized (var1) {
                    L2: {
                      this.finalize();
                      this.field_l = 3;
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
                  this.field_l = this.field_l + 1;
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

    final static void a(int param0, int param1) {
        oc.field_c = param1;
        uh.field_y.b((int)((float)(64 * param1 / 80) * 1.399999976158142f), (byte) 22);
        if (param0 != -15346) {
            wg.a(-15, 68);
        }
    }

    wg(d param0, java.net.URL param1, int param2) {
        try {
            this.field_b = param0;
            this.field_h = param1;
            this.field_n = new qc(param2);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "wg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_m = 5;
        field_j = 0;
        field_e = 50;
        field_d = new ck(4, 1, 1, 1);
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
