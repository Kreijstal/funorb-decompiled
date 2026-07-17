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
        RuntimeException var2 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              fd.field_f = param1.j(98203176) << 5;
              var2_int = param1.b((byte) 90);
              fd.field_f = fd.field_f + (var2_int >> 3);
              cc.field_l = (var2_int & 7) << 18;
              cc.field_l = cc.field_l + (param1.j(98203176) << 2);
              var2_int = param1.b((byte) 90);
              oh.field_b = (var2_int & 63) << 15;
              cc.field_l = cc.field_l + (var2_int >> 6);
              oh.field_b = oh.field_b + (param1.b((byte) 90) << 7);
              var2_int = param1.b((byte) 90);
              oh.field_b = oh.field_b + (var2_int >> 1);
              h.field_E = (var2_int & 1) << 16;
              h.field_E = h.field_E + param1.j(param0 + 98203261);
              if (param0 == -85) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var2;
            stackOut_3_1 = new StringBuilder().append("uj.A(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
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
    }

    public final void run() {
        try {
            int var1_int = 0;
            Object var1 = null;
            Exception var1_ref = null;
            Throwable var2 = null;
            Object var2_ref = null;
            Throwable var3 = null;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            var4 = OrbDefence.field_D ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  L2: {
                    if (((uj) this).field_e.field_j.length <= ((uj) this).field_e.field_i) {
                      break L2;
                    } else {
                      var1_int = ((uj) this).field_g.read(((uj) this).field_e.field_j, ((uj) this).field_e.field_i, ((uj) this).field_e.field_j.length + -((uj) this).field_e.field_i);
                      if (var1_int < 0) {
                        break L2;
                      } else {
                        ((uj) this).field_e.field_i = ((uj) this).field_e.field_i + var1_int;
                        continue L1;
                      }
                    }
                  }
                  if (((uj) this).field_e.field_j.length == ((uj) this).field_e.field_i) {
                    throw uj.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + ((uj) this).field_e.field_j.length + " " + ((uj) this).field_c));
                  } else {
                    var1 = this;
                    synchronized (var1) {
                      L3: {
                        ((uj) this).finalize();
                        ((uj) this).field_d = 3;
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
                var1_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref = this;
                synchronized (var2_ref) {
                  L5: {
                    ((uj) this).finalize();
                    ((uj) this).field_d = ((uj) this).field_d + 1;
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
            java.applet.Applet discarded$0 = uj.b((byte) 89);
        }
        if (!(mj.field_j == null)) {
            return mj.field_j;
        }
        return (java.applet.Applet) (Object) aj.field_b;
    }

    final static boolean a(int[] param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        long var3 = 0L;
        hc var5_ref_hc = null;
        int var5 = 0;
        int var6_int = 0;
        hc var6 = null;
        int var7 = 0;
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_35_0 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_22_0 = 0;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (da.field_r != dh.field_bb) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                var2_int = -14;
                var3 = ji.b(125);
                if (0 == hf.field_i) {
                  break L1;
                } else {
                  if (vb.field_i >= 0) {
                    break L1;
                  } else {
                    var5_ref_hc = (hc) (Object) t.field_q.b((byte) 121);
                    if (var5_ref_hc == null) {
                      break L1;
                    } else {
                      if (~var5_ref_hc.field_h <= ~var3) {
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
                            stackOut_12_0 = 1;
                            stackIn_13_0 = stackOut_12_0;
                            return stackIn_13_0 != 0;
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
                  if (vb.field_i < 0) {
                    cd.field_t.field_i = 0;
                    if (va.a(true, 1)) {
                      vb.field_i = cd.field_t.o(-75);
                      cd.field_t.field_i = 0;
                      tf.field_c = param0[vb.field_i];
                      break L4;
                    } else {
                      stackOut_18_0 = 0;
                      stackIn_19_0 = stackOut_18_0;
                      return stackIn_19_0 != 0;
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
                    stackOut_34_0 = 1;
                    stackIn_35_0 = stackOut_34_0;
                    break L0;
                  } else {
                    L5: {
                      var5 = hf.field_i;
                      if (tk.field_q != 0.0) {
                        var5 = (int)((double)var5 + tl.field_f.nextGaussian() * tk.field_q);
                        if (var5 < 0) {
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
                        t.field_q.a(-97, (ca) (Object) var6);
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
                  stackOut_22_0 = 0;
                  stackIn_23_0 = stackOut_22_0;
                  return stackIn_23_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) var2;
            stackOut_36_1 = new StringBuilder().append("uj.G(");
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param0 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L7;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L7;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + 44 + -16 + 41);
        }
        return stackIn_35_0 != 0;
    }

    final mg a(int param0) {
        if (!(((uj) this).field_d != 3)) {
            return ((uj) this).field_e;
        }
        if (param0 == 5) {
            return null;
        }
        return null;
    }

    public static void c(int param0) {
        field_b = null;
        if (param0 != 0) {
            uj.c(113);
        }
    }

    private final static boolean a(byte param0) {
        return p.field_d != null && dh.field_bb.a((byte) 74);
    }

    protected final void finalize() {
        if (!(null == ((uj) this).field_a)) {
            if (!(((uj) this).field_a.field_g == null)) {
                try {
                    ((DataInputStream) ((uj) this).field_a.field_g).close();
                } catch (Exception exception) {
                }
            }
            ((uj) this).field_a = null;
        }
        if (!(null == ((uj) this).field_f)) {
            if (!(((uj) this).field_f.field_g == null)) {
                try {
                    ((java.net.Socket) ((uj) this).field_f.field_g).close();
                } catch (Exception exception) {
                }
            }
            ((uj) this).field_f = null;
        }
        if (null != ((uj) this).field_g) {
            try {
                ((uj) this).field_g.close();
            } catch (Exception exception) {
            }
            ((uj) this).field_g = null;
        }
        ((uj) this).field_h = null;
    }

    final synchronized boolean b(int param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        Throwable decompiledCaughtException = null;
        if (((uj) this).field_d >= 2) {
          return true;
        } else {
          L0: {
            if (param0 < -2) {
              break L0;
            } else {
              ((uj) this).field_a = null;
              break L0;
            }
          }
          L1: {
            if (0 != ((uj) this).field_d) {
              break L1;
            } else {
              L2: {
                if (((uj) this).field_a == null) {
                  ((uj) this).field_a = ((uj) this).field_i.a(((uj) this).field_c, (byte) -49);
                  break L2;
                } else {
                  break L2;
                }
              }
              if (((uj) this).field_a.field_a != 0) {
                if (((uj) this).field_a.field_a != 1) {
                  ((uj) this).field_a = null;
                  ((uj) this).field_d = ((uj) this).field_d + 1;
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
            if (((uj) this).field_d != 1) {
              break L3;
            } else {
              L4: {
                if (null != ((uj) this).field_f) {
                  break L4;
                } else {
                  ((uj) this).field_f = ((uj) this).field_i.a(443, 0, ((uj) this).field_c.getHost());
                  break L4;
                }
              }
              if (((uj) this).field_f.field_a == 0) {
                return false;
              } else {
                if (((uj) this).field_f.field_a != 1) {
                  ((uj) this).field_f = null;
                  ((uj) this).field_d = ((uj) this).field_d + 1;
                  return false;
                } else {
                  break L3;
                }
              }
            }
          }
          L5: {
            if (null != ((uj) this).field_g) {
              break L5;
            } else {
              try {
                L6: {
                  L7: {
                    if (((uj) this).field_d == 0) {
                      ((uj) this).field_g = (DataInputStream) ((uj) this).field_a.field_g;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (((uj) this).field_d == 1) {
                      var4 = (java.net.Socket) ((uj) this).field_f.field_g;
                      var4.setSoTimeout(10000);
                      var3 = var4.getOutputStream();
                      var3.write(17);
                      var5 = (CharSequence) (Object) ("JAGGRAB " + ((uj) this).field_c.getFile() + "\n\n");
                      var3.write(oc.a(true, var5));
                      ((uj) this).field_g = new DataInputStream(var4.getInputStream());
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  ((uj) this).field_e.field_i = 0;
                  break L6;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L9: {
                  var2 = (IOException) (Object) decompiledCaughtException;
                  ((uj) this).finalize();
                  ((uj) this).field_d = ((uj) this).field_d + 1;
                  break L9;
                }
              }
              break L5;
            }
          }
          L10: {
            if (null == ((uj) this).field_h) {
              ((uj) this).field_h = ((uj) this).field_i.a(314572800, 5, (Runnable) this);
              break L10;
            } else {
              break L10;
            }
          }
          if (((uj) this).field_h.field_a != 0) {
            if (1 == ((uj) this).field_h.field_a) {
              return false;
            } else {
              ((uj) this).finalize();
              ((uj) this).field_d = ((uj) this).field_d + 1;
              return false;
            }
          } else {
            return false;
          }
        }
    }

    uj(be param0, java.net.URL param1, int param2) {
        try {
            ((uj) this).field_i = param0;
            ((uj) this).field_c = param1;
            ((uj) this).field_e = new mg(param2);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "uj.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new qd();
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
