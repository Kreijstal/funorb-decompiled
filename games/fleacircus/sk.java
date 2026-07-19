/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sk implements Runnable {
    private DataInputStream field_b;
    private int field_g;
    private java.net.URL field_c;
    private od field_e;
    private ni field_d;
    private ce field_f;
    private od field_h;
    private od field_a;

    final ni a(int param0) {
        if (param0 < 83) {
            return (ni) null;
        }
        if ((this.field_g ^ -1) != -4) {
            return null;
        }
        return this.field_d;
    }

    final synchronized boolean c(byte param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        if (-3 < (this.field_g ^ -1)) {
          L0: {
            if (-1 == (this.field_g ^ -1)) {
              L1: {
                if (this.field_h != null) {
                  break L1;
                } else {
                  this.field_h = this.field_f.a(this.field_c, -34);
                  break L1;
                }
              }
              if (-1 != (this.field_h.field_b ^ -1)) {
                if (1 == this.field_h.field_b) {
                  break L0;
                } else {
                  this.field_h = null;
                  this.field_g = this.field_g + 1;
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
            if (param0 > 41) {
              break L2;
            } else {
              this.field_c = (java.net.URL) null;
              break L2;
            }
          }
          L3: {
            if (1 == this.field_g) {
              L4: {
                if (null == this.field_e) {
                  this.field_e = this.field_f.a(443, (byte) 32, this.field_c.getHost());
                  break L4;
                } else {
                  break L4;
                }
              }
              if (0 != this.field_e.field_b) {
                if (-2 != (this.field_e.field_b ^ -1)) {
                  this.field_e = null;
                  this.field_g = this.field_g + 1;
                  return false;
                } else {
                  break L3;
                }
              } else {
                return false;
              }
            } else {
              break L3;
            }
          }
          L5: {
            if (this.field_b != null) {
              break L5;
            } else {
              try {
                L6: {
                  L7: {
                    if (-1 == (this.field_g ^ -1)) {
                      this.field_b = (DataInputStream) (this.field_h.field_e);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (1 == this.field_g) {
                      var4 = (java.net.Socket) (this.field_e.field_e);
                      var4.setSoTimeout(10000);
                      var3 = var4.getOutputStream();
                      var3.write(17);
                      var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_c.getFile() + "\n\n"));
                      var3.write(ea.a(-18428, var5));
                      this.field_b = new DataInputStream(var4.getInputStream());
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  this.field_d.field_i = 0;
                  decompiledRegionSelector0 = 0;
                  break L6;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L9: {
                  var2 = (IOException) (Object) decompiledCaughtException;
                  this.finalize();
                  this.field_g = this.field_g + 1;
                  decompiledRegionSelector0 = 1;
                  break L9;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                L10: {
                  if (this.field_a != null) {
                    break L10;
                  } else {
                    this.field_a = this.field_f.a(4532, (Runnable) (this), 5);
                    break L10;
                  }
                }
                if (this.field_a.field_b != 0) {
                  if ((this.field_a.field_b ^ -1) == -2) {
                    return false;
                  } else {
                    this.finalize();
                    this.field_g = this.field_g + 1;
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
          if (this.field_a != null) {
            if (this.field_a.field_b == 0) {
              return false;
            } else {
              L11: {
                if ((this.field_a.field_b ^ -1) != -2) {
                  this.finalize();
                  this.field_g = this.field_g + 1;
                  break L11;
                } else {
                  break L11;
                }
              }
              return false;
            }
          } else {
            this.field_a = this.field_f.a(4532, (Runnable) (this), 5);
            if (this.field_a.field_b == 0) {
              return false;
            } else {
              L12: {
                if ((this.field_a.field_b ^ -1) != -2) {
                  this.finalize();
                  this.field_g = this.field_g + 1;
                  break L12;
                } else {
                  break L12;
                }
              }
              return false;
            }
          }
        } else {
          return true;
        }
    }

    final static void a(int param0, String param1) {
        if (param0 != 0) {
            return;
        }
        System.out.println("Error: " + tj.a("%0a", param1, "\n", (byte) -66));
    }

    final static void b(byte param0) {
        int incrementValue$40 = 0;
        int incrementValue$41 = 0;
        int incrementValue$42 = 0;
        int incrementValue$43 = 0;
        int incrementValue$44 = 0;
        int incrementValue$45 = 0;
        int incrementValue$46 = 0;
        int incrementValue$47 = 0;
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        int[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var6 = ed.field_c;
              var1 = var6;
              var2 = 0;
              var3 = var6.length;
              if (param0 <= -75) {
                break L1;
              } else {
                var5 = (String) null;
                sk.a(-77, (String) null);
                break L1;
              }
            }
            L2: while (true) {
              if (var3 <= var2) {
                break L0;
              } else {
                incrementValue$40 = var2;
                var2++;
                var1[incrementValue$40] = 0;
                incrementValue$41 = var2;
                var2++;
                var1[incrementValue$41] = 0;
                incrementValue$42 = var2;
                var2++;
                var1[incrementValue$42] = 0;
                incrementValue$43 = var2;
                var2++;
                var1[incrementValue$43] = 0;
                incrementValue$44 = var2;
                var2++;
                var1[incrementValue$44] = 0;
                incrementValue$45 = var2;
                var2++;
                var1[incrementValue$45] = 0;
                incrementValue$46 = var2;
                var2++;
                var1[incrementValue$46] = 0;
                incrementValue$47 = var2;
                var2++;
                var1[incrementValue$47] = 0;
                if (var4 == 0) {
                  continue L2;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var1_ref), "sk.D(" + param0 + ')');
        }
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
            var4 = fleas.field_A ? 1 : 0;
            try {
              L0: while (true) {
                L1: {
                  L2: {
                    L3: {
                      if (this.field_d.field_i >= this.field_d.field_k.length) {
                        break L3;
                      } else {
                        var1_int = this.field_b.read(this.field_d.field_k, this.field_d.field_i, -this.field_d.field_i + this.field_d.field_k.length);
                        var6 = var1_int;
                        var5 = 0;
                        if (var4 != 0) {
                          if (var5 == var6) {
                            break L1;
                          } else {
                            break L2;
                          }
                        } else {
                          if (var5 > var6) {
                            break L3;
                          } else {
                            this.field_d.field_i = this.field_d.field_i + var1_int;
                            if (var4 == 0) {
                              continue L0;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    }
                    if (this.field_d.field_i == this.field_d.field_k.length) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                  var1_ref = this;
                  synchronized (var1_ref) {
                    L4: {
                      this.finalize();
                      this.field_g = 3;
                      break L4;
                    }
                  }
                  return;
                }
                throw sk.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_d.field_k.length + " " + this.field_c));
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (Exception) (Object) decompiledCaughtException;
              var2_ref = this;
              synchronized (var2_ref) {
                L5: {
                  this.finalize();
                  this.field_g = this.field_g + 1;
                  break L5;
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

    final static java.awt.Container a(byte param0) {
        if (!(cb.field_t == null)) {
            return (java.awt.Container) ((Object) cb.field_t);
        }
        if (param0 <= 19) {
            return (java.awt.Container) null;
        }
        return (java.awt.Container) ((Object) rl.a((byte) -117));
    }

    sk(ce param0, java.net.URL param1, int param2) {
        try {
            this.field_f = param0;
            this.field_c = param1;
            this.field_d = new ni(param2);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "sk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(int param0, qc param1, int param2, int param3, qc param4, int param5) {
        id.field_c = param5;
        if (param3 != 443) {
            return;
        }
        try {
            ae.field_c = param2;
            ge.field_h = param0;
            qg.field_b = param1;
            ub.field_a = param4;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "sk.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    protected final void finalize() {
        if (!(null == this.field_h)) {
            if (!(this.field_h.field_e == null)) {
                try {
                    ((DataInputStream) (this.field_h.field_e)).close();
                } catch (Exception exception) {
                }
            }
            this.field_h = null;
        }
        if (!(this.field_e == null)) {
            if (!(this.field_e.field_e == null)) {
                try {
                    ((java.net.Socket) (this.field_e.field_e)).close();
                } catch (Exception exception) {
                }
            }
            this.field_e = null;
        }
        if (null != this.field_b) {
            try {
                this.field_b.close();
            } catch (Exception exception) {
            }
            this.field_b = null;
        }
        this.field_a = null;
    }

    static {
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
