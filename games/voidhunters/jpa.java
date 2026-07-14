/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jpa extends rna implements ntb {
    private int field_b;
    static dja field_c;
    static boolean field_a;
    private int field_d;

    final ucb a(pe param0, int param1) {
        if (param1 == 26964) {
            return null;
        }
        int discarded$0 = ((jpa) this).a(-98, -31);
        return null;
    }

    final void a(pe param0, boolean param1, int param2, int param3) {
        Object var6 = null;
        if (-1 == (param2 ^ -1)) {
          ((jpa) this).field_b = param3;
          if (-1 < (((jpa) this).field_b ^ -1)) {
            ((jpa) this).field_b = 0;
            if (param1) {
              var6 = null;
              ((jpa) this).a((pe) null, false, 39, -42);
              return;
            } else {
              return;
            }
          } else {
            if (!param1) {
              return;
            } else {
              var6 = null;
              ((jpa) this).a((pe) null, false, 39, -42);
              return;
            }
          }
        } else {
          ((jpa) this).field_d = (param3 + 2) % 2;
          if (!param1) {
            return;
          } else {
            var6 = null;
            ((jpa) this).a((pe) null, false, 39, -42);
            return;
          }
        }
    }

    final void a(int param0, int[] param1, rsb param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        var7 = VoidHunters.field_G;
        if (param1 == null) {
          return;
        } else {
          if (param0 != 1) {
            var8 = null;
            boolean discarded$1 = ((jpa) this).a((byte) 94, (tv) null);
            var4 = 0;
            L0: while (true) {
              if (param1.length <= var4) {
                return;
              } else {
                var5 = 1;
                var6 = ((jpa) this).field_d;
                if (-1 == (var6 ^ -1)) {
                  var5 = 1;
                  param2.field_e.a((byte) -93, var5, ((jpa) this).field_b);
                  var4++;
                  continue L0;
                } else {
                  if (1 != var6) {
                    param2.field_e.a((byte) -93, var5, ((jpa) this).field_b);
                    var4++;
                    continue L0;
                  } else {
                    var5 = -1;
                    param2.field_e.a((byte) -93, var5, ((jpa) this).field_b);
                    var4++;
                    continue L0;
                  }
                }
              }
            }
          } else {
            var4 = 0;
            L1: while (true) {
              if (param1.length <= var4) {
                return;
              } else {
                var5 = 1;
                var6 = ((jpa) this).field_d;
                if (-1 == (var6 ^ -1)) {
                  var5 = 1;
                  param2.field_e.a((byte) -93, var5, ((jpa) this).field_b);
                  var4++;
                  continue L1;
                } else {
                  if (1 != var6) {
                    param2.field_e.a((byte) -93, var5, ((jpa) this).field_b);
                    var4++;
                    continue L1;
                  } else {
                    var5 = -1;
                    param2.field_e.a((byte) -93, var5, ((jpa) this).field_b);
                    var4++;
                    continue L1;
                  }
                }
              }
            }
          }
        }
    }

    public final void a(faa param0, boolean param1) {
        super.a(param0, param1);
        ((jpa) this).field_b = param0.i(0, 8);
        ((jpa) this).field_d = param0.i(0, 1);
    }

    public final void b(byte param0, tv param1) {
        jpa var5 = null;
        jpa var6 = null;
        var5 = (jpa) (Object) param1;
        var6 = var5;
        super.b((byte) 90, param1);
        if (param0 < 54) {
          return;
        } else {
          var6.field_d = var5.field_d;
          var6.field_b = var5.field_b;
          return;
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        if (!param0) {
            boolean discarded$0 = jpa.b(127);
        }
    }

    final String a(int param0) {
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        var4 = VoidHunters.field_G;
        if (param0 == -1325) {
          var8 = "Unknown mode";
          var3 = ((jpa) this).field_d;
          if (var3 != 0) {
            if ((var3 ^ -1) != -2) {
              return var8 + " custom variable " + ((jpa) this).field_b;
            } else {
              var10 = "Subtract 1 from";
              return var10 + " custom variable " + ((jpa) this).field_b;
            }
          } else {
            var9 = "Add 1 to";
            return var9 + " custom variable " + ((jpa) this).field_b;
          }
        } else {
          jpa.a(true);
          var5 = "Unknown mode";
          var3 = ((jpa) this).field_d;
          if (var3 != 0) {
            if ((var3 ^ -1) != -2) {
              return var5 + " custom variable " + ((jpa) this).field_b;
            } else {
              var7 = "Subtract 1 from";
              return var7 + " custom variable " + ((jpa) this).field_b;
            }
          } else {
            var6 = "Add 1 to";
            return var6 + " custom variable " + ((jpa) this).field_b;
          }
        }
    }

    public final void b(faa param0, int param1) {
        super.b(param0, -116);
        param0.a(-632, ((jpa) this).field_b, 8);
        if (param1 >= -109) {
          field_c = null;
          param0.a(-632, ((jpa) this).field_d, 1);
          return;
        } else {
          param0.a(-632, ((jpa) this).field_d, 1);
          return;
        }
    }

    final static boolean b(int param0) {
        long var1 = 0L;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        var6 = VoidHunters.field_G;
        var1 = wt.a(false);
        if (param0 == 7) {
          var3 = -pkb.field_o + var1;
          if (30000L >= var3) {
            var5 = 3000;
            if (nkb.field_q < 7) {
              if (nkb.field_q < 5) {
                if (3 <= nkb.field_q) {
                  var5 = 6000;
                  if (var3 > (long)var5) {
                    nkb.field_q = nkb.field_q + 1;
                    pkb.field_o = var1;
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  if (var3 > (long)var5) {
                    nkb.field_q = nkb.field_q + 1;
                    pkb.field_o = var1;
                    return true;
                  } else {
                    return false;
                  }
                }
              } else {
                var5 = 9000;
                if (var3 > (long)var5) {
                  nkb.field_q = nkb.field_q + 1;
                  pkb.field_o = var1;
                  return true;
                } else {
                  return false;
                }
              }
            } else {
              var5 = 12000;
              if (var3 > (long)var5) {
                nkb.field_q = nkb.field_q + 1;
                pkb.field_o = var1;
                return true;
              } else {
                return false;
              }
            }
          } else {
            pkb.field_o = var1;
            nkb.field_q = 0;
            return true;
          }
        } else {
          return true;
        }
    }

    public final void a(tv param0, int param1) {
        int var4 = 0;
        Object var5 = null;
        jpa var6 = null;
        super.a(param0, -67);
        var6 = (jpa) (Object) param0;
        var4 = 0;
        if (param1 <= -19) {
          L0: {
            if (((jpa) this).field_b == var6.field_b) {
              break L0;
            } else {
              System.out.println("int index has changed. before=" + var6.field_b + ", now=" + ((jpa) this).field_b);
              var4 = 1;
              break L0;
            }
          }
          L1: {
            if (var6.field_d == ((jpa) this).field_d) {
              break L1;
            } else {
              var4 = 1;
              System.out.println("int mode has changed. before=" + var6.field_d + ", now=" + ((jpa) this).field_d);
              break L1;
            }
          }
          if (var4 != 0) {
            System.out.println("This instance of MissionActionAddNodeInfo has changed");
            return;
          } else {
            return;
          }
        } else {
          L2: {
            var5 = null;
            ((jpa) this).a((faa) null, false);
            if (((jpa) this).field_b == var6.field_b) {
              break L2;
            } else {
              System.out.println("int index has changed. before=" + var6.field_b + ", now=" + ((jpa) this).field_b);
              var4 = 1;
              break L2;
            }
          }
          L3: {
            if (var6.field_d == ((jpa) this).field_d) {
              break L3;
            } else {
              var4 = 1;
              System.out.println("int mode has changed. before=" + var6.field_d + ", now=" + ((jpa) this).field_d);
              break L3;
            }
          }
          if (var4 == 0) {
            return;
          } else {
            System.out.println("This instance of MissionActionAddNodeInfo has changed");
            return;
          }
        }
    }

    public final boolean a(byte param0, tv param1) {
        jpa var3 = null;
        int var4 = 0;
        var3 = (jpa) (Object) param1;
        var4 = 67 % ((22 - param0) / 59);
        if (!super.a((byte) 92, param1)) {
          if (((jpa) this).field_b == var3.field_b) {
            if (var3.field_d != ((jpa) this).field_d) {
              return true;
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    jpa() {
    }

    final int a(int param0, int param1) {
        Object var4 = null;
        if (param1 < -100) {
          if (-1 == param0) {
            return ((jpa) this).field_b;
          } else {
            return ((jpa) this).field_d;
          }
        } else {
          var4 = null;
          ucb discarded$5 = ((jpa) this).a((pe) null, 85);
          if (-1 == param0) {
            return ((jpa) this).field_b;
          } else {
            return ((jpa) this).field_d;
          }
        }
    }

    jpa(int param0, int param1) {
        ((jpa) this).field_d = param1;
        ((jpa) this).field_b = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = (dja) (Object) new csb();
    }
}
