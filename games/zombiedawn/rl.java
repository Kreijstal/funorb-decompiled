/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl {
    private int[] field_c;
    private boolean field_d;
    static volatile boolean field_f;
    private int field_e;
    private int field_b;
    static String field_a;

    final static void c(int param0) {
        e.field_S.j(-636330975);
        if (param0 != 9) {
          return;
        } else {
          L0: {
            if (vi.field_c == null) {
              vi.field_c = new sa(e.field_S, ed.field_c);
              break L0;
            } else {
              break L0;
            }
          }
          e.field_S.a((ga) (Object) vi.field_c, true);
          return;
        }
    }

    final int a(int param0, byte param1) {
        if (param0 <= ((rl) this).field_b) {
          if (param1 >= -91) {
            ((rl) this).field_e = -60;
            return ((rl) this).field_c[param0];
          } else {
            return ((rl) this).field_c[param0];
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
    }

    private final void a(byte param0, int param1, int param2) {
        if (param1 <= ((rl) this).field_b) {
          L0: {
            if (((rl) this).field_c.length <= param1) {
              this.a(true, param1);
              break L0;
            } else {
              break L0;
            }
          }
          ((rl) this).field_c[param1] = param2;
          if (param0 != 93) {
            ((rl) this).field_e = -58;
            return;
          } else {
            return;
          }
        } else {
          L1: {
            ((rl) this).field_b = param1;
            if (((rl) this).field_c.length <= param1) {
              this.a(true, param1);
              break L1;
            } else {
              break L1;
            }
          }
          ((rl) this).field_c[param1] = param2;
          if (param0 == 93) {
            return;
          } else {
            ((rl) this).field_e = -58;
            return;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int[] param4, int param5, boolean param6, byte param7, int[] param8) {
        int var9 = 0;
        int var10 = 0;
        var10 = ZombieDawn.field_J;
        if ((param5 ^ -1) != -2) {
          if ((param5 ^ -1) != -15) {
            if (-4 != (param5 ^ -1)) {
              if (param5 != 4) {
                if (param5 != 5) {
                  if ((param5 ^ -1) != -7) {
                    if ((param5 ^ -1) != -11) {
                      if (9 != param5) {
                        if (13 != param5) {
                          if (param5 == 12) {
                            qk.field_Jb[param5] = (al) (Object) new kl(param5, param6, param0, param2, param1, param3, param8);
                            var9 = 124 / ((param7 - -57) / 38);
                            return;
                          } else {
                            qk.field_Jb[param5] = new al(param5, param6, param0, param2, param1, param3, param8);
                            var9 = 124 / ((param7 - -57) / 38);
                            return;
                          }
                        } else {
                          qk.field_Jb[param5] = (al) (Object) new ac(param5, param6, param0, param2, param1, param3, param8, param4);
                          var9 = 124 / ((param7 - -57) / 38);
                          return;
                        }
                      } else {
                        qk.field_Jb[param5] = (al) (Object) new pl(param5, param6, param0, param2, param1, param3, param8, param4);
                        var9 = 124 / ((param7 - -57) / 38);
                        return;
                      }
                    } else {
                      qk.field_Jb[param5] = (al) (Object) new ap(param5, param6, param0, param2, param1, param3, param8);
                      var9 = 124 / ((param7 - -57) / 38);
                      return;
                    }
                  } else {
                    qk.field_Jb[param5] = (al) (Object) new nl(param5, param6, param0, param2, param1, param3, param8);
                    var9 = 124 / ((param7 - -57) / 38);
                    return;
                  }
                } else {
                  qk.field_Jb[param5] = (al) (Object) new nl(param5, param6, param0, param2, param1, param3, param8);
                  var9 = 124 / ((param7 - -57) / 38);
                  return;
                }
              } else {
                qk.field_Jb[param5] = (al) (Object) new fg(param5, param6, param0, param2, param1, param3, param8);
                var9 = 124 / ((param7 - -57) / 38);
                return;
              }
            } else {
              qk.field_Jb[param5] = (al) (Object) new vj(param5, param6, param0, param2, param1, param3, param8);
              var9 = 124 / ((param7 - -57) / 38);
              return;
            }
          } else {
            qk.field_Jb[param5] = (al) (Object) new pg(param5, param6, param0, param2, param1, param3, param8);
            var9 = 124 / ((param7 - -57) / 38);
            return;
          }
        } else {
          qk.field_Jb[param5] = (al) (Object) new pg(param5, param6, param0, param2, param1, param3, param8);
          var9 = 124 / ((param7 - -57) / 38);
          return;
        }
    }

    final void b(int param0, int param1) {
        if (-1 >= (param0 ^ -1)) {
          if (((rl) this).field_b >= param0) {
            if (param0 == ((rl) this).field_b) {
              if (param1 != 1) {
                return;
              } else {
                ((rl) this).field_b = ((rl) this).field_b - 1;
                return;
              }
            } else {
              gp.a(((rl) this).field_c, param0 + 1, ((rl) this).field_c, param0, ((rl) this).field_b + -param0);
              if (param1 != 1) {
                return;
              } else {
                ((rl) this).field_b = ((rl) this).field_b - 1;
                return;
              }
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param0);
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
    }

    public static void b(int param0) {
        field_a = null;
        int var1 = 62 / ((param0 - 17) / 40);
    }

    private final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ZombieDawn.field_J;
        var4 = 121 % ((7 - param1) / 41);
        var3 = ((rl) this).field_c.length;
        L0: while (true) {
          if (param0 < var3) {
            return var3;
          } else {
            if (!((rl) this).field_d) {
              var3 = var3 + ((rl) this).field_e;
              continue L0;
            } else {
              if (0 == var3) {
                var3 = 1;
                continue L0;
              } else {
                var3 = var3 * ((rl) this).field_e;
                continue L0;
              }
            }
          }
        }
    }

    private final void a(boolean param0, int param1) {
        int[] var3 = null;
        int[] var4 = null;
        var4 = new int[this.a(param1, -103)];
        var3 = var4;
        gp.a(((rl) this).field_c, 0, var4, 0, ((rl) this).field_c.length);
        ((rl) this).field_c = var4;
        if (!param0) {
          int discarded$2 = ((rl) this).a(9, (byte) 60);
          return;
        } else {
          return;
        }
    }

    final int a(int param0) {
        if (param0 != 12) {
            ((rl) this).field_e = 102;
            return ((rl) this).field_b + 1;
        }
        return ((rl) this).field_b + 1;
    }

    final void b(int param0, byte param1) {
        if (param1 != -3) {
            return;
        }
        this.a((byte) 93, 1 + ((rl) this).field_b, param0);
    }

    private rl() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = false;
        field_a = "Error connecting to server. Please try using a different server.";
    }
}
