/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class lf implements Runnable {
    private java.net.URL field_h;
    static hb field_b;
    private ia field_d;
    private ia field_j;
    static String[][] field_i;
    private vf field_f;
    private ia field_e;
    private int field_c;
    private DataInputStream field_a;
    private sb field_g;

    public final void run() {
        try {
            int var1_int = 0;
            Object var1 = null;
            Object var2 = null;
            Throwable var3 = null;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            var4 = MinerDisturbance.field_ab;
            try {
              L0: while (true) {
                L1: {
                  if (this.field_g.field_o >= this.field_g.field_u.length) {
                    break L1;
                  } else {
                    var1_int = this.field_a.read(this.field_g.field_u, this.field_g.field_o, this.field_g.field_u.length + -this.field_g.field_o);
                    if ((var1_int ^ -1) > -1) {
                      break L1;
                    } else {
                      this.field_g.field_o = this.field_g.field_o + var1_int;
                      continue L0;
                    }
                  }
                }
                if (this.field_g.field_u.length != this.field_g.field_o) {
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
                  throw lf.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_g.field_u.length + " " + this.field_h));
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

    protected final void finalize() {
        if (!(this.field_d == null)) {
            if (null != this.field_d.field_a) {
                try {
                    ((DataInputStream) (this.field_d.field_a)).close();
                } catch (Exception exception) {
                }
            }
            this.field_d = null;
        }
        if (this.field_e != null) {
            if (null != this.field_e.field_a) {
                try {
                    ((java.net.Socket) (this.field_e.field_a)).close();
                } catch (Exception exception) {
                }
            }
            this.field_e = null;
        }
        if (!(this.field_a == null)) {
            try {
                this.field_a.close();
            } catch (Exception exception) {
            }
            this.field_a = null;
        }
        this.field_j = null;
    }

    final synchronized boolean a(byte param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        L0: {
          if (param0 >= 47) {
            break L0;
          } else {
            field_i = (String[][]) null;
            break L0;
          }
        }
        if (this.field_c >= 2) {
          return true;
        } else {
          L1: {
            if (this.field_c == 0) {
              L2: {
                if (null == this.field_d) {
                  this.field_d = this.field_f.a((byte) -83, this.field_h);
                  break L2;
                } else {
                  break L2;
                }
              }
              if (-1 == (this.field_d.field_c ^ -1)) {
                return false;
              } else {
                if (-2 != (this.field_d.field_c ^ -1)) {
                  this.field_d = null;
                  this.field_c = this.field_c + 1;
                  return false;
                } else {
                  break L1;
                }
              }
            } else {
              break L1;
            }
          }
          L3: {
            if (1 == this.field_c) {
              L4: {
                if (null != this.field_e) {
                  break L4;
                } else {
                  this.field_e = this.field_f.a(this.field_h.getHost(), 443, (byte) 15);
                  break L4;
                }
              }
              if (0 != this.field_e.field_c) {
                if (this.field_e.field_c == 1) {
                  break L3;
                } else {
                  this.field_c = this.field_c + 1;
                  this.field_e = null;
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
            if (null != this.field_a) {
              break L5;
            } else {
              try {
                L6: {
                  L7: {
                    if (this.field_c != 0) {
                      break L7;
                    } else {
                      this.field_a = (DataInputStream) (this.field_d.field_a);
                      break L7;
                    }
                  }
                  L8: {
                    if (this.field_c != 1) {
                      break L8;
                    } else {
                      var4 = (java.net.Socket) (this.field_e.field_a);
                      var4.setSoTimeout(10000);
                      var3 = var4.getOutputStream();
                      var3.write(17);
                      var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_h.getFile() + "\n\n"));
                      var3.write(ic.a(false, var5));
                      this.field_a = new DataInputStream(var4.getInputStream());
                      break L8;
                    }
                  }
                  this.field_g.field_o = 0;
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
                  if (this.field_j == null) {
                    this.field_j = this.field_f.a((Runnable) (this), (byte) 1, 5);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                if (this.field_j.field_c == 0) {
                  return false;
                } else {
                  if (1 != this.field_j.field_c) {
                    this.finalize();
                    this.field_c = this.field_c + 1;
                    return false;
                  } else {
                    return false;
                  }
                }
              } else {
                break L5;
              }
            }
          }
          L11: {
            if (this.field_j == null) {
              this.field_j = this.field_f.a((Runnable) (this), (byte) 1, 5);
              break L11;
            } else {
              break L11;
            }
          }
          if (this.field_j.field_c == 0) {
            return false;
          } else {
            if (1 != this.field_j.field_c) {
              this.finalize();
              this.field_c = this.field_c + 1;
              return false;
            } else {
              return false;
            }
          }
        }
    }

    final sb a(int param0) {
        sb discarded$9 = null;
        if (param0 != 0) {
            discarded$9 = this.a(23);
            if (!(-4 != (this.field_c ^ -1))) {
                return this.field_g;
            }
            return null;
        }
        if (!(-4 != (this.field_c ^ -1))) {
            return this.field_g;
        }
        return null;
    }

    public static void a(boolean param0) {
        field_i = (String[][]) null;
        field_b = null;
        if (param0) {
            lf.a(false);
        }
    }

    final static void a(int param0, we param1) {
        try {
            if (param0 != -673) {
                field_b = (hb) null;
            }
            wi.field_A = param1;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "lf.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    lf(vf param0, java.net.URL param1, int param2) {
        try {
            this.field_h = param1;
            this.field_f = param0;
            this.field_g = new sb(param2);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "lf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_i = new String[][]{new String[]{"See the ore stuck in the boulder? The quickest way to obtain it would be to plant an explosive next to the boulder. Press <img=19> to drop explosives or <img=21> to fire the rock blaster."}};
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
