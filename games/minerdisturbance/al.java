/*
 * Decompiled by CFR-JS 0.4.0.
 */
class al extends pi {
    static ih field_r;
    al field_q;
    long field_p;
    static String field_o;
    static volatile int field_n;
    al field_t;
    static wh field_s;

    final void a(byte param0) {
        if (param0 > -90) {
            field_s = null;
            if (null == ((al) this).field_q) {
                return;
            }
            ((al) this).field_q.field_t = ((al) this).field_t;
            ((al) this).field_t.field_q = ((al) this).field_q;
            ((al) this).field_q = null;
            ((al) this).field_t = null;
            return;
        }
        if (null == ((al) this).field_q) {
            return;
        }
        ((al) this).field_q.field_t = ((al) this).field_t;
        ((al) this).field_t.field_q = ((al) this).field_q;
        ((al) this).field_q = null;
        ((al) this).field_t = null;
    }

    final static jf a(int param0, String param1) {
        if (param0 != -10218) {
            al.e(-101);
            return new jf(param1);
        }
        return new jf(param1);
    }

    public static void a(int param0) {
        field_r = null;
        field_s = null;
        if (param0 != -483) {
            field_r = null;
            field_o = null;
            return;
        }
        field_o = null;
    }

    final static void e(int param0) {
        int var1 = 0;
        int var2 = 0;
        Object var3 = null;
        var2 = MinerDisturbance.field_ab;
        if (param0 > 72) {
          var1 = 0;
          L0: while (true) {
            if (-26 >= (var1 ^ -1)) {
              return;
            } else {
              L1: {
                if (dn.field_t[var1] != null) {
                  if (dn.field_t[var1].k()) {
                    dn.field_t[var1] = null;
                    break L1;
                  } else {
                    kf.a(dn.field_t[var1], (byte) -113);
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              L2: {
                if (gl.field_u[var1] != null) {
                  if (gl.field_u[var1].k()) {
                    gl.field_u[var1] = null;
                    break L2;
                  } else {
                    kf.a(gl.field_u[var1], (byte) -54);
                    break L2;
                  }
                } else {
                  var1++;
                  break L2;
                }
              }
              var1++;
              continue L0;
            }
          }
        } else {
          var3 = null;
          jf discarded$1 = al.a(-123, (String) null);
          var1 = 0;
          if (-26 >= (var1 ^ -1)) {
            return;
          } else {
            if (dn.field_t[var1] != null) {
              if (dn.field_t[var1].k()) {
                L3: {
                  dn.field_t[var1] = null;
                  if (gl.field_u[var1] != null) {
                    L4: {
                      if (gl.field_u[var1].k()) {
                        gl.field_u[var1] = null;
                        break L4;
                      } else {
                        kf.a(gl.field_u[var1], (byte) -54);
                        var1++;
                        break L4;
                      }
                    }
                    var1++;
                    break L3;
                  } else {
                    var1++;
                    break L3;
                  }
                }
                var1++;
                var1++;
                var1++;
                var1++;
                return;
              } else {
                L5: {
                  kf.a(dn.field_t[var1], (byte) -113);
                  if (gl.field_u[var1] != null) {
                    L6: {
                      if (gl.field_u[var1].k()) {
                        gl.field_u[var1] = null;
                        break L6;
                      } else {
                        kf.a(gl.field_u[var1], (byte) -54);
                        var1++;
                        break L6;
                      }
                    }
                    var1++;
                    break L5;
                  } else {
                    var1++;
                    break L5;
                  }
                }
                var1++;
                var1++;
                var1++;
                var1++;
                return;
              }
            } else {
              L7: {
                if (gl.field_u[var1] != null) {
                  L8: {
                    if (gl.field_u[var1].k()) {
                      gl.field_u[var1] = null;
                      break L8;
                    } else {
                      kf.a(gl.field_u[var1], (byte) -54);
                      var1++;
                      break L8;
                    }
                  }
                  var1++;
                  break L7;
                } else {
                  var1++;
                  break L7;
                }
              }
              var1++;
              var1++;
              var1++;
              var1++;
              return;
            }
          }
        }
    }

    protected al() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = 0;
        field_o = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}
