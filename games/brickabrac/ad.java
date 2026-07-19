/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ad implements Runnable {
    private ql field_h;
    private DataInputStream field_k;
    private java.net.URL field_a;
    private wq field_f;
    private int field_c;
    private tg field_g;
    static jp field_b;
    static um field_e;
    private ql field_d;
    static int field_j;
    private ql field_i;
    static mh field_l;

    protected final void finalize() {
        if (this.field_d != null) {
            if (!(null == this.field_d.field_e)) {
                try {
                    ((DataInputStream) (this.field_d.field_e)).close();
                } catch (Exception exception) {
                }
            }
            this.field_d = null;
        }
        if (!(this.field_i == null)) {
            if (this.field_i.field_e != null) {
                try {
                    ((java.net.Socket) (this.field_i.field_e)).close();
                } catch (Exception exception) {
                }
            }
            this.field_i = null;
        }
        if (!(null == this.field_k)) {
            try {
                this.field_k.close();
            } catch (Exception exception) {
            }
            this.field_k = null;
        }
        this.field_h = null;
    }

    final static boolean a(boolean param0, int param1) {
        try {
            long dupTemp$2 = 0L;
            IOException var2 = null;
            pi var4 = null;
            pi var5 = null;
            int stackIn_11_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_10_0 = 0;
            int stackOut_9_0 = 0;
            L0: {
              if (param1 == 10000) {
                break L0;
              } else {
                ad.b(46);
                break L0;
              }
            }
            L1: {
              if (null != qm.field_d) {
                break L1;
              } else {
                qm.field_d = lh.field_s.a(tq.field_h, (byte) 120, dl.field_b);
                break L1;
              }
            }
            if (-1 != (qm.field_d.field_f ^ -1)) {
              dupTemp$2 = ue.a(false);
              cl.field_q = dupTemp$2;
              oj.field_t = dupTemp$2;
              if (-2 == (qm.field_d.field_f ^ -1)) {
                try {
                  L2: {
                    L3: {
                      eq.field_g = new wh((java.net.Socket) (qm.field_d.field_e), lh.field_s);
                      k.field_h.field_l = 0;
                      var4 = jl.field_e;
                      var5 = var4;
                      if (!param0) {
                        stackOut_10_0 = -1;
                        stackIn_11_0 = stackOut_10_0;
                        break L3;
                      } else {
                        stackOut_9_0 = -2;
                        stackIn_11_0 = stackOut_9_0;
                        break L3;
                      }
                    }
                    r.field_z = stackIn_11_0;
                    we.field_a = stackIn_11_0;
                    mh.field_gb = stackIn_11_0;
                    rf.field_b = pi.field_u;
                    var5.field_l = 0;
                    c.a(ko.field_e, 12, pe.field_r, fe.field_ob, k.field_h);
                    cr.a(-1, 10000);
                    break L2;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = (IOException) (Object) decompiledCaughtException;
                  rf.field_b = mc.field_e;
                  qm.field_d = null;
                  return true;
                }
                qm.field_d = null;
                return true;
              } else {
                rf.field_b = mc.field_e;
                qm.field_d = null;
                return true;
              }
            } else {
              return false;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
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
            var4 = BrickABrac.field_J ? 1 : 0;
            try {
              L0: while (true) {
                L1: {
                  if (this.field_f.field_k.length <= this.field_f.field_l) {
                    break L1;
                  } else {
                    var1_int = this.field_k.read(this.field_f.field_k, this.field_f.field_l, -this.field_f.field_l + this.field_f.field_k.length);
                    if (0 > var1_int) {
                      break L1;
                    } else {
                      this.field_f.field_l = this.field_f.field_l + var1_int;
                      continue L0;
                    }
                  }
                }
                if (this.field_f.field_l != this.field_f.field_k.length) {
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
                  throw ad.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_f.field_k.length + " " + this.field_a));
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

    final synchronized boolean a(int param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        if (this.field_c >= 2) {
          return true;
        } else {
          L0: {
            if (this.field_c != 0) {
              break L0;
            } else {
              L1: {
                if (null != this.field_d) {
                  break L1;
                } else {
                  this.field_d = this.field_g.a((byte) 73, this.field_a);
                  break L1;
                }
              }
              if (this.field_d.field_f != 0) {
                if ((this.field_d.field_f ^ -1) != -2) {
                  this.field_d = null;
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
            if (-2 != (this.field_c ^ -1)) {
              break L2;
            } else {
              L3: {
                if (null == this.field_i) {
                  this.field_i = this.field_g.a(this.field_a.getHost(), (byte) 120, 443);
                  break L3;
                } else {
                  break L3;
                }
              }
              if (0 != this.field_i.field_f) {
                if (this.field_i.field_f != 1) {
                  this.field_c = this.field_c + 1;
                  this.field_i = null;
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
            if (null != this.field_k) {
              break L4;
            } else {
              try {
                L5: {
                  L6: {
                    if (this.field_c != 0) {
                      break L6;
                    } else {
                      this.field_k = (DataInputStream) (this.field_d.field_e);
                      break L6;
                    }
                  }
                  L7: {
                    if (this.field_c == 1) {
                      var4 = (java.net.Socket) (this.field_i.field_e);
                      var4.setSoTimeout(10000);
                      var3 = var4.getOutputStream();
                      var3.write(17);
                      var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_a.getFile() + "\n\n"));
                      var3.write(uj.a(var5, false));
                      this.field_k = new DataInputStream(var4.getInputStream());
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  this.field_f.field_l = 0;
                  decompiledRegionSelector0 = 0;
                  break L5;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L8: {
                  var2 = (IOException) (Object) decompiledCaughtException;
                  this.finalize();
                  this.field_c = this.field_c + 1;
                  decompiledRegionSelector0 = 1;
                  break L8;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                L9: {
                  if (null == this.field_h) {
                    this.field_h = this.field_g.a(5, (Runnable) (this), (byte) -72);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                if (this.field_h.field_f != 0) {
                  if (this.field_h.field_f == param0) {
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
                break L4;
              }
            }
          }
          L10: {
            if (null == this.field_h) {
              this.field_h = this.field_g.a(5, (Runnable) (this), (byte) -72);
              break L10;
            } else {
              break L10;
            }
          }
          if (this.field_h.field_f == 0) {
            return false;
          } else {
            L11: {
              if (this.field_h.field_f != param0) {
                this.finalize();
                this.field_c = this.field_c + 1;
                break L11;
              } else {
                break L11;
              }
            }
            return false;
          }
        }
    }

    public static void b(int param0) {
        boolean discarded$0 = false;
        field_e = null;
        field_l = null;
        field_b = null;
        if (param0 != -16637) {
            discarded$0 = ad.a(true, 13);
        }
    }

    final wq a(byte param0) {
        boolean discarded$6 = false;
        if (param0 >= 95) {
          if ((this.field_c ^ -1) != -4) {
            return null;
          } else {
            return this.field_f;
          }
        } else {
          discarded$6 = this.a(-111);
          if ((this.field_c ^ -1) != -4) {
            return null;
          } else {
            return this.field_f;
          }
        }
    }

    ad(tg param0, java.net.URL param1, int param2) {
        try {
            this.field_g = param0;
            this.field_a = param1;
            this.field_f = new wq(param2);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "ad.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_j = -1;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
