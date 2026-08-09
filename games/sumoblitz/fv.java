/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fv extends rw {
    static float[] field_v;
    static mi field_y;
    int field_x;
    fs field_w;
    byte field_z;

    public static void d(byte param0) {
        field_y = null;
        field_v = null;
        if (param0 != 62) {
            ki var2 = (ki) null;
            fv.a(-52, (ki) null, (ki) null);
        }
    }

    final int a(int param0) {
        if (this.field_w == null) {
          return 0;
        } else {
          if (param0 != -1) {
            return 50;
          } else {
            return 100 * this.field_w.field_p / (-this.field_z + this.field_w.field_n.length);
          }
        }
    }

    final static void a(int param0, ki param1, ki param2) {
        try {
            if (param0 != 7966) {
                fv.d((byte) 80);
            }
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "fv.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void e(byte param0) {
        int var1_int = 0;
        dj var2 = null;
        int var3 = 0;
        boolean stackIn_18_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              wd.field_f.b();
              var1_int = -111 % ((param0 - -34) / 35);
              iv.field_a.b();
              vf.field_b = vf.field_b - 1;
              if (vf.field_b == 0) {
                vf.field_b = 200;
                var2 = (dj) ((Object) jf.field_c.b(107));
                L2: while (true) {
                  if (var2 == null) {
                    if (s.field_u == null) {
                      break L1;
                    } else {
                      var2 = (dj) ((Object) s.field_u.b(-105));
                      L3: while (true) {
                        if (var2 == null) {
                          break L1;
                        } else {
                          L4: {
                            if (var2.field_k.a(false)) {
                              break L4;
                            } else {
                              var2.b(false);
                              break L4;
                            }
                          }
                          var2 = (dj) ((Object) s.field_u.d((byte) 18));
                          continue L3;
                        }
                      }
                    }
                  } else {
                    L5: {
                      if (var2.field_k.a(false)) {
                        break L5;
                      } else {
                        var2.b(false);
                        break L5;
                      }
                    }
                    var2 = (dj) ((Object) jf.field_c.d((byte) 18));
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            L6: {
              if (qc.field_e == null) {
                break L6;
              } else {
                stackIn_18_0 = qc.field_e.c(-8192);
                if (stackIn_18_0) {
                  break L6;
                } else {
                  nd.field_B = null;
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var1), "fv.G(" + param0 + ')');
        }
    }

    final byte[] d(boolean param0) {
        if (!param0) {
          if (!this.field_u) {
            if (-this.field_z + this.field_w.field_n.length > this.field_w.field_p) {
              throw new RuntimeException();
            } else {
              return this.field_w.field_n;
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          return (byte[]) null;
        }
    }

    fv() {
    }

    static {
        field_v = new float[4];
        field_y = new mi();
        nn.b(50, -120);
    }
}
