/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db extends sh {
    byte field_F;
    static int[][] field_x;
    static int field_y;
    int field_C;
    static sl field_D;
    static int field_B;
    uf field_A;
    static int field_z;
    static int[] field_E;

    final int f(int param0) {
        if (param0 != 100) {
            db.h(115);
        }
        if (!(this.field_A != null)) {
            return 0;
        }
        return this.field_A.field_q * 100 / (-this.field_F + this.field_A.field_m.length);
    }

    final static void j(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var1_int = vf.field_b[0];
            var2 = 1;
            L1: while (true) {
              if (vf.field_b.length <= var2) {
                L2: {
                  if (param0 == 2) {
                    break L2;
                  } else {
                    field_E = (int[]) null;
                    break L2;
                  }
                }
                break L0;
              } else {
                var3 = vf.field_b[var2];
                he.a(k.field_e, var2 << 1607896580, k.field_e, var1_int, var3);
                var1_int = var1_int + var3;
                var2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "db.A(" + param0 + ')');
        }
    }

    final static void i(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        eh var4_ref_eh = null;
        Object var5 = null;
        byte[] var5_array = null;
        int var6 = 0;
        byte[] var8 = null;
        eb var9 = null;
        pa var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var10 = id.field_b;
              var2 = var10.j(-99);
              if (var2 == 0) {
                var9 = (eb) ((Object) ga.field_w.c((byte) -71));
                if (var9 != null) {
                  L2: {
                    var4 = var10.j(-119);
                    if (0 == var4) {
                      var5_array = null;
                      break L2;
                    } else {
                      var12 = new byte[var4];
                      var11 = var12;
                      var8 = var11;
                      var5_array = var8;
                      var10.a(111, var12, var4, 0);
                      break L2;
                    }
                  }
                  var10.field_q = var10.field_q + 4;
                  if (!var10.e(0)) {
                    ob.b(-90);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var9.field_j = true;
                    var9.field_q = var5_array;
                    var9.a(true);
                    break L1;
                  }
                } else {
                  ob.b(-128);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                if ((var2 ^ -1) != -2) {
                  td.a("A1: " + ck.a(-13299), (Throwable) null, (byte) -85);
                  ob.b(-96);
                  break L1;
                } else {
                  var3 = var10.i(30);
                  var4_ref_eh = (eh) ((Object) nh.field_cb.c((byte) 105));
                  L3: while (true) {
                    L4: {
                      if (var4_ref_eh == null) {
                        break L4;
                      } else {
                        if (var4_ref_eh.field_j == var3) {
                          break L4;
                        } else {
                          var4_ref_eh = (eh) ((Object) nh.field_cb.c(-270));
                          continue L3;
                        }
                      }
                    }
                    if (var4_ref_eh != null) {
                      var4_ref_eh.a(true);
                      break L1;
                    } else {
                      ob.b(-114);
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
              }
            }
            var3 = -65 % ((param0 - -75) / 32);
            decompiledRegionSelector0 = 3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "db.F(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    public static void h(int param0) {
        field_x = (int[][]) null;
        int var1 = 106 % ((74 - param0) / 41);
        field_E = null;
        field_D = null;
    }

    final static void g(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var5 = 0;
        int var6 = 0;
        qe var7 = null;
        qe var8 = null;
        qe var9 = null;
        qe var10 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var2 = 68 / ((param0 - -12) / 39);
              var3 = 5;
              if (null == vk.field_i) {
                break L1;
              } else {
                if (eb.field_n) {
                  var7 = vk.field_i;
                  var9 = var7;
                  var1_int = qk.a(-1, var9.field_o, var9.field_H, -1, 123, wb.field_p.field_H, -1, wb.field_p.field_o);
                  var1_int = sh.field_r * var1_int / 256;
                  fh.field_h[1] = var1_int;
                  fj.field_p[1] = var7.field_y;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            fh.field_h[0] = 0;
            var5 = 0;
            L2: while (true) {
              if (var5 >= var3) {
                break L0;
              } else {
                L3: {
                  if (null == ie.field_e[var5]) {
                    break L3;
                  } else {
                    if (ie.field_e[var5].field_nb) {
                      var8 = ie.field_e[var5];
                      var10 = var8;
                      var1_int = qk.a(-1, var10.field_o, var10.field_H, -1, -3, wb.field_p.field_H, -1, wb.field_p.field_o);
                      var1_int = var1_int * sh.field_r / 256;
                      if (fh.field_h[0] > var1_int) {
                        break L3;
                      } else {
                        fh.field_h[0] = var1_int;
                        fj.field_p[0] = var8.field_y;
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "db.C(" + param0 + ')');
        }
    }

    final byte[] e(int param0) {
        L0: {
          if (this.field_v) {
            break L0;
          } else {
            if (-this.field_F + this.field_A.field_m.length > this.field_A.field_q) {
              break L0;
            } else {
              L1: {
                if (param0 == 2) {
                  break L1;
                } else {
                  field_z = 54;
                  break L1;
                }
              }
              return this.field_A.field_m;
            }
          }
        }
        throw new RuntimeException();
    }

    db() {
    }

    static {
        field_x = new int[][]{new int[]{4, 4, 4}, new int[]{6, 6, 6}, new int[]{2, 2, 2}, new int[]{2, 2, 2}, new int[]{1, 1, 1}, new int[]{2, 2, 2}, new int[]{2, 2, 2}, new int[]{1, 1, 1}, new int[]{2, 2, 2}, new int[]{2, 2, 2}, new int[]{2, 2, 2}, new int[]{3, 2, 3}, new int[]{2, 4, 2}, new int[]{2, 6, 4}, new int[]{6, 6, 6}, new int[]{2, 5, 3}, new int[]{0, 5, 0}, new int[]{6, 0, 6}, new int[]{2, 2, 2}, new int[]{1, 1, 1}};
        field_D = new sl();
        field_E = new int[]{-5, -5, -5};
        field_z = -1;
    }
}
