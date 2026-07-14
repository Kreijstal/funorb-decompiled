/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qc {
    private vb[] field_g;
    private int field_e;
    String field_j;
    static pd field_f;
    static km field_i;
    static int field_c;
    float field_a;
    private int field_d;
    private int field_b;
    static boolean field_h;

    private final void a(vb param0, int param1, int param2) {
        float var4 = 0.0f;
        var4 = (float)param2 / 100.0f + (float)(1 + ((qc) this).field_d);
        if (param2 != 0) {
          ((qc) this).field_j = param0.field_e + " - " + param2 + "%";
          if (param1 <= -19) {
            ((qc) this).field_a = var4 * (float)((qc) this).field_b / (float)(1 + ((qc) this).field_e);
            return;
          } else {
            qc.a(85, (byte) -81);
            ((qc) this).field_a = var4 * (float)((qc) this).field_b / (float)(1 + ((qc) this).field_e);
            return;
          }
        } else {
          ((qc) this).field_j = param0.field_b;
          if (param1 <= -19) {
            ((qc) this).field_a = var4 * (float)((qc) this).field_b / (float)(1 + ((qc) this).field_e);
            return;
          } else {
            qc.a(85, (byte) -81);
            ((qc) this).field_a = var4 * (float)((qc) this).field_b / (float)(1 + ((qc) this).field_e);
            return;
          }
        }
    }

    final static hh a(int param0, String param1) {
        int var2 = 0;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        hh var7 = null;
        int var8 = 0;
        var8 = Virogrid.field_F ? 1 : 0;
        var2 = param1.length();
        if (var2 != 0) {
          if (255 < var2) {
            return cb.field_a;
          } else {
            var3 = ql.a(param1, (byte) -123, '.');
            if (2 > var3.length) {
              return a.field_H;
            } else {
              var4 = var3;
              var5 = 0;
              L0: while (true) {
                if (var4.length <= var5) {
                  if (param0 != 28320) {
                    qc.a((byte) 90);
                    return jm.a(true, var3[-1 + var3.length]);
                  } else {
                    return jm.a(true, var3[-1 + var3.length]);
                  }
                } else {
                  var6 = var4[var5];
                  var7 = vf.a(var6, 8286);
                  if (var7 != null) {
                    return var7;
                  } else {
                    var5++;
                    continue L0;
                  }
                }
              }
            }
          }
        } else {
          return a.field_H;
        }
    }

    final boolean a(boolean param0) {
        vb var2 = null;
        int var3 = 0;
        vb var4 = null;
        var3 = Virogrid.field_F ? 1 : 0;
        L0: while (true) {
          if (((qc) this).field_e <= ((qc) this).field_d) {
            if (!param0) {
              return true;
            } else {
              return true;
            }
          } else {
            var4 = ((qc) this).field_g[((qc) this).field_d];
            var2 = var4;
            if (var4.field_f.c(0)) {
              L1: {
                if ((var4.field_m ^ -1) > -1) {
                  break L1;
                } else {
                  if (!var4.field_f.c((byte) 81, var4.field_m)) {
                    this.a(var2, -50, var4.field_f.b((byte) 105, var4.field_m));
                    return false;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (var4.field_k == null) {
                  break L2;
                } else {
                  if (var4.field_f.a((byte) -102, var4.field_k)) {
                    break L2;
                  } else {
                    this.a(var2, -97, var4.field_f.a(var4.field_k, 126));
                    return false;
                  }
                }
              }
              L3: {
                if (var4.field_m >= 0) {
                  break L3;
                } else {
                  if (null != var4.field_k) {
                    break L3;
                  } else {
                    if (null == var4.field_e) {
                      break L3;
                    } else {
                      if (!var4.field_f.b(25867)) {
                        this.a(var2, -95, var4.field_f.a(-2677));
                        return false;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              ((qc) this).field_d = ((qc) this).field_d + 1;
              continue L0;
            } else {
              this.a(var4, -87, 0);
              return false;
            }
          }
        }
    }

    final static mg[] a(int param0, mg param1) {
        mg[] var3 = new mg[9];
        mg[] var2 = var3;
        var3[4] = param1;
        if (param0 < 16) {
            return null;
        }
        return var2;
    }

    final static void a(int param0) {
        ph.field_l[me.field_b] = df.field_d;
        pb.field_i[me.field_b] = df.field_i;
        m.field_i[me.field_b] = df.field_k;
        ng.field_O[me.field_b] = df.field_g;
        qe.field_h[me.field_b] = df.field_h;
        kn.field_K[me.field_b] = df.field_e;
        se.field_e[me.field_b] = df.field_f;
        if (param0 <= 96) {
          return;
        } else {
          me.field_b = me.field_b + 1;
          return;
        }
    }

    final static void b(byte param0) {
        if (ug.a(true)) {
          if (param0 != -12) {
            qc.b((byte) -103);
            nm.a(false, 4, (byte) 107);
            return;
          } else {
            nm.a(false, 4, (byte) 107);
            return;
          }
        } else {
          return;
        }
    }

    final static void a(int param0, byte param1) {
        if (param1 <= 81) {
            return;
        }
        hd.field_f = 1000000000L / (long)param0;
    }

    public static void a(byte param0) {
        if (param0 != 9) {
            field_c = -88;
            field_i = null;
            field_f = null;
            return;
        }
        field_i = null;
        field_f = null;
    }

    private qc() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = true;
    }
}
