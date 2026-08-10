/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd {
    static int field_h;
    int[] field_f;
    int field_g;
    static int field_k;
    static int field_l;
    static dj field_c;
    static qb field_b;
    static String field_j;
    static vn field_d;
    static int field_i;
    int field_e;
    static String field_a;

    final int a(int param0, int param1) {
        int var3;
        int var4;
        L0: {
          var4 = ArcanistsMulti.field_G ? 1 : 0;
          if (this.field_f == null) {
            break L0;
          } else {
            if (-1 == (this.field_f.length ^ -1)) {
              break L0;
            } else {
              var3 = 1;
              L1: while (true) {
                if (var3 >= this.field_f.length) {
                  L2: {
                    if (param1 > 15) {
                      break L2;
                    } else {
                      field_i = -71;
                      break L2;
                    }
                  }
                  return -1 + this.field_f.length;
                } else {
                  if ((param0 ^ -1) <= (this.field_f[var3] + this.field_f[var3 + -1] >> -959517631 ^ -1)) {
                    var3++;
                    continue L1;
                  } else {
                    return -1 + var3;
                  }
                }
              }
            }
          }
        }
        return 0;
    }

    final static void a(int param0, int param1, int param2, boolean param3) {
        if (param1 < 120) {
            java.math.BigInteger var5 = (java.math.BigInteger) null;
            vd.a(true, (wk) null, (java.math.BigInteger) null, (wk) null, (java.math.BigInteger) null);
        }
        qn.a(ra.field_h, -115, ga.field_r, param2, param3, param0, dh.field_Gb);
    }

    final static void a(boolean param0, wk param1, java.math.BigInteger param2, wk param3, java.math.BigInteger param4) {
        try {
            we.a(param4, 0, param3.field_j, param1, 0, param2, param3.field_g);
            if (param0) {
                vd.a(-96, -100, -118, true);
            }
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "vd.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(jg param0, byte param1) {
        int dupTemp$0 = 0;
        int fieldTemp$1 = 0;
        int incrementValue$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            if (param1 == -74) {
              L1: while (true) {
                if (3 <= var2_int) {
                  var2_int = 0;
                  L2: while (true) {
                    if (var2_int >= gb.field_f) {
                      dupTemp$0 = param0.b(-21);
                      bm.field_d[dupTemp$0] = bm.field_d[dupTemp$0] + 1;
                      var2_int = 0;
                      var3 = 0;
                      L3: while (true) {
                        if (var3 >= gb.field_f) {
                          gb.field_f = var2_int;
                          fieldTemp$1 = gb.field_f;
                          gb.field_f = gb.field_f + 1;
                          g.field_d[fieldTemp$1] = param0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          L4: {
                            L5: {
                              if (param0.field_m != g.field_d[var3].field_m) {
                                break L5;
                              } else {
                                var4 = g.field_d[var3].b(-109);
                                if (bm.field_d[var4] > hj.field_b) {
                                  bm.field_d[var4] = bm.field_d[var4] - 1;
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            incrementValue$2 = var2_int;
                            var2_int++;
                            g.field_d[incrementValue$2] = g.field_d[var3];
                            break L4;
                          }
                          var3++;
                          continue L3;
                        }
                      }
                    } else {
                      L6: {
                        if (g.field_d[var2_int].field_m != param0.field_m) {
                          break L6;
                        } else {
                          dupTemp$3 = g.field_d[var2_int].b(-62);
                          bm.field_d[dupTemp$3] = bm.field_d[dupTemp$3] + 1;
                          break L6;
                        }
                      }
                      var2_int++;
                      continue L2;
                    }
                  }
                } else {
                  bm.field_d[var2_int] = 0;
                  var2_int++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var2);

            stackIn_22_1 = new StringBuilder().append("vd.A(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_j = null;
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0 != 0) {
            jg var2 = (jg) null;
            vd.a((jg) null, (byte) -101);
        }
        field_d = null;
    }

    vd(int param0, int param1, int param2) {
        this.field_f = new int[1 + param2];
        this.field_e = param1;
        this.field_g = param0;
    }

    final int b(int param0) {
        int stackIn_7_0 = 0;
        L0: {
          if (param0 <= -107) {
            break L0;
          } else {
            vd.a(-125);
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_f == null) {
              break L2;
            } else {
              if (0 != this.field_f.length) {
                stackIn_7_0 = this.field_f[this.field_f.length + -1];
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackIn_7_0 = 0;
          break L1;
        }
        return stackIn_7_0;
    }

    static {
        field_h = -1;
        field_k = 480;
        field_j = "Well done! You have completed your training and are now ready for online play. The sandbox is open to you to test out your spells. Any spell your Arcanist has been equipped with on the 'Spell Selection' screen will be available for you to try out here. Have fun!";
        field_a = "Suggest muting this player";
    }
}
