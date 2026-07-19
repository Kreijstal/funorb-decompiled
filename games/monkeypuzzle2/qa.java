/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qa implements Runnable {
    private gk field_e;
    private java.net.URL field_f;
    static le field_i;
    private DataInputStream field_l;
    private int field_k;
    private ic field_g;
    static pj field_d;
    static String field_b;
    private md field_h;
    private ic field_j;
    static int field_a;
    private ic field_c;

    final static void a(byte param0, gg param1, int param2, int param3) {
        hh.field_u = param1;
        wg.field_h = param2;
        if (param0 != -39) {
            return;
        }
        try {
            rb.field_cb = param3;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "qa.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void a(byte param0) {
        gg var2 = null;
        field_d = null;
        if (param0 <= 20) {
          var2 = (gg) null;
          qa.a((byte) -50, (gg) null, 114, 54);
          field_i = null;
          field_b = null;
          return;
        } else {
          field_i = null;
          field_b = null;
          return;
        }
    }

    final gk a(int param0) {
        if (param0 >= 13) {
          if (-4 != (this.field_k ^ -1)) {
            return null;
          } else {
            return this.field_e;
          }
        } else {
          field_d = (pj) null;
          if (-4 != (this.field_k ^ -1)) {
            return null;
          } else {
            return this.field_e;
          }
        }
    }

    final synchronized boolean c(int param0) {
        int var2 = 0;
        IOException var3 = null;
        OutputStream var4 = null;
        java.net.Socket var5 = null;
        CharSequence var6 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        if (this.field_k < 2) {
          L0: {
            if (-1 == (this.field_k ^ -1)) {
              L1: {
                if (this.field_j != null) {
                  break L1;
                } else {
                  this.field_j = this.field_h.a((byte) 112, this.field_f);
                  break L1;
                }
              }
              if (-1 == (this.field_j.field_g ^ -1)) {
                return false;
              } else {
                if ((this.field_j.field_g ^ -1) != -2) {
                  this.field_k = this.field_k + 1;
                  this.field_j = null;
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
                if (this.field_g != null) {
                  break L3;
                } else {
                  this.field_g = this.field_h.a(this.field_f.getHost(), 0, 443);
                  break L3;
                }
              }
              if (-1 != (this.field_g.field_g ^ -1)) {
                if (1 != this.field_g.field_g) {
                  this.field_k = this.field_k + 1;
                  this.field_g = null;
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
            var2 = -62 / ((-17 - param0) / 60);
            if (null != this.field_l) {
              break L4;
            } else {
              try {
                L5: {
                  L6: {
                    if (0 != this.field_k) {
                      break L6;
                    } else {
                      this.field_l = (DataInputStream) (this.field_j.field_b);
                      break L6;
                    }
                  }
                  L7: {
                    if (1 == this.field_k) {
                      var5 = (java.net.Socket) (this.field_g.field_b);
                      var5.setSoTimeout(10000);
                      var4 = var5.getOutputStream();
                      var4.write(17);
                      var6 = (CharSequence) ((Object) ("JAGGRAB " + this.field_f.getFile() + "\n\n"));
                      var4.write(pj.a(3231, var6));
                      this.field_l = new DataInputStream(var5.getInputStream());
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  this.field_e.field_h = 0;
                  decompiledRegionSelector0 = 0;
                  break L5;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L8: {
                  var3 = (IOException) (Object) decompiledCaughtException;
                  this.finalize();
                  this.field_k = this.field_k + 1;
                  decompiledRegionSelector0 = 1;
                  break L8;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                L9: {
                  if (this.field_c != null) {
                    break L9;
                  } else {
                    this.field_c = this.field_h.a((Runnable) (this), 5, 0);
                    break L9;
                  }
                }
                if (this.field_c.field_g != 0) {
                  if (-2 != (this.field_c.field_g ^ -1)) {
                    this.finalize();
                    this.field_k = this.field_k + 1;
                    return false;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                break L4;
              }
            }
          }
          if (this.field_c != null) {
            if (this.field_c.field_g != 0) {
              if (-2 != (this.field_c.field_g ^ -1)) {
                this.finalize();
                this.field_k = this.field_k + 1;
                return false;
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            this.field_c = this.field_h.a((Runnable) (this), 5, 0);
            if (this.field_c.field_g != 0) {
              if (-2 == (this.field_c.field_g ^ -1)) {
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
        } else {
          return true;
        }
    }

    protected final void finalize() {
        if (!(null == this.field_j)) {
            if (null != this.field_j.field_b) {
                try {
                    ((DataInputStream) (this.field_j.field_b)).close();
                } catch (Exception exception) {
                }
            }
            this.field_j = null;
        }
        if (!(this.field_g == null)) {
            if (!(null == this.field_g.field_b)) {
                try {
                    ((java.net.Socket) (this.field_g.field_b)).close();
                } catch (Exception exception) {
                }
            }
            this.field_g = null;
        }
        if (null != this.field_l) {
            try {
                this.field_l.close();
            } catch (Exception exception) {
            }
            this.field_l = null;
        }
        this.field_c = null;
    }

    final static int b(int param0) {
        if (param0 < 120) {
            field_a = -111;
            return je.field_c;
        }
        return je.field_c;
    }

    public final void run() {
        try {
            int var1_int = 0;
            Exception var1 = null;
            Object var1_ref = null;
            Throwable var2 = null;
            Object var2_ref = null;
            Throwable var3 = null;
            int var4 = 0;
            int var5 = 0;
            int var6 = 0;
            Throwable decompiledCaughtException = null;
            var4 = MonkeyPuzzle2.field_F ? 1 : 0;
            try {
              L0: while (true) {
                L1: {
                  L2: {
                    L3: {
                      if (this.field_e.field_h >= this.field_e.field_g.length) {
                        break L3;
                      } else {
                        var1_int = this.field_l.read(this.field_e.field_g, this.field_e.field_h, -this.field_e.field_h + this.field_e.field_g.length);
                        var6 = var1_int ^ -1;
                        var5 = -1;
                        if (var4 != 0) {
                          if (var5 != var6) {
                            break L1;
                          } else {
                            break L2;
                          }
                        } else {
                          L4: {
                            if (var5 >= var6) {
                              break L4;
                            } else {
                              if (var4 == 0) {
                                break L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          this.field_e.field_h = this.field_e.field_h + var1_int;
                          if (var4 == 0) {
                            continue L0;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    if (this.field_e.field_h != this.field_e.field_g.length) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                  throw qa.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_e.field_g.length + " " + this.field_f));
                }
                var1_ref = this;
                synchronized (var1_ref) {
                  L5: {
                    this.finalize();
                    this.field_k = 3;
                    break L5;
                  }
                }
                return;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (Exception) (Object) decompiledCaughtException;
              var2_ref = this;
              synchronized (var2_ref) {
                L6: {
                  this.finalize();
                  this.field_k = this.field_k + 1;
                  break L6;
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

    qa(md param0, java.net.URL param1, int param2) {
        try {
            this.field_h = param0;
            this.field_f = param1;
            this.field_e = new gk(param2);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "qa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_b = "Change display name";
        field_d = new pj();
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
