/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl {
    static String field_b;
    private vl field_c;
    private am field_a;
    static String field_d;

    final am a(am param0, boolean param1) {
        am var3 = null;
        if (param1) {
            return null;
        }
        if (param0 != null) {
            var3 = param0;
        } else {
            var3 = ((fl) this).field_c.field_b.field_g;
        }
        if (!(((fl) this).field_c.field_b != var3)) {
            ((fl) this).field_a = null;
            return null;
        }
        ((fl) this).field_a = var3.field_g;
        return var3;
    }

    public static void a(byte param0) {
        if (param0 >= -25) {
            return;
        }
        field_b = null;
        field_d = null;
    }

    final static int d(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = HostileSpawn.field_I ? 1 : 0;
        if ((sg.field_i ^ -1) > -51) {
          return 0;
        } else {
          if (param0 < -60) {
            var1 = 1;
            L0: while (true) {
              if (pm.field_g.length > var1) {
                if (pm.field_g[var1] <= vj.field_s) {
                  var1++;
                  continue L0;
                } else {
                  return -1 + var1;
                }
              } else {
                return pm.field_g.length + -1;
              }
            }
          } else {
            fl.a((byte) 15);
            var1 = 1;
            L1: while (true) {
              if (pm.field_g.length > var1) {
                if (pm.field_g[var1] <= vj.field_s) {
                  var1++;
                  continue L1;
                } else {
                  return -1 + var1;
                }
              } else {
                return pm.field_g.length + -1;
              }
            }
          }
        }
    }

    final am a(boolean param0) {
        am var2 = null;
        var2 = ((fl) this).field_a;
        if (((fl) this).field_c.field_b != var2) {
          if (param0) {
            field_b = null;
            ((fl) this).field_a = var2.field_f;
            return var2;
          } else {
            ((fl) this).field_a = var2.field_f;
            return var2;
          }
        } else {
          ((fl) this).field_a = null;
          return null;
        }
    }

    final am a(int param0) {
        if (param0 != 0) {
            return null;
        }
        am var2 = ((fl) this).field_c.field_b.field_f;
        if (!(var2 != ((fl) this).field_c.field_b)) {
            ((fl) this).field_a = null;
            return null;
        }
        ((fl) this).field_a = var2.field_f;
        return var2;
    }

    final am a(int param0, am param1) {
        am var3 = null;
        if (param0 == -1) {
          L0: {
            if (param1 == null) {
              var3 = ((fl) this).field_c.field_b.field_f;
              break L0;
            } else {
              var3 = param1;
              break L0;
            }
          }
          if (((fl) this).field_c.field_b == var3) {
            ((fl) this).field_a = null;
            return null;
          } else {
            ((fl) this).field_a = var3.field_f;
            return var3;
          }
        } else {
          L1: {
            ((fl) this).field_a = null;
            if (param1 == null) {
              var3 = ((fl) this).field_c.field_b.field_f;
              break L1;
            } else {
              var3 = param1;
              break L1;
            }
          }
          if (((fl) this).field_c.field_b == var3) {
            ((fl) this).field_a = null;
            return null;
          } else {
            ((fl) this).field_a = var3.field_f;
            return var3;
          }
        }
    }

    final am c(int param0) {
        am var2 = null;
        var2 = ((fl) this).field_a;
        if (var2 != ((fl) this).field_c.field_b) {
          if (param0 != 0) {
            field_d = null;
            ((fl) this).field_a = var2.field_g;
            return var2;
          } else {
            ((fl) this).field_a = var2.field_g;
            return var2;
          }
        } else {
          ((fl) this).field_a = null;
          return null;
        }
    }

    fl(vl param0) {
        ((fl) this).field_c = param0;
    }

    final am b(int param0) {
        am var2 = null;
        var2 = ((fl) this).field_c.field_b.field_g;
        if (((fl) this).field_c.field_b == var2) {
          ((fl) this).field_a = null;
          return null;
        } else {
          if (param0 != 1) {
            return null;
          } else {
            ((fl) this).field_a = var2.field_g;
            return var2;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Error connecting to server. Please try using a different server.";
    }
}
