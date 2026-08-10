/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class uj implements Runnable {
    private be field_i;
    private eb field_h;
    private eb field_a;
    static qd field_b;
    private int field_d;
    private mg field_e;
    private eb field_f;
    private DataInputStream field_g;
    private java.net.URL field_c;

    final static void a(byte param0, mg param1) {
        int var2_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              fd.field_f = param1.j(98203176) << 71847173;
              var2_int = param1.b((byte) 90);
              fd.field_f = fd.field_f + (var2_int >> -387603965);
              cc.field_l = (var2_int & 7) << -325254638;
              cc.field_l = cc.field_l + (param1.j(98203176) << 1766675042);
              var2_int = param1.b((byte) 90);
              oh.field_b = (var2_int & 63) << 1895327631;
              cc.field_l = cc.field_l + (var2_int >> -1518330426);
              oh.field_b = oh.field_b + (param1.b((byte) 90) << -1196840697);
              var2_int = param1.b((byte) 90);
              oh.field_b = oh.field_b + (var2_int >> 2014290945);
              h.field_E = (var2_int & 1) << -1865083952;
              h.field_E = h.field_E + param1.j(param0 + 98203261);
              if (param0 == -85) {
                break L1;
              } else {
                field_b = (qd) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var2);

            stackIn_5_1 = new StringBuilder().append("uj.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final static void c(byte param0) {
        lb.a(true);
        if (!(null == tf.field_f)) {
            hl.a(tf.field_f, 106);
        }
        fd.b(-82);
        km.b(-100);
        af.a(109);
        if (uj.a((byte) -36)) {
            uk.field_b.i(1, -53);
            bh.a(0, -1);
        }
        th.a(106);
        if (param0 != 63) {
            uj.c(33);
        }
    }

    public final void run() {
        try {
            int var1_int = 0;
            Object var1 = null;
            Throwable var2 = null;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            Object var2_ref = null;
            var4 = OrbDefence.field_D ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  L2: {
                    if (this.field_e.field_j.length <= this.field_e.field_i) {
                      break L2;
                    } else {
                      var1_int = this.field_g.read(this.field_e.field_j, this.field_e.field_i, this.field_e.field_j.length + -this.field_e.field_i);
                      if (var1_int < 0) {
                        break L2;
                      } else {
                        this.field_e.field_i = this.field_e.field_i + var1_int;
                        continue L1;
                      }
                    }
                  }
                  if (this.field_e.field_j.length == this.field_e.field_i) {
                    throw uj.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_e.field_j.length + " " + this.field_c));
                  } else {
                    var1 = this;
                    synchronized (var1) {
                      L3: {
                        this.finalize();
                        this.field_d = 3;
                        break L3;
                      }
                    }
                    break L0;
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
                    this.field_d = this.field_d + 1;
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

    final static java.applet.Applet b(byte param0) {
        if (param0 != -120) {
            uj.b((byte) 89);
        }
        if (!(mj.field_j == null)) {
            return mj.field_j;
        }
        return (java.applet.Applet) ((Object) aj.field_b);
    }

    final static boolean a(int[] param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_35_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        long var3 = 0L;
        hc var5_ref_hc = null;
        int var5 = 0;
        int var6_int = 0;
        hc var6 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (da.field_r != dh.field_bb) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var2_int = 28 / ((param1 - 65) / 36);
                var3 = ji.b(125);
                if (0 == hf.field_i) {
                  break L1;
                } else {
                  if ((vb.field_i ^ -1) <= -1) {
                    break L1;
                  } else {
                    var5_ref_hc = (hc) ((Object) t.field_q.b((byte) 121));
                    if (var5_ref_hc == null) {
                      break L1;
                    } else {
                      if ((var5_ref_hc.field_h ^ -1L) <= (var3 ^ -1L)) {
                        break L1;
                      } else {
                        var5_ref_hc.b(57);
                        tf.field_c = var5_ref_hc.field_m.length;
                        cd.field_t.field_i = 0;
                        var6_int = 0;
                        L2: while (true) {
                          if (var6_int >= tf.field_c) {
                            lh.field_c = fe.field_b;
                            fe.field_b = ce.field_d;
                            ce.field_d = ab.field_l;
                            ab.field_l = var5_ref_hc.field_g;
                            stackIn_13_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            cd.field_t.field_j[var6_int] = var5_ref_hc.field_m[var6_int];
                            var6_int++;
                            continue L2;
                          }
                        }
                      }
                    }
                  }
                }
              }
              L3: while (true) {
                L4: {
                  if (-1 < (vb.field_i ^ -1)) {
                    cd.field_t.field_i = 0;
                    if (va.a(true, 1)) {
                      vb.field_i = cd.field_t.o(-75);
                      cd.field_t.field_i = 0;
                      tf.field_c = param0[vb.field_i];
                      break L4;
                    } else {
                      stackIn_19_0 = 0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    break L4;
                  }
                }
                if (ce.a(-106)) {
                  if (hf.field_i == 0) {
                    lh.field_c = fe.field_b;
                    fe.field_b = ce.field_d;
                    ce.field_d = ab.field_l;
                    ab.field_l = vb.field_i;
                    vb.field_i = -1;
                    stackIn_35_0 = 1;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    L5: {
                      var5 = hf.field_i;
                      if (tk.field_q != 0.0) {
                        var5 = (int)((double)var5 + tl.field_f.nextGaussian() * tk.field_q);
                        if (-1 < (var5 ^ -1)) {
                          var5 = 0;
                          break L5;
                        } else {
                          break L5;
                        }
                      } else {
                        break L5;
                      }
                    }
                    var6 = new hc(var3 + (long)var5, vb.field_i, new byte[tf.field_c]);
                    var7 = 0;
                    L6: while (true) {
                      if (var7 >= tf.field_c) {
                        t.field_q.a(-97, var6);
                        vb.field_i = -1;
                        continue L3;
                      } else {
                        var6.field_m[var7] = cd.field_t.field_j[var7];
                        var7++;
                        continue L6;
                      }
                    }
                  }
                } else {
                  stackIn_23_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_38_0 = (RuntimeException) (var2);

            stackIn_38_1 = new StringBuilder().append("uj.G(");

            if (param0 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L7;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L7;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_19_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_23_0 != 0;
              } else {
                return stackIn_35_0 != 0;
              }
            }
          }
        }
    }

    final mg a(int param0) {
        if (!(-4 != (this.field_d ^ -1))) {
            return this.field_e;
        }
        if (param0 == 5) {
            return null;
        }
        return (mg) null;
    }

    public static void c(int param0) {
        field_b = null;
        if (param0 != 0) {
            uj.c(113);
        }
    }

    private final static boolean a(byte param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0 == -36) {
            break L0;
          } else {
            field_b = (qd) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (p.field_d == null) {
              break L2;
            } else {
              if (!dh.field_bb.a((byte) 74)) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    protected final void finalize() {
        if (!(null == this.field_a)) {
            if (!(this.field_a.field_g == null)) {
                try {
                    ((DataInputStream) (this.field_a.field_g)).close();
                } catch (Exception exception) {
                }
            }
            this.field_a = null;
        }
        if (!(null == this.field_f)) {
            if (!(this.field_f.field_g == null)) {
                try {
                    ((java.net.Socket) (this.field_f.field_g)).close();
                } catch (Exception exception) {
                }
            }
            this.field_f = null;
        }
        if (null != this.field_g) {
            try {
                this.field_g.close();
            } catch (Exception exception) {
            }
            this.field_g = null;
        }
        this.field_h = null;
    }

    final synchronized boolean b(int param0) {
        Throwable decompiledCaughtException = null;
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        if (-3 >= (this.field_d ^ -1)) {
          return true;
        } else {
          L0: {
            if (param0 < -2) {
              break L0;
            } else {
              this.field_a = (eb) null;
              break L0;
            }
          }
          L1: {
            if (0 != this.field_d) {
              break L1;
            } else {
              L2: {
                if (this.field_a == null) {
                  this.field_a = this.field_i.a(this.field_c, (byte) -49);
                  break L2;
                } else {
                  break L2;
                }
              }
              if (this.field_a.field_a != 0) {
                if ((this.field_a.field_a ^ -1) != -2) {
                  this.field_a = null;
                  this.field_d = this.field_d + 1;
                  return false;
                } else {
                  break L1;
                }
              } else {
                return false;
              }
            }
          }
          L3: {
            if (-2 != (this.field_d ^ -1)) {
              break L3;
            } else {
              L4: {
                if (null != this.field_f) {
                  break L4;
                } else {
                  this.field_f = this.field_i.a(443, 0, this.field_c.getHost());
                  break L4;
                }
              }
              if (-1 == (this.field_f.field_a ^ -1)) {
                return false;
              } else {
                if (this.field_f.field_a != 1) {
                  this.field_f = null;
                  this.field_d = this.field_d + 1;
                  return false;
                } else {
                  break L3;
                }
              }
            }
          }
          L5: {
            if (null != this.field_g) {
              break L5;
            } else {
              try {
                L6: {
                  L7: {
                    if (this.field_d == 0) {
                      this.field_g = (DataInputStream) (this.field_a.field_g);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (this.field_d == 1) {
                      var4 = (java.net.Socket) (this.field_f.field_g);
                      var4.setSoTimeout(10000);
                      var3 = var4.getOutputStream();
                      var3.write(17);
                      var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_c.getFile() + "\n\n"));
                      var3.write(oc.a(true, var5));
                      this.field_g = new DataInputStream(var4.getInputStream());
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  this.field_e.field_i = 0;
                  break L6;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L9: {
                  var2 = (IOException) (Object) decompiledCaughtException;
                  this.finalize();
                  this.field_d = this.field_d + 1;
                  break L9;
                }
              }
              break L5;
            }
          }
          L10: {
            if (null == this.field_h) {
              this.field_h = this.field_i.a(314572800, 5, (Runnable) (this));
              break L10;
            } else {
              break L10;
            }
          }
          if (this.field_h.field_a != 0) {
            if (1 == this.field_h.field_a) {
              return false;
            } else {
              this.finalize();
              this.field_d = this.field_d + 1;
              return false;
            }
          } else {
            return false;
          }
        }
    }

    uj(be param0, java.net.URL param1, int param2) {
        try {
            this.field_i = param0;
            this.field_c = param1;
            this.field_e = new mg(param2);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "uj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_b = new qd();
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
