/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa {
    private int field_d;
    static String field_b;
    private ai field_a;
    private bg field_f;
    static String[] field_e;
    private int field_c;

    final static boolean a(char param0, byte param1) {
        int var2 = 0;
        char[] var2_ref_char__ = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        char[] var7 = null;
        char[] var8 = null;
        char[] var9 = null;
        char[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        var5 = stellarshard.field_B;
        if (param0 <= 0) {
          L0: {
            if (param0 < 160) {
              break L0;
            } else {
              if (255 < param0) {
                break L0;
              } else {
                return true;
              }
            }
          }
          L1: {
            if (param0 == 0) {
              break L1;
            } else {
              var12 = wf.field_a;
              var9 = var12;
              var6 = var9;
              var2_ref_char__ = var6;
              var3 = 0;
              L2: while (true) {
                if (var12.length <= var3) {
                  break L1;
                } else {
                  var4 = var12[var3];
                  if (param0 == var4) {
                    return true;
                  } else {
                    var3++;
                    continue L2;
                  }
                }
              }
            }
          }
          var2 = -80 / ((77 - param1) / 45);
          return false;
        } else {
          if (param0 >= 128) {
            if (param0 >= 160) {
              if (255 >= param0) {
                return true;
              } else {
                L3: {
                  if (param0 == 0) {
                    break L3;
                  } else {
                    var11 = wf.field_a;
                    var8 = var11;
                    var6 = var8;
                    var2_ref_char__ = var6;
                    var3 = 0;
                    L4: while (true) {
                      if (var11.length <= var3) {
                        break L3;
                      } else {
                        var4 = var11[var3];
                        if (param0 == var4) {
                          return true;
                        } else {
                          var3++;
                          continue L4;
                        }
                      }
                    }
                  }
                }
                var2 = -80 / ((77 - param1) / 45);
                return false;
              }
            } else {
              if (param0 != 0) {
                var10 = wf.field_a;
                var7 = var10;
                var6 = var7;
                var2_ref_char__ = var6;
                var3 = 0;
                L5: while (true) {
                  if (var10.length > var3) {
                    var4 = var10[var3];
                    if (param0 == var4) {
                      return true;
                    } else {
                      var3++;
                      continue L5;
                    }
                  } else {
                    var2 = -80 / ((77 - param1) / 45);
                    return false;
                  }
                }
              } else {
                var2 = -80 / ((77 - param1) / 45);
                return false;
              }
            }
          } else {
            return true;
          }
        }
    }

    final static String a(int param0) {
        if (param0 != -1) {
            return null;
        }
        return ae.field_N.e((byte) 91);
    }

    public static void b(int param0) {
        field_e = null;
        field_b = null;
        if (param0 != 0) {
            boolean discarded$0 = wa.a('\n', (byte) 2);
        }
    }

    final void a(Object param0, long param1, int param2) {
        if (param2 != -22424) {
          field_b = null;
          this.a(-123, 1, param1, param0);
          return;
        } else {
          this.a(-123, 1, param1, param0);
          return;
        }
    }

    private final void a(int param0, int param1, long param2, Object param3) {
        ld var6 = null;
        int var7 = 0;
        gj var8 = null;
        gj var10 = null;
        var7 = stellarshard.field_B;
        if (param1 <= ((wa) this).field_c) {
          if (param0 < -113) {
            this.a(param2, (byte) 110);
            ((wa) this).field_d = ((wa) this).field_d - param1;
            L0: while (true) {
              if (0 <= ((wa) this).field_d) {
                var6 = new ld(param3, param1);
                ((wa) this).field_a.a((byte) 30, (gg) (Object) var6, param2);
                ((wa) this).field_f.a(true, (ah) (Object) var6);
                ((gj) (Object) var6).field_o = 0L;
                return;
              } else {
                var10 = (gj) (Object) ((wa) this).field_f.b((byte) 103);
                this.a(var10, (byte) 124);
                continue L0;
              }
            }
          } else {
            this.a(-81L, (byte) 23);
            this.a(param2, (byte) 110);
            ((wa) this).field_d = ((wa) this).field_d - param1;
            L1: while (true) {
              if (0 <= ((wa) this).field_d) {
                var6 = new ld(param3, param1);
                ((wa) this).field_a.a((byte) 30, (gg) (Object) var6, param2);
                ((wa) this).field_f.a(true, (ah) (Object) var6);
                ((gj) (Object) var6).field_o = 0L;
                return;
              } else {
                var8 = (gj) (Object) ((wa) this).field_f.b((byte) 103);
                this.a(var8, (byte) 124);
                continue L1;
              }
            }
          }
        } else {
          throw new IllegalStateException();
        }
    }

    final Object b(long param0, byte param1) {
        Object var5 = null;
        ld var6 = null;
        gj var7 = null;
        var7 = (gj) (Object) ((wa) this).field_a.a(param0, -1);
        if (var7 != null) {
          var5 = var7.e(-118);
          if (var5 == null) {
            var7.c(20);
            var7.c((byte) 36);
            ((wa) this).field_d = ((wa) this).field_d + var7.field_u;
            return null;
          } else {
            if (!var7.f(0)) {
              ((wa) this).field_f.a(true, (ah) (Object) var7);
              var7.field_o = 0L;
              if (param1 == 58) {
                return var5;
              } else {
                ((wa) this).field_a = null;
                return var5;
              }
            } else {
              var6 = new ld(var5, var7.field_u);
              ((wa) this).field_a.a((byte) 81, (gg) (Object) var6, var7.field_j);
              ((wa) this).field_f.a(true, (ah) (Object) var6);
              ((gj) (Object) var6).field_o = 0L;
              var7.c(20);
              var7.c((byte) 36);
              if (param1 == 58) {
                return var5;
              } else {
                ((wa) this).field_a = null;
                return var5;
              }
            }
          }
        } else {
          return null;
        }
    }

    private final void a(gj param0, byte param1) {
        if (param1 < 116) {
          return;
        } else {
          L0: {
            if (param0 == null) {
              break L0;
            } else {
              param0.c(20);
              param0.c((byte) 36);
              ((wa) this).field_d = ((wa) this).field_d + param0.field_u;
              break L0;
            }
          }
          return;
        }
    }

    private final void a(long param0, byte param1) {
        gj var4 = null;
        var4 = (gj) (Object) ((wa) this).field_a.a(param0, -1);
        if (param1 <= 106) {
          wa.b(-119);
          this.a(var4, (byte) 118);
          return;
        } else {
          this.a(var4, (byte) 118);
          return;
        }
    }

    private wa() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Email address is unavailable";
        field_e = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
    }
}
