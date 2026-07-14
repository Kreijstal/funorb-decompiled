/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gq {
    static boolean field_f;
    static int field_a;
    private lc field_b;
    static String field_d;
    private int field_g;
    private hs field_h;
    static int field_e;
    private int field_c;

    final static String a(int param0, CharSequence[] param1, int param2, int param3) {
        CharSequence var4_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        StringBuilder var11 = null;
        CharSequence var12 = null;
        StringBuilder var13 = null;
        CharSequence var14 = null;
        var9 = AceOfSkies.field_G ? 1 : 0;
        if (0 != param0) {
          if (-2 == (param0 ^ -1)) {
            var10 = param1[param3];
            var4_ref = var10;
            if (var4_ref == null) {
              return "null";
            } else {
              return ((Object) (Object) var10).toString();
            }
          } else {
            var4 = param3 + param0;
            var5 = 0;
            var6_int = param3;
            L0: while (true) {
              if (var4 <= var6_int) {
                if (param2 == 21530) {
                  L1: {
                    var11 = new StringBuilder(var5);
                    var7 = param3;
                    if (var4 <= var7) {
                      break L1;
                    } else {
                      L2: {
                        var12 = param1[var7];
                        var8 = var12;
                        if (var8 == null) {
                          StringBuilder discarded$4 = var11.append("null");
                          var7++;
                          break L2;
                        } else {
                          StringBuilder discarded$5 = var11.append(var12);
                          var7++;
                          break L2;
                        }
                      }
                      var7++;
                      var7++;
                      var7++;
                      break L1;
                    }
                  }
                  return var11.toString();
                } else {
                  gq.a(true, 117, 74);
                  L3: {
                    var13 = new StringBuilder(var5);
                    var6 = var13;
                    var7 = param3;
                    if (var4 <= var7) {
                      break L3;
                    } else {
                      L4: {
                        var14 = param1[var7];
                        var8 = var14;
                        if (var8 == null) {
                          StringBuilder discarded$6 = var13.append("null");
                          var7++;
                          break L4;
                        } else {
                          StringBuilder discarded$7 = var13.append(var14);
                          var7++;
                          break L4;
                        }
                      }
                      var7++;
                      var7++;
                      var7++;
                      break L3;
                    }
                  }
                  return var13.toString();
                }
              } else {
                var7_ref = param1[var6_int];
                if (var7_ref == null) {
                  var5 += 4;
                  var6_int++;
                  var6_int++;
                  continue L0;
                } else {
                  var5 = var5 + ((CharSequence) var7_ref).length();
                  var6_int++;
                  var6_int++;
                  var6_int++;
                  continue L0;
                }
              }
            }
          }
        } else {
          return "";
        }
    }

    final void a(byte param0, int param1) {
        he var3 = null;
        mb var4 = null;
        int var5 = 0;
        var5 = AceOfSkies.field_G ? 1 : 0;
        var3 = (he) ((gq) this).field_h.a(-115);
        L0: while (true) {
          if (var3 == null) {
            if (param0 > -33) {
              field_a = 98;
              return;
            } else {
              return;
            }
          } else {
            L1: {
              if (!var3.e(0)) {
                ((he) var3).field_i = ((he) var3).field_i + 1L;
                if ((((he) var3).field_i + 1L ^ -1L) < ((long)param1 ^ -1L)) {
                  var4 = new mb(var3.a((byte) 74), ((he) var3).field_p);
                  ((gq) this).field_b.a(-1, (wf) (Object) var4, ((he) var3).field_b);
                  ns.a((wt) (Object) var4, -30575, (wt) (Object) var3);
                  var3.c(-125);
                  var3.d(-115);
                  break L1;
                } else {
                  break L1;
                }
              } else {
                if (var3.a((byte) 74) != null) {
                  break L1;
                } else {
                  var3.c(-128);
                  var3.d(-126);
                  ((gq) this).field_g = ((gq) this).field_g + ((he) var3).field_p;
                  break L1;
                }
              }
            }
            var3 = (he) ((gq) this).field_h.a(true);
            continue L0;
          }
        }
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        var9 = AceOfSkies.field_G ? 1 : 0;
        if (param0 <= 95) {
          gq.a(-5);
          if (param7 > param3) {
            if (param7 >= param5) {
              if (param3 >= param5) {
                tm.a(param2, param7, param4, 14250, param1, vp.field_j, param5, param3, param6);
                return;
              } else {
                tm.a(param1, param7, param4, 14250, param2, vp.field_j, param3, param5, param6);
                return;
              }
            } else {
              tm.a(param4, param5, param1, 14250, param2, vp.field_j, param3, param7, param6);
              return;
            }
          } else {
            if (param3 >= param5) {
              if (param7 >= param5) {
                tm.a(param4, param3, param2, 14250, param1, vp.field_j, param5, param7, param6);
                return;
              } else {
                tm.a(param1, param3, param2, 14250, param4, vp.field_j, param7, param5, param6);
                return;
              }
            } else {
              tm.a(param2, param5, param1, 14250, param4, vp.field_j, param7, param3, param6);
              return;
            }
          }
        } else {
          if (param7 > param3) {
            if (param7 >= param5) {
              if (param3 >= param5) {
                tm.a(param2, param7, param4, 14250, param1, vp.field_j, param5, param3, param6);
                return;
              } else {
                tm.a(param1, param7, param4, 14250, param2, vp.field_j, param3, param5, param6);
                return;
              }
            } else {
              tm.a(param4, param5, param1, 14250, param2, vp.field_j, param3, param7, param6);
              return;
            }
          } else {
            if (param3 >= param5) {
              if (param7 >= param5) {
                tm.a(param4, param3, param2, 14250, param1, vp.field_j, param5, param7, param6);
                return;
              } else {
                tm.a(param1, param3, param2, 14250, param4, vp.field_j, param7, param5, param6);
                return;
              }
            } else {
              tm.a(param2, param5, param1, 14250, param4, vp.field_j, param7, param3, param6);
              return;
            }
          }
        }
    }

    private final void a(int param0, he param1) {
        if (param0 == 6646) {
          if (param1 != null) {
            param1.c(-123);
            param1.d(-117);
            ((gq) this).field_g = ((gq) this).field_g + ((he) param1).field_p;
            return;
          } else {
            return;
          }
        } else {
          Object discarded$7 = ((gq) this).a(125L, 122);
          if (param1 == null) {
            return;
          } else {
            param1.c(-123);
            param1.d(-117);
            ((gq) this).field_g = ((gq) this).field_g + ((he) param1).field_p;
            return;
          }
        }
    }

    final Object a(long param0, int param1) {
        Object var5 = null;
        qj var6 = null;
        he var7 = null;
        var7 = (he) ((gq) this).field_b.a(param0, (byte) 106);
        if (var7 != null) {
          var5 = var7.a((byte) 74);
          if (param1 < -90) {
            if (var5 != null) {
              if (var7.e(0)) {
                var6 = new qj(var5, ((he) var7).field_p);
                ((gq) this).field_b.a(-1, (wf) (Object) var6, ((he) var7).field_b);
                ((gq) this).field_h.a((wt) (Object) var6, (byte) -74);
                ((he) (Object) var6).field_i = 0L;
                var7.c(-128);
                var7.d(-119);
                return var5;
              } else {
                ((gq) this).field_h.a((wt) (Object) var7, (byte) 85);
                var7.field_i = 0L;
                return var5;
              }
            } else {
              var7.c(-124);
              var7.d(-114);
              ((gq) this).field_g = ((gq) this).field_g + ((he) var7).field_p;
              return null;
            }
          } else {
            ((gq) this).field_g = 32;
            if (var5 != null) {
              if (var7.e(0)) {
                var6 = new qj(var5, ((he) var7).field_p);
                ((gq) this).field_b.a(-1, (wf) (Object) var6, ((he) var7).field_b);
                ((gq) this).field_h.a((wt) (Object) var6, (byte) -74);
                ((he) (Object) var6).field_i = 0L;
                var7.c(-128);
                var7.d(-119);
                return var5;
              } else {
                ((gq) this).field_h.a((wt) (Object) var7, (byte) 85);
                var7.field_i = 0L;
                return var5;
              }
            } else {
              var7.c(-124);
              var7.d(-114);
              ((gq) this).field_g = ((gq) this).field_g + ((he) var7).field_p;
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final static void a(boolean param0, int param1, int param2) {
        if (!param0) {
            gq.a(false, 19, 116);
            ik.field_k = param1;
            rs.field_v = param2;
            return;
        }
        ik.field_k = param1;
        rs.field_v = param2;
    }

    gq(int param0) {
        this(param0, param0);
    }

    final static int a(hd param0, int param1) {
        if (param0 != wo.field_n) {
          if (param0 != lc.field_g) {
            if (ro.field_o != param0) {
              if (wf.field_d != param0) {
                if (param0 != hh.field_c) {
                  if (aj.field_r == param0) {
                    return 6145;
                  } else {
                    if (param1 != -29824) {
                      field_f = true;
                      throw new IllegalStateException();
                    } else {
                      throw new IllegalStateException();
                    }
                  }
                } else {
                  return 6410;
                }
              } else {
                return 6409;
              }
            } else {
              return 6406;
            }
          } else {
            return 6408;
          }
        } else {
          return 6407;
        }
    }

    final Object b(int param0) {
        he var2 = null;
        Object var3 = null;
        he var4 = null;
        int var5 = 0;
        var5 = AceOfSkies.field_G ? 1 : 0;
        var2 = (he) ((gq) this).field_b.a(param0 + -6533);
        L0: while (true) {
          if (var2 == null) {
            if (param0 == 6408) {
              return null;
            } else {
              field_a = 59;
              return null;
            }
          } else {
            var3 = var2.a((byte) 74);
            if (var3 == null) {
              var4 = var2;
              var2 = (he) ((gq) this).field_b.a(-64);
              var4.c(-125);
              var4.d(-127);
              ((gq) this).field_g = ((gq) this).field_g + ((he) var4).field_p;
              continue L0;
            } else {
              return var3;
            }
          }
        }
    }

    final void a(long param0, Object param1, int param2) {
        Object var6 = null;
        if (param2 > -30) {
          var6 = (Object) null;
          this.a(-60L, (byte) -4, -64, (Object) null);
          this.a(param0, (byte) 71, 1, param1);
          return;
        } else {
          this.a(param0, (byte) 71, 1, param1);
          return;
        }
    }

    final Object a(byte param0) {
        he var2 = null;
        Object var3 = null;
        he var4 = null;
        int var5 = 0;
        var5 = AceOfSkies.field_G ? 1 : 0;
        var2 = (he) ((gq) this).field_b.b(param0 ^ -16);
        L0: while (true) {
          if (var2 == null) {
            if (param0 == -16) {
              return null;
            } else {
              return (Object) null;
            }
          } else {
            var3 = var2.a((byte) 74);
            if (var3 == null) {
              var4 = var2;
              var2 = (he) ((gq) this).field_b.a(-118);
              var4.c(-126);
              var4.d(-116);
              ((gq) this).field_g = ((gq) this).field_g + ((he) var4).field_p;
              continue L0;
            } else {
              return var3;
            }
          }
        }
    }

    private final void a(int param0, long param1) {
        he var4 = (he) ((gq) this).field_b.a(param1, (byte) 91);
        this.a(6646, var4);
        if (param0 > -108) {
            gq.a(-85);
            return;
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != 6408) {
            gq.a((byte) 93, -113, 71, 39, 20, -85, -2, -11);
        }
    }

    private final void a(long param0, byte param1, int param2, Object param3) {
        he var9 = null;
        int var8 = AceOfSkies.field_G ? 1 : 0;
        if (!(param2 <= ((gq) this).field_c)) {
            throw new IllegalStateException();
        }
        this.a(-111, param0);
        ((gq) this).field_g = ((gq) this).field_g - param2;
        while (-1 < (((gq) this).field_g ^ -1)) {
            var9 = (he) ((gq) this).field_h.b(false);
            this.a(6646, var9);
        }
        qj var6 = new qj(param3, param2);
        int var7 = -16 / ((-52 - param1) / 34);
        ((gq) this).field_b.a(-1, (wf) (Object) var6, param0);
        ((gq) this).field_h.a((wt) (Object) var6, (byte) 64);
        ((he) (Object) var6).field_i = 0L;
    }

    private gq(int param0, int param1) {
        int var3 = 0;
        ((gq) this).field_h = new hs();
        ((gq) this).field_g = param0;
        ((gq) this).field_c = param0;
        var3 = 1;
        L0: while (true) {
          if (param0 > var3 + var3) {
            if (param1 > var3) {
              var3 = var3 + var3;
              continue L0;
            } else {
              ((gq) this).field_b = new lc(var3);
            }
          } else {
            ((gq) this).field_b = new lc(var3);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_e = 0;
    }
}
