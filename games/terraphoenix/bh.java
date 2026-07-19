/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bh implements Runnable {
    private int field_c;
    private dh field_i;
    private DataInputStream field_m;
    private java.net.URL field_l;
    static boolean field_f;
    private mf field_n;
    private mf field_g;
    static String field_j;
    static boolean[] field_e;
    private mf field_k;
    private he field_o;
    static int field_a;
    static String field_h;
    static String field_b;
    static String field_d;

    final dh a(int param0) {
        int var2 = 31 % ((param0 - 15) / 56);
        if (!((this.field_c ^ -1) != -4)) {
            return this.field_i;
        }
        return null;
    }

    final static void b(int param0) {
        fh.field_g = false;
        if (param0 >= -22) {
            return;
        }
        int discarded$0 = mk.field_j.a(-16384);
    }

    protected final void finalize() {
        if (null != this.field_n) {
            if (null != this.field_n.field_e) {
                try {
                    ((DataInputStream) (this.field_n.field_e)).close();
                } catch (Exception exception) {
                }
            }
            this.field_n = null;
        }
        if (null != this.field_g) {
            if (!(null == this.field_g.field_e)) {
                try {
                    ((java.net.Socket) (this.field_g.field_e)).close();
                } catch (Exception exception) {
                }
            }
            this.field_g = null;
        }
        if (!(null == this.field_m)) {
            try {
                this.field_m.close();
            } catch (Exception exception) {
            }
            this.field_m = null;
        }
        this.field_k = null;
    }

    bh(he param0, java.net.URL param1, int param2) {
        try {
            this.field_o = param0;
            this.field_l = param1;
            this.field_i = new dh(param2);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "bh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final synchronized boolean a(byte param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        L0: {
          if (param0 > 22) {
            break L0;
          } else {
            field_j = (String) null;
            break L0;
          }
        }
        if (this.field_c < 2) {
          L1: {
            if (-1 == (this.field_c ^ -1)) {
              L2: {
                if (null != this.field_n) {
                  break L2;
                } else {
                  this.field_n = this.field_o.a(this.field_l, 111);
                  break L2;
                }
              }
              if (this.field_n.field_d == 0) {
                return false;
              } else {
                if ((this.field_n.field_d ^ -1) == -2) {
                  break L1;
                } else {
                  this.field_c = this.field_c + 1;
                  this.field_n = null;
                  return false;
                }
              }
            } else {
              break L1;
            }
          }
          L3: {
            if (-2 != (this.field_c ^ -1)) {
              break L3;
            } else {
              L4: {
                if (null != this.field_g) {
                  break L4;
                } else {
                  this.field_g = this.field_o.a(443, this.field_l.getHost(), (byte) 60);
                  break L4;
                }
              }
              if (0 == this.field_g.field_d) {
                return false;
              } else {
                if ((this.field_g.field_d ^ -1) == -2) {
                  break L3;
                } else {
                  this.field_g = null;
                  this.field_c = this.field_c + 1;
                  return false;
                }
              }
            }
          }
          L5: {
            if (null != this.field_m) {
              break L5;
            } else {
              try {
                L6: {
                  L7: {
                    if (this.field_c != 0) {
                      break L7;
                    } else {
                      this.field_m = (DataInputStream) (this.field_n.field_e);
                      break L7;
                    }
                  }
                  L8: {
                    if (this.field_c != 1) {
                      break L8;
                    } else {
                      var4 = (java.net.Socket) (this.field_g.field_e);
                      var4.setSoTimeout(10000);
                      var3 = var4.getOutputStream();
                      var3.write(17);
                      var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_l.getFile() + "\n\n"));
                      var3.write(ma.a(-32396, var5));
                      this.field_m = new DataInputStream(var4.getInputStream());
                      break L8;
                    }
                  }
                  this.field_i.field_k = 0;
                  decompiledRegionSelector0 = 0;
                  break L6;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L9: {
                  var2 = (IOException) (Object) decompiledCaughtException;
                  this.finalize();
                  this.field_c = this.field_c + 1;
                  decompiledRegionSelector0 = 1;
                  break L9;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                L10: {
                  if (this.field_k == null) {
                    this.field_k = this.field_o.a((Runnable) (this), (byte) -21, 5);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                if (-1 != (this.field_k.field_d ^ -1)) {
                  if ((this.field_k.field_d ^ -1) == -2) {
                    return false;
                  } else {
                    this.finalize();
                    this.field_c = this.field_c + 1;
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                break L5;
              }
            }
          }
          L11: {
            if (this.field_k == null) {
              this.field_k = this.field_o.a((Runnable) (this), (byte) -21, 5);
              break L11;
            } else {
              break L11;
            }
          }
          if (-1 == (this.field_k.field_d ^ -1)) {
            return false;
          } else {
            L12: {
              if ((this.field_k.field_d ^ -1) != -2) {
                this.finalize();
                this.field_c = this.field_c + 1;
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

    public final void run() {
        try {
            int var1_int = 0;
            Object var1 = null;
            Object var2 = null;
            Throwable var3 = null;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            var4 = Terraphoenix.field_V;
            try {
              L0: while (true) {
                L1: {
                  if (this.field_i.field_i.length <= this.field_i.field_k) {
                    break L1;
                  } else {
                    var1_int = this.field_m.read(this.field_i.field_i, this.field_i.field_k, this.field_i.field_i.length + -this.field_i.field_k);
                    if (var1_int >= 0) {
                      this.field_i.field_k = this.field_i.field_k + var1_int;
                      continue L0;
                    } else {
                      break L1;
                    }
                  }
                }
                if (this.field_i.field_i.length != this.field_i.field_k) {
                  var1 = this;
                  synchronized (var1) {
                    L2: {
                      this.finalize();
                      this.field_c = 3;
                      break L2;
                    }
                  }
                  return;
                } else {
                  throw bh.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_i.field_i.length + " " + this.field_l));
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

    public static void b(byte param0) {
        if (param0 < 29) {
          bh.b(115);
          field_d = null;
          field_e = null;
          field_b = null;
          field_j = null;
          field_h = null;
          return;
        } else {
          field_d = null;
          field_e = null;
          field_b = null;
          field_j = null;
          field_h = null;
          return;
        }
    }

    static {
        field_a = 3;
        field_e = new boolean[112];
        field_j = "Out of stock";
        field_b = "ACT II: ";
        field_f = false;
        field_h = "Confirm Email:";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
