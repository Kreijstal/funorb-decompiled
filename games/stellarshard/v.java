/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class v implements Runnable {
    private int field_c;
    static boolean field_b;
    private re field_j;
    private DataInputStream field_i;
    private re field_g;
    private re field_a;
    private java.net.URL field_f;
    static boolean field_e;
    private ej field_d;
    private ka field_h;

    protected final void finalize() {
        if (!(null == this.field_g)) {
            if (!(this.field_g.field_b == null)) {
                try {
                    ((DataInputStream) (this.field_g.field_b)).close();
                } catch (Exception exception) {
                }
            }
            this.field_g = null;
        }
        if (null != this.field_a) {
            if (this.field_a.field_b != null) {
                try {
                    ((java.net.Socket) (this.field_a.field_b)).close();
                } catch (Exception exception) {
                }
            }
            this.field_a = null;
        }
        if (!(null == this.field_i)) {
            try {
                this.field_i.close();
            } catch (Exception exception) {
            }
            this.field_i = null;
        }
        this.field_j = null;
    }

    public final void run() {
        try {
            int var1_int = 0;
            Object var1 = null;
            Throwable var2 = null;
            Object var2_ref = null;
            Throwable var3 = null;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            var4 = stellarshard.field_B;
            try {
              L0: {
                L1: while (true) {
                  L2: {
                    if (this.field_h.field_k >= this.field_h.field_r.length) {
                      break L2;
                    } else {
                      var1_int = this.field_i.read(this.field_h.field_r, this.field_h.field_k, this.field_h.field_r.length + -this.field_h.field_k);
                      if ((var1_int ^ -1) > -1) {
                        break L2;
                      } else {
                        this.field_h.field_k = this.field_h.field_k + var1_int;
                        continue L1;
                      }
                    }
                  }
                  if (this.field_h.field_k != this.field_h.field_r.length) {
                    var1 = this;
                    synchronized (var1) {
                      L3: {
                        this.finalize();
                        this.field_c = 3;
                        break L3;
                      }
                    }
                    break L0;
                  } else {
                    throw v.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_h.field_r.length + " " + this.field_f));
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L4: {
                var1 = (Exception) (Object) decompiledCaughtException;
                var2_ref = this;
                synchronized (var2_ref) {
                  L5: {
                    this.finalize();
                    this.field_c = this.field_c + 1;
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

    final static java.awt.Container a(boolean param0) {
        java.awt.Container discarded$0 = null;
        if (!param0) {
            discarded$0 = v.a(true);
        }
        if (!(ah.field_q == null)) {
            return (java.awt.Container) ((Object) ah.field_q);
        }
        return (java.awt.Container) ((Object) hf.a((byte) -112));
    }

    final synchronized boolean a(int param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        Throwable decompiledCaughtException = null;
        if (-3 < (this.field_c ^ -1)) {
          L0: {
            if (-1 == (this.field_c ^ -1)) {
              L1: {
                if (null != this.field_g) {
                  break L1;
                } else {
                  this.field_g = this.field_d.a(5284, this.field_f);
                  break L1;
                }
              }
              if (this.field_g.field_f != 0) {
                if (this.field_g.field_f == 1) {
                  break L0;
                } else {
                  this.field_c = this.field_c + 1;
                  this.field_g = null;
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
            if (param0 == 14709) {
              break L2;
            } else {
              this.finalize();
              break L2;
            }
          }
          L3: {
            if ((this.field_c ^ -1) == -2) {
              L4: {
                if (null == this.field_a) {
                  this.field_a = this.field_d.a(this.field_f.getHost(), (byte) 34, 443);
                  break L4;
                } else {
                  break L4;
                }
              }
              if (this.field_a.field_f == 0) {
                return false;
              } else {
                if (1 == this.field_a.field_f) {
                  break L3;
                } else {
                  this.field_c = this.field_c + 1;
                  this.field_a = null;
                  return false;
                }
              }
            } else {
              break L3;
            }
          }
          L5: {
            if (this.field_i != null) {
              break L5;
            } else {
              try {
                L6: {
                  L7: {
                    if (0 == this.field_c) {
                      this.field_i = (DataInputStream) (this.field_g.field_b);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (this.field_c != 1) {
                      break L8;
                    } else {
                      var4 = (java.net.Socket) (this.field_a.field_b);
                      var4.setSoTimeout(10000);
                      var3 = var4.getOutputStream();
                      var3.write(17);
                      var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_f.getFile() + "\n\n"));
                      var3.write(kl.a(var5, -20650));
                      this.field_i = new DataInputStream(var4.getInputStream());
                      break L8;
                    }
                  }
                  this.field_h.field_k = 0;
                  break L6;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L9: {
                  var2 = (IOException) (Object) decompiledCaughtException;
                  this.finalize();
                  this.field_c = this.field_c + 1;
                  break L9;
                }
              }
              break L5;
            }
          }
          L10: {
            if (this.field_j == null) {
              this.field_j = this.field_d.a((Runnable) (this), 5, 0);
              break L10;
            } else {
              break L10;
            }
          }
          if (this.field_j.field_f != 0) {
            if (this.field_j.field_f != 1) {
              this.finalize();
              this.field_c = this.field_c + 1;
              return false;
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    final ka b(int param0) {
        if (!((this.field_c ^ -1) != param0)) {
            return this.field_h;
        }
        return null;
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        af var4 = null;
        int var4_int = 0;
        fk var5_ref_fk = null;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        ha var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              var10 = ae.field_N;
              var2 = var10.f(4);
              var3 = var10.f(4);
              if (var2 == 0) {
                var4 = (af) ((Object) pf.field_b.b(-79));
                if (var4 == null) {
                  oj.c(-2290);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    var5 = -var10.field_k + ue.field_b;
                    var12 = var4.field_s;
                    var11 = var12;
                    var6 = var11;
                    if (var5 > var12.length << 622211330) {
                      var5 = var12.length << -757553534;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var7 = 0;
                  L3: while (true) {
                    if (var7 >= var5) {
                      var4.field_m = true;
                      var4.c(20);
                      break L1;
                    } else {
                      var6[var7 >> -1520503422] = var6[var7 >> -1520503422] + (var10.f(4) << sa.a(768, var7 << -618275800));
                      var7++;
                      continue L3;
                    }
                  }
                }
              } else {
                if (var2 != 1) {
                  qe.a(-115, "LR1: " + bh.b((byte) -96), (Throwable) null);
                  oj.c(-2290);
                  break L1;
                } else {
                  var4_int = var10.e(-64);
                  var5_ref_fk = (fk) ((Object) ib.field_c.b(-93));
                  L4: while (true) {
                    L5: {
                      if (var5_ref_fk == null) {
                        break L5;
                      } else {
                        L6: {
                          if (var3 != var5_ref_fk.field_l) {
                            break L6;
                          } else {
                            if (var5_ref_fk.field_p == var4_int) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var5_ref_fk = (fk) ((Object) ib.field_c.b((byte) 72));
                        continue L4;
                      }
                    }
                    if (var5_ref_fk == null) {
                      oj.c(-2290);
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var5_ref_fk.c(20);
                      break L1;
                    }
                  }
                }
              }
            }
            L7: {
              if (param0 < -41) {
                break L7;
              } else {
                v.a((byte) -96);
                break L7;
              }
            }
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1), "v.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    v(ej param0, java.net.URL param1, int param2) {
        try {
            this.field_d = param0;
            this.field_f = param1;
            this.field_h = new ka(param2);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "v.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_b = false;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
