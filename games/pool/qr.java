/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qr {
    static int field_d;
    static int field_g;
    static int field_b;
    static ko field_a;
    private boolean field_e;
    private String field_c;
    private boolean field_f;

    public static void a(byte param0) {
        if (param0 < 41) {
            qr.a(123, false);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final boolean b(byte param0) {
        int var2 = 105 / ((param0 - 0) / 60);
        return this.field_e;
    }

    final boolean a(int param0) {
        boolean discarded$0 = false;
        if (param0 <= 74) {
            discarded$0 = this.b((byte) 103);
            return this.field_f;
        }
        return this.field_f;
    }

    final String b(int param0) {
        if (param0 != 2) {
            return (String) null;
        }
        return this.field_c;
    }

    final static void c(int param0) {
        if (param0 != 640) {
            field_a = (ko) null;
        }
    }

    final void a(boolean param0, byte param1) {
        if (param1 <= 108) {
            return;
        }
        this.field_e = param0 ? true : false;
        this.field_f = true;
    }

    qr(String param0) {
        this.field_e = false;
        this.field_f = false;
        try {
            this.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "qr.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Pool.field_O;
        if ((mp.field_V ^ -1) < -1) {
          if (fk.field_gb == null) {
            L0: {
              ne.field_u = wp.a(640, lg.field_s, (byte) 0, 480, 0, 0);
              if (null != ne.field_u) {
                var2 = 2;
                kc.a(ne.field_u, param0 ^ -28040);
                break L0;
              } else {
                var2 = 3;
                break L0;
              }
            }
            L1: {
              if (fk.field_gb != null) {
                break L1;
              } else {
                if (!fe.field_J) {
                  break L1;
                } else {
                  kk.a(param1, 4, var2);
                  if (param0 != -28038) {
                    field_a = (ko) null;
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
            if (param0 != -28038) {
              field_a = (ko) null;
              return;
            } else {
              return;
            }
          } else {
            L2: {
              ne.field_u = fk.field_gb.b(-71);
              ab.a(25692, 2);
              if (null != ne.field_u) {
                var2 = 2;
                kc.a(ne.field_u, param0 ^ -28040);
                break L2;
              } else {
                var2 = 3;
                break L2;
              }
            }
            if (fk.field_gb == null) {
              if (fe.field_J) {
                kk.a(param1, 4, var2);
                if (param0 != -28038) {
                  field_a = (ko) null;
                  return;
                } else {
                  return;
                }
              } else {
                if (param0 != -28038) {
                  field_a = (ko) null;
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (param0 != -28038) {
                field_a = (ko) null;
                return;
              } else {
                return;
              }
            }
          }
        } else {
          if (hk.b(-120)) {
            var2 = 0;
            if (fk.field_gb == null) {
              if (fe.field_J) {
                kk.a(param1, 4, var2);
                if (param0 != -28038) {
                  field_a = (ko) null;
                  return;
                } else {
                  return;
                }
              } else {
                if (param0 == -28038) {
                  return;
                } else {
                  field_a = (ko) null;
                  return;
                }
              }
            } else {
              if (param0 != -28038) {
                field_a = (ko) null;
                return;
              } else {
                return;
              }
            }
          } else {
            var2 = 1;
            L3: {
              if (fk.field_gb != null) {
                break L3;
              } else {
                if (!fe.field_J) {
                  break L3;
                } else {
                  kk.a(param1, 4, var2);
                  if (param0 == -28038) {
                    return;
                  } else {
                    field_a = (ko) null;
                    return;
                  }
                }
              }
            }
            if (param0 == -28038) {
              return;
            } else {
              field_a = (ko) null;
              return;
            }
          }
        }
    }

    static {
        field_a = new ko();
    }
}
