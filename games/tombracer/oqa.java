/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oqa extends osa {
    static ala field_s;
    private int field_u;
    static int field_w;
    static String field_t;
    static cn field_v;

    final int a(int param0, int param1) {
        if (param0 != 0) {
            this.c(-68);
            return param1;
        }
        return param1;
    }

    final int c(int param0) {
        if (param0 != 1) {
            return -63;
        }
        return 13;
    }

    final void b(byte param0) {
        int var2 = 6 % ((param0 - -69) / 42);
    }

    public static void g(int param0) {
        field_s = null;
        field_t = null;
        field_v = null;
        if (param0 == 11683) {
            return;
        }
        oqa.a(true, false, -42, false);
    }

    final void b(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = TombRacer.field_G ? 1 : 0;
        if (param0 == 1) {
          var2 = this.field_n.q((byte) -80) - this.e((byte) -43);
          L0: while (true) {
            if ((var2 ^ -1) <= -1) {
              L1: while (true) {
                if ((var2 ^ -1) >= -8193) {
                  L2: {
                    if (4096 >= var2) {
                      break L2;
                    } else {
                      var2 = var2 + -8192;
                      break L2;
                    }
                  }
                  var3 = 0;
                  var4 = this.field_u / 2;
                  if (var4 >= var2) {
                    if (-var4 <= var2) {
                      L3: {
                        if (-1 != (var3 ^ -1)) {
                          this.field_n.c(false, var3);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      return;
                    } else {
                      L4: {
                        var3 = -var2 + -var4;
                        if (-1 != (var3 ^ -1)) {
                          this.field_n.c(false, var3);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      return;
                    }
                  } else {
                    L5: {
                      var3 = -var2 + var4;
                      if (-1 != (var3 ^ -1)) {
                        this.field_n.c(false, var3);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    return;
                  }
                } else {
                  var2 -= 8192;
                  continue L1;
                }
              }
            } else {
              var2 += 8192;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final void a(kh param0, byte param1) {
        try {
            super.a(param0, (byte) -125);
            if (param1 > -78) {
                this.field_u = -70;
            }
            param0.a((byte) -3, cn.a((byte) -104, this.field_u, 8192, 8), 8);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "oqa.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static String a(boolean param0, boolean param1, int param2, boolean param3) {
        int var4;
        var4 = 0;
        if (!param0) {
          L0: {
            if (param1) {
              var4 += 2;
              break L0;
            } else {
              break L0;
            }
          }
          if (param2 == 21297) {
            if (param3) {
              var4++;
              return cua.field_b[var4];
            } else {
              return cua.field_b[var4];
            }
          } else {
            oqa.a(false, true, 65, true);
            if (param3) {
              var4++;
              return cua.field_b[var4];
            } else {
              return cua.field_b[var4];
            }
          }
        } else {
          L1: {
            var4 += 4;
            if (param1) {
              var4 += 2;
              break L1;
            } else {
              break L1;
            }
          }
          if (param2 != 21297) {
            oqa.a(false, true, 65, true);
            if (!param3) {
              return cua.field_b[var4];
            } else {
              var4++;
              return cua.field_b[var4];
            }
          } else {
            if (param3) {
              var4++;
              return cua.field_b[var4];
            } else {
              return cua.field_b[var4];
            }
          }
        }
    }

    oqa(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        this.field_u = 1024;
        try {
            this.field_u = oo.a(8, 8192, 0, param1.b((byte) 44, 8));
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "oqa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_s = new ala();
        field_t = "Show private chat from my friends and opponents";
    }
}
